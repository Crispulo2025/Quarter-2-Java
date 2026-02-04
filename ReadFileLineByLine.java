import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileLineByLine {
    public static void main(String[] args) {

        String fileName = "input.txt"; // name of the text file

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;

            // Read and print each line until end of file
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }
    }
}
