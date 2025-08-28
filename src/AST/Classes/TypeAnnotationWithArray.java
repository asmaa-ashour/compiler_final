package AST.Classes;

public class TypeAnnotationWithArray {
    /*
    typeAnnotationWithArray
    : typeAnnotation (LBRACK RBRACK)?
    ;
     */
    private TypeAnnotation typeAnnotation;
    private  String LBRACK;
    private  String RBRACK;

    public TypeAnnotation getTypeAnnotation() {
        return typeAnnotation;
    }

    public void setTypeAnnotation(TypeAnnotation typeAnnotation) {
        this.typeAnnotation = typeAnnotation;
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

    @Override
    public String toString() {
        if(LBRACK != null)
            return "TypeAnnotationWithArray{" +
                    "typeAnnotation=" + typeAnnotation +
                    ", LBRACK='" + LBRACK + '\'' +
                    ", RBRACK='" + RBRACK + '\'' +
                    '}';
        return "TypeAnnotationWithArray{" +
                "typeAnnotation=" + typeAnnotation +
                '}';
    }
}
