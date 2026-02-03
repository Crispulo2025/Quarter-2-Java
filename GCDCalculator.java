import java.util.Scanner;

public class GCDCalculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        int a = num1;
        int b = num2;

        // Using Euclidean algorithm with a while loop
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        System.out.println("The GCD of " + num1 + " and " + num2 + " is: " + a);
    }
}
