import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class SaveNumbersToFile {
    public static void main(String[] args) {
        String filename = "numbers.txt";

        try (Scanner scanner = new Scanner(System.in);
             PrintWriter writer = new PrintWriter(new FileWriter(filename))) {

            System.out.println("Enter 10 numbers to save to the file:");

            for (int i = 1; i <= 10; i++) {
                System.out.print("Number " + i + ": ");
                int number = scanner.nextInt();
                writer.println(number); // Save the number to the file
            }

            System.out.println("Numbers have been saved to " + filename);

        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
    }
}
