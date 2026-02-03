import java.util.Scanner;

public class LargestSmallest {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number;
        int largest = Integer.MIN_VALUE;  // Initialize to smallest possible integer
        int smallest = Integer.MAX_VALUE; // Initialize to largest possible integer

        System.out.println("Enter numbers (enter -1 to stop):");

        do {
            number = scanner.nextInt();

            if (number != -1) {
                if (number > largest) {
                    largest = number;
                }
                if (number < smallest) {
                    smallest = number;
                }
            }

        } while (number != -1);

        if (largest == Integer.MIN_VALUE) {
            System.out.println("No numbers were entered.");
        } else {
            System.out.println("Largest number: " + largest);
            System.out.println("Smallest number: " + smallest);
        }
    }
}
