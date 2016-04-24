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

assignmentStatement : 'A@' referedExpression AssignmentOperator referedExpression;

literalStatement : 'L@' literal;

castExpressionStatement : 'CE@' '(' type ')' referedExpression;

methodInvocationStatement : 'MI@' identifier '(' argumentList ')';

fieldAccessStatement : 'FA@' fieldAccess;

fieldAccess : identifier '.' referedExpression;

superFieldAccess
	:	identifier '.' 'super' '.' referedExpression
	|	identifier '.' 'super' '.' type
	|	identifier '.' 'super'
	;

classFieldAccess : 'class' '.' type;

infixExpressionStatement : 'IxE@' referedExpression BinaryOperator referedExpression;

instanceofExpressionStatement : 'InE@' referedExpression 'instanceof' type;

methodReferenceStatement : 'MR@' identifier '::' referedExpression;

nameStatement : 'N@' identifier;

prefixExpressionStatement : 'PeE@' PrefixUnaryOperator referedExpression;

postfixExpressionStatement : 'PtE@' referedExpression PostfixUnaryOperator;

arrayAccessStatement : '[@' referedExpression referedExpression endOfArrayDeclarationIndexExpression?;

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
	|	thisExpression
	|	classFieldAccess
	|	superFieldAccess
	;

identifier
	:	IdentifierX
	;
	
anonymousClassBeginStatement : 'AB@AnonymousBegin';

anonymousClassPlaceHolderStatement : 'DH@AnonymousDeclaration';

anonymousClassPreStatement : 'HT@' identifier;

atInterfaceStatement : 'AT@' identifier;

annotationTypeMemberDeclarationStatement : 'AM@' type identifier '()' ('default' referedExpression)?;

classDeclarationStatement : 'CD@' identifier;

classInnerDeclarationStatement : 'ICD@' identifier;

enumDeclarationStatement : 'ED@' identifier;

methodDeclarationStatement : 'MD@' type '(' argTypeList? ')' identifier;

constructionDeclarationStatement : 'MD@' 'CR@' '(' argTypeList? ')' identifier;

enumConstantDeclarationStatement : 'EMD@' identifier '(' argumentList ')';

labeledStatement : 'LD@' identifier;

variableDeclarationStatement : 'VD@' type;

lambdaExpressionStatement : 'LE@' '(' argTypeList? ')' '->' '{}';

breakStatement : 'B@' 'break' (identifier)?;

continueStatement : 'C@' 'continue' (identifier)?;

doWhileStatement : 'DW@' 'while' referedExpression;

whileStatement : 'WS@' 'while' referedExpression;

returnStatement : 'RT@' 'return' (referedExpression)?;

switchStatement : 'SW@' 'switch' referedExpression;

switchCaseStatement : 'CS@' 'case' referedExpression;

defaultStatement : 'DF@' 'default';

synchronizedStatement : 'SC@' 'synchronized' referedExpression;

throwStatement : 'TS@' 'throw' referedExpression;

catchClauseStatement : 'CT@' 'catch' type;

ifStatement : 'IF@' 'if' referedExpression;

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
	:	referedExpression
	|	type
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
	:	referedExpression
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
	:	IntegerLiteralX
	;
	
floatingPointLiteral
	:	FloatingPointLiteralX
	;
	
booleanLiteral
	:	BooleanLiteralX
	;
	
characterLiteral
	:	CharacterLiteralX
	;
	
stringLiteral
	:	StringLiteralX
	;

nullLiteral
	:	NullLiteralX
	;

type
	:	virtualInferredType
	|	primitiveType
//	|	parameterizedType
//	|	simpleType
	|	classOrInterfaceType
	|	arrayType
	|	intersectionType
	|	unionType
//	|	wildCardType
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
	
extendBound : 'extends' type;
	
superBound : 'super' type;

wildcardBounds
	:	extendBound
	|	superBound
	;
	

wildCardType
	:	'?' wildcardBounds?
	;
	
typeArgument
	:	type
    |   wildCardType
	;
	
typeArguments
	:	'<' typeArgument (',' typeArgument)* '>'
	;

parameterizedType
	:	identifier typeArguments
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

IdentifierX : JavaLetter JavaLetterOrDigit*;

fragment JavaLetter
	:	[a-zA-Z$_] // these are the "java letters" below 0xFF
	|	// covers all characters above 0xFF which are not a surrogate
		~[\u0000-\u00FF\uD800-\uDBFF]
		{Character.isJavaIdentifierStart(_input.LA(-1))}?
	|	// covers UTF-16 surrogate pairs encodings for U+10000 to U+10FFFF
		[\uD800-\uDBFF] [\uDC00-\uDFFF]
		{Character.isJavaIdentifierStart(Character.toCodePoint((char)_input.LA(-2), (char)_input.LA(-1)))}?
	;

fragment JavaLetterOrDigit
	:	[a-zA-Z0-9$_] // these are the "java letters or digits" below 0xFF
	|	// covers all characters above 0xFF which are not a surrogate
		~[\u0000-\u00FF\uD800-\uDBFF]
		{Character.isJavaIdentifierPart(_input.LA(-1))}?
	|	// covers UTF-16 surrogate pairs encodings for U+10000 to U+10FFFF
		[\uD800-\uDBFF] [\uDC00-\uDFFF]
		{Character.isJavaIdentifierPart(Character.toCodePoint((char)_input.LA(-2), (char)_input.LA(-1)))}?
	;

classRef : '@K' integerLiteral '?' integerLiteral;
finalFieldRef : '@D' integerLiteral '?' integerLiteral;
finalVarRef : '@X' integerLiteral '?' integerLiteral;
commonFieldRef : '@F' integerLiteral '?' integerLiteral;
commonVarRef : '@C' integerLiteral '?' integerLiteral;

thisExpression
	:	'this' '.' referedExpression
	|	'this' '.' type
	|	'this'
	;

codeHole : '@HO';
preExist : '@PE';

endOfArrayDeclarationIndexExpression : ('@]')+;
endOfArrayInitializerElementExpression : '@I]';

PrefixUnaryOperator
	:	BANG
	|	TILDE
	|	INC
	|	DEC
	|	ADD
	|	SUB
	;
	
PostfixUnaryOperator
	:	INC
	|	DEC
	;

BinaryOperator
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

AssignmentOperator
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

AT : '@' ;

IntegerLiteralX
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

FloatingPointLiteralX
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

BooleanLiteralX
    :   'true'
    |   'false'
    ;

// §3.10.4 Character Literals

CharacterLiteralX
    :   '\'' SingleCharacter '\''
    |   '\'' EscapeSequence '\''
    |	'\'@w\''
    ;

fragment
SingleCharacter
    :   ~['\\]
    ;
    
// §3.10.5 String Literals
StringLiteralX
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

NullLiteralX
	:	'null'
	;
	
COMMA : ',';
DOT : '.';

fragment GT : '>';
fragment LT : '<';
fragment BANG : '!';
fragment TILDE : '~';
fragment QUESTION : '?';
fragment COLON : ':';
fragment EQUAL : '==';
fragment LE : '<=';
fragment GE : '>=';
fragment NOTEQUAL : '!=';
fragment AND : '&&';
fragment OR : '||';
fragment INC : '++';
fragment DEC : '--';
fragment ADD : '+';
fragment SUB : '-';
fragment MUL : '*';
fragment DIV : '/';
fragment BITAND : '&';
fragment BITOR : '|';
fragment CARET : '^';
fragment MOD : '%';
fragment LSHIFT : '<<';
fragment RSHIFT : '>>';
fragment URSHIFT : '>>>';
COLONCOLON : '::';

fragment ASSIGN : '=';
fragment ADD_ASSIGN : '+=';
fragment SUB_ASSIGN : '-=';
fragment MUL_ASSIGN : '*=';
fragment DIV_ASSIGN : '/=';
fragment AND_ASSIGN : '&=';
fragment OR_ASSIGN : '|=';
fragment XOR_ASSIGN : '^=';
fragment MOD_ASSIGN : '%=';
fragment LSHIFT_ASSIGN : '<<=';
fragment RSHIFT_ASSIGN : '>>=';
fragment URSHIFT_ASSIGN : '>>>=';

WS  :  [ #\t\r\n\u000C]+ -> skip ;
