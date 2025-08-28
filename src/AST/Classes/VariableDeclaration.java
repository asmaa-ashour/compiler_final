package AST.Classes;

public class VariableDeclaration {
    /*
variableDeclaration
    : (LET | CONST)
      (IDENTIFIER | HTML | HEAD | BODY | META | TITLE | BASE | LINK)
      (COLON typeAnnotation)?
      ASSIGN expression
      SEMI_Q?
    | (LET | CONST) destructuringAssignment ASSIGN expression SEMI_Q?
    ;
     */
    private  String LET;
    private  String CONST;
    private  String IDENTIFIER;
    private  String HTML;
    private  String BODY;
    private  String HEAD;
    private  String META;
    private  String TITLE;
    private String BASE;
    private String LINK;
    private String COLON;
    private String ASSIGN;
    private String SEMI_Q;
    private  TypeAnnotation typeAnnotation;
    private  Expression expression;

private  DestructuringAssignment destructuringAssignment;

    public String getLET() {
        return LET;
    }

    public void setLET(String LET) {
        this.LET = LET;
    }

    public String getCONST() {
        return CONST;
    }

    public void setCONST(String CONST) {
        this.CONST = CONST;
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

    public String getBODY() {
        return BODY;
    }

    public void setBODY(String BODY) {
        this.BODY = BODY;
    }

    public String getHEAD() {
        return HEAD;
    }

    public void setHEAD(String HEAD) {
        this.HEAD = HEAD;
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

    public String getCOLON() {
        return COLON;
    }

    public void setCOLON(String COLON) {
        this.COLON = COLON;
    }

    public String getASSIGN() {
        return ASSIGN;
    }

    public void setASSIGN(String ASSIGN) {
        this.ASSIGN = ASSIGN;
    }

    public String getSEMI_Q() {
        return SEMI_Q;
    }

    public void setSEMI_Q(String SEMI_Q) {
        this.SEMI_Q = SEMI_Q;
    }

    public TypeAnnotation getTypeAnnotation() {
        return typeAnnotation;
    }

    public void setTypeAnnotation(TypeAnnotation typeAnnotation) {
        this.typeAnnotation = typeAnnotation;
    }

    public Expression getExpression() {
        return expression;
    }

    public void setExpression(Expression expression) {
        this.expression = expression;
    }

    public DestructuringAssignment getDestructuringAssignment() {
        return destructuringAssignment;
    }

    public void setDestructuringAssignment(DestructuringAssignment destructuringAssignment) {
        this.destructuringAssignment = destructuringAssignment;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        // LET أو CONST
        if (LET != null) sb.append(LET).append(" ");
        else if (CONST != null) sb.append(CONST).append(" ");

        // identifier أو HTML أو غيرو
        if (IDENTIFIER != null) sb.append(IDENTIFIER);
        else if (HTML != null) sb.append(HTML);
        else if (HEAD != null) sb.append(HEAD);
        else if (BODY != null) sb.append(BODY);
        else if (META != null) sb.append(META);
        else if (TITLE != null) sb.append(TITLE);
        else if (BASE != null) sb.append(BASE);
        else if (LINK != null) sb.append(LINK);
        else if (destructuringAssignment != null) sb.append(destructuringAssignment.toString());

        // : typeAnnotation (اختياري)
        if (COLON != null && typeAnnotation != null) {
            sb.append(COLON).append(" ").append(typeAnnotation.toString());
        }

        // = expression
        if (ASSIGN != null) {
            sb.append(" ").append(ASSIGN).append(" ");
            if (expression != null) {
                sb.append(expression.toString());
            }
        }
        if (SEMI_Q != null) {
            sb.append(SEMI_Q);
        }

        return sb.toString().trim();
    }

}
