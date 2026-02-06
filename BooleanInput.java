import java.util.Scanner;

public class BooleanInput {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter a boolean value
        System.out.print("Enter a boolean value (true or false): ");
        boolean value = scanner.nextBoolean();

        // Display a message based on the input
        if (value) {
            System.out.println("You entered TRUE");
        } else {
            System.out.println("You entered FALSE");
        }

        scanner.close();
    }
}
