public class MedianFinder {

    // Method to perform Insertion Sort
    public static void insertionSort(int[] arr) {
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
        }
    }

    // Method to find the median of a sorted array
    public static double findMedian(int[] arr) {
        int n = arr.length;
        if (n % 2 != 0) {
            // Odd number of elements → middle element
            return arr[n / 2];
        } else {
            // Even number of elements → average of two middle elements
            return (arr[(n / 2) - 1] + arr[n / 2]) / 2.0;
        }
    }

    public static void main(String[] args) {
        int[] numbers = {9, 4, 6, 2, 10};

        // Sort the array
        insertionSort(numbers);

        // Display sorted array
        System.out.print("Sorted array: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Find and display median
        double median = findMedian(numbers);
        System.out.println("Median: " + median);
    }
}
