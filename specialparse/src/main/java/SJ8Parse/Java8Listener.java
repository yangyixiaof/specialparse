package SJ8Parse;

// Generated from Java8.g4 by ANTLR 4.5.2
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
	 * Enter a parse tree produced by {@link Java8Parser#assignmentStatement}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentStatement(Java8Parser.AssignmentStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#assignmentStatement}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentStatement(Java8Parser.AssignmentStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#literalStatement}.
	 * @param ctx the parse tree
	 */
	void enterLiteralStatement(Java8Parser.LiteralStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#literalStatement}.
	 * @param ctx the parse tree
	 */
	void exitLiteralStatement(Java8Parser.LiteralStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#castExpressionStatement}.
	 * @param ctx the parse tree
	 */
	void enterCastExpressionStatement(Java8Parser.CastExpressionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#castExpressionStatement}.
	 * @param ctx the parse tree
	 */
	void exitCastExpressionStatement(Java8Parser.CastExpressionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#methodInvocationStatement}.
	 * @param ctx the parse tree
	 */
	void enterMethodInvocationStatement(Java8Parser.MethodInvocationStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#methodInvocationStatement}.
	 * @param ctx the parse tree
	 */
	void exitMethodInvocationStatement(Java8Parser.MethodInvocationStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#fieldAccessStatement}.
	 * @param ctx the parse tree
	 */
	void enterFieldAccessStatement(Java8Parser.FieldAccessStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#fieldAccessStatement}.
	 * @param ctx the parse tree
	 */
	void exitFieldAccessStatement(Java8Parser.FieldAccessStatementContext ctx);
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
	 * Enter a parse tree produced by {@link Java8Parser#infixExpressionStatement}.
	 * @param ctx the parse tree
	 */
	void enterInfixExpressionStatement(Java8Parser.InfixExpressionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#infixExpressionStatement}.
	 * @param ctx the parse tree
	 */
	void exitInfixExpressionStatement(Java8Parser.InfixExpressionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#instanceofExpressionStatement}.
	 * @param ctx the parse tree
	 */
	void enterInstanceofExpressionStatement(Java8Parser.InstanceofExpressionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#instanceofExpressionStatement}.
	 * @param ctx the parse tree
	 */
	void exitInstanceofExpressionStatement(Java8Parser.InstanceofExpressionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#methodReferenceStatement}.
	 * @param ctx the parse tree
	 */
	void enterMethodReferenceStatement(Java8Parser.MethodReferenceStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#methodReferenceStatement}.
	 * @param ctx the parse tree
	 */
	void exitMethodReferenceStatement(Java8Parser.MethodReferenceStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#nameStatement}.
	 * @param ctx the parse tree
	 */
	void enterNameStatement(Java8Parser.NameStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#nameStatement}.
	 * @param ctx the parse tree
	 */
	void exitNameStatement(Java8Parser.NameStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#prefixExpressionStatement}.
	 * @param ctx the parse tree
	 */
	void enterPrefixExpressionStatement(Java8Parser.PrefixExpressionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#prefixExpressionStatement}.
	 * @param ctx the parse tree
	 */
	void exitPrefixExpressionStatement(Java8Parser.PrefixExpressionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#postfixExpressionStatement}.
	 * @param ctx the parse tree
	 */
	void enterPostfixExpressionStatement(Java8Parser.PostfixExpressionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#postfixExpressionStatement}.
	 * @param ctx the parse tree
	 */
	void exitPostfixExpressionStatement(Java8Parser.PostfixExpressionStatementContext ctx);
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
	 * Enter a parse tree produced by {@link Java8Parser#anonymousClassBeginStatement}.
	 * @param ctx the parse tree
	 */
	void enterAnonymousClassBeginStatement(Java8Parser.AnonymousClassBeginStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#anonymousClassBeginStatement}.
	 * @param ctx the parse tree
	 */
	void exitAnonymousClassBeginStatement(Java8Parser.AnonymousClassBeginStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#anonymousClassPlaceHolderStatement}.
	 * @param ctx the parse tree
	 */
	void enterAnonymousClassPlaceHolderStatement(Java8Parser.AnonymousClassPlaceHolderStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#anonymousClassPlaceHolderStatement}.
	 * @param ctx the parse tree
	 */
	void exitAnonymousClassPlaceHolderStatement(Java8Parser.AnonymousClassPlaceHolderStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#anonymousClassPreStatement}.
	 * @param ctx the parse tree
	 */
	void enterAnonymousClassPreStatement(Java8Parser.AnonymousClassPreStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#anonymousClassPreStatement}.
	 * @param ctx the parse tree
	 */
	void exitAnonymousClassPreStatement(Java8Parser.AnonymousClassPreStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#atInterfaceStatement}.
	 * @param ctx the parse tree
	 */
	void enterAtInterfaceStatement(Java8Parser.AtInterfaceStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#atInterfaceStatement}.
	 * @param ctx the parse tree
	 */
	void exitAtInterfaceStatement(Java8Parser.AtInterfaceStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#annotationTypeMemberDeclarationStatement}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeMemberDeclarationStatement(Java8Parser.AnnotationTypeMemberDeclarationStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#annotationTypeMemberDeclarationStatement}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeMemberDeclarationStatement(Java8Parser.AnnotationTypeMemberDeclarationStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#classDeclarationStatement}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclarationStatement(Java8Parser.ClassDeclarationStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#classDeclarationStatement}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclarationStatement(Java8Parser.ClassDeclarationStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#classInnerDeclarationStatement}.
	 * @param ctx the parse tree
	 */
	void enterClassInnerDeclarationStatement(Java8Parser.ClassInnerDeclarationStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#classInnerDeclarationStatement}.
	 * @param ctx the parse tree
	 */
	void exitClassInnerDeclarationStatement(Java8Parser.ClassInnerDeclarationStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#enumDeclarationStatement}.
	 * @param ctx the parse tree
	 */
	void enterEnumDeclarationStatement(Java8Parser.EnumDeclarationStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#enumDeclarationStatement}.
	 * @param ctx the parse tree
	 */
	void exitEnumDeclarationStatement(Java8Parser.EnumDeclarationStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#methodDeclarationStatement}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclarationStatement(Java8Parser.MethodDeclarationStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#methodDeclarationStatement}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclarationStatement(Java8Parser.MethodDeclarationStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#constructionDeclarationStatement}.
	 * @param ctx the parse tree
	 */
	void enterConstructionDeclarationStatement(Java8Parser.ConstructionDeclarationStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#constructionDeclarationStatement}.
	 * @param ctx the parse tree
	 */
	void exitConstructionDeclarationStatement(Java8Parser.ConstructionDeclarationStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#enumConstantDeclarationStatement}.
	 * @param ctx the parse tree
	 */
	void enterEnumConstantDeclarationStatement(Java8Parser.EnumConstantDeclarationStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#enumConstantDeclarationStatement}.
	 * @param ctx the parse tree
	 */
	void exitEnumConstantDeclarationStatement(Java8Parser.EnumConstantDeclarationStatementContext ctx);
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
	 * Enter a parse tree produced by {@link Java8Parser#variableDeclarationStatement}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarationStatement(Java8Parser.VariableDeclarationStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#variableDeclarationStatement}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarationStatement(Java8Parser.VariableDeclarationStatementContext ctx);
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
	 * Enter a parse tree produced by {@link Java8Parser#doWhileStatement}.
	 * @param ctx the parse tree
	 */
	void enterDoWhileStatement(Java8Parser.DoWhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#doWhileStatement}.
	 * @param ctx the parse tree
	 */
	void exitDoWhileStatement(Java8Parser.DoWhileStatementContext ctx);
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
	 * Enter a parse tree produced by {@link Java8Parser#defaultStatement}.
	 * @param ctx the parse tree
	 */
	void enterDefaultStatement(Java8Parser.DefaultStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#defaultStatement}.
	 * @param ctx the parse tree
	 */
	void exitDefaultStatement(Java8Parser.DefaultStatementContext ctx);
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
	 * Enter a parse tree produced by {@link Java8Parser#catchClauseStatement}.
	 * @param ctx the parse tree
	 */
	void enterCatchClauseStatement(Java8Parser.CatchClauseStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#catchClauseStatement}.
	 * @param ctx the parse tree
	 */
	void exitCatchClauseStatement(Java8Parser.CatchClauseStatementContext ctx);
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
	 * Enter a parse tree produced by {@link Java8Parser#arrayCreationStatement}.
	 * @param ctx the parse tree
	 */
	void enterArrayCreationStatement(Java8Parser.ArrayCreationStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#arrayCreationStatement}.
	 * @param ctx the parse tree
	 */
	void exitArrayCreationStatement(Java8Parser.ArrayCreationStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#initializerStatement}.
	 * @param ctx the parse tree
	 */
	void enterInitializerStatement(Java8Parser.InitializerStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#initializerStatement}.
	 * @param ctx the parse tree
	 */
	void exitInitializerStatement(Java8Parser.InitializerStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#variableDeclarationHolderStatement}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarationHolderStatement(Java8Parser.VariableDeclarationHolderStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#variableDeclarationHolderStatement}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarationHolderStatement(Java8Parser.VariableDeclarationHolderStatementContext ctx);
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
	 * Enter a parse tree produced by {@link Java8Parser#partialEndArrayAccessStatement}.
	 * @param ctx the parse tree
	 */
	void enterPartialEndArrayAccessStatement(Java8Parser.PartialEndArrayAccessStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#partialEndArrayAccessStatement}.
	 * @param ctx the parse tree
	 */
	void exitPartialEndArrayAccessStatement(Java8Parser.PartialEndArrayAccessStatementContext ctx);
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
	 * Enter a parse tree produced by {@link Java8Parser#rightParentheseStatement}.
	 * @param ctx the parse tree
	 */
	void enterRightParentheseStatement(Java8Parser.RightParentheseStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#rightParentheseStatement}.
	 * @param ctx the parse tree
	 */
	void exitRightParentheseStatement(Java8Parser.RightParentheseStatementContext ctx);
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
	 * Enter a parse tree produced by {@link Java8Parser#enterMethodParamStatement}.
	 * @param ctx the parse tree
	 */
	void enterEnterMethodParamStatement(Java8Parser.EnterMethodParamStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#enterMethodParamStatement}.
	 * @param ctx the parse tree
	 */
	void exitEnterMethodParamStatement(Java8Parser.EnterMethodParamStatementContext ctx);
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
	 * Enter a parse tree produced by {@link Java8Parser#arrayInitializerSplitCommaStatement}.
	 * @param ctx the parse tree
	 */
	void enterArrayInitializerSplitCommaStatement(Java8Parser.ArrayInitializerSplitCommaStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#arrayInitializerSplitCommaStatement}.
	 * @param ctx the parse tree
	 */
	void exitArrayInitializerSplitCommaStatement(Java8Parser.ArrayInitializerSplitCommaStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#arrayInitializerEndStatement}.
	 * @param ctx the parse tree
	 */
	void enterArrayInitializerEndStatement(Java8Parser.ArrayInitializerEndStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#arrayInitializerEndStatement}.
	 * @param ctx the parse tree
	 */
	void exitArrayInitializerEndStatement(Java8Parser.ArrayInitializerEndStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#enumConstantDeclarationSplitCommaStatement}.
	 * @param ctx the parse tree
	 */
	void enterEnumConstantDeclarationSplitCommaStatement(Java8Parser.EnumConstantDeclarationSplitCommaStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#enumConstantDeclarationSplitCommaStatement}.
	 * @param ctx the parse tree
	 */
	void exitEnumConstantDeclarationSplitCommaStatement(Java8Parser.EnumConstantDeclarationSplitCommaStatementContext ctx);
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
	 * Enter a parse tree produced by {@link Java8Parser#partialEndStatement}.
	 * @param ctx the parse tree
	 */
	void enterPartialEndStatement(Java8Parser.PartialEndStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#partialEndStatement}.
	 * @param ctx the parse tree
	 */
	void exitPartialEndStatement(Java8Parser.PartialEndStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#fullEndStatement}.
	 * @param ctx the parse tree
	 */
	void enterFullEndStatement(Java8Parser.FullEndStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#fullEndStatement}.
	 * @param ctx the parse tree
	 */
	void exitFullEndStatement(Java8Parser.FullEndStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#partialMethodArgumentEndStatement}.
	 * @param ctx the parse tree
	 */
	void enterPartialMethodArgumentEndStatement(Java8Parser.PartialMethodArgumentEndStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#partialMethodArgumentEndStatement}.
	 * @param ctx the parse tree
	 */
	void exitPartialMethodArgumentEndStatement(Java8Parser.PartialMethodArgumentEndStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#partialMethodPreRerferedExpressionEndStatement}.
	 * @param ctx the parse tree
	 */
	void enterPartialMethodPreRerferedExpressionEndStatement(Java8Parser.PartialMethodPreRerferedExpressionEndStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#partialMethodPreRerferedExpressionEndStatement}.
	 * @param ctx the parse tree
	 */
	void exitPartialMethodPreRerferedExpressionEndStatement(Java8Parser.PartialMethodPreRerferedExpressionEndStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#firstArgPreExist}.
	 * @param ctx the parse tree
	 */
	void enterFirstArgPreExist(Java8Parser.FirstArgPreExistContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#firstArgPreExist}.
	 * @param ctx the parse tree
	 */
	void exitFirstArgPreExist(Java8Parser.FirstArgPreExistContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#firstArgReferedExpression}.
	 * @param ctx the parse tree
	 */
	void enterFirstArgReferedExpression(Java8Parser.FirstArgReferedExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#firstArgReferedExpression}.
	 * @param ctx the parse tree
	 */
	void exitFirstArgReferedExpression(Java8Parser.FirstArgReferedExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#commonClassMemberInvoke}.
	 * @param ctx the parse tree
	 */
	void enterCommonClassMemberInvoke(Java8Parser.CommonClassMemberInvokeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#commonClassMemberInvoke}.
	 * @param ctx the parse tree
	 */
	void exitCommonClassMemberInvoke(Java8Parser.CommonClassMemberInvokeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#selfClassMemberInvoke}.
	 * @param ctx the parse tree
	 */
	void enterSelfClassMemberInvoke(Java8Parser.SelfClassMemberInvokeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#selfClassMemberInvoke}.
	 * @param ctx the parse tree
	 */
	void exitSelfClassMemberInvoke(Java8Parser.SelfClassMemberInvokeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#superClassMemberInvoke}.
	 * @param ctx the parse tree
	 */
	void enterSuperClassMemberInvoke(Java8Parser.SuperClassMemberInvokeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#superClassMemberInvoke}.
	 * @param ctx the parse tree
	 */
	void exitSuperClassMemberInvoke(Java8Parser.SuperClassMemberInvokeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#newClassInvoke}.
	 * @param ctx the parse tree
	 */
	void enterNewClassInvoke(Java8Parser.NewClassInvokeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#newClassInvoke}.
	 * @param ctx the parse tree
	 */
	void exitNewClassInvoke(Java8Parser.NewClassInvokeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#firstArg}.
	 * @param ctx the parse tree
	 */
	void enterFirstArg(Java8Parser.FirstArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#firstArg}.
	 * @param ctx the parse tree
	 */
	void exitFirstArg(Java8Parser.FirstArgContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#methodArgPreExist}.
	 * @param ctx the parse tree
	 */
	void enterMethodArgPreExist(Java8Parser.MethodArgPreExistContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#methodArgPreExist}.
	 * @param ctx the parse tree
	 */
	void exitMethodArgPreExist(Java8Parser.MethodArgPreExistContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#methodArgReferedExpression}.
	 * @param ctx the parse tree
	 */
	void enterMethodArgReferedExpression(Java8Parser.MethodArgReferedExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#methodArgReferedExpression}.
	 * @param ctx the parse tree
	 */
	void exitMethodArgReferedExpression(Java8Parser.MethodArgReferedExpressionContext ctx);
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
	 * Enter a parse tree produced by {@link Java8Parser#argType}.
	 * @param ctx the parse tree
	 */
	void enterArgType(Java8Parser.ArgTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#argType}.
	 * @param ctx the parse tree
	 */
	void exitArgType(Java8Parser.ArgTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#argTypeList}.
	 * @param ctx the parse tree
	 */
	void enterArgTypeList(Java8Parser.ArgTypeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#argTypeList}.
	 * @param ctx the parse tree
	 */
	void exitArgTypeList(Java8Parser.ArgTypeListContext ctx);
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
	 * Enter a parse tree produced by {@link Java8Parser#virtualInferredType}.
	 * @param ctx the parse tree
	 */
	void enterVirtualInferredType(Java8Parser.VirtualInferredTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#virtualInferredType}.
	 * @param ctx the parse tree
	 */
	void exitVirtualInferredType(Java8Parser.VirtualInferredTypeContext ctx);
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
	 * Enter a parse tree produced by {@link Java8Parser#simpleType}.
	 * @param ctx the parse tree
	 */
	void enterSimpleType(Java8Parser.SimpleTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#simpleType}.
	 * @param ctx the parse tree
	 */
	void exitSimpleType(Java8Parser.SimpleTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#parameterizedType}.
	 * @param ctx the parse tree
	 */
	void enterParameterizedType(Java8Parser.ParameterizedTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#parameterizedType}.
	 * @param ctx the parse tree
	 */
	void exitParameterizedType(Java8Parser.ParameterizedTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#bothType}.
	 * @param ctx the parse tree
	 */
	void enterBothType(Java8Parser.BothTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#bothType}.
	 * @param ctx the parse tree
	 */
	void exitBothType(Java8Parser.BothTypeContext ctx);
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
	 * Enter a parse tree produced by {@link Java8Parser#wildCardType}.
	 * @param ctx the parse tree
	 */
	void enterWildCardType(Java8Parser.WildCardTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#wildCardType}.
	 * @param ctx the parse tree
	 */
	void exitWildCardType(Java8Parser.WildCardTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#extendBound}.
	 * @param ctx the parse tree
	 */
	void enterExtendBound(Java8Parser.ExtendBoundContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#extendBound}.
	 * @param ctx the parse tree
	 */
	void exitExtendBound(Java8Parser.ExtendBoundContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#superBound}.
	 * @param ctx the parse tree
	 */
	void enterSuperBound(Java8Parser.SuperBoundContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#superBound}.
	 * @param ctx the parse tree
	 */
	void exitSuperBound(Java8Parser.SuperBoundContext ctx);
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
	 * Enter a parse tree produced by {@link Java8Parser#intersectionFirstType}.
	 * @param ctx the parse tree
	 */
	void enterIntersectionFirstType(Java8Parser.IntersectionFirstTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#intersectionFirstType}.
	 * @param ctx the parse tree
	 */
	void exitIntersectionFirstType(Java8Parser.IntersectionFirstTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#intersectionSecondType}.
	 * @param ctx the parse tree
	 */
	void enterIntersectionSecondType(Java8Parser.IntersectionSecondTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#intersectionSecondType}.
	 * @param ctx the parse tree
	 */
	void exitIntersectionSecondType(Java8Parser.IntersectionSecondTypeContext ctx);
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
	 * Enter a parse tree produced by {@link Java8Parser#unionFirstType}.
	 * @param ctx the parse tree
	 */
	void enterUnionFirstType(Java8Parser.UnionFirstTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#unionFirstType}.
	 * @param ctx the parse tree
	 */
	void exitUnionFirstType(Java8Parser.UnionFirstTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#unionSecondType}.
	 * @param ctx the parse tree
	 */
	void enterUnionSecondType(Java8Parser.UnionSecondTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#unionSecondType}.
	 * @param ctx the parse tree
	 */
	void exitUnionSecondType(Java8Parser.UnionSecondTypeContext ctx);
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
	 * Enter a parse tree produced by {@link Java8Parser#classRef}.
	 * @param ctx the parse tree
	 */
	void enterClassRef(Java8Parser.ClassRefContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#classRef}.
	 * @param ctx the parse tree
	 */
	void exitClassRef(Java8Parser.ClassRefContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#finalFieldRef}.
	 * @param ctx the parse tree
	 */
	void enterFinalFieldRef(Java8Parser.FinalFieldRefContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#finalFieldRef}.
	 * @param ctx the parse tree
	 */
	void exitFinalFieldRef(Java8Parser.FinalFieldRefContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#finalVarRef}.
	 * @param ctx the parse tree
	 */
	void enterFinalVarRef(Java8Parser.FinalVarRefContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#finalVarRef}.
	 * @param ctx the parse tree
	 */
	void exitFinalVarRef(Java8Parser.FinalVarRefContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#commonFieldRef}.
	 * @param ctx the parse tree
	 */
	void enterCommonFieldRef(Java8Parser.CommonFieldRefContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#commonFieldRef}.
	 * @param ctx the parse tree
	 */
	void exitCommonFieldRef(Java8Parser.CommonFieldRefContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#commonVarRef}.
	 * @param ctx the parse tree
	 */
	void enterCommonVarRef(Java8Parser.CommonVarRefContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#commonVarRef}.
	 * @param ctx the parse tree
	 */
	void exitCommonVarRef(Java8Parser.CommonVarRefContext ctx);
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
	 * Enter a parse tree produced by {@link Java8Parser#endOfArrayInitializerElementExpression}.
	 * @param ctx the parse tree
	 */
	void enterEndOfArrayInitializerElementExpression(Java8Parser.EndOfArrayInitializerElementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#endOfArrayInitializerElementExpression}.
	 * @param ctx the parse tree
	 */
	void exitEndOfArrayInitializerElementExpression(Java8Parser.EndOfArrayInitializerElementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#prefixUnaryOperator}.
	 * @param ctx the parse tree
	 */
	void enterPrefixUnaryOperator(Java8Parser.PrefixUnaryOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#prefixUnaryOperator}.
	 * @param ctx the parse tree
	 */
	void exitPrefixUnaryOperator(Java8Parser.PrefixUnaryOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#postfixUnaryOperator}.
	 * @param ctx the parse tree
	 */
	void enterPostfixUnaryOperator(Java8Parser.PostfixUnaryOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#postfixUnaryOperator}.
	 * @param ctx the parse tree
	 */
	void exitPostfixUnaryOperator(Java8Parser.PostfixUnaryOperatorContext ctx);
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