// Generated from C:/Users/hp/Desktop/final/src/AngularaParser.g4 by ANTLR 4.13.2
package gen;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link AngularaParser}.
 */
public interface AngularaParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link AngularaParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(AngularaParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularaParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(AngularaParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(AngularaParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(AngularaParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularaParser#importStatement}.
	 * @param ctx the parse tree
	 */
	void enterImportStatement(AngularaParser.ImportStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularaParser#importStatement}.
	 * @param ctx the parse tree
	 */
	void exitImportStatement(AngularaParser.ImportStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularaParser#importClause}.
	 * @param ctx the parse tree
	 */
	void enterImportClause(AngularaParser.ImportClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularaParser#importClause}.
	 * @param ctx the parse tree
	 */
	void exitImportClause(AngularaParser.ImportClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularaParser#importItems}.
	 * @param ctx the parse tree
	 */
	void enterImportItems(AngularaParser.ImportItemsContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularaParser#importItems}.
	 * @param ctx the parse tree
	 */
	void exitImportItems(AngularaParser.ImportItemsContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularaParser#componentDefinition}.
	 * @param ctx the parse tree
	 */
	void enterComponentDefinition(AngularaParser.ComponentDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularaParser#componentDefinition}.
	 * @param ctx the parse tree
	 */
	void exitComponentDefinition(AngularaParser.ComponentDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularaParser#componentMetadata}.
	 * @param ctx the parse tree
	 */
	void enterComponentMetadata(AngularaParser.ComponentMetadataContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularaParser#componentMetadata}.
	 * @param ctx the parse tree
	 */
	void exitComponentMetadata(AngularaParser.ComponentMetadataContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularaParser#componentMetadataPropertyList}.
	 * @param ctx the parse tree
	 */
	void enterComponentMetadataPropertyList(AngularaParser.ComponentMetadataPropertyListContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularaParser#componentMetadataPropertyList}.
	 * @param ctx the parse tree
	 */
	void exitComponentMetadataPropertyList(AngularaParser.ComponentMetadataPropertyListContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularaParser#componentMetadataProperty}.
	 * @param ctx the parse tree
	 */
	void enterComponentMetadataProperty(AngularaParser.ComponentMetadataPropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularaParser#componentMetadataProperty}.
	 * @param ctx the parse tree
	 */
	void exitComponentMetadataProperty(AngularaParser.ComponentMetadataPropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularaParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(AngularaParser.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularaParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(AngularaParser.ClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularaParser#decorator}.
	 * @param ctx the parse tree
	 */
	void enterDecorator(AngularaParser.DecoratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularaParser#decorator}.
	 * @param ctx the parse tree
	 */
	void exitDecorator(AngularaParser.DecoratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularaParser#exportStatement}.
	 * @param ctx the parse tree
	 */
	void enterExportStatement(AngularaParser.ExportStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularaParser#exportStatement}.
	 * @param ctx the parse tree
	 */
	void exitExportStatement(AngularaParser.ExportStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularaParser#exportDefault}.
	 * @param ctx the parse tree
	 */
	void enterExportDefault(AngularaParser.ExportDefaultContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularaParser#exportDefault}.
	 * @param ctx the parse tree
	 */
	void exitExportDefault(AngularaParser.ExportDefaultContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularaParser#classBody}.
	 * @param ctx the parse tree
	 */
	void enterClassBody(AngularaParser.ClassBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularaParser#classBody}.
	 * @param ctx the parse tree
	 */
	void exitClassBody(AngularaParser.ClassBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularaParser#classElement}.
	 * @param ctx the parse tree
	 */
	void enterClassElement(AngularaParser.ClassElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularaParser#classElement}.
	 * @param ctx the parse tree
	 */
	void exitClassElement(AngularaParser.ClassElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularaParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterConstructorDeclaration(AngularaParser.ConstructorDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularaParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitConstructorDeclaration(AngularaParser.ConstructorDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularaParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclaration(AngularaParser.MethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularaParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclaration(AngularaParser.MethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularaParser#paramList}.
	 * @param ctx the parse tree
	 */
	void enterParamList(AngularaParser.ParamListContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularaParser#paramList}.
	 * @param ctx the parse tree
	 */
	void exitParamList(AngularaParser.ParamListContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularaParser#param}.
	 * @param ctx the parse tree
	 */
	void enterParam(AngularaParser.ParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularaParser#param}.
	 * @param ctx the parse tree
	 */
	void exitParam(AngularaParser.ParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularaParser#accessModifier}.
	 * @param ctx the parse tree
	 */
	void enterAccessModifier(AngularaParser.AccessModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularaParser#accessModifier}.
	 * @param ctx the parse tree
	 */
	void exitAccessModifier(AngularaParser.AccessModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularaParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFieldDeclaration(AngularaParser.FieldDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularaParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFieldDeclaration(AngularaParser.FieldDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularaParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceDeclaration(AngularaParser.InterfaceDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularaParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceDeclaration(AngularaParser.InterfaceDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularaParser#interfaceBody}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceBody(AngularaParser.InterfaceBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularaParser#interfaceBody}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceBody(AngularaParser.InterfaceBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularaParser#interfaceProperty}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceProperty(AngularaParser.InterfacePropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularaParser#interfaceProperty}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceProperty(AngularaParser.InterfacePropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularaParser#typeAnnotation}.
	 * @param ctx the parse tree
	 */
	void enterTypeAnnotation(AngularaParser.TypeAnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularaParser#typeAnnotation}.
	 * @param ctx the parse tree
	 */
	void exitTypeAnnotation(AngularaParser.TypeAnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularaParser#typeName}.
	 * @param ctx the parse tree
	 */
	void enterTypeName(AngularaParser.TypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularaParser#typeName}.
	 * @param ctx the parse tree
	 */
	void exitTypeName(AngularaParser.TypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularaParser#typeArguments}.
	 * @param ctx the parse tree
	 */
	void enterTypeArguments(AngularaParser.TypeArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularaParser#typeArguments}.
	 * @param ctx the parse tree
	 */
	void exitTypeArguments(AngularaParser.TypeArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularaParser#typeAnnotationWithArray}.
	 * @param ctx the parse tree
	 */
	void enterTypeAnnotationWithArray(AngularaParser.TypeAnnotationWithArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularaParser#typeAnnotationWithArray}.
	 * @param ctx the parse tree
	 */
	void exitTypeAnnotationWithArray(AngularaParser.TypeAnnotationWithArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularaParser#genericArguments}.
	 * @param ctx the parse tree
	 */
	void enterGenericArguments(AngularaParser.GenericArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularaParser#genericArguments}.
	 * @param ctx the parse tree
	 */
	void exitGenericArguments(AngularaParser.GenericArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularaParser#genericTypeList}.
	 * @param ctx the parse tree
	 */
	void enterGenericTypeList(AngularaParser.GenericTypeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularaParser#genericTypeList}.
	 * @param ctx the parse tree
	 */
	void exitGenericTypeList(AngularaParser.GenericTypeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularaParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(AngularaParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularaParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(AngularaParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularaParser#statementInside}.
	 * @param ctx the parse tree
	 */
	void enterStatementInside(AngularaParser.StatementInsideContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularaParser#statementInside}.
	 * @param ctx the parse tree
	 */
	void exitStatementInside(AngularaParser.StatementInsideContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularaParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(AngularaParser.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularaParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(AngularaParser.VariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularaParser#destructuringAssignment}.
	 * @param ctx the parse tree
	 */
	void enterDestructuringAssignment(AngularaParser.DestructuringAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularaParser#destructuringAssignment}.
	 * @param ctx the parse tree
	 */
	void exitDestructuringAssignment(AngularaParser.DestructuringAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularaParser#destructuringList}.
	 * @param ctx the parse tree
	 */
	void enterDestructuringList(AngularaParser.DestructuringListContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularaParser#destructuringList}.
	 * @param ctx the parse tree
	 */
	void exitDestructuringList(AngularaParser.DestructuringListContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularaParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(AngularaParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularaParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(AngularaParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularaParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionStatement(AngularaParser.ExpressionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularaParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionStatement(AngularaParser.ExpressionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(AngularaParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(AngularaParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularaParser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentExpression(AngularaParser.AssignmentExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularaParser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentExpression(AngularaParser.AssignmentExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularaParser#conditionalExpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalExpression(AngularaParser.ConditionalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularaParser#conditionalExpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalExpression(AngularaParser.ConditionalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularaParser#logicalOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalOrExpression(AngularaParser.LogicalOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularaParser#logicalOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalOrExpression(AngularaParser.LogicalOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularaParser#logicalAndExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalAndExpression(AngularaParser.LogicalAndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularaParser#logicalAndExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalAndExpression(AngularaParser.LogicalAndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularaParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void enterEqualityExpression(AngularaParser.EqualityExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularaParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void exitEqualityExpression(AngularaParser.EqualityExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularaParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpression(AngularaParser.RelationalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularaParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpression(AngularaParser.RelationalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularaParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpression(AngularaParser.AdditiveExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularaParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpression(AngularaParser.AdditiveExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularaParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeExpression(AngularaParser.MultiplicativeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularaParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeExpression(AngularaParser.MultiplicativeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularaParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpression(AngularaParser.UnaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularaParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpression(AngularaParser.UnaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularaParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostfixExpression(AngularaParser.PostfixExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularaParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostfixExpression(AngularaParser.PostfixExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularaParser#primaryExpressionWithAssertion}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryExpressionWithAssertion(AngularaParser.PrimaryExpressionWithAssertionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularaParser#primaryExpressionWithAssertion}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryExpressionWithAssertion(AngularaParser.PrimaryExpressionWithAssertionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularaParser#postfixAssertion}.
	 * @param ctx the parse tree
	 */
	void enterPostfixAssertion(AngularaParser.PostfixAssertionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularaParser#postfixAssertion}.
	 * @param ctx the parse tree
	 */
	void exitPostfixAssertion(AngularaParser.PostfixAssertionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularaParser#postfixOperator}.
	 * @param ctx the parse tree
	 */
	void enterPostfixOperator(AngularaParser.PostfixOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularaParser#postfixOperator}.
	 * @param ctx the parse tree
	 */
	void exitPostfixOperator(AngularaParser.PostfixOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularaParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryExpression(AngularaParser.PrimaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularaParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryExpression(AngularaParser.PrimaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularaParser#arrowFunction}.
	 * @param ctx the parse tree
	 */
	void enterArrowFunction(AngularaParser.ArrowFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularaParser#arrowFunction}.
	 * @param ctx the parse tree
	 */
	void exitArrowFunction(AngularaParser.ArrowFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularaParser#arrowParameters}.
	 * @param ctx the parse tree
	 */
	void enterArrowParameters(AngularaParser.ArrowParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularaParser#arrowParameters}.
	 * @param ctx the parse tree
	 */
	void exitArrowParameters(AngularaParser.ArrowParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularaParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void enterParameterList(AngularaParser.ParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularaParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void exitParameterList(AngularaParser.ParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularaParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(AngularaParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularaParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(AngularaParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularaParser#arrowBody}.
	 * @param ctx the parse tree
	 */
	void enterArrowBody(AngularaParser.ArrowBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularaParser#arrowBody}.
	 * @param ctx the parse tree
	 */
	void exitArrowBody(AngularaParser.ArrowBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularaParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void enterArgumentList(AngularaParser.ArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularaParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void exitArgumentList(AngularaParser.ArgumentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularaParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(AngularaParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularaParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(AngularaParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularaParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(AngularaParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularaParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(AngularaParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularaParser#arrayLiteral}.
	 * @param ctx the parse tree
	 */
	void enterArrayLiteral(AngularaParser.ArrayLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularaParser#arrayLiteral}.
	 * @param ctx the parse tree
	 */
	void exitArrayLiteral(AngularaParser.ArrayLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularaParser#objectLiteral}.
	 * @param ctx the parse tree
	 */
	void enterObjectLiteral(AngularaParser.ObjectLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularaParser#objectLiteral}.
	 * @param ctx the parse tree
	 */
	void exitObjectLiteral(AngularaParser.ObjectLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularaParser#objectProperty}.
	 * @param ctx the parse tree
	 */
	void enterObjectProperty(AngularaParser.ObjectPropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularaParser#objectProperty}.
	 * @param ctx the parse tree
	 */
	void exitObjectProperty(AngularaParser.ObjectPropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularaParser#htmlDocument}.
	 * @param ctx the parse tree
	 */
	void enterHtmlDocument(AngularaParser.HtmlDocumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularaParser#htmlDocument}.
	 * @param ctx the parse tree
	 */
	void exitHtmlDocument(AngularaParser.HtmlDocumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularaParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void enterHtmlElement(AngularaParser.HtmlElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularaParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void exitHtmlElement(AngularaParser.HtmlElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularaParser#htmlTagName}.
	 * @param ctx the parse tree
	 */
	void enterHtmlTagName(AngularaParser.HtmlTagNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularaParser#htmlTagName}.
	 * @param ctx the parse tree
	 */
	void exitHtmlTagName(AngularaParser.HtmlTagNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularaParser#htmlContent}.
	 * @param ctx the parse tree
	 */
	void enterHtmlContent(AngularaParser.HtmlContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularaParser#htmlContent}.
	 * @param ctx the parse tree
	 */
	void exitHtmlContent(AngularaParser.HtmlContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularaParser#attribute}.
	 * @param ctx the parse tree
	 */
	void enterAttribute(AngularaParser.AttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularaParser#attribute}.
	 * @param ctx the parse tree
	 */
	void exitAttribute(AngularaParser.AttributeContext ctx);
}