package Exception;

public class RouteException extends RuntimeException {
    private final int line;
    private final int position;

    public RouteException(String message, int line, int position) {
        super(message);
        this.line = line;
        this.position = position;
    }

    public String getFormattedMessage() {
        return String.format("ROUTE ERROR: %s at line %d, position %d",
                getMessage(), line, position);
    }
}