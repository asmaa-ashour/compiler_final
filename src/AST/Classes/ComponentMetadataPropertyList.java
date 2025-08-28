package AST.Classes;

import java.util.ArrayList;
import java.util.List;

public class ComponentMetadataPropertyList {
    /*
    componentMetadataPropertyList
    : componentMetadataProperty (COMMA componentMetadataProperty)* COMMA?
    ;
     */
    private List<ComponentMetadataProperty>componentMetadataProperty=new ArrayList<>();
    private List<String>COMMA=new ArrayList<>();

    public List<ComponentMetadataProperty> getComponentMetadataProperty() {
        return componentMetadataProperty;
    }

    public void setComponentMetadataProperty(List<ComponentMetadataProperty> componentMetadataProperty) {
        this.componentMetadataProperty = componentMetadataProperty;
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
        for (int i = 0; i < componentMetadataProperty.size(); i++) {
            sb.append(componentMetadataProperty.get(i).toString());
            if (i < componentMetadataProperty.size() - 1) {
                sb.append(", "); // فاصلة ومسافة بين الخصائص
            }
        }
        return sb.toString();
    }



}
