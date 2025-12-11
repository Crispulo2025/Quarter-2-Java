import java.util.Scanner;

public class DivisibleBy3Or5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Ask the user for a number
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Check if the number is divisible by 3 or 5
        if (number % 3 == 0 || number % 5 == 0) {
            System.out.println(number + " is divisible by 3 or 5.");
        } else {
            System.out.println(number + " is NOT divisible by 3 or 5.");
        }

        input.close();
    }
}
