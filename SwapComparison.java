import java.util.Arrays;

public class SwapComparison {

    // Bubble Sort with swap counter
    public static int bubbleSort(int[] arr) {
        int n = arr.length;
        int swaps = 0;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swaps++;
                }
            }
        }
        return swaps;
    }

    // Selection Sort with swap counter
    public static int selectionSort(int[] arr) {
        int n = arr.length;
        int swaps = 0;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            if (minIndex != i) {
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
                swaps++;
            }
        }
        return swaps;
    }

    public static void main(String[] args) {
        int[] original = {64, 25, 12, 22, 11};

        int[] bubbleArray = Arrays.copyOf(original, original.length);
        int[] selectionArray = Arrays.copyOf(original, original.length);

        int bubbleSwaps = bubbleSort(bubbleArray);
        int selectionSwaps = selectionSort(selectionArray);

        System.out.println("Original array: " + Arrays.toString(original));
        System.out.println("Bubble Sort swaps: " + bubbleSwaps);
        System.out.println("Selection Sort swaps: " + selectionSwaps);
    }
}
