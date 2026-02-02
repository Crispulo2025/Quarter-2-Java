import java.util.Scanner;

public class AverageOfThreeScores {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Read three test scores
        System.out.print("Enter the first score: ");
        double score1 = scanner.nextDouble();

        System.out.print("Enter the second score: ");
        double score2 = scanner.nextDouble();

        System.out.print("Enter the third score: ");
        double score3 = scanner.nextDouble();

        // Calculate the average
        double average = (score1 + score2 + score3) / 3;

        // Display the result
        System.out.println("The average score is: " + average);

        scanner.close();
    }
}
