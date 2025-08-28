package AST.Classes;

import java.util.ArrayList;
import java.util.List;

public class InterfaceBody {
    /*
    interfaceBody
    : interfaceProperty*
    ;

     */
    private List<InterfaceProperty>interfaceProperty=new ArrayList<>();

    public List<InterfaceProperty> getInterfaceProperty() {
        return interfaceProperty;
    }

    public void setInterfaceProperty(List<InterfaceProperty> interfaceProperty) {
        this.interfaceProperty = interfaceProperty;
    }

    @Override
    public String toString() {
        return "InterfaceBody{" +
                 interfaceProperty +
                '}';
    }
}
