import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PrintEvenNumbersFromFile {
    public static void main(String[] args) {
        try {
            // Specify the file path (replace "numbers.txt" with your file name)
            File file = new File("numbers.txt");
            Scanner scanner = new Scanner(file);

            System.out.println("Even numbers in the file:");

            // Read integers from the file
            while (scanner.hasNextInt()) {
                int number = scanner.nextInt();

                // Check if the number is even
                if (number % 2 == 0) {
                    System.out.println(number);
                }
            }

            scanner.close(); // Close the scanner
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }
    }
}
