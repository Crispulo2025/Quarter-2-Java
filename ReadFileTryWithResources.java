import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFileTryWithResources {
    public static void main(String[] args) {
        String filename = "example.txt"; // Replace with your file name

        // Try-with-resources ensures the Scanner is closed automatically
        try (Scanner scanner = new Scanner(new File(filename))) {
            System.out.println("Contents of the file:");

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }

        } catch (FileNotFoundException e) {
            // Handle exception if file does not exist
            System.out.println("File not found: " + e.getMessage());
        }
    }
}
