package AST.Classes;

public class MethodDeclaration {
    /*
    methodDeclaration
    : accessModifier? IDENTIFIER LPAREN paramList? RPAREN (COLON typeAnnotation)? block
    ;
     */
    private AccessModifier accessModifier;
    private String IDENTIFIER;
    private  String LPAREN;
    private  String RPAREN;
    private  String COLON;
    private  ParamList paramList;
    private  TypeAnnotation typeAnnotation;
    private Block block;

    public AccessModifier getAccessModifier() {
        return accessModifier;
    }

    public void setAccessModifier(AccessModifier accessModifier) {
        this.accessModifier = accessModifier;
    }

    public String getIDENTIFIER() {
        return IDENTIFIER;
    }

    public void setIDENTIFIER(String IDENTIFIER) {
        this.IDENTIFIER = IDENTIFIER;
    }

    public String getLPAREN() {
        return LPAREN;
    }

    public void setLPAREN(String LPAREN) {
        this.LPAREN = LPAREN;
    }

    public String getRPAREN() {
        return RPAREN;
    }

    public void setRPAREN(String RPAREN) {
        this.RPAREN = RPAREN;
    }

    public String getCOLON() {
        return COLON;
    }

    public void setCOLON(String COLON) {
        this.COLON = COLON;
    }

    public ParamList getParamList() {
        return paramList;
    }

    public void setParamList(ParamList paramList) {
        this.paramList = paramList;
    }

    public TypeAnnotation getTypeAnnotation() {
        return typeAnnotation;
    }

    public void setTypeAnnotation(TypeAnnotation typeAnnotation) {
        this.typeAnnotation = typeAnnotation;
    }

    public Block getBlock() {
        return block;
    }

    public void setBlock(Block block) {
        this.block = block;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        // accessModifier (اختياري)
        if (accessModifier != null) {
            sb.append(accessModifier.toString()).append(" ");
        }

        // اسم الميثود
        sb.append(IDENTIFIER);

        // البراميترز
        sb.append(LPAREN);
        if (paramList != null) {
            sb.append(paramList.toString());
        }
        sb.append(RPAREN);

        // type annotation (اختياري)
        if (typeAnnotation != null) {
            sb.append(COLON).append(typeAnnotation.toString());
        }

        // البلوك (جسم الميثود)
        if (block != null) {
            sb.append(" ").append(block.toString());
        }

        return sb.toString();
    }

}
