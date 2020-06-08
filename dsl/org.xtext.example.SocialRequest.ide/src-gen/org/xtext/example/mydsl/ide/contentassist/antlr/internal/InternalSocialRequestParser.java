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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_FETCHTYPE", "RULE_POSSIBLY_SIGNED_INT", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'NotNull'", "'NotBlank'", "'Past'", "'Unique'", "'Email'", "'OneToMany'", "'ManyToOne'", "'OneToOne'", "'ManyToMany'", "'AUTO'", "'TABLE'", "'IDENTITY'", "'SEQUENCE'", "'String'", "'long'", "'float'", "'double'", "'char'", "'int'", "'boolean'", "'Date'", "'LEFT JOIN'", "'LEFT OUTER JOIN'", "'CROSS JOIN'", "'JOIN'", "'Entity'", "'{'", "'}'", "'UserDetails'", "':'", "'mappedBy:'", "'fetch:'", "'validations'", "'('", "')'", "'min:'", "'max:'", "'pattern:'", "'Repository'", "'query'", "'list'", "'params'", "'SELECT'", "'FROM'", "'ON'", "'WHERE'", "'ORDER BY'", "'implements'", "'LOB'", "'TRANSIENT'", "'ID'", "'DISTINCT'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int RULE_POSSIBLY_SIGNED_INT=6;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__55=55;
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
    public static final int RULE_INT=8;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int RULE_FETCHTYPE=5;
    public static final int RULE_STRING=7;
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


    // $ANTLR start "entryRuleBASICVALIDATION"
    // InternalSocialRequest.g:253:1: entryRuleBASICVALIDATION : ruleBASICVALIDATION EOF ;
    public final void entryRuleBASICVALIDATION() throws RecognitionException {
        try {
            // InternalSocialRequest.g:254:1: ( ruleBASICVALIDATION EOF )
            // InternalSocialRequest.g:255:1: ruleBASICVALIDATION EOF
            {
             before(grammarAccess.getBASICVALIDATIONRule()); 
            pushFollow(FOLLOW_1);
            ruleBASICVALIDATION();

            state._fsp--;

             after(grammarAccess.getBASICVALIDATIONRule()); 
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
    // $ANTLR end "entryRuleBASICVALIDATION"


    // $ANTLR start "ruleBASICVALIDATION"
    // InternalSocialRequest.g:262:1: ruleBASICVALIDATION : ( ( rule__BASICVALIDATION__Alternatives ) ) ;
    public final void ruleBASICVALIDATION() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:266:2: ( ( ( rule__BASICVALIDATION__Alternatives ) ) )
            // InternalSocialRequest.g:267:2: ( ( rule__BASICVALIDATION__Alternatives ) )
            {
            // InternalSocialRequest.g:267:2: ( ( rule__BASICVALIDATION__Alternatives ) )
            // InternalSocialRequest.g:268:3: ( rule__BASICVALIDATION__Alternatives )
            {
             before(grammarAccess.getBASICVALIDATIONAccess().getAlternatives()); 
            // InternalSocialRequest.g:269:3: ( rule__BASICVALIDATION__Alternatives )
            // InternalSocialRequest.g:269:4: rule__BASICVALIDATION__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__BASICVALIDATION__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getBASICVALIDATIONAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBASICVALIDATION"


    // $ANTLR start "entryRuleASSOCIATION"
    // InternalSocialRequest.g:278:1: entryRuleASSOCIATION : ruleASSOCIATION EOF ;
    public final void entryRuleASSOCIATION() throws RecognitionException {
        try {
            // InternalSocialRequest.g:279:1: ( ruleASSOCIATION EOF )
            // InternalSocialRequest.g:280:1: ruleASSOCIATION EOF
            {
             before(grammarAccess.getASSOCIATIONRule()); 
            pushFollow(FOLLOW_1);
            ruleASSOCIATION();

            state._fsp--;

             after(grammarAccess.getASSOCIATIONRule()); 
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
    // $ANTLR end "entryRuleASSOCIATION"


    // $ANTLR start "ruleASSOCIATION"
    // InternalSocialRequest.g:287:1: ruleASSOCIATION : ( ( rule__ASSOCIATION__Alternatives ) ) ;
    public final void ruleASSOCIATION() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:291:2: ( ( ( rule__ASSOCIATION__Alternatives ) ) )
            // InternalSocialRequest.g:292:2: ( ( rule__ASSOCIATION__Alternatives ) )
            {
            // InternalSocialRequest.g:292:2: ( ( rule__ASSOCIATION__Alternatives ) )
            // InternalSocialRequest.g:293:3: ( rule__ASSOCIATION__Alternatives )
            {
             before(grammarAccess.getASSOCIATIONAccess().getAlternatives()); 
            // InternalSocialRequest.g:294:3: ( rule__ASSOCIATION__Alternatives )
            // InternalSocialRequest.g:294:4: rule__ASSOCIATION__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ASSOCIATION__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getASSOCIATIONAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleASSOCIATION"


    // $ANTLR start "entryRuleRepository"
    // InternalSocialRequest.g:303:1: entryRuleRepository : ruleRepository EOF ;
    public final void entryRuleRepository() throws RecognitionException {
        try {
            // InternalSocialRequest.g:304:1: ( ruleRepository EOF )
            // InternalSocialRequest.g:305:1: ruleRepository EOF
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
    // InternalSocialRequest.g:312:1: ruleRepository : ( ( rule__Repository__Group__0 ) ) ;
    public final void ruleRepository() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:316:2: ( ( ( rule__Repository__Group__0 ) ) )
            // InternalSocialRequest.g:317:2: ( ( rule__Repository__Group__0 ) )
            {
            // InternalSocialRequest.g:317:2: ( ( rule__Repository__Group__0 ) )
            // InternalSocialRequest.g:318:3: ( rule__Repository__Group__0 )
            {
             before(grammarAccess.getRepositoryAccess().getGroup()); 
            // InternalSocialRequest.g:319:3: ( rule__Repository__Group__0 )
            // InternalSocialRequest.g:319:4: rule__Repository__Group__0
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
    // InternalSocialRequest.g:328:1: entryRuleQuery : ruleQuery EOF ;
    public final void entryRuleQuery() throws RecognitionException {
        try {
            // InternalSocialRequest.g:329:1: ( ruleQuery EOF )
            // InternalSocialRequest.g:330:1: ruleQuery EOF
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
    // InternalSocialRequest.g:337:1: ruleQuery : ( ( rule__Query__Group__0 ) ) ;
    public final void ruleQuery() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:341:2: ( ( ( rule__Query__Group__0 ) ) )
            // InternalSocialRequest.g:342:2: ( ( rule__Query__Group__0 ) )
            {
            // InternalSocialRequest.g:342:2: ( ( rule__Query__Group__0 ) )
            // InternalSocialRequest.g:343:3: ( rule__Query__Group__0 )
            {
             before(grammarAccess.getQueryAccess().getGroup()); 
            // InternalSocialRequest.g:344:3: ( rule__Query__Group__0 )
            // InternalSocialRequest.g:344:4: rule__Query__Group__0
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
    // InternalSocialRequest.g:353:1: entryRuleParam : ruleParam EOF ;
    public final void entryRuleParam() throws RecognitionException {
        try {
            // InternalSocialRequest.g:354:1: ( ruleParam EOF )
            // InternalSocialRequest.g:355:1: ruleParam EOF
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
    // InternalSocialRequest.g:362:1: ruleParam : ( ( rule__Param__Group__0 ) ) ;
    public final void ruleParam() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:366:2: ( ( ( rule__Param__Group__0 ) ) )
            // InternalSocialRequest.g:367:2: ( ( rule__Param__Group__0 ) )
            {
            // InternalSocialRequest.g:367:2: ( ( rule__Param__Group__0 ) )
            // InternalSocialRequest.g:368:3: ( rule__Param__Group__0 )
            {
             before(grammarAccess.getParamAccess().getGroup()); 
            // InternalSocialRequest.g:369:3: ( rule__Param__Group__0 )
            // InternalSocialRequest.g:369:4: rule__Param__Group__0
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
    // InternalSocialRequest.g:378:1: entryRuleSQLQuery : ruleSQLQuery EOF ;
    public final void entryRuleSQLQuery() throws RecognitionException {
        try {
            // InternalSocialRequest.g:379:1: ( ruleSQLQuery EOF )
            // InternalSocialRequest.g:380:1: ruleSQLQuery EOF
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
    // InternalSocialRequest.g:387:1: ruleSQLQuery : ( ( rule__SQLQuery__Group__0 ) ) ;
    public final void ruleSQLQuery() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:391:2: ( ( ( rule__SQLQuery__Group__0 ) ) )
            // InternalSocialRequest.g:392:2: ( ( rule__SQLQuery__Group__0 ) )
            {
            // InternalSocialRequest.g:392:2: ( ( rule__SQLQuery__Group__0 ) )
            // InternalSocialRequest.g:393:3: ( rule__SQLQuery__Group__0 )
            {
             before(grammarAccess.getSQLQueryAccess().getGroup()); 
            // InternalSocialRequest.g:394:3: ( rule__SQLQuery__Group__0 )
            // InternalSocialRequest.g:394:4: rule__SQLQuery__Group__0
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
    // InternalSocialRequest.g:403:1: entryRuleSelect : ruleSelect EOF ;
    public final void entryRuleSelect() throws RecognitionException {
        try {
            // InternalSocialRequest.g:404:1: ( ruleSelect EOF )
            // InternalSocialRequest.g:405:1: ruleSelect EOF
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
    // InternalSocialRequest.g:412:1: ruleSelect : ( ( rule__Select__Group__0 ) ) ;
    public final void ruleSelect() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:416:2: ( ( ( rule__Select__Group__0 ) ) )
            // InternalSocialRequest.g:417:2: ( ( rule__Select__Group__0 ) )
            {
            // InternalSocialRequest.g:417:2: ( ( rule__Select__Group__0 ) )
            // InternalSocialRequest.g:418:3: ( rule__Select__Group__0 )
            {
             before(grammarAccess.getSelectAccess().getGroup()); 
            // InternalSocialRequest.g:419:3: ( rule__Select__Group__0 )
            // InternalSocialRequest.g:419:4: rule__Select__Group__0
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
    // InternalSocialRequest.g:428:1: entryRuleFrom : ruleFrom EOF ;
    public final void entryRuleFrom() throws RecognitionException {
        try {
            // InternalSocialRequest.g:429:1: ( ruleFrom EOF )
            // InternalSocialRequest.g:430:1: ruleFrom EOF
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
    // InternalSocialRequest.g:437:1: ruleFrom : ( ( rule__From__Group__0 ) ) ;
    public final void ruleFrom() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:441:2: ( ( ( rule__From__Group__0 ) ) )
            // InternalSocialRequest.g:442:2: ( ( rule__From__Group__0 ) )
            {
            // InternalSocialRequest.g:442:2: ( ( rule__From__Group__0 ) )
            // InternalSocialRequest.g:443:3: ( rule__From__Group__0 )
            {
             before(grammarAccess.getFromAccess().getGroup()); 
            // InternalSocialRequest.g:444:3: ( rule__From__Group__0 )
            // InternalSocialRequest.g:444:4: rule__From__Group__0
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
    // InternalSocialRequest.g:453:1: entryRuleJoin : ruleJoin EOF ;
    public final void entryRuleJoin() throws RecognitionException {
        try {
            // InternalSocialRequest.g:454:1: ( ruleJoin EOF )
            // InternalSocialRequest.g:455:1: ruleJoin EOF
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
    // InternalSocialRequest.g:462:1: ruleJoin : ( ( rule__Join__Group__0 ) ) ;
    public final void ruleJoin() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:466:2: ( ( ( rule__Join__Group__0 ) ) )
            // InternalSocialRequest.g:467:2: ( ( rule__Join__Group__0 ) )
            {
            // InternalSocialRequest.g:467:2: ( ( rule__Join__Group__0 ) )
            // InternalSocialRequest.g:468:3: ( rule__Join__Group__0 )
            {
             before(grammarAccess.getJoinAccess().getGroup()); 
            // InternalSocialRequest.g:469:3: ( rule__Join__Group__0 )
            // InternalSocialRequest.g:469:4: rule__Join__Group__0
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
    // InternalSocialRequest.g:478:1: entryRuleWhere : ruleWhere EOF ;
    public final void entryRuleWhere() throws RecognitionException {
        try {
            // InternalSocialRequest.g:479:1: ( ruleWhere EOF )
            // InternalSocialRequest.g:480:1: ruleWhere EOF
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
    // InternalSocialRequest.g:487:1: ruleWhere : ( ( rule__Where__Group__0 ) ) ;
    public final void ruleWhere() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:491:2: ( ( ( rule__Where__Group__0 ) ) )
            // InternalSocialRequest.g:492:2: ( ( rule__Where__Group__0 ) )
            {
            // InternalSocialRequest.g:492:2: ( ( rule__Where__Group__0 ) )
            // InternalSocialRequest.g:493:3: ( rule__Where__Group__0 )
            {
             before(grammarAccess.getWhereAccess().getGroup()); 
            // InternalSocialRequest.g:494:3: ( rule__Where__Group__0 )
            // InternalSocialRequest.g:494:4: rule__Where__Group__0
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
    // InternalSocialRequest.g:503:1: entryRuleOrder : ruleOrder EOF ;
    public final void entryRuleOrder() throws RecognitionException {
        try {
            // InternalSocialRequest.g:504:1: ( ruleOrder EOF )
            // InternalSocialRequest.g:505:1: ruleOrder EOF
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
    // InternalSocialRequest.g:512:1: ruleOrder : ( ( rule__Order__Group__0 ) ) ;
    public final void ruleOrder() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:516:2: ( ( ( rule__Order__Group__0 ) ) )
            // InternalSocialRequest.g:517:2: ( ( rule__Order__Group__0 ) )
            {
            // InternalSocialRequest.g:517:2: ( ( rule__Order__Group__0 ) )
            // InternalSocialRequest.g:518:3: ( rule__Order__Group__0 )
            {
             before(grammarAccess.getOrderAccess().getGroup()); 
            // InternalSocialRequest.g:519:3: ( rule__Order__Group__0 )
            // InternalSocialRequest.g:519:4: rule__Order__Group__0
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


    // $ANTLR start "ruleGenerationType"
    // InternalSocialRequest.g:528:1: ruleGenerationType : ( ( rule__GenerationType__Alternatives ) ) ;
    public final void ruleGenerationType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:532:1: ( ( ( rule__GenerationType__Alternatives ) ) )
            // InternalSocialRequest.g:533:2: ( ( rule__GenerationType__Alternatives ) )
            {
            // InternalSocialRequest.g:533:2: ( ( rule__GenerationType__Alternatives ) )
            // InternalSocialRequest.g:534:3: ( rule__GenerationType__Alternatives )
            {
             before(grammarAccess.getGenerationTypeAccess().getAlternatives()); 
            // InternalSocialRequest.g:535:3: ( rule__GenerationType__Alternatives )
            // InternalSocialRequest.g:535:4: rule__GenerationType__Alternatives
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


    // $ANTLR start "ruleDataType"
    // InternalSocialRequest.g:544:1: ruleDataType : ( ( rule__DataType__Alternatives ) ) ;
    public final void ruleDataType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:548:1: ( ( ( rule__DataType__Alternatives ) ) )
            // InternalSocialRequest.g:549:2: ( ( rule__DataType__Alternatives ) )
            {
            // InternalSocialRequest.g:549:2: ( ( rule__DataType__Alternatives ) )
            // InternalSocialRequest.g:550:3: ( rule__DataType__Alternatives )
            {
             before(grammarAccess.getDataTypeAccess().getAlternatives()); 
            // InternalSocialRequest.g:551:3: ( rule__DataType__Alternatives )
            // InternalSocialRequest.g:551:4: rule__DataType__Alternatives
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
    // InternalSocialRequest.g:560:1: ruleJoinType : ( ( rule__JoinType__Alternatives ) ) ;
    public final void ruleJoinType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:564:1: ( ( ( rule__JoinType__Alternatives ) ) )
            // InternalSocialRequest.g:565:2: ( ( rule__JoinType__Alternatives ) )
            {
            // InternalSocialRequest.g:565:2: ( ( rule__JoinType__Alternatives ) )
            // InternalSocialRequest.g:566:3: ( rule__JoinType__Alternatives )
            {
             before(grammarAccess.getJoinTypeAccess().getAlternatives()); 
            // InternalSocialRequest.g:567:3: ( rule__JoinType__Alternatives )
            // InternalSocialRequest.g:567:4: rule__JoinType__Alternatives
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
    // InternalSocialRequest.g:575:1: rule__TypeReference__Alternatives : ( ( ruleEntityTypeReference ) | ( ruleDataTypeReference ) );
    public final void rule__TypeReference__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:579:1: ( ( ruleEntityTypeReference ) | ( ruleDataTypeReference ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_ID) ) {
                alt1=1;
            }
            else if ( ((LA1_0>=26 && LA1_0<=33)) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalSocialRequest.g:580:2: ( ruleEntityTypeReference )
                    {
                    // InternalSocialRequest.g:580:2: ( ruleEntityTypeReference )
                    // InternalSocialRequest.g:581:3: ruleEntityTypeReference
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
                    // InternalSocialRequest.g:586:2: ( ruleDataTypeReference )
                    {
                    // InternalSocialRequest.g:586:2: ( ruleDataTypeReference )
                    // InternalSocialRequest.g:587:3: ruleDataTypeReference
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
    // InternalSocialRequest.g:596:1: rule__Modifier__Alternatives : ( ( ( rule__Modifier__IsLOBAssignment_0 ) ) | ( ( rule__Modifier__IsTransientAssignment_1 ) ) | ( ( rule__Modifier__Group_2__0 ) ) );
    public final void rule__Modifier__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:600:1: ( ( ( rule__Modifier__IsLOBAssignment_0 ) ) | ( ( rule__Modifier__IsTransientAssignment_1 ) ) | ( ( rule__Modifier__Group_2__0 ) ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 61:
                {
                alt2=1;
                }
                break;
            case 62:
                {
                alt2=2;
                }
                break;
            case 63:
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
                    // InternalSocialRequest.g:601:2: ( ( rule__Modifier__IsLOBAssignment_0 ) )
                    {
                    // InternalSocialRequest.g:601:2: ( ( rule__Modifier__IsLOBAssignment_0 ) )
                    // InternalSocialRequest.g:602:3: ( rule__Modifier__IsLOBAssignment_0 )
                    {
                     before(grammarAccess.getModifierAccess().getIsLOBAssignment_0()); 
                    // InternalSocialRequest.g:603:3: ( rule__Modifier__IsLOBAssignment_0 )
                    // InternalSocialRequest.g:603:4: rule__Modifier__IsLOBAssignment_0
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
                    // InternalSocialRequest.g:607:2: ( ( rule__Modifier__IsTransientAssignment_1 ) )
                    {
                    // InternalSocialRequest.g:607:2: ( ( rule__Modifier__IsTransientAssignment_1 ) )
                    // InternalSocialRequest.g:608:3: ( rule__Modifier__IsTransientAssignment_1 )
                    {
                     before(grammarAccess.getModifierAccess().getIsTransientAssignment_1()); 
                    // InternalSocialRequest.g:609:3: ( rule__Modifier__IsTransientAssignment_1 )
                    // InternalSocialRequest.g:609:4: rule__Modifier__IsTransientAssignment_1
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
                    // InternalSocialRequest.g:613:2: ( ( rule__Modifier__Group_2__0 ) )
                    {
                    // InternalSocialRequest.g:613:2: ( ( rule__Modifier__Group_2__0 ) )
                    // InternalSocialRequest.g:614:3: ( rule__Modifier__Group_2__0 )
                    {
                     before(grammarAccess.getModifierAccess().getGroup_2()); 
                    // InternalSocialRequest.g:615:3: ( rule__Modifier__Group_2__0 )
                    // InternalSocialRequest.g:615:4: rule__Modifier__Group_2__0
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
    // InternalSocialRequest.g:623:1: rule__Validation__Alternatives : ( ( ( rule__Validation__Group_0__0 ) ) | ( ( rule__Validation__Group_1__0 ) ) | ( ( rule__Validation__Group_2__0 ) ) | ( ( rule__Validation__ValidatorAssignment_3 ) ) );
    public final void rule__Validation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:627:1: ( ( ( rule__Validation__Group_0__0 ) ) | ( ( rule__Validation__Group_1__0 ) ) | ( ( rule__Validation__Group_2__0 ) ) | ( ( rule__Validation__ValidatorAssignment_3 ) ) )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 48:
                {
                alt3=1;
                }
                break;
            case 49:
                {
                alt3=2;
                }
                break;
            case 50:
                {
                alt3=3;
                }
                break;
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
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
                    // InternalSocialRequest.g:628:2: ( ( rule__Validation__Group_0__0 ) )
                    {
                    // InternalSocialRequest.g:628:2: ( ( rule__Validation__Group_0__0 ) )
                    // InternalSocialRequest.g:629:3: ( rule__Validation__Group_0__0 )
                    {
                     before(grammarAccess.getValidationAccess().getGroup_0()); 
                    // InternalSocialRequest.g:630:3: ( rule__Validation__Group_0__0 )
                    // InternalSocialRequest.g:630:4: rule__Validation__Group_0__0
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
                    // InternalSocialRequest.g:634:2: ( ( rule__Validation__Group_1__0 ) )
                    {
                    // InternalSocialRequest.g:634:2: ( ( rule__Validation__Group_1__0 ) )
                    // InternalSocialRequest.g:635:3: ( rule__Validation__Group_1__0 )
                    {
                     before(grammarAccess.getValidationAccess().getGroup_1()); 
                    // InternalSocialRequest.g:636:3: ( rule__Validation__Group_1__0 )
                    // InternalSocialRequest.g:636:4: rule__Validation__Group_1__0
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
                    // InternalSocialRequest.g:640:2: ( ( rule__Validation__Group_2__0 ) )
                    {
                    // InternalSocialRequest.g:640:2: ( ( rule__Validation__Group_2__0 ) )
                    // InternalSocialRequest.g:641:3: ( rule__Validation__Group_2__0 )
                    {
                     before(grammarAccess.getValidationAccess().getGroup_2()); 
                    // InternalSocialRequest.g:642:3: ( rule__Validation__Group_2__0 )
                    // InternalSocialRequest.g:642:4: rule__Validation__Group_2__0
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
                    // InternalSocialRequest.g:646:2: ( ( rule__Validation__ValidatorAssignment_3 ) )
                    {
                    // InternalSocialRequest.g:646:2: ( ( rule__Validation__ValidatorAssignment_3 ) )
                    // InternalSocialRequest.g:647:3: ( rule__Validation__ValidatorAssignment_3 )
                    {
                     before(grammarAccess.getValidationAccess().getValidatorAssignment_3()); 
                    // InternalSocialRequest.g:648:3: ( rule__Validation__ValidatorAssignment_3 )
                    // InternalSocialRequest.g:648:4: rule__Validation__ValidatorAssignment_3
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


    // $ANTLR start "rule__BASICVALIDATION__Alternatives"
    // InternalSocialRequest.g:656:1: rule__BASICVALIDATION__Alternatives : ( ( 'NotNull' ) | ( 'NotBlank' ) | ( 'Past' ) | ( 'Unique' ) | ( 'Email' ) );
    public final void rule__BASICVALIDATION__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:660:1: ( ( 'NotNull' ) | ( 'NotBlank' ) | ( 'Past' ) | ( 'Unique' ) | ( 'Email' ) )
            int alt4=5;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt4=1;
                }
                break;
            case 14:
                {
                alt4=2;
                }
                break;
            case 15:
                {
                alt4=3;
                }
                break;
            case 16:
                {
                alt4=4;
                }
                break;
            case 17:
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
                    // InternalSocialRequest.g:661:2: ( 'NotNull' )
                    {
                    // InternalSocialRequest.g:661:2: ( 'NotNull' )
                    // InternalSocialRequest.g:662:3: 'NotNull'
                    {
                     before(grammarAccess.getBASICVALIDATIONAccess().getNotNullKeyword_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getBASICVALIDATIONAccess().getNotNullKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSocialRequest.g:667:2: ( 'NotBlank' )
                    {
                    // InternalSocialRequest.g:667:2: ( 'NotBlank' )
                    // InternalSocialRequest.g:668:3: 'NotBlank'
                    {
                     before(grammarAccess.getBASICVALIDATIONAccess().getNotBlankKeyword_1()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getBASICVALIDATIONAccess().getNotBlankKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSocialRequest.g:673:2: ( 'Past' )
                    {
                    // InternalSocialRequest.g:673:2: ( 'Past' )
                    // InternalSocialRequest.g:674:3: 'Past'
                    {
                     before(grammarAccess.getBASICVALIDATIONAccess().getPastKeyword_2()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getBASICVALIDATIONAccess().getPastKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalSocialRequest.g:679:2: ( 'Unique' )
                    {
                    // InternalSocialRequest.g:679:2: ( 'Unique' )
                    // InternalSocialRequest.g:680:3: 'Unique'
                    {
                     before(grammarAccess.getBASICVALIDATIONAccess().getUniqueKeyword_3()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getBASICVALIDATIONAccess().getUniqueKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalSocialRequest.g:685:2: ( 'Email' )
                    {
                    // InternalSocialRequest.g:685:2: ( 'Email' )
                    // InternalSocialRequest.g:686:3: 'Email'
                    {
                     before(grammarAccess.getBASICVALIDATIONAccess().getEmailKeyword_4()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getBASICVALIDATIONAccess().getEmailKeyword_4()); 

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
    // $ANTLR end "rule__BASICVALIDATION__Alternatives"


    // $ANTLR start "rule__ASSOCIATION__Alternatives"
    // InternalSocialRequest.g:695:1: rule__ASSOCIATION__Alternatives : ( ( 'OneToMany' ) | ( 'ManyToOne' ) | ( 'OneToOne' ) | ( 'ManyToMany' ) );
    public final void rule__ASSOCIATION__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:699:1: ( ( 'OneToMany' ) | ( 'ManyToOne' ) | ( 'OneToOne' ) | ( 'ManyToMany' ) )
            int alt5=4;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt5=1;
                }
                break;
            case 19:
                {
                alt5=2;
                }
                break;
            case 20:
                {
                alt5=3;
                }
                break;
            case 21:
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
                    // InternalSocialRequest.g:700:2: ( 'OneToMany' )
                    {
                    // InternalSocialRequest.g:700:2: ( 'OneToMany' )
                    // InternalSocialRequest.g:701:3: 'OneToMany'
                    {
                     before(grammarAccess.getASSOCIATIONAccess().getOneToManyKeyword_0()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getASSOCIATIONAccess().getOneToManyKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSocialRequest.g:706:2: ( 'ManyToOne' )
                    {
                    // InternalSocialRequest.g:706:2: ( 'ManyToOne' )
                    // InternalSocialRequest.g:707:3: 'ManyToOne'
                    {
                     before(grammarAccess.getASSOCIATIONAccess().getManyToOneKeyword_1()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getASSOCIATIONAccess().getManyToOneKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSocialRequest.g:712:2: ( 'OneToOne' )
                    {
                    // InternalSocialRequest.g:712:2: ( 'OneToOne' )
                    // InternalSocialRequest.g:713:3: 'OneToOne'
                    {
                     before(grammarAccess.getASSOCIATIONAccess().getOneToOneKeyword_2()); 
                    match(input,20,FOLLOW_2); 
                     after(grammarAccess.getASSOCIATIONAccess().getOneToOneKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalSocialRequest.g:718:2: ( 'ManyToMany' )
                    {
                    // InternalSocialRequest.g:718:2: ( 'ManyToMany' )
                    // InternalSocialRequest.g:719:3: 'ManyToMany'
                    {
                     before(grammarAccess.getASSOCIATIONAccess().getManyToManyKeyword_3()); 
                    match(input,21,FOLLOW_2); 
                     after(grammarAccess.getASSOCIATIONAccess().getManyToManyKeyword_3()); 

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
    // $ANTLR end "rule__ASSOCIATION__Alternatives"


    // $ANTLR start "rule__GenerationType__Alternatives"
    // InternalSocialRequest.g:728:1: rule__GenerationType__Alternatives : ( ( ( 'AUTO' ) ) | ( ( 'TABLE' ) ) | ( ( 'IDENTITY' ) ) | ( ( 'SEQUENCE' ) ) );
    public final void rule__GenerationType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:732:1: ( ( ( 'AUTO' ) ) | ( ( 'TABLE' ) ) | ( ( 'IDENTITY' ) ) | ( ( 'SEQUENCE' ) ) )
            int alt6=4;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt6=1;
                }
                break;
            case 23:
                {
                alt6=2;
                }
                break;
            case 24:
                {
                alt6=3;
                }
                break;
            case 25:
                {
                alt6=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalSocialRequest.g:733:2: ( ( 'AUTO' ) )
                    {
                    // InternalSocialRequest.g:733:2: ( ( 'AUTO' ) )
                    // InternalSocialRequest.g:734:3: ( 'AUTO' )
                    {
                     before(grammarAccess.getGenerationTypeAccess().getAUTOEnumLiteralDeclaration_0()); 
                    // InternalSocialRequest.g:735:3: ( 'AUTO' )
                    // InternalSocialRequest.g:735:4: 'AUTO'
                    {
                    match(input,22,FOLLOW_2); 

                    }

                     after(grammarAccess.getGenerationTypeAccess().getAUTOEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSocialRequest.g:739:2: ( ( 'TABLE' ) )
                    {
                    // InternalSocialRequest.g:739:2: ( ( 'TABLE' ) )
                    // InternalSocialRequest.g:740:3: ( 'TABLE' )
                    {
                     before(grammarAccess.getGenerationTypeAccess().getTABLEEnumLiteralDeclaration_1()); 
                    // InternalSocialRequest.g:741:3: ( 'TABLE' )
                    // InternalSocialRequest.g:741:4: 'TABLE'
                    {
                    match(input,23,FOLLOW_2); 

                    }

                     after(grammarAccess.getGenerationTypeAccess().getTABLEEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSocialRequest.g:745:2: ( ( 'IDENTITY' ) )
                    {
                    // InternalSocialRequest.g:745:2: ( ( 'IDENTITY' ) )
                    // InternalSocialRequest.g:746:3: ( 'IDENTITY' )
                    {
                     before(grammarAccess.getGenerationTypeAccess().getIDENTITYEnumLiteralDeclaration_2()); 
                    // InternalSocialRequest.g:747:3: ( 'IDENTITY' )
                    // InternalSocialRequest.g:747:4: 'IDENTITY'
                    {
                    match(input,24,FOLLOW_2); 

                    }

                     after(grammarAccess.getGenerationTypeAccess().getIDENTITYEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalSocialRequest.g:751:2: ( ( 'SEQUENCE' ) )
                    {
                    // InternalSocialRequest.g:751:2: ( ( 'SEQUENCE' ) )
                    // InternalSocialRequest.g:752:3: ( 'SEQUENCE' )
                    {
                     before(grammarAccess.getGenerationTypeAccess().getSEQUENCEEnumLiteralDeclaration_3()); 
                    // InternalSocialRequest.g:753:3: ( 'SEQUENCE' )
                    // InternalSocialRequest.g:753:4: 'SEQUENCE'
                    {
                    match(input,25,FOLLOW_2); 

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


    // $ANTLR start "rule__DataType__Alternatives"
    // InternalSocialRequest.g:761:1: rule__DataType__Alternatives : ( ( ( 'String' ) ) | ( ( 'long' ) ) | ( ( 'float' ) ) | ( ( 'double' ) ) | ( ( 'char' ) ) | ( ( 'int' ) ) | ( ( 'boolean' ) ) | ( ( 'Date' ) ) );
    public final void rule__DataType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:765:1: ( ( ( 'String' ) ) | ( ( 'long' ) ) | ( ( 'float' ) ) | ( ( 'double' ) ) | ( ( 'char' ) ) | ( ( 'int' ) ) | ( ( 'boolean' ) ) | ( ( 'Date' ) ) )
            int alt7=8;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt7=1;
                }
                break;
            case 27:
                {
                alt7=2;
                }
                break;
            case 28:
                {
                alt7=3;
                }
                break;
            case 29:
                {
                alt7=4;
                }
                break;
            case 30:
                {
                alt7=5;
                }
                break;
            case 31:
                {
                alt7=6;
                }
                break;
            case 32:
                {
                alt7=7;
                }
                break;
            case 33:
                {
                alt7=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalSocialRequest.g:766:2: ( ( 'String' ) )
                    {
                    // InternalSocialRequest.g:766:2: ( ( 'String' ) )
                    // InternalSocialRequest.g:767:3: ( 'String' )
                    {
                     before(grammarAccess.getDataTypeAccess().getSTRINGEnumLiteralDeclaration_0()); 
                    // InternalSocialRequest.g:768:3: ( 'String' )
                    // InternalSocialRequest.g:768:4: 'String'
                    {
                    match(input,26,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataTypeAccess().getSTRINGEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSocialRequest.g:772:2: ( ( 'long' ) )
                    {
                    // InternalSocialRequest.g:772:2: ( ( 'long' ) )
                    // InternalSocialRequest.g:773:3: ( 'long' )
                    {
                     before(grammarAccess.getDataTypeAccess().getLONGEnumLiteralDeclaration_1()); 
                    // InternalSocialRequest.g:774:3: ( 'long' )
                    // InternalSocialRequest.g:774:4: 'long'
                    {
                    match(input,27,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataTypeAccess().getLONGEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSocialRequest.g:778:2: ( ( 'float' ) )
                    {
                    // InternalSocialRequest.g:778:2: ( ( 'float' ) )
                    // InternalSocialRequest.g:779:3: ( 'float' )
                    {
                     before(grammarAccess.getDataTypeAccess().getFLOATEnumLiteralDeclaration_2()); 
                    // InternalSocialRequest.g:780:3: ( 'float' )
                    // InternalSocialRequest.g:780:4: 'float'
                    {
                    match(input,28,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataTypeAccess().getFLOATEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalSocialRequest.g:784:2: ( ( 'double' ) )
                    {
                    // InternalSocialRequest.g:784:2: ( ( 'double' ) )
                    // InternalSocialRequest.g:785:3: ( 'double' )
                    {
                     before(grammarAccess.getDataTypeAccess().getDOUBLEEnumLiteralDeclaration_3()); 
                    // InternalSocialRequest.g:786:3: ( 'double' )
                    // InternalSocialRequest.g:786:4: 'double'
                    {
                    match(input,29,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataTypeAccess().getDOUBLEEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalSocialRequest.g:790:2: ( ( 'char' ) )
                    {
                    // InternalSocialRequest.g:790:2: ( ( 'char' ) )
                    // InternalSocialRequest.g:791:3: ( 'char' )
                    {
                     before(grammarAccess.getDataTypeAccess().getCHAREnumLiteralDeclaration_4()); 
                    // InternalSocialRequest.g:792:3: ( 'char' )
                    // InternalSocialRequest.g:792:4: 'char'
                    {
                    match(input,30,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataTypeAccess().getCHAREnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalSocialRequest.g:796:2: ( ( 'int' ) )
                    {
                    // InternalSocialRequest.g:796:2: ( ( 'int' ) )
                    // InternalSocialRequest.g:797:3: ( 'int' )
                    {
                     before(grammarAccess.getDataTypeAccess().getINTEnumLiteralDeclaration_5()); 
                    // InternalSocialRequest.g:798:3: ( 'int' )
                    // InternalSocialRequest.g:798:4: 'int'
                    {
                    match(input,31,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataTypeAccess().getINTEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalSocialRequest.g:802:2: ( ( 'boolean' ) )
                    {
                    // InternalSocialRequest.g:802:2: ( ( 'boolean' ) )
                    // InternalSocialRequest.g:803:3: ( 'boolean' )
                    {
                     before(grammarAccess.getDataTypeAccess().getBOOLEANEnumLiteralDeclaration_6()); 
                    // InternalSocialRequest.g:804:3: ( 'boolean' )
                    // InternalSocialRequest.g:804:4: 'boolean'
                    {
                    match(input,32,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataTypeAccess().getBOOLEANEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalSocialRequest.g:808:2: ( ( 'Date' ) )
                    {
                    // InternalSocialRequest.g:808:2: ( ( 'Date' ) )
                    // InternalSocialRequest.g:809:3: ( 'Date' )
                    {
                     before(grammarAccess.getDataTypeAccess().getDATEEnumLiteralDeclaration_7()); 
                    // InternalSocialRequest.g:810:3: ( 'Date' )
                    // InternalSocialRequest.g:810:4: 'Date'
                    {
                    match(input,33,FOLLOW_2); 

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
    // InternalSocialRequest.g:818:1: rule__JoinType__Alternatives : ( ( ( 'LEFT JOIN' ) ) | ( ( 'LEFT OUTER JOIN' ) ) | ( ( 'CROSS JOIN' ) ) | ( ( 'JOIN' ) ) );
    public final void rule__JoinType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:822:1: ( ( ( 'LEFT JOIN' ) ) | ( ( 'LEFT OUTER JOIN' ) ) | ( ( 'CROSS JOIN' ) ) | ( ( 'JOIN' ) ) )
            int alt8=4;
            switch ( input.LA(1) ) {
            case 34:
                {
                alt8=1;
                }
                break;
            case 35:
                {
                alt8=2;
                }
                break;
            case 36:
                {
                alt8=3;
                }
                break;
            case 37:
                {
                alt8=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalSocialRequest.g:823:2: ( ( 'LEFT JOIN' ) )
                    {
                    // InternalSocialRequest.g:823:2: ( ( 'LEFT JOIN' ) )
                    // InternalSocialRequest.g:824:3: ( 'LEFT JOIN' )
                    {
                     before(grammarAccess.getJoinTypeAccess().getLEFT_JOINEnumLiteralDeclaration_0()); 
                    // InternalSocialRequest.g:825:3: ( 'LEFT JOIN' )
                    // InternalSocialRequest.g:825:4: 'LEFT JOIN'
                    {
                    match(input,34,FOLLOW_2); 

                    }

                     after(grammarAccess.getJoinTypeAccess().getLEFT_JOINEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSocialRequest.g:829:2: ( ( 'LEFT OUTER JOIN' ) )
                    {
                    // InternalSocialRequest.g:829:2: ( ( 'LEFT OUTER JOIN' ) )
                    // InternalSocialRequest.g:830:3: ( 'LEFT OUTER JOIN' )
                    {
                     before(grammarAccess.getJoinTypeAccess().getLEFT_OUTER_JOINEnumLiteralDeclaration_1()); 
                    // InternalSocialRequest.g:831:3: ( 'LEFT OUTER JOIN' )
                    // InternalSocialRequest.g:831:4: 'LEFT OUTER JOIN'
                    {
                    match(input,35,FOLLOW_2); 

                    }

                     after(grammarAccess.getJoinTypeAccess().getLEFT_OUTER_JOINEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSocialRequest.g:835:2: ( ( 'CROSS JOIN' ) )
                    {
                    // InternalSocialRequest.g:835:2: ( ( 'CROSS JOIN' ) )
                    // InternalSocialRequest.g:836:3: ( 'CROSS JOIN' )
                    {
                     before(grammarAccess.getJoinTypeAccess().getCROSS_JOINEnumLiteralDeclaration_2()); 
                    // InternalSocialRequest.g:837:3: ( 'CROSS JOIN' )
                    // InternalSocialRequest.g:837:4: 'CROSS JOIN'
                    {
                    match(input,36,FOLLOW_2); 

                    }

                     after(grammarAccess.getJoinTypeAccess().getCROSS_JOINEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalSocialRequest.g:841:2: ( ( 'JOIN' ) )
                    {
                    // InternalSocialRequest.g:841:2: ( ( 'JOIN' ) )
                    // InternalSocialRequest.g:842:3: ( 'JOIN' )
                    {
                     before(grammarAccess.getJoinTypeAccess().getJOINEnumLiteralDeclaration_3()); 
                    // InternalSocialRequest.g:843:3: ( 'JOIN' )
                    // InternalSocialRequest.g:843:4: 'JOIN'
                    {
                    match(input,37,FOLLOW_2); 

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
    // InternalSocialRequest.g:851:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:855:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalSocialRequest.g:856:2: rule__Model__Group__0__Impl rule__Model__Group__1
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
    // InternalSocialRequest.g:863:1: rule__Model__Group__0__Impl : ( ( rule__Model__EntitiesAssignment_0 )* ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:867:1: ( ( ( rule__Model__EntitiesAssignment_0 )* ) )
            // InternalSocialRequest.g:868:1: ( ( rule__Model__EntitiesAssignment_0 )* )
            {
            // InternalSocialRequest.g:868:1: ( ( rule__Model__EntitiesAssignment_0 )* )
            // InternalSocialRequest.g:869:2: ( rule__Model__EntitiesAssignment_0 )*
            {
             before(grammarAccess.getModelAccess().getEntitiesAssignment_0()); 
            // InternalSocialRequest.g:870:2: ( rule__Model__EntitiesAssignment_0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==38) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalSocialRequest.g:870:3: rule__Model__EntitiesAssignment_0
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Model__EntitiesAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
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
    // InternalSocialRequest.g:878:1: rule__Model__Group__1 : rule__Model__Group__1__Impl ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:882:1: ( rule__Model__Group__1__Impl )
            // InternalSocialRequest.g:883:2: rule__Model__Group__1__Impl
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
    // InternalSocialRequest.g:889:1: rule__Model__Group__1__Impl : ( ( rule__Model__RepositoriesAssignment_1 )* ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:893:1: ( ( ( rule__Model__RepositoriesAssignment_1 )* ) )
            // InternalSocialRequest.g:894:1: ( ( rule__Model__RepositoriesAssignment_1 )* )
            {
            // InternalSocialRequest.g:894:1: ( ( rule__Model__RepositoriesAssignment_1 )* )
            // InternalSocialRequest.g:895:2: ( rule__Model__RepositoriesAssignment_1 )*
            {
             before(grammarAccess.getModelAccess().getRepositoriesAssignment_1()); 
            // InternalSocialRequest.g:896:2: ( rule__Model__RepositoriesAssignment_1 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==51) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalSocialRequest.g:896:3: rule__Model__RepositoriesAssignment_1
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__Model__RepositoriesAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
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
    // InternalSocialRequest.g:905:1: rule__Entity__Group__0 : rule__Entity__Group__0__Impl rule__Entity__Group__1 ;
    public final void rule__Entity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:909:1: ( rule__Entity__Group__0__Impl rule__Entity__Group__1 )
            // InternalSocialRequest.g:910:2: rule__Entity__Group__0__Impl rule__Entity__Group__1
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
    // InternalSocialRequest.g:917:1: rule__Entity__Group__0__Impl : ( 'Entity' ) ;
    public final void rule__Entity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:921:1: ( ( 'Entity' ) )
            // InternalSocialRequest.g:922:1: ( 'Entity' )
            {
            // InternalSocialRequest.g:922:1: ( 'Entity' )
            // InternalSocialRequest.g:923:2: 'Entity'
            {
             before(grammarAccess.getEntityAccess().getEntityKeyword_0()); 
            match(input,38,FOLLOW_2); 
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
    // InternalSocialRequest.g:932:1: rule__Entity__Group__1 : rule__Entity__Group__1__Impl rule__Entity__Group__2 ;
    public final void rule__Entity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:936:1: ( rule__Entity__Group__1__Impl rule__Entity__Group__2 )
            // InternalSocialRequest.g:937:2: rule__Entity__Group__1__Impl rule__Entity__Group__2
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
    // InternalSocialRequest.g:944:1: rule__Entity__Group__1__Impl : ( ( rule__Entity__NameAssignment_1 ) ) ;
    public final void rule__Entity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:948:1: ( ( ( rule__Entity__NameAssignment_1 ) ) )
            // InternalSocialRequest.g:949:1: ( ( rule__Entity__NameAssignment_1 ) )
            {
            // InternalSocialRequest.g:949:1: ( ( rule__Entity__NameAssignment_1 ) )
            // InternalSocialRequest.g:950:2: ( rule__Entity__NameAssignment_1 )
            {
             before(grammarAccess.getEntityAccess().getNameAssignment_1()); 
            // InternalSocialRequest.g:951:2: ( rule__Entity__NameAssignment_1 )
            // InternalSocialRequest.g:951:3: rule__Entity__NameAssignment_1
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
    // InternalSocialRequest.g:959:1: rule__Entity__Group__2 : rule__Entity__Group__2__Impl rule__Entity__Group__3 ;
    public final void rule__Entity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:963:1: ( rule__Entity__Group__2__Impl rule__Entity__Group__3 )
            // InternalSocialRequest.g:964:2: rule__Entity__Group__2__Impl rule__Entity__Group__3
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
    // InternalSocialRequest.g:971:1: rule__Entity__Group__2__Impl : ( ( rule__Entity__Group_2__0 )? ) ;
    public final void rule__Entity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:975:1: ( ( ( rule__Entity__Group_2__0 )? ) )
            // InternalSocialRequest.g:976:1: ( ( rule__Entity__Group_2__0 )? )
            {
            // InternalSocialRequest.g:976:1: ( ( rule__Entity__Group_2__0 )? )
            // InternalSocialRequest.g:977:2: ( rule__Entity__Group_2__0 )?
            {
             before(grammarAccess.getEntityAccess().getGroup_2()); 
            // InternalSocialRequest.g:978:2: ( rule__Entity__Group_2__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==60) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalSocialRequest.g:978:3: rule__Entity__Group_2__0
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
    // InternalSocialRequest.g:986:1: rule__Entity__Group__3 : rule__Entity__Group__3__Impl rule__Entity__Group__4 ;
    public final void rule__Entity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:990:1: ( rule__Entity__Group__3__Impl rule__Entity__Group__4 )
            // InternalSocialRequest.g:991:2: rule__Entity__Group__3__Impl rule__Entity__Group__4
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
    // InternalSocialRequest.g:998:1: rule__Entity__Group__3__Impl : ( '{' ) ;
    public final void rule__Entity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1002:1: ( ( '{' ) )
            // InternalSocialRequest.g:1003:1: ( '{' )
            {
            // InternalSocialRequest.g:1003:1: ( '{' )
            // InternalSocialRequest.g:1004:2: '{'
            {
             before(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,39,FOLLOW_2); 
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
    // InternalSocialRequest.g:1013:1: rule__Entity__Group__4 : rule__Entity__Group__4__Impl rule__Entity__Group__5 ;
    public final void rule__Entity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1017:1: ( rule__Entity__Group__4__Impl rule__Entity__Group__5 )
            // InternalSocialRequest.g:1018:2: rule__Entity__Group__4__Impl rule__Entity__Group__5
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
    // InternalSocialRequest.g:1025:1: rule__Entity__Group__4__Impl : ( ( ( rule__Entity__AttributesAssignment_4 ) ) ( ( rule__Entity__AttributesAssignment_4 )* ) ) ;
    public final void rule__Entity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1029:1: ( ( ( ( rule__Entity__AttributesAssignment_4 ) ) ( ( rule__Entity__AttributesAssignment_4 )* ) ) )
            // InternalSocialRequest.g:1030:1: ( ( ( rule__Entity__AttributesAssignment_4 ) ) ( ( rule__Entity__AttributesAssignment_4 )* ) )
            {
            // InternalSocialRequest.g:1030:1: ( ( ( rule__Entity__AttributesAssignment_4 ) ) ( ( rule__Entity__AttributesAssignment_4 )* ) )
            // InternalSocialRequest.g:1031:2: ( ( rule__Entity__AttributesAssignment_4 ) ) ( ( rule__Entity__AttributesAssignment_4 )* )
            {
            // InternalSocialRequest.g:1031:2: ( ( rule__Entity__AttributesAssignment_4 ) )
            // InternalSocialRequest.g:1032:3: ( rule__Entity__AttributesAssignment_4 )
            {
             before(grammarAccess.getEntityAccess().getAttributesAssignment_4()); 
            // InternalSocialRequest.g:1033:3: ( rule__Entity__AttributesAssignment_4 )
            // InternalSocialRequest.g:1033:4: rule__Entity__AttributesAssignment_4
            {
            pushFollow(FOLLOW_10);
            rule__Entity__AttributesAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getAttributesAssignment_4()); 

            }

            // InternalSocialRequest.g:1036:2: ( ( rule__Entity__AttributesAssignment_4 )* )
            // InternalSocialRequest.g:1037:3: ( rule__Entity__AttributesAssignment_4 )*
            {
             before(grammarAccess.getEntityAccess().getAttributesAssignment_4()); 
            // InternalSocialRequest.g:1038:3: ( rule__Entity__AttributesAssignment_4 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_ID||(LA12_0>=18 && LA12_0<=21)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalSocialRequest.g:1038:4: rule__Entity__AttributesAssignment_4
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Entity__AttributesAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
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
    // InternalSocialRequest.g:1047:1: rule__Entity__Group__5 : rule__Entity__Group__5__Impl ;
    public final void rule__Entity__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1051:1: ( rule__Entity__Group__5__Impl )
            // InternalSocialRequest.g:1052:2: rule__Entity__Group__5__Impl
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
    // InternalSocialRequest.g:1058:1: rule__Entity__Group__5__Impl : ( '}' ) ;
    public final void rule__Entity__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1062:1: ( ( '}' ) )
            // InternalSocialRequest.g:1063:1: ( '}' )
            {
            // InternalSocialRequest.g:1063:1: ( '}' )
            // InternalSocialRequest.g:1064:2: '}'
            {
             before(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_5()); 
            match(input,40,FOLLOW_2); 
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
    // InternalSocialRequest.g:1074:1: rule__Entity__Group_2__0 : rule__Entity__Group_2__0__Impl rule__Entity__Group_2__1 ;
    public final void rule__Entity__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1078:1: ( rule__Entity__Group_2__0__Impl rule__Entity__Group_2__1 )
            // InternalSocialRequest.g:1079:2: rule__Entity__Group_2__0__Impl rule__Entity__Group_2__1
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
    // InternalSocialRequest.g:1086:1: rule__Entity__Group_2__0__Impl : ( ( rule__Entity__HasUserDetailsAssignment_2_0 ) ) ;
    public final void rule__Entity__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1090:1: ( ( ( rule__Entity__HasUserDetailsAssignment_2_0 ) ) )
            // InternalSocialRequest.g:1091:1: ( ( rule__Entity__HasUserDetailsAssignment_2_0 ) )
            {
            // InternalSocialRequest.g:1091:1: ( ( rule__Entity__HasUserDetailsAssignment_2_0 ) )
            // InternalSocialRequest.g:1092:2: ( rule__Entity__HasUserDetailsAssignment_2_0 )
            {
             before(grammarAccess.getEntityAccess().getHasUserDetailsAssignment_2_0()); 
            // InternalSocialRequest.g:1093:2: ( rule__Entity__HasUserDetailsAssignment_2_0 )
            // InternalSocialRequest.g:1093:3: rule__Entity__HasUserDetailsAssignment_2_0
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
    // InternalSocialRequest.g:1101:1: rule__Entity__Group_2__1 : rule__Entity__Group_2__1__Impl ;
    public final void rule__Entity__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1105:1: ( rule__Entity__Group_2__1__Impl )
            // InternalSocialRequest.g:1106:2: rule__Entity__Group_2__1__Impl
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
    // InternalSocialRequest.g:1112:1: rule__Entity__Group_2__1__Impl : ( 'UserDetails' ) ;
    public final void rule__Entity__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1116:1: ( ( 'UserDetails' ) )
            // InternalSocialRequest.g:1117:1: ( 'UserDetails' )
            {
            // InternalSocialRequest.g:1117:1: ( 'UserDetails' )
            // InternalSocialRequest.g:1118:2: 'UserDetails'
            {
             before(grammarAccess.getEntityAccess().getUserDetailsKeyword_2_1()); 
            match(input,41,FOLLOW_2); 
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
    // InternalSocialRequest.g:1128:1: rule__Attribute__Group__0 : rule__Attribute__Group__0__Impl rule__Attribute__Group__1 ;
    public final void rule__Attribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1132:1: ( rule__Attribute__Group__0__Impl rule__Attribute__Group__1 )
            // InternalSocialRequest.g:1133:2: rule__Attribute__Group__0__Impl rule__Attribute__Group__1
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
    // InternalSocialRequest.g:1140:1: rule__Attribute__Group__0__Impl : ( ( rule__Attribute__AssociationAssignment_0 )? ) ;
    public final void rule__Attribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1144:1: ( ( ( rule__Attribute__AssociationAssignment_0 )? ) )
            // InternalSocialRequest.g:1145:1: ( ( rule__Attribute__AssociationAssignment_0 )? )
            {
            // InternalSocialRequest.g:1145:1: ( ( rule__Attribute__AssociationAssignment_0 )? )
            // InternalSocialRequest.g:1146:2: ( rule__Attribute__AssociationAssignment_0 )?
            {
             before(grammarAccess.getAttributeAccess().getAssociationAssignment_0()); 
            // InternalSocialRequest.g:1147:2: ( rule__Attribute__AssociationAssignment_0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=18 && LA13_0<=21)) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalSocialRequest.g:1147:3: rule__Attribute__AssociationAssignment_0
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
    // InternalSocialRequest.g:1155:1: rule__Attribute__Group__1 : rule__Attribute__Group__1__Impl rule__Attribute__Group__2 ;
    public final void rule__Attribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1159:1: ( rule__Attribute__Group__1__Impl rule__Attribute__Group__2 )
            // InternalSocialRequest.g:1160:2: rule__Attribute__Group__1__Impl rule__Attribute__Group__2
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
    // InternalSocialRequest.g:1167:1: rule__Attribute__Group__1__Impl : ( ( rule__Attribute__NameAssignment_1 ) ) ;
    public final void rule__Attribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1171:1: ( ( ( rule__Attribute__NameAssignment_1 ) ) )
            // InternalSocialRequest.g:1172:1: ( ( rule__Attribute__NameAssignment_1 ) )
            {
            // InternalSocialRequest.g:1172:1: ( ( rule__Attribute__NameAssignment_1 ) )
            // InternalSocialRequest.g:1173:2: ( rule__Attribute__NameAssignment_1 )
            {
             before(grammarAccess.getAttributeAccess().getNameAssignment_1()); 
            // InternalSocialRequest.g:1174:2: ( rule__Attribute__NameAssignment_1 )
            // InternalSocialRequest.g:1174:3: rule__Attribute__NameAssignment_1
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
    // InternalSocialRequest.g:1182:1: rule__Attribute__Group__2 : rule__Attribute__Group__2__Impl rule__Attribute__Group__3 ;
    public final void rule__Attribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1186:1: ( rule__Attribute__Group__2__Impl rule__Attribute__Group__3 )
            // InternalSocialRequest.g:1187:2: rule__Attribute__Group__2__Impl rule__Attribute__Group__3
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
    // InternalSocialRequest.g:1194:1: rule__Attribute__Group__2__Impl : ( ':' ) ;
    public final void rule__Attribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1198:1: ( ( ':' ) )
            // InternalSocialRequest.g:1199:1: ( ':' )
            {
            // InternalSocialRequest.g:1199:1: ( ':' )
            // InternalSocialRequest.g:1200:2: ':'
            {
             before(grammarAccess.getAttributeAccess().getColonKeyword_2()); 
            match(input,42,FOLLOW_2); 
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
    // InternalSocialRequest.g:1209:1: rule__Attribute__Group__3 : rule__Attribute__Group__3__Impl rule__Attribute__Group__4 ;
    public final void rule__Attribute__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1213:1: ( rule__Attribute__Group__3__Impl rule__Attribute__Group__4 )
            // InternalSocialRequest.g:1214:2: rule__Attribute__Group__3__Impl rule__Attribute__Group__4
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
    // InternalSocialRequest.g:1221:1: rule__Attribute__Group__3__Impl : ( ( rule__Attribute__TypeRefAssignment_3 ) ) ;
    public final void rule__Attribute__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1225:1: ( ( ( rule__Attribute__TypeRefAssignment_3 ) ) )
            // InternalSocialRequest.g:1226:1: ( ( rule__Attribute__TypeRefAssignment_3 ) )
            {
            // InternalSocialRequest.g:1226:1: ( ( rule__Attribute__TypeRefAssignment_3 ) )
            // InternalSocialRequest.g:1227:2: ( rule__Attribute__TypeRefAssignment_3 )
            {
             before(grammarAccess.getAttributeAccess().getTypeRefAssignment_3()); 
            // InternalSocialRequest.g:1228:2: ( rule__Attribute__TypeRefAssignment_3 )
            // InternalSocialRequest.g:1228:3: rule__Attribute__TypeRefAssignment_3
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
    // InternalSocialRequest.g:1236:1: rule__Attribute__Group__4 : rule__Attribute__Group__4__Impl rule__Attribute__Group__5 ;
    public final void rule__Attribute__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1240:1: ( rule__Attribute__Group__4__Impl rule__Attribute__Group__5 )
            // InternalSocialRequest.g:1241:2: rule__Attribute__Group__4__Impl rule__Attribute__Group__5
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
    // InternalSocialRequest.g:1248:1: rule__Attribute__Group__4__Impl : ( ( rule__Attribute__ModifierAssignment_4 )? ) ;
    public final void rule__Attribute__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1252:1: ( ( ( rule__Attribute__ModifierAssignment_4 )? ) )
            // InternalSocialRequest.g:1253:1: ( ( rule__Attribute__ModifierAssignment_4 )? )
            {
            // InternalSocialRequest.g:1253:1: ( ( rule__Attribute__ModifierAssignment_4 )? )
            // InternalSocialRequest.g:1254:2: ( rule__Attribute__ModifierAssignment_4 )?
            {
             before(grammarAccess.getAttributeAccess().getModifierAssignment_4()); 
            // InternalSocialRequest.g:1255:2: ( rule__Attribute__ModifierAssignment_4 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>=61 && LA14_0<=63)) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalSocialRequest.g:1255:3: rule__Attribute__ModifierAssignment_4
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
    // InternalSocialRequest.g:1263:1: rule__Attribute__Group__5 : rule__Attribute__Group__5__Impl ;
    public final void rule__Attribute__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1267:1: ( rule__Attribute__Group__5__Impl )
            // InternalSocialRequest.g:1268:2: rule__Attribute__Group__5__Impl
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
    // InternalSocialRequest.g:1274:1: rule__Attribute__Group__5__Impl : ( ( rule__Attribute__Group_5__0 )? ) ;
    public final void rule__Attribute__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1278:1: ( ( ( rule__Attribute__Group_5__0 )? ) )
            // InternalSocialRequest.g:1279:1: ( ( rule__Attribute__Group_5__0 )? )
            {
            // InternalSocialRequest.g:1279:1: ( ( rule__Attribute__Group_5__0 )? )
            // InternalSocialRequest.g:1280:2: ( rule__Attribute__Group_5__0 )?
            {
             before(grammarAccess.getAttributeAccess().getGroup_5()); 
            // InternalSocialRequest.g:1281:2: ( rule__Attribute__Group_5__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==39) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalSocialRequest.g:1281:3: rule__Attribute__Group_5__0
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
    // InternalSocialRequest.g:1290:1: rule__Attribute__Group_5__0 : rule__Attribute__Group_5__0__Impl rule__Attribute__Group_5__1 ;
    public final void rule__Attribute__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1294:1: ( rule__Attribute__Group_5__0__Impl rule__Attribute__Group_5__1 )
            // InternalSocialRequest.g:1295:2: rule__Attribute__Group_5__0__Impl rule__Attribute__Group_5__1
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
    // InternalSocialRequest.g:1302:1: rule__Attribute__Group_5__0__Impl : ( '{' ) ;
    public final void rule__Attribute__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1306:1: ( ( '{' ) )
            // InternalSocialRequest.g:1307:1: ( '{' )
            {
            // InternalSocialRequest.g:1307:1: ( '{' )
            // InternalSocialRequest.g:1308:2: '{'
            {
             before(grammarAccess.getAttributeAccess().getLeftCurlyBracketKeyword_5_0()); 
            match(input,39,FOLLOW_2); 
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
    // InternalSocialRequest.g:1317:1: rule__Attribute__Group_5__1 : rule__Attribute__Group_5__1__Impl rule__Attribute__Group_5__2 ;
    public final void rule__Attribute__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1321:1: ( rule__Attribute__Group_5__1__Impl rule__Attribute__Group_5__2 )
            // InternalSocialRequest.g:1322:2: rule__Attribute__Group_5__1__Impl rule__Attribute__Group_5__2
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
    // InternalSocialRequest.g:1329:1: rule__Attribute__Group_5__1__Impl : ( ( rule__Attribute__UnorderedGroup_5_1 ) ) ;
    public final void rule__Attribute__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1333:1: ( ( ( rule__Attribute__UnorderedGroup_5_1 ) ) )
            // InternalSocialRequest.g:1334:1: ( ( rule__Attribute__UnorderedGroup_5_1 ) )
            {
            // InternalSocialRequest.g:1334:1: ( ( rule__Attribute__UnorderedGroup_5_1 ) )
            // InternalSocialRequest.g:1335:2: ( rule__Attribute__UnorderedGroup_5_1 )
            {
             before(grammarAccess.getAttributeAccess().getUnorderedGroup_5_1()); 
            // InternalSocialRequest.g:1336:2: ( rule__Attribute__UnorderedGroup_5_1 )
            // InternalSocialRequest.g:1336:3: rule__Attribute__UnorderedGroup_5_1
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
    // InternalSocialRequest.g:1344:1: rule__Attribute__Group_5__2 : rule__Attribute__Group_5__2__Impl ;
    public final void rule__Attribute__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1348:1: ( rule__Attribute__Group_5__2__Impl )
            // InternalSocialRequest.g:1349:2: rule__Attribute__Group_5__2__Impl
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
    // InternalSocialRequest.g:1355:1: rule__Attribute__Group_5__2__Impl : ( '}' ) ;
    public final void rule__Attribute__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1359:1: ( ( '}' ) )
            // InternalSocialRequest.g:1360:1: ( '}' )
            {
            // InternalSocialRequest.g:1360:1: ( '}' )
            // InternalSocialRequest.g:1361:2: '}'
            {
             before(grammarAccess.getAttributeAccess().getRightCurlyBracketKeyword_5_2()); 
            match(input,40,FOLLOW_2); 
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
    // InternalSocialRequest.g:1371:1: rule__Attribute__Group_5_1_0__0 : rule__Attribute__Group_5_1_0__0__Impl rule__Attribute__Group_5_1_0__1 ;
    public final void rule__Attribute__Group_5_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1375:1: ( rule__Attribute__Group_5_1_0__0__Impl rule__Attribute__Group_5_1_0__1 )
            // InternalSocialRequest.g:1376:2: rule__Attribute__Group_5_1_0__0__Impl rule__Attribute__Group_5_1_0__1
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
    // InternalSocialRequest.g:1383:1: rule__Attribute__Group_5_1_0__0__Impl : ( 'mappedBy:' ) ;
    public final void rule__Attribute__Group_5_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1387:1: ( ( 'mappedBy:' ) )
            // InternalSocialRequest.g:1388:1: ( 'mappedBy:' )
            {
            // InternalSocialRequest.g:1388:1: ( 'mappedBy:' )
            // InternalSocialRequest.g:1389:2: 'mappedBy:'
            {
             before(grammarAccess.getAttributeAccess().getMappedByKeyword_5_1_0_0()); 
            match(input,43,FOLLOW_2); 
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
    // InternalSocialRequest.g:1398:1: rule__Attribute__Group_5_1_0__1 : rule__Attribute__Group_5_1_0__1__Impl ;
    public final void rule__Attribute__Group_5_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1402:1: ( rule__Attribute__Group_5_1_0__1__Impl )
            // InternalSocialRequest.g:1403:2: rule__Attribute__Group_5_1_0__1__Impl
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
    // InternalSocialRequest.g:1409:1: rule__Attribute__Group_5_1_0__1__Impl : ( ( rule__Attribute__MappedByAssignment_5_1_0_1 ) ) ;
    public final void rule__Attribute__Group_5_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1413:1: ( ( ( rule__Attribute__MappedByAssignment_5_1_0_1 ) ) )
            // InternalSocialRequest.g:1414:1: ( ( rule__Attribute__MappedByAssignment_5_1_0_1 ) )
            {
            // InternalSocialRequest.g:1414:1: ( ( rule__Attribute__MappedByAssignment_5_1_0_1 ) )
            // InternalSocialRequest.g:1415:2: ( rule__Attribute__MappedByAssignment_5_1_0_1 )
            {
             before(grammarAccess.getAttributeAccess().getMappedByAssignment_5_1_0_1()); 
            // InternalSocialRequest.g:1416:2: ( rule__Attribute__MappedByAssignment_5_1_0_1 )
            // InternalSocialRequest.g:1416:3: rule__Attribute__MappedByAssignment_5_1_0_1
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
    // InternalSocialRequest.g:1425:1: rule__Attribute__Group_5_1_1__0 : rule__Attribute__Group_5_1_1__0__Impl rule__Attribute__Group_5_1_1__1 ;
    public final void rule__Attribute__Group_5_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1429:1: ( rule__Attribute__Group_5_1_1__0__Impl rule__Attribute__Group_5_1_1__1 )
            // InternalSocialRequest.g:1430:2: rule__Attribute__Group_5_1_1__0__Impl rule__Attribute__Group_5_1_1__1
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
    // InternalSocialRequest.g:1437:1: rule__Attribute__Group_5_1_1__0__Impl : ( 'fetch:' ) ;
    public final void rule__Attribute__Group_5_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1441:1: ( ( 'fetch:' ) )
            // InternalSocialRequest.g:1442:1: ( 'fetch:' )
            {
            // InternalSocialRequest.g:1442:1: ( 'fetch:' )
            // InternalSocialRequest.g:1443:2: 'fetch:'
            {
             before(grammarAccess.getAttributeAccess().getFetchKeyword_5_1_1_0()); 
            match(input,44,FOLLOW_2); 
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
    // InternalSocialRequest.g:1452:1: rule__Attribute__Group_5_1_1__1 : rule__Attribute__Group_5_1_1__1__Impl ;
    public final void rule__Attribute__Group_5_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1456:1: ( rule__Attribute__Group_5_1_1__1__Impl )
            // InternalSocialRequest.g:1457:2: rule__Attribute__Group_5_1_1__1__Impl
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
    // InternalSocialRequest.g:1463:1: rule__Attribute__Group_5_1_1__1__Impl : ( ( rule__Attribute__FetchTypeAssignment_5_1_1_1 ) ) ;
    public final void rule__Attribute__Group_5_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1467:1: ( ( ( rule__Attribute__FetchTypeAssignment_5_1_1_1 ) ) )
            // InternalSocialRequest.g:1468:1: ( ( rule__Attribute__FetchTypeAssignment_5_1_1_1 ) )
            {
            // InternalSocialRequest.g:1468:1: ( ( rule__Attribute__FetchTypeAssignment_5_1_1_1 ) )
            // InternalSocialRequest.g:1469:2: ( rule__Attribute__FetchTypeAssignment_5_1_1_1 )
            {
             before(grammarAccess.getAttributeAccess().getFetchTypeAssignment_5_1_1_1()); 
            // InternalSocialRequest.g:1470:2: ( rule__Attribute__FetchTypeAssignment_5_1_1_1 )
            // InternalSocialRequest.g:1470:3: rule__Attribute__FetchTypeAssignment_5_1_1_1
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
    // InternalSocialRequest.g:1479:1: rule__Attribute__Group_5_1_2__0 : rule__Attribute__Group_5_1_2__0__Impl rule__Attribute__Group_5_1_2__1 ;
    public final void rule__Attribute__Group_5_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1483:1: ( rule__Attribute__Group_5_1_2__0__Impl rule__Attribute__Group_5_1_2__1 )
            // InternalSocialRequest.g:1484:2: rule__Attribute__Group_5_1_2__0__Impl rule__Attribute__Group_5_1_2__1
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
    // InternalSocialRequest.g:1491:1: rule__Attribute__Group_5_1_2__0__Impl : ( 'validations' ) ;
    public final void rule__Attribute__Group_5_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1495:1: ( ( 'validations' ) )
            // InternalSocialRequest.g:1496:1: ( 'validations' )
            {
            // InternalSocialRequest.g:1496:1: ( 'validations' )
            // InternalSocialRequest.g:1497:2: 'validations'
            {
             before(grammarAccess.getAttributeAccess().getValidationsKeyword_5_1_2_0()); 
            match(input,45,FOLLOW_2); 
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
    // InternalSocialRequest.g:1506:1: rule__Attribute__Group_5_1_2__1 : rule__Attribute__Group_5_1_2__1__Impl rule__Attribute__Group_5_1_2__2 ;
    public final void rule__Attribute__Group_5_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1510:1: ( rule__Attribute__Group_5_1_2__1__Impl rule__Attribute__Group_5_1_2__2 )
            // InternalSocialRequest.g:1511:2: rule__Attribute__Group_5_1_2__1__Impl rule__Attribute__Group_5_1_2__2
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
    // InternalSocialRequest.g:1518:1: rule__Attribute__Group_5_1_2__1__Impl : ( '{' ) ;
    public final void rule__Attribute__Group_5_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1522:1: ( ( '{' ) )
            // InternalSocialRequest.g:1523:1: ( '{' )
            {
            // InternalSocialRequest.g:1523:1: ( '{' )
            // InternalSocialRequest.g:1524:2: '{'
            {
             before(grammarAccess.getAttributeAccess().getLeftCurlyBracketKeyword_5_1_2_1()); 
            match(input,39,FOLLOW_2); 
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
    // InternalSocialRequest.g:1533:1: rule__Attribute__Group_5_1_2__2 : rule__Attribute__Group_5_1_2__2__Impl rule__Attribute__Group_5_1_2__3 ;
    public final void rule__Attribute__Group_5_1_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1537:1: ( rule__Attribute__Group_5_1_2__2__Impl rule__Attribute__Group_5_1_2__3 )
            // InternalSocialRequest.g:1538:2: rule__Attribute__Group_5_1_2__2__Impl rule__Attribute__Group_5_1_2__3
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
    // InternalSocialRequest.g:1545:1: rule__Attribute__Group_5_1_2__2__Impl : ( ( ( rule__Attribute__ValidationsAssignment_5_1_2_2 ) ) ( ( rule__Attribute__ValidationsAssignment_5_1_2_2 )* ) ) ;
    public final void rule__Attribute__Group_5_1_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1549:1: ( ( ( ( rule__Attribute__ValidationsAssignment_5_1_2_2 ) ) ( ( rule__Attribute__ValidationsAssignment_5_1_2_2 )* ) ) )
            // InternalSocialRequest.g:1550:1: ( ( ( rule__Attribute__ValidationsAssignment_5_1_2_2 ) ) ( ( rule__Attribute__ValidationsAssignment_5_1_2_2 )* ) )
            {
            // InternalSocialRequest.g:1550:1: ( ( ( rule__Attribute__ValidationsAssignment_5_1_2_2 ) ) ( ( rule__Attribute__ValidationsAssignment_5_1_2_2 )* ) )
            // InternalSocialRequest.g:1551:2: ( ( rule__Attribute__ValidationsAssignment_5_1_2_2 ) ) ( ( rule__Attribute__ValidationsAssignment_5_1_2_2 )* )
            {
            // InternalSocialRequest.g:1551:2: ( ( rule__Attribute__ValidationsAssignment_5_1_2_2 ) )
            // InternalSocialRequest.g:1552:3: ( rule__Attribute__ValidationsAssignment_5_1_2_2 )
            {
             before(grammarAccess.getAttributeAccess().getValidationsAssignment_5_1_2_2()); 
            // InternalSocialRequest.g:1553:3: ( rule__Attribute__ValidationsAssignment_5_1_2_2 )
            // InternalSocialRequest.g:1553:4: rule__Attribute__ValidationsAssignment_5_1_2_2
            {
            pushFollow(FOLLOW_19);
            rule__Attribute__ValidationsAssignment_5_1_2_2();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getValidationsAssignment_5_1_2_2()); 

            }

            // InternalSocialRequest.g:1556:2: ( ( rule__Attribute__ValidationsAssignment_5_1_2_2 )* )
            // InternalSocialRequest.g:1557:3: ( rule__Attribute__ValidationsAssignment_5_1_2_2 )*
            {
             before(grammarAccess.getAttributeAccess().getValidationsAssignment_5_1_2_2()); 
            // InternalSocialRequest.g:1558:3: ( rule__Attribute__ValidationsAssignment_5_1_2_2 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>=13 && LA16_0<=17)||(LA16_0>=48 && LA16_0<=50)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalSocialRequest.g:1558:4: rule__Attribute__ValidationsAssignment_5_1_2_2
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__Attribute__ValidationsAssignment_5_1_2_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
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
    // InternalSocialRequest.g:1567:1: rule__Attribute__Group_5_1_2__3 : rule__Attribute__Group_5_1_2__3__Impl ;
    public final void rule__Attribute__Group_5_1_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1571:1: ( rule__Attribute__Group_5_1_2__3__Impl )
            // InternalSocialRequest.g:1572:2: rule__Attribute__Group_5_1_2__3__Impl
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
    // InternalSocialRequest.g:1578:1: rule__Attribute__Group_5_1_2__3__Impl : ( '}' ) ;
    public final void rule__Attribute__Group_5_1_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1582:1: ( ( '}' ) )
            // InternalSocialRequest.g:1583:1: ( '}' )
            {
            // InternalSocialRequest.g:1583:1: ( '}' )
            // InternalSocialRequest.g:1584:2: '}'
            {
             before(grammarAccess.getAttributeAccess().getRightCurlyBracketKeyword_5_1_2_3()); 
            match(input,40,FOLLOW_2); 
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
    // InternalSocialRequest.g:1594:1: rule__Modifier__Group_2__0 : rule__Modifier__Group_2__0__Impl rule__Modifier__Group_2__1 ;
    public final void rule__Modifier__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1598:1: ( rule__Modifier__Group_2__0__Impl rule__Modifier__Group_2__1 )
            // InternalSocialRequest.g:1599:2: rule__Modifier__Group_2__0__Impl rule__Modifier__Group_2__1
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
    // InternalSocialRequest.g:1606:1: rule__Modifier__Group_2__0__Impl : ( ( rule__Modifier__IsIDAssignment_2_0 ) ) ;
    public final void rule__Modifier__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1610:1: ( ( ( rule__Modifier__IsIDAssignment_2_0 ) ) )
            // InternalSocialRequest.g:1611:1: ( ( rule__Modifier__IsIDAssignment_2_0 ) )
            {
            // InternalSocialRequest.g:1611:1: ( ( rule__Modifier__IsIDAssignment_2_0 ) )
            // InternalSocialRequest.g:1612:2: ( rule__Modifier__IsIDAssignment_2_0 )
            {
             before(grammarAccess.getModifierAccess().getIsIDAssignment_2_0()); 
            // InternalSocialRequest.g:1613:2: ( rule__Modifier__IsIDAssignment_2_0 )
            // InternalSocialRequest.g:1613:3: rule__Modifier__IsIDAssignment_2_0
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
    // InternalSocialRequest.g:1621:1: rule__Modifier__Group_2__1 : rule__Modifier__Group_2__1__Impl ;
    public final void rule__Modifier__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1625:1: ( rule__Modifier__Group_2__1__Impl )
            // InternalSocialRequest.g:1626:2: rule__Modifier__Group_2__1__Impl
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
    // InternalSocialRequest.g:1632:1: rule__Modifier__Group_2__1__Impl : ( ( rule__Modifier__Group_2_1__0 )? ) ;
    public final void rule__Modifier__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1636:1: ( ( ( rule__Modifier__Group_2_1__0 )? ) )
            // InternalSocialRequest.g:1637:1: ( ( rule__Modifier__Group_2_1__0 )? )
            {
            // InternalSocialRequest.g:1637:1: ( ( rule__Modifier__Group_2_1__0 )? )
            // InternalSocialRequest.g:1638:2: ( rule__Modifier__Group_2_1__0 )?
            {
             before(grammarAccess.getModifierAccess().getGroup_2_1()); 
            // InternalSocialRequest.g:1639:2: ( rule__Modifier__Group_2_1__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==46) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalSocialRequest.g:1639:3: rule__Modifier__Group_2_1__0
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
    // InternalSocialRequest.g:1648:1: rule__Modifier__Group_2_1__0 : rule__Modifier__Group_2_1__0__Impl rule__Modifier__Group_2_1__1 ;
    public final void rule__Modifier__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1652:1: ( rule__Modifier__Group_2_1__0__Impl rule__Modifier__Group_2_1__1 )
            // InternalSocialRequest.g:1653:2: rule__Modifier__Group_2_1__0__Impl rule__Modifier__Group_2_1__1
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
    // InternalSocialRequest.g:1660:1: rule__Modifier__Group_2_1__0__Impl : ( '(' ) ;
    public final void rule__Modifier__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1664:1: ( ( '(' ) )
            // InternalSocialRequest.g:1665:1: ( '(' )
            {
            // InternalSocialRequest.g:1665:1: ( '(' )
            // InternalSocialRequest.g:1666:2: '('
            {
             before(grammarAccess.getModifierAccess().getLeftParenthesisKeyword_2_1_0()); 
            match(input,46,FOLLOW_2); 
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
    // InternalSocialRequest.g:1675:1: rule__Modifier__Group_2_1__1 : rule__Modifier__Group_2_1__1__Impl rule__Modifier__Group_2_1__2 ;
    public final void rule__Modifier__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1679:1: ( rule__Modifier__Group_2_1__1__Impl rule__Modifier__Group_2_1__2 )
            // InternalSocialRequest.g:1680:2: rule__Modifier__Group_2_1__1__Impl rule__Modifier__Group_2_1__2
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
    // InternalSocialRequest.g:1687:1: rule__Modifier__Group_2_1__1__Impl : ( ( rule__Modifier__IDGenerationTypeAssignment_2_1_1 ) ) ;
    public final void rule__Modifier__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1691:1: ( ( ( rule__Modifier__IDGenerationTypeAssignment_2_1_1 ) ) )
            // InternalSocialRequest.g:1692:1: ( ( rule__Modifier__IDGenerationTypeAssignment_2_1_1 ) )
            {
            // InternalSocialRequest.g:1692:1: ( ( rule__Modifier__IDGenerationTypeAssignment_2_1_1 ) )
            // InternalSocialRequest.g:1693:2: ( rule__Modifier__IDGenerationTypeAssignment_2_1_1 )
            {
             before(grammarAccess.getModifierAccess().getIDGenerationTypeAssignment_2_1_1()); 
            // InternalSocialRequest.g:1694:2: ( rule__Modifier__IDGenerationTypeAssignment_2_1_1 )
            // InternalSocialRequest.g:1694:3: rule__Modifier__IDGenerationTypeAssignment_2_1_1
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
    // InternalSocialRequest.g:1702:1: rule__Modifier__Group_2_1__2 : rule__Modifier__Group_2_1__2__Impl ;
    public final void rule__Modifier__Group_2_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1706:1: ( rule__Modifier__Group_2_1__2__Impl )
            // InternalSocialRequest.g:1707:2: rule__Modifier__Group_2_1__2__Impl
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
    // InternalSocialRequest.g:1713:1: rule__Modifier__Group_2_1__2__Impl : ( ')' ) ;
    public final void rule__Modifier__Group_2_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1717:1: ( ( ')' ) )
            // InternalSocialRequest.g:1718:1: ( ')' )
            {
            // InternalSocialRequest.g:1718:1: ( ')' )
            // InternalSocialRequest.g:1719:2: ')'
            {
             before(grammarAccess.getModifierAccess().getRightParenthesisKeyword_2_1_2()); 
            match(input,47,FOLLOW_2); 
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
    // InternalSocialRequest.g:1729:1: rule__Validation__Group_0__0 : rule__Validation__Group_0__0__Impl rule__Validation__Group_0__1 ;
    public final void rule__Validation__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1733:1: ( rule__Validation__Group_0__0__Impl rule__Validation__Group_0__1 )
            // InternalSocialRequest.g:1734:2: rule__Validation__Group_0__0__Impl rule__Validation__Group_0__1
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
    // InternalSocialRequest.g:1741:1: rule__Validation__Group_0__0__Impl : ( 'min:' ) ;
    public final void rule__Validation__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1745:1: ( ( 'min:' ) )
            // InternalSocialRequest.g:1746:1: ( 'min:' )
            {
            // InternalSocialRequest.g:1746:1: ( 'min:' )
            // InternalSocialRequest.g:1747:2: 'min:'
            {
             before(grammarAccess.getValidationAccess().getMinKeyword_0_0()); 
            match(input,48,FOLLOW_2); 
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
    // InternalSocialRequest.g:1756:1: rule__Validation__Group_0__1 : rule__Validation__Group_0__1__Impl ;
    public final void rule__Validation__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1760:1: ( rule__Validation__Group_0__1__Impl )
            // InternalSocialRequest.g:1761:2: rule__Validation__Group_0__1__Impl
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
    // InternalSocialRequest.g:1767:1: rule__Validation__Group_0__1__Impl : ( ( rule__Validation__MinAssignment_0_1 ) ) ;
    public final void rule__Validation__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1771:1: ( ( ( rule__Validation__MinAssignment_0_1 ) ) )
            // InternalSocialRequest.g:1772:1: ( ( rule__Validation__MinAssignment_0_1 ) )
            {
            // InternalSocialRequest.g:1772:1: ( ( rule__Validation__MinAssignment_0_1 ) )
            // InternalSocialRequest.g:1773:2: ( rule__Validation__MinAssignment_0_1 )
            {
             before(grammarAccess.getValidationAccess().getMinAssignment_0_1()); 
            // InternalSocialRequest.g:1774:2: ( rule__Validation__MinAssignment_0_1 )
            // InternalSocialRequest.g:1774:3: rule__Validation__MinAssignment_0_1
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
    // InternalSocialRequest.g:1783:1: rule__Validation__Group_1__0 : rule__Validation__Group_1__0__Impl rule__Validation__Group_1__1 ;
    public final void rule__Validation__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1787:1: ( rule__Validation__Group_1__0__Impl rule__Validation__Group_1__1 )
            // InternalSocialRequest.g:1788:2: rule__Validation__Group_1__0__Impl rule__Validation__Group_1__1
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
    // InternalSocialRequest.g:1795:1: rule__Validation__Group_1__0__Impl : ( 'max:' ) ;
    public final void rule__Validation__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1799:1: ( ( 'max:' ) )
            // InternalSocialRequest.g:1800:1: ( 'max:' )
            {
            // InternalSocialRequest.g:1800:1: ( 'max:' )
            // InternalSocialRequest.g:1801:2: 'max:'
            {
             before(grammarAccess.getValidationAccess().getMaxKeyword_1_0()); 
            match(input,49,FOLLOW_2); 
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
    // InternalSocialRequest.g:1810:1: rule__Validation__Group_1__1 : rule__Validation__Group_1__1__Impl ;
    public final void rule__Validation__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1814:1: ( rule__Validation__Group_1__1__Impl )
            // InternalSocialRequest.g:1815:2: rule__Validation__Group_1__1__Impl
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
    // InternalSocialRequest.g:1821:1: rule__Validation__Group_1__1__Impl : ( ( rule__Validation__MaxAssignment_1_1 ) ) ;
    public final void rule__Validation__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1825:1: ( ( ( rule__Validation__MaxAssignment_1_1 ) ) )
            // InternalSocialRequest.g:1826:1: ( ( rule__Validation__MaxAssignment_1_1 ) )
            {
            // InternalSocialRequest.g:1826:1: ( ( rule__Validation__MaxAssignment_1_1 ) )
            // InternalSocialRequest.g:1827:2: ( rule__Validation__MaxAssignment_1_1 )
            {
             before(grammarAccess.getValidationAccess().getMaxAssignment_1_1()); 
            // InternalSocialRequest.g:1828:2: ( rule__Validation__MaxAssignment_1_1 )
            // InternalSocialRequest.g:1828:3: rule__Validation__MaxAssignment_1_1
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
    // InternalSocialRequest.g:1837:1: rule__Validation__Group_2__0 : rule__Validation__Group_2__0__Impl rule__Validation__Group_2__1 ;
    public final void rule__Validation__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1841:1: ( rule__Validation__Group_2__0__Impl rule__Validation__Group_2__1 )
            // InternalSocialRequest.g:1842:2: rule__Validation__Group_2__0__Impl rule__Validation__Group_2__1
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
    // InternalSocialRequest.g:1849:1: rule__Validation__Group_2__0__Impl : ( 'pattern:' ) ;
    public final void rule__Validation__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1853:1: ( ( 'pattern:' ) )
            // InternalSocialRequest.g:1854:1: ( 'pattern:' )
            {
            // InternalSocialRequest.g:1854:1: ( 'pattern:' )
            // InternalSocialRequest.g:1855:2: 'pattern:'
            {
             before(grammarAccess.getValidationAccess().getPatternKeyword_2_0()); 
            match(input,50,FOLLOW_2); 
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
    // InternalSocialRequest.g:1864:1: rule__Validation__Group_2__1 : rule__Validation__Group_2__1__Impl ;
    public final void rule__Validation__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1868:1: ( rule__Validation__Group_2__1__Impl )
            // InternalSocialRequest.g:1869:2: rule__Validation__Group_2__1__Impl
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
    // InternalSocialRequest.g:1875:1: rule__Validation__Group_2__1__Impl : ( ( rule__Validation__RegexAssignment_2_1 ) ) ;
    public final void rule__Validation__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1879:1: ( ( ( rule__Validation__RegexAssignment_2_1 ) ) )
            // InternalSocialRequest.g:1880:1: ( ( rule__Validation__RegexAssignment_2_1 ) )
            {
            // InternalSocialRequest.g:1880:1: ( ( rule__Validation__RegexAssignment_2_1 ) )
            // InternalSocialRequest.g:1881:2: ( rule__Validation__RegexAssignment_2_1 )
            {
             before(grammarAccess.getValidationAccess().getRegexAssignment_2_1()); 
            // InternalSocialRequest.g:1882:2: ( rule__Validation__RegexAssignment_2_1 )
            // InternalSocialRequest.g:1882:3: rule__Validation__RegexAssignment_2_1
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
    // InternalSocialRequest.g:1891:1: rule__Repository__Group__0 : rule__Repository__Group__0__Impl rule__Repository__Group__1 ;
    public final void rule__Repository__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1895:1: ( rule__Repository__Group__0__Impl rule__Repository__Group__1 )
            // InternalSocialRequest.g:1896:2: rule__Repository__Group__0__Impl rule__Repository__Group__1
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
    // InternalSocialRequest.g:1903:1: rule__Repository__Group__0__Impl : ( 'Repository' ) ;
    public final void rule__Repository__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1907:1: ( ( 'Repository' ) )
            // InternalSocialRequest.g:1908:1: ( 'Repository' )
            {
            // InternalSocialRequest.g:1908:1: ( 'Repository' )
            // InternalSocialRequest.g:1909:2: 'Repository'
            {
             before(grammarAccess.getRepositoryAccess().getRepositoryKeyword_0()); 
            match(input,51,FOLLOW_2); 
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
    // InternalSocialRequest.g:1918:1: rule__Repository__Group__1 : rule__Repository__Group__1__Impl rule__Repository__Group__2 ;
    public final void rule__Repository__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1922:1: ( rule__Repository__Group__1__Impl rule__Repository__Group__2 )
            // InternalSocialRequest.g:1923:2: rule__Repository__Group__1__Impl rule__Repository__Group__2
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
    // InternalSocialRequest.g:1930:1: rule__Repository__Group__1__Impl : ( ( rule__Repository__EntityAssignment_1 ) ) ;
    public final void rule__Repository__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1934:1: ( ( ( rule__Repository__EntityAssignment_1 ) ) )
            // InternalSocialRequest.g:1935:1: ( ( rule__Repository__EntityAssignment_1 ) )
            {
            // InternalSocialRequest.g:1935:1: ( ( rule__Repository__EntityAssignment_1 ) )
            // InternalSocialRequest.g:1936:2: ( rule__Repository__EntityAssignment_1 )
            {
             before(grammarAccess.getRepositoryAccess().getEntityAssignment_1()); 
            // InternalSocialRequest.g:1937:2: ( rule__Repository__EntityAssignment_1 )
            // InternalSocialRequest.g:1937:3: rule__Repository__EntityAssignment_1
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
    // InternalSocialRequest.g:1945:1: rule__Repository__Group__2 : rule__Repository__Group__2__Impl rule__Repository__Group__3 ;
    public final void rule__Repository__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1949:1: ( rule__Repository__Group__2__Impl rule__Repository__Group__3 )
            // InternalSocialRequest.g:1950:2: rule__Repository__Group__2__Impl rule__Repository__Group__3
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
    // InternalSocialRequest.g:1957:1: rule__Repository__Group__2__Impl : ( '{' ) ;
    public final void rule__Repository__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1961:1: ( ( '{' ) )
            // InternalSocialRequest.g:1962:1: ( '{' )
            {
            // InternalSocialRequest.g:1962:1: ( '{' )
            // InternalSocialRequest.g:1963:2: '{'
            {
             before(grammarAccess.getRepositoryAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,39,FOLLOW_2); 
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
    // InternalSocialRequest.g:1972:1: rule__Repository__Group__3 : rule__Repository__Group__3__Impl rule__Repository__Group__4 ;
    public final void rule__Repository__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1976:1: ( rule__Repository__Group__3__Impl rule__Repository__Group__4 )
            // InternalSocialRequest.g:1977:2: rule__Repository__Group__3__Impl rule__Repository__Group__4
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
    // InternalSocialRequest.g:1984:1: rule__Repository__Group__3__Impl : ( ( ( rule__Repository__QueriesAssignment_3 ) ) ( ( rule__Repository__QueriesAssignment_3 )* ) ) ;
    public final void rule__Repository__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1988:1: ( ( ( ( rule__Repository__QueriesAssignment_3 ) ) ( ( rule__Repository__QueriesAssignment_3 )* ) ) )
            // InternalSocialRequest.g:1989:1: ( ( ( rule__Repository__QueriesAssignment_3 ) ) ( ( rule__Repository__QueriesAssignment_3 )* ) )
            {
            // InternalSocialRequest.g:1989:1: ( ( ( rule__Repository__QueriesAssignment_3 ) ) ( ( rule__Repository__QueriesAssignment_3 )* ) )
            // InternalSocialRequest.g:1990:2: ( ( rule__Repository__QueriesAssignment_3 ) ) ( ( rule__Repository__QueriesAssignment_3 )* )
            {
            // InternalSocialRequest.g:1990:2: ( ( rule__Repository__QueriesAssignment_3 ) )
            // InternalSocialRequest.g:1991:3: ( rule__Repository__QueriesAssignment_3 )
            {
             before(grammarAccess.getRepositoryAccess().getQueriesAssignment_3()); 
            // InternalSocialRequest.g:1992:3: ( rule__Repository__QueriesAssignment_3 )
            // InternalSocialRequest.g:1992:4: rule__Repository__QueriesAssignment_3
            {
            pushFollow(FOLLOW_26);
            rule__Repository__QueriesAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getRepositoryAccess().getQueriesAssignment_3()); 

            }

            // InternalSocialRequest.g:1995:2: ( ( rule__Repository__QueriesAssignment_3 )* )
            // InternalSocialRequest.g:1996:3: ( rule__Repository__QueriesAssignment_3 )*
            {
             before(grammarAccess.getRepositoryAccess().getQueriesAssignment_3()); 
            // InternalSocialRequest.g:1997:3: ( rule__Repository__QueriesAssignment_3 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==52) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalSocialRequest.g:1997:4: rule__Repository__QueriesAssignment_3
            	    {
            	    pushFollow(FOLLOW_26);
            	    rule__Repository__QueriesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
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
    // InternalSocialRequest.g:2006:1: rule__Repository__Group__4 : rule__Repository__Group__4__Impl ;
    public final void rule__Repository__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2010:1: ( rule__Repository__Group__4__Impl )
            // InternalSocialRequest.g:2011:2: rule__Repository__Group__4__Impl
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
    // InternalSocialRequest.g:2017:1: rule__Repository__Group__4__Impl : ( '}' ) ;
    public final void rule__Repository__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2021:1: ( ( '}' ) )
            // InternalSocialRequest.g:2022:1: ( '}' )
            {
            // InternalSocialRequest.g:2022:1: ( '}' )
            // InternalSocialRequest.g:2023:2: '}'
            {
             before(grammarAccess.getRepositoryAccess().getRightCurlyBracketKeyword_4()); 
            match(input,40,FOLLOW_2); 
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
    // InternalSocialRequest.g:2033:1: rule__Query__Group__0 : rule__Query__Group__0__Impl rule__Query__Group__1 ;
    public final void rule__Query__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2037:1: ( rule__Query__Group__0__Impl rule__Query__Group__1 )
            // InternalSocialRequest.g:2038:2: rule__Query__Group__0__Impl rule__Query__Group__1
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
    // InternalSocialRequest.g:2045:1: rule__Query__Group__0__Impl : ( 'query' ) ;
    public final void rule__Query__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2049:1: ( ( 'query' ) )
            // InternalSocialRequest.g:2050:1: ( 'query' )
            {
            // InternalSocialRequest.g:2050:1: ( 'query' )
            // InternalSocialRequest.g:2051:2: 'query'
            {
             before(grammarAccess.getQueryAccess().getQueryKeyword_0()); 
            match(input,52,FOLLOW_2); 
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
    // InternalSocialRequest.g:2060:1: rule__Query__Group__1 : rule__Query__Group__1__Impl rule__Query__Group__2 ;
    public final void rule__Query__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2064:1: ( rule__Query__Group__1__Impl rule__Query__Group__2 )
            // InternalSocialRequest.g:2065:2: rule__Query__Group__1__Impl rule__Query__Group__2
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
    // InternalSocialRequest.g:2072:1: rule__Query__Group__1__Impl : ( ( rule__Query__NameAssignment_1 ) ) ;
    public final void rule__Query__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2076:1: ( ( ( rule__Query__NameAssignment_1 ) ) )
            // InternalSocialRequest.g:2077:1: ( ( rule__Query__NameAssignment_1 ) )
            {
            // InternalSocialRequest.g:2077:1: ( ( rule__Query__NameAssignment_1 ) )
            // InternalSocialRequest.g:2078:2: ( rule__Query__NameAssignment_1 )
            {
             before(grammarAccess.getQueryAccess().getNameAssignment_1()); 
            // InternalSocialRequest.g:2079:2: ( rule__Query__NameAssignment_1 )
            // InternalSocialRequest.g:2079:3: rule__Query__NameAssignment_1
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
    // InternalSocialRequest.g:2087:1: rule__Query__Group__2 : rule__Query__Group__2__Impl rule__Query__Group__3 ;
    public final void rule__Query__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2091:1: ( rule__Query__Group__2__Impl rule__Query__Group__3 )
            // InternalSocialRequest.g:2092:2: rule__Query__Group__2__Impl rule__Query__Group__3
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
    // InternalSocialRequest.g:2099:1: rule__Query__Group__2__Impl : ( ( rule__Query__Group_2__0 )? ) ;
    public final void rule__Query__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2103:1: ( ( ( rule__Query__Group_2__0 )? ) )
            // InternalSocialRequest.g:2104:1: ( ( rule__Query__Group_2__0 )? )
            {
            // InternalSocialRequest.g:2104:1: ( ( rule__Query__Group_2__0 )? )
            // InternalSocialRequest.g:2105:2: ( rule__Query__Group_2__0 )?
            {
             before(grammarAccess.getQueryAccess().getGroup_2()); 
            // InternalSocialRequest.g:2106:2: ( rule__Query__Group_2__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==42) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalSocialRequest.g:2106:3: rule__Query__Group_2__0
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
    // InternalSocialRequest.g:2114:1: rule__Query__Group__3 : rule__Query__Group__3__Impl ;
    public final void rule__Query__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2118:1: ( rule__Query__Group__3__Impl )
            // InternalSocialRequest.g:2119:2: rule__Query__Group__3__Impl
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
    // InternalSocialRequest.g:2125:1: rule__Query__Group__3__Impl : ( ( rule__Query__Group_3__0 ) ) ;
    public final void rule__Query__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2129:1: ( ( ( rule__Query__Group_3__0 ) ) )
            // InternalSocialRequest.g:2130:1: ( ( rule__Query__Group_3__0 ) )
            {
            // InternalSocialRequest.g:2130:1: ( ( rule__Query__Group_3__0 ) )
            // InternalSocialRequest.g:2131:2: ( rule__Query__Group_3__0 )
            {
             before(grammarAccess.getQueryAccess().getGroup_3()); 
            // InternalSocialRequest.g:2132:2: ( rule__Query__Group_3__0 )
            // InternalSocialRequest.g:2132:3: rule__Query__Group_3__0
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
    // InternalSocialRequest.g:2141:1: rule__Query__Group_2__0 : rule__Query__Group_2__0__Impl rule__Query__Group_2__1 ;
    public final void rule__Query__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2145:1: ( rule__Query__Group_2__0__Impl rule__Query__Group_2__1 )
            // InternalSocialRequest.g:2146:2: rule__Query__Group_2__0__Impl rule__Query__Group_2__1
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
    // InternalSocialRequest.g:2153:1: rule__Query__Group_2__0__Impl : ( ( rule__Query__IsListAssignment_2_0 ) ) ;
    public final void rule__Query__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2157:1: ( ( ( rule__Query__IsListAssignment_2_0 ) ) )
            // InternalSocialRequest.g:2158:1: ( ( rule__Query__IsListAssignment_2_0 ) )
            {
            // InternalSocialRequest.g:2158:1: ( ( rule__Query__IsListAssignment_2_0 ) )
            // InternalSocialRequest.g:2159:2: ( rule__Query__IsListAssignment_2_0 )
            {
             before(grammarAccess.getQueryAccess().getIsListAssignment_2_0()); 
            // InternalSocialRequest.g:2160:2: ( rule__Query__IsListAssignment_2_0 )
            // InternalSocialRequest.g:2160:3: rule__Query__IsListAssignment_2_0
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
    // InternalSocialRequest.g:2168:1: rule__Query__Group_2__1 : rule__Query__Group_2__1__Impl ;
    public final void rule__Query__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2172:1: ( rule__Query__Group_2__1__Impl )
            // InternalSocialRequest.g:2173:2: rule__Query__Group_2__1__Impl
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
    // InternalSocialRequest.g:2179:1: rule__Query__Group_2__1__Impl : ( 'list' ) ;
    public final void rule__Query__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2183:1: ( ( 'list' ) )
            // InternalSocialRequest.g:2184:1: ( 'list' )
            {
            // InternalSocialRequest.g:2184:1: ( 'list' )
            // InternalSocialRequest.g:2185:2: 'list'
            {
             before(grammarAccess.getQueryAccess().getListKeyword_2_1()); 
            match(input,53,FOLLOW_2); 
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
    // InternalSocialRequest.g:2195:1: rule__Query__Group_3__0 : rule__Query__Group_3__0__Impl rule__Query__Group_3__1 ;
    public final void rule__Query__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2199:1: ( rule__Query__Group_3__0__Impl rule__Query__Group_3__1 )
            // InternalSocialRequest.g:2200:2: rule__Query__Group_3__0__Impl rule__Query__Group_3__1
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
    // InternalSocialRequest.g:2207:1: rule__Query__Group_3__0__Impl : ( '{' ) ;
    public final void rule__Query__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2211:1: ( ( '{' ) )
            // InternalSocialRequest.g:2212:1: ( '{' )
            {
            // InternalSocialRequest.g:2212:1: ( '{' )
            // InternalSocialRequest.g:2213:2: '{'
            {
             before(grammarAccess.getQueryAccess().getLeftCurlyBracketKeyword_3_0()); 
            match(input,39,FOLLOW_2); 
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
    // InternalSocialRequest.g:2222:1: rule__Query__Group_3__1 : rule__Query__Group_3__1__Impl rule__Query__Group_3__2 ;
    public final void rule__Query__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2226:1: ( rule__Query__Group_3__1__Impl rule__Query__Group_3__2 )
            // InternalSocialRequest.g:2227:2: rule__Query__Group_3__1__Impl rule__Query__Group_3__2
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
    // InternalSocialRequest.g:2234:1: rule__Query__Group_3__1__Impl : ( ( rule__Query__Group_3_1__0 )? ) ;
    public final void rule__Query__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2238:1: ( ( ( rule__Query__Group_3_1__0 )? ) )
            // InternalSocialRequest.g:2239:1: ( ( rule__Query__Group_3_1__0 )? )
            {
            // InternalSocialRequest.g:2239:1: ( ( rule__Query__Group_3_1__0 )? )
            // InternalSocialRequest.g:2240:2: ( rule__Query__Group_3_1__0 )?
            {
             before(grammarAccess.getQueryAccess().getGroup_3_1()); 
            // InternalSocialRequest.g:2241:2: ( rule__Query__Group_3_1__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==54) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalSocialRequest.g:2241:3: rule__Query__Group_3_1__0
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
    // InternalSocialRequest.g:2249:1: rule__Query__Group_3__2 : rule__Query__Group_3__2__Impl rule__Query__Group_3__3 ;
    public final void rule__Query__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2253:1: ( rule__Query__Group_3__2__Impl rule__Query__Group_3__3 )
            // InternalSocialRequest.g:2254:2: rule__Query__Group_3__2__Impl rule__Query__Group_3__3
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
    // InternalSocialRequest.g:2261:1: rule__Query__Group_3__2__Impl : ( ( rule__Query__SqlQueryAssignment_3_2 )? ) ;
    public final void rule__Query__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2265:1: ( ( ( rule__Query__SqlQueryAssignment_3_2 )? ) )
            // InternalSocialRequest.g:2266:1: ( ( rule__Query__SqlQueryAssignment_3_2 )? )
            {
            // InternalSocialRequest.g:2266:1: ( ( rule__Query__SqlQueryAssignment_3_2 )? )
            // InternalSocialRequest.g:2267:2: ( rule__Query__SqlQueryAssignment_3_2 )?
            {
             before(grammarAccess.getQueryAccess().getSqlQueryAssignment_3_2()); 
            // InternalSocialRequest.g:2268:2: ( rule__Query__SqlQueryAssignment_3_2 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==55) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalSocialRequest.g:2268:3: rule__Query__SqlQueryAssignment_3_2
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
    // InternalSocialRequest.g:2276:1: rule__Query__Group_3__3 : rule__Query__Group_3__3__Impl ;
    public final void rule__Query__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2280:1: ( rule__Query__Group_3__3__Impl )
            // InternalSocialRequest.g:2281:2: rule__Query__Group_3__3__Impl
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
    // InternalSocialRequest.g:2287:1: rule__Query__Group_3__3__Impl : ( '}' ) ;
    public final void rule__Query__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2291:1: ( ( '}' ) )
            // InternalSocialRequest.g:2292:1: ( '}' )
            {
            // InternalSocialRequest.g:2292:1: ( '}' )
            // InternalSocialRequest.g:2293:2: '}'
            {
             before(grammarAccess.getQueryAccess().getRightCurlyBracketKeyword_3_3()); 
            match(input,40,FOLLOW_2); 
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
    // InternalSocialRequest.g:2303:1: rule__Query__Group_3_1__0 : rule__Query__Group_3_1__0__Impl rule__Query__Group_3_1__1 ;
    public final void rule__Query__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2307:1: ( rule__Query__Group_3_1__0__Impl rule__Query__Group_3_1__1 )
            // InternalSocialRequest.g:2308:2: rule__Query__Group_3_1__0__Impl rule__Query__Group_3_1__1
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
    // InternalSocialRequest.g:2315:1: rule__Query__Group_3_1__0__Impl : ( 'params' ) ;
    public final void rule__Query__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2319:1: ( ( 'params' ) )
            // InternalSocialRequest.g:2320:1: ( 'params' )
            {
            // InternalSocialRequest.g:2320:1: ( 'params' )
            // InternalSocialRequest.g:2321:2: 'params'
            {
             before(grammarAccess.getQueryAccess().getParamsKeyword_3_1_0()); 
            match(input,54,FOLLOW_2); 
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
    // InternalSocialRequest.g:2330:1: rule__Query__Group_3_1__1 : rule__Query__Group_3_1__1__Impl rule__Query__Group_3_1__2 ;
    public final void rule__Query__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2334:1: ( rule__Query__Group_3_1__1__Impl rule__Query__Group_3_1__2 )
            // InternalSocialRequest.g:2335:2: rule__Query__Group_3_1__1__Impl rule__Query__Group_3_1__2
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
    // InternalSocialRequest.g:2342:1: rule__Query__Group_3_1__1__Impl : ( '{' ) ;
    public final void rule__Query__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2346:1: ( ( '{' ) )
            // InternalSocialRequest.g:2347:1: ( '{' )
            {
            // InternalSocialRequest.g:2347:1: ( '{' )
            // InternalSocialRequest.g:2348:2: '{'
            {
             before(grammarAccess.getQueryAccess().getLeftCurlyBracketKeyword_3_1_1()); 
            match(input,39,FOLLOW_2); 
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
    // InternalSocialRequest.g:2357:1: rule__Query__Group_3_1__2 : rule__Query__Group_3_1__2__Impl rule__Query__Group_3_1__3 ;
    public final void rule__Query__Group_3_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2361:1: ( rule__Query__Group_3_1__2__Impl rule__Query__Group_3_1__3 )
            // InternalSocialRequest.g:2362:2: rule__Query__Group_3_1__2__Impl rule__Query__Group_3_1__3
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
    // InternalSocialRequest.g:2369:1: rule__Query__Group_3_1__2__Impl : ( ( rule__Query__ParamsAssignment_3_1_2 )* ) ;
    public final void rule__Query__Group_3_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2373:1: ( ( ( rule__Query__ParamsAssignment_3_1_2 )* ) )
            // InternalSocialRequest.g:2374:1: ( ( rule__Query__ParamsAssignment_3_1_2 )* )
            {
            // InternalSocialRequest.g:2374:1: ( ( rule__Query__ParamsAssignment_3_1_2 )* )
            // InternalSocialRequest.g:2375:2: ( rule__Query__ParamsAssignment_3_1_2 )*
            {
             before(grammarAccess.getQueryAccess().getParamsAssignment_3_1_2()); 
            // InternalSocialRequest.g:2376:2: ( rule__Query__ParamsAssignment_3_1_2 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==RULE_ID) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalSocialRequest.g:2376:3: rule__Query__ParamsAssignment_3_1_2
            	    {
            	    pushFollow(FOLLOW_31);
            	    rule__Query__ParamsAssignment_3_1_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
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
    // InternalSocialRequest.g:2384:1: rule__Query__Group_3_1__3 : rule__Query__Group_3_1__3__Impl ;
    public final void rule__Query__Group_3_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2388:1: ( rule__Query__Group_3_1__3__Impl )
            // InternalSocialRequest.g:2389:2: rule__Query__Group_3_1__3__Impl
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
    // InternalSocialRequest.g:2395:1: rule__Query__Group_3_1__3__Impl : ( '}' ) ;
    public final void rule__Query__Group_3_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2399:1: ( ( '}' ) )
            // InternalSocialRequest.g:2400:1: ( '}' )
            {
            // InternalSocialRequest.g:2400:1: ( '}' )
            // InternalSocialRequest.g:2401:2: '}'
            {
             before(grammarAccess.getQueryAccess().getRightCurlyBracketKeyword_3_1_3()); 
            match(input,40,FOLLOW_2); 
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
    // InternalSocialRequest.g:2411:1: rule__Param__Group__0 : rule__Param__Group__0__Impl rule__Param__Group__1 ;
    public final void rule__Param__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2415:1: ( rule__Param__Group__0__Impl rule__Param__Group__1 )
            // InternalSocialRequest.g:2416:2: rule__Param__Group__0__Impl rule__Param__Group__1
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
    // InternalSocialRequest.g:2423:1: rule__Param__Group__0__Impl : ( ( rule__Param__NameAssignment_0 ) ) ;
    public final void rule__Param__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2427:1: ( ( ( rule__Param__NameAssignment_0 ) ) )
            // InternalSocialRequest.g:2428:1: ( ( rule__Param__NameAssignment_0 ) )
            {
            // InternalSocialRequest.g:2428:1: ( ( rule__Param__NameAssignment_0 ) )
            // InternalSocialRequest.g:2429:2: ( rule__Param__NameAssignment_0 )
            {
             before(grammarAccess.getParamAccess().getNameAssignment_0()); 
            // InternalSocialRequest.g:2430:2: ( rule__Param__NameAssignment_0 )
            // InternalSocialRequest.g:2430:3: rule__Param__NameAssignment_0
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
    // InternalSocialRequest.g:2438:1: rule__Param__Group__1 : rule__Param__Group__1__Impl rule__Param__Group__2 ;
    public final void rule__Param__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2442:1: ( rule__Param__Group__1__Impl rule__Param__Group__2 )
            // InternalSocialRequest.g:2443:2: rule__Param__Group__1__Impl rule__Param__Group__2
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
    // InternalSocialRequest.g:2450:1: rule__Param__Group__1__Impl : ( ':' ) ;
    public final void rule__Param__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2454:1: ( ( ':' ) )
            // InternalSocialRequest.g:2455:1: ( ':' )
            {
            // InternalSocialRequest.g:2455:1: ( ':' )
            // InternalSocialRequest.g:2456:2: ':'
            {
             before(grammarAccess.getParamAccess().getColonKeyword_1()); 
            match(input,42,FOLLOW_2); 
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
    // InternalSocialRequest.g:2465:1: rule__Param__Group__2 : rule__Param__Group__2__Impl ;
    public final void rule__Param__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2469:1: ( rule__Param__Group__2__Impl )
            // InternalSocialRequest.g:2470:2: rule__Param__Group__2__Impl
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
    // InternalSocialRequest.g:2476:1: rule__Param__Group__2__Impl : ( ( rule__Param__TypeAssignment_2 ) ) ;
    public final void rule__Param__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2480:1: ( ( ( rule__Param__TypeAssignment_2 ) ) )
            // InternalSocialRequest.g:2481:1: ( ( rule__Param__TypeAssignment_2 ) )
            {
            // InternalSocialRequest.g:2481:1: ( ( rule__Param__TypeAssignment_2 ) )
            // InternalSocialRequest.g:2482:2: ( rule__Param__TypeAssignment_2 )
            {
             before(grammarAccess.getParamAccess().getTypeAssignment_2()); 
            // InternalSocialRequest.g:2483:2: ( rule__Param__TypeAssignment_2 )
            // InternalSocialRequest.g:2483:3: rule__Param__TypeAssignment_2
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
    // InternalSocialRequest.g:2492:1: rule__SQLQuery__Group__0 : rule__SQLQuery__Group__0__Impl rule__SQLQuery__Group__1 ;
    public final void rule__SQLQuery__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2496:1: ( rule__SQLQuery__Group__0__Impl rule__SQLQuery__Group__1 )
            // InternalSocialRequest.g:2497:2: rule__SQLQuery__Group__0__Impl rule__SQLQuery__Group__1
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
    // InternalSocialRequest.g:2504:1: rule__SQLQuery__Group__0__Impl : ( ( rule__SQLQuery__SelectAssignment_0 ) ) ;
    public final void rule__SQLQuery__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2508:1: ( ( ( rule__SQLQuery__SelectAssignment_0 ) ) )
            // InternalSocialRequest.g:2509:1: ( ( rule__SQLQuery__SelectAssignment_0 ) )
            {
            // InternalSocialRequest.g:2509:1: ( ( rule__SQLQuery__SelectAssignment_0 ) )
            // InternalSocialRequest.g:2510:2: ( rule__SQLQuery__SelectAssignment_0 )
            {
             before(grammarAccess.getSQLQueryAccess().getSelectAssignment_0()); 
            // InternalSocialRequest.g:2511:2: ( rule__SQLQuery__SelectAssignment_0 )
            // InternalSocialRequest.g:2511:3: rule__SQLQuery__SelectAssignment_0
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
    // InternalSocialRequest.g:2519:1: rule__SQLQuery__Group__1 : rule__SQLQuery__Group__1__Impl rule__SQLQuery__Group__2 ;
    public final void rule__SQLQuery__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2523:1: ( rule__SQLQuery__Group__1__Impl rule__SQLQuery__Group__2 )
            // InternalSocialRequest.g:2524:2: rule__SQLQuery__Group__1__Impl rule__SQLQuery__Group__2
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
    // InternalSocialRequest.g:2531:1: rule__SQLQuery__Group__1__Impl : ( ( rule__SQLQuery__FromAssignment_1 ) ) ;
    public final void rule__SQLQuery__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2535:1: ( ( ( rule__SQLQuery__FromAssignment_1 ) ) )
            // InternalSocialRequest.g:2536:1: ( ( rule__SQLQuery__FromAssignment_1 ) )
            {
            // InternalSocialRequest.g:2536:1: ( ( rule__SQLQuery__FromAssignment_1 ) )
            // InternalSocialRequest.g:2537:2: ( rule__SQLQuery__FromAssignment_1 )
            {
             before(grammarAccess.getSQLQueryAccess().getFromAssignment_1()); 
            // InternalSocialRequest.g:2538:2: ( rule__SQLQuery__FromAssignment_1 )
            // InternalSocialRequest.g:2538:3: rule__SQLQuery__FromAssignment_1
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
    // InternalSocialRequest.g:2546:1: rule__SQLQuery__Group__2 : rule__SQLQuery__Group__2__Impl rule__SQLQuery__Group__3 ;
    public final void rule__SQLQuery__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2550:1: ( rule__SQLQuery__Group__2__Impl rule__SQLQuery__Group__3 )
            // InternalSocialRequest.g:2551:2: rule__SQLQuery__Group__2__Impl rule__SQLQuery__Group__3
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
    // InternalSocialRequest.g:2558:1: rule__SQLQuery__Group__2__Impl : ( ( rule__SQLQuery__JoinsAssignment_2 )* ) ;
    public final void rule__SQLQuery__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2562:1: ( ( ( rule__SQLQuery__JoinsAssignment_2 )* ) )
            // InternalSocialRequest.g:2563:1: ( ( rule__SQLQuery__JoinsAssignment_2 )* )
            {
            // InternalSocialRequest.g:2563:1: ( ( rule__SQLQuery__JoinsAssignment_2 )* )
            // InternalSocialRequest.g:2564:2: ( rule__SQLQuery__JoinsAssignment_2 )*
            {
             before(grammarAccess.getSQLQueryAccess().getJoinsAssignment_2()); 
            // InternalSocialRequest.g:2565:2: ( rule__SQLQuery__JoinsAssignment_2 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( ((LA23_0>=34 && LA23_0<=37)) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalSocialRequest.g:2565:3: rule__SQLQuery__JoinsAssignment_2
            	    {
            	    pushFollow(FOLLOW_34);
            	    rule__SQLQuery__JoinsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
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
    // InternalSocialRequest.g:2573:1: rule__SQLQuery__Group__3 : rule__SQLQuery__Group__3__Impl rule__SQLQuery__Group__4 ;
    public final void rule__SQLQuery__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2577:1: ( rule__SQLQuery__Group__3__Impl rule__SQLQuery__Group__4 )
            // InternalSocialRequest.g:2578:2: rule__SQLQuery__Group__3__Impl rule__SQLQuery__Group__4
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
    // InternalSocialRequest.g:2585:1: rule__SQLQuery__Group__3__Impl : ( ( rule__SQLQuery__WhereAssignment_3 )? ) ;
    public final void rule__SQLQuery__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2589:1: ( ( ( rule__SQLQuery__WhereAssignment_3 )? ) )
            // InternalSocialRequest.g:2590:1: ( ( rule__SQLQuery__WhereAssignment_3 )? )
            {
            // InternalSocialRequest.g:2590:1: ( ( rule__SQLQuery__WhereAssignment_3 )? )
            // InternalSocialRequest.g:2591:2: ( rule__SQLQuery__WhereAssignment_3 )?
            {
             before(grammarAccess.getSQLQueryAccess().getWhereAssignment_3()); 
            // InternalSocialRequest.g:2592:2: ( rule__SQLQuery__WhereAssignment_3 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==58) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalSocialRequest.g:2592:3: rule__SQLQuery__WhereAssignment_3
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
    // InternalSocialRequest.g:2600:1: rule__SQLQuery__Group__4 : rule__SQLQuery__Group__4__Impl ;
    public final void rule__SQLQuery__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2604:1: ( rule__SQLQuery__Group__4__Impl )
            // InternalSocialRequest.g:2605:2: rule__SQLQuery__Group__4__Impl
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
    // InternalSocialRequest.g:2611:1: rule__SQLQuery__Group__4__Impl : ( ( rule__SQLQuery__OrderAssignment_4 )? ) ;
    public final void rule__SQLQuery__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2615:1: ( ( ( rule__SQLQuery__OrderAssignment_4 )? ) )
            // InternalSocialRequest.g:2616:1: ( ( rule__SQLQuery__OrderAssignment_4 )? )
            {
            // InternalSocialRequest.g:2616:1: ( ( rule__SQLQuery__OrderAssignment_4 )? )
            // InternalSocialRequest.g:2617:2: ( rule__SQLQuery__OrderAssignment_4 )?
            {
             before(grammarAccess.getSQLQueryAccess().getOrderAssignment_4()); 
            // InternalSocialRequest.g:2618:2: ( rule__SQLQuery__OrderAssignment_4 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==59) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalSocialRequest.g:2618:3: rule__SQLQuery__OrderAssignment_4
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
    // InternalSocialRequest.g:2627:1: rule__Select__Group__0 : rule__Select__Group__0__Impl rule__Select__Group__1 ;
    public final void rule__Select__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2631:1: ( rule__Select__Group__0__Impl rule__Select__Group__1 )
            // InternalSocialRequest.g:2632:2: rule__Select__Group__0__Impl rule__Select__Group__1
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
    // InternalSocialRequest.g:2639:1: rule__Select__Group__0__Impl : ( 'SELECT' ) ;
    public final void rule__Select__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2643:1: ( ( 'SELECT' ) )
            // InternalSocialRequest.g:2644:1: ( 'SELECT' )
            {
            // InternalSocialRequest.g:2644:1: ( 'SELECT' )
            // InternalSocialRequest.g:2645:2: 'SELECT'
            {
             before(grammarAccess.getSelectAccess().getSELECTKeyword_0()); 
            match(input,55,FOLLOW_2); 
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
    // InternalSocialRequest.g:2654:1: rule__Select__Group__1 : rule__Select__Group__1__Impl rule__Select__Group__2 ;
    public final void rule__Select__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2658:1: ( rule__Select__Group__1__Impl rule__Select__Group__2 )
            // InternalSocialRequest.g:2659:2: rule__Select__Group__1__Impl rule__Select__Group__2
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
    // InternalSocialRequest.g:2666:1: rule__Select__Group__1__Impl : ( ( rule__Select__IsDistinctAssignment_1 )? ) ;
    public final void rule__Select__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2670:1: ( ( ( rule__Select__IsDistinctAssignment_1 )? ) )
            // InternalSocialRequest.g:2671:1: ( ( rule__Select__IsDistinctAssignment_1 )? )
            {
            // InternalSocialRequest.g:2671:1: ( ( rule__Select__IsDistinctAssignment_1 )? )
            // InternalSocialRequest.g:2672:2: ( rule__Select__IsDistinctAssignment_1 )?
            {
             before(grammarAccess.getSelectAccess().getIsDistinctAssignment_1()); 
            // InternalSocialRequest.g:2673:2: ( rule__Select__IsDistinctAssignment_1 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==64) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalSocialRequest.g:2673:3: rule__Select__IsDistinctAssignment_1
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
    // InternalSocialRequest.g:2681:1: rule__Select__Group__2 : rule__Select__Group__2__Impl rule__Select__Group__3 ;
    public final void rule__Select__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2685:1: ( rule__Select__Group__2__Impl rule__Select__Group__3 )
            // InternalSocialRequest.g:2686:2: rule__Select__Group__2__Impl rule__Select__Group__3
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
    // InternalSocialRequest.g:2693:1: rule__Select__Group__2__Impl : ( '{' ) ;
    public final void rule__Select__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2697:1: ( ( '{' ) )
            // InternalSocialRequest.g:2698:1: ( '{' )
            {
            // InternalSocialRequest.g:2698:1: ( '{' )
            // InternalSocialRequest.g:2699:2: '{'
            {
             before(grammarAccess.getSelectAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,39,FOLLOW_2); 
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
    // InternalSocialRequest.g:2708:1: rule__Select__Group__3 : rule__Select__Group__3__Impl rule__Select__Group__4 ;
    public final void rule__Select__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2712:1: ( rule__Select__Group__3__Impl rule__Select__Group__4 )
            // InternalSocialRequest.g:2713:2: rule__Select__Group__3__Impl rule__Select__Group__4
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
    // InternalSocialRequest.g:2720:1: rule__Select__Group__3__Impl : ( ( rule__Select__ClauseAssignment_3 ) ) ;
    public final void rule__Select__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2724:1: ( ( ( rule__Select__ClauseAssignment_3 ) ) )
            // InternalSocialRequest.g:2725:1: ( ( rule__Select__ClauseAssignment_3 ) )
            {
            // InternalSocialRequest.g:2725:1: ( ( rule__Select__ClauseAssignment_3 ) )
            // InternalSocialRequest.g:2726:2: ( rule__Select__ClauseAssignment_3 )
            {
             before(grammarAccess.getSelectAccess().getClauseAssignment_3()); 
            // InternalSocialRequest.g:2727:2: ( rule__Select__ClauseAssignment_3 )
            // InternalSocialRequest.g:2727:3: rule__Select__ClauseAssignment_3
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
    // InternalSocialRequest.g:2735:1: rule__Select__Group__4 : rule__Select__Group__4__Impl ;
    public final void rule__Select__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2739:1: ( rule__Select__Group__4__Impl )
            // InternalSocialRequest.g:2740:2: rule__Select__Group__4__Impl
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
    // InternalSocialRequest.g:2746:1: rule__Select__Group__4__Impl : ( '}' ) ;
    public final void rule__Select__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2750:1: ( ( '}' ) )
            // InternalSocialRequest.g:2751:1: ( '}' )
            {
            // InternalSocialRequest.g:2751:1: ( '}' )
            // InternalSocialRequest.g:2752:2: '}'
            {
             before(grammarAccess.getSelectAccess().getRightCurlyBracketKeyword_4()); 
            match(input,40,FOLLOW_2); 
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
    // InternalSocialRequest.g:2762:1: rule__From__Group__0 : rule__From__Group__0__Impl rule__From__Group__1 ;
    public final void rule__From__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2766:1: ( rule__From__Group__0__Impl rule__From__Group__1 )
            // InternalSocialRequest.g:2767:2: rule__From__Group__0__Impl rule__From__Group__1
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
    // InternalSocialRequest.g:2774:1: rule__From__Group__0__Impl : ( 'FROM' ) ;
    public final void rule__From__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2778:1: ( ( 'FROM' ) )
            // InternalSocialRequest.g:2779:1: ( 'FROM' )
            {
            // InternalSocialRequest.g:2779:1: ( 'FROM' )
            // InternalSocialRequest.g:2780:2: 'FROM'
            {
             before(grammarAccess.getFromAccess().getFROMKeyword_0()); 
            match(input,56,FOLLOW_2); 
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
    // InternalSocialRequest.g:2789:1: rule__From__Group__1 : rule__From__Group__1__Impl rule__From__Group__2 ;
    public final void rule__From__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2793:1: ( rule__From__Group__1__Impl rule__From__Group__2 )
            // InternalSocialRequest.g:2794:2: rule__From__Group__1__Impl rule__From__Group__2
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
    // InternalSocialRequest.g:2801:1: rule__From__Group__1__Impl : ( '{' ) ;
    public final void rule__From__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2805:1: ( ( '{' ) )
            // InternalSocialRequest.g:2806:1: ( '{' )
            {
            // InternalSocialRequest.g:2806:1: ( '{' )
            // InternalSocialRequest.g:2807:2: '{'
            {
             before(grammarAccess.getFromAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,39,FOLLOW_2); 
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
    // InternalSocialRequest.g:2816:1: rule__From__Group__2 : rule__From__Group__2__Impl rule__From__Group__3 ;
    public final void rule__From__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2820:1: ( rule__From__Group__2__Impl rule__From__Group__3 )
            // InternalSocialRequest.g:2821:2: rule__From__Group__2__Impl rule__From__Group__3
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
    // InternalSocialRequest.g:2828:1: rule__From__Group__2__Impl : ( ( rule__From__EntityAssignment_2 ) ) ;
    public final void rule__From__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2832:1: ( ( ( rule__From__EntityAssignment_2 ) ) )
            // InternalSocialRequest.g:2833:1: ( ( rule__From__EntityAssignment_2 ) )
            {
            // InternalSocialRequest.g:2833:1: ( ( rule__From__EntityAssignment_2 ) )
            // InternalSocialRequest.g:2834:2: ( rule__From__EntityAssignment_2 )
            {
             before(grammarAccess.getFromAccess().getEntityAssignment_2()); 
            // InternalSocialRequest.g:2835:2: ( rule__From__EntityAssignment_2 )
            // InternalSocialRequest.g:2835:3: rule__From__EntityAssignment_2
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
    // InternalSocialRequest.g:2843:1: rule__From__Group__3 : rule__From__Group__3__Impl rule__From__Group__4 ;
    public final void rule__From__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2847:1: ( rule__From__Group__3__Impl rule__From__Group__4 )
            // InternalSocialRequest.g:2848:2: rule__From__Group__3__Impl rule__From__Group__4
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
    // InternalSocialRequest.g:2855:1: rule__From__Group__3__Impl : ( ( rule__From__AliasAssignment_3 ) ) ;
    public final void rule__From__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2859:1: ( ( ( rule__From__AliasAssignment_3 ) ) )
            // InternalSocialRequest.g:2860:1: ( ( rule__From__AliasAssignment_3 ) )
            {
            // InternalSocialRequest.g:2860:1: ( ( rule__From__AliasAssignment_3 ) )
            // InternalSocialRequest.g:2861:2: ( rule__From__AliasAssignment_3 )
            {
             before(grammarAccess.getFromAccess().getAliasAssignment_3()); 
            // InternalSocialRequest.g:2862:2: ( rule__From__AliasAssignment_3 )
            // InternalSocialRequest.g:2862:3: rule__From__AliasAssignment_3
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
    // InternalSocialRequest.g:2870:1: rule__From__Group__4 : rule__From__Group__4__Impl ;
    public final void rule__From__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2874:1: ( rule__From__Group__4__Impl )
            // InternalSocialRequest.g:2875:2: rule__From__Group__4__Impl
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
    // InternalSocialRequest.g:2881:1: rule__From__Group__4__Impl : ( '}' ) ;
    public final void rule__From__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2885:1: ( ( '}' ) )
            // InternalSocialRequest.g:2886:1: ( '}' )
            {
            // InternalSocialRequest.g:2886:1: ( '}' )
            // InternalSocialRequest.g:2887:2: '}'
            {
             before(grammarAccess.getFromAccess().getRightCurlyBracketKeyword_4()); 
            match(input,40,FOLLOW_2); 
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
    // InternalSocialRequest.g:2897:1: rule__Join__Group__0 : rule__Join__Group__0__Impl rule__Join__Group__1 ;
    public final void rule__Join__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2901:1: ( rule__Join__Group__0__Impl rule__Join__Group__1 )
            // InternalSocialRequest.g:2902:2: rule__Join__Group__0__Impl rule__Join__Group__1
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
    // InternalSocialRequest.g:2909:1: rule__Join__Group__0__Impl : ( ( rule__Join__JoinTypeAssignment_0 ) ) ;
    public final void rule__Join__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2913:1: ( ( ( rule__Join__JoinTypeAssignment_0 ) ) )
            // InternalSocialRequest.g:2914:1: ( ( rule__Join__JoinTypeAssignment_0 ) )
            {
            // InternalSocialRequest.g:2914:1: ( ( rule__Join__JoinTypeAssignment_0 ) )
            // InternalSocialRequest.g:2915:2: ( rule__Join__JoinTypeAssignment_0 )
            {
             before(grammarAccess.getJoinAccess().getJoinTypeAssignment_0()); 
            // InternalSocialRequest.g:2916:2: ( rule__Join__JoinTypeAssignment_0 )
            // InternalSocialRequest.g:2916:3: rule__Join__JoinTypeAssignment_0
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
    // InternalSocialRequest.g:2924:1: rule__Join__Group__1 : rule__Join__Group__1__Impl rule__Join__Group__2 ;
    public final void rule__Join__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2928:1: ( rule__Join__Group__1__Impl rule__Join__Group__2 )
            // InternalSocialRequest.g:2929:2: rule__Join__Group__1__Impl rule__Join__Group__2
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
    // InternalSocialRequest.g:2936:1: rule__Join__Group__1__Impl : ( '{' ) ;
    public final void rule__Join__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2940:1: ( ( '{' ) )
            // InternalSocialRequest.g:2941:1: ( '{' )
            {
            // InternalSocialRequest.g:2941:1: ( '{' )
            // InternalSocialRequest.g:2942:2: '{'
            {
             before(grammarAccess.getJoinAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,39,FOLLOW_2); 
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
    // InternalSocialRequest.g:2951:1: rule__Join__Group__2 : rule__Join__Group__2__Impl rule__Join__Group__3 ;
    public final void rule__Join__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2955:1: ( rule__Join__Group__2__Impl rule__Join__Group__3 )
            // InternalSocialRequest.g:2956:2: rule__Join__Group__2__Impl rule__Join__Group__3
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
    // InternalSocialRequest.g:2963:1: rule__Join__Group__2__Impl : ( ( rule__Join__EntityAssignment_2 ) ) ;
    public final void rule__Join__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2967:1: ( ( ( rule__Join__EntityAssignment_2 ) ) )
            // InternalSocialRequest.g:2968:1: ( ( rule__Join__EntityAssignment_2 ) )
            {
            // InternalSocialRequest.g:2968:1: ( ( rule__Join__EntityAssignment_2 ) )
            // InternalSocialRequest.g:2969:2: ( rule__Join__EntityAssignment_2 )
            {
             before(grammarAccess.getJoinAccess().getEntityAssignment_2()); 
            // InternalSocialRequest.g:2970:2: ( rule__Join__EntityAssignment_2 )
            // InternalSocialRequest.g:2970:3: rule__Join__EntityAssignment_2
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
    // InternalSocialRequest.g:2978:1: rule__Join__Group__3 : rule__Join__Group__3__Impl rule__Join__Group__4 ;
    public final void rule__Join__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2982:1: ( rule__Join__Group__3__Impl rule__Join__Group__4 )
            // InternalSocialRequest.g:2983:2: rule__Join__Group__3__Impl rule__Join__Group__4
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
    // InternalSocialRequest.g:2990:1: rule__Join__Group__3__Impl : ( ( rule__Join__AliasAssignment_3 ) ) ;
    public final void rule__Join__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2994:1: ( ( ( rule__Join__AliasAssignment_3 ) ) )
            // InternalSocialRequest.g:2995:1: ( ( rule__Join__AliasAssignment_3 ) )
            {
            // InternalSocialRequest.g:2995:1: ( ( rule__Join__AliasAssignment_3 ) )
            // InternalSocialRequest.g:2996:2: ( rule__Join__AliasAssignment_3 )
            {
             before(grammarAccess.getJoinAccess().getAliasAssignment_3()); 
            // InternalSocialRequest.g:2997:2: ( rule__Join__AliasAssignment_3 )
            // InternalSocialRequest.g:2997:3: rule__Join__AliasAssignment_3
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
    // InternalSocialRequest.g:3005:1: rule__Join__Group__4 : rule__Join__Group__4__Impl rule__Join__Group__5 ;
    public final void rule__Join__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:3009:1: ( rule__Join__Group__4__Impl rule__Join__Group__5 )
            // InternalSocialRequest.g:3010:2: rule__Join__Group__4__Impl rule__Join__Group__5
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
    // InternalSocialRequest.g:3017:1: rule__Join__Group__4__Impl : ( '}' ) ;
    public final void rule__Join__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:3021:1: ( ( '}' ) )
            // InternalSocialRequest.g:3022:1: ( '}' )
            {
            // InternalSocialRequest.g:3022:1: ( '}' )
            // InternalSocialRequest.g:3023:2: '}'
            {
             before(grammarAccess.getJoinAccess().getRightCurlyBracketKeyword_4()); 
            match(input,40,FOLLOW_2); 
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
    // InternalSocialRequest.g:3032:1: rule__Join__Group__5 : rule__Join__Group__5__Impl ;
    public final void rule__Join__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:3036:1: ( rule__Join__Group__5__Impl )
            // InternalSocialRequest.g:3037:2: rule__Join__Group__5__Impl
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
    // InternalSocialRequest.g:3043:1: rule__Join__Group__5__Impl : ( ( rule__Join__Group_5__0 )? ) ;
    public final void rule__Join__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:3047:1: ( ( ( rule__Join__Group_5__0 )? ) )
            // InternalSocialRequest.g:3048:1: ( ( rule__Join__Group_5__0 )? )
            {
            // InternalSocialRequest.g:3048:1: ( ( rule__Join__Group_5__0 )? )
            // InternalSocialRequest.g:3049:2: ( rule__Join__Group_5__0 )?
            {
             before(grammarAccess.getJoinAccess().getGroup_5()); 
            // InternalSocialRequest.g:3050:2: ( rule__Join__Group_5__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==57) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalSocialRequest.g:3050:3: rule__Join__Group_5__0
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
    // InternalSocialRequest.g:3059:1: rule__Join__Group_5__0 : rule__Join__Group_5__0__Impl rule__Join__Group_5__1 ;
    public final void rule__Join__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:3063:1: ( rule__Join__Group_5__0__Impl rule__Join__Group_5__1 )
            // InternalSocialRequest.g:3064:2: rule__Join__Group_5__0__Impl rule__Join__Group_5__1
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
    // InternalSocialRequest.g:3071:1: rule__Join__Group_5__0__Impl : ( 'ON' ) ;
    public final void rule__Join__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:3075:1: ( ( 'ON' ) )
            // InternalSocialRequest.g:3076:1: ( 'ON' )
            {
            // InternalSocialRequest.g:3076:1: ( 'ON' )
            // InternalSocialRequest.g:3077:2: 'ON'
            {
             before(grammarAccess.getJoinAccess().getONKeyword_5_0()); 
            match(input,57,FOLLOW_2); 
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
    // InternalSocialRequest.g:3086:1: rule__Join__Group_5__1 : rule__Join__Group_5__1__Impl rule__Join__Group_5__2 ;
    public final void rule__Join__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:3090:1: ( rule__Join__Group_5__1__Impl rule__Join__Group_5__2 )
            // InternalSocialRequest.g:3091:2: rule__Join__Group_5__1__Impl rule__Join__Group_5__2
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
    // InternalSocialRequest.g:3098:1: rule__Join__Group_5__1__Impl : ( '{' ) ;
    public final void rule__Join__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:3102:1: ( ( '{' ) )
            // InternalSocialRequest.g:3103:1: ( '{' )
            {
            // InternalSocialRequest.g:3103:1: ( '{' )
            // InternalSocialRequest.g:3104:2: '{'
            {
             before(grammarAccess.getJoinAccess().getLeftCurlyBracketKeyword_5_1()); 
            match(input,39,FOLLOW_2); 
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
    // InternalSocialRequest.g:3113:1: rule__Join__Group_5__2 : rule__Join__Group_5__2__Impl rule__Join__Group_5__3 ;
    public final void rule__Join__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:3117:1: ( rule__Join__Group_5__2__Impl rule__Join__Group_5__3 )
            // InternalSocialRequest.g:3118:2: rule__Join__Group_5__2__Impl rule__Join__Group_5__3
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
    // InternalSocialRequest.g:3125:1: rule__Join__Group_5__2__Impl : ( ( rule__Join__JoinConditionAssignment_5_2 ) ) ;
    public final void rule__Join__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:3129:1: ( ( ( rule__Join__JoinConditionAssignment_5_2 ) ) )
            // InternalSocialRequest.g:3130:1: ( ( rule__Join__JoinConditionAssignment_5_2 ) )
            {
            // InternalSocialRequest.g:3130:1: ( ( rule__Join__JoinConditionAssignment_5_2 ) )
            // InternalSocialRequest.g:3131:2: ( rule__Join__JoinConditionAssignment_5_2 )
            {
             before(grammarAccess.getJoinAccess().getJoinConditionAssignment_5_2()); 
            // InternalSocialRequest.g:3132:2: ( rule__Join__JoinConditionAssignment_5_2 )
            // InternalSocialRequest.g:3132:3: rule__Join__JoinConditionAssignment_5_2
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
    // InternalSocialRequest.g:3140:1: rule__Join__Group_5__3 : rule__Join__Group_5__3__Impl ;
    public final void rule__Join__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:3144:1: ( rule__Join__Group_5__3__Impl )
            // InternalSocialRequest.g:3145:2: rule__Join__Group_5__3__Impl
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
    // InternalSocialRequest.g:3151:1: rule__Join__Group_5__3__Impl : ( '}' ) ;
    public final void rule__Join__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:3155:1: ( ( '}' ) )
            // InternalSocialRequest.g:3156:1: ( '}' )
            {
            // InternalSocialRequest.g:3156:1: ( '}' )
            // InternalSocialRequest.g:3157:2: '}'
            {
             before(grammarAccess.getJoinAccess().getRightCurlyBracketKeyword_5_3()); 
            match(input,40,FOLLOW_2); 
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
    // InternalSocialRequest.g:3167:1: rule__Where__Group__0 : rule__Where__Group__0__Impl rule__Where__Group__1 ;
    public final void rule__Where__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:3171:1: ( rule__Where__Group__0__Impl rule__Where__Group__1 )
            // InternalSocialRequest.g:3172:2: rule__Where__Group__0__Impl rule__Where__Group__1
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
    // InternalSocialRequest.g:3179:1: rule__Where__Group__0__Impl : ( 'WHERE' ) ;
    public final void rule__Where__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:3183:1: ( ( 'WHERE' ) )
            // InternalSocialRequest.g:3184:1: ( 'WHERE' )
            {
            // InternalSocialRequest.g:3184:1: ( 'WHERE' )
            // InternalSocialRequest.g:3185:2: 'WHERE'
            {
             before(grammarAccess.getWhereAccess().getWHEREKeyword_0()); 
            match(input,58,FOLLOW_2); 
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
    // InternalSocialRequest.g:3194:1: rule__Where__Group__1 : rule__Where__Group__1__Impl rule__Where__Group__2 ;
    public final void rule__Where__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:3198:1: ( rule__Where__Group__1__Impl rule__Where__Group__2 )
            // InternalSocialRequest.g:3199:2: rule__Where__Group__1__Impl rule__Where__Group__2
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
    // InternalSocialRequest.g:3206:1: rule__Where__Group__1__Impl : ( '{' ) ;
    public final void rule__Where__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:3210:1: ( ( '{' ) )
            // InternalSocialRequest.g:3211:1: ( '{' )
            {
            // InternalSocialRequest.g:3211:1: ( '{' )
            // InternalSocialRequest.g:3212:2: '{'
            {
             before(grammarAccess.getWhereAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,39,FOLLOW_2); 
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
    // InternalSocialRequest.g:3221:1: rule__Where__Group__2 : rule__Where__Group__2__Impl rule__Where__Group__3 ;
    public final void rule__Where__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:3225:1: ( rule__Where__Group__2__Impl rule__Where__Group__3 )
            // InternalSocialRequest.g:3226:2: rule__Where__Group__2__Impl rule__Where__Group__3
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
    // InternalSocialRequest.g:3233:1: rule__Where__Group__2__Impl : ( ( rule__Where__ConditionAssignment_2 ) ) ;
    public final void rule__Where__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:3237:1: ( ( ( rule__Where__ConditionAssignment_2 ) ) )
            // InternalSocialRequest.g:3238:1: ( ( rule__Where__ConditionAssignment_2 ) )
            {
            // InternalSocialRequest.g:3238:1: ( ( rule__Where__ConditionAssignment_2 ) )
            // InternalSocialRequest.g:3239:2: ( rule__Where__ConditionAssignment_2 )
            {
             before(grammarAccess.getWhereAccess().getConditionAssignment_2()); 
            // InternalSocialRequest.g:3240:2: ( rule__Where__ConditionAssignment_2 )
            // InternalSocialRequest.g:3240:3: rule__Where__ConditionAssignment_2
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
    // InternalSocialRequest.g:3248:1: rule__Where__Group__3 : rule__Where__Group__3__Impl ;
    public final void rule__Where__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:3252:1: ( rule__Where__Group__3__Impl )
            // InternalSocialRequest.g:3253:2: rule__Where__Group__3__Impl
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
    // InternalSocialRequest.g:3259:1: rule__Where__Group__3__Impl : ( '}' ) ;
    public final void rule__Where__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:3263:1: ( ( '}' ) )
            // InternalSocialRequest.g:3264:1: ( '}' )
            {
            // InternalSocialRequest.g:3264:1: ( '}' )
            // InternalSocialRequest.g:3265:2: '}'
            {
             before(grammarAccess.getWhereAccess().getRightCurlyBracketKeyword_3()); 
            match(input,40,FOLLOW_2); 
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
    // InternalSocialRequest.g:3275:1: rule__Order__Group__0 : rule__Order__Group__0__Impl rule__Order__Group__1 ;
    public final void rule__Order__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:3279:1: ( rule__Order__Group__0__Impl rule__Order__Group__1 )
            // InternalSocialRequest.g:3280:2: rule__Order__Group__0__Impl rule__Order__Group__1
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
    // InternalSocialRequest.g:3287:1: rule__Order__Group__0__Impl : ( 'ORDER BY' ) ;
    public final void rule__Order__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:3291:1: ( ( 'ORDER BY' ) )
            // InternalSocialRequest.g:3292:1: ( 'ORDER BY' )
            {
            // InternalSocialRequest.g:3292:1: ( 'ORDER BY' )
            // InternalSocialRequest.g:3293:2: 'ORDER BY'
            {
             before(grammarAccess.getOrderAccess().getORDERBYKeyword_0()); 
            match(input,59,FOLLOW_2); 
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
    // InternalSocialRequest.g:3302:1: rule__Order__Group__1 : rule__Order__Group__1__Impl rule__Order__Group__2 ;
    public final void rule__Order__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:3306:1: ( rule__Order__Group__1__Impl rule__Order__Group__2 )
            // InternalSocialRequest.g:3307:2: rule__Order__Group__1__Impl rule__Order__Group__2
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
    // InternalSocialRequest.g:3314:1: rule__Order__Group__1__Impl : ( '{' ) ;
    public final void rule__Order__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:3318:1: ( ( '{' ) )
            // InternalSocialRequest.g:3319:1: ( '{' )
            {
            // InternalSocialRequest.g:3319:1: ( '{' )
            // InternalSocialRequest.g:3320:2: '{'
            {
             before(grammarAccess.getOrderAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,39,FOLLOW_2); 
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
    // InternalSocialRequest.g:3329:1: rule__Order__Group__2 : rule__Order__Group__2__Impl rule__Order__Group__3 ;
    public final void rule__Order__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:3333:1: ( rule__Order__Group__2__Impl rule__Order__Group__3 )
            // InternalSocialRequest.g:3334:2: rule__Order__Group__2__Impl rule__Order__Group__3
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
    // InternalSocialRequest.g:3341:1: rule__Order__Group__2__Impl : ( ( rule__Order__OrderAssignment_2 ) ) ;
    public final void rule__Order__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:3345:1: ( ( ( rule__Order__OrderAssignment_2 ) ) )
            // InternalSocialRequest.g:3346:1: ( ( rule__Order__OrderAssignment_2 ) )
            {
            // InternalSocialRequest.g:3346:1: ( ( rule__Order__OrderAssignment_2 ) )
            // InternalSocialRequest.g:3347:2: ( rule__Order__OrderAssignment_2 )
            {
             before(grammarAccess.getOrderAccess().getOrderAssignment_2()); 
            // InternalSocialRequest.g:3348:2: ( rule__Order__OrderAssignment_2 )
            // InternalSocialRequest.g:3348:3: rule__Order__OrderAssignment_2
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
    // InternalSocialRequest.g:3356:1: rule__Order__Group__3 : rule__Order__Group__3__Impl ;
    public final void rule__Order__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:3360:1: ( rule__Order__Group__3__Impl )
            // InternalSocialRequest.g:3361:2: rule__Order__Group__3__Impl
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
    // InternalSocialRequest.g:3367:1: rule__Order__Group__3__Impl : ( '}' ) ;
    public final void rule__Order__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:3371:1: ( ( '}' ) )
            // InternalSocialRequest.g:3372:1: ( '}' )
            {
            // InternalSocialRequest.g:3372:1: ( '}' )
            // InternalSocialRequest.g:3373:2: '}'
            {
             before(grammarAccess.getOrderAccess().getRightCurlyBracketKeyword_3()); 
            match(input,40,FOLLOW_2); 
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
    // InternalSocialRequest.g:3383:1: rule__Attribute__UnorderedGroup_5_1 : ( rule__Attribute__UnorderedGroup_5_1__0 )? ;
    public final void rule__Attribute__UnorderedGroup_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getAttributeAccess().getUnorderedGroup_5_1());
        	
        try {
            // InternalSocialRequest.g:3388:1: ( ( rule__Attribute__UnorderedGroup_5_1__0 )? )
            // InternalSocialRequest.g:3389:2: ( rule__Attribute__UnorderedGroup_5_1__0 )?
            {
            // InternalSocialRequest.g:3389:2: ( rule__Attribute__UnorderedGroup_5_1__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( LA28_0 == 43 && getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_1(), 0) ) {
                alt28=1;
            }
            else if ( LA28_0 == 44 && getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_1(), 1) ) {
                alt28=1;
            }
            else if ( LA28_0 == 45 && getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_1(), 2) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalSocialRequest.g:3389:2: rule__Attribute__UnorderedGroup_5_1__0
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
    // InternalSocialRequest.g:3397:1: rule__Attribute__UnorderedGroup_5_1__Impl : ( ({...}? => ( ( ( rule__Attribute__Group_5_1_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Attribute__Group_5_1_1__0 ) ) ) ) | ({...}? => ( ( ( rule__Attribute__Group_5_1_2__0 ) ) ) ) ) ;
    public final void rule__Attribute__UnorderedGroup_5_1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
        	
        try {
            // InternalSocialRequest.g:3402:1: ( ( ({...}? => ( ( ( rule__Attribute__Group_5_1_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Attribute__Group_5_1_1__0 ) ) ) ) | ({...}? => ( ( ( rule__Attribute__Group_5_1_2__0 ) ) ) ) ) )
            // InternalSocialRequest.g:3403:3: ( ({...}? => ( ( ( rule__Attribute__Group_5_1_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Attribute__Group_5_1_1__0 ) ) ) ) | ({...}? => ( ( ( rule__Attribute__Group_5_1_2__0 ) ) ) ) )
            {
            // InternalSocialRequest.g:3403:3: ( ({...}? => ( ( ( rule__Attribute__Group_5_1_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Attribute__Group_5_1_1__0 ) ) ) ) | ({...}? => ( ( ( rule__Attribute__Group_5_1_2__0 ) ) ) ) )
            int alt29=3;
            int LA29_0 = input.LA(1);

            if ( LA29_0 == 43 && getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_1(), 0) ) {
                alt29=1;
            }
            else if ( LA29_0 == 44 && getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_1(), 1) ) {
                alt29=2;
            }
            else if ( LA29_0 == 45 && getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_1(), 2) ) {
                alt29=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // InternalSocialRequest.g:3404:3: ({...}? => ( ( ( rule__Attribute__Group_5_1_0__0 ) ) ) )
                    {
                    // InternalSocialRequest.g:3404:3: ({...}? => ( ( ( rule__Attribute__Group_5_1_0__0 ) ) ) )
                    // InternalSocialRequest.g:3405:4: {...}? => ( ( ( rule__Attribute__Group_5_1_0__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_1(), 0) ) {
                        throw new FailedPredicateException(input, "rule__Attribute__UnorderedGroup_5_1__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_1(), 0)");
                    }
                    // InternalSocialRequest.g:3405:107: ( ( ( rule__Attribute__Group_5_1_0__0 ) ) )
                    // InternalSocialRequest.g:3406:5: ( ( rule__Attribute__Group_5_1_0__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getAttributeAccess().getUnorderedGroup_5_1(), 0);
                    				

                    					selected = true;
                    				
                    // InternalSocialRequest.g:3412:5: ( ( rule__Attribute__Group_5_1_0__0 ) )
                    // InternalSocialRequest.g:3413:6: ( rule__Attribute__Group_5_1_0__0 )
                    {
                     before(grammarAccess.getAttributeAccess().getGroup_5_1_0()); 
                    // InternalSocialRequest.g:3414:6: ( rule__Attribute__Group_5_1_0__0 )
                    // InternalSocialRequest.g:3414:7: rule__Attribute__Group_5_1_0__0
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
                    // InternalSocialRequest.g:3419:3: ({...}? => ( ( ( rule__Attribute__Group_5_1_1__0 ) ) ) )
                    {
                    // InternalSocialRequest.g:3419:3: ({...}? => ( ( ( rule__Attribute__Group_5_1_1__0 ) ) ) )
                    // InternalSocialRequest.g:3420:4: {...}? => ( ( ( rule__Attribute__Group_5_1_1__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_1(), 1) ) {
                        throw new FailedPredicateException(input, "rule__Attribute__UnorderedGroup_5_1__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_1(), 1)");
                    }
                    // InternalSocialRequest.g:3420:107: ( ( ( rule__Attribute__Group_5_1_1__0 ) ) )
                    // InternalSocialRequest.g:3421:5: ( ( rule__Attribute__Group_5_1_1__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getAttributeAccess().getUnorderedGroup_5_1(), 1);
                    				

                    					selected = true;
                    				
                    // InternalSocialRequest.g:3427:5: ( ( rule__Attribute__Group_5_1_1__0 ) )
                    // InternalSocialRequest.g:3428:6: ( rule__Attribute__Group_5_1_1__0 )
                    {
                     before(grammarAccess.getAttributeAccess().getGroup_5_1_1()); 
                    // InternalSocialRequest.g:3429:6: ( rule__Attribute__Group_5_1_1__0 )
                    // InternalSocialRequest.g:3429:7: rule__Attribute__Group_5_1_1__0
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
                    // InternalSocialRequest.g:3434:3: ({...}? => ( ( ( rule__Attribute__Group_5_1_2__0 ) ) ) )
                    {
                    // InternalSocialRequest.g:3434:3: ({...}? => ( ( ( rule__Attribute__Group_5_1_2__0 ) ) ) )
                    // InternalSocialRequest.g:3435:4: {...}? => ( ( ( rule__Attribute__Group_5_1_2__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_1(), 2) ) {
                        throw new FailedPredicateException(input, "rule__Attribute__UnorderedGroup_5_1__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_1(), 2)");
                    }
                    // InternalSocialRequest.g:3435:107: ( ( ( rule__Attribute__Group_5_1_2__0 ) ) )
                    // InternalSocialRequest.g:3436:5: ( ( rule__Attribute__Group_5_1_2__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getAttributeAccess().getUnorderedGroup_5_1(), 2);
                    				

                    					selected = true;
                    				
                    // InternalSocialRequest.g:3442:5: ( ( rule__Attribute__Group_5_1_2__0 ) )
                    // InternalSocialRequest.g:3443:6: ( rule__Attribute__Group_5_1_2__0 )
                    {
                     before(grammarAccess.getAttributeAccess().getGroup_5_1_2()); 
                    // InternalSocialRequest.g:3444:6: ( rule__Attribute__Group_5_1_2__0 )
                    // InternalSocialRequest.g:3444:7: rule__Attribute__Group_5_1_2__0
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
    // InternalSocialRequest.g:3457:1: rule__Attribute__UnorderedGroup_5_1__0 : rule__Attribute__UnorderedGroup_5_1__Impl ( rule__Attribute__UnorderedGroup_5_1__1 )? ;
    public final void rule__Attribute__UnorderedGroup_5_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:3461:1: ( rule__Attribute__UnorderedGroup_5_1__Impl ( rule__Attribute__UnorderedGroup_5_1__1 )? )
            // InternalSocialRequest.g:3462:2: rule__Attribute__UnorderedGroup_5_1__Impl ( rule__Attribute__UnorderedGroup_5_1__1 )?
            {
            pushFollow(FOLLOW_37);
            rule__Attribute__UnorderedGroup_5_1__Impl();

            state._fsp--;

            // InternalSocialRequest.g:3463:2: ( rule__Attribute__UnorderedGroup_5_1__1 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( LA30_0 == 43 && getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_1(), 0) ) {
                alt30=1;
            }
            else if ( LA30_0 == 44 && getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_1(), 1) ) {
                alt30=1;
            }
            else if ( LA30_0 == 45 && getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_1(), 2) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalSocialRequest.g:3463:2: rule__Attribute__UnorderedGroup_5_1__1
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
    // InternalSocialRequest.g:3469:1: rule__Attribute__UnorderedGroup_5_1__1 : rule__Attribute__UnorderedGroup_5_1__Impl ( rule__Attribute__UnorderedGroup_5_1__2 )? ;
    public final void rule__Attribute__UnorderedGroup_5_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:3473:1: ( rule__Attribute__UnorderedGroup_5_1__Impl ( rule__Attribute__UnorderedGroup_5_1__2 )? )
            // InternalSocialRequest.g:3474:2: rule__Attribute__UnorderedGroup_5_1__Impl ( rule__Attribute__UnorderedGroup_5_1__2 )?
            {
            pushFollow(FOLLOW_37);
            rule__Attribute__UnorderedGroup_5_1__Impl();

            state._fsp--;

            // InternalSocialRequest.g:3475:2: ( rule__Attribute__UnorderedGroup_5_1__2 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( LA31_0 == 43 && getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_1(), 0) ) {
                alt31=1;
            }
            else if ( LA31_0 == 44 && getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_1(), 1) ) {
                alt31=1;
            }
            else if ( LA31_0 == 45 && getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_1(), 2) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalSocialRequest.g:3475:2: rule__Attribute__UnorderedGroup_5_1__2
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
    // InternalSocialRequest.g:3481:1: rule__Attribute__UnorderedGroup_5_1__2 : rule__Attribute__UnorderedGroup_5_1__Impl ;
    public final void rule__Attribute__UnorderedGroup_5_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:3485:1: ( rule__Attribute__UnorderedGroup_5_1__Impl )
            // InternalSocialRequest.g:3486:2: rule__Attribute__UnorderedGroup_5_1__Impl
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
    // InternalSocialRequest.g:3493:1: rule__Model__EntitiesAssignment_0 : ( ruleEntity ) ;
    public final void rule__Model__EntitiesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:3497:1: ( ( ruleEntity ) )
            // InternalSocialRequest.g:3498:2: ( ruleEntity )
            {
            // InternalSocialRequest.g:3498:2: ( ruleEntity )
            // InternalSocialRequest.g:3499:3: ruleEntity
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
    // InternalSocialRequest.g:3508:1: rule__Model__RepositoriesAssignment_1 : ( ruleRepository ) ;
    public final void rule__Model__RepositoriesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:3512:1: ( ( ruleRepository ) )
            // InternalSocialRequest.g:3513:2: ( ruleRepository )
            {
            // InternalSocialRequest.g:3513:2: ( ruleRepository )
            // InternalSocialRequest.g:3514:3: ruleRepository
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
    // InternalSocialRequest.g:3523:1: rule__Entity__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Entity__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:3527:1: ( ( RULE_ID ) )
            // InternalSocialRequest.g:3528:2: ( RULE_ID )
            {
            // InternalSocialRequest.g:3528:2: ( RULE_ID )
            // InternalSocialRequest.g:3529:3: RULE_ID
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
    // InternalSocialRequest.g:3538:1: rule__Entity__HasUserDetailsAssignment_2_0 : ( ( 'implements' ) ) ;
    public final void rule__Entity__HasUserDetailsAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:3542:1: ( ( ( 'implements' ) ) )
            // InternalSocialRequest.g:3543:2: ( ( 'implements' ) )
            {
            // InternalSocialRequest.g:3543:2: ( ( 'implements' ) )
            // InternalSocialRequest.g:3544:3: ( 'implements' )
            {
             before(grammarAccess.getEntityAccess().getHasUserDetailsImplementsKeyword_2_0_0()); 
            // InternalSocialRequest.g:3545:3: ( 'implements' )
            // InternalSocialRequest.g:3546:4: 'implements'
            {
             before(grammarAccess.getEntityAccess().getHasUserDetailsImplementsKeyword_2_0_0()); 
            match(input,60,FOLLOW_2); 
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
    // InternalSocialRequest.g:3557:1: rule__Entity__AttributesAssignment_4 : ( ruleAttribute ) ;
    public final void rule__Entity__AttributesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:3561:1: ( ( ruleAttribute ) )
            // InternalSocialRequest.g:3562:2: ( ruleAttribute )
            {
            // InternalSocialRequest.g:3562:2: ( ruleAttribute )
            // InternalSocialRequest.g:3563:3: ruleAttribute
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
    // InternalSocialRequest.g:3572:1: rule__Attribute__AssociationAssignment_0 : ( ruleASSOCIATION ) ;
    public final void rule__Attribute__AssociationAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:3576:1: ( ( ruleASSOCIATION ) )
            // InternalSocialRequest.g:3577:2: ( ruleASSOCIATION )
            {
            // InternalSocialRequest.g:3577:2: ( ruleASSOCIATION )
            // InternalSocialRequest.g:3578:3: ruleASSOCIATION
            {
             before(grammarAccess.getAttributeAccess().getAssociationASSOCIATIONParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleASSOCIATION();

            state._fsp--;

             after(grammarAccess.getAttributeAccess().getAssociationASSOCIATIONParserRuleCall_0_0()); 

            }


            }

        }
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
    // InternalSocialRequest.g:3587:1: rule__Attribute__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Attribute__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:3591:1: ( ( RULE_ID ) )
            // InternalSocialRequest.g:3592:2: ( RULE_ID )
            {
            // InternalSocialRequest.g:3592:2: ( RULE_ID )
            // InternalSocialRequest.g:3593:3: RULE_ID
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
    // InternalSocialRequest.g:3602:1: rule__Attribute__TypeRefAssignment_3 : ( ruleTypeReference ) ;
    public final void rule__Attribute__TypeRefAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:3606:1: ( ( ruleTypeReference ) )
            // InternalSocialRequest.g:3607:2: ( ruleTypeReference )
            {
            // InternalSocialRequest.g:3607:2: ( ruleTypeReference )
            // InternalSocialRequest.g:3608:3: ruleTypeReference
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
    // InternalSocialRequest.g:3617:1: rule__Attribute__ModifierAssignment_4 : ( ruleModifier ) ;
    public final void rule__Attribute__ModifierAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:3621:1: ( ( ruleModifier ) )
            // InternalSocialRequest.g:3622:2: ( ruleModifier )
            {
            // InternalSocialRequest.g:3622:2: ( ruleModifier )
            // InternalSocialRequest.g:3623:3: ruleModifier
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
    // InternalSocialRequest.g:3632:1: rule__Attribute__MappedByAssignment_5_1_0_1 : ( RULE_ID ) ;
    public final void rule__Attribute__MappedByAssignment_5_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:3636:1: ( ( RULE_ID ) )
            // InternalSocialRequest.g:3637:2: ( RULE_ID )
            {
            // InternalSocialRequest.g:3637:2: ( RULE_ID )
            // InternalSocialRequest.g:3638:3: RULE_ID
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
    // InternalSocialRequest.g:3647:1: rule__Attribute__FetchTypeAssignment_5_1_1_1 : ( RULE_FETCHTYPE ) ;
    public final void rule__Attribute__FetchTypeAssignment_5_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:3651:1: ( ( RULE_FETCHTYPE ) )
            // InternalSocialRequest.g:3652:2: ( RULE_FETCHTYPE )
            {
            // InternalSocialRequest.g:3652:2: ( RULE_FETCHTYPE )
            // InternalSocialRequest.g:3653:3: RULE_FETCHTYPE
            {
             before(grammarAccess.getAttributeAccess().getFetchTypeFETCHTYPETerminalRuleCall_5_1_1_1_0()); 
            match(input,RULE_FETCHTYPE,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getFetchTypeFETCHTYPETerminalRuleCall_5_1_1_1_0()); 

            }


            }

        }
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
    // InternalSocialRequest.g:3662:1: rule__Attribute__ValidationsAssignment_5_1_2_2 : ( ruleValidation ) ;
    public final void rule__Attribute__ValidationsAssignment_5_1_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:3666:1: ( ( ruleValidation ) )
            // InternalSocialRequest.g:3667:2: ( ruleValidation )
            {
            // InternalSocialRequest.g:3667:2: ( ruleValidation )
            // InternalSocialRequest.g:3668:3: ruleValidation
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
    // InternalSocialRequest.g:3677:1: rule__EntityTypeReference__TypeAssignment : ( ( RULE_ID ) ) ;
    public final void rule__EntityTypeReference__TypeAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:3681:1: ( ( ( RULE_ID ) ) )
            // InternalSocialRequest.g:3682:2: ( ( RULE_ID ) )
            {
            // InternalSocialRequest.g:3682:2: ( ( RULE_ID ) )
            // InternalSocialRequest.g:3683:3: ( RULE_ID )
            {
             before(grammarAccess.getEntityTypeReferenceAccess().getTypeEntityCrossReference_0()); 
            // InternalSocialRequest.g:3684:3: ( RULE_ID )
            // InternalSocialRequest.g:3685:4: RULE_ID
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
    // InternalSocialRequest.g:3696:1: rule__DataTypeReference__TypeAssignment : ( ruleDataType ) ;
    public final void rule__DataTypeReference__TypeAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:3700:1: ( ( ruleDataType ) )
            // InternalSocialRequest.g:3701:2: ( ruleDataType )
            {
            // InternalSocialRequest.g:3701:2: ( ruleDataType )
            // InternalSocialRequest.g:3702:3: ruleDataType
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
    // InternalSocialRequest.g:3711:1: rule__Modifier__IsLOBAssignment_0 : ( ( 'LOB' ) ) ;
    public final void rule__Modifier__IsLOBAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:3715:1: ( ( ( 'LOB' ) ) )
            // InternalSocialRequest.g:3716:2: ( ( 'LOB' ) )
            {
            // InternalSocialRequest.g:3716:2: ( ( 'LOB' ) )
            // InternalSocialRequest.g:3717:3: ( 'LOB' )
            {
             before(grammarAccess.getModifierAccess().getIsLOBLOBKeyword_0_0()); 
            // InternalSocialRequest.g:3718:3: ( 'LOB' )
            // InternalSocialRequest.g:3719:4: 'LOB'
            {
             before(grammarAccess.getModifierAccess().getIsLOBLOBKeyword_0_0()); 
            match(input,61,FOLLOW_2); 
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
    // InternalSocialRequest.g:3730:1: rule__Modifier__IsTransientAssignment_1 : ( ( 'TRANSIENT' ) ) ;
    public final void rule__Modifier__IsTransientAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:3734:1: ( ( ( 'TRANSIENT' ) ) )
            // InternalSocialRequest.g:3735:2: ( ( 'TRANSIENT' ) )
            {
            // InternalSocialRequest.g:3735:2: ( ( 'TRANSIENT' ) )
            // InternalSocialRequest.g:3736:3: ( 'TRANSIENT' )
            {
             before(grammarAccess.getModifierAccess().getIsTransientTRANSIENTKeyword_1_0()); 
            // InternalSocialRequest.g:3737:3: ( 'TRANSIENT' )
            // InternalSocialRequest.g:3738:4: 'TRANSIENT'
            {
             before(grammarAccess.getModifierAccess().getIsTransientTRANSIENTKeyword_1_0()); 
            match(input,62,FOLLOW_2); 
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
    // InternalSocialRequest.g:3749:1: rule__Modifier__IsIDAssignment_2_0 : ( ( 'ID' ) ) ;
    public final void rule__Modifier__IsIDAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:3753:1: ( ( ( 'ID' ) ) )
            // InternalSocialRequest.g:3754:2: ( ( 'ID' ) )
            {
            // InternalSocialRequest.g:3754:2: ( ( 'ID' ) )
            // InternalSocialRequest.g:3755:3: ( 'ID' )
            {
             before(grammarAccess.getModifierAccess().getIsIDIDKeyword_2_0_0()); 
            // InternalSocialRequest.g:3756:3: ( 'ID' )
            // InternalSocialRequest.g:3757:4: 'ID'
            {
             before(grammarAccess.getModifierAccess().getIsIDIDKeyword_2_0_0()); 
            match(input,63,FOLLOW_2); 
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
    // InternalSocialRequest.g:3768:1: rule__Modifier__IDGenerationTypeAssignment_2_1_1 : ( ruleGenerationType ) ;
    public final void rule__Modifier__IDGenerationTypeAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:3772:1: ( ( ruleGenerationType ) )
            // InternalSocialRequest.g:3773:2: ( ruleGenerationType )
            {
            // InternalSocialRequest.g:3773:2: ( ruleGenerationType )
            // InternalSocialRequest.g:3774:3: ruleGenerationType
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
    // InternalSocialRequest.g:3783:1: rule__Validation__MinAssignment_0_1 : ( RULE_POSSIBLY_SIGNED_INT ) ;
    public final void rule__Validation__MinAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:3787:1: ( ( RULE_POSSIBLY_SIGNED_INT ) )
            // InternalSocialRequest.g:3788:2: ( RULE_POSSIBLY_SIGNED_INT )
            {
            // InternalSocialRequest.g:3788:2: ( RULE_POSSIBLY_SIGNED_INT )
            // InternalSocialRequest.g:3789:3: RULE_POSSIBLY_SIGNED_INT
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
    // InternalSocialRequest.g:3798:1: rule__Validation__MaxAssignment_1_1 : ( RULE_POSSIBLY_SIGNED_INT ) ;
    public final void rule__Validation__MaxAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:3802:1: ( ( RULE_POSSIBLY_SIGNED_INT ) )
            // InternalSocialRequest.g:3803:2: ( RULE_POSSIBLY_SIGNED_INT )
            {
            // InternalSocialRequest.g:3803:2: ( RULE_POSSIBLY_SIGNED_INT )
            // InternalSocialRequest.g:3804:3: RULE_POSSIBLY_SIGNED_INT
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
    // InternalSocialRequest.g:3813:1: rule__Validation__RegexAssignment_2_1 : ( RULE_STRING ) ;
    public final void rule__Validation__RegexAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:3817:1: ( ( RULE_STRING ) )
            // InternalSocialRequest.g:3818:2: ( RULE_STRING )
            {
            // InternalSocialRequest.g:3818:2: ( RULE_STRING )
            // InternalSocialRequest.g:3819:3: RULE_STRING
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
    // InternalSocialRequest.g:3828:1: rule__Validation__ValidatorAssignment_3 : ( ruleBASICVALIDATION ) ;
    public final void rule__Validation__ValidatorAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:3832:1: ( ( ruleBASICVALIDATION ) )
            // InternalSocialRequest.g:3833:2: ( ruleBASICVALIDATION )
            {
            // InternalSocialRequest.g:3833:2: ( ruleBASICVALIDATION )
            // InternalSocialRequest.g:3834:3: ruleBASICVALIDATION
            {
             before(grammarAccess.getValidationAccess().getValidatorBASICVALIDATIONParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleBASICVALIDATION();

            state._fsp--;

             after(grammarAccess.getValidationAccess().getValidatorBASICVALIDATIONParserRuleCall_3_0()); 

            }


            }

        }
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
    // InternalSocialRequest.g:3843:1: rule__Repository__EntityAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__Repository__EntityAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:3847:1: ( ( ( RULE_ID ) ) )
            // InternalSocialRequest.g:3848:2: ( ( RULE_ID ) )
            {
            // InternalSocialRequest.g:3848:2: ( ( RULE_ID ) )
            // InternalSocialRequest.g:3849:3: ( RULE_ID )
            {
             before(grammarAccess.getRepositoryAccess().getEntityEntityCrossReference_1_0()); 
            // InternalSocialRequest.g:3850:3: ( RULE_ID )
            // InternalSocialRequest.g:3851:4: RULE_ID
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
    // InternalSocialRequest.g:3862:1: rule__Repository__QueriesAssignment_3 : ( ruleQuery ) ;
    public final void rule__Repository__QueriesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:3866:1: ( ( ruleQuery ) )
            // InternalSocialRequest.g:3867:2: ( ruleQuery )
            {
            // InternalSocialRequest.g:3867:2: ( ruleQuery )
            // InternalSocialRequest.g:3868:3: ruleQuery
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
    // InternalSocialRequest.g:3877:1: rule__Query__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Query__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:3881:1: ( ( RULE_ID ) )
            // InternalSocialRequest.g:3882:2: ( RULE_ID )
            {
            // InternalSocialRequest.g:3882:2: ( RULE_ID )
            // InternalSocialRequest.g:3883:3: RULE_ID
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
    // InternalSocialRequest.g:3892:1: rule__Query__IsListAssignment_2_0 : ( ( ':' ) ) ;
    public final void rule__Query__IsListAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:3896:1: ( ( ( ':' ) ) )
            // InternalSocialRequest.g:3897:2: ( ( ':' ) )
            {
            // InternalSocialRequest.g:3897:2: ( ( ':' ) )
            // InternalSocialRequest.g:3898:3: ( ':' )
            {
             before(grammarAccess.getQueryAccess().getIsListColonKeyword_2_0_0()); 
            // InternalSocialRequest.g:3899:3: ( ':' )
            // InternalSocialRequest.g:3900:4: ':'
            {
             before(grammarAccess.getQueryAccess().getIsListColonKeyword_2_0_0()); 
            match(input,42,FOLLOW_2); 
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
    // InternalSocialRequest.g:3911:1: rule__Query__ParamsAssignment_3_1_2 : ( ruleParam ) ;
    public final void rule__Query__ParamsAssignment_3_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:3915:1: ( ( ruleParam ) )
            // InternalSocialRequest.g:3916:2: ( ruleParam )
            {
            // InternalSocialRequest.g:3916:2: ( ruleParam )
            // InternalSocialRequest.g:3917:3: ruleParam
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
    // InternalSocialRequest.g:3926:1: rule__Query__SqlQueryAssignment_3_2 : ( ruleSQLQuery ) ;
    public final void rule__Query__SqlQueryAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:3930:1: ( ( ruleSQLQuery ) )
            // InternalSocialRequest.g:3931:2: ( ruleSQLQuery )
            {
            // InternalSocialRequest.g:3931:2: ( ruleSQLQuery )
            // InternalSocialRequest.g:3932:3: ruleSQLQuery
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
    // InternalSocialRequest.g:3941:1: rule__Param__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Param__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:3945:1: ( ( RULE_ID ) )
            // InternalSocialRequest.g:3946:2: ( RULE_ID )
            {
            // InternalSocialRequest.g:3946:2: ( RULE_ID )
            // InternalSocialRequest.g:3947:3: RULE_ID
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
    // InternalSocialRequest.g:3956:1: rule__Param__TypeAssignment_2 : ( ruleTypeReference ) ;
    public final void rule__Param__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:3960:1: ( ( ruleTypeReference ) )
            // InternalSocialRequest.g:3961:2: ( ruleTypeReference )
            {
            // InternalSocialRequest.g:3961:2: ( ruleTypeReference )
            // InternalSocialRequest.g:3962:3: ruleTypeReference
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
    // InternalSocialRequest.g:3971:1: rule__SQLQuery__SelectAssignment_0 : ( ruleSelect ) ;
    public final void rule__SQLQuery__SelectAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:3975:1: ( ( ruleSelect ) )
            // InternalSocialRequest.g:3976:2: ( ruleSelect )
            {
            // InternalSocialRequest.g:3976:2: ( ruleSelect )
            // InternalSocialRequest.g:3977:3: ruleSelect
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
    // InternalSocialRequest.g:3986:1: rule__SQLQuery__FromAssignment_1 : ( ruleFrom ) ;
    public final void rule__SQLQuery__FromAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:3990:1: ( ( ruleFrom ) )
            // InternalSocialRequest.g:3991:2: ( ruleFrom )
            {
            // InternalSocialRequest.g:3991:2: ( ruleFrom )
            // InternalSocialRequest.g:3992:3: ruleFrom
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
    // InternalSocialRequest.g:4001:1: rule__SQLQuery__JoinsAssignment_2 : ( ruleJoin ) ;
    public final void rule__SQLQuery__JoinsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:4005:1: ( ( ruleJoin ) )
            // InternalSocialRequest.g:4006:2: ( ruleJoin )
            {
            // InternalSocialRequest.g:4006:2: ( ruleJoin )
            // InternalSocialRequest.g:4007:3: ruleJoin
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
    // InternalSocialRequest.g:4016:1: rule__SQLQuery__WhereAssignment_3 : ( ruleWhere ) ;
    public final void rule__SQLQuery__WhereAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:4020:1: ( ( ruleWhere ) )
            // InternalSocialRequest.g:4021:2: ( ruleWhere )
            {
            // InternalSocialRequest.g:4021:2: ( ruleWhere )
            // InternalSocialRequest.g:4022:3: ruleWhere
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
    // InternalSocialRequest.g:4031:1: rule__SQLQuery__OrderAssignment_4 : ( ruleOrder ) ;
    public final void rule__SQLQuery__OrderAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:4035:1: ( ( ruleOrder ) )
            // InternalSocialRequest.g:4036:2: ( ruleOrder )
            {
            // InternalSocialRequest.g:4036:2: ( ruleOrder )
            // InternalSocialRequest.g:4037:3: ruleOrder
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
    // InternalSocialRequest.g:4046:1: rule__Select__IsDistinctAssignment_1 : ( ( 'DISTINCT' ) ) ;
    public final void rule__Select__IsDistinctAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:4050:1: ( ( ( 'DISTINCT' ) ) )
            // InternalSocialRequest.g:4051:2: ( ( 'DISTINCT' ) )
            {
            // InternalSocialRequest.g:4051:2: ( ( 'DISTINCT' ) )
            // InternalSocialRequest.g:4052:3: ( 'DISTINCT' )
            {
             before(grammarAccess.getSelectAccess().getIsDistinctDISTINCTKeyword_1_0()); 
            // InternalSocialRequest.g:4053:3: ( 'DISTINCT' )
            // InternalSocialRequest.g:4054:4: 'DISTINCT'
            {
             before(grammarAccess.getSelectAccess().getIsDistinctDISTINCTKeyword_1_0()); 
            match(input,64,FOLLOW_2); 
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
    // InternalSocialRequest.g:4065:1: rule__Select__ClauseAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Select__ClauseAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:4069:1: ( ( RULE_STRING ) )
            // InternalSocialRequest.g:4070:2: ( RULE_STRING )
            {
            // InternalSocialRequest.g:4070:2: ( RULE_STRING )
            // InternalSocialRequest.g:4071:3: RULE_STRING
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
    // InternalSocialRequest.g:4080:1: rule__From__EntityAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__From__EntityAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:4084:1: ( ( ( RULE_ID ) ) )
            // InternalSocialRequest.g:4085:2: ( ( RULE_ID ) )
            {
            // InternalSocialRequest.g:4085:2: ( ( RULE_ID ) )
            // InternalSocialRequest.g:4086:3: ( RULE_ID )
            {
             before(grammarAccess.getFromAccess().getEntityEntityCrossReference_2_0()); 
            // InternalSocialRequest.g:4087:3: ( RULE_ID )
            // InternalSocialRequest.g:4088:4: RULE_ID
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
    // InternalSocialRequest.g:4099:1: rule__From__AliasAssignment_3 : ( RULE_ID ) ;
    public final void rule__From__AliasAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:4103:1: ( ( RULE_ID ) )
            // InternalSocialRequest.g:4104:2: ( RULE_ID )
            {
            // InternalSocialRequest.g:4104:2: ( RULE_ID )
            // InternalSocialRequest.g:4105:3: RULE_ID
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
    // InternalSocialRequest.g:4114:1: rule__Join__JoinTypeAssignment_0 : ( ruleJoinType ) ;
    public final void rule__Join__JoinTypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:4118:1: ( ( ruleJoinType ) )
            // InternalSocialRequest.g:4119:2: ( ruleJoinType )
            {
            // InternalSocialRequest.g:4119:2: ( ruleJoinType )
            // InternalSocialRequest.g:4120:3: ruleJoinType
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
    // InternalSocialRequest.g:4129:1: rule__Join__EntityAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Join__EntityAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:4133:1: ( ( ( RULE_ID ) ) )
            // InternalSocialRequest.g:4134:2: ( ( RULE_ID ) )
            {
            // InternalSocialRequest.g:4134:2: ( ( RULE_ID ) )
            // InternalSocialRequest.g:4135:3: ( RULE_ID )
            {
             before(grammarAccess.getJoinAccess().getEntityEntityCrossReference_2_0()); 
            // InternalSocialRequest.g:4136:3: ( RULE_ID )
            // InternalSocialRequest.g:4137:4: RULE_ID
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
    // InternalSocialRequest.g:4148:1: rule__Join__AliasAssignment_3 : ( RULE_ID ) ;
    public final void rule__Join__AliasAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:4152:1: ( ( RULE_ID ) )
            // InternalSocialRequest.g:4153:2: ( RULE_ID )
            {
            // InternalSocialRequest.g:4153:2: ( RULE_ID )
            // InternalSocialRequest.g:4154:3: RULE_ID
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
    // InternalSocialRequest.g:4163:1: rule__Join__JoinConditionAssignment_5_2 : ( RULE_STRING ) ;
    public final void rule__Join__JoinConditionAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:4167:1: ( ( RULE_STRING ) )
            // InternalSocialRequest.g:4168:2: ( RULE_STRING )
            {
            // InternalSocialRequest.g:4168:2: ( RULE_STRING )
            // InternalSocialRequest.g:4169:3: RULE_STRING
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
    // InternalSocialRequest.g:4178:1: rule__Where__ConditionAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Where__ConditionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:4182:1: ( ( RULE_STRING ) )
            // InternalSocialRequest.g:4183:2: ( RULE_STRING )
            {
            // InternalSocialRequest.g:4183:2: ( RULE_STRING )
            // InternalSocialRequest.g:4184:3: RULE_STRING
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
    // InternalSocialRequest.g:4193:1: rule__Order__OrderAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Order__OrderAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:4197:1: ( ( RULE_STRING ) )
            // InternalSocialRequest.g:4198:2: ( RULE_STRING )
            {
            // InternalSocialRequest.g:4198:2: ( RULE_STRING )
            // InternalSocialRequest.g:4199:3: RULE_STRING
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x1000008000000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000000003C0010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000000003C0012L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x00000003FC000010L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0xE000008000000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000380000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x000700000003E000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x000700000003E002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000003C00000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000048000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x00C0010000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000010000000010L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0C00003C00000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000003C00000002L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000008000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000380000000002L});

}
