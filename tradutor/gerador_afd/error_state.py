from minimization import *

def addErrorState(DFA):
	errorState = len(DFA)
	DFA[errorState] = {'final': True, 'transitions': {}}
	DFA = normalizeNFA(DFA)
	for state in DFA:
		for transition in DFA[state]['transitions']:
			if(len(DFA[state]['transitions'][transition]) == 0):
				DFA[state]['transitions'][transition].add(errorState)

	DFA = minimizeDFA(DFA)
	if(errorState in DFA):
		DFA[errorState]['final'] = False

	return DFA
