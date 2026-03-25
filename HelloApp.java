public class HelloApp {

    public static void main(String[] args) {

        // If no command-line arguments are given
        if (args.length == 0) {
            System.out.println("Hello, World!");
        } 
        else {
            StringBuilder nameBuilder = new StringBuilder();

            // Add names with comma and space
            for (String name : args) {
                nameBuilder.append(name).append(", ");
            }

            // Remove the last ", "
            String names = "";
            if (nameBuilder.length() > 0) {
                names = nameBuilder.substring(0, nameBuilder.length() - 2);
            }

            // Print greeting
            System.out.println("Hello, " + names + "!");
        }
    }
}