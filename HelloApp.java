/**
 * HelloApp UC 4C:
 * This program accepts multiple command-line arguments (names)
 * and displays a personalized greeting using String.join().
 * If no names are provided, it displays "Hello, World!".
 *
 * Usage: java HelloApp [name1] [name2] ... [nameN]
 */

public class HelloApp {

    public static void main(String[] args) {

        String names = "World";

        // Check if any command-line arguments are provided
        if (args.length > 0) {
            // Join all names with comma and space
            names = String.join(", ", args);
        }

        // Display greeting
        System.out.println("Hello, " + names + "!");
    }
}