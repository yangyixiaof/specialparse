package SJ8Parse;

// Generated from Java8.g4 by ANTLR 4.5.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link Java8Parser}.
 */
public interface Java8Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link Java8Parser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(Java8Parser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(Java8Parser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(Java8Parser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(Java8Parser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveType(Java8Parser.PrimitiveTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveType(Java8Parser.PrimitiveTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#numericType}.
	 * @param ctx the parse tree
	 */
	void enterNumericType(Java8Parser.NumericTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#numericType}.
	 * @param ctx the parse tree
	 */
	void exitNumericType(Java8Parser.NumericTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#integralType}.
	 * @param ctx the parse tree
	 */
	void enterIntegralType(Java8Parser.IntegralTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#integralType}.
	 * @param ctx the parse tree
	 */
	void exitIntegralType(Java8Parser.IntegralTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#floatingPointType}.
	 * @param ctx the parse tree
	 */
	void enterFloatingPointType(Java8Parser.FloatingPointTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#floatingPointType}.
	 * @param ctx the parse tree
	 */
	void exitFloatingPointType(Java8Parser.FloatingPointTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#referenceType}.
	 * @param ctx the parse tree
	 */
	void enterReferenceType(Java8Parser.ReferenceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#referenceType}.
	 * @param ctx the parse tree
	 */
	void exitReferenceType(Java8Parser.ReferenceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterClassOrInterfaceType(Java8Parser.ClassOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitClassOrInterfaceType(Java8Parser.ClassOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#classType_lf_classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterClassType_lf_classOrInterfaceType(Java8Parser.ClassType_lf_classOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#classType_lf_classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitClassType_lf_classOrInterfaceType(Java8Parser.ClassType_lf_classOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#classType_lfno_classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterClassType_lfno_classOrInterfaceType(Java8Parser.ClassType_lfno_classOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#classType_lfno_classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitClassType_lfno_classOrInterfaceType(Java8Parser.ClassType_lfno_classOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#interfaceType_lf_classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceType_lf_classOrInterfaceType(Java8Parser.InterfaceType_lf_classOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#interfaceType_lf_classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceType_lf_classOrInterfaceType(Java8Parser.InterfaceType_lf_classOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#interfaceType_lfno_classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceType_lfno_classOrInterfaceType(Java8Parser.InterfaceType_lfno_classOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#interfaceType_lfno_classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceType_lfno_classOrInterfaceType(Java8Parser.InterfaceType_lfno_classOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#arrayType}.
	 * @param ctx the parse tree
	 */
	void enterArrayType(Java8Parser.ArrayTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#arrayType}.
	 * @param ctx the parse tree
	 */
	void exitArrayType(Java8Parser.ArrayTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#dims}.
	 * @param ctx the parse tree
	 */
	void enterDims(Java8Parser.DimsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#dims}.
	 * @param ctx the parse tree
	 */
	void exitDims(Java8Parser.DimsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#typeParameter}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameter(Java8Parser.TypeParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#typeParameter}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameter(Java8Parser.TypeParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#typeBound}.
	 * @param ctx the parse tree
	 */
	void enterTypeBound(Java8Parser.TypeBoundContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#typeBound}.
	 * @param ctx the parse tree
	 */
	void exitTypeBound(Java8Parser.TypeBoundContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#additionalBound}.
	 * @param ctx the parse tree
	 */
	void enterAdditionalBound(Java8Parser.AdditionalBoundContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#additionalBound}.
	 * @param ctx the parse tree
	 */
	void exitAdditionalBound(Java8Parser.AdditionalBoundContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#typeArguments}.
	 * @param ctx the parse tree
	 */
	void enterTypeArguments(Java8Parser.TypeArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#typeArguments}.
	 * @param ctx the parse tree
	 */
	void exitTypeArguments(Java8Parser.TypeArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#typeArgumentList}.
	 * @param ctx the parse tree
	 */
	void enterTypeArgumentList(Java8Parser.TypeArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#typeArgumentList}.
	 * @param ctx the parse tree
	 */
	void exitTypeArgumentList(Java8Parser.TypeArgumentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#typeArgument}.
	 * @param ctx the parse tree
	 */
	void enterTypeArgument(Java8Parser.TypeArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#typeArgument}.
	 * @param ctx the parse tree
	 */
	void exitTypeArgument(Java8Parser.TypeArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#wildcard}.
	 * @param ctx the parse tree
	 */
	void enterWildcard(Java8Parser.WildcardContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#wildcard}.
	 * @param ctx the parse tree
	 */
	void exitWildcard(Java8Parser.WildcardContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#wildcardBounds}.
	 * @param ctx the parse tree
	 */
	void enterWildcardBounds(Java8Parser.WildcardBoundsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#wildcardBounds}.
	 * @param ctx the parse tree
	 */
	void exitWildcardBounds(Java8Parser.WildcardBoundsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#typeName}.
	 * @param ctx the parse tree
	 */
	void enterTypeName(Java8Parser.TypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#typeName}.
	 * @param ctx the parse tree
	 */
	void exitTypeName(Java8Parser.TypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#packageOrTypeName}.
	 * @param ctx the parse tree
	 */
	void enterPackageOrTypeName(Java8Parser.PackageOrTypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#packageOrTypeName}.
	 * @param ctx the parse tree
	 */
	void exitPackageOrTypeName(Java8Parser.PackageOrTypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#expressionName}.
	 * @param ctx the parse tree
	 */
	void enterExpressionName(Java8Parser.ExpressionNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#expressionName}.
	 * @param ctx the parse tree
	 */
	void exitExpressionName(Java8Parser.ExpressionNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#methodName}.
	 * @param ctx the parse tree
	 */
	void enterMethodName(Java8Parser.MethodNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#methodName}.
	 * @param ctx the parse tree
	 */
	void exitMethodName(Java8Parser.MethodNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#ambiguousName}.
	 * @param ctx the parse tree
	 */
	void enterAmbiguousName(Java8Parser.AmbiguousNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#ambiguousName}.
	 * @param ctx the parse tree
	 */
	void exitAmbiguousName(Java8Parser.AmbiguousNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#typeDeclarationStatement}.
	 * @param ctx the parse tree
	 */
	void enterTypeDeclarationStatement(Java8Parser.TypeDeclarationStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#typeDeclarationStatement}.
	 * @param ctx the parse tree
	 */
	void exitTypeDeclarationStatement(Java8Parser.TypeDeclarationStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#typeParameters}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameters(Java8Parser.TypeParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#typeParameters}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameters(Java8Parser.TypeParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#typeParameterList}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameterList(Java8Parser.TypeParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#typeParameterList}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameterList(Java8Parser.TypeParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#variableDeclaratorList}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaratorList(Java8Parser.VariableDeclaratorListContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#variableDeclaratorList}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaratorList(Java8Parser.VariableDeclaratorListContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarator(Java8Parser.VariableDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarator(Java8Parser.VariableDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaratorId(Java8Parser.VariableDeclaratorIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaratorId(Java8Parser.VariableDeclaratorIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void enterVariableInitializer(Java8Parser.VariableInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void exitVariableInitializer(Java8Parser.VariableInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclaration(Java8Parser.MethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclaration(Java8Parser.MethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameters(Java8Parser.FormalParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameters(Java8Parser.FormalParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameter(Java8Parser.FormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameter(Java8Parser.FormalParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#receiverParameter}.
	 * @param ctx the parse tree
	 */
	void enterReceiverParameter(Java8Parser.ReceiverParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#receiverParameter}.
	 * @param ctx the parse tree
	 */
	void exitReceiverParameter(Java8Parser.ReceiverParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#exceptionTypeList}.
	 * @param ctx the parse tree
	 */
	void enterExceptionTypeList(Java8Parser.ExceptionTypeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#exceptionTypeList}.
	 * @param ctx the parse tree
	 */
	void exitExceptionTypeList(Java8Parser.ExceptionTypeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#exceptionType}.
	 * @param ctx the parse tree
	 */
	void enterExceptionType(Java8Parser.ExceptionTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#exceptionType}.
	 * @param ctx the parse tree
	 */
	void exitExceptionType(Java8Parser.ExceptionTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#simpleTypeName}.
	 * @param ctx the parse tree
	 */
	void enterSimpleTypeName(Java8Parser.SimpleTypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#simpleTypeName}.
	 * @param ctx the parse tree
	 */
	void exitSimpleTypeName(Java8Parser.SimpleTypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#explicitConstructorInvocation}.
	 * @param ctx the parse tree
	 */
	void enterExplicitConstructorInvocation(Java8Parser.ExplicitConstructorInvocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#explicitConstructorInvocation}.
	 * @param ctx the parse tree
	 */
	void exitExplicitConstructorInvocation(Java8Parser.ExplicitConstructorInvocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#localVariableDeclarationStatement}.
	 * @param ctx the parse tree
	 */
	void enterLocalVariableDeclarationStatement(Java8Parser.LocalVariableDeclarationStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#localVariableDeclarationStatement}.
	 * @param ctx the parse tree
	 */
	void exitLocalVariableDeclarationStatement(Java8Parser.LocalVariableDeclarationStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterLocalVariableDeclaration(Java8Parser.LocalVariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitLocalVariableDeclaration(Java8Parser.LocalVariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(Java8Parser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(Java8Parser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#statementWithoutTrailingSubstatement}.
	 * @param ctx the parse tree
	 */
	void enterStatementWithoutTrailingSubstatement(Java8Parser.StatementWithoutTrailingSubstatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#statementWithoutTrailingSubstatement}.
	 * @param ctx the parse tree
	 */
	void exitStatementWithoutTrailingSubstatement(Java8Parser.StatementWithoutTrailingSubstatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(Java8Parser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(Java8Parser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#assertStatement}.
	 * @param ctx the parse tree
	 */
	void enterAssertStatement(Java8Parser.AssertStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#assertStatement}.
	 * @param ctx the parse tree
	 */
	void exitAssertStatement(Java8Parser.AssertStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#switchStatement}.
	 * @param ctx the parse tree
	 */
	void enterSwitchStatement(Java8Parser.SwitchStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#switchStatement}.
	 * @param ctx the parse tree
	 */
	void exitSwitchStatement(Java8Parser.SwitchStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#caseStatement}.
	 * @param ctx the parse tree
	 */
	void enterCaseStatement(Java8Parser.CaseStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#caseStatement}.
	 * @param ctx the parse tree
	 */
	void exitCaseStatement(Java8Parser.CaseStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(Java8Parser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(Java8Parser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#doStatement}.
	 * @param ctx the parse tree
	 */
	void enterDoStatement(Java8Parser.DoStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#doStatement}.
	 * @param ctx the parse tree
	 */
	void exitDoStatement(Java8Parser.DoStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#forStatement}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(Java8Parser.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#forStatement}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(Java8Parser.ForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#breakStatement}.
	 * @param ctx the parse tree
	 */
	void enterBreakStatement(Java8Parser.BreakStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#breakStatement}.
	 * @param ctx the parse tree
	 */
	void exitBreakStatement(Java8Parser.BreakStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#continueStatement}.
	 * @param ctx the parse tree
	 */
	void enterContinueStatement(Java8Parser.ContinueStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#continueStatement}.
	 * @param ctx the parse tree
	 */
	void exitContinueStatement(Java8Parser.ContinueStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(Java8Parser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(Java8Parser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#throwStatement}.
	 * @param ctx the parse tree
	 */
	void enterThrowStatement(Java8Parser.ThrowStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#throwStatement}.
	 * @param ctx the parse tree
	 */
	void exitThrowStatement(Java8Parser.ThrowStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#synchronizedStatement}.
	 * @param ctx the parse tree
	 */
	void enterSynchronizedStatement(Java8Parser.SynchronizedStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#synchronizedStatement}.
	 * @param ctx the parse tree
	 */
	void exitSynchronizedStatement(Java8Parser.SynchronizedStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#tryStatement}.
	 * @param ctx the parse tree
	 */
	void enterTryStatement(Java8Parser.TryStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#tryStatement}.
	 * @param ctx the parse tree
	 */
	void exitTryStatement(Java8Parser.TryStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#catchClause}.
	 * @param ctx the parse tree
	 */
	void enterCatchClause(Java8Parser.CatchClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#catchClause}.
	 * @param ctx the parse tree
	 */
	void exitCatchClause(Java8Parser.CatchClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#catchFormalParameter}.
	 * @param ctx the parse tree
	 */
	void enterCatchFormalParameter(Java8Parser.CatchFormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#catchFormalParameter}.
	 * @param ctx the parse tree
	 */
	void exitCatchFormalParameter(Java8Parser.CatchFormalParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#catchType}.
	 * @param ctx the parse tree
	 */
	void enterCatchType(Java8Parser.CatchTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#catchType}.
	 * @param ctx the parse tree
	 */
	void exitCatchType(Java8Parser.CatchTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#resource}.
	 * @param ctx the parse tree
	 */
	void enterResource(Java8Parser.ResourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#resource}.
	 * @param ctx the parse tree
	 */
	void exitResource(Java8Parser.ResourceContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(Java8Parser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(Java8Parser.PrimaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#primaryNoNewArray}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray(Java8Parser.PrimaryNoNewArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#primaryNoNewArray}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray(Java8Parser.PrimaryNoNewArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#primaryNoNewArray_lf_arrayAccess}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lf_arrayAccess(Java8Parser.PrimaryNoNewArray_lf_arrayAccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#primaryNoNewArray_lf_arrayAccess}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lf_arrayAccess(Java8Parser.PrimaryNoNewArray_lf_arrayAccessContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#primaryNoNewArray_lfno_arrayAccess}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lfno_arrayAccess(Java8Parser.PrimaryNoNewArray_lfno_arrayAccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#primaryNoNewArray_lfno_arrayAccess}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lfno_arrayAccess(Java8Parser.PrimaryNoNewArray_lfno_arrayAccessContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#primaryNoNewArray_lf_primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lf_primary(Java8Parser.PrimaryNoNewArray_lf_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#primaryNoNewArray_lf_primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lf_primary(Java8Parser.PrimaryNoNewArray_lf_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary(Java8Parser.PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary(Java8Parser.PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary(Java8Parser.PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary(Java8Parser.PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#primaryNoNewArray_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lfno_primary(Java8Parser.PrimaryNoNewArray_lfno_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#primaryNoNewArray_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lfno_primary(Java8Parser.PrimaryNoNewArray_lfno_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary(Java8Parser.PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary(Java8Parser.PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary(Java8Parser.PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary(Java8Parser.PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#classInstanceCreationExpression}.
	 * @param ctx the parse tree
	 */
	void enterClassInstanceCreationExpression(Java8Parser.ClassInstanceCreationExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#classInstanceCreationExpression}.
	 * @param ctx the parse tree
	 */
	void exitClassInstanceCreationExpression(Java8Parser.ClassInstanceCreationExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#classInstanceCreationExpression_lf_primary}.
	 * @param ctx the parse tree
	 */
	void enterClassInstanceCreationExpression_lf_primary(Java8Parser.ClassInstanceCreationExpression_lf_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#classInstanceCreationExpression_lf_primary}.
	 * @param ctx the parse tree
	 */
	void exitClassInstanceCreationExpression_lf_primary(Java8Parser.ClassInstanceCreationExpression_lf_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#classInstanceCreationExpression_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void enterClassInstanceCreationExpression_lfno_primary(Java8Parser.ClassInstanceCreationExpression_lfno_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#classInstanceCreationExpression_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void exitClassInstanceCreationExpression_lfno_primary(Java8Parser.ClassInstanceCreationExpression_lfno_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#typeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 */
	void enterTypeArgumentsOrDiamond(Java8Parser.TypeArgumentsOrDiamondContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#typeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 */
	void exitTypeArgumentsOrDiamond(Java8Parser.TypeArgumentsOrDiamondContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#fieldAccess}.
	 * @param ctx the parse tree
	 */
	void enterFieldAccess(Java8Parser.FieldAccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#fieldAccess}.
	 * @param ctx the parse tree
	 */
	void exitFieldAccess(Java8Parser.FieldAccessContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#fieldAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void enterFieldAccess_lf_primary(Java8Parser.FieldAccess_lf_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#fieldAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void exitFieldAccess_lf_primary(Java8Parser.FieldAccess_lf_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#fieldAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void enterFieldAccess_lfno_primary(Java8Parser.FieldAccess_lfno_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#fieldAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void exitFieldAccess_lfno_primary(Java8Parser.FieldAccess_lfno_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#arrayAccess}.
	 * @param ctx the parse tree
	 */
	void enterArrayAccess(Java8Parser.ArrayAccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#arrayAccess}.
	 * @param ctx the parse tree
	 */
	void exitArrayAccess(Java8Parser.ArrayAccessContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void enterArrayAccess_lf_primary(Java8Parser.ArrayAccess_lf_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void exitArrayAccess_lf_primary(Java8Parser.ArrayAccess_lf_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void enterArrayAccess_lfno_primary(Java8Parser.ArrayAccess_lfno_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void exitArrayAccess_lfno_primary(Java8Parser.ArrayAccess_lfno_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#methodInvocation}.
	 * @param ctx the parse tree
	 */
	void enterMethodInvocation(Java8Parser.MethodInvocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#methodInvocation}.
	 * @param ctx the parse tree
	 */
	void exitMethodInvocation(Java8Parser.MethodInvocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#methodInvocation_lf_primary}.
	 * @param ctx the parse tree
	 */
	void enterMethodInvocation_lf_primary(Java8Parser.MethodInvocation_lf_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#methodInvocation_lf_primary}.
	 * @param ctx the parse tree
	 */
	void exitMethodInvocation_lf_primary(Java8Parser.MethodInvocation_lf_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#methodInvocation_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void enterMethodInvocation_lfno_primary(Java8Parser.MethodInvocation_lfno_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#methodInvocation_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void exitMethodInvocation_lfno_primary(Java8Parser.MethodInvocation_lfno_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#argumentList}.
	 * @param ctx the parse tree
	 */
	void enterArgumentList(Java8Parser.ArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#argumentList}.
	 * @param ctx the parse tree
	 */
	void exitArgumentList(Java8Parser.ArgumentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#methodReference}.
	 * @param ctx the parse tree
	 */
	void enterMethodReference(Java8Parser.MethodReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#methodReference}.
	 * @param ctx the parse tree
	 */
	void exitMethodReference(Java8Parser.MethodReferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#methodReference_lf_primary}.
	 * @param ctx the parse tree
	 */
	void enterMethodReference_lf_primary(Java8Parser.MethodReference_lf_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#methodReference_lf_primary}.
	 * @param ctx the parse tree
	 */
	void exitMethodReference_lf_primary(Java8Parser.MethodReference_lf_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#methodReference_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void enterMethodReference_lfno_primary(Java8Parser.MethodReference_lfno_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#methodReference_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void exitMethodReference_lfno_primary(Java8Parser.MethodReference_lfno_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#arrayCreationExpression}.
	 * @param ctx the parse tree
	 */
	void enterArrayCreationExpression(Java8Parser.ArrayCreationExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#arrayCreationExpression}.
	 * @param ctx the parse tree
	 */
	void exitArrayCreationExpression(Java8Parser.ArrayCreationExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void enterArrayInitializer(Java8Parser.ArrayInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void exitArrayInitializer(Java8Parser.ArrayInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#variableInitializerList}.
	 * @param ctx the parse tree
	 */
	void enterVariableInitializerList(Java8Parser.VariableInitializerListContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#variableInitializerList}.
	 * @param ctx the parse tree
	 */
	void exitVariableInitializerList(Java8Parser.VariableInitializerListContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#dimExprs}.
	 * @param ctx the parse tree
	 */
	void enterDimExprs(Java8Parser.DimExprsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#dimExprs}.
	 * @param ctx the parse tree
	 */
	void exitDimExprs(Java8Parser.DimExprsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#dimExpr}.
	 * @param ctx the parse tree
	 */
	void enterDimExpr(Java8Parser.DimExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#dimExpr}.
	 * @param ctx the parse tree
	 */
	void exitDimExpr(Java8Parser.DimExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#constantExpression}.
	 * @param ctx the parse tree
	 */
	void enterConstantExpression(Java8Parser.ConstantExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#constantExpression}.
	 * @param ctx the parse tree
	 */
	void exitConstantExpression(Java8Parser.ConstantExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(Java8Parser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(Java8Parser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#lambdaExpression}.
	 * @param ctx the parse tree
	 */
	void enterLambdaExpression(Java8Parser.LambdaExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#lambdaExpression}.
	 * @param ctx the parse tree
	 */
	void exitLambdaExpression(Java8Parser.LambdaExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#lambdaParameters}.
	 * @param ctx the parse tree
	 */
	void enterLambdaParameters(Java8Parser.LambdaParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#lambdaParameters}.
	 * @param ctx the parse tree
	 */
	void exitLambdaParameters(Java8Parser.LambdaParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#lambdaBody}.
	 * @param ctx the parse tree
	 */
	void enterLambdaBody(Java8Parser.LambdaBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#lambdaBody}.
	 * @param ctx the parse tree
	 */
	void exitLambdaBody(Java8Parser.LambdaBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentExpression(Java8Parser.AssignmentExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentExpression(Java8Parser.AssignmentExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(Java8Parser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(Java8Parser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#leftHandSide}.
	 * @param ctx the parse tree
	 */
	void enterLeftHandSide(Java8Parser.LeftHandSideContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#leftHandSide}.
	 * @param ctx the parse tree
	 */
	void exitLeftHandSide(Java8Parser.LeftHandSideContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentOperator(Java8Parser.AssignmentOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentOperator(Java8Parser.AssignmentOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#conditionalExpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalExpression(Java8Parser.ConditionalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#conditionalExpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalExpression(Java8Parser.ConditionalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#conditionalOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalOrExpression(Java8Parser.ConditionalOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#conditionalOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalOrExpression(Java8Parser.ConditionalOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#conditionalAndExpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalAndExpression(Java8Parser.ConditionalAndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#conditionalAndExpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalAndExpression(Java8Parser.ConditionalAndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterInclusiveOrExpression(Java8Parser.InclusiveOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitInclusiveOrExpression(Java8Parser.InclusiveOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterExclusiveOrExpression(Java8Parser.ExclusiveOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitExclusiveOrExpression(Java8Parser.ExclusiveOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#andExpression}.
	 * @param ctx the parse tree
	 */
	void enterAndExpression(Java8Parser.AndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#andExpression}.
	 * @param ctx the parse tree
	 */
	void exitAndExpression(Java8Parser.AndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void enterEqualityExpression(Java8Parser.EqualityExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void exitEqualityExpression(Java8Parser.EqualityExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpression(Java8Parser.RelationalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpression(Java8Parser.RelationalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#shiftExpression}.
	 * @param ctx the parse tree
	 */
	void enterShiftExpression(Java8Parser.ShiftExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#shiftExpression}.
	 * @param ctx the parse tree
	 */
	void exitShiftExpression(Java8Parser.ShiftExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpression(Java8Parser.AdditiveExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpression(Java8Parser.AdditiveExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeExpression(Java8Parser.MultiplicativeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeExpression(Java8Parser.MultiplicativeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpression(Java8Parser.UnaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpression(Java8Parser.UnaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#preIncrementExpression}.
	 * @param ctx the parse tree
	 */
	void enterPreIncrementExpression(Java8Parser.PreIncrementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#preIncrementExpression}.
	 * @param ctx the parse tree
	 */
	void exitPreIncrementExpression(Java8Parser.PreIncrementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#preDecrementExpression}.
	 * @param ctx the parse tree
	 */
	void enterPreDecrementExpression(Java8Parser.PreDecrementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#preDecrementExpression}.
	 * @param ctx the parse tree
	 */
	void exitPreDecrementExpression(Java8Parser.PreDecrementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#unaryExpressionNotPlusMinus}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpressionNotPlusMinus(Java8Parser.UnaryExpressionNotPlusMinusContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#unaryExpressionNotPlusMinus}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpressionNotPlusMinus(Java8Parser.UnaryExpressionNotPlusMinusContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostfixExpression(Java8Parser.PostfixExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostfixExpression(Java8Parser.PostfixExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#postIncrementExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostIncrementExpression(Java8Parser.PostIncrementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#postIncrementExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostIncrementExpression(Java8Parser.PostIncrementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#postIncrementExpression_lf_postfixExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostIncrementExpression_lf_postfixExpression(Java8Parser.PostIncrementExpression_lf_postfixExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#postIncrementExpression_lf_postfixExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostIncrementExpression_lf_postfixExpression(Java8Parser.PostIncrementExpression_lf_postfixExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#postDecrementExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostDecrementExpression(Java8Parser.PostDecrementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#postDecrementExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostDecrementExpression(Java8Parser.PostDecrementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#postDecrementExpression_lf_postfixExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostDecrementExpression_lf_postfixExpression(Java8Parser.PostDecrementExpression_lf_postfixExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#postDecrementExpression_lf_postfixExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostDecrementExpression_lf_postfixExpression(Java8Parser.PostDecrementExpression_lf_postfixExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#castExpression}.
	 * @param ctx the parse tree
	 */
	void enterCastExpression(Java8Parser.CastExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#castExpression}.
	 * @param ctx the parse tree
	 */
	void exitCastExpression(Java8Parser.CastExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#additionalBoundOrClassRef}.
	 * @param ctx the parse tree
	 */
	void enterAdditionalBoundOrClassRef(Java8Parser.AdditionalBoundOrClassRefContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#additionalBoundOrClassRef}.
	 * @param ctx the parse tree
	 */
	void exitAdditionalBoundOrClassRef(Java8Parser.AdditionalBoundOrClassRefContext ctx);
}