public class SumOfTenNumbers {
    public static void main(String[] args) {
        // Initialize sum
        int sum = 0;

        // Loop through the first 10 positive integers
        for (int i = 1; i <= 10; i++) {
            sum += i; // Add each number to sum using the += operator
        }

        // Display the result
        System.out.println("The sum of the first 10 positive integers is " + sum);
    }
}
