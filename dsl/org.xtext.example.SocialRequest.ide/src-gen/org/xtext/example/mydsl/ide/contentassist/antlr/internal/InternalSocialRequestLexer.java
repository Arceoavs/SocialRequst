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
    public static final int T__50=50;
    public static final int RULE_GENERATIONTYPE=6;
    public static final int T__19=19;
    public static final int RULE_POSSIBLY_SIGNED_INT=7;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=9;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=10;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_FETCHTYPE=5;
    public static final int RULE_STRING=8;
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

    public InternalSocialRequestLexer() {;} 
    public InternalSocialRequestLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalSocialRequestLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalSocialRequest.g"; }

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSocialRequest.g:11:7: ( 'NotNull' )
            // InternalSocialRequest.g:11:9: 'NotNull'
            {
            match("NotNull"); 


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
            // InternalSocialRequest.g:12:7: ( 'NotBlank' )
            // InternalSocialRequest.g:12:9: 'NotBlank'
            {
            match("NotBlank"); 


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
            // InternalSocialRequest.g:13:7: ( 'Past' )
            // InternalSocialRequest.g:13:9: 'Past'
            {
            match("Past"); 


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
            // InternalSocialRequest.g:14:7: ( 'Email' )
            // InternalSocialRequest.g:14:9: 'Email'
            {
            match("Email"); 


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
            // InternalSocialRequest.g:15:7: ( 'OneToMany' )
            // InternalSocialRequest.g:15:9: 'OneToMany'
            {
            match("OneToMany"); 


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
            // InternalSocialRequest.g:16:7: ( 'ManyToOne' )
            // InternalSocialRequest.g:16:9: 'ManyToOne'
            {
            match("ManyToOne"); 


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
            // InternalSocialRequest.g:17:7: ( 'OneToOne' )
            // InternalSocialRequest.g:17:9: 'OneToOne'
            {
            match("OneToOne"); 


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
            // InternalSocialRequest.g:18:7: ( 'ManyToMany' )
            // InternalSocialRequest.g:18:9: 'ManyToMany'
            {
            match("ManyToMany"); 


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
            // InternalSocialRequest.g:19:7: ( 'String' )
            // InternalSocialRequest.g:19:9: 'String'
            {
            match("String"); 


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
            // InternalSocialRequest.g:20:7: ( 'long' )
            // InternalSocialRequest.g:20:9: 'long'
            {
            match("long"); 


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
            // InternalSocialRequest.g:21:7: ( 'float' )
            // InternalSocialRequest.g:21:9: 'float'
            {
            match("float"); 


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
            // InternalSocialRequest.g:22:7: ( 'double' )
            // InternalSocialRequest.g:22:9: 'double'
            {
            match("double"); 


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
            // InternalSocialRequest.g:23:7: ( 'char' )
            // InternalSocialRequest.g:23:9: 'char'
            {
            match("char"); 


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
            // InternalSocialRequest.g:24:7: ( 'int' )
            // InternalSocialRequest.g:24:9: 'int'
            {
            match("int"); 


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
            // InternalSocialRequest.g:25:7: ( 'boolean' )
            // InternalSocialRequest.g:25:9: 'boolean'
            {
            match("boolean"); 


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
            // InternalSocialRequest.g:26:7: ( 'Date' )
            // InternalSocialRequest.g:26:9: 'Date'
            {
            match("Date"); 


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
            // InternalSocialRequest.g:27:7: ( 'LEFT JOIN' )
            // InternalSocialRequest.g:27:9: 'LEFT JOIN'
            {
            match("LEFT JOIN"); 


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
            // InternalSocialRequest.g:28:7: ( 'LEFT OUTER JOIN' )
            // InternalSocialRequest.g:28:9: 'LEFT OUTER JOIN'
            {
            match("LEFT OUTER JOIN"); 


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
            // InternalSocialRequest.g:29:7: ( 'CROSS JOIN' )
            // InternalSocialRequest.g:29:9: 'CROSS JOIN'
            {
            match("CROSS JOIN"); 


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
            // InternalSocialRequest.g:30:7: ( 'JOIN' )
            // InternalSocialRequest.g:30:9: 'JOIN'
            {
            match("JOIN"); 


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
            // InternalSocialRequest.g:31:7: ( 'package' )
            // InternalSocialRequest.g:31:9: 'package'
            {
            match("package"); 


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
            // InternalSocialRequest.g:32:7: ( '{' )
            // InternalSocialRequest.g:32:9: '{'
            {
            match('{'); 

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
            // InternalSocialRequest.g:33:7: ( '}' )
            // InternalSocialRequest.g:33:9: '}'
            {
            match('}'); 

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
            // InternalSocialRequest.g:34:7: ( '.' )
            // InternalSocialRequest.g:34:9: '.'
            {
            match('.'); 

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
            // InternalSocialRequest.g:35:7: ( 'Entity' )
            // InternalSocialRequest.g:35:9: 'Entity'
            {
            match("Entity"); 


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
            // InternalSocialRequest.g:36:7: ( 'UserDetails' )
            // InternalSocialRequest.g:36:9: 'UserDetails'
            {
            match("UserDetails"); 


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
            // InternalSocialRequest.g:37:7: ( ':' )
            // InternalSocialRequest.g:37:9: ':'
            {
            match(':'); 

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
            // InternalSocialRequest.g:38:7: ( 'mappedBy:' )
            // InternalSocialRequest.g:38:9: 'mappedBy:'
            {
            match("mappedBy:"); 


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
            // InternalSocialRequest.g:39:7: ( 'fetch:' )
            // InternalSocialRequest.g:39:9: 'fetch:'
            {
            match("fetch:"); 


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
            // InternalSocialRequest.g:40:7: ( 'validations' )
            // InternalSocialRequest.g:40:9: 'validations'
            {
            match("validations"); 


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
            // InternalSocialRequest.g:41:7: ( '(' )
            // InternalSocialRequest.g:41:9: '('
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
            // InternalSocialRequest.g:42:7: ( ')' )
            // InternalSocialRequest.g:42:9: ')'
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
            // InternalSocialRequest.g:43:7: ( 'min:' )
            // InternalSocialRequest.g:43:9: 'min:'
            {
            match("min:"); 


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
            // InternalSocialRequest.g:44:7: ( 'max:' )
            // InternalSocialRequest.g:44:9: 'max:'
            {
            match("max:"); 


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
            // InternalSocialRequest.g:45:7: ( 'pattern:' )
            // InternalSocialRequest.g:45:9: 'pattern:'
            {
            match("pattern:"); 


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
            // InternalSocialRequest.g:46:7: ( 'Repository' )
            // InternalSocialRequest.g:46:9: 'Repository'
            {
            match("Repository"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSocialRequest.g:47:7: ( 'query' )
            // InternalSocialRequest.g:47:9: 'query'
            {
            match("query"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSocialRequest.g:48:7: ( 'list' )
            // InternalSocialRequest.g:48:9: 'list'
            {
            match("list"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSocialRequest.g:49:7: ( 'params' )
            // InternalSocialRequest.g:49:9: 'params'
            {
            match("params"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSocialRequest.g:50:7: ( 'SELECT' )
            // InternalSocialRequest.g:50:9: 'SELECT'
            {
            match("SELECT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSocialRequest.g:51:7: ( 'FROM' )
            // InternalSocialRequest.g:51:9: 'FROM'
            {
            match("FROM"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSocialRequest.g:52:7: ( 'ON' )
            // InternalSocialRequest.g:52:9: 'ON'
            {
            match("ON"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSocialRequest.g:53:7: ( 'WHERE' )
            // InternalSocialRequest.g:53:9: 'WHERE'
            {
            match("WHERE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSocialRequest.g:54:7: ( 'ORDER BY' )
            // InternalSocialRequest.g:54:9: 'ORDER BY'
            {
            match("ORDER BY"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSocialRequest.g:55:7: ( 'implements' )
            // InternalSocialRequest.g:55:9: 'implements'
            {
            match("implements"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSocialRequest.g:56:7: ( 'LOB' )
            // InternalSocialRequest.g:56:9: 'LOB'
            {
            match("LOB"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__59"

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSocialRequest.g:57:7: ( 'TRANSIENT' )
            // InternalSocialRequest.g:57:9: 'TRANSIENT'
            {
            match("TRANSIENT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__60"

    // $ANTLR start "T__61"
    public final void mT__61() throws RecognitionException {
        try {
            int _type = T__61;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSocialRequest.g:58:7: ( 'ID' )
            // InternalSocialRequest.g:58:9: 'ID'
            {
            match("ID"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__61"

    // $ANTLR start "T__62"
    public final void mT__62() throws RecognitionException {
        try {
            int _type = T__62;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSocialRequest.g:59:7: ( 'unique' )
            // InternalSocialRequest.g:59:9: 'unique'
            {
            match("unique"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__62"

    // $ANTLR start "T__63"
    public final void mT__63() throws RecognitionException {
        try {
            int _type = T__63;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSocialRequest.g:60:7: ( 'DISTINCT' )
            // InternalSocialRequest.g:60:9: 'DISTINCT'
            {
            match("DISTINCT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__63"

    // $ANTLR start "RULE_POSSIBLY_SIGNED_INT"
    public final void mRULE_POSSIBLY_SIGNED_INT() throws RecognitionException {
        try {
            int _type = RULE_POSSIBLY_SIGNED_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSocialRequest.g:4632:26: ( ( '-' )? RULE_INT )
            // InternalSocialRequest.g:4632:28: ( '-' )? RULE_INT
            {
            // InternalSocialRequest.g:4632:28: ( '-' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='-') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalSocialRequest.g:4632:28: '-'
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

    // $ANTLR start "RULE_GENERATIONTYPE"
    public final void mRULE_GENERATIONTYPE() throws RecognitionException {
        try {
            int _type = RULE_GENERATIONTYPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSocialRequest.g:4634:21: ( ( 'AUTO' | 'TABLE' | 'IDENTITY' | 'SEQUENCE' ) )
            // InternalSocialRequest.g:4634:23: ( 'AUTO' | 'TABLE' | 'IDENTITY' | 'SEQUENCE' )
            {
            // InternalSocialRequest.g:4634:23: ( 'AUTO' | 'TABLE' | 'IDENTITY' | 'SEQUENCE' )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 'A':
                {
                alt2=1;
                }
                break;
            case 'T':
                {
                alt2=2;
                }
                break;
            case 'I':
                {
                alt2=3;
                }
                break;
            case 'S':
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
                    // InternalSocialRequest.g:4634:24: 'AUTO'
                    {
                    match("AUTO"); 


                    }
                    break;
                case 2 :
                    // InternalSocialRequest.g:4634:31: 'TABLE'
                    {
                    match("TABLE"); 


                    }
                    break;
                case 3 :
                    // InternalSocialRequest.g:4634:39: 'IDENTITY'
                    {
                    match("IDENTITY"); 


                    }
                    break;
                case 4 :
                    // InternalSocialRequest.g:4634:50: 'SEQUENCE'
                    {
                    match("SEQUENCE"); 


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
    // $ANTLR end "RULE_GENERATIONTYPE"

    // $ANTLR start "RULE_FETCHTYPE"
    public final void mRULE_FETCHTYPE() throws RecognitionException {
        try {
            int _type = RULE_FETCHTYPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSocialRequest.g:4636:16: ( ( 'EAGER' | 'LAZY' ) )
            // InternalSocialRequest.g:4636:18: ( 'EAGER' | 'LAZY' )
            {
            // InternalSocialRequest.g:4636:18: ( 'EAGER' | 'LAZY' )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='E') ) {
                alt3=1;
            }
            else if ( (LA3_0=='L') ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalSocialRequest.g:4636:19: 'EAGER'
                    {
                    match("EAGER"); 


                    }
                    break;
                case 2 :
                    // InternalSocialRequest.g:4636:27: 'LAZY'
                    {
                    match("LAZY"); 


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
    // $ANTLR end "RULE_FETCHTYPE"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSocialRequest.g:4638:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalSocialRequest.g:4638:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalSocialRequest.g:4638:11: ( '^' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='^') ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalSocialRequest.g:4638:11: '^'
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

            // InternalSocialRequest.g:4638:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='0' && LA5_0<='9')||(LA5_0>='A' && LA5_0<='Z')||LA5_0=='_'||(LA5_0>='a' && LA5_0<='z')) ) {
                    alt5=1;
                }


                switch (alt5) {
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
            // InternalSocialRequest.g:4640:19: ( ( '0' .. '9' )+ )
            // InternalSocialRequest.g:4640:21: ( '0' .. '9' )+
            {
            // InternalSocialRequest.g:4640:21: ( '0' .. '9' )+
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
            	    // InternalSocialRequest.g:4640:22: '0' .. '9'
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
            // InternalSocialRequest.g:4642:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalSocialRequest.g:4642:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalSocialRequest.g:4642:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
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
                    // InternalSocialRequest.g:4642:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalSocialRequest.g:4642:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
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
                    	    // InternalSocialRequest.g:4642:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalSocialRequest.g:4642:28: ~ ( ( '\\\\' | '\"' ) )
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
                    // InternalSocialRequest.g:4642:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalSocialRequest.g:4642:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
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
                    	    // InternalSocialRequest.g:4642:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalSocialRequest.g:4642:61: ~ ( ( '\\\\' | '\\'' ) )
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
            // InternalSocialRequest.g:4644:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalSocialRequest.g:4644:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalSocialRequest.g:4644:24: ( options {greedy=false; } : . )*
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
            	    // InternalSocialRequest.g:4644:52: .
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
            // InternalSocialRequest.g:4646:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalSocialRequest.g:4646:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalSocialRequest.g:4646:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\u0000' && LA11_0<='\t')||(LA11_0>='\u000B' && LA11_0<='\f')||(LA11_0>='\u000E' && LA11_0<='\uFFFF')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalSocialRequest.g:4646:24: ~ ( ( '\\n' | '\\r' ) )
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

            // InternalSocialRequest.g:4646:40: ( ( '\\r' )? '\\n' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0=='\n'||LA13_0=='\r') ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalSocialRequest.g:4646:41: ( '\\r' )? '\\n'
                    {
                    // InternalSocialRequest.g:4646:41: ( '\\r' )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0=='\r') ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // InternalSocialRequest.g:4646:41: '\\r'
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
            // InternalSocialRequest.g:4648:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalSocialRequest.g:4648:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalSocialRequest.g:4648:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
            // InternalSocialRequest.g:4650:16: ( . )
            // InternalSocialRequest.g:4650:18: .
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
        // InternalSocialRequest.g:1:8: ( T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | RULE_POSSIBLY_SIGNED_INT | RULE_GENERATIONTYPE | RULE_FETCHTYPE | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt15=59;
        alt15 = dfa15.predict(input);
        switch (alt15) {
            case 1 :
                // InternalSocialRequest.g:1:10: T__14
                {
                mT__14(); 

                }
                break;
            case 2 :
                // InternalSocialRequest.g:1:16: T__15
                {
                mT__15(); 

                }
                break;
            case 3 :
                // InternalSocialRequest.g:1:22: T__16
                {
                mT__16(); 

                }
                break;
            case 4 :
                // InternalSocialRequest.g:1:28: T__17
                {
                mT__17(); 

                }
                break;
            case 5 :
                // InternalSocialRequest.g:1:34: T__18
                {
                mT__18(); 

                }
                break;
            case 6 :
                // InternalSocialRequest.g:1:40: T__19
                {
                mT__19(); 

                }
                break;
            case 7 :
                // InternalSocialRequest.g:1:46: T__20
                {
                mT__20(); 

                }
                break;
            case 8 :
                // InternalSocialRequest.g:1:52: T__21
                {
                mT__21(); 

                }
                break;
            case 9 :
                // InternalSocialRequest.g:1:58: T__22
                {
                mT__22(); 

                }
                break;
            case 10 :
                // InternalSocialRequest.g:1:64: T__23
                {
                mT__23(); 

                }
                break;
            case 11 :
                // InternalSocialRequest.g:1:70: T__24
                {
                mT__24(); 

                }
                break;
            case 12 :
                // InternalSocialRequest.g:1:76: T__25
                {
                mT__25(); 

                }
                break;
            case 13 :
                // InternalSocialRequest.g:1:82: T__26
                {
                mT__26(); 

                }
                break;
            case 14 :
                // InternalSocialRequest.g:1:88: T__27
                {
                mT__27(); 

                }
                break;
            case 15 :
                // InternalSocialRequest.g:1:94: T__28
                {
                mT__28(); 

                }
                break;
            case 16 :
                // InternalSocialRequest.g:1:100: T__29
                {
                mT__29(); 

                }
                break;
            case 17 :
                // InternalSocialRequest.g:1:106: T__30
                {
                mT__30(); 

                }
                break;
            case 18 :
                // InternalSocialRequest.g:1:112: T__31
                {
                mT__31(); 

                }
                break;
            case 19 :
                // InternalSocialRequest.g:1:118: T__32
                {
                mT__32(); 

                }
                break;
            case 20 :
                // InternalSocialRequest.g:1:124: T__33
                {
                mT__33(); 

                }
                break;
            case 21 :
                // InternalSocialRequest.g:1:130: T__34
                {
                mT__34(); 

                }
                break;
            case 22 :
                // InternalSocialRequest.g:1:136: T__35
                {
                mT__35(); 

                }
                break;
            case 23 :
                // InternalSocialRequest.g:1:142: T__36
                {
                mT__36(); 

                }
                break;
            case 24 :
                // InternalSocialRequest.g:1:148: T__37
                {
                mT__37(); 

                }
                break;
            case 25 :
                // InternalSocialRequest.g:1:154: T__38
                {
                mT__38(); 

                }
                break;
            case 26 :
                // InternalSocialRequest.g:1:160: T__39
                {
                mT__39(); 

                }
                break;
            case 27 :
                // InternalSocialRequest.g:1:166: T__40
                {
                mT__40(); 

                }
                break;
            case 28 :
                // InternalSocialRequest.g:1:172: T__41
                {
                mT__41(); 

                }
                break;
            case 29 :
                // InternalSocialRequest.g:1:178: T__42
                {
                mT__42(); 

                }
                break;
            case 30 :
                // InternalSocialRequest.g:1:184: T__43
                {
                mT__43(); 

                }
                break;
            case 31 :
                // InternalSocialRequest.g:1:190: T__44
                {
                mT__44(); 

                }
                break;
            case 32 :
                // InternalSocialRequest.g:1:196: T__45
                {
                mT__45(); 

                }
                break;
            case 33 :
                // InternalSocialRequest.g:1:202: T__46
                {
                mT__46(); 

                }
                break;
            case 34 :
                // InternalSocialRequest.g:1:208: T__47
                {
                mT__47(); 

                }
                break;
            case 35 :
                // InternalSocialRequest.g:1:214: T__48
                {
                mT__48(); 

                }
                break;
            case 36 :
                // InternalSocialRequest.g:1:220: T__49
                {
                mT__49(); 

                }
                break;
            case 37 :
                // InternalSocialRequest.g:1:226: T__50
                {
                mT__50(); 

                }
                break;
            case 38 :
                // InternalSocialRequest.g:1:232: T__51
                {
                mT__51(); 

                }
                break;
            case 39 :
                // InternalSocialRequest.g:1:238: T__52
                {
                mT__52(); 

                }
                break;
            case 40 :
                // InternalSocialRequest.g:1:244: T__53
                {
                mT__53(); 

                }
                break;
            case 41 :
                // InternalSocialRequest.g:1:250: T__54
                {
                mT__54(); 

                }
                break;
            case 42 :
                // InternalSocialRequest.g:1:256: T__55
                {
                mT__55(); 

                }
                break;
            case 43 :
                // InternalSocialRequest.g:1:262: T__56
                {
                mT__56(); 

                }
                break;
            case 44 :
                // InternalSocialRequest.g:1:268: T__57
                {
                mT__57(); 

                }
                break;
            case 45 :
                // InternalSocialRequest.g:1:274: T__58
                {
                mT__58(); 

                }
                break;
            case 46 :
                // InternalSocialRequest.g:1:280: T__59
                {
                mT__59(); 

                }
                break;
            case 47 :
                // InternalSocialRequest.g:1:286: T__60
                {
                mT__60(); 

                }
                break;
            case 48 :
                // InternalSocialRequest.g:1:292: T__61
                {
                mT__61(); 

                }
                break;
            case 49 :
                // InternalSocialRequest.g:1:298: T__62
                {
                mT__62(); 

                }
                break;
            case 50 :
                // InternalSocialRequest.g:1:304: T__63
                {
                mT__63(); 

                }
                break;
            case 51 :
                // InternalSocialRequest.g:1:310: RULE_POSSIBLY_SIGNED_INT
                {
                mRULE_POSSIBLY_SIGNED_INT(); 

                }
                break;
            case 52 :
                // InternalSocialRequest.g:1:335: RULE_GENERATIONTYPE
                {
                mRULE_GENERATIONTYPE(); 

                }
                break;
            case 53 :
                // InternalSocialRequest.g:1:355: RULE_FETCHTYPE
                {
                mRULE_FETCHTYPE(); 

                }
                break;
            case 54 :
                // InternalSocialRequest.g:1:370: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 55 :
                // InternalSocialRequest.g:1:378: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 56 :
                // InternalSocialRequest.g:1:390: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 57 :
                // InternalSocialRequest.g:1:406: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 58 :
                // InternalSocialRequest.g:1:422: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 59 :
                // InternalSocialRequest.g:1:430: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA15 dfa15 = new DFA15(this);
    static final String DFA15_eotS =
        "\1\uffff\21\55\3\uffff\1\55\1\uffff\2\55\2\uffff\7\55\1\53\1\uffff\1\55\1\53\1\uffff\3\53\2\uffff\1\55\1\uffff\5\55\1\147\25\55\3\uffff\1\55\1\uffff\3\55\2\uffff\6\55\1\u008c\1\55\1\uffff\1\55\4\uffff\6\55\1\uffff\13\55\1\u00a1\5\55\1\u00a7\22\55\1\uffff\4\55\1\u00be\11\55\1\u00c8\1\u00c9\3\55\1\u00cd\1\uffff\2\55\1\u00d0\2\55\1\uffff\1\u00d3\1\55\1\u00d5\5\55\2\uffff\3\55\1\u00de\5\55\1\u00e4\2\55\1\uffff\1\u00e7\1\55\1\u00d3\6\55\2\uffff\1\u00f0\2\55\1\uffff\2\55\1\uffff\1\55\2\uffff\1\55\1\uffff\7\55\1\u0100\1\uffff\1\u0101\1\55\1\u00e4\2\55\1\uffff\2\55\1\uffff\1\u0107\2\55\1\uffff\1\55\1\u010c\1\u010d\1\55\2\uffff\1\u010f\3\55\3\uffff\2\55\1\u0115\4\55\2\uffff\2\55\1\u011c\1\u011d\1\55\1\uffff\4\55\2\uffff\1\55\1\uffff\1\55\1\u0125\1\55\1\u0127\1\55\1\uffff\6\55\2\uffff\1\u012f\1\55\1\u0131\2\55\1\u00e4\1\55\1\uffff\1\u0135\2\uffff\5\55\1\u00e4\1\uffff\1\u013b\1\uffff\1\u013c\2\55\1\uffff\1\55\1\uffff\2\55\1\u0142\2\uffff\1\u0143\1\u0144\2\55\1\u0147\3\uffff\1\u0148\1\u0149\3\uffff";
    static final String DFA15_eofS =
        "\u014a\uffff";
    static final String DFA15_minS =
        "\1\0\1\157\1\141\1\101\1\116\1\141\1\105\1\151\1\145\1\157\1\150\1\155\1\157\1\111\1\101\1\122\1\117\1\141\3\uffff\1\163\1\uffff\2\141\2\uffff\1\145\1\165\1\122\1\110\1\101\1\104\1\156\1\60\1\uffff\1\125\1\101\1\uffff\2\0\1\52\2\uffff\1\164\1\uffff\1\163\1\141\1\164\1\107\1\145\1\60\1\104\1\156\1\162\1\114\1\156\1\163\1\157\1\164\1\165\1\141\1\164\1\160\1\157\1\164\1\123\1\106\1\102\1\132\1\117\1\111\1\143\3\uffff\1\145\1\uffff\1\160\1\156\1\154\2\uffff\1\160\1\145\1\117\1\105\1\101\1\102\1\60\1\151\1\uffff\1\124\4\uffff\1\102\1\164\2\151\1\105\1\124\1\uffff\1\105\1\171\1\151\1\105\1\125\1\147\1\164\1\141\1\143\1\142\1\162\1\60\2\154\1\145\2\124\1\60\1\131\1\123\1\116\1\153\1\164\1\141\1\162\1\160\2\72\1\151\1\157\1\162\1\115\1\122\1\116\1\114\1\116\1\uffff\1\161\1\117\1\165\1\154\1\60\1\154\1\164\1\122\1\157\1\122\1\124\1\156\1\103\1\105\2\60\1\164\1\150\1\154\1\60\1\uffff\2\145\1\60\1\111\1\40\1\uffff\1\60\1\123\1\60\1\141\1\145\1\155\1\104\1\145\2\uffff\1\144\1\163\1\171\1\60\1\105\1\123\1\105\1\124\1\165\1\60\1\154\1\141\1\uffff\1\60\1\171\1\60\1\115\1\40\1\157\1\147\1\124\1\116\2\uffff\1\60\1\72\1\145\1\uffff\1\155\1\141\1\uffff\1\116\1\112\1\uffff\1\40\1\uffff\1\147\1\162\1\163\1\145\1\144\1\141\1\151\1\60\1\uffff\1\60\1\111\1\60\1\111\1\145\1\uffff\1\154\1\156\1\uffff\1\60\1\141\1\156\1\uffff\1\115\2\60\1\103\2\uffff\1\60\1\145\1\156\1\103\3\uffff\1\145\1\156\1\60\1\164\1\102\2\164\2\uffff\1\105\1\124\2\60\1\153\1\uffff\1\156\1\145\1\156\1\141\2\uffff\1\105\1\uffff\1\156\1\60\1\124\1\60\1\72\1\uffff\1\141\1\171\1\151\1\157\1\116\1\131\2\uffff\1\60\1\171\1\60\1\145\1\156\1\60\1\164\1\uffff\1\60\2\uffff\1\151\1\72\1\157\1\162\1\124\1\60\1\uffff\1\60\1\uffff\1\60\1\171\1\163\1\uffff\1\154\1\uffff\1\156\1\171\1\60\2\uffff\2\60\2\163\1\60\3\uffff\2\60\3\uffff";
    static final String DFA15_maxS =
        "\1\uffff\1\157\1\141\2\156\1\141\1\164\1\157\1\154\1\157\1\150\1\156\1\157\1\141\1\117\1\122\1\117\1\141\3\uffff\1\163\1\uffff\1\151\1\141\2\uffff\1\145\1\165\1\122\1\110\1\122\1\104\1\156\1\71\1\uffff\1\125\1\172\1\uffff\2\uffff\1\57\2\uffff\1\164\1\uffff\1\163\1\141\1\164\1\107\1\145\1\172\1\104\1\156\1\162\1\121\1\156\1\163\1\157\1\164\1\165\1\141\1\164\1\160\1\157\1\164\1\123\1\106\1\102\1\132\1\117\1\111\1\164\3\uffff\1\145\1\uffff\1\170\1\156\1\154\2\uffff\1\160\1\145\1\117\1\105\1\101\1\102\1\172\1\151\1\uffff\1\124\4\uffff\1\116\1\164\2\151\1\105\1\124\1\uffff\1\105\1\171\1\151\1\105\1\125\1\147\1\164\1\141\1\143\1\142\1\162\1\172\2\154\1\145\2\124\1\172\1\131\1\123\1\116\1\153\1\164\1\141\1\162\1\160\2\72\1\151\1\157\1\162\1\115\1\122\1\116\1\114\1\116\1\uffff\1\161\1\117\1\165\1\154\1\172\1\154\1\164\1\122\1\157\1\122\1\124\1\156\1\103\1\105\2\172\1\164\1\150\1\154\1\172\1\uffff\2\145\1\172\1\111\1\40\1\uffff\1\172\1\123\1\172\1\141\1\145\1\155\1\104\1\145\2\uffff\1\144\1\163\1\171\1\172\1\105\1\123\1\105\1\124\1\165\1\172\1\154\1\141\1\uffff\1\172\1\171\1\172\1\117\1\40\1\157\1\147\1\124\1\116\2\uffff\1\172\1\72\1\145\1\uffff\1\155\1\141\1\uffff\1\116\1\117\1\uffff\1\40\1\uffff\1\147\1\162\1\163\1\145\1\144\1\141\1\151\1\172\1\uffff\1\172\1\111\1\172\1\111\1\145\1\uffff\1\154\1\156\1\uffff\1\172\1\141\1\156\1\uffff\1\117\2\172\1\103\2\uffff\1\172\1\145\1\156\1\103\3\uffff\1\145\1\156\1\172\1\164\1\102\2\164\2\uffff\1\105\1\124\2\172\1\153\1\uffff\1\156\1\145\1\156\1\141\2\uffff\1\105\1\uffff\1\156\1\172\1\124\1\172\1\72\1\uffff\1\141\1\171\1\151\1\157\1\116\1\131\2\uffff\1\172\1\171\1\172\1\145\1\156\1\172\1\164\1\uffff\1\172\2\uffff\1\151\1\72\1\157\1\162\1\124\1\172\1\uffff\1\172\1\uffff\1\172\1\171\1\163\1\uffff\1\154\1\uffff\1\156\1\171\1\172\2\uffff\2\172\2\163\1\172\3\uffff\2\172\3\uffff";
    static final String DFA15_acceptS =
        "\22\uffff\1\26\1\27\1\30\1\uffff\1\33\2\uffff\1\37\1\40\10\uffff\1\63\2\uffff\1\66\3\uffff\1\72\1\73\1\uffff\1\66\33\uffff\1\26\1\27\1\30\1\uffff\1\33\3\uffff\1\37\1\40\10\uffff\1\63\1\uffff\1\67\1\70\1\71\1\72\6\uffff\1\52\44\uffff\1\60\24\uffff\1\16\5\uffff\1\56\10\uffff\1\42\1\41\14\uffff\1\3\11\uffff\1\12\1\46\3\uffff\1\15\2\uffff\1\20\2\uffff\1\65\1\uffff\1\24\10\uffff\1\51\5\uffff\1\64\2\uffff\1\4\3\uffff\1\54\4\uffff\1\13\1\35\4\uffff\1\21\1\22\1\23\7\uffff\1\45\1\53\5\uffff\1\31\4\uffff\1\11\1\50\1\uffff\1\14\5\uffff\1\47\6\uffff\1\61\1\1\7\uffff\1\17\1\uffff\1\25\1\43\6\uffff\1\2\1\uffff\1\7\3\uffff\1\62\1\uffff\1\34\3\uffff\1\5\1\6\5\uffff\1\57\1\10\1\55\2\uffff\1\44\1\32\1\36";
    static final String DFA15_specialS =
        "\1\1\46\uffff\1\2\1\0\u0121\uffff}>";
    static final String[] DFA15_transitionS = {
            "\11\53\2\52\2\53\1\52\22\53\1\52\1\53\1\47\4\53\1\50\1\31\1\32\3\53\1\42\1\24\1\51\12\43\1\26\6\53\1\44\1\46\1\17\1\15\1\3\1\35\2\46\1\40\1\20\1\46\1\16\1\5\1\1\1\4\1\2\1\46\1\33\1\6\1\37\1\25\1\46\1\36\3\46\3\53\1\45\1\46\1\53\1\46\1\14\1\12\1\11\1\46\1\10\2\46\1\13\2\46\1\7\1\27\2\46\1\21\1\34\3\46\1\41\1\30\4\46\1\22\1\53\1\23\uff82\53",
            "\1\54",
            "\1\56",
            "\1\61\53\uffff\1\57\1\60",
            "\1\63\3\uffff\1\64\33\uffff\1\62",
            "\1\65",
            "\1\67\56\uffff\1\66",
            "\1\71\5\uffff\1\70",
            "\1\73\6\uffff\1\72",
            "\1\74",
            "\1\75",
            "\1\77\1\76",
            "\1\100",
            "\1\102\27\uffff\1\101",
            "\1\105\3\uffff\1\103\11\uffff\1\104",
            "\1\106",
            "\1\107",
            "\1\110",
            "",
            "",
            "",
            "\1\114",
            "",
            "\1\116\7\uffff\1\117",
            "\1\120",
            "",
            "",
            "\1\123",
            "\1\124",
            "\1\125",
            "\1\126",
            "\1\130\20\uffff\1\127",
            "\1\131",
            "\1\132",
            "\12\133",
            "",
            "\1\134",
            "\32\55\4\uffff\1\55\1\uffff\32\55",
            "",
            "\0\135",
            "\0\135",
            "\1\136\4\uffff\1\137",
            "",
            "",
            "\1\141",
            "",
            "\1\142",
            "\1\143",
            "\1\144",
            "\1\145",
            "\1\146",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\150",
            "\1\151",
            "\1\152",
            "\1\153\4\uffff\1\154",
            "\1\155",
            "\1\156",
            "\1\157",
            "\1\160",
            "\1\161",
            "\1\162",
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
            "\1\175\16\uffff\1\177\1\uffff\1\176",
            "",
            "",
            "",
            "\1\u0080",
            "",
            "\1\u0081\7\uffff\1\u0082",
            "\1\u0083",
            "\1\u0084",
            "",
            "",
            "\1\u0085",
            "\1\u0086",
            "\1\u0087",
            "\1\u0088",
            "\1\u0089",
            "\1\u008a",
            "\12\55\7\uffff\4\55\1\u008b\25\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u008d",
            "",
            "\1\u008e",
            "",
            "",
            "",
            "",
            "\1\u0090\13\uffff\1\u008f",
            "\1\u0091",
            "\1\u0092",
            "\1\u0093",
            "\1\u0094",
            "\1\u0095",
            "",
            "\1\u0096",
            "\1\u0097",
            "\1\u0098",
            "\1\u0099",
            "\1\u009a",
            "\1\u009b",
            "\1\u009c",
            "\1\u009d",
            "\1\u009e",
            "\1\u009f",
            "\1\u00a0",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u00a2",
            "\1\u00a3",
            "\1\u00a4",
            "\1\u00a5",
            "\1\u00a6",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u00a8",
            "\1\u00a9",
            "\1\u00aa",
            "\1\u00ab",
            "\1\u00ac",
            "\1\u00ad",
            "\1\u00ae",
            "\1\u00af",
            "\1\u00b0",
            "\1\u00b1",
            "\1\u00b2",
            "\1\u00b3",
            "\1\u00b4",
            "\1\u00b5",
            "\1\u00b6",
            "\1\u00b7",
            "\1\u00b8",
            "\1\u00b9",
            "",
            "\1\u00ba",
            "\1\u00bb",
            "\1\u00bc",
            "\1\u00bd",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u00bf",
            "\1\u00c0",
            "\1\u00c1",
            "\1\u00c2",
            "\1\u00c3",
            "\1\u00c4",
            "\1\u00c5",
            "\1\u00c6",
            "\1\u00c7",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u00ca",
            "\1\u00cb",
            "\1\u00cc",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "",
            "\1\u00ce",
            "\1\u00cf",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u00d1",
            "\1\u00d2",
            "",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u00d4",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u00d6",
            "\1\u00d7",
            "\1\u00d8",
            "\1\u00d9",
            "\1\u00da",
            "",
            "",
            "\1\u00db",
            "\1\u00dc",
            "\1\u00dd",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u00df",
            "\1\u00e0",
            "\1\u00e1",
            "\1\u00e2",
            "\1\u00e3",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u00e5",
            "\1\u00e6",
            "",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u00e8",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u00e9\1\uffff\1\u00ea",
            "\1\u00eb",
            "\1\u00ec",
            "\1\u00ed",
            "\1\u00ee",
            "\1\u00ef",
            "",
            "",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u00f1",
            "\1\u00f2",
            "",
            "\1\u00f3",
            "\1\u00f4",
            "",
            "\1\u00f5",
            "\1\u00f6\4\uffff\1\u00f7",
            "",
            "\1\u00f8",
            "",
            "\1\u00f9",
            "\1\u00fa",
            "\1\u00fb",
            "\1\u00fc",
            "\1\u00fd",
            "\1\u00fe",
            "\1\u00ff",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u0102",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u0103",
            "\1\u0104",
            "",
            "\1\u0105",
            "\1\u0106",
            "",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u0108",
            "\1\u0109",
            "",
            "\1\u010b\1\uffff\1\u010a",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u010e",
            "",
            "",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u0110",
            "\1\u0111",
            "\1\u0112",
            "",
            "",
            "",
            "\1\u0113",
            "\1\u0114",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u0116",
            "\1\u0117",
            "\1\u0118",
            "\1\u0119",
            "",
            "",
            "\1\u011a",
            "\1\u011b",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u011e",
            "",
            "\1\u011f",
            "\1\u0120",
            "\1\u0121",
            "\1\u0122",
            "",
            "",
            "\1\u0123",
            "",
            "\1\u0124",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u0126",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u0128",
            "",
            "\1\u0129",
            "\1\u012a",
            "\1\u012b",
            "\1\u012c",
            "\1\u012d",
            "\1\u012e",
            "",
            "",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u0130",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u0132",
            "\1\u0133",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u0134",
            "",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "",
            "",
            "\1\u0136",
            "\1\u0137",
            "\1\u0138",
            "\1\u0139",
            "\1\u013a",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u013d",
            "\1\u013e",
            "",
            "\1\u013f",
            "",
            "\1\u0140",
            "\1\u0141",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "",
            "",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u0145",
            "\1\u0146",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "",
            "",
            "",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "",
            "",
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
            return "1:1: Tokens : ( T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | RULE_POSSIBLY_SIGNED_INT | RULE_GENERATIONTYPE | RULE_FETCHTYPE | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA15_40 = input.LA(1);

                        s = -1;
                        if ( ((LA15_40>='\u0000' && LA15_40<='\uFFFF')) ) {s = 93;}

                        else s = 43;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA15_0 = input.LA(1);

                        s = -1;
                        if ( (LA15_0=='N') ) {s = 1;}

                        else if ( (LA15_0=='P') ) {s = 2;}

                        else if ( (LA15_0=='E') ) {s = 3;}

                        else if ( (LA15_0=='O') ) {s = 4;}

                        else if ( (LA15_0=='M') ) {s = 5;}

                        else if ( (LA15_0=='S') ) {s = 6;}

                        else if ( (LA15_0=='l') ) {s = 7;}

                        else if ( (LA15_0=='f') ) {s = 8;}

                        else if ( (LA15_0=='d') ) {s = 9;}

                        else if ( (LA15_0=='c') ) {s = 10;}

                        else if ( (LA15_0=='i') ) {s = 11;}

                        else if ( (LA15_0=='b') ) {s = 12;}

                        else if ( (LA15_0=='D') ) {s = 13;}

                        else if ( (LA15_0=='L') ) {s = 14;}

                        else if ( (LA15_0=='C') ) {s = 15;}

                        else if ( (LA15_0=='J') ) {s = 16;}

                        else if ( (LA15_0=='p') ) {s = 17;}

                        else if ( (LA15_0=='{') ) {s = 18;}

                        else if ( (LA15_0=='}') ) {s = 19;}

                        else if ( (LA15_0=='.') ) {s = 20;}

                        else if ( (LA15_0=='U') ) {s = 21;}

                        else if ( (LA15_0==':') ) {s = 22;}

                        else if ( (LA15_0=='m') ) {s = 23;}

                        else if ( (LA15_0=='v') ) {s = 24;}

                        else if ( (LA15_0=='(') ) {s = 25;}

                        else if ( (LA15_0==')') ) {s = 26;}

                        else if ( (LA15_0=='R') ) {s = 27;}

                        else if ( (LA15_0=='q') ) {s = 28;}

                        else if ( (LA15_0=='F') ) {s = 29;}

                        else if ( (LA15_0=='W') ) {s = 30;}

                        else if ( (LA15_0=='T') ) {s = 31;}

                        else if ( (LA15_0=='I') ) {s = 32;}

                        else if ( (LA15_0=='u') ) {s = 33;}

                        else if ( (LA15_0=='-') ) {s = 34;}

                        else if ( ((LA15_0>='0' && LA15_0<='9')) ) {s = 35;}

                        else if ( (LA15_0=='A') ) {s = 36;}

                        else if ( (LA15_0=='^') ) {s = 37;}

                        else if ( (LA15_0=='B'||(LA15_0>='G' && LA15_0<='H')||LA15_0=='K'||LA15_0=='Q'||LA15_0=='V'||(LA15_0>='X' && LA15_0<='Z')||LA15_0=='_'||LA15_0=='a'||LA15_0=='e'||(LA15_0>='g' && LA15_0<='h')||(LA15_0>='j' && LA15_0<='k')||(LA15_0>='n' && LA15_0<='o')||(LA15_0>='r' && LA15_0<='t')||(LA15_0>='w' && LA15_0<='z')) ) {s = 38;}

                        else if ( (LA15_0=='\"') ) {s = 39;}

                        else if ( (LA15_0=='\'') ) {s = 40;}

                        else if ( (LA15_0=='/') ) {s = 41;}

                        else if ( ((LA15_0>='\t' && LA15_0<='\n')||LA15_0=='\r'||LA15_0==' ') ) {s = 42;}

                        else if ( ((LA15_0>='\u0000' && LA15_0<='\b')||(LA15_0>='\u000B' && LA15_0<='\f')||(LA15_0>='\u000E' && LA15_0<='\u001F')||LA15_0=='!'||(LA15_0>='#' && LA15_0<='&')||(LA15_0>='*' && LA15_0<=',')||(LA15_0>=';' && LA15_0<='@')||(LA15_0>='[' && LA15_0<=']')||LA15_0=='`'||LA15_0=='|'||(LA15_0>='~' && LA15_0<='\uFFFF')) ) {s = 43;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA15_39 = input.LA(1);

                        s = -1;
                        if ( ((LA15_39>='\u0000' && LA15_39<='\uFFFF')) ) {s = 93;}

                        else s = 43;

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