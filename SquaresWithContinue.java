public class SquaresWithContinue {
    public static void main(String[] args) {
        // Loop from 1 to 10
        for (int i = 1; i <= 10; i++) {
            int square = i * i;

            // Skip if the square is greater than 50
            if (square > 50) {
                continue;  // Skip the current iteration
            }

            // Print the square
            System.out.println("Square of " + i + " is " + square);
        }
    }
}
