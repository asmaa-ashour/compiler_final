package Exception;

public class checkMissingClossingBracketException  extends RuntimeException {
  int line;
  int position;
   String bracketType;

    public checkMissingClossingBracketException(String bracketType, int line, int position) {
        super(String.format("Missing closing '%s' bracket at line %d, position %d",
                bracketType, line, position));
        this.bracketType = bracketType;
        this.line = line;
        this.position = position;
    }



    // Getters
    public String getBracketType() {
        return bracketType;
    }

    public int getLine() {
        return line;
    }

    public int getPosition() {
        return position;
    }
}
