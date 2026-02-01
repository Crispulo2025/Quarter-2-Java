public class AverageOfArray {
    public static void main(String[] args) {

        double[] numbers = { 10.5, 20.0, 15.5, 30.0, 25.0, 18.0 };
        double sum = 0;

        // Calculate the sum of array elements
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        // Calculate the average
        double average = sum / numbers.length;

        // Display the result
        System.out.println("Average of the array values: " + average);
    }
}
