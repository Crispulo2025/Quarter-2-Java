import java.util.Scanner;

public class NumberRangeCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Ask for a number
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Check if the number is outside 1–50
        if (number < 1 || number > 50) {
            System.out.println(number + " is OUTSIDE the range 1–50.");
        } else {
            System.out.println(number + " is WITHIN the range 1–50.");
        }

        input.close();
    }
}
