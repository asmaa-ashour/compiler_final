package AST.Classes;

import java.util.ArrayList;
import java.util.List;

public class EqualityExpression {
    /*
    equalityExpression
    : relationalExpression ((EQ | NE | EQ_STRICT | NE_STRICT) relationalExpression)*
    ;

     */
    private List<RelationalExpression>relationalExpression=new ArrayList<>();
    private List<String>EQ= new ArrayList<>();
    private List<String>NE= new ArrayList<>();
    private List<String>EQ_STRICT= new ArrayList<>();
    private List<String>NE_STRICT= new ArrayList<>();

    public List<RelationalExpression> getRelationalExpression() {
        return relationalExpression;
    }

    public void setRelationalExpression(List<RelationalExpression> relationalExpression) {
        this.relationalExpression = relationalExpression;
    }

    public List<String> getEQ() {
        return EQ;
    }

    public void setEQ(List<String> EQ) {
        this.EQ = EQ;
    }

    public List<String> getNE() {
        return NE;
    }

    public void setNE(List<String> NE) {
        this.NE = NE;
    }

    public List<String> getEQ_STRICT() {
        return EQ_STRICT;
    }

    public void setEQ_STRICT(List<String> EQ_STRICT) {
        this.EQ_STRICT = EQ_STRICT;
    }

    public List<String> getNE_STRICT() {
        return NE_STRICT;
    }

    public void setNE_STRICT(List<String> NE_STRICT) {
        this.NE_STRICT = NE_STRICT;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        for (RelationalExpression expr : relationalExpression) {
            sb.append(expr.toString()).append(" ");
        }

        if (EQ != null) sb.append(String.join(" ", EQ)).append(" ");
        if (NE != null) sb.append(String.join(" ", NE)).append(" ");
        if (EQ_STRICT != null) sb.append(String.join(" ", EQ_STRICT)).append(" ");
        if (NE_STRICT != null) sb.append(String.join(" ", NE_STRICT)).append(" ");

        return sb.toString().trim();
    }


}
