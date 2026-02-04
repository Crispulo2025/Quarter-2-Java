import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class AppendToFile {
    public static void main(String[] args) {
        String filename = "data.txt"; // File to append to

        try (Scanner scanner = new Scanner(System.in);
             PrintWriter writer = new PrintWriter(new FileWriter(filename, true))) { // 'true' enables append mode

            System.out.println("Enter data to append to the file (type 'done' to finish):");

            while (true) {
                System.out.print("Input: ");
                String input = scanner.nextLine();

                if (input.equalsIgnoreCase("done")) {
                    break; // Stop appending
                }

                writer.println(input); // Append to file
            }

            System.out.println("Data has been appended to " + filename);

        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
    }
}
