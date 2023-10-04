import java.util.Scanner;

public class ShortStoryGenerator {



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input name and hobby
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your hobby: ");
        String hobby = scanner.nextLine();

        // Generate and output the story
        String story = generateStory(name, hobby);
        System.out.println(story);

        scanner.close();
    }

    public static String generateStory(String name, String hobby) {
        // Predefined story template with placeholders for name and hobby
        String storyTemplate = "Once upon a time, there was a person named %s. %s was a passionate %s. One day, while %s was enjoying their favorite hobby, something magical happened. %s's heart filled with joy as they realized that %s's hobby had brought them closer to their dreams.";

        // Replace placeholders with user inputs
        String story = String.format(storyTemplate, name, name, hobby, name, name, name);

        return story;
    }
}
