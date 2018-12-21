import copy

def getAllTransitions(NFA):
	transitions = set()
	for state in NFA:
		for transition in NFA[state]['transitions']:
			transitions.add(transition)
	return transitions

def uselessTransition(NFA, transition):
	for state in NFA:
		if(len(NFA[state]['transitions'][transition]) > 0):
			return False
	return True

def normalizeNFA(NFA):
	transitions = getAllTransitions(NFA)
	for state in NFA:
		for transition in transitions:
			if(transition not in NFA[state]['transitions']):
				NFA[state]['transitions'][transition] = set()

	for transition in transitions:
		if(uselessTransition(NFA, transition)):
			for state in NFA:
				NFA[state]['transitions'].pop(transition)

	mapping = {}
	for newState, state in enumerate(NFA):
		mapping[state] = newState

	newNFA = {}
	for state in NFA:
		newNFA[mapping[state]] = copy.deepcopy(NFA[state])
		for transition in newNFA[mapping[state]]['transitions']:
			oldSet = newNFA[mapping[state]]['transitions'][transition]
			newSet = set()
			for oldTransition in oldSet:
				newSet.add(mapping[oldTransition])
			newNFA[mapping[state]]['transitions'][transition] = newSet

	return newNFA
	
def mergeStates(NFA, destState, originState):
	for transition in NFA[originState]['transitions']:
		NFA[destState]['transitions'][transition] = NFA[destState]['transitions'][transition].union(NFA[originState]['transitions'][transition])
	return NFA
