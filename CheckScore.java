import java.util.Scanner;

public class CheckScore {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Ask the user for a score
        System.out.print("Enter your score: ");
        int score = scanner.nextInt();

        // Check if passed or failed
        if (score >= 75) {
            System.out.println("Passed");
        } else {
            System.out.println("Failed");
        }

        scanner.close();
    }
}
