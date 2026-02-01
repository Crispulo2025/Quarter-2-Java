import java.util.Scanner;

public class CountValue {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Initialize an integer array
        int[] numbers = {5, 3, 7, 3, 2, 3, 8, 3, 1, 9};

        // Ask the user for the value to count
        System.out.print("Enter the value to count: ");
        int value = sc.nextInt();

        int count = 0;

        // Loop through the array and count occurrences
        for (int num : numbers) {
            if (num == value) {
                count++;
            }
        }

        // Display the result
        System.out.println("The value " + value + " appears " + count + " times in the array.");

        sc.close();
    }
}
