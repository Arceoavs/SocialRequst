package org.xtext.example.mydsl.ide.contentassist.antlr.internal;

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
import org.xtext.example.mydsl.services.SocialRequestGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSocialRequestParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_POSSIBLY_SIGNED_INT", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'not-null'", "'not-blank'", "'past'", "'unique'", "'valid-email'", "'auto'", "'table'", "'identity'", "'sequence'", "'eager'", "'lazy'", "'one-to-many'", "'many-to-one'", "'one-to-one'", "'many-to-many'", "'string'", "'long'", "'float'", "'double'", "'char'", "'int'", "'boolean'", "'date'", "'LEFT JOIN'", "'LEFT OUTER JOIN'", "'CROSS JOIN'", "'JOIN'", "'Entity'", "'{'", "'}'", "'UserDetails'", "':'", "'mappedBy:'", "'fetch:'", "'validations'", "'('", "')'", "'min:'", "'max:'", "'pattern:'", "'Repository'", "'query'", "'list'", "'params'", "'SELECT'", "'FROM'", "'ON'", "'WHERE'", "'ORDER BY'", "'implements'", "'LOB'", "'TRANSIENT'", "'ID'", "'DISTINCT'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int RULE_POSSIBLY_SIGNED_INT=5;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
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
    public static final int RULE_INT=7;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=9;
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
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
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


        public InternalSocialRequestParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSocialRequestParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSocialRequestParser.tokenNames; }
    public String getGrammarFileName() { return "InternalSocialRequest.g"; }


    	private SocialRequestGrammarAccess grammarAccess;

    	public void setGrammarAccess(SocialRequestGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleModel"
    // InternalSocialRequest.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalSocialRequest.g:54:1: ( ruleModel EOF )
            // InternalSocialRequest.g:55:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalSocialRequest.g:62:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:66:2: ( ( ( rule__Model__Group__0 ) ) )
            // InternalSocialRequest.g:67:2: ( ( rule__Model__Group__0 ) )
            {
            // InternalSocialRequest.g:67:2: ( ( rule__Model__Group__0 ) )
            // InternalSocialRequest.g:68:3: ( rule__Model__Group__0 )
            {
             before(grammarAccess.getModelAccess().getGroup()); 
            // InternalSocialRequest.g:69:3: ( rule__Model__Group__0 )
            // InternalSocialRequest.g:69:4: rule__Model__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getGroup()); 

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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleEntity"
    // InternalSocialRequest.g:78:1: entryRuleEntity : ruleEntity EOF ;
    public final void entryRuleEntity() throws RecognitionException {
        try {
            // InternalSocialRequest.g:79:1: ( ruleEntity EOF )
            // InternalSocialRequest.g:80:1: ruleEntity EOF
            {
             before(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_1);
            ruleEntity();

            state._fsp--;

             after(grammarAccess.getEntityRule()); 
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
    // $ANTLR end "entryRuleEntity"


    // $ANTLR start "ruleEntity"
    // InternalSocialRequest.g:87:1: ruleEntity : ( ( rule__Entity__Group__0 ) ) ;
    public final void ruleEntity() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:91:2: ( ( ( rule__Entity__Group__0 ) ) )
            // InternalSocialRequest.g:92:2: ( ( rule__Entity__Group__0 ) )
            {
            // InternalSocialRequest.g:92:2: ( ( rule__Entity__Group__0 ) )
            // InternalSocialRequest.g:93:3: ( rule__Entity__Group__0 )
            {
             before(grammarAccess.getEntityAccess().getGroup()); 
            // InternalSocialRequest.g:94:3: ( rule__Entity__Group__0 )
            // InternalSocialRequest.g:94:4: rule__Entity__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Entity__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getGroup()); 

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
    // $ANTLR end "ruleEntity"


    // $ANTLR start "entryRuleAttribute"
    // InternalSocialRequest.g:103:1: entryRuleAttribute : ruleAttribute EOF ;
    public final void entryRuleAttribute() throws RecognitionException {
        try {
            // InternalSocialRequest.g:104:1: ( ruleAttribute EOF )
            // InternalSocialRequest.g:105:1: ruleAttribute EOF
            {
             before(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_1);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getAttributeRule()); 
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
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // InternalSocialRequest.g:112:1: ruleAttribute : ( ( rule__Attribute__Group__0 ) ) ;
    public final void ruleAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:116:2: ( ( ( rule__Attribute__Group__0 ) ) )
            // InternalSocialRequest.g:117:2: ( ( rule__Attribute__Group__0 ) )
            {
            // InternalSocialRequest.g:117:2: ( ( rule__Attribute__Group__0 ) )
            // InternalSocialRequest.g:118:3: ( rule__Attribute__Group__0 )
            {
             before(grammarAccess.getAttributeAccess().getGroup()); 
            // InternalSocialRequest.g:119:3: ( rule__Attribute__Group__0 )
            // InternalSocialRequest.g:119:4: rule__Attribute__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getGroup()); 

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
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleTypeReference"
    // InternalSocialRequest.g:128:1: entryRuleTypeReference : ruleTypeReference EOF ;
    public final void entryRuleTypeReference() throws RecognitionException {
        try {
            // InternalSocialRequest.g:129:1: ( ruleTypeReference EOF )
            // InternalSocialRequest.g:130:1: ruleTypeReference EOF
            {
             before(grammarAccess.getTypeReferenceRule()); 
            pushFollow(FOLLOW_1);
            ruleTypeReference();

            state._fsp--;

             after(grammarAccess.getTypeReferenceRule()); 
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
    // $ANTLR end "entryRuleTypeReference"


    // $ANTLR start "ruleTypeReference"
    // InternalSocialRequest.g:137:1: ruleTypeReference : ( ( rule__TypeReference__Alternatives ) ) ;
    public final void ruleTypeReference() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:141:2: ( ( ( rule__TypeReference__Alternatives ) ) )
            // InternalSocialRequest.g:142:2: ( ( rule__TypeReference__Alternatives ) )
            {
            // InternalSocialRequest.g:142:2: ( ( rule__TypeReference__Alternatives ) )
            // InternalSocialRequest.g:143:3: ( rule__TypeReference__Alternatives )
            {
             before(grammarAccess.getTypeReferenceAccess().getAlternatives()); 
            // InternalSocialRequest.g:144:3: ( rule__TypeReference__Alternatives )
            // InternalSocialRequest.g:144:4: rule__TypeReference__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__TypeReference__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTypeReferenceAccess().getAlternatives()); 

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
    // $ANTLR end "ruleTypeReference"


    // $ANTLR start "entryRuleEntityTypeReference"
    // InternalSocialRequest.g:153:1: entryRuleEntityTypeReference : ruleEntityTypeReference EOF ;
    public final void entryRuleEntityTypeReference() throws RecognitionException {
        try {
            // InternalSocialRequest.g:154:1: ( ruleEntityTypeReference EOF )
            // InternalSocialRequest.g:155:1: ruleEntityTypeReference EOF
            {
             before(grammarAccess.getEntityTypeReferenceRule()); 
            pushFollow(FOLLOW_1);
            ruleEntityTypeReference();

            state._fsp--;

             after(grammarAccess.getEntityTypeReferenceRule()); 
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
    // $ANTLR end "entryRuleEntityTypeReference"


    // $ANTLR start "ruleEntityTypeReference"
    // InternalSocialRequest.g:162:1: ruleEntityTypeReference : ( ( rule__EntityTypeReference__TypeAssignment ) ) ;
    public final void ruleEntityTypeReference() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:166:2: ( ( ( rule__EntityTypeReference__TypeAssignment ) ) )
            // InternalSocialRequest.g:167:2: ( ( rule__EntityTypeReference__TypeAssignment ) )
            {
            // InternalSocialRequest.g:167:2: ( ( rule__EntityTypeReference__TypeAssignment ) )
            // InternalSocialRequest.g:168:3: ( rule__EntityTypeReference__TypeAssignment )
            {
             before(grammarAccess.getEntityTypeReferenceAccess().getTypeAssignment()); 
            // InternalSocialRequest.g:169:3: ( rule__EntityTypeReference__TypeAssignment )
            // InternalSocialRequest.g:169:4: rule__EntityTypeReference__TypeAssignment
            {
            pushFollow(FOLLOW_2);
            rule__EntityTypeReference__TypeAssignment();

            state._fsp--;


            }

             after(grammarAccess.getEntityTypeReferenceAccess().getTypeAssignment()); 

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
    // $ANTLR end "ruleEntityTypeReference"


    // $ANTLR start "entryRuleDataTypeReference"
    // InternalSocialRequest.g:178:1: entryRuleDataTypeReference : ruleDataTypeReference EOF ;
    public final void entryRuleDataTypeReference() throws RecognitionException {
        try {
            // InternalSocialRequest.g:179:1: ( ruleDataTypeReference EOF )
            // InternalSocialRequest.g:180:1: ruleDataTypeReference EOF
            {
             before(grammarAccess.getDataTypeReferenceRule()); 
            pushFollow(FOLLOW_1);
            ruleDataTypeReference();

            state._fsp--;

             after(grammarAccess.getDataTypeReferenceRule()); 
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
    // $ANTLR end "entryRuleDataTypeReference"


    // $ANTLR start "ruleDataTypeReference"
    // InternalSocialRequest.g:187:1: ruleDataTypeReference : ( ( rule__DataTypeReference__TypeAssignment ) ) ;
    public final void ruleDataTypeReference() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:191:2: ( ( ( rule__DataTypeReference__TypeAssignment ) ) )
            // InternalSocialRequest.g:192:2: ( ( rule__DataTypeReference__TypeAssignment ) )
            {
            // InternalSocialRequest.g:192:2: ( ( rule__DataTypeReference__TypeAssignment ) )
            // InternalSocialRequest.g:193:3: ( rule__DataTypeReference__TypeAssignment )
            {
             before(grammarAccess.getDataTypeReferenceAccess().getTypeAssignment()); 
            // InternalSocialRequest.g:194:3: ( rule__DataTypeReference__TypeAssignment )
            // InternalSocialRequest.g:194:4: rule__DataTypeReference__TypeAssignment
            {
            pushFollow(FOLLOW_2);
            rule__DataTypeReference__TypeAssignment();

            state._fsp--;


            }

             after(grammarAccess.getDataTypeReferenceAccess().getTypeAssignment()); 

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
    // $ANTLR end "ruleDataTypeReference"


    // $ANTLR start "entryRuleModifier"
    // InternalSocialRequest.g:203:1: entryRuleModifier : ruleModifier EOF ;
    public final void entryRuleModifier() throws RecognitionException {
        try {
            // InternalSocialRequest.g:204:1: ( ruleModifier EOF )
            // InternalSocialRequest.g:205:1: ruleModifier EOF
            {
             before(grammarAccess.getModifierRule()); 
            pushFollow(FOLLOW_1);
            ruleModifier();

            state._fsp--;

             after(grammarAccess.getModifierRule()); 
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
    // $ANTLR end "entryRuleModifier"


    // $ANTLR start "ruleModifier"
    // InternalSocialRequest.g:212:1: ruleModifier : ( ( rule__Modifier__Alternatives ) ) ;
    public final void ruleModifier() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:216:2: ( ( ( rule__Modifier__Alternatives ) ) )
            // InternalSocialRequest.g:217:2: ( ( rule__Modifier__Alternatives ) )
            {
            // InternalSocialRequest.g:217:2: ( ( rule__Modifier__Alternatives ) )
            // InternalSocialRequest.g:218:3: ( rule__Modifier__Alternatives )
            {
             before(grammarAccess.getModifierAccess().getAlternatives()); 
            // InternalSocialRequest.g:219:3: ( rule__Modifier__Alternatives )
            // InternalSocialRequest.g:219:4: rule__Modifier__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Modifier__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getModifierAccess().getAlternatives()); 

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
    // $ANTLR end "ruleModifier"


    // $ANTLR start "entryRuleValidation"
    // InternalSocialRequest.g:228:1: entryRuleValidation : ruleValidation EOF ;
    public final void entryRuleValidation() throws RecognitionException {
        try {
            // InternalSocialRequest.g:229:1: ( ruleValidation EOF )
            // InternalSocialRequest.g:230:1: ruleValidation EOF
            {
             before(grammarAccess.getValidationRule()); 
            pushFollow(FOLLOW_1);
            ruleValidation();

            state._fsp--;

             after(grammarAccess.getValidationRule()); 
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
    // $ANTLR end "entryRuleValidation"


    // $ANTLR start "ruleValidation"
    // InternalSocialRequest.g:237:1: ruleValidation : ( ( rule__Validation__Alternatives ) ) ;
    public final void ruleValidation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:241:2: ( ( ( rule__Validation__Alternatives ) ) )
            // InternalSocialRequest.g:242:2: ( ( rule__Validation__Alternatives ) )
            {
            // InternalSocialRequest.g:242:2: ( ( rule__Validation__Alternatives ) )
            // InternalSocialRequest.g:243:3: ( rule__Validation__Alternatives )
            {
             before(grammarAccess.getValidationAccess().getAlternatives()); 
            // InternalSocialRequest.g:244:3: ( rule__Validation__Alternatives )
            // InternalSocialRequest.g:244:4: rule__Validation__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Validation__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getValidationAccess().getAlternatives()); 

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
    // $ANTLR end "ruleValidation"


    // $ANTLR start "entryRuleRepository"
    // InternalSocialRequest.g:253:1: entryRuleRepository : ruleRepository EOF ;
    public final void entryRuleRepository() throws RecognitionException {
        try {
            // InternalSocialRequest.g:254:1: ( ruleRepository EOF )
            // InternalSocialRequest.g:255:1: ruleRepository EOF
            {
             before(grammarAccess.getRepositoryRule()); 
            pushFollow(FOLLOW_1);
            ruleRepository();

            state._fsp--;

             after(grammarAccess.getRepositoryRule()); 
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
    // $ANTLR end "entryRuleRepository"


    // $ANTLR start "ruleRepository"
    // InternalSocialRequest.g:262:1: ruleRepository : ( ( rule__Repository__Group__0 ) ) ;
    public final void ruleRepository() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:266:2: ( ( ( rule__Repository__Group__0 ) ) )
            // InternalSocialRequest.g:267:2: ( ( rule__Repository__Group__0 ) )
            {
            // InternalSocialRequest.g:267:2: ( ( rule__Repository__Group__0 ) )
            // InternalSocialRequest.g:268:3: ( rule__Repository__Group__0 )
            {
             before(grammarAccess.getRepositoryAccess().getGroup()); 
            // InternalSocialRequest.g:269:3: ( rule__Repository__Group__0 )
            // InternalSocialRequest.g:269:4: rule__Repository__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Repository__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRepositoryAccess().getGroup()); 

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
    // $ANTLR end "ruleRepository"


    // $ANTLR start "entryRuleQuery"
    // InternalSocialRequest.g:278:1: entryRuleQuery : ruleQuery EOF ;
    public final void entryRuleQuery() throws RecognitionException {
        try {
            // InternalSocialRequest.g:279:1: ( ruleQuery EOF )
            // InternalSocialRequest.g:280:1: ruleQuery EOF
            {
             before(grammarAccess.getQueryRule()); 
            pushFollow(FOLLOW_1);
            ruleQuery();

            state._fsp--;

             after(grammarAccess.getQueryRule()); 
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
    // $ANTLR end "entryRuleQuery"


    // $ANTLR start "ruleQuery"
    // InternalSocialRequest.g:287:1: ruleQuery : ( ( rule__Query__Group__0 ) ) ;
    public final void ruleQuery() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:291:2: ( ( ( rule__Query__Group__0 ) ) )
            // InternalSocialRequest.g:292:2: ( ( rule__Query__Group__0 ) )
            {
            // InternalSocialRequest.g:292:2: ( ( rule__Query__Group__0 ) )
            // InternalSocialRequest.g:293:3: ( rule__Query__Group__0 )
            {
             before(grammarAccess.getQueryAccess().getGroup()); 
            // InternalSocialRequest.g:294:3: ( rule__Query__Group__0 )
            // InternalSocialRequest.g:294:4: rule__Query__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Query__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQueryAccess().getGroup()); 

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
    // $ANTLR end "ruleQuery"


    // $ANTLR start "entryRuleParam"
    // InternalSocialRequest.g:303:1: entryRuleParam : ruleParam EOF ;
    public final void entryRuleParam() throws RecognitionException {
        try {
            // InternalSocialRequest.g:304:1: ( ruleParam EOF )
            // InternalSocialRequest.g:305:1: ruleParam EOF
            {
             before(grammarAccess.getParamRule()); 
            pushFollow(FOLLOW_1);
            ruleParam();

            state._fsp--;

             after(grammarAccess.getParamRule()); 
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
    // $ANTLR end "entryRuleParam"


    // $ANTLR start "ruleParam"
    // InternalSocialRequest.g:312:1: ruleParam : ( ( rule__Param__Group__0 ) ) ;
    public final void ruleParam() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:316:2: ( ( ( rule__Param__Group__0 ) ) )
            // InternalSocialRequest.g:317:2: ( ( rule__Param__Group__0 ) )
            {
            // InternalSocialRequest.g:317:2: ( ( rule__Param__Group__0 ) )
            // InternalSocialRequest.g:318:3: ( rule__Param__Group__0 )
            {
             before(grammarAccess.getParamAccess().getGroup()); 
            // InternalSocialRequest.g:319:3: ( rule__Param__Group__0 )
            // InternalSocialRequest.g:319:4: rule__Param__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Param__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParamAccess().getGroup()); 

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
    // $ANTLR end "ruleParam"


    // $ANTLR start "entryRuleSQLQuery"
    // InternalSocialRequest.g:328:1: entryRuleSQLQuery : ruleSQLQuery EOF ;
    public final void entryRuleSQLQuery() throws RecognitionException {
        try {
            // InternalSocialRequest.g:329:1: ( ruleSQLQuery EOF )
            // InternalSocialRequest.g:330:1: ruleSQLQuery EOF
            {
             before(grammarAccess.getSQLQueryRule()); 
            pushFollow(FOLLOW_1);
            ruleSQLQuery();

            state._fsp--;

             after(grammarAccess.getSQLQueryRule()); 
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
    // $ANTLR end "entryRuleSQLQuery"


    // $ANTLR start "ruleSQLQuery"
    // InternalSocialRequest.g:337:1: ruleSQLQuery : ( ( rule__SQLQuery__Group__0 ) ) ;
    public final void ruleSQLQuery() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:341:2: ( ( ( rule__SQLQuery__Group__0 ) ) )
            // InternalSocialRequest.g:342:2: ( ( rule__SQLQuery__Group__0 ) )
            {
            // InternalSocialRequest.g:342:2: ( ( rule__SQLQuery__Group__0 ) )
            // InternalSocialRequest.g:343:3: ( rule__SQLQuery__Group__0 )
            {
             before(grammarAccess.getSQLQueryAccess().getGroup()); 
            // InternalSocialRequest.g:344:3: ( rule__SQLQuery__Group__0 )
            // InternalSocialRequest.g:344:4: rule__SQLQuery__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SQLQuery__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSQLQueryAccess().getGroup()); 

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
    // $ANTLR end "ruleSQLQuery"


    // $ANTLR start "entryRuleSelect"
    // InternalSocialRequest.g:353:1: entryRuleSelect : ruleSelect EOF ;
    public final void entryRuleSelect() throws RecognitionException {
        try {
            // InternalSocialRequest.g:354:1: ( ruleSelect EOF )
            // InternalSocialRequest.g:355:1: ruleSelect EOF
            {
             before(grammarAccess.getSelectRule()); 
            pushFollow(FOLLOW_1);
            ruleSelect();

            state._fsp--;

             after(grammarAccess.getSelectRule()); 
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
    // $ANTLR end "entryRuleSelect"


    // $ANTLR start "ruleSelect"
    // InternalSocialRequest.g:362:1: ruleSelect : ( ( rule__Select__Group__0 ) ) ;
    public final void ruleSelect() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:366:2: ( ( ( rule__Select__Group__0 ) ) )
            // InternalSocialRequest.g:367:2: ( ( rule__Select__Group__0 ) )
            {
            // InternalSocialRequest.g:367:2: ( ( rule__Select__Group__0 ) )
            // InternalSocialRequest.g:368:3: ( rule__Select__Group__0 )
            {
             before(grammarAccess.getSelectAccess().getGroup()); 
            // InternalSocialRequest.g:369:3: ( rule__Select__Group__0 )
            // InternalSocialRequest.g:369:4: rule__Select__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Select__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSelectAccess().getGroup()); 

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
    // $ANTLR end "ruleSelect"


    // $ANTLR start "entryRuleFrom"
    // InternalSocialRequest.g:378:1: entryRuleFrom : ruleFrom EOF ;
    public final void entryRuleFrom() throws RecognitionException {
        try {
            // InternalSocialRequest.g:379:1: ( ruleFrom EOF )
            // InternalSocialRequest.g:380:1: ruleFrom EOF
            {
             before(grammarAccess.getFromRule()); 
            pushFollow(FOLLOW_1);
            ruleFrom();

            state._fsp--;

             after(grammarAccess.getFromRule()); 
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
    // $ANTLR end "entryRuleFrom"


    // $ANTLR start "ruleFrom"
    // InternalSocialRequest.g:387:1: ruleFrom : ( ( rule__From__Group__0 ) ) ;
    public final void ruleFrom() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:391:2: ( ( ( rule__From__Group__0 ) ) )
            // InternalSocialRequest.g:392:2: ( ( rule__From__Group__0 ) )
            {
            // InternalSocialRequest.g:392:2: ( ( rule__From__Group__0 ) )
            // InternalSocialRequest.g:393:3: ( rule__From__Group__0 )
            {
             before(grammarAccess.getFromAccess().getGroup()); 
            // InternalSocialRequest.g:394:3: ( rule__From__Group__0 )
            // InternalSocialRequest.g:394:4: rule__From__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__From__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFromAccess().getGroup()); 

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
    // $ANTLR end "ruleFrom"


    // $ANTLR start "entryRuleJoin"
    // InternalSocialRequest.g:403:1: entryRuleJoin : ruleJoin EOF ;
    public final void entryRuleJoin() throws RecognitionException {
        try {
            // InternalSocialRequest.g:404:1: ( ruleJoin EOF )
            // InternalSocialRequest.g:405:1: ruleJoin EOF
            {
             before(grammarAccess.getJoinRule()); 
            pushFollow(FOLLOW_1);
            ruleJoin();

            state._fsp--;

             after(grammarAccess.getJoinRule()); 
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
    // $ANTLR end "entryRuleJoin"


    // $ANTLR start "ruleJoin"
    // InternalSocialRequest.g:412:1: ruleJoin : ( ( rule__Join__Group__0 ) ) ;
    public final void ruleJoin() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:416:2: ( ( ( rule__Join__Group__0 ) ) )
            // InternalSocialRequest.g:417:2: ( ( rule__Join__Group__0 ) )
            {
            // InternalSocialRequest.g:417:2: ( ( rule__Join__Group__0 ) )
            // InternalSocialRequest.g:418:3: ( rule__Join__Group__0 )
            {
             before(grammarAccess.getJoinAccess().getGroup()); 
            // InternalSocialRequest.g:419:3: ( rule__Join__Group__0 )
            // InternalSocialRequest.g:419:4: rule__Join__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Join__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getJoinAccess().getGroup()); 

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
    // $ANTLR end "ruleJoin"


    // $ANTLR start "entryRuleWhere"
    // InternalSocialRequest.g:428:1: entryRuleWhere : ruleWhere EOF ;
    public final void entryRuleWhere() throws RecognitionException {
        try {
            // InternalSocialRequest.g:429:1: ( ruleWhere EOF )
            // InternalSocialRequest.g:430:1: ruleWhere EOF
            {
             before(grammarAccess.getWhereRule()); 
            pushFollow(FOLLOW_1);
            ruleWhere();

            state._fsp--;

             after(grammarAccess.getWhereRule()); 
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
    // $ANTLR end "entryRuleWhere"


    // $ANTLR start "ruleWhere"
    // InternalSocialRequest.g:437:1: ruleWhere : ( ( rule__Where__Group__0 ) ) ;
    public final void ruleWhere() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:441:2: ( ( ( rule__Where__Group__0 ) ) )
            // InternalSocialRequest.g:442:2: ( ( rule__Where__Group__0 ) )
            {
            // InternalSocialRequest.g:442:2: ( ( rule__Where__Group__0 ) )
            // InternalSocialRequest.g:443:3: ( rule__Where__Group__0 )
            {
             before(grammarAccess.getWhereAccess().getGroup()); 
            // InternalSocialRequest.g:444:3: ( rule__Where__Group__0 )
            // InternalSocialRequest.g:444:4: rule__Where__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Where__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getWhereAccess().getGroup()); 

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
    // $ANTLR end "ruleWhere"


    // $ANTLR start "entryRuleOrder"
    // InternalSocialRequest.g:453:1: entryRuleOrder : ruleOrder EOF ;
    public final void entryRuleOrder() throws RecognitionException {
        try {
            // InternalSocialRequest.g:454:1: ( ruleOrder EOF )
            // InternalSocialRequest.g:455:1: ruleOrder EOF
            {
             before(grammarAccess.getOrderRule()); 
            pushFollow(FOLLOW_1);
            ruleOrder();

            state._fsp--;

             after(grammarAccess.getOrderRule()); 
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
    // $ANTLR end "entryRuleOrder"


    // $ANTLR start "ruleOrder"
    // InternalSocialRequest.g:462:1: ruleOrder : ( ( rule__Order__Group__0 ) ) ;
    public final void ruleOrder() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:466:2: ( ( ( rule__Order__Group__0 ) ) )
            // InternalSocialRequest.g:467:2: ( ( rule__Order__Group__0 ) )
            {
            // InternalSocialRequest.g:467:2: ( ( rule__Order__Group__0 ) )
            // InternalSocialRequest.g:468:3: ( rule__Order__Group__0 )
            {
             before(grammarAccess.getOrderAccess().getGroup()); 
            // InternalSocialRequest.g:469:3: ( rule__Order__Group__0 )
            // InternalSocialRequest.g:469:4: rule__Order__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Order__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOrderAccess().getGroup()); 

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
    // $ANTLR end "ruleOrder"


    // $ANTLR start "ruleBasicValidation"
    // InternalSocialRequest.g:478:1: ruleBasicValidation : ( ( rule__BasicValidation__Alternatives ) ) ;
    public final void ruleBasicValidation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:482:1: ( ( ( rule__BasicValidation__Alternatives ) ) )
            // InternalSocialRequest.g:483:2: ( ( rule__BasicValidation__Alternatives ) )
            {
            // InternalSocialRequest.g:483:2: ( ( rule__BasicValidation__Alternatives ) )
            // InternalSocialRequest.g:484:3: ( rule__BasicValidation__Alternatives )
            {
             before(grammarAccess.getBasicValidationAccess().getAlternatives()); 
            // InternalSocialRequest.g:485:3: ( rule__BasicValidation__Alternatives )
            // InternalSocialRequest.g:485:4: rule__BasicValidation__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__BasicValidation__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getBasicValidationAccess().getAlternatives()); 

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
    // $ANTLR end "ruleBasicValidation"


    // $ANTLR start "ruleGenerationType"
    // InternalSocialRequest.g:494:1: ruleGenerationType : ( ( rule__GenerationType__Alternatives ) ) ;
    public final void ruleGenerationType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:498:1: ( ( ( rule__GenerationType__Alternatives ) ) )
            // InternalSocialRequest.g:499:2: ( ( rule__GenerationType__Alternatives ) )
            {
            // InternalSocialRequest.g:499:2: ( ( rule__GenerationType__Alternatives ) )
            // InternalSocialRequest.g:500:3: ( rule__GenerationType__Alternatives )
            {
             before(grammarAccess.getGenerationTypeAccess().getAlternatives()); 
            // InternalSocialRequest.g:501:3: ( rule__GenerationType__Alternatives )
            // InternalSocialRequest.g:501:4: rule__GenerationType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__GenerationType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getGenerationTypeAccess().getAlternatives()); 

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
    // $ANTLR end "ruleGenerationType"


    // $ANTLR start "ruleFetchType"
    // InternalSocialRequest.g:510:1: ruleFetchType : ( ( rule__FetchType__Alternatives ) ) ;
    public final void ruleFetchType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:514:1: ( ( ( rule__FetchType__Alternatives ) ) )
            // InternalSocialRequest.g:515:2: ( ( rule__FetchType__Alternatives ) )
            {
            // InternalSocialRequest.g:515:2: ( ( rule__FetchType__Alternatives ) )
            // InternalSocialRequest.g:516:3: ( rule__FetchType__Alternatives )
            {
             before(grammarAccess.getFetchTypeAccess().getAlternatives()); 
            // InternalSocialRequest.g:517:3: ( rule__FetchType__Alternatives )
            // InternalSocialRequest.g:517:4: rule__FetchType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__FetchType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getFetchTypeAccess().getAlternatives()); 

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
    // $ANTLR end "ruleFetchType"


    // $ANTLR start "ruleAssociation"
    // InternalSocialRequest.g:526:1: ruleAssociation : ( ( rule__Association__Alternatives ) ) ;
    public final void ruleAssociation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:530:1: ( ( ( rule__Association__Alternatives ) ) )
            // InternalSocialRequest.g:531:2: ( ( rule__Association__Alternatives ) )
            {
            // InternalSocialRequest.g:531:2: ( ( rule__Association__Alternatives ) )
            // InternalSocialRequest.g:532:3: ( rule__Association__Alternatives )
            {
             before(grammarAccess.getAssociationAccess().getAlternatives()); 
            // InternalSocialRequest.g:533:3: ( rule__Association__Alternatives )
            // InternalSocialRequest.g:533:4: rule__Association__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Association__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAssociationAccess().getAlternatives()); 

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
    // $ANTLR end "ruleAssociation"


    // $ANTLR start "ruleDataType"
    // InternalSocialRequest.g:542:1: ruleDataType : ( ( rule__DataType__Alternatives ) ) ;
    public final void ruleDataType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:546:1: ( ( ( rule__DataType__Alternatives ) ) )
            // InternalSocialRequest.g:547:2: ( ( rule__DataType__Alternatives ) )
            {
            // InternalSocialRequest.g:547:2: ( ( rule__DataType__Alternatives ) )
            // InternalSocialRequest.g:548:3: ( rule__DataType__Alternatives )
            {
             before(grammarAccess.getDataTypeAccess().getAlternatives()); 
            // InternalSocialRequest.g:549:3: ( rule__DataType__Alternatives )
            // InternalSocialRequest.g:549:4: rule__DataType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__DataType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDataTypeAccess().getAlternatives()); 

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
    // $ANTLR end "ruleDataType"


    // $ANTLR start "ruleJoinType"
    // InternalSocialRequest.g:558:1: ruleJoinType : ( ( rule__JoinType__Alternatives ) ) ;
    public final void ruleJoinType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:562:1: ( ( ( rule__JoinType__Alternatives ) ) )
            // InternalSocialRequest.g:563:2: ( ( rule__JoinType__Alternatives ) )
            {
            // InternalSocialRequest.g:563:2: ( ( rule__JoinType__Alternatives ) )
            // InternalSocialRequest.g:564:3: ( rule__JoinType__Alternatives )
            {
             before(grammarAccess.getJoinTypeAccess().getAlternatives()); 
            // InternalSocialRequest.g:565:3: ( rule__JoinType__Alternatives )
            // InternalSocialRequest.g:565:4: rule__JoinType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__JoinType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getJoinTypeAccess().getAlternatives()); 

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
    // $ANTLR end "ruleJoinType"


    // $ANTLR start "rule__TypeReference__Alternatives"
    // InternalSocialRequest.g:573:1: rule__TypeReference__Alternatives : ( ( ruleEntityTypeReference ) | ( ruleDataTypeReference ) );
    public final void rule__TypeReference__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:577:1: ( ( ruleEntityTypeReference ) | ( ruleDataTypeReference ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_ID) ) {
                alt1=1;
            }
            else if ( ((LA1_0>=27 && LA1_0<=34)) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalSocialRequest.g:578:2: ( ruleEntityTypeReference )
                    {
                    // InternalSocialRequest.g:578:2: ( ruleEntityTypeReference )
                    // InternalSocialRequest.g:579:3: ruleEntityTypeReference
                    {
                     before(grammarAccess.getTypeReferenceAccess().getEntityTypeReferenceParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleEntityTypeReference();

                    state._fsp--;

                     after(grammarAccess.getTypeReferenceAccess().getEntityTypeReferenceParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSocialRequest.g:584:2: ( ruleDataTypeReference )
                    {
                    // InternalSocialRequest.g:584:2: ( ruleDataTypeReference )
                    // InternalSocialRequest.g:585:3: ruleDataTypeReference
                    {
                     before(grammarAccess.getTypeReferenceAccess().getDataTypeReferenceParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleDataTypeReference();

                    state._fsp--;

                     after(grammarAccess.getTypeReferenceAccess().getDataTypeReferenceParserRuleCall_1()); 

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
    // $ANTLR end "rule__TypeReference__Alternatives"


    // $ANTLR start "rule__Modifier__Alternatives"
    // InternalSocialRequest.g:594:1: rule__Modifier__Alternatives : ( ( ( rule__Modifier__IsLOBAssignment_0 ) ) | ( ( rule__Modifier__IsTransientAssignment_1 ) ) | ( ( rule__Modifier__Group_2__0 ) ) );
    public final void rule__Modifier__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:598:1: ( ( ( rule__Modifier__IsLOBAssignment_0 ) ) | ( ( rule__Modifier__IsTransientAssignment_1 ) ) | ( ( rule__Modifier__Group_2__0 ) ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 62:
                {
                alt2=1;
                }
                break;
            case 63:
                {
                alt2=2;
                }
                break;
            case 64:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalSocialRequest.g:599:2: ( ( rule__Modifier__IsLOBAssignment_0 ) )
                    {
                    // InternalSocialRequest.g:599:2: ( ( rule__Modifier__IsLOBAssignment_0 ) )
                    // InternalSocialRequest.g:600:3: ( rule__Modifier__IsLOBAssignment_0 )
                    {
                     before(grammarAccess.getModifierAccess().getIsLOBAssignment_0()); 
                    // InternalSocialRequest.g:601:3: ( rule__Modifier__IsLOBAssignment_0 )
                    // InternalSocialRequest.g:601:4: rule__Modifier__IsLOBAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Modifier__IsLOBAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getModifierAccess().getIsLOBAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSocialRequest.g:605:2: ( ( rule__Modifier__IsTransientAssignment_1 ) )
                    {
                    // InternalSocialRequest.g:605:2: ( ( rule__Modifier__IsTransientAssignment_1 ) )
                    // InternalSocialRequest.g:606:3: ( rule__Modifier__IsTransientAssignment_1 )
                    {
                     before(grammarAccess.getModifierAccess().getIsTransientAssignment_1()); 
                    // InternalSocialRequest.g:607:3: ( rule__Modifier__IsTransientAssignment_1 )
                    // InternalSocialRequest.g:607:4: rule__Modifier__IsTransientAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Modifier__IsTransientAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getModifierAccess().getIsTransientAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSocialRequest.g:611:2: ( ( rule__Modifier__Group_2__0 ) )
                    {
                    // InternalSocialRequest.g:611:2: ( ( rule__Modifier__Group_2__0 ) )
                    // InternalSocialRequest.g:612:3: ( rule__Modifier__Group_2__0 )
                    {
                     before(grammarAccess.getModifierAccess().getGroup_2()); 
                    // InternalSocialRequest.g:613:3: ( rule__Modifier__Group_2__0 )
                    // InternalSocialRequest.g:613:4: rule__Modifier__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Modifier__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getModifierAccess().getGroup_2()); 

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
    // $ANTLR end "rule__Modifier__Alternatives"


    // $ANTLR start "rule__Validation__Alternatives"
    // InternalSocialRequest.g:621:1: rule__Validation__Alternatives : ( ( ( rule__Validation__Group_0__0 ) ) | ( ( rule__Validation__Group_1__0 ) ) | ( ( rule__Validation__Group_2__0 ) ) | ( ( rule__Validation__ValidatorAssignment_3 ) ) );
    public final void rule__Validation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:625:1: ( ( ( rule__Validation__Group_0__0 ) ) | ( ( rule__Validation__Group_1__0 ) ) | ( ( rule__Validation__Group_2__0 ) ) | ( ( rule__Validation__ValidatorAssignment_3 ) ) )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 49:
                {
                alt3=1;
                }
                break;
            case 50:
                {
                alt3=2;
                }
                break;
            case 51:
                {
                alt3=3;
                }
                break;
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
                {
                alt3=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalSocialRequest.g:626:2: ( ( rule__Validation__Group_0__0 ) )
                    {
                    // InternalSocialRequest.g:626:2: ( ( rule__Validation__Group_0__0 ) )
                    // InternalSocialRequest.g:627:3: ( rule__Validation__Group_0__0 )
                    {
                     before(grammarAccess.getValidationAccess().getGroup_0()); 
                    // InternalSocialRequest.g:628:3: ( rule__Validation__Group_0__0 )
                    // InternalSocialRequest.g:628:4: rule__Validation__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Validation__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getValidationAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSocialRequest.g:632:2: ( ( rule__Validation__Group_1__0 ) )
                    {
                    // InternalSocialRequest.g:632:2: ( ( rule__Validation__Group_1__0 ) )
                    // InternalSocialRequest.g:633:3: ( rule__Validation__Group_1__0 )
                    {
                     before(grammarAccess.getValidationAccess().getGroup_1()); 
                    // InternalSocialRequest.g:634:3: ( rule__Validation__Group_1__0 )
                    // InternalSocialRequest.g:634:4: rule__Validation__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Validation__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getValidationAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSocialRequest.g:638:2: ( ( rule__Validation__Group_2__0 ) )
                    {
                    // InternalSocialRequest.g:638:2: ( ( rule__Validation__Group_2__0 ) )
                    // InternalSocialRequest.g:639:3: ( rule__Validation__Group_2__0 )
                    {
                     before(grammarAccess.getValidationAccess().getGroup_2()); 
                    // InternalSocialRequest.g:640:3: ( rule__Validation__Group_2__0 )
                    // InternalSocialRequest.g:640:4: rule__Validation__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Validation__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getValidationAccess().getGroup_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalSocialRequest.g:644:2: ( ( rule__Validation__ValidatorAssignment_3 ) )
                    {
                    // InternalSocialRequest.g:644:2: ( ( rule__Validation__ValidatorAssignment_3 ) )
                    // InternalSocialRequest.g:645:3: ( rule__Validation__ValidatorAssignment_3 )
                    {
                     before(grammarAccess.getValidationAccess().getValidatorAssignment_3()); 
                    // InternalSocialRequest.g:646:3: ( rule__Validation__ValidatorAssignment_3 )
                    // InternalSocialRequest.g:646:4: rule__Validation__ValidatorAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Validation__ValidatorAssignment_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getValidationAccess().getValidatorAssignment_3()); 

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
    // $ANTLR end "rule__Validation__Alternatives"


    // $ANTLR start "rule__BasicValidation__Alternatives"
    // InternalSocialRequest.g:654:1: rule__BasicValidation__Alternatives : ( ( ( 'not-null' ) ) | ( ( 'not-blank' ) ) | ( ( 'past' ) ) | ( ( 'unique' ) ) | ( ( 'valid-email' ) ) );
    public final void rule__BasicValidation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:658:1: ( ( ( 'not-null' ) ) | ( ( 'not-blank' ) ) | ( ( 'past' ) ) | ( ( 'unique' ) ) | ( ( 'valid-email' ) ) )
            int alt4=5;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt4=1;
                }
                break;
            case 13:
                {
                alt4=2;
                }
                break;
            case 14:
                {
                alt4=3;
                }
                break;
            case 15:
                {
                alt4=4;
                }
                break;
            case 16:
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
                    // InternalSocialRequest.g:659:2: ( ( 'not-null' ) )
                    {
                    // InternalSocialRequest.g:659:2: ( ( 'not-null' ) )
                    // InternalSocialRequest.g:660:3: ( 'not-null' )
                    {
                     before(grammarAccess.getBasicValidationAccess().getNOT_NULLEnumLiteralDeclaration_0()); 
                    // InternalSocialRequest.g:661:3: ( 'not-null' )
                    // InternalSocialRequest.g:661:4: 'not-null'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getBasicValidationAccess().getNOT_NULLEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSocialRequest.g:665:2: ( ( 'not-blank' ) )
                    {
                    // InternalSocialRequest.g:665:2: ( ( 'not-blank' ) )
                    // InternalSocialRequest.g:666:3: ( 'not-blank' )
                    {
                     before(grammarAccess.getBasicValidationAccess().getNOT_BLANKEnumLiteralDeclaration_1()); 
                    // InternalSocialRequest.g:667:3: ( 'not-blank' )
                    // InternalSocialRequest.g:667:4: 'not-blank'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getBasicValidationAccess().getNOT_BLANKEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSocialRequest.g:671:2: ( ( 'past' ) )
                    {
                    // InternalSocialRequest.g:671:2: ( ( 'past' ) )
                    // InternalSocialRequest.g:672:3: ( 'past' )
                    {
                     before(grammarAccess.getBasicValidationAccess().getPASTEnumLiteralDeclaration_2()); 
                    // InternalSocialRequest.g:673:3: ( 'past' )
                    // InternalSocialRequest.g:673:4: 'past'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getBasicValidationAccess().getPASTEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalSocialRequest.g:677:2: ( ( 'unique' ) )
                    {
                    // InternalSocialRequest.g:677:2: ( ( 'unique' ) )
                    // InternalSocialRequest.g:678:3: ( 'unique' )
                    {
                     before(grammarAccess.getBasicValidationAccess().getUNIQUEEnumLiteralDeclaration_3()); 
                    // InternalSocialRequest.g:679:3: ( 'unique' )
                    // InternalSocialRequest.g:679:4: 'unique'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getBasicValidationAccess().getUNIQUEEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalSocialRequest.g:683:2: ( ( 'valid-email' ) )
                    {
                    // InternalSocialRequest.g:683:2: ( ( 'valid-email' ) )
                    // InternalSocialRequest.g:684:3: ( 'valid-email' )
                    {
                     before(grammarAccess.getBasicValidationAccess().getEMAILEnumLiteralDeclaration_4()); 
                    // InternalSocialRequest.g:685:3: ( 'valid-email' )
                    // InternalSocialRequest.g:685:4: 'valid-email'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getBasicValidationAccess().getEMAILEnumLiteralDeclaration_4()); 

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
    // $ANTLR end "rule__BasicValidation__Alternatives"


    // $ANTLR start "rule__GenerationType__Alternatives"
    // InternalSocialRequest.g:693:1: rule__GenerationType__Alternatives : ( ( ( 'auto' ) ) | ( ( 'table' ) ) | ( ( 'identity' ) ) | ( ( 'sequence' ) ) );
    public final void rule__GenerationType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:697:1: ( ( ( 'auto' ) ) | ( ( 'table' ) ) | ( ( 'identity' ) ) | ( ( 'sequence' ) ) )
            int alt5=4;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt5=1;
                }
                break;
            case 18:
                {
                alt5=2;
                }
                break;
            case 19:
                {
                alt5=3;
                }
                break;
            case 20:
                {
                alt5=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalSocialRequest.g:698:2: ( ( 'auto' ) )
                    {
                    // InternalSocialRequest.g:698:2: ( ( 'auto' ) )
                    // InternalSocialRequest.g:699:3: ( 'auto' )
                    {
                     before(grammarAccess.getGenerationTypeAccess().getAUTOEnumLiteralDeclaration_0()); 
                    // InternalSocialRequest.g:700:3: ( 'auto' )
                    // InternalSocialRequest.g:700:4: 'auto'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getGenerationTypeAccess().getAUTOEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSocialRequest.g:704:2: ( ( 'table' ) )
                    {
                    // InternalSocialRequest.g:704:2: ( ( 'table' ) )
                    // InternalSocialRequest.g:705:3: ( 'table' )
                    {
                     before(grammarAccess.getGenerationTypeAccess().getTABLEEnumLiteralDeclaration_1()); 
                    // InternalSocialRequest.g:706:3: ( 'table' )
                    // InternalSocialRequest.g:706:4: 'table'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getGenerationTypeAccess().getTABLEEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSocialRequest.g:710:2: ( ( 'identity' ) )
                    {
                    // InternalSocialRequest.g:710:2: ( ( 'identity' ) )
                    // InternalSocialRequest.g:711:3: ( 'identity' )
                    {
                     before(grammarAccess.getGenerationTypeAccess().getIDENTITYEnumLiteralDeclaration_2()); 
                    // InternalSocialRequest.g:712:3: ( 'identity' )
                    // InternalSocialRequest.g:712:4: 'identity'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getGenerationTypeAccess().getIDENTITYEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalSocialRequest.g:716:2: ( ( 'sequence' ) )
                    {
                    // InternalSocialRequest.g:716:2: ( ( 'sequence' ) )
                    // InternalSocialRequest.g:717:3: ( 'sequence' )
                    {
                     before(grammarAccess.getGenerationTypeAccess().getSEQUENCEEnumLiteralDeclaration_3()); 
                    // InternalSocialRequest.g:718:3: ( 'sequence' )
                    // InternalSocialRequest.g:718:4: 'sequence'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getGenerationTypeAccess().getSEQUENCEEnumLiteralDeclaration_3()); 

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
    // $ANTLR end "rule__GenerationType__Alternatives"


    // $ANTLR start "rule__FetchType__Alternatives"
    // InternalSocialRequest.g:726:1: rule__FetchType__Alternatives : ( ( ( 'eager' ) ) | ( ( 'lazy' ) ) );
    public final void rule__FetchType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:730:1: ( ( ( 'eager' ) ) | ( ( 'lazy' ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==21) ) {
                alt6=1;
            }
            else if ( (LA6_0==22) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalSocialRequest.g:731:2: ( ( 'eager' ) )
                    {
                    // InternalSocialRequest.g:731:2: ( ( 'eager' ) )
                    // InternalSocialRequest.g:732:3: ( 'eager' )
                    {
                     before(grammarAccess.getFetchTypeAccess().getEAGEREnumLiteralDeclaration_0()); 
                    // InternalSocialRequest.g:733:3: ( 'eager' )
                    // InternalSocialRequest.g:733:4: 'eager'
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getFetchTypeAccess().getEAGEREnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSocialRequest.g:737:2: ( ( 'lazy' ) )
                    {
                    // InternalSocialRequest.g:737:2: ( ( 'lazy' ) )
                    // InternalSocialRequest.g:738:3: ( 'lazy' )
                    {
                     before(grammarAccess.getFetchTypeAccess().getLAZYEnumLiteralDeclaration_1()); 
                    // InternalSocialRequest.g:739:3: ( 'lazy' )
                    // InternalSocialRequest.g:739:4: 'lazy'
                    {
                    match(input,22,FOLLOW_2); 

                    }

                     after(grammarAccess.getFetchTypeAccess().getLAZYEnumLiteralDeclaration_1()); 

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
    // $ANTLR end "rule__FetchType__Alternatives"


    // $ANTLR start "rule__Association__Alternatives"
    // InternalSocialRequest.g:747:1: rule__Association__Alternatives : ( ( ( 'one-to-many' ) ) | ( ( 'many-to-one' ) ) | ( ( 'one-to-one' ) ) | ( ( 'many-to-many' ) ) );
    public final void rule__Association__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:751:1: ( ( ( 'one-to-many' ) ) | ( ( 'many-to-one' ) ) | ( ( 'one-to-one' ) ) | ( ( 'many-to-many' ) ) )
            int alt7=4;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt7=1;
                }
                break;
            case 24:
                {
                alt7=2;
                }
                break;
            case 25:
                {
                alt7=3;
                }
                break;
            case 26:
                {
                alt7=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalSocialRequest.g:752:2: ( ( 'one-to-many' ) )
                    {
                    // InternalSocialRequest.g:752:2: ( ( 'one-to-many' ) )
                    // InternalSocialRequest.g:753:3: ( 'one-to-many' )
                    {
                     before(grammarAccess.getAssociationAccess().getONE_TO_MANYEnumLiteralDeclaration_0()); 
                    // InternalSocialRequest.g:754:3: ( 'one-to-many' )
                    // InternalSocialRequest.g:754:4: 'one-to-many'
                    {
                    match(input,23,FOLLOW_2); 

                    }

                     after(grammarAccess.getAssociationAccess().getONE_TO_MANYEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSocialRequest.g:758:2: ( ( 'many-to-one' ) )
                    {
                    // InternalSocialRequest.g:758:2: ( ( 'many-to-one' ) )
                    // InternalSocialRequest.g:759:3: ( 'many-to-one' )
                    {
                     before(grammarAccess.getAssociationAccess().getMANY_TO_ONEEnumLiteralDeclaration_1()); 
                    // InternalSocialRequest.g:760:3: ( 'many-to-one' )
                    // InternalSocialRequest.g:760:4: 'many-to-one'
                    {
                    match(input,24,FOLLOW_2); 

                    }

                     after(grammarAccess.getAssociationAccess().getMANY_TO_ONEEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSocialRequest.g:764:2: ( ( 'one-to-one' ) )
                    {
                    // InternalSocialRequest.g:764:2: ( ( 'one-to-one' ) )
                    // InternalSocialRequest.g:765:3: ( 'one-to-one' )
                    {
                     before(grammarAccess.getAssociationAccess().getONE_TO_ONEEnumLiteralDeclaration_2()); 
                    // InternalSocialRequest.g:766:3: ( 'one-to-one' )
                    // InternalSocialRequest.g:766:4: 'one-to-one'
                    {
                    match(input,25,FOLLOW_2); 

                    }

                     after(grammarAccess.getAssociationAccess().getONE_TO_ONEEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalSocialRequest.g:770:2: ( ( 'many-to-many' ) )
                    {
                    // InternalSocialRequest.g:770:2: ( ( 'many-to-many' ) )
                    // InternalSocialRequest.g:771:3: ( 'many-to-many' )
                    {
                     before(grammarAccess.getAssociationAccess().getMANY_TO_MANYEnumLiteralDeclaration_3()); 
                    // InternalSocialRequest.g:772:3: ( 'many-to-many' )
                    // InternalSocialRequest.g:772:4: 'many-to-many'
                    {
                    match(input,26,FOLLOW_2); 

                    }

                     after(grammarAccess.getAssociationAccess().getMANY_TO_MANYEnumLiteralDeclaration_3()); 

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
    // $ANTLR end "rule__Association__Alternatives"


    // $ANTLR start "rule__DataType__Alternatives"
    // InternalSocialRequest.g:780:1: rule__DataType__Alternatives : ( ( ( 'string' ) ) | ( ( 'long' ) ) | ( ( 'float' ) ) | ( ( 'double' ) ) | ( ( 'char' ) ) | ( ( 'int' ) ) | ( ( 'boolean' ) ) | ( ( 'date' ) ) );
    public final void rule__DataType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:784:1: ( ( ( 'string' ) ) | ( ( 'long' ) ) | ( ( 'float' ) ) | ( ( 'double' ) ) | ( ( 'char' ) ) | ( ( 'int' ) ) | ( ( 'boolean' ) ) | ( ( 'date' ) ) )
            int alt8=8;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt8=1;
                }
                break;
            case 28:
                {
                alt8=2;
                }
                break;
            case 29:
                {
                alt8=3;
                }
                break;
            case 30:
                {
                alt8=4;
                }
                break;
            case 31:
                {
                alt8=5;
                }
                break;
            case 32:
                {
                alt8=6;
                }
                break;
            case 33:
                {
                alt8=7;
                }
                break;
            case 34:
                {
                alt8=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalSocialRequest.g:785:2: ( ( 'string' ) )
                    {
                    // InternalSocialRequest.g:785:2: ( ( 'string' ) )
                    // InternalSocialRequest.g:786:3: ( 'string' )
                    {
                     before(grammarAccess.getDataTypeAccess().getSTRINGEnumLiteralDeclaration_0()); 
                    // InternalSocialRequest.g:787:3: ( 'string' )
                    // InternalSocialRequest.g:787:4: 'string'
                    {
                    match(input,27,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataTypeAccess().getSTRINGEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSocialRequest.g:791:2: ( ( 'long' ) )
                    {
                    // InternalSocialRequest.g:791:2: ( ( 'long' ) )
                    // InternalSocialRequest.g:792:3: ( 'long' )
                    {
                     before(grammarAccess.getDataTypeAccess().getLONGEnumLiteralDeclaration_1()); 
                    // InternalSocialRequest.g:793:3: ( 'long' )
                    // InternalSocialRequest.g:793:4: 'long'
                    {
                    match(input,28,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataTypeAccess().getLONGEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSocialRequest.g:797:2: ( ( 'float' ) )
                    {
                    // InternalSocialRequest.g:797:2: ( ( 'float' ) )
                    // InternalSocialRequest.g:798:3: ( 'float' )
                    {
                     before(grammarAccess.getDataTypeAccess().getFLOATEnumLiteralDeclaration_2()); 
                    // InternalSocialRequest.g:799:3: ( 'float' )
                    // InternalSocialRequest.g:799:4: 'float'
                    {
                    match(input,29,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataTypeAccess().getFLOATEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalSocialRequest.g:803:2: ( ( 'double' ) )
                    {
                    // InternalSocialRequest.g:803:2: ( ( 'double' ) )
                    // InternalSocialRequest.g:804:3: ( 'double' )
                    {
                     before(grammarAccess.getDataTypeAccess().getDOUBLEEnumLiteralDeclaration_3()); 
                    // InternalSocialRequest.g:805:3: ( 'double' )
                    // InternalSocialRequest.g:805:4: 'double'
                    {
                    match(input,30,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataTypeAccess().getDOUBLEEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalSocialRequest.g:809:2: ( ( 'char' ) )
                    {
                    // InternalSocialRequest.g:809:2: ( ( 'char' ) )
                    // InternalSocialRequest.g:810:3: ( 'char' )
                    {
                     before(grammarAccess.getDataTypeAccess().getCHAREnumLiteralDeclaration_4()); 
                    // InternalSocialRequest.g:811:3: ( 'char' )
                    // InternalSocialRequest.g:811:4: 'char'
                    {
                    match(input,31,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataTypeAccess().getCHAREnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalSocialRequest.g:815:2: ( ( 'int' ) )
                    {
                    // InternalSocialRequest.g:815:2: ( ( 'int' ) )
                    // InternalSocialRequest.g:816:3: ( 'int' )
                    {
                     before(grammarAccess.getDataTypeAccess().getINTEnumLiteralDeclaration_5()); 
                    // InternalSocialRequest.g:817:3: ( 'int' )
                    // InternalSocialRequest.g:817:4: 'int'
                    {
                    match(input,32,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataTypeAccess().getINTEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalSocialRequest.g:821:2: ( ( 'boolean' ) )
                    {
                    // InternalSocialRequest.g:821:2: ( ( 'boolean' ) )
                    // InternalSocialRequest.g:822:3: ( 'boolean' )
                    {
                     before(grammarAccess.getDataTypeAccess().getBOOLEANEnumLiteralDeclaration_6()); 
                    // InternalSocialRequest.g:823:3: ( 'boolean' )
                    // InternalSocialRequest.g:823:4: 'boolean'
                    {
                    match(input,33,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataTypeAccess().getBOOLEANEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalSocialRequest.g:827:2: ( ( 'date' ) )
                    {
                    // InternalSocialRequest.g:827:2: ( ( 'date' ) )
                    // InternalSocialRequest.g:828:3: ( 'date' )
                    {
                     before(grammarAccess.getDataTypeAccess().getDATEEnumLiteralDeclaration_7()); 
                    // InternalSocialRequest.g:829:3: ( 'date' )
                    // InternalSocialRequest.g:829:4: 'date'
                    {
                    match(input,34,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataTypeAccess().getDATEEnumLiteralDeclaration_7()); 

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
    // $ANTLR end "rule__DataType__Alternatives"


    // $ANTLR start "rule__JoinType__Alternatives"
    // InternalSocialRequest.g:837:1: rule__JoinType__Alternatives : ( ( ( 'LEFT JOIN' ) ) | ( ( 'LEFT OUTER JOIN' ) ) | ( ( 'CROSS JOIN' ) ) | ( ( 'JOIN' ) ) );
    public final void rule__JoinType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:841:1: ( ( ( 'LEFT JOIN' ) ) | ( ( 'LEFT OUTER JOIN' ) ) | ( ( 'CROSS JOIN' ) ) | ( ( 'JOIN' ) ) )
            int alt9=4;
            switch ( input.LA(1) ) {
            case 35:
                {
                alt9=1;
                }
                break;
            case 36:
                {
                alt9=2;
                }
                break;
            case 37:
                {
                alt9=3;
                }
                break;
            case 38:
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
                    // InternalSocialRequest.g:842:2: ( ( 'LEFT JOIN' ) )
                    {
                    // InternalSocialRequest.g:842:2: ( ( 'LEFT JOIN' ) )
                    // InternalSocialRequest.g:843:3: ( 'LEFT JOIN' )
                    {
                     before(grammarAccess.getJoinTypeAccess().getLEFT_JOINEnumLiteralDeclaration_0()); 
                    // InternalSocialRequest.g:844:3: ( 'LEFT JOIN' )
                    // InternalSocialRequest.g:844:4: 'LEFT JOIN'
                    {
                    match(input,35,FOLLOW_2); 

                    }

                     after(grammarAccess.getJoinTypeAccess().getLEFT_JOINEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSocialRequest.g:848:2: ( ( 'LEFT OUTER JOIN' ) )
                    {
                    // InternalSocialRequest.g:848:2: ( ( 'LEFT OUTER JOIN' ) )
                    // InternalSocialRequest.g:849:3: ( 'LEFT OUTER JOIN' )
                    {
                     before(grammarAccess.getJoinTypeAccess().getLEFT_OUTER_JOINEnumLiteralDeclaration_1()); 
                    // InternalSocialRequest.g:850:3: ( 'LEFT OUTER JOIN' )
                    // InternalSocialRequest.g:850:4: 'LEFT OUTER JOIN'
                    {
                    match(input,36,FOLLOW_2); 

                    }

                     after(grammarAccess.getJoinTypeAccess().getLEFT_OUTER_JOINEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSocialRequest.g:854:2: ( ( 'CROSS JOIN' ) )
                    {
                    // InternalSocialRequest.g:854:2: ( ( 'CROSS JOIN' ) )
                    // InternalSocialRequest.g:855:3: ( 'CROSS JOIN' )
                    {
                     before(grammarAccess.getJoinTypeAccess().getCROSS_JOINEnumLiteralDeclaration_2()); 
                    // InternalSocialRequest.g:856:3: ( 'CROSS JOIN' )
                    // InternalSocialRequest.g:856:4: 'CROSS JOIN'
                    {
                    match(input,37,FOLLOW_2); 

                    }

                     after(grammarAccess.getJoinTypeAccess().getCROSS_JOINEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalSocialRequest.g:860:2: ( ( 'JOIN' ) )
                    {
                    // InternalSocialRequest.g:860:2: ( ( 'JOIN' ) )
                    // InternalSocialRequest.g:861:3: ( 'JOIN' )
                    {
                     before(grammarAccess.getJoinTypeAccess().getJOINEnumLiteralDeclaration_3()); 
                    // InternalSocialRequest.g:862:3: ( 'JOIN' )
                    // InternalSocialRequest.g:862:4: 'JOIN'
                    {
                    match(input,38,FOLLOW_2); 

                    }

                     after(grammarAccess.getJoinTypeAccess().getJOINEnumLiteralDeclaration_3()); 

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
    // $ANTLR end "rule__JoinType__Alternatives"


    // $ANTLR start "rule__Model__Group__0"
    // InternalSocialRequest.g:870:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:874:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalSocialRequest.g:875:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Model__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__1();

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
    // $ANTLR end "rule__Model__Group__0"


    // $ANTLR start "rule__Model__Group__0__Impl"
    // InternalSocialRequest.g:882:1: rule__Model__Group__0__Impl : ( ( rule__Model__EntitiesAssignment_0 )* ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:886:1: ( ( ( rule__Model__EntitiesAssignment_0 )* ) )
            // InternalSocialRequest.g:887:1: ( ( rule__Model__EntitiesAssignment_0 )* )
            {
            // InternalSocialRequest.g:887:1: ( ( rule__Model__EntitiesAssignment_0 )* )
            // InternalSocialRequest.g:888:2: ( rule__Model__EntitiesAssignment_0 )*
            {
             before(grammarAccess.getModelAccess().getEntitiesAssignment_0()); 
            // InternalSocialRequest.g:889:2: ( rule__Model__EntitiesAssignment_0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==39) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalSocialRequest.g:889:3: rule__Model__EntitiesAssignment_0
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Model__EntitiesAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getEntitiesAssignment_0()); 

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
    // $ANTLR end "rule__Model__Group__0__Impl"


    // $ANTLR start "rule__Model__Group__1"
    // InternalSocialRequest.g:897:1: rule__Model__Group__1 : rule__Model__Group__1__Impl ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:901:1: ( rule__Model__Group__1__Impl )
            // InternalSocialRequest.g:902:2: rule__Model__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__1__Impl();

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
    // $ANTLR end "rule__Model__Group__1"


    // $ANTLR start "rule__Model__Group__1__Impl"
    // InternalSocialRequest.g:908:1: rule__Model__Group__1__Impl : ( ( rule__Model__RepositoriesAssignment_1 )* ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:912:1: ( ( ( rule__Model__RepositoriesAssignment_1 )* ) )
            // InternalSocialRequest.g:913:1: ( ( rule__Model__RepositoriesAssignment_1 )* )
            {
            // InternalSocialRequest.g:913:1: ( ( rule__Model__RepositoriesAssignment_1 )* )
            // InternalSocialRequest.g:914:2: ( rule__Model__RepositoriesAssignment_1 )*
            {
             before(grammarAccess.getModelAccess().getRepositoriesAssignment_1()); 
            // InternalSocialRequest.g:915:2: ( rule__Model__RepositoriesAssignment_1 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==52) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalSocialRequest.g:915:3: rule__Model__RepositoriesAssignment_1
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__Model__RepositoriesAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getRepositoriesAssignment_1()); 

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
    // $ANTLR end "rule__Model__Group__1__Impl"


    // $ANTLR start "rule__Entity__Group__0"
    // InternalSocialRequest.g:924:1: rule__Entity__Group__0 : rule__Entity__Group__0__Impl rule__Entity__Group__1 ;
    public final void rule__Entity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:928:1: ( rule__Entity__Group__0__Impl rule__Entity__Group__1 )
            // InternalSocialRequest.g:929:2: rule__Entity__Group__0__Impl rule__Entity__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Entity__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__1();

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
    // $ANTLR end "rule__Entity__Group__0"


    // $ANTLR start "rule__Entity__Group__0__Impl"
    // InternalSocialRequest.g:936:1: rule__Entity__Group__0__Impl : ( 'Entity' ) ;
    public final void rule__Entity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:940:1: ( ( 'Entity' ) )
            // InternalSocialRequest.g:941:1: ( 'Entity' )
            {
            // InternalSocialRequest.g:941:1: ( 'Entity' )
            // InternalSocialRequest.g:942:2: 'Entity'
            {
             before(grammarAccess.getEntityAccess().getEntityKeyword_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getEntityKeyword_0()); 

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
    // $ANTLR end "rule__Entity__Group__0__Impl"


    // $ANTLR start "rule__Entity__Group__1"
    // InternalSocialRequest.g:951:1: rule__Entity__Group__1 : rule__Entity__Group__1__Impl rule__Entity__Group__2 ;
    public final void rule__Entity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:955:1: ( rule__Entity__Group__1__Impl rule__Entity__Group__2 )
            // InternalSocialRequest.g:956:2: rule__Entity__Group__1__Impl rule__Entity__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__Entity__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__2();

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
    // $ANTLR end "rule__Entity__Group__1"


    // $ANTLR start "rule__Entity__Group__1__Impl"
    // InternalSocialRequest.g:963:1: rule__Entity__Group__1__Impl : ( ( rule__Entity__NameAssignment_1 ) ) ;
    public final void rule__Entity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:967:1: ( ( ( rule__Entity__NameAssignment_1 ) ) )
            // InternalSocialRequest.g:968:1: ( ( rule__Entity__NameAssignment_1 ) )
            {
            // InternalSocialRequest.g:968:1: ( ( rule__Entity__NameAssignment_1 ) )
            // InternalSocialRequest.g:969:2: ( rule__Entity__NameAssignment_1 )
            {
             before(grammarAccess.getEntityAccess().getNameAssignment_1()); 
            // InternalSocialRequest.g:970:2: ( rule__Entity__NameAssignment_1 )
            // InternalSocialRequest.g:970:3: rule__Entity__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Entity__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Entity__Group__1__Impl"


    // $ANTLR start "rule__Entity__Group__2"
    // InternalSocialRequest.g:978:1: rule__Entity__Group__2 : rule__Entity__Group__2__Impl rule__Entity__Group__3 ;
    public final void rule__Entity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:982:1: ( rule__Entity__Group__2__Impl rule__Entity__Group__3 )
            // InternalSocialRequest.g:983:2: rule__Entity__Group__2__Impl rule__Entity__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__Entity__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__3();

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
    // $ANTLR end "rule__Entity__Group__2"


    // $ANTLR start "rule__Entity__Group__2__Impl"
    // InternalSocialRequest.g:990:1: rule__Entity__Group__2__Impl : ( ( rule__Entity__Group_2__0 )? ) ;
    public final void rule__Entity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:994:1: ( ( ( rule__Entity__Group_2__0 )? ) )
            // InternalSocialRequest.g:995:1: ( ( rule__Entity__Group_2__0 )? )
            {
            // InternalSocialRequest.g:995:1: ( ( rule__Entity__Group_2__0 )? )
            // InternalSocialRequest.g:996:2: ( rule__Entity__Group_2__0 )?
            {
             before(grammarAccess.getEntityAccess().getGroup_2()); 
            // InternalSocialRequest.g:997:2: ( rule__Entity__Group_2__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==61) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalSocialRequest.g:997:3: rule__Entity__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Entity__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEntityAccess().getGroup_2()); 

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
    // $ANTLR end "rule__Entity__Group__2__Impl"


    // $ANTLR start "rule__Entity__Group__3"
    // InternalSocialRequest.g:1005:1: rule__Entity__Group__3 : rule__Entity__Group__3__Impl rule__Entity__Group__4 ;
    public final void rule__Entity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1009:1: ( rule__Entity__Group__3__Impl rule__Entity__Group__4 )
            // InternalSocialRequest.g:1010:2: rule__Entity__Group__3__Impl rule__Entity__Group__4
            {
            pushFollow(FOLLOW_8);
            rule__Entity__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__4();

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
    // $ANTLR end "rule__Entity__Group__3"


    // $ANTLR start "rule__Entity__Group__3__Impl"
    // InternalSocialRequest.g:1017:1: rule__Entity__Group__3__Impl : ( '{' ) ;
    public final void rule__Entity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1021:1: ( ( '{' ) )
            // InternalSocialRequest.g:1022:1: ( '{' )
            {
            // InternalSocialRequest.g:1022:1: ( '{' )
            // InternalSocialRequest.g:1023:2: '{'
            {
             before(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_3()); 

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
    // $ANTLR end "rule__Entity__Group__3__Impl"


    // $ANTLR start "rule__Entity__Group__4"
    // InternalSocialRequest.g:1032:1: rule__Entity__Group__4 : rule__Entity__Group__4__Impl rule__Entity__Group__5 ;
    public final void rule__Entity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1036:1: ( rule__Entity__Group__4__Impl rule__Entity__Group__5 )
            // InternalSocialRequest.g:1037:2: rule__Entity__Group__4__Impl rule__Entity__Group__5
            {
            pushFollow(FOLLOW_9);
            rule__Entity__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__5();

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
    // $ANTLR end "rule__Entity__Group__4"


    // $ANTLR start "rule__Entity__Group__4__Impl"
    // InternalSocialRequest.g:1044:1: rule__Entity__Group__4__Impl : ( ( ( rule__Entity__AttributesAssignment_4 ) ) ( ( rule__Entity__AttributesAssignment_4 )* ) ) ;
    public final void rule__Entity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1048:1: ( ( ( ( rule__Entity__AttributesAssignment_4 ) ) ( ( rule__Entity__AttributesAssignment_4 )* ) ) )
            // InternalSocialRequest.g:1049:1: ( ( ( rule__Entity__AttributesAssignment_4 ) ) ( ( rule__Entity__AttributesAssignment_4 )* ) )
            {
            // InternalSocialRequest.g:1049:1: ( ( ( rule__Entity__AttributesAssignment_4 ) ) ( ( rule__Entity__AttributesAssignment_4 )* ) )
            // InternalSocialRequest.g:1050:2: ( ( rule__Entity__AttributesAssignment_4 ) ) ( ( rule__Entity__AttributesAssignment_4 )* )
            {
            // InternalSocialRequest.g:1050:2: ( ( rule__Entity__AttributesAssignment_4 ) )
            // InternalSocialRequest.g:1051:3: ( rule__Entity__AttributesAssignment_4 )
            {
             before(grammarAccess.getEntityAccess().getAttributesAssignment_4()); 
            // InternalSocialRequest.g:1052:3: ( rule__Entity__AttributesAssignment_4 )
            // InternalSocialRequest.g:1052:4: rule__Entity__AttributesAssignment_4
            {
            pushFollow(FOLLOW_10);
            rule__Entity__AttributesAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getAttributesAssignment_4()); 

            }

            // InternalSocialRequest.g:1055:2: ( ( rule__Entity__AttributesAssignment_4 )* )
            // InternalSocialRequest.g:1056:3: ( rule__Entity__AttributesAssignment_4 )*
            {
             before(grammarAccess.getEntityAccess().getAttributesAssignment_4()); 
            // InternalSocialRequest.g:1057:3: ( rule__Entity__AttributesAssignment_4 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_ID||(LA13_0>=23 && LA13_0<=26)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalSocialRequest.g:1057:4: rule__Entity__AttributesAssignment_4
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Entity__AttributesAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getEntityAccess().getAttributesAssignment_4()); 

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
    // $ANTLR end "rule__Entity__Group__4__Impl"


    // $ANTLR start "rule__Entity__Group__5"
    // InternalSocialRequest.g:1066:1: rule__Entity__Group__5 : rule__Entity__Group__5__Impl ;
    public final void rule__Entity__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1070:1: ( rule__Entity__Group__5__Impl )
            // InternalSocialRequest.g:1071:2: rule__Entity__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Entity__Group__5__Impl();

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
    // $ANTLR end "rule__Entity__Group__5"


    // $ANTLR start "rule__Entity__Group__5__Impl"
    // InternalSocialRequest.g:1077:1: rule__Entity__Group__5__Impl : ( '}' ) ;
    public final void rule__Entity__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1081:1: ( ( '}' ) )
            // InternalSocialRequest.g:1082:1: ( '}' )
            {
            // InternalSocialRequest.g:1082:1: ( '}' )
            // InternalSocialRequest.g:1083:2: '}'
            {
             before(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_5()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__Entity__Group__5__Impl"


    // $ANTLR start "rule__Entity__Group_2__0"
    // InternalSocialRequest.g:1093:1: rule__Entity__Group_2__0 : rule__Entity__Group_2__0__Impl rule__Entity__Group_2__1 ;
    public final void rule__Entity__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1097:1: ( rule__Entity__Group_2__0__Impl rule__Entity__Group_2__1 )
            // InternalSocialRequest.g:1098:2: rule__Entity__Group_2__0__Impl rule__Entity__Group_2__1
            {
            pushFollow(FOLLOW_11);
            rule__Entity__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group_2__1();

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
    // $ANTLR end "rule__Entity__Group_2__0"


    // $ANTLR start "rule__Entity__Group_2__0__Impl"
    // InternalSocialRequest.g:1105:1: rule__Entity__Group_2__0__Impl : ( ( rule__Entity__HasUserDetailsAssignment_2_0 ) ) ;
    public final void rule__Entity__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1109:1: ( ( ( rule__Entity__HasUserDetailsAssignment_2_0 ) ) )
            // InternalSocialRequest.g:1110:1: ( ( rule__Entity__HasUserDetailsAssignment_2_0 ) )
            {
            // InternalSocialRequest.g:1110:1: ( ( rule__Entity__HasUserDetailsAssignment_2_0 ) )
            // InternalSocialRequest.g:1111:2: ( rule__Entity__HasUserDetailsAssignment_2_0 )
            {
             before(grammarAccess.getEntityAccess().getHasUserDetailsAssignment_2_0()); 
            // InternalSocialRequest.g:1112:2: ( rule__Entity__HasUserDetailsAssignment_2_0 )
            // InternalSocialRequest.g:1112:3: rule__Entity__HasUserDetailsAssignment_2_0
            {
            pushFollow(FOLLOW_2);
            rule__Entity__HasUserDetailsAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getHasUserDetailsAssignment_2_0()); 

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
    // $ANTLR end "rule__Entity__Group_2__0__Impl"


    // $ANTLR start "rule__Entity__Group_2__1"
    // InternalSocialRequest.g:1120:1: rule__Entity__Group_2__1 : rule__Entity__Group_2__1__Impl ;
    public final void rule__Entity__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1124:1: ( rule__Entity__Group_2__1__Impl )
            // InternalSocialRequest.g:1125:2: rule__Entity__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Entity__Group_2__1__Impl();

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
    // $ANTLR end "rule__Entity__Group_2__1"


    // $ANTLR start "rule__Entity__Group_2__1__Impl"
    // InternalSocialRequest.g:1131:1: rule__Entity__Group_2__1__Impl : ( 'UserDetails' ) ;
    public final void rule__Entity__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1135:1: ( ( 'UserDetails' ) )
            // InternalSocialRequest.g:1136:1: ( 'UserDetails' )
            {
            // InternalSocialRequest.g:1136:1: ( 'UserDetails' )
            // InternalSocialRequest.g:1137:2: 'UserDetails'
            {
             before(grammarAccess.getEntityAccess().getUserDetailsKeyword_2_1()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getUserDetailsKeyword_2_1()); 

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
    // $ANTLR end "rule__Entity__Group_2__1__Impl"


    // $ANTLR start "rule__Attribute__Group__0"
    // InternalSocialRequest.g:1147:1: rule__Attribute__Group__0 : rule__Attribute__Group__0__Impl rule__Attribute__Group__1 ;
    public final void rule__Attribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1151:1: ( rule__Attribute__Group__0__Impl rule__Attribute__Group__1 )
            // InternalSocialRequest.g:1152:2: rule__Attribute__Group__0__Impl rule__Attribute__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__Attribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__1();

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
    // $ANTLR end "rule__Attribute__Group__0"


    // $ANTLR start "rule__Attribute__Group__0__Impl"
    // InternalSocialRequest.g:1159:1: rule__Attribute__Group__0__Impl : ( ( rule__Attribute__AssociationAssignment_0 )? ) ;
    public final void rule__Attribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1163:1: ( ( ( rule__Attribute__AssociationAssignment_0 )? ) )
            // InternalSocialRequest.g:1164:1: ( ( rule__Attribute__AssociationAssignment_0 )? )
            {
            // InternalSocialRequest.g:1164:1: ( ( rule__Attribute__AssociationAssignment_0 )? )
            // InternalSocialRequest.g:1165:2: ( rule__Attribute__AssociationAssignment_0 )?
            {
             before(grammarAccess.getAttributeAccess().getAssociationAssignment_0()); 
            // InternalSocialRequest.g:1166:2: ( rule__Attribute__AssociationAssignment_0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>=23 && LA14_0<=26)) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalSocialRequest.g:1166:3: rule__Attribute__AssociationAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Attribute__AssociationAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAttributeAccess().getAssociationAssignment_0()); 

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
    // $ANTLR end "rule__Attribute__Group__0__Impl"


    // $ANTLR start "rule__Attribute__Group__1"
    // InternalSocialRequest.g:1174:1: rule__Attribute__Group__1 : rule__Attribute__Group__1__Impl rule__Attribute__Group__2 ;
    public final void rule__Attribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1178:1: ( rule__Attribute__Group__1__Impl rule__Attribute__Group__2 )
            // InternalSocialRequest.g:1179:2: rule__Attribute__Group__1__Impl rule__Attribute__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__Attribute__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__2();

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
    // $ANTLR end "rule__Attribute__Group__1"


    // $ANTLR start "rule__Attribute__Group__1__Impl"
    // InternalSocialRequest.g:1186:1: rule__Attribute__Group__1__Impl : ( ( rule__Attribute__NameAssignment_1 ) ) ;
    public final void rule__Attribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1190:1: ( ( ( rule__Attribute__NameAssignment_1 ) ) )
            // InternalSocialRequest.g:1191:1: ( ( rule__Attribute__NameAssignment_1 ) )
            {
            // InternalSocialRequest.g:1191:1: ( ( rule__Attribute__NameAssignment_1 ) )
            // InternalSocialRequest.g:1192:2: ( rule__Attribute__NameAssignment_1 )
            {
             before(grammarAccess.getAttributeAccess().getNameAssignment_1()); 
            // InternalSocialRequest.g:1193:2: ( rule__Attribute__NameAssignment_1 )
            // InternalSocialRequest.g:1193:3: rule__Attribute__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Attribute__Group__1__Impl"


    // $ANTLR start "rule__Attribute__Group__2"
    // InternalSocialRequest.g:1201:1: rule__Attribute__Group__2 : rule__Attribute__Group__2__Impl rule__Attribute__Group__3 ;
    public final void rule__Attribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1205:1: ( rule__Attribute__Group__2__Impl rule__Attribute__Group__3 )
            // InternalSocialRequest.g:1206:2: rule__Attribute__Group__2__Impl rule__Attribute__Group__3
            {
            pushFollow(FOLLOW_13);
            rule__Attribute__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__3();

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
    // $ANTLR end "rule__Attribute__Group__2"


    // $ANTLR start "rule__Attribute__Group__2__Impl"
    // InternalSocialRequest.g:1213:1: rule__Attribute__Group__2__Impl : ( ':' ) ;
    public final void rule__Attribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1217:1: ( ( ':' ) )
            // InternalSocialRequest.g:1218:1: ( ':' )
            {
            // InternalSocialRequest.g:1218:1: ( ':' )
            // InternalSocialRequest.g:1219:2: ':'
            {
             before(grammarAccess.getAttributeAccess().getColonKeyword_2()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getColonKeyword_2()); 

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
    // $ANTLR end "rule__Attribute__Group__2__Impl"


    // $ANTLR start "rule__Attribute__Group__3"
    // InternalSocialRequest.g:1228:1: rule__Attribute__Group__3 : rule__Attribute__Group__3__Impl rule__Attribute__Group__4 ;
    public final void rule__Attribute__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1232:1: ( rule__Attribute__Group__3__Impl rule__Attribute__Group__4 )
            // InternalSocialRequest.g:1233:2: rule__Attribute__Group__3__Impl rule__Attribute__Group__4
            {
            pushFollow(FOLLOW_14);
            rule__Attribute__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__4();

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
    // $ANTLR end "rule__Attribute__Group__3"


    // $ANTLR start "rule__Attribute__Group__3__Impl"
    // InternalSocialRequest.g:1240:1: rule__Attribute__Group__3__Impl : ( ( rule__Attribute__TypeRefAssignment_3 ) ) ;
    public final void rule__Attribute__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1244:1: ( ( ( rule__Attribute__TypeRefAssignment_3 ) ) )
            // InternalSocialRequest.g:1245:1: ( ( rule__Attribute__TypeRefAssignment_3 ) )
            {
            // InternalSocialRequest.g:1245:1: ( ( rule__Attribute__TypeRefAssignment_3 ) )
            // InternalSocialRequest.g:1246:2: ( rule__Attribute__TypeRefAssignment_3 )
            {
             before(grammarAccess.getAttributeAccess().getTypeRefAssignment_3()); 
            // InternalSocialRequest.g:1247:2: ( rule__Attribute__TypeRefAssignment_3 )
            // InternalSocialRequest.g:1247:3: rule__Attribute__TypeRefAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__TypeRefAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getTypeRefAssignment_3()); 

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
    // $ANTLR end "rule__Attribute__Group__3__Impl"


    // $ANTLR start "rule__Attribute__Group__4"
    // InternalSocialRequest.g:1255:1: rule__Attribute__Group__4 : rule__Attribute__Group__4__Impl rule__Attribute__Group__5 ;
    public final void rule__Attribute__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1259:1: ( rule__Attribute__Group__4__Impl rule__Attribute__Group__5 )
            // InternalSocialRequest.g:1260:2: rule__Attribute__Group__4__Impl rule__Attribute__Group__5
            {
            pushFollow(FOLLOW_14);
            rule__Attribute__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__5();

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
    // $ANTLR end "rule__Attribute__Group__4"


    // $ANTLR start "rule__Attribute__Group__4__Impl"
    // InternalSocialRequest.g:1267:1: rule__Attribute__Group__4__Impl : ( ( rule__Attribute__ModifierAssignment_4 )? ) ;
    public final void rule__Attribute__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1271:1: ( ( ( rule__Attribute__ModifierAssignment_4 )? ) )
            // InternalSocialRequest.g:1272:1: ( ( rule__Attribute__ModifierAssignment_4 )? )
            {
            // InternalSocialRequest.g:1272:1: ( ( rule__Attribute__ModifierAssignment_4 )? )
            // InternalSocialRequest.g:1273:2: ( rule__Attribute__ModifierAssignment_4 )?
            {
             before(grammarAccess.getAttributeAccess().getModifierAssignment_4()); 
            // InternalSocialRequest.g:1274:2: ( rule__Attribute__ModifierAssignment_4 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( ((LA15_0>=62 && LA15_0<=64)) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalSocialRequest.g:1274:3: rule__Attribute__ModifierAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__Attribute__ModifierAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAttributeAccess().getModifierAssignment_4()); 

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
    // $ANTLR end "rule__Attribute__Group__4__Impl"


    // $ANTLR start "rule__Attribute__Group__5"
    // InternalSocialRequest.g:1282:1: rule__Attribute__Group__5 : rule__Attribute__Group__5__Impl ;
    public final void rule__Attribute__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1286:1: ( rule__Attribute__Group__5__Impl )
            // InternalSocialRequest.g:1287:2: rule__Attribute__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__Group__5__Impl();

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
    // $ANTLR end "rule__Attribute__Group__5"


    // $ANTLR start "rule__Attribute__Group__5__Impl"
    // InternalSocialRequest.g:1293:1: rule__Attribute__Group__5__Impl : ( ( rule__Attribute__Group_5__0 )? ) ;
    public final void rule__Attribute__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1297:1: ( ( ( rule__Attribute__Group_5__0 )? ) )
            // InternalSocialRequest.g:1298:1: ( ( rule__Attribute__Group_5__0 )? )
            {
            // InternalSocialRequest.g:1298:1: ( ( rule__Attribute__Group_5__0 )? )
            // InternalSocialRequest.g:1299:2: ( rule__Attribute__Group_5__0 )?
            {
             before(grammarAccess.getAttributeAccess().getGroup_5()); 
            // InternalSocialRequest.g:1300:2: ( rule__Attribute__Group_5__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==40) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalSocialRequest.g:1300:3: rule__Attribute__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Attribute__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAttributeAccess().getGroup_5()); 

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
    // $ANTLR end "rule__Attribute__Group__5__Impl"


    // $ANTLR start "rule__Attribute__Group_5__0"
    // InternalSocialRequest.g:1309:1: rule__Attribute__Group_5__0 : rule__Attribute__Group_5__0__Impl rule__Attribute__Group_5__1 ;
    public final void rule__Attribute__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1313:1: ( rule__Attribute__Group_5__0__Impl rule__Attribute__Group_5__1 )
            // InternalSocialRequest.g:1314:2: rule__Attribute__Group_5__0__Impl rule__Attribute__Group_5__1
            {
            pushFollow(FOLLOW_15);
            rule__Attribute__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group_5__1();

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
    // $ANTLR end "rule__Attribute__Group_5__0"


    // $ANTLR start "rule__Attribute__Group_5__0__Impl"
    // InternalSocialRequest.g:1321:1: rule__Attribute__Group_5__0__Impl : ( '{' ) ;
    public final void rule__Attribute__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1325:1: ( ( '{' ) )
            // InternalSocialRequest.g:1326:1: ( '{' )
            {
            // InternalSocialRequest.g:1326:1: ( '{' )
            // InternalSocialRequest.g:1327:2: '{'
            {
             before(grammarAccess.getAttributeAccess().getLeftCurlyBracketKeyword_5_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getLeftCurlyBracketKeyword_5_0()); 

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
    // $ANTLR end "rule__Attribute__Group_5__0__Impl"


    // $ANTLR start "rule__Attribute__Group_5__1"
    // InternalSocialRequest.g:1336:1: rule__Attribute__Group_5__1 : rule__Attribute__Group_5__1__Impl rule__Attribute__Group_5__2 ;
    public final void rule__Attribute__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1340:1: ( rule__Attribute__Group_5__1__Impl rule__Attribute__Group_5__2 )
            // InternalSocialRequest.g:1341:2: rule__Attribute__Group_5__1__Impl rule__Attribute__Group_5__2
            {
            pushFollow(FOLLOW_9);
            rule__Attribute__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group_5__2();

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
    // $ANTLR end "rule__Attribute__Group_5__1"


    // $ANTLR start "rule__Attribute__Group_5__1__Impl"
    // InternalSocialRequest.g:1348:1: rule__Attribute__Group_5__1__Impl : ( ( rule__Attribute__UnorderedGroup_5_1 ) ) ;
    public final void rule__Attribute__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1352:1: ( ( ( rule__Attribute__UnorderedGroup_5_1 ) ) )
            // InternalSocialRequest.g:1353:1: ( ( rule__Attribute__UnorderedGroup_5_1 ) )
            {
            // InternalSocialRequest.g:1353:1: ( ( rule__Attribute__UnorderedGroup_5_1 ) )
            // InternalSocialRequest.g:1354:2: ( rule__Attribute__UnorderedGroup_5_1 )
            {
             before(grammarAccess.getAttributeAccess().getUnorderedGroup_5_1()); 
            // InternalSocialRequest.g:1355:2: ( rule__Attribute__UnorderedGroup_5_1 )
            // InternalSocialRequest.g:1355:3: rule__Attribute__UnorderedGroup_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__UnorderedGroup_5_1();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getUnorderedGroup_5_1()); 

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
    // $ANTLR end "rule__Attribute__Group_5__1__Impl"


    // $ANTLR start "rule__Attribute__Group_5__2"
    // InternalSocialRequest.g:1363:1: rule__Attribute__Group_5__2 : rule__Attribute__Group_5__2__Impl ;
    public final void rule__Attribute__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1367:1: ( rule__Attribute__Group_5__2__Impl )
            // InternalSocialRequest.g:1368:2: rule__Attribute__Group_5__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__Group_5__2__Impl();

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
    // $ANTLR end "rule__Attribute__Group_5__2"


    // $ANTLR start "rule__Attribute__Group_5__2__Impl"
    // InternalSocialRequest.g:1374:1: rule__Attribute__Group_5__2__Impl : ( '}' ) ;
    public final void rule__Attribute__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1378:1: ( ( '}' ) )
            // InternalSocialRequest.g:1379:1: ( '}' )
            {
            // InternalSocialRequest.g:1379:1: ( '}' )
            // InternalSocialRequest.g:1380:2: '}'
            {
             before(grammarAccess.getAttributeAccess().getRightCurlyBracketKeyword_5_2()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getRightCurlyBracketKeyword_5_2()); 

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
    // $ANTLR end "rule__Attribute__Group_5__2__Impl"


    // $ANTLR start "rule__Attribute__Group_5_1_0__0"
    // InternalSocialRequest.g:1390:1: rule__Attribute__Group_5_1_0__0 : rule__Attribute__Group_5_1_0__0__Impl rule__Attribute__Group_5_1_0__1 ;
    public final void rule__Attribute__Group_5_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1394:1: ( rule__Attribute__Group_5_1_0__0__Impl rule__Attribute__Group_5_1_0__1 )
            // InternalSocialRequest.g:1395:2: rule__Attribute__Group_5_1_0__0__Impl rule__Attribute__Group_5_1_0__1
            {
            pushFollow(FOLLOW_6);
            rule__Attribute__Group_5_1_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group_5_1_0__1();

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
    // $ANTLR end "rule__Attribute__Group_5_1_0__0"


    // $ANTLR start "rule__Attribute__Group_5_1_0__0__Impl"
    // InternalSocialRequest.g:1402:1: rule__Attribute__Group_5_1_0__0__Impl : ( 'mappedBy:' ) ;
    public final void rule__Attribute__Group_5_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1406:1: ( ( 'mappedBy:' ) )
            // InternalSocialRequest.g:1407:1: ( 'mappedBy:' )
            {
            // InternalSocialRequest.g:1407:1: ( 'mappedBy:' )
            // InternalSocialRequest.g:1408:2: 'mappedBy:'
            {
             before(grammarAccess.getAttributeAccess().getMappedByKeyword_5_1_0_0()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getMappedByKeyword_5_1_0_0()); 

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
    // $ANTLR end "rule__Attribute__Group_5_1_0__0__Impl"


    // $ANTLR start "rule__Attribute__Group_5_1_0__1"
    // InternalSocialRequest.g:1417:1: rule__Attribute__Group_5_1_0__1 : rule__Attribute__Group_5_1_0__1__Impl ;
    public final void rule__Attribute__Group_5_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1421:1: ( rule__Attribute__Group_5_1_0__1__Impl )
            // InternalSocialRequest.g:1422:2: rule__Attribute__Group_5_1_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__Group_5_1_0__1__Impl();

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
    // $ANTLR end "rule__Attribute__Group_5_1_0__1"


    // $ANTLR start "rule__Attribute__Group_5_1_0__1__Impl"
    // InternalSocialRequest.g:1428:1: rule__Attribute__Group_5_1_0__1__Impl : ( ( rule__Attribute__MappedByAssignment_5_1_0_1 ) ) ;
    public final void rule__Attribute__Group_5_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1432:1: ( ( ( rule__Attribute__MappedByAssignment_5_1_0_1 ) ) )
            // InternalSocialRequest.g:1433:1: ( ( rule__Attribute__MappedByAssignment_5_1_0_1 ) )
            {
            // InternalSocialRequest.g:1433:1: ( ( rule__Attribute__MappedByAssignment_5_1_0_1 ) )
            // InternalSocialRequest.g:1434:2: ( rule__Attribute__MappedByAssignment_5_1_0_1 )
            {
             before(grammarAccess.getAttributeAccess().getMappedByAssignment_5_1_0_1()); 
            // InternalSocialRequest.g:1435:2: ( rule__Attribute__MappedByAssignment_5_1_0_1 )
            // InternalSocialRequest.g:1435:3: rule__Attribute__MappedByAssignment_5_1_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__MappedByAssignment_5_1_0_1();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getMappedByAssignment_5_1_0_1()); 

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
    // $ANTLR end "rule__Attribute__Group_5_1_0__1__Impl"


    // $ANTLR start "rule__Attribute__Group_5_1_1__0"
    // InternalSocialRequest.g:1444:1: rule__Attribute__Group_5_1_1__0 : rule__Attribute__Group_5_1_1__0__Impl rule__Attribute__Group_5_1_1__1 ;
    public final void rule__Attribute__Group_5_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1448:1: ( rule__Attribute__Group_5_1_1__0__Impl rule__Attribute__Group_5_1_1__1 )
            // InternalSocialRequest.g:1449:2: rule__Attribute__Group_5_1_1__0__Impl rule__Attribute__Group_5_1_1__1
            {
            pushFollow(FOLLOW_16);
            rule__Attribute__Group_5_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group_5_1_1__1();

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
    // $ANTLR end "rule__Attribute__Group_5_1_1__0"


    // $ANTLR start "rule__Attribute__Group_5_1_1__0__Impl"
    // InternalSocialRequest.g:1456:1: rule__Attribute__Group_5_1_1__0__Impl : ( 'fetch:' ) ;
    public final void rule__Attribute__Group_5_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1460:1: ( ( 'fetch:' ) )
            // InternalSocialRequest.g:1461:1: ( 'fetch:' )
            {
            // InternalSocialRequest.g:1461:1: ( 'fetch:' )
            // InternalSocialRequest.g:1462:2: 'fetch:'
            {
             before(grammarAccess.getAttributeAccess().getFetchKeyword_5_1_1_0()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getFetchKeyword_5_1_1_0()); 

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
    // $ANTLR end "rule__Attribute__Group_5_1_1__0__Impl"


    // $ANTLR start "rule__Attribute__Group_5_1_1__1"
    // InternalSocialRequest.g:1471:1: rule__Attribute__Group_5_1_1__1 : rule__Attribute__Group_5_1_1__1__Impl ;
    public final void rule__Attribute__Group_5_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1475:1: ( rule__Attribute__Group_5_1_1__1__Impl )
            // InternalSocialRequest.g:1476:2: rule__Attribute__Group_5_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__Group_5_1_1__1__Impl();

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
    // $ANTLR end "rule__Attribute__Group_5_1_1__1"


    // $ANTLR start "rule__Attribute__Group_5_1_1__1__Impl"
    // InternalSocialRequest.g:1482:1: rule__Attribute__Group_5_1_1__1__Impl : ( ( rule__Attribute__FetchTypeAssignment_5_1_1_1 ) ) ;
    public final void rule__Attribute__Group_5_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1486:1: ( ( ( rule__Attribute__FetchTypeAssignment_5_1_1_1 ) ) )
            // InternalSocialRequest.g:1487:1: ( ( rule__Attribute__FetchTypeAssignment_5_1_1_1 ) )
            {
            // InternalSocialRequest.g:1487:1: ( ( rule__Attribute__FetchTypeAssignment_5_1_1_1 ) )
            // InternalSocialRequest.g:1488:2: ( rule__Attribute__FetchTypeAssignment_5_1_1_1 )
            {
             before(grammarAccess.getAttributeAccess().getFetchTypeAssignment_5_1_1_1()); 
            // InternalSocialRequest.g:1489:2: ( rule__Attribute__FetchTypeAssignment_5_1_1_1 )
            // InternalSocialRequest.g:1489:3: rule__Attribute__FetchTypeAssignment_5_1_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__FetchTypeAssignment_5_1_1_1();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getFetchTypeAssignment_5_1_1_1()); 

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
    // $ANTLR end "rule__Attribute__Group_5_1_1__1__Impl"


    // $ANTLR start "rule__Attribute__Group_5_1_2__0"
    // InternalSocialRequest.g:1498:1: rule__Attribute__Group_5_1_2__0 : rule__Attribute__Group_5_1_2__0__Impl rule__Attribute__Group_5_1_2__1 ;
    public final void rule__Attribute__Group_5_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1502:1: ( rule__Attribute__Group_5_1_2__0__Impl rule__Attribute__Group_5_1_2__1 )
            // InternalSocialRequest.g:1503:2: rule__Attribute__Group_5_1_2__0__Impl rule__Attribute__Group_5_1_2__1
            {
            pushFollow(FOLLOW_17);
            rule__Attribute__Group_5_1_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group_5_1_2__1();

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
    // $ANTLR end "rule__Attribute__Group_5_1_2__0"


    // $ANTLR start "rule__Attribute__Group_5_1_2__0__Impl"
    // InternalSocialRequest.g:1510:1: rule__Attribute__Group_5_1_2__0__Impl : ( 'validations' ) ;
    public final void rule__Attribute__Group_5_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1514:1: ( ( 'validations' ) )
            // InternalSocialRequest.g:1515:1: ( 'validations' )
            {
            // InternalSocialRequest.g:1515:1: ( 'validations' )
            // InternalSocialRequest.g:1516:2: 'validations'
            {
             before(grammarAccess.getAttributeAccess().getValidationsKeyword_5_1_2_0()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getValidationsKeyword_5_1_2_0()); 

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
    // $ANTLR end "rule__Attribute__Group_5_1_2__0__Impl"


    // $ANTLR start "rule__Attribute__Group_5_1_2__1"
    // InternalSocialRequest.g:1525:1: rule__Attribute__Group_5_1_2__1 : rule__Attribute__Group_5_1_2__1__Impl rule__Attribute__Group_5_1_2__2 ;
    public final void rule__Attribute__Group_5_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1529:1: ( rule__Attribute__Group_5_1_2__1__Impl rule__Attribute__Group_5_1_2__2 )
            // InternalSocialRequest.g:1530:2: rule__Attribute__Group_5_1_2__1__Impl rule__Attribute__Group_5_1_2__2
            {
            pushFollow(FOLLOW_18);
            rule__Attribute__Group_5_1_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group_5_1_2__2();

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
    // $ANTLR end "rule__Attribute__Group_5_1_2__1"


    // $ANTLR start "rule__Attribute__Group_5_1_2__1__Impl"
    // InternalSocialRequest.g:1537:1: rule__Attribute__Group_5_1_2__1__Impl : ( '{' ) ;
    public final void rule__Attribute__Group_5_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1541:1: ( ( '{' ) )
            // InternalSocialRequest.g:1542:1: ( '{' )
            {
            // InternalSocialRequest.g:1542:1: ( '{' )
            // InternalSocialRequest.g:1543:2: '{'
            {
             before(grammarAccess.getAttributeAccess().getLeftCurlyBracketKeyword_5_1_2_1()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getLeftCurlyBracketKeyword_5_1_2_1()); 

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
    // $ANTLR end "rule__Attribute__Group_5_1_2__1__Impl"


    // $ANTLR start "rule__Attribute__Group_5_1_2__2"
    // InternalSocialRequest.g:1552:1: rule__Attribute__Group_5_1_2__2 : rule__Attribute__Group_5_1_2__2__Impl rule__Attribute__Group_5_1_2__3 ;
    public final void rule__Attribute__Group_5_1_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1556:1: ( rule__Attribute__Group_5_1_2__2__Impl rule__Attribute__Group_5_1_2__3 )
            // InternalSocialRequest.g:1557:2: rule__Attribute__Group_5_1_2__2__Impl rule__Attribute__Group_5_1_2__3
            {
            pushFollow(FOLLOW_9);
            rule__Attribute__Group_5_1_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group_5_1_2__3();

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
    // $ANTLR end "rule__Attribute__Group_5_1_2__2"


    // $ANTLR start "rule__Attribute__Group_5_1_2__2__Impl"
    // InternalSocialRequest.g:1564:1: rule__Attribute__Group_5_1_2__2__Impl : ( ( ( rule__Attribute__ValidationsAssignment_5_1_2_2 ) ) ( ( rule__Attribute__ValidationsAssignment_5_1_2_2 )* ) ) ;
    public final void rule__Attribute__Group_5_1_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1568:1: ( ( ( ( rule__Attribute__ValidationsAssignment_5_1_2_2 ) ) ( ( rule__Attribute__ValidationsAssignment_5_1_2_2 )* ) ) )
            // InternalSocialRequest.g:1569:1: ( ( ( rule__Attribute__ValidationsAssignment_5_1_2_2 ) ) ( ( rule__Attribute__ValidationsAssignment_5_1_2_2 )* ) )
            {
            // InternalSocialRequest.g:1569:1: ( ( ( rule__Attribute__ValidationsAssignment_5_1_2_2 ) ) ( ( rule__Attribute__ValidationsAssignment_5_1_2_2 )* ) )
            // InternalSocialRequest.g:1570:2: ( ( rule__Attribute__ValidationsAssignment_5_1_2_2 ) ) ( ( rule__Attribute__ValidationsAssignment_5_1_2_2 )* )
            {
            // InternalSocialRequest.g:1570:2: ( ( rule__Attribute__ValidationsAssignment_5_1_2_2 ) )
            // InternalSocialRequest.g:1571:3: ( rule__Attribute__ValidationsAssignment_5_1_2_2 )
            {
             before(grammarAccess.getAttributeAccess().getValidationsAssignment_5_1_2_2()); 
            // InternalSocialRequest.g:1572:3: ( rule__Attribute__ValidationsAssignment_5_1_2_2 )
            // InternalSocialRequest.g:1572:4: rule__Attribute__ValidationsAssignment_5_1_2_2
            {
            pushFollow(FOLLOW_19);
            rule__Attribute__ValidationsAssignment_5_1_2_2();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getValidationsAssignment_5_1_2_2()); 

            }

            // InternalSocialRequest.g:1575:2: ( ( rule__Attribute__ValidationsAssignment_5_1_2_2 )* )
            // InternalSocialRequest.g:1576:3: ( rule__Attribute__ValidationsAssignment_5_1_2_2 )*
            {
             before(grammarAccess.getAttributeAccess().getValidationsAssignment_5_1_2_2()); 
            // InternalSocialRequest.g:1577:3: ( rule__Attribute__ValidationsAssignment_5_1_2_2 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>=12 && LA17_0<=16)||(LA17_0>=49 && LA17_0<=51)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalSocialRequest.g:1577:4: rule__Attribute__ValidationsAssignment_5_1_2_2
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__Attribute__ValidationsAssignment_5_1_2_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getAttributeAccess().getValidationsAssignment_5_1_2_2()); 

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
    // $ANTLR end "rule__Attribute__Group_5_1_2__2__Impl"


    // $ANTLR start "rule__Attribute__Group_5_1_2__3"
    // InternalSocialRequest.g:1586:1: rule__Attribute__Group_5_1_2__3 : rule__Attribute__Group_5_1_2__3__Impl ;
    public final void rule__Attribute__Group_5_1_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1590:1: ( rule__Attribute__Group_5_1_2__3__Impl )
            // InternalSocialRequest.g:1591:2: rule__Attribute__Group_5_1_2__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__Group_5_1_2__3__Impl();

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
    // $ANTLR end "rule__Attribute__Group_5_1_2__3"


    // $ANTLR start "rule__Attribute__Group_5_1_2__3__Impl"
    // InternalSocialRequest.g:1597:1: rule__Attribute__Group_5_1_2__3__Impl : ( '}' ) ;
    public final void rule__Attribute__Group_5_1_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1601:1: ( ( '}' ) )
            // InternalSocialRequest.g:1602:1: ( '}' )
            {
            // InternalSocialRequest.g:1602:1: ( '}' )
            // InternalSocialRequest.g:1603:2: '}'
            {
             before(grammarAccess.getAttributeAccess().getRightCurlyBracketKeyword_5_1_2_3()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getRightCurlyBracketKeyword_5_1_2_3()); 

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
    // $ANTLR end "rule__Attribute__Group_5_1_2__3__Impl"


    // $ANTLR start "rule__Modifier__Group_2__0"
    // InternalSocialRequest.g:1613:1: rule__Modifier__Group_2__0 : rule__Modifier__Group_2__0__Impl rule__Modifier__Group_2__1 ;
    public final void rule__Modifier__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1617:1: ( rule__Modifier__Group_2__0__Impl rule__Modifier__Group_2__1 )
            // InternalSocialRequest.g:1618:2: rule__Modifier__Group_2__0__Impl rule__Modifier__Group_2__1
            {
            pushFollow(FOLLOW_20);
            rule__Modifier__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Modifier__Group_2__1();

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
    // $ANTLR end "rule__Modifier__Group_2__0"


    // $ANTLR start "rule__Modifier__Group_2__0__Impl"
    // InternalSocialRequest.g:1625:1: rule__Modifier__Group_2__0__Impl : ( ( rule__Modifier__IsIDAssignment_2_0 ) ) ;
    public final void rule__Modifier__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1629:1: ( ( ( rule__Modifier__IsIDAssignment_2_0 ) ) )
            // InternalSocialRequest.g:1630:1: ( ( rule__Modifier__IsIDAssignment_2_0 ) )
            {
            // InternalSocialRequest.g:1630:1: ( ( rule__Modifier__IsIDAssignment_2_0 ) )
            // InternalSocialRequest.g:1631:2: ( rule__Modifier__IsIDAssignment_2_0 )
            {
             before(grammarAccess.getModifierAccess().getIsIDAssignment_2_0()); 
            // InternalSocialRequest.g:1632:2: ( rule__Modifier__IsIDAssignment_2_0 )
            // InternalSocialRequest.g:1632:3: rule__Modifier__IsIDAssignment_2_0
            {
            pushFollow(FOLLOW_2);
            rule__Modifier__IsIDAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getModifierAccess().getIsIDAssignment_2_0()); 

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
    // $ANTLR end "rule__Modifier__Group_2__0__Impl"


    // $ANTLR start "rule__Modifier__Group_2__1"
    // InternalSocialRequest.g:1640:1: rule__Modifier__Group_2__1 : rule__Modifier__Group_2__1__Impl ;
    public final void rule__Modifier__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1644:1: ( rule__Modifier__Group_2__1__Impl )
            // InternalSocialRequest.g:1645:2: rule__Modifier__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Modifier__Group_2__1__Impl();

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
    // $ANTLR end "rule__Modifier__Group_2__1"


    // $ANTLR start "rule__Modifier__Group_2__1__Impl"
    // InternalSocialRequest.g:1651:1: rule__Modifier__Group_2__1__Impl : ( ( rule__Modifier__Group_2_1__0 )? ) ;
    public final void rule__Modifier__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1655:1: ( ( ( rule__Modifier__Group_2_1__0 )? ) )
            // InternalSocialRequest.g:1656:1: ( ( rule__Modifier__Group_2_1__0 )? )
            {
            // InternalSocialRequest.g:1656:1: ( ( rule__Modifier__Group_2_1__0 )? )
            // InternalSocialRequest.g:1657:2: ( rule__Modifier__Group_2_1__0 )?
            {
             before(grammarAccess.getModifierAccess().getGroup_2_1()); 
            // InternalSocialRequest.g:1658:2: ( rule__Modifier__Group_2_1__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==47) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalSocialRequest.g:1658:3: rule__Modifier__Group_2_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Modifier__Group_2_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getModifierAccess().getGroup_2_1()); 

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
    // $ANTLR end "rule__Modifier__Group_2__1__Impl"


    // $ANTLR start "rule__Modifier__Group_2_1__0"
    // InternalSocialRequest.g:1667:1: rule__Modifier__Group_2_1__0 : rule__Modifier__Group_2_1__0__Impl rule__Modifier__Group_2_1__1 ;
    public final void rule__Modifier__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1671:1: ( rule__Modifier__Group_2_1__0__Impl rule__Modifier__Group_2_1__1 )
            // InternalSocialRequest.g:1672:2: rule__Modifier__Group_2_1__0__Impl rule__Modifier__Group_2_1__1
            {
            pushFollow(FOLLOW_21);
            rule__Modifier__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Modifier__Group_2_1__1();

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
    // $ANTLR end "rule__Modifier__Group_2_1__0"


    // $ANTLR start "rule__Modifier__Group_2_1__0__Impl"
    // InternalSocialRequest.g:1679:1: rule__Modifier__Group_2_1__0__Impl : ( '(' ) ;
    public final void rule__Modifier__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1683:1: ( ( '(' ) )
            // InternalSocialRequest.g:1684:1: ( '(' )
            {
            // InternalSocialRequest.g:1684:1: ( '(' )
            // InternalSocialRequest.g:1685:2: '('
            {
             before(grammarAccess.getModifierAccess().getLeftParenthesisKeyword_2_1_0()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getModifierAccess().getLeftParenthesisKeyword_2_1_0()); 

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
    // $ANTLR end "rule__Modifier__Group_2_1__0__Impl"


    // $ANTLR start "rule__Modifier__Group_2_1__1"
    // InternalSocialRequest.g:1694:1: rule__Modifier__Group_2_1__1 : rule__Modifier__Group_2_1__1__Impl rule__Modifier__Group_2_1__2 ;
    public final void rule__Modifier__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1698:1: ( rule__Modifier__Group_2_1__1__Impl rule__Modifier__Group_2_1__2 )
            // InternalSocialRequest.g:1699:2: rule__Modifier__Group_2_1__1__Impl rule__Modifier__Group_2_1__2
            {
            pushFollow(FOLLOW_22);
            rule__Modifier__Group_2_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Modifier__Group_2_1__2();

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
    // $ANTLR end "rule__Modifier__Group_2_1__1"


    // $ANTLR start "rule__Modifier__Group_2_1__1__Impl"
    // InternalSocialRequest.g:1706:1: rule__Modifier__Group_2_1__1__Impl : ( ( rule__Modifier__IDGenerationTypeAssignment_2_1_1 ) ) ;
    public final void rule__Modifier__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1710:1: ( ( ( rule__Modifier__IDGenerationTypeAssignment_2_1_1 ) ) )
            // InternalSocialRequest.g:1711:1: ( ( rule__Modifier__IDGenerationTypeAssignment_2_1_1 ) )
            {
            // InternalSocialRequest.g:1711:1: ( ( rule__Modifier__IDGenerationTypeAssignment_2_1_1 ) )
            // InternalSocialRequest.g:1712:2: ( rule__Modifier__IDGenerationTypeAssignment_2_1_1 )
            {
             before(grammarAccess.getModifierAccess().getIDGenerationTypeAssignment_2_1_1()); 
            // InternalSocialRequest.g:1713:2: ( rule__Modifier__IDGenerationTypeAssignment_2_1_1 )
            // InternalSocialRequest.g:1713:3: rule__Modifier__IDGenerationTypeAssignment_2_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Modifier__IDGenerationTypeAssignment_2_1_1();

            state._fsp--;


            }

             after(grammarAccess.getModifierAccess().getIDGenerationTypeAssignment_2_1_1()); 

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
    // $ANTLR end "rule__Modifier__Group_2_1__1__Impl"


    // $ANTLR start "rule__Modifier__Group_2_1__2"
    // InternalSocialRequest.g:1721:1: rule__Modifier__Group_2_1__2 : rule__Modifier__Group_2_1__2__Impl ;
    public final void rule__Modifier__Group_2_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1725:1: ( rule__Modifier__Group_2_1__2__Impl )
            // InternalSocialRequest.g:1726:2: rule__Modifier__Group_2_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Modifier__Group_2_1__2__Impl();

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
    // $ANTLR end "rule__Modifier__Group_2_1__2"


    // $ANTLR start "rule__Modifier__Group_2_1__2__Impl"
    // InternalSocialRequest.g:1732:1: rule__Modifier__Group_2_1__2__Impl : ( ')' ) ;
    public final void rule__Modifier__Group_2_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1736:1: ( ( ')' ) )
            // InternalSocialRequest.g:1737:1: ( ')' )
            {
            // InternalSocialRequest.g:1737:1: ( ')' )
            // InternalSocialRequest.g:1738:2: ')'
            {
             before(grammarAccess.getModifierAccess().getRightParenthesisKeyword_2_1_2()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getModifierAccess().getRightParenthesisKeyword_2_1_2()); 

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
    // $ANTLR end "rule__Modifier__Group_2_1__2__Impl"


    // $ANTLR start "rule__Validation__Group_0__0"
    // InternalSocialRequest.g:1748:1: rule__Validation__Group_0__0 : rule__Validation__Group_0__0__Impl rule__Validation__Group_0__1 ;
    public final void rule__Validation__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1752:1: ( rule__Validation__Group_0__0__Impl rule__Validation__Group_0__1 )
            // InternalSocialRequest.g:1753:2: rule__Validation__Group_0__0__Impl rule__Validation__Group_0__1
            {
            pushFollow(FOLLOW_23);
            rule__Validation__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Validation__Group_0__1();

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
    // $ANTLR end "rule__Validation__Group_0__0"


    // $ANTLR start "rule__Validation__Group_0__0__Impl"
    // InternalSocialRequest.g:1760:1: rule__Validation__Group_0__0__Impl : ( 'min:' ) ;
    public final void rule__Validation__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1764:1: ( ( 'min:' ) )
            // InternalSocialRequest.g:1765:1: ( 'min:' )
            {
            // InternalSocialRequest.g:1765:1: ( 'min:' )
            // InternalSocialRequest.g:1766:2: 'min:'
            {
             before(grammarAccess.getValidationAccess().getMinKeyword_0_0()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getValidationAccess().getMinKeyword_0_0()); 

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
    // $ANTLR end "rule__Validation__Group_0__0__Impl"


    // $ANTLR start "rule__Validation__Group_0__1"
    // InternalSocialRequest.g:1775:1: rule__Validation__Group_0__1 : rule__Validation__Group_0__1__Impl ;
    public final void rule__Validation__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1779:1: ( rule__Validation__Group_0__1__Impl )
            // InternalSocialRequest.g:1780:2: rule__Validation__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Validation__Group_0__1__Impl();

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
    // $ANTLR end "rule__Validation__Group_0__1"


    // $ANTLR start "rule__Validation__Group_0__1__Impl"
    // InternalSocialRequest.g:1786:1: rule__Validation__Group_0__1__Impl : ( ( rule__Validation__MinAssignment_0_1 ) ) ;
    public final void rule__Validation__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1790:1: ( ( ( rule__Validation__MinAssignment_0_1 ) ) )
            // InternalSocialRequest.g:1791:1: ( ( rule__Validation__MinAssignment_0_1 ) )
            {
            // InternalSocialRequest.g:1791:1: ( ( rule__Validation__MinAssignment_0_1 ) )
            // InternalSocialRequest.g:1792:2: ( rule__Validation__MinAssignment_0_1 )
            {
             before(grammarAccess.getValidationAccess().getMinAssignment_0_1()); 
            // InternalSocialRequest.g:1793:2: ( rule__Validation__MinAssignment_0_1 )
            // InternalSocialRequest.g:1793:3: rule__Validation__MinAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Validation__MinAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getValidationAccess().getMinAssignment_0_1()); 

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
    // $ANTLR end "rule__Validation__Group_0__1__Impl"


    // $ANTLR start "rule__Validation__Group_1__0"
    // InternalSocialRequest.g:1802:1: rule__Validation__Group_1__0 : rule__Validation__Group_1__0__Impl rule__Validation__Group_1__1 ;
    public final void rule__Validation__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1806:1: ( rule__Validation__Group_1__0__Impl rule__Validation__Group_1__1 )
            // InternalSocialRequest.g:1807:2: rule__Validation__Group_1__0__Impl rule__Validation__Group_1__1
            {
            pushFollow(FOLLOW_23);
            rule__Validation__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Validation__Group_1__1();

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
    // $ANTLR end "rule__Validation__Group_1__0"


    // $ANTLR start "rule__Validation__Group_1__0__Impl"
    // InternalSocialRequest.g:1814:1: rule__Validation__Group_1__0__Impl : ( 'max:' ) ;
    public final void rule__Validation__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1818:1: ( ( 'max:' ) )
            // InternalSocialRequest.g:1819:1: ( 'max:' )
            {
            // InternalSocialRequest.g:1819:1: ( 'max:' )
            // InternalSocialRequest.g:1820:2: 'max:'
            {
             before(grammarAccess.getValidationAccess().getMaxKeyword_1_0()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getValidationAccess().getMaxKeyword_1_0()); 

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
    // $ANTLR end "rule__Validation__Group_1__0__Impl"


    // $ANTLR start "rule__Validation__Group_1__1"
    // InternalSocialRequest.g:1829:1: rule__Validation__Group_1__1 : rule__Validation__Group_1__1__Impl ;
    public final void rule__Validation__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1833:1: ( rule__Validation__Group_1__1__Impl )
            // InternalSocialRequest.g:1834:2: rule__Validation__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Validation__Group_1__1__Impl();

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
    // $ANTLR end "rule__Validation__Group_1__1"


    // $ANTLR start "rule__Validation__Group_1__1__Impl"
    // InternalSocialRequest.g:1840:1: rule__Validation__Group_1__1__Impl : ( ( rule__Validation__MaxAssignment_1_1 ) ) ;
    public final void rule__Validation__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1844:1: ( ( ( rule__Validation__MaxAssignment_1_1 ) ) )
            // InternalSocialRequest.g:1845:1: ( ( rule__Validation__MaxAssignment_1_1 ) )
            {
            // InternalSocialRequest.g:1845:1: ( ( rule__Validation__MaxAssignment_1_1 ) )
            // InternalSocialRequest.g:1846:2: ( rule__Validation__MaxAssignment_1_1 )
            {
             before(grammarAccess.getValidationAccess().getMaxAssignment_1_1()); 
            // InternalSocialRequest.g:1847:2: ( rule__Validation__MaxAssignment_1_1 )
            // InternalSocialRequest.g:1847:3: rule__Validation__MaxAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Validation__MaxAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getValidationAccess().getMaxAssignment_1_1()); 

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
    // $ANTLR end "rule__Validation__Group_1__1__Impl"


    // $ANTLR start "rule__Validation__Group_2__0"
    // InternalSocialRequest.g:1856:1: rule__Validation__Group_2__0 : rule__Validation__Group_2__0__Impl rule__Validation__Group_2__1 ;
    public final void rule__Validation__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1860:1: ( rule__Validation__Group_2__0__Impl rule__Validation__Group_2__1 )
            // InternalSocialRequest.g:1861:2: rule__Validation__Group_2__0__Impl rule__Validation__Group_2__1
            {
            pushFollow(FOLLOW_24);
            rule__Validation__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Validation__Group_2__1();

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
    // $ANTLR end "rule__Validation__Group_2__0"


    // $ANTLR start "rule__Validation__Group_2__0__Impl"
    // InternalSocialRequest.g:1868:1: rule__Validation__Group_2__0__Impl : ( 'pattern:' ) ;
    public final void rule__Validation__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1872:1: ( ( 'pattern:' ) )
            // InternalSocialRequest.g:1873:1: ( 'pattern:' )
            {
            // InternalSocialRequest.g:1873:1: ( 'pattern:' )
            // InternalSocialRequest.g:1874:2: 'pattern:'
            {
             before(grammarAccess.getValidationAccess().getPatternKeyword_2_0()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getValidationAccess().getPatternKeyword_2_0()); 

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
    // $ANTLR end "rule__Validation__Group_2__0__Impl"


    // $ANTLR start "rule__Validation__Group_2__1"
    // InternalSocialRequest.g:1883:1: rule__Validation__Group_2__1 : rule__Validation__Group_2__1__Impl ;
    public final void rule__Validation__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1887:1: ( rule__Validation__Group_2__1__Impl )
            // InternalSocialRequest.g:1888:2: rule__Validation__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Validation__Group_2__1__Impl();

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
    // $ANTLR end "rule__Validation__Group_2__1"


    // $ANTLR start "rule__Validation__Group_2__1__Impl"
    // InternalSocialRequest.g:1894:1: rule__Validation__Group_2__1__Impl : ( ( rule__Validation__RegexAssignment_2_1 ) ) ;
    public final void rule__Validation__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1898:1: ( ( ( rule__Validation__RegexAssignment_2_1 ) ) )
            // InternalSocialRequest.g:1899:1: ( ( rule__Validation__RegexAssignment_2_1 ) )
            {
            // InternalSocialRequest.g:1899:1: ( ( rule__Validation__RegexAssignment_2_1 ) )
            // InternalSocialRequest.g:1900:2: ( rule__Validation__RegexAssignment_2_1 )
            {
             before(grammarAccess.getValidationAccess().getRegexAssignment_2_1()); 
            // InternalSocialRequest.g:1901:2: ( rule__Validation__RegexAssignment_2_1 )
            // InternalSocialRequest.g:1901:3: rule__Validation__RegexAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Validation__RegexAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getValidationAccess().getRegexAssignment_2_1()); 

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
    // $ANTLR end "rule__Validation__Group_2__1__Impl"


    // $ANTLR start "rule__Repository__Group__0"
    // InternalSocialRequest.g:1910:1: rule__Repository__Group__0 : rule__Repository__Group__0__Impl rule__Repository__Group__1 ;
    public final void rule__Repository__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1914:1: ( rule__Repository__Group__0__Impl rule__Repository__Group__1 )
            // InternalSocialRequest.g:1915:2: rule__Repository__Group__0__Impl rule__Repository__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Repository__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Repository__Group__1();

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
    // $ANTLR end "rule__Repository__Group__0"


    // $ANTLR start "rule__Repository__Group__0__Impl"
    // InternalSocialRequest.g:1922:1: rule__Repository__Group__0__Impl : ( 'Repository' ) ;
    public final void rule__Repository__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1926:1: ( ( 'Repository' ) )
            // InternalSocialRequest.g:1927:1: ( 'Repository' )
            {
            // InternalSocialRequest.g:1927:1: ( 'Repository' )
            // InternalSocialRequest.g:1928:2: 'Repository'
            {
             before(grammarAccess.getRepositoryAccess().getRepositoryKeyword_0()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getRepositoryAccess().getRepositoryKeyword_0()); 

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
    // $ANTLR end "rule__Repository__Group__0__Impl"


    // $ANTLR start "rule__Repository__Group__1"
    // InternalSocialRequest.g:1937:1: rule__Repository__Group__1 : rule__Repository__Group__1__Impl rule__Repository__Group__2 ;
    public final void rule__Repository__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1941:1: ( rule__Repository__Group__1__Impl rule__Repository__Group__2 )
            // InternalSocialRequest.g:1942:2: rule__Repository__Group__1__Impl rule__Repository__Group__2
            {
            pushFollow(FOLLOW_17);
            rule__Repository__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Repository__Group__2();

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
    // $ANTLR end "rule__Repository__Group__1"


    // $ANTLR start "rule__Repository__Group__1__Impl"
    // InternalSocialRequest.g:1949:1: rule__Repository__Group__1__Impl : ( ( rule__Repository__EntityAssignment_1 ) ) ;
    public final void rule__Repository__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1953:1: ( ( ( rule__Repository__EntityAssignment_1 ) ) )
            // InternalSocialRequest.g:1954:1: ( ( rule__Repository__EntityAssignment_1 ) )
            {
            // InternalSocialRequest.g:1954:1: ( ( rule__Repository__EntityAssignment_1 ) )
            // InternalSocialRequest.g:1955:2: ( rule__Repository__EntityAssignment_1 )
            {
             before(grammarAccess.getRepositoryAccess().getEntityAssignment_1()); 
            // InternalSocialRequest.g:1956:2: ( rule__Repository__EntityAssignment_1 )
            // InternalSocialRequest.g:1956:3: rule__Repository__EntityAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Repository__EntityAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRepositoryAccess().getEntityAssignment_1()); 

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
    // $ANTLR end "rule__Repository__Group__1__Impl"


    // $ANTLR start "rule__Repository__Group__2"
    // InternalSocialRequest.g:1964:1: rule__Repository__Group__2 : rule__Repository__Group__2__Impl rule__Repository__Group__3 ;
    public final void rule__Repository__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1968:1: ( rule__Repository__Group__2__Impl rule__Repository__Group__3 )
            // InternalSocialRequest.g:1969:2: rule__Repository__Group__2__Impl rule__Repository__Group__3
            {
            pushFollow(FOLLOW_25);
            rule__Repository__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Repository__Group__3();

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
    // $ANTLR end "rule__Repository__Group__2"


    // $ANTLR start "rule__Repository__Group__2__Impl"
    // InternalSocialRequest.g:1976:1: rule__Repository__Group__2__Impl : ( '{' ) ;
    public final void rule__Repository__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1980:1: ( ( '{' ) )
            // InternalSocialRequest.g:1981:1: ( '{' )
            {
            // InternalSocialRequest.g:1981:1: ( '{' )
            // InternalSocialRequest.g:1982:2: '{'
            {
             before(grammarAccess.getRepositoryAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getRepositoryAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__Repository__Group__2__Impl"


    // $ANTLR start "rule__Repository__Group__3"
    // InternalSocialRequest.g:1991:1: rule__Repository__Group__3 : rule__Repository__Group__3__Impl rule__Repository__Group__4 ;
    public final void rule__Repository__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1995:1: ( rule__Repository__Group__3__Impl rule__Repository__Group__4 )
            // InternalSocialRequest.g:1996:2: rule__Repository__Group__3__Impl rule__Repository__Group__4
            {
            pushFollow(FOLLOW_9);
            rule__Repository__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Repository__Group__4();

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
    // $ANTLR end "rule__Repository__Group__3"


    // $ANTLR start "rule__Repository__Group__3__Impl"
    // InternalSocialRequest.g:2003:1: rule__Repository__Group__3__Impl : ( ( ( rule__Repository__QueriesAssignment_3 ) ) ( ( rule__Repository__QueriesAssignment_3 )* ) ) ;
    public final void rule__Repository__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2007:1: ( ( ( ( rule__Repository__QueriesAssignment_3 ) ) ( ( rule__Repository__QueriesAssignment_3 )* ) ) )
            // InternalSocialRequest.g:2008:1: ( ( ( rule__Repository__QueriesAssignment_3 ) ) ( ( rule__Repository__QueriesAssignment_3 )* ) )
            {
            // InternalSocialRequest.g:2008:1: ( ( ( rule__Repository__QueriesAssignment_3 ) ) ( ( rule__Repository__QueriesAssignment_3 )* ) )
            // InternalSocialRequest.g:2009:2: ( ( rule__Repository__QueriesAssignment_3 ) ) ( ( rule__Repository__QueriesAssignment_3 )* )
            {
            // InternalSocialRequest.g:2009:2: ( ( rule__Repository__QueriesAssignment_3 ) )
            // InternalSocialRequest.g:2010:3: ( rule__Repository__QueriesAssignment_3 )
            {
             before(grammarAccess.getRepositoryAccess().getQueriesAssignment_3()); 
            // InternalSocialRequest.g:2011:3: ( rule__Repository__QueriesAssignment_3 )
            // InternalSocialRequest.g:2011:4: rule__Repository__QueriesAssignment_3
            {
            pushFollow(FOLLOW_26);
            rule__Repository__QueriesAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getRepositoryAccess().getQueriesAssignment_3()); 

            }

            // InternalSocialRequest.g:2014:2: ( ( rule__Repository__QueriesAssignment_3 )* )
            // InternalSocialRequest.g:2015:3: ( rule__Repository__QueriesAssignment_3 )*
            {
             before(grammarAccess.getRepositoryAccess().getQueriesAssignment_3()); 
            // InternalSocialRequest.g:2016:3: ( rule__Repository__QueriesAssignment_3 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==53) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalSocialRequest.g:2016:4: rule__Repository__QueriesAssignment_3
            	    {
            	    pushFollow(FOLLOW_26);
            	    rule__Repository__QueriesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getRepositoryAccess().getQueriesAssignment_3()); 

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
    // $ANTLR end "rule__Repository__Group__3__Impl"


    // $ANTLR start "rule__Repository__Group__4"
    // InternalSocialRequest.g:2025:1: rule__Repository__Group__4 : rule__Repository__Group__4__Impl ;
    public final void rule__Repository__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2029:1: ( rule__Repository__Group__4__Impl )
            // InternalSocialRequest.g:2030:2: rule__Repository__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Repository__Group__4__Impl();

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
    // $ANTLR end "rule__Repository__Group__4"


    // $ANTLR start "rule__Repository__Group__4__Impl"
    // InternalSocialRequest.g:2036:1: rule__Repository__Group__4__Impl : ( '}' ) ;
    public final void rule__Repository__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2040:1: ( ( '}' ) )
            // InternalSocialRequest.g:2041:1: ( '}' )
            {
            // InternalSocialRequest.g:2041:1: ( '}' )
            // InternalSocialRequest.g:2042:2: '}'
            {
             before(grammarAccess.getRepositoryAccess().getRightCurlyBracketKeyword_4()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getRepositoryAccess().getRightCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__Repository__Group__4__Impl"


    // $ANTLR start "rule__Query__Group__0"
    // InternalSocialRequest.g:2052:1: rule__Query__Group__0 : rule__Query__Group__0__Impl rule__Query__Group__1 ;
    public final void rule__Query__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2056:1: ( rule__Query__Group__0__Impl rule__Query__Group__1 )
            // InternalSocialRequest.g:2057:2: rule__Query__Group__0__Impl rule__Query__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Query__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Query__Group__1();

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
    // $ANTLR end "rule__Query__Group__0"


    // $ANTLR start "rule__Query__Group__0__Impl"
    // InternalSocialRequest.g:2064:1: rule__Query__Group__0__Impl : ( 'query' ) ;
    public final void rule__Query__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2068:1: ( ( 'query' ) )
            // InternalSocialRequest.g:2069:1: ( 'query' )
            {
            // InternalSocialRequest.g:2069:1: ( 'query' )
            // InternalSocialRequest.g:2070:2: 'query'
            {
             before(grammarAccess.getQueryAccess().getQueryKeyword_0()); 
            match(input,53,FOLLOW_2); 
             after(grammarAccess.getQueryAccess().getQueryKeyword_0()); 

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
    // $ANTLR end "rule__Query__Group__0__Impl"


    // $ANTLR start "rule__Query__Group__1"
    // InternalSocialRequest.g:2079:1: rule__Query__Group__1 : rule__Query__Group__1__Impl rule__Query__Group__2 ;
    public final void rule__Query__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2083:1: ( rule__Query__Group__1__Impl rule__Query__Group__2 )
            // InternalSocialRequest.g:2084:2: rule__Query__Group__1__Impl rule__Query__Group__2
            {
            pushFollow(FOLLOW_27);
            rule__Query__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Query__Group__2();

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
    // $ANTLR end "rule__Query__Group__1"


    // $ANTLR start "rule__Query__Group__1__Impl"
    // InternalSocialRequest.g:2091:1: rule__Query__Group__1__Impl : ( ( rule__Query__NameAssignment_1 ) ) ;
    public final void rule__Query__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2095:1: ( ( ( rule__Query__NameAssignment_1 ) ) )
            // InternalSocialRequest.g:2096:1: ( ( rule__Query__NameAssignment_1 ) )
            {
            // InternalSocialRequest.g:2096:1: ( ( rule__Query__NameAssignment_1 ) )
            // InternalSocialRequest.g:2097:2: ( rule__Query__NameAssignment_1 )
            {
             before(grammarAccess.getQueryAccess().getNameAssignment_1()); 
            // InternalSocialRequest.g:2098:2: ( rule__Query__NameAssignment_1 )
            // InternalSocialRequest.g:2098:3: rule__Query__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Query__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getQueryAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Query__Group__1__Impl"


    // $ANTLR start "rule__Query__Group__2"
    // InternalSocialRequest.g:2106:1: rule__Query__Group__2 : rule__Query__Group__2__Impl rule__Query__Group__3 ;
    public final void rule__Query__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2110:1: ( rule__Query__Group__2__Impl rule__Query__Group__3 )
            // InternalSocialRequest.g:2111:2: rule__Query__Group__2__Impl rule__Query__Group__3
            {
            pushFollow(FOLLOW_27);
            rule__Query__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Query__Group__3();

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
    // $ANTLR end "rule__Query__Group__2"


    // $ANTLR start "rule__Query__Group__2__Impl"
    // InternalSocialRequest.g:2118:1: rule__Query__Group__2__Impl : ( ( rule__Query__Group_2__0 )? ) ;
    public final void rule__Query__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2122:1: ( ( ( rule__Query__Group_2__0 )? ) )
            // InternalSocialRequest.g:2123:1: ( ( rule__Query__Group_2__0 )? )
            {
            // InternalSocialRequest.g:2123:1: ( ( rule__Query__Group_2__0 )? )
            // InternalSocialRequest.g:2124:2: ( rule__Query__Group_2__0 )?
            {
             before(grammarAccess.getQueryAccess().getGroup_2()); 
            // InternalSocialRequest.g:2125:2: ( rule__Query__Group_2__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==43) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalSocialRequest.g:2125:3: rule__Query__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Query__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getQueryAccess().getGroup_2()); 

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
    // $ANTLR end "rule__Query__Group__2__Impl"


    // $ANTLR start "rule__Query__Group__3"
    // InternalSocialRequest.g:2133:1: rule__Query__Group__3 : rule__Query__Group__3__Impl ;
    public final void rule__Query__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2137:1: ( rule__Query__Group__3__Impl )
            // InternalSocialRequest.g:2138:2: rule__Query__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Query__Group__3__Impl();

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
    // $ANTLR end "rule__Query__Group__3"


    // $ANTLR start "rule__Query__Group__3__Impl"
    // InternalSocialRequest.g:2144:1: rule__Query__Group__3__Impl : ( ( rule__Query__Group_3__0 ) ) ;
    public final void rule__Query__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2148:1: ( ( ( rule__Query__Group_3__0 ) ) )
            // InternalSocialRequest.g:2149:1: ( ( rule__Query__Group_3__0 ) )
            {
            // InternalSocialRequest.g:2149:1: ( ( rule__Query__Group_3__0 ) )
            // InternalSocialRequest.g:2150:2: ( rule__Query__Group_3__0 )
            {
             before(grammarAccess.getQueryAccess().getGroup_3()); 
            // InternalSocialRequest.g:2151:2: ( rule__Query__Group_3__0 )
            // InternalSocialRequest.g:2151:3: rule__Query__Group_3__0
            {
            pushFollow(FOLLOW_2);
            rule__Query__Group_3__0();

            state._fsp--;


            }

             after(grammarAccess.getQueryAccess().getGroup_3()); 

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
    // $ANTLR end "rule__Query__Group__3__Impl"


    // $ANTLR start "rule__Query__Group_2__0"
    // InternalSocialRequest.g:2160:1: rule__Query__Group_2__0 : rule__Query__Group_2__0__Impl rule__Query__Group_2__1 ;
    public final void rule__Query__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2164:1: ( rule__Query__Group_2__0__Impl rule__Query__Group_2__1 )
            // InternalSocialRequest.g:2165:2: rule__Query__Group_2__0__Impl rule__Query__Group_2__1
            {
            pushFollow(FOLLOW_28);
            rule__Query__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Query__Group_2__1();

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
    // $ANTLR end "rule__Query__Group_2__0"


    // $ANTLR start "rule__Query__Group_2__0__Impl"
    // InternalSocialRequest.g:2172:1: rule__Query__Group_2__0__Impl : ( ( rule__Query__IsListAssignment_2_0 ) ) ;
    public final void rule__Query__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2176:1: ( ( ( rule__Query__IsListAssignment_2_0 ) ) )
            // InternalSocialRequest.g:2177:1: ( ( rule__Query__IsListAssignment_2_0 ) )
            {
            // InternalSocialRequest.g:2177:1: ( ( rule__Query__IsListAssignment_2_0 ) )
            // InternalSocialRequest.g:2178:2: ( rule__Query__IsListAssignment_2_0 )
            {
             before(grammarAccess.getQueryAccess().getIsListAssignment_2_0()); 
            // InternalSocialRequest.g:2179:2: ( rule__Query__IsListAssignment_2_0 )
            // InternalSocialRequest.g:2179:3: rule__Query__IsListAssignment_2_0
            {
            pushFollow(FOLLOW_2);
            rule__Query__IsListAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getQueryAccess().getIsListAssignment_2_0()); 

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
    // $ANTLR end "rule__Query__Group_2__0__Impl"


    // $ANTLR start "rule__Query__Group_2__1"
    // InternalSocialRequest.g:2187:1: rule__Query__Group_2__1 : rule__Query__Group_2__1__Impl ;
    public final void rule__Query__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2191:1: ( rule__Query__Group_2__1__Impl )
            // InternalSocialRequest.g:2192:2: rule__Query__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Query__Group_2__1__Impl();

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
    // $ANTLR end "rule__Query__Group_2__1"


    // $ANTLR start "rule__Query__Group_2__1__Impl"
    // InternalSocialRequest.g:2198:1: rule__Query__Group_2__1__Impl : ( 'list' ) ;
    public final void rule__Query__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2202:1: ( ( 'list' ) )
            // InternalSocialRequest.g:2203:1: ( 'list' )
            {
            // InternalSocialRequest.g:2203:1: ( 'list' )
            // InternalSocialRequest.g:2204:2: 'list'
            {
             before(grammarAccess.getQueryAccess().getListKeyword_2_1()); 
            match(input,54,FOLLOW_2); 
             after(grammarAccess.getQueryAccess().getListKeyword_2_1()); 

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
    // $ANTLR end "rule__Query__Group_2__1__Impl"


    // $ANTLR start "rule__Query__Group_3__0"
    // InternalSocialRequest.g:2214:1: rule__Query__Group_3__0 : rule__Query__Group_3__0__Impl rule__Query__Group_3__1 ;
    public final void rule__Query__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2218:1: ( rule__Query__Group_3__0__Impl rule__Query__Group_3__1 )
            // InternalSocialRequest.g:2219:2: rule__Query__Group_3__0__Impl rule__Query__Group_3__1
            {
            pushFollow(FOLLOW_29);
            rule__Query__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Query__Group_3__1();

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
    // $ANTLR end "rule__Query__Group_3__0"


    // $ANTLR start "rule__Query__Group_3__0__Impl"
    // InternalSocialRequest.g:2226:1: rule__Query__Group_3__0__Impl : ( '{' ) ;
    public final void rule__Query__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2230:1: ( ( '{' ) )
            // InternalSocialRequest.g:2231:1: ( '{' )
            {
            // InternalSocialRequest.g:2231:1: ( '{' )
            // InternalSocialRequest.g:2232:2: '{'
            {
             before(grammarAccess.getQueryAccess().getLeftCurlyBracketKeyword_3_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getQueryAccess().getLeftCurlyBracketKeyword_3_0()); 

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
    // $ANTLR end "rule__Query__Group_3__0__Impl"


    // $ANTLR start "rule__Query__Group_3__1"
    // InternalSocialRequest.g:2241:1: rule__Query__Group_3__1 : rule__Query__Group_3__1__Impl rule__Query__Group_3__2 ;
    public final void rule__Query__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2245:1: ( rule__Query__Group_3__1__Impl rule__Query__Group_3__2 )
            // InternalSocialRequest.g:2246:2: rule__Query__Group_3__1__Impl rule__Query__Group_3__2
            {
            pushFollow(FOLLOW_29);
            rule__Query__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Query__Group_3__2();

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
    // $ANTLR end "rule__Query__Group_3__1"


    // $ANTLR start "rule__Query__Group_3__1__Impl"
    // InternalSocialRequest.g:2253:1: rule__Query__Group_3__1__Impl : ( ( rule__Query__Group_3_1__0 )? ) ;
    public final void rule__Query__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2257:1: ( ( ( rule__Query__Group_3_1__0 )? ) )
            // InternalSocialRequest.g:2258:1: ( ( rule__Query__Group_3_1__0 )? )
            {
            // InternalSocialRequest.g:2258:1: ( ( rule__Query__Group_3_1__0 )? )
            // InternalSocialRequest.g:2259:2: ( rule__Query__Group_3_1__0 )?
            {
             before(grammarAccess.getQueryAccess().getGroup_3_1()); 
            // InternalSocialRequest.g:2260:2: ( rule__Query__Group_3_1__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==55) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalSocialRequest.g:2260:3: rule__Query__Group_3_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Query__Group_3_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getQueryAccess().getGroup_3_1()); 

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
    // $ANTLR end "rule__Query__Group_3__1__Impl"


    // $ANTLR start "rule__Query__Group_3__2"
    // InternalSocialRequest.g:2268:1: rule__Query__Group_3__2 : rule__Query__Group_3__2__Impl rule__Query__Group_3__3 ;
    public final void rule__Query__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2272:1: ( rule__Query__Group_3__2__Impl rule__Query__Group_3__3 )
            // InternalSocialRequest.g:2273:2: rule__Query__Group_3__2__Impl rule__Query__Group_3__3
            {
            pushFollow(FOLLOW_29);
            rule__Query__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Query__Group_3__3();

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
    // $ANTLR end "rule__Query__Group_3__2"


    // $ANTLR start "rule__Query__Group_3__2__Impl"
    // InternalSocialRequest.g:2280:1: rule__Query__Group_3__2__Impl : ( ( rule__Query__SqlQueryAssignment_3_2 )? ) ;
    public final void rule__Query__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2284:1: ( ( ( rule__Query__SqlQueryAssignment_3_2 )? ) )
            // InternalSocialRequest.g:2285:1: ( ( rule__Query__SqlQueryAssignment_3_2 )? )
            {
            // InternalSocialRequest.g:2285:1: ( ( rule__Query__SqlQueryAssignment_3_2 )? )
            // InternalSocialRequest.g:2286:2: ( rule__Query__SqlQueryAssignment_3_2 )?
            {
             before(grammarAccess.getQueryAccess().getSqlQueryAssignment_3_2()); 
            // InternalSocialRequest.g:2287:2: ( rule__Query__SqlQueryAssignment_3_2 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==56) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalSocialRequest.g:2287:3: rule__Query__SqlQueryAssignment_3_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Query__SqlQueryAssignment_3_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getQueryAccess().getSqlQueryAssignment_3_2()); 

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
    // $ANTLR end "rule__Query__Group_3__2__Impl"


    // $ANTLR start "rule__Query__Group_3__3"
    // InternalSocialRequest.g:2295:1: rule__Query__Group_3__3 : rule__Query__Group_3__3__Impl ;
    public final void rule__Query__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2299:1: ( rule__Query__Group_3__3__Impl )
            // InternalSocialRequest.g:2300:2: rule__Query__Group_3__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Query__Group_3__3__Impl();

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
    // $ANTLR end "rule__Query__Group_3__3"


    // $ANTLR start "rule__Query__Group_3__3__Impl"
    // InternalSocialRequest.g:2306:1: rule__Query__Group_3__3__Impl : ( '}' ) ;
    public final void rule__Query__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2310:1: ( ( '}' ) )
            // InternalSocialRequest.g:2311:1: ( '}' )
            {
            // InternalSocialRequest.g:2311:1: ( '}' )
            // InternalSocialRequest.g:2312:2: '}'
            {
             before(grammarAccess.getQueryAccess().getRightCurlyBracketKeyword_3_3()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getQueryAccess().getRightCurlyBracketKeyword_3_3()); 

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
    // $ANTLR end "rule__Query__Group_3__3__Impl"


    // $ANTLR start "rule__Query__Group_3_1__0"
    // InternalSocialRequest.g:2322:1: rule__Query__Group_3_1__0 : rule__Query__Group_3_1__0__Impl rule__Query__Group_3_1__1 ;
    public final void rule__Query__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2326:1: ( rule__Query__Group_3_1__0__Impl rule__Query__Group_3_1__1 )
            // InternalSocialRequest.g:2327:2: rule__Query__Group_3_1__0__Impl rule__Query__Group_3_1__1
            {
            pushFollow(FOLLOW_17);
            rule__Query__Group_3_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Query__Group_3_1__1();

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
    // $ANTLR end "rule__Query__Group_3_1__0"


    // $ANTLR start "rule__Query__Group_3_1__0__Impl"
    // InternalSocialRequest.g:2334:1: rule__Query__Group_3_1__0__Impl : ( 'params' ) ;
    public final void rule__Query__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2338:1: ( ( 'params' ) )
            // InternalSocialRequest.g:2339:1: ( 'params' )
            {
            // InternalSocialRequest.g:2339:1: ( 'params' )
            // InternalSocialRequest.g:2340:2: 'params'
            {
             before(grammarAccess.getQueryAccess().getParamsKeyword_3_1_0()); 
            match(input,55,FOLLOW_2); 
             after(grammarAccess.getQueryAccess().getParamsKeyword_3_1_0()); 

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
    // $ANTLR end "rule__Query__Group_3_1__0__Impl"


    // $ANTLR start "rule__Query__Group_3_1__1"
    // InternalSocialRequest.g:2349:1: rule__Query__Group_3_1__1 : rule__Query__Group_3_1__1__Impl rule__Query__Group_3_1__2 ;
    public final void rule__Query__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2353:1: ( rule__Query__Group_3_1__1__Impl rule__Query__Group_3_1__2 )
            // InternalSocialRequest.g:2354:2: rule__Query__Group_3_1__1__Impl rule__Query__Group_3_1__2
            {
            pushFollow(FOLLOW_30);
            rule__Query__Group_3_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Query__Group_3_1__2();

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
    // $ANTLR end "rule__Query__Group_3_1__1"


    // $ANTLR start "rule__Query__Group_3_1__1__Impl"
    // InternalSocialRequest.g:2361:1: rule__Query__Group_3_1__1__Impl : ( '{' ) ;
    public final void rule__Query__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2365:1: ( ( '{' ) )
            // InternalSocialRequest.g:2366:1: ( '{' )
            {
            // InternalSocialRequest.g:2366:1: ( '{' )
            // InternalSocialRequest.g:2367:2: '{'
            {
             before(grammarAccess.getQueryAccess().getLeftCurlyBracketKeyword_3_1_1()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getQueryAccess().getLeftCurlyBracketKeyword_3_1_1()); 

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
    // $ANTLR end "rule__Query__Group_3_1__1__Impl"


    // $ANTLR start "rule__Query__Group_3_1__2"
    // InternalSocialRequest.g:2376:1: rule__Query__Group_3_1__2 : rule__Query__Group_3_1__2__Impl rule__Query__Group_3_1__3 ;
    public final void rule__Query__Group_3_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2380:1: ( rule__Query__Group_3_1__2__Impl rule__Query__Group_3_1__3 )
            // InternalSocialRequest.g:2381:2: rule__Query__Group_3_1__2__Impl rule__Query__Group_3_1__3
            {
            pushFollow(FOLLOW_30);
            rule__Query__Group_3_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Query__Group_3_1__3();

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
    // $ANTLR end "rule__Query__Group_3_1__2"


    // $ANTLR start "rule__Query__Group_3_1__2__Impl"
    // InternalSocialRequest.g:2388:1: rule__Query__Group_3_1__2__Impl : ( ( rule__Query__ParamsAssignment_3_1_2 )* ) ;
    public final void rule__Query__Group_3_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2392:1: ( ( ( rule__Query__ParamsAssignment_3_1_2 )* ) )
            // InternalSocialRequest.g:2393:1: ( ( rule__Query__ParamsAssignment_3_1_2 )* )
            {
            // InternalSocialRequest.g:2393:1: ( ( rule__Query__ParamsAssignment_3_1_2 )* )
            // InternalSocialRequest.g:2394:2: ( rule__Query__ParamsAssignment_3_1_2 )*
            {
             before(grammarAccess.getQueryAccess().getParamsAssignment_3_1_2()); 
            // InternalSocialRequest.g:2395:2: ( rule__Query__ParamsAssignment_3_1_2 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==RULE_ID) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalSocialRequest.g:2395:3: rule__Query__ParamsAssignment_3_1_2
            	    {
            	    pushFollow(FOLLOW_31);
            	    rule__Query__ParamsAssignment_3_1_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

             after(grammarAccess.getQueryAccess().getParamsAssignment_3_1_2()); 

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
    // $ANTLR end "rule__Query__Group_3_1__2__Impl"


    // $ANTLR start "rule__Query__Group_3_1__3"
    // InternalSocialRequest.g:2403:1: rule__Query__Group_3_1__3 : rule__Query__Group_3_1__3__Impl ;
    public final void rule__Query__Group_3_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2407:1: ( rule__Query__Group_3_1__3__Impl )
            // InternalSocialRequest.g:2408:2: rule__Query__Group_3_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Query__Group_3_1__3__Impl();

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
    // $ANTLR end "rule__Query__Group_3_1__3"


    // $ANTLR start "rule__Query__Group_3_1__3__Impl"
    // InternalSocialRequest.g:2414:1: rule__Query__Group_3_1__3__Impl : ( '}' ) ;
    public final void rule__Query__Group_3_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2418:1: ( ( '}' ) )
            // InternalSocialRequest.g:2419:1: ( '}' )
            {
            // InternalSocialRequest.g:2419:1: ( '}' )
            // InternalSocialRequest.g:2420:2: '}'
            {
             before(grammarAccess.getQueryAccess().getRightCurlyBracketKeyword_3_1_3()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getQueryAccess().getRightCurlyBracketKeyword_3_1_3()); 

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
    // $ANTLR end "rule__Query__Group_3_1__3__Impl"


    // $ANTLR start "rule__Param__Group__0"
    // InternalSocialRequest.g:2430:1: rule__Param__Group__0 : rule__Param__Group__0__Impl rule__Param__Group__1 ;
    public final void rule__Param__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2434:1: ( rule__Param__Group__0__Impl rule__Param__Group__1 )
            // InternalSocialRequest.g:2435:2: rule__Param__Group__0__Impl rule__Param__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__Param__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Param__Group__1();

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
    // $ANTLR end "rule__Param__Group__0"


    // $ANTLR start "rule__Param__Group__0__Impl"
    // InternalSocialRequest.g:2442:1: rule__Param__Group__0__Impl : ( ( rule__Param__NameAssignment_0 ) ) ;
    public final void rule__Param__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2446:1: ( ( ( rule__Param__NameAssignment_0 ) ) )
            // InternalSocialRequest.g:2447:1: ( ( rule__Param__NameAssignment_0 ) )
            {
            // InternalSocialRequest.g:2447:1: ( ( rule__Param__NameAssignment_0 ) )
            // InternalSocialRequest.g:2448:2: ( rule__Param__NameAssignment_0 )
            {
             before(grammarAccess.getParamAccess().getNameAssignment_0()); 
            // InternalSocialRequest.g:2449:2: ( rule__Param__NameAssignment_0 )
            // InternalSocialRequest.g:2449:3: rule__Param__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Param__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getParamAccess().getNameAssignment_0()); 

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
    // $ANTLR end "rule__Param__Group__0__Impl"


    // $ANTLR start "rule__Param__Group__1"
    // InternalSocialRequest.g:2457:1: rule__Param__Group__1 : rule__Param__Group__1__Impl rule__Param__Group__2 ;
    public final void rule__Param__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2461:1: ( rule__Param__Group__1__Impl rule__Param__Group__2 )
            // InternalSocialRequest.g:2462:2: rule__Param__Group__1__Impl rule__Param__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__Param__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Param__Group__2();

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
    // $ANTLR end "rule__Param__Group__1"


    // $ANTLR start "rule__Param__Group__1__Impl"
    // InternalSocialRequest.g:2469:1: rule__Param__Group__1__Impl : ( ':' ) ;
    public final void rule__Param__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2473:1: ( ( ':' ) )
            // InternalSocialRequest.g:2474:1: ( ':' )
            {
            // InternalSocialRequest.g:2474:1: ( ':' )
            // InternalSocialRequest.g:2475:2: ':'
            {
             before(grammarAccess.getParamAccess().getColonKeyword_1()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getParamAccess().getColonKeyword_1()); 

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
    // $ANTLR end "rule__Param__Group__1__Impl"


    // $ANTLR start "rule__Param__Group__2"
    // InternalSocialRequest.g:2484:1: rule__Param__Group__2 : rule__Param__Group__2__Impl ;
    public final void rule__Param__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2488:1: ( rule__Param__Group__2__Impl )
            // InternalSocialRequest.g:2489:2: rule__Param__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Param__Group__2__Impl();

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
    // $ANTLR end "rule__Param__Group__2"


    // $ANTLR start "rule__Param__Group__2__Impl"
    // InternalSocialRequest.g:2495:1: rule__Param__Group__2__Impl : ( ( rule__Param__TypeAssignment_2 ) ) ;
    public final void rule__Param__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2499:1: ( ( ( rule__Param__TypeAssignment_2 ) ) )
            // InternalSocialRequest.g:2500:1: ( ( rule__Param__TypeAssignment_2 ) )
            {
            // InternalSocialRequest.g:2500:1: ( ( rule__Param__TypeAssignment_2 ) )
            // InternalSocialRequest.g:2501:2: ( rule__Param__TypeAssignment_2 )
            {
             before(grammarAccess.getParamAccess().getTypeAssignment_2()); 
            // InternalSocialRequest.g:2502:2: ( rule__Param__TypeAssignment_2 )
            // InternalSocialRequest.g:2502:3: rule__Param__TypeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Param__TypeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getParamAccess().getTypeAssignment_2()); 

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
    // $ANTLR end "rule__Param__Group__2__Impl"


    // $ANTLR start "rule__SQLQuery__Group__0"
    // InternalSocialRequest.g:2511:1: rule__SQLQuery__Group__0 : rule__SQLQuery__Group__0__Impl rule__SQLQuery__Group__1 ;
    public final void rule__SQLQuery__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2515:1: ( rule__SQLQuery__Group__0__Impl rule__SQLQuery__Group__1 )
            // InternalSocialRequest.g:2516:2: rule__SQLQuery__Group__0__Impl rule__SQLQuery__Group__1
            {
            pushFollow(FOLLOW_32);
            rule__SQLQuery__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SQLQuery__Group__1();

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
    // $ANTLR end "rule__SQLQuery__Group__0"


    // $ANTLR start "rule__SQLQuery__Group__0__Impl"
    // InternalSocialRequest.g:2523:1: rule__SQLQuery__Group__0__Impl : ( ( rule__SQLQuery__SelectAssignment_0 ) ) ;
    public final void rule__SQLQuery__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2527:1: ( ( ( rule__SQLQuery__SelectAssignment_0 ) ) )
            // InternalSocialRequest.g:2528:1: ( ( rule__SQLQuery__SelectAssignment_0 ) )
            {
            // InternalSocialRequest.g:2528:1: ( ( rule__SQLQuery__SelectAssignment_0 ) )
            // InternalSocialRequest.g:2529:2: ( rule__SQLQuery__SelectAssignment_0 )
            {
             before(grammarAccess.getSQLQueryAccess().getSelectAssignment_0()); 
            // InternalSocialRequest.g:2530:2: ( rule__SQLQuery__SelectAssignment_0 )
            // InternalSocialRequest.g:2530:3: rule__SQLQuery__SelectAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__SQLQuery__SelectAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getSQLQueryAccess().getSelectAssignment_0()); 

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
    // $ANTLR end "rule__SQLQuery__Group__0__Impl"


    // $ANTLR start "rule__SQLQuery__Group__1"
    // InternalSocialRequest.g:2538:1: rule__SQLQuery__Group__1 : rule__SQLQuery__Group__1__Impl rule__SQLQuery__Group__2 ;
    public final void rule__SQLQuery__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2542:1: ( rule__SQLQuery__Group__1__Impl rule__SQLQuery__Group__2 )
            // InternalSocialRequest.g:2543:2: rule__SQLQuery__Group__1__Impl rule__SQLQuery__Group__2
            {
            pushFollow(FOLLOW_33);
            rule__SQLQuery__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SQLQuery__Group__2();

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
    // $ANTLR end "rule__SQLQuery__Group__1"


    // $ANTLR start "rule__SQLQuery__Group__1__Impl"
    // InternalSocialRequest.g:2550:1: rule__SQLQuery__Group__1__Impl : ( ( rule__SQLQuery__FromAssignment_1 ) ) ;
    public final void rule__SQLQuery__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2554:1: ( ( ( rule__SQLQuery__FromAssignment_1 ) ) )
            // InternalSocialRequest.g:2555:1: ( ( rule__SQLQuery__FromAssignment_1 ) )
            {
            // InternalSocialRequest.g:2555:1: ( ( rule__SQLQuery__FromAssignment_1 ) )
            // InternalSocialRequest.g:2556:2: ( rule__SQLQuery__FromAssignment_1 )
            {
             before(grammarAccess.getSQLQueryAccess().getFromAssignment_1()); 
            // InternalSocialRequest.g:2557:2: ( rule__SQLQuery__FromAssignment_1 )
            // InternalSocialRequest.g:2557:3: rule__SQLQuery__FromAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__SQLQuery__FromAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSQLQueryAccess().getFromAssignment_1()); 

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
    // $ANTLR end "rule__SQLQuery__Group__1__Impl"


    // $ANTLR start "rule__SQLQuery__Group__2"
    // InternalSocialRequest.g:2565:1: rule__SQLQuery__Group__2 : rule__SQLQuery__Group__2__Impl rule__SQLQuery__Group__3 ;
    public final void rule__SQLQuery__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2569:1: ( rule__SQLQuery__Group__2__Impl rule__SQLQuery__Group__3 )
            // InternalSocialRequest.g:2570:2: rule__SQLQuery__Group__2__Impl rule__SQLQuery__Group__3
            {
            pushFollow(FOLLOW_33);
            rule__SQLQuery__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SQLQuery__Group__3();

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
    // $ANTLR end "rule__SQLQuery__Group__2"


    // $ANTLR start "rule__SQLQuery__Group__2__Impl"
    // InternalSocialRequest.g:2577:1: rule__SQLQuery__Group__2__Impl : ( ( rule__SQLQuery__JoinsAssignment_2 )* ) ;
    public final void rule__SQLQuery__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2581:1: ( ( ( rule__SQLQuery__JoinsAssignment_2 )* ) )
            // InternalSocialRequest.g:2582:1: ( ( rule__SQLQuery__JoinsAssignment_2 )* )
            {
            // InternalSocialRequest.g:2582:1: ( ( rule__SQLQuery__JoinsAssignment_2 )* )
            // InternalSocialRequest.g:2583:2: ( rule__SQLQuery__JoinsAssignment_2 )*
            {
             before(grammarAccess.getSQLQueryAccess().getJoinsAssignment_2()); 
            // InternalSocialRequest.g:2584:2: ( rule__SQLQuery__JoinsAssignment_2 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( ((LA24_0>=35 && LA24_0<=38)) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalSocialRequest.g:2584:3: rule__SQLQuery__JoinsAssignment_2
            	    {
            	    pushFollow(FOLLOW_34);
            	    rule__SQLQuery__JoinsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

             after(grammarAccess.getSQLQueryAccess().getJoinsAssignment_2()); 

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
    // $ANTLR end "rule__SQLQuery__Group__2__Impl"


    // $ANTLR start "rule__SQLQuery__Group__3"
    // InternalSocialRequest.g:2592:1: rule__SQLQuery__Group__3 : rule__SQLQuery__Group__3__Impl rule__SQLQuery__Group__4 ;
    public final void rule__SQLQuery__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2596:1: ( rule__SQLQuery__Group__3__Impl rule__SQLQuery__Group__4 )
            // InternalSocialRequest.g:2597:2: rule__SQLQuery__Group__3__Impl rule__SQLQuery__Group__4
            {
            pushFollow(FOLLOW_33);
            rule__SQLQuery__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SQLQuery__Group__4();

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
    // $ANTLR end "rule__SQLQuery__Group__3"


    // $ANTLR start "rule__SQLQuery__Group__3__Impl"
    // InternalSocialRequest.g:2604:1: rule__SQLQuery__Group__3__Impl : ( ( rule__SQLQuery__WhereAssignment_3 )? ) ;
    public final void rule__SQLQuery__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2608:1: ( ( ( rule__SQLQuery__WhereAssignment_3 )? ) )
            // InternalSocialRequest.g:2609:1: ( ( rule__SQLQuery__WhereAssignment_3 )? )
            {
            // InternalSocialRequest.g:2609:1: ( ( rule__SQLQuery__WhereAssignment_3 )? )
            // InternalSocialRequest.g:2610:2: ( rule__SQLQuery__WhereAssignment_3 )?
            {
             before(grammarAccess.getSQLQueryAccess().getWhereAssignment_3()); 
            // InternalSocialRequest.g:2611:2: ( rule__SQLQuery__WhereAssignment_3 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==59) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalSocialRequest.g:2611:3: rule__SQLQuery__WhereAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__SQLQuery__WhereAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSQLQueryAccess().getWhereAssignment_3()); 

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
    // $ANTLR end "rule__SQLQuery__Group__3__Impl"


    // $ANTLR start "rule__SQLQuery__Group__4"
    // InternalSocialRequest.g:2619:1: rule__SQLQuery__Group__4 : rule__SQLQuery__Group__4__Impl ;
    public final void rule__SQLQuery__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2623:1: ( rule__SQLQuery__Group__4__Impl )
            // InternalSocialRequest.g:2624:2: rule__SQLQuery__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SQLQuery__Group__4__Impl();

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
    // $ANTLR end "rule__SQLQuery__Group__4"


    // $ANTLR start "rule__SQLQuery__Group__4__Impl"
    // InternalSocialRequest.g:2630:1: rule__SQLQuery__Group__4__Impl : ( ( rule__SQLQuery__OrderAssignment_4 )? ) ;
    public final void rule__SQLQuery__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2634:1: ( ( ( rule__SQLQuery__OrderAssignment_4 )? ) )
            // InternalSocialRequest.g:2635:1: ( ( rule__SQLQuery__OrderAssignment_4 )? )
            {
            // InternalSocialRequest.g:2635:1: ( ( rule__SQLQuery__OrderAssignment_4 )? )
            // InternalSocialRequest.g:2636:2: ( rule__SQLQuery__OrderAssignment_4 )?
            {
             before(grammarAccess.getSQLQueryAccess().getOrderAssignment_4()); 
            // InternalSocialRequest.g:2637:2: ( rule__SQLQuery__OrderAssignment_4 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==60) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalSocialRequest.g:2637:3: rule__SQLQuery__OrderAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__SQLQuery__OrderAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSQLQueryAccess().getOrderAssignment_4()); 

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
    // $ANTLR end "rule__SQLQuery__Group__4__Impl"


    // $ANTLR start "rule__Select__Group__0"
    // InternalSocialRequest.g:2646:1: rule__Select__Group__0 : rule__Select__Group__0__Impl rule__Select__Group__1 ;
    public final void rule__Select__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2650:1: ( rule__Select__Group__0__Impl rule__Select__Group__1 )
            // InternalSocialRequest.g:2651:2: rule__Select__Group__0__Impl rule__Select__Group__1
            {
            pushFollow(FOLLOW_35);
            rule__Select__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Select__Group__1();

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
    // $ANTLR end "rule__Select__Group__0"


    // $ANTLR start "rule__Select__Group__0__Impl"
    // InternalSocialRequest.g:2658:1: rule__Select__Group__0__Impl : ( 'SELECT' ) ;
    public final void rule__Select__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2662:1: ( ( 'SELECT' ) )
            // InternalSocialRequest.g:2663:1: ( 'SELECT' )
            {
            // InternalSocialRequest.g:2663:1: ( 'SELECT' )
            // InternalSocialRequest.g:2664:2: 'SELECT'
            {
             before(grammarAccess.getSelectAccess().getSELECTKeyword_0()); 
            match(input,56,FOLLOW_2); 
             after(grammarAccess.getSelectAccess().getSELECTKeyword_0()); 

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
    // $ANTLR end "rule__Select__Group__0__Impl"


    // $ANTLR start "rule__Select__Group__1"
    // InternalSocialRequest.g:2673:1: rule__Select__Group__1 : rule__Select__Group__1__Impl rule__Select__Group__2 ;
    public final void rule__Select__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2677:1: ( rule__Select__Group__1__Impl rule__Select__Group__2 )
            // InternalSocialRequest.g:2678:2: rule__Select__Group__1__Impl rule__Select__Group__2
            {
            pushFollow(FOLLOW_35);
            rule__Select__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Select__Group__2();

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
    // $ANTLR end "rule__Select__Group__1"


    // $ANTLR start "rule__Select__Group__1__Impl"
    // InternalSocialRequest.g:2685:1: rule__Select__Group__1__Impl : ( ( rule__Select__IsDistinctAssignment_1 )? ) ;
    public final void rule__Select__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2689:1: ( ( ( rule__Select__IsDistinctAssignment_1 )? ) )
            // InternalSocialRequest.g:2690:1: ( ( rule__Select__IsDistinctAssignment_1 )? )
            {
            // InternalSocialRequest.g:2690:1: ( ( rule__Select__IsDistinctAssignment_1 )? )
            // InternalSocialRequest.g:2691:2: ( rule__Select__IsDistinctAssignment_1 )?
            {
             before(grammarAccess.getSelectAccess().getIsDistinctAssignment_1()); 
            // InternalSocialRequest.g:2692:2: ( rule__Select__IsDistinctAssignment_1 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==65) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalSocialRequest.g:2692:3: rule__Select__IsDistinctAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Select__IsDistinctAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSelectAccess().getIsDistinctAssignment_1()); 

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
    // $ANTLR end "rule__Select__Group__1__Impl"


    // $ANTLR start "rule__Select__Group__2"
    // InternalSocialRequest.g:2700:1: rule__Select__Group__2 : rule__Select__Group__2__Impl rule__Select__Group__3 ;
    public final void rule__Select__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2704:1: ( rule__Select__Group__2__Impl rule__Select__Group__3 )
            // InternalSocialRequest.g:2705:2: rule__Select__Group__2__Impl rule__Select__Group__3
            {
            pushFollow(FOLLOW_24);
            rule__Select__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Select__Group__3();

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
    // $ANTLR end "rule__Select__Group__2"


    // $ANTLR start "rule__Select__Group__2__Impl"
    // InternalSocialRequest.g:2712:1: rule__Select__Group__2__Impl : ( '{' ) ;
    public final void rule__Select__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2716:1: ( ( '{' ) )
            // InternalSocialRequest.g:2717:1: ( '{' )
            {
            // InternalSocialRequest.g:2717:1: ( '{' )
            // InternalSocialRequest.g:2718:2: '{'
            {
             before(grammarAccess.getSelectAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getSelectAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__Select__Group__2__Impl"


    // $ANTLR start "rule__Select__Group__3"
    // InternalSocialRequest.g:2727:1: rule__Select__Group__3 : rule__Select__Group__3__Impl rule__Select__Group__4 ;
    public final void rule__Select__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2731:1: ( rule__Select__Group__3__Impl rule__Select__Group__4 )
            // InternalSocialRequest.g:2732:2: rule__Select__Group__3__Impl rule__Select__Group__4
            {
            pushFollow(FOLLOW_9);
            rule__Select__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Select__Group__4();

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
    // $ANTLR end "rule__Select__Group__3"


    // $ANTLR start "rule__Select__Group__3__Impl"
    // InternalSocialRequest.g:2739:1: rule__Select__Group__3__Impl : ( ( rule__Select__ClauseAssignment_3 ) ) ;
    public final void rule__Select__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2743:1: ( ( ( rule__Select__ClauseAssignment_3 ) ) )
            // InternalSocialRequest.g:2744:1: ( ( rule__Select__ClauseAssignment_3 ) )
            {
            // InternalSocialRequest.g:2744:1: ( ( rule__Select__ClauseAssignment_3 ) )
            // InternalSocialRequest.g:2745:2: ( rule__Select__ClauseAssignment_3 )
            {
             before(grammarAccess.getSelectAccess().getClauseAssignment_3()); 
            // InternalSocialRequest.g:2746:2: ( rule__Select__ClauseAssignment_3 )
            // InternalSocialRequest.g:2746:3: rule__Select__ClauseAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Select__ClauseAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getSelectAccess().getClauseAssignment_3()); 

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
    // $ANTLR end "rule__Select__Group__3__Impl"


    // $ANTLR start "rule__Select__Group__4"
    // InternalSocialRequest.g:2754:1: rule__Select__Group__4 : rule__Select__Group__4__Impl ;
    public final void rule__Select__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2758:1: ( rule__Select__Group__4__Impl )
            // InternalSocialRequest.g:2759:2: rule__Select__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Select__Group__4__Impl();

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
    // $ANTLR end "rule__Select__Group__4"


    // $ANTLR start "rule__Select__Group__4__Impl"
    // InternalSocialRequest.g:2765:1: rule__Select__Group__4__Impl : ( '}' ) ;
    public final void rule__Select__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2769:1: ( ( '}' ) )
            // InternalSocialRequest.g:2770:1: ( '}' )
            {
            // InternalSocialRequest.g:2770:1: ( '}' )
            // InternalSocialRequest.g:2771:2: '}'
            {
             before(grammarAccess.getSelectAccess().getRightCurlyBracketKeyword_4()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getSelectAccess().getRightCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__Select__Group__4__Impl"


    // $ANTLR start "rule__From__Group__0"
    // InternalSocialRequest.g:2781:1: rule__From__Group__0 : rule__From__Group__0__Impl rule__From__Group__1 ;
    public final void rule__From__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2785:1: ( rule__From__Group__0__Impl rule__From__Group__1 )
            // InternalSocialRequest.g:2786:2: rule__From__Group__0__Impl rule__From__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__From__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__From__Group__1();

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
    // $ANTLR end "rule__From__Group__0"


    // $ANTLR start "rule__From__Group__0__Impl"
    // InternalSocialRequest.g:2793:1: rule__From__Group__0__Impl : ( 'FROM' ) ;
    public final void rule__From__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2797:1: ( ( 'FROM' ) )
            // InternalSocialRequest.g:2798:1: ( 'FROM' )
            {
            // InternalSocialRequest.g:2798:1: ( 'FROM' )
            // InternalSocialRequest.g:2799:2: 'FROM'
            {
             before(grammarAccess.getFromAccess().getFROMKeyword_0()); 
            match(input,57,FOLLOW_2); 
             after(grammarAccess.getFromAccess().getFROMKeyword_0()); 

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
    // $ANTLR end "rule__From__Group__0__Impl"


    // $ANTLR start "rule__From__Group__1"
    // InternalSocialRequest.g:2808:1: rule__From__Group__1 : rule__From__Group__1__Impl rule__From__Group__2 ;
    public final void rule__From__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2812:1: ( rule__From__Group__1__Impl rule__From__Group__2 )
            // InternalSocialRequest.g:2813:2: rule__From__Group__1__Impl rule__From__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__From__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__From__Group__2();

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
    // $ANTLR end "rule__From__Group__1"


    // $ANTLR start "rule__From__Group__1__Impl"
    // InternalSocialRequest.g:2820:1: rule__From__Group__1__Impl : ( '{' ) ;
    public final void rule__From__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2824:1: ( ( '{' ) )
            // InternalSocialRequest.g:2825:1: ( '{' )
            {
            // InternalSocialRequest.g:2825:1: ( '{' )
            // InternalSocialRequest.g:2826:2: '{'
            {
             before(grammarAccess.getFromAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getFromAccess().getLeftCurlyBracketKeyword_1()); 

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
    // $ANTLR end "rule__From__Group__1__Impl"


    // $ANTLR start "rule__From__Group__2"
    // InternalSocialRequest.g:2835:1: rule__From__Group__2 : rule__From__Group__2__Impl rule__From__Group__3 ;
    public final void rule__From__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2839:1: ( rule__From__Group__2__Impl rule__From__Group__3 )
            // InternalSocialRequest.g:2840:2: rule__From__Group__2__Impl rule__From__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__From__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__From__Group__3();

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
    // $ANTLR end "rule__From__Group__2"


    // $ANTLR start "rule__From__Group__2__Impl"
    // InternalSocialRequest.g:2847:1: rule__From__Group__2__Impl : ( ( rule__From__EntityAssignment_2 ) ) ;
    public final void rule__From__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2851:1: ( ( ( rule__From__EntityAssignment_2 ) ) )
            // InternalSocialRequest.g:2852:1: ( ( rule__From__EntityAssignment_2 ) )
            {
            // InternalSocialRequest.g:2852:1: ( ( rule__From__EntityAssignment_2 ) )
            // InternalSocialRequest.g:2853:2: ( rule__From__EntityAssignment_2 )
            {
             before(grammarAccess.getFromAccess().getEntityAssignment_2()); 
            // InternalSocialRequest.g:2854:2: ( rule__From__EntityAssignment_2 )
            // InternalSocialRequest.g:2854:3: rule__From__EntityAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__From__EntityAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getFromAccess().getEntityAssignment_2()); 

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
    // $ANTLR end "rule__From__Group__2__Impl"


    // $ANTLR start "rule__From__Group__3"
    // InternalSocialRequest.g:2862:1: rule__From__Group__3 : rule__From__Group__3__Impl rule__From__Group__4 ;
    public final void rule__From__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2866:1: ( rule__From__Group__3__Impl rule__From__Group__4 )
            // InternalSocialRequest.g:2867:2: rule__From__Group__3__Impl rule__From__Group__4
            {
            pushFollow(FOLLOW_9);
            rule__From__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__From__Group__4();

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
    // $ANTLR end "rule__From__Group__3"


    // $ANTLR start "rule__From__Group__3__Impl"
    // InternalSocialRequest.g:2874:1: rule__From__Group__3__Impl : ( ( rule__From__AliasAssignment_3 ) ) ;
    public final void rule__From__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2878:1: ( ( ( rule__From__AliasAssignment_3 ) ) )
            // InternalSocialRequest.g:2879:1: ( ( rule__From__AliasAssignment_3 ) )
            {
            // InternalSocialRequest.g:2879:1: ( ( rule__From__AliasAssignment_3 ) )
            // InternalSocialRequest.g:2880:2: ( rule__From__AliasAssignment_3 )
            {
             before(grammarAccess.getFromAccess().getAliasAssignment_3()); 
            // InternalSocialRequest.g:2881:2: ( rule__From__AliasAssignment_3 )
            // InternalSocialRequest.g:2881:3: rule__From__AliasAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__From__AliasAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getFromAccess().getAliasAssignment_3()); 

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
    // $ANTLR end "rule__From__Group__3__Impl"


    // $ANTLR start "rule__From__Group__4"
    // InternalSocialRequest.g:2889:1: rule__From__Group__4 : rule__From__Group__4__Impl ;
    public final void rule__From__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2893:1: ( rule__From__Group__4__Impl )
            // InternalSocialRequest.g:2894:2: rule__From__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__From__Group__4__Impl();

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
    // $ANTLR end "rule__From__Group__4"


    // $ANTLR start "rule__From__Group__4__Impl"
    // InternalSocialRequest.g:2900:1: rule__From__Group__4__Impl : ( '}' ) ;
    public final void rule__From__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2904:1: ( ( '}' ) )
            // InternalSocialRequest.g:2905:1: ( '}' )
            {
            // InternalSocialRequest.g:2905:1: ( '}' )
            // InternalSocialRequest.g:2906:2: '}'
            {
             before(grammarAccess.getFromAccess().getRightCurlyBracketKeyword_4()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getFromAccess().getRightCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__From__Group__4__Impl"


    // $ANTLR start "rule__Join__Group__0"
    // InternalSocialRequest.g:2916:1: rule__Join__Group__0 : rule__Join__Group__0__Impl rule__Join__Group__1 ;
    public final void rule__Join__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2920:1: ( rule__Join__Group__0__Impl rule__Join__Group__1 )
            // InternalSocialRequest.g:2921:2: rule__Join__Group__0__Impl rule__Join__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__Join__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Join__Group__1();

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
    // $ANTLR end "rule__Join__Group__0"


    // $ANTLR start "rule__Join__Group__0__Impl"
    // InternalSocialRequest.g:2928:1: rule__Join__Group__0__Impl : ( ( rule__Join__JoinTypeAssignment_0 ) ) ;
    public final void rule__Join__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2932:1: ( ( ( rule__Join__JoinTypeAssignment_0 ) ) )
            // InternalSocialRequest.g:2933:1: ( ( rule__Join__JoinTypeAssignment_0 ) )
            {
            // InternalSocialRequest.g:2933:1: ( ( rule__Join__JoinTypeAssignment_0 ) )
            // InternalSocialRequest.g:2934:2: ( rule__Join__JoinTypeAssignment_0 )
            {
             before(grammarAccess.getJoinAccess().getJoinTypeAssignment_0()); 
            // InternalSocialRequest.g:2935:2: ( rule__Join__JoinTypeAssignment_0 )
            // InternalSocialRequest.g:2935:3: rule__Join__JoinTypeAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Join__JoinTypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getJoinAccess().getJoinTypeAssignment_0()); 

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
    // $ANTLR end "rule__Join__Group__0__Impl"


    // $ANTLR start "rule__Join__Group__1"
    // InternalSocialRequest.g:2943:1: rule__Join__Group__1 : rule__Join__Group__1__Impl rule__Join__Group__2 ;
    public final void rule__Join__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2947:1: ( rule__Join__Group__1__Impl rule__Join__Group__2 )
            // InternalSocialRequest.g:2948:2: rule__Join__Group__1__Impl rule__Join__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__Join__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Join__Group__2();

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
    // $ANTLR end "rule__Join__Group__1"


    // $ANTLR start "rule__Join__Group__1__Impl"
    // InternalSocialRequest.g:2955:1: rule__Join__Group__1__Impl : ( '{' ) ;
    public final void rule__Join__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2959:1: ( ( '{' ) )
            // InternalSocialRequest.g:2960:1: ( '{' )
            {
            // InternalSocialRequest.g:2960:1: ( '{' )
            // InternalSocialRequest.g:2961:2: '{'
            {
             before(grammarAccess.getJoinAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getJoinAccess().getLeftCurlyBracketKeyword_1()); 

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
    // $ANTLR end "rule__Join__Group__1__Impl"


    // $ANTLR start "rule__Join__Group__2"
    // InternalSocialRequest.g:2970:1: rule__Join__Group__2 : rule__Join__Group__2__Impl rule__Join__Group__3 ;
    public final void rule__Join__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2974:1: ( rule__Join__Group__2__Impl rule__Join__Group__3 )
            // InternalSocialRequest.g:2975:2: rule__Join__Group__2__Impl rule__Join__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Join__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Join__Group__3();

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
    // $ANTLR end "rule__Join__Group__2"


    // $ANTLR start "rule__Join__Group__2__Impl"
    // InternalSocialRequest.g:2982:1: rule__Join__Group__2__Impl : ( ( rule__Join__EntityAssignment_2 ) ) ;
    public final void rule__Join__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2986:1: ( ( ( rule__Join__EntityAssignment_2 ) ) )
            // InternalSocialRequest.g:2987:1: ( ( rule__Join__EntityAssignment_2 ) )
            {
            // InternalSocialRequest.g:2987:1: ( ( rule__Join__EntityAssignment_2 ) )
            // InternalSocialRequest.g:2988:2: ( rule__Join__EntityAssignment_2 )
            {
             before(grammarAccess.getJoinAccess().getEntityAssignment_2()); 
            // InternalSocialRequest.g:2989:2: ( rule__Join__EntityAssignment_2 )
            // InternalSocialRequest.g:2989:3: rule__Join__EntityAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Join__EntityAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getJoinAccess().getEntityAssignment_2()); 

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
    // $ANTLR end "rule__Join__Group__2__Impl"


    // $ANTLR start "rule__Join__Group__3"
    // InternalSocialRequest.g:2997:1: rule__Join__Group__3 : rule__Join__Group__3__Impl rule__Join__Group__4 ;
    public final void rule__Join__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:3001:1: ( rule__Join__Group__3__Impl rule__Join__Group__4 )
            // InternalSocialRequest.g:3002:2: rule__Join__Group__3__Impl rule__Join__Group__4
            {
            pushFollow(FOLLOW_9);
            rule__Join__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Join__Group__4();

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
    // $ANTLR end "rule__Join__Group__3"


    // $ANTLR start "rule__Join__Group__3__Impl"
    // InternalSocialRequest.g:3009:1: rule__Join__Group__3__Impl : ( ( rule__Join__AliasAssignment_3 ) ) ;
    public final void rule__Join__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:3013:1: ( ( ( rule__Join__AliasAssignment_3 ) ) )
            // InternalSocialRequest.g:3014:1: ( ( rule__Join__AliasAssignment_3 ) )
            {
            // InternalSocialRequest.g:3014:1: ( ( rule__Join__AliasAssignment_3 ) )
            // InternalSocialRequest.g:3015:2: ( rule__Join__AliasAssignment_3 )
            {
             before(grammarAccess.getJoinAccess().getAliasAssignment_3()); 
            // InternalSocialRequest.g:3016:2: ( rule__Join__AliasAssignment_3 )
            // InternalSocialRequest.g:3016:3: rule__Join__AliasAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Join__AliasAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getJoinAccess().getAliasAssignment_3()); 

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
    // $ANTLR end "rule__Join__Group__3__Impl"


    // $ANTLR start "rule__Join__Group__4"
    // InternalSocialRequest.g:3024:1: rule__Join__Group__4 : rule__Join__Group__4__Impl rule__Join__Group__5 ;
    public final void rule__Join__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:3028:1: ( rule__Join__Group__4__Impl rule__Join__Group__5 )
            // InternalSocialRequest.g:3029:2: rule__Join__Group__4__Impl rule__Join__Group__5
            {
            pushFollow(FOLLOW_36);
            rule__Join__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Join__Group__5();

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
    // $ANTLR end "rule__Join__Group__4"


    // $ANTLR start "rule__Join__Group__4__Impl"
    // InternalSocialRequest.g:3036:1: rule__Join__Group__4__Impl : ( '}' ) ;
    public final void rule__Join__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:3040:1: ( ( '}' ) )
            // InternalSocialRequest.g:3041:1: ( '}' )
            {
            // InternalSocialRequest.g:3041:1: ( '}' )
            // InternalSocialRequest.g:3042:2: '}'
            {
             before(grammarAccess.getJoinAccess().getRightCurlyBracketKeyword_4()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getJoinAccess().getRightCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__Join__Group__4__Impl"


    // $ANTLR start "rule__Join__Group__5"
    // InternalSocialRequest.g:3051:1: rule__Join__Group__5 : rule__Join__Group__5__Impl ;
    public final void rule__Join__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:3055:1: ( rule__Join__Group__5__Impl )
            // InternalSocialRequest.g:3056:2: rule__Join__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Join__Group__5__Impl();

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
    // $ANTLR end "rule__Join__Group__5"


    // $ANTLR start "rule__Join__Group__5__Impl"
    // InternalSocialRequest.g:3062:1: rule__Join__Group__5__Impl : ( ( rule__Join__Group_5__0 )? ) ;
    public final void rule__Join__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:3066:1: ( ( ( rule__Join__Group_5__0 )? ) )
            // InternalSocialRequest.g:3067:1: ( ( rule__Join__Group_5__0 )? )
            {
            // InternalSocialRequest.g:3067:1: ( ( rule__Join__Group_5__0 )? )
            // InternalSocialRequest.g:3068:2: ( rule__Join__Group_5__0 )?
            {
             before(grammarAccess.getJoinAccess().getGroup_5()); 
            // InternalSocialRequest.g:3069:2: ( rule__Join__Group_5__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==58) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalSocialRequest.g:3069:3: rule__Join__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Join__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getJoinAccess().getGroup_5()); 

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
    // $ANTLR end "rule__Join__Group__5__Impl"


    // $ANTLR start "rule__Join__Group_5__0"
    // InternalSocialRequest.g:3078:1: rule__Join__Group_5__0 : rule__Join__Group_5__0__Impl rule__Join__Group_5__1 ;
    public final void rule__Join__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:3082:1: ( rule__Join__Group_5__0__Impl rule__Join__Group_5__1 )
            // InternalSocialRequest.g:3083:2: rule__Join__Group_5__0__Impl rule__Join__Group_5__1
            {
            pushFollow(FOLLOW_17);
            rule__Join__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Join__Group_5__1();

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
    // $ANTLR end "rule__Join__Group_5__0"


    // $ANTLR start "rule__Join__Group_5__0__Impl"
    // InternalSocialRequest.g:3090:1: rule__Join__Group_5__0__Impl : ( 'ON' ) ;
    public final void rule__Join__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:3094:1: ( ( 'ON' ) )
            // InternalSocialRequest.g:3095:1: ( 'ON' )
            {
            // InternalSocialRequest.g:3095:1: ( 'ON' )
            // InternalSocialRequest.g:3096:2: 'ON'
            {
             before(grammarAccess.getJoinAccess().getONKeyword_5_0()); 
            match(input,58,FOLLOW_2); 
             after(grammarAccess.getJoinAccess().getONKeyword_5_0()); 

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
    // $ANTLR end "rule__Join__Group_5__0__Impl"


    // $ANTLR start "rule__Join__Group_5__1"
    // InternalSocialRequest.g:3105:1: rule__Join__Group_5__1 : rule__Join__Group_5__1__Impl rule__Join__Group_5__2 ;
    public final void rule__Join__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:3109:1: ( rule__Join__Group_5__1__Impl rule__Join__Group_5__2 )
            // InternalSocialRequest.g:3110:2: rule__Join__Group_5__1__Impl rule__Join__Group_5__2
            {
            pushFollow(FOLLOW_24);
            rule__Join__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Join__Group_5__2();

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
    // $ANTLR end "rule__Join__Group_5__1"


    // $ANTLR start "rule__Join__Group_5__1__Impl"
    // InternalSocialRequest.g:3117:1: rule__Join__Group_5__1__Impl : ( '{' ) ;
    public final void rule__Join__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:3121:1: ( ( '{' ) )
            // InternalSocialRequest.g:3122:1: ( '{' )
            {
            // InternalSocialRequest.g:3122:1: ( '{' )
            // InternalSocialRequest.g:3123:2: '{'
            {
             before(grammarAccess.getJoinAccess().getLeftCurlyBracketKeyword_5_1()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getJoinAccess().getLeftCurlyBracketKeyword_5_1()); 

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
    // $ANTLR end "rule__Join__Group_5__1__Impl"


    // $ANTLR start "rule__Join__Group_5__2"
    // InternalSocialRequest.g:3132:1: rule__Join__Group_5__2 : rule__Join__Group_5__2__Impl rule__Join__Group_5__3 ;
    public final void rule__Join__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:3136:1: ( rule__Join__Group_5__2__Impl rule__Join__Group_5__3 )
            // InternalSocialRequest.g:3137:2: rule__Join__Group_5__2__Impl rule__Join__Group_5__3
            {
            pushFollow(FOLLOW_9);
            rule__Join__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Join__Group_5__3();

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
    // $ANTLR end "rule__Join__Group_5__2"


    // $ANTLR start "rule__Join__Group_5__2__Impl"
    // InternalSocialRequest.g:3144:1: rule__Join__Group_5__2__Impl : ( ( rule__Join__JoinConditionAssignment_5_2 ) ) ;
    public final void rule__Join__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:3148:1: ( ( ( rule__Join__JoinConditionAssignment_5_2 ) ) )
            // InternalSocialRequest.g:3149:1: ( ( rule__Join__JoinConditionAssignment_5_2 ) )
            {
            // InternalSocialRequest.g:3149:1: ( ( rule__Join__JoinConditionAssignment_5_2 ) )
            // InternalSocialRequest.g:3150:2: ( rule__Join__JoinConditionAssignment_5_2 )
            {
             before(grammarAccess.getJoinAccess().getJoinConditionAssignment_5_2()); 
            // InternalSocialRequest.g:3151:2: ( rule__Join__JoinConditionAssignment_5_2 )
            // InternalSocialRequest.g:3151:3: rule__Join__JoinConditionAssignment_5_2
            {
            pushFollow(FOLLOW_2);
            rule__Join__JoinConditionAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getJoinAccess().getJoinConditionAssignment_5_2()); 

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
    // $ANTLR end "rule__Join__Group_5__2__Impl"


    // $ANTLR start "rule__Join__Group_5__3"
    // InternalSocialRequest.g:3159:1: rule__Join__Group_5__3 : rule__Join__Group_5__3__Impl ;
    public final void rule__Join__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:3163:1: ( rule__Join__Group_5__3__Impl )
            // InternalSocialRequest.g:3164:2: rule__Join__Group_5__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Join__Group_5__3__Impl();

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
    // $ANTLR end "rule__Join__Group_5__3"


    // $ANTLR start "rule__Join__Group_5__3__Impl"
    // InternalSocialRequest.g:3170:1: rule__Join__Group_5__3__Impl : ( '}' ) ;
    public final void rule__Join__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:3174:1: ( ( '}' ) )
            // InternalSocialRequest.g:3175:1: ( '}' )
            {
            // InternalSocialRequest.g:3175:1: ( '}' )
            // InternalSocialRequest.g:3176:2: '}'
            {
             before(grammarAccess.getJoinAccess().getRightCurlyBracketKeyword_5_3()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getJoinAccess().getRightCurlyBracketKeyword_5_3()); 

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
    // $ANTLR end "rule__Join__Group_5__3__Impl"


    // $ANTLR start "rule__Where__Group__0"
    // InternalSocialRequest.g:3186:1: rule__Where__Group__0 : rule__Where__Group__0__Impl rule__Where__Group__1 ;
    public final void rule__Where__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:3190:1: ( rule__Where__Group__0__Impl rule__Where__Group__1 )
            // InternalSocialRequest.g:3191:2: rule__Where__Group__0__Impl rule__Where__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__Where__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Where__Group__1();

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
    // $ANTLR end "rule__Where__Group__0"


    // $ANTLR start "rule__Where__Group__0__Impl"
    // InternalSocialRequest.g:3198:1: rule__Where__Group__0__Impl : ( 'WHERE' ) ;
    public final void rule__Where__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:3202:1: ( ( 'WHERE' ) )
            // InternalSocialRequest.g:3203:1: ( 'WHERE' )
            {
            // InternalSocialRequest.g:3203:1: ( 'WHERE' )
            // InternalSocialRequest.g:3204:2: 'WHERE'
            {
             before(grammarAccess.getWhereAccess().getWHEREKeyword_0()); 
            match(input,59,FOLLOW_2); 
             after(grammarAccess.getWhereAccess().getWHEREKeyword_0()); 

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
    // $ANTLR end "rule__Where__Group__0__Impl"


    // $ANTLR start "rule__Where__Group__1"
    // InternalSocialRequest.g:3213:1: rule__Where__Group__1 : rule__Where__Group__1__Impl rule__Where__Group__2 ;
    public final void rule__Where__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:3217:1: ( rule__Where__Group__1__Impl rule__Where__Group__2 )
            // InternalSocialRequest.g:3218:2: rule__Where__Group__1__Impl rule__Where__Group__2
            {
            pushFollow(FOLLOW_24);
            rule__Where__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Where__Group__2();

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
    // $ANTLR end "rule__Where__Group__1"


    // $ANTLR start "rule__Where__Group__1__Impl"
    // InternalSocialRequest.g:3225:1: rule__Where__Group__1__Impl : ( '{' ) ;
    public final void rule__Where__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:3229:1: ( ( '{' ) )
            // InternalSocialRequest.g:3230:1: ( '{' )
            {
            // InternalSocialRequest.g:3230:1: ( '{' )
            // InternalSocialRequest.g:3231:2: '{'
            {
             before(grammarAccess.getWhereAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getWhereAccess().getLeftCurlyBracketKeyword_1()); 

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
    // $ANTLR end "rule__Where__Group__1__Impl"


    // $ANTLR start "rule__Where__Group__2"
    // InternalSocialRequest.g:3240:1: rule__Where__Group__2 : rule__Where__Group__2__Impl rule__Where__Group__3 ;
    public final void rule__Where__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:3244:1: ( rule__Where__Group__2__Impl rule__Where__Group__3 )
            // InternalSocialRequest.g:3245:2: rule__Where__Group__2__Impl rule__Where__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__Where__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Where__Group__3();

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
    // $ANTLR end "rule__Where__Group__2"


    // $ANTLR start "rule__Where__Group__2__Impl"
    // InternalSocialRequest.g:3252:1: rule__Where__Group__2__Impl : ( ( rule__Where__ConditionAssignment_2 ) ) ;
    public final void rule__Where__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:3256:1: ( ( ( rule__Where__ConditionAssignment_2 ) ) )
            // InternalSocialRequest.g:3257:1: ( ( rule__Where__ConditionAssignment_2 ) )
            {
            // InternalSocialRequest.g:3257:1: ( ( rule__Where__ConditionAssignment_2 ) )
            // InternalSocialRequest.g:3258:2: ( rule__Where__ConditionAssignment_2 )
            {
             before(grammarAccess.getWhereAccess().getConditionAssignment_2()); 
            // InternalSocialRequest.g:3259:2: ( rule__Where__ConditionAssignment_2 )
            // InternalSocialRequest.g:3259:3: rule__Where__ConditionAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Where__ConditionAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getWhereAccess().getConditionAssignment_2()); 

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
    // $ANTLR end "rule__Where__Group__2__Impl"


    // $ANTLR start "rule__Where__Group__3"
    // InternalSocialRequest.g:3267:1: rule__Where__Group__3 : rule__Where__Group__3__Impl ;
    public final void rule__Where__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:3271:1: ( rule__Where__Group__3__Impl )
            // InternalSocialRequest.g:3272:2: rule__Where__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Where__Group__3__Impl();

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
    // $ANTLR end "rule__Where__Group__3"


    // $ANTLR start "rule__Where__Group__3__Impl"
    // InternalSocialRequest.g:3278:1: rule__Where__Group__3__Impl : ( '}' ) ;
    public final void rule__Where__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:3282:1: ( ( '}' ) )
            // InternalSocialRequest.g:3283:1: ( '}' )
            {
            // InternalSocialRequest.g:3283:1: ( '}' )
            // InternalSocialRequest.g:3284:2: '}'
            {
             before(grammarAccess.getWhereAccess().getRightCurlyBracketKeyword_3()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getWhereAccess().getRightCurlyBracketKeyword_3()); 

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
    // $ANTLR end "rule__Where__Group__3__Impl"


    // $ANTLR start "rule__Order__Group__0"
    // InternalSocialRequest.g:3294:1: rule__Order__Group__0 : rule__Order__Group__0__Impl rule__Order__Group__1 ;
    public final void rule__Order__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:3298:1: ( rule__Order__Group__0__Impl rule__Order__Group__1 )
            // InternalSocialRequest.g:3299:2: rule__Order__Group__0__Impl rule__Order__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__Order__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Order__Group__1();

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
    // $ANTLR end "rule__Order__Group__0"


    // $ANTLR start "rule__Order__Group__0__Impl"
    // InternalSocialRequest.g:3306:1: rule__Order__Group__0__Impl : ( 'ORDER BY' ) ;
    public final void rule__Order__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:3310:1: ( ( 'ORDER BY' ) )
            // InternalSocialRequest.g:3311:1: ( 'ORDER BY' )
            {
            // InternalSocialRequest.g:3311:1: ( 'ORDER BY' )
            // InternalSocialRequest.g:3312:2: 'ORDER BY'
            {
             before(grammarAccess.getOrderAccess().getORDERBYKeyword_0()); 
            match(input,60,FOLLOW_2); 
             after(grammarAccess.getOrderAccess().getORDERBYKeyword_0()); 

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
    // $ANTLR end "rule__Order__Group__0__Impl"


    // $ANTLR start "rule__Order__Group__1"
    // InternalSocialRequest.g:3321:1: rule__Order__Group__1 : rule__Order__Group__1__Impl rule__Order__Group__2 ;
    public final void rule__Order__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:3325:1: ( rule__Order__Group__1__Impl rule__Order__Group__2 )
            // InternalSocialRequest.g:3326:2: rule__Order__Group__1__Impl rule__Order__Group__2
            {
            pushFollow(FOLLOW_24);
            rule__Order__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Order__Group__2();

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
    // $ANTLR end "rule__Order__Group__1"


    // $ANTLR start "rule__Order__Group__1__Impl"
    // InternalSocialRequest.g:3333:1: rule__Order__Group__1__Impl : ( '{' ) ;
    public final void rule__Order__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:3337:1: ( ( '{' ) )
            // InternalSocialRequest.g:3338:1: ( '{' )
            {
            // InternalSocialRequest.g:3338:1: ( '{' )
            // InternalSocialRequest.g:3339:2: '{'
            {
             before(grammarAccess.getOrderAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getOrderAccess().getLeftCurlyBracketKeyword_1()); 

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
    // $ANTLR end "rule__Order__Group__1__Impl"


    // $ANTLR start "rule__Order__Group__2"
    // InternalSocialRequest.g:3348:1: rule__Order__Group__2 : rule__Order__Group__2__Impl rule__Order__Group__3 ;
    public final void rule__Order__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:3352:1: ( rule__Order__Group__2__Impl rule__Order__Group__3 )
            // InternalSocialRequest.g:3353:2: rule__Order__Group__2__Impl rule__Order__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__Order__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Order__Group__3();

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
    // $ANTLR end "rule__Order__Group__2"


    // $ANTLR start "rule__Order__Group__2__Impl"
    // InternalSocialRequest.g:3360:1: rule__Order__Group__2__Impl : ( ( rule__Order__OrderAssignment_2 ) ) ;
    public final void rule__Order__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:3364:1: ( ( ( rule__Order__OrderAssignment_2 ) ) )
            // InternalSocialRequest.g:3365:1: ( ( rule__Order__OrderAssignment_2 ) )
            {
            // InternalSocialRequest.g:3365:1: ( ( rule__Order__OrderAssignment_2 ) )
            // InternalSocialRequest.g:3366:2: ( rule__Order__OrderAssignment_2 )
            {
             before(grammarAccess.getOrderAccess().getOrderAssignment_2()); 
            // InternalSocialRequest.g:3367:2: ( rule__Order__OrderAssignment_2 )
            // InternalSocialRequest.g:3367:3: rule__Order__OrderAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Order__OrderAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getOrderAccess().getOrderAssignment_2()); 

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
    // $ANTLR end "rule__Order__Group__2__Impl"


    // $ANTLR start "rule__Order__Group__3"
    // InternalSocialRequest.g:3375:1: rule__Order__Group__3 : rule__Order__Group__3__Impl ;
    public final void rule__Order__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:3379:1: ( rule__Order__Group__3__Impl )
            // InternalSocialRequest.g:3380:2: rule__Order__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Order__Group__3__Impl();

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
    // $ANTLR end "rule__Order__Group__3"


    // $ANTLR start "rule__Order__Group__3__Impl"
    // InternalSocialRequest.g:3386:1: rule__Order__Group__3__Impl : ( '}' ) ;
    public final void rule__Order__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:3390:1: ( ( '}' ) )
            // InternalSocialRequest.g:3391:1: ( '}' )
            {
            // InternalSocialRequest.g:3391:1: ( '}' )
            // InternalSocialRequest.g:3392:2: '}'
            {
             before(grammarAccess.getOrderAccess().getRightCurlyBracketKeyword_3()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getOrderAccess().getRightCurlyBracketKeyword_3()); 

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
    // $ANTLR end "rule__Order__Group__3__Impl"


    // $ANTLR start "rule__Attribute__UnorderedGroup_5_1"
    // InternalSocialRequest.g:3402:1: rule__Attribute__UnorderedGroup_5_1 : ( rule__Attribute__UnorderedGroup_5_1__0 )? ;
    public final void rule__Attribute__UnorderedGroup_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getAttributeAccess().getUnorderedGroup_5_1());
        	
        try {
            // InternalSocialRequest.g:3407:1: ( ( rule__Attribute__UnorderedGroup_5_1__0 )? )
            // InternalSocialRequest.g:3408:2: ( rule__Attribute__UnorderedGroup_5_1__0 )?
            {
            // InternalSocialRequest.g:3408:2: ( rule__Attribute__UnorderedGroup_5_1__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( LA29_0 == 44 && getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_1(), 0) ) {
                alt29=1;
            }
            else if ( LA29_0 == 45 && getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_1(), 1) ) {
                alt29=1;
            }
            else if ( LA29_0 == 46 && getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_1(), 2) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalSocialRequest.g:3408:2: rule__Attribute__UnorderedGroup_5_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Attribute__UnorderedGroup_5_1__0();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	getUnorderedGroupHelper().leave(grammarAccess.getAttributeAccess().getUnorderedGroup_5_1());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__UnorderedGroup_5_1"


    // $ANTLR start "rule__Attribute__UnorderedGroup_5_1__Impl"
    // InternalSocialRequest.g:3416:1: rule__Attribute__UnorderedGroup_5_1__Impl : ( ({...}? => ( ( ( rule__Attribute__Group_5_1_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Attribute__Group_5_1_1__0 ) ) ) ) | ({...}? => ( ( ( rule__Attribute__Group_5_1_2__0 ) ) ) ) ) ;
    public final void rule__Attribute__UnorderedGroup_5_1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
        	
        try {
            // InternalSocialRequest.g:3421:1: ( ( ({...}? => ( ( ( rule__Attribute__Group_5_1_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Attribute__Group_5_1_1__0 ) ) ) ) | ({...}? => ( ( ( rule__Attribute__Group_5_1_2__0 ) ) ) ) ) )
            // InternalSocialRequest.g:3422:3: ( ({...}? => ( ( ( rule__Attribute__Group_5_1_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Attribute__Group_5_1_1__0 ) ) ) ) | ({...}? => ( ( ( rule__Attribute__Group_5_1_2__0 ) ) ) ) )
            {
            // InternalSocialRequest.g:3422:3: ( ({...}? => ( ( ( rule__Attribute__Group_5_1_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Attribute__Group_5_1_1__0 ) ) ) ) | ({...}? => ( ( ( rule__Attribute__Group_5_1_2__0 ) ) ) ) )
            int alt30=3;
            int LA30_0 = input.LA(1);

            if ( LA30_0 == 44 && getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_1(), 0) ) {
                alt30=1;
            }
            else if ( LA30_0 == 45 && getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_1(), 1) ) {
                alt30=2;
            }
            else if ( LA30_0 == 46 && getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_1(), 2) ) {
                alt30=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // InternalSocialRequest.g:3423:3: ({...}? => ( ( ( rule__Attribute__Group_5_1_0__0 ) ) ) )
                    {
                    // InternalSocialRequest.g:3423:3: ({...}? => ( ( ( rule__Attribute__Group_5_1_0__0 ) ) ) )
                    // InternalSocialRequest.g:3424:4: {...}? => ( ( ( rule__Attribute__Group_5_1_0__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_1(), 0) ) {
                        throw new FailedPredicateException(input, "rule__Attribute__UnorderedGroup_5_1__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_1(), 0)");
                    }
                    // InternalSocialRequest.g:3424:107: ( ( ( rule__Attribute__Group_5_1_0__0 ) ) )
                    // InternalSocialRequest.g:3425:5: ( ( rule__Attribute__Group_5_1_0__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getAttributeAccess().getUnorderedGroup_5_1(), 0);
                    				

                    					selected = true;
                    				
                    // InternalSocialRequest.g:3431:5: ( ( rule__Attribute__Group_5_1_0__0 ) )
                    // InternalSocialRequest.g:3432:6: ( rule__Attribute__Group_5_1_0__0 )
                    {
                     before(grammarAccess.getAttributeAccess().getGroup_5_1_0()); 
                    // InternalSocialRequest.g:3433:6: ( rule__Attribute__Group_5_1_0__0 )
                    // InternalSocialRequest.g:3433:7: rule__Attribute__Group_5_1_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Attribute__Group_5_1_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAttributeAccess().getGroup_5_1_0()); 

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSocialRequest.g:3438:3: ({...}? => ( ( ( rule__Attribute__Group_5_1_1__0 ) ) ) )
                    {
                    // InternalSocialRequest.g:3438:3: ({...}? => ( ( ( rule__Attribute__Group_5_1_1__0 ) ) ) )
                    // InternalSocialRequest.g:3439:4: {...}? => ( ( ( rule__Attribute__Group_5_1_1__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_1(), 1) ) {
                        throw new FailedPredicateException(input, "rule__Attribute__UnorderedGroup_5_1__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_1(), 1)");
                    }
                    // InternalSocialRequest.g:3439:107: ( ( ( rule__Attribute__Group_5_1_1__0 ) ) )
                    // InternalSocialRequest.g:3440:5: ( ( rule__Attribute__Group_5_1_1__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getAttributeAccess().getUnorderedGroup_5_1(), 1);
                    				

                    					selected = true;
                    				
                    // InternalSocialRequest.g:3446:5: ( ( rule__Attribute__Group_5_1_1__0 ) )
                    // InternalSocialRequest.g:3447:6: ( rule__Attribute__Group_5_1_1__0 )
                    {
                     before(grammarAccess.getAttributeAccess().getGroup_5_1_1()); 
                    // InternalSocialRequest.g:3448:6: ( rule__Attribute__Group_5_1_1__0 )
                    // InternalSocialRequest.g:3448:7: rule__Attribute__Group_5_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Attribute__Group_5_1_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAttributeAccess().getGroup_5_1_1()); 

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalSocialRequest.g:3453:3: ({...}? => ( ( ( rule__Attribute__Group_5_1_2__0 ) ) ) )
                    {
                    // InternalSocialRequest.g:3453:3: ({...}? => ( ( ( rule__Attribute__Group_5_1_2__0 ) ) ) )
                    // InternalSocialRequest.g:3454:4: {...}? => ( ( ( rule__Attribute__Group_5_1_2__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_1(), 2) ) {
                        throw new FailedPredicateException(input, "rule__Attribute__UnorderedGroup_5_1__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_1(), 2)");
                    }
                    // InternalSocialRequest.g:3454:107: ( ( ( rule__Attribute__Group_5_1_2__0 ) ) )
                    // InternalSocialRequest.g:3455:5: ( ( rule__Attribute__Group_5_1_2__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getAttributeAccess().getUnorderedGroup_5_1(), 2);
                    				

                    					selected = true;
                    				
                    // InternalSocialRequest.g:3461:5: ( ( rule__Attribute__Group_5_1_2__0 ) )
                    // InternalSocialRequest.g:3462:6: ( rule__Attribute__Group_5_1_2__0 )
                    {
                     before(grammarAccess.getAttributeAccess().getGroup_5_1_2()); 
                    // InternalSocialRequest.g:3463:6: ( rule__Attribute__Group_5_1_2__0 )
                    // InternalSocialRequest.g:3463:7: rule__Attribute__Group_5_1_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Attribute__Group_5_1_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAttributeAccess().getGroup_5_1_2()); 

                    }


                    }


                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	if (selected)
            		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getAttributeAccess().getUnorderedGroup_5_1());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__UnorderedGroup_5_1__Impl"


    // $ANTLR start "rule__Attribute__UnorderedGroup_5_1__0"
    // InternalSocialRequest.g:3476:1: rule__Attribute__UnorderedGroup_5_1__0 : rule__Attribute__UnorderedGroup_5_1__Impl ( rule__Attribute__UnorderedGroup_5_1__1 )? ;
    public final void rule__Attribute__UnorderedGroup_5_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:3480:1: ( rule__Attribute__UnorderedGroup_5_1__Impl ( rule__Attribute__UnorderedGroup_5_1__1 )? )
            // InternalSocialRequest.g:3481:2: rule__Attribute__UnorderedGroup_5_1__Impl ( rule__Attribute__UnorderedGroup_5_1__1 )?
            {
            pushFollow(FOLLOW_37);
            rule__Attribute__UnorderedGroup_5_1__Impl();

            state._fsp--;

            // InternalSocialRequest.g:3482:2: ( rule__Attribute__UnorderedGroup_5_1__1 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( LA31_0 == 44 && getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_1(), 0) ) {
                alt31=1;
            }
            else if ( LA31_0 == 45 && getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_1(), 1) ) {
                alt31=1;
            }
            else if ( LA31_0 == 46 && getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_1(), 2) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalSocialRequest.g:3482:2: rule__Attribute__UnorderedGroup_5_1__1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Attribute__UnorderedGroup_5_1__1();

                    state._fsp--;


                    }
                    break;

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
    // $ANTLR end "rule__Attribute__UnorderedGroup_5_1__0"


    // $ANTLR start "rule__Attribute__UnorderedGroup_5_1__1"
    // InternalSocialRequest.g:3488:1: rule__Attribute__UnorderedGroup_5_1__1 : rule__Attribute__UnorderedGroup_5_1__Impl ( rule__Attribute__UnorderedGroup_5_1__2 )? ;
    public final void rule__Attribute__UnorderedGroup_5_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:3492:1: ( rule__Attribute__UnorderedGroup_5_1__Impl ( rule__Attribute__UnorderedGroup_5_1__2 )? )
            // InternalSocialRequest.g:3493:2: rule__Attribute__UnorderedGroup_5_1__Impl ( rule__Attribute__UnorderedGroup_5_1__2 )?
            {
            pushFollow(FOLLOW_37);
            rule__Attribute__UnorderedGroup_5_1__Impl();

            state._fsp--;

            // InternalSocialRequest.g:3494:2: ( rule__Attribute__UnorderedGroup_5_1__2 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( LA32_0 == 44 && getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_1(), 0) ) {
                alt32=1;
            }
            else if ( LA32_0 == 45 && getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_1(), 1) ) {
                alt32=1;
            }
            else if ( LA32_0 == 46 && getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_1(), 2) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalSocialRequest.g:3494:2: rule__Attribute__UnorderedGroup_5_1__2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Attribute__UnorderedGroup_5_1__2();

                    state._fsp--;


                    }
                    break;

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
    // $ANTLR end "rule__Attribute__UnorderedGroup_5_1__1"


    // $ANTLR start "rule__Attribute__UnorderedGroup_5_1__2"
    // InternalSocialRequest.g:3500:1: rule__Attribute__UnorderedGroup_5_1__2 : rule__Attribute__UnorderedGroup_5_1__Impl ;
    public final void rule__Attribute__UnorderedGroup_5_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:3504:1: ( rule__Attribute__UnorderedGroup_5_1__Impl )
            // InternalSocialRequest.g:3505:2: rule__Attribute__UnorderedGroup_5_1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__UnorderedGroup_5_1__Impl();

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
    // $ANTLR end "rule__Attribute__UnorderedGroup_5_1__2"


    // $ANTLR start "rule__Model__EntitiesAssignment_0"
    // InternalSocialRequest.g:3512:1: rule__Model__EntitiesAssignment_0 : ( ruleEntity ) ;
    public final void rule__Model__EntitiesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:3516:1: ( ( ruleEntity ) )
            // InternalSocialRequest.g:3517:2: ( ruleEntity )
            {
            // InternalSocialRequest.g:3517:2: ( ruleEntity )
            // InternalSocialRequest.g:3518:3: ruleEntity
            {
             before(grammarAccess.getModelAccess().getEntitiesEntityParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleEntity();

            state._fsp--;

             after(grammarAccess.getModelAccess().getEntitiesEntityParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Model__EntitiesAssignment_0"


    // $ANTLR start "rule__Model__RepositoriesAssignment_1"
    // InternalSocialRequest.g:3527:1: rule__Model__RepositoriesAssignment_1 : ( ruleRepository ) ;
    public final void rule__Model__RepositoriesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:3531:1: ( ( ruleRepository ) )
            // InternalSocialRequest.g:3532:2: ( ruleRepository )
            {
            // InternalSocialRequest.g:3532:2: ( ruleRepository )
            // InternalSocialRequest.g:3533:3: ruleRepository
            {
             before(grammarAccess.getModelAccess().getRepositoriesRepositoryParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRepository();

            state._fsp--;

             after(grammarAccess.getModelAccess().getRepositoriesRepositoryParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Model__RepositoriesAssignment_1"


    // $ANTLR start "rule__Entity__NameAssignment_1"
    // InternalSocialRequest.g:3542:1: rule__Entity__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Entity__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:3546:1: ( ( RULE_ID ) )
            // InternalSocialRequest.g:3547:2: ( RULE_ID )
            {
            // InternalSocialRequest.g:3547:2: ( RULE_ID )
            // InternalSocialRequest.g:3548:3: RULE_ID
            {
             before(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Entity__NameAssignment_1"


    // $ANTLR start "rule__Entity__HasUserDetailsAssignment_2_0"
    // InternalSocialRequest.g:3557:1: rule__Entity__HasUserDetailsAssignment_2_0 : ( ( 'implements' ) ) ;
    public final void rule__Entity__HasUserDetailsAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:3561:1: ( ( ( 'implements' ) ) )
            // InternalSocialRequest.g:3562:2: ( ( 'implements' ) )
            {
            // InternalSocialRequest.g:3562:2: ( ( 'implements' ) )
            // InternalSocialRequest.g:3563:3: ( 'implements' )
            {
             before(grammarAccess.getEntityAccess().getHasUserDetailsImplementsKeyword_2_0_0()); 
            // InternalSocialRequest.g:3564:3: ( 'implements' )
            // InternalSocialRequest.g:3565:4: 'implements'
            {
             before(grammarAccess.getEntityAccess().getHasUserDetailsImplementsKeyword_2_0_0()); 
            match(input,61,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getHasUserDetailsImplementsKeyword_2_0_0()); 

            }

             after(grammarAccess.getEntityAccess().getHasUserDetailsImplementsKeyword_2_0_0()); 

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
    // $ANTLR end "rule__Entity__HasUserDetailsAssignment_2_0"


    // $ANTLR start "rule__Entity__AttributesAssignment_4"
    // InternalSocialRequest.g:3576:1: rule__Entity__AttributesAssignment_4 : ( ruleAttribute ) ;
    public final void rule__Entity__AttributesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:3580:1: ( ( ruleAttribute ) )
            // InternalSocialRequest.g:3581:2: ( ruleAttribute )
            {
            // InternalSocialRequest.g:3581:2: ( ruleAttribute )
            // InternalSocialRequest.g:3582:3: ruleAttribute
            {
             before(grammarAccess.getEntityAccess().getAttributesAttributeParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getEntityAccess().getAttributesAttributeParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Entity__AttributesAssignment_4"


    // $ANTLR start "rule__Attribute__AssociationAssignment_0"
    // InternalSocialRequest.g:3591:1: rule__Attribute__AssociationAssignment_0 : ( ruleAssociation ) ;
    public final void rule__Attribute__AssociationAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:3595:1: ( ( ruleAssociation ) )
            // InternalSocialRequest.g:3596:2: ( ruleAssociation )
            {
            // InternalSocialRequest.g:3596:2: ( ruleAssociation )
            // InternalSocialRequest.g:3597:3: ruleAssociation
            {
             before(grammarAccess.getAttributeAccess().getAssociationAssociationEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleAssociation();

            state._fsp--;

             after(grammarAccess.getAttributeAccess().getAssociationAssociationEnumRuleCall_0_0()); 

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
    // $ANTLR end "rule__Attribute__AssociationAssignment_0"


    // $ANTLR start "rule__Attribute__NameAssignment_1"
    // InternalSocialRequest.g:3606:1: rule__Attribute__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Attribute__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:3610:1: ( ( RULE_ID ) )
            // InternalSocialRequest.g:3611:2: ( RULE_ID )
            {
            // InternalSocialRequest.g:3611:2: ( RULE_ID )
            // InternalSocialRequest.g:3612:3: RULE_ID
            {
             before(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Attribute__NameAssignment_1"


    // $ANTLR start "rule__Attribute__TypeRefAssignment_3"
    // InternalSocialRequest.g:3621:1: rule__Attribute__TypeRefAssignment_3 : ( ruleTypeReference ) ;
    public final void rule__Attribute__TypeRefAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:3625:1: ( ( ruleTypeReference ) )
            // InternalSocialRequest.g:3626:2: ( ruleTypeReference )
            {
            // InternalSocialRequest.g:3626:2: ( ruleTypeReference )
            // InternalSocialRequest.g:3627:3: ruleTypeReference
            {
             before(grammarAccess.getAttributeAccess().getTypeRefTypeReferenceParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleTypeReference();

            state._fsp--;

             after(grammarAccess.getAttributeAccess().getTypeRefTypeReferenceParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Attribute__TypeRefAssignment_3"


    // $ANTLR start "rule__Attribute__ModifierAssignment_4"
    // InternalSocialRequest.g:3636:1: rule__Attribute__ModifierAssignment_4 : ( ruleModifier ) ;
    public final void rule__Attribute__ModifierAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:3640:1: ( ( ruleModifier ) )
            // InternalSocialRequest.g:3641:2: ( ruleModifier )
            {
            // InternalSocialRequest.g:3641:2: ( ruleModifier )
            // InternalSocialRequest.g:3642:3: ruleModifier
            {
             before(grammarAccess.getAttributeAccess().getModifierModifierParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleModifier();

            state._fsp--;

             after(grammarAccess.getAttributeAccess().getModifierModifierParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Attribute__ModifierAssignment_4"


    // $ANTLR start "rule__Attribute__MappedByAssignment_5_1_0_1"
    // InternalSocialRequest.g:3651:1: rule__Attribute__MappedByAssignment_5_1_0_1 : ( RULE_ID ) ;
    public final void rule__Attribute__MappedByAssignment_5_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:3655:1: ( ( RULE_ID ) )
            // InternalSocialRequest.g:3656:2: ( RULE_ID )
            {
            // InternalSocialRequest.g:3656:2: ( RULE_ID )
            // InternalSocialRequest.g:3657:3: RULE_ID
            {
             before(grammarAccess.getAttributeAccess().getMappedByIDTerminalRuleCall_5_1_0_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getMappedByIDTerminalRuleCall_5_1_0_1_0()); 

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
    // $ANTLR end "rule__Attribute__MappedByAssignment_5_1_0_1"


    // $ANTLR start "rule__Attribute__FetchTypeAssignment_5_1_1_1"
    // InternalSocialRequest.g:3666:1: rule__Attribute__FetchTypeAssignment_5_1_1_1 : ( ruleFetchType ) ;
    public final void rule__Attribute__FetchTypeAssignment_5_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:3670:1: ( ( ruleFetchType ) )
            // InternalSocialRequest.g:3671:2: ( ruleFetchType )
            {
            // InternalSocialRequest.g:3671:2: ( ruleFetchType )
            // InternalSocialRequest.g:3672:3: ruleFetchType
            {
             before(grammarAccess.getAttributeAccess().getFetchTypeFetchTypeEnumRuleCall_5_1_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFetchType();

            state._fsp--;

             after(grammarAccess.getAttributeAccess().getFetchTypeFetchTypeEnumRuleCall_5_1_1_1_0()); 

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
    // $ANTLR end "rule__Attribute__FetchTypeAssignment_5_1_1_1"


    // $ANTLR start "rule__Attribute__ValidationsAssignment_5_1_2_2"
    // InternalSocialRequest.g:3681:1: rule__Attribute__ValidationsAssignment_5_1_2_2 : ( ruleValidation ) ;
    public final void rule__Attribute__ValidationsAssignment_5_1_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:3685:1: ( ( ruleValidation ) )
            // InternalSocialRequest.g:3686:2: ( ruleValidation )
            {
            // InternalSocialRequest.g:3686:2: ( ruleValidation )
            // InternalSocialRequest.g:3687:3: ruleValidation
            {
             before(grammarAccess.getAttributeAccess().getValidationsValidationParserRuleCall_5_1_2_2_0()); 
            pushFollow(FOLLOW_2);
            ruleValidation();

            state._fsp--;

             after(grammarAccess.getAttributeAccess().getValidationsValidationParserRuleCall_5_1_2_2_0()); 

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
    // $ANTLR end "rule__Attribute__ValidationsAssignment_5_1_2_2"


    // $ANTLR start "rule__EntityTypeReference__TypeAssignment"
    // InternalSocialRequest.g:3696:1: rule__EntityTypeReference__TypeAssignment : ( ( RULE_ID ) ) ;
    public final void rule__EntityTypeReference__TypeAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:3700:1: ( ( ( RULE_ID ) ) )
            // InternalSocialRequest.g:3701:2: ( ( RULE_ID ) )
            {
            // InternalSocialRequest.g:3701:2: ( ( RULE_ID ) )
            // InternalSocialRequest.g:3702:3: ( RULE_ID )
            {
             before(grammarAccess.getEntityTypeReferenceAccess().getTypeEntityCrossReference_0()); 
            // InternalSocialRequest.g:3703:3: ( RULE_ID )
            // InternalSocialRequest.g:3704:4: RULE_ID
            {
             before(grammarAccess.getEntityTypeReferenceAccess().getTypeEntityIDTerminalRuleCall_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEntityTypeReferenceAccess().getTypeEntityIDTerminalRuleCall_0_1()); 

            }

             after(grammarAccess.getEntityTypeReferenceAccess().getTypeEntityCrossReference_0()); 

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
    // $ANTLR end "rule__EntityTypeReference__TypeAssignment"


    // $ANTLR start "rule__DataTypeReference__TypeAssignment"
    // InternalSocialRequest.g:3715:1: rule__DataTypeReference__TypeAssignment : ( ruleDataType ) ;
    public final void rule__DataTypeReference__TypeAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:3719:1: ( ( ruleDataType ) )
            // InternalSocialRequest.g:3720:2: ( ruleDataType )
            {
            // InternalSocialRequest.g:3720:2: ( ruleDataType )
            // InternalSocialRequest.g:3721:3: ruleDataType
            {
             before(grammarAccess.getDataTypeReferenceAccess().getTypeDataTypeEnumRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleDataType();

            state._fsp--;

             after(grammarAccess.getDataTypeReferenceAccess().getTypeDataTypeEnumRuleCall_0()); 

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
    // $ANTLR end "rule__DataTypeReference__TypeAssignment"


    // $ANTLR start "rule__Modifier__IsLOBAssignment_0"
    // InternalSocialRequest.g:3730:1: rule__Modifier__IsLOBAssignment_0 : ( ( 'LOB' ) ) ;
    public final void rule__Modifier__IsLOBAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:3734:1: ( ( ( 'LOB' ) ) )
            // InternalSocialRequest.g:3735:2: ( ( 'LOB' ) )
            {
            // InternalSocialRequest.g:3735:2: ( ( 'LOB' ) )
            // InternalSocialRequest.g:3736:3: ( 'LOB' )
            {
             before(grammarAccess.getModifierAccess().getIsLOBLOBKeyword_0_0()); 
            // InternalSocialRequest.g:3737:3: ( 'LOB' )
            // InternalSocialRequest.g:3738:4: 'LOB'
            {
             before(grammarAccess.getModifierAccess().getIsLOBLOBKeyword_0_0()); 
            match(input,62,FOLLOW_2); 
             after(grammarAccess.getModifierAccess().getIsLOBLOBKeyword_0_0()); 

            }

             after(grammarAccess.getModifierAccess().getIsLOBLOBKeyword_0_0()); 

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
    // $ANTLR end "rule__Modifier__IsLOBAssignment_0"


    // $ANTLR start "rule__Modifier__IsTransientAssignment_1"
    // InternalSocialRequest.g:3749:1: rule__Modifier__IsTransientAssignment_1 : ( ( 'TRANSIENT' ) ) ;
    public final void rule__Modifier__IsTransientAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:3753:1: ( ( ( 'TRANSIENT' ) ) )
            // InternalSocialRequest.g:3754:2: ( ( 'TRANSIENT' ) )
            {
            // InternalSocialRequest.g:3754:2: ( ( 'TRANSIENT' ) )
            // InternalSocialRequest.g:3755:3: ( 'TRANSIENT' )
            {
             before(grammarAccess.getModifierAccess().getIsTransientTRANSIENTKeyword_1_0()); 
            // InternalSocialRequest.g:3756:3: ( 'TRANSIENT' )
            // InternalSocialRequest.g:3757:4: 'TRANSIENT'
            {
             before(grammarAccess.getModifierAccess().getIsTransientTRANSIENTKeyword_1_0()); 
            match(input,63,FOLLOW_2); 
             after(grammarAccess.getModifierAccess().getIsTransientTRANSIENTKeyword_1_0()); 

            }

             after(grammarAccess.getModifierAccess().getIsTransientTRANSIENTKeyword_1_0()); 

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
    // $ANTLR end "rule__Modifier__IsTransientAssignment_1"


    // $ANTLR start "rule__Modifier__IsIDAssignment_2_0"
    // InternalSocialRequest.g:3768:1: rule__Modifier__IsIDAssignment_2_0 : ( ( 'ID' ) ) ;
    public final void rule__Modifier__IsIDAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:3772:1: ( ( ( 'ID' ) ) )
            // InternalSocialRequest.g:3773:2: ( ( 'ID' ) )
            {
            // InternalSocialRequest.g:3773:2: ( ( 'ID' ) )
            // InternalSocialRequest.g:3774:3: ( 'ID' )
            {
             before(grammarAccess.getModifierAccess().getIsIDIDKeyword_2_0_0()); 
            // InternalSocialRequest.g:3775:3: ( 'ID' )
            // InternalSocialRequest.g:3776:4: 'ID'
            {
             before(grammarAccess.getModifierAccess().getIsIDIDKeyword_2_0_0()); 
            match(input,64,FOLLOW_2); 
             after(grammarAccess.getModifierAccess().getIsIDIDKeyword_2_0_0()); 

            }

             after(grammarAccess.getModifierAccess().getIsIDIDKeyword_2_0_0()); 

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
    // $ANTLR end "rule__Modifier__IsIDAssignment_2_0"


    // $ANTLR start "rule__Modifier__IDGenerationTypeAssignment_2_1_1"
    // InternalSocialRequest.g:3787:1: rule__Modifier__IDGenerationTypeAssignment_2_1_1 : ( ruleGenerationType ) ;
    public final void rule__Modifier__IDGenerationTypeAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:3791:1: ( ( ruleGenerationType ) )
            // InternalSocialRequest.g:3792:2: ( ruleGenerationType )
            {
            // InternalSocialRequest.g:3792:2: ( ruleGenerationType )
            // InternalSocialRequest.g:3793:3: ruleGenerationType
            {
             before(grammarAccess.getModifierAccess().getIDGenerationTypeGenerationTypeEnumRuleCall_2_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleGenerationType();

            state._fsp--;

             after(grammarAccess.getModifierAccess().getIDGenerationTypeGenerationTypeEnumRuleCall_2_1_1_0()); 

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
    // $ANTLR end "rule__Modifier__IDGenerationTypeAssignment_2_1_1"


    // $ANTLR start "rule__Validation__MinAssignment_0_1"
    // InternalSocialRequest.g:3802:1: rule__Validation__MinAssignment_0_1 : ( RULE_POSSIBLY_SIGNED_INT ) ;
    public final void rule__Validation__MinAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:3806:1: ( ( RULE_POSSIBLY_SIGNED_INT ) )
            // InternalSocialRequest.g:3807:2: ( RULE_POSSIBLY_SIGNED_INT )
            {
            // InternalSocialRequest.g:3807:2: ( RULE_POSSIBLY_SIGNED_INT )
            // InternalSocialRequest.g:3808:3: RULE_POSSIBLY_SIGNED_INT
            {
             before(grammarAccess.getValidationAccess().getMinPOSSIBLY_SIGNED_INTTerminalRuleCall_0_1_0()); 
            match(input,RULE_POSSIBLY_SIGNED_INT,FOLLOW_2); 
             after(grammarAccess.getValidationAccess().getMinPOSSIBLY_SIGNED_INTTerminalRuleCall_0_1_0()); 

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
    // $ANTLR end "rule__Validation__MinAssignment_0_1"


    // $ANTLR start "rule__Validation__MaxAssignment_1_1"
    // InternalSocialRequest.g:3817:1: rule__Validation__MaxAssignment_1_1 : ( RULE_POSSIBLY_SIGNED_INT ) ;
    public final void rule__Validation__MaxAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:3821:1: ( ( RULE_POSSIBLY_SIGNED_INT ) )
            // InternalSocialRequest.g:3822:2: ( RULE_POSSIBLY_SIGNED_INT )
            {
            // InternalSocialRequest.g:3822:2: ( RULE_POSSIBLY_SIGNED_INT )
            // InternalSocialRequest.g:3823:3: RULE_POSSIBLY_SIGNED_INT
            {
             before(grammarAccess.getValidationAccess().getMaxPOSSIBLY_SIGNED_INTTerminalRuleCall_1_1_0()); 
            match(input,RULE_POSSIBLY_SIGNED_INT,FOLLOW_2); 
             after(grammarAccess.getValidationAccess().getMaxPOSSIBLY_SIGNED_INTTerminalRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__Validation__MaxAssignment_1_1"


    // $ANTLR start "rule__Validation__RegexAssignment_2_1"
    // InternalSocialRequest.g:3832:1: rule__Validation__RegexAssignment_2_1 : ( RULE_STRING ) ;
    public final void rule__Validation__RegexAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:3836:1: ( ( RULE_STRING ) )
            // InternalSocialRequest.g:3837:2: ( RULE_STRING )
            {
            // InternalSocialRequest.g:3837:2: ( RULE_STRING )
            // InternalSocialRequest.g:3838:3: RULE_STRING
            {
             before(grammarAccess.getValidationAccess().getRegexSTRINGTerminalRuleCall_2_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getValidationAccess().getRegexSTRINGTerminalRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__Validation__RegexAssignment_2_1"


    // $ANTLR start "rule__Validation__ValidatorAssignment_3"
    // InternalSocialRequest.g:3847:1: rule__Validation__ValidatorAssignment_3 : ( ruleBasicValidation ) ;
    public final void rule__Validation__ValidatorAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:3851:1: ( ( ruleBasicValidation ) )
            // InternalSocialRequest.g:3852:2: ( ruleBasicValidation )
            {
            // InternalSocialRequest.g:3852:2: ( ruleBasicValidation )
            // InternalSocialRequest.g:3853:3: ruleBasicValidation
            {
             before(grammarAccess.getValidationAccess().getValidatorBasicValidationEnumRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleBasicValidation();

            state._fsp--;

             after(grammarAccess.getValidationAccess().getValidatorBasicValidationEnumRuleCall_3_0()); 

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
    // $ANTLR end "rule__Validation__ValidatorAssignment_3"


    // $ANTLR start "rule__Repository__EntityAssignment_1"
    // InternalSocialRequest.g:3862:1: rule__Repository__EntityAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__Repository__EntityAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:3866:1: ( ( ( RULE_ID ) ) )
            // InternalSocialRequest.g:3867:2: ( ( RULE_ID ) )
            {
            // InternalSocialRequest.g:3867:2: ( ( RULE_ID ) )
            // InternalSocialRequest.g:3868:3: ( RULE_ID )
            {
             before(grammarAccess.getRepositoryAccess().getEntityEntityCrossReference_1_0()); 
            // InternalSocialRequest.g:3869:3: ( RULE_ID )
            // InternalSocialRequest.g:3870:4: RULE_ID
            {
             before(grammarAccess.getRepositoryAccess().getEntityEntityIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRepositoryAccess().getEntityEntityIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getRepositoryAccess().getEntityEntityCrossReference_1_0()); 

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
    // $ANTLR end "rule__Repository__EntityAssignment_1"


    // $ANTLR start "rule__Repository__QueriesAssignment_3"
    // InternalSocialRequest.g:3881:1: rule__Repository__QueriesAssignment_3 : ( ruleQuery ) ;
    public final void rule__Repository__QueriesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:3885:1: ( ( ruleQuery ) )
            // InternalSocialRequest.g:3886:2: ( ruleQuery )
            {
            // InternalSocialRequest.g:3886:2: ( ruleQuery )
            // InternalSocialRequest.g:3887:3: ruleQuery
            {
             before(grammarAccess.getRepositoryAccess().getQueriesQueryParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleQuery();

            state._fsp--;

             after(grammarAccess.getRepositoryAccess().getQueriesQueryParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Repository__QueriesAssignment_3"


    // $ANTLR start "rule__Query__NameAssignment_1"
    // InternalSocialRequest.g:3896:1: rule__Query__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Query__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:3900:1: ( ( RULE_ID ) )
            // InternalSocialRequest.g:3901:2: ( RULE_ID )
            {
            // InternalSocialRequest.g:3901:2: ( RULE_ID )
            // InternalSocialRequest.g:3902:3: RULE_ID
            {
             before(grammarAccess.getQueryAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getQueryAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Query__NameAssignment_1"


    // $ANTLR start "rule__Query__IsListAssignment_2_0"
    // InternalSocialRequest.g:3911:1: rule__Query__IsListAssignment_2_0 : ( ( ':' ) ) ;
    public final void rule__Query__IsListAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:3915:1: ( ( ( ':' ) ) )
            // InternalSocialRequest.g:3916:2: ( ( ':' ) )
            {
            // InternalSocialRequest.g:3916:2: ( ( ':' ) )
            // InternalSocialRequest.g:3917:3: ( ':' )
            {
             before(grammarAccess.getQueryAccess().getIsListColonKeyword_2_0_0()); 
            // InternalSocialRequest.g:3918:3: ( ':' )
            // InternalSocialRequest.g:3919:4: ':'
            {
             before(grammarAccess.getQueryAccess().getIsListColonKeyword_2_0_0()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getQueryAccess().getIsListColonKeyword_2_0_0()); 

            }

             after(grammarAccess.getQueryAccess().getIsListColonKeyword_2_0_0()); 

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
    // $ANTLR end "rule__Query__IsListAssignment_2_0"


    // $ANTLR start "rule__Query__ParamsAssignment_3_1_2"
    // InternalSocialRequest.g:3930:1: rule__Query__ParamsAssignment_3_1_2 : ( ruleParam ) ;
    public final void rule__Query__ParamsAssignment_3_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:3934:1: ( ( ruleParam ) )
            // InternalSocialRequest.g:3935:2: ( ruleParam )
            {
            // InternalSocialRequest.g:3935:2: ( ruleParam )
            // InternalSocialRequest.g:3936:3: ruleParam
            {
             before(grammarAccess.getQueryAccess().getParamsParamParserRuleCall_3_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleParam();

            state._fsp--;

             after(grammarAccess.getQueryAccess().getParamsParamParserRuleCall_3_1_2_0()); 

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
    // $ANTLR end "rule__Query__ParamsAssignment_3_1_2"


    // $ANTLR start "rule__Query__SqlQueryAssignment_3_2"
    // InternalSocialRequest.g:3945:1: rule__Query__SqlQueryAssignment_3_2 : ( ruleSQLQuery ) ;
    public final void rule__Query__SqlQueryAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:3949:1: ( ( ruleSQLQuery ) )
            // InternalSocialRequest.g:3950:2: ( ruleSQLQuery )
            {
            // InternalSocialRequest.g:3950:2: ( ruleSQLQuery )
            // InternalSocialRequest.g:3951:3: ruleSQLQuery
            {
             before(grammarAccess.getQueryAccess().getSqlQuerySQLQueryParserRuleCall_3_2_0()); 
            pushFollow(FOLLOW_2);
            ruleSQLQuery();

            state._fsp--;

             after(grammarAccess.getQueryAccess().getSqlQuerySQLQueryParserRuleCall_3_2_0()); 

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
    // $ANTLR end "rule__Query__SqlQueryAssignment_3_2"


    // $ANTLR start "rule__Param__NameAssignment_0"
    // InternalSocialRequest.g:3960:1: rule__Param__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Param__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:3964:1: ( ( RULE_ID ) )
            // InternalSocialRequest.g:3965:2: ( RULE_ID )
            {
            // InternalSocialRequest.g:3965:2: ( RULE_ID )
            // InternalSocialRequest.g:3966:3: RULE_ID
            {
             before(grammarAccess.getParamAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getParamAccess().getNameIDTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__Param__NameAssignment_0"


    // $ANTLR start "rule__Param__TypeAssignment_2"
    // InternalSocialRequest.g:3975:1: rule__Param__TypeAssignment_2 : ( ruleTypeReference ) ;
    public final void rule__Param__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:3979:1: ( ( ruleTypeReference ) )
            // InternalSocialRequest.g:3980:2: ( ruleTypeReference )
            {
            // InternalSocialRequest.g:3980:2: ( ruleTypeReference )
            // InternalSocialRequest.g:3981:3: ruleTypeReference
            {
             before(grammarAccess.getParamAccess().getTypeTypeReferenceParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleTypeReference();

            state._fsp--;

             after(grammarAccess.getParamAccess().getTypeTypeReferenceParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Param__TypeAssignment_2"


    // $ANTLR start "rule__SQLQuery__SelectAssignment_0"
    // InternalSocialRequest.g:3990:1: rule__SQLQuery__SelectAssignment_0 : ( ruleSelect ) ;
    public final void rule__SQLQuery__SelectAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:3994:1: ( ( ruleSelect ) )
            // InternalSocialRequest.g:3995:2: ( ruleSelect )
            {
            // InternalSocialRequest.g:3995:2: ( ruleSelect )
            // InternalSocialRequest.g:3996:3: ruleSelect
            {
             before(grammarAccess.getSQLQueryAccess().getSelectSelectParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleSelect();

            state._fsp--;

             after(grammarAccess.getSQLQueryAccess().getSelectSelectParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__SQLQuery__SelectAssignment_0"


    // $ANTLR start "rule__SQLQuery__FromAssignment_1"
    // InternalSocialRequest.g:4005:1: rule__SQLQuery__FromAssignment_1 : ( ruleFrom ) ;
    public final void rule__SQLQuery__FromAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:4009:1: ( ( ruleFrom ) )
            // InternalSocialRequest.g:4010:2: ( ruleFrom )
            {
            // InternalSocialRequest.g:4010:2: ( ruleFrom )
            // InternalSocialRequest.g:4011:3: ruleFrom
            {
             before(grammarAccess.getSQLQueryAccess().getFromFromParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFrom();

            state._fsp--;

             after(grammarAccess.getSQLQueryAccess().getFromFromParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__SQLQuery__FromAssignment_1"


    // $ANTLR start "rule__SQLQuery__JoinsAssignment_2"
    // InternalSocialRequest.g:4020:1: rule__SQLQuery__JoinsAssignment_2 : ( ruleJoin ) ;
    public final void rule__SQLQuery__JoinsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:4024:1: ( ( ruleJoin ) )
            // InternalSocialRequest.g:4025:2: ( ruleJoin )
            {
            // InternalSocialRequest.g:4025:2: ( ruleJoin )
            // InternalSocialRequest.g:4026:3: ruleJoin
            {
             before(grammarAccess.getSQLQueryAccess().getJoinsJoinParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleJoin();

            state._fsp--;

             after(grammarAccess.getSQLQueryAccess().getJoinsJoinParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__SQLQuery__JoinsAssignment_2"


    // $ANTLR start "rule__SQLQuery__WhereAssignment_3"
    // InternalSocialRequest.g:4035:1: rule__SQLQuery__WhereAssignment_3 : ( ruleWhere ) ;
    public final void rule__SQLQuery__WhereAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:4039:1: ( ( ruleWhere ) )
            // InternalSocialRequest.g:4040:2: ( ruleWhere )
            {
            // InternalSocialRequest.g:4040:2: ( ruleWhere )
            // InternalSocialRequest.g:4041:3: ruleWhere
            {
             before(grammarAccess.getSQLQueryAccess().getWhereWhereParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleWhere();

            state._fsp--;

             after(grammarAccess.getSQLQueryAccess().getWhereWhereParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__SQLQuery__WhereAssignment_3"


    // $ANTLR start "rule__SQLQuery__OrderAssignment_4"
    // InternalSocialRequest.g:4050:1: rule__SQLQuery__OrderAssignment_4 : ( ruleOrder ) ;
    public final void rule__SQLQuery__OrderAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:4054:1: ( ( ruleOrder ) )
            // InternalSocialRequest.g:4055:2: ( ruleOrder )
            {
            // InternalSocialRequest.g:4055:2: ( ruleOrder )
            // InternalSocialRequest.g:4056:3: ruleOrder
            {
             before(grammarAccess.getSQLQueryAccess().getOrderOrderParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleOrder();

            state._fsp--;

             after(grammarAccess.getSQLQueryAccess().getOrderOrderParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__SQLQuery__OrderAssignment_4"


    // $ANTLR start "rule__Select__IsDistinctAssignment_1"
    // InternalSocialRequest.g:4065:1: rule__Select__IsDistinctAssignment_1 : ( ( 'DISTINCT' ) ) ;
    public final void rule__Select__IsDistinctAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:4069:1: ( ( ( 'DISTINCT' ) ) )
            // InternalSocialRequest.g:4070:2: ( ( 'DISTINCT' ) )
            {
            // InternalSocialRequest.g:4070:2: ( ( 'DISTINCT' ) )
            // InternalSocialRequest.g:4071:3: ( 'DISTINCT' )
            {
             before(grammarAccess.getSelectAccess().getIsDistinctDISTINCTKeyword_1_0()); 
            // InternalSocialRequest.g:4072:3: ( 'DISTINCT' )
            // InternalSocialRequest.g:4073:4: 'DISTINCT'
            {
             before(grammarAccess.getSelectAccess().getIsDistinctDISTINCTKeyword_1_0()); 
            match(input,65,FOLLOW_2); 
             after(grammarAccess.getSelectAccess().getIsDistinctDISTINCTKeyword_1_0()); 

            }

             after(grammarAccess.getSelectAccess().getIsDistinctDISTINCTKeyword_1_0()); 

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
    // $ANTLR end "rule__Select__IsDistinctAssignment_1"


    // $ANTLR start "rule__Select__ClauseAssignment_3"
    // InternalSocialRequest.g:4084:1: rule__Select__ClauseAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Select__ClauseAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:4088:1: ( ( RULE_STRING ) )
            // InternalSocialRequest.g:4089:2: ( RULE_STRING )
            {
            // InternalSocialRequest.g:4089:2: ( RULE_STRING )
            // InternalSocialRequest.g:4090:3: RULE_STRING
            {
             before(grammarAccess.getSelectAccess().getClauseSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getSelectAccess().getClauseSTRINGTerminalRuleCall_3_0()); 

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
    // $ANTLR end "rule__Select__ClauseAssignment_3"


    // $ANTLR start "rule__From__EntityAssignment_2"
    // InternalSocialRequest.g:4099:1: rule__From__EntityAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__From__EntityAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:4103:1: ( ( ( RULE_ID ) ) )
            // InternalSocialRequest.g:4104:2: ( ( RULE_ID ) )
            {
            // InternalSocialRequest.g:4104:2: ( ( RULE_ID ) )
            // InternalSocialRequest.g:4105:3: ( RULE_ID )
            {
             before(grammarAccess.getFromAccess().getEntityEntityCrossReference_2_0()); 
            // InternalSocialRequest.g:4106:3: ( RULE_ID )
            // InternalSocialRequest.g:4107:4: RULE_ID
            {
             before(grammarAccess.getFromAccess().getEntityEntityIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFromAccess().getEntityEntityIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getFromAccess().getEntityEntityCrossReference_2_0()); 

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
    // $ANTLR end "rule__From__EntityAssignment_2"


    // $ANTLR start "rule__From__AliasAssignment_3"
    // InternalSocialRequest.g:4118:1: rule__From__AliasAssignment_3 : ( RULE_ID ) ;
    public final void rule__From__AliasAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:4122:1: ( ( RULE_ID ) )
            // InternalSocialRequest.g:4123:2: ( RULE_ID )
            {
            // InternalSocialRequest.g:4123:2: ( RULE_ID )
            // InternalSocialRequest.g:4124:3: RULE_ID
            {
             before(grammarAccess.getFromAccess().getAliasIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFromAccess().getAliasIDTerminalRuleCall_3_0()); 

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
    // $ANTLR end "rule__From__AliasAssignment_3"


    // $ANTLR start "rule__Join__JoinTypeAssignment_0"
    // InternalSocialRequest.g:4133:1: rule__Join__JoinTypeAssignment_0 : ( ruleJoinType ) ;
    public final void rule__Join__JoinTypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:4137:1: ( ( ruleJoinType ) )
            // InternalSocialRequest.g:4138:2: ( ruleJoinType )
            {
            // InternalSocialRequest.g:4138:2: ( ruleJoinType )
            // InternalSocialRequest.g:4139:3: ruleJoinType
            {
             before(grammarAccess.getJoinAccess().getJoinTypeJoinTypeEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleJoinType();

            state._fsp--;

             after(grammarAccess.getJoinAccess().getJoinTypeJoinTypeEnumRuleCall_0_0()); 

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
    // $ANTLR end "rule__Join__JoinTypeAssignment_0"


    // $ANTLR start "rule__Join__EntityAssignment_2"
    // InternalSocialRequest.g:4148:1: rule__Join__EntityAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Join__EntityAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:4152:1: ( ( ( RULE_ID ) ) )
            // InternalSocialRequest.g:4153:2: ( ( RULE_ID ) )
            {
            // InternalSocialRequest.g:4153:2: ( ( RULE_ID ) )
            // InternalSocialRequest.g:4154:3: ( RULE_ID )
            {
             before(grammarAccess.getJoinAccess().getEntityEntityCrossReference_2_0()); 
            // InternalSocialRequest.g:4155:3: ( RULE_ID )
            // InternalSocialRequest.g:4156:4: RULE_ID
            {
             before(grammarAccess.getJoinAccess().getEntityEntityIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getJoinAccess().getEntityEntityIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getJoinAccess().getEntityEntityCrossReference_2_0()); 

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
    // $ANTLR end "rule__Join__EntityAssignment_2"


    // $ANTLR start "rule__Join__AliasAssignment_3"
    // InternalSocialRequest.g:4167:1: rule__Join__AliasAssignment_3 : ( RULE_ID ) ;
    public final void rule__Join__AliasAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:4171:1: ( ( RULE_ID ) )
            // InternalSocialRequest.g:4172:2: ( RULE_ID )
            {
            // InternalSocialRequest.g:4172:2: ( RULE_ID )
            // InternalSocialRequest.g:4173:3: RULE_ID
            {
             before(grammarAccess.getJoinAccess().getAliasIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getJoinAccess().getAliasIDTerminalRuleCall_3_0()); 

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
    // $ANTLR end "rule__Join__AliasAssignment_3"


    // $ANTLR start "rule__Join__JoinConditionAssignment_5_2"
    // InternalSocialRequest.g:4182:1: rule__Join__JoinConditionAssignment_5_2 : ( RULE_STRING ) ;
    public final void rule__Join__JoinConditionAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:4186:1: ( ( RULE_STRING ) )
            // InternalSocialRequest.g:4187:2: ( RULE_STRING )
            {
            // InternalSocialRequest.g:4187:2: ( RULE_STRING )
            // InternalSocialRequest.g:4188:3: RULE_STRING
            {
             before(grammarAccess.getJoinAccess().getJoinConditionSTRINGTerminalRuleCall_5_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getJoinAccess().getJoinConditionSTRINGTerminalRuleCall_5_2_0()); 

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
    // $ANTLR end "rule__Join__JoinConditionAssignment_5_2"


    // $ANTLR start "rule__Where__ConditionAssignment_2"
    // InternalSocialRequest.g:4197:1: rule__Where__ConditionAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Where__ConditionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:4201:1: ( ( RULE_STRING ) )
            // InternalSocialRequest.g:4202:2: ( RULE_STRING )
            {
            // InternalSocialRequest.g:4202:2: ( RULE_STRING )
            // InternalSocialRequest.g:4203:3: RULE_STRING
            {
             before(grammarAccess.getWhereAccess().getConditionSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getWhereAccess().getConditionSTRINGTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__Where__ConditionAssignment_2"


    // $ANTLR start "rule__Order__OrderAssignment_2"
    // InternalSocialRequest.g:4212:1: rule__Order__OrderAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Order__OrderAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:4216:1: ( ( RULE_STRING ) )
            // InternalSocialRequest.g:4217:2: ( RULE_STRING )
            {
            // InternalSocialRequest.g:4217:2: ( RULE_STRING )
            // InternalSocialRequest.g:4218:3: RULE_STRING
            {
             before(grammarAccess.getOrderAccess().getOrderSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getOrderAccess().getOrderSTRINGTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__Order__OrderAssignment_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x2000010000000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000007800010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000007800012L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x00000007F8000010L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0xC000010000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000700000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x000E00000001F000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x000E00000001F002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x00000000001E0000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000090000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0180020000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000020000000010L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x1800007800000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000007800000002L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000010000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000700000000002L});

}
