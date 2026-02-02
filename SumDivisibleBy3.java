public class SumDivisibleBy3 {
    public static void main(String[] args) {

        int sum = 0;

        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {   // Check if divisible by 3
                sum += i;       // Add to sum
            }
        }

        System.out.println("The sum of all numbers divisible by 3 between 1 and 100 is: " + sum);
    }
}
