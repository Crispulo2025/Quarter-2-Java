import java.util.Arrays;

public class MergeArrays {
    public static void main(String[] args) {
        // Initialize two 2x2 arrays
        int[][] array1 = {
            {1, 2},
            {3, 4}
        };

        int[][] array2 = {
            {5, 6},
            {7, 8}
        };

        // Create a new 2x4 array to hold merged data
        int[][] mergedArray = new int[2][4];

        // Merge arrays row by row
        for (int i = 0; i < 2; i++) {
            // Copy elements from first array
            mergedArray[i][0] = array1[i][0];
            mergedArray[i][1] = array1[i][1];

            // Copy elements from second array
            mergedArray[i][2] = array2[i][0];
            mergedArray[i][3] = array2[i][1];
        }

        // Display the merged array
        System.out.println("Merged 2x4 Array:");
        for (int i = 0; i < mergedArray.length; i++) {
            System.out.println(Arrays.toString(mergedArray[i]));
        }
    }
}
