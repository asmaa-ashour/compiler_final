package SymbolTable;

import java.util.ArrayList;
import java.util.List;

public class SymbolTableClass {
  List<Row> rows=new ArrayList<>();

    public List<Row> getRows() {
        return rows;
    }

    public void setRows(List<Row> rows) {
        this.rows = rows;
    }
    public void print() {
        for (Row row : rows) {
            if (row != null) {
                if (row.getName() != null) {
                    System.out.printf("%-15s %-20s %s%n",
                            row.getType(),
                            row.getName(),
                            row.getValue());
                } else {
                    System.out.printf("%-15s %s%n",
                            row.getType(),
                            row.getValue());
                }
            }
        }
    }
    public boolean exists(String name) {
        return rows.stream().anyMatch(row -> row.getName().equals(name));
    }

}
