import java.io.FileWriter;
import java.io.IOException;

public class SimpleFileWriter {
    public static void main(String[] args) {

        try {
            FileWriter writer = new FileWriter("message.txt");
            writer.write("Hello! This message was written using FileWriter.");
            writer.close();

            System.out.println("File created and message written successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing the file.");
        }
    }
}
