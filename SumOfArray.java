public class SumOfArray {
    public static void main(String[] args) {

        int[] numbers = { 5, 12, 7, 9, 20, 15, 3, 8, 11, 6 };
        int sum = 0;

        // Calculate the sum of array elements
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        // Display the result
        System.out.println("The total sum of the array elements is: " + sum);
    }
}
