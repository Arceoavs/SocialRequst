package org.xtext.example.mydsl.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSocialRequestLexer extends Lexer {
    public static final int RULE_STRING=9;
    public static final int RULE_DATA_TYPE=6;
    public static final int RULE_SL_COMMENT=13;
    public static final int T__19=19;
    public static final int RULE_POSSIBLY_SIGNED_INT=8;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int RULE_GENERATION_TYPE=7;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int RULE_ASSOCIATION=5;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_FETCH_TYPE=10;
    public static final int T__32=32;
    public static final int RULE_ID=4;
    public static final int RULE_WS=14;
    public static final int RULE_ANY_OTHER=15;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=11;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=12;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators

    public InternalSocialRequestLexer() {;} 
    public InternalSocialRequestLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalSocialRequestLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalSocialRequest.g"; }

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSocialRequest.g:11:7: ( 'Entity' )
            // InternalSocialRequest.g:11:9: 'Entity'
            {
            match("Entity"); 


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
            // InternalSocialRequest.g:12:7: ( 'implements UserDetails' )
            // InternalSocialRequest.g:12:9: 'implements UserDetails'
            {
            match("implements UserDetails"); 


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
            // InternalSocialRequest.g:13:7: ( '{' )
            // InternalSocialRequest.g:13:9: '{'
            {
            match('{'); 

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
            // InternalSocialRequest.g:14:7: ( '}' )
            // InternalSocialRequest.g:14:9: '}'
            {
            match('}'); 

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
            // InternalSocialRequest.g:15:7: ( ':' )
            // InternalSocialRequest.g:15:9: ':'
            {
            match(':'); 

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
            // InternalSocialRequest.g:16:7: ( 'validations {' )
            // InternalSocialRequest.g:16:9: 'validations {'
            {
            match("validations {"); 


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
            // InternalSocialRequest.g:17:7: ( 'LOB' )
            // InternalSocialRequest.g:17:9: 'LOB'
            {
            match("LOB"); 


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
            // InternalSocialRequest.g:18:7: ( 'ID' )
            // InternalSocialRequest.g:18:9: 'ID'
            {
            match("ID"); 


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
            // InternalSocialRequest.g:19:7: ( '(' )
            // InternalSocialRequest.g:19:9: '('
            {
            match('('); 

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
            // InternalSocialRequest.g:20:7: ( ')' )
            // InternalSocialRequest.g:20:9: ')'
            {
            match(')'); 

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
            // InternalSocialRequest.g:21:7: ( 'min:' )
            // InternalSocialRequest.g:21:9: 'min:'
            {
            match("min:"); 


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
            // InternalSocialRequest.g:22:7: ( 'max:' )
            // InternalSocialRequest.g:22:9: 'max:'
            {
            match("max:"); 


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
            // InternalSocialRequest.g:23:7: ( 'pattern:' )
            // InternalSocialRequest.g:23:9: 'pattern:'
            {
            match("pattern:"); 


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
            // InternalSocialRequest.g:24:7: ( 'not-null' )
            // InternalSocialRequest.g:24:9: 'not-null'
            {
            match("not-null"); 


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
            // InternalSocialRequest.g:25:7: ( 'not-blank' )
            // InternalSocialRequest.g:25:9: 'not-blank'
            {
            match("not-blank"); 


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
            // InternalSocialRequest.g:26:7: ( 'mappedBy:' )
            // InternalSocialRequest.g:26:9: 'mappedBy:'
            {
            match("mappedBy:"); 


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
            // InternalSocialRequest.g:27:7: ( 'fetch:' )
            // InternalSocialRequest.g:27:9: 'fetch:'
            {
            match("fetch:"); 


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
            // InternalSocialRequest.g:28:7: ( 'Repository' )
            // InternalSocialRequest.g:28:9: 'Repository'
            {
            match("Repository"); 


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
            // InternalSocialRequest.g:29:7: ( 'query' )
            // InternalSocialRequest.g:29:9: 'query'
            {
            match("query"); 


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
            // InternalSocialRequest.g:30:7: ( ': list' )
            // InternalSocialRequest.g:30:9: ': list'
            {
            match(": list"); 


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
            // InternalSocialRequest.g:31:7: ( 'param' )
            // InternalSocialRequest.g:31:9: 'param'
            {
            match("param"); 


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
            // InternalSocialRequest.g:32:7: ( 'Kek' )
            // InternalSocialRequest.g:32:9: 'Kek'
            {
            match("Kek"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "RULE_POSSIBLY_SIGNED_INT"
    public final void mRULE_POSSIBLY_SIGNED_INT() throws RecognitionException {
        try {
            int _type = RULE_POSSIBLY_SIGNED_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSocialRequest.g:917:26: ( ( '-' )? RULE_INT )
            // InternalSocialRequest.g:917:28: ( '-' )? RULE_INT
            {
            // InternalSocialRequest.g:917:28: ( '-' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='-') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalSocialRequest.g:917:28: '-'
                    {
                    match('-'); 

                    }
                    break;

            }

            mRULE_INT(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_POSSIBLY_SIGNED_INT"

    // $ANTLR start "RULE_GENERATION_TYPE"
    public final void mRULE_GENERATION_TYPE() throws RecognitionException {
        try {
            int _type = RULE_GENERATION_TYPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSocialRequest.g:919:22: ( ( 'auto' | 'table' | 'identity' | 'sequence' ) )
            // InternalSocialRequest.g:919:24: ( 'auto' | 'table' | 'identity' | 'sequence' )
            {
            // InternalSocialRequest.g:919:24: ( 'auto' | 'table' | 'identity' | 'sequence' )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 'a':
                {
                alt2=1;
                }
                break;
            case 't':
                {
                alt2=2;
                }
                break;
            case 'i':
                {
                alt2=3;
                }
                break;
            case 's':
                {
                alt2=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalSocialRequest.g:919:25: 'auto'
                    {
                    match("auto"); 


                    }
                    break;
                case 2 :
                    // InternalSocialRequest.g:919:32: 'table'
                    {
                    match("table"); 


                    }
                    break;
                case 3 :
                    // InternalSocialRequest.g:919:40: 'identity'
                    {
                    match("identity"); 


                    }
                    break;
                case 4 :
                    // InternalSocialRequest.g:919:51: 'sequence'
                    {
                    match("sequence"); 


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
    // $ANTLR end "RULE_GENERATION_TYPE"

    // $ANTLR start "RULE_FETCH_TYPE"
    public final void mRULE_FETCH_TYPE() throws RecognitionException {
        try {
            int _type = RULE_FETCH_TYPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSocialRequest.g:921:17: ( ( 'eager' | 'lazy' ) )
            // InternalSocialRequest.g:921:19: ( 'eager' | 'lazy' )
            {
            // InternalSocialRequest.g:921:19: ( 'eager' | 'lazy' )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='e') ) {
                alt3=1;
            }
            else if ( (LA3_0=='l') ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalSocialRequest.g:921:20: 'eager'
                    {
                    match("eager"); 


                    }
                    break;
                case 2 :
                    // InternalSocialRequest.g:921:28: 'lazy'
                    {
                    match("lazy"); 


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
    // $ANTLR end "RULE_FETCH_TYPE"

    // $ANTLR start "RULE_ASSOCIATION"
    public final void mRULE_ASSOCIATION() throws RecognitionException {
        try {
            int _type = RULE_ASSOCIATION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSocialRequest.g:923:18: ( ( 'one-to-many' | 'many-to-one' | 'one-to-one' | 'many-to-many' ) )
            // InternalSocialRequest.g:923:20: ( 'one-to-many' | 'many-to-one' | 'one-to-one' | 'many-to-many' )
            {
            // InternalSocialRequest.g:923:20: ( 'one-to-many' | 'many-to-one' | 'one-to-one' | 'many-to-many' )
            int alt4=4;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // InternalSocialRequest.g:923:21: 'one-to-many'
                    {
                    match("one-to-many"); 


                    }
                    break;
                case 2 :
                    // InternalSocialRequest.g:923:35: 'many-to-one'
                    {
                    match("many-to-one"); 


                    }
                    break;
                case 3 :
                    // InternalSocialRequest.g:923:49: 'one-to-one'
                    {
                    match("one-to-one"); 


                    }
                    break;
                case 4 :
                    // InternalSocialRequest.g:923:62: 'many-to-many'
                    {
                    match("many-to-many"); 


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
    // $ANTLR end "RULE_ASSOCIATION"

    // $ANTLR start "RULE_DATA_TYPE"
    public final void mRULE_DATA_TYPE() throws RecognitionException {
        try {
            int _type = RULE_DATA_TYPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSocialRequest.g:925:16: ( ( 'String' | 'long' | 'Long' | 'float' | 'double' | 'char' | 'int' | 'boolean' ) )
            // InternalSocialRequest.g:925:18: ( 'String' | 'long' | 'Long' | 'float' | 'double' | 'char' | 'int' | 'boolean' )
            {
            // InternalSocialRequest.g:925:18: ( 'String' | 'long' | 'Long' | 'float' | 'double' | 'char' | 'int' | 'boolean' )
            int alt5=8;
            switch ( input.LA(1) ) {
            case 'S':
                {
                alt5=1;
                }
                break;
            case 'l':
                {
                alt5=2;
                }
                break;
            case 'L':
                {
                alt5=3;
                }
                break;
            case 'f':
                {
                alt5=4;
                }
                break;
            case 'd':
                {
                alt5=5;
                }
                break;
            case 'c':
                {
                alt5=6;
                }
                break;
            case 'i':
                {
                alt5=7;
                }
                break;
            case 'b':
                {
                alt5=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalSocialRequest.g:925:19: 'String'
                    {
                    match("String"); 


                    }
                    break;
                case 2 :
                    // InternalSocialRequest.g:925:28: 'long'
                    {
                    match("long"); 


                    }
                    break;
                case 3 :
                    // InternalSocialRequest.g:925:35: 'Long'
                    {
                    match("Long"); 


                    }
                    break;
                case 4 :
                    // InternalSocialRequest.g:925:42: 'float'
                    {
                    match("float"); 


                    }
                    break;
                case 5 :
                    // InternalSocialRequest.g:925:50: 'double'
                    {
                    match("double"); 


                    }
                    break;
                case 6 :
                    // InternalSocialRequest.g:925:59: 'char'
                    {
                    match("char"); 


                    }
                    break;
                case 7 :
                    // InternalSocialRequest.g:925:66: 'int'
                    {
                    match("int"); 


                    }
                    break;
                case 8 :
                    // InternalSocialRequest.g:925:72: 'boolean'
                    {
                    match("boolean"); 


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
    // $ANTLR end "RULE_DATA_TYPE"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSocialRequest.g:927:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalSocialRequest.g:927:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalSocialRequest.g:927:11: ( '^' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='^') ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalSocialRequest.g:927:11: '^'
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

            // InternalSocialRequest.g:927:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>='0' && LA7_0<='9')||(LA7_0>='A' && LA7_0<='Z')||LA7_0=='_'||(LA7_0>='a' && LA7_0<='z')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalSocialRequest.g:
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
            	    break loop7;
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
            // InternalSocialRequest.g:929:19: ( ( '0' .. '9' )+ )
            // InternalSocialRequest.g:929:21: ( '0' .. '9' )+
            {
            // InternalSocialRequest.g:929:21: ( '0' .. '9' )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='0' && LA8_0<='9')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalSocialRequest.g:929:22: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt8 >= 1 ) break loop8;
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
            } while (true);


            }

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
            // InternalSocialRequest.g:931:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalSocialRequest.g:931:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalSocialRequest.g:931:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='\"') ) {
                alt11=1;
            }
            else if ( (LA11_0=='\'') ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalSocialRequest.g:931:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalSocialRequest.g:931:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop9:
                    do {
                        int alt9=3;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0=='\\') ) {
                            alt9=1;
                        }
                        else if ( ((LA9_0>='\u0000' && LA9_0<='!')||(LA9_0>='#' && LA9_0<='[')||(LA9_0>=']' && LA9_0<='\uFFFF')) ) {
                            alt9=2;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalSocialRequest.g:931:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalSocialRequest.g:931:28: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop9;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalSocialRequest.g:931:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalSocialRequest.g:931:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop10:
                    do {
                        int alt10=3;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0=='\\') ) {
                            alt10=1;
                        }
                        else if ( ((LA10_0>='\u0000' && LA10_0<='&')||(LA10_0>='(' && LA10_0<='[')||(LA10_0>=']' && LA10_0<='\uFFFF')) ) {
                            alt10=2;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalSocialRequest.g:931:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalSocialRequest.g:931:61: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop10;
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
            // InternalSocialRequest.g:933:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalSocialRequest.g:933:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalSocialRequest.g:933:24: ( options {greedy=false; } : . )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0=='*') ) {
                    int LA12_1 = input.LA(2);

                    if ( (LA12_1=='/') ) {
                        alt12=2;
                    }
                    else if ( ((LA12_1>='\u0000' && LA12_1<='.')||(LA12_1>='0' && LA12_1<='\uFFFF')) ) {
                        alt12=1;
                    }


                }
                else if ( ((LA12_0>='\u0000' && LA12_0<=')')||(LA12_0>='+' && LA12_0<='\uFFFF')) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalSocialRequest.g:933:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop12;
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
            // InternalSocialRequest.g:935:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalSocialRequest.g:935:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalSocialRequest.g:935:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>='\u0000' && LA13_0<='\t')||(LA13_0>='\u000B' && LA13_0<='\f')||(LA13_0>='\u000E' && LA13_0<='\uFFFF')) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalSocialRequest.g:935:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop13;
                }
            } while (true);

            // InternalSocialRequest.g:935:40: ( ( '\\r' )? '\\n' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0=='\n'||LA15_0=='\r') ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalSocialRequest.g:935:41: ( '\\r' )? '\\n'
                    {
                    // InternalSocialRequest.g:935:41: ( '\\r' )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0=='\r') ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // InternalSocialRequest.g:935:41: '\\r'
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
            // InternalSocialRequest.g:937:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalSocialRequest.g:937:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalSocialRequest.g:937:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt16=0;
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>='\t' && LA16_0<='\n')||LA16_0=='\r'||LA16_0==' ') ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalSocialRequest.g:
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
            	    if ( cnt16 >= 1 ) break loop16;
                        EarlyExitException eee =
                            new EarlyExitException(16, input);
                        throw eee;
                }
                cnt16++;
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
            // InternalSocialRequest.g:939:16: ( . )
            // InternalSocialRequest.g:939:18: .
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
        // InternalSocialRequest.g:1:8: ( T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | RULE_POSSIBLY_SIGNED_INT | RULE_GENERATION_TYPE | RULE_FETCH_TYPE | RULE_ASSOCIATION | RULE_DATA_TYPE | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt17=33;
        alt17 = dfa17.predict(input);
        switch (alt17) {
            case 1 :
                // InternalSocialRequest.g:1:10: T__16
                {
                mT__16(); 

                }
                break;
            case 2 :
                // InternalSocialRequest.g:1:16: T__17
                {
                mT__17(); 

                }
                break;
            case 3 :
                // InternalSocialRequest.g:1:22: T__18
                {
                mT__18(); 

                }
                break;
            case 4 :
                // InternalSocialRequest.g:1:28: T__19
                {
                mT__19(); 

                }
                break;
            case 5 :
                // InternalSocialRequest.g:1:34: T__20
                {
                mT__20(); 

                }
                break;
            case 6 :
                // InternalSocialRequest.g:1:40: T__21
                {
                mT__21(); 

                }
                break;
            case 7 :
                // InternalSocialRequest.g:1:46: T__22
                {
                mT__22(); 

                }
                break;
            case 8 :
                // InternalSocialRequest.g:1:52: T__23
                {
                mT__23(); 

                }
                break;
            case 9 :
                // InternalSocialRequest.g:1:58: T__24
                {
                mT__24(); 

                }
                break;
            case 10 :
                // InternalSocialRequest.g:1:64: T__25
                {
                mT__25(); 

                }
                break;
            case 11 :
                // InternalSocialRequest.g:1:70: T__26
                {
                mT__26(); 

                }
                break;
            case 12 :
                // InternalSocialRequest.g:1:76: T__27
                {
                mT__27(); 

                }
                break;
            case 13 :
                // InternalSocialRequest.g:1:82: T__28
                {
                mT__28(); 

                }
                break;
            case 14 :
                // InternalSocialRequest.g:1:88: T__29
                {
                mT__29(); 

                }
                break;
            case 15 :
                // InternalSocialRequest.g:1:94: T__30
                {
                mT__30(); 

                }
                break;
            case 16 :
                // InternalSocialRequest.g:1:100: T__31
                {
                mT__31(); 

                }
                break;
            case 17 :
                // InternalSocialRequest.g:1:106: T__32
                {
                mT__32(); 

                }
                break;
            case 18 :
                // InternalSocialRequest.g:1:112: T__33
                {
                mT__33(); 

                }
                break;
            case 19 :
                // InternalSocialRequest.g:1:118: T__34
                {
                mT__34(); 

                }
                break;
            case 20 :
                // InternalSocialRequest.g:1:124: T__35
                {
                mT__35(); 

                }
                break;
            case 21 :
                // InternalSocialRequest.g:1:130: T__36
                {
                mT__36(); 

                }
                break;
            case 22 :
                // InternalSocialRequest.g:1:136: T__37
                {
                mT__37(); 

                }
                break;
            case 23 :
                // InternalSocialRequest.g:1:142: RULE_POSSIBLY_SIGNED_INT
                {
                mRULE_POSSIBLY_SIGNED_INT(); 

                }
                break;
            case 24 :
                // InternalSocialRequest.g:1:167: RULE_GENERATION_TYPE
                {
                mRULE_GENERATION_TYPE(); 

                }
                break;
            case 25 :
                // InternalSocialRequest.g:1:188: RULE_FETCH_TYPE
                {
                mRULE_FETCH_TYPE(); 

                }
                break;
            case 26 :
                // InternalSocialRequest.g:1:204: RULE_ASSOCIATION
                {
                mRULE_ASSOCIATION(); 

                }
                break;
            case 27 :
                // InternalSocialRequest.g:1:221: RULE_DATA_TYPE
                {
                mRULE_DATA_TYPE(); 

                }
                break;
            case 28 :
                // InternalSocialRequest.g:1:236: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 29 :
                // InternalSocialRequest.g:1:244: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 30 :
                // InternalSocialRequest.g:1:256: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 31 :
                // InternalSocialRequest.g:1:272: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 32 :
                // InternalSocialRequest.g:1:288: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 33 :
                // InternalSocialRequest.g:1:296: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA4 dfa4 = new DFA4(this);
    protected DFA17 dfa17 = new DFA17(this);
    static final String DFA4_eotS =
        "\24\uffff";
    static final String DFA4_eofS =
        "\24\uffff";
    static final String DFA4_minS =
        "\1\155\1\156\1\141\1\145\1\156\1\55\1\171\1\164\1\55\1\157\1\164\1\55\1\157\1\155\1\55\2\uffff\1\155\2\uffff";
    static final String DFA4_maxS =
        "\1\157\1\156\1\141\1\145\1\156\1\55\1\171\1\164\1\55\1\157\1\164\1\55\2\157\1\55\2\uffff\1\157\2\uffff";
    static final String DFA4_acceptS =
        "\17\uffff\1\1\1\3\1\uffff\1\2\1\4";
    static final String DFA4_specialS =
        "\24\uffff}>";
    static final String[] DFA4_transitionS = {
            "\1\2\1\uffff\1\1",
            "\1\3",
            "\1\4",
            "\1\5",
            "\1\6",
            "\1\7",
            "\1\10",
            "\1\11",
            "\1\12",
            "\1\13",
            "\1\14",
            "\1\15",
            "\1\16",
            "\1\17\1\uffff\1\20",
            "\1\21",
            "",
            "",
            "\1\23\1\uffff\1\22",
            "",
            ""
    };

    static final short[] DFA4_eot = DFA.unpackEncodedString(DFA4_eotS);
    static final short[] DFA4_eof = DFA.unpackEncodedString(DFA4_eofS);
    static final char[] DFA4_min = DFA.unpackEncodedStringToUnsignedChars(DFA4_minS);
    static final char[] DFA4_max = DFA.unpackEncodedStringToUnsignedChars(DFA4_maxS);
    static final short[] DFA4_accept = DFA.unpackEncodedString(DFA4_acceptS);
    static final short[] DFA4_special = DFA.unpackEncodedString(DFA4_specialS);
    static final short[][] DFA4_transition;

    static {
        int numStates = DFA4_transitionS.length;
        DFA4_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA4_transition[i] = DFA.unpackEncodedString(DFA4_transitionS[i]);
        }
    }

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = DFA4_eot;
            this.eof = DFA4_eof;
            this.min = DFA4_min;
            this.max = DFA4_max;
            this.accept = DFA4_accept;
            this.special = DFA4_special;
            this.transition = DFA4_transition;
        }
        public String getDescription() {
            return "923:20: ( 'one-to-many' | 'many-to-one' | 'one-to-one' | 'many-to-many' )";
        }
    }
    static final String DFA17_eotS =
        "\1\uffff\2\46\2\uffff\1\55\3\46\2\uffff\7\46\1\44\1\uffff\12\46\1\44\1\uffff\3\44\2\uffff\1\46\1\uffff\3\46\4\uffff\3\46\1\124\2\uffff\11\46\1\uffff\13\46\4\uffff\3\46\1\157\1\46\1\161\1\46\1\uffff\13\46\1\176\16\46\1\uffff\1\46\1\uffff\1\157\2\uffff\4\46\1\uffff\4\46\1\uffff\1\u0097\3\46\1\u009b\1\157\1\uffff\2\46\1\157\7\46\1\u00a5\2\uffff\1\46\1\157\1\46\1\u00a8\1\uffff\1\u0097\1\46\1\u009b\1\uffff\3\46\1\u00ad\5\46\2\uffff\1\46\1\uffff\1\46\2\157\1\46\1\uffff\7\46\1\157\1\46\1\u0097\2\46\1\uffff\1\46\1\u0097\2\46\1\uffff\3\46\1\u00c6\1\uffff\1\46\2\uffff";
    static final String DFA17_eofS =
        "\u00c8\uffff";
    static final String DFA17_minS =
        "\1\0\1\156\1\144\2\uffff\1\40\1\141\1\117\1\104\2\uffff\2\141\1\157\2\145\1\165\1\145\1\60\1\uffff\1\165\1\141\1\145\2\141\1\156\1\164\1\157\1\150\1\157\1\101\1\uffff\2\0\1\52\2\uffff\1\164\1\uffff\1\160\1\145\1\164\4\uffff\1\154\1\102\1\156\1\60\2\uffff\2\156\1\162\2\164\1\157\1\160\1\145\1\153\1\uffff\1\164\1\142\1\161\1\147\1\172\1\156\1\145\1\162\1\165\1\141\1\157\4\uffff\1\151\1\154\1\156\1\60\1\151\1\60\1\147\1\uffff\2\72\1\160\1\171\1\164\1\141\1\55\1\143\1\141\1\157\1\162\1\60\1\157\1\154\1\165\1\145\1\171\1\147\1\55\1\151\1\142\1\162\1\154\1\164\1\145\1\164\1\uffff\1\144\1\uffff\1\60\2\uffff\1\145\1\55\1\145\1\155\1\142\1\150\1\164\1\163\1\171\1\uffff\1\60\2\145\1\162\2\60\1\uffff\1\156\1\154\1\60\1\145\1\171\1\155\1\151\1\141\1\144\1\162\1\60\2\uffff\1\72\1\60\1\151\1\60\1\uffff\1\60\1\156\1\60\1\uffff\1\147\1\145\1\141\1\60\1\145\2\164\1\102\1\156\2\uffff\1\164\1\uffff\1\143\2\60\1\156\1\uffff\1\156\1\171\1\151\1\171\1\72\1\157\1\145\1\60\1\164\1\60\1\157\1\72\1\uffff\1\162\1\60\1\163\1\156\1\uffff\1\171\1\40\1\163\1\60\1\uffff\1\40\2\uffff";
    static final String DFA17_maxS =
        "\1\uffff\2\156\2\uffff\1\40\1\141\1\157\1\104\2\uffff\1\151\1\141\1\157\1\154\1\145\1\165\1\145\1\71\1\uffff\1\165\1\141\1\145\1\141\1\157\1\156\1\164\1\157\1\150\1\157\1\172\1\uffff\2\uffff\1\57\2\uffff\1\164\1\uffff\1\160\1\145\1\164\4\uffff\1\154\1\102\1\156\1\172\2\uffff\1\156\1\170\3\164\1\157\1\160\1\145\1\153\1\uffff\1\164\1\142\1\161\1\147\1\172\1\156\1\145\1\162\1\165\1\141\1\157\4\uffff\1\151\1\154\1\156\1\172\1\151\1\172\1\147\1\uffff\2\72\1\160\1\171\1\164\1\141\1\55\1\143\1\141\1\157\1\162\1\172\1\157\1\154\1\165\1\145\1\171\1\147\1\55\1\151\1\142\1\162\1\154\1\164\1\145\1\164\1\uffff\1\144\1\uffff\1\172\2\uffff\1\145\1\55\1\145\1\155\1\156\1\150\1\164\1\163\1\171\1\uffff\1\172\2\145\1\162\2\172\1\uffff\1\156\1\154\1\172\1\145\1\171\1\155\1\151\1\141\1\144\1\162\1\172\2\uffff\1\72\1\172\1\151\1\172\1\uffff\1\172\1\156\1\172\1\uffff\1\147\1\145\1\141\1\172\1\145\2\164\1\102\1\156\2\uffff\1\164\1\uffff\1\143\2\172\1\156\1\uffff\1\156\1\171\1\151\1\171\1\72\1\157\1\145\1\172\1\164\1\172\1\157\1\72\1\uffff\1\162\1\172\1\163\1\156\1\uffff\1\171\1\40\1\163\1\172\1\uffff\1\40\2\uffff";
    static final String DFA17_acceptS =
        "\3\uffff\1\3\1\4\4\uffff\1\11\1\12\10\uffff\1\27\13\uffff\1\34\3\uffff\1\40\1\41\1\uffff\1\34\3\uffff\1\3\1\4\1\24\1\5\4\uffff\1\11\1\12\11\uffff\1\27\13\uffff\1\35\1\36\1\37\1\40\7\uffff\1\10\32\uffff\1\33\1\uffff\1\7\1\uffff\1\13\1\14\11\uffff\1\26\6\uffff\1\32\13\uffff\1\16\1\17\4\uffff\1\30\3\uffff\1\31\11\uffff\1\25\1\21\1\uffff\1\23\4\uffff\1\1\14\uffff\1\15\4\uffff\1\20\4\uffff\1\2\1\uffff\1\22\1\6";
    static final String DFA17_specialS =
        "\1\2\37\uffff\1\0\1\1\u00a6\uffff}>";
    static final String[] DFA17_transitionS = {
            "\11\44\2\43\2\44\1\43\22\44\1\43\1\44\1\40\4\44\1\41\1\11\1\12\3\44\1\22\1\44\1\42\12\23\1\5\6\44\4\37\1\1\3\37\1\10\1\37\1\21\1\7\5\37\1\17\1\32\7\37\3\44\1\36\1\37\1\44\1\24\1\35\1\34\1\33\1\27\1\16\2\37\1\2\2\37\1\30\1\13\1\15\1\31\1\14\1\20\1\37\1\26\1\25\1\37\1\6\4\37\1\3\1\44\1\4\uff82\44",
            "\1\45",
            "\1\50\10\uffff\1\47\1\51",
            "",
            "",
            "\1\54",
            "\1\56",
            "\1\57\37\uffff\1\60",
            "\1\61",
            "",
            "",
            "\1\65\7\uffff\1\64",
            "\1\66",
            "\1\67",
            "\1\70\6\uffff\1\71",
            "\1\72",
            "\1\73",
            "\1\74",
            "\12\75",
            "",
            "\1\76",
            "\1\77",
            "\1\100",
            "\1\101",
            "\1\102\15\uffff\1\103",
            "\1\104",
            "\1\105",
            "\1\106",
            "\1\107",
            "\1\110",
            "\32\46\4\uffff\1\46\1\uffff\32\46",
            "",
            "\0\111",
            "\0\111",
            "\1\112\4\uffff\1\113",
            "",
            "",
            "\1\115",
            "",
            "\1\116",
            "\1\117",
            "\1\120",
            "",
            "",
            "",
            "",
            "\1\121",
            "\1\122",
            "\1\123",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "",
            "",
            "\1\125",
            "\1\130\1\uffff\1\127\7\uffff\1\126",
            "\1\132\1\uffff\1\131",
            "\1\133",
            "\1\134",
            "\1\135",
            "\1\136",
            "\1\137",
            "\1\140",
            "",
            "\1\141",
            "\1\142",
            "\1\143",
            "\1\144",
            "\1\145",
            "\1\146",
            "\1\147",
            "\1\150",
            "\1\151",
            "\1\152",
            "\1\153",
            "",
            "",
            "",
            "",
            "\1\154",
            "\1\155",
            "\1\156",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\160",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\162",
            "",
            "\1\163",
            "\1\164",
            "\1\165",
            "\1\166",
            "\1\167",
            "\1\170",
            "\1\171",
            "\1\172",
            "\1\173",
            "\1\174",
            "\1\175",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\177",
            "\1\u0080",
            "\1\u0081",
            "\1\u0082",
            "\1\u0083",
            "\1\u0084",
            "\1\u0085",
            "\1\u0086",
            "\1\u0087",
            "\1\u0088",
            "\1\u0089",
            "\1\u008a",
            "\1\u008b",
            "\1\u008c",
            "",
            "\1\u008d",
            "",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "",
            "",
            "\1\u008e",
            "\1\u0085",
            "\1\u008f",
            "\1\u0090",
            "\1\u0092\13\uffff\1\u0091",
            "\1\u0093",
            "\1\u0094",
            "\1\u0095",
            "\1\u0096",
            "",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u0098",
            "\1\u0099",
            "\1\u009a",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "",
            "\1\u009c",
            "\1\u009d",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u009e",
            "\1\u009f",
            "\1\u00a0",
            "\1\u00a1",
            "\1\u00a2",
            "\1\u00a3",
            "\1\u00a4",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "",
            "",
            "\1\u00a6",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u00a7",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u00a9",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "",
            "\1\u00aa",
            "\1\u00ab",
            "\1\u00ac",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u00ae",
            "\1\u00af",
            "\1\u00b0",
            "\1\u00b1",
            "\1\u00b2",
            "",
            "",
            "\1\u00b3",
            "",
            "\1\u00b4",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u00b5",
            "",
            "\1\u00b6",
            "\1\u00b7",
            "\1\u00b8",
            "\1\u00b9",
            "\1\u00ba",
            "\1\u00bb",
            "\1\u00bc",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u00bd",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u00be",
            "\1\u00bf",
            "",
            "\1\u00c0",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u00c1",
            "\1\u00c2",
            "",
            "\1\u00c3",
            "\1\u00c4",
            "\1\u00c5",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "",
            "\1\u00c7",
            "",
            ""
    };

    static final short[] DFA17_eot = DFA.unpackEncodedString(DFA17_eotS);
    static final short[] DFA17_eof = DFA.unpackEncodedString(DFA17_eofS);
    static final char[] DFA17_min = DFA.unpackEncodedStringToUnsignedChars(DFA17_minS);
    static final char[] DFA17_max = DFA.unpackEncodedStringToUnsignedChars(DFA17_maxS);
    static final short[] DFA17_accept = DFA.unpackEncodedString(DFA17_acceptS);
    static final short[] DFA17_special = DFA.unpackEncodedString(DFA17_specialS);
    static final short[][] DFA17_transition;

    static {
        int numStates = DFA17_transitionS.length;
        DFA17_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA17_transition[i] = DFA.unpackEncodedString(DFA17_transitionS[i]);
        }
    }

    class DFA17 extends DFA {

        public DFA17(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 17;
            this.eot = DFA17_eot;
            this.eof = DFA17_eof;
            this.min = DFA17_min;
            this.max = DFA17_max;
            this.accept = DFA17_accept;
            this.special = DFA17_special;
            this.transition = DFA17_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | RULE_POSSIBLY_SIGNED_INT | RULE_GENERATION_TYPE | RULE_FETCH_TYPE | RULE_ASSOCIATION | RULE_DATA_TYPE | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA17_32 = input.LA(1);

                        s = -1;
                        if ( ((LA17_32>='\u0000' && LA17_32<='\uFFFF')) ) {s = 73;}

                        else s = 36;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA17_33 = input.LA(1);

                        s = -1;
                        if ( ((LA17_33>='\u0000' && LA17_33<='\uFFFF')) ) {s = 73;}

                        else s = 36;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA17_0 = input.LA(1);

                        s = -1;
                        if ( (LA17_0=='E') ) {s = 1;}

                        else if ( (LA17_0=='i') ) {s = 2;}

                        else if ( (LA17_0=='{') ) {s = 3;}

                        else if ( (LA17_0=='}') ) {s = 4;}

                        else if ( (LA17_0==':') ) {s = 5;}

                        else if ( (LA17_0=='v') ) {s = 6;}

                        else if ( (LA17_0=='L') ) {s = 7;}

                        else if ( (LA17_0=='I') ) {s = 8;}

                        else if ( (LA17_0=='(') ) {s = 9;}

                        else if ( (LA17_0==')') ) {s = 10;}

                        else if ( (LA17_0=='m') ) {s = 11;}

                        else if ( (LA17_0=='p') ) {s = 12;}

                        else if ( (LA17_0=='n') ) {s = 13;}

                        else if ( (LA17_0=='f') ) {s = 14;}

                        else if ( (LA17_0=='R') ) {s = 15;}

                        else if ( (LA17_0=='q') ) {s = 16;}

                        else if ( (LA17_0=='K') ) {s = 17;}

                        else if ( (LA17_0=='-') ) {s = 18;}

                        else if ( ((LA17_0>='0' && LA17_0<='9')) ) {s = 19;}

                        else if ( (LA17_0=='a') ) {s = 20;}

                        else if ( (LA17_0=='t') ) {s = 21;}

                        else if ( (LA17_0=='s') ) {s = 22;}

                        else if ( (LA17_0=='e') ) {s = 23;}

                        else if ( (LA17_0=='l') ) {s = 24;}

                        else if ( (LA17_0=='o') ) {s = 25;}

                        else if ( (LA17_0=='S') ) {s = 26;}

                        else if ( (LA17_0=='d') ) {s = 27;}

                        else if ( (LA17_0=='c') ) {s = 28;}

                        else if ( (LA17_0=='b') ) {s = 29;}

                        else if ( (LA17_0=='^') ) {s = 30;}

                        else if ( ((LA17_0>='A' && LA17_0<='D')||(LA17_0>='F' && LA17_0<='H')||LA17_0=='J'||(LA17_0>='M' && LA17_0<='Q')||(LA17_0>='T' && LA17_0<='Z')||LA17_0=='_'||(LA17_0>='g' && LA17_0<='h')||(LA17_0>='j' && LA17_0<='k')||LA17_0=='r'||LA17_0=='u'||(LA17_0>='w' && LA17_0<='z')) ) {s = 31;}

                        else if ( (LA17_0=='\"') ) {s = 32;}

                        else if ( (LA17_0=='\'') ) {s = 33;}

                        else if ( (LA17_0=='/') ) {s = 34;}

                        else if ( ((LA17_0>='\t' && LA17_0<='\n')||LA17_0=='\r'||LA17_0==' ') ) {s = 35;}

                        else if ( ((LA17_0>='\u0000' && LA17_0<='\b')||(LA17_0>='\u000B' && LA17_0<='\f')||(LA17_0>='\u000E' && LA17_0<='\u001F')||LA17_0=='!'||(LA17_0>='#' && LA17_0<='&')||(LA17_0>='*' && LA17_0<=',')||LA17_0=='.'||(LA17_0>=';' && LA17_0<='@')||(LA17_0>='[' && LA17_0<=']')||LA17_0=='`'||LA17_0=='|'||(LA17_0>='~' && LA17_0<='\uFFFF')) ) {s = 36;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 17, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}