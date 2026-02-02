import java.util.Scanner;

public class ReverseName {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Read first and last names separately
        System.out.print("Enter your first name: ");
        String firstName = scanner.nextLine();

        System.out.print("Enter your last name: ");
        String lastName = scanner.nextLine();

        // Print in reverse order
        System.out.println("Name in reverse order: " + lastName + " " + firstName);

        scanner.close();
    }
}
