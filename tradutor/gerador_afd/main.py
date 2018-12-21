import sys
from input import *
from epsilon_transition import *
from determinization import *
from minimization import *
from error_state import *
from output import *

tokens, grammars = tokensAndGrammarsFromFile('../tokens')

NFAs = []
for token in tokens:
	NFAs.append(tokenDFA(token))

for grammar in grammars:
	NFAs.append(removeEpsilonTransitions(grammarNFA(grammar)))

finalNFA = NFAs[0]
for NFA in NFAs[1:]:
	finalNFA = mergeNFAs(finalNFA, NFA)

sys.stdout = open('../afd.csv', "w")
printNFA(addErrorState(minimizeDFA(determinizeNFA(finalNFA))))
