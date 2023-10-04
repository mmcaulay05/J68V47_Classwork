import java.util.*;
public class lesson {


    public static void main(String[] args) {



        Scanner input = new Scanner(System.in);
        System.out.print("What is your name? ");
        String name = input.nextLine();



        String firstName = "Bob";
        System.out.println(firstName);
        firstName = "Mary";
        System.out.println(firstName);



        System.out.print("What is your first name? ");
        String firstname=input.nextLine();

        System.out.print("What is your last name? ");
        String lastName = input.nextLine();

        System.out.println("Hello" + firstName + lastName);





        System.out.print("How many items? ");
        int num = input.nextInt();

        System.out.print("Price per item £");
        double price = input.nextDouble();

        System.out.format("Total = £%.2f%n", (price * num));
    }
}

