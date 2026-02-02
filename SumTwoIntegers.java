import java.util.Scanner;

public class SumTwoIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the first integer
        System.out.print("Enter the first integer: ");
        int num1 = scanner.nextInt();

        // Read the second integer
        System.out.print("Enter the second integer: ");
        int num2 = scanner.nextInt();

        // Calculate the sum
        int sum = num1 + num2;

        // Print the result
        System.out.println("The sum is: " + sum);

        scanner.close();
    }
}
