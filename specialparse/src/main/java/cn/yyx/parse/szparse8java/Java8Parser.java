package cn.yyx.parse.szparse8java;

// Generated from Java8.g4 by ANTLR 4.5.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Java8Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, T__47=48, T__48=49, T__49=50, T__50=51, T__51=52, 
		T__52=53, T__53=54, T__54=55, T__55=56, T__56=57, T__57=58, T__58=59, 
		T__59=60, T__60=61, T__61=62, T__62=63, T__63=64, T__64=65, T__65=66, 
		T__66=67, T__67=68, T__68=69, T__69=70, T__70=71, T__71=72, T__72=73, 
		T__73=74, T__74=75, T__75=76, T__76=77, T__77=78, T__78=79, T__79=80, 
		T__80=81, T__81=82, T__82=83, T__83=84, T__84=85, T__85=86, T__86=87, 
		T__87=88, T__88=89, T__89=90, T__90=91, T__91=92, T__92=93, T__93=94, 
		T__94=95, T__95=96, T__96=97, T__97=98, T__98=99, T__99=100, T__100=101, 
		T__101=102, T__102=103, T__103=104, T__104=105, T__105=106, T__106=107, 
		T__107=108, T__108=109, T__109=110, T__110=111, T__111=112, T__112=113, 
		T__113=114, T__114=115, T__115=116, T__116=117, T__117=118, T__118=119, 
		T__119=120, T__120=121, T__121=122, T__122=123, T__123=124, T__124=125, 
		T__125=126, T__126=127, T__127=128, T__128=129, T__129=130, T__130=131, 
		T__131=132, T__132=133, T__133=134, T__134=135, T__135=136, T__136=137, 
		T__137=138, T__138=139, T__139=140, T__140=141, T__141=142, T__142=143, 
		T__143=144, T__144=145, T__145=146, T__146=147, IdentifierX=148, AT=149, 
		ELLIPSIS=150, IntegerLiteralX=151, FloatingPointLiteralX=152, CharacterLiteralX=153, 
		StringLiteralX=154, COMMA=155, DOT=156, COLONCOLON=157, WS=158;
	public static final int
		RULE_statement = 0, RULE_methodArgumentEndStatement = 1, RULE_methodPreRerferedExpressionEndStatement = 2, 
		RULE_commonOverStatement = 3, RULE_forIniOverStatement = 4, RULE_forExpOverStatement = 5, 
		RULE_forUpdOverStatement = 6, RULE_rawForIniOverStatement = 7, RULE_rawForExpOverStatement = 8, 
		RULE_rawForUpdOverStatement = 9, RULE_rawStatement = 10, RULE_expressionStatement = 11, 
		RULE_assignAssignmentStatement = 12, RULE_mulassignAssignmentStatement = 13, 
		RULE_divassignAssignmentStatement = 14, RULE_modassignAssignmentStatement = 15, 
		RULE_addassignAssignmentStatement = 16, RULE_subassignAssignmentStatement = 17, 
		RULE_lshiftassignAssignmentStatement = 18, RULE_rshiftassignAssignmentStatement = 19, 
		RULE_urshiftassignAssignmentStatement = 20, RULE_andassignAssignmentStatement = 21, 
		RULE_xorassignAssignmentStatement = 22, RULE_orassignAssignmentStatement = 23, 
		RULE_assignmentStatement = 24, RULE_positiveLiteralStatement = 25, RULE_negativeLiteralStatement = 26, 
		RULE_normalLiteralStatement = 27, RULE_literalStatement = 28, RULE_castExpressionStatement = 29, 
		RULE_commonMethodInvocationStatement = 30, RULE_superConstructionInvocationStatement = 31, 
		RULE_typeCreationInvocationStatement = 32, RULE_thisConstructionInvocationStatement = 33, 
		RULE_methodInvocationStatement = 34, RULE_qualifiedAccessStatement = 35, 
		RULE_fieldAccessStatement = 36, RULE_chainFieldAccess = 37, RULE_referedFieldAccess = 38, 
		RULE_superFieldAccess = 39, RULE_thisFieldAccess = 40, RULE_fieldAccess = 41, 
		RULE_gtInfixExpressionStatement = 42, RULE_ltInfixExpressionStatement = 43, 
		RULE_equalInfixExpressionStatement = 44, RULE_leInfixExpressionStatement = 45, 
		RULE_geInfixExpressionStatement = 46, RULE_notequalInfixExpressionStatement = 47, 
		RULE_andInfixExpressionStatement = 48, RULE_orInfixExpressionStatement = 49, 
		RULE_addInfixExpressionStatement = 50, RULE_subInfixExpressionStatement = 51, 
		RULE_mulInfixExpressionStatement = 52, RULE_divInfixExpressionStatement = 53, 
		RULE_bitandInfixExpressionStatement = 54, RULE_bitorInfixExpressionStatement = 55, 
		RULE_caretInfixExpressionStatement = 56, RULE_modInfixExpressionStatement = 57, 
		RULE_lshiftInfixExpressionStatement = 58, RULE_rshiftInfixExpressionStatement = 59, 
		RULE_urshiftInfixExpressionStatement = 60, RULE_infixExpressionStatement = 61, 
		RULE_instanceofExpressionStatement = 62, RULE_commonMethodReferenceExpression = 63, 
		RULE_commonNewMethodReferenceExpression = 64, RULE_superMethodReferenceExpression = 65, 
		RULE_methodReferenceExpression = 66, RULE_methodReferenceStatement = 67, 
		RULE_commonNameStatement = 68, RULE_varRefNameStatement = 69, RULE_fieldRefNameStatement = 70, 
		RULE_nameStatement = 71, RULE_bangPrefixExpressionStatement = 72, RULE_tildePrefixExpressionStatement = 73, 
		RULE_incPrefixExpressionStatement = 74, RULE_decPrefixExpressionStatement = 75, 
		RULE_addPrefixExpressionStatement = 76, RULE_subPrefixExpressionStatement = 77, 
		RULE_addPrefixExpression = 78, RULE_subPrefixExpression = 79, RULE_prefixExpressionStatement = 80, 
		RULE_incPostfixExpressionStatement = 81, RULE_decPostfixExpressionStatement = 82, 
		RULE_postfixExpressionStatement = 83, RULE_arrayAccessStatement = 84, 
		RULE_referedExpression = 85, RULE_identifier = 86, RULE_anonymousClassBeginStatement = 87, 
		RULE_anonymousClassPlaceHolderStatement = 88, RULE_anonymousClassPreStatement = 89, 
		RULE_atInterfaceStatement = 90, RULE_annotationTypeMemberDeclarationStatement = 91, 
		RULE_classDeclarationStatement = 92, RULE_classInnerDeclarationStatement = 93, 
		RULE_enumDeclarationStatement = 94, RULE_methodDeclarationStatement = 95, 
		RULE_constructionDeclarationStatement = 96, RULE_enumConstantDeclarationStatement = 97, 
		RULE_labeledStatement = 98, RULE_variableDeclarationStatement = 99, RULE_lambdaExpressionStatement = 100, 
		RULE_breakStatement = 101, RULE_continueStatement = 102, RULE_doWhileStatement = 103, 
		RULE_whileStatement = 104, RULE_returnStatement = 105, RULE_switchStatement = 106, 
		RULE_switchCaseStatement = 107, RULE_defaultStatement = 108, RULE_synchronizedStatement = 109, 
		RULE_tryStatement = 110, RULE_throwStatement = 111, RULE_catchClauseStatement = 112, 
		RULE_finallyStatement = 113, RULE_ifStatement = 114, RULE_thenStatement = 115, 
		RULE_elseStatement = 116, RULE_arrayCreationStatement = 117, RULE_initializerStatement = 118, 
		RULE_variableDeclarationHolderStatement = 119, RULE_enhancedForStatement = 120, 
		RULE_partialEndArrayAccessStatement = 121, RULE_leftParentheseStatement = 122, 
		RULE_rightParentheseStatement = 123, RULE_enterMethodParamStatement = 124, 
		RULE_arrayInitializerStartStatement = 125, RULE_arrayInitializerSplitCommaStatement = 126, 
		RULE_arrayInitializerEndStatement = 127, RULE_enumConstantDeclarationSplitCommaStatement = 128, 
		RULE_forStatement = 129, RULE_condExpBeginStatement = 130, RULE_condExpQuestionMarkStatement = 131, 
		RULE_condExpColonMarkStatement = 132, RULE_partialEndStatement = 133, 
		RULE_firstArgPreExist = 134, RULE_firstArgReferedExpression = 135, RULE_commonClassMemberInvoke = 136, 
		RULE_selfClassMemberInvoke = 137, RULE_superClassMemberInvoke = 138, RULE_newClassInvoke = 139, 
		RULE_firstArg = 140, RULE_methodArgPreExist = 141, RULE_methodArgReferedExpression = 142, 
		RULE_argumentList = 143, RULE_argType = 144, RULE_lastArgType = 145, RULE_argTypeList = 146, 
		RULE_literal = 147, RULE_numberLiteral = 148, RULE_integerLiteral = 149, 
		RULE_floatingPointLiteral = 150, RULE_booleanLiteral = 151, RULE_characterLiteral = 152, 
		RULE_stringLiteral = 153, RULE_nullLiteral = 154, RULE_typeLiteral = 155, 
		RULE_type = 156, RULE_virtualInferredType = 157, RULE_primitiveType = 158, 
		RULE_simpleType = 159, RULE_extendBound = 160, RULE_superBound = 161, 
		RULE_wildcardBounds = 162, RULE_wildCardType = 163, RULE_typeArgument = 164, 
		RULE_typeArguments = 165, RULE_parameterizedType = 166, RULE_bothType = 167, 
		RULE_classOrInterfaceType = 168, RULE_arrayType = 169, RULE_dims = 170, 
		RULE_intersectionFirstType = 171, RULE_intersectionSecondType = 172, RULE_intersectionType = 173, 
		RULE_unionFirstType = 174, RULE_unionSecondType = 175, RULE_unionType = 176, 
		RULE_classRef = 177, RULE_finalFieldRef = 178, RULE_finalVarRef = 179, 
		RULE_commonFieldRef = 180, RULE_commonVarRef = 181, RULE_codeHole = 182, 
		RULE_preExist = 183, RULE_endOfArrayDeclarationIndexExpression = 184;
	public static final String[] ruleNames = {
		"statement", "methodArgumentEndStatement", "methodPreRerferedExpressionEndStatement", 
		"commonOverStatement", "forIniOverStatement", "forExpOverStatement", "forUpdOverStatement", 
		"rawForIniOverStatement", "rawForExpOverStatement", "rawForUpdOverStatement", 
		"rawStatement", "expressionStatement", "assignAssignmentStatement", "mulassignAssignmentStatement", 
		"divassignAssignmentStatement", "modassignAssignmentStatement", "addassignAssignmentStatement", 
		"subassignAssignmentStatement", "lshiftassignAssignmentStatement", "rshiftassignAssignmentStatement", 
		"urshiftassignAssignmentStatement", "andassignAssignmentStatement", "xorassignAssignmentStatement", 
		"orassignAssignmentStatement", "assignmentStatement", "positiveLiteralStatement", 
		"negativeLiteralStatement", "normalLiteralStatement", "literalStatement", 
		"castExpressionStatement", "commonMethodInvocationStatement", "superConstructionInvocationStatement", 
		"typeCreationInvocationStatement", "thisConstructionInvocationStatement", 
		"methodInvocationStatement", "qualifiedAccessStatement", "fieldAccessStatement", 
		"chainFieldAccess", "referedFieldAccess", "superFieldAccess", "thisFieldAccess", 
		"fieldAccess", "gtInfixExpressionStatement", "ltInfixExpressionStatement", 
		"equalInfixExpressionStatement", "leInfixExpressionStatement", "geInfixExpressionStatement", 
		"notequalInfixExpressionStatement", "andInfixExpressionStatement", "orInfixExpressionStatement", 
		"addInfixExpressionStatement", "subInfixExpressionStatement", "mulInfixExpressionStatement", 
		"divInfixExpressionStatement", "bitandInfixExpressionStatement", "bitorInfixExpressionStatement", 
		"caretInfixExpressionStatement", "modInfixExpressionStatement", "lshiftInfixExpressionStatement", 
		"rshiftInfixExpressionStatement", "urshiftInfixExpressionStatement", "infixExpressionStatement", 
		"instanceofExpressionStatement", "commonMethodReferenceExpression", "commonNewMethodReferenceExpression", 
		"superMethodReferenceExpression", "methodReferenceExpression", "methodReferenceStatement", 
		"commonNameStatement", "varRefNameStatement", "fieldRefNameStatement", 
		"nameStatement", "bangPrefixExpressionStatement", "tildePrefixExpressionStatement", 
		"incPrefixExpressionStatement", "decPrefixExpressionStatement", "addPrefixExpressionStatement", 
		"subPrefixExpressionStatement", "addPrefixExpression", "subPrefixExpression", 
		"prefixExpressionStatement", "incPostfixExpressionStatement", "decPostfixExpressionStatement", 
		"postfixExpressionStatement", "arrayAccessStatement", "referedExpression", 
		"identifier", "anonymousClassBeginStatement", "anonymousClassPlaceHolderStatement", 
		"anonymousClassPreStatement", "atInterfaceStatement", "annotationTypeMemberDeclarationStatement", 
		"classDeclarationStatement", "classInnerDeclarationStatement", "enumDeclarationStatement", 
		"methodDeclarationStatement", "constructionDeclarationStatement", "enumConstantDeclarationStatement", 
		"labeledStatement", "variableDeclarationStatement", "lambdaExpressionStatement", 
		"breakStatement", "continueStatement", "doWhileStatement", "whileStatement", 
		"returnStatement", "switchStatement", "switchCaseStatement", "defaultStatement", 
		"synchronizedStatement", "tryStatement", "throwStatement", "catchClauseStatement", 
		"finallyStatement", "ifStatement", "thenStatement", "elseStatement", "arrayCreationStatement", 
		"initializerStatement", "variableDeclarationHolderStatement", "enhancedForStatement", 
		"partialEndArrayAccessStatement", "leftParentheseStatement", "rightParentheseStatement", 
		"enterMethodParamStatement", "arrayInitializerStartStatement", "arrayInitializerSplitCommaStatement", 
		"arrayInitializerEndStatement", "enumConstantDeclarationSplitCommaStatement", 
		"forStatement", "condExpBeginStatement", "condExpQuestionMarkStatement", 
		"condExpColonMarkStatement", "partialEndStatement", "firstArgPreExist", 
		"firstArgReferedExpression", "commonClassMemberInvoke", "selfClassMemberInvoke", 
		"superClassMemberInvoke", "newClassInvoke", "firstArg", "methodArgPreExist", 
		"methodArgReferedExpression", "argumentList", "argType", "lastArgType", 
		"argTypeList", "literal", "numberLiteral", "integerLiteral", "floatingPointLiteral", 
		"booleanLiteral", "characterLiteral", "stringLiteral", "nullLiteral", 
		"typeLiteral", "type", "virtualInferredType", "primitiveType", "simpleType", 
		"extendBound", "superBound", "wildcardBounds", "wildCardType", "typeArgument", 
		"typeArguments", "parameterizedType", "bothType", "classOrInterfaceType", 
		"arrayType", "dims", "intersectionFirstType", "intersectionSecondType", 
		"intersectionType", "unionFirstType", "unionSecondType", "unionType", 
		"classRef", "finalFieldRef", "finalVarRef", "commonFieldRef", "commonVarRef", 
		"codeHole", "preExist", "endOfArrayDeclarationIndexExpression"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';Ps'", "';Pr'", "';'", "';FI'", "';FE'", "';FU'", "'DH@;FI'", 
		"'DH@;FE'", "'DH@;FU'", "'A@'", "'='", "'*='", "'/='", "'%='", "'+='", 
		"'-='", "'<<='", "'>>='", "'>>>='", "'&='", "'^='", "'|='", "'L@+'", "'L@-'", 
		"'L@'", "'CE@'", "'('", "')'", "'MI@'", "'super'", "'this'", "'Q@'", "'FA@'", 
		"'IxE@'", "'>'", "'<'", "'=='", "'<='", "'>='", "'!='", "'&&'", "'||'", 
		"'+'", "'-'", "'*'", "'/'", "'&'", "'|'", "'^'", "'%'", "'InE@'", "'instanceof'", 
		"'new'", "'MR@'", "'N@'", "'PeE@'", "'!'", "'~'", "'++'", "'--'", "'PtE@'", 
		"'[@'", "'AB@AnonymousBegin'", "'DH@AnonymousDeclaration'", "'HT@'", "'AT@'", 
		"'AM@'", "'default'", "'CD@'", "'ICD@'", "'ED@'", "'MD@'", "'CR@'", "'EMD@'", 
		"'LD@'", "'VD@'", "'LE@'", "'->'", "'{}'", "'B@'", "'break'", "'C@'", 
		"'continue'", "'DW@'", "'while'", "'WS@'", "'RT@'", "'return'", "'SW@'", 
		"'switch'", "'CS@'", "'case'", "'DF@'", "'SC@'", "'synchronized'", "'DH@try'", 
		"'TS@'", "'throw'", "'CT@'", "'catch'", "'DH@finally'", "'IF@'", "'if'", 
		"'DH@then'", "'DH@else'", "'AC@'", "'IB@'", "'InitialBlock'", "'VH@'", 
		"'EF@'", "'for('", "':'", "'DH@'", "'@Em'", "'DH@A{'", "'DH@A,'", "'DH@A}'", 
		"'DH@E,'", "'DH@for'", "'DH@CondExpBegin'", "'DH@CondExpQM'", "'DH@CondExpCM'", 
		"'DH@,'", "'@PE'", "'true'", "'false'", "'null'", "'class'", "'@IT'", 
		"'float'", "'double'", "'boolean'", "'byte'", "'short'", "'int'", "'long'", 
		"'char'", "'extends'", "'?'", "'['", "']'", "'@K'", "'@D'", "'@X'", "'@F'", 
		"'@C'", "'@HO'", null, "'@'", "'...'", null, null, null, null, "','", 
		"'.'", "'::'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, "IdentifierX", "AT", "ELLIPSIS", "IntegerLiteralX", 
		"FloatingPointLiteralX", "CharacterLiteralX", "StringLiteralX", "COMMA", 
		"DOT", "COLONCOLON", "WS"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Java8.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public Java8Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class StatementContext extends ParserRuleContext {
		public RawStatementContext rawStatement() {
			return getRuleContext(RawStatementContext.class,0);
		}
		public MethodArgumentEndStatementContext methodArgumentEndStatement() {
			return getRuleContext(MethodArgumentEndStatementContext.class,0);
		}
		public MethodPreRerferedExpressionEndStatementContext methodPreRerferedExpressionEndStatement() {
			return getRuleContext(MethodPreRerferedExpressionEndStatementContext.class,0);
		}
		public CommonOverStatementContext commonOverStatement() {
			return getRuleContext(CommonOverStatementContext.class,0);
		}
		public ForIniOverStatementContext forIniOverStatement() {
			return getRuleContext(ForIniOverStatementContext.class,0);
		}
		public ForExpOverStatementContext forExpOverStatement() {
			return getRuleContext(ForExpOverStatementContext.class,0);
		}
		public ForUpdOverStatementContext forUpdOverStatement() {
			return getRuleContext(ForUpdOverStatementContext.class,0);
		}
		public RawForIniOverStatementContext rawForIniOverStatement() {
			return getRuleContext(RawForIniOverStatementContext.class,0);
		}
		public RawForExpOverStatementContext rawForExpOverStatement() {
			return getRuleContext(RawForExpOverStatementContext.class,0);
		}
		public RawForUpdOverStatementContext rawForUpdOverStatement() {
			return getRuleContext(RawForUpdOverStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_statement);
		try {
			setState(380);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(370);
				rawStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(371);
				methodArgumentEndStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(372);
				methodPreRerferedExpressionEndStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(373);
				commonOverStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(374);
				forIniOverStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(375);
				forExpOverStatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(376);
				forUpdOverStatement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(377);
				rawForIniOverStatement();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(378);
				rawForExpOverStatement();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(379);
				rawForUpdOverStatement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodArgumentEndStatementContext extends ParserRuleContext {
		public RawStatementContext rawStatement() {
			return getRuleContext(RawStatementContext.class,0);
		}
		public MethodArgumentEndStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodArgumentEndStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterMethodArgumentEndStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitMethodArgumentEndStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitMethodArgumentEndStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodArgumentEndStatementContext methodArgumentEndStatement() throws RecognitionException {
		MethodArgumentEndStatementContext _localctx = new MethodArgumentEndStatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_methodArgumentEndStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(382);
			rawStatement();
			setState(383);
			match(T__0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodPreRerferedExpressionEndStatementContext extends ParserRuleContext {
		public RawStatementContext rawStatement() {
			return getRuleContext(RawStatementContext.class,0);
		}
		public MethodPreRerferedExpressionEndStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodPreRerferedExpressionEndStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterMethodPreRerferedExpressionEndStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitMethodPreRerferedExpressionEndStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitMethodPreRerferedExpressionEndStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodPreRerferedExpressionEndStatementContext methodPreRerferedExpressionEndStatement() throws RecognitionException {
		MethodPreRerferedExpressionEndStatementContext _localctx = new MethodPreRerferedExpressionEndStatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_methodPreRerferedExpressionEndStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(385);
			rawStatement();
			setState(386);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CommonOverStatementContext extends ParserRuleContext {
		public RawStatementContext rawStatement() {
			return getRuleContext(RawStatementContext.class,0);
		}
		public CommonOverStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commonOverStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterCommonOverStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitCommonOverStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitCommonOverStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommonOverStatementContext commonOverStatement() throws RecognitionException {
		CommonOverStatementContext _localctx = new CommonOverStatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_commonOverStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(388);
			rawStatement();
			setState(389);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForIniOverStatementContext extends ParserRuleContext {
		public RawStatementContext rawStatement() {
			return getRuleContext(RawStatementContext.class,0);
		}
		public ForIniOverStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forIniOverStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterForIniOverStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitForIniOverStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitForIniOverStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForIniOverStatementContext forIniOverStatement() throws RecognitionException {
		ForIniOverStatementContext _localctx = new ForIniOverStatementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_forIniOverStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(391);
			rawStatement();
			setState(392);
			match(T__3);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForExpOverStatementContext extends ParserRuleContext {
		public RawStatementContext rawStatement() {
			return getRuleContext(RawStatementContext.class,0);
		}
		public ForExpOverStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forExpOverStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterForExpOverStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitForExpOverStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitForExpOverStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForExpOverStatementContext forExpOverStatement() throws RecognitionException {
		ForExpOverStatementContext _localctx = new ForExpOverStatementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_forExpOverStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(394);
			rawStatement();
			setState(395);
			match(T__4);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForUpdOverStatementContext extends ParserRuleContext {
		public RawStatementContext rawStatement() {
			return getRuleContext(RawStatementContext.class,0);
		}
		public ForUpdOverStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forUpdOverStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterForUpdOverStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitForUpdOverStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitForUpdOverStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForUpdOverStatementContext forUpdOverStatement() throws RecognitionException {
		ForUpdOverStatementContext _localctx = new ForUpdOverStatementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_forUpdOverStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(397);
			rawStatement();
			setState(398);
			match(T__5);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RawForIniOverStatementContext extends ParserRuleContext {
		public RawForIniOverStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rawForIniOverStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterRawForIniOverStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitRawForIniOverStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitRawForIniOverStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RawForIniOverStatementContext rawForIniOverStatement() throws RecognitionException {
		RawForIniOverStatementContext _localctx = new RawForIniOverStatementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_rawForIniOverStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(400);
			match(T__6);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RawForExpOverStatementContext extends ParserRuleContext {
		public RawForExpOverStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rawForExpOverStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterRawForExpOverStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitRawForExpOverStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitRawForExpOverStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RawForExpOverStatementContext rawForExpOverStatement() throws RecognitionException {
		RawForExpOverStatementContext _localctx = new RawForExpOverStatementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_rawForExpOverStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(402);
			match(T__7);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RawForUpdOverStatementContext extends ParserRuleContext {
		public RawForUpdOverStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rawForUpdOverStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterRawForUpdOverStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitRawForUpdOverStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitRawForUpdOverStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RawForUpdOverStatementContext rawForUpdOverStatement() throws RecognitionException {
		RawForUpdOverStatementContext _localctx = new RawForUpdOverStatementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_rawForUpdOverStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(404);
			match(T__8);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RawStatementContext extends ParserRuleContext {
		public AnonymousClassBeginStatementContext anonymousClassBeginStatement() {
			return getRuleContext(AnonymousClassBeginStatementContext.class,0);
		}
		public AnonymousClassPlaceHolderStatementContext anonymousClassPlaceHolderStatement() {
			return getRuleContext(AnonymousClassPlaceHolderStatementContext.class,0);
		}
		public AnonymousClassPreStatementContext anonymousClassPreStatement() {
			return getRuleContext(AnonymousClassPreStatementContext.class,0);
		}
		public AtInterfaceStatementContext atInterfaceStatement() {
			return getRuleContext(AtInterfaceStatementContext.class,0);
		}
		public AnnotationTypeMemberDeclarationStatementContext annotationTypeMemberDeclarationStatement() {
			return getRuleContext(AnnotationTypeMemberDeclarationStatementContext.class,0);
		}
		public ClassDeclarationStatementContext classDeclarationStatement() {
			return getRuleContext(ClassDeclarationStatementContext.class,0);
		}
		public ClassInnerDeclarationStatementContext classInnerDeclarationStatement() {
			return getRuleContext(ClassInnerDeclarationStatementContext.class,0);
		}
		public EnumDeclarationStatementContext enumDeclarationStatement() {
			return getRuleContext(EnumDeclarationStatementContext.class,0);
		}
		public MethodDeclarationStatementContext methodDeclarationStatement() {
			return getRuleContext(MethodDeclarationStatementContext.class,0);
		}
		public ConstructionDeclarationStatementContext constructionDeclarationStatement() {
			return getRuleContext(ConstructionDeclarationStatementContext.class,0);
		}
		public EnumConstantDeclarationStatementContext enumConstantDeclarationStatement() {
			return getRuleContext(EnumConstantDeclarationStatementContext.class,0);
		}
		public LabeledStatementContext labeledStatement() {
			return getRuleContext(LabeledStatementContext.class,0);
		}
		public VariableDeclarationStatementContext variableDeclarationStatement() {
			return getRuleContext(VariableDeclarationStatementContext.class,0);
		}
		public BreakStatementContext breakStatement() {
			return getRuleContext(BreakStatementContext.class,0);
		}
		public ContinueStatementContext continueStatement() {
			return getRuleContext(ContinueStatementContext.class,0);
		}
		public DoWhileStatementContext doWhileStatement() {
			return getRuleContext(DoWhileStatementContext.class,0);
		}
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public SwitchStatementContext switchStatement() {
			return getRuleContext(SwitchStatementContext.class,0);
		}
		public SwitchCaseStatementContext switchCaseStatement() {
			return getRuleContext(SwitchCaseStatementContext.class,0);
		}
		public DefaultStatementContext defaultStatement() {
			return getRuleContext(DefaultStatementContext.class,0);
		}
		public SynchronizedStatementContext synchronizedStatement() {
			return getRuleContext(SynchronizedStatementContext.class,0);
		}
		public TryStatementContext tryStatement() {
			return getRuleContext(TryStatementContext.class,0);
		}
		public ThrowStatementContext throwStatement() {
			return getRuleContext(ThrowStatementContext.class,0);
		}
		public CatchClauseStatementContext catchClauseStatement() {
			return getRuleContext(CatchClauseStatementContext.class,0);
		}
		public FinallyStatementContext finallyStatement() {
			return getRuleContext(FinallyStatementContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public ThenStatementContext thenStatement() {
			return getRuleContext(ThenStatementContext.class,0);
		}
		public ElseStatementContext elseStatement() {
			return getRuleContext(ElseStatementContext.class,0);
		}
		public ArrayCreationStatementContext arrayCreationStatement() {
			return getRuleContext(ArrayCreationStatementContext.class,0);
		}
		public InitializerStatementContext initializerStatement() {
			return getRuleContext(InitializerStatementContext.class,0);
		}
		public VariableDeclarationHolderStatementContext variableDeclarationHolderStatement() {
			return getRuleContext(VariableDeclarationHolderStatementContext.class,0);
		}
		public EnhancedForStatementContext enhancedForStatement() {
			return getRuleContext(EnhancedForStatementContext.class,0);
		}
		public PartialEndArrayAccessStatementContext partialEndArrayAccessStatement() {
			return getRuleContext(PartialEndArrayAccessStatementContext.class,0);
		}
		public LeftParentheseStatementContext leftParentheseStatement() {
			return getRuleContext(LeftParentheseStatementContext.class,0);
		}
		public RightParentheseStatementContext rightParentheseStatement() {
			return getRuleContext(RightParentheseStatementContext.class,0);
		}
		public EnterMethodParamStatementContext enterMethodParamStatement() {
			return getRuleContext(EnterMethodParamStatementContext.class,0);
		}
		public ArrayInitializerStartStatementContext arrayInitializerStartStatement() {
			return getRuleContext(ArrayInitializerStartStatementContext.class,0);
		}
		public ArrayInitializerSplitCommaStatementContext arrayInitializerSplitCommaStatement() {
			return getRuleContext(ArrayInitializerSplitCommaStatementContext.class,0);
		}
		public ArrayInitializerEndStatementContext arrayInitializerEndStatement() {
			return getRuleContext(ArrayInitializerEndStatementContext.class,0);
		}
		public EnumConstantDeclarationSplitCommaStatementContext enumConstantDeclarationSplitCommaStatement() {
			return getRuleContext(EnumConstantDeclarationSplitCommaStatementContext.class,0);
		}
		public ForStatementContext forStatement() {
			return getRuleContext(ForStatementContext.class,0);
		}
		public CondExpBeginStatementContext condExpBeginStatement() {
			return getRuleContext(CondExpBeginStatementContext.class,0);
		}
		public CondExpQuestionMarkStatementContext condExpQuestionMarkStatement() {
			return getRuleContext(CondExpQuestionMarkStatementContext.class,0);
		}
		public CondExpColonMarkStatementContext condExpColonMarkStatement() {
			return getRuleContext(CondExpColonMarkStatementContext.class,0);
		}
		public PartialEndStatementContext partialEndStatement() {
			return getRuleContext(PartialEndStatementContext.class,0);
		}
		public ExpressionStatementContext expressionStatement() {
			return getRuleContext(ExpressionStatementContext.class,0);
		}
		public RawStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rawStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterRawStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitRawStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitRawStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RawStatementContext rawStatement() throws RecognitionException {
		RawStatementContext _localctx = new RawStatementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_rawStatement);
		try {
			setState(453);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(406);
				anonymousClassBeginStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(407);
				anonymousClassPlaceHolderStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(408);
				anonymousClassPreStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(409);
				atInterfaceStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(410);
				annotationTypeMemberDeclarationStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(411);
				classDeclarationStatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(412);
				classInnerDeclarationStatement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(413);
				enumDeclarationStatement();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(414);
				methodDeclarationStatement();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(415);
				constructionDeclarationStatement();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(416);
				enumConstantDeclarationStatement();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(417);
				labeledStatement();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(418);
				variableDeclarationStatement();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(419);
				breakStatement();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(420);
				continueStatement();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(421);
				doWhileStatement();
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(422);
				whileStatement();
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(423);
				returnStatement();
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(424);
				switchStatement();
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(425);
				switchCaseStatement();
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(426);
				defaultStatement();
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(427);
				synchronizedStatement();
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(428);
				tryStatement();
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(429);
				throwStatement();
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(430);
				catchClauseStatement();
				}
				break;
			case 26:
				enterOuterAlt(_localctx, 26);
				{
				setState(431);
				finallyStatement();
				}
				break;
			case 27:
				enterOuterAlt(_localctx, 27);
				{
				setState(432);
				ifStatement();
				}
				break;
			case 28:
				enterOuterAlt(_localctx, 28);
				{
				setState(433);
				thenStatement();
				}
				break;
			case 29:
				enterOuterAlt(_localctx, 29);
				{
				setState(434);
				elseStatement();
				}
				break;
			case 30:
				enterOuterAlt(_localctx, 30);
				{
				setState(435);
				arrayCreationStatement();
				}
				break;
			case 31:
				enterOuterAlt(_localctx, 31);
				{
				setState(436);
				initializerStatement();
				}
				break;
			case 32:
				enterOuterAlt(_localctx, 32);
				{
				setState(437);
				variableDeclarationHolderStatement();
				}
				break;
			case 33:
				enterOuterAlt(_localctx, 33);
				{
				setState(438);
				enhancedForStatement();
				}
				break;
			case 34:
				enterOuterAlt(_localctx, 34);
				{
				setState(439);
				partialEndArrayAccessStatement();
				}
				break;
			case 35:
				enterOuterAlt(_localctx, 35);
				{
				setState(440);
				leftParentheseStatement();
				}
				break;
			case 36:
				enterOuterAlt(_localctx, 36);
				{
				setState(441);
				rightParentheseStatement();
				}
				break;
			case 37:
				enterOuterAlt(_localctx, 37);
				{
				setState(442);
				enterMethodParamStatement();
				}
				break;
			case 38:
				enterOuterAlt(_localctx, 38);
				{
				setState(443);
				arrayInitializerStartStatement();
				}
				break;
			case 39:
				enterOuterAlt(_localctx, 39);
				{
				setState(444);
				arrayInitializerSplitCommaStatement();
				}
				break;
			case 40:
				enterOuterAlt(_localctx, 40);
				{
				setState(445);
				arrayInitializerEndStatement();
				}
				break;
			case 41:
				enterOuterAlt(_localctx, 41);
				{
				setState(446);
				enumConstantDeclarationSplitCommaStatement();
				}
				break;
			case 42:
				enterOuterAlt(_localctx, 42);
				{
				setState(447);
				forStatement();
				}
				break;
			case 43:
				enterOuterAlt(_localctx, 43);
				{
				setState(448);
				condExpBeginStatement();
				}
				break;
			case 44:
				enterOuterAlt(_localctx, 44);
				{
				setState(449);
				condExpQuestionMarkStatement();
				}
				break;
			case 45:
				enterOuterAlt(_localctx, 45);
				{
				setState(450);
				condExpColonMarkStatement();
				}
				break;
			case 46:
				enterOuterAlt(_localctx, 46);
				{
				setState(451);
				partialEndStatement();
				}
				break;
			case 47:
				enterOuterAlt(_localctx, 47);
				{
				setState(452);
				expressionStatement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionStatementContext extends ParserRuleContext {
		public AssignmentStatementContext assignmentStatement() {
			return getRuleContext(AssignmentStatementContext.class,0);
		}
		public LambdaExpressionStatementContext lambdaExpressionStatement() {
			return getRuleContext(LambdaExpressionStatementContext.class,0);
		}
		public LiteralStatementContext literalStatement() {
			return getRuleContext(LiteralStatementContext.class,0);
		}
		public CastExpressionStatementContext castExpressionStatement() {
			return getRuleContext(CastExpressionStatementContext.class,0);
		}
		public MethodInvocationStatementContext methodInvocationStatement() {
			return getRuleContext(MethodInvocationStatementContext.class,0);
		}
		public FieldAccessStatementContext fieldAccessStatement() {
			return getRuleContext(FieldAccessStatementContext.class,0);
		}
		public QualifiedAccessStatementContext qualifiedAccessStatement() {
			return getRuleContext(QualifiedAccessStatementContext.class,0);
		}
		public InfixExpressionStatementContext infixExpressionStatement() {
			return getRuleContext(InfixExpressionStatementContext.class,0);
		}
		public InstanceofExpressionStatementContext instanceofExpressionStatement() {
			return getRuleContext(InstanceofExpressionStatementContext.class,0);
		}
		public MethodReferenceStatementContext methodReferenceStatement() {
			return getRuleContext(MethodReferenceStatementContext.class,0);
		}
		public NameStatementContext nameStatement() {
			return getRuleContext(NameStatementContext.class,0);
		}
		public PrefixExpressionStatementContext prefixExpressionStatement() {
			return getRuleContext(PrefixExpressionStatementContext.class,0);
		}
		public PostfixExpressionStatementContext postfixExpressionStatement() {
			return getRuleContext(PostfixExpressionStatementContext.class,0);
		}
		public ArrayAccessStatementContext arrayAccessStatement() {
			return getRuleContext(ArrayAccessStatementContext.class,0);
		}
		public ExpressionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterExpressionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitExpressionStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitExpressionStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionStatementContext expressionStatement() throws RecognitionException {
		ExpressionStatementContext _localctx = new ExpressionStatementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_expressionStatement);
		try {
			setState(469);
			switch (_input.LA(1)) {
			case T__9:
				enterOuterAlt(_localctx, 1);
				{
				setState(455);
				assignmentStatement();
				}
				break;
			case T__76:
				enterOuterAlt(_localctx, 2);
				{
				setState(456);
				lambdaExpressionStatement();
				}
				break;
			case T__22:
			case T__23:
			case T__24:
				enterOuterAlt(_localctx, 3);
				{
				setState(457);
				literalStatement();
				}
				break;
			case T__25:
				enterOuterAlt(_localctx, 4);
				{
				setState(458);
				castExpressionStatement();
				}
				break;
			case T__28:
				enterOuterAlt(_localctx, 5);
				{
				setState(459);
				methodInvocationStatement();
				}
				break;
			case T__32:
				enterOuterAlt(_localctx, 6);
				{
				setState(460);
				fieldAccessStatement();
				}
				break;
			case T__31:
				enterOuterAlt(_localctx, 7);
				{
				setState(461);
				qualifiedAccessStatement();
				}
				break;
			case T__33:
				enterOuterAlt(_localctx, 8);
				{
				setState(462);
				infixExpressionStatement();
				}
				break;
			case T__50:
				enterOuterAlt(_localctx, 9);
				{
				setState(463);
				instanceofExpressionStatement();
				}
				break;
			case T__53:
				enterOuterAlt(_localctx, 10);
				{
				setState(464);
				methodReferenceStatement();
				}
				break;
			case T__54:
				enterOuterAlt(_localctx, 11);
				{
				setState(465);
				nameStatement();
				}
				break;
			case T__55:
				enterOuterAlt(_localctx, 12);
				{
				setState(466);
				prefixExpressionStatement();
				}
				break;
			case T__60:
				enterOuterAlt(_localctx, 13);
				{
				setState(467);
				postfixExpressionStatement();
				}
				break;
			case T__61:
				enterOuterAlt(_localctx, 14);
				{
				setState(468);
				arrayAccessStatement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignAssignmentStatementContext extends ParserRuleContext {
		public List<ReferedExpressionContext> referedExpression() {
			return getRuleContexts(ReferedExpressionContext.class);
		}
		public ReferedExpressionContext referedExpression(int i) {
			return getRuleContext(ReferedExpressionContext.class,i);
		}
		public AssignAssignmentStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignAssignmentStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterAssignAssignmentStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitAssignAssignmentStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitAssignAssignmentStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignAssignmentStatementContext assignAssignmentStatement() throws RecognitionException {
		AssignAssignmentStatementContext _localctx = new AssignAssignmentStatementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_assignAssignmentStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(471);
			match(T__9);
			setState(472);
			referedExpression();
			setState(473);
			match(T__10);
			setState(474);
			referedExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MulassignAssignmentStatementContext extends ParserRuleContext {
		public List<ReferedExpressionContext> referedExpression() {
			return getRuleContexts(ReferedExpressionContext.class);
		}
		public ReferedExpressionContext referedExpression(int i) {
			return getRuleContext(ReferedExpressionContext.class,i);
		}
		public MulassignAssignmentStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mulassignAssignmentStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterMulassignAssignmentStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitMulassignAssignmentStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitMulassignAssignmentStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MulassignAssignmentStatementContext mulassignAssignmentStatement() throws RecognitionException {
		MulassignAssignmentStatementContext _localctx = new MulassignAssignmentStatementContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_mulassignAssignmentStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(476);
			match(T__9);
			setState(477);
			referedExpression();
			setState(478);
			match(T__11);
			setState(479);
			referedExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DivassignAssignmentStatementContext extends ParserRuleContext {
		public List<ReferedExpressionContext> referedExpression() {
			return getRuleContexts(ReferedExpressionContext.class);
		}
		public ReferedExpressionContext referedExpression(int i) {
			return getRuleContext(ReferedExpressionContext.class,i);
		}
		public DivassignAssignmentStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_divassignAssignmentStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterDivassignAssignmentStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitDivassignAssignmentStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitDivassignAssignmentStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DivassignAssignmentStatementContext divassignAssignmentStatement() throws RecognitionException {
		DivassignAssignmentStatementContext _localctx = new DivassignAssignmentStatementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_divassignAssignmentStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(481);
			match(T__9);
			setState(482);
			referedExpression();
			setState(483);
			match(T__12);
			setState(484);
			referedExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ModassignAssignmentStatementContext extends ParserRuleContext {
		public List<ReferedExpressionContext> referedExpression() {
			return getRuleContexts(ReferedExpressionContext.class);
		}
		public ReferedExpressionContext referedExpression(int i) {
			return getRuleContext(ReferedExpressionContext.class,i);
		}
		public ModassignAssignmentStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modassignAssignmentStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterModassignAssignmentStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitModassignAssignmentStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitModassignAssignmentStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModassignAssignmentStatementContext modassignAssignmentStatement() throws RecognitionException {
		ModassignAssignmentStatementContext _localctx = new ModassignAssignmentStatementContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_modassignAssignmentStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(486);
			match(T__9);
			setState(487);
			referedExpression();
			setState(488);
			match(T__13);
			setState(489);
			referedExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AddassignAssignmentStatementContext extends ParserRuleContext {
		public List<ReferedExpressionContext> referedExpression() {
			return getRuleContexts(ReferedExpressionContext.class);
		}
		public ReferedExpressionContext referedExpression(int i) {
			return getRuleContext(ReferedExpressionContext.class,i);
		}
		public AddassignAssignmentStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addassignAssignmentStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterAddassignAssignmentStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitAddassignAssignmentStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitAddassignAssignmentStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AddassignAssignmentStatementContext addassignAssignmentStatement() throws RecognitionException {
		AddassignAssignmentStatementContext _localctx = new AddassignAssignmentStatementContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_addassignAssignmentStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(491);
			match(T__9);
			setState(492);
			referedExpression();
			setState(493);
			match(T__14);
			setState(494);
			referedExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SubassignAssignmentStatementContext extends ParserRuleContext {
		public List<ReferedExpressionContext> referedExpression() {
			return getRuleContexts(ReferedExpressionContext.class);
		}
		public ReferedExpressionContext referedExpression(int i) {
			return getRuleContext(ReferedExpressionContext.class,i);
		}
		public SubassignAssignmentStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subassignAssignmentStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterSubassignAssignmentStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitSubassignAssignmentStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitSubassignAssignmentStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubassignAssignmentStatementContext subassignAssignmentStatement() throws RecognitionException {
		SubassignAssignmentStatementContext _localctx = new SubassignAssignmentStatementContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_subassignAssignmentStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(496);
			match(T__9);
			setState(497);
			referedExpression();
			setState(498);
			match(T__15);
			setState(499);
			referedExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LshiftassignAssignmentStatementContext extends ParserRuleContext {
		public List<ReferedExpressionContext> referedExpression() {
			return getRuleContexts(ReferedExpressionContext.class);
		}
		public ReferedExpressionContext referedExpression(int i) {
			return getRuleContext(ReferedExpressionContext.class,i);
		}
		public LshiftassignAssignmentStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lshiftassignAssignmentStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterLshiftassignAssignmentStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitLshiftassignAssignmentStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitLshiftassignAssignmentStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LshiftassignAssignmentStatementContext lshiftassignAssignmentStatement() throws RecognitionException {
		LshiftassignAssignmentStatementContext _localctx = new LshiftassignAssignmentStatementContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_lshiftassignAssignmentStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(501);
			match(T__9);
			setState(502);
			referedExpression();
			setState(503);
			match(T__16);
			setState(504);
			referedExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RshiftassignAssignmentStatementContext extends ParserRuleContext {
		public List<ReferedExpressionContext> referedExpression() {
			return getRuleContexts(ReferedExpressionContext.class);
		}
		public ReferedExpressionContext referedExpression(int i) {
			return getRuleContext(ReferedExpressionContext.class,i);
		}
		public RshiftassignAssignmentStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rshiftassignAssignmentStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterRshiftassignAssignmentStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitRshiftassignAssignmentStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitRshiftassignAssignmentStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RshiftassignAssignmentStatementContext rshiftassignAssignmentStatement() throws RecognitionException {
		RshiftassignAssignmentStatementContext _localctx = new RshiftassignAssignmentStatementContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_rshiftassignAssignmentStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(506);
			match(T__9);
			setState(507);
			referedExpression();
			setState(508);
			match(T__17);
			setState(509);
			referedExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UrshiftassignAssignmentStatementContext extends ParserRuleContext {
		public List<ReferedExpressionContext> referedExpression() {
			return getRuleContexts(ReferedExpressionContext.class);
		}
		public ReferedExpressionContext referedExpression(int i) {
			return getRuleContext(ReferedExpressionContext.class,i);
		}
		public UrshiftassignAssignmentStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_urshiftassignAssignmentStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterUrshiftassignAssignmentStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitUrshiftassignAssignmentStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitUrshiftassignAssignmentStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UrshiftassignAssignmentStatementContext urshiftassignAssignmentStatement() throws RecognitionException {
		UrshiftassignAssignmentStatementContext _localctx = new UrshiftassignAssignmentStatementContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_urshiftassignAssignmentStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(511);
			match(T__9);
			setState(512);
			referedExpression();
			setState(513);
			match(T__18);
			setState(514);
			referedExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AndassignAssignmentStatementContext extends ParserRuleContext {
		public List<ReferedExpressionContext> referedExpression() {
			return getRuleContexts(ReferedExpressionContext.class);
		}
		public ReferedExpressionContext referedExpression(int i) {
			return getRuleContext(ReferedExpressionContext.class,i);
		}
		public AndassignAssignmentStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_andassignAssignmentStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterAndassignAssignmentStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitAndassignAssignmentStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitAndassignAssignmentStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AndassignAssignmentStatementContext andassignAssignmentStatement() throws RecognitionException {
		AndassignAssignmentStatementContext _localctx = new AndassignAssignmentStatementContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_andassignAssignmentStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(516);
			match(T__9);
			setState(517);
			referedExpression();
			setState(518);
			match(T__19);
			setState(519);
			referedExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class XorassignAssignmentStatementContext extends ParserRuleContext {
		public List<ReferedExpressionContext> referedExpression() {
			return getRuleContexts(ReferedExpressionContext.class);
		}
		public ReferedExpressionContext referedExpression(int i) {
			return getRuleContext(ReferedExpressionContext.class,i);
		}
		public XorassignAssignmentStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_xorassignAssignmentStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterXorassignAssignmentStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitXorassignAssignmentStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitXorassignAssignmentStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final XorassignAssignmentStatementContext xorassignAssignmentStatement() throws RecognitionException {
		XorassignAssignmentStatementContext _localctx = new XorassignAssignmentStatementContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_xorassignAssignmentStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(521);
			match(T__9);
			setState(522);
			referedExpression();
			setState(523);
			match(T__20);
			setState(524);
			referedExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OrassignAssignmentStatementContext extends ParserRuleContext {
		public List<ReferedExpressionContext> referedExpression() {
			return getRuleContexts(ReferedExpressionContext.class);
		}
		public ReferedExpressionContext referedExpression(int i) {
			return getRuleContext(ReferedExpressionContext.class,i);
		}
		public OrassignAssignmentStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orassignAssignmentStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterOrassignAssignmentStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitOrassignAssignmentStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitOrassignAssignmentStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrassignAssignmentStatementContext orassignAssignmentStatement() throws RecognitionException {
		OrassignAssignmentStatementContext _localctx = new OrassignAssignmentStatementContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_orassignAssignmentStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(526);
			match(T__9);
			setState(527);
			referedExpression();
			setState(528);
			match(T__21);
			setState(529);
			referedExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentStatementContext extends ParserRuleContext {
		public AssignAssignmentStatementContext assignAssignmentStatement() {
			return getRuleContext(AssignAssignmentStatementContext.class,0);
		}
		public MulassignAssignmentStatementContext mulassignAssignmentStatement() {
			return getRuleContext(MulassignAssignmentStatementContext.class,0);
		}
		public DivassignAssignmentStatementContext divassignAssignmentStatement() {
			return getRuleContext(DivassignAssignmentStatementContext.class,0);
		}
		public ModassignAssignmentStatementContext modassignAssignmentStatement() {
			return getRuleContext(ModassignAssignmentStatementContext.class,0);
		}
		public AddassignAssignmentStatementContext addassignAssignmentStatement() {
			return getRuleContext(AddassignAssignmentStatementContext.class,0);
		}
		public SubassignAssignmentStatementContext subassignAssignmentStatement() {
			return getRuleContext(SubassignAssignmentStatementContext.class,0);
		}
		public LshiftassignAssignmentStatementContext lshiftassignAssignmentStatement() {
			return getRuleContext(LshiftassignAssignmentStatementContext.class,0);
		}
		public RshiftassignAssignmentStatementContext rshiftassignAssignmentStatement() {
			return getRuleContext(RshiftassignAssignmentStatementContext.class,0);
		}
		public UrshiftassignAssignmentStatementContext urshiftassignAssignmentStatement() {
			return getRuleContext(UrshiftassignAssignmentStatementContext.class,0);
		}
		public AndassignAssignmentStatementContext andassignAssignmentStatement() {
			return getRuleContext(AndassignAssignmentStatementContext.class,0);
		}
		public XorassignAssignmentStatementContext xorassignAssignmentStatement() {
			return getRuleContext(XorassignAssignmentStatementContext.class,0);
		}
		public OrassignAssignmentStatementContext orassignAssignmentStatement() {
			return getRuleContext(OrassignAssignmentStatementContext.class,0);
		}
		public AssignmentStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterAssignmentStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitAssignmentStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitAssignmentStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentStatementContext assignmentStatement() throws RecognitionException {
		AssignmentStatementContext _localctx = new AssignmentStatementContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_assignmentStatement);
		try {
			setState(543);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(531);
				assignAssignmentStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(532);
				mulassignAssignmentStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(533);
				divassignAssignmentStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(534);
				modassignAssignmentStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(535);
				addassignAssignmentStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(536);
				subassignAssignmentStatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(537);
				lshiftassignAssignmentStatement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(538);
				rshiftassignAssignmentStatement();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(539);
				urshiftassignAssignmentStatement();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(540);
				andassignAssignmentStatement();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(541);
				xorassignAssignmentStatement();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(542);
				orassignAssignmentStatement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PositiveLiteralStatementContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public PositiveLiteralStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_positiveLiteralStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterPositiveLiteralStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitPositiveLiteralStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitPositiveLiteralStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PositiveLiteralStatementContext positiveLiteralStatement() throws RecognitionException {
		PositiveLiteralStatementContext _localctx = new PositiveLiteralStatementContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_positiveLiteralStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(545);
			match(T__22);
			setState(546);
			literal();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NegativeLiteralStatementContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public NegativeLiteralStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_negativeLiteralStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterNegativeLiteralStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitNegativeLiteralStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitNegativeLiteralStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NegativeLiteralStatementContext negativeLiteralStatement() throws RecognitionException {
		NegativeLiteralStatementContext _localctx = new NegativeLiteralStatementContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_negativeLiteralStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(548);
			match(T__23);
			setState(549);
			literal();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NormalLiteralStatementContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public NormalLiteralStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_normalLiteralStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterNormalLiteralStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitNormalLiteralStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitNormalLiteralStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NormalLiteralStatementContext normalLiteralStatement() throws RecognitionException {
		NormalLiteralStatementContext _localctx = new NormalLiteralStatementContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_normalLiteralStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(551);
			match(T__24);
			setState(552);
			literal();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LiteralStatementContext extends ParserRuleContext {
		public NormalLiteralStatementContext normalLiteralStatement() {
			return getRuleContext(NormalLiteralStatementContext.class,0);
		}
		public NegativeLiteralStatementContext negativeLiteralStatement() {
			return getRuleContext(NegativeLiteralStatementContext.class,0);
		}
		public PositiveLiteralStatementContext positiveLiteralStatement() {
			return getRuleContext(PositiveLiteralStatementContext.class,0);
		}
		public LiteralStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literalStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterLiteralStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitLiteralStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitLiteralStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralStatementContext literalStatement() throws RecognitionException {
		LiteralStatementContext _localctx = new LiteralStatementContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_literalStatement);
		try {
			setState(557);
			switch (_input.LA(1)) {
			case T__24:
				enterOuterAlt(_localctx, 1);
				{
				setState(554);
				normalLiteralStatement();
				}
				break;
			case T__23:
				enterOuterAlt(_localctx, 2);
				{
				setState(555);
				negativeLiteralStatement();
				}
				break;
			case T__22:
				enterOuterAlt(_localctx, 3);
				{
				setState(556);
				positiveLiteralStatement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CastExpressionStatementContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ReferedExpressionContext referedExpression() {
			return getRuleContext(ReferedExpressionContext.class,0);
		}
		public CastExpressionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_castExpressionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterCastExpressionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitCastExpressionStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitCastExpressionStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CastExpressionStatementContext castExpressionStatement() throws RecognitionException {
		CastExpressionStatementContext _localctx = new CastExpressionStatementContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_castExpressionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(559);
			match(T__25);
			setState(560);
			match(T__26);
			setState(561);
			type();
			setState(562);
			match(T__27);
			setState(563);
			referedExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CommonMethodInvocationStatementContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public CommonMethodInvocationStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commonMethodInvocationStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterCommonMethodInvocationStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitCommonMethodInvocationStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitCommonMethodInvocationStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommonMethodInvocationStatementContext commonMethodInvocationStatement() throws RecognitionException {
		CommonMethodInvocationStatementContext _localctx = new CommonMethodInvocationStatementContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_commonMethodInvocationStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(565);
			match(T__28);
			setState(566);
			identifier();
			setState(567);
			match(T__26);
			setState(568);
			argumentList();
			setState(569);
			match(T__27);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SuperConstructionInvocationStatementContext extends ParserRuleContext {
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public SuperConstructionInvocationStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_superConstructionInvocationStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterSuperConstructionInvocationStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitSuperConstructionInvocationStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitSuperConstructionInvocationStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SuperConstructionInvocationStatementContext superConstructionInvocationStatement() throws RecognitionException {
		SuperConstructionInvocationStatementContext _localctx = new SuperConstructionInvocationStatementContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_superConstructionInvocationStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(571);
			match(T__28);
			setState(572);
			match(T__29);
			setState(573);
			match(T__26);
			setState(574);
			argumentList();
			setState(575);
			match(T__27);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeCreationInvocationStatementContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public TypeCreationInvocationStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeCreationInvocationStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterTypeCreationInvocationStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitTypeCreationInvocationStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitTypeCreationInvocationStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeCreationInvocationStatementContext typeCreationInvocationStatement() throws RecognitionException {
		TypeCreationInvocationStatementContext _localctx = new TypeCreationInvocationStatementContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_typeCreationInvocationStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(577);
			match(T__28);
			setState(578);
			type();
			setState(579);
			match(T__26);
			setState(580);
			argumentList();
			setState(581);
			match(T__27);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ThisConstructionInvocationStatementContext extends ParserRuleContext {
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public ThisConstructionInvocationStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_thisConstructionInvocationStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterThisConstructionInvocationStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitThisConstructionInvocationStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitThisConstructionInvocationStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ThisConstructionInvocationStatementContext thisConstructionInvocationStatement() throws RecognitionException {
		ThisConstructionInvocationStatementContext _localctx = new ThisConstructionInvocationStatementContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_thisConstructionInvocationStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(583);
			match(T__28);
			setState(584);
			match(T__30);
			setState(585);
			match(T__26);
			setState(586);
			argumentList();
			setState(587);
			match(T__27);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodInvocationStatementContext extends ParserRuleContext {
		public CommonMethodInvocationStatementContext commonMethodInvocationStatement() {
			return getRuleContext(CommonMethodInvocationStatementContext.class,0);
		}
		public SuperConstructionInvocationStatementContext superConstructionInvocationStatement() {
			return getRuleContext(SuperConstructionInvocationStatementContext.class,0);
		}
		public TypeCreationInvocationStatementContext typeCreationInvocationStatement() {
			return getRuleContext(TypeCreationInvocationStatementContext.class,0);
		}
		public ThisConstructionInvocationStatementContext thisConstructionInvocationStatement() {
			return getRuleContext(ThisConstructionInvocationStatementContext.class,0);
		}
		public MethodInvocationStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodInvocationStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterMethodInvocationStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitMethodInvocationStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitMethodInvocationStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodInvocationStatementContext methodInvocationStatement() throws RecognitionException {
		MethodInvocationStatementContext _localctx = new MethodInvocationStatementContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_methodInvocationStatement);
		try {
			setState(593);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(589);
				commonMethodInvocationStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(590);
				superConstructionInvocationStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(591);
				typeCreationInvocationStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(592);
				thisConstructionInvocationStatement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QualifiedAccessStatementContext extends ParserRuleContext {
		public FieldAccessContext fieldAccess() {
			return getRuleContext(FieldAccessContext.class,0);
		}
		public QualifiedAccessStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedAccessStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterQualifiedAccessStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitQualifiedAccessStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitQualifiedAccessStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QualifiedAccessStatementContext qualifiedAccessStatement() throws RecognitionException {
		QualifiedAccessStatementContext _localctx = new QualifiedAccessStatementContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_qualifiedAccessStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(595);
			match(T__31);
			setState(596);
			fieldAccess();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FieldAccessStatementContext extends ParserRuleContext {
		public FieldAccessContext fieldAccess() {
			return getRuleContext(FieldAccessContext.class,0);
		}
		public FieldAccessStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldAccessStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterFieldAccessStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitFieldAccessStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitFieldAccessStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldAccessStatementContext fieldAccessStatement() throws RecognitionException {
		FieldAccessStatementContext _localctx = new FieldAccessStatementContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_fieldAccessStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(598);
			match(T__32);
			setState(599);
			fieldAccess();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ChainFieldAccessContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public FieldAccessContext fieldAccess() {
			return getRuleContext(FieldAccessContext.class,0);
		}
		public ChainFieldAccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chainFieldAccess; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterChainFieldAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitChainFieldAccess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitChainFieldAccess(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ChainFieldAccessContext chainFieldAccess() throws RecognitionException {
		ChainFieldAccessContext _localctx = new ChainFieldAccessContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_chainFieldAccess);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(601);
			identifier();
			setState(602);
			match(DOT);
			setState(603);
			fieldAccess();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReferedFieldAccessContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ReferedExpressionContext referedExpression() {
			return getRuleContext(ReferedExpressionContext.class,0);
		}
		public ReferedFieldAccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_referedFieldAccess; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterReferedFieldAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitReferedFieldAccess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitReferedFieldAccess(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReferedFieldAccessContext referedFieldAccess() throws RecognitionException {
		ReferedFieldAccessContext _localctx = new ReferedFieldAccessContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_referedFieldAccess);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(605);
			identifier();
			setState(606);
			match(DOT);
			setState(607);
			referedExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SuperFieldAccessContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ReferedExpressionContext referedExpression() {
			return getRuleContext(ReferedExpressionContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public SuperFieldAccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_superFieldAccess; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterSuperFieldAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitSuperFieldAccess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitSuperFieldAccess(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SuperFieldAccessContext superFieldAccess() throws RecognitionException {
		SuperFieldAccessContext _localctx = new SuperFieldAccessContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_superFieldAccess);
		try {
			setState(625);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(609);
				identifier();
				setState(610);
				match(DOT);
				setState(611);
				match(T__29);
				setState(612);
				match(DOT);
				setState(613);
				referedExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(615);
				identifier();
				setState(616);
				match(DOT);
				setState(617);
				match(T__29);
				setState(618);
				match(DOT);
				setState(619);
				type();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(621);
				identifier();
				setState(622);
				match(DOT);
				setState(623);
				match(T__29);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ThisFieldAccessContext extends ParserRuleContext {
		public ReferedExpressionContext referedExpression() {
			return getRuleContext(ReferedExpressionContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ThisFieldAccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_thisFieldAccess; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterThisFieldAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitThisFieldAccess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitThisFieldAccess(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ThisFieldAccessContext thisFieldAccess() throws RecognitionException {
		ThisFieldAccessContext _localctx = new ThisFieldAccessContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_thisFieldAccess);
		try {
			setState(634);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(627);
				match(T__30);
				setState(628);
				match(DOT);
				setState(629);
				referedExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(630);
				match(T__30);
				setState(631);
				match(DOT);
				setState(632);
				type();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(633);
				match(T__30);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FieldAccessContext extends ParserRuleContext {
		public ChainFieldAccessContext chainFieldAccess() {
			return getRuleContext(ChainFieldAccessContext.class,0);
		}
		public CommonFieldRefContext commonFieldRef() {
			return getRuleContext(CommonFieldRefContext.class,0);
		}
		public ReferedFieldAccessContext referedFieldAccess() {
			return getRuleContext(ReferedFieldAccessContext.class,0);
		}
		public SuperFieldAccessContext superFieldAccess() {
			return getRuleContext(SuperFieldAccessContext.class,0);
		}
		public ThisFieldAccessContext thisFieldAccess() {
			return getRuleContext(ThisFieldAccessContext.class,0);
		}
		public FieldAccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldAccess; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterFieldAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitFieldAccess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitFieldAccess(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldAccessContext fieldAccess() throws RecognitionException {
		FieldAccessContext _localctx = new FieldAccessContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_fieldAccess);
		try {
			setState(641);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(636);
				chainFieldAccess();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(637);
				commonFieldRef();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(638);
				referedFieldAccess();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(639);
				superFieldAccess();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(640);
				thisFieldAccess();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GtInfixExpressionStatementContext extends ParserRuleContext {
		public List<ReferedExpressionContext> referedExpression() {
			return getRuleContexts(ReferedExpressionContext.class);
		}
		public ReferedExpressionContext referedExpression(int i) {
			return getRuleContext(ReferedExpressionContext.class,i);
		}
		public GtInfixExpressionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gtInfixExpressionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterGtInfixExpressionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitGtInfixExpressionStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitGtInfixExpressionStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GtInfixExpressionStatementContext gtInfixExpressionStatement() throws RecognitionException {
		GtInfixExpressionStatementContext _localctx = new GtInfixExpressionStatementContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_gtInfixExpressionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(643);
			match(T__33);
			setState(644);
			referedExpression();
			setState(645);
			match(T__34);
			setState(646);
			referedExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LtInfixExpressionStatementContext extends ParserRuleContext {
		public List<ReferedExpressionContext> referedExpression() {
			return getRuleContexts(ReferedExpressionContext.class);
		}
		public ReferedExpressionContext referedExpression(int i) {
			return getRuleContext(ReferedExpressionContext.class,i);
		}
		public LtInfixExpressionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ltInfixExpressionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterLtInfixExpressionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitLtInfixExpressionStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitLtInfixExpressionStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LtInfixExpressionStatementContext ltInfixExpressionStatement() throws RecognitionException {
		LtInfixExpressionStatementContext _localctx = new LtInfixExpressionStatementContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_ltInfixExpressionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(648);
			match(T__33);
			setState(649);
			referedExpression();
			setState(650);
			match(T__35);
			setState(651);
			referedExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EqualInfixExpressionStatementContext extends ParserRuleContext {
		public List<ReferedExpressionContext> referedExpression() {
			return getRuleContexts(ReferedExpressionContext.class);
		}
		public ReferedExpressionContext referedExpression(int i) {
			return getRuleContext(ReferedExpressionContext.class,i);
		}
		public EqualInfixExpressionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equalInfixExpressionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterEqualInfixExpressionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitEqualInfixExpressionStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitEqualInfixExpressionStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EqualInfixExpressionStatementContext equalInfixExpressionStatement() throws RecognitionException {
		EqualInfixExpressionStatementContext _localctx = new EqualInfixExpressionStatementContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_equalInfixExpressionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(653);
			match(T__33);
			setState(654);
			referedExpression();
			setState(655);
			match(T__36);
			setState(656);
			referedExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LeInfixExpressionStatementContext extends ParserRuleContext {
		public List<ReferedExpressionContext> referedExpression() {
			return getRuleContexts(ReferedExpressionContext.class);
		}
		public ReferedExpressionContext referedExpression(int i) {
			return getRuleContext(ReferedExpressionContext.class,i);
		}
		public LeInfixExpressionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_leInfixExpressionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterLeInfixExpressionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitLeInfixExpressionStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitLeInfixExpressionStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LeInfixExpressionStatementContext leInfixExpressionStatement() throws RecognitionException {
		LeInfixExpressionStatementContext _localctx = new LeInfixExpressionStatementContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_leInfixExpressionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(658);
			match(T__33);
			setState(659);
			referedExpression();
			setState(660);
			match(T__37);
			setState(661);
			referedExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GeInfixExpressionStatementContext extends ParserRuleContext {
		public List<ReferedExpressionContext> referedExpression() {
			return getRuleContexts(ReferedExpressionContext.class);
		}
		public ReferedExpressionContext referedExpression(int i) {
			return getRuleContext(ReferedExpressionContext.class,i);
		}
		public GeInfixExpressionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_geInfixExpressionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterGeInfixExpressionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitGeInfixExpressionStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitGeInfixExpressionStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GeInfixExpressionStatementContext geInfixExpressionStatement() throws RecognitionException {
		GeInfixExpressionStatementContext _localctx = new GeInfixExpressionStatementContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_geInfixExpressionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(663);
			match(T__33);
			setState(664);
			referedExpression();
			setState(665);
			match(T__38);
			setState(666);
			referedExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NotequalInfixExpressionStatementContext extends ParserRuleContext {
		public List<ReferedExpressionContext> referedExpression() {
			return getRuleContexts(ReferedExpressionContext.class);
		}
		public ReferedExpressionContext referedExpression(int i) {
			return getRuleContext(ReferedExpressionContext.class,i);
		}
		public NotequalInfixExpressionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_notequalInfixExpressionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterNotequalInfixExpressionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitNotequalInfixExpressionStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitNotequalInfixExpressionStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NotequalInfixExpressionStatementContext notequalInfixExpressionStatement() throws RecognitionException {
		NotequalInfixExpressionStatementContext _localctx = new NotequalInfixExpressionStatementContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_notequalInfixExpressionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(668);
			match(T__33);
			setState(669);
			referedExpression();
			setState(670);
			match(T__39);
			setState(671);
			referedExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AndInfixExpressionStatementContext extends ParserRuleContext {
		public List<ReferedExpressionContext> referedExpression() {
			return getRuleContexts(ReferedExpressionContext.class);
		}
		public ReferedExpressionContext referedExpression(int i) {
			return getRuleContext(ReferedExpressionContext.class,i);
		}
		public AndInfixExpressionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_andInfixExpressionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterAndInfixExpressionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitAndInfixExpressionStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitAndInfixExpressionStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AndInfixExpressionStatementContext andInfixExpressionStatement() throws RecognitionException {
		AndInfixExpressionStatementContext _localctx = new AndInfixExpressionStatementContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_andInfixExpressionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(673);
			match(T__33);
			setState(674);
			referedExpression();
			setState(675);
			match(T__40);
			setState(676);
			referedExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OrInfixExpressionStatementContext extends ParserRuleContext {
		public List<ReferedExpressionContext> referedExpression() {
			return getRuleContexts(ReferedExpressionContext.class);
		}
		public ReferedExpressionContext referedExpression(int i) {
			return getRuleContext(ReferedExpressionContext.class,i);
		}
		public OrInfixExpressionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orInfixExpressionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterOrInfixExpressionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitOrInfixExpressionStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitOrInfixExpressionStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrInfixExpressionStatementContext orInfixExpressionStatement() throws RecognitionException {
		OrInfixExpressionStatementContext _localctx = new OrInfixExpressionStatementContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_orInfixExpressionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(678);
			match(T__33);
			setState(679);
			referedExpression();
			setState(680);
			match(T__41);
			setState(681);
			referedExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AddInfixExpressionStatementContext extends ParserRuleContext {
		public List<ReferedExpressionContext> referedExpression() {
			return getRuleContexts(ReferedExpressionContext.class);
		}
		public ReferedExpressionContext referedExpression(int i) {
			return getRuleContext(ReferedExpressionContext.class,i);
		}
		public AddInfixExpressionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addInfixExpressionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterAddInfixExpressionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitAddInfixExpressionStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitAddInfixExpressionStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AddInfixExpressionStatementContext addInfixExpressionStatement() throws RecognitionException {
		AddInfixExpressionStatementContext _localctx = new AddInfixExpressionStatementContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_addInfixExpressionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(683);
			match(T__33);
			setState(684);
			referedExpression();
			setState(685);
			match(T__42);
			setState(686);
			referedExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SubInfixExpressionStatementContext extends ParserRuleContext {
		public List<ReferedExpressionContext> referedExpression() {
			return getRuleContexts(ReferedExpressionContext.class);
		}
		public ReferedExpressionContext referedExpression(int i) {
			return getRuleContext(ReferedExpressionContext.class,i);
		}
		public SubInfixExpressionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subInfixExpressionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterSubInfixExpressionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitSubInfixExpressionStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitSubInfixExpressionStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubInfixExpressionStatementContext subInfixExpressionStatement() throws RecognitionException {
		SubInfixExpressionStatementContext _localctx = new SubInfixExpressionStatementContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_subInfixExpressionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(688);
			match(T__33);
			setState(689);
			referedExpression();
			setState(690);
			match(T__43);
			setState(691);
			referedExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MulInfixExpressionStatementContext extends ParserRuleContext {
		public List<ReferedExpressionContext> referedExpression() {
			return getRuleContexts(ReferedExpressionContext.class);
		}
		public ReferedExpressionContext referedExpression(int i) {
			return getRuleContext(ReferedExpressionContext.class,i);
		}
		public MulInfixExpressionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mulInfixExpressionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterMulInfixExpressionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitMulInfixExpressionStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitMulInfixExpressionStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MulInfixExpressionStatementContext mulInfixExpressionStatement() throws RecognitionException {
		MulInfixExpressionStatementContext _localctx = new MulInfixExpressionStatementContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_mulInfixExpressionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(693);
			match(T__33);
			setState(694);
			referedExpression();
			setState(695);
			match(T__44);
			setState(696);
			referedExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DivInfixExpressionStatementContext extends ParserRuleContext {
		public List<ReferedExpressionContext> referedExpression() {
			return getRuleContexts(ReferedExpressionContext.class);
		}
		public ReferedExpressionContext referedExpression(int i) {
			return getRuleContext(ReferedExpressionContext.class,i);
		}
		public DivInfixExpressionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_divInfixExpressionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterDivInfixExpressionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitDivInfixExpressionStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitDivInfixExpressionStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DivInfixExpressionStatementContext divInfixExpressionStatement() throws RecognitionException {
		DivInfixExpressionStatementContext _localctx = new DivInfixExpressionStatementContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_divInfixExpressionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(698);
			match(T__33);
			setState(699);
			referedExpression();
			setState(700);
			match(T__45);
			setState(701);
			referedExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BitandInfixExpressionStatementContext extends ParserRuleContext {
		public List<ReferedExpressionContext> referedExpression() {
			return getRuleContexts(ReferedExpressionContext.class);
		}
		public ReferedExpressionContext referedExpression(int i) {
			return getRuleContext(ReferedExpressionContext.class,i);
		}
		public BitandInfixExpressionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bitandInfixExpressionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterBitandInfixExpressionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitBitandInfixExpressionStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitBitandInfixExpressionStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BitandInfixExpressionStatementContext bitandInfixExpressionStatement() throws RecognitionException {
		BitandInfixExpressionStatementContext _localctx = new BitandInfixExpressionStatementContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_bitandInfixExpressionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(703);
			match(T__33);
			setState(704);
			referedExpression();
			setState(705);
			match(T__46);
			setState(706);
			referedExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BitorInfixExpressionStatementContext extends ParserRuleContext {
		public List<ReferedExpressionContext> referedExpression() {
			return getRuleContexts(ReferedExpressionContext.class);
		}
		public ReferedExpressionContext referedExpression(int i) {
			return getRuleContext(ReferedExpressionContext.class,i);
		}
		public BitorInfixExpressionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bitorInfixExpressionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterBitorInfixExpressionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitBitorInfixExpressionStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitBitorInfixExpressionStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BitorInfixExpressionStatementContext bitorInfixExpressionStatement() throws RecognitionException {
		BitorInfixExpressionStatementContext _localctx = new BitorInfixExpressionStatementContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_bitorInfixExpressionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(708);
			match(T__33);
			setState(709);
			referedExpression();
			setState(710);
			match(T__47);
			setState(711);
			referedExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CaretInfixExpressionStatementContext extends ParserRuleContext {
		public List<ReferedExpressionContext> referedExpression() {
			return getRuleContexts(ReferedExpressionContext.class);
		}
		public ReferedExpressionContext referedExpression(int i) {
			return getRuleContext(ReferedExpressionContext.class,i);
		}
		public CaretInfixExpressionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caretInfixExpressionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterCaretInfixExpressionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitCaretInfixExpressionStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitCaretInfixExpressionStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CaretInfixExpressionStatementContext caretInfixExpressionStatement() throws RecognitionException {
		CaretInfixExpressionStatementContext _localctx = new CaretInfixExpressionStatementContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_caretInfixExpressionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(713);
			match(T__33);
			setState(714);
			referedExpression();
			setState(715);
			match(T__48);
			setState(716);
			referedExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ModInfixExpressionStatementContext extends ParserRuleContext {
		public List<ReferedExpressionContext> referedExpression() {
			return getRuleContexts(ReferedExpressionContext.class);
		}
		public ReferedExpressionContext referedExpression(int i) {
			return getRuleContext(ReferedExpressionContext.class,i);
		}
		public ModInfixExpressionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modInfixExpressionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterModInfixExpressionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitModInfixExpressionStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitModInfixExpressionStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModInfixExpressionStatementContext modInfixExpressionStatement() throws RecognitionException {
		ModInfixExpressionStatementContext _localctx = new ModInfixExpressionStatementContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_modInfixExpressionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(718);
			match(T__33);
			setState(719);
			referedExpression();
			setState(720);
			match(T__49);
			setState(721);
			referedExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LshiftInfixExpressionStatementContext extends ParserRuleContext {
		public List<ReferedExpressionContext> referedExpression() {
			return getRuleContexts(ReferedExpressionContext.class);
		}
		public ReferedExpressionContext referedExpression(int i) {
			return getRuleContext(ReferedExpressionContext.class,i);
		}
		public LshiftInfixExpressionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lshiftInfixExpressionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterLshiftInfixExpressionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitLshiftInfixExpressionStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitLshiftInfixExpressionStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LshiftInfixExpressionStatementContext lshiftInfixExpressionStatement() throws RecognitionException {
		LshiftInfixExpressionStatementContext _localctx = new LshiftInfixExpressionStatementContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_lshiftInfixExpressionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(723);
			match(T__33);
			setState(724);
			referedExpression();
			setState(725);
			match(T__35);
			setState(726);
			match(T__35);
			setState(727);
			referedExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RshiftInfixExpressionStatementContext extends ParserRuleContext {
		public List<ReferedExpressionContext> referedExpression() {
			return getRuleContexts(ReferedExpressionContext.class);
		}
		public ReferedExpressionContext referedExpression(int i) {
			return getRuleContext(ReferedExpressionContext.class,i);
		}
		public RshiftInfixExpressionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rshiftInfixExpressionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterRshiftInfixExpressionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitRshiftInfixExpressionStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitRshiftInfixExpressionStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RshiftInfixExpressionStatementContext rshiftInfixExpressionStatement() throws RecognitionException {
		RshiftInfixExpressionStatementContext _localctx = new RshiftInfixExpressionStatementContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_rshiftInfixExpressionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(729);
			match(T__33);
			setState(730);
			referedExpression();
			setState(731);
			match(T__34);
			setState(732);
			match(T__34);
			setState(733);
			referedExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UrshiftInfixExpressionStatementContext extends ParserRuleContext {
		public List<ReferedExpressionContext> referedExpression() {
			return getRuleContexts(ReferedExpressionContext.class);
		}
		public ReferedExpressionContext referedExpression(int i) {
			return getRuleContext(ReferedExpressionContext.class,i);
		}
		public UrshiftInfixExpressionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_urshiftInfixExpressionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterUrshiftInfixExpressionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitUrshiftInfixExpressionStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitUrshiftInfixExpressionStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UrshiftInfixExpressionStatementContext urshiftInfixExpressionStatement() throws RecognitionException {
		UrshiftInfixExpressionStatementContext _localctx = new UrshiftInfixExpressionStatementContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_urshiftInfixExpressionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(735);
			match(T__33);
			setState(736);
			referedExpression();
			setState(737);
			match(T__34);
			setState(738);
			match(T__34);
			setState(739);
			match(T__34);
			setState(740);
			referedExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InfixExpressionStatementContext extends ParserRuleContext {
		public GtInfixExpressionStatementContext gtInfixExpressionStatement() {
			return getRuleContext(GtInfixExpressionStatementContext.class,0);
		}
		public LtInfixExpressionStatementContext ltInfixExpressionStatement() {
			return getRuleContext(LtInfixExpressionStatementContext.class,0);
		}
		public EqualInfixExpressionStatementContext equalInfixExpressionStatement() {
			return getRuleContext(EqualInfixExpressionStatementContext.class,0);
		}
		public LeInfixExpressionStatementContext leInfixExpressionStatement() {
			return getRuleContext(LeInfixExpressionStatementContext.class,0);
		}
		public GeInfixExpressionStatementContext geInfixExpressionStatement() {
			return getRuleContext(GeInfixExpressionStatementContext.class,0);
		}
		public NotequalInfixExpressionStatementContext notequalInfixExpressionStatement() {
			return getRuleContext(NotequalInfixExpressionStatementContext.class,0);
		}
		public AndInfixExpressionStatementContext andInfixExpressionStatement() {
			return getRuleContext(AndInfixExpressionStatementContext.class,0);
		}
		public OrInfixExpressionStatementContext orInfixExpressionStatement() {
			return getRuleContext(OrInfixExpressionStatementContext.class,0);
		}
		public AddInfixExpressionStatementContext addInfixExpressionStatement() {
			return getRuleContext(AddInfixExpressionStatementContext.class,0);
		}
		public SubInfixExpressionStatementContext subInfixExpressionStatement() {
			return getRuleContext(SubInfixExpressionStatementContext.class,0);
		}
		public MulInfixExpressionStatementContext mulInfixExpressionStatement() {
			return getRuleContext(MulInfixExpressionStatementContext.class,0);
		}
		public DivInfixExpressionStatementContext divInfixExpressionStatement() {
			return getRuleContext(DivInfixExpressionStatementContext.class,0);
		}
		public BitandInfixExpressionStatementContext bitandInfixExpressionStatement() {
			return getRuleContext(BitandInfixExpressionStatementContext.class,0);
		}
		public BitorInfixExpressionStatementContext bitorInfixExpressionStatement() {
			return getRuleContext(BitorInfixExpressionStatementContext.class,0);
		}
		public CaretInfixExpressionStatementContext caretInfixExpressionStatement() {
			return getRuleContext(CaretInfixExpressionStatementContext.class,0);
		}
		public ModInfixExpressionStatementContext modInfixExpressionStatement() {
			return getRuleContext(ModInfixExpressionStatementContext.class,0);
		}
		public LshiftInfixExpressionStatementContext lshiftInfixExpressionStatement() {
			return getRuleContext(LshiftInfixExpressionStatementContext.class,0);
		}
		public RshiftInfixExpressionStatementContext rshiftInfixExpressionStatement() {
			return getRuleContext(RshiftInfixExpressionStatementContext.class,0);
		}
		public UrshiftInfixExpressionStatementContext urshiftInfixExpressionStatement() {
			return getRuleContext(UrshiftInfixExpressionStatementContext.class,0);
		}
		public InfixExpressionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_infixExpressionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterInfixExpressionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitInfixExpressionStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitInfixExpressionStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InfixExpressionStatementContext infixExpressionStatement() throws RecognitionException {
		InfixExpressionStatementContext _localctx = new InfixExpressionStatementContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_infixExpressionStatement);
		try {
			setState(761);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(742);
				gtInfixExpressionStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(743);
				ltInfixExpressionStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(744);
				equalInfixExpressionStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(745);
				leInfixExpressionStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(746);
				geInfixExpressionStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(747);
				notequalInfixExpressionStatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(748);
				andInfixExpressionStatement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(749);
				orInfixExpressionStatement();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(750);
				addInfixExpressionStatement();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(751);
				subInfixExpressionStatement();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(752);
				mulInfixExpressionStatement();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(753);
				divInfixExpressionStatement();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(754);
				bitandInfixExpressionStatement();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(755);
				bitorInfixExpressionStatement();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(756);
				caretInfixExpressionStatement();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(757);
				modInfixExpressionStatement();
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(758);
				lshiftInfixExpressionStatement();
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(759);
				rshiftInfixExpressionStatement();
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(760);
				urshiftInfixExpressionStatement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InstanceofExpressionStatementContext extends ParserRuleContext {
		public ReferedExpressionContext referedExpression() {
			return getRuleContext(ReferedExpressionContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public InstanceofExpressionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instanceofExpressionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterInstanceofExpressionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitInstanceofExpressionStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitInstanceofExpressionStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstanceofExpressionStatementContext instanceofExpressionStatement() throws RecognitionException {
		InstanceofExpressionStatementContext _localctx = new InstanceofExpressionStatementContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_instanceofExpressionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(763);
			match(T__50);
			setState(764);
			referedExpression();
			setState(765);
			match(T__51);
			setState(766);
			type();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CommonMethodReferenceExpressionContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ReferedExpressionContext referedExpression() {
			return getRuleContext(ReferedExpressionContext.class,0);
		}
		public CommonMethodReferenceExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commonMethodReferenceExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterCommonMethodReferenceExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitCommonMethodReferenceExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitCommonMethodReferenceExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommonMethodReferenceExpressionContext commonMethodReferenceExpression() throws RecognitionException {
		CommonMethodReferenceExpressionContext _localctx = new CommonMethodReferenceExpressionContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_commonMethodReferenceExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(768);
			identifier();
			setState(769);
			match(COLONCOLON);
			setState(770);
			referedExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CommonNewMethodReferenceExpressionContext extends ParserRuleContext {
		public ReferedExpressionContext referedExpression() {
			return getRuleContext(ReferedExpressionContext.class,0);
		}
		public CommonNewMethodReferenceExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commonNewMethodReferenceExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterCommonNewMethodReferenceExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitCommonNewMethodReferenceExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitCommonNewMethodReferenceExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommonNewMethodReferenceExpressionContext commonNewMethodReferenceExpression() throws RecognitionException {
		CommonNewMethodReferenceExpressionContext _localctx = new CommonNewMethodReferenceExpressionContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_commonNewMethodReferenceExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(772);
			match(T__52);
			setState(773);
			match(COLONCOLON);
			setState(774);
			referedExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SuperMethodReferenceExpressionContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ReferedExpressionContext referedExpression() {
			return getRuleContext(ReferedExpressionContext.class,0);
		}
		public SuperMethodReferenceExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_superMethodReferenceExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterSuperMethodReferenceExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitSuperMethodReferenceExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitSuperMethodReferenceExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SuperMethodReferenceExpressionContext superMethodReferenceExpression() throws RecognitionException {
		SuperMethodReferenceExpressionContext _localctx = new SuperMethodReferenceExpressionContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_superMethodReferenceExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(776);
			identifier();
			setState(777);
			match(COLONCOLON);
			setState(778);
			match(T__29);
			setState(781);
			_la = _input.LA(1);
			if (_la==DOT) {
				{
				setState(779);
				match(DOT);
				setState(780);
				referedExpression();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodReferenceExpressionContext extends ParserRuleContext {
		public CommonMethodReferenceExpressionContext commonMethodReferenceExpression() {
			return getRuleContext(CommonMethodReferenceExpressionContext.class,0);
		}
		public CommonNewMethodReferenceExpressionContext commonNewMethodReferenceExpression() {
			return getRuleContext(CommonNewMethodReferenceExpressionContext.class,0);
		}
		public SuperMethodReferenceExpressionContext superMethodReferenceExpression() {
			return getRuleContext(SuperMethodReferenceExpressionContext.class,0);
		}
		public MethodReferenceExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodReferenceExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterMethodReferenceExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitMethodReferenceExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitMethodReferenceExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodReferenceExpressionContext methodReferenceExpression() throws RecognitionException {
		MethodReferenceExpressionContext _localctx = new MethodReferenceExpressionContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_methodReferenceExpression);
		try {
			setState(786);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(783);
				commonMethodReferenceExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(784);
				commonNewMethodReferenceExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(785);
				superMethodReferenceExpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodReferenceStatementContext extends ParserRuleContext {
		public MethodReferenceExpressionContext methodReferenceExpression() {
			return getRuleContext(MethodReferenceExpressionContext.class,0);
		}
		public MethodReferenceStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodReferenceStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterMethodReferenceStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitMethodReferenceStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitMethodReferenceStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodReferenceStatementContext methodReferenceStatement() throws RecognitionException {
		MethodReferenceStatementContext _localctx = new MethodReferenceStatementContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_methodReferenceStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(788);
			match(T__53);
			setState(789);
			methodReferenceExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CommonNameStatementContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public CommonNameStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commonNameStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterCommonNameStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitCommonNameStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitCommonNameStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommonNameStatementContext commonNameStatement() throws RecognitionException {
		CommonNameStatementContext _localctx = new CommonNameStatementContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_commonNameStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(791);
			match(T__54);
			setState(792);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarRefNameStatementContext extends ParserRuleContext {
		public CommonVarRefContext commonVarRef() {
			return getRuleContext(CommonVarRefContext.class,0);
		}
		public VarRefNameStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varRefNameStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterVarRefNameStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitVarRefNameStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitVarRefNameStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarRefNameStatementContext varRefNameStatement() throws RecognitionException {
		VarRefNameStatementContext _localctx = new VarRefNameStatementContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_varRefNameStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(794);
			match(T__54);
			setState(795);
			commonVarRef();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FieldRefNameStatementContext extends ParserRuleContext {
		public CommonFieldRefContext commonFieldRef() {
			return getRuleContext(CommonFieldRefContext.class,0);
		}
		public FieldRefNameStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldRefNameStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterFieldRefNameStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitFieldRefNameStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitFieldRefNameStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldRefNameStatementContext fieldRefNameStatement() throws RecognitionException {
		FieldRefNameStatementContext _localctx = new FieldRefNameStatementContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_fieldRefNameStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(797);
			match(T__54);
			setState(798);
			commonFieldRef();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NameStatementContext extends ParserRuleContext {
		public CommonNameStatementContext commonNameStatement() {
			return getRuleContext(CommonNameStatementContext.class,0);
		}
		public VarRefNameStatementContext varRefNameStatement() {
			return getRuleContext(VarRefNameStatementContext.class,0);
		}
		public FieldRefNameStatementContext fieldRefNameStatement() {
			return getRuleContext(FieldRefNameStatementContext.class,0);
		}
		public NameStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nameStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterNameStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitNameStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitNameStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NameStatementContext nameStatement() throws RecognitionException {
		NameStatementContext _localctx = new NameStatementContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_nameStatement);
		try {
			setState(803);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(800);
				commonNameStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(801);
				varRefNameStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(802);
				fieldRefNameStatement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BangPrefixExpressionStatementContext extends ParserRuleContext {
		public ReferedExpressionContext referedExpression() {
			return getRuleContext(ReferedExpressionContext.class,0);
		}
		public BangPrefixExpressionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bangPrefixExpressionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterBangPrefixExpressionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitBangPrefixExpressionStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitBangPrefixExpressionStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BangPrefixExpressionStatementContext bangPrefixExpressionStatement() throws RecognitionException {
		BangPrefixExpressionStatementContext _localctx = new BangPrefixExpressionStatementContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_bangPrefixExpressionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(805);
			match(T__55);
			setState(806);
			match(T__56);
			setState(807);
			referedExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TildePrefixExpressionStatementContext extends ParserRuleContext {
		public ReferedExpressionContext referedExpression() {
			return getRuleContext(ReferedExpressionContext.class,0);
		}
		public TildePrefixExpressionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tildePrefixExpressionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterTildePrefixExpressionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitTildePrefixExpressionStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitTildePrefixExpressionStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TildePrefixExpressionStatementContext tildePrefixExpressionStatement() throws RecognitionException {
		TildePrefixExpressionStatementContext _localctx = new TildePrefixExpressionStatementContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_tildePrefixExpressionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(809);
			match(T__55);
			setState(810);
			match(T__57);
			setState(811);
			referedExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IncPrefixExpressionStatementContext extends ParserRuleContext {
		public ReferedExpressionContext referedExpression() {
			return getRuleContext(ReferedExpressionContext.class,0);
		}
		public IncPrefixExpressionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_incPrefixExpressionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterIncPrefixExpressionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitIncPrefixExpressionStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitIncPrefixExpressionStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IncPrefixExpressionStatementContext incPrefixExpressionStatement() throws RecognitionException {
		IncPrefixExpressionStatementContext _localctx = new IncPrefixExpressionStatementContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_incPrefixExpressionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(813);
			match(T__55);
			setState(814);
			match(T__58);
			setState(815);
			referedExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DecPrefixExpressionStatementContext extends ParserRuleContext {
		public ReferedExpressionContext referedExpression() {
			return getRuleContext(ReferedExpressionContext.class,0);
		}
		public DecPrefixExpressionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decPrefixExpressionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterDecPrefixExpressionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitDecPrefixExpressionStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitDecPrefixExpressionStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecPrefixExpressionStatementContext decPrefixExpressionStatement() throws RecognitionException {
		DecPrefixExpressionStatementContext _localctx = new DecPrefixExpressionStatementContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_decPrefixExpressionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(817);
			match(T__55);
			setState(818);
			match(T__59);
			setState(819);
			referedExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AddPrefixExpressionStatementContext extends ParserRuleContext {
		public AddPrefixExpressionContext addPrefixExpression() {
			return getRuleContext(AddPrefixExpressionContext.class,0);
		}
		public AddPrefixExpressionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addPrefixExpressionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterAddPrefixExpressionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitAddPrefixExpressionStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitAddPrefixExpressionStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AddPrefixExpressionStatementContext addPrefixExpressionStatement() throws RecognitionException {
		AddPrefixExpressionStatementContext _localctx = new AddPrefixExpressionStatementContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_addPrefixExpressionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(821);
			match(T__55);
			setState(822);
			addPrefixExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SubPrefixExpressionStatementContext extends ParserRuleContext {
		public SubPrefixExpressionContext subPrefixExpression() {
			return getRuleContext(SubPrefixExpressionContext.class,0);
		}
		public SubPrefixExpressionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subPrefixExpressionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterSubPrefixExpressionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitSubPrefixExpressionStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitSubPrefixExpressionStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubPrefixExpressionStatementContext subPrefixExpressionStatement() throws RecognitionException {
		SubPrefixExpressionStatementContext _localctx = new SubPrefixExpressionStatementContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_subPrefixExpressionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(824);
			match(T__55);
			setState(825);
			subPrefixExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AddPrefixExpressionContext extends ParserRuleContext {
		public ReferedExpressionContext referedExpression() {
			return getRuleContext(ReferedExpressionContext.class,0);
		}
		public AddPrefixExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addPrefixExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterAddPrefixExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitAddPrefixExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitAddPrefixExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AddPrefixExpressionContext addPrefixExpression() throws RecognitionException {
		AddPrefixExpressionContext _localctx = new AddPrefixExpressionContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_addPrefixExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(827);
			match(T__42);
			setState(828);
			referedExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SubPrefixExpressionContext extends ParserRuleContext {
		public ReferedExpressionContext referedExpression() {
			return getRuleContext(ReferedExpressionContext.class,0);
		}
		public SubPrefixExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subPrefixExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterSubPrefixExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitSubPrefixExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitSubPrefixExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubPrefixExpressionContext subPrefixExpression() throws RecognitionException {
		SubPrefixExpressionContext _localctx = new SubPrefixExpressionContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_subPrefixExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(830);
			match(T__43);
			setState(831);
			referedExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrefixExpressionStatementContext extends ParserRuleContext {
		public BangPrefixExpressionStatementContext bangPrefixExpressionStatement() {
			return getRuleContext(BangPrefixExpressionStatementContext.class,0);
		}
		public TildePrefixExpressionStatementContext tildePrefixExpressionStatement() {
			return getRuleContext(TildePrefixExpressionStatementContext.class,0);
		}
		public IncPrefixExpressionStatementContext incPrefixExpressionStatement() {
			return getRuleContext(IncPrefixExpressionStatementContext.class,0);
		}
		public DecPrefixExpressionStatementContext decPrefixExpressionStatement() {
			return getRuleContext(DecPrefixExpressionStatementContext.class,0);
		}
		public AddPrefixExpressionStatementContext addPrefixExpressionStatement() {
			return getRuleContext(AddPrefixExpressionStatementContext.class,0);
		}
		public SubPrefixExpressionStatementContext subPrefixExpressionStatement() {
			return getRuleContext(SubPrefixExpressionStatementContext.class,0);
		}
		public PrefixExpressionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prefixExpressionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterPrefixExpressionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitPrefixExpressionStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitPrefixExpressionStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrefixExpressionStatementContext prefixExpressionStatement() throws RecognitionException {
		PrefixExpressionStatementContext _localctx = new PrefixExpressionStatementContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_prefixExpressionStatement);
		try {
			setState(839);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(833);
				bangPrefixExpressionStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(834);
				tildePrefixExpressionStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(835);
				incPrefixExpressionStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(836);
				decPrefixExpressionStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(837);
				addPrefixExpressionStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(838);
				subPrefixExpressionStatement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IncPostfixExpressionStatementContext extends ParserRuleContext {
		public ReferedExpressionContext referedExpression() {
			return getRuleContext(ReferedExpressionContext.class,0);
		}
		public IncPostfixExpressionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_incPostfixExpressionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterIncPostfixExpressionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitIncPostfixExpressionStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitIncPostfixExpressionStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IncPostfixExpressionStatementContext incPostfixExpressionStatement() throws RecognitionException {
		IncPostfixExpressionStatementContext _localctx = new IncPostfixExpressionStatementContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_incPostfixExpressionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(841);
			match(T__60);
			setState(842);
			referedExpression();
			setState(843);
			match(T__58);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DecPostfixExpressionStatementContext extends ParserRuleContext {
		public ReferedExpressionContext referedExpression() {
			return getRuleContext(ReferedExpressionContext.class,0);
		}
		public DecPostfixExpressionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decPostfixExpressionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterDecPostfixExpressionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitDecPostfixExpressionStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitDecPostfixExpressionStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecPostfixExpressionStatementContext decPostfixExpressionStatement() throws RecognitionException {
		DecPostfixExpressionStatementContext _localctx = new DecPostfixExpressionStatementContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_decPostfixExpressionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(845);
			match(T__60);
			setState(846);
			referedExpression();
			setState(847);
			match(T__59);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PostfixExpressionStatementContext extends ParserRuleContext {
		public IncPostfixExpressionStatementContext incPostfixExpressionStatement() {
			return getRuleContext(IncPostfixExpressionStatementContext.class,0);
		}
		public DecPostfixExpressionStatementContext decPostfixExpressionStatement() {
			return getRuleContext(DecPostfixExpressionStatementContext.class,0);
		}
		public PostfixExpressionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfixExpressionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterPostfixExpressionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitPostfixExpressionStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitPostfixExpressionStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PostfixExpressionStatementContext postfixExpressionStatement() throws RecognitionException {
		PostfixExpressionStatementContext _localctx = new PostfixExpressionStatementContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_postfixExpressionStatement);
		try {
			setState(851);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(849);
				incPostfixExpressionStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(850);
				decPostfixExpressionStatement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayAccessStatementContext extends ParserRuleContext {
		public List<ReferedExpressionContext> referedExpression() {
			return getRuleContexts(ReferedExpressionContext.class);
		}
		public ReferedExpressionContext referedExpression(int i) {
			return getRuleContext(ReferedExpressionContext.class,i);
		}
		public EndOfArrayDeclarationIndexExpressionContext endOfArrayDeclarationIndexExpression() {
			return getRuleContext(EndOfArrayDeclarationIndexExpressionContext.class,0);
		}
		public ArrayAccessStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayAccessStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterArrayAccessStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitArrayAccessStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitArrayAccessStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayAccessStatementContext arrayAccessStatement() throws RecognitionException {
		ArrayAccessStatementContext _localctx = new ArrayAccessStatementContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_arrayAccessStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(853);
			match(T__61);
			setState(854);
			referedExpression();
			setState(855);
			referedExpression();
			setState(857);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(856);
				endOfArrayDeclarationIndexExpression();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReferedExpressionContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public FieldAccessContext fieldAccess() {
			return getRuleContext(FieldAccessContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public CodeHoleContext codeHole() {
			return getRuleContext(CodeHoleContext.class,0);
		}
		public PreExistContext preExist() {
			return getRuleContext(PreExistContext.class,0);
		}
		public FinalFieldRefContext finalFieldRef() {
			return getRuleContext(FinalFieldRefContext.class,0);
		}
		public FinalVarRefContext finalVarRef() {
			return getRuleContext(FinalVarRefContext.class,0);
		}
		public CommonVarRefContext commonVarRef() {
			return getRuleContext(CommonVarRefContext.class,0);
		}
		public AddPrefixExpressionContext addPrefixExpression() {
			return getRuleContext(AddPrefixExpressionContext.class,0);
		}
		public SubPrefixExpressionContext subPrefixExpression() {
			return getRuleContext(SubPrefixExpressionContext.class,0);
		}
		public MethodReferenceExpressionContext methodReferenceExpression() {
			return getRuleContext(MethodReferenceExpressionContext.class,0);
		}
		public ReferedExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_referedExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterReferedExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitReferedExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitReferedExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReferedExpressionContext referedExpression() throws RecognitionException {
		ReferedExpressionContext _localctx = new ReferedExpressionContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_referedExpression);
		try {
			setState(870);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(859);
				identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(860);
				fieldAccess();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(861);
				literal();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(862);
				codeHole();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(863);
				preExist();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(864);
				finalFieldRef();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(865);
				finalVarRef();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(866);
				commonVarRef();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(867);
				addPrefixExpression();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(868);
				subPrefixExpression();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(869);
				methodReferenceExpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode IdentifierX() { return getToken(Java8Parser.IdentifierX, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(872);
			match(IdentifierX);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnonymousClassBeginStatementContext extends ParserRuleContext {
		public AnonymousClassBeginStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_anonymousClassBeginStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterAnonymousClassBeginStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitAnonymousClassBeginStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitAnonymousClassBeginStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnonymousClassBeginStatementContext anonymousClassBeginStatement() throws RecognitionException {
		AnonymousClassBeginStatementContext _localctx = new AnonymousClassBeginStatementContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_anonymousClassBeginStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(874);
			match(T__62);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnonymousClassPlaceHolderStatementContext extends ParserRuleContext {
		public AnonymousClassPlaceHolderStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_anonymousClassPlaceHolderStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterAnonymousClassPlaceHolderStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitAnonymousClassPlaceHolderStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitAnonymousClassPlaceHolderStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnonymousClassPlaceHolderStatementContext anonymousClassPlaceHolderStatement() throws RecognitionException {
		AnonymousClassPlaceHolderStatementContext _localctx = new AnonymousClassPlaceHolderStatementContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_anonymousClassPlaceHolderStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(876);
			match(T__63);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnonymousClassPreStatementContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public AnonymousClassPreStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_anonymousClassPreStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterAnonymousClassPreStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitAnonymousClassPreStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitAnonymousClassPreStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnonymousClassPreStatementContext anonymousClassPreStatement() throws RecognitionException {
		AnonymousClassPreStatementContext _localctx = new AnonymousClassPreStatementContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_anonymousClassPreStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(878);
			match(T__64);
			setState(879);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AtInterfaceStatementContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public AtInterfaceStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atInterfaceStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterAtInterfaceStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitAtInterfaceStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitAtInterfaceStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtInterfaceStatementContext atInterfaceStatement() throws RecognitionException {
		AtInterfaceStatementContext _localctx = new AtInterfaceStatementContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_atInterfaceStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(881);
			match(T__65);
			setState(882);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationTypeMemberDeclarationStatementContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ReferedExpressionContext referedExpression() {
			return getRuleContext(ReferedExpressionContext.class,0);
		}
		public AnnotationTypeMemberDeclarationStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationTypeMemberDeclarationStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterAnnotationTypeMemberDeclarationStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitAnnotationTypeMemberDeclarationStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitAnnotationTypeMemberDeclarationStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationTypeMemberDeclarationStatementContext annotationTypeMemberDeclarationStatement() throws RecognitionException {
		AnnotationTypeMemberDeclarationStatementContext _localctx = new AnnotationTypeMemberDeclarationStatementContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_annotationTypeMemberDeclarationStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(884);
			match(T__66);
			setState(885);
			type();
			setState(886);
			identifier();
			setState(887);
			match(T__26);
			setState(888);
			match(T__27);
			setState(891);
			_la = _input.LA(1);
			if (_la==T__67) {
				{
				setState(889);
				match(T__67);
				setState(890);
				referedExpression();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassDeclarationStatementContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ClassDeclarationStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclarationStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterClassDeclarationStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitClassDeclarationStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitClassDeclarationStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDeclarationStatementContext classDeclarationStatement() throws RecognitionException {
		ClassDeclarationStatementContext _localctx = new ClassDeclarationStatementContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_classDeclarationStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(893);
			match(T__68);
			setState(894);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassInnerDeclarationStatementContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ClassInnerDeclarationStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classInnerDeclarationStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterClassInnerDeclarationStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitClassInnerDeclarationStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitClassInnerDeclarationStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassInnerDeclarationStatementContext classInnerDeclarationStatement() throws RecognitionException {
		ClassInnerDeclarationStatementContext _localctx = new ClassInnerDeclarationStatementContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_classInnerDeclarationStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(896);
			match(T__69);
			setState(897);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumDeclarationStatementContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public EnumDeclarationStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumDeclarationStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterEnumDeclarationStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitEnumDeclarationStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitEnumDeclarationStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumDeclarationStatementContext enumDeclarationStatement() throws RecognitionException {
		EnumDeclarationStatementContext _localctx = new EnumDeclarationStatementContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_enumDeclarationStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(899);
			match(T__70);
			setState(900);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodDeclarationStatementContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ArgTypeListContext argTypeList() {
			return getRuleContext(ArgTypeListContext.class,0);
		}
		public MethodDeclarationStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDeclarationStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterMethodDeclarationStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitMethodDeclarationStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitMethodDeclarationStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodDeclarationStatementContext methodDeclarationStatement() throws RecognitionException {
		MethodDeclarationStatementContext _localctx = new MethodDeclarationStatementContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_methodDeclarationStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(902);
			match(T__71);
			setState(903);
			type();
			setState(904);
			match(T__26);
			setState(906);
			_la = _input.LA(1);
			if (((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & ((1L << (T__128 - 129)) | (1L << (T__129 - 129)) | (1L << (T__130 - 129)) | (1L << (T__131 - 129)) | (1L << (T__132 - 129)) | (1L << (T__133 - 129)) | (1L << (T__134 - 129)) | (1L << (T__135 - 129)) | (1L << (T__136 - 129)) | (1L << (T__141 - 129)) | (1L << (IdentifierX - 129)))) != 0)) {
				{
				setState(905);
				argTypeList();
				}
			}

			setState(908);
			match(T__27);
			setState(909);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstructionDeclarationStatementContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ArgTypeListContext argTypeList() {
			return getRuleContext(ArgTypeListContext.class,0);
		}
		public ConstructionDeclarationStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructionDeclarationStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterConstructionDeclarationStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitConstructionDeclarationStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitConstructionDeclarationStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructionDeclarationStatementContext constructionDeclarationStatement() throws RecognitionException {
		ConstructionDeclarationStatementContext _localctx = new ConstructionDeclarationStatementContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_constructionDeclarationStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(911);
			match(T__71);
			setState(912);
			match(T__72);
			setState(913);
			match(T__26);
			setState(915);
			_la = _input.LA(1);
			if (((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & ((1L << (T__128 - 129)) | (1L << (T__129 - 129)) | (1L << (T__130 - 129)) | (1L << (T__131 - 129)) | (1L << (T__132 - 129)) | (1L << (T__133 - 129)) | (1L << (T__134 - 129)) | (1L << (T__135 - 129)) | (1L << (T__136 - 129)) | (1L << (T__141 - 129)) | (1L << (IdentifierX - 129)))) != 0)) {
				{
				setState(914);
				argTypeList();
				}
			}

			setState(917);
			match(T__27);
			setState(918);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumConstantDeclarationStatementContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public EnumConstantDeclarationStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumConstantDeclarationStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterEnumConstantDeclarationStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitEnumConstantDeclarationStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitEnumConstantDeclarationStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumConstantDeclarationStatementContext enumConstantDeclarationStatement() throws RecognitionException {
		EnumConstantDeclarationStatementContext _localctx = new EnumConstantDeclarationStatementContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_enumConstantDeclarationStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(920);
			match(T__73);
			setState(921);
			identifier();
			setState(922);
			match(T__26);
			setState(923);
			argumentList();
			setState(924);
			match(T__27);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LabeledStatementContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public LabeledStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labeledStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterLabeledStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitLabeledStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitLabeledStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LabeledStatementContext labeledStatement() throws RecognitionException {
		LabeledStatementContext _localctx = new LabeledStatementContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_labeledStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(926);
			match(T__74);
			setState(927);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclarationStatementContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public VariableDeclarationStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarationStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterVariableDeclarationStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitVariableDeclarationStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitVariableDeclarationStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclarationStatementContext variableDeclarationStatement() throws RecognitionException {
		VariableDeclarationStatementContext _localctx = new VariableDeclarationStatementContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_variableDeclarationStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(929);
			match(T__75);
			setState(930);
			type();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LambdaExpressionStatementContext extends ParserRuleContext {
		public ArgTypeListContext argTypeList() {
			return getRuleContext(ArgTypeListContext.class,0);
		}
		public ReferedExpressionContext referedExpression() {
			return getRuleContext(ReferedExpressionContext.class,0);
		}
		public LambdaExpressionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaExpressionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterLambdaExpressionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitLambdaExpressionStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitLambdaExpressionStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LambdaExpressionStatementContext lambdaExpressionStatement() throws RecognitionException {
		LambdaExpressionStatementContext _localctx = new LambdaExpressionStatementContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_lambdaExpressionStatement);
		int _la;
		try {
			setState(948);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(932);
				match(T__76);
				setState(933);
				match(T__26);
				setState(935);
				_la = _input.LA(1);
				if (((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & ((1L << (T__128 - 129)) | (1L << (T__129 - 129)) | (1L << (T__130 - 129)) | (1L << (T__131 - 129)) | (1L << (T__132 - 129)) | (1L << (T__133 - 129)) | (1L << (T__134 - 129)) | (1L << (T__135 - 129)) | (1L << (T__136 - 129)) | (1L << (T__141 - 129)) | (1L << (IdentifierX - 129)))) != 0)) {
					{
					setState(934);
					argTypeList();
					}
				}

				setState(937);
				match(T__27);
				setState(938);
				match(T__77);
				setState(939);
				match(T__78);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(940);
				match(T__76);
				setState(941);
				match(T__26);
				setState(943);
				_la = _input.LA(1);
				if (((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & ((1L << (T__128 - 129)) | (1L << (T__129 - 129)) | (1L << (T__130 - 129)) | (1L << (T__131 - 129)) | (1L << (T__132 - 129)) | (1L << (T__133 - 129)) | (1L << (T__134 - 129)) | (1L << (T__135 - 129)) | (1L << (T__136 - 129)) | (1L << (T__141 - 129)) | (1L << (IdentifierX - 129)))) != 0)) {
					{
					setState(942);
					argTypeList();
					}
				}

				setState(945);
				match(T__27);
				setState(946);
				match(T__77);
				setState(947);
				referedExpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BreakStatementContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public BreakStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_breakStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterBreakStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitBreakStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitBreakStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BreakStatementContext breakStatement() throws RecognitionException {
		BreakStatementContext _localctx = new BreakStatementContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_breakStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(950);
			match(T__79);
			setState(951);
			match(T__80);
			setState(953);
			_la = _input.LA(1);
			if (_la==IdentifierX) {
				{
				setState(952);
				identifier();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ContinueStatementContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ContinueStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_continueStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterContinueStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitContinueStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitContinueStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContinueStatementContext continueStatement() throws RecognitionException {
		ContinueStatementContext _localctx = new ContinueStatementContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_continueStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(955);
			match(T__81);
			setState(956);
			match(T__82);
			setState(958);
			_la = _input.LA(1);
			if (_la==IdentifierX) {
				{
				setState(957);
				identifier();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DoWhileStatementContext extends ParserRuleContext {
		public ReferedExpressionContext referedExpression() {
			return getRuleContext(ReferedExpressionContext.class,0);
		}
		public DoWhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doWhileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterDoWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitDoWhileStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitDoWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DoWhileStatementContext doWhileStatement() throws RecognitionException {
		DoWhileStatementContext _localctx = new DoWhileStatementContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_doWhileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(960);
			match(T__83);
			setState(961);
			match(T__84);
			setState(962);
			referedExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhileStatementContext extends ParserRuleContext {
		public ReferedExpressionContext referedExpression() {
			return getRuleContext(ReferedExpressionContext.class,0);
		}
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitWhileStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(964);
			match(T__85);
			setState(965);
			match(T__84);
			setState(966);
			referedExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReturnStatementContext extends ParserRuleContext {
		public ReferedExpressionContext referedExpression() {
			return getRuleContext(ReferedExpressionContext.class,0);
		}
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitReturnStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitReturnStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_returnStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(968);
			match(T__86);
			setState(969);
			match(T__87);
			setState(971);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__30) | (1L << T__42) | (1L << T__43) | (1L << T__52))) != 0) || ((((_la - 124)) & ~0x3f) == 0 && ((1L << (_la - 124)) & ((1L << (T__123 - 124)) | (1L << (T__124 - 124)) | (1L << (T__125 - 124)) | (1L << (T__126 - 124)) | (1L << (T__127 - 124)) | (1L << (T__142 - 124)) | (1L << (T__143 - 124)) | (1L << (T__144 - 124)) | (1L << (T__145 - 124)) | (1L << (T__146 - 124)) | (1L << (IdentifierX - 124)) | (1L << (IntegerLiteralX - 124)) | (1L << (FloatingPointLiteralX - 124)) | (1L << (CharacterLiteralX - 124)) | (1L << (StringLiteralX - 124)))) != 0)) {
				{
				setState(970);
				referedExpression();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchStatementContext extends ParserRuleContext {
		public ReferedExpressionContext referedExpression() {
			return getRuleContext(ReferedExpressionContext.class,0);
		}
		public SwitchStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterSwitchStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitSwitchStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitSwitchStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchStatementContext switchStatement() throws RecognitionException {
		SwitchStatementContext _localctx = new SwitchStatementContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_switchStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(973);
			match(T__88);
			setState(974);
			match(T__89);
			setState(975);
			referedExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchCaseStatementContext extends ParserRuleContext {
		public ReferedExpressionContext referedExpression() {
			return getRuleContext(ReferedExpressionContext.class,0);
		}
		public SwitchCaseStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchCaseStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterSwitchCaseStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitSwitchCaseStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitSwitchCaseStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchCaseStatementContext switchCaseStatement() throws RecognitionException {
		SwitchCaseStatementContext _localctx = new SwitchCaseStatementContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_switchCaseStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(977);
			match(T__90);
			setState(978);
			match(T__91);
			setState(979);
			referedExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DefaultStatementContext extends ParserRuleContext {
		public DefaultStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defaultStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterDefaultStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitDefaultStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitDefaultStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefaultStatementContext defaultStatement() throws RecognitionException {
		DefaultStatementContext _localctx = new DefaultStatementContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_defaultStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(981);
			match(T__92);
			setState(982);
			match(T__67);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SynchronizedStatementContext extends ParserRuleContext {
		public ReferedExpressionContext referedExpression() {
			return getRuleContext(ReferedExpressionContext.class,0);
		}
		public SynchronizedStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_synchronizedStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterSynchronizedStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitSynchronizedStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitSynchronizedStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SynchronizedStatementContext synchronizedStatement() throws RecognitionException {
		SynchronizedStatementContext _localctx = new SynchronizedStatementContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_synchronizedStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(984);
			match(T__93);
			setState(985);
			match(T__94);
			setState(986);
			referedExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TryStatementContext extends ParserRuleContext {
		public TryStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tryStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterTryStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitTryStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitTryStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TryStatementContext tryStatement() throws RecognitionException {
		TryStatementContext _localctx = new TryStatementContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_tryStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(988);
			match(T__95);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ThrowStatementContext extends ParserRuleContext {
		public ReferedExpressionContext referedExpression() {
			return getRuleContext(ReferedExpressionContext.class,0);
		}
		public ThrowStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_throwStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterThrowStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitThrowStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitThrowStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ThrowStatementContext throwStatement() throws RecognitionException {
		ThrowStatementContext _localctx = new ThrowStatementContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_throwStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(990);
			match(T__96);
			setState(991);
			match(T__97);
			setState(992);
			referedExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CatchClauseStatementContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public CatchClauseStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catchClauseStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterCatchClauseStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitCatchClauseStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitCatchClauseStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CatchClauseStatementContext catchClauseStatement() throws RecognitionException {
		CatchClauseStatementContext _localctx = new CatchClauseStatementContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_catchClauseStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(994);
			match(T__98);
			setState(995);
			match(T__99);
			setState(996);
			type();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FinallyStatementContext extends ParserRuleContext {
		public FinallyStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_finallyStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterFinallyStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitFinallyStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitFinallyStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FinallyStatementContext finallyStatement() throws RecognitionException {
		FinallyStatementContext _localctx = new FinallyStatementContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_finallyStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(998);
			match(T__100);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfStatementContext extends ParserRuleContext {
		public ReferedExpressionContext referedExpression() {
			return getRuleContext(ReferedExpressionContext.class,0);
		}
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 228, RULE_ifStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1000);
			match(T__101);
			setState(1001);
			match(T__102);
			setState(1002);
			referedExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ThenStatementContext extends ParserRuleContext {
		public ThenStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_thenStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterThenStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitThenStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitThenStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ThenStatementContext thenStatement() throws RecognitionException {
		ThenStatementContext _localctx = new ThenStatementContext(_ctx, getState());
		enterRule(_localctx, 230, RULE_thenStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1004);
			match(T__103);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElseStatementContext extends ParserRuleContext {
		public ElseStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterElseStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitElseStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitElseStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseStatementContext elseStatement() throws RecognitionException {
		ElseStatementContext _localctx = new ElseStatementContext(_ctx, getState());
		enterRule(_localctx, 232, RULE_elseStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1006);
			match(T__104);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayCreationStatementContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ArrayCreationStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayCreationStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterArrayCreationStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitArrayCreationStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitArrayCreationStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayCreationStatementContext arrayCreationStatement() throws RecognitionException {
		ArrayCreationStatementContext _localctx = new ArrayCreationStatementContext(_ctx, getState());
		enterRule(_localctx, 234, RULE_arrayCreationStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1008);
			match(T__105);
			setState(1009);
			type();
			setState(1010);
			match(T__26);
			setState(1011);
			match(T__52);
			setState(1012);
			match(T__27);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InitializerStatementContext extends ParserRuleContext {
		public InitializerStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializerStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterInitializerStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitInitializerStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitInitializerStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitializerStatementContext initializerStatement() throws RecognitionException {
		InitializerStatementContext _localctx = new InitializerStatementContext(_ctx, getState());
		enterRule(_localctx, 236, RULE_initializerStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1014);
			match(T__106);
			setState(1015);
			match(T__107);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclarationHolderStatementContext extends ParserRuleContext {
		public ReferedExpressionContext referedExpression() {
			return getRuleContext(ReferedExpressionContext.class,0);
		}
		public VariableDeclarationHolderStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarationHolderStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterVariableDeclarationHolderStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitVariableDeclarationHolderStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitVariableDeclarationHolderStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclarationHolderStatementContext variableDeclarationHolderStatement() throws RecognitionException {
		VariableDeclarationHolderStatementContext _localctx = new VariableDeclarationHolderStatementContext(_ctx, getState());
		enterRule(_localctx, 238, RULE_variableDeclarationHolderStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1017);
			match(T__108);
			setState(1020);
			_la = _input.LA(1);
			if (_la==T__10) {
				{
				setState(1018);
				match(T__10);
				setState(1019);
				referedExpression();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnhancedForStatementContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ReferedExpressionContext referedExpression() {
			return getRuleContext(ReferedExpressionContext.class,0);
		}
		public EnhancedForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enhancedForStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterEnhancedForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitEnhancedForStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitEnhancedForStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnhancedForStatementContext enhancedForStatement() throws RecognitionException {
		EnhancedForStatementContext _localctx = new EnhancedForStatementContext(_ctx, getState());
		enterRule(_localctx, 240, RULE_enhancedForStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1022);
			match(T__109);
			setState(1023);
			match(T__110);
			setState(1024);
			type();
			setState(1025);
			match(T__111);
			setState(1026);
			referedExpression();
			setState(1027);
			match(T__27);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PartialEndArrayAccessStatementContext extends ParserRuleContext {
		public ExpressionStatementContext expressionStatement() {
			return getRuleContext(ExpressionStatementContext.class,0);
		}
		public EndOfArrayDeclarationIndexExpressionContext endOfArrayDeclarationIndexExpression() {
			return getRuleContext(EndOfArrayDeclarationIndexExpressionContext.class,0);
		}
		public PartialEndArrayAccessStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partialEndArrayAccessStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterPartialEndArrayAccessStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitPartialEndArrayAccessStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitPartialEndArrayAccessStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PartialEndArrayAccessStatementContext partialEndArrayAccessStatement() throws RecognitionException {
		PartialEndArrayAccessStatementContext _localctx = new PartialEndArrayAccessStatementContext(_ctx, getState());
		enterRule(_localctx, 242, RULE_partialEndArrayAccessStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1029);
			expressionStatement();
			setState(1030);
			endOfArrayDeclarationIndexExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LeftParentheseStatementContext extends ParserRuleContext {
		public LeftParentheseStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_leftParentheseStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterLeftParentheseStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitLeftParentheseStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitLeftParentheseStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LeftParentheseStatementContext leftParentheseStatement() throws RecognitionException {
		LeftParentheseStatementContext _localctx = new LeftParentheseStatementContext(_ctx, getState());
		enterRule(_localctx, 244, RULE_leftParentheseStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1032);
			match(T__112);
			setState(1034); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1033);
				match(T__26);
				}
				}
				setState(1036); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__26 );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RightParentheseStatementContext extends ParserRuleContext {
		public RightParentheseStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rightParentheseStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterRightParentheseStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitRightParentheseStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitRightParentheseStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RightParentheseStatementContext rightParentheseStatement() throws RecognitionException {
		RightParentheseStatementContext _localctx = new RightParentheseStatementContext(_ctx, getState());
		enterRule(_localctx, 246, RULE_rightParentheseStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1038);
			match(T__112);
			setState(1040); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1039);
				match(T__27);
				}
				}
				setState(1042); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__27 );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnterMethodParamStatementContext extends ParserRuleContext {
		public EnterMethodParamStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enterMethodParamStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterEnterMethodParamStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitEnterMethodParamStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitEnterMethodParamStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnterMethodParamStatementContext enterMethodParamStatement() throws RecognitionException {
		EnterMethodParamStatementContext _localctx = new EnterMethodParamStatementContext(_ctx, getState());
		enterRule(_localctx, 248, RULE_enterMethodParamStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1044);
			match(T__112);
			setState(1046); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1045);
				match(T__113);
				}
				}
				setState(1048); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__113 );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayInitializerStartStatementContext extends ParserRuleContext {
		public ArrayInitializerStartStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayInitializerStartStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterArrayInitializerStartStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitArrayInitializerStartStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitArrayInitializerStartStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayInitializerStartStatementContext arrayInitializerStartStatement() throws RecognitionException {
		ArrayInitializerStartStatementContext _localctx = new ArrayInitializerStartStatementContext(_ctx, getState());
		enterRule(_localctx, 250, RULE_arrayInitializerStartStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1050);
			match(T__114);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayInitializerSplitCommaStatementContext extends ParserRuleContext {
		public ArrayInitializerSplitCommaStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayInitializerSplitCommaStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterArrayInitializerSplitCommaStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitArrayInitializerSplitCommaStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitArrayInitializerSplitCommaStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayInitializerSplitCommaStatementContext arrayInitializerSplitCommaStatement() throws RecognitionException {
		ArrayInitializerSplitCommaStatementContext _localctx = new ArrayInitializerSplitCommaStatementContext(_ctx, getState());
		enterRule(_localctx, 252, RULE_arrayInitializerSplitCommaStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1052);
			match(T__115);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayInitializerEndStatementContext extends ParserRuleContext {
		public ArrayInitializerEndStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayInitializerEndStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterArrayInitializerEndStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitArrayInitializerEndStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitArrayInitializerEndStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayInitializerEndStatementContext arrayInitializerEndStatement() throws RecognitionException {
		ArrayInitializerEndStatementContext _localctx = new ArrayInitializerEndStatementContext(_ctx, getState());
		enterRule(_localctx, 254, RULE_arrayInitializerEndStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1054);
			match(T__116);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumConstantDeclarationSplitCommaStatementContext extends ParserRuleContext {
		public EnumConstantDeclarationSplitCommaStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumConstantDeclarationSplitCommaStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterEnumConstantDeclarationSplitCommaStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitEnumConstantDeclarationSplitCommaStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitEnumConstantDeclarationSplitCommaStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumConstantDeclarationSplitCommaStatementContext enumConstantDeclarationSplitCommaStatement() throws RecognitionException {
		EnumConstantDeclarationSplitCommaStatementContext _localctx = new EnumConstantDeclarationSplitCommaStatementContext(_ctx, getState());
		enterRule(_localctx, 256, RULE_enumConstantDeclarationSplitCommaStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1056);
			match(T__117);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForStatementContext extends ParserRuleContext {
		public ForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitForStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitForStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForStatementContext forStatement() throws RecognitionException {
		ForStatementContext _localctx = new ForStatementContext(_ctx, getState());
		enterRule(_localctx, 258, RULE_forStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1058);
			match(T__118);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CondExpBeginStatementContext extends ParserRuleContext {
		public CondExpBeginStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condExpBeginStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterCondExpBeginStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitCondExpBeginStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitCondExpBeginStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondExpBeginStatementContext condExpBeginStatement() throws RecognitionException {
		CondExpBeginStatementContext _localctx = new CondExpBeginStatementContext(_ctx, getState());
		enterRule(_localctx, 260, RULE_condExpBeginStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1060);
			match(T__119);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CondExpQuestionMarkStatementContext extends ParserRuleContext {
		public CondExpQuestionMarkStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condExpQuestionMarkStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterCondExpQuestionMarkStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitCondExpQuestionMarkStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitCondExpQuestionMarkStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondExpQuestionMarkStatementContext condExpQuestionMarkStatement() throws RecognitionException {
		CondExpQuestionMarkStatementContext _localctx = new CondExpQuestionMarkStatementContext(_ctx, getState());
		enterRule(_localctx, 262, RULE_condExpQuestionMarkStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1062);
			match(T__120);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CondExpColonMarkStatementContext extends ParserRuleContext {
		public CondExpColonMarkStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condExpColonMarkStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterCondExpColonMarkStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitCondExpColonMarkStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitCondExpColonMarkStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondExpColonMarkStatementContext condExpColonMarkStatement() throws RecognitionException {
		CondExpColonMarkStatementContext _localctx = new CondExpColonMarkStatementContext(_ctx, getState());
		enterRule(_localctx, 264, RULE_condExpColonMarkStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1064);
			match(T__121);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PartialEndStatementContext extends ParserRuleContext {
		public PartialEndStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partialEndStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterPartialEndStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitPartialEndStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitPartialEndStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PartialEndStatementContext partialEndStatement() throws RecognitionException {
		PartialEndStatementContext _localctx = new PartialEndStatementContext(_ctx, getState());
		enterRule(_localctx, 266, RULE_partialEndStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1066);
			match(T__122);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FirstArgPreExistContext extends ParserRuleContext {
		public FirstArgPreExistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_firstArgPreExist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterFirstArgPreExist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitFirstArgPreExist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitFirstArgPreExist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FirstArgPreExistContext firstArgPreExist() throws RecognitionException {
		FirstArgPreExistContext _localctx = new FirstArgPreExistContext(_ctx, getState());
		enterRule(_localctx, 268, RULE_firstArgPreExist);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1068);
			match(T__123);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FirstArgReferedExpressionContext extends ParserRuleContext {
		public ReferedExpressionContext referedExpression() {
			return getRuleContext(ReferedExpressionContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public FirstArgReferedExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_firstArgReferedExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterFirstArgReferedExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitFirstArgReferedExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitFirstArgReferedExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FirstArgReferedExpressionContext firstArgReferedExpression() throws RecognitionException {
		FirstArgReferedExpressionContext _localctx = new FirstArgReferedExpressionContext(_ctx, getState());
		enterRule(_localctx, 270, RULE_firstArgReferedExpression);
		try {
			setState(1072);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1070);
				referedExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1071);
				type();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CommonClassMemberInvokeContext extends ParserRuleContext {
		public FirstArgReferedExpressionContext firstArgReferedExpression() {
			return getRuleContext(FirstArgReferedExpressionContext.class,0);
		}
		public CommonClassMemberInvokeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commonClassMemberInvoke; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterCommonClassMemberInvoke(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitCommonClassMemberInvoke(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitCommonClassMemberInvoke(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommonClassMemberInvokeContext commonClassMemberInvoke() throws RecognitionException {
		CommonClassMemberInvokeContext _localctx = new CommonClassMemberInvokeContext(_ctx, getState());
		enterRule(_localctx, 272, RULE_commonClassMemberInvoke);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1074);
			firstArgReferedExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelfClassMemberInvokeContext extends ParserRuleContext {
		public FirstArgReferedExpressionContext firstArgReferedExpression() {
			return getRuleContext(FirstArgReferedExpressionContext.class,0);
		}
		public SelfClassMemberInvokeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selfClassMemberInvoke; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterSelfClassMemberInvoke(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitSelfClassMemberInvoke(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitSelfClassMemberInvoke(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelfClassMemberInvokeContext selfClassMemberInvoke() throws RecognitionException {
		SelfClassMemberInvokeContext _localctx = new SelfClassMemberInvokeContext(_ctx, getState());
		enterRule(_localctx, 274, RULE_selfClassMemberInvoke);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1076);
			match(T__30);
			setState(1079);
			_la = _input.LA(1);
			if (_la==DOT) {
				{
				setState(1077);
				match(DOT);
				setState(1078);
				firstArgReferedExpression();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SuperClassMemberInvokeContext extends ParserRuleContext {
		public FirstArgReferedExpressionContext firstArgReferedExpression() {
			return getRuleContext(FirstArgReferedExpressionContext.class,0);
		}
		public SuperClassMemberInvokeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_superClassMemberInvoke; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterSuperClassMemberInvoke(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitSuperClassMemberInvoke(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitSuperClassMemberInvoke(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SuperClassMemberInvokeContext superClassMemberInvoke() throws RecognitionException {
		SuperClassMemberInvokeContext _localctx = new SuperClassMemberInvokeContext(_ctx, getState());
		enterRule(_localctx, 276, RULE_superClassMemberInvoke);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1081);
			match(T__29);
			setState(1084);
			_la = _input.LA(1);
			if (_la==DOT) {
				{
				setState(1082);
				match(DOT);
				setState(1083);
				firstArgReferedExpression();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NewClassInvokeContext extends ParserRuleContext {
		public FirstArgReferedExpressionContext firstArgReferedExpression() {
			return getRuleContext(FirstArgReferedExpressionContext.class,0);
		}
		public NewClassInvokeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newClassInvoke; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterNewClassInvoke(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitNewClassInvoke(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitNewClassInvoke(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NewClassInvokeContext newClassInvoke() throws RecognitionException {
		NewClassInvokeContext _localctx = new NewClassInvokeContext(_ctx, getState());
		enterRule(_localctx, 278, RULE_newClassInvoke);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1086);
			match(T__52);
			setState(1089);
			_la = _input.LA(1);
			if (_la==DOT) {
				{
				setState(1087);
				match(DOT);
				setState(1088);
				firstArgReferedExpression();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FirstArgContext extends ParserRuleContext {
		public SelfClassMemberInvokeContext selfClassMemberInvoke() {
			return getRuleContext(SelfClassMemberInvokeContext.class,0);
		}
		public SuperClassMemberInvokeContext superClassMemberInvoke() {
			return getRuleContext(SuperClassMemberInvokeContext.class,0);
		}
		public NewClassInvokeContext newClassInvoke() {
			return getRuleContext(NewClassInvokeContext.class,0);
		}
		public CommonClassMemberInvokeContext commonClassMemberInvoke() {
			return getRuleContext(CommonClassMemberInvokeContext.class,0);
		}
		public FirstArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_firstArg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterFirstArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitFirstArg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitFirstArg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FirstArgContext firstArg() throws RecognitionException {
		FirstArgContext _localctx = new FirstArgContext(_ctx, getState());
		enterRule(_localctx, 280, RULE_firstArg);
		try {
			setState(1096);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1092);
				selfClassMemberInvoke();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1093);
				superClassMemberInvoke();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1094);
				newClassInvoke();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1095);
				commonClassMemberInvoke();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodArgPreExistContext extends ParserRuleContext {
		public MethodArgPreExistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodArgPreExist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterMethodArgPreExist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitMethodArgPreExist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitMethodArgPreExist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodArgPreExistContext methodArgPreExist() throws RecognitionException {
		MethodArgPreExistContext _localctx = new MethodArgPreExistContext(_ctx, getState());
		enterRule(_localctx, 282, RULE_methodArgPreExist);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1098);
			match(T__123);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodArgReferedExpressionContext extends ParserRuleContext {
		public ReferedExpressionContext referedExpression() {
			return getRuleContext(ReferedExpressionContext.class,0);
		}
		public MethodArgReferedExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodArgReferedExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterMethodArgReferedExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitMethodArgReferedExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitMethodArgReferedExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodArgReferedExpressionContext methodArgReferedExpression() throws RecognitionException {
		MethodArgReferedExpressionContext _localctx = new MethodArgReferedExpressionContext(_ctx, getState());
		enterRule(_localctx, 284, RULE_methodArgReferedExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1100);
			referedExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgumentListContext extends ParserRuleContext {
		public FirstArgContext firstArg() {
			return getRuleContext(FirstArgContext.class,0);
		}
		public List<MethodArgReferedExpressionContext> methodArgReferedExpression() {
			return getRuleContexts(MethodArgReferedExpressionContext.class);
		}
		public MethodArgReferedExpressionContext methodArgReferedExpression(int i) {
			return getRuleContext(MethodArgReferedExpressionContext.class,i);
		}
		public ArgumentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterArgumentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitArgumentList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitArgumentList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentListContext argumentList() throws RecognitionException {
		ArgumentListContext _localctx = new ArgumentListContext(_ctx, getState());
		enterRule(_localctx, 286, RULE_argumentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1102);
			firstArg();
			setState(1107);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1103);
				match(COMMA);
				setState(1104);
				methodArgReferedExpression();
				}
				}
				setState(1109);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgTypeContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ArgTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterArgType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitArgType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitArgType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgTypeContext argType() throws RecognitionException {
		ArgTypeContext _localctx = new ArgTypeContext(_ctx, getState());
		enterRule(_localctx, 288, RULE_argType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1110);
			type();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LastArgTypeContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public LastArgTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lastArgType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterLastArgType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitLastArgType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitLastArgType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LastArgTypeContext lastArgType() throws RecognitionException {
		LastArgTypeContext _localctx = new LastArgTypeContext(_ctx, getState());
		enterRule(_localctx, 290, RULE_lastArgType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1112);
			type();
			setState(1113);
			match(ELLIPSIS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgTypeListContext extends ParserRuleContext {
		public List<ArgTypeContext> argType() {
			return getRuleContexts(ArgTypeContext.class);
		}
		public ArgTypeContext argType(int i) {
			return getRuleContext(ArgTypeContext.class,i);
		}
		public LastArgTypeContext lastArgType() {
			return getRuleContext(LastArgTypeContext.class,0);
		}
		public ArgTypeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argTypeList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterArgTypeList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitArgTypeList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitArgTypeList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgTypeListContext argTypeList() throws RecognitionException {
		ArgTypeListContext _localctx = new ArgTypeListContext(_ctx, getState());
		enterRule(_localctx, 292, RULE_argTypeList);
		int _la;
		try {
			int _alt;
			setState(1128);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1115);
				argType();
				setState(1120);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1116);
						match(COMMA);
						setState(1117);
						argType();
						}
						} 
					}
					setState(1122);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
				}
				setState(1125);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(1123);
					match(COMMA);
					setState(1124);
					lastArgType();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1127);
				lastArgType();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LiteralContext extends ParserRuleContext {
		public NumberLiteralContext numberLiteral() {
			return getRuleContext(NumberLiteralContext.class,0);
		}
		public BooleanLiteralContext booleanLiteral() {
			return getRuleContext(BooleanLiteralContext.class,0);
		}
		public CharacterLiteralContext characterLiteral() {
			return getRuleContext(CharacterLiteralContext.class,0);
		}
		public StringLiteralContext stringLiteral() {
			return getRuleContext(StringLiteralContext.class,0);
		}
		public NullLiteralContext nullLiteral() {
			return getRuleContext(NullLiteralContext.class,0);
		}
		public TypeLiteralContext typeLiteral() {
			return getRuleContext(TypeLiteralContext.class,0);
		}
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 294, RULE_literal);
		try {
			setState(1136);
			switch (_input.LA(1)) {
			case IntegerLiteralX:
			case FloatingPointLiteralX:
				enterOuterAlt(_localctx, 1);
				{
				setState(1130);
				numberLiteral();
				}
				break;
			case T__124:
			case T__125:
				enterOuterAlt(_localctx, 2);
				{
				setState(1131);
				booleanLiteral();
				}
				break;
			case CharacterLiteralX:
				enterOuterAlt(_localctx, 3);
				{
				setState(1132);
				characterLiteral();
				}
				break;
			case StringLiteralX:
				enterOuterAlt(_localctx, 4);
				{
				setState(1133);
				stringLiteral();
				}
				break;
			case T__126:
				enterOuterAlt(_localctx, 5);
				{
				setState(1134);
				nullLiteral();
				}
				break;
			case T__127:
				enterOuterAlt(_localctx, 6);
				{
				setState(1135);
				typeLiteral();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumberLiteralContext extends ParserRuleContext {
		public IntegerLiteralContext integerLiteral() {
			return getRuleContext(IntegerLiteralContext.class,0);
		}
		public FloatingPointLiteralContext floatingPointLiteral() {
			return getRuleContext(FloatingPointLiteralContext.class,0);
		}
		public NumberLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numberLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterNumberLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitNumberLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitNumberLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberLiteralContext numberLiteral() throws RecognitionException {
		NumberLiteralContext _localctx = new NumberLiteralContext(_ctx, getState());
		enterRule(_localctx, 296, RULE_numberLiteral);
		try {
			setState(1140);
			switch (_input.LA(1)) {
			case IntegerLiteralX:
				enterOuterAlt(_localctx, 1);
				{
				setState(1138);
				integerLiteral();
				}
				break;
			case FloatingPointLiteralX:
				enterOuterAlt(_localctx, 2);
				{
				setState(1139);
				floatingPointLiteral();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IntegerLiteralContext extends ParserRuleContext {
		public TerminalNode IntegerLiteralX() { return getToken(Java8Parser.IntegerLiteralX, 0); }
		public IntegerLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integerLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterIntegerLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitIntegerLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitIntegerLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntegerLiteralContext integerLiteral() throws RecognitionException {
		IntegerLiteralContext _localctx = new IntegerLiteralContext(_ctx, getState());
		enterRule(_localctx, 298, RULE_integerLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1142);
			match(IntegerLiteralX);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FloatingPointLiteralContext extends ParserRuleContext {
		public TerminalNode FloatingPointLiteralX() { return getToken(Java8Parser.FloatingPointLiteralX, 0); }
		public FloatingPointLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_floatingPointLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterFloatingPointLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitFloatingPointLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitFloatingPointLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FloatingPointLiteralContext floatingPointLiteral() throws RecognitionException {
		FloatingPointLiteralContext _localctx = new FloatingPointLiteralContext(_ctx, getState());
		enterRule(_localctx, 300, RULE_floatingPointLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1144);
			match(FloatingPointLiteralX);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BooleanLiteralContext extends ParserRuleContext {
		public BooleanLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterBooleanLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitBooleanLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitBooleanLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanLiteralContext booleanLiteral() throws RecognitionException {
		BooleanLiteralContext _localctx = new BooleanLiteralContext(_ctx, getState());
		enterRule(_localctx, 302, RULE_booleanLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1146);
			_la = _input.LA(1);
			if ( !(_la==T__124 || _la==T__125) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CharacterLiteralContext extends ParserRuleContext {
		public TerminalNode CharacterLiteralX() { return getToken(Java8Parser.CharacterLiteralX, 0); }
		public CharacterLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_characterLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterCharacterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitCharacterLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitCharacterLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CharacterLiteralContext characterLiteral() throws RecognitionException {
		CharacterLiteralContext _localctx = new CharacterLiteralContext(_ctx, getState());
		enterRule(_localctx, 304, RULE_characterLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1148);
			match(CharacterLiteralX);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StringLiteralContext extends ParserRuleContext {
		public TerminalNode StringLiteralX() { return getToken(Java8Parser.StringLiteralX, 0); }
		public StringLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterStringLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitStringLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitStringLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringLiteralContext stringLiteral() throws RecognitionException {
		StringLiteralContext _localctx = new StringLiteralContext(_ctx, getState());
		enterRule(_localctx, 306, RULE_stringLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1150);
			match(StringLiteralX);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NullLiteralContext extends ParserRuleContext {
		public NullLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nullLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterNullLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitNullLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitNullLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NullLiteralContext nullLiteral() throws RecognitionException {
		NullLiteralContext _localctx = new NullLiteralContext(_ctx, getState());
		enterRule(_localctx, 308, RULE_nullLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1152);
			match(T__126);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeLiteralContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TypeLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterTypeLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitTypeLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitTypeLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeLiteralContext typeLiteral() throws RecognitionException {
		TypeLiteralContext _localctx = new TypeLiteralContext(_ctx, getState());
		enterRule(_localctx, 310, RULE_typeLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1154);
			match(T__127);
			setState(1155);
			match(DOT);
			setState(1156);
			type();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public VirtualInferredTypeContext virtualInferredType() {
			return getRuleContext(VirtualInferredTypeContext.class,0);
		}
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public ClassOrInterfaceTypeContext classOrInterfaceType() {
			return getRuleContext(ClassOrInterfaceTypeContext.class,0);
		}
		public ArrayTypeContext arrayType() {
			return getRuleContext(ArrayTypeContext.class,0);
		}
		public IntersectionTypeContext intersectionType() {
			return getRuleContext(IntersectionTypeContext.class,0);
		}
		public UnionTypeContext unionType() {
			return getRuleContext(UnionTypeContext.class,0);
		}
		public ClassRefContext classRef() {
			return getRuleContext(ClassRefContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 312, RULE_type);
		try {
			setState(1165);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1158);
				virtualInferredType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1159);
				primitiveType();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1160);
				classOrInterfaceType();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1161);
				arrayType();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1162);
				intersectionType();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1163);
				unionType();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1164);
				classRef();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VirtualInferredTypeContext extends ParserRuleContext {
		public VirtualInferredTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_virtualInferredType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterVirtualInferredType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitVirtualInferredType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitVirtualInferredType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VirtualInferredTypeContext virtualInferredType() throws RecognitionException {
		VirtualInferredTypeContext _localctx = new VirtualInferredTypeContext(_ctx, getState());
		enterRule(_localctx, 314, RULE_virtualInferredType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1167);
			match(T__128);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimitiveTypeContext extends ParserRuleContext {
		public PrimitiveTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitiveType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterPrimitiveType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitPrimitiveType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitPrimitiveType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimitiveTypeContext primitiveType() throws RecognitionException {
		PrimitiveTypeContext _localctx = new PrimitiveTypeContext(_ctx, getState());
		enterRule(_localctx, 316, RULE_primitiveType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1169);
			_la = _input.LA(1);
			if ( !(((((_la - 130)) & ~0x3f) == 0 && ((1L << (_la - 130)) & ((1L << (T__129 - 130)) | (1L << (T__130 - 130)) | (1L << (T__131 - 130)) | (1L << (T__132 - 130)) | (1L << (T__133 - 130)) | (1L << (T__134 - 130)) | (1L << (T__135 - 130)) | (1L << (T__136 - 130)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SimpleTypeContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public SimpleTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterSimpleType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitSimpleType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitSimpleType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleTypeContext simpleType() throws RecognitionException {
		SimpleTypeContext _localctx = new SimpleTypeContext(_ctx, getState());
		enterRule(_localctx, 318, RULE_simpleType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1171);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExtendBoundContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ExtendBoundContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extendBound; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterExtendBound(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitExtendBound(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitExtendBound(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExtendBoundContext extendBound() throws RecognitionException {
		ExtendBoundContext _localctx = new ExtendBoundContext(_ctx, getState());
		enterRule(_localctx, 320, RULE_extendBound);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1173);
			match(T__137);
			setState(1174);
			type();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SuperBoundContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public SuperBoundContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_superBound; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterSuperBound(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitSuperBound(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitSuperBound(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SuperBoundContext superBound() throws RecognitionException {
		SuperBoundContext _localctx = new SuperBoundContext(_ctx, getState());
		enterRule(_localctx, 322, RULE_superBound);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1176);
			match(T__29);
			setState(1177);
			type();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WildcardBoundsContext extends ParserRuleContext {
		public ExtendBoundContext extendBound() {
			return getRuleContext(ExtendBoundContext.class,0);
		}
		public SuperBoundContext superBound() {
			return getRuleContext(SuperBoundContext.class,0);
		}
		public WildcardBoundsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wildcardBounds; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterWildcardBounds(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitWildcardBounds(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitWildcardBounds(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WildcardBoundsContext wildcardBounds() throws RecognitionException {
		WildcardBoundsContext _localctx = new WildcardBoundsContext(_ctx, getState());
		enterRule(_localctx, 324, RULE_wildcardBounds);
		try {
			setState(1181);
			switch (_input.LA(1)) {
			case T__137:
				enterOuterAlt(_localctx, 1);
				{
				setState(1179);
				extendBound();
				}
				break;
			case T__29:
				enterOuterAlt(_localctx, 2);
				{
				setState(1180);
				superBound();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WildCardTypeContext extends ParserRuleContext {
		public WildcardBoundsContext wildcardBounds() {
			return getRuleContext(WildcardBoundsContext.class,0);
		}
		public WildCardTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wildCardType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterWildCardType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitWildCardType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitWildCardType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WildCardTypeContext wildCardType() throws RecognitionException {
		WildCardTypeContext _localctx = new WildCardTypeContext(_ctx, getState());
		enterRule(_localctx, 326, RULE_wildCardType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1183);
			match(T__138);
			setState(1185);
			_la = _input.LA(1);
			if (_la==T__29 || _la==T__137) {
				{
				setState(1184);
				wildcardBounds();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeArgumentContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public WildCardTypeContext wildCardType() {
			return getRuleContext(WildCardTypeContext.class,0);
		}
		public TypeArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArgument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterTypeArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitTypeArgument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitTypeArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeArgumentContext typeArgument() throws RecognitionException {
		TypeArgumentContext _localctx = new TypeArgumentContext(_ctx, getState());
		enterRule(_localctx, 328, RULE_typeArgument);
		try {
			setState(1189);
			switch (_input.LA(1)) {
			case T__128:
			case T__129:
			case T__130:
			case T__131:
			case T__132:
			case T__133:
			case T__134:
			case T__135:
			case T__136:
			case T__141:
			case IdentifierX:
				enterOuterAlt(_localctx, 1);
				{
				setState(1187);
				type();
				}
				break;
			case T__138:
				enterOuterAlt(_localctx, 2);
				{
				setState(1188);
				wildCardType();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeArgumentsContext extends ParserRuleContext {
		public List<TypeArgumentContext> typeArgument() {
			return getRuleContexts(TypeArgumentContext.class);
		}
		public TypeArgumentContext typeArgument(int i) {
			return getRuleContext(TypeArgumentContext.class,i);
		}
		public TypeArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterTypeArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitTypeArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitTypeArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeArgumentsContext typeArguments() throws RecognitionException {
		TypeArgumentsContext _localctx = new TypeArgumentsContext(_ctx, getState());
		enterRule(_localctx, 330, RULE_typeArguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1191);
			match(T__35);
			setState(1192);
			typeArgument();
			setState(1197);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1193);
				match(COMMA);
				setState(1194);
				typeArgument();
				}
				}
				setState(1199);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1200);
			match(T__34);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParameterizedTypeContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public ParameterizedTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterizedType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterParameterizedType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitParameterizedType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitParameterizedType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterizedTypeContext parameterizedType() throws RecognitionException {
		ParameterizedTypeContext _localctx = new ParameterizedTypeContext(_ctx, getState());
		enterRule(_localctx, 332, RULE_parameterizedType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1202);
			identifier();
			setState(1203);
			typeArguments();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BothTypeContext extends ParserRuleContext {
		public SimpleTypeContext simpleType() {
			return getRuleContext(SimpleTypeContext.class,0);
		}
		public ParameterizedTypeContext parameterizedType() {
			return getRuleContext(ParameterizedTypeContext.class,0);
		}
		public BothTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bothType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterBothType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitBothType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitBothType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BothTypeContext bothType() throws RecognitionException {
		BothTypeContext _localctx = new BothTypeContext(_ctx, getState());
		enterRule(_localctx, 334, RULE_bothType);
		try {
			setState(1207);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1205);
				simpleType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1206);
				parameterizedType();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassOrInterfaceTypeContext extends ParserRuleContext {
		public List<BothTypeContext> bothType() {
			return getRuleContexts(BothTypeContext.class);
		}
		public BothTypeContext bothType(int i) {
			return getRuleContext(BothTypeContext.class,i);
		}
		public ClassOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classOrInterfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterClassOrInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitClassOrInterfaceType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitClassOrInterfaceType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassOrInterfaceTypeContext classOrInterfaceType() throws RecognitionException {
		ClassOrInterfaceTypeContext _localctx = new ClassOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 336, RULE_classOrInterfaceType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1209);
			bothType();
			}
			setState(1214);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(1210);
				match(DOT);
				setState(1211);
				bothType();
				}
				}
				setState(1216);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayTypeContext extends ParserRuleContext {
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public DimsContext dims() {
			return getRuleContext(DimsContext.class,0);
		}
		public ClassOrInterfaceTypeContext classOrInterfaceType() {
			return getRuleContext(ClassOrInterfaceTypeContext.class,0);
		}
		public ArrayTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterArrayType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitArrayType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitArrayType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayTypeContext arrayType() throws RecognitionException {
		ArrayTypeContext _localctx = new ArrayTypeContext(_ctx, getState());
		enterRule(_localctx, 338, RULE_arrayType);
		try {
			setState(1223);
			switch (_input.LA(1)) {
			case T__129:
			case T__130:
			case T__131:
			case T__132:
			case T__133:
			case T__134:
			case T__135:
			case T__136:
				enterOuterAlt(_localctx, 1);
				{
				setState(1217);
				primitiveType();
				setState(1218);
				dims();
				}
				break;
			case IdentifierX:
				enterOuterAlt(_localctx, 2);
				{
				setState(1220);
				classOrInterfaceType();
				setState(1221);
				dims();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DimsContext extends ParserRuleContext {
		public DimsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dims; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterDims(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitDims(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitDims(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DimsContext dims() throws RecognitionException {
		DimsContext _localctx = new DimsContext(_ctx, getState());
		enterRule(_localctx, 340, RULE_dims);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1225);
			match(T__139);
			setState(1226);
			match(T__140);
			setState(1231);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__139) {
				{
				{
				setState(1227);
				match(T__139);
				setState(1228);
				match(T__140);
				}
				}
				setState(1233);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IntersectionFirstTypeContext extends ParserRuleContext {
		public ClassOrInterfaceTypeContext classOrInterfaceType() {
			return getRuleContext(ClassOrInterfaceTypeContext.class,0);
		}
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public ArrayTypeContext arrayType() {
			return getRuleContext(ArrayTypeContext.class,0);
		}
		public ClassRefContext classRef() {
			return getRuleContext(ClassRefContext.class,0);
		}
		public IntersectionFirstTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intersectionFirstType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterIntersectionFirstType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitIntersectionFirstType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitIntersectionFirstType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntersectionFirstTypeContext intersectionFirstType() throws RecognitionException {
		IntersectionFirstTypeContext _localctx = new IntersectionFirstTypeContext(_ctx, getState());
		enterRule(_localctx, 342, RULE_intersectionFirstType);
		try {
			setState(1238);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1234);
				classOrInterfaceType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1235);
				primitiveType();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1236);
				arrayType();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1237);
				classRef();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IntersectionSecondTypeContext extends ParserRuleContext {
		public ClassOrInterfaceTypeContext classOrInterfaceType() {
			return getRuleContext(ClassOrInterfaceTypeContext.class,0);
		}
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public ArrayTypeContext arrayType() {
			return getRuleContext(ArrayTypeContext.class,0);
		}
		public ClassRefContext classRef() {
			return getRuleContext(ClassRefContext.class,0);
		}
		public UnionTypeContext unionType() {
			return getRuleContext(UnionTypeContext.class,0);
		}
		public IntersectionSecondTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intersectionSecondType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterIntersectionSecondType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitIntersectionSecondType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitIntersectionSecondType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntersectionSecondTypeContext intersectionSecondType() throws RecognitionException {
		IntersectionSecondTypeContext _localctx = new IntersectionSecondTypeContext(_ctx, getState());
		enterRule(_localctx, 344, RULE_intersectionSecondType);
		try {
			setState(1245);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1240);
				classOrInterfaceType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1241);
				primitiveType();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1242);
				arrayType();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1243);
				classRef();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1244);
				unionType();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IntersectionTypeContext extends ParserRuleContext {
		public IntersectionFirstTypeContext intersectionFirstType() {
			return getRuleContext(IntersectionFirstTypeContext.class,0);
		}
		public List<IntersectionSecondTypeContext> intersectionSecondType() {
			return getRuleContexts(IntersectionSecondTypeContext.class);
		}
		public IntersectionSecondTypeContext intersectionSecondType(int i) {
			return getRuleContext(IntersectionSecondTypeContext.class,i);
		}
		public IntersectionTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intersectionType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterIntersectionType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitIntersectionType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitIntersectionType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntersectionTypeContext intersectionType() throws RecognitionException {
		IntersectionTypeContext _localctx = new IntersectionTypeContext(_ctx, getState());
		enterRule(_localctx, 346, RULE_intersectionType);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1247);
			intersectionFirstType();
			}
			setState(1250); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1248);
					match(T__46);
					{
					setState(1249);
					intersectionSecondType();
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1252); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnionFirstTypeContext extends ParserRuleContext {
		public ClassOrInterfaceTypeContext classOrInterfaceType() {
			return getRuleContext(ClassOrInterfaceTypeContext.class,0);
		}
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public ArrayTypeContext arrayType() {
			return getRuleContext(ArrayTypeContext.class,0);
		}
		public ClassRefContext classRef() {
			return getRuleContext(ClassRefContext.class,0);
		}
		public UnionFirstTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unionFirstType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterUnionFirstType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitUnionFirstType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitUnionFirstType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnionFirstTypeContext unionFirstType() throws RecognitionException {
		UnionFirstTypeContext _localctx = new UnionFirstTypeContext(_ctx, getState());
		enterRule(_localctx, 348, RULE_unionFirstType);
		try {
			setState(1258);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1254);
				classOrInterfaceType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1255);
				primitiveType();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1256);
				arrayType();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1257);
				classRef();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnionSecondTypeContext extends ParserRuleContext {
		public ClassOrInterfaceTypeContext classOrInterfaceType() {
			return getRuleContext(ClassOrInterfaceTypeContext.class,0);
		}
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public ArrayTypeContext arrayType() {
			return getRuleContext(ArrayTypeContext.class,0);
		}
		public ClassRefContext classRef() {
			return getRuleContext(ClassRefContext.class,0);
		}
		public IntersectionTypeContext intersectionType() {
			return getRuleContext(IntersectionTypeContext.class,0);
		}
		public UnionSecondTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unionSecondType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterUnionSecondType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitUnionSecondType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitUnionSecondType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnionSecondTypeContext unionSecondType() throws RecognitionException {
		UnionSecondTypeContext _localctx = new UnionSecondTypeContext(_ctx, getState());
		enterRule(_localctx, 350, RULE_unionSecondType);
		try {
			setState(1265);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1260);
				classOrInterfaceType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1261);
				primitiveType();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1262);
				arrayType();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1263);
				classRef();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1264);
				intersectionType();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnionTypeContext extends ParserRuleContext {
		public UnionFirstTypeContext unionFirstType() {
			return getRuleContext(UnionFirstTypeContext.class,0);
		}
		public List<UnionSecondTypeContext> unionSecondType() {
			return getRuleContexts(UnionSecondTypeContext.class);
		}
		public UnionSecondTypeContext unionSecondType(int i) {
			return getRuleContext(UnionSecondTypeContext.class,i);
		}
		public UnionTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unionType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterUnionType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitUnionType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitUnionType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnionTypeContext unionType() throws RecognitionException {
		UnionTypeContext _localctx = new UnionTypeContext(_ctx, getState());
		enterRule(_localctx, 352, RULE_unionType);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1267);
			unionFirstType();
			}
			setState(1270); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1268);
					match(T__47);
					{
					setState(1269);
					unionSecondType();
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1272); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassRefContext extends ParserRuleContext {
		public List<IntegerLiteralContext> integerLiteral() {
			return getRuleContexts(IntegerLiteralContext.class);
		}
		public IntegerLiteralContext integerLiteral(int i) {
			return getRuleContext(IntegerLiteralContext.class,i);
		}
		public ClassRefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classRef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterClassRef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitClassRef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitClassRef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassRefContext classRef() throws RecognitionException {
		ClassRefContext _localctx = new ClassRefContext(_ctx, getState());
		enterRule(_localctx, 354, RULE_classRef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1274);
			match(T__141);
			setState(1275);
			integerLiteral();
			setState(1276);
			match(T__138);
			setState(1277);
			integerLiteral();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FinalFieldRefContext extends ParserRuleContext {
		public List<IntegerLiteralContext> integerLiteral() {
			return getRuleContexts(IntegerLiteralContext.class);
		}
		public IntegerLiteralContext integerLiteral(int i) {
			return getRuleContext(IntegerLiteralContext.class,i);
		}
		public FinalFieldRefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_finalFieldRef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterFinalFieldRef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitFinalFieldRef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitFinalFieldRef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FinalFieldRefContext finalFieldRef() throws RecognitionException {
		FinalFieldRefContext _localctx = new FinalFieldRefContext(_ctx, getState());
		enterRule(_localctx, 356, RULE_finalFieldRef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1279);
			match(T__142);
			setState(1280);
			integerLiteral();
			setState(1281);
			match(T__138);
			setState(1282);
			integerLiteral();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FinalVarRefContext extends ParserRuleContext {
		public List<IntegerLiteralContext> integerLiteral() {
			return getRuleContexts(IntegerLiteralContext.class);
		}
		public IntegerLiteralContext integerLiteral(int i) {
			return getRuleContext(IntegerLiteralContext.class,i);
		}
		public FinalVarRefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_finalVarRef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterFinalVarRef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitFinalVarRef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitFinalVarRef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FinalVarRefContext finalVarRef() throws RecognitionException {
		FinalVarRefContext _localctx = new FinalVarRefContext(_ctx, getState());
		enterRule(_localctx, 358, RULE_finalVarRef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1284);
			match(T__143);
			setState(1285);
			integerLiteral();
			setState(1286);
			match(T__138);
			setState(1287);
			integerLiteral();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CommonFieldRefContext extends ParserRuleContext {
		public List<IntegerLiteralContext> integerLiteral() {
			return getRuleContexts(IntegerLiteralContext.class);
		}
		public IntegerLiteralContext integerLiteral(int i) {
			return getRuleContext(IntegerLiteralContext.class,i);
		}
		public CommonFieldRefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commonFieldRef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterCommonFieldRef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitCommonFieldRef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitCommonFieldRef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommonFieldRefContext commonFieldRef() throws RecognitionException {
		CommonFieldRefContext _localctx = new CommonFieldRefContext(_ctx, getState());
		enterRule(_localctx, 360, RULE_commonFieldRef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1289);
			match(T__144);
			setState(1290);
			integerLiteral();
			setState(1291);
			match(T__138);
			setState(1292);
			integerLiteral();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CommonVarRefContext extends ParserRuleContext {
		public List<IntegerLiteralContext> integerLiteral() {
			return getRuleContexts(IntegerLiteralContext.class);
		}
		public IntegerLiteralContext integerLiteral(int i) {
			return getRuleContext(IntegerLiteralContext.class,i);
		}
		public CommonVarRefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commonVarRef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterCommonVarRef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitCommonVarRef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitCommonVarRef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommonVarRefContext commonVarRef() throws RecognitionException {
		CommonVarRefContext _localctx = new CommonVarRefContext(_ctx, getState());
		enterRule(_localctx, 362, RULE_commonVarRef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1294);
			match(T__145);
			setState(1295);
			integerLiteral();
			setState(1296);
			match(T__138);
			setState(1297);
			integerLiteral();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CodeHoleContext extends ParserRuleContext {
		public CodeHoleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_codeHole; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterCodeHole(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitCodeHole(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitCodeHole(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CodeHoleContext codeHole() throws RecognitionException {
		CodeHoleContext _localctx = new CodeHoleContext(_ctx, getState());
		enterRule(_localctx, 364, RULE_codeHole);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1299);
			match(T__146);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PreExistContext extends ParserRuleContext {
		public PreExistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_preExist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterPreExist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitPreExist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitPreExist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PreExistContext preExist() throws RecognitionException {
		PreExistContext _localctx = new PreExistContext(_ctx, getState());
		enterRule(_localctx, 366, RULE_preExist);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1301);
			match(T__123);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EndOfArrayDeclarationIndexExpressionContext extends ParserRuleContext {
		public EndOfArrayDeclarationIndexExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_endOfArrayDeclarationIndexExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterEndOfArrayDeclarationIndexExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitEndOfArrayDeclarationIndexExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitEndOfArrayDeclarationIndexExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EndOfArrayDeclarationIndexExpressionContext endOfArrayDeclarationIndexExpression() throws RecognitionException {
		EndOfArrayDeclarationIndexExpressionContext _localctx = new EndOfArrayDeclarationIndexExpressionContext(_ctx, getState());
		enterRule(_localctx, 368, RULE_endOfArrayDeclarationIndexExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1304); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1303);
					match(T__140);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1306); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\u00a0\u051f\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\4t\tt\4u\tu\4v\tv\4"+
		"w\tw\4x\tx\4y\ty\4z\tz\4{\t{\4|\t|\4}\t}\4~\t~\4\177\t\177\4\u0080\t\u0080"+
		"\4\u0081\t\u0081\4\u0082\t\u0082\4\u0083\t\u0083\4\u0084\t\u0084\4\u0085"+
		"\t\u0085\4\u0086\t\u0086\4\u0087\t\u0087\4\u0088\t\u0088\4\u0089\t\u0089"+
		"\4\u008a\t\u008a\4\u008b\t\u008b\4\u008c\t\u008c\4\u008d\t\u008d\4\u008e"+
		"\t\u008e\4\u008f\t\u008f\4\u0090\t\u0090\4\u0091\t\u0091\4\u0092\t\u0092"+
		"\4\u0093\t\u0093\4\u0094\t\u0094\4\u0095\t\u0095\4\u0096\t\u0096\4\u0097"+
		"\t\u0097\4\u0098\t\u0098\4\u0099\t\u0099\4\u009a\t\u009a\4\u009b\t\u009b"+
		"\4\u009c\t\u009c\4\u009d\t\u009d\4\u009e\t\u009e\4\u009f\t\u009f\4\u00a0"+
		"\t\u00a0\4\u00a1\t\u00a1\4\u00a2\t\u00a2\4\u00a3\t\u00a3\4\u00a4\t\u00a4"+
		"\4\u00a5\t\u00a5\4\u00a6\t\u00a6\4\u00a7\t\u00a7\4\u00a8\t\u00a8\4\u00a9"+
		"\t\u00a9\4\u00aa\t\u00aa\4\u00ab\t\u00ab\4\u00ac\t\u00ac\4\u00ad\t\u00ad"+
		"\4\u00ae\t\u00ae\4\u00af\t\u00af\4\u00b0\t\u00b0\4\u00b1\t\u00b1\4\u00b2"+
		"\t\u00b2\4\u00b3\t\u00b3\4\u00b4\t\u00b4\4\u00b5\t\u00b5\4\u00b6\t\u00b6"+
		"\4\u00b7\t\u00b7\4\u00b8\t\u00b8\4\u00b9\t\u00b9\4\u00ba\t\u00ba\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2\u017f\n\2\3\3\3\3\3\3\3\4\3\4\3"+
		"\4\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\13"+
		"\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u01c8\n\f\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u01d8\n\r\3"+
		"\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3"+
		"\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3"+
		"\23\3\23\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3"+
		"\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\31\3"+
		"\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3"+
		"\32\3\32\5\32\u0222\n\32\3\33\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\35"+
		"\3\36\3\36\3\36\5\36\u0230\n\36\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3"+
		" \3 \3 \3 \3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3"+
		"#\3$\3$\3$\3$\5$\u0254\n$\3%\3%\3%\3&\3&\3&\3\'\3\'\3\'\3\'\3(\3(\3(\3"+
		"(\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\5)\u0274\n)\3*\3*\3"+
		"*\3*\3*\3*\3*\5*\u027d\n*\3+\3+\3+\3+\3+\5+\u0284\n+\3,\3,\3,\3,\3,\3"+
		"-\3-\3-\3-\3-\3.\3.\3.\3.\3.\3/\3/\3/\3/\3/\3\60\3\60\3\60\3\60\3\60\3"+
		"\61\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3\62\3\63\3\63\3\63\3\63\3"+
		"\63\3\64\3\64\3\64\3\64\3\64\3\65\3\65\3\65\3\65\3\65\3\66\3\66\3\66\3"+
		"\66\3\66\3\67\3\67\3\67\3\67\3\67\38\38\38\38\38\39\39\39\39\39\3:\3:"+
		"\3:\3:\3:\3;\3;\3;\3;\3;\3<\3<\3<\3<\3<\3<\3=\3=\3=\3=\3=\3=\3>\3>\3>"+
		"\3>\3>\3>\3>\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?"+
		"\5?\u02fc\n?\3@\3@\3@\3@\3@\3A\3A\3A\3A\3B\3B\3B\3B\3C\3C\3C\3C\3C\5C"+
		"\u0310\nC\3D\3D\3D\5D\u0315\nD\3E\3E\3E\3F\3F\3F\3G\3G\3G\3H\3H\3H\3I"+
		"\3I\3I\5I\u0326\nI\3J\3J\3J\3J\3K\3K\3K\3K\3L\3L\3L\3L\3M\3M\3M\3M\3N"+
		"\3N\3N\3O\3O\3O\3P\3P\3P\3Q\3Q\3Q\3R\3R\3R\3R\3R\3R\5R\u034a\nR\3S\3S"+
		"\3S\3S\3T\3T\3T\3T\3U\3U\5U\u0356\nU\3V\3V\3V\3V\5V\u035c\nV\3W\3W\3W"+
		"\3W\3W\3W\3W\3W\3W\3W\3W\5W\u0369\nW\3X\3X\3Y\3Y\3Z\3Z\3[\3[\3[\3\\\3"+
		"\\\3\\\3]\3]\3]\3]\3]\3]\3]\5]\u037e\n]\3^\3^\3^\3_\3_\3_\3`\3`\3`\3a"+
		"\3a\3a\3a\5a\u038d\na\3a\3a\3a\3b\3b\3b\3b\5b\u0396\nb\3b\3b\3b\3c\3c"+
		"\3c\3c\3c\3c\3d\3d\3d\3e\3e\3e\3f\3f\3f\5f\u03aa\nf\3f\3f\3f\3f\3f\3f"+
		"\5f\u03b2\nf\3f\3f\3f\5f\u03b7\nf\3g\3g\3g\5g\u03bc\ng\3h\3h\3h\5h\u03c1"+
		"\nh\3i\3i\3i\3i\3j\3j\3j\3j\3k\3k\3k\5k\u03ce\nk\3l\3l\3l\3l\3m\3m\3m"+
		"\3m\3n\3n\3n\3o\3o\3o\3o\3p\3p\3q\3q\3q\3q\3r\3r\3r\3r\3s\3s\3t\3t\3t"+
		"\3t\3u\3u\3v\3v\3w\3w\3w\3w\3w\3w\3x\3x\3x\3y\3y\3y\5y\u03ff\ny\3z\3z"+
		"\3z\3z\3z\3z\3z\3{\3{\3{\3|\3|\6|\u040d\n|\r|\16|\u040e\3}\3}\6}\u0413"+
		"\n}\r}\16}\u0414\3~\3~\6~\u0419\n~\r~\16~\u041a\3\177\3\177\3\u0080\3"+
		"\u0080\3\u0081\3\u0081\3\u0082\3\u0082\3\u0083\3\u0083\3\u0084\3\u0084"+
		"\3\u0085\3\u0085\3\u0086\3\u0086\3\u0087\3\u0087\3\u0088\3\u0088\3\u0089"+
		"\3\u0089\5\u0089\u0433\n\u0089\3\u008a\3\u008a\3\u008b\3\u008b\3\u008b"+
		"\5\u008b\u043a\n\u008b\3\u008c\3\u008c\3\u008c\5\u008c\u043f\n\u008c\3"+
		"\u008d\3\u008d\3\u008d\5\u008d\u0444\n\u008d\3\u008e\3\u008e\3\u008e\3"+
		"\u008e\3\u008e\5\u008e\u044b\n\u008e\3\u008f\3\u008f\3\u0090\3\u0090\3"+
		"\u0091\3\u0091\3\u0091\7\u0091\u0454\n\u0091\f\u0091\16\u0091\u0457\13"+
		"\u0091\3\u0092\3\u0092\3\u0093\3\u0093\3\u0093\3\u0094\3\u0094\3\u0094"+
		"\7\u0094\u0461\n\u0094\f\u0094\16\u0094\u0464\13\u0094\3\u0094\3\u0094"+
		"\5\u0094\u0468\n\u0094\3\u0094\5\u0094\u046b\n\u0094\3\u0095\3\u0095\3"+
		"\u0095\3\u0095\3\u0095\3\u0095\5\u0095\u0473\n\u0095\3\u0096\3\u0096\5"+
		"\u0096\u0477\n\u0096\3\u0097\3\u0097\3\u0098\3\u0098\3\u0099\3\u0099\3"+
		"\u009a\3\u009a\3\u009b\3\u009b\3\u009c\3\u009c\3\u009d\3\u009d\3\u009d"+
		"\3\u009d\3\u009e\3\u009e\3\u009e\3\u009e\3\u009e\3\u009e\3\u009e\5\u009e"+
		"\u0490\n\u009e\3\u009f\3\u009f\3\u00a0\3\u00a0\3\u00a1\3\u00a1\3\u00a2"+
		"\3\u00a2\3\u00a2\3\u00a3\3\u00a3\3\u00a3\3\u00a4\3\u00a4\5\u00a4\u04a0"+
		"\n\u00a4\3\u00a5\3\u00a5\5\u00a5\u04a4\n\u00a5\3\u00a6\3\u00a6\5\u00a6"+
		"\u04a8\n\u00a6\3\u00a7\3\u00a7\3\u00a7\3\u00a7\7\u00a7\u04ae\n\u00a7\f"+
		"\u00a7\16\u00a7\u04b1\13\u00a7\3\u00a7\3\u00a7\3\u00a8\3\u00a8\3\u00a8"+
		"\3\u00a9\3\u00a9\5\u00a9\u04ba\n\u00a9\3\u00aa\3\u00aa\3\u00aa\7\u00aa"+
		"\u04bf\n\u00aa\f\u00aa\16\u00aa\u04c2\13\u00aa\3\u00ab\3\u00ab\3\u00ab"+
		"\3\u00ab\3\u00ab\3\u00ab\5\u00ab\u04ca\n\u00ab\3\u00ac\3\u00ac\3\u00ac"+
		"\3\u00ac\7\u00ac\u04d0\n\u00ac\f\u00ac\16\u00ac\u04d3\13\u00ac\3\u00ad"+
		"\3\u00ad\3\u00ad\3\u00ad\5\u00ad\u04d9\n\u00ad\3\u00ae\3\u00ae\3\u00ae"+
		"\3\u00ae\3\u00ae\5\u00ae\u04e0\n\u00ae\3\u00af\3\u00af\3\u00af\6\u00af"+
		"\u04e5\n\u00af\r\u00af\16\u00af\u04e6\3\u00b0\3\u00b0\3\u00b0\3\u00b0"+
		"\5\u00b0\u04ed\n\u00b0\3\u00b1\3\u00b1\3\u00b1\3\u00b1\3\u00b1\5\u00b1"+
		"\u04f4\n\u00b1\3\u00b2\3\u00b2\3\u00b2\6\u00b2\u04f9\n\u00b2\r\u00b2\16"+
		"\u00b2\u04fa\3\u00b3\3\u00b3\3\u00b3\3\u00b3\3\u00b3\3\u00b4\3\u00b4\3"+
		"\u00b4\3\u00b4\3\u00b4\3\u00b5\3\u00b5\3\u00b5\3\u00b5\3\u00b5\3\u00b6"+
		"\3\u00b6\3\u00b6\3\u00b6\3\u00b6\3\u00b7\3\u00b7\3\u00b7\3\u00b7\3\u00b7"+
		"\3\u00b8\3\u00b8\3\u00b9\3\u00b9\3\u00ba\6\u00ba\u051b\n\u00ba\r\u00ba"+
		"\16\u00ba\u051c\3\u00ba\2\2\u00bb\2\4\6\b\n\f\16\20\22\24\26\30\32\34"+
		"\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082"+
		"\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a"+
		"\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2"+
		"\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca"+
		"\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8\u00da\u00dc\u00de\u00e0\u00e2"+
		"\u00e4\u00e6\u00e8\u00ea\u00ec\u00ee\u00f0\u00f2\u00f4\u00f6\u00f8\u00fa"+
		"\u00fc\u00fe\u0100\u0102\u0104\u0106\u0108\u010a\u010c\u010e\u0110\u0112"+
		"\u0114\u0116\u0118\u011a\u011c\u011e\u0120\u0122\u0124\u0126\u0128\u012a"+
		"\u012c\u012e\u0130\u0132\u0134\u0136\u0138\u013a\u013c\u013e\u0140\u0142"+
		"\u0144\u0146\u0148\u014a\u014c\u014e\u0150\u0152\u0154\u0156\u0158\u015a"+
		"\u015c\u015e\u0160\u0162\u0164\u0166\u0168\u016a\u016c\u016e\u0170\u0172"+
		"\2\4\3\2\177\u0080\3\2\u0084\u008b\u0527\2\u017e\3\2\2\2\4\u0180\3\2\2"+
		"\2\6\u0183\3\2\2\2\b\u0186\3\2\2\2\n\u0189\3\2\2\2\f\u018c\3\2\2\2\16"+
		"\u018f\3\2\2\2\20\u0192\3\2\2\2\22\u0194\3\2\2\2\24\u0196\3\2\2\2\26\u01c7"+
		"\3\2\2\2\30\u01d7\3\2\2\2\32\u01d9\3\2\2\2\34\u01de\3\2\2\2\36\u01e3\3"+
		"\2\2\2 \u01e8\3\2\2\2\"\u01ed\3\2\2\2$\u01f2\3\2\2\2&\u01f7\3\2\2\2(\u01fc"+
		"\3\2\2\2*\u0201\3\2\2\2,\u0206\3\2\2\2.\u020b\3\2\2\2\60\u0210\3\2\2\2"+
		"\62\u0221\3\2\2\2\64\u0223\3\2\2\2\66\u0226\3\2\2\28\u0229\3\2\2\2:\u022f"+
		"\3\2\2\2<\u0231\3\2\2\2>\u0237\3\2\2\2@\u023d\3\2\2\2B\u0243\3\2\2\2D"+
		"\u0249\3\2\2\2F\u0253\3\2\2\2H\u0255\3\2\2\2J\u0258\3\2\2\2L\u025b\3\2"+
		"\2\2N\u025f\3\2\2\2P\u0273\3\2\2\2R\u027c\3\2\2\2T\u0283\3\2\2\2V\u0285"+
		"\3\2\2\2X\u028a\3\2\2\2Z\u028f\3\2\2\2\\\u0294\3\2\2\2^\u0299\3\2\2\2"+
		"`\u029e\3\2\2\2b\u02a3\3\2\2\2d\u02a8\3\2\2\2f\u02ad\3\2\2\2h\u02b2\3"+
		"\2\2\2j\u02b7\3\2\2\2l\u02bc\3\2\2\2n\u02c1\3\2\2\2p\u02c6\3\2\2\2r\u02cb"+
		"\3\2\2\2t\u02d0\3\2\2\2v\u02d5\3\2\2\2x\u02db\3\2\2\2z\u02e1\3\2\2\2|"+
		"\u02fb\3\2\2\2~\u02fd\3\2\2\2\u0080\u0302\3\2\2\2\u0082\u0306\3\2\2\2"+
		"\u0084\u030a\3\2\2\2\u0086\u0314\3\2\2\2\u0088\u0316\3\2\2\2\u008a\u0319"+
		"\3\2\2\2\u008c\u031c\3\2\2\2\u008e\u031f\3\2\2\2\u0090\u0325\3\2\2\2\u0092"+
		"\u0327\3\2\2\2\u0094\u032b\3\2\2\2\u0096\u032f\3\2\2\2\u0098\u0333\3\2"+
		"\2\2\u009a\u0337\3\2\2\2\u009c\u033a\3\2\2\2\u009e\u033d\3\2\2\2\u00a0"+
		"\u0340\3\2\2\2\u00a2\u0349\3\2\2\2\u00a4\u034b\3\2\2\2\u00a6\u034f\3\2"+
		"\2\2\u00a8\u0355\3\2\2\2\u00aa\u0357\3\2\2\2\u00ac\u0368\3\2\2\2\u00ae"+
		"\u036a\3\2\2\2\u00b0\u036c\3\2\2\2\u00b2\u036e\3\2\2\2\u00b4\u0370\3\2"+
		"\2\2\u00b6\u0373\3\2\2\2\u00b8\u0376\3\2\2\2\u00ba\u037f\3\2\2\2\u00bc"+
		"\u0382\3\2\2\2\u00be\u0385\3\2\2\2\u00c0\u0388\3\2\2\2\u00c2\u0391\3\2"+
		"\2\2\u00c4\u039a\3\2\2\2\u00c6\u03a0\3\2\2\2\u00c8\u03a3\3\2\2\2\u00ca"+
		"\u03b6\3\2\2\2\u00cc\u03b8\3\2\2\2\u00ce\u03bd\3\2\2\2\u00d0\u03c2\3\2"+
		"\2\2\u00d2\u03c6\3\2\2\2\u00d4\u03ca\3\2\2\2\u00d6\u03cf\3\2\2\2\u00d8"+
		"\u03d3\3\2\2\2\u00da\u03d7\3\2\2\2\u00dc\u03da\3\2\2\2\u00de\u03de\3\2"+
		"\2\2\u00e0\u03e0\3\2\2\2\u00e2\u03e4\3\2\2\2\u00e4\u03e8\3\2\2\2\u00e6"+
		"\u03ea\3\2\2\2\u00e8\u03ee\3\2\2\2\u00ea\u03f0\3\2\2\2\u00ec\u03f2\3\2"+
		"\2\2\u00ee\u03f8\3\2\2\2\u00f0\u03fb\3\2\2\2\u00f2\u0400\3\2\2\2\u00f4"+
		"\u0407\3\2\2\2\u00f6\u040a\3\2\2\2\u00f8\u0410\3\2\2\2\u00fa\u0416\3\2"+
		"\2\2\u00fc\u041c\3\2\2\2\u00fe\u041e\3\2\2\2\u0100\u0420\3\2\2\2\u0102"+
		"\u0422\3\2\2\2\u0104\u0424\3\2\2\2\u0106\u0426\3\2\2\2\u0108\u0428\3\2"+
		"\2\2\u010a\u042a\3\2\2\2\u010c\u042c\3\2\2\2\u010e\u042e\3\2\2\2\u0110"+
		"\u0432\3\2\2\2\u0112\u0434\3\2\2\2\u0114\u0436\3\2\2\2\u0116\u043b\3\2"+
		"\2\2\u0118\u0440\3\2\2\2\u011a\u044a\3\2\2\2\u011c\u044c\3\2\2\2\u011e"+
		"\u044e\3\2\2\2\u0120\u0450\3\2\2\2\u0122\u0458\3\2\2\2\u0124\u045a\3\2"+
		"\2\2\u0126\u046a\3\2\2\2\u0128\u0472\3\2\2\2\u012a\u0476\3\2\2\2\u012c"+
		"\u0478\3\2\2\2\u012e\u047a\3\2\2\2\u0130\u047c\3\2\2\2\u0132\u047e\3\2"+
		"\2\2\u0134\u0480\3\2\2\2\u0136\u0482\3\2\2\2\u0138\u0484\3\2\2\2\u013a"+
		"\u048f\3\2\2\2\u013c\u0491\3\2\2\2\u013e\u0493\3\2\2\2\u0140\u0495\3\2"+
		"\2\2\u0142\u0497\3\2\2\2\u0144\u049a\3\2\2\2\u0146\u049f\3\2\2\2\u0148"+
		"\u04a1\3\2\2\2\u014a\u04a7\3\2\2\2\u014c\u04a9\3\2\2\2\u014e\u04b4\3\2"+
		"\2\2\u0150\u04b9\3\2\2\2\u0152\u04bb\3\2\2\2\u0154\u04c9\3\2\2\2\u0156"+
		"\u04cb\3\2\2\2\u0158\u04d8\3\2\2\2\u015a\u04df\3\2\2\2\u015c\u04e1\3\2"+
		"\2\2\u015e\u04ec\3\2\2\2\u0160\u04f3\3\2\2\2\u0162\u04f5\3\2\2\2\u0164"+
		"\u04fc\3\2\2\2\u0166\u0501\3\2\2\2\u0168\u0506\3\2\2\2\u016a\u050b\3\2"+
		"\2\2\u016c\u0510\3\2\2\2\u016e\u0515\3\2\2\2\u0170\u0517\3\2\2\2\u0172"+
		"\u051a\3\2\2\2\u0174\u017f\5\26\f\2\u0175\u017f\5\4\3\2\u0176\u017f\5"+
		"\6\4\2\u0177\u017f\5\b\5\2\u0178\u017f\5\n\6\2\u0179\u017f\5\f\7\2\u017a"+
		"\u017f\5\16\b\2\u017b\u017f\5\20\t\2\u017c\u017f\5\22\n\2\u017d\u017f"+
		"\5\24\13\2\u017e\u0174\3\2\2\2\u017e\u0175\3\2\2\2\u017e\u0176\3\2\2\2"+
		"\u017e\u0177\3\2\2\2\u017e\u0178\3\2\2\2\u017e\u0179\3\2\2\2\u017e\u017a"+
		"\3\2\2\2\u017e\u017b\3\2\2\2\u017e\u017c\3\2\2\2\u017e\u017d\3\2\2\2\u017f"+
		"\3\3\2\2\2\u0180\u0181\5\26\f\2\u0181\u0182\7\3\2\2\u0182\5\3\2\2\2\u0183"+
		"\u0184\5\26\f\2\u0184\u0185\7\4\2\2\u0185\7\3\2\2\2\u0186\u0187\5\26\f"+
		"\2\u0187\u0188\7\5\2\2\u0188\t\3\2\2\2\u0189\u018a\5\26\f\2\u018a\u018b"+
		"\7\6\2\2\u018b\13\3\2\2\2\u018c\u018d\5\26\f\2\u018d\u018e\7\7\2\2\u018e"+
		"\r\3\2\2\2\u018f\u0190\5\26\f\2\u0190\u0191\7\b\2\2\u0191\17\3\2\2\2\u0192"+
		"\u0193\7\t\2\2\u0193\21\3\2\2\2\u0194\u0195\7\n\2\2\u0195\23\3\2\2\2\u0196"+
		"\u0197\7\13\2\2\u0197\25\3\2\2\2\u0198\u01c8\5\u00b0Y\2\u0199\u01c8\5"+
		"\u00b2Z\2\u019a\u01c8\5\u00b4[\2\u019b\u01c8\5\u00b6\\\2\u019c\u01c8\5"+
		"\u00b8]\2\u019d\u01c8\5\u00ba^\2\u019e\u01c8\5\u00bc_\2\u019f\u01c8\5"+
		"\u00be`\2\u01a0\u01c8\5\u00c0a\2\u01a1\u01c8\5\u00c2b\2\u01a2\u01c8\5"+
		"\u00c4c\2\u01a3\u01c8\5\u00c6d\2\u01a4\u01c8\5\u00c8e\2\u01a5\u01c8\5"+
		"\u00ccg\2\u01a6\u01c8\5\u00ceh\2\u01a7\u01c8\5\u00d0i\2\u01a8\u01c8\5"+
		"\u00d2j\2\u01a9\u01c8\5\u00d4k\2\u01aa\u01c8\5\u00d6l\2\u01ab\u01c8\5"+
		"\u00d8m\2\u01ac\u01c8\5\u00dan\2\u01ad\u01c8\5\u00dco\2\u01ae\u01c8\5"+
		"\u00dep\2\u01af\u01c8\5\u00e0q\2\u01b0\u01c8\5\u00e2r\2\u01b1\u01c8\5"+
		"\u00e4s\2\u01b2\u01c8\5\u00e6t\2\u01b3\u01c8\5\u00e8u\2\u01b4\u01c8\5"+
		"\u00eav\2\u01b5\u01c8\5\u00ecw\2\u01b6\u01c8\5\u00eex\2\u01b7\u01c8\5"+
		"\u00f0y\2\u01b8\u01c8\5\u00f2z\2\u01b9\u01c8\5\u00f4{\2\u01ba\u01c8\5"+
		"\u00f6|\2\u01bb\u01c8\5\u00f8}\2\u01bc\u01c8\5\u00fa~\2\u01bd\u01c8\5"+
		"\u00fc\177\2\u01be\u01c8\5\u00fe\u0080\2\u01bf\u01c8\5\u0100\u0081\2\u01c0"+
		"\u01c8\5\u0102\u0082\2\u01c1\u01c8\5\u0104\u0083\2\u01c2\u01c8\5\u0106"+
		"\u0084\2\u01c3\u01c8\5\u0108\u0085\2\u01c4\u01c8\5\u010a\u0086\2\u01c5"+
		"\u01c8\5\u010c\u0087\2\u01c6\u01c8\5\30\r\2\u01c7\u0198\3\2\2\2\u01c7"+
		"\u0199\3\2\2\2\u01c7\u019a\3\2\2\2\u01c7\u019b\3\2\2\2\u01c7\u019c\3\2"+
		"\2\2\u01c7\u019d\3\2\2\2\u01c7\u019e\3\2\2\2\u01c7\u019f\3\2\2\2\u01c7"+
		"\u01a0\3\2\2\2\u01c7\u01a1\3\2\2\2\u01c7\u01a2\3\2\2\2\u01c7\u01a3\3\2"+
		"\2\2\u01c7\u01a4\3\2\2\2\u01c7\u01a5\3\2\2\2\u01c7\u01a6\3\2\2\2\u01c7"+
		"\u01a7\3\2\2\2\u01c7\u01a8\3\2\2\2\u01c7\u01a9\3\2\2\2\u01c7\u01aa\3\2"+
		"\2\2\u01c7\u01ab\3\2\2\2\u01c7\u01ac\3\2\2\2\u01c7\u01ad\3\2\2\2\u01c7"+
		"\u01ae\3\2\2\2\u01c7\u01af\3\2\2\2\u01c7\u01b0\3\2\2\2\u01c7\u01b1\3\2"+
		"\2\2\u01c7\u01b2\3\2\2\2\u01c7\u01b3\3\2\2\2\u01c7\u01b4\3\2\2\2\u01c7"+
		"\u01b5\3\2\2\2\u01c7\u01b6\3\2\2\2\u01c7\u01b7\3\2\2\2\u01c7\u01b8\3\2"+
		"\2\2\u01c7\u01b9\3\2\2\2\u01c7\u01ba\3\2\2\2\u01c7\u01bb\3\2\2\2\u01c7"+
		"\u01bc\3\2\2\2\u01c7\u01bd\3\2\2\2\u01c7\u01be\3\2\2\2\u01c7\u01bf\3\2"+
		"\2\2\u01c7\u01c0\3\2\2\2\u01c7\u01c1\3\2\2\2\u01c7\u01c2\3\2\2\2\u01c7"+
		"\u01c3\3\2\2\2\u01c7\u01c4\3\2\2\2\u01c7\u01c5\3\2\2\2\u01c7\u01c6\3\2"+
		"\2\2\u01c8\27\3\2\2\2\u01c9\u01d8\5\62\32\2\u01ca\u01d8\5\u00caf\2\u01cb"+
		"\u01d8\5:\36\2\u01cc\u01d8\5<\37\2\u01cd\u01d8\5F$\2\u01ce\u01d8\5J&\2"+
		"\u01cf\u01d8\5H%\2\u01d0\u01d8\5|?\2\u01d1\u01d8\5~@\2\u01d2\u01d8\5\u0088"+
		"E\2\u01d3\u01d8\5\u0090I\2\u01d4\u01d8\5\u00a2R\2\u01d5\u01d8\5\u00a8"+
		"U\2\u01d6\u01d8\5\u00aaV\2\u01d7\u01c9\3\2\2\2\u01d7\u01ca\3\2\2\2\u01d7"+
		"\u01cb\3\2\2\2\u01d7\u01cc\3\2\2\2\u01d7\u01cd\3\2\2\2\u01d7\u01ce\3\2"+
		"\2\2\u01d7\u01cf\3\2\2\2\u01d7\u01d0\3\2\2\2\u01d7\u01d1\3\2\2\2\u01d7"+
		"\u01d2\3\2\2\2\u01d7\u01d3\3\2\2\2\u01d7\u01d4\3\2\2\2\u01d7\u01d5\3\2"+
		"\2\2\u01d7\u01d6\3\2\2\2\u01d8\31\3\2\2\2\u01d9\u01da\7\f\2\2\u01da\u01db"+
		"\5\u00acW\2\u01db\u01dc\7\r\2\2\u01dc\u01dd\5\u00acW\2\u01dd\33\3\2\2"+
		"\2\u01de\u01df\7\f\2\2\u01df\u01e0\5\u00acW\2\u01e0\u01e1\7\16\2\2\u01e1"+
		"\u01e2\5\u00acW\2\u01e2\35\3\2\2\2\u01e3\u01e4\7\f\2\2\u01e4\u01e5\5\u00ac"+
		"W\2\u01e5\u01e6\7\17\2\2\u01e6\u01e7\5\u00acW\2\u01e7\37\3\2\2\2\u01e8"+
		"\u01e9\7\f\2\2\u01e9\u01ea\5\u00acW\2\u01ea\u01eb\7\20\2\2\u01eb\u01ec"+
		"\5\u00acW\2\u01ec!\3\2\2\2\u01ed\u01ee\7\f\2\2\u01ee\u01ef\5\u00acW\2"+
		"\u01ef\u01f0\7\21\2\2\u01f0\u01f1\5\u00acW\2\u01f1#\3\2\2\2\u01f2\u01f3"+
		"\7\f\2\2\u01f3\u01f4\5\u00acW\2\u01f4\u01f5\7\22\2\2\u01f5\u01f6\5\u00ac"+
		"W\2\u01f6%\3\2\2\2\u01f7\u01f8\7\f\2\2\u01f8\u01f9\5\u00acW\2\u01f9\u01fa"+
		"\7\23\2\2\u01fa\u01fb\5\u00acW\2\u01fb\'\3\2\2\2\u01fc\u01fd\7\f\2\2\u01fd"+
		"\u01fe\5\u00acW\2\u01fe\u01ff\7\24\2\2\u01ff\u0200\5\u00acW\2\u0200)\3"+
		"\2\2\2\u0201\u0202\7\f\2\2\u0202\u0203\5\u00acW\2\u0203\u0204\7\25\2\2"+
		"\u0204\u0205\5\u00acW\2\u0205+\3\2\2\2\u0206\u0207\7\f\2\2\u0207\u0208"+
		"\5\u00acW\2\u0208\u0209\7\26\2\2\u0209\u020a\5\u00acW\2\u020a-\3\2\2\2"+
		"\u020b\u020c\7\f\2\2\u020c\u020d\5\u00acW\2\u020d\u020e\7\27\2\2\u020e"+
		"\u020f\5\u00acW\2\u020f/\3\2\2\2\u0210\u0211\7\f\2\2\u0211\u0212\5\u00ac"+
		"W\2\u0212\u0213\7\30\2\2\u0213\u0214\5\u00acW\2\u0214\61\3\2\2\2\u0215"+
		"\u0222\5\32\16\2\u0216\u0222\5\34\17\2\u0217\u0222\5\36\20\2\u0218\u0222"+
		"\5 \21\2\u0219\u0222\5\"\22\2\u021a\u0222\5$\23\2\u021b\u0222\5&\24\2"+
		"\u021c\u0222\5(\25\2\u021d\u0222\5*\26\2\u021e\u0222\5,\27\2\u021f\u0222"+
		"\5.\30\2\u0220\u0222\5\60\31\2\u0221\u0215\3\2\2\2\u0221\u0216\3\2\2\2"+
		"\u0221\u0217\3\2\2\2\u0221\u0218\3\2\2\2\u0221\u0219\3\2\2\2\u0221\u021a"+
		"\3\2\2\2\u0221\u021b\3\2\2\2\u0221\u021c\3\2\2\2\u0221\u021d\3\2\2\2\u0221"+
		"\u021e\3\2\2\2\u0221\u021f\3\2\2\2\u0221\u0220\3\2\2\2\u0222\63\3\2\2"+
		"\2\u0223\u0224\7\31\2\2\u0224\u0225\5\u0128\u0095\2\u0225\65\3\2\2\2\u0226"+
		"\u0227\7\32\2\2\u0227\u0228\5\u0128\u0095\2\u0228\67\3\2\2\2\u0229\u022a"+
		"\7\33\2\2\u022a\u022b\5\u0128\u0095\2\u022b9\3\2\2\2\u022c\u0230\58\35"+
		"\2\u022d\u0230\5\66\34\2\u022e\u0230\5\64\33\2\u022f\u022c\3\2\2\2\u022f"+
		"\u022d\3\2\2\2\u022f\u022e\3\2\2\2\u0230;\3\2\2\2\u0231\u0232\7\34\2\2"+
		"\u0232\u0233\7\35\2\2\u0233\u0234\5\u013a\u009e\2\u0234\u0235\7\36\2\2"+
		"\u0235\u0236\5\u00acW\2\u0236=\3\2\2\2\u0237\u0238\7\37\2\2\u0238\u0239"+
		"\5\u00aeX\2\u0239\u023a\7\35\2\2\u023a\u023b\5\u0120\u0091\2\u023b\u023c"+
		"\7\36\2\2\u023c?\3\2\2\2\u023d\u023e\7\37\2\2\u023e\u023f\7 \2\2\u023f"+
		"\u0240\7\35\2\2\u0240\u0241\5\u0120\u0091\2\u0241\u0242\7\36\2\2\u0242"+
		"A\3\2\2\2\u0243\u0244\7\37\2\2\u0244\u0245\5\u013a\u009e\2\u0245\u0246"+
		"\7\35\2\2\u0246\u0247\5\u0120\u0091\2\u0247\u0248\7\36\2\2\u0248C\3\2"+
		"\2\2\u0249\u024a\7\37\2\2\u024a\u024b\7!\2\2\u024b\u024c\7\35\2\2\u024c"+
		"\u024d\5\u0120\u0091\2\u024d\u024e\7\36\2\2\u024eE\3\2\2\2\u024f\u0254"+
		"\5> \2\u0250\u0254\5@!\2\u0251\u0254\5B\"\2\u0252\u0254\5D#\2\u0253\u024f"+
		"\3\2\2\2\u0253\u0250\3\2\2\2\u0253\u0251\3\2\2\2\u0253\u0252\3\2\2\2\u0254"+
		"G\3\2\2\2\u0255\u0256\7\"\2\2\u0256\u0257\5T+\2\u0257I\3\2\2\2\u0258\u0259"+
		"\7#\2\2\u0259\u025a\5T+\2\u025aK\3\2\2\2\u025b\u025c\5\u00aeX\2\u025c"+
		"\u025d\7\u009e\2\2\u025d\u025e\5T+\2\u025eM\3\2\2\2\u025f\u0260\5\u00ae"+
		"X\2\u0260\u0261\7\u009e\2\2\u0261\u0262\5\u00acW\2\u0262O\3\2\2\2\u0263"+
		"\u0264\5\u00aeX\2\u0264\u0265\7\u009e\2\2\u0265\u0266\7 \2\2\u0266\u0267"+
		"\7\u009e\2\2\u0267\u0268\5\u00acW\2\u0268\u0274\3\2\2\2\u0269\u026a\5"+
		"\u00aeX\2\u026a\u026b\7\u009e\2\2\u026b\u026c\7 \2\2\u026c\u026d\7\u009e"+
		"\2\2\u026d\u026e\5\u013a\u009e\2\u026e\u0274\3\2\2\2\u026f\u0270\5\u00ae"+
		"X\2\u0270\u0271\7\u009e\2\2\u0271\u0272\7 \2\2\u0272\u0274\3\2\2\2\u0273"+
		"\u0263\3\2\2\2\u0273\u0269\3\2\2\2\u0273\u026f\3\2\2\2\u0274Q\3\2\2\2"+
		"\u0275\u0276\7!\2\2\u0276\u0277\7\u009e\2\2\u0277\u027d\5\u00acW\2\u0278"+
		"\u0279\7!\2\2\u0279\u027a\7\u009e\2\2\u027a\u027d\5\u013a\u009e\2\u027b"+
		"\u027d\7!\2\2\u027c\u0275\3\2\2\2\u027c\u0278\3\2\2\2\u027c\u027b\3\2"+
		"\2\2\u027dS\3\2\2\2\u027e\u0284\5L\'\2\u027f\u0284\5\u016a\u00b6\2\u0280"+
		"\u0284\5N(\2\u0281\u0284\5P)\2\u0282\u0284\5R*\2\u0283\u027e\3\2\2\2\u0283"+
		"\u027f\3\2\2\2\u0283\u0280\3\2\2\2\u0283\u0281\3\2\2\2\u0283\u0282\3\2"+
		"\2\2\u0284U\3\2\2\2\u0285\u0286\7$\2\2\u0286\u0287\5\u00acW\2\u0287\u0288"+
		"\7%\2\2\u0288\u0289\5\u00acW\2\u0289W\3\2\2\2\u028a\u028b\7$\2\2\u028b"+
		"\u028c\5\u00acW\2\u028c\u028d\7&\2\2\u028d\u028e\5\u00acW\2\u028eY\3\2"+
		"\2\2\u028f\u0290\7$\2\2\u0290\u0291\5\u00acW\2\u0291\u0292\7\'\2\2\u0292"+
		"\u0293\5\u00acW\2\u0293[\3\2\2\2\u0294\u0295\7$\2\2\u0295\u0296\5\u00ac"+
		"W\2\u0296\u0297\7(\2\2\u0297\u0298\5\u00acW\2\u0298]\3\2\2\2\u0299\u029a"+
		"\7$\2\2\u029a\u029b\5\u00acW\2\u029b\u029c\7)\2\2\u029c\u029d\5\u00ac"+
		"W\2\u029d_\3\2\2\2\u029e\u029f\7$\2\2\u029f\u02a0\5\u00acW\2\u02a0\u02a1"+
		"\7*\2\2\u02a1\u02a2\5\u00acW\2\u02a2a\3\2\2\2\u02a3\u02a4\7$\2\2\u02a4"+
		"\u02a5\5\u00acW\2\u02a5\u02a6\7+\2\2\u02a6\u02a7\5\u00acW\2\u02a7c\3\2"+
		"\2\2\u02a8\u02a9\7$\2\2\u02a9\u02aa\5\u00acW\2\u02aa\u02ab\7,\2\2\u02ab"+
		"\u02ac\5\u00acW\2\u02ace\3\2\2\2\u02ad\u02ae\7$\2\2\u02ae\u02af\5\u00ac"+
		"W\2\u02af\u02b0\7-\2\2\u02b0\u02b1\5\u00acW\2\u02b1g\3\2\2\2\u02b2\u02b3"+
		"\7$\2\2\u02b3\u02b4\5\u00acW\2\u02b4\u02b5\7.\2\2\u02b5\u02b6\5\u00ac"+
		"W\2\u02b6i\3\2\2\2\u02b7\u02b8\7$\2\2\u02b8\u02b9\5\u00acW\2\u02b9\u02ba"+
		"\7/\2\2\u02ba\u02bb\5\u00acW\2\u02bbk\3\2\2\2\u02bc\u02bd\7$\2\2\u02bd"+
		"\u02be\5\u00acW\2\u02be\u02bf\7\60\2\2\u02bf\u02c0\5\u00acW\2\u02c0m\3"+
		"\2\2\2\u02c1\u02c2\7$\2\2\u02c2\u02c3\5\u00acW\2\u02c3\u02c4\7\61\2\2"+
		"\u02c4\u02c5\5\u00acW\2\u02c5o\3\2\2\2\u02c6\u02c7\7$\2\2\u02c7\u02c8"+
		"\5\u00acW\2\u02c8\u02c9\7\62\2\2\u02c9\u02ca\5\u00acW\2\u02caq\3\2\2\2"+
		"\u02cb\u02cc\7$\2\2\u02cc\u02cd\5\u00acW\2\u02cd\u02ce\7\63\2\2\u02ce"+
		"\u02cf\5\u00acW\2\u02cfs\3\2\2\2\u02d0\u02d1\7$\2\2\u02d1\u02d2\5\u00ac"+
		"W\2\u02d2\u02d3\7\64\2\2\u02d3\u02d4\5\u00acW\2\u02d4u\3\2\2\2\u02d5\u02d6"+
		"\7$\2\2\u02d6\u02d7\5\u00acW\2\u02d7\u02d8\7&\2\2\u02d8\u02d9\7&\2\2\u02d9"+
		"\u02da\5\u00acW\2\u02daw\3\2\2\2\u02db\u02dc\7$\2\2\u02dc\u02dd\5\u00ac"+
		"W\2\u02dd\u02de\7%\2\2\u02de\u02df\7%\2\2\u02df\u02e0\5\u00acW\2\u02e0"+
		"y\3\2\2\2\u02e1\u02e2\7$\2\2\u02e2\u02e3\5\u00acW\2\u02e3\u02e4\7%\2\2"+
		"\u02e4\u02e5\7%\2\2\u02e5\u02e6\7%\2\2\u02e6\u02e7\5\u00acW\2\u02e7{\3"+
		"\2\2\2\u02e8\u02fc\5V,\2\u02e9\u02fc\5X-\2\u02ea\u02fc\5Z.\2\u02eb\u02fc"+
		"\5\\/\2\u02ec\u02fc\5^\60\2\u02ed\u02fc\5`\61\2\u02ee\u02fc\5b\62\2\u02ef"+
		"\u02fc\5d\63\2\u02f0\u02fc\5f\64\2\u02f1\u02fc\5h\65\2\u02f2\u02fc\5j"+
		"\66\2\u02f3\u02fc\5l\67\2\u02f4\u02fc\5n8\2\u02f5\u02fc\5p9\2\u02f6\u02fc"+
		"\5r:\2\u02f7\u02fc\5t;\2\u02f8\u02fc\5v<\2\u02f9\u02fc\5x=\2\u02fa\u02fc"+
		"\5z>\2\u02fb\u02e8\3\2\2\2\u02fb\u02e9\3\2\2\2\u02fb\u02ea\3\2\2\2\u02fb"+
		"\u02eb\3\2\2\2\u02fb\u02ec\3\2\2\2\u02fb\u02ed\3\2\2\2\u02fb\u02ee\3\2"+
		"\2\2\u02fb\u02ef\3\2\2\2\u02fb\u02f0\3\2\2\2\u02fb\u02f1\3\2\2\2\u02fb"+
		"\u02f2\3\2\2\2\u02fb\u02f3\3\2\2\2\u02fb\u02f4\3\2\2\2\u02fb\u02f5\3\2"+
		"\2\2\u02fb\u02f6\3\2\2\2\u02fb\u02f7\3\2\2\2\u02fb\u02f8\3\2\2\2\u02fb"+
		"\u02f9\3\2\2\2\u02fb\u02fa\3\2\2\2\u02fc}\3\2\2\2\u02fd\u02fe\7\65\2\2"+
		"\u02fe\u02ff\5\u00acW\2\u02ff\u0300\7\66\2\2\u0300\u0301\5\u013a\u009e"+
		"\2\u0301\177\3\2\2\2\u0302\u0303\5\u00aeX\2\u0303\u0304\7\u009f\2\2\u0304"+
		"\u0305\5\u00acW\2\u0305\u0081\3\2\2\2\u0306\u0307\7\67\2\2\u0307\u0308"+
		"\7\u009f\2\2\u0308\u0309\5\u00acW\2\u0309\u0083\3\2\2\2\u030a\u030b\5"+
		"\u00aeX\2\u030b\u030c\7\u009f\2\2\u030c\u030f\7 \2\2\u030d\u030e\7\u009e"+
		"\2\2\u030e\u0310\5\u00acW\2\u030f\u030d\3\2\2\2\u030f\u0310\3\2\2\2\u0310"+
		"\u0085\3\2\2\2\u0311\u0315\5\u0080A\2\u0312\u0315\5\u0082B\2\u0313\u0315"+
		"\5\u0084C\2\u0314\u0311\3\2\2\2\u0314\u0312\3\2\2\2\u0314\u0313\3\2\2"+
		"\2\u0315\u0087\3\2\2\2\u0316\u0317\78\2\2\u0317\u0318\5\u0086D\2\u0318"+
		"\u0089\3\2\2\2\u0319\u031a\79\2\2\u031a\u031b\5\u00aeX\2\u031b\u008b\3"+
		"\2\2\2\u031c\u031d\79\2\2\u031d\u031e\5\u016c\u00b7\2\u031e\u008d\3\2"+
		"\2\2\u031f\u0320\79\2\2\u0320\u0321\5\u016a\u00b6\2\u0321\u008f\3\2\2"+
		"\2\u0322\u0326\5\u008aF\2\u0323\u0326\5\u008cG\2\u0324\u0326\5\u008eH"+
		"\2\u0325\u0322\3\2\2\2\u0325\u0323\3\2\2\2\u0325\u0324\3\2\2\2\u0326\u0091"+
		"\3\2\2\2\u0327\u0328\7:\2\2\u0328\u0329\7;\2\2\u0329\u032a\5\u00acW\2"+
		"\u032a\u0093\3\2\2\2\u032b\u032c\7:\2\2\u032c\u032d\7<\2\2\u032d\u032e"+
		"\5\u00acW\2\u032e\u0095\3\2\2\2\u032f\u0330\7:\2\2\u0330\u0331\7=\2\2"+
		"\u0331\u0332\5\u00acW\2\u0332\u0097\3\2\2\2\u0333\u0334\7:\2\2\u0334\u0335"+
		"\7>\2\2\u0335\u0336\5\u00acW\2\u0336\u0099\3\2\2\2\u0337\u0338\7:\2\2"+
		"\u0338\u0339\5\u009eP\2\u0339\u009b\3\2\2\2\u033a\u033b\7:\2\2\u033b\u033c"+
		"\5\u00a0Q\2\u033c\u009d\3\2\2\2\u033d\u033e\7-\2\2\u033e\u033f\5\u00ac"+
		"W\2\u033f\u009f\3\2\2\2\u0340\u0341\7.\2\2\u0341\u0342\5\u00acW\2\u0342"+
		"\u00a1\3\2\2\2\u0343\u034a\5\u0092J\2\u0344\u034a\5\u0094K\2\u0345\u034a"+
		"\5\u0096L\2\u0346\u034a\5\u0098M\2\u0347\u034a\5\u009aN\2\u0348\u034a"+
		"\5\u009cO\2\u0349\u0343\3\2\2\2\u0349\u0344\3\2\2\2\u0349\u0345\3\2\2"+
		"\2\u0349\u0346\3\2\2\2\u0349\u0347\3\2\2\2\u0349\u0348\3\2\2\2\u034a\u00a3"+
		"\3\2\2\2\u034b\u034c\7?\2\2\u034c\u034d\5\u00acW\2\u034d\u034e\7=\2\2"+
		"\u034e\u00a5\3\2\2\2\u034f\u0350\7?\2\2\u0350\u0351\5\u00acW\2\u0351\u0352"+
		"\7>\2\2\u0352\u00a7\3\2\2\2\u0353\u0356\5\u00a4S\2\u0354\u0356\5\u00a6"+
		"T\2\u0355\u0353\3\2\2\2\u0355\u0354\3\2\2\2\u0356\u00a9\3\2\2\2\u0357"+
		"\u0358\7@\2\2\u0358\u0359\5\u00acW\2\u0359\u035b\5\u00acW\2\u035a\u035c"+
		"\5\u0172\u00ba\2\u035b\u035a\3\2\2\2\u035b\u035c\3\2\2\2\u035c\u00ab\3"+
		"\2\2\2\u035d\u0369\5\u00aeX\2\u035e\u0369\5T+\2\u035f\u0369\5\u0128\u0095"+
		"\2\u0360\u0369\5\u016e\u00b8\2\u0361\u0369\5\u0170\u00b9\2\u0362\u0369"+
		"\5\u0166\u00b4\2\u0363\u0369\5\u0168\u00b5\2\u0364\u0369\5\u016c\u00b7"+
		"\2\u0365\u0369\5\u009eP\2\u0366\u0369\5\u00a0Q\2\u0367\u0369\5\u0086D"+
		"\2\u0368\u035d\3\2\2\2\u0368\u035e\3\2\2\2\u0368\u035f\3\2\2\2\u0368\u0360"+
		"\3\2\2\2\u0368\u0361\3\2\2\2\u0368\u0362\3\2\2\2\u0368\u0363\3\2\2\2\u0368"+
		"\u0364\3\2\2\2\u0368\u0365\3\2\2\2\u0368\u0366\3\2\2\2\u0368\u0367\3\2"+
		"\2\2\u0369\u00ad\3\2\2\2\u036a\u036b\7\u0096\2\2\u036b\u00af\3\2\2\2\u036c"+
		"\u036d\7A\2\2\u036d\u00b1\3\2\2\2\u036e\u036f\7B\2\2\u036f\u00b3\3\2\2"+
		"\2\u0370\u0371\7C\2\2\u0371\u0372\5\u00aeX\2\u0372\u00b5\3\2\2\2\u0373"+
		"\u0374\7D\2\2\u0374\u0375\5\u00aeX\2\u0375\u00b7\3\2\2\2\u0376\u0377\7"+
		"E\2\2\u0377\u0378\5\u013a\u009e\2\u0378\u0379\5\u00aeX\2\u0379\u037a\7"+
		"\35\2\2\u037a\u037d\7\36\2\2\u037b\u037c\7F\2\2\u037c\u037e\5\u00acW\2"+
		"\u037d\u037b\3\2\2\2\u037d\u037e\3\2\2\2\u037e\u00b9\3\2\2\2\u037f\u0380"+
		"\7G\2\2\u0380\u0381\5\u00aeX\2\u0381\u00bb\3\2\2\2\u0382\u0383\7H\2\2"+
		"\u0383\u0384\5\u00aeX\2\u0384\u00bd\3\2\2\2\u0385\u0386\7I\2\2\u0386\u0387"+
		"\5\u00aeX\2\u0387\u00bf\3\2\2\2\u0388\u0389\7J\2\2\u0389\u038a\5\u013a"+
		"\u009e\2\u038a\u038c\7\35\2\2\u038b\u038d\5\u0126\u0094\2\u038c\u038b"+
		"\3\2\2\2\u038c\u038d\3\2\2\2\u038d\u038e\3\2\2\2\u038e\u038f\7\36\2\2"+
		"\u038f\u0390\5\u00aeX\2\u0390\u00c1\3\2\2\2\u0391\u0392\7J\2\2\u0392\u0393"+
		"\7K\2\2\u0393\u0395\7\35\2\2\u0394\u0396\5\u0126\u0094\2\u0395\u0394\3"+
		"\2\2\2\u0395\u0396\3\2\2\2\u0396\u0397\3\2\2\2\u0397\u0398\7\36\2\2\u0398"+
		"\u0399\5\u00aeX\2\u0399\u00c3\3\2\2\2\u039a\u039b\7L\2\2\u039b\u039c\5"+
		"\u00aeX\2\u039c\u039d\7\35\2\2\u039d\u039e\5\u0120\u0091\2\u039e\u039f"+
		"\7\36\2\2\u039f\u00c5\3\2\2\2\u03a0\u03a1\7M\2\2\u03a1\u03a2\5\u00aeX"+
		"\2\u03a2\u00c7\3\2\2\2\u03a3\u03a4\7N\2\2\u03a4\u03a5\5\u013a\u009e\2"+
		"\u03a5\u00c9\3\2\2\2\u03a6\u03a7\7O\2\2\u03a7\u03a9\7\35\2\2\u03a8\u03aa"+
		"\5\u0126\u0094\2\u03a9\u03a8\3\2\2\2\u03a9\u03aa\3\2\2\2\u03aa\u03ab\3"+
		"\2\2\2\u03ab\u03ac\7\36\2\2\u03ac\u03ad\7P\2\2\u03ad\u03b7\7Q\2\2\u03ae"+
		"\u03af\7O\2\2\u03af\u03b1\7\35\2\2\u03b0\u03b2\5\u0126\u0094\2\u03b1\u03b0"+
		"\3\2\2\2\u03b1\u03b2\3\2\2\2\u03b2\u03b3\3\2\2\2\u03b3\u03b4\7\36\2\2"+
		"\u03b4\u03b5\7P\2\2\u03b5\u03b7\5\u00acW\2\u03b6\u03a6\3\2\2\2\u03b6\u03ae"+
		"\3\2\2\2\u03b7\u00cb\3\2\2\2\u03b8\u03b9\7R\2\2\u03b9\u03bb\7S\2\2\u03ba"+
		"\u03bc\5\u00aeX\2\u03bb\u03ba\3\2\2\2\u03bb\u03bc\3\2\2\2\u03bc\u00cd"+
		"\3\2\2\2\u03bd\u03be\7T\2\2\u03be\u03c0\7U\2\2\u03bf\u03c1\5\u00aeX\2"+
		"\u03c0\u03bf\3\2\2\2\u03c0\u03c1\3\2\2\2\u03c1\u00cf\3\2\2\2\u03c2\u03c3"+
		"\7V\2\2\u03c3\u03c4\7W\2\2\u03c4\u03c5\5\u00acW\2\u03c5\u00d1\3\2\2\2"+
		"\u03c6\u03c7\7X\2\2\u03c7\u03c8\7W\2\2\u03c8\u03c9\5\u00acW\2\u03c9\u00d3"+
		"\3\2\2\2\u03ca\u03cb\7Y\2\2\u03cb\u03cd\7Z\2\2\u03cc\u03ce\5\u00acW\2"+
		"\u03cd\u03cc\3\2\2\2\u03cd\u03ce\3\2\2\2\u03ce\u00d5\3\2\2\2\u03cf\u03d0"+
		"\7[\2\2\u03d0\u03d1\7\\\2\2\u03d1\u03d2\5\u00acW\2\u03d2\u00d7\3\2\2\2"+
		"\u03d3\u03d4\7]\2\2\u03d4\u03d5\7^\2\2\u03d5\u03d6\5\u00acW\2\u03d6\u00d9"+
		"\3\2\2\2\u03d7\u03d8\7_\2\2\u03d8\u03d9\7F\2\2\u03d9\u00db\3\2\2\2\u03da"+
		"\u03db\7`\2\2\u03db\u03dc\7a\2\2\u03dc\u03dd\5\u00acW\2\u03dd\u00dd\3"+
		"\2\2\2\u03de\u03df\7b\2\2\u03df\u00df\3\2\2\2\u03e0\u03e1\7c\2\2\u03e1"+
		"\u03e2\7d\2\2\u03e2\u03e3\5\u00acW\2\u03e3\u00e1\3\2\2\2\u03e4\u03e5\7"+
		"e\2\2\u03e5\u03e6\7f\2\2\u03e6\u03e7\5\u013a\u009e\2\u03e7\u00e3\3\2\2"+
		"\2\u03e8\u03e9\7g\2\2\u03e9\u00e5\3\2\2\2\u03ea\u03eb\7h\2\2\u03eb\u03ec"+
		"\7i\2\2\u03ec\u03ed\5\u00acW\2\u03ed\u00e7\3\2\2\2\u03ee\u03ef\7j\2\2"+
		"\u03ef\u00e9\3\2\2\2\u03f0\u03f1\7k\2\2\u03f1\u00eb\3\2\2\2\u03f2\u03f3"+
		"\7l\2\2\u03f3\u03f4\5\u013a\u009e\2\u03f4\u03f5\7\35\2\2\u03f5\u03f6\7"+
		"\67\2\2\u03f6\u03f7\7\36\2\2\u03f7\u00ed\3\2\2\2\u03f8\u03f9\7m\2\2\u03f9"+
		"\u03fa\7n\2\2\u03fa\u00ef\3\2\2\2\u03fb\u03fe\7o\2\2\u03fc\u03fd\7\r\2"+
		"\2\u03fd\u03ff\5\u00acW\2\u03fe\u03fc\3\2\2\2\u03fe\u03ff\3\2\2\2\u03ff"+
		"\u00f1\3\2\2\2\u0400\u0401\7p\2\2\u0401\u0402\7q\2\2\u0402\u0403\5\u013a"+
		"\u009e\2\u0403\u0404\7r\2\2\u0404\u0405\5\u00acW\2\u0405\u0406\7\36\2"+
		"\2\u0406\u00f3\3\2\2\2\u0407\u0408\5\30\r\2\u0408\u0409\5\u0172\u00ba"+
		"\2\u0409\u00f5\3\2\2\2\u040a\u040c\7s\2\2\u040b\u040d\7\35\2\2\u040c\u040b"+
		"\3\2\2\2\u040d\u040e\3\2\2\2\u040e\u040c\3\2\2\2\u040e\u040f\3\2\2\2\u040f"+
		"\u00f7\3\2\2\2\u0410\u0412\7s\2\2\u0411\u0413\7\36\2\2\u0412\u0411\3\2"+
		"\2\2\u0413\u0414\3\2\2\2\u0414\u0412\3\2\2\2\u0414\u0415\3\2\2\2\u0415"+
		"\u00f9\3\2\2\2\u0416\u0418\7s\2\2\u0417\u0419\7t\2\2\u0418\u0417\3\2\2"+
		"\2\u0419\u041a\3\2\2\2\u041a\u0418\3\2\2\2\u041a\u041b\3\2\2\2\u041b\u00fb"+
		"\3\2\2\2\u041c\u041d\7u\2\2\u041d\u00fd\3\2\2\2\u041e\u041f\7v\2\2\u041f"+
		"\u00ff\3\2\2\2\u0420\u0421\7w\2\2\u0421\u0101\3\2\2\2\u0422\u0423\7x\2"+
		"\2\u0423\u0103\3\2\2\2\u0424\u0425\7y\2\2\u0425\u0105\3\2\2\2\u0426\u0427"+
		"\7z\2\2\u0427\u0107\3\2\2\2\u0428\u0429\7{\2\2\u0429\u0109\3\2\2\2\u042a"+
		"\u042b\7|\2\2\u042b\u010b\3\2\2\2\u042c\u042d\7}\2\2\u042d\u010d\3\2\2"+
		"\2\u042e\u042f\7~\2\2\u042f\u010f\3\2\2\2\u0430\u0433\5\u00acW\2\u0431"+
		"\u0433\5\u013a\u009e\2\u0432\u0430\3\2\2\2\u0432\u0431\3\2\2\2\u0433\u0111"+
		"\3\2\2\2\u0434\u0435\5\u0110\u0089\2\u0435\u0113\3\2\2\2\u0436\u0439\7"+
		"!\2\2\u0437\u0438\7\u009e\2\2\u0438\u043a\5\u0110\u0089\2\u0439\u0437"+
		"\3\2\2\2\u0439\u043a\3\2\2\2\u043a\u0115\3\2\2\2\u043b\u043e\7 \2\2\u043c"+
		"\u043d\7\u009e\2\2\u043d\u043f\5\u0110\u0089\2\u043e\u043c\3\2\2\2\u043e"+
		"\u043f\3\2\2\2\u043f\u0117\3\2\2\2\u0440\u0443\7\67\2\2\u0441\u0442\7"+
		"\u009e\2\2\u0442\u0444\5\u0110\u0089\2\u0443\u0441\3\2\2\2\u0443\u0444"+
		"\3\2\2\2\u0444\u0119\3\2\2\2\u0445\u044b\3\2\2\2\u0446\u044b\5\u0114\u008b"+
		"\2\u0447\u044b\5\u0116\u008c\2\u0448\u044b\5\u0118\u008d\2\u0449\u044b"+
		"\5\u0112\u008a\2\u044a\u0445\3\2\2\2\u044a\u0446\3\2\2\2\u044a\u0447\3"+
		"\2\2\2\u044a\u0448\3\2\2\2\u044a\u0449\3\2\2\2\u044b\u011b\3\2\2\2\u044c"+
		"\u044d\7~\2\2\u044d\u011d\3\2\2\2\u044e\u044f\5\u00acW\2\u044f\u011f\3"+
		"\2\2\2\u0450\u0455\5\u011a\u008e\2\u0451\u0452\7\u009d\2\2\u0452\u0454"+
		"\5\u011e\u0090\2\u0453\u0451\3\2\2\2\u0454\u0457\3\2\2\2\u0455\u0453\3"+
		"\2\2\2\u0455\u0456\3\2\2\2\u0456\u0121\3\2\2\2\u0457\u0455\3\2\2\2\u0458"+
		"\u0459\5\u013a\u009e\2\u0459\u0123\3\2\2\2\u045a\u045b\5\u013a\u009e\2"+
		"\u045b\u045c\7\u0098\2\2\u045c\u0125\3\2\2\2\u045d\u0462\5\u0122\u0092"+
		"\2\u045e\u045f\7\u009d\2\2\u045f\u0461\5\u0122\u0092\2\u0460\u045e\3\2"+
		"\2\2\u0461\u0464\3\2\2\2\u0462\u0460\3\2\2\2\u0462\u0463\3\2\2\2\u0463"+
		"\u0467\3\2\2\2\u0464\u0462\3\2\2\2\u0465\u0466\7\u009d\2\2\u0466\u0468"+
		"\5\u0124\u0093\2\u0467\u0465\3\2\2\2\u0467\u0468\3\2\2\2\u0468\u046b\3"+
		"\2\2\2\u0469\u046b\5\u0124\u0093\2\u046a\u045d\3\2\2\2\u046a\u0469\3\2"+
		"\2\2\u046b\u0127\3\2\2\2\u046c\u0473\5\u012a\u0096\2\u046d\u0473\5\u0130"+
		"\u0099\2\u046e\u0473\5\u0132\u009a\2\u046f\u0473\5\u0134\u009b\2\u0470"+
		"\u0473\5\u0136\u009c\2\u0471\u0473\5\u0138\u009d\2\u0472\u046c\3\2\2\2"+
		"\u0472\u046d\3\2\2\2\u0472\u046e\3\2\2\2\u0472\u046f\3\2\2\2\u0472\u0470"+
		"\3\2\2\2\u0472\u0471\3\2\2\2\u0473\u0129\3\2\2\2\u0474\u0477\5\u012c\u0097"+
		"\2\u0475\u0477\5\u012e\u0098\2\u0476\u0474\3\2\2\2\u0476\u0475\3\2\2\2"+
		"\u0477\u012b\3\2\2\2\u0478\u0479\7\u0099\2\2\u0479\u012d\3\2\2\2\u047a"+
		"\u047b\7\u009a\2\2\u047b\u012f\3\2\2\2\u047c\u047d\t\2\2\2\u047d\u0131"+
		"\3\2\2\2\u047e\u047f\7\u009b\2\2\u047f\u0133\3\2\2\2\u0480\u0481\7\u009c"+
		"\2\2\u0481\u0135\3\2\2\2\u0482\u0483\7\u0081\2\2\u0483\u0137\3\2\2\2\u0484"+
		"\u0485\7\u0082\2\2\u0485\u0486\7\u009e\2\2\u0486\u0487\5\u013a\u009e\2"+
		"\u0487\u0139\3\2\2\2\u0488\u0490\5\u013c\u009f\2\u0489\u0490\5\u013e\u00a0"+
		"\2\u048a\u0490\5\u0152\u00aa\2\u048b\u0490\5\u0154\u00ab\2\u048c\u0490"+
		"\5\u015c\u00af\2\u048d\u0490\5\u0162\u00b2\2\u048e\u0490\5\u0164\u00b3"+
		"\2\u048f\u0488\3\2\2\2\u048f\u0489\3\2\2\2\u048f\u048a\3\2\2\2\u048f\u048b"+
		"\3\2\2\2\u048f\u048c\3\2\2\2\u048f\u048d\3\2\2\2\u048f\u048e\3\2\2\2\u0490"+
		"\u013b\3\2\2\2\u0491\u0492\7\u0083\2\2\u0492\u013d\3\2\2\2\u0493\u0494"+
		"\t\3\2\2\u0494\u013f\3\2\2\2\u0495\u0496\5\u00aeX\2\u0496\u0141\3\2\2"+
		"\2\u0497\u0498\7\u008c\2\2\u0498\u0499\5\u013a\u009e\2\u0499\u0143\3\2"+
		"\2\2\u049a\u049b\7 \2\2\u049b\u049c\5\u013a\u009e\2\u049c\u0145\3\2\2"+
		"\2\u049d\u04a0\5\u0142\u00a2\2\u049e\u04a0\5\u0144\u00a3\2\u049f\u049d"+
		"\3\2\2\2\u049f\u049e\3\2\2\2\u04a0\u0147\3\2\2\2\u04a1\u04a3\7\u008d\2"+
		"\2\u04a2\u04a4\5\u0146\u00a4\2\u04a3\u04a2\3\2\2\2\u04a3\u04a4\3\2\2\2"+
		"\u04a4\u0149\3\2\2\2\u04a5\u04a8\5\u013a\u009e\2\u04a6\u04a8\5\u0148\u00a5"+
		"\2\u04a7\u04a5\3\2\2\2\u04a7\u04a6\3\2\2\2\u04a8\u014b\3\2\2\2\u04a9\u04aa"+
		"\7&\2\2\u04aa\u04af\5\u014a\u00a6\2\u04ab\u04ac\7\u009d\2\2\u04ac\u04ae"+
		"\5\u014a\u00a6\2\u04ad\u04ab\3\2\2\2\u04ae\u04b1\3\2\2\2\u04af\u04ad\3"+
		"\2\2\2\u04af\u04b0\3\2\2\2\u04b0\u04b2\3\2\2\2\u04b1\u04af\3\2\2\2\u04b2"+
		"\u04b3\7%\2\2\u04b3\u014d\3\2\2\2\u04b4\u04b5\5\u00aeX\2\u04b5\u04b6\5"+
		"\u014c\u00a7\2\u04b6\u014f\3\2\2\2\u04b7\u04ba\5\u0140\u00a1\2\u04b8\u04ba"+
		"\5\u014e\u00a8\2\u04b9\u04b7\3\2\2\2\u04b9\u04b8\3\2\2\2\u04ba\u0151\3"+
		"\2\2\2\u04bb\u04c0\5\u0150\u00a9\2\u04bc\u04bd\7\u009e\2\2\u04bd\u04bf"+
		"\5\u0150\u00a9\2\u04be\u04bc\3\2\2\2\u04bf\u04c2\3\2\2\2\u04c0\u04be\3"+
		"\2\2\2\u04c0\u04c1\3\2\2\2\u04c1\u0153\3\2\2\2\u04c2\u04c0\3\2\2\2\u04c3"+
		"\u04c4\5\u013e\u00a0\2\u04c4\u04c5\5\u0156\u00ac\2\u04c5\u04ca\3\2\2\2"+
		"\u04c6\u04c7\5\u0152\u00aa\2\u04c7\u04c8\5\u0156\u00ac\2\u04c8\u04ca\3"+
		"\2\2\2\u04c9\u04c3\3\2\2\2\u04c9\u04c6\3\2\2\2\u04ca\u0155\3\2\2\2\u04cb"+
		"\u04cc\7\u008e\2\2\u04cc\u04d1\7\u008f\2\2\u04cd\u04ce\7\u008e\2\2\u04ce"+
		"\u04d0\7\u008f\2\2\u04cf\u04cd\3\2\2\2\u04d0\u04d3\3\2\2\2\u04d1\u04cf"+
		"\3\2\2\2\u04d1\u04d2\3\2\2\2\u04d2\u0157\3\2\2\2\u04d3\u04d1\3\2\2\2\u04d4"+
		"\u04d9\5\u0152\u00aa\2\u04d5\u04d9\5\u013e\u00a0\2\u04d6\u04d9\5\u0154"+
		"\u00ab\2\u04d7\u04d9\5\u0164\u00b3\2\u04d8\u04d4\3\2\2\2\u04d8\u04d5\3"+
		"\2\2\2\u04d8\u04d6\3\2\2\2\u04d8\u04d7\3\2\2\2\u04d9\u0159\3\2\2\2\u04da"+
		"\u04e0\5\u0152\u00aa\2\u04db\u04e0\5\u013e\u00a0\2\u04dc\u04e0\5\u0154"+
		"\u00ab\2\u04dd\u04e0\5\u0164\u00b3\2\u04de\u04e0\5\u0162\u00b2\2\u04df"+
		"\u04da\3\2\2\2\u04df\u04db\3\2\2\2\u04df\u04dc\3\2\2\2\u04df\u04dd\3\2"+
		"\2\2\u04df\u04de\3\2\2\2\u04e0\u015b\3\2\2\2\u04e1\u04e4\5\u0158\u00ad"+
		"\2\u04e2\u04e3\7\61\2\2\u04e3\u04e5\5\u015a\u00ae\2\u04e4\u04e2\3\2\2"+
		"\2\u04e5\u04e6\3\2\2\2\u04e6\u04e4\3\2\2\2\u04e6\u04e7\3\2\2\2\u04e7\u015d"+
		"\3\2\2\2\u04e8\u04ed\5\u0152\u00aa\2\u04e9\u04ed\5\u013e\u00a0\2\u04ea"+
		"\u04ed\5\u0154\u00ab\2\u04eb\u04ed\5\u0164\u00b3\2\u04ec\u04e8\3\2\2\2"+
		"\u04ec\u04e9\3\2\2\2\u04ec\u04ea\3\2\2\2\u04ec\u04eb\3\2\2\2\u04ed\u015f"+
		"\3\2\2\2\u04ee\u04f4\5\u0152\u00aa\2\u04ef\u04f4\5\u013e\u00a0\2\u04f0"+
		"\u04f4\5\u0154\u00ab\2\u04f1\u04f4\5\u0164\u00b3\2\u04f2\u04f4\5\u015c"+
		"\u00af\2\u04f3\u04ee\3\2\2\2\u04f3\u04ef\3\2\2\2\u04f3\u04f0\3\2\2\2\u04f3"+
		"\u04f1\3\2\2\2\u04f3\u04f2\3\2\2\2\u04f4\u0161\3\2\2\2\u04f5\u04f8\5\u015e"+
		"\u00b0\2\u04f6\u04f7\7\62\2\2\u04f7\u04f9\5\u0160\u00b1\2\u04f8\u04f6"+
		"\3\2\2\2\u04f9\u04fa\3\2\2\2\u04fa\u04f8\3\2\2\2\u04fa\u04fb\3\2\2\2\u04fb"+
		"\u0163\3\2\2\2\u04fc\u04fd\7\u0090\2\2\u04fd\u04fe\5\u012c\u0097\2\u04fe"+
		"\u04ff\7\u008d\2\2\u04ff\u0500\5\u012c\u0097\2\u0500\u0165\3\2\2\2\u0501"+
		"\u0502\7\u0091\2\2\u0502\u0503\5\u012c\u0097\2\u0503\u0504\7\u008d\2\2"+
		"\u0504\u0505\5\u012c\u0097\2\u0505\u0167\3\2\2\2\u0506\u0507\7\u0092\2"+
		"\2\u0507\u0508\5\u012c\u0097\2\u0508\u0509\7\u008d\2\2\u0509\u050a\5\u012c"+
		"\u0097\2\u050a\u0169\3\2\2\2\u050b\u050c\7\u0093\2\2\u050c\u050d\5\u012c"+
		"\u0097\2\u050d\u050e\7\u008d\2\2\u050e\u050f\5\u012c\u0097\2\u050f\u016b"+
		"\3\2\2\2\u0510\u0511\7\u0094\2\2\u0511\u0512\5\u012c\u0097\2\u0512\u0513"+
		"\7\u008d\2\2\u0513\u0514\5\u012c\u0097\2\u0514\u016d\3\2\2\2\u0515\u0516"+
		"\7\u0095\2\2\u0516\u016f\3\2\2\2\u0517\u0518\7~\2\2\u0518\u0171\3\2\2"+
		"\2\u0519\u051b\7\u008f\2\2\u051a\u0519\3\2\2\2\u051b\u051c\3\2\2\2\u051c"+
		"\u051a\3\2\2\2\u051c\u051d\3\2\2\2\u051d\u0173\3\2\2\2;\u017e\u01c7\u01d7"+
		"\u0221\u022f\u0253\u0273\u027c\u0283\u02fb\u030f\u0314\u0325\u0349\u0355"+
		"\u035b\u0368\u037d\u038c\u0395\u03a9\u03b1\u03b6\u03bb\u03c0\u03cd\u03fe"+
		"\u040e\u0414\u041a\u0432\u0439\u043e\u0443\u044a\u0455\u0462\u0467\u046a"+
		"\u0472\u0476\u048f\u049f\u04a3\u04a7\u04af\u04b9\u04c0\u04c9\u04d1\u04d8"+
		"\u04df\u04e6\u04ec\u04f3\u04fa\u051c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}