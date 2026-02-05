import java.util.Scanner;

public class MinMaxAverage {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Read three integers
        System.out.print("Enter first integer: ");
        int a = scanner.nextInt();

        System.out.print("Enter second integer: ");
        int b = scanner.nextInt();

        System.out.print("Enter third integer: ");
        int c = scanner.nextInt();

        // Determine largest and smallest
        int largest = Math.max(a, Math.max(b, c));
        int smallest = Math.min(a, Math.min(b, c));

        // Compute average
        double average = (a + b + c) / 3.0;

        // Print results
        System.out.println("Largest: " + largest);
        System.out.println("Smallest: " + smallest);
        System.out.printf("Average: %.2f%n", average);

        scanner.close();
    }
}
