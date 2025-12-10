import java.util.Scanner;

public class PasswordCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Predefined password and account status
        String correctPassword = "Pass123";  // example password
        boolean accountActive = true;        // account status

        // Ask user for password
        System.out.print("Enter your password: ");
        String enteredPassword = input.nextLine();

        // Check if password is correct and account is active
        if (enteredPassword.equals(correctPassword) && accountActive) {
            System.out.println("Access granted. Welcome!");
        } else {
            System.out.println("Access denied. Incorrect password or inactive account.");
        }

        input.close();
    }
}
