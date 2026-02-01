public class SmallestElement2D {
    public static void main(String[] args) {
        // Initialize 2x3 array
        int[][] array = {
            {12, 5, 8},
            {3, 15, 7}
        };

        // Assume the first element is the smallest
        int smallest = array[0][0];

        // Loop through the array to find the smallest element
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] < smallest) {
                    smallest = array[i][j];
                }
            }
        }

        System.out.println("The smallest element in the array is: " + smallest);
    }
}
