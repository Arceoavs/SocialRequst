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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_FETCHTYPE", "RULE_GENERATIONTYPE", "RULE_POSSIBLY_SIGNED_INT", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'package'", "'{'", "'}'", "'.'", "'Entity'", "'implements'", "'UserDetails'", "':'", "'mappedBy:'", "'fetch:'", "'validations'", "'LOB'", "'TRANSIENT'", "'ID'", "'('", "')'", "'min:'", "'max:'", "'pattern:'", "'unique'", "'NotNull'", "'NotBlank'", "'Past'", "'Email'", "'OneToMany'", "'ManyToOne'", "'OneToOne'", "'ManyToMany'", "'Repository'", "'query'", "'list'", "'params'", "'SELECT'", "'DISTINCT'", "'FROM'", "'ON'", "'WHERE'", "'ORDER BY'", "'String'", "'long'", "'float'", "'double'", "'char'", "'int'", "'boolean'", "'Date'", "'LEFT JOIN'", "'LEFT OUTER JOIN'", "'CROSS JOIN'", "'JOIN'"
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
    // InternalSocialRequest.g:72:1: ruleModel returns [EObject current=null] : ( (lv_elements_0_0= ruleAbstractElement ) )+ ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_elements_0_0 = null;



        	enterRule();

        try {
            // InternalSocialRequest.g:78:2: ( ( (lv_elements_0_0= ruleAbstractElement ) )+ )
            // InternalSocialRequest.g:79:2: ( (lv_elements_0_0= ruleAbstractElement ) )+
            {
            // InternalSocialRequest.g:79:2: ( (lv_elements_0_0= ruleAbstractElement ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==14||LA1_0==18||LA1_0==42) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalSocialRequest.g:80:3: (lv_elements_0_0= ruleAbstractElement )
            	    {
            	    // InternalSocialRequest.g:80:3: (lv_elements_0_0= ruleAbstractElement )
            	    // InternalSocialRequest.g:81:4: lv_elements_0_0= ruleAbstractElement
            	    {

            	    				newCompositeNode(grammarAccess.getModelAccess().getElementsAbstractElementParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_elements_0_0=ruleAbstractElement();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getModelRule());
            	    				}
            	    				add(
            	    					current,
            	    					"elements",
            	    					lv_elements_0_0,
            	    					"org.xtext.example.mydsl.SocialRequest.AbstractElement");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


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


    // $ANTLR start "entryRuleAbstractElement"
    // InternalSocialRequest.g:101:1: entryRuleAbstractElement returns [EObject current=null] : iv_ruleAbstractElement= ruleAbstractElement EOF ;
    public final EObject entryRuleAbstractElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractElement = null;


        try {
            // InternalSocialRequest.g:101:56: (iv_ruleAbstractElement= ruleAbstractElement EOF )
            // InternalSocialRequest.g:102:2: iv_ruleAbstractElement= ruleAbstractElement EOF
            {
             newCompositeNode(grammarAccess.getAbstractElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAbstractElement=ruleAbstractElement();

            state._fsp--;

             current =iv_ruleAbstractElement; 
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
    // $ANTLR end "entryRuleAbstractElement"


    // $ANTLR start "ruleAbstractElement"
    // InternalSocialRequest.g:108:1: ruleAbstractElement returns [EObject current=null] : (this_Package_0= rulePackage | this_Entity_1= ruleEntity | this_Repository_2= ruleRepository ) ;
    public final EObject ruleAbstractElement() throws RecognitionException {
        EObject current = null;

        EObject this_Package_0 = null;

        EObject this_Entity_1 = null;

        EObject this_Repository_2 = null;



        	enterRule();

        try {
            // InternalSocialRequest.g:114:2: ( (this_Package_0= rulePackage | this_Entity_1= ruleEntity | this_Repository_2= ruleRepository ) )
            // InternalSocialRequest.g:115:2: (this_Package_0= rulePackage | this_Entity_1= ruleEntity | this_Repository_2= ruleRepository )
            {
            // InternalSocialRequest.g:115:2: (this_Package_0= rulePackage | this_Entity_1= ruleEntity | this_Repository_2= ruleRepository )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt2=1;
                }
                break;
            case 18:
                {
                alt2=2;
                }
                break;
            case 42:
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
                    // InternalSocialRequest.g:116:3: this_Package_0= rulePackage
                    {

                    			newCompositeNode(grammarAccess.getAbstractElementAccess().getPackageParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Package_0=rulePackage();

                    state._fsp--;


                    			current = this_Package_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalSocialRequest.g:125:3: this_Entity_1= ruleEntity
                    {

                    			newCompositeNode(grammarAccess.getAbstractElementAccess().getEntityParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Entity_1=ruleEntity();

                    state._fsp--;


                    			current = this_Entity_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalSocialRequest.g:134:3: this_Repository_2= ruleRepository
                    {

                    			newCompositeNode(grammarAccess.getAbstractElementAccess().getRepositoryParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Repository_2=ruleRepository();

                    state._fsp--;


                    			current = this_Repository_2;
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
    // $ANTLR end "ruleAbstractElement"


    // $ANTLR start "entryRulePackage"
    // InternalSocialRequest.g:146:1: entryRulePackage returns [EObject current=null] : iv_rulePackage= rulePackage EOF ;
    public final EObject entryRulePackage() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackage = null;


        try {
            // InternalSocialRequest.g:146:48: (iv_rulePackage= rulePackage EOF )
            // InternalSocialRequest.g:147:2: iv_rulePackage= rulePackage EOF
            {
             newCompositeNode(grammarAccess.getPackageRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePackage=rulePackage();

            state._fsp--;

             current =iv_rulePackage; 
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
    // $ANTLR end "entryRulePackage"


    // $ANTLR start "rulePackage"
    // InternalSocialRequest.g:153:1: rulePackage returns [EObject current=null] : (otherlv_0= 'package' ( (lv_name_1_0= rulePointSeperatedID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleAbstractElement ) )* otherlv_4= '}' ) ;
    public final EObject rulePackage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_elements_3_0 = null;



        	enterRule();

        try {
            // InternalSocialRequest.g:159:2: ( (otherlv_0= 'package' ( (lv_name_1_0= rulePointSeperatedID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleAbstractElement ) )* otherlv_4= '}' ) )
            // InternalSocialRequest.g:160:2: (otherlv_0= 'package' ( (lv_name_1_0= rulePointSeperatedID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleAbstractElement ) )* otherlv_4= '}' )
            {
            // InternalSocialRequest.g:160:2: (otherlv_0= 'package' ( (lv_name_1_0= rulePointSeperatedID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleAbstractElement ) )* otherlv_4= '}' )
            // InternalSocialRequest.g:161:3: otherlv_0= 'package' ( (lv_name_1_0= rulePointSeperatedID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleAbstractElement ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getPackageAccess().getPackageKeyword_0());
            		
            // InternalSocialRequest.g:165:3: ( (lv_name_1_0= rulePointSeperatedID ) )
            // InternalSocialRequest.g:166:4: (lv_name_1_0= rulePointSeperatedID )
            {
            // InternalSocialRequest.g:166:4: (lv_name_1_0= rulePointSeperatedID )
            // InternalSocialRequest.g:167:5: lv_name_1_0= rulePointSeperatedID
            {

            					newCompositeNode(grammarAccess.getPackageAccess().getNamePointSeperatedIDParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_5);
            lv_name_1_0=rulePointSeperatedID();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPackageRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.example.mydsl.SocialRequest.PointSeperatedID");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getPackageAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalSocialRequest.g:188:3: ( (lv_elements_3_0= ruleAbstractElement ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==14||LA3_0==18||LA3_0==42) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalSocialRequest.g:189:4: (lv_elements_3_0= ruleAbstractElement )
            	    {
            	    // InternalSocialRequest.g:189:4: (lv_elements_3_0= ruleAbstractElement )
            	    // InternalSocialRequest.g:190:5: lv_elements_3_0= ruleAbstractElement
            	    {

            	    					newCompositeNode(grammarAccess.getPackageAccess().getElementsAbstractElementParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_elements_3_0=ruleAbstractElement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getPackageRule());
            	    					}
            	    					add(
            	    						current,
            	    						"elements",
            	    						lv_elements_3_0,
            	    						"org.xtext.example.mydsl.SocialRequest.AbstractElement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_4=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getPackageAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "rulePackage"


    // $ANTLR start "entryRulePointSeperatedID"
    // InternalSocialRequest.g:215:1: entryRulePointSeperatedID returns [String current=null] : iv_rulePointSeperatedID= rulePointSeperatedID EOF ;
    public final String entryRulePointSeperatedID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePointSeperatedID = null;


        try {
            // InternalSocialRequest.g:215:56: (iv_rulePointSeperatedID= rulePointSeperatedID EOF )
            // InternalSocialRequest.g:216:2: iv_rulePointSeperatedID= rulePointSeperatedID EOF
            {
             newCompositeNode(grammarAccess.getPointSeperatedIDRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePointSeperatedID=rulePointSeperatedID();

            state._fsp--;

             current =iv_rulePointSeperatedID.getText(); 
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
    // $ANTLR end "entryRulePointSeperatedID"


    // $ANTLR start "rulePointSeperatedID"
    // InternalSocialRequest.g:222:1: rulePointSeperatedID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken rulePointSeperatedID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalSocialRequest.g:228:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalSocialRequest.g:229:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalSocialRequest.g:229:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalSocialRequest.g:230:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getPointSeperatedIDAccess().getIDTerminalRuleCall_0());
            		
            // InternalSocialRequest.g:237:3: (kw= '.' this_ID_2= RULE_ID )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==17) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalSocialRequest.g:238:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,17,FOLLOW_4); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getPointSeperatedIDAccess().getFullStopKeyword_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_7); 

            	    				current.merge(this_ID_2);
            	    			

            	    				newLeafNode(this_ID_2, grammarAccess.getPointSeperatedIDAccess().getIDTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop4;
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
    // $ANTLR end "rulePointSeperatedID"


    // $ANTLR start "entryRuleEntity"
    // InternalSocialRequest.g:255:1: entryRuleEntity returns [EObject current=null] : iv_ruleEntity= ruleEntity EOF ;
    public final EObject entryRuleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntity = null;


        try {
            // InternalSocialRequest.g:255:47: (iv_ruleEntity= ruleEntity EOF )
            // InternalSocialRequest.g:256:2: iv_ruleEntity= ruleEntity EOF
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
    // InternalSocialRequest.g:262:1: ruleEntity returns [EObject current=null] : (otherlv_0= 'Entity' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_hasUserDetails_2_0= 'implements' ) ) otherlv_3= 'UserDetails' )? otherlv_4= '{' ( (lv_attributes_5_0= ruleAttribute ) )+ otherlv_6= '}' ) ;
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
            // InternalSocialRequest.g:268:2: ( (otherlv_0= 'Entity' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_hasUserDetails_2_0= 'implements' ) ) otherlv_3= 'UserDetails' )? otherlv_4= '{' ( (lv_attributes_5_0= ruleAttribute ) )+ otherlv_6= '}' ) )
            // InternalSocialRequest.g:269:2: (otherlv_0= 'Entity' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_hasUserDetails_2_0= 'implements' ) ) otherlv_3= 'UserDetails' )? otherlv_4= '{' ( (lv_attributes_5_0= ruleAttribute ) )+ otherlv_6= '}' )
            {
            // InternalSocialRequest.g:269:2: (otherlv_0= 'Entity' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_hasUserDetails_2_0= 'implements' ) ) otherlv_3= 'UserDetails' )? otherlv_4= '{' ( (lv_attributes_5_0= ruleAttribute ) )+ otherlv_6= '}' )
            // InternalSocialRequest.g:270:3: otherlv_0= 'Entity' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_hasUserDetails_2_0= 'implements' ) ) otherlv_3= 'UserDetails' )? otherlv_4= '{' ( (lv_attributes_5_0= ruleAttribute ) )+ otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getEntityAccess().getEntityKeyword_0());
            		
            // InternalSocialRequest.g:274:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSocialRequest.g:275:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSocialRequest.g:275:4: (lv_name_1_0= RULE_ID )
            // InternalSocialRequest.g:276:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_8); 

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

            // InternalSocialRequest.g:292:3: ( ( (lv_hasUserDetails_2_0= 'implements' ) ) otherlv_3= 'UserDetails' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==19) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalSocialRequest.g:293:4: ( (lv_hasUserDetails_2_0= 'implements' ) ) otherlv_3= 'UserDetails'
                    {
                    // InternalSocialRequest.g:293:4: ( (lv_hasUserDetails_2_0= 'implements' ) )
                    // InternalSocialRequest.g:294:5: (lv_hasUserDetails_2_0= 'implements' )
                    {
                    // InternalSocialRequest.g:294:5: (lv_hasUserDetails_2_0= 'implements' )
                    // InternalSocialRequest.g:295:6: lv_hasUserDetails_2_0= 'implements'
                    {
                    lv_hasUserDetails_2_0=(Token)match(input,19,FOLLOW_9); 

                    						newLeafNode(lv_hasUserDetails_2_0, grammarAccess.getEntityAccess().getHasUserDetailsImplementsKeyword_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEntityRule());
                    						}
                    						setWithLastConsumed(current, "hasUserDetails", lv_hasUserDetails_2_0, "implements");
                    					

                    }


                    }

                    otherlv_3=(Token)match(input,20,FOLLOW_5); 

                    				newLeafNode(otherlv_3, grammarAccess.getEntityAccess().getUserDetailsKeyword_2_1());
                    			

                    }
                    break;

            }

            otherlv_4=(Token)match(input,15,FOLLOW_10); 

            			newLeafNode(otherlv_4, grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalSocialRequest.g:316:3: ( (lv_attributes_5_0= ruleAttribute ) )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID||(LA6_0>=38 && LA6_0<=41)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalSocialRequest.g:317:4: (lv_attributes_5_0= ruleAttribute )
            	    {
            	    // InternalSocialRequest.g:317:4: (lv_attributes_5_0= ruleAttribute )
            	    // InternalSocialRequest.g:318:5: lv_attributes_5_0= ruleAttribute
            	    {

            	    					newCompositeNode(grammarAccess.getEntityAccess().getAttributesAttributeParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_11);
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
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);

            otherlv_6=(Token)match(input,16,FOLLOW_2); 

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
    // InternalSocialRequest.g:343:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // InternalSocialRequest.g:343:50: (iv_ruleAttribute= ruleAttribute EOF )
            // InternalSocialRequest.g:344:2: iv_ruleAttribute= ruleAttribute EOF
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
    // InternalSocialRequest.g:350:1: ruleAttribute returns [EObject current=null] : ( ( (lv_association_0_0= ruleASSOCIATION ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_typeRef_3_0= ruleTypeReference ) ) ( (lv_modifier_4_0= ruleModifier ) )? (otherlv_5= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_7= 'mappedBy:' ( (lv_mappedBy_8_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'fetch:' ( (lv_fetchType_10_0= RULE_FETCHTYPE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'validations' otherlv_12= '{' ( (lv_validations_13_0= ruleValidation ) )+ otherlv_14= '}' ) ) ) ) )* ) ) ) otherlv_15= '}' )? ) ;
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
            // InternalSocialRequest.g:356:2: ( ( ( (lv_association_0_0= ruleASSOCIATION ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_typeRef_3_0= ruleTypeReference ) ) ( (lv_modifier_4_0= ruleModifier ) )? (otherlv_5= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_7= 'mappedBy:' ( (lv_mappedBy_8_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'fetch:' ( (lv_fetchType_10_0= RULE_FETCHTYPE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'validations' otherlv_12= '{' ( (lv_validations_13_0= ruleValidation ) )+ otherlv_14= '}' ) ) ) ) )* ) ) ) otherlv_15= '}' )? ) )
            // InternalSocialRequest.g:357:2: ( ( (lv_association_0_0= ruleASSOCIATION ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_typeRef_3_0= ruleTypeReference ) ) ( (lv_modifier_4_0= ruleModifier ) )? (otherlv_5= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_7= 'mappedBy:' ( (lv_mappedBy_8_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'fetch:' ( (lv_fetchType_10_0= RULE_FETCHTYPE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'validations' otherlv_12= '{' ( (lv_validations_13_0= ruleValidation ) )+ otherlv_14= '}' ) ) ) ) )* ) ) ) otherlv_15= '}' )? )
            {
            // InternalSocialRequest.g:357:2: ( ( (lv_association_0_0= ruleASSOCIATION ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_typeRef_3_0= ruleTypeReference ) ) ( (lv_modifier_4_0= ruleModifier ) )? (otherlv_5= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_7= 'mappedBy:' ( (lv_mappedBy_8_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'fetch:' ( (lv_fetchType_10_0= RULE_FETCHTYPE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'validations' otherlv_12= '{' ( (lv_validations_13_0= ruleValidation ) )+ otherlv_14= '}' ) ) ) ) )* ) ) ) otherlv_15= '}' )? )
            // InternalSocialRequest.g:358:3: ( (lv_association_0_0= ruleASSOCIATION ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_typeRef_3_0= ruleTypeReference ) ) ( (lv_modifier_4_0= ruleModifier ) )? (otherlv_5= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_7= 'mappedBy:' ( (lv_mappedBy_8_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'fetch:' ( (lv_fetchType_10_0= RULE_FETCHTYPE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'validations' otherlv_12= '{' ( (lv_validations_13_0= ruleValidation ) )+ otherlv_14= '}' ) ) ) ) )* ) ) ) otherlv_15= '}' )?
            {
            // InternalSocialRequest.g:358:3: ( (lv_association_0_0= ruleASSOCIATION ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=38 && LA7_0<=41)) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalSocialRequest.g:359:4: (lv_association_0_0= ruleASSOCIATION )
                    {
                    // InternalSocialRequest.g:359:4: (lv_association_0_0= ruleASSOCIATION )
                    // InternalSocialRequest.g:360:5: lv_association_0_0= ruleASSOCIATION
                    {

                    					newCompositeNode(grammarAccess.getAttributeAccess().getAssociationASSOCIATIONParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_4);
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

            // InternalSocialRequest.g:377:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSocialRequest.g:378:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSocialRequest.g:378:4: (lv_name_1_0= RULE_ID )
            // InternalSocialRequest.g:379:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_12); 

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

            otherlv_2=(Token)match(input,21,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getAttributeAccess().getColonKeyword_2());
            		
            // InternalSocialRequest.g:399:3: ( (lv_typeRef_3_0= ruleTypeReference ) )
            // InternalSocialRequest.g:400:4: (lv_typeRef_3_0= ruleTypeReference )
            {
            // InternalSocialRequest.g:400:4: (lv_typeRef_3_0= ruleTypeReference )
            // InternalSocialRequest.g:401:5: lv_typeRef_3_0= ruleTypeReference
            {

            					newCompositeNode(grammarAccess.getAttributeAccess().getTypeRefTypeReferenceParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_14);
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

            // InternalSocialRequest.g:418:3: ( (lv_modifier_4_0= ruleModifier ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>=25 && LA8_0<=27)) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalSocialRequest.g:419:4: (lv_modifier_4_0= ruleModifier )
                    {
                    // InternalSocialRequest.g:419:4: (lv_modifier_4_0= ruleModifier )
                    // InternalSocialRequest.g:420:5: lv_modifier_4_0= ruleModifier
                    {

                    					newCompositeNode(grammarAccess.getAttributeAccess().getModifierModifierParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_15);
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

            // InternalSocialRequest.g:437:3: (otherlv_5= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_7= 'mappedBy:' ( (lv_mappedBy_8_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'fetch:' ( (lv_fetchType_10_0= RULE_FETCHTYPE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'validations' otherlv_12= '{' ( (lv_validations_13_0= ruleValidation ) )+ otherlv_14= '}' ) ) ) ) )* ) ) ) otherlv_15= '}' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==15) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalSocialRequest.g:438:4: otherlv_5= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_7= 'mappedBy:' ( (lv_mappedBy_8_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'fetch:' ( (lv_fetchType_10_0= RULE_FETCHTYPE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'validations' otherlv_12= '{' ( (lv_validations_13_0= ruleValidation ) )+ otherlv_14= '}' ) ) ) ) )* ) ) ) otherlv_15= '}'
                    {
                    otherlv_5=(Token)match(input,15,FOLLOW_16); 

                    				newLeafNode(otherlv_5, grammarAccess.getAttributeAccess().getLeftCurlyBracketKeyword_5_0());
                    			
                    // InternalSocialRequest.g:442:4: ( ( ( ( ({...}? => ( ({...}? => (otherlv_7= 'mappedBy:' ( (lv_mappedBy_8_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'fetch:' ( (lv_fetchType_10_0= RULE_FETCHTYPE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'validations' otherlv_12= '{' ( (lv_validations_13_0= ruleValidation ) )+ otherlv_14= '}' ) ) ) ) )* ) ) )
                    // InternalSocialRequest.g:443:5: ( ( ( ({...}? => ( ({...}? => (otherlv_7= 'mappedBy:' ( (lv_mappedBy_8_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'fetch:' ( (lv_fetchType_10_0= RULE_FETCHTYPE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'validations' otherlv_12= '{' ( (lv_validations_13_0= ruleValidation ) )+ otherlv_14= '}' ) ) ) ) )* ) )
                    {
                    // InternalSocialRequest.g:443:5: ( ( ( ({...}? => ( ({...}? => (otherlv_7= 'mappedBy:' ( (lv_mappedBy_8_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'fetch:' ( (lv_fetchType_10_0= RULE_FETCHTYPE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'validations' otherlv_12= '{' ( (lv_validations_13_0= ruleValidation ) )+ otherlv_14= '}' ) ) ) ) )* ) )
                    // InternalSocialRequest.g:444:6: ( ( ({...}? => ( ({...}? => (otherlv_7= 'mappedBy:' ( (lv_mappedBy_8_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'fetch:' ( (lv_fetchType_10_0= RULE_FETCHTYPE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'validations' otherlv_12= '{' ( (lv_validations_13_0= ruleValidation ) )+ otherlv_14= '}' ) ) ) ) )* )
                    {
                     
                    					  getUnorderedGroupHelper().enter(grammarAccess.getAttributeAccess().getUnorderedGroup_5_1());
                    					
                    // InternalSocialRequest.g:447:6: ( ( ({...}? => ( ({...}? => (otherlv_7= 'mappedBy:' ( (lv_mappedBy_8_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'fetch:' ( (lv_fetchType_10_0= RULE_FETCHTYPE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'validations' otherlv_12= '{' ( (lv_validations_13_0= ruleValidation ) )+ otherlv_14= '}' ) ) ) ) )* )
                    // InternalSocialRequest.g:448:7: ( ({...}? => ( ({...}? => (otherlv_7= 'mappedBy:' ( (lv_mappedBy_8_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'fetch:' ( (lv_fetchType_10_0= RULE_FETCHTYPE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'validations' otherlv_12= '{' ( (lv_validations_13_0= ruleValidation ) )+ otherlv_14= '}' ) ) ) ) )*
                    {
                    // InternalSocialRequest.g:448:7: ( ({...}? => ( ({...}? => (otherlv_7= 'mappedBy:' ( (lv_mappedBy_8_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'fetch:' ( (lv_fetchType_10_0= RULE_FETCHTYPE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'validations' otherlv_12= '{' ( (lv_validations_13_0= ruleValidation ) )+ otherlv_14= '}' ) ) ) ) )*
                    loop10:
                    do {
                        int alt10=4;
                        int LA10_0 = input.LA(1);

                        if ( LA10_0 == 22 && getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_1(), 0) ) {
                            alt10=1;
                        }
                        else if ( LA10_0 == 23 && getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_1(), 1) ) {
                            alt10=2;
                        }
                        else if ( LA10_0 == 24 && getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_1(), 2) ) {
                            alt10=3;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalSocialRequest.g:449:5: ({...}? => ( ({...}? => (otherlv_7= 'mappedBy:' ( (lv_mappedBy_8_0= RULE_ID ) ) ) ) ) )
                    	    {
                    	    // InternalSocialRequest.g:449:5: ({...}? => ( ({...}? => (otherlv_7= 'mappedBy:' ( (lv_mappedBy_8_0= RULE_ID ) ) ) ) ) )
                    	    // InternalSocialRequest.g:450:6: {...}? => ( ({...}? => (otherlv_7= 'mappedBy:' ( (lv_mappedBy_8_0= RULE_ID ) ) ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_1(), 0) ) {
                    	        throw new FailedPredicateException(input, "ruleAttribute", "getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_1(), 0)");
                    	    }
                    	    // InternalSocialRequest.g:450:109: ( ({...}? => (otherlv_7= 'mappedBy:' ( (lv_mappedBy_8_0= RULE_ID ) ) ) ) )
                    	    // InternalSocialRequest.g:451:7: ({...}? => (otherlv_7= 'mappedBy:' ( (lv_mappedBy_8_0= RULE_ID ) ) ) )
                    	    {

                    	    							getUnorderedGroupHelper().select(grammarAccess.getAttributeAccess().getUnorderedGroup_5_1(), 0);
                    	    						
                    	    // InternalSocialRequest.g:454:10: ({...}? => (otherlv_7= 'mappedBy:' ( (lv_mappedBy_8_0= RULE_ID ) ) ) )
                    	    // InternalSocialRequest.g:454:11: {...}? => (otherlv_7= 'mappedBy:' ( (lv_mappedBy_8_0= RULE_ID ) ) )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleAttribute", "true");
                    	    }
                    	    // InternalSocialRequest.g:454:20: (otherlv_7= 'mappedBy:' ( (lv_mappedBy_8_0= RULE_ID ) ) )
                    	    // InternalSocialRequest.g:454:21: otherlv_7= 'mappedBy:' ( (lv_mappedBy_8_0= RULE_ID ) )
                    	    {
                    	    otherlv_7=(Token)match(input,22,FOLLOW_4); 

                    	    										newLeafNode(otherlv_7, grammarAccess.getAttributeAccess().getMappedByKeyword_5_1_0_0());
                    	    									
                    	    // InternalSocialRequest.g:458:10: ( (lv_mappedBy_8_0= RULE_ID ) )
                    	    // InternalSocialRequest.g:459:11: (lv_mappedBy_8_0= RULE_ID )
                    	    {
                    	    // InternalSocialRequest.g:459:11: (lv_mappedBy_8_0= RULE_ID )
                    	    // InternalSocialRequest.g:460:12: lv_mappedBy_8_0= RULE_ID
                    	    {
                    	    lv_mappedBy_8_0=(Token)match(input,RULE_ID,FOLLOW_16); 

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
                    	    // InternalSocialRequest.g:482:5: ({...}? => ( ({...}? => (otherlv_9= 'fetch:' ( (lv_fetchType_10_0= RULE_FETCHTYPE ) ) ) ) ) )
                    	    {
                    	    // InternalSocialRequest.g:482:5: ({...}? => ( ({...}? => (otherlv_9= 'fetch:' ( (lv_fetchType_10_0= RULE_FETCHTYPE ) ) ) ) ) )
                    	    // InternalSocialRequest.g:483:6: {...}? => ( ({...}? => (otherlv_9= 'fetch:' ( (lv_fetchType_10_0= RULE_FETCHTYPE ) ) ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_1(), 1) ) {
                    	        throw new FailedPredicateException(input, "ruleAttribute", "getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_1(), 1)");
                    	    }
                    	    // InternalSocialRequest.g:483:109: ( ({...}? => (otherlv_9= 'fetch:' ( (lv_fetchType_10_0= RULE_FETCHTYPE ) ) ) ) )
                    	    // InternalSocialRequest.g:484:7: ({...}? => (otherlv_9= 'fetch:' ( (lv_fetchType_10_0= RULE_FETCHTYPE ) ) ) )
                    	    {

                    	    							getUnorderedGroupHelper().select(grammarAccess.getAttributeAccess().getUnorderedGroup_5_1(), 1);
                    	    						
                    	    // InternalSocialRequest.g:487:10: ({...}? => (otherlv_9= 'fetch:' ( (lv_fetchType_10_0= RULE_FETCHTYPE ) ) ) )
                    	    // InternalSocialRequest.g:487:11: {...}? => (otherlv_9= 'fetch:' ( (lv_fetchType_10_0= RULE_FETCHTYPE ) ) )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleAttribute", "true");
                    	    }
                    	    // InternalSocialRequest.g:487:20: (otherlv_9= 'fetch:' ( (lv_fetchType_10_0= RULE_FETCHTYPE ) ) )
                    	    // InternalSocialRequest.g:487:21: otherlv_9= 'fetch:' ( (lv_fetchType_10_0= RULE_FETCHTYPE ) )
                    	    {
                    	    otherlv_9=(Token)match(input,23,FOLLOW_17); 

                    	    										newLeafNode(otherlv_9, grammarAccess.getAttributeAccess().getFetchKeyword_5_1_1_0());
                    	    									
                    	    // InternalSocialRequest.g:491:10: ( (lv_fetchType_10_0= RULE_FETCHTYPE ) )
                    	    // InternalSocialRequest.g:492:11: (lv_fetchType_10_0= RULE_FETCHTYPE )
                    	    {
                    	    // InternalSocialRequest.g:492:11: (lv_fetchType_10_0= RULE_FETCHTYPE )
                    	    // InternalSocialRequest.g:493:12: lv_fetchType_10_0= RULE_FETCHTYPE
                    	    {
                    	    lv_fetchType_10_0=(Token)match(input,RULE_FETCHTYPE,FOLLOW_16); 

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
                    	    // InternalSocialRequest.g:515:5: ({...}? => ( ({...}? => (otherlv_11= 'validations' otherlv_12= '{' ( (lv_validations_13_0= ruleValidation ) )+ otherlv_14= '}' ) ) ) )
                    	    {
                    	    // InternalSocialRequest.g:515:5: ({...}? => ( ({...}? => (otherlv_11= 'validations' otherlv_12= '{' ( (lv_validations_13_0= ruleValidation ) )+ otherlv_14= '}' ) ) ) )
                    	    // InternalSocialRequest.g:516:6: {...}? => ( ({...}? => (otherlv_11= 'validations' otherlv_12= '{' ( (lv_validations_13_0= ruleValidation ) )+ otherlv_14= '}' ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_1(), 2) ) {
                    	        throw new FailedPredicateException(input, "ruleAttribute", "getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_1(), 2)");
                    	    }
                    	    // InternalSocialRequest.g:516:109: ( ({...}? => (otherlv_11= 'validations' otherlv_12= '{' ( (lv_validations_13_0= ruleValidation ) )+ otherlv_14= '}' ) ) )
                    	    // InternalSocialRequest.g:517:7: ({...}? => (otherlv_11= 'validations' otherlv_12= '{' ( (lv_validations_13_0= ruleValidation ) )+ otherlv_14= '}' ) )
                    	    {

                    	    							getUnorderedGroupHelper().select(grammarAccess.getAttributeAccess().getUnorderedGroup_5_1(), 2);
                    	    						
                    	    // InternalSocialRequest.g:520:10: ({...}? => (otherlv_11= 'validations' otherlv_12= '{' ( (lv_validations_13_0= ruleValidation ) )+ otherlv_14= '}' ) )
                    	    // InternalSocialRequest.g:520:11: {...}? => (otherlv_11= 'validations' otherlv_12= '{' ( (lv_validations_13_0= ruleValidation ) )+ otherlv_14= '}' )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleAttribute", "true");
                    	    }
                    	    // InternalSocialRequest.g:520:20: (otherlv_11= 'validations' otherlv_12= '{' ( (lv_validations_13_0= ruleValidation ) )+ otherlv_14= '}' )
                    	    // InternalSocialRequest.g:520:21: otherlv_11= 'validations' otherlv_12= '{' ( (lv_validations_13_0= ruleValidation ) )+ otherlv_14= '}'
                    	    {
                    	    otherlv_11=(Token)match(input,24,FOLLOW_5); 

                    	    										newLeafNode(otherlv_11, grammarAccess.getAttributeAccess().getValidationsKeyword_5_1_2_0());
                    	    									
                    	    otherlv_12=(Token)match(input,15,FOLLOW_18); 

                    	    										newLeafNode(otherlv_12, grammarAccess.getAttributeAccess().getLeftCurlyBracketKeyword_5_1_2_1());
                    	    									
                    	    // InternalSocialRequest.g:528:10: ( (lv_validations_13_0= ruleValidation ) )+
                    	    int cnt9=0;
                    	    loop9:
                    	    do {
                    	        int alt9=2;
                    	        int LA9_0 = input.LA(1);

                    	        if ( ((LA9_0>=30 && LA9_0<=37)) ) {
                    	            alt9=1;
                    	        }


                    	        switch (alt9) {
                    	    	case 1 :
                    	    	    // InternalSocialRequest.g:529:11: (lv_validations_13_0= ruleValidation )
                    	    	    {
                    	    	    // InternalSocialRequest.g:529:11: (lv_validations_13_0= ruleValidation )
                    	    	    // InternalSocialRequest.g:530:12: lv_validations_13_0= ruleValidation
                    	    	    {

                    	    	    												newCompositeNode(grammarAccess.getAttributeAccess().getValidationsValidationParserRuleCall_5_1_2_2_0());
                    	    	    											
                    	    	    pushFollow(FOLLOW_19);
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
                    	    	    if ( cnt9 >= 1 ) break loop9;
                    	                EarlyExitException eee =
                    	                    new EarlyExitException(9, input);
                    	                throw eee;
                    	        }
                    	        cnt9++;
                    	    } while (true);

                    	    otherlv_14=(Token)match(input,16,FOLLOW_16); 

                    	    										newLeafNode(otherlv_14, grammarAccess.getAttributeAccess().getRightCurlyBracketKeyword_5_1_2_3());
                    	    									

                    	    }


                    	    }

                    	     
                    	    							getUnorderedGroupHelper().returnFromSelection(grammarAccess.getAttributeAccess().getUnorderedGroup_5_1());
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);


                    }


                    }

                     
                    					  getUnorderedGroupHelper().leave(grammarAccess.getAttributeAccess().getUnorderedGroup_5_1());
                    					

                    }

                    otherlv_15=(Token)match(input,16,FOLLOW_2); 

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
    // InternalSocialRequest.g:573:1: entryRuleTypeReference returns [EObject current=null] : iv_ruleTypeReference= ruleTypeReference EOF ;
    public final EObject entryRuleTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeReference = null;


        try {
            // InternalSocialRequest.g:573:54: (iv_ruleTypeReference= ruleTypeReference EOF )
            // InternalSocialRequest.g:574:2: iv_ruleTypeReference= ruleTypeReference EOF
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
    // InternalSocialRequest.g:580:1: ruleTypeReference returns [EObject current=null] : (this_EntityTypeReference_0= ruleEntityTypeReference | this_DataTypeReference_1= ruleDataTypeReference ) ;
    public final EObject ruleTypeReference() throws RecognitionException {
        EObject current = null;

        EObject this_EntityTypeReference_0 = null;

        EObject this_DataTypeReference_1 = null;



        	enterRule();

        try {
            // InternalSocialRequest.g:586:2: ( (this_EntityTypeReference_0= ruleEntityTypeReference | this_DataTypeReference_1= ruleDataTypeReference ) )
            // InternalSocialRequest.g:587:2: (this_EntityTypeReference_0= ruleEntityTypeReference | this_DataTypeReference_1= ruleDataTypeReference )
            {
            // InternalSocialRequest.g:587:2: (this_EntityTypeReference_0= ruleEntityTypeReference | this_DataTypeReference_1= ruleDataTypeReference )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_ID) ) {
                alt12=1;
            }
            else if ( ((LA12_0>=52 && LA12_0<=59)) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalSocialRequest.g:588:3: this_EntityTypeReference_0= ruleEntityTypeReference
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
                    // InternalSocialRequest.g:597:3: this_DataTypeReference_1= ruleDataTypeReference
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
    // InternalSocialRequest.g:609:1: entryRuleEntityTypeReference returns [EObject current=null] : iv_ruleEntityTypeReference= ruleEntityTypeReference EOF ;
    public final EObject entryRuleEntityTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntityTypeReference = null;


        try {
            // InternalSocialRequest.g:609:60: (iv_ruleEntityTypeReference= ruleEntityTypeReference EOF )
            // InternalSocialRequest.g:610:2: iv_ruleEntityTypeReference= ruleEntityTypeReference EOF
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
    // InternalSocialRequest.g:616:1: ruleEntityTypeReference returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleEntityTypeReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalSocialRequest.g:622:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalSocialRequest.g:623:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalSocialRequest.g:623:2: ( (otherlv_0= RULE_ID ) )
            // InternalSocialRequest.g:624:3: (otherlv_0= RULE_ID )
            {
            // InternalSocialRequest.g:624:3: (otherlv_0= RULE_ID )
            // InternalSocialRequest.g:625:4: otherlv_0= RULE_ID
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
    // InternalSocialRequest.g:639:1: entryRuleDataTypeReference returns [EObject current=null] : iv_ruleDataTypeReference= ruleDataTypeReference EOF ;
    public final EObject entryRuleDataTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataTypeReference = null;


        try {
            // InternalSocialRequest.g:639:58: (iv_ruleDataTypeReference= ruleDataTypeReference EOF )
            // InternalSocialRequest.g:640:2: iv_ruleDataTypeReference= ruleDataTypeReference EOF
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
    // InternalSocialRequest.g:646:1: ruleDataTypeReference returns [EObject current=null] : ( (lv_type_0_0= ruleDataType ) ) ;
    public final EObject ruleDataTypeReference() throws RecognitionException {
        EObject current = null;

        Enumerator lv_type_0_0 = null;



        	enterRule();

        try {
            // InternalSocialRequest.g:652:2: ( ( (lv_type_0_0= ruleDataType ) ) )
            // InternalSocialRequest.g:653:2: ( (lv_type_0_0= ruleDataType ) )
            {
            // InternalSocialRequest.g:653:2: ( (lv_type_0_0= ruleDataType ) )
            // InternalSocialRequest.g:654:3: (lv_type_0_0= ruleDataType )
            {
            // InternalSocialRequest.g:654:3: (lv_type_0_0= ruleDataType )
            // InternalSocialRequest.g:655:4: lv_type_0_0= ruleDataType
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
    // InternalSocialRequest.g:675:1: entryRuleModifier returns [EObject current=null] : iv_ruleModifier= ruleModifier EOF ;
    public final EObject entryRuleModifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModifier = null;


        try {
            // InternalSocialRequest.g:675:49: (iv_ruleModifier= ruleModifier EOF )
            // InternalSocialRequest.g:676:2: iv_ruleModifier= ruleModifier EOF
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
    // InternalSocialRequest.g:682:1: ruleModifier returns [EObject current=null] : ( ( (lv_isLOB_0_0= 'LOB' ) ) | ( (lv_isTransient_1_0= 'TRANSIENT' ) ) | ( ( (lv_isID_2_0= 'ID' ) ) (otherlv_3= '(' ( (lv_IDGenerationType_4_0= RULE_GENERATIONTYPE ) ) otherlv_5= ')' )? ) ) ;
    public final EObject ruleModifier() throws RecognitionException {
        EObject current = null;

        Token lv_isLOB_0_0=null;
        Token lv_isTransient_1_0=null;
        Token lv_isID_2_0=null;
        Token otherlv_3=null;
        Token lv_IDGenerationType_4_0=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalSocialRequest.g:688:2: ( ( ( (lv_isLOB_0_0= 'LOB' ) ) | ( (lv_isTransient_1_0= 'TRANSIENT' ) ) | ( ( (lv_isID_2_0= 'ID' ) ) (otherlv_3= '(' ( (lv_IDGenerationType_4_0= RULE_GENERATIONTYPE ) ) otherlv_5= ')' )? ) ) )
            // InternalSocialRequest.g:689:2: ( ( (lv_isLOB_0_0= 'LOB' ) ) | ( (lv_isTransient_1_0= 'TRANSIENT' ) ) | ( ( (lv_isID_2_0= 'ID' ) ) (otherlv_3= '(' ( (lv_IDGenerationType_4_0= RULE_GENERATIONTYPE ) ) otherlv_5= ')' )? ) )
            {
            // InternalSocialRequest.g:689:2: ( ( (lv_isLOB_0_0= 'LOB' ) ) | ( (lv_isTransient_1_0= 'TRANSIENT' ) ) | ( ( (lv_isID_2_0= 'ID' ) ) (otherlv_3= '(' ( (lv_IDGenerationType_4_0= RULE_GENERATIONTYPE ) ) otherlv_5= ')' )? ) )
            int alt14=3;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt14=1;
                }
                break;
            case 26:
                {
                alt14=2;
                }
                break;
            case 27:
                {
                alt14=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // InternalSocialRequest.g:690:3: ( (lv_isLOB_0_0= 'LOB' ) )
                    {
                    // InternalSocialRequest.g:690:3: ( (lv_isLOB_0_0= 'LOB' ) )
                    // InternalSocialRequest.g:691:4: (lv_isLOB_0_0= 'LOB' )
                    {
                    // InternalSocialRequest.g:691:4: (lv_isLOB_0_0= 'LOB' )
                    // InternalSocialRequest.g:692:5: lv_isLOB_0_0= 'LOB'
                    {
                    lv_isLOB_0_0=(Token)match(input,25,FOLLOW_2); 

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
                    // InternalSocialRequest.g:705:3: ( (lv_isTransient_1_0= 'TRANSIENT' ) )
                    {
                    // InternalSocialRequest.g:705:3: ( (lv_isTransient_1_0= 'TRANSIENT' ) )
                    // InternalSocialRequest.g:706:4: (lv_isTransient_1_0= 'TRANSIENT' )
                    {
                    // InternalSocialRequest.g:706:4: (lv_isTransient_1_0= 'TRANSIENT' )
                    // InternalSocialRequest.g:707:5: lv_isTransient_1_0= 'TRANSIENT'
                    {
                    lv_isTransient_1_0=(Token)match(input,26,FOLLOW_2); 

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
                    // InternalSocialRequest.g:720:3: ( ( (lv_isID_2_0= 'ID' ) ) (otherlv_3= '(' ( (lv_IDGenerationType_4_0= RULE_GENERATIONTYPE ) ) otherlv_5= ')' )? )
                    {
                    // InternalSocialRequest.g:720:3: ( ( (lv_isID_2_0= 'ID' ) ) (otherlv_3= '(' ( (lv_IDGenerationType_4_0= RULE_GENERATIONTYPE ) ) otherlv_5= ')' )? )
                    // InternalSocialRequest.g:721:4: ( (lv_isID_2_0= 'ID' ) ) (otherlv_3= '(' ( (lv_IDGenerationType_4_0= RULE_GENERATIONTYPE ) ) otherlv_5= ')' )?
                    {
                    // InternalSocialRequest.g:721:4: ( (lv_isID_2_0= 'ID' ) )
                    // InternalSocialRequest.g:722:5: (lv_isID_2_0= 'ID' )
                    {
                    // InternalSocialRequest.g:722:5: (lv_isID_2_0= 'ID' )
                    // InternalSocialRequest.g:723:6: lv_isID_2_0= 'ID'
                    {
                    lv_isID_2_0=(Token)match(input,27,FOLLOW_20); 

                    						newLeafNode(lv_isID_2_0, grammarAccess.getModifierAccess().getIsIDIDKeyword_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getModifierRule());
                    						}
                    						setWithLastConsumed(current, "isID", true, "ID");
                    					

                    }


                    }

                    // InternalSocialRequest.g:735:4: (otherlv_3= '(' ( (lv_IDGenerationType_4_0= RULE_GENERATIONTYPE ) ) otherlv_5= ')' )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==28) ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // InternalSocialRequest.g:736:5: otherlv_3= '(' ( (lv_IDGenerationType_4_0= RULE_GENERATIONTYPE ) ) otherlv_5= ')'
                            {
                            otherlv_3=(Token)match(input,28,FOLLOW_21); 

                            					newLeafNode(otherlv_3, grammarAccess.getModifierAccess().getLeftParenthesisKeyword_2_1_0());
                            				
                            // InternalSocialRequest.g:740:5: ( (lv_IDGenerationType_4_0= RULE_GENERATIONTYPE ) )
                            // InternalSocialRequest.g:741:6: (lv_IDGenerationType_4_0= RULE_GENERATIONTYPE )
                            {
                            // InternalSocialRequest.g:741:6: (lv_IDGenerationType_4_0= RULE_GENERATIONTYPE )
                            // InternalSocialRequest.g:742:7: lv_IDGenerationType_4_0= RULE_GENERATIONTYPE
                            {
                            lv_IDGenerationType_4_0=(Token)match(input,RULE_GENERATIONTYPE,FOLLOW_22); 

                            							newLeafNode(lv_IDGenerationType_4_0, grammarAccess.getModifierAccess().getIDGenerationTypeGENERATIONTYPETerminalRuleCall_2_1_1_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getModifierRule());
                            							}
                            							setWithLastConsumed(
                            								current,
                            								"IDGenerationType",
                            								lv_IDGenerationType_4_0,
                            								"org.xtext.example.mydsl.SocialRequest.GENERATIONTYPE");
                            						

                            }


                            }

                            otherlv_5=(Token)match(input,29,FOLLOW_2); 

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
    // InternalSocialRequest.g:768:1: entryRuleValidation returns [EObject current=null] : iv_ruleValidation= ruleValidation EOF ;
    public final EObject entryRuleValidation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValidation = null;


        try {
            // InternalSocialRequest.g:768:51: (iv_ruleValidation= ruleValidation EOF )
            // InternalSocialRequest.g:769:2: iv_ruleValidation= ruleValidation EOF
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
    // InternalSocialRequest.g:775:1: ruleValidation returns [EObject current=null] : ( (otherlv_0= 'min:' ( (lv_min_1_0= RULE_POSSIBLY_SIGNED_INT ) ) ) | (otherlv_2= 'max:' ( (lv_max_3_0= RULE_POSSIBLY_SIGNED_INT ) ) ) | (otherlv_4= 'pattern:' ( (lv_regex_5_0= RULE_STRING ) ) ) | ( (lv_validator_6_0= ruleBASICVALIDATION ) ) | ( (lv_unique_7_0= 'unique' ) ) ) ;
    public final EObject ruleValidation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_min_1_0=null;
        Token otherlv_2=null;
        Token lv_max_3_0=null;
        Token otherlv_4=null;
        Token lv_regex_5_0=null;
        Token lv_unique_7_0=null;
        AntlrDatatypeRuleToken lv_validator_6_0 = null;



        	enterRule();

        try {
            // InternalSocialRequest.g:781:2: ( ( (otherlv_0= 'min:' ( (lv_min_1_0= RULE_POSSIBLY_SIGNED_INT ) ) ) | (otherlv_2= 'max:' ( (lv_max_3_0= RULE_POSSIBLY_SIGNED_INT ) ) ) | (otherlv_4= 'pattern:' ( (lv_regex_5_0= RULE_STRING ) ) ) | ( (lv_validator_6_0= ruleBASICVALIDATION ) ) | ( (lv_unique_7_0= 'unique' ) ) ) )
            // InternalSocialRequest.g:782:2: ( (otherlv_0= 'min:' ( (lv_min_1_0= RULE_POSSIBLY_SIGNED_INT ) ) ) | (otherlv_2= 'max:' ( (lv_max_3_0= RULE_POSSIBLY_SIGNED_INT ) ) ) | (otherlv_4= 'pattern:' ( (lv_regex_5_0= RULE_STRING ) ) ) | ( (lv_validator_6_0= ruleBASICVALIDATION ) ) | ( (lv_unique_7_0= 'unique' ) ) )
            {
            // InternalSocialRequest.g:782:2: ( (otherlv_0= 'min:' ( (lv_min_1_0= RULE_POSSIBLY_SIGNED_INT ) ) ) | (otherlv_2= 'max:' ( (lv_max_3_0= RULE_POSSIBLY_SIGNED_INT ) ) ) | (otherlv_4= 'pattern:' ( (lv_regex_5_0= RULE_STRING ) ) ) | ( (lv_validator_6_0= ruleBASICVALIDATION ) ) | ( (lv_unique_7_0= 'unique' ) ) )
            int alt15=5;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt15=1;
                }
                break;
            case 31:
                {
                alt15=2;
                }
                break;
            case 32:
                {
                alt15=3;
                }
                break;
            case 34:
            case 35:
            case 36:
            case 37:
                {
                alt15=4;
                }
                break;
            case 33:
                {
                alt15=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // InternalSocialRequest.g:783:3: (otherlv_0= 'min:' ( (lv_min_1_0= RULE_POSSIBLY_SIGNED_INT ) ) )
                    {
                    // InternalSocialRequest.g:783:3: (otherlv_0= 'min:' ( (lv_min_1_0= RULE_POSSIBLY_SIGNED_INT ) ) )
                    // InternalSocialRequest.g:784:4: otherlv_0= 'min:' ( (lv_min_1_0= RULE_POSSIBLY_SIGNED_INT ) )
                    {
                    otherlv_0=(Token)match(input,30,FOLLOW_23); 

                    				newLeafNode(otherlv_0, grammarAccess.getValidationAccess().getMinKeyword_0_0());
                    			
                    // InternalSocialRequest.g:788:4: ( (lv_min_1_0= RULE_POSSIBLY_SIGNED_INT ) )
                    // InternalSocialRequest.g:789:5: (lv_min_1_0= RULE_POSSIBLY_SIGNED_INT )
                    {
                    // InternalSocialRequest.g:789:5: (lv_min_1_0= RULE_POSSIBLY_SIGNED_INT )
                    // InternalSocialRequest.g:790:6: lv_min_1_0= RULE_POSSIBLY_SIGNED_INT
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
                    // InternalSocialRequest.g:808:3: (otherlv_2= 'max:' ( (lv_max_3_0= RULE_POSSIBLY_SIGNED_INT ) ) )
                    {
                    // InternalSocialRequest.g:808:3: (otherlv_2= 'max:' ( (lv_max_3_0= RULE_POSSIBLY_SIGNED_INT ) ) )
                    // InternalSocialRequest.g:809:4: otherlv_2= 'max:' ( (lv_max_3_0= RULE_POSSIBLY_SIGNED_INT ) )
                    {
                    otherlv_2=(Token)match(input,31,FOLLOW_23); 

                    				newLeafNode(otherlv_2, grammarAccess.getValidationAccess().getMaxKeyword_1_0());
                    			
                    // InternalSocialRequest.g:813:4: ( (lv_max_3_0= RULE_POSSIBLY_SIGNED_INT ) )
                    // InternalSocialRequest.g:814:5: (lv_max_3_0= RULE_POSSIBLY_SIGNED_INT )
                    {
                    // InternalSocialRequest.g:814:5: (lv_max_3_0= RULE_POSSIBLY_SIGNED_INT )
                    // InternalSocialRequest.g:815:6: lv_max_3_0= RULE_POSSIBLY_SIGNED_INT
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
                    // InternalSocialRequest.g:833:3: (otherlv_4= 'pattern:' ( (lv_regex_5_0= RULE_STRING ) ) )
                    {
                    // InternalSocialRequest.g:833:3: (otherlv_4= 'pattern:' ( (lv_regex_5_0= RULE_STRING ) ) )
                    // InternalSocialRequest.g:834:4: otherlv_4= 'pattern:' ( (lv_regex_5_0= RULE_STRING ) )
                    {
                    otherlv_4=(Token)match(input,32,FOLLOW_24); 

                    				newLeafNode(otherlv_4, grammarAccess.getValidationAccess().getPatternKeyword_2_0());
                    			
                    // InternalSocialRequest.g:838:4: ( (lv_regex_5_0= RULE_STRING ) )
                    // InternalSocialRequest.g:839:5: (lv_regex_5_0= RULE_STRING )
                    {
                    // InternalSocialRequest.g:839:5: (lv_regex_5_0= RULE_STRING )
                    // InternalSocialRequest.g:840:6: lv_regex_5_0= RULE_STRING
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
                    // InternalSocialRequest.g:858:3: ( (lv_validator_6_0= ruleBASICVALIDATION ) )
                    {
                    // InternalSocialRequest.g:858:3: ( (lv_validator_6_0= ruleBASICVALIDATION ) )
                    // InternalSocialRequest.g:859:4: (lv_validator_6_0= ruleBASICVALIDATION )
                    {
                    // InternalSocialRequest.g:859:4: (lv_validator_6_0= ruleBASICVALIDATION )
                    // InternalSocialRequest.g:860:5: lv_validator_6_0= ruleBASICVALIDATION
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
                case 5 :
                    // InternalSocialRequest.g:878:3: ( (lv_unique_7_0= 'unique' ) )
                    {
                    // InternalSocialRequest.g:878:3: ( (lv_unique_7_0= 'unique' ) )
                    // InternalSocialRequest.g:879:4: (lv_unique_7_0= 'unique' )
                    {
                    // InternalSocialRequest.g:879:4: (lv_unique_7_0= 'unique' )
                    // InternalSocialRequest.g:880:5: lv_unique_7_0= 'unique'
                    {
                    lv_unique_7_0=(Token)match(input,33,FOLLOW_2); 

                    					newLeafNode(lv_unique_7_0, grammarAccess.getValidationAccess().getUniqueUniqueKeyword_4_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getValidationRule());
                    					}
                    					setWithLastConsumed(current, "unique", true, "unique");
                    				

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
    // InternalSocialRequest.g:896:1: entryRuleBASICVALIDATION returns [String current=null] : iv_ruleBASICVALIDATION= ruleBASICVALIDATION EOF ;
    public final String entryRuleBASICVALIDATION() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBASICVALIDATION = null;


        try {
            // InternalSocialRequest.g:896:55: (iv_ruleBASICVALIDATION= ruleBASICVALIDATION EOF )
            // InternalSocialRequest.g:897:2: iv_ruleBASICVALIDATION= ruleBASICVALIDATION EOF
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
    // InternalSocialRequest.g:903:1: ruleBASICVALIDATION returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'NotNull' | kw= 'NotBlank' | kw= 'Past' | kw= 'Email' ) ;
    public final AntlrDatatypeRuleToken ruleBASICVALIDATION() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalSocialRequest.g:909:2: ( (kw= 'NotNull' | kw= 'NotBlank' | kw= 'Past' | kw= 'Email' ) )
            // InternalSocialRequest.g:910:2: (kw= 'NotNull' | kw= 'NotBlank' | kw= 'Past' | kw= 'Email' )
            {
            // InternalSocialRequest.g:910:2: (kw= 'NotNull' | kw= 'NotBlank' | kw= 'Past' | kw= 'Email' )
            int alt16=4;
            switch ( input.LA(1) ) {
            case 34:
                {
                alt16=1;
                }
                break;
            case 35:
                {
                alt16=2;
                }
                break;
            case 36:
                {
                alt16=3;
                }
                break;
            case 37:
                {
                alt16=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // InternalSocialRequest.g:911:3: kw= 'NotNull'
                    {
                    kw=(Token)match(input,34,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBASICVALIDATIONAccess().getNotNullKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalSocialRequest.g:917:3: kw= 'NotBlank'
                    {
                    kw=(Token)match(input,35,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBASICVALIDATIONAccess().getNotBlankKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalSocialRequest.g:923:3: kw= 'Past'
                    {
                    kw=(Token)match(input,36,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBASICVALIDATIONAccess().getPastKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalSocialRequest.g:929:3: kw= 'Email'
                    {
                    kw=(Token)match(input,37,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBASICVALIDATIONAccess().getEmailKeyword_3());
                    		

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
    // InternalSocialRequest.g:938:1: entryRuleASSOCIATION returns [String current=null] : iv_ruleASSOCIATION= ruleASSOCIATION EOF ;
    public final String entryRuleASSOCIATION() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleASSOCIATION = null;


        try {
            // InternalSocialRequest.g:938:51: (iv_ruleASSOCIATION= ruleASSOCIATION EOF )
            // InternalSocialRequest.g:939:2: iv_ruleASSOCIATION= ruleASSOCIATION EOF
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
    // InternalSocialRequest.g:945:1: ruleASSOCIATION returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'OneToMany' | kw= 'ManyToOne' | kw= 'OneToOne' | kw= 'ManyToMany' ) ;
    public final AntlrDatatypeRuleToken ruleASSOCIATION() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalSocialRequest.g:951:2: ( (kw= 'OneToMany' | kw= 'ManyToOne' | kw= 'OneToOne' | kw= 'ManyToMany' ) )
            // InternalSocialRequest.g:952:2: (kw= 'OneToMany' | kw= 'ManyToOne' | kw= 'OneToOne' | kw= 'ManyToMany' )
            {
            // InternalSocialRequest.g:952:2: (kw= 'OneToMany' | kw= 'ManyToOne' | kw= 'OneToOne' | kw= 'ManyToMany' )
            int alt17=4;
            switch ( input.LA(1) ) {
            case 38:
                {
                alt17=1;
                }
                break;
            case 39:
                {
                alt17=2;
                }
                break;
            case 40:
                {
                alt17=3;
                }
                break;
            case 41:
                {
                alt17=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // InternalSocialRequest.g:953:3: kw= 'OneToMany'
                    {
                    kw=(Token)match(input,38,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getASSOCIATIONAccess().getOneToManyKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalSocialRequest.g:959:3: kw= 'ManyToOne'
                    {
                    kw=(Token)match(input,39,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getASSOCIATIONAccess().getManyToOneKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalSocialRequest.g:965:3: kw= 'OneToOne'
                    {
                    kw=(Token)match(input,40,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getASSOCIATIONAccess().getOneToOneKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalSocialRequest.g:971:3: kw= 'ManyToMany'
                    {
                    kw=(Token)match(input,41,FOLLOW_2); 

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
    // InternalSocialRequest.g:980:1: entryRuleRepository returns [EObject current=null] : iv_ruleRepository= ruleRepository EOF ;
    public final EObject entryRuleRepository() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRepository = null;


        try {
            // InternalSocialRequest.g:980:51: (iv_ruleRepository= ruleRepository EOF )
            // InternalSocialRequest.g:981:2: iv_ruleRepository= ruleRepository EOF
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
    // InternalSocialRequest.g:987:1: ruleRepository returns [EObject current=null] : (otherlv_0= 'Repository' ( (otherlv_1= RULE_ID ) ) otherlv_2= '{' ( (lv_queries_3_0= ruleQuery ) )+ otherlv_4= '}' ) ;
    public final EObject ruleRepository() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_queries_3_0 = null;



        	enterRule();

        try {
            // InternalSocialRequest.g:993:2: ( (otherlv_0= 'Repository' ( (otherlv_1= RULE_ID ) ) otherlv_2= '{' ( (lv_queries_3_0= ruleQuery ) )+ otherlv_4= '}' ) )
            // InternalSocialRequest.g:994:2: (otherlv_0= 'Repository' ( (otherlv_1= RULE_ID ) ) otherlv_2= '{' ( (lv_queries_3_0= ruleQuery ) )+ otherlv_4= '}' )
            {
            // InternalSocialRequest.g:994:2: (otherlv_0= 'Repository' ( (otherlv_1= RULE_ID ) ) otherlv_2= '{' ( (lv_queries_3_0= ruleQuery ) )+ otherlv_4= '}' )
            // InternalSocialRequest.g:995:3: otherlv_0= 'Repository' ( (otherlv_1= RULE_ID ) ) otherlv_2= '{' ( (lv_queries_3_0= ruleQuery ) )+ otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,42,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getRepositoryAccess().getRepositoryKeyword_0());
            		
            // InternalSocialRequest.g:999:3: ( (otherlv_1= RULE_ID ) )
            // InternalSocialRequest.g:1000:4: (otherlv_1= RULE_ID )
            {
            // InternalSocialRequest.g:1000:4: (otherlv_1= RULE_ID )
            // InternalSocialRequest.g:1001:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRepositoryRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(otherlv_1, grammarAccess.getRepositoryAccess().getEntityEntityCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_25); 

            			newLeafNode(otherlv_2, grammarAccess.getRepositoryAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalSocialRequest.g:1016:3: ( (lv_queries_3_0= ruleQuery ) )+
            int cnt18=0;
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==43) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalSocialRequest.g:1017:4: (lv_queries_3_0= ruleQuery )
            	    {
            	    // InternalSocialRequest.g:1017:4: (lv_queries_3_0= ruleQuery )
            	    // InternalSocialRequest.g:1018:5: lv_queries_3_0= ruleQuery
            	    {

            	    					newCompositeNode(grammarAccess.getRepositoryAccess().getQueriesQueryParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_26);
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
            	    if ( cnt18 >= 1 ) break loop18;
                        EarlyExitException eee =
                            new EarlyExitException(18, input);
                        throw eee;
                }
                cnt18++;
            } while (true);

            otherlv_4=(Token)match(input,16,FOLLOW_2); 

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
    // InternalSocialRequest.g:1043:1: entryRuleQuery returns [EObject current=null] : iv_ruleQuery= ruleQuery EOF ;
    public final EObject entryRuleQuery() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuery = null;


        try {
            // InternalSocialRequest.g:1043:46: (iv_ruleQuery= ruleQuery EOF )
            // InternalSocialRequest.g:1044:2: iv_ruleQuery= ruleQuery EOF
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
    // InternalSocialRequest.g:1050:1: ruleQuery returns [EObject current=null] : (otherlv_0= 'query' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_isList_2_0= ':' ) ) otherlv_3= 'list' )? (otherlv_4= '{' (otherlv_5= 'params' otherlv_6= '{' ( (lv_params_7_0= ruleParam ) )* otherlv_8= '}' )? ( (lv_sqlQuery_9_0= ruleSQLQuery ) )? otherlv_10= '}' ) ) ;
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
            // InternalSocialRequest.g:1056:2: ( (otherlv_0= 'query' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_isList_2_0= ':' ) ) otherlv_3= 'list' )? (otherlv_4= '{' (otherlv_5= 'params' otherlv_6= '{' ( (lv_params_7_0= ruleParam ) )* otherlv_8= '}' )? ( (lv_sqlQuery_9_0= ruleSQLQuery ) )? otherlv_10= '}' ) ) )
            // InternalSocialRequest.g:1057:2: (otherlv_0= 'query' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_isList_2_0= ':' ) ) otherlv_3= 'list' )? (otherlv_4= '{' (otherlv_5= 'params' otherlv_6= '{' ( (lv_params_7_0= ruleParam ) )* otherlv_8= '}' )? ( (lv_sqlQuery_9_0= ruleSQLQuery ) )? otherlv_10= '}' ) )
            {
            // InternalSocialRequest.g:1057:2: (otherlv_0= 'query' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_isList_2_0= ':' ) ) otherlv_3= 'list' )? (otherlv_4= '{' (otherlv_5= 'params' otherlv_6= '{' ( (lv_params_7_0= ruleParam ) )* otherlv_8= '}' )? ( (lv_sqlQuery_9_0= ruleSQLQuery ) )? otherlv_10= '}' ) )
            // InternalSocialRequest.g:1058:3: otherlv_0= 'query' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_isList_2_0= ':' ) ) otherlv_3= 'list' )? (otherlv_4= '{' (otherlv_5= 'params' otherlv_6= '{' ( (lv_params_7_0= ruleParam ) )* otherlv_8= '}' )? ( (lv_sqlQuery_9_0= ruleSQLQuery ) )? otherlv_10= '}' )
            {
            otherlv_0=(Token)match(input,43,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getQueryAccess().getQueryKeyword_0());
            		
            // InternalSocialRequest.g:1062:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSocialRequest.g:1063:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSocialRequest.g:1063:4: (lv_name_1_0= RULE_ID )
            // InternalSocialRequest.g:1064:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_27); 

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

            // InternalSocialRequest.g:1080:3: ( ( (lv_isList_2_0= ':' ) ) otherlv_3= 'list' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==21) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalSocialRequest.g:1081:4: ( (lv_isList_2_0= ':' ) ) otherlv_3= 'list'
                    {
                    // InternalSocialRequest.g:1081:4: ( (lv_isList_2_0= ':' ) )
                    // InternalSocialRequest.g:1082:5: (lv_isList_2_0= ':' )
                    {
                    // InternalSocialRequest.g:1082:5: (lv_isList_2_0= ':' )
                    // InternalSocialRequest.g:1083:6: lv_isList_2_0= ':'
                    {
                    lv_isList_2_0=(Token)match(input,21,FOLLOW_28); 

                    						newLeafNode(lv_isList_2_0, grammarAccess.getQueryAccess().getIsListColonKeyword_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getQueryRule());
                    						}
                    						setWithLastConsumed(current, "isList", true, ":");
                    					

                    }


                    }

                    otherlv_3=(Token)match(input,44,FOLLOW_5); 

                    				newLeafNode(otherlv_3, grammarAccess.getQueryAccess().getListKeyword_2_1());
                    			

                    }
                    break;

            }

            // InternalSocialRequest.g:1100:3: (otherlv_4= '{' (otherlv_5= 'params' otherlv_6= '{' ( (lv_params_7_0= ruleParam ) )* otherlv_8= '}' )? ( (lv_sqlQuery_9_0= ruleSQLQuery ) )? otherlv_10= '}' )
            // InternalSocialRequest.g:1101:4: otherlv_4= '{' (otherlv_5= 'params' otherlv_6= '{' ( (lv_params_7_0= ruleParam ) )* otherlv_8= '}' )? ( (lv_sqlQuery_9_0= ruleSQLQuery ) )? otherlv_10= '}'
            {
            otherlv_4=(Token)match(input,15,FOLLOW_29); 

            				newLeafNode(otherlv_4, grammarAccess.getQueryAccess().getLeftCurlyBracketKeyword_3_0());
            			
            // InternalSocialRequest.g:1105:4: (otherlv_5= 'params' otherlv_6= '{' ( (lv_params_7_0= ruleParam ) )* otherlv_8= '}' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==45) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalSocialRequest.g:1106:5: otherlv_5= 'params' otherlv_6= '{' ( (lv_params_7_0= ruleParam ) )* otherlv_8= '}'
                    {
                    otherlv_5=(Token)match(input,45,FOLLOW_5); 

                    					newLeafNode(otherlv_5, grammarAccess.getQueryAccess().getParamsKeyword_3_1_0());
                    				
                    otherlv_6=(Token)match(input,15,FOLLOW_30); 

                    					newLeafNode(otherlv_6, grammarAccess.getQueryAccess().getLeftCurlyBracketKeyword_3_1_1());
                    				
                    // InternalSocialRequest.g:1114:5: ( (lv_params_7_0= ruleParam ) )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==RULE_ID) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // InternalSocialRequest.g:1115:6: (lv_params_7_0= ruleParam )
                    	    {
                    	    // InternalSocialRequest.g:1115:6: (lv_params_7_0= ruleParam )
                    	    // InternalSocialRequest.g:1116:7: lv_params_7_0= ruleParam
                    	    {

                    	    							newCompositeNode(grammarAccess.getQueryAccess().getParamsParamParserRuleCall_3_1_2_0());
                    	    						
                    	    pushFollow(FOLLOW_30);
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
                    	    break loop20;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,16,FOLLOW_31); 

                    					newLeafNode(otherlv_8, grammarAccess.getQueryAccess().getRightCurlyBracketKeyword_3_1_3());
                    				

                    }
                    break;

            }

            // InternalSocialRequest.g:1138:4: ( (lv_sqlQuery_9_0= ruleSQLQuery ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==46) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalSocialRequest.g:1139:5: (lv_sqlQuery_9_0= ruleSQLQuery )
                    {
                    // InternalSocialRequest.g:1139:5: (lv_sqlQuery_9_0= ruleSQLQuery )
                    // InternalSocialRequest.g:1140:6: lv_sqlQuery_9_0= ruleSQLQuery
                    {

                    						newCompositeNode(grammarAccess.getQueryAccess().getSqlQuerySQLQueryParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_32);
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

            otherlv_10=(Token)match(input,16,FOLLOW_2); 

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
    // InternalSocialRequest.g:1166:1: entryRuleParam returns [EObject current=null] : iv_ruleParam= ruleParam EOF ;
    public final EObject entryRuleParam() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParam = null;


        try {
            // InternalSocialRequest.g:1166:46: (iv_ruleParam= ruleParam EOF )
            // InternalSocialRequest.g:1167:2: iv_ruleParam= ruleParam EOF
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
    // InternalSocialRequest.g:1173:1: ruleParam returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleTypeReference ) ) ) ;
    public final EObject ruleParam() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_type_2_0 = null;



        	enterRule();

        try {
            // InternalSocialRequest.g:1179:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleTypeReference ) ) ) )
            // InternalSocialRequest.g:1180:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleTypeReference ) ) )
            {
            // InternalSocialRequest.g:1180:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleTypeReference ) ) )
            // InternalSocialRequest.g:1181:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleTypeReference ) )
            {
            // InternalSocialRequest.g:1181:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalSocialRequest.g:1182:4: (lv_name_0_0= RULE_ID )
            {
            // InternalSocialRequest.g:1182:4: (lv_name_0_0= RULE_ID )
            // InternalSocialRequest.g:1183:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_12); 

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

            otherlv_1=(Token)match(input,21,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getParamAccess().getColonKeyword_1());
            		
            // InternalSocialRequest.g:1203:3: ( (lv_type_2_0= ruleTypeReference ) )
            // InternalSocialRequest.g:1204:4: (lv_type_2_0= ruleTypeReference )
            {
            // InternalSocialRequest.g:1204:4: (lv_type_2_0= ruleTypeReference )
            // InternalSocialRequest.g:1205:5: lv_type_2_0= ruleTypeReference
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
    // InternalSocialRequest.g:1226:1: entryRuleSQLQuery returns [EObject current=null] : iv_ruleSQLQuery= ruleSQLQuery EOF ;
    public final EObject entryRuleSQLQuery() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSQLQuery = null;


        try {
            // InternalSocialRequest.g:1226:49: (iv_ruleSQLQuery= ruleSQLQuery EOF )
            // InternalSocialRequest.g:1227:2: iv_ruleSQLQuery= ruleSQLQuery EOF
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
    // InternalSocialRequest.g:1233:1: ruleSQLQuery returns [EObject current=null] : ( ( (lv_select_0_0= ruleSelect ) ) ( (lv_from_1_0= ruleFrom ) ) ( (lv_joins_2_0= ruleJoin ) )* ( (lv_where_3_0= ruleWhere ) )? ( (lv_order_4_0= ruleOrder ) )? ) ;
    public final EObject ruleSQLQuery() throws RecognitionException {
        EObject current = null;

        EObject lv_select_0_0 = null;

        EObject lv_from_1_0 = null;

        EObject lv_joins_2_0 = null;

        EObject lv_where_3_0 = null;

        EObject lv_order_4_0 = null;



        	enterRule();

        try {
            // InternalSocialRequest.g:1239:2: ( ( ( (lv_select_0_0= ruleSelect ) ) ( (lv_from_1_0= ruleFrom ) ) ( (lv_joins_2_0= ruleJoin ) )* ( (lv_where_3_0= ruleWhere ) )? ( (lv_order_4_0= ruleOrder ) )? ) )
            // InternalSocialRequest.g:1240:2: ( ( (lv_select_0_0= ruleSelect ) ) ( (lv_from_1_0= ruleFrom ) ) ( (lv_joins_2_0= ruleJoin ) )* ( (lv_where_3_0= ruleWhere ) )? ( (lv_order_4_0= ruleOrder ) )? )
            {
            // InternalSocialRequest.g:1240:2: ( ( (lv_select_0_0= ruleSelect ) ) ( (lv_from_1_0= ruleFrom ) ) ( (lv_joins_2_0= ruleJoin ) )* ( (lv_where_3_0= ruleWhere ) )? ( (lv_order_4_0= ruleOrder ) )? )
            // InternalSocialRequest.g:1241:3: ( (lv_select_0_0= ruleSelect ) ) ( (lv_from_1_0= ruleFrom ) ) ( (lv_joins_2_0= ruleJoin ) )* ( (lv_where_3_0= ruleWhere ) )? ( (lv_order_4_0= ruleOrder ) )?
            {
            // InternalSocialRequest.g:1241:3: ( (lv_select_0_0= ruleSelect ) )
            // InternalSocialRequest.g:1242:4: (lv_select_0_0= ruleSelect )
            {
            // InternalSocialRequest.g:1242:4: (lv_select_0_0= ruleSelect )
            // InternalSocialRequest.g:1243:5: lv_select_0_0= ruleSelect
            {

            					newCompositeNode(grammarAccess.getSQLQueryAccess().getSelectSelectParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_33);
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

            // InternalSocialRequest.g:1260:3: ( (lv_from_1_0= ruleFrom ) )
            // InternalSocialRequest.g:1261:4: (lv_from_1_0= ruleFrom )
            {
            // InternalSocialRequest.g:1261:4: (lv_from_1_0= ruleFrom )
            // InternalSocialRequest.g:1262:5: lv_from_1_0= ruleFrom
            {

            					newCompositeNode(grammarAccess.getSQLQueryAccess().getFromFromParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_34);
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

            // InternalSocialRequest.g:1279:3: ( (lv_joins_2_0= ruleJoin ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( ((LA23_0>=60 && LA23_0<=63)) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalSocialRequest.g:1280:4: (lv_joins_2_0= ruleJoin )
            	    {
            	    // InternalSocialRequest.g:1280:4: (lv_joins_2_0= ruleJoin )
            	    // InternalSocialRequest.g:1281:5: lv_joins_2_0= ruleJoin
            	    {

            	    					newCompositeNode(grammarAccess.getSQLQueryAccess().getJoinsJoinParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_34);
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
            	    break loop23;
                }
            } while (true);

            // InternalSocialRequest.g:1298:3: ( (lv_where_3_0= ruleWhere ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==50) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalSocialRequest.g:1299:4: (lv_where_3_0= ruleWhere )
                    {
                    // InternalSocialRequest.g:1299:4: (lv_where_3_0= ruleWhere )
                    // InternalSocialRequest.g:1300:5: lv_where_3_0= ruleWhere
                    {

                    					newCompositeNode(grammarAccess.getSQLQueryAccess().getWhereWhereParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_35);
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

            // InternalSocialRequest.g:1317:3: ( (lv_order_4_0= ruleOrder ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==51) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalSocialRequest.g:1318:4: (lv_order_4_0= ruleOrder )
                    {
                    // InternalSocialRequest.g:1318:4: (lv_order_4_0= ruleOrder )
                    // InternalSocialRequest.g:1319:5: lv_order_4_0= ruleOrder
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
    // InternalSocialRequest.g:1340:1: entryRuleSelect returns [EObject current=null] : iv_ruleSelect= ruleSelect EOF ;
    public final EObject entryRuleSelect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelect = null;


        try {
            // InternalSocialRequest.g:1340:47: (iv_ruleSelect= ruleSelect EOF )
            // InternalSocialRequest.g:1341:2: iv_ruleSelect= ruleSelect EOF
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
    // InternalSocialRequest.g:1347:1: ruleSelect returns [EObject current=null] : (otherlv_0= 'SELECT' ( (lv_isDistinct_1_0= 'DISTINCT' ) )? otherlv_2= '{' ( (lv_clause_3_0= RULE_STRING ) ) otherlv_4= '}' ) ;
    public final EObject ruleSelect() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_isDistinct_1_0=null;
        Token otherlv_2=null;
        Token lv_clause_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalSocialRequest.g:1353:2: ( (otherlv_0= 'SELECT' ( (lv_isDistinct_1_0= 'DISTINCT' ) )? otherlv_2= '{' ( (lv_clause_3_0= RULE_STRING ) ) otherlv_4= '}' ) )
            // InternalSocialRequest.g:1354:2: (otherlv_0= 'SELECT' ( (lv_isDistinct_1_0= 'DISTINCT' ) )? otherlv_2= '{' ( (lv_clause_3_0= RULE_STRING ) ) otherlv_4= '}' )
            {
            // InternalSocialRequest.g:1354:2: (otherlv_0= 'SELECT' ( (lv_isDistinct_1_0= 'DISTINCT' ) )? otherlv_2= '{' ( (lv_clause_3_0= RULE_STRING ) ) otherlv_4= '}' )
            // InternalSocialRequest.g:1355:3: otherlv_0= 'SELECT' ( (lv_isDistinct_1_0= 'DISTINCT' ) )? otherlv_2= '{' ( (lv_clause_3_0= RULE_STRING ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,46,FOLLOW_36); 

            			newLeafNode(otherlv_0, grammarAccess.getSelectAccess().getSELECTKeyword_0());
            		
            // InternalSocialRequest.g:1359:3: ( (lv_isDistinct_1_0= 'DISTINCT' ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==47) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalSocialRequest.g:1360:4: (lv_isDistinct_1_0= 'DISTINCT' )
                    {
                    // InternalSocialRequest.g:1360:4: (lv_isDistinct_1_0= 'DISTINCT' )
                    // InternalSocialRequest.g:1361:5: lv_isDistinct_1_0= 'DISTINCT'
                    {
                    lv_isDistinct_1_0=(Token)match(input,47,FOLLOW_5); 

                    					newLeafNode(lv_isDistinct_1_0, grammarAccess.getSelectAccess().getIsDistinctDISTINCTKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getSelectRule());
                    					}
                    					setWithLastConsumed(current, "isDistinct", true, "DISTINCT");
                    				

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,15,FOLLOW_24); 

            			newLeafNode(otherlv_2, grammarAccess.getSelectAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalSocialRequest.g:1377:3: ( (lv_clause_3_0= RULE_STRING ) )
            // InternalSocialRequest.g:1378:4: (lv_clause_3_0= RULE_STRING )
            {
            // InternalSocialRequest.g:1378:4: (lv_clause_3_0= RULE_STRING )
            // InternalSocialRequest.g:1379:5: lv_clause_3_0= RULE_STRING
            {
            lv_clause_3_0=(Token)match(input,RULE_STRING,FOLLOW_32); 

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

            otherlv_4=(Token)match(input,16,FOLLOW_2); 

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
    // InternalSocialRequest.g:1403:1: entryRuleFrom returns [EObject current=null] : iv_ruleFrom= ruleFrom EOF ;
    public final EObject entryRuleFrom() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFrom = null;


        try {
            // InternalSocialRequest.g:1403:45: (iv_ruleFrom= ruleFrom EOF )
            // InternalSocialRequest.g:1404:2: iv_ruleFrom= ruleFrom EOF
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
    // InternalSocialRequest.g:1410:1: ruleFrom returns [EObject current=null] : (otherlv_0= 'FROM' otherlv_1= '{' ( (otherlv_2= RULE_ID ) ) ( (lv_alias_3_0= RULE_ID ) ) otherlv_4= '}' ) ;
    public final EObject ruleFrom() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_alias_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalSocialRequest.g:1416:2: ( (otherlv_0= 'FROM' otherlv_1= '{' ( (otherlv_2= RULE_ID ) ) ( (lv_alias_3_0= RULE_ID ) ) otherlv_4= '}' ) )
            // InternalSocialRequest.g:1417:2: (otherlv_0= 'FROM' otherlv_1= '{' ( (otherlv_2= RULE_ID ) ) ( (lv_alias_3_0= RULE_ID ) ) otherlv_4= '}' )
            {
            // InternalSocialRequest.g:1417:2: (otherlv_0= 'FROM' otherlv_1= '{' ( (otherlv_2= RULE_ID ) ) ( (lv_alias_3_0= RULE_ID ) ) otherlv_4= '}' )
            // InternalSocialRequest.g:1418:3: otherlv_0= 'FROM' otherlv_1= '{' ( (otherlv_2= RULE_ID ) ) ( (lv_alias_3_0= RULE_ID ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,48,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getFromAccess().getFROMKeyword_0());
            		
            otherlv_1=(Token)match(input,15,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getFromAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalSocialRequest.g:1426:3: ( (otherlv_2= RULE_ID ) )
            // InternalSocialRequest.g:1427:4: (otherlv_2= RULE_ID )
            {
            // InternalSocialRequest.g:1427:4: (otherlv_2= RULE_ID )
            // InternalSocialRequest.g:1428:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFromRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(otherlv_2, grammarAccess.getFromAccess().getEntityEntityCrossReference_2_0());
            				

            }


            }

            // InternalSocialRequest.g:1439:3: ( (lv_alias_3_0= RULE_ID ) )
            // InternalSocialRequest.g:1440:4: (lv_alias_3_0= RULE_ID )
            {
            // InternalSocialRequest.g:1440:4: (lv_alias_3_0= RULE_ID )
            // InternalSocialRequest.g:1441:5: lv_alias_3_0= RULE_ID
            {
            lv_alias_3_0=(Token)match(input,RULE_ID,FOLLOW_32); 

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

            otherlv_4=(Token)match(input,16,FOLLOW_2); 

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
    // InternalSocialRequest.g:1465:1: entryRuleJoin returns [EObject current=null] : iv_ruleJoin= ruleJoin EOF ;
    public final EObject entryRuleJoin() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJoin = null;


        try {
            // InternalSocialRequest.g:1465:45: (iv_ruleJoin= ruleJoin EOF )
            // InternalSocialRequest.g:1466:2: iv_ruleJoin= ruleJoin EOF
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
    // InternalSocialRequest.g:1472:1: ruleJoin returns [EObject current=null] : ( ( (lv_joinType_0_0= ruleJoinType ) ) otherlv_1= '{' ( (otherlv_2= RULE_ID ) ) ( (lv_alias_3_0= RULE_ID ) ) otherlv_4= '}' (otherlv_5= 'ON' otherlv_6= '{' ( (lv_joinCondition_7_0= RULE_STRING ) ) otherlv_8= '}' )? ) ;
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
            // InternalSocialRequest.g:1478:2: ( ( ( (lv_joinType_0_0= ruleJoinType ) ) otherlv_1= '{' ( (otherlv_2= RULE_ID ) ) ( (lv_alias_3_0= RULE_ID ) ) otherlv_4= '}' (otherlv_5= 'ON' otherlv_6= '{' ( (lv_joinCondition_7_0= RULE_STRING ) ) otherlv_8= '}' )? ) )
            // InternalSocialRequest.g:1479:2: ( ( (lv_joinType_0_0= ruleJoinType ) ) otherlv_1= '{' ( (otherlv_2= RULE_ID ) ) ( (lv_alias_3_0= RULE_ID ) ) otherlv_4= '}' (otherlv_5= 'ON' otherlv_6= '{' ( (lv_joinCondition_7_0= RULE_STRING ) ) otherlv_8= '}' )? )
            {
            // InternalSocialRequest.g:1479:2: ( ( (lv_joinType_0_0= ruleJoinType ) ) otherlv_1= '{' ( (otherlv_2= RULE_ID ) ) ( (lv_alias_3_0= RULE_ID ) ) otherlv_4= '}' (otherlv_5= 'ON' otherlv_6= '{' ( (lv_joinCondition_7_0= RULE_STRING ) ) otherlv_8= '}' )? )
            // InternalSocialRequest.g:1480:3: ( (lv_joinType_0_0= ruleJoinType ) ) otherlv_1= '{' ( (otherlv_2= RULE_ID ) ) ( (lv_alias_3_0= RULE_ID ) ) otherlv_4= '}' (otherlv_5= 'ON' otherlv_6= '{' ( (lv_joinCondition_7_0= RULE_STRING ) ) otherlv_8= '}' )?
            {
            // InternalSocialRequest.g:1480:3: ( (lv_joinType_0_0= ruleJoinType ) )
            // InternalSocialRequest.g:1481:4: (lv_joinType_0_0= ruleJoinType )
            {
            // InternalSocialRequest.g:1481:4: (lv_joinType_0_0= ruleJoinType )
            // InternalSocialRequest.g:1482:5: lv_joinType_0_0= ruleJoinType
            {

            					newCompositeNode(grammarAccess.getJoinAccess().getJoinTypeJoinTypeEnumRuleCall_0_0());
            				
            pushFollow(FOLLOW_5);
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

            otherlv_1=(Token)match(input,15,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getJoinAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalSocialRequest.g:1503:3: ( (otherlv_2= RULE_ID ) )
            // InternalSocialRequest.g:1504:4: (otherlv_2= RULE_ID )
            {
            // InternalSocialRequest.g:1504:4: (otherlv_2= RULE_ID )
            // InternalSocialRequest.g:1505:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getJoinRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(otherlv_2, grammarAccess.getJoinAccess().getEntityEntityCrossReference_2_0());
            				

            }


            }

            // InternalSocialRequest.g:1516:3: ( (lv_alias_3_0= RULE_ID ) )
            // InternalSocialRequest.g:1517:4: (lv_alias_3_0= RULE_ID )
            {
            // InternalSocialRequest.g:1517:4: (lv_alias_3_0= RULE_ID )
            // InternalSocialRequest.g:1518:5: lv_alias_3_0= RULE_ID
            {
            lv_alias_3_0=(Token)match(input,RULE_ID,FOLLOW_32); 

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

            otherlv_4=(Token)match(input,16,FOLLOW_37); 

            			newLeafNode(otherlv_4, grammarAccess.getJoinAccess().getRightCurlyBracketKeyword_4());
            		
            // InternalSocialRequest.g:1538:3: (otherlv_5= 'ON' otherlv_6= '{' ( (lv_joinCondition_7_0= RULE_STRING ) ) otherlv_8= '}' )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==49) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalSocialRequest.g:1539:4: otherlv_5= 'ON' otherlv_6= '{' ( (lv_joinCondition_7_0= RULE_STRING ) ) otherlv_8= '}'
                    {
                    otherlv_5=(Token)match(input,49,FOLLOW_5); 

                    				newLeafNode(otherlv_5, grammarAccess.getJoinAccess().getONKeyword_5_0());
                    			
                    otherlv_6=(Token)match(input,15,FOLLOW_24); 

                    				newLeafNode(otherlv_6, grammarAccess.getJoinAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalSocialRequest.g:1547:4: ( (lv_joinCondition_7_0= RULE_STRING ) )
                    // InternalSocialRequest.g:1548:5: (lv_joinCondition_7_0= RULE_STRING )
                    {
                    // InternalSocialRequest.g:1548:5: (lv_joinCondition_7_0= RULE_STRING )
                    // InternalSocialRequest.g:1549:6: lv_joinCondition_7_0= RULE_STRING
                    {
                    lv_joinCondition_7_0=(Token)match(input,RULE_STRING,FOLLOW_32); 

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

                    otherlv_8=(Token)match(input,16,FOLLOW_2); 

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
    // InternalSocialRequest.g:1574:1: entryRuleWhere returns [EObject current=null] : iv_ruleWhere= ruleWhere EOF ;
    public final EObject entryRuleWhere() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhere = null;


        try {
            // InternalSocialRequest.g:1574:46: (iv_ruleWhere= ruleWhere EOF )
            // InternalSocialRequest.g:1575:2: iv_ruleWhere= ruleWhere EOF
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
    // InternalSocialRequest.g:1581:1: ruleWhere returns [EObject current=null] : (otherlv_0= 'WHERE' otherlv_1= '{' ( (lv_condition_2_0= RULE_STRING ) ) otherlv_3= '}' ) ;
    public final EObject ruleWhere() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_condition_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalSocialRequest.g:1587:2: ( (otherlv_0= 'WHERE' otherlv_1= '{' ( (lv_condition_2_0= RULE_STRING ) ) otherlv_3= '}' ) )
            // InternalSocialRequest.g:1588:2: (otherlv_0= 'WHERE' otherlv_1= '{' ( (lv_condition_2_0= RULE_STRING ) ) otherlv_3= '}' )
            {
            // InternalSocialRequest.g:1588:2: (otherlv_0= 'WHERE' otherlv_1= '{' ( (lv_condition_2_0= RULE_STRING ) ) otherlv_3= '}' )
            // InternalSocialRequest.g:1589:3: otherlv_0= 'WHERE' otherlv_1= '{' ( (lv_condition_2_0= RULE_STRING ) ) otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,50,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getWhereAccess().getWHEREKeyword_0());
            		
            otherlv_1=(Token)match(input,15,FOLLOW_24); 

            			newLeafNode(otherlv_1, grammarAccess.getWhereAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalSocialRequest.g:1597:3: ( (lv_condition_2_0= RULE_STRING ) )
            // InternalSocialRequest.g:1598:4: (lv_condition_2_0= RULE_STRING )
            {
            // InternalSocialRequest.g:1598:4: (lv_condition_2_0= RULE_STRING )
            // InternalSocialRequest.g:1599:5: lv_condition_2_0= RULE_STRING
            {
            lv_condition_2_0=(Token)match(input,RULE_STRING,FOLLOW_32); 

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

            otherlv_3=(Token)match(input,16,FOLLOW_2); 

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
    // InternalSocialRequest.g:1623:1: entryRuleOrder returns [EObject current=null] : iv_ruleOrder= ruleOrder EOF ;
    public final EObject entryRuleOrder() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrder = null;


        try {
            // InternalSocialRequest.g:1623:46: (iv_ruleOrder= ruleOrder EOF )
            // InternalSocialRequest.g:1624:2: iv_ruleOrder= ruleOrder EOF
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
    // InternalSocialRequest.g:1630:1: ruleOrder returns [EObject current=null] : (otherlv_0= 'ORDER BY' otherlv_1= '{' ( (lv_order_2_0= RULE_STRING ) ) otherlv_3= '}' ) ;
    public final EObject ruleOrder() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_order_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalSocialRequest.g:1636:2: ( (otherlv_0= 'ORDER BY' otherlv_1= '{' ( (lv_order_2_0= RULE_STRING ) ) otherlv_3= '}' ) )
            // InternalSocialRequest.g:1637:2: (otherlv_0= 'ORDER BY' otherlv_1= '{' ( (lv_order_2_0= RULE_STRING ) ) otherlv_3= '}' )
            {
            // InternalSocialRequest.g:1637:2: (otherlv_0= 'ORDER BY' otherlv_1= '{' ( (lv_order_2_0= RULE_STRING ) ) otherlv_3= '}' )
            // InternalSocialRequest.g:1638:3: otherlv_0= 'ORDER BY' otherlv_1= '{' ( (lv_order_2_0= RULE_STRING ) ) otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,51,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getOrderAccess().getORDERBYKeyword_0());
            		
            otherlv_1=(Token)match(input,15,FOLLOW_24); 

            			newLeafNode(otherlv_1, grammarAccess.getOrderAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalSocialRequest.g:1646:3: ( (lv_order_2_0= RULE_STRING ) )
            // InternalSocialRequest.g:1647:4: (lv_order_2_0= RULE_STRING )
            {
            // InternalSocialRequest.g:1647:4: (lv_order_2_0= RULE_STRING )
            // InternalSocialRequest.g:1648:5: lv_order_2_0= RULE_STRING
            {
            lv_order_2_0=(Token)match(input,RULE_STRING,FOLLOW_32); 

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

            otherlv_3=(Token)match(input,16,FOLLOW_2); 

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


    // $ANTLR start "ruleDataType"
    // InternalSocialRequest.g:1672:1: ruleDataType returns [Enumerator current=null] : ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'long' ) | (enumLiteral_2= 'float' ) | (enumLiteral_3= 'double' ) | (enumLiteral_4= 'char' ) | (enumLiteral_5= 'int' ) | (enumLiteral_6= 'boolean' ) | (enumLiteral_7= 'Date' ) ) ;
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
            // InternalSocialRequest.g:1678:2: ( ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'long' ) | (enumLiteral_2= 'float' ) | (enumLiteral_3= 'double' ) | (enumLiteral_4= 'char' ) | (enumLiteral_5= 'int' ) | (enumLiteral_6= 'boolean' ) | (enumLiteral_7= 'Date' ) ) )
            // InternalSocialRequest.g:1679:2: ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'long' ) | (enumLiteral_2= 'float' ) | (enumLiteral_3= 'double' ) | (enumLiteral_4= 'char' ) | (enumLiteral_5= 'int' ) | (enumLiteral_6= 'boolean' ) | (enumLiteral_7= 'Date' ) )
            {
            // InternalSocialRequest.g:1679:2: ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'long' ) | (enumLiteral_2= 'float' ) | (enumLiteral_3= 'double' ) | (enumLiteral_4= 'char' ) | (enumLiteral_5= 'int' ) | (enumLiteral_6= 'boolean' ) | (enumLiteral_7= 'Date' ) )
            int alt28=8;
            switch ( input.LA(1) ) {
            case 52:
                {
                alt28=1;
                }
                break;
            case 53:
                {
                alt28=2;
                }
                break;
            case 54:
                {
                alt28=3;
                }
                break;
            case 55:
                {
                alt28=4;
                }
                break;
            case 56:
                {
                alt28=5;
                }
                break;
            case 57:
                {
                alt28=6;
                }
                break;
            case 58:
                {
                alt28=7;
                }
                break;
            case 59:
                {
                alt28=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }

            switch (alt28) {
                case 1 :
                    // InternalSocialRequest.g:1680:3: (enumLiteral_0= 'String' )
                    {
                    // InternalSocialRequest.g:1680:3: (enumLiteral_0= 'String' )
                    // InternalSocialRequest.g:1681:4: enumLiteral_0= 'String'
                    {
                    enumLiteral_0=(Token)match(input,52,FOLLOW_2); 

                    				current = grammarAccess.getDataTypeAccess().getSTRINGEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getDataTypeAccess().getSTRINGEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSocialRequest.g:1688:3: (enumLiteral_1= 'long' )
                    {
                    // InternalSocialRequest.g:1688:3: (enumLiteral_1= 'long' )
                    // InternalSocialRequest.g:1689:4: enumLiteral_1= 'long'
                    {
                    enumLiteral_1=(Token)match(input,53,FOLLOW_2); 

                    				current = grammarAccess.getDataTypeAccess().getLONGEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getDataTypeAccess().getLONGEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalSocialRequest.g:1696:3: (enumLiteral_2= 'float' )
                    {
                    // InternalSocialRequest.g:1696:3: (enumLiteral_2= 'float' )
                    // InternalSocialRequest.g:1697:4: enumLiteral_2= 'float'
                    {
                    enumLiteral_2=(Token)match(input,54,FOLLOW_2); 

                    				current = grammarAccess.getDataTypeAccess().getFLOATEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getDataTypeAccess().getFLOATEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalSocialRequest.g:1704:3: (enumLiteral_3= 'double' )
                    {
                    // InternalSocialRequest.g:1704:3: (enumLiteral_3= 'double' )
                    // InternalSocialRequest.g:1705:4: enumLiteral_3= 'double'
                    {
                    enumLiteral_3=(Token)match(input,55,FOLLOW_2); 

                    				current = grammarAccess.getDataTypeAccess().getDOUBLEEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getDataTypeAccess().getDOUBLEEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalSocialRequest.g:1712:3: (enumLiteral_4= 'char' )
                    {
                    // InternalSocialRequest.g:1712:3: (enumLiteral_4= 'char' )
                    // InternalSocialRequest.g:1713:4: enumLiteral_4= 'char'
                    {
                    enumLiteral_4=(Token)match(input,56,FOLLOW_2); 

                    				current = grammarAccess.getDataTypeAccess().getCHAREnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getDataTypeAccess().getCHAREnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalSocialRequest.g:1720:3: (enumLiteral_5= 'int' )
                    {
                    // InternalSocialRequest.g:1720:3: (enumLiteral_5= 'int' )
                    // InternalSocialRequest.g:1721:4: enumLiteral_5= 'int'
                    {
                    enumLiteral_5=(Token)match(input,57,FOLLOW_2); 

                    				current = grammarAccess.getDataTypeAccess().getINTEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getDataTypeAccess().getINTEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalSocialRequest.g:1728:3: (enumLiteral_6= 'boolean' )
                    {
                    // InternalSocialRequest.g:1728:3: (enumLiteral_6= 'boolean' )
                    // InternalSocialRequest.g:1729:4: enumLiteral_6= 'boolean'
                    {
                    enumLiteral_6=(Token)match(input,58,FOLLOW_2); 

                    				current = grammarAccess.getDataTypeAccess().getBOOLEANEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getDataTypeAccess().getBOOLEANEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalSocialRequest.g:1736:3: (enumLiteral_7= 'Date' )
                    {
                    // InternalSocialRequest.g:1736:3: (enumLiteral_7= 'Date' )
                    // InternalSocialRequest.g:1737:4: enumLiteral_7= 'Date'
                    {
                    enumLiteral_7=(Token)match(input,59,FOLLOW_2); 

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
    // InternalSocialRequest.g:1747:1: ruleJoinType returns [Enumerator current=null] : ( (enumLiteral_0= 'LEFT JOIN' ) | (enumLiteral_1= 'LEFT OUTER JOIN' ) | (enumLiteral_2= 'CROSS JOIN' ) | (enumLiteral_3= 'JOIN' ) ) ;
    public final Enumerator ruleJoinType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalSocialRequest.g:1753:2: ( ( (enumLiteral_0= 'LEFT JOIN' ) | (enumLiteral_1= 'LEFT OUTER JOIN' ) | (enumLiteral_2= 'CROSS JOIN' ) | (enumLiteral_3= 'JOIN' ) ) )
            // InternalSocialRequest.g:1754:2: ( (enumLiteral_0= 'LEFT JOIN' ) | (enumLiteral_1= 'LEFT OUTER JOIN' ) | (enumLiteral_2= 'CROSS JOIN' ) | (enumLiteral_3= 'JOIN' ) )
            {
            // InternalSocialRequest.g:1754:2: ( (enumLiteral_0= 'LEFT JOIN' ) | (enumLiteral_1= 'LEFT OUTER JOIN' ) | (enumLiteral_2= 'CROSS JOIN' ) | (enumLiteral_3= 'JOIN' ) )
            int alt29=4;
            switch ( input.LA(1) ) {
            case 60:
                {
                alt29=1;
                }
                break;
            case 61:
                {
                alt29=2;
                }
                break;
            case 62:
                {
                alt29=3;
                }
                break;
            case 63:
                {
                alt29=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }

            switch (alt29) {
                case 1 :
                    // InternalSocialRequest.g:1755:3: (enumLiteral_0= 'LEFT JOIN' )
                    {
                    // InternalSocialRequest.g:1755:3: (enumLiteral_0= 'LEFT JOIN' )
                    // InternalSocialRequest.g:1756:4: enumLiteral_0= 'LEFT JOIN'
                    {
                    enumLiteral_0=(Token)match(input,60,FOLLOW_2); 

                    				current = grammarAccess.getJoinTypeAccess().getLEFT_JOINEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getJoinTypeAccess().getLEFT_JOINEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSocialRequest.g:1763:3: (enumLiteral_1= 'LEFT OUTER JOIN' )
                    {
                    // InternalSocialRequest.g:1763:3: (enumLiteral_1= 'LEFT OUTER JOIN' )
                    // InternalSocialRequest.g:1764:4: enumLiteral_1= 'LEFT OUTER JOIN'
                    {
                    enumLiteral_1=(Token)match(input,61,FOLLOW_2); 

                    				current = grammarAccess.getJoinTypeAccess().getLEFT_OUTER_JOINEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getJoinTypeAccess().getLEFT_OUTER_JOINEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalSocialRequest.g:1771:3: (enumLiteral_2= 'CROSS JOIN' )
                    {
                    // InternalSocialRequest.g:1771:3: (enumLiteral_2= 'CROSS JOIN' )
                    // InternalSocialRequest.g:1772:4: enumLiteral_2= 'CROSS JOIN'
                    {
                    enumLiteral_2=(Token)match(input,62,FOLLOW_2); 

                    				current = grammarAccess.getJoinTypeAccess().getCROSS_JOINEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getJoinTypeAccess().getCROSS_JOINEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalSocialRequest.g:1779:3: (enumLiteral_3= 'JOIN' )
                    {
                    // InternalSocialRequest.g:1779:3: (enumLiteral_3= 'JOIN' )
                    // InternalSocialRequest.g:1780:4: enumLiteral_3= 'JOIN'
                    {
                    enumLiteral_3=(Token)match(input,63,FOLLOW_2); 

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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000040000044002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000040000054000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000088000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x000003C000000010L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x000003C000010010L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0FF0000000000010L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x000000000E008002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000001C10000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000003FC0000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000003FC0010000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000080000010000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000208000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000600000010000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000400000010000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0xF00C000000000002L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000800000008000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0002000000000002L});

}
