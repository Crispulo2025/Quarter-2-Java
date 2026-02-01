import java.util.Scanner;

public class Input2DArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create a 2x3 2D array
        int[][] matrix = new int[2][3];

        // Input values from the user
        System.out.println("Enter 6 integers for a 2x3 matrix:");
        for (int i = 0; i < 2; i++) { // iterate rows
            for (int j = 0; j < 3; j++) { // iterate columns
                System.out.print("Enter element [" + i + "][" + j + "]: ");
                matrix[i][j] = sc.nextInt();
            }
        }

        // Display the 2D array
        System.out.println("\nThe 2x3 matrix is:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }

        sc.close();
    }
}
