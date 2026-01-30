public class InsertionSortDemo {

    // Insertion Sort method
    public static void insertionSort(int[] arr) {
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;
        }
    }

    // Main method (program starts here)
    public static void main(String[] args) {
        int[] arr = {25, 18, 30, 12, 22};

        insertionSort(arr); // call the method

        // Print sorted array
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
