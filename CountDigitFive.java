import java.util.Scanner;

public class CountDigitFive {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int count = 0;
        int temp = Math.abs(number); // Handle negative numbers

        while (temp != 0) {
            int digit = temp % 10; // Get the last digit
            if (digit == 5) {
                count++; // Increment count if digit is 5
            }
            temp /= 10; // Remove the last digit
        }

        System.out.println("The digit 5 appears " + count + " times in " + number);
    }
}
