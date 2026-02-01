public class CountEvenNumbers {
    public static void main(String[] args) {

        int[] numbers = { 3, 8, 12, 5, 7, 10, 6 };
        int count = 0;

        // Count even numbers
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                count++;
            }
        }

        // Display the result
        System.out.println("Number of even values in the array: " + count);
    }
}
