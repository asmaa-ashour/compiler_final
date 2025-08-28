package AST.Classes;

import java.util.ArrayList;
import java.util.List;

public class DestructuringList {
    /*

destructuringList
    : IDENTIFIER (COMMA IDENTIFIER)*
    ;

     */
    private List<String>IDENTIFIER= new ArrayList<>();

    private List<String> COMMA= new ArrayList<>();

    public List<String> getIDENTIFIER() {
        return IDENTIFIER;
    }

    public void setIDENTIFIER(List<String> IDENTIFIER) {
        this.IDENTIFIER = IDENTIFIER;
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

        if (IDENTIFIER != null) {
            sb.append(String.join(",", IDENTIFIER));
        }

        return sb.toString();
    }

}
