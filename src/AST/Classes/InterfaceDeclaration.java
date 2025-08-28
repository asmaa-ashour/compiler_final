package AST.Classes;

public class InterfaceDeclaration {
    /*
interfaceDeclaration
    : EXPORT? INTERFACE IDENTIFIER LBRACE interfaceBody RBRACE
    ;
     */
    private  String EXPORT;
    private  String INTERFACE;
    private  String IDENTIFIER;
    private  String LBRACE;
    private  String RBRACE;
    private  InterfaceBody interfaceBody;

    public String getEXPORT() {
        return EXPORT;
    }

    public void setEXPORT(String EXPORT) {
        this.EXPORT = EXPORT;
    }

    public String getINTERFACE() {
        return INTERFACE;
    }

    public void setINTERFACE(String INTERFACE) {
        this.INTERFACE = INTERFACE;
    }

    public String getIDENTIFIER() {
        return IDENTIFIER;
    }

    public void setIDENTIFIER(String IDENTIFIER) {
        this.IDENTIFIER = IDENTIFIER;
    }

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

    public InterfaceBody getInterfaceBody() {
        return interfaceBody;
    }

    public void setInterfaceBody(InterfaceBody interfaceBody) {
        this.interfaceBody = interfaceBody;
    }

    @Override
    public String toString() {
        if(EXPORT != null)
            return "InterfaceDeclaration{" +
                     EXPORT + '\'' +
                     INTERFACE + '\'' +
                     IDENTIFIER + '\'' +
                     LBRACE + '\'' +
                     interfaceBody +
                    RBRACE + '\'' +
                    '}';
        return "InterfaceDeclaration{" +
                 INTERFACE + '\'' +
                 IDENTIFIER + '\'' +
                 LBRACE + '\'' +
                 interfaceBody +
                 RBRACE + '\'' +
                '}';
    }
}
