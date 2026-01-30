import java.util.Scanner;

public class InsertionSortFloat {

    // Method to perform Insertion Sort on an array of doubles
    public static void insertionSort(double[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            double key = arr[i];
            int j = i - 1;

            // Move elements greater than key one position ahead
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number of elements
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        double[] numbers = new double[n];

        // Input floating-point numbers
        System.out.println("Enter the numbers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextDouble();
        }

        // Sort array
        insertionSort(numbers);

        // Display sorted array
        System.out.println("\nSorted array:");
        for (double num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();

        sc.close();
    }
}
