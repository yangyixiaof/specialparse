grammar Java8;

statement
	:	typeDeclarationStatement
	|	leftParentheseStatement
	|	leftBraceStatement
	|	rightBraceStatement
	|	lambdaExpressionStatement
	|	methodReferenceStatement
	|	castExpressionStatement
	|	assignmentStatement
	|	breakStatement
	|	continueStatement
	|	doStatement
	|	enhancedForStatement
	|	arrayAccessStatement
	|	arrayInitializerStartStatement
	|	infixExpressionStatement
	|	instanceofExpressionStatement
	|	labeledStatement
	|	postfixExpressionStatement
	|	prefixExpressionStatement
	|	returnStatement
	|	switchStatement
	|	switchCaseStatement
	|	synchronizedStatement
	|	throwStatement
	|	catchClause
	|	whileStatement
	|	ifStatement
	|	forStatement
	|	forIniOver
	|	forExpOver
	|	forUpdOver
	|	variableDeclarationTypeStatement
	|	condExpBegin
	|	condExpQuestionMark
	|	condExpColonMark
	|	
	|	localVariableDeclarationStatement
	|	ifStatement
	|	ElseStatement
	|	whileStatement
	|	forStatement
	|	expression
	|	assertStatement
	|	switchStatement
	|	caseStatement
	|	doStatement
	|	breakStatement
	|	continueStatement
	|	returnStatement
	|	synchronizedStatement
	|	throwStatement
	|	tryStatement
	|	typeDeclarationStatement
	;

qualified : identifier ('.' identifier)+ ;

methodInvocation : identifier '(' argumentList ')' ;

argumentList : expression (',' expression)* ;
	
methodDeclaration : identifier '(' typeList? ')' AT 'MD' ;

typeList : type (',' type)* ;

fieldAccess : identifier '.' expression AT 'FA';

condExpColonMark : 'CondExpCM' AT DH ;

condExpQuestionMark : 'CondExpQM' AT DH ;

condExpBegin : 'CondExpBegin' AT DH ;

variableDeclarationTypeStatement : type AT 'VD' ;

forUpdOver : 'forUpdOver' AT 'DH' ;

forExpOver : 'forExpOver' AT 'DH' ;

forIniOver : 'forIniOver' AT 'DH' ;

forStatement : 'for' AT 'DH' ;

ifStatement : 'if' '#' expression ;

whileStatement : 'while' '#' expression ;

catchClause : 'catch' '#' type;

throwStatement : 'throw' '#' expression ;

synchronizedStatement : 'synchronized' '#' expression ;

switchCaseStatement : 'case' '#' expression ;
	
switchStatement : 'switch' '#' expression ;

breakStatement : 'break' '#' identifier? ;

continueStatement : 'continue' '#' identifier? ;

doStatement : 'do' AT 'DH' ;

enhancedForStatement : 'for(' type ':' expression ')' ;

arrayAccessStatement : expression '@AC' expression ;

arrayInitializerStartStatement : 'arrIni' AT 'DH' ;

infixExpressionStatement : expression binaryOperator expression ;

instanceofExpressionStatement : expression 'instanceof' type ;

labeledStatement : identifier AT 'LD' ;

postfixExpressionStatement : expression unaryOperator ;

prefixExpressionStatement : unaryOperator expression ;

returnStatement : 'return' expression? ;

assignmentStatement : expression assignmentOperator expression ;

castExpressionStatement : '(' type ')' expression ;
	
methodReferenceStatement : identifier '::' expression ;

lambdaExpressionStatement : lambdaParameters '->' '{}' ;

lambdaParameters : '(' formalParameterList? ')' | '(' inferredFormalParameterList ')' ;
	
formalParameterList : formalParameter (',' formalParameter)* ;

formalParameters : formalParameter (',' formalParameter)* ;

formalParameter : type identifier ;

inferredFormalParameterList : identifier (',' identifier)* ;

typeDeclarationStatement : identifier AT 'CD' ;
	
leftParentheseStatement : '(' ;
	
leftBraceStatement : '{' ;

rightBraceStatement : '}' ;

literal
	:	NumberLiteral
	|	BooleanLiteral
	|	CharacterLiteral
	|	StringLiteral
	|	NullLiteral
	;

referenceType
	:	classOrInterfaceType
	|	classRef
	|	arrayType
	;

classOrInterfaceType
	:	(	identifier
		)
		(	'.' identifier
		)*
	;

arrayType
	:	primitiveType dims
	|	classOrInterfaceType dims
	|	identifier dims
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
	|	classRef
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
	:	(Identifier typeArguments?) ('.' Identifier typeArguments?)*
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
	|	finalFieldRef
	|	finalVarRef
	|	commonFieldRef
	|	commonVarRef
	|	codeHole
	|	preExist
	;

fragment
JavaLetter
	:	[a-zA-Z$_] // these are the "java letters" below 0xFF
	|	// covers all characters above 0xFF which are not a surrogate
		~[\u0000-\u00FF\uD800-\uDBFF]
		{Character.isJavaIdentifierStart(_input.LA(-1))}?
	|	// covers UTF-16 surrogate pairs encodings for U+10000 to U+10FFFF
		[\uD800-\uDBFF] [\uDC00-\uDFFF]
		{Character.isJavaIdentifierStart(Character.toCodePoint((char)_input.LA(-2), (char)_input.LA(-1)))}?
	;

fragment
JavaLetterOrDigit
	:	[a-zA-Z0-9$_] // these are the "java letters or digits" below 0xFF
	|	// covers all characters above 0xFF which are not a surrogate
		~[\u0000-\u00FF\uD800-\uDBFF]
		{Character.isJavaIdentifierPart(_input.LA(-1))}?
	|	// covers UTF-16 surrogate pairs encodings for U+10000 to U+10FFFF
		[\uD800-\uDBFF] [\uDC00-\uDFFF]
		{Character.isJavaIdentifierPart(Character.toCodePoint((char)_input.LA(-2), (char)_input.LA(-1)))}?
	;

classRef : '$K' [0-9]+ '?' [0-9]+ ;
finalFieldRef : '$D' [0-9]+ '?' [0-9]+ ;
finalVarRef : '$X' [0-9]+ '?' [0-9]+ ;
commonFieldRef : '$F' [0-9]+ '?' [0-9]+ ;
commonVarRef : '$C' [0-9]+ '?' [0-9]+ ;

codeHole : AT 'HO' ;
preExist : AT 'PE' ;

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

fragment
DecimalIntegerLiteral
	:	DecimalNumeral IntegerTypeSuffix?
	;

fragment
HexIntegerLiteral
	:	HexNumeral IntegerTypeSuffix?
	;

fragment
OctalIntegerLiteral
	:	OctalNumeral IntegerTypeSuffix?
	;

fragment
BinaryIntegerLiteral
	:	BinaryNumeral IntegerTypeSuffix?
	;

fragment
IntegerTypeSuffix
	:	[lL]
	;

fragment
DecimalNumeral
	:	'0'
	|	NonZeroDigit (Digits? | Underscores Digits)
	;

fragment
Digits
	:	Digit (DigitsAndUnderscores? Digit)?
	;

fragment
Digit
	:	'0'
	|	NonZeroDigit
	;

fragment
NonZeroDigit
	:	[1-9]
	;

fragment
DigitsAndUnderscores
	:	DigitOrUnderscore+
	;

fragment
DigitOrUnderscore
	:	Digit
	|	'_'
	;

fragment
Underscores
	:	'_'+
	;

fragment
HexNumeral
	:	'0' [xX] HexDigits
	;

fragment
HexDigits
	:	HexDigit (HexDigitsAndUnderscores? HexDigit)?
	;

fragment
HexDigit
	:	[0-9a-fA-F]
	;

fragment
HexDigitsAndUnderscores
	:	HexDigitOrUnderscore+
	;

fragment
HexDigitOrUnderscore
	:	HexDigit
	|	'_'
	;

fragment
OctalNumeral
	:	'0' Underscores? OctalDigits
	;

fragment
OctalDigits
	:	OctalDigit (OctalDigitsAndUnderscores? OctalDigit)?
	;

fragment
OctalDigit
	:	[0-7]
	;

fragment
OctalDigitsAndUnderscores
	:	OctalDigitOrUnderscore+
	;

fragment
OctalDigitOrUnderscore
	:	OctalDigit
	|	'_'
	;

fragment
BinaryNumeral
	:	'0' [bB] BinaryDigits
	;

fragment
BinaryDigits
	:	BinaryDigit (BinaryDigitsAndUnderscores? BinaryDigit)?
	;

fragment
BinaryDigit
	:	[01]
	;

fragment
BinaryDigitsAndUnderscores
	:	BinaryDigitOrUnderscore+
	;

fragment
BinaryDigitOrUnderscore
	:	BinaryDigit
	|	'_'
	;

//  Floating-Point Literals

floatingPointLiteral
	:	DecimalFloatingPointLiteral
	|	HexadecimalFloatingPointLiteral
	;

fragment
DecimalFloatingPointLiteral
	:	Digits '.' Digits? ExponentPart? FloatTypeSuffix?
	|	'.' Digits ExponentPart? FloatTypeSuffix?
	|	Digits ExponentPart FloatTypeSuffix?
	|	Digits FloatTypeSuffix
	;

fragment
ExponentPart
	:	ExponentIndicator SignedInteger
	;

fragment
ExponentIndicator
	:	[eE]
	;

fragment
SignedInteger
	:	Sign? Digits
	;

fragment
Sign
	:	[+-]
	;

fragment
FloatTypeSuffix
	:	[fFdD]
	;

fragment
HexadecimalFloatingPointLiteral
	:	HexSignificand BinaryExponent FloatTypeSuffix?
	;

fragment
HexSignificand
	:	HexNumeral '.'?
	|	'0' [xX] HexDigits? '.' HexDigits
	;

fragment
BinaryExponent
	:	BinaryExponentIndicator SignedInteger
	;

fragment
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

fragment
SingleCharacter
	:	~['\\]
	;

// String Literals

// Escape Sequences for Character Literals

fragment
EscapeSequence
	:	'\\' [btnfr"'\\]
	|	OctalEscape
    |   UnicodeEscape // This is not in the spec but prevents having to preprocess the input
	;

fragment
OctalEscape
	:	'\\' OctalDigit
	|	'\\' OctalDigit OctalDigit
	|	'\\' ZeroToThree OctalDigit OctalDigit
	;

fragment
ZeroToThree
	:	[0-3]
	;

fragment
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