import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ConvertToUppercase {
    public static void main(String[] args) {
        String inputFile = "input.txt";      // Input file
        String outputFile = "uppercase.txt"; // Output file

        try (
            // Open input file for reading
            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            // Open output file for writing
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))
        ) {
            String line;
            // Read each line from the input file
            while ((line = reader.readLine()) != null) {
                // Convert the line to uppercase
                String upperLine = line.toUpperCase();
                // Write to the output file
                writer.write(upperLine);
                writer.newLine(); // Move to next line
            }
            System.out.println("All text from '" + inputFile + "' has been converted to uppercase in '" + outputFile + "'.");
        } catch (IOException e) {
            System.out.println("An error occurred while processing the files.");
            e.printStackTrace();
        }
    }
}
