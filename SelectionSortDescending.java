public class SelectionSortDescending {
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 12, 1};
        selectionSortDescending(arr);
        for(int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void selectionSortDescending(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int maxIndex = i;  // find the maximum element
            for (int j = i + 1; j < n; j++) {
                if (arr[j] > arr[maxIndex]) {   // Descending: find maximum
                    maxIndex = j;
                }
            }
            // Swap
            int temp = arr[maxIndex];
            arr[maxIndex] = arr[i];
            arr[i] = temp;
        }
    }
}
