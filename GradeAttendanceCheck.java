import java.util.Scanner;

public class GradeAttendanceCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Ask for grade
        System.out.print("Enter student's grade: ");
        double grade = input.nextDouble();

        // Ask for attendance percentage
        System.out.print("Enter attendance percentage: ");
        double attendance = input.nextDouble();

        // Check conditions
        if (grade >= 75 && attendance >= 75) {
            System.out.println("The student PASSED.");
        } else {
            System.out.println("The student FAILED.");
        }

        input.close();
    }
}
