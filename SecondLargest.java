public class SecondLargest {

    public static void main(String[] args) {
        // Initialize an array of 10 integers
        int[] numbers = {12, 45, 7, 34, 89, 23, 56, 90, 11, 67};

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        // Find the largest and second largest values
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                secondLargest = largest;
                largest = numbers[i];
            } else if (numbers[i] > secondLargest && numbers[i] != largest) {
                secondLargest = numbers[i];
            }
        }

        // Display the second largest value
        System.out.println("The second largest value in the array is: " + secondLargest);
    }
}
