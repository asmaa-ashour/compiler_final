package AST.Classes;

import java.util.ArrayList;
import java.util.List;

public class ClassDeclaration {
    /*
    classDeclaration
    : CLASS IDENTIFIER (EXTENDS IDENTIFIER)? (IMPLEMENTS IDENTIFIER (COMMA IDENTIFIER)*)? LBRACE classBody RBRACE
    ;

     */
    private String CLASS;
    private List<String>IDENTIFIER= new ArrayList<>();
    private String EXTENDS;
   private String IMPLEMENTS;
    private List<String>COMMA= new ArrayList<>();
    private String LBRACE;
    private String RBRACE;
    private  ClassBody classBody;

    public String getIMPLEMENTS() {
        return IMPLEMENTS;
    }

    public void setIMPLEMENTS(String IMPLEMENTS) {
        this.IMPLEMENTS = IMPLEMENTS;
    }

    public String getCLASS() {
        return CLASS;
    }

    public void setCLASS(String CLASS) {
        this.CLASS = CLASS;
    }

    public List<String> getIDENTIFIER() {
        return IDENTIFIER;
    }

    public void setIDENTIFIER(List<String> IDENTIFIER) {
        this.IDENTIFIER = IDENTIFIER;
    }

    public String getEXTENDS() {
        return EXTENDS;
    }

    public void setEXTENDS(String EXTENDS) {
        this.EXTENDS = EXTENDS;
    }


    public List<String> getCOMMA() {
        return COMMA;
    }

    public void setCOMMA(List<String> COMMA) {
        this.COMMA = COMMA;
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

    public ClassBody getClassBody() {
        return classBody;
    }

    public void setClassBody(ClassBody classBody) {
        this.classBody = classBody;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        // كلمة class + الاسم الأساسي
        if (IDENTIFIER != null && !IDENTIFIER.isEmpty()) {
            sb.append(CLASS != null ? CLASS + " " : "class ");
            sb.append(IDENTIFIER.get(0));
        }

        // extends
        if (EXTENDS != null) {
            sb.append(" ").append(EXTENDS).append(" ").append(IDENTIFIER.size() > 1 ? IDENTIFIER.get(1) : "");
        }

        // implements
        if (IMPLEMENTS != null && COMMA != null && IDENTIFIER.size() > 2) {
            sb.append(" ").append(IMPLEMENTS).append(" ");
            for (int i = 2; i < IDENTIFIER.size(); i++) {
                sb.append(IDENTIFIER.get(i));
                if (i - 2 < COMMA.size()) {
                    sb.append(COMMA.get(i - 2));
                }
            }
        }

        // بداية جسم الكلاس
        sb.append(" ").append(LBRACE != null ? LBRACE : "{").append("\n");

        // طباعة جسم الكلاس
        if (classBody != null) {
            sb.append(classBody.toString()).append("\n");
        }

        // نهاية جسم الكلاس
        sb.append(RBRACE != null ? RBRACE : "}");

        return sb.toString();
    }

}
