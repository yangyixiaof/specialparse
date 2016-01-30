grammar Java8;

statement
	:	typeDeclarationStatement
	|	leftParentheseStatement
	|	leftBraceStatement
	|	rightBraceStatement
	|	lambdaExpressionStatement
	|	breakStatement
	|	continueStatement
	|	doStatement
	|	enhancedForStatement
	|	arrayAccessStatement
	|	arrayInitializerStartStatement
	|	labeledStatement
	|	returnStatement
	|	switchStatement
	|	switchCaseStatement
	|	synchronizedStatement
	|	throwStatement
	|	catchClause
	|	whileStatement
	|	ifStatement
	|	forStatement
	|	forIniOverStatement
	|	forExpOverStatement
	|	forUpdOverStatement
	|	variableDeclarationTypeStatement
	|	condExpBeginStatement
	|	condExpQuestionMarkStatement
	|	condExpColonMarkStatement
	|	expressionStatement
	;
	
expressionStatement : expression endOfStatement ;
	
expression
	:	assignment
	|	literal
	|	castExpression
	|	methodInvocation
	|	fieldAccess
	|	infixExpression
	|	instanceofExpression
	|	methodReference
	|	identifier
	|	postfixExpression
	|	prefixExpression
	;
	
referedExpression
	:	identifier
	|	fieldAccess
	|	literal
	;
	
assignment : referedExpression assignmentOperator expression ;

methodInvocation : identifier '(' argumentList ')' ;

argumentList : expression (',' expression)* ;
	
methodDeclaration : identifier '(' typeList? ')' AT 'MD' ;

typeList : type (',' type)* ;

fieldAccess : identifier '.' expression ;

condExpColonMarkStatement : 'CondExpCM' AT 'DH' endOfStatement ;

condExpQuestionMarkStatement : 'CondExpQM' AT 'DH' endOfStatement ;

condExpBeginStatement : 'CondExpBegin' AT 'DH' endOfStatement ;

variableDeclarationTypeStatement : type AT 'VD' endOfStatement ;

forUpdOverStatement : 'forUpdOver' AT 'DH' endOfStatement ;

forExpOverStatement : 'forExpOver' AT 'DH' endOfStatement ;

forIniOverStatement : 'forIniOver' AT 'DH' endOfStatement ;

forStatement : 'for' AT 'DH' endOfStatement ;

ifStatement : 'if' '#' expression endOfStatement ;

whileStatement : 'while' '#' expression endOfStatement ;

catchClause : 'catch' '#' type;

throwStatement : 'throw' '#' expression endOfStatement ;

synchronizedStatement : 'synchronized' '#' expression endOfStatement ;

switchCaseStatement : 'case' '#' expression endOfStatement ;
	
switchStatement : 'switch' '#' expression endOfStatement ;

breakStatement : 'break' ('#' identifier)? endOfStatement ;

continueStatement : 'continue' ('#' identifier)? endOfStatement ;

doStatement : 'do' AT 'DH' endOfStatement ;

enhancedForStatement : 'for(' type ':' expression ')' endOfStatement ;

arrayAccessStatement : expression '@AC' expression endOfStatement ;

arrayInitializerStartStatement : 'arrIni' AT 'DH' endOfStatement ;

infixExpression : referedExpression binaryOperator expression ;

instanceofExpression : referedExpression 'instanceof' type ;

labeledStatement : identifier AT 'LD' endOfStatement ;

postfixExpression : referedExpression unaryOperator ;

prefixExpression : unaryOperator expression ;

returnStatement : 'return' ('#' expression)? endOfStatement ;

castExpression : '(' type ')' expression ;
	
methodReference : identifier '::' expression ;

lambdaExpressionStatement : lambdaParameters '->' '{}' endOfStatement ;

lambdaParameters : '(' formalParameterList? ')' | '(' inferredFormalParameterList ')' ;
	
formalParameterList : formalParameter (',' formalParameter)* ;

formalParameters : formalParameter (',' formalParameter)* ;

formalParameter : type identifier ;

inferredFormalParameterList : identifier (',' identifier)* ;

typeDeclarationStatement : identifier AT 'CD' endOfStatement ;
	
leftParentheseStatement : '(' ;
	
leftBraceStatement : '{' ;

rightBraceStatement : '}' ;

literal
	:	numberLiteral
	|	booleanLiteral
	|	characterLiteral
	|	stringLiteral
	|	nullLiteral
	;

referenceType
	:	classOrInterfaceType
	|	ClassRef
	|	arrayType
	;

numberLiteral
	:	integerLiteral
	|	floatingPointLiteral
	;

stringLiteral
	:	AT 'STR'
	;

type
	:	primitiveType
	|	classOrInterfaceType
	|	arrayType
	|	intersectionType
	|	unionType
	|	ClassRef
	;
	
primitiveType
	:	'float'
	|	'double'
	|	'boolean'
	|	'byte'
	|	'short'
	|	'int'
	|	'long'
	|	'char'
	;

classOrInterfaceType
	:	(identifier typeArguments?) ('.' identifier typeArguments?)*
	;

arrayType
	:	primitiveType dims
	|	classOrInterfaceType dims
	;

dims
	:	'[' ']' ('[' ']')*
	;

typeArguments
	:	'<' typeArgumentList '>'
	;

typeArgumentList
	:	typeArgument (',' typeArgument)*
	;

typeArgument
	:	referenceType
	|	wildCard
	;

wildCard
	:	'?' wildcardBounds?
	;

wildcardBounds
	:	'extends' referenceType
	|	'super' referenceType
	;
	
intersectionType
	:	(classOrInterfaceType | primitiveType) ('&' (classOrInterfaceType | primitiveType))+
	;
	
unionType
	:	(classOrInterfaceType | primitiveType) ('|' (classOrInterfaceType | primitiveType))+
	;

identifier
	:	JavaLetter JavaLetterOrDigit*
	|	FinalFieldRef
	|	FinalVarRef
	|	CommonFieldRef
	|	CommonVarRef
	|	codeHole
	|	preExist
	;

JavaLetter
	:	[a-zA-Z$_] // these are the "java letters" below 0xFF
	|	// covers all characters above 0xFF which are not a surrogate
		~[\u0000-\u00FF\uD800-\uDBFF]
		{Character.isJavaIdentifierStart(_input.LA(-1))}?
	|	// covers UTF-16 surrogate pairs encodings for U+10000 to U+10FFFF
		[\uD800-\uDBFF] [\uDC00-\uDFFF]
		{Character.isJavaIdentifierStart(Character.toCodePoint((char)_input.LA(-2), (char)_input.LA(-1)))}?
	;

JavaLetterOrDigit
	:	[a-zA-Z0-9$_] // these are the "java letters or digits" below 0xFF
	|	// covers all characters above 0xFF which are not a surrogate
		~[\u0000-\u00FF\uD800-\uDBFF]
		{Character.isJavaIdentifierPart(_input.LA(-1))}?
	|	// covers UTF-16 surrogate pairs encodings for U+10000 to U+10FFFF
		[\uD800-\uDBFF] [\uDC00-\uDFFF]
		{Character.isJavaIdentifierPart(Character.toCodePoint((char)_input.LA(-2), (char)_input.LA(-1)))}?
	;

ClassRef : '$K' [0-9]+ '?' [0-9]+ ;
FinalFieldRef : '$D' [0-9]+ '?' [0-9]+ ;
FinalVarRef : '$X' [0-9]+ '?' [0-9]+ ;
CommonFieldRef : '$F' [0-9]+ '?' [0-9]+ ;
CommonVarRef : '$C' [0-9]+ '?' [0-9]+ ;

codeHole : AT 'HO' ;
preExist : AT 'PE' ;

endOfStatement : partialEnd fullEnd? ;

fullEnd : endOfAStatement ;

endOfAStatement : AT 'ED' ;

partialEnd : onePartialEnd* ;

onePartialEnd : endOfAPartialStatement | endOfArrayDeclarationIndexExpression | rightParenthese ;

endOfAPartialStatement : AT 'PD' ;

endOfArrayDeclarationIndexExpression : AT 'AD' ;

rightParenthese : ')' ;

AT : '@' ;

WS  :  [ '#' ]+ -> skip ;

integerLiteral
	:	DecimalIntegerLiteral
	|	HexIntegerLiteral
	|	OctalIntegerLiteral
	|	BinaryIntegerLiteral
	;

DecimalIntegerLiteral
	:	DecimalNumeral IntegerTypeSuffix?
	;

HexIntegerLiteral
	:	HexNumeral IntegerTypeSuffix?
	;

OctalIntegerLiteral
	:	OctalNumeral IntegerTypeSuffix?
	;

BinaryIntegerLiteral
	:	BinaryNumeral IntegerTypeSuffix?
	;

IntegerTypeSuffix
	:	[lL]
	;

DecimalNumeral
	:	'0'
	|	NonZeroDigit (Digits? | Underscores Digits)
	;

Digits
	:	Digit (DigitsAndUnderscores? Digit)?
	;

Digit
	:	'0'
	|	NonZeroDigit
	;

NonZeroDigit
	:	[1-9]
	;

DigitsAndUnderscores
	:	DigitOrUnderscore+
	;

DigitOrUnderscore
	:	Digit
	|	'_'
	;

Underscores
	:	'_'+
	;

HexNumeral
	:	'0' [xX] HexDigits
	;

HexDigits
	:	HexDigit (HexDigitsAndUnderscores? HexDigit)?
	;

HexDigit
	:	[0-9a-fA-F]
	;

HexDigitsAndUnderscores
	:	HexDigitOrUnderscore+
	;

HexDigitOrUnderscore
	:	HexDigit
	|	'_'
	;

OctalNumeral
	:	'0' Underscores? OctalDigits
	;

OctalDigits
	:	OctalDigit (OctalDigitsAndUnderscores? OctalDigit)?
	;

OctalDigit
	:	[0-7]
	;

OctalDigitsAndUnderscores
	:	OctalDigitOrUnderscore+
	;

OctalDigitOrUnderscore
	:	OctalDigit
	|	'_'
	;

BinaryNumeral
	:	'0' [bB] BinaryDigits
	;

BinaryDigits
	:	BinaryDigit (BinaryDigitsAndUnderscores? BinaryDigit)?
	;

BinaryDigit
	:	[01]
	;

BinaryDigitsAndUnderscores
	:	BinaryDigitOrUnderscore+
	;

BinaryDigitOrUnderscore
	:	BinaryDigit
	|	'_'
	;

//  Floating-Point Literals

floatingPointLiteral
	:	DecimalFloatingPointLiteral
	|	HexadecimalFloatingPointLiteral
	;

DecimalFloatingPointLiteral
	:	Digits '.' Digits? ExponentPart? FloatTypeSuffix?
	|	'.' Digits ExponentPart? FloatTypeSuffix?
	|	Digits ExponentPart FloatTypeSuffix?
	|	Digits FloatTypeSuffix
	;

ExponentPart
	:	ExponentIndicator SignedInteger
	;

ExponentIndicator
	:	[eE]
	;

SignedInteger
	:	Sign? Digits
	;

Sign
	:	[+-]
	;

FloatTypeSuffix
	:	[fFdD]
	;

HexadecimalFloatingPointLiteral
	:	HexSignificand BinaryExponent FloatTypeSuffix?
	;

HexSignificand
	:	HexNumeral '.'?
	|	'0' [xX] HexDigits? '.' HexDigits
	;

BinaryExponent
	:	BinaryExponentIndicator SignedInteger
	;

BinaryExponentIndicator
	:	[pP]
	;

// Boolean Literals

booleanLiteral
	:	'true'
	|	'false'
	;

// Character Literals

characterLiteral
	:	'\'' SingleCharacter '\''
	|	'\'' EscapeSequence '\''
	;

SingleCharacter
	:	~['\\]
	;

// String Literals

// Escape Sequences for Character Literals

EscapeSequence
	:	'\\' [btnfr"'\\]
	|	OctalEscape
    |   UnicodeEscape // This is not in the spec but prevents having to preprocess the input
	;

OctalEscape
	:	'\\' OctalDigit
	|	'\\' OctalDigit OctalDigit
	|	'\\' ZeroToThree OctalDigit OctalDigit
	;

ZeroToThree
	:	[0-3]
	;

UnicodeEscape
    :   '\\' 'u' HexDigit HexDigit HexDigit HexDigit
    ;

nullLiteral
	:	'null'
	;
	
unaryOperator
	:	BANG
	|	TILDE
	|	INC
	|	DEC
	|	ADD
	|	SUB
	;

binaryOperator
	:	GT
	|	LT
	|	EQUAL
	|	LE
	|	GE
	|	NOTEQUAL
	|	AND
	|	OR
	|	ADD
	|	SUB
	|	MUL
	|	DIV
	|	BITAND
	|	BITOR
	|	CARET
	|	MOD
	|	LSHIFT
	|	RSHIFT
	|	URSHIFT
	;

assignmentOperator
	:	ASSIGN
	|	MUL_ASSIGN
	|	DIV_ASSIGN
	|	MOD_ASSIGN
	|	ADD_ASSIGN
	|	SUB_ASSIGN
	|	LSHIFT_ASSIGN
	|	RSHIFT_ASSIGN
	|	URSHIFT_ASSIGN
	|	AND_ASSIGN
	|	XOR_ASSIGN
	|	OR_ASSIGN
	;

COMMA : ',';
DOT : '.';

GT : '>';
LT : '<';
BANG : '!';
TILDE : '~';
QUESTION : '?';
COLON : ':';
EQUAL : '==';
LE : '<=';
GE : '>=';
NOTEQUAL : '!=';
AND : '&&';
OR : '||';
INC : '++';
DEC : '--';
ADD : '+';
SUB : '-';
MUL : '*';
DIV : '/';
BITAND : '&';
BITOR : '|';
CARET : '^';
MOD : '%';
LSHIFT : '<<';
RSHIFT : '>>';
URSHIFT : '>>>';
COLONCOLON : '::';

ASSIGN : '=';
ADD_ASSIGN : '+=';
SUB_ASSIGN : '-=';
MUL_ASSIGN : '*=';
DIV_ASSIGN : '/=';
AND_ASSIGN : '&=';
OR_ASSIGN : '|=';
XOR_ASSIGN : '^=';
MOD_ASSIGN : '%=';
LSHIFT_ASSIGN : '<<=';
RSHIFT_ASSIGN : '>>=';
URSHIFT_ASSIGN : '>>>=';