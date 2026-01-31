public class BubbleSortExample {
    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 4, 2};
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j + 1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            // Print array after each pass
            System.out.print("After pass " + (i + 1) + ": ");
            for (int k : arr) System.out.print(k + " ");
            System.out.println();
        }
    }
}
