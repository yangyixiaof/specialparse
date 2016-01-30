package AeroSpikeHandle;

import SJ8Parse.Java8BaseVisitor;
import SJ8Parse.Java8Parser;
import SJ8Parse.Java8Parser.ArgumentListContext;
import SJ8Parse.Java8Parser.ArrayAccessStatementContext;
import SJ8Parse.Java8Parser.ArrayInitializerStartStatementContext;
import SJ8Parse.Java8Parser.ArrayTypeContext;
import SJ8Parse.Java8Parser.AssignmentContext;
import SJ8Parse.Java8Parser.AssignmentOperatorContext;
import SJ8Parse.Java8Parser.BinaryOperatorContext;
import SJ8Parse.Java8Parser.BooleanLiteralContext;
import SJ8Parse.Java8Parser.BreakStatementContext;
import SJ8Parse.Java8Parser.CastExpressionContext;
import SJ8Parse.Java8Parser.CatchClauseContext;
import SJ8Parse.Java8Parser.CharacterLiteralContext;
import SJ8Parse.Java8Parser.ClassOrInterfaceTypeContext;
import SJ8Parse.Java8Parser.CodeHoleContext;
import SJ8Parse.Java8Parser.CondExpBeginStatementContext;
import SJ8Parse.Java8Parser.CondExpColonMarkStatementContext;
import SJ8Parse.Java8Parser.CondExpQuestionMarkStatementContext;
import SJ8Parse.Java8Parser.ContinueStatementContext;
import SJ8Parse.Java8Parser.DimsContext;
import SJ8Parse.Java8Parser.DoStatementContext;
import SJ8Parse.Java8Parser.EndOfAPartialStatementContext;
import SJ8Parse.Java8Parser.EndOfAStatementContext;
import SJ8Parse.Java8Parser.EndOfArrayDeclarationIndexExpressionContext;
import SJ8Parse.Java8Parser.EndOfStatementContext;
import SJ8Parse.Java8Parser.EnhancedForStatementContext;
import SJ8Parse.Java8Parser.ExpressionContext;
import SJ8Parse.Java8Parser.ExpressionStatementContext;
import SJ8Parse.Java8Parser.FieldAccessContext;
import SJ8Parse.Java8Parser.FloatingPointLiteralContext;
import SJ8Parse.Java8Parser.ForExpOverStatementContext;
import SJ8Parse.Java8Parser.ForIniOverStatementContext;
import SJ8Parse.Java8Parser.ForStatementContext;
import SJ8Parse.Java8Parser.ForUpdOverStatementContext;
import SJ8Parse.Java8Parser.FormalParameterContext;
import SJ8Parse.Java8Parser.FormalParameterListContext;
import SJ8Parse.Java8Parser.FormalParametersContext;
import SJ8Parse.Java8Parser.FullEndContext;
import SJ8Parse.Java8Parser.IdentifierContext;
import SJ8Parse.Java8Parser.IfStatementContext;
import SJ8Parse.Java8Parser.InferredFormalParameterListContext;
import SJ8Parse.Java8Parser.InfixExpressionContext;
import SJ8Parse.Java8Parser.InstanceofExpressionContext;
import SJ8Parse.Java8Parser.IntegerLiteralContext;
import SJ8Parse.Java8Parser.IntersectionTypeContext;
import SJ8Parse.Java8Parser.LabeledStatementContext;
import SJ8Parse.Java8Parser.LambdaExpressionStatementContext;
import SJ8Parse.Java8Parser.LambdaParametersContext;
import SJ8Parse.Java8Parser.LeftBraceStatementContext;
import SJ8Parse.Java8Parser.LeftParentheseStatementContext;
import SJ8Parse.Java8Parser.LiteralContext;
import SJ8Parse.Java8Parser.MethodDeclarationContext;
import SJ8Parse.Java8Parser.MethodInvocationContext;
import SJ8Parse.Java8Parser.MethodReferenceContext;
import SJ8Parse.Java8Parser.NullLiteralContext;
import SJ8Parse.Java8Parser.NumberLiteralContext;
import SJ8Parse.Java8Parser.OnePartialEndContext;
import SJ8Parse.Java8Parser.PartialEndContext;
import SJ8Parse.Java8Parser.PostfixExpressionContext;
import SJ8Parse.Java8Parser.PreExistContext;
import SJ8Parse.Java8Parser.PrefixExpressionContext;
import SJ8Parse.Java8Parser.PrimitiveTypeContext;
import SJ8Parse.Java8Parser.ReferedExpressionContext;
import SJ8Parse.Java8Parser.ReferenceTypeContext;
import SJ8Parse.Java8Parser.ReturnStatementContext;
import SJ8Parse.Java8Parser.RightBraceStatementContext;
import SJ8Parse.Java8Parser.RightParentheseContext;
import SJ8Parse.Java8Parser.StatementContext;
import SJ8Parse.Java8Parser.StringLiteralContext;
import SJ8Parse.Java8Parser.SwitchCaseStatementContext;
import SJ8Parse.Java8Parser.SwitchStatementContext;
import SJ8Parse.Java8Parser.SynchronizedStatementContext;
import SJ8Parse.Java8Parser.ThrowStatementContext;
import SJ8Parse.Java8Parser.TypeArgumentContext;
import SJ8Parse.Java8Parser.TypeArgumentListContext;
import SJ8Parse.Java8Parser.TypeArgumentsContext;
import SJ8Parse.Java8Parser.TypeContext;
import SJ8Parse.Java8Parser.TypeDeclarationStatementContext;
import SJ8Parse.Java8Parser.TypeListContext;
import SJ8Parse.Java8Parser.UnaryOperatorContext;
import SJ8Parse.Java8Parser.UnionTypeContext;
import SJ8Parse.Java8Parser.VariableDeclarationTypeStatementContext;
import SJ8Parse.Java8Parser.WhileStatementContext;
import SJ8Parse.Java8Parser.WildCardContext;
import SJ8Parse.Java8Parser.WildcardBoundsContext;

public class AeroSpikeJava8Visitor extends Java8BaseVisitor<Integer> {
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