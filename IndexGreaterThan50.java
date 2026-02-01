public class IndexGreaterThan50 {

    public static void main(String[] args) {
        // Initialize an array of integers
        int[] numbers = {12, 75, 33, 88, 50, 61, 45, 90};

        System.out.println("Array elements greater than 50 are at indices:");

        // Loop through the array and check for elements greater than 50
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 50) {
                System.out.println("Index " + i + " (Value: " + numbers[i] + ")");
            }
        }
    }
}
