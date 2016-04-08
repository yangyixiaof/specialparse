package cn.yyx.parse.specialparse;

import SJ8Parse.Java8BaseVisitor;
import SJ8Parse.Java8Parser;
import SJ8Parse.Java8Parser.ArgTypeListContext;
import SJ8Parse.Java8Parser.ArrayInitializerEndStatementContext;
import SJ8Parse.Java8Parser.ArrayInitializerSplitCommaStatementContext;
import SJ8Parse.Java8Parser.CommonClassMemberInvokeContext;
import SJ8Parse.Java8Parser.FirstArgContext;
import SJ8Parse.Java8Parser.FirstArgPreExistContext;
import SJ8Parse.Java8Parser.FirstArgReferedExpressionContext;
import SJ8Parse.Java8Parser.MethodArgPreExistContext;
import SJ8Parse.Java8Parser.MethodArgReferedExpressionContext;
import SJ8Parse.Java8Parser.NewClassInvokeContext;
import SJ8Parse.Java8Parser.SelfClassMemberInvokeContext;
import SJ8Parse.Java8Parser.SuperClassMemberInvokeContext;
import SJ8Parse.Java8Parser.VirtualInferredTypeContext;

public class OneTestSentenceVisitor extends Java8BaseVisitor<Integer> {
	
	@Override
	public Integer visitStatement(Java8Parser.StatementContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public Integer visitExpressionStatement(Java8Parser.ExpressionStatementContext ctx) {
		
		return visitChildren(ctx);
	}

	@Override
	public Integer visitAssignmentStatement(Java8Parser.AssignmentStatementContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public Integer visitLiteralStatement(Java8Parser.LiteralStatementContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public Integer visitCastExpressionStatement(Java8Parser.CastExpressionStatementContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public Integer visitMethodInvocationStatement(Java8Parser.MethodInvocationStatementContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public Integer visitFieldAccessStatement(Java8Parser.FieldAccessStatementContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public Integer visitFieldAccess(Java8Parser.FieldAccessContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public Integer visitInfixExpressionStatement(Java8Parser.InfixExpressionStatementContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public Integer visitInstanceofExpressionStatement(Java8Parser.InstanceofExpressionStatementContext ctx) {
		return visitChildren(ctx);
	}
	
	@Override
	public Integer visitMethodReferenceStatement(Java8Parser.MethodReferenceStatementContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public Integer visitNameStatement(Java8Parser.NameStatementContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public Integer visitPrefixExpressionStatement(Java8Parser.PrefixExpressionStatementContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public Integer visitPostfixExpressionStatement(Java8Parser.PostfixExpressionStatementContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public Integer visitReferedExpression(Java8Parser.ReferedExpressionContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public Integer visitAnonymousClassBeginStatement(Java8Parser.AnonymousClassBeginStatementContext ctx) {
		return visitChildren(ctx);
	}
	
	@Override
	public Integer visitAnonymousClassPlaceHolderStatement(Java8Parser.AnonymousClassPlaceHolderStatementContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public Integer visitAnonymousClassPreStatement(Java8Parser.AnonymousClassPreStatementContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public Integer visitAtInterfaceStatement(Java8Parser.AtInterfaceStatementContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public Integer visitAnnotationTypeMemberDeclarationStatement(
			Java8Parser.AnnotationTypeMemberDeclarationStatementContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public Integer visitClassDeclarationStatement(Java8Parser.ClassDeclarationStatementContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public Integer visitClassInnerDeclarationStatement(Java8Parser.ClassInnerDeclarationStatementContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public Integer visitEnumDeclarationStatement(Java8Parser.EnumDeclarationStatementContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public Integer visitMethodDeclarationStatement(Java8Parser.MethodDeclarationStatementContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public Integer visitEnumConstantDeclarationStatement(Java8Parser.EnumConstantDeclarationStatementContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public Integer visitLabeledStatement(Java8Parser.LabeledStatementContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public Integer visitVariableDeclarationStatement(Java8Parser.VariableDeclarationStatementContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public Integer visitLambdaExpressionStatement(Java8Parser.LambdaExpressionStatementContext ctx) {
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
	public Integer visitDoWhileStatement(Java8Parser.DoWhileStatementContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public Integer visitWhileStatement(Java8Parser.WhileStatementContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public Integer visitReturnStatement(Java8Parser.ReturnStatementContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public Integer visitSwitchStatement(Java8Parser.SwitchStatementContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public Integer visitSwitchCaseStatement(Java8Parser.SwitchCaseStatementContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public Integer visitDefaultStatement(Java8Parser.DefaultStatementContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public Integer visitSynchronizedStatement(Java8Parser.SynchronizedStatementContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public Integer visitThrowStatement(Java8Parser.ThrowStatementContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public Integer visitCatchClauseStatement(Java8Parser.CatchClauseStatementContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public Integer visitIfStatement(Java8Parser.IfStatementContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public Integer visitArrayCreationStatement(Java8Parser.ArrayCreationStatementContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public Integer visitInitializerStatement(Java8Parser.InitializerStatementContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public Integer visitVariableDeclarationHolderStatement(Java8Parser.VariableDeclarationHolderStatementContext ctx) {
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
	public Integer visitPartialEndArrayAccessStatement(Java8Parser.PartialEndArrayAccessStatementContext ctx) {
		return visitChildren(ctx);
	}
	
	@Override
	public Integer visitLeftParentheseStatement(Java8Parser.LeftParentheseStatementContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public Integer visitRightParentheseStatement(Java8Parser.RightParentheseStatementContext ctx) {
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
	public Integer visitEnterMethodParamStatement(Java8Parser.EnterMethodParamStatementContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public Integer visitArrayInitializerStartStatement(Java8Parser.ArrayInitializerStartStatementContext ctx) {
		return visitChildren(ctx);
	}
	
	@Override
	public Integer visitArrayInitializerSplitCommaStatement(ArrayInitializerSplitCommaStatementContext ctx) {
		return visitChildren(ctx);
	}
	
	@Override
	public Integer visitArrayInitializerEndStatement(ArrayInitializerEndStatementContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public Integer visitForStatement(Java8Parser.ForStatementContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public Integer visitForIniOverStatement(Java8Parser.ForIniOverStatementContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public Integer visitForExpOverStatement(Java8Parser.ForExpOverStatementContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public Integer visitForUpdOverStatement(Java8Parser.ForUpdOverStatementContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public Integer visitCondExpBeginStatement(Java8Parser.CondExpBeginStatementContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public Integer visitCondExpQuestionMarkStatement(Java8Parser.CondExpQuestionMarkStatementContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public Integer visitCondExpColonMarkStatement(Java8Parser.CondExpColonMarkStatementContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public Integer visitPartialEndStatement(Java8Parser.PartialEndStatementContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public Integer visitFullEndStatement(Java8Parser.FullEndStatementContext ctx) {
		return visitChildren(ctx);
	}
	
	@Override
	public Integer visitPartialMethodArgumentEndStatement(Java8Parser.PartialMethodArgumentEndStatementContext ctx) {
		return visitChildren(ctx);
	}
	
	@Override
	public Integer visitPartialMethodPreRerferedExpressionEndStatement(
			Java8Parser.PartialMethodPreRerferedExpressionEndStatementContext ctx) {
		return visitChildren(ctx);
	}
	
	@Override
	public Integer visitFirstArgPreExist(FirstArgPreExistContext ctx) {
		return visitChildren(ctx);
	}
	
	@Override
	public Integer visitFirstArgReferedExpression(FirstArgReferedExpressionContext ctx) {
		return super.visitFirstArgReferedExpression(ctx);
	}
	
	@Override
	public Integer visitCommonClassMemberInvoke(CommonClassMemberInvokeContext ctx) {
		return super.visitCommonClassMemberInvoke(ctx);
	}
	
	@Override
	public Integer visitSelfClassMemberInvoke(SelfClassMemberInvokeContext ctx) {
		return super.visitSelfClassMemberInvoke(ctx);
	}

	@Override
	public Integer visitSuperClassMemberInvoke(SuperClassMemberInvokeContext ctx) {
		return super.visitSuperClassMemberInvoke(ctx);
	}

	@Override
	public Integer visitNewClassInvoke(NewClassInvokeContext ctx) {
		return super.visitNewClassInvoke(ctx);
	}
	
	@Override
	public Integer visitFirstArg(FirstArgContext ctx) {
		return super.visitFirstArg(ctx);
	}
	
	@Override
	public Integer visitMethodArgPreExist(MethodArgPreExistContext ctx) {
		return super.visitMethodArgPreExist(ctx);
	}
	
	@Override
	public Integer visitMethodArgReferedExpression(MethodArgReferedExpressionContext ctx) {
		return super.visitMethodArgReferedExpression(ctx);
	}
	
	@Override
	public Integer visitArgumentList(Java8Parser.ArgumentListContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public Integer visitTypeList(Java8Parser.TypeListContext ctx) {
		return visitChildren(ctx);
	}
	
	@Override
	public Integer visitArgTypeList(ArgTypeListContext ctx) {
		return super.visitArgTypeList(ctx);
	}

	@Override
	public Integer visitLiteral(Java8Parser.LiteralContext ctx) {
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
	public Integer visitVirtualInferredType(VirtualInferredTypeContext ctx) {
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
	public Integer visitWildCardType(Java8Parser.WildCardTypeContext ctx) {
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
	public Integer visitEndOfArrayDeclarationIndexExpression(
			Java8Parser.EndOfArrayDeclarationIndexExpressionContext ctx) {
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