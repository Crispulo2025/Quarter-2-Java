public class InsertionSortShiftCount {

    public static void insertionSort(int[] arr) {
        int n = arr.length;
        int shiftCount = 0; // counter for shifts

        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;

            // Shift elements greater than key
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
                shiftCount++; // count each shift
            }

            arr[j + 1] = key;
        }

        System.out.println("Total number of shifts: " + shiftCount);
    }

    public static void main(String[] args) {
        int[] arr = {15, 20, 10, 5, 30};

        insertionSort(arr);

        System.out.print("Sorted array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
