import java.util.Scanner;

public class StudentMarks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Declare an array to store marks of 5 subjects
        int[] marks = new int[5];
        int totalMarks = 0;
        int maxMarksPerSubject = 100; // assuming each subject is out of 100
        int numberOfSubjects = 5;

        // Read marks for each subject
        for (int i = 0; i < numberOfSubjects; i++) {
            System.out.print("Enter marks for subject " + (i + 1) + ": ");
            marks[i] = input.nextInt();

            // Add to total
            totalMarks += marks[i];
        }

        // Calculate percentage
        double percentage = (totalMarks / (double)(numberOfSubjects * maxMarksPerSubject)) * 100;

        // Display results
        System.out.println("\nTotal Marks: " + totalMarks);
        System.out.println("Percentage: " + percentage + "%");

        input.close();
    }
}
