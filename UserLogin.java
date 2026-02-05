import java.util.Scanner;

public class UserLogin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask for username
        System.out.print("Enter your username: ");
        String username = scanner.nextLine();

        // Ask for password
        System.out.print("Enter your password: ");
        String password = scanner.nextLine(); // We won't display this

        // Display confirmation message
        System.out.println("Welcome, " + username + "! Your login was successful.");

        scanner.close();
    }
}
