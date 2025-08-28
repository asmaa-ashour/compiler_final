package AST.Classes;

public class ImportClause {
    /*
    importClause
    : IDENTIFIER
    | LBRACE importItems RBRACE
    ;

     */
    private String IDENTIFIER;
    private String LBRACE;
    private String RBRACE;
    private  ImportItems importItems;

    public String getIDENTIFIER() {
        return IDENTIFIER;
    }

    public void setIDENTIFIER(String IDENTIFIER) {
        this.IDENTIFIER = IDENTIFIER;
    }

    public String getLBRACE() {
        return LBRACE;
    }

    public void setLBRACE(String LBRACE) {
        this.LBRACE = LBRACE;
    }

    public String getRBRACE() {
        return RBRACE;
    }

    public void setRBRACE(String RBRACE) {
        this.RBRACE = RBRACE;
    }

    public ImportItems getImportItems() {
        return importItems;
    }

    public void setImportItems(ImportItems importItems) {
        this.importItems = importItems;
    }

    @Override
    public String toString() {
        if (importItems !=null)
        return "ImportClause{" +
                ", LBRACE='" + LBRACE + '\'' +
                ", RBRACE='" + RBRACE + '\'' +
                ", importItems=" + importItems +
                '}';
        return "ImportClause{" +
                "IDENTIFIER='" + IDENTIFIER + '\'' +
                '}';
    }
}
