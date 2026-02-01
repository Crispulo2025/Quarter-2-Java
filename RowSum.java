public class RowSum {

    public static void main(String[] args) {
        // Create a 3x3 2D array
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Array to store the sum of each row
        int[] rowSums = new int[3];

        // Compute the sum of each row
        for (int i = 0; i < 3; i++) { // iterate rows
            int sum = 0;
            for (int j = 0; j < 3; j++) { // iterate columns
                sum += matrix[i][j];
            }
            rowSums[i] = sum;
        }

        // Display the sum of each row
        for (int i = 0; i < 3; i++) {
            System.out.println("Sum of row " + (i + 1) + ": " + rowSums[i]);
        }
    }
}
