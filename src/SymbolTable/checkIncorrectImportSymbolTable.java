package SymbolTable;

import java.util.ArrayList;
import java.util.List;

public class checkIncorrectImportSymbolTable {
    List<String> imports=new ArrayList<>();

    public void setImports(List<String> importt) {
        this.imports = importt;
    }


    public void addItem(String item) {
        if(!checkExists(item)) {
            imports.add(item);
        }
    }

    public boolean checkExists(String item) {
        return imports.contains(item);
    }
}
