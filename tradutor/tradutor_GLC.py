import re
import sys

def loadGLC():
	fp = open('estruturas')

	GLC = []
	nomesRegras = []
	for line in fp:
		line = line[:-1]
		if line == '':
			continue
		nomeRegra, producoes = line.split('::=')
		for producao in producoes.split('|'):
			regrasNaProducao = re.findall(r'(<.+?>)', producao)
			for regra in regrasNaProducao:
				producao = producao.replace(regra, regra[1:-1].upper())
			if producao == 'ε':
				producao = '\'\''
			GLC.append([nomeRegra[1:-1].upper(), producao])

	fp.close()

	return GLC

if __name__ == "__main__":
	GLC = loadGLC()

	sys.stdout = open('estruturas_traduzidas', 'w')
	for regra in GLC:
		print(regra[0], '->', regra[1])
