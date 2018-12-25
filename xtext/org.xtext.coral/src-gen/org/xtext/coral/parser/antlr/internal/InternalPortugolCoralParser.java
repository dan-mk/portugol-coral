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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPortugolCoralParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_REAL", "RULE_TEXTO_ASPAS_SIMPLES", "RULE_TEXTO_ASPAS_DUPLAS", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'variaveis'", "'vari\\u00E1veis'", "'{'", "'}'", "','", "':'", "'int'", "'real'", "'texto'", "'logico'", "'l\\u00F3gico'", "'='", "'ou'", "'e'", "'xou'", "'nao'", "'n\\u00E3o'", "'<='", "'=='", "'>='", "'<'", "'>'", "'!='", "'+'", "'-'", "'*'", "'/'", "'//'", "'%'", "'^'", "'('", "')'", "'['", "']'"
    };
    public static final int RULE_TEXTO_ASPAS_DUPLAS=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__14=14;
    public static final int RULE_ID=4;
    public static final int RULE_REAL=6;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=10;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=9;
    public static final int RULE_SL_COMMENT=11;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=12;
    public static final int RULE_ANY_OTHER=13;
    public static final int RULE_TEXTO_ASPAS_SIMPLES=7;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalPortugolCoralParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalPortugolCoralParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalPortugolCoralParser.tokenNames; }
    public String getGrammarFileName() { return "InternalPortugolCoral.g"; }



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




    // $ANTLR start "entryRulePortugolcoral"
    // InternalPortugolCoral.g:64:1: entryRulePortugolcoral returns [EObject current=null] : iv_rulePortugolcoral= rulePortugolcoral EOF ;
    public final EObject entryRulePortugolcoral() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePortugolcoral = null;


        try {
            // InternalPortugolCoral.g:64:54: (iv_rulePortugolcoral= rulePortugolcoral EOF )
            // InternalPortugolCoral.g:65:2: iv_rulePortugolcoral= rulePortugolcoral EOF
            {
             newCompositeNode(grammarAccess.getPortugolcoralRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePortugolcoral=rulePortugolcoral();

            state._fsp--;

             current =iv_rulePortugolcoral; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePortugolcoral"


    // $ANTLR start "rulePortugolcoral"
    // InternalPortugolCoral.g:71:1: rulePortugolcoral returns [EObject current=null] : ( (lv_elementos_0_0= ruleAcoes ) )* ;
    public final EObject rulePortugolcoral() throws RecognitionException {
        EObject current = null;

        EObject lv_elementos_0_0 = null;



        	enterRule();

        try {
            // InternalPortugolCoral.g:77:2: ( ( (lv_elementos_0_0= ruleAcoes ) )* )
            // InternalPortugolCoral.g:78:2: ( (lv_elementos_0_0= ruleAcoes ) )*
            {
            // InternalPortugolCoral.g:78:2: ( (lv_elementos_0_0= ruleAcoes ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID||(LA1_0>=14 && LA1_0<=15)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalPortugolCoral.g:79:3: (lv_elementos_0_0= ruleAcoes )
            	    {
            	    // InternalPortugolCoral.g:79:3: (lv_elementos_0_0= ruleAcoes )
            	    // InternalPortugolCoral.g:80:4: lv_elementos_0_0= ruleAcoes
            	    {

            	    				newCompositeNode(grammarAccess.getPortugolcoralAccess().getElementosAcoesParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_elementos_0_0=ruleAcoes();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getPortugolcoralRule());
            	    				}
            	    				add(
            	    					current,
            	    					"elementos",
            	    					lv_elementos_0_0,
            	    					"org.xtext.coral.PortugolCoral.Acoes");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePortugolcoral"


    // $ANTLR start "entryRuleAcoes"
    // InternalPortugolCoral.g:100:1: entryRuleAcoes returns [EObject current=null] : iv_ruleAcoes= ruleAcoes EOF ;
    public final EObject entryRuleAcoes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAcoes = null;


        try {
            // InternalPortugolCoral.g:100:46: (iv_ruleAcoes= ruleAcoes EOF )
            // InternalPortugolCoral.g:101:2: iv_ruleAcoes= ruleAcoes EOF
            {
             newCompositeNode(grammarAccess.getAcoesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAcoes=ruleAcoes();

            state._fsp--;

             current =iv_ruleAcoes; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAcoes"


    // $ANTLR start "ruleAcoes"
    // InternalPortugolCoral.g:107:1: ruleAcoes returns [EObject current=null] : (this_DeclararVariaveis_0= ruleDeclararVariaveis | this_Atribuir_1= ruleAtribuir ) ;
    public final EObject ruleAcoes() throws RecognitionException {
        EObject current = null;

        EObject this_DeclararVariaveis_0 = null;

        EObject this_Atribuir_1 = null;



        	enterRule();

        try {
            // InternalPortugolCoral.g:113:2: ( (this_DeclararVariaveis_0= ruleDeclararVariaveis | this_Atribuir_1= ruleAtribuir ) )
            // InternalPortugolCoral.g:114:2: (this_DeclararVariaveis_0= ruleDeclararVariaveis | this_Atribuir_1= ruleAtribuir )
            {
            // InternalPortugolCoral.g:114:2: (this_DeclararVariaveis_0= ruleDeclararVariaveis | this_Atribuir_1= ruleAtribuir )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=14 && LA2_0<=15)) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_ID) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalPortugolCoral.g:115:3: this_DeclararVariaveis_0= ruleDeclararVariaveis
                    {

                    			newCompositeNode(grammarAccess.getAcoesAccess().getDeclararVariaveisParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_DeclararVariaveis_0=ruleDeclararVariaveis();

                    state._fsp--;


                    			current = this_DeclararVariaveis_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalPortugolCoral.g:124:3: this_Atribuir_1= ruleAtribuir
                    {

                    			newCompositeNode(grammarAccess.getAcoesAccess().getAtribuirParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Atribuir_1=ruleAtribuir();

                    state._fsp--;


                    			current = this_Atribuir_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAcoes"


    // $ANTLR start "entryRuleDeclararVariaveis"
    // InternalPortugolCoral.g:136:1: entryRuleDeclararVariaveis returns [EObject current=null] : iv_ruleDeclararVariaveis= ruleDeclararVariaveis EOF ;
    public final EObject entryRuleDeclararVariaveis() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclararVariaveis = null;


        try {
            // InternalPortugolCoral.g:136:58: (iv_ruleDeclararVariaveis= ruleDeclararVariaveis EOF )
            // InternalPortugolCoral.g:137:2: iv_ruleDeclararVariaveis= ruleDeclararVariaveis EOF
            {
             newCompositeNode(grammarAccess.getDeclararVariaveisRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDeclararVariaveis=ruleDeclararVariaveis();

            state._fsp--;

             current =iv_ruleDeclararVariaveis; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDeclararVariaveis"


    // $ANTLR start "ruleDeclararVariaveis"
    // InternalPortugolCoral.g:143:1: ruleDeclararVariaveis returns [EObject current=null] : ( (otherlv_0= 'variaveis' | otherlv_1= 'vari\\u00E1veis' ) otherlv_2= '{' ( (lv_elementos_3_0= ruleDeclararVariaveisTipo ) )+ otherlv_4= '}' ) ;
    public final EObject ruleDeclararVariaveis() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_elementos_3_0 = null;



        	enterRule();

        try {
            // InternalPortugolCoral.g:149:2: ( ( (otherlv_0= 'variaveis' | otherlv_1= 'vari\\u00E1veis' ) otherlv_2= '{' ( (lv_elementos_3_0= ruleDeclararVariaveisTipo ) )+ otherlv_4= '}' ) )
            // InternalPortugolCoral.g:150:2: ( (otherlv_0= 'variaveis' | otherlv_1= 'vari\\u00E1veis' ) otherlv_2= '{' ( (lv_elementos_3_0= ruleDeclararVariaveisTipo ) )+ otherlv_4= '}' )
            {
            // InternalPortugolCoral.g:150:2: ( (otherlv_0= 'variaveis' | otherlv_1= 'vari\\u00E1veis' ) otherlv_2= '{' ( (lv_elementos_3_0= ruleDeclararVariaveisTipo ) )+ otherlv_4= '}' )
            // InternalPortugolCoral.g:151:3: (otherlv_0= 'variaveis' | otherlv_1= 'vari\\u00E1veis' ) otherlv_2= '{' ( (lv_elementos_3_0= ruleDeclararVariaveisTipo ) )+ otherlv_4= '}'
            {
            // InternalPortugolCoral.g:151:3: (otherlv_0= 'variaveis' | otherlv_1= 'vari\\u00E1veis' )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==14) ) {
                alt3=1;
            }
            else if ( (LA3_0==15) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalPortugolCoral.g:152:4: otherlv_0= 'variaveis'
                    {
                    otherlv_0=(Token)match(input,14,FOLLOW_4); 

                    				newLeafNode(otherlv_0, grammarAccess.getDeclararVariaveisAccess().getVariaveisKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalPortugolCoral.g:157:4: otherlv_1= 'vari\\u00E1veis'
                    {
                    otherlv_1=(Token)match(input,15,FOLLOW_4); 

                    				newLeafNode(otherlv_1, grammarAccess.getDeclararVariaveisAccess().getVariVeisKeyword_0_1());
                    			

                    }
                    break;

            }

            otherlv_2=(Token)match(input,16,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getDeclararVariaveisAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalPortugolCoral.g:166:3: ( (lv_elementos_3_0= ruleDeclararVariaveisTipo ) )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_ID) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalPortugolCoral.g:167:4: (lv_elementos_3_0= ruleDeclararVariaveisTipo )
            	    {
            	    // InternalPortugolCoral.g:167:4: (lv_elementos_3_0= ruleDeclararVariaveisTipo )
            	    // InternalPortugolCoral.g:168:5: lv_elementos_3_0= ruleDeclararVariaveisTipo
            	    {

            	    					newCompositeNode(grammarAccess.getDeclararVariaveisAccess().getElementosDeclararVariaveisTipoParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_elementos_3_0=ruleDeclararVariaveisTipo();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getDeclararVariaveisRule());
            	    					}
            	    					add(
            	    						current,
            	    						"elementos",
            	    						lv_elementos_3_0,
            	    						"org.xtext.coral.PortugolCoral.DeclararVariaveisTipo");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);

            otherlv_4=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getDeclararVariaveisAccess().getRightCurlyBracketKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDeclararVariaveis"


    // $ANTLR start "entryRuleDeclararVariaveisTipo"
    // InternalPortugolCoral.g:193:1: entryRuleDeclararVariaveisTipo returns [EObject current=null] : iv_ruleDeclararVariaveisTipo= ruleDeclararVariaveisTipo EOF ;
    public final EObject entryRuleDeclararVariaveisTipo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclararVariaveisTipo = null;


        try {
            // InternalPortugolCoral.g:193:62: (iv_ruleDeclararVariaveisTipo= ruleDeclararVariaveisTipo EOF )
            // InternalPortugolCoral.g:194:2: iv_ruleDeclararVariaveisTipo= ruleDeclararVariaveisTipo EOF
            {
             newCompositeNode(grammarAccess.getDeclararVariaveisTipoRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDeclararVariaveisTipo=ruleDeclararVariaveisTipo();

            state._fsp--;

             current =iv_ruleDeclararVariaveisTipo; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDeclararVariaveisTipo"


    // $ANTLR start "ruleDeclararVariaveisTipo"
    // InternalPortugolCoral.g:200:1: ruleDeclararVariaveisTipo returns [EObject current=null] : ( ( (lv_elementos_0_0= RULE_ID ) ) (otherlv_1= ',' ( (lv_elementos_2_0= RULE_ID ) ) )* otherlv_3= ':' ( (lv_tipo_4_0= ruleTipoVariavel ) ) ) ;
    public final EObject ruleDeclararVariaveisTipo() throws RecognitionException {
        EObject current = null;

        Token lv_elementos_0_0=null;
        Token otherlv_1=null;
        Token lv_elementos_2_0=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_tipo_4_0 = null;



        	enterRule();

        try {
            // InternalPortugolCoral.g:206:2: ( ( ( (lv_elementos_0_0= RULE_ID ) ) (otherlv_1= ',' ( (lv_elementos_2_0= RULE_ID ) ) )* otherlv_3= ':' ( (lv_tipo_4_0= ruleTipoVariavel ) ) ) )
            // InternalPortugolCoral.g:207:2: ( ( (lv_elementos_0_0= RULE_ID ) ) (otherlv_1= ',' ( (lv_elementos_2_0= RULE_ID ) ) )* otherlv_3= ':' ( (lv_tipo_4_0= ruleTipoVariavel ) ) )
            {
            // InternalPortugolCoral.g:207:2: ( ( (lv_elementos_0_0= RULE_ID ) ) (otherlv_1= ',' ( (lv_elementos_2_0= RULE_ID ) ) )* otherlv_3= ':' ( (lv_tipo_4_0= ruleTipoVariavel ) ) )
            // InternalPortugolCoral.g:208:3: ( (lv_elementos_0_0= RULE_ID ) ) (otherlv_1= ',' ( (lv_elementos_2_0= RULE_ID ) ) )* otherlv_3= ':' ( (lv_tipo_4_0= ruleTipoVariavel ) )
            {
            // InternalPortugolCoral.g:208:3: ( (lv_elementos_0_0= RULE_ID ) )
            // InternalPortugolCoral.g:209:4: (lv_elementos_0_0= RULE_ID )
            {
            // InternalPortugolCoral.g:209:4: (lv_elementos_0_0= RULE_ID )
            // InternalPortugolCoral.g:210:5: lv_elementos_0_0= RULE_ID
            {
            lv_elementos_0_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(lv_elementos_0_0, grammarAccess.getDeclararVariaveisTipoAccess().getElementosIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDeclararVariaveisTipoRule());
            					}
            					addWithLastConsumed(
            						current,
            						"elementos",
            						lv_elementos_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalPortugolCoral.g:226:3: (otherlv_1= ',' ( (lv_elementos_2_0= RULE_ID ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==18) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalPortugolCoral.g:227:4: otherlv_1= ',' ( (lv_elementos_2_0= RULE_ID ) )
            	    {
            	    otherlv_1=(Token)match(input,18,FOLLOW_5); 

            	    				newLeafNode(otherlv_1, grammarAccess.getDeclararVariaveisTipoAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalPortugolCoral.g:231:4: ( (lv_elementos_2_0= RULE_ID ) )
            	    // InternalPortugolCoral.g:232:5: (lv_elementos_2_0= RULE_ID )
            	    {
            	    // InternalPortugolCoral.g:232:5: (lv_elementos_2_0= RULE_ID )
            	    // InternalPortugolCoral.g:233:6: lv_elementos_2_0= RULE_ID
            	    {
            	    lv_elementos_2_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            	    						newLeafNode(lv_elementos_2_0, grammarAccess.getDeclararVariaveisTipoAccess().getElementosIDTerminalRuleCall_1_1_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getDeclararVariaveisTipoRule());
            	    						}
            	    						addWithLastConsumed(
            	    							current,
            	    							"elementos",
            	    							lv_elementos_2_0,
            	    							"org.eclipse.xtext.common.Terminals.ID");
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_3=(Token)match(input,19,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getDeclararVariaveisTipoAccess().getColonKeyword_2());
            		
            // InternalPortugolCoral.g:254:3: ( (lv_tipo_4_0= ruleTipoVariavel ) )
            // InternalPortugolCoral.g:255:4: (lv_tipo_4_0= ruleTipoVariavel )
            {
            // InternalPortugolCoral.g:255:4: (lv_tipo_4_0= ruleTipoVariavel )
            // InternalPortugolCoral.g:256:5: lv_tipo_4_0= ruleTipoVariavel
            {

            					newCompositeNode(grammarAccess.getDeclararVariaveisTipoAccess().getTipoTipoVariavelParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_tipo_4_0=ruleTipoVariavel();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDeclararVariaveisTipoRule());
            					}
            					set(
            						current,
            						"tipo",
            						lv_tipo_4_0,
            						"org.xtext.coral.PortugolCoral.TipoVariavel");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDeclararVariaveisTipo"


    // $ANTLR start "entryRuleTipoVariavel"
    // InternalPortugolCoral.g:277:1: entryRuleTipoVariavel returns [String current=null] : iv_ruleTipoVariavel= ruleTipoVariavel EOF ;
    public final String entryRuleTipoVariavel() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTipoVariavel = null;


        try {
            // InternalPortugolCoral.g:277:52: (iv_ruleTipoVariavel= ruleTipoVariavel EOF )
            // InternalPortugolCoral.g:278:2: iv_ruleTipoVariavel= ruleTipoVariavel EOF
            {
             newCompositeNode(grammarAccess.getTipoVariavelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTipoVariavel=ruleTipoVariavel();

            state._fsp--;

             current =iv_ruleTipoVariavel.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTipoVariavel"


    // $ANTLR start "ruleTipoVariavel"
    // InternalPortugolCoral.g:284:1: ruleTipoVariavel returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'int' | kw= 'real' | kw= 'texto' | kw= 'logico' | kw= 'l\\u00F3gico' ) ;
    public final AntlrDatatypeRuleToken ruleTipoVariavel() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalPortugolCoral.g:290:2: ( (kw= 'int' | kw= 'real' | kw= 'texto' | kw= 'logico' | kw= 'l\\u00F3gico' ) )
            // InternalPortugolCoral.g:291:2: (kw= 'int' | kw= 'real' | kw= 'texto' | kw= 'logico' | kw= 'l\\u00F3gico' )
            {
            // InternalPortugolCoral.g:291:2: (kw= 'int' | kw= 'real' | kw= 'texto' | kw= 'logico' | kw= 'l\\u00F3gico' )
            int alt6=5;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt6=1;
                }
                break;
            case 21:
                {
                alt6=2;
                }
                break;
            case 22:
                {
                alt6=3;
                }
                break;
            case 23:
                {
                alt6=4;
                }
                break;
            case 24:
                {
                alt6=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalPortugolCoral.g:292:3: kw= 'int'
                    {
                    kw=(Token)match(input,20,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getTipoVariavelAccess().getIntKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalPortugolCoral.g:298:3: kw= 'real'
                    {
                    kw=(Token)match(input,21,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getTipoVariavelAccess().getRealKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalPortugolCoral.g:304:3: kw= 'texto'
                    {
                    kw=(Token)match(input,22,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getTipoVariavelAccess().getTextoKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalPortugolCoral.g:310:3: kw= 'logico'
                    {
                    kw=(Token)match(input,23,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getTipoVariavelAccess().getLogicoKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalPortugolCoral.g:316:3: kw= 'l\\u00F3gico'
                    {
                    kw=(Token)match(input,24,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getTipoVariavelAccess().getLGicoKeyword_4());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTipoVariavel"


    // $ANTLR start "entryRuleAtribuir"
    // InternalPortugolCoral.g:325:1: entryRuleAtribuir returns [EObject current=null] : iv_ruleAtribuir= ruleAtribuir EOF ;
    public final EObject entryRuleAtribuir() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtribuir = null;


        try {
            // InternalPortugolCoral.g:325:49: (iv_ruleAtribuir= ruleAtribuir EOF )
            // InternalPortugolCoral.g:326:2: iv_ruleAtribuir= ruleAtribuir EOF
            {
             newCompositeNode(grammarAccess.getAtribuirRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAtribuir=ruleAtribuir();

            state._fsp--;

             current =iv_ruleAtribuir; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAtribuir"


    // $ANTLR start "ruleAtribuir"
    // InternalPortugolCoral.g:332:1: ruleAtribuir returns [EObject current=null] : ( () ( (lv_variavel_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_valor_3_0= ruleExpressao ) ) ) ;
    public final EObject ruleAtribuir() throws RecognitionException {
        EObject current = null;

        Token lv_variavel_1_0=null;
        Token otherlv_2=null;
        EObject lv_valor_3_0 = null;



        	enterRule();

        try {
            // InternalPortugolCoral.g:338:2: ( ( () ( (lv_variavel_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_valor_3_0= ruleExpressao ) ) ) )
            // InternalPortugolCoral.g:339:2: ( () ( (lv_variavel_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_valor_3_0= ruleExpressao ) ) )
            {
            // InternalPortugolCoral.g:339:2: ( () ( (lv_variavel_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_valor_3_0= ruleExpressao ) ) )
            // InternalPortugolCoral.g:340:3: () ( (lv_variavel_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_valor_3_0= ruleExpressao ) )
            {
            // InternalPortugolCoral.g:340:3: ()
            // InternalPortugolCoral.g:341:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAtribuirAccess().getAtribuirAction_0(),
            					current);
            			

            }

            // InternalPortugolCoral.g:347:3: ( (lv_variavel_1_0= RULE_ID ) )
            // InternalPortugolCoral.g:348:4: (lv_variavel_1_0= RULE_ID )
            {
            // InternalPortugolCoral.g:348:4: (lv_variavel_1_0= RULE_ID )
            // InternalPortugolCoral.g:349:5: lv_variavel_1_0= RULE_ID
            {
            lv_variavel_1_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(lv_variavel_1_0, grammarAccess.getAtribuirAccess().getVariavelIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAtribuirRule());
            					}
            					setWithLastConsumed(
            						current,
            						"variavel",
            						lv_variavel_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,25,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getAtribuirAccess().getEqualsSignKeyword_2());
            		
            // InternalPortugolCoral.g:369:3: ( (lv_valor_3_0= ruleExpressao ) )
            // InternalPortugolCoral.g:370:4: (lv_valor_3_0= ruleExpressao )
            {
            // InternalPortugolCoral.g:370:4: (lv_valor_3_0= ruleExpressao )
            // InternalPortugolCoral.g:371:5: lv_valor_3_0= ruleExpressao
            {

            					newCompositeNode(grammarAccess.getAtribuirAccess().getValorExpressaoParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_valor_3_0=ruleExpressao();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAtribuirRule());
            					}
            					set(
            						current,
            						"valor",
            						lv_valor_3_0,
            						"org.xtext.coral.PortugolCoral.Expressao");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAtribuir"


    // $ANTLR start "entryRuleExpressao"
    // InternalPortugolCoral.g:392:1: entryRuleExpressao returns [EObject current=null] : iv_ruleExpressao= ruleExpressao EOF ;
    public final EObject entryRuleExpressao() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressao = null;


        try {
            // InternalPortugolCoral.g:392:50: (iv_ruleExpressao= ruleExpressao EOF )
            // InternalPortugolCoral.g:393:2: iv_ruleExpressao= ruleExpressao EOF
            {
             newCompositeNode(grammarAccess.getExpressaoRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpressao=ruleExpressao();

            state._fsp--;

             current =iv_ruleExpressao; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpressao"


    // $ANTLR start "ruleExpressao"
    // InternalPortugolCoral.g:399:1: ruleExpressao returns [EObject current=null] : ( (lv_esquerda_0_0= ruleOu ) ) ;
    public final EObject ruleExpressao() throws RecognitionException {
        EObject current = null;

        EObject lv_esquerda_0_0 = null;



        	enterRule();

        try {
            // InternalPortugolCoral.g:405:2: ( ( (lv_esquerda_0_0= ruleOu ) ) )
            // InternalPortugolCoral.g:406:2: ( (lv_esquerda_0_0= ruleOu ) )
            {
            // InternalPortugolCoral.g:406:2: ( (lv_esquerda_0_0= ruleOu ) )
            // InternalPortugolCoral.g:407:3: (lv_esquerda_0_0= ruleOu )
            {
            // InternalPortugolCoral.g:407:3: (lv_esquerda_0_0= ruleOu )
            // InternalPortugolCoral.g:408:4: lv_esquerda_0_0= ruleOu
            {

            				newCompositeNode(grammarAccess.getExpressaoAccess().getEsquerdaOuParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_esquerda_0_0=ruleOu();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getExpressaoRule());
            				}
            				set(
            					current,
            					"esquerda",
            					lv_esquerda_0_0,
            					"org.xtext.coral.PortugolCoral.Ou");
            				afterParserOrEnumRuleCall();
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpressao"


    // $ANTLR start "entryRuleOu"
    // InternalPortugolCoral.g:428:1: entryRuleOu returns [EObject current=null] : iv_ruleOu= ruleOu EOF ;
    public final EObject entryRuleOu() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOu = null;


        try {
            // InternalPortugolCoral.g:428:43: (iv_ruleOu= ruleOu EOF )
            // InternalPortugolCoral.g:429:2: iv_ruleOu= ruleOu EOF
            {
             newCompositeNode(grammarAccess.getOuRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOu=ruleOu();

            state._fsp--;

             current =iv_ruleOu; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOu"


    // $ANTLR start "ruleOu"
    // InternalPortugolCoral.g:435:1: ruleOu returns [EObject current=null] : (this_E_0= ruleE ( () otherlv_2= 'ou' ( (lv_direita_3_0= ruleE ) ) )* ) ;
    public final EObject ruleOu() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_E_0 = null;

        EObject lv_direita_3_0 = null;



        	enterRule();

        try {
            // InternalPortugolCoral.g:441:2: ( (this_E_0= ruleE ( () otherlv_2= 'ou' ( (lv_direita_3_0= ruleE ) ) )* ) )
            // InternalPortugolCoral.g:442:2: (this_E_0= ruleE ( () otherlv_2= 'ou' ( (lv_direita_3_0= ruleE ) ) )* )
            {
            // InternalPortugolCoral.g:442:2: (this_E_0= ruleE ( () otherlv_2= 'ou' ( (lv_direita_3_0= ruleE ) ) )* )
            // InternalPortugolCoral.g:443:3: this_E_0= ruleE ( () otherlv_2= 'ou' ( (lv_direita_3_0= ruleE ) ) )*
            {

            			newCompositeNode(grammarAccess.getOuAccess().getEParserRuleCall_0());
            		
            pushFollow(FOLLOW_11);
            this_E_0=ruleE();

            state._fsp--;


            			current = this_E_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalPortugolCoral.g:451:3: ( () otherlv_2= 'ou' ( (lv_direita_3_0= ruleE ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==26) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalPortugolCoral.g:452:4: () otherlv_2= 'ou' ( (lv_direita_3_0= ruleE ) )
            	    {
            	    // InternalPortugolCoral.g:452:4: ()
            	    // InternalPortugolCoral.g:453:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getOuAccess().getOuEsquerdaAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,26,FOLLOW_10); 

            	    				newLeafNode(otherlv_2, grammarAccess.getOuAccess().getOuKeyword_1_1());
            	    			
            	    // InternalPortugolCoral.g:463:4: ( (lv_direita_3_0= ruleE ) )
            	    // InternalPortugolCoral.g:464:5: (lv_direita_3_0= ruleE )
            	    {
            	    // InternalPortugolCoral.g:464:5: (lv_direita_3_0= ruleE )
            	    // InternalPortugolCoral.g:465:6: lv_direita_3_0= ruleE
            	    {

            	    						newCompositeNode(grammarAccess.getOuAccess().getDireitaEParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_11);
            	    lv_direita_3_0=ruleE();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getOuRule());
            	    						}
            	    						set(
            	    							current,
            	    							"direita",
            	    							lv_direita_3_0,
            	    							"org.xtext.coral.PortugolCoral.E");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOu"


    // $ANTLR start "entryRuleE"
    // InternalPortugolCoral.g:487:1: entryRuleE returns [EObject current=null] : iv_ruleE= ruleE EOF ;
    public final EObject entryRuleE() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleE = null;


        try {
            // InternalPortugolCoral.g:487:42: (iv_ruleE= ruleE EOF )
            // InternalPortugolCoral.g:488:2: iv_ruleE= ruleE EOF
            {
             newCompositeNode(grammarAccess.getERule()); 
            pushFollow(FOLLOW_1);
            iv_ruleE=ruleE();

            state._fsp--;

             current =iv_ruleE; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleE"


    // $ANTLR start "ruleE"
    // InternalPortugolCoral.g:494:1: ruleE returns [EObject current=null] : (this_Xou_0= ruleXou ( () otherlv_2= 'e' ( (lv_direita_3_0= ruleXou ) ) )* ) ;
    public final EObject ruleE() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Xou_0 = null;

        EObject lv_direita_3_0 = null;



        	enterRule();

        try {
            // InternalPortugolCoral.g:500:2: ( (this_Xou_0= ruleXou ( () otherlv_2= 'e' ( (lv_direita_3_0= ruleXou ) ) )* ) )
            // InternalPortugolCoral.g:501:2: (this_Xou_0= ruleXou ( () otherlv_2= 'e' ( (lv_direita_3_0= ruleXou ) ) )* )
            {
            // InternalPortugolCoral.g:501:2: (this_Xou_0= ruleXou ( () otherlv_2= 'e' ( (lv_direita_3_0= ruleXou ) ) )* )
            // InternalPortugolCoral.g:502:3: this_Xou_0= ruleXou ( () otherlv_2= 'e' ( (lv_direita_3_0= ruleXou ) ) )*
            {

            			newCompositeNode(grammarAccess.getEAccess().getXouParserRuleCall_0());
            		
            pushFollow(FOLLOW_12);
            this_Xou_0=ruleXou();

            state._fsp--;


            			current = this_Xou_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalPortugolCoral.g:510:3: ( () otherlv_2= 'e' ( (lv_direita_3_0= ruleXou ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==27) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalPortugolCoral.g:511:4: () otherlv_2= 'e' ( (lv_direita_3_0= ruleXou ) )
            	    {
            	    // InternalPortugolCoral.g:511:4: ()
            	    // InternalPortugolCoral.g:512:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getEAccess().getEEsquerdaAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,27,FOLLOW_10); 

            	    				newLeafNode(otherlv_2, grammarAccess.getEAccess().getEKeyword_1_1());
            	    			
            	    // InternalPortugolCoral.g:522:4: ( (lv_direita_3_0= ruleXou ) )
            	    // InternalPortugolCoral.g:523:5: (lv_direita_3_0= ruleXou )
            	    {
            	    // InternalPortugolCoral.g:523:5: (lv_direita_3_0= ruleXou )
            	    // InternalPortugolCoral.g:524:6: lv_direita_3_0= ruleXou
            	    {

            	    						newCompositeNode(grammarAccess.getEAccess().getDireitaXouParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_12);
            	    lv_direita_3_0=ruleXou();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getERule());
            	    						}
            	    						set(
            	    							current,
            	    							"direita",
            	    							lv_direita_3_0,
            	    							"org.xtext.coral.PortugolCoral.Xou");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleE"


    // $ANTLR start "entryRuleXou"
    // InternalPortugolCoral.g:546:1: entryRuleXou returns [EObject current=null] : iv_ruleXou= ruleXou EOF ;
    public final EObject entryRuleXou() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXou = null;


        try {
            // InternalPortugolCoral.g:546:44: (iv_ruleXou= ruleXou EOF )
            // InternalPortugolCoral.g:547:2: iv_ruleXou= ruleXou EOF
            {
             newCompositeNode(grammarAccess.getXouRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleXou=ruleXou();

            state._fsp--;

             current =iv_ruleXou; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXou"


    // $ANTLR start "ruleXou"
    // InternalPortugolCoral.g:553:1: ruleXou returns [EObject current=null] : (this_Nao_0= ruleNao ( () otherlv_2= 'xou' ( (lv_direita_3_0= ruleNao ) ) )* ) ;
    public final EObject ruleXou() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Nao_0 = null;

        EObject lv_direita_3_0 = null;



        	enterRule();

        try {
            // InternalPortugolCoral.g:559:2: ( (this_Nao_0= ruleNao ( () otherlv_2= 'xou' ( (lv_direita_3_0= ruleNao ) ) )* ) )
            // InternalPortugolCoral.g:560:2: (this_Nao_0= ruleNao ( () otherlv_2= 'xou' ( (lv_direita_3_0= ruleNao ) ) )* )
            {
            // InternalPortugolCoral.g:560:2: (this_Nao_0= ruleNao ( () otherlv_2= 'xou' ( (lv_direita_3_0= ruleNao ) ) )* )
            // InternalPortugolCoral.g:561:3: this_Nao_0= ruleNao ( () otherlv_2= 'xou' ( (lv_direita_3_0= ruleNao ) ) )*
            {

            			newCompositeNode(grammarAccess.getXouAccess().getNaoParserRuleCall_0());
            		
            pushFollow(FOLLOW_13);
            this_Nao_0=ruleNao();

            state._fsp--;


            			current = this_Nao_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalPortugolCoral.g:569:3: ( () otherlv_2= 'xou' ( (lv_direita_3_0= ruleNao ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==28) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalPortugolCoral.g:570:4: () otherlv_2= 'xou' ( (lv_direita_3_0= ruleNao ) )
            	    {
            	    // InternalPortugolCoral.g:570:4: ()
            	    // InternalPortugolCoral.g:571:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getXouAccess().getXouEsquerdaAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,28,FOLLOW_10); 

            	    				newLeafNode(otherlv_2, grammarAccess.getXouAccess().getXouKeyword_1_1());
            	    			
            	    // InternalPortugolCoral.g:581:4: ( (lv_direita_3_0= ruleNao ) )
            	    // InternalPortugolCoral.g:582:5: (lv_direita_3_0= ruleNao )
            	    {
            	    // InternalPortugolCoral.g:582:5: (lv_direita_3_0= ruleNao )
            	    // InternalPortugolCoral.g:583:6: lv_direita_3_0= ruleNao
            	    {

            	    						newCompositeNode(grammarAccess.getXouAccess().getDireitaNaoParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_13);
            	    lv_direita_3_0=ruleNao();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getXouRule());
            	    						}
            	    						set(
            	    							current,
            	    							"direita",
            	    							lv_direita_3_0,
            	    							"org.xtext.coral.PortugolCoral.Nao");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXou"


    // $ANTLR start "entryRuleNao"
    // InternalPortugolCoral.g:605:1: entryRuleNao returns [EObject current=null] : iv_ruleNao= ruleNao EOF ;
    public final EObject entryRuleNao() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNao = null;


        try {
            // InternalPortugolCoral.g:605:44: (iv_ruleNao= ruleNao EOF )
            // InternalPortugolCoral.g:606:2: iv_ruleNao= ruleNao EOF
            {
             newCompositeNode(grammarAccess.getNaoRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNao=ruleNao();

            state._fsp--;

             current =iv_ruleNao; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNao"


    // $ANTLR start "ruleNao"
    // InternalPortugolCoral.g:612:1: ruleNao returns [EObject current=null] : ( ( ( (lv_naos_0_1= 'nao' | lv_naos_0_2= 'n\\u00E3o' ) ) )* ( (lv_direita_1_0= ruleComparacao ) ) ) ;
    public final EObject ruleNao() throws RecognitionException {
        EObject current = null;

        Token lv_naos_0_1=null;
        Token lv_naos_0_2=null;
        EObject lv_direita_1_0 = null;



        	enterRule();

        try {
            // InternalPortugolCoral.g:618:2: ( ( ( ( (lv_naos_0_1= 'nao' | lv_naos_0_2= 'n\\u00E3o' ) ) )* ( (lv_direita_1_0= ruleComparacao ) ) ) )
            // InternalPortugolCoral.g:619:2: ( ( ( (lv_naos_0_1= 'nao' | lv_naos_0_2= 'n\\u00E3o' ) ) )* ( (lv_direita_1_0= ruleComparacao ) ) )
            {
            // InternalPortugolCoral.g:619:2: ( ( ( (lv_naos_0_1= 'nao' | lv_naos_0_2= 'n\\u00E3o' ) ) )* ( (lv_direita_1_0= ruleComparacao ) ) )
            // InternalPortugolCoral.g:620:3: ( ( (lv_naos_0_1= 'nao' | lv_naos_0_2= 'n\\u00E3o' ) ) )* ( (lv_direita_1_0= ruleComparacao ) )
            {
            // InternalPortugolCoral.g:620:3: ( ( (lv_naos_0_1= 'nao' | lv_naos_0_2= 'n\\u00E3o' ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=29 && LA11_0<=30)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalPortugolCoral.g:621:4: ( (lv_naos_0_1= 'nao' | lv_naos_0_2= 'n\\u00E3o' ) )
            	    {
            	    // InternalPortugolCoral.g:621:4: ( (lv_naos_0_1= 'nao' | lv_naos_0_2= 'n\\u00E3o' ) )
            	    // InternalPortugolCoral.g:622:5: (lv_naos_0_1= 'nao' | lv_naos_0_2= 'n\\u00E3o' )
            	    {
            	    // InternalPortugolCoral.g:622:5: (lv_naos_0_1= 'nao' | lv_naos_0_2= 'n\\u00E3o' )
            	    int alt10=2;
            	    int LA10_0 = input.LA(1);

            	    if ( (LA10_0==29) ) {
            	        alt10=1;
            	    }
            	    else if ( (LA10_0==30) ) {
            	        alt10=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 10, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt10) {
            	        case 1 :
            	            // InternalPortugolCoral.g:623:6: lv_naos_0_1= 'nao'
            	            {
            	            lv_naos_0_1=(Token)match(input,29,FOLLOW_10); 

            	            						newLeafNode(lv_naos_0_1, grammarAccess.getNaoAccess().getNaosNaoKeyword_0_0_0());
            	            					

            	            						if (current==null) {
            	            							current = createModelElement(grammarAccess.getNaoRule());
            	            						}
            	            						addWithLastConsumed(current, "naos", lv_naos_0_1, null);
            	            					

            	            }
            	            break;
            	        case 2 :
            	            // InternalPortugolCoral.g:634:6: lv_naos_0_2= 'n\\u00E3o'
            	            {
            	            lv_naos_0_2=(Token)match(input,30,FOLLOW_10); 

            	            						newLeafNode(lv_naos_0_2, grammarAccess.getNaoAccess().getNaosNOKeyword_0_0_1());
            	            					

            	            						if (current==null) {
            	            							current = createModelElement(grammarAccess.getNaoRule());
            	            						}
            	            						addWithLastConsumed(current, "naos", lv_naos_0_2, null);
            	            					

            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            // InternalPortugolCoral.g:647:3: ( (lv_direita_1_0= ruleComparacao ) )
            // InternalPortugolCoral.g:648:4: (lv_direita_1_0= ruleComparacao )
            {
            // InternalPortugolCoral.g:648:4: (lv_direita_1_0= ruleComparacao )
            // InternalPortugolCoral.g:649:5: lv_direita_1_0= ruleComparacao
            {

            					newCompositeNode(grammarAccess.getNaoAccess().getDireitaComparacaoParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_direita_1_0=ruleComparacao();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNaoRule());
            					}
            					set(
            						current,
            						"direita",
            						lv_direita_1_0,
            						"org.xtext.coral.PortugolCoral.Comparacao");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNao"


    // $ANTLR start "entryRuleComparacao"
    // InternalPortugolCoral.g:670:1: entryRuleComparacao returns [EObject current=null] : iv_ruleComparacao= ruleComparacao EOF ;
    public final EObject entryRuleComparacao() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparacao = null;


        try {
            // InternalPortugolCoral.g:670:51: (iv_ruleComparacao= ruleComparacao EOF )
            // InternalPortugolCoral.g:671:2: iv_ruleComparacao= ruleComparacao EOF
            {
             newCompositeNode(grammarAccess.getComparacaoRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComparacao=ruleComparacao();

            state._fsp--;

             current =iv_ruleComparacao; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleComparacao"


    // $ANTLR start "ruleComparacao"
    // InternalPortugolCoral.g:677:1: ruleComparacao returns [EObject current=null] : (this_AdicaoOuSubtracao_0= ruleAdicaoOuSubtracao ( () ( ( (lv_comparacao_2_1= '<=' | lv_comparacao_2_2= '==' | lv_comparacao_2_3= '>=' | lv_comparacao_2_4= '<' | lv_comparacao_2_5= '>' | lv_comparacao_2_6= '!=' ) ) ) ( (lv_direita_3_0= ruleAdicaoOuSubtracao ) ) )* ) ;
    public final EObject ruleComparacao() throws RecognitionException {
        EObject current = null;

        Token lv_comparacao_2_1=null;
        Token lv_comparacao_2_2=null;
        Token lv_comparacao_2_3=null;
        Token lv_comparacao_2_4=null;
        Token lv_comparacao_2_5=null;
        Token lv_comparacao_2_6=null;
        EObject this_AdicaoOuSubtracao_0 = null;

        EObject lv_direita_3_0 = null;



        	enterRule();

        try {
            // InternalPortugolCoral.g:683:2: ( (this_AdicaoOuSubtracao_0= ruleAdicaoOuSubtracao ( () ( ( (lv_comparacao_2_1= '<=' | lv_comparacao_2_2= '==' | lv_comparacao_2_3= '>=' | lv_comparacao_2_4= '<' | lv_comparacao_2_5= '>' | lv_comparacao_2_6= '!=' ) ) ) ( (lv_direita_3_0= ruleAdicaoOuSubtracao ) ) )* ) )
            // InternalPortugolCoral.g:684:2: (this_AdicaoOuSubtracao_0= ruleAdicaoOuSubtracao ( () ( ( (lv_comparacao_2_1= '<=' | lv_comparacao_2_2= '==' | lv_comparacao_2_3= '>=' | lv_comparacao_2_4= '<' | lv_comparacao_2_5= '>' | lv_comparacao_2_6= '!=' ) ) ) ( (lv_direita_3_0= ruleAdicaoOuSubtracao ) ) )* )
            {
            // InternalPortugolCoral.g:684:2: (this_AdicaoOuSubtracao_0= ruleAdicaoOuSubtracao ( () ( ( (lv_comparacao_2_1= '<=' | lv_comparacao_2_2= '==' | lv_comparacao_2_3= '>=' | lv_comparacao_2_4= '<' | lv_comparacao_2_5= '>' | lv_comparacao_2_6= '!=' ) ) ) ( (lv_direita_3_0= ruleAdicaoOuSubtracao ) ) )* )
            // InternalPortugolCoral.g:685:3: this_AdicaoOuSubtracao_0= ruleAdicaoOuSubtracao ( () ( ( (lv_comparacao_2_1= '<=' | lv_comparacao_2_2= '==' | lv_comparacao_2_3= '>=' | lv_comparacao_2_4= '<' | lv_comparacao_2_5= '>' | lv_comparacao_2_6= '!=' ) ) ) ( (lv_direita_3_0= ruleAdicaoOuSubtracao ) ) )*
            {

            			newCompositeNode(grammarAccess.getComparacaoAccess().getAdicaoOuSubtracaoParserRuleCall_0());
            		
            pushFollow(FOLLOW_14);
            this_AdicaoOuSubtracao_0=ruleAdicaoOuSubtracao();

            state._fsp--;


            			current = this_AdicaoOuSubtracao_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalPortugolCoral.g:693:3: ( () ( ( (lv_comparacao_2_1= '<=' | lv_comparacao_2_2= '==' | lv_comparacao_2_3= '>=' | lv_comparacao_2_4= '<' | lv_comparacao_2_5= '>' | lv_comparacao_2_6= '!=' ) ) ) ( (lv_direita_3_0= ruleAdicaoOuSubtracao ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=31 && LA13_0<=36)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalPortugolCoral.g:694:4: () ( ( (lv_comparacao_2_1= '<=' | lv_comparacao_2_2= '==' | lv_comparacao_2_3= '>=' | lv_comparacao_2_4= '<' | lv_comparacao_2_5= '>' | lv_comparacao_2_6= '!=' ) ) ) ( (lv_direita_3_0= ruleAdicaoOuSubtracao ) )
            	    {
            	    // InternalPortugolCoral.g:694:4: ()
            	    // InternalPortugolCoral.g:695:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getComparacaoAccess().getComparacaoEsquerdaAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalPortugolCoral.g:701:4: ( ( (lv_comparacao_2_1= '<=' | lv_comparacao_2_2= '==' | lv_comparacao_2_3= '>=' | lv_comparacao_2_4= '<' | lv_comparacao_2_5= '>' | lv_comparacao_2_6= '!=' ) ) )
            	    // InternalPortugolCoral.g:702:5: ( (lv_comparacao_2_1= '<=' | lv_comparacao_2_2= '==' | lv_comparacao_2_3= '>=' | lv_comparacao_2_4= '<' | lv_comparacao_2_5= '>' | lv_comparacao_2_6= '!=' ) )
            	    {
            	    // InternalPortugolCoral.g:702:5: ( (lv_comparacao_2_1= '<=' | lv_comparacao_2_2= '==' | lv_comparacao_2_3= '>=' | lv_comparacao_2_4= '<' | lv_comparacao_2_5= '>' | lv_comparacao_2_6= '!=' ) )
            	    // InternalPortugolCoral.g:703:6: (lv_comparacao_2_1= '<=' | lv_comparacao_2_2= '==' | lv_comparacao_2_3= '>=' | lv_comparacao_2_4= '<' | lv_comparacao_2_5= '>' | lv_comparacao_2_6= '!=' )
            	    {
            	    // InternalPortugolCoral.g:703:6: (lv_comparacao_2_1= '<=' | lv_comparacao_2_2= '==' | lv_comparacao_2_3= '>=' | lv_comparacao_2_4= '<' | lv_comparacao_2_5= '>' | lv_comparacao_2_6= '!=' )
            	    int alt12=6;
            	    switch ( input.LA(1) ) {
            	    case 31:
            	        {
            	        alt12=1;
            	        }
            	        break;
            	    case 32:
            	        {
            	        alt12=2;
            	        }
            	        break;
            	    case 33:
            	        {
            	        alt12=3;
            	        }
            	        break;
            	    case 34:
            	        {
            	        alt12=4;
            	        }
            	        break;
            	    case 35:
            	        {
            	        alt12=5;
            	        }
            	        break;
            	    case 36:
            	        {
            	        alt12=6;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 12, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt12) {
            	        case 1 :
            	            // InternalPortugolCoral.g:704:7: lv_comparacao_2_1= '<='
            	            {
            	            lv_comparacao_2_1=(Token)match(input,31,FOLLOW_10); 

            	            							newLeafNode(lv_comparacao_2_1, grammarAccess.getComparacaoAccess().getComparacaoLessThanSignEqualsSignKeyword_1_1_0_0());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getComparacaoRule());
            	            							}
            	            							setWithLastConsumed(current, "comparacao", lv_comparacao_2_1, null);
            	            						

            	            }
            	            break;
            	        case 2 :
            	            // InternalPortugolCoral.g:715:7: lv_comparacao_2_2= '=='
            	            {
            	            lv_comparacao_2_2=(Token)match(input,32,FOLLOW_10); 

            	            							newLeafNode(lv_comparacao_2_2, grammarAccess.getComparacaoAccess().getComparacaoEqualsSignEqualsSignKeyword_1_1_0_1());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getComparacaoRule());
            	            							}
            	            							setWithLastConsumed(current, "comparacao", lv_comparacao_2_2, null);
            	            						

            	            }
            	            break;
            	        case 3 :
            	            // InternalPortugolCoral.g:726:7: lv_comparacao_2_3= '>='
            	            {
            	            lv_comparacao_2_3=(Token)match(input,33,FOLLOW_10); 

            	            							newLeafNode(lv_comparacao_2_3, grammarAccess.getComparacaoAccess().getComparacaoGreaterThanSignEqualsSignKeyword_1_1_0_2());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getComparacaoRule());
            	            							}
            	            							setWithLastConsumed(current, "comparacao", lv_comparacao_2_3, null);
            	            						

            	            }
            	            break;
            	        case 4 :
            	            // InternalPortugolCoral.g:737:7: lv_comparacao_2_4= '<'
            	            {
            	            lv_comparacao_2_4=(Token)match(input,34,FOLLOW_10); 

            	            							newLeafNode(lv_comparacao_2_4, grammarAccess.getComparacaoAccess().getComparacaoLessThanSignKeyword_1_1_0_3());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getComparacaoRule());
            	            							}
            	            							setWithLastConsumed(current, "comparacao", lv_comparacao_2_4, null);
            	            						

            	            }
            	            break;
            	        case 5 :
            	            // InternalPortugolCoral.g:748:7: lv_comparacao_2_5= '>'
            	            {
            	            lv_comparacao_2_5=(Token)match(input,35,FOLLOW_10); 

            	            							newLeafNode(lv_comparacao_2_5, grammarAccess.getComparacaoAccess().getComparacaoGreaterThanSignKeyword_1_1_0_4());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getComparacaoRule());
            	            							}
            	            							setWithLastConsumed(current, "comparacao", lv_comparacao_2_5, null);
            	            						

            	            }
            	            break;
            	        case 6 :
            	            // InternalPortugolCoral.g:759:7: lv_comparacao_2_6= '!='
            	            {
            	            lv_comparacao_2_6=(Token)match(input,36,FOLLOW_10); 

            	            							newLeafNode(lv_comparacao_2_6, grammarAccess.getComparacaoAccess().getComparacaoExclamationMarkEqualsSignKeyword_1_1_0_5());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getComparacaoRule());
            	            							}
            	            							setWithLastConsumed(current, "comparacao", lv_comparacao_2_6, null);
            	            						

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // InternalPortugolCoral.g:772:4: ( (lv_direita_3_0= ruleAdicaoOuSubtracao ) )
            	    // InternalPortugolCoral.g:773:5: (lv_direita_3_0= ruleAdicaoOuSubtracao )
            	    {
            	    // InternalPortugolCoral.g:773:5: (lv_direita_3_0= ruleAdicaoOuSubtracao )
            	    // InternalPortugolCoral.g:774:6: lv_direita_3_0= ruleAdicaoOuSubtracao
            	    {

            	    						newCompositeNode(grammarAccess.getComparacaoAccess().getDireitaAdicaoOuSubtracaoParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_14);
            	    lv_direita_3_0=ruleAdicaoOuSubtracao();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getComparacaoRule());
            	    						}
            	    						set(
            	    							current,
            	    							"direita",
            	    							lv_direita_3_0,
            	    							"org.xtext.coral.PortugolCoral.AdicaoOuSubtracao");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComparacao"


    // $ANTLR start "entryRuleAdicaoOuSubtracao"
    // InternalPortugolCoral.g:796:1: entryRuleAdicaoOuSubtracao returns [EObject current=null] : iv_ruleAdicaoOuSubtracao= ruleAdicaoOuSubtracao EOF ;
    public final EObject entryRuleAdicaoOuSubtracao() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdicaoOuSubtracao = null;


        try {
            // InternalPortugolCoral.g:796:58: (iv_ruleAdicaoOuSubtracao= ruleAdicaoOuSubtracao EOF )
            // InternalPortugolCoral.g:797:2: iv_ruleAdicaoOuSubtracao= ruleAdicaoOuSubtracao EOF
            {
             newCompositeNode(grammarAccess.getAdicaoOuSubtracaoRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAdicaoOuSubtracao=ruleAdicaoOuSubtracao();

            state._fsp--;

             current =iv_ruleAdicaoOuSubtracao; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAdicaoOuSubtracao"


    // $ANTLR start "ruleAdicaoOuSubtracao"
    // InternalPortugolCoral.g:803:1: ruleAdicaoOuSubtracao returns [EObject current=null] : (this_MultiplicacaoOuDivisao_0= ruleMultiplicacaoOuDivisao ( () ( ( (lv_operacao_2_1= '+' | lv_operacao_2_2= '-' ) ) ) ( (lv_direita_3_0= ruleMultiplicacaoOuDivisao ) ) )* ) ;
    public final EObject ruleAdicaoOuSubtracao() throws RecognitionException {
        EObject current = null;

        Token lv_operacao_2_1=null;
        Token lv_operacao_2_2=null;
        EObject this_MultiplicacaoOuDivisao_0 = null;

        EObject lv_direita_3_0 = null;



        	enterRule();

        try {
            // InternalPortugolCoral.g:809:2: ( (this_MultiplicacaoOuDivisao_0= ruleMultiplicacaoOuDivisao ( () ( ( (lv_operacao_2_1= '+' | lv_operacao_2_2= '-' ) ) ) ( (lv_direita_3_0= ruleMultiplicacaoOuDivisao ) ) )* ) )
            // InternalPortugolCoral.g:810:2: (this_MultiplicacaoOuDivisao_0= ruleMultiplicacaoOuDivisao ( () ( ( (lv_operacao_2_1= '+' | lv_operacao_2_2= '-' ) ) ) ( (lv_direita_3_0= ruleMultiplicacaoOuDivisao ) ) )* )
            {
            // InternalPortugolCoral.g:810:2: (this_MultiplicacaoOuDivisao_0= ruleMultiplicacaoOuDivisao ( () ( ( (lv_operacao_2_1= '+' | lv_operacao_2_2= '-' ) ) ) ( (lv_direita_3_0= ruleMultiplicacaoOuDivisao ) ) )* )
            // InternalPortugolCoral.g:811:3: this_MultiplicacaoOuDivisao_0= ruleMultiplicacaoOuDivisao ( () ( ( (lv_operacao_2_1= '+' | lv_operacao_2_2= '-' ) ) ) ( (lv_direita_3_0= ruleMultiplicacaoOuDivisao ) ) )*
            {

            			newCompositeNode(grammarAccess.getAdicaoOuSubtracaoAccess().getMultiplicacaoOuDivisaoParserRuleCall_0());
            		
            pushFollow(FOLLOW_15);
            this_MultiplicacaoOuDivisao_0=ruleMultiplicacaoOuDivisao();

            state._fsp--;


            			current = this_MultiplicacaoOuDivisao_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalPortugolCoral.g:819:3: ( () ( ( (lv_operacao_2_1= '+' | lv_operacao_2_2= '-' ) ) ) ( (lv_direita_3_0= ruleMultiplicacaoOuDivisao ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>=37 && LA15_0<=38)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalPortugolCoral.g:820:4: () ( ( (lv_operacao_2_1= '+' | lv_operacao_2_2= '-' ) ) ) ( (lv_direita_3_0= ruleMultiplicacaoOuDivisao ) )
            	    {
            	    // InternalPortugolCoral.g:820:4: ()
            	    // InternalPortugolCoral.g:821:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getAdicaoOuSubtracaoAccess().getAdicaoOuSubtracaoEsquerdaAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalPortugolCoral.g:827:4: ( ( (lv_operacao_2_1= '+' | lv_operacao_2_2= '-' ) ) )
            	    // InternalPortugolCoral.g:828:5: ( (lv_operacao_2_1= '+' | lv_operacao_2_2= '-' ) )
            	    {
            	    // InternalPortugolCoral.g:828:5: ( (lv_operacao_2_1= '+' | lv_operacao_2_2= '-' ) )
            	    // InternalPortugolCoral.g:829:6: (lv_operacao_2_1= '+' | lv_operacao_2_2= '-' )
            	    {
            	    // InternalPortugolCoral.g:829:6: (lv_operacao_2_1= '+' | lv_operacao_2_2= '-' )
            	    int alt14=2;
            	    int LA14_0 = input.LA(1);

            	    if ( (LA14_0==37) ) {
            	        alt14=1;
            	    }
            	    else if ( (LA14_0==38) ) {
            	        alt14=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 14, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt14) {
            	        case 1 :
            	            // InternalPortugolCoral.g:830:7: lv_operacao_2_1= '+'
            	            {
            	            lv_operacao_2_1=(Token)match(input,37,FOLLOW_10); 

            	            							newLeafNode(lv_operacao_2_1, grammarAccess.getAdicaoOuSubtracaoAccess().getOperacaoPlusSignKeyword_1_1_0_0());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getAdicaoOuSubtracaoRule());
            	            							}
            	            							setWithLastConsumed(current, "operacao", lv_operacao_2_1, null);
            	            						

            	            }
            	            break;
            	        case 2 :
            	            // InternalPortugolCoral.g:841:7: lv_operacao_2_2= '-'
            	            {
            	            lv_operacao_2_2=(Token)match(input,38,FOLLOW_10); 

            	            							newLeafNode(lv_operacao_2_2, grammarAccess.getAdicaoOuSubtracaoAccess().getOperacaoHyphenMinusKeyword_1_1_0_1());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getAdicaoOuSubtracaoRule());
            	            							}
            	            							setWithLastConsumed(current, "operacao", lv_operacao_2_2, null);
            	            						

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // InternalPortugolCoral.g:854:4: ( (lv_direita_3_0= ruleMultiplicacaoOuDivisao ) )
            	    // InternalPortugolCoral.g:855:5: (lv_direita_3_0= ruleMultiplicacaoOuDivisao )
            	    {
            	    // InternalPortugolCoral.g:855:5: (lv_direita_3_0= ruleMultiplicacaoOuDivisao )
            	    // InternalPortugolCoral.g:856:6: lv_direita_3_0= ruleMultiplicacaoOuDivisao
            	    {

            	    						newCompositeNode(grammarAccess.getAdicaoOuSubtracaoAccess().getDireitaMultiplicacaoOuDivisaoParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_15);
            	    lv_direita_3_0=ruleMultiplicacaoOuDivisao();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAdicaoOuSubtracaoRule());
            	    						}
            	    						set(
            	    							current,
            	    							"direita",
            	    							lv_direita_3_0,
            	    							"org.xtext.coral.PortugolCoral.MultiplicacaoOuDivisao");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAdicaoOuSubtracao"


    // $ANTLR start "entryRuleMultiplicacaoOuDivisao"
    // InternalPortugolCoral.g:878:1: entryRuleMultiplicacaoOuDivisao returns [EObject current=null] : iv_ruleMultiplicacaoOuDivisao= ruleMultiplicacaoOuDivisao EOF ;
    public final EObject entryRuleMultiplicacaoOuDivisao() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplicacaoOuDivisao = null;


        try {
            // InternalPortugolCoral.g:878:63: (iv_ruleMultiplicacaoOuDivisao= ruleMultiplicacaoOuDivisao EOF )
            // InternalPortugolCoral.g:879:2: iv_ruleMultiplicacaoOuDivisao= ruleMultiplicacaoOuDivisao EOF
            {
             newCompositeNode(grammarAccess.getMultiplicacaoOuDivisaoRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMultiplicacaoOuDivisao=ruleMultiplicacaoOuDivisao();

            state._fsp--;

             current =iv_ruleMultiplicacaoOuDivisao; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMultiplicacaoOuDivisao"


    // $ANTLR start "ruleMultiplicacaoOuDivisao"
    // InternalPortugolCoral.g:885:1: ruleMultiplicacaoOuDivisao returns [EObject current=null] : (this_Sinal_0= ruleSinal ( () ( ( (lv_operacao_2_1= '*' | lv_operacao_2_2= '/' | lv_operacao_2_3= '//' | lv_operacao_2_4= '%' ) ) ) ( (lv_direita_3_0= ruleSinal ) ) )* ) ;
    public final EObject ruleMultiplicacaoOuDivisao() throws RecognitionException {
        EObject current = null;

        Token lv_operacao_2_1=null;
        Token lv_operacao_2_2=null;
        Token lv_operacao_2_3=null;
        Token lv_operacao_2_4=null;
        EObject this_Sinal_0 = null;

        EObject lv_direita_3_0 = null;



        	enterRule();

        try {
            // InternalPortugolCoral.g:891:2: ( (this_Sinal_0= ruleSinal ( () ( ( (lv_operacao_2_1= '*' | lv_operacao_2_2= '/' | lv_operacao_2_3= '//' | lv_operacao_2_4= '%' ) ) ) ( (lv_direita_3_0= ruleSinal ) ) )* ) )
            // InternalPortugolCoral.g:892:2: (this_Sinal_0= ruleSinal ( () ( ( (lv_operacao_2_1= '*' | lv_operacao_2_2= '/' | lv_operacao_2_3= '//' | lv_operacao_2_4= '%' ) ) ) ( (lv_direita_3_0= ruleSinal ) ) )* )
            {
            // InternalPortugolCoral.g:892:2: (this_Sinal_0= ruleSinal ( () ( ( (lv_operacao_2_1= '*' | lv_operacao_2_2= '/' | lv_operacao_2_3= '//' | lv_operacao_2_4= '%' ) ) ) ( (lv_direita_3_0= ruleSinal ) ) )* )
            // InternalPortugolCoral.g:893:3: this_Sinal_0= ruleSinal ( () ( ( (lv_operacao_2_1= '*' | lv_operacao_2_2= '/' | lv_operacao_2_3= '//' | lv_operacao_2_4= '%' ) ) ) ( (lv_direita_3_0= ruleSinal ) ) )*
            {

            			newCompositeNode(grammarAccess.getMultiplicacaoOuDivisaoAccess().getSinalParserRuleCall_0());
            		
            pushFollow(FOLLOW_16);
            this_Sinal_0=ruleSinal();

            state._fsp--;


            			current = this_Sinal_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalPortugolCoral.g:901:3: ( () ( ( (lv_operacao_2_1= '*' | lv_operacao_2_2= '/' | lv_operacao_2_3= '//' | lv_operacao_2_4= '%' ) ) ) ( (lv_direita_3_0= ruleSinal ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>=39 && LA17_0<=42)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalPortugolCoral.g:902:4: () ( ( (lv_operacao_2_1= '*' | lv_operacao_2_2= '/' | lv_operacao_2_3= '//' | lv_operacao_2_4= '%' ) ) ) ( (lv_direita_3_0= ruleSinal ) )
            	    {
            	    // InternalPortugolCoral.g:902:4: ()
            	    // InternalPortugolCoral.g:903:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getMultiplicacaoOuDivisaoAccess().getMultiplicacaoOuDivisaoEsquerdaAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalPortugolCoral.g:909:4: ( ( (lv_operacao_2_1= '*' | lv_operacao_2_2= '/' | lv_operacao_2_3= '//' | lv_operacao_2_4= '%' ) ) )
            	    // InternalPortugolCoral.g:910:5: ( (lv_operacao_2_1= '*' | lv_operacao_2_2= '/' | lv_operacao_2_3= '//' | lv_operacao_2_4= '%' ) )
            	    {
            	    // InternalPortugolCoral.g:910:5: ( (lv_operacao_2_1= '*' | lv_operacao_2_2= '/' | lv_operacao_2_3= '//' | lv_operacao_2_4= '%' ) )
            	    // InternalPortugolCoral.g:911:6: (lv_operacao_2_1= '*' | lv_operacao_2_2= '/' | lv_operacao_2_3= '//' | lv_operacao_2_4= '%' )
            	    {
            	    // InternalPortugolCoral.g:911:6: (lv_operacao_2_1= '*' | lv_operacao_2_2= '/' | lv_operacao_2_3= '//' | lv_operacao_2_4= '%' )
            	    int alt16=4;
            	    switch ( input.LA(1) ) {
            	    case 39:
            	        {
            	        alt16=1;
            	        }
            	        break;
            	    case 40:
            	        {
            	        alt16=2;
            	        }
            	        break;
            	    case 41:
            	        {
            	        alt16=3;
            	        }
            	        break;
            	    case 42:
            	        {
            	        alt16=4;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 16, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt16) {
            	        case 1 :
            	            // InternalPortugolCoral.g:912:7: lv_operacao_2_1= '*'
            	            {
            	            lv_operacao_2_1=(Token)match(input,39,FOLLOW_10); 

            	            							newLeafNode(lv_operacao_2_1, grammarAccess.getMultiplicacaoOuDivisaoAccess().getOperacaoAsteriskKeyword_1_1_0_0());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getMultiplicacaoOuDivisaoRule());
            	            							}
            	            							setWithLastConsumed(current, "operacao", lv_operacao_2_1, null);
            	            						

            	            }
            	            break;
            	        case 2 :
            	            // InternalPortugolCoral.g:923:7: lv_operacao_2_2= '/'
            	            {
            	            lv_operacao_2_2=(Token)match(input,40,FOLLOW_10); 

            	            							newLeafNode(lv_operacao_2_2, grammarAccess.getMultiplicacaoOuDivisaoAccess().getOperacaoSolidusKeyword_1_1_0_1());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getMultiplicacaoOuDivisaoRule());
            	            							}
            	            							setWithLastConsumed(current, "operacao", lv_operacao_2_2, null);
            	            						

            	            }
            	            break;
            	        case 3 :
            	            // InternalPortugolCoral.g:934:7: lv_operacao_2_3= '//'
            	            {
            	            lv_operacao_2_3=(Token)match(input,41,FOLLOW_10); 

            	            							newLeafNode(lv_operacao_2_3, grammarAccess.getMultiplicacaoOuDivisaoAccess().getOperacaoSolidusSolidusKeyword_1_1_0_2());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getMultiplicacaoOuDivisaoRule());
            	            							}
            	            							setWithLastConsumed(current, "operacao", lv_operacao_2_3, null);
            	            						

            	            }
            	            break;
            	        case 4 :
            	            // InternalPortugolCoral.g:945:7: lv_operacao_2_4= '%'
            	            {
            	            lv_operacao_2_4=(Token)match(input,42,FOLLOW_10); 

            	            							newLeafNode(lv_operacao_2_4, grammarAccess.getMultiplicacaoOuDivisaoAccess().getOperacaoPercentSignKeyword_1_1_0_3());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getMultiplicacaoOuDivisaoRule());
            	            							}
            	            							setWithLastConsumed(current, "operacao", lv_operacao_2_4, null);
            	            						

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // InternalPortugolCoral.g:958:4: ( (lv_direita_3_0= ruleSinal ) )
            	    // InternalPortugolCoral.g:959:5: (lv_direita_3_0= ruleSinal )
            	    {
            	    // InternalPortugolCoral.g:959:5: (lv_direita_3_0= ruleSinal )
            	    // InternalPortugolCoral.g:960:6: lv_direita_3_0= ruleSinal
            	    {

            	    						newCompositeNode(grammarAccess.getMultiplicacaoOuDivisaoAccess().getDireitaSinalParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_16);
            	    lv_direita_3_0=ruleSinal();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getMultiplicacaoOuDivisaoRule());
            	    						}
            	    						set(
            	    							current,
            	    							"direita",
            	    							lv_direita_3_0,
            	    							"org.xtext.coral.PortugolCoral.Sinal");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMultiplicacaoOuDivisao"


    // $ANTLR start "entryRuleSinal"
    // InternalPortugolCoral.g:982:1: entryRuleSinal returns [EObject current=null] : iv_ruleSinal= ruleSinal EOF ;
    public final EObject entryRuleSinal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSinal = null;


        try {
            // InternalPortugolCoral.g:982:46: (iv_ruleSinal= ruleSinal EOF )
            // InternalPortugolCoral.g:983:2: iv_ruleSinal= ruleSinal EOF
            {
             newCompositeNode(grammarAccess.getSinalRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSinal=ruleSinal();

            state._fsp--;

             current =iv_ruleSinal; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSinal"


    // $ANTLR start "ruleSinal"
    // InternalPortugolCoral.g:989:1: ruleSinal returns [EObject current=null] : ( ( ( (lv_sinais_0_1= '+' | lv_sinais_0_2= '-' ) ) )* ( (lv_direita_1_0= ruleExponenciacao ) ) ) ;
    public final EObject ruleSinal() throws RecognitionException {
        EObject current = null;

        Token lv_sinais_0_1=null;
        Token lv_sinais_0_2=null;
        EObject lv_direita_1_0 = null;



        	enterRule();

        try {
            // InternalPortugolCoral.g:995:2: ( ( ( ( (lv_sinais_0_1= '+' | lv_sinais_0_2= '-' ) ) )* ( (lv_direita_1_0= ruleExponenciacao ) ) ) )
            // InternalPortugolCoral.g:996:2: ( ( ( (lv_sinais_0_1= '+' | lv_sinais_0_2= '-' ) ) )* ( (lv_direita_1_0= ruleExponenciacao ) ) )
            {
            // InternalPortugolCoral.g:996:2: ( ( ( (lv_sinais_0_1= '+' | lv_sinais_0_2= '-' ) ) )* ( (lv_direita_1_0= ruleExponenciacao ) ) )
            // InternalPortugolCoral.g:997:3: ( ( (lv_sinais_0_1= '+' | lv_sinais_0_2= '-' ) ) )* ( (lv_direita_1_0= ruleExponenciacao ) )
            {
            // InternalPortugolCoral.g:997:3: ( ( (lv_sinais_0_1= '+' | lv_sinais_0_2= '-' ) ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>=37 && LA19_0<=38)) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalPortugolCoral.g:998:4: ( (lv_sinais_0_1= '+' | lv_sinais_0_2= '-' ) )
            	    {
            	    // InternalPortugolCoral.g:998:4: ( (lv_sinais_0_1= '+' | lv_sinais_0_2= '-' ) )
            	    // InternalPortugolCoral.g:999:5: (lv_sinais_0_1= '+' | lv_sinais_0_2= '-' )
            	    {
            	    // InternalPortugolCoral.g:999:5: (lv_sinais_0_1= '+' | lv_sinais_0_2= '-' )
            	    int alt18=2;
            	    int LA18_0 = input.LA(1);

            	    if ( (LA18_0==37) ) {
            	        alt18=1;
            	    }
            	    else if ( (LA18_0==38) ) {
            	        alt18=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 18, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt18) {
            	        case 1 :
            	            // InternalPortugolCoral.g:1000:6: lv_sinais_0_1= '+'
            	            {
            	            lv_sinais_0_1=(Token)match(input,37,FOLLOW_10); 

            	            						newLeafNode(lv_sinais_0_1, grammarAccess.getSinalAccess().getSinaisPlusSignKeyword_0_0_0());
            	            					

            	            						if (current==null) {
            	            							current = createModelElement(grammarAccess.getSinalRule());
            	            						}
            	            						addWithLastConsumed(current, "sinais", lv_sinais_0_1, null);
            	            					

            	            }
            	            break;
            	        case 2 :
            	            // InternalPortugolCoral.g:1011:6: lv_sinais_0_2= '-'
            	            {
            	            lv_sinais_0_2=(Token)match(input,38,FOLLOW_10); 

            	            						newLeafNode(lv_sinais_0_2, grammarAccess.getSinalAccess().getSinaisHyphenMinusKeyword_0_0_1());
            	            					

            	            						if (current==null) {
            	            							current = createModelElement(grammarAccess.getSinalRule());
            	            						}
            	            						addWithLastConsumed(current, "sinais", lv_sinais_0_2, null);
            	            					

            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            // InternalPortugolCoral.g:1024:3: ( (lv_direita_1_0= ruleExponenciacao ) )
            // InternalPortugolCoral.g:1025:4: (lv_direita_1_0= ruleExponenciacao )
            {
            // InternalPortugolCoral.g:1025:4: (lv_direita_1_0= ruleExponenciacao )
            // InternalPortugolCoral.g:1026:5: lv_direita_1_0= ruleExponenciacao
            {

            					newCompositeNode(grammarAccess.getSinalAccess().getDireitaExponenciacaoParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_direita_1_0=ruleExponenciacao();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSinalRule());
            					}
            					set(
            						current,
            						"direita",
            						lv_direita_1_0,
            						"org.xtext.coral.PortugolCoral.Exponenciacao");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSinal"


    // $ANTLR start "entryRuleExponenciacao"
    // InternalPortugolCoral.g:1047:1: entryRuleExponenciacao returns [EObject current=null] : iv_ruleExponenciacao= ruleExponenciacao EOF ;
    public final EObject entryRuleExponenciacao() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExponenciacao = null;


        try {
            // InternalPortugolCoral.g:1047:54: (iv_ruleExponenciacao= ruleExponenciacao EOF )
            // InternalPortugolCoral.g:1048:2: iv_ruleExponenciacao= ruleExponenciacao EOF
            {
             newCompositeNode(grammarAccess.getExponenciacaoRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExponenciacao=ruleExponenciacao();

            state._fsp--;

             current =iv_ruleExponenciacao; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExponenciacao"


    // $ANTLR start "ruleExponenciacao"
    // InternalPortugolCoral.g:1054:1: ruleExponenciacao returns [EObject current=null] : (this_Elemento_0= ruleElemento ( () otherlv_2= '^' ( (lv_direita_3_0= ruleElemento ) ) )* ) ;
    public final EObject ruleExponenciacao() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Elemento_0 = null;

        EObject lv_direita_3_0 = null;



        	enterRule();

        try {
            // InternalPortugolCoral.g:1060:2: ( (this_Elemento_0= ruleElemento ( () otherlv_2= '^' ( (lv_direita_3_0= ruleElemento ) ) )* ) )
            // InternalPortugolCoral.g:1061:2: (this_Elemento_0= ruleElemento ( () otherlv_2= '^' ( (lv_direita_3_0= ruleElemento ) ) )* )
            {
            // InternalPortugolCoral.g:1061:2: (this_Elemento_0= ruleElemento ( () otherlv_2= '^' ( (lv_direita_3_0= ruleElemento ) ) )* )
            // InternalPortugolCoral.g:1062:3: this_Elemento_0= ruleElemento ( () otherlv_2= '^' ( (lv_direita_3_0= ruleElemento ) ) )*
            {

            			newCompositeNode(grammarAccess.getExponenciacaoAccess().getElementoParserRuleCall_0());
            		
            pushFollow(FOLLOW_17);
            this_Elemento_0=ruleElemento();

            state._fsp--;


            			current = this_Elemento_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalPortugolCoral.g:1070:3: ( () otherlv_2= '^' ( (lv_direita_3_0= ruleElemento ) ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==43) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalPortugolCoral.g:1071:4: () otherlv_2= '^' ( (lv_direita_3_0= ruleElemento ) )
            	    {
            	    // InternalPortugolCoral.g:1071:4: ()
            	    // InternalPortugolCoral.g:1072:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getExponenciacaoAccess().getExponenciacaoEsquerdaAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,43,FOLLOW_10); 

            	    				newLeafNode(otherlv_2, grammarAccess.getExponenciacaoAccess().getCircumflexAccentKeyword_1_1());
            	    			
            	    // InternalPortugolCoral.g:1082:4: ( (lv_direita_3_0= ruleElemento ) )
            	    // InternalPortugolCoral.g:1083:5: (lv_direita_3_0= ruleElemento )
            	    {
            	    // InternalPortugolCoral.g:1083:5: (lv_direita_3_0= ruleElemento )
            	    // InternalPortugolCoral.g:1084:6: lv_direita_3_0= ruleElemento
            	    {

            	    						newCompositeNode(grammarAccess.getExponenciacaoAccess().getDireitaElementoParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_17);
            	    lv_direita_3_0=ruleElemento();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getExponenciacaoRule());
            	    						}
            	    						set(
            	    							current,
            	    							"direita",
            	    							lv_direita_3_0,
            	    							"org.xtext.coral.PortugolCoral.Elemento");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExponenciacao"


    // $ANTLR start "entryRuleElemento"
    // InternalPortugolCoral.g:1106:1: entryRuleElemento returns [EObject current=null] : iv_ruleElemento= ruleElemento EOF ;
    public final EObject entryRuleElemento() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElemento = null;


        try {
            // InternalPortugolCoral.g:1106:49: (iv_ruleElemento= ruleElemento EOF )
            // InternalPortugolCoral.g:1107:2: iv_ruleElemento= ruleElemento EOF
            {
             newCompositeNode(grammarAccess.getElementoRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleElemento=ruleElemento();

            state._fsp--;

             current =iv_ruleElemento; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleElemento"


    // $ANTLR start "ruleElemento"
    // InternalPortugolCoral.g:1113:1: ruleElemento returns [EObject current=null] : (this_ElementoParenteses_0= ruleElementoParenteses | this_ElementoAtomico_1= ruleElementoAtomico | this_Matriz_2= ruleMatriz ) ;
    public final EObject ruleElemento() throws RecognitionException {
        EObject current = null;

        EObject this_ElementoParenteses_0 = null;

        EObject this_ElementoAtomico_1 = null;

        EObject this_Matriz_2 = null;



        	enterRule();

        try {
            // InternalPortugolCoral.g:1119:2: ( (this_ElementoParenteses_0= ruleElementoParenteses | this_ElementoAtomico_1= ruleElementoAtomico | this_Matriz_2= ruleMatriz ) )
            // InternalPortugolCoral.g:1120:2: (this_ElementoParenteses_0= ruleElementoParenteses | this_ElementoAtomico_1= ruleElementoAtomico | this_Matriz_2= ruleMatriz )
            {
            // InternalPortugolCoral.g:1120:2: (this_ElementoParenteses_0= ruleElementoParenteses | this_ElementoAtomico_1= ruleElementoAtomico | this_Matriz_2= ruleMatriz )
            int alt21=3;
            switch ( input.LA(1) ) {
            case 44:
                {
                alt21=1;
                }
                break;
            case RULE_INT:
            case RULE_REAL:
            case RULE_TEXTO_ASPAS_SIMPLES:
            case RULE_TEXTO_ASPAS_DUPLAS:
                {
                alt21=2;
                }
                break;
            case RULE_ID:
                {
                int LA21_3 = input.LA(2);

                if ( (LA21_3==46) ) {
                    alt21=3;
                }
                else if ( (LA21_3==EOF||LA21_3==RULE_ID||(LA21_3>=14 && LA21_3<=15)||(LA21_3>=26 && LA21_3<=28)||(LA21_3>=31 && LA21_3<=43)||LA21_3==45||LA21_3==47) ) {
                    alt21=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 21, 3, input);

                    throw nvae;
                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // InternalPortugolCoral.g:1121:3: this_ElementoParenteses_0= ruleElementoParenteses
                    {

                    			newCompositeNode(grammarAccess.getElementoAccess().getElementoParentesesParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ElementoParenteses_0=ruleElementoParenteses();

                    state._fsp--;


                    			current = this_ElementoParenteses_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalPortugolCoral.g:1130:3: this_ElementoAtomico_1= ruleElementoAtomico
                    {

                    			newCompositeNode(grammarAccess.getElementoAccess().getElementoAtomicoParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ElementoAtomico_1=ruleElementoAtomico();

                    state._fsp--;


                    			current = this_ElementoAtomico_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalPortugolCoral.g:1139:3: this_Matriz_2= ruleMatriz
                    {

                    			newCompositeNode(grammarAccess.getElementoAccess().getMatrizParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Matriz_2=ruleMatriz();

                    state._fsp--;


                    			current = this_Matriz_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleElemento"


    // $ANTLR start "entryRuleElementoParenteses"
    // InternalPortugolCoral.g:1151:1: entryRuleElementoParenteses returns [EObject current=null] : iv_ruleElementoParenteses= ruleElementoParenteses EOF ;
    public final EObject entryRuleElementoParenteses() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElementoParenteses = null;


        try {
            // InternalPortugolCoral.g:1151:59: (iv_ruleElementoParenteses= ruleElementoParenteses EOF )
            // InternalPortugolCoral.g:1152:2: iv_ruleElementoParenteses= ruleElementoParenteses EOF
            {
             newCompositeNode(grammarAccess.getElementoParentesesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleElementoParenteses=ruleElementoParenteses();

            state._fsp--;

             current =iv_ruleElementoParenteses; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleElementoParenteses"


    // $ANTLR start "ruleElementoParenteses"
    // InternalPortugolCoral.g:1158:1: ruleElementoParenteses returns [EObject current=null] : ( (lv_direita_0_0= ruleParenteses ) ) ;
    public final EObject ruleElementoParenteses() throws RecognitionException {
        EObject current = null;

        EObject lv_direita_0_0 = null;



        	enterRule();

        try {
            // InternalPortugolCoral.g:1164:2: ( ( (lv_direita_0_0= ruleParenteses ) ) )
            // InternalPortugolCoral.g:1165:2: ( (lv_direita_0_0= ruleParenteses ) )
            {
            // InternalPortugolCoral.g:1165:2: ( (lv_direita_0_0= ruleParenteses ) )
            // InternalPortugolCoral.g:1166:3: (lv_direita_0_0= ruleParenteses )
            {
            // InternalPortugolCoral.g:1166:3: (lv_direita_0_0= ruleParenteses )
            // InternalPortugolCoral.g:1167:4: lv_direita_0_0= ruleParenteses
            {

            				newCompositeNode(grammarAccess.getElementoParentesesAccess().getDireitaParentesesParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_direita_0_0=ruleParenteses();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getElementoParentesesRule());
            				}
            				set(
            					current,
            					"direita",
            					lv_direita_0_0,
            					"org.xtext.coral.PortugolCoral.Parenteses");
            				afterParserOrEnumRuleCall();
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleElementoParenteses"


    // $ANTLR start "entryRuleParenteses"
    // InternalPortugolCoral.g:1187:1: entryRuleParenteses returns [EObject current=null] : iv_ruleParenteses= ruleParenteses EOF ;
    public final EObject entryRuleParenteses() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParenteses = null;


        try {
            // InternalPortugolCoral.g:1187:51: (iv_ruleParenteses= ruleParenteses EOF )
            // InternalPortugolCoral.g:1188:2: iv_ruleParenteses= ruleParenteses EOF
            {
             newCompositeNode(grammarAccess.getParentesesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParenteses=ruleParenteses();

            state._fsp--;

             current =iv_ruleParenteses; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParenteses"


    // $ANTLR start "ruleParenteses"
    // InternalPortugolCoral.g:1194:1: ruleParenteses returns [EObject current=null] : (otherlv_0= '(' ( (lv_direita_1_0= ruleExpressao ) ) otherlv_2= ')' ) ;
    public final EObject ruleParenteses() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_direita_1_0 = null;



        	enterRule();

        try {
            // InternalPortugolCoral.g:1200:2: ( (otherlv_0= '(' ( (lv_direita_1_0= ruleExpressao ) ) otherlv_2= ')' ) )
            // InternalPortugolCoral.g:1201:2: (otherlv_0= '(' ( (lv_direita_1_0= ruleExpressao ) ) otherlv_2= ')' )
            {
            // InternalPortugolCoral.g:1201:2: (otherlv_0= '(' ( (lv_direita_1_0= ruleExpressao ) ) otherlv_2= ')' )
            // InternalPortugolCoral.g:1202:3: otherlv_0= '(' ( (lv_direita_1_0= ruleExpressao ) ) otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,44,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getParentesesAccess().getLeftParenthesisKeyword_0());
            		
            // InternalPortugolCoral.g:1206:3: ( (lv_direita_1_0= ruleExpressao ) )
            // InternalPortugolCoral.g:1207:4: (lv_direita_1_0= ruleExpressao )
            {
            // InternalPortugolCoral.g:1207:4: (lv_direita_1_0= ruleExpressao )
            // InternalPortugolCoral.g:1208:5: lv_direita_1_0= ruleExpressao
            {

            					newCompositeNode(grammarAccess.getParentesesAccess().getDireitaExpressaoParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_18);
            lv_direita_1_0=ruleExpressao();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParentesesRule());
            					}
            					set(
            						current,
            						"direita",
            						lv_direita_1_0,
            						"org.xtext.coral.PortugolCoral.Expressao");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,45,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getParentesesAccess().getRightParenthesisKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParenteses"


    // $ANTLR start "entryRuleMatriz"
    // InternalPortugolCoral.g:1233:1: entryRuleMatriz returns [EObject current=null] : iv_ruleMatriz= ruleMatriz EOF ;
    public final EObject entryRuleMatriz() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMatriz = null;


        try {
            // InternalPortugolCoral.g:1233:47: (iv_ruleMatriz= ruleMatriz EOF )
            // InternalPortugolCoral.g:1234:2: iv_ruleMatriz= ruleMatriz EOF
            {
             newCompositeNode(grammarAccess.getMatrizRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMatriz=ruleMatriz();

            state._fsp--;

             current =iv_ruleMatriz; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMatriz"


    // $ANTLR start "ruleMatriz"
    // InternalPortugolCoral.g:1240:1: ruleMatriz returns [EObject current=null] : ( ( (lv_variavel_0_0= RULE_ID ) ) ( (lv_direita_1_0= rulePosicaoMatriz ) )+ ) ;
    public final EObject ruleMatriz() throws RecognitionException {
        EObject current = null;

        Token lv_variavel_0_0=null;
        EObject lv_direita_1_0 = null;



        	enterRule();

        try {
            // InternalPortugolCoral.g:1246:2: ( ( ( (lv_variavel_0_0= RULE_ID ) ) ( (lv_direita_1_0= rulePosicaoMatriz ) )+ ) )
            // InternalPortugolCoral.g:1247:2: ( ( (lv_variavel_0_0= RULE_ID ) ) ( (lv_direita_1_0= rulePosicaoMatriz ) )+ )
            {
            // InternalPortugolCoral.g:1247:2: ( ( (lv_variavel_0_0= RULE_ID ) ) ( (lv_direita_1_0= rulePosicaoMatriz ) )+ )
            // InternalPortugolCoral.g:1248:3: ( (lv_variavel_0_0= RULE_ID ) ) ( (lv_direita_1_0= rulePosicaoMatriz ) )+
            {
            // InternalPortugolCoral.g:1248:3: ( (lv_variavel_0_0= RULE_ID ) )
            // InternalPortugolCoral.g:1249:4: (lv_variavel_0_0= RULE_ID )
            {
            // InternalPortugolCoral.g:1249:4: (lv_variavel_0_0= RULE_ID )
            // InternalPortugolCoral.g:1250:5: lv_variavel_0_0= RULE_ID
            {
            lv_variavel_0_0=(Token)match(input,RULE_ID,FOLLOW_19); 

            					newLeafNode(lv_variavel_0_0, grammarAccess.getMatrizAccess().getVariavelIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMatrizRule());
            					}
            					setWithLastConsumed(
            						current,
            						"variavel",
            						lv_variavel_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalPortugolCoral.g:1266:3: ( (lv_direita_1_0= rulePosicaoMatriz ) )+
            int cnt22=0;
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==46) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalPortugolCoral.g:1267:4: (lv_direita_1_0= rulePosicaoMatriz )
            	    {
            	    // InternalPortugolCoral.g:1267:4: (lv_direita_1_0= rulePosicaoMatriz )
            	    // InternalPortugolCoral.g:1268:5: lv_direita_1_0= rulePosicaoMatriz
            	    {

            	    					newCompositeNode(grammarAccess.getMatrizAccess().getDireitaPosicaoMatrizParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_20);
            	    lv_direita_1_0=rulePosicaoMatriz();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getMatrizRule());
            	    					}
            	    					add(
            	    						current,
            	    						"direita",
            	    						lv_direita_1_0,
            	    						"org.xtext.coral.PortugolCoral.PosicaoMatriz");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt22 >= 1 ) break loop22;
                        EarlyExitException eee =
                            new EarlyExitException(22, input);
                        throw eee;
                }
                cnt22++;
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMatriz"


    // $ANTLR start "entryRulePosicaoMatriz"
    // InternalPortugolCoral.g:1289:1: entryRulePosicaoMatriz returns [EObject current=null] : iv_rulePosicaoMatriz= rulePosicaoMatriz EOF ;
    public final EObject entryRulePosicaoMatriz() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePosicaoMatriz = null;


        try {
            // InternalPortugolCoral.g:1289:54: (iv_rulePosicaoMatriz= rulePosicaoMatriz EOF )
            // InternalPortugolCoral.g:1290:2: iv_rulePosicaoMatriz= rulePosicaoMatriz EOF
            {
             newCompositeNode(grammarAccess.getPosicaoMatrizRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePosicaoMatriz=rulePosicaoMatriz();

            state._fsp--;

             current =iv_rulePosicaoMatriz; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePosicaoMatriz"


    // $ANTLR start "rulePosicaoMatriz"
    // InternalPortugolCoral.g:1296:1: rulePosicaoMatriz returns [EObject current=null] : (otherlv_0= '[' ( (lv_direita_1_0= ruleExpressao ) ) otherlv_2= ']' ) ;
    public final EObject rulePosicaoMatriz() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_direita_1_0 = null;



        	enterRule();

        try {
            // InternalPortugolCoral.g:1302:2: ( (otherlv_0= '[' ( (lv_direita_1_0= ruleExpressao ) ) otherlv_2= ']' ) )
            // InternalPortugolCoral.g:1303:2: (otherlv_0= '[' ( (lv_direita_1_0= ruleExpressao ) ) otherlv_2= ']' )
            {
            // InternalPortugolCoral.g:1303:2: (otherlv_0= '[' ( (lv_direita_1_0= ruleExpressao ) ) otherlv_2= ']' )
            // InternalPortugolCoral.g:1304:3: otherlv_0= '[' ( (lv_direita_1_0= ruleExpressao ) ) otherlv_2= ']'
            {
            otherlv_0=(Token)match(input,46,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getPosicaoMatrizAccess().getLeftSquareBracketKeyword_0());
            		
            // InternalPortugolCoral.g:1308:3: ( (lv_direita_1_0= ruleExpressao ) )
            // InternalPortugolCoral.g:1309:4: (lv_direita_1_0= ruleExpressao )
            {
            // InternalPortugolCoral.g:1309:4: (lv_direita_1_0= ruleExpressao )
            // InternalPortugolCoral.g:1310:5: lv_direita_1_0= ruleExpressao
            {

            					newCompositeNode(grammarAccess.getPosicaoMatrizAccess().getDireitaExpressaoParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_21);
            lv_direita_1_0=ruleExpressao();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPosicaoMatrizRule());
            					}
            					set(
            						current,
            						"direita",
            						lv_direita_1_0,
            						"org.xtext.coral.PortugolCoral.Expressao");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,47,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getPosicaoMatrizAccess().getRightSquareBracketKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePosicaoMatriz"


    // $ANTLR start "entryRuleElementoAtomico"
    // InternalPortugolCoral.g:1335:1: entryRuleElementoAtomico returns [EObject current=null] : iv_ruleElementoAtomico= ruleElementoAtomico EOF ;
    public final EObject entryRuleElementoAtomico() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElementoAtomico = null;


        try {
            // InternalPortugolCoral.g:1335:56: (iv_ruleElementoAtomico= ruleElementoAtomico EOF )
            // InternalPortugolCoral.g:1336:2: iv_ruleElementoAtomico= ruleElementoAtomico EOF
            {
             newCompositeNode(grammarAccess.getElementoAtomicoRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleElementoAtomico=ruleElementoAtomico();

            state._fsp--;

             current =iv_ruleElementoAtomico; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleElementoAtomico"


    // $ANTLR start "ruleElementoAtomico"
    // InternalPortugolCoral.g:1342:1: ruleElementoAtomico returns [EObject current=null] : ( ( () ( (lv_valor_1_0= RULE_INT ) ) ) | ( () ( (lv_valor_3_0= RULE_REAL ) ) ) | ( () ( ( (lv_valor_5_1= RULE_TEXTO_ASPAS_SIMPLES | lv_valor_5_2= RULE_TEXTO_ASPAS_DUPLAS ) ) ) ) | ( () ( (lv_variavel_7_0= RULE_ID ) ) ) ) ;
    public final EObject ruleElementoAtomico() throws RecognitionException {
        EObject current = null;

        Token lv_valor_1_0=null;
        Token lv_valor_3_0=null;
        Token lv_valor_5_1=null;
        Token lv_valor_5_2=null;
        Token lv_variavel_7_0=null;


        	enterRule();

        try {
            // InternalPortugolCoral.g:1348:2: ( ( ( () ( (lv_valor_1_0= RULE_INT ) ) ) | ( () ( (lv_valor_3_0= RULE_REAL ) ) ) | ( () ( ( (lv_valor_5_1= RULE_TEXTO_ASPAS_SIMPLES | lv_valor_5_2= RULE_TEXTO_ASPAS_DUPLAS ) ) ) ) | ( () ( (lv_variavel_7_0= RULE_ID ) ) ) ) )
            // InternalPortugolCoral.g:1349:2: ( ( () ( (lv_valor_1_0= RULE_INT ) ) ) | ( () ( (lv_valor_3_0= RULE_REAL ) ) ) | ( () ( ( (lv_valor_5_1= RULE_TEXTO_ASPAS_SIMPLES | lv_valor_5_2= RULE_TEXTO_ASPAS_DUPLAS ) ) ) ) | ( () ( (lv_variavel_7_0= RULE_ID ) ) ) )
            {
            // InternalPortugolCoral.g:1349:2: ( ( () ( (lv_valor_1_0= RULE_INT ) ) ) | ( () ( (lv_valor_3_0= RULE_REAL ) ) ) | ( () ( ( (lv_valor_5_1= RULE_TEXTO_ASPAS_SIMPLES | lv_valor_5_2= RULE_TEXTO_ASPAS_DUPLAS ) ) ) ) | ( () ( (lv_variavel_7_0= RULE_ID ) ) ) )
            int alt24=4;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt24=1;
                }
                break;
            case RULE_REAL:
                {
                alt24=2;
                }
                break;
            case RULE_TEXTO_ASPAS_SIMPLES:
            case RULE_TEXTO_ASPAS_DUPLAS:
                {
                alt24=3;
                }
                break;
            case RULE_ID:
                {
                alt24=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }

            switch (alt24) {
                case 1 :
                    // InternalPortugolCoral.g:1350:3: ( () ( (lv_valor_1_0= RULE_INT ) ) )
                    {
                    // InternalPortugolCoral.g:1350:3: ( () ( (lv_valor_1_0= RULE_INT ) ) )
                    // InternalPortugolCoral.g:1351:4: () ( (lv_valor_1_0= RULE_INT ) )
                    {
                    // InternalPortugolCoral.g:1351:4: ()
                    // InternalPortugolCoral.g:1352:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getElementoAtomicoAccess().getConstanteInteiraAction_0_0(),
                    						current);
                    				

                    }

                    // InternalPortugolCoral.g:1358:4: ( (lv_valor_1_0= RULE_INT ) )
                    // InternalPortugolCoral.g:1359:5: (lv_valor_1_0= RULE_INT )
                    {
                    // InternalPortugolCoral.g:1359:5: (lv_valor_1_0= RULE_INT )
                    // InternalPortugolCoral.g:1360:6: lv_valor_1_0= RULE_INT
                    {
                    lv_valor_1_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    						newLeafNode(lv_valor_1_0, grammarAccess.getElementoAtomicoAccess().getValorINTTerminalRuleCall_0_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getElementoAtomicoRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"valor",
                    							lv_valor_1_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalPortugolCoral.g:1378:3: ( () ( (lv_valor_3_0= RULE_REAL ) ) )
                    {
                    // InternalPortugolCoral.g:1378:3: ( () ( (lv_valor_3_0= RULE_REAL ) ) )
                    // InternalPortugolCoral.g:1379:4: () ( (lv_valor_3_0= RULE_REAL ) )
                    {
                    // InternalPortugolCoral.g:1379:4: ()
                    // InternalPortugolCoral.g:1380:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getElementoAtomicoAccess().getConstanteRealAction_1_0(),
                    						current);
                    				

                    }

                    // InternalPortugolCoral.g:1386:4: ( (lv_valor_3_0= RULE_REAL ) )
                    // InternalPortugolCoral.g:1387:5: (lv_valor_3_0= RULE_REAL )
                    {
                    // InternalPortugolCoral.g:1387:5: (lv_valor_3_0= RULE_REAL )
                    // InternalPortugolCoral.g:1388:6: lv_valor_3_0= RULE_REAL
                    {
                    lv_valor_3_0=(Token)match(input,RULE_REAL,FOLLOW_2); 

                    						newLeafNode(lv_valor_3_0, grammarAccess.getElementoAtomicoAccess().getValorREALTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getElementoAtomicoRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"valor",
                    							lv_valor_3_0,
                    							"org.xtext.coral.PortugolCoral.REAL");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalPortugolCoral.g:1406:3: ( () ( ( (lv_valor_5_1= RULE_TEXTO_ASPAS_SIMPLES | lv_valor_5_2= RULE_TEXTO_ASPAS_DUPLAS ) ) ) )
                    {
                    // InternalPortugolCoral.g:1406:3: ( () ( ( (lv_valor_5_1= RULE_TEXTO_ASPAS_SIMPLES | lv_valor_5_2= RULE_TEXTO_ASPAS_DUPLAS ) ) ) )
                    // InternalPortugolCoral.g:1407:4: () ( ( (lv_valor_5_1= RULE_TEXTO_ASPAS_SIMPLES | lv_valor_5_2= RULE_TEXTO_ASPAS_DUPLAS ) ) )
                    {
                    // InternalPortugolCoral.g:1407:4: ()
                    // InternalPortugolCoral.g:1408:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getElementoAtomicoAccess().getConstanteStringAction_2_0(),
                    						current);
                    				

                    }

                    // InternalPortugolCoral.g:1414:4: ( ( (lv_valor_5_1= RULE_TEXTO_ASPAS_SIMPLES | lv_valor_5_2= RULE_TEXTO_ASPAS_DUPLAS ) ) )
                    // InternalPortugolCoral.g:1415:5: ( (lv_valor_5_1= RULE_TEXTO_ASPAS_SIMPLES | lv_valor_5_2= RULE_TEXTO_ASPAS_DUPLAS ) )
                    {
                    // InternalPortugolCoral.g:1415:5: ( (lv_valor_5_1= RULE_TEXTO_ASPAS_SIMPLES | lv_valor_5_2= RULE_TEXTO_ASPAS_DUPLAS ) )
                    // InternalPortugolCoral.g:1416:6: (lv_valor_5_1= RULE_TEXTO_ASPAS_SIMPLES | lv_valor_5_2= RULE_TEXTO_ASPAS_DUPLAS )
                    {
                    // InternalPortugolCoral.g:1416:6: (lv_valor_5_1= RULE_TEXTO_ASPAS_SIMPLES | lv_valor_5_2= RULE_TEXTO_ASPAS_DUPLAS )
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0==RULE_TEXTO_ASPAS_SIMPLES) ) {
                        alt23=1;
                    }
                    else if ( (LA23_0==RULE_TEXTO_ASPAS_DUPLAS) ) {
                        alt23=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 23, 0, input);

                        throw nvae;
                    }
                    switch (alt23) {
                        case 1 :
                            // InternalPortugolCoral.g:1417:7: lv_valor_5_1= RULE_TEXTO_ASPAS_SIMPLES
                            {
                            lv_valor_5_1=(Token)match(input,RULE_TEXTO_ASPAS_SIMPLES,FOLLOW_2); 

                            							newLeafNode(lv_valor_5_1, grammarAccess.getElementoAtomicoAccess().getValorTEXTO_ASPAS_SIMPLESTerminalRuleCall_2_1_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getElementoAtomicoRule());
                            							}
                            							setWithLastConsumed(
                            								current,
                            								"valor",
                            								lv_valor_5_1,
                            								"org.xtext.coral.PortugolCoral.TEXTO_ASPAS_SIMPLES");
                            						

                            }
                            break;
                        case 2 :
                            // InternalPortugolCoral.g:1432:7: lv_valor_5_2= RULE_TEXTO_ASPAS_DUPLAS
                            {
                            lv_valor_5_2=(Token)match(input,RULE_TEXTO_ASPAS_DUPLAS,FOLLOW_2); 

                            							newLeafNode(lv_valor_5_2, grammarAccess.getElementoAtomicoAccess().getValorTEXTO_ASPAS_DUPLASTerminalRuleCall_2_1_0_1());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getElementoAtomicoRule());
                            							}
                            							setWithLastConsumed(
                            								current,
                            								"valor",
                            								lv_valor_5_2,
                            								"org.xtext.coral.PortugolCoral.TEXTO_ASPAS_DUPLAS");
                            						

                            }
                            break;

                    }


                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalPortugolCoral.g:1451:3: ( () ( (lv_variavel_7_0= RULE_ID ) ) )
                    {
                    // InternalPortugolCoral.g:1451:3: ( () ( (lv_variavel_7_0= RULE_ID ) ) )
                    // InternalPortugolCoral.g:1452:4: () ( (lv_variavel_7_0= RULE_ID ) )
                    {
                    // InternalPortugolCoral.g:1452:4: ()
                    // InternalPortugolCoral.g:1453:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getElementoAtomicoAccess().getReferenciaVariavelAction_3_0(),
                    						current);
                    				

                    }

                    // InternalPortugolCoral.g:1459:4: ( (lv_variavel_7_0= RULE_ID ) )
                    // InternalPortugolCoral.g:1460:5: (lv_variavel_7_0= RULE_ID )
                    {
                    // InternalPortugolCoral.g:1460:5: (lv_variavel_7_0= RULE_ID )
                    // InternalPortugolCoral.g:1461:6: lv_variavel_7_0= RULE_ID
                    {
                    lv_variavel_7_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(lv_variavel_7_0, grammarAccess.getElementoAtomicoAccess().getVariavelIDTerminalRuleCall_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getElementoAtomicoRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"variavel",
                    							lv_variavel_7_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleElementoAtomico"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x000000000000C012L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000020010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000001F00000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00001060600001F0L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000001F80000002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000006000000002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000078000000002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000800000000000L});

}