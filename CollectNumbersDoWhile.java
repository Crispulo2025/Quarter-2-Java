import java.util.ArrayList;
import java.util.Scanner;

public class CollectNumbersDoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>(); // To store entered numbers
        int num;

        do {
            System.out.print("Enter a number (negative number to quit): ");
            num = scanner.nextInt();

            if (num >= 0) {
                numbers.add(num); // Store only non-negative numbers
            }
        } while (num >= 0); // Continue until a negative number is entered

        System.out.println("You entered the following numbers:");
        for (int n : numbers) {
            System.out.println(n);
        }

        scanner.close();
    }
}
