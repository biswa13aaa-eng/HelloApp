/**
 * HelloApp UC4 - Greets multiple users using command-line arguments
 * If no names are provided, it greets "World".
 */

public class HelloApp {

    public static void main(String[] args) {

        // Default name
        String name = "World";

        // Check if names are provided
        if (args.length > 0) {

            StringBuilder nameBuilder = new StringBuilder();

            for (int i = 0; i < args.length; i++) {
                nameBuilder.append(args[i]);

                if (i < args.length - 1) {
                    nameBuilder.append(", ");
                }
            }

            name = nameBuilder.toString();
        }

        // Print greeting
        System.out.println("Hello, " + name + "!");
    }
}