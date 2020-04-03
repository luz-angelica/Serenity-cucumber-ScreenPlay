package exception;

public class ShowTheResultsWordException extends AssertionError{

    public static final String MESSAGE_WORD_SEARCH = "First Results are show in the list";

    public ShowTheResultsWordException (String message, Throwable cause) {
        super(message, cause);

    }
}
