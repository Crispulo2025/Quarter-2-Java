import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadStudentsFile {
    public static void main(String[] args) {
        String filename = "students.txt"; // File to read

        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            System.out.println("Contents of '" + filename + "':");

            // Read and print each line
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }
    }
}
