import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class VowelCounter {
    public static void main(String[] args) {
        String filename = "data.txt"; // Input file
        int vowelCount = 0;           // Counter for vowels

        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;

            // Read file line by line
            while ((line = reader.readLine()) != null) {
                // Convert line to lowercase for easy comparison
                line = line.toLowerCase();

                // Count vowels in the line
                for (int i = 0; i < line.length(); i++) {
                    char ch = line.charAt(i);
                    if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                        vowelCount++;
                    }
                }
            }

            System.out.println("Total number of vowels in '" + filename + "': " + vowelCount);
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }
    }
}
