import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LongestWordFinder {
    public static void main(String[] args) {
        String filename = "input.txt"; // Input file
        String longestWord = "";
        
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            
            // Read each line from the file
            while ((line = reader.readLine()) != null) {
                // Split line into words using spaces and punctuation as delimiters
                String[] words = line.split("[\\s\\p{Punct}]+");
                
                // Check each word
                for (String word : words) {
                    if (word.length() > longestWord.length()) {
                        longestWord = word;
                    }
                }
            }
            
            System.out.println("The longest word in '" + filename + "' is: " + longestWord);
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }
    }
}
