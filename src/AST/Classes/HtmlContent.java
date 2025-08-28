package AST.Classes;

public class HtmlContent {
    /*
    htmlContent
    : htmlElement
    | expression
    | STRING
    | IDENTIFIER
    ;
     */
    private  HtmlElement htmlElement;
    private Expression expression;
    private String STRING;
    private String IDENTIFIER;

    public HtmlElement getHtmlElement() {
        return htmlElement;
    }

    public void setHtmlElement(HtmlElement htmlElement) {
        this.htmlElement = htmlElement;
    }

    public Expression getExpression() {
        return expression;
    }

    public void setExpression(Expression expression) {
        this.expression = expression;
    }

    public String getSTRING() {
        return STRING;
    }

    public void setSTRING(String STRING) {
        this.STRING = STRING;
    }

    public String getIDENTIFIER() {
        return IDENTIFIER;
    }

    public void setIDENTIFIER(String IDENTIFIER) {
        this.IDENTIFIER = IDENTIFIER;
    }

    @Override
    public String toString() {
        if (htmlElement != null) {
            return htmlElement.toString();
        } else if (expression != null) {
            return expression.toString();
        } else if (STRING != null) {
            return STRING;
        } else if (IDENTIFIER != null) {
            return IDENTIFIER;
        }
        return ""; // إذا لم يكن هناك شيء
    }

}
