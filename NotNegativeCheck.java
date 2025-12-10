import java.util.Scanner;

public class NotNegativeCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Ask the user for a number
        System.out.print("Enter a number: ");
        double number = input.nextDouble();

        // Check if the number is not negative
        if (!(number < 0)) {
            System.out.println("The number is NOT negative.");
        } else {
            System.out.println("The number is negative.");
        }

        input.close();
    }
}
