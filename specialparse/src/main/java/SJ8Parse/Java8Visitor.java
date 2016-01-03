package SJ8Parse;

// Generated from Java8.g4 by ANTLR 4.5.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link Java8Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface Java8Visitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link Java8Parser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(Java8Parser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(Java8Parser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#primitiveType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitiveType(Java8Parser.PrimitiveTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#numericType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumericType(Java8Parser.NumericTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#integralType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegralType(Java8Parser.IntegralTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#floatingPointType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatingPointType(Java8Parser.FloatingPointTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#referenceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReferenceType(Java8Parser.ReferenceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#classOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassOrInterfaceType(Java8Parser.ClassOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#classType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassType(Java8Parser.ClassTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#classType_lf_classOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassType_lf_classOrInterfaceType(Java8Parser.ClassType_lf_classOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#classType_lfno_classOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassType_lfno_classOrInterfaceType(Java8Parser.ClassType_lfno_classOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#interfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceType(Java8Parser.InterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#interfaceType_lf_classOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceType_lf_classOrInterfaceType(Java8Parser.InterfaceType_lf_classOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#interfaceType_lfno_classOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceType_lfno_classOrInterfaceType(Java8Parser.InterfaceType_lfno_classOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#arrayType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayType(Java8Parser.ArrayTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#dims}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDims(Java8Parser.DimsContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#typeParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeParameter(Java8Parser.TypeParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#typeBound}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeBound(Java8Parser.TypeBoundContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#additionalBound}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditionalBound(Java8Parser.AdditionalBoundContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#typeArguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArguments(Java8Parser.TypeArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#typeArgumentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArgumentList(Java8Parser.TypeArgumentListContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#typeArgument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArgument(Java8Parser.TypeArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#wildcard}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWildcard(Java8Parser.WildcardContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#wildcardBounds}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWildcardBounds(Java8Parser.WildcardBoundsContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#typeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeName(Java8Parser.TypeNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#packageOrTypeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackageOrTypeName(Java8Parser.PackageOrTypeNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#expressionName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionName(Java8Parser.ExpressionNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#methodName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodName(Java8Parser.MethodNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#ambiguousName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAmbiguousName(Java8Parser.AmbiguousNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#typeDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeDeclaration(Java8Parser.TypeDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#typeParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeParameters(Java8Parser.TypeParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#typeParameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeParameterList(Java8Parser.TypeParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#variableDeclaratorList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaratorList(Java8Parser.VariableDeclaratorListContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#variableDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarator(Java8Parser.VariableDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaratorId(Java8Parser.VariableDeclaratorIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#variableInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableInitializer(Java8Parser.VariableInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#unannType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannType(Java8Parser.UnannTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#unannPrimitiveType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannPrimitiveType(Java8Parser.UnannPrimitiveTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#unannReferenceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannReferenceType(Java8Parser.UnannReferenceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannClassOrInterfaceType(Java8Parser.UnannClassOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#unannClassType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannClassType(Java8Parser.UnannClassTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#unannClassType_lf_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannClassType_lf_unannClassOrInterfaceType(Java8Parser.UnannClassType_lf_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#unannClassType_lfno_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannClassType_lfno_unannClassOrInterfaceType(Java8Parser.UnannClassType_lfno_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#unannInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannInterfaceType(Java8Parser.UnannInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#unannInterfaceType_lf_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannInterfaceType_lf_unannClassOrInterfaceType(Java8Parser.UnannInterfaceType_lf_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#unannInterfaceType_lfno_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannInterfaceType_lfno_unannClassOrInterfaceType(Java8Parser.UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#unannTypeVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannTypeVariable(Java8Parser.UnannTypeVariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#unannArrayType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannArrayType(Java8Parser.UnannArrayTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#methodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDeclaration(Java8Parser.MethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#formalParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameters(Java8Parser.FormalParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#formalParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameter(Java8Parser.FormalParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#receiverParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReceiverParameter(Java8Parser.ReceiverParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#exceptionTypeList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExceptionTypeList(Java8Parser.ExceptionTypeListContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#exceptionType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExceptionType(Java8Parser.ExceptionTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#simpleTypeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleTypeName(Java8Parser.SimpleTypeNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#explicitConstructorInvocation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplicitConstructorInvocation(Java8Parser.ExplicitConstructorInvocationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#localVariableDeclarationStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalVariableDeclarationStatement(Java8Parser.LocalVariableDeclarationStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalVariableDeclaration(Java8Parser.LocalVariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(Java8Parser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#statementWithoutTrailingSubstatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementWithoutTrailingSubstatement(Java8Parser.StatementWithoutTrailingSubstatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#labeledStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabeledStatement(Java8Parser.LabeledStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#expressionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionStatement(Java8Parser.ExpressionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#statementExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementExpression(Java8Parser.StatementExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(Java8Parser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#assertStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssertStatement(Java8Parser.AssertStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#switchStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchStatement(Java8Parser.SwitchStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#caseStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseStatement(Java8Parser.CaseStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#whileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(Java8Parser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#doStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoStatement(Java8Parser.DoStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#forStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatement(Java8Parser.ForStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#breakStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreakStatement(Java8Parser.BreakStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#continueStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinueStatement(Java8Parser.ContinueStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(Java8Parser.ReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#throwStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThrowStatement(Java8Parser.ThrowStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#synchronizedStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSynchronizedStatement(Java8Parser.SynchronizedStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#tryStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTryStatement(Java8Parser.TryStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#catchClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatchClause(Java8Parser.CatchClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#catchFormalParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatchFormalParameter(Java8Parser.CatchFormalParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#catchType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatchType(Java8Parser.CatchTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#resource}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResource(Java8Parser.ResourceContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary(Java8Parser.PrimaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#primaryNoNewArray}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray(Java8Parser.PrimaryNoNewArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#primaryNoNewArray_lf_arrayAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray_lf_arrayAccess(Java8Parser.PrimaryNoNewArray_lf_arrayAccessContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#primaryNoNewArray_lfno_arrayAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray_lfno_arrayAccess(Java8Parser.PrimaryNoNewArray_lfno_arrayAccessContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#primaryNoNewArray_lf_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray_lf_primary(Java8Parser.PrimaryNoNewArray_lf_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary(Java8Parser.PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary(Java8Parser.PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#primaryNoNewArray_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray_lfno_primary(Java8Parser.PrimaryNoNewArray_lfno_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary(Java8Parser.PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary(Java8Parser.PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#classInstanceCreationExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassInstanceCreationExpression(Java8Parser.ClassInstanceCreationExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#classInstanceCreationExpression_lf_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassInstanceCreationExpression_lf_primary(Java8Parser.ClassInstanceCreationExpression_lf_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#classInstanceCreationExpression_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassInstanceCreationExpression_lfno_primary(Java8Parser.ClassInstanceCreationExpression_lfno_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#typeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArgumentsOrDiamond(Java8Parser.TypeArgumentsOrDiamondContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#fieldAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldAccess(Java8Parser.FieldAccessContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#fieldAccess_lf_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldAccess_lf_primary(Java8Parser.FieldAccess_lf_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#fieldAccess_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldAccess_lfno_primary(Java8Parser.FieldAccess_lfno_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#arrayAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayAccess(Java8Parser.ArrayAccessContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayAccess_lf_primary(Java8Parser.ArrayAccess_lf_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayAccess_lfno_primary(Java8Parser.ArrayAccess_lfno_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#methodInvocation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodInvocation(Java8Parser.MethodInvocationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#methodInvocation_lf_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodInvocation_lf_primary(Java8Parser.MethodInvocation_lf_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#methodInvocation_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodInvocation_lfno_primary(Java8Parser.MethodInvocation_lfno_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#argumentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentList(Java8Parser.ArgumentListContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#methodReference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodReference(Java8Parser.MethodReferenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#methodReference_lf_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodReference_lf_primary(Java8Parser.MethodReference_lf_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#methodReference_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodReference_lfno_primary(Java8Parser.MethodReference_lfno_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#arrayCreationExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayCreationExpression(Java8Parser.ArrayCreationExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#arrayInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayInitializer(Java8Parser.ArrayInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#variableInitializerList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableInitializerList(Java8Parser.VariableInitializerListContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#dimExprs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDimExprs(Java8Parser.DimExprsContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#dimExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDimExpr(Java8Parser.DimExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#constantExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantExpression(Java8Parser.ConstantExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(Java8Parser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#lambdaExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaExpression(Java8Parser.LambdaExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#lambdaParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaParameters(Java8Parser.LambdaParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#lambdaBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaBody(Java8Parser.LambdaBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#assignmentExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentExpression(Java8Parser.AssignmentExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(Java8Parser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#leftHandSide}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeftHandSide(Java8Parser.LeftHandSideContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#assignmentOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentOperator(Java8Parser.AssignmentOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#conditionalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalExpression(Java8Parser.ConditionalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#conditionalOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalOrExpression(Java8Parser.ConditionalOrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#conditionalAndExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalAndExpression(Java8Parser.ConditionalAndExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInclusiveOrExpression(Java8Parser.InclusiveOrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExclusiveOrExpression(Java8Parser.ExclusiveOrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#andExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExpression(Java8Parser.AndExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#equalityExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualityExpression(Java8Parser.EqualityExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#relationalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalExpression(Java8Parser.RelationalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#shiftExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShiftExpression(Java8Parser.ShiftExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#additiveExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveExpression(Java8Parser.AdditiveExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicativeExpression(Java8Parser.MultiplicativeExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#unaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpression(Java8Parser.UnaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#preIncrementExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPreIncrementExpression(Java8Parser.PreIncrementExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#preDecrementExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPreDecrementExpression(Java8Parser.PreDecrementExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#unaryExpressionNotPlusMinus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpressionNotPlusMinus(Java8Parser.UnaryExpressionNotPlusMinusContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#postfixExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostfixExpression(Java8Parser.PostfixExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#postIncrementExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostIncrementExpression(Java8Parser.PostIncrementExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#postIncrementExpression_lf_postfixExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostIncrementExpression_lf_postfixExpression(Java8Parser.PostIncrementExpression_lf_postfixExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#postDecrementExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostDecrementExpression(Java8Parser.PostDecrementExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#postDecrementExpression_lf_postfixExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostDecrementExpression_lf_postfixExpression(Java8Parser.PostDecrementExpression_lf_postfixExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#castExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCastExpression(Java8Parser.CastExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#additionalBoundOrClassRef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditionalBoundOrClassRef(Java8Parser.AdditionalBoundOrClassRefContext ctx);
}