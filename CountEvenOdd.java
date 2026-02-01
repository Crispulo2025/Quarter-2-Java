public class CountEvenOdd {
    public static void main(String[] args) {
        // Initialize 3x3 array
        int[][] array = {
            {2, 5, 8},
            {3, 6, 1},
            {7, 4, 9}
        };

        int evenCount = 0;
        int oddCount = 0;

        // Loop through the array
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] % 2 == 0) {
                    evenCount++;
                } else {
                    oddCount++;
                }
            }
        }

        // Display results
        System.out.println("Number of even elements: " + evenCount);
        System.out.println("Number of odd elements: " + oddCount);
    }
}
