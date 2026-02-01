public class SwapFirstLast {

    public static void main(String[] args) {
        // Initialize a 1D array
        int[] numbers = {10, 20, 30, 40, 50};

        System.out.println("Original array:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Swap the first and last elements
        int temp = numbers[0];
        numbers[0] = numbers[numbers.length - 1];
        numbers[numbers.length - 1] = temp;

        // Display the updated array
        System.out.println("Array after swapping first and last elements:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}
