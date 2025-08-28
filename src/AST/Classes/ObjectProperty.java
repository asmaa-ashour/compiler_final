package AST.Classes;

public class ObjectProperty {
    /*
    objectProperty
    : IDENTIFIER COLON expression
    | SPREAD expression
    ;
     */
    private String IDENTIFIER;
    private String COLON;
    private Expression expression;
    private String SPREAD;

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

    public Expression getExpression() {
        return expression;
    }

    public void setExpression(Expression expression) {
        this.expression = expression;
    }

    public String getSPREAD() {
        return SPREAD;
    }

    public void setSPREAD(String SPREAD) {
        this.SPREAD = SPREAD;
    }
    @Override
    public String toString() {
        if (SPREAD != null) {
            return SPREAD + expression.toString();
        } else {
            return IDENTIFIER + COLON + " " + expression.toString();
        }
    }

}
