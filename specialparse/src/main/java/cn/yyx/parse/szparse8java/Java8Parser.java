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
		T__143=144, T__144=145, T__145=146, IdentifierX=147, AT=148, ELLIPSIS=149, 
		IntegerLiteralX=150, FloatingPointLiteralX=151, CharacterLiteralX=152, 
		StringLiteralX=153, COMMA=154, DOT=155, COLONCOLON=156, WS=157;
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
		RULE_commonMethodInvocationStatement = 20, RULE_superConstructionInvocationStatement = 21, 
		RULE_typeCreationInvocationStatement = 22, RULE_thisConstructionInvocationStatement = 23, 
		RULE_methodInvocationStatement = 24, RULE_qualifiedAccessStatement = 25, 
		RULE_fieldAccessStatement = 26, RULE_chainFieldAccess = 27, RULE_referedFieldAccess = 28, 
		RULE_superFieldAccess = 29, RULE_thisFieldAccess = 30, RULE_fieldAccess = 31, 
		RULE_gtInfixExpressionStatement = 32, RULE_ltInfixExpressionStatement = 33, 
		RULE_equalInfixExpressionStatement = 34, RULE_leInfixExpressionStatement = 35, 
		RULE_geInfixExpressionStatement = 36, RULE_notequalInfixExpressionStatement = 37, 
		RULE_andInfixExpressionStatement = 38, RULE_orInfixExpressionStatement = 39, 
		RULE_addInfixExpressionStatement = 40, RULE_subInfixExpressionStatement = 41, 
		RULE_mulInfixExpressionStatement = 42, RULE_divInfixExpressionStatement = 43, 
		RULE_bitandInfixExpressionStatement = 44, RULE_bitorInfixExpressionStatement = 45, 
		RULE_caretInfixExpressionStatement = 46, RULE_modInfixExpressionStatement = 47, 
		RULE_lshiftInfixExpressionStatement = 48, RULE_rshiftInfixExpressionStatement = 49, 
		RULE_urshiftInfixExpressionStatement = 50, RULE_infixExpressionStatement = 51, 
		RULE_instanceofExpressionStatement = 52, RULE_commonMethodReferenceExpression = 53, 
		RULE_commonNewMethodReferenceExpression = 54, RULE_superMethodReferenceExpression = 55, 
		RULE_methodReferenceExpression = 56, RULE_methodReferenceStatement = 57, 
		RULE_commonNameStatement = 58, RULE_varRefNameStatement = 59, RULE_fieldRefNameStatement = 60, 
		RULE_nameStatement = 61, RULE_bangPrefixExpressionStatement = 62, RULE_tildePrefixExpressionStatement = 63, 
		RULE_incPrefixExpressionStatement = 64, RULE_decPrefixExpressionStatement = 65, 
		RULE_addPrefixExpressionStatement = 66, RULE_subPrefixExpressionStatement = 67, 
		RULE_addPrefixExpression = 68, RULE_subPrefixExpression = 69, RULE_prefixExpressionStatement = 70, 
		RULE_incPostfixExpressionStatement = 71, RULE_decPostfixExpressionStatement = 72, 
		RULE_postfixExpressionStatement = 73, RULE_arrayAccessStatement = 74, 
		RULE_referedExpression = 75, RULE_identifier = 76, RULE_anonymousClassBeginStatement = 77, 
		RULE_anonymousClassPlaceHolderStatement = 78, RULE_anonymousClassPreStatement = 79, 
		RULE_atInterfaceStatement = 80, RULE_annotationTypeMemberDeclarationStatement = 81, 
		RULE_classDeclarationStatement = 82, RULE_classInnerDeclarationStatement = 83, 
		RULE_enumDeclarationStatement = 84, RULE_methodDeclarationStatement = 85, 
		RULE_constructionDeclarationStatement = 86, RULE_enumConstantDeclarationStatement = 87, 
		RULE_labeledStatement = 88, RULE_variableDeclarationStatement = 89, RULE_lambdaExpressionStatement = 90, 
		RULE_breakStatement = 91, RULE_continueStatement = 92, RULE_doWhileStatement = 93, 
		RULE_whileStatement = 94, RULE_returnStatement = 95, RULE_switchStatement = 96, 
		RULE_switchCaseStatement = 97, RULE_defaultStatement = 98, RULE_synchronizedStatement = 99, 
		RULE_tryStatement = 100, RULE_throwStatement = 101, RULE_catchClauseStatement = 102, 
		RULE_finallyStatement = 103, RULE_ifStatement = 104, RULE_thenStatement = 105, 
		RULE_elseStatement = 106, RULE_arrayCreationStatement = 107, RULE_initializerStatement = 108, 
		RULE_variableDeclarationHolderStatement = 109, RULE_enhancedForStatement = 110, 
		RULE_partialEndArrayAccessStatement = 111, RULE_leftParentheseStatement = 112, 
		RULE_rightParentheseStatement = 113, RULE_leftBraceStatement = 114, RULE_rightBraceStatement = 115, 
		RULE_enterMethodParamStatement = 116, RULE_arrayInitializerStartStatement = 117, 
		RULE_arrayInitializerSplitCommaStatement = 118, RULE_arrayInitializerEndStatement = 119, 
		RULE_enumConstantDeclarationSplitCommaStatement = 120, RULE_forStatement = 121, 
		RULE_forIniOverStatement = 122, RULE_forExpOverStatement = 123, RULE_forUpdOverStatement = 124, 
		RULE_condExpBeginStatement = 125, RULE_condExpQuestionMarkStatement = 126, 
		RULE_condExpColonMarkStatement = 127, RULE_partialEndStatement = 128, 
		RULE_fullEndStatement = 129, RULE_partialMethodArgumentEndStatement = 130, 
		RULE_partialMethodPreRerferedExpressionEndStatement = 131, RULE_firstArgPreExist = 132, 
		RULE_firstArgReferedExpression = 133, RULE_commonClassMemberInvoke = 134, 
		RULE_selfClassMemberInvoke = 135, RULE_superClassMemberInvoke = 136, RULE_newClassInvoke = 137, 
		RULE_firstArg = 138, RULE_methodArgPreExist = 139, RULE_methodArgReferedExpression = 140, 
		RULE_argumentList = 141, RULE_argType = 142, RULE_lastArgType = 143, RULE_argTypeList = 144, 
		RULE_literal = 145, RULE_numberLiteral = 146, RULE_integerLiteral = 147, 
		RULE_floatingPointLiteral = 148, RULE_booleanLiteral = 149, RULE_characterLiteral = 150, 
		RULE_stringLiteral = 151, RULE_nullLiteral = 152, RULE_typeLiteral = 153, 
		RULE_type = 154, RULE_virtualInferredType = 155, RULE_primitiveType = 156, 
		RULE_simpleType = 157, RULE_extendBound = 158, RULE_superBound = 159, 
		RULE_wildcardBounds = 160, RULE_wildCardType = 161, RULE_typeArgument = 162, 
		RULE_typeArguments = 163, RULE_parameterizedType = 164, RULE_bothType = 165, 
		RULE_classOrInterfaceType = 166, RULE_arrayType = 167, RULE_dims = 168, 
		RULE_intersectionFirstType = 169, RULE_intersectionSecondType = 170, RULE_intersectionType = 171, 
		RULE_unionFirstType = 172, RULE_unionSecondType = 173, RULE_unionType = 174, 
		RULE_classRef = 175, RULE_finalFieldRef = 176, RULE_finalVarRef = 177, 
		RULE_commonFieldRef = 178, RULE_commonVarRef = 179, RULE_codeHole = 180, 
		RULE_preExist = 181, RULE_endOfArrayDeclarationIndexExpression = 182;
	public static final String[] ruleNames = {
		"statement", "expressionStatement", "assignAssignmentStatement", "mulassignAssignmentStatement", 
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
		"leftBraceStatement", "rightBraceStatement", "enterMethodParamStatement", 
		"arrayInitializerStartStatement", "arrayInitializerSplitCommaStatement", 
		"arrayInitializerEndStatement", "enumConstantDeclarationSplitCommaStatement", 
		"forStatement", "forIniOverStatement", "forExpOverStatement", "forUpdOverStatement", 
		"condExpBeginStatement", "condExpQuestionMarkStatement", "condExpColonMarkStatement", 
		"partialEndStatement", "fullEndStatement", "partialMethodArgumentEndStatement", 
		"partialMethodPreRerferedExpressionEndStatement", "firstArgPreExist", 
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
		null, "'A@'", "'='", "'*='", "'/='", "'%='", "'+='", "'-='", "'<<='", 
		"'>>='", "'>>>='", "'&='", "'^='", "'|='", "'L@+'", "'L@-'", "'L@'", "'CE@'", 
		"'('", "')'", "'MI@'", "'super'", "'this'", "'Q@'", "'FA@'", "'IxE@'", 
		"'>'", "'<'", "'=='", "'<='", "'>='", "'!='", "'&&'", "'||'", "'+'", "'-'", 
		"'*'", "'/'", "'&'", "'|'", "'^'", "'%'", "'InE@'", "'instanceof'", "'new'", 
		"'MR@'", "'N@'", "'PeE@'", "'!'", "'~'", "'++'", "'--'", "'PtE@'", "'[@'", 
		"'AB@AnonymousBegin'", "'DH@AnonymousDeclaration'", "'HT@'", "'AT@'", 
		"'AM@'", "'default'", "'CD@'", "'ICD@'", "'ED@'", "'MD@'", "'CR@'", "'EMD@'", 
		"'LD@'", "'VD@'", "'LE@'", "'->'", "'{}'", "'B@'", "'break'", "'C@'", 
		"'continue'", "'DW@'", "'while'", "'WS@'", "'RT@'", "'return'", "'SW@'", 
		"'switch'", "'CS@'", "'case'", "'DF@'", "'SC@'", "'synchronized'", "'DH@try'", 
		"'TS@'", "'throw'", "'CT@'", "'catch'", "'DH@finally'", "'IF@'", "'if'", 
		"'DH@then'", "'DH@else'", "'AC@'", "'IB@'", "'InitialBlock'", "'VH@'", 
		"'EF@'", "'for('", "':'", "'DH@'", "'{'", "'}'", "'@Em'", "'DH@A{'", "'DH@A,'", 
		"'DH@A}'", "'DH@E,'", "'DH@for'", "'DH@forIniOver'", "'DH@forExpOver'", 
		"'DH@forUpdOver'", "'DH@CondExpBegin'", "'DH@CondExpQM'", "'DH@CondExpCM'", 
		"'DH@,'", "'DH@;'", "'DH@Ps'", "'DH@Pr'", "'@PE'", "'true'", "'false'", 
		"'null'", "'class'", "'@IT'", "'float'", "'double'", "'boolean'", "'byte'", 
		"'short'", "'int'", "'long'", "'char'", "'extends'", "'?'", "'['", "']'", 
		"'@K'", "'@D'", "'@X'", "'@F'", "'@C'", "'@HO'", null, "'@'", "'...'", 
		null, null, null, null, "','", "'.'", "'::'"
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
		null, null, null, "IdentifierX", "AT", "ELLIPSIS", "IntegerLiteralX", 
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
			setState(422);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(366);
				anonymousClassBeginStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(367);
				anonymousClassPlaceHolderStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(368);
				anonymousClassPreStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(369);
				atInterfaceStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(370);
				annotationTypeMemberDeclarationStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(371);
				classDeclarationStatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(372);
				classInnerDeclarationStatement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(373);
				enumDeclarationStatement();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(374);
				methodDeclarationStatement();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(375);
				constructionDeclarationStatement();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(376);
				enumConstantDeclarationStatement();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(377);
				labeledStatement();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(378);
				variableDeclarationStatement();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(379);
				lambdaExpressionStatement();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(380);
				breakStatement();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(381);
				continueStatement();
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(382);
				doWhileStatement();
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(383);
				whileStatement();
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(384);
				returnStatement();
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(385);
				switchStatement();
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(386);
				switchCaseStatement();
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(387);
				defaultStatement();
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(388);
				synchronizedStatement();
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(389);
				tryStatement();
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(390);
				throwStatement();
				}
				break;
			case 26:
				enterOuterAlt(_localctx, 26);
				{
				setState(391);
				catchClauseStatement();
				}
				break;
			case 27:
				enterOuterAlt(_localctx, 27);
				{
				setState(392);
				finallyStatement();
				}
				break;
			case 28:
				enterOuterAlt(_localctx, 28);
				{
				setState(393);
				ifStatement();
				}
				break;
			case 29:
				enterOuterAlt(_localctx, 29);
				{
				setState(394);
				thenStatement();
				}
				break;
			case 30:
				enterOuterAlt(_localctx, 30);
				{
				setState(395);
				elseStatement();
				}
				break;
			case 31:
				enterOuterAlt(_localctx, 31);
				{
				setState(396);
				arrayCreationStatement();
				}
				break;
			case 32:
				enterOuterAlt(_localctx, 32);
				{
				setState(397);
				initializerStatement();
				}
				break;
			case 33:
				enterOuterAlt(_localctx, 33);
				{
				setState(398);
				variableDeclarationHolderStatement();
				}
				break;
			case 34:
				enterOuterAlt(_localctx, 34);
				{
				setState(399);
				enhancedForStatement();
				}
				break;
			case 35:
				enterOuterAlt(_localctx, 35);
				{
				setState(400);
				partialEndArrayAccessStatement();
				}
				break;
			case 36:
				enterOuterAlt(_localctx, 36);
				{
				setState(401);
				leftParentheseStatement();
				}
				break;
			case 37:
				enterOuterAlt(_localctx, 37);
				{
				setState(402);
				rightParentheseStatement();
				}
				break;
			case 38:
				enterOuterAlt(_localctx, 38);
				{
				setState(403);
				leftBraceStatement();
				}
				break;
			case 39:
				enterOuterAlt(_localctx, 39);
				{
				setState(404);
				rightBraceStatement();
				}
				break;
			case 40:
				enterOuterAlt(_localctx, 40);
				{
				setState(405);
				enterMethodParamStatement();
				}
				break;
			case 41:
				enterOuterAlt(_localctx, 41);
				{
				setState(406);
				arrayInitializerStartStatement();
				}
				break;
			case 42:
				enterOuterAlt(_localctx, 42);
				{
				setState(407);
				arrayInitializerSplitCommaStatement();
				}
				break;
			case 43:
				enterOuterAlt(_localctx, 43);
				{
				setState(408);
				arrayInitializerEndStatement();
				}
				break;
			case 44:
				enterOuterAlt(_localctx, 44);
				{
				setState(409);
				enumConstantDeclarationSplitCommaStatement();
				}
				break;
			case 45:
				enterOuterAlt(_localctx, 45);
				{
				setState(410);
				forStatement();
				}
				break;
			case 46:
				enterOuterAlt(_localctx, 46);
				{
				setState(411);
				forIniOverStatement();
				}
				break;
			case 47:
				enterOuterAlt(_localctx, 47);
				{
				setState(412);
				forExpOverStatement();
				}
				break;
			case 48:
				enterOuterAlt(_localctx, 48);
				{
				setState(413);
				forUpdOverStatement();
				}
				break;
			case 49:
				enterOuterAlt(_localctx, 49);
				{
				setState(414);
				condExpBeginStatement();
				}
				break;
			case 50:
				enterOuterAlt(_localctx, 50);
				{
				setState(415);
				condExpQuestionMarkStatement();
				}
				break;
			case 51:
				enterOuterAlt(_localctx, 51);
				{
				setState(416);
				condExpColonMarkStatement();
				}
				break;
			case 52:
				enterOuterAlt(_localctx, 52);
				{
				setState(417);
				partialEndStatement();
				}
				break;
			case 53:
				enterOuterAlt(_localctx, 53);
				{
				setState(418);
				fullEndStatement();
				}
				break;
			case 54:
				enterOuterAlt(_localctx, 54);
				{
				setState(419);
				partialMethodArgumentEndStatement();
				}
				break;
			case 55:
				enterOuterAlt(_localctx, 55);
				{
				setState(420);
				partialMethodPreRerferedExpressionEndStatement();
				}
				break;
			case 56:
				enterOuterAlt(_localctx, 56);
				{
				setState(421);
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
		enterRule(_localctx, 2, RULE_expressionStatement);
		try {
			setState(437);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(424);
				assignmentStatement();
				}
				break;
			case T__13:
			case T__14:
			case T__15:
				enterOuterAlt(_localctx, 2);
				{
				setState(425);
				literalStatement();
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 3);
				{
				setState(426);
				castExpressionStatement();
				}
				break;
			case T__19:
				enterOuterAlt(_localctx, 4);
				{
				setState(427);
				methodInvocationStatement();
				}
				break;
			case T__23:
				enterOuterAlt(_localctx, 5);
				{
				setState(428);
				fieldAccessStatement();
				}
				break;
			case T__22:
				enterOuterAlt(_localctx, 6);
				{
				setState(429);
				qualifiedAccessStatement();
				}
				break;
			case T__24:
				enterOuterAlt(_localctx, 7);
				{
				setState(430);
				infixExpressionStatement();
				}
				break;
			case T__41:
				enterOuterAlt(_localctx, 8);
				{
				setState(431);
				instanceofExpressionStatement();
				}
				break;
			case T__44:
				enterOuterAlt(_localctx, 9);
				{
				setState(432);
				methodReferenceStatement();
				}
				break;
			case T__45:
				enterOuterAlt(_localctx, 10);
				{
				setState(433);
				nameStatement();
				}
				break;
			case T__46:
				enterOuterAlt(_localctx, 11);
				{
				setState(434);
				prefixExpressionStatement();
				}
				break;
			case T__51:
				enterOuterAlt(_localctx, 12);
				{
				setState(435);
				postfixExpressionStatement();
				}
				break;
			case T__52:
				enterOuterAlt(_localctx, 13);
				{
				setState(436);
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
			setState(439);
			match(T__0);
			setState(440);
			referedExpression();
			setState(441);
			match(T__1);
			setState(442);
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
			setState(444);
			match(T__0);
			setState(445);
			referedExpression();
			setState(446);
			match(T__2);
			setState(447);
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
			setState(449);
			match(T__0);
			setState(450);
			referedExpression();
			setState(451);
			match(T__3);
			setState(452);
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
			setState(454);
			match(T__0);
			setState(455);
			referedExpression();
			setState(456);
			match(T__4);
			setState(457);
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
			setState(459);
			match(T__0);
			setState(460);
			referedExpression();
			setState(461);
			match(T__5);
			setState(462);
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
			setState(464);
			match(T__0);
			setState(465);
			referedExpression();
			setState(466);
			match(T__6);
			setState(467);
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
			setState(469);
			match(T__0);
			setState(470);
			referedExpression();
			setState(471);
			match(T__7);
			setState(472);
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
			setState(474);
			match(T__0);
			setState(475);
			referedExpression();
			setState(476);
			match(T__8);
			setState(477);
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
			setState(479);
			match(T__0);
			setState(480);
			referedExpression();
			setState(481);
			match(T__9);
			setState(482);
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
			setState(484);
			match(T__0);
			setState(485);
			referedExpression();
			setState(486);
			match(T__10);
			setState(487);
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
			setState(489);
			match(T__0);
			setState(490);
			referedExpression();
			setState(491);
			match(T__11);
			setState(492);
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
			setState(494);
			match(T__0);
			setState(495);
			referedExpression();
			setState(496);
			match(T__12);
			setState(497);
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
			setState(511);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(499);
				assignAssignmentStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(500);
				mulassignAssignmentStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(501);
				divassignAssignmentStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(502);
				modassignAssignmentStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(503);
				addassignAssignmentStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(504);
				subassignAssignmentStatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(505);
				lshiftassignAssignmentStatement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(506);
				rshiftassignAssignmentStatement();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(507);
				urshiftassignAssignmentStatement();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(508);
				andassignAssignmentStatement();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(509);
				xorassignAssignmentStatement();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(510);
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
			setState(513);
			match(T__13);
			setState(514);
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
			setState(516);
			match(T__14);
			setState(517);
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
			setState(519);
			match(T__15);
			setState(520);
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
			setState(525);
			switch (_input.LA(1)) {
			case T__15:
				enterOuterAlt(_localctx, 1);
				{
				setState(522);
				normalLiteralStatement();
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 2);
				{
				setState(523);
				negativeLiteralStatement();
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 3);
				{
				setState(524);
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
			setState(527);
			match(T__16);
			setState(528);
			match(T__17);
			setState(529);
			type();
			setState(530);
			match(T__18);
			setState(531);
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
		enterRule(_localctx, 40, RULE_commonMethodInvocationStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(533);
			match(T__19);
			setState(534);
			identifier();
			setState(535);
			match(T__17);
			setState(536);
			argumentList();
			setState(537);
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
		enterRule(_localctx, 42, RULE_superConstructionInvocationStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(539);
			match(T__19);
			setState(540);
			match(T__20);
			setState(541);
			match(T__17);
			setState(542);
			argumentList();
			setState(543);
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
		enterRule(_localctx, 44, RULE_typeCreationInvocationStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(545);
			match(T__19);
			setState(546);
			type();
			setState(547);
			match(T__17);
			setState(548);
			argumentList();
			setState(549);
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
		enterRule(_localctx, 46, RULE_thisConstructionInvocationStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(551);
			match(T__19);
			setState(552);
			match(T__21);
			setState(553);
			match(T__17);
			setState(554);
			argumentList();
			setState(555);
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
		enterRule(_localctx, 48, RULE_methodInvocationStatement);
		try {
			setState(561);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(557);
				commonMethodInvocationStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(558);
				superConstructionInvocationStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(559);
				typeCreationInvocationStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(560);
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
		enterRule(_localctx, 50, RULE_qualifiedAccessStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(563);
			match(T__22);
			setState(564);
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
		enterRule(_localctx, 52, RULE_fieldAccessStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(566);
			match(T__23);
			setState(567);
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
		enterRule(_localctx, 54, RULE_chainFieldAccess);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(569);
			identifier();
			setState(570);
			match(DOT);
			setState(571);
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
		enterRule(_localctx, 56, RULE_referedFieldAccess);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(573);
			identifier();
			setState(574);
			match(DOT);
			setState(575);
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
		enterRule(_localctx, 58, RULE_superFieldAccess);
		try {
			setState(593);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(577);
				identifier();
				setState(578);
				match(DOT);
				setState(579);
				match(T__20);
				setState(580);
				match(DOT);
				setState(581);
				referedExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(583);
				identifier();
				setState(584);
				match(DOT);
				setState(585);
				match(T__20);
				setState(586);
				match(DOT);
				setState(587);
				type();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(589);
				identifier();
				setState(590);
				match(DOT);
				setState(591);
				match(T__20);
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
		enterRule(_localctx, 60, RULE_thisFieldAccess);
		try {
			setState(602);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(595);
				match(T__21);
				setState(596);
				match(DOT);
				setState(597);
				referedExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(598);
				match(T__21);
				setState(599);
				match(DOT);
				setState(600);
				type();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(601);
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
		enterRule(_localctx, 62, RULE_fieldAccess);
		try {
			setState(609);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(604);
				chainFieldAccess();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(605);
				commonFieldRef();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(606);
				referedFieldAccess();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(607);
				superFieldAccess();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(608);
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
		enterRule(_localctx, 64, RULE_gtInfixExpressionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(611);
			match(T__24);
			setState(612);
			referedExpression();
			setState(613);
			match(T__25);
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
		enterRule(_localctx, 66, RULE_ltInfixExpressionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(616);
			match(T__24);
			setState(617);
			referedExpression();
			setState(618);
			match(T__26);
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
		enterRule(_localctx, 68, RULE_equalInfixExpressionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(621);
			match(T__24);
			setState(622);
			referedExpression();
			setState(623);
			match(T__27);
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
		enterRule(_localctx, 70, RULE_leInfixExpressionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(626);
			match(T__24);
			setState(627);
			referedExpression();
			setState(628);
			match(T__28);
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
		enterRule(_localctx, 72, RULE_geInfixExpressionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(631);
			match(T__24);
			setState(632);
			referedExpression();
			setState(633);
			match(T__29);
			setState(634);
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
		enterRule(_localctx, 74, RULE_notequalInfixExpressionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(636);
			match(T__24);
			setState(637);
			referedExpression();
			setState(638);
			match(T__30);
			setState(639);
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
		enterRule(_localctx, 76, RULE_andInfixExpressionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(641);
			match(T__24);
			setState(642);
			referedExpression();
			setState(643);
			match(T__31);
			setState(644);
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
		enterRule(_localctx, 78, RULE_orInfixExpressionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(646);
			match(T__24);
			setState(647);
			referedExpression();
			setState(648);
			match(T__32);
			setState(649);
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
		enterRule(_localctx, 80, RULE_addInfixExpressionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(651);
			match(T__24);
			setState(652);
			referedExpression();
			setState(653);
			match(T__33);
			setState(654);
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
		enterRule(_localctx, 82, RULE_subInfixExpressionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(656);
			match(T__24);
			setState(657);
			referedExpression();
			setState(658);
			match(T__34);
			setState(659);
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
		enterRule(_localctx, 84, RULE_mulInfixExpressionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(661);
			match(T__24);
			setState(662);
			referedExpression();
			setState(663);
			match(T__35);
			setState(664);
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
		enterRule(_localctx, 86, RULE_divInfixExpressionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(666);
			match(T__24);
			setState(667);
			referedExpression();
			setState(668);
			match(T__36);
			setState(669);
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
		enterRule(_localctx, 88, RULE_bitandInfixExpressionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(671);
			match(T__24);
			setState(672);
			referedExpression();
			setState(673);
			match(T__37);
			setState(674);
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
		enterRule(_localctx, 90, RULE_bitorInfixExpressionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(676);
			match(T__24);
			setState(677);
			referedExpression();
			setState(678);
			match(T__38);
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
		enterRule(_localctx, 92, RULE_caretInfixExpressionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(681);
			match(T__24);
			setState(682);
			referedExpression();
			setState(683);
			match(T__39);
			setState(684);
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
		enterRule(_localctx, 94, RULE_modInfixExpressionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(686);
			match(T__24);
			setState(687);
			referedExpression();
			setState(688);
			match(T__40);
			setState(689);
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
		enterRule(_localctx, 96, RULE_lshiftInfixExpressionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(691);
			match(T__24);
			setState(692);
			referedExpression();
			setState(693);
			match(T__26);
			setState(694);
			match(T__26);
			setState(695);
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
		enterRule(_localctx, 98, RULE_rshiftInfixExpressionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(697);
			match(T__24);
			setState(698);
			referedExpression();
			setState(699);
			match(T__25);
			setState(700);
			match(T__25);
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
		enterRule(_localctx, 100, RULE_urshiftInfixExpressionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(703);
			match(T__24);
			setState(704);
			referedExpression();
			setState(705);
			match(T__25);
			setState(706);
			match(T__25);
			setState(707);
			match(T__25);
			setState(708);
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
		enterRule(_localctx, 102, RULE_infixExpressionStatement);
		try {
			setState(729);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(710);
				gtInfixExpressionStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(711);
				ltInfixExpressionStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(712);
				equalInfixExpressionStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(713);
				leInfixExpressionStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(714);
				geInfixExpressionStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(715);
				notequalInfixExpressionStatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(716);
				andInfixExpressionStatement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(717);
				orInfixExpressionStatement();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(718);
				addInfixExpressionStatement();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(719);
				subInfixExpressionStatement();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(720);
				mulInfixExpressionStatement();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(721);
				divInfixExpressionStatement();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(722);
				bitandInfixExpressionStatement();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(723);
				bitorInfixExpressionStatement();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(724);
				caretInfixExpressionStatement();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(725);
				modInfixExpressionStatement();
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(726);
				lshiftInfixExpressionStatement();
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(727);
				rshiftInfixExpressionStatement();
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(728);
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
		enterRule(_localctx, 104, RULE_instanceofExpressionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(731);
			match(T__41);
			setState(732);
			referedExpression();
			setState(733);
			match(T__42);
			setState(734);
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
		enterRule(_localctx, 106, RULE_commonMethodReferenceExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(736);
			identifier();
			setState(737);
			match(COLONCOLON);
			setState(738);
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
		enterRule(_localctx, 108, RULE_commonNewMethodReferenceExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(740);
			match(T__43);
			setState(741);
			match(COLONCOLON);
			setState(742);
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
		enterRule(_localctx, 110, RULE_superMethodReferenceExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(744);
			identifier();
			setState(745);
			match(COLONCOLON);
			setState(746);
			match(T__20);
			setState(749);
			_la = _input.LA(1);
			if (_la==DOT) {
				{
				setState(747);
				match(DOT);
				setState(748);
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
		enterRule(_localctx, 112, RULE_methodReferenceExpression);
		try {
			setState(754);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(751);
				commonMethodReferenceExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(752);
				commonNewMethodReferenceExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(753);
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
		enterRule(_localctx, 114, RULE_methodReferenceStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(756);
			match(T__44);
			setState(757);
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
		enterRule(_localctx, 116, RULE_commonNameStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(759);
			match(T__45);
			setState(760);
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
		enterRule(_localctx, 118, RULE_varRefNameStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(762);
			match(T__45);
			setState(763);
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
		enterRule(_localctx, 120, RULE_fieldRefNameStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(765);
			match(T__45);
			setState(766);
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
		enterRule(_localctx, 122, RULE_nameStatement);
		try {
			setState(771);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(768);
				commonNameStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(769);
				varRefNameStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(770);
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
		enterRule(_localctx, 124, RULE_bangPrefixExpressionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(773);
			match(T__46);
			setState(774);
			match(T__47);
			setState(775);
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
		enterRule(_localctx, 126, RULE_tildePrefixExpressionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(777);
			match(T__46);
			setState(778);
			match(T__48);
			setState(779);
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
		enterRule(_localctx, 128, RULE_incPrefixExpressionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(781);
			match(T__46);
			setState(782);
			match(T__49);
			setState(783);
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
		enterRule(_localctx, 130, RULE_decPrefixExpressionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(785);
			match(T__46);
			setState(786);
			match(T__50);
			setState(787);
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
		enterRule(_localctx, 132, RULE_addPrefixExpressionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(789);
			match(T__46);
			setState(790);
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
		enterRule(_localctx, 134, RULE_subPrefixExpressionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(792);
			match(T__46);
			setState(793);
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
		enterRule(_localctx, 136, RULE_addPrefixExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(795);
			match(T__33);
			setState(796);
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
		enterRule(_localctx, 138, RULE_subPrefixExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(798);
			match(T__34);
			setState(799);
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
		enterRule(_localctx, 140, RULE_prefixExpressionStatement);
		try {
			setState(807);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(801);
				bangPrefixExpressionStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(802);
				tildePrefixExpressionStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(803);
				incPrefixExpressionStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(804);
				decPrefixExpressionStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(805);
				addPrefixExpressionStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(806);
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
		enterRule(_localctx, 142, RULE_incPostfixExpressionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(809);
			match(T__51);
			setState(810);
			referedExpression();
			setState(811);
			match(T__49);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 144, RULE_decPostfixExpressionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(813);
			match(T__51);
			setState(814);
			referedExpression();
			setState(815);
			match(T__50);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 146, RULE_postfixExpressionStatement);
		try {
			setState(819);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(817);
				incPostfixExpressionStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(818);
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
		enterRule(_localctx, 148, RULE_arrayAccessStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(821);
			match(T__52);
			setState(822);
			referedExpression();
			setState(823);
			referedExpression();
			setState(825);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(824);
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
		enterRule(_localctx, 150, RULE_referedExpression);
		try {
			setState(838);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(827);
				identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(828);
				fieldAccess();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(829);
				literal();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(830);
				codeHole();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(831);
				preExist();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(832);
				finalFieldRef();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(833);
				finalVarRef();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(834);
				commonVarRef();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(835);
				addPrefixExpression();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(836);
				subPrefixExpression();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(837);
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
		enterRule(_localctx, 152, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(840);
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
		enterRule(_localctx, 154, RULE_anonymousClassBeginStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(842);
			match(T__53);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 156, RULE_anonymousClassPlaceHolderStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(844);
			match(T__54);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 158, RULE_anonymousClassPreStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(846);
			match(T__55);
			setState(847);
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
		enterRule(_localctx, 160, RULE_atInterfaceStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(849);
			match(T__56);
			setState(850);
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
		enterRule(_localctx, 162, RULE_annotationTypeMemberDeclarationStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(852);
			match(T__57);
			setState(853);
			type();
			setState(854);
			identifier();
			setState(855);
			match(T__17);
			setState(856);
			match(T__18);
			setState(859);
			_la = _input.LA(1);
			if (_la==T__58) {
				{
				setState(857);
				match(T__58);
				setState(858);
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
		enterRule(_localctx, 164, RULE_classDeclarationStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(861);
			match(T__59);
			setState(862);
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
		enterRule(_localctx, 166, RULE_classInnerDeclarationStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(864);
			match(T__60);
			setState(865);
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
		enterRule(_localctx, 168, RULE_enumDeclarationStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(867);
			match(T__61);
			setState(868);
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
		enterRule(_localctx, 170, RULE_methodDeclarationStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(870);
			match(T__62);
			setState(871);
			type();
			setState(872);
			match(T__17);
			setState(874);
			_la = _input.LA(1);
			if (((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (T__127 - 128)) | (1L << (T__128 - 128)) | (1L << (T__129 - 128)) | (1L << (T__130 - 128)) | (1L << (T__131 - 128)) | (1L << (T__132 - 128)) | (1L << (T__133 - 128)) | (1L << (T__134 - 128)) | (1L << (T__135 - 128)) | (1L << (T__140 - 128)) | (1L << (IdentifierX - 128)))) != 0)) {
				{
				setState(873);
				argTypeList();
				}
			}

			setState(876);
			match(T__18);
			setState(877);
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
		enterRule(_localctx, 172, RULE_constructionDeclarationStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(879);
			match(T__62);
			setState(880);
			match(T__63);
			setState(881);
			match(T__17);
			setState(883);
			_la = _input.LA(1);
			if (((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (T__127 - 128)) | (1L << (T__128 - 128)) | (1L << (T__129 - 128)) | (1L << (T__130 - 128)) | (1L << (T__131 - 128)) | (1L << (T__132 - 128)) | (1L << (T__133 - 128)) | (1L << (T__134 - 128)) | (1L << (T__135 - 128)) | (1L << (T__140 - 128)) | (1L << (IdentifierX - 128)))) != 0)) {
				{
				setState(882);
				argTypeList();
				}
			}

			setState(885);
			match(T__18);
			setState(886);
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
		enterRule(_localctx, 174, RULE_enumConstantDeclarationStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(888);
			match(T__64);
			setState(889);
			identifier();
			setState(890);
			match(T__17);
			setState(891);
			argumentList();
			setState(892);
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
		enterRule(_localctx, 176, RULE_labeledStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(894);
			match(T__65);
			setState(895);
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
		enterRule(_localctx, 178, RULE_variableDeclarationStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(897);
			match(T__66);
			setState(898);
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
		enterRule(_localctx, 180, RULE_lambdaExpressionStatement);
		int _la;
		try {
			setState(916);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(900);
				match(T__67);
				setState(901);
				match(T__17);
				setState(903);
				_la = _input.LA(1);
				if (((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (T__127 - 128)) | (1L << (T__128 - 128)) | (1L << (T__129 - 128)) | (1L << (T__130 - 128)) | (1L << (T__131 - 128)) | (1L << (T__132 - 128)) | (1L << (T__133 - 128)) | (1L << (T__134 - 128)) | (1L << (T__135 - 128)) | (1L << (T__140 - 128)) | (1L << (IdentifierX - 128)))) != 0)) {
					{
					setState(902);
					argTypeList();
					}
				}

				setState(905);
				match(T__18);
				setState(906);
				match(T__68);
				setState(907);
				match(T__69);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(908);
				match(T__67);
				setState(909);
				match(T__17);
				setState(911);
				_la = _input.LA(1);
				if (((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (T__127 - 128)) | (1L << (T__128 - 128)) | (1L << (T__129 - 128)) | (1L << (T__130 - 128)) | (1L << (T__131 - 128)) | (1L << (T__132 - 128)) | (1L << (T__133 - 128)) | (1L << (T__134 - 128)) | (1L << (T__135 - 128)) | (1L << (T__140 - 128)) | (1L << (IdentifierX - 128)))) != 0)) {
					{
					setState(910);
					argTypeList();
					}
				}

				setState(913);
				match(T__18);
				setState(914);
				match(T__68);
				setState(915);
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
		enterRule(_localctx, 182, RULE_breakStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(918);
			match(T__70);
			setState(919);
			match(T__71);
			setState(921);
			_la = _input.LA(1);
			if (_la==IdentifierX) {
				{
				setState(920);
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
		enterRule(_localctx, 184, RULE_continueStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(923);
			match(T__72);
			setState(924);
			match(T__73);
			setState(926);
			_la = _input.LA(1);
			if (_la==IdentifierX) {
				{
				setState(925);
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
		enterRule(_localctx, 186, RULE_doWhileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(928);
			match(T__74);
			setState(929);
			match(T__75);
			setState(930);
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
		enterRule(_localctx, 188, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(932);
			match(T__76);
			setState(933);
			match(T__75);
			setState(934);
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
		enterRule(_localctx, 190, RULE_returnStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(936);
			match(T__77);
			setState(937);
			match(T__78);
			setState(939);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__21) | (1L << T__33) | (1L << T__34) | (1L << T__43))) != 0) || ((((_la - 123)) & ~0x3f) == 0 && ((1L << (_la - 123)) & ((1L << (T__122 - 123)) | (1L << (T__123 - 123)) | (1L << (T__124 - 123)) | (1L << (T__125 - 123)) | (1L << (T__126 - 123)) | (1L << (T__141 - 123)) | (1L << (T__142 - 123)) | (1L << (T__143 - 123)) | (1L << (T__144 - 123)) | (1L << (T__145 - 123)) | (1L << (IdentifierX - 123)) | (1L << (IntegerLiteralX - 123)) | (1L << (FloatingPointLiteralX - 123)) | (1L << (CharacterLiteralX - 123)) | (1L << (StringLiteralX - 123)))) != 0)) {
				{
				setState(938);
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
		enterRule(_localctx, 192, RULE_switchStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(941);
			match(T__79);
			setState(942);
			match(T__80);
			setState(943);
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
		enterRule(_localctx, 194, RULE_switchCaseStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(945);
			match(T__81);
			setState(946);
			match(T__82);
			setState(947);
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
		enterRule(_localctx, 196, RULE_defaultStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(949);
			match(T__83);
			setState(950);
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
		enterRule(_localctx, 198, RULE_synchronizedStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(952);
			match(T__84);
			setState(953);
			match(T__85);
			setState(954);
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
		enterRule(_localctx, 200, RULE_tryStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(956);
			match(T__86);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 202, RULE_throwStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(958);
			match(T__87);
			setState(959);
			match(T__88);
			setState(960);
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
		enterRule(_localctx, 204, RULE_catchClauseStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(962);
			match(T__89);
			setState(963);
			match(T__90);
			setState(964);
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
		enterRule(_localctx, 206, RULE_finallyStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(966);
			match(T__91);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 208, RULE_ifStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(968);
			match(T__92);
			setState(969);
			match(T__93);
			setState(970);
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
		enterRule(_localctx, 210, RULE_thenStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(972);
			match(T__94);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 212, RULE_elseStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(974);
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
		enterRule(_localctx, 214, RULE_arrayCreationStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(976);
			match(T__96);
			setState(977);
			type();
			setState(978);
			match(T__17);
			setState(979);
			match(T__43);
			setState(980);
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
		enterRule(_localctx, 216, RULE_initializerStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(982);
			match(T__97);
			setState(983);
			match(T__98);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 218, RULE_variableDeclarationHolderStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(985);
			match(T__99);
			setState(988);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(986);
				match(T__1);
				setState(987);
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
		enterRule(_localctx, 220, RULE_enhancedForStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(990);
			match(T__100);
			setState(991);
			match(T__101);
			setState(992);
			type();
			setState(993);
			match(T__102);
			setState(994);
			referedExpression();
			setState(995);
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
		enterRule(_localctx, 222, RULE_partialEndArrayAccessStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(997);
			expressionStatement();
			setState(998);
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
		enterRule(_localctx, 224, RULE_leftParentheseStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1000);
			match(T__103);
			setState(1002); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1001);
				match(T__17);
				}
				}
				setState(1004); 
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
		enterRule(_localctx, 226, RULE_rightParentheseStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1006);
			match(T__103);
			setState(1008); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1007);
				match(T__18);
				}
				}
				setState(1010); 
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
		enterRule(_localctx, 228, RULE_leftBraceStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1012);
			match(T__103);
			setState(1014); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1013);
				match(T__104);
				}
				}
				setState(1016); 
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
		enterRule(_localctx, 230, RULE_rightBraceStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1018);
			match(T__103);
			setState(1020); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1019);
				match(T__105);
				}
				}
				setState(1022); 
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
		enterRule(_localctx, 232, RULE_enterMethodParamStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1024);
			match(T__103);
			setState(1026); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1025);
				match(T__106);
				}
				}
				setState(1028); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__106 );
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 234, RULE_arrayInitializerStartStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1030);
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
		enterRule(_localctx, 236, RULE_arrayInitializerSplitCommaStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1032);
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
		enterRule(_localctx, 238, RULE_arrayInitializerEndStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1034);
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
		enterRule(_localctx, 240, RULE_enumConstantDeclarationSplitCommaStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1036);
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
		enterRule(_localctx, 242, RULE_forStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1038);
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
		enterRule(_localctx, 244, RULE_forIniOverStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1040);
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
		enterRule(_localctx, 246, RULE_forExpOverStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1042);
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
		enterRule(_localctx, 248, RULE_forUpdOverStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1044);
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
		enterRule(_localctx, 250, RULE_condExpBeginStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1046);
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
		enterRule(_localctx, 252, RULE_condExpQuestionMarkStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1048);
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
		enterRule(_localctx, 254, RULE_condExpColonMarkStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1050);
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
		enterRule(_localctx, 256, RULE_partialEndStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1052);
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
		enterRule(_localctx, 258, RULE_fullEndStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1054);
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
		enterRule(_localctx, 260, RULE_partialMethodArgumentEndStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1056);
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
		enterRule(_localctx, 262, RULE_partialMethodPreRerferedExpressionEndStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1058);
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
		enterRule(_localctx, 264, RULE_firstArgPreExist);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1060);
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
		enterRule(_localctx, 266, RULE_firstArgReferedExpression);
		try {
			setState(1064);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1062);
				referedExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1063);
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
		enterRule(_localctx, 268, RULE_commonClassMemberInvoke);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1066);
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
		enterRule(_localctx, 270, RULE_selfClassMemberInvoke);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1068);
			match(T__21);
			setState(1071);
			_la = _input.LA(1);
			if (_la==DOT) {
				{
				setState(1069);
				match(DOT);
				setState(1070);
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
		enterRule(_localctx, 272, RULE_superClassMemberInvoke);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1073);
			match(T__20);
			setState(1076);
			_la = _input.LA(1);
			if (_la==DOT) {
				{
				setState(1074);
				match(DOT);
				setState(1075);
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
		enterRule(_localctx, 274, RULE_newClassInvoke);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1078);
			match(T__43);
			setState(1081);
			_la = _input.LA(1);
			if (_la==DOT) {
				{
				setState(1079);
				match(DOT);
				setState(1080);
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
		enterRule(_localctx, 276, RULE_firstArg);
		try {
			setState(1088);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1084);
				selfClassMemberInvoke();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1085);
				superClassMemberInvoke();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1086);
				newClassInvoke();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1087);
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
		enterRule(_localctx, 278, RULE_methodArgPreExist);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1090);
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
		enterRule(_localctx, 280, RULE_methodArgReferedExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1092);
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
		enterRule(_localctx, 282, RULE_argumentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1094);
			firstArg();
			setState(1099);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1095);
				match(COMMA);
				setState(1096);
				methodArgReferedExpression();
				}
				}
				setState(1101);
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
		enterRule(_localctx, 284, RULE_argType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1102);
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
		enterRule(_localctx, 286, RULE_lastArgType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1104);
			type();
			setState(1105);
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
		enterRule(_localctx, 288, RULE_argTypeList);
		int _la;
		try {
			int _alt;
			setState(1120);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1107);
				argType();
				setState(1112);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1108);
						match(COMMA);
						setState(1109);
						argType();
						}
						} 
					}
					setState(1114);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
				}
				setState(1117);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(1115);
					match(COMMA);
					setState(1116);
					lastArgType();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1119);
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
		enterRule(_localctx, 290, RULE_literal);
		try {
			setState(1128);
			switch (_input.LA(1)) {
			case IntegerLiteralX:
			case FloatingPointLiteralX:
				enterOuterAlt(_localctx, 1);
				{
				setState(1122);
				numberLiteral();
				}
				break;
			case T__123:
			case T__124:
				enterOuterAlt(_localctx, 2);
				{
				setState(1123);
				booleanLiteral();
				}
				break;
			case CharacterLiteralX:
				enterOuterAlt(_localctx, 3);
				{
				setState(1124);
				characterLiteral();
				}
				break;
			case StringLiteralX:
				enterOuterAlt(_localctx, 4);
				{
				setState(1125);
				stringLiteral();
				}
				break;
			case T__125:
				enterOuterAlt(_localctx, 5);
				{
				setState(1126);
				nullLiteral();
				}
				break;
			case T__126:
				enterOuterAlt(_localctx, 6);
				{
				setState(1127);
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
		enterRule(_localctx, 292, RULE_numberLiteral);
		try {
			setState(1132);
			switch (_input.LA(1)) {
			case IntegerLiteralX:
				enterOuterAlt(_localctx, 1);
				{
				setState(1130);
				integerLiteral();
				}
				break;
			case FloatingPointLiteralX:
				enterOuterAlt(_localctx, 2);
				{
				setState(1131);
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
		enterRule(_localctx, 294, RULE_integerLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1134);
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
		enterRule(_localctx, 296, RULE_floatingPointLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1136);
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
		enterRule(_localctx, 298, RULE_booleanLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1138);
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
		enterRule(_localctx, 300, RULE_characterLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1140);
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
		enterRule(_localctx, 302, RULE_stringLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1142);
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
		enterRule(_localctx, 304, RULE_nullLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1144);
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
		enterRule(_localctx, 306, RULE_typeLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1146);
			match(T__126);
			setState(1147);
			match(DOT);
			setState(1148);
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
		enterRule(_localctx, 308, RULE_type);
		try {
			setState(1157);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1150);
				virtualInferredType();
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
				classOrInterfaceType();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1153);
				arrayType();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1154);
				intersectionType();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1155);
				unionType();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1156);
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
		enterRule(_localctx, 310, RULE_virtualInferredType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1159);
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
		enterRule(_localctx, 312, RULE_primitiveType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1161);
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
		enterRule(_localctx, 314, RULE_simpleType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1163);
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
		enterRule(_localctx, 316, RULE_extendBound);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1165);
			match(T__136);
			setState(1166);
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
		enterRule(_localctx, 318, RULE_superBound);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1168);
			match(T__20);
			setState(1169);
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
		enterRule(_localctx, 320, RULE_wildcardBounds);
		try {
			setState(1173);
			switch (_input.LA(1)) {
			case T__136:
				enterOuterAlt(_localctx, 1);
				{
				setState(1171);
				extendBound();
				}
				break;
			case T__20:
				enterOuterAlt(_localctx, 2);
				{
				setState(1172);
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
		enterRule(_localctx, 322, RULE_wildCardType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1175);
			match(T__137);
			setState(1177);
			_la = _input.LA(1);
			if (_la==T__20 || _la==T__136) {
				{
				setState(1176);
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
		enterRule(_localctx, 324, RULE_typeArgument);
		try {
			setState(1181);
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
				setState(1179);
				type();
				}
				break;
			case T__137:
				enterOuterAlt(_localctx, 2);
				{
				setState(1180);
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
		enterRule(_localctx, 326, RULE_typeArguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1183);
			match(T__26);
			setState(1184);
			typeArgument();
			setState(1189);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1185);
				match(COMMA);
				setState(1186);
				typeArgument();
				}
				}
				setState(1191);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1192);
			match(T__25);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 328, RULE_parameterizedType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1194);
			identifier();
			setState(1195);
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
		enterRule(_localctx, 330, RULE_bothType);
		try {
			setState(1199);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1197);
				simpleType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1198);
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
		enterRule(_localctx, 332, RULE_classOrInterfaceType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1201);
			bothType();
			}
			setState(1206);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(1202);
				match(DOT);
				setState(1203);
				bothType();
				}
				}
				setState(1208);
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
		enterRule(_localctx, 334, RULE_arrayType);
		try {
			setState(1215);
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
				setState(1209);
				primitiveType();
				setState(1210);
				dims();
				}
				break;
			case IdentifierX:
				enterOuterAlt(_localctx, 2);
				{
				setState(1212);
				classOrInterfaceType();
				setState(1213);
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
		enterRule(_localctx, 336, RULE_dims);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1217);
			match(T__138);
			setState(1218);
			match(T__139);
			setState(1223);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__138) {
				{
				{
				setState(1219);
				match(T__138);
				setState(1220);
				match(T__139);
				}
				}
				setState(1225);
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
		enterRule(_localctx, 338, RULE_intersectionFirstType);
		try {
			setState(1230);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1226);
				classOrInterfaceType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1227);
				primitiveType();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1228);
				arrayType();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1229);
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
		enterRule(_localctx, 340, RULE_intersectionSecondType);
		try {
			setState(1237);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1232);
				classOrInterfaceType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1233);
				primitiveType();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1234);
				arrayType();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1235);
				classRef();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1236);
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
		enterRule(_localctx, 342, RULE_intersectionType);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1239);
			intersectionFirstType();
			}
			setState(1242); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1240);
					match(T__37);
					{
					setState(1241);
					intersectionSecondType();
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1244); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
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
		enterRule(_localctx, 344, RULE_unionFirstType);
		try {
			setState(1250);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1246);
				classOrInterfaceType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1247);
				primitiveType();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1248);
				arrayType();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1249);
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
		enterRule(_localctx, 346, RULE_unionSecondType);
		try {
			setState(1257);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1252);
				classOrInterfaceType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1253);
				primitiveType();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1254);
				arrayType();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1255);
				classRef();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1256);
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
		enterRule(_localctx, 348, RULE_unionType);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1259);
			unionFirstType();
			}
			setState(1262); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1260);
					match(T__38);
					{
					setState(1261);
					unionSecondType();
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1264); 
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
		enterRule(_localctx, 350, RULE_classRef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1266);
			match(T__140);
			setState(1267);
			integerLiteral();
			setState(1268);
			match(T__137);
			setState(1269);
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
		enterRule(_localctx, 352, RULE_finalFieldRef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1271);
			match(T__141);
			setState(1272);
			integerLiteral();
			setState(1273);
			match(T__137);
			setState(1274);
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
		enterRule(_localctx, 354, RULE_finalVarRef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1276);
			match(T__142);
			setState(1277);
			integerLiteral();
			setState(1278);
			match(T__137);
			setState(1279);
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
		enterRule(_localctx, 356, RULE_commonFieldRef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1281);
			match(T__143);
			setState(1282);
			integerLiteral();
			setState(1283);
			match(T__137);
			setState(1284);
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
		enterRule(_localctx, 358, RULE_commonVarRef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1286);
			match(T__144);
			setState(1287);
			integerLiteral();
			setState(1288);
			match(T__137);
			setState(1289);
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
		enterRule(_localctx, 360, RULE_codeHole);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1291);
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
		enterRule(_localctx, 362, RULE_preExist);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1293);
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
		enterRule(_localctx, 364, RULE_endOfArrayDeclarationIndexExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1296); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1295);
					match(T__139);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1298); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\u009f\u0517\4\2\t"+
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
		"\4\u00b7\t\u00b7\4\u00b8\t\u00b8\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2\u01a9\n\2\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\u01b8\n\3\3\4\3\4\3\4\3"+
		"\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b"+
		"\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13"+
		"\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16"+
		"\3\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\5\20\u0202\n\20\3\21\3\21\3\21\3\22\3\22\3\22\3\23"+
		"\3\23\3\23\3\24\3\24\3\24\5\24\u0210\n\24\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32"+
		"\5\32\u0234\n\32\3\33\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\36"+
		"\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\5\37\u0254\n\37\3 \3 \3 \3 \3 \3 \3 \5 \u025d"+
		"\n \3!\3!\3!\3!\3!\5!\u0264\n!\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3$\3"+
		"$\3$\3$\3$\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3(\3(\3("+
		"\3(\3(\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3+\3+\3+\3+\3+\3,\3,\3,\3,\3,\3-"+
		"\3-\3-\3-\3-\3.\3.\3.\3.\3.\3/\3/\3/\3/\3/\3\60\3\60\3\60\3\60\3\60\3"+
		"\61\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3\62\3\62\3\63\3\63\3\63\3"+
		"\63\3\63\3\63\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\65\3\65\3\65\3\65\3"+
		"\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3"+
		"\65\5\65\u02dc\n\65\3\66\3\66\3\66\3\66\3\66\3\67\3\67\3\67\3\67\38\3"+
		"8\38\38\39\39\39\39\39\59\u02f0\n9\3:\3:\3:\5:\u02f5\n:\3;\3;\3;\3<\3"+
		"<\3<\3=\3=\3=\3>\3>\3>\3?\3?\3?\5?\u0306\n?\3@\3@\3@\3@\3A\3A\3A\3A\3"+
		"B\3B\3B\3B\3C\3C\3C\3C\3D\3D\3D\3E\3E\3E\3F\3F\3F\3G\3G\3G\3H\3H\3H\3"+
		"H\3H\3H\5H\u032a\nH\3I\3I\3I\3I\3J\3J\3J\3J\3K\3K\5K\u0336\nK\3L\3L\3"+
		"L\3L\5L\u033c\nL\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M\5M\u0349\nM\3N\3N\3"+
		"O\3O\3P\3P\3Q\3Q\3Q\3R\3R\3R\3S\3S\3S\3S\3S\3S\3S\5S\u035e\nS\3T\3T\3"+
		"T\3U\3U\3U\3V\3V\3V\3W\3W\3W\3W\5W\u036d\nW\3W\3W\3W\3X\3X\3X\3X\5X\u0376"+
		"\nX\3X\3X\3X\3Y\3Y\3Y\3Y\3Y\3Y\3Z\3Z\3Z\3[\3[\3[\3\\\3\\\3\\\5\\\u038a"+
		"\n\\\3\\\3\\\3\\\3\\\3\\\3\\\5\\\u0392\n\\\3\\\3\\\3\\\5\\\u0397\n\\\3"+
		"]\3]\3]\5]\u039c\n]\3^\3^\3^\5^\u03a1\n^\3_\3_\3_\3_\3`\3`\3`\3`\3a\3"+
		"a\3a\5a\u03ae\na\3b\3b\3b\3b\3c\3c\3c\3c\3d\3d\3d\3e\3e\3e\3e\3f\3f\3"+
		"g\3g\3g\3g\3h\3h\3h\3h\3i\3i\3j\3j\3j\3j\3k\3k\3l\3l\3m\3m\3m\3m\3m\3"+
		"m\3n\3n\3n\3o\3o\3o\5o\u03df\no\3p\3p\3p\3p\3p\3p\3p\3q\3q\3q\3r\3r\6"+
		"r\u03ed\nr\rr\16r\u03ee\3s\3s\6s\u03f3\ns\rs\16s\u03f4\3t\3t\6t\u03f9"+
		"\nt\rt\16t\u03fa\3u\3u\6u\u03ff\nu\ru\16u\u0400\3v\3v\6v\u0405\nv\rv\16"+
		"v\u0406\3w\3w\3x\3x\3y\3y\3z\3z\3{\3{\3|\3|\3}\3}\3~\3~\3\177\3\177\3"+
		"\u0080\3\u0080\3\u0081\3\u0081\3\u0082\3\u0082\3\u0083\3\u0083\3\u0084"+
		"\3\u0084\3\u0085\3\u0085\3\u0086\3\u0086\3\u0087\3\u0087\5\u0087\u042b"+
		"\n\u0087\3\u0088\3\u0088\3\u0089\3\u0089\3\u0089\5\u0089\u0432\n\u0089"+
		"\3\u008a\3\u008a\3\u008a\5\u008a\u0437\n\u008a\3\u008b\3\u008b\3\u008b"+
		"\5\u008b\u043c\n\u008b\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c\5\u008c"+
		"\u0443\n\u008c\3\u008d\3\u008d\3\u008e\3\u008e\3\u008f\3\u008f\3\u008f"+
		"\7\u008f\u044c\n\u008f\f\u008f\16\u008f\u044f\13\u008f\3\u0090\3\u0090"+
		"\3\u0091\3\u0091\3\u0091\3\u0092\3\u0092\3\u0092\7\u0092\u0459\n\u0092"+
		"\f\u0092\16\u0092\u045c\13\u0092\3\u0092\3\u0092\5\u0092\u0460\n\u0092"+
		"\3\u0092\5\u0092\u0463\n\u0092\3\u0093\3\u0093\3\u0093\3\u0093\3\u0093"+
		"\3\u0093\5\u0093\u046b\n\u0093\3\u0094\3\u0094\5\u0094\u046f\n\u0094\3"+
		"\u0095\3\u0095\3\u0096\3\u0096\3\u0097\3\u0097\3\u0098\3\u0098\3\u0099"+
		"\3\u0099\3\u009a\3\u009a\3\u009b\3\u009b\3\u009b\3\u009b\3\u009c\3\u009c"+
		"\3\u009c\3\u009c\3\u009c\3\u009c\3\u009c\5\u009c\u0488\n\u009c\3\u009d"+
		"\3\u009d\3\u009e\3\u009e\3\u009f\3\u009f\3\u00a0\3\u00a0\3\u00a0\3\u00a1"+
		"\3\u00a1\3\u00a1\3\u00a2\3\u00a2\5\u00a2\u0498\n\u00a2\3\u00a3\3\u00a3"+
		"\5\u00a3\u049c\n\u00a3\3\u00a4\3\u00a4\5\u00a4\u04a0\n\u00a4\3\u00a5\3"+
		"\u00a5\3\u00a5\3\u00a5\7\u00a5\u04a6\n\u00a5\f\u00a5\16\u00a5\u04a9\13"+
		"\u00a5\3\u00a5\3\u00a5\3\u00a6\3\u00a6\3\u00a6\3\u00a7\3\u00a7\5\u00a7"+
		"\u04b2\n\u00a7\3\u00a8\3\u00a8\3\u00a8\7\u00a8\u04b7\n\u00a8\f\u00a8\16"+
		"\u00a8\u04ba\13\u00a8\3\u00a9\3\u00a9\3\u00a9\3\u00a9\3\u00a9\3\u00a9"+
		"\5\u00a9\u04c2\n\u00a9\3\u00aa\3\u00aa\3\u00aa\3\u00aa\7\u00aa\u04c8\n"+
		"\u00aa\f\u00aa\16\u00aa\u04cb\13\u00aa\3\u00ab\3\u00ab\3\u00ab\3\u00ab"+
		"\5\u00ab\u04d1\n\u00ab\3\u00ac\3\u00ac\3\u00ac\3\u00ac\3\u00ac\5\u00ac"+
		"\u04d8\n\u00ac\3\u00ad\3\u00ad\3\u00ad\6\u00ad\u04dd\n\u00ad\r\u00ad\16"+
		"\u00ad\u04de\3\u00ae\3\u00ae\3\u00ae\3\u00ae\5\u00ae\u04e5\n\u00ae\3\u00af"+
		"\3\u00af\3\u00af\3\u00af\3\u00af\5\u00af\u04ec\n\u00af\3\u00b0\3\u00b0"+
		"\3\u00b0\6\u00b0\u04f1\n\u00b0\r\u00b0\16\u00b0\u04f2\3\u00b1\3\u00b1"+
		"\3\u00b1\3\u00b1\3\u00b1\3\u00b2\3\u00b2\3\u00b2\3\u00b2\3\u00b2\3\u00b3"+
		"\3\u00b3\3\u00b3\3\u00b3\3\u00b3\3\u00b4\3\u00b4\3\u00b4\3\u00b4\3\u00b4"+
		"\3\u00b5\3\u00b5\3\u00b5\3\u00b5\3\u00b5\3\u00b6\3\u00b6\3\u00b7\3\u00b7"+
		"\3\u00b8\6\u00b8\u0513\n\u00b8\r\u00b8\16\u00b8\u0514\3\u00b8\2\2\u00b9"+
		"\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFH"+
		"JLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c"+
		"\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4"+
		"\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc"+
		"\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4"+
		"\u00d6\u00d8\u00da\u00dc\u00de\u00e0\u00e2\u00e4\u00e6\u00e8\u00ea\u00ec"+
		"\u00ee\u00f0\u00f2\u00f4\u00f6\u00f8\u00fa\u00fc\u00fe\u0100\u0102\u0104"+
		"\u0106\u0108\u010a\u010c\u010e\u0110\u0112\u0114\u0116\u0118\u011a\u011c"+
		"\u011e\u0120\u0122\u0124\u0126\u0128\u012a\u012c\u012e\u0130\u0132\u0134"+
		"\u0136\u0138\u013a\u013c\u013e\u0140\u0142\u0144\u0146\u0148\u014a\u014c"+
		"\u014e\u0150\u0152\u0154\u0156\u0158\u015a\u015c\u015e\u0160\u0162\u0164"+
		"\u0166\u0168\u016a\u016c\u016e\2\4\3\2~\177\3\2\u0083\u008a\u0522\2\u01a8"+
		"\3\2\2\2\4\u01b7\3\2\2\2\6\u01b9\3\2\2\2\b\u01be\3\2\2\2\n\u01c3\3\2\2"+
		"\2\f\u01c8\3\2\2\2\16\u01cd\3\2\2\2\20\u01d2\3\2\2\2\22\u01d7\3\2\2\2"+
		"\24\u01dc\3\2\2\2\26\u01e1\3\2\2\2\30\u01e6\3\2\2\2\32\u01eb\3\2\2\2\34"+
		"\u01f0\3\2\2\2\36\u0201\3\2\2\2 \u0203\3\2\2\2\"\u0206\3\2\2\2$\u0209"+
		"\3\2\2\2&\u020f\3\2\2\2(\u0211\3\2\2\2*\u0217\3\2\2\2,\u021d\3\2\2\2."+
		"\u0223\3\2\2\2\60\u0229\3\2\2\2\62\u0233\3\2\2\2\64\u0235\3\2\2\2\66\u0238"+
		"\3\2\2\28\u023b\3\2\2\2:\u023f\3\2\2\2<\u0253\3\2\2\2>\u025c\3\2\2\2@"+
		"\u0263\3\2\2\2B\u0265\3\2\2\2D\u026a\3\2\2\2F\u026f\3\2\2\2H\u0274\3\2"+
		"\2\2J\u0279\3\2\2\2L\u027e\3\2\2\2N\u0283\3\2\2\2P\u0288\3\2\2\2R\u028d"+
		"\3\2\2\2T\u0292\3\2\2\2V\u0297\3\2\2\2X\u029c\3\2\2\2Z\u02a1\3\2\2\2\\"+
		"\u02a6\3\2\2\2^\u02ab\3\2\2\2`\u02b0\3\2\2\2b\u02b5\3\2\2\2d\u02bb\3\2"+
		"\2\2f\u02c1\3\2\2\2h\u02db\3\2\2\2j\u02dd\3\2\2\2l\u02e2\3\2\2\2n\u02e6"+
		"\3\2\2\2p\u02ea\3\2\2\2r\u02f4\3\2\2\2t\u02f6\3\2\2\2v\u02f9\3\2\2\2x"+
		"\u02fc\3\2\2\2z\u02ff\3\2\2\2|\u0305\3\2\2\2~\u0307\3\2\2\2\u0080\u030b"+
		"\3\2\2\2\u0082\u030f\3\2\2\2\u0084\u0313\3\2\2\2\u0086\u0317\3\2\2\2\u0088"+
		"\u031a\3\2\2\2\u008a\u031d\3\2\2\2\u008c\u0320\3\2\2\2\u008e\u0329\3\2"+
		"\2\2\u0090\u032b\3\2\2\2\u0092\u032f\3\2\2\2\u0094\u0335\3\2\2\2\u0096"+
		"\u0337\3\2\2\2\u0098\u0348\3\2\2\2\u009a\u034a\3\2\2\2\u009c\u034c\3\2"+
		"\2\2\u009e\u034e\3\2\2\2\u00a0\u0350\3\2\2\2\u00a2\u0353\3\2\2\2\u00a4"+
		"\u0356\3\2\2\2\u00a6\u035f\3\2\2\2\u00a8\u0362\3\2\2\2\u00aa\u0365\3\2"+
		"\2\2\u00ac\u0368\3\2\2\2\u00ae\u0371\3\2\2\2\u00b0\u037a\3\2\2\2\u00b2"+
		"\u0380\3\2\2\2\u00b4\u0383\3\2\2\2\u00b6\u0396\3\2\2\2\u00b8\u0398\3\2"+
		"\2\2\u00ba\u039d\3\2\2\2\u00bc\u03a2\3\2\2\2\u00be\u03a6\3\2\2\2\u00c0"+
		"\u03aa\3\2\2\2\u00c2\u03af\3\2\2\2\u00c4\u03b3\3\2\2\2\u00c6\u03b7\3\2"+
		"\2\2\u00c8\u03ba\3\2\2\2\u00ca\u03be\3\2\2\2\u00cc\u03c0\3\2\2\2\u00ce"+
		"\u03c4\3\2\2\2\u00d0\u03c8\3\2\2\2\u00d2\u03ca\3\2\2\2\u00d4\u03ce\3\2"+
		"\2\2\u00d6\u03d0\3\2\2\2\u00d8\u03d2\3\2\2\2\u00da\u03d8\3\2\2\2\u00dc"+
		"\u03db\3\2\2\2\u00de\u03e0\3\2\2\2\u00e0\u03e7\3\2\2\2\u00e2\u03ea\3\2"+
		"\2\2\u00e4\u03f0\3\2\2\2\u00e6\u03f6\3\2\2\2\u00e8\u03fc\3\2\2\2\u00ea"+
		"\u0402\3\2\2\2\u00ec\u0408\3\2\2\2\u00ee\u040a\3\2\2\2\u00f0\u040c\3\2"+
		"\2\2\u00f2\u040e\3\2\2\2\u00f4\u0410\3\2\2\2\u00f6\u0412\3\2\2\2\u00f8"+
		"\u0414\3\2\2\2\u00fa\u0416\3\2\2\2\u00fc\u0418\3\2\2\2\u00fe\u041a\3\2"+
		"\2\2\u0100\u041c\3\2\2\2\u0102\u041e\3\2\2\2\u0104\u0420\3\2\2\2\u0106"+
		"\u0422\3\2\2\2\u0108\u0424\3\2\2\2\u010a\u0426\3\2\2\2\u010c\u042a\3\2"+
		"\2\2\u010e\u042c\3\2\2\2\u0110\u042e\3\2\2\2\u0112\u0433\3\2\2\2\u0114"+
		"\u0438\3\2\2\2\u0116\u0442\3\2\2\2\u0118\u0444\3\2\2\2\u011a\u0446\3\2"+
		"\2\2\u011c\u0448\3\2\2\2\u011e\u0450\3\2\2\2\u0120\u0452\3\2\2\2\u0122"+
		"\u0462\3\2\2\2\u0124\u046a\3\2\2\2\u0126\u046e\3\2\2\2\u0128\u0470\3\2"+
		"\2\2\u012a\u0472\3\2\2\2\u012c\u0474\3\2\2\2\u012e\u0476\3\2\2\2\u0130"+
		"\u0478\3\2\2\2\u0132\u047a\3\2\2\2\u0134\u047c\3\2\2\2\u0136\u0487\3\2"+
		"\2\2\u0138\u0489\3\2\2\2\u013a\u048b\3\2\2\2\u013c\u048d\3\2\2\2\u013e"+
		"\u048f\3\2\2\2\u0140\u0492\3\2\2\2\u0142\u0497\3\2\2\2\u0144\u0499\3\2"+
		"\2\2\u0146\u049f\3\2\2\2\u0148\u04a1\3\2\2\2\u014a\u04ac\3\2\2\2\u014c"+
		"\u04b1\3\2\2\2\u014e\u04b3\3\2\2\2\u0150\u04c1\3\2\2\2\u0152\u04c3\3\2"+
		"\2\2\u0154\u04d0\3\2\2\2\u0156\u04d7\3\2\2\2\u0158\u04d9\3\2\2\2\u015a"+
		"\u04e4\3\2\2\2\u015c\u04eb\3\2\2\2\u015e\u04ed\3\2\2\2\u0160\u04f4\3\2"+
		"\2\2\u0162\u04f9\3\2\2\2\u0164\u04fe\3\2\2\2\u0166\u0503\3\2\2\2\u0168"+
		"\u0508\3\2\2\2\u016a\u050d\3\2\2\2\u016c\u050f\3\2\2\2\u016e\u0512\3\2"+
		"\2\2\u0170\u01a9\5\u009cO\2\u0171\u01a9\5\u009eP\2\u0172\u01a9\5\u00a0"+
		"Q\2\u0173\u01a9\5\u00a2R\2\u0174\u01a9\5\u00a4S\2\u0175\u01a9\5\u00a6"+
		"T\2\u0176\u01a9\5\u00a8U\2\u0177\u01a9\5\u00aaV\2\u0178\u01a9\5\u00ac"+
		"W\2\u0179\u01a9\5\u00aeX\2\u017a\u01a9\5\u00b0Y\2\u017b\u01a9\5\u00b2"+
		"Z\2\u017c\u01a9\5\u00b4[\2\u017d\u01a9\5\u00b6\\\2\u017e\u01a9\5\u00b8"+
		"]\2\u017f\u01a9\5\u00ba^\2\u0180\u01a9\5\u00bc_\2\u0181\u01a9\5\u00be"+
		"`\2\u0182\u01a9\5\u00c0a\2\u0183\u01a9\5\u00c2b\2\u0184\u01a9\5\u00c4"+
		"c\2\u0185\u01a9\5\u00c6d\2\u0186\u01a9\5\u00c8e\2\u0187\u01a9\5\u00ca"+
		"f\2\u0188\u01a9\5\u00ccg\2\u0189\u01a9\5\u00ceh\2\u018a\u01a9\5\u00d0"+
		"i\2\u018b\u01a9\5\u00d2j\2\u018c\u01a9\5\u00d4k\2\u018d\u01a9\5\u00d6"+
		"l\2\u018e\u01a9\5\u00d8m\2\u018f\u01a9\5\u00dan\2\u0190\u01a9\5\u00dc"+
		"o\2\u0191\u01a9\5\u00dep\2\u0192\u01a9\5\u00e0q\2\u0193\u01a9\5\u00e2"+
		"r\2\u0194\u01a9\5\u00e4s\2\u0195\u01a9\5\u00e6t\2\u0196\u01a9\5\u00e8"+
		"u\2\u0197\u01a9\5\u00eav\2\u0198\u01a9\5\u00ecw\2\u0199\u01a9\5\u00ee"+
		"x\2\u019a\u01a9\5\u00f0y\2\u019b\u01a9\5\u00f2z\2\u019c\u01a9\5\u00f4"+
		"{\2\u019d\u01a9\5\u00f6|\2\u019e\u01a9\5\u00f8}\2\u019f\u01a9\5\u00fa"+
		"~\2\u01a0\u01a9\5\u00fc\177\2\u01a1\u01a9\5\u00fe\u0080\2\u01a2\u01a9"+
		"\5\u0100\u0081\2\u01a3\u01a9\5\u0102\u0082\2\u01a4\u01a9\5\u0104\u0083"+
		"\2\u01a5\u01a9\5\u0106\u0084\2\u01a6\u01a9\5\u0108\u0085\2\u01a7\u01a9"+
		"\5\4\3\2\u01a8\u0170\3\2\2\2\u01a8\u0171\3\2\2\2\u01a8\u0172\3\2\2\2\u01a8"+
		"\u0173\3\2\2\2\u01a8\u0174\3\2\2\2\u01a8\u0175\3\2\2\2\u01a8\u0176\3\2"+
		"\2\2\u01a8\u0177\3\2\2\2\u01a8\u0178\3\2\2\2\u01a8\u0179\3\2\2\2\u01a8"+
		"\u017a\3\2\2\2\u01a8\u017b\3\2\2\2\u01a8\u017c\3\2\2\2\u01a8\u017d\3\2"+
		"\2\2\u01a8\u017e\3\2\2\2\u01a8\u017f\3\2\2\2\u01a8\u0180\3\2\2\2\u01a8"+
		"\u0181\3\2\2\2\u01a8\u0182\3\2\2\2\u01a8\u0183\3\2\2\2\u01a8\u0184\3\2"+
		"\2\2\u01a8\u0185\3\2\2\2\u01a8\u0186\3\2\2\2\u01a8\u0187\3\2\2\2\u01a8"+
		"\u0188\3\2\2\2\u01a8\u0189\3\2\2\2\u01a8\u018a\3\2\2\2\u01a8\u018b\3\2"+
		"\2\2\u01a8\u018c\3\2\2\2\u01a8\u018d\3\2\2\2\u01a8\u018e\3\2\2\2\u01a8"+
		"\u018f\3\2\2\2\u01a8\u0190\3\2\2\2\u01a8\u0191\3\2\2\2\u01a8\u0192\3\2"+
		"\2\2\u01a8\u0193\3\2\2\2\u01a8\u0194\3\2\2\2\u01a8\u0195\3\2\2\2\u01a8"+
		"\u0196\3\2\2\2\u01a8\u0197\3\2\2\2\u01a8\u0198\3\2\2\2\u01a8\u0199\3\2"+
		"\2\2\u01a8\u019a\3\2\2\2\u01a8\u019b\3\2\2\2\u01a8\u019c\3\2\2\2\u01a8"+
		"\u019d\3\2\2\2\u01a8\u019e\3\2\2\2\u01a8\u019f\3\2\2\2\u01a8\u01a0\3\2"+
		"\2\2\u01a8\u01a1\3\2\2\2\u01a8\u01a2\3\2\2\2\u01a8\u01a3\3\2\2\2\u01a8"+
		"\u01a4\3\2\2\2\u01a8\u01a5\3\2\2\2\u01a8\u01a6\3\2\2\2\u01a8\u01a7\3\2"+
		"\2\2\u01a9\3\3\2\2\2\u01aa\u01b8\5\36\20\2\u01ab\u01b8\5&\24\2\u01ac\u01b8"+
		"\5(\25\2\u01ad\u01b8\5\62\32\2\u01ae\u01b8\5\66\34\2\u01af\u01b8\5\64"+
		"\33\2\u01b0\u01b8\5h\65\2\u01b1\u01b8\5j\66\2\u01b2\u01b8\5t;\2\u01b3"+
		"\u01b8\5|?\2\u01b4\u01b8\5\u008eH\2\u01b5\u01b8\5\u0094K\2\u01b6\u01b8"+
		"\5\u0096L\2\u01b7\u01aa\3\2\2\2\u01b7\u01ab\3\2\2\2\u01b7\u01ac\3\2\2"+
		"\2\u01b7\u01ad\3\2\2\2\u01b7\u01ae\3\2\2\2\u01b7\u01af\3\2\2\2\u01b7\u01b0"+
		"\3\2\2\2\u01b7\u01b1\3\2\2\2\u01b7\u01b2\3\2\2\2\u01b7\u01b3\3\2\2\2\u01b7"+
		"\u01b4\3\2\2\2\u01b7\u01b5\3\2\2\2\u01b7\u01b6\3\2\2\2\u01b8\5\3\2\2\2"+
		"\u01b9\u01ba\7\3\2\2\u01ba\u01bb\5\u0098M\2\u01bb\u01bc\7\4\2\2\u01bc"+
		"\u01bd\5\u0098M\2\u01bd\7\3\2\2\2\u01be\u01bf\7\3\2\2\u01bf\u01c0\5\u0098"+
		"M\2\u01c0\u01c1\7\5\2\2\u01c1\u01c2\5\u0098M\2\u01c2\t\3\2\2\2\u01c3\u01c4"+
		"\7\3\2\2\u01c4\u01c5\5\u0098M\2\u01c5\u01c6\7\6\2\2\u01c6\u01c7\5\u0098"+
		"M\2\u01c7\13\3\2\2\2\u01c8\u01c9\7\3\2\2\u01c9\u01ca\5\u0098M\2\u01ca"+
		"\u01cb\7\7\2\2\u01cb\u01cc\5\u0098M\2\u01cc\r\3\2\2\2\u01cd\u01ce\7\3"+
		"\2\2\u01ce\u01cf\5\u0098M\2\u01cf\u01d0\7\b\2\2\u01d0\u01d1\5\u0098M\2"+
		"\u01d1\17\3\2\2\2\u01d2\u01d3\7\3\2\2\u01d3\u01d4\5\u0098M\2\u01d4\u01d5"+
		"\7\t\2\2\u01d5\u01d6\5\u0098M\2\u01d6\21\3\2\2\2\u01d7\u01d8\7\3\2\2\u01d8"+
		"\u01d9\5\u0098M\2\u01d9\u01da\7\n\2\2\u01da\u01db\5\u0098M\2\u01db\23"+
		"\3\2\2\2\u01dc\u01dd\7\3\2\2\u01dd\u01de\5\u0098M\2\u01de\u01df\7\13\2"+
		"\2\u01df\u01e0\5\u0098M\2\u01e0\25\3\2\2\2\u01e1\u01e2\7\3\2\2\u01e2\u01e3"+
		"\5\u0098M\2\u01e3\u01e4\7\f\2\2\u01e4\u01e5\5\u0098M\2\u01e5\27\3\2\2"+
		"\2\u01e6\u01e7\7\3\2\2\u01e7\u01e8\5\u0098M\2\u01e8\u01e9\7\r\2\2\u01e9"+
		"\u01ea\5\u0098M\2\u01ea\31\3\2\2\2\u01eb\u01ec\7\3\2\2\u01ec\u01ed\5\u0098"+
		"M\2\u01ed\u01ee\7\16\2\2\u01ee\u01ef\5\u0098M\2\u01ef\33\3\2\2\2\u01f0"+
		"\u01f1\7\3\2\2\u01f1\u01f2\5\u0098M\2\u01f2\u01f3\7\17\2\2\u01f3\u01f4"+
		"\5\u0098M\2\u01f4\35\3\2\2\2\u01f5\u0202\5\6\4\2\u01f6\u0202\5\b\5\2\u01f7"+
		"\u0202\5\n\6\2\u01f8\u0202\5\f\7\2\u01f9\u0202\5\16\b\2\u01fa\u0202\5"+
		"\20\t\2\u01fb\u0202\5\22\n\2\u01fc\u0202\5\24\13\2\u01fd\u0202\5\26\f"+
		"\2\u01fe\u0202\5\30\r\2\u01ff\u0202\5\32\16\2\u0200\u0202\5\34\17\2\u0201"+
		"\u01f5\3\2\2\2\u0201\u01f6\3\2\2\2\u0201\u01f7\3\2\2\2\u0201\u01f8\3\2"+
		"\2\2\u0201\u01f9\3\2\2\2\u0201\u01fa\3\2\2\2\u0201\u01fb\3\2\2\2\u0201"+
		"\u01fc\3\2\2\2\u0201\u01fd\3\2\2\2\u0201\u01fe\3\2\2\2\u0201\u01ff\3\2"+
		"\2\2\u0201\u0200\3\2\2\2\u0202\37\3\2\2\2\u0203\u0204\7\20\2\2\u0204\u0205"+
		"\5\u0124\u0093\2\u0205!\3\2\2\2\u0206\u0207\7\21\2\2\u0207\u0208\5\u0124"+
		"\u0093\2\u0208#\3\2\2\2\u0209\u020a\7\22\2\2\u020a\u020b\5\u0124\u0093"+
		"\2\u020b%\3\2\2\2\u020c\u0210\5$\23\2\u020d\u0210\5\"\22\2\u020e\u0210"+
		"\5 \21\2\u020f\u020c\3\2\2\2\u020f\u020d\3\2\2\2\u020f\u020e\3\2\2\2\u0210"+
		"\'\3\2\2\2\u0211\u0212\7\23\2\2\u0212\u0213\7\24\2\2\u0213\u0214\5\u0136"+
		"\u009c\2\u0214\u0215\7\25\2\2\u0215\u0216\5\u0098M\2\u0216)\3\2\2\2\u0217"+
		"\u0218\7\26\2\2\u0218\u0219\5\u009aN\2\u0219\u021a\7\24\2\2\u021a\u021b"+
		"\5\u011c\u008f\2\u021b\u021c\7\25\2\2\u021c+\3\2\2\2\u021d\u021e\7\26"+
		"\2\2\u021e\u021f\7\27\2\2\u021f\u0220\7\24\2\2\u0220\u0221\5\u011c\u008f"+
		"\2\u0221\u0222\7\25\2\2\u0222-\3\2\2\2\u0223\u0224\7\26\2\2\u0224\u0225"+
		"\5\u0136\u009c\2\u0225\u0226\7\24\2\2\u0226\u0227\5\u011c\u008f\2\u0227"+
		"\u0228\7\25\2\2\u0228/\3\2\2\2\u0229\u022a\7\26\2\2\u022a\u022b\7\30\2"+
		"\2\u022b\u022c\7\24\2\2\u022c\u022d\5\u011c\u008f\2\u022d\u022e\7\25\2"+
		"\2\u022e\61\3\2\2\2\u022f\u0234\5*\26\2\u0230\u0234\5,\27\2\u0231\u0234"+
		"\5.\30\2\u0232\u0234\5\60\31\2\u0233\u022f\3\2\2\2\u0233\u0230\3\2\2\2"+
		"\u0233\u0231\3\2\2\2\u0233\u0232\3\2\2\2\u0234\63\3\2\2\2\u0235\u0236"+
		"\7\31\2\2\u0236\u0237\5@!\2\u0237\65\3\2\2\2\u0238\u0239\7\32\2\2\u0239"+
		"\u023a\5@!\2\u023a\67\3\2\2\2\u023b\u023c\5\u009aN\2\u023c\u023d\7\u009d"+
		"\2\2\u023d\u023e\5@!\2\u023e9\3\2\2\2\u023f\u0240\5\u009aN\2\u0240\u0241"+
		"\7\u009d\2\2\u0241\u0242\5\u0098M\2\u0242;\3\2\2\2\u0243\u0244\5\u009a"+
		"N\2\u0244\u0245\7\u009d\2\2\u0245\u0246\7\27\2\2\u0246\u0247\7\u009d\2"+
		"\2\u0247\u0248\5\u0098M\2\u0248\u0254\3\2\2\2\u0249\u024a\5\u009aN\2\u024a"+
		"\u024b\7\u009d\2\2\u024b\u024c\7\27\2\2\u024c\u024d\7\u009d\2\2\u024d"+
		"\u024e\5\u0136\u009c\2\u024e\u0254\3\2\2\2\u024f\u0250\5\u009aN\2\u0250"+
		"\u0251\7\u009d\2\2\u0251\u0252\7\27\2\2\u0252\u0254\3\2\2\2\u0253\u0243"+
		"\3\2\2\2\u0253\u0249\3\2\2\2\u0253\u024f\3\2\2\2\u0254=\3\2\2\2\u0255"+
		"\u0256\7\30\2\2\u0256\u0257\7\u009d\2\2\u0257\u025d\5\u0098M\2\u0258\u0259"+
		"\7\30\2\2\u0259\u025a\7\u009d\2\2\u025a\u025d\5\u0136\u009c\2\u025b\u025d"+
		"\7\30\2\2\u025c\u0255\3\2\2\2\u025c\u0258\3\2\2\2\u025c\u025b\3\2\2\2"+
		"\u025d?\3\2\2\2\u025e\u0264\58\35\2\u025f\u0264\5\u0166\u00b4\2\u0260"+
		"\u0264\5:\36\2\u0261\u0264\5<\37\2\u0262\u0264\5> \2\u0263\u025e\3\2\2"+
		"\2\u0263\u025f\3\2\2\2\u0263\u0260\3\2\2\2\u0263\u0261\3\2\2\2\u0263\u0262"+
		"\3\2\2\2\u0264A\3\2\2\2\u0265\u0266\7\33\2\2\u0266\u0267\5\u0098M\2\u0267"+
		"\u0268\7\34\2\2\u0268\u0269\5\u0098M\2\u0269C\3\2\2\2\u026a\u026b\7\33"+
		"\2\2\u026b\u026c\5\u0098M\2\u026c\u026d\7\35\2\2\u026d\u026e\5\u0098M"+
		"\2\u026eE\3\2\2\2\u026f\u0270\7\33\2\2\u0270\u0271\5\u0098M\2\u0271\u0272"+
		"\7\36\2\2\u0272\u0273\5\u0098M\2\u0273G\3\2\2\2\u0274\u0275\7\33\2\2\u0275"+
		"\u0276\5\u0098M\2\u0276\u0277\7\37\2\2\u0277\u0278\5\u0098M\2\u0278I\3"+
		"\2\2\2\u0279\u027a\7\33\2\2\u027a\u027b\5\u0098M\2\u027b\u027c\7 \2\2"+
		"\u027c\u027d\5\u0098M\2\u027dK\3\2\2\2\u027e\u027f\7\33\2\2\u027f\u0280"+
		"\5\u0098M\2\u0280\u0281\7!\2\2\u0281\u0282\5\u0098M\2\u0282M\3\2\2\2\u0283"+
		"\u0284\7\33\2\2\u0284\u0285\5\u0098M\2\u0285\u0286\7\"\2\2\u0286\u0287"+
		"\5\u0098M\2\u0287O\3\2\2\2\u0288\u0289\7\33\2\2\u0289\u028a\5\u0098M\2"+
		"\u028a\u028b\7#\2\2\u028b\u028c\5\u0098M\2\u028cQ\3\2\2\2\u028d\u028e"+
		"\7\33\2\2\u028e\u028f\5\u0098M\2\u028f\u0290\7$\2\2\u0290\u0291\5\u0098"+
		"M\2\u0291S\3\2\2\2\u0292\u0293\7\33\2\2\u0293\u0294\5\u0098M\2\u0294\u0295"+
		"\7%\2\2\u0295\u0296\5\u0098M\2\u0296U\3\2\2\2\u0297\u0298\7\33\2\2\u0298"+
		"\u0299\5\u0098M\2\u0299\u029a\7&\2\2\u029a\u029b\5\u0098M\2\u029bW\3\2"+
		"\2\2\u029c\u029d\7\33\2\2\u029d\u029e\5\u0098M\2\u029e\u029f\7\'\2\2\u029f"+
		"\u02a0\5\u0098M\2\u02a0Y\3\2\2\2\u02a1\u02a2\7\33\2\2\u02a2\u02a3\5\u0098"+
		"M\2\u02a3\u02a4\7(\2\2\u02a4\u02a5\5\u0098M\2\u02a5[\3\2\2\2\u02a6\u02a7"+
		"\7\33\2\2\u02a7\u02a8\5\u0098M\2\u02a8\u02a9\7)\2\2\u02a9\u02aa\5\u0098"+
		"M\2\u02aa]\3\2\2\2\u02ab\u02ac\7\33\2\2\u02ac\u02ad\5\u0098M\2\u02ad\u02ae"+
		"\7*\2\2\u02ae\u02af\5\u0098M\2\u02af_\3\2\2\2\u02b0\u02b1\7\33\2\2\u02b1"+
		"\u02b2\5\u0098M\2\u02b2\u02b3\7+\2\2\u02b3\u02b4\5\u0098M\2\u02b4a\3\2"+
		"\2\2\u02b5\u02b6\7\33\2\2\u02b6\u02b7\5\u0098M\2\u02b7\u02b8\7\35\2\2"+
		"\u02b8\u02b9\7\35\2\2\u02b9\u02ba\5\u0098M\2\u02bac\3\2\2\2\u02bb\u02bc"+
		"\7\33\2\2\u02bc\u02bd\5\u0098M\2\u02bd\u02be\7\34\2\2\u02be\u02bf\7\34"+
		"\2\2\u02bf\u02c0\5\u0098M\2\u02c0e\3\2\2\2\u02c1\u02c2\7\33\2\2\u02c2"+
		"\u02c3\5\u0098M\2\u02c3\u02c4\7\34\2\2\u02c4\u02c5\7\34\2\2\u02c5\u02c6"+
		"\7\34\2\2\u02c6\u02c7\5\u0098M\2\u02c7g\3\2\2\2\u02c8\u02dc\5B\"\2\u02c9"+
		"\u02dc\5D#\2\u02ca\u02dc\5F$\2\u02cb\u02dc\5H%\2\u02cc\u02dc\5J&\2\u02cd"+
		"\u02dc\5L\'\2\u02ce\u02dc\5N(\2\u02cf\u02dc\5P)\2\u02d0\u02dc\5R*\2\u02d1"+
		"\u02dc\5T+\2\u02d2\u02dc\5V,\2\u02d3\u02dc\5X-\2\u02d4\u02dc\5Z.\2\u02d5"+
		"\u02dc\5\\/\2\u02d6\u02dc\5^\60\2\u02d7\u02dc\5`\61\2\u02d8\u02dc\5b\62"+
		"\2\u02d9\u02dc\5d\63\2\u02da\u02dc\5f\64\2\u02db\u02c8\3\2\2\2\u02db\u02c9"+
		"\3\2\2\2\u02db\u02ca\3\2\2\2\u02db\u02cb\3\2\2\2\u02db\u02cc\3\2\2\2\u02db"+
		"\u02cd\3\2\2\2\u02db\u02ce\3\2\2\2\u02db\u02cf\3\2\2\2\u02db\u02d0\3\2"+
		"\2\2\u02db\u02d1\3\2\2\2\u02db\u02d2\3\2\2\2\u02db\u02d3\3\2\2\2\u02db"+
		"\u02d4\3\2\2\2\u02db\u02d5\3\2\2\2\u02db\u02d6\3\2\2\2\u02db\u02d7\3\2"+
		"\2\2\u02db\u02d8\3\2\2\2\u02db\u02d9\3\2\2\2\u02db\u02da\3\2\2\2\u02dc"+
		"i\3\2\2\2\u02dd\u02de\7,\2\2\u02de\u02df\5\u0098M\2\u02df\u02e0\7-\2\2"+
		"\u02e0\u02e1\5\u0136\u009c\2\u02e1k\3\2\2\2\u02e2\u02e3\5\u009aN\2\u02e3"+
		"\u02e4\7\u009e\2\2\u02e4\u02e5\5\u0098M\2\u02e5m\3\2\2\2\u02e6\u02e7\7"+
		".\2\2\u02e7\u02e8\7\u009e\2\2\u02e8\u02e9\5\u0098M\2\u02e9o\3\2\2\2\u02ea"+
		"\u02eb\5\u009aN\2\u02eb\u02ec\7\u009e\2\2\u02ec\u02ef\7\27\2\2\u02ed\u02ee"+
		"\7\u009d\2\2\u02ee\u02f0\5\u0098M\2\u02ef\u02ed\3\2\2\2\u02ef\u02f0\3"+
		"\2\2\2\u02f0q\3\2\2\2\u02f1\u02f5\5l\67\2\u02f2\u02f5\5n8\2\u02f3\u02f5"+
		"\5p9\2\u02f4\u02f1\3\2\2\2\u02f4\u02f2\3\2\2\2\u02f4\u02f3\3\2\2\2\u02f5"+
		"s\3\2\2\2\u02f6\u02f7\7/\2\2\u02f7\u02f8\5r:\2\u02f8u\3\2\2\2\u02f9\u02fa"+
		"\7\60\2\2\u02fa\u02fb\5\u009aN\2\u02fbw\3\2\2\2\u02fc\u02fd\7\60\2\2\u02fd"+
		"\u02fe\5\u0168\u00b5\2\u02fey\3\2\2\2\u02ff\u0300\7\60\2\2\u0300\u0301"+
		"\5\u0166\u00b4\2\u0301{\3\2\2\2\u0302\u0306\5v<\2\u0303\u0306\5x=\2\u0304"+
		"\u0306\5z>\2\u0305\u0302\3\2\2\2\u0305\u0303\3\2\2\2\u0305\u0304\3\2\2"+
		"\2\u0306}\3\2\2\2\u0307\u0308\7\61\2\2\u0308\u0309\7\62\2\2\u0309\u030a"+
		"\5\u0098M\2\u030a\177\3\2\2\2\u030b\u030c\7\61\2\2\u030c\u030d\7\63\2"+
		"\2\u030d\u030e\5\u0098M\2\u030e\u0081\3\2\2\2\u030f\u0310\7\61\2\2\u0310"+
		"\u0311\7\64\2\2\u0311\u0312\5\u0098M\2\u0312\u0083\3\2\2\2\u0313\u0314"+
		"\7\61\2\2\u0314\u0315\7\65\2\2\u0315\u0316\5\u0098M\2\u0316\u0085\3\2"+
		"\2\2\u0317\u0318\7\61\2\2\u0318\u0319\5\u008aF\2\u0319\u0087\3\2\2\2\u031a"+
		"\u031b\7\61\2\2\u031b\u031c\5\u008cG\2\u031c\u0089\3\2\2\2\u031d\u031e"+
		"\7$\2\2\u031e\u031f\5\u0098M\2\u031f\u008b\3\2\2\2\u0320\u0321\7%\2\2"+
		"\u0321\u0322\5\u0098M\2\u0322\u008d\3\2\2\2\u0323\u032a\5~@\2\u0324\u032a"+
		"\5\u0080A\2\u0325\u032a\5\u0082B\2\u0326\u032a\5\u0084C\2\u0327\u032a"+
		"\5\u0086D\2\u0328\u032a\5\u0088E\2\u0329\u0323\3\2\2\2\u0329\u0324\3\2"+
		"\2\2\u0329\u0325\3\2\2\2\u0329\u0326\3\2\2\2\u0329\u0327\3\2\2\2\u0329"+
		"\u0328\3\2\2\2\u032a\u008f\3\2\2\2\u032b\u032c\7\66\2\2\u032c\u032d\5"+
		"\u0098M\2\u032d\u032e\7\64\2\2\u032e\u0091\3\2\2\2\u032f\u0330\7\66\2"+
		"\2\u0330\u0331\5\u0098M\2\u0331\u0332\7\65\2\2\u0332\u0093\3\2\2\2\u0333"+
		"\u0336\5\u0090I\2\u0334\u0336\5\u0092J\2\u0335\u0333\3\2\2\2\u0335\u0334"+
		"\3\2\2\2\u0336\u0095\3\2\2\2\u0337\u0338\7\67\2\2\u0338\u0339\5\u0098"+
		"M\2\u0339\u033b\5\u0098M\2\u033a\u033c\5\u016e\u00b8\2\u033b\u033a\3\2"+
		"\2\2\u033b\u033c\3\2\2\2\u033c\u0097\3\2\2\2\u033d\u0349\5\u009aN\2\u033e"+
		"\u0349\5@!\2\u033f\u0349\5\u0124\u0093\2\u0340\u0349\5\u016a\u00b6\2\u0341"+
		"\u0349\5\u016c\u00b7\2\u0342\u0349\5\u0162\u00b2\2\u0343\u0349\5\u0164"+
		"\u00b3\2\u0344\u0349\5\u0168\u00b5\2\u0345\u0349\5\u008aF\2\u0346\u0349"+
		"\5\u008cG\2\u0347\u0349\5r:\2\u0348\u033d\3\2\2\2\u0348\u033e\3\2\2\2"+
		"\u0348\u033f\3\2\2\2\u0348\u0340\3\2\2\2\u0348\u0341\3\2\2\2\u0348\u0342"+
		"\3\2\2\2\u0348\u0343\3\2\2\2\u0348\u0344\3\2\2\2\u0348\u0345\3\2\2\2\u0348"+
		"\u0346\3\2\2\2\u0348\u0347\3\2\2\2\u0349\u0099\3\2\2\2\u034a\u034b\7\u0095"+
		"\2\2\u034b\u009b\3\2\2\2\u034c\u034d\78\2\2\u034d\u009d\3\2\2\2\u034e"+
		"\u034f\79\2\2\u034f\u009f\3\2\2\2\u0350\u0351\7:\2\2\u0351\u0352\5\u009a"+
		"N\2\u0352\u00a1\3\2\2\2\u0353\u0354\7;\2\2\u0354\u0355\5\u009aN\2\u0355"+
		"\u00a3\3\2\2\2\u0356\u0357\7<\2\2\u0357\u0358\5\u0136\u009c\2\u0358\u0359"+
		"\5\u009aN\2\u0359\u035a\7\24\2\2\u035a\u035d\7\25\2\2\u035b\u035c\7=\2"+
		"\2\u035c\u035e\5\u0098M\2\u035d\u035b\3\2\2\2\u035d\u035e\3\2\2\2\u035e"+
		"\u00a5\3\2\2\2\u035f\u0360\7>\2\2\u0360\u0361\5\u009aN\2\u0361\u00a7\3"+
		"\2\2\2\u0362\u0363\7?\2\2\u0363\u0364\5\u009aN\2\u0364\u00a9\3\2\2\2\u0365"+
		"\u0366\7@\2\2\u0366\u0367\5\u009aN\2\u0367\u00ab\3\2\2\2\u0368\u0369\7"+
		"A\2\2\u0369\u036a\5\u0136\u009c\2\u036a\u036c\7\24\2\2\u036b\u036d\5\u0122"+
		"\u0092\2\u036c\u036b\3\2\2\2\u036c\u036d\3\2\2\2\u036d\u036e\3\2\2\2\u036e"+
		"\u036f\7\25\2\2\u036f\u0370\5\u009aN\2\u0370\u00ad\3\2\2\2\u0371\u0372"+
		"\7A\2\2\u0372\u0373\7B\2\2\u0373\u0375\7\24\2\2\u0374\u0376\5\u0122\u0092"+
		"\2\u0375\u0374\3\2\2\2\u0375\u0376\3\2\2\2\u0376\u0377\3\2\2\2\u0377\u0378"+
		"\7\25\2\2\u0378\u0379\5\u009aN\2\u0379\u00af\3\2\2\2\u037a\u037b\7C\2"+
		"\2\u037b\u037c\5\u009aN\2\u037c\u037d\7\24\2\2\u037d\u037e\5\u011c\u008f"+
		"\2\u037e\u037f\7\25\2\2\u037f\u00b1\3\2\2\2\u0380\u0381\7D\2\2\u0381\u0382"+
		"\5\u009aN\2\u0382\u00b3\3\2\2\2\u0383\u0384\7E\2\2\u0384\u0385\5\u0136"+
		"\u009c\2\u0385\u00b5\3\2\2\2\u0386\u0387\7F\2\2\u0387\u0389\7\24\2\2\u0388"+
		"\u038a\5\u0122\u0092\2\u0389\u0388\3\2\2\2\u0389\u038a\3\2\2\2\u038a\u038b"+
		"\3\2\2\2\u038b\u038c\7\25\2\2\u038c\u038d\7G\2\2\u038d\u0397\7H\2\2\u038e"+
		"\u038f\7F\2\2\u038f\u0391\7\24\2\2\u0390\u0392\5\u0122\u0092\2\u0391\u0390"+
		"\3\2\2\2\u0391\u0392\3\2\2\2\u0392\u0393\3\2\2\2\u0393\u0394\7\25\2\2"+
		"\u0394\u0395\7G\2\2\u0395\u0397\5\u0098M\2\u0396\u0386\3\2\2\2\u0396\u038e"+
		"\3\2\2\2\u0397\u00b7\3\2\2\2\u0398\u0399\7I\2\2\u0399\u039b\7J\2\2\u039a"+
		"\u039c\5\u009aN\2\u039b\u039a\3\2\2\2\u039b\u039c\3\2\2\2\u039c\u00b9"+
		"\3\2\2\2\u039d\u039e\7K\2\2\u039e\u03a0\7L\2\2\u039f\u03a1\5\u009aN\2"+
		"\u03a0\u039f\3\2\2\2\u03a0\u03a1\3\2\2\2\u03a1\u00bb\3\2\2\2\u03a2\u03a3"+
		"\7M\2\2\u03a3\u03a4\7N\2\2\u03a4\u03a5\5\u0098M\2\u03a5\u00bd\3\2\2\2"+
		"\u03a6\u03a7\7O\2\2\u03a7\u03a8\7N\2\2\u03a8\u03a9\5\u0098M\2\u03a9\u00bf"+
		"\3\2\2\2\u03aa\u03ab\7P\2\2\u03ab\u03ad\7Q\2\2\u03ac\u03ae\5\u0098M\2"+
		"\u03ad\u03ac\3\2\2\2\u03ad\u03ae\3\2\2\2\u03ae\u00c1\3\2\2\2\u03af\u03b0"+
		"\7R\2\2\u03b0\u03b1\7S\2\2\u03b1\u03b2\5\u0098M\2\u03b2\u00c3\3\2\2\2"+
		"\u03b3\u03b4\7T\2\2\u03b4\u03b5\7U\2\2\u03b5\u03b6\5\u0098M\2\u03b6\u00c5"+
		"\3\2\2\2\u03b7\u03b8\7V\2\2\u03b8\u03b9\7=\2\2\u03b9\u00c7\3\2\2\2\u03ba"+
		"\u03bb\7W\2\2\u03bb\u03bc\7X\2\2\u03bc\u03bd\5\u0098M\2\u03bd\u00c9\3"+
		"\2\2\2\u03be\u03bf\7Y\2\2\u03bf\u00cb\3\2\2\2\u03c0\u03c1\7Z\2\2\u03c1"+
		"\u03c2\7[\2\2\u03c2\u03c3\5\u0098M\2\u03c3\u00cd\3\2\2\2\u03c4\u03c5\7"+
		"\\\2\2\u03c5\u03c6\7]\2\2\u03c6\u03c7\5\u0136\u009c\2\u03c7\u00cf\3\2"+
		"\2\2\u03c8\u03c9\7^\2\2\u03c9\u00d1\3\2\2\2\u03ca\u03cb\7_\2\2\u03cb\u03cc"+
		"\7`\2\2\u03cc\u03cd\5\u0098M\2\u03cd\u00d3\3\2\2\2\u03ce\u03cf\7a\2\2"+
		"\u03cf\u00d5\3\2\2\2\u03d0\u03d1\7b\2\2\u03d1\u00d7\3\2\2\2\u03d2\u03d3"+
		"\7c\2\2\u03d3\u03d4\5\u0136\u009c\2\u03d4\u03d5\7\24\2\2\u03d5\u03d6\7"+
		".\2\2\u03d6\u03d7\7\25\2\2\u03d7\u00d9\3\2\2\2\u03d8\u03d9\7d\2\2\u03d9"+
		"\u03da\7e\2\2\u03da\u00db\3\2\2\2\u03db\u03de\7f\2\2\u03dc\u03dd\7\4\2"+
		"\2\u03dd\u03df\5\u0098M\2\u03de\u03dc\3\2\2\2\u03de\u03df\3\2\2\2\u03df"+
		"\u00dd\3\2\2\2\u03e0\u03e1\7g\2\2\u03e1\u03e2\7h\2\2\u03e2\u03e3\5\u0136"+
		"\u009c\2\u03e3\u03e4\7i\2\2\u03e4\u03e5\5\u0098M\2\u03e5\u03e6\7\25\2"+
		"\2\u03e6\u00df\3\2\2\2\u03e7\u03e8\5\4\3\2\u03e8\u03e9\5\u016e\u00b8\2"+
		"\u03e9\u00e1\3\2\2\2\u03ea\u03ec\7j\2\2\u03eb\u03ed\7\24\2\2\u03ec\u03eb"+
		"\3\2\2\2\u03ed\u03ee\3\2\2\2\u03ee\u03ec\3\2\2\2\u03ee\u03ef\3\2\2\2\u03ef"+
		"\u00e3\3\2\2\2\u03f0\u03f2\7j\2\2\u03f1\u03f3\7\25\2\2\u03f2\u03f1\3\2"+
		"\2\2\u03f3\u03f4\3\2\2\2\u03f4\u03f2\3\2\2\2\u03f4\u03f5\3\2\2\2\u03f5"+
		"\u00e5\3\2\2\2\u03f6\u03f8\7j\2\2\u03f7\u03f9\7k\2\2\u03f8\u03f7\3\2\2"+
		"\2\u03f9\u03fa\3\2\2\2\u03fa\u03f8\3\2\2\2\u03fa\u03fb\3\2\2\2\u03fb\u00e7"+
		"\3\2\2\2\u03fc\u03fe\7j\2\2\u03fd\u03ff\7l\2\2\u03fe\u03fd\3\2\2\2\u03ff"+
		"\u0400\3\2\2\2\u0400\u03fe\3\2\2\2\u0400\u0401\3\2\2\2\u0401\u00e9\3\2"+
		"\2\2\u0402\u0404\7j\2\2\u0403\u0405\7m\2\2\u0404\u0403\3\2\2\2\u0405\u0406"+
		"\3\2\2\2\u0406\u0404\3\2\2\2\u0406\u0407\3\2\2\2\u0407\u00eb\3\2\2\2\u0408"+
		"\u0409\7n\2\2\u0409\u00ed\3\2\2\2\u040a\u040b\7o\2\2\u040b\u00ef\3\2\2"+
		"\2\u040c\u040d\7p\2\2\u040d\u00f1\3\2\2\2\u040e\u040f\7q\2\2\u040f\u00f3"+
		"\3\2\2\2\u0410\u0411\7r\2\2\u0411\u00f5\3\2\2\2\u0412\u0413\7s\2\2\u0413"+
		"\u00f7\3\2\2\2\u0414\u0415\7t\2\2\u0415\u00f9\3\2\2\2\u0416\u0417\7u\2"+
		"\2\u0417\u00fb\3\2\2\2\u0418\u0419\7v\2\2\u0419\u00fd\3\2\2\2\u041a\u041b"+
		"\7w\2\2\u041b\u00ff\3\2\2\2\u041c\u041d\7x\2\2\u041d\u0101\3\2\2\2\u041e"+
		"\u041f\7y\2\2\u041f\u0103\3\2\2\2\u0420\u0421\7z\2\2\u0421\u0105\3\2\2"+
		"\2\u0422\u0423\7{\2\2\u0423\u0107\3\2\2\2\u0424\u0425\7|\2\2\u0425\u0109"+
		"\3\2\2\2\u0426\u0427\7}\2\2\u0427\u010b\3\2\2\2\u0428\u042b\5\u0098M\2"+
		"\u0429\u042b\5\u0136\u009c\2\u042a\u0428\3\2\2\2\u042a\u0429\3\2\2\2\u042b"+
		"\u010d\3\2\2\2\u042c\u042d\5\u010c\u0087\2\u042d\u010f\3\2\2\2\u042e\u0431"+
		"\7\30\2\2\u042f\u0430\7\u009d\2\2\u0430\u0432\5\u010c\u0087\2\u0431\u042f"+
		"\3\2\2\2\u0431\u0432\3\2\2\2\u0432\u0111\3\2\2\2\u0433\u0436\7\27\2\2"+
		"\u0434\u0435\7\u009d\2\2\u0435\u0437\5\u010c\u0087\2\u0436\u0434\3\2\2"+
		"\2\u0436\u0437\3\2\2\2\u0437\u0113\3\2\2\2\u0438\u043b\7.\2\2\u0439\u043a"+
		"\7\u009d\2\2\u043a\u043c\5\u010c\u0087\2\u043b\u0439\3\2\2\2\u043b\u043c"+
		"\3\2\2\2\u043c\u0115\3\2\2\2\u043d\u0443\3\2\2\2\u043e\u0443\5\u0110\u0089"+
		"\2\u043f\u0443\5\u0112\u008a\2\u0440\u0443\5\u0114\u008b\2\u0441\u0443"+
		"\5\u010e\u0088\2\u0442\u043d\3\2\2\2\u0442\u043e\3\2\2\2\u0442\u043f\3"+
		"\2\2\2\u0442\u0440\3\2\2\2\u0442\u0441\3\2\2\2\u0443\u0117\3\2\2\2\u0444"+
		"\u0445\7}\2\2\u0445\u0119\3\2\2\2\u0446\u0447\5\u0098M\2\u0447\u011b\3"+
		"\2\2\2\u0448\u044d\5\u0116\u008c\2\u0449\u044a\7\u009c\2\2\u044a\u044c"+
		"\5\u011a\u008e\2\u044b\u0449\3\2\2\2\u044c\u044f\3\2\2\2\u044d\u044b\3"+
		"\2\2\2\u044d\u044e\3\2\2\2\u044e\u011d\3\2\2\2\u044f\u044d\3\2\2\2\u0450"+
		"\u0451\5\u0136\u009c\2\u0451\u011f\3\2\2\2\u0452\u0453\5\u0136\u009c\2"+
		"\u0453\u0454\7\u0097\2\2\u0454\u0121\3\2\2\2\u0455\u045a\5\u011e\u0090"+
		"\2\u0456\u0457\7\u009c\2\2\u0457\u0459\5\u011e\u0090\2\u0458\u0456\3\2"+
		"\2\2\u0459\u045c\3\2\2\2\u045a\u0458\3\2\2\2\u045a\u045b\3\2\2\2\u045b"+
		"\u045f\3\2\2\2\u045c\u045a\3\2\2\2\u045d\u045e\7\u009c\2\2\u045e\u0460"+
		"\5\u0120\u0091\2\u045f\u045d\3\2\2\2\u045f\u0460\3\2\2\2\u0460\u0463\3"+
		"\2\2\2\u0461\u0463\5\u0120\u0091\2\u0462\u0455\3\2\2\2\u0462\u0461\3\2"+
		"\2\2\u0463\u0123\3\2\2\2\u0464\u046b\5\u0126\u0094\2\u0465\u046b\5\u012c"+
		"\u0097\2\u0466\u046b\5\u012e\u0098\2\u0467\u046b\5\u0130\u0099\2\u0468"+
		"\u046b\5\u0132\u009a\2\u0469\u046b\5\u0134\u009b\2\u046a\u0464\3\2\2\2"+
		"\u046a\u0465\3\2\2\2\u046a\u0466\3\2\2\2\u046a\u0467\3\2\2\2\u046a\u0468"+
		"\3\2\2\2\u046a\u0469\3\2\2\2\u046b\u0125\3\2\2\2\u046c\u046f\5\u0128\u0095"+
		"\2\u046d\u046f\5\u012a\u0096\2\u046e\u046c\3\2\2\2\u046e\u046d\3\2\2\2"+
		"\u046f\u0127\3\2\2\2\u0470\u0471\7\u0098\2\2\u0471\u0129\3\2\2\2\u0472"+
		"\u0473\7\u0099\2\2\u0473\u012b\3\2\2\2\u0474\u0475\t\2\2\2\u0475\u012d"+
		"\3\2\2\2\u0476\u0477\7\u009a\2\2\u0477\u012f\3\2\2\2\u0478\u0479\7\u009b"+
		"\2\2\u0479\u0131\3\2\2\2\u047a\u047b\7\u0080\2\2\u047b\u0133\3\2\2\2\u047c"+
		"\u047d\7\u0081\2\2\u047d\u047e\7\u009d\2\2\u047e\u047f\5\u0136\u009c\2"+
		"\u047f\u0135\3\2\2\2\u0480\u0488\5\u0138\u009d\2\u0481\u0488\5\u013a\u009e"+
		"\2\u0482\u0488\5\u014e\u00a8\2\u0483\u0488\5\u0150\u00a9\2\u0484\u0488"+
		"\5\u0158\u00ad\2\u0485\u0488\5\u015e\u00b0\2\u0486\u0488\5\u0160\u00b1"+
		"\2\u0487\u0480\3\2\2\2\u0487\u0481\3\2\2\2\u0487\u0482\3\2\2\2\u0487\u0483"+
		"\3\2\2\2\u0487\u0484\3\2\2\2\u0487\u0485\3\2\2\2\u0487\u0486\3\2\2\2\u0488"+
		"\u0137\3\2\2\2\u0489\u048a\7\u0082\2\2\u048a\u0139\3\2\2\2\u048b\u048c"+
		"\t\3\2\2\u048c\u013b\3\2\2\2\u048d\u048e\5\u009aN\2\u048e\u013d\3\2\2"+
		"\2\u048f\u0490\7\u008b\2\2\u0490\u0491\5\u0136\u009c\2\u0491\u013f\3\2"+
		"\2\2\u0492\u0493\7\27\2\2\u0493\u0494\5\u0136\u009c\2\u0494\u0141\3\2"+
		"\2\2\u0495\u0498\5\u013e\u00a0\2\u0496\u0498\5\u0140\u00a1\2\u0497\u0495"+
		"\3\2\2\2\u0497\u0496\3\2\2\2\u0498\u0143\3\2\2\2\u0499\u049b\7\u008c\2"+
		"\2\u049a\u049c\5\u0142\u00a2\2\u049b\u049a\3\2\2\2\u049b\u049c\3\2\2\2"+
		"\u049c\u0145\3\2\2\2\u049d\u04a0\5\u0136\u009c\2\u049e\u04a0\5\u0144\u00a3"+
		"\2\u049f\u049d\3\2\2\2\u049f\u049e\3\2\2\2\u04a0\u0147\3\2\2\2\u04a1\u04a2"+
		"\7\35\2\2\u04a2\u04a7\5\u0146\u00a4\2\u04a3\u04a4\7\u009c\2\2\u04a4\u04a6"+
		"\5\u0146\u00a4\2\u04a5\u04a3\3\2\2\2\u04a6\u04a9\3\2\2\2\u04a7\u04a5\3"+
		"\2\2\2\u04a7\u04a8\3\2\2\2\u04a8\u04aa\3\2\2\2\u04a9\u04a7\3\2\2\2\u04aa"+
		"\u04ab\7\34\2\2\u04ab\u0149\3\2\2\2\u04ac\u04ad\5\u009aN\2\u04ad\u04ae"+
		"\5\u0148\u00a5\2\u04ae\u014b\3\2\2\2\u04af\u04b2\5\u013c\u009f\2\u04b0"+
		"\u04b2\5\u014a\u00a6\2\u04b1\u04af\3\2\2\2\u04b1\u04b0\3\2\2\2\u04b2\u014d"+
		"\3\2\2\2\u04b3\u04b8\5\u014c\u00a7\2\u04b4\u04b5\7\u009d\2\2\u04b5\u04b7"+
		"\5\u014c\u00a7\2\u04b6\u04b4\3\2\2\2\u04b7\u04ba\3\2\2\2\u04b8\u04b6\3"+
		"\2\2\2\u04b8\u04b9\3\2\2\2\u04b9\u014f\3\2\2\2\u04ba\u04b8\3\2\2\2\u04bb"+
		"\u04bc\5\u013a\u009e\2\u04bc\u04bd\5\u0152\u00aa\2\u04bd\u04c2\3\2\2\2"+
		"\u04be\u04bf\5\u014e\u00a8\2\u04bf\u04c0\5\u0152\u00aa\2\u04c0\u04c2\3"+
		"\2\2\2\u04c1\u04bb\3\2\2\2\u04c1\u04be\3\2\2\2\u04c2\u0151\3\2\2\2\u04c3"+
		"\u04c4\7\u008d\2\2\u04c4\u04c9\7\u008e\2\2\u04c5\u04c6\7\u008d\2\2\u04c6"+
		"\u04c8\7\u008e\2\2\u04c7\u04c5\3\2\2\2\u04c8\u04cb\3\2\2\2\u04c9\u04c7"+
		"\3\2\2\2\u04c9\u04ca\3\2\2\2\u04ca\u0153\3\2\2\2\u04cb\u04c9\3\2\2\2\u04cc"+
		"\u04d1\5\u014e\u00a8\2\u04cd\u04d1\5\u013a\u009e\2\u04ce\u04d1\5\u0150"+
		"\u00a9\2\u04cf\u04d1\5\u0160\u00b1\2\u04d0\u04cc\3\2\2\2\u04d0\u04cd\3"+
		"\2\2\2\u04d0\u04ce\3\2\2\2\u04d0\u04cf\3\2\2\2\u04d1\u0155\3\2\2\2\u04d2"+
		"\u04d8\5\u014e\u00a8\2\u04d3\u04d8\5\u013a\u009e\2\u04d4\u04d8\5\u0150"+
		"\u00a9\2\u04d5\u04d8\5\u0160\u00b1\2\u04d6\u04d8\5\u015e\u00b0\2\u04d7"+
		"\u04d2\3\2\2\2\u04d7\u04d3\3\2\2\2\u04d7\u04d4\3\2\2\2\u04d7\u04d5\3\2"+
		"\2\2\u04d7\u04d6\3\2\2\2\u04d8\u0157\3\2\2\2\u04d9\u04dc\5\u0154\u00ab"+
		"\2\u04da\u04db\7(\2\2\u04db\u04dd\5\u0156\u00ac\2\u04dc\u04da\3\2\2\2"+
		"\u04dd\u04de\3\2\2\2\u04de\u04dc\3\2\2\2\u04de\u04df\3\2\2\2\u04df\u0159"+
		"\3\2\2\2\u04e0\u04e5\5\u014e\u00a8\2\u04e1\u04e5\5\u013a\u009e\2\u04e2"+
		"\u04e5\5\u0150\u00a9\2\u04e3\u04e5\5\u0160\u00b1\2\u04e4\u04e0\3\2\2\2"+
		"\u04e4\u04e1\3\2\2\2\u04e4\u04e2\3\2\2\2\u04e4\u04e3\3\2\2\2\u04e5\u015b"+
		"\3\2\2\2\u04e6\u04ec\5\u014e\u00a8\2\u04e7\u04ec\5\u013a\u009e\2\u04e8"+
		"\u04ec\5\u0150\u00a9\2\u04e9\u04ec\5\u0160\u00b1\2\u04ea\u04ec\5\u0158"+
		"\u00ad\2\u04eb\u04e6\3\2\2\2\u04eb\u04e7\3\2\2\2\u04eb\u04e8\3\2\2\2\u04eb"+
		"\u04e9\3\2\2\2\u04eb\u04ea\3\2\2\2\u04ec\u015d\3\2\2\2\u04ed\u04f0\5\u015a"+
		"\u00ae\2\u04ee\u04ef\7)\2\2\u04ef\u04f1\5\u015c\u00af\2\u04f0\u04ee\3"+
		"\2\2\2\u04f1\u04f2\3\2\2\2\u04f2\u04f0\3\2\2\2\u04f2\u04f3\3\2\2\2\u04f3"+
		"\u015f\3\2\2\2\u04f4\u04f5\7\u008f\2\2\u04f5\u04f6\5\u0128\u0095\2\u04f6"+
		"\u04f7\7\u008c\2\2\u04f7\u04f8\5\u0128\u0095\2\u04f8\u0161\3\2\2\2\u04f9"+
		"\u04fa\7\u0090\2\2\u04fa\u04fb\5\u0128\u0095\2\u04fb\u04fc\7\u008c\2\2"+
		"\u04fc\u04fd\5\u0128\u0095\2\u04fd\u0163\3\2\2\2\u04fe\u04ff\7\u0091\2"+
		"\2\u04ff\u0500\5\u0128\u0095\2\u0500\u0501\7\u008c\2\2\u0501\u0502\5\u0128"+
		"\u0095\2\u0502\u0165\3\2\2\2\u0503\u0504\7\u0092\2\2\u0504\u0505\5\u0128"+
		"\u0095\2\u0505\u0506\7\u008c\2\2\u0506\u0507\5\u0128\u0095\2\u0507\u0167"+
		"\3\2\2\2\u0508\u0509\7\u0093\2\2\u0509\u050a\5\u0128\u0095\2\u050a\u050b"+
		"\7\u008c\2\2\u050b\u050c\5\u0128\u0095\2\u050c\u0169\3\2\2\2\u050d\u050e"+
		"\7\u0094\2\2\u050e\u016b\3\2\2\2\u050f\u0510\7}\2\2\u0510\u016d\3\2\2"+
		"\2\u0511\u0513\7\u008e\2\2\u0512\u0511\3\2\2\2\u0513\u0514\3\2\2\2\u0514"+
		"\u0512\3\2\2\2\u0514\u0515\3\2\2\2\u0515\u016f\3\2\2\2<\u01a8\u01b7\u0201"+
		"\u020f\u0233\u0253\u025c\u0263\u02db\u02ef\u02f4\u0305\u0329\u0335\u033b"+
		"\u0348\u035d\u036c\u0375\u0389\u0391\u0396\u039b\u03a0\u03ad\u03de\u03ee"+
		"\u03f4\u03fa\u0400\u0406\u042a\u0431\u0436\u043b\u0442\u044d\u045a\u045f"+
		"\u0462\u046a\u046e\u0487\u0497\u049b\u049f\u04a7\u04b1\u04b8\u04c1\u04c9"+
		"\u04d0\u04d7\u04de\u04e4\u04eb\u04f2\u0514";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}