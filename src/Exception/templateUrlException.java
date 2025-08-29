package Exception;

public class templateUrlException {
    private String propertyName; // يمكن أن يكون templateUrl أو selector أو غيرها
    private String message;
    private int line;
    private int position;

    public templateUrlException(String propertyName, String message, int line, int position) {
        this.propertyName = propertyName;
        this.message = message;
        this.line = line;
        this.position = position;
    }

    // Getters
    public String getFormattedMessage() {
        return String.format("%s Error - %s at line %d, position %d",
                propertyName, message, line, position);
    }
}