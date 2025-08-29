package SymbolTable;

import java.util.ArrayList;
import java.util.List;

public class checkIncorrectAttributeNameSymbolTable {
    public List<String> KEYWORDS = new ArrayList<>();

    public checkIncorrectAttributeNameSymbolTable() {
        // Initialize with common keywords
        KEYWORDS.add("class");
        KEYWORDS.add("export");
        KEYWORDS.add("import");
        KEYWORDS.add("component");
    }

    public void setKEYWORDS(List<String> KEYWORDS) {
        this.KEYWORDS = KEYWORDS;
    }

    public void addItem(String item) {
        KEYWORDS.add(item.toLowerCase());
    }

    public boolean isKeywordValid(String keyword) {
        return KEYWORDS.contains(keyword.toLowerCase());
    }

    public static String getCorrectSpelling(String input) {
        if (input == null) return null;

        // Handle common misspellings of 'class'
        if (input.matches("(?i)clas|calss|clss")) {
            return "class";
        }
        return null;
    }
}