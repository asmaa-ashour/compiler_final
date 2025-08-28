package AST.Classes;

public class Statement {
    /*

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
     */

    private ImportStatement importStatement;
    private  ComponentDefinition componentDefinition;
    private Decorator decorator;
    private ExportStatement exportStatement;
    private  ExportDefault exportDefault;
    private ClassDeclaration classDeclaration;
    private VariableDeclaration variableDeclaration;
    private ExpressionStatement expressionStatement;
    private MethodDeclaration methodDeclaration;
    private IfStatement ifStatement;
    private InterfaceDeclaration interfaceDeclaration;

    public ImportStatement getImportStatement() {
        return importStatement;
    }

    public void setImportStatement(ImportStatement importStatement) {
        this.importStatement = importStatement;
    }

    public ComponentDefinition getComponentDefinition() {
        return componentDefinition;
    }

    public void setComponentDefinition(ComponentDefinition componentDefinition) {
        this.componentDefinition = componentDefinition;
    }

    public Decorator getDecorator() {
        return decorator;
    }

    public void setDecorator(Decorator decorator) {
        this.decorator = decorator;
    }

    public ExportStatement getExportStatement() {
        return exportStatement;
    }

    public void setExportStatement(ExportStatement exportStatement) {
        this.exportStatement = exportStatement;
    }

    public ExportDefault getExportDefault() {
        return exportDefault;
    }

    public void setExportDefault(ExportDefault exportDefault) {
        this.exportDefault = exportDefault;
    }

    public ClassDeclaration getClassDeclaration() {
        return classDeclaration;
    }

    public void setClassDeclaration(ClassDeclaration classDeclaration) {
        this.classDeclaration = classDeclaration;
    }

    public VariableDeclaration getVariableDeclaration() {
        return variableDeclaration;
    }

    public void setVariableDeclaration(VariableDeclaration variableDeclaration) {
        this.variableDeclaration = variableDeclaration;
    }

    public ExpressionStatement getExpressionStatement() {
        return expressionStatement;
    }

    public void setExpressionStatement(ExpressionStatement expressionStatement) {
        this.expressionStatement = expressionStatement;
    }

    public MethodDeclaration getMethodDeclaration() {
        return methodDeclaration;
    }

    public void setMethodDeclaration(MethodDeclaration methodDeclaration) {
        this.methodDeclaration = methodDeclaration;
    }

    public IfStatement getIfStatement() {
        return ifStatement;
    }

    public void setIfStatement(IfStatement ifStatement) {
        this.ifStatement = ifStatement;
    }

    public InterfaceDeclaration getInterfaceDeclaration() {
        return interfaceDeclaration;
    }

    public void setInterfaceDeclaration(InterfaceDeclaration interfaceDeclaration) {
        this.interfaceDeclaration = interfaceDeclaration;
    }
    @Override
    public String toString() {
        if (importStatement != null) return importStatement.toString();
        if (componentDefinition != null) return componentDefinition.toString();
        if (decorator != null && exportStatement != null)
            return decorator.toString() + " " + exportStatement.toString();
        if (exportStatement != null) return exportStatement.toString();
        if (exportDefault != null) return exportDefault.toString();
        if (classDeclaration != null) return classDeclaration.toString();
        if (variableDeclaration != null) return variableDeclaration.toString();
        if (expressionStatement != null) return expressionStatement.toString();
        if (methodDeclaration != null) return methodDeclaration.toString();
        if (ifStatement != null) return ifStatement.toString();
        if (interfaceDeclaration != null) return interfaceDeclaration.toString();

        return "EmptyStatement";
    }
}
