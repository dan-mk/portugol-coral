from auxiliary import *

def tokensAndGrammarsFromFile(fileInput):
	tokens = []
	grammars = []

	newGrammar = True
	fp = open(fileInput)
	for line in fp:
		if line[-2] == ':' and len(line) > 2:
			newGrammar = True
			grammarName = line[:-2]
		elif '::=' not in line:
			tokens.append(line[:-1])
			newGrammar = True
		else:
			if newGrammar == True:
				grammars.append({'name': grammarName, 'rules': []})
				newGrammar = False
			grammars[-1]['rules'].append(line[:-1])
	fp.close()

	return tokens, grammars

def tokenDFA(token):
	DFA = {}
	for state, char in enumerate(token):
		DFA[state] = {'final': False, 'transitions': {}}
		DFA[state]['transitions'][char] = set([state + 1])
	DFA[state + 1] = {'final': token, 'transitions': {}}

	return normalizeNFA(DFA)

def grammarNFA(grammar):
	states = {}
	for state, rule in enumerate(grammar['rules']):
		stateName = rule.split('::=')[0].strip()
		states[stateName] = state

	NFA = {}
	newFinalState = len(grammar['rules'])
	for state, rule in enumerate(grammar['rules']):
		NFA[state] = {'final': False, 'transitions': {}}
		transitionsString = rule.split('::=')[1]
		transitions = [transitionsString[i:i + 4] for i in range(0, len(transitionsString), 5)]
		for transition in transitions:
			if(transition == 'ε'):
				NFA[state]['final'] = grammar['name']
			elif(len(transition) == 1):
				if transition not in NFA[state]['transitions']:
					NFA[state]['transitions'][transition] = set()
				NFA[state]['transitions'][transition].add(newFinalState)
				NFA[newFinalState] = {'final': grammar['name'], 'transitions': {}}
				newFinalState += 1
			elif(transition[0] == '<' and len(transition) == 3):
				if 'ε' not in NFA[state]['transitions']:
					NFA[state]['transitions']['ε'] = set()
				NFA[state]['transitions']['ε'].add(states[transition])
			else:
				if transition[0] not in NFA[state]['transitions']:
					NFA[state]['transitions'][transition[0]] = set()
				NFA[state]['transitions'][transition[0]].add(states[transition[1:]])

	return normalizeNFA(NFA)

def mergeNFAs(A, B):
	offset = len(A) - 1

	for state in B:
		for transition in B[state]['transitions']:
			newSet = set()
			for t in list(B[state]['transitions'][transition]):
				if (t != 0):
					newSet.add(t + offset)
				else:
					newSet.add(t)
			B[state]['transitions'][transition] = newSet

	if type(A[0]['final']) == type(True):
		A[0]['final'] = B[0]['final']

	for transition in B[0]['transitions']:
		if(transition not in A[0]['transitions']):
			A[0]['transitions'][transition] = set()
		A[0]['transitions'][transition] = A[0]['transitions'][transition].union(B[0]['transitions'][transition])

	iterB = iter(B)
	next(iterB)
	for state in iterB:
		A[state + offset] = B[state]

	return normalizeNFA(A)
