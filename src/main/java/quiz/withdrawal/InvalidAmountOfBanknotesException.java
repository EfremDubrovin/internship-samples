package quiz.withdrawal;

/**
 * This exception should be thrown when an invalid quantity of banknotes is used, such as a negative number or zero
 */
public class InvalidAmountOfBanknotesException extends RuntimeException {

    public InvalidAmountOfBanknotesException(String message) {
        super(message);
    }
}
