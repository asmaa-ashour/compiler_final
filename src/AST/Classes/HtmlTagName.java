package AST.Classes;

public class HtmlTagName {

    /*
    htmlTagName
    : META
    | HTML
    | HEAD
    | BODY
    | IDENTIFIER
    | TITLE
    | BASE
    | LINK
    ;
     */
private String META;
    private String HTML;
    private String HEAD;
    private String BODY;
    private String IDENTIFIER;
    private String TITLE;
    private String BASE;
    private String LINK;

    public String getMETA() {
        return META;
    }

    public void setMETA(String META) {
        this.META = META;
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

    public String getIDENTIFIER() {
        return IDENTIFIER;
    }

    public void setIDENTIFIER(String IDENTIFIER) {
        this.IDENTIFIER = IDENTIFIER;
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
    @Override
    public String toString() {
        if (META != null) return META;
        if (HTML != null) return HTML;
        if (HEAD != null) return HEAD;
        if (BODY != null) return BODY;
        if (IDENTIFIER != null) return IDENTIFIER;
        if (TITLE != null) return TITLE;
        if (BASE != null) return BASE;
        if (LINK != null) return LINK;
        return "";
    }

}
