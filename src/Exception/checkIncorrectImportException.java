package Exception;

public class checkIncorrectImportException {
    private String message;
    private int line;
    private int position;

    public checkIncorrectImportException(String message, int line, int position) {
        this.message = message;
        this.line = line;
        this.position = position;
    }

    // Getters
    public String getFormattedMessage() {
        return String.format("IMPORT ERROR: %s at line %d, position %d",
                message, line, position);

    }
}