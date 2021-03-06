grammar Java8;

statement
	:	rawStatement
	|	methodArgumentEndStatement
	|	methodPreRerferedExpressionEndStatement
	|	commonOverStatement
	|	forIniOverStatement
	|	forExpOverStatement
	|	forUpdOverStatement
	|	rawForIniOverStatement
	|	rawForExpOverStatement
	|	rawForUpdOverStatement
	;

methodArgumentEndStatement : rawStatement ';Ps';

methodPreRerferedExpressionEndStatement : rawStatement ';Pr';

commonOverStatement : rawStatement ';';

forIniOverStatement : rawStatement ';FI';

forExpOverStatement : rawStatement ';FE';

forUpdOverStatement : rawStatement ';FU';

rawForIniOverStatement : 'DH@;FI';

rawForExpOverStatement : 'DH@;FE';

rawForUpdOverStatement : 'DH@;FU';

rawStatement
	:	anonymousClassBeginStatement
	|	anonymousClassPlaceHolderStatement
	|	anonymousClassPreStatement
	|	anonymousClassPreOverStatement
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
	|	breakStatement
	|	continueStatement
	|	doWhileStatement
	|	whileStatement
	|	returnStatement
	|	switchStatement
	|	switchCaseStatement
	|	defaultStatement
	|	synchronizedStatement
	|	tryStatement
	|	throwStatement
	|	catchClauseStatement
	|	finallyStatement
	|	ifStatement
	|	thenStatement
	|	elseStatement
	|	initializerStatement
	|	variableDeclarationHolderStatement
	|	enhancedForStatement
	|	partialEndArrayAccessStatement
	|	arrayInitializerStartStatement
	|	arrayInitializerSplitCommaStatement
	|	arrayInitializerEndStatement
	|	condExpBeginStatement
	|	condExpQuestionMarkStatement
	|	condExpColonMarkStatement
//	|	leftBraceStatement
//	|	rightBraceStatement
	|	enterMethodParamStatement
	|	enumConstantDeclarationSplitCommaStatement
	|	forStatement
	|	partialEndStatement
//	|	fullEndStatement
//	|	partialMethodArgumentEndStatement
//	|	partialMethodPreRerferedExpressionEndStatement
	|	expressionStatement
	|	lambdaEndStatement
	;
	
lambdaEndStatement : expressionStatement ';Lb';
	
expressionStatement
	:	assignmentStatement
	|	arrayCreationStatement
	|	lambdaExpressionStatement
	|	literalStatement
	|	castExpressionStatement
	|	methodInvocationStatement
	|	fieldAccessStatement
	|	qualifiedAccessStatement
	|	infixExpressionStatement
	|	instanceofExpressionStatement
	|	methodReferenceStatement
	|	nameStatement
	|	prefixExpressionStatement
	|	postfixExpressionStatement
	|	arrayAccessStatement
	|	leftParentheseStatement
	|	rightParentheseStatement
	;

assignAssignmentStatement : 'A@' referedExpression '=' referedExpression;
mulassignAssignmentStatement : 'A@' referedExpression '*=' referedExpression;
divassignAssignmentStatement : 'A@' referedExpression '/=' referedExpression;
modassignAssignmentStatement : 'A@' referedExpression '%=' referedExpression;
addassignAssignmentStatement : 'A@' referedExpression '+=' referedExpression;
subassignAssignmentStatement : 'A@' referedExpression '-=' referedExpression;
lshiftassignAssignmentStatement : 'A@' referedExpression '<<=' referedExpression;
rshiftassignAssignmentStatement : 'A@' referedExpression '>>=' referedExpression;
urshiftassignAssignmentStatement : 'A@' referedExpression '>>>=' referedExpression;
andassignAssignmentStatement : 'A@' referedExpression '&=' referedExpression;
xorassignAssignmentStatement : 'A@' referedExpression '^=' referedExpression;
orassignAssignmentStatement : 'A@' referedExpression '|=' referedExpression;

assignmentStatement
	:	assignAssignmentStatement
	|	mulassignAssignmentStatement
	|	divassignAssignmentStatement
	|	modassignAssignmentStatement
	|	addassignAssignmentStatement
	|	subassignAssignmentStatement
	|	lshiftassignAssignmentStatement
	|	rshiftassignAssignmentStatement
	|	urshiftassignAssignmentStatement
	|	andassignAssignmentStatement
	|	xorassignAssignmentStatement
	|	orassignAssignmentStatement
	;

positiveLiteralStatement : 'L@+' literal;

negativeLiteralStatement : 'L@-' literal;

normalLiteralStatement : 'L@' literal;

literalStatement
	:	normalLiteralStatement
	|	negativeLiteralStatement
	|	positiveLiteralStatement
	;

castExpressionStatement : 'CE@' '(' type ')' referedExpression;

commonMethodInvocationStatement : 'MI@' identifier '(' argumentList ')';

superConstructionInvocationStatement : 'MI@' 'super' '(' argumentList ')';

typeCreationInvocationStatement : 'MI@' type '(' argumentList ')'; // MI@@K0?0(new)

thisConstructionInvocationStatement : 'MI@' 'this' '(' argumentList ')';

methodInvocationStatement
	:	commonMethodInvocationStatement
	|	superConstructionInvocationStatement
	|	typeCreationInvocationStatement
	|	thisConstructionInvocationStatement
	;

qualifiedAccessStatement : 'Q@' fieldAccess;

fieldAccessStatement : 'FA@' fieldAccess;

chainFieldAccess
	:	identifier '.' fieldAccess
	;

referedFieldAccess : identifier '.' referedExpression;

superFieldAccess
	:	identifier '.' 'super' '.' referedExpression
	|	identifier '.' 'super' '.' type
	|	identifier '.' 'super'
	;
	
thisFieldAccess
	:	'this' '.' referedExpression
	|	'this' '.' type
	|	'this'
	;

fieldAccess
	:	chainFieldAccess
	|	commonFieldRef
	|	referedFieldAccess
	|	superFieldAccess
	|	thisFieldAccess
	;

gtInfixExpressionStatement : 'IxE@' referedExpression '>' referedExpression;
ltInfixExpressionStatement : 'IxE@' referedExpression '<' referedExpression;
equalInfixExpressionStatement : 'IxE@' referedExpression '==' referedExpression;
leInfixExpressionStatement : 'IxE@' referedExpression '<=' referedExpression;
geInfixExpressionStatement : 'IxE@' referedExpression '>=' referedExpression;
notequalInfixExpressionStatement : 'IxE@' referedExpression '!=' referedExpression;
andInfixExpressionStatement : 'IxE@' referedExpression '&&' referedExpression;
orInfixExpressionStatement : 'IxE@' referedExpression '||' referedExpression;
addInfixExpressionStatement : 'IxE@' referedExpression '+' referedExpression;
subInfixExpressionStatement : 'IxE@' referedExpression '-' referedExpression;
mulInfixExpressionStatement : 'IxE@' referedExpression '*' referedExpression;
divInfixExpressionStatement : 'IxE@' referedExpression '/' referedExpression;
bitandInfixExpressionStatement : 'IxE@' referedExpression '&' referedExpression;
bitorInfixExpressionStatement : 'IxE@' referedExpression '|' referedExpression;
caretInfixExpressionStatement : 'IxE@' referedExpression '^' referedExpression;
modInfixExpressionStatement : 'IxE@' referedExpression '%' referedExpression;
lshiftInfixExpressionStatement : 'IxE@' referedExpression '<' '<' referedExpression;
rshiftInfixExpressionStatement : 'IxE@' referedExpression '>' '>' referedExpression;
urshiftInfixExpressionStatement : 'IxE@' referedExpression '>' '>' '>' referedExpression;

infixExpressionStatement
	:	gtInfixExpressionStatement
	|	ltInfixExpressionStatement
	|	equalInfixExpressionStatement
	|	leInfixExpressionStatement
	|	geInfixExpressionStatement
	|	notequalInfixExpressionStatement
	|	andInfixExpressionStatement
	|	orInfixExpressionStatement
	|	addInfixExpressionStatement
	|	subInfixExpressionStatement
	|	mulInfixExpressionStatement
	|	divInfixExpressionStatement
	|	bitandInfixExpressionStatement
	|	bitorInfixExpressionStatement
	|	caretInfixExpressionStatement
	|	modInfixExpressionStatement
	|	lshiftInfixExpressionStatement
	|	rshiftInfixExpressionStatement
	|	urshiftInfixExpressionStatement
	;

instanceofExpressionStatement : 'InE@' referedExpression 'instanceof' type;

commonMethodReferenceExpression : identifier '::' referedExpression;

commonNewMethodReferenceExpression : 'new' '::' referedExpression;

superMethodReferenceExpression : identifier '::' 'super' ('.' referedExpression)?;

methodReferenceExpression
	:	commonMethodReferenceExpression
	|	commonNewMethodReferenceExpression
	|	superMethodReferenceExpression
	;

methodReferenceStatement : 'MR@' methodReferenceExpression;

commonNameStatement : 'N@' identifier;

varRefNameStatement : 'N@' commonVarRef;

fieldRefNameStatement : 'N@' commonFieldRef;

nameStatement
	:	commonNameStatement
	|	varRefNameStatement
	|	fieldRefNameStatement
	;

bangPrefixExpressionStatement : 'PeE@' '!' referedExpression;
tildePrefixExpressionStatement : 'PeE@' '~' referedExpression;
incPrefixExpressionStatement : 'PeE@' '++' referedExpression;
decPrefixExpressionStatement : 'PeE@' '--' referedExpression;
addPrefixExpressionStatement : 'PeE@' addPrefixExpression;
subPrefixExpressionStatement : 'PeE@' subPrefixExpression;

addPrefixExpression : '+' referedExpression;
subPrefixExpression : '-' referedExpression;

prefixExpressionStatement
	:	bangPrefixExpressionStatement
	|	tildePrefixExpressionStatement
	|	incPrefixExpressionStatement
	|	decPrefixExpressionStatement
	|	addPrefixExpressionStatement
	|	subPrefixExpressionStatement
	;

incPostfixExpressionStatement : 'PtE@' referedExpression '++';
decPostfixExpressionStatement : 'PtE@' referedExpression '--';

postfixExpressionStatement
	:	incPostfixExpressionStatement
	|	decPostfixExpressionStatement
	;

arrayAccessStatement : '[@' referedExpression referedExpression endOfArrayDeclarationIndexExpression?;

referedExpression
	:	identifier
	|	fieldAccess
	|	literal
	|	codeHole
	|	preExist
	|	finalFieldRef
	|	finalVarRef
//	|	commonFieldRef // move to fieldAccess.
	|	commonVarRef
	|	addPrefixExpression
	|	subPrefixExpression
	|	methodReferenceExpression
	;

identifier
	:	IdentifierX
	;
	
anonymousClassBeginStatement : 'AB@AnonymousBegin';

anonymousClassPlaceHolderStatement : 'DH@AnonymousDeclaration';

anonymousClassPreStatement : 'HT@' identifier;

anonymousClassPreOverStatement : 'HOT@' identifier;

atInterfaceStatement : 'AT@' identifier;

annotationTypeMemberDeclarationStatement : 'AM@' type identifier '(' ')' ('default' referedExpression)?;

classDeclarationStatement : 'CD@' identifier;

classInnerDeclarationStatement : 'ICD@' identifier;

enumDeclarationStatement : 'ED@' identifier;

methodDeclarationStatement : 'MD@' type '(' argTypeList? ')' identifier;

constructionDeclarationStatement : 'MD@' 'CR@' '(' argTypeList? ')' identifier;

enumConstantDeclarationStatement : 'EMD@' identifier '(' argumentList ')';

labeledStatement : 'LD@' identifier;

variableDeclarationStatement : 'VD@' type;

lambdaExpressionStatement
	:	'LE@' '(' argTypeList? ')' '->' '{}'
	|	'LE@' '(' argTypeList? ')' '->' referedExpression
	;

breakStatement : 'B@' 'break' (identifier)?;

continueStatement : 'C@' 'continue' (identifier)?;

doWhileStatement : 'DW@' 'while' referedExpression;

whileStatement : 'WS@' 'while' referedExpression;

returnStatement : 'RT@' 'return' (referedExpression)?;

switchStatement : 'SW@' 'switch' referedExpression;

switchCaseStatement : 'CS@' 'case' referedExpression;

defaultStatement : 'DF@' 'default';

synchronizedStatement : 'SC@' 'synchronized' referedExpression;

tryStatement : 'DH@try';

throwStatement : 'TS@' 'throw' referedExpression;

catchClauseStatement : 'CT@' 'catch' type;

finallyStatement : 'DH@finally';

ifStatement : 'IF@' 'if' referedExpression;

thenStatement : 'DH@then';

elseStatement : 'DH@else';

arrayCreationStatement : 'AC@' type '(' 'new' ')';

initializerStatement : 'IB@' 'InitialBlock';

variableDeclarationHolderStatement : 'VH@' ('=' referedExpression)?;

enhancedForStatement : 'EF@' 'for(' type ':' referedExpression ')';

partialEndArrayAccessStatement : expressionStatement endOfArrayDeclarationIndexExpression;

leftParentheseStatement : 'DH@' ('(')+;

rightParentheseStatement : 'DH@' (')')+;

// leftBraceStatement : 'DH@' ('{')+;

// rightBraceStatement : 'DH@' ('}')+;

enterMethodParamStatement : 'DH@' ('@Em')+;

arrayInitializerStartStatement : 'DH@A{';

arrayInitializerSplitCommaStatement : 'DH@A,';

arrayInitializerEndStatement : 'DH@A}';

enumConstantDeclarationSplitCommaStatement : 'DH@E,';

forStatement : 'DH@for';

// forIniOverStatement : 'DH@forIniOver';

// forExpOverStatement : 'DH@forExpOver';

// forUpdOverStatement : 'DH@forUpdOver';

condExpBeginStatement : 'DH@CondExpBegin';

condExpQuestionMarkStatement : 'DH@CondExpQM';

condExpColonMarkStatement : 'DH@CondExpCM';

partialEndStatement : 'DH@,';

// fullEndStatement : 'DH@;';

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

argType : type;

lastArgType : type '...';

argTypeList
	:	argType (',' argType)* (',' lastArgType)?
	|	lastArgType;

literal
	:	numberLiteral
	|	booleanLiteral
	|	characterLiteral
	|	stringLiteral
	|	nullLiteral
	|	typeLiteral
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
	:   'true'
    |   'false'
	;
	
characterLiteral
	:	CharacterLiteralX
	;
	
stringLiteral
	:	StringLiteralX
	;

nullLiteral
	:	'null'
	;
	
typeLiteral
	:	'class' '.' type
	;
	
// varArgType : type '...';

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
	|	voidType
	;
	
voidType : 'void';
	
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

codeHole : '@HO';
preExist : '@PE';

endOfArrayDeclarationIndexExpression : (']')+;

AT : '@' ;
ELLIPSIS : '...';

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
	
COMMA : ',';
DOT : '.';

COLONCOLON : '::';

WS  :  [ #\t\r\n\u000C]+ -> skip ;
