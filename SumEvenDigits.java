import java.util.Scanner;

public class SumEvenDigits {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int sum = 0;
        int temp = number;

        while (temp != 0) {
            int digit = temp % 10; // Get the last digit
            if (digit % 2 == 0) {  // Check if the digit is even
                sum += digit;
            }
            temp /= 10; // Remove the last digit
        }

        System.out.println("The sum of all even digits in " + number + " is: " + sum);
    }
}
