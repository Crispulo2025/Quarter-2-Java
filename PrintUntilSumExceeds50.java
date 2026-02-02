public class PrintUntilSumExceeds50 {
    public static void main(String[] args) {
        int sum = 0;

        for (int i = 1; i <= 15; i++) {
            sum += i; // Add current number to sum
            if (sum > 50) {
                break; // Exit loop if sum exceeds 50
            }
            System.out.println(i); // Print the number
        }
    }
}
