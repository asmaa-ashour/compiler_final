package AST.Classes;

public class Decorator {
    /*

decorator
    : AT IDENTIFIER LPAREN objectLiteral RPAREN
    ;
     */
    private  String AT;
    private  String IDENTIFIER;
    private  String LPAREN;
    private ObjectLiteral objectLiteral;
    private  String RPAREN;

    public String getAT() {
        return AT;
    }

    public void setAT(String AT) {
        this.AT = AT;
    }

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

    public ObjectLiteral getObjectLiteral() {
        return objectLiteral;
    }

    public void setObjectLiteral(ObjectLiteral objectLiteral) {
        this.objectLiteral = objectLiteral;
    }

    @Override
    public String toString() {
        return "Decorator{" +
                 AT + '\'' +
                 IDENTIFIER + '\'' +
                 LPAREN + '\'' +
                 objectLiteral +
                 RPAREN + '\'' +
                '}';
    }
}
