package random;
import java.util.Random;
import java.util.Scanner;

	public class NumberGuessingGame {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        Random random = new Random();
	        int minRange = 1;
	        int maxRange = 100;
	        int numberOfAttempts = 10;
	        int score = 0;

	        System.out.println("Welcome to the Number Guessing Game!");
	        System.out.println("You have " + numberOfAttempts + " attempts to guess the number between " + minRange + " and " + maxRange + ".");

	        boolean playAgain = true;
	        while (playAgain) {
	            int targetNumber = random.nextInt(maxRange - minRange + 1) + minRange;
	            int attempts = 0;
	            boolean hasGuessedCorrectly = false;

	            while (attempts < numberOfAttempts && !hasGuessedCorrectly) {
	                System.out.print("Enter your guess: ");
	                int userGuess = scanner.nextInt();
	                attempts++;

	                if (userGuess == targetNumber) {
	                    System.out.println("Congratulations! You guessed the correct number in " + attempts + " attempts.");
	                    score++;
	                    hasGuessedCorrectly = true;
	                } else if (userGuess < targetNumber) {
	                    System.out.println("Your guess is too low. Try again.");
	                } else {
	                    System.out.println("Your guess is too high. Try again.");
	                }
	            }

	            if (!hasGuessedCorrectly) {
	                System.out.println("Sorry, you've run out of attempts. The correct number was " + targetNumber + ".");
	            }

	            System.out.print("Play again? (yes/no): ");
	            String playAgainResponse = scanner.next().toLowerCase();
	            playAgain = playAgainResponse.equals("yes");
	        }

	        System.out.println("Thanks for playing! Your score is: " + score);
	        scanner.close();
	    }
	}

