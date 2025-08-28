package AST.Classes;


public class ComponentMetadataProperty {
    /*
    componentMetadataProperty
    : SELECTOR COLON STRING
    | STANDALONE COLON BOOLEAN_LITERAL
    | IMPORTS COLON value
    | TEMPLATE COLON TEMPLATE_STR
    | STYLE_URLS COLON arrayLiteral
    | IDENTIFIER COLON value
    ;
     */
    private  String SELECTOR;
    private  String COLON;
    private  String STRING;
    private  String STANDALONE;
    private  String BOOLEAN_LITERAL;
    private  String IMPORTS;
    private  String TEMPLATE;
    private  String TEMPLATE_STR;
    private  String IDENTIFIER;
    private ArrayLiteral arrayLiteral;
    private Value value;
    private String STYLE_URLS;

    public String getSELECTOR() {
        return SELECTOR;
    }

    public void setSELECTOR(String SELECTOR) {
        this.SELECTOR = SELECTOR;
    }

    public String getCOLON() {
        return COLON;
    }

    public void setCOLON(String COLON) {
        this.COLON = COLON;
    }

    public String getSTRING() {
        return STRING;
    }

    public void setSTRING(String STRING) {
        this.STRING = STRING;
    }

    public String getSTANDALONE() {
        return STANDALONE;
    }

    public void setSTANDALONE(String STANDALONE) {
        this.STANDALONE = STANDALONE;
    }

    public String getBOOLEAN_LITERAL() {
        return BOOLEAN_LITERAL;
    }

    public void setBOOLEAN_LITERAL(String BOOLEAN_LITERAL) {
        this.BOOLEAN_LITERAL = BOOLEAN_LITERAL;
    }

    public String getIMPORTS() {
        return IMPORTS;
    }

    public void setIMPORTS(String IMPORTS) {
        this.IMPORTS = IMPORTS;
    }

    public String getTEMPLATE() {
        return TEMPLATE;
    }

    public void setTEMPLATE(String TEMPLATE) {
        this.TEMPLATE = TEMPLATE;
    }

    public String getTEMPLATE_STR() {
        return TEMPLATE_STR;
    }

    public void setTEMPLATE_STR(String TEMPLATE_STR) {
        this.TEMPLATE_STR = TEMPLATE_STR;
    }

    public String getIDENTIFIER() {
        return IDENTIFIER;
    }

    public void setIDENTIFIER(String IDENTIFIER) {
        this.IDENTIFIER = IDENTIFIER;
    }

    public ArrayLiteral getArrayLiteral() {
        return arrayLiteral;
    }

    public void setArrayLiteral(ArrayLiteral arrayLiteral) {
        this.arrayLiteral = arrayLiteral;
    }

    public Value getValue() {
        return value;
    }

    public void setValue(Value value) {
        this.value = value;
    }

    public String getSTYLE_URLS() {
        return STYLE_URLS;
    }

    public void setSTYLE_URLS(String STYLE_URLS) {
        this.STYLE_URLS = STYLE_URLS;
    }

    @Override
    public String toString() {
        // : SELECTOR COLON STRING
        if(SELECTOR != null){
            return "ComponentMetadataProperty{" +
                     SELECTOR + '\'' +
                    COLON + '\'' +
                    STRING + '\'' +
                    '}';
        }    //|STANDALONE COLON BOOLEAN_LITERAL
        else if (STANDALONE != null) {
            return "ComponentMetadataProperty{" +
                     STANDALONE + '\'' +
                     COLON + '\'' +
                     BOOLEAN_LITERAL + '\'' +
                    '}';
        }
        //| IMPORTS COLON value
        else if (IMPORTS != null) {
            return "ComponentMetadataProperty{" +
                     IMPORTS + '\'' +
                     COLON + '\'' +
                     value +
                    '}';
        }// | TEMPLATE COLON TEMPLATE_STR
        else if (TEMPLATE != null) {
            return "ComponentMetadataProperty{" +
                    TEMPLATE + '\'' +
                    COLON + '\'' +
                    TEMPLATE_STR + '\'' +
                    '}';
        }// | STYLE_URLS COLON arrayLiteral
        else if (STYLE_URLS != null) {
            return "ComponentMetadataProperty{" +
                     STYLE_URLS + '\'' +
                     COLON + '\'' +
                     arrayLiteral +
                    '}';
        }//  | IDENTIFIER COLON value
            return "ComponentMetadataProperty{" +
                    IDENTIFIER + '\'' +
                    COLON + '\'' +
                    value +
                    '}';
    }
}
