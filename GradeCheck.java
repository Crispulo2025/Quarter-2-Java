import java.util.Scanner;

public class GradeCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Ask the user for the student's grade
        System.out.print("Enter the student's grade: ");
        int grade = input.nextInt();

        // Check if the grade is passing or failing
        if (grade >= 75) {
            System.out.println("The student passed.");
        } else {
            System.out.println("The student failed.");
        }

        input.close();
    }
}
