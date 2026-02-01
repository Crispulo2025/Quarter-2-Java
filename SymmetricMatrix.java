public class SymmetricMatrix {
    public static void main(String[] args) {
        // Initialize a 4x4 matrix
        int[][] matrix = {
            {1, 2, 3, 4},
            {2, 5, 6, 7},
            {3, 6, 8, 9},
            {4, 7, 9, 10}
        };

        if (isSymmetric(matrix)) {
            System.out.println("The matrix is symmetric.");
        } else {
            System.out.println("The matrix is not symmetric.");
        }
    }

    // Method to check symmetry
    public static boolean isSymmetric(int[][] matrix) {
        int n = matrix.length;

        // Only need to check elements above the diagonal
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (matrix[i][j] != matrix[j][i]) {
                    return false; // not symmetric
                }
            }
        }
        return true; // symmetric
    }
}
