package org.xtext.example.mydsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_ASSOCIATION", "RULE_DATA_TYPE", "RULE_GENERATION_TYPE", "RULE_POSSIBLY_SIGNED_INT", "RULE_STRING", "RULE_FETCH_TYPE", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Entity'", "'implements UserDetails'", "'{'", "'}'", "':'", "'validations {'", "'LOB'", "'ID'", "'('", "')'", "'min:'", "'max:'", "'pattern:'", "'not-null'", "'not-blank'", "'mappedBy:'", "'fetch:'", "'Repository'", "'query'", "': list'", "'param'", "'Kek'"
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
    // InternalSocialRequest.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalSocialRequest.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalSocialRequest.g:65:2: iv_ruleModel= ruleModel EOF
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
    // InternalSocialRequest.g:71:1: ruleModel returns [EObject current=null] : ( ( (lv_entities_0_0= ruleEntity ) )* ( (lv_repositories_1_0= ruleRepository ) )* ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_entities_0_0 = null;

        EObject lv_repositories_1_0 = null;



        	enterRule();

        try {
            // InternalSocialRequest.g:77:2: ( ( ( (lv_entities_0_0= ruleEntity ) )* ( (lv_repositories_1_0= ruleRepository ) )* ) )
            // InternalSocialRequest.g:78:2: ( ( (lv_entities_0_0= ruleEntity ) )* ( (lv_repositories_1_0= ruleRepository ) )* )
            {
            // InternalSocialRequest.g:78:2: ( ( (lv_entities_0_0= ruleEntity ) )* ( (lv_repositories_1_0= ruleRepository ) )* )
            // InternalSocialRequest.g:79:3: ( (lv_entities_0_0= ruleEntity ) )* ( (lv_repositories_1_0= ruleRepository ) )*
            {
            // InternalSocialRequest.g:79:3: ( (lv_entities_0_0= ruleEntity ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==16) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalSocialRequest.g:80:4: (lv_entities_0_0= ruleEntity )
            	    {
            	    // InternalSocialRequest.g:80:4: (lv_entities_0_0= ruleEntity )
            	    // InternalSocialRequest.g:81:5: lv_entities_0_0= ruleEntity
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

            // InternalSocialRequest.g:98:3: ( (lv_repositories_1_0= ruleRepository ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==33) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalSocialRequest.g:99:4: (lv_repositories_1_0= ruleRepository )
            	    {
            	    // InternalSocialRequest.g:99:4: (lv_repositories_1_0= ruleRepository )
            	    // InternalSocialRequest.g:100:5: lv_repositories_1_0= ruleRepository
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
    // InternalSocialRequest.g:121:1: entryRuleEntity returns [EObject current=null] : iv_ruleEntity= ruleEntity EOF ;
    public final EObject entryRuleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntity = null;


        try {
            // InternalSocialRequest.g:121:47: (iv_ruleEntity= ruleEntity EOF )
            // InternalSocialRequest.g:122:2: iv_ruleEntity= ruleEntity EOF
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
    // InternalSocialRequest.g:128:1: ruleEntity returns [EObject current=null] : (otherlv_0= 'Entity' ( (lv_name_1_0= RULE_ID ) ) ( (lv_hasUserDetails_2_0= 'implements UserDetails' ) )? otherlv_3= '{' ( (lv_attributes_4_0= ruleAttribute ) )+ otherlv_5= '}' ) ;
    public final EObject ruleEntity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_hasUserDetails_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_attributes_4_0 = null;



        	enterRule();

        try {
            // InternalSocialRequest.g:134:2: ( (otherlv_0= 'Entity' ( (lv_name_1_0= RULE_ID ) ) ( (lv_hasUserDetails_2_0= 'implements UserDetails' ) )? otherlv_3= '{' ( (lv_attributes_4_0= ruleAttribute ) )+ otherlv_5= '}' ) )
            // InternalSocialRequest.g:135:2: (otherlv_0= 'Entity' ( (lv_name_1_0= RULE_ID ) ) ( (lv_hasUserDetails_2_0= 'implements UserDetails' ) )? otherlv_3= '{' ( (lv_attributes_4_0= ruleAttribute ) )+ otherlv_5= '}' )
            {
            // InternalSocialRequest.g:135:2: (otherlv_0= 'Entity' ( (lv_name_1_0= RULE_ID ) ) ( (lv_hasUserDetails_2_0= 'implements UserDetails' ) )? otherlv_3= '{' ( (lv_attributes_4_0= ruleAttribute ) )+ otherlv_5= '}' )
            // InternalSocialRequest.g:136:3: otherlv_0= 'Entity' ( (lv_name_1_0= RULE_ID ) ) ( (lv_hasUserDetails_2_0= 'implements UserDetails' ) )? otherlv_3= '{' ( (lv_attributes_4_0= ruleAttribute ) )+ otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getEntityAccess().getEntityKeyword_0());
            		
            // InternalSocialRequest.g:140:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSocialRequest.g:141:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSocialRequest.g:141:4: (lv_name_1_0= RULE_ID )
            // InternalSocialRequest.g:142:5: lv_name_1_0= RULE_ID
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

            // InternalSocialRequest.g:158:3: ( (lv_hasUserDetails_2_0= 'implements UserDetails' ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==17) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalSocialRequest.g:159:4: (lv_hasUserDetails_2_0= 'implements UserDetails' )
                    {
                    // InternalSocialRequest.g:159:4: (lv_hasUserDetails_2_0= 'implements UserDetails' )
                    // InternalSocialRequest.g:160:5: lv_hasUserDetails_2_0= 'implements UserDetails'
                    {
                    lv_hasUserDetails_2_0=(Token)match(input,17,FOLLOW_7); 

                    					newLeafNode(lv_hasUserDetails_2_0, grammarAccess.getEntityAccess().getHasUserDetailsImplementsUserDetailsKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getEntityRule());
                    					}
                    					setWithLastConsumed(current, "hasUserDetails", true, "implements UserDetails");
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,18,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalSocialRequest.g:176:3: ( (lv_attributes_4_0= ruleAttribute ) )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=RULE_ID && LA4_0<=RULE_ASSOCIATION)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalSocialRequest.g:177:4: (lv_attributes_4_0= ruleAttribute )
            	    {
            	    // InternalSocialRequest.g:177:4: (lv_attributes_4_0= ruleAttribute )
            	    // InternalSocialRequest.g:178:5: lv_attributes_4_0= ruleAttribute
            	    {

            	    					newCompositeNode(grammarAccess.getEntityAccess().getAttributesAttributeParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_9);
            	    lv_attributes_4_0=ruleAttribute();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getEntityRule());
            	    					}
            	    					add(
            	    						current,
            	    						"attributes",
            	    						lv_attributes_4_0,
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

            otherlv_5=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_5());
            		

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
    // InternalSocialRequest.g:203:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // InternalSocialRequest.g:203:50: (iv_ruleAttribute= ruleAttribute EOF )
            // InternalSocialRequest.g:204:2: iv_ruleAttribute= ruleAttribute EOF
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
    // InternalSocialRequest.g:210:1: ruleAttribute returns [EObject current=null] : ( ( (lv_association_0_0= RULE_ASSOCIATION ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_DATA_TYPE ) ) ( (lv_modifier_4_0= ruleModifier ) )? (otherlv_5= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_associationSpecifications_7_0= ruleAssociationSpecification ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_8= 'validations {' ( (lv_validations_9_0= ruleValidation ) )+ otherlv_10= '}' ) ) ) ) )* ) ) ) otherlv_11= '}' )? ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_association_0_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        EObject lv_modifier_4_0 = null;

        EObject lv_associationSpecifications_7_0 = null;

        EObject lv_validations_9_0 = null;



        	enterRule();

        try {
            // InternalSocialRequest.g:216:2: ( ( ( (lv_association_0_0= RULE_ASSOCIATION ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_DATA_TYPE ) ) ( (lv_modifier_4_0= ruleModifier ) )? (otherlv_5= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_associationSpecifications_7_0= ruleAssociationSpecification ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_8= 'validations {' ( (lv_validations_9_0= ruleValidation ) )+ otherlv_10= '}' ) ) ) ) )* ) ) ) otherlv_11= '}' )? ) )
            // InternalSocialRequest.g:217:2: ( ( (lv_association_0_0= RULE_ASSOCIATION ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_DATA_TYPE ) ) ( (lv_modifier_4_0= ruleModifier ) )? (otherlv_5= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_associationSpecifications_7_0= ruleAssociationSpecification ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_8= 'validations {' ( (lv_validations_9_0= ruleValidation ) )+ otherlv_10= '}' ) ) ) ) )* ) ) ) otherlv_11= '}' )? )
            {
            // InternalSocialRequest.g:217:2: ( ( (lv_association_0_0= RULE_ASSOCIATION ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_DATA_TYPE ) ) ( (lv_modifier_4_0= ruleModifier ) )? (otherlv_5= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_associationSpecifications_7_0= ruleAssociationSpecification ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_8= 'validations {' ( (lv_validations_9_0= ruleValidation ) )+ otherlv_10= '}' ) ) ) ) )* ) ) ) otherlv_11= '}' )? )
            // InternalSocialRequest.g:218:3: ( (lv_association_0_0= RULE_ASSOCIATION ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_DATA_TYPE ) ) ( (lv_modifier_4_0= ruleModifier ) )? (otherlv_5= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_associationSpecifications_7_0= ruleAssociationSpecification ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_8= 'validations {' ( (lv_validations_9_0= ruleValidation ) )+ otherlv_10= '}' ) ) ) ) )* ) ) ) otherlv_11= '}' )?
            {
            // InternalSocialRequest.g:218:3: ( (lv_association_0_0= RULE_ASSOCIATION ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ASSOCIATION) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalSocialRequest.g:219:4: (lv_association_0_0= RULE_ASSOCIATION )
                    {
                    // InternalSocialRequest.g:219:4: (lv_association_0_0= RULE_ASSOCIATION )
                    // InternalSocialRequest.g:220:5: lv_association_0_0= RULE_ASSOCIATION
                    {
                    lv_association_0_0=(Token)match(input,RULE_ASSOCIATION,FOLLOW_5); 

                    					newLeafNode(lv_association_0_0, grammarAccess.getAttributeAccess().getAssociationASSOCIATIONTerminalRuleCall_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getAttributeRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"association",
                    						lv_association_0_0,
                    						"org.xtext.example.mydsl.SocialRequest.ASSOCIATION");
                    				

                    }


                    }
                    break;

            }

            // InternalSocialRequest.g:236:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSocialRequest.g:237:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSocialRequest.g:237:4: (lv_name_1_0= RULE_ID )
            // InternalSocialRequest.g:238:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_10); 

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

            otherlv_2=(Token)match(input,20,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getAttributeAccess().getColonKeyword_2());
            		
            // InternalSocialRequest.g:258:3: ( (otherlv_3= RULE_DATA_TYPE ) )
            // InternalSocialRequest.g:259:4: (otherlv_3= RULE_DATA_TYPE )
            {
            // InternalSocialRequest.g:259:4: (otherlv_3= RULE_DATA_TYPE )
            // InternalSocialRequest.g:260:5: otherlv_3= RULE_DATA_TYPE
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAttributeRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_DATA_TYPE,FOLLOW_12); 

            					newLeafNode(otherlv_3, grammarAccess.getAttributeAccess().getTypeEntityCrossReference_3_0());
            				

            }


            }

            // InternalSocialRequest.g:271:3: ( (lv_modifier_4_0= ruleModifier ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=22 && LA6_0<=23)) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalSocialRequest.g:272:4: (lv_modifier_4_0= ruleModifier )
                    {
                    // InternalSocialRequest.g:272:4: (lv_modifier_4_0= ruleModifier )
                    // InternalSocialRequest.g:273:5: lv_modifier_4_0= ruleModifier
                    {

                    					newCompositeNode(grammarAccess.getAttributeAccess().getModifierModifierParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_13);
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

            // InternalSocialRequest.g:290:3: (otherlv_5= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_associationSpecifications_7_0= ruleAssociationSpecification ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_8= 'validations {' ( (lv_validations_9_0= ruleValidation ) )+ otherlv_10= '}' ) ) ) ) )* ) ) ) otherlv_11= '}' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==18) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalSocialRequest.g:291:4: otherlv_5= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_associationSpecifications_7_0= ruleAssociationSpecification ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_8= 'validations {' ( (lv_validations_9_0= ruleValidation ) )+ otherlv_10= '}' ) ) ) ) )* ) ) ) otherlv_11= '}'
                    {
                    otherlv_5=(Token)match(input,18,FOLLOW_14); 

                    				newLeafNode(otherlv_5, grammarAccess.getAttributeAccess().getLeftCurlyBracketKeyword_5_0());
                    			
                    // InternalSocialRequest.g:295:4: ( ( ( ( ({...}? => ( ({...}? => ( (lv_associationSpecifications_7_0= ruleAssociationSpecification ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_8= 'validations {' ( (lv_validations_9_0= ruleValidation ) )+ otherlv_10= '}' ) ) ) ) )* ) ) )
                    // InternalSocialRequest.g:296:5: ( ( ( ({...}? => ( ({...}? => ( (lv_associationSpecifications_7_0= ruleAssociationSpecification ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_8= 'validations {' ( (lv_validations_9_0= ruleValidation ) )+ otherlv_10= '}' ) ) ) ) )* ) )
                    {
                    // InternalSocialRequest.g:296:5: ( ( ( ({...}? => ( ({...}? => ( (lv_associationSpecifications_7_0= ruleAssociationSpecification ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_8= 'validations {' ( (lv_validations_9_0= ruleValidation ) )+ otherlv_10= '}' ) ) ) ) )* ) )
                    // InternalSocialRequest.g:297:6: ( ( ({...}? => ( ({...}? => ( (lv_associationSpecifications_7_0= ruleAssociationSpecification ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_8= 'validations {' ( (lv_validations_9_0= ruleValidation ) )+ otherlv_10= '}' ) ) ) ) )* )
                    {
                     
                    					  getUnorderedGroupHelper().enter(grammarAccess.getAttributeAccess().getUnorderedGroup_5_1());
                    					
                    // InternalSocialRequest.g:300:6: ( ( ({...}? => ( ({...}? => ( (lv_associationSpecifications_7_0= ruleAssociationSpecification ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_8= 'validations {' ( (lv_validations_9_0= ruleValidation ) )+ otherlv_10= '}' ) ) ) ) )* )
                    // InternalSocialRequest.g:301:7: ( ({...}? => ( ({...}? => ( (lv_associationSpecifications_7_0= ruleAssociationSpecification ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_8= 'validations {' ( (lv_validations_9_0= ruleValidation ) )+ otherlv_10= '}' ) ) ) ) )*
                    {
                    // InternalSocialRequest.g:301:7: ( ({...}? => ( ({...}? => ( (lv_associationSpecifications_7_0= ruleAssociationSpecification ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_8= 'validations {' ( (lv_validations_9_0= ruleValidation ) )+ otherlv_10= '}' ) ) ) ) )*
                    loop9:
                    do {
                        int alt9=3;
                        int LA9_0 = input.LA(1);

                        if ( LA9_0 >= 31 && LA9_0 <= 32 && getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_1(), 0) ) {
                            alt9=1;
                        }
                        else if ( LA9_0 == 21 && getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_1(), 1) ) {
                            alt9=2;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalSocialRequest.g:302:5: ({...}? => ( ({...}? => ( (lv_associationSpecifications_7_0= ruleAssociationSpecification ) ) )+ ) )
                    	    {
                    	    // InternalSocialRequest.g:302:5: ({...}? => ( ({...}? => ( (lv_associationSpecifications_7_0= ruleAssociationSpecification ) ) )+ ) )
                    	    // InternalSocialRequest.g:303:6: {...}? => ( ({...}? => ( (lv_associationSpecifications_7_0= ruleAssociationSpecification ) ) )+ )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_1(), 0) ) {
                    	        throw new FailedPredicateException(input, "ruleAttribute", "getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_1(), 0)");
                    	    }
                    	    // InternalSocialRequest.g:303:109: ( ({...}? => ( (lv_associationSpecifications_7_0= ruleAssociationSpecification ) ) )+ )
                    	    // InternalSocialRequest.g:304:7: ({...}? => ( (lv_associationSpecifications_7_0= ruleAssociationSpecification ) ) )+
                    	    {

                    	    							getUnorderedGroupHelper().select(grammarAccess.getAttributeAccess().getUnorderedGroup_5_1(), 0);
                    	    						
                    	    // InternalSocialRequest.g:307:10: ({...}? => ( (lv_associationSpecifications_7_0= ruleAssociationSpecification ) ) )+
                    	    int cnt7=0;
                    	    loop7:
                    	    do {
                    	        int alt7=2;
                    	        int LA7_0 = input.LA(1);

                    	        if ( (LA7_0==31) ) {
                    	            int LA7_2 = input.LA(2);

                    	            if ( ((true)) ) {
                    	                alt7=1;
                    	            }


                    	        }
                    	        else if ( (LA7_0==32) ) {
                    	            int LA7_3 = input.LA(2);

                    	            if ( ((true)) ) {
                    	                alt7=1;
                    	            }


                    	        }


                    	        switch (alt7) {
                    	    	case 1 :
                    	    	    // InternalSocialRequest.g:307:11: {...}? => ( (lv_associationSpecifications_7_0= ruleAssociationSpecification ) )
                    	    	    {
                    	    	    if ( !((true)) ) {
                    	    	        throw new FailedPredicateException(input, "ruleAttribute", "true");
                    	    	    }
                    	    	    // InternalSocialRequest.g:307:20: ( (lv_associationSpecifications_7_0= ruleAssociationSpecification ) )
                    	    	    // InternalSocialRequest.g:307:21: (lv_associationSpecifications_7_0= ruleAssociationSpecification )
                    	    	    {
                    	    	    // InternalSocialRequest.g:307:21: (lv_associationSpecifications_7_0= ruleAssociationSpecification )
                    	    	    // InternalSocialRequest.g:308:11: lv_associationSpecifications_7_0= ruleAssociationSpecification
                    	    	    {

                    	    	    											newCompositeNode(grammarAccess.getAttributeAccess().getAssociationSpecificationsAssociationSpecificationParserRuleCall_5_1_0_0());
                    	    	    										
                    	    	    pushFollow(FOLLOW_14);
                    	    	    lv_associationSpecifications_7_0=ruleAssociationSpecification();

                    	    	    state._fsp--;


                    	    	    											if (current==null) {
                    	    	    												current = createModelElementForParent(grammarAccess.getAttributeRule());
                    	    	    											}
                    	    	    											add(
                    	    	    												current,
                    	    	    												"associationSpecifications",
                    	    	    												lv_associationSpecifications_7_0,
                    	    	    												"org.xtext.example.mydsl.SocialRequest.AssociationSpecification");
                    	    	    											afterParserOrEnumRuleCall();
                    	    	    										

                    	    	    }


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

                    	     
                    	    							getUnorderedGroupHelper().returnFromSelection(grammarAccess.getAttributeAccess().getUnorderedGroup_5_1());
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalSocialRequest.g:330:5: ({...}? => ( ({...}? => (otherlv_8= 'validations {' ( (lv_validations_9_0= ruleValidation ) )+ otherlv_10= '}' ) ) ) )
                    	    {
                    	    // InternalSocialRequest.g:330:5: ({...}? => ( ({...}? => (otherlv_8= 'validations {' ( (lv_validations_9_0= ruleValidation ) )+ otherlv_10= '}' ) ) ) )
                    	    // InternalSocialRequest.g:331:6: {...}? => ( ({...}? => (otherlv_8= 'validations {' ( (lv_validations_9_0= ruleValidation ) )+ otherlv_10= '}' ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_1(), 1) ) {
                    	        throw new FailedPredicateException(input, "ruleAttribute", "getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_1(), 1)");
                    	    }
                    	    // InternalSocialRequest.g:331:109: ( ({...}? => (otherlv_8= 'validations {' ( (lv_validations_9_0= ruleValidation ) )+ otherlv_10= '}' ) ) )
                    	    // InternalSocialRequest.g:332:7: ({...}? => (otherlv_8= 'validations {' ( (lv_validations_9_0= ruleValidation ) )+ otherlv_10= '}' ) )
                    	    {

                    	    							getUnorderedGroupHelper().select(grammarAccess.getAttributeAccess().getUnorderedGroup_5_1(), 1);
                    	    						
                    	    // InternalSocialRequest.g:335:10: ({...}? => (otherlv_8= 'validations {' ( (lv_validations_9_0= ruleValidation ) )+ otherlv_10= '}' ) )
                    	    // InternalSocialRequest.g:335:11: {...}? => (otherlv_8= 'validations {' ( (lv_validations_9_0= ruleValidation ) )+ otherlv_10= '}' )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleAttribute", "true");
                    	    }
                    	    // InternalSocialRequest.g:335:20: (otherlv_8= 'validations {' ( (lv_validations_9_0= ruleValidation ) )+ otherlv_10= '}' )
                    	    // InternalSocialRequest.g:335:21: otherlv_8= 'validations {' ( (lv_validations_9_0= ruleValidation ) )+ otherlv_10= '}'
                    	    {
                    	    otherlv_8=(Token)match(input,21,FOLLOW_15); 

                    	    										newLeafNode(otherlv_8, grammarAccess.getAttributeAccess().getValidationsKeyword_5_1_1_0());
                    	    									
                    	    // InternalSocialRequest.g:339:10: ( (lv_validations_9_0= ruleValidation ) )+
                    	    int cnt8=0;
                    	    loop8:
                    	    do {
                    	        int alt8=2;
                    	        int LA8_0 = input.LA(1);

                    	        if ( ((LA8_0>=26 && LA8_0<=30)) ) {
                    	            alt8=1;
                    	        }


                    	        switch (alt8) {
                    	    	case 1 :
                    	    	    // InternalSocialRequest.g:340:11: (lv_validations_9_0= ruleValidation )
                    	    	    {
                    	    	    // InternalSocialRequest.g:340:11: (lv_validations_9_0= ruleValidation )
                    	    	    // InternalSocialRequest.g:341:12: lv_validations_9_0= ruleValidation
                    	    	    {

                    	    	    												newCompositeNode(grammarAccess.getAttributeAccess().getValidationsValidationParserRuleCall_5_1_1_1_0());
                    	    	    											
                    	    	    pushFollow(FOLLOW_16);
                    	    	    lv_validations_9_0=ruleValidation();

                    	    	    state._fsp--;


                    	    	    												if (current==null) {
                    	    	    													current = createModelElementForParent(grammarAccess.getAttributeRule());
                    	    	    												}
                    	    	    												add(
                    	    	    													current,
                    	    	    													"validations",
                    	    	    													lv_validations_9_0,
                    	    	    													"org.xtext.example.mydsl.SocialRequest.Validation");
                    	    	    												afterParserOrEnumRuleCall();
                    	    	    											

                    	    	    }


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

                    	    otherlv_10=(Token)match(input,19,FOLLOW_14); 

                    	    										newLeafNode(otherlv_10, grammarAccess.getAttributeAccess().getRightCurlyBracketKeyword_5_1_1_2());
                    	    									

                    	    }


                    	    }

                    	     
                    	    							getUnorderedGroupHelper().returnFromSelection(grammarAccess.getAttributeAccess().getUnorderedGroup_5_1());
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);


                    }


                    }

                     
                    					  getUnorderedGroupHelper().leave(grammarAccess.getAttributeAccess().getUnorderedGroup_5_1());
                    					

                    }

                    otherlv_11=(Token)match(input,19,FOLLOW_2); 

                    				newLeafNode(otherlv_11, grammarAccess.getAttributeAccess().getRightCurlyBracketKeyword_5_2());
                    			

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


    // $ANTLR start "entryRuleModifier"
    // InternalSocialRequest.g:384:1: entryRuleModifier returns [EObject current=null] : iv_ruleModifier= ruleModifier EOF ;
    public final EObject entryRuleModifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModifier = null;


        try {
            // InternalSocialRequest.g:384:49: (iv_ruleModifier= ruleModifier EOF )
            // InternalSocialRequest.g:385:2: iv_ruleModifier= ruleModifier EOF
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
    // InternalSocialRequest.g:391:1: ruleModifier returns [EObject current=null] : ( ( () otherlv_1= 'LOB' ) | this_Identification_2= ruleIdentification ) ;
    public final EObject ruleModifier() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject this_Identification_2 = null;



        	enterRule();

        try {
            // InternalSocialRequest.g:397:2: ( ( ( () otherlv_1= 'LOB' ) | this_Identification_2= ruleIdentification ) )
            // InternalSocialRequest.g:398:2: ( ( () otherlv_1= 'LOB' ) | this_Identification_2= ruleIdentification )
            {
            // InternalSocialRequest.g:398:2: ( ( () otherlv_1= 'LOB' ) | this_Identification_2= ruleIdentification )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==22) ) {
                alt11=1;
            }
            else if ( (LA11_0==23) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalSocialRequest.g:399:3: ( () otherlv_1= 'LOB' )
                    {
                    // InternalSocialRequest.g:399:3: ( () otherlv_1= 'LOB' )
                    // InternalSocialRequest.g:400:4: () otherlv_1= 'LOB'
                    {
                    // InternalSocialRequest.g:400:4: ()
                    // InternalSocialRequest.g:401:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getModifierAccess().getModifierAction_0_0(),
                    						current);
                    				

                    }

                    otherlv_1=(Token)match(input,22,FOLLOW_2); 

                    				newLeafNode(otherlv_1, grammarAccess.getModifierAccess().getLOBKeyword_0_1());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSocialRequest.g:413:3: this_Identification_2= ruleIdentification
                    {

                    			newCompositeNode(grammarAccess.getModifierAccess().getIdentificationParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Identification_2=ruleIdentification();

                    state._fsp--;


                    			current = this_Identification_2;
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
    // $ANTLR end "ruleModifier"


    // $ANTLR start "entryRuleIdentification"
    // InternalSocialRequest.g:425:1: entryRuleIdentification returns [EObject current=null] : iv_ruleIdentification= ruleIdentification EOF ;
    public final EObject entryRuleIdentification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIdentification = null;


        try {
            // InternalSocialRequest.g:425:55: (iv_ruleIdentification= ruleIdentification EOF )
            // InternalSocialRequest.g:426:2: iv_ruleIdentification= ruleIdentification EOF
            {
             newCompositeNode(grammarAccess.getIdentificationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIdentification=ruleIdentification();

            state._fsp--;

             current =iv_ruleIdentification; 
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
    // $ANTLR end "entryRuleIdentification"


    // $ANTLR start "ruleIdentification"
    // InternalSocialRequest.g:432:1: ruleIdentification returns [EObject current=null] : ( () otherlv_1= 'ID' (otherlv_2= '(' ( (lv_generationType_3_0= RULE_GENERATION_TYPE ) ) otherlv_4= ')' )? ) ;
    public final EObject ruleIdentification() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_generationType_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalSocialRequest.g:438:2: ( ( () otherlv_1= 'ID' (otherlv_2= '(' ( (lv_generationType_3_0= RULE_GENERATION_TYPE ) ) otherlv_4= ')' )? ) )
            // InternalSocialRequest.g:439:2: ( () otherlv_1= 'ID' (otherlv_2= '(' ( (lv_generationType_3_0= RULE_GENERATION_TYPE ) ) otherlv_4= ')' )? )
            {
            // InternalSocialRequest.g:439:2: ( () otherlv_1= 'ID' (otherlv_2= '(' ( (lv_generationType_3_0= RULE_GENERATION_TYPE ) ) otherlv_4= ')' )? )
            // InternalSocialRequest.g:440:3: () otherlv_1= 'ID' (otherlv_2= '(' ( (lv_generationType_3_0= RULE_GENERATION_TYPE ) ) otherlv_4= ')' )?
            {
            // InternalSocialRequest.g:440:3: ()
            // InternalSocialRequest.g:441:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getIdentificationAccess().getIdentificationAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,23,FOLLOW_17); 

            			newLeafNode(otherlv_1, grammarAccess.getIdentificationAccess().getIDKeyword_1());
            		
            // InternalSocialRequest.g:451:3: (otherlv_2= '(' ( (lv_generationType_3_0= RULE_GENERATION_TYPE ) ) otherlv_4= ')' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==24) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalSocialRequest.g:452:4: otherlv_2= '(' ( (lv_generationType_3_0= RULE_GENERATION_TYPE ) ) otherlv_4= ')'
                    {
                    otherlv_2=(Token)match(input,24,FOLLOW_18); 

                    				newLeafNode(otherlv_2, grammarAccess.getIdentificationAccess().getLeftParenthesisKeyword_2_0());
                    			
                    // InternalSocialRequest.g:456:4: ( (lv_generationType_3_0= RULE_GENERATION_TYPE ) )
                    // InternalSocialRequest.g:457:5: (lv_generationType_3_0= RULE_GENERATION_TYPE )
                    {
                    // InternalSocialRequest.g:457:5: (lv_generationType_3_0= RULE_GENERATION_TYPE )
                    // InternalSocialRequest.g:458:6: lv_generationType_3_0= RULE_GENERATION_TYPE
                    {
                    lv_generationType_3_0=(Token)match(input,RULE_GENERATION_TYPE,FOLLOW_19); 

                    						newLeafNode(lv_generationType_3_0, grammarAccess.getIdentificationAccess().getGenerationTypeGENERATION_TYPETerminalRuleCall_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getIdentificationRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"generationType",
                    							lv_generationType_3_0,
                    							"org.xtext.example.mydsl.SocialRequest.GENERATION_TYPE");
                    					

                    }


                    }

                    otherlv_4=(Token)match(input,25,FOLLOW_2); 

                    				newLeafNode(otherlv_4, grammarAccess.getIdentificationAccess().getRightParenthesisKeyword_2_2());
                    			

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
    // $ANTLR end "ruleIdentification"


    // $ANTLR start "entryRuleValidation"
    // InternalSocialRequest.g:483:1: entryRuleValidation returns [EObject current=null] : iv_ruleValidation= ruleValidation EOF ;
    public final EObject entryRuleValidation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValidation = null;


        try {
            // InternalSocialRequest.g:483:51: (iv_ruleValidation= ruleValidation EOF )
            // InternalSocialRequest.g:484:2: iv_ruleValidation= ruleValidation EOF
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
    // InternalSocialRequest.g:490:1: ruleValidation returns [EObject current=null] : ( (otherlv_0= 'min:' ( (lv_min_1_0= RULE_POSSIBLY_SIGNED_INT ) ) ) | (otherlv_2= 'max:' ( (lv_max_3_0= RULE_POSSIBLY_SIGNED_INT ) ) ) | (otherlv_4= 'pattern:' ( (lv_regex_5_0= RULE_STRING ) ) ) | ( () otherlv_7= 'not-null' ) | ( () otherlv_9= 'not-blank' ) ) ;
    public final EObject ruleValidation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_min_1_0=null;
        Token otherlv_2=null;
        Token lv_max_3_0=null;
        Token otherlv_4=null;
        Token lv_regex_5_0=null;
        Token otherlv_7=null;
        Token otherlv_9=null;


        	enterRule();

        try {
            // InternalSocialRequest.g:496:2: ( ( (otherlv_0= 'min:' ( (lv_min_1_0= RULE_POSSIBLY_SIGNED_INT ) ) ) | (otherlv_2= 'max:' ( (lv_max_3_0= RULE_POSSIBLY_SIGNED_INT ) ) ) | (otherlv_4= 'pattern:' ( (lv_regex_5_0= RULE_STRING ) ) ) | ( () otherlv_7= 'not-null' ) | ( () otherlv_9= 'not-blank' ) ) )
            // InternalSocialRequest.g:497:2: ( (otherlv_0= 'min:' ( (lv_min_1_0= RULE_POSSIBLY_SIGNED_INT ) ) ) | (otherlv_2= 'max:' ( (lv_max_3_0= RULE_POSSIBLY_SIGNED_INT ) ) ) | (otherlv_4= 'pattern:' ( (lv_regex_5_0= RULE_STRING ) ) ) | ( () otherlv_7= 'not-null' ) | ( () otherlv_9= 'not-blank' ) )
            {
            // InternalSocialRequest.g:497:2: ( (otherlv_0= 'min:' ( (lv_min_1_0= RULE_POSSIBLY_SIGNED_INT ) ) ) | (otherlv_2= 'max:' ( (lv_max_3_0= RULE_POSSIBLY_SIGNED_INT ) ) ) | (otherlv_4= 'pattern:' ( (lv_regex_5_0= RULE_STRING ) ) ) | ( () otherlv_7= 'not-null' ) | ( () otherlv_9= 'not-blank' ) )
            int alt13=5;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt13=1;
                }
                break;
            case 27:
                {
                alt13=2;
                }
                break;
            case 28:
                {
                alt13=3;
                }
                break;
            case 29:
                {
                alt13=4;
                }
                break;
            case 30:
                {
                alt13=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // InternalSocialRequest.g:498:3: (otherlv_0= 'min:' ( (lv_min_1_0= RULE_POSSIBLY_SIGNED_INT ) ) )
                    {
                    // InternalSocialRequest.g:498:3: (otherlv_0= 'min:' ( (lv_min_1_0= RULE_POSSIBLY_SIGNED_INT ) ) )
                    // InternalSocialRequest.g:499:4: otherlv_0= 'min:' ( (lv_min_1_0= RULE_POSSIBLY_SIGNED_INT ) )
                    {
                    otherlv_0=(Token)match(input,26,FOLLOW_20); 

                    				newLeafNode(otherlv_0, grammarAccess.getValidationAccess().getMinKeyword_0_0());
                    			
                    // InternalSocialRequest.g:503:4: ( (lv_min_1_0= RULE_POSSIBLY_SIGNED_INT ) )
                    // InternalSocialRequest.g:504:5: (lv_min_1_0= RULE_POSSIBLY_SIGNED_INT )
                    {
                    // InternalSocialRequest.g:504:5: (lv_min_1_0= RULE_POSSIBLY_SIGNED_INT )
                    // InternalSocialRequest.g:505:6: lv_min_1_0= RULE_POSSIBLY_SIGNED_INT
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
                    // InternalSocialRequest.g:523:3: (otherlv_2= 'max:' ( (lv_max_3_0= RULE_POSSIBLY_SIGNED_INT ) ) )
                    {
                    // InternalSocialRequest.g:523:3: (otherlv_2= 'max:' ( (lv_max_3_0= RULE_POSSIBLY_SIGNED_INT ) ) )
                    // InternalSocialRequest.g:524:4: otherlv_2= 'max:' ( (lv_max_3_0= RULE_POSSIBLY_SIGNED_INT ) )
                    {
                    otherlv_2=(Token)match(input,27,FOLLOW_20); 

                    				newLeafNode(otherlv_2, grammarAccess.getValidationAccess().getMaxKeyword_1_0());
                    			
                    // InternalSocialRequest.g:528:4: ( (lv_max_3_0= RULE_POSSIBLY_SIGNED_INT ) )
                    // InternalSocialRequest.g:529:5: (lv_max_3_0= RULE_POSSIBLY_SIGNED_INT )
                    {
                    // InternalSocialRequest.g:529:5: (lv_max_3_0= RULE_POSSIBLY_SIGNED_INT )
                    // InternalSocialRequest.g:530:6: lv_max_3_0= RULE_POSSIBLY_SIGNED_INT
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
                    // InternalSocialRequest.g:548:3: (otherlv_4= 'pattern:' ( (lv_regex_5_0= RULE_STRING ) ) )
                    {
                    // InternalSocialRequest.g:548:3: (otherlv_4= 'pattern:' ( (lv_regex_5_0= RULE_STRING ) ) )
                    // InternalSocialRequest.g:549:4: otherlv_4= 'pattern:' ( (lv_regex_5_0= RULE_STRING ) )
                    {
                    otherlv_4=(Token)match(input,28,FOLLOW_21); 

                    				newLeafNode(otherlv_4, grammarAccess.getValidationAccess().getPatternKeyword_2_0());
                    			
                    // InternalSocialRequest.g:553:4: ( (lv_regex_5_0= RULE_STRING ) )
                    // InternalSocialRequest.g:554:5: (lv_regex_5_0= RULE_STRING )
                    {
                    // InternalSocialRequest.g:554:5: (lv_regex_5_0= RULE_STRING )
                    // InternalSocialRequest.g:555:6: lv_regex_5_0= RULE_STRING
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
                    // InternalSocialRequest.g:573:3: ( () otherlv_7= 'not-null' )
                    {
                    // InternalSocialRequest.g:573:3: ( () otherlv_7= 'not-null' )
                    // InternalSocialRequest.g:574:4: () otherlv_7= 'not-null'
                    {
                    // InternalSocialRequest.g:574:4: ()
                    // InternalSocialRequest.g:575:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getValidationAccess().getValidationAction_3_0(),
                    						current);
                    				

                    }

                    otherlv_7=(Token)match(input,29,FOLLOW_2); 

                    				newLeafNode(otherlv_7, grammarAccess.getValidationAccess().getNotNullKeyword_3_1());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalSocialRequest.g:587:3: ( () otherlv_9= 'not-blank' )
                    {
                    // InternalSocialRequest.g:587:3: ( () otherlv_9= 'not-blank' )
                    // InternalSocialRequest.g:588:4: () otherlv_9= 'not-blank'
                    {
                    // InternalSocialRequest.g:588:4: ()
                    // InternalSocialRequest.g:589:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getValidationAccess().getValidationAction_4_0(),
                    						current);
                    				

                    }

                    otherlv_9=(Token)match(input,30,FOLLOW_2); 

                    				newLeafNode(otherlv_9, grammarAccess.getValidationAccess().getNotBlankKeyword_4_1());
                    			

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


    // $ANTLR start "entryRuleAssociationSpecification"
    // InternalSocialRequest.g:604:1: entryRuleAssociationSpecification returns [EObject current=null] : iv_ruleAssociationSpecification= ruleAssociationSpecification EOF ;
    public final EObject entryRuleAssociationSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssociationSpecification = null;


        try {
            // InternalSocialRequest.g:604:65: (iv_ruleAssociationSpecification= ruleAssociationSpecification EOF )
            // InternalSocialRequest.g:605:2: iv_ruleAssociationSpecification= ruleAssociationSpecification EOF
            {
             newCompositeNode(grammarAccess.getAssociationSpecificationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAssociationSpecification=ruleAssociationSpecification();

            state._fsp--;

             current =iv_ruleAssociationSpecification; 
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
    // $ANTLR end "entryRuleAssociationSpecification"


    // $ANTLR start "ruleAssociationSpecification"
    // InternalSocialRequest.g:611:1: ruleAssociationSpecification returns [EObject current=null] : ( (otherlv_0= 'mappedBy:' ( (lv_mappedBy_1_0= RULE_ID ) ) ) | (otherlv_2= 'fetch:' ( (lv_fetchType_3_0= RULE_FETCH_TYPE ) ) ) ) ;
    public final EObject ruleAssociationSpecification() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_mappedBy_1_0=null;
        Token otherlv_2=null;
        Token lv_fetchType_3_0=null;


        	enterRule();

        try {
            // InternalSocialRequest.g:617:2: ( ( (otherlv_0= 'mappedBy:' ( (lv_mappedBy_1_0= RULE_ID ) ) ) | (otherlv_2= 'fetch:' ( (lv_fetchType_3_0= RULE_FETCH_TYPE ) ) ) ) )
            // InternalSocialRequest.g:618:2: ( (otherlv_0= 'mappedBy:' ( (lv_mappedBy_1_0= RULE_ID ) ) ) | (otherlv_2= 'fetch:' ( (lv_fetchType_3_0= RULE_FETCH_TYPE ) ) ) )
            {
            // InternalSocialRequest.g:618:2: ( (otherlv_0= 'mappedBy:' ( (lv_mappedBy_1_0= RULE_ID ) ) ) | (otherlv_2= 'fetch:' ( (lv_fetchType_3_0= RULE_FETCH_TYPE ) ) ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==31) ) {
                alt14=1;
            }
            else if ( (LA14_0==32) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalSocialRequest.g:619:3: (otherlv_0= 'mappedBy:' ( (lv_mappedBy_1_0= RULE_ID ) ) )
                    {
                    // InternalSocialRequest.g:619:3: (otherlv_0= 'mappedBy:' ( (lv_mappedBy_1_0= RULE_ID ) ) )
                    // InternalSocialRequest.g:620:4: otherlv_0= 'mappedBy:' ( (lv_mappedBy_1_0= RULE_ID ) )
                    {
                    otherlv_0=(Token)match(input,31,FOLLOW_5); 

                    				newLeafNode(otherlv_0, grammarAccess.getAssociationSpecificationAccess().getMappedByKeyword_0_0());
                    			
                    // InternalSocialRequest.g:624:4: ( (lv_mappedBy_1_0= RULE_ID ) )
                    // InternalSocialRequest.g:625:5: (lv_mappedBy_1_0= RULE_ID )
                    {
                    // InternalSocialRequest.g:625:5: (lv_mappedBy_1_0= RULE_ID )
                    // InternalSocialRequest.g:626:6: lv_mappedBy_1_0= RULE_ID
                    {
                    lv_mappedBy_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(lv_mappedBy_1_0, grammarAccess.getAssociationSpecificationAccess().getMappedByIDTerminalRuleCall_0_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAssociationSpecificationRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"mappedBy",
                    							lv_mappedBy_1_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSocialRequest.g:644:3: (otherlv_2= 'fetch:' ( (lv_fetchType_3_0= RULE_FETCH_TYPE ) ) )
                    {
                    // InternalSocialRequest.g:644:3: (otherlv_2= 'fetch:' ( (lv_fetchType_3_0= RULE_FETCH_TYPE ) ) )
                    // InternalSocialRequest.g:645:4: otherlv_2= 'fetch:' ( (lv_fetchType_3_0= RULE_FETCH_TYPE ) )
                    {
                    otherlv_2=(Token)match(input,32,FOLLOW_22); 

                    				newLeafNode(otherlv_2, grammarAccess.getAssociationSpecificationAccess().getFetchKeyword_1_0());
                    			
                    // InternalSocialRequest.g:649:4: ( (lv_fetchType_3_0= RULE_FETCH_TYPE ) )
                    // InternalSocialRequest.g:650:5: (lv_fetchType_3_0= RULE_FETCH_TYPE )
                    {
                    // InternalSocialRequest.g:650:5: (lv_fetchType_3_0= RULE_FETCH_TYPE )
                    // InternalSocialRequest.g:651:6: lv_fetchType_3_0= RULE_FETCH_TYPE
                    {
                    lv_fetchType_3_0=(Token)match(input,RULE_FETCH_TYPE,FOLLOW_2); 

                    						newLeafNode(lv_fetchType_3_0, grammarAccess.getAssociationSpecificationAccess().getFetchTypeFETCH_TYPETerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAssociationSpecificationRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"fetchType",
                    							lv_fetchType_3_0,
                    							"org.xtext.example.mydsl.SocialRequest.FETCH_TYPE");
                    					

                    }


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
    // $ANTLR end "ruleAssociationSpecification"


    // $ANTLR start "entryRuleRepository"
    // InternalSocialRequest.g:672:1: entryRuleRepository returns [EObject current=null] : iv_ruleRepository= ruleRepository EOF ;
    public final EObject entryRuleRepository() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRepository = null;


        try {
            // InternalSocialRequest.g:672:51: (iv_ruleRepository= ruleRepository EOF )
            // InternalSocialRequest.g:673:2: iv_ruleRepository= ruleRepository EOF
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
    // InternalSocialRequest.g:679:1: ruleRepository returns [EObject current=null] : (otherlv_0= 'Repository' ( (otherlv_1= RULE_ID ) ) otherlv_2= '{' ( (lv_queries_3_0= ruleQuery ) )+ otherlv_4= '}' ) ;
    public final EObject ruleRepository() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_queries_3_0 = null;



        	enterRule();

        try {
            // InternalSocialRequest.g:685:2: ( (otherlv_0= 'Repository' ( (otherlv_1= RULE_ID ) ) otherlv_2= '{' ( (lv_queries_3_0= ruleQuery ) )+ otherlv_4= '}' ) )
            // InternalSocialRequest.g:686:2: (otherlv_0= 'Repository' ( (otherlv_1= RULE_ID ) ) otherlv_2= '{' ( (lv_queries_3_0= ruleQuery ) )+ otherlv_4= '}' )
            {
            // InternalSocialRequest.g:686:2: (otherlv_0= 'Repository' ( (otherlv_1= RULE_ID ) ) otherlv_2= '{' ( (lv_queries_3_0= ruleQuery ) )+ otherlv_4= '}' )
            // InternalSocialRequest.g:687:3: otherlv_0= 'Repository' ( (otherlv_1= RULE_ID ) ) otherlv_2= '{' ( (lv_queries_3_0= ruleQuery ) )+ otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,33,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getRepositoryAccess().getRepositoryKeyword_0());
            		
            // InternalSocialRequest.g:691:3: ( (otherlv_1= RULE_ID ) )
            // InternalSocialRequest.g:692:4: (otherlv_1= RULE_ID )
            {
            // InternalSocialRequest.g:692:4: (otherlv_1= RULE_ID )
            // InternalSocialRequest.g:693:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRepositoryRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(otherlv_1, grammarAccess.getRepositoryAccess().getEntityEntityCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,18,FOLLOW_23); 

            			newLeafNode(otherlv_2, grammarAccess.getRepositoryAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalSocialRequest.g:708:3: ( (lv_queries_3_0= ruleQuery ) )+
            int cnt15=0;
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==34) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalSocialRequest.g:709:4: (lv_queries_3_0= ruleQuery )
            	    {
            	    // InternalSocialRequest.g:709:4: (lv_queries_3_0= ruleQuery )
            	    // InternalSocialRequest.g:710:5: lv_queries_3_0= ruleQuery
            	    {

            	    					newCompositeNode(grammarAccess.getRepositoryAccess().getQueriesQueryParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_24);
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
            	    if ( cnt15 >= 1 ) break loop15;
                        EarlyExitException eee =
                            new EarlyExitException(15, input);
                        throw eee;
                }
                cnt15++;
            } while (true);

            otherlv_4=(Token)match(input,19,FOLLOW_2); 

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
    // InternalSocialRequest.g:735:1: entryRuleQuery returns [EObject current=null] : iv_ruleQuery= ruleQuery EOF ;
    public final EObject entryRuleQuery() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuery = null;


        try {
            // InternalSocialRequest.g:735:46: (iv_ruleQuery= ruleQuery EOF )
            // InternalSocialRequest.g:736:2: iv_ruleQuery= ruleQuery EOF
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
    // InternalSocialRequest.g:742:1: ruleQuery returns [EObject current=null] : (otherlv_0= 'query' ( (lv_name_1_0= RULE_ID ) ) ( (lv_isList_2_0= ': list' ) )? (otherlv_3= '{' ( (lv_params_4_0= ruleParam ) )* ( (lv_sqlQuery_5_0= ruleSQLQuery ) )? otherlv_6= '}' ) ) ;
    public final EObject ruleQuery() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_isList_2_0=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        EObject lv_params_4_0 = null;

        AntlrDatatypeRuleToken lv_sqlQuery_5_0 = null;



        	enterRule();

        try {
            // InternalSocialRequest.g:748:2: ( (otherlv_0= 'query' ( (lv_name_1_0= RULE_ID ) ) ( (lv_isList_2_0= ': list' ) )? (otherlv_3= '{' ( (lv_params_4_0= ruleParam ) )* ( (lv_sqlQuery_5_0= ruleSQLQuery ) )? otherlv_6= '}' ) ) )
            // InternalSocialRequest.g:749:2: (otherlv_0= 'query' ( (lv_name_1_0= RULE_ID ) ) ( (lv_isList_2_0= ': list' ) )? (otherlv_3= '{' ( (lv_params_4_0= ruleParam ) )* ( (lv_sqlQuery_5_0= ruleSQLQuery ) )? otherlv_6= '}' ) )
            {
            // InternalSocialRequest.g:749:2: (otherlv_0= 'query' ( (lv_name_1_0= RULE_ID ) ) ( (lv_isList_2_0= ': list' ) )? (otherlv_3= '{' ( (lv_params_4_0= ruleParam ) )* ( (lv_sqlQuery_5_0= ruleSQLQuery ) )? otherlv_6= '}' ) )
            // InternalSocialRequest.g:750:3: otherlv_0= 'query' ( (lv_name_1_0= RULE_ID ) ) ( (lv_isList_2_0= ': list' ) )? (otherlv_3= '{' ( (lv_params_4_0= ruleParam ) )* ( (lv_sqlQuery_5_0= ruleSQLQuery ) )? otherlv_6= '}' )
            {
            otherlv_0=(Token)match(input,34,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getQueryAccess().getQueryKeyword_0());
            		
            // InternalSocialRequest.g:754:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSocialRequest.g:755:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSocialRequest.g:755:4: (lv_name_1_0= RULE_ID )
            // InternalSocialRequest.g:756:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_25); 

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

            // InternalSocialRequest.g:772:3: ( (lv_isList_2_0= ': list' ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==35) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalSocialRequest.g:773:4: (lv_isList_2_0= ': list' )
                    {
                    // InternalSocialRequest.g:773:4: (lv_isList_2_0= ': list' )
                    // InternalSocialRequest.g:774:5: lv_isList_2_0= ': list'
                    {
                    lv_isList_2_0=(Token)match(input,35,FOLLOW_7); 

                    					newLeafNode(lv_isList_2_0, grammarAccess.getQueryAccess().getIsListListKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getQueryRule());
                    					}
                    					setWithLastConsumed(current, "isList", true, ": list");
                    				

                    }


                    }
                    break;

            }

            // InternalSocialRequest.g:786:3: (otherlv_3= '{' ( (lv_params_4_0= ruleParam ) )* ( (lv_sqlQuery_5_0= ruleSQLQuery ) )? otherlv_6= '}' )
            // InternalSocialRequest.g:787:4: otherlv_3= '{' ( (lv_params_4_0= ruleParam ) )* ( (lv_sqlQuery_5_0= ruleSQLQuery ) )? otherlv_6= '}'
            {
            otherlv_3=(Token)match(input,18,FOLLOW_26); 

            				newLeafNode(otherlv_3, grammarAccess.getQueryAccess().getLeftCurlyBracketKeyword_3_0());
            			
            // InternalSocialRequest.g:791:4: ( (lv_params_4_0= ruleParam ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==36) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalSocialRequest.g:792:5: (lv_params_4_0= ruleParam )
            	    {
            	    // InternalSocialRequest.g:792:5: (lv_params_4_0= ruleParam )
            	    // InternalSocialRequest.g:793:6: lv_params_4_0= ruleParam
            	    {

            	    						newCompositeNode(grammarAccess.getQueryAccess().getParamsParamParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_26);
            	    lv_params_4_0=ruleParam();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getQueryRule());
            	    						}
            	    						add(
            	    							current,
            	    							"params",
            	    							lv_params_4_0,
            	    							"org.xtext.example.mydsl.SocialRequest.Param");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            // InternalSocialRequest.g:810:4: ( (lv_sqlQuery_5_0= ruleSQLQuery ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==37) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalSocialRequest.g:811:5: (lv_sqlQuery_5_0= ruleSQLQuery )
                    {
                    // InternalSocialRequest.g:811:5: (lv_sqlQuery_5_0= ruleSQLQuery )
                    // InternalSocialRequest.g:812:6: lv_sqlQuery_5_0= ruleSQLQuery
                    {

                    						newCompositeNode(grammarAccess.getQueryAccess().getSqlQuerySQLQueryParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_27);
                    lv_sqlQuery_5_0=ruleSQLQuery();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getQueryRule());
                    						}
                    						set(
                    							current,
                    							"sqlQuery",
                    							lv_sqlQuery_5_0,
                    							"org.xtext.example.mydsl.SocialRequest.SQLQuery");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,19,FOLLOW_2); 

            				newLeafNode(otherlv_6, grammarAccess.getQueryAccess().getRightCurlyBracketKeyword_3_3());
            			

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
    // InternalSocialRequest.g:838:1: entryRuleParam returns [EObject current=null] : iv_ruleParam= ruleParam EOF ;
    public final EObject entryRuleParam() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParam = null;


        try {
            // InternalSocialRequest.g:838:46: (iv_ruleParam= ruleParam EOF )
            // InternalSocialRequest.g:839:2: iv_ruleParam= ruleParam EOF
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
    // InternalSocialRequest.g:845:1: ruleParam returns [EObject current=null] : (otherlv_0= 'param' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_DATA_TYPE ) ) ) ;
    public final EObject ruleParam() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalSocialRequest.g:851:2: ( (otherlv_0= 'param' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_DATA_TYPE ) ) ) )
            // InternalSocialRequest.g:852:2: (otherlv_0= 'param' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_DATA_TYPE ) ) )
            {
            // InternalSocialRequest.g:852:2: (otherlv_0= 'param' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_DATA_TYPE ) ) )
            // InternalSocialRequest.g:853:3: otherlv_0= 'param' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_DATA_TYPE ) )
            {
            otherlv_0=(Token)match(input,36,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getParamAccess().getParamKeyword_0());
            		
            // InternalSocialRequest.g:857:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSocialRequest.g:858:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSocialRequest.g:858:4: (lv_name_1_0= RULE_ID )
            // InternalSocialRequest.g:859:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(lv_name_1_0, grammarAccess.getParamAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getParamRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,20,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getParamAccess().getColonKeyword_2());
            		
            // InternalSocialRequest.g:879:3: ( (otherlv_3= RULE_DATA_TYPE ) )
            // InternalSocialRequest.g:880:4: (otherlv_3= RULE_DATA_TYPE )
            {
            // InternalSocialRequest.g:880:4: (otherlv_3= RULE_DATA_TYPE )
            // InternalSocialRequest.g:881:5: otherlv_3= RULE_DATA_TYPE
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getParamRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_DATA_TYPE,FOLLOW_2); 

            					newLeafNode(otherlv_3, grammarAccess.getParamAccess().getTypeEntityCrossReference_3_0());
            				

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
    // InternalSocialRequest.g:896:1: entryRuleSQLQuery returns [String current=null] : iv_ruleSQLQuery= ruleSQLQuery EOF ;
    public final String entryRuleSQLQuery() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSQLQuery = null;


        try {
            // InternalSocialRequest.g:896:48: (iv_ruleSQLQuery= ruleSQLQuery EOF )
            // InternalSocialRequest.g:897:2: iv_ruleSQLQuery= ruleSQLQuery EOF
            {
             newCompositeNode(grammarAccess.getSQLQueryRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSQLQuery=ruleSQLQuery();

            state._fsp--;

             current =iv_ruleSQLQuery.getText(); 
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
    // InternalSocialRequest.g:903:1: ruleSQLQuery returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'Kek' ;
    public final AntlrDatatypeRuleToken ruleSQLQuery() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalSocialRequest.g:909:2: (kw= 'Kek' )
            // InternalSocialRequest.g:910:2: kw= 'Kek'
            {
            kw=(Token)match(input,37,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getSQLQueryAccess().getKekKeyword());
            	

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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000200010002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000080030L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000C40002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000180280000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x000000007C000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x000000007C080000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000400080000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000800040000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000003000080000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000080000L});

}
