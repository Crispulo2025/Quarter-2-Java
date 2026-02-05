import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateLines {
    public static void main(String[] args) {
        String inputFile = "names.txt";       // File to read
        String outputFile = "unique_names.txt"; // File to write unique lines

        Set<String> uniqueLines = new HashSet<>();

        try (BufferedReader br = new BufferedReader(new FileReader(inputFile));
             BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile))) {

            String line;
            while ((line = br.readLine()) != null) {
                if (uniqueLines.add(line)) {  // Adds only if line is not already in the set
                    bw.write(line);
                    bw.newLine();
                }
            }

            System.out.println("Unique lines written to " + outputFile + " successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
