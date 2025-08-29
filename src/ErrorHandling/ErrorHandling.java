package ErrorHandling;

import SymbolTable.Row;
import SymbolTable.SymbolTableClass;

public class ErrorHandling {
    SymbolTableClass symbolTable;
    private String sourceCode; // أضف هذا الحقل

    public void setSourceCode(String sourceCode) {
        this.sourceCode = sourceCode;
    }

    public void setSymbolTable(SymbolTableClass symbolTable) {
        this.symbolTable = symbolTable;
    }

    public boolean check() {
        return checkBracesBalance();
    }

    private boolean checkBracesBalance() {
        int openCount = 0;
        int closeCount = 0;
        int lastOpenPosition = -1;

        for (int i = 0; i < symbolTable.getRows().size(); i++) {
            Row row = symbolTable.getRows().get(i);
            if (row == null) continue;

            if (row.getType().equals("openBraceRow")) {
                openCount++;
                lastOpenPosition = i;
            }
            else if (row.getType().equals("closeBraceRow")) {
                closeCount++;

                // إذا كان هناك قوس إغلاق بدون قوس فتح
                if (closeCount > openCount) {
                    printError("Extra closing brace '}' found", i);
                    return false;
                }
            }
        }

        if (openCount > closeCount) {
            printError("Missing closing brace '}' for opening brace at position " + lastOpenPosition,
                    lastOpenPosition);
            return false;
        }

        return true;
    }



    private void printErrorContext(int errorPosition) {
        System.err.println("\nError context:");
        int start = Math.max(0, errorPosition - 2);
        int end = Math.min(symbolTable.getRows().size(), errorPosition + 3);

        for (int i = start; i < end; i++) {
            Row row = symbolTable.getRows().get(i);
            if (row == null) continue;

            String marker = (i == errorPosition) ? ">>> " : "    ";
            System.err.println(marker + row.getType() + ": " + row.getValue());
        }
    }
    private void printErrorLocation(int errorPosition) {
        if (sourceCode == null) return;

        String[] lines = sourceCode.split("\n");
        int lineNumber = 1;
        int positionInLine = 0;

        for (String line : lines) {
            if (errorPosition >= positionInLine &&
                    errorPosition <= positionInLine + line.length()) {
                System.err.println("At line " + lineNumber + ":");
                System.err.println(line);
                System.err.println(String.format("%" + (errorPosition-positionInLine+1) + "s", "^"));
                System.err.println("Error position: " + (errorPosition-positionInLine+1));
                break;
            }
            positionInLine += line.length() + 1; // +1 لحساب حرف السطر الجديد
            lineNumber++;
        }
    }

    // استدعاء الدالة من printError
    private void printError(String message, int position) {
        printColoredError(message);
        printErrorContext(position);
        printErrorLocation(position); // أضف هذه السطر
    }

    private void printColoredError(String message) {
        System.err.println("\u001B[31m"); // لون أحمر
        System.err.println("┌──────────────────────────────────────────────┐");
        System.err.println("│                SYNTAX ERROR                   │");
        System.err.println("├──────────────────────────────────────────────┤");
        System.err.printf("│ %-60s │\n", message);
        System.err.println("└──────────────────────────────────────────────┘");
        System.err.println("\u001B[0m"); // إعادة تعيين اللون
    }

}