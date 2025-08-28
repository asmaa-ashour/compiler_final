package AST.Classes;

public class Value {
    /*

value
    : expression
    | arrayLiteral
    | TEMPLATE_STR
    ;
     */
    private Expression expression;
    private ArrayLiteral arrayLiteral;
    private String TEMPLATE_STR;

    public Expression getExpression() {
        return expression;
    }

    public void setExpression(Expression expression) {
        this.expression = expression;
    }

    public ArrayLiteral getArrayLiteral() {
        return arrayLiteral;
    }

    public void setArrayLiteral(ArrayLiteral arrayLiteral) {
        this.arrayLiteral = arrayLiteral;
    }

    public String getTEMPLATE_STR() {
        return TEMPLATE_STR;
    }

    public void setTEMPLATE_STR(String TEMPLATE_STR) {
        this.TEMPLATE_STR = TEMPLATE_STR;
    }
      /*

value
    : expression
    | arrayLiteral
    | TEMPLATE_STR
    ;
     */

    @Override
    public String toString() {
        if(expression != null){
            return "Value{" +
                   expression +
                    '}';
        } if(arrayLiteral != null){
            return "Value{" +
                   arrayLiteral +
                    '}';
        }
        return "Value{" +
                   TEMPLATE_STR + '\'' +
                '}';
    }
}
