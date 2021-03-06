/*
 * generated by Xtext 2.16.0
 */
grammar InternalPortugolCoral;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package org.xtext.coral.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package org.xtext.coral.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.coral.services.PortugolCoralGrammarAccess;

}

@parser::members {

 	private PortugolCoralGrammarAccess grammarAccess;

    public InternalPortugolCoralParser(TokenStream input, PortugolCoralGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "Portugolcoral";
   	}

   	@Override
   	protected PortugolCoralGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRulePortugolcoral
entryRulePortugolcoral returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPortugolcoralRule()); }
	iv_rulePortugolcoral=rulePortugolcoral
	{ $current=$iv_rulePortugolcoral.current; }
	EOF;

// Rule Portugolcoral
rulePortugolcoral returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				newCompositeNode(grammarAccess.getPortugolcoralAccess().getElementosAcoesParserRuleCall_0());
			}
			lv_elementos_0_0=ruleAcoes
			{
				if ($current==null) {
					$current = createModelElementForParent(grammarAccess.getPortugolcoralRule());
				}
				add(
					$current,
					"elementos",
					lv_elementos_0_0,
					"org.xtext.coral.PortugolCoral.Acoes");
				afterParserOrEnumRuleCall();
			}
		)
	)*
;

// Entry rule entryRuleAcoes
entryRuleAcoes returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAcoesRule()); }
	iv_ruleAcoes=ruleAcoes
	{ $current=$iv_ruleAcoes.current; }
	EOF;

// Rule Acoes
ruleAcoes returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getAcoesAccess().getDeclararVariaveisParserRuleCall_0());
		}
		this_DeclararVariaveis_0=ruleDeclararVariaveis
		{
			$current = $this_DeclararVariaveis_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getAcoesAccess().getAtribuirParserRuleCall_1());
		}
		this_Atribuir_1=ruleAtribuir
		{
			$current = $this_Atribuir_1.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleDeclararVariaveis
entryRuleDeclararVariaveis returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDeclararVariaveisRule()); }
	iv_ruleDeclararVariaveis=ruleDeclararVariaveis
	{ $current=$iv_ruleDeclararVariaveis.current; }
	EOF;

// Rule DeclararVariaveis
ruleDeclararVariaveis returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			otherlv_0='variaveis'
			{
				newLeafNode(otherlv_0, grammarAccess.getDeclararVariaveisAccess().getVariaveisKeyword_0_0());
			}
			    |
			otherlv_1='vari\u00E1veis'
			{
				newLeafNode(otherlv_1, grammarAccess.getDeclararVariaveisAccess().getVariVeisKeyword_0_1());
			}
		)
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getDeclararVariaveisAccess().getLeftCurlyBracketKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getDeclararVariaveisAccess().getElementosDeclararVariaveisTipoParserRuleCall_2_0());
				}
				lv_elementos_3_0=ruleDeclararVariaveisTipo
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getDeclararVariaveisRule());
					}
					add(
						$current,
						"elementos",
						lv_elementos_3_0,
						"org.xtext.coral.PortugolCoral.DeclararVariaveisTipo");
					afterParserOrEnumRuleCall();
				}
			)
		)+
		otherlv_4='}'
		{
			newLeafNode(otherlv_4, grammarAccess.getDeclararVariaveisAccess().getRightCurlyBracketKeyword_3());
		}
	)
;

// Entry rule entryRuleDeclararVariaveisTipo
entryRuleDeclararVariaveisTipo returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDeclararVariaveisTipoRule()); }
	iv_ruleDeclararVariaveisTipo=ruleDeclararVariaveisTipo
	{ $current=$iv_ruleDeclararVariaveisTipo.current; }
	EOF;

// Rule DeclararVariaveisTipo
ruleDeclararVariaveisTipo returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_elementos_0_0=RULE_ID
				{
					newLeafNode(lv_elementos_0_0, grammarAccess.getDeclararVariaveisTipoAccess().getElementosIDTerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getDeclararVariaveisTipoRule());
					}
					addWithLastConsumed(
						$current,
						"elementos",
						lv_elementos_0_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		(
			otherlv_1=','
			{
				newLeafNode(otherlv_1, grammarAccess.getDeclararVariaveisTipoAccess().getCommaKeyword_1_0());
			}
			(
				(
					lv_elementos_2_0=RULE_ID
					{
						newLeafNode(lv_elementos_2_0, grammarAccess.getDeclararVariaveisTipoAccess().getElementosIDTerminalRuleCall_1_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getDeclararVariaveisTipoRule());
						}
						addWithLastConsumed(
							$current,
							"elementos",
							lv_elementos_2_0,
							"org.eclipse.xtext.common.Terminals.ID");
					}
				)
			)
		)*
		otherlv_3=':'
		{
			newLeafNode(otherlv_3, grammarAccess.getDeclararVariaveisTipoAccess().getColonKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getDeclararVariaveisTipoAccess().getTipoTipoVariavelParserRuleCall_3_0());
				}
				lv_tipo_4_0=ruleTipoVariavel
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getDeclararVariaveisTipoRule());
					}
					set(
						$current,
						"tipo",
						lv_tipo_4_0,
						"org.xtext.coral.PortugolCoral.TipoVariavel");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleTipoVariavel
entryRuleTipoVariavel returns [String current=null]:
	{ newCompositeNode(grammarAccess.getTipoVariavelRule()); }
	iv_ruleTipoVariavel=ruleTipoVariavel
	{ $current=$iv_ruleTipoVariavel.current.getText(); }
	EOF;

// Rule TipoVariavel
ruleTipoVariavel returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		kw='int'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getTipoVariavelAccess().getIntKeyword_0());
		}
		    |
		kw='real'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getTipoVariavelAccess().getRealKeyword_1());
		}
		    |
		kw='texto'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getTipoVariavelAccess().getTextoKeyword_2());
		}
		    |
		kw='logico'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getTipoVariavelAccess().getLogicoKeyword_3());
		}
		    |
		kw='l\u00F3gico'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getTipoVariavelAccess().getLGicoKeyword_4());
		}
	)
;

// Entry rule entryRuleAtribuir
entryRuleAtribuir returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAtribuirRule()); }
	iv_ruleAtribuir=ruleAtribuir
	{ $current=$iv_ruleAtribuir.current; }
	EOF;

// Rule Atribuir
ruleAtribuir returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getAtribuirAccess().getAtribuirAction_0(),
					$current);
			}
		)
		(
			(
				lv_variavel_1_0=RULE_ID
				{
					newLeafNode(lv_variavel_1_0, grammarAccess.getAtribuirAccess().getVariavelIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getAtribuirRule());
					}
					setWithLastConsumed(
						$current,
						"variavel",
						lv_variavel_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2='='
		{
			newLeafNode(otherlv_2, grammarAccess.getAtribuirAccess().getEqualsSignKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getAtribuirAccess().getValorExpressaoParserRuleCall_3_0());
				}
				lv_valor_3_0=ruleExpressao
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getAtribuirRule());
					}
					set(
						$current,
						"valor",
						lv_valor_3_0,
						"org.xtext.coral.PortugolCoral.Expressao");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleExpressao
entryRuleExpressao returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getExpressaoRule()); }
	iv_ruleExpressao=ruleExpressao
	{ $current=$iv_ruleExpressao.current; }
	EOF;

// Rule Expressao
ruleExpressao returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				newCompositeNode(grammarAccess.getExpressaoAccess().getEsquerdaOuParserRuleCall_0());
			}
			lv_esquerda_0_0=ruleOu
			{
				if ($current==null) {
					$current = createModelElementForParent(grammarAccess.getExpressaoRule());
				}
				set(
					$current,
					"esquerda",
					lv_esquerda_0_0,
					"org.xtext.coral.PortugolCoral.Ou");
				afterParserOrEnumRuleCall();
			}
		)
	)
;

// Entry rule entryRuleOu
entryRuleOu returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getOuRule()); }
	iv_ruleOu=ruleOu
	{ $current=$iv_ruleOu.current; }
	EOF;

// Rule Ou
ruleOu returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getOuAccess().getEParserRuleCall_0());
		}
		this_E_0=ruleE
		{
			$current = $this_E_0.current;
			afterParserOrEnumRuleCall();
		}
		(
			(
				{
					$current = forceCreateModelElementAndSet(
						grammarAccess.getOuAccess().getOuEsquerdaAction_1_0(),
						$current);
				}
			)
			otherlv_2='ou'
			{
				newLeafNode(otherlv_2, grammarAccess.getOuAccess().getOuKeyword_1_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getOuAccess().getDireitaEParserRuleCall_1_2_0());
					}
					lv_direita_3_0=ruleE
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getOuRule());
						}
						set(
							$current,
							"direita",
							lv_direita_3_0,
							"org.xtext.coral.PortugolCoral.E");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
	)
;

// Entry rule entryRuleE
entryRuleE returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getERule()); }
	iv_ruleE=ruleE
	{ $current=$iv_ruleE.current; }
	EOF;

// Rule E
ruleE returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getEAccess().getXouParserRuleCall_0());
		}
		this_Xou_0=ruleXou
		{
			$current = $this_Xou_0.current;
			afterParserOrEnumRuleCall();
		}
		(
			(
				{
					$current = forceCreateModelElementAndSet(
						grammarAccess.getEAccess().getEEsquerdaAction_1_0(),
						$current);
				}
			)
			otherlv_2='e'
			{
				newLeafNode(otherlv_2, grammarAccess.getEAccess().getEKeyword_1_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getEAccess().getDireitaXouParserRuleCall_1_2_0());
					}
					lv_direita_3_0=ruleXou
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getERule());
						}
						set(
							$current,
							"direita",
							lv_direita_3_0,
							"org.xtext.coral.PortugolCoral.Xou");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
	)
;

// Entry rule entryRuleXou
entryRuleXou returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getXouRule()); }
	iv_ruleXou=ruleXou
	{ $current=$iv_ruleXou.current; }
	EOF;

// Rule Xou
ruleXou returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getXouAccess().getNaoParserRuleCall_0());
		}
		this_Nao_0=ruleNao
		{
			$current = $this_Nao_0.current;
			afterParserOrEnumRuleCall();
		}
		(
			(
				{
					$current = forceCreateModelElementAndSet(
						grammarAccess.getXouAccess().getXouEsquerdaAction_1_0(),
						$current);
				}
			)
			otherlv_2='xou'
			{
				newLeafNode(otherlv_2, grammarAccess.getXouAccess().getXouKeyword_1_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getXouAccess().getDireitaNaoParserRuleCall_1_2_0());
					}
					lv_direita_3_0=ruleNao
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getXouRule());
						}
						set(
							$current,
							"direita",
							lv_direita_3_0,
							"org.xtext.coral.PortugolCoral.Nao");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
	)
;

// Entry rule entryRuleNao
entryRuleNao returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getNaoRule()); }
	iv_ruleNao=ruleNao
	{ $current=$iv_ruleNao.current; }
	EOF;

// Rule Nao
ruleNao returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				(
					lv_naos_0_1='nao'
					{
						newLeafNode(lv_naos_0_1, grammarAccess.getNaoAccess().getNaosNaoKeyword_0_0_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getNaoRule());
						}
						addWithLastConsumed($current, "naos", lv_naos_0_1, null);
					}
					    |
					lv_naos_0_2='n\u00E3o'
					{
						newLeafNode(lv_naos_0_2, grammarAccess.getNaoAccess().getNaosNOKeyword_0_0_1());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getNaoRule());
						}
						addWithLastConsumed($current, "naos", lv_naos_0_2, null);
					}
				)
			)
		)*
		(
			(
				{
					newCompositeNode(grammarAccess.getNaoAccess().getDireitaComparacaoParserRuleCall_1_0());
				}
				lv_direita_1_0=ruleComparacao
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getNaoRule());
					}
					set(
						$current,
						"direita",
						lv_direita_1_0,
						"org.xtext.coral.PortugolCoral.Comparacao");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleComparacao
entryRuleComparacao returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getComparacaoRule()); }
	iv_ruleComparacao=ruleComparacao
	{ $current=$iv_ruleComparacao.current; }
	EOF;

// Rule Comparacao
ruleComparacao returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getComparacaoAccess().getAdicaoOuSubtracaoParserRuleCall_0());
		}
		this_AdicaoOuSubtracao_0=ruleAdicaoOuSubtracao
		{
			$current = $this_AdicaoOuSubtracao_0.current;
			afterParserOrEnumRuleCall();
		}
		(
			(
				{
					$current = forceCreateModelElementAndSet(
						grammarAccess.getComparacaoAccess().getComparacaoEsquerdaAction_1_0(),
						$current);
				}
			)
			(
				(
					(
						lv_comparacao_2_1='<='
						{
							newLeafNode(lv_comparacao_2_1, grammarAccess.getComparacaoAccess().getComparacaoLessThanSignEqualsSignKeyword_1_1_0_0());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getComparacaoRule());
							}
							setWithLastConsumed($current, "comparacao", lv_comparacao_2_1, null);
						}
						    |
						lv_comparacao_2_2='=='
						{
							newLeafNode(lv_comparacao_2_2, grammarAccess.getComparacaoAccess().getComparacaoEqualsSignEqualsSignKeyword_1_1_0_1());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getComparacaoRule());
							}
							setWithLastConsumed($current, "comparacao", lv_comparacao_2_2, null);
						}
						    |
						lv_comparacao_2_3='>='
						{
							newLeafNode(lv_comparacao_2_3, grammarAccess.getComparacaoAccess().getComparacaoGreaterThanSignEqualsSignKeyword_1_1_0_2());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getComparacaoRule());
							}
							setWithLastConsumed($current, "comparacao", lv_comparacao_2_3, null);
						}
						    |
						lv_comparacao_2_4='<'
						{
							newLeafNode(lv_comparacao_2_4, grammarAccess.getComparacaoAccess().getComparacaoLessThanSignKeyword_1_1_0_3());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getComparacaoRule());
							}
							setWithLastConsumed($current, "comparacao", lv_comparacao_2_4, null);
						}
						    |
						lv_comparacao_2_5='>'
						{
							newLeafNode(lv_comparacao_2_5, grammarAccess.getComparacaoAccess().getComparacaoGreaterThanSignKeyword_1_1_0_4());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getComparacaoRule());
							}
							setWithLastConsumed($current, "comparacao", lv_comparacao_2_5, null);
						}
						    |
						lv_comparacao_2_6='!='
						{
							newLeafNode(lv_comparacao_2_6, grammarAccess.getComparacaoAccess().getComparacaoExclamationMarkEqualsSignKeyword_1_1_0_5());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getComparacaoRule());
							}
							setWithLastConsumed($current, "comparacao", lv_comparacao_2_6, null);
						}
					)
				)
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getComparacaoAccess().getDireitaAdicaoOuSubtracaoParserRuleCall_1_2_0());
					}
					lv_direita_3_0=ruleAdicaoOuSubtracao
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getComparacaoRule());
						}
						set(
							$current,
							"direita",
							lv_direita_3_0,
							"org.xtext.coral.PortugolCoral.AdicaoOuSubtracao");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
	)
;

// Entry rule entryRuleAdicaoOuSubtracao
entryRuleAdicaoOuSubtracao returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAdicaoOuSubtracaoRule()); }
	iv_ruleAdicaoOuSubtracao=ruleAdicaoOuSubtracao
	{ $current=$iv_ruleAdicaoOuSubtracao.current; }
	EOF;

// Rule AdicaoOuSubtracao
ruleAdicaoOuSubtracao returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getAdicaoOuSubtracaoAccess().getMultiplicacaoOuDivisaoParserRuleCall_0());
		}
		this_MultiplicacaoOuDivisao_0=ruleMultiplicacaoOuDivisao
		{
			$current = $this_MultiplicacaoOuDivisao_0.current;
			afterParserOrEnumRuleCall();
		}
		(
			(
				{
					$current = forceCreateModelElementAndSet(
						grammarAccess.getAdicaoOuSubtracaoAccess().getAdicaoOuSubtracaoEsquerdaAction_1_0(),
						$current);
				}
			)
			(
				(
					(
						lv_operacao_2_1='+'
						{
							newLeafNode(lv_operacao_2_1, grammarAccess.getAdicaoOuSubtracaoAccess().getOperacaoPlusSignKeyword_1_1_0_0());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getAdicaoOuSubtracaoRule());
							}
							setWithLastConsumed($current, "operacao", lv_operacao_2_1, null);
						}
						    |
						lv_operacao_2_2='-'
						{
							newLeafNode(lv_operacao_2_2, grammarAccess.getAdicaoOuSubtracaoAccess().getOperacaoHyphenMinusKeyword_1_1_0_1());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getAdicaoOuSubtracaoRule());
							}
							setWithLastConsumed($current, "operacao", lv_operacao_2_2, null);
						}
					)
				)
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getAdicaoOuSubtracaoAccess().getDireitaMultiplicacaoOuDivisaoParserRuleCall_1_2_0());
					}
					lv_direita_3_0=ruleMultiplicacaoOuDivisao
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getAdicaoOuSubtracaoRule());
						}
						set(
							$current,
							"direita",
							lv_direita_3_0,
							"org.xtext.coral.PortugolCoral.MultiplicacaoOuDivisao");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
	)
;

// Entry rule entryRuleMultiplicacaoOuDivisao
entryRuleMultiplicacaoOuDivisao returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getMultiplicacaoOuDivisaoRule()); }
	iv_ruleMultiplicacaoOuDivisao=ruleMultiplicacaoOuDivisao
	{ $current=$iv_ruleMultiplicacaoOuDivisao.current; }
	EOF;

// Rule MultiplicacaoOuDivisao
ruleMultiplicacaoOuDivisao returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getMultiplicacaoOuDivisaoAccess().getSinalParserRuleCall_0());
		}
		this_Sinal_0=ruleSinal
		{
			$current = $this_Sinal_0.current;
			afterParserOrEnumRuleCall();
		}
		(
			(
				{
					$current = forceCreateModelElementAndSet(
						grammarAccess.getMultiplicacaoOuDivisaoAccess().getMultiplicacaoOuDivisaoEsquerdaAction_1_0(),
						$current);
				}
			)
			(
				(
					(
						lv_operacao_2_1='*'
						{
							newLeafNode(lv_operacao_2_1, grammarAccess.getMultiplicacaoOuDivisaoAccess().getOperacaoAsteriskKeyword_1_1_0_0());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getMultiplicacaoOuDivisaoRule());
							}
							setWithLastConsumed($current, "operacao", lv_operacao_2_1, null);
						}
						    |
						lv_operacao_2_2='/'
						{
							newLeafNode(lv_operacao_2_2, grammarAccess.getMultiplicacaoOuDivisaoAccess().getOperacaoSolidusKeyword_1_1_0_1());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getMultiplicacaoOuDivisaoRule());
							}
							setWithLastConsumed($current, "operacao", lv_operacao_2_2, null);
						}
						    |
						lv_operacao_2_3='//'
						{
							newLeafNode(lv_operacao_2_3, grammarAccess.getMultiplicacaoOuDivisaoAccess().getOperacaoSolidusSolidusKeyword_1_1_0_2());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getMultiplicacaoOuDivisaoRule());
							}
							setWithLastConsumed($current, "operacao", lv_operacao_2_3, null);
						}
						    |
						lv_operacao_2_4='%'
						{
							newLeafNode(lv_operacao_2_4, grammarAccess.getMultiplicacaoOuDivisaoAccess().getOperacaoPercentSignKeyword_1_1_0_3());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getMultiplicacaoOuDivisaoRule());
							}
							setWithLastConsumed($current, "operacao", lv_operacao_2_4, null);
						}
					)
				)
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getMultiplicacaoOuDivisaoAccess().getDireitaSinalParserRuleCall_1_2_0());
					}
					lv_direita_3_0=ruleSinal
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getMultiplicacaoOuDivisaoRule());
						}
						set(
							$current,
							"direita",
							lv_direita_3_0,
							"org.xtext.coral.PortugolCoral.Sinal");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
	)
;

// Entry rule entryRuleSinal
entryRuleSinal returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSinalRule()); }
	iv_ruleSinal=ruleSinal
	{ $current=$iv_ruleSinal.current; }
	EOF;

// Rule Sinal
ruleSinal returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				(
					lv_sinais_0_1='+'
					{
						newLeafNode(lv_sinais_0_1, grammarAccess.getSinalAccess().getSinaisPlusSignKeyword_0_0_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getSinalRule());
						}
						addWithLastConsumed($current, "sinais", lv_sinais_0_1, null);
					}
					    |
					lv_sinais_0_2='-'
					{
						newLeafNode(lv_sinais_0_2, grammarAccess.getSinalAccess().getSinaisHyphenMinusKeyword_0_0_1());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getSinalRule());
						}
						addWithLastConsumed($current, "sinais", lv_sinais_0_2, null);
					}
				)
			)
		)*
		(
			(
				{
					newCompositeNode(grammarAccess.getSinalAccess().getDireitaExponenciacaoParserRuleCall_1_0());
				}
				lv_direita_1_0=ruleExponenciacao
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getSinalRule());
					}
					set(
						$current,
						"direita",
						lv_direita_1_0,
						"org.xtext.coral.PortugolCoral.Exponenciacao");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleExponenciacao
entryRuleExponenciacao returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getExponenciacaoRule()); }
	iv_ruleExponenciacao=ruleExponenciacao
	{ $current=$iv_ruleExponenciacao.current; }
	EOF;

// Rule Exponenciacao
ruleExponenciacao returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getExponenciacaoAccess().getElementoParserRuleCall_0());
		}
		this_Elemento_0=ruleElemento
		{
			$current = $this_Elemento_0.current;
			afterParserOrEnumRuleCall();
		}
		(
			(
				{
					$current = forceCreateModelElementAndSet(
						grammarAccess.getExponenciacaoAccess().getExponenciacaoEsquerdaAction_1_0(),
						$current);
				}
			)
			otherlv_2='^'
			{
				newLeafNode(otherlv_2, grammarAccess.getExponenciacaoAccess().getCircumflexAccentKeyword_1_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getExponenciacaoAccess().getDireitaElementoParserRuleCall_1_2_0());
					}
					lv_direita_3_0=ruleElemento
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getExponenciacaoRule());
						}
						set(
							$current,
							"direita",
							lv_direita_3_0,
							"org.xtext.coral.PortugolCoral.Elemento");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
	)
;

// Entry rule entryRuleElemento
entryRuleElemento returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getElementoRule()); }
	iv_ruleElemento=ruleElemento
	{ $current=$iv_ruleElemento.current; }
	EOF;

// Rule Elemento
ruleElemento returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getElementoAccess().getElementoParentesesParserRuleCall_0());
		}
		this_ElementoParenteses_0=ruleElementoParenteses
		{
			$current = $this_ElementoParenteses_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getElementoAccess().getElementoAtomicoParserRuleCall_1());
		}
		this_ElementoAtomico_1=ruleElementoAtomico
		{
			$current = $this_ElementoAtomico_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getElementoAccess().getMatrizParserRuleCall_2());
		}
		this_Matriz_2=ruleMatriz
		{
			$current = $this_Matriz_2.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleElementoParenteses
entryRuleElementoParenteses returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getElementoParentesesRule()); }
	iv_ruleElementoParenteses=ruleElementoParenteses
	{ $current=$iv_ruleElementoParenteses.current; }
	EOF;

// Rule ElementoParenteses
ruleElementoParenteses returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				newCompositeNode(grammarAccess.getElementoParentesesAccess().getDireitaParentesesParserRuleCall_0());
			}
			lv_direita_0_0=ruleParenteses
			{
				if ($current==null) {
					$current = createModelElementForParent(grammarAccess.getElementoParentesesRule());
				}
				set(
					$current,
					"direita",
					lv_direita_0_0,
					"org.xtext.coral.PortugolCoral.Parenteses");
				afterParserOrEnumRuleCall();
			}
		)
	)
;

// Entry rule entryRuleParenteses
entryRuleParenteses returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getParentesesRule()); }
	iv_ruleParenteses=ruleParenteses
	{ $current=$iv_ruleParenteses.current; }
	EOF;

// Rule Parenteses
ruleParenteses returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='('
		{
			newLeafNode(otherlv_0, grammarAccess.getParentesesAccess().getLeftParenthesisKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getParentesesAccess().getDireitaExpressaoParserRuleCall_1_0());
				}
				lv_direita_1_0=ruleExpressao
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getParentesesRule());
					}
					set(
						$current,
						"direita",
						lv_direita_1_0,
						"org.xtext.coral.PortugolCoral.Expressao");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_2=')'
		{
			newLeafNode(otherlv_2, grammarAccess.getParentesesAccess().getRightParenthesisKeyword_2());
		}
	)
;

// Entry rule entryRuleMatriz
entryRuleMatriz returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getMatrizRule()); }
	iv_ruleMatriz=ruleMatriz
	{ $current=$iv_ruleMatriz.current; }
	EOF;

// Rule Matriz
ruleMatriz returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_variavel_0_0=RULE_ID
				{
					newLeafNode(lv_variavel_0_0, grammarAccess.getMatrizAccess().getVariavelIDTerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getMatrizRule());
					}
					setWithLastConsumed(
						$current,
						"variavel",
						lv_variavel_0_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getMatrizAccess().getDireitaPosicaoMatrizParserRuleCall_1_0());
				}
				lv_direita_1_0=rulePosicaoMatriz
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getMatrizRule());
					}
					add(
						$current,
						"direita",
						lv_direita_1_0,
						"org.xtext.coral.PortugolCoral.PosicaoMatriz");
					afterParserOrEnumRuleCall();
				}
			)
		)+
	)
;

// Entry rule entryRulePosicaoMatriz
entryRulePosicaoMatriz returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPosicaoMatrizRule()); }
	iv_rulePosicaoMatriz=rulePosicaoMatriz
	{ $current=$iv_rulePosicaoMatriz.current; }
	EOF;

// Rule PosicaoMatriz
rulePosicaoMatriz returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='['
		{
			newLeafNode(otherlv_0, grammarAccess.getPosicaoMatrizAccess().getLeftSquareBracketKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getPosicaoMatrizAccess().getDireitaExpressaoParserRuleCall_1_0());
				}
				lv_direita_1_0=ruleExpressao
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getPosicaoMatrizRule());
					}
					set(
						$current,
						"direita",
						lv_direita_1_0,
						"org.xtext.coral.PortugolCoral.Expressao");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_2=']'
		{
			newLeafNode(otherlv_2, grammarAccess.getPosicaoMatrizAccess().getRightSquareBracketKeyword_2());
		}
	)
;

// Entry rule entryRuleElementoAtomico
entryRuleElementoAtomico returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getElementoAtomicoRule()); }
	iv_ruleElementoAtomico=ruleElementoAtomico
	{ $current=$iv_ruleElementoAtomico.current; }
	EOF;

// Rule ElementoAtomico
ruleElementoAtomico returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getElementoAtomicoAccess().getConstanteInteiraAction_0_0(),
						$current);
				}
			)
			(
				(
					lv_valor_1_0=RULE_INT
					{
						newLeafNode(lv_valor_1_0, grammarAccess.getElementoAtomicoAccess().getValorINTTerminalRuleCall_0_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getElementoAtomicoRule());
						}
						setWithLastConsumed(
							$current,
							"valor",
							lv_valor_1_0,
							"org.eclipse.xtext.common.Terminals.INT");
					}
				)
			)
		)
		    |
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getElementoAtomicoAccess().getConstanteRealAction_1_0(),
						$current);
				}
			)
			(
				(
					lv_valor_3_0=RULE_REAL
					{
						newLeafNode(lv_valor_3_0, grammarAccess.getElementoAtomicoAccess().getValorREALTerminalRuleCall_1_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getElementoAtomicoRule());
						}
						setWithLastConsumed(
							$current,
							"valor",
							lv_valor_3_0,
							"org.xtext.coral.PortugolCoral.REAL");
					}
				)
			)
		)
		    |
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getElementoAtomicoAccess().getConstanteStringAction_2_0(),
						$current);
				}
			)
			(
				(
					(
						lv_valor_5_1=RULE_TEXTO_ASPAS_SIMPLES
						{
							newLeafNode(lv_valor_5_1, grammarAccess.getElementoAtomicoAccess().getValorTEXTO_ASPAS_SIMPLESTerminalRuleCall_2_1_0_0());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getElementoAtomicoRule());
							}
							setWithLastConsumed(
								$current,
								"valor",
								lv_valor_5_1,
								"org.xtext.coral.PortugolCoral.TEXTO_ASPAS_SIMPLES");
						}
						    |
						lv_valor_5_2=RULE_TEXTO_ASPAS_DUPLAS
						{
							newLeafNode(lv_valor_5_2, grammarAccess.getElementoAtomicoAccess().getValorTEXTO_ASPAS_DUPLASTerminalRuleCall_2_1_0_1());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getElementoAtomicoRule());
							}
							setWithLastConsumed(
								$current,
								"valor",
								lv_valor_5_2,
								"org.xtext.coral.PortugolCoral.TEXTO_ASPAS_DUPLAS");
						}
					)
				)
			)
		)
		    |
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getElementoAtomicoAccess().getReferenciaVariavelAction_3_0(),
						$current);
				}
			)
			(
				(
					lv_variavel_7_0=RULE_ID
					{
						newLeafNode(lv_variavel_7_0, grammarAccess.getElementoAtomicoAccess().getVariavelIDTerminalRuleCall_3_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getElementoAtomicoRule());
						}
						setWithLastConsumed(
							$current,
							"variavel",
							lv_variavel_7_0,
							"org.eclipse.xtext.common.Terminals.ID");
					}
				)
			)
		)
	)
;

RULE_REAL : (RULE_INT '.' RULE_INT?|'.' RULE_INT);

RULE_TEXTO_ASPAS_SIMPLES : '\'' ('\\' .|~(('\\'|'\'')))* '\'';

RULE_TEXTO_ASPAS_DUPLAS : '"' ('\\' .|~(('\\'|'"')))* '"';

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
