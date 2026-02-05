import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class EvenLinesPrinter {
    public static void main(String[] args) {
        String inputFile = "input.txt"; // Change this to your file name

        try (BufferedReader br = new BufferedReader(new FileReader(inputFile))) {
            String line;
            int lineNumber = 1; // Track the line number

            while ((line = br.readLine()) != null) {
                if (lineNumber % 2 == 0) { // Check if the line number is even
                    System.out.println(line);
                }
                lineNumber++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
