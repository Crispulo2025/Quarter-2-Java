import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFileOverwrite {
    public static void main(String[] args) {

        String filename = "example.txt";

        // Overwrite mode (default behavior)
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            writer.write("Welcome to Java File Handling.");
            writer.newLine();
            writer.write("This file was created in overwrite mode.");
            writer.newLine();
            writer.write("Any previous content is replaced.");

            System.out.println("File written successfully!");
        } catch (IOException e) {
            System.out.println("An error occurred while writing the file.");
        }
    }
}
