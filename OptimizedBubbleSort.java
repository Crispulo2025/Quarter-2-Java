public class OptimizedBubbleSort {
    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 4, 2};
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false; // Track if a swap occurs in this pass

            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap elements
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true; // Swap occurred
                }
            }

            // Print array after each pass
            System.out.print("After pass " + (i + 1) + ": ");
            for (int num : arr) {
                System.out.print(num + " ");
            }
            System.out.println();

            // If no swaps occurred, array is sorted
            if (!swapped) {
                System.out.println("No swaps in this pass. Array is sorted early.");
                break;
            }
        }

        // Final sorted array
        System.out.println("\nSorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
