class OverlimitException extends RuntimeException {
    public OverlimitException(String message) {
        super(message);
    }
}

public class LimitChecker {
    public static void main(String[] args) {
        LimitChecker checker = new LimitChecker();
        checker.setLimit(150);
    }

    public void setLimit(int value) throws OverlimitException {
        if (value > 100) {
            throw OverlimitException("Value too high!");
        } else {
            System.out.println("Limit set to: " + value);
        }
    }
}
