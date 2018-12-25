package org.xtext.coral.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPortugolCoralLexer extends Lexer {
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

    public InternalPortugolCoralLexer() {;} 
    public InternalPortugolCoralLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalPortugolCoralLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalPortugolCoral.g"; }

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
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
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
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
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPortugolCoral.g:13:7: ( '{' )
            // InternalPortugolCoral.g:13:9: '{'
            {
            match('{'); 

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
            // InternalPortugolCoral.g:14:7: ( '}' )
            // InternalPortugolCoral.g:14:9: '}'
            {
            match('}'); 

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
            // InternalPortugolCoral.g:15:7: ( ',' )
            // InternalPortugolCoral.g:15:9: ','
            {
            match(','); 

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
            // InternalPortugolCoral.g:16:7: ( ':' )
            // InternalPortugolCoral.g:16:9: ':'
            {
            match(':'); 

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
            // InternalPortugolCoral.g:17:7: ( 'int' )
            // InternalPortugolCoral.g:17:9: 'int'
            {
            match("int"); 


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
            // InternalPortugolCoral.g:18:7: ( 'real' )
            // InternalPortugolCoral.g:18:9: 'real'
            {
            match("real"); 


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
            // InternalPortugolCoral.g:19:7: ( 'texto' )
            // InternalPortugolCoral.g:19:9: 'texto'
            {
            match("texto"); 


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
            // InternalPortugolCoral.g:20:7: ( 'logico' )
            // InternalPortugolCoral.g:20:9: 'logico'
            {
            match("logico"); 


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
            // InternalPortugolCoral.g:21:7: ( 'l\\u00F3gico' )
            // InternalPortugolCoral.g:21:9: 'l\\u00F3gico'
            {
            match("l\u00F3gico"); 


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
            // InternalPortugolCoral.g:22:7: ( '=' )
            // InternalPortugolCoral.g:22:9: '='
            {
            match('='); 

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
            // InternalPortugolCoral.g:23:7: ( 'ou' )
            // InternalPortugolCoral.g:23:9: 'ou'
            {
            match("ou"); 


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
            // InternalPortugolCoral.g:24:7: ( 'e' )
            // InternalPortugolCoral.g:24:9: 'e'
            {
            match('e'); 

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
            // InternalPortugolCoral.g:25:7: ( 'xou' )
            // InternalPortugolCoral.g:25:9: 'xou'
            {
            match("xou"); 


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
            // InternalPortugolCoral.g:26:7: ( 'nao' )
            // InternalPortugolCoral.g:26:9: 'nao'
            {
            match("nao"); 


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
            // InternalPortugolCoral.g:27:7: ( 'n\\u00E3o' )
            // InternalPortugolCoral.g:27:9: 'n\\u00E3o'
            {
            match("n\u00E3o"); 


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
            // InternalPortugolCoral.g:28:7: ( '<=' )
            // InternalPortugolCoral.g:28:9: '<='
            {
            match("<="); 


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
            // InternalPortugolCoral.g:29:7: ( '==' )
            // InternalPortugolCoral.g:29:9: '=='
            {
            match("=="); 


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
            // InternalPortugolCoral.g:30:7: ( '>=' )
            // InternalPortugolCoral.g:30:9: '>='
            {
            match(">="); 


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
            // InternalPortugolCoral.g:31:7: ( '<' )
            // InternalPortugolCoral.g:31:9: '<'
            {
            match('<'); 

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
            // InternalPortugolCoral.g:32:7: ( '>' )
            // InternalPortugolCoral.g:32:9: '>'
            {
            match('>'); 

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
            // InternalPortugolCoral.g:33:7: ( '!=' )
            // InternalPortugolCoral.g:33:9: '!='
            {
            match("!="); 


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
            // InternalPortugolCoral.g:34:7: ( '+' )
            // InternalPortugolCoral.g:34:9: '+'
            {
            match('+'); 

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
            // InternalPortugolCoral.g:35:7: ( '-' )
            // InternalPortugolCoral.g:35:9: '-'
            {
            match('-'); 

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
            // InternalPortugolCoral.g:36:7: ( '*' )
            // InternalPortugolCoral.g:36:9: '*'
            {
            match('*'); 

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
            // InternalPortugolCoral.g:37:7: ( '/' )
            // InternalPortugolCoral.g:37:9: '/'
            {
            match('/'); 

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
            // InternalPortugolCoral.g:38:7: ( '//' )
            // InternalPortugolCoral.g:38:9: '//'
            {
            match("//"); 


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
            // InternalPortugolCoral.g:39:7: ( '%' )
            // InternalPortugolCoral.g:39:9: '%'
            {
            match('%'); 

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
            // InternalPortugolCoral.g:40:7: ( '^' )
            // InternalPortugolCoral.g:40:9: '^'
            {
            match('^'); 

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
            // InternalPortugolCoral.g:41:7: ( '(' )
            // InternalPortugolCoral.g:41:9: '('
            {
            match('('); 

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
            // InternalPortugolCoral.g:42:7: ( ')' )
            // InternalPortugolCoral.g:42:9: ')'
            {
            match(')'); 

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
            // InternalPortugolCoral.g:43:7: ( '[' )
            // InternalPortugolCoral.g:43:9: '['
            {
            match('['); 

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
            // InternalPortugolCoral.g:44:7: ( ']' )
            // InternalPortugolCoral.g:44:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "RULE_REAL"
    public final void mRULE_REAL() throws RecognitionException {
        try {
            int _type = RULE_REAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPortugolCoral.g:1481:11: ( ( RULE_INT '.' ( RULE_INT )? | '.' RULE_INT ) )
            // InternalPortugolCoral.g:1481:13: ( RULE_INT '.' ( RULE_INT )? | '.' RULE_INT )
            {
            // InternalPortugolCoral.g:1481:13: ( RULE_INT '.' ( RULE_INT )? | '.' RULE_INT )
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
                    // InternalPortugolCoral.g:1481:14: RULE_INT '.' ( RULE_INT )?
                    {
                    mRULE_INT(); 
                    match('.'); 
                    // InternalPortugolCoral.g:1481:27: ( RULE_INT )?
                    int alt1=2;
                    int LA1_0 = input.LA(1);

                    if ( ((LA1_0>='0' && LA1_0<='9')) ) {
                        alt1=1;
                    }
                    switch (alt1) {
                        case 1 :
                            // InternalPortugolCoral.g:1481:27: RULE_INT
                            {
                            mRULE_INT(); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // InternalPortugolCoral.g:1481:37: '.' RULE_INT
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

    // $ANTLR start "RULE_TEXTO_ASPAS_SIMPLES"
    public final void mRULE_TEXTO_ASPAS_SIMPLES() throws RecognitionException {
        try {
            int _type = RULE_TEXTO_ASPAS_SIMPLES;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPortugolCoral.g:1483:26: ( '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            // InternalPortugolCoral.g:1483:28: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
            {
            match('\''); 
            // InternalPortugolCoral.g:1483:33: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
            loop3:
            do {
                int alt3=3;
                int LA3_0 = input.LA(1);

                if ( (LA3_0=='\\') ) {
                    alt3=1;
                }
                else if ( ((LA3_0>='\u0000' && LA3_0<='&')||(LA3_0>='(' && LA3_0<='[')||(LA3_0>=']' && LA3_0<='\uFFFF')) ) {
                    alt3=2;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalPortugolCoral.g:1483:34: '\\\\' .
            	    {
            	    match('\\'); 
            	    matchAny(); 

            	    }
            	    break;
            	case 2 :
            	    // InternalPortugolCoral.g:1483:41: ~ ( ( '\\\\' | '\\'' ) )
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
            	    break loop3;
                }
            } while (true);

            match('\''); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_TEXTO_ASPAS_SIMPLES"

    // $ANTLR start "RULE_TEXTO_ASPAS_DUPLAS"
    public final void mRULE_TEXTO_ASPAS_DUPLAS() throws RecognitionException {
        try {
            int _type = RULE_TEXTO_ASPAS_DUPLAS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPortugolCoral.g:1485:25: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' )
            // InternalPortugolCoral.g:1485:27: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
            {
            match('\"'); 
            // InternalPortugolCoral.g:1485:31: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
            loop4:
            do {
                int alt4=3;
                int LA4_0 = input.LA(1);

                if ( (LA4_0=='\\') ) {
                    alt4=1;
                }
                else if ( ((LA4_0>='\u0000' && LA4_0<='!')||(LA4_0>='#' && LA4_0<='[')||(LA4_0>=']' && LA4_0<='\uFFFF')) ) {
                    alt4=2;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalPortugolCoral.g:1485:32: '\\\\' .
            	    {
            	    match('\\'); 
            	    matchAny(); 

            	    }
            	    break;
            	case 2 :
            	    // InternalPortugolCoral.g:1485:39: ~ ( ( '\\\\' | '\"' ) )
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
            	    break loop4;
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
    // $ANTLR end "RULE_TEXTO_ASPAS_DUPLAS"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPortugolCoral.g:1487:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalPortugolCoral.g:1487:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalPortugolCoral.g:1487:11: ( '^' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='^') ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalPortugolCoral.g:1487:11: '^'
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

            // InternalPortugolCoral.g:1487:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='0' && LA6_0<='9')||(LA6_0>='A' && LA6_0<='Z')||LA6_0=='_'||(LA6_0>='a' && LA6_0<='z')) ) {
                    alt6=1;
                }


                switch (alt6) {
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
            	    break loop6;
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
            // InternalPortugolCoral.g:1489:10: ( ( '0' .. '9' )+ )
            // InternalPortugolCoral.g:1489:12: ( '0' .. '9' )+
            {
            // InternalPortugolCoral.g:1489:12: ( '0' .. '9' )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>='0' && LA7_0<='9')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalPortugolCoral.g:1489:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
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
            // InternalPortugolCoral.g:1491:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalPortugolCoral.g:1491:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalPortugolCoral.g:1491:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\"') ) {
                alt10=1;
            }
            else if ( (LA10_0=='\'') ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalPortugolCoral.g:1491:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalPortugolCoral.g:1491:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop8:
                    do {
                        int alt8=3;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0=='\\') ) {
                            alt8=1;
                        }
                        else if ( ((LA8_0>='\u0000' && LA8_0<='!')||(LA8_0>='#' && LA8_0<='[')||(LA8_0>=']' && LA8_0<='\uFFFF')) ) {
                            alt8=2;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalPortugolCoral.g:1491:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalPortugolCoral.g:1491:28: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop8;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalPortugolCoral.g:1491:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalPortugolCoral.g:1491:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop9:
                    do {
                        int alt9=3;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0=='\\') ) {
                            alt9=1;
                        }
                        else if ( ((LA9_0>='\u0000' && LA9_0<='&')||(LA9_0>='(' && LA9_0<='[')||(LA9_0>=']' && LA9_0<='\uFFFF')) ) {
                            alt9=2;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalPortugolCoral.g:1491:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalPortugolCoral.g:1491:61: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop9;
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
            // InternalPortugolCoral.g:1493:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalPortugolCoral.g:1493:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalPortugolCoral.g:1493:24: ( options {greedy=false; } : . )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0=='*') ) {
                    int LA11_1 = input.LA(2);

                    if ( (LA11_1=='/') ) {
                        alt11=2;
                    }
                    else if ( ((LA11_1>='\u0000' && LA11_1<='.')||(LA11_1>='0' && LA11_1<='\uFFFF')) ) {
                        alt11=1;
                    }


                }
                else if ( ((LA11_0>='\u0000' && LA11_0<=')')||(LA11_0>='+' && LA11_0<='\uFFFF')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalPortugolCoral.g:1493:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop11;
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
            // InternalPortugolCoral.g:1495:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalPortugolCoral.g:1495:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalPortugolCoral.g:1495:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>='\u0000' && LA12_0<='\t')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\uFFFF')) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalPortugolCoral.g:1495:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop12;
                }
            } while (true);

            // InternalPortugolCoral.g:1495:40: ( ( '\\r' )? '\\n' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0=='\n'||LA14_0=='\r') ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalPortugolCoral.g:1495:41: ( '\\r' )? '\\n'
                    {
                    // InternalPortugolCoral.g:1495:41: ( '\\r' )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0=='\r') ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // InternalPortugolCoral.g:1495:41: '\\r'
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
            // InternalPortugolCoral.g:1497:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalPortugolCoral.g:1497:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalPortugolCoral.g:1497:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt15=0;
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>='\t' && LA15_0<='\n')||LA15_0=='\r'||LA15_0==' ') ) {
                    alt15=1;
                }


                switch (alt15) {
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
            	    if ( cnt15 >= 1 ) break loop15;
                        EarlyExitException eee =
                            new EarlyExitException(15, input);
                        throw eee;
                }
                cnt15++;
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
            // InternalPortugolCoral.g:1499:16: ( . )
            // InternalPortugolCoral.g:1499:18: .
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
        // InternalPortugolCoral.g:1:8: ( T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | RULE_REAL | RULE_TEXTO_ASPAS_SIMPLES | RULE_TEXTO_ASPAS_DUPLAS | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt16=44;
        alt16 = dfa16.predict(input);
        switch (alt16) {
            case 1 :
                // InternalPortugolCoral.g:1:10: T__14
                {
                mT__14(); 

                }
                break;
            case 2 :
                // InternalPortugolCoral.g:1:16: T__15
                {
                mT__15(); 

                }
                break;
            case 3 :
                // InternalPortugolCoral.g:1:22: T__16
                {
                mT__16(); 

                }
                break;
            case 4 :
                // InternalPortugolCoral.g:1:28: T__17
                {
                mT__17(); 

                }
                break;
            case 5 :
                // InternalPortugolCoral.g:1:34: T__18
                {
                mT__18(); 

                }
                break;
            case 6 :
                // InternalPortugolCoral.g:1:40: T__19
                {
                mT__19(); 

                }
                break;
            case 7 :
                // InternalPortugolCoral.g:1:46: T__20
                {
                mT__20(); 

                }
                break;
            case 8 :
                // InternalPortugolCoral.g:1:52: T__21
                {
                mT__21(); 

                }
                break;
            case 9 :
                // InternalPortugolCoral.g:1:58: T__22
                {
                mT__22(); 

                }
                break;
            case 10 :
                // InternalPortugolCoral.g:1:64: T__23
                {
                mT__23(); 

                }
                break;
            case 11 :
                // InternalPortugolCoral.g:1:70: T__24
                {
                mT__24(); 

                }
                break;
            case 12 :
                // InternalPortugolCoral.g:1:76: T__25
                {
                mT__25(); 

                }
                break;
            case 13 :
                // InternalPortugolCoral.g:1:82: T__26
                {
                mT__26(); 

                }
                break;
            case 14 :
                // InternalPortugolCoral.g:1:88: T__27
                {
                mT__27(); 

                }
                break;
            case 15 :
                // InternalPortugolCoral.g:1:94: T__28
                {
                mT__28(); 

                }
                break;
            case 16 :
                // InternalPortugolCoral.g:1:100: T__29
                {
                mT__29(); 

                }
                break;
            case 17 :
                // InternalPortugolCoral.g:1:106: T__30
                {
                mT__30(); 

                }
                break;
            case 18 :
                // InternalPortugolCoral.g:1:112: T__31
                {
                mT__31(); 

                }
                break;
            case 19 :
                // InternalPortugolCoral.g:1:118: T__32
                {
                mT__32(); 

                }
                break;
            case 20 :
                // InternalPortugolCoral.g:1:124: T__33
                {
                mT__33(); 

                }
                break;
            case 21 :
                // InternalPortugolCoral.g:1:130: T__34
                {
                mT__34(); 

                }
                break;
            case 22 :
                // InternalPortugolCoral.g:1:136: T__35
                {
                mT__35(); 

                }
                break;
            case 23 :
                // InternalPortugolCoral.g:1:142: T__36
                {
                mT__36(); 

                }
                break;
            case 24 :
                // InternalPortugolCoral.g:1:148: T__37
                {
                mT__37(); 

                }
                break;
            case 25 :
                // InternalPortugolCoral.g:1:154: T__38
                {
                mT__38(); 

                }
                break;
            case 26 :
                // InternalPortugolCoral.g:1:160: T__39
                {
                mT__39(); 

                }
                break;
            case 27 :
                // InternalPortugolCoral.g:1:166: T__40
                {
                mT__40(); 

                }
                break;
            case 28 :
                // InternalPortugolCoral.g:1:172: T__41
                {
                mT__41(); 

                }
                break;
            case 29 :
                // InternalPortugolCoral.g:1:178: T__42
                {
                mT__42(); 

                }
                break;
            case 30 :
                // InternalPortugolCoral.g:1:184: T__43
                {
                mT__43(); 

                }
                break;
            case 31 :
                // InternalPortugolCoral.g:1:190: T__44
                {
                mT__44(); 

                }
                break;
            case 32 :
                // InternalPortugolCoral.g:1:196: T__45
                {
                mT__45(); 

                }
                break;
            case 33 :
                // InternalPortugolCoral.g:1:202: T__46
                {
                mT__46(); 

                }
                break;
            case 34 :
                // InternalPortugolCoral.g:1:208: T__47
                {
                mT__47(); 

                }
                break;
            case 35 :
                // InternalPortugolCoral.g:1:214: RULE_REAL
                {
                mRULE_REAL(); 

                }
                break;
            case 36 :
                // InternalPortugolCoral.g:1:224: RULE_TEXTO_ASPAS_SIMPLES
                {
                mRULE_TEXTO_ASPAS_SIMPLES(); 

                }
                break;
            case 37 :
                // InternalPortugolCoral.g:1:249: RULE_TEXTO_ASPAS_DUPLAS
                {
                mRULE_TEXTO_ASPAS_DUPLAS(); 

                }
                break;
            case 38 :
                // InternalPortugolCoral.g:1:273: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 39 :
                // InternalPortugolCoral.g:1:281: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 40 :
                // InternalPortugolCoral.g:1:290: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 41 :
                // InternalPortugolCoral.g:1:302: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 42 :
                // InternalPortugolCoral.g:1:318: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 43 :
                // InternalPortugolCoral.g:1:334: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 44 :
                // InternalPortugolCoral.g:1:342: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA16 dfa16 = new DFA16(this);
    static final String DFA16_eotS =
        "\1\uffff\1\44\4\uffff\4\44\1\57\1\44\1\61\2\44\1\66\1\70\1\42\3\uffff\1\77\1\uffff\1\101\4\uffff\1\106\3\42\3\uffff\1\44\5\uffff\4\44\3\uffff\1\125\1\uffff\2\44\11\uffff\1\130\11\uffff\1\106\10\uffff\1\44\1\137\3\44\1\uffff\1\143\1\144\6\uffff\1\44\1\uffff\1\147\2\44\2\uffff\1\44\2\uffff\1\153\2\44\1\uffff\1\156\1\44\1\uffff\1\44\1\161\1\uffff";
    static final String DFA16_eofS =
        "\162\uffff";
    static final String DFA16_minS =
        "\1\0\1\141\4\uffff\1\156\2\145\1\157\1\75\1\165\1\60\1\157\1\141\3\75\3\uffff\1\52\1\uffff\1\101\4\uffff\1\56\1\60\2\0\3\uffff\1\162\5\uffff\1\164\1\141\1\170\1\147\3\uffff\1\60\1\uffff\1\165\1\157\11\uffff\1\0\11\uffff\1\56\1\uffff\2\0\1\uffff\2\0\2\uffff\1\151\1\60\1\154\1\164\1\151\1\uffff\2\60\2\uffff\1\0\1\uffff\1\0\1\uffff\1\141\1\uffff\1\60\1\157\1\143\2\uffff\1\166\2\uffff\1\60\1\157\1\145\1\uffff\1\60\1\151\1\uffff\1\163\1\60\1\uffff";
    static final String DFA16_maxS =
        "\1\uffff\1\141\4\uffff\1\156\2\145\1\u00f3\1\75\1\165\1\172\1\157\1\u00e3\3\75\3\uffff\1\57\1\uffff\1\172\4\uffff\2\71\2\uffff\3\uffff\1\162\5\uffff\1\164\1\141\1\170\1\147\3\uffff\1\172\1\uffff\1\165\1\157\11\uffff\1\uffff\11\uffff\1\71\1\uffff\2\uffff\1\uffff\2\uffff\2\uffff\1\151\1\172\1\154\1\164\1\151\1\uffff\2\172\2\uffff\1\uffff\1\uffff\1\uffff\1\uffff\1\u00e1\1\uffff\1\172\1\157\1\143\2\uffff\1\166\2\uffff\1\172\1\157\1\145\1\uffff\1\172\1\151\1\uffff\1\163\1\172\1\uffff";
    static final String DFA16_acceptS =
        "\2\uffff\1\3\1\4\1\5\1\6\14\uffff\1\30\1\31\1\32\1\uffff\1\35\1\uffff\1\37\1\40\1\41\1\42\4\uffff\1\46\1\53\1\54\1\uffff\1\46\1\3\1\4\1\5\1\6\4\uffff\1\13\1\23\1\14\1\uffff\1\16\2\uffff\1\21\1\22\1\25\1\24\1\26\1\27\1\30\1\31\1\32\1\uffff\1\51\1\33\1\35\1\36\1\37\1\40\1\41\1\42\1\47\1\uffff\1\43\2\uffff\1\44\2\uffff\1\45\1\53\5\uffff\1\15\2\uffff\1\34\1\52\1\uffff\1\44\1\uffff\1\45\1\uffff\1\7\3\uffff\1\17\1\20\1\uffff\1\2\1\10\3\uffff\1\11\2\uffff\1\12\2\uffff\1\1";
    static final String DFA16_specialS =
        "\1\0\35\uffff\1\1\1\4\35\uffff\1\5\13\uffff\1\2\1\7\1\uffff\1\3\1\11\14\uffff\1\6\1\uffff\1\10\25\uffff}>";
    static final String[] DFA16_transitionS = {
            "\11\42\2\41\2\42\1\41\22\42\1\41\1\21\1\37\2\42\1\26\1\42\1\36\1\30\1\31\1\24\1\22\1\4\1\23\1\35\1\25\12\34\1\5\1\42\1\17\1\12\1\20\2\42\32\40\1\32\1\42\1\33\1\27\1\40\1\42\4\40\1\14\3\40\1\6\2\40\1\11\1\40\1\16\1\13\2\40\1\7\1\40\1\10\1\40\1\1\1\40\1\15\2\40\1\2\1\42\1\3\uff82\42",
            "\1\43",
            "",
            "",
            "",
            "",
            "\1\51",
            "\1\52",
            "\1\53",
            "\1\54\u0083\uffff\1\55",
            "\1\56",
            "\1\60",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\62",
            "\1\63\u0081\uffff\1\64",
            "\1\65",
            "\1\67",
            "\1\71",
            "",
            "",
            "",
            "\1\76\4\uffff\1\75",
            "",
            "\32\44\4\uffff\1\44\1\uffff\32\44",
            "",
            "",
            "",
            "",
            "\1\110\1\uffff\12\107",
            "\12\110",
            "\47\112\1\113\64\112\1\111\uffa3\112",
            "\42\115\1\116\71\115\1\114\uffa3\115",
            "",
            "",
            "",
            "\1\120",
            "",
            "",
            "",
            "",
            "",
            "\1\121",
            "\1\122",
            "\1\123",
            "\1\124",
            "",
            "",
            "",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "",
            "\1\126",
            "\1\127",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\0\131",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\110\1\uffff\12\107",
            "",
            "\0\132",
            "\47\112\1\113\64\112\1\111\uffa3\112",
            "",
            "\0\134",
            "\42\115\1\116\71\115\1\114\uffa3\115",
            "",
            "",
            "\1\136",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\140",
            "\1\141",
            "\1\142",
            "",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "",
            "",
            "\47\112\1\113\64\112\1\111\uffa3\112",
            "",
            "\42\115\1\116\71\115\1\114\uffa3\115",
            "",
            "\1\145\177\uffff\1\146",
            "",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\150",
            "\1\151",
            "",
            "",
            "\1\152",
            "",
            "",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\154",
            "\1\155",
            "",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\157",
            "",
            "\1\160",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            ""
    };

    static final short[] DFA16_eot = DFA.unpackEncodedString(DFA16_eotS);
    static final short[] DFA16_eof = DFA.unpackEncodedString(DFA16_eofS);
    static final char[] DFA16_min = DFA.unpackEncodedStringToUnsignedChars(DFA16_minS);
    static final char[] DFA16_max = DFA.unpackEncodedStringToUnsignedChars(DFA16_maxS);
    static final short[] DFA16_accept = DFA.unpackEncodedString(DFA16_acceptS);
    static final short[] DFA16_special = DFA.unpackEncodedString(DFA16_specialS);
    static final short[][] DFA16_transition;

    static {
        int numStates = DFA16_transitionS.length;
        DFA16_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA16_transition[i] = DFA.unpackEncodedString(DFA16_transitionS[i]);
        }
    }

    class DFA16 extends DFA {

        public DFA16(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 16;
            this.eot = DFA16_eot;
            this.eof = DFA16_eof;
            this.min = DFA16_min;
            this.max = DFA16_max;
            this.accept = DFA16_accept;
            this.special = DFA16_special;
            this.transition = DFA16_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | RULE_REAL | RULE_TEXTO_ASPAS_SIMPLES | RULE_TEXTO_ASPAS_DUPLAS | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA16_0 = input.LA(1);

                        s = -1;
                        if ( (LA16_0=='v') ) {s = 1;}

                        else if ( (LA16_0=='{') ) {s = 2;}

                        else if ( (LA16_0=='}') ) {s = 3;}

                        else if ( (LA16_0==',') ) {s = 4;}

                        else if ( (LA16_0==':') ) {s = 5;}

                        else if ( (LA16_0=='i') ) {s = 6;}

                        else if ( (LA16_0=='r') ) {s = 7;}

                        else if ( (LA16_0=='t') ) {s = 8;}

                        else if ( (LA16_0=='l') ) {s = 9;}

                        else if ( (LA16_0=='=') ) {s = 10;}

                        else if ( (LA16_0=='o') ) {s = 11;}

                        else if ( (LA16_0=='e') ) {s = 12;}

                        else if ( (LA16_0=='x') ) {s = 13;}

                        else if ( (LA16_0=='n') ) {s = 14;}

                        else if ( (LA16_0=='<') ) {s = 15;}

                        else if ( (LA16_0=='>') ) {s = 16;}

                        else if ( (LA16_0=='!') ) {s = 17;}

                        else if ( (LA16_0=='+') ) {s = 18;}

                        else if ( (LA16_0=='-') ) {s = 19;}

                        else if ( (LA16_0=='*') ) {s = 20;}

                        else if ( (LA16_0=='/') ) {s = 21;}

                        else if ( (LA16_0=='%') ) {s = 22;}

                        else if ( (LA16_0=='^') ) {s = 23;}

                        else if ( (LA16_0=='(') ) {s = 24;}

                        else if ( (LA16_0==')') ) {s = 25;}

                        else if ( (LA16_0=='[') ) {s = 26;}

                        else if ( (LA16_0==']') ) {s = 27;}

                        else if ( ((LA16_0>='0' && LA16_0<='9')) ) {s = 28;}

                        else if ( (LA16_0=='.') ) {s = 29;}

                        else if ( (LA16_0=='\'') ) {s = 30;}

                        else if ( (LA16_0=='\"') ) {s = 31;}

                        else if ( ((LA16_0>='A' && LA16_0<='Z')||LA16_0=='_'||(LA16_0>='a' && LA16_0<='d')||(LA16_0>='f' && LA16_0<='h')||(LA16_0>='j' && LA16_0<='k')||LA16_0=='m'||(LA16_0>='p' && LA16_0<='q')||LA16_0=='s'||LA16_0=='u'||LA16_0=='w'||(LA16_0>='y' && LA16_0<='z')) ) {s = 32;}

                        else if ( ((LA16_0>='\t' && LA16_0<='\n')||LA16_0=='\r'||LA16_0==' ') ) {s = 33;}

                        else if ( ((LA16_0>='\u0000' && LA16_0<='\b')||(LA16_0>='\u000B' && LA16_0<='\f')||(LA16_0>='\u000E' && LA16_0<='\u001F')||(LA16_0>='#' && LA16_0<='$')||LA16_0=='&'||LA16_0==';'||(LA16_0>='?' && LA16_0<='@')||LA16_0=='\\'||LA16_0=='`'||LA16_0=='|'||(LA16_0>='~' && LA16_0<='\uFFFF')) ) {s = 34;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA16_30 = input.LA(1);

                        s = -1;
                        if ( (LA16_30=='\\') ) {s = 73;}

                        else if ( ((LA16_30>='\u0000' && LA16_30<='&')||(LA16_30>='(' && LA16_30<='[')||(LA16_30>=']' && LA16_30<='\uFFFF')) ) {s = 74;}

                        else if ( (LA16_30=='\'') ) {s = 75;}

                        else s = 34;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA16_73 = input.LA(1);

                        s = -1;
                        if ( ((LA16_73>='\u0000' && LA16_73<='\uFFFF')) ) {s = 90;}

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA16_76 = input.LA(1);

                        s = -1;
                        if ( ((LA16_76>='\u0000' && LA16_76<='\uFFFF')) ) {s = 92;}

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA16_31 = input.LA(1);

                        s = -1;
                        if ( (LA16_31=='\\') ) {s = 76;}

                        else if ( ((LA16_31>='\u0000' && LA16_31<='!')||(LA16_31>='#' && LA16_31<='[')||(LA16_31>=']' && LA16_31<='\uFFFF')) ) {s = 77;}

                        else if ( (LA16_31=='\"') ) {s = 78;}

                        else s = 34;

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA16_61 = input.LA(1);

                        s = -1;
                        if ( ((LA16_61>='\u0000' && LA16_61<='\uFFFF')) ) {s = 89;}

                        else s = 88;

                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA16_90 = input.LA(1);

                        s = -1;
                        if ( (LA16_90=='\'') ) {s = 75;}

                        else if ( (LA16_90=='\\') ) {s = 73;}

                        else if ( ((LA16_90>='\u0000' && LA16_90<='&')||(LA16_90>='(' && LA16_90<='[')||(LA16_90>=']' && LA16_90<='\uFFFF')) ) {s = 74;}

                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA16_74 = input.LA(1);

                        s = -1;
                        if ( (LA16_74=='\'') ) {s = 75;}

                        else if ( (LA16_74=='\\') ) {s = 73;}

                        else if ( ((LA16_74>='\u0000' && LA16_74<='&')||(LA16_74>='(' && LA16_74<='[')||(LA16_74>=']' && LA16_74<='\uFFFF')) ) {s = 74;}

                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA16_92 = input.LA(1);

                        s = -1;
                        if ( (LA16_92=='\"') ) {s = 78;}

                        else if ( (LA16_92=='\\') ) {s = 76;}

                        else if ( ((LA16_92>='\u0000' && LA16_92<='!')||(LA16_92>='#' && LA16_92<='[')||(LA16_92>=']' && LA16_92<='\uFFFF')) ) {s = 77;}

                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA16_77 = input.LA(1);

                        s = -1;
                        if ( (LA16_77=='\"') ) {s = 78;}

                        else if ( (LA16_77=='\\') ) {s = 76;}

                        else if ( ((LA16_77>='\u0000' && LA16_77<='!')||(LA16_77>='#' && LA16_77<='[')||(LA16_77>=']' && LA16_77<='\uFFFF')) ) {s = 77;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 16, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}