package SJ8Parse;

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
		T__143=144, T__144=145, T__145=146, IdentifierX=147, AT=148, IntegerLiteralX=149, 
		FloatingPointLiteralX=150, CharacterLiteralX=151, StringLiteralX=152, 
		COMMA=153, DOT=154, COLONCOLON=155, WS=156;
	public static final int
		RULE_statement = 0, RULE_expressionStatement = 1, RULE_assignAssignmentStatement = 2, 
		RULE_mulassignAssignmentStatement = 3, RULE_divassignAssignmentStatement = 4, 
		RULE_modassignAssignmentStatement = 5, RULE_addassignAssignmentStatement = 6, 
		RULE_subassignAssignmentStatement = 7, RULE_lshiftassignAssignmentStatement = 8, 
		RULE_rshiftassignAssignmentStatement = 9, RULE_urshiftassignAssignmentStatement = 10, 
		RULE_andassignAssignmentStatement = 11, RULE_xorassignAssignmentStatement = 12, 
		RULE_orassignAssignmentStatement = 13, RULE_assignmentStatement = 14, 
		RULE_positiveLiteralStatement = 15, RULE_negativeLiteralStatement = 16, 
		RULE_normalLiteralStatement = 17, RULE_literalStatement = 18, RULE_castExpressionStatement = 19, 
		RULE_methodInvocationStatement = 20, RULE_fieldAccessStatement = 21, RULE_directThisFieldAccess = 22, 
		RULE_referedFieldAccess = 23, RULE_chainFieldAccess = 24, RULE_fieldAccess = 25, 
		RULE_superFieldAccess = 26, RULE_gtInfixExpressionStatement = 27, RULE_ltInfixExpressionStatement = 28, 
		RULE_equalInfixExpressionStatement = 29, RULE_leInfixExpressionStatement = 30, 
		RULE_geInfixExpressionStatement = 31, RULE_notequalInfixExpressionStatement = 32, 
		RULE_andInfixExpressionStatement = 33, RULE_orInfixExpressionStatement = 34, 
		RULE_addInfixExpressionStatement = 35, RULE_subInfixExpressionStatement = 36, 
		RULE_mulInfixExpressionStatement = 37, RULE_divInfixExpressionStatement = 38, 
		RULE_bitandInfixExpressionStatement = 39, RULE_bitorInfixExpressionStatement = 40, 
		RULE_caretInfixExpressionStatement = 41, RULE_modInfixExpressionStatement = 42, 
		RULE_lshiftInfixExpressionStatement = 43, RULE_rshiftInfixExpressionStatement = 44, 
		RULE_urshiftInfixExpressionStatement = 45, RULE_infixExpressionStatement = 46, 
		RULE_instanceofExpressionStatement = 47, RULE_methodReferenceStatement = 48, 
		RULE_nameStatement = 49, RULE_bangPrefixExpressionStatement = 50, RULE_tildePrefixExpressionStatement = 51, 
		RULE_incPrefixExpressionStatement = 52, RULE_decPrefixExpressionStatement = 53, 
		RULE_addPrefixExpressionStatement = 54, RULE_subPrefixExpressionStatement = 55, 
		RULE_addPrefixExpression = 56, RULE_subPrefixExpression = 57, RULE_prefixExpressionStatement = 58, 
		RULE_incPostfixExpressionStatement = 59, RULE_decPostfixExpressionStatement = 60, 
		RULE_postfixExpressionStatement = 61, RULE_arrayAccessStatement = 62, 
		RULE_referedExpression = 63, RULE_identifier = 64, RULE_anonymousClassBeginStatement = 65, 
		RULE_anonymousClassPlaceHolderStatement = 66, RULE_anonymousClassPreStatement = 67, 
		RULE_atInterfaceStatement = 68, RULE_annotationTypeMemberDeclarationStatement = 69, 
		RULE_classDeclarationStatement = 70, RULE_classInnerDeclarationStatement = 71, 
		RULE_enumDeclarationStatement = 72, RULE_methodDeclarationStatement = 73, 
		RULE_constructionDeclarationStatement = 74, RULE_enumConstantDeclarationStatement = 75, 
		RULE_labeledStatement = 76, RULE_variableDeclarationStatement = 77, RULE_lambdaExpressionStatement = 78, 
		RULE_breakStatement = 79, RULE_continueStatement = 80, RULE_doWhileStatement = 81, 
		RULE_whileStatement = 82, RULE_returnStatement = 83, RULE_switchStatement = 84, 
		RULE_switchCaseStatement = 85, RULE_defaultStatement = 86, RULE_synchronizedStatement = 87, 
		RULE_tryStatement = 88, RULE_throwStatement = 89, RULE_catchClauseStatement = 90, 
		RULE_finallyStatement = 91, RULE_ifStatement = 92, RULE_thenStatement = 93, 
		RULE_elseStatement = 94, RULE_arrayCreationStatement = 95, RULE_initializerStatement = 96, 
		RULE_variableDeclarationHolderStatement = 97, RULE_enhancedForStatement = 98, 
		RULE_partialEndArrayAccessStatement = 99, RULE_leftParentheseStatement = 100, 
		RULE_rightParentheseStatement = 101, RULE_leftBraceStatement = 102, RULE_rightBraceStatement = 103, 
		RULE_enterMethodParamStatement = 104, RULE_arrayInitializerStartStatement = 105, 
		RULE_arrayInitializerSplitCommaStatement = 106, RULE_arrayInitializerEndStatement = 107, 
		RULE_enumConstantDeclarationSplitCommaStatement = 108, RULE_forStatement = 109, 
		RULE_forIniOverStatement = 110, RULE_forExpOverStatement = 111, RULE_forUpdOverStatement = 112, 
		RULE_condExpBeginStatement = 113, RULE_condExpQuestionMarkStatement = 114, 
		RULE_condExpColonMarkStatement = 115, RULE_partialEndStatement = 116, 
		RULE_fullEndStatement = 117, RULE_partialMethodArgumentEndStatement = 118, 
		RULE_partialMethodPreRerferedExpressionEndStatement = 119, RULE_firstArgPreExist = 120, 
		RULE_firstArgReferedExpression = 121, RULE_commonClassMemberInvoke = 122, 
		RULE_selfClassMemberInvoke = 123, RULE_superClassMemberInvoke = 124, RULE_newClassInvoke = 125, 
		RULE_firstArg = 126, RULE_methodArgPreExist = 127, RULE_methodArgReferedExpression = 128, 
		RULE_argumentList = 129, RULE_argTypeList = 130, RULE_literal = 131, RULE_numberLiteral = 132, 
		RULE_integerLiteral = 133, RULE_floatingPointLiteral = 134, RULE_booleanLiteral = 135, 
		RULE_characterLiteral = 136, RULE_stringLiteral = 137, RULE_nullLiteral = 138, 
		RULE_typeLiteral = 139, RULE_type = 140, RULE_virtualInferredType = 141, 
		RULE_primitiveType = 142, RULE_simpleType = 143, RULE_extendBound = 144, 
		RULE_superBound = 145, RULE_wildcardBounds = 146, RULE_wildCardType = 147, 
		RULE_typeArgument = 148, RULE_typeArguments = 149, RULE_parameterizedType = 150, 
		RULE_bothType = 151, RULE_classOrInterfaceType = 152, RULE_arrayType = 153, 
		RULE_dims = 154, RULE_intersectionFirstType = 155, RULE_intersectionSecondType = 156, 
		RULE_intersectionType = 157, RULE_unionFirstType = 158, RULE_unionSecondType = 159, 
		RULE_unionType = 160, RULE_classRef = 161, RULE_finalFieldRef = 162, RULE_finalVarRef = 163, 
		RULE_commonFieldRef = 164, RULE_commonVarRef = 165, RULE_thisExpression = 166, 
		RULE_codeHole = 167, RULE_preExist = 168, RULE_endOfArrayDeclarationIndexExpression = 169;
	public static final String[] ruleNames = {
		"statement", "expressionStatement", "assignAssignmentStatement", "mulassignAssignmentStatement", 
		"divassignAssignmentStatement", "modassignAssignmentStatement", "addassignAssignmentStatement", 
		"subassignAssignmentStatement", "lshiftassignAssignmentStatement", "rshiftassignAssignmentStatement", 
		"urshiftassignAssignmentStatement", "andassignAssignmentStatement", "xorassignAssignmentStatement", 
		"orassignAssignmentStatement", "assignmentStatement", "positiveLiteralStatement", 
		"negativeLiteralStatement", "normalLiteralStatement", "literalStatement", 
		"castExpressionStatement", "methodInvocationStatement", "fieldAccessStatement", 
		"directThisFieldAccess", "referedFieldAccess", "chainFieldAccess", "fieldAccess", 
		"superFieldAccess", "gtInfixExpressionStatement", "ltInfixExpressionStatement", 
		"equalInfixExpressionStatement", "leInfixExpressionStatement", "geInfixExpressionStatement", 
		"notequalInfixExpressionStatement", "andInfixExpressionStatement", "orInfixExpressionStatement", 
		"addInfixExpressionStatement", "subInfixExpressionStatement", "mulInfixExpressionStatement", 
		"divInfixExpressionStatement", "bitandInfixExpressionStatement", "bitorInfixExpressionStatement", 
		"caretInfixExpressionStatement", "modInfixExpressionStatement", "lshiftInfixExpressionStatement", 
		"rshiftInfixExpressionStatement", "urshiftInfixExpressionStatement", "infixExpressionStatement", 
		"instanceofExpressionStatement", "methodReferenceStatement", "nameStatement", 
		"bangPrefixExpressionStatement", "tildePrefixExpressionStatement", "incPrefixExpressionStatement", 
		"decPrefixExpressionStatement", "addPrefixExpressionStatement", "subPrefixExpressionStatement", 
		"addPrefixExpression", "subPrefixExpression", "prefixExpressionStatement", 
		"incPostfixExpressionStatement", "decPostfixExpressionStatement", "postfixExpressionStatement", 
		"arrayAccessStatement", "referedExpression", "identifier", "anonymousClassBeginStatement", 
		"anonymousClassPlaceHolderStatement", "anonymousClassPreStatement", "atInterfaceStatement", 
		"annotationTypeMemberDeclarationStatement", "classDeclarationStatement", 
		"classInnerDeclarationStatement", "enumDeclarationStatement", "methodDeclarationStatement", 
		"constructionDeclarationStatement", "enumConstantDeclarationStatement", 
		"labeledStatement", "variableDeclarationStatement", "lambdaExpressionStatement", 
		"breakStatement", "continueStatement", "doWhileStatement", "whileStatement", 
		"returnStatement", "switchStatement", "switchCaseStatement", "defaultStatement", 
		"synchronizedStatement", "tryStatement", "throwStatement", "catchClauseStatement", 
		"finallyStatement", "ifStatement", "thenStatement", "elseStatement", "arrayCreationStatement", 
		"initializerStatement", "variableDeclarationHolderStatement", "enhancedForStatement", 
		"partialEndArrayAccessStatement", "leftParentheseStatement", "rightParentheseStatement", 
		"leftBraceStatement", "rightBraceStatement", "enterMethodParamStatement", 
		"arrayInitializerStartStatement", "arrayInitializerSplitCommaStatement", 
		"arrayInitializerEndStatement", "enumConstantDeclarationSplitCommaStatement", 
		"forStatement", "forIniOverStatement", "forExpOverStatement", "forUpdOverStatement", 
		"condExpBeginStatement", "condExpQuestionMarkStatement", "condExpColonMarkStatement", 
		"partialEndStatement", "fullEndStatement", "partialMethodArgumentEndStatement", 
		"partialMethodPreRerferedExpressionEndStatement", "firstArgPreExist", 
		"firstArgReferedExpression", "commonClassMemberInvoke", "selfClassMemberInvoke", 
		"superClassMemberInvoke", "newClassInvoke", "firstArg", "methodArgPreExist", 
		"methodArgReferedExpression", "argumentList", "argTypeList", "literal", 
		"numberLiteral", "integerLiteral", "floatingPointLiteral", "booleanLiteral", 
		"characterLiteral", "stringLiteral", "nullLiteral", "typeLiteral", "type", 
		"virtualInferredType", "primitiveType", "simpleType", "extendBound", "superBound", 
		"wildcardBounds", "wildCardType", "typeArgument", "typeArguments", "parameterizedType", 
		"bothType", "classOrInterfaceType", "arrayType", "dims", "intersectionFirstType", 
		"intersectionSecondType", "intersectionType", "unionFirstType", "unionSecondType", 
		"unionType", "classRef", "finalFieldRef", "finalVarRef", "commonFieldRef", 
		"commonVarRef", "thisExpression", "codeHole", "preExist", "endOfArrayDeclarationIndexExpression"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'A@'", "'='", "'*='", "'/='", "'%='", "'+='", "'-='", "'<<='", 
		"'>>='", "'>>>='", "'&='", "'^='", "'|='", "'L@+'", "'L@-'", "'L@'", "'CE@'", 
		"'('", "')'", "'MI@'", "'FA@'", "'this'", "'super'", "'IxE@'", "'>'", 
		"'<'", "'=='", "'<='", "'>='", "'!='", "'&&'", "'||'", "'+'", "'-'", "'*'", 
		"'/'", "'&'", "'|'", "'^'", "'%'", "'InE@'", "'instanceof'", "'MR@'", 
		"'N@'", "'PeE@'", "'!'", "'~'", "'++'", "'--'", "'PtE@'", "'[@'", "'AB@AnonymousBegin'", 
		"'DH@AnonymousDeclaration'", "'HT@'", "'AT@'", "'AM@'", "'default'", "'CD@'", 
		"'ICD@'", "'ED@'", "'MD@'", "'CR@'", "'EMD@'", "'LD@'", "'VD@'", "'LE@'", 
		"'->'", "'{}'", "'B@'", "'break'", "'C@'", "'continue'", "'DW@'", "'while'", 
		"'WS@'", "'RT@'", "'return'", "'SW@'", "'switch'", "'CS@'", "'case'", 
		"'DF@'", "'SC@'", "'synchronized'", "'DH@try'", "'TS@'", "'throw'", "'CT@'", 
		"'catch'", "'DH@finally'", "'IF@'", "'if'", "'DH@then'", "'DH@else'", 
		"'AC@'", "'(new)'", "'IB@'", "'InitialBlock'", "'VH@'", "'EF@'", "'for('", 
		"':'", "'DH@'", "'{'", "'}'", "'@Em'", "'DH@A{'", "'DH@A,'", "'DH@A}'", 
		"'DH@E,'", "'DH@for'", "'DH@forIniOver'", "'DH@forExpOver'", "'DH@forUpdOver'", 
		"'DH@CondExpBegin'", "'DH@CondExpQM'", "'DH@CondExpCM'", "'DH@,'", "'DH@;'", 
		"'DH@Ps'", "'DH@Pr'", "'@PE'", "'new'", "'true'", "'false'", "'null'", 
		"'class'", "'@IT'", "'float'", "'double'", "'boolean'", "'byte'", "'short'", 
		"'int'", "'long'", "'char'", "'extends'", "'?'", "'['", "']'", "'@K'", 
		"'@D'", "'@X'", "'@F'", "'@C'", "'@HO'", null, "'@'", null, null, null, 
		null, "','", "'.'", "'::'"
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
		null, null, null, "IdentifierX", "AT", "IntegerLiteralX", "FloatingPointLiteralX", 
		"CharacterLiteralX", "StringLiteralX", "COMMA", "DOT", "COLONCOLON", "WS"
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
		public LambdaExpressionStatementContext lambdaExpressionStatement() {
			return getRuleContext(LambdaExpressionStatementContext.class,0);
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
		public LeftBraceStatementContext leftBraceStatement() {
			return getRuleContext(LeftBraceStatementContext.class,0);
		}
		public RightBraceStatementContext rightBraceStatement() {
			return getRuleContext(RightBraceStatementContext.class,0);
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
		public ForIniOverStatementContext forIniOverStatement() {
			return getRuleContext(ForIniOverStatementContext.class,0);
		}
		public ForExpOverStatementContext forExpOverStatement() {
			return getRuleContext(ForExpOverStatementContext.class,0);
		}
		public ForUpdOverStatementContext forUpdOverStatement() {
			return getRuleContext(ForUpdOverStatementContext.class,0);
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
		public FullEndStatementContext fullEndStatement() {
			return getRuleContext(FullEndStatementContext.class,0);
		}
		public PartialMethodArgumentEndStatementContext partialMethodArgumentEndStatement() {
			return getRuleContext(PartialMethodArgumentEndStatementContext.class,0);
		}
		public PartialMethodPreRerferedExpressionEndStatementContext partialMethodPreRerferedExpressionEndStatement() {
			return getRuleContext(PartialMethodPreRerferedExpressionEndStatementContext.class,0);
		}
		public ExpressionStatementContext expressionStatement() {
			return getRuleContext(ExpressionStatementContext.class,0);
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
			setState(396);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(340);
				anonymousClassBeginStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(341);
				anonymousClassPlaceHolderStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(342);
				anonymousClassPreStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(343);
				atInterfaceStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(344);
				annotationTypeMemberDeclarationStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(345);
				classDeclarationStatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(346);
				classInnerDeclarationStatement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(347);
				enumDeclarationStatement();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(348);
				methodDeclarationStatement();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(349);
				constructionDeclarationStatement();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(350);
				enumConstantDeclarationStatement();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(351);
				labeledStatement();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(352);
				variableDeclarationStatement();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(353);
				lambdaExpressionStatement();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(354);
				breakStatement();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(355);
				continueStatement();
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(356);
				doWhileStatement();
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(357);
				whileStatement();
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(358);
				returnStatement();
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(359);
				switchStatement();
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(360);
				switchCaseStatement();
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(361);
				defaultStatement();
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(362);
				synchronizedStatement();
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(363);
				tryStatement();
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(364);
				throwStatement();
				}
				break;
			case 26:
				enterOuterAlt(_localctx, 26);
				{
				setState(365);
				catchClauseStatement();
				}
				break;
			case 27:
				enterOuterAlt(_localctx, 27);
				{
				setState(366);
				finallyStatement();
				}
				break;
			case 28:
				enterOuterAlt(_localctx, 28);
				{
				setState(367);
				ifStatement();
				}
				break;
			case 29:
				enterOuterAlt(_localctx, 29);
				{
				setState(368);
				thenStatement();
				}
				break;
			case 30:
				enterOuterAlt(_localctx, 30);
				{
				setState(369);
				elseStatement();
				}
				break;
			case 31:
				enterOuterAlt(_localctx, 31);
				{
				setState(370);
				arrayCreationStatement();
				}
				break;
			case 32:
				enterOuterAlt(_localctx, 32);
				{
				setState(371);
				initializerStatement();
				}
				break;
			case 33:
				enterOuterAlt(_localctx, 33);
				{
				setState(372);
				variableDeclarationHolderStatement();
				}
				break;
			case 34:
				enterOuterAlt(_localctx, 34);
				{
				setState(373);
				enhancedForStatement();
				}
				break;
			case 35:
				enterOuterAlt(_localctx, 35);
				{
				setState(374);
				partialEndArrayAccessStatement();
				}
				break;
			case 36:
				enterOuterAlt(_localctx, 36);
				{
				setState(375);
				leftParentheseStatement();
				}
				break;
			case 37:
				enterOuterAlt(_localctx, 37);
				{
				setState(376);
				rightParentheseStatement();
				}
				break;
			case 38:
				enterOuterAlt(_localctx, 38);
				{
				setState(377);
				leftBraceStatement();
				}
				break;
			case 39:
				enterOuterAlt(_localctx, 39);
				{
				setState(378);
				rightBraceStatement();
				}
				break;
			case 40:
				enterOuterAlt(_localctx, 40);
				{
				setState(379);
				enterMethodParamStatement();
				}
				break;
			case 41:
				enterOuterAlt(_localctx, 41);
				{
				setState(380);
				arrayInitializerStartStatement();
				}
				break;
			case 42:
				enterOuterAlt(_localctx, 42);
				{
				setState(381);
				arrayInitializerSplitCommaStatement();
				}
				break;
			case 43:
				enterOuterAlt(_localctx, 43);
				{
				setState(382);
				arrayInitializerEndStatement();
				}
				break;
			case 44:
				enterOuterAlt(_localctx, 44);
				{
				setState(383);
				enumConstantDeclarationSplitCommaStatement();
				}
				break;
			case 45:
				enterOuterAlt(_localctx, 45);
				{
				setState(384);
				forStatement();
				}
				break;
			case 46:
				enterOuterAlt(_localctx, 46);
				{
				setState(385);
				forIniOverStatement();
				}
				break;
			case 47:
				enterOuterAlt(_localctx, 47);
				{
				setState(386);
				forExpOverStatement();
				}
				break;
			case 48:
				enterOuterAlt(_localctx, 48);
				{
				setState(387);
				forUpdOverStatement();
				}
				break;
			case 49:
				enterOuterAlt(_localctx, 49);
				{
				setState(388);
				condExpBeginStatement();
				}
				break;
			case 50:
				enterOuterAlt(_localctx, 50);
				{
				setState(389);
				condExpQuestionMarkStatement();
				}
				break;
			case 51:
				enterOuterAlt(_localctx, 51);
				{
				setState(390);
				condExpColonMarkStatement();
				}
				break;
			case 52:
				enterOuterAlt(_localctx, 52);
				{
				setState(391);
				partialEndStatement();
				}
				break;
			case 53:
				enterOuterAlt(_localctx, 53);
				{
				setState(392);
				fullEndStatement();
				}
				break;
			case 54:
				enterOuterAlt(_localctx, 54);
				{
				setState(393);
				partialMethodArgumentEndStatement();
				}
				break;
			case 55:
				enterOuterAlt(_localctx, 55);
				{
				setState(394);
				partialMethodPreRerferedExpressionEndStatement();
				}
				break;
			case 56:
				enterOuterAlt(_localctx, 56);
				{
				setState(395);
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
		enterRule(_localctx, 2, RULE_expressionStatement);
		try {
			setState(410);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(398);
				assignmentStatement();
				}
				break;
			case T__13:
			case T__14:
			case T__15:
				enterOuterAlt(_localctx, 2);
				{
				setState(399);
				literalStatement();
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 3);
				{
				setState(400);
				castExpressionStatement();
				}
				break;
			case T__19:
				enterOuterAlt(_localctx, 4);
				{
				setState(401);
				methodInvocationStatement();
				}
				break;
			case T__20:
				enterOuterAlt(_localctx, 5);
				{
				setState(402);
				fieldAccessStatement();
				}
				break;
			case T__23:
				enterOuterAlt(_localctx, 6);
				{
				setState(403);
				infixExpressionStatement();
				}
				break;
			case T__40:
				enterOuterAlt(_localctx, 7);
				{
				setState(404);
				instanceofExpressionStatement();
				}
				break;
			case T__42:
				enterOuterAlt(_localctx, 8);
				{
				setState(405);
				methodReferenceStatement();
				}
				break;
			case T__43:
				enterOuterAlt(_localctx, 9);
				{
				setState(406);
				nameStatement();
				}
				break;
			case T__44:
				enterOuterAlt(_localctx, 10);
				{
				setState(407);
				prefixExpressionStatement();
				}
				break;
			case T__49:
				enterOuterAlt(_localctx, 11);
				{
				setState(408);
				postfixExpressionStatement();
				}
				break;
			case T__50:
				enterOuterAlt(_localctx, 12);
				{
				setState(409);
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
		enterRule(_localctx, 4, RULE_assignAssignmentStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(412);
			match(T__0);
			setState(413);
			referedExpression();
			setState(414);
			match(T__1);
			setState(415);
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
		enterRule(_localctx, 6, RULE_mulassignAssignmentStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(417);
			match(T__0);
			setState(418);
			referedExpression();
			setState(419);
			match(T__2);
			setState(420);
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
		enterRule(_localctx, 8, RULE_divassignAssignmentStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(422);
			match(T__0);
			setState(423);
			referedExpression();
			setState(424);
			match(T__3);
			setState(425);
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
		enterRule(_localctx, 10, RULE_modassignAssignmentStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(427);
			match(T__0);
			setState(428);
			referedExpression();
			setState(429);
			match(T__4);
			setState(430);
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
		enterRule(_localctx, 12, RULE_addassignAssignmentStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(432);
			match(T__0);
			setState(433);
			referedExpression();
			setState(434);
			match(T__5);
			setState(435);
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
		enterRule(_localctx, 14, RULE_subassignAssignmentStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(437);
			match(T__0);
			setState(438);
			referedExpression();
			setState(439);
			match(T__6);
			setState(440);
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
		enterRule(_localctx, 16, RULE_lshiftassignAssignmentStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(442);
			match(T__0);
			setState(443);
			referedExpression();
			setState(444);
			match(T__7);
			setState(445);
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
		enterRule(_localctx, 18, RULE_rshiftassignAssignmentStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(447);
			match(T__0);
			setState(448);
			referedExpression();
			setState(449);
			match(T__8);
			setState(450);
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
		enterRule(_localctx, 20, RULE_urshiftassignAssignmentStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(452);
			match(T__0);
			setState(453);
			referedExpression();
			setState(454);
			match(T__9);
			setState(455);
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
		enterRule(_localctx, 22, RULE_andassignAssignmentStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(457);
			match(T__0);
			setState(458);
			referedExpression();
			setState(459);
			match(T__10);
			setState(460);
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
		enterRule(_localctx, 24, RULE_xorassignAssignmentStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(462);
			match(T__0);
			setState(463);
			referedExpression();
			setState(464);
			match(T__11);
			setState(465);
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
		enterRule(_localctx, 26, RULE_orassignAssignmentStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(467);
			match(T__0);
			setState(468);
			referedExpression();
			setState(469);
			match(T__12);
			setState(470);
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
		enterRule(_localctx, 28, RULE_assignmentStatement);
		try {
			setState(484);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(472);
				assignAssignmentStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(473);
				mulassignAssignmentStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(474);
				divassignAssignmentStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(475);
				modassignAssignmentStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(476);
				addassignAssignmentStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(477);
				subassignAssignmentStatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(478);
				lshiftassignAssignmentStatement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(479);
				rshiftassignAssignmentStatement();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(480);
				urshiftassignAssignmentStatement();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(481);
				andassignAssignmentStatement();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(482);
				xorassignAssignmentStatement();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(483);
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
		enterRule(_localctx, 30, RULE_positiveLiteralStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(486);
			match(T__13);
			setState(487);
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
		enterRule(_localctx, 32, RULE_negativeLiteralStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(489);
			match(T__14);
			setState(490);
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
		enterRule(_localctx, 34, RULE_normalLiteralStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(492);
			match(T__15);
			setState(493);
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
		enterRule(_localctx, 36, RULE_literalStatement);
		try {
			setState(498);
			switch (_input.LA(1)) {
			case T__15:
				enterOuterAlt(_localctx, 1);
				{
				setState(495);
				normalLiteralStatement();
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 2);
				{
				setState(496);
				negativeLiteralStatement();
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 3);
				{
				setState(497);
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
		enterRule(_localctx, 38, RULE_castExpressionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(500);
			match(T__16);
			setState(501);
			match(T__17);
			setState(502);
			type();
			setState(503);
			match(T__18);
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

	public static class MethodInvocationStatementContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
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
		enterRule(_localctx, 40, RULE_methodInvocationStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(506);
			match(T__19);
			setState(507);
			identifier();
			setState(508);
			match(T__17);
			setState(509);
			argumentList();
			setState(510);
			match(T__18);
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
		enterRule(_localctx, 42, RULE_fieldAccessStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(512);
			match(T__20);
			setState(513);
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

	public static class DirectThisFieldAccessContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public DirectThisFieldAccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_directThisFieldAccess; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterDirectThisFieldAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitDirectThisFieldAccess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitDirectThisFieldAccess(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DirectThisFieldAccessContext directThisFieldAccess() throws RecognitionException {
		DirectThisFieldAccessContext _localctx = new DirectThisFieldAccessContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_directThisFieldAccess);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(515);
			match(T__21);
			setState(516);
			match(DOT);
			setState(517);
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
		enterRule(_localctx, 46, RULE_referedFieldAccess);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(519);
			identifier();
			setState(520);
			match(DOT);
			setState(521);
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
		enterRule(_localctx, 48, RULE_chainFieldAccess);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(523);
			identifier();
			setState(524);
			match(DOT);
			setState(525);
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

	public static class FieldAccessContext extends ParserRuleContext {
		public ChainFieldAccessContext chainFieldAccess() {
			return getRuleContext(ChainFieldAccessContext.class,0);
		}
		public CommonFieldRefContext commonFieldRef() {
			return getRuleContext(CommonFieldRefContext.class,0);
		}
		public DirectThisFieldAccessContext directThisFieldAccess() {
			return getRuleContext(DirectThisFieldAccessContext.class,0);
		}
		public ReferedFieldAccessContext referedFieldAccess() {
			return getRuleContext(ReferedFieldAccessContext.class,0);
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
		enterRule(_localctx, 50, RULE_fieldAccess);
		try {
			setState(531);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(527);
				chainFieldAccess();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(528);
				commonFieldRef();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(529);
				directThisFieldAccess();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(530);
				referedFieldAccess();
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
		enterRule(_localctx, 52, RULE_superFieldAccess);
		try {
			setState(549);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(533);
				identifier();
				setState(534);
				match(DOT);
				setState(535);
				match(T__22);
				setState(536);
				match(DOT);
				setState(537);
				referedExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(539);
				identifier();
				setState(540);
				match(DOT);
				setState(541);
				match(T__22);
				setState(542);
				match(DOT);
				setState(543);
				type();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(545);
				identifier();
				setState(546);
				match(DOT);
				setState(547);
				match(T__22);
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
		enterRule(_localctx, 54, RULE_gtInfixExpressionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(551);
			match(T__23);
			setState(552);
			referedExpression();
			setState(553);
			match(T__24);
			setState(554);
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
		enterRule(_localctx, 56, RULE_ltInfixExpressionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(556);
			match(T__23);
			setState(557);
			referedExpression();
			setState(558);
			match(T__25);
			setState(559);
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
		enterRule(_localctx, 58, RULE_equalInfixExpressionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(561);
			match(T__23);
			setState(562);
			referedExpression();
			setState(563);
			match(T__26);
			setState(564);
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
		enterRule(_localctx, 60, RULE_leInfixExpressionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(566);
			match(T__23);
			setState(567);
			referedExpression();
			setState(568);
			match(T__27);
			setState(569);
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
		enterRule(_localctx, 62, RULE_geInfixExpressionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(571);
			match(T__23);
			setState(572);
			referedExpression();
			setState(573);
			match(T__28);
			setState(574);
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
		enterRule(_localctx, 64, RULE_notequalInfixExpressionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(576);
			match(T__23);
			setState(577);
			referedExpression();
			setState(578);
			match(T__29);
			setState(579);
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
		enterRule(_localctx, 66, RULE_andInfixExpressionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(581);
			match(T__23);
			setState(582);
			referedExpression();
			setState(583);
			match(T__30);
			setState(584);
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
		enterRule(_localctx, 68, RULE_orInfixExpressionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(586);
			match(T__23);
			setState(587);
			referedExpression();
			setState(588);
			match(T__31);
			setState(589);
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
		enterRule(_localctx, 70, RULE_addInfixExpressionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(591);
			match(T__23);
			setState(592);
			referedExpression();
			setState(593);
			match(T__32);
			setState(594);
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
		enterRule(_localctx, 72, RULE_subInfixExpressionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(596);
			match(T__23);
			setState(597);
			referedExpression();
			setState(598);
			match(T__33);
			setState(599);
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
		enterRule(_localctx, 74, RULE_mulInfixExpressionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(601);
			match(T__23);
			setState(602);
			referedExpression();
			setState(603);
			match(T__34);
			setState(604);
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
		enterRule(_localctx, 76, RULE_divInfixExpressionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(606);
			match(T__23);
			setState(607);
			referedExpression();
			setState(608);
			match(T__35);
			setState(609);
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
		enterRule(_localctx, 78, RULE_bitandInfixExpressionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(611);
			match(T__23);
			setState(612);
			referedExpression();
			setState(613);
			match(T__36);
			setState(614);
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
		enterRule(_localctx, 80, RULE_bitorInfixExpressionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(616);
			match(T__23);
			setState(617);
			referedExpression();
			setState(618);
			match(T__37);
			setState(619);
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
		enterRule(_localctx, 82, RULE_caretInfixExpressionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(621);
			match(T__23);
			setState(622);
			referedExpression();
			setState(623);
			match(T__38);
			setState(624);
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
		enterRule(_localctx, 84, RULE_modInfixExpressionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(626);
			match(T__23);
			setState(627);
			referedExpression();
			setState(628);
			match(T__39);
			setState(629);
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
		enterRule(_localctx, 86, RULE_lshiftInfixExpressionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(631);
			match(T__23);
			setState(632);
			referedExpression();
			setState(633);
			match(T__25);
			setState(634);
			match(T__25);
			setState(635);
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
		enterRule(_localctx, 88, RULE_rshiftInfixExpressionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(637);
			match(T__23);
			setState(638);
			referedExpression();
			setState(639);
			match(T__24);
			setState(640);
			match(T__24);
			setState(641);
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
		enterRule(_localctx, 90, RULE_urshiftInfixExpressionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(643);
			match(T__23);
			setState(644);
			referedExpression();
			setState(645);
			match(T__24);
			setState(646);
			match(T__24);
			setState(647);
			match(T__24);
			setState(648);
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
		enterRule(_localctx, 92, RULE_infixExpressionStatement);
		try {
			setState(669);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(650);
				gtInfixExpressionStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(651);
				ltInfixExpressionStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(652);
				equalInfixExpressionStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(653);
				leInfixExpressionStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(654);
				geInfixExpressionStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(655);
				notequalInfixExpressionStatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(656);
				andInfixExpressionStatement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(657);
				orInfixExpressionStatement();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(658);
				addInfixExpressionStatement();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(659);
				subInfixExpressionStatement();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(660);
				mulInfixExpressionStatement();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(661);
				divInfixExpressionStatement();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(662);
				bitandInfixExpressionStatement();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(663);
				bitorInfixExpressionStatement();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(664);
				caretInfixExpressionStatement();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(665);
				modInfixExpressionStatement();
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(666);
				lshiftInfixExpressionStatement();
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(667);
				rshiftInfixExpressionStatement();
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(668);
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
		enterRule(_localctx, 94, RULE_instanceofExpressionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(671);
			match(T__40);
			setState(672);
			referedExpression();
			setState(673);
			match(T__41);
			setState(674);
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

	public static class MethodReferenceStatementContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ReferedExpressionContext referedExpression() {
			return getRuleContext(ReferedExpressionContext.class,0);
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
		enterRule(_localctx, 96, RULE_methodReferenceStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(676);
			match(T__42);
			setState(677);
			identifier();
			setState(678);
			match(COLONCOLON);
			setState(679);
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

	public static class NameStatementContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
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
		enterRule(_localctx, 98, RULE_nameStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(681);
			match(T__43);
			setState(682);
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
		enterRule(_localctx, 100, RULE_bangPrefixExpressionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(684);
			match(T__44);
			setState(685);
			match(T__45);
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
		enterRule(_localctx, 102, RULE_tildePrefixExpressionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(688);
			match(T__44);
			setState(689);
			match(T__46);
			setState(690);
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
		enterRule(_localctx, 104, RULE_incPrefixExpressionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(692);
			match(T__44);
			setState(693);
			match(T__47);
			setState(694);
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
		enterRule(_localctx, 106, RULE_decPrefixExpressionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(696);
			match(T__44);
			setState(697);
			match(T__48);
			setState(698);
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
		enterRule(_localctx, 108, RULE_addPrefixExpressionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(700);
			match(T__44);
			setState(701);
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
		enterRule(_localctx, 110, RULE_subPrefixExpressionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(703);
			match(T__44);
			setState(704);
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
		enterRule(_localctx, 112, RULE_addPrefixExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(706);
			match(T__32);
			setState(707);
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
		enterRule(_localctx, 114, RULE_subPrefixExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(709);
			match(T__33);
			setState(710);
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
		enterRule(_localctx, 116, RULE_prefixExpressionStatement);
		try {
			setState(718);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(712);
				bangPrefixExpressionStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(713);
				tildePrefixExpressionStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(714);
				incPrefixExpressionStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(715);
				decPrefixExpressionStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(716);
				addPrefixExpressionStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(717);
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
		enterRule(_localctx, 118, RULE_incPostfixExpressionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(720);
			match(T__49);
			setState(721);
			referedExpression();
			setState(722);
			match(T__47);
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
		enterRule(_localctx, 120, RULE_decPostfixExpressionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(724);
			match(T__49);
			setState(725);
			referedExpression();
			setState(726);
			match(T__48);
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
		enterRule(_localctx, 122, RULE_postfixExpressionStatement);
		try {
			setState(730);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(728);
				incPostfixExpressionStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(729);
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
		enterRule(_localctx, 124, RULE_arrayAccessStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(732);
			match(T__50);
			setState(733);
			referedExpression();
			setState(734);
			referedExpression();
			setState(736);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(735);
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
		public ThisExpressionContext thisExpression() {
			return getRuleContext(ThisExpressionContext.class,0);
		}
		public SuperFieldAccessContext superFieldAccess() {
			return getRuleContext(SuperFieldAccessContext.class,0);
		}
		public AddPrefixExpressionContext addPrefixExpression() {
			return getRuleContext(AddPrefixExpressionContext.class,0);
		}
		public SubPrefixExpressionContext subPrefixExpression() {
			return getRuleContext(SubPrefixExpressionContext.class,0);
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
		enterRule(_localctx, 126, RULE_referedExpression);
		try {
			setState(750);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(738);
				identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(739);
				fieldAccess();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(740);
				literal();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(741);
				codeHole();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(742);
				preExist();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(743);
				finalFieldRef();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(744);
				finalVarRef();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(745);
				commonVarRef();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(746);
				thisExpression();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(747);
				superFieldAccess();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(748);
				addPrefixExpression();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(749);
				subPrefixExpression();
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
		enterRule(_localctx, 128, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(752);
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
		enterRule(_localctx, 130, RULE_anonymousClassBeginStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(754);
			match(T__51);
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
		enterRule(_localctx, 132, RULE_anonymousClassPlaceHolderStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(756);
			match(T__52);
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
		enterRule(_localctx, 134, RULE_anonymousClassPreStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(758);
			match(T__53);
			setState(759);
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
		enterRule(_localctx, 136, RULE_atInterfaceStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(761);
			match(T__54);
			setState(762);
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
		enterRule(_localctx, 138, RULE_annotationTypeMemberDeclarationStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(764);
			match(T__55);
			setState(765);
			type();
			setState(766);
			identifier();
			setState(767);
			match(T__17);
			setState(768);
			match(T__18);
			setState(771);
			_la = _input.LA(1);
			if (_la==T__56) {
				{
				setState(769);
				match(T__56);
				setState(770);
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
		enterRule(_localctx, 140, RULE_classDeclarationStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(773);
			match(T__57);
			setState(774);
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
		enterRule(_localctx, 142, RULE_classInnerDeclarationStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(776);
			match(T__58);
			setState(777);
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
		enterRule(_localctx, 144, RULE_enumDeclarationStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(779);
			match(T__59);
			setState(780);
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
		enterRule(_localctx, 146, RULE_methodDeclarationStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(782);
			match(T__60);
			setState(783);
			type();
			setState(784);
			match(T__17);
			setState(786);
			_la = _input.LA(1);
			if (((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (T__127 - 128)) | (1L << (T__128 - 128)) | (1L << (T__129 - 128)) | (1L << (T__130 - 128)) | (1L << (T__131 - 128)) | (1L << (T__132 - 128)) | (1L << (T__133 - 128)) | (1L << (T__134 - 128)) | (1L << (T__135 - 128)) | (1L << (T__140 - 128)) | (1L << (IdentifierX - 128)))) != 0)) {
				{
				setState(785);
				argTypeList();
				}
			}

			setState(788);
			match(T__18);
			setState(789);
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
		enterRule(_localctx, 148, RULE_constructionDeclarationStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(791);
			match(T__60);
			setState(792);
			match(T__61);
			setState(793);
			match(T__17);
			setState(795);
			_la = _input.LA(1);
			if (((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (T__127 - 128)) | (1L << (T__128 - 128)) | (1L << (T__129 - 128)) | (1L << (T__130 - 128)) | (1L << (T__131 - 128)) | (1L << (T__132 - 128)) | (1L << (T__133 - 128)) | (1L << (T__134 - 128)) | (1L << (T__135 - 128)) | (1L << (T__140 - 128)) | (1L << (IdentifierX - 128)))) != 0)) {
				{
				setState(794);
				argTypeList();
				}
			}

			setState(797);
			match(T__18);
			setState(798);
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
		enterRule(_localctx, 150, RULE_enumConstantDeclarationStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(800);
			match(T__62);
			setState(801);
			identifier();
			setState(802);
			match(T__17);
			setState(803);
			argumentList();
			setState(804);
			match(T__18);
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
		enterRule(_localctx, 152, RULE_labeledStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(806);
			match(T__63);
			setState(807);
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
		enterRule(_localctx, 154, RULE_variableDeclarationStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(809);
			match(T__64);
			setState(810);
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
		enterRule(_localctx, 156, RULE_lambdaExpressionStatement);
		int _la;
		try {
			setState(828);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(812);
				match(T__65);
				setState(813);
				match(T__17);
				setState(815);
				_la = _input.LA(1);
				if (((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (T__127 - 128)) | (1L << (T__128 - 128)) | (1L << (T__129 - 128)) | (1L << (T__130 - 128)) | (1L << (T__131 - 128)) | (1L << (T__132 - 128)) | (1L << (T__133 - 128)) | (1L << (T__134 - 128)) | (1L << (T__135 - 128)) | (1L << (T__140 - 128)) | (1L << (IdentifierX - 128)))) != 0)) {
					{
					setState(814);
					argTypeList();
					}
				}

				setState(817);
				match(T__18);
				setState(818);
				match(T__66);
				setState(819);
				match(T__67);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(820);
				match(T__65);
				setState(821);
				match(T__17);
				setState(823);
				_la = _input.LA(1);
				if (((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (T__127 - 128)) | (1L << (T__128 - 128)) | (1L << (T__129 - 128)) | (1L << (T__130 - 128)) | (1L << (T__131 - 128)) | (1L << (T__132 - 128)) | (1L << (T__133 - 128)) | (1L << (T__134 - 128)) | (1L << (T__135 - 128)) | (1L << (T__140 - 128)) | (1L << (IdentifierX - 128)))) != 0)) {
					{
					setState(822);
					argTypeList();
					}
				}

				setState(825);
				match(T__18);
				setState(826);
				match(T__66);
				setState(827);
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
		enterRule(_localctx, 158, RULE_breakStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(830);
			match(T__68);
			setState(831);
			match(T__69);
			setState(833);
			_la = _input.LA(1);
			if (_la==IdentifierX) {
				{
				setState(832);
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
		enterRule(_localctx, 160, RULE_continueStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(835);
			match(T__70);
			setState(836);
			match(T__71);
			setState(838);
			_la = _input.LA(1);
			if (_la==IdentifierX) {
				{
				setState(837);
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
		enterRule(_localctx, 162, RULE_doWhileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(840);
			match(T__72);
			setState(841);
			match(T__73);
			setState(842);
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
		enterRule(_localctx, 164, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(844);
			match(T__74);
			setState(845);
			match(T__73);
			setState(846);
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
		enterRule(_localctx, 166, RULE_returnStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(848);
			match(T__75);
			setState(849);
			match(T__76);
			setState(851);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__21) | (1L << T__32) | (1L << T__33))) != 0) || ((((_la - 122)) & ~0x3f) == 0 && ((1L << (_la - 122)) & ((1L << (T__121 - 122)) | (1L << (T__123 - 122)) | (1L << (T__124 - 122)) | (1L << (T__125 - 122)) | (1L << (T__126 - 122)) | (1L << (T__141 - 122)) | (1L << (T__142 - 122)) | (1L << (T__143 - 122)) | (1L << (T__144 - 122)) | (1L << (T__145 - 122)) | (1L << (IdentifierX - 122)) | (1L << (IntegerLiteralX - 122)) | (1L << (FloatingPointLiteralX - 122)) | (1L << (CharacterLiteralX - 122)) | (1L << (StringLiteralX - 122)))) != 0)) {
				{
				setState(850);
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
		enterRule(_localctx, 168, RULE_switchStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(853);
			match(T__77);
			setState(854);
			match(T__78);
			setState(855);
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
		enterRule(_localctx, 170, RULE_switchCaseStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(857);
			match(T__79);
			setState(858);
			match(T__80);
			setState(859);
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
		enterRule(_localctx, 172, RULE_defaultStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(861);
			match(T__81);
			setState(862);
			match(T__56);
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
		enterRule(_localctx, 174, RULE_synchronizedStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(864);
			match(T__82);
			setState(865);
			match(T__83);
			setState(866);
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
		enterRule(_localctx, 176, RULE_tryStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(868);
			match(T__84);
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
		enterRule(_localctx, 178, RULE_throwStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(870);
			match(T__85);
			setState(871);
			match(T__86);
			setState(872);
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
		enterRule(_localctx, 180, RULE_catchClauseStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(874);
			match(T__87);
			setState(875);
			match(T__88);
			setState(876);
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
		enterRule(_localctx, 182, RULE_finallyStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(878);
			match(T__89);
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
		enterRule(_localctx, 184, RULE_ifStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(880);
			match(T__90);
			setState(881);
			match(T__91);
			setState(882);
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
		enterRule(_localctx, 186, RULE_thenStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(884);
			match(T__92);
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
		enterRule(_localctx, 188, RULE_elseStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(886);
			match(T__93);
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
		enterRule(_localctx, 190, RULE_arrayCreationStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(888);
			match(T__94);
			setState(889);
			type();
			setState(890);
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
		enterRule(_localctx, 192, RULE_initializerStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(892);
			match(T__96);
			setState(893);
			match(T__97);
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
		enterRule(_localctx, 194, RULE_variableDeclarationHolderStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(895);
			match(T__98);
			setState(898);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(896);
				match(T__1);
				setState(897);
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
		enterRule(_localctx, 196, RULE_enhancedForStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(900);
			match(T__99);
			setState(901);
			match(T__100);
			setState(902);
			type();
			setState(903);
			match(T__101);
			setState(904);
			referedExpression();
			setState(905);
			match(T__18);
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
		enterRule(_localctx, 198, RULE_partialEndArrayAccessStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(907);
			expressionStatement();
			setState(908);
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
		enterRule(_localctx, 200, RULE_leftParentheseStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(910);
			match(T__102);
			setState(912); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(911);
				match(T__17);
				}
				}
				setState(914); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__17 );
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
		enterRule(_localctx, 202, RULE_rightParentheseStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(916);
			match(T__102);
			setState(918); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(917);
				match(T__18);
				}
				}
				setState(920); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__18 );
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

	public static class LeftBraceStatementContext extends ParserRuleContext {
		public LeftBraceStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_leftBraceStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterLeftBraceStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitLeftBraceStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitLeftBraceStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LeftBraceStatementContext leftBraceStatement() throws RecognitionException {
		LeftBraceStatementContext _localctx = new LeftBraceStatementContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_leftBraceStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(922);
			match(T__102);
			setState(924); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(923);
				match(T__103);
				}
				}
				setState(926); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__103 );
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

	public static class RightBraceStatementContext extends ParserRuleContext {
		public RightBraceStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rightBraceStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterRightBraceStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitRightBraceStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitRightBraceStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RightBraceStatementContext rightBraceStatement() throws RecognitionException {
		RightBraceStatementContext _localctx = new RightBraceStatementContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_rightBraceStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(928);
			match(T__102);
			setState(930); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(929);
				match(T__104);
				}
				}
				setState(932); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__104 );
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
		enterRule(_localctx, 208, RULE_enterMethodParamStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(934);
			match(T__102);
			setState(936); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(935);
				match(T__105);
				}
				}
				setState(938); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__105 );
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
		enterRule(_localctx, 210, RULE_arrayInitializerStartStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(940);
			match(T__106);
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
		enterRule(_localctx, 212, RULE_arrayInitializerSplitCommaStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(942);
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
		enterRule(_localctx, 214, RULE_arrayInitializerEndStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(944);
			match(T__108);
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
		enterRule(_localctx, 216, RULE_enumConstantDeclarationSplitCommaStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(946);
			match(T__109);
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
		enterRule(_localctx, 218, RULE_forStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(948);
			match(T__110);
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
		enterRule(_localctx, 220, RULE_forIniOverStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(950);
			match(T__111);
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
		enterRule(_localctx, 222, RULE_forExpOverStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(952);
			match(T__112);
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
		enterRule(_localctx, 224, RULE_forUpdOverStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(954);
			match(T__113);
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
		enterRule(_localctx, 226, RULE_condExpBeginStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(956);
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
		enterRule(_localctx, 228, RULE_condExpQuestionMarkStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(958);
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
		enterRule(_localctx, 230, RULE_condExpColonMarkStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(960);
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
		enterRule(_localctx, 232, RULE_partialEndStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(962);
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

	public static class FullEndStatementContext extends ParserRuleContext {
		public FullEndStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fullEndStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterFullEndStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitFullEndStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitFullEndStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FullEndStatementContext fullEndStatement() throws RecognitionException {
		FullEndStatementContext _localctx = new FullEndStatementContext(_ctx, getState());
		enterRule(_localctx, 234, RULE_fullEndStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(964);
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

	public static class PartialMethodArgumentEndStatementContext extends ParserRuleContext {
		public PartialMethodArgumentEndStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partialMethodArgumentEndStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterPartialMethodArgumentEndStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitPartialMethodArgumentEndStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitPartialMethodArgumentEndStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PartialMethodArgumentEndStatementContext partialMethodArgumentEndStatement() throws RecognitionException {
		PartialMethodArgumentEndStatementContext _localctx = new PartialMethodArgumentEndStatementContext(_ctx, getState());
		enterRule(_localctx, 236, RULE_partialMethodArgumentEndStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(966);
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

	public static class PartialMethodPreRerferedExpressionEndStatementContext extends ParserRuleContext {
		public PartialMethodPreRerferedExpressionEndStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partialMethodPreRerferedExpressionEndStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterPartialMethodPreRerferedExpressionEndStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitPartialMethodPreRerferedExpressionEndStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitPartialMethodPreRerferedExpressionEndStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PartialMethodPreRerferedExpressionEndStatementContext partialMethodPreRerferedExpressionEndStatement() throws RecognitionException {
		PartialMethodPreRerferedExpressionEndStatementContext _localctx = new PartialMethodPreRerferedExpressionEndStatementContext(_ctx, getState());
		enterRule(_localctx, 238, RULE_partialMethodPreRerferedExpressionEndStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(968);
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
		enterRule(_localctx, 240, RULE_firstArgPreExist);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(970);
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
		enterRule(_localctx, 242, RULE_firstArgReferedExpression);
		try {
			setState(974);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(972);
				referedExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(973);
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
		enterRule(_localctx, 244, RULE_commonClassMemberInvoke);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(976);
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
		enterRule(_localctx, 246, RULE_selfClassMemberInvoke);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(978);
			match(T__21);
			setState(981);
			_la = _input.LA(1);
			if (_la==DOT) {
				{
				setState(979);
				match(DOT);
				setState(980);
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
		enterRule(_localctx, 248, RULE_superClassMemberInvoke);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(983);
			match(T__22);
			setState(986);
			_la = _input.LA(1);
			if (_la==DOT) {
				{
				setState(984);
				match(DOT);
				setState(985);
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
		enterRule(_localctx, 250, RULE_newClassInvoke);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(988);
			match(T__122);
			setState(991);
			_la = _input.LA(1);
			if (_la==DOT) {
				{
				setState(989);
				match(DOT);
				setState(990);
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
		enterRule(_localctx, 252, RULE_firstArg);
		try {
			setState(998);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(994);
				selfClassMemberInvoke();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(995);
				superClassMemberInvoke();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(996);
				newClassInvoke();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(997);
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
		enterRule(_localctx, 254, RULE_methodArgPreExist);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1000);
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
		enterRule(_localctx, 256, RULE_methodArgReferedExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
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
		enterRule(_localctx, 258, RULE_argumentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1004);
			firstArg();
			setState(1009);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1005);
				match(COMMA);
				setState(1006);
				methodArgReferedExpression();
				}
				}
				setState(1011);
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

	public static class ArgTypeListContext extends ParserRuleContext {
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
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
		enterRule(_localctx, 260, RULE_argTypeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1012);
			type();
			setState(1017);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1013);
				match(COMMA);
				setState(1014);
				type();
				}
				}
				setState(1019);
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
		enterRule(_localctx, 262, RULE_literal);
		try {
			setState(1026);
			switch (_input.LA(1)) {
			case IntegerLiteralX:
			case FloatingPointLiteralX:
				enterOuterAlt(_localctx, 1);
				{
				setState(1020);
				numberLiteral();
				}
				break;
			case T__123:
			case T__124:
				enterOuterAlt(_localctx, 2);
				{
				setState(1021);
				booleanLiteral();
				}
				break;
			case CharacterLiteralX:
				enterOuterAlt(_localctx, 3);
				{
				setState(1022);
				characterLiteral();
				}
				break;
			case StringLiteralX:
				enterOuterAlt(_localctx, 4);
				{
				setState(1023);
				stringLiteral();
				}
				break;
			case T__125:
				enterOuterAlt(_localctx, 5);
				{
				setState(1024);
				nullLiteral();
				}
				break;
			case T__126:
				enterOuterAlt(_localctx, 6);
				{
				setState(1025);
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
		enterRule(_localctx, 264, RULE_numberLiteral);
		try {
			setState(1030);
			switch (_input.LA(1)) {
			case IntegerLiteralX:
				enterOuterAlt(_localctx, 1);
				{
				setState(1028);
				integerLiteral();
				}
				break;
			case FloatingPointLiteralX:
				enterOuterAlt(_localctx, 2);
				{
				setState(1029);
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
		enterRule(_localctx, 266, RULE_integerLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1032);
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
		enterRule(_localctx, 268, RULE_floatingPointLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1034);
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
		enterRule(_localctx, 270, RULE_booleanLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1036);
			_la = _input.LA(1);
			if ( !(_la==T__123 || _la==T__124) ) {
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
		enterRule(_localctx, 272, RULE_characterLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1038);
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
		enterRule(_localctx, 274, RULE_stringLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1040);
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
		enterRule(_localctx, 276, RULE_nullLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1042);
			match(T__125);
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
		enterRule(_localctx, 278, RULE_typeLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1044);
			match(T__126);
			setState(1045);
			match(DOT);
			setState(1046);
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
		enterRule(_localctx, 280, RULE_type);
		try {
			setState(1055);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1048);
				virtualInferredType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1049);
				primitiveType();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1050);
				classOrInterfaceType();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1051);
				arrayType();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1052);
				intersectionType();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1053);
				unionType();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1054);
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
		enterRule(_localctx, 282, RULE_virtualInferredType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1057);
			match(T__127);
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
		enterRule(_localctx, 284, RULE_primitiveType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1059);
			_la = _input.LA(1);
			if ( !(((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & ((1L << (T__128 - 129)) | (1L << (T__129 - 129)) | (1L << (T__130 - 129)) | (1L << (T__131 - 129)) | (1L << (T__132 - 129)) | (1L << (T__133 - 129)) | (1L << (T__134 - 129)) | (1L << (T__135 - 129)))) != 0)) ) {
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
		enterRule(_localctx, 286, RULE_simpleType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1061);
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
		enterRule(_localctx, 288, RULE_extendBound);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1063);
			match(T__136);
			setState(1064);
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
		enterRule(_localctx, 290, RULE_superBound);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1066);
			match(T__22);
			setState(1067);
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
		enterRule(_localctx, 292, RULE_wildcardBounds);
		try {
			setState(1071);
			switch (_input.LA(1)) {
			case T__136:
				enterOuterAlt(_localctx, 1);
				{
				setState(1069);
				extendBound();
				}
				break;
			case T__22:
				enterOuterAlt(_localctx, 2);
				{
				setState(1070);
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
		enterRule(_localctx, 294, RULE_wildCardType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1073);
			match(T__137);
			setState(1075);
			_la = _input.LA(1);
			if (_la==T__22 || _la==T__136) {
				{
				setState(1074);
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
		enterRule(_localctx, 296, RULE_typeArgument);
		try {
			setState(1079);
			switch (_input.LA(1)) {
			case T__127:
			case T__128:
			case T__129:
			case T__130:
			case T__131:
			case T__132:
			case T__133:
			case T__134:
			case T__135:
			case T__140:
			case IdentifierX:
				enterOuterAlt(_localctx, 1);
				{
				setState(1077);
				type();
				}
				break;
			case T__137:
				enterOuterAlt(_localctx, 2);
				{
				setState(1078);
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
		enterRule(_localctx, 298, RULE_typeArguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1081);
			match(T__25);
			setState(1082);
			typeArgument();
			setState(1087);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1083);
				match(COMMA);
				setState(1084);
				typeArgument();
				}
				}
				setState(1089);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1090);
			match(T__24);
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
		enterRule(_localctx, 300, RULE_parameterizedType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1092);
			identifier();
			setState(1093);
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
		enterRule(_localctx, 302, RULE_bothType);
		try {
			setState(1097);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1095);
				simpleType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1096);
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
		enterRule(_localctx, 304, RULE_classOrInterfaceType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1099);
			bothType();
			}
			setState(1104);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(1100);
				match(DOT);
				setState(1101);
				bothType();
				}
				}
				setState(1106);
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
		enterRule(_localctx, 306, RULE_arrayType);
		try {
			setState(1113);
			switch (_input.LA(1)) {
			case T__128:
			case T__129:
			case T__130:
			case T__131:
			case T__132:
			case T__133:
			case T__134:
			case T__135:
				enterOuterAlt(_localctx, 1);
				{
				setState(1107);
				primitiveType();
				setState(1108);
				dims();
				}
				break;
			case IdentifierX:
				enterOuterAlt(_localctx, 2);
				{
				setState(1110);
				classOrInterfaceType();
				setState(1111);
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
		enterRule(_localctx, 308, RULE_dims);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1115);
			match(T__138);
			setState(1116);
			match(T__139);
			setState(1121);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__138) {
				{
				{
				setState(1117);
				match(T__138);
				setState(1118);
				match(T__139);
				}
				}
				setState(1123);
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
		enterRule(_localctx, 310, RULE_intersectionFirstType);
		try {
			setState(1128);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1124);
				classOrInterfaceType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1125);
				primitiveType();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1126);
				arrayType();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1127);
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
		enterRule(_localctx, 312, RULE_intersectionSecondType);
		try {
			setState(1135);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1130);
				classOrInterfaceType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1131);
				primitiveType();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1132);
				arrayType();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1133);
				classRef();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1134);
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
		enterRule(_localctx, 314, RULE_intersectionType);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1137);
			intersectionFirstType();
			}
			setState(1140); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1138);
					match(T__36);
					{
					setState(1139);
					intersectionSecondType();
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1142); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
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
		enterRule(_localctx, 316, RULE_unionFirstType);
		try {
			setState(1148);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1144);
				classOrInterfaceType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1145);
				primitiveType();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1146);
				arrayType();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1147);
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
		enterRule(_localctx, 318, RULE_unionSecondType);
		try {
			setState(1155);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1150);
				classOrInterfaceType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1151);
				primitiveType();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1152);
				arrayType();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1153);
				classRef();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1154);
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
		enterRule(_localctx, 320, RULE_unionType);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1157);
			unionFirstType();
			}
			setState(1160); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1158);
					match(T__37);
					{
					setState(1159);
					unionSecondType();
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1162); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
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
		enterRule(_localctx, 322, RULE_classRef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1164);
			match(T__140);
			setState(1165);
			integerLiteral();
			setState(1166);
			match(T__137);
			setState(1167);
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
		enterRule(_localctx, 324, RULE_finalFieldRef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1169);
			match(T__141);
			setState(1170);
			integerLiteral();
			setState(1171);
			match(T__137);
			setState(1172);
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
		enterRule(_localctx, 326, RULE_finalVarRef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1174);
			match(T__142);
			setState(1175);
			integerLiteral();
			setState(1176);
			match(T__137);
			setState(1177);
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
		enterRule(_localctx, 328, RULE_commonFieldRef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1179);
			match(T__143);
			setState(1180);
			integerLiteral();
			setState(1181);
			match(T__137);
			setState(1182);
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
		enterRule(_localctx, 330, RULE_commonVarRef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1184);
			match(T__144);
			setState(1185);
			integerLiteral();
			setState(1186);
			match(T__137);
			setState(1187);
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

	public static class ThisExpressionContext extends ParserRuleContext {
		public ReferedExpressionContext referedExpression() {
			return getRuleContext(ReferedExpressionContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ThisExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_thisExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterThisExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitThisExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitThisExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ThisExpressionContext thisExpression() throws RecognitionException {
		ThisExpressionContext _localctx = new ThisExpressionContext(_ctx, getState());
		enterRule(_localctx, 332, RULE_thisExpression);
		try {
			setState(1196);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1189);
				match(T__21);
				setState(1190);
				match(DOT);
				setState(1191);
				referedExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1192);
				match(T__21);
				setState(1193);
				match(DOT);
				setState(1194);
				type();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1195);
				match(T__21);
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
		enterRule(_localctx, 334, RULE_codeHole);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1198);
			match(T__145);
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
		enterRule(_localctx, 336, RULE_preExist);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1200);
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
		enterRule(_localctx, 338, RULE_endOfArrayDeclarationIndexExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1203); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1202);
					match(T__139);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1205); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\u009e\u04ba\4\2\t"+
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
		"\t\u00a9\4\u00aa\t\u00aa\4\u00ab\t\u00ab\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2\u018f\n\2\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\u019d\n\3\3\4\3\4\3"+
		"\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7"+
		"\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13"+
		"\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16"+
		"\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\5\20\u01e7\n\20\3\21\3\21\3\21\3\22\3\22\3\22"+
		"\3\23\3\23\3\23\3\24\3\24\3\24\5\24\u01f5\n\24\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\30\3\30"+
		"\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\5\33\u0216"+
		"\n\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\5\34\u0228\n\34\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36"+
		"\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3\""+
		"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3&\3&\3"+
		"&\3&\3&\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3*\3*\3*\3*"+
		"\3*\3+\3+\3+\3+\3+\3,\3,\3,\3,\3,\3-\3-\3-\3-\3-\3-\3.\3.\3.\3.\3.\3."+
		"\3/\3/\3/\3/\3/\3/\3/\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60"+
		"\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\5\60\u02a0\n\60\3\61\3\61"+
		"\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3\62\3\63\3\63\3\63\3\64\3\64\3\64"+
		"\3\64\3\65\3\65\3\65\3\65\3\66\3\66\3\66\3\66\3\67\3\67\3\67\3\67\38\3"+
		"8\38\39\39\39\3:\3:\3:\3;\3;\3;\3<\3<\3<\3<\3<\3<\5<\u02d1\n<\3=\3=\3"+
		"=\3=\3>\3>\3>\3>\3?\3?\5?\u02dd\n?\3@\3@\3@\3@\5@\u02e3\n@\3A\3A\3A\3"+
		"A\3A\3A\3A\3A\3A\3A\3A\3A\5A\u02f1\nA\3B\3B\3C\3C\3D\3D\3E\3E\3E\3F\3"+
		"F\3F\3G\3G\3G\3G\3G\3G\3G\5G\u0306\nG\3H\3H\3H\3I\3I\3I\3J\3J\3J\3K\3"+
		"K\3K\3K\5K\u0315\nK\3K\3K\3K\3L\3L\3L\3L\5L\u031e\nL\3L\3L\3L\3M\3M\3"+
		"M\3M\3M\3M\3N\3N\3N\3O\3O\3O\3P\3P\3P\5P\u0332\nP\3P\3P\3P\3P\3P\3P\5"+
		"P\u033a\nP\3P\3P\3P\5P\u033f\nP\3Q\3Q\3Q\5Q\u0344\nQ\3R\3R\3R\5R\u0349"+
		"\nR\3S\3S\3S\3S\3T\3T\3T\3T\3U\3U\3U\5U\u0356\nU\3V\3V\3V\3V\3W\3W\3W"+
		"\3W\3X\3X\3X\3Y\3Y\3Y\3Y\3Z\3Z\3[\3[\3[\3[\3\\\3\\\3\\\3\\\3]\3]\3^\3"+
		"^\3^\3^\3_\3_\3`\3`\3a\3a\3a\3a\3b\3b\3b\3c\3c\3c\5c\u0385\nc\3d\3d\3"+
		"d\3d\3d\3d\3d\3e\3e\3e\3f\3f\6f\u0393\nf\rf\16f\u0394\3g\3g\6g\u0399\n"+
		"g\rg\16g\u039a\3h\3h\6h\u039f\nh\rh\16h\u03a0\3i\3i\6i\u03a5\ni\ri\16"+
		"i\u03a6\3j\3j\6j\u03ab\nj\rj\16j\u03ac\3k\3k\3l\3l\3m\3m\3n\3n\3o\3o\3"+
		"p\3p\3q\3q\3r\3r\3s\3s\3t\3t\3u\3u\3v\3v\3w\3w\3x\3x\3y\3y\3z\3z\3{\3"+
		"{\5{\u03d1\n{\3|\3|\3}\3}\3}\5}\u03d8\n}\3~\3~\3~\5~\u03dd\n~\3\177\3"+
		"\177\3\177\5\177\u03e2\n\177\3\u0080\3\u0080\3\u0080\3\u0080\3\u0080\5"+
		"\u0080\u03e9\n\u0080\3\u0081\3\u0081\3\u0082\3\u0082\3\u0083\3\u0083\3"+
		"\u0083\7\u0083\u03f2\n\u0083\f\u0083\16\u0083\u03f5\13\u0083\3\u0084\3"+
		"\u0084\3\u0084\7\u0084\u03fa\n\u0084\f\u0084\16\u0084\u03fd\13\u0084\3"+
		"\u0085\3\u0085\3\u0085\3\u0085\3\u0085\3\u0085\5\u0085\u0405\n\u0085\3"+
		"\u0086\3\u0086\5\u0086\u0409\n\u0086\3\u0087\3\u0087\3\u0088\3\u0088\3"+
		"\u0089\3\u0089\3\u008a\3\u008a\3\u008b\3\u008b\3\u008c\3\u008c\3\u008d"+
		"\3\u008d\3\u008d\3\u008d\3\u008e\3\u008e\3\u008e\3\u008e\3\u008e\3\u008e"+
		"\3\u008e\5\u008e\u0422\n\u008e\3\u008f\3\u008f\3\u0090\3\u0090\3\u0091"+
		"\3\u0091\3\u0092\3\u0092\3\u0092\3\u0093\3\u0093\3\u0093\3\u0094\3\u0094"+
		"\5\u0094\u0432\n\u0094\3\u0095\3\u0095\5\u0095\u0436\n\u0095\3\u0096\3"+
		"\u0096\5\u0096\u043a\n\u0096\3\u0097\3\u0097\3\u0097\3\u0097\7\u0097\u0440"+
		"\n\u0097\f\u0097\16\u0097\u0443\13\u0097\3\u0097\3\u0097\3\u0098\3\u0098"+
		"\3\u0098\3\u0099\3\u0099\5\u0099\u044c\n\u0099\3\u009a\3\u009a\3\u009a"+
		"\7\u009a\u0451\n\u009a\f\u009a\16\u009a\u0454\13\u009a\3\u009b\3\u009b"+
		"\3\u009b\3\u009b\3\u009b\3\u009b\5\u009b\u045c\n\u009b\3\u009c\3\u009c"+
		"\3\u009c\3\u009c\7\u009c\u0462\n\u009c\f\u009c\16\u009c\u0465\13\u009c"+
		"\3\u009d\3\u009d\3\u009d\3\u009d\5\u009d\u046b\n\u009d\3\u009e\3\u009e"+
		"\3\u009e\3\u009e\3\u009e\5\u009e\u0472\n\u009e\3\u009f\3\u009f\3\u009f"+
		"\6\u009f\u0477\n\u009f\r\u009f\16\u009f\u0478\3\u00a0\3\u00a0\3\u00a0"+
		"\3\u00a0\5\u00a0\u047f\n\u00a0\3\u00a1\3\u00a1\3\u00a1\3\u00a1\3\u00a1"+
		"\5\u00a1\u0486\n\u00a1\3\u00a2\3\u00a2\3\u00a2\6\u00a2\u048b\n\u00a2\r"+
		"\u00a2\16\u00a2\u048c\3\u00a3\3\u00a3\3\u00a3\3\u00a3\3\u00a3\3\u00a4"+
		"\3\u00a4\3\u00a4\3\u00a4\3\u00a4\3\u00a5\3\u00a5\3\u00a5\3\u00a5\3\u00a5"+
		"\3\u00a6\3\u00a6\3\u00a6\3\u00a6\3\u00a6\3\u00a7\3\u00a7\3\u00a7\3\u00a7"+
		"\3\u00a7\3\u00a8\3\u00a8\3\u00a8\3\u00a8\3\u00a8\3\u00a8\3\u00a8\5\u00a8"+
		"\u04af\n\u00a8\3\u00a9\3\u00a9\3\u00aa\3\u00aa\3\u00ab\6\u00ab\u04b6\n"+
		"\u00ab\r\u00ab\16\u00ab\u04b7\3\u00ab\2\2\u00ac\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtv"+
		"xz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094"+
		"\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac"+
		"\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4"+
		"\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8\u00da\u00dc"+
		"\u00de\u00e0\u00e2\u00e4\u00e6\u00e8\u00ea\u00ec\u00ee\u00f0\u00f2\u00f4"+
		"\u00f6\u00f8\u00fa\u00fc\u00fe\u0100\u0102\u0104\u0106\u0108\u010a\u010c"+
		"\u010e\u0110\u0112\u0114\u0116\u0118\u011a\u011c\u011e\u0120\u0122\u0124"+
		"\u0126\u0128\u012a\u012c\u012e\u0130\u0132\u0134\u0136\u0138\u013a\u013c"+
		"\u013e\u0140\u0142\u0144\u0146\u0148\u014a\u014c\u014e\u0150\u0152\u0154"+
		"\2\4\3\2~\177\3\2\u0083\u008a\u04c7\2\u018e\3\2\2\2\4\u019c\3\2\2\2\6"+
		"\u019e\3\2\2\2\b\u01a3\3\2\2\2\n\u01a8\3\2\2\2\f\u01ad\3\2\2\2\16\u01b2"+
		"\3\2\2\2\20\u01b7\3\2\2\2\22\u01bc\3\2\2\2\24\u01c1\3\2\2\2\26\u01c6\3"+
		"\2\2\2\30\u01cb\3\2\2\2\32\u01d0\3\2\2\2\34\u01d5\3\2\2\2\36\u01e6\3\2"+
		"\2\2 \u01e8\3\2\2\2\"\u01eb\3\2\2\2$\u01ee\3\2\2\2&\u01f4\3\2\2\2(\u01f6"+
		"\3\2\2\2*\u01fc\3\2\2\2,\u0202\3\2\2\2.\u0205\3\2\2\2\60\u0209\3\2\2\2"+
		"\62\u020d\3\2\2\2\64\u0215\3\2\2\2\66\u0227\3\2\2\28\u0229\3\2\2\2:\u022e"+
		"\3\2\2\2<\u0233\3\2\2\2>\u0238\3\2\2\2@\u023d\3\2\2\2B\u0242\3\2\2\2D"+
		"\u0247\3\2\2\2F\u024c\3\2\2\2H\u0251\3\2\2\2J\u0256\3\2\2\2L\u025b\3\2"+
		"\2\2N\u0260\3\2\2\2P\u0265\3\2\2\2R\u026a\3\2\2\2T\u026f\3\2\2\2V\u0274"+
		"\3\2\2\2X\u0279\3\2\2\2Z\u027f\3\2\2\2\\\u0285\3\2\2\2^\u029f\3\2\2\2"+
		"`\u02a1\3\2\2\2b\u02a6\3\2\2\2d\u02ab\3\2\2\2f\u02ae\3\2\2\2h\u02b2\3"+
		"\2\2\2j\u02b6\3\2\2\2l\u02ba\3\2\2\2n\u02be\3\2\2\2p\u02c1\3\2\2\2r\u02c4"+
		"\3\2\2\2t\u02c7\3\2\2\2v\u02d0\3\2\2\2x\u02d2\3\2\2\2z\u02d6\3\2\2\2|"+
		"\u02dc\3\2\2\2~\u02de\3\2\2\2\u0080\u02f0\3\2\2\2\u0082\u02f2\3\2\2\2"+
		"\u0084\u02f4\3\2\2\2\u0086\u02f6\3\2\2\2\u0088\u02f8\3\2\2\2\u008a\u02fb"+
		"\3\2\2\2\u008c\u02fe\3\2\2\2\u008e\u0307\3\2\2\2\u0090\u030a\3\2\2\2\u0092"+
		"\u030d\3\2\2\2\u0094\u0310\3\2\2\2\u0096\u0319\3\2\2\2\u0098\u0322\3\2"+
		"\2\2\u009a\u0328\3\2\2\2\u009c\u032b\3\2\2\2\u009e\u033e\3\2\2\2\u00a0"+
		"\u0340\3\2\2\2\u00a2\u0345\3\2\2\2\u00a4\u034a\3\2\2\2\u00a6\u034e\3\2"+
		"\2\2\u00a8\u0352\3\2\2\2\u00aa\u0357\3\2\2\2\u00ac\u035b\3\2\2\2\u00ae"+
		"\u035f\3\2\2\2\u00b0\u0362\3\2\2\2\u00b2\u0366\3\2\2\2\u00b4\u0368\3\2"+
		"\2\2\u00b6\u036c\3\2\2\2\u00b8\u0370\3\2\2\2\u00ba\u0372\3\2\2\2\u00bc"+
		"\u0376\3\2\2\2\u00be\u0378\3\2\2\2\u00c0\u037a\3\2\2\2\u00c2\u037e\3\2"+
		"\2\2\u00c4\u0381\3\2\2\2\u00c6\u0386\3\2\2\2\u00c8\u038d\3\2\2\2\u00ca"+
		"\u0390\3\2\2\2\u00cc\u0396\3\2\2\2\u00ce\u039c\3\2\2\2\u00d0\u03a2\3\2"+
		"\2\2\u00d2\u03a8\3\2\2\2\u00d4\u03ae\3\2\2\2\u00d6\u03b0\3\2\2\2\u00d8"+
		"\u03b2\3\2\2\2\u00da\u03b4\3\2\2\2\u00dc\u03b6\3\2\2\2\u00de\u03b8\3\2"+
		"\2\2\u00e0\u03ba\3\2\2\2\u00e2\u03bc\3\2\2\2\u00e4\u03be\3\2\2\2\u00e6"+
		"\u03c0\3\2\2\2\u00e8\u03c2\3\2\2\2\u00ea\u03c4\3\2\2\2\u00ec\u03c6\3\2"+
		"\2\2\u00ee\u03c8\3\2\2\2\u00f0\u03ca\3\2\2\2\u00f2\u03cc\3\2\2\2\u00f4"+
		"\u03d0\3\2\2\2\u00f6\u03d2\3\2\2\2\u00f8\u03d4\3\2\2\2\u00fa\u03d9\3\2"+
		"\2\2\u00fc\u03de\3\2\2\2\u00fe\u03e8\3\2\2\2\u0100\u03ea\3\2\2\2\u0102"+
		"\u03ec\3\2\2\2\u0104\u03ee\3\2\2\2\u0106\u03f6\3\2\2\2\u0108\u0404\3\2"+
		"\2\2\u010a\u0408\3\2\2\2\u010c\u040a\3\2\2\2\u010e\u040c\3\2\2\2\u0110"+
		"\u040e\3\2\2\2\u0112\u0410\3\2\2\2\u0114\u0412\3\2\2\2\u0116\u0414\3\2"+
		"\2\2\u0118\u0416\3\2\2\2\u011a\u0421\3\2\2\2\u011c\u0423\3\2\2\2\u011e"+
		"\u0425\3\2\2\2\u0120\u0427\3\2\2\2\u0122\u0429\3\2\2\2\u0124\u042c\3\2"+
		"\2\2\u0126\u0431\3\2\2\2\u0128\u0433\3\2\2\2\u012a\u0439\3\2\2\2\u012c"+
		"\u043b\3\2\2\2\u012e\u0446\3\2\2\2\u0130\u044b\3\2\2\2\u0132\u044d\3\2"+
		"\2\2\u0134\u045b\3\2\2\2\u0136\u045d\3\2\2\2\u0138\u046a\3\2\2\2\u013a"+
		"\u0471\3\2\2\2\u013c\u0473\3\2\2\2\u013e\u047e\3\2\2\2\u0140\u0485\3\2"+
		"\2\2\u0142\u0487\3\2\2\2\u0144\u048e\3\2\2\2\u0146\u0493\3\2\2\2\u0148"+
		"\u0498\3\2\2\2\u014a\u049d\3\2\2\2\u014c\u04a2\3\2\2\2\u014e\u04ae\3\2"+
		"\2\2\u0150\u04b0\3\2\2\2\u0152\u04b2\3\2\2\2\u0154\u04b5\3\2\2\2\u0156"+
		"\u018f\5\u0084C\2\u0157\u018f\5\u0086D\2\u0158\u018f\5\u0088E\2\u0159"+
		"\u018f\5\u008aF\2\u015a\u018f\5\u008cG\2\u015b\u018f\5\u008eH\2\u015c"+
		"\u018f\5\u0090I\2\u015d\u018f\5\u0092J\2\u015e\u018f\5\u0094K\2\u015f"+
		"\u018f\5\u0096L\2\u0160\u018f\5\u0098M\2\u0161\u018f\5\u009aN\2\u0162"+
		"\u018f\5\u009cO\2\u0163\u018f\5\u009eP\2\u0164\u018f\5\u00a0Q\2\u0165"+
		"\u018f\5\u00a2R\2\u0166\u018f\5\u00a4S\2\u0167\u018f\5\u00a6T\2\u0168"+
		"\u018f\5\u00a8U\2\u0169\u018f\5\u00aaV\2\u016a\u018f\5\u00acW\2\u016b"+
		"\u018f\5\u00aeX\2\u016c\u018f\5\u00b0Y\2\u016d\u018f\5\u00b2Z\2\u016e"+
		"\u018f\5\u00b4[\2\u016f\u018f\5\u00b6\\\2\u0170\u018f\5\u00b8]\2\u0171"+
		"\u018f\5\u00ba^\2\u0172\u018f\5\u00bc_\2\u0173\u018f\5\u00be`\2\u0174"+
		"\u018f\5\u00c0a\2\u0175\u018f\5\u00c2b\2\u0176\u018f\5\u00c4c\2\u0177"+
		"\u018f\5\u00c6d\2\u0178\u018f\5\u00c8e\2\u0179\u018f\5\u00caf\2\u017a"+
		"\u018f\5\u00ccg\2\u017b\u018f\5\u00ceh\2\u017c\u018f\5\u00d0i\2\u017d"+
		"\u018f\5\u00d2j\2\u017e\u018f\5\u00d4k\2\u017f\u018f\5\u00d6l\2\u0180"+
		"\u018f\5\u00d8m\2\u0181\u018f\5\u00dan\2\u0182\u018f\5\u00dco\2\u0183"+
		"\u018f\5\u00dep\2\u0184\u018f\5\u00e0q\2\u0185\u018f\5\u00e2r\2\u0186"+
		"\u018f\5\u00e4s\2\u0187\u018f\5\u00e6t\2\u0188\u018f\5\u00e8u\2\u0189"+
		"\u018f\5\u00eav\2\u018a\u018f\5\u00ecw\2\u018b\u018f\5\u00eex\2\u018c"+
		"\u018f\5\u00f0y\2\u018d\u018f\5\4\3\2\u018e\u0156\3\2\2\2\u018e\u0157"+
		"\3\2\2\2\u018e\u0158\3\2\2\2\u018e\u0159\3\2\2\2\u018e\u015a\3\2\2\2\u018e"+
		"\u015b\3\2\2\2\u018e\u015c\3\2\2\2\u018e\u015d\3\2\2\2\u018e\u015e\3\2"+
		"\2\2\u018e\u015f\3\2\2\2\u018e\u0160\3\2\2\2\u018e\u0161\3\2\2\2\u018e"+
		"\u0162\3\2\2\2\u018e\u0163\3\2\2\2\u018e\u0164\3\2\2\2\u018e\u0165\3\2"+
		"\2\2\u018e\u0166\3\2\2\2\u018e\u0167\3\2\2\2\u018e\u0168\3\2\2\2\u018e"+
		"\u0169\3\2\2\2\u018e\u016a\3\2\2\2\u018e\u016b\3\2\2\2\u018e\u016c\3\2"+
		"\2\2\u018e\u016d\3\2\2\2\u018e\u016e\3\2\2\2\u018e\u016f\3\2\2\2\u018e"+
		"\u0170\3\2\2\2\u018e\u0171\3\2\2\2\u018e\u0172\3\2\2\2\u018e\u0173\3\2"+
		"\2\2\u018e\u0174\3\2\2\2\u018e\u0175\3\2\2\2\u018e\u0176\3\2\2\2\u018e"+
		"\u0177\3\2\2\2\u018e\u0178\3\2\2\2\u018e\u0179\3\2\2\2\u018e\u017a\3\2"+
		"\2\2\u018e\u017b\3\2\2\2\u018e\u017c\3\2\2\2\u018e\u017d\3\2\2\2\u018e"+
		"\u017e\3\2\2\2\u018e\u017f\3\2\2\2\u018e\u0180\3\2\2\2\u018e\u0181\3\2"+
		"\2\2\u018e\u0182\3\2\2\2\u018e\u0183\3\2\2\2\u018e\u0184\3\2\2\2\u018e"+
		"\u0185\3\2\2\2\u018e\u0186\3\2\2\2\u018e\u0187\3\2\2\2\u018e\u0188\3\2"+
		"\2\2\u018e\u0189\3\2\2\2\u018e\u018a\3\2\2\2\u018e\u018b\3\2\2\2\u018e"+
		"\u018c\3\2\2\2\u018e\u018d\3\2\2\2\u018f\3\3\2\2\2\u0190\u019d\5\36\20"+
		"\2\u0191\u019d\5&\24\2\u0192\u019d\5(\25\2\u0193\u019d\5*\26\2\u0194\u019d"+
		"\5,\27\2\u0195\u019d\5^\60\2\u0196\u019d\5`\61\2\u0197\u019d\5b\62\2\u0198"+
		"\u019d\5d\63\2\u0199\u019d\5v<\2\u019a\u019d\5|?\2\u019b\u019d\5~@\2\u019c"+
		"\u0190\3\2\2\2\u019c\u0191\3\2\2\2\u019c\u0192\3\2\2\2\u019c\u0193\3\2"+
		"\2\2\u019c\u0194\3\2\2\2\u019c\u0195\3\2\2\2\u019c\u0196\3\2\2\2\u019c"+
		"\u0197\3\2\2\2\u019c\u0198\3\2\2\2\u019c\u0199\3\2\2\2\u019c\u019a\3\2"+
		"\2\2\u019c\u019b\3\2\2\2\u019d\5\3\2\2\2\u019e\u019f\7\3\2\2\u019f\u01a0"+
		"\5\u0080A\2\u01a0\u01a1\7\4\2\2\u01a1\u01a2\5\u0080A\2\u01a2\7\3\2\2\2"+
		"\u01a3\u01a4\7\3\2\2\u01a4\u01a5\5\u0080A\2\u01a5\u01a6\7\5\2\2\u01a6"+
		"\u01a7\5\u0080A\2\u01a7\t\3\2\2\2\u01a8\u01a9\7\3\2\2\u01a9\u01aa\5\u0080"+
		"A\2\u01aa\u01ab\7\6\2\2\u01ab\u01ac\5\u0080A\2\u01ac\13\3\2\2\2\u01ad"+
		"\u01ae\7\3\2\2\u01ae\u01af\5\u0080A\2\u01af\u01b0\7\7\2\2\u01b0\u01b1"+
		"\5\u0080A\2\u01b1\r\3\2\2\2\u01b2\u01b3\7\3\2\2\u01b3\u01b4\5\u0080A\2"+
		"\u01b4\u01b5\7\b\2\2\u01b5\u01b6\5\u0080A\2\u01b6\17\3\2\2\2\u01b7\u01b8"+
		"\7\3\2\2\u01b8\u01b9\5\u0080A\2\u01b9\u01ba\7\t\2\2\u01ba\u01bb\5\u0080"+
		"A\2\u01bb\21\3\2\2\2\u01bc\u01bd\7\3\2\2\u01bd\u01be\5\u0080A\2\u01be"+
		"\u01bf\7\n\2\2\u01bf\u01c0\5\u0080A\2\u01c0\23\3\2\2\2\u01c1\u01c2\7\3"+
		"\2\2\u01c2\u01c3\5\u0080A\2\u01c3\u01c4\7\13\2\2\u01c4\u01c5\5\u0080A"+
		"\2\u01c5\25\3\2\2\2\u01c6\u01c7\7\3\2\2\u01c7\u01c8\5\u0080A\2\u01c8\u01c9"+
		"\7\f\2\2\u01c9\u01ca\5\u0080A\2\u01ca\27\3\2\2\2\u01cb\u01cc\7\3\2\2\u01cc"+
		"\u01cd\5\u0080A\2\u01cd\u01ce\7\r\2\2\u01ce\u01cf\5\u0080A\2\u01cf\31"+
		"\3\2\2\2\u01d0\u01d1\7\3\2\2\u01d1\u01d2\5\u0080A\2\u01d2\u01d3\7\16\2"+
		"\2\u01d3\u01d4\5\u0080A\2\u01d4\33\3\2\2\2\u01d5\u01d6\7\3\2\2\u01d6\u01d7"+
		"\5\u0080A\2\u01d7\u01d8\7\17\2\2\u01d8\u01d9\5\u0080A\2\u01d9\35\3\2\2"+
		"\2\u01da\u01e7\5\6\4\2\u01db\u01e7\5\b\5\2\u01dc\u01e7\5\n\6\2\u01dd\u01e7"+
		"\5\f\7\2\u01de\u01e7\5\16\b\2\u01df\u01e7\5\20\t\2\u01e0\u01e7\5\22\n"+
		"\2\u01e1\u01e7\5\24\13\2\u01e2\u01e7\5\26\f\2\u01e3\u01e7\5\30\r\2\u01e4"+
		"\u01e7\5\32\16\2\u01e5\u01e7\5\34\17\2\u01e6\u01da\3\2\2\2\u01e6\u01db"+
		"\3\2\2\2\u01e6\u01dc\3\2\2\2\u01e6\u01dd\3\2\2\2\u01e6\u01de\3\2\2\2\u01e6"+
		"\u01df\3\2\2\2\u01e6\u01e0\3\2\2\2\u01e6\u01e1\3\2\2\2\u01e6\u01e2\3\2"+
		"\2\2\u01e6\u01e3\3\2\2\2\u01e6\u01e4\3\2\2\2\u01e6\u01e5\3\2\2\2\u01e7"+
		"\37\3\2\2\2\u01e8\u01e9\7\20\2\2\u01e9\u01ea\5\u0108\u0085\2\u01ea!\3"+
		"\2\2\2\u01eb\u01ec\7\21\2\2\u01ec\u01ed\5\u0108\u0085\2\u01ed#\3\2\2\2"+
		"\u01ee\u01ef\7\22\2\2\u01ef\u01f0\5\u0108\u0085\2\u01f0%\3\2\2\2\u01f1"+
		"\u01f5\5$\23\2\u01f2\u01f5\5\"\22\2\u01f3\u01f5\5 \21\2\u01f4\u01f1\3"+
		"\2\2\2\u01f4\u01f2\3\2\2\2\u01f4\u01f3\3\2\2\2\u01f5\'\3\2\2\2\u01f6\u01f7"+
		"\7\23\2\2\u01f7\u01f8\7\24\2\2\u01f8\u01f9\5\u011a\u008e\2\u01f9\u01fa"+
		"\7\25\2\2\u01fa\u01fb\5\u0080A\2\u01fb)\3\2\2\2\u01fc\u01fd\7\26\2\2\u01fd"+
		"\u01fe\5\u0082B\2\u01fe\u01ff\7\24\2\2\u01ff\u0200\5\u0104\u0083\2\u0200"+
		"\u0201\7\25\2\2\u0201+\3\2\2\2\u0202\u0203\7\27\2\2\u0203\u0204\5\64\33"+
		"\2\u0204-\3\2\2\2\u0205\u0206\7\30\2\2\u0206\u0207\7\u009c\2\2\u0207\u0208"+
		"\5\u0082B\2\u0208/\3\2\2\2\u0209\u020a\5\u0082B\2\u020a\u020b\7\u009c"+
		"\2\2\u020b\u020c\5\u0080A\2\u020c\61\3\2\2\2\u020d\u020e\5\u0082B\2\u020e"+
		"\u020f\7\u009c\2\2\u020f\u0210\5\64\33\2\u0210\63\3\2\2\2\u0211\u0216"+
		"\5\62\32\2\u0212\u0216\5\u014a\u00a6\2\u0213\u0216\5.\30\2\u0214\u0216"+
		"\5\60\31\2\u0215\u0211\3\2\2\2\u0215\u0212\3\2\2\2\u0215\u0213\3\2\2\2"+
		"\u0215\u0214\3\2\2\2\u0216\65\3\2\2\2\u0217\u0218\5\u0082B\2\u0218\u0219"+
		"\7\u009c\2\2\u0219\u021a\7\31\2\2\u021a\u021b\7\u009c\2\2\u021b\u021c"+
		"\5\u0080A\2\u021c\u0228\3\2\2\2\u021d\u021e\5\u0082B\2\u021e\u021f\7\u009c"+
		"\2\2\u021f\u0220\7\31\2\2\u0220\u0221\7\u009c\2\2\u0221\u0222\5\u011a"+
		"\u008e\2\u0222\u0228\3\2\2\2\u0223\u0224\5\u0082B\2\u0224\u0225\7\u009c"+
		"\2\2\u0225\u0226\7\31\2\2\u0226\u0228\3\2\2\2\u0227\u0217\3\2\2\2\u0227"+
		"\u021d\3\2\2\2\u0227\u0223\3\2\2\2\u0228\67\3\2\2\2\u0229\u022a\7\32\2"+
		"\2\u022a\u022b\5\u0080A\2\u022b\u022c\7\33\2\2\u022c\u022d\5\u0080A\2"+
		"\u022d9\3\2\2\2\u022e\u022f\7\32\2\2\u022f\u0230\5\u0080A\2\u0230\u0231"+
		"\7\34\2\2\u0231\u0232\5\u0080A\2\u0232;\3\2\2\2\u0233\u0234\7\32\2\2\u0234"+
		"\u0235\5\u0080A\2\u0235\u0236\7\35\2\2\u0236\u0237\5\u0080A\2\u0237=\3"+
		"\2\2\2\u0238\u0239\7\32\2\2\u0239\u023a\5\u0080A\2\u023a\u023b\7\36\2"+
		"\2\u023b\u023c\5\u0080A\2\u023c?\3\2\2\2\u023d\u023e\7\32\2\2\u023e\u023f"+
		"\5\u0080A\2\u023f\u0240\7\37\2\2\u0240\u0241\5\u0080A\2\u0241A\3\2\2\2"+
		"\u0242\u0243\7\32\2\2\u0243\u0244\5\u0080A\2\u0244\u0245\7 \2\2\u0245"+
		"\u0246\5\u0080A\2\u0246C\3\2\2\2\u0247\u0248\7\32\2\2\u0248\u0249\5\u0080"+
		"A\2\u0249\u024a\7!\2\2\u024a\u024b\5\u0080A\2\u024bE\3\2\2\2\u024c\u024d"+
		"\7\32\2\2\u024d\u024e\5\u0080A\2\u024e\u024f\7\"\2\2\u024f\u0250\5\u0080"+
		"A\2\u0250G\3\2\2\2\u0251\u0252\7\32\2\2\u0252\u0253\5\u0080A\2\u0253\u0254"+
		"\7#\2\2\u0254\u0255\5\u0080A\2\u0255I\3\2\2\2\u0256\u0257\7\32\2\2\u0257"+
		"\u0258\5\u0080A\2\u0258\u0259\7$\2\2\u0259\u025a\5\u0080A\2\u025aK\3\2"+
		"\2\2\u025b\u025c\7\32\2\2\u025c\u025d\5\u0080A\2\u025d\u025e\7%\2\2\u025e"+
		"\u025f\5\u0080A\2\u025fM\3\2\2\2\u0260\u0261\7\32\2\2\u0261\u0262\5\u0080"+
		"A\2\u0262\u0263\7&\2\2\u0263\u0264\5\u0080A\2\u0264O\3\2\2\2\u0265\u0266"+
		"\7\32\2\2\u0266\u0267\5\u0080A\2\u0267\u0268\7\'\2\2\u0268\u0269\5\u0080"+
		"A\2\u0269Q\3\2\2\2\u026a\u026b\7\32\2\2\u026b\u026c\5\u0080A\2\u026c\u026d"+
		"\7(\2\2\u026d\u026e\5\u0080A\2\u026eS\3\2\2\2\u026f\u0270\7\32\2\2\u0270"+
		"\u0271\5\u0080A\2\u0271\u0272\7)\2\2\u0272\u0273\5\u0080A\2\u0273U\3\2"+
		"\2\2\u0274\u0275\7\32\2\2\u0275\u0276\5\u0080A\2\u0276\u0277\7*\2\2\u0277"+
		"\u0278\5\u0080A\2\u0278W\3\2\2\2\u0279\u027a\7\32\2\2\u027a\u027b\5\u0080"+
		"A\2\u027b\u027c\7\34\2\2\u027c\u027d\7\34\2\2\u027d\u027e\5\u0080A\2\u027e"+
		"Y\3\2\2\2\u027f\u0280\7\32\2\2\u0280\u0281\5\u0080A\2\u0281\u0282\7\33"+
		"\2\2\u0282\u0283\7\33\2\2\u0283\u0284\5\u0080A\2\u0284[\3\2\2\2\u0285"+
		"\u0286\7\32\2\2\u0286\u0287\5\u0080A\2\u0287\u0288\7\33\2\2\u0288\u0289"+
		"\7\33\2\2\u0289\u028a\7\33\2\2\u028a\u028b\5\u0080A\2\u028b]\3\2\2\2\u028c"+
		"\u02a0\58\35\2\u028d\u02a0\5:\36\2\u028e\u02a0\5<\37\2\u028f\u02a0\5>"+
		" \2\u0290\u02a0\5@!\2\u0291\u02a0\5B\"\2\u0292\u02a0\5D#\2\u0293\u02a0"+
		"\5F$\2\u0294\u02a0\5H%\2\u0295\u02a0\5J&\2\u0296\u02a0\5L\'\2\u0297\u02a0"+
		"\5N(\2\u0298\u02a0\5P)\2\u0299\u02a0\5R*\2\u029a\u02a0\5T+\2\u029b\u02a0"+
		"\5V,\2\u029c\u02a0\5X-\2\u029d\u02a0\5Z.\2\u029e\u02a0\5\\/\2\u029f\u028c"+
		"\3\2\2\2\u029f\u028d\3\2\2\2\u029f\u028e\3\2\2\2\u029f\u028f\3\2\2\2\u029f"+
		"\u0290\3\2\2\2\u029f\u0291\3\2\2\2\u029f\u0292\3\2\2\2\u029f\u0293\3\2"+
		"\2\2\u029f\u0294\3\2\2\2\u029f\u0295\3\2\2\2\u029f\u0296\3\2\2\2\u029f"+
		"\u0297\3\2\2\2\u029f\u0298\3\2\2\2\u029f\u0299\3\2\2\2\u029f\u029a\3\2"+
		"\2\2\u029f\u029b\3\2\2\2\u029f\u029c\3\2\2\2\u029f\u029d\3\2\2\2\u029f"+
		"\u029e\3\2\2\2\u02a0_\3\2\2\2\u02a1\u02a2\7+\2\2\u02a2\u02a3\5\u0080A"+
		"\2\u02a3\u02a4\7,\2\2\u02a4\u02a5\5\u011a\u008e\2\u02a5a\3\2\2\2\u02a6"+
		"\u02a7\7-\2\2\u02a7\u02a8\5\u0082B\2\u02a8\u02a9\7\u009d\2\2\u02a9\u02aa"+
		"\5\u0080A\2\u02aac\3\2\2\2\u02ab\u02ac\7.\2\2\u02ac\u02ad\5\u0082B\2\u02ad"+
		"e\3\2\2\2\u02ae\u02af\7/\2\2\u02af\u02b0\7\60\2\2\u02b0\u02b1\5\u0080"+
		"A\2\u02b1g\3\2\2\2\u02b2\u02b3\7/\2\2\u02b3\u02b4\7\61\2\2\u02b4\u02b5"+
		"\5\u0080A\2\u02b5i\3\2\2\2\u02b6\u02b7\7/\2\2\u02b7\u02b8\7\62\2\2\u02b8"+
		"\u02b9\5\u0080A\2\u02b9k\3\2\2\2\u02ba\u02bb\7/\2\2\u02bb\u02bc\7\63\2"+
		"\2\u02bc\u02bd\5\u0080A\2\u02bdm\3\2\2\2\u02be\u02bf\7/\2\2\u02bf\u02c0"+
		"\5r:\2\u02c0o\3\2\2\2\u02c1\u02c2\7/\2\2\u02c2\u02c3\5t;\2\u02c3q\3\2"+
		"\2\2\u02c4\u02c5\7#\2\2\u02c5\u02c6\5\u0080A\2\u02c6s\3\2\2\2\u02c7\u02c8"+
		"\7$\2\2\u02c8\u02c9\5\u0080A\2\u02c9u\3\2\2\2\u02ca\u02d1\5f\64\2\u02cb"+
		"\u02d1\5h\65\2\u02cc\u02d1\5j\66\2\u02cd\u02d1\5l\67\2\u02ce\u02d1\5n"+
		"8\2\u02cf\u02d1\5p9\2\u02d0\u02ca\3\2\2\2\u02d0\u02cb\3\2\2\2\u02d0\u02cc"+
		"\3\2\2\2\u02d0\u02cd\3\2\2\2\u02d0\u02ce\3\2\2\2\u02d0\u02cf\3\2\2\2\u02d1"+
		"w\3\2\2\2\u02d2\u02d3\7\64\2\2\u02d3\u02d4\5\u0080A\2\u02d4\u02d5\7\62"+
		"\2\2\u02d5y\3\2\2\2\u02d6\u02d7\7\64\2\2\u02d7\u02d8\5\u0080A\2\u02d8"+
		"\u02d9\7\63\2\2\u02d9{\3\2\2\2\u02da\u02dd\5x=\2\u02db\u02dd\5z>\2\u02dc"+
		"\u02da\3\2\2\2\u02dc\u02db\3\2\2\2\u02dd}\3\2\2\2\u02de\u02df\7\65\2\2"+
		"\u02df\u02e0\5\u0080A\2\u02e0\u02e2\5\u0080A\2\u02e1\u02e3\5\u0154\u00ab"+
		"\2\u02e2\u02e1\3\2\2\2\u02e2\u02e3\3\2\2\2\u02e3\177\3\2\2\2\u02e4\u02f1"+
		"\5\u0082B\2\u02e5\u02f1\5\64\33\2\u02e6\u02f1\5\u0108\u0085\2\u02e7\u02f1"+
		"\5\u0150\u00a9\2\u02e8\u02f1\5\u0152\u00aa\2\u02e9\u02f1\5\u0146\u00a4"+
		"\2\u02ea\u02f1\5\u0148\u00a5\2\u02eb\u02f1\5\u014c\u00a7\2\u02ec\u02f1"+
		"\5\u014e\u00a8\2\u02ed\u02f1\5\66\34\2\u02ee\u02f1\5r:\2\u02ef\u02f1\5"+
		"t;\2\u02f0\u02e4\3\2\2\2\u02f0\u02e5\3\2\2\2\u02f0\u02e6\3\2\2\2\u02f0"+
		"\u02e7\3\2\2\2\u02f0\u02e8\3\2\2\2\u02f0\u02e9\3\2\2\2\u02f0\u02ea\3\2"+
		"\2\2\u02f0\u02eb\3\2\2\2\u02f0\u02ec\3\2\2\2\u02f0\u02ed\3\2\2\2\u02f0"+
		"\u02ee\3\2\2\2\u02f0\u02ef\3\2\2\2\u02f1\u0081\3\2\2\2\u02f2\u02f3\7\u0095"+
		"\2\2\u02f3\u0083\3\2\2\2\u02f4\u02f5\7\66\2\2\u02f5\u0085\3\2\2\2\u02f6"+
		"\u02f7\7\67\2\2\u02f7\u0087\3\2\2\2\u02f8\u02f9\78\2\2\u02f9\u02fa\5\u0082"+
		"B\2\u02fa\u0089\3\2\2\2\u02fb\u02fc\79\2\2\u02fc\u02fd\5\u0082B\2\u02fd"+
		"\u008b\3\2\2\2\u02fe\u02ff\7:\2\2\u02ff\u0300\5\u011a\u008e\2\u0300\u0301"+
		"\5\u0082B\2\u0301\u0302\7\24\2\2\u0302\u0305\7\25\2\2\u0303\u0304\7;\2"+
		"\2\u0304\u0306\5\u0080A\2\u0305\u0303\3\2\2\2\u0305\u0306\3\2\2\2\u0306"+
		"\u008d\3\2\2\2\u0307\u0308\7<\2\2\u0308\u0309\5\u0082B\2\u0309\u008f\3"+
		"\2\2\2\u030a\u030b\7=\2\2\u030b\u030c\5\u0082B\2\u030c\u0091\3\2\2\2\u030d"+
		"\u030e\7>\2\2\u030e\u030f\5\u0082B\2\u030f\u0093\3\2\2\2\u0310\u0311\7"+
		"?\2\2\u0311\u0312\5\u011a\u008e\2\u0312\u0314\7\24\2\2\u0313\u0315\5\u0106"+
		"\u0084\2\u0314\u0313\3\2\2\2\u0314\u0315\3\2\2\2\u0315\u0316\3\2\2\2\u0316"+
		"\u0317\7\25\2\2\u0317\u0318\5\u0082B\2\u0318\u0095\3\2\2\2\u0319\u031a"+
		"\7?\2\2\u031a\u031b\7@\2\2\u031b\u031d\7\24\2\2\u031c\u031e\5\u0106\u0084"+
		"\2\u031d\u031c\3\2\2\2\u031d\u031e\3\2\2\2\u031e\u031f\3\2\2\2\u031f\u0320"+
		"\7\25\2\2\u0320\u0321\5\u0082B\2\u0321\u0097\3\2\2\2\u0322\u0323\7A\2"+
		"\2\u0323\u0324\5\u0082B\2\u0324\u0325\7\24\2\2\u0325\u0326\5\u0104\u0083"+
		"\2\u0326\u0327\7\25\2\2\u0327\u0099\3\2\2\2\u0328\u0329\7B\2\2\u0329\u032a"+
		"\5\u0082B\2\u032a\u009b\3\2\2\2\u032b\u032c\7C\2\2\u032c\u032d\5\u011a"+
		"\u008e\2\u032d\u009d\3\2\2\2\u032e\u032f\7D\2\2\u032f\u0331\7\24\2\2\u0330"+
		"\u0332\5\u0106\u0084\2\u0331\u0330\3\2\2\2\u0331\u0332\3\2\2\2\u0332\u0333"+
		"\3\2\2\2\u0333\u0334\7\25\2\2\u0334\u0335\7E\2\2\u0335\u033f\7F\2\2\u0336"+
		"\u0337\7D\2\2\u0337\u0339\7\24\2\2\u0338\u033a\5\u0106\u0084\2\u0339\u0338"+
		"\3\2\2\2\u0339\u033a\3\2\2\2\u033a\u033b\3\2\2\2\u033b\u033c\7\25\2\2"+
		"\u033c\u033d\7E\2\2\u033d\u033f\5\u0080A\2\u033e\u032e\3\2\2\2\u033e\u0336"+
		"\3\2\2\2\u033f\u009f\3\2\2\2\u0340\u0341\7G\2\2\u0341\u0343\7H\2\2\u0342"+
		"\u0344\5\u0082B\2\u0343\u0342\3\2\2\2\u0343\u0344\3\2\2\2\u0344\u00a1"+
		"\3\2\2\2\u0345\u0346\7I\2\2\u0346\u0348\7J\2\2\u0347\u0349\5\u0082B\2"+
		"\u0348\u0347\3\2\2\2\u0348\u0349\3\2\2\2\u0349\u00a3\3\2\2\2\u034a\u034b"+
		"\7K\2\2\u034b\u034c\7L\2\2\u034c\u034d\5\u0080A\2\u034d\u00a5\3\2\2\2"+
		"\u034e\u034f\7M\2\2\u034f\u0350\7L\2\2\u0350\u0351\5\u0080A\2\u0351\u00a7"+
		"\3\2\2\2\u0352\u0353\7N\2\2\u0353\u0355\7O\2\2\u0354\u0356\5\u0080A\2"+
		"\u0355\u0354\3\2\2\2\u0355\u0356\3\2\2\2\u0356\u00a9\3\2\2\2\u0357\u0358"+
		"\7P\2\2\u0358\u0359\7Q\2\2\u0359\u035a\5\u0080A\2\u035a\u00ab\3\2\2\2"+
		"\u035b\u035c\7R\2\2\u035c\u035d\7S\2\2\u035d\u035e\5\u0080A\2\u035e\u00ad"+
		"\3\2\2\2\u035f\u0360\7T\2\2\u0360\u0361\7;\2\2\u0361\u00af\3\2\2\2\u0362"+
		"\u0363\7U\2\2\u0363\u0364\7V\2\2\u0364\u0365\5\u0080A\2\u0365\u00b1\3"+
		"\2\2\2\u0366\u0367\7W\2\2\u0367\u00b3\3\2\2\2\u0368\u0369\7X\2\2\u0369"+
		"\u036a\7Y\2\2\u036a\u036b\5\u0080A\2\u036b\u00b5\3\2\2\2\u036c\u036d\7"+
		"Z\2\2\u036d\u036e\7[\2\2\u036e\u036f\5\u011a\u008e\2\u036f\u00b7\3\2\2"+
		"\2\u0370\u0371\7\\\2\2\u0371\u00b9\3\2\2\2\u0372\u0373\7]\2\2\u0373\u0374"+
		"\7^\2\2\u0374\u0375\5\u0080A\2\u0375\u00bb\3\2\2\2\u0376\u0377\7_\2\2"+
		"\u0377\u00bd\3\2\2\2\u0378\u0379\7`\2\2\u0379\u00bf\3\2\2\2\u037a\u037b"+
		"\7a\2\2\u037b\u037c\5\u011a\u008e\2\u037c\u037d\7b\2\2\u037d\u00c1\3\2"+
		"\2\2\u037e\u037f\7c\2\2\u037f\u0380\7d\2\2\u0380\u00c3\3\2\2\2\u0381\u0384"+
		"\7e\2\2\u0382\u0383\7\4\2\2\u0383\u0385\5\u0080A\2\u0384\u0382\3\2\2\2"+
		"\u0384\u0385\3\2\2\2\u0385\u00c5\3\2\2\2\u0386\u0387\7f\2\2\u0387\u0388"+
		"\7g\2\2\u0388\u0389\5\u011a\u008e\2\u0389\u038a\7h\2\2\u038a\u038b\5\u0080"+
		"A\2\u038b\u038c\7\25\2\2\u038c\u00c7\3\2\2\2\u038d\u038e\5\4\3\2\u038e"+
		"\u038f\5\u0154\u00ab\2\u038f\u00c9\3\2\2\2\u0390\u0392\7i\2\2\u0391\u0393"+
		"\7\24\2\2\u0392\u0391\3\2\2\2\u0393\u0394\3\2\2\2\u0394\u0392\3\2\2\2"+
		"\u0394\u0395\3\2\2\2\u0395\u00cb\3\2\2\2\u0396\u0398\7i\2\2\u0397\u0399"+
		"\7\25\2\2\u0398\u0397\3\2\2\2\u0399\u039a\3\2\2\2\u039a\u0398\3\2\2\2"+
		"\u039a\u039b\3\2\2\2\u039b\u00cd\3\2\2\2\u039c\u039e\7i\2\2\u039d\u039f"+
		"\7j\2\2\u039e\u039d\3\2\2\2\u039f\u03a0\3\2\2\2\u03a0\u039e\3\2\2\2\u03a0"+
		"\u03a1\3\2\2\2\u03a1\u00cf\3\2\2\2\u03a2\u03a4\7i\2\2\u03a3\u03a5\7k\2"+
		"\2\u03a4\u03a3\3\2\2\2\u03a5\u03a6\3\2\2\2\u03a6\u03a4\3\2\2\2\u03a6\u03a7"+
		"\3\2\2\2\u03a7\u00d1\3\2\2\2\u03a8\u03aa\7i\2\2\u03a9\u03ab\7l\2\2\u03aa"+
		"\u03a9\3\2\2\2\u03ab\u03ac\3\2\2\2\u03ac\u03aa\3\2\2\2\u03ac\u03ad\3\2"+
		"\2\2\u03ad\u00d3\3\2\2\2\u03ae\u03af\7m\2\2\u03af\u00d5\3\2\2\2\u03b0"+
		"\u03b1\7n\2\2\u03b1\u00d7\3\2\2\2\u03b2\u03b3\7o\2\2\u03b3\u00d9\3\2\2"+
		"\2\u03b4\u03b5\7p\2\2\u03b5\u00db\3\2\2\2\u03b6\u03b7\7q\2\2\u03b7\u00dd"+
		"\3\2\2\2\u03b8\u03b9\7r\2\2\u03b9\u00df\3\2\2\2\u03ba\u03bb\7s\2\2\u03bb"+
		"\u00e1\3\2\2\2\u03bc\u03bd\7t\2\2\u03bd\u00e3\3\2\2\2\u03be\u03bf\7u\2"+
		"\2\u03bf\u00e5\3\2\2\2\u03c0\u03c1\7v\2\2\u03c1\u00e7\3\2\2\2\u03c2\u03c3"+
		"\7w\2\2\u03c3\u00e9\3\2\2\2\u03c4\u03c5\7x\2\2\u03c5\u00eb\3\2\2\2\u03c6"+
		"\u03c7\7y\2\2\u03c7\u00ed\3\2\2\2\u03c8\u03c9\7z\2\2\u03c9\u00ef\3\2\2"+
		"\2\u03ca\u03cb\7{\2\2\u03cb\u00f1\3\2\2\2\u03cc\u03cd\7|\2\2\u03cd\u00f3"+
		"\3\2\2\2\u03ce\u03d1\5\u0080A\2\u03cf\u03d1\5\u011a\u008e\2\u03d0\u03ce"+
		"\3\2\2\2\u03d0\u03cf\3\2\2\2\u03d1\u00f5\3\2\2\2\u03d2\u03d3\5\u00f4{"+
		"\2\u03d3\u00f7\3\2\2\2\u03d4\u03d7\7\30\2\2\u03d5\u03d6\7\u009c\2\2\u03d6"+
		"\u03d8\5\u00f4{\2\u03d7\u03d5\3\2\2\2\u03d7\u03d8\3\2\2\2\u03d8\u00f9"+
		"\3\2\2\2\u03d9\u03dc\7\31\2\2\u03da\u03db\7\u009c\2\2\u03db\u03dd\5\u00f4"+
		"{\2\u03dc\u03da\3\2\2\2\u03dc\u03dd\3\2\2\2\u03dd\u00fb\3\2\2\2\u03de"+
		"\u03e1\7}\2\2\u03df\u03e0\7\u009c\2\2\u03e0\u03e2\5\u00f4{\2\u03e1\u03df"+
		"\3\2\2\2\u03e1\u03e2\3\2\2\2\u03e2\u00fd\3\2\2\2\u03e3\u03e9\3\2\2\2\u03e4"+
		"\u03e9\5\u00f8}\2\u03e5\u03e9\5\u00fa~\2\u03e6\u03e9\5\u00fc\177\2\u03e7"+
		"\u03e9\5\u00f6|\2\u03e8\u03e3\3\2\2\2\u03e8\u03e4\3\2\2\2\u03e8\u03e5"+
		"\3\2\2\2\u03e8\u03e6\3\2\2\2\u03e8\u03e7\3\2\2\2\u03e9\u00ff\3\2\2\2\u03ea"+
		"\u03eb\7|\2\2\u03eb\u0101\3\2\2\2\u03ec\u03ed\5\u0080A\2\u03ed\u0103\3"+
		"\2\2\2\u03ee\u03f3\5\u00fe\u0080\2\u03ef\u03f0\7\u009b\2\2\u03f0\u03f2"+
		"\5\u0102\u0082\2\u03f1\u03ef\3\2\2\2\u03f2\u03f5\3\2\2\2\u03f3\u03f1\3"+
		"\2\2\2\u03f3\u03f4\3\2\2\2\u03f4\u0105\3\2\2\2\u03f5\u03f3\3\2\2\2\u03f6"+
		"\u03fb\5\u011a\u008e\2\u03f7\u03f8\7\u009b\2\2\u03f8\u03fa\5\u011a\u008e"+
		"\2\u03f9\u03f7\3\2\2\2\u03fa\u03fd\3\2\2\2\u03fb\u03f9\3\2\2\2\u03fb\u03fc"+
		"\3\2\2\2\u03fc\u0107\3\2\2\2\u03fd\u03fb\3\2\2\2\u03fe\u0405\5\u010a\u0086"+
		"\2\u03ff\u0405\5\u0110\u0089\2\u0400\u0405\5\u0112\u008a\2\u0401\u0405"+
		"\5\u0114\u008b\2\u0402\u0405\5\u0116\u008c\2\u0403\u0405\5\u0118\u008d"+
		"\2\u0404\u03fe\3\2\2\2\u0404\u03ff\3\2\2\2\u0404\u0400\3\2\2\2\u0404\u0401"+
		"\3\2\2\2\u0404\u0402\3\2\2\2\u0404\u0403\3\2\2\2\u0405\u0109\3\2\2\2\u0406"+
		"\u0409\5\u010c\u0087\2\u0407\u0409\5\u010e\u0088\2\u0408\u0406\3\2\2\2"+
		"\u0408\u0407\3\2\2\2\u0409\u010b\3\2\2\2\u040a\u040b\7\u0097\2\2\u040b"+
		"\u010d\3\2\2\2\u040c\u040d\7\u0098\2\2\u040d\u010f\3\2\2\2\u040e\u040f"+
		"\t\2\2\2\u040f\u0111\3\2\2\2\u0410\u0411\7\u0099\2\2\u0411\u0113\3\2\2"+
		"\2\u0412\u0413\7\u009a\2\2\u0413\u0115\3\2\2\2\u0414\u0415\7\u0080\2\2"+
		"\u0415\u0117\3\2\2\2\u0416\u0417\7\u0081\2\2\u0417\u0418\7\u009c\2\2\u0418"+
		"\u0419\5\u011a\u008e\2\u0419\u0119\3\2\2\2\u041a\u0422\5\u011c\u008f\2"+
		"\u041b\u0422\5\u011e\u0090\2\u041c\u0422\5\u0132\u009a\2\u041d\u0422\5"+
		"\u0134\u009b\2\u041e\u0422\5\u013c\u009f\2\u041f\u0422\5\u0142\u00a2\2"+
		"\u0420\u0422\5\u0144\u00a3\2\u0421\u041a\3\2\2\2\u0421\u041b\3\2\2\2\u0421"+
		"\u041c\3\2\2\2\u0421\u041d\3\2\2\2\u0421\u041e\3\2\2\2\u0421\u041f\3\2"+
		"\2\2\u0421\u0420\3\2\2\2\u0422\u011b\3\2\2\2\u0423\u0424\7\u0082\2\2\u0424"+
		"\u011d\3\2\2\2\u0425\u0426\t\3\2\2\u0426\u011f\3\2\2\2\u0427\u0428\5\u0082"+
		"B\2\u0428\u0121\3\2\2\2\u0429\u042a\7\u008b\2\2\u042a\u042b\5\u011a\u008e"+
		"\2\u042b\u0123\3\2\2\2\u042c\u042d\7\31\2\2\u042d\u042e\5\u011a\u008e"+
		"\2\u042e\u0125\3\2\2\2\u042f\u0432\5\u0122\u0092\2\u0430\u0432\5\u0124"+
		"\u0093\2\u0431\u042f\3\2\2\2\u0431\u0430\3\2\2\2\u0432\u0127\3\2\2\2\u0433"+
		"\u0435\7\u008c\2\2\u0434\u0436\5\u0126\u0094\2\u0435\u0434\3\2\2\2\u0435"+
		"\u0436\3\2\2\2\u0436\u0129\3\2\2\2\u0437\u043a\5\u011a\u008e\2\u0438\u043a"+
		"\5\u0128\u0095\2\u0439\u0437\3\2\2\2\u0439\u0438\3\2\2\2\u043a\u012b\3"+
		"\2\2\2\u043b\u043c\7\34\2\2\u043c\u0441\5\u012a\u0096\2\u043d\u043e\7"+
		"\u009b\2\2\u043e\u0440\5\u012a\u0096\2\u043f\u043d\3\2\2\2\u0440\u0443"+
		"\3\2\2\2\u0441\u043f\3\2\2\2\u0441\u0442\3\2\2\2\u0442\u0444\3\2\2\2\u0443"+
		"\u0441\3\2\2\2\u0444\u0445\7\33\2\2\u0445\u012d\3\2\2\2\u0446\u0447\5"+
		"\u0082B\2\u0447\u0448\5\u012c\u0097\2\u0448\u012f\3\2\2\2\u0449\u044c"+
		"\5\u0120\u0091\2\u044a\u044c\5\u012e\u0098\2\u044b\u0449\3\2\2\2\u044b"+
		"\u044a\3\2\2\2\u044c\u0131\3\2\2\2\u044d\u0452\5\u0130\u0099\2\u044e\u044f"+
		"\7\u009c\2\2\u044f\u0451\5\u0130\u0099\2\u0450\u044e\3\2\2\2\u0451\u0454"+
		"\3\2\2\2\u0452\u0450\3\2\2\2\u0452\u0453\3\2\2\2\u0453\u0133\3\2\2\2\u0454"+
		"\u0452\3\2\2\2\u0455\u0456\5\u011e\u0090\2\u0456\u0457\5\u0136\u009c\2"+
		"\u0457\u045c\3\2\2\2\u0458\u0459\5\u0132\u009a\2\u0459\u045a\5\u0136\u009c"+
		"\2\u045a\u045c\3\2\2\2\u045b\u0455\3\2\2\2\u045b\u0458\3\2\2\2\u045c\u0135"+
		"\3\2\2\2\u045d\u045e\7\u008d\2\2\u045e\u0463\7\u008e\2\2\u045f\u0460\7"+
		"\u008d\2\2\u0460\u0462\7\u008e\2\2\u0461\u045f\3\2\2\2\u0462\u0465\3\2"+
		"\2\2\u0463\u0461\3\2\2\2\u0463\u0464\3\2\2\2\u0464\u0137\3\2\2\2\u0465"+
		"\u0463\3\2\2\2\u0466\u046b\5\u0132\u009a\2\u0467\u046b\5\u011e\u0090\2"+
		"\u0468\u046b\5\u0134\u009b\2\u0469\u046b\5\u0144\u00a3\2\u046a\u0466\3"+
		"\2\2\2\u046a\u0467\3\2\2\2\u046a\u0468\3\2\2\2\u046a\u0469\3\2\2\2\u046b"+
		"\u0139\3\2\2\2\u046c\u0472\5\u0132\u009a\2\u046d\u0472\5\u011e\u0090\2"+
		"\u046e\u0472\5\u0134\u009b\2\u046f\u0472\5\u0144\u00a3\2\u0470\u0472\5"+
		"\u0142\u00a2\2\u0471\u046c\3\2\2\2\u0471\u046d\3\2\2\2\u0471\u046e\3\2"+
		"\2\2\u0471\u046f\3\2\2\2\u0471\u0470\3\2\2\2\u0472\u013b\3\2\2\2\u0473"+
		"\u0476\5\u0138\u009d\2\u0474\u0475\7\'\2\2\u0475\u0477\5\u013a\u009e\2"+
		"\u0476\u0474\3\2\2\2\u0477\u0478\3\2\2\2\u0478\u0476\3\2\2\2\u0478\u0479"+
		"\3\2\2\2\u0479\u013d\3\2\2\2\u047a\u047f\5\u0132\u009a\2\u047b\u047f\5"+
		"\u011e\u0090\2\u047c\u047f\5\u0134\u009b\2\u047d\u047f\5\u0144\u00a3\2"+
		"\u047e\u047a\3\2\2\2\u047e\u047b\3\2\2\2\u047e\u047c\3\2\2\2\u047e\u047d"+
		"\3\2\2\2\u047f\u013f\3\2\2\2\u0480\u0486\5\u0132\u009a\2\u0481\u0486\5"+
		"\u011e\u0090\2\u0482\u0486\5\u0134\u009b\2\u0483\u0486\5\u0144\u00a3\2"+
		"\u0484\u0486\5\u013c\u009f\2\u0485\u0480\3\2\2\2\u0485\u0481\3\2\2\2\u0485"+
		"\u0482\3\2\2\2\u0485\u0483\3\2\2\2\u0485\u0484\3\2\2\2\u0486\u0141\3\2"+
		"\2\2\u0487\u048a\5\u013e\u00a0\2\u0488\u0489\7(\2\2\u0489\u048b\5\u0140"+
		"\u00a1\2\u048a\u0488\3\2\2\2\u048b\u048c\3\2\2\2\u048c\u048a\3\2\2\2\u048c"+
		"\u048d\3\2\2\2\u048d\u0143\3\2\2\2\u048e\u048f\7\u008f\2\2\u048f\u0490"+
		"\5\u010c\u0087\2\u0490\u0491\7\u008c\2\2\u0491\u0492\5\u010c\u0087\2\u0492"+
		"\u0145\3\2\2\2\u0493\u0494\7\u0090\2\2\u0494\u0495\5\u010c\u0087\2\u0495"+
		"\u0496\7\u008c\2\2\u0496\u0497\5\u010c\u0087\2\u0497\u0147\3\2\2\2\u0498"+
		"\u0499\7\u0091\2\2\u0499\u049a\5\u010c\u0087\2\u049a\u049b\7\u008c\2\2"+
		"\u049b\u049c\5\u010c\u0087\2\u049c\u0149\3\2\2\2\u049d\u049e\7\u0092\2"+
		"\2\u049e\u049f\5\u010c\u0087\2\u049f\u04a0\7\u008c\2\2\u04a0\u04a1\5\u010c"+
		"\u0087\2\u04a1\u014b\3\2\2\2\u04a2\u04a3\7\u0093\2\2\u04a3\u04a4\5\u010c"+
		"\u0087\2\u04a4\u04a5\7\u008c\2\2\u04a5\u04a6\5\u010c\u0087\2\u04a6\u014d"+
		"\3\2\2\2\u04a7\u04a8\7\30\2\2\u04a8\u04a9\7\u009c\2\2\u04a9\u04af\5\u0080"+
		"A\2\u04aa\u04ab\7\30\2\2\u04ab\u04ac\7\u009c\2\2\u04ac\u04af\5\u011a\u008e"+
		"\2\u04ad\u04af\7\30\2\2\u04ae\u04a7\3\2\2\2\u04ae\u04aa\3\2\2\2\u04ae"+
		"\u04ad\3\2\2\2\u04af\u014f\3\2\2\2\u04b0\u04b1\7\u0094\2\2\u04b1\u0151"+
		"\3\2\2\2\u04b2\u04b3\7|\2\2\u04b3\u0153\3\2\2\2\u04b4\u04b6\7\u008e\2"+
		"\2\u04b5\u04b4\3\2\2\2\u04b6\u04b7\3\2\2\2\u04b7\u04b5\3\2\2\2\u04b7\u04b8"+
		"\3\2\2\2\u04b8\u0155\3\2\2\2\66\u018e\u019c\u01e6\u01f4\u0215\u0227\u029f"+
		"\u02d0\u02dc\u02e2\u02f0\u0305\u0314\u031d\u0331\u0339\u033e\u0343\u0348"+
		"\u0355\u0384\u0394\u039a\u03a0\u03a6\u03ac\u03d0\u03d7\u03dc\u03e1\u03e8"+
		"\u03f3\u03fb\u0404\u0408\u0421\u0431\u0435\u0439\u0441\u044b\u0452\u045b"+
		"\u0463\u046a\u0471\u0478\u047e\u0485\u048c\u04ae\u04b7";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}