package AST.Classes;

public class ConditionalExpression {
    /*
    conditionalExpression
    : logicalOrExpression (QUESTION assignmentExpression COLON assignmentExpression)?
    ;

     */
    private  LogicalOrExpression logicalOrExpression;
    private String QUESTION;
    private  AssignmentExpression assignmentExpression;
    private String COLON;
    private  AssignmentExpression assignmentExpression2;


    public LogicalOrExpression getLogicalOrExpression() {
        return logicalOrExpression;
    }

    public void setLogicalOrExpression(LogicalOrExpression logicalOrExpression) {
        this.logicalOrExpression = logicalOrExpression;
    }

    public String getQUESTION() {
        return QUESTION;
    }

    public void setQUESTION(String QUESTION) {
        this.QUESTION = QUESTION;
    }

    public AssignmentExpression getAssignmentExpression() {
        return assignmentExpression;
    }

    public void setAssignmentExpression(AssignmentExpression assignmentExpression) {
        this.assignmentExpression = assignmentExpression;
    }

    public String getCOLON() {
        return COLON;
    }

    public void setCOLON(String COLON) {
        this.COLON = COLON;
    }

    public AssignmentExpression getAssignmentExpression2() {
        return assignmentExpression2;
    }

    public void setAssignmentExpression2(AssignmentExpression assignmentExpression2) {
        this.assignmentExpression2 = assignmentExpression2;
    }

    @Override
    public String toString() {
        if(assignmentExpression != null && assignmentExpression2 != null) {
            return "ConditionalExpression{" +
                    logicalOrExpression +
                    " ? " + assignmentExpression +
                    " : " + assignmentExpression2 +
                    '}';
        }
        return "ConditionalExpression{" +
                logicalOrExpression +
                '}';
    }

}
