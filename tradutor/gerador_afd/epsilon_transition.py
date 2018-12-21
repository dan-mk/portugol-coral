from auxiliary import *

def getEpsilonTransitionStates(NFA, initState):
	S = [initState]
	for state in S:
		if('ε' in NFA[state]['transitions']):
			for transition in list(NFA[state]['transitions']['ε']):
				if(transition not in S):
					S.append(transition)
	return S

def epsilonStepOne(NFA, goalState, epsilonTransitionStates):
	for state in NFA:
		for transition in NFA[state]['transitions']:
			if goalState in NFA[state]['transitions'][transition]:
				NFA[state]['transitions'][transition] = NFA[state]['transitions'][transition].union(set(epsilonTransitionStates))
	return NFA

def removeEpsilonTransitions(NFA):
	epsilonTransitionStates = {}
	for state in NFA:
		epsilonTransitionStates[state] = getEpsilonTransitionStates(NFA, state)

	for state in NFA:
		NFA = epsilonStepOne(NFA, state, epsilonTransitionStates[state])

	for state in NFA:
		for transitionState in epsilonTransitionStates[state]:
			NFA = mergeStates(NFA, state, transitionState)

	for state in NFA:
		for transitionState in epsilonTransitionStates[state]:
			if(NFA[transitionState]['final']):
				NFA[state]['final'] = NFA[transitionState]['final']

	for state in NFA:
		if('ε' in NFA[state]['transitions']):
			NFA[state]['transitions'].pop('ε')

	return NFA
