package AST.Classes;

public class StatementInside {
    /*
    statementInside
    : variableDeclaration
    | ifStatement
    | expressionStatement
    | fieldDeclaration
    | SEMI_Q
    ;
     */
private VariableDeclaration variableDeclaration;
private  IfStatement ifStatement;
private ExpressionStatement expressionStatement;
private FieldDeclaration fieldDeclaration;
private  String SEMI_Q;

    public VariableDeclaration getVariableDeclaration() {
        return variableDeclaration;
    }

    public void setVariableDeclaration(VariableDeclaration variableDeclaration) {
        this.variableDeclaration = variableDeclaration;
    }

    public IfStatement getIfStatement() {
        return ifStatement;
    }

    public void setIfStatement(IfStatement ifStatement) {
        this.ifStatement = ifStatement;
    }

    public ExpressionStatement getExpressionStatement() {
        return expressionStatement;
    }

    public void setExpressionStatement(ExpressionStatement expressionStatement) {
        this.expressionStatement = expressionStatement;
    }

    public FieldDeclaration getFieldDeclaration() {
        return fieldDeclaration;
    }

    public void setFieldDeclaration(FieldDeclaration fieldDeclaration) {
        this.fieldDeclaration = fieldDeclaration;
    }

    public String getSEMI_Q() {
        return SEMI_Q;
    }

    public void setSEMI_Q(String SEMI_Q) {
        this.SEMI_Q = SEMI_Q;
    }
    /*
    statementInside
    : variableDeclaration
    | ifStatement
    | expressionStatement
    | fieldDeclaration
    | SEMI_Q
    ;
     */

    @Override
    public String toString() {
        if(variableDeclaration != null)
            return "StatementInside{" +
                    variableDeclaration +
                    '}';
        else if (ifStatement != null) {
            return "StatementInside{" +
                    ifStatement +
                    '}';
        }
        else if (expressionStatement != null) {
            return "StatementInside{" +
                    expressionStatement +
                    '}';
        }else if (fieldDeclaration != null) {
            return "StatementInside{" +
                    fieldDeclaration +
                    '}';
        }
        return "StatementInside{" +
                SEMI_Q + '\'' +
                '}';
    }
}
