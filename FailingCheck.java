import java.util.Scanner;

public class FailingCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Ask for the student's score
        System.out.print("Enter the student's score: ");
        double score = input.nextDouble();

        // Ask for the number of missed classes
        System.out.print("Enter the number of missed classes: ");
        int missedClasses = input.nextInt();

        // Check if the student is failing
        if (score < 75 || missedClasses > 3) {
            System.out.println("The student is FAILING.");
        } else {
            System.out.println("The student is NOT failing.");
        }

        input.close();
    }
}
