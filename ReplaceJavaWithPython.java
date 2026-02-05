import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReplaceJavaWithPython {
    public static void main(String[] args) {
        String inputFile = "input.txt";   // Original file
        String outputFile = "output.txt"; // File to write modified content

        try (
            BufferedReader br = new BufferedReader(new FileReader(inputFile));
            BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile))
        ) {
            String line;
            while ((line = br.readLine()) != null) {
                // Replace all occurrences of "Java" with "Python"
                String modifiedLine = line.replaceAll("\\bJava\\b", "Python");
                bw.write(modifiedLine);
                bw.newLine(); // write each line to the output file
            }
            System.out.println("All occurrences of 'Java' have been replaced with 'Python'.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
