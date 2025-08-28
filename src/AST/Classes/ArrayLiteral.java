package AST.Classes;

import java.util.ArrayList;
import java.util.List;

public class ArrayLiteral {
    /*

arrayLiteral
    : LBRACK (expression (COMMA expression)* | SPREAD expression (COMMA expression)*)* RBRACK
    ;
     */

    private String LBRACK;
    private String RBRACK;
    private List<Expression>expression=new ArrayList<>();
    private List<String>COMMA=new ArrayList<>();
    private List<String>SPREAD=new ArrayList<>();

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

    public List<Expression> getExpression() {
        return expression;
    }

    public void setExpression(List<Expression> expression) {
        this.expression = expression;
    }

    public List<String> getCOMMA() {
        return COMMA;
    }

    public void setCOMMA(List<String> COMMA) {
        this.COMMA = COMMA;
    }

    public List<String> getSPREAD() {
        return SPREAD;
    }

    public void setSPREAD(List<String> SPREAD) {
        this.SPREAD = SPREAD;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(LBRACK != null ? LBRACK : "[");

        for (int i = 0; i < expression.size(); i++) {
            // إذا عندنا SPREAD في نفس الموضع نطبعها قبل التعبير
            if (SPREAD != null && i < SPREAD.size() && SPREAD.get(i) != null) {
                sb.append(SPREAD.get(i)).append(" ");
            }

            sb.append(expression.get(i).toString());

            if (COMMA != null && i < COMMA.size() && COMMA.get(i) != null) {
                sb.append(COMMA.get(i)).append(" ");
            }
        }

        sb.append(RBRACK != null ? RBRACK : "]");
        return sb.toString().trim();
    }

}
