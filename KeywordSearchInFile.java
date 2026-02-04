import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class KeywordSearchInFile {
    public static void main(String[] args) {
        String filename = "sample.txt"; // Replace with your file name
        String keyword = "Java";        // Replace with your keyword

        try (Scanner scanner = new Scanner(new File(filename))) {
            System.out.println("Lines containing the keyword \"" + keyword + "\":");

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line.contains(keyword)) {
                    System.out.println(line);
                }
            }

        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }
    }
}
