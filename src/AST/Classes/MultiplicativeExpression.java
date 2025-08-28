package AST.Classes;

import java.util.ArrayList;
import java.util.List;

public class MultiplicativeExpression {
    /*
    multiplicativeExpression
    : unaryExpression ((MULTIPLY | DIVIDE | MODULO) unaryExpression)*
    ;

     */

    private List<UnaryExpression>unaryExpression=new ArrayList<>();
    private List<String>MULTIPLY= new ArrayList<>();
    private List<String>DIVIDE= new ArrayList<>();
    private List<String>MODULO= new ArrayList<>();

    public List<UnaryExpression> getUnaryExpression() {
        return unaryExpression;
    }

    public void setUnaryExpression(List<UnaryExpression> unaryExpression) {
        this.unaryExpression = unaryExpression;
    }

    public List<String> getMULTIPLY() {
        return MULTIPLY;
    }

    public void setMULTIPLY(List<String> MULTIPLY) {
        this.MULTIPLY = MULTIPLY;
    }

    public List<String> getDIVIDE() {
        return DIVIDE;
    }

    public void setDIVIDE(List<String> DIVIDE) {
        this.DIVIDE = DIVIDE;
    }

    public List<String> getMODULO() {
        return MODULO;
    }

    public void setMODULO(List<String> MODULO) {
        this.MODULO = MODULO;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        if (!unaryExpression.isEmpty()) {
            sb.append(unaryExpression.get(0).toString()); // أول عنصر إجباري
        }

        int index = 1;

        // MULTIPLY
        if (MULTIPLY != null) {
            for (String op : MULTIPLY) {
                sb.append(" * ").append(unaryExpression.get(index++).toString());
            }
        }

        // DIVIDE
        if (DIVIDE != null) {
            for (String op : DIVIDE) {
                sb.append(" / ").append(unaryExpression.get(index++).toString());
            }
        }

        // MODULO
        if (MODULO != null) {
            for (String op : MODULO) {
                sb.append(" % ").append(unaryExpression.get(index++).toString());
            }
        }

        return sb.toString();
    }

}
