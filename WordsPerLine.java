import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class WordsPerLine {
    public static void main(String[] args) {
        String inputFile = "info.txt";
        String outputFile = "words.txt";

        try (
            BufferedReader br = new BufferedReader(new FileReader(inputFile));
            BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile))
        ) {
            String line;
            while ((line = br.readLine()) != null) {
                // Split the line into words using whitespace as delimiter
                String[] words = line.split("\\s+");
                for (String word : words) {
                    if (!word.isEmpty()) {
                        bw.write(word);
                        bw.newLine(); // write each word in a new line
                    }
                }
            }
            System.out.println("Words written to " + outputFile + " successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
