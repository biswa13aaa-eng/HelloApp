public class HelloApp {

    public static void main(String[] args) {

        // If no command-line arguments are given
        if (args.length == 0) {
            System.out.println("Hello, World!");
        } 
        else {
            StringBuilder nameBuilder = new StringBuilder();
            boolean first = true;

            // Enhanced for loop to read all arguments
            for (String name : args) {
                if (!first) {
                    nameBuilder.append(", ");
                }
                nameBuilder.append(name);
                first = false;
            }

            // Display greeting
            System.out.println("Hello, " + nameBuilder.toString() + "!");
        }
    }
}
