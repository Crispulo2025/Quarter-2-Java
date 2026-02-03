import java.util.Scanner;

public class FactorialWhile {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Ask user for a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        long factorial = 1;
        int i = 1;

        // While loop to calculate factorial
        while (i <= number) {
            factorial = factorial * i;
            i++;
        }

        // Display result
        System.out.println("Factorial of " + number + " is: " + factorial);
    }
}
