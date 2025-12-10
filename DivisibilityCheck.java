import java.util.Scanner;

public class DivisibilityCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Ask the user to enter a number
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Check divisibility
        if (number % 3 == 0 && number % 5 == 0) {
            System.out.println(number + " is divisible by both 3 and 5.");
        } else if (number % 3 == 0) {
            System.out.println(number + " is divisible by 3.");
        } else if (number % 5 == 0) {
            System.out.println(number + " is divisible by 5.");
        } else {
            System.out.println(number + " is not divisible by 3 or 5.");
        }

        input.close();
    }
}
