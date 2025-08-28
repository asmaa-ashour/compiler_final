parser grammar AngularaParser;
options { tokenVocab=AngularaLexer; }

program
    : htmlDocument
    | (statement)* EOF
    ;

statement
    : importStatement
    | componentDefinition
    | decorator exportStatement
    | exportStatement
    | exportDefault
    | classDeclaration
    | variableDeclaration
    | expressionStatement
    | methodDeclaration
    | ifStatement
    | interfaceDeclaration
    ;

importStatement
    : IMPORT importClause FROM STRING SEMI_Q?
    ;

importClause
    : IDENTIFIER
    | LBRACE importItems RBRACE
    ;

importItems
    : IDENTIFIER (COMMA IDENTIFIER)* COMMA?
    ;

componentDefinition
    : COMPONENT LPAREN componentMetadata RPAREN classDeclaration?
    ;

componentMetadata
    : LBRACE componentMetadataPropertyList? RBRACE
    ;

componentMetadataPropertyList
    : componentMetadataProperty (COMMA componentMetadataProperty)* COMMA?
    ;

componentMetadataProperty
    : SELECTOR COLON STRING
    | STANDALONE COLON BOOLEAN_LITERAL
    | IMPORTS COLON value
    | TEMPLATE COLON TEMPLATE_STR
    | STYLE_URLS COLON arrayLiteral
    | IDENTIFIER COLON value
    ;


classDeclaration
    : CLASS IDENTIFIER (EXTENDS IDENTIFIER)? (IMPLEMENTS IDENTIFIER (COMMA IDENTIFIER)*)? LBRACE classBody RBRACE
    ;

decorator
    : AT IDENTIFIER LPAREN objectLiteral RPAREN
    ;


exportStatement
    : EXPORT (classDeclaration | variableDeclaration)
    ;

exportDefault
    : EXPORT DEFAULT expression SEMI_Q?
    ;

classBody
    : classElement*
    ;

classElement
    : constructorDeclaration
    | methodDeclaration
    | fieldDeclaration
    ;

constructorDeclaration
    : CONSTRUCTOR LPAREN paramList? RPAREN block
    ;

methodDeclaration
    : accessModifier? IDENTIFIER LPAREN paramList? RPAREN (COLON typeAnnotation)? block
    ;

paramList
    : param (COMMA param)*
    ;

param
    : accessModifier? (IDENTIFIER | HTML | HEAD | BODY | META | TITLE | BASE | LINK) COLON typeAnnotation
    ;

accessModifier
    : PRIVATE
    | PUBLIC
    | PROTECTED
    ;

fieldDeclaration
    : accessModifier? IDENTIFIER (COLON typeAnnotation)? (ASSIGN expression)? SEMI_Q?;

interfaceDeclaration
    : EXPORT? INTERFACE IDENTIFIER LBRACE interfaceBody RBRACE
    ;
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////
interfaceBody
    : interfaceProperty*
    ;

interfaceProperty
    : IDENTIFIER COLON typeAnnotation SEMI_Q?
    ;

typeAnnotation
    : typeName (PIPE typeName)* (LBRACK RBRACK)*
    | typeName genericArguments (LBRACK RBRACK)*
    ;

typeName
    : IDENTIFIER genericArguments? (LBRACK RBRACK)?
    | STRING_TYPE
    | NUMBER_TYPE
    | BOOLEAN_TYPE
    | VOID
    | NULL
    ;

typeArguments
    : typeAnnotationWithArray (COMMA typeAnnotationWithArray)*
    ;

typeAnnotationWithArray
    : typeAnnotation (LBRACK RBRACK)?
    ;

genericArguments
    : LT genericTypeList GT
    ;

genericTypeList
    : typeAnnotationWithArray (COMMA typeAnnotationWithArray)*
    ;

block
    : LBRACE statementInside* RBRACE
    ;

statementInside
    : variableDeclaration
    | ifStatement
    | expressionStatement
    | fieldDeclaration
    | SEMI_Q
    ;

variableDeclaration
    : (LET | CONST)
      (IDENTIFIER | HTML | HEAD | BODY | META | TITLE | BASE | LINK)
      (COLON typeAnnotation)?
      ASSIGN expression
      SEMI_Q?
    | (LET | CONST) destructuringAssignment ASSIGN expression SEMI_Q?
    ;

    /*
variableDeclaration
    : (LET | CONST) (IDENTIFIER | HTML | HEAD | BODY | META | TITLE | BASE | LINK) (COLON typeAnnotation)? ASSIGN expression SEMI_Q?  #SimpleVar
    | (LET | CONST) destructuringAssignment ASSIGN expression SEMI_Q?           #DestructuringVar
    ;
*/
destructuringAssignment
    : LBRACE destructuringList RBRACE
    ;

destructuringList
    : IDENTIFIER (COMMA IDENTIFIER)*
    ;

ifStatement
    : IF LPAREN expression RPAREN block (ELSE block)?
    ;

expressionStatement
    : expression SEMI_Q?
    ;

expression
    : assignmentExpression
    ;

assignmentExpression
    : conditionalExpression (ASSIGN assignmentExpression)?
    ;

conditionalExpression
    : logicalOrExpression (QUESTION assignmentExpression COLON assignmentExpression)?
    ;

logicalOrExpression
    : logicalAndExpression (LOGICAL_OR logicalAndExpression)*
    ;

logicalAndExpression
    : equalityExpression (LOGICAL_AND equalityExpression)*
    ;

equalityExpression
    : relationalExpression ((EQ | NE | EQ_STRICT | NE_STRICT) relationalExpression)*
    ;

relationalExpression
    : additiveExpression
    ;

additiveExpression
    : multiplicativeExpression ((PLUS | MINUS) multiplicativeExpression)*
    ;

multiplicativeExpression
    : unaryExpression ((MULTIPLY | DIVIDE | MODULO) unaryExpression)*
    ;

unaryExpression
    : postfixExpression
    | PLUS unaryExpression
    | MINUS unaryExpression
    | EXCLAMATION unaryExpression
    ;

postfixExpression
    : primaryExpressionWithAssertion postfixOperator* (AS typeName)?
    ;

primaryExpressionWithAssertion
    : primaryExpression postfixAssertion?
    ;

postfixAssertion
    : EXCLAMATION
    ;

postfixOperator
    : DOT IDENTIFIER
    | LPAREN argumentList? RPAREN
    | LBRACK expression RBRACK
    ;
primaryExpression
    : THIS
    | IDENTIFIER
    | HTML
    | HEAD
    | BODY
    | META
    | TITLE
    | BASE
    | LINK
    | literal
    | arrayLiteral
    | objectLiteral
    | LPAREN expression RPAREN
    | arrowFunction
    | NEW IDENTIFIER genericArguments? LPAREN argumentList? RPAREN
    | TEMPLATE_STR
    | IMPORT DOT META DOT IDENTIFIER
    ;

arrowFunction
    : arrowParameters ARROW arrowBody
    ;

arrowParameters
    : IDENTIFIER
    | LPAREN RPAREN
    | LPAREN parameterList RPAREN
    ;

parameterList
    : parameter (COMMA parameter)*
    ;

parameter
    : IDENTIFIER (COLON typeAnnotation)?
    ;

arrowBody
    : expression
    | block
    ;

argumentList
    : assignmentExpression (COMMA assignmentExpression)* COMMA?
    ;

literal
    : STRING
    | NUMBER
    | BOOLEAN_LITERAL
    | NULL
    ;

value
    : expression
    | arrayLiteral
    | TEMPLATE_STR
    ;

arrayLiteral
    : LBRACK (expression (COMMA expression)* | SPREAD expression (COMMA expression)*)* RBRACK
    ;

objectLiteral
    : LBRACE (objectProperty (COMMA | SEMI_Q)?)* COMMA? RBRACE
    ;

objectProperty
    : IDENTIFIER COLON expression
    | SPREAD expression
    ;

htmlDocument
    : DOCTYPE? htmlElement*
    ;
htmlElement
    : LT htmlTagName attribute* GT htmlContent* LT SLASH htmlTagName GT
    | LT htmlTagName attribute* GT
    | LT htmlTagName attribute* SLASH GT
    ;
htmlTagName
    : META
    | HTML
    | HEAD
    | BODY
    | IDENTIFIER
    | TITLE
    | BASE
    | LINK
    ;
htmlContent
    : htmlElement
    | expression
    | STRING
    | IDENTIFIER
    ;

 attribute
                : IDENTIFIER
                | IDENTIFIER ASSIGN ( IDENTIFIER| NUMBER | BOOLEAN_LITERAL |STRING )
                ;