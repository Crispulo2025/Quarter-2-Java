import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class AppendStudent {
    public static void main(String[] args) {
        String filename = "students.txt"; // File to append to
        String newStudent = "John Doe";   // Line to append

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename, true))) {
            // true in FileWriter enables append mode
            writer.newLine();          // Move to a new line
            writer.write(newStudent);  // Write the new student
            System.out.println("'" + newStudent + "' has been appended to '" + filename + "'.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }
    }
}
