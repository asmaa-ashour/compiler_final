package AST.Classes;

import java.util.ArrayList;
import java.util.List;

public class Program {
    /*
    program
    : htmlDocument
    | (statement)* EOF
    ;
     */
    private List<Statement>statement=new ArrayList<>();
    private  HtmlDocument htmlDocument;

    public List<Statement> getStatement() {
        return statement;
    }

    public void setStatement(List<Statement> statement) {
        this.statement = statement;
    }

    public HtmlDocument getHtmlDocument() {
        return htmlDocument;
    }


    public void setHtmlDocument(HtmlDocument htmlDocument) {
        this.htmlDocument = htmlDocument;

    }
    @Override
    public String toString() {
        if(htmlDocument != null)
            return "Program{" +
                    ", htmlDocument=" + htmlDocument +
                    '}';
        return "Program{" +
                "statement=" + statement +
                '}';
    }

}
