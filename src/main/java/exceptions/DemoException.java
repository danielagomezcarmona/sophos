package exceptions;

public class DemoException extends AssertionError{

    private static final long serialVersionUID = 1L;

    public DemoException(String message, Throwable cause){
        super(message, cause);
    }
}
