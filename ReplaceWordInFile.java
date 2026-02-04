import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ReplaceWordInFile {
    public static void main(String[] args) {
        // File path (replace with your actual file)
        String filename = "sample.txt";
        // Words to find and replace
        String wordToReplace = "oldWord";
        String replacementWord = "newWord";

        try {
            File file = new File(filename);
            Scanner scanner = new Scanner(file);

            // Read the whole file content
            StringBuilder fileContent = new StringBuilder();
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                // Replace all occurrences of the word in this line
                line = line.replaceAll(wordToReplace, replacementWord);
                fileContent.append(line).append(System.lineSeparator());
            }
            scanner.close();

            // Write the updated content back to the same file
            PrintWriter writer = new PrintWriter(file);
            writer.print(fileContent.toString());
            writer.close();

            System.out.println("All occurrences of \"" + wordToReplace + "\" have been replaced with \"" + replacementWord + "\".");

        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }
    }
}
