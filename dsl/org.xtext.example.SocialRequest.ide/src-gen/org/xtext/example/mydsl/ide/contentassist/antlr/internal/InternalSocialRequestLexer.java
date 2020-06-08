package org.xtext.example.mydsl.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSocialRequestLexer extends Lexer {
    public static final int T__19=19;
    public static final int RULE_POSSIBLY_SIGNED_INT=9;
    public static final int RULE_GENERATION_TYPE=8;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int RULE_FETCH_TYPE=7;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=12;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=13;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int RULE_JOIN_TYPE=11;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=10;
    public static final int RULE_DATA_TYPE=6;
    public static final int RULE_SL_COMMENT=14;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int RULE_ASSOCIATION=5;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=15;
    public static final int RULE_ANY_OTHER=16;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

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

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
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
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSocialRequest.g:12:7: ( '{' )
            // InternalSocialRequest.g:12:9: '{'
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
            // InternalSocialRequest.g:13:7: ( '}' )
            // InternalSocialRequest.g:13:9: '}'
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
            // InternalSocialRequest.g:14:7: ( ':' )
            // InternalSocialRequest.g:14:9: ':'
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
            // InternalSocialRequest.g:15:7: ( 'mappedBy:' )
            // InternalSocialRequest.g:15:9: 'mappedBy:'
            {
            match("mappedBy:"); 


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
            // InternalSocialRequest.g:16:7: ( 'fetch:' )
            // InternalSocialRequest.g:16:9: 'fetch:'
            {
            match("fetch:"); 


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
            // InternalSocialRequest.g:17:7: ( 'validations {' )
            // InternalSocialRequest.g:17:9: 'validations {'
            {
            match("validations {"); 


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
            // InternalSocialRequest.g:18:7: ( 'LOB' )
            // InternalSocialRequest.g:18:9: 'LOB'
            {
            match("LOB"); 


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
            // InternalSocialRequest.g:19:7: ( 'ID' )
            // InternalSocialRequest.g:19:9: 'ID'
            {
            match("ID"); 


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
            // InternalSocialRequest.g:20:7: ( '(' )
            // InternalSocialRequest.g:20:9: '('
            {
            match('('); 

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
            // InternalSocialRequest.g:21:7: ( ')' )
            // InternalSocialRequest.g:21:9: ')'
            {
            match(')'); 

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
            // InternalSocialRequest.g:22:7: ( 'min:' )
            // InternalSocialRequest.g:22:9: 'min:'
            {
            match("min:"); 


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
            // InternalSocialRequest.g:23:7: ( 'max:' )
            // InternalSocialRequest.g:23:9: 'max:'
            {
            match("max:"); 


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
            // InternalSocialRequest.g:24:7: ( 'pattern:' )
            // InternalSocialRequest.g:24:9: 'pattern:'
            {
            match("pattern:"); 


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
            // InternalSocialRequest.g:25:7: ( 'not-null' )
            // InternalSocialRequest.g:25:9: 'not-null'
            {
            match("not-null"); 


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
            // InternalSocialRequest.g:26:7: ( 'not-blank' )
            // InternalSocialRequest.g:26:9: 'not-blank'
            {
            match("not-blank"); 


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
            // InternalSocialRequest.g:27:7: ( 'Repository' )
            // InternalSocialRequest.g:27:9: 'Repository'
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
            // InternalSocialRequest.g:28:7: ( 'query' )
            // InternalSocialRequest.g:28:9: 'query'
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
            // InternalSocialRequest.g:29:7: ( 'params {' )
            // InternalSocialRequest.g:29:9: 'params {'
            {
            match("params {"); 


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
            // InternalSocialRequest.g:30:7: ( 'SELECT' )
            // InternalSocialRequest.g:30:9: 'SELECT'
            {
            match("SELECT"); 


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
            // InternalSocialRequest.g:31:7: ( 'FROM {' )
            // InternalSocialRequest.g:31:9: 'FROM {'
            {
            match("FROM {"); 


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
            // InternalSocialRequest.g:32:7: ( 'ON {' )
            // InternalSocialRequest.g:32:9: 'ON {'
            {
            match("ON {"); 


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
            // InternalSocialRequest.g:33:7: ( 'WHERE {' )
            // InternalSocialRequest.g:33:9: 'WHERE {'
            {
            match("WHERE {"); 


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
            // InternalSocialRequest.g:34:7: ( 'ORDER BY {' )
            // InternalSocialRequest.g:34:9: 'ORDER BY {'
            {
            match("ORDER BY {"); 


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
            // InternalSocialRequest.g:35:7: ( 'implements UserDetails' )
            // InternalSocialRequest.g:35:9: 'implements UserDetails'
            {
            match("implements UserDetails"); 


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
            // InternalSocialRequest.g:36:7: ( ': list' )
            // InternalSocialRequest.g:36:9: ': list'
            {
            match(": list"); 


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
            // InternalSocialRequest.g:37:7: ( 'DISTINCT' )
            // InternalSocialRequest.g:37:9: 'DISTINCT'
            {
            match("DISTINCT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "RULE_POSSIBLY_SIGNED_INT"
    public final void mRULE_POSSIBLY_SIGNED_INT() throws RecognitionException {
        try {
            int _type = RULE_POSSIBLY_SIGNED_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSocialRequest.g:3665:26: ( ( '-' )? RULE_INT )
            // InternalSocialRequest.g:3665:28: ( '-' )? RULE_INT
            {
            // InternalSocialRequest.g:3665:28: ( '-' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='-') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalSocialRequest.g:3665:28: '-'
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
            // InternalSocialRequest.g:3667:22: ( ( 'auto' | 'table' | 'identity' | 'sequence' ) )
            // InternalSocialRequest.g:3667:24: ( 'auto' | 'table' | 'identity' | 'sequence' )
            {
            // InternalSocialRequest.g:3667:24: ( 'auto' | 'table' | 'identity' | 'sequence' )
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
                    // InternalSocialRequest.g:3667:25: 'auto'
                    {
                    match("auto"); 


                    }
                    break;
                case 2 :
                    // InternalSocialRequest.g:3667:32: 'table'
                    {
                    match("table"); 


                    }
                    break;
                case 3 :
                    // InternalSocialRequest.g:3667:40: 'identity'
                    {
                    match("identity"); 


                    }
                    break;
                case 4 :
                    // InternalSocialRequest.g:3667:51: 'sequence'
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
            // InternalSocialRequest.g:3669:17: ( ( 'eager' | 'lazy' ) )
            // InternalSocialRequest.g:3669:19: ( 'eager' | 'lazy' )
            {
            // InternalSocialRequest.g:3669:19: ( 'eager' | 'lazy' )
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
                    // InternalSocialRequest.g:3669:20: 'eager'
                    {
                    match("eager"); 


                    }
                    break;
                case 2 :
                    // InternalSocialRequest.g:3669:28: 'lazy'
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
            // InternalSocialRequest.g:3671:18: ( ( 'one-to-many' | 'many-to-one' | 'one-to-one' | 'many-to-many' ) )
            // InternalSocialRequest.g:3671:20: ( 'one-to-many' | 'many-to-one' | 'one-to-one' | 'many-to-many' )
            {
            // InternalSocialRequest.g:3671:20: ( 'one-to-many' | 'many-to-one' | 'one-to-one' | 'many-to-many' )
            int alt4=4;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // InternalSocialRequest.g:3671:21: 'one-to-many'
                    {
                    match("one-to-many"); 


                    }
                    break;
                case 2 :
                    // InternalSocialRequest.g:3671:35: 'many-to-one'
                    {
                    match("many-to-one"); 


                    }
                    break;
                case 3 :
                    // InternalSocialRequest.g:3671:49: 'one-to-one'
                    {
                    match("one-to-one"); 


                    }
                    break;
                case 4 :
                    // InternalSocialRequest.g:3671:62: 'many-to-many'
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
            // InternalSocialRequest.g:3673:16: ( ( 'String' | 'long' | 'Long' | 'float' | 'double' | 'char' | 'int' | 'boolean' ) )
            // InternalSocialRequest.g:3673:18: ( 'String' | 'long' | 'Long' | 'float' | 'double' | 'char' | 'int' | 'boolean' )
            {
            // InternalSocialRequest.g:3673:18: ( 'String' | 'long' | 'Long' | 'float' | 'double' | 'char' | 'int' | 'boolean' )
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
                    // InternalSocialRequest.g:3673:19: 'String'
                    {
                    match("String"); 


                    }
                    break;
                case 2 :
                    // InternalSocialRequest.g:3673:28: 'long'
                    {
                    match("long"); 


                    }
                    break;
                case 3 :
                    // InternalSocialRequest.g:3673:35: 'Long'
                    {
                    match("Long"); 


                    }
                    break;
                case 4 :
                    // InternalSocialRequest.g:3673:42: 'float'
                    {
                    match("float"); 


                    }
                    break;
                case 5 :
                    // InternalSocialRequest.g:3673:50: 'double'
                    {
                    match("double"); 


                    }
                    break;
                case 6 :
                    // InternalSocialRequest.g:3673:59: 'char'
                    {
                    match("char"); 


                    }
                    break;
                case 7 :
                    // InternalSocialRequest.g:3673:66: 'int'
                    {
                    match("int"); 


                    }
                    break;
                case 8 :
                    // InternalSocialRequest.g:3673:72: 'boolean'
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

    // $ANTLR start "RULE_JOIN_TYPE"
    public final void mRULE_JOIN_TYPE() throws RecognitionException {
        try {
            int _type = RULE_JOIN_TYPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSocialRequest.g:3675:16: ( ( 'LEFT JOIN' | 'LEFT OUTER JOIN' | 'CROSS JOIN' | 'JOIN' ) )
            // InternalSocialRequest.g:3675:18: ( 'LEFT JOIN' | 'LEFT OUTER JOIN' | 'CROSS JOIN' | 'JOIN' )
            {
            // InternalSocialRequest.g:3675:18: ( 'LEFT JOIN' | 'LEFT OUTER JOIN' | 'CROSS JOIN' | 'JOIN' )
            int alt6=4;
            alt6 = dfa6.predict(input);
            switch (alt6) {
                case 1 :
                    // InternalSocialRequest.g:3675:19: 'LEFT JOIN'
                    {
                    match("LEFT JOIN"); 


                    }
                    break;
                case 2 :
                    // InternalSocialRequest.g:3675:31: 'LEFT OUTER JOIN'
                    {
                    match("LEFT OUTER JOIN"); 


                    }
                    break;
                case 3 :
                    // InternalSocialRequest.g:3675:49: 'CROSS JOIN'
                    {
                    match("CROSS JOIN"); 


                    }
                    break;
                case 4 :
                    // InternalSocialRequest.g:3675:62: 'JOIN'
                    {
                    match("JOIN"); 


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
    // $ANTLR end "RULE_JOIN_TYPE"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSocialRequest.g:3677:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalSocialRequest.g:3677:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalSocialRequest.g:3677:11: ( '^' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='^') ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalSocialRequest.g:3677:11: '^'
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

            // InternalSocialRequest.g:3677:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='0' && LA8_0<='9')||(LA8_0>='A' && LA8_0<='Z')||LA8_0=='_'||(LA8_0>='a' && LA8_0<='z')) ) {
                    alt8=1;
                }


                switch (alt8) {
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
            	    break loop8;
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
            // InternalSocialRequest.g:3679:19: ( ( '0' .. '9' )+ )
            // InternalSocialRequest.g:3679:21: ( '0' .. '9' )+
            {
            // InternalSocialRequest.g:3679:21: ( '0' .. '9' )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='0' && LA9_0<='9')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalSocialRequest.g:3679:22: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt9 >= 1 ) break loop9;
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
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
            // InternalSocialRequest.g:3681:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalSocialRequest.g:3681:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalSocialRequest.g:3681:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='\"') ) {
                alt12=1;
            }
            else if ( (LA12_0=='\'') ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalSocialRequest.g:3681:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalSocialRequest.g:3681:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop10:
                    do {
                        int alt10=3;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0=='\\') ) {
                            alt10=1;
                        }
                        else if ( ((LA10_0>='\u0000' && LA10_0<='!')||(LA10_0>='#' && LA10_0<='[')||(LA10_0>=']' && LA10_0<='\uFFFF')) ) {
                            alt10=2;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalSocialRequest.g:3681:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalSocialRequest.g:3681:28: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop10;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalSocialRequest.g:3681:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalSocialRequest.g:3681:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop11:
                    do {
                        int alt11=3;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0=='\\') ) {
                            alt11=1;
                        }
                        else if ( ((LA11_0>='\u0000' && LA11_0<='&')||(LA11_0>='(' && LA11_0<='[')||(LA11_0>=']' && LA11_0<='\uFFFF')) ) {
                            alt11=2;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // InternalSocialRequest.g:3681:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalSocialRequest.g:3681:61: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop11;
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
            // InternalSocialRequest.g:3683:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalSocialRequest.g:3683:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalSocialRequest.g:3683:24: ( options {greedy=false; } : . )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0=='*') ) {
                    int LA13_1 = input.LA(2);

                    if ( (LA13_1=='/') ) {
                        alt13=2;
                    }
                    else if ( ((LA13_1>='\u0000' && LA13_1<='.')||(LA13_1>='0' && LA13_1<='\uFFFF')) ) {
                        alt13=1;
                    }


                }
                else if ( ((LA13_0>='\u0000' && LA13_0<=')')||(LA13_0>='+' && LA13_0<='\uFFFF')) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalSocialRequest.g:3683:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop13;
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
            // InternalSocialRequest.g:3685:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalSocialRequest.g:3685:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalSocialRequest.g:3685:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>='\u0000' && LA14_0<='\t')||(LA14_0>='\u000B' && LA14_0<='\f')||(LA14_0>='\u000E' && LA14_0<='\uFFFF')) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalSocialRequest.g:3685:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop14;
                }
            } while (true);

            // InternalSocialRequest.g:3685:40: ( ( '\\r' )? '\\n' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0=='\n'||LA16_0=='\r') ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalSocialRequest.g:3685:41: ( '\\r' )? '\\n'
                    {
                    // InternalSocialRequest.g:3685:41: ( '\\r' )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0=='\r') ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // InternalSocialRequest.g:3685:41: '\\r'
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
            // InternalSocialRequest.g:3687:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalSocialRequest.g:3687:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalSocialRequest.g:3687:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt17=0;
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>='\t' && LA17_0<='\n')||LA17_0=='\r'||LA17_0==' ') ) {
                    alt17=1;
                }


                switch (alt17) {
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
            	    if ( cnt17 >= 1 ) break loop17;
                        EarlyExitException eee =
                            new EarlyExitException(17, input);
                        throw eee;
                }
                cnt17++;
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
            // InternalSocialRequest.g:3689:16: ( . )
            // InternalSocialRequest.g:3689:18: .
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
        // InternalSocialRequest.g:1:8: ( T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | RULE_POSSIBLY_SIGNED_INT | RULE_GENERATION_TYPE | RULE_FETCH_TYPE | RULE_ASSOCIATION | RULE_DATA_TYPE | RULE_JOIN_TYPE | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt18=39;
        alt18 = dfa18.predict(input);
        switch (alt18) {
            case 1 :
                // InternalSocialRequest.g:1:10: T__17
                {
                mT__17(); 

                }
                break;
            case 2 :
                // InternalSocialRequest.g:1:16: T__18
                {
                mT__18(); 

                }
                break;
            case 3 :
                // InternalSocialRequest.g:1:22: T__19
                {
                mT__19(); 

                }
                break;
            case 4 :
                // InternalSocialRequest.g:1:28: T__20
                {
                mT__20(); 

                }
                break;
            case 5 :
                // InternalSocialRequest.g:1:34: T__21
                {
                mT__21(); 

                }
                break;
            case 6 :
                // InternalSocialRequest.g:1:40: T__22
                {
                mT__22(); 

                }
                break;
            case 7 :
                // InternalSocialRequest.g:1:46: T__23
                {
                mT__23(); 

                }
                break;
            case 8 :
                // InternalSocialRequest.g:1:52: T__24
                {
                mT__24(); 

                }
                break;
            case 9 :
                // InternalSocialRequest.g:1:58: T__25
                {
                mT__25(); 

                }
                break;
            case 10 :
                // InternalSocialRequest.g:1:64: T__26
                {
                mT__26(); 

                }
                break;
            case 11 :
                // InternalSocialRequest.g:1:70: T__27
                {
                mT__27(); 

                }
                break;
            case 12 :
                // InternalSocialRequest.g:1:76: T__28
                {
                mT__28(); 

                }
                break;
            case 13 :
                // InternalSocialRequest.g:1:82: T__29
                {
                mT__29(); 

                }
                break;
            case 14 :
                // InternalSocialRequest.g:1:88: T__30
                {
                mT__30(); 

                }
                break;
            case 15 :
                // InternalSocialRequest.g:1:94: T__31
                {
                mT__31(); 

                }
                break;
            case 16 :
                // InternalSocialRequest.g:1:100: T__32
                {
                mT__32(); 

                }
                break;
            case 17 :
                // InternalSocialRequest.g:1:106: T__33
                {
                mT__33(); 

                }
                break;
            case 18 :
                // InternalSocialRequest.g:1:112: T__34
                {
                mT__34(); 

                }
                break;
            case 19 :
                // InternalSocialRequest.g:1:118: T__35
                {
                mT__35(); 

                }
                break;
            case 20 :
                // InternalSocialRequest.g:1:124: T__36
                {
                mT__36(); 

                }
                break;
            case 21 :
                // InternalSocialRequest.g:1:130: T__37
                {
                mT__37(); 

                }
                break;
            case 22 :
                // InternalSocialRequest.g:1:136: T__38
                {
                mT__38(); 

                }
                break;
            case 23 :
                // InternalSocialRequest.g:1:142: T__39
                {
                mT__39(); 

                }
                break;
            case 24 :
                // InternalSocialRequest.g:1:148: T__40
                {
                mT__40(); 

                }
                break;
            case 25 :
                // InternalSocialRequest.g:1:154: T__41
                {
                mT__41(); 

                }
                break;
            case 26 :
                // InternalSocialRequest.g:1:160: T__42
                {
                mT__42(); 

                }
                break;
            case 27 :
                // InternalSocialRequest.g:1:166: T__43
                {
                mT__43(); 

                }
                break;
            case 28 :
                // InternalSocialRequest.g:1:172: RULE_POSSIBLY_SIGNED_INT
                {
                mRULE_POSSIBLY_SIGNED_INT(); 

                }
                break;
            case 29 :
                // InternalSocialRequest.g:1:197: RULE_GENERATION_TYPE
                {
                mRULE_GENERATION_TYPE(); 

                }
                break;
            case 30 :
                // InternalSocialRequest.g:1:218: RULE_FETCH_TYPE
                {
                mRULE_FETCH_TYPE(); 

                }
                break;
            case 31 :
                // InternalSocialRequest.g:1:234: RULE_ASSOCIATION
                {
                mRULE_ASSOCIATION(); 

                }
                break;
            case 32 :
                // InternalSocialRequest.g:1:251: RULE_DATA_TYPE
                {
                mRULE_DATA_TYPE(); 

                }
                break;
            case 33 :
                // InternalSocialRequest.g:1:266: RULE_JOIN_TYPE
                {
                mRULE_JOIN_TYPE(); 

                }
                break;
            case 34 :
                // InternalSocialRequest.g:1:281: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 35 :
                // InternalSocialRequest.g:1:289: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 36 :
                // InternalSocialRequest.g:1:301: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 37 :
                // InternalSocialRequest.g:1:317: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 38 :
                // InternalSocialRequest.g:1:333: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 39 :
                // InternalSocialRequest.g:1:341: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA4 dfa4 = new DFA4(this);
    protected DFA6 dfa6 = new DFA6(this);
    protected DFA18 dfa18 = new DFA18(this);
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
            return "3671:20: ( 'one-to-many' | 'many-to-one' | 'one-to-one' | 'many-to-many' )";
        }
    }
    static final String DFA6_eotS =
        "\12\uffff";
    static final String DFA6_eofS =
        "\12\uffff";
    static final String DFA6_minS =
        "\1\103\1\105\2\uffff\1\106\1\124\1\40\1\112\2\uffff";
    static final String DFA6_maxS =
        "\1\114\1\105\2\uffff\1\106\1\124\1\40\1\117\2\uffff";
    static final String DFA6_acceptS =
        "\2\uffff\1\3\1\4\4\uffff\1\1\1\2";
    static final String DFA6_specialS =
        "\12\uffff}>";
    static final String[] DFA6_transitionS = {
            "\1\2\6\uffff\1\3\1\uffff\1\1",
            "\1\4",
            "",
            "",
            "\1\5",
            "\1\6",
            "\1\7",
            "\1\10\4\uffff\1\11",
            "",
            ""
    };

    static final short[] DFA6_eot = DFA.unpackEncodedString(DFA6_eotS);
    static final short[] DFA6_eof = DFA.unpackEncodedString(DFA6_eofS);
    static final char[] DFA6_min = DFA.unpackEncodedStringToUnsignedChars(DFA6_minS);
    static final char[] DFA6_max = DFA.unpackEncodedStringToUnsignedChars(DFA6_maxS);
    static final short[] DFA6_accept = DFA.unpackEncodedString(DFA6_acceptS);
    static final short[] DFA6_special = DFA.unpackEncodedString(DFA6_specialS);
    static final short[][] DFA6_transition;

    static {
        int numStates = DFA6_transitionS.length;
        DFA6_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA6_transition[i] = DFA.unpackEncodedString(DFA6_transitionS[i]);
        }
    }

    class DFA6 extends DFA {

        public DFA6(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 6;
            this.eot = DFA6_eot;
            this.eof = DFA6_eof;
            this.min = DFA6_min;
            this.max = DFA6_max;
            this.accept = DFA6_accept;
            this.special = DFA6_special;
            this.transition = DFA6_transition;
        }
        public String getDescription() {
            return "3675:18: ( 'LEFT JOIN' | 'LEFT OUTER JOIN' | 'CROSS JOIN' | 'JOIN' )";
        }
    }
    static final String DFA18_eotS =
        "\1\uffff\1\53\2\uffff\1\57\5\53\2\uffff\12\53\1\51\1\uffff\13\53\1\51\1\uffff\3\51\2\uffff\1\53\5\uffff\10\53\1\145\2\uffff\16\53\1\uffff\14\53\4\uffff\10\53\1\u0089\2\53\1\uffff\10\53\1\uffff\4\53\1\u0098\17\53\1\uffff\1\53\1\uffff\3\53\1\uffff\1\u0098\3\53\1\uffff\11\53\1\uffff\1\53\1\u00ba\3\53\1\u00be\1\u0098\1\uffff\1\53\1\u0098\2\53\1\u00ab\3\53\1\u0098\1\53\1\uffff\2\53\2\uffff\1\53\1\u00c9\2\53\1\uffff\5\53\1\uffff\1\u00ba\1\53\1\u00be\1\uffff\3\53\1\u00d4\1\53\1\uffff\4\53\1\uffff\1\u00da\1\u0098\2\uffff\4\53\1\u0098\1\53\1\uffff\3\53\1\uffff\1\53\1\uffff\4\53\1\u0098\2\53\1\uffff\2\53\1\u00ba\1\u00ec\1\u00ba\1\uffff\3\53\1\uffff\1\53\1\u00f1\2\53\3\uffff";
    static final String DFA18_eofS =
        "\u00f4\uffff";
    static final String DFA18_minS =
        "\1\0\1\156\2\uffff\1\40\1\141\1\145\1\141\1\105\1\104\2\uffff\1\141\1\157\1\145\1\165\1\105\1\122\1\116\1\110\1\144\1\111\1\60\1\uffff\1\165\1\141\1\145\2\141\1\156\1\157\1\150\1\157\1\122\1\117\1\101\1\uffff\2\0\1\52\2\uffff\1\164\5\uffff\2\156\1\164\1\157\1\154\1\102\1\156\1\106\1\60\2\uffff\1\162\1\164\1\160\1\145\1\114\1\162\1\117\1\40\1\104\1\105\1\160\1\145\1\164\1\123\1\uffff\1\164\1\142\1\161\1\147\1\172\1\156\1\145\1\165\1\141\1\157\1\117\1\111\4\uffff\1\151\1\160\1\72\1\171\1\72\1\143\1\141\1\151\1\60\1\147\1\124\1\uffff\1\164\1\141\1\55\1\157\1\162\1\105\1\151\1\115\1\uffff\1\105\1\122\1\154\1\156\1\60\1\124\1\157\1\154\1\165\1\145\1\171\1\147\1\55\1\142\1\162\1\154\1\123\1\116\1\164\1\145\1\uffff\1\55\1\uffff\1\150\1\164\1\144\1\uffff\1\60\1\40\1\145\1\155\1\142\1\163\1\171\1\103\1\156\1\40\1\122\1\105\1\145\1\164\1\uffff\1\111\1\60\2\145\1\162\2\60\1\uffff\1\154\1\60\1\145\1\123\1\60\1\171\1\144\1\72\1\60\1\141\1\uffff\1\162\1\163\2\uffff\1\151\1\60\1\124\1\147\1\uffff\2\40\1\155\1\151\1\116\1\uffff\1\60\1\156\1\60\1\uffff\1\145\1\141\1\40\1\60\1\102\1\uffff\1\164\1\156\1\40\1\164\1\uffff\2\60\2\uffff\1\145\1\164\1\103\1\143\1\60\1\156\1\uffff\1\171\1\151\1\72\1\uffff\1\157\1\uffff\1\156\1\171\1\124\1\145\1\60\1\72\1\157\1\uffff\1\162\1\164\3\60\1\uffff\1\156\1\171\1\163\1\uffff\1\163\1\60\2\40\3\uffff";
    static final String DFA18_maxS =
        "\1\uffff\1\156\2\uffff\1\40\1\151\1\154\1\141\1\157\1\104\2\uffff\1\141\1\157\1\145\1\165\1\164\2\122\1\110\1\156\1\111\1\71\1\uffff\1\165\1\141\1\145\1\141\1\157\1\156\1\157\1\150\1\157\1\122\1\117\1\172\1\uffff\2\uffff\1\57\2\uffff\1\164\5\uffff\1\170\1\156\1\164\1\157\1\154\1\102\1\156\1\106\1\172\2\uffff\2\164\1\160\1\145\1\114\1\162\1\117\1\40\1\104\1\105\1\160\1\145\1\164\1\123\1\uffff\1\164\1\142\1\161\1\147\1\172\1\156\1\145\1\165\1\141\1\157\1\117\1\111\4\uffff\1\151\1\160\1\72\1\171\1\72\1\143\1\141\1\151\1\172\1\147\1\124\1\uffff\1\164\1\141\1\55\1\157\1\162\1\105\1\151\1\115\1\uffff\1\105\1\122\1\154\1\156\1\172\1\124\1\157\1\154\1\165\1\145\1\171\1\147\1\55\1\142\1\162\1\154\1\123\1\116\1\164\1\145\1\uffff\1\55\1\uffff\1\150\1\164\1\144\1\uffff\1\172\1\40\1\145\1\155\1\156\1\163\1\171\1\103\1\156\1\40\1\122\1\105\1\145\1\164\1\uffff\1\111\1\172\2\145\1\162\2\172\1\uffff\1\154\1\172\1\145\1\123\1\172\1\171\1\144\1\72\1\172\1\141\1\uffff\1\162\1\163\2\uffff\1\151\1\172\1\124\1\147\1\uffff\2\40\1\155\1\151\1\116\1\uffff\1\172\1\156\1\172\1\uffff\1\145\1\141\1\40\1\172\1\102\1\uffff\1\164\1\156\1\40\1\164\1\uffff\2\172\2\uffff\1\145\1\164\1\103\1\143\1\172\1\156\1\uffff\1\171\1\151\1\72\1\uffff\1\157\1\uffff\1\156\1\171\1\124\1\145\1\172\1\72\1\157\1\uffff\1\162\1\164\3\172\1\uffff\1\156\1\171\1\163\1\uffff\1\163\1\172\2\40\3\uffff";
    static final String DFA18_acceptS =
        "\2\uffff\1\2\1\3\6\uffff\1\12\1\13\13\uffff\1\34\14\uffff\1\42\3\uffff\1\46\1\47\1\uffff\1\42\1\2\1\3\1\32\1\4\11\uffff\1\12\1\13\16\uffff\1\34\14\uffff\1\43\1\44\1\45\1\46\13\uffff\1\11\10\uffff\1\26\24\uffff\1\15\1\uffff\1\14\3\uffff\1\10\16\uffff\1\40\7\uffff\1\37\12\uffff\1\41\2\uffff\1\17\1\20\4\uffff\1\25\5\uffff\1\35\3\uffff\1\36\5\uffff\1\6\4\uffff\1\22\2\uffff\1\30\1\27\6\uffff\1\1\3\uffff\1\23\1\uffff\1\24\7\uffff\1\16\5\uffff\1\5\3\uffff\1\33\4\uffff\1\21\1\31\1\7";
    static final String DFA18_specialS =
        "\1\1\44\uffff\1\2\1\0\u00cd\uffff}>";
    static final String[] DFA18_transitionS = {
            "\11\51\2\50\2\51\1\50\22\51\1\50\1\51\1\45\4\51\1\46\1\12\1\13\3\51\1\26\1\51\1\47\12\27\1\4\6\51\2\44\1\41\1\25\1\1\1\21\2\44\1\11\1\42\1\44\1\10\2\44\1\22\2\44\1\16\1\20\3\44\1\23\3\44\3\51\1\43\1\44\1\51\1\30\1\40\1\37\1\36\1\33\1\6\2\44\1\24\2\44\1\34\1\5\1\15\1\35\1\14\1\17\1\44\1\32\1\31\1\44\1\7\4\44\1\2\1\51\1\3\uff82\51",
            "\1\52",
            "",
            "",
            "\1\56",
            "\1\60\7\uffff\1\61",
            "\1\62\6\uffff\1\63",
            "\1\64",
            "\1\67\11\uffff\1\65\37\uffff\1\66",
            "\1\70",
            "",
            "",
            "\1\73",
            "\1\74",
            "\1\75",
            "\1\76",
            "\1\77\56\uffff\1\100",
            "\1\101",
            "\1\102\3\uffff\1\103",
            "\1\104",
            "\1\106\10\uffff\1\105\1\107",
            "\1\110",
            "\12\111",
            "",
            "\1\112",
            "\1\113",
            "\1\114",
            "\1\115",
            "\1\116\15\uffff\1\117",
            "\1\120",
            "\1\121",
            "\1\122",
            "\1\123",
            "\1\124",
            "\1\125",
            "\32\53\4\uffff\1\53\1\uffff\32\53",
            "",
            "\0\126",
            "\0\126",
            "\1\127\4\uffff\1\130",
            "",
            "",
            "\1\132",
            "",
            "",
            "",
            "",
            "",
            "\1\135\1\uffff\1\133\7\uffff\1\134",
            "\1\136",
            "\1\137",
            "\1\140",
            "\1\141",
            "\1\142",
            "\1\143",
            "\1\144",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "",
            "",
            "\1\147\1\uffff\1\146",
            "\1\150",
            "\1\151",
            "\1\152",
            "\1\153",
            "\1\154",
            "\1\155",
            "\1\156",
            "\1\157",
            "\1\160",
            "\1\161",
            "\1\162",
            "\1\163",
            "\1\164",
            "",
            "\1\165",
            "\1\166",
            "\1\167",
            "\1\170",
            "\1\171",
            "\1\172",
            "\1\173",
            "\1\174",
            "\1\175",
            "\1\176",
            "\1\177",
            "\1\u0080",
            "",
            "",
            "",
            "",
            "\1\u0081",
            "\1\u0082",
            "\1\u0083",
            "\1\u0084",
            "\1\u0085",
            "\1\u0086",
            "\1\u0087",
            "\1\u0088",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u008a",
            "\1\u008b",
            "",
            "\1\u008c",
            "\1\u008d",
            "\1\u008e",
            "\1\u008f",
            "\1\u0090",
            "\1\u0091",
            "\1\u0092",
            "\1\u0093",
            "",
            "\1\u0094",
            "\1\u0095",
            "\1\u0096",
            "\1\u0097",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u0099",
            "\1\u009a",
            "\1\u009b",
            "\1\u009c",
            "\1\u009d",
            "\1\u009e",
            "\1\u009f",
            "\1\u00a0",
            "\1\u00a1",
            "\1\u00a2",
            "\1\u00a3",
            "\1\u00a4",
            "\1\u00a5",
            "\1\u00a6",
            "\1\u00a7",
            "",
            "\1\u00a0",
            "",
            "\1\u00a8",
            "\1\u00a9",
            "\1\u00aa",
            "",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u00ab",
            "\1\u00ac",
            "\1\u00ad",
            "\1\u00af\13\uffff\1\u00ae",
            "\1\u00b0",
            "\1\u00b1",
            "\1\u00b2",
            "\1\u00b3",
            "\1\u00b4",
            "\1\u00b5",
            "\1\u00b6",
            "\1\u00b7",
            "\1\u00b8",
            "",
            "\1\u00b9",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u00bb",
            "\1\u00bc",
            "\1\u00bd",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "",
            "\1\u00bf",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u00c0",
            "\1\u00c1",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u00c2",
            "\1\u00c3",
            "\1\u00c4",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u00c5",
            "",
            "\1\u00c6",
            "\1\u00c7",
            "",
            "",
            "\1\u00c8",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u00ca",
            "\1\u00cb",
            "",
            "\1\u00cc",
            "\1\u00cd",
            "\1\u00ce",
            "\1\u00cf",
            "\1\u00d0",
            "",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u00d1",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "",
            "\1\u00d2",
            "\1\u00d3",
            "\1\u00ab",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u00d5",
            "",
            "\1\u00d6",
            "\1\u00d7",
            "\1\u00d8",
            "\1\u00d9",
            "",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "",
            "",
            "\1\u00db",
            "\1\u00dc",
            "\1\u00dd",
            "\1\u00de",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u00df",
            "",
            "\1\u00e0",
            "\1\u00e1",
            "\1\u00e2",
            "",
            "\1\u00e3",
            "",
            "\1\u00e4",
            "\1\u00e5",
            "\1\u00e6",
            "\1\u00e7",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u00e8",
            "\1\u00e9",
            "",
            "\1\u00ea",
            "\1\u00eb",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "",
            "\1\u00ed",
            "\1\u00ee",
            "\1\u00ef",
            "",
            "\1\u00f0",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u00f2",
            "\1\u00f3",
            "",
            "",
            ""
    };

    static final short[] DFA18_eot = DFA.unpackEncodedString(DFA18_eotS);
    static final short[] DFA18_eof = DFA.unpackEncodedString(DFA18_eofS);
    static final char[] DFA18_min = DFA.unpackEncodedStringToUnsignedChars(DFA18_minS);
    static final char[] DFA18_max = DFA.unpackEncodedStringToUnsignedChars(DFA18_maxS);
    static final short[] DFA18_accept = DFA.unpackEncodedString(DFA18_acceptS);
    static final short[] DFA18_special = DFA.unpackEncodedString(DFA18_specialS);
    static final short[][] DFA18_transition;

    static {
        int numStates = DFA18_transitionS.length;
        DFA18_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA18_transition[i] = DFA.unpackEncodedString(DFA18_transitionS[i]);
        }
    }

    class DFA18 extends DFA {

        public DFA18(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 18;
            this.eot = DFA18_eot;
            this.eof = DFA18_eof;
            this.min = DFA18_min;
            this.max = DFA18_max;
            this.accept = DFA18_accept;
            this.special = DFA18_special;
            this.transition = DFA18_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | RULE_POSSIBLY_SIGNED_INT | RULE_GENERATION_TYPE | RULE_FETCH_TYPE | RULE_ASSOCIATION | RULE_DATA_TYPE | RULE_JOIN_TYPE | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA18_38 = input.LA(1);

                        s = -1;
                        if ( ((LA18_38>='\u0000' && LA18_38<='\uFFFF')) ) {s = 86;}

                        else s = 41;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA18_0 = input.LA(1);

                        s = -1;
                        if ( (LA18_0=='E') ) {s = 1;}

                        else if ( (LA18_0=='{') ) {s = 2;}

                        else if ( (LA18_0=='}') ) {s = 3;}

                        else if ( (LA18_0==':') ) {s = 4;}

                        else if ( (LA18_0=='m') ) {s = 5;}

                        else if ( (LA18_0=='f') ) {s = 6;}

                        else if ( (LA18_0=='v') ) {s = 7;}

                        else if ( (LA18_0=='L') ) {s = 8;}

                        else if ( (LA18_0=='I') ) {s = 9;}

                        else if ( (LA18_0=='(') ) {s = 10;}

                        else if ( (LA18_0==')') ) {s = 11;}

                        else if ( (LA18_0=='p') ) {s = 12;}

                        else if ( (LA18_0=='n') ) {s = 13;}

                        else if ( (LA18_0=='R') ) {s = 14;}

                        else if ( (LA18_0=='q') ) {s = 15;}

                        else if ( (LA18_0=='S') ) {s = 16;}

                        else if ( (LA18_0=='F') ) {s = 17;}

                        else if ( (LA18_0=='O') ) {s = 18;}

                        else if ( (LA18_0=='W') ) {s = 19;}

                        else if ( (LA18_0=='i') ) {s = 20;}

                        else if ( (LA18_0=='D') ) {s = 21;}

                        else if ( (LA18_0=='-') ) {s = 22;}

                        else if ( ((LA18_0>='0' && LA18_0<='9')) ) {s = 23;}

                        else if ( (LA18_0=='a') ) {s = 24;}

                        else if ( (LA18_0=='t') ) {s = 25;}

                        else if ( (LA18_0=='s') ) {s = 26;}

                        else if ( (LA18_0=='e') ) {s = 27;}

                        else if ( (LA18_0=='l') ) {s = 28;}

                        else if ( (LA18_0=='o') ) {s = 29;}

                        else if ( (LA18_0=='d') ) {s = 30;}

                        else if ( (LA18_0=='c') ) {s = 31;}

                        else if ( (LA18_0=='b') ) {s = 32;}

                        else if ( (LA18_0=='C') ) {s = 33;}

                        else if ( (LA18_0=='J') ) {s = 34;}

                        else if ( (LA18_0=='^') ) {s = 35;}

                        else if ( ((LA18_0>='A' && LA18_0<='B')||(LA18_0>='G' && LA18_0<='H')||LA18_0=='K'||(LA18_0>='M' && LA18_0<='N')||(LA18_0>='P' && LA18_0<='Q')||(LA18_0>='T' && LA18_0<='V')||(LA18_0>='X' && LA18_0<='Z')||LA18_0=='_'||(LA18_0>='g' && LA18_0<='h')||(LA18_0>='j' && LA18_0<='k')||LA18_0=='r'||LA18_0=='u'||(LA18_0>='w' && LA18_0<='z')) ) {s = 36;}

                        else if ( (LA18_0=='\"') ) {s = 37;}

                        else if ( (LA18_0=='\'') ) {s = 38;}

                        else if ( (LA18_0=='/') ) {s = 39;}

                        else if ( ((LA18_0>='\t' && LA18_0<='\n')||LA18_0=='\r'||LA18_0==' ') ) {s = 40;}

                        else if ( ((LA18_0>='\u0000' && LA18_0<='\b')||(LA18_0>='\u000B' && LA18_0<='\f')||(LA18_0>='\u000E' && LA18_0<='\u001F')||LA18_0=='!'||(LA18_0>='#' && LA18_0<='&')||(LA18_0>='*' && LA18_0<=',')||LA18_0=='.'||(LA18_0>=';' && LA18_0<='@')||(LA18_0>='[' && LA18_0<=']')||LA18_0=='`'||LA18_0=='|'||(LA18_0>='~' && LA18_0<='\uFFFF')) ) {s = 41;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA18_37 = input.LA(1);

                        s = -1;
                        if ( ((LA18_37>='\u0000' && LA18_37<='\uFFFF')) ) {s = 86;}

                        else s = 41;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 18, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}