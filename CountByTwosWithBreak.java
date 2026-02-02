public class CountByTwosWithBreak {
    public static void main(String[] args) {
        int counter = 0;

        while (counter <= 20) {
            if (counter == 12) {
                break; // Stop the loop when counter reaches 12
            }
            System.out.println(counter); // Print the current counter value
            counter += 2; // Increment by 2
        }
    }
}
