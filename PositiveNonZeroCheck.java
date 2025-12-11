import java.util.Scanner;

public class PositiveNonZeroCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Ask the user for a number
        System.out.print("Enter a number: ");
        double number = input.nextDouble();

        // Check if the number is not zero and positive
        if (number != 0 && number > 0) {
            System.out.println("The number is positive and not zero.");
        } else {
            System.out.println("The number is either zero or negative.");
        }

        input.close();
    }
}
