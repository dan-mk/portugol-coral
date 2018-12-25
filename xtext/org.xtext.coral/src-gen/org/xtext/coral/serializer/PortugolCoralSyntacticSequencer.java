/*
 * generated by Xtext 2.16.0
 */
package org.xtext.coral.serializer;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AlternativeAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;
import org.xtext.coral.services.PortugolCoralGrammarAccess;

@SuppressWarnings("all")
public class PortugolCoralSyntacticSequencer extends AbstractSyntacticSequencer {

	protected PortugolCoralGrammarAccess grammarAccess;
	protected AbstractElementAlias match_Atribuir___FaAKeyword_1_1_or_FacaKeyword_1_0__q;
	protected AbstractElementAlias match_DeclararVariaveis_CrieKeyword_0_q;
	protected AbstractElementAlias match_DeclararVariaveis_VariVeisKeyword_1_1_or_VariaveisKeyword_1_0;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (PortugolCoralGrammarAccess) access;
		match_Atribuir___FaAKeyword_1_1_or_FacaKeyword_1_0__q = new AlternativeAlias(false, true, new TokenAlias(false, false, grammarAccess.getAtribuirAccess().getFaAKeyword_1_1()), new TokenAlias(false, false, grammarAccess.getAtribuirAccess().getFacaKeyword_1_0()));
		match_DeclararVariaveis_CrieKeyword_0_q = new TokenAlias(false, true, grammarAccess.getDeclararVariaveisAccess().getCrieKeyword_0());
		match_DeclararVariaveis_VariVeisKeyword_1_1_or_VariaveisKeyword_1_0 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getDeclararVariaveisAccess().getVariVeisKeyword_1_1()), new TokenAlias(false, false, grammarAccess.getDeclararVariaveisAccess().getVariaveisKeyword_1_0()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		return "";
	}
	
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if (match_Atribuir___FaAKeyword_1_1_or_FacaKeyword_1_0__q.equals(syntax))
				emit_Atribuir___FaAKeyword_1_1_or_FacaKeyword_1_0__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_DeclararVariaveis_CrieKeyword_0_q.equals(syntax))
				emit_DeclararVariaveis_CrieKeyword_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_DeclararVariaveis_VariVeisKeyword_1_1_or_VariaveisKeyword_1_0.equals(syntax))
				emit_DeclararVariaveis_VariVeisKeyword_1_1_or_VariaveisKeyword_1_0(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Ambiguous syntax:
	 *     ('faca' | 'faça')?
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) variavel=ID
	 */
	protected void emit_Atribuir___FaAKeyword_1_1_or_FacaKeyword_1_0__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     'crie'?
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) ('variaveis' | 'variáveis') '{' elementos+=DeclararVariaveisTipo
	 */
	protected void emit_DeclararVariaveis_CrieKeyword_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     'variaveis' | 'variáveis'
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) 'crie'? (ambiguity) '{' elementos+=DeclararVariaveisTipo
	 */
	protected void emit_DeclararVariaveis_VariVeisKeyword_1_1_or_VariaveisKeyword_1_0(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
