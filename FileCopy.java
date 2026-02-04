import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileCopy {
    public static void main(String[] args) {
        // Input and output file names
        String inputFile = "input.txt";
        String outputFile = "output.txt";

        try {
            // Open the input file
            File file = new File(inputFile);
            Scanner scanner = new Scanner(file);

            // Open the output file for writing
            PrintWriter writer = new PrintWriter(outputFile);

            // Read each line from the input file and write to the output file
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                writer.println(line);
            }

            // Close both files
            scanner.close();
            writer.close();

            System.out.println("File copied successfully from " + inputFile + " to " + outputFile + ".");

        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }
    }
}
