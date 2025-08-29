package SymbolTable;

import java.util.ArrayList;
import java.util.List;

public class templateUrlSymbolTable {
List<String>templateUrlll=new ArrayList<>();

    public void setTemplateUrl(List<String> templateUrl) {
        this.templateUrlll = templateUrl;
    }
    public void addItem(String item){
        templateUrlll.add(item);
    }
    public boolean checkExits(String templateUrl){
        for ( String templateUrlll:templateUrlll)
            if (templateUrlll.equals(templateUrl))
                return true;
        return false;

    }


}
