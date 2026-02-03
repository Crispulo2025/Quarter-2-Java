import java.util.Scanner;

public class LetterGradeMessage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask user for a letter grade
        System.out.print("Enter your letter grade (A, B, C, D, F): ");
        char grade = scanner.next().toUpperCase().charAt(0); // Convert to uppercase

        // Print custom message using switch
        switch (grade) {
            case 'A':
                System.out.println("Excellent! Keep up the great work.");
                break;
            case 'B':
                System.out.println("Good job! You're doing well.");
                break;
            case 'C':
                System.out.println("Not bad, but there's room for improvement.");
                break;
            case 'D':
                System.out.println("You passed, but try harder next time.");
                break;
            case 'F':
                System.out.println("Unfortunately, you failed. Don't give up!");
                break;
            default:
                System.out.println("Invalid grade entered.");
                break;
        }

        scanner.close();
    }
}
