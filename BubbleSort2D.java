public class BubbleSort2D {
    
    // Method to sort a 2D array using Bubble Sort
    public static void bubbleSort2D(int[][] arr) {
        int rows = arr.length;
        int cols = arr[0].length;
        int totalElements = rows * cols;

        // Flattened index logic
        for (int i = 0; i < totalElements - 1; i++) {
            for (int j = 0; j < totalElements - i - 1; j++) {
                // Convert 1D index to 2D indices
                int row1 = j / cols;
                int col1 = j % cols;
                int row2 = (j + 1) / cols;
                int col2 = (j + 1) % cols;

                // Swap if elements are out of order
                if (arr[row1][col1] > arr[row2][col2]) {
                    int temp = arr[row1][col1];
                    arr[row1][col1] = arr[row2][col2];
                    arr[row2][col2] = temp;
                }
            }
        }
    }

    // Utility method to print 2D array
    public static void print2DArray(int[][] arr) {
        for (int[] row : arr) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] arr = {
            {5, 2, 9},
            {1, 6, 3},
            {8, 4, 7}
        };

        System.out.println("Original 2D Array:");
        print2DArray(arr);

        bubbleSort2D(arr);

        System.out.println("\nSorted 2D Array:");
        print2DArray(arr);
    }
}
