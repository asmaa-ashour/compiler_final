package AST.Classes;

public class UnaryExpression {
    /*

unaryExpression
    : postfixExpression
    | (PLUS | MINUS | EXCLAMATION) unaryExpression
    ;
     */

    private PostfixExpression postfixExpression;
    private  UnaryExpression unaryExpression;
    private  String PLUS;
    private  String MINUS ;
    private  String EXCLAMATION;

    public PostfixExpression getPostfixExpression() {
        return postfixExpression;
    }

    public void setPostfixExpression(PostfixExpression postfixExpression) {
        this.postfixExpression = postfixExpression;
    }

    public UnaryExpression getUnaryExpression() {
        return unaryExpression;
    }

    public void setUnaryExpression(UnaryExpression unaryExpression) {
        this.unaryExpression = unaryExpression;
    }

    public String getPLUS() {
        return PLUS;
    }

    public void setPLUS(String PLUS) {
        this.PLUS = PLUS;
    }

    public String getMINUS() {
        return MINUS;
    }

    public void setMINUS(String MINUS) {
        this.MINUS = MINUS;
    }

    public String getEXCLAMATION() {
        return EXCLAMATION;
    }

    public void setEXCLAMATION(String EXCLAMATION) {
        this.EXCLAMATION = EXCLAMATION;
    }

    @Override
    public String toString() {
        // الخيار الأول: إذا كان هناك postfixExpression
        if (postfixExpression != null) {
            return postfixExpression.toString();
        }

        // الخيار الثاني: إذا كان هناك unaryExpression مع أي من العلامات
        String op = "";
        if (PLUS != null) {
            op = PLUS;
        } else if (MINUS != null) {
            op = MINUS;
        } else if (EXCLAMATION != null) {
            op = EXCLAMATION;
        }

        if (unaryExpression != null) {
            return op + unaryExpression.toString();
        }

        // إذا لم يكن هناك شيء، نرجع سلسلة فارغة
        return "";
    }

}
