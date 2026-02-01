public class LargestIn2DArray {

    public static void main(String[] args) {
        // Create a 4x4 2D array
        int[][] matrix = {
            {5, 12, 7, 3},
            {9, 15, 6, 8},
            {4, 11, 14, 2},
            {10, 1, 13, 16}
        };

        // Assume the first element is the largest
        int largest = matrix[0][0];

        // Iterate through the array to find the largest element
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (matrix[i][j] > largest) {
                    largest = matrix[i][j];
                }
            }
        }

        // Display the largest element
        System.out.println("The largest element in the 4x4 array is: " + largest);
    }
}
