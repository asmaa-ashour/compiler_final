package AST.Classes;

public class ArrowBody {
    /*

arrowBody
    : expression
    | block
    ;
     */
    private Expression expression ;
    private Block block;

    public Expression getExpression() {
        return expression;
    }

    public void setExpression(Expression expression) {
        this.expression = expression;
    }

    public Block getBlock() {
        return block;
    }

    public void setBlock(Block block) {
        this.block = block;
    }

    @Override
    public String toString() {
        if(expression != null)
        return "ArrowBody{" +
                 expression +
                '}';
        return "ArrowBody{" +
                 block +
                '}';
    }
}
