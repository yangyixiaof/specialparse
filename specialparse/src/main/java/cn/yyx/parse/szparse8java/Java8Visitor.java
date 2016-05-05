package cn.yyx.parse.szparse8java;

// Generated from Java8.g4 by ANTLR 4.5.2
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
	 * Visit a parse tree produced by {@link Java8Parser#assignAssignmentStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignAssignmentStatement(Java8Parser.AssignAssignmentStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#mulassignAssignmentStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulassignAssignmentStatement(Java8Parser.MulassignAssignmentStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#divassignAssignmentStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivassignAssignmentStatement(Java8Parser.DivassignAssignmentStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#modassignAssignmentStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModassignAssignmentStatement(Java8Parser.ModassignAssignmentStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#addassignAssignmentStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddassignAssignmentStatement(Java8Parser.AddassignAssignmentStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#subassignAssignmentStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubassignAssignmentStatement(Java8Parser.SubassignAssignmentStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#lshiftassignAssignmentStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLshiftassignAssignmentStatement(Java8Parser.LshiftassignAssignmentStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#rshiftassignAssignmentStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRshiftassignAssignmentStatement(Java8Parser.RshiftassignAssignmentStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#urshiftassignAssignmentStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUrshiftassignAssignmentStatement(Java8Parser.UrshiftassignAssignmentStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#andassignAssignmentStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndassignAssignmentStatement(Java8Parser.AndassignAssignmentStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#xorassignAssignmentStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXorassignAssignmentStatement(Java8Parser.XorassignAssignmentStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#orassignAssignmentStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrassignAssignmentStatement(Java8Parser.OrassignAssignmentStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#assignmentStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentStatement(Java8Parser.AssignmentStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#positiveLiteralStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPositiveLiteralStatement(Java8Parser.PositiveLiteralStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#negativeLiteralStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNegativeLiteralStatement(Java8Parser.NegativeLiteralStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#normalLiteralStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNormalLiteralStatement(Java8Parser.NormalLiteralStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#literalStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteralStatement(Java8Parser.LiteralStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#castExpressionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCastExpressionStatement(Java8Parser.CastExpressionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#commonMethodInvocationStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommonMethodInvocationStatement(Java8Parser.CommonMethodInvocationStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#superConstructionInvocationStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuperConstructionInvocationStatement(Java8Parser.SuperConstructionInvocationStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#typeCreationInvocationStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeCreationInvocationStatement(Java8Parser.TypeCreationInvocationStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#thisConstructionInvocationStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThisConstructionInvocationStatement(Java8Parser.ThisConstructionInvocationStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#methodInvocationStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodInvocationStatement(Java8Parser.MethodInvocationStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#qualifiedAccessStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualifiedAccessStatement(Java8Parser.QualifiedAccessStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#fieldAccessStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldAccessStatement(Java8Parser.FieldAccessStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#chainFieldAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChainFieldAccess(Java8Parser.ChainFieldAccessContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#referedFieldAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReferedFieldAccess(Java8Parser.ReferedFieldAccessContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#superFieldAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuperFieldAccess(Java8Parser.SuperFieldAccessContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#thisFieldAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThisFieldAccess(Java8Parser.ThisFieldAccessContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#fieldAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldAccess(Java8Parser.FieldAccessContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#gtInfixExpressionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGtInfixExpressionStatement(Java8Parser.GtInfixExpressionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#ltInfixExpressionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLtInfixExpressionStatement(Java8Parser.LtInfixExpressionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#equalInfixExpressionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualInfixExpressionStatement(Java8Parser.EqualInfixExpressionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#leInfixExpressionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeInfixExpressionStatement(Java8Parser.LeInfixExpressionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#geInfixExpressionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGeInfixExpressionStatement(Java8Parser.GeInfixExpressionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#notequalInfixExpressionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotequalInfixExpressionStatement(Java8Parser.NotequalInfixExpressionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#andInfixExpressionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndInfixExpressionStatement(Java8Parser.AndInfixExpressionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#orInfixExpressionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrInfixExpressionStatement(Java8Parser.OrInfixExpressionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#addInfixExpressionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddInfixExpressionStatement(Java8Parser.AddInfixExpressionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#subInfixExpressionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubInfixExpressionStatement(Java8Parser.SubInfixExpressionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#mulInfixExpressionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulInfixExpressionStatement(Java8Parser.MulInfixExpressionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#divInfixExpressionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivInfixExpressionStatement(Java8Parser.DivInfixExpressionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#bitandInfixExpressionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBitandInfixExpressionStatement(Java8Parser.BitandInfixExpressionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#bitorInfixExpressionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBitorInfixExpressionStatement(Java8Parser.BitorInfixExpressionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#caretInfixExpressionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaretInfixExpressionStatement(Java8Parser.CaretInfixExpressionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#modInfixExpressionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModInfixExpressionStatement(Java8Parser.ModInfixExpressionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#lshiftInfixExpressionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLshiftInfixExpressionStatement(Java8Parser.LshiftInfixExpressionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#rshiftInfixExpressionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRshiftInfixExpressionStatement(Java8Parser.RshiftInfixExpressionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#urshiftInfixExpressionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUrshiftInfixExpressionStatement(Java8Parser.UrshiftInfixExpressionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#infixExpressionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInfixExpressionStatement(Java8Parser.InfixExpressionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#instanceofExpressionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstanceofExpressionStatement(Java8Parser.InstanceofExpressionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#commonMethodReferenceExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommonMethodReferenceExpression(Java8Parser.CommonMethodReferenceExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#commonNewMethodReferenceExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommonNewMethodReferenceExpression(Java8Parser.CommonNewMethodReferenceExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#superMethodReferenceExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuperMethodReferenceExpression(Java8Parser.SuperMethodReferenceExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#methodReferenceExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodReferenceExpression(Java8Parser.MethodReferenceExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#methodReferenceStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodReferenceStatement(Java8Parser.MethodReferenceStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#commonNameStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommonNameStatement(Java8Parser.CommonNameStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#varRefNameStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarRefNameStatement(Java8Parser.VarRefNameStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#fieldRefNameStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldRefNameStatement(Java8Parser.FieldRefNameStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#nameStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNameStatement(Java8Parser.NameStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#bangPrefixExpressionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBangPrefixExpressionStatement(Java8Parser.BangPrefixExpressionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#tildePrefixExpressionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTildePrefixExpressionStatement(Java8Parser.TildePrefixExpressionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#incPrefixExpressionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIncPrefixExpressionStatement(Java8Parser.IncPrefixExpressionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#decPrefixExpressionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecPrefixExpressionStatement(Java8Parser.DecPrefixExpressionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#addPrefixExpressionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddPrefixExpressionStatement(Java8Parser.AddPrefixExpressionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#subPrefixExpressionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubPrefixExpressionStatement(Java8Parser.SubPrefixExpressionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#addPrefixExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddPrefixExpression(Java8Parser.AddPrefixExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#subPrefixExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubPrefixExpression(Java8Parser.SubPrefixExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#prefixExpressionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrefixExpressionStatement(Java8Parser.PrefixExpressionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#incPostfixExpressionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIncPostfixExpressionStatement(Java8Parser.IncPostfixExpressionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#decPostfixExpressionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecPostfixExpressionStatement(Java8Parser.DecPostfixExpressionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#postfixExpressionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostfixExpressionStatement(Java8Parser.PostfixExpressionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#arrayAccessStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayAccessStatement(Java8Parser.ArrayAccessStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#referedExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReferedExpression(Java8Parser.ReferedExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(Java8Parser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#anonymousClassBeginStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnonymousClassBeginStatement(Java8Parser.AnonymousClassBeginStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#anonymousClassPlaceHolderStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnonymousClassPlaceHolderStatement(Java8Parser.AnonymousClassPlaceHolderStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#anonymousClassPreStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnonymousClassPreStatement(Java8Parser.AnonymousClassPreStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#atInterfaceStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtInterfaceStatement(Java8Parser.AtInterfaceStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#annotationTypeMemberDeclarationStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationTypeMemberDeclarationStatement(Java8Parser.AnnotationTypeMemberDeclarationStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#classDeclarationStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDeclarationStatement(Java8Parser.ClassDeclarationStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#classInnerDeclarationStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassInnerDeclarationStatement(Java8Parser.ClassInnerDeclarationStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#enumDeclarationStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumDeclarationStatement(Java8Parser.EnumDeclarationStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#methodDeclarationStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDeclarationStatement(Java8Parser.MethodDeclarationStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#constructionDeclarationStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructionDeclarationStatement(Java8Parser.ConstructionDeclarationStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#enumConstantDeclarationStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumConstantDeclarationStatement(Java8Parser.EnumConstantDeclarationStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#labeledStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabeledStatement(Java8Parser.LabeledStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#variableDeclarationStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarationStatement(Java8Parser.VariableDeclarationStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#lambdaExpressionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaExpressionStatement(Java8Parser.LambdaExpressionStatementContext ctx);
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
	 * Visit a parse tree produced by {@link Java8Parser#doWhileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoWhileStatement(Java8Parser.DoWhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#whileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(Java8Parser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(Java8Parser.ReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#switchStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchStatement(Java8Parser.SwitchStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#switchCaseStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchCaseStatement(Java8Parser.SwitchCaseStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#defaultStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefaultStatement(Java8Parser.DefaultStatementContext ctx);
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
	 * Visit a parse tree produced by {@link Java8Parser#throwStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThrowStatement(Java8Parser.ThrowStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#catchClauseStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatchClauseStatement(Java8Parser.CatchClauseStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#finallyStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFinallyStatement(Java8Parser.FinallyStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(Java8Parser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#thenStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThenStatement(Java8Parser.ThenStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#elseStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseStatement(Java8Parser.ElseStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#arrayCreationStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayCreationStatement(Java8Parser.ArrayCreationStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#initializerStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitializerStatement(Java8Parser.InitializerStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#variableDeclarationHolderStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarationHolderStatement(Java8Parser.VariableDeclarationHolderStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#enhancedForStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnhancedForStatement(Java8Parser.EnhancedForStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#partialEndArrayAccessStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartialEndArrayAccessStatement(Java8Parser.PartialEndArrayAccessStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#leftParentheseStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeftParentheseStatement(Java8Parser.LeftParentheseStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#rightParentheseStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRightParentheseStatement(Java8Parser.RightParentheseStatementContext ctx);
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
	 * Visit a parse tree produced by {@link Java8Parser#enterMethodParamStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnterMethodParamStatement(Java8Parser.EnterMethodParamStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#arrayInitializerStartStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayInitializerStartStatement(Java8Parser.ArrayInitializerStartStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#arrayInitializerSplitCommaStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayInitializerSplitCommaStatement(Java8Parser.ArrayInitializerSplitCommaStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#arrayInitializerEndStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayInitializerEndStatement(Java8Parser.ArrayInitializerEndStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#enumConstantDeclarationSplitCommaStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumConstantDeclarationSplitCommaStatement(Java8Parser.EnumConstantDeclarationSplitCommaStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#forStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatement(Java8Parser.ForStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#forIniOverStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForIniOverStatement(Java8Parser.ForIniOverStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#forExpOverStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForExpOverStatement(Java8Parser.ForExpOverStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#forUpdOverStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForUpdOverStatement(Java8Parser.ForUpdOverStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#condExpBeginStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondExpBeginStatement(Java8Parser.CondExpBeginStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#condExpQuestionMarkStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondExpQuestionMarkStatement(Java8Parser.CondExpQuestionMarkStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#condExpColonMarkStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondExpColonMarkStatement(Java8Parser.CondExpColonMarkStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#partialEndStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartialEndStatement(Java8Parser.PartialEndStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#fullEndStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFullEndStatement(Java8Parser.FullEndStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#partialMethodArgumentEndStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartialMethodArgumentEndStatement(Java8Parser.PartialMethodArgumentEndStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#partialMethodPreRerferedExpressionEndStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartialMethodPreRerferedExpressionEndStatement(Java8Parser.PartialMethodPreRerferedExpressionEndStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#firstArgPreExist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFirstArgPreExist(Java8Parser.FirstArgPreExistContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#firstArgReferedExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFirstArgReferedExpression(Java8Parser.FirstArgReferedExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#commonClassMemberInvoke}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommonClassMemberInvoke(Java8Parser.CommonClassMemberInvokeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#selfClassMemberInvoke}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelfClassMemberInvoke(Java8Parser.SelfClassMemberInvokeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#superClassMemberInvoke}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuperClassMemberInvoke(Java8Parser.SuperClassMemberInvokeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#newClassInvoke}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewClassInvoke(Java8Parser.NewClassInvokeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#firstArg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFirstArg(Java8Parser.FirstArgContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#methodArgPreExist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodArgPreExist(Java8Parser.MethodArgPreExistContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#methodArgReferedExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodArgReferedExpression(Java8Parser.MethodArgReferedExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#argumentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentList(Java8Parser.ArgumentListContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#argType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgType(Java8Parser.ArgTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#lastArgType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLastArgType(Java8Parser.LastArgTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#argTypeList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgTypeList(Java8Parser.ArgTypeListContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(Java8Parser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#numberLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberLiteral(Java8Parser.NumberLiteralContext ctx);
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
	 * Visit a parse tree produced by {@link Java8Parser#stringLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringLiteral(Java8Parser.StringLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#nullLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNullLiteral(Java8Parser.NullLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#typeLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeLiteral(Java8Parser.TypeLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(Java8Parser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#virtualInferredType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVirtualInferredType(Java8Parser.VirtualInferredTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#primitiveType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitiveType(Java8Parser.PrimitiveTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#simpleType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleType(Java8Parser.SimpleTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#extendBound}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtendBound(Java8Parser.ExtendBoundContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#superBound}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuperBound(Java8Parser.SuperBoundContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#wildcardBounds}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWildcardBounds(Java8Parser.WildcardBoundsContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#wildCardType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWildCardType(Java8Parser.WildCardTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#typeArgument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArgument(Java8Parser.TypeArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#typeArguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArguments(Java8Parser.TypeArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#parameterizedType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterizedType(Java8Parser.ParameterizedTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#bothType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBothType(Java8Parser.BothTypeContext ctx);
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
	 * Visit a parse tree produced by {@link Java8Parser#intersectionFirstType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntersectionFirstType(Java8Parser.IntersectionFirstTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#intersectionSecondType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntersectionSecondType(Java8Parser.IntersectionSecondTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#intersectionType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntersectionType(Java8Parser.IntersectionTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#unionFirstType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnionFirstType(Java8Parser.UnionFirstTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#unionSecondType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnionSecondType(Java8Parser.UnionSecondTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#unionType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnionType(Java8Parser.UnionTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#classRef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassRef(Java8Parser.ClassRefContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#finalFieldRef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFinalFieldRef(Java8Parser.FinalFieldRefContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#finalVarRef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFinalVarRef(Java8Parser.FinalVarRefContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#commonFieldRef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommonFieldRef(Java8Parser.CommonFieldRefContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#commonVarRef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommonVarRef(Java8Parser.CommonVarRefContext ctx);
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
	 * Visit a parse tree produced by {@link Java8Parser#endOfArrayDeclarationIndexExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEndOfArrayDeclarationIndexExpression(Java8Parser.EndOfArrayDeclarationIndexExpressionContext ctx);
}