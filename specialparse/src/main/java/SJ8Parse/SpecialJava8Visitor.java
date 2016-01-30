package SJ8Parse;

public class SpecialJava8Visitor extends Java8BaseVisitor<Integer> {
	@Override
	public Integer visitStatement(Java8Parser.StatementContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public Integer visitExpressionStatement(Java8Parser.ExpressionStatementContext ctx) {
		return visitChildren(ctx);
	}
	
	@Override
	public Integer visitExpression(Java8Parser.ExpressionContext ctx) {
		return visitChildren(ctx);
	}
	
	@Override
	public Integer visitReferedExpression(Java8Parser.ReferedExpressionContext ctx) {
		return visitChildren(ctx);
	}

	
	@Override
	public Integer visitAssignment(Java8Parser.AssignmentContext ctx) {
		return visitChildren(ctx);
	}

	
	@Override
	public Integer visitMethodInvocation(Java8Parser.MethodInvocationContext ctx) {
		return visitChildren(ctx);
	}

	
	@Override
	public Integer visitArgumentList(Java8Parser.ArgumentListContext ctx) {
		return visitChildren(ctx);
	}

	
	@Override
	public Integer visitMethodDeclaration(Java8Parser.MethodDeclarationContext ctx) {
		return visitChildren(ctx);
	}

	
	@Override
	public Integer visitTypeList(Java8Parser.TypeListContext ctx) {
		return visitChildren(ctx);
	}

	
	@Override
	public Integer visitFieldAccess(Java8Parser.FieldAccessContext ctx) {
		return visitChildren(ctx);
	}

	
	@Override
	public Integer visitCondExpColonMarkStatement(Java8Parser.CondExpColonMarkStatementContext ctx) {
		return visitChildren(ctx);
	}

	
	@Override
	public Integer visitCondExpQuestionMarkStatement(Java8Parser.CondExpQuestionMarkStatementContext ctx) {
		return visitChildren(ctx);
	}

	
	@Override
	public Integer visitCondExpBeginStatement(Java8Parser.CondExpBeginStatementContext ctx) {
		return visitChildren(ctx);
	}

	
	@Override
	public Integer visitVariableDeclarationTypeStatement(Java8Parser.VariableDeclarationTypeStatementContext ctx) {
		return visitChildren(ctx);
	}

	
	@Override
	public Integer visitForUpdOverStatement(Java8Parser.ForUpdOverStatementContext ctx) {
		return visitChildren(ctx);
	}

	
	@Override
	public Integer visitForExpOverStatement(Java8Parser.ForExpOverStatementContext ctx) {
		return visitChildren(ctx);
	}

	
	@Override
	public Integer visitForIniOverStatement(Java8Parser.ForIniOverStatementContext ctx) {
		return visitChildren(ctx);
	}

	
	@Override
	public Integer visitForStatement(Java8Parser.ForStatementContext ctx) {
		return visitChildren(ctx);
	}

	
	@Override
	public Integer visitIfStatement(Java8Parser.IfStatementContext ctx) {
		return visitChildren(ctx);
	}

	
	@Override
	public Integer visitWhileStatement(Java8Parser.WhileStatementContext ctx) {
		return visitChildren(ctx);
	}

	
	@Override
	public Integer visitCatchClause(Java8Parser.CatchClauseContext ctx) {
		return visitChildren(ctx);
	}

	
	@Override
	public Integer visitThrowStatement(Java8Parser.ThrowStatementContext ctx) {
		return visitChildren(ctx);
	}

	
	@Override
	public Integer visitSynchronizedStatement(Java8Parser.SynchronizedStatementContext ctx) {
		return visitChildren(ctx);
	}

	
	@Override
	public Integer visitSwitchCaseStatement(Java8Parser.SwitchCaseStatementContext ctx) {
		return visitChildren(ctx);
	}

	
	@Override
	public Integer visitSwitchStatement(Java8Parser.SwitchStatementContext ctx) {
		return visitChildren(ctx);
	}

	
	@Override
	public Integer visitBreakStatement(Java8Parser.BreakStatementContext ctx) {
		return visitChildren(ctx);
	}

	
	@Override
	public Integer visitContinueStatement(Java8Parser.ContinueStatementContext ctx) {
		return visitChildren(ctx);
	}

	
	@Override
	public Integer visitDoStatement(Java8Parser.DoStatementContext ctx) {
		return visitChildren(ctx);
	}

	
	@Override
	public Integer visitEnhancedForStatement(Java8Parser.EnhancedForStatementContext ctx) {
		return visitChildren(ctx);
	}

	
	@Override
	public Integer visitArrayAccessStatement(Java8Parser.ArrayAccessStatementContext ctx) {
		return visitChildren(ctx);
	}

	
	@Override
	public Integer visitArrayInitializerStartStatement(Java8Parser.ArrayInitializerStartStatementContext ctx) {
		return visitChildren(ctx);
	}

	
	@Override
	public Integer visitInfixExpression(Java8Parser.InfixExpressionContext ctx) {
		return visitChildren(ctx);
	}

	
	@Override
	public Integer visitInstanceofExpression(Java8Parser.InstanceofExpressionContext ctx) {
		return visitChildren(ctx);
	}

	
	@Override
	public Integer visitLabeledStatement(Java8Parser.LabeledStatementContext ctx) {
		return visitChildren(ctx);
	}

	
	@Override
	public Integer visitPostfixExpression(Java8Parser.PostfixExpressionContext ctx) {
		return visitChildren(ctx);
	}

	
	@Override
	public Integer visitPrefixExpression(Java8Parser.PrefixExpressionContext ctx) {
		return visitChildren(ctx);
	}

	
	@Override
	public Integer visitReturnStatement(Java8Parser.ReturnStatementContext ctx) {
		return visitChildren(ctx);
	}

	
	@Override
	public Integer visitCastExpression(Java8Parser.CastExpressionContext ctx) {
		return visitChildren(ctx);
	}

	
	@Override
	public Integer visitMethodReference(Java8Parser.MethodReferenceContext ctx) {
		return visitChildren(ctx);
	}

	
	@Override
	public Integer visitLambdaExpressionStatement(Java8Parser.LambdaExpressionStatementContext ctx) {
		return visitChildren(ctx);
	}

	
	@Override
	public Integer visitLambdaParameters(Java8Parser.LambdaParametersContext ctx) {
		return visitChildren(ctx);
	}

	
	@Override
	public Integer visitFormalParameterList(Java8Parser.FormalParameterListContext ctx) {
		return visitChildren(ctx);
	}

	
	@Override
	public Integer visitFormalParameters(Java8Parser.FormalParametersContext ctx) {
		return visitChildren(ctx);
	}

	
	@Override
	public Integer visitFormalParameter(Java8Parser.FormalParameterContext ctx) {
		return visitChildren(ctx);
	}

	
	@Override
	public Integer visitInferredFormalParameterList(Java8Parser.InferredFormalParameterListContext ctx) {
		return visitChildren(ctx);
	}

	
	@Override
	public Integer visitTypeDeclarationStatement(Java8Parser.TypeDeclarationStatementContext ctx) {
		return visitChildren(ctx);
	}

	
	@Override
	public Integer visitLeftParentheseStatement(Java8Parser.LeftParentheseStatementContext ctx) {
		return visitChildren(ctx);
	}

	
	@Override
	public Integer visitLeftBraceStatement(Java8Parser.LeftBraceStatementContext ctx) {
		return visitChildren(ctx);
	}

	
	@Override
	public Integer visitRightBraceStatement(Java8Parser.RightBraceStatementContext ctx) {
		return visitChildren(ctx);
	}

	
	@Override
	public Integer visitLiteral(Java8Parser.LiteralContext ctx) {
		return visitChildren(ctx);
	}

	
	@Override
	public Integer visitReferenceType(Java8Parser.ReferenceTypeContext ctx) {
		return visitChildren(ctx);
	}

	
	@Override
	public Integer visitNumberLiteral(Java8Parser.NumberLiteralContext ctx) {
		return visitChildren(ctx);
	}

	
	@Override
	public Integer visitStringLiteral(Java8Parser.StringLiteralContext ctx) {
		return visitChildren(ctx);
	}

	
	@Override
	public Integer visitType(Java8Parser.TypeContext ctx) {
		return visitChildren(ctx);
	}

	
	@Override
	public Integer visitPrimitiveType(Java8Parser.PrimitiveTypeContext ctx) {
		return visitChildren(ctx);
	}

	
	@Override
	public Integer visitClassOrInterfaceType(Java8Parser.ClassOrInterfaceTypeContext ctx) {
		return visitChildren(ctx);
	}

	
	@Override
	public Integer visitArrayType(Java8Parser.ArrayTypeContext ctx) {
		return visitChildren(ctx);
	}

	
	@Override
	public Integer visitDims(Java8Parser.DimsContext ctx) {
		return visitChildren(ctx);
	}

	
	@Override
	public Integer visitTypeArguments(Java8Parser.TypeArgumentsContext ctx) {
		return visitChildren(ctx);
	}

	
	@Override
	public Integer visitTypeArgumentList(Java8Parser.TypeArgumentListContext ctx) {
		return visitChildren(ctx);
	}

	
	@Override
	public Integer visitTypeArgument(Java8Parser.TypeArgumentContext ctx) {
		return visitChildren(ctx);
	}

	
	@Override
	public Integer visitWildCard(Java8Parser.WildCardContext ctx) {
		return visitChildren(ctx);
	}

	
	@Override
	public Integer visitWildcardBounds(Java8Parser.WildcardBoundsContext ctx) {
		return visitChildren(ctx);
	}

	
	@Override
	public Integer visitIntersectionType(Java8Parser.IntersectionTypeContext ctx) {
		return visitChildren(ctx);
	}

	
	@Override
	public Integer visitUnionType(Java8Parser.UnionTypeContext ctx) {
		return visitChildren(ctx);
	}

	
	@Override
	public Integer visitIdentifier(Java8Parser.IdentifierContext ctx) {
		return visitChildren(ctx);
	}

	
	@Override
	public Integer visitCodeHole(Java8Parser.CodeHoleContext ctx) {
		return visitChildren(ctx);
	}

	
	@Override
	public Integer visitPreExist(Java8Parser.PreExistContext ctx) {
		return visitChildren(ctx);
	}

	
	@Override
	public Integer visitEndOfStatement(Java8Parser.EndOfStatementContext ctx) {
		return visitChildren(ctx);
	}

	
	@Override
	public Integer visitFullEnd(Java8Parser.FullEndContext ctx) {
		return visitChildren(ctx);
	}

	
	@Override
	public Integer visitEndOfAStatement(Java8Parser.EndOfAStatementContext ctx) {
		return visitChildren(ctx);
	}

	
	@Override
	public Integer visitPartialEnd(Java8Parser.PartialEndContext ctx) {
		return visitChildren(ctx);
	}

	
	@Override
	public Integer visitOnePartialEnd(Java8Parser.OnePartialEndContext ctx) {
		return visitChildren(ctx);
	}

	
	@Override
	public Integer visitEndOfAPartialStatement(Java8Parser.EndOfAPartialStatementContext ctx) {
		return visitChildren(ctx);
	}

	
	@Override
	public Integer visitEndOfArrayDeclarationIndexExpression(
			Java8Parser.EndOfArrayDeclarationIndexExpressionContext ctx) {
		return visitChildren(ctx);
	}

	
	@Override
	public Integer visitRightParenthese(Java8Parser.RightParentheseContext ctx) {
		return visitChildren(ctx);
	}

	
	@Override
	public Integer visitIntegerLiteral(Java8Parser.IntegerLiteralContext ctx) {
		return visitChildren(ctx);
	}

	
	@Override
	public Integer visitFloatingPointLiteral(Java8Parser.FloatingPointLiteralContext ctx) {
		return visitChildren(ctx);
	}

	
	@Override
	public Integer visitBooleanLiteral(Java8Parser.BooleanLiteralContext ctx) {
		return visitChildren(ctx);
	}

	
	@Override
	public Integer visitCharacterLiteral(Java8Parser.CharacterLiteralContext ctx) {
		return visitChildren(ctx);
	}

	
	@Override
	public Integer visitNullLiteral(Java8Parser.NullLiteralContext ctx) {
		return visitChildren(ctx);
	}

	
	@Override
	public Integer visitUnaryOperator(Java8Parser.UnaryOperatorContext ctx) {
		return visitChildren(ctx);
	}

	
	@Override
	public Integer visitBinaryOperator(Java8Parser.BinaryOperatorContext ctx) {
		return visitChildren(ctx);
	}
	
	@Override
	public Integer visitAssignmentOperator(Java8Parser.AssignmentOperatorContext ctx) {
		return visitChildren(ctx);
	}
}