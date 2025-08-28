package AST.Classes;

public class ComponentDefinition {
    /*
    componentDefinition
    : COMPONENT LPAREN componentMetadata RPAREN classDeclaration?
    ;

     */
    private String COMPONENT;
    private  String LPAREN;
    private  String RPAREN;
    private ComponentMetadata componentMetadata;
    private ClassDeclaration classDeclaration;

    public String getCOMPONENT() {
        return COMPONENT;
    }

    public void setCOMPONENT(String COMPONENT) {
        this.COMPONENT = COMPONENT;
    }

    public String getLPAREN() {
        return LPAREN;
    }

    public void setLPAREN(String LPAREN) {
        this.LPAREN = LPAREN;
    }

    public String getRPAREN() {
        return RPAREN;
    }

    public void setRPAREN(String RPAREN) {
        this.RPAREN = RPAREN;
    }

    public ComponentMetadata getComponentMetadata() {
        return componentMetadata;
    }

    public void setComponentMetadata(ComponentMetadata componentMetadata) {
        this.componentMetadata = componentMetadata;
    }

    public ClassDeclaration getClassDeclaration() {
        return classDeclaration;
    }

    public void setClassDeclaration(ClassDeclaration classDeclaration) {
        this.classDeclaration = classDeclaration;
    }

    @Override
    public String toString() {
        if(classDeclaration != null)
        return "ComponentDefinition{" +
                 COMPONENT + '\'' +
                 LPAREN + '\'' +
                 componentMetadata +
                 RPAREN + '\'' +
                 classDeclaration +
                '}';
    return "ComponentDefinition{" +
             COMPONENT + '\'' +
             LPAREN + '\'' +
             componentMetadata +
             RPAREN + '\'' +

            '}';
}
}
