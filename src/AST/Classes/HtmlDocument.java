package AST.Classes;

import java.util.ArrayList;
import java.util.List;

public class HtmlDocument {
    /*

htmlDocument
    : DOCTYPE? htmlElement*
    ;
     */
    private String DOCTYPE;
    private List<HtmlElement>htmlElement=new ArrayList<>();

    public String getDOCTYPE() {
        return DOCTYPE;
    }

    public void setDOCTYPE(String DOCTYPE) {
        this.DOCTYPE = DOCTYPE;
    }

    public List<HtmlElement> getHtmlElement() {
        return htmlElement;
    }

    public void setHtmlElement(List<HtmlElement> htmlElement) {
        this.htmlElement = htmlElement;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        // إذا كان هناك DOCTYPE
        if (DOCTYPE != null && !DOCTYPE.isEmpty()) {
            sb.append(DOCTYPE).append("\n");
        }

        // طباعة جميع عناصر HTML
        if (!htmlElement.isEmpty()) {
            for (HtmlElement element : htmlElement) {
                sb.append(element.toString()).append("\n");
            }
        }

        return sb.toString();
    }

}
