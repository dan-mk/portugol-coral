import copy
from auxiliary import *

def isDead(DFA, initState):
	S = []
	S.append(initState)
	for state in S:
		if(DFA[state]['final']):
			return False
		for transition in DFA[state]['transitions']:
			for transitionState in DFA[state]['transitions'][transition]:
				if(transitionState not in S):
					S.append(transitionState)
	return True

def minimizeDFA(DFA):
	DFA = copy.deepcopy(DFA)

	deadStates = set()
	for state in DFA:
		if(isDead(DFA, state)):
			deadStates.add(state)

	allStates = set(DFA.keys())
	reachableStates = [0]
	for state in reachableStates:
		for transition in DFA[state]['transitions']:
			for transitionState in DFA[state]['transitions'][transition]:
				if(transitionState not in reachableStates):
					reachableStates.append(transitionState)

	deadAndUnreachable = deadStates.union(allStates.difference(set(reachableStates)))
	for state in allStates:
		if(state in deadAndUnreachable):
			DFA.pop(state)

	for state in DFA:
		for transition in DFA[state]['transitions']:
			for transitionState in list(DFA[state]['transitions'][transition]):
				if(transitionState in deadStates):
					DFA[state]['transitions'][transition].remove(transitionState)

	return normalizeNFA(DFA)
