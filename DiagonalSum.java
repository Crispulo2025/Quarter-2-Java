public class DiagonalSum {

    public static void main(String[] args) {
        // Define a 3x3 2D array
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int sum = 0;

        // Calculate the sum of the main diagonal
        for (int i = 0; i < 3; i++) {
            sum += matrix[i][i];
        }

        // Display the result
        System.out.println("Sum of main diagonal elements: " + sum);
    }
}
