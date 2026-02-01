import java.util.Scanner;

public class SearchNumberInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask for array size
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        int[] numbers = new int[n];

        // Input array elements
        System.out.println("Enter the elements:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Ask for number to search
        System.out.print("Enter the number to search: ");
        int search = scanner.nextInt();

        boolean found = false;

        // Search the array
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == search) {
                found = true;
                break;
            }
        }

        // Display result
        if (found) {
            System.out.println("Number is present in the array.");
        } else {
            System.out.println("Number is NOT present in the array.");
        }

        scanner.close();
    }
}
