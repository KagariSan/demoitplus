package exception;

public class ZeroInputException extends Exception {
    private Integer userInputedNumber;
    public ZeroInputException(String msg, Integer userInputedNumber) {
        super(msg);
        this.userInputedNumber = userInputedNumber;
    }
    public Integer getUserInputedNumber() {
        return this.userInputedNumber;
    }
}
