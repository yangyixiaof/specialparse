package SJ8Parse;

// Generated from Java8.g4 by ANTLR 4.5.1
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
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

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
		T__94=95, T__95=96, T__96=97, T__97=98, T__98=99, T__99=100, JavaLetter=101, 
		JavaLetterOrDigit=102, OffsetDesc=103, AT=104, WS=105, DecimalIntegerLiteral=106, 
		HexIntegerLiteral=107, OctalIntegerLiteral=108, BinaryIntegerLiteral=109, 
		IntegerTypeSuffix=110, DecimalNumeral=111, Digits=112, Digit=113, NonZeroDigit=114, 
		DigitsAndUnderscores=115, DigitOrUnderscore=116, Underscores=117, HexNumeral=118, 
		HexDigits=119, HexDigit=120, HexDigitsAndUnderscores=121, HexDigitOrUnderscore=122, 
		OctalNumeral=123, OctalDigits=124, OctalDigit=125, OctalDigitsAndUnderscores=126, 
		OctalDigitOrUnderscore=127, BinaryNumeral=128, BinaryDigits=129, BinaryDigit=130, 
		BinaryDigitsAndUnderscores=131, BinaryDigitOrUnderscore=132, DecimalFloatingPointLiteral=133, 
		ExponentPart=134, ExponentIndicator=135, SignedInteger=136, Sign=137, 
		FloatTypeSuffix=138, HexadecimalFloatingPointLiteral=139, HexSignificand=140, 
		BinaryExponent=141, BinaryExponentIndicator=142, SingleCharacter=143, 
		EscapeSequence=144, OctalEscape=145, ZeroToThree=146, UnicodeEscape=147, 
		COMMA=148, DOT=149, GT=150, LT=151, BANG=152, TILDE=153, QUESTION=154, 
		COLON=155, EQUAL=156, LE=157, GE=158, NOTEQUAL=159, AND=160, OR=161, INC=162, 
		DEC=163, ADD=164, SUB=165, MUL=166, DIV=167, BITAND=168, BITOR=169, CARET=170, 
		MOD=171, LSHIFT=172, RSHIFT=173, URSHIFT=174, COLONCOLON=175, ASSIGN=176, 
		ADD_ASSIGN=177, SUB_ASSIGN=178, MUL_ASSIGN=179, DIV_ASSIGN=180, AND_ASSIGN=181, 
		OR_ASSIGN=182, XOR_ASSIGN=183, MOD_ASSIGN=184, LSHIFT_ASSIGN=185, RSHIFT_ASSIGN=186, 
		URSHIFT_ASSIGN=187;
	public static final int
		RULE_statement = 0, RULE_expressionStatement = 1, RULE_assignmentStatement = 2, 
		RULE_literalStatement = 3, RULE_castExpressionStatement = 4, RULE_methodInvocationStatement = 5, 
		RULE_fieldAccessStatement = 6, RULE_fieldAccess = 7, RULE_infixExpressionStatement = 8, 
		RULE_instanceofExpressionStatement = 9, RULE_methodReferenceStatement = 10, 
		RULE_nameStatement = 11, RULE_prefixExpressionStatement = 12, RULE_postfixExpressionStatement = 13, 
		RULE_arrayAccessStatement = 14, RULE_referedExpression = 15, RULE_anonymousClassBeginStatement = 16, 
		RULE_anonymousClassPreStatement = 17, RULE_atInterfaceStatement = 18, 
		RULE_annotationTypeMemberDeclarationStatement = 19, RULE_classDeclarationStatement = 20, 
		RULE_classInnerDeclarationStatement = 21, RULE_enumDeclarationStatement = 22, 
		RULE_methodDeclarationStatement = 23, RULE_enumConstantDeclarationStatement = 24, 
		RULE_labeledStatement = 25, RULE_variableDeclarationStatement = 26, RULE_lambdaExpressionStatement = 27, 
		RULE_breakStatement = 28, RULE_continueStatement = 29, RULE_doWhileStatement = 30, 
		RULE_whileStatement = 31, RULE_returnStatement = 32, RULE_switchStatement = 33, 
		RULE_switchCaseStatement = 34, RULE_defaultStatement = 35, RULE_synchronizedStatement = 36, 
		RULE_throwStatement = 37, RULE_catchClauseStatement = 38, RULE_ifStatement = 39, 
		RULE_arrayCreationStatement = 40, RULE_initializerStatement = 41, RULE_variableDeclarationHolderStatement = 42, 
		RULE_enhancedForStatement = 43, RULE_partialEndArrayAccessStatement = 44, 
		RULE_leftParentheseStatement = 45, RULE_rightParentheseStatement = 46, 
		RULE_leftBraceStatement = 47, RULE_rightBraceStatement = 48, RULE_doStatement = 49, 
		RULE_arrayInitializerStartStatement = 50, RULE_forStatement = 51, RULE_forIniOverStatement = 52, 
		RULE_forExpOverStatement = 53, RULE_forUpdOverStatement = 54, RULE_condExpBeginStatement = 55, 
		RULE_condExpQuestionMarkStatement = 56, RULE_condExpColonMarkStatement = 57, 
		RULE_endOfStatement = 58, RULE_partialEnd = 59, RULE_fullEnd = 60, RULE_argumentList = 61, 
		RULE_typeList = 62, RULE_literal = 63, RULE_numberLiteral = 64, RULE_stringLiteral = 65, 
		RULE_type = 66, RULE_primitiveType = 67, RULE_simpleType = 68, RULE_parameterizedType = 69, 
		RULE_classOrInterfaceType = 70, RULE_arrayType = 71, RULE_dims = 72, RULE_wildCardType = 73, 
		RULE_wildcardBounds = 74, RULE_intersectionFirstType = 75, RULE_intersectionSecondType = 76, 
		RULE_intersectionType = 77, RULE_unionFirstType = 78, RULE_unionSecondType = 79, 
		RULE_unionType = 80, RULE_identifier = 81, RULE_idRawLetter = 82, RULE_classRef = 83, 
		RULE_finalFieldRef = 84, RULE_finalVarRef = 85, RULE_commonFieldRef = 86, 
		RULE_commonVarRef = 87, RULE_offset = 88, RULE_codeHole = 89, RULE_preExist = 90, 
		RULE_endOfArrayDeclarationIndexExpression = 91, RULE_integerLiteral = 92, 
		RULE_floatingPointLiteral = 93, RULE_booleanLiteral = 94, RULE_characterLiteral = 95, 
		RULE_nullLiteral = 96, RULE_unaryOperator = 97, RULE_binaryOperator = 98, 
		RULE_assignmentOperator = 99;
	public static final String[] ruleNames = {
		"statement", "expressionStatement", "assignmentStatement", "literalStatement", 
		"castExpressionStatement", "methodInvocationStatement", "fieldAccessStatement", 
		"fieldAccess", "infixExpressionStatement", "instanceofExpressionStatement", 
		"methodReferenceStatement", "nameStatement", "prefixExpressionStatement", 
		"postfixExpressionStatement", "arrayAccessStatement", "referedExpression", 
		"anonymousClassBeginStatement", "anonymousClassPreStatement", "atInterfaceStatement", 
		"annotationTypeMemberDeclarationStatement", "classDeclarationStatement", 
		"classInnerDeclarationStatement", "enumDeclarationStatement", "methodDeclarationStatement", 
		"enumConstantDeclarationStatement", "labeledStatement", "variableDeclarationStatement", 
		"lambdaExpressionStatement", "breakStatement", "continueStatement", "doWhileStatement", 
		"whileStatement", "returnStatement", "switchStatement", "switchCaseStatement", 
		"defaultStatement", "synchronizedStatement", "throwStatement", "catchClauseStatement", 
		"ifStatement", "arrayCreationStatement", "initializerStatement", "variableDeclarationHolderStatement", 
		"enhancedForStatement", "partialEndArrayAccessStatement", "leftParentheseStatement", 
		"rightParentheseStatement", "leftBraceStatement", "rightBraceStatement", 
		"doStatement", "arrayInitializerStartStatement", "forStatement", "forIniOverStatement", 
		"forExpOverStatement", "forUpdOverStatement", "condExpBeginStatement", 
		"condExpQuestionMarkStatement", "condExpColonMarkStatement", "endOfStatement", 
		"partialEnd", "fullEnd", "argumentList", "typeList", "literal", "numberLiteral", 
		"stringLiteral", "type", "primitiveType", "simpleType", "parameterizedType", 
		"classOrInterfaceType", "arrayType", "dims", "wildCardType", "wildcardBounds", 
		"intersectionFirstType", "intersectionSecondType", "intersectionType", 
		"unionFirstType", "unionSecondType", "unionType", "identifier", "idRawLetter", 
		"classRef", "finalFieldRef", "finalVarRef", "commonFieldRef", "commonVarRef", 
		"offset", "codeHole", "preExist", "endOfArrayDeclarationIndexExpression", 
		"integerLiteral", "floatingPointLiteral", "booleanLiteral", "characterLiteral", 
		"nullLiteral", "unaryOperator", "binaryOperator", "assignmentOperator"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'A@'", "'L@'", "'CE@'", "'('", "')'", "'MI@'", "'FA@'", "'IxE@'", 
		"'InE@'", "'instanceof'", "'MR@'", "'N@'", "'PeE@'", "'PtE@'", "'[@'", 
		"'#'", "'AB@'", "'HT@'", "'AT@'", "'AM@'", "'()'", "'default'", "'CD@'", 
		"'ICD@'", "'ED@'", "'MD@'", "'EMD@'", "'LD@'", "'VD@'", "'LE@'", "'->'", 
		"'{}'", "'B@'", "'break'", "'C@'", "'continue'", "'DW@'", "'while'", "'WS@'", 
		"'RT@'", "'return'", "'SW@'", "'switch'", "'CS@'", "'case'", "'DF@'", 
		"'SC@'", "'synchronized'", "'TS@'", "'throw'", "'CT@'", "'catch'", "'IF@'", 
		"'if'", "'AC@'", "'(new)'", "'IB@'", "'InitialBlock'", "'VH@'", "'EF@'", 
		"'for('", "'DH@'", "'{'", "'}'", "'do'", "'arrIni'", "'for'", "'forIniOver'", 
		"'forExpOver'", "'forUpdOver'", "'CondExpBegin'", "'CondExpQM'", "'CondExpCM'", 
		"'DH@,'", "'DH@;'", "'@STR'", "'float'", "'double'", "'boolean'", "'byte'", 
		"'short'", "'int'", "'long'", "'char'", "'['", "']'", "'extends'", "'super'", 
		"'$K'", "'$D'", "'$X'", "'$F'", "'$C'", "'@HO'", "'@PE'", "'@]'", "'true'", 
		"'false'", "'''", "'null'", null, null, null, "'@'", null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, "','", "'.'", "'>'", "'<'", "'!'", "'~'", "'?'", 
		"':'", "'=='", "'<='", "'>='", "'!='", "'&&'", "'||'", "'++'", "'--'", 
		"'+'", "'-'", "'*'", "'/'", "'&'", "'|'", "'^'", "'%'", "'<<'", "'>>'", 
		"'>>>'", "'::'", "'='", "'+='", "'-='", "'*='", "'/='", "'&='", "'|='", 
		"'^='", "'%='", "'<<='", "'>>='", "'>>>='"
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
		null, null, null, null, null, "JavaLetter", "JavaLetterOrDigit", "OffsetDesc", 
		"AT", "WS", "DecimalIntegerLiteral", "HexIntegerLiteral", "OctalIntegerLiteral", 
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
		public DoStatementContext doStatement() {
			return getRuleContext(DoStatementContext.class,0);
		}
		public ArrayInitializerStartStatementContext arrayInitializerStartStatement() {
			return getRuleContext(ArrayInitializerStartStatementContext.class,0);
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
		public EndOfStatementContext endOfStatement() {
			return getRuleContext(EndOfStatementContext.class,0);
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
			setState(244);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(200);
				anonymousClassBeginStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(201);
				anonymousClassPreStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(202);
				atInterfaceStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(203);
				annotationTypeMemberDeclarationStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(204);
				classDeclarationStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(205);
				classInnerDeclarationStatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(206);
				enumDeclarationStatement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(207);
				methodDeclarationStatement();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(208);
				enumConstantDeclarationStatement();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(209);
				labeledStatement();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(210);
				variableDeclarationStatement();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(211);
				lambdaExpressionStatement();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(212);
				breakStatement();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(213);
				continueStatement();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(214);
				doWhileStatement();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(215);
				whileStatement();
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(216);
				returnStatement();
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(217);
				switchStatement();
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(218);
				switchCaseStatement();
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(219);
				defaultStatement();
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(220);
				synchronizedStatement();
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(221);
				throwStatement();
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(222);
				catchClauseStatement();
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(223);
				ifStatement();
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(224);
				arrayCreationStatement();
				}
				break;
			case 26:
				enterOuterAlt(_localctx, 26);
				{
				setState(225);
				initializerStatement();
				}
				break;
			case 27:
				enterOuterAlt(_localctx, 27);
				{
				setState(226);
				variableDeclarationHolderStatement();
				}
				break;
			case 28:
				enterOuterAlt(_localctx, 28);
				{
				setState(227);
				enhancedForStatement();
				}
				break;
			case 29:
				enterOuterAlt(_localctx, 29);
				{
				setState(228);
				partialEndArrayAccessStatement();
				}
				break;
			case 30:
				enterOuterAlt(_localctx, 30);
				{
				setState(229);
				leftParentheseStatement();
				}
				break;
			case 31:
				enterOuterAlt(_localctx, 31);
				{
				setState(230);
				rightParentheseStatement();
				}
				break;
			case 32:
				enterOuterAlt(_localctx, 32);
				{
				setState(231);
				leftBraceStatement();
				}
				break;
			case 33:
				enterOuterAlt(_localctx, 33);
				{
				setState(232);
				rightBraceStatement();
				}
				break;
			case 34:
				enterOuterAlt(_localctx, 34);
				{
				setState(233);
				doStatement();
				}
				break;
			case 35:
				enterOuterAlt(_localctx, 35);
				{
				setState(234);
				arrayInitializerStartStatement();
				}
				break;
			case 36:
				enterOuterAlt(_localctx, 36);
				{
				setState(235);
				forStatement();
				}
				break;
			case 37:
				enterOuterAlt(_localctx, 37);
				{
				setState(236);
				forIniOverStatement();
				}
				break;
			case 38:
				enterOuterAlt(_localctx, 38);
				{
				setState(237);
				forExpOverStatement();
				}
				break;
			case 39:
				enterOuterAlt(_localctx, 39);
				{
				setState(238);
				forUpdOverStatement();
				}
				break;
			case 40:
				enterOuterAlt(_localctx, 40);
				{
				setState(239);
				condExpBeginStatement();
				}
				break;
			case 41:
				enterOuterAlt(_localctx, 41);
				{
				setState(240);
				condExpQuestionMarkStatement();
				}
				break;
			case 42:
				enterOuterAlt(_localctx, 42);
				{
				setState(241);
				condExpColonMarkStatement();
				}
				break;
			case 43:
				enterOuterAlt(_localctx, 43);
				{
				setState(242);
				endOfStatement();
				}
				break;
			case 44:
				enterOuterAlt(_localctx, 44);
				{
				setState(243);
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
			setState(258);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(246);
				assignmentStatement();
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
				setState(247);
				literalStatement();
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 3);
				{
				setState(248);
				castExpressionStatement();
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 4);
				{
				setState(249);
				methodInvocationStatement();
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 5);
				{
				setState(250);
				fieldAccessStatement();
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 6);
				{
				setState(251);
				infixExpressionStatement();
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 7);
				{
				setState(252);
				instanceofExpressionStatement();
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 8);
				{
				setState(253);
				methodReferenceStatement();
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 9);
				{
				setState(254);
				nameStatement();
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 10);
				{
				setState(255);
				prefixExpressionStatement();
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 11);
				{
				setState(256);
				postfixExpressionStatement();
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 12);
				{
				setState(257);
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
			setState(260);
			match(T__0);
			setState(261);
			referedExpression();
			setState(262);
			assignmentOperator();
			setState(263);
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
			setState(265);
			match(T__1);
			setState(266);
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
			setState(268);
			match(T__2);
			setState(269);
			match(T__3);
			setState(270);
			type();
			setState(271);
			match(T__4);
			setState(272);
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
			setState(274);
			match(T__5);
			setState(275);
			identifier();
			setState(276);
			match(T__3);
			setState(277);
			argumentList();
			setState(278);
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
			setState(280);
			match(T__6);
			setState(281);
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
			setState(283);
			identifier();
			setState(284);
			match(DOT);
			setState(285);
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
			setState(287);
			match(T__7);
			setState(288);
			referedExpression();
			setState(289);
			binaryOperator();
			setState(290);
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
			setState(292);
			match(T__8);
			setState(293);
			referedExpression();
			setState(294);
			match(T__9);
			setState(295);
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
			setState(297);
			match(T__10);
			setState(298);
			identifier();
			setState(299);
			match(COLONCOLON);
			setState(300);
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
			setState(302);
			match(T__11);
			setState(303);
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
		public UnaryOperatorContext unaryOperator() {
			return getRuleContext(UnaryOperatorContext.class,0);
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
			setState(305);
			match(T__12);
			setState(306);
			unaryOperator();
			setState(307);
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
		public UnaryOperatorContext unaryOperator() {
			return getRuleContext(UnaryOperatorContext.class,0);
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
			setState(309);
			match(T__13);
			setState(310);
			referedExpression();
			setState(311);
			unaryOperator();
			}
		}
		catch (RecognitionException re) {
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
			setState(313);
			match(T__14);
			setState(314);
			referedExpression();
			setState(315);
			match(T__15);
			setState(316);
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
			setState(321);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(318);
				identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(319);
				fieldAccess();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(320);
				literal();
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
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
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
			setState(323);
			match(T__16);
			setState(324);
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
		enterRule(_localctx, 34, RULE_anonymousClassPreStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(326);
			match(T__17);
			setState(327);
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
		enterRule(_localctx, 36, RULE_atInterfaceStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(329);
			match(T__18);
			setState(330);
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
		enterRule(_localctx, 38, RULE_annotationTypeMemberDeclarationStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(332);
			match(T__19);
			setState(333);
			type();
			setState(334);
			match(T__20);
			setState(337);
			_la = _input.LA(1);
			if (_la==T__21) {
				{
				setState(335);
				match(T__21);
				setState(336);
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
		enterRule(_localctx, 40, RULE_classDeclarationStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(339);
			match(T__22);
			setState(340);
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
		enterRule(_localctx, 42, RULE_classInnerDeclarationStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(342);
			match(T__23);
			setState(343);
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
		enterRule(_localctx, 44, RULE_enumDeclarationStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(345);
			match(T__24);
			setState(346);
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
		public TypeListContext typeList() {
			return getRuleContext(TypeListContext.class,0);
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
		enterRule(_localctx, 46, RULE_methodDeclarationStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(348);
			match(T__25);
			setState(349);
			match(T__3);
			setState(351);
			_la = _input.LA(1);
			if (((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (T__76 - 77)) | (1L << (T__77 - 77)) | (1L << (T__78 - 77)) | (1L << (T__79 - 77)) | (1L << (T__80 - 77)) | (1L << (T__81 - 77)) | (1L << (T__82 - 77)) | (1L << (T__83 - 77)) | (1L << (T__88 - 77)) | (1L << (T__89 - 77)) | (1L << (T__90 - 77)) | (1L << (T__91 - 77)) | (1L << (T__92 - 77)) | (1L << (T__93 - 77)) | (1L << (T__94 - 77)) | (1L << (JavaLetter - 77)))) != 0) || _la==QUESTION) {
				{
				setState(350);
				typeList();
				}
			}

			setState(353);
			match(T__4);
			setState(354);
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
		enterRule(_localctx, 48, RULE_enumConstantDeclarationStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(356);
			match(T__26);
			setState(357);
			identifier();
			setState(358);
			match(T__3);
			setState(359);
			argumentList();
			setState(360);
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
		enterRule(_localctx, 50, RULE_labeledStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(362);
			match(T__27);
			setState(363);
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
		public DimsContext dims() {
			return getRuleContext(DimsContext.class,0);
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
		enterRule(_localctx, 52, RULE_variableDeclarationStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(365);
			match(T__28);
			setState(366);
			type();
			setState(367);
			dims();
			}
		}
		catch (RecognitionException re) {
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
		public TypeListContext typeList() {
			return getRuleContext(TypeListContext.class,0);
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
		enterRule(_localctx, 54, RULE_lambdaExpressionStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(369);
			match(T__29);
			setState(370);
			match(T__3);
			setState(372);
			_la = _input.LA(1);
			if (((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (T__76 - 77)) | (1L << (T__77 - 77)) | (1L << (T__78 - 77)) | (1L << (T__79 - 77)) | (1L << (T__80 - 77)) | (1L << (T__81 - 77)) | (1L << (T__82 - 77)) | (1L << (T__83 - 77)) | (1L << (T__88 - 77)) | (1L << (T__89 - 77)) | (1L << (T__90 - 77)) | (1L << (T__91 - 77)) | (1L << (T__92 - 77)) | (1L << (T__93 - 77)) | (1L << (T__94 - 77)) | (1L << (JavaLetter - 77)))) != 0) || _la==QUESTION) {
				{
				setState(371);
				typeList();
				}
			}

			setState(374);
			match(T__4);
			setState(375);
			match(T__30);
			setState(376);
			match(T__31);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 56, RULE_breakStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(378);
			match(T__32);
			setState(379);
			match(T__33);
			setState(382);
			_la = _input.LA(1);
			if (_la==T__15) {
				{
				setState(380);
				match(T__15);
				setState(381);
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
		enterRule(_localctx, 58, RULE_continueStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(384);
			match(T__34);
			setState(385);
			match(T__35);
			setState(388);
			_la = _input.LA(1);
			if (_la==T__15) {
				{
				setState(386);
				match(T__15);
				setState(387);
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
		enterRule(_localctx, 60, RULE_doWhileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(390);
			match(T__36);
			setState(391);
			match(T__37);
			setState(392);
			match(T__15);
			setState(393);
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
		enterRule(_localctx, 62, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(395);
			match(T__38);
			setState(396);
			match(T__37);
			setState(397);
			match(T__15);
			setState(398);
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
		enterRule(_localctx, 64, RULE_returnStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(400);
			match(T__39);
			setState(401);
			match(T__40);
			setState(404);
			_la = _input.LA(1);
			if (_la==T__15) {
				{
				setState(402);
				match(T__15);
				setState(403);
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
		enterRule(_localctx, 66, RULE_switchStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(406);
			match(T__41);
			setState(407);
			match(T__42);
			setState(408);
			match(T__15);
			setState(409);
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
		enterRule(_localctx, 68, RULE_switchCaseStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(411);
			match(T__43);
			setState(412);
			match(T__44);
			setState(413);
			match(T__15);
			setState(414);
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
		enterRule(_localctx, 70, RULE_defaultStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(416);
			match(T__45);
			setState(417);
			match(T__21);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 72, RULE_synchronizedStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(419);
			match(T__46);
			setState(420);
			match(T__47);
			setState(421);
			match(T__15);
			setState(422);
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
		enterRule(_localctx, 74, RULE_throwStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(424);
			match(T__48);
			setState(425);
			match(T__49);
			setState(426);
			match(T__15);
			setState(427);
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
		enterRule(_localctx, 76, RULE_catchClauseStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(429);
			match(T__50);
			setState(430);
			match(T__51);
			setState(431);
			match(T__15);
			setState(432);
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
		enterRule(_localctx, 78, RULE_ifStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(434);
			match(T__52);
			setState(435);
			match(T__53);
			setState(436);
			match(T__15);
			setState(437);
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
		enterRule(_localctx, 80, RULE_arrayCreationStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(439);
			match(T__54);
			setState(440);
			type();
			setState(441);
			match(T__55);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 82, RULE_initializerStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(443);
			match(T__56);
			setState(444);
			match(T__57);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 84, RULE_variableDeclarationHolderStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(446);
			match(T__58);
			setState(449);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(447);
				match(ASSIGN);
				setState(448);
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
		enterRule(_localctx, 86, RULE_enhancedForStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(451);
			match(T__59);
			setState(452);
			match(T__60);
			setState(453);
			type();
			setState(454);
			match(COLON);
			setState(455);
			referedExpression();
			setState(456);
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
		enterRule(_localctx, 88, RULE_partialEndArrayAccessStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(458);
			expressionStatement();
			setState(459);
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
		enterRule(_localctx, 90, RULE_leftParentheseStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(461);
			match(T__61);
			setState(463); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(462);
				match(T__3);
				}
				}
				setState(465); 
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
		enterRule(_localctx, 92, RULE_rightParentheseStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(467);
			match(T__61);
			setState(469); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(468);
				match(T__4);
				}
				}
				setState(471); 
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
		enterRule(_localctx, 94, RULE_leftBraceStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(473);
			match(T__61);
			setState(475); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(474);
				match(T__62);
				}
				}
				setState(477); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__62 );
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 96, RULE_rightBraceStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(479);
			match(T__61);
			setState(481); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(480);
				match(T__63);
				}
				}
				setState(483); 
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

	public static class DoStatementContext extends ParserRuleContext {
		public DoStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterDoStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitDoStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitDoStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DoStatementContext doStatement() throws RecognitionException {
		DoStatementContext _localctx = new DoStatementContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_doStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(485);
			match(T__61);
			setState(486);
			match(T__64);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 100, RULE_arrayInitializerStartStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(488);
			match(T__61);
			setState(489);
			match(T__65);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 102, RULE_forStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(491);
			match(T__61);
			setState(492);
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
		enterRule(_localctx, 104, RULE_forIniOverStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(494);
			match(T__61);
			setState(495);
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
		enterRule(_localctx, 106, RULE_forExpOverStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(497);
			match(T__61);
			setState(498);
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
		enterRule(_localctx, 108, RULE_forUpdOverStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(500);
			match(T__61);
			setState(501);
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
		enterRule(_localctx, 110, RULE_condExpBeginStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(503);
			match(T__61);
			setState(504);
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
		enterRule(_localctx, 112, RULE_condExpQuestionMarkStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(506);
			match(T__61);
			setState(507);
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
		enterRule(_localctx, 114, RULE_condExpColonMarkStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(509);
			match(T__61);
			setState(510);
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

	public static class EndOfStatementContext extends ParserRuleContext {
		public PartialEndContext partialEnd() {
			return getRuleContext(PartialEndContext.class,0);
		}
		public FullEndContext fullEnd() {
			return getRuleContext(FullEndContext.class,0);
		}
		public EndOfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_endOfStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterEndOfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitEndOfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitEndOfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EndOfStatementContext endOfStatement() throws RecognitionException {
		EndOfStatementContext _localctx = new EndOfStatementContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_endOfStatement);
		try {
			setState(514);
			switch (_input.LA(1)) {
			case T__73:
				enterOuterAlt(_localctx, 1);
				{
				setState(512);
				partialEnd();
				}
				break;
			case T__74:
				enterOuterAlt(_localctx, 2);
				{
				setState(513);
				fullEnd();
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

	public static class PartialEndContext extends ParserRuleContext {
		public PartialEndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partialEnd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterPartialEnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitPartialEnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitPartialEnd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PartialEndContext partialEnd() throws RecognitionException {
		PartialEndContext _localctx = new PartialEndContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_partialEnd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(516);
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

	public static class FullEndContext extends ParserRuleContext {
		public FullEndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fullEnd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterFullEnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitFullEnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitFullEnd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FullEndContext fullEnd() throws RecognitionException {
		FullEndContext _localctx = new FullEndContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_fullEnd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(518);
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

	public static class ArgumentListContext extends ParserRuleContext {
		public List<ReferedExpressionContext> referedExpression() {
			return getRuleContexts(ReferedExpressionContext.class);
		}
		public ReferedExpressionContext referedExpression(int i) {
			return getRuleContext(ReferedExpressionContext.class,i);
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
		enterRule(_localctx, 122, RULE_argumentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(520);
			referedExpression();
			setState(525);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(521);
				match(COMMA);
				setState(522);
				referedExpression();
				}
				}
				setState(527);
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
		enterRule(_localctx, 124, RULE_typeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(528);
			type();
			setState(533);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(529);
				match(COMMA);
				setState(530);
				type();
				}
				}
				setState(535);
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
		enterRule(_localctx, 126, RULE_literal);
		try {
			setState(541);
			switch (_input.LA(1)) {
			case DecimalIntegerLiteral:
			case HexIntegerLiteral:
			case OctalIntegerLiteral:
			case BinaryIntegerLiteral:
			case DecimalFloatingPointLiteral:
			case HexadecimalFloatingPointLiteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(536);
				numberLiteral();
				}
				break;
			case T__96:
			case T__97:
				enterOuterAlt(_localctx, 2);
				{
				setState(537);
				booleanLiteral();
				}
				break;
			case T__98:
				enterOuterAlt(_localctx, 3);
				{
				setState(538);
				characterLiteral();
				}
				break;
			case T__75:
				enterOuterAlt(_localctx, 4);
				{
				setState(539);
				stringLiteral();
				}
				break;
			case T__99:
				enterOuterAlt(_localctx, 5);
				{
				setState(540);
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
		enterRule(_localctx, 128, RULE_numberLiteral);
		try {
			setState(545);
			switch (_input.LA(1)) {
			case DecimalIntegerLiteral:
			case HexIntegerLiteral:
			case OctalIntegerLiteral:
			case BinaryIntegerLiteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(543);
				integerLiteral();
				}
				break;
			case DecimalFloatingPointLiteral:
			case HexadecimalFloatingPointLiteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(544);
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
		enterRule(_localctx, 130, RULE_stringLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(547);
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

	public static class TypeContext extends ParserRuleContext {
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
		enterRule(_localctx, 132, RULE_type);
		try {
			setState(558);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(549);
				primitiveType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(550);
				parameterizedType();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(551);
				simpleType();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(552);
				classOrInterfaceType();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(553);
				arrayType();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(554);
				intersectionType();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(555);
				unionType();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(556);
				wildCardType();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(557);
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
		enterRule(_localctx, 134, RULE_primitiveType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(560);
			_la = _input.LA(1);
			if ( !(((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (T__76 - 77)) | (1L << (T__77 - 77)) | (1L << (T__78 - 77)) | (1L << (T__79 - 77)) | (1L << (T__80 - 77)) | (1L << (T__81 - 77)) | (1L << (T__82 - 77)) | (1L << (T__83 - 77)))) != 0)) ) {
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
		enterRule(_localctx, 136, RULE_simpleType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(562);
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
		enterRule(_localctx, 138, RULE_parameterizedType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(564);
			identifier();
			setState(565);
			match(LT);
			setState(566);
			typeList();
			setState(567);
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

	public static class ClassOrInterfaceTypeContext extends ParserRuleContext {
		public List<ParameterizedTypeContext> parameterizedType() {
			return getRuleContexts(ParameterizedTypeContext.class);
		}
		public ParameterizedTypeContext parameterizedType(int i) {
			return getRuleContext(ParameterizedTypeContext.class,i);
		}
		public List<SimpleTypeContext> simpleType() {
			return getRuleContexts(SimpleTypeContext.class);
		}
		public SimpleTypeContext simpleType(int i) {
			return getRuleContext(SimpleTypeContext.class,i);
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
		enterRule(_localctx, 140, RULE_classOrInterfaceType);
		int _la;
		try {
			setState(585);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(569);
				parameterizedType();
				}
				setState(574);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DOT) {
					{
					{
					setState(570);
					match(DOT);
					setState(571);
					parameterizedType();
					}
					}
					setState(576);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(577);
				simpleType();
				}
				setState(582);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DOT) {
					{
					{
					setState(578);
					match(DOT);
					setState(579);
					simpleType();
					}
					}
					setState(584);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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
		enterRule(_localctx, 142, RULE_arrayType);
		try {
			setState(593);
			switch (_input.LA(1)) {
			case T__76:
			case T__77:
			case T__78:
			case T__79:
			case T__80:
			case T__81:
			case T__82:
			case T__83:
				enterOuterAlt(_localctx, 1);
				{
				setState(587);
				primitiveType();
				setState(588);
				dims();
				}
				break;
			case T__89:
			case T__90:
			case T__91:
			case T__92:
			case T__93:
			case T__94:
			case JavaLetter:
				enterOuterAlt(_localctx, 2);
				{
				setState(590);
				classOrInterfaceType();
				setState(591);
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
		enterRule(_localctx, 144, RULE_dims);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(595);
			match(T__84);
			setState(596);
			match(T__85);
			setState(601);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(597);
					match(T__84);
					setState(598);
					match(T__85);
					}
					} 
				}
				setState(603);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
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
		enterRule(_localctx, 146, RULE_wildCardType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(604);
			match(QUESTION);
			setState(606);
			_la = _input.LA(1);
			if (_la==T__86 || _la==T__87) {
				{
				setState(605);
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

	public static class WildcardBoundsContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
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
		enterRule(_localctx, 148, RULE_wildcardBounds);
		try {
			setState(612);
			switch (_input.LA(1)) {
			case T__86:
				enterOuterAlt(_localctx, 1);
				{
				setState(608);
				match(T__86);
				setState(609);
				type();
				}
				break;
			case T__87:
				enterOuterAlt(_localctx, 2);
				{
				setState(610);
				match(T__87);
				setState(611);
				type();
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
		enterRule(_localctx, 150, RULE_intersectionFirstType);
		try {
			setState(618);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(614);
				classOrInterfaceType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(615);
				primitiveType();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(616);
				arrayType();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(617);
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
		enterRule(_localctx, 152, RULE_intersectionSecondType);
		try {
			setState(625);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(620);
				classOrInterfaceType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(621);
				primitiveType();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(622);
				arrayType();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(623);
				classRef();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(624);
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
		enterRule(_localctx, 154, RULE_intersectionType);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(627);
			intersectionFirstType();
			}
			setState(630); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(628);
					match(BITAND);
					{
					setState(629);
					intersectionSecondType();
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(632); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
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
		enterRule(_localctx, 156, RULE_unionFirstType);
		try {
			setState(638);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(634);
				classOrInterfaceType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(635);
				primitiveType();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(636);
				arrayType();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(637);
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
		enterRule(_localctx, 158, RULE_unionSecondType);
		try {
			setState(645);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(640);
				classOrInterfaceType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(641);
				primitiveType();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(642);
				arrayType();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(643);
				classRef();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(644);
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
		enterRule(_localctx, 160, RULE_unionType);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(647);
			unionFirstType();
			}
			setState(650); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(648);
					match(BITOR);
					{
					setState(649);
					unionSecondType();
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(652); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
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
		public CodeHoleContext codeHole() {
			return getRuleContext(CodeHoleContext.class,0);
		}
		public PreExistContext preExist() {
			return getRuleContext(PreExistContext.class,0);
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
		enterRule(_localctx, 162, RULE_identifier);
		try {
			setState(661);
			switch (_input.LA(1)) {
			case JavaLetter:
				enterOuterAlt(_localctx, 1);
				{
				setState(654);
				idRawLetter();
				}
				break;
			case T__89:
				enterOuterAlt(_localctx, 2);
				{
				setState(655);
				finalFieldRef();
				}
				break;
			case T__90:
				enterOuterAlt(_localctx, 3);
				{
				setState(656);
				finalVarRef();
				}
				break;
			case T__91:
				enterOuterAlt(_localctx, 4);
				{
				setState(657);
				commonFieldRef();
				}
				break;
			case T__92:
				enterOuterAlt(_localctx, 5);
				{
				setState(658);
				commonVarRef();
				}
				break;
			case T__93:
				enterOuterAlt(_localctx, 6);
				{
				setState(659);
				codeHole();
				}
				break;
			case T__94:
				enterOuterAlt(_localctx, 7);
				{
				setState(660);
				preExist();
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
		enterRule(_localctx, 164, RULE_idRawLetter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(663);
			match(JavaLetter);
			setState(667);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==JavaLetterOrDigit) {
				{
				{
				setState(664);
				match(JavaLetterOrDigit);
				}
				}
				setState(669);
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
		enterRule(_localctx, 166, RULE_classRef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(670);
			match(T__88);
			setState(671);
			offset();
			setState(672);
			match(QUESTION);
			setState(673);
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
		enterRule(_localctx, 168, RULE_finalFieldRef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(675);
			match(T__89);
			setState(676);
			offset();
			setState(677);
			match(QUESTION);
			setState(678);
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
		enterRule(_localctx, 170, RULE_finalVarRef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(680);
			match(T__90);
			setState(681);
			offset();
			setState(682);
			match(QUESTION);
			setState(683);
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
		enterRule(_localctx, 172, RULE_commonFieldRef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(685);
			match(T__91);
			setState(686);
			offset();
			setState(687);
			match(QUESTION);
			setState(688);
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
		enterRule(_localctx, 174, RULE_commonVarRef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(690);
			match(T__92);
			setState(691);
			offset();
			setState(692);
			match(QUESTION);
			setState(693);
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
		enterRule(_localctx, 176, RULE_offset);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(695);
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
		enterRule(_localctx, 178, RULE_codeHole);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(697);
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
		enterRule(_localctx, 180, RULE_preExist);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(699);
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
		enterRule(_localctx, 182, RULE_endOfArrayDeclarationIndexExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(701);
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
		enterRule(_localctx, 184, RULE_integerLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(703);
			_la = _input.LA(1);
			if ( !(((((_la - 106)) & ~0x3f) == 0 && ((1L << (_la - 106)) & ((1L << (DecimalIntegerLiteral - 106)) | (1L << (HexIntegerLiteral - 106)) | (1L << (OctalIntegerLiteral - 106)) | (1L << (BinaryIntegerLiteral - 106)))) != 0)) ) {
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
		enterRule(_localctx, 186, RULE_floatingPointLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(705);
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
		enterRule(_localctx, 188, RULE_booleanLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(707);
			_la = _input.LA(1);
			if ( !(_la==T__96 || _la==T__97) ) {
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
		enterRule(_localctx, 190, RULE_characterLiteral);
		try {
			setState(715);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(709);
				match(T__98);
				setState(710);
				match(SingleCharacter);
				setState(711);
				match(T__98);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(712);
				match(T__98);
				setState(713);
				match(EscapeSequence);
				setState(714);
				match(T__98);
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
		enterRule(_localctx, 192, RULE_nullLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(717);
			match(T__99);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnaryOperatorContext extends ParserRuleContext {
		public TerminalNode BANG() { return getToken(Java8Parser.BANG, 0); }
		public TerminalNode TILDE() { return getToken(Java8Parser.TILDE, 0); }
		public TerminalNode INC() { return getToken(Java8Parser.INC, 0); }
		public TerminalNode DEC() { return getToken(Java8Parser.DEC, 0); }
		public TerminalNode ADD() { return getToken(Java8Parser.ADD, 0); }
		public TerminalNode SUB() { return getToken(Java8Parser.SUB, 0); }
		public UnaryOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterUnaryOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitUnaryOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitUnaryOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryOperatorContext unaryOperator() throws RecognitionException {
		UnaryOperatorContext _localctx = new UnaryOperatorContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_unaryOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(719);
			_la = _input.LA(1);
			if ( !(((((_la - 152)) & ~0x3f) == 0 && ((1L << (_la - 152)) & ((1L << (BANG - 152)) | (1L << (TILDE - 152)) | (1L << (INC - 152)) | (1L << (DEC - 152)) | (1L << (ADD - 152)) | (1L << (SUB - 152)))) != 0)) ) {
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
		enterRule(_localctx, 196, RULE_binaryOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(721);
			_la = _input.LA(1);
			if ( !(((((_la - 150)) & ~0x3f) == 0 && ((1L << (_la - 150)) & ((1L << (GT - 150)) | (1L << (LT - 150)) | (1L << (EQUAL - 150)) | (1L << (LE - 150)) | (1L << (GE - 150)) | (1L << (NOTEQUAL - 150)) | (1L << (AND - 150)) | (1L << (OR - 150)) | (1L << (ADD - 150)) | (1L << (SUB - 150)) | (1L << (MUL - 150)) | (1L << (DIV - 150)) | (1L << (BITAND - 150)) | (1L << (BITOR - 150)) | (1L << (CARET - 150)) | (1L << (MOD - 150)) | (1L << (LSHIFT - 150)) | (1L << (RSHIFT - 150)) | (1L << (URSHIFT - 150)))) != 0)) ) {
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
		enterRule(_localctx, 198, RULE_assignmentOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(723);
			_la = _input.LA(1);
			if ( !(((((_la - 176)) & ~0x3f) == 0 && ((1L << (_la - 176)) & ((1L << (ASSIGN - 176)) | (1L << (ADD_ASSIGN - 176)) | (1L << (SUB_ASSIGN - 176)) | (1L << (MUL_ASSIGN - 176)) | (1L << (DIV_ASSIGN - 176)) | (1L << (AND_ASSIGN - 176)) | (1L << (OR_ASSIGN - 176)) | (1L << (XOR_ASSIGN - 176)) | (1L << (MOD_ASSIGN - 176)) | (1L << (LSHIFT_ASSIGN - 176)) | (1L << (RSHIFT_ASSIGN - 176)) | (1L << (URSHIFT_ASSIGN - 176)))) != 0)) ) {
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\u00bd\u02d8\4\2\t"+
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
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\5\2\u00f7\n\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\u0105"+
		"\n\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3"+
		"\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\16"+
		"\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\5\21\u0144"+
		"\n\21\3\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\25"+
		"\3\25\5\25\u0154\n\25\3\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\30\3\31"+
		"\3\31\3\31\5\31\u0162\n\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\35\3\35\3\35\5\35\u0177\n\35\3\35"+
		"\3\35\3\35\3\35\3\36\3\36\3\36\3\36\5\36\u0181\n\36\3\37\3\37\3\37\3\37"+
		"\5\37\u0187\n\37\3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\5\"\u0197"+
		"\n\"\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3%\3%\3%\3&\3&\3&\3&\3&\3\'\3\'\3\'"+
		"\3\'\3\'\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3*\3*\3*\3*\3+\3+\3+\3,\3,\3,\5"+
		",\u01c4\n,\3-\3-\3-\3-\3-\3-\3-\3.\3.\3.\3/\3/\6/\u01d2\n/\r/\16/\u01d3"+
		"\3\60\3\60\6\60\u01d8\n\60\r\60\16\60\u01d9\3\61\3\61\6\61\u01de\n\61"+
		"\r\61\16\61\u01df\3\62\3\62\6\62\u01e4\n\62\r\62\16\62\u01e5\3\63\3\63"+
		"\3\63\3\64\3\64\3\64\3\65\3\65\3\65\3\66\3\66\3\66\3\67\3\67\3\67\38\3"+
		"8\38\39\39\39\3:\3:\3:\3;\3;\3;\3<\3<\5<\u0205\n<\3=\3=\3>\3>\3?\3?\3"+
		"?\7?\u020e\n?\f?\16?\u0211\13?\3@\3@\3@\7@\u0216\n@\f@\16@\u0219\13@\3"+
		"A\3A\3A\3A\3A\5A\u0220\nA\3B\3B\5B\u0224\nB\3C\3C\3D\3D\3D\3D\3D\3D\3"+
		"D\3D\3D\5D\u0231\nD\3E\3E\3F\3F\3G\3G\3G\3G\3G\3H\3H\3H\7H\u023f\nH\f"+
		"H\16H\u0242\13H\3H\3H\3H\7H\u0247\nH\fH\16H\u024a\13H\5H\u024c\nH\3I\3"+
		"I\3I\3I\3I\3I\5I\u0254\nI\3J\3J\3J\3J\7J\u025a\nJ\fJ\16J\u025d\13J\3K"+
		"\3K\5K\u0261\nK\3L\3L\3L\3L\5L\u0267\nL\3M\3M\3M\3M\5M\u026d\nM\3N\3N"+
		"\3N\3N\3N\5N\u0274\nN\3O\3O\3O\6O\u0279\nO\rO\16O\u027a\3P\3P\3P\3P\5"+
		"P\u0281\nP\3Q\3Q\3Q\3Q\3Q\5Q\u0288\nQ\3R\3R\3R\6R\u028d\nR\rR\16R\u028e"+
		"\3S\3S\3S\3S\3S\3S\3S\5S\u0298\nS\3T\3T\7T\u029c\nT\fT\16T\u029f\13T\3"+
		"U\3U\3U\3U\3U\3V\3V\3V\3V\3V\3W\3W\3W\3W\3W\3X\3X\3X\3X\3X\3Y\3Y\3Y\3"+
		"Y\3Y\3Z\3Z\3[\3[\3\\\3\\\3]\3]\3^\3^\3_\3_\3`\3`\3a\3a\3a\3a\3a\3a\5a"+
		"\u02ce\na\3b\3b\3c\3c\3d\3d\3e\3e\3e\2\2f\2\4\6\b\n\f\16\20\22\24\26\30"+
		"\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080"+
		"\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098"+
		"\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0"+
		"\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8"+
		"\2\t\3\2OV\3\2lo\4\2\u0087\u0087\u008d\u008d\3\2cd\4\2\u009a\u009b\u00a4"+
		"\u00a7\5\2\u0098\u0099\u009e\u00a3\u00a6\u00b0\3\2\u00b2\u00bd\u02e5\2"+
		"\u00f6\3\2\2\2\4\u0104\3\2\2\2\6\u0106\3\2\2\2\b\u010b\3\2\2\2\n\u010e"+
		"\3\2\2\2\f\u0114\3\2\2\2\16\u011a\3\2\2\2\20\u011d\3\2\2\2\22\u0121\3"+
		"\2\2\2\24\u0126\3\2\2\2\26\u012b\3\2\2\2\30\u0130\3\2\2\2\32\u0133\3\2"+
		"\2\2\34\u0137\3\2\2\2\36\u013b\3\2\2\2 \u0143\3\2\2\2\"\u0145\3\2\2\2"+
		"$\u0148\3\2\2\2&\u014b\3\2\2\2(\u014e\3\2\2\2*\u0155\3\2\2\2,\u0158\3"+
		"\2\2\2.\u015b\3\2\2\2\60\u015e\3\2\2\2\62\u0166\3\2\2\2\64\u016c\3\2\2"+
		"\2\66\u016f\3\2\2\28\u0173\3\2\2\2:\u017c\3\2\2\2<\u0182\3\2\2\2>\u0188"+
		"\3\2\2\2@\u018d\3\2\2\2B\u0192\3\2\2\2D\u0198\3\2\2\2F\u019d\3\2\2\2H"+
		"\u01a2\3\2\2\2J\u01a5\3\2\2\2L\u01aa\3\2\2\2N\u01af\3\2\2\2P\u01b4\3\2"+
		"\2\2R\u01b9\3\2\2\2T\u01bd\3\2\2\2V\u01c0\3\2\2\2X\u01c5\3\2\2\2Z\u01cc"+
		"\3\2\2\2\\\u01cf\3\2\2\2^\u01d5\3\2\2\2`\u01db\3\2\2\2b\u01e1\3\2\2\2"+
		"d\u01e7\3\2\2\2f\u01ea\3\2\2\2h\u01ed\3\2\2\2j\u01f0\3\2\2\2l\u01f3\3"+
		"\2\2\2n\u01f6\3\2\2\2p\u01f9\3\2\2\2r\u01fc\3\2\2\2t\u01ff\3\2\2\2v\u0204"+
		"\3\2\2\2x\u0206\3\2\2\2z\u0208\3\2\2\2|\u020a\3\2\2\2~\u0212\3\2\2\2\u0080"+
		"\u021f\3\2\2\2\u0082\u0223\3\2\2\2\u0084\u0225\3\2\2\2\u0086\u0230\3\2"+
		"\2\2\u0088\u0232\3\2\2\2\u008a\u0234\3\2\2\2\u008c\u0236\3\2\2\2\u008e"+
		"\u024b\3\2\2\2\u0090\u0253\3\2\2\2\u0092\u0255\3\2\2\2\u0094\u025e\3\2"+
		"\2\2\u0096\u0266\3\2\2\2\u0098\u026c\3\2\2\2\u009a\u0273\3\2\2\2\u009c"+
		"\u0275\3\2\2\2\u009e\u0280\3\2\2\2\u00a0\u0287\3\2\2\2\u00a2\u0289\3\2"+
		"\2\2\u00a4\u0297\3\2\2\2\u00a6\u0299\3\2\2\2\u00a8\u02a0\3\2\2\2\u00aa"+
		"\u02a5\3\2\2\2\u00ac\u02aa\3\2\2\2\u00ae\u02af\3\2\2\2\u00b0\u02b4\3\2"+
		"\2\2\u00b2\u02b9\3\2\2\2\u00b4\u02bb\3\2\2\2\u00b6\u02bd\3\2\2\2\u00b8"+
		"\u02bf\3\2\2\2\u00ba\u02c1\3\2\2\2\u00bc\u02c3\3\2\2\2\u00be\u02c5\3\2"+
		"\2\2\u00c0\u02cd\3\2\2\2\u00c2\u02cf\3\2\2\2\u00c4\u02d1\3\2\2\2\u00c6"+
		"\u02d3\3\2\2\2\u00c8\u02d5\3\2\2\2\u00ca\u00f7\5\"\22\2\u00cb\u00f7\5"+
		"$\23\2\u00cc\u00f7\5&\24\2\u00cd\u00f7\5(\25\2\u00ce\u00f7\5*\26\2\u00cf"+
		"\u00f7\5,\27\2\u00d0\u00f7\5.\30\2\u00d1\u00f7\5\60\31\2\u00d2\u00f7\5"+
		"\62\32\2\u00d3\u00f7\5\64\33\2\u00d4\u00f7\5\66\34\2\u00d5\u00f7\58\35"+
		"\2\u00d6\u00f7\5:\36\2\u00d7\u00f7\5<\37\2\u00d8\u00f7\5> \2\u00d9\u00f7"+
		"\5@!\2\u00da\u00f7\5B\"\2\u00db\u00f7\5D#\2\u00dc\u00f7\5F$\2\u00dd\u00f7"+
		"\5H%\2\u00de\u00f7\5J&\2\u00df\u00f7\5L\'\2\u00e0\u00f7\5N(\2\u00e1\u00f7"+
		"\5P)\2\u00e2\u00f7\5R*\2\u00e3\u00f7\5T+\2\u00e4\u00f7\5V,\2\u00e5\u00f7"+
		"\5X-\2\u00e6\u00f7\5Z.\2\u00e7\u00f7\5\\/\2\u00e8\u00f7\5^\60\2\u00e9"+
		"\u00f7\5`\61\2\u00ea\u00f7\5b\62\2\u00eb\u00f7\5d\63\2\u00ec\u00f7\5f"+
		"\64\2\u00ed\u00f7\5h\65\2\u00ee\u00f7\5j\66\2\u00ef\u00f7\5l\67\2\u00f0"+
		"\u00f7\5n8\2\u00f1\u00f7\5p9\2\u00f2\u00f7\5r:\2\u00f3\u00f7\5t;\2\u00f4"+
		"\u00f7\5v<\2\u00f5\u00f7\5\4\3\2\u00f6\u00ca\3\2\2\2\u00f6\u00cb\3\2\2"+
		"\2\u00f6\u00cc\3\2\2\2\u00f6\u00cd\3\2\2\2\u00f6\u00ce\3\2\2\2\u00f6\u00cf"+
		"\3\2\2\2\u00f6\u00d0\3\2\2\2\u00f6\u00d1\3\2\2\2\u00f6\u00d2\3\2\2\2\u00f6"+
		"\u00d3\3\2\2\2\u00f6\u00d4\3\2\2\2\u00f6\u00d5\3\2\2\2\u00f6\u00d6\3\2"+
		"\2\2\u00f6\u00d7\3\2\2\2\u00f6\u00d8\3\2\2\2\u00f6\u00d9\3\2\2\2\u00f6"+
		"\u00da\3\2\2\2\u00f6\u00db\3\2\2\2\u00f6\u00dc\3\2\2\2\u00f6\u00dd\3\2"+
		"\2\2\u00f6\u00de\3\2\2\2\u00f6\u00df\3\2\2\2\u00f6\u00e0\3\2\2\2\u00f6"+
		"\u00e1\3\2\2\2\u00f6\u00e2\3\2\2\2\u00f6\u00e3\3\2\2\2\u00f6\u00e4\3\2"+
		"\2\2\u00f6\u00e5\3\2\2\2\u00f6\u00e6\3\2\2\2\u00f6\u00e7\3\2\2\2\u00f6"+
		"\u00e8\3\2\2\2\u00f6\u00e9\3\2\2\2\u00f6\u00ea\3\2\2\2\u00f6\u00eb\3\2"+
		"\2\2\u00f6\u00ec\3\2\2\2\u00f6\u00ed\3\2\2\2\u00f6\u00ee\3\2\2\2\u00f6"+
		"\u00ef\3\2\2\2\u00f6\u00f0\3\2\2\2\u00f6\u00f1\3\2\2\2\u00f6\u00f2\3\2"+
		"\2\2\u00f6\u00f3\3\2\2\2\u00f6\u00f4\3\2\2\2\u00f6\u00f5\3\2\2\2\u00f7"+
		"\3\3\2\2\2\u00f8\u0105\5\6\4\2\u00f9\u0105\5\b\5\2\u00fa\u0105\5\n\6\2"+
		"\u00fb\u0105\5\f\7\2\u00fc\u0105\5\16\b\2\u00fd\u0105\5\22\n\2\u00fe\u0105"+
		"\5\24\13\2\u00ff\u0105\5\26\f\2\u0100\u0105\5\30\r\2\u0101\u0105\5\32"+
		"\16\2\u0102\u0105\5\34\17\2\u0103\u0105\5\36\20\2\u0104\u00f8\3\2\2\2"+
		"\u0104\u00f9\3\2\2\2\u0104\u00fa\3\2\2\2\u0104\u00fb\3\2\2\2\u0104\u00fc"+
		"\3\2\2\2\u0104\u00fd\3\2\2\2\u0104\u00fe\3\2\2\2\u0104\u00ff\3\2\2\2\u0104"+
		"\u0100\3\2\2\2\u0104\u0101\3\2\2\2\u0104\u0102\3\2\2\2\u0104\u0103\3\2"+
		"\2\2\u0105\5\3\2\2\2\u0106\u0107\7\3\2\2\u0107\u0108\5 \21\2\u0108\u0109"+
		"\5\u00c8e\2\u0109\u010a\5 \21\2\u010a\7\3\2\2\2\u010b\u010c\7\4\2\2\u010c"+
		"\u010d\5\u0080A\2\u010d\t\3\2\2\2\u010e\u010f\7\5\2\2\u010f\u0110\7\6"+
		"\2\2\u0110\u0111\5\u0086D\2\u0111\u0112\7\7\2\2\u0112\u0113\5 \21\2\u0113"+
		"\13\3\2\2\2\u0114\u0115\7\b\2\2\u0115\u0116\5\u00a4S\2\u0116\u0117\7\6"+
		"\2\2\u0117\u0118\5|?\2\u0118\u0119\7\7\2\2\u0119\r\3\2\2\2\u011a\u011b"+
		"\7\t\2\2\u011b\u011c\5\20\t\2\u011c\17\3\2\2\2\u011d\u011e\5\u00a4S\2"+
		"\u011e\u011f\7\u0097\2\2\u011f\u0120\5 \21\2\u0120\21\3\2\2\2\u0121\u0122"+
		"\7\n\2\2\u0122\u0123\5 \21\2\u0123\u0124\5\u00c6d\2\u0124\u0125\5 \21"+
		"\2\u0125\23\3\2\2\2\u0126\u0127\7\13\2\2\u0127\u0128\5 \21\2\u0128\u0129"+
		"\7\f\2\2\u0129\u012a\5\u0086D\2\u012a\25\3\2\2\2\u012b\u012c\7\r\2\2\u012c"+
		"\u012d\5\u00a4S\2\u012d\u012e\7\u00b1\2\2\u012e\u012f\5 \21\2\u012f\27"+
		"\3\2\2\2\u0130\u0131\7\16\2\2\u0131\u0132\5\u00a4S\2\u0132\31\3\2\2\2"+
		"\u0133\u0134\7\17\2\2\u0134\u0135\5\u00c4c\2\u0135\u0136\5 \21\2\u0136"+
		"\33\3\2\2\2\u0137\u0138\7\20\2\2\u0138\u0139\5 \21\2\u0139\u013a\5\u00c4"+
		"c\2\u013a\35\3\2\2\2\u013b\u013c\7\21\2\2\u013c\u013d\5 \21\2\u013d\u013e"+
		"\7\22\2\2\u013e\u013f\5 \21\2\u013f\37\3\2\2\2\u0140\u0144\5\u00a4S\2"+
		"\u0141\u0144\5\20\t\2\u0142\u0144\5\u0080A\2\u0143\u0140\3\2\2\2\u0143"+
		"\u0141\3\2\2\2\u0143\u0142\3\2\2\2\u0144!\3\2\2\2\u0145\u0146\7\23\2\2"+
		"\u0146\u0147\5\u00a4S\2\u0147#\3\2\2\2\u0148\u0149\7\24\2\2\u0149\u014a"+
		"\5\u00a4S\2\u014a%\3\2\2\2\u014b\u014c\7\25\2\2\u014c\u014d\5\u00a4S\2"+
		"\u014d\'\3\2\2\2\u014e\u014f\7\26\2\2\u014f\u0150\5\u0086D\2\u0150\u0153"+
		"\7\27\2\2\u0151\u0152\7\30\2\2\u0152\u0154\5 \21\2\u0153\u0151\3\2\2\2"+
		"\u0153\u0154\3\2\2\2\u0154)\3\2\2\2\u0155\u0156\7\31\2\2\u0156\u0157\5"+
		"\u00a4S\2\u0157+\3\2\2\2\u0158\u0159\7\32\2\2\u0159\u015a\5\u00a4S\2\u015a"+
		"-\3\2\2\2\u015b\u015c\7\33\2\2\u015c\u015d\5\u00a4S\2\u015d/\3\2\2\2\u015e"+
		"\u015f\7\34\2\2\u015f\u0161\7\6\2\2\u0160\u0162\5~@\2\u0161\u0160\3\2"+
		"\2\2\u0161\u0162\3\2\2\2\u0162\u0163\3\2\2\2\u0163\u0164\7\7\2\2\u0164"+
		"\u0165\5\u00a4S\2\u0165\61\3\2\2\2\u0166\u0167\7\35\2\2\u0167\u0168\5"+
		"\u00a4S\2\u0168\u0169\7\6\2\2\u0169\u016a\5|?\2\u016a\u016b\7\7\2\2\u016b"+
		"\63\3\2\2\2\u016c\u016d\7\36\2\2\u016d\u016e\5\u00a4S\2\u016e\65\3\2\2"+
		"\2\u016f\u0170\7\37\2\2\u0170\u0171\5\u0086D\2\u0171\u0172\5\u0092J\2"+
		"\u0172\67\3\2\2\2\u0173\u0174\7 \2\2\u0174\u0176\7\6\2\2\u0175\u0177\5"+
		"~@\2\u0176\u0175\3\2\2\2\u0176\u0177\3\2\2\2\u0177\u0178\3\2\2\2\u0178"+
		"\u0179\7\7\2\2\u0179\u017a\7!\2\2\u017a\u017b\7\"\2\2\u017b9\3\2\2\2\u017c"+
		"\u017d\7#\2\2\u017d\u0180\7$\2\2\u017e\u017f\7\22\2\2\u017f\u0181\5\u00a4"+
		"S\2\u0180\u017e\3\2\2\2\u0180\u0181\3\2\2\2\u0181;\3\2\2\2\u0182\u0183"+
		"\7%\2\2\u0183\u0186\7&\2\2\u0184\u0185\7\22\2\2\u0185\u0187\5\u00a4S\2"+
		"\u0186\u0184\3\2\2\2\u0186\u0187\3\2\2\2\u0187=\3\2\2\2\u0188\u0189\7"+
		"\'\2\2\u0189\u018a\7(\2\2\u018a\u018b\7\22\2\2\u018b\u018c\5 \21\2\u018c"+
		"?\3\2\2\2\u018d\u018e\7)\2\2\u018e\u018f\7(\2\2\u018f\u0190\7\22\2\2\u0190"+
		"\u0191\5 \21\2\u0191A\3\2\2\2\u0192\u0193\7*\2\2\u0193\u0196\7+\2\2\u0194"+
		"\u0195\7\22\2\2\u0195\u0197\5 \21\2\u0196\u0194\3\2\2\2\u0196\u0197\3"+
		"\2\2\2\u0197C\3\2\2\2\u0198\u0199\7,\2\2\u0199\u019a\7-\2\2\u019a\u019b"+
		"\7\22\2\2\u019b\u019c\5 \21\2\u019cE\3\2\2\2\u019d\u019e\7.\2\2\u019e"+
		"\u019f\7/\2\2\u019f\u01a0\7\22\2\2\u01a0\u01a1\5 \21\2\u01a1G\3\2\2\2"+
		"\u01a2\u01a3\7\60\2\2\u01a3\u01a4\7\30\2\2\u01a4I\3\2\2\2\u01a5\u01a6"+
		"\7\61\2\2\u01a6\u01a7\7\62\2\2\u01a7\u01a8\7\22\2\2\u01a8\u01a9\5 \21"+
		"\2\u01a9K\3\2\2\2\u01aa\u01ab\7\63\2\2\u01ab\u01ac\7\64\2\2\u01ac\u01ad"+
		"\7\22\2\2\u01ad\u01ae\5 \21\2\u01aeM\3\2\2\2\u01af\u01b0\7\65\2\2\u01b0"+
		"\u01b1\7\66\2\2\u01b1\u01b2\7\22\2\2\u01b2\u01b3\5\u0086D\2\u01b3O\3\2"+
		"\2\2\u01b4\u01b5\7\67\2\2\u01b5\u01b6\78\2\2\u01b6\u01b7\7\22\2\2\u01b7"+
		"\u01b8\5 \21\2\u01b8Q\3\2\2\2\u01b9\u01ba\79\2\2\u01ba\u01bb\5\u0086D"+
		"\2\u01bb\u01bc\7:\2\2\u01bcS\3\2\2\2\u01bd\u01be\7;\2\2\u01be\u01bf\7"+
		"<\2\2\u01bfU\3\2\2\2\u01c0\u01c3\7=\2\2\u01c1\u01c2\7\u00b2\2\2\u01c2"+
		"\u01c4\5 \21\2\u01c3\u01c1\3\2\2\2\u01c3\u01c4\3\2\2\2\u01c4W\3\2\2\2"+
		"\u01c5\u01c6\7>\2\2\u01c6\u01c7\7?\2\2\u01c7\u01c8\5\u0086D\2\u01c8\u01c9"+
		"\7\u009d\2\2\u01c9\u01ca\5 \21\2\u01ca\u01cb\7\7\2\2\u01cbY\3\2\2\2\u01cc"+
		"\u01cd\5\4\3\2\u01cd\u01ce\5\u00b8]\2\u01ce[\3\2\2\2\u01cf\u01d1\7@\2"+
		"\2\u01d0\u01d2\7\6\2\2\u01d1\u01d0\3\2\2\2\u01d2\u01d3\3\2\2\2\u01d3\u01d1"+
		"\3\2\2\2\u01d3\u01d4\3\2\2\2\u01d4]\3\2\2\2\u01d5\u01d7\7@\2\2\u01d6\u01d8"+
		"\7\7\2\2\u01d7\u01d6\3\2\2\2\u01d8\u01d9\3\2\2\2\u01d9\u01d7\3\2\2\2\u01d9"+
		"\u01da\3\2\2\2\u01da_\3\2\2\2\u01db\u01dd\7@\2\2\u01dc\u01de\7A\2\2\u01dd"+
		"\u01dc\3\2\2\2\u01de\u01df\3\2\2\2\u01df\u01dd\3\2\2\2\u01df\u01e0\3\2"+
		"\2\2\u01e0a\3\2\2\2\u01e1\u01e3\7@\2\2\u01e2\u01e4\7B\2\2\u01e3\u01e2"+
		"\3\2\2\2\u01e4\u01e5\3\2\2\2\u01e5\u01e3\3\2\2\2\u01e5\u01e6\3\2\2\2\u01e6"+
		"c\3\2\2\2\u01e7\u01e8\7@\2\2\u01e8\u01e9\7C\2\2\u01e9e\3\2\2\2\u01ea\u01eb"+
		"\7@\2\2\u01eb\u01ec\7D\2\2\u01ecg\3\2\2\2\u01ed\u01ee\7@\2\2\u01ee\u01ef"+
		"\7E\2\2\u01efi\3\2\2\2\u01f0\u01f1\7@\2\2\u01f1\u01f2\7F\2\2\u01f2k\3"+
		"\2\2\2\u01f3\u01f4\7@\2\2\u01f4\u01f5\7G\2\2\u01f5m\3\2\2\2\u01f6\u01f7"+
		"\7@\2\2\u01f7\u01f8\7H\2\2\u01f8o\3\2\2\2\u01f9\u01fa\7@\2\2\u01fa\u01fb"+
		"\7I\2\2\u01fbq\3\2\2\2\u01fc\u01fd\7@\2\2\u01fd\u01fe\7J\2\2\u01fes\3"+
		"\2\2\2\u01ff\u0200\7@\2\2\u0200\u0201\7K\2\2\u0201u\3\2\2\2\u0202\u0205"+
		"\5x=\2\u0203\u0205\5z>\2\u0204\u0202\3\2\2\2\u0204\u0203\3\2\2\2\u0205"+
		"w\3\2\2\2\u0206\u0207\7L\2\2\u0207y\3\2\2\2\u0208\u0209\7M\2\2\u0209{"+
		"\3\2\2\2\u020a\u020f\5 \21\2\u020b\u020c\7\u0096\2\2\u020c\u020e\5 \21"+
		"\2\u020d\u020b\3\2\2\2\u020e\u0211\3\2\2\2\u020f\u020d\3\2\2\2\u020f\u0210"+
		"\3\2\2\2\u0210}\3\2\2\2\u0211\u020f\3\2\2\2\u0212\u0217\5\u0086D\2\u0213"+
		"\u0214\7\u0096\2\2\u0214\u0216\5\u0086D\2\u0215\u0213\3\2\2\2\u0216\u0219"+
		"\3\2\2\2\u0217\u0215\3\2\2\2\u0217\u0218\3\2\2\2\u0218\177\3\2\2\2\u0219"+
		"\u0217\3\2\2\2\u021a\u0220\5\u0082B\2\u021b\u0220\5\u00be`\2\u021c\u0220"+
		"\5\u00c0a\2\u021d\u0220\5\u0084C\2\u021e\u0220\5\u00c2b\2\u021f\u021a"+
		"\3\2\2\2\u021f\u021b\3\2\2\2\u021f\u021c\3\2\2\2\u021f\u021d\3\2\2\2\u021f"+
		"\u021e\3\2\2\2\u0220\u0081\3\2\2\2\u0221\u0224\5\u00ba^\2\u0222\u0224"+
		"\5\u00bc_\2\u0223\u0221\3\2\2\2\u0223\u0222\3\2\2\2\u0224\u0083\3\2\2"+
		"\2\u0225\u0226\7N\2\2\u0226\u0085\3\2\2\2\u0227\u0231\5\u0088E\2\u0228"+
		"\u0231\5\u008cG\2\u0229\u0231\5\u008aF\2\u022a\u0231\5\u008eH\2\u022b"+
		"\u0231\5\u0090I\2\u022c\u0231\5\u009cO\2\u022d\u0231\5\u00a2R\2\u022e"+
		"\u0231\5\u0094K\2\u022f\u0231\5\u00a8U\2\u0230\u0227\3\2\2\2\u0230\u0228"+
		"\3\2\2\2\u0230\u0229\3\2\2\2\u0230\u022a\3\2\2\2\u0230\u022b\3\2\2\2\u0230"+
		"\u022c\3\2\2\2\u0230\u022d\3\2\2\2\u0230\u022e\3\2\2\2\u0230\u022f\3\2"+
		"\2\2\u0231\u0087\3\2\2\2\u0232\u0233\t\2\2\2\u0233\u0089\3\2\2\2\u0234"+
		"\u0235\5\u00a4S\2\u0235\u008b\3\2\2\2\u0236\u0237\5\u00a4S\2\u0237\u0238"+
		"\7\u0099\2\2\u0238\u0239\5~@\2\u0239\u023a\7\u0098\2\2\u023a\u008d\3\2"+
		"\2\2\u023b\u0240\5\u008cG\2\u023c\u023d\7\u0097\2\2\u023d\u023f\5\u008c"+
		"G\2\u023e\u023c\3\2\2\2\u023f\u0242\3\2\2\2\u0240\u023e\3\2\2\2\u0240"+
		"\u0241\3\2\2\2\u0241\u024c\3\2\2\2\u0242\u0240\3\2\2\2\u0243\u0248\5\u008a"+
		"F\2\u0244\u0245\7\u0097\2\2\u0245\u0247\5\u008aF\2\u0246\u0244\3\2\2\2"+
		"\u0247\u024a\3\2\2\2\u0248\u0246\3\2\2\2\u0248\u0249\3\2\2\2\u0249\u024c"+
		"\3\2\2\2\u024a\u0248\3\2\2\2\u024b\u023b\3\2\2\2\u024b\u0243\3\2\2\2\u024c"+
		"\u008f\3\2\2\2\u024d\u024e\5\u0088E\2\u024e\u024f\5\u0092J\2\u024f\u0254"+
		"\3\2\2\2\u0250\u0251\5\u008eH\2\u0251\u0252\5\u0092J\2\u0252\u0254\3\2"+
		"\2\2\u0253\u024d\3\2\2\2\u0253\u0250\3\2\2\2\u0254\u0091\3\2\2\2\u0255"+
		"\u0256\7W\2\2\u0256\u025b\7X\2\2\u0257\u0258\7W\2\2\u0258\u025a\7X\2\2"+
		"\u0259\u0257\3\2\2\2\u025a\u025d\3\2\2\2\u025b\u0259\3\2\2\2\u025b\u025c"+
		"\3\2\2\2\u025c\u0093\3\2\2\2\u025d\u025b\3\2\2\2\u025e\u0260\7\u009c\2"+
		"\2\u025f\u0261\5\u0096L\2\u0260\u025f\3\2\2\2\u0260\u0261\3\2\2\2\u0261"+
		"\u0095\3\2\2\2\u0262\u0263\7Y\2\2\u0263\u0267\5\u0086D\2\u0264\u0265\7"+
		"Z\2\2\u0265\u0267\5\u0086D\2\u0266\u0262\3\2\2\2\u0266\u0264\3\2\2\2\u0267"+
		"\u0097\3\2\2\2\u0268\u026d\5\u008eH\2\u0269\u026d\5\u0088E\2\u026a\u026d"+
		"\5\u0090I\2\u026b\u026d\5\u00a8U\2\u026c\u0268\3\2\2\2\u026c\u0269\3\2"+
		"\2\2\u026c\u026a\3\2\2\2\u026c\u026b\3\2\2\2\u026d\u0099\3\2\2\2\u026e"+
		"\u0274\5\u008eH\2\u026f\u0274\5\u0088E\2\u0270\u0274\5\u0090I\2\u0271"+
		"\u0274\5\u00a8U\2\u0272\u0274\5\u00a2R\2\u0273\u026e\3\2\2\2\u0273\u026f"+
		"\3\2\2\2\u0273\u0270\3\2\2\2\u0273\u0271\3\2\2\2\u0273\u0272\3\2\2\2\u0274"+
		"\u009b\3\2\2\2\u0275\u0278\5\u0098M\2\u0276\u0277\7\u00aa\2\2\u0277\u0279"+
		"\5\u009aN\2\u0278\u0276\3\2\2\2\u0279\u027a\3\2\2\2\u027a\u0278\3\2\2"+
		"\2\u027a\u027b\3\2\2\2\u027b\u009d\3\2\2\2\u027c\u0281\5\u008eH\2\u027d"+
		"\u0281\5\u0088E\2\u027e\u0281\5\u0090I\2\u027f\u0281\5\u00a8U\2\u0280"+
		"\u027c\3\2\2\2\u0280\u027d\3\2\2\2\u0280\u027e\3\2\2\2\u0280\u027f\3\2"+
		"\2\2\u0281\u009f\3\2\2\2\u0282\u0288\5\u008eH\2\u0283\u0288\5\u0088E\2"+
		"\u0284\u0288\5\u0090I\2\u0285\u0288\5\u00a8U\2\u0286\u0288\5\u009cO\2"+
		"\u0287\u0282\3\2\2\2\u0287\u0283\3\2\2\2\u0287\u0284\3\2\2\2\u0287\u0285"+
		"\3\2\2\2\u0287\u0286\3\2\2\2\u0288\u00a1\3\2\2\2\u0289\u028c\5\u009eP"+
		"\2\u028a\u028b\7\u00ab\2\2\u028b\u028d\5\u00a0Q\2\u028c\u028a\3\2\2\2"+
		"\u028d\u028e\3\2\2\2\u028e\u028c\3\2\2\2\u028e\u028f\3\2\2\2\u028f\u00a3"+
		"\3\2\2\2\u0290\u0298\5\u00a6T\2\u0291\u0298\5\u00aaV\2\u0292\u0298\5\u00ac"+
		"W\2\u0293\u0298\5\u00aeX\2\u0294\u0298\5\u00b0Y\2\u0295\u0298\5\u00b4"+
		"[\2\u0296\u0298\5\u00b6\\\2\u0297\u0290\3\2\2\2\u0297\u0291\3\2\2\2\u0297"+
		"\u0292\3\2\2\2\u0297\u0293\3\2\2\2\u0297\u0294\3\2\2\2\u0297\u0295\3\2"+
		"\2\2\u0297\u0296\3\2\2\2\u0298\u00a5\3\2\2\2\u0299\u029d\7g\2\2\u029a"+
		"\u029c\7h\2\2\u029b\u029a\3\2\2\2\u029c\u029f\3\2\2\2\u029d\u029b\3\2"+
		"\2\2\u029d\u029e\3\2\2\2\u029e\u00a7\3\2\2\2\u029f\u029d\3\2\2\2\u02a0"+
		"\u02a1\7[\2\2\u02a1\u02a2\5\u00b2Z\2\u02a2\u02a3\7\u009c\2\2\u02a3\u02a4"+
		"\5\u00b2Z\2\u02a4\u00a9\3\2\2\2\u02a5\u02a6\7\\\2\2\u02a6\u02a7\5\u00b2"+
		"Z\2\u02a7\u02a8\7\u009c\2\2\u02a8\u02a9\5\u00b2Z\2\u02a9\u00ab\3\2\2\2"+
		"\u02aa\u02ab\7]\2\2\u02ab\u02ac\5\u00b2Z\2\u02ac\u02ad\7\u009c\2\2\u02ad"+
		"\u02ae\5\u00b2Z\2\u02ae\u00ad\3\2\2\2\u02af\u02b0\7^\2\2\u02b0\u02b1\5"+
		"\u00b2Z\2\u02b1\u02b2\7\u009c\2\2\u02b2\u02b3\5\u00b2Z\2\u02b3\u00af\3"+
		"\2\2\2\u02b4\u02b5\7_\2\2\u02b5\u02b6\5\u00b2Z\2\u02b6\u02b7\7\u009c\2"+
		"\2\u02b7\u02b8\5\u00b2Z\2\u02b8\u00b1\3\2\2\2\u02b9\u02ba\7i\2\2\u02ba"+
		"\u00b3\3\2\2\2\u02bb\u02bc\7`\2\2\u02bc\u00b5\3\2\2\2\u02bd\u02be\7a\2"+
		"\2\u02be\u00b7\3\2\2\2\u02bf\u02c0\7b\2\2\u02c0\u00b9\3\2\2\2\u02c1\u02c2"+
		"\t\3\2\2\u02c2\u00bb\3\2\2\2\u02c3\u02c4\t\4\2\2\u02c4\u00bd\3\2\2\2\u02c5"+
		"\u02c6\t\5\2\2\u02c6\u00bf\3\2\2\2\u02c7\u02c8\7e\2\2\u02c8\u02c9\7\u0091"+
		"\2\2\u02c9\u02ce\7e\2\2\u02ca\u02cb\7e\2\2\u02cb\u02cc\7\u0092\2\2\u02cc"+
		"\u02ce\7e\2\2\u02cd\u02c7\3\2\2\2\u02cd\u02ca\3\2\2\2\u02ce\u00c1\3\2"+
		"\2\2\u02cf\u02d0\7f\2\2\u02d0\u00c3\3\2\2\2\u02d1\u02d2\t\6\2\2\u02d2"+
		"\u00c5\3\2\2\2\u02d3\u02d4\t\7\2\2\u02d4\u00c7\3\2\2\2\u02d5\u02d6\t\b"+
		"\2\2\u02d6\u00c9\3\2\2\2&\u00f6\u0104\u0143\u0153\u0161\u0176\u0180\u0186"+
		"\u0196\u01c3\u01d3\u01d9\u01df\u01e5\u0204\u020f\u0217\u021f\u0223\u0230"+
		"\u0240\u0248\u024b\u0253\u025b\u0260\u0266\u026c\u0273\u027a\u0280\u0287"+
		"\u028e\u0297\u029d\u02cd";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}