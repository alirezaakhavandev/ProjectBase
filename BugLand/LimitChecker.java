class OverlimitException extends RuntimeException { //It is an unchecked Exception
    public OverlimitException(String message) {
        super(message);
    }
}

public class LimitChecker {
    public static void main(String[] args) {
        LimitChecker checker = new LimitChecker();
        checker.setLimit(150);
    }

    public void setLimit(int value){
        try {
            if (value > 100) {
                throw new OverlimitException("Value too high!");
            } else {
                System.out.println("Limit set to: " + value);
            }
        }catch (OverlimitException e){
            System.out.println("Overlimited");
        }catch (Exception re){
            System.out.println("Something went Wrong!");
        }
    }
}
