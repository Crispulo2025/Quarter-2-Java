public class MultiplyByTwo {

    public static void main(String[] args) {
        // Initialize an integer array
        int[] numbers = {1, 3, 5, 7, 9, 2, 4, 6, 8, 10};

        // Multiply each element by 2
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = numbers[i] * 2;
        }

        // Display the updated array
        System.out.println("Array after multiplying each element by 2:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}
