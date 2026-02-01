public class ReplaceDiagonalWithZero {

    public static void main(String[] args) {
        // Create a 4x4 2D array
        int[][] matrix = {
            {1,  2,  3,  4},
            {5,  6,  7,  8},
            {9, 10, 11, 12},
            {13,14, 15,16}
        };

        // Replace diagonal elements with 0
        for (int i = 0; i < 4; i++) {
            matrix[i][i] = 0;
        }

        // Print the updated array
        System.out.println("Updated 4x4 array:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
