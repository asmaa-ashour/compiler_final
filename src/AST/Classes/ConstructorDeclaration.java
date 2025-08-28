package AST.Classes;

public class ConstructorDeclaration {
    /*
    constructorDeclaration
    : CONSTRUCTOR LPAREN paramList? RPAREN block
    ;

     */

    private String CONSTRUCTOR;
    private String LPAREN;
    private ParamList paramList;
    private  String RPAREN;
    private  Block block;

    public String getCONSTRUCTOR() {
        return CONSTRUCTOR;
    }

    public void setCONSTRUCTOR(String CONSTRUCTOR) {
        this.CONSTRUCTOR = CONSTRUCTOR;
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

    public ParamList getParamList() {
        return paramList;
    }

    public void setParamList(ParamList paramList) {
        this.paramList = paramList;
    }

    public Block getBlock() {
        return block;
    }

    public void setBlock(Block block) {
        this.block = block;
    }

    @Override
    public String toString() {
        if (paramList != null)
        return "ConstructorDeclaration{" +
                 CONSTRUCTOR + '\'' +
                 LPAREN + '\'' +
                 paramList +'\''+
                 RPAREN + '\'' +
                 block +
                '}';
        return "ConstructorDeclaration{" +
                CONSTRUCTOR + '\'' +
                LPAREN + '\'' +
                RPAREN + '\'' +
                block +
                '}';
    }
}
