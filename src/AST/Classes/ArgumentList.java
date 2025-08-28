package AST.Classes;

import java.util.ArrayList;
import java.util.List;

public class ArgumentList {
    /*

argumentList
    : assignmentExpression (COMMA assignmentExpression)* COMMA?
    ;
     */
    private List<AssignmentExpression>assignmentExpression=new ArrayList<>();
    private List<String>COMMA= new ArrayList<>();

    public List<AssignmentExpression> getAssignmentExpression() {
        return assignmentExpression;
    }

    public void setAssignmentExpression(List<AssignmentExpression> assignmentExpression) {
        this.assignmentExpression = assignmentExpression;
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
        sb.append(assignmentExpression );
        for (int i = 0; i < assignmentExpression.size(); i++) {
            sb.append(assignmentExpression.get(i).toString());
            // إذا في فواصل، نضيفها بعد التعبير إلا آخر عنصر
            if (COMMA != null && i < COMMA.size()) {
                sb.append(COMMA.get(i)).append(" ");
            }
        }

        return sb.toString();
    }

}
