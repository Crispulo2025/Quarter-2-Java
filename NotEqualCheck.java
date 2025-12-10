import java.util.Scanner;

public class NotEqualCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Ask the user for the first number
        System.out.print("Enter the first number: ");
        int first = input.nextInt();

        // Ask the user for the second number
        System.out.print("Enter the second number: ");
        int second = input.nextInt();

        // Check if the numbers are not equal
        if (first != second) {
            System.out.println("The numbers are NOT equal.");
        } else {
            System.out.println("The numbers are equal.");
        }

        input.close();
    }
}
