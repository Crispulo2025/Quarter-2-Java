import java.util.Arrays;

public class SwapRows {
    public static void main(String[] args) {
        // Initialize a 2D array
        int[][] array = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12}
        };

        System.out.println("Original Array:");
        displayArray(array);

        // Swap first row with last row
        int[] temp = array[0];        // store first row in temp
        array[0] = array[array.length - 1]; // first row = last row
        array[array.length - 1] = temp;     // last row = temp

        System.out.println("\nArray after swapping first and last row:");
        displayArray(array);
    }

    // Method to display 2D array
    public static void displayArray(int[][] arr) {
        for (int[] row : arr) {
            System.out.println(Arrays.toString(row));
        }
    }
}
