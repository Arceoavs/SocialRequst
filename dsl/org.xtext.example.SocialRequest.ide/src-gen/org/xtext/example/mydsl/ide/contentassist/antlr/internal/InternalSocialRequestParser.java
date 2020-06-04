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
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalSocialRequestParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_ASSOCIATION", "RULE_DATA_TYPE", "RULE_GENERATION_TYPE", "RULE_POSSIBLY_SIGNED_INT", "RULE_STRING", "RULE_FETCH_TYPE", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Kek'", "'Entity'", "'{'", "'}'", "':'", "'validations {'", "'LOB'", "'ID'", "'('", "')'", "'min:'", "'max:'", "'pattern:'", "'not-null'", "'not-blank'", "'mappedBy:'", "'fetch:'", "'Repository'", "'query'", "'param'", "'implements UserDetails'", "': list'"
    };
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
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getGroup()); 
            }
            // InternalSocialRequest.g:69:3: ( rule__Model__Group__0 )
            // InternalSocialRequest.g:69:4: rule__Model__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getGroup()); 
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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleEntity"
    // InternalSocialRequest.g:78:1: entryRuleEntity : ruleEntity EOF ;
    public final void entryRuleEntity() throws RecognitionException {
        try {
            // InternalSocialRequest.g:79:1: ( ruleEntity EOF )
            // InternalSocialRequest.g:80:1: ruleEntity EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntityRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleEntity();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntityRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntityAccess().getGroup()); 
            }
            // InternalSocialRequest.g:94:3: ( rule__Entity__Group__0 )
            // InternalSocialRequest.g:94:4: rule__Entity__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Entity__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntityAccess().getGroup()); 
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
    // $ANTLR end "ruleEntity"


    // $ANTLR start "entryRuleAttribute"
    // InternalSocialRequest.g:103:1: entryRuleAttribute : ruleAttribute EOF ;
    public final void entryRuleAttribute() throws RecognitionException {
        try {
            // InternalSocialRequest.g:104:1: ( ruleAttribute EOF )
            // InternalSocialRequest.g:105:1: ruleAttribute EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleAttribute();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getGroup()); 
            }
            // InternalSocialRequest.g:119:3: ( rule__Attribute__Group__0 )
            // InternalSocialRequest.g:119:4: rule__Attribute__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeAccess().getGroup()); 
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
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleModifier"
    // InternalSocialRequest.g:128:1: entryRuleModifier : ruleModifier EOF ;
    public final void entryRuleModifier() throws RecognitionException {
        try {
            // InternalSocialRequest.g:129:1: ( ruleModifier EOF )
            // InternalSocialRequest.g:130:1: ruleModifier EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModifierRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleModifier();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModifierRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalSocialRequest.g:137:1: ruleModifier : ( ( rule__Modifier__Alternatives ) ) ;
    public final void ruleModifier() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:141:2: ( ( ( rule__Modifier__Alternatives ) ) )
            // InternalSocialRequest.g:142:2: ( ( rule__Modifier__Alternatives ) )
            {
            // InternalSocialRequest.g:142:2: ( ( rule__Modifier__Alternatives ) )
            // InternalSocialRequest.g:143:3: ( rule__Modifier__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModifierAccess().getAlternatives()); 
            }
            // InternalSocialRequest.g:144:3: ( rule__Modifier__Alternatives )
            // InternalSocialRequest.g:144:4: rule__Modifier__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Modifier__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModifierAccess().getAlternatives()); 
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
    // $ANTLR end "ruleModifier"


    // $ANTLR start "entryRuleIdentification"
    // InternalSocialRequest.g:153:1: entryRuleIdentification : ruleIdentification EOF ;
    public final void entryRuleIdentification() throws RecognitionException {
        try {
            // InternalSocialRequest.g:154:1: ( ruleIdentification EOF )
            // InternalSocialRequest.g:155:1: ruleIdentification EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIdentificationRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleIdentification();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIdentificationRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleIdentification"


    // $ANTLR start "ruleIdentification"
    // InternalSocialRequest.g:162:1: ruleIdentification : ( ( rule__Identification__Group__0 ) ) ;
    public final void ruleIdentification() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:166:2: ( ( ( rule__Identification__Group__0 ) ) )
            // InternalSocialRequest.g:167:2: ( ( rule__Identification__Group__0 ) )
            {
            // InternalSocialRequest.g:167:2: ( ( rule__Identification__Group__0 ) )
            // InternalSocialRequest.g:168:3: ( rule__Identification__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIdentificationAccess().getGroup()); 
            }
            // InternalSocialRequest.g:169:3: ( rule__Identification__Group__0 )
            // InternalSocialRequest.g:169:4: rule__Identification__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Identification__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIdentificationAccess().getGroup()); 
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
    // $ANTLR end "ruleIdentification"


    // $ANTLR start "entryRuleValidation"
    // InternalSocialRequest.g:178:1: entryRuleValidation : ruleValidation EOF ;
    public final void entryRuleValidation() throws RecognitionException {
        try {
            // InternalSocialRequest.g:179:1: ( ruleValidation EOF )
            // InternalSocialRequest.g:180:1: ruleValidation EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValidationRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleValidation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getValidationRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalSocialRequest.g:187:1: ruleValidation : ( ( rule__Validation__Alternatives ) ) ;
    public final void ruleValidation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:191:2: ( ( ( rule__Validation__Alternatives ) ) )
            // InternalSocialRequest.g:192:2: ( ( rule__Validation__Alternatives ) )
            {
            // InternalSocialRequest.g:192:2: ( ( rule__Validation__Alternatives ) )
            // InternalSocialRequest.g:193:3: ( rule__Validation__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValidationAccess().getAlternatives()); 
            }
            // InternalSocialRequest.g:194:3: ( rule__Validation__Alternatives )
            // InternalSocialRequest.g:194:4: rule__Validation__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Validation__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getValidationAccess().getAlternatives()); 
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
    // $ANTLR end "ruleValidation"


    // $ANTLR start "entryRuleAssociationSpecification"
    // InternalSocialRequest.g:203:1: entryRuleAssociationSpecification : ruleAssociationSpecification EOF ;
    public final void entryRuleAssociationSpecification() throws RecognitionException {
        try {
            // InternalSocialRequest.g:204:1: ( ruleAssociationSpecification EOF )
            // InternalSocialRequest.g:205:1: ruleAssociationSpecification EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssociationSpecificationRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleAssociationSpecification();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssociationSpecificationRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleAssociationSpecification"


    // $ANTLR start "ruleAssociationSpecification"
    // InternalSocialRequest.g:212:1: ruleAssociationSpecification : ( ( rule__AssociationSpecification__Alternatives ) ) ;
    public final void ruleAssociationSpecification() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:216:2: ( ( ( rule__AssociationSpecification__Alternatives ) ) )
            // InternalSocialRequest.g:217:2: ( ( rule__AssociationSpecification__Alternatives ) )
            {
            // InternalSocialRequest.g:217:2: ( ( rule__AssociationSpecification__Alternatives ) )
            // InternalSocialRequest.g:218:3: ( rule__AssociationSpecification__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssociationSpecificationAccess().getAlternatives()); 
            }
            // InternalSocialRequest.g:219:3: ( rule__AssociationSpecification__Alternatives )
            // InternalSocialRequest.g:219:4: rule__AssociationSpecification__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__AssociationSpecification__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssociationSpecificationAccess().getAlternatives()); 
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
    // $ANTLR end "ruleAssociationSpecification"


    // $ANTLR start "entryRuleRepository"
    // InternalSocialRequest.g:228:1: entryRuleRepository : ruleRepository EOF ;
    public final void entryRuleRepository() throws RecognitionException {
        try {
            // InternalSocialRequest.g:229:1: ( ruleRepository EOF )
            // InternalSocialRequest.g:230:1: ruleRepository EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRepositoryRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleRepository();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRepositoryRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalSocialRequest.g:237:1: ruleRepository : ( ( rule__Repository__Group__0 ) ) ;
    public final void ruleRepository() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:241:2: ( ( ( rule__Repository__Group__0 ) ) )
            // InternalSocialRequest.g:242:2: ( ( rule__Repository__Group__0 ) )
            {
            // InternalSocialRequest.g:242:2: ( ( rule__Repository__Group__0 ) )
            // InternalSocialRequest.g:243:3: ( rule__Repository__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRepositoryAccess().getGroup()); 
            }
            // InternalSocialRequest.g:244:3: ( rule__Repository__Group__0 )
            // InternalSocialRequest.g:244:4: rule__Repository__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Repository__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRepositoryAccess().getGroup()); 
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
    // $ANTLR end "ruleRepository"


    // $ANTLR start "entryRuleQuery"
    // InternalSocialRequest.g:253:1: entryRuleQuery : ruleQuery EOF ;
    public final void entryRuleQuery() throws RecognitionException {
        try {
            // InternalSocialRequest.g:254:1: ( ruleQuery EOF )
            // InternalSocialRequest.g:255:1: ruleQuery EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQueryRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleQuery();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQueryRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalSocialRequest.g:262:1: ruleQuery : ( ( rule__Query__Group__0 ) ) ;
    public final void ruleQuery() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:266:2: ( ( ( rule__Query__Group__0 ) ) )
            // InternalSocialRequest.g:267:2: ( ( rule__Query__Group__0 ) )
            {
            // InternalSocialRequest.g:267:2: ( ( rule__Query__Group__0 ) )
            // InternalSocialRequest.g:268:3: ( rule__Query__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQueryAccess().getGroup()); 
            }
            // InternalSocialRequest.g:269:3: ( rule__Query__Group__0 )
            // InternalSocialRequest.g:269:4: rule__Query__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Query__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQueryAccess().getGroup()); 
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
    // $ANTLR end "ruleQuery"


    // $ANTLR start "entryRuleParam"
    // InternalSocialRequest.g:278:1: entryRuleParam : ruleParam EOF ;
    public final void entryRuleParam() throws RecognitionException {
        try {
            // InternalSocialRequest.g:279:1: ( ruleParam EOF )
            // InternalSocialRequest.g:280:1: ruleParam EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParamRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleParam();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParamRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalSocialRequest.g:287:1: ruleParam : ( ( rule__Param__Group__0 ) ) ;
    public final void ruleParam() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:291:2: ( ( ( rule__Param__Group__0 ) ) )
            // InternalSocialRequest.g:292:2: ( ( rule__Param__Group__0 ) )
            {
            // InternalSocialRequest.g:292:2: ( ( rule__Param__Group__0 ) )
            // InternalSocialRequest.g:293:3: ( rule__Param__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParamAccess().getGroup()); 
            }
            // InternalSocialRequest.g:294:3: ( rule__Param__Group__0 )
            // InternalSocialRequest.g:294:4: rule__Param__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Param__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParamAccess().getGroup()); 
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
    // $ANTLR end "ruleParam"


    // $ANTLR start "entryRuleSQLQuery"
    // InternalSocialRequest.g:303:1: entryRuleSQLQuery : ruleSQLQuery EOF ;
    public final void entryRuleSQLQuery() throws RecognitionException {
        try {
            // InternalSocialRequest.g:304:1: ( ruleSQLQuery EOF )
            // InternalSocialRequest.g:305:1: ruleSQLQuery EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSQLQueryRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleSQLQuery();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSQLQueryRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalSocialRequest.g:312:1: ruleSQLQuery : ( 'Kek' ) ;
    public final void ruleSQLQuery() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:316:2: ( ( 'Kek' ) )
            // InternalSocialRequest.g:317:2: ( 'Kek' )
            {
            // InternalSocialRequest.g:317:2: ( 'Kek' )
            // InternalSocialRequest.g:318:3: 'Kek'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSQLQueryAccess().getKekKeyword()); 
            }
            match(input,16,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSQLQueryAccess().getKekKeyword()); 
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
    // $ANTLR end "ruleSQLQuery"


    // $ANTLR start "rule__Modifier__Alternatives"
    // InternalSocialRequest.g:327:1: rule__Modifier__Alternatives : ( ( ( rule__Modifier__Group_0__0 ) ) | ( ruleIdentification ) );
    public final void rule__Modifier__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:331:1: ( ( ( rule__Modifier__Group_0__0 ) ) | ( ruleIdentification ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==22) ) {
                alt1=1;
            }
            else if ( (LA1_0==23) ) {
                alt1=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalSocialRequest.g:332:2: ( ( rule__Modifier__Group_0__0 ) )
                    {
                    // InternalSocialRequest.g:332:2: ( ( rule__Modifier__Group_0__0 ) )
                    // InternalSocialRequest.g:333:3: ( rule__Modifier__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getModifierAccess().getGroup_0()); 
                    }
                    // InternalSocialRequest.g:334:3: ( rule__Modifier__Group_0__0 )
                    // InternalSocialRequest.g:334:4: rule__Modifier__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Modifier__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getModifierAccess().getGroup_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSocialRequest.g:338:2: ( ruleIdentification )
                    {
                    // InternalSocialRequest.g:338:2: ( ruleIdentification )
                    // InternalSocialRequest.g:339:3: ruleIdentification
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getModifierAccess().getIdentificationParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleIdentification();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getModifierAccess().getIdentificationParserRuleCall_1()); 
                    }

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
    // InternalSocialRequest.g:348:1: rule__Validation__Alternatives : ( ( ( rule__Validation__Group_0__0 ) ) | ( ( rule__Validation__Group_1__0 ) ) | ( ( rule__Validation__Group_2__0 ) ) | ( ( rule__Validation__Group_3__0 ) ) | ( ( rule__Validation__Group_4__0 ) ) );
    public final void rule__Validation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:352:1: ( ( ( rule__Validation__Group_0__0 ) ) | ( ( rule__Validation__Group_1__0 ) ) | ( ( rule__Validation__Group_2__0 ) ) | ( ( rule__Validation__Group_3__0 ) ) | ( ( rule__Validation__Group_4__0 ) ) )
            int alt2=5;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt2=1;
                }
                break;
            case 27:
                {
                alt2=2;
                }
                break;
            case 28:
                {
                alt2=3;
                }
                break;
            case 29:
                {
                alt2=4;
                }
                break;
            case 30:
                {
                alt2=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalSocialRequest.g:353:2: ( ( rule__Validation__Group_0__0 ) )
                    {
                    // InternalSocialRequest.g:353:2: ( ( rule__Validation__Group_0__0 ) )
                    // InternalSocialRequest.g:354:3: ( rule__Validation__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValidationAccess().getGroup_0()); 
                    }
                    // InternalSocialRequest.g:355:3: ( rule__Validation__Group_0__0 )
                    // InternalSocialRequest.g:355:4: rule__Validation__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Validation__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getValidationAccess().getGroup_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSocialRequest.g:359:2: ( ( rule__Validation__Group_1__0 ) )
                    {
                    // InternalSocialRequest.g:359:2: ( ( rule__Validation__Group_1__0 ) )
                    // InternalSocialRequest.g:360:3: ( rule__Validation__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValidationAccess().getGroup_1()); 
                    }
                    // InternalSocialRequest.g:361:3: ( rule__Validation__Group_1__0 )
                    // InternalSocialRequest.g:361:4: rule__Validation__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Validation__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getValidationAccess().getGroup_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalSocialRequest.g:365:2: ( ( rule__Validation__Group_2__0 ) )
                    {
                    // InternalSocialRequest.g:365:2: ( ( rule__Validation__Group_2__0 ) )
                    // InternalSocialRequest.g:366:3: ( rule__Validation__Group_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValidationAccess().getGroup_2()); 
                    }
                    // InternalSocialRequest.g:367:3: ( rule__Validation__Group_2__0 )
                    // InternalSocialRequest.g:367:4: rule__Validation__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Validation__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getValidationAccess().getGroup_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalSocialRequest.g:371:2: ( ( rule__Validation__Group_3__0 ) )
                    {
                    // InternalSocialRequest.g:371:2: ( ( rule__Validation__Group_3__0 ) )
                    // InternalSocialRequest.g:372:3: ( rule__Validation__Group_3__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValidationAccess().getGroup_3()); 
                    }
                    // InternalSocialRequest.g:373:3: ( rule__Validation__Group_3__0 )
                    // InternalSocialRequest.g:373:4: rule__Validation__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Validation__Group_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getValidationAccess().getGroup_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalSocialRequest.g:377:2: ( ( rule__Validation__Group_4__0 ) )
                    {
                    // InternalSocialRequest.g:377:2: ( ( rule__Validation__Group_4__0 ) )
                    // InternalSocialRequest.g:378:3: ( rule__Validation__Group_4__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValidationAccess().getGroup_4()); 
                    }
                    // InternalSocialRequest.g:379:3: ( rule__Validation__Group_4__0 )
                    // InternalSocialRequest.g:379:4: rule__Validation__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Validation__Group_4__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getValidationAccess().getGroup_4()); 
                    }

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


    // $ANTLR start "rule__AssociationSpecification__Alternatives"
    // InternalSocialRequest.g:387:1: rule__AssociationSpecification__Alternatives : ( ( ( rule__AssociationSpecification__Group_0__0 ) ) | ( ( rule__AssociationSpecification__Group_1__0 ) ) );
    public final void rule__AssociationSpecification__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:391:1: ( ( ( rule__AssociationSpecification__Group_0__0 ) ) | ( ( rule__AssociationSpecification__Group_1__0 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==31) ) {
                alt3=1;
            }
            else if ( (LA3_0==32) ) {
                alt3=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalSocialRequest.g:392:2: ( ( rule__AssociationSpecification__Group_0__0 ) )
                    {
                    // InternalSocialRequest.g:392:2: ( ( rule__AssociationSpecification__Group_0__0 ) )
                    // InternalSocialRequest.g:393:3: ( rule__AssociationSpecification__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAssociationSpecificationAccess().getGroup_0()); 
                    }
                    // InternalSocialRequest.g:394:3: ( rule__AssociationSpecification__Group_0__0 )
                    // InternalSocialRequest.g:394:4: rule__AssociationSpecification__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AssociationSpecification__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAssociationSpecificationAccess().getGroup_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSocialRequest.g:398:2: ( ( rule__AssociationSpecification__Group_1__0 ) )
                    {
                    // InternalSocialRequest.g:398:2: ( ( rule__AssociationSpecification__Group_1__0 ) )
                    // InternalSocialRequest.g:399:3: ( rule__AssociationSpecification__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAssociationSpecificationAccess().getGroup_1()); 
                    }
                    // InternalSocialRequest.g:400:3: ( rule__AssociationSpecification__Group_1__0 )
                    // InternalSocialRequest.g:400:4: rule__AssociationSpecification__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AssociationSpecification__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAssociationSpecificationAccess().getGroup_1()); 
                    }

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
    // $ANTLR end "rule__AssociationSpecification__Alternatives"


    // $ANTLR start "rule__Model__Group__0"
    // InternalSocialRequest.g:408:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:412:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalSocialRequest.g:413:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Model__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Model__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalSocialRequest.g:420:1: rule__Model__Group__0__Impl : ( ( rule__Model__EntitiesAssignment_0 )* ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:424:1: ( ( ( rule__Model__EntitiesAssignment_0 )* ) )
            // InternalSocialRequest.g:425:1: ( ( rule__Model__EntitiesAssignment_0 )* )
            {
            // InternalSocialRequest.g:425:1: ( ( rule__Model__EntitiesAssignment_0 )* )
            // InternalSocialRequest.g:426:2: ( rule__Model__EntitiesAssignment_0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getEntitiesAssignment_0()); 
            }
            // InternalSocialRequest.g:427:2: ( rule__Model__EntitiesAssignment_0 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==17) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalSocialRequest.g:427:3: rule__Model__EntitiesAssignment_0
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Model__EntitiesAssignment_0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getEntitiesAssignment_0()); 
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
    // $ANTLR end "rule__Model__Group__0__Impl"


    // $ANTLR start "rule__Model__Group__1"
    // InternalSocialRequest.g:435:1: rule__Model__Group__1 : rule__Model__Group__1__Impl ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:439:1: ( rule__Model__Group__1__Impl )
            // InternalSocialRequest.g:440:2: rule__Model__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalSocialRequest.g:446:1: rule__Model__Group__1__Impl : ( ( rule__Model__RepositoriesAssignment_1 )* ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:450:1: ( ( ( rule__Model__RepositoriesAssignment_1 )* ) )
            // InternalSocialRequest.g:451:1: ( ( rule__Model__RepositoriesAssignment_1 )* )
            {
            // InternalSocialRequest.g:451:1: ( ( rule__Model__RepositoriesAssignment_1 )* )
            // InternalSocialRequest.g:452:2: ( rule__Model__RepositoriesAssignment_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getRepositoriesAssignment_1()); 
            }
            // InternalSocialRequest.g:453:2: ( rule__Model__RepositoriesAssignment_1 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==33) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalSocialRequest.g:453:3: rule__Model__RepositoriesAssignment_1
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__Model__RepositoriesAssignment_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getRepositoriesAssignment_1()); 
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
    // $ANTLR end "rule__Model__Group__1__Impl"


    // $ANTLR start "rule__Entity__Group__0"
    // InternalSocialRequest.g:462:1: rule__Entity__Group__0 : rule__Entity__Group__0__Impl rule__Entity__Group__1 ;
    public final void rule__Entity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:466:1: ( rule__Entity__Group__0__Impl rule__Entity__Group__1 )
            // InternalSocialRequest.g:467:2: rule__Entity__Group__0__Impl rule__Entity__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Entity__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Entity__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalSocialRequest.g:474:1: rule__Entity__Group__0__Impl : ( 'Entity' ) ;
    public final void rule__Entity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:478:1: ( ( 'Entity' ) )
            // InternalSocialRequest.g:479:1: ( 'Entity' )
            {
            // InternalSocialRequest.g:479:1: ( 'Entity' )
            // InternalSocialRequest.g:480:2: 'Entity'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntityAccess().getEntityKeyword_0()); 
            }
            match(input,17,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntityAccess().getEntityKeyword_0()); 
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
    // $ANTLR end "rule__Entity__Group__0__Impl"


    // $ANTLR start "rule__Entity__Group__1"
    // InternalSocialRequest.g:489:1: rule__Entity__Group__1 : rule__Entity__Group__1__Impl rule__Entity__Group__2 ;
    public final void rule__Entity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:493:1: ( rule__Entity__Group__1__Impl rule__Entity__Group__2 )
            // InternalSocialRequest.g:494:2: rule__Entity__Group__1__Impl rule__Entity__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__Entity__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Entity__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalSocialRequest.g:501:1: rule__Entity__Group__1__Impl : ( ( rule__Entity__NameAssignment_1 ) ) ;
    public final void rule__Entity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:505:1: ( ( ( rule__Entity__NameAssignment_1 ) ) )
            // InternalSocialRequest.g:506:1: ( ( rule__Entity__NameAssignment_1 ) )
            {
            // InternalSocialRequest.g:506:1: ( ( rule__Entity__NameAssignment_1 ) )
            // InternalSocialRequest.g:507:2: ( rule__Entity__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntityAccess().getNameAssignment_1()); 
            }
            // InternalSocialRequest.g:508:2: ( rule__Entity__NameAssignment_1 )
            // InternalSocialRequest.g:508:3: rule__Entity__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Entity__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntityAccess().getNameAssignment_1()); 
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
    // $ANTLR end "rule__Entity__Group__1__Impl"


    // $ANTLR start "rule__Entity__Group__2"
    // InternalSocialRequest.g:516:1: rule__Entity__Group__2 : rule__Entity__Group__2__Impl rule__Entity__Group__3 ;
    public final void rule__Entity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:520:1: ( rule__Entity__Group__2__Impl rule__Entity__Group__3 )
            // InternalSocialRequest.g:521:2: rule__Entity__Group__2__Impl rule__Entity__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__Entity__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Entity__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalSocialRequest.g:528:1: rule__Entity__Group__2__Impl : ( ( rule__Entity__HasUserDetailsAssignment_2 )? ) ;
    public final void rule__Entity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:532:1: ( ( ( rule__Entity__HasUserDetailsAssignment_2 )? ) )
            // InternalSocialRequest.g:533:1: ( ( rule__Entity__HasUserDetailsAssignment_2 )? )
            {
            // InternalSocialRequest.g:533:1: ( ( rule__Entity__HasUserDetailsAssignment_2 )? )
            // InternalSocialRequest.g:534:2: ( rule__Entity__HasUserDetailsAssignment_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntityAccess().getHasUserDetailsAssignment_2()); 
            }
            // InternalSocialRequest.g:535:2: ( rule__Entity__HasUserDetailsAssignment_2 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==36) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalSocialRequest.g:535:3: rule__Entity__HasUserDetailsAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Entity__HasUserDetailsAssignment_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntityAccess().getHasUserDetailsAssignment_2()); 
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
    // $ANTLR end "rule__Entity__Group__2__Impl"


    // $ANTLR start "rule__Entity__Group__3"
    // InternalSocialRequest.g:543:1: rule__Entity__Group__3 : rule__Entity__Group__3__Impl rule__Entity__Group__4 ;
    public final void rule__Entity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:547:1: ( rule__Entity__Group__3__Impl rule__Entity__Group__4 )
            // InternalSocialRequest.g:548:2: rule__Entity__Group__3__Impl rule__Entity__Group__4
            {
            pushFollow(FOLLOW_8);
            rule__Entity__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Entity__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalSocialRequest.g:555:1: rule__Entity__Group__3__Impl : ( '{' ) ;
    public final void rule__Entity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:559:1: ( ( '{' ) )
            // InternalSocialRequest.g:560:1: ( '{' )
            {
            // InternalSocialRequest.g:560:1: ( '{' )
            // InternalSocialRequest.g:561:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_3()); 
            }
            match(input,18,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_3()); 
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
    // $ANTLR end "rule__Entity__Group__3__Impl"


    // $ANTLR start "rule__Entity__Group__4"
    // InternalSocialRequest.g:570:1: rule__Entity__Group__4 : rule__Entity__Group__4__Impl rule__Entity__Group__5 ;
    public final void rule__Entity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:574:1: ( rule__Entity__Group__4__Impl rule__Entity__Group__5 )
            // InternalSocialRequest.g:575:2: rule__Entity__Group__4__Impl rule__Entity__Group__5
            {
            pushFollow(FOLLOW_9);
            rule__Entity__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Entity__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalSocialRequest.g:582:1: rule__Entity__Group__4__Impl : ( ( ( rule__Entity__AttributesAssignment_4 ) ) ( ( rule__Entity__AttributesAssignment_4 )* ) ) ;
    public final void rule__Entity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:586:1: ( ( ( ( rule__Entity__AttributesAssignment_4 ) ) ( ( rule__Entity__AttributesAssignment_4 )* ) ) )
            // InternalSocialRequest.g:587:1: ( ( ( rule__Entity__AttributesAssignment_4 ) ) ( ( rule__Entity__AttributesAssignment_4 )* ) )
            {
            // InternalSocialRequest.g:587:1: ( ( ( rule__Entity__AttributesAssignment_4 ) ) ( ( rule__Entity__AttributesAssignment_4 )* ) )
            // InternalSocialRequest.g:588:2: ( ( rule__Entity__AttributesAssignment_4 ) ) ( ( rule__Entity__AttributesAssignment_4 )* )
            {
            // InternalSocialRequest.g:588:2: ( ( rule__Entity__AttributesAssignment_4 ) )
            // InternalSocialRequest.g:589:3: ( rule__Entity__AttributesAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntityAccess().getAttributesAssignment_4()); 
            }
            // InternalSocialRequest.g:590:3: ( rule__Entity__AttributesAssignment_4 )
            // InternalSocialRequest.g:590:4: rule__Entity__AttributesAssignment_4
            {
            pushFollow(FOLLOW_10);
            rule__Entity__AttributesAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntityAccess().getAttributesAssignment_4()); 
            }

            }

            // InternalSocialRequest.g:593:2: ( ( rule__Entity__AttributesAssignment_4 )* )
            // InternalSocialRequest.g:594:3: ( rule__Entity__AttributesAssignment_4 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntityAccess().getAttributesAssignment_4()); 
            }
            // InternalSocialRequest.g:595:3: ( rule__Entity__AttributesAssignment_4 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=RULE_ID && LA7_0<=RULE_ASSOCIATION)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalSocialRequest.g:595:4: rule__Entity__AttributesAssignment_4
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Entity__AttributesAssignment_4();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntityAccess().getAttributesAssignment_4()); 
            }

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
    // InternalSocialRequest.g:604:1: rule__Entity__Group__5 : rule__Entity__Group__5__Impl ;
    public final void rule__Entity__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:608:1: ( rule__Entity__Group__5__Impl )
            // InternalSocialRequest.g:609:2: rule__Entity__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Entity__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalSocialRequest.g:615:1: rule__Entity__Group__5__Impl : ( '}' ) ;
    public final void rule__Entity__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:619:1: ( ( '}' ) )
            // InternalSocialRequest.g:620:1: ( '}' )
            {
            // InternalSocialRequest.g:620:1: ( '}' )
            // InternalSocialRequest.g:621:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_5()); 
            }
            match(input,19,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_5()); 
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
    // $ANTLR end "rule__Entity__Group__5__Impl"


    // $ANTLR start "rule__Attribute__Group__0"
    // InternalSocialRequest.g:631:1: rule__Attribute__Group__0 : rule__Attribute__Group__0__Impl rule__Attribute__Group__1 ;
    public final void rule__Attribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:635:1: ( rule__Attribute__Group__0__Impl rule__Attribute__Group__1 )
            // InternalSocialRequest.g:636:2: rule__Attribute__Group__0__Impl rule__Attribute__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__Attribute__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Attribute__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalSocialRequest.g:643:1: rule__Attribute__Group__0__Impl : ( ( rule__Attribute__AssociationAssignment_0 )? ) ;
    public final void rule__Attribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:647:1: ( ( ( rule__Attribute__AssociationAssignment_0 )? ) )
            // InternalSocialRequest.g:648:1: ( ( rule__Attribute__AssociationAssignment_0 )? )
            {
            // InternalSocialRequest.g:648:1: ( ( rule__Attribute__AssociationAssignment_0 )? )
            // InternalSocialRequest.g:649:2: ( rule__Attribute__AssociationAssignment_0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getAssociationAssignment_0()); 
            }
            // InternalSocialRequest.g:650:2: ( rule__Attribute__AssociationAssignment_0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_ASSOCIATION) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalSocialRequest.g:650:3: rule__Attribute__AssociationAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Attribute__AssociationAssignment_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeAccess().getAssociationAssignment_0()); 
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
    // $ANTLR end "rule__Attribute__Group__0__Impl"


    // $ANTLR start "rule__Attribute__Group__1"
    // InternalSocialRequest.g:658:1: rule__Attribute__Group__1 : rule__Attribute__Group__1__Impl rule__Attribute__Group__2 ;
    public final void rule__Attribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:662:1: ( rule__Attribute__Group__1__Impl rule__Attribute__Group__2 )
            // InternalSocialRequest.g:663:2: rule__Attribute__Group__1__Impl rule__Attribute__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__Attribute__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Attribute__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalSocialRequest.g:670:1: rule__Attribute__Group__1__Impl : ( ( rule__Attribute__NameAssignment_1 ) ) ;
    public final void rule__Attribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:674:1: ( ( ( rule__Attribute__NameAssignment_1 ) ) )
            // InternalSocialRequest.g:675:1: ( ( rule__Attribute__NameAssignment_1 ) )
            {
            // InternalSocialRequest.g:675:1: ( ( rule__Attribute__NameAssignment_1 ) )
            // InternalSocialRequest.g:676:2: ( rule__Attribute__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getNameAssignment_1()); 
            }
            // InternalSocialRequest.g:677:2: ( rule__Attribute__NameAssignment_1 )
            // InternalSocialRequest.g:677:3: rule__Attribute__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeAccess().getNameAssignment_1()); 
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
    // $ANTLR end "rule__Attribute__Group__1__Impl"


    // $ANTLR start "rule__Attribute__Group__2"
    // InternalSocialRequest.g:685:1: rule__Attribute__Group__2 : rule__Attribute__Group__2__Impl rule__Attribute__Group__3 ;
    public final void rule__Attribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:689:1: ( rule__Attribute__Group__2__Impl rule__Attribute__Group__3 )
            // InternalSocialRequest.g:690:2: rule__Attribute__Group__2__Impl rule__Attribute__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__Attribute__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Attribute__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalSocialRequest.g:697:1: rule__Attribute__Group__2__Impl : ( ':' ) ;
    public final void rule__Attribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:701:1: ( ( ':' ) )
            // InternalSocialRequest.g:702:1: ( ':' )
            {
            // InternalSocialRequest.g:702:1: ( ':' )
            // InternalSocialRequest.g:703:2: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getColonKeyword_2()); 
            }
            match(input,20,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeAccess().getColonKeyword_2()); 
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
    // $ANTLR end "rule__Attribute__Group__2__Impl"


    // $ANTLR start "rule__Attribute__Group__3"
    // InternalSocialRequest.g:712:1: rule__Attribute__Group__3 : rule__Attribute__Group__3__Impl rule__Attribute__Group__4 ;
    public final void rule__Attribute__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:716:1: ( rule__Attribute__Group__3__Impl rule__Attribute__Group__4 )
            // InternalSocialRequest.g:717:2: rule__Attribute__Group__3__Impl rule__Attribute__Group__4
            {
            pushFollow(FOLLOW_13);
            rule__Attribute__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Attribute__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalSocialRequest.g:724:1: rule__Attribute__Group__3__Impl : ( ( rule__Attribute__TypeAssignment_3 ) ) ;
    public final void rule__Attribute__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:728:1: ( ( ( rule__Attribute__TypeAssignment_3 ) ) )
            // InternalSocialRequest.g:729:1: ( ( rule__Attribute__TypeAssignment_3 ) )
            {
            // InternalSocialRequest.g:729:1: ( ( rule__Attribute__TypeAssignment_3 ) )
            // InternalSocialRequest.g:730:2: ( rule__Attribute__TypeAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getTypeAssignment_3()); 
            }
            // InternalSocialRequest.g:731:2: ( rule__Attribute__TypeAssignment_3 )
            // InternalSocialRequest.g:731:3: rule__Attribute__TypeAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__TypeAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeAccess().getTypeAssignment_3()); 
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
    // $ANTLR end "rule__Attribute__Group__3__Impl"


    // $ANTLR start "rule__Attribute__Group__4"
    // InternalSocialRequest.g:739:1: rule__Attribute__Group__4 : rule__Attribute__Group__4__Impl rule__Attribute__Group__5 ;
    public final void rule__Attribute__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:743:1: ( rule__Attribute__Group__4__Impl rule__Attribute__Group__5 )
            // InternalSocialRequest.g:744:2: rule__Attribute__Group__4__Impl rule__Attribute__Group__5
            {
            pushFollow(FOLLOW_13);
            rule__Attribute__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Attribute__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalSocialRequest.g:751:1: rule__Attribute__Group__4__Impl : ( ( rule__Attribute__ModifierAssignment_4 )? ) ;
    public final void rule__Attribute__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:755:1: ( ( ( rule__Attribute__ModifierAssignment_4 )? ) )
            // InternalSocialRequest.g:756:1: ( ( rule__Attribute__ModifierAssignment_4 )? )
            {
            // InternalSocialRequest.g:756:1: ( ( rule__Attribute__ModifierAssignment_4 )? )
            // InternalSocialRequest.g:757:2: ( rule__Attribute__ModifierAssignment_4 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getModifierAssignment_4()); 
            }
            // InternalSocialRequest.g:758:2: ( rule__Attribute__ModifierAssignment_4 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0>=22 && LA9_0<=23)) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalSocialRequest.g:758:3: rule__Attribute__ModifierAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__Attribute__ModifierAssignment_4();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeAccess().getModifierAssignment_4()); 
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
    // $ANTLR end "rule__Attribute__Group__4__Impl"


    // $ANTLR start "rule__Attribute__Group__5"
    // InternalSocialRequest.g:766:1: rule__Attribute__Group__5 : rule__Attribute__Group__5__Impl ;
    public final void rule__Attribute__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:770:1: ( rule__Attribute__Group__5__Impl )
            // InternalSocialRequest.g:771:2: rule__Attribute__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalSocialRequest.g:777:1: rule__Attribute__Group__5__Impl : ( ( rule__Attribute__Group_5__0 )? ) ;
    public final void rule__Attribute__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:781:1: ( ( ( rule__Attribute__Group_5__0 )? ) )
            // InternalSocialRequest.g:782:1: ( ( rule__Attribute__Group_5__0 )? )
            {
            // InternalSocialRequest.g:782:1: ( ( rule__Attribute__Group_5__0 )? )
            // InternalSocialRequest.g:783:2: ( rule__Attribute__Group_5__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getGroup_5()); 
            }
            // InternalSocialRequest.g:784:2: ( rule__Attribute__Group_5__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==18) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalSocialRequest.g:784:3: rule__Attribute__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Attribute__Group_5__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeAccess().getGroup_5()); 
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
    // $ANTLR end "rule__Attribute__Group__5__Impl"


    // $ANTLR start "rule__Attribute__Group_5__0"
    // InternalSocialRequest.g:793:1: rule__Attribute__Group_5__0 : rule__Attribute__Group_5__0__Impl rule__Attribute__Group_5__1 ;
    public final void rule__Attribute__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:797:1: ( rule__Attribute__Group_5__0__Impl rule__Attribute__Group_5__1 )
            // InternalSocialRequest.g:798:2: rule__Attribute__Group_5__0__Impl rule__Attribute__Group_5__1
            {
            pushFollow(FOLLOW_14);
            rule__Attribute__Group_5__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Attribute__Group_5__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalSocialRequest.g:805:1: rule__Attribute__Group_5__0__Impl : ( '{' ) ;
    public final void rule__Attribute__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:809:1: ( ( '{' ) )
            // InternalSocialRequest.g:810:1: ( '{' )
            {
            // InternalSocialRequest.g:810:1: ( '{' )
            // InternalSocialRequest.g:811:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getLeftCurlyBracketKeyword_5_0()); 
            }
            match(input,18,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeAccess().getLeftCurlyBracketKeyword_5_0()); 
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
    // $ANTLR end "rule__Attribute__Group_5__0__Impl"


    // $ANTLR start "rule__Attribute__Group_5__1"
    // InternalSocialRequest.g:820:1: rule__Attribute__Group_5__1 : rule__Attribute__Group_5__1__Impl rule__Attribute__Group_5__2 ;
    public final void rule__Attribute__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:824:1: ( rule__Attribute__Group_5__1__Impl rule__Attribute__Group_5__2 )
            // InternalSocialRequest.g:825:2: rule__Attribute__Group_5__1__Impl rule__Attribute__Group_5__2
            {
            pushFollow(FOLLOW_9);
            rule__Attribute__Group_5__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Attribute__Group_5__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalSocialRequest.g:832:1: rule__Attribute__Group_5__1__Impl : ( ( rule__Attribute__UnorderedGroup_5_1 ) ) ;
    public final void rule__Attribute__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:836:1: ( ( ( rule__Attribute__UnorderedGroup_5_1 ) ) )
            // InternalSocialRequest.g:837:1: ( ( rule__Attribute__UnorderedGroup_5_1 ) )
            {
            // InternalSocialRequest.g:837:1: ( ( rule__Attribute__UnorderedGroup_5_1 ) )
            // InternalSocialRequest.g:838:2: ( rule__Attribute__UnorderedGroup_5_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getUnorderedGroup_5_1()); 
            }
            // InternalSocialRequest.g:839:2: ( rule__Attribute__UnorderedGroup_5_1 )
            // InternalSocialRequest.g:839:3: rule__Attribute__UnorderedGroup_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__UnorderedGroup_5_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeAccess().getUnorderedGroup_5_1()); 
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
    // $ANTLR end "rule__Attribute__Group_5__1__Impl"


    // $ANTLR start "rule__Attribute__Group_5__2"
    // InternalSocialRequest.g:847:1: rule__Attribute__Group_5__2 : rule__Attribute__Group_5__2__Impl ;
    public final void rule__Attribute__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:851:1: ( rule__Attribute__Group_5__2__Impl )
            // InternalSocialRequest.g:852:2: rule__Attribute__Group_5__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__Group_5__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalSocialRequest.g:858:1: rule__Attribute__Group_5__2__Impl : ( '}' ) ;
    public final void rule__Attribute__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:862:1: ( ( '}' ) )
            // InternalSocialRequest.g:863:1: ( '}' )
            {
            // InternalSocialRequest.g:863:1: ( '}' )
            // InternalSocialRequest.g:864:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getRightCurlyBracketKeyword_5_2()); 
            }
            match(input,19,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeAccess().getRightCurlyBracketKeyword_5_2()); 
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
    // $ANTLR end "rule__Attribute__Group_5__2__Impl"


    // $ANTLR start "rule__Attribute__Group_5_1_1__0"
    // InternalSocialRequest.g:874:1: rule__Attribute__Group_5_1_1__0 : rule__Attribute__Group_5_1_1__0__Impl rule__Attribute__Group_5_1_1__1 ;
    public final void rule__Attribute__Group_5_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:878:1: ( rule__Attribute__Group_5_1_1__0__Impl rule__Attribute__Group_5_1_1__1 )
            // InternalSocialRequest.g:879:2: rule__Attribute__Group_5_1_1__0__Impl rule__Attribute__Group_5_1_1__1
            {
            pushFollow(FOLLOW_15);
            rule__Attribute__Group_5_1_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Attribute__Group_5_1_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalSocialRequest.g:886:1: rule__Attribute__Group_5_1_1__0__Impl : ( 'validations {' ) ;
    public final void rule__Attribute__Group_5_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:890:1: ( ( 'validations {' ) )
            // InternalSocialRequest.g:891:1: ( 'validations {' )
            {
            // InternalSocialRequest.g:891:1: ( 'validations {' )
            // InternalSocialRequest.g:892:2: 'validations {'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getValidationsKeyword_5_1_1_0()); 
            }
            match(input,21,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeAccess().getValidationsKeyword_5_1_1_0()); 
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
    // $ANTLR end "rule__Attribute__Group_5_1_1__0__Impl"


    // $ANTLR start "rule__Attribute__Group_5_1_1__1"
    // InternalSocialRequest.g:901:1: rule__Attribute__Group_5_1_1__1 : rule__Attribute__Group_5_1_1__1__Impl rule__Attribute__Group_5_1_1__2 ;
    public final void rule__Attribute__Group_5_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:905:1: ( rule__Attribute__Group_5_1_1__1__Impl rule__Attribute__Group_5_1_1__2 )
            // InternalSocialRequest.g:906:2: rule__Attribute__Group_5_1_1__1__Impl rule__Attribute__Group_5_1_1__2
            {
            pushFollow(FOLLOW_9);
            rule__Attribute__Group_5_1_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Attribute__Group_5_1_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalSocialRequest.g:913:1: rule__Attribute__Group_5_1_1__1__Impl : ( ( ( rule__Attribute__ValidationsAssignment_5_1_1_1 ) ) ( ( rule__Attribute__ValidationsAssignment_5_1_1_1 )* ) ) ;
    public final void rule__Attribute__Group_5_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:917:1: ( ( ( ( rule__Attribute__ValidationsAssignment_5_1_1_1 ) ) ( ( rule__Attribute__ValidationsAssignment_5_1_1_1 )* ) ) )
            // InternalSocialRequest.g:918:1: ( ( ( rule__Attribute__ValidationsAssignment_5_1_1_1 ) ) ( ( rule__Attribute__ValidationsAssignment_5_1_1_1 )* ) )
            {
            // InternalSocialRequest.g:918:1: ( ( ( rule__Attribute__ValidationsAssignment_5_1_1_1 ) ) ( ( rule__Attribute__ValidationsAssignment_5_1_1_1 )* ) )
            // InternalSocialRequest.g:919:2: ( ( rule__Attribute__ValidationsAssignment_5_1_1_1 ) ) ( ( rule__Attribute__ValidationsAssignment_5_1_1_1 )* )
            {
            // InternalSocialRequest.g:919:2: ( ( rule__Attribute__ValidationsAssignment_5_1_1_1 ) )
            // InternalSocialRequest.g:920:3: ( rule__Attribute__ValidationsAssignment_5_1_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getValidationsAssignment_5_1_1_1()); 
            }
            // InternalSocialRequest.g:921:3: ( rule__Attribute__ValidationsAssignment_5_1_1_1 )
            // InternalSocialRequest.g:921:4: rule__Attribute__ValidationsAssignment_5_1_1_1
            {
            pushFollow(FOLLOW_16);
            rule__Attribute__ValidationsAssignment_5_1_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeAccess().getValidationsAssignment_5_1_1_1()); 
            }

            }

            // InternalSocialRequest.g:924:2: ( ( rule__Attribute__ValidationsAssignment_5_1_1_1 )* )
            // InternalSocialRequest.g:925:3: ( rule__Attribute__ValidationsAssignment_5_1_1_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getValidationsAssignment_5_1_1_1()); 
            }
            // InternalSocialRequest.g:926:3: ( rule__Attribute__ValidationsAssignment_5_1_1_1 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=26 && LA11_0<=30)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalSocialRequest.g:926:4: rule__Attribute__ValidationsAssignment_5_1_1_1
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__Attribute__ValidationsAssignment_5_1_1_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeAccess().getValidationsAssignment_5_1_1_1()); 
            }

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
    // $ANTLR end "rule__Attribute__Group_5_1_1__1__Impl"


    // $ANTLR start "rule__Attribute__Group_5_1_1__2"
    // InternalSocialRequest.g:935:1: rule__Attribute__Group_5_1_1__2 : rule__Attribute__Group_5_1_1__2__Impl ;
    public final void rule__Attribute__Group_5_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:939:1: ( rule__Attribute__Group_5_1_1__2__Impl )
            // InternalSocialRequest.g:940:2: rule__Attribute__Group_5_1_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__Group_5_1_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_5_1_1__2"


    // $ANTLR start "rule__Attribute__Group_5_1_1__2__Impl"
    // InternalSocialRequest.g:946:1: rule__Attribute__Group_5_1_1__2__Impl : ( '}' ) ;
    public final void rule__Attribute__Group_5_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:950:1: ( ( '}' ) )
            // InternalSocialRequest.g:951:1: ( '}' )
            {
            // InternalSocialRequest.g:951:1: ( '}' )
            // InternalSocialRequest.g:952:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getRightCurlyBracketKeyword_5_1_1_2()); 
            }
            match(input,19,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeAccess().getRightCurlyBracketKeyword_5_1_1_2()); 
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
    // $ANTLR end "rule__Attribute__Group_5_1_1__2__Impl"


    // $ANTLR start "rule__Modifier__Group_0__0"
    // InternalSocialRequest.g:962:1: rule__Modifier__Group_0__0 : rule__Modifier__Group_0__0__Impl rule__Modifier__Group_0__1 ;
    public final void rule__Modifier__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:966:1: ( rule__Modifier__Group_0__0__Impl rule__Modifier__Group_0__1 )
            // InternalSocialRequest.g:967:2: rule__Modifier__Group_0__0__Impl rule__Modifier__Group_0__1
            {
            pushFollow(FOLLOW_17);
            rule__Modifier__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Modifier__Group_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Modifier__Group_0__0"


    // $ANTLR start "rule__Modifier__Group_0__0__Impl"
    // InternalSocialRequest.g:974:1: rule__Modifier__Group_0__0__Impl : ( () ) ;
    public final void rule__Modifier__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:978:1: ( ( () ) )
            // InternalSocialRequest.g:979:1: ( () )
            {
            // InternalSocialRequest.g:979:1: ( () )
            // InternalSocialRequest.g:980:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModifierAccess().getModifierAction_0_0()); 
            }
            // InternalSocialRequest.g:981:2: ()
            // InternalSocialRequest.g:981:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModifierAccess().getModifierAction_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Modifier__Group_0__0__Impl"


    // $ANTLR start "rule__Modifier__Group_0__1"
    // InternalSocialRequest.g:989:1: rule__Modifier__Group_0__1 : rule__Modifier__Group_0__1__Impl ;
    public final void rule__Modifier__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:993:1: ( rule__Modifier__Group_0__1__Impl )
            // InternalSocialRequest.g:994:2: rule__Modifier__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Modifier__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Modifier__Group_0__1"


    // $ANTLR start "rule__Modifier__Group_0__1__Impl"
    // InternalSocialRequest.g:1000:1: rule__Modifier__Group_0__1__Impl : ( 'LOB' ) ;
    public final void rule__Modifier__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1004:1: ( ( 'LOB' ) )
            // InternalSocialRequest.g:1005:1: ( 'LOB' )
            {
            // InternalSocialRequest.g:1005:1: ( 'LOB' )
            // InternalSocialRequest.g:1006:2: 'LOB'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModifierAccess().getLOBKeyword_0_1()); 
            }
            match(input,22,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModifierAccess().getLOBKeyword_0_1()); 
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
    // $ANTLR end "rule__Modifier__Group_0__1__Impl"


    // $ANTLR start "rule__Identification__Group__0"
    // InternalSocialRequest.g:1016:1: rule__Identification__Group__0 : rule__Identification__Group__0__Impl rule__Identification__Group__1 ;
    public final void rule__Identification__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1020:1: ( rule__Identification__Group__0__Impl rule__Identification__Group__1 )
            // InternalSocialRequest.g:1021:2: rule__Identification__Group__0__Impl rule__Identification__Group__1
            {
            pushFollow(FOLLOW_18);
            rule__Identification__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Identification__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Identification__Group__0"


    // $ANTLR start "rule__Identification__Group__0__Impl"
    // InternalSocialRequest.g:1028:1: rule__Identification__Group__0__Impl : ( () ) ;
    public final void rule__Identification__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1032:1: ( ( () ) )
            // InternalSocialRequest.g:1033:1: ( () )
            {
            // InternalSocialRequest.g:1033:1: ( () )
            // InternalSocialRequest.g:1034:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIdentificationAccess().getIdentificationAction_0()); 
            }
            // InternalSocialRequest.g:1035:2: ()
            // InternalSocialRequest.g:1035:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIdentificationAccess().getIdentificationAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Identification__Group__0__Impl"


    // $ANTLR start "rule__Identification__Group__1"
    // InternalSocialRequest.g:1043:1: rule__Identification__Group__1 : rule__Identification__Group__1__Impl rule__Identification__Group__2 ;
    public final void rule__Identification__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1047:1: ( rule__Identification__Group__1__Impl rule__Identification__Group__2 )
            // InternalSocialRequest.g:1048:2: rule__Identification__Group__1__Impl rule__Identification__Group__2
            {
            pushFollow(FOLLOW_19);
            rule__Identification__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Identification__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Identification__Group__1"


    // $ANTLR start "rule__Identification__Group__1__Impl"
    // InternalSocialRequest.g:1055:1: rule__Identification__Group__1__Impl : ( 'ID' ) ;
    public final void rule__Identification__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1059:1: ( ( 'ID' ) )
            // InternalSocialRequest.g:1060:1: ( 'ID' )
            {
            // InternalSocialRequest.g:1060:1: ( 'ID' )
            // InternalSocialRequest.g:1061:2: 'ID'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIdentificationAccess().getIDKeyword_1()); 
            }
            match(input,23,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIdentificationAccess().getIDKeyword_1()); 
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
    // $ANTLR end "rule__Identification__Group__1__Impl"


    // $ANTLR start "rule__Identification__Group__2"
    // InternalSocialRequest.g:1070:1: rule__Identification__Group__2 : rule__Identification__Group__2__Impl ;
    public final void rule__Identification__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1074:1: ( rule__Identification__Group__2__Impl )
            // InternalSocialRequest.g:1075:2: rule__Identification__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Identification__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Identification__Group__2"


    // $ANTLR start "rule__Identification__Group__2__Impl"
    // InternalSocialRequest.g:1081:1: rule__Identification__Group__2__Impl : ( ( rule__Identification__Group_2__0 )? ) ;
    public final void rule__Identification__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1085:1: ( ( ( rule__Identification__Group_2__0 )? ) )
            // InternalSocialRequest.g:1086:1: ( ( rule__Identification__Group_2__0 )? )
            {
            // InternalSocialRequest.g:1086:1: ( ( rule__Identification__Group_2__0 )? )
            // InternalSocialRequest.g:1087:2: ( rule__Identification__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIdentificationAccess().getGroup_2()); 
            }
            // InternalSocialRequest.g:1088:2: ( rule__Identification__Group_2__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==24) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalSocialRequest.g:1088:3: rule__Identification__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Identification__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIdentificationAccess().getGroup_2()); 
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
    // $ANTLR end "rule__Identification__Group__2__Impl"


    // $ANTLR start "rule__Identification__Group_2__0"
    // InternalSocialRequest.g:1097:1: rule__Identification__Group_2__0 : rule__Identification__Group_2__0__Impl rule__Identification__Group_2__1 ;
    public final void rule__Identification__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1101:1: ( rule__Identification__Group_2__0__Impl rule__Identification__Group_2__1 )
            // InternalSocialRequest.g:1102:2: rule__Identification__Group_2__0__Impl rule__Identification__Group_2__1
            {
            pushFollow(FOLLOW_20);
            rule__Identification__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Identification__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Identification__Group_2__0"


    // $ANTLR start "rule__Identification__Group_2__0__Impl"
    // InternalSocialRequest.g:1109:1: rule__Identification__Group_2__0__Impl : ( '(' ) ;
    public final void rule__Identification__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1113:1: ( ( '(' ) )
            // InternalSocialRequest.g:1114:1: ( '(' )
            {
            // InternalSocialRequest.g:1114:1: ( '(' )
            // InternalSocialRequest.g:1115:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIdentificationAccess().getLeftParenthesisKeyword_2_0()); 
            }
            match(input,24,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIdentificationAccess().getLeftParenthesisKeyword_2_0()); 
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
    // $ANTLR end "rule__Identification__Group_2__0__Impl"


    // $ANTLR start "rule__Identification__Group_2__1"
    // InternalSocialRequest.g:1124:1: rule__Identification__Group_2__1 : rule__Identification__Group_2__1__Impl rule__Identification__Group_2__2 ;
    public final void rule__Identification__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1128:1: ( rule__Identification__Group_2__1__Impl rule__Identification__Group_2__2 )
            // InternalSocialRequest.g:1129:2: rule__Identification__Group_2__1__Impl rule__Identification__Group_2__2
            {
            pushFollow(FOLLOW_21);
            rule__Identification__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Identification__Group_2__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Identification__Group_2__1"


    // $ANTLR start "rule__Identification__Group_2__1__Impl"
    // InternalSocialRequest.g:1136:1: rule__Identification__Group_2__1__Impl : ( ( rule__Identification__GenerationTypeAssignment_2_1 ) ) ;
    public final void rule__Identification__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1140:1: ( ( ( rule__Identification__GenerationTypeAssignment_2_1 ) ) )
            // InternalSocialRequest.g:1141:1: ( ( rule__Identification__GenerationTypeAssignment_2_1 ) )
            {
            // InternalSocialRequest.g:1141:1: ( ( rule__Identification__GenerationTypeAssignment_2_1 ) )
            // InternalSocialRequest.g:1142:2: ( rule__Identification__GenerationTypeAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIdentificationAccess().getGenerationTypeAssignment_2_1()); 
            }
            // InternalSocialRequest.g:1143:2: ( rule__Identification__GenerationTypeAssignment_2_1 )
            // InternalSocialRequest.g:1143:3: rule__Identification__GenerationTypeAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Identification__GenerationTypeAssignment_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIdentificationAccess().getGenerationTypeAssignment_2_1()); 
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
    // $ANTLR end "rule__Identification__Group_2__1__Impl"


    // $ANTLR start "rule__Identification__Group_2__2"
    // InternalSocialRequest.g:1151:1: rule__Identification__Group_2__2 : rule__Identification__Group_2__2__Impl ;
    public final void rule__Identification__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1155:1: ( rule__Identification__Group_2__2__Impl )
            // InternalSocialRequest.g:1156:2: rule__Identification__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Identification__Group_2__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Identification__Group_2__2"


    // $ANTLR start "rule__Identification__Group_2__2__Impl"
    // InternalSocialRequest.g:1162:1: rule__Identification__Group_2__2__Impl : ( ')' ) ;
    public final void rule__Identification__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1166:1: ( ( ')' ) )
            // InternalSocialRequest.g:1167:1: ( ')' )
            {
            // InternalSocialRequest.g:1167:1: ( ')' )
            // InternalSocialRequest.g:1168:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIdentificationAccess().getRightParenthesisKeyword_2_2()); 
            }
            match(input,25,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIdentificationAccess().getRightParenthesisKeyword_2_2()); 
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
    // $ANTLR end "rule__Identification__Group_2__2__Impl"


    // $ANTLR start "rule__Validation__Group_0__0"
    // InternalSocialRequest.g:1178:1: rule__Validation__Group_0__0 : rule__Validation__Group_0__0__Impl rule__Validation__Group_0__1 ;
    public final void rule__Validation__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1182:1: ( rule__Validation__Group_0__0__Impl rule__Validation__Group_0__1 )
            // InternalSocialRequest.g:1183:2: rule__Validation__Group_0__0__Impl rule__Validation__Group_0__1
            {
            pushFollow(FOLLOW_22);
            rule__Validation__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Validation__Group_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalSocialRequest.g:1190:1: rule__Validation__Group_0__0__Impl : ( 'min:' ) ;
    public final void rule__Validation__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1194:1: ( ( 'min:' ) )
            // InternalSocialRequest.g:1195:1: ( 'min:' )
            {
            // InternalSocialRequest.g:1195:1: ( 'min:' )
            // InternalSocialRequest.g:1196:2: 'min:'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValidationAccess().getMinKeyword_0_0()); 
            }
            match(input,26,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getValidationAccess().getMinKeyword_0_0()); 
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
    // $ANTLR end "rule__Validation__Group_0__0__Impl"


    // $ANTLR start "rule__Validation__Group_0__1"
    // InternalSocialRequest.g:1205:1: rule__Validation__Group_0__1 : rule__Validation__Group_0__1__Impl ;
    public final void rule__Validation__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1209:1: ( rule__Validation__Group_0__1__Impl )
            // InternalSocialRequest.g:1210:2: rule__Validation__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Validation__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalSocialRequest.g:1216:1: rule__Validation__Group_0__1__Impl : ( ( rule__Validation__MinAssignment_0_1 ) ) ;
    public final void rule__Validation__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1220:1: ( ( ( rule__Validation__MinAssignment_0_1 ) ) )
            // InternalSocialRequest.g:1221:1: ( ( rule__Validation__MinAssignment_0_1 ) )
            {
            // InternalSocialRequest.g:1221:1: ( ( rule__Validation__MinAssignment_0_1 ) )
            // InternalSocialRequest.g:1222:2: ( rule__Validation__MinAssignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValidationAccess().getMinAssignment_0_1()); 
            }
            // InternalSocialRequest.g:1223:2: ( rule__Validation__MinAssignment_0_1 )
            // InternalSocialRequest.g:1223:3: rule__Validation__MinAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Validation__MinAssignment_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getValidationAccess().getMinAssignment_0_1()); 
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
    // $ANTLR end "rule__Validation__Group_0__1__Impl"


    // $ANTLR start "rule__Validation__Group_1__0"
    // InternalSocialRequest.g:1232:1: rule__Validation__Group_1__0 : rule__Validation__Group_1__0__Impl rule__Validation__Group_1__1 ;
    public final void rule__Validation__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1236:1: ( rule__Validation__Group_1__0__Impl rule__Validation__Group_1__1 )
            // InternalSocialRequest.g:1237:2: rule__Validation__Group_1__0__Impl rule__Validation__Group_1__1
            {
            pushFollow(FOLLOW_22);
            rule__Validation__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Validation__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalSocialRequest.g:1244:1: rule__Validation__Group_1__0__Impl : ( 'max:' ) ;
    public final void rule__Validation__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1248:1: ( ( 'max:' ) )
            // InternalSocialRequest.g:1249:1: ( 'max:' )
            {
            // InternalSocialRequest.g:1249:1: ( 'max:' )
            // InternalSocialRequest.g:1250:2: 'max:'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValidationAccess().getMaxKeyword_1_0()); 
            }
            match(input,27,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getValidationAccess().getMaxKeyword_1_0()); 
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
    // $ANTLR end "rule__Validation__Group_1__0__Impl"


    // $ANTLR start "rule__Validation__Group_1__1"
    // InternalSocialRequest.g:1259:1: rule__Validation__Group_1__1 : rule__Validation__Group_1__1__Impl ;
    public final void rule__Validation__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1263:1: ( rule__Validation__Group_1__1__Impl )
            // InternalSocialRequest.g:1264:2: rule__Validation__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Validation__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalSocialRequest.g:1270:1: rule__Validation__Group_1__1__Impl : ( ( rule__Validation__MaxAssignment_1_1 ) ) ;
    public final void rule__Validation__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1274:1: ( ( ( rule__Validation__MaxAssignment_1_1 ) ) )
            // InternalSocialRequest.g:1275:1: ( ( rule__Validation__MaxAssignment_1_1 ) )
            {
            // InternalSocialRequest.g:1275:1: ( ( rule__Validation__MaxAssignment_1_1 ) )
            // InternalSocialRequest.g:1276:2: ( rule__Validation__MaxAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValidationAccess().getMaxAssignment_1_1()); 
            }
            // InternalSocialRequest.g:1277:2: ( rule__Validation__MaxAssignment_1_1 )
            // InternalSocialRequest.g:1277:3: rule__Validation__MaxAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Validation__MaxAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getValidationAccess().getMaxAssignment_1_1()); 
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
    // $ANTLR end "rule__Validation__Group_1__1__Impl"


    // $ANTLR start "rule__Validation__Group_2__0"
    // InternalSocialRequest.g:1286:1: rule__Validation__Group_2__0 : rule__Validation__Group_2__0__Impl rule__Validation__Group_2__1 ;
    public final void rule__Validation__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1290:1: ( rule__Validation__Group_2__0__Impl rule__Validation__Group_2__1 )
            // InternalSocialRequest.g:1291:2: rule__Validation__Group_2__0__Impl rule__Validation__Group_2__1
            {
            pushFollow(FOLLOW_23);
            rule__Validation__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Validation__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalSocialRequest.g:1298:1: rule__Validation__Group_2__0__Impl : ( 'pattern:' ) ;
    public final void rule__Validation__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1302:1: ( ( 'pattern:' ) )
            // InternalSocialRequest.g:1303:1: ( 'pattern:' )
            {
            // InternalSocialRequest.g:1303:1: ( 'pattern:' )
            // InternalSocialRequest.g:1304:2: 'pattern:'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValidationAccess().getPatternKeyword_2_0()); 
            }
            match(input,28,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getValidationAccess().getPatternKeyword_2_0()); 
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
    // $ANTLR end "rule__Validation__Group_2__0__Impl"


    // $ANTLR start "rule__Validation__Group_2__1"
    // InternalSocialRequest.g:1313:1: rule__Validation__Group_2__1 : rule__Validation__Group_2__1__Impl ;
    public final void rule__Validation__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1317:1: ( rule__Validation__Group_2__1__Impl )
            // InternalSocialRequest.g:1318:2: rule__Validation__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Validation__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalSocialRequest.g:1324:1: rule__Validation__Group_2__1__Impl : ( ( rule__Validation__RegexAssignment_2_1 ) ) ;
    public final void rule__Validation__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1328:1: ( ( ( rule__Validation__RegexAssignment_2_1 ) ) )
            // InternalSocialRequest.g:1329:1: ( ( rule__Validation__RegexAssignment_2_1 ) )
            {
            // InternalSocialRequest.g:1329:1: ( ( rule__Validation__RegexAssignment_2_1 ) )
            // InternalSocialRequest.g:1330:2: ( rule__Validation__RegexAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValidationAccess().getRegexAssignment_2_1()); 
            }
            // InternalSocialRequest.g:1331:2: ( rule__Validation__RegexAssignment_2_1 )
            // InternalSocialRequest.g:1331:3: rule__Validation__RegexAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Validation__RegexAssignment_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getValidationAccess().getRegexAssignment_2_1()); 
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
    // $ANTLR end "rule__Validation__Group_2__1__Impl"


    // $ANTLR start "rule__Validation__Group_3__0"
    // InternalSocialRequest.g:1340:1: rule__Validation__Group_3__0 : rule__Validation__Group_3__0__Impl rule__Validation__Group_3__1 ;
    public final void rule__Validation__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1344:1: ( rule__Validation__Group_3__0__Impl rule__Validation__Group_3__1 )
            // InternalSocialRequest.g:1345:2: rule__Validation__Group_3__0__Impl rule__Validation__Group_3__1
            {
            pushFollow(FOLLOW_24);
            rule__Validation__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Validation__Group_3__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Validation__Group_3__0"


    // $ANTLR start "rule__Validation__Group_3__0__Impl"
    // InternalSocialRequest.g:1352:1: rule__Validation__Group_3__0__Impl : ( () ) ;
    public final void rule__Validation__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1356:1: ( ( () ) )
            // InternalSocialRequest.g:1357:1: ( () )
            {
            // InternalSocialRequest.g:1357:1: ( () )
            // InternalSocialRequest.g:1358:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValidationAccess().getValidationAction_3_0()); 
            }
            // InternalSocialRequest.g:1359:2: ()
            // InternalSocialRequest.g:1359:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getValidationAccess().getValidationAction_3_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Validation__Group_3__0__Impl"


    // $ANTLR start "rule__Validation__Group_3__1"
    // InternalSocialRequest.g:1367:1: rule__Validation__Group_3__1 : rule__Validation__Group_3__1__Impl ;
    public final void rule__Validation__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1371:1: ( rule__Validation__Group_3__1__Impl )
            // InternalSocialRequest.g:1372:2: rule__Validation__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Validation__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Validation__Group_3__1"


    // $ANTLR start "rule__Validation__Group_3__1__Impl"
    // InternalSocialRequest.g:1378:1: rule__Validation__Group_3__1__Impl : ( 'not-null' ) ;
    public final void rule__Validation__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1382:1: ( ( 'not-null' ) )
            // InternalSocialRequest.g:1383:1: ( 'not-null' )
            {
            // InternalSocialRequest.g:1383:1: ( 'not-null' )
            // InternalSocialRequest.g:1384:2: 'not-null'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValidationAccess().getNotNullKeyword_3_1()); 
            }
            match(input,29,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getValidationAccess().getNotNullKeyword_3_1()); 
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
    // $ANTLR end "rule__Validation__Group_3__1__Impl"


    // $ANTLR start "rule__Validation__Group_4__0"
    // InternalSocialRequest.g:1394:1: rule__Validation__Group_4__0 : rule__Validation__Group_4__0__Impl rule__Validation__Group_4__1 ;
    public final void rule__Validation__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1398:1: ( rule__Validation__Group_4__0__Impl rule__Validation__Group_4__1 )
            // InternalSocialRequest.g:1399:2: rule__Validation__Group_4__0__Impl rule__Validation__Group_4__1
            {
            pushFollow(FOLLOW_15);
            rule__Validation__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Validation__Group_4__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Validation__Group_4__0"


    // $ANTLR start "rule__Validation__Group_4__0__Impl"
    // InternalSocialRequest.g:1406:1: rule__Validation__Group_4__0__Impl : ( () ) ;
    public final void rule__Validation__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1410:1: ( ( () ) )
            // InternalSocialRequest.g:1411:1: ( () )
            {
            // InternalSocialRequest.g:1411:1: ( () )
            // InternalSocialRequest.g:1412:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValidationAccess().getValidationAction_4_0()); 
            }
            // InternalSocialRequest.g:1413:2: ()
            // InternalSocialRequest.g:1413:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getValidationAccess().getValidationAction_4_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Validation__Group_4__0__Impl"


    // $ANTLR start "rule__Validation__Group_4__1"
    // InternalSocialRequest.g:1421:1: rule__Validation__Group_4__1 : rule__Validation__Group_4__1__Impl ;
    public final void rule__Validation__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1425:1: ( rule__Validation__Group_4__1__Impl )
            // InternalSocialRequest.g:1426:2: rule__Validation__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Validation__Group_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Validation__Group_4__1"


    // $ANTLR start "rule__Validation__Group_4__1__Impl"
    // InternalSocialRequest.g:1432:1: rule__Validation__Group_4__1__Impl : ( 'not-blank' ) ;
    public final void rule__Validation__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1436:1: ( ( 'not-blank' ) )
            // InternalSocialRequest.g:1437:1: ( 'not-blank' )
            {
            // InternalSocialRequest.g:1437:1: ( 'not-blank' )
            // InternalSocialRequest.g:1438:2: 'not-blank'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValidationAccess().getNotBlankKeyword_4_1()); 
            }
            match(input,30,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getValidationAccess().getNotBlankKeyword_4_1()); 
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
    // $ANTLR end "rule__Validation__Group_4__1__Impl"


    // $ANTLR start "rule__AssociationSpecification__Group_0__0"
    // InternalSocialRequest.g:1448:1: rule__AssociationSpecification__Group_0__0 : rule__AssociationSpecification__Group_0__0__Impl rule__AssociationSpecification__Group_0__1 ;
    public final void rule__AssociationSpecification__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1452:1: ( rule__AssociationSpecification__Group_0__0__Impl rule__AssociationSpecification__Group_0__1 )
            // InternalSocialRequest.g:1453:2: rule__AssociationSpecification__Group_0__0__Impl rule__AssociationSpecification__Group_0__1
            {
            pushFollow(FOLLOW_6);
            rule__AssociationSpecification__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AssociationSpecification__Group_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociationSpecification__Group_0__0"


    // $ANTLR start "rule__AssociationSpecification__Group_0__0__Impl"
    // InternalSocialRequest.g:1460:1: rule__AssociationSpecification__Group_0__0__Impl : ( 'mappedBy:' ) ;
    public final void rule__AssociationSpecification__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1464:1: ( ( 'mappedBy:' ) )
            // InternalSocialRequest.g:1465:1: ( 'mappedBy:' )
            {
            // InternalSocialRequest.g:1465:1: ( 'mappedBy:' )
            // InternalSocialRequest.g:1466:2: 'mappedBy:'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssociationSpecificationAccess().getMappedByKeyword_0_0()); 
            }
            match(input,31,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssociationSpecificationAccess().getMappedByKeyword_0_0()); 
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
    // $ANTLR end "rule__AssociationSpecification__Group_0__0__Impl"


    // $ANTLR start "rule__AssociationSpecification__Group_0__1"
    // InternalSocialRequest.g:1475:1: rule__AssociationSpecification__Group_0__1 : rule__AssociationSpecification__Group_0__1__Impl ;
    public final void rule__AssociationSpecification__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1479:1: ( rule__AssociationSpecification__Group_0__1__Impl )
            // InternalSocialRequest.g:1480:2: rule__AssociationSpecification__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AssociationSpecification__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociationSpecification__Group_0__1"


    // $ANTLR start "rule__AssociationSpecification__Group_0__1__Impl"
    // InternalSocialRequest.g:1486:1: rule__AssociationSpecification__Group_0__1__Impl : ( ( rule__AssociationSpecification__MappedByAssignment_0_1 ) ) ;
    public final void rule__AssociationSpecification__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1490:1: ( ( ( rule__AssociationSpecification__MappedByAssignment_0_1 ) ) )
            // InternalSocialRequest.g:1491:1: ( ( rule__AssociationSpecification__MappedByAssignment_0_1 ) )
            {
            // InternalSocialRequest.g:1491:1: ( ( rule__AssociationSpecification__MappedByAssignment_0_1 ) )
            // InternalSocialRequest.g:1492:2: ( rule__AssociationSpecification__MappedByAssignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssociationSpecificationAccess().getMappedByAssignment_0_1()); 
            }
            // InternalSocialRequest.g:1493:2: ( rule__AssociationSpecification__MappedByAssignment_0_1 )
            // InternalSocialRequest.g:1493:3: rule__AssociationSpecification__MappedByAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__AssociationSpecification__MappedByAssignment_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssociationSpecificationAccess().getMappedByAssignment_0_1()); 
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
    // $ANTLR end "rule__AssociationSpecification__Group_0__1__Impl"


    // $ANTLR start "rule__AssociationSpecification__Group_1__0"
    // InternalSocialRequest.g:1502:1: rule__AssociationSpecification__Group_1__0 : rule__AssociationSpecification__Group_1__0__Impl rule__AssociationSpecification__Group_1__1 ;
    public final void rule__AssociationSpecification__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1506:1: ( rule__AssociationSpecification__Group_1__0__Impl rule__AssociationSpecification__Group_1__1 )
            // InternalSocialRequest.g:1507:2: rule__AssociationSpecification__Group_1__0__Impl rule__AssociationSpecification__Group_1__1
            {
            pushFollow(FOLLOW_25);
            rule__AssociationSpecification__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AssociationSpecification__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociationSpecification__Group_1__0"


    // $ANTLR start "rule__AssociationSpecification__Group_1__0__Impl"
    // InternalSocialRequest.g:1514:1: rule__AssociationSpecification__Group_1__0__Impl : ( 'fetch:' ) ;
    public final void rule__AssociationSpecification__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1518:1: ( ( 'fetch:' ) )
            // InternalSocialRequest.g:1519:1: ( 'fetch:' )
            {
            // InternalSocialRequest.g:1519:1: ( 'fetch:' )
            // InternalSocialRequest.g:1520:2: 'fetch:'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssociationSpecificationAccess().getFetchKeyword_1_0()); 
            }
            match(input,32,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssociationSpecificationAccess().getFetchKeyword_1_0()); 
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
    // $ANTLR end "rule__AssociationSpecification__Group_1__0__Impl"


    // $ANTLR start "rule__AssociationSpecification__Group_1__1"
    // InternalSocialRequest.g:1529:1: rule__AssociationSpecification__Group_1__1 : rule__AssociationSpecification__Group_1__1__Impl ;
    public final void rule__AssociationSpecification__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1533:1: ( rule__AssociationSpecification__Group_1__1__Impl )
            // InternalSocialRequest.g:1534:2: rule__AssociationSpecification__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AssociationSpecification__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociationSpecification__Group_1__1"


    // $ANTLR start "rule__AssociationSpecification__Group_1__1__Impl"
    // InternalSocialRequest.g:1540:1: rule__AssociationSpecification__Group_1__1__Impl : ( ( rule__AssociationSpecification__FetchTypeAssignment_1_1 ) ) ;
    public final void rule__AssociationSpecification__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1544:1: ( ( ( rule__AssociationSpecification__FetchTypeAssignment_1_1 ) ) )
            // InternalSocialRequest.g:1545:1: ( ( rule__AssociationSpecification__FetchTypeAssignment_1_1 ) )
            {
            // InternalSocialRequest.g:1545:1: ( ( rule__AssociationSpecification__FetchTypeAssignment_1_1 ) )
            // InternalSocialRequest.g:1546:2: ( rule__AssociationSpecification__FetchTypeAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssociationSpecificationAccess().getFetchTypeAssignment_1_1()); 
            }
            // InternalSocialRequest.g:1547:2: ( rule__AssociationSpecification__FetchTypeAssignment_1_1 )
            // InternalSocialRequest.g:1547:3: rule__AssociationSpecification__FetchTypeAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__AssociationSpecification__FetchTypeAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssociationSpecificationAccess().getFetchTypeAssignment_1_1()); 
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
    // $ANTLR end "rule__AssociationSpecification__Group_1__1__Impl"


    // $ANTLR start "rule__Repository__Group__0"
    // InternalSocialRequest.g:1556:1: rule__Repository__Group__0 : rule__Repository__Group__0__Impl rule__Repository__Group__1 ;
    public final void rule__Repository__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1560:1: ( rule__Repository__Group__0__Impl rule__Repository__Group__1 )
            // InternalSocialRequest.g:1561:2: rule__Repository__Group__0__Impl rule__Repository__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Repository__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Repository__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalSocialRequest.g:1568:1: rule__Repository__Group__0__Impl : ( 'Repository' ) ;
    public final void rule__Repository__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1572:1: ( ( 'Repository' ) )
            // InternalSocialRequest.g:1573:1: ( 'Repository' )
            {
            // InternalSocialRequest.g:1573:1: ( 'Repository' )
            // InternalSocialRequest.g:1574:2: 'Repository'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRepositoryAccess().getRepositoryKeyword_0()); 
            }
            match(input,33,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRepositoryAccess().getRepositoryKeyword_0()); 
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
    // $ANTLR end "rule__Repository__Group__0__Impl"


    // $ANTLR start "rule__Repository__Group__1"
    // InternalSocialRequest.g:1583:1: rule__Repository__Group__1 : rule__Repository__Group__1__Impl rule__Repository__Group__2 ;
    public final void rule__Repository__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1587:1: ( rule__Repository__Group__1__Impl rule__Repository__Group__2 )
            // InternalSocialRequest.g:1588:2: rule__Repository__Group__1__Impl rule__Repository__Group__2
            {
            pushFollow(FOLLOW_26);
            rule__Repository__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Repository__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalSocialRequest.g:1595:1: rule__Repository__Group__1__Impl : ( ( rule__Repository__EntityAssignment_1 ) ) ;
    public final void rule__Repository__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1599:1: ( ( ( rule__Repository__EntityAssignment_1 ) ) )
            // InternalSocialRequest.g:1600:1: ( ( rule__Repository__EntityAssignment_1 ) )
            {
            // InternalSocialRequest.g:1600:1: ( ( rule__Repository__EntityAssignment_1 ) )
            // InternalSocialRequest.g:1601:2: ( rule__Repository__EntityAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRepositoryAccess().getEntityAssignment_1()); 
            }
            // InternalSocialRequest.g:1602:2: ( rule__Repository__EntityAssignment_1 )
            // InternalSocialRequest.g:1602:3: rule__Repository__EntityAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Repository__EntityAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRepositoryAccess().getEntityAssignment_1()); 
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
    // $ANTLR end "rule__Repository__Group__1__Impl"


    // $ANTLR start "rule__Repository__Group__2"
    // InternalSocialRequest.g:1610:1: rule__Repository__Group__2 : rule__Repository__Group__2__Impl rule__Repository__Group__3 ;
    public final void rule__Repository__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1614:1: ( rule__Repository__Group__2__Impl rule__Repository__Group__3 )
            // InternalSocialRequest.g:1615:2: rule__Repository__Group__2__Impl rule__Repository__Group__3
            {
            pushFollow(FOLLOW_27);
            rule__Repository__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Repository__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalSocialRequest.g:1622:1: rule__Repository__Group__2__Impl : ( '{' ) ;
    public final void rule__Repository__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1626:1: ( ( '{' ) )
            // InternalSocialRequest.g:1627:1: ( '{' )
            {
            // InternalSocialRequest.g:1627:1: ( '{' )
            // InternalSocialRequest.g:1628:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRepositoryAccess().getLeftCurlyBracketKeyword_2()); 
            }
            match(input,18,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRepositoryAccess().getLeftCurlyBracketKeyword_2()); 
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
    // $ANTLR end "rule__Repository__Group__2__Impl"


    // $ANTLR start "rule__Repository__Group__3"
    // InternalSocialRequest.g:1637:1: rule__Repository__Group__3 : rule__Repository__Group__3__Impl rule__Repository__Group__4 ;
    public final void rule__Repository__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1641:1: ( rule__Repository__Group__3__Impl rule__Repository__Group__4 )
            // InternalSocialRequest.g:1642:2: rule__Repository__Group__3__Impl rule__Repository__Group__4
            {
            pushFollow(FOLLOW_9);
            rule__Repository__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Repository__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalSocialRequest.g:1649:1: rule__Repository__Group__3__Impl : ( ( ( rule__Repository__QueriesAssignment_3 ) ) ( ( rule__Repository__QueriesAssignment_3 )* ) ) ;
    public final void rule__Repository__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1653:1: ( ( ( ( rule__Repository__QueriesAssignment_3 ) ) ( ( rule__Repository__QueriesAssignment_3 )* ) ) )
            // InternalSocialRequest.g:1654:1: ( ( ( rule__Repository__QueriesAssignment_3 ) ) ( ( rule__Repository__QueriesAssignment_3 )* ) )
            {
            // InternalSocialRequest.g:1654:1: ( ( ( rule__Repository__QueriesAssignment_3 ) ) ( ( rule__Repository__QueriesAssignment_3 )* ) )
            // InternalSocialRequest.g:1655:2: ( ( rule__Repository__QueriesAssignment_3 ) ) ( ( rule__Repository__QueriesAssignment_3 )* )
            {
            // InternalSocialRequest.g:1655:2: ( ( rule__Repository__QueriesAssignment_3 ) )
            // InternalSocialRequest.g:1656:3: ( rule__Repository__QueriesAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRepositoryAccess().getQueriesAssignment_3()); 
            }
            // InternalSocialRequest.g:1657:3: ( rule__Repository__QueriesAssignment_3 )
            // InternalSocialRequest.g:1657:4: rule__Repository__QueriesAssignment_3
            {
            pushFollow(FOLLOW_28);
            rule__Repository__QueriesAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRepositoryAccess().getQueriesAssignment_3()); 
            }

            }

            // InternalSocialRequest.g:1660:2: ( ( rule__Repository__QueriesAssignment_3 )* )
            // InternalSocialRequest.g:1661:3: ( rule__Repository__QueriesAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRepositoryAccess().getQueriesAssignment_3()); 
            }
            // InternalSocialRequest.g:1662:3: ( rule__Repository__QueriesAssignment_3 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==34) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalSocialRequest.g:1662:4: rule__Repository__QueriesAssignment_3
            	    {
            	    pushFollow(FOLLOW_28);
            	    rule__Repository__QueriesAssignment_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRepositoryAccess().getQueriesAssignment_3()); 
            }

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
    // InternalSocialRequest.g:1671:1: rule__Repository__Group__4 : rule__Repository__Group__4__Impl ;
    public final void rule__Repository__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1675:1: ( rule__Repository__Group__4__Impl )
            // InternalSocialRequest.g:1676:2: rule__Repository__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Repository__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalSocialRequest.g:1682:1: rule__Repository__Group__4__Impl : ( '}' ) ;
    public final void rule__Repository__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1686:1: ( ( '}' ) )
            // InternalSocialRequest.g:1687:1: ( '}' )
            {
            // InternalSocialRequest.g:1687:1: ( '}' )
            // InternalSocialRequest.g:1688:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRepositoryAccess().getRightCurlyBracketKeyword_4()); 
            }
            match(input,19,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRepositoryAccess().getRightCurlyBracketKeyword_4()); 
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
    // $ANTLR end "rule__Repository__Group__4__Impl"


    // $ANTLR start "rule__Query__Group__0"
    // InternalSocialRequest.g:1698:1: rule__Query__Group__0 : rule__Query__Group__0__Impl rule__Query__Group__1 ;
    public final void rule__Query__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1702:1: ( rule__Query__Group__0__Impl rule__Query__Group__1 )
            // InternalSocialRequest.g:1703:2: rule__Query__Group__0__Impl rule__Query__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Query__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Query__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalSocialRequest.g:1710:1: rule__Query__Group__0__Impl : ( 'query' ) ;
    public final void rule__Query__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1714:1: ( ( 'query' ) )
            // InternalSocialRequest.g:1715:1: ( 'query' )
            {
            // InternalSocialRequest.g:1715:1: ( 'query' )
            // InternalSocialRequest.g:1716:2: 'query'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQueryAccess().getQueryKeyword_0()); 
            }
            match(input,34,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQueryAccess().getQueryKeyword_0()); 
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
    // $ANTLR end "rule__Query__Group__0__Impl"


    // $ANTLR start "rule__Query__Group__1"
    // InternalSocialRequest.g:1725:1: rule__Query__Group__1 : rule__Query__Group__1__Impl rule__Query__Group__2 ;
    public final void rule__Query__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1729:1: ( rule__Query__Group__1__Impl rule__Query__Group__2 )
            // InternalSocialRequest.g:1730:2: rule__Query__Group__1__Impl rule__Query__Group__2
            {
            pushFollow(FOLLOW_29);
            rule__Query__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Query__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalSocialRequest.g:1737:1: rule__Query__Group__1__Impl : ( ( rule__Query__NameAssignment_1 ) ) ;
    public final void rule__Query__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1741:1: ( ( ( rule__Query__NameAssignment_1 ) ) )
            // InternalSocialRequest.g:1742:1: ( ( rule__Query__NameAssignment_1 ) )
            {
            // InternalSocialRequest.g:1742:1: ( ( rule__Query__NameAssignment_1 ) )
            // InternalSocialRequest.g:1743:2: ( rule__Query__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQueryAccess().getNameAssignment_1()); 
            }
            // InternalSocialRequest.g:1744:2: ( rule__Query__NameAssignment_1 )
            // InternalSocialRequest.g:1744:3: rule__Query__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Query__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQueryAccess().getNameAssignment_1()); 
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
    // $ANTLR end "rule__Query__Group__1__Impl"


    // $ANTLR start "rule__Query__Group__2"
    // InternalSocialRequest.g:1752:1: rule__Query__Group__2 : rule__Query__Group__2__Impl rule__Query__Group__3 ;
    public final void rule__Query__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1756:1: ( rule__Query__Group__2__Impl rule__Query__Group__3 )
            // InternalSocialRequest.g:1757:2: rule__Query__Group__2__Impl rule__Query__Group__3
            {
            pushFollow(FOLLOW_29);
            rule__Query__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Query__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalSocialRequest.g:1764:1: rule__Query__Group__2__Impl : ( ( rule__Query__IsListAssignment_2 )? ) ;
    public final void rule__Query__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1768:1: ( ( ( rule__Query__IsListAssignment_2 )? ) )
            // InternalSocialRequest.g:1769:1: ( ( rule__Query__IsListAssignment_2 )? )
            {
            // InternalSocialRequest.g:1769:1: ( ( rule__Query__IsListAssignment_2 )? )
            // InternalSocialRequest.g:1770:2: ( rule__Query__IsListAssignment_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQueryAccess().getIsListAssignment_2()); 
            }
            // InternalSocialRequest.g:1771:2: ( rule__Query__IsListAssignment_2 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==37) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalSocialRequest.g:1771:3: rule__Query__IsListAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Query__IsListAssignment_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQueryAccess().getIsListAssignment_2()); 
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
    // $ANTLR end "rule__Query__Group__2__Impl"


    // $ANTLR start "rule__Query__Group__3"
    // InternalSocialRequest.g:1779:1: rule__Query__Group__3 : rule__Query__Group__3__Impl ;
    public final void rule__Query__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1783:1: ( rule__Query__Group__3__Impl )
            // InternalSocialRequest.g:1784:2: rule__Query__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Query__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalSocialRequest.g:1790:1: rule__Query__Group__3__Impl : ( ( rule__Query__Group_3__0 ) ) ;
    public final void rule__Query__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1794:1: ( ( ( rule__Query__Group_3__0 ) ) )
            // InternalSocialRequest.g:1795:1: ( ( rule__Query__Group_3__0 ) )
            {
            // InternalSocialRequest.g:1795:1: ( ( rule__Query__Group_3__0 ) )
            // InternalSocialRequest.g:1796:2: ( rule__Query__Group_3__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQueryAccess().getGroup_3()); 
            }
            // InternalSocialRequest.g:1797:2: ( rule__Query__Group_3__0 )
            // InternalSocialRequest.g:1797:3: rule__Query__Group_3__0
            {
            pushFollow(FOLLOW_2);
            rule__Query__Group_3__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQueryAccess().getGroup_3()); 
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
    // $ANTLR end "rule__Query__Group__3__Impl"


    // $ANTLR start "rule__Query__Group_3__0"
    // InternalSocialRequest.g:1806:1: rule__Query__Group_3__0 : rule__Query__Group_3__0__Impl rule__Query__Group_3__1 ;
    public final void rule__Query__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1810:1: ( rule__Query__Group_3__0__Impl rule__Query__Group_3__1 )
            // InternalSocialRequest.g:1811:2: rule__Query__Group_3__0__Impl rule__Query__Group_3__1
            {
            pushFollow(FOLLOW_30);
            rule__Query__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Query__Group_3__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalSocialRequest.g:1818:1: rule__Query__Group_3__0__Impl : ( '{' ) ;
    public final void rule__Query__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1822:1: ( ( '{' ) )
            // InternalSocialRequest.g:1823:1: ( '{' )
            {
            // InternalSocialRequest.g:1823:1: ( '{' )
            // InternalSocialRequest.g:1824:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQueryAccess().getLeftCurlyBracketKeyword_3_0()); 
            }
            match(input,18,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQueryAccess().getLeftCurlyBracketKeyword_3_0()); 
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
    // $ANTLR end "rule__Query__Group_3__0__Impl"


    // $ANTLR start "rule__Query__Group_3__1"
    // InternalSocialRequest.g:1833:1: rule__Query__Group_3__1 : rule__Query__Group_3__1__Impl rule__Query__Group_3__2 ;
    public final void rule__Query__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1837:1: ( rule__Query__Group_3__1__Impl rule__Query__Group_3__2 )
            // InternalSocialRequest.g:1838:2: rule__Query__Group_3__1__Impl rule__Query__Group_3__2
            {
            pushFollow(FOLLOW_30);
            rule__Query__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Query__Group_3__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalSocialRequest.g:1845:1: rule__Query__Group_3__1__Impl : ( ( rule__Query__ParamsAssignment_3_1 )* ) ;
    public final void rule__Query__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1849:1: ( ( ( rule__Query__ParamsAssignment_3_1 )* ) )
            // InternalSocialRequest.g:1850:1: ( ( rule__Query__ParamsAssignment_3_1 )* )
            {
            // InternalSocialRequest.g:1850:1: ( ( rule__Query__ParamsAssignment_3_1 )* )
            // InternalSocialRequest.g:1851:2: ( rule__Query__ParamsAssignment_3_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQueryAccess().getParamsAssignment_3_1()); 
            }
            // InternalSocialRequest.g:1852:2: ( rule__Query__ParamsAssignment_3_1 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==35) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalSocialRequest.g:1852:3: rule__Query__ParamsAssignment_3_1
            	    {
            	    pushFollow(FOLLOW_31);
            	    rule__Query__ParamsAssignment_3_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQueryAccess().getParamsAssignment_3_1()); 
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
    // $ANTLR end "rule__Query__Group_3__1__Impl"


    // $ANTLR start "rule__Query__Group_3__2"
    // InternalSocialRequest.g:1860:1: rule__Query__Group_3__2 : rule__Query__Group_3__2__Impl rule__Query__Group_3__3 ;
    public final void rule__Query__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1864:1: ( rule__Query__Group_3__2__Impl rule__Query__Group_3__3 )
            // InternalSocialRequest.g:1865:2: rule__Query__Group_3__2__Impl rule__Query__Group_3__3
            {
            pushFollow(FOLLOW_30);
            rule__Query__Group_3__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Query__Group_3__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalSocialRequest.g:1872:1: rule__Query__Group_3__2__Impl : ( ( rule__Query__SqlQueryAssignment_3_2 )? ) ;
    public final void rule__Query__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1876:1: ( ( ( rule__Query__SqlQueryAssignment_3_2 )? ) )
            // InternalSocialRequest.g:1877:1: ( ( rule__Query__SqlQueryAssignment_3_2 )? )
            {
            // InternalSocialRequest.g:1877:1: ( ( rule__Query__SqlQueryAssignment_3_2 )? )
            // InternalSocialRequest.g:1878:2: ( rule__Query__SqlQueryAssignment_3_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQueryAccess().getSqlQueryAssignment_3_2()); 
            }
            // InternalSocialRequest.g:1879:2: ( rule__Query__SqlQueryAssignment_3_2 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==16) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalSocialRequest.g:1879:3: rule__Query__SqlQueryAssignment_3_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Query__SqlQueryAssignment_3_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQueryAccess().getSqlQueryAssignment_3_2()); 
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
    // $ANTLR end "rule__Query__Group_3__2__Impl"


    // $ANTLR start "rule__Query__Group_3__3"
    // InternalSocialRequest.g:1887:1: rule__Query__Group_3__3 : rule__Query__Group_3__3__Impl ;
    public final void rule__Query__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1891:1: ( rule__Query__Group_3__3__Impl )
            // InternalSocialRequest.g:1892:2: rule__Query__Group_3__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Query__Group_3__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalSocialRequest.g:1898:1: rule__Query__Group_3__3__Impl : ( '}' ) ;
    public final void rule__Query__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1902:1: ( ( '}' ) )
            // InternalSocialRequest.g:1903:1: ( '}' )
            {
            // InternalSocialRequest.g:1903:1: ( '}' )
            // InternalSocialRequest.g:1904:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQueryAccess().getRightCurlyBracketKeyword_3_3()); 
            }
            match(input,19,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQueryAccess().getRightCurlyBracketKeyword_3_3()); 
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
    // $ANTLR end "rule__Query__Group_3__3__Impl"


    // $ANTLR start "rule__Param__Group__0"
    // InternalSocialRequest.g:1914:1: rule__Param__Group__0 : rule__Param__Group__0__Impl rule__Param__Group__1 ;
    public final void rule__Param__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1918:1: ( rule__Param__Group__0__Impl rule__Param__Group__1 )
            // InternalSocialRequest.g:1919:2: rule__Param__Group__0__Impl rule__Param__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Param__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Param__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalSocialRequest.g:1926:1: rule__Param__Group__0__Impl : ( 'param' ) ;
    public final void rule__Param__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1930:1: ( ( 'param' ) )
            // InternalSocialRequest.g:1931:1: ( 'param' )
            {
            // InternalSocialRequest.g:1931:1: ( 'param' )
            // InternalSocialRequest.g:1932:2: 'param'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParamAccess().getParamKeyword_0()); 
            }
            match(input,35,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParamAccess().getParamKeyword_0()); 
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
    // $ANTLR end "rule__Param__Group__0__Impl"


    // $ANTLR start "rule__Param__Group__1"
    // InternalSocialRequest.g:1941:1: rule__Param__Group__1 : rule__Param__Group__1__Impl rule__Param__Group__2 ;
    public final void rule__Param__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1945:1: ( rule__Param__Group__1__Impl rule__Param__Group__2 )
            // InternalSocialRequest.g:1946:2: rule__Param__Group__1__Impl rule__Param__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__Param__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Param__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalSocialRequest.g:1953:1: rule__Param__Group__1__Impl : ( ( rule__Param__NameAssignment_1 ) ) ;
    public final void rule__Param__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1957:1: ( ( ( rule__Param__NameAssignment_1 ) ) )
            // InternalSocialRequest.g:1958:1: ( ( rule__Param__NameAssignment_1 ) )
            {
            // InternalSocialRequest.g:1958:1: ( ( rule__Param__NameAssignment_1 ) )
            // InternalSocialRequest.g:1959:2: ( rule__Param__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParamAccess().getNameAssignment_1()); 
            }
            // InternalSocialRequest.g:1960:2: ( rule__Param__NameAssignment_1 )
            // InternalSocialRequest.g:1960:3: rule__Param__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Param__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParamAccess().getNameAssignment_1()); 
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
    // $ANTLR end "rule__Param__Group__1__Impl"


    // $ANTLR start "rule__Param__Group__2"
    // InternalSocialRequest.g:1968:1: rule__Param__Group__2 : rule__Param__Group__2__Impl rule__Param__Group__3 ;
    public final void rule__Param__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1972:1: ( rule__Param__Group__2__Impl rule__Param__Group__3 )
            // InternalSocialRequest.g:1973:2: rule__Param__Group__2__Impl rule__Param__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__Param__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Param__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalSocialRequest.g:1980:1: rule__Param__Group__2__Impl : ( ':' ) ;
    public final void rule__Param__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1984:1: ( ( ':' ) )
            // InternalSocialRequest.g:1985:1: ( ':' )
            {
            // InternalSocialRequest.g:1985:1: ( ':' )
            // InternalSocialRequest.g:1986:2: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParamAccess().getColonKeyword_2()); 
            }
            match(input,20,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParamAccess().getColonKeyword_2()); 
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
    // $ANTLR end "rule__Param__Group__2__Impl"


    // $ANTLR start "rule__Param__Group__3"
    // InternalSocialRequest.g:1995:1: rule__Param__Group__3 : rule__Param__Group__3__Impl ;
    public final void rule__Param__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1999:1: ( rule__Param__Group__3__Impl )
            // InternalSocialRequest.g:2000:2: rule__Param__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Param__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Param__Group__3"


    // $ANTLR start "rule__Param__Group__3__Impl"
    // InternalSocialRequest.g:2006:1: rule__Param__Group__3__Impl : ( ( rule__Param__TypeAssignment_3 ) ) ;
    public final void rule__Param__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2010:1: ( ( ( rule__Param__TypeAssignment_3 ) ) )
            // InternalSocialRequest.g:2011:1: ( ( rule__Param__TypeAssignment_3 ) )
            {
            // InternalSocialRequest.g:2011:1: ( ( rule__Param__TypeAssignment_3 ) )
            // InternalSocialRequest.g:2012:2: ( rule__Param__TypeAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParamAccess().getTypeAssignment_3()); 
            }
            // InternalSocialRequest.g:2013:2: ( rule__Param__TypeAssignment_3 )
            // InternalSocialRequest.g:2013:3: rule__Param__TypeAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Param__TypeAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParamAccess().getTypeAssignment_3()); 
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
    // $ANTLR end "rule__Param__Group__3__Impl"


    // $ANTLR start "rule__Attribute__UnorderedGroup_5_1"
    // InternalSocialRequest.g:2022:1: rule__Attribute__UnorderedGroup_5_1 : ( rule__Attribute__UnorderedGroup_5_1__0 )? ;
    public final void rule__Attribute__UnorderedGroup_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getAttributeAccess().getUnorderedGroup_5_1());
        	
        try {
            // InternalSocialRequest.g:2027:1: ( ( rule__Attribute__UnorderedGroup_5_1__0 )? )
            // InternalSocialRequest.g:2028:2: ( rule__Attribute__UnorderedGroup_5_1__0 )?
            {
            // InternalSocialRequest.g:2028:2: ( rule__Attribute__UnorderedGroup_5_1__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( LA17_0 >= 31 && LA17_0 <= 32 && getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_1(), 0) ) {
                alt17=1;
            }
            else if ( LA17_0 == 21 && getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_1(), 1) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalSocialRequest.g:2028:2: rule__Attribute__UnorderedGroup_5_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Attribute__UnorderedGroup_5_1__0();

                    state._fsp--;
                    if (state.failed) return ;

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
    // InternalSocialRequest.g:2036:1: rule__Attribute__UnorderedGroup_5_1__Impl : ( ({...}? => ( ( ( ( rule__Attribute__AssociationSpecificationsAssignment_5_1_0 ) ) ( ( ( rule__Attribute__AssociationSpecificationsAssignment_5_1_0 )=> rule__Attribute__AssociationSpecificationsAssignment_5_1_0 )* ) ) ) ) | ({...}? => ( ( ( rule__Attribute__Group_5_1_1__0 ) ) ) ) ) ;
    public final void rule__Attribute__UnorderedGroup_5_1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
        	
        try {
            // InternalSocialRequest.g:2041:1: ( ( ({...}? => ( ( ( ( rule__Attribute__AssociationSpecificationsAssignment_5_1_0 ) ) ( ( ( rule__Attribute__AssociationSpecificationsAssignment_5_1_0 )=> rule__Attribute__AssociationSpecificationsAssignment_5_1_0 )* ) ) ) ) | ({...}? => ( ( ( rule__Attribute__Group_5_1_1__0 ) ) ) ) ) )
            // InternalSocialRequest.g:2042:3: ( ({...}? => ( ( ( ( rule__Attribute__AssociationSpecificationsAssignment_5_1_0 ) ) ( ( ( rule__Attribute__AssociationSpecificationsAssignment_5_1_0 )=> rule__Attribute__AssociationSpecificationsAssignment_5_1_0 )* ) ) ) ) | ({...}? => ( ( ( rule__Attribute__Group_5_1_1__0 ) ) ) ) )
            {
            // InternalSocialRequest.g:2042:3: ( ({...}? => ( ( ( ( rule__Attribute__AssociationSpecificationsAssignment_5_1_0 ) ) ( ( ( rule__Attribute__AssociationSpecificationsAssignment_5_1_0 )=> rule__Attribute__AssociationSpecificationsAssignment_5_1_0 )* ) ) ) ) | ({...}? => ( ( ( rule__Attribute__Group_5_1_1__0 ) ) ) ) )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( LA19_0 >= 31 && LA19_0 <= 32 && getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_1(), 0) ) {
                alt19=1;
            }
            else if ( LA19_0 == 21 && getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_1(), 1) ) {
                alt19=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // InternalSocialRequest.g:2043:3: ({...}? => ( ( ( ( rule__Attribute__AssociationSpecificationsAssignment_5_1_0 ) ) ( ( ( rule__Attribute__AssociationSpecificationsAssignment_5_1_0 )=> rule__Attribute__AssociationSpecificationsAssignment_5_1_0 )* ) ) ) )
                    {
                    // InternalSocialRequest.g:2043:3: ({...}? => ( ( ( ( rule__Attribute__AssociationSpecificationsAssignment_5_1_0 ) ) ( ( ( rule__Attribute__AssociationSpecificationsAssignment_5_1_0 )=> rule__Attribute__AssociationSpecificationsAssignment_5_1_0 )* ) ) ) )
                    // InternalSocialRequest.g:2044:4: {...}? => ( ( ( ( rule__Attribute__AssociationSpecificationsAssignment_5_1_0 ) ) ( ( ( rule__Attribute__AssociationSpecificationsAssignment_5_1_0 )=> rule__Attribute__AssociationSpecificationsAssignment_5_1_0 )* ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_1(), 0) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__Attribute__UnorderedGroup_5_1__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_1(), 0)");
                    }
                    // InternalSocialRequest.g:2044:107: ( ( ( ( rule__Attribute__AssociationSpecificationsAssignment_5_1_0 ) ) ( ( ( rule__Attribute__AssociationSpecificationsAssignment_5_1_0 )=> rule__Attribute__AssociationSpecificationsAssignment_5_1_0 )* ) ) )
                    // InternalSocialRequest.g:2045:5: ( ( ( rule__Attribute__AssociationSpecificationsAssignment_5_1_0 ) ) ( ( ( rule__Attribute__AssociationSpecificationsAssignment_5_1_0 )=> rule__Attribute__AssociationSpecificationsAssignment_5_1_0 )* ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getAttributeAccess().getUnorderedGroup_5_1(), 0);
                    selected = true;
                    // InternalSocialRequest.g:2051:5: ( ( ( rule__Attribute__AssociationSpecificationsAssignment_5_1_0 ) ) ( ( ( rule__Attribute__AssociationSpecificationsAssignment_5_1_0 )=> rule__Attribute__AssociationSpecificationsAssignment_5_1_0 )* ) )
                    // InternalSocialRequest.g:2052:6: ( ( rule__Attribute__AssociationSpecificationsAssignment_5_1_0 ) ) ( ( ( rule__Attribute__AssociationSpecificationsAssignment_5_1_0 )=> rule__Attribute__AssociationSpecificationsAssignment_5_1_0 )* )
                    {
                    // InternalSocialRequest.g:2052:6: ( ( rule__Attribute__AssociationSpecificationsAssignment_5_1_0 ) )
                    // InternalSocialRequest.g:2053:7: ( rule__Attribute__AssociationSpecificationsAssignment_5_1_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAttributeAccess().getAssociationSpecificationsAssignment_5_1_0()); 
                    }
                    // InternalSocialRequest.g:2054:7: ( rule__Attribute__AssociationSpecificationsAssignment_5_1_0 )
                    // InternalSocialRequest.g:2054:8: rule__Attribute__AssociationSpecificationsAssignment_5_1_0
                    {
                    pushFollow(FOLLOW_32);
                    rule__Attribute__AssociationSpecificationsAssignment_5_1_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAttributeAccess().getAssociationSpecificationsAssignment_5_1_0()); 
                    }

                    }

                    // InternalSocialRequest.g:2057:6: ( ( ( rule__Attribute__AssociationSpecificationsAssignment_5_1_0 )=> rule__Attribute__AssociationSpecificationsAssignment_5_1_0 )* )
                    // InternalSocialRequest.g:2058:7: ( ( rule__Attribute__AssociationSpecificationsAssignment_5_1_0 )=> rule__Attribute__AssociationSpecificationsAssignment_5_1_0 )*
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAttributeAccess().getAssociationSpecificationsAssignment_5_1_0()); 
                    }
                    // InternalSocialRequest.g:2059:7: ( ( rule__Attribute__AssociationSpecificationsAssignment_5_1_0 )=> rule__Attribute__AssociationSpecificationsAssignment_5_1_0 )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==31) ) {
                            int LA18_1 = input.LA(2);

                            if ( (LA18_1==RULE_ID) ) {
                                int LA18_4 = input.LA(3);

                                if ( (synpred1_InternalSocialRequest()) ) {
                                    alt18=1;
                                }


                            }


                        }
                        else if ( (LA18_0==32) ) {
                            int LA18_2 = input.LA(2);

                            if ( (LA18_2==RULE_FETCH_TYPE) ) {
                                int LA18_5 = input.LA(3);

                                if ( (synpred1_InternalSocialRequest()) ) {
                                    alt18=1;
                                }


                            }


                        }


                        switch (alt18) {
                    	case 1 :
                    	    // InternalSocialRequest.g:2059:8: ( rule__Attribute__AssociationSpecificationsAssignment_5_1_0 )=> rule__Attribute__AssociationSpecificationsAssignment_5_1_0
                    	    {
                    	    pushFollow(FOLLOW_32);
                    	    rule__Attribute__AssociationSpecificationsAssignment_5_1_0();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop18;
                        }
                    } while (true);

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAttributeAccess().getAssociationSpecificationsAssignment_5_1_0()); 
                    }

                    }


                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSocialRequest.g:2065:3: ({...}? => ( ( ( rule__Attribute__Group_5_1_1__0 ) ) ) )
                    {
                    // InternalSocialRequest.g:2065:3: ({...}? => ( ( ( rule__Attribute__Group_5_1_1__0 ) ) ) )
                    // InternalSocialRequest.g:2066:4: {...}? => ( ( ( rule__Attribute__Group_5_1_1__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_1(), 1) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__Attribute__UnorderedGroup_5_1__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_1(), 1)");
                    }
                    // InternalSocialRequest.g:2066:107: ( ( ( rule__Attribute__Group_5_1_1__0 ) ) )
                    // InternalSocialRequest.g:2067:5: ( ( rule__Attribute__Group_5_1_1__0 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getAttributeAccess().getUnorderedGroup_5_1(), 1);
                    selected = true;
                    // InternalSocialRequest.g:2073:5: ( ( rule__Attribute__Group_5_1_1__0 ) )
                    // InternalSocialRequest.g:2074:6: ( rule__Attribute__Group_5_1_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAttributeAccess().getGroup_5_1_1()); 
                    }
                    // InternalSocialRequest.g:2075:6: ( rule__Attribute__Group_5_1_1__0 )
                    // InternalSocialRequest.g:2075:7: rule__Attribute__Group_5_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Attribute__Group_5_1_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAttributeAccess().getGroup_5_1_1()); 
                    }

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
    // InternalSocialRequest.g:2088:1: rule__Attribute__UnorderedGroup_5_1__0 : rule__Attribute__UnorderedGroup_5_1__Impl ( rule__Attribute__UnorderedGroup_5_1__1 )? ;
    public final void rule__Attribute__UnorderedGroup_5_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2092:1: ( rule__Attribute__UnorderedGroup_5_1__Impl ( rule__Attribute__UnorderedGroup_5_1__1 )? )
            // InternalSocialRequest.g:2093:2: rule__Attribute__UnorderedGroup_5_1__Impl ( rule__Attribute__UnorderedGroup_5_1__1 )?
            {
            pushFollow(FOLLOW_33);
            rule__Attribute__UnorderedGroup_5_1__Impl();

            state._fsp--;
            if (state.failed) return ;
            // InternalSocialRequest.g:2094:2: ( rule__Attribute__UnorderedGroup_5_1__1 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( LA20_0 >= 31 && LA20_0 <= 32 && getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_1(), 0) ) {
                alt20=1;
            }
            else if ( LA20_0 == 21 && getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_1(), 1) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalSocialRequest.g:2094:2: rule__Attribute__UnorderedGroup_5_1__1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Attribute__UnorderedGroup_5_1__1();

                    state._fsp--;
                    if (state.failed) return ;

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
    // InternalSocialRequest.g:2100:1: rule__Attribute__UnorderedGroup_5_1__1 : rule__Attribute__UnorderedGroup_5_1__Impl ;
    public final void rule__Attribute__UnorderedGroup_5_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2104:1: ( rule__Attribute__UnorderedGroup_5_1__Impl )
            // InternalSocialRequest.g:2105:2: rule__Attribute__UnorderedGroup_5_1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__UnorderedGroup_5_1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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


    // $ANTLR start "rule__Model__EntitiesAssignment_0"
    // InternalSocialRequest.g:2112:1: rule__Model__EntitiesAssignment_0 : ( ruleEntity ) ;
    public final void rule__Model__EntitiesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2116:1: ( ( ruleEntity ) )
            // InternalSocialRequest.g:2117:2: ( ruleEntity )
            {
            // InternalSocialRequest.g:2117:2: ( ruleEntity )
            // InternalSocialRequest.g:2118:3: ruleEntity
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getEntitiesEntityParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleEntity();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getEntitiesEntityParserRuleCall_0_0()); 
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
    // $ANTLR end "rule__Model__EntitiesAssignment_0"


    // $ANTLR start "rule__Model__RepositoriesAssignment_1"
    // InternalSocialRequest.g:2127:1: rule__Model__RepositoriesAssignment_1 : ( ruleRepository ) ;
    public final void rule__Model__RepositoriesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2131:1: ( ( ruleRepository ) )
            // InternalSocialRequest.g:2132:2: ( ruleRepository )
            {
            // InternalSocialRequest.g:2132:2: ( ruleRepository )
            // InternalSocialRequest.g:2133:3: ruleRepository
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getRepositoriesRepositoryParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleRepository();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getRepositoriesRepositoryParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__Model__RepositoriesAssignment_1"


    // $ANTLR start "rule__Entity__NameAssignment_1"
    // InternalSocialRequest.g:2142:1: rule__Entity__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Entity__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2146:1: ( ( RULE_ID ) )
            // InternalSocialRequest.g:2147:2: ( RULE_ID )
            {
            // InternalSocialRequest.g:2147:2: ( RULE_ID )
            // InternalSocialRequest.g:2148:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0()); 
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
    // $ANTLR end "rule__Entity__NameAssignment_1"


    // $ANTLR start "rule__Entity__HasUserDetailsAssignment_2"
    // InternalSocialRequest.g:2157:1: rule__Entity__HasUserDetailsAssignment_2 : ( ( 'implements UserDetails' ) ) ;
    public final void rule__Entity__HasUserDetailsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2161:1: ( ( ( 'implements UserDetails' ) ) )
            // InternalSocialRequest.g:2162:2: ( ( 'implements UserDetails' ) )
            {
            // InternalSocialRequest.g:2162:2: ( ( 'implements UserDetails' ) )
            // InternalSocialRequest.g:2163:3: ( 'implements UserDetails' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntityAccess().getHasUserDetailsImplementsUserDetailsKeyword_2_0()); 
            }
            // InternalSocialRequest.g:2164:3: ( 'implements UserDetails' )
            // InternalSocialRequest.g:2165:4: 'implements UserDetails'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntityAccess().getHasUserDetailsImplementsUserDetailsKeyword_2_0()); 
            }
            match(input,36,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntityAccess().getHasUserDetailsImplementsUserDetailsKeyword_2_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntityAccess().getHasUserDetailsImplementsUserDetailsKeyword_2_0()); 
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
    // $ANTLR end "rule__Entity__HasUserDetailsAssignment_2"


    // $ANTLR start "rule__Entity__AttributesAssignment_4"
    // InternalSocialRequest.g:2176:1: rule__Entity__AttributesAssignment_4 : ( ruleAttribute ) ;
    public final void rule__Entity__AttributesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2180:1: ( ( ruleAttribute ) )
            // InternalSocialRequest.g:2181:2: ( ruleAttribute )
            {
            // InternalSocialRequest.g:2181:2: ( ruleAttribute )
            // InternalSocialRequest.g:2182:3: ruleAttribute
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntityAccess().getAttributesAttributeParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleAttribute();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntityAccess().getAttributesAttributeParserRuleCall_4_0()); 
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
    // $ANTLR end "rule__Entity__AttributesAssignment_4"


    // $ANTLR start "rule__Attribute__AssociationAssignment_0"
    // InternalSocialRequest.g:2191:1: rule__Attribute__AssociationAssignment_0 : ( RULE_ASSOCIATION ) ;
    public final void rule__Attribute__AssociationAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2195:1: ( ( RULE_ASSOCIATION ) )
            // InternalSocialRequest.g:2196:2: ( RULE_ASSOCIATION )
            {
            // InternalSocialRequest.g:2196:2: ( RULE_ASSOCIATION )
            // InternalSocialRequest.g:2197:3: RULE_ASSOCIATION
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getAssociationASSOCIATIONTerminalRuleCall_0_0()); 
            }
            match(input,RULE_ASSOCIATION,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeAccess().getAssociationASSOCIATIONTerminalRuleCall_0_0()); 
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
    // $ANTLR end "rule__Attribute__AssociationAssignment_0"


    // $ANTLR start "rule__Attribute__NameAssignment_1"
    // InternalSocialRequest.g:2206:1: rule__Attribute__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Attribute__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2210:1: ( ( RULE_ID ) )
            // InternalSocialRequest.g:2211:2: ( RULE_ID )
            {
            // InternalSocialRequest.g:2211:2: ( RULE_ID )
            // InternalSocialRequest.g:2212:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_1_0()); 
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
    // $ANTLR end "rule__Attribute__NameAssignment_1"


    // $ANTLR start "rule__Attribute__TypeAssignment_3"
    // InternalSocialRequest.g:2221:1: rule__Attribute__TypeAssignment_3 : ( ( RULE_DATA_TYPE ) ) ;
    public final void rule__Attribute__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2225:1: ( ( ( RULE_DATA_TYPE ) ) )
            // InternalSocialRequest.g:2226:2: ( ( RULE_DATA_TYPE ) )
            {
            // InternalSocialRequest.g:2226:2: ( ( RULE_DATA_TYPE ) )
            // InternalSocialRequest.g:2227:3: ( RULE_DATA_TYPE )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getTypeEntityCrossReference_3_0()); 
            }
            // InternalSocialRequest.g:2228:3: ( RULE_DATA_TYPE )
            // InternalSocialRequest.g:2229:4: RULE_DATA_TYPE
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getTypeEntityDATA_TYPETerminalRuleCall_3_0_1()); 
            }
            match(input,RULE_DATA_TYPE,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeAccess().getTypeEntityDATA_TYPETerminalRuleCall_3_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeAccess().getTypeEntityCrossReference_3_0()); 
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
    // $ANTLR end "rule__Attribute__TypeAssignment_3"


    // $ANTLR start "rule__Attribute__ModifierAssignment_4"
    // InternalSocialRequest.g:2240:1: rule__Attribute__ModifierAssignment_4 : ( ruleModifier ) ;
    public final void rule__Attribute__ModifierAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2244:1: ( ( ruleModifier ) )
            // InternalSocialRequest.g:2245:2: ( ruleModifier )
            {
            // InternalSocialRequest.g:2245:2: ( ruleModifier )
            // InternalSocialRequest.g:2246:3: ruleModifier
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getModifierModifierParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleModifier();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeAccess().getModifierModifierParserRuleCall_4_0()); 
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
    // $ANTLR end "rule__Attribute__ModifierAssignment_4"


    // $ANTLR start "rule__Attribute__AssociationSpecificationsAssignment_5_1_0"
    // InternalSocialRequest.g:2255:1: rule__Attribute__AssociationSpecificationsAssignment_5_1_0 : ( ruleAssociationSpecification ) ;
    public final void rule__Attribute__AssociationSpecificationsAssignment_5_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2259:1: ( ( ruleAssociationSpecification ) )
            // InternalSocialRequest.g:2260:2: ( ruleAssociationSpecification )
            {
            // InternalSocialRequest.g:2260:2: ( ruleAssociationSpecification )
            // InternalSocialRequest.g:2261:3: ruleAssociationSpecification
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getAssociationSpecificationsAssociationSpecificationParserRuleCall_5_1_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleAssociationSpecification();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeAccess().getAssociationSpecificationsAssociationSpecificationParserRuleCall_5_1_0_0()); 
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
    // $ANTLR end "rule__Attribute__AssociationSpecificationsAssignment_5_1_0"


    // $ANTLR start "rule__Attribute__ValidationsAssignment_5_1_1_1"
    // InternalSocialRequest.g:2270:1: rule__Attribute__ValidationsAssignment_5_1_1_1 : ( ruleValidation ) ;
    public final void rule__Attribute__ValidationsAssignment_5_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2274:1: ( ( ruleValidation ) )
            // InternalSocialRequest.g:2275:2: ( ruleValidation )
            {
            // InternalSocialRequest.g:2275:2: ( ruleValidation )
            // InternalSocialRequest.g:2276:3: ruleValidation
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getValidationsValidationParserRuleCall_5_1_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleValidation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeAccess().getValidationsValidationParserRuleCall_5_1_1_1_0()); 
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
    // $ANTLR end "rule__Attribute__ValidationsAssignment_5_1_1_1"


    // $ANTLR start "rule__Identification__GenerationTypeAssignment_2_1"
    // InternalSocialRequest.g:2285:1: rule__Identification__GenerationTypeAssignment_2_1 : ( RULE_GENERATION_TYPE ) ;
    public final void rule__Identification__GenerationTypeAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2289:1: ( ( RULE_GENERATION_TYPE ) )
            // InternalSocialRequest.g:2290:2: ( RULE_GENERATION_TYPE )
            {
            // InternalSocialRequest.g:2290:2: ( RULE_GENERATION_TYPE )
            // InternalSocialRequest.g:2291:3: RULE_GENERATION_TYPE
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIdentificationAccess().getGenerationTypeGENERATION_TYPETerminalRuleCall_2_1_0()); 
            }
            match(input,RULE_GENERATION_TYPE,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIdentificationAccess().getGenerationTypeGENERATION_TYPETerminalRuleCall_2_1_0()); 
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
    // $ANTLR end "rule__Identification__GenerationTypeAssignment_2_1"


    // $ANTLR start "rule__Validation__MinAssignment_0_1"
    // InternalSocialRequest.g:2300:1: rule__Validation__MinAssignment_0_1 : ( RULE_POSSIBLY_SIGNED_INT ) ;
    public final void rule__Validation__MinAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2304:1: ( ( RULE_POSSIBLY_SIGNED_INT ) )
            // InternalSocialRequest.g:2305:2: ( RULE_POSSIBLY_SIGNED_INT )
            {
            // InternalSocialRequest.g:2305:2: ( RULE_POSSIBLY_SIGNED_INT )
            // InternalSocialRequest.g:2306:3: RULE_POSSIBLY_SIGNED_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValidationAccess().getMinPOSSIBLY_SIGNED_INTTerminalRuleCall_0_1_0()); 
            }
            match(input,RULE_POSSIBLY_SIGNED_INT,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getValidationAccess().getMinPOSSIBLY_SIGNED_INTTerminalRuleCall_0_1_0()); 
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
    // $ANTLR end "rule__Validation__MinAssignment_0_1"


    // $ANTLR start "rule__Validation__MaxAssignment_1_1"
    // InternalSocialRequest.g:2315:1: rule__Validation__MaxAssignment_1_1 : ( RULE_POSSIBLY_SIGNED_INT ) ;
    public final void rule__Validation__MaxAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2319:1: ( ( RULE_POSSIBLY_SIGNED_INT ) )
            // InternalSocialRequest.g:2320:2: ( RULE_POSSIBLY_SIGNED_INT )
            {
            // InternalSocialRequest.g:2320:2: ( RULE_POSSIBLY_SIGNED_INT )
            // InternalSocialRequest.g:2321:3: RULE_POSSIBLY_SIGNED_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValidationAccess().getMaxPOSSIBLY_SIGNED_INTTerminalRuleCall_1_1_0()); 
            }
            match(input,RULE_POSSIBLY_SIGNED_INT,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getValidationAccess().getMaxPOSSIBLY_SIGNED_INTTerminalRuleCall_1_1_0()); 
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
    // $ANTLR end "rule__Validation__MaxAssignment_1_1"


    // $ANTLR start "rule__Validation__RegexAssignment_2_1"
    // InternalSocialRequest.g:2330:1: rule__Validation__RegexAssignment_2_1 : ( RULE_STRING ) ;
    public final void rule__Validation__RegexAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2334:1: ( ( RULE_STRING ) )
            // InternalSocialRequest.g:2335:2: ( RULE_STRING )
            {
            // InternalSocialRequest.g:2335:2: ( RULE_STRING )
            // InternalSocialRequest.g:2336:3: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValidationAccess().getRegexSTRINGTerminalRuleCall_2_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getValidationAccess().getRegexSTRINGTerminalRuleCall_2_1_0()); 
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
    // $ANTLR end "rule__Validation__RegexAssignment_2_1"


    // $ANTLR start "rule__AssociationSpecification__MappedByAssignment_0_1"
    // InternalSocialRequest.g:2345:1: rule__AssociationSpecification__MappedByAssignment_0_1 : ( RULE_ID ) ;
    public final void rule__AssociationSpecification__MappedByAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2349:1: ( ( RULE_ID ) )
            // InternalSocialRequest.g:2350:2: ( RULE_ID )
            {
            // InternalSocialRequest.g:2350:2: ( RULE_ID )
            // InternalSocialRequest.g:2351:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssociationSpecificationAccess().getMappedByIDTerminalRuleCall_0_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssociationSpecificationAccess().getMappedByIDTerminalRuleCall_0_1_0()); 
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
    // $ANTLR end "rule__AssociationSpecification__MappedByAssignment_0_1"


    // $ANTLR start "rule__AssociationSpecification__FetchTypeAssignment_1_1"
    // InternalSocialRequest.g:2360:1: rule__AssociationSpecification__FetchTypeAssignment_1_1 : ( RULE_FETCH_TYPE ) ;
    public final void rule__AssociationSpecification__FetchTypeAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2364:1: ( ( RULE_FETCH_TYPE ) )
            // InternalSocialRequest.g:2365:2: ( RULE_FETCH_TYPE )
            {
            // InternalSocialRequest.g:2365:2: ( RULE_FETCH_TYPE )
            // InternalSocialRequest.g:2366:3: RULE_FETCH_TYPE
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssociationSpecificationAccess().getFetchTypeFETCH_TYPETerminalRuleCall_1_1_0()); 
            }
            match(input,RULE_FETCH_TYPE,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssociationSpecificationAccess().getFetchTypeFETCH_TYPETerminalRuleCall_1_1_0()); 
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
    // $ANTLR end "rule__AssociationSpecification__FetchTypeAssignment_1_1"


    // $ANTLR start "rule__Repository__EntityAssignment_1"
    // InternalSocialRequest.g:2375:1: rule__Repository__EntityAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__Repository__EntityAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2379:1: ( ( ( RULE_ID ) ) )
            // InternalSocialRequest.g:2380:2: ( ( RULE_ID ) )
            {
            // InternalSocialRequest.g:2380:2: ( ( RULE_ID ) )
            // InternalSocialRequest.g:2381:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRepositoryAccess().getEntityEntityCrossReference_1_0()); 
            }
            // InternalSocialRequest.g:2382:3: ( RULE_ID )
            // InternalSocialRequest.g:2383:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRepositoryAccess().getEntityEntityIDTerminalRuleCall_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRepositoryAccess().getEntityEntityIDTerminalRuleCall_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRepositoryAccess().getEntityEntityCrossReference_1_0()); 
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
    // $ANTLR end "rule__Repository__EntityAssignment_1"


    // $ANTLR start "rule__Repository__QueriesAssignment_3"
    // InternalSocialRequest.g:2394:1: rule__Repository__QueriesAssignment_3 : ( ruleQuery ) ;
    public final void rule__Repository__QueriesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2398:1: ( ( ruleQuery ) )
            // InternalSocialRequest.g:2399:2: ( ruleQuery )
            {
            // InternalSocialRequest.g:2399:2: ( ruleQuery )
            // InternalSocialRequest.g:2400:3: ruleQuery
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRepositoryAccess().getQueriesQueryParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleQuery();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRepositoryAccess().getQueriesQueryParserRuleCall_3_0()); 
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
    // $ANTLR end "rule__Repository__QueriesAssignment_3"


    // $ANTLR start "rule__Query__NameAssignment_1"
    // InternalSocialRequest.g:2409:1: rule__Query__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Query__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2413:1: ( ( RULE_ID ) )
            // InternalSocialRequest.g:2414:2: ( RULE_ID )
            {
            // InternalSocialRequest.g:2414:2: ( RULE_ID )
            // InternalSocialRequest.g:2415:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQueryAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQueryAccess().getNameIDTerminalRuleCall_1_0()); 
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
    // $ANTLR end "rule__Query__NameAssignment_1"


    // $ANTLR start "rule__Query__IsListAssignment_2"
    // InternalSocialRequest.g:2424:1: rule__Query__IsListAssignment_2 : ( ( ': list' ) ) ;
    public final void rule__Query__IsListAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2428:1: ( ( ( ': list' ) ) )
            // InternalSocialRequest.g:2429:2: ( ( ': list' ) )
            {
            // InternalSocialRequest.g:2429:2: ( ( ': list' ) )
            // InternalSocialRequest.g:2430:3: ( ': list' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQueryAccess().getIsListListKeyword_2_0()); 
            }
            // InternalSocialRequest.g:2431:3: ( ': list' )
            // InternalSocialRequest.g:2432:4: ': list'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQueryAccess().getIsListListKeyword_2_0()); 
            }
            match(input,37,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQueryAccess().getIsListListKeyword_2_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQueryAccess().getIsListListKeyword_2_0()); 
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
    // $ANTLR end "rule__Query__IsListAssignment_2"


    // $ANTLR start "rule__Query__ParamsAssignment_3_1"
    // InternalSocialRequest.g:2443:1: rule__Query__ParamsAssignment_3_1 : ( ruleParam ) ;
    public final void rule__Query__ParamsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2447:1: ( ( ruleParam ) )
            // InternalSocialRequest.g:2448:2: ( ruleParam )
            {
            // InternalSocialRequest.g:2448:2: ( ruleParam )
            // InternalSocialRequest.g:2449:3: ruleParam
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQueryAccess().getParamsParamParserRuleCall_3_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleParam();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQueryAccess().getParamsParamParserRuleCall_3_1_0()); 
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
    // $ANTLR end "rule__Query__ParamsAssignment_3_1"


    // $ANTLR start "rule__Query__SqlQueryAssignment_3_2"
    // InternalSocialRequest.g:2458:1: rule__Query__SqlQueryAssignment_3_2 : ( ruleSQLQuery ) ;
    public final void rule__Query__SqlQueryAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2462:1: ( ( ruleSQLQuery ) )
            // InternalSocialRequest.g:2463:2: ( ruleSQLQuery )
            {
            // InternalSocialRequest.g:2463:2: ( ruleSQLQuery )
            // InternalSocialRequest.g:2464:3: ruleSQLQuery
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQueryAccess().getSqlQuerySQLQueryParserRuleCall_3_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleSQLQuery();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQueryAccess().getSqlQuerySQLQueryParserRuleCall_3_2_0()); 
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
    // $ANTLR end "rule__Query__SqlQueryAssignment_3_2"


    // $ANTLR start "rule__Param__NameAssignment_1"
    // InternalSocialRequest.g:2473:1: rule__Param__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Param__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2477:1: ( ( RULE_ID ) )
            // InternalSocialRequest.g:2478:2: ( RULE_ID )
            {
            // InternalSocialRequest.g:2478:2: ( RULE_ID )
            // InternalSocialRequest.g:2479:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParamAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParamAccess().getNameIDTerminalRuleCall_1_0()); 
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
    // $ANTLR end "rule__Param__NameAssignment_1"


    // $ANTLR start "rule__Param__TypeAssignment_3"
    // InternalSocialRequest.g:2488:1: rule__Param__TypeAssignment_3 : ( ( RULE_DATA_TYPE ) ) ;
    public final void rule__Param__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2492:1: ( ( ( RULE_DATA_TYPE ) ) )
            // InternalSocialRequest.g:2493:2: ( ( RULE_DATA_TYPE ) )
            {
            // InternalSocialRequest.g:2493:2: ( ( RULE_DATA_TYPE ) )
            // InternalSocialRequest.g:2494:3: ( RULE_DATA_TYPE )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParamAccess().getTypeEntityCrossReference_3_0()); 
            }
            // InternalSocialRequest.g:2495:3: ( RULE_DATA_TYPE )
            // InternalSocialRequest.g:2496:4: RULE_DATA_TYPE
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParamAccess().getTypeEntityDATA_TYPETerminalRuleCall_3_0_1()); 
            }
            match(input,RULE_DATA_TYPE,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParamAccess().getTypeEntityDATA_TYPETerminalRuleCall_3_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParamAccess().getTypeEntityCrossReference_3_0()); 
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
    // $ANTLR end "rule__Param__TypeAssignment_3"

    // $ANTLR start synpred1_InternalSocialRequest
    public final void synpred1_InternalSocialRequest_fragment() throws RecognitionException {   
        // InternalSocialRequest.g:2059:8: ( rule__Attribute__AssociationSpecificationsAssignment_5_1_0 )
        // InternalSocialRequest.g:2059:9: rule__Attribute__AssociationSpecificationsAssignment_5_1_0
        {
        pushFollow(FOLLOW_2);
        rule__Attribute__AssociationSpecificationsAssignment_5_1_0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_InternalSocialRequest

    // Delegated rules

    public final boolean synpred1_InternalSocialRequest() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalSocialRequest_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000001000040000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000C40000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000180200000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x000000007C000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x000000007C000002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000002000040000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000800090000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000180000002L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000180200002L});

}
