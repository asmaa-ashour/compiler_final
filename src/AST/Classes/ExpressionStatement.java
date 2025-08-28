package AST.Classes;

public class ExpressionStatement {
    /*
    expressionStatement
    : expression SEMI_Q?
    ;

     */
private  Expression expression;
private  String SEMI_Q;

    public Expression getExpression() {
        return expression;
    }

    public void setExpression(Expression expression) {
        this.expression = expression;
    }

    public String getSEMI_Q() {
        return SEMI_Q;
    }

    public void setSEMI_Q(String SEMI_Q) {
        this.SEMI_Q = SEMI_Q;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        if (expression != null) {
            sb.append(expression.toString());
        }

        if (SEMI_Q != null) {
            sb.append(SEMI_Q);
        }

        return sb.toString();
    }

}
