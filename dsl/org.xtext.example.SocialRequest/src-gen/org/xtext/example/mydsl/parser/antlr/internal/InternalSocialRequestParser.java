package org.xtext.example.mydsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl.services.SocialRequestGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSocialRequestParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_FETCHTYPE", "RULE_POSSIBLY_SIGNED_INT", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Entity'", "'implements'", "'UserDetails'", "'{'", "'}'", "':'", "'mappedBy:'", "'fetch:'", "'validations'", "'LOB'", "'TRANSIENT'", "'ID'", "'('", "')'", "'min:'", "'max:'", "'pattern:'", "'NotNull'", "'NotBlank'", "'Past'", "'Unique'", "'Email'", "'OneToMany'", "'ManyToOne'", "'OneToOne'", "'ManyToMany'", "'Repository'", "'query'", "'list'", "'params'", "'SELECT'", "'DISTINCT'", "'FROM'", "'ON'", "'WHERE'", "'ORDER BY'", "'AUTO'", "'TABLE'", "'IDENTITY'", "'SEQUENCE'", "'String'", "'long'", "'float'", "'double'", "'char'", "'int'", "'boolean'", "'Date'", "'LEFT JOIN'", "'LEFT OUTER JOIN'", "'CROSS JOIN'", "'JOIN'"
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

        public InternalSocialRequestParser(TokenStream input, SocialRequestGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected SocialRequestGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalSocialRequest.g:65:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalSocialRequest.g:65:46: (iv_ruleModel= ruleModel EOF )
            // InternalSocialRequest.g:66:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalSocialRequest.g:72:1: ruleModel returns [EObject current=null] : ( ( (lv_entities_0_0= ruleEntity ) )* ( (lv_repositories_1_0= ruleRepository ) )* ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_entities_0_0 = null;

        EObject lv_repositories_1_0 = null;



        	enterRule();

        try {
            // InternalSocialRequest.g:78:2: ( ( ( (lv_entities_0_0= ruleEntity ) )* ( (lv_repositories_1_0= ruleRepository ) )* ) )
            // InternalSocialRequest.g:79:2: ( ( (lv_entities_0_0= ruleEntity ) )* ( (lv_repositories_1_0= ruleRepository ) )* )
            {
            // InternalSocialRequest.g:79:2: ( ( (lv_entities_0_0= ruleEntity ) )* ( (lv_repositories_1_0= ruleRepository ) )* )
            // InternalSocialRequest.g:80:3: ( (lv_entities_0_0= ruleEntity ) )* ( (lv_repositories_1_0= ruleRepository ) )*
            {
            // InternalSocialRequest.g:80:3: ( (lv_entities_0_0= ruleEntity ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==13) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalSocialRequest.g:81:4: (lv_entities_0_0= ruleEntity )
            	    {
            	    // InternalSocialRequest.g:81:4: (lv_entities_0_0= ruleEntity )
            	    // InternalSocialRequest.g:82:5: lv_entities_0_0= ruleEntity
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getEntitiesEntityParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_entities_0_0=ruleEntity();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"entities",
            	    						lv_entities_0_0,
            	    						"org.xtext.example.mydsl.SocialRequest.Entity");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalSocialRequest.g:99:3: ( (lv_repositories_1_0= ruleRepository ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==39) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalSocialRequest.g:100:4: (lv_repositories_1_0= ruleRepository )
            	    {
            	    // InternalSocialRequest.g:100:4: (lv_repositories_1_0= ruleRepository )
            	    // InternalSocialRequest.g:101:5: lv_repositories_1_0= ruleRepository
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getRepositoriesRepositoryParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_repositories_1_0=ruleRepository();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"repositories",
            	    						lv_repositories_1_0,
            	    						"org.xtext.example.mydsl.SocialRequest.Repository");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleEntity"
    // InternalSocialRequest.g:122:1: entryRuleEntity returns [EObject current=null] : iv_ruleEntity= ruleEntity EOF ;
    public final EObject entryRuleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntity = null;


        try {
            // InternalSocialRequest.g:122:47: (iv_ruleEntity= ruleEntity EOF )
            // InternalSocialRequest.g:123:2: iv_ruleEntity= ruleEntity EOF
            {
             newCompositeNode(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEntity=ruleEntity();

            state._fsp--;

             current =iv_ruleEntity; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEntity"


    // $ANTLR start "ruleEntity"
    // InternalSocialRequest.g:129:1: ruleEntity returns [EObject current=null] : (otherlv_0= 'Entity' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_hasUserDetails_2_0= 'implements' ) ) otherlv_3= 'UserDetails' )? otherlv_4= '{' ( (lv_attributes_5_0= ruleAttribute ) )+ otherlv_6= '}' ) ;
    public final EObject ruleEntity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_hasUserDetails_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_attributes_5_0 = null;



        	enterRule();

        try {
            // InternalSocialRequest.g:135:2: ( (otherlv_0= 'Entity' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_hasUserDetails_2_0= 'implements' ) ) otherlv_3= 'UserDetails' )? otherlv_4= '{' ( (lv_attributes_5_0= ruleAttribute ) )+ otherlv_6= '}' ) )
            // InternalSocialRequest.g:136:2: (otherlv_0= 'Entity' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_hasUserDetails_2_0= 'implements' ) ) otherlv_3= 'UserDetails' )? otherlv_4= '{' ( (lv_attributes_5_0= ruleAttribute ) )+ otherlv_6= '}' )
            {
            // InternalSocialRequest.g:136:2: (otherlv_0= 'Entity' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_hasUserDetails_2_0= 'implements' ) ) otherlv_3= 'UserDetails' )? otherlv_4= '{' ( (lv_attributes_5_0= ruleAttribute ) )+ otherlv_6= '}' )
            // InternalSocialRequest.g:137:3: otherlv_0= 'Entity' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_hasUserDetails_2_0= 'implements' ) ) otherlv_3= 'UserDetails' )? otherlv_4= '{' ( (lv_attributes_5_0= ruleAttribute ) )+ otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getEntityAccess().getEntityKeyword_0());
            		
            // InternalSocialRequest.g:141:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSocialRequest.g:142:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSocialRequest.g:142:4: (lv_name_1_0= RULE_ID )
            // InternalSocialRequest.g:143:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_name_1_0, grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEntityRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalSocialRequest.g:159:3: ( ( (lv_hasUserDetails_2_0= 'implements' ) ) otherlv_3= 'UserDetails' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==14) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalSocialRequest.g:160:4: ( (lv_hasUserDetails_2_0= 'implements' ) ) otherlv_3= 'UserDetails'
                    {
                    // InternalSocialRequest.g:160:4: ( (lv_hasUserDetails_2_0= 'implements' ) )
                    // InternalSocialRequest.g:161:5: (lv_hasUserDetails_2_0= 'implements' )
                    {
                    // InternalSocialRequest.g:161:5: (lv_hasUserDetails_2_0= 'implements' )
                    // InternalSocialRequest.g:162:6: lv_hasUserDetails_2_0= 'implements'
                    {
                    lv_hasUserDetails_2_0=(Token)match(input,14,FOLLOW_7); 

                    						newLeafNode(lv_hasUserDetails_2_0, grammarAccess.getEntityAccess().getHasUserDetailsImplementsKeyword_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEntityRule());
                    						}
                    						setWithLastConsumed(current, "hasUserDetails", true, "implements");
                    					

                    }


                    }

                    otherlv_3=(Token)match(input,15,FOLLOW_8); 

                    				newLeafNode(otherlv_3, grammarAccess.getEntityAccess().getUserDetailsKeyword_2_1());
                    			

                    }
                    break;

            }

            otherlv_4=(Token)match(input,16,FOLLOW_9); 

            			newLeafNode(otherlv_4, grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalSocialRequest.g:183:3: ( (lv_attributes_5_0= ruleAttribute ) )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_ID||(LA4_0>=35 && LA4_0<=38)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalSocialRequest.g:184:4: (lv_attributes_5_0= ruleAttribute )
            	    {
            	    // InternalSocialRequest.g:184:4: (lv_attributes_5_0= ruleAttribute )
            	    // InternalSocialRequest.g:185:5: lv_attributes_5_0= ruleAttribute
            	    {

            	    					newCompositeNode(grammarAccess.getEntityAccess().getAttributesAttributeParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_10);
            	    lv_attributes_5_0=ruleAttribute();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getEntityRule());
            	    					}
            	    					add(
            	    						current,
            	    						"attributes",
            	    						lv_attributes_5_0,
            	    						"org.xtext.example.mydsl.SocialRequest.Attribute");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);

            otherlv_6=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEntity"


    // $ANTLR start "entryRuleAttribute"
    // InternalSocialRequest.g:210:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // InternalSocialRequest.g:210:50: (iv_ruleAttribute= ruleAttribute EOF )
            // InternalSocialRequest.g:211:2: iv_ruleAttribute= ruleAttribute EOF
            {
             newCompositeNode(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAttribute=ruleAttribute();

            state._fsp--;

             current =iv_ruleAttribute; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // InternalSocialRequest.g:217:1: ruleAttribute returns [EObject current=null] : ( ( (lv_association_0_0= ruleASSOCIATION ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_typeRef_3_0= ruleTypeReference ) ) ( (lv_modifier_4_0= ruleModifier ) )? (otherlv_5= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_7= 'mappedBy:' ( (lv_mappedBy_8_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'fetch:' ( (lv_fetchType_10_0= RULE_FETCHTYPE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'validations' otherlv_12= '{' ( (lv_validations_13_0= ruleValidation ) )+ otherlv_14= '}' ) ) ) ) )* ) ) ) otherlv_15= '}' )? ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token lv_mappedBy_8_0=null;
        Token otherlv_9=null;
        Token lv_fetchType_10_0=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        AntlrDatatypeRuleToken lv_association_0_0 = null;

        EObject lv_typeRef_3_0 = null;

        EObject lv_modifier_4_0 = null;

        EObject lv_validations_13_0 = null;



        	enterRule();

        try {
            // InternalSocialRequest.g:223:2: ( ( ( (lv_association_0_0= ruleASSOCIATION ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_typeRef_3_0= ruleTypeReference ) ) ( (lv_modifier_4_0= ruleModifier ) )? (otherlv_5= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_7= 'mappedBy:' ( (lv_mappedBy_8_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'fetch:' ( (lv_fetchType_10_0= RULE_FETCHTYPE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'validations' otherlv_12= '{' ( (lv_validations_13_0= ruleValidation ) )+ otherlv_14= '}' ) ) ) ) )* ) ) ) otherlv_15= '}' )? ) )
            // InternalSocialRequest.g:224:2: ( ( (lv_association_0_0= ruleASSOCIATION ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_typeRef_3_0= ruleTypeReference ) ) ( (lv_modifier_4_0= ruleModifier ) )? (otherlv_5= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_7= 'mappedBy:' ( (lv_mappedBy_8_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'fetch:' ( (lv_fetchType_10_0= RULE_FETCHTYPE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'validations' otherlv_12= '{' ( (lv_validations_13_0= ruleValidation ) )+ otherlv_14= '}' ) ) ) ) )* ) ) ) otherlv_15= '}' )? )
            {
            // InternalSocialRequest.g:224:2: ( ( (lv_association_0_0= ruleASSOCIATION ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_typeRef_3_0= ruleTypeReference ) ) ( (lv_modifier_4_0= ruleModifier ) )? (otherlv_5= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_7= 'mappedBy:' ( (lv_mappedBy_8_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'fetch:' ( (lv_fetchType_10_0= RULE_FETCHTYPE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'validations' otherlv_12= '{' ( (lv_validations_13_0= ruleValidation ) )+ otherlv_14= '}' ) ) ) ) )* ) ) ) otherlv_15= '}' )? )
            // InternalSocialRequest.g:225:3: ( (lv_association_0_0= ruleASSOCIATION ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_typeRef_3_0= ruleTypeReference ) ) ( (lv_modifier_4_0= ruleModifier ) )? (otherlv_5= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_7= 'mappedBy:' ( (lv_mappedBy_8_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'fetch:' ( (lv_fetchType_10_0= RULE_FETCHTYPE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'validations' otherlv_12= '{' ( (lv_validations_13_0= ruleValidation ) )+ otherlv_14= '}' ) ) ) ) )* ) ) ) otherlv_15= '}' )?
            {
            // InternalSocialRequest.g:225:3: ( (lv_association_0_0= ruleASSOCIATION ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=35 && LA5_0<=38)) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalSocialRequest.g:226:4: (lv_association_0_0= ruleASSOCIATION )
                    {
                    // InternalSocialRequest.g:226:4: (lv_association_0_0= ruleASSOCIATION )
                    // InternalSocialRequest.g:227:5: lv_association_0_0= ruleASSOCIATION
                    {

                    					newCompositeNode(grammarAccess.getAttributeAccess().getAssociationASSOCIATIONParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_5);
                    lv_association_0_0=ruleASSOCIATION();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getAttributeRule());
                    					}
                    					set(
                    						current,
                    						"association",
                    						lv_association_0_0,
                    						"org.xtext.example.mydsl.SocialRequest.ASSOCIATION");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalSocialRequest.g:244:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSocialRequest.g:245:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSocialRequest.g:245:4: (lv_name_1_0= RULE_ID )
            // InternalSocialRequest.g:246:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(lv_name_1_0, grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAttributeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,18,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getAttributeAccess().getColonKeyword_2());
            		
            // InternalSocialRequest.g:266:3: ( (lv_typeRef_3_0= ruleTypeReference ) )
            // InternalSocialRequest.g:267:4: (lv_typeRef_3_0= ruleTypeReference )
            {
            // InternalSocialRequest.g:267:4: (lv_typeRef_3_0= ruleTypeReference )
            // InternalSocialRequest.g:268:5: lv_typeRef_3_0= ruleTypeReference
            {

            					newCompositeNode(grammarAccess.getAttributeAccess().getTypeRefTypeReferenceParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_13);
            lv_typeRef_3_0=ruleTypeReference();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAttributeRule());
            					}
            					set(
            						current,
            						"typeRef",
            						lv_typeRef_3_0,
            						"org.xtext.example.mydsl.SocialRequest.TypeReference");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSocialRequest.g:285:3: ( (lv_modifier_4_0= ruleModifier ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=22 && LA6_0<=24)) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalSocialRequest.g:286:4: (lv_modifier_4_0= ruleModifier )
                    {
                    // InternalSocialRequest.g:286:4: (lv_modifier_4_0= ruleModifier )
                    // InternalSocialRequest.g:287:5: lv_modifier_4_0= ruleModifier
                    {

                    					newCompositeNode(grammarAccess.getAttributeAccess().getModifierModifierParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_14);
                    lv_modifier_4_0=ruleModifier();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getAttributeRule());
                    					}
                    					set(
                    						current,
                    						"modifier",
                    						lv_modifier_4_0,
                    						"org.xtext.example.mydsl.SocialRequest.Modifier");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalSocialRequest.g:304:3: (otherlv_5= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_7= 'mappedBy:' ( (lv_mappedBy_8_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'fetch:' ( (lv_fetchType_10_0= RULE_FETCHTYPE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'validations' otherlv_12= '{' ( (lv_validations_13_0= ruleValidation ) )+ otherlv_14= '}' ) ) ) ) )* ) ) ) otherlv_15= '}' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==16) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalSocialRequest.g:305:4: otherlv_5= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_7= 'mappedBy:' ( (lv_mappedBy_8_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'fetch:' ( (lv_fetchType_10_0= RULE_FETCHTYPE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'validations' otherlv_12= '{' ( (lv_validations_13_0= ruleValidation ) )+ otherlv_14= '}' ) ) ) ) )* ) ) ) otherlv_15= '}'
                    {
                    otherlv_5=(Token)match(input,16,FOLLOW_15); 

                    				newLeafNode(otherlv_5, grammarAccess.getAttributeAccess().getLeftCurlyBracketKeyword_5_0());
                    			
                    // InternalSocialRequest.g:309:4: ( ( ( ( ({...}? => ( ({...}? => (otherlv_7= 'mappedBy:' ( (lv_mappedBy_8_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'fetch:' ( (lv_fetchType_10_0= RULE_FETCHTYPE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'validations' otherlv_12= '{' ( (lv_validations_13_0= ruleValidation ) )+ otherlv_14= '}' ) ) ) ) )* ) ) )
                    // InternalSocialRequest.g:310:5: ( ( ( ({...}? => ( ({...}? => (otherlv_7= 'mappedBy:' ( (lv_mappedBy_8_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'fetch:' ( (lv_fetchType_10_0= RULE_FETCHTYPE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'validations' otherlv_12= '{' ( (lv_validations_13_0= ruleValidation ) )+ otherlv_14= '}' ) ) ) ) )* ) )
                    {
                    // InternalSocialRequest.g:310:5: ( ( ( ({...}? => ( ({...}? => (otherlv_7= 'mappedBy:' ( (lv_mappedBy_8_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'fetch:' ( (lv_fetchType_10_0= RULE_FETCHTYPE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'validations' otherlv_12= '{' ( (lv_validations_13_0= ruleValidation ) )+ otherlv_14= '}' ) ) ) ) )* ) )
                    // InternalSocialRequest.g:311:6: ( ( ({...}? => ( ({...}? => (otherlv_7= 'mappedBy:' ( (lv_mappedBy_8_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'fetch:' ( (lv_fetchType_10_0= RULE_FETCHTYPE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'validations' otherlv_12= '{' ( (lv_validations_13_0= ruleValidation ) )+ otherlv_14= '}' ) ) ) ) )* )
                    {
                     
                    					  getUnorderedGroupHelper().enter(grammarAccess.getAttributeAccess().getUnorderedGroup_5_1());
                    					
                    // InternalSocialRequest.g:314:6: ( ( ({...}? => ( ({...}? => (otherlv_7= 'mappedBy:' ( (lv_mappedBy_8_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'fetch:' ( (lv_fetchType_10_0= RULE_FETCHTYPE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'validations' otherlv_12= '{' ( (lv_validations_13_0= ruleValidation ) )+ otherlv_14= '}' ) ) ) ) )* )
                    // InternalSocialRequest.g:315:7: ( ({...}? => ( ({...}? => (otherlv_7= 'mappedBy:' ( (lv_mappedBy_8_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'fetch:' ( (lv_fetchType_10_0= RULE_FETCHTYPE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'validations' otherlv_12= '{' ( (lv_validations_13_0= ruleValidation ) )+ otherlv_14= '}' ) ) ) ) )*
                    {
                    // InternalSocialRequest.g:315:7: ( ({...}? => ( ({...}? => (otherlv_7= 'mappedBy:' ( (lv_mappedBy_8_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'fetch:' ( (lv_fetchType_10_0= RULE_FETCHTYPE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'validations' otherlv_12= '{' ( (lv_validations_13_0= ruleValidation ) )+ otherlv_14= '}' ) ) ) ) )*
                    loop8:
                    do {
                        int alt8=4;
                        int LA8_0 = input.LA(1);

                        if ( LA8_0 == 19 && getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_1(), 0) ) {
                            alt8=1;
                        }
                        else if ( LA8_0 == 20 && getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_1(), 1) ) {
                            alt8=2;
                        }
                        else if ( LA8_0 == 21 && getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_1(), 2) ) {
                            alt8=3;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalSocialRequest.g:316:5: ({...}? => ( ({...}? => (otherlv_7= 'mappedBy:' ( (lv_mappedBy_8_0= RULE_ID ) ) ) ) ) )
                    	    {
                    	    // InternalSocialRequest.g:316:5: ({...}? => ( ({...}? => (otherlv_7= 'mappedBy:' ( (lv_mappedBy_8_0= RULE_ID ) ) ) ) ) )
                    	    // InternalSocialRequest.g:317:6: {...}? => ( ({...}? => (otherlv_7= 'mappedBy:' ( (lv_mappedBy_8_0= RULE_ID ) ) ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_1(), 0) ) {
                    	        throw new FailedPredicateException(input, "ruleAttribute", "getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_1(), 0)");
                    	    }
                    	    // InternalSocialRequest.g:317:109: ( ({...}? => (otherlv_7= 'mappedBy:' ( (lv_mappedBy_8_0= RULE_ID ) ) ) ) )
                    	    // InternalSocialRequest.g:318:7: ({...}? => (otherlv_7= 'mappedBy:' ( (lv_mappedBy_8_0= RULE_ID ) ) ) )
                    	    {

                    	    							getUnorderedGroupHelper().select(grammarAccess.getAttributeAccess().getUnorderedGroup_5_1(), 0);
                    	    						
                    	    // InternalSocialRequest.g:321:10: ({...}? => (otherlv_7= 'mappedBy:' ( (lv_mappedBy_8_0= RULE_ID ) ) ) )
                    	    // InternalSocialRequest.g:321:11: {...}? => (otherlv_7= 'mappedBy:' ( (lv_mappedBy_8_0= RULE_ID ) ) )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleAttribute", "true");
                    	    }
                    	    // InternalSocialRequest.g:321:20: (otherlv_7= 'mappedBy:' ( (lv_mappedBy_8_0= RULE_ID ) ) )
                    	    // InternalSocialRequest.g:321:21: otherlv_7= 'mappedBy:' ( (lv_mappedBy_8_0= RULE_ID ) )
                    	    {
                    	    otherlv_7=(Token)match(input,19,FOLLOW_5); 

                    	    										newLeafNode(otherlv_7, grammarAccess.getAttributeAccess().getMappedByKeyword_5_1_0_0());
                    	    									
                    	    // InternalSocialRequest.g:325:10: ( (lv_mappedBy_8_0= RULE_ID ) )
                    	    // InternalSocialRequest.g:326:11: (lv_mappedBy_8_0= RULE_ID )
                    	    {
                    	    // InternalSocialRequest.g:326:11: (lv_mappedBy_8_0= RULE_ID )
                    	    // InternalSocialRequest.g:327:12: lv_mappedBy_8_0= RULE_ID
                    	    {
                    	    lv_mappedBy_8_0=(Token)match(input,RULE_ID,FOLLOW_15); 

                    	    												newLeafNode(lv_mappedBy_8_0, grammarAccess.getAttributeAccess().getMappedByIDTerminalRuleCall_5_1_0_1_0());
                    	    											

                    	    												if (current==null) {
                    	    													current = createModelElement(grammarAccess.getAttributeRule());
                    	    												}
                    	    												setWithLastConsumed(
                    	    													current,
                    	    													"mappedBy",
                    	    													lv_mappedBy_8_0,
                    	    													"org.eclipse.xtext.common.Terminals.ID");
                    	    											

                    	    }


                    	    }


                    	    }


                    	    }

                    	     
                    	    							getUnorderedGroupHelper().returnFromSelection(grammarAccess.getAttributeAccess().getUnorderedGroup_5_1());
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalSocialRequest.g:349:5: ({...}? => ( ({...}? => (otherlv_9= 'fetch:' ( (lv_fetchType_10_0= RULE_FETCHTYPE ) ) ) ) ) )
                    	    {
                    	    // InternalSocialRequest.g:349:5: ({...}? => ( ({...}? => (otherlv_9= 'fetch:' ( (lv_fetchType_10_0= RULE_FETCHTYPE ) ) ) ) ) )
                    	    // InternalSocialRequest.g:350:6: {...}? => ( ({...}? => (otherlv_9= 'fetch:' ( (lv_fetchType_10_0= RULE_FETCHTYPE ) ) ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_1(), 1) ) {
                    	        throw new FailedPredicateException(input, "ruleAttribute", "getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_1(), 1)");
                    	    }
                    	    // InternalSocialRequest.g:350:109: ( ({...}? => (otherlv_9= 'fetch:' ( (lv_fetchType_10_0= RULE_FETCHTYPE ) ) ) ) )
                    	    // InternalSocialRequest.g:351:7: ({...}? => (otherlv_9= 'fetch:' ( (lv_fetchType_10_0= RULE_FETCHTYPE ) ) ) )
                    	    {

                    	    							getUnorderedGroupHelper().select(grammarAccess.getAttributeAccess().getUnorderedGroup_5_1(), 1);
                    	    						
                    	    // InternalSocialRequest.g:354:10: ({...}? => (otherlv_9= 'fetch:' ( (lv_fetchType_10_0= RULE_FETCHTYPE ) ) ) )
                    	    // InternalSocialRequest.g:354:11: {...}? => (otherlv_9= 'fetch:' ( (lv_fetchType_10_0= RULE_FETCHTYPE ) ) )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleAttribute", "true");
                    	    }
                    	    // InternalSocialRequest.g:354:20: (otherlv_9= 'fetch:' ( (lv_fetchType_10_0= RULE_FETCHTYPE ) ) )
                    	    // InternalSocialRequest.g:354:21: otherlv_9= 'fetch:' ( (lv_fetchType_10_0= RULE_FETCHTYPE ) )
                    	    {
                    	    otherlv_9=(Token)match(input,20,FOLLOW_16); 

                    	    										newLeafNode(otherlv_9, grammarAccess.getAttributeAccess().getFetchKeyword_5_1_1_0());
                    	    									
                    	    // InternalSocialRequest.g:358:10: ( (lv_fetchType_10_0= RULE_FETCHTYPE ) )
                    	    // InternalSocialRequest.g:359:11: (lv_fetchType_10_0= RULE_FETCHTYPE )
                    	    {
                    	    // InternalSocialRequest.g:359:11: (lv_fetchType_10_0= RULE_FETCHTYPE )
                    	    // InternalSocialRequest.g:360:12: lv_fetchType_10_0= RULE_FETCHTYPE
                    	    {
                    	    lv_fetchType_10_0=(Token)match(input,RULE_FETCHTYPE,FOLLOW_15); 

                    	    												newLeafNode(lv_fetchType_10_0, grammarAccess.getAttributeAccess().getFetchTypeFETCHTYPETerminalRuleCall_5_1_1_1_0());
                    	    											

                    	    												if (current==null) {
                    	    													current = createModelElement(grammarAccess.getAttributeRule());
                    	    												}
                    	    												setWithLastConsumed(
                    	    													current,
                    	    													"fetchType",
                    	    													lv_fetchType_10_0,
                    	    													"org.xtext.example.mydsl.SocialRequest.FETCHTYPE");
                    	    											

                    	    }


                    	    }


                    	    }


                    	    }

                    	     
                    	    							getUnorderedGroupHelper().returnFromSelection(grammarAccess.getAttributeAccess().getUnorderedGroup_5_1());
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 3 :
                    	    // InternalSocialRequest.g:382:5: ({...}? => ( ({...}? => (otherlv_11= 'validations' otherlv_12= '{' ( (lv_validations_13_0= ruleValidation ) )+ otherlv_14= '}' ) ) ) )
                    	    {
                    	    // InternalSocialRequest.g:382:5: ({...}? => ( ({...}? => (otherlv_11= 'validations' otherlv_12= '{' ( (lv_validations_13_0= ruleValidation ) )+ otherlv_14= '}' ) ) ) )
                    	    // InternalSocialRequest.g:383:6: {...}? => ( ({...}? => (otherlv_11= 'validations' otherlv_12= '{' ( (lv_validations_13_0= ruleValidation ) )+ otherlv_14= '}' ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_1(), 2) ) {
                    	        throw new FailedPredicateException(input, "ruleAttribute", "getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_1(), 2)");
                    	    }
                    	    // InternalSocialRequest.g:383:109: ( ({...}? => (otherlv_11= 'validations' otherlv_12= '{' ( (lv_validations_13_0= ruleValidation ) )+ otherlv_14= '}' ) ) )
                    	    // InternalSocialRequest.g:384:7: ({...}? => (otherlv_11= 'validations' otherlv_12= '{' ( (lv_validations_13_0= ruleValidation ) )+ otherlv_14= '}' ) )
                    	    {

                    	    							getUnorderedGroupHelper().select(grammarAccess.getAttributeAccess().getUnorderedGroup_5_1(), 2);
                    	    						
                    	    // InternalSocialRequest.g:387:10: ({...}? => (otherlv_11= 'validations' otherlv_12= '{' ( (lv_validations_13_0= ruleValidation ) )+ otherlv_14= '}' ) )
                    	    // InternalSocialRequest.g:387:11: {...}? => (otherlv_11= 'validations' otherlv_12= '{' ( (lv_validations_13_0= ruleValidation ) )+ otherlv_14= '}' )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleAttribute", "true");
                    	    }
                    	    // InternalSocialRequest.g:387:20: (otherlv_11= 'validations' otherlv_12= '{' ( (lv_validations_13_0= ruleValidation ) )+ otherlv_14= '}' )
                    	    // InternalSocialRequest.g:387:21: otherlv_11= 'validations' otherlv_12= '{' ( (lv_validations_13_0= ruleValidation ) )+ otherlv_14= '}'
                    	    {
                    	    otherlv_11=(Token)match(input,21,FOLLOW_8); 

                    	    										newLeafNode(otherlv_11, grammarAccess.getAttributeAccess().getValidationsKeyword_5_1_2_0());
                    	    									
                    	    otherlv_12=(Token)match(input,16,FOLLOW_17); 

                    	    										newLeafNode(otherlv_12, grammarAccess.getAttributeAccess().getLeftCurlyBracketKeyword_5_1_2_1());
                    	    									
                    	    // InternalSocialRequest.g:395:10: ( (lv_validations_13_0= ruleValidation ) )+
                    	    int cnt7=0;
                    	    loop7:
                    	    do {
                    	        int alt7=2;
                    	        int LA7_0 = input.LA(1);

                    	        if ( ((LA7_0>=27 && LA7_0<=34)) ) {
                    	            alt7=1;
                    	        }


                    	        switch (alt7) {
                    	    	case 1 :
                    	    	    // InternalSocialRequest.g:396:11: (lv_validations_13_0= ruleValidation )
                    	    	    {
                    	    	    // InternalSocialRequest.g:396:11: (lv_validations_13_0= ruleValidation )
                    	    	    // InternalSocialRequest.g:397:12: lv_validations_13_0= ruleValidation
                    	    	    {

                    	    	    												newCompositeNode(grammarAccess.getAttributeAccess().getValidationsValidationParserRuleCall_5_1_2_2_0());
                    	    	    											
                    	    	    pushFollow(FOLLOW_18);
                    	    	    lv_validations_13_0=ruleValidation();

                    	    	    state._fsp--;


                    	    	    												if (current==null) {
                    	    	    													current = createModelElementForParent(grammarAccess.getAttributeRule());
                    	    	    												}
                    	    	    												add(
                    	    	    													current,
                    	    	    													"validations",
                    	    	    													lv_validations_13_0,
                    	    	    													"org.xtext.example.mydsl.SocialRequest.Validation");
                    	    	    												afterParserOrEnumRuleCall();
                    	    	    											

                    	    	    }


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

                    	    otherlv_14=(Token)match(input,17,FOLLOW_15); 

                    	    										newLeafNode(otherlv_14, grammarAccess.getAttributeAccess().getRightCurlyBracketKeyword_5_1_2_3());
                    	    									

                    	    }


                    	    }

                    	     
                    	    							getUnorderedGroupHelper().returnFromSelection(grammarAccess.getAttributeAccess().getUnorderedGroup_5_1());
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);


                    }


                    }

                     
                    					  getUnorderedGroupHelper().leave(grammarAccess.getAttributeAccess().getUnorderedGroup_5_1());
                    					

                    }

                    otherlv_15=(Token)match(input,17,FOLLOW_2); 

                    				newLeafNode(otherlv_15, grammarAccess.getAttributeAccess().getRightCurlyBracketKeyword_5_2());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleTypeReference"
    // InternalSocialRequest.g:440:1: entryRuleTypeReference returns [EObject current=null] : iv_ruleTypeReference= ruleTypeReference EOF ;
    public final EObject entryRuleTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeReference = null;


        try {
            // InternalSocialRequest.g:440:54: (iv_ruleTypeReference= ruleTypeReference EOF )
            // InternalSocialRequest.g:441:2: iv_ruleTypeReference= ruleTypeReference EOF
            {
             newCompositeNode(grammarAccess.getTypeReferenceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTypeReference=ruleTypeReference();

            state._fsp--;

             current =iv_ruleTypeReference; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTypeReference"


    // $ANTLR start "ruleTypeReference"
    // InternalSocialRequest.g:447:1: ruleTypeReference returns [EObject current=null] : (this_EntityTypeReference_0= ruleEntityTypeReference | this_DataTypeReference_1= ruleDataTypeReference ) ;
    public final EObject ruleTypeReference() throws RecognitionException {
        EObject current = null;

        EObject this_EntityTypeReference_0 = null;

        EObject this_DataTypeReference_1 = null;



        	enterRule();

        try {
            // InternalSocialRequest.g:453:2: ( (this_EntityTypeReference_0= ruleEntityTypeReference | this_DataTypeReference_1= ruleDataTypeReference ) )
            // InternalSocialRequest.g:454:2: (this_EntityTypeReference_0= ruleEntityTypeReference | this_DataTypeReference_1= ruleDataTypeReference )
            {
            // InternalSocialRequest.g:454:2: (this_EntityTypeReference_0= ruleEntityTypeReference | this_DataTypeReference_1= ruleDataTypeReference )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_ID) ) {
                alt10=1;
            }
            else if ( ((LA10_0>=53 && LA10_0<=60)) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalSocialRequest.g:455:3: this_EntityTypeReference_0= ruleEntityTypeReference
                    {

                    			newCompositeNode(grammarAccess.getTypeReferenceAccess().getEntityTypeReferenceParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_EntityTypeReference_0=ruleEntityTypeReference();

                    state._fsp--;


                    			current = this_EntityTypeReference_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalSocialRequest.g:464:3: this_DataTypeReference_1= ruleDataTypeReference
                    {

                    			newCompositeNode(grammarAccess.getTypeReferenceAccess().getDataTypeReferenceParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_DataTypeReference_1=ruleDataTypeReference();

                    state._fsp--;


                    			current = this_DataTypeReference_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTypeReference"


    // $ANTLR start "entryRuleEntityTypeReference"
    // InternalSocialRequest.g:476:1: entryRuleEntityTypeReference returns [EObject current=null] : iv_ruleEntityTypeReference= ruleEntityTypeReference EOF ;
    public final EObject entryRuleEntityTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntityTypeReference = null;


        try {
            // InternalSocialRequest.g:476:60: (iv_ruleEntityTypeReference= ruleEntityTypeReference EOF )
            // InternalSocialRequest.g:477:2: iv_ruleEntityTypeReference= ruleEntityTypeReference EOF
            {
             newCompositeNode(grammarAccess.getEntityTypeReferenceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEntityTypeReference=ruleEntityTypeReference();

            state._fsp--;

             current =iv_ruleEntityTypeReference; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEntityTypeReference"


    // $ANTLR start "ruleEntityTypeReference"
    // InternalSocialRequest.g:483:1: ruleEntityTypeReference returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleEntityTypeReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalSocialRequest.g:489:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalSocialRequest.g:490:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalSocialRequest.g:490:2: ( (otherlv_0= RULE_ID ) )
            // InternalSocialRequest.g:491:3: (otherlv_0= RULE_ID )
            {
            // InternalSocialRequest.g:491:3: (otherlv_0= RULE_ID )
            // InternalSocialRequest.g:492:4: otherlv_0= RULE_ID
            {

            				if (current==null) {
            					current = createModelElement(grammarAccess.getEntityTypeReferenceRule());
            				}
            			
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(otherlv_0, grammarAccess.getEntityTypeReferenceAccess().getTypeEntityCrossReference_0());
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEntityTypeReference"


    // $ANTLR start "entryRuleDataTypeReference"
    // InternalSocialRequest.g:506:1: entryRuleDataTypeReference returns [EObject current=null] : iv_ruleDataTypeReference= ruleDataTypeReference EOF ;
    public final EObject entryRuleDataTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataTypeReference = null;


        try {
            // InternalSocialRequest.g:506:58: (iv_ruleDataTypeReference= ruleDataTypeReference EOF )
            // InternalSocialRequest.g:507:2: iv_ruleDataTypeReference= ruleDataTypeReference EOF
            {
             newCompositeNode(grammarAccess.getDataTypeReferenceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDataTypeReference=ruleDataTypeReference();

            state._fsp--;

             current =iv_ruleDataTypeReference; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDataTypeReference"


    // $ANTLR start "ruleDataTypeReference"
    // InternalSocialRequest.g:513:1: ruleDataTypeReference returns [EObject current=null] : ( (lv_type_0_0= ruleDataType ) ) ;
    public final EObject ruleDataTypeReference() throws RecognitionException {
        EObject current = null;

        Enumerator lv_type_0_0 = null;



        	enterRule();

        try {
            // InternalSocialRequest.g:519:2: ( ( (lv_type_0_0= ruleDataType ) ) )
            // InternalSocialRequest.g:520:2: ( (lv_type_0_0= ruleDataType ) )
            {
            // InternalSocialRequest.g:520:2: ( (lv_type_0_0= ruleDataType ) )
            // InternalSocialRequest.g:521:3: (lv_type_0_0= ruleDataType )
            {
            // InternalSocialRequest.g:521:3: (lv_type_0_0= ruleDataType )
            // InternalSocialRequest.g:522:4: lv_type_0_0= ruleDataType
            {

            				newCompositeNode(grammarAccess.getDataTypeReferenceAccess().getTypeDataTypeEnumRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_type_0_0=ruleDataType();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getDataTypeReferenceRule());
            				}
            				set(
            					current,
            					"type",
            					lv_type_0_0,
            					"org.xtext.example.mydsl.SocialRequest.DataType");
            				afterParserOrEnumRuleCall();
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDataTypeReference"


    // $ANTLR start "entryRuleModifier"
    // InternalSocialRequest.g:542:1: entryRuleModifier returns [EObject current=null] : iv_ruleModifier= ruleModifier EOF ;
    public final EObject entryRuleModifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModifier = null;


        try {
            // InternalSocialRequest.g:542:49: (iv_ruleModifier= ruleModifier EOF )
            // InternalSocialRequest.g:543:2: iv_ruleModifier= ruleModifier EOF
            {
             newCompositeNode(grammarAccess.getModifierRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModifier=ruleModifier();

            state._fsp--;

             current =iv_ruleModifier; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModifier"


    // $ANTLR start "ruleModifier"
    // InternalSocialRequest.g:549:1: ruleModifier returns [EObject current=null] : ( ( (lv_isLOB_0_0= 'LOB' ) ) | ( (lv_isTransient_1_0= 'TRANSIENT' ) ) | ( ( (lv_isID_2_0= 'ID' ) ) (otherlv_3= '(' ( (lv_IDGenerationType_4_0= ruleGenerationType ) ) otherlv_5= ')' )? ) ) ;
    public final EObject ruleModifier() throws RecognitionException {
        EObject current = null;

        Token lv_isLOB_0_0=null;
        Token lv_isTransient_1_0=null;
        Token lv_isID_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Enumerator lv_IDGenerationType_4_0 = null;



        	enterRule();

        try {
            // InternalSocialRequest.g:555:2: ( ( ( (lv_isLOB_0_0= 'LOB' ) ) | ( (lv_isTransient_1_0= 'TRANSIENT' ) ) | ( ( (lv_isID_2_0= 'ID' ) ) (otherlv_3= '(' ( (lv_IDGenerationType_4_0= ruleGenerationType ) ) otherlv_5= ')' )? ) ) )
            // InternalSocialRequest.g:556:2: ( ( (lv_isLOB_0_0= 'LOB' ) ) | ( (lv_isTransient_1_0= 'TRANSIENT' ) ) | ( ( (lv_isID_2_0= 'ID' ) ) (otherlv_3= '(' ( (lv_IDGenerationType_4_0= ruleGenerationType ) ) otherlv_5= ')' )? ) )
            {
            // InternalSocialRequest.g:556:2: ( ( (lv_isLOB_0_0= 'LOB' ) ) | ( (lv_isTransient_1_0= 'TRANSIENT' ) ) | ( ( (lv_isID_2_0= 'ID' ) ) (otherlv_3= '(' ( (lv_IDGenerationType_4_0= ruleGenerationType ) ) otherlv_5= ')' )? ) )
            int alt12=3;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt12=1;
                }
                break;
            case 23:
                {
                alt12=2;
                }
                break;
            case 24:
                {
                alt12=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalSocialRequest.g:557:3: ( (lv_isLOB_0_0= 'LOB' ) )
                    {
                    // InternalSocialRequest.g:557:3: ( (lv_isLOB_0_0= 'LOB' ) )
                    // InternalSocialRequest.g:558:4: (lv_isLOB_0_0= 'LOB' )
                    {
                    // InternalSocialRequest.g:558:4: (lv_isLOB_0_0= 'LOB' )
                    // InternalSocialRequest.g:559:5: lv_isLOB_0_0= 'LOB'
                    {
                    lv_isLOB_0_0=(Token)match(input,22,FOLLOW_2); 

                    					newLeafNode(lv_isLOB_0_0, grammarAccess.getModifierAccess().getIsLOBLOBKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getModifierRule());
                    					}
                    					setWithLastConsumed(current, "isLOB", true, "LOB");
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSocialRequest.g:572:3: ( (lv_isTransient_1_0= 'TRANSIENT' ) )
                    {
                    // InternalSocialRequest.g:572:3: ( (lv_isTransient_1_0= 'TRANSIENT' ) )
                    // InternalSocialRequest.g:573:4: (lv_isTransient_1_0= 'TRANSIENT' )
                    {
                    // InternalSocialRequest.g:573:4: (lv_isTransient_1_0= 'TRANSIENT' )
                    // InternalSocialRequest.g:574:5: lv_isTransient_1_0= 'TRANSIENT'
                    {
                    lv_isTransient_1_0=(Token)match(input,23,FOLLOW_2); 

                    					newLeafNode(lv_isTransient_1_0, grammarAccess.getModifierAccess().getIsTransientTRANSIENTKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getModifierRule());
                    					}
                    					setWithLastConsumed(current, "isTransient", true, "TRANSIENT");
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalSocialRequest.g:587:3: ( ( (lv_isID_2_0= 'ID' ) ) (otherlv_3= '(' ( (lv_IDGenerationType_4_0= ruleGenerationType ) ) otherlv_5= ')' )? )
                    {
                    // InternalSocialRequest.g:587:3: ( ( (lv_isID_2_0= 'ID' ) ) (otherlv_3= '(' ( (lv_IDGenerationType_4_0= ruleGenerationType ) ) otherlv_5= ')' )? )
                    // InternalSocialRequest.g:588:4: ( (lv_isID_2_0= 'ID' ) ) (otherlv_3= '(' ( (lv_IDGenerationType_4_0= ruleGenerationType ) ) otherlv_5= ')' )?
                    {
                    // InternalSocialRequest.g:588:4: ( (lv_isID_2_0= 'ID' ) )
                    // InternalSocialRequest.g:589:5: (lv_isID_2_0= 'ID' )
                    {
                    // InternalSocialRequest.g:589:5: (lv_isID_2_0= 'ID' )
                    // InternalSocialRequest.g:590:6: lv_isID_2_0= 'ID'
                    {
                    lv_isID_2_0=(Token)match(input,24,FOLLOW_19); 

                    						newLeafNode(lv_isID_2_0, grammarAccess.getModifierAccess().getIsIDIDKeyword_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getModifierRule());
                    						}
                    						setWithLastConsumed(current, "isID", true, "ID");
                    					

                    }


                    }

                    // InternalSocialRequest.g:602:4: (otherlv_3= '(' ( (lv_IDGenerationType_4_0= ruleGenerationType ) ) otherlv_5= ')' )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==25) ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // InternalSocialRequest.g:603:5: otherlv_3= '(' ( (lv_IDGenerationType_4_0= ruleGenerationType ) ) otherlv_5= ')'
                            {
                            otherlv_3=(Token)match(input,25,FOLLOW_20); 

                            					newLeafNode(otherlv_3, grammarAccess.getModifierAccess().getLeftParenthesisKeyword_2_1_0());
                            				
                            // InternalSocialRequest.g:607:5: ( (lv_IDGenerationType_4_0= ruleGenerationType ) )
                            // InternalSocialRequest.g:608:6: (lv_IDGenerationType_4_0= ruleGenerationType )
                            {
                            // InternalSocialRequest.g:608:6: (lv_IDGenerationType_4_0= ruleGenerationType )
                            // InternalSocialRequest.g:609:7: lv_IDGenerationType_4_0= ruleGenerationType
                            {

                            							newCompositeNode(grammarAccess.getModifierAccess().getIDGenerationTypeGenerationTypeEnumRuleCall_2_1_1_0());
                            						
                            pushFollow(FOLLOW_21);
                            lv_IDGenerationType_4_0=ruleGenerationType();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getModifierRule());
                            							}
                            							set(
                            								current,
                            								"IDGenerationType",
                            								lv_IDGenerationType_4_0,
                            								"org.xtext.example.mydsl.SocialRequest.GenerationType");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }

                            otherlv_5=(Token)match(input,26,FOLLOW_2); 

                            					newLeafNode(otherlv_5, grammarAccess.getModifierAccess().getRightParenthesisKeyword_2_1_2());
                            				

                            }
                            break;

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModifier"


    // $ANTLR start "entryRuleValidation"
    // InternalSocialRequest.g:636:1: entryRuleValidation returns [EObject current=null] : iv_ruleValidation= ruleValidation EOF ;
    public final EObject entryRuleValidation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValidation = null;


        try {
            // InternalSocialRequest.g:636:51: (iv_ruleValidation= ruleValidation EOF )
            // InternalSocialRequest.g:637:2: iv_ruleValidation= ruleValidation EOF
            {
             newCompositeNode(grammarAccess.getValidationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleValidation=ruleValidation();

            state._fsp--;

             current =iv_ruleValidation; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleValidation"


    // $ANTLR start "ruleValidation"
    // InternalSocialRequest.g:643:1: ruleValidation returns [EObject current=null] : ( (otherlv_0= 'min:' ( (lv_min_1_0= RULE_POSSIBLY_SIGNED_INT ) ) ) | (otherlv_2= 'max:' ( (lv_max_3_0= RULE_POSSIBLY_SIGNED_INT ) ) ) | (otherlv_4= 'pattern:' ( (lv_regex_5_0= RULE_STRING ) ) ) | ( (lv_validator_6_0= ruleBASICVALIDATION ) ) ) ;
    public final EObject ruleValidation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_min_1_0=null;
        Token otherlv_2=null;
        Token lv_max_3_0=null;
        Token otherlv_4=null;
        Token lv_regex_5_0=null;
        AntlrDatatypeRuleToken lv_validator_6_0 = null;



        	enterRule();

        try {
            // InternalSocialRequest.g:649:2: ( ( (otherlv_0= 'min:' ( (lv_min_1_0= RULE_POSSIBLY_SIGNED_INT ) ) ) | (otherlv_2= 'max:' ( (lv_max_3_0= RULE_POSSIBLY_SIGNED_INT ) ) ) | (otherlv_4= 'pattern:' ( (lv_regex_5_0= RULE_STRING ) ) ) | ( (lv_validator_6_0= ruleBASICVALIDATION ) ) ) )
            // InternalSocialRequest.g:650:2: ( (otherlv_0= 'min:' ( (lv_min_1_0= RULE_POSSIBLY_SIGNED_INT ) ) ) | (otherlv_2= 'max:' ( (lv_max_3_0= RULE_POSSIBLY_SIGNED_INT ) ) ) | (otherlv_4= 'pattern:' ( (lv_regex_5_0= RULE_STRING ) ) ) | ( (lv_validator_6_0= ruleBASICVALIDATION ) ) )
            {
            // InternalSocialRequest.g:650:2: ( (otherlv_0= 'min:' ( (lv_min_1_0= RULE_POSSIBLY_SIGNED_INT ) ) ) | (otherlv_2= 'max:' ( (lv_max_3_0= RULE_POSSIBLY_SIGNED_INT ) ) ) | (otherlv_4= 'pattern:' ( (lv_regex_5_0= RULE_STRING ) ) ) | ( (lv_validator_6_0= ruleBASICVALIDATION ) ) )
            int alt13=4;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt13=1;
                }
                break;
            case 28:
                {
                alt13=2;
                }
                break;
            case 29:
                {
                alt13=3;
                }
                break;
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
                {
                alt13=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // InternalSocialRequest.g:651:3: (otherlv_0= 'min:' ( (lv_min_1_0= RULE_POSSIBLY_SIGNED_INT ) ) )
                    {
                    // InternalSocialRequest.g:651:3: (otherlv_0= 'min:' ( (lv_min_1_0= RULE_POSSIBLY_SIGNED_INT ) ) )
                    // InternalSocialRequest.g:652:4: otherlv_0= 'min:' ( (lv_min_1_0= RULE_POSSIBLY_SIGNED_INT ) )
                    {
                    otherlv_0=(Token)match(input,27,FOLLOW_22); 

                    				newLeafNode(otherlv_0, grammarAccess.getValidationAccess().getMinKeyword_0_0());
                    			
                    // InternalSocialRequest.g:656:4: ( (lv_min_1_0= RULE_POSSIBLY_SIGNED_INT ) )
                    // InternalSocialRequest.g:657:5: (lv_min_1_0= RULE_POSSIBLY_SIGNED_INT )
                    {
                    // InternalSocialRequest.g:657:5: (lv_min_1_0= RULE_POSSIBLY_SIGNED_INT )
                    // InternalSocialRequest.g:658:6: lv_min_1_0= RULE_POSSIBLY_SIGNED_INT
                    {
                    lv_min_1_0=(Token)match(input,RULE_POSSIBLY_SIGNED_INT,FOLLOW_2); 

                    						newLeafNode(lv_min_1_0, grammarAccess.getValidationAccess().getMinPOSSIBLY_SIGNED_INTTerminalRuleCall_0_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getValidationRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"min",
                    							lv_min_1_0,
                    							"org.xtext.example.mydsl.SocialRequest.POSSIBLY_SIGNED_INT");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSocialRequest.g:676:3: (otherlv_2= 'max:' ( (lv_max_3_0= RULE_POSSIBLY_SIGNED_INT ) ) )
                    {
                    // InternalSocialRequest.g:676:3: (otherlv_2= 'max:' ( (lv_max_3_0= RULE_POSSIBLY_SIGNED_INT ) ) )
                    // InternalSocialRequest.g:677:4: otherlv_2= 'max:' ( (lv_max_3_0= RULE_POSSIBLY_SIGNED_INT ) )
                    {
                    otherlv_2=(Token)match(input,28,FOLLOW_22); 

                    				newLeafNode(otherlv_2, grammarAccess.getValidationAccess().getMaxKeyword_1_0());
                    			
                    // InternalSocialRequest.g:681:4: ( (lv_max_3_0= RULE_POSSIBLY_SIGNED_INT ) )
                    // InternalSocialRequest.g:682:5: (lv_max_3_0= RULE_POSSIBLY_SIGNED_INT )
                    {
                    // InternalSocialRequest.g:682:5: (lv_max_3_0= RULE_POSSIBLY_SIGNED_INT )
                    // InternalSocialRequest.g:683:6: lv_max_3_0= RULE_POSSIBLY_SIGNED_INT
                    {
                    lv_max_3_0=(Token)match(input,RULE_POSSIBLY_SIGNED_INT,FOLLOW_2); 

                    						newLeafNode(lv_max_3_0, grammarAccess.getValidationAccess().getMaxPOSSIBLY_SIGNED_INTTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getValidationRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"max",
                    							lv_max_3_0,
                    							"org.xtext.example.mydsl.SocialRequest.POSSIBLY_SIGNED_INT");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalSocialRequest.g:701:3: (otherlv_4= 'pattern:' ( (lv_regex_5_0= RULE_STRING ) ) )
                    {
                    // InternalSocialRequest.g:701:3: (otherlv_4= 'pattern:' ( (lv_regex_5_0= RULE_STRING ) ) )
                    // InternalSocialRequest.g:702:4: otherlv_4= 'pattern:' ( (lv_regex_5_0= RULE_STRING ) )
                    {
                    otherlv_4=(Token)match(input,29,FOLLOW_23); 

                    				newLeafNode(otherlv_4, grammarAccess.getValidationAccess().getPatternKeyword_2_0());
                    			
                    // InternalSocialRequest.g:706:4: ( (lv_regex_5_0= RULE_STRING ) )
                    // InternalSocialRequest.g:707:5: (lv_regex_5_0= RULE_STRING )
                    {
                    // InternalSocialRequest.g:707:5: (lv_regex_5_0= RULE_STRING )
                    // InternalSocialRequest.g:708:6: lv_regex_5_0= RULE_STRING
                    {
                    lv_regex_5_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    						newLeafNode(lv_regex_5_0, grammarAccess.getValidationAccess().getRegexSTRINGTerminalRuleCall_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getValidationRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"regex",
                    							lv_regex_5_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalSocialRequest.g:726:3: ( (lv_validator_6_0= ruleBASICVALIDATION ) )
                    {
                    // InternalSocialRequest.g:726:3: ( (lv_validator_6_0= ruleBASICVALIDATION ) )
                    // InternalSocialRequest.g:727:4: (lv_validator_6_0= ruleBASICVALIDATION )
                    {
                    // InternalSocialRequest.g:727:4: (lv_validator_6_0= ruleBASICVALIDATION )
                    // InternalSocialRequest.g:728:5: lv_validator_6_0= ruleBASICVALIDATION
                    {

                    					newCompositeNode(grammarAccess.getValidationAccess().getValidatorBASICVALIDATIONParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_validator_6_0=ruleBASICVALIDATION();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getValidationRule());
                    					}
                    					set(
                    						current,
                    						"validator",
                    						lv_validator_6_0,
                    						"org.xtext.example.mydsl.SocialRequest.BASICVALIDATION");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleValidation"


    // $ANTLR start "entryRuleBASICVALIDATION"
    // InternalSocialRequest.g:749:1: entryRuleBASICVALIDATION returns [String current=null] : iv_ruleBASICVALIDATION= ruleBASICVALIDATION EOF ;
    public final String entryRuleBASICVALIDATION() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBASICVALIDATION = null;


        try {
            // InternalSocialRequest.g:749:55: (iv_ruleBASICVALIDATION= ruleBASICVALIDATION EOF )
            // InternalSocialRequest.g:750:2: iv_ruleBASICVALIDATION= ruleBASICVALIDATION EOF
            {
             newCompositeNode(grammarAccess.getBASICVALIDATIONRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBASICVALIDATION=ruleBASICVALIDATION();

            state._fsp--;

             current =iv_ruleBASICVALIDATION.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBASICVALIDATION"


    // $ANTLR start "ruleBASICVALIDATION"
    // InternalSocialRequest.g:756:1: ruleBASICVALIDATION returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'NotNull' | kw= 'NotBlank' | kw= 'Past' | kw= 'Unique' | kw= 'Email' ) ;
    public final AntlrDatatypeRuleToken ruleBASICVALIDATION() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalSocialRequest.g:762:2: ( (kw= 'NotNull' | kw= 'NotBlank' | kw= 'Past' | kw= 'Unique' | kw= 'Email' ) )
            // InternalSocialRequest.g:763:2: (kw= 'NotNull' | kw= 'NotBlank' | kw= 'Past' | kw= 'Unique' | kw= 'Email' )
            {
            // InternalSocialRequest.g:763:2: (kw= 'NotNull' | kw= 'NotBlank' | kw= 'Past' | kw= 'Unique' | kw= 'Email' )
            int alt14=5;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt14=1;
                }
                break;
            case 31:
                {
                alt14=2;
                }
                break;
            case 32:
                {
                alt14=3;
                }
                break;
            case 33:
                {
                alt14=4;
                }
                break;
            case 34:
                {
                alt14=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // InternalSocialRequest.g:764:3: kw= 'NotNull'
                    {
                    kw=(Token)match(input,30,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBASICVALIDATIONAccess().getNotNullKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalSocialRequest.g:770:3: kw= 'NotBlank'
                    {
                    kw=(Token)match(input,31,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBASICVALIDATIONAccess().getNotBlankKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalSocialRequest.g:776:3: kw= 'Past'
                    {
                    kw=(Token)match(input,32,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBASICVALIDATIONAccess().getPastKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalSocialRequest.g:782:3: kw= 'Unique'
                    {
                    kw=(Token)match(input,33,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBASICVALIDATIONAccess().getUniqueKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalSocialRequest.g:788:3: kw= 'Email'
                    {
                    kw=(Token)match(input,34,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBASICVALIDATIONAccess().getEmailKeyword_4());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBASICVALIDATION"


    // $ANTLR start "entryRuleASSOCIATION"
    // InternalSocialRequest.g:797:1: entryRuleASSOCIATION returns [String current=null] : iv_ruleASSOCIATION= ruleASSOCIATION EOF ;
    public final String entryRuleASSOCIATION() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleASSOCIATION = null;


        try {
            // InternalSocialRequest.g:797:51: (iv_ruleASSOCIATION= ruleASSOCIATION EOF )
            // InternalSocialRequest.g:798:2: iv_ruleASSOCIATION= ruleASSOCIATION EOF
            {
             newCompositeNode(grammarAccess.getASSOCIATIONRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleASSOCIATION=ruleASSOCIATION();

            state._fsp--;

             current =iv_ruleASSOCIATION.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleASSOCIATION"


    // $ANTLR start "ruleASSOCIATION"
    // InternalSocialRequest.g:804:1: ruleASSOCIATION returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'OneToMany' | kw= 'ManyToOne' | kw= 'OneToOne' | kw= 'ManyToMany' ) ;
    public final AntlrDatatypeRuleToken ruleASSOCIATION() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalSocialRequest.g:810:2: ( (kw= 'OneToMany' | kw= 'ManyToOne' | kw= 'OneToOne' | kw= 'ManyToMany' ) )
            // InternalSocialRequest.g:811:2: (kw= 'OneToMany' | kw= 'ManyToOne' | kw= 'OneToOne' | kw= 'ManyToMany' )
            {
            // InternalSocialRequest.g:811:2: (kw= 'OneToMany' | kw= 'ManyToOne' | kw= 'OneToOne' | kw= 'ManyToMany' )
            int alt15=4;
            switch ( input.LA(1) ) {
            case 35:
                {
                alt15=1;
                }
                break;
            case 36:
                {
                alt15=2;
                }
                break;
            case 37:
                {
                alt15=3;
                }
                break;
            case 38:
                {
                alt15=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // InternalSocialRequest.g:812:3: kw= 'OneToMany'
                    {
                    kw=(Token)match(input,35,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getASSOCIATIONAccess().getOneToManyKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalSocialRequest.g:818:3: kw= 'ManyToOne'
                    {
                    kw=(Token)match(input,36,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getASSOCIATIONAccess().getManyToOneKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalSocialRequest.g:824:3: kw= 'OneToOne'
                    {
                    kw=(Token)match(input,37,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getASSOCIATIONAccess().getOneToOneKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalSocialRequest.g:830:3: kw= 'ManyToMany'
                    {
                    kw=(Token)match(input,38,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getASSOCIATIONAccess().getManyToManyKeyword_3());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleASSOCIATION"


    // $ANTLR start "entryRuleRepository"
    // InternalSocialRequest.g:839:1: entryRuleRepository returns [EObject current=null] : iv_ruleRepository= ruleRepository EOF ;
    public final EObject entryRuleRepository() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRepository = null;


        try {
            // InternalSocialRequest.g:839:51: (iv_ruleRepository= ruleRepository EOF )
            // InternalSocialRequest.g:840:2: iv_ruleRepository= ruleRepository EOF
            {
             newCompositeNode(grammarAccess.getRepositoryRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRepository=ruleRepository();

            state._fsp--;

             current =iv_ruleRepository; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRepository"


    // $ANTLR start "ruleRepository"
    // InternalSocialRequest.g:846:1: ruleRepository returns [EObject current=null] : (otherlv_0= 'Repository' ( (otherlv_1= RULE_ID ) ) otherlv_2= '{' ( (lv_queries_3_0= ruleQuery ) )+ otherlv_4= '}' ) ;
    public final EObject ruleRepository() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_queries_3_0 = null;



        	enterRule();

        try {
            // InternalSocialRequest.g:852:2: ( (otherlv_0= 'Repository' ( (otherlv_1= RULE_ID ) ) otherlv_2= '{' ( (lv_queries_3_0= ruleQuery ) )+ otherlv_4= '}' ) )
            // InternalSocialRequest.g:853:2: (otherlv_0= 'Repository' ( (otherlv_1= RULE_ID ) ) otherlv_2= '{' ( (lv_queries_3_0= ruleQuery ) )+ otherlv_4= '}' )
            {
            // InternalSocialRequest.g:853:2: (otherlv_0= 'Repository' ( (otherlv_1= RULE_ID ) ) otherlv_2= '{' ( (lv_queries_3_0= ruleQuery ) )+ otherlv_4= '}' )
            // InternalSocialRequest.g:854:3: otherlv_0= 'Repository' ( (otherlv_1= RULE_ID ) ) otherlv_2= '{' ( (lv_queries_3_0= ruleQuery ) )+ otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,39,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getRepositoryAccess().getRepositoryKeyword_0());
            		
            // InternalSocialRequest.g:858:3: ( (otherlv_1= RULE_ID ) )
            // InternalSocialRequest.g:859:4: (otherlv_1= RULE_ID )
            {
            // InternalSocialRequest.g:859:4: (otherlv_1= RULE_ID )
            // InternalSocialRequest.g:860:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRepositoryRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(otherlv_1, grammarAccess.getRepositoryAccess().getEntityEntityCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_24); 

            			newLeafNode(otherlv_2, grammarAccess.getRepositoryAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalSocialRequest.g:875:3: ( (lv_queries_3_0= ruleQuery ) )+
            int cnt16=0;
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==40) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalSocialRequest.g:876:4: (lv_queries_3_0= ruleQuery )
            	    {
            	    // InternalSocialRequest.g:876:4: (lv_queries_3_0= ruleQuery )
            	    // InternalSocialRequest.g:877:5: lv_queries_3_0= ruleQuery
            	    {

            	    					newCompositeNode(grammarAccess.getRepositoryAccess().getQueriesQueryParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_25);
            	    lv_queries_3_0=ruleQuery();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getRepositoryRule());
            	    					}
            	    					add(
            	    						current,
            	    						"queries",
            	    						lv_queries_3_0,
            	    						"org.xtext.example.mydsl.SocialRequest.Query");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


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

            otherlv_4=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getRepositoryAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRepository"


    // $ANTLR start "entryRuleQuery"
    // InternalSocialRequest.g:902:1: entryRuleQuery returns [EObject current=null] : iv_ruleQuery= ruleQuery EOF ;
    public final EObject entryRuleQuery() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuery = null;


        try {
            // InternalSocialRequest.g:902:46: (iv_ruleQuery= ruleQuery EOF )
            // InternalSocialRequest.g:903:2: iv_ruleQuery= ruleQuery EOF
            {
             newCompositeNode(grammarAccess.getQueryRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQuery=ruleQuery();

            state._fsp--;

             current =iv_ruleQuery; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQuery"


    // $ANTLR start "ruleQuery"
    // InternalSocialRequest.g:909:1: ruleQuery returns [EObject current=null] : (otherlv_0= 'query' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_isList_2_0= ':' ) ) otherlv_3= 'list' )? (otherlv_4= '{' (otherlv_5= 'params' otherlv_6= '{' ( (lv_params_7_0= ruleParam ) )* otherlv_8= '}' )? ( (lv_sqlQuery_9_0= ruleSQLQuery ) )? otherlv_10= '}' ) ) ;
    public final EObject ruleQuery() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_isList_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        EObject lv_params_7_0 = null;

        EObject lv_sqlQuery_9_0 = null;



        	enterRule();

        try {
            // InternalSocialRequest.g:915:2: ( (otherlv_0= 'query' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_isList_2_0= ':' ) ) otherlv_3= 'list' )? (otherlv_4= '{' (otherlv_5= 'params' otherlv_6= '{' ( (lv_params_7_0= ruleParam ) )* otherlv_8= '}' )? ( (lv_sqlQuery_9_0= ruleSQLQuery ) )? otherlv_10= '}' ) ) )
            // InternalSocialRequest.g:916:2: (otherlv_0= 'query' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_isList_2_0= ':' ) ) otherlv_3= 'list' )? (otherlv_4= '{' (otherlv_5= 'params' otherlv_6= '{' ( (lv_params_7_0= ruleParam ) )* otherlv_8= '}' )? ( (lv_sqlQuery_9_0= ruleSQLQuery ) )? otherlv_10= '}' ) )
            {
            // InternalSocialRequest.g:916:2: (otherlv_0= 'query' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_isList_2_0= ':' ) ) otherlv_3= 'list' )? (otherlv_4= '{' (otherlv_5= 'params' otherlv_6= '{' ( (lv_params_7_0= ruleParam ) )* otherlv_8= '}' )? ( (lv_sqlQuery_9_0= ruleSQLQuery ) )? otherlv_10= '}' ) )
            // InternalSocialRequest.g:917:3: otherlv_0= 'query' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_isList_2_0= ':' ) ) otherlv_3= 'list' )? (otherlv_4= '{' (otherlv_5= 'params' otherlv_6= '{' ( (lv_params_7_0= ruleParam ) )* otherlv_8= '}' )? ( (lv_sqlQuery_9_0= ruleSQLQuery ) )? otherlv_10= '}' )
            {
            otherlv_0=(Token)match(input,40,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getQueryAccess().getQueryKeyword_0());
            		
            // InternalSocialRequest.g:921:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSocialRequest.g:922:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSocialRequest.g:922:4: (lv_name_1_0= RULE_ID )
            // InternalSocialRequest.g:923:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_26); 

            					newLeafNode(lv_name_1_0, grammarAccess.getQueryAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getQueryRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalSocialRequest.g:939:3: ( ( (lv_isList_2_0= ':' ) ) otherlv_3= 'list' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==18) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalSocialRequest.g:940:4: ( (lv_isList_2_0= ':' ) ) otherlv_3= 'list'
                    {
                    // InternalSocialRequest.g:940:4: ( (lv_isList_2_0= ':' ) )
                    // InternalSocialRequest.g:941:5: (lv_isList_2_0= ':' )
                    {
                    // InternalSocialRequest.g:941:5: (lv_isList_2_0= ':' )
                    // InternalSocialRequest.g:942:6: lv_isList_2_0= ':'
                    {
                    lv_isList_2_0=(Token)match(input,18,FOLLOW_27); 

                    						newLeafNode(lv_isList_2_0, grammarAccess.getQueryAccess().getIsListColonKeyword_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getQueryRule());
                    						}
                    						setWithLastConsumed(current, "isList", true, ":");
                    					

                    }


                    }

                    otherlv_3=(Token)match(input,41,FOLLOW_8); 

                    				newLeafNode(otherlv_3, grammarAccess.getQueryAccess().getListKeyword_2_1());
                    			

                    }
                    break;

            }

            // InternalSocialRequest.g:959:3: (otherlv_4= '{' (otherlv_5= 'params' otherlv_6= '{' ( (lv_params_7_0= ruleParam ) )* otherlv_8= '}' )? ( (lv_sqlQuery_9_0= ruleSQLQuery ) )? otherlv_10= '}' )
            // InternalSocialRequest.g:960:4: otherlv_4= '{' (otherlv_5= 'params' otherlv_6= '{' ( (lv_params_7_0= ruleParam ) )* otherlv_8= '}' )? ( (lv_sqlQuery_9_0= ruleSQLQuery ) )? otherlv_10= '}'
            {
            otherlv_4=(Token)match(input,16,FOLLOW_28); 

            				newLeafNode(otherlv_4, grammarAccess.getQueryAccess().getLeftCurlyBracketKeyword_3_0());
            			
            // InternalSocialRequest.g:964:4: (otherlv_5= 'params' otherlv_6= '{' ( (lv_params_7_0= ruleParam ) )* otherlv_8= '}' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==42) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalSocialRequest.g:965:5: otherlv_5= 'params' otherlv_6= '{' ( (lv_params_7_0= ruleParam ) )* otherlv_8= '}'
                    {
                    otherlv_5=(Token)match(input,42,FOLLOW_8); 

                    					newLeafNode(otherlv_5, grammarAccess.getQueryAccess().getParamsKeyword_3_1_0());
                    				
                    otherlv_6=(Token)match(input,16,FOLLOW_29); 

                    					newLeafNode(otherlv_6, grammarAccess.getQueryAccess().getLeftCurlyBracketKeyword_3_1_1());
                    				
                    // InternalSocialRequest.g:973:5: ( (lv_params_7_0= ruleParam ) )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==RULE_ID) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // InternalSocialRequest.g:974:6: (lv_params_7_0= ruleParam )
                    	    {
                    	    // InternalSocialRequest.g:974:6: (lv_params_7_0= ruleParam )
                    	    // InternalSocialRequest.g:975:7: lv_params_7_0= ruleParam
                    	    {

                    	    							newCompositeNode(grammarAccess.getQueryAccess().getParamsParamParserRuleCall_3_1_2_0());
                    	    						
                    	    pushFollow(FOLLOW_29);
                    	    lv_params_7_0=ruleParam();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getQueryRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"params",
                    	    								lv_params_7_0,
                    	    								"org.xtext.example.mydsl.SocialRequest.Param");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop18;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,17,FOLLOW_30); 

                    					newLeafNode(otherlv_8, grammarAccess.getQueryAccess().getRightCurlyBracketKeyword_3_1_3());
                    				

                    }
                    break;

            }

            // InternalSocialRequest.g:997:4: ( (lv_sqlQuery_9_0= ruleSQLQuery ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==43) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalSocialRequest.g:998:5: (lv_sqlQuery_9_0= ruleSQLQuery )
                    {
                    // InternalSocialRequest.g:998:5: (lv_sqlQuery_9_0= ruleSQLQuery )
                    // InternalSocialRequest.g:999:6: lv_sqlQuery_9_0= ruleSQLQuery
                    {

                    						newCompositeNode(grammarAccess.getQueryAccess().getSqlQuerySQLQueryParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_31);
                    lv_sqlQuery_9_0=ruleSQLQuery();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getQueryRule());
                    						}
                    						set(
                    							current,
                    							"sqlQuery",
                    							lv_sqlQuery_9_0,
                    							"org.xtext.example.mydsl.SocialRequest.SQLQuery");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,17,FOLLOW_2); 

            				newLeafNode(otherlv_10, grammarAccess.getQueryAccess().getRightCurlyBracketKeyword_3_3());
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQuery"


    // $ANTLR start "entryRuleParam"
    // InternalSocialRequest.g:1025:1: entryRuleParam returns [EObject current=null] : iv_ruleParam= ruleParam EOF ;
    public final EObject entryRuleParam() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParam = null;


        try {
            // InternalSocialRequest.g:1025:46: (iv_ruleParam= ruleParam EOF )
            // InternalSocialRequest.g:1026:2: iv_ruleParam= ruleParam EOF
            {
             newCompositeNode(grammarAccess.getParamRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParam=ruleParam();

            state._fsp--;

             current =iv_ruleParam; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParam"


    // $ANTLR start "ruleParam"
    // InternalSocialRequest.g:1032:1: ruleParam returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleTypeReference ) ) ) ;
    public final EObject ruleParam() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_type_2_0 = null;



        	enterRule();

        try {
            // InternalSocialRequest.g:1038:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleTypeReference ) ) ) )
            // InternalSocialRequest.g:1039:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleTypeReference ) ) )
            {
            // InternalSocialRequest.g:1039:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleTypeReference ) ) )
            // InternalSocialRequest.g:1040:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleTypeReference ) )
            {
            // InternalSocialRequest.g:1040:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalSocialRequest.g:1041:4: (lv_name_0_0= RULE_ID )
            {
            // InternalSocialRequest.g:1041:4: (lv_name_0_0= RULE_ID )
            // InternalSocialRequest.g:1042:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(lv_name_0_0, grammarAccess.getParamAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getParamRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,18,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getParamAccess().getColonKeyword_1());
            		
            // InternalSocialRequest.g:1062:3: ( (lv_type_2_0= ruleTypeReference ) )
            // InternalSocialRequest.g:1063:4: (lv_type_2_0= ruleTypeReference )
            {
            // InternalSocialRequest.g:1063:4: (lv_type_2_0= ruleTypeReference )
            // InternalSocialRequest.g:1064:5: lv_type_2_0= ruleTypeReference
            {

            					newCompositeNode(grammarAccess.getParamAccess().getTypeTypeReferenceParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_type_2_0=ruleTypeReference();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParamRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_2_0,
            						"org.xtext.example.mydsl.SocialRequest.TypeReference");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParam"


    // $ANTLR start "entryRuleSQLQuery"
    // InternalSocialRequest.g:1085:1: entryRuleSQLQuery returns [EObject current=null] : iv_ruleSQLQuery= ruleSQLQuery EOF ;
    public final EObject entryRuleSQLQuery() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSQLQuery = null;


        try {
            // InternalSocialRequest.g:1085:49: (iv_ruleSQLQuery= ruleSQLQuery EOF )
            // InternalSocialRequest.g:1086:2: iv_ruleSQLQuery= ruleSQLQuery EOF
            {
             newCompositeNode(grammarAccess.getSQLQueryRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSQLQuery=ruleSQLQuery();

            state._fsp--;

             current =iv_ruleSQLQuery; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSQLQuery"


    // $ANTLR start "ruleSQLQuery"
    // InternalSocialRequest.g:1092:1: ruleSQLQuery returns [EObject current=null] : ( ( (lv_select_0_0= ruleSelect ) ) ( (lv_from_1_0= ruleFrom ) ) ( (lv_joins_2_0= ruleJoin ) )* ( (lv_where_3_0= ruleWhere ) )? ( (lv_order_4_0= ruleOrder ) )? ) ;
    public final EObject ruleSQLQuery() throws RecognitionException {
        EObject current = null;

        EObject lv_select_0_0 = null;

        EObject lv_from_1_0 = null;

        EObject lv_joins_2_0 = null;

        EObject lv_where_3_0 = null;

        EObject lv_order_4_0 = null;



        	enterRule();

        try {
            // InternalSocialRequest.g:1098:2: ( ( ( (lv_select_0_0= ruleSelect ) ) ( (lv_from_1_0= ruleFrom ) ) ( (lv_joins_2_0= ruleJoin ) )* ( (lv_where_3_0= ruleWhere ) )? ( (lv_order_4_0= ruleOrder ) )? ) )
            // InternalSocialRequest.g:1099:2: ( ( (lv_select_0_0= ruleSelect ) ) ( (lv_from_1_0= ruleFrom ) ) ( (lv_joins_2_0= ruleJoin ) )* ( (lv_where_3_0= ruleWhere ) )? ( (lv_order_4_0= ruleOrder ) )? )
            {
            // InternalSocialRequest.g:1099:2: ( ( (lv_select_0_0= ruleSelect ) ) ( (lv_from_1_0= ruleFrom ) ) ( (lv_joins_2_0= ruleJoin ) )* ( (lv_where_3_0= ruleWhere ) )? ( (lv_order_4_0= ruleOrder ) )? )
            // InternalSocialRequest.g:1100:3: ( (lv_select_0_0= ruleSelect ) ) ( (lv_from_1_0= ruleFrom ) ) ( (lv_joins_2_0= ruleJoin ) )* ( (lv_where_3_0= ruleWhere ) )? ( (lv_order_4_0= ruleOrder ) )?
            {
            // InternalSocialRequest.g:1100:3: ( (lv_select_0_0= ruleSelect ) )
            // InternalSocialRequest.g:1101:4: (lv_select_0_0= ruleSelect )
            {
            // InternalSocialRequest.g:1101:4: (lv_select_0_0= ruleSelect )
            // InternalSocialRequest.g:1102:5: lv_select_0_0= ruleSelect
            {

            					newCompositeNode(grammarAccess.getSQLQueryAccess().getSelectSelectParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_32);
            lv_select_0_0=ruleSelect();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSQLQueryRule());
            					}
            					set(
            						current,
            						"select",
            						lv_select_0_0,
            						"org.xtext.example.mydsl.SocialRequest.Select");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSocialRequest.g:1119:3: ( (lv_from_1_0= ruleFrom ) )
            // InternalSocialRequest.g:1120:4: (lv_from_1_0= ruleFrom )
            {
            // InternalSocialRequest.g:1120:4: (lv_from_1_0= ruleFrom )
            // InternalSocialRequest.g:1121:5: lv_from_1_0= ruleFrom
            {

            					newCompositeNode(grammarAccess.getSQLQueryAccess().getFromFromParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_33);
            lv_from_1_0=ruleFrom();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSQLQueryRule());
            					}
            					set(
            						current,
            						"from",
            						lv_from_1_0,
            						"org.xtext.example.mydsl.SocialRequest.From");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSocialRequest.g:1138:3: ( (lv_joins_2_0= ruleJoin ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>=61 && LA21_0<=64)) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalSocialRequest.g:1139:4: (lv_joins_2_0= ruleJoin )
            	    {
            	    // InternalSocialRequest.g:1139:4: (lv_joins_2_0= ruleJoin )
            	    // InternalSocialRequest.g:1140:5: lv_joins_2_0= ruleJoin
            	    {

            	    					newCompositeNode(grammarAccess.getSQLQueryAccess().getJoinsJoinParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_33);
            	    lv_joins_2_0=ruleJoin();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSQLQueryRule());
            	    					}
            	    					add(
            	    						current,
            	    						"joins",
            	    						lv_joins_2_0,
            	    						"org.xtext.example.mydsl.SocialRequest.Join");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            // InternalSocialRequest.g:1157:3: ( (lv_where_3_0= ruleWhere ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==47) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalSocialRequest.g:1158:4: (lv_where_3_0= ruleWhere )
                    {
                    // InternalSocialRequest.g:1158:4: (lv_where_3_0= ruleWhere )
                    // InternalSocialRequest.g:1159:5: lv_where_3_0= ruleWhere
                    {

                    					newCompositeNode(grammarAccess.getSQLQueryAccess().getWhereWhereParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_34);
                    lv_where_3_0=ruleWhere();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getSQLQueryRule());
                    					}
                    					set(
                    						current,
                    						"where",
                    						lv_where_3_0,
                    						"org.xtext.example.mydsl.SocialRequest.Where");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalSocialRequest.g:1176:3: ( (lv_order_4_0= ruleOrder ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==48) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalSocialRequest.g:1177:4: (lv_order_4_0= ruleOrder )
                    {
                    // InternalSocialRequest.g:1177:4: (lv_order_4_0= ruleOrder )
                    // InternalSocialRequest.g:1178:5: lv_order_4_0= ruleOrder
                    {

                    					newCompositeNode(grammarAccess.getSQLQueryAccess().getOrderOrderParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_order_4_0=ruleOrder();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getSQLQueryRule());
                    					}
                    					set(
                    						current,
                    						"order",
                    						lv_order_4_0,
                    						"org.xtext.example.mydsl.SocialRequest.Order");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSQLQuery"


    // $ANTLR start "entryRuleSelect"
    // InternalSocialRequest.g:1199:1: entryRuleSelect returns [EObject current=null] : iv_ruleSelect= ruleSelect EOF ;
    public final EObject entryRuleSelect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelect = null;


        try {
            // InternalSocialRequest.g:1199:47: (iv_ruleSelect= ruleSelect EOF )
            // InternalSocialRequest.g:1200:2: iv_ruleSelect= ruleSelect EOF
            {
             newCompositeNode(grammarAccess.getSelectRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSelect=ruleSelect();

            state._fsp--;

             current =iv_ruleSelect; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSelect"


    // $ANTLR start "ruleSelect"
    // InternalSocialRequest.g:1206:1: ruleSelect returns [EObject current=null] : (otherlv_0= 'SELECT' ( (lv_isDistinct_1_0= 'DISTINCT' ) )? otherlv_2= '{' ( (lv_clause_3_0= RULE_STRING ) ) otherlv_4= '}' ) ;
    public final EObject ruleSelect() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_isDistinct_1_0=null;
        Token otherlv_2=null;
        Token lv_clause_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalSocialRequest.g:1212:2: ( (otherlv_0= 'SELECT' ( (lv_isDistinct_1_0= 'DISTINCT' ) )? otherlv_2= '{' ( (lv_clause_3_0= RULE_STRING ) ) otherlv_4= '}' ) )
            // InternalSocialRequest.g:1213:2: (otherlv_0= 'SELECT' ( (lv_isDistinct_1_0= 'DISTINCT' ) )? otherlv_2= '{' ( (lv_clause_3_0= RULE_STRING ) ) otherlv_4= '}' )
            {
            // InternalSocialRequest.g:1213:2: (otherlv_0= 'SELECT' ( (lv_isDistinct_1_0= 'DISTINCT' ) )? otherlv_2= '{' ( (lv_clause_3_0= RULE_STRING ) ) otherlv_4= '}' )
            // InternalSocialRequest.g:1214:3: otherlv_0= 'SELECT' ( (lv_isDistinct_1_0= 'DISTINCT' ) )? otherlv_2= '{' ( (lv_clause_3_0= RULE_STRING ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,43,FOLLOW_35); 

            			newLeafNode(otherlv_0, grammarAccess.getSelectAccess().getSELECTKeyword_0());
            		
            // InternalSocialRequest.g:1218:3: ( (lv_isDistinct_1_0= 'DISTINCT' ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==44) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalSocialRequest.g:1219:4: (lv_isDistinct_1_0= 'DISTINCT' )
                    {
                    // InternalSocialRequest.g:1219:4: (lv_isDistinct_1_0= 'DISTINCT' )
                    // InternalSocialRequest.g:1220:5: lv_isDistinct_1_0= 'DISTINCT'
                    {
                    lv_isDistinct_1_0=(Token)match(input,44,FOLLOW_8); 

                    					newLeafNode(lv_isDistinct_1_0, grammarAccess.getSelectAccess().getIsDistinctDISTINCTKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getSelectRule());
                    					}
                    					setWithLastConsumed(current, "isDistinct", true, "DISTINCT");
                    				

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,16,FOLLOW_23); 

            			newLeafNode(otherlv_2, grammarAccess.getSelectAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalSocialRequest.g:1236:3: ( (lv_clause_3_0= RULE_STRING ) )
            // InternalSocialRequest.g:1237:4: (lv_clause_3_0= RULE_STRING )
            {
            // InternalSocialRequest.g:1237:4: (lv_clause_3_0= RULE_STRING )
            // InternalSocialRequest.g:1238:5: lv_clause_3_0= RULE_STRING
            {
            lv_clause_3_0=(Token)match(input,RULE_STRING,FOLLOW_31); 

            					newLeafNode(lv_clause_3_0, grammarAccess.getSelectAccess().getClauseSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSelectRule());
            					}
            					setWithLastConsumed(
            						current,
            						"clause",
            						lv_clause_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_4=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getSelectAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSelect"


    // $ANTLR start "entryRuleFrom"
    // InternalSocialRequest.g:1262:1: entryRuleFrom returns [EObject current=null] : iv_ruleFrom= ruleFrom EOF ;
    public final EObject entryRuleFrom() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFrom = null;


        try {
            // InternalSocialRequest.g:1262:45: (iv_ruleFrom= ruleFrom EOF )
            // InternalSocialRequest.g:1263:2: iv_ruleFrom= ruleFrom EOF
            {
             newCompositeNode(grammarAccess.getFromRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFrom=ruleFrom();

            state._fsp--;

             current =iv_ruleFrom; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFrom"


    // $ANTLR start "ruleFrom"
    // InternalSocialRequest.g:1269:1: ruleFrom returns [EObject current=null] : (otherlv_0= 'FROM' otherlv_1= '{' ( (otherlv_2= RULE_ID ) ) ( (lv_alias_3_0= RULE_ID ) ) otherlv_4= '}' ) ;
    public final EObject ruleFrom() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_alias_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalSocialRequest.g:1275:2: ( (otherlv_0= 'FROM' otherlv_1= '{' ( (otherlv_2= RULE_ID ) ) ( (lv_alias_3_0= RULE_ID ) ) otherlv_4= '}' ) )
            // InternalSocialRequest.g:1276:2: (otherlv_0= 'FROM' otherlv_1= '{' ( (otherlv_2= RULE_ID ) ) ( (lv_alias_3_0= RULE_ID ) ) otherlv_4= '}' )
            {
            // InternalSocialRequest.g:1276:2: (otherlv_0= 'FROM' otherlv_1= '{' ( (otherlv_2= RULE_ID ) ) ( (lv_alias_3_0= RULE_ID ) ) otherlv_4= '}' )
            // InternalSocialRequest.g:1277:3: otherlv_0= 'FROM' otherlv_1= '{' ( (otherlv_2= RULE_ID ) ) ( (lv_alias_3_0= RULE_ID ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,45,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getFromAccess().getFROMKeyword_0());
            		
            otherlv_1=(Token)match(input,16,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getFromAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalSocialRequest.g:1285:3: ( (otherlv_2= RULE_ID ) )
            // InternalSocialRequest.g:1286:4: (otherlv_2= RULE_ID )
            {
            // InternalSocialRequest.g:1286:4: (otherlv_2= RULE_ID )
            // InternalSocialRequest.g:1287:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFromRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(otherlv_2, grammarAccess.getFromAccess().getEntityEntityCrossReference_2_0());
            				

            }


            }

            // InternalSocialRequest.g:1298:3: ( (lv_alias_3_0= RULE_ID ) )
            // InternalSocialRequest.g:1299:4: (lv_alias_3_0= RULE_ID )
            {
            // InternalSocialRequest.g:1299:4: (lv_alias_3_0= RULE_ID )
            // InternalSocialRequest.g:1300:5: lv_alias_3_0= RULE_ID
            {
            lv_alias_3_0=(Token)match(input,RULE_ID,FOLLOW_31); 

            					newLeafNode(lv_alias_3_0, grammarAccess.getFromAccess().getAliasIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFromRule());
            					}
            					setWithLastConsumed(
            						current,
            						"alias",
            						lv_alias_3_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_4=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getFromAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFrom"


    // $ANTLR start "entryRuleJoin"
    // InternalSocialRequest.g:1324:1: entryRuleJoin returns [EObject current=null] : iv_ruleJoin= ruleJoin EOF ;
    public final EObject entryRuleJoin() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJoin = null;


        try {
            // InternalSocialRequest.g:1324:45: (iv_ruleJoin= ruleJoin EOF )
            // InternalSocialRequest.g:1325:2: iv_ruleJoin= ruleJoin EOF
            {
             newCompositeNode(grammarAccess.getJoinRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleJoin=ruleJoin();

            state._fsp--;

             current =iv_ruleJoin; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJoin"


    // $ANTLR start "ruleJoin"
    // InternalSocialRequest.g:1331:1: ruleJoin returns [EObject current=null] : ( ( (lv_joinType_0_0= ruleJoinType ) ) otherlv_1= '{' ( (otherlv_2= RULE_ID ) ) ( (lv_alias_3_0= RULE_ID ) ) otherlv_4= '}' (otherlv_5= 'ON' otherlv_6= '{' ( (lv_joinCondition_7_0= RULE_STRING ) ) otherlv_8= '}' )? ) ;
    public final EObject ruleJoin() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_alias_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_joinCondition_7_0=null;
        Token otherlv_8=null;
        Enumerator lv_joinType_0_0 = null;



        	enterRule();

        try {
            // InternalSocialRequest.g:1337:2: ( ( ( (lv_joinType_0_0= ruleJoinType ) ) otherlv_1= '{' ( (otherlv_2= RULE_ID ) ) ( (lv_alias_3_0= RULE_ID ) ) otherlv_4= '}' (otherlv_5= 'ON' otherlv_6= '{' ( (lv_joinCondition_7_0= RULE_STRING ) ) otherlv_8= '}' )? ) )
            // InternalSocialRequest.g:1338:2: ( ( (lv_joinType_0_0= ruleJoinType ) ) otherlv_1= '{' ( (otherlv_2= RULE_ID ) ) ( (lv_alias_3_0= RULE_ID ) ) otherlv_4= '}' (otherlv_5= 'ON' otherlv_6= '{' ( (lv_joinCondition_7_0= RULE_STRING ) ) otherlv_8= '}' )? )
            {
            // InternalSocialRequest.g:1338:2: ( ( (lv_joinType_0_0= ruleJoinType ) ) otherlv_1= '{' ( (otherlv_2= RULE_ID ) ) ( (lv_alias_3_0= RULE_ID ) ) otherlv_4= '}' (otherlv_5= 'ON' otherlv_6= '{' ( (lv_joinCondition_7_0= RULE_STRING ) ) otherlv_8= '}' )? )
            // InternalSocialRequest.g:1339:3: ( (lv_joinType_0_0= ruleJoinType ) ) otherlv_1= '{' ( (otherlv_2= RULE_ID ) ) ( (lv_alias_3_0= RULE_ID ) ) otherlv_4= '}' (otherlv_5= 'ON' otherlv_6= '{' ( (lv_joinCondition_7_0= RULE_STRING ) ) otherlv_8= '}' )?
            {
            // InternalSocialRequest.g:1339:3: ( (lv_joinType_0_0= ruleJoinType ) )
            // InternalSocialRequest.g:1340:4: (lv_joinType_0_0= ruleJoinType )
            {
            // InternalSocialRequest.g:1340:4: (lv_joinType_0_0= ruleJoinType )
            // InternalSocialRequest.g:1341:5: lv_joinType_0_0= ruleJoinType
            {

            					newCompositeNode(grammarAccess.getJoinAccess().getJoinTypeJoinTypeEnumRuleCall_0_0());
            				
            pushFollow(FOLLOW_8);
            lv_joinType_0_0=ruleJoinType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getJoinRule());
            					}
            					set(
            						current,
            						"joinType",
            						lv_joinType_0_0,
            						"org.xtext.example.mydsl.SocialRequest.JoinType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,16,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getJoinAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalSocialRequest.g:1362:3: ( (otherlv_2= RULE_ID ) )
            // InternalSocialRequest.g:1363:4: (otherlv_2= RULE_ID )
            {
            // InternalSocialRequest.g:1363:4: (otherlv_2= RULE_ID )
            // InternalSocialRequest.g:1364:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getJoinRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(otherlv_2, grammarAccess.getJoinAccess().getEntityEntityCrossReference_2_0());
            				

            }


            }

            // InternalSocialRequest.g:1375:3: ( (lv_alias_3_0= RULE_ID ) )
            // InternalSocialRequest.g:1376:4: (lv_alias_3_0= RULE_ID )
            {
            // InternalSocialRequest.g:1376:4: (lv_alias_3_0= RULE_ID )
            // InternalSocialRequest.g:1377:5: lv_alias_3_0= RULE_ID
            {
            lv_alias_3_0=(Token)match(input,RULE_ID,FOLLOW_31); 

            					newLeafNode(lv_alias_3_0, grammarAccess.getJoinAccess().getAliasIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getJoinRule());
            					}
            					setWithLastConsumed(
            						current,
            						"alias",
            						lv_alias_3_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_4=(Token)match(input,17,FOLLOW_36); 

            			newLeafNode(otherlv_4, grammarAccess.getJoinAccess().getRightCurlyBracketKeyword_4());
            		
            // InternalSocialRequest.g:1397:3: (otherlv_5= 'ON' otherlv_6= '{' ( (lv_joinCondition_7_0= RULE_STRING ) ) otherlv_8= '}' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==46) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalSocialRequest.g:1398:4: otherlv_5= 'ON' otherlv_6= '{' ( (lv_joinCondition_7_0= RULE_STRING ) ) otherlv_8= '}'
                    {
                    otherlv_5=(Token)match(input,46,FOLLOW_8); 

                    				newLeafNode(otherlv_5, grammarAccess.getJoinAccess().getONKeyword_5_0());
                    			
                    otherlv_6=(Token)match(input,16,FOLLOW_23); 

                    				newLeafNode(otherlv_6, grammarAccess.getJoinAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalSocialRequest.g:1406:4: ( (lv_joinCondition_7_0= RULE_STRING ) )
                    // InternalSocialRequest.g:1407:5: (lv_joinCondition_7_0= RULE_STRING )
                    {
                    // InternalSocialRequest.g:1407:5: (lv_joinCondition_7_0= RULE_STRING )
                    // InternalSocialRequest.g:1408:6: lv_joinCondition_7_0= RULE_STRING
                    {
                    lv_joinCondition_7_0=(Token)match(input,RULE_STRING,FOLLOW_31); 

                    						newLeafNode(lv_joinCondition_7_0, grammarAccess.getJoinAccess().getJoinConditionSTRINGTerminalRuleCall_5_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getJoinRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"joinCondition",
                    							lv_joinCondition_7_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }

                    otherlv_8=(Token)match(input,17,FOLLOW_2); 

                    				newLeafNode(otherlv_8, grammarAccess.getJoinAccess().getRightCurlyBracketKeyword_5_3());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJoin"


    // $ANTLR start "entryRuleWhere"
    // InternalSocialRequest.g:1433:1: entryRuleWhere returns [EObject current=null] : iv_ruleWhere= ruleWhere EOF ;
    public final EObject entryRuleWhere() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhere = null;


        try {
            // InternalSocialRequest.g:1433:46: (iv_ruleWhere= ruleWhere EOF )
            // InternalSocialRequest.g:1434:2: iv_ruleWhere= ruleWhere EOF
            {
             newCompositeNode(grammarAccess.getWhereRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWhere=ruleWhere();

            state._fsp--;

             current =iv_ruleWhere; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWhere"


    // $ANTLR start "ruleWhere"
    // InternalSocialRequest.g:1440:1: ruleWhere returns [EObject current=null] : (otherlv_0= 'WHERE' otherlv_1= '{' ( (lv_condition_2_0= RULE_STRING ) ) otherlv_3= '}' ) ;
    public final EObject ruleWhere() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_condition_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalSocialRequest.g:1446:2: ( (otherlv_0= 'WHERE' otherlv_1= '{' ( (lv_condition_2_0= RULE_STRING ) ) otherlv_3= '}' ) )
            // InternalSocialRequest.g:1447:2: (otherlv_0= 'WHERE' otherlv_1= '{' ( (lv_condition_2_0= RULE_STRING ) ) otherlv_3= '}' )
            {
            // InternalSocialRequest.g:1447:2: (otherlv_0= 'WHERE' otherlv_1= '{' ( (lv_condition_2_0= RULE_STRING ) ) otherlv_3= '}' )
            // InternalSocialRequest.g:1448:3: otherlv_0= 'WHERE' otherlv_1= '{' ( (lv_condition_2_0= RULE_STRING ) ) otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,47,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getWhereAccess().getWHEREKeyword_0());
            		
            otherlv_1=(Token)match(input,16,FOLLOW_23); 

            			newLeafNode(otherlv_1, grammarAccess.getWhereAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalSocialRequest.g:1456:3: ( (lv_condition_2_0= RULE_STRING ) )
            // InternalSocialRequest.g:1457:4: (lv_condition_2_0= RULE_STRING )
            {
            // InternalSocialRequest.g:1457:4: (lv_condition_2_0= RULE_STRING )
            // InternalSocialRequest.g:1458:5: lv_condition_2_0= RULE_STRING
            {
            lv_condition_2_0=(Token)match(input,RULE_STRING,FOLLOW_31); 

            					newLeafNode(lv_condition_2_0, grammarAccess.getWhereAccess().getConditionSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getWhereRule());
            					}
            					setWithLastConsumed(
            						current,
            						"condition",
            						lv_condition_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_3=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getWhereAccess().getRightCurlyBracketKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWhere"


    // $ANTLR start "entryRuleOrder"
    // InternalSocialRequest.g:1482:1: entryRuleOrder returns [EObject current=null] : iv_ruleOrder= ruleOrder EOF ;
    public final EObject entryRuleOrder() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrder = null;


        try {
            // InternalSocialRequest.g:1482:46: (iv_ruleOrder= ruleOrder EOF )
            // InternalSocialRequest.g:1483:2: iv_ruleOrder= ruleOrder EOF
            {
             newCompositeNode(grammarAccess.getOrderRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOrder=ruleOrder();

            state._fsp--;

             current =iv_ruleOrder; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOrder"


    // $ANTLR start "ruleOrder"
    // InternalSocialRequest.g:1489:1: ruleOrder returns [EObject current=null] : (otherlv_0= 'ORDER BY' otherlv_1= '{' ( (lv_order_2_0= RULE_STRING ) ) otherlv_3= '}' ) ;
    public final EObject ruleOrder() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_order_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalSocialRequest.g:1495:2: ( (otherlv_0= 'ORDER BY' otherlv_1= '{' ( (lv_order_2_0= RULE_STRING ) ) otherlv_3= '}' ) )
            // InternalSocialRequest.g:1496:2: (otherlv_0= 'ORDER BY' otherlv_1= '{' ( (lv_order_2_0= RULE_STRING ) ) otherlv_3= '}' )
            {
            // InternalSocialRequest.g:1496:2: (otherlv_0= 'ORDER BY' otherlv_1= '{' ( (lv_order_2_0= RULE_STRING ) ) otherlv_3= '}' )
            // InternalSocialRequest.g:1497:3: otherlv_0= 'ORDER BY' otherlv_1= '{' ( (lv_order_2_0= RULE_STRING ) ) otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,48,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getOrderAccess().getORDERBYKeyword_0());
            		
            otherlv_1=(Token)match(input,16,FOLLOW_23); 

            			newLeafNode(otherlv_1, grammarAccess.getOrderAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalSocialRequest.g:1505:3: ( (lv_order_2_0= RULE_STRING ) )
            // InternalSocialRequest.g:1506:4: (lv_order_2_0= RULE_STRING )
            {
            // InternalSocialRequest.g:1506:4: (lv_order_2_0= RULE_STRING )
            // InternalSocialRequest.g:1507:5: lv_order_2_0= RULE_STRING
            {
            lv_order_2_0=(Token)match(input,RULE_STRING,FOLLOW_31); 

            					newLeafNode(lv_order_2_0, grammarAccess.getOrderAccess().getOrderSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOrderRule());
            					}
            					setWithLastConsumed(
            						current,
            						"order",
            						lv_order_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_3=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getOrderAccess().getRightCurlyBracketKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOrder"


    // $ANTLR start "ruleGenerationType"
    // InternalSocialRequest.g:1531:1: ruleGenerationType returns [Enumerator current=null] : ( (enumLiteral_0= 'AUTO' ) | (enumLiteral_1= 'TABLE' ) | (enumLiteral_2= 'IDENTITY' ) | (enumLiteral_3= 'SEQUENCE' ) ) ;
    public final Enumerator ruleGenerationType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalSocialRequest.g:1537:2: ( ( (enumLiteral_0= 'AUTO' ) | (enumLiteral_1= 'TABLE' ) | (enumLiteral_2= 'IDENTITY' ) | (enumLiteral_3= 'SEQUENCE' ) ) )
            // InternalSocialRequest.g:1538:2: ( (enumLiteral_0= 'AUTO' ) | (enumLiteral_1= 'TABLE' ) | (enumLiteral_2= 'IDENTITY' ) | (enumLiteral_3= 'SEQUENCE' ) )
            {
            // InternalSocialRequest.g:1538:2: ( (enumLiteral_0= 'AUTO' ) | (enumLiteral_1= 'TABLE' ) | (enumLiteral_2= 'IDENTITY' ) | (enumLiteral_3= 'SEQUENCE' ) )
            int alt26=4;
            switch ( input.LA(1) ) {
            case 49:
                {
                alt26=1;
                }
                break;
            case 50:
                {
                alt26=2;
                }
                break;
            case 51:
                {
                alt26=3;
                }
                break;
            case 52:
                {
                alt26=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }

            switch (alt26) {
                case 1 :
                    // InternalSocialRequest.g:1539:3: (enumLiteral_0= 'AUTO' )
                    {
                    // InternalSocialRequest.g:1539:3: (enumLiteral_0= 'AUTO' )
                    // InternalSocialRequest.g:1540:4: enumLiteral_0= 'AUTO'
                    {
                    enumLiteral_0=(Token)match(input,49,FOLLOW_2); 

                    				current = grammarAccess.getGenerationTypeAccess().getAUTOEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getGenerationTypeAccess().getAUTOEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSocialRequest.g:1547:3: (enumLiteral_1= 'TABLE' )
                    {
                    // InternalSocialRequest.g:1547:3: (enumLiteral_1= 'TABLE' )
                    // InternalSocialRequest.g:1548:4: enumLiteral_1= 'TABLE'
                    {
                    enumLiteral_1=(Token)match(input,50,FOLLOW_2); 

                    				current = grammarAccess.getGenerationTypeAccess().getTABLEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getGenerationTypeAccess().getTABLEEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalSocialRequest.g:1555:3: (enumLiteral_2= 'IDENTITY' )
                    {
                    // InternalSocialRequest.g:1555:3: (enumLiteral_2= 'IDENTITY' )
                    // InternalSocialRequest.g:1556:4: enumLiteral_2= 'IDENTITY'
                    {
                    enumLiteral_2=(Token)match(input,51,FOLLOW_2); 

                    				current = grammarAccess.getGenerationTypeAccess().getIDENTITYEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getGenerationTypeAccess().getIDENTITYEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalSocialRequest.g:1563:3: (enumLiteral_3= 'SEQUENCE' )
                    {
                    // InternalSocialRequest.g:1563:3: (enumLiteral_3= 'SEQUENCE' )
                    // InternalSocialRequest.g:1564:4: enumLiteral_3= 'SEQUENCE'
                    {
                    enumLiteral_3=(Token)match(input,52,FOLLOW_2); 

                    				current = grammarAccess.getGenerationTypeAccess().getSEQUENCEEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getGenerationTypeAccess().getSEQUENCEEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGenerationType"


    // $ANTLR start "ruleDataType"
    // InternalSocialRequest.g:1574:1: ruleDataType returns [Enumerator current=null] : ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'long' ) | (enumLiteral_2= 'float' ) | (enumLiteral_3= 'double' ) | (enumLiteral_4= 'char' ) | (enumLiteral_5= 'int' ) | (enumLiteral_6= 'boolean' ) | (enumLiteral_7= 'Date' ) ) ;
    public final Enumerator ruleDataType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;
        Token enumLiteral_7=null;


        	enterRule();

        try {
            // InternalSocialRequest.g:1580:2: ( ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'long' ) | (enumLiteral_2= 'float' ) | (enumLiteral_3= 'double' ) | (enumLiteral_4= 'char' ) | (enumLiteral_5= 'int' ) | (enumLiteral_6= 'boolean' ) | (enumLiteral_7= 'Date' ) ) )
            // InternalSocialRequest.g:1581:2: ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'long' ) | (enumLiteral_2= 'float' ) | (enumLiteral_3= 'double' ) | (enumLiteral_4= 'char' ) | (enumLiteral_5= 'int' ) | (enumLiteral_6= 'boolean' ) | (enumLiteral_7= 'Date' ) )
            {
            // InternalSocialRequest.g:1581:2: ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'long' ) | (enumLiteral_2= 'float' ) | (enumLiteral_3= 'double' ) | (enumLiteral_4= 'char' ) | (enumLiteral_5= 'int' ) | (enumLiteral_6= 'boolean' ) | (enumLiteral_7= 'Date' ) )
            int alt27=8;
            switch ( input.LA(1) ) {
            case 53:
                {
                alt27=1;
                }
                break;
            case 54:
                {
                alt27=2;
                }
                break;
            case 55:
                {
                alt27=3;
                }
                break;
            case 56:
                {
                alt27=4;
                }
                break;
            case 57:
                {
                alt27=5;
                }
                break;
            case 58:
                {
                alt27=6;
                }
                break;
            case 59:
                {
                alt27=7;
                }
                break;
            case 60:
                {
                alt27=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }

            switch (alt27) {
                case 1 :
                    // InternalSocialRequest.g:1582:3: (enumLiteral_0= 'String' )
                    {
                    // InternalSocialRequest.g:1582:3: (enumLiteral_0= 'String' )
                    // InternalSocialRequest.g:1583:4: enumLiteral_0= 'String'
                    {
                    enumLiteral_0=(Token)match(input,53,FOLLOW_2); 

                    				current = grammarAccess.getDataTypeAccess().getSTRINGEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getDataTypeAccess().getSTRINGEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSocialRequest.g:1590:3: (enumLiteral_1= 'long' )
                    {
                    // InternalSocialRequest.g:1590:3: (enumLiteral_1= 'long' )
                    // InternalSocialRequest.g:1591:4: enumLiteral_1= 'long'
                    {
                    enumLiteral_1=(Token)match(input,54,FOLLOW_2); 

                    				current = grammarAccess.getDataTypeAccess().getLONGEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getDataTypeAccess().getLONGEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalSocialRequest.g:1598:3: (enumLiteral_2= 'float' )
                    {
                    // InternalSocialRequest.g:1598:3: (enumLiteral_2= 'float' )
                    // InternalSocialRequest.g:1599:4: enumLiteral_2= 'float'
                    {
                    enumLiteral_2=(Token)match(input,55,FOLLOW_2); 

                    				current = grammarAccess.getDataTypeAccess().getFLOATEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getDataTypeAccess().getFLOATEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalSocialRequest.g:1606:3: (enumLiteral_3= 'double' )
                    {
                    // InternalSocialRequest.g:1606:3: (enumLiteral_3= 'double' )
                    // InternalSocialRequest.g:1607:4: enumLiteral_3= 'double'
                    {
                    enumLiteral_3=(Token)match(input,56,FOLLOW_2); 

                    				current = grammarAccess.getDataTypeAccess().getDOUBLEEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getDataTypeAccess().getDOUBLEEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalSocialRequest.g:1614:3: (enumLiteral_4= 'char' )
                    {
                    // InternalSocialRequest.g:1614:3: (enumLiteral_4= 'char' )
                    // InternalSocialRequest.g:1615:4: enumLiteral_4= 'char'
                    {
                    enumLiteral_4=(Token)match(input,57,FOLLOW_2); 

                    				current = grammarAccess.getDataTypeAccess().getCHAREnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getDataTypeAccess().getCHAREnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalSocialRequest.g:1622:3: (enumLiteral_5= 'int' )
                    {
                    // InternalSocialRequest.g:1622:3: (enumLiteral_5= 'int' )
                    // InternalSocialRequest.g:1623:4: enumLiteral_5= 'int'
                    {
                    enumLiteral_5=(Token)match(input,58,FOLLOW_2); 

                    				current = grammarAccess.getDataTypeAccess().getINTEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getDataTypeAccess().getINTEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalSocialRequest.g:1630:3: (enumLiteral_6= 'boolean' )
                    {
                    // InternalSocialRequest.g:1630:3: (enumLiteral_6= 'boolean' )
                    // InternalSocialRequest.g:1631:4: enumLiteral_6= 'boolean'
                    {
                    enumLiteral_6=(Token)match(input,59,FOLLOW_2); 

                    				current = grammarAccess.getDataTypeAccess().getBOOLEANEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getDataTypeAccess().getBOOLEANEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalSocialRequest.g:1638:3: (enumLiteral_7= 'Date' )
                    {
                    // InternalSocialRequest.g:1638:3: (enumLiteral_7= 'Date' )
                    // InternalSocialRequest.g:1639:4: enumLiteral_7= 'Date'
                    {
                    enumLiteral_7=(Token)match(input,60,FOLLOW_2); 

                    				current = grammarAccess.getDataTypeAccess().getDATEEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_7, grammarAccess.getDataTypeAccess().getDATEEnumLiteralDeclaration_7());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDataType"


    // $ANTLR start "ruleJoinType"
    // InternalSocialRequest.g:1649:1: ruleJoinType returns [Enumerator current=null] : ( (enumLiteral_0= 'LEFT JOIN' ) | (enumLiteral_1= 'LEFT OUTER JOIN' ) | (enumLiteral_2= 'CROSS JOIN' ) | (enumLiteral_3= 'JOIN' ) ) ;
    public final Enumerator ruleJoinType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalSocialRequest.g:1655:2: ( ( (enumLiteral_0= 'LEFT JOIN' ) | (enumLiteral_1= 'LEFT OUTER JOIN' ) | (enumLiteral_2= 'CROSS JOIN' ) | (enumLiteral_3= 'JOIN' ) ) )
            // InternalSocialRequest.g:1656:2: ( (enumLiteral_0= 'LEFT JOIN' ) | (enumLiteral_1= 'LEFT OUTER JOIN' ) | (enumLiteral_2= 'CROSS JOIN' ) | (enumLiteral_3= 'JOIN' ) )
            {
            // InternalSocialRequest.g:1656:2: ( (enumLiteral_0= 'LEFT JOIN' ) | (enumLiteral_1= 'LEFT OUTER JOIN' ) | (enumLiteral_2= 'CROSS JOIN' ) | (enumLiteral_3= 'JOIN' ) )
            int alt28=4;
            switch ( input.LA(1) ) {
            case 61:
                {
                alt28=1;
                }
                break;
            case 62:
                {
                alt28=2;
                }
                break;
            case 63:
                {
                alt28=3;
                }
                break;
            case 64:
                {
                alt28=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }

            switch (alt28) {
                case 1 :
                    // InternalSocialRequest.g:1657:3: (enumLiteral_0= 'LEFT JOIN' )
                    {
                    // InternalSocialRequest.g:1657:3: (enumLiteral_0= 'LEFT JOIN' )
                    // InternalSocialRequest.g:1658:4: enumLiteral_0= 'LEFT JOIN'
                    {
                    enumLiteral_0=(Token)match(input,61,FOLLOW_2); 

                    				current = grammarAccess.getJoinTypeAccess().getLEFT_JOINEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getJoinTypeAccess().getLEFT_JOINEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSocialRequest.g:1665:3: (enumLiteral_1= 'LEFT OUTER JOIN' )
                    {
                    // InternalSocialRequest.g:1665:3: (enumLiteral_1= 'LEFT OUTER JOIN' )
                    // InternalSocialRequest.g:1666:4: enumLiteral_1= 'LEFT OUTER JOIN'
                    {
                    enumLiteral_1=(Token)match(input,62,FOLLOW_2); 

                    				current = grammarAccess.getJoinTypeAccess().getLEFT_OUTER_JOINEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getJoinTypeAccess().getLEFT_OUTER_JOINEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalSocialRequest.g:1673:3: (enumLiteral_2= 'CROSS JOIN' )
                    {
                    // InternalSocialRequest.g:1673:3: (enumLiteral_2= 'CROSS JOIN' )
                    // InternalSocialRequest.g:1674:4: enumLiteral_2= 'CROSS JOIN'
                    {
                    enumLiteral_2=(Token)match(input,63,FOLLOW_2); 

                    				current = grammarAccess.getJoinTypeAccess().getCROSS_JOINEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getJoinTypeAccess().getCROSS_JOINEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalSocialRequest.g:1681:3: (enumLiteral_3= 'JOIN' )
                    {
                    // InternalSocialRequest.g:1681:3: (enumLiteral_3= 'JOIN' )
                    // InternalSocialRequest.g:1682:4: enumLiteral_3= 'JOIN'
                    {
                    enumLiteral_3=(Token)match(input,64,FOLLOW_2); 

                    				current = grammarAccess.getJoinTypeAccess().getJOINEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getJoinTypeAccess().getJOINEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJoinType"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000008000002002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000014000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000007800000010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000007800020010L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x1FE0000000000010L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000001C10002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x00000000003A0000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x00000007F8000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x00000007F8020000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x001E000000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000010000020000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000050000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x00000C0000020000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000020010L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000080000020000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0xE001800000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000100000010000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000400000000002L});

}
