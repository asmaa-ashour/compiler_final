package AST.Classes;

import java.util.ArrayList;
import java.util.List;
/*
htmlElement
    : LT htmlTagName attribute* GT htmlContent* LT SLASH htmlTagName GT
    | LT htmlTagName attribute* GT
    | LT htmlTagName attribute* SLASH GT
    ;
 */
public class HtmlElement {
    private String LT;
    private String GT;
    private String SLASH;
    private List<Attribute> attribute = new ArrayList<>();
    private List<HtmlTagName> htmlTagName = new ArrayList<>();
    private List<HtmlContent> htmlContent = new ArrayList<>(); // إضافة حقل htmlContent

    public String getLT() { return LT; }
    public void setLT(String LT) { this.LT = LT; }
    public String getGT() { return GT; }
    public void setGT(String GT) { this.GT = GT; }
    public String getSLASH() { return SLASH; }
    public void setSLASH(String SLASH) { this.SLASH = SLASH; }
    public List<Attribute> getAttribute() { return attribute; }
    public void setAttribute(List<Attribute> attribute) { this.attribute = attribute; }
    public List<HtmlTagName> getHtmlTagName() { return htmlTagName; }
    public void setHtmlTagName(List<HtmlTagName> htmlTagName) { this.htmlTagName = htmlTagName; }
    public List<HtmlContent> getHtmlContent() { return htmlContent; } // دالة getter
    public void setHtmlContent(List<HtmlContent> htmlContent) { this.htmlContent = htmlContent; } // دالة setter

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(LT);
        if (!htmlTagName.isEmpty()) {
            sb.append(htmlTagName.get(0).toString());
        }
        for (Attribute attr : attribute) {
            sb.append(" ").append(attr.toString());
        }
        sb.append(GT);
        for (HtmlContent content : htmlContent) {
            sb.append(content.toString());
        }
        if (SLASH != null && htmlTagName.size() > 1) {
            sb.append(LT).append(SLASH).append(htmlTagName.get(1).toString()).append(GT);
        } else if (SLASH == null && !htmlTagName.isEmpty()) {
            sb.append(LT).append(SLASH).append(htmlTagName.get(0).toString()).append(GT);
        }
        return sb.toString();
    }
}