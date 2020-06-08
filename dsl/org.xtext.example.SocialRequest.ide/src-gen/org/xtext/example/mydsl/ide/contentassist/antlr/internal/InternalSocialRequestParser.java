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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_FETCHTYPE", "RULE_GENERATIONTYPE", "RULE_POSSIBLY_SIGNED_INT", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'NotNull'", "'NotBlank'", "'Past'", "'Unique'", "'Email'", "'OneToMany'", "'ManyToOne'", "'OneToOne'", "'ManyToMany'", "'String'", "'long'", "'float'", "'double'", "'char'", "'int'", "'boolean'", "'Date'", "'LEFT JOIN'", "'LEFT OUTER JOIN'", "'CROSS JOIN'", "'JOIN'", "'Entity'", "'{'", "'}'", "'UserDetails'", "':'", "'mappedBy:'", "'fetch:'", "'validations'", "'('", "')'", "'min:'", "'max:'", "'pattern:'", "'Repository'", "'query'", "'list'", "'params'", "'SELECT'", "'FROM'", "'ON'", "'WHERE'", "'ORDER BY'", "'implements'", "'LOB'", "'TRANSIENT'", "'ID'", "'DISTINCT'"
    };
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


    // $ANTLR start "ruleDataType"
    // InternalSocialRequest.g:528:1: ruleDataType : ( ( rule__DataType__Alternatives ) ) ;
    public final void ruleDataType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:532:1: ( ( ( rule__DataType__Alternatives ) ) )
            // InternalSocialRequest.g:533:2: ( ( rule__DataType__Alternatives ) )
            {
            // InternalSocialRequest.g:533:2: ( ( rule__DataType__Alternatives ) )
            // InternalSocialRequest.g:534:3: ( rule__DataType__Alternatives )
            {
             before(grammarAccess.getDataTypeAccess().getAlternatives()); 
            // InternalSocialRequest.g:535:3: ( rule__DataType__Alternatives )
            // InternalSocialRequest.g:535:4: rule__DataType__Alternatives
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
    // InternalSocialRequest.g:544:1: ruleJoinType : ( ( rule__JoinType__Alternatives ) ) ;
    public final void ruleJoinType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:548:1: ( ( ( rule__JoinType__Alternatives ) ) )
            // InternalSocialRequest.g:549:2: ( ( rule__JoinType__Alternatives ) )
            {
            // InternalSocialRequest.g:549:2: ( ( rule__JoinType__Alternatives ) )
            // InternalSocialRequest.g:550:3: ( rule__JoinType__Alternatives )
            {
             before(grammarAccess.getJoinTypeAccess().getAlternatives()); 
            // InternalSocialRequest.g:551:3: ( rule__JoinType__Alternatives )
            // InternalSocialRequest.g:551:4: rule__JoinType__Alternatives
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
    // InternalSocialRequest.g:559:1: rule__TypeReference__Alternatives : ( ( ruleEntityTypeReference ) | ( ruleDataTypeReference ) );
    public final void rule__TypeReference__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:563:1: ( ( ruleEntityTypeReference ) | ( ruleDataTypeReference ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_ID) ) {
                alt1=1;
            }
            else if ( ((LA1_0>=23 && LA1_0<=30)) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalSocialRequest.g:564:2: ( ruleEntityTypeReference )
                    {
                    // InternalSocialRequest.g:564:2: ( ruleEntityTypeReference )
                    // InternalSocialRequest.g:565:3: ruleEntityTypeReference
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
                    // InternalSocialRequest.g:570:2: ( ruleDataTypeReference )
                    {
                    // InternalSocialRequest.g:570:2: ( ruleDataTypeReference )
                    // InternalSocialRequest.g:571:3: ruleDataTypeReference
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
    // InternalSocialRequest.g:580:1: rule__Modifier__Alternatives : ( ( ( rule__Modifier__IsLOBAssignment_0 ) ) | ( ( rule__Modifier__IsTransientAssignment_1 ) ) | ( ( rule__Modifier__Group_2__0 ) ) );
    public final void rule__Modifier__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:584:1: ( ( ( rule__Modifier__IsLOBAssignment_0 ) ) | ( ( rule__Modifier__IsTransientAssignment_1 ) ) | ( ( rule__Modifier__Group_2__0 ) ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 58:
                {
                alt2=1;
                }
                break;
            case 59:
                {
                alt2=2;
                }
                break;
            case 60:
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
                    // InternalSocialRequest.g:585:2: ( ( rule__Modifier__IsLOBAssignment_0 ) )
                    {
                    // InternalSocialRequest.g:585:2: ( ( rule__Modifier__IsLOBAssignment_0 ) )
                    // InternalSocialRequest.g:586:3: ( rule__Modifier__IsLOBAssignment_0 )
                    {
                     before(grammarAccess.getModifierAccess().getIsLOBAssignment_0()); 
                    // InternalSocialRequest.g:587:3: ( rule__Modifier__IsLOBAssignment_0 )
                    // InternalSocialRequest.g:587:4: rule__Modifier__IsLOBAssignment_0
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
                    // InternalSocialRequest.g:591:2: ( ( rule__Modifier__IsTransientAssignment_1 ) )
                    {
                    // InternalSocialRequest.g:591:2: ( ( rule__Modifier__IsTransientAssignment_1 ) )
                    // InternalSocialRequest.g:592:3: ( rule__Modifier__IsTransientAssignment_1 )
                    {
                     before(grammarAccess.getModifierAccess().getIsTransientAssignment_1()); 
                    // InternalSocialRequest.g:593:3: ( rule__Modifier__IsTransientAssignment_1 )
                    // InternalSocialRequest.g:593:4: rule__Modifier__IsTransientAssignment_1
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
                    // InternalSocialRequest.g:597:2: ( ( rule__Modifier__Group_2__0 ) )
                    {
                    // InternalSocialRequest.g:597:2: ( ( rule__Modifier__Group_2__0 ) )
                    // InternalSocialRequest.g:598:3: ( rule__Modifier__Group_2__0 )
                    {
                     before(grammarAccess.getModifierAccess().getGroup_2()); 
                    // InternalSocialRequest.g:599:3: ( rule__Modifier__Group_2__0 )
                    // InternalSocialRequest.g:599:4: rule__Modifier__Group_2__0
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
    // InternalSocialRequest.g:607:1: rule__Validation__Alternatives : ( ( ( rule__Validation__Group_0__0 ) ) | ( ( rule__Validation__Group_1__0 ) ) | ( ( rule__Validation__Group_2__0 ) ) | ( ( rule__Validation__ValidatorAssignment_3 ) ) );
    public final void rule__Validation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:611:1: ( ( ( rule__Validation__Group_0__0 ) ) | ( ( rule__Validation__Group_1__0 ) ) | ( ( rule__Validation__Group_2__0 ) ) | ( ( rule__Validation__ValidatorAssignment_3 ) ) )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 45:
                {
                alt3=1;
                }
                break;
            case 46:
                {
                alt3=2;
                }
                break;
            case 47:
                {
                alt3=3;
                }
                break;
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
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
                    // InternalSocialRequest.g:612:2: ( ( rule__Validation__Group_0__0 ) )
                    {
                    // InternalSocialRequest.g:612:2: ( ( rule__Validation__Group_0__0 ) )
                    // InternalSocialRequest.g:613:3: ( rule__Validation__Group_0__0 )
                    {
                     before(grammarAccess.getValidationAccess().getGroup_0()); 
                    // InternalSocialRequest.g:614:3: ( rule__Validation__Group_0__0 )
                    // InternalSocialRequest.g:614:4: rule__Validation__Group_0__0
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
                    // InternalSocialRequest.g:618:2: ( ( rule__Validation__Group_1__0 ) )
                    {
                    // InternalSocialRequest.g:618:2: ( ( rule__Validation__Group_1__0 ) )
                    // InternalSocialRequest.g:619:3: ( rule__Validation__Group_1__0 )
                    {
                     before(grammarAccess.getValidationAccess().getGroup_1()); 
                    // InternalSocialRequest.g:620:3: ( rule__Validation__Group_1__0 )
                    // InternalSocialRequest.g:620:4: rule__Validation__Group_1__0
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
                    // InternalSocialRequest.g:624:2: ( ( rule__Validation__Group_2__0 ) )
                    {
                    // InternalSocialRequest.g:624:2: ( ( rule__Validation__Group_2__0 ) )
                    // InternalSocialRequest.g:625:3: ( rule__Validation__Group_2__0 )
                    {
                     before(grammarAccess.getValidationAccess().getGroup_2()); 
                    // InternalSocialRequest.g:626:3: ( rule__Validation__Group_2__0 )
                    // InternalSocialRequest.g:626:4: rule__Validation__Group_2__0
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
                    // InternalSocialRequest.g:630:2: ( ( rule__Validation__ValidatorAssignment_3 ) )
                    {
                    // InternalSocialRequest.g:630:2: ( ( rule__Validation__ValidatorAssignment_3 ) )
                    // InternalSocialRequest.g:631:3: ( rule__Validation__ValidatorAssignment_3 )
                    {
                     before(grammarAccess.getValidationAccess().getValidatorAssignment_3()); 
                    // InternalSocialRequest.g:632:3: ( rule__Validation__ValidatorAssignment_3 )
                    // InternalSocialRequest.g:632:4: rule__Validation__ValidatorAssignment_3
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
    // InternalSocialRequest.g:640:1: rule__BASICVALIDATION__Alternatives : ( ( 'NotNull' ) | ( 'NotBlank' ) | ( 'Past' ) | ( 'Unique' ) | ( 'Email' ) );
    public final void rule__BASICVALIDATION__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:644:1: ( ( 'NotNull' ) | ( 'NotBlank' ) | ( 'Past' ) | ( 'Unique' ) | ( 'Email' ) )
            int alt4=5;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt4=1;
                }
                break;
            case 15:
                {
                alt4=2;
                }
                break;
            case 16:
                {
                alt4=3;
                }
                break;
            case 17:
                {
                alt4=4;
                }
                break;
            case 18:
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
                    // InternalSocialRequest.g:645:2: ( 'NotNull' )
                    {
                    // InternalSocialRequest.g:645:2: ( 'NotNull' )
                    // InternalSocialRequest.g:646:3: 'NotNull'
                    {
                     before(grammarAccess.getBASICVALIDATIONAccess().getNotNullKeyword_0()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getBASICVALIDATIONAccess().getNotNullKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSocialRequest.g:651:2: ( 'NotBlank' )
                    {
                    // InternalSocialRequest.g:651:2: ( 'NotBlank' )
                    // InternalSocialRequest.g:652:3: 'NotBlank'
                    {
                     before(grammarAccess.getBASICVALIDATIONAccess().getNotBlankKeyword_1()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getBASICVALIDATIONAccess().getNotBlankKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSocialRequest.g:657:2: ( 'Past' )
                    {
                    // InternalSocialRequest.g:657:2: ( 'Past' )
                    // InternalSocialRequest.g:658:3: 'Past'
                    {
                     before(grammarAccess.getBASICVALIDATIONAccess().getPastKeyword_2()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getBASICVALIDATIONAccess().getPastKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalSocialRequest.g:663:2: ( 'Unique' )
                    {
                    // InternalSocialRequest.g:663:2: ( 'Unique' )
                    // InternalSocialRequest.g:664:3: 'Unique'
                    {
                     before(grammarAccess.getBASICVALIDATIONAccess().getUniqueKeyword_3()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getBASICVALIDATIONAccess().getUniqueKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalSocialRequest.g:669:2: ( 'Email' )
                    {
                    // InternalSocialRequest.g:669:2: ( 'Email' )
                    // InternalSocialRequest.g:670:3: 'Email'
                    {
                     before(grammarAccess.getBASICVALIDATIONAccess().getEmailKeyword_4()); 
                    match(input,18,FOLLOW_2); 
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
    // InternalSocialRequest.g:679:1: rule__ASSOCIATION__Alternatives : ( ( 'OneToMany' ) | ( 'ManyToOne' ) | ( 'OneToOne' ) | ( 'ManyToMany' ) );
    public final void rule__ASSOCIATION__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:683:1: ( ( 'OneToMany' ) | ( 'ManyToOne' ) | ( 'OneToOne' ) | ( 'ManyToMany' ) )
            int alt5=4;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt5=1;
                }
                break;
            case 20:
                {
                alt5=2;
                }
                break;
            case 21:
                {
                alt5=3;
                }
                break;
            case 22:
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
                    // InternalSocialRequest.g:684:2: ( 'OneToMany' )
                    {
                    // InternalSocialRequest.g:684:2: ( 'OneToMany' )
                    // InternalSocialRequest.g:685:3: 'OneToMany'
                    {
                     before(grammarAccess.getASSOCIATIONAccess().getOneToManyKeyword_0()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getASSOCIATIONAccess().getOneToManyKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSocialRequest.g:690:2: ( 'ManyToOne' )
                    {
                    // InternalSocialRequest.g:690:2: ( 'ManyToOne' )
                    // InternalSocialRequest.g:691:3: 'ManyToOne'
                    {
                     before(grammarAccess.getASSOCIATIONAccess().getManyToOneKeyword_1()); 
                    match(input,20,FOLLOW_2); 
                     after(grammarAccess.getASSOCIATIONAccess().getManyToOneKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSocialRequest.g:696:2: ( 'OneToOne' )
                    {
                    // InternalSocialRequest.g:696:2: ( 'OneToOne' )
                    // InternalSocialRequest.g:697:3: 'OneToOne'
                    {
                     before(grammarAccess.getASSOCIATIONAccess().getOneToOneKeyword_2()); 
                    match(input,21,FOLLOW_2); 
                     after(grammarAccess.getASSOCIATIONAccess().getOneToOneKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalSocialRequest.g:702:2: ( 'ManyToMany' )
                    {
                    // InternalSocialRequest.g:702:2: ( 'ManyToMany' )
                    // InternalSocialRequest.g:703:3: 'ManyToMany'
                    {
                     before(grammarAccess.getASSOCIATIONAccess().getManyToManyKeyword_3()); 
                    match(input,22,FOLLOW_2); 
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


    // $ANTLR start "rule__DataType__Alternatives"
    // InternalSocialRequest.g:712:1: rule__DataType__Alternatives : ( ( ( 'String' ) ) | ( ( 'long' ) ) | ( ( 'float' ) ) | ( ( 'double' ) ) | ( ( 'char' ) ) | ( ( 'int' ) ) | ( ( 'boolean' ) ) | ( ( 'Date' ) ) );
    public final void rule__DataType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:716:1: ( ( ( 'String' ) ) | ( ( 'long' ) ) | ( ( 'float' ) ) | ( ( 'double' ) ) | ( ( 'char' ) ) | ( ( 'int' ) ) | ( ( 'boolean' ) ) | ( ( 'Date' ) ) )
            int alt6=8;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt6=1;
                }
                break;
            case 24:
                {
                alt6=2;
                }
                break;
            case 25:
                {
                alt6=3;
                }
                break;
            case 26:
                {
                alt6=4;
                }
                break;
            case 27:
                {
                alt6=5;
                }
                break;
            case 28:
                {
                alt6=6;
                }
                break;
            case 29:
                {
                alt6=7;
                }
                break;
            case 30:
                {
                alt6=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalSocialRequest.g:717:2: ( ( 'String' ) )
                    {
                    // InternalSocialRequest.g:717:2: ( ( 'String' ) )
                    // InternalSocialRequest.g:718:3: ( 'String' )
                    {
                     before(grammarAccess.getDataTypeAccess().getSTRINGEnumLiteralDeclaration_0()); 
                    // InternalSocialRequest.g:719:3: ( 'String' )
                    // InternalSocialRequest.g:719:4: 'String'
                    {
                    match(input,23,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataTypeAccess().getSTRINGEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSocialRequest.g:723:2: ( ( 'long' ) )
                    {
                    // InternalSocialRequest.g:723:2: ( ( 'long' ) )
                    // InternalSocialRequest.g:724:3: ( 'long' )
                    {
                     before(grammarAccess.getDataTypeAccess().getLONGEnumLiteralDeclaration_1()); 
                    // InternalSocialRequest.g:725:3: ( 'long' )
                    // InternalSocialRequest.g:725:4: 'long'
                    {
                    match(input,24,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataTypeAccess().getLONGEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSocialRequest.g:729:2: ( ( 'float' ) )
                    {
                    // InternalSocialRequest.g:729:2: ( ( 'float' ) )
                    // InternalSocialRequest.g:730:3: ( 'float' )
                    {
                     before(grammarAccess.getDataTypeAccess().getFLOATEnumLiteralDeclaration_2()); 
                    // InternalSocialRequest.g:731:3: ( 'float' )
                    // InternalSocialRequest.g:731:4: 'float'
                    {
                    match(input,25,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataTypeAccess().getFLOATEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalSocialRequest.g:735:2: ( ( 'double' ) )
                    {
                    // InternalSocialRequest.g:735:2: ( ( 'double' ) )
                    // InternalSocialRequest.g:736:3: ( 'double' )
                    {
                     before(grammarAccess.getDataTypeAccess().getDOUBLEEnumLiteralDeclaration_3()); 
                    // InternalSocialRequest.g:737:3: ( 'double' )
                    // InternalSocialRequest.g:737:4: 'double'
                    {
                    match(input,26,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataTypeAccess().getDOUBLEEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalSocialRequest.g:741:2: ( ( 'char' ) )
                    {
                    // InternalSocialRequest.g:741:2: ( ( 'char' ) )
                    // InternalSocialRequest.g:742:3: ( 'char' )
                    {
                     before(grammarAccess.getDataTypeAccess().getCHAREnumLiteralDeclaration_4()); 
                    // InternalSocialRequest.g:743:3: ( 'char' )
                    // InternalSocialRequest.g:743:4: 'char'
                    {
                    match(input,27,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataTypeAccess().getCHAREnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalSocialRequest.g:747:2: ( ( 'int' ) )
                    {
                    // InternalSocialRequest.g:747:2: ( ( 'int' ) )
                    // InternalSocialRequest.g:748:3: ( 'int' )
                    {
                     before(grammarAccess.getDataTypeAccess().getINTEnumLiteralDeclaration_5()); 
                    // InternalSocialRequest.g:749:3: ( 'int' )
                    // InternalSocialRequest.g:749:4: 'int'
                    {
                    match(input,28,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataTypeAccess().getINTEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalSocialRequest.g:753:2: ( ( 'boolean' ) )
                    {
                    // InternalSocialRequest.g:753:2: ( ( 'boolean' ) )
                    // InternalSocialRequest.g:754:3: ( 'boolean' )
                    {
                     before(grammarAccess.getDataTypeAccess().getBOOLEANEnumLiteralDeclaration_6()); 
                    // InternalSocialRequest.g:755:3: ( 'boolean' )
                    // InternalSocialRequest.g:755:4: 'boolean'
                    {
                    match(input,29,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataTypeAccess().getBOOLEANEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalSocialRequest.g:759:2: ( ( 'Date' ) )
                    {
                    // InternalSocialRequest.g:759:2: ( ( 'Date' ) )
                    // InternalSocialRequest.g:760:3: ( 'Date' )
                    {
                     before(grammarAccess.getDataTypeAccess().getDATEEnumLiteralDeclaration_7()); 
                    // InternalSocialRequest.g:761:3: ( 'Date' )
                    // InternalSocialRequest.g:761:4: 'Date'
                    {
                    match(input,30,FOLLOW_2); 

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
    // InternalSocialRequest.g:769:1: rule__JoinType__Alternatives : ( ( ( 'LEFT JOIN' ) ) | ( ( 'LEFT OUTER JOIN' ) ) | ( ( 'CROSS JOIN' ) ) | ( ( 'JOIN' ) ) );
    public final void rule__JoinType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:773:1: ( ( ( 'LEFT JOIN' ) ) | ( ( 'LEFT OUTER JOIN' ) ) | ( ( 'CROSS JOIN' ) ) | ( ( 'JOIN' ) ) )
            int alt7=4;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt7=1;
                }
                break;
            case 32:
                {
                alt7=2;
                }
                break;
            case 33:
                {
                alt7=3;
                }
                break;
            case 34:
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
                    // InternalSocialRequest.g:774:2: ( ( 'LEFT JOIN' ) )
                    {
                    // InternalSocialRequest.g:774:2: ( ( 'LEFT JOIN' ) )
                    // InternalSocialRequest.g:775:3: ( 'LEFT JOIN' )
                    {
                     before(grammarAccess.getJoinTypeAccess().getLEFT_JOINEnumLiteralDeclaration_0()); 
                    // InternalSocialRequest.g:776:3: ( 'LEFT JOIN' )
                    // InternalSocialRequest.g:776:4: 'LEFT JOIN'
                    {
                    match(input,31,FOLLOW_2); 

                    }

                     after(grammarAccess.getJoinTypeAccess().getLEFT_JOINEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSocialRequest.g:780:2: ( ( 'LEFT OUTER JOIN' ) )
                    {
                    // InternalSocialRequest.g:780:2: ( ( 'LEFT OUTER JOIN' ) )
                    // InternalSocialRequest.g:781:3: ( 'LEFT OUTER JOIN' )
                    {
                     before(grammarAccess.getJoinTypeAccess().getLEFT_OUTER_JOINEnumLiteralDeclaration_1()); 
                    // InternalSocialRequest.g:782:3: ( 'LEFT OUTER JOIN' )
                    // InternalSocialRequest.g:782:4: 'LEFT OUTER JOIN'
                    {
                    match(input,32,FOLLOW_2); 

                    }

                     after(grammarAccess.getJoinTypeAccess().getLEFT_OUTER_JOINEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSocialRequest.g:786:2: ( ( 'CROSS JOIN' ) )
                    {
                    // InternalSocialRequest.g:786:2: ( ( 'CROSS JOIN' ) )
                    // InternalSocialRequest.g:787:3: ( 'CROSS JOIN' )
                    {
                     before(grammarAccess.getJoinTypeAccess().getCROSS_JOINEnumLiteralDeclaration_2()); 
                    // InternalSocialRequest.g:788:3: ( 'CROSS JOIN' )
                    // InternalSocialRequest.g:788:4: 'CROSS JOIN'
                    {
                    match(input,33,FOLLOW_2); 

                    }

                     after(grammarAccess.getJoinTypeAccess().getCROSS_JOINEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalSocialRequest.g:792:2: ( ( 'JOIN' ) )
                    {
                    // InternalSocialRequest.g:792:2: ( ( 'JOIN' ) )
                    // InternalSocialRequest.g:793:3: ( 'JOIN' )
                    {
                     before(grammarAccess.getJoinTypeAccess().getJOINEnumLiteralDeclaration_3()); 
                    // InternalSocialRequest.g:794:3: ( 'JOIN' )
                    // InternalSocialRequest.g:794:4: 'JOIN'
                    {
                    match(input,34,FOLLOW_2); 

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
    // InternalSocialRequest.g:802:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:806:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalSocialRequest.g:807:2: rule__Model__Group__0__Impl rule__Model__Group__1
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
    // InternalSocialRequest.g:814:1: rule__Model__Group__0__Impl : ( ( rule__Model__EntitiesAssignment_0 )* ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:818:1: ( ( ( rule__Model__EntitiesAssignment_0 )* ) )
            // InternalSocialRequest.g:819:1: ( ( rule__Model__EntitiesAssignment_0 )* )
            {
            // InternalSocialRequest.g:819:1: ( ( rule__Model__EntitiesAssignment_0 )* )
            // InternalSocialRequest.g:820:2: ( rule__Model__EntitiesAssignment_0 )*
            {
             before(grammarAccess.getModelAccess().getEntitiesAssignment_0()); 
            // InternalSocialRequest.g:821:2: ( rule__Model__EntitiesAssignment_0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==35) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalSocialRequest.g:821:3: rule__Model__EntitiesAssignment_0
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Model__EntitiesAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
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
    // InternalSocialRequest.g:829:1: rule__Model__Group__1 : rule__Model__Group__1__Impl ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:833:1: ( rule__Model__Group__1__Impl )
            // InternalSocialRequest.g:834:2: rule__Model__Group__1__Impl
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
    // InternalSocialRequest.g:840:1: rule__Model__Group__1__Impl : ( ( rule__Model__RepositoriesAssignment_1 )* ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:844:1: ( ( ( rule__Model__RepositoriesAssignment_1 )* ) )
            // InternalSocialRequest.g:845:1: ( ( rule__Model__RepositoriesAssignment_1 )* )
            {
            // InternalSocialRequest.g:845:1: ( ( rule__Model__RepositoriesAssignment_1 )* )
            // InternalSocialRequest.g:846:2: ( rule__Model__RepositoriesAssignment_1 )*
            {
             before(grammarAccess.getModelAccess().getRepositoriesAssignment_1()); 
            // InternalSocialRequest.g:847:2: ( rule__Model__RepositoriesAssignment_1 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==48) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalSocialRequest.g:847:3: rule__Model__RepositoriesAssignment_1
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__Model__RepositoriesAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
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
    // InternalSocialRequest.g:856:1: rule__Entity__Group__0 : rule__Entity__Group__0__Impl rule__Entity__Group__1 ;
    public final void rule__Entity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:860:1: ( rule__Entity__Group__0__Impl rule__Entity__Group__1 )
            // InternalSocialRequest.g:861:2: rule__Entity__Group__0__Impl rule__Entity__Group__1
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
    // InternalSocialRequest.g:868:1: rule__Entity__Group__0__Impl : ( 'Entity' ) ;
    public final void rule__Entity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:872:1: ( ( 'Entity' ) )
            // InternalSocialRequest.g:873:1: ( 'Entity' )
            {
            // InternalSocialRequest.g:873:1: ( 'Entity' )
            // InternalSocialRequest.g:874:2: 'Entity'
            {
             before(grammarAccess.getEntityAccess().getEntityKeyword_0()); 
            match(input,35,FOLLOW_2); 
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
    // InternalSocialRequest.g:883:1: rule__Entity__Group__1 : rule__Entity__Group__1__Impl rule__Entity__Group__2 ;
    public final void rule__Entity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:887:1: ( rule__Entity__Group__1__Impl rule__Entity__Group__2 )
            // InternalSocialRequest.g:888:2: rule__Entity__Group__1__Impl rule__Entity__Group__2
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
    // InternalSocialRequest.g:895:1: rule__Entity__Group__1__Impl : ( ( rule__Entity__NameAssignment_1 ) ) ;
    public final void rule__Entity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:899:1: ( ( ( rule__Entity__NameAssignment_1 ) ) )
            // InternalSocialRequest.g:900:1: ( ( rule__Entity__NameAssignment_1 ) )
            {
            // InternalSocialRequest.g:900:1: ( ( rule__Entity__NameAssignment_1 ) )
            // InternalSocialRequest.g:901:2: ( rule__Entity__NameAssignment_1 )
            {
             before(grammarAccess.getEntityAccess().getNameAssignment_1()); 
            // InternalSocialRequest.g:902:2: ( rule__Entity__NameAssignment_1 )
            // InternalSocialRequest.g:902:3: rule__Entity__NameAssignment_1
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
    // InternalSocialRequest.g:910:1: rule__Entity__Group__2 : rule__Entity__Group__2__Impl rule__Entity__Group__3 ;
    public final void rule__Entity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:914:1: ( rule__Entity__Group__2__Impl rule__Entity__Group__3 )
            // InternalSocialRequest.g:915:2: rule__Entity__Group__2__Impl rule__Entity__Group__3
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
    // InternalSocialRequest.g:922:1: rule__Entity__Group__2__Impl : ( ( rule__Entity__Group_2__0 )? ) ;
    public final void rule__Entity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:926:1: ( ( ( rule__Entity__Group_2__0 )? ) )
            // InternalSocialRequest.g:927:1: ( ( rule__Entity__Group_2__0 )? )
            {
            // InternalSocialRequest.g:927:1: ( ( rule__Entity__Group_2__0 )? )
            // InternalSocialRequest.g:928:2: ( rule__Entity__Group_2__0 )?
            {
             before(grammarAccess.getEntityAccess().getGroup_2()); 
            // InternalSocialRequest.g:929:2: ( rule__Entity__Group_2__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==57) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalSocialRequest.g:929:3: rule__Entity__Group_2__0
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
    // InternalSocialRequest.g:937:1: rule__Entity__Group__3 : rule__Entity__Group__3__Impl rule__Entity__Group__4 ;
    public final void rule__Entity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:941:1: ( rule__Entity__Group__3__Impl rule__Entity__Group__4 )
            // InternalSocialRequest.g:942:2: rule__Entity__Group__3__Impl rule__Entity__Group__4
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
    // InternalSocialRequest.g:949:1: rule__Entity__Group__3__Impl : ( '{' ) ;
    public final void rule__Entity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:953:1: ( ( '{' ) )
            // InternalSocialRequest.g:954:1: ( '{' )
            {
            // InternalSocialRequest.g:954:1: ( '{' )
            // InternalSocialRequest.g:955:2: '{'
            {
             before(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,36,FOLLOW_2); 
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
    // InternalSocialRequest.g:964:1: rule__Entity__Group__4 : rule__Entity__Group__4__Impl rule__Entity__Group__5 ;
    public final void rule__Entity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:968:1: ( rule__Entity__Group__4__Impl rule__Entity__Group__5 )
            // InternalSocialRequest.g:969:2: rule__Entity__Group__4__Impl rule__Entity__Group__5
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
    // InternalSocialRequest.g:976:1: rule__Entity__Group__4__Impl : ( ( ( rule__Entity__AttributesAssignment_4 ) ) ( ( rule__Entity__AttributesAssignment_4 )* ) ) ;
    public final void rule__Entity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:980:1: ( ( ( ( rule__Entity__AttributesAssignment_4 ) ) ( ( rule__Entity__AttributesAssignment_4 )* ) ) )
            // InternalSocialRequest.g:981:1: ( ( ( rule__Entity__AttributesAssignment_4 ) ) ( ( rule__Entity__AttributesAssignment_4 )* ) )
            {
            // InternalSocialRequest.g:981:1: ( ( ( rule__Entity__AttributesAssignment_4 ) ) ( ( rule__Entity__AttributesAssignment_4 )* ) )
            // InternalSocialRequest.g:982:2: ( ( rule__Entity__AttributesAssignment_4 ) ) ( ( rule__Entity__AttributesAssignment_4 )* )
            {
            // InternalSocialRequest.g:982:2: ( ( rule__Entity__AttributesAssignment_4 ) )
            // InternalSocialRequest.g:983:3: ( rule__Entity__AttributesAssignment_4 )
            {
             before(grammarAccess.getEntityAccess().getAttributesAssignment_4()); 
            // InternalSocialRequest.g:984:3: ( rule__Entity__AttributesAssignment_4 )
            // InternalSocialRequest.g:984:4: rule__Entity__AttributesAssignment_4
            {
            pushFollow(FOLLOW_10);
            rule__Entity__AttributesAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getAttributesAssignment_4()); 

            }

            // InternalSocialRequest.g:987:2: ( ( rule__Entity__AttributesAssignment_4 )* )
            // InternalSocialRequest.g:988:3: ( rule__Entity__AttributesAssignment_4 )*
            {
             before(grammarAccess.getEntityAccess().getAttributesAssignment_4()); 
            // InternalSocialRequest.g:989:3: ( rule__Entity__AttributesAssignment_4 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_ID||(LA11_0>=19 && LA11_0<=22)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalSocialRequest.g:989:4: rule__Entity__AttributesAssignment_4
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Entity__AttributesAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
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
    // InternalSocialRequest.g:998:1: rule__Entity__Group__5 : rule__Entity__Group__5__Impl ;
    public final void rule__Entity__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1002:1: ( rule__Entity__Group__5__Impl )
            // InternalSocialRequest.g:1003:2: rule__Entity__Group__5__Impl
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
    // InternalSocialRequest.g:1009:1: rule__Entity__Group__5__Impl : ( '}' ) ;
    public final void rule__Entity__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1013:1: ( ( '}' ) )
            // InternalSocialRequest.g:1014:1: ( '}' )
            {
            // InternalSocialRequest.g:1014:1: ( '}' )
            // InternalSocialRequest.g:1015:2: '}'
            {
             before(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_5()); 
            match(input,37,FOLLOW_2); 
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
    // InternalSocialRequest.g:1025:1: rule__Entity__Group_2__0 : rule__Entity__Group_2__0__Impl rule__Entity__Group_2__1 ;
    public final void rule__Entity__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1029:1: ( rule__Entity__Group_2__0__Impl rule__Entity__Group_2__1 )
            // InternalSocialRequest.g:1030:2: rule__Entity__Group_2__0__Impl rule__Entity__Group_2__1
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
    // InternalSocialRequest.g:1037:1: rule__Entity__Group_2__0__Impl : ( ( rule__Entity__HasUserDetailsAssignment_2_0 ) ) ;
    public final void rule__Entity__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1041:1: ( ( ( rule__Entity__HasUserDetailsAssignment_2_0 ) ) )
            // InternalSocialRequest.g:1042:1: ( ( rule__Entity__HasUserDetailsAssignment_2_0 ) )
            {
            // InternalSocialRequest.g:1042:1: ( ( rule__Entity__HasUserDetailsAssignment_2_0 ) )
            // InternalSocialRequest.g:1043:2: ( rule__Entity__HasUserDetailsAssignment_2_0 )
            {
             before(grammarAccess.getEntityAccess().getHasUserDetailsAssignment_2_0()); 
            // InternalSocialRequest.g:1044:2: ( rule__Entity__HasUserDetailsAssignment_2_0 )
            // InternalSocialRequest.g:1044:3: rule__Entity__HasUserDetailsAssignment_2_0
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
    // InternalSocialRequest.g:1052:1: rule__Entity__Group_2__1 : rule__Entity__Group_2__1__Impl ;
    public final void rule__Entity__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1056:1: ( rule__Entity__Group_2__1__Impl )
            // InternalSocialRequest.g:1057:2: rule__Entity__Group_2__1__Impl
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
    // InternalSocialRequest.g:1063:1: rule__Entity__Group_2__1__Impl : ( 'UserDetails' ) ;
    public final void rule__Entity__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1067:1: ( ( 'UserDetails' ) )
            // InternalSocialRequest.g:1068:1: ( 'UserDetails' )
            {
            // InternalSocialRequest.g:1068:1: ( 'UserDetails' )
            // InternalSocialRequest.g:1069:2: 'UserDetails'
            {
             before(grammarAccess.getEntityAccess().getUserDetailsKeyword_2_1()); 
            match(input,38,FOLLOW_2); 
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
    // InternalSocialRequest.g:1079:1: rule__Attribute__Group__0 : rule__Attribute__Group__0__Impl rule__Attribute__Group__1 ;
    public final void rule__Attribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1083:1: ( rule__Attribute__Group__0__Impl rule__Attribute__Group__1 )
            // InternalSocialRequest.g:1084:2: rule__Attribute__Group__0__Impl rule__Attribute__Group__1
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
    // InternalSocialRequest.g:1091:1: rule__Attribute__Group__0__Impl : ( ( rule__Attribute__AssociationAssignment_0 )? ) ;
    public final void rule__Attribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1095:1: ( ( ( rule__Attribute__AssociationAssignment_0 )? ) )
            // InternalSocialRequest.g:1096:1: ( ( rule__Attribute__AssociationAssignment_0 )? )
            {
            // InternalSocialRequest.g:1096:1: ( ( rule__Attribute__AssociationAssignment_0 )? )
            // InternalSocialRequest.g:1097:2: ( rule__Attribute__AssociationAssignment_0 )?
            {
             before(grammarAccess.getAttributeAccess().getAssociationAssignment_0()); 
            // InternalSocialRequest.g:1098:2: ( rule__Attribute__AssociationAssignment_0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=19 && LA12_0<=22)) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalSocialRequest.g:1098:3: rule__Attribute__AssociationAssignment_0
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
    // InternalSocialRequest.g:1106:1: rule__Attribute__Group__1 : rule__Attribute__Group__1__Impl rule__Attribute__Group__2 ;
    public final void rule__Attribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1110:1: ( rule__Attribute__Group__1__Impl rule__Attribute__Group__2 )
            // InternalSocialRequest.g:1111:2: rule__Attribute__Group__1__Impl rule__Attribute__Group__2
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
    // InternalSocialRequest.g:1118:1: rule__Attribute__Group__1__Impl : ( ( rule__Attribute__NameAssignment_1 ) ) ;
    public final void rule__Attribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1122:1: ( ( ( rule__Attribute__NameAssignment_1 ) ) )
            // InternalSocialRequest.g:1123:1: ( ( rule__Attribute__NameAssignment_1 ) )
            {
            // InternalSocialRequest.g:1123:1: ( ( rule__Attribute__NameAssignment_1 ) )
            // InternalSocialRequest.g:1124:2: ( rule__Attribute__NameAssignment_1 )
            {
             before(grammarAccess.getAttributeAccess().getNameAssignment_1()); 
            // InternalSocialRequest.g:1125:2: ( rule__Attribute__NameAssignment_1 )
            // InternalSocialRequest.g:1125:3: rule__Attribute__NameAssignment_1
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
    // InternalSocialRequest.g:1133:1: rule__Attribute__Group__2 : rule__Attribute__Group__2__Impl rule__Attribute__Group__3 ;
    public final void rule__Attribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1137:1: ( rule__Attribute__Group__2__Impl rule__Attribute__Group__3 )
            // InternalSocialRequest.g:1138:2: rule__Attribute__Group__2__Impl rule__Attribute__Group__3
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
    // InternalSocialRequest.g:1145:1: rule__Attribute__Group__2__Impl : ( ':' ) ;
    public final void rule__Attribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1149:1: ( ( ':' ) )
            // InternalSocialRequest.g:1150:1: ( ':' )
            {
            // InternalSocialRequest.g:1150:1: ( ':' )
            // InternalSocialRequest.g:1151:2: ':'
            {
             before(grammarAccess.getAttributeAccess().getColonKeyword_2()); 
            match(input,39,FOLLOW_2); 
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
    // InternalSocialRequest.g:1160:1: rule__Attribute__Group__3 : rule__Attribute__Group__3__Impl rule__Attribute__Group__4 ;
    public final void rule__Attribute__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1164:1: ( rule__Attribute__Group__3__Impl rule__Attribute__Group__4 )
            // InternalSocialRequest.g:1165:2: rule__Attribute__Group__3__Impl rule__Attribute__Group__4
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
    // InternalSocialRequest.g:1172:1: rule__Attribute__Group__3__Impl : ( ( rule__Attribute__TypeRefAssignment_3 ) ) ;
    public final void rule__Attribute__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1176:1: ( ( ( rule__Attribute__TypeRefAssignment_3 ) ) )
            // InternalSocialRequest.g:1177:1: ( ( rule__Attribute__TypeRefAssignment_3 ) )
            {
            // InternalSocialRequest.g:1177:1: ( ( rule__Attribute__TypeRefAssignment_3 ) )
            // InternalSocialRequest.g:1178:2: ( rule__Attribute__TypeRefAssignment_3 )
            {
             before(grammarAccess.getAttributeAccess().getTypeRefAssignment_3()); 
            // InternalSocialRequest.g:1179:2: ( rule__Attribute__TypeRefAssignment_3 )
            // InternalSocialRequest.g:1179:3: rule__Attribute__TypeRefAssignment_3
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
    // InternalSocialRequest.g:1187:1: rule__Attribute__Group__4 : rule__Attribute__Group__4__Impl rule__Attribute__Group__5 ;
    public final void rule__Attribute__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1191:1: ( rule__Attribute__Group__4__Impl rule__Attribute__Group__5 )
            // InternalSocialRequest.g:1192:2: rule__Attribute__Group__4__Impl rule__Attribute__Group__5
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
    // InternalSocialRequest.g:1199:1: rule__Attribute__Group__4__Impl : ( ( rule__Attribute__ModifierAssignment_4 )? ) ;
    public final void rule__Attribute__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1203:1: ( ( ( rule__Attribute__ModifierAssignment_4 )? ) )
            // InternalSocialRequest.g:1204:1: ( ( rule__Attribute__ModifierAssignment_4 )? )
            {
            // InternalSocialRequest.g:1204:1: ( ( rule__Attribute__ModifierAssignment_4 )? )
            // InternalSocialRequest.g:1205:2: ( rule__Attribute__ModifierAssignment_4 )?
            {
             before(grammarAccess.getAttributeAccess().getModifierAssignment_4()); 
            // InternalSocialRequest.g:1206:2: ( rule__Attribute__ModifierAssignment_4 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=58 && LA13_0<=60)) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalSocialRequest.g:1206:3: rule__Attribute__ModifierAssignment_4
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
    // InternalSocialRequest.g:1214:1: rule__Attribute__Group__5 : rule__Attribute__Group__5__Impl ;
    public final void rule__Attribute__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1218:1: ( rule__Attribute__Group__5__Impl )
            // InternalSocialRequest.g:1219:2: rule__Attribute__Group__5__Impl
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
    // InternalSocialRequest.g:1225:1: rule__Attribute__Group__5__Impl : ( ( rule__Attribute__Group_5__0 )? ) ;
    public final void rule__Attribute__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1229:1: ( ( ( rule__Attribute__Group_5__0 )? ) )
            // InternalSocialRequest.g:1230:1: ( ( rule__Attribute__Group_5__0 )? )
            {
            // InternalSocialRequest.g:1230:1: ( ( rule__Attribute__Group_5__0 )? )
            // InternalSocialRequest.g:1231:2: ( rule__Attribute__Group_5__0 )?
            {
             before(grammarAccess.getAttributeAccess().getGroup_5()); 
            // InternalSocialRequest.g:1232:2: ( rule__Attribute__Group_5__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==36) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalSocialRequest.g:1232:3: rule__Attribute__Group_5__0
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
    // InternalSocialRequest.g:1241:1: rule__Attribute__Group_5__0 : rule__Attribute__Group_5__0__Impl rule__Attribute__Group_5__1 ;
    public final void rule__Attribute__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1245:1: ( rule__Attribute__Group_5__0__Impl rule__Attribute__Group_5__1 )
            // InternalSocialRequest.g:1246:2: rule__Attribute__Group_5__0__Impl rule__Attribute__Group_5__1
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
    // InternalSocialRequest.g:1253:1: rule__Attribute__Group_5__0__Impl : ( '{' ) ;
    public final void rule__Attribute__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1257:1: ( ( '{' ) )
            // InternalSocialRequest.g:1258:1: ( '{' )
            {
            // InternalSocialRequest.g:1258:1: ( '{' )
            // InternalSocialRequest.g:1259:2: '{'
            {
             before(grammarAccess.getAttributeAccess().getLeftCurlyBracketKeyword_5_0()); 
            match(input,36,FOLLOW_2); 
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
    // InternalSocialRequest.g:1268:1: rule__Attribute__Group_5__1 : rule__Attribute__Group_5__1__Impl rule__Attribute__Group_5__2 ;
    public final void rule__Attribute__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1272:1: ( rule__Attribute__Group_5__1__Impl rule__Attribute__Group_5__2 )
            // InternalSocialRequest.g:1273:2: rule__Attribute__Group_5__1__Impl rule__Attribute__Group_5__2
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
    // InternalSocialRequest.g:1280:1: rule__Attribute__Group_5__1__Impl : ( ( rule__Attribute__UnorderedGroup_5_1 ) ) ;
    public final void rule__Attribute__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1284:1: ( ( ( rule__Attribute__UnorderedGroup_5_1 ) ) )
            // InternalSocialRequest.g:1285:1: ( ( rule__Attribute__UnorderedGroup_5_1 ) )
            {
            // InternalSocialRequest.g:1285:1: ( ( rule__Attribute__UnorderedGroup_5_1 ) )
            // InternalSocialRequest.g:1286:2: ( rule__Attribute__UnorderedGroup_5_1 )
            {
             before(grammarAccess.getAttributeAccess().getUnorderedGroup_5_1()); 
            // InternalSocialRequest.g:1287:2: ( rule__Attribute__UnorderedGroup_5_1 )
            // InternalSocialRequest.g:1287:3: rule__Attribute__UnorderedGroup_5_1
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
    // InternalSocialRequest.g:1295:1: rule__Attribute__Group_5__2 : rule__Attribute__Group_5__2__Impl ;
    public final void rule__Attribute__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1299:1: ( rule__Attribute__Group_5__2__Impl )
            // InternalSocialRequest.g:1300:2: rule__Attribute__Group_5__2__Impl
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
    // InternalSocialRequest.g:1306:1: rule__Attribute__Group_5__2__Impl : ( '}' ) ;
    public final void rule__Attribute__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1310:1: ( ( '}' ) )
            // InternalSocialRequest.g:1311:1: ( '}' )
            {
            // InternalSocialRequest.g:1311:1: ( '}' )
            // InternalSocialRequest.g:1312:2: '}'
            {
             before(grammarAccess.getAttributeAccess().getRightCurlyBracketKeyword_5_2()); 
            match(input,37,FOLLOW_2); 
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
    // InternalSocialRequest.g:1322:1: rule__Attribute__Group_5_1_0__0 : rule__Attribute__Group_5_1_0__0__Impl rule__Attribute__Group_5_1_0__1 ;
    public final void rule__Attribute__Group_5_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1326:1: ( rule__Attribute__Group_5_1_0__0__Impl rule__Attribute__Group_5_1_0__1 )
            // InternalSocialRequest.g:1327:2: rule__Attribute__Group_5_1_0__0__Impl rule__Attribute__Group_5_1_0__1
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
    // InternalSocialRequest.g:1334:1: rule__Attribute__Group_5_1_0__0__Impl : ( 'mappedBy:' ) ;
    public final void rule__Attribute__Group_5_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1338:1: ( ( 'mappedBy:' ) )
            // InternalSocialRequest.g:1339:1: ( 'mappedBy:' )
            {
            // InternalSocialRequest.g:1339:1: ( 'mappedBy:' )
            // InternalSocialRequest.g:1340:2: 'mappedBy:'
            {
             before(grammarAccess.getAttributeAccess().getMappedByKeyword_5_1_0_0()); 
            match(input,40,FOLLOW_2); 
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
    // InternalSocialRequest.g:1349:1: rule__Attribute__Group_5_1_0__1 : rule__Attribute__Group_5_1_0__1__Impl ;
    public final void rule__Attribute__Group_5_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1353:1: ( rule__Attribute__Group_5_1_0__1__Impl )
            // InternalSocialRequest.g:1354:2: rule__Attribute__Group_5_1_0__1__Impl
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
    // InternalSocialRequest.g:1360:1: rule__Attribute__Group_5_1_0__1__Impl : ( ( rule__Attribute__MappedByAssignment_5_1_0_1 ) ) ;
    public final void rule__Attribute__Group_5_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1364:1: ( ( ( rule__Attribute__MappedByAssignment_5_1_0_1 ) ) )
            // InternalSocialRequest.g:1365:1: ( ( rule__Attribute__MappedByAssignment_5_1_0_1 ) )
            {
            // InternalSocialRequest.g:1365:1: ( ( rule__Attribute__MappedByAssignment_5_1_0_1 ) )
            // InternalSocialRequest.g:1366:2: ( rule__Attribute__MappedByAssignment_5_1_0_1 )
            {
             before(grammarAccess.getAttributeAccess().getMappedByAssignment_5_1_0_1()); 
            // InternalSocialRequest.g:1367:2: ( rule__Attribute__MappedByAssignment_5_1_0_1 )
            // InternalSocialRequest.g:1367:3: rule__Attribute__MappedByAssignment_5_1_0_1
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
    // InternalSocialRequest.g:1376:1: rule__Attribute__Group_5_1_1__0 : rule__Attribute__Group_5_1_1__0__Impl rule__Attribute__Group_5_1_1__1 ;
    public final void rule__Attribute__Group_5_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1380:1: ( rule__Attribute__Group_5_1_1__0__Impl rule__Attribute__Group_5_1_1__1 )
            // InternalSocialRequest.g:1381:2: rule__Attribute__Group_5_1_1__0__Impl rule__Attribute__Group_5_1_1__1
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
    // InternalSocialRequest.g:1388:1: rule__Attribute__Group_5_1_1__0__Impl : ( 'fetch:' ) ;
    public final void rule__Attribute__Group_5_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1392:1: ( ( 'fetch:' ) )
            // InternalSocialRequest.g:1393:1: ( 'fetch:' )
            {
            // InternalSocialRequest.g:1393:1: ( 'fetch:' )
            // InternalSocialRequest.g:1394:2: 'fetch:'
            {
             before(grammarAccess.getAttributeAccess().getFetchKeyword_5_1_1_0()); 
            match(input,41,FOLLOW_2); 
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
    // InternalSocialRequest.g:1403:1: rule__Attribute__Group_5_1_1__1 : rule__Attribute__Group_5_1_1__1__Impl ;
    public final void rule__Attribute__Group_5_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1407:1: ( rule__Attribute__Group_5_1_1__1__Impl )
            // InternalSocialRequest.g:1408:2: rule__Attribute__Group_5_1_1__1__Impl
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
    // InternalSocialRequest.g:1414:1: rule__Attribute__Group_5_1_1__1__Impl : ( ( rule__Attribute__FetchTypeAssignment_5_1_1_1 ) ) ;
    public final void rule__Attribute__Group_5_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1418:1: ( ( ( rule__Attribute__FetchTypeAssignment_5_1_1_1 ) ) )
            // InternalSocialRequest.g:1419:1: ( ( rule__Attribute__FetchTypeAssignment_5_1_1_1 ) )
            {
            // InternalSocialRequest.g:1419:1: ( ( rule__Attribute__FetchTypeAssignment_5_1_1_1 ) )
            // InternalSocialRequest.g:1420:2: ( rule__Attribute__FetchTypeAssignment_5_1_1_1 )
            {
             before(grammarAccess.getAttributeAccess().getFetchTypeAssignment_5_1_1_1()); 
            // InternalSocialRequest.g:1421:2: ( rule__Attribute__FetchTypeAssignment_5_1_1_1 )
            // InternalSocialRequest.g:1421:3: rule__Attribute__FetchTypeAssignment_5_1_1_1
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
    // InternalSocialRequest.g:1430:1: rule__Attribute__Group_5_1_2__0 : rule__Attribute__Group_5_1_2__0__Impl rule__Attribute__Group_5_1_2__1 ;
    public final void rule__Attribute__Group_5_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1434:1: ( rule__Attribute__Group_5_1_2__0__Impl rule__Attribute__Group_5_1_2__1 )
            // InternalSocialRequest.g:1435:2: rule__Attribute__Group_5_1_2__0__Impl rule__Attribute__Group_5_1_2__1
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
    // InternalSocialRequest.g:1442:1: rule__Attribute__Group_5_1_2__0__Impl : ( 'validations' ) ;
    public final void rule__Attribute__Group_5_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1446:1: ( ( 'validations' ) )
            // InternalSocialRequest.g:1447:1: ( 'validations' )
            {
            // InternalSocialRequest.g:1447:1: ( 'validations' )
            // InternalSocialRequest.g:1448:2: 'validations'
            {
             before(grammarAccess.getAttributeAccess().getValidationsKeyword_5_1_2_0()); 
            match(input,42,FOLLOW_2); 
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
    // InternalSocialRequest.g:1457:1: rule__Attribute__Group_5_1_2__1 : rule__Attribute__Group_5_1_2__1__Impl rule__Attribute__Group_5_1_2__2 ;
    public final void rule__Attribute__Group_5_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1461:1: ( rule__Attribute__Group_5_1_2__1__Impl rule__Attribute__Group_5_1_2__2 )
            // InternalSocialRequest.g:1462:2: rule__Attribute__Group_5_1_2__1__Impl rule__Attribute__Group_5_1_2__2
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
    // InternalSocialRequest.g:1469:1: rule__Attribute__Group_5_1_2__1__Impl : ( '{' ) ;
    public final void rule__Attribute__Group_5_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1473:1: ( ( '{' ) )
            // InternalSocialRequest.g:1474:1: ( '{' )
            {
            // InternalSocialRequest.g:1474:1: ( '{' )
            // InternalSocialRequest.g:1475:2: '{'
            {
             before(grammarAccess.getAttributeAccess().getLeftCurlyBracketKeyword_5_1_2_1()); 
            match(input,36,FOLLOW_2); 
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
    // InternalSocialRequest.g:1484:1: rule__Attribute__Group_5_1_2__2 : rule__Attribute__Group_5_1_2__2__Impl rule__Attribute__Group_5_1_2__3 ;
    public final void rule__Attribute__Group_5_1_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1488:1: ( rule__Attribute__Group_5_1_2__2__Impl rule__Attribute__Group_5_1_2__3 )
            // InternalSocialRequest.g:1489:2: rule__Attribute__Group_5_1_2__2__Impl rule__Attribute__Group_5_1_2__3
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
    // InternalSocialRequest.g:1496:1: rule__Attribute__Group_5_1_2__2__Impl : ( ( ( rule__Attribute__ValidationsAssignment_5_1_2_2 ) ) ( ( rule__Attribute__ValidationsAssignment_5_1_2_2 )* ) ) ;
    public final void rule__Attribute__Group_5_1_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1500:1: ( ( ( ( rule__Attribute__ValidationsAssignment_5_1_2_2 ) ) ( ( rule__Attribute__ValidationsAssignment_5_1_2_2 )* ) ) )
            // InternalSocialRequest.g:1501:1: ( ( ( rule__Attribute__ValidationsAssignment_5_1_2_2 ) ) ( ( rule__Attribute__ValidationsAssignment_5_1_2_2 )* ) )
            {
            // InternalSocialRequest.g:1501:1: ( ( ( rule__Attribute__ValidationsAssignment_5_1_2_2 ) ) ( ( rule__Attribute__ValidationsAssignment_5_1_2_2 )* ) )
            // InternalSocialRequest.g:1502:2: ( ( rule__Attribute__ValidationsAssignment_5_1_2_2 ) ) ( ( rule__Attribute__ValidationsAssignment_5_1_2_2 )* )
            {
            // InternalSocialRequest.g:1502:2: ( ( rule__Attribute__ValidationsAssignment_5_1_2_2 ) )
            // InternalSocialRequest.g:1503:3: ( rule__Attribute__ValidationsAssignment_5_1_2_2 )
            {
             before(grammarAccess.getAttributeAccess().getValidationsAssignment_5_1_2_2()); 
            // InternalSocialRequest.g:1504:3: ( rule__Attribute__ValidationsAssignment_5_1_2_2 )
            // InternalSocialRequest.g:1504:4: rule__Attribute__ValidationsAssignment_5_1_2_2
            {
            pushFollow(FOLLOW_19);
            rule__Attribute__ValidationsAssignment_5_1_2_2();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getValidationsAssignment_5_1_2_2()); 

            }

            // InternalSocialRequest.g:1507:2: ( ( rule__Attribute__ValidationsAssignment_5_1_2_2 )* )
            // InternalSocialRequest.g:1508:3: ( rule__Attribute__ValidationsAssignment_5_1_2_2 )*
            {
             before(grammarAccess.getAttributeAccess().getValidationsAssignment_5_1_2_2()); 
            // InternalSocialRequest.g:1509:3: ( rule__Attribute__ValidationsAssignment_5_1_2_2 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>=14 && LA15_0<=18)||(LA15_0>=45 && LA15_0<=47)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalSocialRequest.g:1509:4: rule__Attribute__ValidationsAssignment_5_1_2_2
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__Attribute__ValidationsAssignment_5_1_2_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
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
    // InternalSocialRequest.g:1518:1: rule__Attribute__Group_5_1_2__3 : rule__Attribute__Group_5_1_2__3__Impl ;
    public final void rule__Attribute__Group_5_1_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1522:1: ( rule__Attribute__Group_5_1_2__3__Impl )
            // InternalSocialRequest.g:1523:2: rule__Attribute__Group_5_1_2__3__Impl
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
    // InternalSocialRequest.g:1529:1: rule__Attribute__Group_5_1_2__3__Impl : ( '}' ) ;
    public final void rule__Attribute__Group_5_1_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1533:1: ( ( '}' ) )
            // InternalSocialRequest.g:1534:1: ( '}' )
            {
            // InternalSocialRequest.g:1534:1: ( '}' )
            // InternalSocialRequest.g:1535:2: '}'
            {
             before(grammarAccess.getAttributeAccess().getRightCurlyBracketKeyword_5_1_2_3()); 
            match(input,37,FOLLOW_2); 
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
    // InternalSocialRequest.g:1545:1: rule__Modifier__Group_2__0 : rule__Modifier__Group_2__0__Impl rule__Modifier__Group_2__1 ;
    public final void rule__Modifier__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1549:1: ( rule__Modifier__Group_2__0__Impl rule__Modifier__Group_2__1 )
            // InternalSocialRequest.g:1550:2: rule__Modifier__Group_2__0__Impl rule__Modifier__Group_2__1
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
    // InternalSocialRequest.g:1557:1: rule__Modifier__Group_2__0__Impl : ( ( rule__Modifier__IsIDAssignment_2_0 ) ) ;
    public final void rule__Modifier__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1561:1: ( ( ( rule__Modifier__IsIDAssignment_2_0 ) ) )
            // InternalSocialRequest.g:1562:1: ( ( rule__Modifier__IsIDAssignment_2_0 ) )
            {
            // InternalSocialRequest.g:1562:1: ( ( rule__Modifier__IsIDAssignment_2_0 ) )
            // InternalSocialRequest.g:1563:2: ( rule__Modifier__IsIDAssignment_2_0 )
            {
             before(grammarAccess.getModifierAccess().getIsIDAssignment_2_0()); 
            // InternalSocialRequest.g:1564:2: ( rule__Modifier__IsIDAssignment_2_0 )
            // InternalSocialRequest.g:1564:3: rule__Modifier__IsIDAssignment_2_0
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
    // InternalSocialRequest.g:1572:1: rule__Modifier__Group_2__1 : rule__Modifier__Group_2__1__Impl ;
    public final void rule__Modifier__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1576:1: ( rule__Modifier__Group_2__1__Impl )
            // InternalSocialRequest.g:1577:2: rule__Modifier__Group_2__1__Impl
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
    // InternalSocialRequest.g:1583:1: rule__Modifier__Group_2__1__Impl : ( ( rule__Modifier__Group_2_1__0 )? ) ;
    public final void rule__Modifier__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1587:1: ( ( ( rule__Modifier__Group_2_1__0 )? ) )
            // InternalSocialRequest.g:1588:1: ( ( rule__Modifier__Group_2_1__0 )? )
            {
            // InternalSocialRequest.g:1588:1: ( ( rule__Modifier__Group_2_1__0 )? )
            // InternalSocialRequest.g:1589:2: ( rule__Modifier__Group_2_1__0 )?
            {
             before(grammarAccess.getModifierAccess().getGroup_2_1()); 
            // InternalSocialRequest.g:1590:2: ( rule__Modifier__Group_2_1__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==43) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalSocialRequest.g:1590:3: rule__Modifier__Group_2_1__0
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
    // InternalSocialRequest.g:1599:1: rule__Modifier__Group_2_1__0 : rule__Modifier__Group_2_1__0__Impl rule__Modifier__Group_2_1__1 ;
    public final void rule__Modifier__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1603:1: ( rule__Modifier__Group_2_1__0__Impl rule__Modifier__Group_2_1__1 )
            // InternalSocialRequest.g:1604:2: rule__Modifier__Group_2_1__0__Impl rule__Modifier__Group_2_1__1
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
    // InternalSocialRequest.g:1611:1: rule__Modifier__Group_2_1__0__Impl : ( '(' ) ;
    public final void rule__Modifier__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1615:1: ( ( '(' ) )
            // InternalSocialRequest.g:1616:1: ( '(' )
            {
            // InternalSocialRequest.g:1616:1: ( '(' )
            // InternalSocialRequest.g:1617:2: '('
            {
             before(grammarAccess.getModifierAccess().getLeftParenthesisKeyword_2_1_0()); 
            match(input,43,FOLLOW_2); 
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
    // InternalSocialRequest.g:1626:1: rule__Modifier__Group_2_1__1 : rule__Modifier__Group_2_1__1__Impl rule__Modifier__Group_2_1__2 ;
    public final void rule__Modifier__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1630:1: ( rule__Modifier__Group_2_1__1__Impl rule__Modifier__Group_2_1__2 )
            // InternalSocialRequest.g:1631:2: rule__Modifier__Group_2_1__1__Impl rule__Modifier__Group_2_1__2
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
    // InternalSocialRequest.g:1638:1: rule__Modifier__Group_2_1__1__Impl : ( ( rule__Modifier__IDGenerationTypeAssignment_2_1_1 ) ) ;
    public final void rule__Modifier__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1642:1: ( ( ( rule__Modifier__IDGenerationTypeAssignment_2_1_1 ) ) )
            // InternalSocialRequest.g:1643:1: ( ( rule__Modifier__IDGenerationTypeAssignment_2_1_1 ) )
            {
            // InternalSocialRequest.g:1643:1: ( ( rule__Modifier__IDGenerationTypeAssignment_2_1_1 ) )
            // InternalSocialRequest.g:1644:2: ( rule__Modifier__IDGenerationTypeAssignment_2_1_1 )
            {
             before(grammarAccess.getModifierAccess().getIDGenerationTypeAssignment_2_1_1()); 
            // InternalSocialRequest.g:1645:2: ( rule__Modifier__IDGenerationTypeAssignment_2_1_1 )
            // InternalSocialRequest.g:1645:3: rule__Modifier__IDGenerationTypeAssignment_2_1_1
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
    // InternalSocialRequest.g:1653:1: rule__Modifier__Group_2_1__2 : rule__Modifier__Group_2_1__2__Impl ;
    public final void rule__Modifier__Group_2_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1657:1: ( rule__Modifier__Group_2_1__2__Impl )
            // InternalSocialRequest.g:1658:2: rule__Modifier__Group_2_1__2__Impl
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
    // InternalSocialRequest.g:1664:1: rule__Modifier__Group_2_1__2__Impl : ( ')' ) ;
    public final void rule__Modifier__Group_2_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1668:1: ( ( ')' ) )
            // InternalSocialRequest.g:1669:1: ( ')' )
            {
            // InternalSocialRequest.g:1669:1: ( ')' )
            // InternalSocialRequest.g:1670:2: ')'
            {
             before(grammarAccess.getModifierAccess().getRightParenthesisKeyword_2_1_2()); 
            match(input,44,FOLLOW_2); 
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
    // InternalSocialRequest.g:1680:1: rule__Validation__Group_0__0 : rule__Validation__Group_0__0__Impl rule__Validation__Group_0__1 ;
    public final void rule__Validation__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1684:1: ( rule__Validation__Group_0__0__Impl rule__Validation__Group_0__1 )
            // InternalSocialRequest.g:1685:2: rule__Validation__Group_0__0__Impl rule__Validation__Group_0__1
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
    // InternalSocialRequest.g:1692:1: rule__Validation__Group_0__0__Impl : ( 'min:' ) ;
    public final void rule__Validation__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1696:1: ( ( 'min:' ) )
            // InternalSocialRequest.g:1697:1: ( 'min:' )
            {
            // InternalSocialRequest.g:1697:1: ( 'min:' )
            // InternalSocialRequest.g:1698:2: 'min:'
            {
             before(grammarAccess.getValidationAccess().getMinKeyword_0_0()); 
            match(input,45,FOLLOW_2); 
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
    // InternalSocialRequest.g:1707:1: rule__Validation__Group_0__1 : rule__Validation__Group_0__1__Impl ;
    public final void rule__Validation__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1711:1: ( rule__Validation__Group_0__1__Impl )
            // InternalSocialRequest.g:1712:2: rule__Validation__Group_0__1__Impl
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
    // InternalSocialRequest.g:1718:1: rule__Validation__Group_0__1__Impl : ( ( rule__Validation__MinAssignment_0_1 ) ) ;
    public final void rule__Validation__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1722:1: ( ( ( rule__Validation__MinAssignment_0_1 ) ) )
            // InternalSocialRequest.g:1723:1: ( ( rule__Validation__MinAssignment_0_1 ) )
            {
            // InternalSocialRequest.g:1723:1: ( ( rule__Validation__MinAssignment_0_1 ) )
            // InternalSocialRequest.g:1724:2: ( rule__Validation__MinAssignment_0_1 )
            {
             before(grammarAccess.getValidationAccess().getMinAssignment_0_1()); 
            // InternalSocialRequest.g:1725:2: ( rule__Validation__MinAssignment_0_1 )
            // InternalSocialRequest.g:1725:3: rule__Validation__MinAssignment_0_1
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
    // InternalSocialRequest.g:1734:1: rule__Validation__Group_1__0 : rule__Validation__Group_1__0__Impl rule__Validation__Group_1__1 ;
    public final void rule__Validation__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1738:1: ( rule__Validation__Group_1__0__Impl rule__Validation__Group_1__1 )
            // InternalSocialRequest.g:1739:2: rule__Validation__Group_1__0__Impl rule__Validation__Group_1__1
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
    // InternalSocialRequest.g:1746:1: rule__Validation__Group_1__0__Impl : ( 'max:' ) ;
    public final void rule__Validation__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1750:1: ( ( 'max:' ) )
            // InternalSocialRequest.g:1751:1: ( 'max:' )
            {
            // InternalSocialRequest.g:1751:1: ( 'max:' )
            // InternalSocialRequest.g:1752:2: 'max:'
            {
             before(grammarAccess.getValidationAccess().getMaxKeyword_1_0()); 
            match(input,46,FOLLOW_2); 
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
    // InternalSocialRequest.g:1761:1: rule__Validation__Group_1__1 : rule__Validation__Group_1__1__Impl ;
    public final void rule__Validation__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1765:1: ( rule__Validation__Group_1__1__Impl )
            // InternalSocialRequest.g:1766:2: rule__Validation__Group_1__1__Impl
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
    // InternalSocialRequest.g:1772:1: rule__Validation__Group_1__1__Impl : ( ( rule__Validation__MaxAssignment_1_1 ) ) ;
    public final void rule__Validation__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1776:1: ( ( ( rule__Validation__MaxAssignment_1_1 ) ) )
            // InternalSocialRequest.g:1777:1: ( ( rule__Validation__MaxAssignment_1_1 ) )
            {
            // InternalSocialRequest.g:1777:1: ( ( rule__Validation__MaxAssignment_1_1 ) )
            // InternalSocialRequest.g:1778:2: ( rule__Validation__MaxAssignment_1_1 )
            {
             before(grammarAccess.getValidationAccess().getMaxAssignment_1_1()); 
            // InternalSocialRequest.g:1779:2: ( rule__Validation__MaxAssignment_1_1 )
            // InternalSocialRequest.g:1779:3: rule__Validation__MaxAssignment_1_1
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
    // InternalSocialRequest.g:1788:1: rule__Validation__Group_2__0 : rule__Validation__Group_2__0__Impl rule__Validation__Group_2__1 ;
    public final void rule__Validation__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1792:1: ( rule__Validation__Group_2__0__Impl rule__Validation__Group_2__1 )
            // InternalSocialRequest.g:1793:2: rule__Validation__Group_2__0__Impl rule__Validation__Group_2__1
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
    // InternalSocialRequest.g:1800:1: rule__Validation__Group_2__0__Impl : ( 'pattern:' ) ;
    public final void rule__Validation__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1804:1: ( ( 'pattern:' ) )
            // InternalSocialRequest.g:1805:1: ( 'pattern:' )
            {
            // InternalSocialRequest.g:1805:1: ( 'pattern:' )
            // InternalSocialRequest.g:1806:2: 'pattern:'
            {
             before(grammarAccess.getValidationAccess().getPatternKeyword_2_0()); 
            match(input,47,FOLLOW_2); 
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
    // InternalSocialRequest.g:1815:1: rule__Validation__Group_2__1 : rule__Validation__Group_2__1__Impl ;
    public final void rule__Validation__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1819:1: ( rule__Validation__Group_2__1__Impl )
            // InternalSocialRequest.g:1820:2: rule__Validation__Group_2__1__Impl
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
    // InternalSocialRequest.g:1826:1: rule__Validation__Group_2__1__Impl : ( ( rule__Validation__RegexAssignment_2_1 ) ) ;
    public final void rule__Validation__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1830:1: ( ( ( rule__Validation__RegexAssignment_2_1 ) ) )
            // InternalSocialRequest.g:1831:1: ( ( rule__Validation__RegexAssignment_2_1 ) )
            {
            // InternalSocialRequest.g:1831:1: ( ( rule__Validation__RegexAssignment_2_1 ) )
            // InternalSocialRequest.g:1832:2: ( rule__Validation__RegexAssignment_2_1 )
            {
             before(grammarAccess.getValidationAccess().getRegexAssignment_2_1()); 
            // InternalSocialRequest.g:1833:2: ( rule__Validation__RegexAssignment_2_1 )
            // InternalSocialRequest.g:1833:3: rule__Validation__RegexAssignment_2_1
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
    // InternalSocialRequest.g:1842:1: rule__Repository__Group__0 : rule__Repository__Group__0__Impl rule__Repository__Group__1 ;
    public final void rule__Repository__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1846:1: ( rule__Repository__Group__0__Impl rule__Repository__Group__1 )
            // InternalSocialRequest.g:1847:2: rule__Repository__Group__0__Impl rule__Repository__Group__1
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
    // InternalSocialRequest.g:1854:1: rule__Repository__Group__0__Impl : ( 'Repository' ) ;
    public final void rule__Repository__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1858:1: ( ( 'Repository' ) )
            // InternalSocialRequest.g:1859:1: ( 'Repository' )
            {
            // InternalSocialRequest.g:1859:1: ( 'Repository' )
            // InternalSocialRequest.g:1860:2: 'Repository'
            {
             before(grammarAccess.getRepositoryAccess().getRepositoryKeyword_0()); 
            match(input,48,FOLLOW_2); 
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
    // InternalSocialRequest.g:1869:1: rule__Repository__Group__1 : rule__Repository__Group__1__Impl rule__Repository__Group__2 ;
    public final void rule__Repository__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1873:1: ( rule__Repository__Group__1__Impl rule__Repository__Group__2 )
            // InternalSocialRequest.g:1874:2: rule__Repository__Group__1__Impl rule__Repository__Group__2
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
    // InternalSocialRequest.g:1881:1: rule__Repository__Group__1__Impl : ( ( rule__Repository__EntityAssignment_1 ) ) ;
    public final void rule__Repository__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1885:1: ( ( ( rule__Repository__EntityAssignment_1 ) ) )
            // InternalSocialRequest.g:1886:1: ( ( rule__Repository__EntityAssignment_1 ) )
            {
            // InternalSocialRequest.g:1886:1: ( ( rule__Repository__EntityAssignment_1 ) )
            // InternalSocialRequest.g:1887:2: ( rule__Repository__EntityAssignment_1 )
            {
             before(grammarAccess.getRepositoryAccess().getEntityAssignment_1()); 
            // InternalSocialRequest.g:1888:2: ( rule__Repository__EntityAssignment_1 )
            // InternalSocialRequest.g:1888:3: rule__Repository__EntityAssignment_1
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
    // InternalSocialRequest.g:1896:1: rule__Repository__Group__2 : rule__Repository__Group__2__Impl rule__Repository__Group__3 ;
    public final void rule__Repository__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1900:1: ( rule__Repository__Group__2__Impl rule__Repository__Group__3 )
            // InternalSocialRequest.g:1901:2: rule__Repository__Group__2__Impl rule__Repository__Group__3
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
    // InternalSocialRequest.g:1908:1: rule__Repository__Group__2__Impl : ( '{' ) ;
    public final void rule__Repository__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1912:1: ( ( '{' ) )
            // InternalSocialRequest.g:1913:1: ( '{' )
            {
            // InternalSocialRequest.g:1913:1: ( '{' )
            // InternalSocialRequest.g:1914:2: '{'
            {
             before(grammarAccess.getRepositoryAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,36,FOLLOW_2); 
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
    // InternalSocialRequest.g:1923:1: rule__Repository__Group__3 : rule__Repository__Group__3__Impl rule__Repository__Group__4 ;
    public final void rule__Repository__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1927:1: ( rule__Repository__Group__3__Impl rule__Repository__Group__4 )
            // InternalSocialRequest.g:1928:2: rule__Repository__Group__3__Impl rule__Repository__Group__4
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
    // InternalSocialRequest.g:1935:1: rule__Repository__Group__3__Impl : ( ( ( rule__Repository__QueriesAssignment_3 ) ) ( ( rule__Repository__QueriesAssignment_3 )* ) ) ;
    public final void rule__Repository__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1939:1: ( ( ( ( rule__Repository__QueriesAssignment_3 ) ) ( ( rule__Repository__QueriesAssignment_3 )* ) ) )
            // InternalSocialRequest.g:1940:1: ( ( ( rule__Repository__QueriesAssignment_3 ) ) ( ( rule__Repository__QueriesAssignment_3 )* ) )
            {
            // InternalSocialRequest.g:1940:1: ( ( ( rule__Repository__QueriesAssignment_3 ) ) ( ( rule__Repository__QueriesAssignment_3 )* ) )
            // InternalSocialRequest.g:1941:2: ( ( rule__Repository__QueriesAssignment_3 ) ) ( ( rule__Repository__QueriesAssignment_3 )* )
            {
            // InternalSocialRequest.g:1941:2: ( ( rule__Repository__QueriesAssignment_3 ) )
            // InternalSocialRequest.g:1942:3: ( rule__Repository__QueriesAssignment_3 )
            {
             before(grammarAccess.getRepositoryAccess().getQueriesAssignment_3()); 
            // InternalSocialRequest.g:1943:3: ( rule__Repository__QueriesAssignment_3 )
            // InternalSocialRequest.g:1943:4: rule__Repository__QueriesAssignment_3
            {
            pushFollow(FOLLOW_26);
            rule__Repository__QueriesAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getRepositoryAccess().getQueriesAssignment_3()); 

            }

            // InternalSocialRequest.g:1946:2: ( ( rule__Repository__QueriesAssignment_3 )* )
            // InternalSocialRequest.g:1947:3: ( rule__Repository__QueriesAssignment_3 )*
            {
             before(grammarAccess.getRepositoryAccess().getQueriesAssignment_3()); 
            // InternalSocialRequest.g:1948:3: ( rule__Repository__QueriesAssignment_3 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==49) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalSocialRequest.g:1948:4: rule__Repository__QueriesAssignment_3
            	    {
            	    pushFollow(FOLLOW_26);
            	    rule__Repository__QueriesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
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
    // InternalSocialRequest.g:1957:1: rule__Repository__Group__4 : rule__Repository__Group__4__Impl ;
    public final void rule__Repository__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1961:1: ( rule__Repository__Group__4__Impl )
            // InternalSocialRequest.g:1962:2: rule__Repository__Group__4__Impl
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
    // InternalSocialRequest.g:1968:1: rule__Repository__Group__4__Impl : ( '}' ) ;
    public final void rule__Repository__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1972:1: ( ( '}' ) )
            // InternalSocialRequest.g:1973:1: ( '}' )
            {
            // InternalSocialRequest.g:1973:1: ( '}' )
            // InternalSocialRequest.g:1974:2: '}'
            {
             before(grammarAccess.getRepositoryAccess().getRightCurlyBracketKeyword_4()); 
            match(input,37,FOLLOW_2); 
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
    // InternalSocialRequest.g:1984:1: rule__Query__Group__0 : rule__Query__Group__0__Impl rule__Query__Group__1 ;
    public final void rule__Query__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1988:1: ( rule__Query__Group__0__Impl rule__Query__Group__1 )
            // InternalSocialRequest.g:1989:2: rule__Query__Group__0__Impl rule__Query__Group__1
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
    // InternalSocialRequest.g:1996:1: rule__Query__Group__0__Impl : ( 'query' ) ;
    public final void rule__Query__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2000:1: ( ( 'query' ) )
            // InternalSocialRequest.g:2001:1: ( 'query' )
            {
            // InternalSocialRequest.g:2001:1: ( 'query' )
            // InternalSocialRequest.g:2002:2: 'query'
            {
             before(grammarAccess.getQueryAccess().getQueryKeyword_0()); 
            match(input,49,FOLLOW_2); 
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
    // InternalSocialRequest.g:2011:1: rule__Query__Group__1 : rule__Query__Group__1__Impl rule__Query__Group__2 ;
    public final void rule__Query__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2015:1: ( rule__Query__Group__1__Impl rule__Query__Group__2 )
            // InternalSocialRequest.g:2016:2: rule__Query__Group__1__Impl rule__Query__Group__2
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
    // InternalSocialRequest.g:2023:1: rule__Query__Group__1__Impl : ( ( rule__Query__NameAssignment_1 ) ) ;
    public final void rule__Query__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2027:1: ( ( ( rule__Query__NameAssignment_1 ) ) )
            // InternalSocialRequest.g:2028:1: ( ( rule__Query__NameAssignment_1 ) )
            {
            // InternalSocialRequest.g:2028:1: ( ( rule__Query__NameAssignment_1 ) )
            // InternalSocialRequest.g:2029:2: ( rule__Query__NameAssignment_1 )
            {
             before(grammarAccess.getQueryAccess().getNameAssignment_1()); 
            // InternalSocialRequest.g:2030:2: ( rule__Query__NameAssignment_1 )
            // InternalSocialRequest.g:2030:3: rule__Query__NameAssignment_1
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
    // InternalSocialRequest.g:2038:1: rule__Query__Group__2 : rule__Query__Group__2__Impl rule__Query__Group__3 ;
    public final void rule__Query__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2042:1: ( rule__Query__Group__2__Impl rule__Query__Group__3 )
            // InternalSocialRequest.g:2043:2: rule__Query__Group__2__Impl rule__Query__Group__3
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
    // InternalSocialRequest.g:2050:1: rule__Query__Group__2__Impl : ( ( rule__Query__Group_2__0 )? ) ;
    public final void rule__Query__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2054:1: ( ( ( rule__Query__Group_2__0 )? ) )
            // InternalSocialRequest.g:2055:1: ( ( rule__Query__Group_2__0 )? )
            {
            // InternalSocialRequest.g:2055:1: ( ( rule__Query__Group_2__0 )? )
            // InternalSocialRequest.g:2056:2: ( rule__Query__Group_2__0 )?
            {
             before(grammarAccess.getQueryAccess().getGroup_2()); 
            // InternalSocialRequest.g:2057:2: ( rule__Query__Group_2__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==39) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalSocialRequest.g:2057:3: rule__Query__Group_2__0
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
    // InternalSocialRequest.g:2065:1: rule__Query__Group__3 : rule__Query__Group__3__Impl ;
    public final void rule__Query__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2069:1: ( rule__Query__Group__3__Impl )
            // InternalSocialRequest.g:2070:2: rule__Query__Group__3__Impl
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
    // InternalSocialRequest.g:2076:1: rule__Query__Group__3__Impl : ( ( rule__Query__Group_3__0 ) ) ;
    public final void rule__Query__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2080:1: ( ( ( rule__Query__Group_3__0 ) ) )
            // InternalSocialRequest.g:2081:1: ( ( rule__Query__Group_3__0 ) )
            {
            // InternalSocialRequest.g:2081:1: ( ( rule__Query__Group_3__0 ) )
            // InternalSocialRequest.g:2082:2: ( rule__Query__Group_3__0 )
            {
             before(grammarAccess.getQueryAccess().getGroup_3()); 
            // InternalSocialRequest.g:2083:2: ( rule__Query__Group_3__0 )
            // InternalSocialRequest.g:2083:3: rule__Query__Group_3__0
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
    // InternalSocialRequest.g:2092:1: rule__Query__Group_2__0 : rule__Query__Group_2__0__Impl rule__Query__Group_2__1 ;
    public final void rule__Query__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2096:1: ( rule__Query__Group_2__0__Impl rule__Query__Group_2__1 )
            // InternalSocialRequest.g:2097:2: rule__Query__Group_2__0__Impl rule__Query__Group_2__1
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
    // InternalSocialRequest.g:2104:1: rule__Query__Group_2__0__Impl : ( ( rule__Query__IsListAssignment_2_0 ) ) ;
    public final void rule__Query__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2108:1: ( ( ( rule__Query__IsListAssignment_2_0 ) ) )
            // InternalSocialRequest.g:2109:1: ( ( rule__Query__IsListAssignment_2_0 ) )
            {
            // InternalSocialRequest.g:2109:1: ( ( rule__Query__IsListAssignment_2_0 ) )
            // InternalSocialRequest.g:2110:2: ( rule__Query__IsListAssignment_2_0 )
            {
             before(grammarAccess.getQueryAccess().getIsListAssignment_2_0()); 
            // InternalSocialRequest.g:2111:2: ( rule__Query__IsListAssignment_2_0 )
            // InternalSocialRequest.g:2111:3: rule__Query__IsListAssignment_2_0
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
    // InternalSocialRequest.g:2119:1: rule__Query__Group_2__1 : rule__Query__Group_2__1__Impl ;
    public final void rule__Query__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2123:1: ( rule__Query__Group_2__1__Impl )
            // InternalSocialRequest.g:2124:2: rule__Query__Group_2__1__Impl
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
    // InternalSocialRequest.g:2130:1: rule__Query__Group_2__1__Impl : ( 'list' ) ;
    public final void rule__Query__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2134:1: ( ( 'list' ) )
            // InternalSocialRequest.g:2135:1: ( 'list' )
            {
            // InternalSocialRequest.g:2135:1: ( 'list' )
            // InternalSocialRequest.g:2136:2: 'list'
            {
             before(grammarAccess.getQueryAccess().getListKeyword_2_1()); 
            match(input,50,FOLLOW_2); 
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
    // InternalSocialRequest.g:2146:1: rule__Query__Group_3__0 : rule__Query__Group_3__0__Impl rule__Query__Group_3__1 ;
    public final void rule__Query__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2150:1: ( rule__Query__Group_3__0__Impl rule__Query__Group_3__1 )
            // InternalSocialRequest.g:2151:2: rule__Query__Group_3__0__Impl rule__Query__Group_3__1
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
    // InternalSocialRequest.g:2158:1: rule__Query__Group_3__0__Impl : ( '{' ) ;
    public final void rule__Query__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2162:1: ( ( '{' ) )
            // InternalSocialRequest.g:2163:1: ( '{' )
            {
            // InternalSocialRequest.g:2163:1: ( '{' )
            // InternalSocialRequest.g:2164:2: '{'
            {
             before(grammarAccess.getQueryAccess().getLeftCurlyBracketKeyword_3_0()); 
            match(input,36,FOLLOW_2); 
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
    // InternalSocialRequest.g:2173:1: rule__Query__Group_3__1 : rule__Query__Group_3__1__Impl rule__Query__Group_3__2 ;
    public final void rule__Query__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2177:1: ( rule__Query__Group_3__1__Impl rule__Query__Group_3__2 )
            // InternalSocialRequest.g:2178:2: rule__Query__Group_3__1__Impl rule__Query__Group_3__2
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
    // InternalSocialRequest.g:2185:1: rule__Query__Group_3__1__Impl : ( ( rule__Query__Group_3_1__0 )? ) ;
    public final void rule__Query__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2189:1: ( ( ( rule__Query__Group_3_1__0 )? ) )
            // InternalSocialRequest.g:2190:1: ( ( rule__Query__Group_3_1__0 )? )
            {
            // InternalSocialRequest.g:2190:1: ( ( rule__Query__Group_3_1__0 )? )
            // InternalSocialRequest.g:2191:2: ( rule__Query__Group_3_1__0 )?
            {
             before(grammarAccess.getQueryAccess().getGroup_3_1()); 
            // InternalSocialRequest.g:2192:2: ( rule__Query__Group_3_1__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==51) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalSocialRequest.g:2192:3: rule__Query__Group_3_1__0
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
    // InternalSocialRequest.g:2200:1: rule__Query__Group_3__2 : rule__Query__Group_3__2__Impl rule__Query__Group_3__3 ;
    public final void rule__Query__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2204:1: ( rule__Query__Group_3__2__Impl rule__Query__Group_3__3 )
            // InternalSocialRequest.g:2205:2: rule__Query__Group_3__2__Impl rule__Query__Group_3__3
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
    // InternalSocialRequest.g:2212:1: rule__Query__Group_3__2__Impl : ( ( rule__Query__SqlQueryAssignment_3_2 )? ) ;
    public final void rule__Query__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2216:1: ( ( ( rule__Query__SqlQueryAssignment_3_2 )? ) )
            // InternalSocialRequest.g:2217:1: ( ( rule__Query__SqlQueryAssignment_3_2 )? )
            {
            // InternalSocialRequest.g:2217:1: ( ( rule__Query__SqlQueryAssignment_3_2 )? )
            // InternalSocialRequest.g:2218:2: ( rule__Query__SqlQueryAssignment_3_2 )?
            {
             before(grammarAccess.getQueryAccess().getSqlQueryAssignment_3_2()); 
            // InternalSocialRequest.g:2219:2: ( rule__Query__SqlQueryAssignment_3_2 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==52) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalSocialRequest.g:2219:3: rule__Query__SqlQueryAssignment_3_2
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
    // InternalSocialRequest.g:2227:1: rule__Query__Group_3__3 : rule__Query__Group_3__3__Impl ;
    public final void rule__Query__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2231:1: ( rule__Query__Group_3__3__Impl )
            // InternalSocialRequest.g:2232:2: rule__Query__Group_3__3__Impl
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
    // InternalSocialRequest.g:2238:1: rule__Query__Group_3__3__Impl : ( '}' ) ;
    public final void rule__Query__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2242:1: ( ( '}' ) )
            // InternalSocialRequest.g:2243:1: ( '}' )
            {
            // InternalSocialRequest.g:2243:1: ( '}' )
            // InternalSocialRequest.g:2244:2: '}'
            {
             before(grammarAccess.getQueryAccess().getRightCurlyBracketKeyword_3_3()); 
            match(input,37,FOLLOW_2); 
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
    // InternalSocialRequest.g:2254:1: rule__Query__Group_3_1__0 : rule__Query__Group_3_1__0__Impl rule__Query__Group_3_1__1 ;
    public final void rule__Query__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2258:1: ( rule__Query__Group_3_1__0__Impl rule__Query__Group_3_1__1 )
            // InternalSocialRequest.g:2259:2: rule__Query__Group_3_1__0__Impl rule__Query__Group_3_1__1
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
    // InternalSocialRequest.g:2266:1: rule__Query__Group_3_1__0__Impl : ( 'params' ) ;
    public final void rule__Query__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2270:1: ( ( 'params' ) )
            // InternalSocialRequest.g:2271:1: ( 'params' )
            {
            // InternalSocialRequest.g:2271:1: ( 'params' )
            // InternalSocialRequest.g:2272:2: 'params'
            {
             before(grammarAccess.getQueryAccess().getParamsKeyword_3_1_0()); 
            match(input,51,FOLLOW_2); 
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
    // InternalSocialRequest.g:2281:1: rule__Query__Group_3_1__1 : rule__Query__Group_3_1__1__Impl rule__Query__Group_3_1__2 ;
    public final void rule__Query__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2285:1: ( rule__Query__Group_3_1__1__Impl rule__Query__Group_3_1__2 )
            // InternalSocialRequest.g:2286:2: rule__Query__Group_3_1__1__Impl rule__Query__Group_3_1__2
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
    // InternalSocialRequest.g:2293:1: rule__Query__Group_3_1__1__Impl : ( '{' ) ;
    public final void rule__Query__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2297:1: ( ( '{' ) )
            // InternalSocialRequest.g:2298:1: ( '{' )
            {
            // InternalSocialRequest.g:2298:1: ( '{' )
            // InternalSocialRequest.g:2299:2: '{'
            {
             before(grammarAccess.getQueryAccess().getLeftCurlyBracketKeyword_3_1_1()); 
            match(input,36,FOLLOW_2); 
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
    // InternalSocialRequest.g:2308:1: rule__Query__Group_3_1__2 : rule__Query__Group_3_1__2__Impl rule__Query__Group_3_1__3 ;
    public final void rule__Query__Group_3_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2312:1: ( rule__Query__Group_3_1__2__Impl rule__Query__Group_3_1__3 )
            // InternalSocialRequest.g:2313:2: rule__Query__Group_3_1__2__Impl rule__Query__Group_3_1__3
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
    // InternalSocialRequest.g:2320:1: rule__Query__Group_3_1__2__Impl : ( ( rule__Query__ParamsAssignment_3_1_2 )* ) ;
    public final void rule__Query__Group_3_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2324:1: ( ( ( rule__Query__ParamsAssignment_3_1_2 )* ) )
            // InternalSocialRequest.g:2325:1: ( ( rule__Query__ParamsAssignment_3_1_2 )* )
            {
            // InternalSocialRequest.g:2325:1: ( ( rule__Query__ParamsAssignment_3_1_2 )* )
            // InternalSocialRequest.g:2326:2: ( rule__Query__ParamsAssignment_3_1_2 )*
            {
             before(grammarAccess.getQueryAccess().getParamsAssignment_3_1_2()); 
            // InternalSocialRequest.g:2327:2: ( rule__Query__ParamsAssignment_3_1_2 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==RULE_ID) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalSocialRequest.g:2327:3: rule__Query__ParamsAssignment_3_1_2
            	    {
            	    pushFollow(FOLLOW_31);
            	    rule__Query__ParamsAssignment_3_1_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
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
    // InternalSocialRequest.g:2335:1: rule__Query__Group_3_1__3 : rule__Query__Group_3_1__3__Impl ;
    public final void rule__Query__Group_3_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2339:1: ( rule__Query__Group_3_1__3__Impl )
            // InternalSocialRequest.g:2340:2: rule__Query__Group_3_1__3__Impl
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
    // InternalSocialRequest.g:2346:1: rule__Query__Group_3_1__3__Impl : ( '}' ) ;
    public final void rule__Query__Group_3_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2350:1: ( ( '}' ) )
            // InternalSocialRequest.g:2351:1: ( '}' )
            {
            // InternalSocialRequest.g:2351:1: ( '}' )
            // InternalSocialRequest.g:2352:2: '}'
            {
             before(grammarAccess.getQueryAccess().getRightCurlyBracketKeyword_3_1_3()); 
            match(input,37,FOLLOW_2); 
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
    // InternalSocialRequest.g:2362:1: rule__Param__Group__0 : rule__Param__Group__0__Impl rule__Param__Group__1 ;
    public final void rule__Param__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2366:1: ( rule__Param__Group__0__Impl rule__Param__Group__1 )
            // InternalSocialRequest.g:2367:2: rule__Param__Group__0__Impl rule__Param__Group__1
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
    // InternalSocialRequest.g:2374:1: rule__Param__Group__0__Impl : ( ( rule__Param__NameAssignment_0 ) ) ;
    public final void rule__Param__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2378:1: ( ( ( rule__Param__NameAssignment_0 ) ) )
            // InternalSocialRequest.g:2379:1: ( ( rule__Param__NameAssignment_0 ) )
            {
            // InternalSocialRequest.g:2379:1: ( ( rule__Param__NameAssignment_0 ) )
            // InternalSocialRequest.g:2380:2: ( rule__Param__NameAssignment_0 )
            {
             before(grammarAccess.getParamAccess().getNameAssignment_0()); 
            // InternalSocialRequest.g:2381:2: ( rule__Param__NameAssignment_0 )
            // InternalSocialRequest.g:2381:3: rule__Param__NameAssignment_0
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
    // InternalSocialRequest.g:2389:1: rule__Param__Group__1 : rule__Param__Group__1__Impl rule__Param__Group__2 ;
    public final void rule__Param__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2393:1: ( rule__Param__Group__1__Impl rule__Param__Group__2 )
            // InternalSocialRequest.g:2394:2: rule__Param__Group__1__Impl rule__Param__Group__2
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
    // InternalSocialRequest.g:2401:1: rule__Param__Group__1__Impl : ( ':' ) ;
    public final void rule__Param__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2405:1: ( ( ':' ) )
            // InternalSocialRequest.g:2406:1: ( ':' )
            {
            // InternalSocialRequest.g:2406:1: ( ':' )
            // InternalSocialRequest.g:2407:2: ':'
            {
             before(grammarAccess.getParamAccess().getColonKeyword_1()); 
            match(input,39,FOLLOW_2); 
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
    // InternalSocialRequest.g:2416:1: rule__Param__Group__2 : rule__Param__Group__2__Impl ;
    public final void rule__Param__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2420:1: ( rule__Param__Group__2__Impl )
            // InternalSocialRequest.g:2421:2: rule__Param__Group__2__Impl
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
    // InternalSocialRequest.g:2427:1: rule__Param__Group__2__Impl : ( ( rule__Param__TypeAssignment_2 ) ) ;
    public final void rule__Param__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2431:1: ( ( ( rule__Param__TypeAssignment_2 ) ) )
            // InternalSocialRequest.g:2432:1: ( ( rule__Param__TypeAssignment_2 ) )
            {
            // InternalSocialRequest.g:2432:1: ( ( rule__Param__TypeAssignment_2 ) )
            // InternalSocialRequest.g:2433:2: ( rule__Param__TypeAssignment_2 )
            {
             before(grammarAccess.getParamAccess().getTypeAssignment_2()); 
            // InternalSocialRequest.g:2434:2: ( rule__Param__TypeAssignment_2 )
            // InternalSocialRequest.g:2434:3: rule__Param__TypeAssignment_2
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
    // InternalSocialRequest.g:2443:1: rule__SQLQuery__Group__0 : rule__SQLQuery__Group__0__Impl rule__SQLQuery__Group__1 ;
    public final void rule__SQLQuery__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2447:1: ( rule__SQLQuery__Group__0__Impl rule__SQLQuery__Group__1 )
            // InternalSocialRequest.g:2448:2: rule__SQLQuery__Group__0__Impl rule__SQLQuery__Group__1
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
    // InternalSocialRequest.g:2455:1: rule__SQLQuery__Group__0__Impl : ( ( rule__SQLQuery__SelectAssignment_0 ) ) ;
    public final void rule__SQLQuery__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2459:1: ( ( ( rule__SQLQuery__SelectAssignment_0 ) ) )
            // InternalSocialRequest.g:2460:1: ( ( rule__SQLQuery__SelectAssignment_0 ) )
            {
            // InternalSocialRequest.g:2460:1: ( ( rule__SQLQuery__SelectAssignment_0 ) )
            // InternalSocialRequest.g:2461:2: ( rule__SQLQuery__SelectAssignment_0 )
            {
             before(grammarAccess.getSQLQueryAccess().getSelectAssignment_0()); 
            // InternalSocialRequest.g:2462:2: ( rule__SQLQuery__SelectAssignment_0 )
            // InternalSocialRequest.g:2462:3: rule__SQLQuery__SelectAssignment_0
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
    // InternalSocialRequest.g:2470:1: rule__SQLQuery__Group__1 : rule__SQLQuery__Group__1__Impl rule__SQLQuery__Group__2 ;
    public final void rule__SQLQuery__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2474:1: ( rule__SQLQuery__Group__1__Impl rule__SQLQuery__Group__2 )
            // InternalSocialRequest.g:2475:2: rule__SQLQuery__Group__1__Impl rule__SQLQuery__Group__2
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
    // InternalSocialRequest.g:2482:1: rule__SQLQuery__Group__1__Impl : ( ( rule__SQLQuery__FromAssignment_1 ) ) ;
    public final void rule__SQLQuery__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2486:1: ( ( ( rule__SQLQuery__FromAssignment_1 ) ) )
            // InternalSocialRequest.g:2487:1: ( ( rule__SQLQuery__FromAssignment_1 ) )
            {
            // InternalSocialRequest.g:2487:1: ( ( rule__SQLQuery__FromAssignment_1 ) )
            // InternalSocialRequest.g:2488:2: ( rule__SQLQuery__FromAssignment_1 )
            {
             before(grammarAccess.getSQLQueryAccess().getFromAssignment_1()); 
            // InternalSocialRequest.g:2489:2: ( rule__SQLQuery__FromAssignment_1 )
            // InternalSocialRequest.g:2489:3: rule__SQLQuery__FromAssignment_1
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
    // InternalSocialRequest.g:2497:1: rule__SQLQuery__Group__2 : rule__SQLQuery__Group__2__Impl rule__SQLQuery__Group__3 ;
    public final void rule__SQLQuery__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2501:1: ( rule__SQLQuery__Group__2__Impl rule__SQLQuery__Group__3 )
            // InternalSocialRequest.g:2502:2: rule__SQLQuery__Group__2__Impl rule__SQLQuery__Group__3
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
    // InternalSocialRequest.g:2509:1: rule__SQLQuery__Group__2__Impl : ( ( rule__SQLQuery__JoinsAssignment_2 )* ) ;
    public final void rule__SQLQuery__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2513:1: ( ( ( rule__SQLQuery__JoinsAssignment_2 )* ) )
            // InternalSocialRequest.g:2514:1: ( ( rule__SQLQuery__JoinsAssignment_2 )* )
            {
            // InternalSocialRequest.g:2514:1: ( ( rule__SQLQuery__JoinsAssignment_2 )* )
            // InternalSocialRequest.g:2515:2: ( rule__SQLQuery__JoinsAssignment_2 )*
            {
             before(grammarAccess.getSQLQueryAccess().getJoinsAssignment_2()); 
            // InternalSocialRequest.g:2516:2: ( rule__SQLQuery__JoinsAssignment_2 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>=31 && LA22_0<=34)) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalSocialRequest.g:2516:3: rule__SQLQuery__JoinsAssignment_2
            	    {
            	    pushFollow(FOLLOW_34);
            	    rule__SQLQuery__JoinsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
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
    // InternalSocialRequest.g:2524:1: rule__SQLQuery__Group__3 : rule__SQLQuery__Group__3__Impl rule__SQLQuery__Group__4 ;
    public final void rule__SQLQuery__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2528:1: ( rule__SQLQuery__Group__3__Impl rule__SQLQuery__Group__4 )
            // InternalSocialRequest.g:2529:2: rule__SQLQuery__Group__3__Impl rule__SQLQuery__Group__4
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
    // InternalSocialRequest.g:2536:1: rule__SQLQuery__Group__3__Impl : ( ( rule__SQLQuery__WhereAssignment_3 )? ) ;
    public final void rule__SQLQuery__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2540:1: ( ( ( rule__SQLQuery__WhereAssignment_3 )? ) )
            // InternalSocialRequest.g:2541:1: ( ( rule__SQLQuery__WhereAssignment_3 )? )
            {
            // InternalSocialRequest.g:2541:1: ( ( rule__SQLQuery__WhereAssignment_3 )? )
            // InternalSocialRequest.g:2542:2: ( rule__SQLQuery__WhereAssignment_3 )?
            {
             before(grammarAccess.getSQLQueryAccess().getWhereAssignment_3()); 
            // InternalSocialRequest.g:2543:2: ( rule__SQLQuery__WhereAssignment_3 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==55) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalSocialRequest.g:2543:3: rule__SQLQuery__WhereAssignment_3
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
    // InternalSocialRequest.g:2551:1: rule__SQLQuery__Group__4 : rule__SQLQuery__Group__4__Impl ;
    public final void rule__SQLQuery__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2555:1: ( rule__SQLQuery__Group__4__Impl )
            // InternalSocialRequest.g:2556:2: rule__SQLQuery__Group__4__Impl
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
    // InternalSocialRequest.g:2562:1: rule__SQLQuery__Group__4__Impl : ( ( rule__SQLQuery__OrderAssignment_4 )? ) ;
    public final void rule__SQLQuery__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2566:1: ( ( ( rule__SQLQuery__OrderAssignment_4 )? ) )
            // InternalSocialRequest.g:2567:1: ( ( rule__SQLQuery__OrderAssignment_4 )? )
            {
            // InternalSocialRequest.g:2567:1: ( ( rule__SQLQuery__OrderAssignment_4 )? )
            // InternalSocialRequest.g:2568:2: ( rule__SQLQuery__OrderAssignment_4 )?
            {
             before(grammarAccess.getSQLQueryAccess().getOrderAssignment_4()); 
            // InternalSocialRequest.g:2569:2: ( rule__SQLQuery__OrderAssignment_4 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==56) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalSocialRequest.g:2569:3: rule__SQLQuery__OrderAssignment_4
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
    // InternalSocialRequest.g:2578:1: rule__Select__Group__0 : rule__Select__Group__0__Impl rule__Select__Group__1 ;
    public final void rule__Select__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2582:1: ( rule__Select__Group__0__Impl rule__Select__Group__1 )
            // InternalSocialRequest.g:2583:2: rule__Select__Group__0__Impl rule__Select__Group__1
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
    // InternalSocialRequest.g:2590:1: rule__Select__Group__0__Impl : ( 'SELECT' ) ;
    public final void rule__Select__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2594:1: ( ( 'SELECT' ) )
            // InternalSocialRequest.g:2595:1: ( 'SELECT' )
            {
            // InternalSocialRequest.g:2595:1: ( 'SELECT' )
            // InternalSocialRequest.g:2596:2: 'SELECT'
            {
             before(grammarAccess.getSelectAccess().getSELECTKeyword_0()); 
            match(input,52,FOLLOW_2); 
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
    // InternalSocialRequest.g:2605:1: rule__Select__Group__1 : rule__Select__Group__1__Impl rule__Select__Group__2 ;
    public final void rule__Select__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2609:1: ( rule__Select__Group__1__Impl rule__Select__Group__2 )
            // InternalSocialRequest.g:2610:2: rule__Select__Group__1__Impl rule__Select__Group__2
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
    // InternalSocialRequest.g:2617:1: rule__Select__Group__1__Impl : ( ( rule__Select__IsDistinctAssignment_1 )? ) ;
    public final void rule__Select__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2621:1: ( ( ( rule__Select__IsDistinctAssignment_1 )? ) )
            // InternalSocialRequest.g:2622:1: ( ( rule__Select__IsDistinctAssignment_1 )? )
            {
            // InternalSocialRequest.g:2622:1: ( ( rule__Select__IsDistinctAssignment_1 )? )
            // InternalSocialRequest.g:2623:2: ( rule__Select__IsDistinctAssignment_1 )?
            {
             before(grammarAccess.getSelectAccess().getIsDistinctAssignment_1()); 
            // InternalSocialRequest.g:2624:2: ( rule__Select__IsDistinctAssignment_1 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==61) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalSocialRequest.g:2624:3: rule__Select__IsDistinctAssignment_1
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
    // InternalSocialRequest.g:2632:1: rule__Select__Group__2 : rule__Select__Group__2__Impl rule__Select__Group__3 ;
    public final void rule__Select__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2636:1: ( rule__Select__Group__2__Impl rule__Select__Group__3 )
            // InternalSocialRequest.g:2637:2: rule__Select__Group__2__Impl rule__Select__Group__3
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
    // InternalSocialRequest.g:2644:1: rule__Select__Group__2__Impl : ( '{' ) ;
    public final void rule__Select__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2648:1: ( ( '{' ) )
            // InternalSocialRequest.g:2649:1: ( '{' )
            {
            // InternalSocialRequest.g:2649:1: ( '{' )
            // InternalSocialRequest.g:2650:2: '{'
            {
             before(grammarAccess.getSelectAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,36,FOLLOW_2); 
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
    // InternalSocialRequest.g:2659:1: rule__Select__Group__3 : rule__Select__Group__3__Impl rule__Select__Group__4 ;
    public final void rule__Select__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2663:1: ( rule__Select__Group__3__Impl rule__Select__Group__4 )
            // InternalSocialRequest.g:2664:2: rule__Select__Group__3__Impl rule__Select__Group__4
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
    // InternalSocialRequest.g:2671:1: rule__Select__Group__3__Impl : ( ( rule__Select__ClauseAssignment_3 ) ) ;
    public final void rule__Select__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2675:1: ( ( ( rule__Select__ClauseAssignment_3 ) ) )
            // InternalSocialRequest.g:2676:1: ( ( rule__Select__ClauseAssignment_3 ) )
            {
            // InternalSocialRequest.g:2676:1: ( ( rule__Select__ClauseAssignment_3 ) )
            // InternalSocialRequest.g:2677:2: ( rule__Select__ClauseAssignment_3 )
            {
             before(grammarAccess.getSelectAccess().getClauseAssignment_3()); 
            // InternalSocialRequest.g:2678:2: ( rule__Select__ClauseAssignment_3 )
            // InternalSocialRequest.g:2678:3: rule__Select__ClauseAssignment_3
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
    // InternalSocialRequest.g:2686:1: rule__Select__Group__4 : rule__Select__Group__4__Impl ;
    public final void rule__Select__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2690:1: ( rule__Select__Group__4__Impl )
            // InternalSocialRequest.g:2691:2: rule__Select__Group__4__Impl
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
    // InternalSocialRequest.g:2697:1: rule__Select__Group__4__Impl : ( '}' ) ;
    public final void rule__Select__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2701:1: ( ( '}' ) )
            // InternalSocialRequest.g:2702:1: ( '}' )
            {
            // InternalSocialRequest.g:2702:1: ( '}' )
            // InternalSocialRequest.g:2703:2: '}'
            {
             before(grammarAccess.getSelectAccess().getRightCurlyBracketKeyword_4()); 
            match(input,37,FOLLOW_2); 
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
    // InternalSocialRequest.g:2713:1: rule__From__Group__0 : rule__From__Group__0__Impl rule__From__Group__1 ;
    public final void rule__From__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2717:1: ( rule__From__Group__0__Impl rule__From__Group__1 )
            // InternalSocialRequest.g:2718:2: rule__From__Group__0__Impl rule__From__Group__1
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
    // InternalSocialRequest.g:2725:1: rule__From__Group__0__Impl : ( 'FROM' ) ;
    public final void rule__From__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2729:1: ( ( 'FROM' ) )
            // InternalSocialRequest.g:2730:1: ( 'FROM' )
            {
            // InternalSocialRequest.g:2730:1: ( 'FROM' )
            // InternalSocialRequest.g:2731:2: 'FROM'
            {
             before(grammarAccess.getFromAccess().getFROMKeyword_0()); 
            match(input,53,FOLLOW_2); 
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
    // InternalSocialRequest.g:2740:1: rule__From__Group__1 : rule__From__Group__1__Impl rule__From__Group__2 ;
    public final void rule__From__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2744:1: ( rule__From__Group__1__Impl rule__From__Group__2 )
            // InternalSocialRequest.g:2745:2: rule__From__Group__1__Impl rule__From__Group__2
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
    // InternalSocialRequest.g:2752:1: rule__From__Group__1__Impl : ( '{' ) ;
    public final void rule__From__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2756:1: ( ( '{' ) )
            // InternalSocialRequest.g:2757:1: ( '{' )
            {
            // InternalSocialRequest.g:2757:1: ( '{' )
            // InternalSocialRequest.g:2758:2: '{'
            {
             before(grammarAccess.getFromAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,36,FOLLOW_2); 
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
    // InternalSocialRequest.g:2767:1: rule__From__Group__2 : rule__From__Group__2__Impl rule__From__Group__3 ;
    public final void rule__From__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2771:1: ( rule__From__Group__2__Impl rule__From__Group__3 )
            // InternalSocialRequest.g:2772:2: rule__From__Group__2__Impl rule__From__Group__3
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
    // InternalSocialRequest.g:2779:1: rule__From__Group__2__Impl : ( ( rule__From__EntityAssignment_2 ) ) ;
    public final void rule__From__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2783:1: ( ( ( rule__From__EntityAssignment_2 ) ) )
            // InternalSocialRequest.g:2784:1: ( ( rule__From__EntityAssignment_2 ) )
            {
            // InternalSocialRequest.g:2784:1: ( ( rule__From__EntityAssignment_2 ) )
            // InternalSocialRequest.g:2785:2: ( rule__From__EntityAssignment_2 )
            {
             before(grammarAccess.getFromAccess().getEntityAssignment_2()); 
            // InternalSocialRequest.g:2786:2: ( rule__From__EntityAssignment_2 )
            // InternalSocialRequest.g:2786:3: rule__From__EntityAssignment_2
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
    // InternalSocialRequest.g:2794:1: rule__From__Group__3 : rule__From__Group__3__Impl rule__From__Group__4 ;
    public final void rule__From__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2798:1: ( rule__From__Group__3__Impl rule__From__Group__4 )
            // InternalSocialRequest.g:2799:2: rule__From__Group__3__Impl rule__From__Group__4
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
    // InternalSocialRequest.g:2806:1: rule__From__Group__3__Impl : ( ( rule__From__AliasAssignment_3 ) ) ;
    public final void rule__From__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2810:1: ( ( ( rule__From__AliasAssignment_3 ) ) )
            // InternalSocialRequest.g:2811:1: ( ( rule__From__AliasAssignment_3 ) )
            {
            // InternalSocialRequest.g:2811:1: ( ( rule__From__AliasAssignment_3 ) )
            // InternalSocialRequest.g:2812:2: ( rule__From__AliasAssignment_3 )
            {
             before(grammarAccess.getFromAccess().getAliasAssignment_3()); 
            // InternalSocialRequest.g:2813:2: ( rule__From__AliasAssignment_3 )
            // InternalSocialRequest.g:2813:3: rule__From__AliasAssignment_3
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
    // InternalSocialRequest.g:2821:1: rule__From__Group__4 : rule__From__Group__4__Impl ;
    public final void rule__From__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2825:1: ( rule__From__Group__4__Impl )
            // InternalSocialRequest.g:2826:2: rule__From__Group__4__Impl
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
    // InternalSocialRequest.g:2832:1: rule__From__Group__4__Impl : ( '}' ) ;
    public final void rule__From__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2836:1: ( ( '}' ) )
            // InternalSocialRequest.g:2837:1: ( '}' )
            {
            // InternalSocialRequest.g:2837:1: ( '}' )
            // InternalSocialRequest.g:2838:2: '}'
            {
             before(grammarAccess.getFromAccess().getRightCurlyBracketKeyword_4()); 
            match(input,37,FOLLOW_2); 
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
    // InternalSocialRequest.g:2848:1: rule__Join__Group__0 : rule__Join__Group__0__Impl rule__Join__Group__1 ;
    public final void rule__Join__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2852:1: ( rule__Join__Group__0__Impl rule__Join__Group__1 )
            // InternalSocialRequest.g:2853:2: rule__Join__Group__0__Impl rule__Join__Group__1
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
    // InternalSocialRequest.g:2860:1: rule__Join__Group__0__Impl : ( ( rule__Join__JoinTypeAssignment_0 ) ) ;
    public final void rule__Join__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2864:1: ( ( ( rule__Join__JoinTypeAssignment_0 ) ) )
            // InternalSocialRequest.g:2865:1: ( ( rule__Join__JoinTypeAssignment_0 ) )
            {
            // InternalSocialRequest.g:2865:1: ( ( rule__Join__JoinTypeAssignment_0 ) )
            // InternalSocialRequest.g:2866:2: ( rule__Join__JoinTypeAssignment_0 )
            {
             before(grammarAccess.getJoinAccess().getJoinTypeAssignment_0()); 
            // InternalSocialRequest.g:2867:2: ( rule__Join__JoinTypeAssignment_0 )
            // InternalSocialRequest.g:2867:3: rule__Join__JoinTypeAssignment_0
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
    // InternalSocialRequest.g:2875:1: rule__Join__Group__1 : rule__Join__Group__1__Impl rule__Join__Group__2 ;
    public final void rule__Join__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2879:1: ( rule__Join__Group__1__Impl rule__Join__Group__2 )
            // InternalSocialRequest.g:2880:2: rule__Join__Group__1__Impl rule__Join__Group__2
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
    // InternalSocialRequest.g:2887:1: rule__Join__Group__1__Impl : ( '{' ) ;
    public final void rule__Join__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2891:1: ( ( '{' ) )
            // InternalSocialRequest.g:2892:1: ( '{' )
            {
            // InternalSocialRequest.g:2892:1: ( '{' )
            // InternalSocialRequest.g:2893:2: '{'
            {
             before(grammarAccess.getJoinAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,36,FOLLOW_2); 
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
    // InternalSocialRequest.g:2902:1: rule__Join__Group__2 : rule__Join__Group__2__Impl rule__Join__Group__3 ;
    public final void rule__Join__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2906:1: ( rule__Join__Group__2__Impl rule__Join__Group__3 )
            // InternalSocialRequest.g:2907:2: rule__Join__Group__2__Impl rule__Join__Group__3
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
    // InternalSocialRequest.g:2914:1: rule__Join__Group__2__Impl : ( ( rule__Join__EntityAssignment_2 ) ) ;
    public final void rule__Join__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2918:1: ( ( ( rule__Join__EntityAssignment_2 ) ) )
            // InternalSocialRequest.g:2919:1: ( ( rule__Join__EntityAssignment_2 ) )
            {
            // InternalSocialRequest.g:2919:1: ( ( rule__Join__EntityAssignment_2 ) )
            // InternalSocialRequest.g:2920:2: ( rule__Join__EntityAssignment_2 )
            {
             before(grammarAccess.getJoinAccess().getEntityAssignment_2()); 
            // InternalSocialRequest.g:2921:2: ( rule__Join__EntityAssignment_2 )
            // InternalSocialRequest.g:2921:3: rule__Join__EntityAssignment_2
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
    // InternalSocialRequest.g:2929:1: rule__Join__Group__3 : rule__Join__Group__3__Impl rule__Join__Group__4 ;
    public final void rule__Join__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2933:1: ( rule__Join__Group__3__Impl rule__Join__Group__4 )
            // InternalSocialRequest.g:2934:2: rule__Join__Group__3__Impl rule__Join__Group__4
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
    // InternalSocialRequest.g:2941:1: rule__Join__Group__3__Impl : ( ( rule__Join__AliasAssignment_3 ) ) ;
    public final void rule__Join__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2945:1: ( ( ( rule__Join__AliasAssignment_3 ) ) )
            // InternalSocialRequest.g:2946:1: ( ( rule__Join__AliasAssignment_3 ) )
            {
            // InternalSocialRequest.g:2946:1: ( ( rule__Join__AliasAssignment_3 ) )
            // InternalSocialRequest.g:2947:2: ( rule__Join__AliasAssignment_3 )
            {
             before(grammarAccess.getJoinAccess().getAliasAssignment_3()); 
            // InternalSocialRequest.g:2948:2: ( rule__Join__AliasAssignment_3 )
            // InternalSocialRequest.g:2948:3: rule__Join__AliasAssignment_3
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
    // InternalSocialRequest.g:2956:1: rule__Join__Group__4 : rule__Join__Group__4__Impl rule__Join__Group__5 ;
    public final void rule__Join__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2960:1: ( rule__Join__Group__4__Impl rule__Join__Group__5 )
            // InternalSocialRequest.g:2961:2: rule__Join__Group__4__Impl rule__Join__Group__5
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
    // InternalSocialRequest.g:2968:1: rule__Join__Group__4__Impl : ( '}' ) ;
    public final void rule__Join__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2972:1: ( ( '}' ) )
            // InternalSocialRequest.g:2973:1: ( '}' )
            {
            // InternalSocialRequest.g:2973:1: ( '}' )
            // InternalSocialRequest.g:2974:2: '}'
            {
             before(grammarAccess.getJoinAccess().getRightCurlyBracketKeyword_4()); 
            match(input,37,FOLLOW_2); 
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
    // InternalSocialRequest.g:2983:1: rule__Join__Group__5 : rule__Join__Group__5__Impl ;
    public final void rule__Join__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2987:1: ( rule__Join__Group__5__Impl )
            // InternalSocialRequest.g:2988:2: rule__Join__Group__5__Impl
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
    // InternalSocialRequest.g:2994:1: rule__Join__Group__5__Impl : ( ( rule__Join__Group_5__0 )? ) ;
    public final void rule__Join__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2998:1: ( ( ( rule__Join__Group_5__0 )? ) )
            // InternalSocialRequest.g:2999:1: ( ( rule__Join__Group_5__0 )? )
            {
            // InternalSocialRequest.g:2999:1: ( ( rule__Join__Group_5__0 )? )
            // InternalSocialRequest.g:3000:2: ( rule__Join__Group_5__0 )?
            {
             before(grammarAccess.getJoinAccess().getGroup_5()); 
            // InternalSocialRequest.g:3001:2: ( rule__Join__Group_5__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==54) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalSocialRequest.g:3001:3: rule__Join__Group_5__0
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
    // InternalSocialRequest.g:3010:1: rule__Join__Group_5__0 : rule__Join__Group_5__0__Impl rule__Join__Group_5__1 ;
    public final void rule__Join__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:3014:1: ( rule__Join__Group_5__0__Impl rule__Join__Group_5__1 )
            // InternalSocialRequest.g:3015:2: rule__Join__Group_5__0__Impl rule__Join__Group_5__1
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
    // InternalSocialRequest.g:3022:1: rule__Join__Group_5__0__Impl : ( 'ON' ) ;
    public final void rule__Join__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:3026:1: ( ( 'ON' ) )
            // InternalSocialRequest.g:3027:1: ( 'ON' )
            {
            // InternalSocialRequest.g:3027:1: ( 'ON' )
            // InternalSocialRequest.g:3028:2: 'ON'
            {
             before(grammarAccess.getJoinAccess().getONKeyword_5_0()); 
            match(input,54,FOLLOW_2); 
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
    // InternalSocialRequest.g:3037:1: rule__Join__Group_5__1 : rule__Join__Group_5__1__Impl rule__Join__Group_5__2 ;
    public final void rule__Join__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:3041:1: ( rule__Join__Group_5__1__Impl rule__Join__Group_5__2 )
            // InternalSocialRequest.g:3042:2: rule__Join__Group_5__1__Impl rule__Join__Group_5__2
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
    // InternalSocialRequest.g:3049:1: rule__Join__Group_5__1__Impl : ( '{' ) ;
    public final void rule__Join__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:3053:1: ( ( '{' ) )
            // InternalSocialRequest.g:3054:1: ( '{' )
            {
            // InternalSocialRequest.g:3054:1: ( '{' )
            // InternalSocialRequest.g:3055:2: '{'
            {
             before(grammarAccess.getJoinAccess().getLeftCurlyBracketKeyword_5_1()); 
            match(input,36,FOLLOW_2); 
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
    // InternalSocialRequest.g:3064:1: rule__Join__Group_5__2 : rule__Join__Group_5__2__Impl rule__Join__Group_5__3 ;
    public final void rule__Join__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:3068:1: ( rule__Join__Group_5__2__Impl rule__Join__Group_5__3 )
            // InternalSocialRequest.g:3069:2: rule__Join__Group_5__2__Impl rule__Join__Group_5__3
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
    // InternalSocialRequest.g:3076:1: rule__Join__Group_5__2__Impl : ( ( rule__Join__JoinConditionAssignment_5_2 ) ) ;
    public final void rule__Join__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:3080:1: ( ( ( rule__Join__JoinConditionAssignment_5_2 ) ) )
            // InternalSocialRequest.g:3081:1: ( ( rule__Join__JoinConditionAssignment_5_2 ) )
            {
            // InternalSocialRequest.g:3081:1: ( ( rule__Join__JoinConditionAssignment_5_2 ) )
            // InternalSocialRequest.g:3082:2: ( rule__Join__JoinConditionAssignment_5_2 )
            {
             before(grammarAccess.getJoinAccess().getJoinConditionAssignment_5_2()); 
            // InternalSocialRequest.g:3083:2: ( rule__Join__JoinConditionAssignment_5_2 )
            // InternalSocialRequest.g:3083:3: rule__Join__JoinConditionAssignment_5_2
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
    // InternalSocialRequest.g:3091:1: rule__Join__Group_5__3 : rule__Join__Group_5__3__Impl ;
    public final void rule__Join__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:3095:1: ( rule__Join__Group_5__3__Impl )
            // InternalSocialRequest.g:3096:2: rule__Join__Group_5__3__Impl
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
    // InternalSocialRequest.g:3102:1: rule__Join__Group_5__3__Impl : ( '}' ) ;
    public final void rule__Join__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:3106:1: ( ( '}' ) )
            // InternalSocialRequest.g:3107:1: ( '}' )
            {
            // InternalSocialRequest.g:3107:1: ( '}' )
            // InternalSocialRequest.g:3108:2: '}'
            {
             before(grammarAccess.getJoinAccess().getRightCurlyBracketKeyword_5_3()); 
            match(input,37,FOLLOW_2); 
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
    // InternalSocialRequest.g:3118:1: rule__Where__Group__0 : rule__Where__Group__0__Impl rule__Where__Group__1 ;
    public final void rule__Where__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:3122:1: ( rule__Where__Group__0__Impl rule__Where__Group__1 )
            // InternalSocialRequest.g:3123:2: rule__Where__Group__0__Impl rule__Where__Group__1
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
    // InternalSocialRequest.g:3130:1: rule__Where__Group__0__Impl : ( 'WHERE' ) ;
    public final void rule__Where__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:3134:1: ( ( 'WHERE' ) )
            // InternalSocialRequest.g:3135:1: ( 'WHERE' )
            {
            // InternalSocialRequest.g:3135:1: ( 'WHERE' )
            // InternalSocialRequest.g:3136:2: 'WHERE'
            {
             before(grammarAccess.getWhereAccess().getWHEREKeyword_0()); 
            match(input,55,FOLLOW_2); 
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
    // InternalSocialRequest.g:3145:1: rule__Where__Group__1 : rule__Where__Group__1__Impl rule__Where__Group__2 ;
    public final void rule__Where__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:3149:1: ( rule__Where__Group__1__Impl rule__Where__Group__2 )
            // InternalSocialRequest.g:3150:2: rule__Where__Group__1__Impl rule__Where__Group__2
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
    // InternalSocialRequest.g:3157:1: rule__Where__Group__1__Impl : ( '{' ) ;
    public final void rule__Where__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:3161:1: ( ( '{' ) )
            // InternalSocialRequest.g:3162:1: ( '{' )
            {
            // InternalSocialRequest.g:3162:1: ( '{' )
            // InternalSocialRequest.g:3163:2: '{'
            {
             before(grammarAccess.getWhereAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,36,FOLLOW_2); 
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
    // InternalSocialRequest.g:3172:1: rule__Where__Group__2 : rule__Where__Group__2__Impl rule__Where__Group__3 ;
    public final void rule__Where__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:3176:1: ( rule__Where__Group__2__Impl rule__Where__Group__3 )
            // InternalSocialRequest.g:3177:2: rule__Where__Group__2__Impl rule__Where__Group__3
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
    // InternalSocialRequest.g:3184:1: rule__Where__Group__2__Impl : ( ( rule__Where__ConditionAssignment_2 ) ) ;
    public final void rule__Where__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:3188:1: ( ( ( rule__Where__ConditionAssignment_2 ) ) )
            // InternalSocialRequest.g:3189:1: ( ( rule__Where__ConditionAssignment_2 ) )
            {
            // InternalSocialRequest.g:3189:1: ( ( rule__Where__ConditionAssignment_2 ) )
            // InternalSocialRequest.g:3190:2: ( rule__Where__ConditionAssignment_2 )
            {
             before(grammarAccess.getWhereAccess().getConditionAssignment_2()); 
            // InternalSocialRequest.g:3191:2: ( rule__Where__ConditionAssignment_2 )
            // InternalSocialRequest.g:3191:3: rule__Where__ConditionAssignment_2
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
    // InternalSocialRequest.g:3199:1: rule__Where__Group__3 : rule__Where__Group__3__Impl ;
    public final void rule__Where__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:3203:1: ( rule__Where__Group__3__Impl )
            // InternalSocialRequest.g:3204:2: rule__Where__Group__3__Impl
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
    // InternalSocialRequest.g:3210:1: rule__Where__Group__3__Impl : ( '}' ) ;
    public final void rule__Where__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:3214:1: ( ( '}' ) )
            // InternalSocialRequest.g:3215:1: ( '}' )
            {
            // InternalSocialRequest.g:3215:1: ( '}' )
            // InternalSocialRequest.g:3216:2: '}'
            {
             before(grammarAccess.getWhereAccess().getRightCurlyBracketKeyword_3()); 
            match(input,37,FOLLOW_2); 
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
    // InternalSocialRequest.g:3226:1: rule__Order__Group__0 : rule__Order__Group__0__Impl rule__Order__Group__1 ;
    public final void rule__Order__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:3230:1: ( rule__Order__Group__0__Impl rule__Order__Group__1 )
            // InternalSocialRequest.g:3231:2: rule__Order__Group__0__Impl rule__Order__Group__1
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
    // InternalSocialRequest.g:3238:1: rule__Order__Group__0__Impl : ( 'ORDER BY' ) ;
    public final void rule__Order__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:3242:1: ( ( 'ORDER BY' ) )
            // InternalSocialRequest.g:3243:1: ( 'ORDER BY' )
            {
            // InternalSocialRequest.g:3243:1: ( 'ORDER BY' )
            // InternalSocialRequest.g:3244:2: 'ORDER BY'
            {
             before(grammarAccess.getOrderAccess().getORDERBYKeyword_0()); 
            match(input,56,FOLLOW_2); 
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
    // InternalSocialRequest.g:3253:1: rule__Order__Group__1 : rule__Order__Group__1__Impl rule__Order__Group__2 ;
    public final void rule__Order__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:3257:1: ( rule__Order__Group__1__Impl rule__Order__Group__2 )
            // InternalSocialRequest.g:3258:2: rule__Order__Group__1__Impl rule__Order__Group__2
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
    // InternalSocialRequest.g:3265:1: rule__Order__Group__1__Impl : ( '{' ) ;
    public final void rule__Order__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:3269:1: ( ( '{' ) )
            // InternalSocialRequest.g:3270:1: ( '{' )
            {
            // InternalSocialRequest.g:3270:1: ( '{' )
            // InternalSocialRequest.g:3271:2: '{'
            {
             before(grammarAccess.getOrderAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,36,FOLLOW_2); 
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
    // InternalSocialRequest.g:3280:1: rule__Order__Group__2 : rule__Order__Group__2__Impl rule__Order__Group__3 ;
    public final void rule__Order__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:3284:1: ( rule__Order__Group__2__Impl rule__Order__Group__3 )
            // InternalSocialRequest.g:3285:2: rule__Order__Group__2__Impl rule__Order__Group__3
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
    // InternalSocialRequest.g:3292:1: rule__Order__Group__2__Impl : ( ( rule__Order__OrderAssignment_2 ) ) ;
    public final void rule__Order__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:3296:1: ( ( ( rule__Order__OrderAssignment_2 ) ) )
            // InternalSocialRequest.g:3297:1: ( ( rule__Order__OrderAssignment_2 ) )
            {
            // InternalSocialRequest.g:3297:1: ( ( rule__Order__OrderAssignment_2 ) )
            // InternalSocialRequest.g:3298:2: ( rule__Order__OrderAssignment_2 )
            {
             before(grammarAccess.getOrderAccess().getOrderAssignment_2()); 
            // InternalSocialRequest.g:3299:2: ( rule__Order__OrderAssignment_2 )
            // InternalSocialRequest.g:3299:3: rule__Order__OrderAssignment_2
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
    // InternalSocialRequest.g:3307:1: rule__Order__Group__3 : rule__Order__Group__3__Impl ;
    public final void rule__Order__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:3311:1: ( rule__Order__Group__3__Impl )
            // InternalSocialRequest.g:3312:2: rule__Order__Group__3__Impl
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
    // InternalSocialRequest.g:3318:1: rule__Order__Group__3__Impl : ( '}' ) ;
    public final void rule__Order__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:3322:1: ( ( '}' ) )
            // InternalSocialRequest.g:3323:1: ( '}' )
            {
            // InternalSocialRequest.g:3323:1: ( '}' )
            // InternalSocialRequest.g:3324:2: '}'
            {
             before(grammarAccess.getOrderAccess().getRightCurlyBracketKeyword_3()); 
            match(input,37,FOLLOW_2); 
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
    // InternalSocialRequest.g:3334:1: rule__Attribute__UnorderedGroup_5_1 : ( rule__Attribute__UnorderedGroup_5_1__0 )? ;
    public final void rule__Attribute__UnorderedGroup_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getAttributeAccess().getUnorderedGroup_5_1());
        	
        try {
            // InternalSocialRequest.g:3339:1: ( ( rule__Attribute__UnorderedGroup_5_1__0 )? )
            // InternalSocialRequest.g:3340:2: ( rule__Attribute__UnorderedGroup_5_1__0 )?
            {
            // InternalSocialRequest.g:3340:2: ( rule__Attribute__UnorderedGroup_5_1__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( LA27_0 == 40 && getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_1(), 0) ) {
                alt27=1;
            }
            else if ( LA27_0 == 41 && getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_1(), 1) ) {
                alt27=1;
            }
            else if ( LA27_0 == 42 && getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_1(), 2) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalSocialRequest.g:3340:2: rule__Attribute__UnorderedGroup_5_1__0
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
    // InternalSocialRequest.g:3348:1: rule__Attribute__UnorderedGroup_5_1__Impl : ( ({...}? => ( ( ( rule__Attribute__Group_5_1_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Attribute__Group_5_1_1__0 ) ) ) ) | ({...}? => ( ( ( rule__Attribute__Group_5_1_2__0 ) ) ) ) ) ;
    public final void rule__Attribute__UnorderedGroup_5_1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
        	
        try {
            // InternalSocialRequest.g:3353:1: ( ( ({...}? => ( ( ( rule__Attribute__Group_5_1_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Attribute__Group_5_1_1__0 ) ) ) ) | ({...}? => ( ( ( rule__Attribute__Group_5_1_2__0 ) ) ) ) ) )
            // InternalSocialRequest.g:3354:3: ( ({...}? => ( ( ( rule__Attribute__Group_5_1_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Attribute__Group_5_1_1__0 ) ) ) ) | ({...}? => ( ( ( rule__Attribute__Group_5_1_2__0 ) ) ) ) )
            {
            // InternalSocialRequest.g:3354:3: ( ({...}? => ( ( ( rule__Attribute__Group_5_1_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Attribute__Group_5_1_1__0 ) ) ) ) | ({...}? => ( ( ( rule__Attribute__Group_5_1_2__0 ) ) ) ) )
            int alt28=3;
            int LA28_0 = input.LA(1);

            if ( LA28_0 == 40 && getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_1(), 0) ) {
                alt28=1;
            }
            else if ( LA28_0 == 41 && getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_1(), 1) ) {
                alt28=2;
            }
            else if ( LA28_0 == 42 && getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_1(), 2) ) {
                alt28=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // InternalSocialRequest.g:3355:3: ({...}? => ( ( ( rule__Attribute__Group_5_1_0__0 ) ) ) )
                    {
                    // InternalSocialRequest.g:3355:3: ({...}? => ( ( ( rule__Attribute__Group_5_1_0__0 ) ) ) )
                    // InternalSocialRequest.g:3356:4: {...}? => ( ( ( rule__Attribute__Group_5_1_0__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_1(), 0) ) {
                        throw new FailedPredicateException(input, "rule__Attribute__UnorderedGroup_5_1__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_1(), 0)");
                    }
                    // InternalSocialRequest.g:3356:107: ( ( ( rule__Attribute__Group_5_1_0__0 ) ) )
                    // InternalSocialRequest.g:3357:5: ( ( rule__Attribute__Group_5_1_0__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getAttributeAccess().getUnorderedGroup_5_1(), 0);
                    				

                    					selected = true;
                    				
                    // InternalSocialRequest.g:3363:5: ( ( rule__Attribute__Group_5_1_0__0 ) )
                    // InternalSocialRequest.g:3364:6: ( rule__Attribute__Group_5_1_0__0 )
                    {
                     before(grammarAccess.getAttributeAccess().getGroup_5_1_0()); 
                    // InternalSocialRequest.g:3365:6: ( rule__Attribute__Group_5_1_0__0 )
                    // InternalSocialRequest.g:3365:7: rule__Attribute__Group_5_1_0__0
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
                    // InternalSocialRequest.g:3370:3: ({...}? => ( ( ( rule__Attribute__Group_5_1_1__0 ) ) ) )
                    {
                    // InternalSocialRequest.g:3370:3: ({...}? => ( ( ( rule__Attribute__Group_5_1_1__0 ) ) ) )
                    // InternalSocialRequest.g:3371:4: {...}? => ( ( ( rule__Attribute__Group_5_1_1__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_1(), 1) ) {
                        throw new FailedPredicateException(input, "rule__Attribute__UnorderedGroup_5_1__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_1(), 1)");
                    }
                    // InternalSocialRequest.g:3371:107: ( ( ( rule__Attribute__Group_5_1_1__0 ) ) )
                    // InternalSocialRequest.g:3372:5: ( ( rule__Attribute__Group_5_1_1__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getAttributeAccess().getUnorderedGroup_5_1(), 1);
                    				

                    					selected = true;
                    				
                    // InternalSocialRequest.g:3378:5: ( ( rule__Attribute__Group_5_1_1__0 ) )
                    // InternalSocialRequest.g:3379:6: ( rule__Attribute__Group_5_1_1__0 )
                    {
                     before(grammarAccess.getAttributeAccess().getGroup_5_1_1()); 
                    // InternalSocialRequest.g:3380:6: ( rule__Attribute__Group_5_1_1__0 )
                    // InternalSocialRequest.g:3380:7: rule__Attribute__Group_5_1_1__0
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
                    // InternalSocialRequest.g:3385:3: ({...}? => ( ( ( rule__Attribute__Group_5_1_2__0 ) ) ) )
                    {
                    // InternalSocialRequest.g:3385:3: ({...}? => ( ( ( rule__Attribute__Group_5_1_2__0 ) ) ) )
                    // InternalSocialRequest.g:3386:4: {...}? => ( ( ( rule__Attribute__Group_5_1_2__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_1(), 2) ) {
                        throw new FailedPredicateException(input, "rule__Attribute__UnorderedGroup_5_1__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_1(), 2)");
                    }
                    // InternalSocialRequest.g:3386:107: ( ( ( rule__Attribute__Group_5_1_2__0 ) ) )
                    // InternalSocialRequest.g:3387:5: ( ( rule__Attribute__Group_5_1_2__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getAttributeAccess().getUnorderedGroup_5_1(), 2);
                    				

                    					selected = true;
                    				
                    // InternalSocialRequest.g:3393:5: ( ( rule__Attribute__Group_5_1_2__0 ) )
                    // InternalSocialRequest.g:3394:6: ( rule__Attribute__Group_5_1_2__0 )
                    {
                     before(grammarAccess.getAttributeAccess().getGroup_5_1_2()); 
                    // InternalSocialRequest.g:3395:6: ( rule__Attribute__Group_5_1_2__0 )
                    // InternalSocialRequest.g:3395:7: rule__Attribute__Group_5_1_2__0
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
    // InternalSocialRequest.g:3408:1: rule__Attribute__UnorderedGroup_5_1__0 : rule__Attribute__UnorderedGroup_5_1__Impl ( rule__Attribute__UnorderedGroup_5_1__1 )? ;
    public final void rule__Attribute__UnorderedGroup_5_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:3412:1: ( rule__Attribute__UnorderedGroup_5_1__Impl ( rule__Attribute__UnorderedGroup_5_1__1 )? )
            // InternalSocialRequest.g:3413:2: rule__Attribute__UnorderedGroup_5_1__Impl ( rule__Attribute__UnorderedGroup_5_1__1 )?
            {
            pushFollow(FOLLOW_37);
            rule__Attribute__UnorderedGroup_5_1__Impl();

            state._fsp--;

            // InternalSocialRequest.g:3414:2: ( rule__Attribute__UnorderedGroup_5_1__1 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( LA29_0 == 40 && getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_1(), 0) ) {
                alt29=1;
            }
            else if ( LA29_0 == 41 && getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_1(), 1) ) {
                alt29=1;
            }
            else if ( LA29_0 == 42 && getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_1(), 2) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalSocialRequest.g:3414:2: rule__Attribute__UnorderedGroup_5_1__1
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
    // InternalSocialRequest.g:3420:1: rule__Attribute__UnorderedGroup_5_1__1 : rule__Attribute__UnorderedGroup_5_1__Impl ( rule__Attribute__UnorderedGroup_5_1__2 )? ;
    public final void rule__Attribute__UnorderedGroup_5_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:3424:1: ( rule__Attribute__UnorderedGroup_5_1__Impl ( rule__Attribute__UnorderedGroup_5_1__2 )? )
            // InternalSocialRequest.g:3425:2: rule__Attribute__UnorderedGroup_5_1__Impl ( rule__Attribute__UnorderedGroup_5_1__2 )?
            {
            pushFollow(FOLLOW_37);
            rule__Attribute__UnorderedGroup_5_1__Impl();

            state._fsp--;

            // InternalSocialRequest.g:3426:2: ( rule__Attribute__UnorderedGroup_5_1__2 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( LA30_0 == 40 && getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_1(), 0) ) {
                alt30=1;
            }
            else if ( LA30_0 == 41 && getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_1(), 1) ) {
                alt30=1;
            }
            else if ( LA30_0 == 42 && getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_1(), 2) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalSocialRequest.g:3426:2: rule__Attribute__UnorderedGroup_5_1__2
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
    // InternalSocialRequest.g:3432:1: rule__Attribute__UnorderedGroup_5_1__2 : rule__Attribute__UnorderedGroup_5_1__Impl ;
    public final void rule__Attribute__UnorderedGroup_5_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:3436:1: ( rule__Attribute__UnorderedGroup_5_1__Impl )
            // InternalSocialRequest.g:3437:2: rule__Attribute__UnorderedGroup_5_1__Impl
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
    // InternalSocialRequest.g:3444:1: rule__Model__EntitiesAssignment_0 : ( ruleEntity ) ;
    public final void rule__Model__EntitiesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:3448:1: ( ( ruleEntity ) )
            // InternalSocialRequest.g:3449:2: ( ruleEntity )
            {
            // InternalSocialRequest.g:3449:2: ( ruleEntity )
            // InternalSocialRequest.g:3450:3: ruleEntity
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
    // InternalSocialRequest.g:3459:1: rule__Model__RepositoriesAssignment_1 : ( ruleRepository ) ;
    public final void rule__Model__RepositoriesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:3463:1: ( ( ruleRepository ) )
            // InternalSocialRequest.g:3464:2: ( ruleRepository )
            {
            // InternalSocialRequest.g:3464:2: ( ruleRepository )
            // InternalSocialRequest.g:3465:3: ruleRepository
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
    // InternalSocialRequest.g:3474:1: rule__Entity__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Entity__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:3478:1: ( ( RULE_ID ) )
            // InternalSocialRequest.g:3479:2: ( RULE_ID )
            {
            // InternalSocialRequest.g:3479:2: ( RULE_ID )
            // InternalSocialRequest.g:3480:3: RULE_ID
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
    // InternalSocialRequest.g:3489:1: rule__Entity__HasUserDetailsAssignment_2_0 : ( ( 'implements' ) ) ;
    public final void rule__Entity__HasUserDetailsAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:3493:1: ( ( ( 'implements' ) ) )
            // InternalSocialRequest.g:3494:2: ( ( 'implements' ) )
            {
            // InternalSocialRequest.g:3494:2: ( ( 'implements' ) )
            // InternalSocialRequest.g:3495:3: ( 'implements' )
            {
             before(grammarAccess.getEntityAccess().getHasUserDetailsImplementsKeyword_2_0_0()); 
            // InternalSocialRequest.g:3496:3: ( 'implements' )
            // InternalSocialRequest.g:3497:4: 'implements'
            {
             before(grammarAccess.getEntityAccess().getHasUserDetailsImplementsKeyword_2_0_0()); 
            match(input,57,FOLLOW_2); 
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
    // InternalSocialRequest.g:3508:1: rule__Entity__AttributesAssignment_4 : ( ruleAttribute ) ;
    public final void rule__Entity__AttributesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:3512:1: ( ( ruleAttribute ) )
            // InternalSocialRequest.g:3513:2: ( ruleAttribute )
            {
            // InternalSocialRequest.g:3513:2: ( ruleAttribute )
            // InternalSocialRequest.g:3514:3: ruleAttribute
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
    // InternalSocialRequest.g:3523:1: rule__Attribute__AssociationAssignment_0 : ( ruleASSOCIATION ) ;
    public final void rule__Attribute__AssociationAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:3527:1: ( ( ruleASSOCIATION ) )
            // InternalSocialRequest.g:3528:2: ( ruleASSOCIATION )
            {
            // InternalSocialRequest.g:3528:2: ( ruleASSOCIATION )
            // InternalSocialRequest.g:3529:3: ruleASSOCIATION
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
    // InternalSocialRequest.g:3538:1: rule__Attribute__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Attribute__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:3542:1: ( ( RULE_ID ) )
            // InternalSocialRequest.g:3543:2: ( RULE_ID )
            {
            // InternalSocialRequest.g:3543:2: ( RULE_ID )
            // InternalSocialRequest.g:3544:3: RULE_ID
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
    // InternalSocialRequest.g:3553:1: rule__Attribute__TypeRefAssignment_3 : ( ruleTypeReference ) ;
    public final void rule__Attribute__TypeRefAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:3557:1: ( ( ruleTypeReference ) )
            // InternalSocialRequest.g:3558:2: ( ruleTypeReference )
            {
            // InternalSocialRequest.g:3558:2: ( ruleTypeReference )
            // InternalSocialRequest.g:3559:3: ruleTypeReference
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
    // InternalSocialRequest.g:3568:1: rule__Attribute__ModifierAssignment_4 : ( ruleModifier ) ;
    public final void rule__Attribute__ModifierAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:3572:1: ( ( ruleModifier ) )
            // InternalSocialRequest.g:3573:2: ( ruleModifier )
            {
            // InternalSocialRequest.g:3573:2: ( ruleModifier )
            // InternalSocialRequest.g:3574:3: ruleModifier
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
    // InternalSocialRequest.g:3583:1: rule__Attribute__MappedByAssignment_5_1_0_1 : ( RULE_ID ) ;
    public final void rule__Attribute__MappedByAssignment_5_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:3587:1: ( ( RULE_ID ) )
            // InternalSocialRequest.g:3588:2: ( RULE_ID )
            {
            // InternalSocialRequest.g:3588:2: ( RULE_ID )
            // InternalSocialRequest.g:3589:3: RULE_ID
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
    // InternalSocialRequest.g:3598:1: rule__Attribute__FetchTypeAssignment_5_1_1_1 : ( RULE_FETCHTYPE ) ;
    public final void rule__Attribute__FetchTypeAssignment_5_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:3602:1: ( ( RULE_FETCHTYPE ) )
            // InternalSocialRequest.g:3603:2: ( RULE_FETCHTYPE )
            {
            // InternalSocialRequest.g:3603:2: ( RULE_FETCHTYPE )
            // InternalSocialRequest.g:3604:3: RULE_FETCHTYPE
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
    // InternalSocialRequest.g:3613:1: rule__Attribute__ValidationsAssignment_5_1_2_2 : ( ruleValidation ) ;
    public final void rule__Attribute__ValidationsAssignment_5_1_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:3617:1: ( ( ruleValidation ) )
            // InternalSocialRequest.g:3618:2: ( ruleValidation )
            {
            // InternalSocialRequest.g:3618:2: ( ruleValidation )
            // InternalSocialRequest.g:3619:3: ruleValidation
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
    // InternalSocialRequest.g:3628:1: rule__EntityTypeReference__TypeAssignment : ( ( RULE_ID ) ) ;
    public final void rule__EntityTypeReference__TypeAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:3632:1: ( ( ( RULE_ID ) ) )
            // InternalSocialRequest.g:3633:2: ( ( RULE_ID ) )
            {
            // InternalSocialRequest.g:3633:2: ( ( RULE_ID ) )
            // InternalSocialRequest.g:3634:3: ( RULE_ID )
            {
             before(grammarAccess.getEntityTypeReferenceAccess().getTypeEntityCrossReference_0()); 
            // InternalSocialRequest.g:3635:3: ( RULE_ID )
            // InternalSocialRequest.g:3636:4: RULE_ID
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
    // InternalSocialRequest.g:3647:1: rule__DataTypeReference__TypeAssignment : ( ruleDataType ) ;
    public final void rule__DataTypeReference__TypeAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:3651:1: ( ( ruleDataType ) )
            // InternalSocialRequest.g:3652:2: ( ruleDataType )
            {
            // InternalSocialRequest.g:3652:2: ( ruleDataType )
            // InternalSocialRequest.g:3653:3: ruleDataType
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
    // InternalSocialRequest.g:3662:1: rule__Modifier__IsLOBAssignment_0 : ( ( 'LOB' ) ) ;
    public final void rule__Modifier__IsLOBAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:3666:1: ( ( ( 'LOB' ) ) )
            // InternalSocialRequest.g:3667:2: ( ( 'LOB' ) )
            {
            // InternalSocialRequest.g:3667:2: ( ( 'LOB' ) )
            // InternalSocialRequest.g:3668:3: ( 'LOB' )
            {
             before(grammarAccess.getModifierAccess().getIsLOBLOBKeyword_0_0()); 
            // InternalSocialRequest.g:3669:3: ( 'LOB' )
            // InternalSocialRequest.g:3670:4: 'LOB'
            {
             before(grammarAccess.getModifierAccess().getIsLOBLOBKeyword_0_0()); 
            match(input,58,FOLLOW_2); 
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
    // InternalSocialRequest.g:3681:1: rule__Modifier__IsTransientAssignment_1 : ( ( 'TRANSIENT' ) ) ;
    public final void rule__Modifier__IsTransientAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:3685:1: ( ( ( 'TRANSIENT' ) ) )
            // InternalSocialRequest.g:3686:2: ( ( 'TRANSIENT' ) )
            {
            // InternalSocialRequest.g:3686:2: ( ( 'TRANSIENT' ) )
            // InternalSocialRequest.g:3687:3: ( 'TRANSIENT' )
            {
             before(grammarAccess.getModifierAccess().getIsTransientTRANSIENTKeyword_1_0()); 
            // InternalSocialRequest.g:3688:3: ( 'TRANSIENT' )
            // InternalSocialRequest.g:3689:4: 'TRANSIENT'
            {
             before(grammarAccess.getModifierAccess().getIsTransientTRANSIENTKeyword_1_0()); 
            match(input,59,FOLLOW_2); 
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
    // InternalSocialRequest.g:3700:1: rule__Modifier__IsIDAssignment_2_0 : ( ( 'ID' ) ) ;
    public final void rule__Modifier__IsIDAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:3704:1: ( ( ( 'ID' ) ) )
            // InternalSocialRequest.g:3705:2: ( ( 'ID' ) )
            {
            // InternalSocialRequest.g:3705:2: ( ( 'ID' ) )
            // InternalSocialRequest.g:3706:3: ( 'ID' )
            {
             before(grammarAccess.getModifierAccess().getIsIDIDKeyword_2_0_0()); 
            // InternalSocialRequest.g:3707:3: ( 'ID' )
            // InternalSocialRequest.g:3708:4: 'ID'
            {
             before(grammarAccess.getModifierAccess().getIsIDIDKeyword_2_0_0()); 
            match(input,60,FOLLOW_2); 
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
    // InternalSocialRequest.g:3719:1: rule__Modifier__IDGenerationTypeAssignment_2_1_1 : ( RULE_GENERATIONTYPE ) ;
    public final void rule__Modifier__IDGenerationTypeAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:3723:1: ( ( RULE_GENERATIONTYPE ) )
            // InternalSocialRequest.g:3724:2: ( RULE_GENERATIONTYPE )
            {
            // InternalSocialRequest.g:3724:2: ( RULE_GENERATIONTYPE )
            // InternalSocialRequest.g:3725:3: RULE_GENERATIONTYPE
            {
             before(grammarAccess.getModifierAccess().getIDGenerationTypeGENERATIONTYPETerminalRuleCall_2_1_1_0()); 
            match(input,RULE_GENERATIONTYPE,FOLLOW_2); 
             after(grammarAccess.getModifierAccess().getIDGenerationTypeGENERATIONTYPETerminalRuleCall_2_1_1_0()); 

            }


            }

        }
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
    // InternalSocialRequest.g:3734:1: rule__Validation__MinAssignment_0_1 : ( RULE_POSSIBLY_SIGNED_INT ) ;
    public final void rule__Validation__MinAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:3738:1: ( ( RULE_POSSIBLY_SIGNED_INT ) )
            // InternalSocialRequest.g:3739:2: ( RULE_POSSIBLY_SIGNED_INT )
            {
            // InternalSocialRequest.g:3739:2: ( RULE_POSSIBLY_SIGNED_INT )
            // InternalSocialRequest.g:3740:3: RULE_POSSIBLY_SIGNED_INT
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
    // InternalSocialRequest.g:3749:1: rule__Validation__MaxAssignment_1_1 : ( RULE_POSSIBLY_SIGNED_INT ) ;
    public final void rule__Validation__MaxAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:3753:1: ( ( RULE_POSSIBLY_SIGNED_INT ) )
            // InternalSocialRequest.g:3754:2: ( RULE_POSSIBLY_SIGNED_INT )
            {
            // InternalSocialRequest.g:3754:2: ( RULE_POSSIBLY_SIGNED_INT )
            // InternalSocialRequest.g:3755:3: RULE_POSSIBLY_SIGNED_INT
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
    // InternalSocialRequest.g:3764:1: rule__Validation__RegexAssignment_2_1 : ( RULE_STRING ) ;
    public final void rule__Validation__RegexAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:3768:1: ( ( RULE_STRING ) )
            // InternalSocialRequest.g:3769:2: ( RULE_STRING )
            {
            // InternalSocialRequest.g:3769:2: ( RULE_STRING )
            // InternalSocialRequest.g:3770:3: RULE_STRING
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
    // InternalSocialRequest.g:3779:1: rule__Validation__ValidatorAssignment_3 : ( ruleBASICVALIDATION ) ;
    public final void rule__Validation__ValidatorAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:3783:1: ( ( ruleBASICVALIDATION ) )
            // InternalSocialRequest.g:3784:2: ( ruleBASICVALIDATION )
            {
            // InternalSocialRequest.g:3784:2: ( ruleBASICVALIDATION )
            // InternalSocialRequest.g:3785:3: ruleBASICVALIDATION
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
    // InternalSocialRequest.g:3794:1: rule__Repository__EntityAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__Repository__EntityAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:3798:1: ( ( ( RULE_ID ) ) )
            // InternalSocialRequest.g:3799:2: ( ( RULE_ID ) )
            {
            // InternalSocialRequest.g:3799:2: ( ( RULE_ID ) )
            // InternalSocialRequest.g:3800:3: ( RULE_ID )
            {
             before(grammarAccess.getRepositoryAccess().getEntityEntityCrossReference_1_0()); 
            // InternalSocialRequest.g:3801:3: ( RULE_ID )
            // InternalSocialRequest.g:3802:4: RULE_ID
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
    // InternalSocialRequest.g:3813:1: rule__Repository__QueriesAssignment_3 : ( ruleQuery ) ;
    public final void rule__Repository__QueriesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:3817:1: ( ( ruleQuery ) )
            // InternalSocialRequest.g:3818:2: ( ruleQuery )
            {
            // InternalSocialRequest.g:3818:2: ( ruleQuery )
            // InternalSocialRequest.g:3819:3: ruleQuery
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
    // InternalSocialRequest.g:3828:1: rule__Query__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Query__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:3832:1: ( ( RULE_ID ) )
            // InternalSocialRequest.g:3833:2: ( RULE_ID )
            {
            // InternalSocialRequest.g:3833:2: ( RULE_ID )
            // InternalSocialRequest.g:3834:3: RULE_ID
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
    // InternalSocialRequest.g:3843:1: rule__Query__IsListAssignment_2_0 : ( ( ':' ) ) ;
    public final void rule__Query__IsListAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:3847:1: ( ( ( ':' ) ) )
            // InternalSocialRequest.g:3848:2: ( ( ':' ) )
            {
            // InternalSocialRequest.g:3848:2: ( ( ':' ) )
            // InternalSocialRequest.g:3849:3: ( ':' )
            {
             before(grammarAccess.getQueryAccess().getIsListColonKeyword_2_0_0()); 
            // InternalSocialRequest.g:3850:3: ( ':' )
            // InternalSocialRequest.g:3851:4: ':'
            {
             before(grammarAccess.getQueryAccess().getIsListColonKeyword_2_0_0()); 
            match(input,39,FOLLOW_2); 
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
    // InternalSocialRequest.g:3862:1: rule__Query__ParamsAssignment_3_1_2 : ( ruleParam ) ;
    public final void rule__Query__ParamsAssignment_3_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:3866:1: ( ( ruleParam ) )
            // InternalSocialRequest.g:3867:2: ( ruleParam )
            {
            // InternalSocialRequest.g:3867:2: ( ruleParam )
            // InternalSocialRequest.g:3868:3: ruleParam
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
    // InternalSocialRequest.g:3877:1: rule__Query__SqlQueryAssignment_3_2 : ( ruleSQLQuery ) ;
    public final void rule__Query__SqlQueryAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:3881:1: ( ( ruleSQLQuery ) )
            // InternalSocialRequest.g:3882:2: ( ruleSQLQuery )
            {
            // InternalSocialRequest.g:3882:2: ( ruleSQLQuery )
            // InternalSocialRequest.g:3883:3: ruleSQLQuery
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
    // InternalSocialRequest.g:3892:1: rule__Param__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Param__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:3896:1: ( ( RULE_ID ) )
            // InternalSocialRequest.g:3897:2: ( RULE_ID )
            {
            // InternalSocialRequest.g:3897:2: ( RULE_ID )
            // InternalSocialRequest.g:3898:3: RULE_ID
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
    // InternalSocialRequest.g:3907:1: rule__Param__TypeAssignment_2 : ( ruleTypeReference ) ;
    public final void rule__Param__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:3911:1: ( ( ruleTypeReference ) )
            // InternalSocialRequest.g:3912:2: ( ruleTypeReference )
            {
            // InternalSocialRequest.g:3912:2: ( ruleTypeReference )
            // InternalSocialRequest.g:3913:3: ruleTypeReference
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
    // InternalSocialRequest.g:3922:1: rule__SQLQuery__SelectAssignment_0 : ( ruleSelect ) ;
    public final void rule__SQLQuery__SelectAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:3926:1: ( ( ruleSelect ) )
            // InternalSocialRequest.g:3927:2: ( ruleSelect )
            {
            // InternalSocialRequest.g:3927:2: ( ruleSelect )
            // InternalSocialRequest.g:3928:3: ruleSelect
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
    // InternalSocialRequest.g:3937:1: rule__SQLQuery__FromAssignment_1 : ( ruleFrom ) ;
    public final void rule__SQLQuery__FromAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:3941:1: ( ( ruleFrom ) )
            // InternalSocialRequest.g:3942:2: ( ruleFrom )
            {
            // InternalSocialRequest.g:3942:2: ( ruleFrom )
            // InternalSocialRequest.g:3943:3: ruleFrom
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
    // InternalSocialRequest.g:3952:1: rule__SQLQuery__JoinsAssignment_2 : ( ruleJoin ) ;
    public final void rule__SQLQuery__JoinsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:3956:1: ( ( ruleJoin ) )
            // InternalSocialRequest.g:3957:2: ( ruleJoin )
            {
            // InternalSocialRequest.g:3957:2: ( ruleJoin )
            // InternalSocialRequest.g:3958:3: ruleJoin
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
    // InternalSocialRequest.g:3967:1: rule__SQLQuery__WhereAssignment_3 : ( ruleWhere ) ;
    public final void rule__SQLQuery__WhereAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:3971:1: ( ( ruleWhere ) )
            // InternalSocialRequest.g:3972:2: ( ruleWhere )
            {
            // InternalSocialRequest.g:3972:2: ( ruleWhere )
            // InternalSocialRequest.g:3973:3: ruleWhere
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
    // InternalSocialRequest.g:3982:1: rule__SQLQuery__OrderAssignment_4 : ( ruleOrder ) ;
    public final void rule__SQLQuery__OrderAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:3986:1: ( ( ruleOrder ) )
            // InternalSocialRequest.g:3987:2: ( ruleOrder )
            {
            // InternalSocialRequest.g:3987:2: ( ruleOrder )
            // InternalSocialRequest.g:3988:3: ruleOrder
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
    // InternalSocialRequest.g:3997:1: rule__Select__IsDistinctAssignment_1 : ( ( 'DISTINCT' ) ) ;
    public final void rule__Select__IsDistinctAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:4001:1: ( ( ( 'DISTINCT' ) ) )
            // InternalSocialRequest.g:4002:2: ( ( 'DISTINCT' ) )
            {
            // InternalSocialRequest.g:4002:2: ( ( 'DISTINCT' ) )
            // InternalSocialRequest.g:4003:3: ( 'DISTINCT' )
            {
             before(grammarAccess.getSelectAccess().getIsDistinctDISTINCTKeyword_1_0()); 
            // InternalSocialRequest.g:4004:3: ( 'DISTINCT' )
            // InternalSocialRequest.g:4005:4: 'DISTINCT'
            {
             before(grammarAccess.getSelectAccess().getIsDistinctDISTINCTKeyword_1_0()); 
            match(input,61,FOLLOW_2); 
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
    // InternalSocialRequest.g:4016:1: rule__Select__ClauseAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Select__ClauseAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:4020:1: ( ( RULE_STRING ) )
            // InternalSocialRequest.g:4021:2: ( RULE_STRING )
            {
            // InternalSocialRequest.g:4021:2: ( RULE_STRING )
            // InternalSocialRequest.g:4022:3: RULE_STRING
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
    // InternalSocialRequest.g:4031:1: rule__From__EntityAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__From__EntityAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:4035:1: ( ( ( RULE_ID ) ) )
            // InternalSocialRequest.g:4036:2: ( ( RULE_ID ) )
            {
            // InternalSocialRequest.g:4036:2: ( ( RULE_ID ) )
            // InternalSocialRequest.g:4037:3: ( RULE_ID )
            {
             before(grammarAccess.getFromAccess().getEntityEntityCrossReference_2_0()); 
            // InternalSocialRequest.g:4038:3: ( RULE_ID )
            // InternalSocialRequest.g:4039:4: RULE_ID
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
    // InternalSocialRequest.g:4050:1: rule__From__AliasAssignment_3 : ( RULE_ID ) ;
    public final void rule__From__AliasAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:4054:1: ( ( RULE_ID ) )
            // InternalSocialRequest.g:4055:2: ( RULE_ID )
            {
            // InternalSocialRequest.g:4055:2: ( RULE_ID )
            // InternalSocialRequest.g:4056:3: RULE_ID
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
    // InternalSocialRequest.g:4065:1: rule__Join__JoinTypeAssignment_0 : ( ruleJoinType ) ;
    public final void rule__Join__JoinTypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:4069:1: ( ( ruleJoinType ) )
            // InternalSocialRequest.g:4070:2: ( ruleJoinType )
            {
            // InternalSocialRequest.g:4070:2: ( ruleJoinType )
            // InternalSocialRequest.g:4071:3: ruleJoinType
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
    // InternalSocialRequest.g:4080:1: rule__Join__EntityAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Join__EntityAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:4084:1: ( ( ( RULE_ID ) ) )
            // InternalSocialRequest.g:4085:2: ( ( RULE_ID ) )
            {
            // InternalSocialRequest.g:4085:2: ( ( RULE_ID ) )
            // InternalSocialRequest.g:4086:3: ( RULE_ID )
            {
             before(grammarAccess.getJoinAccess().getEntityEntityCrossReference_2_0()); 
            // InternalSocialRequest.g:4087:3: ( RULE_ID )
            // InternalSocialRequest.g:4088:4: RULE_ID
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
    // InternalSocialRequest.g:4099:1: rule__Join__AliasAssignment_3 : ( RULE_ID ) ;
    public final void rule__Join__AliasAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:4103:1: ( ( RULE_ID ) )
            // InternalSocialRequest.g:4104:2: ( RULE_ID )
            {
            // InternalSocialRequest.g:4104:2: ( RULE_ID )
            // InternalSocialRequest.g:4105:3: RULE_ID
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
    // InternalSocialRequest.g:4114:1: rule__Join__JoinConditionAssignment_5_2 : ( RULE_STRING ) ;
    public final void rule__Join__JoinConditionAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:4118:1: ( ( RULE_STRING ) )
            // InternalSocialRequest.g:4119:2: ( RULE_STRING )
            {
            // InternalSocialRequest.g:4119:2: ( RULE_STRING )
            // InternalSocialRequest.g:4120:3: RULE_STRING
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
    // InternalSocialRequest.g:4129:1: rule__Where__ConditionAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Where__ConditionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:4133:1: ( ( RULE_STRING ) )
            // InternalSocialRequest.g:4134:2: ( RULE_STRING )
            {
            // InternalSocialRequest.g:4134:2: ( RULE_STRING )
            // InternalSocialRequest.g:4135:3: RULE_STRING
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
    // InternalSocialRequest.g:4144:1: rule__Order__OrderAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Order__OrderAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:4148:1: ( ( RULE_STRING ) )
            // InternalSocialRequest.g:4149:2: ( RULE_STRING )
            {
            // InternalSocialRequest.g:4149:2: ( RULE_STRING )
            // InternalSocialRequest.g:4150:3: RULE_STRING
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0200001000000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000780010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000780012L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x000000007F800010L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x1C00001000000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000070000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000E0000007C000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000E0000007C002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000009000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0018002000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000002000000010L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0180000780000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000780000002L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x2000001000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000070000000002L});

}
