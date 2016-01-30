// Generated from Java8.g4 by ANTLR 4.5.1
package SJ8Parse;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link Java8Parser}.
 */
public interface Java8Listener extends ParseTreeListener {
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
	 * Enter a parse tree produced by {@link Java8Parser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionStatement(Java8Parser.ExpressionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionStatement(Java8Parser.ExpressionStatementContext ctx);
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
	 * Enter a parse tree produced by {@link Java8Parser#referedExpression}.
	 * @param ctx the parse tree
	 */
	void enterReferedExpression(Java8Parser.ReferedExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#referedExpression}.
	 * @param ctx the parse tree
	 */
	void exitReferedExpression(Java8Parser.ReferedExpressionContext ctx);
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
	 * Enter a parse tree produced by {@link Java8Parser#typeList}.
	 * @param ctx the parse tree
	 */
	void enterTypeList(Java8Parser.TypeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#typeList}.
	 * @param ctx the parse tree
	 */
	void exitTypeList(Java8Parser.TypeListContext ctx);
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
	 * Enter a parse tree produced by {@link Java8Parser#condExpColonMarkStatement}.
	 * @param ctx the parse tree
	 */
	void enterCondExpColonMarkStatement(Java8Parser.CondExpColonMarkStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#condExpColonMarkStatement}.
	 * @param ctx the parse tree
	 */
	void exitCondExpColonMarkStatement(Java8Parser.CondExpColonMarkStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#condExpQuestionMarkStatement}.
	 * @param ctx the parse tree
	 */
	void enterCondExpQuestionMarkStatement(Java8Parser.CondExpQuestionMarkStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#condExpQuestionMarkStatement}.
	 * @param ctx the parse tree
	 */
	void exitCondExpQuestionMarkStatement(Java8Parser.CondExpQuestionMarkStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#condExpBeginStatement}.
	 * @param ctx the parse tree
	 */
	void enterCondExpBeginStatement(Java8Parser.CondExpBeginStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#condExpBeginStatement}.
	 * @param ctx the parse tree
	 */
	void exitCondExpBeginStatement(Java8Parser.CondExpBeginStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#variableDeclarationTypeStatement}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarationTypeStatement(Java8Parser.VariableDeclarationTypeStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#variableDeclarationTypeStatement}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarationTypeStatement(Java8Parser.VariableDeclarationTypeStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#forUpdOverStatement}.
	 * @param ctx the parse tree
	 */
	void enterForUpdOverStatement(Java8Parser.ForUpdOverStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#forUpdOverStatement}.
	 * @param ctx the parse tree
	 */
	void exitForUpdOverStatement(Java8Parser.ForUpdOverStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#forExpOverStatement}.
	 * @param ctx the parse tree
	 */
	void enterForExpOverStatement(Java8Parser.ForExpOverStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#forExpOverStatement}.
	 * @param ctx the parse tree
	 */
	void exitForExpOverStatement(Java8Parser.ForExpOverStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#forIniOverStatement}.
	 * @param ctx the parse tree
	 */
	void enterForIniOverStatement(Java8Parser.ForIniOverStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#forIniOverStatement}.
	 * @param ctx the parse tree
	 */
	void exitForIniOverStatement(Java8Parser.ForIniOverStatementContext ctx);
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
	 * Enter a parse tree produced by {@link Java8Parser#switchCaseStatement}.
	 * @param ctx the parse tree
	 */
	void enterSwitchCaseStatement(Java8Parser.SwitchCaseStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#switchCaseStatement}.
	 * @param ctx the parse tree
	 */
	void exitSwitchCaseStatement(Java8Parser.SwitchCaseStatementContext ctx);
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
	 * Enter a parse tree produced by {@link Java8Parser#enhancedForStatement}.
	 * @param ctx the parse tree
	 */
	void enterEnhancedForStatement(Java8Parser.EnhancedForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#enhancedForStatement}.
	 * @param ctx the parse tree
	 */
	void exitEnhancedForStatement(Java8Parser.EnhancedForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#arrayAccessStatement}.
	 * @param ctx the parse tree
	 */
	void enterArrayAccessStatement(Java8Parser.ArrayAccessStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#arrayAccessStatement}.
	 * @param ctx the parse tree
	 */
	void exitArrayAccessStatement(Java8Parser.ArrayAccessStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#arrayInitializerStartStatement}.
	 * @param ctx the parse tree
	 */
	void enterArrayInitializerStartStatement(Java8Parser.ArrayInitializerStartStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#arrayInitializerStartStatement}.
	 * @param ctx the parse tree
	 */
	void exitArrayInitializerStartStatement(Java8Parser.ArrayInitializerStartStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#infixExpression}.
	 * @param ctx the parse tree
	 */
	void enterInfixExpression(Java8Parser.InfixExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#infixExpression}.
	 * @param ctx the parse tree
	 */
	void exitInfixExpression(Java8Parser.InfixExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#instanceofExpression}.
	 * @param ctx the parse tree
	 */
	void enterInstanceofExpression(Java8Parser.InstanceofExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#instanceofExpression}.
	 * @param ctx the parse tree
	 */
	void exitInstanceofExpression(Java8Parser.InstanceofExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#labeledStatement}.
	 * @param ctx the parse tree
	 */
	void enterLabeledStatement(Java8Parser.LabeledStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#labeledStatement}.
	 * @param ctx the parse tree
	 */
	void exitLabeledStatement(Java8Parser.LabeledStatementContext ctx);
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
	 * Enter a parse tree produced by {@link Java8Parser#prefixExpression}.
	 * @param ctx the parse tree
	 */
	void enterPrefixExpression(Java8Parser.PrefixExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#prefixExpression}.
	 * @param ctx the parse tree
	 */
	void exitPrefixExpression(Java8Parser.PrefixExpressionContext ctx);
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
	 * Enter a parse tree produced by {@link Java8Parser#lambdaExpressionStatement}.
	 * @param ctx the parse tree
	 */
	void enterLambdaExpressionStatement(Java8Parser.LambdaExpressionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#lambdaExpressionStatement}.
	 * @param ctx the parse tree
	 */
	void exitLambdaExpressionStatement(Java8Parser.LambdaExpressionStatementContext ctx);
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
	 * Enter a parse tree produced by {@link Java8Parser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameterList(Java8Parser.FormalParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameterList(Java8Parser.FormalParameterListContext ctx);
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
	 * Enter a parse tree produced by {@link Java8Parser#inferredFormalParameterList}.
	 * @param ctx the parse tree
	 */
	void enterInferredFormalParameterList(Java8Parser.InferredFormalParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#inferredFormalParameterList}.
	 * @param ctx the parse tree
	 */
	void exitInferredFormalParameterList(Java8Parser.InferredFormalParameterListContext ctx);
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
	 * Enter a parse tree produced by {@link Java8Parser#leftParentheseStatement}.
	 * @param ctx the parse tree
	 */
	void enterLeftParentheseStatement(Java8Parser.LeftParentheseStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#leftParentheseStatement}.
	 * @param ctx the parse tree
	 */
	void exitLeftParentheseStatement(Java8Parser.LeftParentheseStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#leftBraceStatement}.
	 * @param ctx the parse tree
	 */
	void enterLeftBraceStatement(Java8Parser.LeftBraceStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#leftBraceStatement}.
	 * @param ctx the parse tree
	 */
	void exitLeftBraceStatement(Java8Parser.LeftBraceStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#rightBraceStatement}.
	 * @param ctx the parse tree
	 */
	void enterRightBraceStatement(Java8Parser.RightBraceStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#rightBraceStatement}.
	 * @param ctx the parse tree
	 */
	void exitRightBraceStatement(Java8Parser.RightBraceStatementContext ctx);
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
	 * Enter a parse tree produced by {@link Java8Parser#numberLiteral}.
	 * @param ctx the parse tree
	 */
	void enterNumberLiteral(Java8Parser.NumberLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#numberLiteral}.
	 * @param ctx the parse tree
	 */
	void exitNumberLiteral(Java8Parser.NumberLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#stringLiteral}.
	 * @param ctx the parse tree
	 */
	void enterStringLiteral(Java8Parser.StringLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#stringLiteral}.
	 * @param ctx the parse tree
	 */
	void exitStringLiteral(Java8Parser.StringLiteralContext ctx);
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
	 * Enter a parse tree produced by {@link Java8Parser#wildCard}.
	 * @param ctx the parse tree
	 */
	void enterWildCard(Java8Parser.WildCardContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#wildCard}.
	 * @param ctx the parse tree
	 */
	void exitWildCard(Java8Parser.WildCardContext ctx);
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
	 * Enter a parse tree produced by {@link Java8Parser#intersectionType}.
	 * @param ctx the parse tree
	 */
	void enterIntersectionType(Java8Parser.IntersectionTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#intersectionType}.
	 * @param ctx the parse tree
	 */
	void exitIntersectionType(Java8Parser.IntersectionTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#unionType}.
	 * @param ctx the parse tree
	 */
	void enterUnionType(Java8Parser.UnionTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#unionType}.
	 * @param ctx the parse tree
	 */
	void exitUnionType(Java8Parser.UnionTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(Java8Parser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(Java8Parser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#codeHole}.
	 * @param ctx the parse tree
	 */
	void enterCodeHole(Java8Parser.CodeHoleContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#codeHole}.
	 * @param ctx the parse tree
	 */
	void exitCodeHole(Java8Parser.CodeHoleContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#preExist}.
	 * @param ctx the parse tree
	 */
	void enterPreExist(Java8Parser.PreExistContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#preExist}.
	 * @param ctx the parse tree
	 */
	void exitPreExist(Java8Parser.PreExistContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#endOfStatement}.
	 * @param ctx the parse tree
	 */
	void enterEndOfStatement(Java8Parser.EndOfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#endOfStatement}.
	 * @param ctx the parse tree
	 */
	void exitEndOfStatement(Java8Parser.EndOfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#fullEnd}.
	 * @param ctx the parse tree
	 */
	void enterFullEnd(Java8Parser.FullEndContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#fullEnd}.
	 * @param ctx the parse tree
	 */
	void exitFullEnd(Java8Parser.FullEndContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#endOfAStatement}.
	 * @param ctx the parse tree
	 */
	void enterEndOfAStatement(Java8Parser.EndOfAStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#endOfAStatement}.
	 * @param ctx the parse tree
	 */
	void exitEndOfAStatement(Java8Parser.EndOfAStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#partialEnd}.
	 * @param ctx the parse tree
	 */
	void enterPartialEnd(Java8Parser.PartialEndContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#partialEnd}.
	 * @param ctx the parse tree
	 */
	void exitPartialEnd(Java8Parser.PartialEndContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#onePartialEnd}.
	 * @param ctx the parse tree
	 */
	void enterOnePartialEnd(Java8Parser.OnePartialEndContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#onePartialEnd}.
	 * @param ctx the parse tree
	 */
	void exitOnePartialEnd(Java8Parser.OnePartialEndContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#endOfAPartialStatement}.
	 * @param ctx the parse tree
	 */
	void enterEndOfAPartialStatement(Java8Parser.EndOfAPartialStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#endOfAPartialStatement}.
	 * @param ctx the parse tree
	 */
	void exitEndOfAPartialStatement(Java8Parser.EndOfAPartialStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#endOfArrayDeclarationIndexExpression}.
	 * @param ctx the parse tree
	 */
	void enterEndOfArrayDeclarationIndexExpression(Java8Parser.EndOfArrayDeclarationIndexExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#endOfArrayDeclarationIndexExpression}.
	 * @param ctx the parse tree
	 */
	void exitEndOfArrayDeclarationIndexExpression(Java8Parser.EndOfArrayDeclarationIndexExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#rightParenthese}.
	 * @param ctx the parse tree
	 */
	void enterRightParenthese(Java8Parser.RightParentheseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#rightParenthese}.
	 * @param ctx the parse tree
	 */
	void exitRightParenthese(Java8Parser.RightParentheseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#integerLiteral}.
	 * @param ctx the parse tree
	 */
	void enterIntegerLiteral(Java8Parser.IntegerLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#integerLiteral}.
	 * @param ctx the parse tree
	 */
	void exitIntegerLiteral(Java8Parser.IntegerLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#floatingPointLiteral}.
	 * @param ctx the parse tree
	 */
	void enterFloatingPointLiteral(Java8Parser.FloatingPointLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#floatingPointLiteral}.
	 * @param ctx the parse tree
	 */
	void exitFloatingPointLiteral(Java8Parser.FloatingPointLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#booleanLiteral}.
	 * @param ctx the parse tree
	 */
	void enterBooleanLiteral(Java8Parser.BooleanLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#booleanLiteral}.
	 * @param ctx the parse tree
	 */
	void exitBooleanLiteral(Java8Parser.BooleanLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#characterLiteral}.
	 * @param ctx the parse tree
	 */
	void enterCharacterLiteral(Java8Parser.CharacterLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#characterLiteral}.
	 * @param ctx the parse tree
	 */
	void exitCharacterLiteral(Java8Parser.CharacterLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#nullLiteral}.
	 * @param ctx the parse tree
	 */
	void enterNullLiteral(Java8Parser.NullLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#nullLiteral}.
	 * @param ctx the parse tree
	 */
	void exitNullLiteral(Java8Parser.NullLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#unaryOperator}.
	 * @param ctx the parse tree
	 */
	void enterUnaryOperator(Java8Parser.UnaryOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#unaryOperator}.
	 * @param ctx the parse tree
	 */
	void exitUnaryOperator(Java8Parser.UnaryOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#binaryOperator}.
	 * @param ctx the parse tree
	 */
	void enterBinaryOperator(Java8Parser.BinaryOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#binaryOperator}.
	 * @param ctx the parse tree
	 */
	void exitBinaryOperator(Java8Parser.BinaryOperatorContext ctx);
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
}