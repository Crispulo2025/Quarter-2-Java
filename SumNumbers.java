import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class SumNumbers {
    public static void main(String[] args) {
        String filename = "numbers.txt"; // Input file
        int sum = 0;                     // To store the sum

        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                // Parse the line as integer and add to sum
                try {
                    int number = Integer.parseInt(line.trim());
                    sum += number;
                } catch (NumberFormatException e) {
                    System.out.println("Skipping invalid number: " + line);
                }
            }
            System.out.println("The sum of numbers in '" + filename + "' is: " + sum);
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }
    }
}
