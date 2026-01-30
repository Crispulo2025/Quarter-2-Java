import java.util.Scanner;

public class DescendingSortAbove50 {

    // Method to perform Insertion Sort in descending order for elements > 50
    public static void insertionSortDescendingAbove50(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;

            // Only consider elements greater than 50 for sorting
            if (key > 50) {
                // Move elements greater than 50 that are smaller than key
                while (j >= 0 && arr[j] > 50 && arr[j] < key) {
                    arr[j + 1] = arr[j];
                    j--;
                }
                arr[j + 1] = key;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] numbers = new int[n];

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }

        // Sort array
        insertionSortDescendingAbove50(numbers);

        // Display array after sorting
        System.out.print("Array after sorting elements > 50 in descending order: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();

        sc.close();
    }
}
