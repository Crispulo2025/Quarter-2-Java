public class SkipMultiplesOfThree {
    public static void main(String[] args) {

        for (int i = 1; i <= 20; i++) {
            if (i % 3 == 0) {
                continue;  // Skip multiples of 3
            }
            System.out.println(i);
        }
    }
}
