public class InsertionSortDescending {

    // Insertion Sort in descending order
    public static void insertionSortDescending(int[] arr) {
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;

            // Shift elements smaller than key
            while (j >= 0 && arr[j] < key) {
                arr[j + 1] = arr[j];
                j--;
            }

            // Insert key at correct position
            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] arr = {8, 3, 5, 2, 9, 1};

        insertionSortDescending(arr);

        // Print sorted array
        System.out.print("Sorted array (descending): ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
