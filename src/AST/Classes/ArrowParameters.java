package AST.Classes;

public class ArrowParameters {
    /*

arrowParameters
    : IDENTIFIER
    | LPAREN RPAREN
    | LPAREN parameterList RPAREN
    ;
     */
    private String IDENTIFIER;
    private String LPAREN;
    private String RPAREN;
    private ParameterList parameterList;

    public String getIDENTIFIER() {
        return IDENTIFIER;
    }

    public void setIDENTIFIER(String IDENTIFIER) {
        this.IDENTIFIER = IDENTIFIER;
    }

    public String getLPAREN() {
        return LPAREN;
    }

    public void setLPAREN(String LPAREN) {
        this.LPAREN = LPAREN;
    }

    public String getRPAREN() {
        return RPAREN;
    }

    public void setRPAREN(String RPAREN) {
        this.RPAREN = RPAREN;
    }

    public ParameterList getParameterList() {
        return parameterList;
    }

    public void setParameterList(ParameterList parameterList) {
        this.parameterList = parameterList;
    }

    @Override
    public String toString() {
        if(IDENTIFIER != null)
            return "ArrowParameters{" +
                     IDENTIFIER + '\'' +
                    '}';
        else  if(parameterList != null)
        return "ArrowParameters{" +
                LPAREN + '\'' +
                parameterList +
                RPAREN + '\'' +
                '}';
        return "ArrowParameters{" +
                 LPAREN + '\'' +
                 RPAREN + '\'' +
                '}';
    }
}
