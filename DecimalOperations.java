import java.util.Scanner;

public class DecimalOperations {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Ask for first decimal number
        System.out.print("Enter the first decimal number: ");
        double num1 = scanner.nextDouble();

        // Ask for second decimal number
        System.out.print("Enter the second decimal number: ");
        double num2 = scanner.nextDouble();

        // Perform calculations
        double sum = num1 + num2;
        double difference = num1 - num2;
        double product = num1 * num2;
        double quotient = num1 / num2;

        // Display results formatted to 3 decimal places
        System.out.printf("Sum        : %.3f%n", sum);
        System.out.printf("Difference : %.3f%n", difference);
        System.out.printf("Product    : %.3f%n", product);
        System.out.printf("Quotient   : %.3f%n", quotient);

        scanner.close();
    }
}
