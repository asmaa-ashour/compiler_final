package Exception;

public class checkIncorrectAttributeNamesException extends RuntimeException {
    private final String incorrectWord;
    private final String correctWord;
    private final int line;
    private final int position;

    public checkIncorrectAttributeNamesException(String incorrectWord,
                                                 String correctWord,
                                                 int line,
                                                 int position) {
        super(String.format("Incorrect keyword spelling: '%s' (should be '%s') at line %d, position %d",
                incorrectWord, correctWord, line, position));
        this.incorrectWord = incorrectWord;
        this.correctWord = correctWord;
        this.line = line;
        this.position = position;
    }

    // Getters
    public String getIncorrectWord() {
        return incorrectWord;
    }

    public String getCorrectWord() {
        return correctWord;
    }

    public int getLine() {
        return line;
    }

    public int getPosition() {
        return position;
    }
    // Getters
    public String getFormattedMessage() {
        return String.format("%s Error - %s at line %d, position %d",
                correctWord,incorrectWord,line, position);
    }
}