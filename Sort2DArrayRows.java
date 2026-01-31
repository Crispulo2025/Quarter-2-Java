import java.util.Arrays;

public class Sort2DArrayRows {

    // Bubble Sort for a single row
    public static void bubbleSort(int[] row) {
        int n = row.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (row[j] > row[j + 1]) {
                    // Swap
                    int temp = row[j];
                    row[j] = row[j + 1];
                    row[j + 1] = temp;
                }
            }
        }
    }

    // Sort all rows in the 2D array
    public static void sortRows(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            bubbleSort(arr[i]);
        }
    }

    // Display the 2D array
    public static void displayArray(int[][] arr) {
        for (int[] row : arr) {
            System.out.println(Arrays.toString(row));
        }
    }

    public static void main(String[] args) {
        // Initialize a 2D array
        int[][] array = {
            {9, 2, 7},
            {4, 6, 1},
            {8, 5, 3}
        };

        System.out.println("Original 2D Array:");
        displayArray(array);

        // Sort each row
        sortRows(array);

        System.out.println("\n2D Array after sorting each row:");
        displayArray(array);
    }
}
