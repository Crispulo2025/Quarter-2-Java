import java.util.Scanner;

public class HeightCategory {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Ask the user for height in centimeters
        System.out.print("Enter your height in cm: ");
        double height = scanner.nextDouble();

        // Determine height category
        if (height < 150) {
            System.out.println("You are short.");
        } else if (height >= 150 && height <= 170) {
            System.out.println("You are average.");
        } else {
            System.out.println("You are tall.");
        }

        scanner.close();
    }
}
