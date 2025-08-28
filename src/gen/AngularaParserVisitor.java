// Generated from C:/Users/hp/Desktop/final/src/AngularaParser.g4 by ANTLR 4.13.2
package gen;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link AngularaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface AngularaParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link AngularaParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(AngularaParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(AngularaParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularaParser#importStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportStatement(AngularaParser.ImportStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularaParser#importClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportClause(AngularaParser.ImportClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularaParser#importItems}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportItems(AngularaParser.ImportItemsContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularaParser#componentDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComponentDefinition(AngularaParser.ComponentDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularaParser#componentMetadata}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComponentMetadata(AngularaParser.ComponentMetadataContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularaParser#componentMetadataPropertyList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComponentMetadataPropertyList(AngularaParser.ComponentMetadataPropertyListContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularaParser#componentMetadataProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComponentMetadataProperty(AngularaParser.ComponentMetadataPropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularaParser#classDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDeclaration(AngularaParser.ClassDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularaParser#decorator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecorator(AngularaParser.DecoratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularaParser#exportStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExportStatement(AngularaParser.ExportStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularaParser#exportDefault}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExportDefault(AngularaParser.ExportDefaultContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularaParser#classBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBody(AngularaParser.ClassBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularaParser#classElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassElement(AngularaParser.ClassElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularaParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorDeclaration(AngularaParser.ConstructorDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularaParser#methodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDeclaration(AngularaParser.MethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularaParser#paramList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParamList(AngularaParser.ParamListContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularaParser#param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam(AngularaParser.ParamContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularaParser#accessModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAccessModifier(AngularaParser.AccessModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularaParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldDeclaration(AngularaParser.FieldDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularaParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceDeclaration(AngularaParser.InterfaceDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularaParser#interfaceBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceBody(AngularaParser.InterfaceBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularaParser#interfaceProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceProperty(AngularaParser.InterfacePropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularaParser#typeAnnotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeAnnotation(AngularaParser.TypeAnnotationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularaParser#typeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeName(AngularaParser.TypeNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularaParser#typeArguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArguments(AngularaParser.TypeArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularaParser#typeAnnotationWithArray}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeAnnotationWithArray(AngularaParser.TypeAnnotationWithArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularaParser#genericArguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericArguments(AngularaParser.GenericArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularaParser#genericTypeList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericTypeList(AngularaParser.GenericTypeListContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularaParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(AngularaParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularaParser#statementInside}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementInside(AngularaParser.StatementInsideContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularaParser#variableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaration(AngularaParser.VariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularaParser#destructuringAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDestructuringAssignment(AngularaParser.DestructuringAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularaParser#destructuringList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDestructuringList(AngularaParser.DestructuringListContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularaParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(AngularaParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularaParser#expressionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionStatement(AngularaParser.ExpressionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(AngularaParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularaParser#assignmentExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentExpression(AngularaParser.AssignmentExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularaParser#conditionalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalExpression(AngularaParser.ConditionalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularaParser#logicalOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalOrExpression(AngularaParser.LogicalOrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularaParser#logicalAndExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalAndExpression(AngularaParser.LogicalAndExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularaParser#equalityExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualityExpression(AngularaParser.EqualityExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularaParser#relationalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalExpression(AngularaParser.RelationalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularaParser#additiveExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveExpression(AngularaParser.AdditiveExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularaParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicativeExpression(AngularaParser.MultiplicativeExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularaParser#unaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpression(AngularaParser.UnaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularaParser#postfixExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostfixExpression(AngularaParser.PostfixExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularaParser#primaryExpressionWithAssertion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryExpressionWithAssertion(AngularaParser.PrimaryExpressionWithAssertionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularaParser#postfixAssertion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostfixAssertion(AngularaParser.PostfixAssertionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularaParser#postfixOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostfixOperator(AngularaParser.PostfixOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularaParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryExpression(AngularaParser.PrimaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularaParser#arrowFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrowFunction(AngularaParser.ArrowFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularaParser#arrowParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrowParameters(AngularaParser.ArrowParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularaParser#parameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterList(AngularaParser.ParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularaParser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter(AngularaParser.ParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularaParser#arrowBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrowBody(AngularaParser.ArrowBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularaParser#argumentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentList(AngularaParser.ArgumentListContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularaParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(AngularaParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularaParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(AngularaParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularaParser#arrayLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayLiteral(AngularaParser.ArrayLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularaParser#objectLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectLiteral(AngularaParser.ObjectLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularaParser#objectProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectProperty(AngularaParser.ObjectPropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularaParser#htmlDocument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlDocument(AngularaParser.HtmlDocumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularaParser#htmlElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlElement(AngularaParser.HtmlElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularaParser#htmlTagName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlTagName(AngularaParser.HtmlTagNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularaParser#htmlContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlContent(AngularaParser.HtmlContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularaParser#attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribute(AngularaParser.AttributeContext ctx);
}