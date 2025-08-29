package AST.Classes;

public class PrimaryExpression {
    /*
    primaryExpression
    : THIS
    | IDENTIFIER
    | HTML
    | HEAD
    | BODY
    | META
    | TITLE
    | BASE
    | LINK
    | literal
    | arrayLiteral
    | objectLiteral
    | LPAREN expression RPAREN
    | arrowFunction
    | NEW IDENTIFIER genericArguments? LPAREN argumentList? RPAREN
    | TEMPLATE_STR
    | IMPORT DOT META DOT IDENTIFIER
    ;
     */
    private Literal Literal;
    private String THIS;
    private String IDENTIFIER;
    private String HTML;
    private String HEAD;
    private String BODY;
    private String META;
    private String TITLE;
    private String BASE;
    private String LINK;
    private String LPAREN;
    private String RPAREN ;
    private String NEW;
    private String TEMPLATE_STR;
    private String IMPORT;
    private String DOT;
    private ArrayLiteral arrayLiteral;
    private ObjectLiteral objectLiteral;
    private Expression expression;
    private ArrowFunction arrowFunction;
    private GenericArguments genericArguments;
    private ArgumentList argumentList;

    public String getTHIS() {
        return THIS;
    }

    public void setTHIS(String THIS) {
        this.THIS = THIS;
    }

    public String getIDENTIFIER() {
        return IDENTIFIER;
    }

    public void setIDENTIFIER(String IDENTIFIER) {
        this.IDENTIFIER = IDENTIFIER;
    }

    public String getHTML() {
        return HTML;
    }

    public void setHTML(String HTML) {
        this.HTML = HTML;
    }

    public String getHEAD() {
        return HEAD;
    }

    public void setHEAD(String HEAD) {
        this.HEAD = HEAD;
    }

    public String getBODY() {
        return BODY;
    }

    public void setBODY(String BODY) {
        this.BODY = BODY;
    }

    public String getMETA() {
        return META;
    }

    public void setMETA(String META) {
        this.META = META;
    }

    public String getTITLE() {
        return TITLE;
    }

    public void setTITLE(String TITLE) {
        this.TITLE = TITLE;
    }

    public String getBASE() {
        return BASE;
    }

    public void setBASE(String BASE) {
        this.BASE = BASE;
    }

    public String getLINK() {
        return LINK;
    }

    public void setLINK(String LINK) {
        this.LINK = LINK;
    }

    public String getLPAREN() {
        return LPAREN;
    }

    public void setLPAREN(String LPAREN) {
        this.LPAREN = LPAREN;
    }

    public String getRPAREN() {
        return RPAREN;
    }

    public void setRPAREN(String RPAREN) {
        this.RPAREN = RPAREN;
    }

    public String getNEW() {
        return NEW;
    }

    public void setNEW(String NEW) {
        this.NEW = NEW;
    }

    public String getTEMPLATE_STR() {
        return TEMPLATE_STR;
    }

    public void setTEMPLATE_STR(String TEMPLATE_STR) {
        this.TEMPLATE_STR = TEMPLATE_STR;
    }

    public String getIMPORT() {
        return IMPORT;
    }

    public void setIMPORT(String IMPORT) {
        this.IMPORT = IMPORT;
    }

    public String getDOT() {
        return DOT;
    }

    public void setDOT(String DOT) {
        this.DOT = DOT;
    }

    public ArrayLiteral getArrayLiteral() {
        return arrayLiteral;
    }

    public void setArrayLiteral(ArrayLiteral arrayLiteral) {
        this.arrayLiteral = arrayLiteral;
    }

    public ObjectLiteral getObjectLiteral() {
        return objectLiteral;
    }

    public void setObjectLiteral(ObjectLiteral objectLiteral) {
        this.objectLiteral = objectLiteral;
    }

    public Expression getExpression() {
        return expression;
    }

    public void setExpression(Expression expression) {
        this.expression = expression;
    }

    public ArrowFunction getArrowFunction() {
        return arrowFunction;
    }

    public void setArrowFunction(ArrowFunction arrowFunction) {
        this.arrowFunction = arrowFunction;
    }

    public GenericArguments getGenericArguments() {
        return genericArguments;
    }

    public void setGenericArguments(GenericArguments genericArguments) {
        this.genericArguments = genericArguments;
    }

    public ArgumentList getArgumentList() {
        return argumentList;
    }

    public void setArgumentList(ArgumentList argumentList) {
        this.argumentList = argumentList;
    }

    public Literal getLiteral() {
        return Literal;
    }

    public void setLiteral(Literal literal) {
        Literal = literal;
    }

    @Override
    public String toString() {
        if (THIS != null) return THIS;
        if (IDENTIFIER != null) return IDENTIFIER;
        if (HTML != null) return HTML;
        if (HEAD != null) return HEAD;
        if (BODY != null) return BODY;
        if (META != null) return META;
        if (TITLE != null) return TITLE;
        if (BASE != null) return BASE;
        if (LINK != null) return LINK;
        if (Literal != null) return Literal.toString();
        if (TEMPLATE_STR != null) return TEMPLATE_STR;
        if (expression != null && LPAREN != null && RPAREN != null)
            return LPAREN + expression.toString() + RPAREN;
        if (arrowFunction != null) return arrowFunction.toString();
        if (NEW != null && IDENTIFIER != null) {
            String genArgs = (genericArguments != null) ? genericArguments.toString() : "";
            String args = (argumentList != null) ? argumentList.toString() : "";
            return NEW + " " + IDENTIFIER + genArgs + "(" + args + ")";
        }
        if (IMPORT != null && DOT != null && META != null && DOT != null && IDENTIFIER != null)
            return IMPORT + DOT + META + DOT + IDENTIFIER;
        if (arrayLiteral != null) return arrayLiteral.toString();
        if (objectLiteral != null) return objectLiteral.toString();

        return "";
    }

}
