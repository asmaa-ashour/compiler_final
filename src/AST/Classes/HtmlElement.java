package AST.Classes;

import java.util.ArrayList;
import java.util.List;

public class HtmlElement {
    /*
    htmlElement
    : LT htmlTagName attribute* GT htmlTagName* LT SLASH htmlTagName GT
    | LT htmlTagName attribute* GT
    | LT htmlTagName attribute* SLASH GT
    ;
     */
    private String LT;
    private String GT;
    private String SLASH;
    private List<Attribute>attribute=new ArrayList<>();
    private List<HtmlTagName>htmlTagName=new ArrayList<>();

    public String getLT() {
        return LT;
    }

    public void setLT(String LT) {
        this.LT = LT;
    }

    public String getGT() {
        return GT;
    }

    public void setGT(String GT) {
        this.GT = GT;
    }

    public String getSLASH() {
        return SLASH;
    }

    public void setSLASH(String SLASH) {
        this.SLASH = SLASH;
    }

    public List<Attribute> getAttribute() {
        return attribute;
    }

    public void setAttribute(List<Attribute> attribute) {
        this.attribute = attribute;
    }

    public List<HtmlTagName> getHtmlTagName() {
        return htmlTagName;
    }

    public void setHtmlTagName(List<HtmlTagName> htmlTagName) {
        this.htmlTagName = htmlTagName;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        // ابدأ بالوسم المفتوح
        sb.append(LT);
        if (!htmlTagName.isEmpty()) {
            sb.append(htmlTagName.get(0).toString()); // نأخذ الوسم الأول
        }

        // أضف السمات
        if (!attribute.isEmpty()) {
            for (Attribute attr : attribute) {
                sb.append(" ").append(attr.toString());
            }
        }

        // تحقق إذا كان وسم مغلق مباشرة
        if (SLASH != null && !SLASH.isEmpty()) {
            sb.append(" ").append(SLASH).append(GT);
            return sb.toString();
        } else {
            sb.append(GT);
        }

        // أضف أي وسوم داخلية
        if (htmlTagName.size() > 1) {
            for (int i = 1; i < htmlTagName.size(); i++) {
                sb.append(htmlTagName.get(i).toString());
            }
        }

        // الوسم المغلق
        if (!htmlTagName.isEmpty()) {
            sb.append(LT).append(SLASH != null ? SLASH : "").append(htmlTagName.get(0).toString()).append(GT);
        }

        return sb.toString();
    }

}
