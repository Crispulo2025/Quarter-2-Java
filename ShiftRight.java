import java.util.Arrays;

public class ShiftRight {

    public static void main(String[] args) {
        // Initialize the array
        int[] numbers = {1, 2, 3, 4, 5};

        // Store the last element temporarily
        int last = numbers[numbers.length - 1];

        // Shift all elements to the right
        for (int i = numbers.length - 1; i > 0; i--) {
            numbers[i] = numbers[i - 1];
        }

        // Put the last element in the first position
        numbers[0] = last;

        // Display the updated array
        System.out.println("Array after shifting right by one position: " + Arrays.toString(numbers));
    }
}
