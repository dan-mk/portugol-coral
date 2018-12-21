import copy
from auxiliary import *

def determinizeNFA(NFA):
	newStates = {}
	state = 0
	while(state < len(NFA)):
		for transition in sorted(NFA[state]['transitions']):
			if(len(NFA[state]['transitions'][transition]) > 1):
				statesList = sorted(NFA[state]['transitions'][transition])
				stateName = ','.join(map(str, statesList))
				if(stateName not in newStates):
					newState = len(NFA)
					newStates[stateName] = newState
					NFA[newState] = copy.deepcopy(NFA[statesList[0]])
					for stateAdd in statesList[1:]:
						NFA = mergeStates(NFA, newState, stateAdd)
						NFA[newState]['final'] = NFA[newState]['final'] or NFA[stateAdd]['final']
		state += 1

	for state in NFA:
		for transition in sorted(NFA[state]['transitions']):
			if(len(NFA[state]['transitions'][transition]) > 1):
				statesList = sorted(NFA[state]['transitions'][transition])
				stateName = ','.join(map(str, statesList))
				NFA[state]['transitions'][transition] = set([newStates[stateName]])

	DFA = NFA
	return DFA
