package AST.Classes;

public class AssignmentExpression {
    /*
    assignmentExpression
    : conditionalExpression (ASSIGN assignmentExpression)?
    ;

     */

    private ConditionalExpression conditionalExpression;
    private  AssignmentExpression assignmentExpression;
    private  String ASSIGN;

    public ConditionalExpression getConditionalExpression() {
        return conditionalExpression;
    }

    public void setConditionalExpression(ConditionalExpression conditionalExpression) {
        this.conditionalExpression = conditionalExpression;
    }

    public AssignmentExpression getAssignmentExpression() {
        return assignmentExpression;
    }

    public void setAssignmentExpression(AssignmentExpression assignmentExpression) {
        this.assignmentExpression = assignmentExpression;
    }

    public String getASSIGN() {
        return ASSIGN;
    }

    public void setASSIGN(String ASSIGN) {
        this.ASSIGN = ASSIGN;
    }



    @Override
    public String toString() {
        if(assignmentExpression != null) {
            return "AssignmentExpression{" +
                    "conditionalExpression=" + conditionalExpression +
                    ", ASSIGN='" + ASSIGN + '\'' +
                    "assignmentExpression=" + assignmentExpression +

                    '}';
        }
        return "AssignmentExpression{" +
                "conditionalExpression=" + conditionalExpression +
                '}';
    }
}
