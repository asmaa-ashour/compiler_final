package AST.Classes;

import java.util.ArrayList;
import java.util.List;

public class TypeArguments {
    /*
    typeArguments
    : typeAnnotationWithArray (COMMA typeAnnotationWithArray)*
    ;

     */
    private List<TypeAnnotationWithArray>typeAnnotationWithArray=new ArrayList<>();
    private  List<String>COMMA= new ArrayList<>();

    public List<TypeAnnotationWithArray> getTypeAnnotationWithArray() {
        return typeAnnotationWithArray;
    }

    public void setTypeAnnotationWithArray(List<TypeAnnotationWithArray> typeAnnotationWithArray) {
        this.typeAnnotationWithArray = typeAnnotationWithArray;
    }

    public List<String> getCOMMA() {
        return COMMA;
    }

    public void setCOMMA(List<String> COMMA) {
        this.COMMA = COMMA;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < typeAnnotationWithArray.size(); i++) {
            sb.append(typeAnnotationWithArray.get(i));
            if (COMMA != null && i < COMMA.size()) {
                sb.append(COMMA.get(i)).append(" ");
            }
        }
        return sb.toString();
    }

}
