import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class ReverseFileLines {
    public static void main(String[] args) {

        String inputFile = "input.txt";
        String outputFile = "output.txt";

        ArrayList<String> lines = new ArrayList<>();

        // Read the file line by line
        try (BufferedReader br = new BufferedReader(new FileReader(inputFile))) {
            String line;

            while ((line = br.readLine()) != null) {
                lines.add(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading the file.");
            return;
        }

        // Reverse the order of lines
        Collections.reverse(lines);

        // Write reversed lines to a new file
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile))) {
            for (String l : lines) {
                bw.write(l);
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error writing to the file.");
            return;
        }

        System.out.println("File reversed successfully!");
    }
}
