import java.util.Scanner;

public class GreaterThanCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Ask the user for the first number
        System.out.print("Enter the first number: ");
        int first = input.nextInt();

        // Ask the user for the second number
        System.out.print("Enter the second number: ");
        int second = input.nextInt();

        // Compare the two numbers
        if (first > second) {
            System.out.println("The first number is greater than the second.");
        } else if (first < second) {
            System.out.println("The first number is less than the second.");
        } else {
            System.out.println("The two numbers are equal.");
        }

        input.close();
    }
}
