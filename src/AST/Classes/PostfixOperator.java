package AST.Classes;

public class PostfixOperator {
    /*
    postfixOperator
    : DOT IDENTIFIER
    | LPAREN argumentList? RPAREN
    | LBRACK expression RBRACK
    ;
     */

    private String DOT;
    private String IDENTIFIER;
    private String LPAREN;
    private String RPAREN;
    private String LBRACK;
    private String RBRACK;
    private ArgumentList argumentList;
    private Expression expression;

    public String getDOT() {
        return DOT;
    }

    public void setDOT(String DOT) {
        this.DOT = DOT;
    }

    public String getIDENTIFIER() {
        return IDENTIFIER;
    }

    public void setIDENTIFIER(String IDENTIFIER) {
        this.IDENTIFIER = IDENTIFIER;
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

    public String getLBRACK() {
        return LBRACK;
    }

    public void setLBRACK(String LBRACK) {
        this.LBRACK = LBRACK;
    }

    public String getRBRACK() {
        return RBRACK;
    }

    public void setRBRACK(String RBRACK) {
        this.RBRACK = RBRACK;
    }

    public ArgumentList getArgumentList() {
        return argumentList;
    }

    public void setArgumentList(ArgumentList argumentList) {
        this.argumentList = argumentList;
    }

    public Expression getExpression() {
        return expression;
    }

    public void setExpression(Expression expression) {
        this.expression = expression;
    }
    /*
       postfixOperator
       : DOT IDENTIFIER
       | LPAREN argumentList? RPAREN
       | LBRACK expression RBRACK
       ;
        */
    @Override
    public String toString() {
        if(argumentList != null){
            return "PostfixOperator{" +
                     LPAREN + '\'' +
                     argumentList +
                     RPAREN + '\'' +
                    '}';
        } else if (expression != null) {
            return "PostfixOperator{" +
                     LBRACK + '\'' +
                     expression +
                     RBRACK + '\'' +
                    '}';
        }
        return "PostfixOperator{" +
                 DOT + '\'' +
                 IDENTIFIER + '\'' +
                '}';
    }
}
