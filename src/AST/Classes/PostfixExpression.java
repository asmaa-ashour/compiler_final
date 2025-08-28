package AST.Classes;

import java.util.ArrayList;
import java.util.List;

public class PostfixExpression {
    /*
    postfixExpression
    : primaryExpressionWithAssertion postfixOperator* (AS typeName)?
    ;
     */

    private PrimaryExpressionWithAssertion primaryExpressionWithAssertion;
    private TypeName typeName;
    private String AS;
    private List<PostfixOperator>postfixOperator=new ArrayList<>();

    public PrimaryExpressionWithAssertion getPrimaryExpressionWithAssertion() {
        return primaryExpressionWithAssertion;
    }

    public void setPrimaryExpressionWithAssertion(PrimaryExpressionWithAssertion primaryExpressionWithAssertion) {
        this.primaryExpressionWithAssertion = primaryExpressionWithAssertion;
    }

    public TypeName getTypeName() {
        return typeName;
    }

    public void setTypeName(TypeName typeName) {
        this.typeName = typeName;
    }

    public String getAS() {
        return AS;
    }

    public void setAS(String AS) {
        this.AS = AS;
    }

    public List<PostfixOperator> getPostfixOperator() {
        return postfixOperator;
    }

    public void setPostfixOperator(List<PostfixOperator> postfixOperator) {
        this.postfixOperator = postfixOperator;
    }

      /*
    postfixExpression
    : primaryExpressionWithAssertion postfixOperator* (AS typeName)?
    ;
     */

    @Override
    public String toString() {
        if(typeName != null)
        return "PostfixExpression{" +
                primaryExpressionWithAssertion +
                postfixOperator +
                typeName +
                 AS + '\'' +

                '}';
        return "PostfixExpression{" +
                 primaryExpressionWithAssertion +
                postfixOperator +
                  '\'' +
                '}';
    }
    }
