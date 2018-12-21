import sys

def loadAFD():
	fp = open('afd.csv')
	afd = {}
	for i, line in enumerate(fp):
		if i == 0:
			header = line[:-1].split('§')[:-1]
			continue

		state = line[:-1].split('§')
		final = False
		if '£' in state[0]:
			final = state[0].split('£')[1]
			stateNumber = int(state[0].split('£')[2].strip())
		else:
			stateNumber = int(state[0])
		afd[stateNumber] = {'final': final, 'transitions': {}}
		for j, caracter in enumerate(header[1:]):
			afd[stateNumber]['transitions'][caracter] = int(state[j + 1])

	fp.close()
	return afd

def loadSourceFile(fileName):
	fp = open(fileName)
	code = []
	lineReference = []
	columnReference = []
	for i, line in enumerate(fp):
		code += list(line)
		lineReference += [i + 1 for j in range(len(line))]
		columnReference += range(1, len(line) + 1)

	fp.close()

	code += ['\n']
	lineReference += [lineReference[-1] + 1]
	columnReference += [1]

	return code, lineReference, columnReference

def addTokenToSymbolTable(symbolTable, token):
	if token[0] in ['espaco', 'comentario']:
		return
	symbolTable.append(token)

def calcSymbolTable(afd, code, lineReference, columnReference):
	lastState = -1
	state = 0
	errorState = len(afd) - 1

	symbolTable = []

	position = 0
	tokenValue = ''
	while position < len(code):
		if state == errorState and len(tokenValue) > 1:
			pos = position - 1
			column = columnReference[pos] - len(tokenValue) + 1
			token = [afd[lastState]['final'], tokenValue[:-1], lineReference[pos], column]
			addTokenToSymbolTable(symbolTable, token)
			state = 0
			lastState = -1
			position -= 1
			tokenValue = ''

		caracter = code[position]
		tokenValue += caracter
		if caracter == '\n':
			caracter = 'ŋ'
		elif caracter == '\t':
			caracter = 'τ'

		lastState = state
		if caracter in afd[state]['transitions']:
			state = afd[state]['transitions'][caracter]
		else:
			state = errorState

		position += 1

	pos = position - 1
	column = columnReference[pos] - len(tokenValue) + 1
	token = [afd[lastState]['final'], tokenValue[:-1], lineReference[pos], column]
	addTokenToSymbolTable(symbolTable, token)
	addTokenToSymbolTable(symbolTable, ['$', '$', lineReference[pos], columnReference[pos] - 1])

	return symbolTable

def symbolTableFalse2Error(symbolTable):
	for i, token in enumerate(symbolTable):
		if token[0] == False:
			symbolTable[i][0] = 'erro'
	return symbolTable

def getSymbolTableAndAFD(fileName):
	code, lineReference, columnReference = loadSourceFile(fileName)
	afd = loadAFD()
	symbolTable = calcSymbolTable(afd, code, lineReference, columnReference)
	symbolTable = symbolTableFalse2Error(symbolTable)
	return symbolTable, afd

def printToken(stateName, tokenValue, line, column, afd):
	if tokenValue == '\n':
		tokenValue = 'ŋ'
	print(stateName, tokenValue, line, column, sep='§')

def saveSymbolTable(symbolTable, afd):
	sys.stdout = open('symbolTable', "w")
	for token in symbolTable:
		tokenId, tokenValue, tokenLine, tokenColumn = token
		printToken(tokenId, tokenValue, tokenLine, tokenColumn, afd)
	sys.stdout = sys.__stdout__

def verifyErrors(symbolTable, afd, filename):
	errorExists = False
	code, lineReference, columnReference = loadSourceFile(filename)
	for token in symbolTable:
		tokenId, tokenValue, tokenLine, tokenColumn = token
		if tokenId == 'erro':
			if errorExists == True:
				print()
			errorExists = True
			print('Erro léxico na linha %d:' % tokenLine)
			for i, line in enumerate(lineReference):
				if line == tokenLine:
					print(code[i] if code[i] != '\t' else ' ', end='')
			print((tokenColumn - 2) * ' ', '^ -- ', end='')
			if len(tokenValue) == 1 and tokenValue not in afd[0]['transitions']:
				print('este caractere não pode ser utilizado', end='')
			else:
				print('token não identificado', end='')
			print()
	if errorExists:
		exit()


if __name__ == "__main__":
	filename = sys.argv[1]

	symbolTable, afd = getSymbolTableAndAFD(filename)

	for token in symbolTable:
		print(token[0], end=' ')
	print()
