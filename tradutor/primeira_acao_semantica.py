import random

dicionarioVariaveis = {}

def existeVariavel(nomeVariavel):
	return nomeVariavel in dicionarioVariaveis

def addVariavel(nomeVariavel, tipoVariavel):
	dicionarioVariaveis[nomeVariavel] = {'tipo': tipoVariavel, 'valor': random.randint(-256, 255)}

codigo = []
var_temp = 1
