import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ScoresAbove50 {
    public static void main(String[] args) {
        String inputFile = "scores.txt"; // File to read

        try (BufferedReader br = new BufferedReader(new FileReader(inputFile))) {
            String line;

            while ((line = br.readLine()) != null) {
                // Split the line into words
                String[] words = line.split("\\s+");

                for (String word : words) {
                    try {
                        int number = Integer.parseInt(word);
                        if (number > 50) {
                            System.out.println(line); // Print the entire line
                            break; // Stop checking the rest of the words in this line
                        }
                    } catch (NumberFormatException e) {
                        // Ignore non-numeric words
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
