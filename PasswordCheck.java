import java.util.Scanner;

public class PasswordCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password;
        String correctPassword = "java123";

        do {
            System.out.print("Enter password: ");
            password = scanner.nextLine();
        } while (!password.equals(correctPassword));

        System.out.println("Access granted!");

        scanner.close();
    }
}
