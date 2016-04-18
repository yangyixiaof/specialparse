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
		T__107=108, T__108=109, T__109=110, JavaLetter=111, JavaLetterOrDigit=112, 
		OffsetDesc=113, AT=114, WS=115, DecimalIntegerLiteral=116, HexIntegerLiteral=117, 
		OctalIntegerLiteral=118, BinaryIntegerLiteral=119, IntegerTypeSuffix=120, 
		DecimalNumeral=121, Digits=122, Digit=123, NonZeroDigit=124, DigitsAndUnderscores=125, 
		DigitOrUnderscore=126, Underscores=127, HexNumeral=128, HexDigits=129, 
		HexDigit=130, HexDigitsAndUnderscores=131, HexDigitOrUnderscore=132, OctalNumeral=133, 
		OctalDigits=134, OctalDigit=135, OctalDigitsAndUnderscores=136, OctalDigitOrUnderscore=137, 
		BinaryNumeral=138, BinaryDigits=139, BinaryDigit=140, BinaryDigitsAndUnderscores=141, 
		BinaryDigitOrUnderscore=142, DecimalFloatingPointLiteral=143, ExponentPart=144, 
		ExponentIndicator=145, SignedInteger=146, Sign=147, FloatTypeSuffix=148, 
		HexadecimalFloatingPointLiteral=149, HexSignificand=150, BinaryExponent=151, 
		BinaryExponentIndicator=152, SingleCharacter=153, EscapeSequence=154, 
		OctalEscape=155, ZeroToThree=156, UnicodeEscape=157, COMMA=158, DOT=159, 
		GT=160, LT=161, BANG=162, TILDE=163, QUESTION=164, COLON=165, EQUAL=166, 
		LE=167, GE=168, NOTEQUAL=169, AND=170, OR=171, INC=172, DEC=173, ADD=174, 
		SUB=175, MUL=176, DIV=177, BITAND=178, BITOR=179, CARET=180, MOD=181, 
		LSHIFT=182, RSHIFT=183, URSHIFT=184, COLONCOLON=185, ASSIGN=186, ADD_ASSIGN=187, 
		SUB_ASSIGN=188, MUL_ASSIGN=189, DIV_ASSIGN=190, AND_ASSIGN=191, OR_ASSIGN=192, 
		XOR_ASSIGN=193, MOD_ASSIGN=194, LSHIFT_ASSIGN=195, RSHIFT_ASSIGN=196, 
		URSHIFT_ASSIGN=197;
	public static final int
		RULE_statement = 0, RULE_expressionStatement = 1, RULE_assignmentStatement = 2, 
		RULE_literalStatement = 3, RULE_castExpressionStatement = 4, RULE_methodInvocationStatement = 5, 
		RULE_fieldAccessStatement = 6, RULE_fieldAccess = 7, RULE_infixExpressionStatement = 8, 
		RULE_instanceofExpressionStatement = 9, RULE_methodReferenceStatement = 10, 
		RULE_nameStatement = 11, RULE_prefixExpressionStatement = 12, RULE_postfixExpressionStatement = 13, 
		RULE_arrayAccessStatement = 14, RULE_referedExpression = 15, RULE_anonymousClassBeginStatement = 16, 
		RULE_anonymousClassPlaceHolderStatement = 17, RULE_anonymousClassPreStatement = 18, 
		RULE_atInterfaceStatement = 19, RULE_annotationTypeMemberDeclarationStatement = 20, 
		RULE_classDeclarationStatement = 21, RULE_classInnerDeclarationStatement = 22, 
		RULE_enumDeclarationStatement = 23, RULE_methodDeclarationStatement = 24, 
		RULE_enumConstantDeclarationStatement = 25, RULE_labeledStatement = 26, 
		RULE_variableDeclarationStatement = 27, RULE_lambdaExpressionStatement = 28, 
		RULE_breakStatement = 29, RULE_continueStatement = 30, RULE_doWhileStatement = 31, 
		RULE_whileStatement = 32, RULE_returnStatement = 33, RULE_switchStatement = 34, 
		RULE_switchCaseStatement = 35, RULE_defaultStatement = 36, RULE_synchronizedStatement = 37, 
		RULE_throwStatement = 38, RULE_catchClauseStatement = 39, RULE_ifStatement = 40, 
		RULE_arrayCreationStatement = 41, RULE_initializerStatement = 42, RULE_variableDeclarationHolderStatement = 43, 
		RULE_enhancedForStatement = 44, RULE_partialEndArrayAccessStatement = 45, 
		RULE_leftParentheseStatement = 46, RULE_rightParentheseStatement = 47, 
		RULE_leftBraceStatement = 48, RULE_rightBraceStatement = 49, RULE_enterMethodParamStatement = 50, 
		RULE_arrayInitializerStartStatement = 51, RULE_arrayInitializerSplitCommaStatement = 52, 
		RULE_arrayInitializerEndStatement = 53, RULE_enumConstantDeclarationSplitCommaStatement = 54, 
		RULE_forStatement = 55, RULE_forIniOverStatement = 56, RULE_forExpOverStatement = 57, 
		RULE_forUpdOverStatement = 58, RULE_condExpBeginStatement = 59, RULE_condExpQuestionMarkStatement = 60, 
		RULE_condExpColonMarkStatement = 61, RULE_partialEndStatement = 62, RULE_fullEndStatement = 63, 
		RULE_partialMethodArgumentEndStatement = 64, RULE_partialMethodPreRerferedExpressionEndStatement = 65, 
		RULE_firstArgPreExist = 66, RULE_firstArgReferedExpression = 67, RULE_commonClassMemberInvoke = 68, 
		RULE_selfClassMemberInvoke = 69, RULE_superClassMemberInvoke = 70, RULE_newClassInvoke = 71, 
		RULE_firstArg = 72, RULE_methodArgPreExist = 73, RULE_methodArgReferedExpression = 74, 
		RULE_argumentList = 75, RULE_typeList = 76, RULE_argType = 77, RULE_argTypeList = 78, 
		RULE_literal = 79, RULE_numberLiteral = 80, RULE_stringLiteral = 81, RULE_type = 82, 
		RULE_virtualInferredType = 83, RULE_primitiveType = 84, RULE_simpleType = 85, 
		RULE_parameterizedType = 86, RULE_bothType = 87, RULE_classOrInterfaceType = 88, 
		RULE_arrayType = 89, RULE_dims = 90, RULE_wildCardType = 91, RULE_extendBound = 92, 
		RULE_superBound = 93, RULE_wildcardBounds = 94, RULE_intersectionFirstType = 95, 
		RULE_intersectionSecondType = 96, RULE_intersectionType = 97, RULE_unionFirstType = 98, 
		RULE_unionSecondType = 99, RULE_unionType = 100, RULE_identifier = 101, 
		RULE_idRawLetter = 102, RULE_classRef = 103, RULE_finalFieldRef = 104, 
		RULE_finalVarRef = 105, RULE_commonFieldRef = 106, RULE_commonVarRef = 107, 
		RULE_offset = 108, RULE_codeHole = 109, RULE_preExist = 110, RULE_endOfArrayDeclarationIndexExpression = 111, 
		RULE_endOfArrayInitializerElementExpression = 112, RULE_integerLiteral = 113, 
		RULE_floatingPointLiteral = 114, RULE_booleanLiteral = 115, RULE_characterLiteral = 116, 
		RULE_nullLiteral = 117, RULE_prefixUnaryOperator = 118, RULE_postfixUnaryOperator = 119, 
		RULE_binaryOperator = 120, RULE_assignmentOperator = 121;
	public static final String[] ruleNames = {
		"statement", "expressionStatement", "assignmentStatement", "literalStatement", 
		"castExpressionStatement", "methodInvocationStatement", "fieldAccessStatement", 
		"fieldAccess", "infixExpressionStatement", "instanceofExpressionStatement", 
		"methodReferenceStatement", "nameStatement", "prefixExpressionStatement", 
		"postfixExpressionStatement", "arrayAccessStatement", "referedExpression", 
		"anonymousClassBeginStatement", "anonymousClassPlaceHolderStatement", 
		"anonymousClassPreStatement", "atInterfaceStatement", "annotationTypeMemberDeclarationStatement", 
		"classDeclarationStatement", "classInnerDeclarationStatement", "enumDeclarationStatement", 
		"methodDeclarationStatement", "enumConstantDeclarationStatement", "labeledStatement", 
		"variableDeclarationStatement", "lambdaExpressionStatement", "breakStatement", 
		"continueStatement", "doWhileStatement", "whileStatement", "returnStatement", 
		"switchStatement", "switchCaseStatement", "defaultStatement", "synchronizedStatement", 
		"throwStatement", "catchClauseStatement", "ifStatement", "arrayCreationStatement", 
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
		"methodArgReferedExpression", "argumentList", "typeList", "argType", "argTypeList", 
		"literal", "numberLiteral", "stringLiteral", "type", "virtualInferredType", 
		"primitiveType", "simpleType", "parameterizedType", "bothType", "classOrInterfaceType", 
		"arrayType", "dims", "wildCardType", "extendBound", "superBound", "wildcardBounds", 
		"intersectionFirstType", "intersectionSecondType", "intersectionType", 
		"unionFirstType", "unionSecondType", "unionType", "identifier", "idRawLetter", 
		"classRef", "finalFieldRef", "finalVarRef", "commonFieldRef", "commonVarRef", 
		"offset", "codeHole", "preExist", "endOfArrayDeclarationIndexExpression", 
		"endOfArrayInitializerElementExpression", "integerLiteral", "floatingPointLiteral", 
		"booleanLiteral", "characterLiteral", "nullLiteral", "prefixUnaryOperator", 
		"postfixUnaryOperator", "binaryOperator", "assignmentOperator"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'A@'", "'L@'", "'CE@'", "'('", "')'", "'MI@'", "'FA@'", "'IxE@'", 
		"'InE@'", "'instanceof'", "'MR@'", "'N@'", "'PeE@'", "'PtE@'", "'[@'", 
		"'#'", "'AB@AnonymousBegin'", "'DH@AnonymousDeclaration'", "'HT@'", "'AT@'", 
		"'AM@'", "'()'", "'default'", "'CD@'", "'ICD@'", "'ED@'", "'MD@'", "'EMD@'", 
		"'LD@'", "'VD@'", "'LE@'", "'->'", "'{}'", "'B@'", "'break'", "'C@'", 
		"'continue'", "'DW@'", "'while'", "'WS@'", "'RT@'", "'return'", "'SW@'", 
		"'switch'", "'CS@'", "'case'", "'DF@'", "'SC@'", "'synchronized'", "'TS@'", 
		"'throw'", "'CT@'", "'catch'", "'IF@'", "'if'", "'AC@'", "'(new)'", "'IB@'", 
		"'InitialBlock'", "'VH@'", "'EF@'", "'for('", "'DH@'", "'{'", "'}'", "'Em'", 
		"'A{'", "'A,'", "'A}'", "'E,'", "'for'", "'forIniOver'", "'forExpOver'", 
		"'forUpdOver'", "'CondExpBegin'", "'CondExpQM'", "'CondExpCM'", "'DH@,'", 
		"'DH@;'", "'DH@Ps'", "'DH@Pr'", "'@PE'", "'this'", "'super'", "'new'", 
		"'@STR'", "'@IT'", "'float'", "'double'", "'boolean'", "'byte'", "'short'", 
		"'int'", "'long'", "'char'", "'['", "']'", "'extends'", "'$K'", "'$D'", 
		"'$X'", "'$F'", "'$C'", "'@HO'", "'@]'", "'@I]'", "'true'", "'false'", 
		"'''", "'null'", null, null, null, "'@'", null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, "','", "'.'", "'>'", "'<'", "'!'", "'~'", "'?'", "':'", "'=='", 
		"'<='", "'>='", "'!='", "'&&'", "'||'", "'++'", "'--'", "'+'", "'-'", 
		"'*'", "'/'", "'&'", "'|'", "'^'", "'%'", "'<<'", "'>>'", "'>>>'", "'::'", 
		"'='", "'+='", "'-='", "'*='", "'/='", "'&='", "'|='", "'^='", "'%='", 
		"'<<='", "'>>='", "'>>>='"
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
		null, null, null, "JavaLetter", "JavaLetterOrDigit", "OffsetDesc", "AT", 
		"WS", "DecimalIntegerLiteral", "HexIntegerLiteral", "OctalIntegerLiteral", 
		"BinaryIntegerLiteral", "IntegerTypeSuffix", "DecimalNumeral", "Digits", 
		"Digit", "NonZeroDigit", "DigitsAndUnderscores", "DigitOrUnderscore", 
		"Underscores", "HexNumeral", "HexDigits", "HexDigit", "HexDigitsAndUnderscores", 
		"HexDigitOrUnderscore", "OctalNumeral", "OctalDigits", "OctalDigit", "OctalDigitsAndUnderscores", 
		"OctalDigitOrUnderscore", "BinaryNumeral", "BinaryDigits", "BinaryDigit", 
		"BinaryDigitsAndUnderscores", "BinaryDigitOrUnderscore", "DecimalFloatingPointLiteral", 
		"ExponentPart", "ExponentIndicator", "SignedInteger", "Sign", "FloatTypeSuffix", 
		"HexadecimalFloatingPointLiteral", "HexSignificand", "BinaryExponent", 
		"BinaryExponentIndicator", "SingleCharacter", "EscapeSequence", "OctalEscape", 
		"ZeroToThree", "UnicodeEscape", "COMMA", "DOT", "GT", "LT", "BANG", "TILDE", 
		"QUESTION", "COLON", "EQUAL", "LE", "GE", "NOTEQUAL", "AND", "OR", "INC", 
		"DEC", "ADD", "SUB", "MUL", "DIV", "BITAND", "BITOR", "CARET", "MOD", 
		"LSHIFT", "RSHIFT", "URSHIFT", "COLONCOLON", "ASSIGN", "ADD_ASSIGN", "SUB_ASSIGN", 
		"MUL_ASSIGN", "DIV_ASSIGN", "AND_ASSIGN", "OR_ASSIGN", "XOR_ASSIGN", "MOD_ASSIGN", 
		"LSHIFT_ASSIGN", "RSHIFT_ASSIGN", "URSHIFT_ASSIGN"
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
		public ThrowStatementContext throwStatement() {
			return getRuleContext(ThrowStatementContext.class,0);
		}
		public CatchClauseStatementContext catchClauseStatement() {
			return getRuleContext(CatchClauseStatementContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
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
			setState(294);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(244);
				anonymousClassBeginStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(245);
				anonymousClassPlaceHolderStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(246);
				anonymousClassPreStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(247);
				atInterfaceStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(248);
				annotationTypeMemberDeclarationStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(249);
				classDeclarationStatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(250);
				classInnerDeclarationStatement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(251);
				enumDeclarationStatement();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(252);
				methodDeclarationStatement();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(253);
				enumConstantDeclarationStatement();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(254);
				labeledStatement();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(255);
				variableDeclarationStatement();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(256);
				lambdaExpressionStatement();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(257);
				breakStatement();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(258);
				continueStatement();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(259);
				doWhileStatement();
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(260);
				whileStatement();
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(261);
				returnStatement();
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(262);
				switchStatement();
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(263);
				switchCaseStatement();
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(264);
				defaultStatement();
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(265);
				synchronizedStatement();
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(266);
				throwStatement();
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(267);
				catchClauseStatement();
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(268);
				ifStatement();
				}
				break;
			case 26:
				enterOuterAlt(_localctx, 26);
				{
				setState(269);
				arrayCreationStatement();
				}
				break;
			case 27:
				enterOuterAlt(_localctx, 27);
				{
				setState(270);
				initializerStatement();
				}
				break;
			case 28:
				enterOuterAlt(_localctx, 28);
				{
				setState(271);
				variableDeclarationHolderStatement();
				}
				break;
			case 29:
				enterOuterAlt(_localctx, 29);
				{
				setState(272);
				enhancedForStatement();
				}
				break;
			case 30:
				enterOuterAlt(_localctx, 30);
				{
				setState(273);
				partialEndArrayAccessStatement();
				}
				break;
			case 31:
				enterOuterAlt(_localctx, 31);
				{
				setState(274);
				leftParentheseStatement();
				}
				break;
			case 32:
				enterOuterAlt(_localctx, 32);
				{
				setState(275);
				rightParentheseStatement();
				}
				break;
			case 33:
				enterOuterAlt(_localctx, 33);
				{
				setState(276);
				leftBraceStatement();
				}
				break;
			case 34:
				enterOuterAlt(_localctx, 34);
				{
				setState(277);
				rightBraceStatement();
				}
				break;
			case 35:
				enterOuterAlt(_localctx, 35);
				{
				setState(278);
				enterMethodParamStatement();
				}
				break;
			case 36:
				enterOuterAlt(_localctx, 36);
				{
				setState(279);
				arrayInitializerStartStatement();
				}
				break;
			case 37:
				enterOuterAlt(_localctx, 37);
				{
				setState(280);
				arrayInitializerSplitCommaStatement();
				}
				break;
			case 38:
				enterOuterAlt(_localctx, 38);
				{
				setState(281);
				arrayInitializerEndStatement();
				}
				break;
			case 39:
				enterOuterAlt(_localctx, 39);
				{
				setState(282);
				forStatement();
				}
				break;
			case 40:
				enterOuterAlt(_localctx, 40);
				{
				setState(283);
				forIniOverStatement();
				}
				break;
			case 41:
				enterOuterAlt(_localctx, 41);
				{
				setState(284);
				forExpOverStatement();
				}
				break;
			case 42:
				enterOuterAlt(_localctx, 42);
				{
				setState(285);
				forUpdOverStatement();
				}
				break;
			case 43:
				enterOuterAlt(_localctx, 43);
				{
				setState(286);
				condExpBeginStatement();
				}
				break;
			case 44:
				enterOuterAlt(_localctx, 44);
				{
				setState(287);
				condExpQuestionMarkStatement();
				}
				break;
			case 45:
				enterOuterAlt(_localctx, 45);
				{
				setState(288);
				condExpColonMarkStatement();
				}
				break;
			case 46:
				enterOuterAlt(_localctx, 46);
				{
				setState(289);
				partialEndStatement();
				}
				break;
			case 47:
				enterOuterAlt(_localctx, 47);
				{
				setState(290);
				fullEndStatement();
				}
				break;
			case 48:
				enterOuterAlt(_localctx, 48);
				{
				setState(291);
				partialMethodArgumentEndStatement();
				}
				break;
			case 49:
				enterOuterAlt(_localctx, 49);
				{
				setState(292);
				partialMethodPreRerferedExpressionEndStatement();
				}
				break;
			case 50:
				enterOuterAlt(_localctx, 50);
				{
				setState(293);
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
			setState(308);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(296);
				assignmentStatement();
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
				setState(297);
				literalStatement();
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 3);
				{
				setState(298);
				castExpressionStatement();
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 4);
				{
				setState(299);
				methodInvocationStatement();
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 5);
				{
				setState(300);
				fieldAccessStatement();
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 6);
				{
				setState(301);
				infixExpressionStatement();
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 7);
				{
				setState(302);
				instanceofExpressionStatement();
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 8);
				{
				setState(303);
				methodReferenceStatement();
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 9);
				{
				setState(304);
				nameStatement();
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 10);
				{
				setState(305);
				prefixExpressionStatement();
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 11);
				{
				setState(306);
				postfixExpressionStatement();
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 12);
				{
				setState(307);
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

	public static class AssignmentStatementContext extends ParserRuleContext {
		public List<ReferedExpressionContext> referedExpression() {
			return getRuleContexts(ReferedExpressionContext.class);
		}
		public ReferedExpressionContext referedExpression(int i) {
			return getRuleContext(ReferedExpressionContext.class,i);
		}
		public AssignmentOperatorContext assignmentOperator() {
			return getRuleContext(AssignmentOperatorContext.class,0);
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
		enterRule(_localctx, 4, RULE_assignmentStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(310);
			match(T__0);
			setState(311);
			referedExpression();
			setState(312);
			assignmentOperator();
			setState(313);
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

	public static class LiteralStatementContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
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
		enterRule(_localctx, 6, RULE_literalStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(315);
			match(T__1);
			setState(316);
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
		enterRule(_localctx, 8, RULE_castExpressionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(318);
			match(T__2);
			setState(319);
			match(T__3);
			setState(320);
			type();
			setState(321);
			match(T__4);
			setState(322);
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
		enterRule(_localctx, 10, RULE_methodInvocationStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(324);
			match(T__5);
			setState(325);
			identifier();
			setState(326);
			match(T__3);
			setState(327);
			argumentList();
			setState(328);
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
		enterRule(_localctx, 12, RULE_fieldAccessStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(330);
			match(T__6);
			setState(331);
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
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ReferedExpressionContext referedExpression() {
			return getRuleContext(ReferedExpressionContext.class,0);
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
		enterRule(_localctx, 14, RULE_fieldAccess);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(333);
			identifier();
			setState(334);
			match(DOT);
			setState(335);
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
		public List<ReferedExpressionContext> referedExpression() {
			return getRuleContexts(ReferedExpressionContext.class);
		}
		public ReferedExpressionContext referedExpression(int i) {
			return getRuleContext(ReferedExpressionContext.class,i);
		}
		public BinaryOperatorContext binaryOperator() {
			return getRuleContext(BinaryOperatorContext.class,0);
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
		enterRule(_localctx, 16, RULE_infixExpressionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(337);
			match(T__7);
			setState(338);
			referedExpression();
			setState(339);
			binaryOperator();
			setState(340);
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
		enterRule(_localctx, 18, RULE_instanceofExpressionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(342);
			match(T__8);
			setState(343);
			referedExpression();
			setState(344);
			match(T__9);
			setState(345);
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
		enterRule(_localctx, 20, RULE_methodReferenceStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(347);
			match(T__10);
			setState(348);
			identifier();
			setState(349);
			match(COLONCOLON);
			setState(350);
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
		enterRule(_localctx, 22, RULE_nameStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(352);
			match(T__11);
			setState(353);
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

	public static class PrefixExpressionStatementContext extends ParserRuleContext {
		public PrefixUnaryOperatorContext prefixUnaryOperator() {
			return getRuleContext(PrefixUnaryOperatorContext.class,0);
		}
		public ReferedExpressionContext referedExpression() {
			return getRuleContext(ReferedExpressionContext.class,0);
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
		enterRule(_localctx, 24, RULE_prefixExpressionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(355);
			match(T__12);
			setState(356);
			prefixUnaryOperator();
			setState(357);
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

	public static class PostfixExpressionStatementContext extends ParserRuleContext {
		public ReferedExpressionContext referedExpression() {
			return getRuleContext(ReferedExpressionContext.class,0);
		}
		public PostfixUnaryOperatorContext postfixUnaryOperator() {
			return getRuleContext(PostfixUnaryOperatorContext.class,0);
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
		enterRule(_localctx, 26, RULE_postfixExpressionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(359);
			match(T__13);
			setState(360);
			referedExpression();
			setState(361);
			postfixUnaryOperator();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 28, RULE_arrayAccessStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(363);
			match(T__14);
			setState(364);
			referedExpression();
			setState(365);
			match(T__15);
			setState(366);
			referedExpression();
			setState(368);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(367);
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
		enterRule(_localctx, 30, RULE_referedExpression);
		try {
			setState(375);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(370);
				identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(371);
				fieldAccess();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(372);
				literal();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(373);
				codeHole();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(374);
				preExist();
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
		enterRule(_localctx, 32, RULE_anonymousClassBeginStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(377);
			match(T__16);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 34, RULE_anonymousClassPlaceHolderStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(379);
			match(T__17);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 36, RULE_anonymousClassPreStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(381);
			match(T__18);
			setState(382);
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
		enterRule(_localctx, 38, RULE_atInterfaceStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(384);
			match(T__19);
			setState(385);
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
		enterRule(_localctx, 40, RULE_annotationTypeMemberDeclarationStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(387);
			match(T__20);
			setState(388);
			type();
			setState(389);
			match(T__21);
			setState(392);
			_la = _input.LA(1);
			if (_la==T__22) {
				{
				setState(390);
				match(T__22);
				setState(391);
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
		enterRule(_localctx, 42, RULE_classDeclarationStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(394);
			match(T__23);
			setState(395);
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
		enterRule(_localctx, 44, RULE_classInnerDeclarationStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(397);
			match(T__24);
			setState(398);
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
		enterRule(_localctx, 46, RULE_enumDeclarationStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(400);
			match(T__25);
			setState(401);
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
		enterRule(_localctx, 48, RULE_methodDeclarationStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(403);
			match(T__26);
			setState(404);
			match(T__3);
			setState(406);
			_la = _input.LA(1);
			if (((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & ((1L << (T__86 - 87)) | (1L << (T__87 - 87)) | (1L << (T__88 - 87)) | (1L << (T__89 - 87)) | (1L << (T__90 - 87)) | (1L << (T__91 - 87)) | (1L << (T__92 - 87)) | (1L << (T__93 - 87)) | (1L << (T__94 - 87)) | (1L << (T__98 - 87)) | (1L << (T__99 - 87)) | (1L << (T__100 - 87)) | (1L << (T__101 - 87)) | (1L << (T__102 - 87)) | (1L << (JavaLetter - 87)))) != 0) || _la==QUESTION) {
				{
				setState(405);
				argTypeList();
				}
			}

			setState(408);
			match(T__4);
			setState(409);
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
		enterRule(_localctx, 50, RULE_enumConstantDeclarationStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(411);
			match(T__27);
			setState(412);
			identifier();
			setState(413);
			match(T__3);
			setState(414);
			argumentList();
			setState(415);
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
		enterRule(_localctx, 52, RULE_labeledStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(417);
			match(T__28);
			setState(418);
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
		enterRule(_localctx, 54, RULE_variableDeclarationStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(420);
			match(T__29);
			setState(421);
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
		enterRule(_localctx, 56, RULE_lambdaExpressionStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(423);
			match(T__30);
			setState(424);
			match(T__3);
			setState(426);
			_la = _input.LA(1);
			if (((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & ((1L << (T__86 - 87)) | (1L << (T__87 - 87)) | (1L << (T__88 - 87)) | (1L << (T__89 - 87)) | (1L << (T__90 - 87)) | (1L << (T__91 - 87)) | (1L << (T__92 - 87)) | (1L << (T__93 - 87)) | (1L << (T__94 - 87)) | (1L << (T__98 - 87)) | (1L << (T__99 - 87)) | (1L << (T__100 - 87)) | (1L << (T__101 - 87)) | (1L << (T__102 - 87)) | (1L << (JavaLetter - 87)))) != 0) || _la==QUESTION) {
				{
				setState(425);
				argTypeList();
				}
			}

			setState(428);
			match(T__4);
			setState(429);
			match(T__31);
			setState(430);
			match(T__32);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 58, RULE_breakStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(432);
			match(T__33);
			setState(433);
			match(T__34);
			setState(436);
			_la = _input.LA(1);
			if (_la==T__15) {
				{
				setState(434);
				match(T__15);
				setState(435);
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
		enterRule(_localctx, 60, RULE_continueStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(438);
			match(T__35);
			setState(439);
			match(T__36);
			setState(442);
			_la = _input.LA(1);
			if (_la==T__15) {
				{
				setState(440);
				match(T__15);
				setState(441);
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
		enterRule(_localctx, 62, RULE_doWhileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(444);
			match(T__37);
			setState(445);
			match(T__38);
			setState(446);
			match(T__15);
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
		enterRule(_localctx, 64, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(449);
			match(T__39);
			setState(450);
			match(T__38);
			setState(451);
			match(T__15);
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
		enterRule(_localctx, 66, RULE_returnStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(454);
			match(T__40);
			setState(455);
			match(T__41);
			setState(458);
			_la = _input.LA(1);
			if (_la==T__15) {
				{
				setState(456);
				match(T__15);
				setState(457);
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
		enterRule(_localctx, 68, RULE_switchStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(460);
			match(T__42);
			setState(461);
			match(T__43);
			setState(462);
			match(T__15);
			setState(463);
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
		enterRule(_localctx, 70, RULE_switchCaseStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(465);
			match(T__44);
			setState(466);
			match(T__45);
			setState(467);
			match(T__15);
			setState(468);
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
		enterRule(_localctx, 72, RULE_defaultStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(470);
			match(T__46);
			setState(471);
			match(T__22);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 74, RULE_synchronizedStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(473);
			match(T__47);
			setState(474);
			match(T__48);
			setState(475);
			match(T__15);
			setState(476);
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
		enterRule(_localctx, 76, RULE_throwStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(478);
			match(T__49);
			setState(479);
			match(T__50);
			setState(480);
			match(T__15);
			setState(481);
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
		enterRule(_localctx, 78, RULE_catchClauseStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(483);
			match(T__51);
			setState(484);
			match(T__52);
			setState(485);
			match(T__15);
			setState(486);
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
		enterRule(_localctx, 80, RULE_ifStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(488);
			match(T__53);
			setState(489);
			match(T__54);
			setState(490);
			match(T__15);
			setState(491);
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
		enterRule(_localctx, 82, RULE_arrayCreationStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(493);
			match(T__55);
			setState(494);
			type();
			setState(495);
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
		enterRule(_localctx, 84, RULE_initializerStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(497);
			match(T__57);
			setState(498);
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
		enterRule(_localctx, 86, RULE_variableDeclarationHolderStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(500);
			match(T__59);
			setState(503);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(501);
				match(ASSIGN);
				setState(502);
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
		enterRule(_localctx, 88, RULE_enhancedForStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(505);
			match(T__60);
			setState(506);
			match(T__61);
			setState(507);
			type();
			setState(508);
			match(COLON);
			setState(509);
			referedExpression();
			setState(510);
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
		enterRule(_localctx, 90, RULE_partialEndArrayAccessStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(512);
			expressionStatement();
			setState(513);
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
		enterRule(_localctx, 92, RULE_leftParentheseStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(515);
			match(T__62);
			setState(517); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(516);
				match(T__3);
				}
				}
				setState(519); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__3 );
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 94, RULE_rightParentheseStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(521);
			match(T__62);
			setState(523); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(522);
				match(T__4);
				}
				}
				setState(525); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__4 );
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 96, RULE_leftBraceStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(527);
			match(T__62);
			setState(529); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(528);
				match(T__63);
				}
				}
				setState(531); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__63 );
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 98, RULE_rightBraceStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(533);
			match(T__62);
			setState(535); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(534);
				match(T__64);
				}
				}
				setState(537); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__64 );
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 100, RULE_enterMethodParamStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(539);
			match(T__62);
			setState(541); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(540);
				match(T__65);
				}
				}
				setState(543); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__65 );
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 102, RULE_arrayInitializerStartStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(545);
			match(T__62);
			setState(546);
			match(T__66);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 104, RULE_arrayInitializerSplitCommaStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(548);
			match(T__62);
			setState(549);
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
		enterRule(_localctx, 106, RULE_arrayInitializerEndStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(551);
			match(T__62);
			setState(552);
			match(T__68);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 108, RULE_enumConstantDeclarationSplitCommaStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(554);
			match(T__62);
			setState(555);
			match(T__69);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 110, RULE_forStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(557);
			match(T__62);
			setState(558);
			match(T__70);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 112, RULE_forIniOverStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(560);
			match(T__62);
			setState(561);
			match(T__71);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 114, RULE_forExpOverStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(563);
			match(T__62);
			setState(564);
			match(T__72);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 116, RULE_forUpdOverStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(566);
			match(T__62);
			setState(567);
			match(T__73);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 118, RULE_condExpBeginStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(569);
			match(T__62);
			setState(570);
			match(T__74);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 120, RULE_condExpQuestionMarkStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(572);
			match(T__62);
			setState(573);
			match(T__75);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 122, RULE_condExpColonMarkStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(575);
			match(T__62);
			setState(576);
			match(T__76);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 124, RULE_partialEndStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(578);
			match(T__77);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 126, RULE_fullEndStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(580);
			match(T__78);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 128, RULE_partialMethodArgumentEndStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(582);
			match(T__79);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 130, RULE_partialMethodPreRerferedExpressionEndStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(584);
			match(T__80);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 132, RULE_firstArgPreExist);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(586);
			match(T__81);
			}
		}
		catch (RecognitionException re) {
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
		public FirstArgPreExistContext firstArgPreExist() {
			return getRuleContext(FirstArgPreExistContext.class,0);
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
		enterRule(_localctx, 134, RULE_firstArgReferedExpression);
		try {
			setState(593);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(588);
				identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(589);
				fieldAccess();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(590);
				literal();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(591);
				codeHole();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(592);
				firstArgPreExist();
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
		enterRule(_localctx, 136, RULE_commonClassMemberInvoke);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(595);
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
		enterRule(_localctx, 138, RULE_selfClassMemberInvoke);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(597);
			match(T__82);
			setState(600);
			_la = _input.LA(1);
			if (_la==DOT) {
				{
				setState(598);
				match(DOT);
				setState(599);
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
		enterRule(_localctx, 140, RULE_superClassMemberInvoke);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(602);
			match(T__83);
			setState(605);
			_la = _input.LA(1);
			if (_la==DOT) {
				{
				setState(603);
				match(DOT);
				setState(604);
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
		enterRule(_localctx, 142, RULE_newClassInvoke);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(607);
			match(T__84);
			setState(610);
			_la = _input.LA(1);
			if (_la==DOT) {
				{
				setState(608);
				match(DOT);
				setState(609);
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
		enterRule(_localctx, 144, RULE_firstArg);
		try {
			setState(617);
			switch (_input.LA(1)) {
			case T__4:
			case COMMA:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case T__82:
				enterOuterAlt(_localctx, 2);
				{
				setState(613);
				selfClassMemberInvoke();
				}
				break;
			case T__83:
				enterOuterAlt(_localctx, 3);
				{
				setState(614);
				superClassMemberInvoke();
				}
				break;
			case T__84:
				enterOuterAlt(_localctx, 4);
				{
				setState(615);
				newClassInvoke();
				}
				break;
			case T__81:
			case T__85:
			case T__99:
			case T__100:
			case T__101:
			case T__102:
			case T__103:
			case T__106:
			case T__107:
			case T__108:
			case T__109:
			case JavaLetter:
			case DecimalIntegerLiteral:
			case HexIntegerLiteral:
			case OctalIntegerLiteral:
			case BinaryIntegerLiteral:
			case DecimalFloatingPointLiteral:
			case HexadecimalFloatingPointLiteral:
				enterOuterAlt(_localctx, 5);
				{
				setState(616);
				commonClassMemberInvoke();
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
		enterRule(_localctx, 146, RULE_methodArgPreExist);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(619);
			match(T__81);
			}
		}
		catch (RecognitionException re) {
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
		public MethodArgPreExistContext methodArgPreExist() {
			return getRuleContext(MethodArgPreExistContext.class,0);
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
		enterRule(_localctx, 148, RULE_methodArgReferedExpression);
		try {
			setState(626);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(621);
				identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(622);
				fieldAccess();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(623);
				literal();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(624);
				codeHole();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(625);
				methodArgPreExist();
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
		enterRule(_localctx, 150, RULE_argumentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(628);
			firstArg();
			setState(633);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(629);
				match(COMMA);
				setState(630);
				methodArgReferedExpression();
				}
				}
				setState(635);
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

	public static class TypeListContext extends ParserRuleContext {
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public TypeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterTypeList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitTypeList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitTypeList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeListContext typeList() throws RecognitionException {
		TypeListContext _localctx = new TypeListContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_typeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(636);
			type();
			setState(641);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(637);
				match(COMMA);
				setState(638);
				type();
				}
				}
				setState(643);
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
		enterRule(_localctx, 154, RULE_argType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(644);
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

	public static class ArgTypeListContext extends ParserRuleContext {
		public List<ArgTypeContext> argType() {
			return getRuleContexts(ArgTypeContext.class);
		}
		public ArgTypeContext argType(int i) {
			return getRuleContext(ArgTypeContext.class,i);
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
		enterRule(_localctx, 156, RULE_argTypeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(646);
			argType();
			setState(651);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(647);
				match(COMMA);
				setState(648);
				argType();
				}
				}
				setState(653);
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
		enterRule(_localctx, 158, RULE_literal);
		try {
			setState(659);
			switch (_input.LA(1)) {
			case DecimalIntegerLiteral:
			case HexIntegerLiteral:
			case OctalIntegerLiteral:
			case BinaryIntegerLiteral:
			case DecimalFloatingPointLiteral:
			case HexadecimalFloatingPointLiteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(654);
				numberLiteral();
				}
				break;
			case T__106:
			case T__107:
				enterOuterAlt(_localctx, 2);
				{
				setState(655);
				booleanLiteral();
				}
				break;
			case T__108:
				enterOuterAlt(_localctx, 3);
				{
				setState(656);
				characterLiteral();
				}
				break;
			case T__85:
				enterOuterAlt(_localctx, 4);
				{
				setState(657);
				stringLiteral();
				}
				break;
			case T__109:
				enterOuterAlt(_localctx, 5);
				{
				setState(658);
				nullLiteral();
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
		enterRule(_localctx, 160, RULE_numberLiteral);
		try {
			setState(663);
			switch (_input.LA(1)) {
			case DecimalIntegerLiteral:
			case HexIntegerLiteral:
			case OctalIntegerLiteral:
			case BinaryIntegerLiteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(661);
				integerLiteral();
				}
				break;
			case DecimalFloatingPointLiteral:
			case HexadecimalFloatingPointLiteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(662);
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

	public static class StringLiteralContext extends ParserRuleContext {
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
		enterRule(_localctx, 162, RULE_stringLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(665);
			match(T__85);
			}
		}
		catch (RecognitionException re) {
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
		public ParameterizedTypeContext parameterizedType() {
			return getRuleContext(ParameterizedTypeContext.class,0);
		}
		public SimpleTypeContext simpleType() {
			return getRuleContext(SimpleTypeContext.class,0);
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
		public WildCardTypeContext wildCardType() {
			return getRuleContext(WildCardTypeContext.class,0);
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
		enterRule(_localctx, 164, RULE_type);
		try {
			setState(677);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(667);
				virtualInferredType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(668);
				primitiveType();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(669);
				parameterizedType();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(670);
				simpleType();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(671);
				classOrInterfaceType();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(672);
				arrayType();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(673);
				intersectionType();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(674);
				unionType();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(675);
				wildCardType();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(676);
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
		enterRule(_localctx, 166, RULE_virtualInferredType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(679);
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
		enterRule(_localctx, 168, RULE_primitiveType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(681);
			_la = _input.LA(1);
			if ( !(((((_la - 88)) & ~0x3f) == 0 && ((1L << (_la - 88)) & ((1L << (T__87 - 88)) | (1L << (T__88 - 88)) | (1L << (T__89 - 88)) | (1L << (T__90 - 88)) | (1L << (T__91 - 88)) | (1L << (T__92 - 88)) | (1L << (T__93 - 88)) | (1L << (T__94 - 88)))) != 0)) ) {
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
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
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
		enterRule(_localctx, 170, RULE_simpleType);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(683);
			identifier();
			setState(688);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(684);
					match(DOT);
					setState(685);
					identifier();
					}
					} 
				}
				setState(690);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
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

	public static class ParameterizedTypeContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TypeListContext typeList() {
			return getRuleContext(TypeListContext.class,0);
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
		enterRule(_localctx, 172, RULE_parameterizedType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(691);
			identifier();
			setState(692);
			match(LT);
			setState(693);
			typeList();
			setState(694);
			match(GT);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 174, RULE_bothType);
		try {
			setState(698);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(696);
				simpleType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(697);
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
		enterRule(_localctx, 176, RULE_classOrInterfaceType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(700);
			bothType();
			}
			setState(705);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(701);
				match(DOT);
				setState(702);
				bothType();
				}
				}
				setState(707);
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
		enterRule(_localctx, 178, RULE_arrayType);
		try {
			setState(714);
			switch (_input.LA(1)) {
			case T__87:
			case T__88:
			case T__89:
			case T__90:
			case T__91:
			case T__92:
			case T__93:
			case T__94:
				enterOuterAlt(_localctx, 1);
				{
				setState(708);
				primitiveType();
				setState(709);
				dims();
				}
				break;
			case T__99:
			case T__100:
			case T__101:
			case T__102:
			case JavaLetter:
				enterOuterAlt(_localctx, 2);
				{
				setState(711);
				classOrInterfaceType();
				setState(712);
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
		enterRule(_localctx, 180, RULE_dims);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(716);
			match(T__95);
			setState(717);
			match(T__96);
			setState(722);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__95) {
				{
				{
				setState(718);
				match(T__95);
				setState(719);
				match(T__96);
				}
				}
				setState(724);
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
		enterRule(_localctx, 182, RULE_wildCardType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(725);
			match(QUESTION);
			setState(727);
			_la = _input.LA(1);
			if (_la==T__83 || _la==T__97) {
				{
				setState(726);
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
		enterRule(_localctx, 184, RULE_extendBound);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(729);
			match(T__97);
			setState(730);
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
		enterRule(_localctx, 186, RULE_superBound);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(732);
			match(T__83);
			setState(733);
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
		enterRule(_localctx, 188, RULE_wildcardBounds);
		try {
			setState(737);
			switch (_input.LA(1)) {
			case T__97:
				enterOuterAlt(_localctx, 1);
				{
				setState(735);
				extendBound();
				}
				break;
			case T__83:
				enterOuterAlt(_localctx, 2);
				{
				setState(736);
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
		enterRule(_localctx, 190, RULE_intersectionFirstType);
		try {
			setState(743);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(739);
				classOrInterfaceType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(740);
				primitiveType();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(741);
				arrayType();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(742);
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
		enterRule(_localctx, 192, RULE_intersectionSecondType);
		try {
			setState(750);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(745);
				classOrInterfaceType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(746);
				primitiveType();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(747);
				arrayType();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(748);
				classRef();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(749);
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
		enterRule(_localctx, 194, RULE_intersectionType);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(752);
			intersectionFirstType();
			}
			setState(755); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(753);
					match(BITAND);
					{
					setState(754);
					intersectionSecondType();
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(757); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
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
		enterRule(_localctx, 196, RULE_unionFirstType);
		try {
			setState(763);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(759);
				classOrInterfaceType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(760);
				primitiveType();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(761);
				arrayType();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(762);
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
		enterRule(_localctx, 198, RULE_unionSecondType);
		try {
			setState(770);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(765);
				classOrInterfaceType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(766);
				primitiveType();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(767);
				arrayType();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(768);
				classRef();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(769);
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
		enterRule(_localctx, 200, RULE_unionType);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(772);
			unionFirstType();
			}
			setState(775); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(773);
					match(BITOR);
					{
					setState(774);
					unionSecondType();
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(777); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
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

	public static class IdentifierContext extends ParserRuleContext {
		public IdRawLetterContext idRawLetter() {
			return getRuleContext(IdRawLetterContext.class,0);
		}
		public FinalFieldRefContext finalFieldRef() {
			return getRuleContext(FinalFieldRefContext.class,0);
		}
		public FinalVarRefContext finalVarRef() {
			return getRuleContext(FinalVarRefContext.class,0);
		}
		public CommonFieldRefContext commonFieldRef() {
			return getRuleContext(CommonFieldRefContext.class,0);
		}
		public CommonVarRefContext commonVarRef() {
			return getRuleContext(CommonVarRefContext.class,0);
		}
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
		enterRule(_localctx, 202, RULE_identifier);
		try {
			setState(784);
			switch (_input.LA(1)) {
			case JavaLetter:
				enterOuterAlt(_localctx, 1);
				{
				setState(779);
				idRawLetter();
				}
				break;
			case T__99:
				enterOuterAlt(_localctx, 2);
				{
				setState(780);
				finalFieldRef();
				}
				break;
			case T__100:
				enterOuterAlt(_localctx, 3);
				{
				setState(781);
				finalVarRef();
				}
				break;
			case T__101:
				enterOuterAlt(_localctx, 4);
				{
				setState(782);
				commonFieldRef();
				}
				break;
			case T__102:
				enterOuterAlt(_localctx, 5);
				{
				setState(783);
				commonVarRef();
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

	public static class IdRawLetterContext extends ParserRuleContext {
		public TerminalNode JavaLetter() { return getToken(Java8Parser.JavaLetter, 0); }
		public List<TerminalNode> JavaLetterOrDigit() { return getTokens(Java8Parser.JavaLetterOrDigit); }
		public TerminalNode JavaLetterOrDigit(int i) {
			return getToken(Java8Parser.JavaLetterOrDigit, i);
		}
		public IdRawLetterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_idRawLetter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterIdRawLetter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitIdRawLetter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitIdRawLetter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdRawLetterContext idRawLetter() throws RecognitionException {
		IdRawLetterContext _localctx = new IdRawLetterContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_idRawLetter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(786);
			match(JavaLetter);
			setState(790);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==JavaLetterOrDigit) {
				{
				{
				setState(787);
				match(JavaLetterOrDigit);
				}
				}
				setState(792);
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

	public static class ClassRefContext extends ParserRuleContext {
		public List<OffsetContext> offset() {
			return getRuleContexts(OffsetContext.class);
		}
		public OffsetContext offset(int i) {
			return getRuleContext(OffsetContext.class,i);
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
		enterRule(_localctx, 206, RULE_classRef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(793);
			match(T__98);
			setState(794);
			offset();
			setState(795);
			match(QUESTION);
			setState(796);
			offset();
			}
		}
		catch (RecognitionException re) {
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
		public List<OffsetContext> offset() {
			return getRuleContexts(OffsetContext.class);
		}
		public OffsetContext offset(int i) {
			return getRuleContext(OffsetContext.class,i);
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
		enterRule(_localctx, 208, RULE_finalFieldRef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(798);
			match(T__99);
			setState(799);
			offset();
			setState(800);
			match(QUESTION);
			setState(801);
			offset();
			}
		}
		catch (RecognitionException re) {
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
		public List<OffsetContext> offset() {
			return getRuleContexts(OffsetContext.class);
		}
		public OffsetContext offset(int i) {
			return getRuleContext(OffsetContext.class,i);
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
		enterRule(_localctx, 210, RULE_finalVarRef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(803);
			match(T__100);
			setState(804);
			offset();
			setState(805);
			match(QUESTION);
			setState(806);
			offset();
			}
		}
		catch (RecognitionException re) {
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
		public List<OffsetContext> offset() {
			return getRuleContexts(OffsetContext.class);
		}
		public OffsetContext offset(int i) {
			return getRuleContext(OffsetContext.class,i);
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
		enterRule(_localctx, 212, RULE_commonFieldRef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(808);
			match(T__101);
			setState(809);
			offset();
			setState(810);
			match(QUESTION);
			setState(811);
			offset();
			}
		}
		catch (RecognitionException re) {
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
		public List<OffsetContext> offset() {
			return getRuleContexts(OffsetContext.class);
		}
		public OffsetContext offset(int i) {
			return getRuleContext(OffsetContext.class,i);
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
		enterRule(_localctx, 214, RULE_commonVarRef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(813);
			match(T__102);
			setState(814);
			offset();
			setState(815);
			match(QUESTION);
			setState(816);
			offset();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OffsetContext extends ParserRuleContext {
		public TerminalNode OffsetDesc() { return getToken(Java8Parser.OffsetDesc, 0); }
		public OffsetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_offset; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterOffset(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitOffset(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitOffset(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OffsetContext offset() throws RecognitionException {
		OffsetContext _localctx = new OffsetContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_offset);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(818);
			match(OffsetDesc);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 218, RULE_codeHole);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(820);
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
		enterRule(_localctx, 220, RULE_preExist);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(822);
			match(T__81);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 222, RULE_endOfArrayDeclarationIndexExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(825); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(824);
					match(T__104);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(827); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
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

	public static class EndOfArrayInitializerElementExpressionContext extends ParserRuleContext {
		public EndOfArrayInitializerElementExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_endOfArrayInitializerElementExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterEndOfArrayInitializerElementExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitEndOfArrayInitializerElementExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitEndOfArrayInitializerElementExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EndOfArrayInitializerElementExpressionContext endOfArrayInitializerElementExpression() throws RecognitionException {
		EndOfArrayInitializerElementExpressionContext _localctx = new EndOfArrayInitializerElementExpressionContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_endOfArrayInitializerElementExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(829);
			match(T__105);
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode DecimalIntegerLiteral() { return getToken(Java8Parser.DecimalIntegerLiteral, 0); }
		public TerminalNode HexIntegerLiteral() { return getToken(Java8Parser.HexIntegerLiteral, 0); }
		public TerminalNode OctalIntegerLiteral() { return getToken(Java8Parser.OctalIntegerLiteral, 0); }
		public TerminalNode BinaryIntegerLiteral() { return getToken(Java8Parser.BinaryIntegerLiteral, 0); }
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
		enterRule(_localctx, 226, RULE_integerLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(831);
			_la = _input.LA(1);
			if ( !(((((_la - 116)) & ~0x3f) == 0 && ((1L << (_la - 116)) & ((1L << (DecimalIntegerLiteral - 116)) | (1L << (HexIntegerLiteral - 116)) | (1L << (OctalIntegerLiteral - 116)) | (1L << (BinaryIntegerLiteral - 116)))) != 0)) ) {
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

	public static class FloatingPointLiteralContext extends ParserRuleContext {
		public TerminalNode DecimalFloatingPointLiteral() { return getToken(Java8Parser.DecimalFloatingPointLiteral, 0); }
		public TerminalNode HexadecimalFloatingPointLiteral() { return getToken(Java8Parser.HexadecimalFloatingPointLiteral, 0); }
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
		enterRule(_localctx, 228, RULE_floatingPointLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(833);
			_la = _input.LA(1);
			if ( !(_la==DecimalFloatingPointLiteral || _la==HexadecimalFloatingPointLiteral) ) {
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
		enterRule(_localctx, 230, RULE_booleanLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(835);
			_la = _input.LA(1);
			if ( !(_la==T__106 || _la==T__107) ) {
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
		public TerminalNode SingleCharacter() { return getToken(Java8Parser.SingleCharacter, 0); }
		public TerminalNode EscapeSequence() { return getToken(Java8Parser.EscapeSequence, 0); }
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
		enterRule(_localctx, 232, RULE_characterLiteral);
		try {
			setState(843);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(837);
				match(T__108);
				setState(838);
				match(SingleCharacter);
				setState(839);
				match(T__108);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(840);
				match(T__108);
				setState(841);
				match(EscapeSequence);
				setState(842);
				match(T__108);
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
		enterRule(_localctx, 234, RULE_nullLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(845);
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

	public static class PrefixUnaryOperatorContext extends ParserRuleContext {
		public TerminalNode BANG() { return getToken(Java8Parser.BANG, 0); }
		public TerminalNode TILDE() { return getToken(Java8Parser.TILDE, 0); }
		public TerminalNode INC() { return getToken(Java8Parser.INC, 0); }
		public TerminalNode DEC() { return getToken(Java8Parser.DEC, 0); }
		public TerminalNode ADD() { return getToken(Java8Parser.ADD, 0); }
		public TerminalNode SUB() { return getToken(Java8Parser.SUB, 0); }
		public PrefixUnaryOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prefixUnaryOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterPrefixUnaryOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitPrefixUnaryOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitPrefixUnaryOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrefixUnaryOperatorContext prefixUnaryOperator() throws RecognitionException {
		PrefixUnaryOperatorContext _localctx = new PrefixUnaryOperatorContext(_ctx, getState());
		enterRule(_localctx, 236, RULE_prefixUnaryOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(847);
			_la = _input.LA(1);
			if ( !(((((_la - 162)) & ~0x3f) == 0 && ((1L << (_la - 162)) & ((1L << (BANG - 162)) | (1L << (TILDE - 162)) | (1L << (INC - 162)) | (1L << (DEC - 162)) | (1L << (ADD - 162)) | (1L << (SUB - 162)))) != 0)) ) {
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

	public static class PostfixUnaryOperatorContext extends ParserRuleContext {
		public TerminalNode INC() { return getToken(Java8Parser.INC, 0); }
		public TerminalNode DEC() { return getToken(Java8Parser.DEC, 0); }
		public PostfixUnaryOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfixUnaryOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterPostfixUnaryOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitPostfixUnaryOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitPostfixUnaryOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PostfixUnaryOperatorContext postfixUnaryOperator() throws RecognitionException {
		PostfixUnaryOperatorContext _localctx = new PostfixUnaryOperatorContext(_ctx, getState());
		enterRule(_localctx, 238, RULE_postfixUnaryOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(849);
			_la = _input.LA(1);
			if ( !(_la==INC || _la==DEC) ) {
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

	public static class BinaryOperatorContext extends ParserRuleContext {
		public TerminalNode GT() { return getToken(Java8Parser.GT, 0); }
		public TerminalNode LT() { return getToken(Java8Parser.LT, 0); }
		public TerminalNode EQUAL() { return getToken(Java8Parser.EQUAL, 0); }
		public TerminalNode LE() { return getToken(Java8Parser.LE, 0); }
		public TerminalNode GE() { return getToken(Java8Parser.GE, 0); }
		public TerminalNode NOTEQUAL() { return getToken(Java8Parser.NOTEQUAL, 0); }
		public TerminalNode AND() { return getToken(Java8Parser.AND, 0); }
		public TerminalNode OR() { return getToken(Java8Parser.OR, 0); }
		public TerminalNode ADD() { return getToken(Java8Parser.ADD, 0); }
		public TerminalNode SUB() { return getToken(Java8Parser.SUB, 0); }
		public TerminalNode MUL() { return getToken(Java8Parser.MUL, 0); }
		public TerminalNode DIV() { return getToken(Java8Parser.DIV, 0); }
		public TerminalNode BITAND() { return getToken(Java8Parser.BITAND, 0); }
		public TerminalNode BITOR() { return getToken(Java8Parser.BITOR, 0); }
		public TerminalNode CARET() { return getToken(Java8Parser.CARET, 0); }
		public TerminalNode MOD() { return getToken(Java8Parser.MOD, 0); }
		public TerminalNode LSHIFT() { return getToken(Java8Parser.LSHIFT, 0); }
		public TerminalNode RSHIFT() { return getToken(Java8Parser.RSHIFT, 0); }
		public TerminalNode URSHIFT() { return getToken(Java8Parser.URSHIFT, 0); }
		public BinaryOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binaryOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterBinaryOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitBinaryOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitBinaryOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BinaryOperatorContext binaryOperator() throws RecognitionException {
		BinaryOperatorContext _localctx = new BinaryOperatorContext(_ctx, getState());
		enterRule(_localctx, 240, RULE_binaryOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(851);
			_la = _input.LA(1);
			if ( !(((((_la - 160)) & ~0x3f) == 0 && ((1L << (_la - 160)) & ((1L << (GT - 160)) | (1L << (LT - 160)) | (1L << (EQUAL - 160)) | (1L << (LE - 160)) | (1L << (GE - 160)) | (1L << (NOTEQUAL - 160)) | (1L << (AND - 160)) | (1L << (OR - 160)) | (1L << (ADD - 160)) | (1L << (SUB - 160)) | (1L << (MUL - 160)) | (1L << (DIV - 160)) | (1L << (BITAND - 160)) | (1L << (BITOR - 160)) | (1L << (CARET - 160)) | (1L << (MOD - 160)) | (1L << (LSHIFT - 160)) | (1L << (RSHIFT - 160)) | (1L << (URSHIFT - 160)))) != 0)) ) {
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

	public static class AssignmentOperatorContext extends ParserRuleContext {
		public TerminalNode ASSIGN() { return getToken(Java8Parser.ASSIGN, 0); }
		public TerminalNode MUL_ASSIGN() { return getToken(Java8Parser.MUL_ASSIGN, 0); }
		public TerminalNode DIV_ASSIGN() { return getToken(Java8Parser.DIV_ASSIGN, 0); }
		public TerminalNode MOD_ASSIGN() { return getToken(Java8Parser.MOD_ASSIGN, 0); }
		public TerminalNode ADD_ASSIGN() { return getToken(Java8Parser.ADD_ASSIGN, 0); }
		public TerminalNode SUB_ASSIGN() { return getToken(Java8Parser.SUB_ASSIGN, 0); }
		public TerminalNode LSHIFT_ASSIGN() { return getToken(Java8Parser.LSHIFT_ASSIGN, 0); }
		public TerminalNode RSHIFT_ASSIGN() { return getToken(Java8Parser.RSHIFT_ASSIGN, 0); }
		public TerminalNode URSHIFT_ASSIGN() { return getToken(Java8Parser.URSHIFT_ASSIGN, 0); }
		public TerminalNode AND_ASSIGN() { return getToken(Java8Parser.AND_ASSIGN, 0); }
		public TerminalNode XOR_ASSIGN() { return getToken(Java8Parser.XOR_ASSIGN, 0); }
		public TerminalNode OR_ASSIGN() { return getToken(Java8Parser.OR_ASSIGN, 0); }
		public AssignmentOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterAssignmentOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitAssignmentOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitAssignmentOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentOperatorContext assignmentOperator() throws RecognitionException {
		AssignmentOperatorContext _localctx = new AssignmentOperatorContext(_ctx, getState());
		enterRule(_localctx, 242, RULE_assignmentOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(853);
			_la = _input.LA(1);
			if ( !(((((_la - 186)) & ~0x3f) == 0 && ((1L << (_la - 186)) & ((1L << (ASSIGN - 186)) | (1L << (ADD_ASSIGN - 186)) | (1L << (SUB_ASSIGN - 186)) | (1L << (MUL_ASSIGN - 186)) | (1L << (DIV_ASSIGN - 186)) | (1L << (AND_ASSIGN - 186)) | (1L << (OR_ASSIGN - 186)) | (1L << (XOR_ASSIGN - 186)) | (1L << (MOD_ASSIGN - 186)) | (1L << (LSHIFT_ASSIGN - 186)) | (1L << (RSHIFT_ASSIGN - 186)) | (1L << (URSHIFT_ASSIGN - 186)))) != 0)) ) {
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\u00c7\u035a\4\2\t"+
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
		"w\tw\4x\tx\4y\ty\4z\tz\4{\t{\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\5\2\u0129\n\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\5\3\u0137\n\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n"+
		"\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r"+
		"\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\5\20"+
		"\u0173\n\20\3\21\3\21\3\21\3\21\3\21\5\21\u017a\n\21\3\22\3\22\3\23\3"+
		"\23\3\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\5\26\u018b"+
		"\n\26\3\27\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\32\5\32"+
		"\u0199\n\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34"+
		"\3\35\3\35\3\35\3\36\3\36\3\36\5\36\u01ad\n\36\3\36\3\36\3\36\3\36\3\37"+
		"\3\37\3\37\3\37\5\37\u01b7\n\37\3 \3 \3 \3 \5 \u01bd\n \3!\3!\3!\3!\3"+
		"!\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\5#\u01cd\n#\3$\3$\3$\3$\3$\3%\3%\3%"+
		"\3%\3%\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3*\3"+
		"*\3*\3*\3*\3+\3+\3+\3+\3,\3,\3,\3-\3-\3-\5-\u01fa\n-\3.\3.\3.\3.\3.\3"+
		".\3.\3/\3/\3/\3\60\3\60\6\60\u0208\n\60\r\60\16\60\u0209\3\61\3\61\6\61"+
		"\u020e\n\61\r\61\16\61\u020f\3\62\3\62\6\62\u0214\n\62\r\62\16\62\u0215"+
		"\3\63\3\63\6\63\u021a\n\63\r\63\16\63\u021b\3\64\3\64\6\64\u0220\n\64"+
		"\r\64\16\64\u0221\3\65\3\65\3\65\3\66\3\66\3\66\3\67\3\67\3\67\38\38\3"+
		"8\39\39\39\3:\3:\3:\3;\3;\3;\3<\3<\3<\3=\3=\3=\3>\3>\3>\3?\3?\3?\3@\3"+
		"@\3A\3A\3B\3B\3C\3C\3D\3D\3E\3E\3E\3E\3E\5E\u0254\nE\3F\3F\3G\3G\3G\5"+
		"G\u025b\nG\3H\3H\3H\5H\u0260\nH\3I\3I\3I\5I\u0265\nI\3J\3J\3J\3J\3J\5"+
		"J\u026c\nJ\3K\3K\3L\3L\3L\3L\3L\5L\u0275\nL\3M\3M\3M\7M\u027a\nM\fM\16"+
		"M\u027d\13M\3N\3N\3N\7N\u0282\nN\fN\16N\u0285\13N\3O\3O\3P\3P\3P\7P\u028c"+
		"\nP\fP\16P\u028f\13P\3Q\3Q\3Q\3Q\3Q\5Q\u0296\nQ\3R\3R\5R\u029a\nR\3S\3"+
		"S\3T\3T\3T\3T\3T\3T\3T\3T\3T\3T\5T\u02a8\nT\3U\3U\3V\3V\3W\3W\3W\7W\u02b1"+
		"\nW\fW\16W\u02b4\13W\3X\3X\3X\3X\3X\3Y\3Y\5Y\u02bd\nY\3Z\3Z\3Z\7Z\u02c2"+
		"\nZ\fZ\16Z\u02c5\13Z\3[\3[\3[\3[\3[\3[\5[\u02cd\n[\3\\\3\\\3\\\3\\\7\\"+
		"\u02d3\n\\\f\\\16\\\u02d6\13\\\3]\3]\5]\u02da\n]\3^\3^\3^\3_\3_\3_\3`"+
		"\3`\5`\u02e4\n`\3a\3a\3a\3a\5a\u02ea\na\3b\3b\3b\3b\3b\5b\u02f1\nb\3c"+
		"\3c\3c\6c\u02f6\nc\rc\16c\u02f7\3d\3d\3d\3d\5d\u02fe\nd\3e\3e\3e\3e\3"+
		"e\5e\u0305\ne\3f\3f\3f\6f\u030a\nf\rf\16f\u030b\3g\3g\3g\3g\3g\5g\u0313"+
		"\ng\3h\3h\7h\u0317\nh\fh\16h\u031a\13h\3i\3i\3i\3i\3i\3j\3j\3j\3j\3j\3"+
		"k\3k\3k\3k\3k\3l\3l\3l\3l\3l\3m\3m\3m\3m\3m\3n\3n\3o\3o\3p\3p\3q\6q\u033c"+
		"\nq\rq\16q\u033d\3r\3r\3s\3s\3t\3t\3u\3u\3v\3v\3v\3v\3v\3v\5v\u034e\n"+
		"v\3w\3w\3x\3x\3y\3y\3z\3z\3{\3{\3{\2\2|\2\4\6\b\n\f\16\20\22\24\26\30"+
		"\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080"+
		"\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098"+
		"\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0"+
		"\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8"+
		"\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8\u00da\u00dc\u00de\u00e0"+
		"\u00e2\u00e4\u00e6\u00e8\u00ea\u00ec\u00ee\u00f0\u00f2\u00f4\2\n\3\2Z"+
		"a\3\2vy\4\2\u0091\u0091\u0097\u0097\3\2mn\4\2\u00a4\u00a5\u00ae\u00b1"+
		"\3\2\u00ae\u00af\5\2\u00a2\u00a3\u00a8\u00ad\u00b0\u00ba\3\2\u00bc\u00c7"+
		"\u036a\2\u0128\3\2\2\2\4\u0136\3\2\2\2\6\u0138\3\2\2\2\b\u013d\3\2\2\2"+
		"\n\u0140\3\2\2\2\f\u0146\3\2\2\2\16\u014c\3\2\2\2\20\u014f\3\2\2\2\22"+
		"\u0153\3\2\2\2\24\u0158\3\2\2\2\26\u015d\3\2\2\2\30\u0162\3\2\2\2\32\u0165"+
		"\3\2\2\2\34\u0169\3\2\2\2\36\u016d\3\2\2\2 \u0179\3\2\2\2\"\u017b\3\2"+
		"\2\2$\u017d\3\2\2\2&\u017f\3\2\2\2(\u0182\3\2\2\2*\u0185\3\2\2\2,\u018c"+
		"\3\2\2\2.\u018f\3\2\2\2\60\u0192\3\2\2\2\62\u0195\3\2\2\2\64\u019d\3\2"+
		"\2\2\66\u01a3\3\2\2\28\u01a6\3\2\2\2:\u01a9\3\2\2\2<\u01b2\3\2\2\2>\u01b8"+
		"\3\2\2\2@\u01be\3\2\2\2B\u01c3\3\2\2\2D\u01c8\3\2\2\2F\u01ce\3\2\2\2H"+
		"\u01d3\3\2\2\2J\u01d8\3\2\2\2L\u01db\3\2\2\2N\u01e0\3\2\2\2P\u01e5\3\2"+
		"\2\2R\u01ea\3\2\2\2T\u01ef\3\2\2\2V\u01f3\3\2\2\2X\u01f6\3\2\2\2Z\u01fb"+
		"\3\2\2\2\\\u0202\3\2\2\2^\u0205\3\2\2\2`\u020b\3\2\2\2b\u0211\3\2\2\2"+
		"d\u0217\3\2\2\2f\u021d\3\2\2\2h\u0223\3\2\2\2j\u0226\3\2\2\2l\u0229\3"+
		"\2\2\2n\u022c\3\2\2\2p\u022f\3\2\2\2r\u0232\3\2\2\2t\u0235\3\2\2\2v\u0238"+
		"\3\2\2\2x\u023b\3\2\2\2z\u023e\3\2\2\2|\u0241\3\2\2\2~\u0244\3\2\2\2\u0080"+
		"\u0246\3\2\2\2\u0082\u0248\3\2\2\2\u0084\u024a\3\2\2\2\u0086\u024c\3\2"+
		"\2\2\u0088\u0253\3\2\2\2\u008a\u0255\3\2\2\2\u008c\u0257\3\2\2\2\u008e"+
		"\u025c\3\2\2\2\u0090\u0261\3\2\2\2\u0092\u026b\3\2\2\2\u0094\u026d\3\2"+
		"\2\2\u0096\u0274\3\2\2\2\u0098\u0276\3\2\2\2\u009a\u027e\3\2\2\2\u009c"+
		"\u0286\3\2\2\2\u009e\u0288\3\2\2\2\u00a0\u0295\3\2\2\2\u00a2\u0299\3\2"+
		"\2\2\u00a4\u029b\3\2\2\2\u00a6\u02a7\3\2\2\2\u00a8\u02a9\3\2\2\2\u00aa"+
		"\u02ab\3\2\2\2\u00ac\u02ad\3\2\2\2\u00ae\u02b5\3\2\2\2\u00b0\u02bc\3\2"+
		"\2\2\u00b2\u02be\3\2\2\2\u00b4\u02cc\3\2\2\2\u00b6\u02ce\3\2\2\2\u00b8"+
		"\u02d7\3\2\2\2\u00ba\u02db\3\2\2\2\u00bc\u02de\3\2\2\2\u00be\u02e3\3\2"+
		"\2\2\u00c0\u02e9\3\2\2\2\u00c2\u02f0\3\2\2\2\u00c4\u02f2\3\2\2\2\u00c6"+
		"\u02fd\3\2\2\2\u00c8\u0304\3\2\2\2\u00ca\u0306\3\2\2\2\u00cc\u0312\3\2"+
		"\2\2\u00ce\u0314\3\2\2\2\u00d0\u031b\3\2\2\2\u00d2\u0320\3\2\2\2\u00d4"+
		"\u0325\3\2\2\2\u00d6\u032a\3\2\2\2\u00d8\u032f\3\2\2\2\u00da\u0334\3\2"+
		"\2\2\u00dc\u0336\3\2\2\2\u00de\u0338\3\2\2\2\u00e0\u033b\3\2\2\2\u00e2"+
		"\u033f\3\2\2\2\u00e4\u0341\3\2\2\2\u00e6\u0343\3\2\2\2\u00e8\u0345\3\2"+
		"\2\2\u00ea\u034d\3\2\2\2\u00ec\u034f\3\2\2\2\u00ee\u0351\3\2\2\2\u00f0"+
		"\u0353\3\2\2\2\u00f2\u0355\3\2\2\2\u00f4\u0357\3\2\2\2\u00f6\u0129\5\""+
		"\22\2\u00f7\u0129\5$\23\2\u00f8\u0129\5&\24\2\u00f9\u0129\5(\25\2\u00fa"+
		"\u0129\5*\26\2\u00fb\u0129\5,\27\2\u00fc\u0129\5.\30\2\u00fd\u0129\5\60"+
		"\31\2\u00fe\u0129\5\62\32\2\u00ff\u0129\5\64\33\2\u0100\u0129\5\66\34"+
		"\2\u0101\u0129\58\35\2\u0102\u0129\5:\36\2\u0103\u0129\5<\37\2\u0104\u0129"+
		"\5> \2\u0105\u0129\5@!\2\u0106\u0129\5B\"\2\u0107\u0129\5D#\2\u0108\u0129"+
		"\5F$\2\u0109\u0129\5H%\2\u010a\u0129\5J&\2\u010b\u0129\5L\'\2\u010c\u0129"+
		"\5N(\2\u010d\u0129\5P)\2\u010e\u0129\5R*\2\u010f\u0129\5T+\2\u0110\u0129"+
		"\5V,\2\u0111\u0129\5X-\2\u0112\u0129\5Z.\2\u0113\u0129\5\\/\2\u0114\u0129"+
		"\5^\60\2\u0115\u0129\5`\61\2\u0116\u0129\5b\62\2\u0117\u0129\5d\63\2\u0118"+
		"\u0129\5f\64\2\u0119\u0129\5h\65\2\u011a\u0129\5j\66\2\u011b\u0129\5l"+
		"\67\2\u011c\u0129\5p9\2\u011d\u0129\5r:\2\u011e\u0129\5t;\2\u011f\u0129"+
		"\5v<\2\u0120\u0129\5x=\2\u0121\u0129\5z>\2\u0122\u0129\5|?\2\u0123\u0129"+
		"\5~@\2\u0124\u0129\5\u0080A\2\u0125\u0129\5\u0082B\2\u0126\u0129\5\u0084"+
		"C\2\u0127\u0129\5\4\3\2\u0128\u00f6\3\2\2\2\u0128\u00f7\3\2\2\2\u0128"+
		"\u00f8\3\2\2\2\u0128\u00f9\3\2\2\2\u0128\u00fa\3\2\2\2\u0128\u00fb\3\2"+
		"\2\2\u0128\u00fc\3\2\2\2\u0128\u00fd\3\2\2\2\u0128\u00fe\3\2\2\2\u0128"+
		"\u00ff\3\2\2\2\u0128\u0100\3\2\2\2\u0128\u0101\3\2\2\2\u0128\u0102\3\2"+
		"\2\2\u0128\u0103\3\2\2\2\u0128\u0104\3\2\2\2\u0128\u0105\3\2\2\2\u0128"+
		"\u0106\3\2\2\2\u0128\u0107\3\2\2\2\u0128\u0108\3\2\2\2\u0128\u0109\3\2"+
		"\2\2\u0128\u010a\3\2\2\2\u0128\u010b\3\2\2\2\u0128\u010c\3\2\2\2\u0128"+
		"\u010d\3\2\2\2\u0128\u010e\3\2\2\2\u0128\u010f\3\2\2\2\u0128\u0110\3\2"+
		"\2\2\u0128\u0111\3\2\2\2\u0128\u0112\3\2\2\2\u0128\u0113\3\2\2\2\u0128"+
		"\u0114\3\2\2\2\u0128\u0115\3\2\2\2\u0128\u0116\3\2\2\2\u0128\u0117\3\2"+
		"\2\2\u0128\u0118\3\2\2\2\u0128\u0119\3\2\2\2\u0128\u011a\3\2\2\2\u0128"+
		"\u011b\3\2\2\2\u0128\u011c\3\2\2\2\u0128\u011d\3\2\2\2\u0128\u011e\3\2"+
		"\2\2\u0128\u011f\3\2\2\2\u0128\u0120\3\2\2\2\u0128\u0121\3\2\2\2\u0128"+
		"\u0122\3\2\2\2\u0128\u0123\3\2\2\2\u0128\u0124\3\2\2\2\u0128\u0125\3\2"+
		"\2\2\u0128\u0126\3\2\2\2\u0128\u0127\3\2\2\2\u0129\3\3\2\2\2\u012a\u0137"+
		"\5\6\4\2\u012b\u0137\5\b\5\2\u012c\u0137\5\n\6\2\u012d\u0137\5\f\7\2\u012e"+
		"\u0137\5\16\b\2\u012f\u0137\5\22\n\2\u0130\u0137\5\24\13\2\u0131\u0137"+
		"\5\26\f\2\u0132\u0137\5\30\r\2\u0133\u0137\5\32\16\2\u0134\u0137\5\34"+
		"\17\2\u0135\u0137\5\36\20\2\u0136\u012a\3\2\2\2\u0136\u012b\3\2\2\2\u0136"+
		"\u012c\3\2\2\2\u0136\u012d\3\2\2\2\u0136\u012e\3\2\2\2\u0136\u012f\3\2"+
		"\2\2\u0136\u0130\3\2\2\2\u0136\u0131\3\2\2\2\u0136\u0132\3\2\2\2\u0136"+
		"\u0133\3\2\2\2\u0136\u0134\3\2\2\2\u0136\u0135\3\2\2\2\u0137\5\3\2\2\2"+
		"\u0138\u0139\7\3\2\2\u0139\u013a\5 \21\2\u013a\u013b\5\u00f4{\2\u013b"+
		"\u013c\5 \21\2\u013c\7\3\2\2\2\u013d\u013e\7\4\2\2\u013e\u013f\5\u00a0"+
		"Q\2\u013f\t\3\2\2\2\u0140\u0141\7\5\2\2\u0141\u0142\7\6\2\2\u0142\u0143"+
		"\5\u00a6T\2\u0143\u0144\7\7\2\2\u0144\u0145\5 \21\2\u0145\13\3\2\2\2\u0146"+
		"\u0147\7\b\2\2\u0147\u0148\5\u00ccg\2\u0148\u0149\7\6\2\2\u0149\u014a"+
		"\5\u0098M\2\u014a\u014b\7\7\2\2\u014b\r\3\2\2\2\u014c\u014d\7\t\2\2\u014d"+
		"\u014e\5\20\t\2\u014e\17\3\2\2\2\u014f\u0150\5\u00ccg\2\u0150\u0151\7"+
		"\u00a1\2\2\u0151\u0152\5 \21\2\u0152\21\3\2\2\2\u0153\u0154\7\n\2\2\u0154"+
		"\u0155\5 \21\2\u0155\u0156\5\u00f2z\2\u0156\u0157\5 \21\2\u0157\23\3\2"+
		"\2\2\u0158\u0159\7\13\2\2\u0159\u015a\5 \21\2\u015a\u015b\7\f\2\2\u015b"+
		"\u015c\5\u00a6T\2\u015c\25\3\2\2\2\u015d\u015e\7\r\2\2\u015e\u015f\5\u00cc"+
		"g\2\u015f\u0160\7\u00bb\2\2\u0160\u0161\5 \21\2\u0161\27\3\2\2\2\u0162"+
		"\u0163\7\16\2\2\u0163\u0164\5\u00ccg\2\u0164\31\3\2\2\2\u0165\u0166\7"+
		"\17\2\2\u0166\u0167\5\u00eex\2\u0167\u0168\5 \21\2\u0168\33\3\2\2\2\u0169"+
		"\u016a\7\20\2\2\u016a\u016b\5 \21\2\u016b\u016c\5\u00f0y\2\u016c\35\3"+
		"\2\2\2\u016d\u016e\7\21\2\2\u016e\u016f\5 \21\2\u016f\u0170\7\22\2\2\u0170"+
		"\u0172\5 \21\2\u0171\u0173\5\u00e0q\2\u0172\u0171\3\2\2\2\u0172\u0173"+
		"\3\2\2\2\u0173\37\3\2\2\2\u0174\u017a\5\u00ccg\2\u0175\u017a\5\20\t\2"+
		"\u0176\u017a\5\u00a0Q\2\u0177\u017a\5\u00dco\2\u0178\u017a\5\u00dep\2"+
		"\u0179\u0174\3\2\2\2\u0179\u0175\3\2\2\2\u0179\u0176\3\2\2\2\u0179\u0177"+
		"\3\2\2\2\u0179\u0178\3\2\2\2\u017a!\3\2\2\2\u017b\u017c\7\23\2\2\u017c"+
		"#\3\2\2\2\u017d\u017e\7\24\2\2\u017e%\3\2\2\2\u017f\u0180\7\25\2\2\u0180"+
		"\u0181\5\u00ccg\2\u0181\'\3\2\2\2\u0182\u0183\7\26\2\2\u0183\u0184\5\u00cc"+
		"g\2\u0184)\3\2\2\2\u0185\u0186\7\27\2\2\u0186\u0187\5\u00a6T\2\u0187\u018a"+
		"\7\30\2\2\u0188\u0189\7\31\2\2\u0189\u018b\5 \21\2\u018a\u0188\3\2\2\2"+
		"\u018a\u018b\3\2\2\2\u018b+\3\2\2\2\u018c\u018d\7\32\2\2\u018d\u018e\5"+
		"\u00ccg\2\u018e-\3\2\2\2\u018f\u0190\7\33\2\2\u0190\u0191\5\u00ccg\2\u0191"+
		"/\3\2\2\2\u0192\u0193\7\34\2\2\u0193\u0194\5\u00ccg\2\u0194\61\3\2\2\2"+
		"\u0195\u0196\7\35\2\2\u0196\u0198\7\6\2\2\u0197\u0199\5\u009eP\2\u0198"+
		"\u0197\3\2\2\2\u0198\u0199\3\2\2\2\u0199\u019a\3\2\2\2\u019a\u019b\7\7"+
		"\2\2\u019b\u019c\5\u00ccg\2\u019c\63\3\2\2\2\u019d\u019e\7\36\2\2\u019e"+
		"\u019f\5\u00ccg\2\u019f\u01a0\7\6\2\2\u01a0\u01a1\5\u0098M\2\u01a1\u01a2"+
		"\7\7\2\2\u01a2\65\3\2\2\2\u01a3\u01a4\7\37\2\2\u01a4\u01a5\5\u00ccg\2"+
		"\u01a5\67\3\2\2\2\u01a6\u01a7\7 \2\2\u01a7\u01a8\5\u00a6T\2\u01a89\3\2"+
		"\2\2\u01a9\u01aa\7!\2\2\u01aa\u01ac\7\6\2\2\u01ab\u01ad\5\u009eP\2\u01ac"+
		"\u01ab\3\2\2\2\u01ac\u01ad\3\2\2\2\u01ad\u01ae\3\2\2\2\u01ae\u01af\7\7"+
		"\2\2\u01af\u01b0\7\"\2\2\u01b0\u01b1\7#\2\2\u01b1;\3\2\2\2\u01b2\u01b3"+
		"\7$\2\2\u01b3\u01b6\7%\2\2\u01b4\u01b5\7\22\2\2\u01b5\u01b7\5\u00ccg\2"+
		"\u01b6\u01b4\3\2\2\2\u01b6\u01b7\3\2\2\2\u01b7=\3\2\2\2\u01b8\u01b9\7"+
		"&\2\2\u01b9\u01bc\7\'\2\2\u01ba\u01bb\7\22\2\2\u01bb\u01bd\5\u00ccg\2"+
		"\u01bc\u01ba\3\2\2\2\u01bc\u01bd\3\2\2\2\u01bd?\3\2\2\2\u01be\u01bf\7"+
		"(\2\2\u01bf\u01c0\7)\2\2\u01c0\u01c1\7\22\2\2\u01c1\u01c2\5 \21\2\u01c2"+
		"A\3\2\2\2\u01c3\u01c4\7*\2\2\u01c4\u01c5\7)\2\2\u01c5\u01c6\7\22\2\2\u01c6"+
		"\u01c7\5 \21\2\u01c7C\3\2\2\2\u01c8\u01c9\7+\2\2\u01c9\u01cc\7,\2\2\u01ca"+
		"\u01cb\7\22\2\2\u01cb\u01cd\5 \21\2\u01cc\u01ca\3\2\2\2\u01cc\u01cd\3"+
		"\2\2\2\u01cdE\3\2\2\2\u01ce\u01cf\7-\2\2\u01cf\u01d0\7.\2\2\u01d0\u01d1"+
		"\7\22\2\2\u01d1\u01d2\5 \21\2\u01d2G\3\2\2\2\u01d3\u01d4\7/\2\2\u01d4"+
		"\u01d5\7\60\2\2\u01d5\u01d6\7\22\2\2\u01d6\u01d7\5 \21\2\u01d7I\3\2\2"+
		"\2\u01d8\u01d9\7\61\2\2\u01d9\u01da\7\31\2\2\u01daK\3\2\2\2\u01db\u01dc"+
		"\7\62\2\2\u01dc\u01dd\7\63\2\2\u01dd\u01de\7\22\2\2\u01de\u01df\5 \21"+
		"\2\u01dfM\3\2\2\2\u01e0\u01e1\7\64\2\2\u01e1\u01e2\7\65\2\2\u01e2\u01e3"+
		"\7\22\2\2\u01e3\u01e4\5 \21\2\u01e4O\3\2\2\2\u01e5\u01e6\7\66\2\2\u01e6"+
		"\u01e7\7\67\2\2\u01e7\u01e8\7\22\2\2\u01e8\u01e9\5\u00a6T\2\u01e9Q\3\2"+
		"\2\2\u01ea\u01eb\78\2\2\u01eb\u01ec\79\2\2\u01ec\u01ed\7\22\2\2\u01ed"+
		"\u01ee\5 \21\2\u01eeS\3\2\2\2\u01ef\u01f0\7:\2\2\u01f0\u01f1\5\u00a6T"+
		"\2\u01f1\u01f2\7;\2\2\u01f2U\3\2\2\2\u01f3\u01f4\7<\2\2\u01f4\u01f5\7"+
		"=\2\2\u01f5W\3\2\2\2\u01f6\u01f9\7>\2\2\u01f7\u01f8\7\u00bc\2\2\u01f8"+
		"\u01fa\5 \21\2\u01f9\u01f7\3\2\2\2\u01f9\u01fa\3\2\2\2\u01faY\3\2\2\2"+
		"\u01fb\u01fc\7?\2\2\u01fc\u01fd\7@\2\2\u01fd\u01fe\5\u00a6T\2\u01fe\u01ff"+
		"\7\u00a7\2\2\u01ff\u0200\5 \21\2\u0200\u0201\7\7\2\2\u0201[\3\2\2\2\u0202"+
		"\u0203\5\4\3\2\u0203\u0204\5\u00e0q\2\u0204]\3\2\2\2\u0205\u0207\7A\2"+
		"\2\u0206\u0208\7\6\2\2\u0207\u0206\3\2\2\2\u0208\u0209\3\2\2\2\u0209\u0207"+
		"\3\2\2\2\u0209\u020a\3\2\2\2\u020a_\3\2\2\2\u020b\u020d\7A\2\2\u020c\u020e"+
		"\7\7\2\2\u020d\u020c\3\2\2\2\u020e\u020f\3\2\2\2\u020f\u020d\3\2\2\2\u020f"+
		"\u0210\3\2\2\2\u0210a\3\2\2\2\u0211\u0213\7A\2\2\u0212\u0214\7B\2\2\u0213"+
		"\u0212\3\2\2\2\u0214\u0215\3\2\2\2\u0215\u0213\3\2\2\2\u0215\u0216\3\2"+
		"\2\2\u0216c\3\2\2\2\u0217\u0219\7A\2\2\u0218\u021a\7C\2\2\u0219\u0218"+
		"\3\2\2\2\u021a\u021b\3\2\2\2\u021b\u0219\3\2\2\2\u021b\u021c\3\2\2\2\u021c"+
		"e\3\2\2\2\u021d\u021f\7A\2\2\u021e\u0220\7D\2\2\u021f\u021e\3\2\2\2\u0220"+
		"\u0221\3\2\2\2\u0221\u021f\3\2\2\2\u0221\u0222\3\2\2\2\u0222g\3\2\2\2"+
		"\u0223\u0224\7A\2\2\u0224\u0225\7E\2\2\u0225i\3\2\2\2\u0226\u0227\7A\2"+
		"\2\u0227\u0228\7F\2\2\u0228k\3\2\2\2\u0229\u022a\7A\2\2\u022a\u022b\7"+
		"G\2\2\u022bm\3\2\2\2\u022c\u022d\7A\2\2\u022d\u022e\7H\2\2\u022eo\3\2"+
		"\2\2\u022f\u0230\7A\2\2\u0230\u0231\7I\2\2\u0231q\3\2\2\2\u0232\u0233"+
		"\7A\2\2\u0233\u0234\7J\2\2\u0234s\3\2\2\2\u0235\u0236\7A\2\2\u0236\u0237"+
		"\7K\2\2\u0237u\3\2\2\2\u0238\u0239\7A\2\2\u0239\u023a\7L\2\2\u023aw\3"+
		"\2\2\2\u023b\u023c\7A\2\2\u023c\u023d\7M\2\2\u023dy\3\2\2\2\u023e\u023f"+
		"\7A\2\2\u023f\u0240\7N\2\2\u0240{\3\2\2\2\u0241\u0242\7A\2\2\u0242\u0243"+
		"\7O\2\2\u0243}\3\2\2\2\u0244\u0245\7P\2\2\u0245\177\3\2\2\2\u0246\u0247"+
		"\7Q\2\2\u0247\u0081\3\2\2\2\u0248\u0249\7R\2\2\u0249\u0083\3\2\2\2\u024a"+
		"\u024b\7S\2\2\u024b\u0085\3\2\2\2\u024c\u024d\7T\2\2\u024d\u0087\3\2\2"+
		"\2\u024e\u0254\5\u00ccg\2\u024f\u0254\5\20\t\2\u0250\u0254\5\u00a0Q\2"+
		"\u0251\u0254\5\u00dco\2\u0252\u0254\5\u0086D\2\u0253\u024e\3\2\2\2\u0253"+
		"\u024f\3\2\2\2\u0253\u0250\3\2\2\2\u0253\u0251\3\2\2\2\u0253\u0252\3\2"+
		"\2\2\u0254\u0089\3\2\2\2\u0255\u0256\5\u0088E\2\u0256\u008b\3\2\2\2\u0257"+
		"\u025a\7U\2\2\u0258\u0259\7\u00a1\2\2\u0259\u025b\5\u0088E\2\u025a\u0258"+
		"\3\2\2\2\u025a\u025b\3\2\2\2\u025b\u008d\3\2\2\2\u025c\u025f\7V\2\2\u025d"+
		"\u025e\7\u00a1\2\2\u025e\u0260\5\u0088E\2\u025f\u025d\3\2\2\2\u025f\u0260"+
		"\3\2\2\2\u0260\u008f\3\2\2\2\u0261\u0264\7W\2\2\u0262\u0263\7\u00a1\2"+
		"\2\u0263\u0265\5\u0088E\2\u0264\u0262\3\2\2\2\u0264\u0265\3\2\2\2\u0265"+
		"\u0091\3\2\2\2\u0266\u026c\3\2\2\2\u0267\u026c\5\u008cG\2\u0268\u026c"+
		"\5\u008eH\2\u0269\u026c\5\u0090I\2\u026a\u026c\5\u008aF\2\u026b\u0266"+
		"\3\2\2\2\u026b\u0267\3\2\2\2\u026b\u0268\3\2\2\2\u026b\u0269\3\2\2\2\u026b"+
		"\u026a\3\2\2\2\u026c\u0093\3\2\2\2\u026d\u026e\7T\2\2\u026e\u0095\3\2"+
		"\2\2\u026f\u0275\5\u00ccg\2\u0270\u0275\5\20\t\2\u0271\u0275\5\u00a0Q"+
		"\2\u0272\u0275\5\u00dco\2\u0273\u0275\5\u0094K\2\u0274\u026f\3\2\2\2\u0274"+
		"\u0270\3\2\2\2\u0274\u0271\3\2\2\2\u0274\u0272\3\2\2\2\u0274\u0273\3\2"+
		"\2\2\u0275\u0097\3\2\2\2\u0276\u027b\5\u0092J\2\u0277\u0278\7\u00a0\2"+
		"\2\u0278\u027a\5\u0096L\2\u0279\u0277\3\2\2\2\u027a\u027d\3\2\2\2\u027b"+
		"\u0279\3\2\2\2\u027b\u027c\3\2\2\2\u027c\u0099\3\2\2\2\u027d\u027b\3\2"+
		"\2\2\u027e\u0283\5\u00a6T\2\u027f\u0280\7\u00a0\2\2\u0280\u0282\5\u00a6"+
		"T\2\u0281\u027f\3\2\2\2\u0282\u0285\3\2\2\2\u0283\u0281\3\2\2\2\u0283"+
		"\u0284\3\2\2\2\u0284\u009b\3\2\2\2\u0285\u0283\3\2\2\2\u0286\u0287\5\u00a6"+
		"T\2\u0287\u009d\3\2\2\2\u0288\u028d\5\u009cO\2\u0289\u028a\7\u00a0\2\2"+
		"\u028a\u028c\5\u009cO\2\u028b\u0289\3\2\2\2\u028c\u028f\3\2\2\2\u028d"+
		"\u028b\3\2\2\2\u028d\u028e\3\2\2\2\u028e\u009f\3\2\2\2\u028f\u028d\3\2"+
		"\2\2\u0290\u0296\5\u00a2R\2\u0291\u0296\5\u00e8u\2\u0292\u0296\5\u00ea"+
		"v\2\u0293\u0296\5\u00a4S\2\u0294\u0296\5\u00ecw\2\u0295\u0290\3\2\2\2"+
		"\u0295\u0291\3\2\2\2\u0295\u0292\3\2\2\2\u0295\u0293\3\2\2\2\u0295\u0294"+
		"\3\2\2\2\u0296\u00a1\3\2\2\2\u0297\u029a\5\u00e4s\2\u0298\u029a\5\u00e6"+
		"t\2\u0299\u0297\3\2\2\2\u0299\u0298\3\2\2\2\u029a\u00a3\3\2\2\2\u029b"+
		"\u029c\7X\2\2\u029c\u00a5\3\2\2\2\u029d\u02a8\5\u00a8U\2\u029e\u02a8\5"+
		"\u00aaV\2\u029f\u02a8\5\u00aeX\2\u02a0\u02a8\5\u00acW\2\u02a1\u02a8\5"+
		"\u00b2Z\2\u02a2\u02a8\5\u00b4[\2\u02a3\u02a8\5\u00c4c\2\u02a4\u02a8\5"+
		"\u00caf\2\u02a5\u02a8\5\u00b8]\2\u02a6\u02a8\5\u00d0i\2\u02a7\u029d\3"+
		"\2\2\2\u02a7\u029e\3\2\2\2\u02a7\u029f\3\2\2\2\u02a7\u02a0\3\2\2\2\u02a7"+
		"\u02a1\3\2\2\2\u02a7\u02a2\3\2\2\2\u02a7\u02a3\3\2\2\2\u02a7\u02a4\3\2"+
		"\2\2\u02a7\u02a5\3\2\2\2\u02a7\u02a6\3\2\2\2\u02a8\u00a7\3\2\2\2\u02a9"+
		"\u02aa\7Y\2\2\u02aa\u00a9\3\2\2\2\u02ab\u02ac\t\2\2\2\u02ac\u00ab\3\2"+
		"\2\2\u02ad\u02b2\5\u00ccg\2\u02ae\u02af\7\u00a1\2\2\u02af\u02b1\5\u00cc"+
		"g\2\u02b0\u02ae\3\2\2\2\u02b1\u02b4\3\2\2\2\u02b2\u02b0\3\2\2\2\u02b2"+
		"\u02b3\3\2\2\2\u02b3\u00ad\3\2\2\2\u02b4\u02b2\3\2\2\2\u02b5\u02b6\5\u00cc"+
		"g\2\u02b6\u02b7\7\u00a3\2\2\u02b7\u02b8\5\u009aN\2\u02b8\u02b9\7\u00a2"+
		"\2\2\u02b9\u00af\3\2\2\2\u02ba\u02bd\5\u00acW\2\u02bb\u02bd\5\u00aeX\2"+
		"\u02bc\u02ba\3\2\2\2\u02bc\u02bb\3\2\2\2\u02bd\u00b1\3\2\2\2\u02be\u02c3"+
		"\5\u00b0Y\2\u02bf\u02c0\7\u00a1\2\2\u02c0\u02c2\5\u00b0Y\2\u02c1\u02bf"+
		"\3\2\2\2\u02c2\u02c5\3\2\2\2\u02c3\u02c1\3\2\2\2\u02c3\u02c4\3\2\2\2\u02c4"+
		"\u00b3\3\2\2\2\u02c5\u02c3\3\2\2\2\u02c6\u02c7\5\u00aaV\2\u02c7\u02c8"+
		"\5\u00b6\\\2\u02c8\u02cd\3\2\2\2\u02c9\u02ca\5\u00b2Z\2\u02ca\u02cb\5"+
		"\u00b6\\\2\u02cb\u02cd\3\2\2\2\u02cc\u02c6\3\2\2\2\u02cc\u02c9\3\2\2\2"+
		"\u02cd\u00b5\3\2\2\2\u02ce\u02cf\7b\2\2\u02cf\u02d4\7c\2\2\u02d0\u02d1"+
		"\7b\2\2\u02d1\u02d3\7c\2\2\u02d2\u02d0\3\2\2\2\u02d3\u02d6\3\2\2\2\u02d4"+
		"\u02d2\3\2\2\2\u02d4\u02d5\3\2\2\2\u02d5\u00b7\3\2\2\2\u02d6\u02d4\3\2"+
		"\2\2\u02d7\u02d9\7\u00a6\2\2\u02d8\u02da\5\u00be`\2\u02d9\u02d8\3\2\2"+
		"\2\u02d9\u02da\3\2\2\2\u02da\u00b9\3\2\2\2\u02db\u02dc\7d\2\2\u02dc\u02dd"+
		"\5\u00a6T\2\u02dd\u00bb\3\2\2\2\u02de\u02df\7V\2\2\u02df\u02e0\5\u00a6"+
		"T\2\u02e0\u00bd\3\2\2\2\u02e1\u02e4\5\u00ba^\2\u02e2\u02e4\5\u00bc_\2"+
		"\u02e3\u02e1\3\2\2\2\u02e3\u02e2\3\2\2\2\u02e4\u00bf\3\2\2\2\u02e5\u02ea"+
		"\5\u00b2Z\2\u02e6\u02ea\5\u00aaV\2\u02e7\u02ea\5\u00b4[\2\u02e8\u02ea"+
		"\5\u00d0i\2\u02e9\u02e5\3\2\2\2\u02e9\u02e6\3\2\2\2\u02e9\u02e7\3\2\2"+
		"\2\u02e9\u02e8\3\2\2\2\u02ea\u00c1\3\2\2\2\u02eb\u02f1\5\u00b2Z\2\u02ec"+
		"\u02f1\5\u00aaV\2\u02ed\u02f1\5\u00b4[\2\u02ee\u02f1\5\u00d0i\2\u02ef"+
		"\u02f1\5\u00caf\2\u02f0\u02eb\3\2\2\2\u02f0\u02ec\3\2\2\2\u02f0\u02ed"+
		"\3\2\2\2\u02f0\u02ee\3\2\2\2\u02f0\u02ef\3\2\2\2\u02f1\u00c3\3\2\2\2\u02f2"+
		"\u02f5\5\u00c0a\2\u02f3\u02f4\7\u00b4\2\2\u02f4\u02f6\5\u00c2b\2\u02f5"+
		"\u02f3\3\2\2\2\u02f6\u02f7\3\2\2\2\u02f7\u02f5\3\2\2\2\u02f7\u02f8\3\2"+
		"\2\2\u02f8\u00c5\3\2\2\2\u02f9\u02fe\5\u00b2Z\2\u02fa\u02fe\5\u00aaV\2"+
		"\u02fb\u02fe\5\u00b4[\2\u02fc\u02fe\5\u00d0i\2\u02fd\u02f9\3\2\2\2\u02fd"+
		"\u02fa\3\2\2\2\u02fd\u02fb\3\2\2\2\u02fd\u02fc\3\2\2\2\u02fe\u00c7\3\2"+
		"\2\2\u02ff\u0305\5\u00b2Z\2\u0300\u0305\5\u00aaV\2\u0301\u0305\5\u00b4"+
		"[\2\u0302\u0305\5\u00d0i\2\u0303\u0305\5\u00c4c\2\u0304\u02ff\3\2\2\2"+
		"\u0304\u0300\3\2\2\2\u0304\u0301\3\2\2\2\u0304\u0302\3\2\2\2\u0304\u0303"+
		"\3\2\2\2\u0305\u00c9\3\2\2\2\u0306\u0309\5\u00c6d\2\u0307\u0308\7\u00b5"+
		"\2\2\u0308\u030a\5\u00c8e\2\u0309\u0307\3\2\2\2\u030a\u030b\3\2\2\2\u030b"+
		"\u0309\3\2\2\2\u030b\u030c\3\2\2\2\u030c\u00cb\3\2\2\2\u030d\u0313\5\u00ce"+
		"h\2\u030e\u0313\5\u00d2j\2\u030f\u0313\5\u00d4k\2\u0310\u0313\5\u00d6"+
		"l\2\u0311\u0313\5\u00d8m\2\u0312\u030d\3\2\2\2\u0312\u030e\3\2\2\2\u0312"+
		"\u030f\3\2\2\2\u0312\u0310\3\2\2\2\u0312\u0311\3\2\2\2\u0313\u00cd\3\2"+
		"\2\2\u0314\u0318\7q\2\2\u0315\u0317\7r\2\2\u0316\u0315\3\2\2\2\u0317\u031a"+
		"\3\2\2\2\u0318\u0316\3\2\2\2\u0318\u0319\3\2\2\2\u0319\u00cf\3\2\2\2\u031a"+
		"\u0318\3\2\2\2\u031b\u031c\7e\2\2\u031c\u031d\5\u00dan\2\u031d\u031e\7"+
		"\u00a6\2\2\u031e\u031f\5\u00dan\2\u031f\u00d1\3\2\2\2\u0320\u0321\7f\2"+
		"\2\u0321\u0322\5\u00dan\2\u0322\u0323\7\u00a6\2\2\u0323\u0324\5\u00da"+
		"n\2\u0324\u00d3\3\2\2\2\u0325\u0326\7g\2\2\u0326\u0327\5\u00dan\2\u0327"+
		"\u0328\7\u00a6\2\2\u0328\u0329\5\u00dan\2\u0329\u00d5\3\2\2\2\u032a\u032b"+
		"\7h\2\2\u032b\u032c\5\u00dan\2\u032c\u032d\7\u00a6\2\2\u032d\u032e\5\u00da"+
		"n\2\u032e\u00d7\3\2\2\2\u032f\u0330\7i\2\2\u0330\u0331\5\u00dan\2\u0331"+
		"\u0332\7\u00a6\2\2\u0332\u0333\5\u00dan\2\u0333\u00d9\3\2\2\2\u0334\u0335"+
		"\7s\2\2\u0335\u00db\3\2\2\2\u0336\u0337\7j\2\2\u0337\u00dd\3\2\2\2\u0338"+
		"\u0339\7T\2\2\u0339\u00df\3\2\2\2\u033a\u033c\7k\2\2\u033b\u033a\3\2\2"+
		"\2\u033c\u033d\3\2\2\2\u033d\u033b\3\2\2\2\u033d\u033e\3\2\2\2\u033e\u00e1"+
		"\3\2\2\2\u033f\u0340\7l\2\2\u0340\u00e3\3\2\2\2\u0341\u0342\t\3\2\2\u0342"+
		"\u00e5\3\2\2\2\u0343\u0344\t\4\2\2\u0344\u00e7\3\2\2\2\u0345\u0346\t\5"+
		"\2\2\u0346\u00e9\3\2\2\2\u0347\u0348\7o\2\2\u0348\u0349\7\u009b\2\2\u0349"+
		"\u034e\7o\2\2\u034a\u034b\7o\2\2\u034b\u034c\7\u009c\2\2\u034c\u034e\7"+
		"o\2\2\u034d\u0347\3\2\2\2\u034d\u034a\3\2\2\2\u034e\u00eb\3\2\2\2\u034f"+
		"\u0350\7p\2\2\u0350\u00ed\3\2\2\2\u0351\u0352\t\6\2\2\u0352\u00ef\3\2"+
		"\2\2\u0353\u0354\t\7\2\2\u0354\u00f1\3\2\2\2\u0355\u0356\t\b\2\2\u0356"+
		"\u00f3\3\2\2\2\u0357\u0358\t\t\2\2\u0358\u00f5\3\2\2\2/\u0128\u0136\u0172"+
		"\u0179\u018a\u0198\u01ac\u01b6\u01bc\u01cc\u01f9\u0209\u020f\u0215\u021b"+
		"\u0221\u0253\u025a\u025f\u0264\u026b\u0274\u027b\u0283\u028d\u0295\u0299"+
		"\u02a7\u02b2\u02bc\u02c3\u02cc\u02d4\u02d9\u02e3\u02e9\u02f0\u02f7\u02fd"+
		"\u0304\u030b\u0312\u0318\u033d\u034d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}