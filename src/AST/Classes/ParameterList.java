package AST.Classes;

import java.util.ArrayList;
import java.util.List;

public class ParameterList {
    /*

parameterList
    : parameter (COMMA parameter)*
    ;

     */
    private List<Parameter>parameter=new ArrayList<>();
    private List<String>COMMA= new ArrayList<>();

    public List<Parameter> getParameter() {
        return parameter;
    }

    public void setParameter(List<Parameter> parameter) {
        this.parameter = parameter;
    }

    public List<String> getCOMMA() {
        return COMMA;
    }

    public void setCOMMA(List<String> COMMA) {
        this.COMMA = COMMA;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < parameter.size(); i++) {
            sb.append(parameter.get(i).toString());
            if (COMMA != null && i < COMMA.size()) {
                sb.append(COMMA.get(i)).append(" ");
            }
        }

        return sb.toString().trim();
    }
}
