public class Sorting {

    // Method to perform Selection Sort
    public static void selectionSort(int[] arr) {
        int n = arr.length;

        // One by one move the boundary of the unsorted subarray
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            // Find the minimum element in the unsorted part
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap the found minimum element with the first element
            if (minIndex != i) {
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
    }

    // Optional: test the method
    public static void main(String[] args) {
        int[] numbers = {20, 5, 17, 2, 9};
        selectionSort(numbers);
        
        // Print sorted array
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}
