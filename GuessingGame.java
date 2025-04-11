package GuessingGame;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner in = new Scanner(System.in);

        int setLimit = 5;
        boolean win = false;
        boolean validInput = false;
        boolean playAgain = false;
        int theGuessedNumber = 0;


        while (!playAgain) {
            //The rang of numbers
            int y = 1 + random.nextInt(20);
            int x = y + random.nextInt(100 - y) + 1;
            int range = x - y;

            //Random number that is going to be found
            int theNumber = y + random.nextInt(range) + 1;

            //setting a dynamic limit
            if (range < 5) {
                setLimit = 1;
            } else if (range > 50) {
                setLimit = 10;
            }


            //The Intro of the game
            System.out.println("I have a number in my head : ");
            //Number of tries
            if (setLimit > 1) {
                //Inform the user/player
                System.out.println("The Number in between " + y + " to " + x + " you can guess " + setLimit + " times");
            } else { //Inform the user/player
                System.out.println("The Number in between " + y + " to " + x + " you can guess " + setLimit + " time");
            }


            for (int i = 1; i < setLimit; i++) {
                System.out.println("Guess the number : (" + y + "/" + x + ")");
                //Validating the input
                try {
                    theGuessedNumber = in.nextInt();
                    if (theGuessedNumber >= y && theGuessedNumber <= x) {
                        validInput = true; // Input is within the valid range
                    } else {
                        System.out.println("The number must be between " + y + " and " + x + ".");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Invalid input. Please enter an integer only.");
                    in.next(); // Consume the invalid input from the scanner
                }

                if (theGuessedNumber == theNumber) {
                    if (i == 1) {
                        System.out.println("Congrats : you won - you tried for " + i + " time");
                    } else System.out.println("Congrats : you won - you tried for " + i + " times");
                    win = true;
                    break;
                } else {
                    System.out.println(theGuessedNumber > theNumber ? "Too high" : "Too low");
                }

            }
            //User won ??
            if (!win) {
                System.out.println("You lost! The number was: " + theNumber + " you tried for " + setLimit + " round");
            }




            System.out.println("Do you want to play again ? yes/no");
            String response = in.next().toLowerCase();
            if (!response.equalsIgnoreCase("yes")) {
                System.out.println("Thank you for playing");
                in.close();
                playAgain = true;
            }
        }


    }
}
