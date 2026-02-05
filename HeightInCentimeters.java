import java.util.Scanner;

public class HeightInCentimeters {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Ask for height in meters
        System.out.print("Enter your height in meters: ");
        double heightMeters = scanner.nextDouble();

        // Convert to centimeters
        double heightCm = heightMeters * 100;

        // Print formatted output
        System.out.printf("Your height is %.2f centimeters.%n", heightCm);

        scanner.close();
    }
}
