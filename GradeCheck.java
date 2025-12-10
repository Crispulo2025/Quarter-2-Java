import java.util.Scanner;

public class GradeCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Ask for student's grade
        System.out.print("Enter the student's grade: ");
        int grade = input.nextInt();

        // Determine grade category
        if (grade >= 90) {
            System.out.println("The grade is EXCELLENT.");
        } else if (grade >= 80 && grade <= 89) {
            System.out.println("The grade is VERY GOOD.");
        } else {
            System.out.println("The grade is below VERY GOOD.");
        }

        input.close();
    }
}
