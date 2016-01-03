grammar Java8;

AT : '@';
MD : 'MD';
CD : 'CD';

ClassRef : '$K' [0-9]+ '?' [0-9]+ ;
FinalFieldRef : '$D' [0-9]+ '?' [0-9]+ ;
FinalVarRef : '$X' [0-9]+ '?' [0-9]+ ;
CommonFieldRef : '$F' [0-9]+ '?' [0-9]+ ;
CommonVarRef : '$C' [0-9]+ '?' [0-9]+ ;

// for lambda only
NoDeclaredType : AT 'NT' ;
// for hole
CodeHole : AT 'HO' ;

literal
	:	NumberLiteral
	|	BooleanLiteral
	|	CharacterLiteral
	|	StringLiteral
	|	NullLiteral
	;

type
	:	primitiveType
	|	referenceType
	;

primitiveType
	:	numericType
	|	'boolean'
	;

numericType
	:	integralType
	|	floatingPointType
	;

integralType
	:	'byte'
	|	'short'
	|	'int'
	|	'long'
	|	'char'
	;

floatingPointType
	:	'float'
	|	'double'
	;

referenceType
	:	classOrInterfaceType
	|	Identifier
	|	arrayType
	;

classOrInterfaceType
	:	(	classType_lfno_classOrInterfaceType
		|	interfaceType_lfno_classOrInterfaceType
		)
		(	classType_lf_classOrInterfaceType
		|	interfaceType_lf_classOrInterfaceType
		)*
	;

classType
	:	Identifier typeArguments?
	|	classOrInterfaceType '.' Identifier typeArguments?
	;

classType_lf_classOrInterfaceType
	:	'.' Identifier typeArguments?
	;

classType_lfno_classOrInterfaceType
	:	Identifier typeArguments?
	;

interfaceType
	:	classType
	;

interfaceType_lf_classOrInterfaceType
	:	classType_lf_classOrInterfaceType
	;

interfaceType_lfno_classOrInterfaceType
	:	classType_lfno_classOrInterfaceType
	;

arrayType
	:	primitiveType dims
	|	classOrInterfaceType dims
	|	Identifier dims
	;

dims
	:	'[' ']' ('[' ']')*
	;

typeParameter
	:	Identifier typeBound?
	;

typeBound
	:	'extends' Identifier
	|	'extends' classOrInterfaceType additionalBound*
	;

additionalBound
	:	'&' interfaceType
	;

typeArguments
	:	'<' typeArgumentList '>'
	;

typeArgumentList
	:	typeArgument (',' typeArgument)*
	;

typeArgument
	:	referenceType | ClassRef
	|	wildcard
	;

wildcard
	:	'?' wildcardBounds?
	;

wildcardBounds
	:	'extends' referenceType
	|	'super' referenceType
	;

typeName
	:	Identifier
	|	packageOrTypeName '.' Identifier
	;

packageOrTypeName
	:	Identifier
	|	packageOrTypeName '.' Identifier
	;

expressionName
	:	Identifier
	|	ambiguousName '.' Identifier
	;

methodName
	:	Identifier
	;

ambiguousName
	:	Identifier
	|	ambiguousName '.' Identifier
	;

typeDeclaration
	:	Identifier AT CD
	;

typeParameters
	:	'<' typeParameterList '>'
	;

typeParameterList
	:	typeParameter (',' typeParameter)*
	;

variableDeclaratorList
	:	variableDeclarator (',' variableDeclarator)*
	;

variableDeclarator
	:	variableDeclaratorId ('=' variableInitializer)?
	;

variableDeclaratorId
	:	Identifier
	;

variableInitializer
	:	expression
	|	arrayInitializer
	;

unannType
	:	unannPrimitiveType
	|	unannReferenceType
	;

unannPrimitiveType
	:	numericType
	|	'boolean'
	;

unannReferenceType
	:	unannClassOrInterfaceType
	|	unannTypeVariable
	|	unannArrayType
	;

unannClassOrInterfaceType
	:	(	unannClassType_lfno_unannClassOrInterfaceType
		|	unannInterfaceType_lfno_unannClassOrInterfaceType
		)
		(	unannClassType_lf_unannClassOrInterfaceType
		|	unannInterfaceType_lf_unannClassOrInterfaceType
		)*
	;

unannClassType
	:	Identifier typeArguments?
	|	unannClassOrInterfaceType '.' Identifier typeArguments?
	;

unannClassType_lf_unannClassOrInterfaceType
	:	'.' Identifier typeArguments?
	;

unannClassType_lfno_unannClassOrInterfaceType
	:	Identifier typeArguments?
	;

unannInterfaceType
	:	unannClassType
	;

unannInterfaceType_lf_unannClassOrInterfaceType
	:	unannClassType_lf_unannClassOrInterfaceType
	;

unannInterfaceType_lfno_unannClassOrInterfaceType
	:	unannClassType_lfno_unannClassOrInterfaceType
	;

unannTypeVariable
	:	Identifier
	;

unannArrayType
	:	unannPrimitiveType dims
	|	unannClassOrInterfaceType dims
	|	unannTypeVariable dims
	;

methodDeclaration
	:	Identifier '(' formalParameters? ')' AT MD
	;

formalParameters
	:	formalParameter (',' formalParameter)*
	|	receiverParameter (',' formalParameter)*
	;

formalParameter
	:	unannType
	;

receiverParameter
	:	unannType ((Identifier) '.')? 'this'
	;

exceptionTypeList
	:	exceptionType (',' exceptionType)*
	;

exceptionType
	:	classType
	|	Identifier
	;

simpleTypeName
	:	Identifier
	;

explicitConstructorInvocation
	:	typeArguments? 'this' '(' argumentList? ')'
	|	typeArguments? 'super' '(' argumentList? ')'
	|	expressionName '.' typeArguments? 'super' '(' argumentList? ')'
	|	primary '.' typeArguments? 'super' '(' argumentList? ')'
	;

localVariableDeclarationStatement
	:	localVariableDeclaration
	;

localVariableDeclaration
	:	unannType (',' unannType)*
	;

statement
	:	statementWithoutTrailingSubstatement
	|	labeledStatement
	|	ifStatement
	|	ElseStatement
	|	whileStatement
	|	forStatement
	;

statementWithoutTrailingSubstatement
	:	expressionStatement
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
	;

labeledStatement
	:	Identifier 
	;

expressionStatement
	:	statementExpression
	;

statementExpression
	:	assignment
	|	preIncrementExpression
	|	preDecrementExpression
	|	postIncrementExpression
	|	postDecrementExpression
	|	methodInvocation
	|	classInstanceCreationExpression
	;

ifStatement
	:	'if' 
	;

ElseStatement
	:	'else'
	;

assertStatement
	:	'assert' expression
	|	'assert' expression ':' expression
	;

switchStatement
	:	'switch' '(' expression ')'
	;

caseStatement
	:	'case' expression
	|	'case' Identifier
	|	'default'
	;

whileStatement
	:	'while'
	;

doStatement
	:	'do'
	;

forStatement
	:	'for'
	;

breakStatement
	:	'break' Identifier?
	;

continueStatement
	:	'continue' Identifier?
	;

returnStatement
	:	'return' expression?
	;

throwStatement
	:	'throw' expression
	;

synchronizedStatement
	:	'synchronized' '(' expression ')'
	;

tryStatement
	:	'try'
	;

catchClause
	:	'catch' '(' catchFormalParameter ')'
	;

catchFormalParameter
	:	catchType
	;

catchType
	:	unannClassType ('|' classType)*
	;

resource
	:	unannType variableDeclaratorId '=' expression
	;

primary
	:	(	primaryNoNewArray_lfno_primary
		|	arrayCreationExpression
		)
		(	primaryNoNewArray_lf_primary
		)*
	;

primaryNoNewArray
	:	literal
	|	typeName ('[' ']')* '.' 'class'
	|	'void' '.' 'class'
	|	'this'
	|	typeName '.' 'this'
	|	'(' expression ')'
	|	classInstanceCreationExpression
	|	fieldAccess
	|	arrayAccess
	|	methodInvocation
	|	methodReference
	;

primaryNoNewArray_lf_arrayAccess
	:
	;

primaryNoNewArray_lfno_arrayAccess
	:	literal
	|	typeName ('[' ']')* '.' 'class'
	|	'void' '.' 'class'
	|	'this'
	|	typeName '.' 'this'
	|	'(' expression ')'
	|	classInstanceCreationExpression
	|	fieldAccess
	|	methodInvocation
	|	methodReference
	;

primaryNoNewArray_lf_primary
	:	classInstanceCreationExpression_lf_primary
	|	fieldAccess_lf_primary
	|	arrayAccess_lf_primary
	|	methodInvocation_lf_primary
	|	methodReference_lf_primary
	;

primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary
	:
	;

primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary
	:	classInstanceCreationExpression_lf_primary
	|	fieldAccess_lf_primary
	|	methodInvocation_lf_primary
	|	methodReference_lf_primary
	;

primaryNoNewArray_lfno_primary
	:	literal
	|	typeName ('[' ']')* '.' 'class'
	|	unannPrimitiveType ('[' ']')* '.' 'class'
	|	'void' '.' 'class'
	|	'this'
	|	typeName '.' 'this'
	|	'(' expression ')'
	|	classInstanceCreationExpression_lfno_primary
	|	fieldAccess_lfno_primary
	|	arrayAccess_lfno_primary
	|	methodInvocation_lfno_primary
	|	methodReference_lfno_primary
	;

primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary
	:
	;

primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary
	:	literal
	|	typeName ('[' ']')* '.' 'class'
	|	unannPrimitiveType ('[' ']')* '.' 'class'
	|	'void' '.' 'class'
	|	'this'
	|	typeName '.' 'this'
	|	'(' expression ')'
	|	classInstanceCreationExpression_lfno_primary
	|	fieldAccess_lfno_primary
	|	methodInvocation_lfno_primary
	|	methodReference_lfno_primary
	;

classInstanceCreationExpression
	:	'new' typeArguments? Identifier ('.' Identifier)* typeArgumentsOrDiamond? '(' argumentList? ')'
	|	expressionName '.' 'new' typeArguments? Identifier typeArgumentsOrDiamond? '(' argumentList? ')'
	|	primary '.' 'new' typeArguments? Identifier typeArgumentsOrDiamond? '(' argumentList? ')'
	;

classInstanceCreationExpression_lf_primary
	:	'.' 'new' typeArguments? Identifier typeArgumentsOrDiamond? '(' argumentList? ')'
	;

classInstanceCreationExpression_lfno_primary
	:	'new' typeArguments? Identifier ('.' Identifier)* typeArgumentsOrDiamond? '(' argumentList? ')'
	|	expressionName '.' 'new' typeArguments? Identifier typeArgumentsOrDiamond? '(' argumentList? ')'
	;

typeArgumentsOrDiamond
	:	typeArguments
	|	'<' '>'
	;

fieldAccess
	:	primary '.' Identifier
	|	'super' '.' Identifier
	|	typeName '.' 'super' '.' Identifier
	;

fieldAccess_lf_primary
	:	'.' Identifier
	;

fieldAccess_lfno_primary
	:	'super' '.' Identifier
	|	typeName '.' 'super' '.' Identifier
	;

arrayAccess
	:	(	expressionName '[' expression ']'
		|	primaryNoNewArray_lfno_arrayAccess '[' expression ']'
		)
		(	primaryNoNewArray_lf_arrayAccess '[' expression ']'
		)*
	;

arrayAccess_lf_primary
	:	(	primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary '[' expression ']'
		)
		(	primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary '[' expression ']'
		)*
	;

arrayAccess_lfno_primary
	:	(	expressionName '[' expression ']'
		|	primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary '[' expression ']'
		)
		(	primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary '[' expression ']'
		)*
	;

methodInvocation
	:	methodName '(' argumentList? ')'
	|	typeName '.' typeArguments? Identifier '(' argumentList? ')'
	|	expressionName '.' typeArguments? Identifier '(' argumentList? ')'
	|	primary '.' typeArguments? Identifier '(' argumentList? ')'
	|	'super' '.' typeArguments? Identifier '(' argumentList? ')'
	|	typeName '.' 'super' '.' typeArguments? Identifier '(' argumentList? ')'
	;

methodInvocation_lf_primary
	:	'.' typeArguments? Identifier '(' argumentList? ')'
	;

methodInvocation_lfno_primary
	:	methodName '(' argumentList? ')'
	|	typeName '.' typeArguments? Identifier '(' argumentList? ')'
	|	expressionName '.' typeArguments? Identifier '(' argumentList? ')'
	|	'super' '.' typeArguments? Identifier '(' argumentList? ')'
	|	typeName '.' 'super' '.' typeArguments? Identifier '(' argumentList? ')'
	;

argumentList
	:	expression (',' expression)*
	;

methodReference
	:	expressionName '::' typeArguments? Identifier
	|	referenceType '::' typeArguments? Identifier
	|	primary '::' typeArguments? Identifier
	|	'super' '::' typeArguments? Identifier
	|	typeName '.' 'super' '::' typeArguments? Identifier
	|	classType '::' typeArguments? 'new'
	|	arrayType '::' 'new'
	;

methodReference_lf_primary
	:	'::' typeArguments? Identifier
	;

methodReference_lfno_primary
	:	expressionName '::' typeArguments? Identifier
	|	referenceType '::' typeArguments? Identifier
	|	'super' '::' typeArguments? Identifier
	|	typeName '.' 'super' '::' typeArguments? Identifier
	|	classType '::' typeArguments? 'new'
	|	arrayType '::' 'new'
	;

arrayCreationExpression
	:	'new' primitiveType dimExprs dims?
	|	'new' classOrInterfaceType dimExprs dims?
	|	'new' primitiveType dims arrayInitializer
	|	'new' classOrInterfaceType dims arrayInitializer
	;

arrayInitializer
	:	'{' variableInitializerList? ','? '}'
	;

variableInitializerList
	:	variableInitializer (',' variableInitializer)*
	;

dimExprs
	:	dimExpr dimExpr*
	;

dimExpr
	:	'[' expression ']'
	;

constantExpression
	:	expression
	;

expression
	:	lambdaExpression
	|	assignmentExpression
	|	CodeHole
	;

lambdaExpression
	:	lambdaParameters '->' lambdaBody
	;

lambdaParameters
	:	Identifier
	|	'(' formalParameters? ')'
	;

lambdaBody
	:	expression
	|	
	;

assignmentExpression
	:	conditionalExpression
	|	assignment
	;

assignment
	:	leftHandSide assignmentOperator expression
	;

leftHandSide
	:	expressionName
	|	fieldAccess
	|	arrayAccess
	;

assignmentOperator
	:	'='
	|	'*='
	|	'/='
	|	'%='
	|	'+='
	|	'-='
	|	'<<='
	|	'>>='
	|	'>>>='
	|	'&='
	|	'^='
	|	'|='
	;

conditionalExpression
	:	conditionalOrExpression
	|	conditionalOrExpression '?' expression ':' conditionalExpression
	;

conditionalOrExpression
	:	conditionalAndExpression
	|	conditionalOrExpression '||' conditionalAndExpression
	;

conditionalAndExpression
	:	inclusiveOrExpression
	|	conditionalAndExpression '&&' inclusiveOrExpression
	;

inclusiveOrExpression
	:	exclusiveOrExpression
	|	inclusiveOrExpression '|' exclusiveOrExpression
	;

exclusiveOrExpression
	:	andExpression
	|	exclusiveOrExpression '^' andExpression
	;

andExpression
	:	equalityExpression
	|	andExpression '&' equalityExpression
	;

equalityExpression
	:	relationalExpression
	|	equalityExpression '==' relationalExpression
	|	equalityExpression '!=' relationalExpression
	;

relationalExpression
	:	shiftExpression
	|	relationalExpression '<' shiftExpression
	|	relationalExpression '>' shiftExpression
	|	relationalExpression '<=' shiftExpression
	|	relationalExpression '>=' shiftExpression
	|	relationalExpression 'instanceof' (referenceType | ClassRef)
	;

shiftExpression
	:	additiveExpression
	|	shiftExpression '<' '<' additiveExpression
	|	shiftExpression '>' '>' additiveExpression
	|	shiftExpression '>' '>' '>' additiveExpression
	;

additiveExpression
	:	multiplicativeExpression
	|	additiveExpression '+' multiplicativeExpression
	|	additiveExpression '-' multiplicativeExpression
	;

multiplicativeExpression
	:	unaryExpression
	|	multiplicativeExpression '*' unaryExpression
	|	multiplicativeExpression '/' unaryExpression
	|	multiplicativeExpression '%' unaryExpression
	;

unaryExpression
	:	preIncrementExpression
	|	preDecrementExpression
	|	'+' unaryExpression
	|	'-' unaryExpression
	|	unaryExpressionNotPlusMinus
	;

preIncrementExpression
	:	'++' unaryExpression
	;

preDecrementExpression
	:	'--' unaryExpression
	;

unaryExpressionNotPlusMinus
	:	postfixExpression
	|	'~' unaryExpression
	|	'!' unaryExpression
	|	castExpression
	;

postfixExpression
	:	(	primary
		|	expressionName
		)
		(	postIncrementExpression_lf_postfixExpression
		|	postDecrementExpression_lf_postfixExpression
		)*
	;

postIncrementExpression
	:	postfixExpression '++'
	;

postIncrementExpression_lf_postfixExpression
	:	'++'
	;

postDecrementExpression
	:	postfixExpression '--'
	;

postDecrementExpression_lf_postfixExpression
	:	'--'
	;

castExpression
	:	'(' primitiveType ')' unaryExpression
	|	'(' referenceType additionalBound* ')' unaryExpressionNotPlusMinus
	|	'(' referenceType additionalBound* ')' lambdaExpression
	|	'(' ClassRef ')' unaryExpression
	|	'(' ClassRef additionalBoundOrClassRef* ')' unaryExpressionNotPlusMinus
	|	'(' ClassRef additionalBoundOrClassRef* ')' lambdaExpression
	;
	
additionalBoundOrClassRef
	:	'&' (interfaceType | ClassRef)
	;

ASSERT : 'assert';
BOOLEAN : 'boolean';
BREAK : 'break';
BYTE : 'byte';
CASE : 'case';
CATCH : 'catch';
CHAR : 'char';
CLASS : 'class';
CONTINUE : 'continue';
DEFAULT : 'default';
DO : 'do';
DOUBLE : 'double';
ELSE : 'else';
FINAL : 'final';
FINALLY : 'finally';
FLOAT : 'float';
FOR : 'for';
IF : 'if';
GOTO : 'goto';
INSTANCEOF : 'instanceof';
INT : 'int';
INTERFACE : 'interface';
LONG : 'long';
NEW : 'new';
RETURN : 'return';
SHORT : 'short';
SUPER : 'super';
SWITCH : 'switch';
SYNCHRONIZED : 'synchronized';
THIS : 'this';
THROW : 'throw';
THROWS : 'throws';
TRY : 'try';
WHILE : 'while';

NumberLiteral
	:	AT 'NUB'
	;

BooleanLiteral
	:	'true'
	|	'false'
	;

CharacterLiteral
	:	AT 'CHR'
	;

StringLiteral
	:	AT 'STR'
	;

NullLiteral
	:	AT 'NUL'
	;

LPAREN : '(';
RPAREN : ')';
LBRACE : '{';
RBRACE : '}';
LBRACK : '[';
RBRACK : ']';
COMMA : ',';
DOT : '.';

ASSIGN : '=';
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
ARROW : '->';
COLONCOLON : '::';

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

Identifier
	:	JavaLetter JavaLetterOrDigit*
	| NoDeclaredType | ClassRef | FinalFieldRef | FinalVarRef | CommonFieldRef | CommonVarRef
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

WS  :  [ '#' ]+ -> skip;