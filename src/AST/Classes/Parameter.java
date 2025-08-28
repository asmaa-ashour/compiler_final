package AST.Classes;

import java.util.List;

public class Parameter {
    /*

parameter
    : IDENTIFIER (COLON typeAnnotation)?
    ;
     */
    private String IDENTIFIER;
    private String COLON;
    private TypeAnnotation typeAnnotation;

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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        if (IDENTIFIER != null) {
            sb.append(IDENTIFIER);
        }

        if (COLON != null && typeAnnotation != null) {
            sb.append(" ").append(COLON).append(" ").append(typeAnnotation.toString());
        }

        return sb.toString().trim();
    }

}
