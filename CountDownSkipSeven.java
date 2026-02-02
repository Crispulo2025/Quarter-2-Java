public class CountDownSkipSeven {
    public static void main(String[] args) {
        int num = 10;

        while (num >= 1) {
            if (num == 7) {
                num--; // Decrement before continue to avoid infinite loop
                continue; // Skip printing 7
            }
            System.out.println(num);
            num--; // Decrement the counter
        }
    }
}
