import java.util.Scanner;

public class UserInputInsertionSort {

    // Insertion Sort method
    public static void insertionSort(int[] arr) {
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;

            // Shift elements greater than key
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            // Insert key at correct position
            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[10];

        // Read 10 integers from user
        System.out.println("Enter 10 integers:");
        for (int i = 0; i < 10; i++) {
            numbers[i] = sc.nextInt();
        }

        // Sort the array
        insertionSort(numbers);

        // Print sorted array
        System.out.println("Sorted array:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}
