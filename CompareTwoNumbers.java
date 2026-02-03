import java.util.Scanner;

public class CompareTwoNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Ask the user for two numbers
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        // Compare the numbers
        if (num1 == num2) {
            System.out.println("Numbers are equal");
        } else {
            System.out.println("Numbers are different");
        }

        scanner.close();
    }
}
