import java.util.Scanner;

public class StudentProfile {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Ask for full name
        System.out.print("Enter your full name: ");
        String fullName = scanner.nextLine();

        // Ask for grade level
        System.out.print("Enter your grade level: ");
        int gradeLevel = scanner.nextInt();

        // Display formatted student profile
        System.out.println("\n--- Student Profile ---");
        System.out.printf("Name       : %s%n", fullName);
        System.out.printf("Grade Level: %d%n", gradeLevel);

        scanner.close();
    }
}
