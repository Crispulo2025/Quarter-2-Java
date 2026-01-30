import java.util.Random;

public class BubbleSortRandom {

    // Bubble Sort method
    public static void bubbleSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Random random = new Random();
        int size = 10;
        int[] numbers = new int[size];

        // Generate random numbers
        for (int i = 0; i < size; i++) {
            numbers[i] = random.nextInt(100); // 0 to 99
        }

        // Display before sorting
        System.out.print("Before sorting: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }

        bubbleSort(numbers);

        // Display after sorting
        System.out.print("\nAfter sorting: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}
