import java.util.Scanner;

public class DisplayScore {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Read a decimal number
        System.out.print("Enter your score: ");
        double score = scanner.nextDouble();

        // Display the score with message
        System.out.println("Your score is: " + score);

        scanner.close();
    }
}
