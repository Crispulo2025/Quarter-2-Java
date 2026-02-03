import java.util.Scanner;

public class LetterGrade {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Ask the user for a numeric grade
        System.out.print("Enter your grade (0-100): ");
        int grade = scanner.nextInt();

        // Determine the letter grade using if-else-if ladder
        if (grade >= 90 && grade <= 100) {
            System.out.println("Your letter grade is: A");
        } else if (grade >= 80 && grade < 90) {
            System.out.println("Your letter grade is: B");
        } else if (grade >= 70 && grade < 80) {
            System.out.println("Your letter grade is: C");
        } else if (grade >= 60 && grade < 70) {
            System.out.println("Your letter grade is: D");
        } else if (grade >= 0 && grade < 60) {
            System.out.println("Your letter grade is: F");
        } else {
            System.out.println("Invalid grade entered");
        }

        scanner.close();
    }
}
