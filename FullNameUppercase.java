import java.util.Scanner;

public class FullNameUppercase {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Read full name
        System.out.print("Enter your full name: ");
        String fullName = scanner.nextLine();

        // Convert to uppercase and display
        System.out.println("Your name in uppercase: " + fullName.toUpperCase());

        scanner.close();
    }
}
