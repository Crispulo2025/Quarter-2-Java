import java.util.Scanner;

public class ReverseDigits {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Ask user for a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int reversed = 0;

        // While loop to reverse the digits
        while (number != 0) {
            int digit = number % 10;        // get last digit
            reversed = reversed * 10 + digit;
            number = number / 10;           // remove last digit
        }

        // Display result
        System.out.println("Reversed number: " + reversed);
    }
}
