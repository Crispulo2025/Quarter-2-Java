import java.util.Scanner;

public class MultipleCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask user for a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Check if the number is a multiple of 3, 5, both, or neither
        if (number % 3 == 0 && number % 5 == 0) {
            System.out.println(number + " is a multiple of both 3 and 5.");
        } else if (number % 3 == 0) {
            System.out.println(number + " is a multiple of 3.");
        } else if (number % 5 == 0) {
            System.out.println(number + " is a multiple of 5.");
        } else {
            System.out.println(number + " is neither a multiple of 3 nor 5.");
        }

        scanner.close();
    }
}
