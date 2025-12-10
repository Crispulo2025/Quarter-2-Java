import java.util.Scanner;

public class SmallestOfThree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Ask the user for three integers
        System.out.print("Enter first number: ");
        int num1 = input.nextInt();

        System.out.print("Enter second number: ");
        int num2 = input.nextInt();

        System.out.print("Enter third number: ");
        int num3 = input.nextInt();

        // Assume num1 is the smallest initially
        int smallest = num1;

        // Compare num2
        if (num2 < smallest) {
            smallest = num2;
        }

        // Compare num3
        if (num3 < smallest) {
            smallest = num3;
        }

        // Output the smallest value
        System.out.println("The smallest number is: " + smallest);
    }
}
