package AST.Classes;

import java.util.ArrayList;
import java.util.List;

public class ParamList {
    /*

paramList
    : param (COMMA param)*
    ;
     */
 //   private Param param1;
    private List<Param>param=new ArrayList<>();
    private List<String>COMMA= new ArrayList<>();

    public List<Param> getParam() {
        return param;
    }

    public void setParam(List<Param> param) {
        this.param = param;
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
        for (int i = 0; i < param.size(); i++) {
            sb.append(param.get(i).toString());
            if (i < param.size() - 1) {
                sb.append(", ");
            }
        }
        return sb.toString();
    }

}
