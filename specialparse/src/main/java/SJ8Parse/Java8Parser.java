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
		T__0=1, T__1=2, AT=3, MD=4, CD=5, ClassRef=6, FinalFieldRef=7, FinalVarRef=8, 
		CommonFieldRef=9, CommonVarRef=10, NoDeclaredType=11, CodeHole=12, ElseStatement=13, 
		ASSERT=14, BOOLEAN=15, BREAK=16, BYTE=17, CASE=18, CATCH=19, CHAR=20, 
		CLASS=21, CONTINUE=22, DEFAULT=23, DO=24, DOUBLE=25, ELSE=26, FINAL=27, 
		FINALLY=28, FLOAT=29, FOR=30, IF=31, GOTO=32, INSTANCEOF=33, INT=34, INTERFACE=35, 
		LONG=36, NEW=37, RETURN=38, SHORT=39, SUPER=40, SWITCH=41, SYNCHRONIZED=42, 
		THIS=43, THROW=44, THROWS=45, TRY=46, WHILE=47, NumberLiteral=48, BooleanLiteral=49, 
		CharacterLiteral=50, StringLiteral=51, NullLiteral=52, LPAREN=53, RPAREN=54, 
		LBRACE=55, RBRACE=56, LBRACK=57, RBRACK=58, COMMA=59, DOT=60, ASSIGN=61, 
		GT=62, LT=63, BANG=64, TILDE=65, QUESTION=66, COLON=67, EQUAL=68, LE=69, 
		GE=70, NOTEQUAL=71, AND=72, OR=73, INC=74, DEC=75, ADD=76, SUB=77, MUL=78, 
		DIV=79, BITAND=80, BITOR=81, CARET=82, MOD=83, ARROW=84, COLONCOLON=85, 
		ADD_ASSIGN=86, SUB_ASSIGN=87, MUL_ASSIGN=88, DIV_ASSIGN=89, AND_ASSIGN=90, 
		OR_ASSIGN=91, XOR_ASSIGN=92, MOD_ASSIGN=93, LSHIFT_ASSIGN=94, RSHIFT_ASSIGN=95, 
		URSHIFT_ASSIGN=96, Identifier=97, WS=98;
	public static final int
		RULE_literal = 0, RULE_type = 1, RULE_primitiveType = 2, RULE_numericType = 3, 
		RULE_integralType = 4, RULE_floatingPointType = 5, RULE_referenceType = 6, 
		RULE_classOrInterfaceType = 7, RULE_classType = 8, RULE_classType_lf_classOrInterfaceType = 9, 
		RULE_classType_lfno_classOrInterfaceType = 10, RULE_interfaceType = 11, 
		RULE_interfaceType_lf_classOrInterfaceType = 12, RULE_interfaceType_lfno_classOrInterfaceType = 13, 
		RULE_arrayType = 14, RULE_dims = 15, RULE_typeParameter = 16, RULE_typeBound = 17, 
		RULE_additionalBound = 18, RULE_typeArguments = 19, RULE_typeArgumentList = 20, 
		RULE_typeArgument = 21, RULE_wildcard = 22, RULE_wildcardBounds = 23, 
		RULE_typeName = 24, RULE_packageOrTypeName = 25, RULE_expressionName = 26, 
		RULE_methodName = 27, RULE_ambiguousName = 28, RULE_typeDeclaration = 29, 
		RULE_typeParameters = 30, RULE_typeParameterList = 31, RULE_variableDeclaratorList = 32, 
		RULE_variableDeclarator = 33, RULE_variableDeclaratorId = 34, RULE_variableInitializer = 35, 
		RULE_unannType = 36, RULE_unannPrimitiveType = 37, RULE_unannReferenceType = 38, 
		RULE_unannClassOrInterfaceType = 39, RULE_unannClassType = 40, RULE_unannClassType_lf_unannClassOrInterfaceType = 41, 
		RULE_unannClassType_lfno_unannClassOrInterfaceType = 42, RULE_unannInterfaceType = 43, 
		RULE_unannInterfaceType_lf_unannClassOrInterfaceType = 44, RULE_unannInterfaceType_lfno_unannClassOrInterfaceType = 45, 
		RULE_unannTypeVariable = 46, RULE_unannArrayType = 47, RULE_methodDeclaration = 48, 
		RULE_formalParameters = 49, RULE_formalParameter = 50, RULE_receiverParameter = 51, 
		RULE_exceptionTypeList = 52, RULE_exceptionType = 53, RULE_simpleTypeName = 54, 
		RULE_explicitConstructorInvocation = 55, RULE_localVariableDeclarationStatement = 56, 
		RULE_localVariableDeclaration = 57, RULE_statement = 58, RULE_statementWithoutTrailingSubstatement = 59, 
		RULE_labeledStatement = 60, RULE_expressionStatement = 61, RULE_statementExpression = 62, 
		RULE_ifStatement = 63, RULE_assertStatement = 64, RULE_switchStatement = 65, 
		RULE_caseStatement = 66, RULE_whileStatement = 67, RULE_doStatement = 68, 
		RULE_forStatement = 69, RULE_breakStatement = 70, RULE_continueStatement = 71, 
		RULE_returnStatement = 72, RULE_throwStatement = 73, RULE_synchronizedStatement = 74, 
		RULE_tryStatement = 75, RULE_catchClause = 76, RULE_catchFormalParameter = 77, 
		RULE_catchType = 78, RULE_resource = 79, RULE_primary = 80, RULE_primaryNoNewArray = 81, 
		RULE_primaryNoNewArray_lf_arrayAccess = 82, RULE_primaryNoNewArray_lfno_arrayAccess = 83, 
		RULE_primaryNoNewArray_lf_primary = 84, RULE_primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary = 85, 
		RULE_primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary = 86, RULE_primaryNoNewArray_lfno_primary = 87, 
		RULE_primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary = 88, 
		RULE_primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary = 89, 
		RULE_classInstanceCreationExpression = 90, RULE_classInstanceCreationExpression_lf_primary = 91, 
		RULE_classInstanceCreationExpression_lfno_primary = 92, RULE_typeArgumentsOrDiamond = 93, 
		RULE_fieldAccess = 94, RULE_fieldAccess_lf_primary = 95, RULE_fieldAccess_lfno_primary = 96, 
		RULE_arrayAccess = 97, RULE_arrayAccess_lf_primary = 98, RULE_arrayAccess_lfno_primary = 99, 
		RULE_methodInvocation = 100, RULE_methodInvocation_lf_primary = 101, RULE_methodInvocation_lfno_primary = 102, 
		RULE_argumentList = 103, RULE_methodReference = 104, RULE_methodReference_lf_primary = 105, 
		RULE_methodReference_lfno_primary = 106, RULE_arrayCreationExpression = 107, 
		RULE_arrayInitializer = 108, RULE_variableInitializerList = 109, RULE_dimExprs = 110, 
		RULE_dimExpr = 111, RULE_constantExpression = 112, RULE_expression = 113, 
		RULE_lambdaExpression = 114, RULE_lambdaParameters = 115, RULE_lambdaBody = 116, 
		RULE_assignmentExpression = 117, RULE_assignment = 118, RULE_leftHandSide = 119, 
		RULE_assignmentOperator = 120, RULE_conditionalExpression = 121, RULE_conditionalOrExpression = 122, 
		RULE_conditionalAndExpression = 123, RULE_inclusiveOrExpression = 124, 
		RULE_exclusiveOrExpression = 125, RULE_andExpression = 126, RULE_equalityExpression = 127, 
		RULE_relationalExpression = 128, RULE_shiftExpression = 129, RULE_additiveExpression = 130, 
		RULE_multiplicativeExpression = 131, RULE_unaryExpression = 132, RULE_preIncrementExpression = 133, 
		RULE_preDecrementExpression = 134, RULE_unaryExpressionNotPlusMinus = 135, 
		RULE_postfixExpression = 136, RULE_postIncrementExpression = 137, RULE_postIncrementExpression_lf_postfixExpression = 138, 
		RULE_postDecrementExpression = 139, RULE_postDecrementExpression_lf_postfixExpression = 140, 
		RULE_castExpression = 141, RULE_additionalBoundOrClassRef = 142;
	public static final String[] ruleNames = {
		"literal", "type", "primitiveType", "numericType", "integralType", "floatingPointType", 
		"referenceType", "classOrInterfaceType", "classType", "classType_lf_classOrInterfaceType", 
		"classType_lfno_classOrInterfaceType", "interfaceType", "interfaceType_lf_classOrInterfaceType", 
		"interfaceType_lfno_classOrInterfaceType", "arrayType", "dims", "typeParameter", 
		"typeBound", "additionalBound", "typeArguments", "typeArgumentList", "typeArgument", 
		"wildcard", "wildcardBounds", "typeName", "packageOrTypeName", "expressionName", 
		"methodName", "ambiguousName", "typeDeclaration", "typeParameters", "typeParameterList", 
		"variableDeclaratorList", "variableDeclarator", "variableDeclaratorId", 
		"variableInitializer", "unannType", "unannPrimitiveType", "unannReferenceType", 
		"unannClassOrInterfaceType", "unannClassType", "unannClassType_lf_unannClassOrInterfaceType", 
		"unannClassType_lfno_unannClassOrInterfaceType", "unannInterfaceType", 
		"unannInterfaceType_lf_unannClassOrInterfaceType", "unannInterfaceType_lfno_unannClassOrInterfaceType", 
		"unannTypeVariable", "unannArrayType", "methodDeclaration", "formalParameters", 
		"formalParameter", "receiverParameter", "exceptionTypeList", "exceptionType", 
		"simpleTypeName", "explicitConstructorInvocation", "localVariableDeclarationStatement", 
		"localVariableDeclaration", "statement", "statementWithoutTrailingSubstatement", 
		"labeledStatement", "expressionStatement", "statementExpression", "ifStatement", 
		"assertStatement", "switchStatement", "caseStatement", "whileStatement", 
		"doStatement", "forStatement", "breakStatement", "continueStatement", 
		"returnStatement", "throwStatement", "synchronizedStatement", "tryStatement", 
		"catchClause", "catchFormalParameter", "catchType", "resource", "primary", 
		"primaryNoNewArray", "primaryNoNewArray_lf_arrayAccess", "primaryNoNewArray_lfno_arrayAccess", 
		"primaryNoNewArray_lf_primary", "primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary", 
		"primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary", "primaryNoNewArray_lfno_primary", 
		"primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary", "primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary", 
		"classInstanceCreationExpression", "classInstanceCreationExpression_lf_primary", 
		"classInstanceCreationExpression_lfno_primary", "typeArgumentsOrDiamond", 
		"fieldAccess", "fieldAccess_lf_primary", "fieldAccess_lfno_primary", "arrayAccess", 
		"arrayAccess_lf_primary", "arrayAccess_lfno_primary", "methodInvocation", 
		"methodInvocation_lf_primary", "methodInvocation_lfno_primary", "argumentList", 
		"methodReference", "methodReference_lf_primary", "methodReference_lfno_primary", 
		"arrayCreationExpression", "arrayInitializer", "variableInitializerList", 
		"dimExprs", "dimExpr", "constantExpression", "expression", "lambdaExpression", 
		"lambdaParameters", "lambdaBody", "assignmentExpression", "assignment", 
		"leftHandSide", "assignmentOperator", "conditionalExpression", "conditionalOrExpression", 
		"conditionalAndExpression", "inclusiveOrExpression", "exclusiveOrExpression", 
		"andExpression", "equalityExpression", "relationalExpression", "shiftExpression", 
		"additiveExpression", "multiplicativeExpression", "unaryExpression", "preIncrementExpression", 
		"preDecrementExpression", "unaryExpressionNotPlusMinus", "postfixExpression", 
		"postIncrementExpression", "postIncrementExpression_lf_postfixExpression", 
		"postDecrementExpression", "postDecrementExpression_lf_postfixExpression", 
		"castExpression", "additionalBoundOrClassRef"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'extends'", "'void'", "'@'", "'MD'", "'CD'", null, null, null, 
		null, null, null, null, null, "'assert'", "'boolean'", "'break'", "'byte'", 
		"'case'", "'catch'", "'char'", "'class'", "'continue'", "'default'", "'do'", 
		"'double'", null, "'final'", "'finally'", "'float'", "'for'", "'if'", 
		"'goto'", "'instanceof'", "'int'", "'interface'", "'long'", "'new'", "'return'", 
		"'short'", "'super'", "'switch'", "'synchronized'", "'this'", "'throw'", 
		"'throws'", "'try'", "'while'", null, null, null, null, null, "'('", "')'", 
		"'{'", "'}'", "'['", "']'", "','", "'.'", "'='", "'>'", "'<'", "'!'", 
		"'~'", "'?'", "':'", "'=='", "'<='", "'>='", "'!='", "'&&'", "'||'", "'++'", 
		"'--'", "'+'", "'-'", "'*'", "'/'", "'&'", "'|'", "'^'", "'%'", "'->'", 
		"'::'", "'+='", "'-='", "'*='", "'/='", "'&='", "'|='", "'^='", "'%='", 
		"'<<='", "'>>='", "'>>>='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, "AT", "MD", "CD", "ClassRef", "FinalFieldRef", "FinalVarRef", 
		"CommonFieldRef", "CommonVarRef", "NoDeclaredType", "CodeHole", "ElseStatement", 
		"ASSERT", "BOOLEAN", "BREAK", "BYTE", "CASE", "CATCH", "CHAR", "CLASS", 
		"CONTINUE", "DEFAULT", "DO", "DOUBLE", "ELSE", "FINAL", "FINALLY", "FLOAT", 
		"FOR", "IF", "GOTO", "INSTANCEOF", "INT", "INTERFACE", "LONG", "NEW", 
		"RETURN", "SHORT", "SUPER", "SWITCH", "SYNCHRONIZED", "THIS", "THROW", 
		"THROWS", "TRY", "WHILE", "NumberLiteral", "BooleanLiteral", "CharacterLiteral", 
		"StringLiteral", "NullLiteral", "LPAREN", "RPAREN", "LBRACE", "RBRACE", 
		"LBRACK", "RBRACK", "COMMA", "DOT", "ASSIGN", "GT", "LT", "BANG", "TILDE", 
		"QUESTION", "COLON", "EQUAL", "LE", "GE", "NOTEQUAL", "AND", "OR", "INC", 
		"DEC", "ADD", "SUB", "MUL", "DIV", "BITAND", "BITOR", "CARET", "MOD", 
		"ARROW", "COLONCOLON", "ADD_ASSIGN", "SUB_ASSIGN", "MUL_ASSIGN", "DIV_ASSIGN", 
		"AND_ASSIGN", "OR_ASSIGN", "XOR_ASSIGN", "MOD_ASSIGN", "LSHIFT_ASSIGN", 
		"RSHIFT_ASSIGN", "URSHIFT_ASSIGN", "Identifier", "WS"
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
	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode NumberLiteral() { return getToken(Java8Parser.NumberLiteral, 0); }
		public TerminalNode BooleanLiteral() { return getToken(Java8Parser.BooleanLiteral, 0); }
		public TerminalNode CharacterLiteral() { return getToken(Java8Parser.CharacterLiteral, 0); }
		public TerminalNode StringLiteral() { return getToken(Java8Parser.StringLiteral, 0); }
		public TerminalNode NullLiteral() { return getToken(Java8Parser.NullLiteral, 0); }
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
		enterRule(_localctx, 0, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(286);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NumberLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral))) != 0)) ) {
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

	public static class TypeContext extends ParserRuleContext {
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public ReferenceTypeContext referenceType() {
			return getRuleContext(ReferenceTypeContext.class,0);
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
		enterRule(_localctx, 2, RULE_type);
		try {
			setState(290);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(288);
				primitiveType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(289);
				referenceType();
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
		public NumericTypeContext numericType() {
			return getRuleContext(NumericTypeContext.class,0);
		}
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
		enterRule(_localctx, 4, RULE_primitiveType);
		try {
			setState(294);
			switch (_input.LA(1)) {
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
				enterOuterAlt(_localctx, 1);
				{
				setState(292);
				numericType();
				}
				break;
			case BOOLEAN:
				enterOuterAlt(_localctx, 2);
				{
				setState(293);
				match(BOOLEAN);
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

	public static class NumericTypeContext extends ParserRuleContext {
		public IntegralTypeContext integralType() {
			return getRuleContext(IntegralTypeContext.class,0);
		}
		public FloatingPointTypeContext floatingPointType() {
			return getRuleContext(FloatingPointTypeContext.class,0);
		}
		public NumericTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numericType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterNumericType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitNumericType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitNumericType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumericTypeContext numericType() throws RecognitionException {
		NumericTypeContext _localctx = new NumericTypeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_numericType);
		try {
			setState(298);
			switch (_input.LA(1)) {
			case BYTE:
			case CHAR:
			case INT:
			case LONG:
			case SHORT:
				enterOuterAlt(_localctx, 1);
				{
				setState(296);
				integralType();
				}
				break;
			case DOUBLE:
			case FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(297);
				floatingPointType();
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

	public static class IntegralTypeContext extends ParserRuleContext {
		public IntegralTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integralType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterIntegralType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitIntegralType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitIntegralType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntegralTypeContext integralType() throws RecognitionException {
		IntegralTypeContext _localctx = new IntegralTypeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_integralType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(300);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BYTE) | (1L << CHAR) | (1L << INT) | (1L << LONG) | (1L << SHORT))) != 0)) ) {
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

	public static class FloatingPointTypeContext extends ParserRuleContext {
		public FloatingPointTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_floatingPointType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterFloatingPointType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitFloatingPointType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitFloatingPointType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FloatingPointTypeContext floatingPointType() throws RecognitionException {
		FloatingPointTypeContext _localctx = new FloatingPointTypeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_floatingPointType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(302);
			_la = _input.LA(1);
			if ( !(_la==DOUBLE || _la==FLOAT) ) {
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

	public static class ReferenceTypeContext extends ParserRuleContext {
		public ClassOrInterfaceTypeContext classOrInterfaceType() {
			return getRuleContext(ClassOrInterfaceTypeContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public ArrayTypeContext arrayType() {
			return getRuleContext(ArrayTypeContext.class,0);
		}
		public ReferenceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_referenceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterReferenceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitReferenceType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitReferenceType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReferenceTypeContext referenceType() throws RecognitionException {
		ReferenceTypeContext _localctx = new ReferenceTypeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_referenceType);
		try {
			setState(307);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(304);
				classOrInterfaceType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(305);
				match(Identifier);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(306);
				arrayType();
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
		public ClassType_lfno_classOrInterfaceTypeContext classType_lfno_classOrInterfaceType() {
			return getRuleContext(ClassType_lfno_classOrInterfaceTypeContext.class,0);
		}
		public InterfaceType_lfno_classOrInterfaceTypeContext interfaceType_lfno_classOrInterfaceType() {
			return getRuleContext(InterfaceType_lfno_classOrInterfaceTypeContext.class,0);
		}
		public List<ClassType_lf_classOrInterfaceTypeContext> classType_lf_classOrInterfaceType() {
			return getRuleContexts(ClassType_lf_classOrInterfaceTypeContext.class);
		}
		public ClassType_lf_classOrInterfaceTypeContext classType_lf_classOrInterfaceType(int i) {
			return getRuleContext(ClassType_lf_classOrInterfaceTypeContext.class,i);
		}
		public List<InterfaceType_lf_classOrInterfaceTypeContext> interfaceType_lf_classOrInterfaceType() {
			return getRuleContexts(InterfaceType_lf_classOrInterfaceTypeContext.class);
		}
		public InterfaceType_lf_classOrInterfaceTypeContext interfaceType_lf_classOrInterfaceType(int i) {
			return getRuleContext(InterfaceType_lf_classOrInterfaceTypeContext.class,i);
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
		enterRule(_localctx, 14, RULE_classOrInterfaceType);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(311);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(309);
				classType_lfno_classOrInterfaceType();
				}
				break;
			case 2:
				{
				setState(310);
				interfaceType_lfno_classOrInterfaceType();
				}
				break;
			}
			setState(317);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(315);
					switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
					case 1:
						{
						setState(313);
						classType_lf_classOrInterfaceType();
						}
						break;
					case 2:
						{
						setState(314);
						interfaceType_lf_classOrInterfaceType();
						}
						break;
					}
					} 
				}
				setState(319);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
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

	public static class ClassTypeContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public ClassOrInterfaceTypeContext classOrInterfaceType() {
			return getRuleContext(ClassOrInterfaceTypeContext.class,0);
		}
		public ClassTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterClassType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitClassType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitClassType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassTypeContext classType() throws RecognitionException {
		ClassTypeContext _localctx = new ClassTypeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_classType);
		int _la;
		try {
			setState(330);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(320);
				match(Identifier);
				setState(322);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(321);
					typeArguments();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(324);
				classOrInterfaceType();
				setState(325);
				match(DOT);
				setState(326);
				match(Identifier);
				setState(328);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(327);
					typeArguments();
					}
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

	public static class ClassType_lf_classOrInterfaceTypeContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public ClassType_lf_classOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classType_lf_classOrInterfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterClassType_lf_classOrInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitClassType_lf_classOrInterfaceType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitClassType_lf_classOrInterfaceType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassType_lf_classOrInterfaceTypeContext classType_lf_classOrInterfaceType() throws RecognitionException {
		ClassType_lf_classOrInterfaceTypeContext _localctx = new ClassType_lf_classOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_classType_lf_classOrInterfaceType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(332);
			match(DOT);
			setState(333);
			match(Identifier);
			setState(335);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(334);
				typeArguments();
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

	public static class ClassType_lfno_classOrInterfaceTypeContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public ClassType_lfno_classOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classType_lfno_classOrInterfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterClassType_lfno_classOrInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitClassType_lfno_classOrInterfaceType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitClassType_lfno_classOrInterfaceType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassType_lfno_classOrInterfaceTypeContext classType_lfno_classOrInterfaceType() throws RecognitionException {
		ClassType_lfno_classOrInterfaceTypeContext _localctx = new ClassType_lfno_classOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_classType_lfno_classOrInterfaceType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(337);
			match(Identifier);
			setState(339);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(338);
				typeArguments();
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

	public static class InterfaceTypeContext extends ParserRuleContext {
		public ClassTypeContext classType() {
			return getRuleContext(ClassTypeContext.class,0);
		}
		public InterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitInterfaceType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitInterfaceType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceTypeContext interfaceType() throws RecognitionException {
		InterfaceTypeContext _localctx = new InterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_interfaceType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(341);
			classType();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceType_lf_classOrInterfaceTypeContext extends ParserRuleContext {
		public ClassType_lf_classOrInterfaceTypeContext classType_lf_classOrInterfaceType() {
			return getRuleContext(ClassType_lf_classOrInterfaceTypeContext.class,0);
		}
		public InterfaceType_lf_classOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceType_lf_classOrInterfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterInterfaceType_lf_classOrInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitInterfaceType_lf_classOrInterfaceType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitInterfaceType_lf_classOrInterfaceType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceType_lf_classOrInterfaceTypeContext interfaceType_lf_classOrInterfaceType() throws RecognitionException {
		InterfaceType_lf_classOrInterfaceTypeContext _localctx = new InterfaceType_lf_classOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_interfaceType_lf_classOrInterfaceType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(343);
			classType_lf_classOrInterfaceType();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceType_lfno_classOrInterfaceTypeContext extends ParserRuleContext {
		public ClassType_lfno_classOrInterfaceTypeContext classType_lfno_classOrInterfaceType() {
			return getRuleContext(ClassType_lfno_classOrInterfaceTypeContext.class,0);
		}
		public InterfaceType_lfno_classOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceType_lfno_classOrInterfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterInterfaceType_lfno_classOrInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitInterfaceType_lfno_classOrInterfaceType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitInterfaceType_lfno_classOrInterfaceType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceType_lfno_classOrInterfaceTypeContext interfaceType_lfno_classOrInterfaceType() throws RecognitionException {
		InterfaceType_lfno_classOrInterfaceTypeContext _localctx = new InterfaceType_lfno_classOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_interfaceType_lfno_classOrInterfaceType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(345);
			classType_lfno_classOrInterfaceType();
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
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
		enterRule(_localctx, 28, RULE_arrayType);
		try {
			setState(355);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(347);
				primitiveType();
				setState(348);
				dims();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(350);
				classOrInterfaceType();
				setState(351);
				dims();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(353);
				match(Identifier);
				setState(354);
				dims();
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
		enterRule(_localctx, 30, RULE_dims);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(357);
			match(LBRACK);
			setState(358);
			match(RBRACK);
			setState(363);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(359);
					match(LBRACK);
					setState(360);
					match(RBRACK);
					}
					} 
				}
				setState(365);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
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

	public static class TypeParameterContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public TypeBoundContext typeBound() {
			return getRuleContext(TypeBoundContext.class,0);
		}
		public TypeParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterTypeParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitTypeParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitTypeParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeParameterContext typeParameter() throws RecognitionException {
		TypeParameterContext _localctx = new TypeParameterContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_typeParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(366);
			match(Identifier);
			setState(368);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(367);
				typeBound();
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

	public static class TypeBoundContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public ClassOrInterfaceTypeContext classOrInterfaceType() {
			return getRuleContext(ClassOrInterfaceTypeContext.class,0);
		}
		public List<AdditionalBoundContext> additionalBound() {
			return getRuleContexts(AdditionalBoundContext.class);
		}
		public AdditionalBoundContext additionalBound(int i) {
			return getRuleContext(AdditionalBoundContext.class,i);
		}
		public TypeBoundContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeBound; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterTypeBound(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitTypeBound(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitTypeBound(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeBoundContext typeBound() throws RecognitionException {
		TypeBoundContext _localctx = new TypeBoundContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_typeBound);
		int _la;
		try {
			setState(380);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(370);
				match(T__0);
				setState(371);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(372);
				match(T__0);
				setState(373);
				classOrInterfaceType();
				setState(377);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==BITAND) {
					{
					{
					setState(374);
					additionalBound();
					}
					}
					setState(379);
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

	public static class AdditionalBoundContext extends ParserRuleContext {
		public InterfaceTypeContext interfaceType() {
			return getRuleContext(InterfaceTypeContext.class,0);
		}
		public AdditionalBoundContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additionalBound; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterAdditionalBound(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitAdditionalBound(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitAdditionalBound(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AdditionalBoundContext additionalBound() throws RecognitionException {
		AdditionalBoundContext _localctx = new AdditionalBoundContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_additionalBound);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(382);
			match(BITAND);
			setState(383);
			interfaceType();
			}
		}
		catch (RecognitionException re) {
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
		public TypeArgumentListContext typeArgumentList() {
			return getRuleContext(TypeArgumentListContext.class,0);
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
		enterRule(_localctx, 38, RULE_typeArguments);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(385);
			match(LT);
			setState(386);
			typeArgumentList();
			setState(387);
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

	public static class TypeArgumentListContext extends ParserRuleContext {
		public List<TypeArgumentContext> typeArgument() {
			return getRuleContexts(TypeArgumentContext.class);
		}
		public TypeArgumentContext typeArgument(int i) {
			return getRuleContext(TypeArgumentContext.class,i);
		}
		public TypeArgumentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArgumentList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterTypeArgumentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitTypeArgumentList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitTypeArgumentList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeArgumentListContext typeArgumentList() throws RecognitionException {
		TypeArgumentListContext _localctx = new TypeArgumentListContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_typeArgumentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(389);
			typeArgument();
			setState(394);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(390);
				match(COMMA);
				setState(391);
				typeArgument();
				}
				}
				setState(396);
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

	public static class TypeArgumentContext extends ParserRuleContext {
		public ReferenceTypeContext referenceType() {
			return getRuleContext(ReferenceTypeContext.class,0);
		}
		public TerminalNode ClassRef() { return getToken(Java8Parser.ClassRef, 0); }
		public WildcardContext wildcard() {
			return getRuleContext(WildcardContext.class,0);
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
		enterRule(_localctx, 42, RULE_typeArgument);
		try {
			setState(400);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(397);
				referenceType();
				}
				break;
			case ClassRef:
				enterOuterAlt(_localctx, 2);
				{
				setState(398);
				match(ClassRef);
				}
				break;
			case QUESTION:
				enterOuterAlt(_localctx, 3);
				{
				setState(399);
				wildcard();
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

	public static class WildcardContext extends ParserRuleContext {
		public WildcardBoundsContext wildcardBounds() {
			return getRuleContext(WildcardBoundsContext.class,0);
		}
		public WildcardContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wildcard; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterWildcard(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitWildcard(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitWildcard(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WildcardContext wildcard() throws RecognitionException {
		WildcardContext _localctx = new WildcardContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_wildcard);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(402);
			match(QUESTION);
			setState(404);
			_la = _input.LA(1);
			if (_la==T__0 || _la==SUPER) {
				{
				setState(403);
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
		public ReferenceTypeContext referenceType() {
			return getRuleContext(ReferenceTypeContext.class,0);
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
		enterRule(_localctx, 46, RULE_wildcardBounds);
		try {
			setState(410);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(406);
				match(T__0);
				setState(407);
				referenceType();
				}
				break;
			case SUPER:
				enterOuterAlt(_localctx, 2);
				{
				setState(408);
				match(SUPER);
				setState(409);
				referenceType();
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

	public static class TypeNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public PackageOrTypeNameContext packageOrTypeName() {
			return getRuleContext(PackageOrTypeNameContext.class,0);
		}
		public TypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterTypeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitTypeName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitTypeName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeNameContext typeName() throws RecognitionException {
		TypeNameContext _localctx = new TypeNameContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_typeName);
		try {
			setState(417);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(412);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(413);
				packageOrTypeName(0);
				setState(414);
				match(DOT);
				setState(415);
				match(Identifier);
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

	public static class PackageOrTypeNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public PackageOrTypeNameContext packageOrTypeName() {
			return getRuleContext(PackageOrTypeNameContext.class,0);
		}
		public PackageOrTypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packageOrTypeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterPackageOrTypeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitPackageOrTypeName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitPackageOrTypeName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PackageOrTypeNameContext packageOrTypeName() throws RecognitionException {
		return packageOrTypeName(0);
	}

	private PackageOrTypeNameContext packageOrTypeName(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PackageOrTypeNameContext _localctx = new PackageOrTypeNameContext(_ctx, _parentState);
		PackageOrTypeNameContext _prevctx = _localctx;
		int _startState = 50;
		enterRecursionRule(_localctx, 50, RULE_packageOrTypeName, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(420);
			match(Identifier);
			}
			_ctx.stop = _input.LT(-1);
			setState(427);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new PackageOrTypeNameContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_packageOrTypeName);
					setState(422);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(423);
					match(DOT);
					setState(424);
					match(Identifier);
					}
					} 
				}
				setState(429);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ExpressionNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public AmbiguousNameContext ambiguousName() {
			return getRuleContext(AmbiguousNameContext.class,0);
		}
		public ExpressionNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterExpressionName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitExpressionName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitExpressionName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionNameContext expressionName() throws RecognitionException {
		ExpressionNameContext _localctx = new ExpressionNameContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_expressionName);
		try {
			setState(435);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(430);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(431);
				ambiguousName(0);
				setState(432);
				match(DOT);
				setState(433);
				match(Identifier);
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

	public static class MethodNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public MethodNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterMethodName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitMethodName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitMethodName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodNameContext methodName() throws RecognitionException {
		MethodNameContext _localctx = new MethodNameContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_methodName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(437);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AmbiguousNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public AmbiguousNameContext ambiguousName() {
			return getRuleContext(AmbiguousNameContext.class,0);
		}
		public AmbiguousNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ambiguousName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterAmbiguousName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitAmbiguousName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitAmbiguousName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AmbiguousNameContext ambiguousName() throws RecognitionException {
		return ambiguousName(0);
	}

	private AmbiguousNameContext ambiguousName(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AmbiguousNameContext _localctx = new AmbiguousNameContext(_ctx, _parentState);
		AmbiguousNameContext _prevctx = _localctx;
		int _startState = 56;
		enterRecursionRule(_localctx, 56, RULE_ambiguousName, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(440);
			match(Identifier);
			}
			_ctx.stop = _input.LT(-1);
			setState(447);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AmbiguousNameContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_ambiguousName);
					setState(442);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(443);
					match(DOT);
					setState(444);
					match(Identifier);
					}
					} 
				}
				setState(449);
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
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class TypeDeclarationContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public TerminalNode AT() { return getToken(Java8Parser.AT, 0); }
		public TerminalNode CD() { return getToken(Java8Parser.CD, 0); }
		public TypeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterTypeDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitTypeDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitTypeDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeDeclarationContext typeDeclaration() throws RecognitionException {
		TypeDeclarationContext _localctx = new TypeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_typeDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(450);
			match(Identifier);
			setState(451);
			match(AT);
			setState(452);
			match(CD);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeParametersContext extends ParserRuleContext {
		public TypeParameterListContext typeParameterList() {
			return getRuleContext(TypeParameterListContext.class,0);
		}
		public TypeParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterTypeParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitTypeParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitTypeParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeParametersContext typeParameters() throws RecognitionException {
		TypeParametersContext _localctx = new TypeParametersContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_typeParameters);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(454);
			match(LT);
			setState(455);
			typeParameterList();
			setState(456);
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

	public static class TypeParameterListContext extends ParserRuleContext {
		public List<TypeParameterContext> typeParameter() {
			return getRuleContexts(TypeParameterContext.class);
		}
		public TypeParameterContext typeParameter(int i) {
			return getRuleContext(TypeParameterContext.class,i);
		}
		public TypeParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterTypeParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitTypeParameterList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitTypeParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeParameterListContext typeParameterList() throws RecognitionException {
		TypeParameterListContext _localctx = new TypeParameterListContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_typeParameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(458);
			typeParameter();
			setState(463);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(459);
				match(COMMA);
				setState(460);
				typeParameter();
				}
				}
				setState(465);
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

	public static class VariableDeclaratorListContext extends ParserRuleContext {
		public List<VariableDeclaratorContext> variableDeclarator() {
			return getRuleContexts(VariableDeclaratorContext.class);
		}
		public VariableDeclaratorContext variableDeclarator(int i) {
			return getRuleContext(VariableDeclaratorContext.class,i);
		}
		public VariableDeclaratorListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaratorList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterVariableDeclaratorList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitVariableDeclaratorList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitVariableDeclaratorList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclaratorListContext variableDeclaratorList() throws RecognitionException {
		VariableDeclaratorListContext _localctx = new VariableDeclaratorListContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_variableDeclaratorList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(466);
			variableDeclarator();
			setState(471);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(467);
				match(COMMA);
				setState(468);
				variableDeclarator();
				}
				}
				setState(473);
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

	public static class VariableDeclaratorContext extends ParserRuleContext {
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public VariableInitializerContext variableInitializer() {
			return getRuleContext(VariableInitializerContext.class,0);
		}
		public VariableDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterVariableDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitVariableDeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitVariableDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclaratorContext variableDeclarator() throws RecognitionException {
		VariableDeclaratorContext _localctx = new VariableDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_variableDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(474);
			variableDeclaratorId();
			setState(477);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(475);
				match(ASSIGN);
				setState(476);
				variableInitializer();
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

	public static class VariableDeclaratorIdContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public VariableDeclaratorIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaratorId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterVariableDeclaratorId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitVariableDeclaratorId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitVariableDeclaratorId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclaratorIdContext variableDeclaratorId() throws RecognitionException {
		VariableDeclaratorIdContext _localctx = new VariableDeclaratorIdContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_variableDeclaratorId);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(479);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableInitializerContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ArrayInitializerContext arrayInitializer() {
			return getRuleContext(ArrayInitializerContext.class,0);
		}
		public VariableInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterVariableInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitVariableInitializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitVariableInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableInitializerContext variableInitializer() throws RecognitionException {
		VariableInitializerContext _localctx = new VariableInitializerContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_variableInitializer);
		try {
			setState(483);
			switch (_input.LA(1)) {
			case T__1:
			case CodeHole:
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case NEW:
			case SHORT:
			case SUPER:
			case THIS:
			case NumberLiteral:
			case BooleanLiteral:
			case CharacterLiteral:
			case StringLiteral:
			case NullLiteral:
			case LPAREN:
			case BANG:
			case TILDE:
			case INC:
			case DEC:
			case ADD:
			case SUB:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(481);
				expression();
				}
				break;
			case LBRACE:
				enterOuterAlt(_localctx, 2);
				{
				setState(482);
				arrayInitializer();
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

	public static class UnannTypeContext extends ParserRuleContext {
		public UnannPrimitiveTypeContext unannPrimitiveType() {
			return getRuleContext(UnannPrimitiveTypeContext.class,0);
		}
		public UnannReferenceTypeContext unannReferenceType() {
			return getRuleContext(UnannReferenceTypeContext.class,0);
		}
		public UnannTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unannType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterUnannType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitUnannType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitUnannType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnannTypeContext unannType() throws RecognitionException {
		UnannTypeContext _localctx = new UnannTypeContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_unannType);
		try {
			setState(487);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(485);
				unannPrimitiveType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(486);
				unannReferenceType();
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

	public static class UnannPrimitiveTypeContext extends ParserRuleContext {
		public NumericTypeContext numericType() {
			return getRuleContext(NumericTypeContext.class,0);
		}
		public UnannPrimitiveTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unannPrimitiveType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterUnannPrimitiveType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitUnannPrimitiveType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitUnannPrimitiveType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnannPrimitiveTypeContext unannPrimitiveType() throws RecognitionException {
		UnannPrimitiveTypeContext _localctx = new UnannPrimitiveTypeContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_unannPrimitiveType);
		try {
			setState(491);
			switch (_input.LA(1)) {
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
				enterOuterAlt(_localctx, 1);
				{
				setState(489);
				numericType();
				}
				break;
			case BOOLEAN:
				enterOuterAlt(_localctx, 2);
				{
				setState(490);
				match(BOOLEAN);
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

	public static class UnannReferenceTypeContext extends ParserRuleContext {
		public UnannClassOrInterfaceTypeContext unannClassOrInterfaceType() {
			return getRuleContext(UnannClassOrInterfaceTypeContext.class,0);
		}
		public UnannTypeVariableContext unannTypeVariable() {
			return getRuleContext(UnannTypeVariableContext.class,0);
		}
		public UnannArrayTypeContext unannArrayType() {
			return getRuleContext(UnannArrayTypeContext.class,0);
		}
		public UnannReferenceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unannReferenceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterUnannReferenceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitUnannReferenceType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitUnannReferenceType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnannReferenceTypeContext unannReferenceType() throws RecognitionException {
		UnannReferenceTypeContext _localctx = new UnannReferenceTypeContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_unannReferenceType);
		try {
			setState(496);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(493);
				unannClassOrInterfaceType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(494);
				unannTypeVariable();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(495);
				unannArrayType();
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

	public static class UnannClassOrInterfaceTypeContext extends ParserRuleContext {
		public UnannClassType_lfno_unannClassOrInterfaceTypeContext unannClassType_lfno_unannClassOrInterfaceType() {
			return getRuleContext(UnannClassType_lfno_unannClassOrInterfaceTypeContext.class,0);
		}
		public UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext unannInterfaceType_lfno_unannClassOrInterfaceType() {
			return getRuleContext(UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext.class,0);
		}
		public List<UnannClassType_lf_unannClassOrInterfaceTypeContext> unannClassType_lf_unannClassOrInterfaceType() {
			return getRuleContexts(UnannClassType_lf_unannClassOrInterfaceTypeContext.class);
		}
		public UnannClassType_lf_unannClassOrInterfaceTypeContext unannClassType_lf_unannClassOrInterfaceType(int i) {
			return getRuleContext(UnannClassType_lf_unannClassOrInterfaceTypeContext.class,i);
		}
		public List<UnannInterfaceType_lf_unannClassOrInterfaceTypeContext> unannInterfaceType_lf_unannClassOrInterfaceType() {
			return getRuleContexts(UnannInterfaceType_lf_unannClassOrInterfaceTypeContext.class);
		}
		public UnannInterfaceType_lf_unannClassOrInterfaceTypeContext unannInterfaceType_lf_unannClassOrInterfaceType(int i) {
			return getRuleContext(UnannInterfaceType_lf_unannClassOrInterfaceTypeContext.class,i);
		}
		public UnannClassOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unannClassOrInterfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterUnannClassOrInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitUnannClassOrInterfaceType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitUnannClassOrInterfaceType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnannClassOrInterfaceTypeContext unannClassOrInterfaceType() throws RecognitionException {
		UnannClassOrInterfaceTypeContext _localctx = new UnannClassOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_unannClassOrInterfaceType);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(500);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				{
				setState(498);
				unannClassType_lfno_unannClassOrInterfaceType();
				}
				break;
			case 2:
				{
				setState(499);
				unannInterfaceType_lfno_unannClassOrInterfaceType();
				}
				break;
			}
			setState(506);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(504);
					switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
					case 1:
						{
						setState(502);
						unannClassType_lf_unannClassOrInterfaceType();
						}
						break;
					case 2:
						{
						setState(503);
						unannInterfaceType_lf_unannClassOrInterfaceType();
						}
						break;
					}
					} 
				}
				setState(508);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
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

	public static class UnannClassTypeContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public UnannClassOrInterfaceTypeContext unannClassOrInterfaceType() {
			return getRuleContext(UnannClassOrInterfaceTypeContext.class,0);
		}
		public UnannClassTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unannClassType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterUnannClassType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitUnannClassType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitUnannClassType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnannClassTypeContext unannClassType() throws RecognitionException {
		UnannClassTypeContext _localctx = new UnannClassTypeContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_unannClassType);
		int _la;
		try {
			setState(519);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(509);
				match(Identifier);
				setState(511);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(510);
					typeArguments();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(513);
				unannClassOrInterfaceType();
				setState(514);
				match(DOT);
				setState(515);
				match(Identifier);
				setState(517);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(516);
					typeArguments();
					}
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

	public static class UnannClassType_lf_unannClassOrInterfaceTypeContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public UnannClassType_lf_unannClassOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unannClassType_lf_unannClassOrInterfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterUnannClassType_lf_unannClassOrInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitUnannClassType_lf_unannClassOrInterfaceType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitUnannClassType_lf_unannClassOrInterfaceType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnannClassType_lf_unannClassOrInterfaceTypeContext unannClassType_lf_unannClassOrInterfaceType() throws RecognitionException {
		UnannClassType_lf_unannClassOrInterfaceTypeContext _localctx = new UnannClassType_lf_unannClassOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_unannClassType_lf_unannClassOrInterfaceType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(521);
			match(DOT);
			setState(522);
			match(Identifier);
			setState(524);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(523);
				typeArguments();
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

	public static class UnannClassType_lfno_unannClassOrInterfaceTypeContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public UnannClassType_lfno_unannClassOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unannClassType_lfno_unannClassOrInterfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterUnannClassType_lfno_unannClassOrInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitUnannClassType_lfno_unannClassOrInterfaceType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitUnannClassType_lfno_unannClassOrInterfaceType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnannClassType_lfno_unannClassOrInterfaceTypeContext unannClassType_lfno_unannClassOrInterfaceType() throws RecognitionException {
		UnannClassType_lfno_unannClassOrInterfaceTypeContext _localctx = new UnannClassType_lfno_unannClassOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_unannClassType_lfno_unannClassOrInterfaceType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(526);
			match(Identifier);
			setState(528);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(527);
				typeArguments();
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

	public static class UnannInterfaceTypeContext extends ParserRuleContext {
		public UnannClassTypeContext unannClassType() {
			return getRuleContext(UnannClassTypeContext.class,0);
		}
		public UnannInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unannInterfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterUnannInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitUnannInterfaceType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitUnannInterfaceType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnannInterfaceTypeContext unannInterfaceType() throws RecognitionException {
		UnannInterfaceTypeContext _localctx = new UnannInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_unannInterfaceType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(530);
			unannClassType();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnannInterfaceType_lf_unannClassOrInterfaceTypeContext extends ParserRuleContext {
		public UnannClassType_lf_unannClassOrInterfaceTypeContext unannClassType_lf_unannClassOrInterfaceType() {
			return getRuleContext(UnannClassType_lf_unannClassOrInterfaceTypeContext.class,0);
		}
		public UnannInterfaceType_lf_unannClassOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unannInterfaceType_lf_unannClassOrInterfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterUnannInterfaceType_lf_unannClassOrInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitUnannInterfaceType_lf_unannClassOrInterfaceType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitUnannInterfaceType_lf_unannClassOrInterfaceType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnannInterfaceType_lf_unannClassOrInterfaceTypeContext unannInterfaceType_lf_unannClassOrInterfaceType() throws RecognitionException {
		UnannInterfaceType_lf_unannClassOrInterfaceTypeContext _localctx = new UnannInterfaceType_lf_unannClassOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_unannInterfaceType_lf_unannClassOrInterfaceType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(532);
			unannClassType_lf_unannClassOrInterfaceType();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext extends ParserRuleContext {
		public UnannClassType_lfno_unannClassOrInterfaceTypeContext unannClassType_lfno_unannClassOrInterfaceType() {
			return getRuleContext(UnannClassType_lfno_unannClassOrInterfaceTypeContext.class,0);
		}
		public UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unannInterfaceType_lfno_unannClassOrInterfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterUnannInterfaceType_lfno_unannClassOrInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitUnannInterfaceType_lfno_unannClassOrInterfaceType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitUnannInterfaceType_lfno_unannClassOrInterfaceType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext unannInterfaceType_lfno_unannClassOrInterfaceType() throws RecognitionException {
		UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext _localctx = new UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_unannInterfaceType_lfno_unannClassOrInterfaceType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(534);
			unannClassType_lfno_unannClassOrInterfaceType();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnannTypeVariableContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public UnannTypeVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unannTypeVariable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterUnannTypeVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitUnannTypeVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitUnannTypeVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnannTypeVariableContext unannTypeVariable() throws RecognitionException {
		UnannTypeVariableContext _localctx = new UnannTypeVariableContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_unannTypeVariable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(536);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnannArrayTypeContext extends ParserRuleContext {
		public UnannPrimitiveTypeContext unannPrimitiveType() {
			return getRuleContext(UnannPrimitiveTypeContext.class,0);
		}
		public DimsContext dims() {
			return getRuleContext(DimsContext.class,0);
		}
		public UnannClassOrInterfaceTypeContext unannClassOrInterfaceType() {
			return getRuleContext(UnannClassOrInterfaceTypeContext.class,0);
		}
		public UnannTypeVariableContext unannTypeVariable() {
			return getRuleContext(UnannTypeVariableContext.class,0);
		}
		public UnannArrayTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unannArrayType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterUnannArrayType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitUnannArrayType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitUnannArrayType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnannArrayTypeContext unannArrayType() throws RecognitionException {
		UnannArrayTypeContext _localctx = new UnannArrayTypeContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_unannArrayType);
		try {
			setState(547);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(538);
				unannPrimitiveType();
				setState(539);
				dims();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(541);
				unannClassOrInterfaceType();
				setState(542);
				dims();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(544);
				unannTypeVariable();
				setState(545);
				dims();
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

	public static class MethodDeclarationContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public TerminalNode AT() { return getToken(Java8Parser.AT, 0); }
		public TerminalNode MD() { return getToken(Java8Parser.MD, 0); }
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public MethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitMethodDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitMethodDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodDeclarationContext methodDeclaration() throws RecognitionException {
		MethodDeclarationContext _localctx = new MethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_methodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(549);
			match(Identifier);
			setState(550);
			match(LPAREN);
			setState(552);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << SHORT))) != 0) || _la==Identifier) {
				{
				setState(551);
				formalParameters();
				}
			}

			setState(554);
			match(RPAREN);
			setState(555);
			match(AT);
			setState(556);
			match(MD);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormalParametersContext extends ParserRuleContext {
		public List<FormalParameterContext> formalParameter() {
			return getRuleContexts(FormalParameterContext.class);
		}
		public FormalParameterContext formalParameter(int i) {
			return getRuleContext(FormalParameterContext.class,i);
		}
		public ReceiverParameterContext receiverParameter() {
			return getRuleContext(ReceiverParameterContext.class,0);
		}
		public FormalParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterFormalParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitFormalParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitFormalParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParametersContext formalParameters() throws RecognitionException {
		FormalParametersContext _localctx = new FormalParametersContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_formalParameters);
		int _la;
		try {
			setState(574);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(558);
				formalParameter();
				setState(563);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(559);
					match(COMMA);
					setState(560);
					formalParameter();
					}
					}
					setState(565);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(566);
				receiverParameter();
				setState(571);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(567);
					match(COMMA);
					setState(568);
					formalParameter();
					}
					}
					setState(573);
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

	public static class FormalParameterContext extends ParserRuleContext {
		public UnannTypeContext unannType() {
			return getRuleContext(UnannTypeContext.class,0);
		}
		public FormalParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterFormalParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitFormalParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitFormalParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParameterContext formalParameter() throws RecognitionException {
		FormalParameterContext _localctx = new FormalParameterContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_formalParameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(576);
			unannType();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReceiverParameterContext extends ParserRuleContext {
		public UnannTypeContext unannType() {
			return getRuleContext(UnannTypeContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public ReceiverParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_receiverParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterReceiverParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitReceiverParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitReceiverParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReceiverParameterContext receiverParameter() throws RecognitionException {
		ReceiverParameterContext _localctx = new ReceiverParameterContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_receiverParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(578);
			unannType();
			setState(581);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				{
				setState(579);
				match(Identifier);
				}
				setState(580);
				match(DOT);
				}
			}

			setState(583);
			match(THIS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExceptionTypeListContext extends ParserRuleContext {
		public List<ExceptionTypeContext> exceptionType() {
			return getRuleContexts(ExceptionTypeContext.class);
		}
		public ExceptionTypeContext exceptionType(int i) {
			return getRuleContext(ExceptionTypeContext.class,i);
		}
		public ExceptionTypeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exceptionTypeList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterExceptionTypeList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitExceptionTypeList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitExceptionTypeList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExceptionTypeListContext exceptionTypeList() throws RecognitionException {
		ExceptionTypeListContext _localctx = new ExceptionTypeListContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_exceptionTypeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(585);
			exceptionType();
			setState(590);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(586);
				match(COMMA);
				setState(587);
				exceptionType();
				}
				}
				setState(592);
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

	public static class ExceptionTypeContext extends ParserRuleContext {
		public ClassTypeContext classType() {
			return getRuleContext(ClassTypeContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public ExceptionTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exceptionType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterExceptionType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitExceptionType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitExceptionType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExceptionTypeContext exceptionType() throws RecognitionException {
		ExceptionTypeContext _localctx = new ExceptionTypeContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_exceptionType);
		try {
			setState(595);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(593);
				classType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(594);
				match(Identifier);
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

	public static class SimpleTypeNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public SimpleTypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleTypeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterSimpleTypeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitSimpleTypeName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitSimpleTypeName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleTypeNameContext simpleTypeName() throws RecognitionException {
		SimpleTypeNameContext _localctx = new SimpleTypeNameContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_simpleTypeName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(597);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExplicitConstructorInvocationContext extends ParserRuleContext {
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public ExpressionNameContext expressionName() {
			return getRuleContext(ExpressionNameContext.class,0);
		}
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public ExplicitConstructorInvocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explicitConstructorInvocation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterExplicitConstructorInvocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitExplicitConstructorInvocation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitExplicitConstructorInvocation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExplicitConstructorInvocationContext explicitConstructorInvocation() throws RecognitionException {
		ExplicitConstructorInvocationContext _localctx = new ExplicitConstructorInvocationContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_explicitConstructorInvocation);
		int _la;
		try {
			setState(641);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(600);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(599);
					typeArguments();
					}
				}

				setState(602);
				match(THIS);
				setState(603);
				match(LPAREN);
				setState(605);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << CodeHole) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << NumberLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (BANG - 64)) | (1L << (TILDE - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (Identifier - 64)))) != 0)) {
					{
					setState(604);
					argumentList();
					}
				}

				setState(607);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(609);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(608);
					typeArguments();
					}
				}

				setState(611);
				match(SUPER);
				setState(612);
				match(LPAREN);
				setState(614);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << CodeHole) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << NumberLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (BANG - 64)) | (1L << (TILDE - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (Identifier - 64)))) != 0)) {
					{
					setState(613);
					argumentList();
					}
				}

				setState(616);
				match(RPAREN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(617);
				expressionName();
				setState(618);
				match(DOT);
				setState(620);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(619);
					typeArguments();
					}
				}

				setState(622);
				match(SUPER);
				setState(623);
				match(LPAREN);
				setState(625);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << CodeHole) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << NumberLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (BANG - 64)) | (1L << (TILDE - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (Identifier - 64)))) != 0)) {
					{
					setState(624);
					argumentList();
					}
				}

				setState(627);
				match(RPAREN);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(629);
				primary();
				setState(630);
				match(DOT);
				setState(632);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(631);
					typeArguments();
					}
				}

				setState(634);
				match(SUPER);
				setState(635);
				match(LPAREN);
				setState(637);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << CodeHole) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << NumberLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (BANG - 64)) | (1L << (TILDE - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (Identifier - 64)))) != 0)) {
					{
					setState(636);
					argumentList();
					}
				}

				setState(639);
				match(RPAREN);
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

	public static class LocalVariableDeclarationStatementContext extends ParserRuleContext {
		public LocalVariableDeclarationContext localVariableDeclaration() {
			return getRuleContext(LocalVariableDeclarationContext.class,0);
		}
		public LocalVariableDeclarationStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localVariableDeclarationStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterLocalVariableDeclarationStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitLocalVariableDeclarationStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitLocalVariableDeclarationStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocalVariableDeclarationStatementContext localVariableDeclarationStatement() throws RecognitionException {
		LocalVariableDeclarationStatementContext _localctx = new LocalVariableDeclarationStatementContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_localVariableDeclarationStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(643);
			localVariableDeclaration();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LocalVariableDeclarationContext extends ParserRuleContext {
		public List<UnannTypeContext> unannType() {
			return getRuleContexts(UnannTypeContext.class);
		}
		public UnannTypeContext unannType(int i) {
			return getRuleContext(UnannTypeContext.class,i);
		}
		public LocalVariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localVariableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterLocalVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitLocalVariableDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitLocalVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocalVariableDeclarationContext localVariableDeclaration() throws RecognitionException {
		LocalVariableDeclarationContext _localctx = new LocalVariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_localVariableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(645);
			unannType();
			setState(650);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(646);
				match(COMMA);
				setState(647);
				unannType();
				}
				}
				setState(652);
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

	public static class StatementContext extends ParserRuleContext {
		public StatementWithoutTrailingSubstatementContext statementWithoutTrailingSubstatement() {
			return getRuleContext(StatementWithoutTrailingSubstatementContext.class,0);
		}
		public LabeledStatementContext labeledStatement() {
			return getRuleContext(LabeledStatementContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public TerminalNode ElseStatement() { return getToken(Java8Parser.ElseStatement, 0); }
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public ForStatementContext forStatement() {
			return getRuleContext(ForStatementContext.class,0);
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
		enterRule(_localctx, 116, RULE_statement);
		try {
			setState(659);
			switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(653);
				statementWithoutTrailingSubstatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(654);
				labeledStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(655);
				ifStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(656);
				match(ElseStatement);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(657);
				whileStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(658);
				forStatement();
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

	public static class StatementWithoutTrailingSubstatementContext extends ParserRuleContext {
		public ExpressionStatementContext expressionStatement() {
			return getRuleContext(ExpressionStatementContext.class,0);
		}
		public AssertStatementContext assertStatement() {
			return getRuleContext(AssertStatementContext.class,0);
		}
		public SwitchStatementContext switchStatement() {
			return getRuleContext(SwitchStatementContext.class,0);
		}
		public CaseStatementContext caseStatement() {
			return getRuleContext(CaseStatementContext.class,0);
		}
		public DoStatementContext doStatement() {
			return getRuleContext(DoStatementContext.class,0);
		}
		public BreakStatementContext breakStatement() {
			return getRuleContext(BreakStatementContext.class,0);
		}
		public ContinueStatementContext continueStatement() {
			return getRuleContext(ContinueStatementContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public SynchronizedStatementContext synchronizedStatement() {
			return getRuleContext(SynchronizedStatementContext.class,0);
		}
		public ThrowStatementContext throwStatement() {
			return getRuleContext(ThrowStatementContext.class,0);
		}
		public TryStatementContext tryStatement() {
			return getRuleContext(TryStatementContext.class,0);
		}
		public StatementWithoutTrailingSubstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementWithoutTrailingSubstatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterStatementWithoutTrailingSubstatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitStatementWithoutTrailingSubstatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitStatementWithoutTrailingSubstatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementWithoutTrailingSubstatementContext statementWithoutTrailingSubstatement() throws RecognitionException {
		StatementWithoutTrailingSubstatementContext _localctx = new StatementWithoutTrailingSubstatementContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_statementWithoutTrailingSubstatement);
		try {
			setState(672);
			switch (_input.LA(1)) {
			case T__1:
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case NEW:
			case SHORT:
			case SUPER:
			case THIS:
			case NumberLiteral:
			case BooleanLiteral:
			case CharacterLiteral:
			case StringLiteral:
			case NullLiteral:
			case LPAREN:
			case INC:
			case DEC:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(661);
				expressionStatement();
				}
				break;
			case ASSERT:
				enterOuterAlt(_localctx, 2);
				{
				setState(662);
				assertStatement();
				}
				break;
			case SWITCH:
				enterOuterAlt(_localctx, 3);
				{
				setState(663);
				switchStatement();
				}
				break;
			case CASE:
			case DEFAULT:
				enterOuterAlt(_localctx, 4);
				{
				setState(664);
				caseStatement();
				}
				break;
			case DO:
				enterOuterAlt(_localctx, 5);
				{
				setState(665);
				doStatement();
				}
				break;
			case BREAK:
				enterOuterAlt(_localctx, 6);
				{
				setState(666);
				breakStatement();
				}
				break;
			case CONTINUE:
				enterOuterAlt(_localctx, 7);
				{
				setState(667);
				continueStatement();
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 8);
				{
				setState(668);
				returnStatement();
				}
				break;
			case SYNCHRONIZED:
				enterOuterAlt(_localctx, 9);
				{
				setState(669);
				synchronizedStatement();
				}
				break;
			case THROW:
				enterOuterAlt(_localctx, 10);
				{
				setState(670);
				throwStatement();
				}
				break;
			case TRY:
				enterOuterAlt(_localctx, 11);
				{
				setState(671);
				tryStatement();
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

	public static class LabeledStatementContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
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
		enterRule(_localctx, 120, RULE_labeledStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(674);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
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
		public StatementExpressionContext statementExpression() {
			return getRuleContext(StatementExpressionContext.class,0);
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
		enterRule(_localctx, 122, RULE_expressionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(676);
			statementExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementExpressionContext extends ParserRuleContext {
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public PreIncrementExpressionContext preIncrementExpression() {
			return getRuleContext(PreIncrementExpressionContext.class,0);
		}
		public PreDecrementExpressionContext preDecrementExpression() {
			return getRuleContext(PreDecrementExpressionContext.class,0);
		}
		public PostIncrementExpressionContext postIncrementExpression() {
			return getRuleContext(PostIncrementExpressionContext.class,0);
		}
		public PostDecrementExpressionContext postDecrementExpression() {
			return getRuleContext(PostDecrementExpressionContext.class,0);
		}
		public MethodInvocationContext methodInvocation() {
			return getRuleContext(MethodInvocationContext.class,0);
		}
		public ClassInstanceCreationExpressionContext classInstanceCreationExpression() {
			return getRuleContext(ClassInstanceCreationExpressionContext.class,0);
		}
		public StatementExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterStatementExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitStatementExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitStatementExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementExpressionContext statementExpression() throws RecognitionException {
		StatementExpressionContext _localctx = new StatementExpressionContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_statementExpression);
		try {
			setState(685);
			switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(678);
				assignment();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(679);
				preIncrementExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(680);
				preDecrementExpression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(681);
				postIncrementExpression();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(682);
				postDecrementExpression();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(683);
				methodInvocation();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(684);
				classInstanceCreationExpression();
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

	public static class IfStatementContext extends ParserRuleContext {
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
		enterRule(_localctx, 126, RULE_ifStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(687);
			match(IF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssertStatementContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public AssertStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assertStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterAssertStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitAssertStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitAssertStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssertStatementContext assertStatement() throws RecognitionException {
		AssertStatementContext _localctx = new AssertStatementContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_assertStatement);
		try {
			setState(696);
			switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(689);
				match(ASSERT);
				setState(690);
				expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(691);
				match(ASSERT);
				setState(692);
				expression();
				setState(693);
				match(COLON);
				setState(694);
				expression();
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

	public static class SwitchStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
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
		enterRule(_localctx, 130, RULE_switchStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(698);
			match(SWITCH);
			setState(699);
			match(LPAREN);
			setState(700);
			expression();
			setState(701);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CaseStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public CaseStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterCaseStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitCaseStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitCaseStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CaseStatementContext caseStatement() throws RecognitionException {
		CaseStatementContext _localctx = new CaseStatementContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_caseStatement);
		try {
			setState(708);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(703);
				match(CASE);
				setState(704);
				expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(705);
				match(CASE);
				setState(706);
				match(Identifier);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(707);
				match(DEFAULT);
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

	public static class WhileStatementContext extends ParserRuleContext {
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
		enterRule(_localctx, 134, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(710);
			match(WHILE);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 136, RULE_doStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(712);
			match(DO);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 138, RULE_forStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(714);
			match(FOR);
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
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
		enterRule(_localctx, 140, RULE_breakStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(716);
			match(BREAK);
			setState(718);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(717);
				match(Identifier);
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
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
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
		enterRule(_localctx, 142, RULE_continueStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(720);
			match(CONTINUE);
			setState(722);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(721);
				match(Identifier);
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

	public static class ReturnStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
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
		enterRule(_localctx, 144, RULE_returnStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(724);
			match(RETURN);
			setState(726);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << CodeHole) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << NumberLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (BANG - 64)) | (1L << (TILDE - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (Identifier - 64)))) != 0)) {
				{
				setState(725);
				expression();
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

	public static class ThrowStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
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
		enterRule(_localctx, 146, RULE_throwStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(728);
			match(THROW);
			setState(729);
			expression();
			}
		}
		catch (RecognitionException re) {
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
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
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
		enterRule(_localctx, 148, RULE_synchronizedStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(731);
			match(SYNCHRONIZED);
			setState(732);
			match(LPAREN);
			setState(733);
			expression();
			setState(734);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 150, RULE_tryStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(736);
			match(TRY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CatchClauseContext extends ParserRuleContext {
		public CatchFormalParameterContext catchFormalParameter() {
			return getRuleContext(CatchFormalParameterContext.class,0);
		}
		public CatchClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catchClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterCatchClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitCatchClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitCatchClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CatchClauseContext catchClause() throws RecognitionException {
		CatchClauseContext _localctx = new CatchClauseContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_catchClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(738);
			match(CATCH);
			setState(739);
			match(LPAREN);
			setState(740);
			catchFormalParameter();
			setState(741);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CatchFormalParameterContext extends ParserRuleContext {
		public CatchTypeContext catchType() {
			return getRuleContext(CatchTypeContext.class,0);
		}
		public CatchFormalParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catchFormalParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterCatchFormalParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitCatchFormalParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitCatchFormalParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CatchFormalParameterContext catchFormalParameter() throws RecognitionException {
		CatchFormalParameterContext _localctx = new CatchFormalParameterContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_catchFormalParameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(743);
			catchType();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CatchTypeContext extends ParserRuleContext {
		public UnannClassTypeContext unannClassType() {
			return getRuleContext(UnannClassTypeContext.class,0);
		}
		public List<ClassTypeContext> classType() {
			return getRuleContexts(ClassTypeContext.class);
		}
		public ClassTypeContext classType(int i) {
			return getRuleContext(ClassTypeContext.class,i);
		}
		public CatchTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catchType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterCatchType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitCatchType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitCatchType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CatchTypeContext catchType() throws RecognitionException {
		CatchTypeContext _localctx = new CatchTypeContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_catchType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(745);
			unannClassType();
			setState(750);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BITOR) {
				{
				{
				setState(746);
				match(BITOR);
				setState(747);
				classType();
				}
				}
				setState(752);
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

	public static class ResourceContext extends ParserRuleContext {
		public UnannTypeContext unannType() {
			return getRuleContext(UnannTypeContext.class,0);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ResourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resource; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterResource(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitResource(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitResource(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ResourceContext resource() throws RecognitionException {
		ResourceContext _localctx = new ResourceContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_resource);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(753);
			unannType();
			setState(754);
			variableDeclaratorId();
			setState(755);
			match(ASSIGN);
			setState(756);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryContext extends ParserRuleContext {
		public PrimaryNoNewArray_lfno_primaryContext primaryNoNewArray_lfno_primary() {
			return getRuleContext(PrimaryNoNewArray_lfno_primaryContext.class,0);
		}
		public ArrayCreationExpressionContext arrayCreationExpression() {
			return getRuleContext(ArrayCreationExpressionContext.class,0);
		}
		public List<PrimaryNoNewArray_lf_primaryContext> primaryNoNewArray_lf_primary() {
			return getRuleContexts(PrimaryNoNewArray_lf_primaryContext.class);
		}
		public PrimaryNoNewArray_lf_primaryContext primaryNoNewArray_lf_primary(int i) {
			return getRuleContext(PrimaryNoNewArray_lf_primaryContext.class,i);
		}
		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterPrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitPrimary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitPrimary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_primary);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(760);
			switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
			case 1:
				{
				setState(758);
				primaryNoNewArray_lfno_primary();
				}
				break;
			case 2:
				{
				setState(759);
				arrayCreationExpression();
				}
				break;
			}
			setState(765);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(762);
					primaryNoNewArray_lf_primary();
					}
					} 
				}
				setState(767);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
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

	public static class PrimaryNoNewArrayContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ClassInstanceCreationExpressionContext classInstanceCreationExpression() {
			return getRuleContext(ClassInstanceCreationExpressionContext.class,0);
		}
		public FieldAccessContext fieldAccess() {
			return getRuleContext(FieldAccessContext.class,0);
		}
		public ArrayAccessContext arrayAccess() {
			return getRuleContext(ArrayAccessContext.class,0);
		}
		public MethodInvocationContext methodInvocation() {
			return getRuleContext(MethodInvocationContext.class,0);
		}
		public MethodReferenceContext methodReference() {
			return getRuleContext(MethodReferenceContext.class,0);
		}
		public PrimaryNoNewArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryNoNewArray; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterPrimaryNoNewArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitPrimaryNoNewArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitPrimaryNoNewArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryNoNewArrayContext primaryNoNewArray() throws RecognitionException {
		PrimaryNoNewArrayContext _localctx = new PrimaryNoNewArrayContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_primaryNoNewArray);
		int _la;
		try {
			setState(797);
			switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(768);
				literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(769);
				typeName();
				setState(774);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK) {
					{
					{
					setState(770);
					match(LBRACK);
					setState(771);
					match(RBRACK);
					}
					}
					setState(776);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(777);
				match(DOT);
				setState(778);
				match(CLASS);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(780);
				match(T__1);
				setState(781);
				match(DOT);
				setState(782);
				match(CLASS);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(783);
				match(THIS);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(784);
				typeName();
				setState(785);
				match(DOT);
				setState(786);
				match(THIS);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(788);
				match(LPAREN);
				setState(789);
				expression();
				setState(790);
				match(RPAREN);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(792);
				classInstanceCreationExpression();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(793);
				fieldAccess();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(794);
				arrayAccess();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(795);
				methodInvocation();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(796);
				methodReference();
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

	public static class PrimaryNoNewArray_lf_arrayAccessContext extends ParserRuleContext {
		public PrimaryNoNewArray_lf_arrayAccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryNoNewArray_lf_arrayAccess; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterPrimaryNoNewArray_lf_arrayAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitPrimaryNoNewArray_lf_arrayAccess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitPrimaryNoNewArray_lf_arrayAccess(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryNoNewArray_lf_arrayAccessContext primaryNoNewArray_lf_arrayAccess() throws RecognitionException {
		PrimaryNoNewArray_lf_arrayAccessContext _localctx = new PrimaryNoNewArray_lf_arrayAccessContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_primaryNoNewArray_lf_arrayAccess);
		try {
			enterOuterAlt(_localctx, 1);
			{
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryNoNewArray_lfno_arrayAccessContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ClassInstanceCreationExpressionContext classInstanceCreationExpression() {
			return getRuleContext(ClassInstanceCreationExpressionContext.class,0);
		}
		public FieldAccessContext fieldAccess() {
			return getRuleContext(FieldAccessContext.class,0);
		}
		public MethodInvocationContext methodInvocation() {
			return getRuleContext(MethodInvocationContext.class,0);
		}
		public MethodReferenceContext methodReference() {
			return getRuleContext(MethodReferenceContext.class,0);
		}
		public PrimaryNoNewArray_lfno_arrayAccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryNoNewArray_lfno_arrayAccess; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterPrimaryNoNewArray_lfno_arrayAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitPrimaryNoNewArray_lfno_arrayAccess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitPrimaryNoNewArray_lfno_arrayAccess(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryNoNewArray_lfno_arrayAccessContext primaryNoNewArray_lfno_arrayAccess() throws RecognitionException {
		PrimaryNoNewArray_lfno_arrayAccessContext _localctx = new PrimaryNoNewArray_lfno_arrayAccessContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_primaryNoNewArray_lfno_arrayAccess);
		int _la;
		try {
			setState(829);
			switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(801);
				literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(802);
				typeName();
				setState(807);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK) {
					{
					{
					setState(803);
					match(LBRACK);
					setState(804);
					match(RBRACK);
					}
					}
					setState(809);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(810);
				match(DOT);
				setState(811);
				match(CLASS);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(813);
				match(T__1);
				setState(814);
				match(DOT);
				setState(815);
				match(CLASS);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(816);
				match(THIS);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(817);
				typeName();
				setState(818);
				match(DOT);
				setState(819);
				match(THIS);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(821);
				match(LPAREN);
				setState(822);
				expression();
				setState(823);
				match(RPAREN);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(825);
				classInstanceCreationExpression();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(826);
				fieldAccess();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(827);
				methodInvocation();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(828);
				methodReference();
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

	public static class PrimaryNoNewArray_lf_primaryContext extends ParserRuleContext {
		public ClassInstanceCreationExpression_lf_primaryContext classInstanceCreationExpression_lf_primary() {
			return getRuleContext(ClassInstanceCreationExpression_lf_primaryContext.class,0);
		}
		public FieldAccess_lf_primaryContext fieldAccess_lf_primary() {
			return getRuleContext(FieldAccess_lf_primaryContext.class,0);
		}
		public ArrayAccess_lf_primaryContext arrayAccess_lf_primary() {
			return getRuleContext(ArrayAccess_lf_primaryContext.class,0);
		}
		public MethodInvocation_lf_primaryContext methodInvocation_lf_primary() {
			return getRuleContext(MethodInvocation_lf_primaryContext.class,0);
		}
		public MethodReference_lf_primaryContext methodReference_lf_primary() {
			return getRuleContext(MethodReference_lf_primaryContext.class,0);
		}
		public PrimaryNoNewArray_lf_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryNoNewArray_lf_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterPrimaryNoNewArray_lf_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitPrimaryNoNewArray_lf_primary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitPrimaryNoNewArray_lf_primary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryNoNewArray_lf_primaryContext primaryNoNewArray_lf_primary() throws RecognitionException {
		PrimaryNoNewArray_lf_primaryContext _localctx = new PrimaryNoNewArray_lf_primaryContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_primaryNoNewArray_lf_primary);
		try {
			setState(836);
			switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(831);
				classInstanceCreationExpression_lf_primary();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(832);
				fieldAccess_lf_primary();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(833);
				arrayAccess_lf_primary();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(834);
				methodInvocation_lf_primary();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(835);
				methodReference_lf_primary();
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

	public static class PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext extends ParserRuleContext {
		public PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterPrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitPrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitPrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary() throws RecognitionException {
		PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext _localctx = new PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary);
		try {
			enterOuterAlt(_localctx, 1);
			{
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext extends ParserRuleContext {
		public ClassInstanceCreationExpression_lf_primaryContext classInstanceCreationExpression_lf_primary() {
			return getRuleContext(ClassInstanceCreationExpression_lf_primaryContext.class,0);
		}
		public FieldAccess_lf_primaryContext fieldAccess_lf_primary() {
			return getRuleContext(FieldAccess_lf_primaryContext.class,0);
		}
		public MethodInvocation_lf_primaryContext methodInvocation_lf_primary() {
			return getRuleContext(MethodInvocation_lf_primaryContext.class,0);
		}
		public MethodReference_lf_primaryContext methodReference_lf_primary() {
			return getRuleContext(MethodReference_lf_primaryContext.class,0);
		}
		public PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterPrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitPrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitPrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary() throws RecognitionException {
		PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext _localctx = new PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary);
		try {
			setState(844);
			switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(840);
				classInstanceCreationExpression_lf_primary();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(841);
				fieldAccess_lf_primary();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(842);
				methodInvocation_lf_primary();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(843);
				methodReference_lf_primary();
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

	public static class PrimaryNoNewArray_lfno_primaryContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public UnannPrimitiveTypeContext unannPrimitiveType() {
			return getRuleContext(UnannPrimitiveTypeContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ClassInstanceCreationExpression_lfno_primaryContext classInstanceCreationExpression_lfno_primary() {
			return getRuleContext(ClassInstanceCreationExpression_lfno_primaryContext.class,0);
		}
		public FieldAccess_lfno_primaryContext fieldAccess_lfno_primary() {
			return getRuleContext(FieldAccess_lfno_primaryContext.class,0);
		}
		public ArrayAccess_lfno_primaryContext arrayAccess_lfno_primary() {
			return getRuleContext(ArrayAccess_lfno_primaryContext.class,0);
		}
		public MethodInvocation_lfno_primaryContext methodInvocation_lfno_primary() {
			return getRuleContext(MethodInvocation_lfno_primaryContext.class,0);
		}
		public MethodReference_lfno_primaryContext methodReference_lfno_primary() {
			return getRuleContext(MethodReference_lfno_primaryContext.class,0);
		}
		public PrimaryNoNewArray_lfno_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryNoNewArray_lfno_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterPrimaryNoNewArray_lfno_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitPrimaryNoNewArray_lfno_primary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitPrimaryNoNewArray_lfno_primary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryNoNewArray_lfno_primaryContext primaryNoNewArray_lfno_primary() throws RecognitionException {
		PrimaryNoNewArray_lfno_primaryContext _localctx = new PrimaryNoNewArray_lfno_primaryContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_primaryNoNewArray_lfno_primary);
		int _la;
		try {
			setState(886);
			switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(846);
				literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(847);
				typeName();
				setState(852);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK) {
					{
					{
					setState(848);
					match(LBRACK);
					setState(849);
					match(RBRACK);
					}
					}
					setState(854);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(855);
				match(DOT);
				setState(856);
				match(CLASS);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(858);
				unannPrimitiveType();
				setState(863);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK) {
					{
					{
					setState(859);
					match(LBRACK);
					setState(860);
					match(RBRACK);
					}
					}
					setState(865);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(866);
				match(DOT);
				setState(867);
				match(CLASS);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(869);
				match(T__1);
				setState(870);
				match(DOT);
				setState(871);
				match(CLASS);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(872);
				match(THIS);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(873);
				typeName();
				setState(874);
				match(DOT);
				setState(875);
				match(THIS);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(877);
				match(LPAREN);
				setState(878);
				expression();
				setState(879);
				match(RPAREN);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(881);
				classInstanceCreationExpression_lfno_primary();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(882);
				fieldAccess_lfno_primary();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(883);
				arrayAccess_lfno_primary();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(884);
				methodInvocation_lfno_primary();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(885);
				methodReference_lfno_primary();
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

	public static class PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext extends ParserRuleContext {
		public PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterPrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitPrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitPrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary() throws RecognitionException {
		PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext _localctx = new PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary);
		try {
			enterOuterAlt(_localctx, 1);
			{
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public UnannPrimitiveTypeContext unannPrimitiveType() {
			return getRuleContext(UnannPrimitiveTypeContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ClassInstanceCreationExpression_lfno_primaryContext classInstanceCreationExpression_lfno_primary() {
			return getRuleContext(ClassInstanceCreationExpression_lfno_primaryContext.class,0);
		}
		public FieldAccess_lfno_primaryContext fieldAccess_lfno_primary() {
			return getRuleContext(FieldAccess_lfno_primaryContext.class,0);
		}
		public MethodInvocation_lfno_primaryContext methodInvocation_lfno_primary() {
			return getRuleContext(MethodInvocation_lfno_primaryContext.class,0);
		}
		public MethodReference_lfno_primaryContext methodReference_lfno_primary() {
			return getRuleContext(MethodReference_lfno_primaryContext.class,0);
		}
		public PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterPrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitPrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitPrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary() throws RecognitionException {
		PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext _localctx = new PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary);
		int _la;
		try {
			setState(929);
			switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(890);
				literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(891);
				typeName();
				setState(896);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK) {
					{
					{
					setState(892);
					match(LBRACK);
					setState(893);
					match(RBRACK);
					}
					}
					setState(898);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(899);
				match(DOT);
				setState(900);
				match(CLASS);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(902);
				unannPrimitiveType();
				setState(907);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK) {
					{
					{
					setState(903);
					match(LBRACK);
					setState(904);
					match(RBRACK);
					}
					}
					setState(909);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(910);
				match(DOT);
				setState(911);
				match(CLASS);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(913);
				match(T__1);
				setState(914);
				match(DOT);
				setState(915);
				match(CLASS);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(916);
				match(THIS);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(917);
				typeName();
				setState(918);
				match(DOT);
				setState(919);
				match(THIS);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(921);
				match(LPAREN);
				setState(922);
				expression();
				setState(923);
				match(RPAREN);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(925);
				classInstanceCreationExpression_lfno_primary();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(926);
				fieldAccess_lfno_primary();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(927);
				methodInvocation_lfno_primary();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(928);
				methodReference_lfno_primary();
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

	public static class ClassInstanceCreationExpressionContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(Java8Parser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(Java8Parser.Identifier, i);
		}
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public TypeArgumentsOrDiamondContext typeArgumentsOrDiamond() {
			return getRuleContext(TypeArgumentsOrDiamondContext.class,0);
		}
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public ExpressionNameContext expressionName() {
			return getRuleContext(ExpressionNameContext.class,0);
		}
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public ClassInstanceCreationExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classInstanceCreationExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterClassInstanceCreationExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitClassInstanceCreationExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitClassInstanceCreationExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassInstanceCreationExpressionContext classInstanceCreationExpression() throws RecognitionException {
		ClassInstanceCreationExpressionContext _localctx = new ClassInstanceCreationExpressionContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_classInstanceCreationExpression);
		int _la;
		try {
			setState(983);
			switch ( getInterpreter().adaptivePredict(_input,91,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(931);
				match(NEW);
				setState(933);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(932);
					typeArguments();
					}
				}

				setState(935);
				match(Identifier);
				setState(940);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DOT) {
					{
					{
					setState(936);
					match(DOT);
					setState(937);
					match(Identifier);
					}
					}
					setState(942);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(944);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(943);
					typeArgumentsOrDiamond();
					}
				}

				setState(946);
				match(LPAREN);
				setState(948);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << CodeHole) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << NumberLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (BANG - 64)) | (1L << (TILDE - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (Identifier - 64)))) != 0)) {
					{
					setState(947);
					argumentList();
					}
				}

				setState(950);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(951);
				expressionName();
				setState(952);
				match(DOT);
				setState(953);
				match(NEW);
				setState(955);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(954);
					typeArguments();
					}
				}

				setState(957);
				match(Identifier);
				setState(959);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(958);
					typeArgumentsOrDiamond();
					}
				}

				setState(961);
				match(LPAREN);
				setState(963);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << CodeHole) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << NumberLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (BANG - 64)) | (1L << (TILDE - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (Identifier - 64)))) != 0)) {
					{
					setState(962);
					argumentList();
					}
				}

				setState(965);
				match(RPAREN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(967);
				primary();
				setState(968);
				match(DOT);
				setState(969);
				match(NEW);
				setState(971);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(970);
					typeArguments();
					}
				}

				setState(973);
				match(Identifier);
				setState(975);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(974);
					typeArgumentsOrDiamond();
					}
				}

				setState(977);
				match(LPAREN);
				setState(979);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << CodeHole) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << NumberLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (BANG - 64)) | (1L << (TILDE - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (Identifier - 64)))) != 0)) {
					{
					setState(978);
					argumentList();
					}
				}

				setState(981);
				match(RPAREN);
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

	public static class ClassInstanceCreationExpression_lf_primaryContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public TypeArgumentsOrDiamondContext typeArgumentsOrDiamond() {
			return getRuleContext(TypeArgumentsOrDiamondContext.class,0);
		}
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public ClassInstanceCreationExpression_lf_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classInstanceCreationExpression_lf_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterClassInstanceCreationExpression_lf_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitClassInstanceCreationExpression_lf_primary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitClassInstanceCreationExpression_lf_primary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassInstanceCreationExpression_lf_primaryContext classInstanceCreationExpression_lf_primary() throws RecognitionException {
		ClassInstanceCreationExpression_lf_primaryContext _localctx = new ClassInstanceCreationExpression_lf_primaryContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_classInstanceCreationExpression_lf_primary);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(985);
			match(DOT);
			setState(986);
			match(NEW);
			setState(988);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(987);
				typeArguments();
				}
			}

			setState(990);
			match(Identifier);
			setState(992);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(991);
				typeArgumentsOrDiamond();
				}
			}

			setState(994);
			match(LPAREN);
			setState(996);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << CodeHole) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << NumberLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (BANG - 64)) | (1L << (TILDE - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (Identifier - 64)))) != 0)) {
				{
				setState(995);
				argumentList();
				}
			}

			setState(998);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassInstanceCreationExpression_lfno_primaryContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(Java8Parser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(Java8Parser.Identifier, i);
		}
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public TypeArgumentsOrDiamondContext typeArgumentsOrDiamond() {
			return getRuleContext(TypeArgumentsOrDiamondContext.class,0);
		}
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public ExpressionNameContext expressionName() {
			return getRuleContext(ExpressionNameContext.class,0);
		}
		public ClassInstanceCreationExpression_lfno_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classInstanceCreationExpression_lfno_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterClassInstanceCreationExpression_lfno_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitClassInstanceCreationExpression_lfno_primary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitClassInstanceCreationExpression_lfno_primary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassInstanceCreationExpression_lfno_primaryContext classInstanceCreationExpression_lfno_primary() throws RecognitionException {
		ClassInstanceCreationExpression_lfno_primaryContext _localctx = new ClassInstanceCreationExpression_lfno_primaryContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_classInstanceCreationExpression_lfno_primary);
		int _la;
		try {
			setState(1036);
			switch (_input.LA(1)) {
			case NEW:
				enterOuterAlt(_localctx, 1);
				{
				setState(1000);
				match(NEW);
				setState(1002);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1001);
					typeArguments();
					}
				}

				setState(1004);
				match(Identifier);
				setState(1009);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DOT) {
					{
					{
					setState(1005);
					match(DOT);
					setState(1006);
					match(Identifier);
					}
					}
					setState(1011);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1013);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1012);
					typeArgumentsOrDiamond();
					}
				}

				setState(1015);
				match(LPAREN);
				setState(1017);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << CodeHole) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << NumberLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (BANG - 64)) | (1L << (TILDE - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (Identifier - 64)))) != 0)) {
					{
					setState(1016);
					argumentList();
					}
				}

				setState(1019);
				match(RPAREN);
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(1020);
				expressionName();
				setState(1021);
				match(DOT);
				setState(1022);
				match(NEW);
				setState(1024);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1023);
					typeArguments();
					}
				}

				setState(1026);
				match(Identifier);
				setState(1028);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1027);
					typeArgumentsOrDiamond();
					}
				}

				setState(1030);
				match(LPAREN);
				setState(1032);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << CodeHole) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << NumberLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (BANG - 64)) | (1L << (TILDE - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (Identifier - 64)))) != 0)) {
					{
					setState(1031);
					argumentList();
					}
				}

				setState(1034);
				match(RPAREN);
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

	public static class TypeArgumentsOrDiamondContext extends ParserRuleContext {
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public TypeArgumentsOrDiamondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArgumentsOrDiamond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterTypeArgumentsOrDiamond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitTypeArgumentsOrDiamond(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitTypeArgumentsOrDiamond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeArgumentsOrDiamondContext typeArgumentsOrDiamond() throws RecognitionException {
		TypeArgumentsOrDiamondContext _localctx = new TypeArgumentsOrDiamondContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_typeArgumentsOrDiamond);
		try {
			setState(1041);
			switch ( getInterpreter().adaptivePredict(_input,103,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1038);
				typeArguments();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1039);
				match(LT);
				setState(1040);
				match(GT);
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
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
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
		enterRule(_localctx, 188, RULE_fieldAccess);
		try {
			setState(1056);
			switch ( getInterpreter().adaptivePredict(_input,104,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1043);
				primary();
				setState(1044);
				match(DOT);
				setState(1045);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1047);
				match(SUPER);
				setState(1048);
				match(DOT);
				setState(1049);
				match(Identifier);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1050);
				typeName();
				setState(1051);
				match(DOT);
				setState(1052);
				match(SUPER);
				setState(1053);
				match(DOT);
				setState(1054);
				match(Identifier);
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

	public static class FieldAccess_lf_primaryContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public FieldAccess_lf_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldAccess_lf_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterFieldAccess_lf_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitFieldAccess_lf_primary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitFieldAccess_lf_primary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldAccess_lf_primaryContext fieldAccess_lf_primary() throws RecognitionException {
		FieldAccess_lf_primaryContext _localctx = new FieldAccess_lf_primaryContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_fieldAccess_lf_primary);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1058);
			match(DOT);
			setState(1059);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FieldAccess_lfno_primaryContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public FieldAccess_lfno_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldAccess_lfno_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterFieldAccess_lfno_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitFieldAccess_lfno_primary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitFieldAccess_lfno_primary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldAccess_lfno_primaryContext fieldAccess_lfno_primary() throws RecognitionException {
		FieldAccess_lfno_primaryContext _localctx = new FieldAccess_lfno_primaryContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_fieldAccess_lfno_primary);
		try {
			setState(1070);
			switch (_input.LA(1)) {
			case SUPER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1061);
				match(SUPER);
				setState(1062);
				match(DOT);
				setState(1063);
				match(Identifier);
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(1064);
				typeName();
				setState(1065);
				match(DOT);
				setState(1066);
				match(SUPER);
				setState(1067);
				match(DOT);
				setState(1068);
				match(Identifier);
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

	public static class ArrayAccessContext extends ParserRuleContext {
		public ExpressionNameContext expressionName() {
			return getRuleContext(ExpressionNameContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public PrimaryNoNewArray_lfno_arrayAccessContext primaryNoNewArray_lfno_arrayAccess() {
			return getRuleContext(PrimaryNoNewArray_lfno_arrayAccessContext.class,0);
		}
		public List<PrimaryNoNewArray_lf_arrayAccessContext> primaryNoNewArray_lf_arrayAccess() {
			return getRuleContexts(PrimaryNoNewArray_lf_arrayAccessContext.class);
		}
		public PrimaryNoNewArray_lf_arrayAccessContext primaryNoNewArray_lf_arrayAccess(int i) {
			return getRuleContext(PrimaryNoNewArray_lf_arrayAccessContext.class,i);
		}
		public ArrayAccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayAccess; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterArrayAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitArrayAccess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitArrayAccess(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayAccessContext arrayAccess() throws RecognitionException {
		ArrayAccessContext _localctx = new ArrayAccessContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_arrayAccess);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1082);
			switch ( getInterpreter().adaptivePredict(_input,106,_ctx) ) {
			case 1:
				{
				setState(1072);
				expressionName();
				setState(1073);
				match(LBRACK);
				setState(1074);
				expression();
				setState(1075);
				match(RBRACK);
				}
				break;
			case 2:
				{
				setState(1077);
				primaryNoNewArray_lfno_arrayAccess();
				setState(1078);
				match(LBRACK);
				setState(1079);
				expression();
				setState(1080);
				match(RBRACK);
				}
				break;
			}
			setState(1091);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(1084);
				primaryNoNewArray_lf_arrayAccess();
				setState(1085);
				match(LBRACK);
				setState(1086);
				expression();
				setState(1087);
				match(RBRACK);
				}
				}
				setState(1093);
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

	public static class ArrayAccess_lf_primaryContext extends ParserRuleContext {
		public PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary() {
			return getRuleContext(PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext> primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary() {
			return getRuleContexts(PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext.class);
		}
		public PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary(int i) {
			return getRuleContext(PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext.class,i);
		}
		public ArrayAccess_lf_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayAccess_lf_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterArrayAccess_lf_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitArrayAccess_lf_primary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitArrayAccess_lf_primary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayAccess_lf_primaryContext arrayAccess_lf_primary() throws RecognitionException {
		ArrayAccess_lf_primaryContext _localctx = new ArrayAccess_lf_primaryContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_arrayAccess_lf_primary);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1094);
			primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary();
			setState(1095);
			match(LBRACK);
			setState(1096);
			expression();
			setState(1097);
			match(RBRACK);
			}
			setState(1106);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,108,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1099);
					primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary();
					setState(1100);
					match(LBRACK);
					setState(1101);
					expression();
					setState(1102);
					match(RBRACK);
					}
					} 
				}
				setState(1108);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,108,_ctx);
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

	public static class ArrayAccess_lfno_primaryContext extends ParserRuleContext {
		public ExpressionNameContext expressionName() {
			return getRuleContext(ExpressionNameContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary() {
			return getRuleContext(PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext.class,0);
		}
		public List<PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext> primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary() {
			return getRuleContexts(PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext.class);
		}
		public PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary(int i) {
			return getRuleContext(PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext.class,i);
		}
		public ArrayAccess_lfno_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayAccess_lfno_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterArrayAccess_lfno_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitArrayAccess_lfno_primary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitArrayAccess_lfno_primary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayAccess_lfno_primaryContext arrayAccess_lfno_primary() throws RecognitionException {
		ArrayAccess_lfno_primaryContext _localctx = new ArrayAccess_lfno_primaryContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_arrayAccess_lfno_primary);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1119);
			switch ( getInterpreter().adaptivePredict(_input,109,_ctx) ) {
			case 1:
				{
				setState(1109);
				expressionName();
				setState(1110);
				match(LBRACK);
				setState(1111);
				expression();
				setState(1112);
				match(RBRACK);
				}
				break;
			case 2:
				{
				setState(1114);
				primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary();
				setState(1115);
				match(LBRACK);
				setState(1116);
				expression();
				setState(1117);
				match(RBRACK);
				}
				break;
			}
			setState(1128);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,110,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1121);
					primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary();
					setState(1122);
					match(LBRACK);
					setState(1123);
					expression();
					setState(1124);
					match(RBRACK);
					}
					} 
				}
				setState(1130);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,110,_ctx);
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

	public static class MethodInvocationContext extends ParserRuleContext {
		public MethodNameContext methodName() {
			return getRuleContext(MethodNameContext.class,0);
		}
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public ExpressionNameContext expressionName() {
			return getRuleContext(ExpressionNameContext.class,0);
		}
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public MethodInvocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodInvocation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterMethodInvocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitMethodInvocation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitMethodInvocation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodInvocationContext methodInvocation() throws RecognitionException {
		MethodInvocationContext _localctx = new MethodInvocationContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_methodInvocation);
		int _la;
		try {
			setState(1199);
			switch ( getInterpreter().adaptivePredict(_input,122,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1131);
				methodName();
				setState(1132);
				match(LPAREN);
				setState(1134);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << CodeHole) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << NumberLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (BANG - 64)) | (1L << (TILDE - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (Identifier - 64)))) != 0)) {
					{
					setState(1133);
					argumentList();
					}
				}

				setState(1136);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1138);
				typeName();
				setState(1139);
				match(DOT);
				setState(1141);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1140);
					typeArguments();
					}
				}

				setState(1143);
				match(Identifier);
				setState(1144);
				match(LPAREN);
				setState(1146);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << CodeHole) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << NumberLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (BANG - 64)) | (1L << (TILDE - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (Identifier - 64)))) != 0)) {
					{
					setState(1145);
					argumentList();
					}
				}

				setState(1148);
				match(RPAREN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1150);
				expressionName();
				setState(1151);
				match(DOT);
				setState(1153);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1152);
					typeArguments();
					}
				}

				setState(1155);
				match(Identifier);
				setState(1156);
				match(LPAREN);
				setState(1158);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << CodeHole) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << NumberLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (BANG - 64)) | (1L << (TILDE - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (Identifier - 64)))) != 0)) {
					{
					setState(1157);
					argumentList();
					}
				}

				setState(1160);
				match(RPAREN);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1162);
				primary();
				setState(1163);
				match(DOT);
				setState(1165);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1164);
					typeArguments();
					}
				}

				setState(1167);
				match(Identifier);
				setState(1168);
				match(LPAREN);
				setState(1170);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << CodeHole) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << NumberLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (BANG - 64)) | (1L << (TILDE - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (Identifier - 64)))) != 0)) {
					{
					setState(1169);
					argumentList();
					}
				}

				setState(1172);
				match(RPAREN);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1174);
				match(SUPER);
				setState(1175);
				match(DOT);
				setState(1177);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1176);
					typeArguments();
					}
				}

				setState(1179);
				match(Identifier);
				setState(1180);
				match(LPAREN);
				setState(1182);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << CodeHole) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << NumberLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (BANG - 64)) | (1L << (TILDE - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (Identifier - 64)))) != 0)) {
					{
					setState(1181);
					argumentList();
					}
				}

				setState(1184);
				match(RPAREN);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1185);
				typeName();
				setState(1186);
				match(DOT);
				setState(1187);
				match(SUPER);
				setState(1188);
				match(DOT);
				setState(1190);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1189);
					typeArguments();
					}
				}

				setState(1192);
				match(Identifier);
				setState(1193);
				match(LPAREN);
				setState(1195);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << CodeHole) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << NumberLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (BANG - 64)) | (1L << (TILDE - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (Identifier - 64)))) != 0)) {
					{
					setState(1194);
					argumentList();
					}
				}

				setState(1197);
				match(RPAREN);
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

	public static class MethodInvocation_lf_primaryContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public MethodInvocation_lf_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodInvocation_lf_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterMethodInvocation_lf_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitMethodInvocation_lf_primary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitMethodInvocation_lf_primary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodInvocation_lf_primaryContext methodInvocation_lf_primary() throws RecognitionException {
		MethodInvocation_lf_primaryContext _localctx = new MethodInvocation_lf_primaryContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_methodInvocation_lf_primary);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1201);
			match(DOT);
			setState(1203);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1202);
				typeArguments();
				}
			}

			setState(1205);
			match(Identifier);
			setState(1206);
			match(LPAREN);
			setState(1208);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << CodeHole) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << NumberLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (BANG - 64)) | (1L << (TILDE - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (Identifier - 64)))) != 0)) {
				{
				setState(1207);
				argumentList();
				}
			}

			setState(1210);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodInvocation_lfno_primaryContext extends ParserRuleContext {
		public MethodNameContext methodName() {
			return getRuleContext(MethodNameContext.class,0);
		}
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public ExpressionNameContext expressionName() {
			return getRuleContext(ExpressionNameContext.class,0);
		}
		public MethodInvocation_lfno_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodInvocation_lfno_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterMethodInvocation_lfno_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitMethodInvocation_lfno_primary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitMethodInvocation_lfno_primary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodInvocation_lfno_primaryContext methodInvocation_lfno_primary() throws RecognitionException {
		MethodInvocation_lfno_primaryContext _localctx = new MethodInvocation_lfno_primaryContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_methodInvocation_lfno_primary);
		int _la;
		try {
			setState(1268);
			switch ( getInterpreter().adaptivePredict(_input,134,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1212);
				methodName();
				setState(1213);
				match(LPAREN);
				setState(1215);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << CodeHole) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << NumberLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (BANG - 64)) | (1L << (TILDE - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (Identifier - 64)))) != 0)) {
					{
					setState(1214);
					argumentList();
					}
				}

				setState(1217);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1219);
				typeName();
				setState(1220);
				match(DOT);
				setState(1222);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1221);
					typeArguments();
					}
				}

				setState(1224);
				match(Identifier);
				setState(1225);
				match(LPAREN);
				setState(1227);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << CodeHole) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << NumberLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (BANG - 64)) | (1L << (TILDE - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (Identifier - 64)))) != 0)) {
					{
					setState(1226);
					argumentList();
					}
				}

				setState(1229);
				match(RPAREN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1231);
				expressionName();
				setState(1232);
				match(DOT);
				setState(1234);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1233);
					typeArguments();
					}
				}

				setState(1236);
				match(Identifier);
				setState(1237);
				match(LPAREN);
				setState(1239);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << CodeHole) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << NumberLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (BANG - 64)) | (1L << (TILDE - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (Identifier - 64)))) != 0)) {
					{
					setState(1238);
					argumentList();
					}
				}

				setState(1241);
				match(RPAREN);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1243);
				match(SUPER);
				setState(1244);
				match(DOT);
				setState(1246);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1245);
					typeArguments();
					}
				}

				setState(1248);
				match(Identifier);
				setState(1249);
				match(LPAREN);
				setState(1251);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << CodeHole) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << NumberLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (BANG - 64)) | (1L << (TILDE - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (Identifier - 64)))) != 0)) {
					{
					setState(1250);
					argumentList();
					}
				}

				setState(1253);
				match(RPAREN);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1254);
				typeName();
				setState(1255);
				match(DOT);
				setState(1256);
				match(SUPER);
				setState(1257);
				match(DOT);
				setState(1259);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1258);
					typeArguments();
					}
				}

				setState(1261);
				match(Identifier);
				setState(1262);
				match(LPAREN);
				setState(1264);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << CodeHole) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << NumberLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (BANG - 64)) | (1L << (TILDE - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (Identifier - 64)))) != 0)) {
					{
					setState(1263);
					argumentList();
					}
				}

				setState(1266);
				match(RPAREN);
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
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
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
		enterRule(_localctx, 206, RULE_argumentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1270);
			expression();
			setState(1275);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1271);
				match(COMMA);
				setState(1272);
				expression();
				}
				}
				setState(1277);
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

	public static class MethodReferenceContext extends ParserRuleContext {
		public ExpressionNameContext expressionName() {
			return getRuleContext(ExpressionNameContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public ReferenceTypeContext referenceType() {
			return getRuleContext(ReferenceTypeContext.class,0);
		}
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public ClassTypeContext classType() {
			return getRuleContext(ClassTypeContext.class,0);
		}
		public ArrayTypeContext arrayType() {
			return getRuleContext(ArrayTypeContext.class,0);
		}
		public MethodReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodReference; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterMethodReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitMethodReference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitMethodReference(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodReferenceContext methodReference() throws RecognitionException {
		MethodReferenceContext _localctx = new MethodReferenceContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_methodReference);
		int _la;
		try {
			setState(1325);
			switch ( getInterpreter().adaptivePredict(_input,142,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1278);
				expressionName();
				setState(1279);
				match(COLONCOLON);
				setState(1281);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1280);
					typeArguments();
					}
				}

				setState(1283);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1285);
				referenceType();
				setState(1286);
				match(COLONCOLON);
				setState(1288);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1287);
					typeArguments();
					}
				}

				setState(1290);
				match(Identifier);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1292);
				primary();
				setState(1293);
				match(COLONCOLON);
				setState(1295);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1294);
					typeArguments();
					}
				}

				setState(1297);
				match(Identifier);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1299);
				match(SUPER);
				setState(1300);
				match(COLONCOLON);
				setState(1302);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1301);
					typeArguments();
					}
				}

				setState(1304);
				match(Identifier);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1305);
				typeName();
				setState(1306);
				match(DOT);
				setState(1307);
				match(SUPER);
				setState(1308);
				match(COLONCOLON);
				setState(1310);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1309);
					typeArguments();
					}
				}

				setState(1312);
				match(Identifier);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1314);
				classType();
				setState(1315);
				match(COLONCOLON);
				setState(1317);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1316);
					typeArguments();
					}
				}

				setState(1319);
				match(NEW);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1321);
				arrayType();
				setState(1322);
				match(COLONCOLON);
				setState(1323);
				match(NEW);
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

	public static class MethodReference_lf_primaryContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public MethodReference_lf_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodReference_lf_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterMethodReference_lf_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitMethodReference_lf_primary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitMethodReference_lf_primary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodReference_lf_primaryContext methodReference_lf_primary() throws RecognitionException {
		MethodReference_lf_primaryContext _localctx = new MethodReference_lf_primaryContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_methodReference_lf_primary);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1327);
			match(COLONCOLON);
			setState(1329);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1328);
				typeArguments();
				}
			}

			setState(1331);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodReference_lfno_primaryContext extends ParserRuleContext {
		public ExpressionNameContext expressionName() {
			return getRuleContext(ExpressionNameContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public ReferenceTypeContext referenceType() {
			return getRuleContext(ReferenceTypeContext.class,0);
		}
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public ClassTypeContext classType() {
			return getRuleContext(ClassTypeContext.class,0);
		}
		public ArrayTypeContext arrayType() {
			return getRuleContext(ArrayTypeContext.class,0);
		}
		public MethodReference_lfno_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodReference_lfno_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterMethodReference_lfno_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitMethodReference_lfno_primary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitMethodReference_lfno_primary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodReference_lfno_primaryContext methodReference_lfno_primary() throws RecognitionException {
		MethodReference_lfno_primaryContext _localctx = new MethodReference_lfno_primaryContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_methodReference_lfno_primary);
		int _la;
		try {
			setState(1373);
			switch ( getInterpreter().adaptivePredict(_input,149,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1333);
				expressionName();
				setState(1334);
				match(COLONCOLON);
				setState(1336);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1335);
					typeArguments();
					}
				}

				setState(1338);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1340);
				referenceType();
				setState(1341);
				match(COLONCOLON);
				setState(1343);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1342);
					typeArguments();
					}
				}

				setState(1345);
				match(Identifier);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1347);
				match(SUPER);
				setState(1348);
				match(COLONCOLON);
				setState(1350);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1349);
					typeArguments();
					}
				}

				setState(1352);
				match(Identifier);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1353);
				typeName();
				setState(1354);
				match(DOT);
				setState(1355);
				match(SUPER);
				setState(1356);
				match(COLONCOLON);
				setState(1358);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1357);
					typeArguments();
					}
				}

				setState(1360);
				match(Identifier);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1362);
				classType();
				setState(1363);
				match(COLONCOLON);
				setState(1365);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1364);
					typeArguments();
					}
				}

				setState(1367);
				match(NEW);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1369);
				arrayType();
				setState(1370);
				match(COLONCOLON);
				setState(1371);
				match(NEW);
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

	public static class ArrayCreationExpressionContext extends ParserRuleContext {
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public DimExprsContext dimExprs() {
			return getRuleContext(DimExprsContext.class,0);
		}
		public DimsContext dims() {
			return getRuleContext(DimsContext.class,0);
		}
		public ClassOrInterfaceTypeContext classOrInterfaceType() {
			return getRuleContext(ClassOrInterfaceTypeContext.class,0);
		}
		public ArrayInitializerContext arrayInitializer() {
			return getRuleContext(ArrayInitializerContext.class,0);
		}
		public ArrayCreationExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayCreationExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterArrayCreationExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitArrayCreationExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitArrayCreationExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayCreationExpressionContext arrayCreationExpression() throws RecognitionException {
		ArrayCreationExpressionContext _localctx = new ArrayCreationExpressionContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_arrayCreationExpression);
		try {
			setState(1397);
			switch ( getInterpreter().adaptivePredict(_input,152,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1375);
				match(NEW);
				setState(1376);
				primitiveType();
				setState(1377);
				dimExprs();
				setState(1379);
				switch ( getInterpreter().adaptivePredict(_input,150,_ctx) ) {
				case 1:
					{
					setState(1378);
					dims();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1381);
				match(NEW);
				setState(1382);
				classOrInterfaceType();
				setState(1383);
				dimExprs();
				setState(1385);
				switch ( getInterpreter().adaptivePredict(_input,151,_ctx) ) {
				case 1:
					{
					setState(1384);
					dims();
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1387);
				match(NEW);
				setState(1388);
				primitiveType();
				setState(1389);
				dims();
				setState(1390);
				arrayInitializer();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1392);
				match(NEW);
				setState(1393);
				classOrInterfaceType();
				setState(1394);
				dims();
				setState(1395);
				arrayInitializer();
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

	public static class ArrayInitializerContext extends ParserRuleContext {
		public VariableInitializerListContext variableInitializerList() {
			return getRuleContext(VariableInitializerListContext.class,0);
		}
		public ArrayInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterArrayInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitArrayInitializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitArrayInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayInitializerContext arrayInitializer() throws RecognitionException {
		ArrayInitializerContext _localctx = new ArrayInitializerContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_arrayInitializer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1399);
			match(LBRACE);
			setState(1401);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << CodeHole) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << NumberLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN) | (1L << LBRACE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (BANG - 64)) | (1L << (TILDE - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (Identifier - 64)))) != 0)) {
				{
				setState(1400);
				variableInitializerList();
				}
			}

			setState(1404);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(1403);
				match(COMMA);
				}
			}

			setState(1406);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableInitializerListContext extends ParserRuleContext {
		public List<VariableInitializerContext> variableInitializer() {
			return getRuleContexts(VariableInitializerContext.class);
		}
		public VariableInitializerContext variableInitializer(int i) {
			return getRuleContext(VariableInitializerContext.class,i);
		}
		public VariableInitializerListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableInitializerList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterVariableInitializerList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitVariableInitializerList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitVariableInitializerList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableInitializerListContext variableInitializerList() throws RecognitionException {
		VariableInitializerListContext _localctx = new VariableInitializerListContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_variableInitializerList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1408);
			variableInitializer();
			setState(1413);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,155,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1409);
					match(COMMA);
					setState(1410);
					variableInitializer();
					}
					} 
				}
				setState(1415);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,155,_ctx);
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

	public static class DimExprsContext extends ParserRuleContext {
		public List<DimExprContext> dimExpr() {
			return getRuleContexts(DimExprContext.class);
		}
		public DimExprContext dimExpr(int i) {
			return getRuleContext(DimExprContext.class,i);
		}
		public DimExprsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dimExprs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterDimExprs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitDimExprs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitDimExprs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DimExprsContext dimExprs() throws RecognitionException {
		DimExprsContext _localctx = new DimExprsContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_dimExprs);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1416);
			dimExpr();
			setState(1420);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,156,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1417);
					dimExpr();
					}
					} 
				}
				setState(1422);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,156,_ctx);
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

	public static class DimExprContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public DimExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dimExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterDimExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitDimExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitDimExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DimExprContext dimExpr() throws RecognitionException {
		DimExprContext _localctx = new DimExprContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_dimExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1423);
			match(LBRACK);
			setState(1424);
			expression();
			setState(1425);
			match(RBRACK);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ConstantExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterConstantExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitConstantExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitConstantExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantExpressionContext constantExpression() throws RecognitionException {
		ConstantExpressionContext _localctx = new ConstantExpressionContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_constantExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1427);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public LambdaExpressionContext lambdaExpression() {
			return getRuleContext(LambdaExpressionContext.class,0);
		}
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public TerminalNode CodeHole() { return getToken(Java8Parser.CodeHole, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_expression);
		try {
			setState(1432);
			switch ( getInterpreter().adaptivePredict(_input,157,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1429);
				lambdaExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1430);
				assignmentExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1431);
				match(CodeHole);
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

	public static class LambdaExpressionContext extends ParserRuleContext {
		public LambdaParametersContext lambdaParameters() {
			return getRuleContext(LambdaParametersContext.class,0);
		}
		public LambdaBodyContext lambdaBody() {
			return getRuleContext(LambdaBodyContext.class,0);
		}
		public LambdaExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterLambdaExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitLambdaExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitLambdaExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LambdaExpressionContext lambdaExpression() throws RecognitionException {
		LambdaExpressionContext _localctx = new LambdaExpressionContext(_ctx, getState());
		enterRule(_localctx, 228, RULE_lambdaExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1434);
			lambdaParameters();
			setState(1435);
			match(ARROW);
			setState(1436);
			lambdaBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LambdaParametersContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public LambdaParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterLambdaParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitLambdaParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitLambdaParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LambdaParametersContext lambdaParameters() throws RecognitionException {
		LambdaParametersContext _localctx = new LambdaParametersContext(_ctx, getState());
		enterRule(_localctx, 230, RULE_lambdaParameters);
		int _la;
		try {
			setState(1444);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(1438);
				match(Identifier);
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(1439);
				match(LPAREN);
				setState(1441);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << SHORT))) != 0) || _la==Identifier) {
					{
					setState(1440);
					formalParameters();
					}
				}

				setState(1443);
				match(RPAREN);
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

	public static class LambdaBodyContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public LambdaBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterLambdaBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitLambdaBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitLambdaBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LambdaBodyContext lambdaBody() throws RecognitionException {
		LambdaBodyContext _localctx = new LambdaBodyContext(_ctx, getState());
		enterRule(_localctx, 232, RULE_lambdaBody);
		try {
			setState(1448);
			switch ( getInterpreter().adaptivePredict(_input,160,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1446);
				expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class AssignmentExpressionContext extends ParserRuleContext {
		public ConditionalExpressionContext conditionalExpression() {
			return getRuleContext(ConditionalExpressionContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public AssignmentExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterAssignmentExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitAssignmentExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitAssignmentExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentExpressionContext assignmentExpression() throws RecognitionException {
		AssignmentExpressionContext _localctx = new AssignmentExpressionContext(_ctx, getState());
		enterRule(_localctx, 234, RULE_assignmentExpression);
		try {
			setState(1452);
			switch ( getInterpreter().adaptivePredict(_input,161,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1450);
				conditionalExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1451);
				assignment();
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

	public static class AssignmentContext extends ParserRuleContext {
		public LeftHandSideContext leftHandSide() {
			return getRuleContext(LeftHandSideContext.class,0);
		}
		public AssignmentOperatorContext assignmentOperator() {
			return getRuleContext(AssignmentOperatorContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 236, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1454);
			leftHandSide();
			setState(1455);
			assignmentOperator();
			setState(1456);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LeftHandSideContext extends ParserRuleContext {
		public ExpressionNameContext expressionName() {
			return getRuleContext(ExpressionNameContext.class,0);
		}
		public FieldAccessContext fieldAccess() {
			return getRuleContext(FieldAccessContext.class,0);
		}
		public ArrayAccessContext arrayAccess() {
			return getRuleContext(ArrayAccessContext.class,0);
		}
		public LeftHandSideContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_leftHandSide; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterLeftHandSide(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitLeftHandSide(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitLeftHandSide(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LeftHandSideContext leftHandSide() throws RecognitionException {
		LeftHandSideContext _localctx = new LeftHandSideContext(_ctx, getState());
		enterRule(_localctx, 238, RULE_leftHandSide);
		try {
			setState(1461);
			switch ( getInterpreter().adaptivePredict(_input,162,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1458);
				expressionName();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1459);
				fieldAccess();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1460);
				arrayAccess();
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

	public static class AssignmentOperatorContext extends ParserRuleContext {
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
		enterRule(_localctx, 240, RULE_assignmentOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1463);
			_la = _input.LA(1);
			if ( !(((((_la - 61)) & ~0x3f) == 0 && ((1L << (_la - 61)) & ((1L << (ASSIGN - 61)) | (1L << (ADD_ASSIGN - 61)) | (1L << (SUB_ASSIGN - 61)) | (1L << (MUL_ASSIGN - 61)) | (1L << (DIV_ASSIGN - 61)) | (1L << (AND_ASSIGN - 61)) | (1L << (OR_ASSIGN - 61)) | (1L << (XOR_ASSIGN - 61)) | (1L << (MOD_ASSIGN - 61)) | (1L << (LSHIFT_ASSIGN - 61)) | (1L << (RSHIFT_ASSIGN - 61)) | (1L << (URSHIFT_ASSIGN - 61)))) != 0)) ) {
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

	public static class ConditionalExpressionContext extends ParserRuleContext {
		public ConditionalOrExpressionContext conditionalOrExpression() {
			return getRuleContext(ConditionalOrExpressionContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ConditionalExpressionContext conditionalExpression() {
			return getRuleContext(ConditionalExpressionContext.class,0);
		}
		public ConditionalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterConditionalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitConditionalExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitConditionalExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalExpressionContext conditionalExpression() throws RecognitionException {
		ConditionalExpressionContext _localctx = new ConditionalExpressionContext(_ctx, getState());
		enterRule(_localctx, 242, RULE_conditionalExpression);
		try {
			setState(1472);
			switch ( getInterpreter().adaptivePredict(_input,163,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1465);
				conditionalOrExpression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1466);
				conditionalOrExpression(0);
				setState(1467);
				match(QUESTION);
				setState(1468);
				expression();
				setState(1469);
				match(COLON);
				setState(1470);
				conditionalExpression();
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

	public static class ConditionalOrExpressionContext extends ParserRuleContext {
		public ConditionalAndExpressionContext conditionalAndExpression() {
			return getRuleContext(ConditionalAndExpressionContext.class,0);
		}
		public ConditionalOrExpressionContext conditionalOrExpression() {
			return getRuleContext(ConditionalOrExpressionContext.class,0);
		}
		public ConditionalOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalOrExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterConditionalOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitConditionalOrExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitConditionalOrExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalOrExpressionContext conditionalOrExpression() throws RecognitionException {
		return conditionalOrExpression(0);
	}

	private ConditionalOrExpressionContext conditionalOrExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ConditionalOrExpressionContext _localctx = new ConditionalOrExpressionContext(_ctx, _parentState);
		ConditionalOrExpressionContext _prevctx = _localctx;
		int _startState = 244;
		enterRecursionRule(_localctx, 244, RULE_conditionalOrExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1475);
			conditionalAndExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(1482);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,164,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ConditionalOrExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_conditionalOrExpression);
					setState(1477);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1478);
					match(OR);
					setState(1479);
					conditionalAndExpression(0);
					}
					} 
				}
				setState(1484);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,164,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ConditionalAndExpressionContext extends ParserRuleContext {
		public InclusiveOrExpressionContext inclusiveOrExpression() {
			return getRuleContext(InclusiveOrExpressionContext.class,0);
		}
		public ConditionalAndExpressionContext conditionalAndExpression() {
			return getRuleContext(ConditionalAndExpressionContext.class,0);
		}
		public ConditionalAndExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalAndExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterConditionalAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitConditionalAndExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitConditionalAndExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalAndExpressionContext conditionalAndExpression() throws RecognitionException {
		return conditionalAndExpression(0);
	}

	private ConditionalAndExpressionContext conditionalAndExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ConditionalAndExpressionContext _localctx = new ConditionalAndExpressionContext(_ctx, _parentState);
		ConditionalAndExpressionContext _prevctx = _localctx;
		int _startState = 246;
		enterRecursionRule(_localctx, 246, RULE_conditionalAndExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1486);
			inclusiveOrExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(1493);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,165,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ConditionalAndExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_conditionalAndExpression);
					setState(1488);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1489);
					match(AND);
					setState(1490);
					inclusiveOrExpression(0);
					}
					} 
				}
				setState(1495);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,165,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class InclusiveOrExpressionContext extends ParserRuleContext {
		public ExclusiveOrExpressionContext exclusiveOrExpression() {
			return getRuleContext(ExclusiveOrExpressionContext.class,0);
		}
		public InclusiveOrExpressionContext inclusiveOrExpression() {
			return getRuleContext(InclusiveOrExpressionContext.class,0);
		}
		public InclusiveOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inclusiveOrExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterInclusiveOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitInclusiveOrExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitInclusiveOrExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InclusiveOrExpressionContext inclusiveOrExpression() throws RecognitionException {
		return inclusiveOrExpression(0);
	}

	private InclusiveOrExpressionContext inclusiveOrExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		InclusiveOrExpressionContext _localctx = new InclusiveOrExpressionContext(_ctx, _parentState);
		InclusiveOrExpressionContext _prevctx = _localctx;
		int _startState = 248;
		enterRecursionRule(_localctx, 248, RULE_inclusiveOrExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1497);
			exclusiveOrExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(1504);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,166,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new InclusiveOrExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_inclusiveOrExpression);
					setState(1499);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1500);
					match(BITOR);
					setState(1501);
					exclusiveOrExpression(0);
					}
					} 
				}
				setState(1506);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,166,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ExclusiveOrExpressionContext extends ParserRuleContext {
		public AndExpressionContext andExpression() {
			return getRuleContext(AndExpressionContext.class,0);
		}
		public ExclusiveOrExpressionContext exclusiveOrExpression() {
			return getRuleContext(ExclusiveOrExpressionContext.class,0);
		}
		public ExclusiveOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exclusiveOrExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterExclusiveOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitExclusiveOrExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitExclusiveOrExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExclusiveOrExpressionContext exclusiveOrExpression() throws RecognitionException {
		return exclusiveOrExpression(0);
	}

	private ExclusiveOrExpressionContext exclusiveOrExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExclusiveOrExpressionContext _localctx = new ExclusiveOrExpressionContext(_ctx, _parentState);
		ExclusiveOrExpressionContext _prevctx = _localctx;
		int _startState = 250;
		enterRecursionRule(_localctx, 250, RULE_exclusiveOrExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1508);
			andExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(1515);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,167,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExclusiveOrExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_exclusiveOrExpression);
					setState(1510);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1511);
					match(CARET);
					setState(1512);
					andExpression(0);
					}
					} 
				}
				setState(1517);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,167,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class AndExpressionContext extends ParserRuleContext {
		public EqualityExpressionContext equalityExpression() {
			return getRuleContext(EqualityExpressionContext.class,0);
		}
		public AndExpressionContext andExpression() {
			return getRuleContext(AndExpressionContext.class,0);
		}
		public AndExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_andExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitAndExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitAndExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AndExpressionContext andExpression() throws RecognitionException {
		return andExpression(0);
	}

	private AndExpressionContext andExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AndExpressionContext _localctx = new AndExpressionContext(_ctx, _parentState);
		AndExpressionContext _prevctx = _localctx;
		int _startState = 252;
		enterRecursionRule(_localctx, 252, RULE_andExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1519);
			equalityExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(1526);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,168,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AndExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_andExpression);
					setState(1521);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1522);
					match(BITAND);
					setState(1523);
					equalityExpression(0);
					}
					} 
				}
				setState(1528);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,168,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class EqualityExpressionContext extends ParserRuleContext {
		public RelationalExpressionContext relationalExpression() {
			return getRuleContext(RelationalExpressionContext.class,0);
		}
		public EqualityExpressionContext equalityExpression() {
			return getRuleContext(EqualityExpressionContext.class,0);
		}
		public EqualityExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equalityExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterEqualityExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitEqualityExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitEqualityExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EqualityExpressionContext equalityExpression() throws RecognitionException {
		return equalityExpression(0);
	}

	private EqualityExpressionContext equalityExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		EqualityExpressionContext _localctx = new EqualityExpressionContext(_ctx, _parentState);
		EqualityExpressionContext _prevctx = _localctx;
		int _startState = 254;
		enterRecursionRule(_localctx, 254, RULE_equalityExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1530);
			relationalExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(1540);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,170,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1538);
					switch ( getInterpreter().adaptivePredict(_input,169,_ctx) ) {
					case 1:
						{
						_localctx = new EqualityExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_equalityExpression);
						setState(1532);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1533);
						match(EQUAL);
						setState(1534);
						relationalExpression(0);
						}
						break;
					case 2:
						{
						_localctx = new EqualityExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_equalityExpression);
						setState(1535);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(1536);
						match(NOTEQUAL);
						setState(1537);
						relationalExpression(0);
						}
						break;
					}
					} 
				}
				setState(1542);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,170,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class RelationalExpressionContext extends ParserRuleContext {
		public ShiftExpressionContext shiftExpression() {
			return getRuleContext(ShiftExpressionContext.class,0);
		}
		public RelationalExpressionContext relationalExpression() {
			return getRuleContext(RelationalExpressionContext.class,0);
		}
		public ReferenceTypeContext referenceType() {
			return getRuleContext(ReferenceTypeContext.class,0);
		}
		public TerminalNode ClassRef() { return getToken(Java8Parser.ClassRef, 0); }
		public RelationalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationalExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterRelationalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitRelationalExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitRelationalExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationalExpressionContext relationalExpression() throws RecognitionException {
		return relationalExpression(0);
	}

	private RelationalExpressionContext relationalExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		RelationalExpressionContext _localctx = new RelationalExpressionContext(_ctx, _parentState);
		RelationalExpressionContext _prevctx = _localctx;
		int _startState = 256;
		enterRecursionRule(_localctx, 256, RULE_relationalExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1544);
			shiftExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(1566);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,173,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1564);
					switch ( getInterpreter().adaptivePredict(_input,172,_ctx) ) {
					case 1:
						{
						_localctx = new RelationalExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
						setState(1546);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(1547);
						match(LT);
						setState(1548);
						shiftExpression(0);
						}
						break;
					case 2:
						{
						_localctx = new RelationalExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
						setState(1549);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(1550);
						match(GT);
						setState(1551);
						shiftExpression(0);
						}
						break;
					case 3:
						{
						_localctx = new RelationalExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
						setState(1552);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1553);
						match(LE);
						setState(1554);
						shiftExpression(0);
						}
						break;
					case 4:
						{
						_localctx = new RelationalExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
						setState(1555);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1556);
						match(GE);
						setState(1557);
						shiftExpression(0);
						}
						break;
					case 5:
						{
						_localctx = new RelationalExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
						setState(1558);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(1559);
						match(INSTANCEOF);
						setState(1562);
						switch (_input.LA(1)) {
						case BOOLEAN:
						case BYTE:
						case CHAR:
						case DOUBLE:
						case FLOAT:
						case INT:
						case LONG:
						case SHORT:
						case Identifier:
							{
							setState(1560);
							referenceType();
							}
							break;
						case ClassRef:
							{
							setState(1561);
							match(ClassRef);
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						}
						break;
					}
					} 
				}
				setState(1568);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,173,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ShiftExpressionContext extends ParserRuleContext {
		public AdditiveExpressionContext additiveExpression() {
			return getRuleContext(AdditiveExpressionContext.class,0);
		}
		public ShiftExpressionContext shiftExpression() {
			return getRuleContext(ShiftExpressionContext.class,0);
		}
		public ShiftExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shiftExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterShiftExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitShiftExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitShiftExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShiftExpressionContext shiftExpression() throws RecognitionException {
		return shiftExpression(0);
	}

	private ShiftExpressionContext shiftExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ShiftExpressionContext _localctx = new ShiftExpressionContext(_ctx, _parentState);
		ShiftExpressionContext _prevctx = _localctx;
		int _startState = 258;
		enterRecursionRule(_localctx, 258, RULE_shiftExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1570);
			additiveExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(1587);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,175,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1585);
					switch ( getInterpreter().adaptivePredict(_input,174,_ctx) ) {
					case 1:
						{
						_localctx = new ShiftExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_shiftExpression);
						setState(1572);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1573);
						match(LT);
						setState(1574);
						match(LT);
						setState(1575);
						additiveExpression(0);
						}
						break;
					case 2:
						{
						_localctx = new ShiftExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_shiftExpression);
						setState(1576);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1577);
						match(GT);
						setState(1578);
						match(GT);
						setState(1579);
						additiveExpression(0);
						}
						break;
					case 3:
						{
						_localctx = new ShiftExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_shiftExpression);
						setState(1580);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(1581);
						match(GT);
						setState(1582);
						match(GT);
						setState(1583);
						match(GT);
						setState(1584);
						additiveExpression(0);
						}
						break;
					}
					} 
				}
				setState(1589);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,175,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class AdditiveExpressionContext extends ParserRuleContext {
		public MultiplicativeExpressionContext multiplicativeExpression() {
			return getRuleContext(MultiplicativeExpressionContext.class,0);
		}
		public AdditiveExpressionContext additiveExpression() {
			return getRuleContext(AdditiveExpressionContext.class,0);
		}
		public AdditiveExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additiveExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterAdditiveExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitAdditiveExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitAdditiveExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AdditiveExpressionContext additiveExpression() throws RecognitionException {
		return additiveExpression(0);
	}

	private AdditiveExpressionContext additiveExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AdditiveExpressionContext _localctx = new AdditiveExpressionContext(_ctx, _parentState);
		AdditiveExpressionContext _prevctx = _localctx;
		int _startState = 260;
		enterRecursionRule(_localctx, 260, RULE_additiveExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1591);
			multiplicativeExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(1601);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,177,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1599);
					switch ( getInterpreter().adaptivePredict(_input,176,_ctx) ) {
					case 1:
						{
						_localctx = new AdditiveExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_additiveExpression);
						setState(1593);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1594);
						match(ADD);
						setState(1595);
						multiplicativeExpression(0);
						}
						break;
					case 2:
						{
						_localctx = new AdditiveExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_additiveExpression);
						setState(1596);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(1597);
						match(SUB);
						setState(1598);
						multiplicativeExpression(0);
						}
						break;
					}
					} 
				}
				setState(1603);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,177,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class MultiplicativeExpressionContext extends ParserRuleContext {
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public MultiplicativeExpressionContext multiplicativeExpression() {
			return getRuleContext(MultiplicativeExpressionContext.class,0);
		}
		public MultiplicativeExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicativeExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterMultiplicativeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitMultiplicativeExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitMultiplicativeExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiplicativeExpressionContext multiplicativeExpression() throws RecognitionException {
		return multiplicativeExpression(0);
	}

	private MultiplicativeExpressionContext multiplicativeExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		MultiplicativeExpressionContext _localctx = new MultiplicativeExpressionContext(_ctx, _parentState);
		MultiplicativeExpressionContext _prevctx = _localctx;
		int _startState = 262;
		enterRecursionRule(_localctx, 262, RULE_multiplicativeExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1605);
			unaryExpression();
			}
			_ctx.stop = _input.LT(-1);
			setState(1618);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,179,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1616);
					switch ( getInterpreter().adaptivePredict(_input,178,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplicativeExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeExpression);
						setState(1607);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1608);
						match(MUL);
						setState(1609);
						unaryExpression();
						}
						break;
					case 2:
						{
						_localctx = new MultiplicativeExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeExpression);
						setState(1610);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1611);
						match(DIV);
						setState(1612);
						unaryExpression();
						}
						break;
					case 3:
						{
						_localctx = new MultiplicativeExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeExpression);
						setState(1613);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(1614);
						match(MOD);
						setState(1615);
						unaryExpression();
						}
						break;
					}
					} 
				}
				setState(1620);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,179,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class UnaryExpressionContext extends ParserRuleContext {
		public PreIncrementExpressionContext preIncrementExpression() {
			return getRuleContext(PreIncrementExpressionContext.class,0);
		}
		public PreDecrementExpressionContext preDecrementExpression() {
			return getRuleContext(PreDecrementExpressionContext.class,0);
		}
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public UnaryExpressionNotPlusMinusContext unaryExpressionNotPlusMinus() {
			return getRuleContext(UnaryExpressionNotPlusMinusContext.class,0);
		}
		public UnaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterUnaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitUnaryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitUnaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryExpressionContext unaryExpression() throws RecognitionException {
		UnaryExpressionContext _localctx = new UnaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 264, RULE_unaryExpression);
		try {
			setState(1628);
			switch (_input.LA(1)) {
			case INC:
				enterOuterAlt(_localctx, 1);
				{
				setState(1621);
				preIncrementExpression();
				}
				break;
			case DEC:
				enterOuterAlt(_localctx, 2);
				{
				setState(1622);
				preDecrementExpression();
				}
				break;
			case ADD:
				enterOuterAlt(_localctx, 3);
				{
				setState(1623);
				match(ADD);
				setState(1624);
				unaryExpression();
				}
				break;
			case SUB:
				enterOuterAlt(_localctx, 4);
				{
				setState(1625);
				match(SUB);
				setState(1626);
				unaryExpression();
				}
				break;
			case T__1:
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case NEW:
			case SHORT:
			case SUPER:
			case THIS:
			case NumberLiteral:
			case BooleanLiteral:
			case CharacterLiteral:
			case StringLiteral:
			case NullLiteral:
			case LPAREN:
			case BANG:
			case TILDE:
			case Identifier:
				enterOuterAlt(_localctx, 5);
				{
				setState(1627);
				unaryExpressionNotPlusMinus();
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

	public static class PreIncrementExpressionContext extends ParserRuleContext {
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public PreIncrementExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_preIncrementExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterPreIncrementExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitPreIncrementExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitPreIncrementExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PreIncrementExpressionContext preIncrementExpression() throws RecognitionException {
		PreIncrementExpressionContext _localctx = new PreIncrementExpressionContext(_ctx, getState());
		enterRule(_localctx, 266, RULE_preIncrementExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1630);
			match(INC);
			setState(1631);
			unaryExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PreDecrementExpressionContext extends ParserRuleContext {
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public PreDecrementExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_preDecrementExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterPreDecrementExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitPreDecrementExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitPreDecrementExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PreDecrementExpressionContext preDecrementExpression() throws RecognitionException {
		PreDecrementExpressionContext _localctx = new PreDecrementExpressionContext(_ctx, getState());
		enterRule(_localctx, 268, RULE_preDecrementExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1633);
			match(DEC);
			setState(1634);
			unaryExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnaryExpressionNotPlusMinusContext extends ParserRuleContext {
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public CastExpressionContext castExpression() {
			return getRuleContext(CastExpressionContext.class,0);
		}
		public UnaryExpressionNotPlusMinusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpressionNotPlusMinus; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterUnaryExpressionNotPlusMinus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitUnaryExpressionNotPlusMinus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitUnaryExpressionNotPlusMinus(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryExpressionNotPlusMinusContext unaryExpressionNotPlusMinus() throws RecognitionException {
		UnaryExpressionNotPlusMinusContext _localctx = new UnaryExpressionNotPlusMinusContext(_ctx, getState());
		enterRule(_localctx, 270, RULE_unaryExpressionNotPlusMinus);
		try {
			setState(1642);
			switch ( getInterpreter().adaptivePredict(_input,181,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1636);
				postfixExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1637);
				match(TILDE);
				setState(1638);
				unaryExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1639);
				match(BANG);
				setState(1640);
				unaryExpression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1641);
				castExpression();
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

	public static class PostfixExpressionContext extends ParserRuleContext {
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public ExpressionNameContext expressionName() {
			return getRuleContext(ExpressionNameContext.class,0);
		}
		public List<PostIncrementExpression_lf_postfixExpressionContext> postIncrementExpression_lf_postfixExpression() {
			return getRuleContexts(PostIncrementExpression_lf_postfixExpressionContext.class);
		}
		public PostIncrementExpression_lf_postfixExpressionContext postIncrementExpression_lf_postfixExpression(int i) {
			return getRuleContext(PostIncrementExpression_lf_postfixExpressionContext.class,i);
		}
		public List<PostDecrementExpression_lf_postfixExpressionContext> postDecrementExpression_lf_postfixExpression() {
			return getRuleContexts(PostDecrementExpression_lf_postfixExpressionContext.class);
		}
		public PostDecrementExpression_lf_postfixExpressionContext postDecrementExpression_lf_postfixExpression(int i) {
			return getRuleContext(PostDecrementExpression_lf_postfixExpressionContext.class,i);
		}
		public PostfixExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfixExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterPostfixExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitPostfixExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitPostfixExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PostfixExpressionContext postfixExpression() throws RecognitionException {
		PostfixExpressionContext _localctx = new PostfixExpressionContext(_ctx, getState());
		enterRule(_localctx, 272, RULE_postfixExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1646);
			switch ( getInterpreter().adaptivePredict(_input,182,_ctx) ) {
			case 1:
				{
				setState(1644);
				primary();
				}
				break;
			case 2:
				{
				setState(1645);
				expressionName();
				}
				break;
			}
			setState(1652);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,184,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(1650);
					switch (_input.LA(1)) {
					case INC:
						{
						setState(1648);
						postIncrementExpression_lf_postfixExpression();
						}
						break;
					case DEC:
						{
						setState(1649);
						postDecrementExpression_lf_postfixExpression();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(1654);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,184,_ctx);
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

	public static class PostIncrementExpressionContext extends ParserRuleContext {
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public PostIncrementExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postIncrementExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterPostIncrementExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitPostIncrementExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitPostIncrementExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PostIncrementExpressionContext postIncrementExpression() throws RecognitionException {
		PostIncrementExpressionContext _localctx = new PostIncrementExpressionContext(_ctx, getState());
		enterRule(_localctx, 274, RULE_postIncrementExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1655);
			postfixExpression();
			setState(1656);
			match(INC);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PostIncrementExpression_lf_postfixExpressionContext extends ParserRuleContext {
		public PostIncrementExpression_lf_postfixExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postIncrementExpression_lf_postfixExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterPostIncrementExpression_lf_postfixExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitPostIncrementExpression_lf_postfixExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitPostIncrementExpression_lf_postfixExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PostIncrementExpression_lf_postfixExpressionContext postIncrementExpression_lf_postfixExpression() throws RecognitionException {
		PostIncrementExpression_lf_postfixExpressionContext _localctx = new PostIncrementExpression_lf_postfixExpressionContext(_ctx, getState());
		enterRule(_localctx, 276, RULE_postIncrementExpression_lf_postfixExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1658);
			match(INC);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PostDecrementExpressionContext extends ParserRuleContext {
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public PostDecrementExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postDecrementExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterPostDecrementExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitPostDecrementExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitPostDecrementExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PostDecrementExpressionContext postDecrementExpression() throws RecognitionException {
		PostDecrementExpressionContext _localctx = new PostDecrementExpressionContext(_ctx, getState());
		enterRule(_localctx, 278, RULE_postDecrementExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1660);
			postfixExpression();
			setState(1661);
			match(DEC);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PostDecrementExpression_lf_postfixExpressionContext extends ParserRuleContext {
		public PostDecrementExpression_lf_postfixExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postDecrementExpression_lf_postfixExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterPostDecrementExpression_lf_postfixExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitPostDecrementExpression_lf_postfixExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitPostDecrementExpression_lf_postfixExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PostDecrementExpression_lf_postfixExpressionContext postDecrementExpression_lf_postfixExpression() throws RecognitionException {
		PostDecrementExpression_lf_postfixExpressionContext _localctx = new PostDecrementExpression_lf_postfixExpressionContext(_ctx, getState());
		enterRule(_localctx, 280, RULE_postDecrementExpression_lf_postfixExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1663);
			match(DEC);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CastExpressionContext extends ParserRuleContext {
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public ReferenceTypeContext referenceType() {
			return getRuleContext(ReferenceTypeContext.class,0);
		}
		public UnaryExpressionNotPlusMinusContext unaryExpressionNotPlusMinus() {
			return getRuleContext(UnaryExpressionNotPlusMinusContext.class,0);
		}
		public List<AdditionalBoundContext> additionalBound() {
			return getRuleContexts(AdditionalBoundContext.class);
		}
		public AdditionalBoundContext additionalBound(int i) {
			return getRuleContext(AdditionalBoundContext.class,i);
		}
		public LambdaExpressionContext lambdaExpression() {
			return getRuleContext(LambdaExpressionContext.class,0);
		}
		public TerminalNode ClassRef() { return getToken(Java8Parser.ClassRef, 0); }
		public List<AdditionalBoundOrClassRefContext> additionalBoundOrClassRef() {
			return getRuleContexts(AdditionalBoundOrClassRefContext.class);
		}
		public AdditionalBoundOrClassRefContext additionalBoundOrClassRef(int i) {
			return getRuleContext(AdditionalBoundOrClassRefContext.class,i);
		}
		public CastExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_castExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterCastExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitCastExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitCastExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CastExpressionContext castExpression() throws RecognitionException {
		CastExpressionContext _localctx = new CastExpressionContext(_ctx, getState());
		enterRule(_localctx, 282, RULE_castExpression);
		int _la;
		try {
			setState(1716);
			switch ( getInterpreter().adaptivePredict(_input,189,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1665);
				match(LPAREN);
				setState(1666);
				primitiveType();
				setState(1667);
				match(RPAREN);
				setState(1668);
				unaryExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1670);
				match(LPAREN);
				setState(1671);
				referenceType();
				setState(1675);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==BITAND) {
					{
					{
					setState(1672);
					additionalBound();
					}
					}
					setState(1677);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1678);
				match(RPAREN);
				setState(1679);
				unaryExpressionNotPlusMinus();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1681);
				match(LPAREN);
				setState(1682);
				referenceType();
				setState(1686);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==BITAND) {
					{
					{
					setState(1683);
					additionalBound();
					}
					}
					setState(1688);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1689);
				match(RPAREN);
				setState(1690);
				lambdaExpression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1692);
				match(LPAREN);
				setState(1693);
				match(ClassRef);
				setState(1694);
				match(RPAREN);
				setState(1695);
				unaryExpression();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1696);
				match(LPAREN);
				setState(1697);
				match(ClassRef);
				setState(1701);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==BITAND) {
					{
					{
					setState(1698);
					additionalBoundOrClassRef();
					}
					}
					setState(1703);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1704);
				match(RPAREN);
				setState(1705);
				unaryExpressionNotPlusMinus();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1706);
				match(LPAREN);
				setState(1707);
				match(ClassRef);
				setState(1711);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==BITAND) {
					{
					{
					setState(1708);
					additionalBoundOrClassRef();
					}
					}
					setState(1713);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1714);
				match(RPAREN);
				setState(1715);
				lambdaExpression();
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

	public static class AdditionalBoundOrClassRefContext extends ParserRuleContext {
		public InterfaceTypeContext interfaceType() {
			return getRuleContext(InterfaceTypeContext.class,0);
		}
		public TerminalNode ClassRef() { return getToken(Java8Parser.ClassRef, 0); }
		public AdditionalBoundOrClassRefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additionalBoundOrClassRef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterAdditionalBoundOrClassRef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitAdditionalBoundOrClassRef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitAdditionalBoundOrClassRef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AdditionalBoundOrClassRefContext additionalBoundOrClassRef() throws RecognitionException {
		AdditionalBoundOrClassRefContext _localctx = new AdditionalBoundOrClassRefContext(_ctx, getState());
		enterRule(_localctx, 284, RULE_additionalBoundOrClassRef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1718);
			match(BITAND);
			setState(1721);
			switch (_input.LA(1)) {
			case Identifier:
				{
				setState(1719);
				interfaceType();
				}
				break;
			case ClassRef:
				{
				setState(1720);
				match(ClassRef);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 25:
			return packageOrTypeName_sempred((PackageOrTypeNameContext)_localctx, predIndex);
		case 28:
			return ambiguousName_sempred((AmbiguousNameContext)_localctx, predIndex);
		case 122:
			return conditionalOrExpression_sempred((ConditionalOrExpressionContext)_localctx, predIndex);
		case 123:
			return conditionalAndExpression_sempred((ConditionalAndExpressionContext)_localctx, predIndex);
		case 124:
			return inclusiveOrExpression_sempred((InclusiveOrExpressionContext)_localctx, predIndex);
		case 125:
			return exclusiveOrExpression_sempred((ExclusiveOrExpressionContext)_localctx, predIndex);
		case 126:
			return andExpression_sempred((AndExpressionContext)_localctx, predIndex);
		case 127:
			return equalityExpression_sempred((EqualityExpressionContext)_localctx, predIndex);
		case 128:
			return relationalExpression_sempred((RelationalExpressionContext)_localctx, predIndex);
		case 129:
			return shiftExpression_sempred((ShiftExpressionContext)_localctx, predIndex);
		case 130:
			return additiveExpression_sempred((AdditiveExpressionContext)_localctx, predIndex);
		case 131:
			return multiplicativeExpression_sempred((MultiplicativeExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean packageOrTypeName_sempred(PackageOrTypeNameContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean ambiguousName_sempred(AmbiguousNameContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean conditionalOrExpression_sempred(ConditionalOrExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean conditionalAndExpression_sempred(ConditionalAndExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean inclusiveOrExpression_sempred(InclusiveOrExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean exclusiveOrExpression_sempred(ExclusiveOrExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean andExpression_sempred(AndExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean equalityExpression_sempred(EqualityExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 7:
			return precpred(_ctx, 2);
		case 8:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean relationalExpression_sempred(RelationalExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 9:
			return precpred(_ctx, 5);
		case 10:
			return precpred(_ctx, 4);
		case 11:
			return precpred(_ctx, 3);
		case 12:
			return precpred(_ctx, 2);
		case 13:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean shiftExpression_sempred(ShiftExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 14:
			return precpred(_ctx, 3);
		case 15:
			return precpred(_ctx, 2);
		case 16:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean additiveExpression_sempred(AdditiveExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 17:
			return precpred(_ctx, 2);
		case 18:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean multiplicativeExpression_sempred(MultiplicativeExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 19:
			return precpred(_ctx, 3);
		case 20:
			return precpred(_ctx, 2);
		case 21:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3d\u06be\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
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
		"\t\u008e\4\u008f\t\u008f\4\u0090\t\u0090\3\2\3\2\3\3\3\3\5\3\u0125\n\3"+
		"\3\4\3\4\5\4\u0129\n\4\3\5\3\5\5\5\u012d\n\5\3\6\3\6\3\7\3\7\3\b\3\b\3"+
		"\b\5\b\u0136\n\b\3\t\3\t\5\t\u013a\n\t\3\t\3\t\7\t\u013e\n\t\f\t\16\t"+
		"\u0141\13\t\3\n\3\n\5\n\u0145\n\n\3\n\3\n\3\n\3\n\5\n\u014b\n\n\5\n\u014d"+
		"\n\n\3\13\3\13\3\13\5\13\u0152\n\13\3\f\3\f\5\f\u0156\n\f\3\r\3\r\3\16"+
		"\3\16\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u0166\n\20"+
		"\3\21\3\21\3\21\3\21\7\21\u016c\n\21\f\21\16\21\u016f\13\21\3\22\3\22"+
		"\5\22\u0173\n\22\3\23\3\23\3\23\3\23\3\23\7\23\u017a\n\23\f\23\16\23\u017d"+
		"\13\23\5\23\u017f\n\23\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\26\3\26\3"+
		"\26\7\26\u018b\n\26\f\26\16\26\u018e\13\26\3\27\3\27\3\27\5\27\u0193\n"+
		"\27\3\30\3\30\5\30\u0197\n\30\3\31\3\31\3\31\3\31\5\31\u019d\n\31\3\32"+
		"\3\32\3\32\3\32\3\32\5\32\u01a4\n\32\3\33\3\33\3\33\3\33\3\33\3\33\7\33"+
		"\u01ac\n\33\f\33\16\33\u01af\13\33\3\34\3\34\3\34\3\34\3\34\5\34\u01b6"+
		"\n\34\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\7\36\u01c0\n\36\f\36\16"+
		"\36\u01c3\13\36\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3!\3!\3!\7!\u01d0\n!\f"+
		"!\16!\u01d3\13!\3\"\3\"\3\"\7\"\u01d8\n\"\f\"\16\"\u01db\13\"\3#\3#\3"+
		"#\5#\u01e0\n#\3$\3$\3%\3%\5%\u01e6\n%\3&\3&\5&\u01ea\n&\3\'\3\'\5\'\u01ee"+
		"\n\'\3(\3(\3(\5(\u01f3\n(\3)\3)\5)\u01f7\n)\3)\3)\7)\u01fb\n)\f)\16)\u01fe"+
		"\13)\3*\3*\5*\u0202\n*\3*\3*\3*\3*\5*\u0208\n*\5*\u020a\n*\3+\3+\3+\5"+
		"+\u020f\n+\3,\3,\5,\u0213\n,\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\61"+
		"\3\61\3\61\3\61\3\61\3\61\3\61\5\61\u0226\n\61\3\62\3\62\3\62\5\62\u022b"+
		"\n\62\3\62\3\62\3\62\3\62\3\63\3\63\3\63\7\63\u0234\n\63\f\63\16\63\u0237"+
		"\13\63\3\63\3\63\3\63\7\63\u023c\n\63\f\63\16\63\u023f\13\63\5\63\u0241"+
		"\n\63\3\64\3\64\3\65\3\65\3\65\5\65\u0248\n\65\3\65\3\65\3\66\3\66\3\66"+
		"\7\66\u024f\n\66\f\66\16\66\u0252\13\66\3\67\3\67\5\67\u0256\n\67\38\3"+
		"8\39\59\u025b\n9\39\39\39\59\u0260\n9\39\39\59\u0264\n9\39\39\39\59\u0269"+
		"\n9\39\39\39\39\59\u026f\n9\39\39\39\59\u0274\n9\39\39\39\39\39\59\u027b"+
		"\n9\39\39\39\59\u0280\n9\39\39\59\u0284\n9\3:\3:\3;\3;\3;\7;\u028b\n;"+
		"\f;\16;\u028e\13;\3<\3<\3<\3<\3<\3<\5<\u0296\n<\3=\3=\3=\3=\3=\3=\3=\3"+
		"=\3=\3=\3=\5=\u02a3\n=\3>\3>\3?\3?\3@\3@\3@\3@\3@\3@\3@\5@\u02b0\n@\3"+
		"A\3A\3B\3B\3B\3B\3B\3B\3B\5B\u02bb\nB\3C\3C\3C\3C\3C\3D\3D\3D\3D\3D\5"+
		"D\u02c7\nD\3E\3E\3F\3F\3G\3G\3H\3H\5H\u02d1\nH\3I\3I\5I\u02d5\nI\3J\3"+
		"J\5J\u02d9\nJ\3K\3K\3K\3L\3L\3L\3L\3L\3M\3M\3N\3N\3N\3N\3N\3O\3O\3P\3"+
		"P\3P\7P\u02ef\nP\fP\16P\u02f2\13P\3Q\3Q\3Q\3Q\3Q\3R\3R\5R\u02fb\nR\3R"+
		"\7R\u02fe\nR\fR\16R\u0301\13R\3S\3S\3S\3S\7S\u0307\nS\fS\16S\u030a\13"+
		"S\3S\3S\3S\3S\3S\3S\3S\3S\3S\3S\3S\3S\3S\3S\3S\3S\3S\3S\3S\3S\5S\u0320"+
		"\nS\3T\3T\3U\3U\3U\3U\7U\u0328\nU\fU\16U\u032b\13U\3U\3U\3U\3U\3U\3U\3"+
		"U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\5U\u0340\nU\3V\3V\3V\3V\3V\5V\u0347"+
		"\nV\3W\3W\3X\3X\3X\3X\5X\u034f\nX\3Y\3Y\3Y\3Y\7Y\u0355\nY\fY\16Y\u0358"+
		"\13Y\3Y\3Y\3Y\3Y\3Y\3Y\7Y\u0360\nY\fY\16Y\u0363\13Y\3Y\3Y\3Y\3Y\3Y\3Y"+
		"\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\5Y\u0379\nY\3Z\3Z\3[\3[\3["+
		"\3[\7[\u0381\n[\f[\16[\u0384\13[\3[\3[\3[\3[\3[\3[\7[\u038c\n[\f[\16["+
		"\u038f\13[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\5"+
		"[\u03a4\n[\3\\\3\\\5\\\u03a8\n\\\3\\\3\\\3\\\7\\\u03ad\n\\\f\\\16\\\u03b0"+
		"\13\\\3\\\5\\\u03b3\n\\\3\\\3\\\5\\\u03b7\n\\\3\\\3\\\3\\\3\\\3\\\5\\"+
		"\u03be\n\\\3\\\3\\\5\\\u03c2\n\\\3\\\3\\\5\\\u03c6\n\\\3\\\3\\\3\\\3\\"+
		"\3\\\3\\\5\\\u03ce\n\\\3\\\3\\\5\\\u03d2\n\\\3\\\3\\\5\\\u03d6\n\\\3\\"+
		"\3\\\5\\\u03da\n\\\3]\3]\3]\5]\u03df\n]\3]\3]\5]\u03e3\n]\3]\3]\5]\u03e7"+
		"\n]\3]\3]\3^\3^\5^\u03ed\n^\3^\3^\3^\7^\u03f2\n^\f^\16^\u03f5\13^\3^\5"+
		"^\u03f8\n^\3^\3^\5^\u03fc\n^\3^\3^\3^\3^\3^\5^\u0403\n^\3^\3^\5^\u0407"+
		"\n^\3^\3^\5^\u040b\n^\3^\3^\5^\u040f\n^\3_\3_\3_\5_\u0414\n_\3`\3`\3`"+
		"\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\5`\u0423\n`\3a\3a\3a\3b\3b\3b\3b\3b\3b"+
		"\3b\3b\3b\5b\u0431\nb\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\5c\u043d\nc\3c\3c"+
		"\3c\3c\3c\7c\u0444\nc\fc\16c\u0447\13c\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\7"+
		"d\u0453\nd\fd\16d\u0456\13d\3e\3e\3e\3e\3e\3e\3e\3e\3e\3e\5e\u0462\ne"+
		"\3e\3e\3e\3e\3e\7e\u0469\ne\fe\16e\u046c\13e\3f\3f\3f\5f\u0471\nf\3f\3"+
		"f\3f\3f\3f\5f\u0478\nf\3f\3f\3f\5f\u047d\nf\3f\3f\3f\3f\3f\5f\u0484\n"+
		"f\3f\3f\3f\5f\u0489\nf\3f\3f\3f\3f\3f\5f\u0490\nf\3f\3f\3f\5f\u0495\n"+
		"f\3f\3f\3f\3f\3f\5f\u049c\nf\3f\3f\3f\5f\u04a1\nf\3f\3f\3f\3f\3f\3f\5"+
		"f\u04a9\nf\3f\3f\3f\5f\u04ae\nf\3f\3f\5f\u04b2\nf\3g\3g\5g\u04b6\ng\3"+
		"g\3g\3g\5g\u04bb\ng\3g\3g\3h\3h\3h\5h\u04c2\nh\3h\3h\3h\3h\3h\5h\u04c9"+
		"\nh\3h\3h\3h\5h\u04ce\nh\3h\3h\3h\3h\3h\5h\u04d5\nh\3h\3h\3h\5h\u04da"+
		"\nh\3h\3h\3h\3h\3h\5h\u04e1\nh\3h\3h\3h\5h\u04e6\nh\3h\3h\3h\3h\3h\3h"+
		"\5h\u04ee\nh\3h\3h\3h\5h\u04f3\nh\3h\3h\5h\u04f7\nh\3i\3i\3i\7i\u04fc"+
		"\ni\fi\16i\u04ff\13i\3j\3j\3j\5j\u0504\nj\3j\3j\3j\3j\3j\5j\u050b\nj\3"+
		"j\3j\3j\3j\3j\5j\u0512\nj\3j\3j\3j\3j\3j\5j\u0519\nj\3j\3j\3j\3j\3j\3"+
		"j\5j\u0521\nj\3j\3j\3j\3j\3j\5j\u0528\nj\3j\3j\3j\3j\3j\3j\5j\u0530\n"+
		"j\3k\3k\5k\u0534\nk\3k\3k\3l\3l\3l\5l\u053b\nl\3l\3l\3l\3l\3l\5l\u0542"+
		"\nl\3l\3l\3l\3l\3l\5l\u0549\nl\3l\3l\3l\3l\3l\3l\5l\u0551\nl\3l\3l\3l"+
		"\3l\3l\5l\u0558\nl\3l\3l\3l\3l\3l\3l\5l\u0560\nl\3m\3m\3m\3m\5m\u0566"+
		"\nm\3m\3m\3m\3m\5m\u056c\nm\3m\3m\3m\3m\3m\3m\3m\3m\3m\3m\5m\u0578\nm"+
		"\3n\3n\5n\u057c\nn\3n\5n\u057f\nn\3n\3n\3o\3o\3o\7o\u0586\no\fo\16o\u0589"+
		"\13o\3p\3p\7p\u058d\np\fp\16p\u0590\13p\3q\3q\3q\3q\3r\3r\3s\3s\3s\5s"+
		"\u059b\ns\3t\3t\3t\3t\3u\3u\3u\5u\u05a4\nu\3u\5u\u05a7\nu\3v\3v\5v\u05ab"+
		"\nv\3w\3w\5w\u05af\nw\3x\3x\3x\3x\3y\3y\3y\5y\u05b8\ny\3z\3z\3{\3{\3{"+
		"\3{\3{\3{\3{\5{\u05c3\n{\3|\3|\3|\3|\3|\3|\7|\u05cb\n|\f|\16|\u05ce\13"+
		"|\3}\3}\3}\3}\3}\3}\7}\u05d6\n}\f}\16}\u05d9\13}\3~\3~\3~\3~\3~\3~\7~"+
		"\u05e1\n~\f~\16~\u05e4\13~\3\177\3\177\3\177\3\177\3\177\3\177\7\177\u05ec"+
		"\n\177\f\177\16\177\u05ef\13\177\3\u0080\3\u0080\3\u0080\3\u0080\3\u0080"+
		"\3\u0080\7\u0080\u05f7\n\u0080\f\u0080\16\u0080\u05fa\13\u0080\3\u0081"+
		"\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\7\u0081"+
		"\u0605\n\u0081\f\u0081\16\u0081\u0608\13\u0081\3\u0082\3\u0082\3\u0082"+
		"\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082"+
		"\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\5\u0082\u061d"+
		"\n\u0082\7\u0082\u061f\n\u0082\f\u0082\16\u0082\u0622\13\u0082\3\u0083"+
		"\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083"+
		"\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\7\u0083\u0634\n\u0083"+
		"\f\u0083\16\u0083\u0637\13\u0083\3\u0084\3\u0084\3\u0084\3\u0084\3\u0084"+
		"\3\u0084\3\u0084\3\u0084\3\u0084\7\u0084\u0642\n\u0084\f\u0084\16\u0084"+
		"\u0645\13\u0084\3\u0085\3\u0085\3\u0085\3\u0085\3\u0085\3\u0085\3\u0085"+
		"\3\u0085\3\u0085\3\u0085\3\u0085\3\u0085\7\u0085\u0653\n\u0085\f\u0085"+
		"\16\u0085\u0656\13\u0085\3\u0086\3\u0086\3\u0086\3\u0086\3\u0086\3\u0086"+
		"\3\u0086\5\u0086\u065f\n\u0086\3\u0087\3\u0087\3\u0087\3\u0088\3\u0088"+
		"\3\u0088\3\u0089\3\u0089\3\u0089\3\u0089\3\u0089\3\u0089\5\u0089\u066d"+
		"\n\u0089\3\u008a\3\u008a\5\u008a\u0671\n\u008a\3\u008a\3\u008a\7\u008a"+
		"\u0675\n\u008a\f\u008a\16\u008a\u0678\13\u008a\3\u008b\3\u008b\3\u008b"+
		"\3\u008c\3\u008c\3\u008d\3\u008d\3\u008d\3\u008e\3\u008e\3\u008f\3\u008f"+
		"\3\u008f\3\u008f\3\u008f\3\u008f\3\u008f\3\u008f\7\u008f\u068c\n\u008f"+
		"\f\u008f\16\u008f\u068f\13\u008f\3\u008f\3\u008f\3\u008f\3\u008f\3\u008f"+
		"\3\u008f\7\u008f\u0697\n\u008f\f\u008f\16\u008f\u069a\13\u008f\3\u008f"+
		"\3\u008f\3\u008f\3\u008f\3\u008f\3\u008f\3\u008f\3\u008f\3\u008f\3\u008f"+
		"\7\u008f\u06a6\n\u008f\f\u008f\16\u008f\u06a9\13\u008f\3\u008f\3\u008f"+
		"\3\u008f\3\u008f\3\u008f\7\u008f\u06b0\n\u008f\f\u008f\16\u008f\u06b3"+
		"\13\u008f\3\u008f\3\u008f\5\u008f\u06b7\n\u008f\3\u0090\3\u0090\3\u0090"+
		"\5\u0090\u06bc\n\u0090\3\u0090\2\16\64:\u00f6\u00f8\u00fa\u00fc\u00fe"+
		"\u0100\u0102\u0104\u0106\u0108\u0091\2\4\6\b\n\f\16\20\22\24\26\30\32"+
		"\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080"+
		"\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098"+
		"\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0"+
		"\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8"+
		"\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8\u00da\u00dc\u00de\u00e0"+
		"\u00e2\u00e4\u00e6\u00e8\u00ea\u00ec\u00ee\u00f0\u00f2\u00f4\u00f6\u00f8"+
		"\u00fa\u00fc\u00fe\u0100\u0102\u0104\u0106\u0108\u010a\u010c\u010e\u0110"+
		"\u0112\u0114\u0116\u0118\u011a\u011c\u011e\2\6\3\2\62\66\7\2\23\23\26"+
		"\26$$&&))\4\2\33\33\37\37\4\2??Xb\u0754\2\u0120\3\2\2\2\4\u0124\3\2\2"+
		"\2\6\u0128\3\2\2\2\b\u012c\3\2\2\2\n\u012e\3\2\2\2\f\u0130\3\2\2\2\16"+
		"\u0135\3\2\2\2\20\u0139\3\2\2\2\22\u014c\3\2\2\2\24\u014e\3\2\2\2\26\u0153"+
		"\3\2\2\2\30\u0157\3\2\2\2\32\u0159\3\2\2\2\34\u015b\3\2\2\2\36\u0165\3"+
		"\2\2\2 \u0167\3\2\2\2\"\u0170\3\2\2\2$\u017e\3\2\2\2&\u0180\3\2\2\2(\u0183"+
		"\3\2\2\2*\u0187\3\2\2\2,\u0192\3\2\2\2.\u0194\3\2\2\2\60\u019c\3\2\2\2"+
		"\62\u01a3\3\2\2\2\64\u01a5\3\2\2\2\66\u01b5\3\2\2\28\u01b7\3\2\2\2:\u01b9"+
		"\3\2\2\2<\u01c4\3\2\2\2>\u01c8\3\2\2\2@\u01cc\3\2\2\2B\u01d4\3\2\2\2D"+
		"\u01dc\3\2\2\2F\u01e1\3\2\2\2H\u01e5\3\2\2\2J\u01e9\3\2\2\2L\u01ed\3\2"+
		"\2\2N\u01f2\3\2\2\2P\u01f6\3\2\2\2R\u0209\3\2\2\2T\u020b\3\2\2\2V\u0210"+
		"\3\2\2\2X\u0214\3\2\2\2Z\u0216\3\2\2\2\\\u0218\3\2\2\2^\u021a\3\2\2\2"+
		"`\u0225\3\2\2\2b\u0227\3\2\2\2d\u0240\3\2\2\2f\u0242\3\2\2\2h\u0244\3"+
		"\2\2\2j\u024b\3\2\2\2l\u0255\3\2\2\2n\u0257\3\2\2\2p\u0283\3\2\2\2r\u0285"+
		"\3\2\2\2t\u0287\3\2\2\2v\u0295\3\2\2\2x\u02a2\3\2\2\2z\u02a4\3\2\2\2|"+
		"\u02a6\3\2\2\2~\u02af\3\2\2\2\u0080\u02b1\3\2\2\2\u0082\u02ba\3\2\2\2"+
		"\u0084\u02bc\3\2\2\2\u0086\u02c6\3\2\2\2\u0088\u02c8\3\2\2\2\u008a\u02ca"+
		"\3\2\2\2\u008c\u02cc\3\2\2\2\u008e\u02ce\3\2\2\2\u0090\u02d2\3\2\2\2\u0092"+
		"\u02d6\3\2\2\2\u0094\u02da\3\2\2\2\u0096\u02dd\3\2\2\2\u0098\u02e2\3\2"+
		"\2\2\u009a\u02e4\3\2\2\2\u009c\u02e9\3\2\2\2\u009e\u02eb\3\2\2\2\u00a0"+
		"\u02f3\3\2\2\2\u00a2\u02fa\3\2\2\2\u00a4\u031f\3\2\2\2\u00a6\u0321\3\2"+
		"\2\2\u00a8\u033f\3\2\2\2\u00aa\u0346\3\2\2\2\u00ac\u0348\3\2\2\2\u00ae"+
		"\u034e\3\2\2\2\u00b0\u0378\3\2\2\2\u00b2\u037a\3\2\2\2\u00b4\u03a3\3\2"+
		"\2\2\u00b6\u03d9\3\2\2\2\u00b8\u03db\3\2\2\2\u00ba\u040e\3\2\2\2\u00bc"+
		"\u0413\3\2\2\2\u00be\u0422\3\2\2\2\u00c0\u0424\3\2\2\2\u00c2\u0430\3\2"+
		"\2\2\u00c4\u043c\3\2\2\2\u00c6\u0448\3\2\2\2\u00c8\u0461\3\2\2\2\u00ca"+
		"\u04b1\3\2\2\2\u00cc\u04b3\3\2\2\2\u00ce\u04f6\3\2\2\2\u00d0\u04f8\3\2"+
		"\2\2\u00d2\u052f\3\2\2\2\u00d4\u0531\3\2\2\2\u00d6\u055f\3\2\2\2\u00d8"+
		"\u0577\3\2\2\2\u00da\u0579\3\2\2\2\u00dc\u0582\3\2\2\2\u00de\u058a\3\2"+
		"\2\2\u00e0\u0591\3\2\2\2\u00e2\u0595\3\2\2\2\u00e4\u059a\3\2\2\2\u00e6"+
		"\u059c\3\2\2\2\u00e8\u05a6\3\2\2\2\u00ea\u05aa\3\2\2\2\u00ec\u05ae\3\2"+
		"\2\2\u00ee\u05b0\3\2\2\2\u00f0\u05b7\3\2\2\2\u00f2\u05b9\3\2\2\2\u00f4"+
		"\u05c2\3\2\2\2\u00f6\u05c4\3\2\2\2\u00f8\u05cf\3\2\2\2\u00fa\u05da\3\2"+
		"\2\2\u00fc\u05e5\3\2\2\2\u00fe\u05f0\3\2\2\2\u0100\u05fb\3\2\2\2\u0102"+
		"\u0609\3\2\2\2\u0104\u0623\3\2\2\2\u0106\u0638\3\2\2\2\u0108\u0646\3\2"+
		"\2\2\u010a\u065e\3\2\2\2\u010c\u0660\3\2\2\2\u010e\u0663\3\2\2\2\u0110"+
		"\u066c\3\2\2\2\u0112\u0670\3\2\2\2\u0114\u0679\3\2\2\2\u0116\u067c\3\2"+
		"\2\2\u0118\u067e\3\2\2\2\u011a\u0681\3\2\2\2\u011c\u06b6\3\2\2\2\u011e"+
		"\u06b8\3\2\2\2\u0120\u0121\t\2\2\2\u0121\3\3\2\2\2\u0122\u0125\5\6\4\2"+
		"\u0123\u0125\5\16\b\2\u0124\u0122\3\2\2\2\u0124\u0123\3\2\2\2\u0125\5"+
		"\3\2\2\2\u0126\u0129\5\b\5\2\u0127\u0129\7\21\2\2\u0128\u0126\3\2\2\2"+
		"\u0128\u0127\3\2\2\2\u0129\7\3\2\2\2\u012a\u012d\5\n\6\2\u012b\u012d\5"+
		"\f\7\2\u012c\u012a\3\2\2\2\u012c\u012b\3\2\2\2\u012d\t\3\2\2\2\u012e\u012f"+
		"\t\3\2\2\u012f\13\3\2\2\2\u0130\u0131\t\4\2\2\u0131\r\3\2\2\2\u0132\u0136"+
		"\5\20\t\2\u0133\u0136\7c\2\2\u0134\u0136\5\36\20\2\u0135\u0132\3\2\2\2"+
		"\u0135\u0133\3\2\2\2\u0135\u0134\3\2\2\2\u0136\17\3\2\2\2\u0137\u013a"+
		"\5\26\f\2\u0138\u013a\5\34\17\2\u0139\u0137\3\2\2\2\u0139\u0138\3\2\2"+
		"\2\u013a\u013f\3\2\2\2\u013b\u013e\5\24\13\2\u013c\u013e\5\32\16\2\u013d"+
		"\u013b\3\2\2\2\u013d\u013c\3\2\2\2\u013e\u0141\3\2\2\2\u013f\u013d\3\2"+
		"\2\2\u013f\u0140\3\2\2\2\u0140\21\3\2\2\2\u0141\u013f\3\2\2\2\u0142\u0144"+
		"\7c\2\2\u0143\u0145\5(\25\2\u0144\u0143\3\2\2\2\u0144\u0145\3\2\2\2\u0145"+
		"\u014d\3\2\2\2\u0146\u0147\5\20\t\2\u0147\u0148\7>\2\2\u0148\u014a\7c"+
		"\2\2\u0149\u014b\5(\25\2\u014a\u0149\3\2\2\2\u014a\u014b\3\2\2\2\u014b"+
		"\u014d\3\2\2\2\u014c\u0142\3\2\2\2\u014c\u0146\3\2\2\2\u014d\23\3\2\2"+
		"\2\u014e\u014f\7>\2\2\u014f\u0151\7c\2\2\u0150\u0152\5(\25\2\u0151\u0150"+
		"\3\2\2\2\u0151\u0152\3\2\2\2\u0152\25\3\2\2\2\u0153\u0155\7c\2\2\u0154"+
		"\u0156\5(\25\2\u0155\u0154\3\2\2\2\u0155\u0156\3\2\2\2\u0156\27\3\2\2"+
		"\2\u0157\u0158\5\22\n\2\u0158\31\3\2\2\2\u0159\u015a\5\24\13\2\u015a\33"+
		"\3\2\2\2\u015b\u015c\5\26\f\2\u015c\35\3\2\2\2\u015d\u015e\5\6\4\2\u015e"+
		"\u015f\5 \21\2\u015f\u0166\3\2\2\2\u0160\u0161\5\20\t\2\u0161\u0162\5"+
		" \21\2\u0162\u0166\3\2\2\2\u0163\u0164\7c\2\2\u0164\u0166\5 \21\2\u0165"+
		"\u015d\3\2\2\2\u0165\u0160\3\2\2\2\u0165\u0163\3\2\2\2\u0166\37\3\2\2"+
		"\2\u0167\u0168\7;\2\2\u0168\u016d\7<\2\2\u0169\u016a\7;\2\2\u016a\u016c"+
		"\7<\2\2\u016b\u0169\3\2\2\2\u016c\u016f\3\2\2\2\u016d\u016b\3\2\2\2\u016d"+
		"\u016e\3\2\2\2\u016e!\3\2\2\2\u016f\u016d\3\2\2\2\u0170\u0172\7c\2\2\u0171"+
		"\u0173\5$\23\2\u0172\u0171\3\2\2\2\u0172\u0173\3\2\2\2\u0173#\3\2\2\2"+
		"\u0174\u0175\7\3\2\2\u0175\u017f\7c\2\2\u0176\u0177\7\3\2\2\u0177\u017b"+
		"\5\20\t\2\u0178\u017a\5&\24\2\u0179\u0178\3\2\2\2\u017a\u017d\3\2\2\2"+
		"\u017b\u0179\3\2\2\2\u017b\u017c\3\2\2\2\u017c\u017f\3\2\2\2\u017d\u017b"+
		"\3\2\2\2\u017e\u0174\3\2\2\2\u017e\u0176\3\2\2\2\u017f%\3\2\2\2\u0180"+
		"\u0181\7R\2\2\u0181\u0182\5\30\r\2\u0182\'\3\2\2\2\u0183\u0184\7A\2\2"+
		"\u0184\u0185\5*\26\2\u0185\u0186\7@\2\2\u0186)\3\2\2\2\u0187\u018c\5,"+
		"\27\2\u0188\u0189\7=\2\2\u0189\u018b\5,\27\2\u018a\u0188\3\2\2\2\u018b"+
		"\u018e\3\2\2\2\u018c\u018a\3\2\2\2\u018c\u018d\3\2\2\2\u018d+\3\2\2\2"+
		"\u018e\u018c\3\2\2\2\u018f\u0193\5\16\b\2\u0190\u0193\7\b\2\2\u0191\u0193"+
		"\5.\30\2\u0192\u018f\3\2\2\2\u0192\u0190\3\2\2\2\u0192\u0191\3\2\2\2\u0193"+
		"-\3\2\2\2\u0194\u0196\7D\2\2\u0195\u0197\5\60\31\2\u0196\u0195\3\2\2\2"+
		"\u0196\u0197\3\2\2\2\u0197/\3\2\2\2\u0198\u0199\7\3\2\2\u0199\u019d\5"+
		"\16\b\2\u019a\u019b\7*\2\2\u019b\u019d\5\16\b\2\u019c\u0198\3\2\2\2\u019c"+
		"\u019a\3\2\2\2\u019d\61\3\2\2\2\u019e\u01a4\7c\2\2\u019f\u01a0\5\64\33"+
		"\2\u01a0\u01a1\7>\2\2\u01a1\u01a2\7c\2\2\u01a2\u01a4\3\2\2\2\u01a3\u019e"+
		"\3\2\2\2\u01a3\u019f\3\2\2\2\u01a4\63\3\2\2\2\u01a5\u01a6\b\33\1\2\u01a6"+
		"\u01a7\7c\2\2\u01a7\u01ad\3\2\2\2\u01a8\u01a9\f\3\2\2\u01a9\u01aa\7>\2"+
		"\2\u01aa\u01ac\7c\2\2\u01ab\u01a8\3\2\2\2\u01ac\u01af\3\2\2\2\u01ad\u01ab"+
		"\3\2\2\2\u01ad\u01ae\3\2\2\2\u01ae\65\3\2\2\2\u01af\u01ad\3\2\2\2\u01b0"+
		"\u01b6\7c\2\2\u01b1\u01b2\5:\36\2\u01b2\u01b3\7>\2\2\u01b3\u01b4\7c\2"+
		"\2\u01b4\u01b6\3\2\2\2\u01b5\u01b0\3\2\2\2\u01b5\u01b1\3\2\2\2\u01b6\67"+
		"\3\2\2\2\u01b7\u01b8\7c\2\2\u01b89\3\2\2\2\u01b9\u01ba\b\36\1\2\u01ba"+
		"\u01bb\7c\2\2\u01bb\u01c1\3\2\2\2\u01bc\u01bd\f\3\2\2\u01bd\u01be\7>\2"+
		"\2\u01be\u01c0\7c\2\2\u01bf\u01bc\3\2\2\2\u01c0\u01c3\3\2\2\2\u01c1\u01bf"+
		"\3\2\2\2\u01c1\u01c2\3\2\2\2\u01c2;\3\2\2\2\u01c3\u01c1\3\2\2\2\u01c4"+
		"\u01c5\7c\2\2\u01c5\u01c6\7\5\2\2\u01c6\u01c7\7\7\2\2\u01c7=\3\2\2\2\u01c8"+
		"\u01c9\7A\2\2\u01c9\u01ca\5@!\2\u01ca\u01cb\7@\2\2\u01cb?\3\2\2\2\u01cc"+
		"\u01d1\5\"\22\2\u01cd\u01ce\7=\2\2\u01ce\u01d0\5\"\22\2\u01cf\u01cd\3"+
		"\2\2\2\u01d0\u01d3\3\2\2\2\u01d1\u01cf\3\2\2\2\u01d1\u01d2\3\2\2\2\u01d2"+
		"A\3\2\2\2\u01d3\u01d1\3\2\2\2\u01d4\u01d9\5D#\2\u01d5\u01d6\7=\2\2\u01d6"+
		"\u01d8\5D#\2\u01d7\u01d5\3\2\2\2\u01d8\u01db\3\2\2\2\u01d9\u01d7\3\2\2"+
		"\2\u01d9\u01da\3\2\2\2\u01daC\3\2\2\2\u01db\u01d9\3\2\2\2\u01dc\u01df"+
		"\5F$\2\u01dd\u01de\7?\2\2\u01de\u01e0\5H%\2\u01df\u01dd\3\2\2\2\u01df"+
		"\u01e0\3\2\2\2\u01e0E\3\2\2\2\u01e1\u01e2\7c\2\2\u01e2G\3\2\2\2\u01e3"+
		"\u01e6\5\u00e4s\2\u01e4\u01e6\5\u00dan\2\u01e5\u01e3\3\2\2\2\u01e5\u01e4"+
		"\3\2\2\2\u01e6I\3\2\2\2\u01e7\u01ea\5L\'\2\u01e8\u01ea\5N(\2\u01e9\u01e7"+
		"\3\2\2\2\u01e9\u01e8\3\2\2\2\u01eaK\3\2\2\2\u01eb\u01ee\5\b\5\2\u01ec"+
		"\u01ee\7\21\2\2\u01ed\u01eb\3\2\2\2\u01ed\u01ec\3\2\2\2\u01eeM\3\2\2\2"+
		"\u01ef\u01f3\5P)\2\u01f0\u01f3\5^\60\2\u01f1\u01f3\5`\61\2\u01f2\u01ef"+
		"\3\2\2\2\u01f2\u01f0\3\2\2\2\u01f2\u01f1\3\2\2\2\u01f3O\3\2\2\2\u01f4"+
		"\u01f7\5V,\2\u01f5\u01f7\5\\/\2\u01f6\u01f4\3\2\2\2\u01f6\u01f5\3\2\2"+
		"\2\u01f7\u01fc\3\2\2\2\u01f8\u01fb\5T+\2\u01f9\u01fb\5Z.\2\u01fa\u01f8"+
		"\3\2\2\2\u01fa\u01f9\3\2\2\2\u01fb\u01fe\3\2\2\2\u01fc\u01fa\3\2\2\2\u01fc"+
		"\u01fd\3\2\2\2\u01fdQ\3\2\2\2\u01fe\u01fc\3\2\2\2\u01ff\u0201\7c\2\2\u0200"+
		"\u0202\5(\25\2\u0201\u0200\3\2\2\2\u0201\u0202\3\2\2\2\u0202\u020a\3\2"+
		"\2\2\u0203\u0204\5P)\2\u0204\u0205\7>\2\2\u0205\u0207\7c\2\2\u0206\u0208"+
		"\5(\25\2\u0207\u0206\3\2\2\2\u0207\u0208\3\2\2\2\u0208\u020a\3\2\2\2\u0209"+
		"\u01ff\3\2\2\2\u0209\u0203\3\2\2\2\u020aS\3\2\2\2\u020b\u020c\7>\2\2\u020c"+
		"\u020e\7c\2\2\u020d\u020f\5(\25\2\u020e\u020d\3\2\2\2\u020e\u020f\3\2"+
		"\2\2\u020fU\3\2\2\2\u0210\u0212\7c\2\2\u0211\u0213\5(\25\2\u0212\u0211"+
		"\3\2\2\2\u0212\u0213\3\2\2\2\u0213W\3\2\2\2\u0214\u0215\5R*\2\u0215Y\3"+
		"\2\2\2\u0216\u0217\5T+\2\u0217[\3\2\2\2\u0218\u0219\5V,\2\u0219]\3\2\2"+
		"\2\u021a\u021b\7c\2\2\u021b_\3\2\2\2\u021c\u021d\5L\'\2\u021d\u021e\5"+
		" \21\2\u021e\u0226\3\2\2\2\u021f\u0220\5P)\2\u0220\u0221\5 \21\2\u0221"+
		"\u0226\3\2\2\2\u0222\u0223\5^\60\2\u0223\u0224\5 \21\2\u0224\u0226\3\2"+
		"\2\2\u0225\u021c\3\2\2\2\u0225\u021f\3\2\2\2\u0225\u0222\3\2\2\2\u0226"+
		"a\3\2\2\2\u0227\u0228\7c\2\2\u0228\u022a\7\67\2\2\u0229\u022b\5d\63\2"+
		"\u022a\u0229\3\2\2\2\u022a\u022b\3\2\2\2\u022b\u022c\3\2\2\2\u022c\u022d"+
		"\78\2\2\u022d\u022e\7\5\2\2\u022e\u022f\7\6\2\2\u022fc\3\2\2\2\u0230\u0235"+
		"\5f\64\2\u0231\u0232\7=\2\2\u0232\u0234\5f\64\2\u0233\u0231\3\2\2\2\u0234"+
		"\u0237\3\2\2\2\u0235\u0233\3\2\2\2\u0235\u0236\3\2\2\2\u0236\u0241\3\2"+
		"\2\2\u0237\u0235\3\2\2\2\u0238\u023d\5h\65\2\u0239\u023a\7=\2\2\u023a"+
		"\u023c\5f\64\2\u023b\u0239\3\2\2\2\u023c\u023f\3\2\2\2\u023d\u023b\3\2"+
		"\2\2\u023d\u023e\3\2\2\2\u023e\u0241\3\2\2\2\u023f\u023d\3\2\2\2\u0240"+
		"\u0230\3\2\2\2\u0240\u0238\3\2\2\2\u0241e\3\2\2\2\u0242\u0243\5J&\2\u0243"+
		"g\3\2\2\2\u0244\u0247\5J&\2\u0245\u0246\7c\2\2\u0246\u0248\7>\2\2\u0247"+
		"\u0245\3\2\2\2\u0247\u0248\3\2\2\2\u0248\u0249\3\2\2\2\u0249\u024a\7-"+
		"\2\2\u024ai\3\2\2\2\u024b\u0250\5l\67\2\u024c\u024d\7=\2\2\u024d\u024f"+
		"\5l\67\2\u024e\u024c\3\2\2\2\u024f\u0252\3\2\2\2\u0250\u024e\3\2\2\2\u0250"+
		"\u0251\3\2\2\2\u0251k\3\2\2\2\u0252\u0250\3\2\2\2\u0253\u0256\5\22\n\2"+
		"\u0254\u0256\7c\2\2\u0255\u0253\3\2\2\2\u0255\u0254\3\2\2\2\u0256m\3\2"+
		"\2\2\u0257\u0258\7c\2\2\u0258o\3\2\2\2\u0259\u025b\5(\25\2\u025a\u0259"+
		"\3\2\2\2\u025a\u025b\3\2\2\2\u025b\u025c\3\2\2\2\u025c\u025d\7-\2\2\u025d"+
		"\u025f\7\67\2\2\u025e\u0260\5\u00d0i\2\u025f\u025e\3\2\2\2\u025f\u0260"+
		"\3\2\2\2\u0260\u0261\3\2\2\2\u0261\u0284\78\2\2\u0262\u0264\5(\25\2\u0263"+
		"\u0262\3\2\2\2\u0263\u0264\3\2\2\2\u0264\u0265\3\2\2\2\u0265\u0266\7*"+
		"\2\2\u0266\u0268\7\67\2\2\u0267\u0269\5\u00d0i\2\u0268\u0267\3\2\2\2\u0268"+
		"\u0269\3\2\2\2\u0269\u026a\3\2\2\2\u026a\u0284\78\2\2\u026b\u026c\5\66"+
		"\34\2\u026c\u026e\7>\2\2\u026d\u026f\5(\25\2\u026e\u026d\3\2\2\2\u026e"+
		"\u026f\3\2\2\2\u026f\u0270\3\2\2\2\u0270\u0271\7*\2\2\u0271\u0273\7\67"+
		"\2\2\u0272\u0274\5\u00d0i\2\u0273\u0272\3\2\2\2\u0273\u0274\3\2\2\2\u0274"+
		"\u0275\3\2\2\2\u0275\u0276\78\2\2\u0276\u0284\3\2\2\2\u0277\u0278\5\u00a2"+
		"R\2\u0278\u027a\7>\2\2\u0279\u027b\5(\25\2\u027a\u0279\3\2\2\2\u027a\u027b"+
		"\3\2\2\2\u027b\u027c\3\2\2\2\u027c\u027d\7*\2\2\u027d\u027f\7\67\2\2\u027e"+
		"\u0280\5\u00d0i\2\u027f\u027e\3\2\2\2\u027f\u0280\3\2\2\2\u0280\u0281"+
		"\3\2\2\2\u0281\u0282\78\2\2\u0282\u0284\3\2\2\2\u0283\u025a\3\2\2\2\u0283"+
		"\u0263\3\2\2\2\u0283\u026b\3\2\2\2\u0283\u0277\3\2\2\2\u0284q\3\2\2\2"+
		"\u0285\u0286\5t;\2\u0286s\3\2\2\2\u0287\u028c\5J&\2\u0288\u0289\7=\2\2"+
		"\u0289\u028b\5J&\2\u028a\u0288\3\2\2\2\u028b\u028e\3\2\2\2\u028c\u028a"+
		"\3\2\2\2\u028c\u028d\3\2\2\2\u028du\3\2\2\2\u028e\u028c\3\2\2\2\u028f"+
		"\u0296\5x=\2\u0290\u0296\5z>\2\u0291\u0296\5\u0080A\2\u0292\u0296\7\17"+
		"\2\2\u0293\u0296\5\u0088E\2\u0294\u0296\5\u008cG\2\u0295\u028f\3\2\2\2"+
		"\u0295\u0290\3\2\2\2\u0295\u0291\3\2\2\2\u0295\u0292\3\2\2\2\u0295\u0293"+
		"\3\2\2\2\u0295\u0294\3\2\2\2\u0296w\3\2\2\2\u0297\u02a3\5|?\2\u0298\u02a3"+
		"\5\u0082B\2\u0299\u02a3\5\u0084C\2\u029a\u02a3\5\u0086D\2\u029b\u02a3"+
		"\5\u008aF\2\u029c\u02a3\5\u008eH\2\u029d\u02a3\5\u0090I\2\u029e\u02a3"+
		"\5\u0092J\2\u029f\u02a3\5\u0096L\2\u02a0\u02a3\5\u0094K\2\u02a1\u02a3"+
		"\5\u0098M\2\u02a2\u0297\3\2\2\2\u02a2\u0298\3\2\2\2\u02a2\u0299\3\2\2"+
		"\2\u02a2\u029a\3\2\2\2\u02a2\u029b\3\2\2\2\u02a2\u029c\3\2\2\2\u02a2\u029d"+
		"\3\2\2\2\u02a2\u029e\3\2\2\2\u02a2\u029f\3\2\2\2\u02a2\u02a0\3\2\2\2\u02a2"+
		"\u02a1\3\2\2\2\u02a3y\3\2\2\2\u02a4\u02a5\7c\2\2\u02a5{\3\2\2\2\u02a6"+
		"\u02a7\5~@\2\u02a7}\3\2\2\2\u02a8\u02b0\5\u00eex\2\u02a9\u02b0\5\u010c"+
		"\u0087\2\u02aa\u02b0\5\u010e\u0088\2\u02ab\u02b0\5\u0114\u008b\2\u02ac"+
		"\u02b0\5\u0118\u008d\2\u02ad\u02b0\5\u00caf\2\u02ae\u02b0\5\u00b6\\\2"+
		"\u02af\u02a8\3\2\2\2\u02af\u02a9\3\2\2\2\u02af\u02aa\3\2\2\2\u02af\u02ab"+
		"\3\2\2\2\u02af\u02ac\3\2\2\2\u02af\u02ad\3\2\2\2\u02af\u02ae\3\2\2\2\u02b0"+
		"\177\3\2\2\2\u02b1\u02b2\7!\2\2\u02b2\u0081\3\2\2\2\u02b3\u02b4\7\20\2"+
		"\2\u02b4\u02bb\5\u00e4s\2\u02b5\u02b6\7\20\2\2\u02b6\u02b7\5\u00e4s\2"+
		"\u02b7\u02b8\7E\2\2\u02b8\u02b9\5\u00e4s\2\u02b9\u02bb\3\2\2\2\u02ba\u02b3"+
		"\3\2\2\2\u02ba\u02b5\3\2\2\2\u02bb\u0083\3\2\2\2\u02bc\u02bd\7+\2\2\u02bd"+
		"\u02be\7\67\2\2\u02be\u02bf\5\u00e4s\2\u02bf\u02c0\78\2\2\u02c0\u0085"+
		"\3\2\2\2\u02c1\u02c2\7\24\2\2\u02c2\u02c7\5\u00e4s\2\u02c3\u02c4\7\24"+
		"\2\2\u02c4\u02c7\7c\2\2\u02c5\u02c7\7\31\2\2\u02c6\u02c1\3\2\2\2\u02c6"+
		"\u02c3\3\2\2\2\u02c6\u02c5\3\2\2\2\u02c7\u0087\3\2\2\2\u02c8\u02c9\7\61"+
		"\2\2\u02c9\u0089\3\2\2\2\u02ca\u02cb\7\32\2\2\u02cb\u008b\3\2\2\2\u02cc"+
		"\u02cd\7 \2\2\u02cd\u008d\3\2\2\2\u02ce\u02d0\7\22\2\2\u02cf\u02d1\7c"+
		"\2\2\u02d0\u02cf\3\2\2\2\u02d0\u02d1\3\2\2\2\u02d1\u008f\3\2\2\2\u02d2"+
		"\u02d4\7\30\2\2\u02d3\u02d5\7c\2\2\u02d4\u02d3\3\2\2\2\u02d4\u02d5\3\2"+
		"\2\2\u02d5\u0091\3\2\2\2\u02d6\u02d8\7(\2\2\u02d7\u02d9\5\u00e4s\2\u02d8"+
		"\u02d7\3\2\2\2\u02d8\u02d9\3\2\2\2\u02d9\u0093\3\2\2\2\u02da\u02db\7."+
		"\2\2\u02db\u02dc\5\u00e4s\2\u02dc\u0095\3\2\2\2\u02dd\u02de\7,\2\2\u02de"+
		"\u02df\7\67\2\2\u02df\u02e0\5\u00e4s\2\u02e0\u02e1\78\2\2\u02e1\u0097"+
		"\3\2\2\2\u02e2\u02e3\7\60\2\2\u02e3\u0099\3\2\2\2\u02e4\u02e5\7\25\2\2"+
		"\u02e5\u02e6\7\67\2\2\u02e6\u02e7\5\u009cO\2\u02e7\u02e8\78\2\2\u02e8"+
		"\u009b\3\2\2\2\u02e9\u02ea\5\u009eP\2\u02ea\u009d\3\2\2\2\u02eb\u02f0"+
		"\5R*\2\u02ec\u02ed\7S\2\2\u02ed\u02ef\5\22\n\2\u02ee\u02ec\3\2\2\2\u02ef"+
		"\u02f2\3\2\2\2\u02f0\u02ee\3\2\2\2\u02f0\u02f1\3\2\2\2\u02f1\u009f\3\2"+
		"\2\2\u02f2\u02f0\3\2\2\2\u02f3\u02f4\5J&\2\u02f4\u02f5\5F$\2\u02f5\u02f6"+
		"\7?\2\2\u02f6\u02f7\5\u00e4s\2\u02f7\u00a1\3\2\2\2\u02f8\u02fb\5\u00b0"+
		"Y\2\u02f9\u02fb\5\u00d8m\2\u02fa\u02f8\3\2\2\2\u02fa\u02f9\3\2\2\2\u02fb"+
		"\u02ff\3\2\2\2\u02fc\u02fe\5\u00aaV\2\u02fd\u02fc\3\2\2\2\u02fe\u0301"+
		"\3\2\2\2\u02ff\u02fd\3\2\2\2\u02ff\u0300\3\2\2\2\u0300\u00a3\3\2\2\2\u0301"+
		"\u02ff\3\2\2\2\u0302\u0320\5\2\2\2\u0303\u0308\5\62\32\2\u0304\u0305\7"+
		";\2\2\u0305\u0307\7<\2\2\u0306\u0304\3\2\2\2\u0307\u030a\3\2\2\2\u0308"+
		"\u0306\3\2\2\2\u0308\u0309\3\2\2\2\u0309\u030b\3\2\2\2\u030a\u0308\3\2"+
		"\2\2\u030b\u030c\7>\2\2\u030c\u030d\7\27\2\2\u030d\u0320\3\2\2\2\u030e"+
		"\u030f\7\4\2\2\u030f\u0310\7>\2\2\u0310\u0320\7\27\2\2\u0311\u0320\7-"+
		"\2\2\u0312\u0313\5\62\32\2\u0313\u0314\7>\2\2\u0314\u0315\7-\2\2\u0315"+
		"\u0320\3\2\2\2\u0316\u0317\7\67\2\2\u0317\u0318\5\u00e4s\2\u0318\u0319"+
		"\78\2\2\u0319\u0320\3\2\2\2\u031a\u0320\5\u00b6\\\2\u031b\u0320\5\u00be"+
		"`\2\u031c\u0320\5\u00c4c\2\u031d\u0320\5\u00caf\2\u031e\u0320\5\u00d2"+
		"j\2\u031f\u0302\3\2\2\2\u031f\u0303\3\2\2\2\u031f\u030e\3\2\2\2\u031f"+
		"\u0311\3\2\2\2\u031f\u0312\3\2\2\2\u031f\u0316\3\2\2\2\u031f\u031a\3\2"+
		"\2\2\u031f\u031b\3\2\2\2\u031f\u031c\3\2\2\2\u031f\u031d\3\2\2\2\u031f"+
		"\u031e\3\2\2\2\u0320\u00a5\3\2\2\2\u0321\u0322\3\2\2\2\u0322\u00a7\3\2"+
		"\2\2\u0323\u0340\5\2\2\2\u0324\u0329\5\62\32\2\u0325\u0326\7;\2\2\u0326"+
		"\u0328\7<\2\2\u0327\u0325\3\2\2\2\u0328\u032b\3\2\2\2\u0329\u0327\3\2"+
		"\2\2\u0329\u032a\3\2\2\2\u032a\u032c\3\2\2\2\u032b\u0329\3\2\2\2\u032c"+
		"\u032d\7>\2\2\u032d\u032e\7\27\2\2\u032e\u0340\3\2\2\2\u032f\u0330\7\4"+
		"\2\2\u0330\u0331\7>\2\2\u0331\u0340\7\27\2\2\u0332\u0340\7-\2\2\u0333"+
		"\u0334\5\62\32\2\u0334\u0335\7>\2\2\u0335\u0336\7-\2\2\u0336\u0340\3\2"+
		"\2\2\u0337\u0338\7\67\2\2\u0338\u0339\5\u00e4s\2\u0339\u033a\78\2\2\u033a"+
		"\u0340\3\2\2\2\u033b\u0340\5\u00b6\\\2\u033c\u0340\5\u00be`\2\u033d\u0340"+
		"\5\u00caf\2\u033e\u0340\5\u00d2j\2\u033f\u0323\3\2\2\2\u033f\u0324\3\2"+
		"\2\2\u033f\u032f\3\2\2\2\u033f\u0332\3\2\2\2\u033f\u0333\3\2\2\2\u033f"+
		"\u0337\3\2\2\2\u033f\u033b\3\2\2\2\u033f\u033c\3\2\2\2\u033f\u033d\3\2"+
		"\2\2\u033f\u033e\3\2\2\2\u0340\u00a9\3\2\2\2\u0341\u0347\5\u00b8]\2\u0342"+
		"\u0347\5\u00c0a\2\u0343\u0347\5\u00c6d\2\u0344\u0347\5\u00ccg\2\u0345"+
		"\u0347\5\u00d4k\2\u0346\u0341\3\2\2\2\u0346\u0342\3\2\2\2\u0346\u0343"+
		"\3\2\2\2\u0346\u0344\3\2\2\2\u0346\u0345\3\2\2\2\u0347\u00ab\3\2\2\2\u0348"+
		"\u0349\3\2\2\2\u0349\u00ad\3\2\2\2\u034a\u034f\5\u00b8]\2\u034b\u034f"+
		"\5\u00c0a\2\u034c\u034f\5\u00ccg\2\u034d\u034f\5\u00d4k\2\u034e\u034a"+
		"\3\2\2\2\u034e\u034b\3\2\2\2\u034e\u034c\3\2\2\2\u034e\u034d\3\2\2\2\u034f"+
		"\u00af\3\2\2\2\u0350\u0379\5\2\2\2\u0351\u0356\5\62\32\2\u0352\u0353\7"+
		";\2\2\u0353\u0355\7<\2\2\u0354\u0352\3\2\2\2\u0355\u0358\3\2\2\2\u0356"+
		"\u0354\3\2\2\2\u0356\u0357\3\2\2\2\u0357\u0359\3\2\2\2\u0358\u0356\3\2"+
		"\2\2\u0359\u035a\7>\2\2\u035a\u035b\7\27\2\2\u035b\u0379\3\2\2\2\u035c"+
		"\u0361\5L\'\2\u035d\u035e\7;\2\2\u035e\u0360\7<\2\2\u035f\u035d\3\2\2"+
		"\2\u0360\u0363\3\2\2\2\u0361\u035f\3\2\2\2\u0361\u0362\3\2\2\2\u0362\u0364"+
		"\3\2\2\2\u0363\u0361\3\2\2\2\u0364\u0365\7>\2\2\u0365\u0366\7\27\2\2\u0366"+
		"\u0379\3\2\2\2\u0367\u0368\7\4\2\2\u0368\u0369\7>\2\2\u0369\u0379\7\27"+
		"\2\2\u036a\u0379\7-\2\2\u036b\u036c\5\62\32\2\u036c\u036d\7>\2\2\u036d"+
		"\u036e\7-\2\2\u036e\u0379\3\2\2\2\u036f\u0370\7\67\2\2\u0370\u0371\5\u00e4"+
		"s\2\u0371\u0372\78\2\2\u0372\u0379\3\2\2\2\u0373\u0379\5\u00ba^\2\u0374"+
		"\u0379\5\u00c2b\2\u0375\u0379\5\u00c8e\2\u0376\u0379\5\u00ceh\2\u0377"+
		"\u0379\5\u00d6l\2\u0378\u0350\3\2\2\2\u0378\u0351\3\2\2\2\u0378\u035c"+
		"\3\2\2\2\u0378\u0367\3\2\2\2\u0378\u036a\3\2\2\2\u0378\u036b\3\2\2\2\u0378"+
		"\u036f\3\2\2\2\u0378\u0373\3\2\2\2\u0378\u0374\3\2\2\2\u0378\u0375\3\2"+
		"\2\2\u0378\u0376\3\2\2\2\u0378\u0377\3\2\2\2\u0379\u00b1\3\2\2\2\u037a"+
		"\u037b\3\2\2\2\u037b\u00b3\3\2\2\2\u037c\u03a4\5\2\2\2\u037d\u0382\5\62"+
		"\32\2\u037e\u037f\7;\2\2\u037f\u0381\7<\2\2\u0380\u037e\3\2\2\2\u0381"+
		"\u0384\3\2\2\2\u0382\u0380\3\2\2\2\u0382\u0383\3\2\2\2\u0383\u0385\3\2"+
		"\2\2\u0384\u0382\3\2\2\2\u0385\u0386\7>\2\2\u0386\u0387\7\27\2\2\u0387"+
		"\u03a4\3\2\2\2\u0388\u038d\5L\'\2\u0389\u038a\7;\2\2\u038a\u038c\7<\2"+
		"\2\u038b\u0389\3\2\2\2\u038c\u038f\3\2\2\2\u038d\u038b\3\2\2\2\u038d\u038e"+
		"\3\2\2\2\u038e\u0390\3\2\2\2\u038f\u038d\3\2\2\2\u0390\u0391\7>\2\2\u0391"+
		"\u0392\7\27\2\2\u0392\u03a4\3\2\2\2\u0393\u0394\7\4\2\2\u0394\u0395\7"+
		">\2\2\u0395\u03a4\7\27\2\2\u0396\u03a4\7-\2\2\u0397\u0398\5\62\32\2\u0398"+
		"\u0399\7>\2\2\u0399\u039a\7-\2\2\u039a\u03a4\3\2\2\2\u039b\u039c\7\67"+
		"\2\2\u039c\u039d\5\u00e4s\2\u039d\u039e\78\2\2\u039e\u03a4\3\2\2\2\u039f"+
		"\u03a4\5\u00ba^\2\u03a0\u03a4\5\u00c2b\2\u03a1\u03a4\5\u00ceh\2\u03a2"+
		"\u03a4\5\u00d6l\2\u03a3\u037c\3\2\2\2\u03a3\u037d\3\2\2\2\u03a3\u0388"+
		"\3\2\2\2\u03a3\u0393\3\2\2\2\u03a3\u0396\3\2\2\2\u03a3\u0397\3\2\2\2\u03a3"+
		"\u039b\3\2\2\2\u03a3\u039f\3\2\2\2\u03a3\u03a0\3\2\2\2\u03a3\u03a1\3\2"+
		"\2\2\u03a3\u03a2\3\2\2\2\u03a4\u00b5\3\2\2\2\u03a5\u03a7\7\'\2\2\u03a6"+
		"\u03a8\5(\25\2\u03a7\u03a6\3\2\2\2\u03a7\u03a8\3\2\2\2\u03a8\u03a9\3\2"+
		"\2\2\u03a9\u03ae\7c\2\2\u03aa\u03ab\7>\2\2\u03ab\u03ad\7c\2\2\u03ac\u03aa"+
		"\3\2\2\2\u03ad\u03b0\3\2\2\2\u03ae\u03ac\3\2\2\2\u03ae\u03af\3\2\2\2\u03af"+
		"\u03b2\3\2\2\2\u03b0\u03ae\3\2\2\2\u03b1\u03b3\5\u00bc_\2\u03b2\u03b1"+
		"\3\2\2\2\u03b2\u03b3\3\2\2\2\u03b3\u03b4\3\2\2\2\u03b4\u03b6\7\67\2\2"+
		"\u03b5\u03b7\5\u00d0i\2\u03b6\u03b5\3\2\2\2\u03b6\u03b7\3\2\2\2\u03b7"+
		"\u03b8\3\2\2\2\u03b8\u03da\78\2\2\u03b9\u03ba\5\66\34\2\u03ba\u03bb\7"+
		">\2\2\u03bb\u03bd\7\'\2\2\u03bc\u03be\5(\25\2\u03bd\u03bc\3\2\2\2\u03bd"+
		"\u03be\3\2\2\2\u03be\u03bf\3\2\2\2\u03bf\u03c1\7c\2\2\u03c0\u03c2\5\u00bc"+
		"_\2\u03c1\u03c0\3\2\2\2\u03c1\u03c2\3\2\2\2\u03c2\u03c3\3\2\2\2\u03c3"+
		"\u03c5\7\67\2\2\u03c4\u03c6\5\u00d0i\2\u03c5\u03c4\3\2\2\2\u03c5\u03c6"+
		"\3\2\2\2\u03c6\u03c7\3\2\2\2\u03c7\u03c8\78\2\2\u03c8\u03da\3\2\2\2\u03c9"+
		"\u03ca\5\u00a2R\2\u03ca\u03cb\7>\2\2\u03cb\u03cd\7\'\2\2\u03cc\u03ce\5"+
		"(\25\2\u03cd\u03cc\3\2\2\2\u03cd\u03ce\3\2\2\2\u03ce\u03cf\3\2\2\2\u03cf"+
		"\u03d1\7c\2\2\u03d0\u03d2\5\u00bc_\2\u03d1\u03d0\3\2\2\2\u03d1\u03d2\3"+
		"\2\2\2\u03d2\u03d3\3\2\2\2\u03d3\u03d5\7\67\2\2\u03d4\u03d6\5\u00d0i\2"+
		"\u03d5\u03d4\3\2\2\2\u03d5\u03d6\3\2\2\2\u03d6\u03d7\3\2\2\2\u03d7\u03d8"+
		"\78\2\2\u03d8\u03da\3\2\2\2\u03d9\u03a5\3\2\2\2\u03d9\u03b9\3\2\2\2\u03d9"+
		"\u03c9\3\2\2\2\u03da\u00b7\3\2\2\2\u03db\u03dc\7>\2\2\u03dc\u03de\7\'"+
		"\2\2\u03dd\u03df\5(\25\2\u03de\u03dd\3\2\2\2\u03de\u03df\3\2\2\2\u03df"+
		"\u03e0\3\2\2\2\u03e0\u03e2\7c\2\2\u03e1\u03e3\5\u00bc_\2\u03e2\u03e1\3"+
		"\2\2\2\u03e2\u03e3\3\2\2\2\u03e3\u03e4\3\2\2\2\u03e4\u03e6\7\67\2\2\u03e5"+
		"\u03e7\5\u00d0i\2\u03e6\u03e5\3\2\2\2\u03e6\u03e7\3\2\2\2\u03e7\u03e8"+
		"\3\2\2\2\u03e8\u03e9\78\2\2\u03e9\u00b9\3\2\2\2\u03ea\u03ec\7\'\2\2\u03eb"+
		"\u03ed\5(\25\2\u03ec\u03eb\3\2\2\2\u03ec\u03ed\3\2\2\2\u03ed\u03ee\3\2"+
		"\2\2\u03ee\u03f3\7c\2\2\u03ef\u03f0\7>\2\2\u03f0\u03f2\7c\2\2\u03f1\u03ef"+
		"\3\2\2\2\u03f2\u03f5\3\2\2\2\u03f3\u03f1\3\2\2\2\u03f3\u03f4\3\2\2\2\u03f4"+
		"\u03f7\3\2\2\2\u03f5\u03f3\3\2\2\2\u03f6\u03f8\5\u00bc_\2\u03f7\u03f6"+
		"\3\2\2\2\u03f7\u03f8\3\2\2\2\u03f8\u03f9\3\2\2\2\u03f9\u03fb\7\67\2\2"+
		"\u03fa\u03fc\5\u00d0i\2\u03fb\u03fa\3\2\2\2\u03fb\u03fc\3\2\2\2\u03fc"+
		"\u03fd\3\2\2\2\u03fd\u040f\78\2\2\u03fe\u03ff\5\66\34\2\u03ff\u0400\7"+
		">\2\2\u0400\u0402\7\'\2\2\u0401\u0403\5(\25\2\u0402\u0401\3\2\2\2\u0402"+
		"\u0403\3\2\2\2\u0403\u0404\3\2\2\2\u0404\u0406\7c\2\2\u0405\u0407\5\u00bc"+
		"_\2\u0406\u0405\3\2\2\2\u0406\u0407\3\2\2\2\u0407\u0408\3\2\2\2\u0408"+
		"\u040a\7\67\2\2\u0409\u040b\5\u00d0i\2\u040a\u0409\3\2\2\2\u040a\u040b"+
		"\3\2\2\2\u040b\u040c\3\2\2\2\u040c\u040d\78\2\2\u040d\u040f\3\2\2\2\u040e"+
		"\u03ea\3\2\2\2\u040e\u03fe\3\2\2\2\u040f\u00bb\3\2\2\2\u0410\u0414\5("+
		"\25\2\u0411\u0412\7A\2\2\u0412\u0414\7@\2\2\u0413\u0410\3\2\2\2\u0413"+
		"\u0411\3\2\2\2\u0414\u00bd\3\2\2\2\u0415\u0416\5\u00a2R\2\u0416\u0417"+
		"\7>\2\2\u0417\u0418\7c\2\2\u0418\u0423\3\2\2\2\u0419\u041a\7*\2\2\u041a"+
		"\u041b\7>\2\2\u041b\u0423\7c\2\2\u041c\u041d\5\62\32\2\u041d\u041e\7>"+
		"\2\2\u041e\u041f\7*\2\2\u041f\u0420\7>\2\2\u0420\u0421\7c\2\2\u0421\u0423"+
		"\3\2\2\2\u0422\u0415\3\2\2\2\u0422\u0419\3\2\2\2\u0422\u041c\3\2\2\2\u0423"+
		"\u00bf\3\2\2\2\u0424\u0425\7>\2\2\u0425\u0426\7c\2\2\u0426\u00c1\3\2\2"+
		"\2\u0427\u0428\7*\2\2\u0428\u0429\7>\2\2\u0429\u0431\7c\2\2\u042a\u042b"+
		"\5\62\32\2\u042b\u042c\7>\2\2\u042c\u042d\7*\2\2\u042d\u042e\7>\2\2\u042e"+
		"\u042f\7c\2\2\u042f\u0431\3\2\2\2\u0430\u0427\3\2\2\2\u0430\u042a\3\2"+
		"\2\2\u0431\u00c3\3\2\2\2\u0432\u0433\5\66\34\2\u0433\u0434\7;\2\2\u0434"+
		"\u0435\5\u00e4s\2\u0435\u0436\7<\2\2\u0436\u043d\3\2\2\2\u0437\u0438\5"+
		"\u00a8U\2\u0438\u0439\7;\2\2\u0439\u043a\5\u00e4s\2\u043a\u043b\7<\2\2"+
		"\u043b\u043d\3\2\2\2\u043c\u0432\3\2\2\2\u043c\u0437\3\2\2\2\u043d\u0445"+
		"\3\2\2\2\u043e\u043f\5\u00a6T\2\u043f\u0440\7;\2\2\u0440\u0441\5\u00e4"+
		"s\2\u0441\u0442\7<\2\2\u0442\u0444\3\2\2\2\u0443\u043e\3\2\2\2\u0444\u0447"+
		"\3\2\2\2\u0445\u0443\3\2\2\2\u0445\u0446\3\2\2\2\u0446\u00c5\3\2\2\2\u0447"+
		"\u0445\3\2\2\2\u0448\u0449\5\u00aeX\2\u0449\u044a\7;\2\2\u044a\u044b\5"+
		"\u00e4s\2\u044b\u044c\7<\2\2\u044c\u0454\3\2\2\2\u044d\u044e\5\u00acW"+
		"\2\u044e\u044f\7;\2\2\u044f\u0450\5\u00e4s\2\u0450\u0451\7<\2\2\u0451"+
		"\u0453\3\2\2\2\u0452\u044d\3\2\2\2\u0453\u0456\3\2\2\2\u0454\u0452\3\2"+
		"\2\2\u0454\u0455\3\2\2\2\u0455\u00c7\3\2\2\2\u0456\u0454\3\2\2\2\u0457"+
		"\u0458\5\66\34\2\u0458\u0459\7;\2\2\u0459\u045a\5\u00e4s\2\u045a\u045b"+
		"\7<\2\2\u045b\u0462\3\2\2\2\u045c\u045d\5\u00b4[\2\u045d\u045e\7;\2\2"+
		"\u045e\u045f\5\u00e4s\2\u045f\u0460\7<\2\2\u0460\u0462\3\2\2\2\u0461\u0457"+
		"\3\2\2\2\u0461\u045c\3\2\2\2\u0462\u046a\3\2\2\2\u0463\u0464\5\u00b2Z"+
		"\2\u0464\u0465\7;\2\2\u0465\u0466\5\u00e4s\2\u0466\u0467\7<\2\2\u0467"+
		"\u0469\3\2\2\2\u0468\u0463\3\2\2\2\u0469\u046c\3\2\2\2\u046a\u0468\3\2"+
		"\2\2\u046a\u046b\3\2\2\2\u046b\u00c9\3\2\2\2\u046c\u046a\3\2\2\2\u046d"+
		"\u046e\58\35\2\u046e\u0470\7\67\2\2\u046f\u0471\5\u00d0i\2\u0470\u046f"+
		"\3\2\2\2\u0470\u0471\3\2\2\2\u0471\u0472\3\2\2\2\u0472\u0473\78\2\2\u0473"+
		"\u04b2\3\2\2\2\u0474\u0475\5\62\32\2\u0475\u0477\7>\2\2\u0476\u0478\5"+
		"(\25\2\u0477\u0476\3\2\2\2\u0477\u0478\3\2\2\2\u0478\u0479\3\2\2\2\u0479"+
		"\u047a\7c\2\2\u047a\u047c\7\67\2\2\u047b\u047d\5\u00d0i\2\u047c\u047b"+
		"\3\2\2\2\u047c\u047d\3\2\2\2\u047d\u047e\3\2\2\2\u047e\u047f\78\2\2\u047f"+
		"\u04b2\3\2\2\2\u0480\u0481\5\66\34\2\u0481\u0483\7>\2\2\u0482\u0484\5"+
		"(\25\2\u0483\u0482\3\2\2\2\u0483\u0484\3\2\2\2\u0484\u0485\3\2\2\2\u0485"+
		"\u0486\7c\2\2\u0486\u0488\7\67\2\2\u0487\u0489\5\u00d0i\2\u0488\u0487"+
		"\3\2\2\2\u0488\u0489\3\2\2\2\u0489\u048a\3\2\2\2\u048a\u048b\78\2\2\u048b"+
		"\u04b2\3\2\2\2\u048c\u048d\5\u00a2R\2\u048d\u048f\7>\2\2\u048e\u0490\5"+
		"(\25\2\u048f\u048e\3\2\2\2\u048f\u0490\3\2\2\2\u0490\u0491\3\2\2\2\u0491"+
		"\u0492\7c\2\2\u0492\u0494\7\67\2\2\u0493\u0495\5\u00d0i\2\u0494\u0493"+
		"\3\2\2\2\u0494\u0495\3\2\2\2\u0495\u0496\3\2\2\2\u0496\u0497\78\2\2\u0497"+
		"\u04b2\3\2\2\2\u0498\u0499\7*\2\2\u0499\u049b\7>\2\2\u049a\u049c\5(\25"+
		"\2\u049b\u049a\3\2\2\2\u049b\u049c\3\2\2\2\u049c\u049d\3\2\2\2\u049d\u049e"+
		"\7c\2\2\u049e\u04a0\7\67\2\2\u049f\u04a1\5\u00d0i\2\u04a0\u049f\3\2\2"+
		"\2\u04a0\u04a1\3\2\2\2\u04a1\u04a2\3\2\2\2\u04a2\u04b2\78\2\2\u04a3\u04a4"+
		"\5\62\32\2\u04a4\u04a5\7>\2\2\u04a5\u04a6\7*\2\2\u04a6\u04a8\7>\2\2\u04a7"+
		"\u04a9\5(\25\2\u04a8\u04a7\3\2\2\2\u04a8\u04a9\3\2\2\2\u04a9\u04aa\3\2"+
		"\2\2\u04aa\u04ab\7c\2\2\u04ab\u04ad\7\67\2\2\u04ac\u04ae\5\u00d0i\2\u04ad"+
		"\u04ac\3\2\2\2\u04ad\u04ae\3\2\2\2\u04ae\u04af\3\2\2\2\u04af\u04b0\78"+
		"\2\2\u04b0\u04b2\3\2\2\2\u04b1\u046d\3\2\2\2\u04b1\u0474\3\2\2\2\u04b1"+
		"\u0480\3\2\2\2\u04b1\u048c\3\2\2\2\u04b1\u0498\3\2\2\2\u04b1\u04a3\3\2"+
		"\2\2\u04b2\u00cb\3\2\2\2\u04b3\u04b5\7>\2\2\u04b4\u04b6\5(\25\2\u04b5"+
		"\u04b4\3\2\2\2\u04b5\u04b6\3\2\2\2\u04b6\u04b7\3\2\2\2\u04b7\u04b8\7c"+
		"\2\2\u04b8\u04ba\7\67\2\2\u04b9\u04bb\5\u00d0i\2\u04ba\u04b9\3\2\2\2\u04ba"+
		"\u04bb\3\2\2\2\u04bb\u04bc\3\2\2\2\u04bc\u04bd\78\2\2\u04bd\u00cd\3\2"+
		"\2\2\u04be\u04bf\58\35\2\u04bf\u04c1\7\67\2\2\u04c0\u04c2\5\u00d0i\2\u04c1"+
		"\u04c0\3\2\2\2\u04c1\u04c2\3\2\2\2\u04c2\u04c3\3\2\2\2\u04c3\u04c4\78"+
		"\2\2\u04c4\u04f7\3\2\2\2\u04c5\u04c6\5\62\32\2\u04c6\u04c8\7>\2\2\u04c7"+
		"\u04c9\5(\25\2\u04c8\u04c7\3\2\2\2\u04c8\u04c9\3\2\2\2\u04c9\u04ca\3\2"+
		"\2\2\u04ca\u04cb\7c\2\2\u04cb\u04cd\7\67\2\2\u04cc\u04ce\5\u00d0i\2\u04cd"+
		"\u04cc\3\2\2\2\u04cd\u04ce\3\2\2\2\u04ce\u04cf\3\2\2\2\u04cf\u04d0\78"+
		"\2\2\u04d0\u04f7\3\2\2\2\u04d1\u04d2\5\66\34\2\u04d2\u04d4\7>\2\2\u04d3"+
		"\u04d5\5(\25\2\u04d4\u04d3\3\2\2\2\u04d4\u04d5\3\2\2\2\u04d5\u04d6\3\2"+
		"\2\2\u04d6\u04d7\7c\2\2\u04d7\u04d9\7\67\2\2\u04d8\u04da\5\u00d0i\2\u04d9"+
		"\u04d8\3\2\2\2\u04d9\u04da\3\2\2\2\u04da\u04db\3\2\2\2\u04db\u04dc\78"+
		"\2\2\u04dc\u04f7\3\2\2\2\u04dd\u04de\7*\2\2\u04de\u04e0\7>\2\2\u04df\u04e1"+
		"\5(\25\2\u04e0\u04df\3\2\2\2\u04e0\u04e1\3\2\2\2\u04e1\u04e2\3\2\2\2\u04e2"+
		"\u04e3\7c\2\2\u04e3\u04e5\7\67\2\2\u04e4\u04e6\5\u00d0i\2\u04e5\u04e4"+
		"\3\2\2\2\u04e5\u04e6\3\2\2\2\u04e6\u04e7\3\2\2\2\u04e7\u04f7\78\2\2\u04e8"+
		"\u04e9\5\62\32\2\u04e9\u04ea\7>\2\2\u04ea\u04eb\7*\2\2\u04eb\u04ed\7>"+
		"\2\2\u04ec\u04ee\5(\25\2\u04ed\u04ec\3\2\2\2\u04ed\u04ee\3\2\2\2\u04ee"+
		"\u04ef\3\2\2\2\u04ef\u04f0\7c\2\2\u04f0\u04f2\7\67\2\2\u04f1\u04f3\5\u00d0"+
		"i\2\u04f2\u04f1\3\2\2\2\u04f2\u04f3\3\2\2\2\u04f3\u04f4\3\2\2\2\u04f4"+
		"\u04f5\78\2\2\u04f5\u04f7\3\2\2\2\u04f6\u04be\3\2\2\2\u04f6\u04c5\3\2"+
		"\2\2\u04f6\u04d1\3\2\2\2\u04f6\u04dd\3\2\2\2\u04f6\u04e8\3\2\2\2\u04f7"+
		"\u00cf\3\2\2\2\u04f8\u04fd\5\u00e4s\2\u04f9\u04fa\7=\2\2\u04fa\u04fc\5"+
		"\u00e4s\2\u04fb\u04f9\3\2\2\2\u04fc\u04ff\3\2\2\2\u04fd\u04fb\3\2\2\2"+
		"\u04fd\u04fe\3\2\2\2\u04fe\u00d1\3\2\2\2\u04ff\u04fd\3\2\2\2\u0500\u0501"+
		"\5\66\34\2\u0501\u0503\7W\2\2\u0502\u0504\5(\25\2\u0503\u0502\3\2\2\2"+
		"\u0503\u0504\3\2\2\2\u0504\u0505\3\2\2\2\u0505\u0506\7c\2\2\u0506\u0530"+
		"\3\2\2\2\u0507\u0508\5\16\b\2\u0508\u050a\7W\2\2\u0509\u050b\5(\25\2\u050a"+
		"\u0509\3\2\2\2\u050a\u050b\3\2\2\2\u050b\u050c\3\2\2\2\u050c\u050d\7c"+
		"\2\2\u050d\u0530\3\2\2\2\u050e\u050f\5\u00a2R\2\u050f\u0511\7W\2\2\u0510"+
		"\u0512\5(\25\2\u0511\u0510\3\2\2\2\u0511\u0512\3\2\2\2\u0512\u0513\3\2"+
		"\2\2\u0513\u0514\7c\2\2\u0514\u0530\3\2\2\2\u0515\u0516\7*\2\2\u0516\u0518"+
		"\7W\2\2\u0517\u0519\5(\25\2\u0518\u0517\3\2\2\2\u0518\u0519\3\2\2\2\u0519"+
		"\u051a\3\2\2\2\u051a\u0530\7c\2\2\u051b\u051c\5\62\32\2\u051c\u051d\7"+
		">\2\2\u051d\u051e\7*\2\2\u051e\u0520\7W\2\2\u051f\u0521\5(\25\2\u0520"+
		"\u051f\3\2\2\2\u0520\u0521\3\2\2\2\u0521\u0522\3\2\2\2\u0522\u0523\7c"+
		"\2\2\u0523\u0530\3\2\2\2\u0524\u0525\5\22\n\2\u0525\u0527\7W\2\2\u0526"+
		"\u0528\5(\25\2\u0527\u0526\3\2\2\2\u0527\u0528\3\2\2\2\u0528\u0529\3\2"+
		"\2\2\u0529\u052a\7\'\2\2\u052a\u0530\3\2\2\2\u052b\u052c\5\36\20\2\u052c"+
		"\u052d\7W\2\2\u052d\u052e\7\'\2\2\u052e\u0530\3\2\2\2\u052f\u0500\3\2"+
		"\2\2\u052f\u0507\3\2\2\2\u052f\u050e\3\2\2\2\u052f\u0515\3\2\2\2\u052f"+
		"\u051b\3\2\2\2\u052f\u0524\3\2\2\2\u052f\u052b\3\2\2\2\u0530\u00d3\3\2"+
		"\2\2\u0531\u0533\7W\2\2\u0532\u0534\5(\25\2\u0533\u0532\3\2\2\2\u0533"+
		"\u0534\3\2\2\2\u0534\u0535\3\2\2\2\u0535\u0536\7c\2\2\u0536\u00d5\3\2"+
		"\2\2\u0537\u0538\5\66\34\2\u0538\u053a\7W\2\2\u0539\u053b\5(\25\2\u053a"+
		"\u0539\3\2\2\2\u053a\u053b\3\2\2\2\u053b\u053c\3\2\2\2\u053c\u053d\7c"+
		"\2\2\u053d\u0560\3\2\2\2\u053e\u053f\5\16\b\2\u053f\u0541\7W\2\2\u0540"+
		"\u0542\5(\25\2\u0541\u0540\3\2\2\2\u0541\u0542\3\2\2\2\u0542\u0543\3\2"+
		"\2\2\u0543\u0544\7c\2\2\u0544\u0560\3\2\2\2\u0545\u0546\7*\2\2\u0546\u0548"+
		"\7W\2\2\u0547\u0549\5(\25\2\u0548\u0547\3\2\2\2\u0548\u0549\3\2\2\2\u0549"+
		"\u054a\3\2\2\2\u054a\u0560\7c\2\2\u054b\u054c\5\62\32\2\u054c\u054d\7"+
		">\2\2\u054d\u054e\7*\2\2\u054e\u0550\7W\2\2\u054f\u0551\5(\25\2\u0550"+
		"\u054f\3\2\2\2\u0550\u0551\3\2\2\2\u0551\u0552\3\2\2\2\u0552\u0553\7c"+
		"\2\2\u0553\u0560\3\2\2\2\u0554\u0555\5\22\n\2\u0555\u0557\7W\2\2\u0556"+
		"\u0558\5(\25\2\u0557\u0556\3\2\2\2\u0557\u0558\3\2\2\2\u0558\u0559\3\2"+
		"\2\2\u0559\u055a\7\'\2\2\u055a\u0560\3\2\2\2\u055b\u055c\5\36\20\2\u055c"+
		"\u055d\7W\2\2\u055d\u055e\7\'\2\2\u055e\u0560\3\2\2\2\u055f\u0537\3\2"+
		"\2\2\u055f\u053e\3\2\2\2\u055f\u0545\3\2\2\2\u055f\u054b\3\2\2\2\u055f"+
		"\u0554\3\2\2\2\u055f\u055b\3\2\2\2\u0560\u00d7\3\2\2\2\u0561\u0562\7\'"+
		"\2\2\u0562\u0563\5\6\4\2\u0563\u0565\5\u00dep\2\u0564\u0566\5 \21\2\u0565"+
		"\u0564\3\2\2\2\u0565\u0566\3\2\2\2\u0566\u0578\3\2\2\2\u0567\u0568\7\'"+
		"\2\2\u0568\u0569\5\20\t\2\u0569\u056b\5\u00dep\2\u056a\u056c\5 \21\2\u056b"+
		"\u056a\3\2\2\2\u056b\u056c\3\2\2\2\u056c\u0578\3\2\2\2\u056d\u056e\7\'"+
		"\2\2\u056e\u056f\5\6\4\2\u056f\u0570\5 \21\2\u0570\u0571\5\u00dan\2\u0571"+
		"\u0578\3\2\2\2\u0572\u0573\7\'\2\2\u0573\u0574\5\20\t\2\u0574\u0575\5"+
		" \21\2\u0575\u0576\5\u00dan\2\u0576\u0578\3\2\2\2\u0577\u0561\3\2\2\2"+
		"\u0577\u0567\3\2\2\2\u0577\u056d\3\2\2\2\u0577\u0572\3\2\2\2\u0578\u00d9"+
		"\3\2\2\2\u0579\u057b\79\2\2\u057a\u057c\5\u00dco\2\u057b\u057a\3\2\2\2"+
		"\u057b\u057c\3\2\2\2\u057c\u057e\3\2\2\2\u057d\u057f\7=\2\2\u057e\u057d"+
		"\3\2\2\2\u057e\u057f\3\2\2\2\u057f\u0580\3\2\2\2\u0580\u0581\7:\2\2\u0581"+
		"\u00db\3\2\2\2\u0582\u0587\5H%\2\u0583\u0584\7=\2\2\u0584\u0586\5H%\2"+
		"\u0585\u0583\3\2\2\2\u0586\u0589\3\2\2\2\u0587\u0585\3\2\2\2\u0587\u0588"+
		"\3\2\2\2\u0588\u00dd\3\2\2\2\u0589\u0587\3\2\2\2\u058a\u058e\5\u00e0q"+
		"\2\u058b\u058d\5\u00e0q\2\u058c\u058b\3\2\2\2\u058d\u0590\3\2\2\2\u058e"+
		"\u058c\3\2\2\2\u058e\u058f\3\2\2\2\u058f\u00df\3\2\2\2\u0590\u058e\3\2"+
		"\2\2\u0591\u0592\7;\2\2\u0592\u0593\5\u00e4s\2\u0593\u0594\7<\2\2\u0594"+
		"\u00e1\3\2\2\2\u0595\u0596\5\u00e4s\2\u0596\u00e3\3\2\2\2\u0597\u059b"+
		"\5\u00e6t\2\u0598\u059b\5\u00ecw\2\u0599\u059b\7\16\2\2\u059a\u0597\3"+
		"\2\2\2\u059a\u0598\3\2\2\2\u059a\u0599\3\2\2\2\u059b\u00e5\3\2\2\2\u059c"+
		"\u059d\5\u00e8u\2\u059d\u059e\7V\2\2\u059e\u059f\5\u00eav\2\u059f\u00e7"+
		"\3\2\2\2\u05a0\u05a7\7c\2\2\u05a1\u05a3\7\67\2\2\u05a2\u05a4\5d\63\2\u05a3"+
		"\u05a2\3\2\2\2\u05a3\u05a4\3\2\2\2\u05a4\u05a5\3\2\2\2\u05a5\u05a7\78"+
		"\2\2\u05a6\u05a0\3\2\2\2\u05a6\u05a1\3\2\2\2\u05a7\u00e9\3\2\2\2\u05a8"+
		"\u05ab\5\u00e4s\2\u05a9\u05ab\3\2\2\2\u05aa\u05a8\3\2\2\2\u05aa\u05a9"+
		"\3\2\2\2\u05ab\u00eb\3\2\2\2\u05ac\u05af\5\u00f4{\2\u05ad\u05af\5\u00ee"+
		"x\2\u05ae\u05ac\3\2\2\2\u05ae\u05ad\3\2\2\2\u05af\u00ed\3\2\2\2\u05b0"+
		"\u05b1\5\u00f0y\2\u05b1\u05b2\5\u00f2z\2\u05b2\u05b3\5\u00e4s\2\u05b3"+
		"\u00ef\3\2\2\2\u05b4\u05b8\5\66\34\2\u05b5\u05b8\5\u00be`\2\u05b6\u05b8"+
		"\5\u00c4c\2\u05b7\u05b4\3\2\2\2\u05b7\u05b5\3\2\2\2\u05b7\u05b6\3\2\2"+
		"\2\u05b8\u00f1\3\2\2\2\u05b9\u05ba\t\5\2\2\u05ba\u00f3\3\2\2\2\u05bb\u05c3"+
		"\5\u00f6|\2\u05bc\u05bd\5\u00f6|\2\u05bd\u05be\7D\2\2\u05be\u05bf\5\u00e4"+
		"s\2\u05bf\u05c0\7E\2\2\u05c0\u05c1\5\u00f4{\2\u05c1\u05c3\3\2\2\2\u05c2"+
		"\u05bb\3\2\2\2\u05c2\u05bc\3\2\2\2\u05c3\u00f5\3\2\2\2\u05c4\u05c5\b|"+
		"\1\2\u05c5\u05c6\5\u00f8}\2\u05c6\u05cc\3\2\2\2\u05c7\u05c8\f\3\2\2\u05c8"+
		"\u05c9\7K\2\2\u05c9\u05cb\5\u00f8}\2\u05ca\u05c7\3\2\2\2\u05cb\u05ce\3"+
		"\2\2\2\u05cc\u05ca\3\2\2\2\u05cc\u05cd\3\2\2\2\u05cd\u00f7\3\2\2\2\u05ce"+
		"\u05cc\3\2\2\2\u05cf\u05d0\b}\1\2\u05d0\u05d1\5\u00fa~\2\u05d1\u05d7\3"+
		"\2\2\2\u05d2\u05d3\f\3\2\2\u05d3\u05d4\7J\2\2\u05d4\u05d6\5\u00fa~\2\u05d5"+
		"\u05d2\3\2\2\2\u05d6\u05d9\3\2\2\2\u05d7\u05d5\3\2\2\2\u05d7\u05d8\3\2"+
		"\2\2\u05d8\u00f9\3\2\2\2\u05d9\u05d7\3\2\2\2\u05da\u05db\b~\1\2\u05db"+
		"\u05dc\5\u00fc\177\2\u05dc\u05e2\3\2\2\2\u05dd\u05de\f\3\2\2\u05de\u05df"+
		"\7S\2\2\u05df\u05e1\5\u00fc\177\2\u05e0\u05dd\3\2\2\2\u05e1\u05e4\3\2"+
		"\2\2\u05e2\u05e0\3\2\2\2\u05e2\u05e3\3\2\2\2\u05e3\u00fb\3\2\2\2\u05e4"+
		"\u05e2\3\2\2\2\u05e5\u05e6\b\177\1\2\u05e6\u05e7\5\u00fe\u0080\2\u05e7"+
		"\u05ed\3\2\2\2\u05e8\u05e9\f\3\2\2\u05e9\u05ea\7T\2\2\u05ea\u05ec\5\u00fe"+
		"\u0080\2\u05eb\u05e8\3\2\2\2\u05ec\u05ef\3\2\2\2\u05ed\u05eb\3\2\2\2\u05ed"+
		"\u05ee\3\2\2\2\u05ee\u00fd\3\2\2\2\u05ef\u05ed\3\2\2\2\u05f0\u05f1\b\u0080"+
		"\1\2\u05f1\u05f2\5\u0100\u0081\2\u05f2\u05f8\3\2\2\2\u05f3\u05f4\f\3\2"+
		"\2\u05f4\u05f5\7R\2\2\u05f5\u05f7\5\u0100\u0081\2\u05f6\u05f3\3\2\2\2"+
		"\u05f7\u05fa\3\2\2\2\u05f8\u05f6\3\2\2\2\u05f8\u05f9\3\2\2\2\u05f9\u00ff"+
		"\3\2\2\2\u05fa\u05f8\3\2\2\2\u05fb\u05fc\b\u0081\1\2\u05fc\u05fd\5\u0102"+
		"\u0082\2\u05fd\u0606\3\2\2\2\u05fe\u05ff\f\4\2\2\u05ff\u0600\7F\2\2\u0600"+
		"\u0605\5\u0102\u0082\2\u0601\u0602\f\3\2\2\u0602\u0603\7I\2\2\u0603\u0605"+
		"\5\u0102\u0082\2\u0604\u05fe\3\2\2\2\u0604\u0601\3\2\2\2\u0605\u0608\3"+
		"\2\2\2\u0606\u0604\3\2\2\2\u0606\u0607\3\2\2\2\u0607\u0101\3\2\2\2\u0608"+
		"\u0606\3\2\2\2\u0609\u060a\b\u0082\1\2\u060a\u060b\5\u0104\u0083\2\u060b"+
		"\u0620\3\2\2\2\u060c\u060d\f\7\2\2\u060d\u060e\7A\2\2\u060e\u061f\5\u0104"+
		"\u0083\2\u060f\u0610\f\6\2\2\u0610\u0611\7@\2\2\u0611\u061f\5\u0104\u0083"+
		"\2\u0612\u0613\f\5\2\2\u0613\u0614\7G\2\2\u0614\u061f\5\u0104\u0083\2"+
		"\u0615\u0616\f\4\2\2\u0616\u0617\7H\2\2\u0617\u061f\5\u0104\u0083\2\u0618"+
		"\u0619\f\3\2\2\u0619\u061c\7#\2\2\u061a\u061d\5\16\b\2\u061b\u061d\7\b"+
		"\2\2\u061c\u061a\3\2\2\2\u061c\u061b\3\2\2\2\u061d\u061f\3\2\2\2\u061e"+
		"\u060c\3\2\2\2\u061e\u060f\3\2\2\2\u061e\u0612\3\2\2\2\u061e\u0615\3\2"+
		"\2\2\u061e\u0618\3\2\2\2\u061f\u0622\3\2\2\2\u0620\u061e\3\2\2\2\u0620"+
		"\u0621\3\2\2\2\u0621\u0103\3\2\2\2\u0622\u0620\3\2\2\2\u0623\u0624\b\u0083"+
		"\1\2\u0624\u0625\5\u0106\u0084\2\u0625\u0635\3\2\2\2\u0626\u0627\f\5\2"+
		"\2\u0627\u0628\7A\2\2\u0628\u0629\7A\2\2\u0629\u0634\5\u0106\u0084\2\u062a"+
		"\u062b\f\4\2\2\u062b\u062c\7@\2\2\u062c\u062d\7@\2\2\u062d\u0634\5\u0106"+
		"\u0084\2\u062e\u062f\f\3\2\2\u062f\u0630\7@\2\2\u0630\u0631\7@\2\2\u0631"+
		"\u0632\7@\2\2\u0632\u0634\5\u0106\u0084\2\u0633\u0626\3\2\2\2\u0633\u062a"+
		"\3\2\2\2\u0633\u062e\3\2\2\2\u0634\u0637\3\2\2\2\u0635\u0633\3\2\2\2\u0635"+
		"\u0636\3\2\2\2\u0636\u0105\3\2\2\2\u0637\u0635\3\2\2\2\u0638\u0639\b\u0084"+
		"\1\2\u0639\u063a\5\u0108\u0085\2\u063a\u0643\3\2\2\2\u063b\u063c\f\4\2"+
		"\2\u063c\u063d\7N\2\2\u063d\u0642\5\u0108\u0085\2\u063e\u063f\f\3\2\2"+
		"\u063f\u0640\7O\2\2\u0640\u0642\5\u0108\u0085\2\u0641\u063b\3\2\2\2\u0641"+
		"\u063e\3\2\2\2\u0642\u0645\3\2\2\2\u0643\u0641\3\2\2\2\u0643\u0644\3\2"+
		"\2\2\u0644\u0107\3\2\2\2\u0645\u0643\3\2\2\2\u0646\u0647\b\u0085\1\2\u0647"+
		"\u0648\5\u010a\u0086\2\u0648\u0654\3\2\2\2\u0649\u064a\f\5\2\2\u064a\u064b"+
		"\7P\2\2\u064b\u0653\5\u010a\u0086\2\u064c\u064d\f\4\2\2\u064d\u064e\7"+
		"Q\2\2\u064e\u0653\5\u010a\u0086\2\u064f\u0650\f\3\2\2\u0650\u0651\7U\2"+
		"\2\u0651\u0653\5\u010a\u0086\2\u0652\u0649\3\2\2\2\u0652\u064c\3\2\2\2"+
		"\u0652\u064f\3\2\2\2\u0653\u0656\3\2\2\2\u0654\u0652\3\2\2\2\u0654\u0655"+
		"\3\2\2\2\u0655\u0109\3\2\2\2\u0656\u0654\3\2\2\2\u0657\u065f\5\u010c\u0087"+
		"\2\u0658\u065f\5\u010e\u0088\2\u0659\u065a\7N\2\2\u065a\u065f\5\u010a"+
		"\u0086\2\u065b\u065c\7O\2\2\u065c\u065f\5\u010a\u0086\2\u065d\u065f\5"+
		"\u0110\u0089\2\u065e\u0657\3\2\2\2\u065e\u0658\3\2\2\2\u065e\u0659\3\2"+
		"\2\2\u065e\u065b\3\2\2\2\u065e\u065d\3\2\2\2\u065f\u010b\3\2\2\2\u0660"+
		"\u0661\7L\2\2\u0661\u0662\5\u010a\u0086\2\u0662\u010d\3\2\2\2\u0663\u0664"+
		"\7M\2\2\u0664\u0665\5\u010a\u0086\2\u0665\u010f\3\2\2\2\u0666\u066d\5"+
		"\u0112\u008a\2\u0667\u0668\7C\2\2\u0668\u066d\5\u010a\u0086\2\u0669\u066a"+
		"\7B\2\2\u066a\u066d\5\u010a\u0086\2\u066b\u066d\5\u011c\u008f\2\u066c"+
		"\u0666\3\2\2\2\u066c\u0667\3\2\2\2\u066c\u0669\3\2\2\2\u066c\u066b\3\2"+
		"\2\2\u066d\u0111\3\2\2\2\u066e\u0671\5\u00a2R\2\u066f\u0671\5\66\34\2"+
		"\u0670\u066e\3\2\2\2\u0670\u066f\3\2\2\2\u0671\u0676\3\2\2\2\u0672\u0675"+
		"\5\u0116\u008c\2\u0673\u0675\5\u011a\u008e\2\u0674\u0672\3\2\2\2\u0674"+
		"\u0673\3\2\2\2\u0675\u0678\3\2\2\2\u0676\u0674\3\2\2\2\u0676\u0677\3\2"+
		"\2\2\u0677\u0113\3\2\2\2\u0678\u0676\3\2\2\2\u0679\u067a\5\u0112\u008a"+
		"\2\u067a\u067b\7L\2\2\u067b\u0115\3\2\2\2\u067c\u067d\7L\2\2\u067d\u0117"+
		"\3\2\2\2\u067e\u067f\5\u0112\u008a\2\u067f\u0680\7M\2\2\u0680\u0119\3"+
		"\2\2\2\u0681\u0682\7M\2\2\u0682\u011b\3\2\2\2\u0683\u0684\7\67\2\2\u0684"+
		"\u0685\5\6\4\2\u0685\u0686\78\2\2\u0686\u0687\5\u010a\u0086\2\u0687\u06b7"+
		"\3\2\2\2\u0688\u0689\7\67\2\2\u0689\u068d\5\16\b\2\u068a\u068c\5&\24\2"+
		"\u068b\u068a\3\2\2\2\u068c\u068f\3\2\2\2\u068d\u068b\3\2\2\2\u068d\u068e"+
		"\3\2\2\2\u068e\u0690\3\2\2\2\u068f\u068d\3\2\2\2\u0690\u0691\78\2\2\u0691"+
		"\u0692\5\u0110\u0089\2\u0692\u06b7\3\2\2\2\u0693\u0694\7\67\2\2\u0694"+
		"\u0698\5\16\b\2\u0695\u0697\5&\24\2\u0696\u0695\3\2\2\2\u0697\u069a\3"+
		"\2\2\2\u0698\u0696\3\2\2\2\u0698\u0699\3\2\2\2\u0699\u069b\3\2\2\2\u069a"+
		"\u0698\3\2\2\2\u069b\u069c\78\2\2\u069c\u069d\5\u00e6t\2\u069d\u06b7\3"+
		"\2\2\2\u069e\u069f\7\67\2\2\u069f\u06a0\7\b\2\2\u06a0\u06a1\78\2\2\u06a1"+
		"\u06b7\5\u010a\u0086\2\u06a2\u06a3\7\67\2\2\u06a3\u06a7\7\b\2\2\u06a4"+
		"\u06a6\5\u011e\u0090\2\u06a5\u06a4\3\2\2\2\u06a6\u06a9\3\2\2\2\u06a7\u06a5"+
		"\3\2\2\2\u06a7\u06a8\3\2\2\2\u06a8\u06aa\3\2\2\2\u06a9\u06a7\3\2\2\2\u06aa"+
		"\u06ab\78\2\2\u06ab\u06b7\5\u0110\u0089\2\u06ac\u06ad\7\67\2\2\u06ad\u06b1"+
		"\7\b\2\2\u06ae\u06b0\5\u011e\u0090\2\u06af\u06ae\3\2\2\2\u06b0\u06b3\3"+
		"\2\2\2\u06b1\u06af\3\2\2\2\u06b1\u06b2\3\2\2\2\u06b2\u06b4\3\2\2\2\u06b3"+
		"\u06b1\3\2\2\2\u06b4\u06b5\78\2\2\u06b5\u06b7\5\u00e6t\2\u06b6\u0683\3"+
		"\2\2\2\u06b6\u0688\3\2\2\2\u06b6\u0693\3\2\2\2\u06b6\u069e\3\2\2\2\u06b6"+
		"\u06a2\3\2\2\2\u06b6\u06ac\3\2\2\2\u06b7\u011d\3\2\2\2\u06b8\u06bb\7R"+
		"\2\2\u06b9\u06bc\5\30\r\2\u06ba\u06bc\7\b\2\2\u06bb\u06b9\3\2\2\2\u06bb"+
		"\u06ba\3\2\2\2\u06bc\u011f\3\2\2\2\u00c1\u0124\u0128\u012c\u0135\u0139"+
		"\u013d\u013f\u0144\u014a\u014c\u0151\u0155\u0165\u016d\u0172\u017b\u017e"+
		"\u018c\u0192\u0196\u019c\u01a3\u01ad\u01b5\u01c1\u01d1\u01d9\u01df\u01e5"+
		"\u01e9\u01ed\u01f2\u01f6\u01fa\u01fc\u0201\u0207\u0209\u020e\u0212\u0225"+
		"\u022a\u0235\u023d\u0240\u0247\u0250\u0255\u025a\u025f\u0263\u0268\u026e"+
		"\u0273\u027a\u027f\u0283\u028c\u0295\u02a2\u02af\u02ba\u02c6\u02d0\u02d4"+
		"\u02d8\u02f0\u02fa\u02ff\u0308\u031f\u0329\u033f\u0346\u034e\u0356\u0361"+
		"\u0378\u0382\u038d\u03a3\u03a7\u03ae\u03b2\u03b6\u03bd\u03c1\u03c5\u03cd"+
		"\u03d1\u03d5\u03d9\u03de\u03e2\u03e6\u03ec\u03f3\u03f7\u03fb\u0402\u0406"+
		"\u040a\u040e\u0413\u0422\u0430\u043c\u0445\u0454\u0461\u046a\u0470\u0477"+
		"\u047c\u0483\u0488\u048f\u0494\u049b\u04a0\u04a8\u04ad\u04b1\u04b5\u04ba"+
		"\u04c1\u04c8\u04cd\u04d4\u04d9\u04e0\u04e5\u04ed\u04f2\u04f6\u04fd\u0503"+
		"\u050a\u0511\u0518\u0520\u0527\u052f\u0533\u053a\u0541\u0548\u0550\u0557"+
		"\u055f\u0565\u056b\u0577\u057b\u057e\u0587\u058e\u059a\u05a3\u05a6\u05aa"+
		"\u05ae\u05b7\u05c2\u05cc\u05d7\u05e2\u05ed\u05f8\u0604\u0606\u061c\u061e"+
		"\u0620\u0633\u0635\u0641\u0643\u0652\u0654\u065e\u066c\u0670\u0674\u0676"+
		"\u068d\u0698\u06a7\u06b1\u06b6\u06bb";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}