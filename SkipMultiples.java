public class SkipMultiples {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            // Skip multiples of 2 or 5
            if (i % 2 == 0 || i % 5 == 0) {
                continue;
            }
            System.out.println(i);
        }
    }
}
