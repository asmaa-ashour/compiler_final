package AST.Classes;

public class ClassElement {
    /*

classElement
    : constructorDeclaration
    | methodDeclaration
    | fieldDeclaration
    ;
     */
    private ConstructorDeclaration constructorDeclaration;
    private MethodDeclaration methodDeclaration;
    private FieldDeclaration fieldDeclaration;

    public ConstructorDeclaration getConstructorDeclaration() {
        return constructorDeclaration;
    }

    public void setConstructorDeclaration(ConstructorDeclaration constructorDeclaration) {
        this.constructorDeclaration = constructorDeclaration;
    }

    public MethodDeclaration getMethodDeclaration() {
        return methodDeclaration;
    }

    public void setMethodDeclaration(MethodDeclaration methodDeclaration) {
        this.methodDeclaration = methodDeclaration;
    }

    public FieldDeclaration getFieldDeclaration() {
        return fieldDeclaration;
    }

    public void setFieldDeclaration(FieldDeclaration fieldDeclaration) {
        this.fieldDeclaration = fieldDeclaration;
    }

    @Override
    public String toString() {
        if(constructorDeclaration != null)
            return "ClassElement{" +
                     constructorDeclaration +
                    '}';
        else if (methodDeclaration != null) return "ClassElement{" +
                 methodDeclaration +
                '}';
        return "ClassElement{" +
                 fieldDeclaration +
                '}';
    }
}
