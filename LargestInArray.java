public class LargestInArray {
    public static void main(String[] args) {

        int[] numbers = { 12, 45, 7, 89, 23, 56, 34 };

        // Assume first element is the largest
        int largest = numbers[0];

        // Find the largest number
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
        }

        // Display result
        System.out.println("The largest number in the array is: " + largest);
    }
}
