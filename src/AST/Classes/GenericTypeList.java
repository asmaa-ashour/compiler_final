package AST.Classes;

import java.util.ArrayList;
import java.util.List;

public class GenericTypeList {
    /*
    genericTypeList
    : typeAnnotationWithArray (COMMA typeAnnotationWithArray)*
    ;

     */

    private List<TypeAnnotationWithArray> typeAnnotationWithArray=new ArrayList<>();

    private List<String>COMMA= new ArrayList<>();

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
        if (typeAnnotationWithArray == null || typeAnnotationWithArray.isEmpty()) {
            return "";
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < typeAnnotationWithArray.size(); i++) {
            sb.append(typeAnnotationWithArray.get(i).toString());
            if (i < typeAnnotationWithArray.size() - 1) {
                sb.append(", "); // إضافة فاصلة بين العناصر
            }
        }
        return sb.toString();
    }

}
