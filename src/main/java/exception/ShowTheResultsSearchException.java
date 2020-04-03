package exception;

public class ShowTheResultsSearchException extends AssertionError{

    public static final String MESSAGE_RESULT_SEARCH = "result";

    public ShowTheResultsSearchException (String message, Throwable cause) {
        super(message, cause);

    }
}
