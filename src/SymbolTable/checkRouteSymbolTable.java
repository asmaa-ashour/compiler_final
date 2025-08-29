package SymbolTable;

import java.util.ArrayList;
import java.util.List;

public class checkRouteSymbolTable {
    private List<String> paths = new ArrayList<>();

    public void addPath(String path) {
        if (paths.contains(path)) {
            throw new RuntimeException("Duplicate path: " + path);
        }
        paths.add(path);
    }

    public boolean pathExists(String path) {
        return paths.contains(path);
    }
}