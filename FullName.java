import java.util.Scanner;

public class FullName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask for first name
        System.out.print("Enter your first name: ");
        String firstName = scanner.nextLine();

        // Ask for last name
        System.out.print("Enter your last name: ");
        String lastName = scanner.nextLine();

        // Print full name on one line
        System.out.println("Your full name is: " + firstName + " " + lastName);

        scanner.close();
    }
}
