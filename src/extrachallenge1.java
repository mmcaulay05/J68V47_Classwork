import java.util.Random;
        import java.util.Scanner;

public class extrachallenge1 {

    public static void main(String[] args) {

        Random random = new Random();
        int randomNumber = random.nextInt(100) + 1;


        int numberOfTries = 0;
        boolean hasGuessedCorrectly = false;


        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I have selected a random number between 1 and 100.");

        while (!hasGuessedCorrectly) {
            System.out.print("Enter your guess: ");
            int userGuess = scanner.nextInt();
            numberOfTries++;

            if (userGuess < randomNumber) {
                System.out.println("Your guess is too low. Try again.");
            } else if (userGuess > randomNumber) {
                System.out.println("Your guess is too high. Try again.");
            } else {
                System.out.println("Congratulations! You guessed the correct number.");
                System.out.println("It took you " + numberOfTries + " tries.");
                hasGuessedCorrectly = true;
            }
        }


        scanner.close();
    }
}









