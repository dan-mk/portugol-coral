package org.xtext.coral.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPortugolCoralLexer extends Lexer {
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

    public InternalPortugolCoralLexer() {;} 
    public InternalPortugolCoralLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalPortugolCoralLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalPortugolCoral.g"; }

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPortugolCoral.g:11:7: ( 'variaveis' )
            // InternalPortugolCoral.g:11:9: 'variaveis'
            {
            match("variaveis"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPortugolCoral.g:12:7: ( 'vari\\u00E1veis' )
            // InternalPortugolCoral.g:12:9: 'vari\\u00E1veis'
            {
            match("vari\u00E1veis"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPortugolCoral.g:13:7: ( 'int' )
            // InternalPortugolCoral.g:13:9: 'int'
            {
            match("int"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPortugolCoral.g:14:7: ( 'real' )
            // InternalPortugolCoral.g:14:9: 'real'
            {
            match("real"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPortugolCoral.g:15:7: ( 'texto' )
            // InternalPortugolCoral.g:15:9: 'texto'
            {
            match("texto"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPortugolCoral.g:16:7: ( 'logico' )
            // InternalPortugolCoral.g:16:9: 'logico'
            {
            match("logico"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPortugolCoral.g:17:7: ( 'l\\u00F3gico' )
            // InternalPortugolCoral.g:17:9: 'l\\u00F3gico'
            {
            match("l\u00F3gico"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPortugolCoral.g:18:7: ( 'faca' )
            // InternalPortugolCoral.g:18:9: 'faca'
            {
            match("faca"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPortugolCoral.g:19:7: ( 'fa\\u00E7a' )
            // InternalPortugolCoral.g:19:9: 'fa\\u00E7a'
            {
            match("fa\u00E7a"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPortugolCoral.g:20:7: ( 'nao' )
            // InternalPortugolCoral.g:20:9: 'nao'
            {
            match("nao"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPortugolCoral.g:21:7: ( 'n\\u00E3o' )
            // InternalPortugolCoral.g:21:9: 'n\\u00E3o'
            {
            match("n\u00E3o"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPortugolCoral.g:22:7: ( '<=' )
            // InternalPortugolCoral.g:22:9: '<='
            {
            match("<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPortugolCoral.g:23:7: ( '==' )
            // InternalPortugolCoral.g:23:9: '=='
            {
            match("=="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPortugolCoral.g:24:7: ( '>=' )
            // InternalPortugolCoral.g:24:9: '>='
            {
            match(">="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPortugolCoral.g:25:7: ( '<' )
            // InternalPortugolCoral.g:25:9: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPortugolCoral.g:26:7: ( '>' )
            // InternalPortugolCoral.g:26:9: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPortugolCoral.g:27:7: ( '!=' )
            // InternalPortugolCoral.g:27:9: '!='
            {
            match("!="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPortugolCoral.g:28:7: ( '+' )
            // InternalPortugolCoral.g:28:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPortugolCoral.g:29:7: ( '-' )
            // InternalPortugolCoral.g:29:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPortugolCoral.g:30:7: ( '*' )
            // InternalPortugolCoral.g:30:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPortugolCoral.g:31:7: ( '/' )
            // InternalPortugolCoral.g:31:9: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPortugolCoral.g:32:7: ( '//' )
            // InternalPortugolCoral.g:32:9: '//'
            {
            match("//"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPortugolCoral.g:33:7: ( '%' )
            // InternalPortugolCoral.g:33:9: '%'
            {
            match('%'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPortugolCoral.g:34:7: ( 'crie' )
            // InternalPortugolCoral.g:34:9: 'crie'
            {
            match("crie"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPortugolCoral.g:35:7: ( '{' )
            // InternalPortugolCoral.g:35:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPortugolCoral.g:36:7: ( '}' )
            // InternalPortugolCoral.g:36:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPortugolCoral.g:37:7: ( ':' )
            // InternalPortugolCoral.g:37:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPortugolCoral.g:38:7: ( ',' )
            // InternalPortugolCoral.g:38:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPortugolCoral.g:39:7: ( '=' )
            // InternalPortugolCoral.g:39:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPortugolCoral.g:40:7: ( 'ou' )
            // InternalPortugolCoral.g:40:9: 'ou'
            {
            match("ou"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPortugolCoral.g:41:7: ( 'e' )
            // InternalPortugolCoral.g:41:9: 'e'
            {
            match('e'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPortugolCoral.g:42:7: ( 'xou' )
            // InternalPortugolCoral.g:42:9: 'xou'
            {
            match("xou"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPortugolCoral.g:43:7: ( '^' )
            // InternalPortugolCoral.g:43:9: '^'
            {
            match('^'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPortugolCoral.g:44:7: ( '(' )
            // InternalPortugolCoral.g:44:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPortugolCoral.g:45:7: ( ')' )
            // InternalPortugolCoral.g:45:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPortugolCoral.g:46:7: ( '[' )
            // InternalPortugolCoral.g:46:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPortugolCoral.g:47:7: ( ']' )
            // InternalPortugolCoral.g:47:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "RULE_REAL"
    public final void mRULE_REAL() throws RecognitionException {
        try {
            int _type = RULE_REAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPortugolCoral.g:3301:11: ( ( RULE_INT '.' ( RULE_INT )? | '.' RULE_INT ) )
            // InternalPortugolCoral.g:3301:13: ( RULE_INT '.' ( RULE_INT )? | '.' RULE_INT )
            {
            // InternalPortugolCoral.g:3301:13: ( RULE_INT '.' ( RULE_INT )? | '.' RULE_INT )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>='0' && LA2_0<='9')) ) {
                alt2=1;
            }
            else if ( (LA2_0=='.') ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalPortugolCoral.g:3301:14: RULE_INT '.' ( RULE_INT )?
                    {
                    mRULE_INT(); 
                    match('.'); 
                    // InternalPortugolCoral.g:3301:27: ( RULE_INT )?
                    int alt1=2;
                    int LA1_0 = input.LA(1);

                    if ( ((LA1_0>='0' && LA1_0<='9')) ) {
                        alt1=1;
                    }
                    switch (alt1) {
                        case 1 :
                            // InternalPortugolCoral.g:3301:27: RULE_INT
                            {
                            mRULE_INT(); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // InternalPortugolCoral.g:3301:37: '.' RULE_INT
                    {
                    match('.'); 
                    mRULE_INT(); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_REAL"

    // $ANTLR start "RULE_TEXTO"
    public final void mRULE_TEXTO() throws RecognitionException {
        try {
            int _type = RULE_TEXTO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPortugolCoral.g:3303:12: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' )
            // InternalPortugolCoral.g:3303:14: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
            {
            match('\"'); 
            // InternalPortugolCoral.g:3303:18: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
            loop3:
            do {
                int alt3=3;
                int LA3_0 = input.LA(1);

                if ( (LA3_0=='\\') ) {
                    alt3=1;
                }
                else if ( ((LA3_0>='\u0000' && LA3_0<='!')||(LA3_0>='#' && LA3_0<='[')||(LA3_0>=']' && LA3_0<='\uFFFF')) ) {
                    alt3=2;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalPortugolCoral.g:3303:19: '\\\\' .
            	    {
            	    match('\\'); 
            	    matchAny(); 

            	    }
            	    break;
            	case 2 :
            	    // InternalPortugolCoral.g:3303:26: ~ ( ( '\\\\' | '\"' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_TEXTO"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPortugolCoral.g:3305:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalPortugolCoral.g:3305:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalPortugolCoral.g:3305:11: ( '^' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='^') ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalPortugolCoral.g:3305:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalPortugolCoral.g:3305:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='0' && LA5_0<='9')||(LA5_0>='A' && LA5_0<='Z')||LA5_0=='_'||(LA5_0>='a' && LA5_0<='z')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalPortugolCoral.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPortugolCoral.g:3307:10: ( ( '0' .. '9' )+ )
            // InternalPortugolCoral.g:3307:12: ( '0' .. '9' )+
            {
            // InternalPortugolCoral.g:3307:12: ( '0' .. '9' )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='0' && LA6_0<='9')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalPortugolCoral.g:3307:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPortugolCoral.g:3309:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalPortugolCoral.g:3309:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalPortugolCoral.g:3309:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='\"') ) {
                alt9=1;
            }
            else if ( (LA9_0=='\'') ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalPortugolCoral.g:3309:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalPortugolCoral.g:3309:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop7:
                    do {
                        int alt7=3;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0=='\\') ) {
                            alt7=1;
                        }
                        else if ( ((LA7_0>='\u0000' && LA7_0<='!')||(LA7_0>='#' && LA7_0<='[')||(LA7_0>=']' && LA7_0<='\uFFFF')) ) {
                            alt7=2;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalPortugolCoral.g:3309:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalPortugolCoral.g:3309:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalPortugolCoral.g:3309:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalPortugolCoral.g:3309:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop8:
                    do {
                        int alt8=3;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0=='\\') ) {
                            alt8=1;
                        }
                        else if ( ((LA8_0>='\u0000' && LA8_0<='&')||(LA8_0>='(' && LA8_0<='[')||(LA8_0>=']' && LA8_0<='\uFFFF')) ) {
                            alt8=2;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalPortugolCoral.g:3309:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalPortugolCoral.g:3309:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPortugolCoral.g:3311:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalPortugolCoral.g:3311:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalPortugolCoral.g:3311:24: ( options {greedy=false; } : . )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0=='*') ) {
                    int LA10_1 = input.LA(2);

                    if ( (LA10_1=='/') ) {
                        alt10=2;
                    }
                    else if ( ((LA10_1>='\u0000' && LA10_1<='.')||(LA10_1>='0' && LA10_1<='\uFFFF')) ) {
                        alt10=1;
                    }


                }
                else if ( ((LA10_0>='\u0000' && LA10_0<=')')||(LA10_0>='+' && LA10_0<='\uFFFF')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalPortugolCoral.g:3311:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPortugolCoral.g:3313:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalPortugolCoral.g:3313:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalPortugolCoral.g:3313:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\u0000' && LA11_0<='\t')||(LA11_0>='\u000B' && LA11_0<='\f')||(LA11_0>='\u000E' && LA11_0<='\uFFFF')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalPortugolCoral.g:3313:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            // InternalPortugolCoral.g:3313:40: ( ( '\\r' )? '\\n' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0=='\n'||LA13_0=='\r') ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalPortugolCoral.g:3313:41: ( '\\r' )? '\\n'
                    {
                    // InternalPortugolCoral.g:3313:41: ( '\\r' )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0=='\r') ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // InternalPortugolCoral.g:3313:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPortugolCoral.g:3315:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalPortugolCoral.g:3315:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalPortugolCoral.g:3315:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt14=0;
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>='\t' && LA14_0<='\n')||LA14_0=='\r'||LA14_0==' ') ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalPortugolCoral.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt14 >= 1 ) break loop14;
                        EarlyExitException eee =
                            new EarlyExitException(14, input);
                        throw eee;
                }
                cnt14++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPortugolCoral.g:3317:16: ( . )
            // InternalPortugolCoral.g:3317:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalPortugolCoral.g:1:8: ( T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | RULE_REAL | RULE_TEXTO | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt15=46;
        alt15 = dfa15.predict(input);
        switch (alt15) {
            case 1 :
                // InternalPortugolCoral.g:1:10: T__13
                {
                mT__13(); 

                }
                break;
            case 2 :
                // InternalPortugolCoral.g:1:16: T__14
                {
                mT__14(); 

                }
                break;
            case 3 :
                // InternalPortugolCoral.g:1:22: T__15
                {
                mT__15(); 

                }
                break;
            case 4 :
                // InternalPortugolCoral.g:1:28: T__16
                {
                mT__16(); 

                }
                break;
            case 5 :
                // InternalPortugolCoral.g:1:34: T__17
                {
                mT__17(); 

                }
                break;
            case 6 :
                // InternalPortugolCoral.g:1:40: T__18
                {
                mT__18(); 

                }
                break;
            case 7 :
                // InternalPortugolCoral.g:1:46: T__19
                {
                mT__19(); 

                }
                break;
            case 8 :
                // InternalPortugolCoral.g:1:52: T__20
                {
                mT__20(); 

                }
                break;
            case 9 :
                // InternalPortugolCoral.g:1:58: T__21
                {
                mT__21(); 

                }
                break;
            case 10 :
                // InternalPortugolCoral.g:1:64: T__22
                {
                mT__22(); 

                }
                break;
            case 11 :
                // InternalPortugolCoral.g:1:70: T__23
                {
                mT__23(); 

                }
                break;
            case 12 :
                // InternalPortugolCoral.g:1:76: T__24
                {
                mT__24(); 

                }
                break;
            case 13 :
                // InternalPortugolCoral.g:1:82: T__25
                {
                mT__25(); 

                }
                break;
            case 14 :
                // InternalPortugolCoral.g:1:88: T__26
                {
                mT__26(); 

                }
                break;
            case 15 :
                // InternalPortugolCoral.g:1:94: T__27
                {
                mT__27(); 

                }
                break;
            case 16 :
                // InternalPortugolCoral.g:1:100: T__28
                {
                mT__28(); 

                }
                break;
            case 17 :
                // InternalPortugolCoral.g:1:106: T__29
                {
                mT__29(); 

                }
                break;
            case 18 :
                // InternalPortugolCoral.g:1:112: T__30
                {
                mT__30(); 

                }
                break;
            case 19 :
                // InternalPortugolCoral.g:1:118: T__31
                {
                mT__31(); 

                }
                break;
            case 20 :
                // InternalPortugolCoral.g:1:124: T__32
                {
                mT__32(); 

                }
                break;
            case 21 :
                // InternalPortugolCoral.g:1:130: T__33
                {
                mT__33(); 

                }
                break;
            case 22 :
                // InternalPortugolCoral.g:1:136: T__34
                {
                mT__34(); 

                }
                break;
            case 23 :
                // InternalPortugolCoral.g:1:142: T__35
                {
                mT__35(); 

                }
                break;
            case 24 :
                // InternalPortugolCoral.g:1:148: T__36
                {
                mT__36(); 

                }
                break;
            case 25 :
                // InternalPortugolCoral.g:1:154: T__37
                {
                mT__37(); 

                }
                break;
            case 26 :
                // InternalPortugolCoral.g:1:160: T__38
                {
                mT__38(); 

                }
                break;
            case 27 :
                // InternalPortugolCoral.g:1:166: T__39
                {
                mT__39(); 

                }
                break;
            case 28 :
                // InternalPortugolCoral.g:1:172: T__40
                {
                mT__40(); 

                }
                break;
            case 29 :
                // InternalPortugolCoral.g:1:178: T__41
                {
                mT__41(); 

                }
                break;
            case 30 :
                // InternalPortugolCoral.g:1:184: T__42
                {
                mT__42(); 

                }
                break;
            case 31 :
                // InternalPortugolCoral.g:1:190: T__43
                {
                mT__43(); 

                }
                break;
            case 32 :
                // InternalPortugolCoral.g:1:196: T__44
                {
                mT__44(); 

                }
                break;
            case 33 :
                // InternalPortugolCoral.g:1:202: T__45
                {
                mT__45(); 

                }
                break;
            case 34 :
                // InternalPortugolCoral.g:1:208: T__46
                {
                mT__46(); 

                }
                break;
            case 35 :
                // InternalPortugolCoral.g:1:214: T__47
                {
                mT__47(); 

                }
                break;
            case 36 :
                // InternalPortugolCoral.g:1:220: T__48
                {
                mT__48(); 

                }
                break;
            case 37 :
                // InternalPortugolCoral.g:1:226: T__49
                {
                mT__49(); 

                }
                break;
            case 38 :
                // InternalPortugolCoral.g:1:232: RULE_REAL
                {
                mRULE_REAL(); 

                }
                break;
            case 39 :
                // InternalPortugolCoral.g:1:242: RULE_TEXTO
                {
                mRULE_TEXTO(); 

                }
                break;
            case 40 :
                // InternalPortugolCoral.g:1:253: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 41 :
                // InternalPortugolCoral.g:1:261: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 42 :
                // InternalPortugolCoral.g:1:270: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 43 :
                // InternalPortugolCoral.g:1:282: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 44 :
                // InternalPortugolCoral.g:1:298: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 45 :
                // InternalPortugolCoral.g:1:314: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 46 :
                // InternalPortugolCoral.g:1:322: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA15 dfa15 = new DFA15(this);
    static final String DFA15_eotS =
        "\1\uffff\7\46\1\60\1\62\1\64\1\44\3\uffff\1\73\1\uffff\1\46\4\uffff\1\46\1\103\1\46\1\105\4\uffff\1\112\2\44\1\uffff\1\44\2\uffff\1\46\1\uffff\4\46\1\uffff\2\46\13\uffff\1\133\3\uffff\1\46\4\uffff\1\135\1\uffff\1\46\7\uffff\1\112\5\uffff\1\46\1\142\4\46\1\uffff\1\147\2\uffff\1\46\1\uffff\1\151\2\uffff\1\46\1\uffff\1\154\2\46\1\157\1\uffff\1\160\1\uffff\1\46\2\uffff\1\162\1\46\2\uffff\1\46\1\uffff\1\165\1\46\1\uffff\1\46\1\170\1\uffff";
    static final String DFA15_eofS =
        "\171\uffff";
    static final String DFA15_minS =
        "\1\0\1\141\1\156\2\145\1\157\2\141\4\75\3\uffff\1\52\1\uffff\1\162\4\uffff\1\165\1\60\1\157\1\101\4\uffff\1\56\1\60\1\0\1\uffff\1\0\2\uffff\1\162\1\uffff\1\164\1\141\1\170\1\147\1\uffff\1\143\1\157\13\uffff\1\0\3\uffff\1\151\4\uffff\1\60\1\uffff\1\165\7\uffff\1\56\2\0\3\uffff\1\151\1\60\1\154\1\164\1\151\1\141\1\uffff\1\60\2\uffff\1\145\1\uffff\1\60\1\0\1\uffff\1\141\1\uffff\1\60\1\157\1\143\1\60\1\uffff\1\60\1\uffff\1\166\2\uffff\1\60\1\157\2\uffff\1\145\1\uffff\1\60\1\151\1\uffff\1\163\1\60\1\uffff";
    static final String DFA15_maxS =
        "\1\uffff\1\141\1\156\2\145\1\u00f3\1\141\1\u00e3\4\75\3\uffff\1\57\1\uffff\1\162\4\uffff\1\165\1\172\1\157\1\172\4\uffff\2\71\1\uffff\1\uffff\1\uffff\2\uffff\1\162\1\uffff\1\164\1\141\1\170\1\147\1\uffff\1\u00e7\1\157\13\uffff\1\uffff\3\uffff\1\151\4\uffff\1\172\1\uffff\1\165\7\uffff\1\71\2\uffff\3\uffff\1\151\1\172\1\154\1\164\1\151\1\141\1\uffff\1\172\2\uffff\1\145\1\uffff\1\172\1\uffff\1\uffff\1\u00e1\1\uffff\1\172\1\157\1\143\1\172\1\uffff\1\172\1\uffff\1\166\2\uffff\1\172\1\157\2\uffff\1\145\1\uffff\1\172\1\151\1\uffff\1\163\1\172\1\uffff";
    static final String DFA15_acceptS =
        "\14\uffff\1\22\1\23\1\24\1\uffff\1\27\1\uffff\1\31\1\32\1\33\1\34\4\uffff\1\42\1\43\1\44\1\45\3\uffff\1\50\1\uffff\1\55\1\56\1\uffff\1\50\4\uffff\1\7\2\uffff\1\13\1\14\1\17\1\15\1\35\1\16\1\20\1\21\1\22\1\23\1\24\1\uffff\1\53\1\25\1\27\1\uffff\1\31\1\32\1\33\1\34\1\uffff\1\37\1\uffff\1\41\1\42\1\43\1\44\1\45\1\51\1\46\3\uffff\1\47\1\52\1\55\6\uffff\1\11\1\uffff\1\54\1\26\1\uffff\1\36\2\uffff\1\47\1\uffff\1\3\4\uffff\1\12\1\uffff\1\40\1\uffff\1\2\1\4\2\uffff\1\10\1\30\1\uffff\1\5\2\uffff\1\6\2\uffff\1\1";
    static final String DFA15_specialS =
        "\1\0\37\uffff\1\6\1\uffff\1\3\26\uffff\1\5\23\uffff\1\4\1\2\20\uffff\1\1\31\uffff}>";
    static final String[] DFA15_transitionS = {
            "\11\44\2\43\2\44\1\43\22\44\1\43\1\13\1\40\2\44\1\20\1\44\1\42\1\32\1\33\1\16\1\14\1\25\1\15\1\37\1\17\12\36\1\24\1\44\1\10\1\11\1\12\2\44\32\41\1\34\1\44\1\35\1\31\1\41\1\44\2\41\1\21\1\41\1\27\1\6\2\41\1\2\2\41\1\5\1\41\1\7\1\26\2\41\1\3\1\41\1\4\1\41\1\1\1\41\1\30\2\41\1\22\1\44\1\23\uff82\44",
            "\1\45",
            "\1\47",
            "\1\50",
            "\1\51",
            "\1\52\u0083\uffff\1\53",
            "\1\54",
            "\1\55\u0081\uffff\1\56",
            "\1\57",
            "\1\61",
            "\1\63",
            "\1\65",
            "",
            "",
            "",
            "\1\72\4\uffff\1\71",
            "",
            "\1\75",
            "",
            "",
            "",
            "",
            "\1\102",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\104",
            "\32\46\4\uffff\1\46\1\uffff\32\46",
            "",
            "",
            "",
            "",
            "\1\113\1\uffff\12\114",
            "\12\113",
            "\42\116\1\117\71\116\1\115\uffa3\116",
            "",
            "\0\120",
            "",
            "",
            "\1\122",
            "",
            "\1\123",
            "\1\124",
            "\1\125",
            "\1\126",
            "",
            "\1\127\u0083\uffff\1\130",
            "\1\131",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\0\132",
            "",
            "",
            "",
            "\1\134",
            "",
            "",
            "",
            "",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "",
            "\1\136",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\113\1\uffff\12\114",
            "\0\137",
            "\42\116\1\117\71\116\1\115\uffa3\116",
            "",
            "",
            "",
            "\1\141",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\143",
            "\1\144",
            "\1\145",
            "\1\146",
            "",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "",
            "",
            "\1\150",
            "",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\42\116\1\117\71\116\1\115\uffa3\116",
            "",
            "\1\152\177\uffff\1\153",
            "",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\155",
            "\1\156",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "",
            "\1\161",
            "",
            "",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\163",
            "",
            "",
            "\1\164",
            "",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\166",
            "",
            "\1\167",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            ""
    };

    static final short[] DFA15_eot = DFA.unpackEncodedString(DFA15_eotS);
    static final short[] DFA15_eof = DFA.unpackEncodedString(DFA15_eofS);
    static final char[] DFA15_min = DFA.unpackEncodedStringToUnsignedChars(DFA15_minS);
    static final char[] DFA15_max = DFA.unpackEncodedStringToUnsignedChars(DFA15_maxS);
    static final short[] DFA15_accept = DFA.unpackEncodedString(DFA15_acceptS);
    static final short[] DFA15_special = DFA.unpackEncodedString(DFA15_specialS);
    static final short[][] DFA15_transition;

    static {
        int numStates = DFA15_transitionS.length;
        DFA15_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA15_transition[i] = DFA.unpackEncodedString(DFA15_transitionS[i]);
        }
    }

    class DFA15 extends DFA {

        public DFA15(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 15;
            this.eot = DFA15_eot;
            this.eof = DFA15_eof;
            this.min = DFA15_min;
            this.max = DFA15_max;
            this.accept = DFA15_accept;
            this.special = DFA15_special;
            this.transition = DFA15_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | RULE_REAL | RULE_TEXTO | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA15_0 = input.LA(1);

                        s = -1;
                        if ( (LA15_0=='v') ) {s = 1;}

                        else if ( (LA15_0=='i') ) {s = 2;}

                        else if ( (LA15_0=='r') ) {s = 3;}

                        else if ( (LA15_0=='t') ) {s = 4;}

                        else if ( (LA15_0=='l') ) {s = 5;}

                        else if ( (LA15_0=='f') ) {s = 6;}

                        else if ( (LA15_0=='n') ) {s = 7;}

                        else if ( (LA15_0=='<') ) {s = 8;}

                        else if ( (LA15_0=='=') ) {s = 9;}

                        else if ( (LA15_0=='>') ) {s = 10;}

                        else if ( (LA15_0=='!') ) {s = 11;}

                        else if ( (LA15_0=='+') ) {s = 12;}

                        else if ( (LA15_0=='-') ) {s = 13;}

                        else if ( (LA15_0=='*') ) {s = 14;}

                        else if ( (LA15_0=='/') ) {s = 15;}

                        else if ( (LA15_0=='%') ) {s = 16;}

                        else if ( (LA15_0=='c') ) {s = 17;}

                        else if ( (LA15_0=='{') ) {s = 18;}

                        else if ( (LA15_0=='}') ) {s = 19;}

                        else if ( (LA15_0==':') ) {s = 20;}

                        else if ( (LA15_0==',') ) {s = 21;}

                        else if ( (LA15_0=='o') ) {s = 22;}

                        else if ( (LA15_0=='e') ) {s = 23;}

                        else if ( (LA15_0=='x') ) {s = 24;}

                        else if ( (LA15_0=='^') ) {s = 25;}

                        else if ( (LA15_0=='(') ) {s = 26;}

                        else if ( (LA15_0==')') ) {s = 27;}

                        else if ( (LA15_0=='[') ) {s = 28;}

                        else if ( (LA15_0==']') ) {s = 29;}

                        else if ( ((LA15_0>='0' && LA15_0<='9')) ) {s = 30;}

                        else if ( (LA15_0=='.') ) {s = 31;}

                        else if ( (LA15_0=='\"') ) {s = 32;}

                        else if ( ((LA15_0>='A' && LA15_0<='Z')||LA15_0=='_'||(LA15_0>='a' && LA15_0<='b')||LA15_0=='d'||(LA15_0>='g' && LA15_0<='h')||(LA15_0>='j' && LA15_0<='k')||LA15_0=='m'||(LA15_0>='p' && LA15_0<='q')||LA15_0=='s'||LA15_0=='u'||LA15_0=='w'||(LA15_0>='y' && LA15_0<='z')) ) {s = 33;}

                        else if ( (LA15_0=='\'') ) {s = 34;}

                        else if ( ((LA15_0>='\t' && LA15_0<='\n')||LA15_0=='\r'||LA15_0==' ') ) {s = 35;}

                        else if ( ((LA15_0>='\u0000' && LA15_0<='\b')||(LA15_0>='\u000B' && LA15_0<='\f')||(LA15_0>='\u000E' && LA15_0<='\u001F')||(LA15_0>='#' && LA15_0<='$')||LA15_0=='&'||LA15_0==';'||(LA15_0>='?' && LA15_0<='@')||LA15_0=='\\'||LA15_0=='`'||LA15_0=='|'||(LA15_0>='~' && LA15_0<='\uFFFF')) ) {s = 36;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA15_95 = input.LA(1);

                        s = -1;
                        if ( (LA15_95=='\"') ) {s = 79;}

                        else if ( (LA15_95=='\\') ) {s = 77;}

                        else if ( ((LA15_95>='\u0000' && LA15_95<='!')||(LA15_95>='#' && LA15_95<='[')||(LA15_95>=']' && LA15_95<='\uFFFF')) ) {s = 78;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA15_78 = input.LA(1);

                        s = -1;
                        if ( (LA15_78=='\"') ) {s = 79;}

                        else if ( (LA15_78=='\\') ) {s = 77;}

                        else if ( ((LA15_78>='\u0000' && LA15_78<='!')||(LA15_78>='#' && LA15_78<='[')||(LA15_78>=']' && LA15_78<='\uFFFF')) ) {s = 78;}

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA15_34 = input.LA(1);

                        s = -1;
                        if ( ((LA15_34>='\u0000' && LA15_34<='\uFFFF')) ) {s = 80;}

                        else s = 36;

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA15_77 = input.LA(1);

                        s = -1;
                        if ( ((LA15_77>='\u0000' && LA15_77<='\uFFFF')) ) {s = 95;}

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA15_57 = input.LA(1);

                        s = -1;
                        if ( ((LA15_57>='\u0000' && LA15_57<='\uFFFF')) ) {s = 90;}

                        else s = 91;

                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA15_32 = input.LA(1);

                        s = -1;
                        if ( (LA15_32=='\\') ) {s = 77;}

                        else if ( ((LA15_32>='\u0000' && LA15_32<='!')||(LA15_32>='#' && LA15_32<='[')||(LA15_32>=']' && LA15_32<='\uFFFF')) ) {s = 78;}

                        else if ( (LA15_32=='\"') ) {s = 79;}

                        else s = 36;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 15, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}