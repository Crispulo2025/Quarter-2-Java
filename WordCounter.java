import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class WordCounter {
    public static void main(String[] args) {
        String inputFile = "story.txt"; // File to read
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the word to count: ");
        String wordToCount = scanner.nextLine().toLowerCase(); // Convert to lowercase for case-insensitive search

        int count = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(inputFile))) {
            String line;
            while ((line = br.readLine()) != null) {
                // Split the line into words
                String[] words = line.split("\\W+"); // Non-word characters as delimiters
                for (String word : words) {
                    if (word.toLowerCase().equals(wordToCount)) {
                        count++;
                    }
                }
            }
            System.out.println("The word \"" + wordToCount + "\" appears " + count + " times in the file.");
        } catch (IOException e) {
            e.printStackTrace();
        }
        scanner.close();
    }
}
