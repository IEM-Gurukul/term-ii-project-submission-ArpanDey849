package exceptions;

public class InvalidPinException extends BankingException {
    public InvalidPinException(String message) {
        super(message);
    }
}
