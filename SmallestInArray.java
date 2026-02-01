import java.util.Scanner;

public class SmallestInArray {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        int[] numbers = new int[n];

        // User input
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Assume first element is the smallest
        int smallest = numbers[0];

        // Find the smallest number
        for (int i = 1; i < n; i++) {
            if (numbers[i] < smallest) {
                smallest = numbers[i];
            }
        }

        // Display result
        System.out.println("The smallest number in the array is: " + smallest);

        scanner.close();
    }
}
