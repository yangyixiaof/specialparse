grammar Java8;

statement
	:	anonymousClassBeginStatement
	|	anonymousClassPlaceHolderStatement
	|	anonymousClassPreStatement
	|	atInterfaceStatement
	|	annotationTypeMemberDeclarationStatement
	|	classDeclarationStatement
	|	classInnerDeclarationStatement
	|	enumDeclarationStatement
	|	methodDeclarationStatement
	|	enumConstantDeclarationStatement
	|	labeledStatement
	|	variableDeclarationStatement
	|	lambdaExpressionStatement
	|	breakStatement
	|	continueStatement
	|	doWhileStatement
	|	whileStatement
	|	returnStatement
	|	switchStatement
	|	switchCaseStatement
	|	defaultStatement
	|	synchronizedStatement
	|	throwStatement
	|	catchClauseStatement
	|	ifStatement
	|	arrayCreationStatement
	|	initializerStatement
	|	variableDeclarationHolderStatement
	|	enhancedForStatement
	|	partialEndArrayAccessStatement
	|	leftParentheseStatement
	|	rightParentheseStatement
	|	leftBraceStatement
	|	rightBraceStatement
	|	enterMethodParamStatement
	|	arrayInitializerStartStatement
	|	arrayInitializerSplitCommaStatement
	|	arrayInitializerEndStatement
	|	forStatement
	|	forIniOverStatement
	|	forExpOverStatement
	|	forUpdOverStatement
	|	condExpBeginStatement
	|	condExpQuestionMarkStatement
	|	condExpColonMarkStatement
	|	partialEndStatement
	|	fullEndStatement
	|	expressionStatement
	;
	
expressionStatement
	:	assignmentStatement
	|	literalStatement
	|	castExpressionStatement
	|	methodInvocationStatement
	|	fieldAccessStatement
	|	infixExpressionStatement
	|	instanceofExpressionStatement
	|	methodReferenceStatement
	|	nameStatement
	|	prefixExpressionStatement
	|	postfixExpressionStatement
	|	arrayAccessStatement
	;

assignmentStatement : 'A@' referedExpression assignmentOperator referedExpression;

literalStatement : 'L@' literal;

castExpressionStatement : 'CE@' '(' type ')' referedExpression;

methodInvocationStatement : 'MI@' identifier '(' argumentList ')';

fieldAccessStatement : 'FA@' fieldAccess;

fieldAccess : identifier '.' referedExpression;

infixExpressionStatement : 'IxE@' referedExpression binaryOperator referedExpression;

instanceofExpressionStatement : 'InE@' referedExpression 'instanceof' type;

methodReferenceExpression : referedExpression;

methodReferenceStatement : 'MR@' identifier '::' methodReferenceExpression;

nameStatement : 'N@' identifier;

prefixExpressionStatement : 'PeE@' unaryOperator referedExpression;

postfixExpressionStatement : 'PtE@' referedExpression unaryOperator;

arrayAccessStatement : '[@' referedExpression '#' referedExpression endOfArrayDeclarationIndexExpression?;

referedExpression
	:	identifier
	|	fieldAccess
	|	literal
	|	firstArg
	;
	
anonymousClassBeginStatement : 'AB@' identifier;

anonymousClassPlaceHolderStatement : 'DH@AnonymousDeclaration';

anonymousClassPreStatement : 'HT@' identifier;

atInterfaceStatement : 'AT@' identifier;

annotationTypeMemberDeclarationStatement : 'AM@' type '()' ('default' referedExpression)?;

classDeclarationStatement : 'CD@' identifier;

classInnerDeclarationStatement : 'ICD@' identifier;

enumDeclarationStatement : 'ED@' identifier;

methodDeclarationStatement : 'MD@' '(' typeList? ')' identifier;

enumConstantDeclarationStatement : 'EMD@' identifier '(' argumentList ')';

labeledStatement : 'LD@' identifier;

variableDeclarationStatement : 'VD@' type;

lambdaExpressionStatement : 'LE@' '(' typeList? ')' '->' '{}';

breakStatement : 'B@' 'break' ('#' identifier)?;

continueStatement : 'C@' 'continue' ('#' identifier)?;

doWhileStatement : 'DW@' 'while' '#' referedExpression;

whileStatement : 'WS@' 'while' '#' referedExpression;

returnStatement : 'RT@' 'return' ('#' referedExpression)?;

switchStatement : 'SW@' 'switch' '#' referedExpression;

switchCaseStatement : 'CS@' 'case' '#' referedExpression;

defaultStatement : 'DF@' 'default';

synchronizedStatement : 'SC@' 'synchronized' '#' referedExpression;

throwStatement : 'TS@' 'throw' '#' referedExpression;

catchClauseStatement : 'CT@' 'catch' '#' type;

ifStatement : 'IF@' 'if' '#' referedExpression;

arrayCreationStatement : 'AC@' type '(new)';

initializerStatement : 'IB@' 'InitialBlock';

variableDeclarationHolderStatement : 'VH@' ('=' referedExpression)?;

enhancedForStatement : 'EF@' 'for(' type ':' referedExpression ')';

partialEndArrayAccessStatement : expressionStatement endOfArrayDeclarationIndexExpression;

leftParentheseStatement : 'DH@' ('(')+;

rightParentheseStatement : 'DH@' (')')+;
	
leftBraceStatement : 'DH@' ('{')+;

rightBraceStatement : 'DH@' ('}')+;

enterMethodParamStatement : 'DH@' ('Em')+;

arrayInitializerStartStatement : 'DH@' 'A{';

arrayInitializerSplitCommaStatement : 'DH@' 'A,';

arrayInitializerEndStatement : 'DH@' 'A}';

forStatement : 'DH@' 'for';

forIniOverStatement : 'DH@' 'forIniOver';

forExpOverStatement : 'DH@' 'forExpOver';

forUpdOverStatement : 'DH@' 'forUpdOver';

condExpBeginStatement : 'DH@' 'CondExpBegin';

condExpQuestionMarkStatement : 'DH@' 'CondExpQM';

condExpColonMarkStatement : 'DH@' 'CondExpCM';

partialEndStatement : 'DH@,';

fullEndStatement : 'DH@;';

selfClassMemberInvoke : 'this' ('.' referedExpression)?;

superClassMemberInvoke : 'super' ('.' referedExpression)?;

newClassInvoke : 'new' ('.' referedExpression)?;

firstArg : 
	| selfClassMemberInvoke
	| superClassMemberInvoke
	| newClassInvoke
	;

argumentList : firstArg (',' referedExpression)*;

typeList : type (',' type)* ;

literal
	:	numberLiteral
	|	booleanLiteral
	|	characterLiteral
	|	stringLiteral
	|	nullLiteral
	;

numberLiteral
	:	integerLiteral
	|	floatingPointLiteral
	;

stringLiteral
	:	'@STR'
	;

type
	:	virtualInferredType
	|	primitiveType
	|	parameterizedType
	|	simpleType
	|	classOrInterfaceType
	|	arrayType
	|	intersectionType
	|	unionType
	|	wildCardType
	|	classRef
	;
	
virtualInferredType
	:	'@IT'
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

simpleType
	:	identifier
	;

parameterizedType
	:	identifier '<' typeList '>'
	;
	
bothType
	:	simpleType | parameterizedType
	;

classOrInterfaceType
	:	(bothType) ('.' bothType)*
	;

arrayType
	:	primitiveType dims
	|	classOrInterfaceType dims
	;

dims
	:	'[' ']' ('[' ']')*
	;

wildCardType
	:	'?' wildcardBounds?
	;
	
extendBound : 'extends' type;
	
superBound : 'super' type;

wildcardBounds
	:	extendBound
	|	superBound
	;
	
intersectionFirstType
	:	classOrInterfaceType | primitiveType | arrayType | classRef;
	
intersectionSecondType
	:	classOrInterfaceType | primitiveType | arrayType | classRef | unionType;
	
intersectionType
	:	(intersectionFirstType) ('&' (intersectionSecondType))+
	;
	
unionFirstType
	:	classOrInterfaceType | primitiveType | arrayType | classRef;
	
unionSecondType
	:	classOrInterfaceType | primitiveType | arrayType | classRef | intersectionType;
	
unionType
	:	(unionFirstType) ('|' (unionSecondType))+
	;

identifier
	:	idRawLetter
	|	finalFieldRef
	|	finalVarRef
	|	commonFieldRef
	|	commonVarRef
	|	codeHole
	|	preExist
	;
	
idRawLetter : JavaLetter JavaLetterOrDigit*;

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

classRef : '$K' offset '?' offset;
finalFieldRef : '$D' offset '?' offset;
finalVarRef : '$X' offset '?' offset;
commonFieldRef : '$F' offset '?' offset;
commonVarRef : '$C' offset '?' offset;

offset : OffsetDesc;

OffsetDesc : [0-9]+;

codeHole : '@HO';
preExist : '@PE';

endOfArrayDeclarationIndexExpression : '@]';
endOfArrayInitializerElementExpression : '@I]';

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
