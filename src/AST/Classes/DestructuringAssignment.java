package AST.Classes;

public class DestructuringAssignment {
    /*

destructuringAssignment
    : LBRACE destructuringList RBRACE
    ;
     */

    private  String LBRACE;
    private DestructuringList destructuringList;
    private  String RBRACE;

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

    public DestructuringList getDestructuringList() {
        return destructuringList;
    }

    public void setDestructuringList(DestructuringList destructuringList) {
        this.destructuringList = destructuringList;
    }

    @Override
    public String toString() {
        return "DestructuringAssignment{" +
                 LBRACE + '\'' +
                 destructuringList +
                 RBRACE + '\'' +
                '}';
    }
}
