package AST.Classes;

import java.util.ArrayList;
import java.util.List;

public class ObjectLiteral {
    /*
    objectLiteral
    : LBRACE (objectProperty (COMMA | SEMI_Q)?)* COMMA? RBRACE
    ;
     */
    private String LBRACE;
    private String RBRACE;
    private List<String> COMMA= new ArrayList<>();
    private List<String>SEMI_Q= new ArrayList<>();
    private List<ObjectProperty>objectProperty=new ArrayList<>();

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

    public List<String> getCOMMA() {
        return COMMA;
    }

    public void setCOMMA(List<String> COMMA) {
        this.COMMA = COMMA;
    }

    public List<String> getSEMI_Q() {
        return SEMI_Q;
    }

    public void setSEMI_Q(List<String> SEMI_Q) {
        this.SEMI_Q = SEMI_Q;
    }

    public List<ObjectProperty> getObjectProperty() {
        return objectProperty;
    }

    public void setObjectProperty(List<ObjectProperty> objectProperty) {
        this.objectProperty = objectProperty;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(LBRACE).append(" ");

        for (int i = 0; i < objectProperty.size(); i++) {
            sb.append(objectProperty.get(i).toString());

            // إذا في فاصلة أو فاصلة منقوطة مخزنة بنفس الموقع
            if (COMMA != null && i < COMMA.size() && COMMA.get(i) != null) {
                sb.append(COMMA.get(i)).append(" ");
            } else if (SEMI_Q != null && i < SEMI_Q.size() && SEMI_Q.get(i) != null) {
                sb.append(SEMI_Q.get(i)).append(" ");
            }
        }

        sb.append(RBRACE);
        return sb.toString();
    }
}
