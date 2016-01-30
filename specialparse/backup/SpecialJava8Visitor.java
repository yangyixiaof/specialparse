package SJ8Parse;

import org.antlr.v4.runtime.tree.ParseTree;

import SJ8Parse.Java8Parser.PreDecrementExpressionContext;
import SJ8Parse.Java8Parser.PreIncrementExpressionContext;
import SJ8Parse.Java8Parser.UnaryExpressionContext;
import SJ8Parse.Java8Parser.UnaryExpressionNotPlusMinusContext;

public class SpecialJava8Visitor extends Java8BaseVisitor<Integer> {

	@Override
	public Integer visitLiteral(Java8Parser.LiteralContext ctx) {
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
	public Integer visitNumericType(Java8Parser.NumericTypeContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public Integer visitIntegralType(Java8Parser.IntegralTypeContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public Integer visitFloatingPointType(Java8Parser.FloatingPointTypeContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public Integer visitReferenceType(Java8Parser.ReferenceTypeContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public Integer visitClassOrInterfaceType(Java8Parser.ClassOrInterfaceTypeContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public Integer visitClassType_lf_classOrInterfaceType(Java8Parser.ClassType_lf_classOrInterfaceTypeContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public Integer visitClassType_lfno_classOrInterfaceType(
			Java8Parser.ClassType_lfno_classOrInterfaceTypeContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public Integer visitInterfaceType_lf_classOrInterfaceType(
			Java8Parser.InterfaceType_lf_classOrInterfaceTypeContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public Integer visitInterfaceType_lfno_classOrInterfaceType(
			Java8Parser.InterfaceType_lfno_classOrInterfaceTypeContext ctx) {
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
	public Integer visitTypeParameter(Java8Parser.TypeParameterContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public Integer visitTypeBound(Java8Parser.TypeBoundContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public Integer visitAdditionalBound(Java8Parser.AdditionalBoundContext ctx) {
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
	public Integer visitWildcard(Java8Parser.WildcardContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public Integer visitWildcardBounds(Java8Parser.WildcardBoundsContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public Integer visitTypeName(Java8Parser.TypeNameContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public Integer visitPackageOrTypeName(Java8Parser.PackageOrTypeNameContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public Integer visitExpressionName(Java8Parser.ExpressionNameContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public Integer visitMethodName(Java8Parser.MethodNameContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public Integer visitAmbiguousName(Java8Parser.AmbiguousNameContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public Integer visitTypeDeclarationStatement(Java8Parser.TypeDeclarationStatementContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public Integer visitTypeParameters(Java8Parser.TypeParametersContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public Integer visitTypeParameterList(Java8Parser.TypeParameterListContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public Integer visitVariableDeclaratorList(Java8Parser.VariableDeclaratorListContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public Integer visitVariableDeclarator(Java8Parser.VariableDeclaratorContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public Integer visitVariableDeclaratorId(Java8Parser.VariableDeclaratorIdContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public Integer visitVariableInitializer(Java8Parser.VariableInitializerContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public Integer visitMethodDeclaration(Java8Parser.MethodDeclarationContext ctx) {
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
	public Integer visitReceiverParameter(Java8Parser.ReceiverParameterContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public Integer visitExceptionTypeList(Java8Parser.ExceptionTypeListContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public Integer visitExceptionType(Java8Parser.ExceptionTypeContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public Integer visitSimpleTypeName(Java8Parser.SimpleTypeNameContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public Integer visitExplicitConstructorInvocation(Java8Parser.ExplicitConstructorInvocationContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public Integer visitLocalVariableDeclarationStatement(Java8Parser.LocalVariableDeclarationStatementContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public Integer visitLocalVariableDeclaration(Java8Parser.LocalVariableDeclarationContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public Integer visitStatement(Java8Parser.StatementContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public Integer visitStatementWithoutTrailingSubstatement(
			Java8Parser.StatementWithoutTrailingSubstatementContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public Integer visitIfStatement(Java8Parser.IfStatementContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public Integer visitAssertStatement(Java8Parser.AssertStatementContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public Integer visitSwitchStatement(Java8Parser.SwitchStatementContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public Integer visitCaseStatement(Java8Parser.CaseStatementContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public Integer visitWhileStatement(Java8Parser.WhileStatementContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public Integer visitDoStatement(Java8Parser.DoStatementContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public Integer visitForStatement(Java8Parser.ForStatementContext ctx) {
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
	public Integer visitReturnStatement(Java8Parser.ReturnStatementContext ctx) {
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
	public Integer visitTryStatement(Java8Parser.TryStatementContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public Integer visitCatchClause(Java8Parser.CatchClauseContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public Integer visitCatchFormalParameter(Java8Parser.CatchFormalParameterContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public Integer visitCatchType(Java8Parser.CatchTypeContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public Integer visitResource(Java8Parser.ResourceContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public Integer visitPrimary(Java8Parser.PrimaryContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public Integer visitPrimaryNoNewArray(Java8Parser.PrimaryNoNewArrayContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public Integer visitPrimaryNoNewArray_lf_arrayAccess(Java8Parser.PrimaryNoNewArray_lf_arrayAccessContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public Integer visitPrimaryNoNewArray_lfno_arrayAccess(Java8Parser.PrimaryNoNewArray_lfno_arrayAccessContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public Integer visitPrimaryNoNewArray_lf_primary(Java8Parser.PrimaryNoNewArray_lf_primaryContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public Integer visitPrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary(
			Java8Parser.PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public Integer visitPrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary(
			Java8Parser.PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public Integer visitPrimaryNoNewArray_lfno_primary(Java8Parser.PrimaryNoNewArray_lfno_primaryContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public Integer visitPrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary(
			Java8Parser.PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public Integer visitPrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary(
			Java8Parser.PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public Integer visitClassInstanceCreationExpression(Java8Parser.ClassInstanceCreationExpressionContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public Integer visitClassInstanceCreationExpression_lf_primary(
			Java8Parser.ClassInstanceCreationExpression_lf_primaryContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public Integer visitClassInstanceCreationExpression_lfno_primary(
			Java8Parser.ClassInstanceCreationExpression_lfno_primaryContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public Integer visitTypeArgumentsOrDiamond(Java8Parser.TypeArgumentsOrDiamondContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public Integer visitFieldAccess(Java8Parser.FieldAccessContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public Integer visitFieldAccess_lf_primary(Java8Parser.FieldAccess_lf_primaryContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public Integer visitFieldAccess_lfno_primary(Java8Parser.FieldAccess_lfno_primaryContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public Integer visitArrayAccess(Java8Parser.ArrayAccessContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public Integer visitArrayAccess_lf_primary(Java8Parser.ArrayAccess_lf_primaryContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public Integer visitArrayAccess_lfno_primary(Java8Parser.ArrayAccess_lfno_primaryContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public Integer visitMethodInvocation(Java8Parser.MethodInvocationContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public Integer visitMethodInvocation_lf_primary(Java8Parser.MethodInvocation_lf_primaryContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public Integer visitMethodInvocation_lfno_primary(Java8Parser.MethodInvocation_lfno_primaryContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public Integer visitArgumentList(Java8Parser.ArgumentListContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public Integer visitMethodReference(Java8Parser.MethodReferenceContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public Integer visitMethodReference_lf_primary(Java8Parser.MethodReference_lf_primaryContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public Integer visitMethodReference_lfno_primary(Java8Parser.MethodReference_lfno_primaryContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public Integer visitArrayCreationExpression(Java8Parser.ArrayCreationExpressionContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public Integer visitArrayInitializer(Java8Parser.ArrayInitializerContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public Integer visitVariableInitializerList(Java8Parser.VariableInitializerListContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public Integer visitDimExprs(Java8Parser.DimExprsContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public Integer visitDimExpr(Java8Parser.DimExprContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public Integer visitConstantExpression(Java8Parser.ConstantExpressionContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public Integer visitExpression(Java8Parser.ExpressionContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public Integer visitLambdaExpression(Java8Parser.LambdaExpressionContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public Integer visitLambdaParameters(Java8Parser.LambdaParametersContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public Integer visitLambdaBody(Java8Parser.LambdaBodyContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public Integer visitAssignmentExpression(Java8Parser.AssignmentExpressionContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public Integer visitAssignment(Java8Parser.AssignmentContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public Integer visitLeftHandSide(Java8Parser.LeftHandSideContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public Integer visitAssignmentOperator(Java8Parser.AssignmentOperatorContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public Integer visitConditionalExpression(Java8Parser.ConditionalExpressionContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public Integer visitConditionalOrExpression(Java8Parser.ConditionalOrExpressionContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public Integer visitConditionalAndExpression(Java8Parser.ConditionalAndExpressionContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public Integer visitInclusiveOrExpression(Java8Parser.InclusiveOrExpressionContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public Integer visitExclusiveOrExpression(Java8Parser.ExclusiveOrExpressionContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public Integer visitAndExpression(Java8Parser.AndExpressionContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public Integer visitEqualityExpression(Java8Parser.EqualityExpressionContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public Integer visitRelationalExpression(Java8Parser.RelationalExpressionContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public Integer visitShiftExpression(Java8Parser.ShiftExpressionContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public Integer visitAdditiveExpression(Java8Parser.AdditiveExpressionContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public Integer visitMultiplicativeExpression(Java8Parser.MultiplicativeExpressionContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public Integer visitUnaryExpression(Java8Parser.UnaryExpressionContext ctx) {
		PreIncrementExpressionContext preIncrementExpression = ctx.preIncrementExpression();
		PreDecrementExpressionContext preDecrementExpression = ctx.preDecrementExpression();
		UnaryExpressionContext unaryExpression = ctx.unaryExpression();
		UnaryExpressionNotPlusMinusContext unaryExpressionNotPlusMinus = ctx.unaryExpressionNotPlusMinus();
		
		System.err.println("preIncrementExpression:" + (preIncrementExpression == null ? "null" : preIncrementExpression.getText()));
		System.err.println("preDecrementExpression:" + (preDecrementExpression == null ? "null" : preDecrementExpression.getText()));
		System.err.println("unaryExpression:" + (unaryExpression == null ? "null" : unaryExpression.getText()));
		System.err.println("unaryExpressionNotPlusMinus:" + (unaryExpressionNotPlusMinus == null ? "null" : unaryExpressionNotPlusMinus.getText()));
		
		if (ctx.getChildCount() > 1)
		{
			ParseTree chd = ctx.getChild(1);
			Object cc = chd.getPayload();
			System.err.println("child 2nd type:" + cc.getClass());
		}
		
		System.err.println("================= begin =================");
		int len = ctx.getChildCount();
		for (int i=0;i<len;i++)
		{
			System.err.println(ctx.getChild(i).getText());
		}
		System.err.println("================= end =================");
		return visitChildren(ctx);
	}

	@Override
	public Integer visitPreIncrementExpression(Java8Parser.PreIncrementExpressionContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public Integer visitPreDecrementExpression(Java8Parser.PreDecrementExpressionContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public Integer visitUnaryExpressionNotPlusMinus(Java8Parser.UnaryExpressionNotPlusMinusContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public Integer visitPostfixExpression(Java8Parser.PostfixExpressionContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public Integer visitPostIncrementExpression(Java8Parser.PostIncrementExpressionContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public Integer visitPostIncrementExpression_lf_postfixExpression(
			Java8Parser.PostIncrementExpression_lf_postfixExpressionContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public Integer visitPostDecrementExpression(Java8Parser.PostDecrementExpressionContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public Integer visitPostDecrementExpression_lf_postfixExpression(
			Java8Parser.PostDecrementExpression_lf_postfixExpressionContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public Integer visitCastExpression(Java8Parser.CastExpressionContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public Integer visitAdditionalBoundOrClassRef(Java8Parser.AdditionalBoundOrClassRefContext ctx) {
		return visitChildren(ctx);
	}

}