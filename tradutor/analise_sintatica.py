import sys
import analise_lexica
import tradutor_GLC
from collections import deque

def loadSLRTable():
	fp = open('SLR_Table.csv')
	slrTable = []
	for i, line in enumerate(fp):
		if i == 0:
			header = line[:-1].split('§')[1:]
			continue

		values = line[:-1].split('§')[1:]
		slrTable.append(dict(zip(header, values)))

	fp.close()
	return slrTable

def fixSymbolTable(symbolTable):
	tokenPos = 0
	while tokenPos < len(symbolTable):
		if symbolTable[tokenPos][0] == '}':
			tokenPos += 1
			tokenPosN = tokenPos
			while symbolTable[tokenPos][0] == '\\n':
				tokenPos += 1
			if symbolTable[tokenPos][0] in ['senao_se', 'senao']:
				while symbolTable[tokenPosN][0] == '\\n':
					symbolTable.pop(tokenPosN)
				tokenPos = tokenPosN
			tokenPos -= 1
		tokenPos += 1
	return symbolTable

def loadSemanticActions(GLC):
	fp = open('acoes_semanticas')
	semanticActions = ['' for i in range(len(GLC))]
	for i, line in enumerate(fp):
		if line == '\n':
			continue
		if line[0] == '@':
			rule = line[1:-1].split(' -> ')
			productionNumber = GLC.index(rule)
		else:
			semanticActions[productionNumber] += line

	fp.close()
	return semanticActions

def topStack(indice):
	return stack[-2 * indice]

filename = sys.argv[1]

symbolTable, afd = analise_lexica.getSymbolTableAndAFD(filename)
analise_lexica.saveSymbolTable(symbolTable, afd)

slrTable = loadSLRTable()
GLC = tradutor_GLC.loadGLC()

symbolTable = fixSymbolTable(symbolTable)

analise_lexica.verifyErrors(symbolTable, afd, filename)

semanticActions = loadSemanticActions(GLC)
exec(open('primeira_acao_semantica.py').read())

executar_acoes_semanticas = filename[-5:] == 'gc.p2'

tape = deque(symbolTable)
stack = [0]
while slrTable[stack[-1]][tape[0][0]] not in ['acc', ' ']:
	top = slrTable[stack[-1]][tape[0][0]]
	if top[0] == 's':
		newState = int(top[1:])
		stack.append(tape.popleft())
		stack.append(newState)
	elif top[0] == 'r':
		productionNumber = int(top[1:])
		regra = GLC[productionNumber][0]
		if executar_acoes_semanticas:
			exec(semanticActions[productionNumber])
		if GLC[productionNumber][1] == '\'\'':
			productionLength = 0
		else:
			productionLength = len(GLC[productionNumber][1].split(' '))
		for i in range(2 * productionLength):
			stack.pop()
		stack.append(regra)
		if type(stack[-1]) == type({}):
			stack.append(int(slrTable[stack[-2]][stack[-1]['nome']]))
		else:
			stack.append(int(slrTable[stack[-2]][stack[-1]]))

if slrTable[stack[-1]][tape[0][0]] == 'acc':
	if executar_acoes_semanticas:
		print('Código intermediário:')
		for instrucao in codigo:
			print(instrucao)
		print()
		print('Valor final das variáveis (execução do código):')
		for variavel in dicionarioVariaveis:
			print(variavel, dicionarioVariaveis[variavel]['tipo'], dicionarioVariaveis[variavel]['valor'])
		print()
	print('Sintaxe correta')
else:
	print('Erro de sintaxe na linha %d, próximo a \'%s\'' % (tape[0][2], tape[0][1]))
