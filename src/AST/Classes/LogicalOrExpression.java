package AST.Classes;

import java.util.ArrayList;
import java.util.List;

public class LogicalOrExpression {
    /*

logicalOrExpression
    : logicalAndExpression (LOGICAL_OR logicalAndExpression)*
    ;

     */
    private List<LogicalAndExpression>logicalAndExpression=new ArrayList<>();
    private  List<String>LOGICAL_OR= new ArrayList<>();

    public List<LogicalAndExpression> getLogicalAndExpression() {
        return logicalAndExpression;
    }

    public void setLogicalAndExpression(List<LogicalAndExpression> logicalAndExpression) {
        this.logicalAndExpression = logicalAndExpression;
    }

    public List<String> getLOGICAL_OR() {
        return LOGICAL_OR;
    }

    public void setLOGICAL_OR(List<String> LOGICAL_OR) {
        this.LOGICAL_OR = LOGICAL_OR;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        if (!logicalAndExpression.isEmpty()) {
            sb.append(logicalAndExpression.get(0).toString());

            // نربط كل andExpression مع الـ ORs اللي بيناتهم
            for (int i = 1; i < logicalAndExpression.size(); i++) {
                String op = (LOGICAL_OR != null && LOGICAL_OR.size() >= i) ? LOGICAL_OR.get(i - 1) : "||";
                sb.append(" ").append(op).append(" ").append(logicalAndExpression.get(i).toString());
            }
        }

        return sb.toString();
    }
}
