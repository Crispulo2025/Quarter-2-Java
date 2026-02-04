import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReplaceDigitsWithHash {
    public static void main(String[] args) {

        String inputFile = "input.txt";
        String outputFile = "output.txt";

        try (
            BufferedReader br = new BufferedReader(new FileReader(inputFile));
            BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile))
        ) {

            String line;

            // Read file line by line
            while ((line = br.readLine()) != null) {
                // Replace all digits with '#'
                line = line.replaceAll("\\d", "#");

                // Write modified line to new file
                bw.write(line);
                bw.newLine();
            }

            System.out.println("Digits replaced successfully. Output saved to " + outputFile);

        } catch (IOException e) {
            System.out.println("Error processing the file: " + e.getMessage());
        }
    }
}
