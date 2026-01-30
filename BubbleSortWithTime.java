public class BubbleSortWithTime {

    // Bubble Sort method
    public static void bubbleSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap elements
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] numbers = {64, 34, 25, 12, 22, 11, 90};

        // Record start time
        long startTime = System.currentTimeMillis();

        bubbleSort(numbers);

        // Record end time
        long endTime = System.currentTimeMillis();

        long executionTime = endTime - startTime;

        // Display sorted array
        System.out.print("Sorted array: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }

        System.out.println("\nExecution time: " + executionTime + " ms");
    }
}
