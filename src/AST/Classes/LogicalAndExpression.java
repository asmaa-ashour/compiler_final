package AST.Classes;

import java.util.ArrayList;
import java.util.List;

public class LogicalAndExpression {
    /*

logicalAndExpression
    : equalityExpression (LOGICAL_AND equalityExpression)*
    ;
     */
    private List<EqualityExpression>equalityExpression=new ArrayList<>();
    private List<String>LOGICAL_AND= new ArrayList<>();

    public List<EqualityExpression> getEqualityExpression() {
        return equalityExpression;
    }

    public void setEqualityExpression(List<EqualityExpression> equalityExpression) {
        this.equalityExpression = equalityExpression;
    }

    public List<String> getLOGICAL_AND() {
        return LOGICAL_AND;
    }

    public void setLOGICAL_AND(List<String> LOGICAL_AND) {
        this.LOGICAL_AND = LOGICAL_AND;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        if (!equalityExpression.isEmpty()) {
            sb.append(equalityExpression.get(0).toString());

            // نربط بقية التعابير مع الـ &&
            for (int i = 1; i < equalityExpression.size(); i++) {
                String op = (LOGICAL_AND != null && LOGICAL_AND.size() >= i)
                        ? LOGICAL_AND.get(i - 1)
                        : "&&";
                sb.append(" ").append(op).append(" ").append(equalityExpression.get(i).toString());
            }
        }

        return sb.toString();
    }
}
