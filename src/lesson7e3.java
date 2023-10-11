import java.util.Scanner;

public class lesson7e3{
    public static void main(String[] args) {
        int score = 0;
        int lives = 3;
        int userAnswer;
        int answer;
        int count = 1;

        while (count <= 10 && lives > 0) {
            userAnswer = askQuestion(count, count * count);
            answer = count + (count * count);

            if (answer == userAnswer) {
                score = correctAnswer(score);
            } else {
                lives = wrongAnswer(answer, lives);
            }

            count++;
        }

        gameOver(score, lives);
    }

    public static int askQuestion(int number1, int number2) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("What is " + number1 + " + " + number2 + "? ");
        return Integer.parseInt(String.valueOf(scanner.nextInt()));
    }

    public static int correctAnswer(int score) {
        System.out.println("Correct!");
        score += 1;
        return score;
    }

    public static int wrongAnswer(int answer, int lives) {
        System.out.println("Wrong! The answer is " + answer);
        lives -= 1;
        System.out.println("You have " + lives + " lives left.");
        return lives;
    }

    public static void gameOver(int score, int lives) {
        System.out.println("Game over. Your score is " + score);
        if (lives > 0) {
            System.out.println("Well done!");
        }
    }
}


