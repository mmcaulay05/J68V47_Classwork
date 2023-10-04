import java.util.Scanner;

public class lesson4 {



    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter your first name: ");
        String firstName = scanner.nextLine();

        System.out.print("Enter your surname: ");
        String surname = scanner.nextLine();


        System.out.print("Enter your year of birth (e.g., 1999): ");
        int yearOfBirth = scanner.nextInt();


        int currentYear = java.time.Year.now().getValue();
        int age = currentYear - yearOfBirth;


        System.out.println("\nUser Information:");
        System.out.println("First Name: " + firstName);
        System.out.println("Surname: " + surname);
        System.out.println("Year of Birth: " + yearOfBirth);
        System.out.println("Age: " + age + " years");

        scanner.close();
    }
}

