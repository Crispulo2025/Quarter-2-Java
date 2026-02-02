public class NumbersWithBreak {
    public static void main(String[] args) {
        // Loop from 1 to 15
        for (int i = 1; i <= 15; i++) {
            // Check if the number is a multiple of both 3 and 4
            if (i % 3 == 0 && i % 4 == 0) {
                System.out.println(i + " is a multiple of both 3 and 4. Exiting loop.");
                break;  // Exit the loop
            }
            // Otherwise, print the number
            System.out.println(i);
        }
    }
}
