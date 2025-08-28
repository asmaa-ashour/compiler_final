package AST.Classes;

public class ComponentMetadata {
    /*
    componentMetadata
    : LBRACE componentMetadataPropertyList? RBRACE
    ;

     */
    private String LBRACE;
    private String RBRACE;
    private ComponentMetadataPropertyList componentMetadataPropertyList;

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

    public ComponentMetadataPropertyList getComponentMetadataPropertyList() {
        return componentMetadataPropertyList;
    }

    public void setComponentMetadataPropertyList(ComponentMetadataPropertyList componentMetadataPropertyList) {
        this.componentMetadataPropertyList = componentMetadataPropertyList;

    }
    @Override
    public String toString() {
        if(componentMetadataPropertyList != null)
        return "ComponentMetadata{" +
                "LBRACE='" + LBRACE + '\'' +
                ", componentMetadataPropertyList=" + componentMetadataPropertyList +
                ", RBRACE='" + RBRACE + '\'' +
                '}';
        return "ComponentMetadata{" +
                "LBRACE='" + LBRACE + '\'' +
                ", RBRACE='" + RBRACE + '\'' +
                '}';
    }
}
