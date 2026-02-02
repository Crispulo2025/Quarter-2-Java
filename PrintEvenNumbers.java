public class PrintEvenNumbers {
    public static void main(String[] args) {
        int[] numbers = {1, 4, 7, 10, 13, 16, 19, 22};

        for (int num : numbers) {
            // Skip odd numbers
            if (num % 2 != 0) {
                continue;  // Skip this iteration
            }

            // Print even numbers
            System.out.println(num);
        }
    }
}
