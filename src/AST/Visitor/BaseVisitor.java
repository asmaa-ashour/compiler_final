package AST.Visitor;
import AST.Classes.*;
import gen.AngularaParser;
import gen.AngularaParserBaseVisitor;


public class BaseVisitor extends AngularaParserBaseVisitor {
    @Override
    public Program visitProgram(AngularaParser.ProgramContext ctx) {
        Program program=new Program();
        if (ctx.htmlDocument()!=null){
            program.setHtmlDocument(visitHtmlDocument(ctx.htmlDocument()));
        }
        if(ctx.statement()!=null){
            for (int i=0;i<ctx.statement().size();i++){
                if (ctx.statement(i)!=null){
                    program.getStatement().add(visitStatement(ctx.statement(i)));
                }
            }

        }

        return program;
    }

    @Override
    public Statement visitStatement(AngularaParser.StatementContext ctx) {
        Statement statement=new Statement();
        if(ctx.importStatement()!=null)
        {
            statement.setImportStatement(visitImportStatement(ctx.importStatement()));
        }
        if (ctx.componentDefinition()!=null)
        {
            statement.setComponentDefinition(visitComponentDefinition(ctx.componentDefinition()));
        }
        if (ctx.decorator()!=null)
        {
            statement.setDecorator(visitDecorator(ctx.decorator()));
        }
        if (ctx.exportStatement()!=null)
        {
            statement.setExportStatement(visitExportStatement(ctx.exportStatement()));
        }
        if (ctx.exportDefault()!=null)
        {
            statement.setExportDefault(visitExportDefault(ctx.exportDefault()));
        }
        if (ctx.classDeclaration()!=null)
        {
            statement.setClassDeclaration(visitClassDeclaration(ctx.classDeclaration()));
        }
        if(ctx.variableDeclaration()!=null)
        {
            statement.setVariableDeclaration(visitVariableDeclaration(ctx.variableDeclaration()));
        }
        if(ctx.expressionStatement()!=null)
        {
            statement.setExpressionStatement(visitExpressionStatement(ctx.expressionStatement()));
        }
        if (ctx.methodDeclaration()!=null)
        {
            statement.setMethodDeclaration(visitMethodDeclaration(ctx.methodDeclaration()));
        }
        if (ctx.ifStatement()!=null)
        {
            statement.setIfStatement(visitIfStatement(ctx.ifStatement()));
        }
        if (ctx.interfaceDeclaration()!=null)
        {
            statement.setInterfaceDeclaration(visitInterfaceDeclaration(ctx.interfaceDeclaration()));
        }
        return  statement;

    }

    @Override
    public ImportStatement visitImportStatement(AngularaParser.ImportStatementContext ctx) {
        ImportStatement importStatement=new ImportStatement();
        if (ctx.importClause()!=null)
        {
            importStatement.setImportClause(visitImportClause(ctx.importClause()));
        }
        importStatement.setIMPORT(ctx.IMPORT().getText());
        importStatement.setFROM(ctx.FROM().getText());
        importStatement.setSTRING(ctx.STRING().getText());
        importStatement.setSEMI_Q(ctx.SEMI_Q().getText());
        return importStatement;

    }

    @Override
    public ImportClause visitImportClause(AngularaParser.ImportClauseContext ctx) {
        ImportClause importClause=new ImportClause();
        if(ctx.IDENTIFIER()!=null)
            importClause.setIDENTIFIER(ctx.IDENTIFIER().getText());
        if(ctx.LBRACE() != null)
            importClause.setLBRACE(ctx.LBRACE().getText());
        if(ctx.RBRACE() != null)
            importClause.setRBRACE(ctx.RBRACE().getText());
        if (ctx.importItems()!=null)
        {
            importClause.setImportItems(visitImportItems(ctx.importItems()));
        }
        return importClause;
    }

    @Override
    public ImportItems visitImportItems(AngularaParser.ImportItemsContext ctx) {
        ImportItems importItems=new ImportItems();

        if(ctx.COMMA() != null){
            for (int i=0;i<ctx.COMMA().size();i++){
                if(ctx.COMMA(i)!= null){
                    importItems.getCOMMA().add(ctx.COMMA(i).getText());

                }
            }
        }
        if(ctx.IDENTIFIER() != null){
            for (int i=0;i<ctx.IDENTIFIER().size();i++){
                if(ctx.IDENTIFIER(i)!= null){
                    importItems.getIDENTIFIER().add(ctx.IDENTIFIER(i).getText());

                }
            }
        }
        return importItems;
    }

    @Override
    public ComponentDefinition visitComponentDefinition(AngularaParser.ComponentDefinitionContext ctx) {
        ComponentDefinition componentDefinition=new ComponentDefinition();
        componentDefinition.setCOMPONENT(ctx.COMPONENT().getText());
        componentDefinition.setLPAREN(ctx.LPAREN().getText());
        componentDefinition.setRPAREN(ctx.RPAREN().getText());
        if (ctx.componentMetadata()!=null)
        {
            componentDefinition.setComponentMetadata(visitComponentMetadata(ctx.componentMetadata()));
        }
        if (ctx.classDeclaration()!=null)
        {
            componentDefinition.setClassDeclaration(visitClassDeclaration(ctx.classDeclaration()));
        }
        return componentDefinition;
    }

    @Override
    public ComponentMetadata visitComponentMetadata(AngularaParser.ComponentMetadataContext ctx) {
        ComponentMetadata componentMetadata=new ComponentMetadata();
        componentMetadata.setLBRACE(ctx.LBRACE().getText());
        componentMetadata.setRBRACE(ctx.RBRACE().getText());
        if (ctx.componentMetadataPropertyList()!=null)
        {
            componentMetadata.setComponentMetadataPropertyList(visitComponentMetadataPropertyList(ctx.componentMetadataPropertyList()));
        }
        return componentMetadata;
    }

    @Override
    public ComponentMetadataPropertyList visitComponentMetadataPropertyList(AngularaParser.ComponentMetadataPropertyListContext ctx) {
        ComponentMetadataPropertyList componentMetadataPropertyList=new ComponentMetadataPropertyList();
        if(ctx.componentMetadataProperty() !=null){
            for(int i =0 ;i<ctx.componentMetadataProperty().size();i++){
                if(ctx.componentMetadataProperty(i) !=null) {
                    componentMetadataPropertyList.getComponentMetadataProperty().add(visitComponentMetadataProperty(ctx.componentMetadataProperty(i)));
                }
            }
        }
        if(ctx.COMMA() != null){
            for (int i=0;i<ctx.COMMA().size();i++){
                if(ctx.COMMA(i)!= null){
                    componentMetadataPropertyList.getCOMMA().add(ctx.COMMA(i).getText());

                }
            }
        }
        return componentMetadataPropertyList;
    }

    @Override
    public ComponentMetadataProperty visitComponentMetadataProperty(AngularaParser.ComponentMetadataPropertyContext ctx) {
        ComponentMetadataProperty componentMetadataProperty=new ComponentMetadataProperty();
        if(ctx.SELECTOR() != null)
            componentMetadataProperty.setSELECTOR(ctx.SELECTOR().getText());
        if(ctx.COLON() != null)
        componentMetadataProperty.setCOLON(ctx.COLON().getText());
        if(ctx.STRING() != null)
        componentMetadataProperty.setSTRING(ctx.STRING().getText());
        if(ctx.STANDALONE() != null)
            componentMetadataProperty.setSTANDALONE(ctx.STANDALONE().getText());
        if(ctx.BOOLEAN_LITERAL() != null)
            componentMetadataProperty.setBOOLEAN_LITERAL(ctx.BOOLEAN_LITERAL().getText());
        if(ctx.TEMPLATE() != null)
            componentMetadataProperty.setTEMPLATE(ctx.TEMPLATE().getText());
        if(ctx.IMPORTS() != null)
            componentMetadataProperty.setIMPORTS(ctx.IMPORTS().getText());
        if(ctx.TEMPLATE_STR() != null)
            componentMetadataProperty.setTEMPLATE_STR(ctx.TEMPLATE_STR().getText());
        if(ctx.STYLE_URLS() != null)
            componentMetadataProperty.setSTYLE_URLS(ctx.STYLE_URLS().getText());
        if(ctx.IDENTIFIER() != null)
            componentMetadataProperty.setIDENTIFIER(ctx.IDENTIFIER().getText());

        if (ctx.value()!=null)
        {
            componentMetadataProperty.setValue(visitValue(ctx.value()));
        }

        if (ctx.arrayLiteral()!=null)
        {
            componentMetadataProperty.setArrayLiteral(visitArrayLiteral(ctx.arrayLiteral()));
        }
        return  componentMetadataProperty;

    }

    @Override
    public Decorator visitDecorator(AngularaParser.DecoratorContext ctx) {
        Decorator decorator=new Decorator();
        decorator.setAT(ctx.AT().getText());
        decorator.setIDENTIFIER(ctx.IDENTIFIER().getText());
        decorator.setLPAREN(ctx.LPAREN().getText());
        decorator.setRPAREN(ctx.RPAREN().getText());
        if (ctx.objectLiteral()!=null)
        {
            decorator.setObjectLiteral(visitObjectLiteral(ctx.objectLiteral()));
        }
        return  decorator;
    }

    @Override
    public ClassDeclaration visitClassDeclaration(AngularaParser.ClassDeclarationContext ctx) {
        ClassDeclaration classDeclaration=new ClassDeclaration();
        classDeclaration.setCLASS(ctx.CLASS().getText());
        if(ctx.EXTENDS() != null)
        classDeclaration.setEXTENDS(ctx.EXTENDS().getText());
        classDeclaration.setIMPLEMENTS(ctx.IMPLEMENTS().getText());
        classDeclaration.setLBRACE(ctx.LBRACE().getText());
        classDeclaration.setRBRACE(ctx.RBRACE().getText());
        if (ctx.classBody()!=null)
        {
            classDeclaration.setClassBody(visitClassBody(ctx.classBody()));
        }

        if(ctx.COMMA() != null){
            for (int i=0;i<ctx.COMMA().size();i++){
                if(ctx.COMMA(i)!= null){
                    classDeclaration.getCOMMA().add(ctx.COMMA(i).getText());

                }
            }
        }
        if(ctx.IDENTIFIER() != null){
            for (int i=0;i<ctx.IDENTIFIER().size();i++){
                if(ctx.IDENTIFIER(i)!= null){
                    classDeclaration.getIDENTIFIER().add(ctx.IDENTIFIER(i).getText());

                }
            }
        }
        return classDeclaration;
    }

    @Override
    public ExportStatement visitExportStatement(AngularaParser.ExportStatementContext ctx) {
        ExportStatement exportStatement=new ExportStatement();
        exportStatement.setEXPORT(ctx.EXPORT().getText());
        if(ctx.classDeclaration()!=null)
        {
            exportStatement.setClassDeclaration(visitClassDeclaration(ctx.classDeclaration()));

        }
        if(ctx.variableDeclaration()!=null)
        {
            exportStatement.setVariableDeclaration(visitVariableDeclaration(ctx.variableDeclaration()));
        }
        return  exportStatement;
    }

    @Override
    public ExportDefault visitExportDefault(AngularaParser.ExportDefaultContext ctx) {
        ExportDefault exportDefault=new ExportDefault();
        exportDefault.setEXPORT(ctx.EXPORT().getText());
        exportDefault.setDEFAULT(ctx.DEFAULT().getText());
        exportDefault.setSEMI_Q(ctx.SEMI_Q().getText());
        if(ctx.exception!=null)
        {
            exportDefault.setExpression(visitExpression(ctx.expression()));
        }
        return exportDefault;
    }

    @Override
    public ClassBody visitClassBody(AngularaParser.ClassBodyContext ctx) {
        ClassBody classBody=new ClassBody();
        if(ctx.classElement() !=null){
            for(int i =0 ;i<ctx.classElement().size();i++){
                if(ctx.classElement(i) !=null) {
                    classBody.getClassElement().add(visitClassElement(ctx.classElement(i)));
                }
            }
        }
        return classBody;
    }

    @Override
    public ClassElement visitClassElement(AngularaParser.ClassElementContext ctx) {
        ClassElement classElement=new ClassElement();
        if(ctx.constructorDeclaration()!=null)
        {
            classElement.setConstructorDeclaration(visitConstructorDeclaration(ctx.constructorDeclaration()));
        }
        if (ctx.methodDeclaration()!=null)
        {
            classElement.setMethodDeclaration(visitMethodDeclaration(ctx.methodDeclaration()));
        }
        if (ctx.fieldDeclaration()!=null)
        {
            classElement.setFieldDeclaration(visitFieldDeclaration(ctx.fieldDeclaration()));
        }
        return  classElement;
    }

    @Override
    public ConstructorDeclaration visitConstructorDeclaration(AngularaParser.ConstructorDeclarationContext ctx) {
        ConstructorDeclaration constructorDeclaration=new ConstructorDeclaration();
        constructorDeclaration.setCONSTRUCTOR(ctx.CONSTRUCTOR().getText());
        constructorDeclaration.setLPAREN(ctx.LPAREN().getText());
        constructorDeclaration.setRPAREN(ctx.RPAREN().getText());
        if (ctx.block()!=null)
        {
            constructorDeclaration.setBlock(visitBlock(ctx.block()));
        }
        if (ctx.paramList()!=null)
        {
            constructorDeclaration.setParamList(visitParamList(ctx.paramList()));
        }
        return constructorDeclaration;
    }

    @Override
    public MethodDeclaration visitMethodDeclaration(AngularaParser.MethodDeclarationContext ctx) {
        MethodDeclaration methodDeclaration=new MethodDeclaration();
        if(ctx.IDENTIFIER()!= null)
        methodDeclaration.setIDENTIFIER(ctx.IDENTIFIER().getText());
        if(ctx.LPAREN()!= null)
        methodDeclaration.setLPAREN(ctx.LPAREN().getText());
        if(ctx.RPAREN()!= null)
        methodDeclaration.setRPAREN(ctx.RPAREN().getText());
        if(ctx.COLON()!= null)
        methodDeclaration.setCOLON(ctx.COLON().getText());
        if (ctx.paramList()!=null)
        {
            methodDeclaration.setParamList(visitParamList(ctx.paramList()));
        }
        if (ctx.typeAnnotation()!=null)
        {
            methodDeclaration.setTypeAnnotation(visitTypeAnnotation(ctx.typeAnnotation()));
        }
        if (ctx.block()!=null)
        {
            methodDeclaration.setBlock(visitBlock(ctx.block()));
        }
        if (ctx.accessModifier()!=null)
        {
            methodDeclaration.setAccessModifier(visitAccessModifier(ctx.accessModifier()));
        }
        return methodDeclaration;
    }

    @Override
    public ParamList visitParamList(AngularaParser.ParamListContext ctx) {
        ParamList paramList=new ParamList();
        if(ctx.COMMA() != null){
            for (int i=0;i<ctx.COMMA().size();i++){
                if(ctx.COMMA(i)!= null){
                    paramList.getCOMMA().add(ctx.COMMA(i).getText());

                }
            }
        }
        if(ctx.param() !=null){
            for(int i =0 ;i<ctx.param().size();i++){
                if(ctx.param(i) !=null) {
                    paramList.getParam().add(visitParam(ctx.param(i)));
                }
            }
        }
        return paramList;
    }
/*
param
    : accessModifier? (IDENTIFIER | HTML | HEAD | BODY | META | TITLE | BASE | LINK) COLON typeAnnotation
    ;

 */
    @Override
    public Param visitParam(AngularaParser.ParamContext ctx) {
        Param param=new Param();
        if (ctx.accessModifier()!=null)
        {
            param.setAccessModifier(visitAccessModifier(ctx.accessModifier()));
        }
        if(ctx.IDENTIFIER()!= null)
        param.setIDENTIFIER(ctx.IDENTIFIER().getText());
        if(ctx.COLON()!= null)
        param.setCOLON(ctx.COLON().getText());
        if(ctx.HTML()!= null)
         param.setLINK(ctx.HTML().getText());
        if(ctx.HEAD()!= null)
         param.setHEAD(ctx.HEAD().getText());
        if(ctx.BODY()!= null)
         param.setBODY(ctx.BODY().getText());
        if(ctx.META()!= null)
         param.setMETA(ctx.META().getText());
        if(ctx.TITLE()!= null)
         param.setTITLE(ctx.TITLE().getText());
        if(ctx.BASE()!= null)
         param.setBASE(ctx.BASE().getText());
        if(ctx.LINK()!= null)
         param.setLINK(ctx.LINK().getText());

        if (ctx.typeAnnotation() != null) {
            param.setTypeAnnotation(visitTypeAnnotation(ctx.typeAnnotation()));

        }

        return param;
    }
/*
accessModifier
    : PRIVATE
    | PUBLIC
    | PROTECTED
    ;

 */
    @Override
    public AccessModifier visitAccessModifier(AngularaParser.AccessModifierContext ctx) {
        AccessModifier accessModifier=new AccessModifier();
        if(ctx.PRIVATE() != null)
        accessModifier.setPRIVATE(ctx.PRIVATE().getText());
        if(ctx.PROTECTED() != null)
        accessModifier.setPROTECTED(ctx.PROTECTED().getText());
        if(ctx.PUBLIC() != null)
        accessModifier.setPUBLIC(ctx.PUBLIC().getText());
        return  accessModifier;
    }
/*
fieldDeclaration

    : accessModifier? IDENTIFIER (COLON typeAnnotation)? (ASSIGN expression)? SEMI_Q?;

 */
    @Override
    public FieldDeclaration visitFieldDeclaration(AngularaParser.FieldDeclarationContext ctx) {
       FieldDeclaration fieldDeclaration=new FieldDeclaration();
        if (ctx.accessModifier() != null) {
            fieldDeclaration.setAccessModifier(visitAccessModifier(ctx.accessModifier()));

        }
        fieldDeclaration.setIDENTIFIER(ctx.IDENTIFIER().getText());
        fieldDeclaration.setCOLON(ctx.COLON().getText());
        if(ctx.ASSIGN() != null)
        fieldDeclaration.setASSIGN(ctx.ASSIGN().getText());
        fieldDeclaration.setSEMI_Q(ctx.SEMI_Q().getText());
        if (ctx.typeAnnotation() != null) {
            fieldDeclaration.setTypeAnnotation(visitTypeAnnotation(ctx.typeAnnotation()));
        }
        if (ctx.expression() != null) {
            fieldDeclaration.setExpression(visitExpression(ctx.expression()));
        }
        return fieldDeclaration;
    }
/*
interfaceDeclaration
    : EXPORT? INTERFACE IDENTIFIER LBRACE interfaceBody RBRACE
    ;
 */
    @Override
    public InterfaceDeclaration visitInterfaceDeclaration(AngularaParser.InterfaceDeclarationContext ctx) {
       InterfaceDeclaration interfaceDeclaration=new InterfaceDeclaration();
       interfaceDeclaration.setEXPORT(ctx.EXPORT().getText());
       interfaceDeclaration.setINTERFACE(ctx.INTERFACE().getText());
       interfaceDeclaration.setIDENTIFIER(ctx.IDENTIFIER().getText());
       interfaceDeclaration.setLBRACE(ctx.LBRACE().getText());
       interfaceDeclaration.setRBRACE(ctx.RBRACE().getText());
        if (ctx.interfaceBody() != null) {
            interfaceDeclaration.setInterfaceBody(visitInterfaceBody(ctx.interfaceBody()));
        }
        return  interfaceDeclaration;
    }
/*
interfaceBody
    : interfaceProperty*
    ;
 */
    @Override
    public InterfaceBody  visitInterfaceBody(AngularaParser.InterfaceBodyContext ctx) {
       InterfaceBody interfaceBody=new InterfaceBody();
        if(ctx.interfaceProperty() !=null){
            for(int i =0 ;i<ctx.interfaceProperty().size();i++){
                if(ctx.interfaceProperty(i) !=null) {
                    interfaceBody.getInterfaceProperty().add(visitInterfaceProperty(ctx.interfaceProperty(i)));
                }
            }
        }
        return interfaceBody;

    }
/*

interfaceProperty
    : IDENTIFIER COLON typeAnnotation SEMI_Q?
    ;
 */
    @Override
    public InterfaceProperty visitInterfaceProperty(AngularaParser.InterfacePropertyContext ctx) {
InterfaceProperty interfaceProperty=new InterfaceProperty();
interfaceProperty.setIDENTIFIER(ctx.IDENTIFIER().getText());
interfaceProperty.setCOLON(ctx.COLON().getText());
interfaceProperty.setSEMI_Q(ctx.SEMI_Q().getText());
        if (ctx.typeAnnotation() != null) {
            interfaceProperty.setTypeAnnotation(visitTypeAnnotation(ctx.typeAnnotation()));
        }
return interfaceProperty;
    }
/*

typeAnnotation
    : typeName (PIPE typeName)* (LBRACK RBRACK)*
    | typeName genericArguments (LBRACK RBRACK)*
    ;
 */
    @Override
    public TypeAnnotation visitTypeAnnotation(AngularaParser.TypeAnnotationContext ctx) {
        TypeAnnotation typeAnnotation=new TypeAnnotation();
        if(ctx.typeName() !=null){
            for(int i =0 ;i<ctx.typeName().size();i++){
                if(ctx.typeName(i) !=null) {
                    typeAnnotation.getTypeName().add(visitTypeName(ctx.typeName(i)));
                }
            }
        }

        if(ctx.RBRACK() != null){
            for (int i=0;i<ctx.RBRACK().size();i++){
                if(ctx.RBRACK(i)!= null){
                    typeAnnotation.getRBRACK().add(ctx.RBRACK(i).getText());

                }
            }
        }
        if(ctx.LBRACK() != null){
            for (int i=0;i<ctx.LBRACK().size();i++){
                if(ctx.LBRACK(i)!= null){
                    typeAnnotation.getLBRACK().add(ctx.LBRACK(i).getText());

                }
            }
        }
        if(ctx.PIPE() != null){
            for (int i=0;i<ctx.PIPE().size();i++){
                if(ctx.PIPE(i)!= null){
                    typeAnnotation.getPIPE().add(ctx.PIPE(i).getText());

                }
            }
        }
        if (ctx.genericArguments() != null) {
            typeAnnotation.setGenericArguments(visitGenericArguments(ctx.genericArguments()));

        }
return typeAnnotation;

    }
/*


typeName
    : IDENTIFIER
    | STRING_TYPE
    | NUMBER_TYPE
    | BOOLEAN_TYPE
    | VOID
    | NULL
    | IDENTIFIER genericArguments? (LBRACK RBRACK)?
    ;

 */
    @Override
    public TypeName visitTypeName(AngularaParser.TypeNameContext ctx) {
       TypeName typeName=new TypeName();
       if (ctx.IDENTIFIER() != null)
       typeName.setIDENTIFIER(ctx.IDENTIFIER().getText());
       if(ctx.NUMBER_TYPE() != null)
       typeName.setNUMBER_TYPE(ctx.NUMBER_TYPE().getText());
        if(ctx.BOOLEAN_TYPE() != null)
       typeName.setBOOLEAN_TYPE(ctx.BOOLEAN_TYPE().getText());
        if(ctx.VOID() != null)
       typeName.setVOID(ctx.VOID().getText());
        if(ctx.STRING_TYPE() != null)
       typeName.setSTRING_TYPE(ctx.STRING_TYPE().getText());
        if(ctx.NULL() != null)
       typeName.setNULL(ctx.NULL().getText());
        if(ctx.RBRACK() != null)
       typeName.setRBRACK(ctx.RBRACK().getText());
        if(ctx.LBRACK() != null)
       typeName.setLBRACK(ctx.LBRACK().getText());
        if (ctx.genericArguments() != null) {
            typeName.setGenericArguments(visitGenericArguments(ctx.genericArguments()));
        }
return typeName;
    }
    /*
    typeArguments
    : typeAnnotationWithArray (COMMA typeAnnotationWithArray)*
    ;

     */

    @Override
    public TypeArguments visitTypeArguments(AngularaParser.TypeArgumentsContext ctx) {
        TypeArguments typeArguments=new TypeArguments();
        if(ctx.typeAnnotationWithArray() !=null){
            for(int i =0 ;i<ctx.typeAnnotationWithArray().size();i++){
                if(ctx.typeAnnotationWithArray(i) !=null) {
                    typeArguments.getTypeAnnotationWithArray().add(visitTypeAnnotationWithArray(ctx.typeAnnotationWithArray(i)));
                }
            }
        }

        if(ctx.COMMA() != null){
            for (int i=0;i<ctx.COMMA().size();i++){
                if(ctx.COMMA(i)!= null){
                    typeArguments.getCOMMA().add(ctx.COMMA(i).getText());

                }
            }
        }
        return  typeArguments;
    }
/*
typeAnnotationWithArray
    : typeAnnotation (LBRACK RBRACK)?
    ;

 */
    @Override
    public TypeAnnotationWithArray visitTypeAnnotationWithArray(AngularaParser.TypeAnnotationWithArrayContext ctx) {
        TypeAnnotationWithArray typeAnnotationWithArray=new TypeAnnotationWithArray();
        if (ctx.typeAnnotation() != null) {
            typeAnnotationWithArray.setTypeAnnotation(visitTypeAnnotation(ctx.typeAnnotation()));
        }
        if(ctx.LBRACK() != null)
        typeAnnotationWithArray.setLBRACK(ctx.LBRACK().getText());
        if(ctx.RBRACK() != null)
        typeAnnotationWithArray.setRBRACK(ctx.RBRACK().getText());
        return typeAnnotationWithArray;
    }
/*

genericArguments
    : LT genericTypeList GT
    ;

 */
    @Override
    public GenericArguments visitGenericArguments(AngularaParser.GenericArgumentsContext ctx) {
        GenericArguments genericArguments=new GenericArguments();
        genericArguments.setLT(ctx.LT().getText());
        genericArguments.setGT(ctx.GT().getText());
        if (ctx.genericTypeList() != null) {
            genericArguments.setGenericTypeList(visitGenericTypeList(ctx.genericTypeList()));
        }
        return genericArguments;
    }
/*

genericTypeList
    : typeAnnotationWithArray (COMMA typeAnnotationWithArray)*
    ;

 */
    @Override
    public GenericTypeList visitGenericTypeList(AngularaParser.GenericTypeListContext ctx) {
        GenericTypeList genericTypeList=new GenericTypeList();
        if(ctx.typeAnnotationWithArray() !=null){
            for(int i =0 ;i<ctx.typeAnnotationWithArray().size();i++){
                if(ctx.typeAnnotationWithArray(i) !=null) {
                    genericTypeList.getTypeAnnotationWithArray().add(visitTypeAnnotationWithArray(ctx.typeAnnotationWithArray(i)));
                }
            }
        }

        if(ctx.COMMA() != null){
            for (int i=0;i<ctx.COMMA().size();i++){
                if(ctx.COMMA(i)!= null){
                    genericTypeList.getCOMMA().add(ctx.COMMA(i).getText());

                }
            }
        }
        return genericTypeList;
    }
    /*
    block
    : LBRACE statementInside* RBRACE
    ;

     */

    @Override
    public Block visitBlock(AngularaParser.BlockContext ctx) {
      Block block=new Block();
      block.setLBRACE(ctx.LBRACE().getText());
      block.setRBRACE(ctx.RBRACE().getText());
        if(ctx.statementInside() !=null){
            for(int i =0 ;i<ctx.statementInside().size();i++){
                if(ctx.statementInside(i) !=null) {
                    block.getStatementInside().add(visitStatementInside(ctx.statementInside(i)));
                }
            }
        }
        return  block;

    }
    /*
    statementInside
    : variableDeclaration
    | ifStatement
    | expressionStatement
    | fieldDeclaration
    | SEMI_Q
    ;

     */

    @Override
    public StatementInside visitStatementInside(AngularaParser.StatementInsideContext ctx) {
        StatementInside statementInside = new StatementInside();

        if (ctx.variableDeclaration() != null) {
            statementInside.setVariableDeclaration(visitVariableDeclaration(ctx.variableDeclaration()));
        }
        if (ctx.ifStatement() != null) {
            statementInside.setIfStatement(visitIfStatement(ctx.ifStatement()));
        }
        if (ctx.expressionStatement() != null) {
            statementInside.setExpressionStatement(visitExpressionStatement(ctx.expressionStatement()));
        }
        if (ctx.fieldDeclaration() != null) {
            statementInside.setFieldDeclaration(visitFieldDeclaration(ctx.fieldDeclaration()));
        }
        if (ctx.SEMI_Q() != null) {
            statementInside.setSEMI_Q(ctx.SEMI_Q().getText());
        }

        return statementInside;
    }

    /*

variableDeclaration
    : (LET | CONST)
      (IDENTIFIER | HTML | HEAD | BODY | META | TITLE | BASE | LINK)
      (COLON typeAnnotation)?
      ASSIGN expression
      SEMI_Q?
    | (LET | CONST) destructuringAssignment ASSIGN expression SEMI_Q?
    ;

 */
    @Override
    public VariableDeclaration visitVariableDeclaration(AngularaParser.VariableDeclarationContext ctx) {
        VariableDeclaration variableDeclaration=new VariableDeclaration();
        if(ctx.LET()!= null)
        variableDeclaration.setLET(ctx.LET().getText());
        if(ctx.COLON()!= null)
        variableDeclaration.setCOLON(ctx.COLON().getText());
        if(ctx.META()!= null)
        variableDeclaration.setMETA(ctx.META().getText());
        if(ctx.HTML()!= null)
        variableDeclaration.setHTML(ctx.HTML().getText());
        if(ctx.HEAD()!= null)
        variableDeclaration.setHEAD(ctx.HEAD().getText());
        if(ctx.BODY()!= null)
        variableDeclaration.setBODY(ctx.BODY().getText());
        if(ctx.IDENTIFIER()!= null)
        variableDeclaration.setIDENTIFIER(ctx.IDENTIFIER().getText());
        if(ctx.TITLE()!= null)
        variableDeclaration.setTITLE(ctx.TITLE().getText());
        if(ctx.BASE()!= null)
        variableDeclaration.setBASE(ctx.BASE().getText());
        if(ctx.LINK()!= null)
        variableDeclaration.setLINK(ctx.LINK().getText());
        if(ctx.ASSIGN()!= null)
        variableDeclaration.setASSIGN(ctx.ASSIGN().getText());
        if(ctx.SEMI_Q()!= null)
        variableDeclaration.setSEMI_Q(ctx.SEMI_Q().getText());
        if (ctx.typeAnnotation() != null) {
            variableDeclaration.setTypeAnnotation(visitTypeAnnotation(ctx.typeAnnotation()));
        }
        if (ctx.expression() != null) {
            variableDeclaration.setExpression(visitExpression(ctx.expression()));
        }
        if (ctx.destructuringAssignment() != null) {
            variableDeclaration.setDestructuringAssignment(visitDestructuringAssignment(ctx.destructuringAssignment()));
        }
        return variableDeclaration;

    }
/*

destructuringAssignment
    : LBRACE destructuringList RBRACE
    ;

 */
    @Override
    public DestructuringAssignment  visitDestructuringAssignment(AngularaParser.DestructuringAssignmentContext ctx) {
        DestructuringAssignment destructuringAssignment=new DestructuringAssignment();
        destructuringAssignment.setLBRACE(ctx.LBRACE().getText());
        destructuringAssignment.setRBRACE(ctx.RBRACE().getText());
        if (ctx.destructuringList() != null) {
            destructuringAssignment.setDestructuringList(visitDestructuringList(ctx.destructuringList()));
        }
        return destructuringAssignment;
    }
    /*
    destructuringList
    : IDENTIFIER (COMMA IDENTIFIER)*
    ;

     */
    @Override
    public DestructuringList  visitDestructuringList(AngularaParser.DestructuringListContext ctx) {
      DestructuringList destructuringList=new DestructuringList();
        if(ctx.COMMA() != null){
            for (int i=0;i<ctx.COMMA().size();i++){
                if(ctx.COMMA(i)!= null){
                    destructuringList.getCOMMA().add(ctx.COMMA(i).getText());

                }
            }
        }
        if(ctx.IDENTIFIER() != null){
            for (int i=0;i<ctx.IDENTIFIER().size();i++){
                if(ctx.COMMA(i)!= null){
                    destructuringList.getIDENTIFIER().add(ctx.IDENTIFIER(i).getText());

                }
            }
        }
      return destructuringList;
    }
/*
ifStatement
    : IF LPAREN expression RPAREN block (ELSE block)?
    ;

 */
    @Override
    public IfStatement visitIfStatement(AngularaParser.IfStatementContext ctx) {
       IfStatement ifStatement=new IfStatement();
        if(ctx.ELSE() != null)
       ifStatement.setIF(ctx.IF().getText());
        if(ctx.ELSE() != null)
       ifStatement.setLPAREN(ctx.LPAREN().getText());
        if(ctx.ELSE() != null)
       ifStatement.setRPAREN(ctx.RPAREN().getText());
       if(ctx.ELSE() != null)
       ifStatement.setELSE(ctx.ELSE().getText());
        if (ctx.expression() != null) {
            ifStatement.setExpression(visitExpression(ctx.expression()));
        }
        if (ctx.block(0) != null) {
            ifStatement.setBlock(visitBlock(ctx.block(0)));
        }
        if (ctx.block(1) != null) {
            ifStatement.setBlock(visitBlock(ctx.block(1)));
        }
        return ifStatement;
    }
/*
expressionStatement
    : expression SEMI_Q?
    ;

 */
    @Override
    public ExpressionStatement visitExpressionStatement(AngularaParser.ExpressionStatementContext ctx) {
      ExpressionStatement expressionStatement=new ExpressionStatement();
        if (ctx.expression() != null) {
            expressionStatement.setExpression(visitExpression(ctx.expression()));
        }
        expressionStatement.setSEMI_Q(ctx.SEMI_Q().getText());

    return  expressionStatement;
    }
/*
expression
    : assignmentExpression
    ;

 */
    @Override
    public Expression visitExpression(AngularaParser.ExpressionContext ctx) {
Expression expression=new Expression();
        if (ctx.assignmentExpression() != null) {
            expression.setAssignmentExpression(visitAssignmentExpression(ctx.assignmentExpression()));
        }
        return expression;
    }
/*

assignmentExpression
    : conditionalExpression (ASSIGN assignmentExpression)?
    ;

 */
    @Override
    public AssignmentExpression visitAssignmentExpression(AngularaParser.AssignmentExpressionContext ctx) {
        AssignmentExpression assignmentExpression=new AssignmentExpression();
        if (ctx.conditionalExpression() != null) {
            assignmentExpression.setConditionalExpression(visitConditionalExpression(ctx.conditionalExpression()));
        }
        if (ctx.assignmentExpression() != null) {
            assignmentExpression.setAssignmentExpression(visitAssignmentExpression(ctx.assignmentExpression()));
        }
        if(ctx.ASSIGN() != null)
        assignmentExpression.setASSIGN(ctx.ASSIGN().getText());
        return  assignmentExpression;
    }
/*
conditionalExpression
    : logicalOrExpression (QUESTION assignmentExpression COLON assignmentExpression)?
    ;

 */
@Override
public ConditionalExpression visitConditionalExpression(AngularaParser.ConditionalExpressionContext ctx) {
    ConditionalExpression conditionalExpression = new ConditionalExpression();

    // always: logicalOrExpression موجود
    if (ctx.logicalOrExpression() != null) {
        conditionalExpression.setLogicalOrExpression(visitLogicalOrExpression(ctx.logicalOrExpression()));
    }

    // الجزء الاختياري: ? expr : expr
    if (ctx.QUESTION() != null) { // وجود QUESTION يعني وجود كامل الرباعي ? expr : expr حسب grammar
        // نص السؤال/رمز '?'
        conditionalExpression.setQUESTION(ctx.QUESTION().getText());

        // الحصول على أول assignmentExpression (بعد '?')
        if (ctx.assignmentExpression() != null && ctx.assignmentExpression().size() > 0) {
            conditionalExpression.setAssignmentExpression(
                    visitAssignmentExpression(ctx.assignmentExpression(0))
            );
        }

        // COLON و assignmentExpression الثانية (بعد ':')
        if (ctx.COLON() != null && ctx.assignmentExpression() != null && ctx.assignmentExpression().size() > 1) {
            conditionalExpression.setCOLON(ctx.COLON().getText());
            conditionalExpression.setAssignmentExpression2(
                    visitAssignmentExpression(ctx.assignmentExpression(1))
            );
        }
    }

    return conditionalExpression;
}

    /*

logicalOrExpression
    : logicalAndExpression (LOGICAL_OR logicalAndExpression)*
    ;
 */
    @Override
    public LogicalOrExpression visitLogicalOrExpression(AngularaParser.LogicalOrExpressionContext ctx) {
LogicalOrExpression logicalOrExpression=new LogicalOrExpression();
        if(ctx.logicalAndExpression() !=null){
            for(int i =0 ;i<ctx.logicalAndExpression().size();i++){
                if(ctx.logicalAndExpression(i) !=null) {
                    logicalOrExpression.getLogicalAndExpression().add(visitLogicalAndExpression(ctx.logicalAndExpression(i)));
                }
            }

        }
        if(ctx.LOGICAL_OR() != null){
            for (int i=0;i<ctx.LOGICAL_OR().size();i++){
                if(ctx.LOGICAL_OR(i)!= null){
                    logicalOrExpression.getLOGICAL_OR().add(ctx.LOGICAL_OR(i).getText());

                }
            }
        }
        return logicalOrExpression;

    }
/*

logicalAndExpression
    : equalityExpression (LOGICAL_AND equalityExpression)*
    ;

 */
    @Override
    public LogicalAndExpression visitLogicalAndExpression(AngularaParser.LogicalAndExpressionContext ctx) {
        LogicalAndExpression logicalAndExpression=new LogicalAndExpression();
        if(ctx.equalityExpression() !=null){
            for(int i =0 ;i<ctx.equalityExpression().size();i++){
                if(ctx.equalityExpression(i) !=null) {
                    logicalAndExpression.getEqualityExpression().add(visitEqualityExpression(ctx.equalityExpression(i)));
                }
            }

        }
        if(ctx.LOGICAL_AND() != null){
            for (int i=0;i<ctx.LOGICAL_AND().size();i++){
                if(ctx.LOGICAL_AND(i)!= null){
                    logicalAndExpression.getLOGICAL_AND().add(ctx.LOGICAL_AND(i).getText());

                }
            }
        }
        return logicalAndExpression;


    }
/*
equalityExpression
    : relationalExpression ((EQ | NE | EQ_STRICT | NE_STRICT) relationalExpression)*
    ;

 */
    @Override
    public EqualityExpression visitEqualityExpression(AngularaParser.EqualityExpressionContext ctx) {
        EqualityExpression equalityExpression=new EqualityExpression();
        if(ctx.relationalExpression() !=null){
            for(int i =0 ;i<ctx.relationalExpression().size();i++){
                if(ctx.relationalExpression(i) !=null) {
                    equalityExpression.getRelationalExpression().add(visitRelationalExpression(ctx.relationalExpression(i)));
                }
            }

        }

        if(ctx.EQ() != null){
            for (int i=0;i<ctx.EQ().size();i++){
                if(ctx.EQ(i)!= null){
                    equalityExpression.getEQ().add(ctx.EQ(i).getText());

                }
            }
        }

        if(ctx.NE() != null){
            for (int i=0;i<ctx.NE().size();i++){
                if(ctx.NE(i)!= null){
                    equalityExpression.getNE().add(ctx.NE(i).getText());

                }
            }
        }

        if(ctx.EQ_STRICT() != null){
            for (int i=0;i<ctx.EQ_STRICT().size();i++){
                if(ctx.EQ_STRICT(i)!= null){
                    equalityExpression.getEQ_STRICT().add(ctx.EQ_STRICT(i).getText());

                }
            }
        }

        if(ctx.NE_STRICT() != null){
            for (int i=0;i<ctx.NE_STRICT().size();i++){
                if(ctx.NE_STRICT(i)!= null){
                    equalityExpression.getNE_STRICT().add(ctx.NE_STRICT(i).getText());

                }
            }
        }
return  equalityExpression;
    }
/*
relationalExpression
    : additiveExpression
    ;

 */
    @Override
    public RelationalExpression visitRelationalExpression(AngularaParser.RelationalExpressionContext ctx) {
        RelationalExpression relationalExpression=new RelationalExpression();
        if (ctx.additiveExpression() != null) {
            relationalExpression.setAdditiveExpression(visitAdditiveExpression(ctx.additiveExpression()));
        }
        return relationalExpression;

    }
/*

additiveExpression
    : multiplicativeExpression ((PLUS | MINUS) multiplicativeExpression)*
    ;

 */
    @Override
    public AdditiveExpression visitAdditiveExpression(AngularaParser.AdditiveExpressionContext ctx) {
        AdditiveExpression additiveExpression=new AdditiveExpression();

        if(ctx.multiplicativeExpression() !=null){
            for(int i =0 ;i<ctx.multiplicativeExpression().size();i++){
                if(ctx.multiplicativeExpression(i) !=null) {
                    additiveExpression.getMultiplicativeExpression().add(visitMultiplicativeExpression(ctx.multiplicativeExpression(i)));
                }
            }

        }

        if(ctx.PLUS() != null){
            for (int i=0;i<ctx.PLUS().size();i++){
                if(ctx.PLUS(i)!= null){
                    additiveExpression.getPLUS().add(ctx.PLUS(i).getText());

                }
            }
        }

        if(ctx.MINUS() != null){
            for (int i=0;i<ctx.MINUS().size();i++){
                if(ctx.MINUS(i)!= null){
                    additiveExpression.getMINUS().add(ctx.MINUS(i).getText());

                }
            }
        }

    return additiveExpression;
    }
/*
multiplicativeExpression
    : unaryExpression ((MULTIPLY | DIVIDE | MODULO) unaryExpression)*
    ;

 */
    @Override
    public MultiplicativeExpression visitMultiplicativeExpression(AngularaParser.MultiplicativeExpressionContext ctx) {
        MultiplicativeExpression multiplicativeExpression=new MultiplicativeExpression();

        if(ctx.unaryExpression() !=null){
            for(int i =0 ;i<ctx.unaryExpression().size();i++){
                if(ctx.unaryExpression(i) !=null) {
                    multiplicativeExpression.getUnaryExpression().add(visitUnaryExpression(ctx.unaryExpression(i)));
                }
            }

        }

        if(ctx.MULTIPLY() != null){
            for (int i=0;i<ctx.MULTIPLY().size();i++){
                if(ctx.MULTIPLY(i)!= null){
                    multiplicativeExpression.getMULTIPLY().add(ctx.MULTIPLY(i).getText());

                }
            }
        }

        if(ctx.MODULO() != null){
            for (int i=0;i<ctx.MODULO().size();i++){
                if(ctx.MODULO(i)!= null){
                    multiplicativeExpression.getMODULO().add(ctx.MODULO(i).getText());

                }
            }
        }

        if(ctx.DIVIDE() != null){
            for (int i=0;i<ctx.DIVIDE().size();i++){
                if(ctx.DIVIDE(i)!= null){
                    multiplicativeExpression.getDIVIDE().add(ctx.DIVIDE(i).getText());

                }
            }
        }
        return multiplicativeExpression;
    }
/*

unaryExpression
    : postfixExpression
    | (PLUS | MINUS | EXCLAMATION) unaryExpression
    ; */
    @Override
    public UnaryExpression visitUnaryExpression(AngularaParser.UnaryExpressionContext ctx) {
        UnaryExpression unaryExpression=new UnaryExpression();
        if (ctx.postfixExpression() != null) {
            unaryExpression.setPostfixExpression(visitPostfixExpression(ctx.postfixExpression()));
        }
        if (ctx.unaryExpression() != null) {
            unaryExpression.setUnaryExpression(visitUnaryExpression(ctx.unaryExpression()));
        }
        if(ctx.PLUS() != null)
        unaryExpression.setPLUS(ctx.PLUS().getText());
        if(ctx.MINUS() != null)
        unaryExpression.setMINUS(ctx.MINUS().getText());
        if(ctx.EXCLAMATION() != null)
        unaryExpression.setEXCLAMATION(ctx.EXCLAMATION().getText());
        return unaryExpression;

    }
    /*
    postfixExpression
    : primaryExpressionWithAssertion postfixOperator* (AS typeName)?
    ;

     */

    @Override
    public PostfixExpression visitPostfixExpression(AngularaParser.PostfixExpressionContext ctx) {
        PostfixExpression postfixExpression=new PostfixExpression();
        if (ctx.primaryExpressionWithAssertion() != null) {
            postfixExpression.setPrimaryExpressionWithAssertion(visitPrimaryExpressionWithAssertion(ctx.primaryExpressionWithAssertion()));
        }
        if (ctx.typeName() != null) {
            postfixExpression.setTypeName(visitTypeName(ctx.typeName()));
        }
        if(ctx.AS() != null)
        postfixExpression.setAS(ctx.AS().getText());
        if(ctx.postfixOperator() !=null){
            for(int i =0 ;i<ctx.postfixOperator().size();i++){
                if(ctx.postfixOperator(i) !=null) {
                    postfixExpression.getPostfixOperator().add(visitPostfixOperator(ctx.postfixOperator(i)));
                }
            }
        }
        return postfixExpression;
    }
/*
primaryExpressionWithAssertion
    : primaryExpression postfixAssertion?
    ;

 */
    @Override
    public PrimaryExpressionWithAssertion visitPrimaryExpressionWithAssertion(AngularaParser.PrimaryExpressionWithAssertionContext ctx) {
        PrimaryExpressionWithAssertion primaryExpressionWithAssertion=new PrimaryExpressionWithAssertion();
        if (ctx.primaryExpression() != null) {
            primaryExpressionWithAssertion.setPrimaryExpression(visitPrimaryExpression(ctx.primaryExpression()));
        }
        if (ctx.postfixAssertion() != null) {
            primaryExpressionWithAssertion.setPostfixAssertion(visitPostfixAssertion(ctx.postfixAssertion()));
        }
        return primaryExpressionWithAssertion;

    }
/*

postfixAssertion
    : EXCLAMATION
    ;

 */
    @Override
    public PostfixAssertion visitPostfixAssertion(AngularaParser.PostfixAssertionContext ctx) {
        PostfixAssertion postfixAssertion=new PostfixAssertion();
        postfixAssertion.setEXCLAMATION(ctx.EXCLAMATION().getText());
    return postfixAssertion;
    }

/*

postfixOperator
    : DOT IDENTIFIER
    | LPAREN argumentList? RPAREN
    | LBRACK expression RBRACK
    ;
 */
    @Override
    public PostfixOperator visitPostfixOperator(AngularaParser.PostfixOperatorContext ctx) {
        PostfixOperator postfixOperator=new PostfixOperator();
        postfixOperator.setDOT(ctx.DOT().getText());
        postfixOperator.setIDENTIFIER(ctx.IDENTIFIER().getText());
        if(ctx.LBRACK() != null)
        postfixOperator.setLBRACK(ctx.LBRACK().getText());
        if(ctx.RBRACK() != null)
        postfixOperator.setRBRACK(ctx.RBRACK().getText());
        if(ctx.LPAREN() != null)
        postfixOperator.setLPAREN(ctx.LPAREN().getText());
        if(ctx.RPAREN() != null)
        postfixOperator.setRPAREN(ctx.RPAREN().getText());
        if (ctx.argumentList() != null) {
            postfixOperator.setArgumentList(visitArgumentList(ctx.argumentList()));
        }
        if (ctx.exception != null) {
            postfixOperator.setExpression(visitExpression(ctx.expression()));

        }
        return postfixOperator;
    }
/*
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

 */
    @Override
    public PrimaryExpression visitPrimaryExpression(AngularaParser.PrimaryExpressionContext ctx) {
        PrimaryExpression primaryExpression=new PrimaryExpression();
        if(ctx.THIS() != null)
        primaryExpression.setTHIS(ctx.THIS().getText());
        if(ctx.IDENTIFIER() != null)
            primaryExpression.setIDENTIFIER(ctx.IDENTIFIER().getText());
        if(ctx.HTML() != null)
            primaryExpression.setHTML(ctx.HTML().getText());
        if(ctx.HEAD() != null)
            primaryExpression.setHEAD(ctx.HEAD().getText());
        if(ctx.BODY() != null)
            primaryExpression.setBODY(ctx.BODY().getText());
        if(ctx.META() != null)
        primaryExpression.setMETA(ctx.META().getText());
        if(ctx.TITLE() != null)
        primaryExpression.setTITLE(ctx.TITLE().getText());
        if(ctx.BASE() != null)
        primaryExpression.setBASE(ctx.BASE().getText());
        if(ctx.LINK() != null)
        primaryExpression.setLINK(ctx.LINK().getText());
        if(ctx.LPAREN() != null)
        primaryExpression.setLPAREN(ctx.LPAREN().getText());
        if(ctx.RPAREN() != null)
        primaryExpression.setRPAREN(ctx.RPAREN().getText());
        if(ctx.TEMPLATE_STR() != null)
        primaryExpression.setTEMPLATE_STR(ctx.TEMPLATE_STR().getText());
        if(ctx.NEW() != null)
        primaryExpression.setNEW(ctx.NEW().getText());
        if(ctx.IMPORT() != null)
        primaryExpression.setIMPORT(ctx.IMPORT().getText());
        if(ctx.DOT(0) != null &&ctx.DOT(1) != null)
        primaryExpression.setDOT(ctx.DOT(0).getText() + ctx.DOT(1).getText());

        if (ctx.literal() != null) {
            primaryExpression.setObjectLiteral(visitObjectLiteral(ctx.objectLiteral()));
        }
        if (ctx.arrayLiteral() != null) {
            primaryExpression.setArrayLiteral(visitArrayLiteral(ctx.arrayLiteral()));
        }
        if (ctx.objectLiteral() != null) {
            primaryExpression.setObjectLiteral(visitObjectLiteral(ctx.objectLiteral()));
        }
        if (ctx.expression() != null) {
            primaryExpression.setExpression(visitExpression(ctx.expression()));
        }
        if (ctx.arrowFunction() != null) {
            primaryExpression.setArrowFunction(visitArrowFunction(ctx.arrowFunction()));
        }
        if (ctx.genericArguments() != null) {
            primaryExpression.setGenericArguments(visitGenericArguments(ctx.genericArguments()));
        }

        if (ctx.argumentList() != null) {
            primaryExpression.setArgumentList(visitArgumentList(ctx.argumentList()));
        }


        return primaryExpression;

    }
/*
arrowFunction
    : arrowParameters ARROW arrowBody
    ;

 */
    @Override
    public ArrowFunction visitArrowFunction(AngularaParser.ArrowFunctionContext ctx) {
        ArrowFunction arrowFunction=new ArrowFunction();
        arrowFunction.setARROW(ctx.ARROW().getText());
        if (ctx.arrowParameters() != null) {
            arrowFunction.setArrowParameters(visitArrowParameters(ctx.arrowParameters()));
        }
        if (ctx.arrowBody() != null) {
            arrowFunction.setArrowBody(visitArrowBody(ctx.arrowBody()));
        }
        return arrowFunction;

    }
/*
arrowParameters
    : IDENTIFIER
    | LPAREN RPAREN
    | LPAREN parameterList RPAREN
    ;

 */
    @Override
    public ArrowParameters visitArrowParameters(AngularaParser.ArrowParametersContext ctx) {
        ArrowParameters arrowParameters=new ArrowParameters();
        arrowParameters.setIDENTIFIER(ctx.IDENTIFIER().getText());
        arrowParameters.setLPAREN(ctx.LPAREN().getText());
        arrowParameters.setRPAREN(ctx.RPAREN().getText());
        if (ctx.parameterList() != null) {
            arrowParameters.setParameterList(visitParameterList(ctx.parameterList()));
        }
        return  arrowParameters;
    }
/*
parameterList
    : parameter (COMMA parameter)*
    ;

 */
    @Override
    public ParameterList visitParameterList(AngularaParser.ParameterListContext ctx) {
        ParameterList parameterList=new ParameterList();
        if(ctx.parameter() !=null){
            for(int i =0 ;i<ctx.parameter().size();i++){
                if(ctx.parameter(i) !=null) {
                    parameterList.getParameter().add(visitParameter(ctx.parameter(i)));
                }
            }
        }
        if(ctx.COMMA() != null){
            for (int i=0;i<ctx.COMMA().size();i++){
                if(ctx.COMMA(i)!= null){
                    parameterList.getCOMMA().add(ctx.COMMA(i).getText());

                }
            }
        }
        return parameterList;
         }
/*
parameter
    : IDENTIFIER (COLON typeAnnotation)?
    ;

 */
    @Override
    public Parameter visitParameter(AngularaParser.ParameterContext ctx) {
Parameter parameter =new Parameter();
parameter.setIDENTIFIER(ctx.IDENTIFIER().getText());
parameter.setCOLON(ctx.COLON().getText());
        if (ctx.typeAnnotation() != null) {
            parameter.setTypeAnnotation(visitTypeAnnotation(ctx.typeAnnotation()));
        }return parameter;
    }
/*
arrowBody
    : expression
    | block
    ;

 */
    @Override
    public ArrowBody  visitArrowBody(AngularaParser.ArrowBodyContext ctx) {

       ArrowBody arrowBody=new ArrowBody();
        if (ctx.expression() != null) {
            arrowBody.setExpression(visitExpression(ctx.expression()));
        }

        if (ctx.block() != null) {
            arrowBody.setBlock(visitBlock(ctx.block()));
        }
        return  arrowBody;
    }
/*

argumentList
    : assignmentExpression (COMMA assignmentExpression)* COMMA?
    ;
 */
    @Override
    public ArgumentList visitArgumentList(AngularaParser.ArgumentListContext ctx) {
        ArgumentList argumentList=new ArgumentList();
        if(ctx.assignmentExpression() !=null){
            for(int i =0 ;i<ctx.assignmentExpression().size();i++){
                if(ctx.assignmentExpression(i) !=null) {
                    argumentList.getAssignmentExpression().add(visitAssignmentExpression(ctx.assignmentExpression(i)));
                }
            }
        }
        if(ctx.COMMA() != null){
            for (int i=0;i<ctx.COMMA().size();i++){
                if(ctx.COMMA(i)!= null){
                    argumentList.getCOMMA().add(ctx.COMMA(i).getText());

                }
            }
        }
        return  argumentList;
    }
/*

literal
    : STRING
    | NUMBER
    | BOOLEAN_LITERAL
    | NULL
    ;
 */
    @Override
    public Literal visitLiteral(AngularaParser.LiteralContext ctx) {
Literal literal=new Literal();
literal.setSTRING(ctx.STRING().getText());
literal.setNUMBER(ctx.NUMBER().getText());
literal.setBOOLEAN_LITERAL(ctx.BOOLEAN_LITERAL().getText());
literal.setNULL(ctx.NULL().getText());
return literal;

    }
/*
value
    : expression
    | arrayLiteral
    | TEMPLATE_STR
    ;

 */
    @Override
    public Value visitValue(AngularaParser.ValueContext ctx) {
      Value value=new Value();
        if (ctx.expression() != null) {
            value.setExpression(visitExpression(ctx.expression()));

        }
        if (ctx.arrayLiteral() != null) {
            value.setArrayLiteral(visitArrayLiteral(ctx.arrayLiteral()));

        }
        if(ctx.TEMPLATE_STR() != null)
        value.setTEMPLATE_STR(ctx.TEMPLATE_STR().getText());
return  value;
    }
/*
arrayLiteral
    : LBRACK (expression (COMMA expression)* | SPREAD expression (COMMA expression)*)* RBRACK
    ;

 */
    @Override
    public ArrayLiteral visitArrayLiteral(AngularaParser.ArrayLiteralContext ctx) {
        ArrayLiteral arrayLiteral=new ArrayLiteral();
        arrayLiteral.setLBRACK(ctx.LBRACK().getText());
        arrayLiteral.setRBRACK(ctx.RBRACK().getText());
        if(ctx.expression() !=null){
            for(int i =0 ;i<ctx.expression().size();i++){
                if(ctx.expression(i) !=null) {
                    arrayLiteral.getExpression().add(visitExpression(ctx.expression(i)));
                }
            }
        }
        if(ctx.COMMA() != null){
            for (int i=0;i<ctx.COMMA().size();i++){
                if(ctx.COMMA(i)!= null){
                    arrayLiteral.getCOMMA().add(ctx.COMMA(i).getText());

                }
            }
        }

        if(ctx.SPREAD() != null){
            for (int i=0;i<ctx.SPREAD().size();i++){
                if(ctx.SPREAD(i)!= null){
                    arrayLiteral.getSPREAD().add(ctx.SPREAD(i).getText());

                }
            }
        }
        return  arrayLiteral;
    }
/*
objectLiteral
    : LBRACE (objectProperty (COMMA | SEMI_Q)?)* COMMA? RBRACE
    ;

 */
    @Override
    public ObjectLiteral visitObjectLiteral(AngularaParser.ObjectLiteralContext ctx) {
        if (ctx == null) {
            return null; // أو رجع ObjectLiteral فاضي
        }
        ObjectLiteral objectLiteral=new ObjectLiteral();
        if(ctx.LBRACE() != null)
        objectLiteral.setLBRACE(ctx.LBRACE().getText());
        if(ctx.RBRACE() != null)
        objectLiteral.setRBRACE(ctx.RBRACE().getText());
        if(ctx.objectProperty() !=null){
            for(int i =0 ;i<ctx.objectProperty().size();i++){
                if(ctx.objectProperty(i) !=null) {
                    objectLiteral.getObjectProperty().add(visitObjectProperty(ctx.objectProperty(i)));
                }
            }
        }
        if(ctx.COMMA() != null){
            for (int i=0;i<ctx.COMMA().size();i++){
                if(ctx.COMMA(i)!= null){
                    objectLiteral.getCOMMA().add(ctx.COMMA(i).getText());

                }
            }
        }

        if(ctx.SEMI_Q() != null){
            for (int i=0;i<ctx.SEMI_Q().size();i++){
                if(ctx.SEMI_Q(i)!= null){
                    objectLiteral.getSEMI_Q().add(ctx.SEMI_Q(i).getText());

                }
            }
        }
        return objectLiteral;
    }
/*
objectProperty
    : IDENTIFIER COLON expression
    | SPREAD expression
    ;

 */
    @Override
    public  ObjectProperty visitObjectProperty(AngularaParser.ObjectPropertyContext ctx) {
        ObjectProperty objectProperty=new ObjectProperty();
        if(ctx.IDENTIFIER() != null)
        objectProperty.setIDENTIFIER(ctx.IDENTIFIER().getText());
        if(ctx.COLON() != null)
        objectProperty.setCOLON(ctx.COLON().getText());
        if(ctx.SPREAD() != null)
            objectProperty.setSPREAD(ctx.SPREAD().getText());
        if (ctx.expression() != null) {
            objectProperty.setExpression(visitExpression(ctx.expression()));
        }
        return objectProperty;
    }
/*
htmlDocument
    : DOCTYPE? htmlElement*
    ;
 */
    @Override
    public HtmlDocument visitHtmlDocument(AngularaParser.HtmlDocumentContext ctx) {
        HtmlDocument htmlDocument=new HtmlDocument();
        htmlDocument.setDOCTYPE(ctx.DOCTYPE().getText());
        if(ctx.htmlElement() !=null){
            for(int i =0 ;i<ctx.htmlElement().size();i++){
                if(ctx.htmlElement(i) !=null) {
                    htmlDocument.getHtmlElement().add(visitHtmlElement(ctx.htmlElement(i)));
                }
            }
        }
return htmlDocument;
    }
/*

htmlElement
    : LT htmlTagName attribute* GT htmlContent* LT SLASH htmlTagName GT
    | LT htmlTagName attribute* GT
    | LT htmlTagName attribute* SLASH GT
    ;
 */
@Override
public HtmlElement visitHtmlElement(AngularaParser.HtmlElementContext ctx) {
    HtmlElement node = new HtmlElement();

    // LT/GT: خذ أول LT وآخر GT المتوفرين حسب البديل
    if (!ctx.LT().isEmpty()) {
        node.setLT(ctx.LT(0).getText()); // أول <
    }
    if (!ctx.GT().isEmpty()) {
        node.setGT(ctx.GT(ctx.GT().size() - 1).getText()); // آخر >
    }

    // SLASH ممكن يكون null حسب البديل
    if (ctx.SLASH() != null) {
        node.setSLASH(ctx.SLASH().getText());
    }

    // htmlTagName: لازم نلف على القائمة ونزور كل عنصر
    for (AngularaParser.HtmlTagNameContext tctx : ctx.htmlTagName()) {
        node.getHtmlTagName().add(visitHtmlTagName(tctx));
    }

    // attributes: نفس الشي، قائمة
    for (AngularaParser.AttributeContext actx : ctx.attribute()) {
        node.getAttribute().add(visitAttribute(actx));
    }

    return node;
}

    /*

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
 */
    @Override
    public HtmlTagName visitHtmlTagName(AngularaParser.HtmlTagNameContext ctx) {
        HtmlTagName htmlTagName=new HtmlTagName();
        htmlTagName.setMETA(ctx.META().getText());
        htmlTagName.setHTML(ctx.HTML().getText());
        htmlTagName.setHEAD(ctx.HEAD().getText());
        htmlTagName.setBODY(ctx.BODY().getText());
        htmlTagName.setIDENTIFIER(ctx.IDENTIFIER().getText());
        htmlTagName.setTITLE(ctx.TITLE().getText());
        htmlTagName.setBASE(ctx.BASE().getText());
        htmlTagName.setLINK(ctx.LINK().getText());
        return htmlTagName;
    }
/*

htmlContent
    : htmlElement
    | expression
    | STRING
    | IDENTIFIER
    ;
 */
    @Override
    public HtmlContent visitHtmlContent(AngularaParser.HtmlContentContext ctx) {
        HtmlContent htmlContent=new HtmlContent();
        if (ctx.htmlElement() != null) {
            htmlContent.setHtmlElement(visitHtmlElement(ctx.htmlElement()));
        }
        if (ctx.expression() != null) {
            htmlContent.setExpression(visitExpression(ctx.expression()));
        }
        htmlContent.setSTRING(ctx.STRING().getText());
htmlContent.setIDENTIFIER(ctx.IDENTIFIER().getText());
return htmlContent;

    }
/*

 attribute
                : IDENTIFIER
                | IDENTIFIER ASSIGN ( IDENTIFIER| NUMBER | BOOLEAN_LITERAL |STRING )
                ;
 */
    @Override
    public Attribute visitAttribute(AngularaParser.AttributeContext ctx) {
Attribute attribute=new Attribute();
attribute.setIDENTIFIER(ctx.IDENTIFIER(0).getText());
attribute.setIDENTIFIER(ctx.IDENTIFIER(1).getText());
attribute.setASSIGN(ctx.ASSIGN().getText());
attribute.setNUMBER(ctx.NUMBER().getText());
attribute.setBOOLEAN_LITERAL(ctx.BOOLEAN_LITERAL().getText());
attribute.setSTRING(ctx.STRING().getText());

return  attribute;
    }

}
