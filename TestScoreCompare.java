import java.util.Scanner;

public class TestScoreCompare {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first test score: ");
        int score1 = input.nextInt();

        System.out.print("Enter the second test score: ");
        int score2 = input.nextInt();

        // Compare the two scores
        if (score1 > score2) {
            System.out.println("The first score is higher than the second score.");
        } else if (score1 < score2) {
            System.out.println("The first score is lower than the second score.");
        } else {
            System.out.println("Both scores are equal.");
        }
    }
}
