// Generated from Java8.g4 by ANTLR 4.5.1
package SJ8Parse;

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
	 * Visit a parse tree produced by {@link Java8Parser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(Java8Parser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#expressionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionStatement(Java8Parser.ExpressionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(Java8Parser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#referedExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReferedExpression(Java8Parser.ReferedExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(Java8Parser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#methodInvocation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodInvocation(Java8Parser.MethodInvocationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#argumentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentList(Java8Parser.ArgumentListContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#methodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDeclaration(Java8Parser.MethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#typeList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeList(Java8Parser.TypeListContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#fieldAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldAccess(Java8Parser.FieldAccessContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#condExpColonMarkStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondExpColonMarkStatement(Java8Parser.CondExpColonMarkStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#condExpQuestionMarkStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondExpQuestionMarkStatement(Java8Parser.CondExpQuestionMarkStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#condExpBeginStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondExpBeginStatement(Java8Parser.CondExpBeginStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#variableDeclarationTypeStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarationTypeStatement(Java8Parser.VariableDeclarationTypeStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#forUpdOverStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForUpdOverStatement(Java8Parser.ForUpdOverStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#forExpOverStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForExpOverStatement(Java8Parser.ForExpOverStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#forIniOverStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForIniOverStatement(Java8Parser.ForIniOverStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#forStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatement(Java8Parser.ForStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(Java8Parser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#whileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(Java8Parser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#catchClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatchClause(Java8Parser.CatchClauseContext ctx);
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
	 * Visit a parse tree produced by {@link Java8Parser#switchCaseStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchCaseStatement(Java8Parser.SwitchCaseStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#switchStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchStatement(Java8Parser.SwitchStatementContext ctx);
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
	 * Visit a parse tree produced by {@link Java8Parser#doStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoStatement(Java8Parser.DoStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#enhancedForStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnhancedForStatement(Java8Parser.EnhancedForStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#arrayAccessStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayAccessStatement(Java8Parser.ArrayAccessStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#arrayInitializerStartStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayInitializerStartStatement(Java8Parser.ArrayInitializerStartStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#infixExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInfixExpression(Java8Parser.InfixExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#instanceofExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstanceofExpression(Java8Parser.InstanceofExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#labeledStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabeledStatement(Java8Parser.LabeledStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#postfixExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostfixExpression(Java8Parser.PostfixExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#prefixExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrefixExpression(Java8Parser.PrefixExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(Java8Parser.ReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#castExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCastExpression(Java8Parser.CastExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#methodReference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodReference(Java8Parser.MethodReferenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#lambdaExpressionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaExpressionStatement(Java8Parser.LambdaExpressionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#lambdaParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaParameters(Java8Parser.LambdaParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#formalParameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameterList(Java8Parser.FormalParameterListContext ctx);
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
	 * Visit a parse tree produced by {@link Java8Parser#inferredFormalParameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInferredFormalParameterList(Java8Parser.InferredFormalParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#typeDeclarationStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeDeclarationStatement(Java8Parser.TypeDeclarationStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#leftParentheseStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeftParentheseStatement(Java8Parser.LeftParentheseStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#leftBraceStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeftBraceStatement(Java8Parser.LeftBraceStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#rightBraceStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRightBraceStatement(Java8Parser.RightBraceStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(Java8Parser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#referenceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReferenceType(Java8Parser.ReferenceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#numberLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberLiteral(Java8Parser.NumberLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#stringLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringLiteral(Java8Parser.StringLiteralContext ctx);
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
	 * Visit a parse tree produced by {@link Java8Parser#classOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassOrInterfaceType(Java8Parser.ClassOrInterfaceTypeContext ctx);
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
	 * Visit a parse tree produced by {@link Java8Parser#wildCard}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWildCard(Java8Parser.WildCardContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#wildcardBounds}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWildcardBounds(Java8Parser.WildcardBoundsContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#intersectionType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntersectionType(Java8Parser.IntersectionTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#unionType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnionType(Java8Parser.UnionTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(Java8Parser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#codeHole}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCodeHole(Java8Parser.CodeHoleContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#preExist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPreExist(Java8Parser.PreExistContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#endOfStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEndOfStatement(Java8Parser.EndOfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#fullEnd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFullEnd(Java8Parser.FullEndContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#endOfAStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEndOfAStatement(Java8Parser.EndOfAStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#partialEnd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartialEnd(Java8Parser.PartialEndContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#onePartialEnd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOnePartialEnd(Java8Parser.OnePartialEndContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#endOfAPartialStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEndOfAPartialStatement(Java8Parser.EndOfAPartialStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#endOfArrayDeclarationIndexExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEndOfArrayDeclarationIndexExpression(Java8Parser.EndOfArrayDeclarationIndexExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#rightParenthese}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRightParenthese(Java8Parser.RightParentheseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#integerLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerLiteral(Java8Parser.IntegerLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#floatingPointLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatingPointLiteral(Java8Parser.FloatingPointLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#booleanLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanLiteral(Java8Parser.BooleanLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#characterLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharacterLiteral(Java8Parser.CharacterLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#nullLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNullLiteral(Java8Parser.NullLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#unaryOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryOperator(Java8Parser.UnaryOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#binaryOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryOperator(Java8Parser.BinaryOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#assignmentOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentOperator(Java8Parser.AssignmentOperatorContext ctx);
}