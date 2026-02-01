import java.util.Arrays;

public class ReverseRows2D {
    public static void main(String[] args) {
        // Initialize 3x3 array
        int[][] array = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Reverse each row
        for (int i = 0; i < array.length; i++) {
            int left = 0;
            int right = array[i].length - 1;

            while (left < right) {
                int temp = array[i][left];
                array[i][left] = array[i][right];
                array[i][right] = temp;

                left++;
                right--;
            }
        }

        // Print the updated array
        System.out.println("Array after reversing each row:");
        for (int[] row : array) {
            System.out.println(Arrays.toString(row));
        }
    }
}
