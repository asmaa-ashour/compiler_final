package AST.Classes;

public class Param {
    /*
    param
    : accessModifier? (IDENTIFIER | HTML | HEAD | BODY | META | TITLE | BASE | LINK) COLON typeAnnotation
    ;

     */
    private  AccessModifier accessModifier;
    private  TypeAnnotation typeAnnotation;
    private  String HTML;
    private  String HEAD;
    private  String BODY;
    private  String META;
    private  String TITLE;
    private  String BASE;
    private  String LINK;
    private  String COLON;
    private  String IDENTIFIER;


    public AccessModifier getAccessModifier() {
        return accessModifier;
    }

    public void setAccessModifier(AccessModifier accessModifier) {
        this.accessModifier = accessModifier;
    }

    public TypeAnnotation getTypeAnnotation() {
        return typeAnnotation;
    }

    public void setTypeAnnotation(TypeAnnotation typeAnnotation) {
        this.typeAnnotation = typeAnnotation;
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

    public String getCOLON() {
        return COLON;
    }

    public void setCOLON(String COLON) {
        this.COLON = COLON;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        // accessModifier (اختياري)
        if (accessModifier != null) {
            sb.append(accessModifier.toString()).append(" ");
        }

        // الاسم (واحد من IDENTIFIER أو HTML أو غيره)
        if (IDENTIFIER != null) sb.append(IDENTIFIER);
        else if (HTML != null) sb.append(HTML);
        else if (HEAD != null) sb.append(HEAD);
        else if (BODY != null) sb.append(BODY);
        else if (META != null) sb.append(META);
        else if (TITLE != null) sb.append(TITLE);
        else if (BASE != null) sb.append(BASE);
        else if (LINK != null) sb.append(LINK);

        // : typeAnnotation
        if (COLON != null && typeAnnotation != null) {
            sb.append(" ").append(COLON).append(" ").append(typeAnnotation.toString());
        }

        return sb.toString().trim();
    }


}
