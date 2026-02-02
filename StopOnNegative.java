import java.util.Scanner;

public class StopOnNegative {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number;

        while (true) {
            System.out.print("Enter a positive integer (negative to stop): ");
            number = scanner.nextInt();

            if (number < 0) {
                break;  // Stop when a negative number is entered
            }
        }

        scanner.close();
        System.out.println("Input stopped.");
    }
}
