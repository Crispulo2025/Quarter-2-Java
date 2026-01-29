import java.util.Scanner;

public class StudentScoresSort {

    // Selection Sort method
    public static void selectionSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            // Find the minimum element in the unsorted portion
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap the found minimum element with the first unsorted element
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] scores = new int[10];

        // Input 10 student scores
        System.out.println("Enter 10 student scores:");
        for (int i = 0; i < scores.length; i++) {
            System.out.print("Score " + (i + 1) + ": ");
            scores[i] = scanner.nextInt();
        }

        // Sort the scores
        selectionSort(scores);

        // Display the sorted scores
        System.out.println("\nStudent scores in ascending order:");
        for (int score : scores) {
            System.out.print(score + " ");
        }

        scanner.close();
    }
}
