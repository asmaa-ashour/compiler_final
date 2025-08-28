package AST.Classes;

public class ExportStatement {
    /*
    exportStatement
    : EXPORT (classDeclaration | variableDeclaration)
    ;
     */
private  String EXPORT;
private ClassDeclaration classDeclaration;
private VariableDeclaration variableDeclaration;

    public String getEXPORT() {
        return EXPORT;
    }

    public void setEXPORT(String EXPORT) {
        this.EXPORT = EXPORT;
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

    @Override
    public String toString() {
        if(classDeclaration != null)
        return "ExportStatement{" +
                EXPORT + '\'' +
                 classDeclaration +
                '}';
        return "ExportStatement{" +
                 EXPORT + '\'' +
                variableDeclaration +
                '}';
    }
}
