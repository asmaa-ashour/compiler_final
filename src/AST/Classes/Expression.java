package AST.Classes;

public class Expression {
    /*

expression
    : assignmentExpression
    ;
     */
    private AssignmentExpression assignmentExpression;

    public AssignmentExpression getAssignmentExpression() {
        return assignmentExpression;
    }

    public void setAssignmentExpression(AssignmentExpression assignmentExpression) {
        this.assignmentExpression = assignmentExpression;
    }

    @Override
    public String toString() {
        return "Expression{" +
                 assignmentExpression +
                '}';
    }
}
