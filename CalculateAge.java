import java.util.Scanner;

public class CalculateAge {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Read the user's birth year
        System.out.print("Enter your birth year: ");
        int birthYear = scanner.nextInt();

        // Calculate age assuming current year is 2025
        int age = 2025 - birthYear;

        // Display the result
        System.out.println("Your age in 2025 will be: " + age);

        scanner.close();
    }
}
