package AST.Classes;

public class PrimaryExpressionWithAssertion {
    /*
primaryExpressionWithAssertion
    : primaryExpression postfixAssertion?
    ;
     */
    private  PrimaryExpression primaryExpression;
    private PostfixAssertion postfixAssertion;

    public PrimaryExpression getPrimaryExpression() {
        return primaryExpression;
    }

    public void setPrimaryExpression(PrimaryExpression primaryExpression) {
        this.primaryExpression = primaryExpression;
    }

    public PostfixAssertion getPostfixAssertion() {
        return postfixAssertion;
    }

    public void setPostfixAssertion(PostfixAssertion postfixAssertion) {
        this.postfixAssertion = postfixAssertion;
    }

    @Override
    public String toString() {
        if(postfixAssertion != null)
            return "PrimaryExpressionWithAssertion{" +
                    "primaryExpression=" + primaryExpression +
                    ", postfixAssertion=" + postfixAssertion +
                    '}';

        return "PrimaryExpressionWithAssertion{" +
                "primaryExpression=" + primaryExpression +
                '}';
    }
}
