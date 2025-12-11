import java.util.Scanner;

public class LoginCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Predefined username and password
        String correctUsername = "user123";
        String correctPassword = "Pass123";

        // Ask for username
        System.out.print("Enter your username: ");
        String username = input.nextLine();

        // Ask for password
        System.out.print("Enter your password: ");
        String password = input.nextLine();

        // Check login credentials
        if (username.equals(correctUsername) && password.equals(correctPassword)) {
            System.out.println("Access Granted");
        } else {
            System.out.println("Access Denied");
        }

        input.close();
    }
}
