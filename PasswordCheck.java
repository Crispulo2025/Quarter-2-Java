import java.util.Scanner;

public class PasswordCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Stored password
        String storedPassword = "Secret123";

        // Ask user to enter password
        System.out.print("Enter your password: ");
        String enteredPassword = input.nextLine();

        // Compare passwords
        if (enteredPassword.equals(storedPassword)) {
            System.out.println("Password is correct. Access granted!");
        } else {
            System.out.println("Password is incorrect. Access denied!");
        }
    }
}
