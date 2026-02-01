public class SumMultiplesOfThree {
    public static void main(String[] args) {
        // Initialize 3x4 array
        int[][] array = {
            {3, 5, 6, 7},
            {9, 2, 12, 4},
            {1, 15, 8, 18}
        };

        int sum = 0;

        // Loop through the array
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] % 3 == 0) {  // check multiple of 3
                    sum += array[i][j];
                }
            }
        }

        // Display result
        System.out.println("Sum of elements that are multiples of 3: " + sum);
    }
}
