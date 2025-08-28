package AST.Classes;

public class ExportDefault {
    /*
    exportDefault
    : EXPORT DEFAULT expression SEMI_Q?
    ;
     */
    private String EXPORT;
    private String DEFAULT;
    private String SEMI_Q;
    private Expression expression;

    public String getEXPORT() {
        return EXPORT;
    }

    public void setEXPORT(String EXPORT) {
        this.EXPORT = EXPORT;
    }

    public String getDEFAULT() {
        return DEFAULT;
    }

    public void setDEFAULT(String DEFAULT) {
        this.DEFAULT = DEFAULT;
    }

    public String getSEMI_Q() {
        return SEMI_Q;
    }

    public void setSEMI_Q(String SEMI_Q) {
        this.SEMI_Q = SEMI_Q;
    }

    public Expression getExpression() {
        return expression;
    }

    public void setExpression(Expression expression) {
        this.expression = expression;
    }

    @Override
    public String toString() {
        if(SEMI_Q != null)
        return "ExportDefault{" +
                 EXPORT + '\'' +
                 DEFAULT + '\'' +
                 expression +'\''+
                 SEMI_Q + '\'' +
                '}';
        return "ExportDefault{" +
                EXPORT + '\'' +
                DEFAULT + '\'' +
                expression +
                '}';
    }
}
