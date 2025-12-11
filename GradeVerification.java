import java.util.Scanner;

public class GradeVerification {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Ask for the student's grade
        System.out.print("Enter the student's grade: ");
        double grade = input.nextDouble();

        // Check if the grade is NOT less than 75
        if (!(grade < 75)) {
            System.out.println("The student passed.");
        } else {
            System.out.println("The student is failing.");
        }

        input.close();
    }
}
