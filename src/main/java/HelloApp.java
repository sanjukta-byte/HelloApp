public class HelloApp {

    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("Hello, World!");
        } 
        else {

            String names = "";

            for (String name : args) {
                names += name + ", ";
            }

            // Remove last comma and space using substring
            names = names.substring(0, names.length() - 2);

            System.out.println("Hello, " + names + "!");
        }

    }

}