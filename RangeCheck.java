import java.util.Scanner;

public class RangeCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = input.nextInt();

        // Check if number is between 1 and 100
        if (num >= 1 && num <= 100) {
            System.out.println("The number is within the range 1 to 100.");
        } else {
            System.out.println("The number is OUTSIDE the range 1 to 100.");
        }
    }
}
