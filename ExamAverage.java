import java.util.Scanner;

public class ExamAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask user for three exam scores
        System.out.print("Enter score for Exam 1: ");
        double score1 = scanner.nextDouble();

        System.out.print("Enter score for Exam 2: ");
        double score2 = scanner.nextDouble();

        System.out.print("Enter score for Exam 3: ");
        double score3 = scanner.nextDouble();

        // Calculate the average
        double average = (score1 + score2 + score3) / 3;

        // Print the average
        System.out.println("Average score: " + average);

        // Determine pass/fail
        if (average >= 75) {
            System.out.println("Result: Passed");
        } else {
            System.out.println("Result: Failed");
        }

        scanner.close();
    }
}
