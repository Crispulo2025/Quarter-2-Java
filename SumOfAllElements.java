public class SumOfAllElements {

    public static void main(String[] args) {
        // Initialize a 3x3 integer array
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int sum = 0;

        // Calculate the sum of all elements
        for (int i = 0; i < 3; i++) {       // iterate rows
            for (int j = 0; j < 3; j++) {   // iterate columns
                sum += matrix[i][j];
            }
        }

        // Display the sum
        System.out.println("Sum of all elements in the 3x3 array is: " + sum);
    }
}
