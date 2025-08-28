package AST.Classes;

public class Attribute {
    /*
     attribute
                : IDENTIFIER
                | IDENTIFIER ASSIGN ( IDENTIFIER| NUMBER | BOOLEAN_LITERAL |STRING )
                ;
     */
    private String IDENTIFIER;
    private String ASSIGN;
    private String NUMBER;
    private String BOOLEAN_LITERAL;
    private String STRING;

    public String getIDENTIFIER() {
        return IDENTIFIER;
    }

    public void setIDENTIFIER(String IDENTIFIER) {
        this.IDENTIFIER = IDENTIFIER;
    }

    public String getASSIGN() {
        return ASSIGN;
    }

    public void setASSIGN(String ASSIGN) {
        this.ASSIGN = ASSIGN;
    }

    public String getNUMBER() {
        return NUMBER;
    }

    public void setNUMBER(String NUMBER) {
        this.NUMBER = NUMBER;
    }

    public String getBOOLEAN_LITERAL() {
        return BOOLEAN_LITERAL;
    }

    public void setBOOLEAN_LITERAL(String BOOLEAN_LITERAL) {
        this.BOOLEAN_LITERAL = BOOLEAN_LITERAL;
    }

    public String getSTRING() {
        return STRING;
    }

    public void setSTRING(String STRING) {
        this.STRING = STRING;
    }

    @Override
    public String toString() {
        if (ASSIGN != null) {
            String value = NUMBER != null ? NUMBER
                    : BOOLEAN_LITERAL != null ? BOOLEAN_LITERAL
                    : STRING != null ? STRING
                    : "";
            return IDENTIFIER + " " + ASSIGN + " " + value;
        } else {
            return IDENTIFIER;
        }
    }

}
