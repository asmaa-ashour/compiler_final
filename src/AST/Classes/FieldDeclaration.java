package AST.Classes;

public class FieldDeclaration {
    /*
    fieldDeclaration
    : accessModifier? IDENTIFIER (COLON typeAnnotation)? (ASSIGN expression)? SEMI_Q?;

     */
    private AccessModifier accessModifier;
    private  String IDENTIFIER;
    private  String COLON;
    private  String ASSIGN;
    private  String SEMI_Q;
    private  TypeAnnotation typeAnnotation;
    private  Expression expression;

    public AccessModifier getAccessModifier() {
        return accessModifier;
    }

    public void setAccessModifier(AccessModifier accessModifier) {
        this.accessModifier = accessModifier;
    }

    public String getIDENTIFIER() {
        return IDENTIFIER;
    }

    public void setIDENTIFIER(String IDENTIFIER) {
        this.IDENTIFIER = IDENTIFIER;
    }

    public String getCOLON() {
        return COLON;
    }

    public void setCOLON(String COLON) {
        this.COLON = COLON;
    }

    public String getASSIGN() {
        return ASSIGN;
    }

    public void setASSIGN(String ASSIGN) {
        this.ASSIGN = ASSIGN;
    }

    public String getSEMI_Q() {
        return SEMI_Q;
    }

    public void setSEMI_Q(String SEMI_Q) {
        this.SEMI_Q = SEMI_Q;
    }

    public TypeAnnotation getTypeAnnotation() {
        return typeAnnotation;
    }

    public void setTypeAnnotation(TypeAnnotation typeAnnotation) {
        this.typeAnnotation = typeAnnotation;
    }

    public Expression getExpression() {
        return expression;
    }

    public void setExpression(Expression expression) {
        this.expression = expression;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        if (accessModifier != null) {
            sb.append(accessModifier.toString()).append(" ");
        }

        if (IDENTIFIER != null) {
            sb.append(IDENTIFIER).append(" ");
        }

        if (typeAnnotation != null) {
            sb.append(": ").append(typeAnnotation.toString()).append(" ");
        }

        if (expression != null) {
            sb.append("= ").append(expression.toString()).append(" ");
        }

        if (SEMI_Q != null) {
            sb.append(SEMI_Q);
        }

        return sb.toString().trim();
    }

}
