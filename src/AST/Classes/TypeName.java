package AST.Classes;

public class TypeName {
    /*
typeName
    : IDENTIFIER
    | STRING_TYPE
    | NUMBER_TYPE
    | BOOLEAN_TYPE
    | VOID
    | NULL
    | IDENTIFIER genericArguments? (LBRACK RBRACK)?
    ;
     */

    private  String IDENTIFIER;
    private  String STRING_TYPE;
    private  String NUMBER_TYPE;
    private  String BOOLEAN_TYPE;
    private  String VOID;
    private  String NULL;
    private  String LBRACK;
    private  String RBRACK;
    private  GenericArguments genericArguments;

    public String getIDENTIFIER() {
        return IDENTIFIER;
    }

    public void setIDENTIFIER(String IDENTIFIER) {
        this.IDENTIFIER = IDENTIFIER;
    }

    public String getSTRING_TYPE() {
        return STRING_TYPE;
    }

    public void setSTRING_TYPE(String STRING_TYPE) {
        this.STRING_TYPE = STRING_TYPE;
    }

    public String getNUMBER_TYPE() {
        return NUMBER_TYPE;
    }

    public void setNUMBER_TYPE(String NUMBER_TYPE) {
        this.NUMBER_TYPE = NUMBER_TYPE;
    }

    public String getBOOLEAN_TYPE() {
        return BOOLEAN_TYPE;
    }

    public void setBOOLEAN_TYPE(String BOOLEAN_TYPE) {
        this.BOOLEAN_TYPE = BOOLEAN_TYPE;
    }

    public String getVOID() {
        return VOID;
    }

    public void setVOID(String VOID) {
        this.VOID = VOID;
    }

    public String getNULL() {
        return NULL;
    }

    public void setNULL(String NULL) {
        this.NULL = NULL;
    }

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

    public GenericArguments getGenericArguments() {
        return genericArguments;
    }

    public void setGenericArguments(GenericArguments genericArguments) {
        this.genericArguments = genericArguments;
    }

    @Override
    public String toString() {
        if(STRING_TYPE != null){
            return "TypeName{" +
                    STRING_TYPE +
                    '}';
        }else if(NUMBER_TYPE != null){
            return "TypeName{" +
                    NUMBER_TYPE +
                    '}';
        }else if(BOOLEAN_TYPE != null){
            return "TypeName{" +
                    BOOLEAN_TYPE +
                    '}';
        }else if(VOID != null){
            return "TypeName{" +
                    VOID +
                    '}';
        }else if(NULL != null){
            return "TypeName{" +
                    NULL +
                    '}';
        }
      //  IDENTIFIER genericArguments? (LBRACK RBRACK)?
        if(genericArguments !=null && LBRACK != null){
            return "TypeName{" +
                    IDENTIFIER + '\'' +
                    genericArguments +
                    LBRACK + '\'' +
                    RBRACK + '\'' +

                    '}';
        }
        return "TypeName{" +
                IDENTIFIER + '\'' +
                genericArguments +
                LBRACK + '\'' +
                RBRACK + '\'' +

                '}';
    }
}
