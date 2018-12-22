from auxiliary import *

def printNFA(NFA):
	sep = 'β'
	transitions = sorted(getAllTransitions(NFA))

	print('state', end = sep)
	for transition in transitions:
		print(transition, end = sep)
	print()

	NFAStates = sorted(NFA.keys())
	for state in NFAStates:
		if NFA[state]['final']:
			print('δ' + NFA[state]['final'] + 'δ ', end = '')
		print(state, end = sep)
		for transition in transitions:
			for i, transitionState in enumerate(NFA[state]['transitions'][transition]):
				print('%s%d' % ('' if i == 0 else ',', transitionState), end = '')
			print(sep, end = '')
		print()

def printNFAForChecking(NFA):
	print('%d %d' % (len(NFA), len(NFA[0]['transitions']) - (1 if 'ε' in NFA[0]['transitions'] else 0)))
	F = 0
	for state in NFA:
		if NFA[state]['final']:
			F += 1
	print(F, end = '')
	for state in NFA:
		if NFA[state]['final']:
			print(' %d' % state, end = '')
	print()
	T = 0
	mapping = {}
	mapping['ε'] = 0
	for state in NFA:
		for transition in sorted(NFA[state]['transitions']):
			T += len(NFA[state]['transitions'][transition])
			if transition not in mapping:
				mapping[transition] = len(mapping)
	print(T)
	for state in NFA:
		for transition in sorted(NFA[state]['transitions']):
			if len(NFA[state]['transitions'][transition]) > 0:
				print('%d %d %d' % (state, mapping[transition], len(NFA[state]['transitions'][transition])), end = '')
				for stateTransition in NFA[state]['transitions'][transition]:
					print(' %d' % stateTransition, end = '')
				print()
