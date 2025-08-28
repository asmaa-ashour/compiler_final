package AST.Classes;

public class PostfixAssertion {
    /*
    postfixAssertion
    : EXCLAMATION
    ;

     */
    private String EXCLAMATION;
    public String getEXCLAMATION() {
        return EXCLAMATION;
    }
    public void setEXCLAMATION(String EXCLAMATION) {
        this.EXCLAMATION = EXCLAMATION;
    }

    @Override
    public String toString() {
        return "PostfixAssertion{" +
                 EXCLAMATION + '\'' +
                '}';
    }
}
