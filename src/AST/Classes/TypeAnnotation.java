package AST.Classes;

import java.util.ArrayList;
import java.util.List;

public class TypeAnnotation {
    /*
typeAnnotation
    : typeName (PIPE typeName)* (LBRACK RBRACK)*
    | typeName genericArguments (LBRACK RBRACK)*
    ;
     */
    private List<TypeName>typeName=new ArrayList<>();
    private  GenericArguments genericArguments;
    private  List<String>PIPE= new ArrayList<>();
    private  List<String>LBRACK= new ArrayList<>();
    private  List<String>RBRACK= new ArrayList<>();

    public List<TypeName> getTypeName() {
        return typeName;
    }

    public void setTypeName(List<TypeName> typeName) {
        this.typeName = typeName;
    }

    public GenericArguments getGenericArguments() {
        return genericArguments;
    }

    public void setGenericArguments(GenericArguments genericArguments) {
        this.genericArguments = genericArguments;
    }

    public List<String> getPIPE() {
        return PIPE;
    }

    public void setPIPE(List<String> PIPE) {
        this.PIPE = PIPE;
    }

    public List<String> getLBRACK() {
        return LBRACK;
    }

    public void setLBRACK(List<String> LBRACK) {
        this.LBRACK = LBRACK;
    }

    public List<String> getRBRACK() {
        return RBRACK;
    }

    public void setRBRACK(List<String> RBRACK) {
        this.RBRACK = RBRACK;
    }
      /*
typeAnnotation
    : typeName (PIPE typeName)* (LBRACK RBRACK)*
    | typeName genericArguments (LBRACK RBRACK)*
    ;
     */

    @Override
    public String toString() {
        if(genericArguments != null)
            return "TypeAnnotation{" +
                     typeName +
                     genericArguments +
                    ", LBRACK=" + LBRACK +
                    ", RBRACK=" + RBRACK +
                    '}';
        return "TypeAnnotation{" +
                "typeName=" + typeName +
                ", PIPE=" + PIPE +
                "typeName=" + typeName +
                ", LBRACK=" + LBRACK +
                ", RBRACK=" + RBRACK +
                '}';
    }
}
