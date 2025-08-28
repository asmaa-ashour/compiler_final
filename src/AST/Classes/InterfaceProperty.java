package AST.Classes;



public class InterfaceProperty {
    /*
    interfaceProperty
    : IDENTIFIER COLON typeAnnotation SEMI_Q?
    ;

     */
    private  String IDENTIFIER;
    private  String COLON;
    private TypeAnnotation typeAnnotation;
    private  String SEMI_Q;

    public String getIDENTIFIER() {
        return IDENTIFIER;
    }

    public void setIDENTIFIER(String IDENTIFIER) {
        this.IDENTIFIER = IDENTIFIER;
    }

    public String getCOLON() {
        return COLON;
    }

    public void setCOLON(String COLON) {
        this.COLON = COLON;
    }

    public TypeAnnotation getTypeAnnotation() {
        return typeAnnotation;
    }

    public void setTypeAnnotation(TypeAnnotation typeAnnotation) {
        this.typeAnnotation = typeAnnotation;
    }

    public String getSEMI_Q() {
        return SEMI_Q;
    }

    public void setSEMI_Q(String SEMI_Q) {
        this.SEMI_Q = SEMI_Q;
    }

    @Override
    public String toString() {
        if(SEMI_Q != null)
            return "InterfaceProperty{" +
                    IDENTIFIER + '\'' +
                    COLON + '\'' +
                    typeAnnotation +
                    SEMI_Q+
                    '\'' + '}';
        return "InterfaceProperty{" +
                 IDENTIFIER + '\'' +
                 COLON + '\'' +
                 typeAnnotation +
                '\'' + '}';


    }
}
