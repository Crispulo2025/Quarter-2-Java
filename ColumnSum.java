public class ColumnSum {

    public static void main(String[] args) {
        // Create a 3x3 2D array
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Array to store the sum of each column
        int[] columnSums = new int[3];

        // Compute the sum of each column
        for (int j = 0; j < 3; j++) { // iterate columns
            int sum = 0;
            for (int i = 0; i < 3; i++) { // iterate rows
                sum += matrix[i][j];
            }
            columnSums[j] = sum;
        }

        // Display the sum of each column
        for (int j = 0; j < 3; j++) {
            System.out.println("Sum of column " + (j + 1) + ": " + columnSums[j]);
        }
    }
}
