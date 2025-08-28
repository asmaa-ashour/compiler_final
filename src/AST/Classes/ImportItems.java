package AST.Classes;

import java.util.ArrayList;
import java.util.List;

public class ImportItems {
    /*
    importItems
    : IDENTIFIER (COMMA IDENTIFIER)* COMMA?
    ;

     */
    private List<String> COMMA = new ArrayList<>();
    private List<String> IDENTIFIER = new ArrayList<>();

    public List<String> getCOMMA() {
        return COMMA;
    }

    public void setCOMMA(List<String> COMMA) {
        this.COMMA = COMMA;
    }

    public List<String> getIDENTIFIER() {
        return IDENTIFIER;
    }

    public void setIDENTIFIER(List<String> IDENTIFIER) {
        this.IDENTIFIER = IDENTIFIER;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ImportItems: ");

        for (int i = 0; i < IDENTIFIER.size(); i++) {
            sb.append(IDENTIFIER.get(i));
            if (i < COMMA.size()) { // إذا في فاصلة بعدها
                sb.append(COMMA.get(i)).append(" ");
            }
        }

        return sb.toString().trim();
    }

}
