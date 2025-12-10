import java.util.Scanner;

public class NumberCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = input.nextInt();

        // Check if number is negative, zero, or positive
        if (num < 0) {
            System.out.println("The number is negative.");
        } else if (num == 0) {
            System.out.println("The number is zero.");
        } else {
            System.out.println("The number is positive.");
        }
    }
}
