package org.xtext.coral.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.coral.services.PortugolCoralGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPortugolCoralParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_REAL", "RULE_TEXTO", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'variaveis'", "'vari\\u00E1veis'", "'int'", "'real'", "'texto'", "'logico'", "'l\\u00F3gico'", "'faca'", "'fa\\u00E7a'", "'nao'", "'n\\u00E3o'", "'<='", "'=='", "'>='", "'<'", "'>'", "'!='", "'+'", "'-'", "'*'", "'/'", "'//'", "'%'", "'crie'", "'{'", "'}'", "':'", "','", "'='", "'ou'", "'e'", "'xou'", "'^'", "'('", "')'", "'['", "']'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=4;
    public static final int RULE_REAL=6;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int RULE_TEXTO=7;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=8;
    public static final int RULE_SL_COMMENT=10;
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
    public static final int RULE_WS=11;
    public static final int RULE_ANY_OTHER=12;
    public static final int T__48=48;
    public static final int T__49=49;
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

    	public void setGrammarAccess(PortugolCoralGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRulePortugolcoral"
    // InternalPortugolCoral.g:53:1: entryRulePortugolcoral : rulePortugolcoral EOF ;
    public final void entryRulePortugolcoral() throws RecognitionException {
        try {
            // InternalPortugolCoral.g:54:1: ( rulePortugolcoral EOF )
            // InternalPortugolCoral.g:55:1: rulePortugolcoral EOF
            {
             before(grammarAccess.getPortugolcoralRule()); 
            pushFollow(FOLLOW_1);
            rulePortugolcoral();

            state._fsp--;

             after(grammarAccess.getPortugolcoralRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePortugolcoral"


    // $ANTLR start "rulePortugolcoral"
    // InternalPortugolCoral.g:62:1: rulePortugolcoral : ( ( rule__Portugolcoral__ElementosAssignment )* ) ;
    public final void rulePortugolcoral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolCoral.g:66:2: ( ( ( rule__Portugolcoral__ElementosAssignment )* ) )
            // InternalPortugolCoral.g:67:2: ( ( rule__Portugolcoral__ElementosAssignment )* )
            {
            // InternalPortugolCoral.g:67:2: ( ( rule__Portugolcoral__ElementosAssignment )* )
            // InternalPortugolCoral.g:68:3: ( rule__Portugolcoral__ElementosAssignment )*
            {
             before(grammarAccess.getPortugolcoralAccess().getElementosAssignment()); 
            // InternalPortugolCoral.g:69:3: ( rule__Portugolcoral__ElementosAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID||(LA1_0>=13 && LA1_0<=14)||(LA1_0>=20 && LA1_0<=21)||LA1_0==36) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalPortugolCoral.g:69:4: rule__Portugolcoral__ElementosAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Portugolcoral__ElementosAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getPortugolcoralAccess().getElementosAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePortugolcoral"


    // $ANTLR start "entryRuleAcoes"
    // InternalPortugolCoral.g:78:1: entryRuleAcoes : ruleAcoes EOF ;
    public final void entryRuleAcoes() throws RecognitionException {
        try {
            // InternalPortugolCoral.g:79:1: ( ruleAcoes EOF )
            // InternalPortugolCoral.g:80:1: ruleAcoes EOF
            {
             before(grammarAccess.getAcoesRule()); 
            pushFollow(FOLLOW_1);
            ruleAcoes();

            state._fsp--;

             after(grammarAccess.getAcoesRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAcoes"


    // $ANTLR start "ruleAcoes"
    // InternalPortugolCoral.g:87:1: ruleAcoes : ( ( rule__Acoes__Alternatives ) ) ;
    public final void ruleAcoes() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolCoral.g:91:2: ( ( ( rule__Acoes__Alternatives ) ) )
            // InternalPortugolCoral.g:92:2: ( ( rule__Acoes__Alternatives ) )
            {
            // InternalPortugolCoral.g:92:2: ( ( rule__Acoes__Alternatives ) )
            // InternalPortugolCoral.g:93:3: ( rule__Acoes__Alternatives )
            {
             before(grammarAccess.getAcoesAccess().getAlternatives()); 
            // InternalPortugolCoral.g:94:3: ( rule__Acoes__Alternatives )
            // InternalPortugolCoral.g:94:4: rule__Acoes__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Acoes__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAcoesAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAcoes"


    // $ANTLR start "entryRuleDeclararVariaveis"
    // InternalPortugolCoral.g:103:1: entryRuleDeclararVariaveis : ruleDeclararVariaveis EOF ;
    public final void entryRuleDeclararVariaveis() throws RecognitionException {
        try {
            // InternalPortugolCoral.g:104:1: ( ruleDeclararVariaveis EOF )
            // InternalPortugolCoral.g:105:1: ruleDeclararVariaveis EOF
            {
             before(grammarAccess.getDeclararVariaveisRule()); 
            pushFollow(FOLLOW_1);
            ruleDeclararVariaveis();

            state._fsp--;

             after(grammarAccess.getDeclararVariaveisRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDeclararVariaveis"


    // $ANTLR start "ruleDeclararVariaveis"
    // InternalPortugolCoral.g:112:1: ruleDeclararVariaveis : ( ( rule__DeclararVariaveis__Group__0 ) ) ;
    public final void ruleDeclararVariaveis() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolCoral.g:116:2: ( ( ( rule__DeclararVariaveis__Group__0 ) ) )
            // InternalPortugolCoral.g:117:2: ( ( rule__DeclararVariaveis__Group__0 ) )
            {
            // InternalPortugolCoral.g:117:2: ( ( rule__DeclararVariaveis__Group__0 ) )
            // InternalPortugolCoral.g:118:3: ( rule__DeclararVariaveis__Group__0 )
            {
             before(grammarAccess.getDeclararVariaveisAccess().getGroup()); 
            // InternalPortugolCoral.g:119:3: ( rule__DeclararVariaveis__Group__0 )
            // InternalPortugolCoral.g:119:4: rule__DeclararVariaveis__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DeclararVariaveis__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDeclararVariaveisAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDeclararVariaveis"


    // $ANTLR start "entryRuleDeclararVariaveisTipo"
    // InternalPortugolCoral.g:128:1: entryRuleDeclararVariaveisTipo : ruleDeclararVariaveisTipo EOF ;
    public final void entryRuleDeclararVariaveisTipo() throws RecognitionException {
        try {
            // InternalPortugolCoral.g:129:1: ( ruleDeclararVariaveisTipo EOF )
            // InternalPortugolCoral.g:130:1: ruleDeclararVariaveisTipo EOF
            {
             before(grammarAccess.getDeclararVariaveisTipoRule()); 
            pushFollow(FOLLOW_1);
            ruleDeclararVariaveisTipo();

            state._fsp--;

             after(grammarAccess.getDeclararVariaveisTipoRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDeclararVariaveisTipo"


    // $ANTLR start "ruleDeclararVariaveisTipo"
    // InternalPortugolCoral.g:137:1: ruleDeclararVariaveisTipo : ( ( rule__DeclararVariaveisTipo__Group__0 ) ) ;
    public final void ruleDeclararVariaveisTipo() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolCoral.g:141:2: ( ( ( rule__DeclararVariaveisTipo__Group__0 ) ) )
            // InternalPortugolCoral.g:142:2: ( ( rule__DeclararVariaveisTipo__Group__0 ) )
            {
            // InternalPortugolCoral.g:142:2: ( ( rule__DeclararVariaveisTipo__Group__0 ) )
            // InternalPortugolCoral.g:143:3: ( rule__DeclararVariaveisTipo__Group__0 )
            {
             before(grammarAccess.getDeclararVariaveisTipoAccess().getGroup()); 
            // InternalPortugolCoral.g:144:3: ( rule__DeclararVariaveisTipo__Group__0 )
            // InternalPortugolCoral.g:144:4: rule__DeclararVariaveisTipo__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DeclararVariaveisTipo__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDeclararVariaveisTipoAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDeclararVariaveisTipo"


    // $ANTLR start "entryRuleTipoVariavel"
    // InternalPortugolCoral.g:153:1: entryRuleTipoVariavel : ruleTipoVariavel EOF ;
    public final void entryRuleTipoVariavel() throws RecognitionException {
        try {
            // InternalPortugolCoral.g:154:1: ( ruleTipoVariavel EOF )
            // InternalPortugolCoral.g:155:1: ruleTipoVariavel EOF
            {
             before(grammarAccess.getTipoVariavelRule()); 
            pushFollow(FOLLOW_1);
            ruleTipoVariavel();

            state._fsp--;

             after(grammarAccess.getTipoVariavelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTipoVariavel"


    // $ANTLR start "ruleTipoVariavel"
    // InternalPortugolCoral.g:162:1: ruleTipoVariavel : ( ( rule__TipoVariavel__Alternatives ) ) ;
    public final void ruleTipoVariavel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolCoral.g:166:2: ( ( ( rule__TipoVariavel__Alternatives ) ) )
            // InternalPortugolCoral.g:167:2: ( ( rule__TipoVariavel__Alternatives ) )
            {
            // InternalPortugolCoral.g:167:2: ( ( rule__TipoVariavel__Alternatives ) )
            // InternalPortugolCoral.g:168:3: ( rule__TipoVariavel__Alternatives )
            {
             before(grammarAccess.getTipoVariavelAccess().getAlternatives()); 
            // InternalPortugolCoral.g:169:3: ( rule__TipoVariavel__Alternatives )
            // InternalPortugolCoral.g:169:4: rule__TipoVariavel__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__TipoVariavel__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTipoVariavelAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTipoVariavel"


    // $ANTLR start "entryRuleAtribuir"
    // InternalPortugolCoral.g:178:1: entryRuleAtribuir : ruleAtribuir EOF ;
    public final void entryRuleAtribuir() throws RecognitionException {
        try {
            // InternalPortugolCoral.g:179:1: ( ruleAtribuir EOF )
            // InternalPortugolCoral.g:180:1: ruleAtribuir EOF
            {
             before(grammarAccess.getAtribuirRule()); 
            pushFollow(FOLLOW_1);
            ruleAtribuir();

            state._fsp--;

             after(grammarAccess.getAtribuirRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAtribuir"


    // $ANTLR start "ruleAtribuir"
    // InternalPortugolCoral.g:187:1: ruleAtribuir : ( ( rule__Atribuir__Group__0 ) ) ;
    public final void ruleAtribuir() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolCoral.g:191:2: ( ( ( rule__Atribuir__Group__0 ) ) )
            // InternalPortugolCoral.g:192:2: ( ( rule__Atribuir__Group__0 ) )
            {
            // InternalPortugolCoral.g:192:2: ( ( rule__Atribuir__Group__0 ) )
            // InternalPortugolCoral.g:193:3: ( rule__Atribuir__Group__0 )
            {
             before(grammarAccess.getAtribuirAccess().getGroup()); 
            // InternalPortugolCoral.g:194:3: ( rule__Atribuir__Group__0 )
            // InternalPortugolCoral.g:194:4: rule__Atribuir__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Atribuir__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAtribuirAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAtribuir"


    // $ANTLR start "entryRuleExpressao"
    // InternalPortugolCoral.g:203:1: entryRuleExpressao : ruleExpressao EOF ;
    public final void entryRuleExpressao() throws RecognitionException {
        try {
            // InternalPortugolCoral.g:204:1: ( ruleExpressao EOF )
            // InternalPortugolCoral.g:205:1: ruleExpressao EOF
            {
             before(grammarAccess.getExpressaoRule()); 
            pushFollow(FOLLOW_1);
            ruleExpressao();

            state._fsp--;

             after(grammarAccess.getExpressaoRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExpressao"


    // $ANTLR start "ruleExpressao"
    // InternalPortugolCoral.g:212:1: ruleExpressao : ( ( rule__Expressao__EsquerdaAssignment ) ) ;
    public final void ruleExpressao() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolCoral.g:216:2: ( ( ( rule__Expressao__EsquerdaAssignment ) ) )
            // InternalPortugolCoral.g:217:2: ( ( rule__Expressao__EsquerdaAssignment ) )
            {
            // InternalPortugolCoral.g:217:2: ( ( rule__Expressao__EsquerdaAssignment ) )
            // InternalPortugolCoral.g:218:3: ( rule__Expressao__EsquerdaAssignment )
            {
             before(grammarAccess.getExpressaoAccess().getEsquerdaAssignment()); 
            // InternalPortugolCoral.g:219:3: ( rule__Expressao__EsquerdaAssignment )
            // InternalPortugolCoral.g:219:4: rule__Expressao__EsquerdaAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Expressao__EsquerdaAssignment();

            state._fsp--;


            }

             after(grammarAccess.getExpressaoAccess().getEsquerdaAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpressao"


    // $ANTLR start "entryRuleOu"
    // InternalPortugolCoral.g:228:1: entryRuleOu : ruleOu EOF ;
    public final void entryRuleOu() throws RecognitionException {
        try {
            // InternalPortugolCoral.g:229:1: ( ruleOu EOF )
            // InternalPortugolCoral.g:230:1: ruleOu EOF
            {
             before(grammarAccess.getOuRule()); 
            pushFollow(FOLLOW_1);
            ruleOu();

            state._fsp--;

             after(grammarAccess.getOuRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOu"


    // $ANTLR start "ruleOu"
    // InternalPortugolCoral.g:237:1: ruleOu : ( ( rule__Ou__Group__0 ) ) ;
    public final void ruleOu() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolCoral.g:241:2: ( ( ( rule__Ou__Group__0 ) ) )
            // InternalPortugolCoral.g:242:2: ( ( rule__Ou__Group__0 ) )
            {
            // InternalPortugolCoral.g:242:2: ( ( rule__Ou__Group__0 ) )
            // InternalPortugolCoral.g:243:3: ( rule__Ou__Group__0 )
            {
             before(grammarAccess.getOuAccess().getGroup()); 
            // InternalPortugolCoral.g:244:3: ( rule__Ou__Group__0 )
            // InternalPortugolCoral.g:244:4: rule__Ou__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Ou__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOuAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOu"


    // $ANTLR start "entryRuleE"
    // InternalPortugolCoral.g:253:1: entryRuleE : ruleE EOF ;
    public final void entryRuleE() throws RecognitionException {
        try {
            // InternalPortugolCoral.g:254:1: ( ruleE EOF )
            // InternalPortugolCoral.g:255:1: ruleE EOF
            {
             before(grammarAccess.getERule()); 
            pushFollow(FOLLOW_1);
            ruleE();

            state._fsp--;

             after(grammarAccess.getERule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleE"


    // $ANTLR start "ruleE"
    // InternalPortugolCoral.g:262:1: ruleE : ( ( rule__E__Group__0 ) ) ;
    public final void ruleE() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolCoral.g:266:2: ( ( ( rule__E__Group__0 ) ) )
            // InternalPortugolCoral.g:267:2: ( ( rule__E__Group__0 ) )
            {
            // InternalPortugolCoral.g:267:2: ( ( rule__E__Group__0 ) )
            // InternalPortugolCoral.g:268:3: ( rule__E__Group__0 )
            {
             before(grammarAccess.getEAccess().getGroup()); 
            // InternalPortugolCoral.g:269:3: ( rule__E__Group__0 )
            // InternalPortugolCoral.g:269:4: rule__E__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__E__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleE"


    // $ANTLR start "entryRuleXou"
    // InternalPortugolCoral.g:278:1: entryRuleXou : ruleXou EOF ;
    public final void entryRuleXou() throws RecognitionException {
        try {
            // InternalPortugolCoral.g:279:1: ( ruleXou EOF )
            // InternalPortugolCoral.g:280:1: ruleXou EOF
            {
             before(grammarAccess.getXouRule()); 
            pushFollow(FOLLOW_1);
            ruleXou();

            state._fsp--;

             after(grammarAccess.getXouRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleXou"


    // $ANTLR start "ruleXou"
    // InternalPortugolCoral.g:287:1: ruleXou : ( ( rule__Xou__Group__0 ) ) ;
    public final void ruleXou() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolCoral.g:291:2: ( ( ( rule__Xou__Group__0 ) ) )
            // InternalPortugolCoral.g:292:2: ( ( rule__Xou__Group__0 ) )
            {
            // InternalPortugolCoral.g:292:2: ( ( rule__Xou__Group__0 ) )
            // InternalPortugolCoral.g:293:3: ( rule__Xou__Group__0 )
            {
             before(grammarAccess.getXouAccess().getGroup()); 
            // InternalPortugolCoral.g:294:3: ( rule__Xou__Group__0 )
            // InternalPortugolCoral.g:294:4: rule__Xou__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Xou__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getXouAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleXou"


    // $ANTLR start "entryRuleNao"
    // InternalPortugolCoral.g:303:1: entryRuleNao : ruleNao EOF ;
    public final void entryRuleNao() throws RecognitionException {
        try {
            // InternalPortugolCoral.g:304:1: ( ruleNao EOF )
            // InternalPortugolCoral.g:305:1: ruleNao EOF
            {
             before(grammarAccess.getNaoRule()); 
            pushFollow(FOLLOW_1);
            ruleNao();

            state._fsp--;

             after(grammarAccess.getNaoRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNao"


    // $ANTLR start "ruleNao"
    // InternalPortugolCoral.g:312:1: ruleNao : ( ( rule__Nao__Group__0 ) ) ;
    public final void ruleNao() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolCoral.g:316:2: ( ( ( rule__Nao__Group__0 ) ) )
            // InternalPortugolCoral.g:317:2: ( ( rule__Nao__Group__0 ) )
            {
            // InternalPortugolCoral.g:317:2: ( ( rule__Nao__Group__0 ) )
            // InternalPortugolCoral.g:318:3: ( rule__Nao__Group__0 )
            {
             before(grammarAccess.getNaoAccess().getGroup()); 
            // InternalPortugolCoral.g:319:3: ( rule__Nao__Group__0 )
            // InternalPortugolCoral.g:319:4: rule__Nao__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Nao__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNaoAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNao"


    // $ANTLR start "entryRuleComparacao"
    // InternalPortugolCoral.g:328:1: entryRuleComparacao : ruleComparacao EOF ;
    public final void entryRuleComparacao() throws RecognitionException {
        try {
            // InternalPortugolCoral.g:329:1: ( ruleComparacao EOF )
            // InternalPortugolCoral.g:330:1: ruleComparacao EOF
            {
             before(grammarAccess.getComparacaoRule()); 
            pushFollow(FOLLOW_1);
            ruleComparacao();

            state._fsp--;

             after(grammarAccess.getComparacaoRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleComparacao"


    // $ANTLR start "ruleComparacao"
    // InternalPortugolCoral.g:337:1: ruleComparacao : ( ( rule__Comparacao__Group__0 ) ) ;
    public final void ruleComparacao() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolCoral.g:341:2: ( ( ( rule__Comparacao__Group__0 ) ) )
            // InternalPortugolCoral.g:342:2: ( ( rule__Comparacao__Group__0 ) )
            {
            // InternalPortugolCoral.g:342:2: ( ( rule__Comparacao__Group__0 ) )
            // InternalPortugolCoral.g:343:3: ( rule__Comparacao__Group__0 )
            {
             before(grammarAccess.getComparacaoAccess().getGroup()); 
            // InternalPortugolCoral.g:344:3: ( rule__Comparacao__Group__0 )
            // InternalPortugolCoral.g:344:4: rule__Comparacao__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Comparacao__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getComparacaoAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleComparacao"


    // $ANTLR start "entryRuleAdicaoOuSubtracao"
    // InternalPortugolCoral.g:353:1: entryRuleAdicaoOuSubtracao : ruleAdicaoOuSubtracao EOF ;
    public final void entryRuleAdicaoOuSubtracao() throws RecognitionException {
        try {
            // InternalPortugolCoral.g:354:1: ( ruleAdicaoOuSubtracao EOF )
            // InternalPortugolCoral.g:355:1: ruleAdicaoOuSubtracao EOF
            {
             before(grammarAccess.getAdicaoOuSubtracaoRule()); 
            pushFollow(FOLLOW_1);
            ruleAdicaoOuSubtracao();

            state._fsp--;

             after(grammarAccess.getAdicaoOuSubtracaoRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAdicaoOuSubtracao"


    // $ANTLR start "ruleAdicaoOuSubtracao"
    // InternalPortugolCoral.g:362:1: ruleAdicaoOuSubtracao : ( ( rule__AdicaoOuSubtracao__Group__0 ) ) ;
    public final void ruleAdicaoOuSubtracao() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolCoral.g:366:2: ( ( ( rule__AdicaoOuSubtracao__Group__0 ) ) )
            // InternalPortugolCoral.g:367:2: ( ( rule__AdicaoOuSubtracao__Group__0 ) )
            {
            // InternalPortugolCoral.g:367:2: ( ( rule__AdicaoOuSubtracao__Group__0 ) )
            // InternalPortugolCoral.g:368:3: ( rule__AdicaoOuSubtracao__Group__0 )
            {
             before(grammarAccess.getAdicaoOuSubtracaoAccess().getGroup()); 
            // InternalPortugolCoral.g:369:3: ( rule__AdicaoOuSubtracao__Group__0 )
            // InternalPortugolCoral.g:369:4: rule__AdicaoOuSubtracao__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AdicaoOuSubtracao__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAdicaoOuSubtracaoAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAdicaoOuSubtracao"


    // $ANTLR start "entryRuleMultiplicacaoOuDivisao"
    // InternalPortugolCoral.g:378:1: entryRuleMultiplicacaoOuDivisao : ruleMultiplicacaoOuDivisao EOF ;
    public final void entryRuleMultiplicacaoOuDivisao() throws RecognitionException {
        try {
            // InternalPortugolCoral.g:379:1: ( ruleMultiplicacaoOuDivisao EOF )
            // InternalPortugolCoral.g:380:1: ruleMultiplicacaoOuDivisao EOF
            {
             before(grammarAccess.getMultiplicacaoOuDivisaoRule()); 
            pushFollow(FOLLOW_1);
            ruleMultiplicacaoOuDivisao();

            state._fsp--;

             after(grammarAccess.getMultiplicacaoOuDivisaoRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMultiplicacaoOuDivisao"


    // $ANTLR start "ruleMultiplicacaoOuDivisao"
    // InternalPortugolCoral.g:387:1: ruleMultiplicacaoOuDivisao : ( ( rule__MultiplicacaoOuDivisao__Group__0 ) ) ;
    public final void ruleMultiplicacaoOuDivisao() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolCoral.g:391:2: ( ( ( rule__MultiplicacaoOuDivisao__Group__0 ) ) )
            // InternalPortugolCoral.g:392:2: ( ( rule__MultiplicacaoOuDivisao__Group__0 ) )
            {
            // InternalPortugolCoral.g:392:2: ( ( rule__MultiplicacaoOuDivisao__Group__0 ) )
            // InternalPortugolCoral.g:393:3: ( rule__MultiplicacaoOuDivisao__Group__0 )
            {
             before(grammarAccess.getMultiplicacaoOuDivisaoAccess().getGroup()); 
            // InternalPortugolCoral.g:394:3: ( rule__MultiplicacaoOuDivisao__Group__0 )
            // InternalPortugolCoral.g:394:4: rule__MultiplicacaoOuDivisao__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MultiplicacaoOuDivisao__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMultiplicacaoOuDivisaoAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMultiplicacaoOuDivisao"


    // $ANTLR start "entryRuleSinal"
    // InternalPortugolCoral.g:403:1: entryRuleSinal : ruleSinal EOF ;
    public final void entryRuleSinal() throws RecognitionException {
        try {
            // InternalPortugolCoral.g:404:1: ( ruleSinal EOF )
            // InternalPortugolCoral.g:405:1: ruleSinal EOF
            {
             before(grammarAccess.getSinalRule()); 
            pushFollow(FOLLOW_1);
            ruleSinal();

            state._fsp--;

             after(grammarAccess.getSinalRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSinal"


    // $ANTLR start "ruleSinal"
    // InternalPortugolCoral.g:412:1: ruleSinal : ( ( rule__Sinal__Group__0 ) ) ;
    public final void ruleSinal() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolCoral.g:416:2: ( ( ( rule__Sinal__Group__0 ) ) )
            // InternalPortugolCoral.g:417:2: ( ( rule__Sinal__Group__0 ) )
            {
            // InternalPortugolCoral.g:417:2: ( ( rule__Sinal__Group__0 ) )
            // InternalPortugolCoral.g:418:3: ( rule__Sinal__Group__0 )
            {
             before(grammarAccess.getSinalAccess().getGroup()); 
            // InternalPortugolCoral.g:419:3: ( rule__Sinal__Group__0 )
            // InternalPortugolCoral.g:419:4: rule__Sinal__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Sinal__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSinalAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSinal"


    // $ANTLR start "entryRuleExponenciacao"
    // InternalPortugolCoral.g:428:1: entryRuleExponenciacao : ruleExponenciacao EOF ;
    public final void entryRuleExponenciacao() throws RecognitionException {
        try {
            // InternalPortugolCoral.g:429:1: ( ruleExponenciacao EOF )
            // InternalPortugolCoral.g:430:1: ruleExponenciacao EOF
            {
             before(grammarAccess.getExponenciacaoRule()); 
            pushFollow(FOLLOW_1);
            ruleExponenciacao();

            state._fsp--;

             after(grammarAccess.getExponenciacaoRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExponenciacao"


    // $ANTLR start "ruleExponenciacao"
    // InternalPortugolCoral.g:437:1: ruleExponenciacao : ( ( rule__Exponenciacao__Group__0 ) ) ;
    public final void ruleExponenciacao() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolCoral.g:441:2: ( ( ( rule__Exponenciacao__Group__0 ) ) )
            // InternalPortugolCoral.g:442:2: ( ( rule__Exponenciacao__Group__0 ) )
            {
            // InternalPortugolCoral.g:442:2: ( ( rule__Exponenciacao__Group__0 ) )
            // InternalPortugolCoral.g:443:3: ( rule__Exponenciacao__Group__0 )
            {
             before(grammarAccess.getExponenciacaoAccess().getGroup()); 
            // InternalPortugolCoral.g:444:3: ( rule__Exponenciacao__Group__0 )
            // InternalPortugolCoral.g:444:4: rule__Exponenciacao__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Exponenciacao__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExponenciacaoAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExponenciacao"


    // $ANTLR start "entryRuleElemento"
    // InternalPortugolCoral.g:453:1: entryRuleElemento : ruleElemento EOF ;
    public final void entryRuleElemento() throws RecognitionException {
        try {
            // InternalPortugolCoral.g:454:1: ( ruleElemento EOF )
            // InternalPortugolCoral.g:455:1: ruleElemento EOF
            {
             before(grammarAccess.getElementoRule()); 
            pushFollow(FOLLOW_1);
            ruleElemento();

            state._fsp--;

             after(grammarAccess.getElementoRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleElemento"


    // $ANTLR start "ruleElemento"
    // InternalPortugolCoral.g:462:1: ruleElemento : ( ( rule__Elemento__Alternatives ) ) ;
    public final void ruleElemento() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolCoral.g:466:2: ( ( ( rule__Elemento__Alternatives ) ) )
            // InternalPortugolCoral.g:467:2: ( ( rule__Elemento__Alternatives ) )
            {
            // InternalPortugolCoral.g:467:2: ( ( rule__Elemento__Alternatives ) )
            // InternalPortugolCoral.g:468:3: ( rule__Elemento__Alternatives )
            {
             before(grammarAccess.getElementoAccess().getAlternatives()); 
            // InternalPortugolCoral.g:469:3: ( rule__Elemento__Alternatives )
            // InternalPortugolCoral.g:469:4: rule__Elemento__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Elemento__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getElementoAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleElemento"


    // $ANTLR start "entryRuleElementoParenteses"
    // InternalPortugolCoral.g:478:1: entryRuleElementoParenteses : ruleElementoParenteses EOF ;
    public final void entryRuleElementoParenteses() throws RecognitionException {
        try {
            // InternalPortugolCoral.g:479:1: ( ruleElementoParenteses EOF )
            // InternalPortugolCoral.g:480:1: ruleElementoParenteses EOF
            {
             before(grammarAccess.getElementoParentesesRule()); 
            pushFollow(FOLLOW_1);
            ruleElementoParenteses();

            state._fsp--;

             after(grammarAccess.getElementoParentesesRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleElementoParenteses"


    // $ANTLR start "ruleElementoParenteses"
    // InternalPortugolCoral.g:487:1: ruleElementoParenteses : ( ( rule__ElementoParenteses__DireitaAssignment ) ) ;
    public final void ruleElementoParenteses() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolCoral.g:491:2: ( ( ( rule__ElementoParenteses__DireitaAssignment ) ) )
            // InternalPortugolCoral.g:492:2: ( ( rule__ElementoParenteses__DireitaAssignment ) )
            {
            // InternalPortugolCoral.g:492:2: ( ( rule__ElementoParenteses__DireitaAssignment ) )
            // InternalPortugolCoral.g:493:3: ( rule__ElementoParenteses__DireitaAssignment )
            {
             before(grammarAccess.getElementoParentesesAccess().getDireitaAssignment()); 
            // InternalPortugolCoral.g:494:3: ( rule__ElementoParenteses__DireitaAssignment )
            // InternalPortugolCoral.g:494:4: rule__ElementoParenteses__DireitaAssignment
            {
            pushFollow(FOLLOW_2);
            rule__ElementoParenteses__DireitaAssignment();

            state._fsp--;


            }

             after(grammarAccess.getElementoParentesesAccess().getDireitaAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleElementoParenteses"


    // $ANTLR start "entryRuleParenteses"
    // InternalPortugolCoral.g:503:1: entryRuleParenteses : ruleParenteses EOF ;
    public final void entryRuleParenteses() throws RecognitionException {
        try {
            // InternalPortugolCoral.g:504:1: ( ruleParenteses EOF )
            // InternalPortugolCoral.g:505:1: ruleParenteses EOF
            {
             before(grammarAccess.getParentesesRule()); 
            pushFollow(FOLLOW_1);
            ruleParenteses();

            state._fsp--;

             after(grammarAccess.getParentesesRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleParenteses"


    // $ANTLR start "ruleParenteses"
    // InternalPortugolCoral.g:512:1: ruleParenteses : ( ( rule__Parenteses__Group__0 ) ) ;
    public final void ruleParenteses() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolCoral.g:516:2: ( ( ( rule__Parenteses__Group__0 ) ) )
            // InternalPortugolCoral.g:517:2: ( ( rule__Parenteses__Group__0 ) )
            {
            // InternalPortugolCoral.g:517:2: ( ( rule__Parenteses__Group__0 ) )
            // InternalPortugolCoral.g:518:3: ( rule__Parenteses__Group__0 )
            {
             before(grammarAccess.getParentesesAccess().getGroup()); 
            // InternalPortugolCoral.g:519:3: ( rule__Parenteses__Group__0 )
            // InternalPortugolCoral.g:519:4: rule__Parenteses__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Parenteses__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParentesesAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParenteses"


    // $ANTLR start "entryRuleMatriz"
    // InternalPortugolCoral.g:528:1: entryRuleMatriz : ruleMatriz EOF ;
    public final void entryRuleMatriz() throws RecognitionException {
        try {
            // InternalPortugolCoral.g:529:1: ( ruleMatriz EOF )
            // InternalPortugolCoral.g:530:1: ruleMatriz EOF
            {
             before(grammarAccess.getMatrizRule()); 
            pushFollow(FOLLOW_1);
            ruleMatriz();

            state._fsp--;

             after(grammarAccess.getMatrizRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMatriz"


    // $ANTLR start "ruleMatriz"
    // InternalPortugolCoral.g:537:1: ruleMatriz : ( ( rule__Matriz__Group__0 ) ) ;
    public final void ruleMatriz() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolCoral.g:541:2: ( ( ( rule__Matriz__Group__0 ) ) )
            // InternalPortugolCoral.g:542:2: ( ( rule__Matriz__Group__0 ) )
            {
            // InternalPortugolCoral.g:542:2: ( ( rule__Matriz__Group__0 ) )
            // InternalPortugolCoral.g:543:3: ( rule__Matriz__Group__0 )
            {
             before(grammarAccess.getMatrizAccess().getGroup()); 
            // InternalPortugolCoral.g:544:3: ( rule__Matriz__Group__0 )
            // InternalPortugolCoral.g:544:4: rule__Matriz__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Matriz__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMatrizAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMatriz"


    // $ANTLR start "entryRulePosicaoMatriz"
    // InternalPortugolCoral.g:553:1: entryRulePosicaoMatriz : rulePosicaoMatriz EOF ;
    public final void entryRulePosicaoMatriz() throws RecognitionException {
        try {
            // InternalPortugolCoral.g:554:1: ( rulePosicaoMatriz EOF )
            // InternalPortugolCoral.g:555:1: rulePosicaoMatriz EOF
            {
             before(grammarAccess.getPosicaoMatrizRule()); 
            pushFollow(FOLLOW_1);
            rulePosicaoMatriz();

            state._fsp--;

             after(grammarAccess.getPosicaoMatrizRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePosicaoMatriz"


    // $ANTLR start "rulePosicaoMatriz"
    // InternalPortugolCoral.g:562:1: rulePosicaoMatriz : ( ( rule__PosicaoMatriz__Group__0 ) ) ;
    public final void rulePosicaoMatriz() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolCoral.g:566:2: ( ( ( rule__PosicaoMatriz__Group__0 ) ) )
            // InternalPortugolCoral.g:567:2: ( ( rule__PosicaoMatriz__Group__0 ) )
            {
            // InternalPortugolCoral.g:567:2: ( ( rule__PosicaoMatriz__Group__0 ) )
            // InternalPortugolCoral.g:568:3: ( rule__PosicaoMatriz__Group__0 )
            {
             before(grammarAccess.getPosicaoMatrizAccess().getGroup()); 
            // InternalPortugolCoral.g:569:3: ( rule__PosicaoMatriz__Group__0 )
            // InternalPortugolCoral.g:569:4: rule__PosicaoMatriz__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PosicaoMatriz__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPosicaoMatrizAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePosicaoMatriz"


    // $ANTLR start "entryRuleElementoAtomico"
    // InternalPortugolCoral.g:578:1: entryRuleElementoAtomico : ruleElementoAtomico EOF ;
    public final void entryRuleElementoAtomico() throws RecognitionException {
        try {
            // InternalPortugolCoral.g:579:1: ( ruleElementoAtomico EOF )
            // InternalPortugolCoral.g:580:1: ruleElementoAtomico EOF
            {
             before(grammarAccess.getElementoAtomicoRule()); 
            pushFollow(FOLLOW_1);
            ruleElementoAtomico();

            state._fsp--;

             after(grammarAccess.getElementoAtomicoRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleElementoAtomico"


    // $ANTLR start "ruleElementoAtomico"
    // InternalPortugolCoral.g:587:1: ruleElementoAtomico : ( ( rule__ElementoAtomico__Alternatives ) ) ;
    public final void ruleElementoAtomico() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolCoral.g:591:2: ( ( ( rule__ElementoAtomico__Alternatives ) ) )
            // InternalPortugolCoral.g:592:2: ( ( rule__ElementoAtomico__Alternatives ) )
            {
            // InternalPortugolCoral.g:592:2: ( ( rule__ElementoAtomico__Alternatives ) )
            // InternalPortugolCoral.g:593:3: ( rule__ElementoAtomico__Alternatives )
            {
             before(grammarAccess.getElementoAtomicoAccess().getAlternatives()); 
            // InternalPortugolCoral.g:594:3: ( rule__ElementoAtomico__Alternatives )
            // InternalPortugolCoral.g:594:4: rule__ElementoAtomico__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ElementoAtomico__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getElementoAtomicoAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleElementoAtomico"


    // $ANTLR start "rule__Acoes__Alternatives"
    // InternalPortugolCoral.g:602:1: rule__Acoes__Alternatives : ( ( ruleDeclararVariaveis ) | ( ruleAtribuir ) );
    public final void rule__Acoes__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolCoral.g:606:1: ( ( ruleDeclararVariaveis ) | ( ruleAtribuir ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=13 && LA2_0<=14)||LA2_0==36) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_ID||(LA2_0>=20 && LA2_0<=21)) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalPortugolCoral.g:607:2: ( ruleDeclararVariaveis )
                    {
                    // InternalPortugolCoral.g:607:2: ( ruleDeclararVariaveis )
                    // InternalPortugolCoral.g:608:3: ruleDeclararVariaveis
                    {
                     before(grammarAccess.getAcoesAccess().getDeclararVariaveisParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleDeclararVariaveis();

                    state._fsp--;

                     after(grammarAccess.getAcoesAccess().getDeclararVariaveisParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPortugolCoral.g:613:2: ( ruleAtribuir )
                    {
                    // InternalPortugolCoral.g:613:2: ( ruleAtribuir )
                    // InternalPortugolCoral.g:614:3: ruleAtribuir
                    {
                     before(grammarAccess.getAcoesAccess().getAtribuirParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleAtribuir();

                    state._fsp--;

                     after(grammarAccess.getAcoesAccess().getAtribuirParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Acoes__Alternatives"


    // $ANTLR start "rule__DeclararVariaveis__Alternatives_1"
    // InternalPortugolCoral.g:623:1: rule__DeclararVariaveis__Alternatives_1 : ( ( 'variaveis' ) | ( 'vari\\u00E1veis' ) );
    public final void rule__DeclararVariaveis__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolCoral.g:627:1: ( ( 'variaveis' ) | ( 'vari\\u00E1veis' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==13) ) {
                alt3=1;
            }
            else if ( (LA3_0==14) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalPortugolCoral.g:628:2: ( 'variaveis' )
                    {
                    // InternalPortugolCoral.g:628:2: ( 'variaveis' )
                    // InternalPortugolCoral.g:629:3: 'variaveis'
                    {
                     before(grammarAccess.getDeclararVariaveisAccess().getVariaveisKeyword_1_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getDeclararVariaveisAccess().getVariaveisKeyword_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPortugolCoral.g:634:2: ( 'vari\\u00E1veis' )
                    {
                    // InternalPortugolCoral.g:634:2: ( 'vari\\u00E1veis' )
                    // InternalPortugolCoral.g:635:3: 'vari\\u00E1veis'
                    {
                     before(grammarAccess.getDeclararVariaveisAccess().getVariVeisKeyword_1_1()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getDeclararVariaveisAccess().getVariVeisKeyword_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclararVariaveis__Alternatives_1"


    // $ANTLR start "rule__TipoVariavel__Alternatives"
    // InternalPortugolCoral.g:644:1: rule__TipoVariavel__Alternatives : ( ( 'int' ) | ( 'real' ) | ( 'texto' ) | ( 'logico' ) | ( 'l\\u00F3gico' ) );
    public final void rule__TipoVariavel__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolCoral.g:648:1: ( ( 'int' ) | ( 'real' ) | ( 'texto' ) | ( 'logico' ) | ( 'l\\u00F3gico' ) )
            int alt4=5;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt4=1;
                }
                break;
            case 16:
                {
                alt4=2;
                }
                break;
            case 17:
                {
                alt4=3;
                }
                break;
            case 18:
                {
                alt4=4;
                }
                break;
            case 19:
                {
                alt4=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalPortugolCoral.g:649:2: ( 'int' )
                    {
                    // InternalPortugolCoral.g:649:2: ( 'int' )
                    // InternalPortugolCoral.g:650:3: 'int'
                    {
                     before(grammarAccess.getTipoVariavelAccess().getIntKeyword_0()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getTipoVariavelAccess().getIntKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPortugolCoral.g:655:2: ( 'real' )
                    {
                    // InternalPortugolCoral.g:655:2: ( 'real' )
                    // InternalPortugolCoral.g:656:3: 'real'
                    {
                     before(grammarAccess.getTipoVariavelAccess().getRealKeyword_1()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getTipoVariavelAccess().getRealKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalPortugolCoral.g:661:2: ( 'texto' )
                    {
                    // InternalPortugolCoral.g:661:2: ( 'texto' )
                    // InternalPortugolCoral.g:662:3: 'texto'
                    {
                     before(grammarAccess.getTipoVariavelAccess().getTextoKeyword_2()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getTipoVariavelAccess().getTextoKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalPortugolCoral.g:667:2: ( 'logico' )
                    {
                    // InternalPortugolCoral.g:667:2: ( 'logico' )
                    // InternalPortugolCoral.g:668:3: 'logico'
                    {
                     before(grammarAccess.getTipoVariavelAccess().getLogicoKeyword_3()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getTipoVariavelAccess().getLogicoKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalPortugolCoral.g:673:2: ( 'l\\u00F3gico' )
                    {
                    // InternalPortugolCoral.g:673:2: ( 'l\\u00F3gico' )
                    // InternalPortugolCoral.g:674:3: 'l\\u00F3gico'
                    {
                     before(grammarAccess.getTipoVariavelAccess().getLGicoKeyword_4()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getTipoVariavelAccess().getLGicoKeyword_4()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TipoVariavel__Alternatives"


    // $ANTLR start "rule__Atribuir__Alternatives_1"
    // InternalPortugolCoral.g:683:1: rule__Atribuir__Alternatives_1 : ( ( 'faca' ) | ( 'fa\\u00E7a' ) );
    public final void rule__Atribuir__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolCoral.g:687:1: ( ( 'faca' ) | ( 'fa\\u00E7a' ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==20) ) {
                alt5=1;
            }
            else if ( (LA5_0==21) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalPortugolCoral.g:688:2: ( 'faca' )
                    {
                    // InternalPortugolCoral.g:688:2: ( 'faca' )
                    // InternalPortugolCoral.g:689:3: 'faca'
                    {
                     before(grammarAccess.getAtribuirAccess().getFacaKeyword_1_0()); 
                    match(input,20,FOLLOW_2); 
                     after(grammarAccess.getAtribuirAccess().getFacaKeyword_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPortugolCoral.g:694:2: ( 'fa\\u00E7a' )
                    {
                    // InternalPortugolCoral.g:694:2: ( 'fa\\u00E7a' )
                    // InternalPortugolCoral.g:695:3: 'fa\\u00E7a'
                    {
                     before(grammarAccess.getAtribuirAccess().getFaAKeyword_1_1()); 
                    match(input,21,FOLLOW_2); 
                     after(grammarAccess.getAtribuirAccess().getFaAKeyword_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atribuir__Alternatives_1"


    // $ANTLR start "rule__Nao__NaosAlternatives_0_0"
    // InternalPortugolCoral.g:704:1: rule__Nao__NaosAlternatives_0_0 : ( ( 'nao' ) | ( 'n\\u00E3o' ) );
    public final void rule__Nao__NaosAlternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolCoral.g:708:1: ( ( 'nao' ) | ( 'n\\u00E3o' ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==22) ) {
                alt6=1;
            }
            else if ( (LA6_0==23) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalPortugolCoral.g:709:2: ( 'nao' )
                    {
                    // InternalPortugolCoral.g:709:2: ( 'nao' )
                    // InternalPortugolCoral.g:710:3: 'nao'
                    {
                     before(grammarAccess.getNaoAccess().getNaosNaoKeyword_0_0_0()); 
                    match(input,22,FOLLOW_2); 
                     after(grammarAccess.getNaoAccess().getNaosNaoKeyword_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPortugolCoral.g:715:2: ( 'n\\u00E3o' )
                    {
                    // InternalPortugolCoral.g:715:2: ( 'n\\u00E3o' )
                    // InternalPortugolCoral.g:716:3: 'n\\u00E3o'
                    {
                     before(grammarAccess.getNaoAccess().getNaosNOKeyword_0_0_1()); 
                    match(input,23,FOLLOW_2); 
                     after(grammarAccess.getNaoAccess().getNaosNOKeyword_0_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Nao__NaosAlternatives_0_0"


    // $ANTLR start "rule__Comparacao__ComparacaoAlternatives_1_1_0"
    // InternalPortugolCoral.g:725:1: rule__Comparacao__ComparacaoAlternatives_1_1_0 : ( ( '<=' ) | ( '==' ) | ( '>=' ) | ( '<' ) | ( '>' ) | ( '!=' ) );
    public final void rule__Comparacao__ComparacaoAlternatives_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolCoral.g:729:1: ( ( '<=' ) | ( '==' ) | ( '>=' ) | ( '<' ) | ( '>' ) | ( '!=' ) )
            int alt7=6;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt7=1;
                }
                break;
            case 25:
                {
                alt7=2;
                }
                break;
            case 26:
                {
                alt7=3;
                }
                break;
            case 27:
                {
                alt7=4;
                }
                break;
            case 28:
                {
                alt7=5;
                }
                break;
            case 29:
                {
                alt7=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalPortugolCoral.g:730:2: ( '<=' )
                    {
                    // InternalPortugolCoral.g:730:2: ( '<=' )
                    // InternalPortugolCoral.g:731:3: '<='
                    {
                     before(grammarAccess.getComparacaoAccess().getComparacaoLessThanSignEqualsSignKeyword_1_1_0_0()); 
                    match(input,24,FOLLOW_2); 
                     after(grammarAccess.getComparacaoAccess().getComparacaoLessThanSignEqualsSignKeyword_1_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPortugolCoral.g:736:2: ( '==' )
                    {
                    // InternalPortugolCoral.g:736:2: ( '==' )
                    // InternalPortugolCoral.g:737:3: '=='
                    {
                     before(grammarAccess.getComparacaoAccess().getComparacaoEqualsSignEqualsSignKeyword_1_1_0_1()); 
                    match(input,25,FOLLOW_2); 
                     after(grammarAccess.getComparacaoAccess().getComparacaoEqualsSignEqualsSignKeyword_1_1_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalPortugolCoral.g:742:2: ( '>=' )
                    {
                    // InternalPortugolCoral.g:742:2: ( '>=' )
                    // InternalPortugolCoral.g:743:3: '>='
                    {
                     before(grammarAccess.getComparacaoAccess().getComparacaoGreaterThanSignEqualsSignKeyword_1_1_0_2()); 
                    match(input,26,FOLLOW_2); 
                     after(grammarAccess.getComparacaoAccess().getComparacaoGreaterThanSignEqualsSignKeyword_1_1_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalPortugolCoral.g:748:2: ( '<' )
                    {
                    // InternalPortugolCoral.g:748:2: ( '<' )
                    // InternalPortugolCoral.g:749:3: '<'
                    {
                     before(grammarAccess.getComparacaoAccess().getComparacaoLessThanSignKeyword_1_1_0_3()); 
                    match(input,27,FOLLOW_2); 
                     after(grammarAccess.getComparacaoAccess().getComparacaoLessThanSignKeyword_1_1_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalPortugolCoral.g:754:2: ( '>' )
                    {
                    // InternalPortugolCoral.g:754:2: ( '>' )
                    // InternalPortugolCoral.g:755:3: '>'
                    {
                     before(grammarAccess.getComparacaoAccess().getComparacaoGreaterThanSignKeyword_1_1_0_4()); 
                    match(input,28,FOLLOW_2); 
                     after(grammarAccess.getComparacaoAccess().getComparacaoGreaterThanSignKeyword_1_1_0_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalPortugolCoral.g:760:2: ( '!=' )
                    {
                    // InternalPortugolCoral.g:760:2: ( '!=' )
                    // InternalPortugolCoral.g:761:3: '!='
                    {
                     before(grammarAccess.getComparacaoAccess().getComparacaoExclamationMarkEqualsSignKeyword_1_1_0_5()); 
                    match(input,29,FOLLOW_2); 
                     after(grammarAccess.getComparacaoAccess().getComparacaoExclamationMarkEqualsSignKeyword_1_1_0_5()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparacao__ComparacaoAlternatives_1_1_0"


    // $ANTLR start "rule__AdicaoOuSubtracao__OperacaoAlternatives_1_1_0"
    // InternalPortugolCoral.g:770:1: rule__AdicaoOuSubtracao__OperacaoAlternatives_1_1_0 : ( ( '+' ) | ( '-' ) );
    public final void rule__AdicaoOuSubtracao__OperacaoAlternatives_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolCoral.g:774:1: ( ( '+' ) | ( '-' ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==30) ) {
                alt8=1;
            }
            else if ( (LA8_0==31) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalPortugolCoral.g:775:2: ( '+' )
                    {
                    // InternalPortugolCoral.g:775:2: ( '+' )
                    // InternalPortugolCoral.g:776:3: '+'
                    {
                     before(grammarAccess.getAdicaoOuSubtracaoAccess().getOperacaoPlusSignKeyword_1_1_0_0()); 
                    match(input,30,FOLLOW_2); 
                     after(grammarAccess.getAdicaoOuSubtracaoAccess().getOperacaoPlusSignKeyword_1_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPortugolCoral.g:781:2: ( '-' )
                    {
                    // InternalPortugolCoral.g:781:2: ( '-' )
                    // InternalPortugolCoral.g:782:3: '-'
                    {
                     before(grammarAccess.getAdicaoOuSubtracaoAccess().getOperacaoHyphenMinusKeyword_1_1_0_1()); 
                    match(input,31,FOLLOW_2); 
                     after(grammarAccess.getAdicaoOuSubtracaoAccess().getOperacaoHyphenMinusKeyword_1_1_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdicaoOuSubtracao__OperacaoAlternatives_1_1_0"


    // $ANTLR start "rule__MultiplicacaoOuDivisao__OperacaoAlternatives_1_1_0"
    // InternalPortugolCoral.g:791:1: rule__MultiplicacaoOuDivisao__OperacaoAlternatives_1_1_0 : ( ( '*' ) | ( '/' ) | ( '//' ) | ( '%' ) );
    public final void rule__MultiplicacaoOuDivisao__OperacaoAlternatives_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolCoral.g:795:1: ( ( '*' ) | ( '/' ) | ( '//' ) | ( '%' ) )
            int alt9=4;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt9=1;
                }
                break;
            case 33:
                {
                alt9=2;
                }
                break;
            case 34:
                {
                alt9=3;
                }
                break;
            case 35:
                {
                alt9=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalPortugolCoral.g:796:2: ( '*' )
                    {
                    // InternalPortugolCoral.g:796:2: ( '*' )
                    // InternalPortugolCoral.g:797:3: '*'
                    {
                     before(grammarAccess.getMultiplicacaoOuDivisaoAccess().getOperacaoAsteriskKeyword_1_1_0_0()); 
                    match(input,32,FOLLOW_2); 
                     after(grammarAccess.getMultiplicacaoOuDivisaoAccess().getOperacaoAsteriskKeyword_1_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPortugolCoral.g:802:2: ( '/' )
                    {
                    // InternalPortugolCoral.g:802:2: ( '/' )
                    // InternalPortugolCoral.g:803:3: '/'
                    {
                     before(grammarAccess.getMultiplicacaoOuDivisaoAccess().getOperacaoSolidusKeyword_1_1_0_1()); 
                    match(input,33,FOLLOW_2); 
                     after(grammarAccess.getMultiplicacaoOuDivisaoAccess().getOperacaoSolidusKeyword_1_1_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalPortugolCoral.g:808:2: ( '//' )
                    {
                    // InternalPortugolCoral.g:808:2: ( '//' )
                    // InternalPortugolCoral.g:809:3: '//'
                    {
                     before(grammarAccess.getMultiplicacaoOuDivisaoAccess().getOperacaoSolidusSolidusKeyword_1_1_0_2()); 
                    match(input,34,FOLLOW_2); 
                     after(grammarAccess.getMultiplicacaoOuDivisaoAccess().getOperacaoSolidusSolidusKeyword_1_1_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalPortugolCoral.g:814:2: ( '%' )
                    {
                    // InternalPortugolCoral.g:814:2: ( '%' )
                    // InternalPortugolCoral.g:815:3: '%'
                    {
                     before(grammarAccess.getMultiplicacaoOuDivisaoAccess().getOperacaoPercentSignKeyword_1_1_0_3()); 
                    match(input,35,FOLLOW_2); 
                     after(grammarAccess.getMultiplicacaoOuDivisaoAccess().getOperacaoPercentSignKeyword_1_1_0_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicacaoOuDivisao__OperacaoAlternatives_1_1_0"


    // $ANTLR start "rule__Sinal__SinaisAlternatives_0_0"
    // InternalPortugolCoral.g:824:1: rule__Sinal__SinaisAlternatives_0_0 : ( ( '+' ) | ( '-' ) );
    public final void rule__Sinal__SinaisAlternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolCoral.g:828:1: ( ( '+' ) | ( '-' ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==30) ) {
                alt10=1;
            }
            else if ( (LA10_0==31) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalPortugolCoral.g:829:2: ( '+' )
                    {
                    // InternalPortugolCoral.g:829:2: ( '+' )
                    // InternalPortugolCoral.g:830:3: '+'
                    {
                     before(grammarAccess.getSinalAccess().getSinaisPlusSignKeyword_0_0_0()); 
                    match(input,30,FOLLOW_2); 
                     after(grammarAccess.getSinalAccess().getSinaisPlusSignKeyword_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPortugolCoral.g:835:2: ( '-' )
                    {
                    // InternalPortugolCoral.g:835:2: ( '-' )
                    // InternalPortugolCoral.g:836:3: '-'
                    {
                     before(grammarAccess.getSinalAccess().getSinaisHyphenMinusKeyword_0_0_1()); 
                    match(input,31,FOLLOW_2); 
                     after(grammarAccess.getSinalAccess().getSinaisHyphenMinusKeyword_0_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sinal__SinaisAlternatives_0_0"


    // $ANTLR start "rule__Elemento__Alternatives"
    // InternalPortugolCoral.g:845:1: rule__Elemento__Alternatives : ( ( ruleElementoParenteses ) | ( ruleElementoAtomico ) | ( ruleMatriz ) );
    public final void rule__Elemento__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolCoral.g:849:1: ( ( ruleElementoParenteses ) | ( ruleElementoAtomico ) | ( ruleMatriz ) )
            int alt11=3;
            switch ( input.LA(1) ) {
            case 46:
                {
                alt11=1;
                }
                break;
            case RULE_INT:
            case RULE_REAL:
            case RULE_TEXTO:
                {
                alt11=2;
                }
                break;
            case RULE_ID:
                {
                int LA11_3 = input.LA(2);

                if ( (LA11_3==EOF||LA11_3==RULE_ID||(LA11_3>=13 && LA11_3<=14)||(LA11_3>=20 && LA11_3<=21)||(LA11_3>=24 && LA11_3<=36)||(LA11_3>=42 && LA11_3<=45)||LA11_3==47||LA11_3==49) ) {
                    alt11=2;
                }
                else if ( (LA11_3==48) ) {
                    alt11=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 3, input);

                    throw nvae;
                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalPortugolCoral.g:850:2: ( ruleElementoParenteses )
                    {
                    // InternalPortugolCoral.g:850:2: ( ruleElementoParenteses )
                    // InternalPortugolCoral.g:851:3: ruleElementoParenteses
                    {
                     before(grammarAccess.getElementoAccess().getElementoParentesesParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleElementoParenteses();

                    state._fsp--;

                     after(grammarAccess.getElementoAccess().getElementoParentesesParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPortugolCoral.g:856:2: ( ruleElementoAtomico )
                    {
                    // InternalPortugolCoral.g:856:2: ( ruleElementoAtomico )
                    // InternalPortugolCoral.g:857:3: ruleElementoAtomico
                    {
                     before(grammarAccess.getElementoAccess().getElementoAtomicoParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleElementoAtomico();

                    state._fsp--;

                     after(grammarAccess.getElementoAccess().getElementoAtomicoParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalPortugolCoral.g:862:2: ( ruleMatriz )
                    {
                    // InternalPortugolCoral.g:862:2: ( ruleMatriz )
                    // InternalPortugolCoral.g:863:3: ruleMatriz
                    {
                     before(grammarAccess.getElementoAccess().getMatrizParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleMatriz();

                    state._fsp--;

                     after(grammarAccess.getElementoAccess().getMatrizParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Elemento__Alternatives"


    // $ANTLR start "rule__ElementoAtomico__Alternatives"
    // InternalPortugolCoral.g:872:1: rule__ElementoAtomico__Alternatives : ( ( ( rule__ElementoAtomico__Group_0__0 ) ) | ( ( rule__ElementoAtomico__Group_1__0 ) ) | ( ( rule__ElementoAtomico__Group_2__0 ) ) | ( ( rule__ElementoAtomico__Group_3__0 ) ) );
    public final void rule__ElementoAtomico__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolCoral.g:876:1: ( ( ( rule__ElementoAtomico__Group_0__0 ) ) | ( ( rule__ElementoAtomico__Group_1__0 ) ) | ( ( rule__ElementoAtomico__Group_2__0 ) ) | ( ( rule__ElementoAtomico__Group_3__0 ) ) )
            int alt12=4;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt12=1;
                }
                break;
            case RULE_REAL:
                {
                alt12=2;
                }
                break;
            case RULE_TEXTO:
                {
                alt12=3;
                }
                break;
            case RULE_ID:
                {
                alt12=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalPortugolCoral.g:877:2: ( ( rule__ElementoAtomico__Group_0__0 ) )
                    {
                    // InternalPortugolCoral.g:877:2: ( ( rule__ElementoAtomico__Group_0__0 ) )
                    // InternalPortugolCoral.g:878:3: ( rule__ElementoAtomico__Group_0__0 )
                    {
                     before(grammarAccess.getElementoAtomicoAccess().getGroup_0()); 
                    // InternalPortugolCoral.g:879:3: ( rule__ElementoAtomico__Group_0__0 )
                    // InternalPortugolCoral.g:879:4: rule__ElementoAtomico__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ElementoAtomico__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getElementoAtomicoAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPortugolCoral.g:883:2: ( ( rule__ElementoAtomico__Group_1__0 ) )
                    {
                    // InternalPortugolCoral.g:883:2: ( ( rule__ElementoAtomico__Group_1__0 ) )
                    // InternalPortugolCoral.g:884:3: ( rule__ElementoAtomico__Group_1__0 )
                    {
                     before(grammarAccess.getElementoAtomicoAccess().getGroup_1()); 
                    // InternalPortugolCoral.g:885:3: ( rule__ElementoAtomico__Group_1__0 )
                    // InternalPortugolCoral.g:885:4: rule__ElementoAtomico__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ElementoAtomico__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getElementoAtomicoAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalPortugolCoral.g:889:2: ( ( rule__ElementoAtomico__Group_2__0 ) )
                    {
                    // InternalPortugolCoral.g:889:2: ( ( rule__ElementoAtomico__Group_2__0 ) )
                    // InternalPortugolCoral.g:890:3: ( rule__ElementoAtomico__Group_2__0 )
                    {
                     before(grammarAccess.getElementoAtomicoAccess().getGroup_2()); 
                    // InternalPortugolCoral.g:891:3: ( rule__ElementoAtomico__Group_2__0 )
                    // InternalPortugolCoral.g:891:4: rule__ElementoAtomico__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ElementoAtomico__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getElementoAtomicoAccess().getGroup_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalPortugolCoral.g:895:2: ( ( rule__ElementoAtomico__Group_3__0 ) )
                    {
                    // InternalPortugolCoral.g:895:2: ( ( rule__ElementoAtomico__Group_3__0 ) )
                    // InternalPortugolCoral.g:896:3: ( rule__ElementoAtomico__Group_3__0 )
                    {
                     before(grammarAccess.getElementoAtomicoAccess().getGroup_3()); 
                    // InternalPortugolCoral.g:897:3: ( rule__ElementoAtomico__Group_3__0 )
                    // InternalPortugolCoral.g:897:4: rule__ElementoAtomico__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ElementoAtomico__Group_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getElementoAtomicoAccess().getGroup_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElementoAtomico__Alternatives"


    // $ANTLR start "rule__DeclararVariaveis__Group__0"
    // InternalPortugolCoral.g:905:1: rule__DeclararVariaveis__Group__0 : rule__DeclararVariaveis__Group__0__Impl rule__DeclararVariaveis__Group__1 ;
    public final void rule__DeclararVariaveis__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolCoral.g:909:1: ( rule__DeclararVariaveis__Group__0__Impl rule__DeclararVariaveis__Group__1 )
            // InternalPortugolCoral.g:910:2: rule__DeclararVariaveis__Group__0__Impl rule__DeclararVariaveis__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__DeclararVariaveis__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DeclararVariaveis__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclararVariaveis__Group__0"


    // $ANTLR start "rule__DeclararVariaveis__Group__0__Impl"
    // InternalPortugolCoral.g:917:1: rule__DeclararVariaveis__Group__0__Impl : ( ( 'crie' )? ) ;
    public final void rule__DeclararVariaveis__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolCoral.g:921:1: ( ( ( 'crie' )? ) )
            // InternalPortugolCoral.g:922:1: ( ( 'crie' )? )
            {
            // InternalPortugolCoral.g:922:1: ( ( 'crie' )? )
            // InternalPortugolCoral.g:923:2: ( 'crie' )?
            {
             before(grammarAccess.getDeclararVariaveisAccess().getCrieKeyword_0()); 
            // InternalPortugolCoral.g:924:2: ( 'crie' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==36) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalPortugolCoral.g:924:3: 'crie'
                    {
                    match(input,36,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getDeclararVariaveisAccess().getCrieKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclararVariaveis__Group__0__Impl"


    // $ANTLR start "rule__DeclararVariaveis__Group__1"
    // InternalPortugolCoral.g:932:1: rule__DeclararVariaveis__Group__1 : rule__DeclararVariaveis__Group__1__Impl rule__DeclararVariaveis__Group__2 ;
    public final void rule__DeclararVariaveis__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolCoral.g:936:1: ( rule__DeclararVariaveis__Group__1__Impl rule__DeclararVariaveis__Group__2 )
            // InternalPortugolCoral.g:937:2: rule__DeclararVariaveis__Group__1__Impl rule__DeclararVariaveis__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__DeclararVariaveis__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DeclararVariaveis__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclararVariaveis__Group__1"


    // $ANTLR start "rule__DeclararVariaveis__Group__1__Impl"
    // InternalPortugolCoral.g:944:1: rule__DeclararVariaveis__Group__1__Impl : ( ( rule__DeclararVariaveis__Alternatives_1 ) ) ;
    public final void rule__DeclararVariaveis__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolCoral.g:948:1: ( ( ( rule__DeclararVariaveis__Alternatives_1 ) ) )
            // InternalPortugolCoral.g:949:1: ( ( rule__DeclararVariaveis__Alternatives_1 ) )
            {
            // InternalPortugolCoral.g:949:1: ( ( rule__DeclararVariaveis__Alternatives_1 ) )
            // InternalPortugolCoral.g:950:2: ( rule__DeclararVariaveis__Alternatives_1 )
            {
             before(grammarAccess.getDeclararVariaveisAccess().getAlternatives_1()); 
            // InternalPortugolCoral.g:951:2: ( rule__DeclararVariaveis__Alternatives_1 )
            // InternalPortugolCoral.g:951:3: rule__DeclararVariaveis__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__DeclararVariaveis__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getDeclararVariaveisAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclararVariaveis__Group__1__Impl"


    // $ANTLR start "rule__DeclararVariaveis__Group__2"
    // InternalPortugolCoral.g:959:1: rule__DeclararVariaveis__Group__2 : rule__DeclararVariaveis__Group__2__Impl rule__DeclararVariaveis__Group__3 ;
    public final void rule__DeclararVariaveis__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolCoral.g:963:1: ( rule__DeclararVariaveis__Group__2__Impl rule__DeclararVariaveis__Group__3 )
            // InternalPortugolCoral.g:964:2: rule__DeclararVariaveis__Group__2__Impl rule__DeclararVariaveis__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__DeclararVariaveis__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DeclararVariaveis__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclararVariaveis__Group__2"


    // $ANTLR start "rule__DeclararVariaveis__Group__2__Impl"
    // InternalPortugolCoral.g:971:1: rule__DeclararVariaveis__Group__2__Impl : ( '{' ) ;
    public final void rule__DeclararVariaveis__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolCoral.g:975:1: ( ( '{' ) )
            // InternalPortugolCoral.g:976:1: ( '{' )
            {
            // InternalPortugolCoral.g:976:1: ( '{' )
            // InternalPortugolCoral.g:977:2: '{'
            {
             before(grammarAccess.getDeclararVariaveisAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getDeclararVariaveisAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclararVariaveis__Group__2__Impl"


    // $ANTLR start "rule__DeclararVariaveis__Group__3"
    // InternalPortugolCoral.g:986:1: rule__DeclararVariaveis__Group__3 : rule__DeclararVariaveis__Group__3__Impl rule__DeclararVariaveis__Group__4 ;
    public final void rule__DeclararVariaveis__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolCoral.g:990:1: ( rule__DeclararVariaveis__Group__3__Impl rule__DeclararVariaveis__Group__4 )
            // InternalPortugolCoral.g:991:2: rule__DeclararVariaveis__Group__3__Impl rule__DeclararVariaveis__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__DeclararVariaveis__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DeclararVariaveis__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclararVariaveis__Group__3"


    // $ANTLR start "rule__DeclararVariaveis__Group__3__Impl"
    // InternalPortugolCoral.g:998:1: rule__DeclararVariaveis__Group__3__Impl : ( ( ( rule__DeclararVariaveis__ElementosAssignment_3 ) ) ( ( rule__DeclararVariaveis__ElementosAssignment_3 )* ) ) ;
    public final void rule__DeclararVariaveis__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolCoral.g:1002:1: ( ( ( ( rule__DeclararVariaveis__ElementosAssignment_3 ) ) ( ( rule__DeclararVariaveis__ElementosAssignment_3 )* ) ) )
            // InternalPortugolCoral.g:1003:1: ( ( ( rule__DeclararVariaveis__ElementosAssignment_3 ) ) ( ( rule__DeclararVariaveis__ElementosAssignment_3 )* ) )
            {
            // InternalPortugolCoral.g:1003:1: ( ( ( rule__DeclararVariaveis__ElementosAssignment_3 ) ) ( ( rule__DeclararVariaveis__ElementosAssignment_3 )* ) )
            // InternalPortugolCoral.g:1004:2: ( ( rule__DeclararVariaveis__ElementosAssignment_3 ) ) ( ( rule__DeclararVariaveis__ElementosAssignment_3 )* )
            {
            // InternalPortugolCoral.g:1004:2: ( ( rule__DeclararVariaveis__ElementosAssignment_3 ) )
            // InternalPortugolCoral.g:1005:3: ( rule__DeclararVariaveis__ElementosAssignment_3 )
            {
             before(grammarAccess.getDeclararVariaveisAccess().getElementosAssignment_3()); 
            // InternalPortugolCoral.g:1006:3: ( rule__DeclararVariaveis__ElementosAssignment_3 )
            // InternalPortugolCoral.g:1006:4: rule__DeclararVariaveis__ElementosAssignment_3
            {
            pushFollow(FOLLOW_8);
            rule__DeclararVariaveis__ElementosAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getDeclararVariaveisAccess().getElementosAssignment_3()); 

            }

            // InternalPortugolCoral.g:1009:2: ( ( rule__DeclararVariaveis__ElementosAssignment_3 )* )
            // InternalPortugolCoral.g:1010:3: ( rule__DeclararVariaveis__ElementosAssignment_3 )*
            {
             before(grammarAccess.getDeclararVariaveisAccess().getElementosAssignment_3()); 
            // InternalPortugolCoral.g:1011:3: ( rule__DeclararVariaveis__ElementosAssignment_3 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_ID) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalPortugolCoral.g:1011:4: rule__DeclararVariaveis__ElementosAssignment_3
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__DeclararVariaveis__ElementosAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getDeclararVariaveisAccess().getElementosAssignment_3()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclararVariaveis__Group__3__Impl"


    // $ANTLR start "rule__DeclararVariaveis__Group__4"
    // InternalPortugolCoral.g:1020:1: rule__DeclararVariaveis__Group__4 : rule__DeclararVariaveis__Group__4__Impl ;
    public final void rule__DeclararVariaveis__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolCoral.g:1024:1: ( rule__DeclararVariaveis__Group__4__Impl )
            // InternalPortugolCoral.g:1025:2: rule__DeclararVariaveis__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DeclararVariaveis__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclararVariaveis__Group__4"


    // $ANTLR start "rule__DeclararVariaveis__Group__4__Impl"
    // InternalPortugolCoral.g:1031:1: rule__DeclararVariaveis__Group__4__Impl : ( '}' ) ;
    public final void rule__DeclararVariaveis__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolCoral.g:1035:1: ( ( '}' ) )
            // InternalPortugolCoral.g:1036:1: ( '}' )
            {
            // InternalPortugolCoral.g:1036:1: ( '}' )
            // InternalPortugolCoral.g:1037:2: '}'
            {
             before(grammarAccess.getDeclararVariaveisAccess().getRightCurlyBracketKeyword_4()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getDeclararVariaveisAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclararVariaveis__Group__4__Impl"


    // $ANTLR start "rule__DeclararVariaveisTipo__Group__0"
    // InternalPortugolCoral.g:1047:1: rule__DeclararVariaveisTipo__Group__0 : rule__DeclararVariaveisTipo__Group__0__Impl rule__DeclararVariaveisTipo__Group__1 ;
    public final void rule__DeclararVariaveisTipo__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolCoral.g:1051:1: ( rule__DeclararVariaveisTipo__Group__0__Impl rule__DeclararVariaveisTipo__Group__1 )
            // InternalPortugolCoral.g:1052:2: rule__DeclararVariaveisTipo__Group__0__Impl rule__DeclararVariaveisTipo__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__DeclararVariaveisTipo__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DeclararVariaveisTipo__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclararVariaveisTipo__Group__0"


    // $ANTLR start "rule__DeclararVariaveisTipo__Group__0__Impl"
    // InternalPortugolCoral.g:1059:1: rule__DeclararVariaveisTipo__Group__0__Impl : ( ( rule__DeclararVariaveisTipo__ElementosAssignment_0 ) ) ;
    public final void rule__DeclararVariaveisTipo__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolCoral.g:1063:1: ( ( ( rule__DeclararVariaveisTipo__ElementosAssignment_0 ) ) )
            // InternalPortugolCoral.g:1064:1: ( ( rule__DeclararVariaveisTipo__ElementosAssignment_0 ) )
            {
            // InternalPortugolCoral.g:1064:1: ( ( rule__DeclararVariaveisTipo__ElementosAssignment_0 ) )
            // InternalPortugolCoral.g:1065:2: ( rule__DeclararVariaveisTipo__ElementosAssignment_0 )
            {
             before(grammarAccess.getDeclararVariaveisTipoAccess().getElementosAssignment_0()); 
            // InternalPortugolCoral.g:1066:2: ( rule__DeclararVariaveisTipo__ElementosAssignment_0 )
            // InternalPortugolCoral.g:1066:3: rule__DeclararVariaveisTipo__ElementosAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__DeclararVariaveisTipo__ElementosAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getDeclararVariaveisTipoAccess().getElementosAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclararVariaveisTipo__Group__0__Impl"


    // $ANTLR start "rule__DeclararVariaveisTipo__Group__1"
    // InternalPortugolCoral.g:1074:1: rule__DeclararVariaveisTipo__Group__1 : rule__DeclararVariaveisTipo__Group__1__Impl rule__DeclararVariaveisTipo__Group__2 ;
    public final void rule__DeclararVariaveisTipo__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolCoral.g:1078:1: ( rule__DeclararVariaveisTipo__Group__1__Impl rule__DeclararVariaveisTipo__Group__2 )
            // InternalPortugolCoral.g:1079:2: rule__DeclararVariaveisTipo__Group__1__Impl rule__DeclararVariaveisTipo__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__DeclararVariaveisTipo__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DeclararVariaveisTipo__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclararVariaveisTipo__Group__1"


    // $ANTLR start "rule__DeclararVariaveisTipo__Group__1__Impl"
    // InternalPortugolCoral.g:1086:1: rule__DeclararVariaveisTipo__Group__1__Impl : ( ( rule__DeclararVariaveisTipo__Group_1__0 )* ) ;
    public final void rule__DeclararVariaveisTipo__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolCoral.g:1090:1: ( ( ( rule__DeclararVariaveisTipo__Group_1__0 )* ) )
            // InternalPortugolCoral.g:1091:1: ( ( rule__DeclararVariaveisTipo__Group_1__0 )* )
            {
            // InternalPortugolCoral.g:1091:1: ( ( rule__DeclararVariaveisTipo__Group_1__0 )* )
            // InternalPortugolCoral.g:1092:2: ( rule__DeclararVariaveisTipo__Group_1__0 )*
            {
             before(grammarAccess.getDeclararVariaveisTipoAccess().getGroup_1()); 
            // InternalPortugolCoral.g:1093:2: ( rule__DeclararVariaveisTipo__Group_1__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==40) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalPortugolCoral.g:1093:3: rule__DeclararVariaveisTipo__Group_1__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__DeclararVariaveisTipo__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getDeclararVariaveisTipoAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclararVariaveisTipo__Group__1__Impl"


    // $ANTLR start "rule__DeclararVariaveisTipo__Group__2"
    // InternalPortugolCoral.g:1101:1: rule__DeclararVariaveisTipo__Group__2 : rule__DeclararVariaveisTipo__Group__2__Impl rule__DeclararVariaveisTipo__Group__3 ;
    public final void rule__DeclararVariaveisTipo__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolCoral.g:1105:1: ( rule__DeclararVariaveisTipo__Group__2__Impl rule__DeclararVariaveisTipo__Group__3 )
            // InternalPortugolCoral.g:1106:2: rule__DeclararVariaveisTipo__Group__2__Impl rule__DeclararVariaveisTipo__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__DeclararVariaveisTipo__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DeclararVariaveisTipo__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclararVariaveisTipo__Group__2"


    // $ANTLR start "rule__DeclararVariaveisTipo__Group__2__Impl"
    // InternalPortugolCoral.g:1113:1: rule__DeclararVariaveisTipo__Group__2__Impl : ( ':' ) ;
    public final void rule__DeclararVariaveisTipo__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolCoral.g:1117:1: ( ( ':' ) )
            // InternalPortugolCoral.g:1118:1: ( ':' )
            {
            // InternalPortugolCoral.g:1118:1: ( ':' )
            // InternalPortugolCoral.g:1119:2: ':'
            {
             before(grammarAccess.getDeclararVariaveisTipoAccess().getColonKeyword_2()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getDeclararVariaveisTipoAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclararVariaveisTipo__Group__2__Impl"


    // $ANTLR start "rule__DeclararVariaveisTipo__Group__3"
    // InternalPortugolCoral.g:1128:1: rule__DeclararVariaveisTipo__Group__3 : rule__DeclararVariaveisTipo__Group__3__Impl ;
    public final void rule__DeclararVariaveisTipo__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolCoral.g:1132:1: ( rule__DeclararVariaveisTipo__Group__3__Impl )
            // InternalPortugolCoral.g:1133:2: rule__DeclararVariaveisTipo__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DeclararVariaveisTipo__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclararVariaveisTipo__Group__3"


    // $ANTLR start "rule__DeclararVariaveisTipo__Group__3__Impl"
    // InternalPortugolCoral.g:1139:1: rule__DeclararVariaveisTipo__Group__3__Impl : ( ( rule__DeclararVariaveisTipo__TipoAssignment_3 ) ) ;
    public final void rule__DeclararVariaveisTipo__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolCoral.g:1143:1: ( ( ( rule__DeclararVariaveisTipo__TipoAssignment_3 ) ) )
            // InternalPortugolCoral.g:1144:1: ( ( rule__DeclararVariaveisTipo__TipoAssignment_3 ) )
            {
            // InternalPortugolCoral.g:1144:1: ( ( rule__DeclararVariaveisTipo__TipoAssignment_3 ) )
            // InternalPortugolCoral.g:1145:2: ( rule__DeclararVariaveisTipo__TipoAssignment_3 )
            {
             before(grammarAccess.getDeclararVariaveisTipoAccess().getTipoAssignment_3()); 
            // InternalPortugolCoral.g:1146:2: ( rule__DeclararVariaveisTipo__TipoAssignment_3 )
            // InternalPortugolCoral.g:1146:3: rule__DeclararVariaveisTipo__TipoAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__DeclararVariaveisTipo__TipoAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getDeclararVariaveisTipoAccess().getTipoAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclararVariaveisTipo__Group__3__Impl"


    // $ANTLR start "rule__DeclararVariaveisTipo__Group_1__0"
    // InternalPortugolCoral.g:1155:1: rule__DeclararVariaveisTipo__Group_1__0 : rule__DeclararVariaveisTipo__Group_1__0__Impl rule__DeclararVariaveisTipo__Group_1__1 ;
    public final void rule__DeclararVariaveisTipo__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolCoral.g:1159:1: ( rule__DeclararVariaveisTipo__Group_1__0__Impl rule__DeclararVariaveisTipo__Group_1__1 )
            // InternalPortugolCoral.g:1160:2: rule__DeclararVariaveisTipo__Group_1__0__Impl rule__DeclararVariaveisTipo__Group_1__1
            {
            pushFollow(FOLLOW_6);
            rule__DeclararVariaveisTipo__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DeclararVariaveisTipo__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclararVariaveisTipo__Group_1__0"


    // $ANTLR start "rule__DeclararVariaveisTipo__Group_1__0__Impl"
    // InternalPortugolCoral.g:1167:1: rule__DeclararVariaveisTipo__Group_1__0__Impl : ( ',' ) ;
    public final void rule__DeclararVariaveisTipo__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolCoral.g:1171:1: ( ( ',' ) )
            // InternalPortugolCoral.g:1172:1: ( ',' )
            {
            // InternalPortugolCoral.g:1172:1: ( ',' )
            // InternalPortugolCoral.g:1173:2: ','
            {
             before(grammarAccess.getDeclararVariaveisTipoAccess().getCommaKeyword_1_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getDeclararVariaveisTipoAccess().getCommaKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclararVariaveisTipo__Group_1__0__Impl"


    // $ANTLR start "rule__DeclararVariaveisTipo__Group_1__1"
    // InternalPortugolCoral.g:1182:1: rule__DeclararVariaveisTipo__Group_1__1 : rule__DeclararVariaveisTipo__Group_1__1__Impl ;
    public final void rule__DeclararVariaveisTipo__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolCoral.g:1186:1: ( rule__DeclararVariaveisTipo__Group_1__1__Impl )
            // InternalPortugolCoral.g:1187:2: rule__DeclararVariaveisTipo__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DeclararVariaveisTipo__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclararVariaveisTipo__Group_1__1"


    // $ANTLR start "rule__DeclararVariaveisTipo__Group_1__1__Impl"
    // InternalPortugolCoral.g:1193:1: rule__DeclararVariaveisTipo__Group_1__1__Impl : ( ( rule__DeclararVariaveisTipo__ElementosAssignment_1_1 ) ) ;
    public final void rule__DeclararVariaveisTipo__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolCoral.g:1197:1: ( ( ( rule__DeclararVariaveisTipo__ElementosAssignment_1_1 ) ) )
            // InternalPortugolCoral.g:1198:1: ( ( rule__DeclararVariaveisTipo__ElementosAssignment_1_1 ) )
            {
            // InternalPortugolCoral.g:1198:1: ( ( rule__DeclararVariaveisTipo__ElementosAssignment_1_1 ) )
            // InternalPortugolCoral.g:1199:2: ( rule__DeclararVariaveisTipo__ElementosAssignment_1_1 )
            {
             before(grammarAccess.getDeclararVariaveisTipoAccess().getElementosAssignment_1_1()); 
            // InternalPortugolCoral.g:1200:2: ( rule__DeclararVariaveisTipo__ElementosAssignment_1_1 )
            // InternalPortugolCoral.g:1200:3: rule__DeclararVariaveisTipo__ElementosAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__DeclararVariaveisTipo__ElementosAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getDeclararVariaveisTipoAccess().getElementosAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclararVariaveisTipo__Group_1__1__Impl"


    // $ANTLR start "rule__Atribuir__Group__0"
    // InternalPortugolCoral.g:1209:1: rule__Atribuir__Group__0 : rule__Atribuir__Group__0__Impl rule__Atribuir__Group__1 ;
    public final void rule__Atribuir__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolCoral.g:1213:1: ( rule__Atribuir__Group__0__Impl rule__Atribuir__Group__1 )
            // InternalPortugolCoral.g:1214:2: rule__Atribuir__Group__0__Impl rule__Atribuir__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__Atribuir__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Atribuir__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atribuir__Group__0"


    // $ANTLR start "rule__Atribuir__Group__0__Impl"
    // InternalPortugolCoral.g:1221:1: rule__Atribuir__Group__0__Impl : ( () ) ;
    public final void rule__Atribuir__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolCoral.g:1225:1: ( ( () ) )
            // InternalPortugolCoral.g:1226:1: ( () )
            {
            // InternalPortugolCoral.g:1226:1: ( () )
            // InternalPortugolCoral.g:1227:2: ()
            {
             before(grammarAccess.getAtribuirAccess().getAtribuirAction_0()); 
            // InternalPortugolCoral.g:1228:2: ()
            // InternalPortugolCoral.g:1228:3: 
            {
            }

             after(grammarAccess.getAtribuirAccess().getAtribuirAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atribuir__Group__0__Impl"


    // $ANTLR start "rule__Atribuir__Group__1"
    // InternalPortugolCoral.g:1236:1: rule__Atribuir__Group__1 : rule__Atribuir__Group__1__Impl rule__Atribuir__Group__2 ;
    public final void rule__Atribuir__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolCoral.g:1240:1: ( rule__Atribuir__Group__1__Impl rule__Atribuir__Group__2 )
            // InternalPortugolCoral.g:1241:2: rule__Atribuir__Group__1__Impl rule__Atribuir__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__Atribuir__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Atribuir__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atribuir__Group__1"


    // $ANTLR start "rule__Atribuir__Group__1__Impl"
    // InternalPortugolCoral.g:1248:1: rule__Atribuir__Group__1__Impl : ( ( rule__Atribuir__Alternatives_1 )? ) ;
    public final void rule__Atribuir__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolCoral.g:1252:1: ( ( ( rule__Atribuir__Alternatives_1 )? ) )
            // InternalPortugolCoral.g:1253:1: ( ( rule__Atribuir__Alternatives_1 )? )
            {
            // InternalPortugolCoral.g:1253:1: ( ( rule__Atribuir__Alternatives_1 )? )
            // InternalPortugolCoral.g:1254:2: ( rule__Atribuir__Alternatives_1 )?
            {
             before(grammarAccess.getAtribuirAccess().getAlternatives_1()); 
            // InternalPortugolCoral.g:1255:2: ( rule__Atribuir__Alternatives_1 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=20 && LA16_0<=21)) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalPortugolCoral.g:1255:3: rule__Atribuir__Alternatives_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Atribuir__Alternatives_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAtribuirAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atribuir__Group__1__Impl"


    // $ANTLR start "rule__Atribuir__Group__2"
    // InternalPortugolCoral.g:1263:1: rule__Atribuir__Group__2 : rule__Atribuir__Group__2__Impl rule__Atribuir__Group__3 ;
    public final void rule__Atribuir__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolCoral.g:1267:1: ( rule__Atribuir__Group__2__Impl rule__Atribuir__Group__3 )
            // InternalPortugolCoral.g:1268:2: rule__Atribuir__Group__2__Impl rule__Atribuir__Group__3
            {
            pushFollow(FOLLOW_13);
            rule__Atribuir__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Atribuir__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atribuir__Group__2"


    // $ANTLR start "rule__Atribuir__Group__2__Impl"
    // InternalPortugolCoral.g:1275:1: rule__Atribuir__Group__2__Impl : ( ( rule__Atribuir__VariavelAssignment_2 ) ) ;
    public final void rule__Atribuir__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolCoral.g:1279:1: ( ( ( rule__Atribuir__VariavelAssignment_2 ) ) )
            // InternalPortugolCoral.g:1280:1: ( ( rule__Atribuir__VariavelAssignment_2 ) )
            {
            // InternalPortugolCoral.g:1280:1: ( ( rule__Atribuir__VariavelAssignment_2 ) )
            // InternalPortugolCoral.g:1281:2: ( rule__Atribuir__VariavelAssignment_2 )
            {
             before(grammarAccess.getAtribuirAccess().getVariavelAssignment_2()); 
            // InternalPortugolCoral.g:1282:2: ( rule__Atribuir__VariavelAssignment_2 )
            // InternalPortugolCoral.g:1282:3: rule__Atribuir__VariavelAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Atribuir__VariavelAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAtribuirAccess().getVariavelAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atribuir__Group__2__Impl"


    // $ANTLR start "rule__Atribuir__Group__3"
    // InternalPortugolCoral.g:1290:1: rule__Atribuir__Group__3 : rule__Atribuir__Group__3__Impl rule__Atribuir__Group__4 ;
    public final void rule__Atribuir__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolCoral.g:1294:1: ( rule__Atribuir__Group__3__Impl rule__Atribuir__Group__4 )
            // InternalPortugolCoral.g:1295:2: rule__Atribuir__Group__3__Impl rule__Atribuir__Group__4
            {
            pushFollow(FOLLOW_14);
            rule__Atribuir__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Atribuir__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atribuir__Group__3"


    // $ANTLR start "rule__Atribuir__Group__3__Impl"
    // InternalPortugolCoral.g:1302:1: rule__Atribuir__Group__3__Impl : ( '=' ) ;
    public final void rule__Atribuir__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolCoral.g:1306:1: ( ( '=' ) )
            // InternalPortugolCoral.g:1307:1: ( '=' )
            {
            // InternalPortugolCoral.g:1307:1: ( '=' )
            // InternalPortugolCoral.g:1308:2: '='
            {
             before(grammarAccess.getAtribuirAccess().getEqualsSignKeyword_3()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getAtribuirAccess().getEqualsSignKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atribuir__Group__3__Impl"


    // $ANTLR start "rule__Atribuir__Group__4"
    // InternalPortugolCoral.g:1317:1: rule__Atribuir__Group__4 : rule__Atribuir__Group__4__Impl ;
    public final void rule__Atribuir__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolCoral.g:1321:1: ( rule__Atribuir__Group__4__Impl )
            // InternalPortugolCoral.g:1322:2: rule__Atribuir__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Atribuir__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atribuir__Group__4"


    // $ANTLR start "rule__Atribuir__Group__4__Impl"
    // InternalPortugolCoral.g:1328:1: rule__Atribuir__Group__4__Impl : ( ( rule__Atribuir__ValorAssignment_4 ) ) ;
    public final void rule__Atribuir__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolCoral.g:1332:1: ( ( ( rule__Atribuir__ValorAssignment_4 ) ) )
            // InternalPortugolCoral.g:1333:1: ( ( rule__Atribuir__ValorAssignment_4 ) )
            {
            // InternalPortugolCoral.g:1333:1: ( ( rule__Atribuir__ValorAssignment_4 ) )
            // InternalPortugolCoral.g:1334:2: ( rule__Atribuir__ValorAssignment_4 )
            {
             before(grammarAccess.getAtribuirAccess().getValorAssignment_4()); 
            // InternalPortugolCoral.g:1335:2: ( rule__Atribuir__ValorAssignment_4 )
            // InternalPortugolCoral.g:1335:3: rule__Atribuir__ValorAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Atribuir__ValorAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getAtribuirAccess().getValorAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atribuir__Group__4__Impl"


    // $ANTLR start "rule__Ou__Group__0"
    // InternalPortugolCoral.g:1344:1: rule__Ou__Group__0 : rule__Ou__Group__0__Impl rule__Ou__Group__1 ;
    public final void rule__Ou__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolCoral.g:1348:1: ( rule__Ou__Group__0__Impl rule__Ou__Group__1 )
            // InternalPortugolCoral.g:1349:2: rule__Ou__Group__0__Impl rule__Ou__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__Ou__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ou__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ou__Group__0"


    // $ANTLR start "rule__Ou__Group__0__Impl"
    // InternalPortugolCoral.g:1356:1: rule__Ou__Group__0__Impl : ( ruleE ) ;
    public final void rule__Ou__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolCoral.g:1360:1: ( ( ruleE ) )
            // InternalPortugolCoral.g:1361:1: ( ruleE )
            {
            // InternalPortugolCoral.g:1361:1: ( ruleE )
            // InternalPortugolCoral.g:1362:2: ruleE
            {
             before(grammarAccess.getOuAccess().getEParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleE();

            state._fsp--;

             after(grammarAccess.getOuAccess().getEParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ou__Group__0__Impl"


    // $ANTLR start "rule__Ou__Group__1"
    // InternalPortugolCoral.g:1371:1: rule__Ou__Group__1 : rule__Ou__Group__1__Impl ;
    public final void rule__Ou__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolCoral.g:1375:1: ( rule__Ou__Group__1__Impl )
            // InternalPortugolCoral.g:1376:2: rule__Ou__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Ou__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ou__Group__1"


    // $ANTLR start "rule__Ou__Group__1__Impl"
    // InternalPortugolCoral.g:1382:1: rule__Ou__Group__1__Impl : ( ( rule__Ou__Group_1__0 )* ) ;
    public final void rule__Ou__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolCoral.g:1386:1: ( ( ( rule__Ou__Group_1__0 )* ) )
            // InternalPortugolCoral.g:1387:1: ( ( rule__Ou__Group_1__0 )* )
            {
            // InternalPortugolCoral.g:1387:1: ( ( rule__Ou__Group_1__0 )* )
            // InternalPortugolCoral.g:1388:2: ( rule__Ou__Group_1__0 )*
            {
             before(grammarAccess.getOuAccess().getGroup_1()); 
            // InternalPortugolCoral.g:1389:2: ( rule__Ou__Group_1__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==42) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalPortugolCoral.g:1389:3: rule__Ou__Group_1__0
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__Ou__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getOuAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ou__Group__1__Impl"


    // $ANTLR start "rule__Ou__Group_1__0"
    // InternalPortugolCoral.g:1398:1: rule__Ou__Group_1__0 : rule__Ou__Group_1__0__Impl rule__Ou__Group_1__1 ;
    public final void rule__Ou__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolCoral.g:1402:1: ( rule__Ou__Group_1__0__Impl rule__Ou__Group_1__1 )
            // InternalPortugolCoral.g:1403:2: rule__Ou__Group_1__0__Impl rule__Ou__Group_1__1
            {
            pushFollow(FOLLOW_15);
            rule__Ou__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ou__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ou__Group_1__0"


    // $ANTLR start "rule__Ou__Group_1__0__Impl"
    // InternalPortugolCoral.g:1410:1: rule__Ou__Group_1__0__Impl : ( () ) ;
    public final void rule__Ou__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolCoral.g:1414:1: ( ( () ) )
            // InternalPortugolCoral.g:1415:1: ( () )
            {
            // InternalPortugolCoral.g:1415:1: ( () )
            // InternalPortugolCoral.g:1416:2: ()
            {
             before(grammarAccess.getOuAccess().getOuEsquerdaAction_1_0()); 
            // InternalPortugolCoral.g:1417:2: ()
            // InternalPortugolCoral.g:1417:3: 
            {
            }

             after(grammarAccess.getOuAccess().getOuEsquerdaAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ou__Group_1__0__Impl"


    // $ANTLR start "rule__Ou__Group_1__1"
    // InternalPortugolCoral.g:1425:1: rule__Ou__Group_1__1 : rule__Ou__Group_1__1__Impl rule__Ou__Group_1__2 ;
    public final void rule__Ou__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolCoral.g:1429:1: ( rule__Ou__Group_1__1__Impl rule__Ou__Group_1__2 )
            // InternalPortugolCoral.g:1430:2: rule__Ou__Group_1__1__Impl rule__Ou__Group_1__2
            {
            pushFollow(FOLLOW_14);
            rule__Ou__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ou__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ou__Group_1__1"


    // $ANTLR start "rule__Ou__Group_1__1__Impl"
    // InternalPortugolCoral.g:1437:1: rule__Ou__Group_1__1__Impl : ( 'ou' ) ;
    public final void rule__Ou__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolCoral.g:1441:1: ( ( 'ou' ) )
            // InternalPortugolCoral.g:1442:1: ( 'ou' )
            {
            // InternalPortugolCoral.g:1442:1: ( 'ou' )
            // InternalPortugolCoral.g:1443:2: 'ou'
            {
             before(grammarAccess.getOuAccess().getOuKeyword_1_1()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getOuAccess().getOuKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ou__Group_1__1__Impl"


    // $ANTLR start "rule__Ou__Group_1__2"
    // InternalPortugolCoral.g:1452:1: rule__Ou__Group_1__2 : rule__Ou__Group_1__2__Impl ;
    public final void rule__Ou__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolCoral.g:1456:1: ( rule__Ou__Group_1__2__Impl )
            // InternalPortugolCoral.g:1457:2: rule__Ou__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Ou__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ou__Group_1__2"


    // $ANTLR start "rule__Ou__Group_1__2__Impl"
    // InternalPortugolCoral.g:1463:1: rule__Ou__Group_1__2__Impl : ( ( rule__Ou__DireitaAssignment_1_2 ) ) ;
    public final void rule__Ou__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolCoral.g:1467:1: ( ( ( rule__Ou__DireitaAssignment_1_2 ) ) )
            // InternalPortugolCoral.g:1468:1: ( ( rule__Ou__DireitaAssignment_1_2 ) )
            {
            // InternalPortugolCoral.g:1468:1: ( ( rule__Ou__DireitaAssignment_1_2 ) )
            // InternalPortugolCoral.g:1469:2: ( rule__Ou__DireitaAssignment_1_2 )
            {
             before(grammarAccess.getOuAccess().getDireitaAssignment_1_2()); 
            // InternalPortugolCoral.g:1470:2: ( rule__Ou__DireitaAssignment_1_2 )
            // InternalPortugolCoral.g:1470:3: rule__Ou__DireitaAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Ou__DireitaAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getOuAccess().getDireitaAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ou__Group_1__2__Impl"


    // $ANTLR start "rule__E__Group__0"
    // InternalPortugolCoral.g:1479:1: rule__E__Group__0 : rule__E__Group__0__Impl rule__E__Group__1 ;
    public final void rule__E__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolCoral.g:1483:1: ( rule__E__Group__0__Impl rule__E__Group__1 )
            // InternalPortugolCoral.g:1484:2: rule__E__Group__0__Impl rule__E__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__E__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__E__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__E__Group__0"


    // $ANTLR start "rule__E__Group__0__Impl"
    // InternalPortugolCoral.g:1491:1: rule__E__Group__0__Impl : ( ruleXou ) ;
    public final void rule__E__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolCoral.g:1495:1: ( ( ruleXou ) )
            // InternalPortugolCoral.g:1496:1: ( ruleXou )
            {
            // InternalPortugolCoral.g:1496:1: ( ruleXou )
            // InternalPortugolCoral.g:1497:2: ruleXou
            {
             before(grammarAccess.getEAccess().getXouParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleXou();

            state._fsp--;

             after(grammarAccess.getEAccess().getXouParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__E__Group__0__Impl"


    // $ANTLR start "rule__E__Group__1"
    // InternalPortugolCoral.g:1506:1: rule__E__Group__1 : rule__E__Group__1__Impl ;
    public final void rule__E__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolCoral.g:1510:1: ( rule__E__Group__1__Impl )
            // InternalPortugolCoral.g:1511:2: rule__E__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__E__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__E__Group__1"


    // $ANTLR start "rule__E__Group__1__Impl"
    // InternalPortugolCoral.g:1517:1: rule__E__Group__1__Impl : ( ( rule__E__Group_1__0 )* ) ;
    public final void rule__E__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolCoral.g:1521:1: ( ( ( rule__E__Group_1__0 )* ) )
            // InternalPortugolCoral.g:1522:1: ( ( rule__E__Group_1__0 )* )
            {
            // InternalPortugolCoral.g:1522:1: ( ( rule__E__Group_1__0 )* )
            // InternalPortugolCoral.g:1523:2: ( rule__E__Group_1__0 )*
            {
             before(grammarAccess.getEAccess().getGroup_1()); 
            // InternalPortugolCoral.g:1524:2: ( rule__E__Group_1__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==43) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalPortugolCoral.g:1524:3: rule__E__Group_1__0
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__E__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getEAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__E__Group__1__Impl"


    // $ANTLR start "rule__E__Group_1__0"
    // InternalPortugolCoral.g:1533:1: rule__E__Group_1__0 : rule__E__Group_1__0__Impl rule__E__Group_1__1 ;
    public final void rule__E__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolCoral.g:1537:1: ( rule__E__Group_1__0__Impl rule__E__Group_1__1 )
            // InternalPortugolCoral.g:1538:2: rule__E__Group_1__0__Impl rule__E__Group_1__1
            {
            pushFollow(FOLLOW_17);
            rule__E__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__E__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__E__Group_1__0"


    // $ANTLR start "rule__E__Group_1__0__Impl"
    // InternalPortugolCoral.g:1545:1: rule__E__Group_1__0__Impl : ( () ) ;
    public final void rule__E__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolCoral.g:1549:1: ( ( () ) )
            // InternalPortugolCoral.g:1550:1: ( () )
            {
            // InternalPortugolCoral.g:1550:1: ( () )
            // InternalPortugolCoral.g:1551:2: ()
            {
             before(grammarAccess.getEAccess().getEEsquerdaAction_1_0()); 
            // InternalPortugolCoral.g:1552:2: ()
            // InternalPortugolCoral.g:1552:3: 
            {
            }

             after(grammarAccess.getEAccess().getEEsquerdaAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__E__Group_1__0__Impl"


    // $ANTLR start "rule__E__Group_1__1"
    // InternalPortugolCoral.g:1560:1: rule__E__Group_1__1 : rule__E__Group_1__1__Impl rule__E__Group_1__2 ;
    public final void rule__E__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolCoral.g:1564:1: ( rule__E__Group_1__1__Impl rule__E__Group_1__2 )
            // InternalPortugolCoral.g:1565:2: rule__E__Group_1__1__Impl rule__E__Group_1__2
            {
            pushFollow(FOLLOW_14);
            rule__E__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__E__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__E__Group_1__1"


    // $ANTLR start "rule__E__Group_1__1__Impl"
    // InternalPortugolCoral.g:1572:1: rule__E__Group_1__1__Impl : ( 'e' ) ;
    public final void rule__E__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolCoral.g:1576:1: ( ( 'e' ) )
            // InternalPortugolCoral.g:1577:1: ( 'e' )
            {
            // InternalPortugolCoral.g:1577:1: ( 'e' )
            // InternalPortugolCoral.g:1578:2: 'e'
            {
             before(grammarAccess.getEAccess().getEKeyword_1_1()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getEAccess().getEKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__E__Group_1__1__Impl"


    // $ANTLR start "rule__E__Group_1__2"
    // InternalPortugolCoral.g:1587:1: rule__E__Group_1__2 : rule__E__Group_1__2__Impl ;
    public final void rule__E__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolCoral.g:1591:1: ( rule__E__Group_1__2__Impl )
            // InternalPortugolCoral.g:1592:2: rule__E__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__E__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__E__Group_1__2"


    // $ANTLR start "rule__E__Group_1__2__Impl"
    // InternalPortugolCoral.g:1598:1: rule__E__Group_1__2__Impl : ( ( rule__E__DireitaAssignment_1_2 ) ) ;
    public final void rule__E__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolCoral.g:1602:1: ( ( ( rule__E__DireitaAssignment_1_2 ) ) )
            // InternalPortugolCoral.g:1603:1: ( ( rule__E__DireitaAssignment_1_2 ) )
            {
            // InternalPortugolCoral.g:1603:1: ( ( rule__E__DireitaAssignment_1_2 ) )
            // InternalPortugolCoral.g:1604:2: ( rule__E__DireitaAssignment_1_2 )
            {
             before(grammarAccess.getEAccess().getDireitaAssignment_1_2()); 
            // InternalPortugolCoral.g:1605:2: ( rule__E__DireitaAssignment_1_2 )
            // InternalPortugolCoral.g:1605:3: rule__E__DireitaAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__E__DireitaAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getEAccess().getDireitaAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__E__Group_1__2__Impl"


    // $ANTLR start "rule__Xou__Group__0"
    // InternalPortugolCoral.g:1614:1: rule__Xou__Group__0 : rule__Xou__Group__0__Impl rule__Xou__Group__1 ;
    public final void rule__Xou__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolCoral.g:1618:1: ( rule__Xou__Group__0__Impl rule__Xou__Group__1 )
            // InternalPortugolCoral.g:1619:2: rule__Xou__Group__0__Impl rule__Xou__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__Xou__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Xou__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Xou__Group__0"


    // $ANTLR start "rule__Xou__Group__0__Impl"
    // InternalPortugolCoral.g:1626:1: rule__Xou__Group__0__Impl : ( ruleNao ) ;
    public final void rule__Xou__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolCoral.g:1630:1: ( ( ruleNao ) )
            // InternalPortugolCoral.g:1631:1: ( ruleNao )
            {
            // InternalPortugolCoral.g:1631:1: ( ruleNao )
            // InternalPortugolCoral.g:1632:2: ruleNao
            {
             before(grammarAccess.getXouAccess().getNaoParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleNao();

            state._fsp--;

             after(grammarAccess.getXouAccess().getNaoParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Xou__Group__0__Impl"


    // $ANTLR start "rule__Xou__Group__1"
    // InternalPortugolCoral.g:1641:1: rule__Xou__Group__1 : rule__Xou__Group__1__Impl ;
    public final void rule__Xou__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolCoral.g:1645:1: ( rule__Xou__Group__1__Impl )
            // InternalPortugolCoral.g:1646:2: rule__Xou__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Xou__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Xou__Group__1"


    // $ANTLR start "rule__Xou__Group__1__Impl"
    // InternalPortugolCoral.g:1652:1: rule__Xou__Group__1__Impl : ( ( rule__Xou__Group_1__0 )* ) ;
    public final void rule__Xou__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolCoral.g:1656:1: ( ( ( rule__Xou__Group_1__0 )* ) )
            // InternalPortugolCoral.g:1657:1: ( ( rule__Xou__Group_1__0 )* )
            {
            // InternalPortugolCoral.g:1657:1: ( ( rule__Xou__Group_1__0 )* )
            // InternalPortugolCoral.g:1658:2: ( rule__Xou__Group_1__0 )*
            {
             before(grammarAccess.getXouAccess().getGroup_1()); 
            // InternalPortugolCoral.g:1659:2: ( rule__Xou__Group_1__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==44) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalPortugolCoral.g:1659:3: rule__Xou__Group_1__0
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__Xou__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getXouAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Xou__Group__1__Impl"


    // $ANTLR start "rule__Xou__Group_1__0"
    // InternalPortugolCoral.g:1668:1: rule__Xou__Group_1__0 : rule__Xou__Group_1__0__Impl rule__Xou__Group_1__1 ;
    public final void rule__Xou__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolCoral.g:1672:1: ( rule__Xou__Group_1__0__Impl rule__Xou__Group_1__1 )
            // InternalPortugolCoral.g:1673:2: rule__Xou__Group_1__0__Impl rule__Xou__Group_1__1
            {
            pushFollow(FOLLOW_19);
            rule__Xou__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Xou__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Xou__Group_1__0"


    // $ANTLR start "rule__Xou__Group_1__0__Impl"
    // InternalPortugolCoral.g:1680:1: rule__Xou__Group_1__0__Impl : ( () ) ;
    public final void rule__Xou__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolCoral.g:1684:1: ( ( () ) )
            // InternalPortugolCoral.g:1685:1: ( () )
            {
            // InternalPortugolCoral.g:1685:1: ( () )
            // InternalPortugolCoral.g:1686:2: ()
            {
             before(grammarAccess.getXouAccess().getXouEsquerdaAction_1_0()); 
            // InternalPortugolCoral.g:1687:2: ()
            // InternalPortugolCoral.g:1687:3: 
            {
            }

             after(grammarAccess.getXouAccess().getXouEsquerdaAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Xou__Group_1__0__Impl"


    // $ANTLR start "rule__Xou__Group_1__1"
    // InternalPortugolCoral.g:1695:1: rule__Xou__Group_1__1 : rule__Xou__Group_1__1__Impl rule__Xou__Group_1__2 ;
    public final void rule__Xou__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolCoral.g:1699:1: ( rule__Xou__Group_1__1__Impl rule__Xou__Group_1__2 )
            // InternalPortugolCoral.g:1700:2: rule__Xou__Group_1__1__Impl rule__Xou__Group_1__2
            {
            pushFollow(FOLLOW_14);
            rule__Xou__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Xou__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Xou__Group_1__1"


    // $ANTLR start "rule__Xou__Group_1__1__Impl"
    // InternalPortugolCoral.g:1707:1: rule__Xou__Group_1__1__Impl : ( 'xou' ) ;
    public final void rule__Xou__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolCoral.g:1711:1: ( ( 'xou' ) )
            // InternalPortugolCoral.g:1712:1: ( 'xou' )
            {
            // InternalPortugolCoral.g:1712:1: ( 'xou' )
            // InternalPortugolCoral.g:1713:2: 'xou'
            {
             before(grammarAccess.getXouAccess().getXouKeyword_1_1()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getXouAccess().getXouKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Xou__Group_1__1__Impl"


    // $ANTLR start "rule__Xou__Group_1__2"
    // InternalPortugolCoral.g:1722:1: rule__Xou__Group_1__2 : rule__Xou__Group_1__2__Impl ;
    public final void rule__Xou__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolCoral.g:1726:1: ( rule__Xou__Group_1__2__Impl )
            // InternalPortugolCoral.g:1727:2: rule__Xou__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Xou__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Xou__Group_1__2"


    // $ANTLR start "rule__Xou__Group_1__2__Impl"
    // InternalPortugolCoral.g:1733:1: rule__Xou__Group_1__2__Impl : ( ( rule__Xou__DireitaAssignment_1_2 ) ) ;
    public final void rule__Xou__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolCoral.g:1737:1: ( ( ( rule__Xou__DireitaAssignment_1_2 ) ) )
            // InternalPortugolCoral.g:1738:1: ( ( rule__Xou__DireitaAssignment_1_2 ) )
            {
            // InternalPortugolCoral.g:1738:1: ( ( rule__Xou__DireitaAssignment_1_2 ) )
            // InternalPortugolCoral.g:1739:2: ( rule__Xou__DireitaAssignment_1_2 )
            {
             before(grammarAccess.getXouAccess().getDireitaAssignment_1_2()); 
            // InternalPortugolCoral.g:1740:2: ( rule__Xou__DireitaAssignment_1_2 )
            // InternalPortugolCoral.g:1740:3: rule__Xou__DireitaAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Xou__DireitaAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getXouAccess().getDireitaAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Xou__Group_1__2__Impl"


    // $ANTLR start "rule__Nao__Group__0"
    // InternalPortugolCoral.g:1749:1: rule__Nao__Group__0 : rule__Nao__Group__0__Impl rule__Nao__Group__1 ;
    public final void rule__Nao__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolCoral.g:1753:1: ( rule__Nao__Group__0__Impl rule__Nao__Group__1 )
            // InternalPortugolCoral.g:1754:2: rule__Nao__Group__0__Impl rule__Nao__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__Nao__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Nao__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Nao__Group__0"


    // $ANTLR start "rule__Nao__Group__0__Impl"
    // InternalPortugolCoral.g:1761:1: rule__Nao__Group__0__Impl : ( ( rule__Nao__NaosAssignment_0 )* ) ;
    public final void rule__Nao__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolCoral.g:1765:1: ( ( ( rule__Nao__NaosAssignment_0 )* ) )
            // InternalPortugolCoral.g:1766:1: ( ( rule__Nao__NaosAssignment_0 )* )
            {
            // InternalPortugolCoral.g:1766:1: ( ( rule__Nao__NaosAssignment_0 )* )
            // InternalPortugolCoral.g:1767:2: ( rule__Nao__NaosAssignment_0 )*
            {
             before(grammarAccess.getNaoAccess().getNaosAssignment_0()); 
            // InternalPortugolCoral.g:1768:2: ( rule__Nao__NaosAssignment_0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>=22 && LA20_0<=23)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalPortugolCoral.g:1768:3: rule__Nao__NaosAssignment_0
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__Nao__NaosAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getNaoAccess().getNaosAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Nao__Group__0__Impl"


    // $ANTLR start "rule__Nao__Group__1"
    // InternalPortugolCoral.g:1776:1: rule__Nao__Group__1 : rule__Nao__Group__1__Impl ;
    public final void rule__Nao__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolCoral.g:1780:1: ( rule__Nao__Group__1__Impl )
            // InternalPortugolCoral.g:1781:2: rule__Nao__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Nao__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Nao__Group__1"


    // $ANTLR start "rule__Nao__Group__1__Impl"
    // InternalPortugolCoral.g:1787:1: rule__Nao__Group__1__Impl : ( ( rule__Nao__DireitaAssignment_1 ) ) ;
    public final void rule__Nao__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolCoral.g:1791:1: ( ( ( rule__Nao__DireitaAssignment_1 ) ) )
            // InternalPortugolCoral.g:1792:1: ( ( rule__Nao__DireitaAssignment_1 ) )
            {
            // InternalPortugolCoral.g:1792:1: ( ( rule__Nao__DireitaAssignment_1 ) )
            // InternalPortugolCoral.g:1793:2: ( rule__Nao__DireitaAssignment_1 )
            {
             before(grammarAccess.getNaoAccess().getDireitaAssignment_1()); 
            // InternalPortugolCoral.g:1794:2: ( rule__Nao__DireitaAssignment_1 )
            // InternalPortugolCoral.g:1794:3: rule__Nao__DireitaAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Nao__DireitaAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getNaoAccess().getDireitaAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Nao__Group__1__Impl"


    // $ANTLR start "rule__Comparacao__Group__0"
    // InternalPortugolCoral.g:1803:1: rule__Comparacao__Group__0 : rule__Comparacao__Group__0__Impl rule__Comparacao__Group__1 ;
    public final void rule__Comparacao__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolCoral.g:1807:1: ( rule__Comparacao__Group__0__Impl rule__Comparacao__Group__1 )
            // InternalPortugolCoral.g:1808:2: rule__Comparacao__Group__0__Impl rule__Comparacao__Group__1
            {
            pushFollow(FOLLOW_22);
            rule__Comparacao__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Comparacao__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparacao__Group__0"


    // $ANTLR start "rule__Comparacao__Group__0__Impl"
    // InternalPortugolCoral.g:1815:1: rule__Comparacao__Group__0__Impl : ( ruleAdicaoOuSubtracao ) ;
    public final void rule__Comparacao__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolCoral.g:1819:1: ( ( ruleAdicaoOuSubtracao ) )
            // InternalPortugolCoral.g:1820:1: ( ruleAdicaoOuSubtracao )
            {
            // InternalPortugolCoral.g:1820:1: ( ruleAdicaoOuSubtracao )
            // InternalPortugolCoral.g:1821:2: ruleAdicaoOuSubtracao
            {
             before(grammarAccess.getComparacaoAccess().getAdicaoOuSubtracaoParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleAdicaoOuSubtracao();

            state._fsp--;

             after(grammarAccess.getComparacaoAccess().getAdicaoOuSubtracaoParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparacao__Group__0__Impl"


    // $ANTLR start "rule__Comparacao__Group__1"
    // InternalPortugolCoral.g:1830:1: rule__Comparacao__Group__1 : rule__Comparacao__Group__1__Impl ;
    public final void rule__Comparacao__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolCoral.g:1834:1: ( rule__Comparacao__Group__1__Impl )
            // InternalPortugolCoral.g:1835:2: rule__Comparacao__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Comparacao__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparacao__Group__1"


    // $ANTLR start "rule__Comparacao__Group__1__Impl"
    // InternalPortugolCoral.g:1841:1: rule__Comparacao__Group__1__Impl : ( ( rule__Comparacao__Group_1__0 )* ) ;
    public final void rule__Comparacao__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolCoral.g:1845:1: ( ( ( rule__Comparacao__Group_1__0 )* ) )
            // InternalPortugolCoral.g:1846:1: ( ( rule__Comparacao__Group_1__0 )* )
            {
            // InternalPortugolCoral.g:1846:1: ( ( rule__Comparacao__Group_1__0 )* )
            // InternalPortugolCoral.g:1847:2: ( rule__Comparacao__Group_1__0 )*
            {
             before(grammarAccess.getComparacaoAccess().getGroup_1()); 
            // InternalPortugolCoral.g:1848:2: ( rule__Comparacao__Group_1__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>=24 && LA21_0<=29)) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalPortugolCoral.g:1848:3: rule__Comparacao__Group_1__0
            	    {
            	    pushFollow(FOLLOW_23);
            	    rule__Comparacao__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getComparacaoAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparacao__Group__1__Impl"


    // $ANTLR start "rule__Comparacao__Group_1__0"
    // InternalPortugolCoral.g:1857:1: rule__Comparacao__Group_1__0 : rule__Comparacao__Group_1__0__Impl rule__Comparacao__Group_1__1 ;
    public final void rule__Comparacao__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolCoral.g:1861:1: ( rule__Comparacao__Group_1__0__Impl rule__Comparacao__Group_1__1 )
            // InternalPortugolCoral.g:1862:2: rule__Comparacao__Group_1__0__Impl rule__Comparacao__Group_1__1
            {
            pushFollow(FOLLOW_22);
            rule__Comparacao__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Comparacao__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparacao__Group_1__0"


    // $ANTLR start "rule__Comparacao__Group_1__0__Impl"
    // InternalPortugolCoral.g:1869:1: rule__Comparacao__Group_1__0__Impl : ( () ) ;
    public final void rule__Comparacao__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolCoral.g:1873:1: ( ( () ) )
            // InternalPortugolCoral.g:1874:1: ( () )
            {
            // InternalPortugolCoral.g:1874:1: ( () )
            // InternalPortugolCoral.g:1875:2: ()
            {
             before(grammarAccess.getComparacaoAccess().getComparacaoEsquerdaAction_1_0()); 
            // InternalPortugolCoral.g:1876:2: ()
            // InternalPortugolCoral.g:1876:3: 
            {
            }

             after(grammarAccess.getComparacaoAccess().getComparacaoEsquerdaAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparacao__Group_1__0__Impl"


    // $ANTLR start "rule__Comparacao__Group_1__1"
    // InternalPortugolCoral.g:1884:1: rule__Comparacao__Group_1__1 : rule__Comparacao__Group_1__1__Impl rule__Comparacao__Group_1__2 ;
    public final void rule__Comparacao__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolCoral.g:1888:1: ( rule__Comparacao__Group_1__1__Impl rule__Comparacao__Group_1__2 )
            // InternalPortugolCoral.g:1889:2: rule__Comparacao__Group_1__1__Impl rule__Comparacao__Group_1__2
            {
            pushFollow(FOLLOW_14);
            rule__Comparacao__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Comparacao__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparacao__Group_1__1"


    // $ANTLR start "rule__Comparacao__Group_1__1__Impl"
    // InternalPortugolCoral.g:1896:1: rule__Comparacao__Group_1__1__Impl : ( ( rule__Comparacao__ComparacaoAssignment_1_1 ) ) ;
    public final void rule__Comparacao__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolCoral.g:1900:1: ( ( ( rule__Comparacao__ComparacaoAssignment_1_1 ) ) )
            // InternalPortugolCoral.g:1901:1: ( ( rule__Comparacao__ComparacaoAssignment_1_1 ) )
            {
            // InternalPortugolCoral.g:1901:1: ( ( rule__Comparacao__ComparacaoAssignment_1_1 ) )
            // InternalPortugolCoral.g:1902:2: ( rule__Comparacao__ComparacaoAssignment_1_1 )
            {
             before(grammarAccess.getComparacaoAccess().getComparacaoAssignment_1_1()); 
            // InternalPortugolCoral.g:1903:2: ( rule__Comparacao__ComparacaoAssignment_1_1 )
            // InternalPortugolCoral.g:1903:3: rule__Comparacao__ComparacaoAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Comparacao__ComparacaoAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getComparacaoAccess().getComparacaoAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparacao__Group_1__1__Impl"


    // $ANTLR start "rule__Comparacao__Group_1__2"
    // InternalPortugolCoral.g:1911:1: rule__Comparacao__Group_1__2 : rule__Comparacao__Group_1__2__Impl ;
    public final void rule__Comparacao__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolCoral.g:1915:1: ( rule__Comparacao__Group_1__2__Impl )
            // InternalPortugolCoral.g:1916:2: rule__Comparacao__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Comparacao__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparacao__Group_1__2"


    // $ANTLR start "rule__Comparacao__Group_1__2__Impl"
    // InternalPortugolCoral.g:1922:1: rule__Comparacao__Group_1__2__Impl : ( ( rule__Comparacao__DireitaAssignment_1_2 ) ) ;
    public final void rule__Comparacao__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolCoral.g:1926:1: ( ( ( rule__Comparacao__DireitaAssignment_1_2 ) ) )
            // InternalPortugolCoral.g:1927:1: ( ( rule__Comparacao__DireitaAssignment_1_2 ) )
            {
            // InternalPortugolCoral.g:1927:1: ( ( rule__Comparacao__DireitaAssignment_1_2 ) )
            // InternalPortugolCoral.g:1928:2: ( rule__Comparacao__DireitaAssignment_1_2 )
            {
             before(grammarAccess.getComparacaoAccess().getDireitaAssignment_1_2()); 
            // InternalPortugolCoral.g:1929:2: ( rule__Comparacao__DireitaAssignment_1_2 )
            // InternalPortugolCoral.g:1929:3: rule__Comparacao__DireitaAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Comparacao__DireitaAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getComparacaoAccess().getDireitaAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparacao__Group_1__2__Impl"


    // $ANTLR start "rule__AdicaoOuSubtracao__Group__0"
    // InternalPortugolCoral.g:1938:1: rule__AdicaoOuSubtracao__Group__0 : rule__AdicaoOuSubtracao__Group__0__Impl rule__AdicaoOuSubtracao__Group__1 ;
    public final void rule__AdicaoOuSubtracao__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolCoral.g:1942:1: ( rule__AdicaoOuSubtracao__Group__0__Impl rule__AdicaoOuSubtracao__Group__1 )
            // InternalPortugolCoral.g:1943:2: rule__AdicaoOuSubtracao__Group__0__Impl rule__AdicaoOuSubtracao__Group__1
            {
            pushFollow(FOLLOW_24);
            rule__AdicaoOuSubtracao__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AdicaoOuSubtracao__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdicaoOuSubtracao__Group__0"


    // $ANTLR start "rule__AdicaoOuSubtracao__Group__0__Impl"
    // InternalPortugolCoral.g:1950:1: rule__AdicaoOuSubtracao__Group__0__Impl : ( ruleMultiplicacaoOuDivisao ) ;
    public final void rule__AdicaoOuSubtracao__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolCoral.g:1954:1: ( ( ruleMultiplicacaoOuDivisao ) )
            // InternalPortugolCoral.g:1955:1: ( ruleMultiplicacaoOuDivisao )
            {
            // InternalPortugolCoral.g:1955:1: ( ruleMultiplicacaoOuDivisao )
            // InternalPortugolCoral.g:1956:2: ruleMultiplicacaoOuDivisao
            {
             before(grammarAccess.getAdicaoOuSubtracaoAccess().getMultiplicacaoOuDivisaoParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleMultiplicacaoOuDivisao();

            state._fsp--;

             after(grammarAccess.getAdicaoOuSubtracaoAccess().getMultiplicacaoOuDivisaoParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdicaoOuSubtracao__Group__0__Impl"


    // $ANTLR start "rule__AdicaoOuSubtracao__Group__1"
    // InternalPortugolCoral.g:1965:1: rule__AdicaoOuSubtracao__Group__1 : rule__AdicaoOuSubtracao__Group__1__Impl ;
    public final void rule__AdicaoOuSubtracao__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolCoral.g:1969:1: ( rule__AdicaoOuSubtracao__Group__1__Impl )
            // InternalPortugolCoral.g:1970:2: rule__AdicaoOuSubtracao__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AdicaoOuSubtracao__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdicaoOuSubtracao__Group__1"


    // $ANTLR start "rule__AdicaoOuSubtracao__Group__1__Impl"
    // InternalPortugolCoral.g:1976:1: rule__AdicaoOuSubtracao__Group__1__Impl : ( ( rule__AdicaoOuSubtracao__Group_1__0 )* ) ;
    public final void rule__AdicaoOuSubtracao__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolCoral.g:1980:1: ( ( ( rule__AdicaoOuSubtracao__Group_1__0 )* ) )
            // InternalPortugolCoral.g:1981:1: ( ( rule__AdicaoOuSubtracao__Group_1__0 )* )
            {
            // InternalPortugolCoral.g:1981:1: ( ( rule__AdicaoOuSubtracao__Group_1__0 )* )
            // InternalPortugolCoral.g:1982:2: ( rule__AdicaoOuSubtracao__Group_1__0 )*
            {
             before(grammarAccess.getAdicaoOuSubtracaoAccess().getGroup_1()); 
            // InternalPortugolCoral.g:1983:2: ( rule__AdicaoOuSubtracao__Group_1__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>=30 && LA22_0<=31)) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalPortugolCoral.g:1983:3: rule__AdicaoOuSubtracao__Group_1__0
            	    {
            	    pushFollow(FOLLOW_25);
            	    rule__AdicaoOuSubtracao__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getAdicaoOuSubtracaoAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdicaoOuSubtracao__Group__1__Impl"


    // $ANTLR start "rule__AdicaoOuSubtracao__Group_1__0"
    // InternalPortugolCoral.g:1992:1: rule__AdicaoOuSubtracao__Group_1__0 : rule__AdicaoOuSubtracao__Group_1__0__Impl rule__AdicaoOuSubtracao__Group_1__1 ;
    public final void rule__AdicaoOuSubtracao__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolCoral.g:1996:1: ( rule__AdicaoOuSubtracao__Group_1__0__Impl rule__AdicaoOuSubtracao__Group_1__1 )
            // InternalPortugolCoral.g:1997:2: rule__AdicaoOuSubtracao__Group_1__0__Impl rule__AdicaoOuSubtracao__Group_1__1
            {
            pushFollow(FOLLOW_24);
            rule__AdicaoOuSubtracao__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AdicaoOuSubtracao__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdicaoOuSubtracao__Group_1__0"


    // $ANTLR start "rule__AdicaoOuSubtracao__Group_1__0__Impl"
    // InternalPortugolCoral.g:2004:1: rule__AdicaoOuSubtracao__Group_1__0__Impl : ( () ) ;
    public final void rule__AdicaoOuSubtracao__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolCoral.g:2008:1: ( ( () ) )
            // InternalPortugolCoral.g:2009:1: ( () )
            {
            // InternalPortugolCoral.g:2009:1: ( () )
            // InternalPortugolCoral.g:2010:2: ()
            {
             before(grammarAccess.getAdicaoOuSubtracaoAccess().getAdicaoOuSubtracaoEsquerdaAction_1_0()); 
            // InternalPortugolCoral.g:2011:2: ()
            // InternalPortugolCoral.g:2011:3: 
            {
            }

             after(grammarAccess.getAdicaoOuSubtracaoAccess().getAdicaoOuSubtracaoEsquerdaAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdicaoOuSubtracao__Group_1__0__Impl"


    // $ANTLR start "rule__AdicaoOuSubtracao__Group_1__1"
    // InternalPortugolCoral.g:2019:1: rule__AdicaoOuSubtracao__Group_1__1 : rule__AdicaoOuSubtracao__Group_1__1__Impl rule__AdicaoOuSubtracao__Group_1__2 ;
    public final void rule__AdicaoOuSubtracao__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolCoral.g:2023:1: ( rule__AdicaoOuSubtracao__Group_1__1__Impl rule__AdicaoOuSubtracao__Group_1__2 )
            // InternalPortugolCoral.g:2024:2: rule__AdicaoOuSubtracao__Group_1__1__Impl rule__AdicaoOuSubtracao__Group_1__2
            {
            pushFollow(FOLLOW_14);
            rule__AdicaoOuSubtracao__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AdicaoOuSubtracao__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdicaoOuSubtracao__Group_1__1"


    // $ANTLR start "rule__AdicaoOuSubtracao__Group_1__1__Impl"
    // InternalPortugolCoral.g:2031:1: rule__AdicaoOuSubtracao__Group_1__1__Impl : ( ( rule__AdicaoOuSubtracao__OperacaoAssignment_1_1 ) ) ;
    public final void rule__AdicaoOuSubtracao__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolCoral.g:2035:1: ( ( ( rule__AdicaoOuSubtracao__OperacaoAssignment_1_1 ) ) )
            // InternalPortugolCoral.g:2036:1: ( ( rule__AdicaoOuSubtracao__OperacaoAssignment_1_1 ) )
            {
            // InternalPortugolCoral.g:2036:1: ( ( rule__AdicaoOuSubtracao__OperacaoAssignment_1_1 ) )
            // InternalPortugolCoral.g:2037:2: ( rule__AdicaoOuSubtracao__OperacaoAssignment_1_1 )
            {
             before(grammarAccess.getAdicaoOuSubtracaoAccess().getOperacaoAssignment_1_1()); 
            // InternalPortugolCoral.g:2038:2: ( rule__AdicaoOuSubtracao__OperacaoAssignment_1_1 )
            // InternalPortugolCoral.g:2038:3: rule__AdicaoOuSubtracao__OperacaoAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__AdicaoOuSubtracao__OperacaoAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getAdicaoOuSubtracaoAccess().getOperacaoAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdicaoOuSubtracao__Group_1__1__Impl"


    // $ANTLR start "rule__AdicaoOuSubtracao__Group_1__2"
    // InternalPortugolCoral.g:2046:1: rule__AdicaoOuSubtracao__Group_1__2 : rule__AdicaoOuSubtracao__Group_1__2__Impl ;
    public final void rule__AdicaoOuSubtracao__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolCoral.g:2050:1: ( rule__AdicaoOuSubtracao__Group_1__2__Impl )
            // InternalPortugolCoral.g:2051:2: rule__AdicaoOuSubtracao__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AdicaoOuSubtracao__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdicaoOuSubtracao__Group_1__2"


    // $ANTLR start "rule__AdicaoOuSubtracao__Group_1__2__Impl"
    // InternalPortugolCoral.g:2057:1: rule__AdicaoOuSubtracao__Group_1__2__Impl : ( ( rule__AdicaoOuSubtracao__DireitaAssignment_1_2 ) ) ;
    public final void rule__AdicaoOuSubtracao__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolCoral.g:2061:1: ( ( ( rule__AdicaoOuSubtracao__DireitaAssignment_1_2 ) ) )
            // InternalPortugolCoral.g:2062:1: ( ( rule__AdicaoOuSubtracao__DireitaAssignment_1_2 ) )
            {
            // InternalPortugolCoral.g:2062:1: ( ( rule__AdicaoOuSubtracao__DireitaAssignment_1_2 ) )
            // InternalPortugolCoral.g:2063:2: ( rule__AdicaoOuSubtracao__DireitaAssignment_1_2 )
            {
             before(grammarAccess.getAdicaoOuSubtracaoAccess().getDireitaAssignment_1_2()); 
            // InternalPortugolCoral.g:2064:2: ( rule__AdicaoOuSubtracao__DireitaAssignment_1_2 )
            // InternalPortugolCoral.g:2064:3: rule__AdicaoOuSubtracao__DireitaAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__AdicaoOuSubtracao__DireitaAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getAdicaoOuSubtracaoAccess().getDireitaAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdicaoOuSubtracao__Group_1__2__Impl"


    // $ANTLR start "rule__MultiplicacaoOuDivisao__Group__0"
    // InternalPortugolCoral.g:2073:1: rule__MultiplicacaoOuDivisao__Group__0 : rule__MultiplicacaoOuDivisao__Group__0__Impl rule__MultiplicacaoOuDivisao__Group__1 ;
    public final void rule__MultiplicacaoOuDivisao__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolCoral.g:2077:1: ( rule__MultiplicacaoOuDivisao__Group__0__Impl rule__MultiplicacaoOuDivisao__Group__1 )
            // InternalPortugolCoral.g:2078:2: rule__MultiplicacaoOuDivisao__Group__0__Impl rule__MultiplicacaoOuDivisao__Group__1
            {
            pushFollow(FOLLOW_26);
            rule__MultiplicacaoOuDivisao__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MultiplicacaoOuDivisao__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicacaoOuDivisao__Group__0"


    // $ANTLR start "rule__MultiplicacaoOuDivisao__Group__0__Impl"
    // InternalPortugolCoral.g:2085:1: rule__MultiplicacaoOuDivisao__Group__0__Impl : ( ruleSinal ) ;
    public final void rule__MultiplicacaoOuDivisao__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolCoral.g:2089:1: ( ( ruleSinal ) )
            // InternalPortugolCoral.g:2090:1: ( ruleSinal )
            {
            // InternalPortugolCoral.g:2090:1: ( ruleSinal )
            // InternalPortugolCoral.g:2091:2: ruleSinal
            {
             before(grammarAccess.getMultiplicacaoOuDivisaoAccess().getSinalParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleSinal();

            state._fsp--;

             after(grammarAccess.getMultiplicacaoOuDivisaoAccess().getSinalParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicacaoOuDivisao__Group__0__Impl"


    // $ANTLR start "rule__MultiplicacaoOuDivisao__Group__1"
    // InternalPortugolCoral.g:2100:1: rule__MultiplicacaoOuDivisao__Group__1 : rule__MultiplicacaoOuDivisao__Group__1__Impl ;
    public final void rule__MultiplicacaoOuDivisao__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolCoral.g:2104:1: ( rule__MultiplicacaoOuDivisao__Group__1__Impl )
            // InternalPortugolCoral.g:2105:2: rule__MultiplicacaoOuDivisao__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MultiplicacaoOuDivisao__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicacaoOuDivisao__Group__1"


    // $ANTLR start "rule__MultiplicacaoOuDivisao__Group__1__Impl"
    // InternalPortugolCoral.g:2111:1: rule__MultiplicacaoOuDivisao__Group__1__Impl : ( ( rule__MultiplicacaoOuDivisao__Group_1__0 )* ) ;
    public final void rule__MultiplicacaoOuDivisao__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolCoral.g:2115:1: ( ( ( rule__MultiplicacaoOuDivisao__Group_1__0 )* ) )
            // InternalPortugolCoral.g:2116:1: ( ( rule__MultiplicacaoOuDivisao__Group_1__0 )* )
            {
            // InternalPortugolCoral.g:2116:1: ( ( rule__MultiplicacaoOuDivisao__Group_1__0 )* )
            // InternalPortugolCoral.g:2117:2: ( rule__MultiplicacaoOuDivisao__Group_1__0 )*
            {
             before(grammarAccess.getMultiplicacaoOuDivisaoAccess().getGroup_1()); 
            // InternalPortugolCoral.g:2118:2: ( rule__MultiplicacaoOuDivisao__Group_1__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( ((LA23_0>=32 && LA23_0<=35)) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalPortugolCoral.g:2118:3: rule__MultiplicacaoOuDivisao__Group_1__0
            	    {
            	    pushFollow(FOLLOW_27);
            	    rule__MultiplicacaoOuDivisao__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

             after(grammarAccess.getMultiplicacaoOuDivisaoAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicacaoOuDivisao__Group__1__Impl"


    // $ANTLR start "rule__MultiplicacaoOuDivisao__Group_1__0"
    // InternalPortugolCoral.g:2127:1: rule__MultiplicacaoOuDivisao__Group_1__0 : rule__MultiplicacaoOuDivisao__Group_1__0__Impl rule__MultiplicacaoOuDivisao__Group_1__1 ;
    public final void rule__MultiplicacaoOuDivisao__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolCoral.g:2131:1: ( rule__MultiplicacaoOuDivisao__Group_1__0__Impl rule__MultiplicacaoOuDivisao__Group_1__1 )
            // InternalPortugolCoral.g:2132:2: rule__MultiplicacaoOuDivisao__Group_1__0__Impl rule__MultiplicacaoOuDivisao__Group_1__1
            {
            pushFollow(FOLLOW_26);
            rule__MultiplicacaoOuDivisao__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MultiplicacaoOuDivisao__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicacaoOuDivisao__Group_1__0"


    // $ANTLR start "rule__MultiplicacaoOuDivisao__Group_1__0__Impl"
    // InternalPortugolCoral.g:2139:1: rule__MultiplicacaoOuDivisao__Group_1__0__Impl : ( () ) ;
    public final void rule__MultiplicacaoOuDivisao__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolCoral.g:2143:1: ( ( () ) )
            // InternalPortugolCoral.g:2144:1: ( () )
            {
            // InternalPortugolCoral.g:2144:1: ( () )
            // InternalPortugolCoral.g:2145:2: ()
            {
             before(grammarAccess.getMultiplicacaoOuDivisaoAccess().getMultiplicacaoOuDivisaoEsquerdaAction_1_0()); 
            // InternalPortugolCoral.g:2146:2: ()
            // InternalPortugolCoral.g:2146:3: 
            {
            }

             after(grammarAccess.getMultiplicacaoOuDivisaoAccess().getMultiplicacaoOuDivisaoEsquerdaAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicacaoOuDivisao__Group_1__0__Impl"


    // $ANTLR start "rule__MultiplicacaoOuDivisao__Group_1__1"
    // InternalPortugolCoral.g:2154:1: rule__MultiplicacaoOuDivisao__Group_1__1 : rule__MultiplicacaoOuDivisao__Group_1__1__Impl rule__MultiplicacaoOuDivisao__Group_1__2 ;
    public final void rule__MultiplicacaoOuDivisao__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolCoral.g:2158:1: ( rule__MultiplicacaoOuDivisao__Group_1__1__Impl rule__MultiplicacaoOuDivisao__Group_1__2 )
            // InternalPortugolCoral.g:2159:2: rule__MultiplicacaoOuDivisao__Group_1__1__Impl rule__MultiplicacaoOuDivisao__Group_1__2
            {
            pushFollow(FOLLOW_14);
            rule__MultiplicacaoOuDivisao__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MultiplicacaoOuDivisao__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicacaoOuDivisao__Group_1__1"


    // $ANTLR start "rule__MultiplicacaoOuDivisao__Group_1__1__Impl"
    // InternalPortugolCoral.g:2166:1: rule__MultiplicacaoOuDivisao__Group_1__1__Impl : ( ( rule__MultiplicacaoOuDivisao__OperacaoAssignment_1_1 ) ) ;
    public final void rule__MultiplicacaoOuDivisao__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolCoral.g:2170:1: ( ( ( rule__MultiplicacaoOuDivisao__OperacaoAssignment_1_1 ) ) )
            // InternalPortugolCoral.g:2171:1: ( ( rule__MultiplicacaoOuDivisao__OperacaoAssignment_1_1 ) )
            {
            // InternalPortugolCoral.g:2171:1: ( ( rule__MultiplicacaoOuDivisao__OperacaoAssignment_1_1 ) )
            // InternalPortugolCoral.g:2172:2: ( rule__MultiplicacaoOuDivisao__OperacaoAssignment_1_1 )
            {
             before(grammarAccess.getMultiplicacaoOuDivisaoAccess().getOperacaoAssignment_1_1()); 
            // InternalPortugolCoral.g:2173:2: ( rule__MultiplicacaoOuDivisao__OperacaoAssignment_1_1 )
            // InternalPortugolCoral.g:2173:3: rule__MultiplicacaoOuDivisao__OperacaoAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__MultiplicacaoOuDivisao__OperacaoAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getMultiplicacaoOuDivisaoAccess().getOperacaoAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicacaoOuDivisao__Group_1__1__Impl"


    // $ANTLR start "rule__MultiplicacaoOuDivisao__Group_1__2"
    // InternalPortugolCoral.g:2181:1: rule__MultiplicacaoOuDivisao__Group_1__2 : rule__MultiplicacaoOuDivisao__Group_1__2__Impl ;
    public final void rule__MultiplicacaoOuDivisao__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolCoral.g:2185:1: ( rule__MultiplicacaoOuDivisao__Group_1__2__Impl )
            // InternalPortugolCoral.g:2186:2: rule__MultiplicacaoOuDivisao__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MultiplicacaoOuDivisao__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicacaoOuDivisao__Group_1__2"


    // $ANTLR start "rule__MultiplicacaoOuDivisao__Group_1__2__Impl"
    // InternalPortugolCoral.g:2192:1: rule__MultiplicacaoOuDivisao__Group_1__2__Impl : ( ( rule__MultiplicacaoOuDivisao__DireitaAssignment_1_2 ) ) ;
    public final void rule__MultiplicacaoOuDivisao__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolCoral.g:2196:1: ( ( ( rule__MultiplicacaoOuDivisao__DireitaAssignment_1_2 ) ) )
            // InternalPortugolCoral.g:2197:1: ( ( rule__MultiplicacaoOuDivisao__DireitaAssignment_1_2 ) )
            {
            // InternalPortugolCoral.g:2197:1: ( ( rule__MultiplicacaoOuDivisao__DireitaAssignment_1_2 ) )
            // InternalPortugolCoral.g:2198:2: ( rule__MultiplicacaoOuDivisao__DireitaAssignment_1_2 )
            {
             before(grammarAccess.getMultiplicacaoOuDivisaoAccess().getDireitaAssignment_1_2()); 
            // InternalPortugolCoral.g:2199:2: ( rule__MultiplicacaoOuDivisao__DireitaAssignment_1_2 )
            // InternalPortugolCoral.g:2199:3: rule__MultiplicacaoOuDivisao__DireitaAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__MultiplicacaoOuDivisao__DireitaAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getMultiplicacaoOuDivisaoAccess().getDireitaAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicacaoOuDivisao__Group_1__2__Impl"


    // $ANTLR start "rule__Sinal__Group__0"
    // InternalPortugolCoral.g:2208:1: rule__Sinal__Group__0 : rule__Sinal__Group__0__Impl rule__Sinal__Group__1 ;
    public final void rule__Sinal__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolCoral.g:2212:1: ( rule__Sinal__Group__0__Impl rule__Sinal__Group__1 )
            // InternalPortugolCoral.g:2213:2: rule__Sinal__Group__0__Impl rule__Sinal__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__Sinal__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sinal__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sinal__Group__0"


    // $ANTLR start "rule__Sinal__Group__0__Impl"
    // InternalPortugolCoral.g:2220:1: rule__Sinal__Group__0__Impl : ( ( rule__Sinal__SinaisAssignment_0 )* ) ;
    public final void rule__Sinal__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolCoral.g:2224:1: ( ( ( rule__Sinal__SinaisAssignment_0 )* ) )
            // InternalPortugolCoral.g:2225:1: ( ( rule__Sinal__SinaisAssignment_0 )* )
            {
            // InternalPortugolCoral.g:2225:1: ( ( rule__Sinal__SinaisAssignment_0 )* )
            // InternalPortugolCoral.g:2226:2: ( rule__Sinal__SinaisAssignment_0 )*
            {
             before(grammarAccess.getSinalAccess().getSinaisAssignment_0()); 
            // InternalPortugolCoral.g:2227:2: ( rule__Sinal__SinaisAssignment_0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( ((LA24_0>=30 && LA24_0<=31)) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalPortugolCoral.g:2227:3: rule__Sinal__SinaisAssignment_0
            	    {
            	    pushFollow(FOLLOW_25);
            	    rule__Sinal__SinaisAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

             after(grammarAccess.getSinalAccess().getSinaisAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sinal__Group__0__Impl"


    // $ANTLR start "rule__Sinal__Group__1"
    // InternalPortugolCoral.g:2235:1: rule__Sinal__Group__1 : rule__Sinal__Group__1__Impl ;
    public final void rule__Sinal__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolCoral.g:2239:1: ( rule__Sinal__Group__1__Impl )
            // InternalPortugolCoral.g:2240:2: rule__Sinal__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Sinal__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sinal__Group__1"


    // $ANTLR start "rule__Sinal__Group__1__Impl"
    // InternalPortugolCoral.g:2246:1: rule__Sinal__Group__1__Impl : ( ( rule__Sinal__DireitaAssignment_1 ) ) ;
    public final void rule__Sinal__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolCoral.g:2250:1: ( ( ( rule__Sinal__DireitaAssignment_1 ) ) )
            // InternalPortugolCoral.g:2251:1: ( ( rule__Sinal__DireitaAssignment_1 ) )
            {
            // InternalPortugolCoral.g:2251:1: ( ( rule__Sinal__DireitaAssignment_1 ) )
            // InternalPortugolCoral.g:2252:2: ( rule__Sinal__DireitaAssignment_1 )
            {
             before(grammarAccess.getSinalAccess().getDireitaAssignment_1()); 
            // InternalPortugolCoral.g:2253:2: ( rule__Sinal__DireitaAssignment_1 )
            // InternalPortugolCoral.g:2253:3: rule__Sinal__DireitaAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Sinal__DireitaAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSinalAccess().getDireitaAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sinal__Group__1__Impl"


    // $ANTLR start "rule__Exponenciacao__Group__0"
    // InternalPortugolCoral.g:2262:1: rule__Exponenciacao__Group__0 : rule__Exponenciacao__Group__0__Impl rule__Exponenciacao__Group__1 ;
    public final void rule__Exponenciacao__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolCoral.g:2266:1: ( rule__Exponenciacao__Group__0__Impl rule__Exponenciacao__Group__1 )
            // InternalPortugolCoral.g:2267:2: rule__Exponenciacao__Group__0__Impl rule__Exponenciacao__Group__1
            {
            pushFollow(FOLLOW_28);
            rule__Exponenciacao__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Exponenciacao__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exponenciacao__Group__0"


    // $ANTLR start "rule__Exponenciacao__Group__0__Impl"
    // InternalPortugolCoral.g:2274:1: rule__Exponenciacao__Group__0__Impl : ( ruleElemento ) ;
    public final void rule__Exponenciacao__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolCoral.g:2278:1: ( ( ruleElemento ) )
            // InternalPortugolCoral.g:2279:1: ( ruleElemento )
            {
            // InternalPortugolCoral.g:2279:1: ( ruleElemento )
            // InternalPortugolCoral.g:2280:2: ruleElemento
            {
             before(grammarAccess.getExponenciacaoAccess().getElementoParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleElemento();

            state._fsp--;

             after(grammarAccess.getExponenciacaoAccess().getElementoParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exponenciacao__Group__0__Impl"


    // $ANTLR start "rule__Exponenciacao__Group__1"
    // InternalPortugolCoral.g:2289:1: rule__Exponenciacao__Group__1 : rule__Exponenciacao__Group__1__Impl ;
    public final void rule__Exponenciacao__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolCoral.g:2293:1: ( rule__Exponenciacao__Group__1__Impl )
            // InternalPortugolCoral.g:2294:2: rule__Exponenciacao__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Exponenciacao__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exponenciacao__Group__1"


    // $ANTLR start "rule__Exponenciacao__Group__1__Impl"
    // InternalPortugolCoral.g:2300:1: rule__Exponenciacao__Group__1__Impl : ( ( rule__Exponenciacao__Group_1__0 )* ) ;
    public final void rule__Exponenciacao__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolCoral.g:2304:1: ( ( ( rule__Exponenciacao__Group_1__0 )* ) )
            // InternalPortugolCoral.g:2305:1: ( ( rule__Exponenciacao__Group_1__0 )* )
            {
            // InternalPortugolCoral.g:2305:1: ( ( rule__Exponenciacao__Group_1__0 )* )
            // InternalPortugolCoral.g:2306:2: ( rule__Exponenciacao__Group_1__0 )*
            {
             before(grammarAccess.getExponenciacaoAccess().getGroup_1()); 
            // InternalPortugolCoral.g:2307:2: ( rule__Exponenciacao__Group_1__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==45) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalPortugolCoral.g:2307:3: rule__Exponenciacao__Group_1__0
            	    {
            	    pushFollow(FOLLOW_29);
            	    rule__Exponenciacao__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

             after(grammarAccess.getExponenciacaoAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exponenciacao__Group__1__Impl"


    // $ANTLR start "rule__Exponenciacao__Group_1__0"
    // InternalPortugolCoral.g:2316:1: rule__Exponenciacao__Group_1__0 : rule__Exponenciacao__Group_1__0__Impl rule__Exponenciacao__Group_1__1 ;
    public final void rule__Exponenciacao__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolCoral.g:2320:1: ( rule__Exponenciacao__Group_1__0__Impl rule__Exponenciacao__Group_1__1 )
            // InternalPortugolCoral.g:2321:2: rule__Exponenciacao__Group_1__0__Impl rule__Exponenciacao__Group_1__1
            {
            pushFollow(FOLLOW_28);
            rule__Exponenciacao__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Exponenciacao__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exponenciacao__Group_1__0"


    // $ANTLR start "rule__Exponenciacao__Group_1__0__Impl"
    // InternalPortugolCoral.g:2328:1: rule__Exponenciacao__Group_1__0__Impl : ( () ) ;
    public final void rule__Exponenciacao__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolCoral.g:2332:1: ( ( () ) )
            // InternalPortugolCoral.g:2333:1: ( () )
            {
            // InternalPortugolCoral.g:2333:1: ( () )
            // InternalPortugolCoral.g:2334:2: ()
            {
             before(grammarAccess.getExponenciacaoAccess().getExponenciacaoEsquerdaAction_1_0()); 
            // InternalPortugolCoral.g:2335:2: ()
            // InternalPortugolCoral.g:2335:3: 
            {
            }

             after(grammarAccess.getExponenciacaoAccess().getExponenciacaoEsquerdaAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exponenciacao__Group_1__0__Impl"


    // $ANTLR start "rule__Exponenciacao__Group_1__1"
    // InternalPortugolCoral.g:2343:1: rule__Exponenciacao__Group_1__1 : rule__Exponenciacao__Group_1__1__Impl rule__Exponenciacao__Group_1__2 ;
    public final void rule__Exponenciacao__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolCoral.g:2347:1: ( rule__Exponenciacao__Group_1__1__Impl rule__Exponenciacao__Group_1__2 )
            // InternalPortugolCoral.g:2348:2: rule__Exponenciacao__Group_1__1__Impl rule__Exponenciacao__Group_1__2
            {
            pushFollow(FOLLOW_14);
            rule__Exponenciacao__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Exponenciacao__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exponenciacao__Group_1__1"


    // $ANTLR start "rule__Exponenciacao__Group_1__1__Impl"
    // InternalPortugolCoral.g:2355:1: rule__Exponenciacao__Group_1__1__Impl : ( '^' ) ;
    public final void rule__Exponenciacao__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolCoral.g:2359:1: ( ( '^' ) )
            // InternalPortugolCoral.g:2360:1: ( '^' )
            {
            // InternalPortugolCoral.g:2360:1: ( '^' )
            // InternalPortugolCoral.g:2361:2: '^'
            {
             before(grammarAccess.getExponenciacaoAccess().getCircumflexAccentKeyword_1_1()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getExponenciacaoAccess().getCircumflexAccentKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exponenciacao__Group_1__1__Impl"


    // $ANTLR start "rule__Exponenciacao__Group_1__2"
    // InternalPortugolCoral.g:2370:1: rule__Exponenciacao__Group_1__2 : rule__Exponenciacao__Group_1__2__Impl ;
    public final void rule__Exponenciacao__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolCoral.g:2374:1: ( rule__Exponenciacao__Group_1__2__Impl )
            // InternalPortugolCoral.g:2375:2: rule__Exponenciacao__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Exponenciacao__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exponenciacao__Group_1__2"


    // $ANTLR start "rule__Exponenciacao__Group_1__2__Impl"
    // InternalPortugolCoral.g:2381:1: rule__Exponenciacao__Group_1__2__Impl : ( ( rule__Exponenciacao__DireitaAssignment_1_2 ) ) ;
    public final void rule__Exponenciacao__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolCoral.g:2385:1: ( ( ( rule__Exponenciacao__DireitaAssignment_1_2 ) ) )
            // InternalPortugolCoral.g:2386:1: ( ( rule__Exponenciacao__DireitaAssignment_1_2 ) )
            {
            // InternalPortugolCoral.g:2386:1: ( ( rule__Exponenciacao__DireitaAssignment_1_2 ) )
            // InternalPortugolCoral.g:2387:2: ( rule__Exponenciacao__DireitaAssignment_1_2 )
            {
             before(grammarAccess.getExponenciacaoAccess().getDireitaAssignment_1_2()); 
            // InternalPortugolCoral.g:2388:2: ( rule__Exponenciacao__DireitaAssignment_1_2 )
            // InternalPortugolCoral.g:2388:3: rule__Exponenciacao__DireitaAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Exponenciacao__DireitaAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getExponenciacaoAccess().getDireitaAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exponenciacao__Group_1__2__Impl"


    // $ANTLR start "rule__Parenteses__Group__0"
    // InternalPortugolCoral.g:2397:1: rule__Parenteses__Group__0 : rule__Parenteses__Group__0__Impl rule__Parenteses__Group__1 ;
    public final void rule__Parenteses__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolCoral.g:2401:1: ( rule__Parenteses__Group__0__Impl rule__Parenteses__Group__1 )
            // InternalPortugolCoral.g:2402:2: rule__Parenteses__Group__0__Impl rule__Parenteses__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__Parenteses__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parenteses__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parenteses__Group__0"


    // $ANTLR start "rule__Parenteses__Group__0__Impl"
    // InternalPortugolCoral.g:2409:1: rule__Parenteses__Group__0__Impl : ( '(' ) ;
    public final void rule__Parenteses__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolCoral.g:2413:1: ( ( '(' ) )
            // InternalPortugolCoral.g:2414:1: ( '(' )
            {
            // InternalPortugolCoral.g:2414:1: ( '(' )
            // InternalPortugolCoral.g:2415:2: '('
            {
             before(grammarAccess.getParentesesAccess().getLeftParenthesisKeyword_0()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getParentesesAccess().getLeftParenthesisKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parenteses__Group__0__Impl"


    // $ANTLR start "rule__Parenteses__Group__1"
    // InternalPortugolCoral.g:2424:1: rule__Parenteses__Group__1 : rule__Parenteses__Group__1__Impl rule__Parenteses__Group__2 ;
    public final void rule__Parenteses__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolCoral.g:2428:1: ( rule__Parenteses__Group__1__Impl rule__Parenteses__Group__2 )
            // InternalPortugolCoral.g:2429:2: rule__Parenteses__Group__1__Impl rule__Parenteses__Group__2
            {
            pushFollow(FOLLOW_30);
            rule__Parenteses__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parenteses__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parenteses__Group__1"


    // $ANTLR start "rule__Parenteses__Group__1__Impl"
    // InternalPortugolCoral.g:2436:1: rule__Parenteses__Group__1__Impl : ( ( rule__Parenteses__DireitaAssignment_1 ) ) ;
    public final void rule__Parenteses__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolCoral.g:2440:1: ( ( ( rule__Parenteses__DireitaAssignment_1 ) ) )
            // InternalPortugolCoral.g:2441:1: ( ( rule__Parenteses__DireitaAssignment_1 ) )
            {
            // InternalPortugolCoral.g:2441:1: ( ( rule__Parenteses__DireitaAssignment_1 ) )
            // InternalPortugolCoral.g:2442:2: ( rule__Parenteses__DireitaAssignment_1 )
            {
             before(grammarAccess.getParentesesAccess().getDireitaAssignment_1()); 
            // InternalPortugolCoral.g:2443:2: ( rule__Parenteses__DireitaAssignment_1 )
            // InternalPortugolCoral.g:2443:3: rule__Parenteses__DireitaAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Parenteses__DireitaAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getParentesesAccess().getDireitaAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parenteses__Group__1__Impl"


    // $ANTLR start "rule__Parenteses__Group__2"
    // InternalPortugolCoral.g:2451:1: rule__Parenteses__Group__2 : rule__Parenteses__Group__2__Impl ;
    public final void rule__Parenteses__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolCoral.g:2455:1: ( rule__Parenteses__Group__2__Impl )
            // InternalPortugolCoral.g:2456:2: rule__Parenteses__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Parenteses__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parenteses__Group__2"


    // $ANTLR start "rule__Parenteses__Group__2__Impl"
    // InternalPortugolCoral.g:2462:1: rule__Parenteses__Group__2__Impl : ( ')' ) ;
    public final void rule__Parenteses__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolCoral.g:2466:1: ( ( ')' ) )
            // InternalPortugolCoral.g:2467:1: ( ')' )
            {
            // InternalPortugolCoral.g:2467:1: ( ')' )
            // InternalPortugolCoral.g:2468:2: ')'
            {
             before(grammarAccess.getParentesesAccess().getRightParenthesisKeyword_2()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getParentesesAccess().getRightParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parenteses__Group__2__Impl"


    // $ANTLR start "rule__Matriz__Group__0"
    // InternalPortugolCoral.g:2478:1: rule__Matriz__Group__0 : rule__Matriz__Group__0__Impl rule__Matriz__Group__1 ;
    public final void rule__Matriz__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolCoral.g:2482:1: ( rule__Matriz__Group__0__Impl rule__Matriz__Group__1 )
            // InternalPortugolCoral.g:2483:2: rule__Matriz__Group__0__Impl rule__Matriz__Group__1
            {
            pushFollow(FOLLOW_31);
            rule__Matriz__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Matriz__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Matriz__Group__0"


    // $ANTLR start "rule__Matriz__Group__0__Impl"
    // InternalPortugolCoral.g:2490:1: rule__Matriz__Group__0__Impl : ( ( rule__Matriz__VariavelAssignment_0 ) ) ;
    public final void rule__Matriz__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolCoral.g:2494:1: ( ( ( rule__Matriz__VariavelAssignment_0 ) ) )
            // InternalPortugolCoral.g:2495:1: ( ( rule__Matriz__VariavelAssignment_0 ) )
            {
            // InternalPortugolCoral.g:2495:1: ( ( rule__Matriz__VariavelAssignment_0 ) )
            // InternalPortugolCoral.g:2496:2: ( rule__Matriz__VariavelAssignment_0 )
            {
             before(grammarAccess.getMatrizAccess().getVariavelAssignment_0()); 
            // InternalPortugolCoral.g:2497:2: ( rule__Matriz__VariavelAssignment_0 )
            // InternalPortugolCoral.g:2497:3: rule__Matriz__VariavelAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Matriz__VariavelAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getMatrizAccess().getVariavelAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Matriz__Group__0__Impl"


    // $ANTLR start "rule__Matriz__Group__1"
    // InternalPortugolCoral.g:2505:1: rule__Matriz__Group__1 : rule__Matriz__Group__1__Impl ;
    public final void rule__Matriz__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolCoral.g:2509:1: ( rule__Matriz__Group__1__Impl )
            // InternalPortugolCoral.g:2510:2: rule__Matriz__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Matriz__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Matriz__Group__1"


    // $ANTLR start "rule__Matriz__Group__1__Impl"
    // InternalPortugolCoral.g:2516:1: rule__Matriz__Group__1__Impl : ( ( ( rule__Matriz__DireitaAssignment_1 ) ) ( ( rule__Matriz__DireitaAssignment_1 )* ) ) ;
    public final void rule__Matriz__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolCoral.g:2520:1: ( ( ( ( rule__Matriz__DireitaAssignment_1 ) ) ( ( rule__Matriz__DireitaAssignment_1 )* ) ) )
            // InternalPortugolCoral.g:2521:1: ( ( ( rule__Matriz__DireitaAssignment_1 ) ) ( ( rule__Matriz__DireitaAssignment_1 )* ) )
            {
            // InternalPortugolCoral.g:2521:1: ( ( ( rule__Matriz__DireitaAssignment_1 ) ) ( ( rule__Matriz__DireitaAssignment_1 )* ) )
            // InternalPortugolCoral.g:2522:2: ( ( rule__Matriz__DireitaAssignment_1 ) ) ( ( rule__Matriz__DireitaAssignment_1 )* )
            {
            // InternalPortugolCoral.g:2522:2: ( ( rule__Matriz__DireitaAssignment_1 ) )
            // InternalPortugolCoral.g:2523:3: ( rule__Matriz__DireitaAssignment_1 )
            {
             before(grammarAccess.getMatrizAccess().getDireitaAssignment_1()); 
            // InternalPortugolCoral.g:2524:3: ( rule__Matriz__DireitaAssignment_1 )
            // InternalPortugolCoral.g:2524:4: rule__Matriz__DireitaAssignment_1
            {
            pushFollow(FOLLOW_32);
            rule__Matriz__DireitaAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMatrizAccess().getDireitaAssignment_1()); 

            }

            // InternalPortugolCoral.g:2527:2: ( ( rule__Matriz__DireitaAssignment_1 )* )
            // InternalPortugolCoral.g:2528:3: ( rule__Matriz__DireitaAssignment_1 )*
            {
             before(grammarAccess.getMatrizAccess().getDireitaAssignment_1()); 
            // InternalPortugolCoral.g:2529:3: ( rule__Matriz__DireitaAssignment_1 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==48) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalPortugolCoral.g:2529:4: rule__Matriz__DireitaAssignment_1
            	    {
            	    pushFollow(FOLLOW_32);
            	    rule__Matriz__DireitaAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

             after(grammarAccess.getMatrizAccess().getDireitaAssignment_1()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Matriz__Group__1__Impl"


    // $ANTLR start "rule__PosicaoMatriz__Group__0"
    // InternalPortugolCoral.g:2539:1: rule__PosicaoMatriz__Group__0 : rule__PosicaoMatriz__Group__0__Impl rule__PosicaoMatriz__Group__1 ;
    public final void rule__PosicaoMatriz__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolCoral.g:2543:1: ( rule__PosicaoMatriz__Group__0__Impl rule__PosicaoMatriz__Group__1 )
            // InternalPortugolCoral.g:2544:2: rule__PosicaoMatriz__Group__0__Impl rule__PosicaoMatriz__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__PosicaoMatriz__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PosicaoMatriz__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PosicaoMatriz__Group__0"


    // $ANTLR start "rule__PosicaoMatriz__Group__0__Impl"
    // InternalPortugolCoral.g:2551:1: rule__PosicaoMatriz__Group__0__Impl : ( '[' ) ;
    public final void rule__PosicaoMatriz__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolCoral.g:2555:1: ( ( '[' ) )
            // InternalPortugolCoral.g:2556:1: ( '[' )
            {
            // InternalPortugolCoral.g:2556:1: ( '[' )
            // InternalPortugolCoral.g:2557:2: '['
            {
             before(grammarAccess.getPosicaoMatrizAccess().getLeftSquareBracketKeyword_0()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getPosicaoMatrizAccess().getLeftSquareBracketKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PosicaoMatriz__Group__0__Impl"


    // $ANTLR start "rule__PosicaoMatriz__Group__1"
    // InternalPortugolCoral.g:2566:1: rule__PosicaoMatriz__Group__1 : rule__PosicaoMatriz__Group__1__Impl rule__PosicaoMatriz__Group__2 ;
    public final void rule__PosicaoMatriz__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolCoral.g:2570:1: ( rule__PosicaoMatriz__Group__1__Impl rule__PosicaoMatriz__Group__2 )
            // InternalPortugolCoral.g:2571:2: rule__PosicaoMatriz__Group__1__Impl rule__PosicaoMatriz__Group__2
            {
            pushFollow(FOLLOW_33);
            rule__PosicaoMatriz__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PosicaoMatriz__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PosicaoMatriz__Group__1"


    // $ANTLR start "rule__PosicaoMatriz__Group__1__Impl"
    // InternalPortugolCoral.g:2578:1: rule__PosicaoMatriz__Group__1__Impl : ( ( rule__PosicaoMatriz__DireitaAssignment_1 ) ) ;
    public final void rule__PosicaoMatriz__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolCoral.g:2582:1: ( ( ( rule__PosicaoMatriz__DireitaAssignment_1 ) ) )
            // InternalPortugolCoral.g:2583:1: ( ( rule__PosicaoMatriz__DireitaAssignment_1 ) )
            {
            // InternalPortugolCoral.g:2583:1: ( ( rule__PosicaoMatriz__DireitaAssignment_1 ) )
            // InternalPortugolCoral.g:2584:2: ( rule__PosicaoMatriz__DireitaAssignment_1 )
            {
             before(grammarAccess.getPosicaoMatrizAccess().getDireitaAssignment_1()); 
            // InternalPortugolCoral.g:2585:2: ( rule__PosicaoMatriz__DireitaAssignment_1 )
            // InternalPortugolCoral.g:2585:3: rule__PosicaoMatriz__DireitaAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__PosicaoMatriz__DireitaAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPosicaoMatrizAccess().getDireitaAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PosicaoMatriz__Group__1__Impl"


    // $ANTLR start "rule__PosicaoMatriz__Group__2"
    // InternalPortugolCoral.g:2593:1: rule__PosicaoMatriz__Group__2 : rule__PosicaoMatriz__Group__2__Impl ;
    public final void rule__PosicaoMatriz__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolCoral.g:2597:1: ( rule__PosicaoMatriz__Group__2__Impl )
            // InternalPortugolCoral.g:2598:2: rule__PosicaoMatriz__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PosicaoMatriz__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PosicaoMatriz__Group__2"


    // $ANTLR start "rule__PosicaoMatriz__Group__2__Impl"
    // InternalPortugolCoral.g:2604:1: rule__PosicaoMatriz__Group__2__Impl : ( ']' ) ;
    public final void rule__PosicaoMatriz__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolCoral.g:2608:1: ( ( ']' ) )
            // InternalPortugolCoral.g:2609:1: ( ']' )
            {
            // InternalPortugolCoral.g:2609:1: ( ']' )
            // InternalPortugolCoral.g:2610:2: ']'
            {
             before(grammarAccess.getPosicaoMatrizAccess().getRightSquareBracketKeyword_2()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getPosicaoMatrizAccess().getRightSquareBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PosicaoMatriz__Group__2__Impl"


    // $ANTLR start "rule__ElementoAtomico__Group_0__0"
    // InternalPortugolCoral.g:2620:1: rule__ElementoAtomico__Group_0__0 : rule__ElementoAtomico__Group_0__0__Impl rule__ElementoAtomico__Group_0__1 ;
    public final void rule__ElementoAtomico__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolCoral.g:2624:1: ( rule__ElementoAtomico__Group_0__0__Impl rule__ElementoAtomico__Group_0__1 )
            // InternalPortugolCoral.g:2625:2: rule__ElementoAtomico__Group_0__0__Impl rule__ElementoAtomico__Group_0__1
            {
            pushFollow(FOLLOW_34);
            rule__ElementoAtomico__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ElementoAtomico__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElementoAtomico__Group_0__0"


    // $ANTLR start "rule__ElementoAtomico__Group_0__0__Impl"
    // InternalPortugolCoral.g:2632:1: rule__ElementoAtomico__Group_0__0__Impl : ( () ) ;
    public final void rule__ElementoAtomico__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolCoral.g:2636:1: ( ( () ) )
            // InternalPortugolCoral.g:2637:1: ( () )
            {
            // InternalPortugolCoral.g:2637:1: ( () )
            // InternalPortugolCoral.g:2638:2: ()
            {
             before(grammarAccess.getElementoAtomicoAccess().getConstanteInteiraAction_0_0()); 
            // InternalPortugolCoral.g:2639:2: ()
            // InternalPortugolCoral.g:2639:3: 
            {
            }

             after(grammarAccess.getElementoAtomicoAccess().getConstanteInteiraAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElementoAtomico__Group_0__0__Impl"


    // $ANTLR start "rule__ElementoAtomico__Group_0__1"
    // InternalPortugolCoral.g:2647:1: rule__ElementoAtomico__Group_0__1 : rule__ElementoAtomico__Group_0__1__Impl ;
    public final void rule__ElementoAtomico__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolCoral.g:2651:1: ( rule__ElementoAtomico__Group_0__1__Impl )
            // InternalPortugolCoral.g:2652:2: rule__ElementoAtomico__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ElementoAtomico__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElementoAtomico__Group_0__1"


    // $ANTLR start "rule__ElementoAtomico__Group_0__1__Impl"
    // InternalPortugolCoral.g:2658:1: rule__ElementoAtomico__Group_0__1__Impl : ( ( rule__ElementoAtomico__ValorAssignment_0_1 ) ) ;
    public final void rule__ElementoAtomico__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolCoral.g:2662:1: ( ( ( rule__ElementoAtomico__ValorAssignment_0_1 ) ) )
            // InternalPortugolCoral.g:2663:1: ( ( rule__ElementoAtomico__ValorAssignment_0_1 ) )
            {
            // InternalPortugolCoral.g:2663:1: ( ( rule__ElementoAtomico__ValorAssignment_0_1 ) )
            // InternalPortugolCoral.g:2664:2: ( rule__ElementoAtomico__ValorAssignment_0_1 )
            {
             before(grammarAccess.getElementoAtomicoAccess().getValorAssignment_0_1()); 
            // InternalPortugolCoral.g:2665:2: ( rule__ElementoAtomico__ValorAssignment_0_1 )
            // InternalPortugolCoral.g:2665:3: rule__ElementoAtomico__ValorAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__ElementoAtomico__ValorAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getElementoAtomicoAccess().getValorAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElementoAtomico__Group_0__1__Impl"


    // $ANTLR start "rule__ElementoAtomico__Group_1__0"
    // InternalPortugolCoral.g:2674:1: rule__ElementoAtomico__Group_1__0 : rule__ElementoAtomico__Group_1__0__Impl rule__ElementoAtomico__Group_1__1 ;
    public final void rule__ElementoAtomico__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolCoral.g:2678:1: ( rule__ElementoAtomico__Group_1__0__Impl rule__ElementoAtomico__Group_1__1 )
            // InternalPortugolCoral.g:2679:2: rule__ElementoAtomico__Group_1__0__Impl rule__ElementoAtomico__Group_1__1
            {
            pushFollow(FOLLOW_35);
            rule__ElementoAtomico__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ElementoAtomico__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElementoAtomico__Group_1__0"


    // $ANTLR start "rule__ElementoAtomico__Group_1__0__Impl"
    // InternalPortugolCoral.g:2686:1: rule__ElementoAtomico__Group_1__0__Impl : ( () ) ;
    public final void rule__ElementoAtomico__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolCoral.g:2690:1: ( ( () ) )
            // InternalPortugolCoral.g:2691:1: ( () )
            {
            // InternalPortugolCoral.g:2691:1: ( () )
            // InternalPortugolCoral.g:2692:2: ()
            {
             before(grammarAccess.getElementoAtomicoAccess().getConstanteRealAction_1_0()); 
            // InternalPortugolCoral.g:2693:2: ()
            // InternalPortugolCoral.g:2693:3: 
            {
            }

             after(grammarAccess.getElementoAtomicoAccess().getConstanteRealAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElementoAtomico__Group_1__0__Impl"


    // $ANTLR start "rule__ElementoAtomico__Group_1__1"
    // InternalPortugolCoral.g:2701:1: rule__ElementoAtomico__Group_1__1 : rule__ElementoAtomico__Group_1__1__Impl ;
    public final void rule__ElementoAtomico__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolCoral.g:2705:1: ( rule__ElementoAtomico__Group_1__1__Impl )
            // InternalPortugolCoral.g:2706:2: rule__ElementoAtomico__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ElementoAtomico__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElementoAtomico__Group_1__1"


    // $ANTLR start "rule__ElementoAtomico__Group_1__1__Impl"
    // InternalPortugolCoral.g:2712:1: rule__ElementoAtomico__Group_1__1__Impl : ( ( rule__ElementoAtomico__ValorAssignment_1_1 ) ) ;
    public final void rule__ElementoAtomico__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolCoral.g:2716:1: ( ( ( rule__ElementoAtomico__ValorAssignment_1_1 ) ) )
            // InternalPortugolCoral.g:2717:1: ( ( rule__ElementoAtomico__ValorAssignment_1_1 ) )
            {
            // InternalPortugolCoral.g:2717:1: ( ( rule__ElementoAtomico__ValorAssignment_1_1 ) )
            // InternalPortugolCoral.g:2718:2: ( rule__ElementoAtomico__ValorAssignment_1_1 )
            {
             before(grammarAccess.getElementoAtomicoAccess().getValorAssignment_1_1()); 
            // InternalPortugolCoral.g:2719:2: ( rule__ElementoAtomico__ValorAssignment_1_1 )
            // InternalPortugolCoral.g:2719:3: rule__ElementoAtomico__ValorAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__ElementoAtomico__ValorAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getElementoAtomicoAccess().getValorAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElementoAtomico__Group_1__1__Impl"


    // $ANTLR start "rule__ElementoAtomico__Group_2__0"
    // InternalPortugolCoral.g:2728:1: rule__ElementoAtomico__Group_2__0 : rule__ElementoAtomico__Group_2__0__Impl rule__ElementoAtomico__Group_2__1 ;
    public final void rule__ElementoAtomico__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolCoral.g:2732:1: ( rule__ElementoAtomico__Group_2__0__Impl rule__ElementoAtomico__Group_2__1 )
            // InternalPortugolCoral.g:2733:2: rule__ElementoAtomico__Group_2__0__Impl rule__ElementoAtomico__Group_2__1
            {
            pushFollow(FOLLOW_36);
            rule__ElementoAtomico__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ElementoAtomico__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElementoAtomico__Group_2__0"


    // $ANTLR start "rule__ElementoAtomico__Group_2__0__Impl"
    // InternalPortugolCoral.g:2740:1: rule__ElementoAtomico__Group_2__0__Impl : ( () ) ;
    public final void rule__ElementoAtomico__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolCoral.g:2744:1: ( ( () ) )
            // InternalPortugolCoral.g:2745:1: ( () )
            {
            // InternalPortugolCoral.g:2745:1: ( () )
            // InternalPortugolCoral.g:2746:2: ()
            {
             before(grammarAccess.getElementoAtomicoAccess().getConstanteStringAction_2_0()); 
            // InternalPortugolCoral.g:2747:2: ()
            // InternalPortugolCoral.g:2747:3: 
            {
            }

             after(grammarAccess.getElementoAtomicoAccess().getConstanteStringAction_2_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElementoAtomico__Group_2__0__Impl"


    // $ANTLR start "rule__ElementoAtomico__Group_2__1"
    // InternalPortugolCoral.g:2755:1: rule__ElementoAtomico__Group_2__1 : rule__ElementoAtomico__Group_2__1__Impl ;
    public final void rule__ElementoAtomico__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolCoral.g:2759:1: ( rule__ElementoAtomico__Group_2__1__Impl )
            // InternalPortugolCoral.g:2760:2: rule__ElementoAtomico__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ElementoAtomico__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElementoAtomico__Group_2__1"


    // $ANTLR start "rule__ElementoAtomico__Group_2__1__Impl"
    // InternalPortugolCoral.g:2766:1: rule__ElementoAtomico__Group_2__1__Impl : ( ( rule__ElementoAtomico__ValorAssignment_2_1 ) ) ;
    public final void rule__ElementoAtomico__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolCoral.g:2770:1: ( ( ( rule__ElementoAtomico__ValorAssignment_2_1 ) ) )
            // InternalPortugolCoral.g:2771:1: ( ( rule__ElementoAtomico__ValorAssignment_2_1 ) )
            {
            // InternalPortugolCoral.g:2771:1: ( ( rule__ElementoAtomico__ValorAssignment_2_1 ) )
            // InternalPortugolCoral.g:2772:2: ( rule__ElementoAtomico__ValorAssignment_2_1 )
            {
             before(grammarAccess.getElementoAtomicoAccess().getValorAssignment_2_1()); 
            // InternalPortugolCoral.g:2773:2: ( rule__ElementoAtomico__ValorAssignment_2_1 )
            // InternalPortugolCoral.g:2773:3: rule__ElementoAtomico__ValorAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__ElementoAtomico__ValorAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getElementoAtomicoAccess().getValorAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElementoAtomico__Group_2__1__Impl"


    // $ANTLR start "rule__ElementoAtomico__Group_3__0"
    // InternalPortugolCoral.g:2782:1: rule__ElementoAtomico__Group_3__0 : rule__ElementoAtomico__Group_3__0__Impl rule__ElementoAtomico__Group_3__1 ;
    public final void rule__ElementoAtomico__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolCoral.g:2786:1: ( rule__ElementoAtomico__Group_3__0__Impl rule__ElementoAtomico__Group_3__1 )
            // InternalPortugolCoral.g:2787:2: rule__ElementoAtomico__Group_3__0__Impl rule__ElementoAtomico__Group_3__1
            {
            pushFollow(FOLLOW_37);
            rule__ElementoAtomico__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ElementoAtomico__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElementoAtomico__Group_3__0"


    // $ANTLR start "rule__ElementoAtomico__Group_3__0__Impl"
    // InternalPortugolCoral.g:2794:1: rule__ElementoAtomico__Group_3__0__Impl : ( () ) ;
    public final void rule__ElementoAtomico__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolCoral.g:2798:1: ( ( () ) )
            // InternalPortugolCoral.g:2799:1: ( () )
            {
            // InternalPortugolCoral.g:2799:1: ( () )
            // InternalPortugolCoral.g:2800:2: ()
            {
             before(grammarAccess.getElementoAtomicoAccess().getReferenciaVariavelAction_3_0()); 
            // InternalPortugolCoral.g:2801:2: ()
            // InternalPortugolCoral.g:2801:3: 
            {
            }

             after(grammarAccess.getElementoAtomicoAccess().getReferenciaVariavelAction_3_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElementoAtomico__Group_3__0__Impl"


    // $ANTLR start "rule__ElementoAtomico__Group_3__1"
    // InternalPortugolCoral.g:2809:1: rule__ElementoAtomico__Group_3__1 : rule__ElementoAtomico__Group_3__1__Impl ;
    public final void rule__ElementoAtomico__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolCoral.g:2813:1: ( rule__ElementoAtomico__Group_3__1__Impl )
            // InternalPortugolCoral.g:2814:2: rule__ElementoAtomico__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ElementoAtomico__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElementoAtomico__Group_3__1"


    // $ANTLR start "rule__ElementoAtomico__Group_3__1__Impl"
    // InternalPortugolCoral.g:2820:1: rule__ElementoAtomico__Group_3__1__Impl : ( ( rule__ElementoAtomico__VariavelAssignment_3_1 ) ) ;
    public final void rule__ElementoAtomico__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolCoral.g:2824:1: ( ( ( rule__ElementoAtomico__VariavelAssignment_3_1 ) ) )
            // InternalPortugolCoral.g:2825:1: ( ( rule__ElementoAtomico__VariavelAssignment_3_1 ) )
            {
            // InternalPortugolCoral.g:2825:1: ( ( rule__ElementoAtomico__VariavelAssignment_3_1 ) )
            // InternalPortugolCoral.g:2826:2: ( rule__ElementoAtomico__VariavelAssignment_3_1 )
            {
             before(grammarAccess.getElementoAtomicoAccess().getVariavelAssignment_3_1()); 
            // InternalPortugolCoral.g:2827:2: ( rule__ElementoAtomico__VariavelAssignment_3_1 )
            // InternalPortugolCoral.g:2827:3: rule__ElementoAtomico__VariavelAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__ElementoAtomico__VariavelAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getElementoAtomicoAccess().getVariavelAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElementoAtomico__Group_3__1__Impl"


    // $ANTLR start "rule__Portugolcoral__ElementosAssignment"
    // InternalPortugolCoral.g:2836:1: rule__Portugolcoral__ElementosAssignment : ( ruleAcoes ) ;
    public final void rule__Portugolcoral__ElementosAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolCoral.g:2840:1: ( ( ruleAcoes ) )
            // InternalPortugolCoral.g:2841:2: ( ruleAcoes )
            {
            // InternalPortugolCoral.g:2841:2: ( ruleAcoes )
            // InternalPortugolCoral.g:2842:3: ruleAcoes
            {
             before(grammarAccess.getPortugolcoralAccess().getElementosAcoesParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleAcoes();

            state._fsp--;

             after(grammarAccess.getPortugolcoralAccess().getElementosAcoesParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Portugolcoral__ElementosAssignment"


    // $ANTLR start "rule__DeclararVariaveis__ElementosAssignment_3"
    // InternalPortugolCoral.g:2851:1: rule__DeclararVariaveis__ElementosAssignment_3 : ( ruleDeclararVariaveisTipo ) ;
    public final void rule__DeclararVariaveis__ElementosAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolCoral.g:2855:1: ( ( ruleDeclararVariaveisTipo ) )
            // InternalPortugolCoral.g:2856:2: ( ruleDeclararVariaveisTipo )
            {
            // InternalPortugolCoral.g:2856:2: ( ruleDeclararVariaveisTipo )
            // InternalPortugolCoral.g:2857:3: ruleDeclararVariaveisTipo
            {
             before(grammarAccess.getDeclararVariaveisAccess().getElementosDeclararVariaveisTipoParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleDeclararVariaveisTipo();

            state._fsp--;

             after(grammarAccess.getDeclararVariaveisAccess().getElementosDeclararVariaveisTipoParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclararVariaveis__ElementosAssignment_3"


    // $ANTLR start "rule__DeclararVariaveisTipo__ElementosAssignment_0"
    // InternalPortugolCoral.g:2866:1: rule__DeclararVariaveisTipo__ElementosAssignment_0 : ( RULE_ID ) ;
    public final void rule__DeclararVariaveisTipo__ElementosAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolCoral.g:2870:1: ( ( RULE_ID ) )
            // InternalPortugolCoral.g:2871:2: ( RULE_ID )
            {
            // InternalPortugolCoral.g:2871:2: ( RULE_ID )
            // InternalPortugolCoral.g:2872:3: RULE_ID
            {
             before(grammarAccess.getDeclararVariaveisTipoAccess().getElementosIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDeclararVariaveisTipoAccess().getElementosIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclararVariaveisTipo__ElementosAssignment_0"


    // $ANTLR start "rule__DeclararVariaveisTipo__ElementosAssignment_1_1"
    // InternalPortugolCoral.g:2881:1: rule__DeclararVariaveisTipo__ElementosAssignment_1_1 : ( RULE_ID ) ;
    public final void rule__DeclararVariaveisTipo__ElementosAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolCoral.g:2885:1: ( ( RULE_ID ) )
            // InternalPortugolCoral.g:2886:2: ( RULE_ID )
            {
            // InternalPortugolCoral.g:2886:2: ( RULE_ID )
            // InternalPortugolCoral.g:2887:3: RULE_ID
            {
             before(grammarAccess.getDeclararVariaveisTipoAccess().getElementosIDTerminalRuleCall_1_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDeclararVariaveisTipoAccess().getElementosIDTerminalRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclararVariaveisTipo__ElementosAssignment_1_1"


    // $ANTLR start "rule__DeclararVariaveisTipo__TipoAssignment_3"
    // InternalPortugolCoral.g:2896:1: rule__DeclararVariaveisTipo__TipoAssignment_3 : ( ruleTipoVariavel ) ;
    public final void rule__DeclararVariaveisTipo__TipoAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolCoral.g:2900:1: ( ( ruleTipoVariavel ) )
            // InternalPortugolCoral.g:2901:2: ( ruleTipoVariavel )
            {
            // InternalPortugolCoral.g:2901:2: ( ruleTipoVariavel )
            // InternalPortugolCoral.g:2902:3: ruleTipoVariavel
            {
             before(grammarAccess.getDeclararVariaveisTipoAccess().getTipoTipoVariavelParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleTipoVariavel();

            state._fsp--;

             after(grammarAccess.getDeclararVariaveisTipoAccess().getTipoTipoVariavelParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclararVariaveisTipo__TipoAssignment_3"


    // $ANTLR start "rule__Atribuir__VariavelAssignment_2"
    // InternalPortugolCoral.g:2911:1: rule__Atribuir__VariavelAssignment_2 : ( RULE_ID ) ;
    public final void rule__Atribuir__VariavelAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolCoral.g:2915:1: ( ( RULE_ID ) )
            // InternalPortugolCoral.g:2916:2: ( RULE_ID )
            {
            // InternalPortugolCoral.g:2916:2: ( RULE_ID )
            // InternalPortugolCoral.g:2917:3: RULE_ID
            {
             before(grammarAccess.getAtribuirAccess().getVariavelIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAtribuirAccess().getVariavelIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atribuir__VariavelAssignment_2"


    // $ANTLR start "rule__Atribuir__ValorAssignment_4"
    // InternalPortugolCoral.g:2926:1: rule__Atribuir__ValorAssignment_4 : ( ruleExpressao ) ;
    public final void rule__Atribuir__ValorAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolCoral.g:2930:1: ( ( ruleExpressao ) )
            // InternalPortugolCoral.g:2931:2: ( ruleExpressao )
            {
            // InternalPortugolCoral.g:2931:2: ( ruleExpressao )
            // InternalPortugolCoral.g:2932:3: ruleExpressao
            {
             before(grammarAccess.getAtribuirAccess().getValorExpressaoParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleExpressao();

            state._fsp--;

             after(grammarAccess.getAtribuirAccess().getValorExpressaoParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atribuir__ValorAssignment_4"


    // $ANTLR start "rule__Expressao__EsquerdaAssignment"
    // InternalPortugolCoral.g:2941:1: rule__Expressao__EsquerdaAssignment : ( ruleOu ) ;
    public final void rule__Expressao__EsquerdaAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolCoral.g:2945:1: ( ( ruleOu ) )
            // InternalPortugolCoral.g:2946:2: ( ruleOu )
            {
            // InternalPortugolCoral.g:2946:2: ( ruleOu )
            // InternalPortugolCoral.g:2947:3: ruleOu
            {
             before(grammarAccess.getExpressaoAccess().getEsquerdaOuParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleOu();

            state._fsp--;

             after(grammarAccess.getExpressaoAccess().getEsquerdaOuParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expressao__EsquerdaAssignment"


    // $ANTLR start "rule__Ou__DireitaAssignment_1_2"
    // InternalPortugolCoral.g:2956:1: rule__Ou__DireitaAssignment_1_2 : ( ruleE ) ;
    public final void rule__Ou__DireitaAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolCoral.g:2960:1: ( ( ruleE ) )
            // InternalPortugolCoral.g:2961:2: ( ruleE )
            {
            // InternalPortugolCoral.g:2961:2: ( ruleE )
            // InternalPortugolCoral.g:2962:3: ruleE
            {
             before(grammarAccess.getOuAccess().getDireitaEParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleE();

            state._fsp--;

             after(grammarAccess.getOuAccess().getDireitaEParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ou__DireitaAssignment_1_2"


    // $ANTLR start "rule__E__DireitaAssignment_1_2"
    // InternalPortugolCoral.g:2971:1: rule__E__DireitaAssignment_1_2 : ( ruleXou ) ;
    public final void rule__E__DireitaAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolCoral.g:2975:1: ( ( ruleXou ) )
            // InternalPortugolCoral.g:2976:2: ( ruleXou )
            {
            // InternalPortugolCoral.g:2976:2: ( ruleXou )
            // InternalPortugolCoral.g:2977:3: ruleXou
            {
             before(grammarAccess.getEAccess().getDireitaXouParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleXou();

            state._fsp--;

             after(grammarAccess.getEAccess().getDireitaXouParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__E__DireitaAssignment_1_2"


    // $ANTLR start "rule__Xou__DireitaAssignment_1_2"
    // InternalPortugolCoral.g:2986:1: rule__Xou__DireitaAssignment_1_2 : ( ruleNao ) ;
    public final void rule__Xou__DireitaAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolCoral.g:2990:1: ( ( ruleNao ) )
            // InternalPortugolCoral.g:2991:2: ( ruleNao )
            {
            // InternalPortugolCoral.g:2991:2: ( ruleNao )
            // InternalPortugolCoral.g:2992:3: ruleNao
            {
             before(grammarAccess.getXouAccess().getDireitaNaoParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleNao();

            state._fsp--;

             after(grammarAccess.getXouAccess().getDireitaNaoParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Xou__DireitaAssignment_1_2"


    // $ANTLR start "rule__Nao__NaosAssignment_0"
    // InternalPortugolCoral.g:3001:1: rule__Nao__NaosAssignment_0 : ( ( rule__Nao__NaosAlternatives_0_0 ) ) ;
    public final void rule__Nao__NaosAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolCoral.g:3005:1: ( ( ( rule__Nao__NaosAlternatives_0_0 ) ) )
            // InternalPortugolCoral.g:3006:2: ( ( rule__Nao__NaosAlternatives_0_0 ) )
            {
            // InternalPortugolCoral.g:3006:2: ( ( rule__Nao__NaosAlternatives_0_0 ) )
            // InternalPortugolCoral.g:3007:3: ( rule__Nao__NaosAlternatives_0_0 )
            {
             before(grammarAccess.getNaoAccess().getNaosAlternatives_0_0()); 
            // InternalPortugolCoral.g:3008:3: ( rule__Nao__NaosAlternatives_0_0 )
            // InternalPortugolCoral.g:3008:4: rule__Nao__NaosAlternatives_0_0
            {
            pushFollow(FOLLOW_2);
            rule__Nao__NaosAlternatives_0_0();

            state._fsp--;


            }

             after(grammarAccess.getNaoAccess().getNaosAlternatives_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Nao__NaosAssignment_0"


    // $ANTLR start "rule__Nao__DireitaAssignment_1"
    // InternalPortugolCoral.g:3016:1: rule__Nao__DireitaAssignment_1 : ( ruleComparacao ) ;
    public final void rule__Nao__DireitaAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolCoral.g:3020:1: ( ( ruleComparacao ) )
            // InternalPortugolCoral.g:3021:2: ( ruleComparacao )
            {
            // InternalPortugolCoral.g:3021:2: ( ruleComparacao )
            // InternalPortugolCoral.g:3022:3: ruleComparacao
            {
             before(grammarAccess.getNaoAccess().getDireitaComparacaoParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleComparacao();

            state._fsp--;

             after(grammarAccess.getNaoAccess().getDireitaComparacaoParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Nao__DireitaAssignment_1"


    // $ANTLR start "rule__Comparacao__ComparacaoAssignment_1_1"
    // InternalPortugolCoral.g:3031:1: rule__Comparacao__ComparacaoAssignment_1_1 : ( ( rule__Comparacao__ComparacaoAlternatives_1_1_0 ) ) ;
    public final void rule__Comparacao__ComparacaoAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolCoral.g:3035:1: ( ( ( rule__Comparacao__ComparacaoAlternatives_1_1_0 ) ) )
            // InternalPortugolCoral.g:3036:2: ( ( rule__Comparacao__ComparacaoAlternatives_1_1_0 ) )
            {
            // InternalPortugolCoral.g:3036:2: ( ( rule__Comparacao__ComparacaoAlternatives_1_1_0 ) )
            // InternalPortugolCoral.g:3037:3: ( rule__Comparacao__ComparacaoAlternatives_1_1_0 )
            {
             before(grammarAccess.getComparacaoAccess().getComparacaoAlternatives_1_1_0()); 
            // InternalPortugolCoral.g:3038:3: ( rule__Comparacao__ComparacaoAlternatives_1_1_0 )
            // InternalPortugolCoral.g:3038:4: rule__Comparacao__ComparacaoAlternatives_1_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Comparacao__ComparacaoAlternatives_1_1_0();

            state._fsp--;


            }

             after(grammarAccess.getComparacaoAccess().getComparacaoAlternatives_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparacao__ComparacaoAssignment_1_1"


    // $ANTLR start "rule__Comparacao__DireitaAssignment_1_2"
    // InternalPortugolCoral.g:3046:1: rule__Comparacao__DireitaAssignment_1_2 : ( ruleAdicaoOuSubtracao ) ;
    public final void rule__Comparacao__DireitaAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolCoral.g:3050:1: ( ( ruleAdicaoOuSubtracao ) )
            // InternalPortugolCoral.g:3051:2: ( ruleAdicaoOuSubtracao )
            {
            // InternalPortugolCoral.g:3051:2: ( ruleAdicaoOuSubtracao )
            // InternalPortugolCoral.g:3052:3: ruleAdicaoOuSubtracao
            {
             before(grammarAccess.getComparacaoAccess().getDireitaAdicaoOuSubtracaoParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAdicaoOuSubtracao();

            state._fsp--;

             after(grammarAccess.getComparacaoAccess().getDireitaAdicaoOuSubtracaoParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparacao__DireitaAssignment_1_2"


    // $ANTLR start "rule__AdicaoOuSubtracao__OperacaoAssignment_1_1"
    // InternalPortugolCoral.g:3061:1: rule__AdicaoOuSubtracao__OperacaoAssignment_1_1 : ( ( rule__AdicaoOuSubtracao__OperacaoAlternatives_1_1_0 ) ) ;
    public final void rule__AdicaoOuSubtracao__OperacaoAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolCoral.g:3065:1: ( ( ( rule__AdicaoOuSubtracao__OperacaoAlternatives_1_1_0 ) ) )
            // InternalPortugolCoral.g:3066:2: ( ( rule__AdicaoOuSubtracao__OperacaoAlternatives_1_1_0 ) )
            {
            // InternalPortugolCoral.g:3066:2: ( ( rule__AdicaoOuSubtracao__OperacaoAlternatives_1_1_0 ) )
            // InternalPortugolCoral.g:3067:3: ( rule__AdicaoOuSubtracao__OperacaoAlternatives_1_1_0 )
            {
             before(grammarAccess.getAdicaoOuSubtracaoAccess().getOperacaoAlternatives_1_1_0()); 
            // InternalPortugolCoral.g:3068:3: ( rule__AdicaoOuSubtracao__OperacaoAlternatives_1_1_0 )
            // InternalPortugolCoral.g:3068:4: rule__AdicaoOuSubtracao__OperacaoAlternatives_1_1_0
            {
            pushFollow(FOLLOW_2);
            rule__AdicaoOuSubtracao__OperacaoAlternatives_1_1_0();

            state._fsp--;


            }

             after(grammarAccess.getAdicaoOuSubtracaoAccess().getOperacaoAlternatives_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdicaoOuSubtracao__OperacaoAssignment_1_1"


    // $ANTLR start "rule__AdicaoOuSubtracao__DireitaAssignment_1_2"
    // InternalPortugolCoral.g:3076:1: rule__AdicaoOuSubtracao__DireitaAssignment_1_2 : ( ruleMultiplicacaoOuDivisao ) ;
    public final void rule__AdicaoOuSubtracao__DireitaAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolCoral.g:3080:1: ( ( ruleMultiplicacaoOuDivisao ) )
            // InternalPortugolCoral.g:3081:2: ( ruleMultiplicacaoOuDivisao )
            {
            // InternalPortugolCoral.g:3081:2: ( ruleMultiplicacaoOuDivisao )
            // InternalPortugolCoral.g:3082:3: ruleMultiplicacaoOuDivisao
            {
             before(grammarAccess.getAdicaoOuSubtracaoAccess().getDireitaMultiplicacaoOuDivisaoParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleMultiplicacaoOuDivisao();

            state._fsp--;

             after(grammarAccess.getAdicaoOuSubtracaoAccess().getDireitaMultiplicacaoOuDivisaoParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdicaoOuSubtracao__DireitaAssignment_1_2"


    // $ANTLR start "rule__MultiplicacaoOuDivisao__OperacaoAssignment_1_1"
    // InternalPortugolCoral.g:3091:1: rule__MultiplicacaoOuDivisao__OperacaoAssignment_1_1 : ( ( rule__MultiplicacaoOuDivisao__OperacaoAlternatives_1_1_0 ) ) ;
    public final void rule__MultiplicacaoOuDivisao__OperacaoAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolCoral.g:3095:1: ( ( ( rule__MultiplicacaoOuDivisao__OperacaoAlternatives_1_1_0 ) ) )
            // InternalPortugolCoral.g:3096:2: ( ( rule__MultiplicacaoOuDivisao__OperacaoAlternatives_1_1_0 ) )
            {
            // InternalPortugolCoral.g:3096:2: ( ( rule__MultiplicacaoOuDivisao__OperacaoAlternatives_1_1_0 ) )
            // InternalPortugolCoral.g:3097:3: ( rule__MultiplicacaoOuDivisao__OperacaoAlternatives_1_1_0 )
            {
             before(grammarAccess.getMultiplicacaoOuDivisaoAccess().getOperacaoAlternatives_1_1_0()); 
            // InternalPortugolCoral.g:3098:3: ( rule__MultiplicacaoOuDivisao__OperacaoAlternatives_1_1_0 )
            // InternalPortugolCoral.g:3098:4: rule__MultiplicacaoOuDivisao__OperacaoAlternatives_1_1_0
            {
            pushFollow(FOLLOW_2);
            rule__MultiplicacaoOuDivisao__OperacaoAlternatives_1_1_0();

            state._fsp--;


            }

             after(grammarAccess.getMultiplicacaoOuDivisaoAccess().getOperacaoAlternatives_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicacaoOuDivisao__OperacaoAssignment_1_1"


    // $ANTLR start "rule__MultiplicacaoOuDivisao__DireitaAssignment_1_2"
    // InternalPortugolCoral.g:3106:1: rule__MultiplicacaoOuDivisao__DireitaAssignment_1_2 : ( ruleSinal ) ;
    public final void rule__MultiplicacaoOuDivisao__DireitaAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolCoral.g:3110:1: ( ( ruleSinal ) )
            // InternalPortugolCoral.g:3111:2: ( ruleSinal )
            {
            // InternalPortugolCoral.g:3111:2: ( ruleSinal )
            // InternalPortugolCoral.g:3112:3: ruleSinal
            {
             before(grammarAccess.getMultiplicacaoOuDivisaoAccess().getDireitaSinalParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleSinal();

            state._fsp--;

             after(grammarAccess.getMultiplicacaoOuDivisaoAccess().getDireitaSinalParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicacaoOuDivisao__DireitaAssignment_1_2"


    // $ANTLR start "rule__Sinal__SinaisAssignment_0"
    // InternalPortugolCoral.g:3121:1: rule__Sinal__SinaisAssignment_0 : ( ( rule__Sinal__SinaisAlternatives_0_0 ) ) ;
    public final void rule__Sinal__SinaisAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolCoral.g:3125:1: ( ( ( rule__Sinal__SinaisAlternatives_0_0 ) ) )
            // InternalPortugolCoral.g:3126:2: ( ( rule__Sinal__SinaisAlternatives_0_0 ) )
            {
            // InternalPortugolCoral.g:3126:2: ( ( rule__Sinal__SinaisAlternatives_0_0 ) )
            // InternalPortugolCoral.g:3127:3: ( rule__Sinal__SinaisAlternatives_0_0 )
            {
             before(grammarAccess.getSinalAccess().getSinaisAlternatives_0_0()); 
            // InternalPortugolCoral.g:3128:3: ( rule__Sinal__SinaisAlternatives_0_0 )
            // InternalPortugolCoral.g:3128:4: rule__Sinal__SinaisAlternatives_0_0
            {
            pushFollow(FOLLOW_2);
            rule__Sinal__SinaisAlternatives_0_0();

            state._fsp--;


            }

             after(grammarAccess.getSinalAccess().getSinaisAlternatives_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sinal__SinaisAssignment_0"


    // $ANTLR start "rule__Sinal__DireitaAssignment_1"
    // InternalPortugolCoral.g:3136:1: rule__Sinal__DireitaAssignment_1 : ( ruleExponenciacao ) ;
    public final void rule__Sinal__DireitaAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolCoral.g:3140:1: ( ( ruleExponenciacao ) )
            // InternalPortugolCoral.g:3141:2: ( ruleExponenciacao )
            {
            // InternalPortugolCoral.g:3141:2: ( ruleExponenciacao )
            // InternalPortugolCoral.g:3142:3: ruleExponenciacao
            {
             before(grammarAccess.getSinalAccess().getDireitaExponenciacaoParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExponenciacao();

            state._fsp--;

             after(grammarAccess.getSinalAccess().getDireitaExponenciacaoParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sinal__DireitaAssignment_1"


    // $ANTLR start "rule__Exponenciacao__DireitaAssignment_1_2"
    // InternalPortugolCoral.g:3151:1: rule__Exponenciacao__DireitaAssignment_1_2 : ( ruleElemento ) ;
    public final void rule__Exponenciacao__DireitaAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolCoral.g:3155:1: ( ( ruleElemento ) )
            // InternalPortugolCoral.g:3156:2: ( ruleElemento )
            {
            // InternalPortugolCoral.g:3156:2: ( ruleElemento )
            // InternalPortugolCoral.g:3157:3: ruleElemento
            {
             before(grammarAccess.getExponenciacaoAccess().getDireitaElementoParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleElemento();

            state._fsp--;

             after(grammarAccess.getExponenciacaoAccess().getDireitaElementoParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exponenciacao__DireitaAssignment_1_2"


    // $ANTLR start "rule__ElementoParenteses__DireitaAssignment"
    // InternalPortugolCoral.g:3166:1: rule__ElementoParenteses__DireitaAssignment : ( ruleParenteses ) ;
    public final void rule__ElementoParenteses__DireitaAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolCoral.g:3170:1: ( ( ruleParenteses ) )
            // InternalPortugolCoral.g:3171:2: ( ruleParenteses )
            {
            // InternalPortugolCoral.g:3171:2: ( ruleParenteses )
            // InternalPortugolCoral.g:3172:3: ruleParenteses
            {
             before(grammarAccess.getElementoParentesesAccess().getDireitaParentesesParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleParenteses();

            state._fsp--;

             after(grammarAccess.getElementoParentesesAccess().getDireitaParentesesParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElementoParenteses__DireitaAssignment"


    // $ANTLR start "rule__Parenteses__DireitaAssignment_1"
    // InternalPortugolCoral.g:3181:1: rule__Parenteses__DireitaAssignment_1 : ( ruleExpressao ) ;
    public final void rule__Parenteses__DireitaAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolCoral.g:3185:1: ( ( ruleExpressao ) )
            // InternalPortugolCoral.g:3186:2: ( ruleExpressao )
            {
            // InternalPortugolCoral.g:3186:2: ( ruleExpressao )
            // InternalPortugolCoral.g:3187:3: ruleExpressao
            {
             before(grammarAccess.getParentesesAccess().getDireitaExpressaoParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExpressao();

            state._fsp--;

             after(grammarAccess.getParentesesAccess().getDireitaExpressaoParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parenteses__DireitaAssignment_1"


    // $ANTLR start "rule__Matriz__VariavelAssignment_0"
    // InternalPortugolCoral.g:3196:1: rule__Matriz__VariavelAssignment_0 : ( RULE_ID ) ;
    public final void rule__Matriz__VariavelAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolCoral.g:3200:1: ( ( RULE_ID ) )
            // InternalPortugolCoral.g:3201:2: ( RULE_ID )
            {
            // InternalPortugolCoral.g:3201:2: ( RULE_ID )
            // InternalPortugolCoral.g:3202:3: RULE_ID
            {
             before(grammarAccess.getMatrizAccess().getVariavelIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMatrizAccess().getVariavelIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Matriz__VariavelAssignment_0"


    // $ANTLR start "rule__Matriz__DireitaAssignment_1"
    // InternalPortugolCoral.g:3211:1: rule__Matriz__DireitaAssignment_1 : ( rulePosicaoMatriz ) ;
    public final void rule__Matriz__DireitaAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolCoral.g:3215:1: ( ( rulePosicaoMatriz ) )
            // InternalPortugolCoral.g:3216:2: ( rulePosicaoMatriz )
            {
            // InternalPortugolCoral.g:3216:2: ( rulePosicaoMatriz )
            // InternalPortugolCoral.g:3217:3: rulePosicaoMatriz
            {
             before(grammarAccess.getMatrizAccess().getDireitaPosicaoMatrizParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            rulePosicaoMatriz();

            state._fsp--;

             after(grammarAccess.getMatrizAccess().getDireitaPosicaoMatrizParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Matriz__DireitaAssignment_1"


    // $ANTLR start "rule__PosicaoMatriz__DireitaAssignment_1"
    // InternalPortugolCoral.g:3226:1: rule__PosicaoMatriz__DireitaAssignment_1 : ( ruleExpressao ) ;
    public final void rule__PosicaoMatriz__DireitaAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolCoral.g:3230:1: ( ( ruleExpressao ) )
            // InternalPortugolCoral.g:3231:2: ( ruleExpressao )
            {
            // InternalPortugolCoral.g:3231:2: ( ruleExpressao )
            // InternalPortugolCoral.g:3232:3: ruleExpressao
            {
             before(grammarAccess.getPosicaoMatrizAccess().getDireitaExpressaoParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExpressao();

            state._fsp--;

             after(grammarAccess.getPosicaoMatrizAccess().getDireitaExpressaoParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PosicaoMatriz__DireitaAssignment_1"


    // $ANTLR start "rule__ElementoAtomico__ValorAssignment_0_1"
    // InternalPortugolCoral.g:3241:1: rule__ElementoAtomico__ValorAssignment_0_1 : ( RULE_INT ) ;
    public final void rule__ElementoAtomico__ValorAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolCoral.g:3245:1: ( ( RULE_INT ) )
            // InternalPortugolCoral.g:3246:2: ( RULE_INT )
            {
            // InternalPortugolCoral.g:3246:2: ( RULE_INT )
            // InternalPortugolCoral.g:3247:3: RULE_INT
            {
             before(grammarAccess.getElementoAtomicoAccess().getValorINTTerminalRuleCall_0_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getElementoAtomicoAccess().getValorINTTerminalRuleCall_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElementoAtomico__ValorAssignment_0_1"


    // $ANTLR start "rule__ElementoAtomico__ValorAssignment_1_1"
    // InternalPortugolCoral.g:3256:1: rule__ElementoAtomico__ValorAssignment_1_1 : ( RULE_REAL ) ;
    public final void rule__ElementoAtomico__ValorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolCoral.g:3260:1: ( ( RULE_REAL ) )
            // InternalPortugolCoral.g:3261:2: ( RULE_REAL )
            {
            // InternalPortugolCoral.g:3261:2: ( RULE_REAL )
            // InternalPortugolCoral.g:3262:3: RULE_REAL
            {
             before(grammarAccess.getElementoAtomicoAccess().getValorREALTerminalRuleCall_1_1_0()); 
            match(input,RULE_REAL,FOLLOW_2); 
             after(grammarAccess.getElementoAtomicoAccess().getValorREALTerminalRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElementoAtomico__ValorAssignment_1_1"


    // $ANTLR start "rule__ElementoAtomico__ValorAssignment_2_1"
    // InternalPortugolCoral.g:3271:1: rule__ElementoAtomico__ValorAssignment_2_1 : ( RULE_TEXTO ) ;
    public final void rule__ElementoAtomico__ValorAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolCoral.g:3275:1: ( ( RULE_TEXTO ) )
            // InternalPortugolCoral.g:3276:2: ( RULE_TEXTO )
            {
            // InternalPortugolCoral.g:3276:2: ( RULE_TEXTO )
            // InternalPortugolCoral.g:3277:3: RULE_TEXTO
            {
             before(grammarAccess.getElementoAtomicoAccess().getValorTEXTOTerminalRuleCall_2_1_0()); 
            match(input,RULE_TEXTO,FOLLOW_2); 
             after(grammarAccess.getElementoAtomicoAccess().getValorTEXTOTerminalRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElementoAtomico__ValorAssignment_2_1"


    // $ANTLR start "rule__ElementoAtomico__VariavelAssignment_3_1"
    // InternalPortugolCoral.g:3286:1: rule__ElementoAtomico__VariavelAssignment_3_1 : ( RULE_ID ) ;
    public final void rule__ElementoAtomico__VariavelAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolCoral.g:3290:1: ( ( RULE_ID ) )
            // InternalPortugolCoral.g:3291:2: ( RULE_ID )
            {
            // InternalPortugolCoral.g:3291:2: ( RULE_ID )
            // InternalPortugolCoral.g:3292:3: RULE_ID
            {
             before(grammarAccess.getElementoAtomicoAccess().getVariavelIDTerminalRuleCall_3_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getElementoAtomicoAccess().getVariavelIDTerminalRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElementoAtomico__VariavelAssignment_3_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000001000306012L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000001000006000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000018000000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00000000000F8000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000001000306010L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x00004000C0C000F0L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000C00002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x000000003F000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x000000003F000002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x00000000C0000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x00000000C0000002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000F00000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000F00000002L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x00000000000000F0L});

}