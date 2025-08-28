package AST.Classes;

public class ImportStatement {
    /*
    importStatement
    : IMPORT importClause FROM STRING SEMI_Q?
    ;
     */
    private String IMPORT;
    private String FROM;
    private String STRING;
    private ImportClause importClause;
    private String SEMI_Q;

    public String getIMPORT() {
        return IMPORT;
    }

    public void setIMPORT(String IMPORT) {
        this.IMPORT = IMPORT;
    }

    public String getFROM() {
        return FROM;
    }

    public void setFROM(String FROM) {
        this.FROM = FROM;
    }

    public String getSTRING() {
        return STRING;
    }

    public void setSTRING(String STRING) {
        this.STRING = STRING;
    }

    public ImportClause getImportClause() {
        return importClause;
    }

    public void setImportClause(ImportClause importClause) {
        this.importClause = importClause;
    }

    public String getSEMI_Q() {
        return SEMI_Q;
    }

    public void setSEMI_Q(String SEMI_Q) {
        this.SEMI_Q = SEMI_Q;
    }

    @Override
    public String toString() {
        if(SEMI_Q != null)
        return "ImportStatement{" +
                 IMPORT + '\'' +
                 importClause +'\'' +
                 FROM + '\'' +
                 STRING + '\'' +
                 SEMI_Q + '\'' +
                '}';
        return "ImportStatement{" +
                 IMPORT + '\'' +
                 importClause +'\'' +
                 FROM + '\'' +
                 STRING + '\'' +
                '}';
    }
}
