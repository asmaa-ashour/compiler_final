package AST.Classes;

public class Literal {
    /*

literal
    : STRING
    | NUMBER
    | BOOLEAN_LITERAL
    | NULL
    ;
     */
    private String STRING;
    private String NUMBER;
    private String BOOLEAN_LITERAL;
    private String NULL;

    public String getSTRING() {
        return STRING;
    }

    public void setSTRING(String STRING) {
        this.STRING = STRING;
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

    public String getNULL() {
        return NULL;
    }

    public void setNULL(String NULL) {
        this.NULL = NULL;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        if (STRING != null) {
            sb.append("STRING: ").append(STRING).append("\n");
        }
        if (NUMBER != null) {
            sb.append("NUMBER: ").append(NUMBER).append("\n");
        }
        if (BOOLEAN_LITERAL != null) {
            sb.append("BOOLEAN_LITERAL: ").append(BOOLEAN_LITERAL).append("\n");
        }
        if (NULL != null) {
            sb.append("NULL: ").append(NULL).append("\n");
        }

        return sb.toString();
    }
}
