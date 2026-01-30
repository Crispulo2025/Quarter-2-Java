import java.util.Scanner;

public class InsertionSortStepByStep {

    // Method to perform Insertion Sort and print after each step
    public static void insertionSortWithSteps(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;

            // Move elements greater than key one position ahead
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;

            // Print the array after each insertion
            System.out.print("Step " + i + ": ");
            for (int num : arr) {
                System.out.print(num + " ");
            }
            System.out.println();
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

        // Perform insertion sort with step-by-step display
        System.out.println("\nSorting process:");
        insertionSortWithSteps(numbers);

        // Final sorted array
        System.out.print("\nSorted array: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();

        sc.close();
    }
}
