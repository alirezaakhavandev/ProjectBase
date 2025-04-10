package SimpleCalculator;

import java.util.Scanner;

public class BetterCalculator {
    private final Scanner input = new Scanner(System.in);
    private double firstNum;
    private double secNum;
    boolean continueCalculations = true;

    public double getFirstNum() {
        return firstNum;
    }

    public void setFirstNum(double firstNum) {
        this.firstNum = firstNum;
    }

    public double getSecNum() {
        return secNum;
    }

    public void setSecNum(double secNum) {
        this.secNum = secNum;
    }



    public static void main(String[] args) {
        BetterCalculator calculator = new BetterCalculator();
        while (calculator.continueCalculations) {
            System.out.print("Please enter the first number : ");
            calculator.setFirstNum(calculator.input.nextDouble());
            System.out.print("Please enter the second number : ");
            calculator.setSecNum(calculator.input.nextDouble());
            System.out.println(
                    "What operation you want to perform ? " +
                            "[1] add ," +
                            "[2] subtract ," +
                            "[3] multiply ," +
                            "[4] divide"
            );
            byte operationChoice = calculator.input.nextByte();
            switch (operationChoice) {
                case 1:
                    System.out.println("The result: " + (calculator.getFirstNum() + calculator.getSecNum()));
                    break;
                case 2:
                    System.out.println("The result: " + (calculator.getFirstNum() - calculator.getSecNum()));
                    break;
                case 3:
                    System.out.println("The result: " + (calculator.getFirstNum() * calculator.getSecNum()));
                    break;
                case 4:
                    if (calculator.getSecNum() == 0) {
                        System.out.println("Error: Division by zero is not allowed.");
                    } else {
                        System.out.println("The result: " + (calculator.getFirstNum() / calculator.getSecNum()));
                    }
                    break;
                default:
                    System.out.println("Invalid operation choice.");
            }

            System.out.println("Do you want to perform another calculation? (yes/no)");
            String response = calculator.input.next();
            if (!response.equalsIgnoreCase("yes")) {
                calculator.continueCalculations = false;
                calculator.input.close();
            }

        }


    }

}
