import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SumIntegersFromFile {
    public static void main(String[] args) {
        String filename = "numbers.txt"; // Replace with your file name
        int sum = 0;

        try (Scanner scanner = new Scanner(new File(filename))) {
            // Read integers from the file
            while (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                sum += number; // Add number to sum
            }

            System.out.println("The sum of integers in the file is: " + sum);

        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }
    }
}
