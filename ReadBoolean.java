import java.util.Scanner;

public class ReadBoolean {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Read a boolean value from the user
        System.out.print("Are you a student? (true/false): ");
        boolean isStudent = scanner.nextBoolean();

        // Display the value
        System.out.println("isStudent = " + isStudent);

        scanner.close();
    }
}
