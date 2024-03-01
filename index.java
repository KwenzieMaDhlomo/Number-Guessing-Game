package numberguessinggame;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

    public static void main(String[] args) {

        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);

        int randomNumber = rand.nextInt(100) + 1;
        // System.out.println("Random number is" + "" + randomNumber);

        while (true) {

             System.out.print("\033[H\033[2J"); // Clear the console
            System.out.flush();
            
            System.out.println("\nWelcome to the Number Guessing Game!");
            System.out.println("====================================");
            System.out.println("I've picked a number between 1 and 100. Can you guess it?");
            System.out.println("====================================");
            System.out.println("Enter your guess (1-100):");

            int playerGuess = scanner.nextInt();

            if (playerGuess == randomNumber) {
                System.out.println("\n\033[1;55mCongratulations! It's a WIN!\033[0m");
                break;
            } else if (randomNumber > playerGuess) {
                System.out.println("\n\033[1;32mNAH! The number is higher. Guess again.\033[0m");
            } else {
                System.out.println("\n\033[1;32mNAH! The number is lower. Guess again.\033[0m");
            }
        }
    }
}
