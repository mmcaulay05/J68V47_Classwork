import java.util.Scanner;

public class Lesson6E2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            displayMenu();
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1 -> sayHello();
                case 2 -> tellTime();
                case 3 -> tellJoke();
                case 4 -> System.out.println("Goodbye!");
                default -> System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);

        scanner.close();
    }

    public static void displayMenu() {
        System.out.println("Menu:");
        System.out.println("1. Say 'hello'");
        System.out.println("2. Tell me the time");
        System.out.println("3. Tell me a joke");
        System.out.println("4. Quit");
    }

    public static void sayHello() {
        System.out.println("Hello!");
    }

    public static void tellTime() {

        System.out.println("The current time is: [Implement your time logic here]");
    }

    public static void tellJoke() {

        System.out.println("Why don't scientists trust atoms?");
        System.out.println("Because they make up everything!");
    }
}





