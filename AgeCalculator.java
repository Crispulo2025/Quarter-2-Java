import java.util.Scanner;

public class AgeCalculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Read birth year
        System.out.print("Enter your birth year: ");
        int birthYear = scanner.nextInt();

        // Read current year
        System.out.print("Enter the current year: ");
        int currentYear = scanner.nextInt();

        // Compute age
        int age = currentYear - birthYear;

        // Display result using formatted output
        System.out.printf("You are %d years old.%n", age);
    }
}
