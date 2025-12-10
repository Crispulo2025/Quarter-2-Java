import java.util.Scanner;

public class ExpressionCalculator {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner input = new Scanner(System.in);

        // Ask the user for integers a, b, c, and d
        System.out.print("Enter integer a: ");
        int a = input.nextInt();

        System.out.print("Enter integer b: ");
        int b = input.nextInt();

        System.out.print("Enter integer c: ");
        int c = input.nextInt();

        System.out.print("Enter integer d: ");
        int d = input.nextInt();

        // Calculate the expression (a + b) * (c - d)
        int result = (a + b) * (c - d);

        // Display the result
        System.out.println("The result of the expression (a + b) * (c - d) is: " + result);

        // Close the scanner
        input.close();
    }
}
