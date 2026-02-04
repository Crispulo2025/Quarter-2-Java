import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteStudentsToFile {
    public static void main(String[] args) {
        String filename = "students.txt";

        // List of student names
        String[] students = {
            "Alice Johnson",
            "Brian Santos",
            "Carla Reyes",
            "Daniel Cruz",
            "Ella Mendoza"
        };

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            for (String student : students) {
                writer.write(student);
                writer.newLine(); // Move to next line
            }

            System.out.println("Student names have been written to " + filename);

        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
    }
}
