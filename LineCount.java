import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LineCount {
    public static void main(String[] args) {
        String filename = "sample.txt"; // Replace with your file name
        int lineCount = 0;

        // Try-with-resources automatically closes the Scanner
        try (Scanner scanner = new Scanner(new File(filename))) {
            while (scanner.hasNextLine()) {
                scanner.nextLine(); // Read a line
                lineCount++;        // Increment line counter
            }

            System.out.println("Total number of lines in the file: " + lineCount);

        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }
    }
}
