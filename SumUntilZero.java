import java.util.Scanner;

public class SumUntilZero {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number;
        int sum = 0;

        // Do-while loop to get input and calculate sum
        do {
            System.out.print("Enter a number (0 to stop): ");
            number = scanner.nextInt();
            sum += number;  // Add number to sum
        } while (number != 0);

        // Display total sum
        System.out.println("Total sum of entered numbers: " + sum);
    }
}
