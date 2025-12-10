import java.util.Scanner;

public class GreaterOrEqualCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input the first number
        System.out.print("Enter the first number: ");
        int first = input.nextInt();

        // Input the second number
        System.out.print("Enter the second number: ");
        int second = input.nextInt();

        // Check if first is greater than or equal to second
        if (first >= second) {
            System.out.println("The first number is greater than or equal to the second.");
        } else {
            System.out.println("The first number is less than the second.");
        }

        input.close();
    }
}
