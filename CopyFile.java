import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyFile {
    public static void main(String[] args) {
        String inputFile = "input.txt";   // Source file
        String outputFile = "output.txt"; // Destination file

        try (
            // Open input file for reading
            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            // Open output file for writing
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))
        ) {
            String line;
            // Read each line from input file and write it to output file
            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.newLine(); // Preserve line breaks
            }

            System.out.println("All text from '" + inputFile + "' has been copied to '" + outputFile + "'.");
        } catch (IOException e) {
            System.out.println("An error occurred while processing the files.");
            e.printStackTrace();
        }
    }
}
