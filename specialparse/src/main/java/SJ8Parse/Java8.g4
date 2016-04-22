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
	|	constructionDeclarationStatement
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
	|	partialMethodArgumentEndStatement
	|	partialMethodPreRerferedExpressionEndStatement
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

methodReferenceStatement : 'MR@' identifier '::' referedExpression;

nameStatement : 'N@' identifier;

prefixExpressionStatement : 'PeE@' prefixUnaryOperator referedExpression;

postfixExpressionStatement : 'PtE@' referedExpression postfixUnaryOperator;

arrayAccessStatement : '[@' referedExpression '#' referedExpression endOfArrayDeclarationIndexExpression?;

referedExpression
	:	identifier
	|	fieldAccess
	|	literal
	|	codeHole
	|	preExist
	|	finalFieldRef
	|	finalVarRef
	|	commonFieldRef
	|	commonVarRef
	;
	
anonymousClassBeginStatement : 'AB@AnonymousBegin';

anonymousClassPlaceHolderStatement : 'DH@AnonymousDeclaration';

anonymousClassPreStatement : 'HT@' identifier;

atInterfaceStatement : 'AT@' identifier;

annotationTypeMemberDeclarationStatement : 'AM@' type '()' ('default' referedExpression)?;

classDeclarationStatement : 'CD@' identifier;

classInnerDeclarationStatement : 'ICD@' identifier;

enumDeclarationStatement : 'ED@' identifier;

methodDeclarationStatement : 'MD@' type '(' argTypeList? ')' identifier;

constructionDeclarationStatement : 'MD@' 'CR@' '(' argTypeList? ')' identifier;

enumConstantDeclarationStatement : 'EMD@' identifier '(' argumentList ')';

labeledStatement : 'LD@' identifier;

variableDeclarationStatement : 'VD@' type;

lambdaExpressionStatement : 'LE@' '(' argTypeList? ')' '->' '{}';

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

enumConstantDeclarationSplitCommaStatement : 'DH@' 'E,';

forStatement : 'DH@' 'for';

forIniOverStatement : 'DH@' 'forIniOver';

forExpOverStatement : 'DH@' 'forExpOver';

forUpdOverStatement : 'DH@' 'forUpdOver';

condExpBeginStatement : 'DH@' 'CondExpBegin';

condExpQuestionMarkStatement : 'DH@' 'CondExpQM';

condExpColonMarkStatement : 'DH@' 'CondExpCM';

partialEndStatement : 'DH@,';

fullEndStatement : 'DH@;';

partialMethodArgumentEndStatement : 'DH@Ps';

partialMethodPreRerferedExpressionEndStatement : 'DH@Pr';

firstArgPreExist : '@PE';
	
firstArgReferedExpression
	:	identifier
	|	fieldAccess
	|	literal
	|	codeHole
	|	firstArgPreExist
	;
	
commonClassMemberInvoke : firstArgReferedExpression;

selfClassMemberInvoke : 'this' ('.' firstArgReferedExpression)?;

superClassMemberInvoke : 'super' ('.' firstArgReferedExpression)?;

newClassInvoke : 'new' ('.' firstArgReferedExpression)?;

firstArg : 
	|	selfClassMemberInvoke
	|	superClassMemberInvoke
	|	newClassInvoke
	|	commonClassMemberInvoke
	;

methodArgPreExist : '@PE';
	
methodArgReferedExpression
	:	identifier
	|	fieldAccess
	|	literal
	|	codeHole
	|	methodArgPreExist
	;

argumentList : firstArg (',' methodArgReferedExpression)*;

typeList : type (',' type)*;

argType : type;

argTypeList : argType (',' argType)*;

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
	
integerLiteral
	:	IntegerLiteral
	;
	
floatingPointLiteral
	:	FloatingPointLiteral
	;
	
booleanLiteral
	:	BooleanLiteral
	;
	
characterLiteral
	:	CharacterLiteral
	;
	
stringLiteral
	:	StringLiteral
	;

nullLiteral
	:	NullLiteral
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
	:	identifier ('.' identifier)*
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

identifier : JavaLetter JavaLetterOrDigit*;

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

classRef : '@K' IntegerLiteral '?' IntegerLiteral;
finalFieldRef : '@D' IntegerLiteral '?' IntegerLiteral;
finalVarRef : '@X' IntegerLiteral '?' IntegerLiteral;
commonFieldRef : '@F' IntegerLiteral '?' IntegerLiteral;
commonVarRef : '@C' IntegerLiteral '?' IntegerLiteral;

codeHole : '@HO';
preExist : '@PE';

endOfArrayDeclarationIndexExpression : ('@]')+;
endOfArrayInitializerElementExpression : '@I]';

AT : '@' ;

WS  :  [ #]+ -> skip ;

IntegerLiteral
	:	DecimalIntegerLiteral
	|	HexIntegerLiteral
	|	OctalIntegerLiteral
	|	BinaryIntegerLiteral
	;

fragment
DecimalIntegerLiteral
    :   DecimalNumeral IntegerTypeSuffix?
    ;

fragment
HexIntegerLiteral
    :   HexNumeral IntegerTypeSuffix?
    ;

fragment
OctalIntegerLiteral
    :   OctalNumeral IntegerTypeSuffix?
    ;

fragment
BinaryIntegerLiteral
    :   BinaryNumeral IntegerTypeSuffix?
    ;

fragment
IntegerTypeSuffix
    :   [lL]
    ;

fragment
DecimalNumeral
    :   '0'
    |   NonZeroDigit (Digits? | Underscores Digits)
    ;

fragment
Digits
    :   Digit (DigitOrUnderscore* Digit)?
    ;

fragment
Digit
    :   '0'
    |   NonZeroDigit
    ;

fragment
NonZeroDigit
    :   [1-9]
    ;

fragment
DigitOrUnderscore
    :   Digit
    |   '_'
    ;

fragment
Underscores
    :   '_'+
    ;

fragment
HexNumeral
    :   '0' [xX] HexDigits
    ;

fragment
HexDigits
    :   HexDigit (HexDigitOrUnderscore* HexDigit)?
    ;

fragment
HexDigit
    :   [0-9a-fA-F]
    ;

fragment
HexDigitOrUnderscore
    :   HexDigit
    |   '_'
    ;

fragment
OctalNumeral
    :   '0' Underscores? OctalDigits
    ;

fragment
OctalDigits
    :   OctalDigit (OctalDigitOrUnderscore* OctalDigit)?
    ;

fragment
OctalDigit
    :   [0-7]
    ;

fragment
OctalDigitOrUnderscore
    :   OctalDigit
    |   '_'
    ;

fragment
BinaryNumeral
    :   '0' [bB] BinaryDigits
    ;

fragment
BinaryDigits
    :   BinaryDigit (BinaryDigitOrUnderscore* BinaryDigit)?
    ;

fragment
BinaryDigit
    :   [01]
    ;

fragment
BinaryDigitOrUnderscore
    :   BinaryDigit
    |   '_'
    ;

// §3.10.2 Floating-Point Literals

FloatingPointLiteral
    :   DecimalFloatingPointLiteral
    |   HexadecimalFloatingPointLiteral
    ;

fragment
DecimalFloatingPointLiteral
    :   Digits '.' Digits? ExponentPart? FloatTypeSuffix?
    |   '.' Digits ExponentPart? FloatTypeSuffix?
    |   Digits ExponentPart FloatTypeSuffix?
    |   Digits FloatTypeSuffix
    ;

fragment
ExponentPart
    :   ExponentIndicator SignedInteger
    ;

fragment
ExponentIndicator
    :   [eE]
    ;

fragment
SignedInteger
    :   Sign? Digits
    ;

fragment
Sign
    :   [+-]
    ;

fragment
FloatTypeSuffix
    :   [fFdD]
    ;

fragment
HexadecimalFloatingPointLiteral
    :   HexSignificand BinaryExponent FloatTypeSuffix?
    ;

fragment
HexSignificand
    :   HexNumeral '.'?
    |   '0' [xX] HexDigits? '.' HexDigits
    ;

fragment
BinaryExponent
    :   BinaryExponentIndicator SignedInteger
    ;

fragment
BinaryExponentIndicator
    :   [pP]
    ;

// §3.10.3 Boolean Literals

BooleanLiteral
    :   'true'
    |   'false'
    ;

// §3.10.4 Character Literals

CharacterLiteral
    :   '\'' SingleCharacter '\''
    |   '\'' EscapeSequence '\''
    ;

fragment
SingleCharacter
    :   ~['\\]
    ;
// §3.10.5 String Literals
StringLiteral
    :   '"' StringCharacters? '"'
    |	'@STR'
    ;
fragment
StringCharacters
    :   StringCharacter+
    ;
fragment
StringCharacter
    :   ~["\\]
    |   EscapeSequence
    ;
// §3.10.6 Escape Sequences for Character and String Literals
fragment
EscapeSequence
    :   '\\' [btnfr"'\\]
    |   OctalEscape
    |   UnicodeEscape
    ;

fragment
OctalEscape
    :   '\\' OctalDigit
    |   '\\' OctalDigit OctalDigit
    |   '\\' ZeroToThree OctalDigit OctalDigit
    ;

fragment
UnicodeEscape
    :   '\\' 'u' HexDigit HexDigit HexDigit HexDigit
    ;

fragment
ZeroToThree
    :   [0-3]
    ;

NullLiteral
	:	'null'
	;
	
prefixUnaryOperator
	:	BANG
	|	TILDE
	|	INC
	|	DEC
	|	ADD
	|	SUB
	;
	
postfixUnaryOperator
	:	INC
	|	DEC
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
