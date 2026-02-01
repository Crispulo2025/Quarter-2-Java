public class TransposeMatrix {

    public static void main(String[] args) {
        // Original 3x3 matrix
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Create a matrix to store the transpose
        int[][] transpose = new int[3][3];

        // Transpose the matrix
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }

        // Display the transposed matrix
        System.out.println("Transposed matrix:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(transpose[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
