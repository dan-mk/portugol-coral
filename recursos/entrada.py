from collections import deque

__buffer_entrada = deque([])

def __alimentar_buffer_entrada():
	while len(''.join(__buffer_entrada).replace('\n', '')) == 0:
		try:
		    entrada = list(input())
		except EOFError:
		    return False
		for c in entrada:
			__buffer_entrada.append(c)
		__buffer_entrada.append('\n')
	return True

def __leia_int():
	nada = [' ', '\n', '\t']
	numeros = ['0', '1', '2', '3', '4', '5', '6', '7', '8', '9']

	__alimentar_buffer_entrada()
	while __buffer_entrada[0] in nada:
		__buffer_entrada.popleft()
		__alimentar_buffer_entrada()

	leitura = ''
	while len(__buffer_entrada) != 0 and __buffer_entrada[0] in numeros:
		leitura += __buffer_entrada[0]
		__buffer_entrada.popleft()

	return int(leitura)

def __leia_real():
	nada = [' ', '\n', '\t']
	numeros = ['0', '1', '2', '3', '4', '5', '6', '7', '8', '9']

	__alimentar_buffer_entrada()
	while __buffer_entrada[0] in nada:
		__buffer_entrada.popleft()
		__alimentar_buffer_entrada()

	leitura = ''
	while len(__buffer_entrada) != 0 and __buffer_entrada[0] in numeros:
		leitura += __buffer_entrada[0]
		__buffer_entrada.popleft()

	if len(__buffer_entrada) != 0 and __buffer_entrada[0] == '.':
		leitura += __buffer_entrada[0]
		__buffer_entrada.popleft()

	while len(__buffer_entrada) != 0 and __buffer_entrada[0] in numeros:
		leitura += __buffer_entrada[0]
		__buffer_entrada.popleft()

	return real(leitura)

def __leia_caractere():
	while len(__buffer_entrada) == 0:
		__alimentar_buffer_entrada()

	return __buffer_entrada.popleft()

def __leia_palavra():
	nada = [' ', '\n', '\t']

	__alimentar_buffer_entrada()
	while __buffer_entrada[0] in nada:
		__buffer_entrada.popleft()
		__alimentar_buffer_entrada()

	leitura = ''
	while len(__buffer_entrada) != 0 and __buffer_entrada[0] not in nada:
		leitura += __buffer_entrada[0]
		__buffer_entrada.popleft()

	return leitura

def __leia_linha():
	__alimentar_buffer_entrada()

	leitura = ''
	while len(__buffer_entrada) != 0 and __buffer_entrada[0] != '\n':
		leitura += __buffer_entrada[0]
		__buffer_entrada.popleft()
	leitura += __buffer_entrada[0]
	__buffer_entrada.popleft()

	return leitura

def leia(padrao):
	retorno = []

	tipos_variavel = [p.strip() for p in padrao.split(',')]
	for tipo_variavel in tipos_variavel:
		quantidade = 1
		if ':' in tipo_variavel:
			quantidade, tipo_variavel = [p.strip() for p in tipo_variavel.split(':')]
			quantidade = int(quantidade)
		salvar = True
		if '*' in tipo_variavel:
			salvar = False
			tipo_variavel = tipo_variavel.replace('*', '').strip()
		for i in range(quantidade):
			if tipo_variavel == 'int':
				retorno.append(__leia_int())
			elif tipo_variavel == 'real':
				retorno.append(__leia_real())
			elif tipo_variavel == 'caractere':
				retorno.append(__leia_caractere())
			elif tipo_variavel == 'palavra':
				retorno.append(__leia_palavra())
			elif tipo_variavel == 'linha':
				retorno.append(__leia_linha())
			if not salvar:
				retorno.pop()

	if len(retorno) == 1:
		return retorno[0]
	return retorno

def EOF():
	return not __alimentar_buffer_entrada()
