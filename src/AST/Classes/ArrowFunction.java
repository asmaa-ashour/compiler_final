package AST.Classes;

public class ArrowFunction {
    /*

arrowFunction
    : arrowParameters ARROW arrowBody
    ;
     */
    private ArrowParameters arrowParameters;
    private String ARROW;
    private ArrowBody arrowBody;


    public ArrowParameters getArrowParameters() {
        return arrowParameters;
    }

    public void setArrowParameters(ArrowParameters arrowParameters) {
        this.arrowParameters = arrowParameters;
    }

    public ArrowBody getArrowBody() {
        return arrowBody;
    }

    public void setArrowBody(ArrowBody arrowBody) {
        this.arrowBody = arrowBody;
    }

    public String getARROW() {
        return ARROW;
    }

    public void setARROW(String ARROW) {
        this.ARROW = ARROW;
    }

    @Override
    public String toString() {
        return "ArrowFunction{" +
                 arrowParameters +
                 ARROW + '\'' +
                 arrowBody +
                '}';
    }
}
