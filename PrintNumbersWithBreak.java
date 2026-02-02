public class PrintNumbersWithBreak {
    public static void main(String[] args) {
        // Loop from 1 to 30
        for (int i = 1; i <= 30; i++) {
            if (i > 20) {
                break; // Stop the loop when i exceeds 20
            }
            System.out.println(i); // Print the current number
        }
    }
}
