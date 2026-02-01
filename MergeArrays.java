import java.util.Arrays;

public class MergeArrays {

    public static void main(String[] args) {
        // Initialize two arrays
        int[] array1 = {1, 3, 5, 7};
        int[] array2 = {2, 4, 6, 8};

        // Create a new array to hold the merged result
        int[] mergedArray = new int[array1.length + array2.length];

        // Copy elements of array1 into mergedArray
        for (int i = 0; i < array1.length; i++) {
            mergedArray[i] = array1[i];
        }

        // Copy elements of array2 into mergedArray
        for (int i = 0; i < array2.length; i++) {
            mergedArray[array1.length + i] = array2[i];
        }

        // Display the merged array
        System.out.println("Merged array: " + Arrays.toString(mergedArray));
    }
}
