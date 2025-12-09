import java.io.*;

public class FileExample {
    public static void main(String[] args) {
        try {
            // Writing to a file
            BufferedWriter writer = new BufferedWriter(new FileWriter("info.txt"));
            writer.write("Hello, SHS learners!");
            writer.newLine();
            writer.write("Java File I/O is fun.");
            writer.close();

            // Reading from a file
            BufferedReader reader = new BufferedReader(new FileReader("info.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
