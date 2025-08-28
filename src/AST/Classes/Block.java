package AST.Classes;

import java.util.ArrayList;
import java.util.List;

public class Block {
    /*
    block
    : LBRACE statementInside* RBRACE
    ;

     */
    private  String LBRACE;
    private String RBRACE;
    private List<StatementInside> statementInside=new ArrayList<>();

    public String getLBRACE() {
        return LBRACE;
    }

    public void setLBRACE(String LBRACE) {
        this.LBRACE = LBRACE;
    }

    public String getRBRACE() {
        return RBRACE;
    }

    public void setRBRACE(String RBRACE) {
        this.RBRACE = RBRACE;
    }

    public List<StatementInside> getStatementInside() {
        return statementInside;
    }

    public void setStatementInside(List<StatementInside> statementInside) {
        this.statementInside = statementInside;
    }

    @Override
    public String toString() {
        if (statementInside != null)
        return "Block{" +
                  LBRACE + '\'' +
                 statementInside +
                 RBRACE + '\'' +
                '}';
        return "Block{" +
                LBRACE + '\'' +
                RBRACE + '\'' +
                '}';
    }
}
