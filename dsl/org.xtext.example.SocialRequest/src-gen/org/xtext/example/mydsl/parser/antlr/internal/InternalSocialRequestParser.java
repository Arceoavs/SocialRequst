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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_ASSOCIATION", "RULE_DATA_TYPE", "RULE_FETCH_TYPE", "RULE_GENERATION_TYPE", "RULE_POSSIBLY_SIGNED_INT", "RULE_STRING", "RULE_JOIN_TYPE", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Entity'", "'implements UserDetails'", "'{'", "'}'", "':'", "'mappedBy:'", "'fetch:'", "'validations {'", "'LOB'", "'ID'", "'('", "')'", "'min:'", "'max:'", "'pattern:'", "'not-null'", "'not-blank'", "'Repository'", "'query'", "': list'", "'params {'", "'SELECT'", "'DISTINCT'", "'FROM {'", "'ON {'", "'WHERE {'", "'ORDER BY {'"
    };
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

                if ( (LA1_0==17) ) {
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

                if ( (LA2_0==34) ) {
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
            otherlv_0=(Token)match(input,17,FOLLOW_5); 

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

            if ( (LA3_0==18) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalSocialRequest.g:159:4: (lv_hasUserDetails_2_0= 'implements UserDetails' )
                    {
                    // InternalSocialRequest.g:159:4: (lv_hasUserDetails_2_0= 'implements UserDetails' )
                    // InternalSocialRequest.g:160:5: lv_hasUserDetails_2_0= 'implements UserDetails'
                    {
                    lv_hasUserDetails_2_0=(Token)match(input,18,FOLLOW_7); 

                    					newLeafNode(lv_hasUserDetails_2_0, grammarAccess.getEntityAccess().getHasUserDetailsImplementsUserDetailsKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getEntityRule());
                    					}
                    					setWithLastConsumed(current, "hasUserDetails", true, "implements UserDetails");
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,19,FOLLOW_8); 

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

            otherlv_5=(Token)match(input,20,FOLLOW_2); 

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
    // InternalSocialRequest.g:210:1: ruleAttribute returns [EObject current=null] : ( ( (lv_association_0_0= RULE_ASSOCIATION ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_DATA_TYPE ) ) ( (lv_modifier_4_0= ruleModifier ) )? (otherlv_5= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_7= 'mappedBy:' ( (lv_mappedBy_8_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'fetch:' ( (lv_fetchType_10_0= RULE_FETCH_TYPE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'validations {' ( (lv_validations_12_0= ruleValidation ) )+ otherlv_13= '}' ) ) ) ) )* ) ) ) otherlv_14= '}' )? ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_association_0_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token lv_mappedBy_8_0=null;
        Token otherlv_9=null;
        Token lv_fetchType_10_0=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        EObject lv_modifier_4_0 = null;

        EObject lv_validations_12_0 = null;



        	enterRule();

        try {
            // InternalSocialRequest.g:216:2: ( ( ( (lv_association_0_0= RULE_ASSOCIATION ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_DATA_TYPE ) ) ( (lv_modifier_4_0= ruleModifier ) )? (otherlv_5= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_7= 'mappedBy:' ( (lv_mappedBy_8_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'fetch:' ( (lv_fetchType_10_0= RULE_FETCH_TYPE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'validations {' ( (lv_validations_12_0= ruleValidation ) )+ otherlv_13= '}' ) ) ) ) )* ) ) ) otherlv_14= '}' )? ) )
            // InternalSocialRequest.g:217:2: ( ( (lv_association_0_0= RULE_ASSOCIATION ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_DATA_TYPE ) ) ( (lv_modifier_4_0= ruleModifier ) )? (otherlv_5= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_7= 'mappedBy:' ( (lv_mappedBy_8_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'fetch:' ( (lv_fetchType_10_0= RULE_FETCH_TYPE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'validations {' ( (lv_validations_12_0= ruleValidation ) )+ otherlv_13= '}' ) ) ) ) )* ) ) ) otherlv_14= '}' )? )
            {
            // InternalSocialRequest.g:217:2: ( ( (lv_association_0_0= RULE_ASSOCIATION ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_DATA_TYPE ) ) ( (lv_modifier_4_0= ruleModifier ) )? (otherlv_5= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_7= 'mappedBy:' ( (lv_mappedBy_8_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'fetch:' ( (lv_fetchType_10_0= RULE_FETCH_TYPE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'validations {' ( (lv_validations_12_0= ruleValidation ) )+ otherlv_13= '}' ) ) ) ) )* ) ) ) otherlv_14= '}' )? )
            // InternalSocialRequest.g:218:3: ( (lv_association_0_0= RULE_ASSOCIATION ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_DATA_TYPE ) ) ( (lv_modifier_4_0= ruleModifier ) )? (otherlv_5= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_7= 'mappedBy:' ( (lv_mappedBy_8_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'fetch:' ( (lv_fetchType_10_0= RULE_FETCH_TYPE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'validations {' ( (lv_validations_12_0= ruleValidation ) )+ otherlv_13= '}' ) ) ) ) )* ) ) ) otherlv_14= '}' )?
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

            otherlv_2=(Token)match(input,21,FOLLOW_11); 

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

            if ( ((LA6_0>=25 && LA6_0<=26)) ) {
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

            // InternalSocialRequest.g:290:3: (otherlv_5= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_7= 'mappedBy:' ( (lv_mappedBy_8_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'fetch:' ( (lv_fetchType_10_0= RULE_FETCH_TYPE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'validations {' ( (lv_validations_12_0= ruleValidation ) )+ otherlv_13= '}' ) ) ) ) )* ) ) ) otherlv_14= '}' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==19) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalSocialRequest.g:291:4: otherlv_5= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_7= 'mappedBy:' ( (lv_mappedBy_8_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'fetch:' ( (lv_fetchType_10_0= RULE_FETCH_TYPE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'validations {' ( (lv_validations_12_0= ruleValidation ) )+ otherlv_13= '}' ) ) ) ) )* ) ) ) otherlv_14= '}'
                    {
                    otherlv_5=(Token)match(input,19,FOLLOW_14); 

                    				newLeafNode(otherlv_5, grammarAccess.getAttributeAccess().getLeftCurlyBracketKeyword_5_0());
                    			
                    // InternalSocialRequest.g:295:4: ( ( ( ( ({...}? => ( ({...}? => (otherlv_7= 'mappedBy:' ( (lv_mappedBy_8_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'fetch:' ( (lv_fetchType_10_0= RULE_FETCH_TYPE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'validations {' ( (lv_validations_12_0= ruleValidation ) )+ otherlv_13= '}' ) ) ) ) )* ) ) )
                    // InternalSocialRequest.g:296:5: ( ( ( ({...}? => ( ({...}? => (otherlv_7= 'mappedBy:' ( (lv_mappedBy_8_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'fetch:' ( (lv_fetchType_10_0= RULE_FETCH_TYPE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'validations {' ( (lv_validations_12_0= ruleValidation ) )+ otherlv_13= '}' ) ) ) ) )* ) )
                    {
                    // InternalSocialRequest.g:296:5: ( ( ( ({...}? => ( ({...}? => (otherlv_7= 'mappedBy:' ( (lv_mappedBy_8_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'fetch:' ( (lv_fetchType_10_0= RULE_FETCH_TYPE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'validations {' ( (lv_validations_12_0= ruleValidation ) )+ otherlv_13= '}' ) ) ) ) )* ) )
                    // InternalSocialRequest.g:297:6: ( ( ({...}? => ( ({...}? => (otherlv_7= 'mappedBy:' ( (lv_mappedBy_8_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'fetch:' ( (lv_fetchType_10_0= RULE_FETCH_TYPE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'validations {' ( (lv_validations_12_0= ruleValidation ) )+ otherlv_13= '}' ) ) ) ) )* )
                    {
                     
                    					  getUnorderedGroupHelper().enter(grammarAccess.getAttributeAccess().getUnorderedGroup_5_1());
                    					
                    // InternalSocialRequest.g:300:6: ( ( ({...}? => ( ({...}? => (otherlv_7= 'mappedBy:' ( (lv_mappedBy_8_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'fetch:' ( (lv_fetchType_10_0= RULE_FETCH_TYPE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'validations {' ( (lv_validations_12_0= ruleValidation ) )+ otherlv_13= '}' ) ) ) ) )* )
                    // InternalSocialRequest.g:301:7: ( ({...}? => ( ({...}? => (otherlv_7= 'mappedBy:' ( (lv_mappedBy_8_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'fetch:' ( (lv_fetchType_10_0= RULE_FETCH_TYPE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'validations {' ( (lv_validations_12_0= ruleValidation ) )+ otherlv_13= '}' ) ) ) ) )*
                    {
                    // InternalSocialRequest.g:301:7: ( ({...}? => ( ({...}? => (otherlv_7= 'mappedBy:' ( (lv_mappedBy_8_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'fetch:' ( (lv_fetchType_10_0= RULE_FETCH_TYPE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'validations {' ( (lv_validations_12_0= ruleValidation ) )+ otherlv_13= '}' ) ) ) ) )*
                    loop8:
                    do {
                        int alt8=4;
                        int LA8_0 = input.LA(1);

                        if ( LA8_0 == 22 && getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_1(), 0) ) {
                            alt8=1;
                        }
                        else if ( LA8_0 == 23 && getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_1(), 1) ) {
                            alt8=2;
                        }
                        else if ( LA8_0 == 24 && getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_1(), 2) ) {
                            alt8=3;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalSocialRequest.g:302:5: ({...}? => ( ({...}? => (otherlv_7= 'mappedBy:' ( (lv_mappedBy_8_0= RULE_ID ) ) ) ) ) )
                    	    {
                    	    // InternalSocialRequest.g:302:5: ({...}? => ( ({...}? => (otherlv_7= 'mappedBy:' ( (lv_mappedBy_8_0= RULE_ID ) ) ) ) ) )
                    	    // InternalSocialRequest.g:303:6: {...}? => ( ({...}? => (otherlv_7= 'mappedBy:' ( (lv_mappedBy_8_0= RULE_ID ) ) ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_1(), 0) ) {
                    	        throw new FailedPredicateException(input, "ruleAttribute", "getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_1(), 0)");
                    	    }
                    	    // InternalSocialRequest.g:303:109: ( ({...}? => (otherlv_7= 'mappedBy:' ( (lv_mappedBy_8_0= RULE_ID ) ) ) ) )
                    	    // InternalSocialRequest.g:304:7: ({...}? => (otherlv_7= 'mappedBy:' ( (lv_mappedBy_8_0= RULE_ID ) ) ) )
                    	    {

                    	    							getUnorderedGroupHelper().select(grammarAccess.getAttributeAccess().getUnorderedGroup_5_1(), 0);
                    	    						
                    	    // InternalSocialRequest.g:307:10: ({...}? => (otherlv_7= 'mappedBy:' ( (lv_mappedBy_8_0= RULE_ID ) ) ) )
                    	    // InternalSocialRequest.g:307:11: {...}? => (otherlv_7= 'mappedBy:' ( (lv_mappedBy_8_0= RULE_ID ) ) )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleAttribute", "true");
                    	    }
                    	    // InternalSocialRequest.g:307:20: (otherlv_7= 'mappedBy:' ( (lv_mappedBy_8_0= RULE_ID ) ) )
                    	    // InternalSocialRequest.g:307:21: otherlv_7= 'mappedBy:' ( (lv_mappedBy_8_0= RULE_ID ) )
                    	    {
                    	    otherlv_7=(Token)match(input,22,FOLLOW_5); 

                    	    										newLeafNode(otherlv_7, grammarAccess.getAttributeAccess().getMappedByKeyword_5_1_0_0());
                    	    									
                    	    // InternalSocialRequest.g:311:10: ( (lv_mappedBy_8_0= RULE_ID ) )
                    	    // InternalSocialRequest.g:312:11: (lv_mappedBy_8_0= RULE_ID )
                    	    {
                    	    // InternalSocialRequest.g:312:11: (lv_mappedBy_8_0= RULE_ID )
                    	    // InternalSocialRequest.g:313:12: lv_mappedBy_8_0= RULE_ID
                    	    {
                    	    lv_mappedBy_8_0=(Token)match(input,RULE_ID,FOLLOW_14); 

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
                    	    // InternalSocialRequest.g:335:5: ({...}? => ( ({...}? => (otherlv_9= 'fetch:' ( (lv_fetchType_10_0= RULE_FETCH_TYPE ) ) ) ) ) )
                    	    {
                    	    // InternalSocialRequest.g:335:5: ({...}? => ( ({...}? => (otherlv_9= 'fetch:' ( (lv_fetchType_10_0= RULE_FETCH_TYPE ) ) ) ) ) )
                    	    // InternalSocialRequest.g:336:6: {...}? => ( ({...}? => (otherlv_9= 'fetch:' ( (lv_fetchType_10_0= RULE_FETCH_TYPE ) ) ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_1(), 1) ) {
                    	        throw new FailedPredicateException(input, "ruleAttribute", "getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_1(), 1)");
                    	    }
                    	    // InternalSocialRequest.g:336:109: ( ({...}? => (otherlv_9= 'fetch:' ( (lv_fetchType_10_0= RULE_FETCH_TYPE ) ) ) ) )
                    	    // InternalSocialRequest.g:337:7: ({...}? => (otherlv_9= 'fetch:' ( (lv_fetchType_10_0= RULE_FETCH_TYPE ) ) ) )
                    	    {

                    	    							getUnorderedGroupHelper().select(grammarAccess.getAttributeAccess().getUnorderedGroup_5_1(), 1);
                    	    						
                    	    // InternalSocialRequest.g:340:10: ({...}? => (otherlv_9= 'fetch:' ( (lv_fetchType_10_0= RULE_FETCH_TYPE ) ) ) )
                    	    // InternalSocialRequest.g:340:11: {...}? => (otherlv_9= 'fetch:' ( (lv_fetchType_10_0= RULE_FETCH_TYPE ) ) )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleAttribute", "true");
                    	    }
                    	    // InternalSocialRequest.g:340:20: (otherlv_9= 'fetch:' ( (lv_fetchType_10_0= RULE_FETCH_TYPE ) ) )
                    	    // InternalSocialRequest.g:340:21: otherlv_9= 'fetch:' ( (lv_fetchType_10_0= RULE_FETCH_TYPE ) )
                    	    {
                    	    otherlv_9=(Token)match(input,23,FOLLOW_15); 

                    	    										newLeafNode(otherlv_9, grammarAccess.getAttributeAccess().getFetchKeyword_5_1_1_0());
                    	    									
                    	    // InternalSocialRequest.g:344:10: ( (lv_fetchType_10_0= RULE_FETCH_TYPE ) )
                    	    // InternalSocialRequest.g:345:11: (lv_fetchType_10_0= RULE_FETCH_TYPE )
                    	    {
                    	    // InternalSocialRequest.g:345:11: (lv_fetchType_10_0= RULE_FETCH_TYPE )
                    	    // InternalSocialRequest.g:346:12: lv_fetchType_10_0= RULE_FETCH_TYPE
                    	    {
                    	    lv_fetchType_10_0=(Token)match(input,RULE_FETCH_TYPE,FOLLOW_14); 

                    	    												newLeafNode(lv_fetchType_10_0, grammarAccess.getAttributeAccess().getFetchTypeFETCH_TYPETerminalRuleCall_5_1_1_1_0());
                    	    											

                    	    												if (current==null) {
                    	    													current = createModelElement(grammarAccess.getAttributeRule());
                    	    												}
                    	    												setWithLastConsumed(
                    	    													current,
                    	    													"fetchType",
                    	    													lv_fetchType_10_0,
                    	    													"org.xtext.example.mydsl.SocialRequest.FETCH_TYPE");
                    	    											

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
                    	    // InternalSocialRequest.g:368:5: ({...}? => ( ({...}? => (otherlv_11= 'validations {' ( (lv_validations_12_0= ruleValidation ) )+ otherlv_13= '}' ) ) ) )
                    	    {
                    	    // InternalSocialRequest.g:368:5: ({...}? => ( ({...}? => (otherlv_11= 'validations {' ( (lv_validations_12_0= ruleValidation ) )+ otherlv_13= '}' ) ) ) )
                    	    // InternalSocialRequest.g:369:6: {...}? => ( ({...}? => (otherlv_11= 'validations {' ( (lv_validations_12_0= ruleValidation ) )+ otherlv_13= '}' ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_1(), 2) ) {
                    	        throw new FailedPredicateException(input, "ruleAttribute", "getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_1(), 2)");
                    	    }
                    	    // InternalSocialRequest.g:369:109: ( ({...}? => (otherlv_11= 'validations {' ( (lv_validations_12_0= ruleValidation ) )+ otherlv_13= '}' ) ) )
                    	    // InternalSocialRequest.g:370:7: ({...}? => (otherlv_11= 'validations {' ( (lv_validations_12_0= ruleValidation ) )+ otherlv_13= '}' ) )
                    	    {

                    	    							getUnorderedGroupHelper().select(grammarAccess.getAttributeAccess().getUnorderedGroup_5_1(), 2);
                    	    						
                    	    // InternalSocialRequest.g:373:10: ({...}? => (otherlv_11= 'validations {' ( (lv_validations_12_0= ruleValidation ) )+ otherlv_13= '}' ) )
                    	    // InternalSocialRequest.g:373:11: {...}? => (otherlv_11= 'validations {' ( (lv_validations_12_0= ruleValidation ) )+ otherlv_13= '}' )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleAttribute", "true");
                    	    }
                    	    // InternalSocialRequest.g:373:20: (otherlv_11= 'validations {' ( (lv_validations_12_0= ruleValidation ) )+ otherlv_13= '}' )
                    	    // InternalSocialRequest.g:373:21: otherlv_11= 'validations {' ( (lv_validations_12_0= ruleValidation ) )+ otherlv_13= '}'
                    	    {
                    	    otherlv_11=(Token)match(input,24,FOLLOW_16); 

                    	    										newLeafNode(otherlv_11, grammarAccess.getAttributeAccess().getValidationsKeyword_5_1_2_0());
                    	    									
                    	    // InternalSocialRequest.g:377:10: ( (lv_validations_12_0= ruleValidation ) )+
                    	    int cnt7=0;
                    	    loop7:
                    	    do {
                    	        int alt7=2;
                    	        int LA7_0 = input.LA(1);

                    	        if ( ((LA7_0>=29 && LA7_0<=33)) ) {
                    	            alt7=1;
                    	        }


                    	        switch (alt7) {
                    	    	case 1 :
                    	    	    // InternalSocialRequest.g:378:11: (lv_validations_12_0= ruleValidation )
                    	    	    {
                    	    	    // InternalSocialRequest.g:378:11: (lv_validations_12_0= ruleValidation )
                    	    	    // InternalSocialRequest.g:379:12: lv_validations_12_0= ruleValidation
                    	    	    {

                    	    	    												newCompositeNode(grammarAccess.getAttributeAccess().getValidationsValidationParserRuleCall_5_1_2_1_0());
                    	    	    											
                    	    	    pushFollow(FOLLOW_17);
                    	    	    lv_validations_12_0=ruleValidation();

                    	    	    state._fsp--;


                    	    	    												if (current==null) {
                    	    	    													current = createModelElementForParent(grammarAccess.getAttributeRule());
                    	    	    												}
                    	    	    												add(
                    	    	    													current,
                    	    	    													"validations",
                    	    	    													lv_validations_12_0,
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

                    	    otherlv_13=(Token)match(input,20,FOLLOW_14); 

                    	    										newLeafNode(otherlv_13, grammarAccess.getAttributeAccess().getRightCurlyBracketKeyword_5_1_2_2());
                    	    									

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

                    otherlv_14=(Token)match(input,20,FOLLOW_2); 

                    				newLeafNode(otherlv_14, grammarAccess.getAttributeAccess().getRightCurlyBracketKeyword_5_2());
                    			

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
    // InternalSocialRequest.g:422:1: entryRuleModifier returns [EObject current=null] : iv_ruleModifier= ruleModifier EOF ;
    public final EObject entryRuleModifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModifier = null;


        try {
            // InternalSocialRequest.g:422:49: (iv_ruleModifier= ruleModifier EOF )
            // InternalSocialRequest.g:423:2: iv_ruleModifier= ruleModifier EOF
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
    // InternalSocialRequest.g:429:1: ruleModifier returns [EObject current=null] : ( ( () otherlv_1= 'LOB' ) | this_Identification_2= ruleIdentification ) ;
    public final EObject ruleModifier() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject this_Identification_2 = null;



        	enterRule();

        try {
            // InternalSocialRequest.g:435:2: ( ( ( () otherlv_1= 'LOB' ) | this_Identification_2= ruleIdentification ) )
            // InternalSocialRequest.g:436:2: ( ( () otherlv_1= 'LOB' ) | this_Identification_2= ruleIdentification )
            {
            // InternalSocialRequest.g:436:2: ( ( () otherlv_1= 'LOB' ) | this_Identification_2= ruleIdentification )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==25) ) {
                alt10=1;
            }
            else if ( (LA10_0==26) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalSocialRequest.g:437:3: ( () otherlv_1= 'LOB' )
                    {
                    // InternalSocialRequest.g:437:3: ( () otherlv_1= 'LOB' )
                    // InternalSocialRequest.g:438:4: () otherlv_1= 'LOB'
                    {
                    // InternalSocialRequest.g:438:4: ()
                    // InternalSocialRequest.g:439:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getModifierAccess().getModifierAction_0_0(),
                    						current);
                    				

                    }

                    otherlv_1=(Token)match(input,25,FOLLOW_2); 

                    				newLeafNode(otherlv_1, grammarAccess.getModifierAccess().getLOBKeyword_0_1());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSocialRequest.g:451:3: this_Identification_2= ruleIdentification
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
    // InternalSocialRequest.g:463:1: entryRuleIdentification returns [EObject current=null] : iv_ruleIdentification= ruleIdentification EOF ;
    public final EObject entryRuleIdentification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIdentification = null;


        try {
            // InternalSocialRequest.g:463:55: (iv_ruleIdentification= ruleIdentification EOF )
            // InternalSocialRequest.g:464:2: iv_ruleIdentification= ruleIdentification EOF
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
    // InternalSocialRequest.g:470:1: ruleIdentification returns [EObject current=null] : ( () otherlv_1= 'ID' (otherlv_2= '(' ( (lv_generationType_3_0= RULE_GENERATION_TYPE ) ) otherlv_4= ')' )? ) ;
    public final EObject ruleIdentification() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_generationType_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalSocialRequest.g:476:2: ( ( () otherlv_1= 'ID' (otherlv_2= '(' ( (lv_generationType_3_0= RULE_GENERATION_TYPE ) ) otherlv_4= ')' )? ) )
            // InternalSocialRequest.g:477:2: ( () otherlv_1= 'ID' (otherlv_2= '(' ( (lv_generationType_3_0= RULE_GENERATION_TYPE ) ) otherlv_4= ')' )? )
            {
            // InternalSocialRequest.g:477:2: ( () otherlv_1= 'ID' (otherlv_2= '(' ( (lv_generationType_3_0= RULE_GENERATION_TYPE ) ) otherlv_4= ')' )? )
            // InternalSocialRequest.g:478:3: () otherlv_1= 'ID' (otherlv_2= '(' ( (lv_generationType_3_0= RULE_GENERATION_TYPE ) ) otherlv_4= ')' )?
            {
            // InternalSocialRequest.g:478:3: ()
            // InternalSocialRequest.g:479:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getIdentificationAccess().getIdentificationAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,26,FOLLOW_18); 

            			newLeafNode(otherlv_1, grammarAccess.getIdentificationAccess().getIDKeyword_1());
            		
            // InternalSocialRequest.g:489:3: (otherlv_2= '(' ( (lv_generationType_3_0= RULE_GENERATION_TYPE ) ) otherlv_4= ')' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==27) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalSocialRequest.g:490:4: otherlv_2= '(' ( (lv_generationType_3_0= RULE_GENERATION_TYPE ) ) otherlv_4= ')'
                    {
                    otherlv_2=(Token)match(input,27,FOLLOW_19); 

                    				newLeafNode(otherlv_2, grammarAccess.getIdentificationAccess().getLeftParenthesisKeyword_2_0());
                    			
                    // InternalSocialRequest.g:494:4: ( (lv_generationType_3_0= RULE_GENERATION_TYPE ) )
                    // InternalSocialRequest.g:495:5: (lv_generationType_3_0= RULE_GENERATION_TYPE )
                    {
                    // InternalSocialRequest.g:495:5: (lv_generationType_3_0= RULE_GENERATION_TYPE )
                    // InternalSocialRequest.g:496:6: lv_generationType_3_0= RULE_GENERATION_TYPE
                    {
                    lv_generationType_3_0=(Token)match(input,RULE_GENERATION_TYPE,FOLLOW_20); 

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

                    otherlv_4=(Token)match(input,28,FOLLOW_2); 

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
    // InternalSocialRequest.g:521:1: entryRuleValidation returns [EObject current=null] : iv_ruleValidation= ruleValidation EOF ;
    public final EObject entryRuleValidation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValidation = null;


        try {
            // InternalSocialRequest.g:521:51: (iv_ruleValidation= ruleValidation EOF )
            // InternalSocialRequest.g:522:2: iv_ruleValidation= ruleValidation EOF
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
    // InternalSocialRequest.g:528:1: ruleValidation returns [EObject current=null] : ( (otherlv_0= 'min:' ( (lv_min_1_0= RULE_POSSIBLY_SIGNED_INT ) ) ) | (otherlv_2= 'max:' ( (lv_max_3_0= RULE_POSSIBLY_SIGNED_INT ) ) ) | (otherlv_4= 'pattern:' ( (lv_regex_5_0= RULE_STRING ) ) ) | ( () otherlv_7= 'not-null' ) | ( () otherlv_9= 'not-blank' ) ) ;
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
            // InternalSocialRequest.g:534:2: ( ( (otherlv_0= 'min:' ( (lv_min_1_0= RULE_POSSIBLY_SIGNED_INT ) ) ) | (otherlv_2= 'max:' ( (lv_max_3_0= RULE_POSSIBLY_SIGNED_INT ) ) ) | (otherlv_4= 'pattern:' ( (lv_regex_5_0= RULE_STRING ) ) ) | ( () otherlv_7= 'not-null' ) | ( () otherlv_9= 'not-blank' ) ) )
            // InternalSocialRequest.g:535:2: ( (otherlv_0= 'min:' ( (lv_min_1_0= RULE_POSSIBLY_SIGNED_INT ) ) ) | (otherlv_2= 'max:' ( (lv_max_3_0= RULE_POSSIBLY_SIGNED_INT ) ) ) | (otherlv_4= 'pattern:' ( (lv_regex_5_0= RULE_STRING ) ) ) | ( () otherlv_7= 'not-null' ) | ( () otherlv_9= 'not-blank' ) )
            {
            // InternalSocialRequest.g:535:2: ( (otherlv_0= 'min:' ( (lv_min_1_0= RULE_POSSIBLY_SIGNED_INT ) ) ) | (otherlv_2= 'max:' ( (lv_max_3_0= RULE_POSSIBLY_SIGNED_INT ) ) ) | (otherlv_4= 'pattern:' ( (lv_regex_5_0= RULE_STRING ) ) ) | ( () otherlv_7= 'not-null' ) | ( () otherlv_9= 'not-blank' ) )
            int alt12=5;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt12=1;
                }
                break;
            case 30:
                {
                alt12=2;
                }
                break;
            case 31:
                {
                alt12=3;
                }
                break;
            case 32:
                {
                alt12=4;
                }
                break;
            case 33:
                {
                alt12=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalSocialRequest.g:536:3: (otherlv_0= 'min:' ( (lv_min_1_0= RULE_POSSIBLY_SIGNED_INT ) ) )
                    {
                    // InternalSocialRequest.g:536:3: (otherlv_0= 'min:' ( (lv_min_1_0= RULE_POSSIBLY_SIGNED_INT ) ) )
                    // InternalSocialRequest.g:537:4: otherlv_0= 'min:' ( (lv_min_1_0= RULE_POSSIBLY_SIGNED_INT ) )
                    {
                    otherlv_0=(Token)match(input,29,FOLLOW_21); 

                    				newLeafNode(otherlv_0, grammarAccess.getValidationAccess().getMinKeyword_0_0());
                    			
                    // InternalSocialRequest.g:541:4: ( (lv_min_1_0= RULE_POSSIBLY_SIGNED_INT ) )
                    // InternalSocialRequest.g:542:5: (lv_min_1_0= RULE_POSSIBLY_SIGNED_INT )
                    {
                    // InternalSocialRequest.g:542:5: (lv_min_1_0= RULE_POSSIBLY_SIGNED_INT )
                    // InternalSocialRequest.g:543:6: lv_min_1_0= RULE_POSSIBLY_SIGNED_INT
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
                    // InternalSocialRequest.g:561:3: (otherlv_2= 'max:' ( (lv_max_3_0= RULE_POSSIBLY_SIGNED_INT ) ) )
                    {
                    // InternalSocialRequest.g:561:3: (otherlv_2= 'max:' ( (lv_max_3_0= RULE_POSSIBLY_SIGNED_INT ) ) )
                    // InternalSocialRequest.g:562:4: otherlv_2= 'max:' ( (lv_max_3_0= RULE_POSSIBLY_SIGNED_INT ) )
                    {
                    otherlv_2=(Token)match(input,30,FOLLOW_21); 

                    				newLeafNode(otherlv_2, grammarAccess.getValidationAccess().getMaxKeyword_1_0());
                    			
                    // InternalSocialRequest.g:566:4: ( (lv_max_3_0= RULE_POSSIBLY_SIGNED_INT ) )
                    // InternalSocialRequest.g:567:5: (lv_max_3_0= RULE_POSSIBLY_SIGNED_INT )
                    {
                    // InternalSocialRequest.g:567:5: (lv_max_3_0= RULE_POSSIBLY_SIGNED_INT )
                    // InternalSocialRequest.g:568:6: lv_max_3_0= RULE_POSSIBLY_SIGNED_INT
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
                    // InternalSocialRequest.g:586:3: (otherlv_4= 'pattern:' ( (lv_regex_5_0= RULE_STRING ) ) )
                    {
                    // InternalSocialRequest.g:586:3: (otherlv_4= 'pattern:' ( (lv_regex_5_0= RULE_STRING ) ) )
                    // InternalSocialRequest.g:587:4: otherlv_4= 'pattern:' ( (lv_regex_5_0= RULE_STRING ) )
                    {
                    otherlv_4=(Token)match(input,31,FOLLOW_22); 

                    				newLeafNode(otherlv_4, grammarAccess.getValidationAccess().getPatternKeyword_2_0());
                    			
                    // InternalSocialRequest.g:591:4: ( (lv_regex_5_0= RULE_STRING ) )
                    // InternalSocialRequest.g:592:5: (lv_regex_5_0= RULE_STRING )
                    {
                    // InternalSocialRequest.g:592:5: (lv_regex_5_0= RULE_STRING )
                    // InternalSocialRequest.g:593:6: lv_regex_5_0= RULE_STRING
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
                    // InternalSocialRequest.g:611:3: ( () otherlv_7= 'not-null' )
                    {
                    // InternalSocialRequest.g:611:3: ( () otherlv_7= 'not-null' )
                    // InternalSocialRequest.g:612:4: () otherlv_7= 'not-null'
                    {
                    // InternalSocialRequest.g:612:4: ()
                    // InternalSocialRequest.g:613:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getValidationAccess().getValidationAction_3_0(),
                    						current);
                    				

                    }

                    otherlv_7=(Token)match(input,32,FOLLOW_2); 

                    				newLeafNode(otherlv_7, grammarAccess.getValidationAccess().getNotNullKeyword_3_1());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalSocialRequest.g:625:3: ( () otherlv_9= 'not-blank' )
                    {
                    // InternalSocialRequest.g:625:3: ( () otherlv_9= 'not-blank' )
                    // InternalSocialRequest.g:626:4: () otherlv_9= 'not-blank'
                    {
                    // InternalSocialRequest.g:626:4: ()
                    // InternalSocialRequest.g:627:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getValidationAccess().getValidationAction_4_0(),
                    						current);
                    				

                    }

                    otherlv_9=(Token)match(input,33,FOLLOW_2); 

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


    // $ANTLR start "entryRuleRepository"
    // InternalSocialRequest.g:642:1: entryRuleRepository returns [EObject current=null] : iv_ruleRepository= ruleRepository EOF ;
    public final EObject entryRuleRepository() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRepository = null;


        try {
            // InternalSocialRequest.g:642:51: (iv_ruleRepository= ruleRepository EOF )
            // InternalSocialRequest.g:643:2: iv_ruleRepository= ruleRepository EOF
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
    // InternalSocialRequest.g:649:1: ruleRepository returns [EObject current=null] : (otherlv_0= 'Repository' ( (otherlv_1= RULE_ID ) ) otherlv_2= '{' ( (lv_queries_3_0= ruleQuery ) )+ otherlv_4= '}' ) ;
    public final EObject ruleRepository() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_queries_3_0 = null;



        	enterRule();

        try {
            // InternalSocialRequest.g:655:2: ( (otherlv_0= 'Repository' ( (otherlv_1= RULE_ID ) ) otherlv_2= '{' ( (lv_queries_3_0= ruleQuery ) )+ otherlv_4= '}' ) )
            // InternalSocialRequest.g:656:2: (otherlv_0= 'Repository' ( (otherlv_1= RULE_ID ) ) otherlv_2= '{' ( (lv_queries_3_0= ruleQuery ) )+ otherlv_4= '}' )
            {
            // InternalSocialRequest.g:656:2: (otherlv_0= 'Repository' ( (otherlv_1= RULE_ID ) ) otherlv_2= '{' ( (lv_queries_3_0= ruleQuery ) )+ otherlv_4= '}' )
            // InternalSocialRequest.g:657:3: otherlv_0= 'Repository' ( (otherlv_1= RULE_ID ) ) otherlv_2= '{' ( (lv_queries_3_0= ruleQuery ) )+ otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,34,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getRepositoryAccess().getRepositoryKeyword_0());
            		
            // InternalSocialRequest.g:661:3: ( (otherlv_1= RULE_ID ) )
            // InternalSocialRequest.g:662:4: (otherlv_1= RULE_ID )
            {
            // InternalSocialRequest.g:662:4: (otherlv_1= RULE_ID )
            // InternalSocialRequest.g:663:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRepositoryRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(otherlv_1, grammarAccess.getRepositoryAccess().getEntityEntityCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,19,FOLLOW_23); 

            			newLeafNode(otherlv_2, grammarAccess.getRepositoryAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalSocialRequest.g:678:3: ( (lv_queries_3_0= ruleQuery ) )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==35) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalSocialRequest.g:679:4: (lv_queries_3_0= ruleQuery )
            	    {
            	    // InternalSocialRequest.g:679:4: (lv_queries_3_0= ruleQuery )
            	    // InternalSocialRequest.g:680:5: lv_queries_3_0= ruleQuery
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
            	    if ( cnt13 >= 1 ) break loop13;
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
            } while (true);

            otherlv_4=(Token)match(input,20,FOLLOW_2); 

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
    // InternalSocialRequest.g:705:1: entryRuleQuery returns [EObject current=null] : iv_ruleQuery= ruleQuery EOF ;
    public final EObject entryRuleQuery() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuery = null;


        try {
            // InternalSocialRequest.g:705:46: (iv_ruleQuery= ruleQuery EOF )
            // InternalSocialRequest.g:706:2: iv_ruleQuery= ruleQuery EOF
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
    // InternalSocialRequest.g:712:1: ruleQuery returns [EObject current=null] : (otherlv_0= 'query' ( (lv_name_1_0= RULE_ID ) ) ( (lv_isList_2_0= ': list' ) )? (otherlv_3= '{' (otherlv_4= 'params {' ( (lv_params_5_0= ruleParam ) )* otherlv_6= '}' )? ( (lv_sqlQuery_7_0= ruleSQLQuery ) )? otherlv_8= '}' ) ) ;
    public final EObject ruleQuery() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_isList_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_params_5_0 = null;

        EObject lv_sqlQuery_7_0 = null;



        	enterRule();

        try {
            // InternalSocialRequest.g:718:2: ( (otherlv_0= 'query' ( (lv_name_1_0= RULE_ID ) ) ( (lv_isList_2_0= ': list' ) )? (otherlv_3= '{' (otherlv_4= 'params {' ( (lv_params_5_0= ruleParam ) )* otherlv_6= '}' )? ( (lv_sqlQuery_7_0= ruleSQLQuery ) )? otherlv_8= '}' ) ) )
            // InternalSocialRequest.g:719:2: (otherlv_0= 'query' ( (lv_name_1_0= RULE_ID ) ) ( (lv_isList_2_0= ': list' ) )? (otherlv_3= '{' (otherlv_4= 'params {' ( (lv_params_5_0= ruleParam ) )* otherlv_6= '}' )? ( (lv_sqlQuery_7_0= ruleSQLQuery ) )? otherlv_8= '}' ) )
            {
            // InternalSocialRequest.g:719:2: (otherlv_0= 'query' ( (lv_name_1_0= RULE_ID ) ) ( (lv_isList_2_0= ': list' ) )? (otherlv_3= '{' (otherlv_4= 'params {' ( (lv_params_5_0= ruleParam ) )* otherlv_6= '}' )? ( (lv_sqlQuery_7_0= ruleSQLQuery ) )? otherlv_8= '}' ) )
            // InternalSocialRequest.g:720:3: otherlv_0= 'query' ( (lv_name_1_0= RULE_ID ) ) ( (lv_isList_2_0= ': list' ) )? (otherlv_3= '{' (otherlv_4= 'params {' ( (lv_params_5_0= ruleParam ) )* otherlv_6= '}' )? ( (lv_sqlQuery_7_0= ruleSQLQuery ) )? otherlv_8= '}' )
            {
            otherlv_0=(Token)match(input,35,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getQueryAccess().getQueryKeyword_0());
            		
            // InternalSocialRequest.g:724:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSocialRequest.g:725:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSocialRequest.g:725:4: (lv_name_1_0= RULE_ID )
            // InternalSocialRequest.g:726:5: lv_name_1_0= RULE_ID
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

            // InternalSocialRequest.g:742:3: ( (lv_isList_2_0= ': list' ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==36) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalSocialRequest.g:743:4: (lv_isList_2_0= ': list' )
                    {
                    // InternalSocialRequest.g:743:4: (lv_isList_2_0= ': list' )
                    // InternalSocialRequest.g:744:5: lv_isList_2_0= ': list'
                    {
                    lv_isList_2_0=(Token)match(input,36,FOLLOW_7); 

                    					newLeafNode(lv_isList_2_0, grammarAccess.getQueryAccess().getIsListListKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getQueryRule());
                    					}
                    					setWithLastConsumed(current, "isList", true, ": list");
                    				

                    }


                    }
                    break;

            }

            // InternalSocialRequest.g:756:3: (otherlv_3= '{' (otherlv_4= 'params {' ( (lv_params_5_0= ruleParam ) )* otherlv_6= '}' )? ( (lv_sqlQuery_7_0= ruleSQLQuery ) )? otherlv_8= '}' )
            // InternalSocialRequest.g:757:4: otherlv_3= '{' (otherlv_4= 'params {' ( (lv_params_5_0= ruleParam ) )* otherlv_6= '}' )? ( (lv_sqlQuery_7_0= ruleSQLQuery ) )? otherlv_8= '}'
            {
            otherlv_3=(Token)match(input,19,FOLLOW_26); 

            				newLeafNode(otherlv_3, grammarAccess.getQueryAccess().getLeftCurlyBracketKeyword_3_0());
            			
            // InternalSocialRequest.g:761:4: (otherlv_4= 'params {' ( (lv_params_5_0= ruleParam ) )* otherlv_6= '}' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==37) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalSocialRequest.g:762:5: otherlv_4= 'params {' ( (lv_params_5_0= ruleParam ) )* otherlv_6= '}'
                    {
                    otherlv_4=(Token)match(input,37,FOLLOW_27); 

                    					newLeafNode(otherlv_4, grammarAccess.getQueryAccess().getParamsKeyword_3_1_0());
                    				
                    // InternalSocialRequest.g:766:5: ( (lv_params_5_0= ruleParam ) )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==RULE_ID) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // InternalSocialRequest.g:767:6: (lv_params_5_0= ruleParam )
                    	    {
                    	    // InternalSocialRequest.g:767:6: (lv_params_5_0= ruleParam )
                    	    // InternalSocialRequest.g:768:7: lv_params_5_0= ruleParam
                    	    {

                    	    							newCompositeNode(grammarAccess.getQueryAccess().getParamsParamParserRuleCall_3_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_27);
                    	    lv_params_5_0=ruleParam();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getQueryRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"params",
                    	    								lv_params_5_0,
                    	    								"org.xtext.example.mydsl.SocialRequest.Param");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop15;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,20,FOLLOW_28); 

                    					newLeafNode(otherlv_6, grammarAccess.getQueryAccess().getRightCurlyBracketKeyword_3_1_2());
                    				

                    }
                    break;

            }

            // InternalSocialRequest.g:790:4: ( (lv_sqlQuery_7_0= ruleSQLQuery ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==38) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalSocialRequest.g:791:5: (lv_sqlQuery_7_0= ruleSQLQuery )
                    {
                    // InternalSocialRequest.g:791:5: (lv_sqlQuery_7_0= ruleSQLQuery )
                    // InternalSocialRequest.g:792:6: lv_sqlQuery_7_0= ruleSQLQuery
                    {

                    						newCompositeNode(grammarAccess.getQueryAccess().getSqlQuerySQLQueryParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_29);
                    lv_sqlQuery_7_0=ruleSQLQuery();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getQueryRule());
                    						}
                    						set(
                    							current,
                    							"sqlQuery",
                    							lv_sqlQuery_7_0,
                    							"org.xtext.example.mydsl.SocialRequest.SQLQuery");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,20,FOLLOW_2); 

            				newLeafNode(otherlv_8, grammarAccess.getQueryAccess().getRightCurlyBracketKeyword_3_3());
            			

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
    // InternalSocialRequest.g:818:1: entryRuleParam returns [EObject current=null] : iv_ruleParam= ruleParam EOF ;
    public final EObject entryRuleParam() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParam = null;


        try {
            // InternalSocialRequest.g:818:46: (iv_ruleParam= ruleParam EOF )
            // InternalSocialRequest.g:819:2: iv_ruleParam= ruleParam EOF
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
    // InternalSocialRequest.g:825:1: ruleParam returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_DATA_TYPE ) ) ) ;
    public final EObject ruleParam() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalSocialRequest.g:831:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_DATA_TYPE ) ) ) )
            // InternalSocialRequest.g:832:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_DATA_TYPE ) ) )
            {
            // InternalSocialRequest.g:832:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_DATA_TYPE ) ) )
            // InternalSocialRequest.g:833:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_DATA_TYPE ) )
            {
            // InternalSocialRequest.g:833:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalSocialRequest.g:834:4: (lv_name_0_0= RULE_ID )
            {
            // InternalSocialRequest.g:834:4: (lv_name_0_0= RULE_ID )
            // InternalSocialRequest.g:835:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_10); 

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

            otherlv_1=(Token)match(input,21,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getParamAccess().getColonKeyword_1());
            		
            // InternalSocialRequest.g:855:3: ( (otherlv_2= RULE_DATA_TYPE ) )
            // InternalSocialRequest.g:856:4: (otherlv_2= RULE_DATA_TYPE )
            {
            // InternalSocialRequest.g:856:4: (otherlv_2= RULE_DATA_TYPE )
            // InternalSocialRequest.g:857:5: otherlv_2= RULE_DATA_TYPE
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getParamRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_DATA_TYPE,FOLLOW_2); 

            					newLeafNode(otherlv_2, grammarAccess.getParamAccess().getTypeEntityCrossReference_2_0());
            				

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
    // InternalSocialRequest.g:872:1: entryRuleSQLQuery returns [EObject current=null] : iv_ruleSQLQuery= ruleSQLQuery EOF ;
    public final EObject entryRuleSQLQuery() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSQLQuery = null;


        try {
            // InternalSocialRequest.g:872:49: (iv_ruleSQLQuery= ruleSQLQuery EOF )
            // InternalSocialRequest.g:873:2: iv_ruleSQLQuery= ruleSQLQuery EOF
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
    // InternalSocialRequest.g:879:1: ruleSQLQuery returns [EObject current=null] : ( ( (lv_select_0_0= ruleSelect ) ) ( (lv_from_1_0= ruleFrom ) ) ( (lv_joins_2_0= ruleJoin ) )* ( (lv_where_3_0= ruleWhere ) )? ( (lv_order_4_0= ruleOrder ) )? ) ;
    public final EObject ruleSQLQuery() throws RecognitionException {
        EObject current = null;

        EObject lv_select_0_0 = null;

        EObject lv_from_1_0 = null;

        EObject lv_joins_2_0 = null;

        EObject lv_where_3_0 = null;

        EObject lv_order_4_0 = null;



        	enterRule();

        try {
            // InternalSocialRequest.g:885:2: ( ( ( (lv_select_0_0= ruleSelect ) ) ( (lv_from_1_0= ruleFrom ) ) ( (lv_joins_2_0= ruleJoin ) )* ( (lv_where_3_0= ruleWhere ) )? ( (lv_order_4_0= ruleOrder ) )? ) )
            // InternalSocialRequest.g:886:2: ( ( (lv_select_0_0= ruleSelect ) ) ( (lv_from_1_0= ruleFrom ) ) ( (lv_joins_2_0= ruleJoin ) )* ( (lv_where_3_0= ruleWhere ) )? ( (lv_order_4_0= ruleOrder ) )? )
            {
            // InternalSocialRequest.g:886:2: ( ( (lv_select_0_0= ruleSelect ) ) ( (lv_from_1_0= ruleFrom ) ) ( (lv_joins_2_0= ruleJoin ) )* ( (lv_where_3_0= ruleWhere ) )? ( (lv_order_4_0= ruleOrder ) )? )
            // InternalSocialRequest.g:887:3: ( (lv_select_0_0= ruleSelect ) ) ( (lv_from_1_0= ruleFrom ) ) ( (lv_joins_2_0= ruleJoin ) )* ( (lv_where_3_0= ruleWhere ) )? ( (lv_order_4_0= ruleOrder ) )?
            {
            // InternalSocialRequest.g:887:3: ( (lv_select_0_0= ruleSelect ) )
            // InternalSocialRequest.g:888:4: (lv_select_0_0= ruleSelect )
            {
            // InternalSocialRequest.g:888:4: (lv_select_0_0= ruleSelect )
            // InternalSocialRequest.g:889:5: lv_select_0_0= ruleSelect
            {

            					newCompositeNode(grammarAccess.getSQLQueryAccess().getSelectSelectParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_30);
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

            // InternalSocialRequest.g:906:3: ( (lv_from_1_0= ruleFrom ) )
            // InternalSocialRequest.g:907:4: (lv_from_1_0= ruleFrom )
            {
            // InternalSocialRequest.g:907:4: (lv_from_1_0= ruleFrom )
            // InternalSocialRequest.g:908:5: lv_from_1_0= ruleFrom
            {

            					newCompositeNode(grammarAccess.getSQLQueryAccess().getFromFromParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_31);
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

            // InternalSocialRequest.g:925:3: ( (lv_joins_2_0= ruleJoin ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_JOIN_TYPE) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalSocialRequest.g:926:4: (lv_joins_2_0= ruleJoin )
            	    {
            	    // InternalSocialRequest.g:926:4: (lv_joins_2_0= ruleJoin )
            	    // InternalSocialRequest.g:927:5: lv_joins_2_0= ruleJoin
            	    {

            	    					newCompositeNode(grammarAccess.getSQLQueryAccess().getJoinsJoinParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_31);
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
            	    break loop18;
                }
            } while (true);

            // InternalSocialRequest.g:944:3: ( (lv_where_3_0= ruleWhere ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==42) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalSocialRequest.g:945:4: (lv_where_3_0= ruleWhere )
                    {
                    // InternalSocialRequest.g:945:4: (lv_where_3_0= ruleWhere )
                    // InternalSocialRequest.g:946:5: lv_where_3_0= ruleWhere
                    {

                    					newCompositeNode(grammarAccess.getSQLQueryAccess().getWhereWhereParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_32);
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

            // InternalSocialRequest.g:963:3: ( (lv_order_4_0= ruleOrder ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==43) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalSocialRequest.g:964:4: (lv_order_4_0= ruleOrder )
                    {
                    // InternalSocialRequest.g:964:4: (lv_order_4_0= ruleOrder )
                    // InternalSocialRequest.g:965:5: lv_order_4_0= ruleOrder
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
    // InternalSocialRequest.g:986:1: entryRuleSelect returns [EObject current=null] : iv_ruleSelect= ruleSelect EOF ;
    public final EObject entryRuleSelect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelect = null;


        try {
            // InternalSocialRequest.g:986:47: (iv_ruleSelect= ruleSelect EOF )
            // InternalSocialRequest.g:987:2: iv_ruleSelect= ruleSelect EOF
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
    // InternalSocialRequest.g:993:1: ruleSelect returns [EObject current=null] : (otherlv_0= 'SELECT' ( (lv_isDistinct_1_0= 'DISTINCT' ) )? otherlv_2= '{' ( (lv_clause_3_0= RULE_STRING ) ) otherlv_4= '}' ) ;
    public final EObject ruleSelect() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_isDistinct_1_0=null;
        Token otherlv_2=null;
        Token lv_clause_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalSocialRequest.g:999:2: ( (otherlv_0= 'SELECT' ( (lv_isDistinct_1_0= 'DISTINCT' ) )? otherlv_2= '{' ( (lv_clause_3_0= RULE_STRING ) ) otherlv_4= '}' ) )
            // InternalSocialRequest.g:1000:2: (otherlv_0= 'SELECT' ( (lv_isDistinct_1_0= 'DISTINCT' ) )? otherlv_2= '{' ( (lv_clause_3_0= RULE_STRING ) ) otherlv_4= '}' )
            {
            // InternalSocialRequest.g:1000:2: (otherlv_0= 'SELECT' ( (lv_isDistinct_1_0= 'DISTINCT' ) )? otherlv_2= '{' ( (lv_clause_3_0= RULE_STRING ) ) otherlv_4= '}' )
            // InternalSocialRequest.g:1001:3: otherlv_0= 'SELECT' ( (lv_isDistinct_1_0= 'DISTINCT' ) )? otherlv_2= '{' ( (lv_clause_3_0= RULE_STRING ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,38,FOLLOW_33); 

            			newLeafNode(otherlv_0, grammarAccess.getSelectAccess().getSELECTKeyword_0());
            		
            // InternalSocialRequest.g:1005:3: ( (lv_isDistinct_1_0= 'DISTINCT' ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==39) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalSocialRequest.g:1006:4: (lv_isDistinct_1_0= 'DISTINCT' )
                    {
                    // InternalSocialRequest.g:1006:4: (lv_isDistinct_1_0= 'DISTINCT' )
                    // InternalSocialRequest.g:1007:5: lv_isDistinct_1_0= 'DISTINCT'
                    {
                    lv_isDistinct_1_0=(Token)match(input,39,FOLLOW_7); 

                    					newLeafNode(lv_isDistinct_1_0, grammarAccess.getSelectAccess().getIsDistinctDISTINCTKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getSelectRule());
                    					}
                    					setWithLastConsumed(current, "isDistinct", true, "DISTINCT");
                    				

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,19,FOLLOW_22); 

            			newLeafNode(otherlv_2, grammarAccess.getSelectAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalSocialRequest.g:1023:3: ( (lv_clause_3_0= RULE_STRING ) )
            // InternalSocialRequest.g:1024:4: (lv_clause_3_0= RULE_STRING )
            {
            // InternalSocialRequest.g:1024:4: (lv_clause_3_0= RULE_STRING )
            // InternalSocialRequest.g:1025:5: lv_clause_3_0= RULE_STRING
            {
            lv_clause_3_0=(Token)match(input,RULE_STRING,FOLLOW_29); 

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

            otherlv_4=(Token)match(input,20,FOLLOW_2); 

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
    // InternalSocialRequest.g:1049:1: entryRuleFrom returns [EObject current=null] : iv_ruleFrom= ruleFrom EOF ;
    public final EObject entryRuleFrom() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFrom = null;


        try {
            // InternalSocialRequest.g:1049:45: (iv_ruleFrom= ruleFrom EOF )
            // InternalSocialRequest.g:1050:2: iv_ruleFrom= ruleFrom EOF
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
    // InternalSocialRequest.g:1056:1: ruleFrom returns [EObject current=null] : (otherlv_0= 'FROM {' ( (otherlv_1= RULE_ID ) ) ( (lv_alias_2_0= RULE_STRING ) ) otherlv_3= '}' ) ;
    public final EObject ruleFrom() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_alias_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalSocialRequest.g:1062:2: ( (otherlv_0= 'FROM {' ( (otherlv_1= RULE_ID ) ) ( (lv_alias_2_0= RULE_STRING ) ) otherlv_3= '}' ) )
            // InternalSocialRequest.g:1063:2: (otherlv_0= 'FROM {' ( (otherlv_1= RULE_ID ) ) ( (lv_alias_2_0= RULE_STRING ) ) otherlv_3= '}' )
            {
            // InternalSocialRequest.g:1063:2: (otherlv_0= 'FROM {' ( (otherlv_1= RULE_ID ) ) ( (lv_alias_2_0= RULE_STRING ) ) otherlv_3= '}' )
            // InternalSocialRequest.g:1064:3: otherlv_0= 'FROM {' ( (otherlv_1= RULE_ID ) ) ( (lv_alias_2_0= RULE_STRING ) ) otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,40,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getFromAccess().getFROMKeyword_0());
            		
            // InternalSocialRequest.g:1068:3: ( (otherlv_1= RULE_ID ) )
            // InternalSocialRequest.g:1069:4: (otherlv_1= RULE_ID )
            {
            // InternalSocialRequest.g:1069:4: (otherlv_1= RULE_ID )
            // InternalSocialRequest.g:1070:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFromRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_22); 

            					newLeafNode(otherlv_1, grammarAccess.getFromAccess().getEntityEntityCrossReference_1_0());
            				

            }


            }

            // InternalSocialRequest.g:1081:3: ( (lv_alias_2_0= RULE_STRING ) )
            // InternalSocialRequest.g:1082:4: (lv_alias_2_0= RULE_STRING )
            {
            // InternalSocialRequest.g:1082:4: (lv_alias_2_0= RULE_STRING )
            // InternalSocialRequest.g:1083:5: lv_alias_2_0= RULE_STRING
            {
            lv_alias_2_0=(Token)match(input,RULE_STRING,FOLLOW_29); 

            					newLeafNode(lv_alias_2_0, grammarAccess.getFromAccess().getAliasSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFromRule());
            					}
            					setWithLastConsumed(
            						current,
            						"alias",
            						lv_alias_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_3=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getFromAccess().getRightCurlyBracketKeyword_3());
            		

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
    // InternalSocialRequest.g:1107:1: entryRuleJoin returns [EObject current=null] : iv_ruleJoin= ruleJoin EOF ;
    public final EObject entryRuleJoin() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJoin = null;


        try {
            // InternalSocialRequest.g:1107:45: (iv_ruleJoin= ruleJoin EOF )
            // InternalSocialRequest.g:1108:2: iv_ruleJoin= ruleJoin EOF
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
    // InternalSocialRequest.g:1114:1: ruleJoin returns [EObject current=null] : ( ( (lv_joinType_0_0= RULE_JOIN_TYPE ) ) otherlv_1= '{' ( (otherlv_2= RULE_ID ) ) ( (lv_alias_3_0= RULE_STRING ) ) otherlv_4= '}' (otherlv_5= 'ON {' ( (lv_joinCondition_6_0= RULE_STRING ) ) otherlv_7= '}' )? ) ;
    public final EObject ruleJoin() throws RecognitionException {
        EObject current = null;

        Token lv_joinType_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_alias_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_joinCondition_6_0=null;
        Token otherlv_7=null;


        	enterRule();

        try {
            // InternalSocialRequest.g:1120:2: ( ( ( (lv_joinType_0_0= RULE_JOIN_TYPE ) ) otherlv_1= '{' ( (otherlv_2= RULE_ID ) ) ( (lv_alias_3_0= RULE_STRING ) ) otherlv_4= '}' (otherlv_5= 'ON {' ( (lv_joinCondition_6_0= RULE_STRING ) ) otherlv_7= '}' )? ) )
            // InternalSocialRequest.g:1121:2: ( ( (lv_joinType_0_0= RULE_JOIN_TYPE ) ) otherlv_1= '{' ( (otherlv_2= RULE_ID ) ) ( (lv_alias_3_0= RULE_STRING ) ) otherlv_4= '}' (otherlv_5= 'ON {' ( (lv_joinCondition_6_0= RULE_STRING ) ) otherlv_7= '}' )? )
            {
            // InternalSocialRequest.g:1121:2: ( ( (lv_joinType_0_0= RULE_JOIN_TYPE ) ) otherlv_1= '{' ( (otherlv_2= RULE_ID ) ) ( (lv_alias_3_0= RULE_STRING ) ) otherlv_4= '}' (otherlv_5= 'ON {' ( (lv_joinCondition_6_0= RULE_STRING ) ) otherlv_7= '}' )? )
            // InternalSocialRequest.g:1122:3: ( (lv_joinType_0_0= RULE_JOIN_TYPE ) ) otherlv_1= '{' ( (otherlv_2= RULE_ID ) ) ( (lv_alias_3_0= RULE_STRING ) ) otherlv_4= '}' (otherlv_5= 'ON {' ( (lv_joinCondition_6_0= RULE_STRING ) ) otherlv_7= '}' )?
            {
            // InternalSocialRequest.g:1122:3: ( (lv_joinType_0_0= RULE_JOIN_TYPE ) )
            // InternalSocialRequest.g:1123:4: (lv_joinType_0_0= RULE_JOIN_TYPE )
            {
            // InternalSocialRequest.g:1123:4: (lv_joinType_0_0= RULE_JOIN_TYPE )
            // InternalSocialRequest.g:1124:5: lv_joinType_0_0= RULE_JOIN_TYPE
            {
            lv_joinType_0_0=(Token)match(input,RULE_JOIN_TYPE,FOLLOW_7); 

            					newLeafNode(lv_joinType_0_0, grammarAccess.getJoinAccess().getJoinTypeJOIN_TYPETerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getJoinRule());
            					}
            					setWithLastConsumed(
            						current,
            						"joinType",
            						lv_joinType_0_0,
            						"org.xtext.example.mydsl.SocialRequest.JOIN_TYPE");
            				

            }


            }

            otherlv_1=(Token)match(input,19,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getJoinAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalSocialRequest.g:1144:3: ( (otherlv_2= RULE_ID ) )
            // InternalSocialRequest.g:1145:4: (otherlv_2= RULE_ID )
            {
            // InternalSocialRequest.g:1145:4: (otherlv_2= RULE_ID )
            // InternalSocialRequest.g:1146:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getJoinRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_22); 

            					newLeafNode(otherlv_2, grammarAccess.getJoinAccess().getEntityEntityCrossReference_2_0());
            				

            }


            }

            // InternalSocialRequest.g:1157:3: ( (lv_alias_3_0= RULE_STRING ) )
            // InternalSocialRequest.g:1158:4: (lv_alias_3_0= RULE_STRING )
            {
            // InternalSocialRequest.g:1158:4: (lv_alias_3_0= RULE_STRING )
            // InternalSocialRequest.g:1159:5: lv_alias_3_0= RULE_STRING
            {
            lv_alias_3_0=(Token)match(input,RULE_STRING,FOLLOW_29); 

            					newLeafNode(lv_alias_3_0, grammarAccess.getJoinAccess().getAliasSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getJoinRule());
            					}
            					setWithLastConsumed(
            						current,
            						"alias",
            						lv_alias_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_4=(Token)match(input,20,FOLLOW_34); 

            			newLeafNode(otherlv_4, grammarAccess.getJoinAccess().getRightCurlyBracketKeyword_4());
            		
            // InternalSocialRequest.g:1179:3: (otherlv_5= 'ON {' ( (lv_joinCondition_6_0= RULE_STRING ) ) otherlv_7= '}' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==41) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalSocialRequest.g:1180:4: otherlv_5= 'ON {' ( (lv_joinCondition_6_0= RULE_STRING ) ) otherlv_7= '}'
                    {
                    otherlv_5=(Token)match(input,41,FOLLOW_22); 

                    				newLeafNode(otherlv_5, grammarAccess.getJoinAccess().getONKeyword_5_0());
                    			
                    // InternalSocialRequest.g:1184:4: ( (lv_joinCondition_6_0= RULE_STRING ) )
                    // InternalSocialRequest.g:1185:5: (lv_joinCondition_6_0= RULE_STRING )
                    {
                    // InternalSocialRequest.g:1185:5: (lv_joinCondition_6_0= RULE_STRING )
                    // InternalSocialRequest.g:1186:6: lv_joinCondition_6_0= RULE_STRING
                    {
                    lv_joinCondition_6_0=(Token)match(input,RULE_STRING,FOLLOW_29); 

                    						newLeafNode(lv_joinCondition_6_0, grammarAccess.getJoinAccess().getJoinConditionSTRINGTerminalRuleCall_5_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getJoinRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"joinCondition",
                    							lv_joinCondition_6_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }

                    otherlv_7=(Token)match(input,20,FOLLOW_2); 

                    				newLeafNode(otherlv_7, grammarAccess.getJoinAccess().getRightCurlyBracketKeyword_5_2());
                    			

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
    // InternalSocialRequest.g:1211:1: entryRuleWhere returns [EObject current=null] : iv_ruleWhere= ruleWhere EOF ;
    public final EObject entryRuleWhere() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhere = null;


        try {
            // InternalSocialRequest.g:1211:46: (iv_ruleWhere= ruleWhere EOF )
            // InternalSocialRequest.g:1212:2: iv_ruleWhere= ruleWhere EOF
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
    // InternalSocialRequest.g:1218:1: ruleWhere returns [EObject current=null] : (otherlv_0= 'WHERE {' ( (lv_condition_1_0= RULE_STRING ) ) otherlv_2= '}' ) ;
    public final EObject ruleWhere() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_condition_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalSocialRequest.g:1224:2: ( (otherlv_0= 'WHERE {' ( (lv_condition_1_0= RULE_STRING ) ) otherlv_2= '}' ) )
            // InternalSocialRequest.g:1225:2: (otherlv_0= 'WHERE {' ( (lv_condition_1_0= RULE_STRING ) ) otherlv_2= '}' )
            {
            // InternalSocialRequest.g:1225:2: (otherlv_0= 'WHERE {' ( (lv_condition_1_0= RULE_STRING ) ) otherlv_2= '}' )
            // InternalSocialRequest.g:1226:3: otherlv_0= 'WHERE {' ( (lv_condition_1_0= RULE_STRING ) ) otherlv_2= '}'
            {
            otherlv_0=(Token)match(input,42,FOLLOW_22); 

            			newLeafNode(otherlv_0, grammarAccess.getWhereAccess().getWHEREKeyword_0());
            		
            // InternalSocialRequest.g:1230:3: ( (lv_condition_1_0= RULE_STRING ) )
            // InternalSocialRequest.g:1231:4: (lv_condition_1_0= RULE_STRING )
            {
            // InternalSocialRequest.g:1231:4: (lv_condition_1_0= RULE_STRING )
            // InternalSocialRequest.g:1232:5: lv_condition_1_0= RULE_STRING
            {
            lv_condition_1_0=(Token)match(input,RULE_STRING,FOLLOW_29); 

            					newLeafNode(lv_condition_1_0, grammarAccess.getWhereAccess().getConditionSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getWhereRule());
            					}
            					setWithLastConsumed(
            						current,
            						"condition",
            						lv_condition_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getWhereAccess().getRightCurlyBracketKeyword_2());
            		

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
    // InternalSocialRequest.g:1256:1: entryRuleOrder returns [EObject current=null] : iv_ruleOrder= ruleOrder EOF ;
    public final EObject entryRuleOrder() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrder = null;


        try {
            // InternalSocialRequest.g:1256:46: (iv_ruleOrder= ruleOrder EOF )
            // InternalSocialRequest.g:1257:2: iv_ruleOrder= ruleOrder EOF
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
    // InternalSocialRequest.g:1263:1: ruleOrder returns [EObject current=null] : (otherlv_0= 'ORDER BY {' ( (lv_order_1_0= RULE_STRING ) ) otherlv_2= '}' ) ;
    public final EObject ruleOrder() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_order_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalSocialRequest.g:1269:2: ( (otherlv_0= 'ORDER BY {' ( (lv_order_1_0= RULE_STRING ) ) otherlv_2= '}' ) )
            // InternalSocialRequest.g:1270:2: (otherlv_0= 'ORDER BY {' ( (lv_order_1_0= RULE_STRING ) ) otherlv_2= '}' )
            {
            // InternalSocialRequest.g:1270:2: (otherlv_0= 'ORDER BY {' ( (lv_order_1_0= RULE_STRING ) ) otherlv_2= '}' )
            // InternalSocialRequest.g:1271:3: otherlv_0= 'ORDER BY {' ( (lv_order_1_0= RULE_STRING ) ) otherlv_2= '}'
            {
            otherlv_0=(Token)match(input,43,FOLLOW_22); 

            			newLeafNode(otherlv_0, grammarAccess.getOrderAccess().getORDERBYKeyword_0());
            		
            // InternalSocialRequest.g:1275:3: ( (lv_order_1_0= RULE_STRING ) )
            // InternalSocialRequest.g:1276:4: (lv_order_1_0= RULE_STRING )
            {
            // InternalSocialRequest.g:1276:4: (lv_order_1_0= RULE_STRING )
            // InternalSocialRequest.g:1277:5: lv_order_1_0= RULE_STRING
            {
            lv_order_1_0=(Token)match(input,RULE_STRING,FOLLOW_29); 

            					newLeafNode(lv_order_1_0, grammarAccess.getOrderAccess().getOrderSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOrderRule());
            					}
            					setWithLastConsumed(
            						current,
            						"order",
            						lv_order_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getOrderAccess().getRightCurlyBracketKeyword_2());
            		

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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000400020002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000100030L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000006080002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000001D00000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x00000003E0000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x00000003E0100000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000800100000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000001000080000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000006000100000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000100010L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000004000100000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x00000C0000000802L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000008000080000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000020000000002L});

}
