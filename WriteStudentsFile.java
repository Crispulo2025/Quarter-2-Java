import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class WriteStudentsFile {
    public static void main(String[] args) {
        // Names of 5 students
        String[] students = {"Alice", "Bob", "Charlie", "Diana", "Ethan"};

        try {
            // Create FileWriter and PrintWriter to write to students.txt
            FileWriter fw = new FileWriter("students.txt");
            PrintWriter writer = new PrintWriter(fw);

            // Write each student name to the file
            for (String student : students) {
                writer.println(student);
            }

            writer.close();  // Close the file
            System.out.println("students.txt has been created and written successfully.");

        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
