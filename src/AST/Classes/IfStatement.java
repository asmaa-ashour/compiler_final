package AST.Classes;

public class IfStatement {
    /*

ifStatement
    : IF LPAREN expression RPAREN block (ELSE block)?
    ;
     */
    private String IF;
    private String LPAREN;
    private String RPAREN;
    private String ELSE;
    private   Expression expression;
    private  Block block;

    public String getIF() {
        return IF;
    }

    public void setIF(String IF) {
        this.IF = IF;
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

    public String getELSE() {
        return ELSE;
    }

    public void setELSE(String ELSE) {
        this.ELSE = ELSE;
    }

    public Expression getExpression() {
        return expression;
    }

    public void setExpression(Expression expression) {
        this.expression = expression;
    }

    public Block getBlock(int i) {
        return block;
    }

    public void setBlock(Block block) {
        this.block = block;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(IF).append(" ").append(LPAREN)
                .append(expression != null ? expression.toString() : "")
                .append(RPAREN).append(" ")
                .append(block != null ? block.toString() : "");

        if (ELSE != null && block != null) {
            sb.append(" ").append(ELSE).append(" ").append(block.toString());
        }

        return sb.toString();
    }

}
