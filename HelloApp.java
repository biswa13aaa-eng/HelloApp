/**
 * HelloApp.java - A simple Java application that greets the user by name
 * if provided as a command-line argument, or defaults to greeting "World".
 */

public class HelloApp {

    public static void main(String[] args) {

        // Default name
        String name = "World";

        // Check if a name is provided as a command-line argument
        if (args.length > 0) {
            name = args[0];
        }

        // Print greeting
        System.out.println("Hello, " + name + "!");
    }
}