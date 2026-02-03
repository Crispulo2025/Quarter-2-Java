public class First20Primes {
    public static void main(String[] args) {

        int count = 0; // Number of primes found
        int number = 2; // Number to check

        System.out.println("The first 20 prime numbers are:");

        while (count < 20) {
            boolean isPrime = true;

            // Check if number is prime
            for (int i = 2; i <= number / 2; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.print(number + " ");
                count++;
            }

            number++;
        }
    }
}
