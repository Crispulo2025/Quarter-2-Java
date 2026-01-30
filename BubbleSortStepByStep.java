import java.util.Arrays;

public class BubbleSortStepByStep {

    // Bubble Sort method with array print after each swap
    public static void bubbleSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {

                if (arr[j] > arr[j + 1]) {
                    // Swap elements
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    // Print array after each swap
                    System.out.println("Swap (" + arr[j + 1] + " <-> " + arr[j] + "): " + Arrays.toString(arr));
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] numbers = {5, 1, 4, 2, 8};

        System.out.println("Original array: " + Arrays.toString(numbers));
        bubbleSort(numbers);
        System.out.println("Sorted array:   " + Arrays.toString(numbers));
    }
}
