public class BubbleSortFirstHalf {

    // Bubble Sort only the first half of the array
    public static void bubbleSortFirstHalf(int[] arr) {
        int n = arr.length;
        int mid = n / 2;   // end index of first half (exclusive)

        // Bubble Sort on first half only
        for (int i = 0; i < mid - 1; i++) {
            for (int j = 0; j < mid - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // Test the method
    public static void main(String[] args) {
        int[] arr = {9, 3, 7, 1, 8, 6, 5, 4};

        bubbleSortFirstHalf(arr);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
