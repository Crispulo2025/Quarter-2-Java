import java.util.Scanner;

public class NumberInRange {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = input.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = input.nextInt();

        int limit = 100; // fixed limit

        // Check if num1 is between num2 and the limit
        if (num1 >= num2 && num1 <= limit) {
            System.out.println(num1 + " is between " + num2 + " and " + limit + ".");
        } else {
            System.out.println(num1 + " is NOT between " + num2 + " and " + limit + ".");
        }
    }
}
