import java.util.Scanner;

public class DisplayTestScores {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] scores = new int[5];  // Array to store 5 test scores

        // Get user input
        System.out.println("Enter 5 test scores:");
        for (int i = 0; i < scores.length; i++) {
            System.out.print("Score " + (i + 1) + ": ");
            scores[i] = scanner.nextInt();
        }

        // Display all scores
        System.out.println("\nThe test scores you entered are:");
        for (int i = 0; i < scores.length; i++) {
            System.out.println("Score " + (i + 1) + ": " + scores[i]);
        }

        scanner.close();
    }
}
