import java.util.Scanner;

public class QuizAverage {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Read student's name
        System.out.print("Enter student's name: ");
        String name = scanner.nextLine();

        // Read three quiz scores
        System.out.print("Enter quiz score 1: ");
        double q1 = scanner.nextDouble();

        System.out.print("Enter quiz score 2: ");
        double q2 = scanner.nextDouble();

        System.out.print("Enter quiz score 3: ");
        double q3 = scanner.nextDouble();

        // Compute average
        double average = (q1 + q2 + q3) / 3;

        // Print formatted output
        System.out.printf(
            "Student: %s | Average Quiz Score: %.2f%n",
            name, average
        );

        scanner.close();
    }
}
