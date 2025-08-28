package AST.Classes;

import java.util.List;

public class RelationalExpression {
    /*
    relationalExpression
    : additiveExpression
    ;
     */
    private AdditiveExpression additiveExpression;
    public AdditiveExpression getAdditiveExpression() {
        return additiveExpression;
    }

    public void setAdditiveExpression(AdditiveExpression additiveExpression) {
        this.additiveExpression = additiveExpression;
    }

    @Override
    public String toString() {
        return "RelationalExpression{" +
                additiveExpression +
                '}';
    }
}
