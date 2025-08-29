package SymbolTable;

import java.util.Stack;

public class checkMissingClossingBracketSymbolTable {
    public static class BracketInfo {
        public final int line;
        public final int position;

        BracketInfo(int line, int position) {
            this.line = line;
            this.position = position;
        }
    }

    private final Stack<BracketInfo> bracketStack = new Stack<>();

    public void pushBracket(int line, int position) {
        bracketStack.push(new BracketInfo(line, position));
    }

    public void popBracket() {
        if (!bracketStack.isEmpty()) {
            bracketStack.pop();
        }
    }

    public boolean hasUnclosedBrackets() {
        return !bracketStack.isEmpty();
    }

    public BracketInfo getUnclosedBracket() {
        return bracketStack.isEmpty() ? null : bracketStack.peek();
    }
}