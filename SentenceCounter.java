import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class SentenceCounter {
    public static void main(String[] args) {
        String inputFile = "paragraph.txt"; // File to read

        int sentenceCount = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(inputFile))) {
            String line;
            while ((line = br.readLine()) != null) {
                // Count sentences using regex: ., !, ? as sentence delimiters
                String[] sentences = line.split("[.!?]+");
                for (String sentence : sentences) {
                    if (!sentence.trim().isEmpty()) {
                        sentenceCount++;
                    }
                }
            }
            System.out.println("The file contains " + sentenceCount + " sentences.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
