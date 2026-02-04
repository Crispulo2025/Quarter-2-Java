import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WordCount {
    public static void main(String[] args) {
        String filename = "sample.txt"; // Replace with your file name
        int wordCount = 0;

        try (Scanner scanner = new Scanner(new File(filename))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                // Split the line into words using spaces as delimiter
                String[] words = line.trim().split("\\s+");
                // Increment count if line is not empty
                if (!line.trim().isEmpty()) {
                    wordCount += words.length;
                }
            }

            System.out.println("Total number of words in the file: " + wordCount);

        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }
    }
}
