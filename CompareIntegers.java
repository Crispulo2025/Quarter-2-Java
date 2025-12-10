import java.util.Scanner;

public class CompareIntegers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Ask the user for the first integer
        System.out.print("Enter the first integer: ");
        int first = input.nextInt();

        // Ask the user for the second integer
        System.out.print("Enter the second integer: ");
        int second = input.nextInt();

        // Compare the two integers
        if (first == second) {
            System.out.println("The first integer is equal to the second.");
        } else {
            System.out.println("The first integer is NOT equal to the second.");
        }

        input.close();
    }
}
