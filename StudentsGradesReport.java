import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class StudentsGradesReport {
    public static void main(String[] args) {
        String filename = "grades_report.txt";

        // Sample data (names and grades)
        String[] students = {"Alice", "Bob", "Charlie", "Diana"};
        double[] grades = {85.5, 92.0, 78.5, 88.0};

        try (PrintWriter writer = new PrintWriter(new FileWriter(filename))) {
            // Write header
            writer.printf("%-10s | %-5s%n", "Student", "Grade");
            writer.println("---------------------");

            // Write student data
            for (int i = 0; i < students.length; i++) {
                writer.printf("%-10s | %-5.2f%n", students[i], grades[i]);
            }

            System.out.println("Grades report has been written to " + filename);

        } catch (IOException e) {
            System.out.println("An error occurred while writing the file: " + e.getMessage());
        }
    }
}
