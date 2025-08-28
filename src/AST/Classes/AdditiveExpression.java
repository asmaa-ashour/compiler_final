package AST.Classes;

import java.util.ArrayList;
import java.util.List;

public class AdditiveExpression {
    /*

additiveExpression
    : multiplicativeExpression ((PLUS | MINUS) multiplicativeExpression)*
    ;
     */

    private List<MultiplicativeExpression>multiplicativeExpression=new ArrayList<>();
    private List<String>PLUS= new ArrayList<>();
    private List<String>MINUS= new ArrayList<>();

    public List<MultiplicativeExpression> getMultiplicativeExpression() {
        return multiplicativeExpression;
    }

    public void setMultiplicativeExpression(List<MultiplicativeExpression> multiplicativeExpression) {
        this.multiplicativeExpression = multiplicativeExpression;
    }

    public List<String> getPLUS() {
        return PLUS;
    }

    public void setPLUS(List<String> PLUS) {
        this.PLUS = PLUS;
    }

    public List<String> getMINUS() {
        return MINUS;
    }

    public void setMINUS(List<String> MINUS) {
        this.MINUS = MINUS;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < multiplicativeExpression.size(); i++) {
            sb.append(multiplicativeExpression.get(i).toString());
            // نضيف العملية إذا موجودة
            if (i < PLUS.size()) {
                sb.append(" ").append(PLUS.get(i)).append(" ");
            } else if (i < MINUS.size()) {
                sb.append(" ").append(MINUS.get(i)).append(" ");
            }
        }

        return sb.toString();
    }

}
