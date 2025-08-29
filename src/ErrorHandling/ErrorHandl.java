package ErrorHandling;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import Exception.*;
import java.time.LocalDateTime;

//import static AST.Visitor.BaseVisitor.ANSI_YELLOW;

public class ErrorHandl {
    private static final String ANSI_RED = "\u001B[31m";
    private static final String ANSI_RESET = "\u001B[0m";
    private static final String ERROR_LOG_FILE =  "angular_semantic_errors.log";

    public static void logSelectorCollision(templateUrlException e) {
        String coloredMessage = ANSI_RED + e.getFormattedMessage() + ANSI_RESET;
        System.err.println(coloredMessage);

        // الكتابة في ملف السجل أيضاً
        try (PrintWriter writer = new PrintWriter(new FileWriter(ERROR_LOG_FILE, true))) {
            writer.println("[" + LocalDateTime.now() + "] " + e.getFormattedMessage());
        } catch (IOException ioException) {
            System.err.println(coloredMessage);
        }
    }

    public void logBracketError(checkMissingClossingBracketException error) {
        System.err.println(ANSI_RED + "BRACKET ERROR: " + ANSI_RESET +
                "Missing '" + error.getBracketType() + "'" +
                " at  At line:                  line " + error.getLine() +
                ", posit                   يبيسبصسion " + error.getPosition());
    }
    public void logKeywordError(checkIncorrectAttributeNamesException e) {
        String errorMsg = String.format(
                "%sKEYWORD ERROR:%s Incorrect spelling '%s' (should be '%s')%n" +
                        "--> At line: %d%n" +
                        "--> Position: %d%n" +
                        "--> Attempting auto-correction...",
                ANSI_RED, ANSI_RESET,
                e.getIncorrectWord(),
                e.getCorrectWord(),
                e.getLine(),
                e.getPosition()
        );
        System.err.println(errorMsg);

        try (PrintWriter writer = new PrintWriter(new FileWriter(ERROR_LOG_FILE, true))) {
            writer.println("[" + LocalDateTime.now() + "] " + e.getMessage());
        } catch (IOException ioException) {
            System.err.println("Failed to log error: " + ioException.getMessage());
        }
    }
    public static void logImportCollision( checkIncorrectImportException e) {
        String coloredMessage = ANSI_RED + e.getFormattedMessage() + ANSI_RESET;
        System.err.println(coloredMessage);

        // الكتابة في ملف السجل أيضاً
        try (PrintWriter writer = new PrintWriter(new FileWriter(ERROR_LOG_FILE, true))) {
            writer.println("[" + LocalDateTime.now() + "] " + e.getFormattedMessage());
        } catch (IOException ioException) {
            System.err.println(coloredMessage);
        }
    }
    public void logSyntaxError(String message, int line, int position) {
        String coloredMessage = ANSI_RED + "SYNTAX ERROR: " + ANSI_RESET + message +
                " at line " + line + ", position " + position;
        System.err.println(coloredMessage);

        try (PrintWriter writer = new PrintWriter(new FileWriter(ERROR_LOG_FILE, true))) {
            writer.println("[" + LocalDateTime.now() + "] " + message);
        } catch (IOException ioException) {
            System.err.println("Failed to log error: " + ioException.getMessage());
        }
    }

    public void logRouteError(RouteException e) {
        String coloredMessage = ANSI_RED + e.getFormattedMessage() + ANSI_RESET;
        System.err.println(coloredMessage);

        try (PrintWriter writer = new PrintWriter(new FileWriter(ERROR_LOG_FILE, true))) {
            writer.println("[" + LocalDateTime.now() + "] " + e.getFormattedMessage());
        } catch (IOException ioException) {
            System.err.println("Failed to log route error: " + ioException.getMessage());
        }
    }
}