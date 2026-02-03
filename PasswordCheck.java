import java.util.Scanner;

public class PasswordCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Preset password
        String presetPassword = "Secret123";

        // Ask user to enter a password
        System.out.print("Enter your password: ");
        String userPassword = scanner.nextLine();

        // Check if it matches the preset password
        if (userPassword.equals(presetPassword)) {
            System.out.println("Access granted");
        } else {
            System.out.println("Access denied");
        }

        scanner.close();
    }
}
