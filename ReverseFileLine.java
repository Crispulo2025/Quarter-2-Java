import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReverseFileLines {
    public static void main(String[] args) {
        String inputFile = "text.txt";
        String outputFile = "reversed.txt";

        try (
            // Open the input file for reading
            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            // Open the output file for writing
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))
        ) {
            String line;
            // Read each line from the input file
            while ((line = reader.readLine()) != null) {
                // Reverse the line
                String reversedLine = new StringBuilder(line).reverse().toString();
                // Write the reversed line to the output file
                writer.write(reversedLine);
                writer.newLine(); // Add a new line
            }
            System.out.println("All lines have been reversed and written to '" + outputFile + "'.");
        } catch (IOException e) {
            System.out.println("An error occurred while processing the files.");
            e.printStackTrace();
        }
    }
}
