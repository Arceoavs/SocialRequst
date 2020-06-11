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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_FETCHTYPE", "RULE_GENERATIONTYPE", "RULE_POSSIBLY_SIGNED_INT", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'NotNull'", "'NotBlank'", "'Past'", "'Email'", "'OneToMany'", "'ManyToOne'", "'OneToOne'", "'ManyToMany'", "'String'", "'long'", "'float'", "'double'", "'char'", "'int'", "'boolean'", "'Date'", "'LEFT JOIN'", "'LEFT OUTER JOIN'", "'CROSS JOIN'", "'JOIN'", "'package'", "'{'", "'}'", "'.'", "'Entity'", "'UserDetails'", "':'", "'mappedBy:'", "'fetch:'", "'validations'", "'('", "')'", "'min:'", "'max:'", "'pattern:'", "'Repository'", "'query'", "'list'", "'params'", "'SELECT'", "'FROM'", "'ON'", "'WHERE'", "'ORDER BY'", "'implements'", "'LOB'", "'TRANSIENT'", "'ID'", "'unique'", "'DISTINCT'"
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
    // InternalSocialRequest.g:62:1: ruleModel : ( ( ( rule__Model__ElementsAssignment ) ) ( ( rule__Model__ElementsAssignment )* ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:66:2: ( ( ( ( rule__Model__ElementsAssignment ) ) ( ( rule__Model__ElementsAssignment )* ) ) )
            // InternalSocialRequest.g:67:2: ( ( ( rule__Model__ElementsAssignment ) ) ( ( rule__Model__ElementsAssignment )* ) )
            {
            // InternalSocialRequest.g:67:2: ( ( ( rule__Model__ElementsAssignment ) ) ( ( rule__Model__ElementsAssignment )* ) )
            // InternalSocialRequest.g:68:3: ( ( rule__Model__ElementsAssignment ) ) ( ( rule__Model__ElementsAssignment )* )
            {
            // InternalSocialRequest.g:68:3: ( ( rule__Model__ElementsAssignment ) )
            // InternalSocialRequest.g:69:4: ( rule__Model__ElementsAssignment )
            {
             before(grammarAccess.getModelAccess().getElementsAssignment()); 
            // InternalSocialRequest.g:70:4: ( rule__Model__ElementsAssignment )
            // InternalSocialRequest.g:70:5: rule__Model__ElementsAssignment
            {
            pushFollow(FOLLOW_3);
            rule__Model__ElementsAssignment();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getElementsAssignment()); 

            }

            // InternalSocialRequest.g:73:3: ( ( rule__Model__ElementsAssignment )* )
            // InternalSocialRequest.g:74:4: ( rule__Model__ElementsAssignment )*
            {
             before(grammarAccess.getModelAccess().getElementsAssignment()); 
            // InternalSocialRequest.g:75:4: ( rule__Model__ElementsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==34||LA1_0==38||LA1_0==49) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalSocialRequest.g:75:5: rule__Model__ElementsAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Model__ElementsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getElementsAssignment()); 

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


    // $ANTLR start "entryRuleAbstractElement"
    // InternalSocialRequest.g:85:1: entryRuleAbstractElement : ruleAbstractElement EOF ;
    public final void entryRuleAbstractElement() throws RecognitionException {
        try {
            // InternalSocialRequest.g:86:1: ( ruleAbstractElement EOF )
            // InternalSocialRequest.g:87:1: ruleAbstractElement EOF
            {
             before(grammarAccess.getAbstractElementRule()); 
            pushFollow(FOLLOW_1);
            ruleAbstractElement();

            state._fsp--;

             after(grammarAccess.getAbstractElementRule()); 
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
    // $ANTLR end "entryRuleAbstractElement"


    // $ANTLR start "ruleAbstractElement"
    // InternalSocialRequest.g:94:1: ruleAbstractElement : ( ( rule__AbstractElement__Alternatives ) ) ;
    public final void ruleAbstractElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:98:2: ( ( ( rule__AbstractElement__Alternatives ) ) )
            // InternalSocialRequest.g:99:2: ( ( rule__AbstractElement__Alternatives ) )
            {
            // InternalSocialRequest.g:99:2: ( ( rule__AbstractElement__Alternatives ) )
            // InternalSocialRequest.g:100:3: ( rule__AbstractElement__Alternatives )
            {
             before(grammarAccess.getAbstractElementAccess().getAlternatives()); 
            // InternalSocialRequest.g:101:3: ( rule__AbstractElement__Alternatives )
            // InternalSocialRequest.g:101:4: rule__AbstractElement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__AbstractElement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAbstractElementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAbstractElement"


    // $ANTLR start "entryRulePackage"
    // InternalSocialRequest.g:110:1: entryRulePackage : rulePackage EOF ;
    public final void entryRulePackage() throws RecognitionException {
        try {
            // InternalSocialRequest.g:111:1: ( rulePackage EOF )
            // InternalSocialRequest.g:112:1: rulePackage EOF
            {
             before(grammarAccess.getPackageRule()); 
            pushFollow(FOLLOW_1);
            rulePackage();

            state._fsp--;

             after(grammarAccess.getPackageRule()); 
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
    // $ANTLR end "entryRulePackage"


    // $ANTLR start "rulePackage"
    // InternalSocialRequest.g:119:1: rulePackage : ( ( rule__Package__Group__0 ) ) ;
    public final void rulePackage() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:123:2: ( ( ( rule__Package__Group__0 ) ) )
            // InternalSocialRequest.g:124:2: ( ( rule__Package__Group__0 ) )
            {
            // InternalSocialRequest.g:124:2: ( ( rule__Package__Group__0 ) )
            // InternalSocialRequest.g:125:3: ( rule__Package__Group__0 )
            {
             before(grammarAccess.getPackageAccess().getGroup()); 
            // InternalSocialRequest.g:126:3: ( rule__Package__Group__0 )
            // InternalSocialRequest.g:126:4: rule__Package__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Package__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPackageAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePackage"


    // $ANTLR start "entryRulePointSeperatedID"
    // InternalSocialRequest.g:135:1: entryRulePointSeperatedID : rulePointSeperatedID EOF ;
    public final void entryRulePointSeperatedID() throws RecognitionException {
        try {
            // InternalSocialRequest.g:136:1: ( rulePointSeperatedID EOF )
            // InternalSocialRequest.g:137:1: rulePointSeperatedID EOF
            {
             before(grammarAccess.getPointSeperatedIDRule()); 
            pushFollow(FOLLOW_1);
            rulePointSeperatedID();

            state._fsp--;

             after(grammarAccess.getPointSeperatedIDRule()); 
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
    // $ANTLR end "entryRulePointSeperatedID"


    // $ANTLR start "rulePointSeperatedID"
    // InternalSocialRequest.g:144:1: rulePointSeperatedID : ( ( rule__PointSeperatedID__Group__0 ) ) ;
    public final void rulePointSeperatedID() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:148:2: ( ( ( rule__PointSeperatedID__Group__0 ) ) )
            // InternalSocialRequest.g:149:2: ( ( rule__PointSeperatedID__Group__0 ) )
            {
            // InternalSocialRequest.g:149:2: ( ( rule__PointSeperatedID__Group__0 ) )
            // InternalSocialRequest.g:150:3: ( rule__PointSeperatedID__Group__0 )
            {
             before(grammarAccess.getPointSeperatedIDAccess().getGroup()); 
            // InternalSocialRequest.g:151:3: ( rule__PointSeperatedID__Group__0 )
            // InternalSocialRequest.g:151:4: rule__PointSeperatedID__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PointSeperatedID__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPointSeperatedIDAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePointSeperatedID"


    // $ANTLR start "entryRuleEntity"
    // InternalSocialRequest.g:160:1: entryRuleEntity : ruleEntity EOF ;
    public final void entryRuleEntity() throws RecognitionException {
        try {
            // InternalSocialRequest.g:161:1: ( ruleEntity EOF )
            // InternalSocialRequest.g:162:1: ruleEntity EOF
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
    // InternalSocialRequest.g:169:1: ruleEntity : ( ( rule__Entity__Group__0 ) ) ;
    public final void ruleEntity() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:173:2: ( ( ( rule__Entity__Group__0 ) ) )
            // InternalSocialRequest.g:174:2: ( ( rule__Entity__Group__0 ) )
            {
            // InternalSocialRequest.g:174:2: ( ( rule__Entity__Group__0 ) )
            // InternalSocialRequest.g:175:3: ( rule__Entity__Group__0 )
            {
             before(grammarAccess.getEntityAccess().getGroup()); 
            // InternalSocialRequest.g:176:3: ( rule__Entity__Group__0 )
            // InternalSocialRequest.g:176:4: rule__Entity__Group__0
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
    // InternalSocialRequest.g:185:1: entryRuleAttribute : ruleAttribute EOF ;
    public final void entryRuleAttribute() throws RecognitionException {
        try {
            // InternalSocialRequest.g:186:1: ( ruleAttribute EOF )
            // InternalSocialRequest.g:187:1: ruleAttribute EOF
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
    // InternalSocialRequest.g:194:1: ruleAttribute : ( ( rule__Attribute__Group__0 ) ) ;
    public final void ruleAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:198:2: ( ( ( rule__Attribute__Group__0 ) ) )
            // InternalSocialRequest.g:199:2: ( ( rule__Attribute__Group__0 ) )
            {
            // InternalSocialRequest.g:199:2: ( ( rule__Attribute__Group__0 ) )
            // InternalSocialRequest.g:200:3: ( rule__Attribute__Group__0 )
            {
             before(grammarAccess.getAttributeAccess().getGroup()); 
            // InternalSocialRequest.g:201:3: ( rule__Attribute__Group__0 )
            // InternalSocialRequest.g:201:4: rule__Attribute__Group__0
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
    // InternalSocialRequest.g:210:1: entryRuleTypeReference : ruleTypeReference EOF ;
    public final void entryRuleTypeReference() throws RecognitionException {
        try {
            // InternalSocialRequest.g:211:1: ( ruleTypeReference EOF )
            // InternalSocialRequest.g:212:1: ruleTypeReference EOF
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
    // InternalSocialRequest.g:219:1: ruleTypeReference : ( ( rule__TypeReference__Alternatives ) ) ;
    public final void ruleTypeReference() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:223:2: ( ( ( rule__TypeReference__Alternatives ) ) )
            // InternalSocialRequest.g:224:2: ( ( rule__TypeReference__Alternatives ) )
            {
            // InternalSocialRequest.g:224:2: ( ( rule__TypeReference__Alternatives ) )
            // InternalSocialRequest.g:225:3: ( rule__TypeReference__Alternatives )
            {
             before(grammarAccess.getTypeReferenceAccess().getAlternatives()); 
            // InternalSocialRequest.g:226:3: ( rule__TypeReference__Alternatives )
            // InternalSocialRequest.g:226:4: rule__TypeReference__Alternatives
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
    // InternalSocialRequest.g:235:1: entryRuleEntityTypeReference : ruleEntityTypeReference EOF ;
    public final void entryRuleEntityTypeReference() throws RecognitionException {
        try {
            // InternalSocialRequest.g:236:1: ( ruleEntityTypeReference EOF )
            // InternalSocialRequest.g:237:1: ruleEntityTypeReference EOF
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
    // InternalSocialRequest.g:244:1: ruleEntityTypeReference : ( ( rule__EntityTypeReference__TypeAssignment ) ) ;
    public final void ruleEntityTypeReference() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:248:2: ( ( ( rule__EntityTypeReference__TypeAssignment ) ) )
            // InternalSocialRequest.g:249:2: ( ( rule__EntityTypeReference__TypeAssignment ) )
            {
            // InternalSocialRequest.g:249:2: ( ( rule__EntityTypeReference__TypeAssignment ) )
            // InternalSocialRequest.g:250:3: ( rule__EntityTypeReference__TypeAssignment )
            {
             before(grammarAccess.getEntityTypeReferenceAccess().getTypeAssignment()); 
            // InternalSocialRequest.g:251:3: ( rule__EntityTypeReference__TypeAssignment )
            // InternalSocialRequest.g:251:4: rule__EntityTypeReference__TypeAssignment
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
    // InternalSocialRequest.g:260:1: entryRuleDataTypeReference : ruleDataTypeReference EOF ;
    public final void entryRuleDataTypeReference() throws RecognitionException {
        try {
            // InternalSocialRequest.g:261:1: ( ruleDataTypeReference EOF )
            // InternalSocialRequest.g:262:1: ruleDataTypeReference EOF
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
    // InternalSocialRequest.g:269:1: ruleDataTypeReference : ( ( rule__DataTypeReference__TypeAssignment ) ) ;
    public final void ruleDataTypeReference() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:273:2: ( ( ( rule__DataTypeReference__TypeAssignment ) ) )
            // InternalSocialRequest.g:274:2: ( ( rule__DataTypeReference__TypeAssignment ) )
            {
            // InternalSocialRequest.g:274:2: ( ( rule__DataTypeReference__TypeAssignment ) )
            // InternalSocialRequest.g:275:3: ( rule__DataTypeReference__TypeAssignment )
            {
             before(grammarAccess.getDataTypeReferenceAccess().getTypeAssignment()); 
            // InternalSocialRequest.g:276:3: ( rule__DataTypeReference__TypeAssignment )
            // InternalSocialRequest.g:276:4: rule__DataTypeReference__TypeAssignment
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
    // InternalSocialRequest.g:285:1: entryRuleModifier : ruleModifier EOF ;
    public final void entryRuleModifier() throws RecognitionException {
        try {
            // InternalSocialRequest.g:286:1: ( ruleModifier EOF )
            // InternalSocialRequest.g:287:1: ruleModifier EOF
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
    // InternalSocialRequest.g:294:1: ruleModifier : ( ( rule__Modifier__Alternatives ) ) ;
    public final void ruleModifier() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:298:2: ( ( ( rule__Modifier__Alternatives ) ) )
            // InternalSocialRequest.g:299:2: ( ( rule__Modifier__Alternatives ) )
            {
            // InternalSocialRequest.g:299:2: ( ( rule__Modifier__Alternatives ) )
            // InternalSocialRequest.g:300:3: ( rule__Modifier__Alternatives )
            {
             before(grammarAccess.getModifierAccess().getAlternatives()); 
            // InternalSocialRequest.g:301:3: ( rule__Modifier__Alternatives )
            // InternalSocialRequest.g:301:4: rule__Modifier__Alternatives
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
    // InternalSocialRequest.g:310:1: entryRuleValidation : ruleValidation EOF ;
    public final void entryRuleValidation() throws RecognitionException {
        try {
            // InternalSocialRequest.g:311:1: ( ruleValidation EOF )
            // InternalSocialRequest.g:312:1: ruleValidation EOF
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
    // InternalSocialRequest.g:319:1: ruleValidation : ( ( rule__Validation__Alternatives ) ) ;
    public final void ruleValidation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:323:2: ( ( ( rule__Validation__Alternatives ) ) )
            // InternalSocialRequest.g:324:2: ( ( rule__Validation__Alternatives ) )
            {
            // InternalSocialRequest.g:324:2: ( ( rule__Validation__Alternatives ) )
            // InternalSocialRequest.g:325:3: ( rule__Validation__Alternatives )
            {
             before(grammarAccess.getValidationAccess().getAlternatives()); 
            // InternalSocialRequest.g:326:3: ( rule__Validation__Alternatives )
            // InternalSocialRequest.g:326:4: rule__Validation__Alternatives
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
    // InternalSocialRequest.g:335:1: entryRuleBASICVALIDATION : ruleBASICVALIDATION EOF ;
    public final void entryRuleBASICVALIDATION() throws RecognitionException {
        try {
            // InternalSocialRequest.g:336:1: ( ruleBASICVALIDATION EOF )
            // InternalSocialRequest.g:337:1: ruleBASICVALIDATION EOF
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
    // InternalSocialRequest.g:344:1: ruleBASICVALIDATION : ( ( rule__BASICVALIDATION__Alternatives ) ) ;
    public final void ruleBASICVALIDATION() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:348:2: ( ( ( rule__BASICVALIDATION__Alternatives ) ) )
            // InternalSocialRequest.g:349:2: ( ( rule__BASICVALIDATION__Alternatives ) )
            {
            // InternalSocialRequest.g:349:2: ( ( rule__BASICVALIDATION__Alternatives ) )
            // InternalSocialRequest.g:350:3: ( rule__BASICVALIDATION__Alternatives )
            {
             before(grammarAccess.getBASICVALIDATIONAccess().getAlternatives()); 
            // InternalSocialRequest.g:351:3: ( rule__BASICVALIDATION__Alternatives )
            // InternalSocialRequest.g:351:4: rule__BASICVALIDATION__Alternatives
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
    // InternalSocialRequest.g:360:1: entryRuleASSOCIATION : ruleASSOCIATION EOF ;
    public final void entryRuleASSOCIATION() throws RecognitionException {
        try {
            // InternalSocialRequest.g:361:1: ( ruleASSOCIATION EOF )
            // InternalSocialRequest.g:362:1: ruleASSOCIATION EOF
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
    // InternalSocialRequest.g:369:1: ruleASSOCIATION : ( ( rule__ASSOCIATION__Alternatives ) ) ;
    public final void ruleASSOCIATION() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:373:2: ( ( ( rule__ASSOCIATION__Alternatives ) ) )
            // InternalSocialRequest.g:374:2: ( ( rule__ASSOCIATION__Alternatives ) )
            {
            // InternalSocialRequest.g:374:2: ( ( rule__ASSOCIATION__Alternatives ) )
            // InternalSocialRequest.g:375:3: ( rule__ASSOCIATION__Alternatives )
            {
             before(grammarAccess.getASSOCIATIONAccess().getAlternatives()); 
            // InternalSocialRequest.g:376:3: ( rule__ASSOCIATION__Alternatives )
            // InternalSocialRequest.g:376:4: rule__ASSOCIATION__Alternatives
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
    // InternalSocialRequest.g:385:1: entryRuleRepository : ruleRepository EOF ;
    public final void entryRuleRepository() throws RecognitionException {
        try {
            // InternalSocialRequest.g:386:1: ( ruleRepository EOF )
            // InternalSocialRequest.g:387:1: ruleRepository EOF
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
    // InternalSocialRequest.g:394:1: ruleRepository : ( ( rule__Repository__Group__0 ) ) ;
    public final void ruleRepository() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:398:2: ( ( ( rule__Repository__Group__0 ) ) )
            // InternalSocialRequest.g:399:2: ( ( rule__Repository__Group__0 ) )
            {
            // InternalSocialRequest.g:399:2: ( ( rule__Repository__Group__0 ) )
            // InternalSocialRequest.g:400:3: ( rule__Repository__Group__0 )
            {
             before(grammarAccess.getRepositoryAccess().getGroup()); 
            // InternalSocialRequest.g:401:3: ( rule__Repository__Group__0 )
            // InternalSocialRequest.g:401:4: rule__Repository__Group__0
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
    // InternalSocialRequest.g:410:1: entryRuleQuery : ruleQuery EOF ;
    public final void entryRuleQuery() throws RecognitionException {
        try {
            // InternalSocialRequest.g:411:1: ( ruleQuery EOF )
            // InternalSocialRequest.g:412:1: ruleQuery EOF
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
    // InternalSocialRequest.g:419:1: ruleQuery : ( ( rule__Query__Group__0 ) ) ;
    public final void ruleQuery() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:423:2: ( ( ( rule__Query__Group__0 ) ) )
            // InternalSocialRequest.g:424:2: ( ( rule__Query__Group__0 ) )
            {
            // InternalSocialRequest.g:424:2: ( ( rule__Query__Group__0 ) )
            // InternalSocialRequest.g:425:3: ( rule__Query__Group__0 )
            {
             before(grammarAccess.getQueryAccess().getGroup()); 
            // InternalSocialRequest.g:426:3: ( rule__Query__Group__0 )
            // InternalSocialRequest.g:426:4: rule__Query__Group__0
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
    // InternalSocialRequest.g:435:1: entryRuleParam : ruleParam EOF ;
    public final void entryRuleParam() throws RecognitionException {
        try {
            // InternalSocialRequest.g:436:1: ( ruleParam EOF )
            // InternalSocialRequest.g:437:1: ruleParam EOF
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
    // InternalSocialRequest.g:444:1: ruleParam : ( ( rule__Param__Group__0 ) ) ;
    public final void ruleParam() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:448:2: ( ( ( rule__Param__Group__0 ) ) )
            // InternalSocialRequest.g:449:2: ( ( rule__Param__Group__0 ) )
            {
            // InternalSocialRequest.g:449:2: ( ( rule__Param__Group__0 ) )
            // InternalSocialRequest.g:450:3: ( rule__Param__Group__0 )
            {
             before(grammarAccess.getParamAccess().getGroup()); 
            // InternalSocialRequest.g:451:3: ( rule__Param__Group__0 )
            // InternalSocialRequest.g:451:4: rule__Param__Group__0
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
    // InternalSocialRequest.g:460:1: entryRuleSQLQuery : ruleSQLQuery EOF ;
    public final void entryRuleSQLQuery() throws RecognitionException {
        try {
            // InternalSocialRequest.g:461:1: ( ruleSQLQuery EOF )
            // InternalSocialRequest.g:462:1: ruleSQLQuery EOF
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
    // InternalSocialRequest.g:469:1: ruleSQLQuery : ( ( rule__SQLQuery__Group__0 ) ) ;
    public final void ruleSQLQuery() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:473:2: ( ( ( rule__SQLQuery__Group__0 ) ) )
            // InternalSocialRequest.g:474:2: ( ( rule__SQLQuery__Group__0 ) )
            {
            // InternalSocialRequest.g:474:2: ( ( rule__SQLQuery__Group__0 ) )
            // InternalSocialRequest.g:475:3: ( rule__SQLQuery__Group__0 )
            {
             before(grammarAccess.getSQLQueryAccess().getGroup()); 
            // InternalSocialRequest.g:476:3: ( rule__SQLQuery__Group__0 )
            // InternalSocialRequest.g:476:4: rule__SQLQuery__Group__0
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
    // InternalSocialRequest.g:485:1: entryRuleSelect : ruleSelect EOF ;
    public final void entryRuleSelect() throws RecognitionException {
        try {
            // InternalSocialRequest.g:486:1: ( ruleSelect EOF )
            // InternalSocialRequest.g:487:1: ruleSelect EOF
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
    // InternalSocialRequest.g:494:1: ruleSelect : ( ( rule__Select__Group__0 ) ) ;
    public final void ruleSelect() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:498:2: ( ( ( rule__Select__Group__0 ) ) )
            // InternalSocialRequest.g:499:2: ( ( rule__Select__Group__0 ) )
            {
            // InternalSocialRequest.g:499:2: ( ( rule__Select__Group__0 ) )
            // InternalSocialRequest.g:500:3: ( rule__Select__Group__0 )
            {
             before(grammarAccess.getSelectAccess().getGroup()); 
            // InternalSocialRequest.g:501:3: ( rule__Select__Group__0 )
            // InternalSocialRequest.g:501:4: rule__Select__Group__0
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
    // InternalSocialRequest.g:510:1: entryRuleFrom : ruleFrom EOF ;
    public final void entryRuleFrom() throws RecognitionException {
        try {
            // InternalSocialRequest.g:511:1: ( ruleFrom EOF )
            // InternalSocialRequest.g:512:1: ruleFrom EOF
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
    // InternalSocialRequest.g:519:1: ruleFrom : ( ( rule__From__Group__0 ) ) ;
    public final void ruleFrom() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:523:2: ( ( ( rule__From__Group__0 ) ) )
            // InternalSocialRequest.g:524:2: ( ( rule__From__Group__0 ) )
            {
            // InternalSocialRequest.g:524:2: ( ( rule__From__Group__0 ) )
            // InternalSocialRequest.g:525:3: ( rule__From__Group__0 )
            {
             before(grammarAccess.getFromAccess().getGroup()); 
            // InternalSocialRequest.g:526:3: ( rule__From__Group__0 )
            // InternalSocialRequest.g:526:4: rule__From__Group__0
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
    // InternalSocialRequest.g:535:1: entryRuleJoin : ruleJoin EOF ;
    public final void entryRuleJoin() throws RecognitionException {
        try {
            // InternalSocialRequest.g:536:1: ( ruleJoin EOF )
            // InternalSocialRequest.g:537:1: ruleJoin EOF
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
    // InternalSocialRequest.g:544:1: ruleJoin : ( ( rule__Join__Group__0 ) ) ;
    public final void ruleJoin() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:548:2: ( ( ( rule__Join__Group__0 ) ) )
            // InternalSocialRequest.g:549:2: ( ( rule__Join__Group__0 ) )
            {
            // InternalSocialRequest.g:549:2: ( ( rule__Join__Group__0 ) )
            // InternalSocialRequest.g:550:3: ( rule__Join__Group__0 )
            {
             before(grammarAccess.getJoinAccess().getGroup()); 
            // InternalSocialRequest.g:551:3: ( rule__Join__Group__0 )
            // InternalSocialRequest.g:551:4: rule__Join__Group__0
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
    // InternalSocialRequest.g:560:1: entryRuleWhere : ruleWhere EOF ;
    public final void entryRuleWhere() throws RecognitionException {
        try {
            // InternalSocialRequest.g:561:1: ( ruleWhere EOF )
            // InternalSocialRequest.g:562:1: ruleWhere EOF
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
    // InternalSocialRequest.g:569:1: ruleWhere : ( ( rule__Where__Group__0 ) ) ;
    public final void ruleWhere() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:573:2: ( ( ( rule__Where__Group__0 ) ) )
            // InternalSocialRequest.g:574:2: ( ( rule__Where__Group__0 ) )
            {
            // InternalSocialRequest.g:574:2: ( ( rule__Where__Group__0 ) )
            // InternalSocialRequest.g:575:3: ( rule__Where__Group__0 )
            {
             before(grammarAccess.getWhereAccess().getGroup()); 
            // InternalSocialRequest.g:576:3: ( rule__Where__Group__0 )
            // InternalSocialRequest.g:576:4: rule__Where__Group__0
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
    // InternalSocialRequest.g:585:1: entryRuleOrder : ruleOrder EOF ;
    public final void entryRuleOrder() throws RecognitionException {
        try {
            // InternalSocialRequest.g:586:1: ( ruleOrder EOF )
            // InternalSocialRequest.g:587:1: ruleOrder EOF
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
    // InternalSocialRequest.g:594:1: ruleOrder : ( ( rule__Order__Group__0 ) ) ;
    public final void ruleOrder() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:598:2: ( ( ( rule__Order__Group__0 ) ) )
            // InternalSocialRequest.g:599:2: ( ( rule__Order__Group__0 ) )
            {
            // InternalSocialRequest.g:599:2: ( ( rule__Order__Group__0 ) )
            // InternalSocialRequest.g:600:3: ( rule__Order__Group__0 )
            {
             before(grammarAccess.getOrderAccess().getGroup()); 
            // InternalSocialRequest.g:601:3: ( rule__Order__Group__0 )
            // InternalSocialRequest.g:601:4: rule__Order__Group__0
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


    // $ANTLR start "entryRuleFullPackageName"
    // InternalSocialRequest.g:610:1: entryRuleFullPackageName : ruleFullPackageName EOF ;
    public final void entryRuleFullPackageName() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalSocialRequest.g:614:1: ( ruleFullPackageName EOF )
            // InternalSocialRequest.g:615:1: ruleFullPackageName EOF
            {
             before(grammarAccess.getFullPackageNameRule()); 
            pushFollow(FOLLOW_1);
            ruleFullPackageName();

            state._fsp--;

             after(grammarAccess.getFullPackageNameRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "entryRuleFullPackageName"


    // $ANTLR start "ruleFullPackageName"
    // InternalSocialRequest.g:625:1: ruleFullPackageName : ( ( rule__FullPackageName__Group__0 ) ) ;
    public final void ruleFullPackageName() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:630:2: ( ( ( rule__FullPackageName__Group__0 ) ) )
            // InternalSocialRequest.g:631:2: ( ( rule__FullPackageName__Group__0 ) )
            {
            // InternalSocialRequest.g:631:2: ( ( rule__FullPackageName__Group__0 ) )
            // InternalSocialRequest.g:632:3: ( rule__FullPackageName__Group__0 )
            {
             before(grammarAccess.getFullPackageNameAccess().getGroup()); 
            // InternalSocialRequest.g:633:3: ( rule__FullPackageName__Group__0 )
            // InternalSocialRequest.g:633:4: rule__FullPackageName__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FullPackageName__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFullPackageNameAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);
            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "ruleFullPackageName"


    // $ANTLR start "ruleDataType"
    // InternalSocialRequest.g:643:1: ruleDataType : ( ( rule__DataType__Alternatives ) ) ;
    public final void ruleDataType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:647:1: ( ( ( rule__DataType__Alternatives ) ) )
            // InternalSocialRequest.g:648:2: ( ( rule__DataType__Alternatives ) )
            {
            // InternalSocialRequest.g:648:2: ( ( rule__DataType__Alternatives ) )
            // InternalSocialRequest.g:649:3: ( rule__DataType__Alternatives )
            {
             before(grammarAccess.getDataTypeAccess().getAlternatives()); 
            // InternalSocialRequest.g:650:3: ( rule__DataType__Alternatives )
            // InternalSocialRequest.g:650:4: rule__DataType__Alternatives
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
    // InternalSocialRequest.g:659:1: ruleJoinType : ( ( rule__JoinType__Alternatives ) ) ;
    public final void ruleJoinType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:663:1: ( ( ( rule__JoinType__Alternatives ) ) )
            // InternalSocialRequest.g:664:2: ( ( rule__JoinType__Alternatives ) )
            {
            // InternalSocialRequest.g:664:2: ( ( rule__JoinType__Alternatives ) )
            // InternalSocialRequest.g:665:3: ( rule__JoinType__Alternatives )
            {
             before(grammarAccess.getJoinTypeAccess().getAlternatives()); 
            // InternalSocialRequest.g:666:3: ( rule__JoinType__Alternatives )
            // InternalSocialRequest.g:666:4: rule__JoinType__Alternatives
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


    // $ANTLR start "rule__AbstractElement__Alternatives"
    // InternalSocialRequest.g:674:1: rule__AbstractElement__Alternatives : ( ( rulePackage ) | ( ruleEntity ) | ( ruleRepository ) );
    public final void rule__AbstractElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:678:1: ( ( rulePackage ) | ( ruleEntity ) | ( ruleRepository ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 34:
                {
                alt2=1;
                }
                break;
            case 38:
                {
                alt2=2;
                }
                break;
            case 49:
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
                    // InternalSocialRequest.g:679:2: ( rulePackage )
                    {
                    // InternalSocialRequest.g:679:2: ( rulePackage )
                    // InternalSocialRequest.g:680:3: rulePackage
                    {
                     before(grammarAccess.getAbstractElementAccess().getPackageParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    rulePackage();

                    state._fsp--;

                     after(grammarAccess.getAbstractElementAccess().getPackageParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSocialRequest.g:685:2: ( ruleEntity )
                    {
                    // InternalSocialRequest.g:685:2: ( ruleEntity )
                    // InternalSocialRequest.g:686:3: ruleEntity
                    {
                     before(grammarAccess.getAbstractElementAccess().getEntityParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleEntity();

                    state._fsp--;

                     after(grammarAccess.getAbstractElementAccess().getEntityParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSocialRequest.g:691:2: ( ruleRepository )
                    {
                    // InternalSocialRequest.g:691:2: ( ruleRepository )
                    // InternalSocialRequest.g:692:3: ruleRepository
                    {
                     before(grammarAccess.getAbstractElementAccess().getRepositoryParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleRepository();

                    state._fsp--;

                     after(grammarAccess.getAbstractElementAccess().getRepositoryParserRuleCall_2()); 

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
    // $ANTLR end "rule__AbstractElement__Alternatives"


    // $ANTLR start "rule__TypeReference__Alternatives"
    // InternalSocialRequest.g:701:1: rule__TypeReference__Alternatives : ( ( ruleEntityTypeReference ) | ( ruleDataTypeReference ) );
    public final void rule__TypeReference__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:705:1: ( ( ruleEntityTypeReference ) | ( ruleDataTypeReference ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID) ) {
                alt3=1;
            }
            else if ( ((LA3_0>=22 && LA3_0<=29)) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalSocialRequest.g:706:2: ( ruleEntityTypeReference )
                    {
                    // InternalSocialRequest.g:706:2: ( ruleEntityTypeReference )
                    // InternalSocialRequest.g:707:3: ruleEntityTypeReference
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
                    // InternalSocialRequest.g:712:2: ( ruleDataTypeReference )
                    {
                    // InternalSocialRequest.g:712:2: ( ruleDataTypeReference )
                    // InternalSocialRequest.g:713:3: ruleDataTypeReference
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
    // InternalSocialRequest.g:722:1: rule__Modifier__Alternatives : ( ( ( rule__Modifier__IsLOBAssignment_0 ) ) | ( ( rule__Modifier__IsTransientAssignment_1 ) ) | ( ( rule__Modifier__Group_2__0 ) ) );
    public final void rule__Modifier__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:726:1: ( ( ( rule__Modifier__IsLOBAssignment_0 ) ) | ( ( rule__Modifier__IsTransientAssignment_1 ) ) | ( ( rule__Modifier__Group_2__0 ) ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 59:
                {
                alt4=1;
                }
                break;
            case 60:
                {
                alt4=2;
                }
                break;
            case 61:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalSocialRequest.g:727:2: ( ( rule__Modifier__IsLOBAssignment_0 ) )
                    {
                    // InternalSocialRequest.g:727:2: ( ( rule__Modifier__IsLOBAssignment_0 ) )
                    // InternalSocialRequest.g:728:3: ( rule__Modifier__IsLOBAssignment_0 )
                    {
                     before(grammarAccess.getModifierAccess().getIsLOBAssignment_0()); 
                    // InternalSocialRequest.g:729:3: ( rule__Modifier__IsLOBAssignment_0 )
                    // InternalSocialRequest.g:729:4: rule__Modifier__IsLOBAssignment_0
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
                    // InternalSocialRequest.g:733:2: ( ( rule__Modifier__IsTransientAssignment_1 ) )
                    {
                    // InternalSocialRequest.g:733:2: ( ( rule__Modifier__IsTransientAssignment_1 ) )
                    // InternalSocialRequest.g:734:3: ( rule__Modifier__IsTransientAssignment_1 )
                    {
                     before(grammarAccess.getModifierAccess().getIsTransientAssignment_1()); 
                    // InternalSocialRequest.g:735:3: ( rule__Modifier__IsTransientAssignment_1 )
                    // InternalSocialRequest.g:735:4: rule__Modifier__IsTransientAssignment_1
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
                    // InternalSocialRequest.g:739:2: ( ( rule__Modifier__Group_2__0 ) )
                    {
                    // InternalSocialRequest.g:739:2: ( ( rule__Modifier__Group_2__0 ) )
                    // InternalSocialRequest.g:740:3: ( rule__Modifier__Group_2__0 )
                    {
                     before(grammarAccess.getModifierAccess().getGroup_2()); 
                    // InternalSocialRequest.g:741:3: ( rule__Modifier__Group_2__0 )
                    // InternalSocialRequest.g:741:4: rule__Modifier__Group_2__0
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
    // InternalSocialRequest.g:749:1: rule__Validation__Alternatives : ( ( ( rule__Validation__Group_0__0 ) ) | ( ( rule__Validation__Group_1__0 ) ) | ( ( rule__Validation__Group_2__0 ) ) | ( ( rule__Validation__ValidatorAssignment_3 ) ) | ( ( rule__Validation__UniqueAssignment_4 ) ) );
    public final void rule__Validation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:753:1: ( ( ( rule__Validation__Group_0__0 ) ) | ( ( rule__Validation__Group_1__0 ) ) | ( ( rule__Validation__Group_2__0 ) ) | ( ( rule__Validation__ValidatorAssignment_3 ) ) | ( ( rule__Validation__UniqueAssignment_4 ) ) )
            int alt5=5;
            switch ( input.LA(1) ) {
            case 46:
                {
                alt5=1;
                }
                break;
            case 47:
                {
                alt5=2;
                }
                break;
            case 48:
                {
                alt5=3;
                }
                break;
            case 14:
            case 15:
            case 16:
            case 17:
                {
                alt5=4;
                }
                break;
            case 62:
                {
                alt5=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalSocialRequest.g:754:2: ( ( rule__Validation__Group_0__0 ) )
                    {
                    // InternalSocialRequest.g:754:2: ( ( rule__Validation__Group_0__0 ) )
                    // InternalSocialRequest.g:755:3: ( rule__Validation__Group_0__0 )
                    {
                     before(grammarAccess.getValidationAccess().getGroup_0()); 
                    // InternalSocialRequest.g:756:3: ( rule__Validation__Group_0__0 )
                    // InternalSocialRequest.g:756:4: rule__Validation__Group_0__0
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
                    // InternalSocialRequest.g:760:2: ( ( rule__Validation__Group_1__0 ) )
                    {
                    // InternalSocialRequest.g:760:2: ( ( rule__Validation__Group_1__0 ) )
                    // InternalSocialRequest.g:761:3: ( rule__Validation__Group_1__0 )
                    {
                     before(grammarAccess.getValidationAccess().getGroup_1()); 
                    // InternalSocialRequest.g:762:3: ( rule__Validation__Group_1__0 )
                    // InternalSocialRequest.g:762:4: rule__Validation__Group_1__0
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
                    // InternalSocialRequest.g:766:2: ( ( rule__Validation__Group_2__0 ) )
                    {
                    // InternalSocialRequest.g:766:2: ( ( rule__Validation__Group_2__0 ) )
                    // InternalSocialRequest.g:767:3: ( rule__Validation__Group_2__0 )
                    {
                     before(grammarAccess.getValidationAccess().getGroup_2()); 
                    // InternalSocialRequest.g:768:3: ( rule__Validation__Group_2__0 )
                    // InternalSocialRequest.g:768:4: rule__Validation__Group_2__0
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
                    // InternalSocialRequest.g:772:2: ( ( rule__Validation__ValidatorAssignment_3 ) )
                    {
                    // InternalSocialRequest.g:772:2: ( ( rule__Validation__ValidatorAssignment_3 ) )
                    // InternalSocialRequest.g:773:3: ( rule__Validation__ValidatorAssignment_3 )
                    {
                     before(grammarAccess.getValidationAccess().getValidatorAssignment_3()); 
                    // InternalSocialRequest.g:774:3: ( rule__Validation__ValidatorAssignment_3 )
                    // InternalSocialRequest.g:774:4: rule__Validation__ValidatorAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Validation__ValidatorAssignment_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getValidationAccess().getValidatorAssignment_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalSocialRequest.g:778:2: ( ( rule__Validation__UniqueAssignment_4 ) )
                    {
                    // InternalSocialRequest.g:778:2: ( ( rule__Validation__UniqueAssignment_4 ) )
                    // InternalSocialRequest.g:779:3: ( rule__Validation__UniqueAssignment_4 )
                    {
                     before(grammarAccess.getValidationAccess().getUniqueAssignment_4()); 
                    // InternalSocialRequest.g:780:3: ( rule__Validation__UniqueAssignment_4 )
                    // InternalSocialRequest.g:780:4: rule__Validation__UniqueAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__Validation__UniqueAssignment_4();

                    state._fsp--;


                    }

                     after(grammarAccess.getValidationAccess().getUniqueAssignment_4()); 

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
    // InternalSocialRequest.g:788:1: rule__BASICVALIDATION__Alternatives : ( ( 'NotNull' ) | ( 'NotBlank' ) | ( 'Past' ) | ( 'Email' ) );
    public final void rule__BASICVALIDATION__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:792:1: ( ( 'NotNull' ) | ( 'NotBlank' ) | ( 'Past' ) | ( 'Email' ) )
            int alt6=4;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt6=1;
                }
                break;
            case 15:
                {
                alt6=2;
                }
                break;
            case 16:
                {
                alt6=3;
                }
                break;
            case 17:
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
                    // InternalSocialRequest.g:793:2: ( 'NotNull' )
                    {
                    // InternalSocialRequest.g:793:2: ( 'NotNull' )
                    // InternalSocialRequest.g:794:3: 'NotNull'
                    {
                     before(grammarAccess.getBASICVALIDATIONAccess().getNotNullKeyword_0()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getBASICVALIDATIONAccess().getNotNullKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSocialRequest.g:799:2: ( 'NotBlank' )
                    {
                    // InternalSocialRequest.g:799:2: ( 'NotBlank' )
                    // InternalSocialRequest.g:800:3: 'NotBlank'
                    {
                     before(grammarAccess.getBASICVALIDATIONAccess().getNotBlankKeyword_1()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getBASICVALIDATIONAccess().getNotBlankKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSocialRequest.g:805:2: ( 'Past' )
                    {
                    // InternalSocialRequest.g:805:2: ( 'Past' )
                    // InternalSocialRequest.g:806:3: 'Past'
                    {
                     before(grammarAccess.getBASICVALIDATIONAccess().getPastKeyword_2()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getBASICVALIDATIONAccess().getPastKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalSocialRequest.g:811:2: ( 'Email' )
                    {
                    // InternalSocialRequest.g:811:2: ( 'Email' )
                    // InternalSocialRequest.g:812:3: 'Email'
                    {
                     before(grammarAccess.getBASICVALIDATIONAccess().getEmailKeyword_3()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getBASICVALIDATIONAccess().getEmailKeyword_3()); 

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
    // InternalSocialRequest.g:821:1: rule__ASSOCIATION__Alternatives : ( ( 'OneToMany' ) | ( 'ManyToOne' ) | ( 'OneToOne' ) | ( 'ManyToMany' ) );
    public final void rule__ASSOCIATION__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:825:1: ( ( 'OneToMany' ) | ( 'ManyToOne' ) | ( 'OneToOne' ) | ( 'ManyToMany' ) )
            int alt7=4;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt7=1;
                }
                break;
            case 19:
                {
                alt7=2;
                }
                break;
            case 20:
                {
                alt7=3;
                }
                break;
            case 21:
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
                    // InternalSocialRequest.g:826:2: ( 'OneToMany' )
                    {
                    // InternalSocialRequest.g:826:2: ( 'OneToMany' )
                    // InternalSocialRequest.g:827:3: 'OneToMany'
                    {
                     before(grammarAccess.getASSOCIATIONAccess().getOneToManyKeyword_0()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getASSOCIATIONAccess().getOneToManyKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSocialRequest.g:832:2: ( 'ManyToOne' )
                    {
                    // InternalSocialRequest.g:832:2: ( 'ManyToOne' )
                    // InternalSocialRequest.g:833:3: 'ManyToOne'
                    {
                     before(grammarAccess.getASSOCIATIONAccess().getManyToOneKeyword_1()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getASSOCIATIONAccess().getManyToOneKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSocialRequest.g:838:2: ( 'OneToOne' )
                    {
                    // InternalSocialRequest.g:838:2: ( 'OneToOne' )
                    // InternalSocialRequest.g:839:3: 'OneToOne'
                    {
                     before(grammarAccess.getASSOCIATIONAccess().getOneToOneKeyword_2()); 
                    match(input,20,FOLLOW_2); 
                     after(grammarAccess.getASSOCIATIONAccess().getOneToOneKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalSocialRequest.g:844:2: ( 'ManyToMany' )
                    {
                    // InternalSocialRequest.g:844:2: ( 'ManyToMany' )
                    // InternalSocialRequest.g:845:3: 'ManyToMany'
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


    // $ANTLR start "rule__DataType__Alternatives"
    // InternalSocialRequest.g:854:1: rule__DataType__Alternatives : ( ( ( 'String' ) ) | ( ( 'long' ) ) | ( ( 'float' ) ) | ( ( 'double' ) ) | ( ( 'char' ) ) | ( ( 'int' ) ) | ( ( 'boolean' ) ) | ( ( 'Date' ) ) );
    public final void rule__DataType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:858:1: ( ( ( 'String' ) ) | ( ( 'long' ) ) | ( ( 'float' ) ) | ( ( 'double' ) ) | ( ( 'char' ) ) | ( ( 'int' ) ) | ( ( 'boolean' ) ) | ( ( 'Date' ) ) )
            int alt8=8;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt8=1;
                }
                break;
            case 23:
                {
                alt8=2;
                }
                break;
            case 24:
                {
                alt8=3;
                }
                break;
            case 25:
                {
                alt8=4;
                }
                break;
            case 26:
                {
                alt8=5;
                }
                break;
            case 27:
                {
                alt8=6;
                }
                break;
            case 28:
                {
                alt8=7;
                }
                break;
            case 29:
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
                    // InternalSocialRequest.g:859:2: ( ( 'String' ) )
                    {
                    // InternalSocialRequest.g:859:2: ( ( 'String' ) )
                    // InternalSocialRequest.g:860:3: ( 'String' )
                    {
                     before(grammarAccess.getDataTypeAccess().getSTRINGEnumLiteralDeclaration_0()); 
                    // InternalSocialRequest.g:861:3: ( 'String' )
                    // InternalSocialRequest.g:861:4: 'String'
                    {
                    match(input,22,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataTypeAccess().getSTRINGEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSocialRequest.g:865:2: ( ( 'long' ) )
                    {
                    // InternalSocialRequest.g:865:2: ( ( 'long' ) )
                    // InternalSocialRequest.g:866:3: ( 'long' )
                    {
                     before(grammarAccess.getDataTypeAccess().getLONGEnumLiteralDeclaration_1()); 
                    // InternalSocialRequest.g:867:3: ( 'long' )
                    // InternalSocialRequest.g:867:4: 'long'
                    {
                    match(input,23,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataTypeAccess().getLONGEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSocialRequest.g:871:2: ( ( 'float' ) )
                    {
                    // InternalSocialRequest.g:871:2: ( ( 'float' ) )
                    // InternalSocialRequest.g:872:3: ( 'float' )
                    {
                     before(grammarAccess.getDataTypeAccess().getFLOATEnumLiteralDeclaration_2()); 
                    // InternalSocialRequest.g:873:3: ( 'float' )
                    // InternalSocialRequest.g:873:4: 'float'
                    {
                    match(input,24,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataTypeAccess().getFLOATEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalSocialRequest.g:877:2: ( ( 'double' ) )
                    {
                    // InternalSocialRequest.g:877:2: ( ( 'double' ) )
                    // InternalSocialRequest.g:878:3: ( 'double' )
                    {
                     before(grammarAccess.getDataTypeAccess().getDOUBLEEnumLiteralDeclaration_3()); 
                    // InternalSocialRequest.g:879:3: ( 'double' )
                    // InternalSocialRequest.g:879:4: 'double'
                    {
                    match(input,25,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataTypeAccess().getDOUBLEEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalSocialRequest.g:883:2: ( ( 'char' ) )
                    {
                    // InternalSocialRequest.g:883:2: ( ( 'char' ) )
                    // InternalSocialRequest.g:884:3: ( 'char' )
                    {
                     before(grammarAccess.getDataTypeAccess().getCHAREnumLiteralDeclaration_4()); 
                    // InternalSocialRequest.g:885:3: ( 'char' )
                    // InternalSocialRequest.g:885:4: 'char'
                    {
                    match(input,26,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataTypeAccess().getCHAREnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalSocialRequest.g:889:2: ( ( 'int' ) )
                    {
                    // InternalSocialRequest.g:889:2: ( ( 'int' ) )
                    // InternalSocialRequest.g:890:3: ( 'int' )
                    {
                     before(grammarAccess.getDataTypeAccess().getINTEnumLiteralDeclaration_5()); 
                    // InternalSocialRequest.g:891:3: ( 'int' )
                    // InternalSocialRequest.g:891:4: 'int'
                    {
                    match(input,27,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataTypeAccess().getINTEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalSocialRequest.g:895:2: ( ( 'boolean' ) )
                    {
                    // InternalSocialRequest.g:895:2: ( ( 'boolean' ) )
                    // InternalSocialRequest.g:896:3: ( 'boolean' )
                    {
                     before(grammarAccess.getDataTypeAccess().getBOOLEANEnumLiteralDeclaration_6()); 
                    // InternalSocialRequest.g:897:3: ( 'boolean' )
                    // InternalSocialRequest.g:897:4: 'boolean'
                    {
                    match(input,28,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataTypeAccess().getBOOLEANEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalSocialRequest.g:901:2: ( ( 'Date' ) )
                    {
                    // InternalSocialRequest.g:901:2: ( ( 'Date' ) )
                    // InternalSocialRequest.g:902:3: ( 'Date' )
                    {
                     before(grammarAccess.getDataTypeAccess().getDATEEnumLiteralDeclaration_7()); 
                    // InternalSocialRequest.g:903:3: ( 'Date' )
                    // InternalSocialRequest.g:903:4: 'Date'
                    {
                    match(input,29,FOLLOW_2); 

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
    // InternalSocialRequest.g:911:1: rule__JoinType__Alternatives : ( ( ( 'LEFT JOIN' ) ) | ( ( 'LEFT OUTER JOIN' ) ) | ( ( 'CROSS JOIN' ) ) | ( ( 'JOIN' ) ) );
    public final void rule__JoinType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:915:1: ( ( ( 'LEFT JOIN' ) ) | ( ( 'LEFT OUTER JOIN' ) ) | ( ( 'CROSS JOIN' ) ) | ( ( 'JOIN' ) ) )
            int alt9=4;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt9=1;
                }
                break;
            case 31:
                {
                alt9=2;
                }
                break;
            case 32:
                {
                alt9=3;
                }
                break;
            case 33:
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
                    // InternalSocialRequest.g:916:2: ( ( 'LEFT JOIN' ) )
                    {
                    // InternalSocialRequest.g:916:2: ( ( 'LEFT JOIN' ) )
                    // InternalSocialRequest.g:917:3: ( 'LEFT JOIN' )
                    {
                     before(grammarAccess.getJoinTypeAccess().getLEFT_JOINEnumLiteralDeclaration_0()); 
                    // InternalSocialRequest.g:918:3: ( 'LEFT JOIN' )
                    // InternalSocialRequest.g:918:4: 'LEFT JOIN'
                    {
                    match(input,30,FOLLOW_2); 

                    }

                     after(grammarAccess.getJoinTypeAccess().getLEFT_JOINEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSocialRequest.g:922:2: ( ( 'LEFT OUTER JOIN' ) )
                    {
                    // InternalSocialRequest.g:922:2: ( ( 'LEFT OUTER JOIN' ) )
                    // InternalSocialRequest.g:923:3: ( 'LEFT OUTER JOIN' )
                    {
                     before(grammarAccess.getJoinTypeAccess().getLEFT_OUTER_JOINEnumLiteralDeclaration_1()); 
                    // InternalSocialRequest.g:924:3: ( 'LEFT OUTER JOIN' )
                    // InternalSocialRequest.g:924:4: 'LEFT OUTER JOIN'
                    {
                    match(input,31,FOLLOW_2); 

                    }

                     after(grammarAccess.getJoinTypeAccess().getLEFT_OUTER_JOINEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSocialRequest.g:928:2: ( ( 'CROSS JOIN' ) )
                    {
                    // InternalSocialRequest.g:928:2: ( ( 'CROSS JOIN' ) )
                    // InternalSocialRequest.g:929:3: ( 'CROSS JOIN' )
                    {
                     before(grammarAccess.getJoinTypeAccess().getCROSS_JOINEnumLiteralDeclaration_2()); 
                    // InternalSocialRequest.g:930:3: ( 'CROSS JOIN' )
                    // InternalSocialRequest.g:930:4: 'CROSS JOIN'
                    {
                    match(input,32,FOLLOW_2); 

                    }

                     after(grammarAccess.getJoinTypeAccess().getCROSS_JOINEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalSocialRequest.g:934:2: ( ( 'JOIN' ) )
                    {
                    // InternalSocialRequest.g:934:2: ( ( 'JOIN' ) )
                    // InternalSocialRequest.g:935:3: ( 'JOIN' )
                    {
                     before(grammarAccess.getJoinTypeAccess().getJOINEnumLiteralDeclaration_3()); 
                    // InternalSocialRequest.g:936:3: ( 'JOIN' )
                    // InternalSocialRequest.g:936:4: 'JOIN'
                    {
                    match(input,33,FOLLOW_2); 

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


    // $ANTLR start "rule__Package__Group__0"
    // InternalSocialRequest.g:944:1: rule__Package__Group__0 : rule__Package__Group__0__Impl rule__Package__Group__1 ;
    public final void rule__Package__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:948:1: ( rule__Package__Group__0__Impl rule__Package__Group__1 )
            // InternalSocialRequest.g:949:2: rule__Package__Group__0__Impl rule__Package__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Package__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Package__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__0"


    // $ANTLR start "rule__Package__Group__0__Impl"
    // InternalSocialRequest.g:956:1: rule__Package__Group__0__Impl : ( 'package' ) ;
    public final void rule__Package__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:960:1: ( ( 'package' ) )
            // InternalSocialRequest.g:961:1: ( 'package' )
            {
            // InternalSocialRequest.g:961:1: ( 'package' )
            // InternalSocialRequest.g:962:2: 'package'
            {
             before(grammarAccess.getPackageAccess().getPackageKeyword_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getPackageAccess().getPackageKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__0__Impl"


    // $ANTLR start "rule__Package__Group__1"
    // InternalSocialRequest.g:971:1: rule__Package__Group__1 : rule__Package__Group__1__Impl rule__Package__Group__2 ;
    public final void rule__Package__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:975:1: ( rule__Package__Group__1__Impl rule__Package__Group__2 )
            // InternalSocialRequest.g:976:2: rule__Package__Group__1__Impl rule__Package__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Package__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Package__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__1"


    // $ANTLR start "rule__Package__Group__1__Impl"
    // InternalSocialRequest.g:983:1: rule__Package__Group__1__Impl : ( ( rule__Package__NameAssignment_1 ) ) ;
    public final void rule__Package__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:987:1: ( ( ( rule__Package__NameAssignment_1 ) ) )
            // InternalSocialRequest.g:988:1: ( ( rule__Package__NameAssignment_1 ) )
            {
            // InternalSocialRequest.g:988:1: ( ( rule__Package__NameAssignment_1 ) )
            // InternalSocialRequest.g:989:2: ( rule__Package__NameAssignment_1 )
            {
             before(grammarAccess.getPackageAccess().getNameAssignment_1()); 
            // InternalSocialRequest.g:990:2: ( rule__Package__NameAssignment_1 )
            // InternalSocialRequest.g:990:3: rule__Package__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Package__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPackageAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__1__Impl"


    // $ANTLR start "rule__Package__Group__2"
    // InternalSocialRequest.g:998:1: rule__Package__Group__2 : rule__Package__Group__2__Impl rule__Package__Group__3 ;
    public final void rule__Package__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1002:1: ( rule__Package__Group__2__Impl rule__Package__Group__3 )
            // InternalSocialRequest.g:1003:2: rule__Package__Group__2__Impl rule__Package__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Package__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Package__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__2"


    // $ANTLR start "rule__Package__Group__2__Impl"
    // InternalSocialRequest.g:1010:1: rule__Package__Group__2__Impl : ( '{' ) ;
    public final void rule__Package__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1014:1: ( ( '{' ) )
            // InternalSocialRequest.g:1015:1: ( '{' )
            {
            // InternalSocialRequest.g:1015:1: ( '{' )
            // InternalSocialRequest.g:1016:2: '{'
            {
             before(grammarAccess.getPackageAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getPackageAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__2__Impl"


    // $ANTLR start "rule__Package__Group__3"
    // InternalSocialRequest.g:1025:1: rule__Package__Group__3 : rule__Package__Group__3__Impl rule__Package__Group__4 ;
    public final void rule__Package__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1029:1: ( rule__Package__Group__3__Impl rule__Package__Group__4 )
            // InternalSocialRequest.g:1030:2: rule__Package__Group__3__Impl rule__Package__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Package__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Package__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__3"


    // $ANTLR start "rule__Package__Group__3__Impl"
    // InternalSocialRequest.g:1037:1: rule__Package__Group__3__Impl : ( ( rule__Package__ElementsAssignment_3 )* ) ;
    public final void rule__Package__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1041:1: ( ( ( rule__Package__ElementsAssignment_3 )* ) )
            // InternalSocialRequest.g:1042:1: ( ( rule__Package__ElementsAssignment_3 )* )
            {
            // InternalSocialRequest.g:1042:1: ( ( rule__Package__ElementsAssignment_3 )* )
            // InternalSocialRequest.g:1043:2: ( rule__Package__ElementsAssignment_3 )*
            {
             before(grammarAccess.getPackageAccess().getElementsAssignment_3()); 
            // InternalSocialRequest.g:1044:2: ( rule__Package__ElementsAssignment_3 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==34||LA10_0==38||LA10_0==49) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalSocialRequest.g:1044:3: rule__Package__ElementsAssignment_3
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Package__ElementsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getPackageAccess().getElementsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__3__Impl"


    // $ANTLR start "rule__Package__Group__4"
    // InternalSocialRequest.g:1052:1: rule__Package__Group__4 : rule__Package__Group__4__Impl ;
    public final void rule__Package__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1056:1: ( rule__Package__Group__4__Impl )
            // InternalSocialRequest.g:1057:2: rule__Package__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Package__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__4"


    // $ANTLR start "rule__Package__Group__4__Impl"
    // InternalSocialRequest.g:1063:1: rule__Package__Group__4__Impl : ( '}' ) ;
    public final void rule__Package__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1067:1: ( ( '}' ) )
            // InternalSocialRequest.g:1068:1: ( '}' )
            {
            // InternalSocialRequest.g:1068:1: ( '}' )
            // InternalSocialRequest.g:1069:2: '}'
            {
             before(grammarAccess.getPackageAccess().getRightCurlyBracketKeyword_4()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getPackageAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__4__Impl"


    // $ANTLR start "rule__PointSeperatedID__Group__0"
    // InternalSocialRequest.g:1079:1: rule__PointSeperatedID__Group__0 : rule__PointSeperatedID__Group__0__Impl rule__PointSeperatedID__Group__1 ;
    public final void rule__PointSeperatedID__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1083:1: ( rule__PointSeperatedID__Group__0__Impl rule__PointSeperatedID__Group__1 )
            // InternalSocialRequest.g:1084:2: rule__PointSeperatedID__Group__0__Impl rule__PointSeperatedID__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__PointSeperatedID__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PointSeperatedID__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PointSeperatedID__Group__0"


    // $ANTLR start "rule__PointSeperatedID__Group__0__Impl"
    // InternalSocialRequest.g:1091:1: rule__PointSeperatedID__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__PointSeperatedID__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1095:1: ( ( RULE_ID ) )
            // InternalSocialRequest.g:1096:1: ( RULE_ID )
            {
            // InternalSocialRequest.g:1096:1: ( RULE_ID )
            // InternalSocialRequest.g:1097:2: RULE_ID
            {
             before(grammarAccess.getPointSeperatedIDAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPointSeperatedIDAccess().getIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PointSeperatedID__Group__0__Impl"


    // $ANTLR start "rule__PointSeperatedID__Group__1"
    // InternalSocialRequest.g:1106:1: rule__PointSeperatedID__Group__1 : rule__PointSeperatedID__Group__1__Impl ;
    public final void rule__PointSeperatedID__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1110:1: ( rule__PointSeperatedID__Group__1__Impl )
            // InternalSocialRequest.g:1111:2: rule__PointSeperatedID__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PointSeperatedID__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PointSeperatedID__Group__1"


    // $ANTLR start "rule__PointSeperatedID__Group__1__Impl"
    // InternalSocialRequest.g:1117:1: rule__PointSeperatedID__Group__1__Impl : ( ( rule__PointSeperatedID__Group_1__0 )* ) ;
    public final void rule__PointSeperatedID__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1121:1: ( ( ( rule__PointSeperatedID__Group_1__0 )* ) )
            // InternalSocialRequest.g:1122:1: ( ( rule__PointSeperatedID__Group_1__0 )* )
            {
            // InternalSocialRequest.g:1122:1: ( ( rule__PointSeperatedID__Group_1__0 )* )
            // InternalSocialRequest.g:1123:2: ( rule__PointSeperatedID__Group_1__0 )*
            {
             before(grammarAccess.getPointSeperatedIDAccess().getGroup_1()); 
            // InternalSocialRequest.g:1124:2: ( rule__PointSeperatedID__Group_1__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==37) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalSocialRequest.g:1124:3: rule__PointSeperatedID__Group_1__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__PointSeperatedID__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getPointSeperatedIDAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PointSeperatedID__Group__1__Impl"


    // $ANTLR start "rule__PointSeperatedID__Group_1__0"
    // InternalSocialRequest.g:1133:1: rule__PointSeperatedID__Group_1__0 : rule__PointSeperatedID__Group_1__0__Impl rule__PointSeperatedID__Group_1__1 ;
    public final void rule__PointSeperatedID__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1137:1: ( rule__PointSeperatedID__Group_1__0__Impl rule__PointSeperatedID__Group_1__1 )
            // InternalSocialRequest.g:1138:2: rule__PointSeperatedID__Group_1__0__Impl rule__PointSeperatedID__Group_1__1
            {
            pushFollow(FOLLOW_4);
            rule__PointSeperatedID__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PointSeperatedID__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PointSeperatedID__Group_1__0"


    // $ANTLR start "rule__PointSeperatedID__Group_1__0__Impl"
    // InternalSocialRequest.g:1145:1: rule__PointSeperatedID__Group_1__0__Impl : ( '.' ) ;
    public final void rule__PointSeperatedID__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1149:1: ( ( '.' ) )
            // InternalSocialRequest.g:1150:1: ( '.' )
            {
            // InternalSocialRequest.g:1150:1: ( '.' )
            // InternalSocialRequest.g:1151:2: '.'
            {
             before(grammarAccess.getPointSeperatedIDAccess().getFullStopKeyword_1_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getPointSeperatedIDAccess().getFullStopKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PointSeperatedID__Group_1__0__Impl"


    // $ANTLR start "rule__PointSeperatedID__Group_1__1"
    // InternalSocialRequest.g:1160:1: rule__PointSeperatedID__Group_1__1 : rule__PointSeperatedID__Group_1__1__Impl ;
    public final void rule__PointSeperatedID__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1164:1: ( rule__PointSeperatedID__Group_1__1__Impl )
            // InternalSocialRequest.g:1165:2: rule__PointSeperatedID__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PointSeperatedID__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PointSeperatedID__Group_1__1"


    // $ANTLR start "rule__PointSeperatedID__Group_1__1__Impl"
    // InternalSocialRequest.g:1171:1: rule__PointSeperatedID__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__PointSeperatedID__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1175:1: ( ( RULE_ID ) )
            // InternalSocialRequest.g:1176:1: ( RULE_ID )
            {
            // InternalSocialRequest.g:1176:1: ( RULE_ID )
            // InternalSocialRequest.g:1177:2: RULE_ID
            {
             before(grammarAccess.getPointSeperatedIDAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPointSeperatedIDAccess().getIDTerminalRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PointSeperatedID__Group_1__1__Impl"


    // $ANTLR start "rule__Entity__Group__0"
    // InternalSocialRequest.g:1187:1: rule__Entity__Group__0 : rule__Entity__Group__0__Impl rule__Entity__Group__1 ;
    public final void rule__Entity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1191:1: ( rule__Entity__Group__0__Impl rule__Entity__Group__1 )
            // InternalSocialRequest.g:1192:2: rule__Entity__Group__0__Impl rule__Entity__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalSocialRequest.g:1199:1: rule__Entity__Group__0__Impl : ( 'Entity' ) ;
    public final void rule__Entity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1203:1: ( ( 'Entity' ) )
            // InternalSocialRequest.g:1204:1: ( 'Entity' )
            {
            // InternalSocialRequest.g:1204:1: ( 'Entity' )
            // InternalSocialRequest.g:1205:2: 'Entity'
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
    // InternalSocialRequest.g:1214:1: rule__Entity__Group__1 : rule__Entity__Group__1__Impl rule__Entity__Group__2 ;
    public final void rule__Entity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1218:1: ( rule__Entity__Group__1__Impl rule__Entity__Group__2 )
            // InternalSocialRequest.g:1219:2: rule__Entity__Group__1__Impl rule__Entity__Group__2
            {
            pushFollow(FOLLOW_9);
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
    // InternalSocialRequest.g:1226:1: rule__Entity__Group__1__Impl : ( ( rule__Entity__NameAssignment_1 ) ) ;
    public final void rule__Entity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1230:1: ( ( ( rule__Entity__NameAssignment_1 ) ) )
            // InternalSocialRequest.g:1231:1: ( ( rule__Entity__NameAssignment_1 ) )
            {
            // InternalSocialRequest.g:1231:1: ( ( rule__Entity__NameAssignment_1 ) )
            // InternalSocialRequest.g:1232:2: ( rule__Entity__NameAssignment_1 )
            {
             before(grammarAccess.getEntityAccess().getNameAssignment_1()); 
            // InternalSocialRequest.g:1233:2: ( rule__Entity__NameAssignment_1 )
            // InternalSocialRequest.g:1233:3: rule__Entity__NameAssignment_1
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
    // InternalSocialRequest.g:1241:1: rule__Entity__Group__2 : rule__Entity__Group__2__Impl rule__Entity__Group__3 ;
    public final void rule__Entity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1245:1: ( rule__Entity__Group__2__Impl rule__Entity__Group__3 )
            // InternalSocialRequest.g:1246:2: rule__Entity__Group__2__Impl rule__Entity__Group__3
            {
            pushFollow(FOLLOW_9);
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
    // InternalSocialRequest.g:1253:1: rule__Entity__Group__2__Impl : ( ( rule__Entity__Group_2__0 )? ) ;
    public final void rule__Entity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1257:1: ( ( ( rule__Entity__Group_2__0 )? ) )
            // InternalSocialRequest.g:1258:1: ( ( rule__Entity__Group_2__0 )? )
            {
            // InternalSocialRequest.g:1258:1: ( ( rule__Entity__Group_2__0 )? )
            // InternalSocialRequest.g:1259:2: ( rule__Entity__Group_2__0 )?
            {
             before(grammarAccess.getEntityAccess().getGroup_2()); 
            // InternalSocialRequest.g:1260:2: ( rule__Entity__Group_2__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==58) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalSocialRequest.g:1260:3: rule__Entity__Group_2__0
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
    // InternalSocialRequest.g:1268:1: rule__Entity__Group__3 : rule__Entity__Group__3__Impl rule__Entity__Group__4 ;
    public final void rule__Entity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1272:1: ( rule__Entity__Group__3__Impl rule__Entity__Group__4 )
            // InternalSocialRequest.g:1273:2: rule__Entity__Group__3__Impl rule__Entity__Group__4
            {
            pushFollow(FOLLOW_10);
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
    // InternalSocialRequest.g:1280:1: rule__Entity__Group__3__Impl : ( '{' ) ;
    public final void rule__Entity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1284:1: ( ( '{' ) )
            // InternalSocialRequest.g:1285:1: ( '{' )
            {
            // InternalSocialRequest.g:1285:1: ( '{' )
            // InternalSocialRequest.g:1286:2: '{'
            {
             before(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,35,FOLLOW_2); 
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
    // InternalSocialRequest.g:1295:1: rule__Entity__Group__4 : rule__Entity__Group__4__Impl rule__Entity__Group__5 ;
    public final void rule__Entity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1299:1: ( rule__Entity__Group__4__Impl rule__Entity__Group__5 )
            // InternalSocialRequest.g:1300:2: rule__Entity__Group__4__Impl rule__Entity__Group__5
            {
            pushFollow(FOLLOW_11);
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
    // InternalSocialRequest.g:1307:1: rule__Entity__Group__4__Impl : ( ( ( rule__Entity__AttributesAssignment_4 ) ) ( ( rule__Entity__AttributesAssignment_4 )* ) ) ;
    public final void rule__Entity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1311:1: ( ( ( ( rule__Entity__AttributesAssignment_4 ) ) ( ( rule__Entity__AttributesAssignment_4 )* ) ) )
            // InternalSocialRequest.g:1312:1: ( ( ( rule__Entity__AttributesAssignment_4 ) ) ( ( rule__Entity__AttributesAssignment_4 )* ) )
            {
            // InternalSocialRequest.g:1312:1: ( ( ( rule__Entity__AttributesAssignment_4 ) ) ( ( rule__Entity__AttributesAssignment_4 )* ) )
            // InternalSocialRequest.g:1313:2: ( ( rule__Entity__AttributesAssignment_4 ) ) ( ( rule__Entity__AttributesAssignment_4 )* )
            {
            // InternalSocialRequest.g:1313:2: ( ( rule__Entity__AttributesAssignment_4 ) )
            // InternalSocialRequest.g:1314:3: ( rule__Entity__AttributesAssignment_4 )
            {
             before(grammarAccess.getEntityAccess().getAttributesAssignment_4()); 
            // InternalSocialRequest.g:1315:3: ( rule__Entity__AttributesAssignment_4 )
            // InternalSocialRequest.g:1315:4: rule__Entity__AttributesAssignment_4
            {
            pushFollow(FOLLOW_12);
            rule__Entity__AttributesAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getAttributesAssignment_4()); 

            }

            // InternalSocialRequest.g:1318:2: ( ( rule__Entity__AttributesAssignment_4 )* )
            // InternalSocialRequest.g:1319:3: ( rule__Entity__AttributesAssignment_4 )*
            {
             before(grammarAccess.getEntityAccess().getAttributesAssignment_4()); 
            // InternalSocialRequest.g:1320:3: ( rule__Entity__AttributesAssignment_4 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_ID||(LA13_0>=18 && LA13_0<=21)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalSocialRequest.g:1320:4: rule__Entity__AttributesAssignment_4
            	    {
            	    pushFollow(FOLLOW_12);
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
    // InternalSocialRequest.g:1329:1: rule__Entity__Group__5 : rule__Entity__Group__5__Impl ;
    public final void rule__Entity__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1333:1: ( rule__Entity__Group__5__Impl )
            // InternalSocialRequest.g:1334:2: rule__Entity__Group__5__Impl
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
    // InternalSocialRequest.g:1340:1: rule__Entity__Group__5__Impl : ( '}' ) ;
    public final void rule__Entity__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1344:1: ( ( '}' ) )
            // InternalSocialRequest.g:1345:1: ( '}' )
            {
            // InternalSocialRequest.g:1345:1: ( '}' )
            // InternalSocialRequest.g:1346:2: '}'
            {
             before(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_5()); 
            match(input,36,FOLLOW_2); 
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
    // InternalSocialRequest.g:1356:1: rule__Entity__Group_2__0 : rule__Entity__Group_2__0__Impl rule__Entity__Group_2__1 ;
    public final void rule__Entity__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1360:1: ( rule__Entity__Group_2__0__Impl rule__Entity__Group_2__1 )
            // InternalSocialRequest.g:1361:2: rule__Entity__Group_2__0__Impl rule__Entity__Group_2__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalSocialRequest.g:1368:1: rule__Entity__Group_2__0__Impl : ( ( rule__Entity__HasUserDetailsAssignment_2_0 ) ) ;
    public final void rule__Entity__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1372:1: ( ( ( rule__Entity__HasUserDetailsAssignment_2_0 ) ) )
            // InternalSocialRequest.g:1373:1: ( ( rule__Entity__HasUserDetailsAssignment_2_0 ) )
            {
            // InternalSocialRequest.g:1373:1: ( ( rule__Entity__HasUserDetailsAssignment_2_0 ) )
            // InternalSocialRequest.g:1374:2: ( rule__Entity__HasUserDetailsAssignment_2_0 )
            {
             before(grammarAccess.getEntityAccess().getHasUserDetailsAssignment_2_0()); 
            // InternalSocialRequest.g:1375:2: ( rule__Entity__HasUserDetailsAssignment_2_0 )
            // InternalSocialRequest.g:1375:3: rule__Entity__HasUserDetailsAssignment_2_0
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
    // InternalSocialRequest.g:1383:1: rule__Entity__Group_2__1 : rule__Entity__Group_2__1__Impl ;
    public final void rule__Entity__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1387:1: ( rule__Entity__Group_2__1__Impl )
            // InternalSocialRequest.g:1388:2: rule__Entity__Group_2__1__Impl
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
    // InternalSocialRequest.g:1394:1: rule__Entity__Group_2__1__Impl : ( 'UserDetails' ) ;
    public final void rule__Entity__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1398:1: ( ( 'UserDetails' ) )
            // InternalSocialRequest.g:1399:1: ( 'UserDetails' )
            {
            // InternalSocialRequest.g:1399:1: ( 'UserDetails' )
            // InternalSocialRequest.g:1400:2: 'UserDetails'
            {
             before(grammarAccess.getEntityAccess().getUserDetailsKeyword_2_1()); 
            match(input,39,FOLLOW_2); 
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
    // InternalSocialRequest.g:1410:1: rule__Attribute__Group__0 : rule__Attribute__Group__0__Impl rule__Attribute__Group__1 ;
    public final void rule__Attribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1414:1: ( rule__Attribute__Group__0__Impl rule__Attribute__Group__1 )
            // InternalSocialRequest.g:1415:2: rule__Attribute__Group__0__Impl rule__Attribute__Group__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalSocialRequest.g:1422:1: rule__Attribute__Group__0__Impl : ( ( rule__Attribute__AssociationAssignment_0 )? ) ;
    public final void rule__Attribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1426:1: ( ( ( rule__Attribute__AssociationAssignment_0 )? ) )
            // InternalSocialRequest.g:1427:1: ( ( rule__Attribute__AssociationAssignment_0 )? )
            {
            // InternalSocialRequest.g:1427:1: ( ( rule__Attribute__AssociationAssignment_0 )? )
            // InternalSocialRequest.g:1428:2: ( rule__Attribute__AssociationAssignment_0 )?
            {
             before(grammarAccess.getAttributeAccess().getAssociationAssignment_0()); 
            // InternalSocialRequest.g:1429:2: ( rule__Attribute__AssociationAssignment_0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>=18 && LA14_0<=21)) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalSocialRequest.g:1429:3: rule__Attribute__AssociationAssignment_0
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
    // InternalSocialRequest.g:1437:1: rule__Attribute__Group__1 : rule__Attribute__Group__1__Impl rule__Attribute__Group__2 ;
    public final void rule__Attribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1441:1: ( rule__Attribute__Group__1__Impl rule__Attribute__Group__2 )
            // InternalSocialRequest.g:1442:2: rule__Attribute__Group__1__Impl rule__Attribute__Group__2
            {
            pushFollow(FOLLOW_14);
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
    // InternalSocialRequest.g:1449:1: rule__Attribute__Group__1__Impl : ( ( rule__Attribute__NameAssignment_1 ) ) ;
    public final void rule__Attribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1453:1: ( ( ( rule__Attribute__NameAssignment_1 ) ) )
            // InternalSocialRequest.g:1454:1: ( ( rule__Attribute__NameAssignment_1 ) )
            {
            // InternalSocialRequest.g:1454:1: ( ( rule__Attribute__NameAssignment_1 ) )
            // InternalSocialRequest.g:1455:2: ( rule__Attribute__NameAssignment_1 )
            {
             before(grammarAccess.getAttributeAccess().getNameAssignment_1()); 
            // InternalSocialRequest.g:1456:2: ( rule__Attribute__NameAssignment_1 )
            // InternalSocialRequest.g:1456:3: rule__Attribute__NameAssignment_1
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
    // InternalSocialRequest.g:1464:1: rule__Attribute__Group__2 : rule__Attribute__Group__2__Impl rule__Attribute__Group__3 ;
    public final void rule__Attribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1468:1: ( rule__Attribute__Group__2__Impl rule__Attribute__Group__3 )
            // InternalSocialRequest.g:1469:2: rule__Attribute__Group__2__Impl rule__Attribute__Group__3
            {
            pushFollow(FOLLOW_15);
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
    // InternalSocialRequest.g:1476:1: rule__Attribute__Group__2__Impl : ( ':' ) ;
    public final void rule__Attribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1480:1: ( ( ':' ) )
            // InternalSocialRequest.g:1481:1: ( ':' )
            {
            // InternalSocialRequest.g:1481:1: ( ':' )
            // InternalSocialRequest.g:1482:2: ':'
            {
             before(grammarAccess.getAttributeAccess().getColonKeyword_2()); 
            match(input,40,FOLLOW_2); 
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
    // InternalSocialRequest.g:1491:1: rule__Attribute__Group__3 : rule__Attribute__Group__3__Impl rule__Attribute__Group__4 ;
    public final void rule__Attribute__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1495:1: ( rule__Attribute__Group__3__Impl rule__Attribute__Group__4 )
            // InternalSocialRequest.g:1496:2: rule__Attribute__Group__3__Impl rule__Attribute__Group__4
            {
            pushFollow(FOLLOW_16);
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
    // InternalSocialRequest.g:1503:1: rule__Attribute__Group__3__Impl : ( ( rule__Attribute__TypeRefAssignment_3 ) ) ;
    public final void rule__Attribute__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1507:1: ( ( ( rule__Attribute__TypeRefAssignment_3 ) ) )
            // InternalSocialRequest.g:1508:1: ( ( rule__Attribute__TypeRefAssignment_3 ) )
            {
            // InternalSocialRequest.g:1508:1: ( ( rule__Attribute__TypeRefAssignment_3 ) )
            // InternalSocialRequest.g:1509:2: ( rule__Attribute__TypeRefAssignment_3 )
            {
             before(grammarAccess.getAttributeAccess().getTypeRefAssignment_3()); 
            // InternalSocialRequest.g:1510:2: ( rule__Attribute__TypeRefAssignment_3 )
            // InternalSocialRequest.g:1510:3: rule__Attribute__TypeRefAssignment_3
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
    // InternalSocialRequest.g:1518:1: rule__Attribute__Group__4 : rule__Attribute__Group__4__Impl rule__Attribute__Group__5 ;
    public final void rule__Attribute__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1522:1: ( rule__Attribute__Group__4__Impl rule__Attribute__Group__5 )
            // InternalSocialRequest.g:1523:2: rule__Attribute__Group__4__Impl rule__Attribute__Group__5
            {
            pushFollow(FOLLOW_16);
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
    // InternalSocialRequest.g:1530:1: rule__Attribute__Group__4__Impl : ( ( rule__Attribute__ModifierAssignment_4 )? ) ;
    public final void rule__Attribute__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1534:1: ( ( ( rule__Attribute__ModifierAssignment_4 )? ) )
            // InternalSocialRequest.g:1535:1: ( ( rule__Attribute__ModifierAssignment_4 )? )
            {
            // InternalSocialRequest.g:1535:1: ( ( rule__Attribute__ModifierAssignment_4 )? )
            // InternalSocialRequest.g:1536:2: ( rule__Attribute__ModifierAssignment_4 )?
            {
             before(grammarAccess.getAttributeAccess().getModifierAssignment_4()); 
            // InternalSocialRequest.g:1537:2: ( rule__Attribute__ModifierAssignment_4 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( ((LA15_0>=59 && LA15_0<=61)) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalSocialRequest.g:1537:3: rule__Attribute__ModifierAssignment_4
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
    // InternalSocialRequest.g:1545:1: rule__Attribute__Group__5 : rule__Attribute__Group__5__Impl ;
    public final void rule__Attribute__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1549:1: ( rule__Attribute__Group__5__Impl )
            // InternalSocialRequest.g:1550:2: rule__Attribute__Group__5__Impl
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
    // InternalSocialRequest.g:1556:1: rule__Attribute__Group__5__Impl : ( ( rule__Attribute__Group_5__0 )? ) ;
    public final void rule__Attribute__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1560:1: ( ( ( rule__Attribute__Group_5__0 )? ) )
            // InternalSocialRequest.g:1561:1: ( ( rule__Attribute__Group_5__0 )? )
            {
            // InternalSocialRequest.g:1561:1: ( ( rule__Attribute__Group_5__0 )? )
            // InternalSocialRequest.g:1562:2: ( rule__Attribute__Group_5__0 )?
            {
             before(grammarAccess.getAttributeAccess().getGroup_5()); 
            // InternalSocialRequest.g:1563:2: ( rule__Attribute__Group_5__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==35) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalSocialRequest.g:1563:3: rule__Attribute__Group_5__0
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
    // InternalSocialRequest.g:1572:1: rule__Attribute__Group_5__0 : rule__Attribute__Group_5__0__Impl rule__Attribute__Group_5__1 ;
    public final void rule__Attribute__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1576:1: ( rule__Attribute__Group_5__0__Impl rule__Attribute__Group_5__1 )
            // InternalSocialRequest.g:1577:2: rule__Attribute__Group_5__0__Impl rule__Attribute__Group_5__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalSocialRequest.g:1584:1: rule__Attribute__Group_5__0__Impl : ( '{' ) ;
    public final void rule__Attribute__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1588:1: ( ( '{' ) )
            // InternalSocialRequest.g:1589:1: ( '{' )
            {
            // InternalSocialRequest.g:1589:1: ( '{' )
            // InternalSocialRequest.g:1590:2: '{'
            {
             before(grammarAccess.getAttributeAccess().getLeftCurlyBracketKeyword_5_0()); 
            match(input,35,FOLLOW_2); 
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
    // InternalSocialRequest.g:1599:1: rule__Attribute__Group_5__1 : rule__Attribute__Group_5__1__Impl rule__Attribute__Group_5__2 ;
    public final void rule__Attribute__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1603:1: ( rule__Attribute__Group_5__1__Impl rule__Attribute__Group_5__2 )
            // InternalSocialRequest.g:1604:2: rule__Attribute__Group_5__1__Impl rule__Attribute__Group_5__2
            {
            pushFollow(FOLLOW_11);
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
    // InternalSocialRequest.g:1611:1: rule__Attribute__Group_5__1__Impl : ( ( rule__Attribute__UnorderedGroup_5_1 ) ) ;
    public final void rule__Attribute__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1615:1: ( ( ( rule__Attribute__UnorderedGroup_5_1 ) ) )
            // InternalSocialRequest.g:1616:1: ( ( rule__Attribute__UnorderedGroup_5_1 ) )
            {
            // InternalSocialRequest.g:1616:1: ( ( rule__Attribute__UnorderedGroup_5_1 ) )
            // InternalSocialRequest.g:1617:2: ( rule__Attribute__UnorderedGroup_5_1 )
            {
             before(grammarAccess.getAttributeAccess().getUnorderedGroup_5_1()); 
            // InternalSocialRequest.g:1618:2: ( rule__Attribute__UnorderedGroup_5_1 )
            // InternalSocialRequest.g:1618:3: rule__Attribute__UnorderedGroup_5_1
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
    // InternalSocialRequest.g:1626:1: rule__Attribute__Group_5__2 : rule__Attribute__Group_5__2__Impl ;
    public final void rule__Attribute__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1630:1: ( rule__Attribute__Group_5__2__Impl )
            // InternalSocialRequest.g:1631:2: rule__Attribute__Group_5__2__Impl
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
    // InternalSocialRequest.g:1637:1: rule__Attribute__Group_5__2__Impl : ( '}' ) ;
    public final void rule__Attribute__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1641:1: ( ( '}' ) )
            // InternalSocialRequest.g:1642:1: ( '}' )
            {
            // InternalSocialRequest.g:1642:1: ( '}' )
            // InternalSocialRequest.g:1643:2: '}'
            {
             before(grammarAccess.getAttributeAccess().getRightCurlyBracketKeyword_5_2()); 
            match(input,36,FOLLOW_2); 
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
    // InternalSocialRequest.g:1653:1: rule__Attribute__Group_5_1_0__0 : rule__Attribute__Group_5_1_0__0__Impl rule__Attribute__Group_5_1_0__1 ;
    public final void rule__Attribute__Group_5_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1657:1: ( rule__Attribute__Group_5_1_0__0__Impl rule__Attribute__Group_5_1_0__1 )
            // InternalSocialRequest.g:1658:2: rule__Attribute__Group_5_1_0__0__Impl rule__Attribute__Group_5_1_0__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalSocialRequest.g:1665:1: rule__Attribute__Group_5_1_0__0__Impl : ( 'mappedBy:' ) ;
    public final void rule__Attribute__Group_5_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1669:1: ( ( 'mappedBy:' ) )
            // InternalSocialRequest.g:1670:1: ( 'mappedBy:' )
            {
            // InternalSocialRequest.g:1670:1: ( 'mappedBy:' )
            // InternalSocialRequest.g:1671:2: 'mappedBy:'
            {
             before(grammarAccess.getAttributeAccess().getMappedByKeyword_5_1_0_0()); 
            match(input,41,FOLLOW_2); 
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
    // InternalSocialRequest.g:1680:1: rule__Attribute__Group_5_1_0__1 : rule__Attribute__Group_5_1_0__1__Impl ;
    public final void rule__Attribute__Group_5_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1684:1: ( rule__Attribute__Group_5_1_0__1__Impl )
            // InternalSocialRequest.g:1685:2: rule__Attribute__Group_5_1_0__1__Impl
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
    // InternalSocialRequest.g:1691:1: rule__Attribute__Group_5_1_0__1__Impl : ( ( rule__Attribute__MappedByAssignment_5_1_0_1 ) ) ;
    public final void rule__Attribute__Group_5_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1695:1: ( ( ( rule__Attribute__MappedByAssignment_5_1_0_1 ) ) )
            // InternalSocialRequest.g:1696:1: ( ( rule__Attribute__MappedByAssignment_5_1_0_1 ) )
            {
            // InternalSocialRequest.g:1696:1: ( ( rule__Attribute__MappedByAssignment_5_1_0_1 ) )
            // InternalSocialRequest.g:1697:2: ( rule__Attribute__MappedByAssignment_5_1_0_1 )
            {
             before(grammarAccess.getAttributeAccess().getMappedByAssignment_5_1_0_1()); 
            // InternalSocialRequest.g:1698:2: ( rule__Attribute__MappedByAssignment_5_1_0_1 )
            // InternalSocialRequest.g:1698:3: rule__Attribute__MappedByAssignment_5_1_0_1
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
    // InternalSocialRequest.g:1707:1: rule__Attribute__Group_5_1_1__0 : rule__Attribute__Group_5_1_1__0__Impl rule__Attribute__Group_5_1_1__1 ;
    public final void rule__Attribute__Group_5_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1711:1: ( rule__Attribute__Group_5_1_1__0__Impl rule__Attribute__Group_5_1_1__1 )
            // InternalSocialRequest.g:1712:2: rule__Attribute__Group_5_1_1__0__Impl rule__Attribute__Group_5_1_1__1
            {
            pushFollow(FOLLOW_18);
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
    // InternalSocialRequest.g:1719:1: rule__Attribute__Group_5_1_1__0__Impl : ( 'fetch:' ) ;
    public final void rule__Attribute__Group_5_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1723:1: ( ( 'fetch:' ) )
            // InternalSocialRequest.g:1724:1: ( 'fetch:' )
            {
            // InternalSocialRequest.g:1724:1: ( 'fetch:' )
            // InternalSocialRequest.g:1725:2: 'fetch:'
            {
             before(grammarAccess.getAttributeAccess().getFetchKeyword_5_1_1_0()); 
            match(input,42,FOLLOW_2); 
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
    // InternalSocialRequest.g:1734:1: rule__Attribute__Group_5_1_1__1 : rule__Attribute__Group_5_1_1__1__Impl ;
    public final void rule__Attribute__Group_5_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1738:1: ( rule__Attribute__Group_5_1_1__1__Impl )
            // InternalSocialRequest.g:1739:2: rule__Attribute__Group_5_1_1__1__Impl
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
    // InternalSocialRequest.g:1745:1: rule__Attribute__Group_5_1_1__1__Impl : ( ( rule__Attribute__FetchTypeAssignment_5_1_1_1 ) ) ;
    public final void rule__Attribute__Group_5_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1749:1: ( ( ( rule__Attribute__FetchTypeAssignment_5_1_1_1 ) ) )
            // InternalSocialRequest.g:1750:1: ( ( rule__Attribute__FetchTypeAssignment_5_1_1_1 ) )
            {
            // InternalSocialRequest.g:1750:1: ( ( rule__Attribute__FetchTypeAssignment_5_1_1_1 ) )
            // InternalSocialRequest.g:1751:2: ( rule__Attribute__FetchTypeAssignment_5_1_1_1 )
            {
             before(grammarAccess.getAttributeAccess().getFetchTypeAssignment_5_1_1_1()); 
            // InternalSocialRequest.g:1752:2: ( rule__Attribute__FetchTypeAssignment_5_1_1_1 )
            // InternalSocialRequest.g:1752:3: rule__Attribute__FetchTypeAssignment_5_1_1_1
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
    // InternalSocialRequest.g:1761:1: rule__Attribute__Group_5_1_2__0 : rule__Attribute__Group_5_1_2__0__Impl rule__Attribute__Group_5_1_2__1 ;
    public final void rule__Attribute__Group_5_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1765:1: ( rule__Attribute__Group_5_1_2__0__Impl rule__Attribute__Group_5_1_2__1 )
            // InternalSocialRequest.g:1766:2: rule__Attribute__Group_5_1_2__0__Impl rule__Attribute__Group_5_1_2__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalSocialRequest.g:1773:1: rule__Attribute__Group_5_1_2__0__Impl : ( 'validations' ) ;
    public final void rule__Attribute__Group_5_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1777:1: ( ( 'validations' ) )
            // InternalSocialRequest.g:1778:1: ( 'validations' )
            {
            // InternalSocialRequest.g:1778:1: ( 'validations' )
            // InternalSocialRequest.g:1779:2: 'validations'
            {
             before(grammarAccess.getAttributeAccess().getValidationsKeyword_5_1_2_0()); 
            match(input,43,FOLLOW_2); 
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
    // InternalSocialRequest.g:1788:1: rule__Attribute__Group_5_1_2__1 : rule__Attribute__Group_5_1_2__1__Impl rule__Attribute__Group_5_1_2__2 ;
    public final void rule__Attribute__Group_5_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1792:1: ( rule__Attribute__Group_5_1_2__1__Impl rule__Attribute__Group_5_1_2__2 )
            // InternalSocialRequest.g:1793:2: rule__Attribute__Group_5_1_2__1__Impl rule__Attribute__Group_5_1_2__2
            {
            pushFollow(FOLLOW_19);
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
    // InternalSocialRequest.g:1800:1: rule__Attribute__Group_5_1_2__1__Impl : ( '{' ) ;
    public final void rule__Attribute__Group_5_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1804:1: ( ( '{' ) )
            // InternalSocialRequest.g:1805:1: ( '{' )
            {
            // InternalSocialRequest.g:1805:1: ( '{' )
            // InternalSocialRequest.g:1806:2: '{'
            {
             before(grammarAccess.getAttributeAccess().getLeftCurlyBracketKeyword_5_1_2_1()); 
            match(input,35,FOLLOW_2); 
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
    // InternalSocialRequest.g:1815:1: rule__Attribute__Group_5_1_2__2 : rule__Attribute__Group_5_1_2__2__Impl rule__Attribute__Group_5_1_2__3 ;
    public final void rule__Attribute__Group_5_1_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1819:1: ( rule__Attribute__Group_5_1_2__2__Impl rule__Attribute__Group_5_1_2__3 )
            // InternalSocialRequest.g:1820:2: rule__Attribute__Group_5_1_2__2__Impl rule__Attribute__Group_5_1_2__3
            {
            pushFollow(FOLLOW_11);
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
    // InternalSocialRequest.g:1827:1: rule__Attribute__Group_5_1_2__2__Impl : ( ( ( rule__Attribute__ValidationsAssignment_5_1_2_2 ) ) ( ( rule__Attribute__ValidationsAssignment_5_1_2_2 )* ) ) ;
    public final void rule__Attribute__Group_5_1_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1831:1: ( ( ( ( rule__Attribute__ValidationsAssignment_5_1_2_2 ) ) ( ( rule__Attribute__ValidationsAssignment_5_1_2_2 )* ) ) )
            // InternalSocialRequest.g:1832:1: ( ( ( rule__Attribute__ValidationsAssignment_5_1_2_2 ) ) ( ( rule__Attribute__ValidationsAssignment_5_1_2_2 )* ) )
            {
            // InternalSocialRequest.g:1832:1: ( ( ( rule__Attribute__ValidationsAssignment_5_1_2_2 ) ) ( ( rule__Attribute__ValidationsAssignment_5_1_2_2 )* ) )
            // InternalSocialRequest.g:1833:2: ( ( rule__Attribute__ValidationsAssignment_5_1_2_2 ) ) ( ( rule__Attribute__ValidationsAssignment_5_1_2_2 )* )
            {
            // InternalSocialRequest.g:1833:2: ( ( rule__Attribute__ValidationsAssignment_5_1_2_2 ) )
            // InternalSocialRequest.g:1834:3: ( rule__Attribute__ValidationsAssignment_5_1_2_2 )
            {
             before(grammarAccess.getAttributeAccess().getValidationsAssignment_5_1_2_2()); 
            // InternalSocialRequest.g:1835:3: ( rule__Attribute__ValidationsAssignment_5_1_2_2 )
            // InternalSocialRequest.g:1835:4: rule__Attribute__ValidationsAssignment_5_1_2_2
            {
            pushFollow(FOLLOW_20);
            rule__Attribute__ValidationsAssignment_5_1_2_2();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getValidationsAssignment_5_1_2_2()); 

            }

            // InternalSocialRequest.g:1838:2: ( ( rule__Attribute__ValidationsAssignment_5_1_2_2 )* )
            // InternalSocialRequest.g:1839:3: ( rule__Attribute__ValidationsAssignment_5_1_2_2 )*
            {
             before(grammarAccess.getAttributeAccess().getValidationsAssignment_5_1_2_2()); 
            // InternalSocialRequest.g:1840:3: ( rule__Attribute__ValidationsAssignment_5_1_2_2 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>=14 && LA17_0<=17)||(LA17_0>=46 && LA17_0<=48)||LA17_0==62) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalSocialRequest.g:1840:4: rule__Attribute__ValidationsAssignment_5_1_2_2
            	    {
            	    pushFollow(FOLLOW_20);
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
    // InternalSocialRequest.g:1849:1: rule__Attribute__Group_5_1_2__3 : rule__Attribute__Group_5_1_2__3__Impl ;
    public final void rule__Attribute__Group_5_1_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1853:1: ( rule__Attribute__Group_5_1_2__3__Impl )
            // InternalSocialRequest.g:1854:2: rule__Attribute__Group_5_1_2__3__Impl
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
    // InternalSocialRequest.g:1860:1: rule__Attribute__Group_5_1_2__3__Impl : ( '}' ) ;
    public final void rule__Attribute__Group_5_1_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1864:1: ( ( '}' ) )
            // InternalSocialRequest.g:1865:1: ( '}' )
            {
            // InternalSocialRequest.g:1865:1: ( '}' )
            // InternalSocialRequest.g:1866:2: '}'
            {
             before(grammarAccess.getAttributeAccess().getRightCurlyBracketKeyword_5_1_2_3()); 
            match(input,36,FOLLOW_2); 
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
    // InternalSocialRequest.g:1876:1: rule__Modifier__Group_2__0 : rule__Modifier__Group_2__0__Impl rule__Modifier__Group_2__1 ;
    public final void rule__Modifier__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1880:1: ( rule__Modifier__Group_2__0__Impl rule__Modifier__Group_2__1 )
            // InternalSocialRequest.g:1881:2: rule__Modifier__Group_2__0__Impl rule__Modifier__Group_2__1
            {
            pushFollow(FOLLOW_21);
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
    // InternalSocialRequest.g:1888:1: rule__Modifier__Group_2__0__Impl : ( ( rule__Modifier__IsIDAssignment_2_0 ) ) ;
    public final void rule__Modifier__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1892:1: ( ( ( rule__Modifier__IsIDAssignment_2_0 ) ) )
            // InternalSocialRequest.g:1893:1: ( ( rule__Modifier__IsIDAssignment_2_0 ) )
            {
            // InternalSocialRequest.g:1893:1: ( ( rule__Modifier__IsIDAssignment_2_0 ) )
            // InternalSocialRequest.g:1894:2: ( rule__Modifier__IsIDAssignment_2_0 )
            {
             before(grammarAccess.getModifierAccess().getIsIDAssignment_2_0()); 
            // InternalSocialRequest.g:1895:2: ( rule__Modifier__IsIDAssignment_2_0 )
            // InternalSocialRequest.g:1895:3: rule__Modifier__IsIDAssignment_2_0
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
    // InternalSocialRequest.g:1903:1: rule__Modifier__Group_2__1 : rule__Modifier__Group_2__1__Impl ;
    public final void rule__Modifier__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1907:1: ( rule__Modifier__Group_2__1__Impl )
            // InternalSocialRequest.g:1908:2: rule__Modifier__Group_2__1__Impl
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
    // InternalSocialRequest.g:1914:1: rule__Modifier__Group_2__1__Impl : ( ( rule__Modifier__Group_2_1__0 )? ) ;
    public final void rule__Modifier__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1918:1: ( ( ( rule__Modifier__Group_2_1__0 )? ) )
            // InternalSocialRequest.g:1919:1: ( ( rule__Modifier__Group_2_1__0 )? )
            {
            // InternalSocialRequest.g:1919:1: ( ( rule__Modifier__Group_2_1__0 )? )
            // InternalSocialRequest.g:1920:2: ( rule__Modifier__Group_2_1__0 )?
            {
             before(grammarAccess.getModifierAccess().getGroup_2_1()); 
            // InternalSocialRequest.g:1921:2: ( rule__Modifier__Group_2_1__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==44) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalSocialRequest.g:1921:3: rule__Modifier__Group_2_1__0
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
    // InternalSocialRequest.g:1930:1: rule__Modifier__Group_2_1__0 : rule__Modifier__Group_2_1__0__Impl rule__Modifier__Group_2_1__1 ;
    public final void rule__Modifier__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1934:1: ( rule__Modifier__Group_2_1__0__Impl rule__Modifier__Group_2_1__1 )
            // InternalSocialRequest.g:1935:2: rule__Modifier__Group_2_1__0__Impl rule__Modifier__Group_2_1__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalSocialRequest.g:1942:1: rule__Modifier__Group_2_1__0__Impl : ( '(' ) ;
    public final void rule__Modifier__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1946:1: ( ( '(' ) )
            // InternalSocialRequest.g:1947:1: ( '(' )
            {
            // InternalSocialRequest.g:1947:1: ( '(' )
            // InternalSocialRequest.g:1948:2: '('
            {
             before(grammarAccess.getModifierAccess().getLeftParenthesisKeyword_2_1_0()); 
            match(input,44,FOLLOW_2); 
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
    // InternalSocialRequest.g:1957:1: rule__Modifier__Group_2_1__1 : rule__Modifier__Group_2_1__1__Impl rule__Modifier__Group_2_1__2 ;
    public final void rule__Modifier__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1961:1: ( rule__Modifier__Group_2_1__1__Impl rule__Modifier__Group_2_1__2 )
            // InternalSocialRequest.g:1962:2: rule__Modifier__Group_2_1__1__Impl rule__Modifier__Group_2_1__2
            {
            pushFollow(FOLLOW_23);
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
    // InternalSocialRequest.g:1969:1: rule__Modifier__Group_2_1__1__Impl : ( ( rule__Modifier__IDGenerationTypeAssignment_2_1_1 ) ) ;
    public final void rule__Modifier__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1973:1: ( ( ( rule__Modifier__IDGenerationTypeAssignment_2_1_1 ) ) )
            // InternalSocialRequest.g:1974:1: ( ( rule__Modifier__IDGenerationTypeAssignment_2_1_1 ) )
            {
            // InternalSocialRequest.g:1974:1: ( ( rule__Modifier__IDGenerationTypeAssignment_2_1_1 ) )
            // InternalSocialRequest.g:1975:2: ( rule__Modifier__IDGenerationTypeAssignment_2_1_1 )
            {
             before(grammarAccess.getModifierAccess().getIDGenerationTypeAssignment_2_1_1()); 
            // InternalSocialRequest.g:1976:2: ( rule__Modifier__IDGenerationTypeAssignment_2_1_1 )
            // InternalSocialRequest.g:1976:3: rule__Modifier__IDGenerationTypeAssignment_2_1_1
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
    // InternalSocialRequest.g:1984:1: rule__Modifier__Group_2_1__2 : rule__Modifier__Group_2_1__2__Impl ;
    public final void rule__Modifier__Group_2_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1988:1: ( rule__Modifier__Group_2_1__2__Impl )
            // InternalSocialRequest.g:1989:2: rule__Modifier__Group_2_1__2__Impl
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
    // InternalSocialRequest.g:1995:1: rule__Modifier__Group_2_1__2__Impl : ( ')' ) ;
    public final void rule__Modifier__Group_2_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:1999:1: ( ( ')' ) )
            // InternalSocialRequest.g:2000:1: ( ')' )
            {
            // InternalSocialRequest.g:2000:1: ( ')' )
            // InternalSocialRequest.g:2001:2: ')'
            {
             before(grammarAccess.getModifierAccess().getRightParenthesisKeyword_2_1_2()); 
            match(input,45,FOLLOW_2); 
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
    // InternalSocialRequest.g:2011:1: rule__Validation__Group_0__0 : rule__Validation__Group_0__0__Impl rule__Validation__Group_0__1 ;
    public final void rule__Validation__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2015:1: ( rule__Validation__Group_0__0__Impl rule__Validation__Group_0__1 )
            // InternalSocialRequest.g:2016:2: rule__Validation__Group_0__0__Impl rule__Validation__Group_0__1
            {
            pushFollow(FOLLOW_24);
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
    // InternalSocialRequest.g:2023:1: rule__Validation__Group_0__0__Impl : ( 'min:' ) ;
    public final void rule__Validation__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2027:1: ( ( 'min:' ) )
            // InternalSocialRequest.g:2028:1: ( 'min:' )
            {
            // InternalSocialRequest.g:2028:1: ( 'min:' )
            // InternalSocialRequest.g:2029:2: 'min:'
            {
             before(grammarAccess.getValidationAccess().getMinKeyword_0_0()); 
            match(input,46,FOLLOW_2); 
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
    // InternalSocialRequest.g:2038:1: rule__Validation__Group_0__1 : rule__Validation__Group_0__1__Impl ;
    public final void rule__Validation__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2042:1: ( rule__Validation__Group_0__1__Impl )
            // InternalSocialRequest.g:2043:2: rule__Validation__Group_0__1__Impl
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
    // InternalSocialRequest.g:2049:1: rule__Validation__Group_0__1__Impl : ( ( rule__Validation__MinAssignment_0_1 ) ) ;
    public final void rule__Validation__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2053:1: ( ( ( rule__Validation__MinAssignment_0_1 ) ) )
            // InternalSocialRequest.g:2054:1: ( ( rule__Validation__MinAssignment_0_1 ) )
            {
            // InternalSocialRequest.g:2054:1: ( ( rule__Validation__MinAssignment_0_1 ) )
            // InternalSocialRequest.g:2055:2: ( rule__Validation__MinAssignment_0_1 )
            {
             before(grammarAccess.getValidationAccess().getMinAssignment_0_1()); 
            // InternalSocialRequest.g:2056:2: ( rule__Validation__MinAssignment_0_1 )
            // InternalSocialRequest.g:2056:3: rule__Validation__MinAssignment_0_1
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
    // InternalSocialRequest.g:2065:1: rule__Validation__Group_1__0 : rule__Validation__Group_1__0__Impl rule__Validation__Group_1__1 ;
    public final void rule__Validation__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2069:1: ( rule__Validation__Group_1__0__Impl rule__Validation__Group_1__1 )
            // InternalSocialRequest.g:2070:2: rule__Validation__Group_1__0__Impl rule__Validation__Group_1__1
            {
            pushFollow(FOLLOW_24);
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
    // InternalSocialRequest.g:2077:1: rule__Validation__Group_1__0__Impl : ( 'max:' ) ;
    public final void rule__Validation__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2081:1: ( ( 'max:' ) )
            // InternalSocialRequest.g:2082:1: ( 'max:' )
            {
            // InternalSocialRequest.g:2082:1: ( 'max:' )
            // InternalSocialRequest.g:2083:2: 'max:'
            {
             before(grammarAccess.getValidationAccess().getMaxKeyword_1_0()); 
            match(input,47,FOLLOW_2); 
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
    // InternalSocialRequest.g:2092:1: rule__Validation__Group_1__1 : rule__Validation__Group_1__1__Impl ;
    public final void rule__Validation__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2096:1: ( rule__Validation__Group_1__1__Impl )
            // InternalSocialRequest.g:2097:2: rule__Validation__Group_1__1__Impl
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
    // InternalSocialRequest.g:2103:1: rule__Validation__Group_1__1__Impl : ( ( rule__Validation__MaxAssignment_1_1 ) ) ;
    public final void rule__Validation__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2107:1: ( ( ( rule__Validation__MaxAssignment_1_1 ) ) )
            // InternalSocialRequest.g:2108:1: ( ( rule__Validation__MaxAssignment_1_1 ) )
            {
            // InternalSocialRequest.g:2108:1: ( ( rule__Validation__MaxAssignment_1_1 ) )
            // InternalSocialRequest.g:2109:2: ( rule__Validation__MaxAssignment_1_1 )
            {
             before(grammarAccess.getValidationAccess().getMaxAssignment_1_1()); 
            // InternalSocialRequest.g:2110:2: ( rule__Validation__MaxAssignment_1_1 )
            // InternalSocialRequest.g:2110:3: rule__Validation__MaxAssignment_1_1
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
    // InternalSocialRequest.g:2119:1: rule__Validation__Group_2__0 : rule__Validation__Group_2__0__Impl rule__Validation__Group_2__1 ;
    public final void rule__Validation__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2123:1: ( rule__Validation__Group_2__0__Impl rule__Validation__Group_2__1 )
            // InternalSocialRequest.g:2124:2: rule__Validation__Group_2__0__Impl rule__Validation__Group_2__1
            {
            pushFollow(FOLLOW_25);
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
    // InternalSocialRequest.g:2131:1: rule__Validation__Group_2__0__Impl : ( 'pattern:' ) ;
    public final void rule__Validation__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2135:1: ( ( 'pattern:' ) )
            // InternalSocialRequest.g:2136:1: ( 'pattern:' )
            {
            // InternalSocialRequest.g:2136:1: ( 'pattern:' )
            // InternalSocialRequest.g:2137:2: 'pattern:'
            {
             before(grammarAccess.getValidationAccess().getPatternKeyword_2_0()); 
            match(input,48,FOLLOW_2); 
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
    // InternalSocialRequest.g:2146:1: rule__Validation__Group_2__1 : rule__Validation__Group_2__1__Impl ;
    public final void rule__Validation__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2150:1: ( rule__Validation__Group_2__1__Impl )
            // InternalSocialRequest.g:2151:2: rule__Validation__Group_2__1__Impl
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
    // InternalSocialRequest.g:2157:1: rule__Validation__Group_2__1__Impl : ( ( rule__Validation__RegexAssignment_2_1 ) ) ;
    public final void rule__Validation__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2161:1: ( ( ( rule__Validation__RegexAssignment_2_1 ) ) )
            // InternalSocialRequest.g:2162:1: ( ( rule__Validation__RegexAssignment_2_1 ) )
            {
            // InternalSocialRequest.g:2162:1: ( ( rule__Validation__RegexAssignment_2_1 ) )
            // InternalSocialRequest.g:2163:2: ( rule__Validation__RegexAssignment_2_1 )
            {
             before(grammarAccess.getValidationAccess().getRegexAssignment_2_1()); 
            // InternalSocialRequest.g:2164:2: ( rule__Validation__RegexAssignment_2_1 )
            // InternalSocialRequest.g:2164:3: rule__Validation__RegexAssignment_2_1
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
    // InternalSocialRequest.g:2173:1: rule__Repository__Group__0 : rule__Repository__Group__0__Impl rule__Repository__Group__1 ;
    public final void rule__Repository__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2177:1: ( rule__Repository__Group__0__Impl rule__Repository__Group__1 )
            // InternalSocialRequest.g:2178:2: rule__Repository__Group__0__Impl rule__Repository__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalSocialRequest.g:2185:1: rule__Repository__Group__0__Impl : ( 'Repository' ) ;
    public final void rule__Repository__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2189:1: ( ( 'Repository' ) )
            // InternalSocialRequest.g:2190:1: ( 'Repository' )
            {
            // InternalSocialRequest.g:2190:1: ( 'Repository' )
            // InternalSocialRequest.g:2191:2: 'Repository'
            {
             before(grammarAccess.getRepositoryAccess().getRepositoryKeyword_0()); 
            match(input,49,FOLLOW_2); 
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
    // InternalSocialRequest.g:2200:1: rule__Repository__Group__1 : rule__Repository__Group__1__Impl rule__Repository__Group__2 ;
    public final void rule__Repository__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2204:1: ( rule__Repository__Group__1__Impl rule__Repository__Group__2 )
            // InternalSocialRequest.g:2205:2: rule__Repository__Group__1__Impl rule__Repository__Group__2
            {
            pushFollow(FOLLOW_5);
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
    // InternalSocialRequest.g:2212:1: rule__Repository__Group__1__Impl : ( ( rule__Repository__EntityAssignment_1 ) ) ;
    public final void rule__Repository__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2216:1: ( ( ( rule__Repository__EntityAssignment_1 ) ) )
            // InternalSocialRequest.g:2217:1: ( ( rule__Repository__EntityAssignment_1 ) )
            {
            // InternalSocialRequest.g:2217:1: ( ( rule__Repository__EntityAssignment_1 ) )
            // InternalSocialRequest.g:2218:2: ( rule__Repository__EntityAssignment_1 )
            {
             before(grammarAccess.getRepositoryAccess().getEntityAssignment_1()); 
            // InternalSocialRequest.g:2219:2: ( rule__Repository__EntityAssignment_1 )
            // InternalSocialRequest.g:2219:3: rule__Repository__EntityAssignment_1
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
    // InternalSocialRequest.g:2227:1: rule__Repository__Group__2 : rule__Repository__Group__2__Impl rule__Repository__Group__3 ;
    public final void rule__Repository__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2231:1: ( rule__Repository__Group__2__Impl rule__Repository__Group__3 )
            // InternalSocialRequest.g:2232:2: rule__Repository__Group__2__Impl rule__Repository__Group__3
            {
            pushFollow(FOLLOW_26);
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
    // InternalSocialRequest.g:2239:1: rule__Repository__Group__2__Impl : ( '{' ) ;
    public final void rule__Repository__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2243:1: ( ( '{' ) )
            // InternalSocialRequest.g:2244:1: ( '{' )
            {
            // InternalSocialRequest.g:2244:1: ( '{' )
            // InternalSocialRequest.g:2245:2: '{'
            {
             before(grammarAccess.getRepositoryAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,35,FOLLOW_2); 
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
    // InternalSocialRequest.g:2254:1: rule__Repository__Group__3 : rule__Repository__Group__3__Impl rule__Repository__Group__4 ;
    public final void rule__Repository__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2258:1: ( rule__Repository__Group__3__Impl rule__Repository__Group__4 )
            // InternalSocialRequest.g:2259:2: rule__Repository__Group__3__Impl rule__Repository__Group__4
            {
            pushFollow(FOLLOW_11);
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
    // InternalSocialRequest.g:2266:1: rule__Repository__Group__3__Impl : ( ( ( rule__Repository__QueriesAssignment_3 ) ) ( ( rule__Repository__QueriesAssignment_3 )* ) ) ;
    public final void rule__Repository__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2270:1: ( ( ( ( rule__Repository__QueriesAssignment_3 ) ) ( ( rule__Repository__QueriesAssignment_3 )* ) ) )
            // InternalSocialRequest.g:2271:1: ( ( ( rule__Repository__QueriesAssignment_3 ) ) ( ( rule__Repository__QueriesAssignment_3 )* ) )
            {
            // InternalSocialRequest.g:2271:1: ( ( ( rule__Repository__QueriesAssignment_3 ) ) ( ( rule__Repository__QueriesAssignment_3 )* ) )
            // InternalSocialRequest.g:2272:2: ( ( rule__Repository__QueriesAssignment_3 ) ) ( ( rule__Repository__QueriesAssignment_3 )* )
            {
            // InternalSocialRequest.g:2272:2: ( ( rule__Repository__QueriesAssignment_3 ) )
            // InternalSocialRequest.g:2273:3: ( rule__Repository__QueriesAssignment_3 )
            {
             before(grammarAccess.getRepositoryAccess().getQueriesAssignment_3()); 
            // InternalSocialRequest.g:2274:3: ( rule__Repository__QueriesAssignment_3 )
            // InternalSocialRequest.g:2274:4: rule__Repository__QueriesAssignment_3
            {
            pushFollow(FOLLOW_27);
            rule__Repository__QueriesAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getRepositoryAccess().getQueriesAssignment_3()); 

            }

            // InternalSocialRequest.g:2277:2: ( ( rule__Repository__QueriesAssignment_3 )* )
            // InternalSocialRequest.g:2278:3: ( rule__Repository__QueriesAssignment_3 )*
            {
             before(grammarAccess.getRepositoryAccess().getQueriesAssignment_3()); 
            // InternalSocialRequest.g:2279:3: ( rule__Repository__QueriesAssignment_3 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==50) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalSocialRequest.g:2279:4: rule__Repository__QueriesAssignment_3
            	    {
            	    pushFollow(FOLLOW_27);
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
    // InternalSocialRequest.g:2288:1: rule__Repository__Group__4 : rule__Repository__Group__4__Impl ;
    public final void rule__Repository__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2292:1: ( rule__Repository__Group__4__Impl )
            // InternalSocialRequest.g:2293:2: rule__Repository__Group__4__Impl
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
    // InternalSocialRequest.g:2299:1: rule__Repository__Group__4__Impl : ( '}' ) ;
    public final void rule__Repository__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2303:1: ( ( '}' ) )
            // InternalSocialRequest.g:2304:1: ( '}' )
            {
            // InternalSocialRequest.g:2304:1: ( '}' )
            // InternalSocialRequest.g:2305:2: '}'
            {
             before(grammarAccess.getRepositoryAccess().getRightCurlyBracketKeyword_4()); 
            match(input,36,FOLLOW_2); 
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
    // InternalSocialRequest.g:2315:1: rule__Query__Group__0 : rule__Query__Group__0__Impl rule__Query__Group__1 ;
    public final void rule__Query__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2319:1: ( rule__Query__Group__0__Impl rule__Query__Group__1 )
            // InternalSocialRequest.g:2320:2: rule__Query__Group__0__Impl rule__Query__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalSocialRequest.g:2327:1: rule__Query__Group__0__Impl : ( 'query' ) ;
    public final void rule__Query__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2331:1: ( ( 'query' ) )
            // InternalSocialRequest.g:2332:1: ( 'query' )
            {
            // InternalSocialRequest.g:2332:1: ( 'query' )
            // InternalSocialRequest.g:2333:2: 'query'
            {
             before(grammarAccess.getQueryAccess().getQueryKeyword_0()); 
            match(input,50,FOLLOW_2); 
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
    // InternalSocialRequest.g:2342:1: rule__Query__Group__1 : rule__Query__Group__1__Impl rule__Query__Group__2 ;
    public final void rule__Query__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2346:1: ( rule__Query__Group__1__Impl rule__Query__Group__2 )
            // InternalSocialRequest.g:2347:2: rule__Query__Group__1__Impl rule__Query__Group__2
            {
            pushFollow(FOLLOW_28);
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
    // InternalSocialRequest.g:2354:1: rule__Query__Group__1__Impl : ( ( rule__Query__NameAssignment_1 ) ) ;
    public final void rule__Query__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2358:1: ( ( ( rule__Query__NameAssignment_1 ) ) )
            // InternalSocialRequest.g:2359:1: ( ( rule__Query__NameAssignment_1 ) )
            {
            // InternalSocialRequest.g:2359:1: ( ( rule__Query__NameAssignment_1 ) )
            // InternalSocialRequest.g:2360:2: ( rule__Query__NameAssignment_1 )
            {
             before(grammarAccess.getQueryAccess().getNameAssignment_1()); 
            // InternalSocialRequest.g:2361:2: ( rule__Query__NameAssignment_1 )
            // InternalSocialRequest.g:2361:3: rule__Query__NameAssignment_1
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
    // InternalSocialRequest.g:2369:1: rule__Query__Group__2 : rule__Query__Group__2__Impl rule__Query__Group__3 ;
    public final void rule__Query__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2373:1: ( rule__Query__Group__2__Impl rule__Query__Group__3 )
            // InternalSocialRequest.g:2374:2: rule__Query__Group__2__Impl rule__Query__Group__3
            {
            pushFollow(FOLLOW_28);
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
    // InternalSocialRequest.g:2381:1: rule__Query__Group__2__Impl : ( ( rule__Query__Group_2__0 )? ) ;
    public final void rule__Query__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2385:1: ( ( ( rule__Query__Group_2__0 )? ) )
            // InternalSocialRequest.g:2386:1: ( ( rule__Query__Group_2__0 )? )
            {
            // InternalSocialRequest.g:2386:1: ( ( rule__Query__Group_2__0 )? )
            // InternalSocialRequest.g:2387:2: ( rule__Query__Group_2__0 )?
            {
             before(grammarAccess.getQueryAccess().getGroup_2()); 
            // InternalSocialRequest.g:2388:2: ( rule__Query__Group_2__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==40) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalSocialRequest.g:2388:3: rule__Query__Group_2__0
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
    // InternalSocialRequest.g:2396:1: rule__Query__Group__3 : rule__Query__Group__3__Impl ;
    public final void rule__Query__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2400:1: ( rule__Query__Group__3__Impl )
            // InternalSocialRequest.g:2401:2: rule__Query__Group__3__Impl
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
    // InternalSocialRequest.g:2407:1: rule__Query__Group__3__Impl : ( ( rule__Query__Group_3__0 )? ) ;
    public final void rule__Query__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2411:1: ( ( ( rule__Query__Group_3__0 )? ) )
            // InternalSocialRequest.g:2412:1: ( ( rule__Query__Group_3__0 )? )
            {
            // InternalSocialRequest.g:2412:1: ( ( rule__Query__Group_3__0 )? )
            // InternalSocialRequest.g:2413:2: ( rule__Query__Group_3__0 )?
            {
             before(grammarAccess.getQueryAccess().getGroup_3()); 
            // InternalSocialRequest.g:2414:2: ( rule__Query__Group_3__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==35) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalSocialRequest.g:2414:3: rule__Query__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Query__Group_3__0();

                    state._fsp--;


                    }
                    break;

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
    // InternalSocialRequest.g:2423:1: rule__Query__Group_2__0 : rule__Query__Group_2__0__Impl rule__Query__Group_2__1 ;
    public final void rule__Query__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2427:1: ( rule__Query__Group_2__0__Impl rule__Query__Group_2__1 )
            // InternalSocialRequest.g:2428:2: rule__Query__Group_2__0__Impl rule__Query__Group_2__1
            {
            pushFollow(FOLLOW_29);
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
    // InternalSocialRequest.g:2435:1: rule__Query__Group_2__0__Impl : ( ( rule__Query__IsListAssignment_2_0 ) ) ;
    public final void rule__Query__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2439:1: ( ( ( rule__Query__IsListAssignment_2_0 ) ) )
            // InternalSocialRequest.g:2440:1: ( ( rule__Query__IsListAssignment_2_0 ) )
            {
            // InternalSocialRequest.g:2440:1: ( ( rule__Query__IsListAssignment_2_0 ) )
            // InternalSocialRequest.g:2441:2: ( rule__Query__IsListAssignment_2_0 )
            {
             before(grammarAccess.getQueryAccess().getIsListAssignment_2_0()); 
            // InternalSocialRequest.g:2442:2: ( rule__Query__IsListAssignment_2_0 )
            // InternalSocialRequest.g:2442:3: rule__Query__IsListAssignment_2_0
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
    // InternalSocialRequest.g:2450:1: rule__Query__Group_2__1 : rule__Query__Group_2__1__Impl ;
    public final void rule__Query__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2454:1: ( rule__Query__Group_2__1__Impl )
            // InternalSocialRequest.g:2455:2: rule__Query__Group_2__1__Impl
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
    // InternalSocialRequest.g:2461:1: rule__Query__Group_2__1__Impl : ( 'list' ) ;
    public final void rule__Query__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2465:1: ( ( 'list' ) )
            // InternalSocialRequest.g:2466:1: ( 'list' )
            {
            // InternalSocialRequest.g:2466:1: ( 'list' )
            // InternalSocialRequest.g:2467:2: 'list'
            {
             before(grammarAccess.getQueryAccess().getListKeyword_2_1()); 
            match(input,51,FOLLOW_2); 
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
    // InternalSocialRequest.g:2477:1: rule__Query__Group_3__0 : rule__Query__Group_3__0__Impl rule__Query__Group_3__1 ;
    public final void rule__Query__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2481:1: ( rule__Query__Group_3__0__Impl rule__Query__Group_3__1 )
            // InternalSocialRequest.g:2482:2: rule__Query__Group_3__0__Impl rule__Query__Group_3__1
            {
            pushFollow(FOLLOW_30);
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
    // InternalSocialRequest.g:2489:1: rule__Query__Group_3__0__Impl : ( '{' ) ;
    public final void rule__Query__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2493:1: ( ( '{' ) )
            // InternalSocialRequest.g:2494:1: ( '{' )
            {
            // InternalSocialRequest.g:2494:1: ( '{' )
            // InternalSocialRequest.g:2495:2: '{'
            {
             before(grammarAccess.getQueryAccess().getLeftCurlyBracketKeyword_3_0()); 
            match(input,35,FOLLOW_2); 
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
    // InternalSocialRequest.g:2504:1: rule__Query__Group_3__1 : rule__Query__Group_3__1__Impl rule__Query__Group_3__2 ;
    public final void rule__Query__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2508:1: ( rule__Query__Group_3__1__Impl rule__Query__Group_3__2 )
            // InternalSocialRequest.g:2509:2: rule__Query__Group_3__1__Impl rule__Query__Group_3__2
            {
            pushFollow(FOLLOW_30);
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
    // InternalSocialRequest.g:2516:1: rule__Query__Group_3__1__Impl : ( ( rule__Query__Group_3_1__0 )? ) ;
    public final void rule__Query__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2520:1: ( ( ( rule__Query__Group_3_1__0 )? ) )
            // InternalSocialRequest.g:2521:1: ( ( rule__Query__Group_3_1__0 )? )
            {
            // InternalSocialRequest.g:2521:1: ( ( rule__Query__Group_3_1__0 )? )
            // InternalSocialRequest.g:2522:2: ( rule__Query__Group_3_1__0 )?
            {
             before(grammarAccess.getQueryAccess().getGroup_3_1()); 
            // InternalSocialRequest.g:2523:2: ( rule__Query__Group_3_1__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==52) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalSocialRequest.g:2523:3: rule__Query__Group_3_1__0
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
    // InternalSocialRequest.g:2531:1: rule__Query__Group_3__2 : rule__Query__Group_3__2__Impl rule__Query__Group_3__3 ;
    public final void rule__Query__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2535:1: ( rule__Query__Group_3__2__Impl rule__Query__Group_3__3 )
            // InternalSocialRequest.g:2536:2: rule__Query__Group_3__2__Impl rule__Query__Group_3__3
            {
            pushFollow(FOLLOW_30);
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
    // InternalSocialRequest.g:2543:1: rule__Query__Group_3__2__Impl : ( ( rule__Query__SqlQueryAssignment_3_2 )? ) ;
    public final void rule__Query__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2547:1: ( ( ( rule__Query__SqlQueryAssignment_3_2 )? ) )
            // InternalSocialRequest.g:2548:1: ( ( rule__Query__SqlQueryAssignment_3_2 )? )
            {
            // InternalSocialRequest.g:2548:1: ( ( rule__Query__SqlQueryAssignment_3_2 )? )
            // InternalSocialRequest.g:2549:2: ( rule__Query__SqlQueryAssignment_3_2 )?
            {
             before(grammarAccess.getQueryAccess().getSqlQueryAssignment_3_2()); 
            // InternalSocialRequest.g:2550:2: ( rule__Query__SqlQueryAssignment_3_2 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==53) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalSocialRequest.g:2550:3: rule__Query__SqlQueryAssignment_3_2
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
    // InternalSocialRequest.g:2558:1: rule__Query__Group_3__3 : rule__Query__Group_3__3__Impl ;
    public final void rule__Query__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2562:1: ( rule__Query__Group_3__3__Impl )
            // InternalSocialRequest.g:2563:2: rule__Query__Group_3__3__Impl
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
    // InternalSocialRequest.g:2569:1: rule__Query__Group_3__3__Impl : ( '}' ) ;
    public final void rule__Query__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2573:1: ( ( '}' ) )
            // InternalSocialRequest.g:2574:1: ( '}' )
            {
            // InternalSocialRequest.g:2574:1: ( '}' )
            // InternalSocialRequest.g:2575:2: '}'
            {
             before(grammarAccess.getQueryAccess().getRightCurlyBracketKeyword_3_3()); 
            match(input,36,FOLLOW_2); 
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
    // InternalSocialRequest.g:2585:1: rule__Query__Group_3_1__0 : rule__Query__Group_3_1__0__Impl rule__Query__Group_3_1__1 ;
    public final void rule__Query__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2589:1: ( rule__Query__Group_3_1__0__Impl rule__Query__Group_3_1__1 )
            // InternalSocialRequest.g:2590:2: rule__Query__Group_3_1__0__Impl rule__Query__Group_3_1__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalSocialRequest.g:2597:1: rule__Query__Group_3_1__0__Impl : ( 'params' ) ;
    public final void rule__Query__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2601:1: ( ( 'params' ) )
            // InternalSocialRequest.g:2602:1: ( 'params' )
            {
            // InternalSocialRequest.g:2602:1: ( 'params' )
            // InternalSocialRequest.g:2603:2: 'params'
            {
             before(grammarAccess.getQueryAccess().getParamsKeyword_3_1_0()); 
            match(input,52,FOLLOW_2); 
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
    // InternalSocialRequest.g:2612:1: rule__Query__Group_3_1__1 : rule__Query__Group_3_1__1__Impl rule__Query__Group_3_1__2 ;
    public final void rule__Query__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2616:1: ( rule__Query__Group_3_1__1__Impl rule__Query__Group_3_1__2 )
            // InternalSocialRequest.g:2617:2: rule__Query__Group_3_1__1__Impl rule__Query__Group_3_1__2
            {
            pushFollow(FOLLOW_31);
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
    // InternalSocialRequest.g:2624:1: rule__Query__Group_3_1__1__Impl : ( '{' ) ;
    public final void rule__Query__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2628:1: ( ( '{' ) )
            // InternalSocialRequest.g:2629:1: ( '{' )
            {
            // InternalSocialRequest.g:2629:1: ( '{' )
            // InternalSocialRequest.g:2630:2: '{'
            {
             before(grammarAccess.getQueryAccess().getLeftCurlyBracketKeyword_3_1_1()); 
            match(input,35,FOLLOW_2); 
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
    // InternalSocialRequest.g:2639:1: rule__Query__Group_3_1__2 : rule__Query__Group_3_1__2__Impl rule__Query__Group_3_1__3 ;
    public final void rule__Query__Group_3_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2643:1: ( rule__Query__Group_3_1__2__Impl rule__Query__Group_3_1__3 )
            // InternalSocialRequest.g:2644:2: rule__Query__Group_3_1__2__Impl rule__Query__Group_3_1__3
            {
            pushFollow(FOLLOW_31);
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
    // InternalSocialRequest.g:2651:1: rule__Query__Group_3_1__2__Impl : ( ( rule__Query__ParamsAssignment_3_1_2 )* ) ;
    public final void rule__Query__Group_3_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2655:1: ( ( ( rule__Query__ParamsAssignment_3_1_2 )* ) )
            // InternalSocialRequest.g:2656:1: ( ( rule__Query__ParamsAssignment_3_1_2 )* )
            {
            // InternalSocialRequest.g:2656:1: ( ( rule__Query__ParamsAssignment_3_1_2 )* )
            // InternalSocialRequest.g:2657:2: ( rule__Query__ParamsAssignment_3_1_2 )*
            {
             before(grammarAccess.getQueryAccess().getParamsAssignment_3_1_2()); 
            // InternalSocialRequest.g:2658:2: ( rule__Query__ParamsAssignment_3_1_2 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==RULE_ID) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalSocialRequest.g:2658:3: rule__Query__ParamsAssignment_3_1_2
            	    {
            	    pushFollow(FOLLOW_32);
            	    rule__Query__ParamsAssignment_3_1_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
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
    // InternalSocialRequest.g:2666:1: rule__Query__Group_3_1__3 : rule__Query__Group_3_1__3__Impl ;
    public final void rule__Query__Group_3_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2670:1: ( rule__Query__Group_3_1__3__Impl )
            // InternalSocialRequest.g:2671:2: rule__Query__Group_3_1__3__Impl
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
    // InternalSocialRequest.g:2677:1: rule__Query__Group_3_1__3__Impl : ( '}' ) ;
    public final void rule__Query__Group_3_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2681:1: ( ( '}' ) )
            // InternalSocialRequest.g:2682:1: ( '}' )
            {
            // InternalSocialRequest.g:2682:1: ( '}' )
            // InternalSocialRequest.g:2683:2: '}'
            {
             before(grammarAccess.getQueryAccess().getRightCurlyBracketKeyword_3_1_3()); 
            match(input,36,FOLLOW_2); 
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
    // InternalSocialRequest.g:2693:1: rule__Param__Group__0 : rule__Param__Group__0__Impl rule__Param__Group__1 ;
    public final void rule__Param__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2697:1: ( rule__Param__Group__0__Impl rule__Param__Group__1 )
            // InternalSocialRequest.g:2698:2: rule__Param__Group__0__Impl rule__Param__Group__1
            {
            pushFollow(FOLLOW_14);
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
    // InternalSocialRequest.g:2705:1: rule__Param__Group__0__Impl : ( ( rule__Param__NameAssignment_0 ) ) ;
    public final void rule__Param__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2709:1: ( ( ( rule__Param__NameAssignment_0 ) ) )
            // InternalSocialRequest.g:2710:1: ( ( rule__Param__NameAssignment_0 ) )
            {
            // InternalSocialRequest.g:2710:1: ( ( rule__Param__NameAssignment_0 ) )
            // InternalSocialRequest.g:2711:2: ( rule__Param__NameAssignment_0 )
            {
             before(grammarAccess.getParamAccess().getNameAssignment_0()); 
            // InternalSocialRequest.g:2712:2: ( rule__Param__NameAssignment_0 )
            // InternalSocialRequest.g:2712:3: rule__Param__NameAssignment_0
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
    // InternalSocialRequest.g:2720:1: rule__Param__Group__1 : rule__Param__Group__1__Impl rule__Param__Group__2 ;
    public final void rule__Param__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2724:1: ( rule__Param__Group__1__Impl rule__Param__Group__2 )
            // InternalSocialRequest.g:2725:2: rule__Param__Group__1__Impl rule__Param__Group__2
            {
            pushFollow(FOLLOW_15);
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
    // InternalSocialRequest.g:2732:1: rule__Param__Group__1__Impl : ( ':' ) ;
    public final void rule__Param__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2736:1: ( ( ':' ) )
            // InternalSocialRequest.g:2737:1: ( ':' )
            {
            // InternalSocialRequest.g:2737:1: ( ':' )
            // InternalSocialRequest.g:2738:2: ':'
            {
             before(grammarAccess.getParamAccess().getColonKeyword_1()); 
            match(input,40,FOLLOW_2); 
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
    // InternalSocialRequest.g:2747:1: rule__Param__Group__2 : rule__Param__Group__2__Impl ;
    public final void rule__Param__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2751:1: ( rule__Param__Group__2__Impl )
            // InternalSocialRequest.g:2752:2: rule__Param__Group__2__Impl
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
    // InternalSocialRequest.g:2758:1: rule__Param__Group__2__Impl : ( ( rule__Param__TypeAssignment_2 ) ) ;
    public final void rule__Param__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2762:1: ( ( ( rule__Param__TypeAssignment_2 ) ) )
            // InternalSocialRequest.g:2763:1: ( ( rule__Param__TypeAssignment_2 ) )
            {
            // InternalSocialRequest.g:2763:1: ( ( rule__Param__TypeAssignment_2 ) )
            // InternalSocialRequest.g:2764:2: ( rule__Param__TypeAssignment_2 )
            {
             before(grammarAccess.getParamAccess().getTypeAssignment_2()); 
            // InternalSocialRequest.g:2765:2: ( rule__Param__TypeAssignment_2 )
            // InternalSocialRequest.g:2765:3: rule__Param__TypeAssignment_2
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
    // InternalSocialRequest.g:2774:1: rule__SQLQuery__Group__0 : rule__SQLQuery__Group__0__Impl rule__SQLQuery__Group__1 ;
    public final void rule__SQLQuery__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2778:1: ( rule__SQLQuery__Group__0__Impl rule__SQLQuery__Group__1 )
            // InternalSocialRequest.g:2779:2: rule__SQLQuery__Group__0__Impl rule__SQLQuery__Group__1
            {
            pushFollow(FOLLOW_33);
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
    // InternalSocialRequest.g:2786:1: rule__SQLQuery__Group__0__Impl : ( ( rule__SQLQuery__SelectAssignment_0 ) ) ;
    public final void rule__SQLQuery__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2790:1: ( ( ( rule__SQLQuery__SelectAssignment_0 ) ) )
            // InternalSocialRequest.g:2791:1: ( ( rule__SQLQuery__SelectAssignment_0 ) )
            {
            // InternalSocialRequest.g:2791:1: ( ( rule__SQLQuery__SelectAssignment_0 ) )
            // InternalSocialRequest.g:2792:2: ( rule__SQLQuery__SelectAssignment_0 )
            {
             before(grammarAccess.getSQLQueryAccess().getSelectAssignment_0()); 
            // InternalSocialRequest.g:2793:2: ( rule__SQLQuery__SelectAssignment_0 )
            // InternalSocialRequest.g:2793:3: rule__SQLQuery__SelectAssignment_0
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
    // InternalSocialRequest.g:2801:1: rule__SQLQuery__Group__1 : rule__SQLQuery__Group__1__Impl rule__SQLQuery__Group__2 ;
    public final void rule__SQLQuery__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2805:1: ( rule__SQLQuery__Group__1__Impl rule__SQLQuery__Group__2 )
            // InternalSocialRequest.g:2806:2: rule__SQLQuery__Group__1__Impl rule__SQLQuery__Group__2
            {
            pushFollow(FOLLOW_34);
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
    // InternalSocialRequest.g:2813:1: rule__SQLQuery__Group__1__Impl : ( ( rule__SQLQuery__FromAssignment_1 ) ) ;
    public final void rule__SQLQuery__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2817:1: ( ( ( rule__SQLQuery__FromAssignment_1 ) ) )
            // InternalSocialRequest.g:2818:1: ( ( rule__SQLQuery__FromAssignment_1 ) )
            {
            // InternalSocialRequest.g:2818:1: ( ( rule__SQLQuery__FromAssignment_1 ) )
            // InternalSocialRequest.g:2819:2: ( rule__SQLQuery__FromAssignment_1 )
            {
             before(grammarAccess.getSQLQueryAccess().getFromAssignment_1()); 
            // InternalSocialRequest.g:2820:2: ( rule__SQLQuery__FromAssignment_1 )
            // InternalSocialRequest.g:2820:3: rule__SQLQuery__FromAssignment_1
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
    // InternalSocialRequest.g:2828:1: rule__SQLQuery__Group__2 : rule__SQLQuery__Group__2__Impl rule__SQLQuery__Group__3 ;
    public final void rule__SQLQuery__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2832:1: ( rule__SQLQuery__Group__2__Impl rule__SQLQuery__Group__3 )
            // InternalSocialRequest.g:2833:2: rule__SQLQuery__Group__2__Impl rule__SQLQuery__Group__3
            {
            pushFollow(FOLLOW_34);
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
    // InternalSocialRequest.g:2840:1: rule__SQLQuery__Group__2__Impl : ( ( rule__SQLQuery__JoinsAssignment_2 )* ) ;
    public final void rule__SQLQuery__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2844:1: ( ( ( rule__SQLQuery__JoinsAssignment_2 )* ) )
            // InternalSocialRequest.g:2845:1: ( ( rule__SQLQuery__JoinsAssignment_2 )* )
            {
            // InternalSocialRequest.g:2845:1: ( ( rule__SQLQuery__JoinsAssignment_2 )* )
            // InternalSocialRequest.g:2846:2: ( rule__SQLQuery__JoinsAssignment_2 )*
            {
             before(grammarAccess.getSQLQueryAccess().getJoinsAssignment_2()); 
            // InternalSocialRequest.g:2847:2: ( rule__SQLQuery__JoinsAssignment_2 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( ((LA25_0>=30 && LA25_0<=33)) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalSocialRequest.g:2847:3: rule__SQLQuery__JoinsAssignment_2
            	    {
            	    pushFollow(FOLLOW_35);
            	    rule__SQLQuery__JoinsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
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
    // InternalSocialRequest.g:2855:1: rule__SQLQuery__Group__3 : rule__SQLQuery__Group__3__Impl rule__SQLQuery__Group__4 ;
    public final void rule__SQLQuery__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2859:1: ( rule__SQLQuery__Group__3__Impl rule__SQLQuery__Group__4 )
            // InternalSocialRequest.g:2860:2: rule__SQLQuery__Group__3__Impl rule__SQLQuery__Group__4
            {
            pushFollow(FOLLOW_34);
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
    // InternalSocialRequest.g:2867:1: rule__SQLQuery__Group__3__Impl : ( ( rule__SQLQuery__WhereAssignment_3 )? ) ;
    public final void rule__SQLQuery__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2871:1: ( ( ( rule__SQLQuery__WhereAssignment_3 )? ) )
            // InternalSocialRequest.g:2872:1: ( ( rule__SQLQuery__WhereAssignment_3 )? )
            {
            // InternalSocialRequest.g:2872:1: ( ( rule__SQLQuery__WhereAssignment_3 )? )
            // InternalSocialRequest.g:2873:2: ( rule__SQLQuery__WhereAssignment_3 )?
            {
             before(grammarAccess.getSQLQueryAccess().getWhereAssignment_3()); 
            // InternalSocialRequest.g:2874:2: ( rule__SQLQuery__WhereAssignment_3 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==56) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalSocialRequest.g:2874:3: rule__SQLQuery__WhereAssignment_3
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
    // InternalSocialRequest.g:2882:1: rule__SQLQuery__Group__4 : rule__SQLQuery__Group__4__Impl ;
    public final void rule__SQLQuery__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2886:1: ( rule__SQLQuery__Group__4__Impl )
            // InternalSocialRequest.g:2887:2: rule__SQLQuery__Group__4__Impl
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
    // InternalSocialRequest.g:2893:1: rule__SQLQuery__Group__4__Impl : ( ( rule__SQLQuery__OrderAssignment_4 )? ) ;
    public final void rule__SQLQuery__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2897:1: ( ( ( rule__SQLQuery__OrderAssignment_4 )? ) )
            // InternalSocialRequest.g:2898:1: ( ( rule__SQLQuery__OrderAssignment_4 )? )
            {
            // InternalSocialRequest.g:2898:1: ( ( rule__SQLQuery__OrderAssignment_4 )? )
            // InternalSocialRequest.g:2899:2: ( rule__SQLQuery__OrderAssignment_4 )?
            {
             before(grammarAccess.getSQLQueryAccess().getOrderAssignment_4()); 
            // InternalSocialRequest.g:2900:2: ( rule__SQLQuery__OrderAssignment_4 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==57) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalSocialRequest.g:2900:3: rule__SQLQuery__OrderAssignment_4
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
    // InternalSocialRequest.g:2909:1: rule__Select__Group__0 : rule__Select__Group__0__Impl rule__Select__Group__1 ;
    public final void rule__Select__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2913:1: ( rule__Select__Group__0__Impl rule__Select__Group__1 )
            // InternalSocialRequest.g:2914:2: rule__Select__Group__0__Impl rule__Select__Group__1
            {
            pushFollow(FOLLOW_36);
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
    // InternalSocialRequest.g:2921:1: rule__Select__Group__0__Impl : ( 'SELECT' ) ;
    public final void rule__Select__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2925:1: ( ( 'SELECT' ) )
            // InternalSocialRequest.g:2926:1: ( 'SELECT' )
            {
            // InternalSocialRequest.g:2926:1: ( 'SELECT' )
            // InternalSocialRequest.g:2927:2: 'SELECT'
            {
             before(grammarAccess.getSelectAccess().getSELECTKeyword_0()); 
            match(input,53,FOLLOW_2); 
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
    // InternalSocialRequest.g:2936:1: rule__Select__Group__1 : rule__Select__Group__1__Impl rule__Select__Group__2 ;
    public final void rule__Select__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2940:1: ( rule__Select__Group__1__Impl rule__Select__Group__2 )
            // InternalSocialRequest.g:2941:2: rule__Select__Group__1__Impl rule__Select__Group__2
            {
            pushFollow(FOLLOW_36);
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
    // InternalSocialRequest.g:2948:1: rule__Select__Group__1__Impl : ( ( rule__Select__IsDistinctAssignment_1 )? ) ;
    public final void rule__Select__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2952:1: ( ( ( rule__Select__IsDistinctAssignment_1 )? ) )
            // InternalSocialRequest.g:2953:1: ( ( rule__Select__IsDistinctAssignment_1 )? )
            {
            // InternalSocialRequest.g:2953:1: ( ( rule__Select__IsDistinctAssignment_1 )? )
            // InternalSocialRequest.g:2954:2: ( rule__Select__IsDistinctAssignment_1 )?
            {
             before(grammarAccess.getSelectAccess().getIsDistinctAssignment_1()); 
            // InternalSocialRequest.g:2955:2: ( rule__Select__IsDistinctAssignment_1 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==63) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalSocialRequest.g:2955:3: rule__Select__IsDistinctAssignment_1
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
    // InternalSocialRequest.g:2963:1: rule__Select__Group__2 : rule__Select__Group__2__Impl rule__Select__Group__3 ;
    public final void rule__Select__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2967:1: ( rule__Select__Group__2__Impl rule__Select__Group__3 )
            // InternalSocialRequest.g:2968:2: rule__Select__Group__2__Impl rule__Select__Group__3
            {
            pushFollow(FOLLOW_25);
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
    // InternalSocialRequest.g:2975:1: rule__Select__Group__2__Impl : ( '{' ) ;
    public final void rule__Select__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2979:1: ( ( '{' ) )
            // InternalSocialRequest.g:2980:1: ( '{' )
            {
            // InternalSocialRequest.g:2980:1: ( '{' )
            // InternalSocialRequest.g:2981:2: '{'
            {
             before(grammarAccess.getSelectAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,35,FOLLOW_2); 
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
    // InternalSocialRequest.g:2990:1: rule__Select__Group__3 : rule__Select__Group__3__Impl rule__Select__Group__4 ;
    public final void rule__Select__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:2994:1: ( rule__Select__Group__3__Impl rule__Select__Group__4 )
            // InternalSocialRequest.g:2995:2: rule__Select__Group__3__Impl rule__Select__Group__4
            {
            pushFollow(FOLLOW_11);
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
    // InternalSocialRequest.g:3002:1: rule__Select__Group__3__Impl : ( ( rule__Select__ClauseAssignment_3 ) ) ;
    public final void rule__Select__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:3006:1: ( ( ( rule__Select__ClauseAssignment_3 ) ) )
            // InternalSocialRequest.g:3007:1: ( ( rule__Select__ClauseAssignment_3 ) )
            {
            // InternalSocialRequest.g:3007:1: ( ( rule__Select__ClauseAssignment_3 ) )
            // InternalSocialRequest.g:3008:2: ( rule__Select__ClauseAssignment_3 )
            {
             before(grammarAccess.getSelectAccess().getClauseAssignment_3()); 
            // InternalSocialRequest.g:3009:2: ( rule__Select__ClauseAssignment_3 )
            // InternalSocialRequest.g:3009:3: rule__Select__ClauseAssignment_3
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
    // InternalSocialRequest.g:3017:1: rule__Select__Group__4 : rule__Select__Group__4__Impl ;
    public final void rule__Select__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:3021:1: ( rule__Select__Group__4__Impl )
            // InternalSocialRequest.g:3022:2: rule__Select__Group__4__Impl
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
    // InternalSocialRequest.g:3028:1: rule__Select__Group__4__Impl : ( '}' ) ;
    public final void rule__Select__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:3032:1: ( ( '}' ) )
            // InternalSocialRequest.g:3033:1: ( '}' )
            {
            // InternalSocialRequest.g:3033:1: ( '}' )
            // InternalSocialRequest.g:3034:2: '}'
            {
             before(grammarAccess.getSelectAccess().getRightCurlyBracketKeyword_4()); 
            match(input,36,FOLLOW_2); 
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
    // InternalSocialRequest.g:3044:1: rule__From__Group__0 : rule__From__Group__0__Impl rule__From__Group__1 ;
    public final void rule__From__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:3048:1: ( rule__From__Group__0__Impl rule__From__Group__1 )
            // InternalSocialRequest.g:3049:2: rule__From__Group__0__Impl rule__From__Group__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalSocialRequest.g:3056:1: rule__From__Group__0__Impl : ( 'FROM' ) ;
    public final void rule__From__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:3060:1: ( ( 'FROM' ) )
            // InternalSocialRequest.g:3061:1: ( 'FROM' )
            {
            // InternalSocialRequest.g:3061:1: ( 'FROM' )
            // InternalSocialRequest.g:3062:2: 'FROM'
            {
             before(grammarAccess.getFromAccess().getFROMKeyword_0()); 
            match(input,54,FOLLOW_2); 
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
    // InternalSocialRequest.g:3071:1: rule__From__Group__1 : rule__From__Group__1__Impl rule__From__Group__2 ;
    public final void rule__From__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:3075:1: ( rule__From__Group__1__Impl rule__From__Group__2 )
            // InternalSocialRequest.g:3076:2: rule__From__Group__1__Impl rule__From__Group__2
            {
            pushFollow(FOLLOW_4);
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
    // InternalSocialRequest.g:3083:1: rule__From__Group__1__Impl : ( '{' ) ;
    public final void rule__From__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:3087:1: ( ( '{' ) )
            // InternalSocialRequest.g:3088:1: ( '{' )
            {
            // InternalSocialRequest.g:3088:1: ( '{' )
            // InternalSocialRequest.g:3089:2: '{'
            {
             before(grammarAccess.getFromAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,35,FOLLOW_2); 
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
    // InternalSocialRequest.g:3098:1: rule__From__Group__2 : rule__From__Group__2__Impl rule__From__Group__3 ;
    public final void rule__From__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:3102:1: ( rule__From__Group__2__Impl rule__From__Group__3 )
            // InternalSocialRequest.g:3103:2: rule__From__Group__2__Impl rule__From__Group__3
            {
            pushFollow(FOLLOW_4);
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
    // InternalSocialRequest.g:3110:1: rule__From__Group__2__Impl : ( ( rule__From__EntityAssignment_2 ) ) ;
    public final void rule__From__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:3114:1: ( ( ( rule__From__EntityAssignment_2 ) ) )
            // InternalSocialRequest.g:3115:1: ( ( rule__From__EntityAssignment_2 ) )
            {
            // InternalSocialRequest.g:3115:1: ( ( rule__From__EntityAssignment_2 ) )
            // InternalSocialRequest.g:3116:2: ( rule__From__EntityAssignment_2 )
            {
             before(grammarAccess.getFromAccess().getEntityAssignment_2()); 
            // InternalSocialRequest.g:3117:2: ( rule__From__EntityAssignment_2 )
            // InternalSocialRequest.g:3117:3: rule__From__EntityAssignment_2
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
    // InternalSocialRequest.g:3125:1: rule__From__Group__3 : rule__From__Group__3__Impl rule__From__Group__4 ;
    public final void rule__From__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:3129:1: ( rule__From__Group__3__Impl rule__From__Group__4 )
            // InternalSocialRequest.g:3130:2: rule__From__Group__3__Impl rule__From__Group__4
            {
            pushFollow(FOLLOW_11);
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
    // InternalSocialRequest.g:3137:1: rule__From__Group__3__Impl : ( ( rule__From__AliasAssignment_3 ) ) ;
    public final void rule__From__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:3141:1: ( ( ( rule__From__AliasAssignment_3 ) ) )
            // InternalSocialRequest.g:3142:1: ( ( rule__From__AliasAssignment_3 ) )
            {
            // InternalSocialRequest.g:3142:1: ( ( rule__From__AliasAssignment_3 ) )
            // InternalSocialRequest.g:3143:2: ( rule__From__AliasAssignment_3 )
            {
             before(grammarAccess.getFromAccess().getAliasAssignment_3()); 
            // InternalSocialRequest.g:3144:2: ( rule__From__AliasAssignment_3 )
            // InternalSocialRequest.g:3144:3: rule__From__AliasAssignment_3
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
    // InternalSocialRequest.g:3152:1: rule__From__Group__4 : rule__From__Group__4__Impl ;
    public final void rule__From__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:3156:1: ( rule__From__Group__4__Impl )
            // InternalSocialRequest.g:3157:2: rule__From__Group__4__Impl
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
    // InternalSocialRequest.g:3163:1: rule__From__Group__4__Impl : ( '}' ) ;
    public final void rule__From__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:3167:1: ( ( '}' ) )
            // InternalSocialRequest.g:3168:1: ( '}' )
            {
            // InternalSocialRequest.g:3168:1: ( '}' )
            // InternalSocialRequest.g:3169:2: '}'
            {
             before(grammarAccess.getFromAccess().getRightCurlyBracketKeyword_4()); 
            match(input,36,FOLLOW_2); 
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
    // InternalSocialRequest.g:3179:1: rule__Join__Group__0 : rule__Join__Group__0__Impl rule__Join__Group__1 ;
    public final void rule__Join__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:3183:1: ( rule__Join__Group__0__Impl rule__Join__Group__1 )
            // InternalSocialRequest.g:3184:2: rule__Join__Group__0__Impl rule__Join__Group__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalSocialRequest.g:3191:1: rule__Join__Group__0__Impl : ( ( rule__Join__JoinTypeAssignment_0 ) ) ;
    public final void rule__Join__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:3195:1: ( ( ( rule__Join__JoinTypeAssignment_0 ) ) )
            // InternalSocialRequest.g:3196:1: ( ( rule__Join__JoinTypeAssignment_0 ) )
            {
            // InternalSocialRequest.g:3196:1: ( ( rule__Join__JoinTypeAssignment_0 ) )
            // InternalSocialRequest.g:3197:2: ( rule__Join__JoinTypeAssignment_0 )
            {
             before(grammarAccess.getJoinAccess().getJoinTypeAssignment_0()); 
            // InternalSocialRequest.g:3198:2: ( rule__Join__JoinTypeAssignment_0 )
            // InternalSocialRequest.g:3198:3: rule__Join__JoinTypeAssignment_0
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
    // InternalSocialRequest.g:3206:1: rule__Join__Group__1 : rule__Join__Group__1__Impl rule__Join__Group__2 ;
    public final void rule__Join__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:3210:1: ( rule__Join__Group__1__Impl rule__Join__Group__2 )
            // InternalSocialRequest.g:3211:2: rule__Join__Group__1__Impl rule__Join__Group__2
            {
            pushFollow(FOLLOW_4);
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
    // InternalSocialRequest.g:3218:1: rule__Join__Group__1__Impl : ( '{' ) ;
    public final void rule__Join__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:3222:1: ( ( '{' ) )
            // InternalSocialRequest.g:3223:1: ( '{' )
            {
            // InternalSocialRequest.g:3223:1: ( '{' )
            // InternalSocialRequest.g:3224:2: '{'
            {
             before(grammarAccess.getJoinAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,35,FOLLOW_2); 
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
    // InternalSocialRequest.g:3233:1: rule__Join__Group__2 : rule__Join__Group__2__Impl rule__Join__Group__3 ;
    public final void rule__Join__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:3237:1: ( rule__Join__Group__2__Impl rule__Join__Group__3 )
            // InternalSocialRequest.g:3238:2: rule__Join__Group__2__Impl rule__Join__Group__3
            {
            pushFollow(FOLLOW_4);
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
    // InternalSocialRequest.g:3245:1: rule__Join__Group__2__Impl : ( ( rule__Join__EntityAssignment_2 ) ) ;
    public final void rule__Join__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:3249:1: ( ( ( rule__Join__EntityAssignment_2 ) ) )
            // InternalSocialRequest.g:3250:1: ( ( rule__Join__EntityAssignment_2 ) )
            {
            // InternalSocialRequest.g:3250:1: ( ( rule__Join__EntityAssignment_2 ) )
            // InternalSocialRequest.g:3251:2: ( rule__Join__EntityAssignment_2 )
            {
             before(grammarAccess.getJoinAccess().getEntityAssignment_2()); 
            // InternalSocialRequest.g:3252:2: ( rule__Join__EntityAssignment_2 )
            // InternalSocialRequest.g:3252:3: rule__Join__EntityAssignment_2
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
    // InternalSocialRequest.g:3260:1: rule__Join__Group__3 : rule__Join__Group__3__Impl rule__Join__Group__4 ;
    public final void rule__Join__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:3264:1: ( rule__Join__Group__3__Impl rule__Join__Group__4 )
            // InternalSocialRequest.g:3265:2: rule__Join__Group__3__Impl rule__Join__Group__4
            {
            pushFollow(FOLLOW_11);
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
    // InternalSocialRequest.g:3272:1: rule__Join__Group__3__Impl : ( ( rule__Join__AliasAssignment_3 ) ) ;
    public final void rule__Join__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:3276:1: ( ( ( rule__Join__AliasAssignment_3 ) ) )
            // InternalSocialRequest.g:3277:1: ( ( rule__Join__AliasAssignment_3 ) )
            {
            // InternalSocialRequest.g:3277:1: ( ( rule__Join__AliasAssignment_3 ) )
            // InternalSocialRequest.g:3278:2: ( rule__Join__AliasAssignment_3 )
            {
             before(grammarAccess.getJoinAccess().getAliasAssignment_3()); 
            // InternalSocialRequest.g:3279:2: ( rule__Join__AliasAssignment_3 )
            // InternalSocialRequest.g:3279:3: rule__Join__AliasAssignment_3
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
    // InternalSocialRequest.g:3287:1: rule__Join__Group__4 : rule__Join__Group__4__Impl rule__Join__Group__5 ;
    public final void rule__Join__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:3291:1: ( rule__Join__Group__4__Impl rule__Join__Group__5 )
            // InternalSocialRequest.g:3292:2: rule__Join__Group__4__Impl rule__Join__Group__5
            {
            pushFollow(FOLLOW_37);
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
    // InternalSocialRequest.g:3299:1: rule__Join__Group__4__Impl : ( '}' ) ;
    public final void rule__Join__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:3303:1: ( ( '}' ) )
            // InternalSocialRequest.g:3304:1: ( '}' )
            {
            // InternalSocialRequest.g:3304:1: ( '}' )
            // InternalSocialRequest.g:3305:2: '}'
            {
             before(grammarAccess.getJoinAccess().getRightCurlyBracketKeyword_4()); 
            match(input,36,FOLLOW_2); 
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
    // InternalSocialRequest.g:3314:1: rule__Join__Group__5 : rule__Join__Group__5__Impl ;
    public final void rule__Join__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:3318:1: ( rule__Join__Group__5__Impl )
            // InternalSocialRequest.g:3319:2: rule__Join__Group__5__Impl
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
    // InternalSocialRequest.g:3325:1: rule__Join__Group__5__Impl : ( ( rule__Join__Group_5__0 )? ) ;
    public final void rule__Join__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:3329:1: ( ( ( rule__Join__Group_5__0 )? ) )
            // InternalSocialRequest.g:3330:1: ( ( rule__Join__Group_5__0 )? )
            {
            // InternalSocialRequest.g:3330:1: ( ( rule__Join__Group_5__0 )? )
            // InternalSocialRequest.g:3331:2: ( rule__Join__Group_5__0 )?
            {
             before(grammarAccess.getJoinAccess().getGroup_5()); 
            // InternalSocialRequest.g:3332:2: ( rule__Join__Group_5__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==55) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalSocialRequest.g:3332:3: rule__Join__Group_5__0
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
    // InternalSocialRequest.g:3341:1: rule__Join__Group_5__0 : rule__Join__Group_5__0__Impl rule__Join__Group_5__1 ;
    public final void rule__Join__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:3345:1: ( rule__Join__Group_5__0__Impl rule__Join__Group_5__1 )
            // InternalSocialRequest.g:3346:2: rule__Join__Group_5__0__Impl rule__Join__Group_5__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalSocialRequest.g:3353:1: rule__Join__Group_5__0__Impl : ( 'ON' ) ;
    public final void rule__Join__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:3357:1: ( ( 'ON' ) )
            // InternalSocialRequest.g:3358:1: ( 'ON' )
            {
            // InternalSocialRequest.g:3358:1: ( 'ON' )
            // InternalSocialRequest.g:3359:2: 'ON'
            {
             before(grammarAccess.getJoinAccess().getONKeyword_5_0()); 
            match(input,55,FOLLOW_2); 
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
    // InternalSocialRequest.g:3368:1: rule__Join__Group_5__1 : rule__Join__Group_5__1__Impl rule__Join__Group_5__2 ;
    public final void rule__Join__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:3372:1: ( rule__Join__Group_5__1__Impl rule__Join__Group_5__2 )
            // InternalSocialRequest.g:3373:2: rule__Join__Group_5__1__Impl rule__Join__Group_5__2
            {
            pushFollow(FOLLOW_25);
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
    // InternalSocialRequest.g:3380:1: rule__Join__Group_5__1__Impl : ( '{' ) ;
    public final void rule__Join__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:3384:1: ( ( '{' ) )
            // InternalSocialRequest.g:3385:1: ( '{' )
            {
            // InternalSocialRequest.g:3385:1: ( '{' )
            // InternalSocialRequest.g:3386:2: '{'
            {
             before(grammarAccess.getJoinAccess().getLeftCurlyBracketKeyword_5_1()); 
            match(input,35,FOLLOW_2); 
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
    // InternalSocialRequest.g:3395:1: rule__Join__Group_5__2 : rule__Join__Group_5__2__Impl rule__Join__Group_5__3 ;
    public final void rule__Join__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:3399:1: ( rule__Join__Group_5__2__Impl rule__Join__Group_5__3 )
            // InternalSocialRequest.g:3400:2: rule__Join__Group_5__2__Impl rule__Join__Group_5__3
            {
            pushFollow(FOLLOW_11);
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
    // InternalSocialRequest.g:3407:1: rule__Join__Group_5__2__Impl : ( ( rule__Join__JoinConditionAssignment_5_2 ) ) ;
    public final void rule__Join__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:3411:1: ( ( ( rule__Join__JoinConditionAssignment_5_2 ) ) )
            // InternalSocialRequest.g:3412:1: ( ( rule__Join__JoinConditionAssignment_5_2 ) )
            {
            // InternalSocialRequest.g:3412:1: ( ( rule__Join__JoinConditionAssignment_5_2 ) )
            // InternalSocialRequest.g:3413:2: ( rule__Join__JoinConditionAssignment_5_2 )
            {
             before(grammarAccess.getJoinAccess().getJoinConditionAssignment_5_2()); 
            // InternalSocialRequest.g:3414:2: ( rule__Join__JoinConditionAssignment_5_2 )
            // InternalSocialRequest.g:3414:3: rule__Join__JoinConditionAssignment_5_2
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
    // InternalSocialRequest.g:3422:1: rule__Join__Group_5__3 : rule__Join__Group_5__3__Impl ;
    public final void rule__Join__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:3426:1: ( rule__Join__Group_5__3__Impl )
            // InternalSocialRequest.g:3427:2: rule__Join__Group_5__3__Impl
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
    // InternalSocialRequest.g:3433:1: rule__Join__Group_5__3__Impl : ( '}' ) ;
    public final void rule__Join__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:3437:1: ( ( '}' ) )
            // InternalSocialRequest.g:3438:1: ( '}' )
            {
            // InternalSocialRequest.g:3438:1: ( '}' )
            // InternalSocialRequest.g:3439:2: '}'
            {
             before(grammarAccess.getJoinAccess().getRightCurlyBracketKeyword_5_3()); 
            match(input,36,FOLLOW_2); 
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
    // InternalSocialRequest.g:3449:1: rule__Where__Group__0 : rule__Where__Group__0__Impl rule__Where__Group__1 ;
    public final void rule__Where__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:3453:1: ( rule__Where__Group__0__Impl rule__Where__Group__1 )
            // InternalSocialRequest.g:3454:2: rule__Where__Group__0__Impl rule__Where__Group__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalSocialRequest.g:3461:1: rule__Where__Group__0__Impl : ( 'WHERE' ) ;
    public final void rule__Where__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:3465:1: ( ( 'WHERE' ) )
            // InternalSocialRequest.g:3466:1: ( 'WHERE' )
            {
            // InternalSocialRequest.g:3466:1: ( 'WHERE' )
            // InternalSocialRequest.g:3467:2: 'WHERE'
            {
             before(grammarAccess.getWhereAccess().getWHEREKeyword_0()); 
            match(input,56,FOLLOW_2); 
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
    // InternalSocialRequest.g:3476:1: rule__Where__Group__1 : rule__Where__Group__1__Impl rule__Where__Group__2 ;
    public final void rule__Where__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:3480:1: ( rule__Where__Group__1__Impl rule__Where__Group__2 )
            // InternalSocialRequest.g:3481:2: rule__Where__Group__1__Impl rule__Where__Group__2
            {
            pushFollow(FOLLOW_25);
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
    // InternalSocialRequest.g:3488:1: rule__Where__Group__1__Impl : ( '{' ) ;
    public final void rule__Where__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:3492:1: ( ( '{' ) )
            // InternalSocialRequest.g:3493:1: ( '{' )
            {
            // InternalSocialRequest.g:3493:1: ( '{' )
            // InternalSocialRequest.g:3494:2: '{'
            {
             before(grammarAccess.getWhereAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,35,FOLLOW_2); 
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
    // InternalSocialRequest.g:3503:1: rule__Where__Group__2 : rule__Where__Group__2__Impl rule__Where__Group__3 ;
    public final void rule__Where__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:3507:1: ( rule__Where__Group__2__Impl rule__Where__Group__3 )
            // InternalSocialRequest.g:3508:2: rule__Where__Group__2__Impl rule__Where__Group__3
            {
            pushFollow(FOLLOW_11);
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
    // InternalSocialRequest.g:3515:1: rule__Where__Group__2__Impl : ( ( rule__Where__ConditionAssignment_2 ) ) ;
    public final void rule__Where__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:3519:1: ( ( ( rule__Where__ConditionAssignment_2 ) ) )
            // InternalSocialRequest.g:3520:1: ( ( rule__Where__ConditionAssignment_2 ) )
            {
            // InternalSocialRequest.g:3520:1: ( ( rule__Where__ConditionAssignment_2 ) )
            // InternalSocialRequest.g:3521:2: ( rule__Where__ConditionAssignment_2 )
            {
             before(grammarAccess.getWhereAccess().getConditionAssignment_2()); 
            // InternalSocialRequest.g:3522:2: ( rule__Where__ConditionAssignment_2 )
            // InternalSocialRequest.g:3522:3: rule__Where__ConditionAssignment_2
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
    // InternalSocialRequest.g:3530:1: rule__Where__Group__3 : rule__Where__Group__3__Impl ;
    public final void rule__Where__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:3534:1: ( rule__Where__Group__3__Impl )
            // InternalSocialRequest.g:3535:2: rule__Where__Group__3__Impl
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
    // InternalSocialRequest.g:3541:1: rule__Where__Group__3__Impl : ( '}' ) ;
    public final void rule__Where__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:3545:1: ( ( '}' ) )
            // InternalSocialRequest.g:3546:1: ( '}' )
            {
            // InternalSocialRequest.g:3546:1: ( '}' )
            // InternalSocialRequest.g:3547:2: '}'
            {
             before(grammarAccess.getWhereAccess().getRightCurlyBracketKeyword_3()); 
            match(input,36,FOLLOW_2); 
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
    // InternalSocialRequest.g:3557:1: rule__Order__Group__0 : rule__Order__Group__0__Impl rule__Order__Group__1 ;
    public final void rule__Order__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:3561:1: ( rule__Order__Group__0__Impl rule__Order__Group__1 )
            // InternalSocialRequest.g:3562:2: rule__Order__Group__0__Impl rule__Order__Group__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalSocialRequest.g:3569:1: rule__Order__Group__0__Impl : ( 'ORDER BY' ) ;
    public final void rule__Order__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:3573:1: ( ( 'ORDER BY' ) )
            // InternalSocialRequest.g:3574:1: ( 'ORDER BY' )
            {
            // InternalSocialRequest.g:3574:1: ( 'ORDER BY' )
            // InternalSocialRequest.g:3575:2: 'ORDER BY'
            {
             before(grammarAccess.getOrderAccess().getORDERBYKeyword_0()); 
            match(input,57,FOLLOW_2); 
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
    // InternalSocialRequest.g:3584:1: rule__Order__Group__1 : rule__Order__Group__1__Impl rule__Order__Group__2 ;
    public final void rule__Order__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:3588:1: ( rule__Order__Group__1__Impl rule__Order__Group__2 )
            // InternalSocialRequest.g:3589:2: rule__Order__Group__1__Impl rule__Order__Group__2
            {
            pushFollow(FOLLOW_25);
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
    // InternalSocialRequest.g:3596:1: rule__Order__Group__1__Impl : ( '{' ) ;
    public final void rule__Order__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:3600:1: ( ( '{' ) )
            // InternalSocialRequest.g:3601:1: ( '{' )
            {
            // InternalSocialRequest.g:3601:1: ( '{' )
            // InternalSocialRequest.g:3602:2: '{'
            {
             before(grammarAccess.getOrderAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,35,FOLLOW_2); 
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
    // InternalSocialRequest.g:3611:1: rule__Order__Group__2 : rule__Order__Group__2__Impl rule__Order__Group__3 ;
    public final void rule__Order__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:3615:1: ( rule__Order__Group__2__Impl rule__Order__Group__3 )
            // InternalSocialRequest.g:3616:2: rule__Order__Group__2__Impl rule__Order__Group__3
            {
            pushFollow(FOLLOW_11);
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
    // InternalSocialRequest.g:3623:1: rule__Order__Group__2__Impl : ( ( rule__Order__OrderAssignment_2 ) ) ;
    public final void rule__Order__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:3627:1: ( ( ( rule__Order__OrderAssignment_2 ) ) )
            // InternalSocialRequest.g:3628:1: ( ( rule__Order__OrderAssignment_2 ) )
            {
            // InternalSocialRequest.g:3628:1: ( ( rule__Order__OrderAssignment_2 ) )
            // InternalSocialRequest.g:3629:2: ( rule__Order__OrderAssignment_2 )
            {
             before(grammarAccess.getOrderAccess().getOrderAssignment_2()); 
            // InternalSocialRequest.g:3630:2: ( rule__Order__OrderAssignment_2 )
            // InternalSocialRequest.g:3630:3: rule__Order__OrderAssignment_2
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
    // InternalSocialRequest.g:3638:1: rule__Order__Group__3 : rule__Order__Group__3__Impl ;
    public final void rule__Order__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:3642:1: ( rule__Order__Group__3__Impl )
            // InternalSocialRequest.g:3643:2: rule__Order__Group__3__Impl
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
    // InternalSocialRequest.g:3649:1: rule__Order__Group__3__Impl : ( '}' ) ;
    public final void rule__Order__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:3653:1: ( ( '}' ) )
            // InternalSocialRequest.g:3654:1: ( '}' )
            {
            // InternalSocialRequest.g:3654:1: ( '}' )
            // InternalSocialRequest.g:3655:2: '}'
            {
             before(grammarAccess.getOrderAccess().getRightCurlyBracketKeyword_3()); 
            match(input,36,FOLLOW_2); 
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


    // $ANTLR start "rule__FullPackageName__Group__0"
    // InternalSocialRequest.g:3665:1: rule__FullPackageName__Group__0 : rule__FullPackageName__Group__0__Impl rule__FullPackageName__Group__1 ;
    public final void rule__FullPackageName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:3669:1: ( rule__FullPackageName__Group__0__Impl rule__FullPackageName__Group__1 )
            // InternalSocialRequest.g:3670:2: rule__FullPackageName__Group__0__Impl rule__FullPackageName__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__FullPackageName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FullPackageName__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FullPackageName__Group__0"


    // $ANTLR start "rule__FullPackageName__Group__0__Impl"
    // InternalSocialRequest.g:3677:1: rule__FullPackageName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__FullPackageName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:3681:1: ( ( RULE_ID ) )
            // InternalSocialRequest.g:3682:1: ( RULE_ID )
            {
            // InternalSocialRequest.g:3682:1: ( RULE_ID )
            // InternalSocialRequest.g:3683:2: RULE_ID
            {
             before(grammarAccess.getFullPackageNameAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFullPackageNameAccess().getIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FullPackageName__Group__0__Impl"


    // $ANTLR start "rule__FullPackageName__Group__1"
    // InternalSocialRequest.g:3692:1: rule__FullPackageName__Group__1 : rule__FullPackageName__Group__1__Impl ;
    public final void rule__FullPackageName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:3696:1: ( rule__FullPackageName__Group__1__Impl )
            // InternalSocialRequest.g:3697:2: rule__FullPackageName__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FullPackageName__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FullPackageName__Group__1"


    // $ANTLR start "rule__FullPackageName__Group__1__Impl"
    // InternalSocialRequest.g:3703:1: rule__FullPackageName__Group__1__Impl : ( ( rule__FullPackageName__Group_1__0 )* ) ;
    public final void rule__FullPackageName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:3707:1: ( ( ( rule__FullPackageName__Group_1__0 )* ) )
            // InternalSocialRequest.g:3708:1: ( ( rule__FullPackageName__Group_1__0 )* )
            {
            // InternalSocialRequest.g:3708:1: ( ( rule__FullPackageName__Group_1__0 )* )
            // InternalSocialRequest.g:3709:2: ( rule__FullPackageName__Group_1__0 )*
            {
             before(grammarAccess.getFullPackageNameAccess().getGroup_1()); 
            // InternalSocialRequest.g:3710:2: ( rule__FullPackageName__Group_1__0 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==37) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalSocialRequest.g:3710:3: rule__FullPackageName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__FullPackageName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

             after(grammarAccess.getFullPackageNameAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FullPackageName__Group__1__Impl"


    // $ANTLR start "rule__FullPackageName__Group_1__0"
    // InternalSocialRequest.g:3719:1: rule__FullPackageName__Group_1__0 : rule__FullPackageName__Group_1__0__Impl rule__FullPackageName__Group_1__1 ;
    public final void rule__FullPackageName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:3723:1: ( rule__FullPackageName__Group_1__0__Impl rule__FullPackageName__Group_1__1 )
            // InternalSocialRequest.g:3724:2: rule__FullPackageName__Group_1__0__Impl rule__FullPackageName__Group_1__1
            {
            pushFollow(FOLLOW_4);
            rule__FullPackageName__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FullPackageName__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FullPackageName__Group_1__0"


    // $ANTLR start "rule__FullPackageName__Group_1__0__Impl"
    // InternalSocialRequest.g:3731:1: rule__FullPackageName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__FullPackageName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:3735:1: ( ( '.' ) )
            // InternalSocialRequest.g:3736:1: ( '.' )
            {
            // InternalSocialRequest.g:3736:1: ( '.' )
            // InternalSocialRequest.g:3737:2: '.'
            {
             before(grammarAccess.getFullPackageNameAccess().getFullStopKeyword_1_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getFullPackageNameAccess().getFullStopKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FullPackageName__Group_1__0__Impl"


    // $ANTLR start "rule__FullPackageName__Group_1__1"
    // InternalSocialRequest.g:3746:1: rule__FullPackageName__Group_1__1 : rule__FullPackageName__Group_1__1__Impl ;
    public final void rule__FullPackageName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:3750:1: ( rule__FullPackageName__Group_1__1__Impl )
            // InternalSocialRequest.g:3751:2: rule__FullPackageName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FullPackageName__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FullPackageName__Group_1__1"


    // $ANTLR start "rule__FullPackageName__Group_1__1__Impl"
    // InternalSocialRequest.g:3757:1: rule__FullPackageName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__FullPackageName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:3761:1: ( ( RULE_ID ) )
            // InternalSocialRequest.g:3762:1: ( RULE_ID )
            {
            // InternalSocialRequest.g:3762:1: ( RULE_ID )
            // InternalSocialRequest.g:3763:2: RULE_ID
            {
             before(grammarAccess.getFullPackageNameAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFullPackageNameAccess().getIDTerminalRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FullPackageName__Group_1__1__Impl"


    // $ANTLR start "rule__Attribute__UnorderedGroup_5_1"
    // InternalSocialRequest.g:3773:1: rule__Attribute__UnorderedGroup_5_1 : ( rule__Attribute__UnorderedGroup_5_1__0 )? ;
    public final void rule__Attribute__UnorderedGroup_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getAttributeAccess().getUnorderedGroup_5_1());
        	
        try {
            // InternalSocialRequest.g:3778:1: ( ( rule__Attribute__UnorderedGroup_5_1__0 )? )
            // InternalSocialRequest.g:3779:2: ( rule__Attribute__UnorderedGroup_5_1__0 )?
            {
            // InternalSocialRequest.g:3779:2: ( rule__Attribute__UnorderedGroup_5_1__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( LA31_0 == 41 && getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_1(), 0) ) {
                alt31=1;
            }
            else if ( LA31_0 == 42 && getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_1(), 1) ) {
                alt31=1;
            }
            else if ( LA31_0 == 43 && getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_1(), 2) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalSocialRequest.g:3779:2: rule__Attribute__UnorderedGroup_5_1__0
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
    // InternalSocialRequest.g:3787:1: rule__Attribute__UnorderedGroup_5_1__Impl : ( ({...}? => ( ( ( rule__Attribute__Group_5_1_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Attribute__Group_5_1_1__0 ) ) ) ) | ({...}? => ( ( ( rule__Attribute__Group_5_1_2__0 ) ) ) ) ) ;
    public final void rule__Attribute__UnorderedGroup_5_1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
        	
        try {
            // InternalSocialRequest.g:3792:1: ( ( ({...}? => ( ( ( rule__Attribute__Group_5_1_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Attribute__Group_5_1_1__0 ) ) ) ) | ({...}? => ( ( ( rule__Attribute__Group_5_1_2__0 ) ) ) ) ) )
            // InternalSocialRequest.g:3793:3: ( ({...}? => ( ( ( rule__Attribute__Group_5_1_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Attribute__Group_5_1_1__0 ) ) ) ) | ({...}? => ( ( ( rule__Attribute__Group_5_1_2__0 ) ) ) ) )
            {
            // InternalSocialRequest.g:3793:3: ( ({...}? => ( ( ( rule__Attribute__Group_5_1_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Attribute__Group_5_1_1__0 ) ) ) ) | ({...}? => ( ( ( rule__Attribute__Group_5_1_2__0 ) ) ) ) )
            int alt32=3;
            int LA32_0 = input.LA(1);

            if ( LA32_0 == 41 && getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_1(), 0) ) {
                alt32=1;
            }
            else if ( LA32_0 == 42 && getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_1(), 1) ) {
                alt32=2;
            }
            else if ( LA32_0 == 43 && getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_1(), 2) ) {
                alt32=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }
            switch (alt32) {
                case 1 :
                    // InternalSocialRequest.g:3794:3: ({...}? => ( ( ( rule__Attribute__Group_5_1_0__0 ) ) ) )
                    {
                    // InternalSocialRequest.g:3794:3: ({...}? => ( ( ( rule__Attribute__Group_5_1_0__0 ) ) ) )
                    // InternalSocialRequest.g:3795:4: {...}? => ( ( ( rule__Attribute__Group_5_1_0__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_1(), 0) ) {
                        throw new FailedPredicateException(input, "rule__Attribute__UnorderedGroup_5_1__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_1(), 0)");
                    }
                    // InternalSocialRequest.g:3795:107: ( ( ( rule__Attribute__Group_5_1_0__0 ) ) )
                    // InternalSocialRequest.g:3796:5: ( ( rule__Attribute__Group_5_1_0__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getAttributeAccess().getUnorderedGroup_5_1(), 0);
                    				

                    					selected = true;
                    				
                    // InternalSocialRequest.g:3802:5: ( ( rule__Attribute__Group_5_1_0__0 ) )
                    // InternalSocialRequest.g:3803:6: ( rule__Attribute__Group_5_1_0__0 )
                    {
                     before(grammarAccess.getAttributeAccess().getGroup_5_1_0()); 
                    // InternalSocialRequest.g:3804:6: ( rule__Attribute__Group_5_1_0__0 )
                    // InternalSocialRequest.g:3804:7: rule__Attribute__Group_5_1_0__0
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
                    // InternalSocialRequest.g:3809:3: ({...}? => ( ( ( rule__Attribute__Group_5_1_1__0 ) ) ) )
                    {
                    // InternalSocialRequest.g:3809:3: ({...}? => ( ( ( rule__Attribute__Group_5_1_1__0 ) ) ) )
                    // InternalSocialRequest.g:3810:4: {...}? => ( ( ( rule__Attribute__Group_5_1_1__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_1(), 1) ) {
                        throw new FailedPredicateException(input, "rule__Attribute__UnorderedGroup_5_1__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_1(), 1)");
                    }
                    // InternalSocialRequest.g:3810:107: ( ( ( rule__Attribute__Group_5_1_1__0 ) ) )
                    // InternalSocialRequest.g:3811:5: ( ( rule__Attribute__Group_5_1_1__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getAttributeAccess().getUnorderedGroup_5_1(), 1);
                    				

                    					selected = true;
                    				
                    // InternalSocialRequest.g:3817:5: ( ( rule__Attribute__Group_5_1_1__0 ) )
                    // InternalSocialRequest.g:3818:6: ( rule__Attribute__Group_5_1_1__0 )
                    {
                     before(grammarAccess.getAttributeAccess().getGroup_5_1_1()); 
                    // InternalSocialRequest.g:3819:6: ( rule__Attribute__Group_5_1_1__0 )
                    // InternalSocialRequest.g:3819:7: rule__Attribute__Group_5_1_1__0
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
                    // InternalSocialRequest.g:3824:3: ({...}? => ( ( ( rule__Attribute__Group_5_1_2__0 ) ) ) )
                    {
                    // InternalSocialRequest.g:3824:3: ({...}? => ( ( ( rule__Attribute__Group_5_1_2__0 ) ) ) )
                    // InternalSocialRequest.g:3825:4: {...}? => ( ( ( rule__Attribute__Group_5_1_2__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_1(), 2) ) {
                        throw new FailedPredicateException(input, "rule__Attribute__UnorderedGroup_5_1__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_1(), 2)");
                    }
                    // InternalSocialRequest.g:3825:107: ( ( ( rule__Attribute__Group_5_1_2__0 ) ) )
                    // InternalSocialRequest.g:3826:5: ( ( rule__Attribute__Group_5_1_2__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getAttributeAccess().getUnorderedGroup_5_1(), 2);
                    				

                    					selected = true;
                    				
                    // InternalSocialRequest.g:3832:5: ( ( rule__Attribute__Group_5_1_2__0 ) )
                    // InternalSocialRequest.g:3833:6: ( rule__Attribute__Group_5_1_2__0 )
                    {
                     before(grammarAccess.getAttributeAccess().getGroup_5_1_2()); 
                    // InternalSocialRequest.g:3834:6: ( rule__Attribute__Group_5_1_2__0 )
                    // InternalSocialRequest.g:3834:7: rule__Attribute__Group_5_1_2__0
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
    // InternalSocialRequest.g:3847:1: rule__Attribute__UnorderedGroup_5_1__0 : rule__Attribute__UnorderedGroup_5_1__Impl ( rule__Attribute__UnorderedGroup_5_1__1 )? ;
    public final void rule__Attribute__UnorderedGroup_5_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:3851:1: ( rule__Attribute__UnorderedGroup_5_1__Impl ( rule__Attribute__UnorderedGroup_5_1__1 )? )
            // InternalSocialRequest.g:3852:2: rule__Attribute__UnorderedGroup_5_1__Impl ( rule__Attribute__UnorderedGroup_5_1__1 )?
            {
            pushFollow(FOLLOW_38);
            rule__Attribute__UnorderedGroup_5_1__Impl();

            state._fsp--;

            // InternalSocialRequest.g:3853:2: ( rule__Attribute__UnorderedGroup_5_1__1 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( LA33_0 == 41 && getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_1(), 0) ) {
                alt33=1;
            }
            else if ( LA33_0 == 42 && getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_1(), 1) ) {
                alt33=1;
            }
            else if ( LA33_0 == 43 && getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_1(), 2) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalSocialRequest.g:3853:2: rule__Attribute__UnorderedGroup_5_1__1
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
    // InternalSocialRequest.g:3859:1: rule__Attribute__UnorderedGroup_5_1__1 : rule__Attribute__UnorderedGroup_5_1__Impl ( rule__Attribute__UnorderedGroup_5_1__2 )? ;
    public final void rule__Attribute__UnorderedGroup_5_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:3863:1: ( rule__Attribute__UnorderedGroup_5_1__Impl ( rule__Attribute__UnorderedGroup_5_1__2 )? )
            // InternalSocialRequest.g:3864:2: rule__Attribute__UnorderedGroup_5_1__Impl ( rule__Attribute__UnorderedGroup_5_1__2 )?
            {
            pushFollow(FOLLOW_38);
            rule__Attribute__UnorderedGroup_5_1__Impl();

            state._fsp--;

            // InternalSocialRequest.g:3865:2: ( rule__Attribute__UnorderedGroup_5_1__2 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( LA34_0 == 41 && getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_1(), 0) ) {
                alt34=1;
            }
            else if ( LA34_0 == 42 && getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_1(), 1) ) {
                alt34=1;
            }
            else if ( LA34_0 == 43 && getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_1(), 2) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalSocialRequest.g:3865:2: rule__Attribute__UnorderedGroup_5_1__2
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
    // InternalSocialRequest.g:3871:1: rule__Attribute__UnorderedGroup_5_1__2 : rule__Attribute__UnorderedGroup_5_1__Impl ;
    public final void rule__Attribute__UnorderedGroup_5_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:3875:1: ( rule__Attribute__UnorderedGroup_5_1__Impl )
            // InternalSocialRequest.g:3876:2: rule__Attribute__UnorderedGroup_5_1__Impl
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


    // $ANTLR start "rule__Model__ElementsAssignment"
    // InternalSocialRequest.g:3883:1: rule__Model__ElementsAssignment : ( ruleAbstractElement ) ;
    public final void rule__Model__ElementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:3887:1: ( ( ruleAbstractElement ) )
            // InternalSocialRequest.g:3888:2: ( ruleAbstractElement )
            {
            // InternalSocialRequest.g:3888:2: ( ruleAbstractElement )
            // InternalSocialRequest.g:3889:3: ruleAbstractElement
            {
             before(grammarAccess.getModelAccess().getElementsAbstractElementParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleAbstractElement();

            state._fsp--;

             after(grammarAccess.getModelAccess().getElementsAbstractElementParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__ElementsAssignment"


    // $ANTLR start "rule__Package__NameAssignment_1"
    // InternalSocialRequest.g:3898:1: rule__Package__NameAssignment_1 : ( rulePointSeperatedID ) ;
    public final void rule__Package__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:3902:1: ( ( rulePointSeperatedID ) )
            // InternalSocialRequest.g:3903:2: ( rulePointSeperatedID )
            {
            // InternalSocialRequest.g:3903:2: ( rulePointSeperatedID )
            // InternalSocialRequest.g:3904:3: rulePointSeperatedID
            {
             before(grammarAccess.getPackageAccess().getNamePointSeperatedIDParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            rulePointSeperatedID();

            state._fsp--;

             after(grammarAccess.getPackageAccess().getNamePointSeperatedIDParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__NameAssignment_1"


    // $ANTLR start "rule__Package__ElementsAssignment_3"
    // InternalSocialRequest.g:3913:1: rule__Package__ElementsAssignment_3 : ( ruleAbstractElement ) ;
    public final void rule__Package__ElementsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:3917:1: ( ( ruleAbstractElement ) )
            // InternalSocialRequest.g:3918:2: ( ruleAbstractElement )
            {
            // InternalSocialRequest.g:3918:2: ( ruleAbstractElement )
            // InternalSocialRequest.g:3919:3: ruleAbstractElement
            {
             before(grammarAccess.getPackageAccess().getElementsAbstractElementParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleAbstractElement();

            state._fsp--;

             after(grammarAccess.getPackageAccess().getElementsAbstractElementParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__ElementsAssignment_3"


    // $ANTLR start "rule__Entity__NameAssignment_1"
    // InternalSocialRequest.g:3928:1: rule__Entity__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Entity__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:3932:1: ( ( RULE_ID ) )
            // InternalSocialRequest.g:3933:2: ( RULE_ID )
            {
            // InternalSocialRequest.g:3933:2: ( RULE_ID )
            // InternalSocialRequest.g:3934:3: RULE_ID
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
    // InternalSocialRequest.g:3943:1: rule__Entity__HasUserDetailsAssignment_2_0 : ( ( 'implements' ) ) ;
    public final void rule__Entity__HasUserDetailsAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:3947:1: ( ( ( 'implements' ) ) )
            // InternalSocialRequest.g:3948:2: ( ( 'implements' ) )
            {
            // InternalSocialRequest.g:3948:2: ( ( 'implements' ) )
            // InternalSocialRequest.g:3949:3: ( 'implements' )
            {
             before(grammarAccess.getEntityAccess().getHasUserDetailsImplementsKeyword_2_0_0()); 
            // InternalSocialRequest.g:3950:3: ( 'implements' )
            // InternalSocialRequest.g:3951:4: 'implements'
            {
             before(grammarAccess.getEntityAccess().getHasUserDetailsImplementsKeyword_2_0_0()); 
            match(input,58,FOLLOW_2); 
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
    // InternalSocialRequest.g:3962:1: rule__Entity__AttributesAssignment_4 : ( ruleAttribute ) ;
    public final void rule__Entity__AttributesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:3966:1: ( ( ruleAttribute ) )
            // InternalSocialRequest.g:3967:2: ( ruleAttribute )
            {
            // InternalSocialRequest.g:3967:2: ( ruleAttribute )
            // InternalSocialRequest.g:3968:3: ruleAttribute
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
    // InternalSocialRequest.g:3977:1: rule__Attribute__AssociationAssignment_0 : ( ruleASSOCIATION ) ;
    public final void rule__Attribute__AssociationAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:3981:1: ( ( ruleASSOCIATION ) )
            // InternalSocialRequest.g:3982:2: ( ruleASSOCIATION )
            {
            // InternalSocialRequest.g:3982:2: ( ruleASSOCIATION )
            // InternalSocialRequest.g:3983:3: ruleASSOCIATION
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
    // InternalSocialRequest.g:3992:1: rule__Attribute__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Attribute__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:3996:1: ( ( RULE_ID ) )
            // InternalSocialRequest.g:3997:2: ( RULE_ID )
            {
            // InternalSocialRequest.g:3997:2: ( RULE_ID )
            // InternalSocialRequest.g:3998:3: RULE_ID
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
    // InternalSocialRequest.g:4007:1: rule__Attribute__TypeRefAssignment_3 : ( ruleTypeReference ) ;
    public final void rule__Attribute__TypeRefAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:4011:1: ( ( ruleTypeReference ) )
            // InternalSocialRequest.g:4012:2: ( ruleTypeReference )
            {
            // InternalSocialRequest.g:4012:2: ( ruleTypeReference )
            // InternalSocialRequest.g:4013:3: ruleTypeReference
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
    // InternalSocialRequest.g:4022:1: rule__Attribute__ModifierAssignment_4 : ( ruleModifier ) ;
    public final void rule__Attribute__ModifierAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:4026:1: ( ( ruleModifier ) )
            // InternalSocialRequest.g:4027:2: ( ruleModifier )
            {
            // InternalSocialRequest.g:4027:2: ( ruleModifier )
            // InternalSocialRequest.g:4028:3: ruleModifier
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
    // InternalSocialRequest.g:4037:1: rule__Attribute__MappedByAssignment_5_1_0_1 : ( RULE_ID ) ;
    public final void rule__Attribute__MappedByAssignment_5_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:4041:1: ( ( RULE_ID ) )
            // InternalSocialRequest.g:4042:2: ( RULE_ID )
            {
            // InternalSocialRequest.g:4042:2: ( RULE_ID )
            // InternalSocialRequest.g:4043:3: RULE_ID
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
    // InternalSocialRequest.g:4052:1: rule__Attribute__FetchTypeAssignment_5_1_1_1 : ( RULE_FETCHTYPE ) ;
    public final void rule__Attribute__FetchTypeAssignment_5_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:4056:1: ( ( RULE_FETCHTYPE ) )
            // InternalSocialRequest.g:4057:2: ( RULE_FETCHTYPE )
            {
            // InternalSocialRequest.g:4057:2: ( RULE_FETCHTYPE )
            // InternalSocialRequest.g:4058:3: RULE_FETCHTYPE
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
    // InternalSocialRequest.g:4067:1: rule__Attribute__ValidationsAssignment_5_1_2_2 : ( ruleValidation ) ;
    public final void rule__Attribute__ValidationsAssignment_5_1_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:4071:1: ( ( ruleValidation ) )
            // InternalSocialRequest.g:4072:2: ( ruleValidation )
            {
            // InternalSocialRequest.g:4072:2: ( ruleValidation )
            // InternalSocialRequest.g:4073:3: ruleValidation
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
    // InternalSocialRequest.g:4082:1: rule__EntityTypeReference__TypeAssignment : ( ( ruleFullPackageName ) ) ;
    public final void rule__EntityTypeReference__TypeAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:4086:1: ( ( ( ruleFullPackageName ) ) )
            // InternalSocialRequest.g:4087:2: ( ( ruleFullPackageName ) )
            {
            // InternalSocialRequest.g:4087:2: ( ( ruleFullPackageName ) )
            // InternalSocialRequest.g:4088:3: ( ruleFullPackageName )
            {
             before(grammarAccess.getEntityTypeReferenceAccess().getTypeEntityCrossReference_0()); 
            // InternalSocialRequest.g:4089:3: ( ruleFullPackageName )
            // InternalSocialRequest.g:4090:4: ruleFullPackageName
            {
             before(grammarAccess.getEntityTypeReferenceAccess().getTypeEntityFullPackageNameParserRuleCall_0_1()); 
            pushFollow(FOLLOW_2);
            ruleFullPackageName();

            state._fsp--;

             after(grammarAccess.getEntityTypeReferenceAccess().getTypeEntityFullPackageNameParserRuleCall_0_1()); 

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
    // InternalSocialRequest.g:4101:1: rule__DataTypeReference__TypeAssignment : ( ruleDataType ) ;
    public final void rule__DataTypeReference__TypeAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:4105:1: ( ( ruleDataType ) )
            // InternalSocialRequest.g:4106:2: ( ruleDataType )
            {
            // InternalSocialRequest.g:4106:2: ( ruleDataType )
            // InternalSocialRequest.g:4107:3: ruleDataType
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
    // InternalSocialRequest.g:4116:1: rule__Modifier__IsLOBAssignment_0 : ( ( 'LOB' ) ) ;
    public final void rule__Modifier__IsLOBAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:4120:1: ( ( ( 'LOB' ) ) )
            // InternalSocialRequest.g:4121:2: ( ( 'LOB' ) )
            {
            // InternalSocialRequest.g:4121:2: ( ( 'LOB' ) )
            // InternalSocialRequest.g:4122:3: ( 'LOB' )
            {
             before(grammarAccess.getModifierAccess().getIsLOBLOBKeyword_0_0()); 
            // InternalSocialRequest.g:4123:3: ( 'LOB' )
            // InternalSocialRequest.g:4124:4: 'LOB'
            {
             before(grammarAccess.getModifierAccess().getIsLOBLOBKeyword_0_0()); 
            match(input,59,FOLLOW_2); 
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
    // InternalSocialRequest.g:4135:1: rule__Modifier__IsTransientAssignment_1 : ( ( 'TRANSIENT' ) ) ;
    public final void rule__Modifier__IsTransientAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:4139:1: ( ( ( 'TRANSIENT' ) ) )
            // InternalSocialRequest.g:4140:2: ( ( 'TRANSIENT' ) )
            {
            // InternalSocialRequest.g:4140:2: ( ( 'TRANSIENT' ) )
            // InternalSocialRequest.g:4141:3: ( 'TRANSIENT' )
            {
             before(grammarAccess.getModifierAccess().getIsTransientTRANSIENTKeyword_1_0()); 
            // InternalSocialRequest.g:4142:3: ( 'TRANSIENT' )
            // InternalSocialRequest.g:4143:4: 'TRANSIENT'
            {
             before(grammarAccess.getModifierAccess().getIsTransientTRANSIENTKeyword_1_0()); 
            match(input,60,FOLLOW_2); 
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
    // InternalSocialRequest.g:4154:1: rule__Modifier__IsIDAssignment_2_0 : ( ( 'ID' ) ) ;
    public final void rule__Modifier__IsIDAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:4158:1: ( ( ( 'ID' ) ) )
            // InternalSocialRequest.g:4159:2: ( ( 'ID' ) )
            {
            // InternalSocialRequest.g:4159:2: ( ( 'ID' ) )
            // InternalSocialRequest.g:4160:3: ( 'ID' )
            {
             before(grammarAccess.getModifierAccess().getIsIDIDKeyword_2_0_0()); 
            // InternalSocialRequest.g:4161:3: ( 'ID' )
            // InternalSocialRequest.g:4162:4: 'ID'
            {
             before(grammarAccess.getModifierAccess().getIsIDIDKeyword_2_0_0()); 
            match(input,61,FOLLOW_2); 
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
    // InternalSocialRequest.g:4173:1: rule__Modifier__IDGenerationTypeAssignment_2_1_1 : ( RULE_GENERATIONTYPE ) ;
    public final void rule__Modifier__IDGenerationTypeAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:4177:1: ( ( RULE_GENERATIONTYPE ) )
            // InternalSocialRequest.g:4178:2: ( RULE_GENERATIONTYPE )
            {
            // InternalSocialRequest.g:4178:2: ( RULE_GENERATIONTYPE )
            // InternalSocialRequest.g:4179:3: RULE_GENERATIONTYPE
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
    // InternalSocialRequest.g:4188:1: rule__Validation__MinAssignment_0_1 : ( RULE_POSSIBLY_SIGNED_INT ) ;
    public final void rule__Validation__MinAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:4192:1: ( ( RULE_POSSIBLY_SIGNED_INT ) )
            // InternalSocialRequest.g:4193:2: ( RULE_POSSIBLY_SIGNED_INT )
            {
            // InternalSocialRequest.g:4193:2: ( RULE_POSSIBLY_SIGNED_INT )
            // InternalSocialRequest.g:4194:3: RULE_POSSIBLY_SIGNED_INT
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
    // InternalSocialRequest.g:4203:1: rule__Validation__MaxAssignment_1_1 : ( RULE_POSSIBLY_SIGNED_INT ) ;
    public final void rule__Validation__MaxAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:4207:1: ( ( RULE_POSSIBLY_SIGNED_INT ) )
            // InternalSocialRequest.g:4208:2: ( RULE_POSSIBLY_SIGNED_INT )
            {
            // InternalSocialRequest.g:4208:2: ( RULE_POSSIBLY_SIGNED_INT )
            // InternalSocialRequest.g:4209:3: RULE_POSSIBLY_SIGNED_INT
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
    // InternalSocialRequest.g:4218:1: rule__Validation__RegexAssignment_2_1 : ( RULE_STRING ) ;
    public final void rule__Validation__RegexAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:4222:1: ( ( RULE_STRING ) )
            // InternalSocialRequest.g:4223:2: ( RULE_STRING )
            {
            // InternalSocialRequest.g:4223:2: ( RULE_STRING )
            // InternalSocialRequest.g:4224:3: RULE_STRING
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
    // InternalSocialRequest.g:4233:1: rule__Validation__ValidatorAssignment_3 : ( ruleBASICVALIDATION ) ;
    public final void rule__Validation__ValidatorAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:4237:1: ( ( ruleBASICVALIDATION ) )
            // InternalSocialRequest.g:4238:2: ( ruleBASICVALIDATION )
            {
            // InternalSocialRequest.g:4238:2: ( ruleBASICVALIDATION )
            // InternalSocialRequest.g:4239:3: ruleBASICVALIDATION
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


    // $ANTLR start "rule__Validation__UniqueAssignment_4"
    // InternalSocialRequest.g:4248:1: rule__Validation__UniqueAssignment_4 : ( ( 'unique' ) ) ;
    public final void rule__Validation__UniqueAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:4252:1: ( ( ( 'unique' ) ) )
            // InternalSocialRequest.g:4253:2: ( ( 'unique' ) )
            {
            // InternalSocialRequest.g:4253:2: ( ( 'unique' ) )
            // InternalSocialRequest.g:4254:3: ( 'unique' )
            {
             before(grammarAccess.getValidationAccess().getUniqueUniqueKeyword_4_0()); 
            // InternalSocialRequest.g:4255:3: ( 'unique' )
            // InternalSocialRequest.g:4256:4: 'unique'
            {
             before(grammarAccess.getValidationAccess().getUniqueUniqueKeyword_4_0()); 
            match(input,62,FOLLOW_2); 
             after(grammarAccess.getValidationAccess().getUniqueUniqueKeyword_4_0()); 

            }

             after(grammarAccess.getValidationAccess().getUniqueUniqueKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Validation__UniqueAssignment_4"


    // $ANTLR start "rule__Repository__EntityAssignment_1"
    // InternalSocialRequest.g:4267:1: rule__Repository__EntityAssignment_1 : ( ( ruleFullPackageName ) ) ;
    public final void rule__Repository__EntityAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:4271:1: ( ( ( ruleFullPackageName ) ) )
            // InternalSocialRequest.g:4272:2: ( ( ruleFullPackageName ) )
            {
            // InternalSocialRequest.g:4272:2: ( ( ruleFullPackageName ) )
            // InternalSocialRequest.g:4273:3: ( ruleFullPackageName )
            {
             before(grammarAccess.getRepositoryAccess().getEntityEntityCrossReference_1_0()); 
            // InternalSocialRequest.g:4274:3: ( ruleFullPackageName )
            // InternalSocialRequest.g:4275:4: ruleFullPackageName
            {
             before(grammarAccess.getRepositoryAccess().getEntityEntityFullPackageNameParserRuleCall_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleFullPackageName();

            state._fsp--;

             after(grammarAccess.getRepositoryAccess().getEntityEntityFullPackageNameParserRuleCall_1_0_1()); 

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
    // InternalSocialRequest.g:4286:1: rule__Repository__QueriesAssignment_3 : ( ruleQuery ) ;
    public final void rule__Repository__QueriesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:4290:1: ( ( ruleQuery ) )
            // InternalSocialRequest.g:4291:2: ( ruleQuery )
            {
            // InternalSocialRequest.g:4291:2: ( ruleQuery )
            // InternalSocialRequest.g:4292:3: ruleQuery
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
    // InternalSocialRequest.g:4301:1: rule__Query__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Query__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:4305:1: ( ( RULE_ID ) )
            // InternalSocialRequest.g:4306:2: ( RULE_ID )
            {
            // InternalSocialRequest.g:4306:2: ( RULE_ID )
            // InternalSocialRequest.g:4307:3: RULE_ID
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
    // InternalSocialRequest.g:4316:1: rule__Query__IsListAssignment_2_0 : ( ( ':' ) ) ;
    public final void rule__Query__IsListAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:4320:1: ( ( ( ':' ) ) )
            // InternalSocialRequest.g:4321:2: ( ( ':' ) )
            {
            // InternalSocialRequest.g:4321:2: ( ( ':' ) )
            // InternalSocialRequest.g:4322:3: ( ':' )
            {
             before(grammarAccess.getQueryAccess().getIsListColonKeyword_2_0_0()); 
            // InternalSocialRequest.g:4323:3: ( ':' )
            // InternalSocialRequest.g:4324:4: ':'
            {
             before(grammarAccess.getQueryAccess().getIsListColonKeyword_2_0_0()); 
            match(input,40,FOLLOW_2); 
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
    // InternalSocialRequest.g:4335:1: rule__Query__ParamsAssignment_3_1_2 : ( ruleParam ) ;
    public final void rule__Query__ParamsAssignment_3_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:4339:1: ( ( ruleParam ) )
            // InternalSocialRequest.g:4340:2: ( ruleParam )
            {
            // InternalSocialRequest.g:4340:2: ( ruleParam )
            // InternalSocialRequest.g:4341:3: ruleParam
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
    // InternalSocialRequest.g:4350:1: rule__Query__SqlQueryAssignment_3_2 : ( ruleSQLQuery ) ;
    public final void rule__Query__SqlQueryAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:4354:1: ( ( ruleSQLQuery ) )
            // InternalSocialRequest.g:4355:2: ( ruleSQLQuery )
            {
            // InternalSocialRequest.g:4355:2: ( ruleSQLQuery )
            // InternalSocialRequest.g:4356:3: ruleSQLQuery
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
    // InternalSocialRequest.g:4365:1: rule__Param__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Param__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:4369:1: ( ( RULE_ID ) )
            // InternalSocialRequest.g:4370:2: ( RULE_ID )
            {
            // InternalSocialRequest.g:4370:2: ( RULE_ID )
            // InternalSocialRequest.g:4371:3: RULE_ID
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
    // InternalSocialRequest.g:4380:1: rule__Param__TypeAssignment_2 : ( ruleTypeReference ) ;
    public final void rule__Param__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:4384:1: ( ( ruleTypeReference ) )
            // InternalSocialRequest.g:4385:2: ( ruleTypeReference )
            {
            // InternalSocialRequest.g:4385:2: ( ruleTypeReference )
            // InternalSocialRequest.g:4386:3: ruleTypeReference
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
    // InternalSocialRequest.g:4395:1: rule__SQLQuery__SelectAssignment_0 : ( ruleSelect ) ;
    public final void rule__SQLQuery__SelectAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:4399:1: ( ( ruleSelect ) )
            // InternalSocialRequest.g:4400:2: ( ruleSelect )
            {
            // InternalSocialRequest.g:4400:2: ( ruleSelect )
            // InternalSocialRequest.g:4401:3: ruleSelect
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
    // InternalSocialRequest.g:4410:1: rule__SQLQuery__FromAssignment_1 : ( ruleFrom ) ;
    public final void rule__SQLQuery__FromAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:4414:1: ( ( ruleFrom ) )
            // InternalSocialRequest.g:4415:2: ( ruleFrom )
            {
            // InternalSocialRequest.g:4415:2: ( ruleFrom )
            // InternalSocialRequest.g:4416:3: ruleFrom
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
    // InternalSocialRequest.g:4425:1: rule__SQLQuery__JoinsAssignment_2 : ( ruleJoin ) ;
    public final void rule__SQLQuery__JoinsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:4429:1: ( ( ruleJoin ) )
            // InternalSocialRequest.g:4430:2: ( ruleJoin )
            {
            // InternalSocialRequest.g:4430:2: ( ruleJoin )
            // InternalSocialRequest.g:4431:3: ruleJoin
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
    // InternalSocialRequest.g:4440:1: rule__SQLQuery__WhereAssignment_3 : ( ruleWhere ) ;
    public final void rule__SQLQuery__WhereAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:4444:1: ( ( ruleWhere ) )
            // InternalSocialRequest.g:4445:2: ( ruleWhere )
            {
            // InternalSocialRequest.g:4445:2: ( ruleWhere )
            // InternalSocialRequest.g:4446:3: ruleWhere
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
    // InternalSocialRequest.g:4455:1: rule__SQLQuery__OrderAssignment_4 : ( ruleOrder ) ;
    public final void rule__SQLQuery__OrderAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:4459:1: ( ( ruleOrder ) )
            // InternalSocialRequest.g:4460:2: ( ruleOrder )
            {
            // InternalSocialRequest.g:4460:2: ( ruleOrder )
            // InternalSocialRequest.g:4461:3: ruleOrder
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
    // InternalSocialRequest.g:4470:1: rule__Select__IsDistinctAssignment_1 : ( ( 'DISTINCT' ) ) ;
    public final void rule__Select__IsDistinctAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:4474:1: ( ( ( 'DISTINCT' ) ) )
            // InternalSocialRequest.g:4475:2: ( ( 'DISTINCT' ) )
            {
            // InternalSocialRequest.g:4475:2: ( ( 'DISTINCT' ) )
            // InternalSocialRequest.g:4476:3: ( 'DISTINCT' )
            {
             before(grammarAccess.getSelectAccess().getIsDistinctDISTINCTKeyword_1_0()); 
            // InternalSocialRequest.g:4477:3: ( 'DISTINCT' )
            // InternalSocialRequest.g:4478:4: 'DISTINCT'
            {
             before(grammarAccess.getSelectAccess().getIsDistinctDISTINCTKeyword_1_0()); 
            match(input,63,FOLLOW_2); 
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
    // InternalSocialRequest.g:4489:1: rule__Select__ClauseAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Select__ClauseAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:4493:1: ( ( RULE_STRING ) )
            // InternalSocialRequest.g:4494:2: ( RULE_STRING )
            {
            // InternalSocialRequest.g:4494:2: ( RULE_STRING )
            // InternalSocialRequest.g:4495:3: RULE_STRING
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
    // InternalSocialRequest.g:4504:1: rule__From__EntityAssignment_2 : ( ( ruleFullPackageName ) ) ;
    public final void rule__From__EntityAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:4508:1: ( ( ( ruleFullPackageName ) ) )
            // InternalSocialRequest.g:4509:2: ( ( ruleFullPackageName ) )
            {
            // InternalSocialRequest.g:4509:2: ( ( ruleFullPackageName ) )
            // InternalSocialRequest.g:4510:3: ( ruleFullPackageName )
            {
             before(grammarAccess.getFromAccess().getEntityEntityCrossReference_2_0()); 
            // InternalSocialRequest.g:4511:3: ( ruleFullPackageName )
            // InternalSocialRequest.g:4512:4: ruleFullPackageName
            {
             before(grammarAccess.getFromAccess().getEntityEntityFullPackageNameParserRuleCall_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleFullPackageName();

            state._fsp--;

             after(grammarAccess.getFromAccess().getEntityEntityFullPackageNameParserRuleCall_2_0_1()); 

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
    // InternalSocialRequest.g:4523:1: rule__From__AliasAssignment_3 : ( RULE_ID ) ;
    public final void rule__From__AliasAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:4527:1: ( ( RULE_ID ) )
            // InternalSocialRequest.g:4528:2: ( RULE_ID )
            {
            // InternalSocialRequest.g:4528:2: ( RULE_ID )
            // InternalSocialRequest.g:4529:3: RULE_ID
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
    // InternalSocialRequest.g:4538:1: rule__Join__JoinTypeAssignment_0 : ( ruleJoinType ) ;
    public final void rule__Join__JoinTypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:4542:1: ( ( ruleJoinType ) )
            // InternalSocialRequest.g:4543:2: ( ruleJoinType )
            {
            // InternalSocialRequest.g:4543:2: ( ruleJoinType )
            // InternalSocialRequest.g:4544:3: ruleJoinType
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
    // InternalSocialRequest.g:4553:1: rule__Join__EntityAssignment_2 : ( ( ruleFullPackageName ) ) ;
    public final void rule__Join__EntityAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:4557:1: ( ( ( ruleFullPackageName ) ) )
            // InternalSocialRequest.g:4558:2: ( ( ruleFullPackageName ) )
            {
            // InternalSocialRequest.g:4558:2: ( ( ruleFullPackageName ) )
            // InternalSocialRequest.g:4559:3: ( ruleFullPackageName )
            {
             before(grammarAccess.getJoinAccess().getEntityEntityCrossReference_2_0()); 
            // InternalSocialRequest.g:4560:3: ( ruleFullPackageName )
            // InternalSocialRequest.g:4561:4: ruleFullPackageName
            {
             before(grammarAccess.getJoinAccess().getEntityEntityFullPackageNameParserRuleCall_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleFullPackageName();

            state._fsp--;

             after(grammarAccess.getJoinAccess().getEntityEntityFullPackageNameParserRuleCall_2_0_1()); 

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
    // InternalSocialRequest.g:4572:1: rule__Join__AliasAssignment_3 : ( RULE_ID ) ;
    public final void rule__Join__AliasAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:4576:1: ( ( RULE_ID ) )
            // InternalSocialRequest.g:4577:2: ( RULE_ID )
            {
            // InternalSocialRequest.g:4577:2: ( RULE_ID )
            // InternalSocialRequest.g:4578:3: RULE_ID
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
    // InternalSocialRequest.g:4587:1: rule__Join__JoinConditionAssignment_5_2 : ( RULE_STRING ) ;
    public final void rule__Join__JoinConditionAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:4591:1: ( ( RULE_STRING ) )
            // InternalSocialRequest.g:4592:2: ( RULE_STRING )
            {
            // InternalSocialRequest.g:4592:2: ( RULE_STRING )
            // InternalSocialRequest.g:4593:3: RULE_STRING
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
    // InternalSocialRequest.g:4602:1: rule__Where__ConditionAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Where__ConditionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:4606:1: ( ( RULE_STRING ) )
            // InternalSocialRequest.g:4607:2: ( RULE_STRING )
            {
            // InternalSocialRequest.g:4607:2: ( RULE_STRING )
            // InternalSocialRequest.g:4608:3: RULE_STRING
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
    // InternalSocialRequest.g:4617:1: rule__Order__OrderAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Order__OrderAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocialRequest.g:4621:1: ( ( RULE_STRING ) )
            // InternalSocialRequest.g:4622:2: ( RULE_STRING )
            {
            // InternalSocialRequest.g:4622:2: ( RULE_STRING )
            // InternalSocialRequest.g:4623:3: RULE_STRING
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0002004400000002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0002005400000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0400000800000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000000003C0010L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x00000000003C0012L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x000000003FC00010L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x3800000800000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x00000E0000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x4001C0000003C000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x4001C0000003C002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000010800000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0030001000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000001000000010L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x03000003C0000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x00000003C0000002L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x8000000800000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x00000E0000000002L});

}
