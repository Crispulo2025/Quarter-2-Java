import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class AverageScoreCSV {
    public static void main(String[] args) {
        String filename = "scores.csv"; // Your CSV file name

        try {
            File file = new File(filename);
            Scanner scanner = new Scanner(file);

            double totalScore = 0;
            int count = 0;

            // Read each line of the CSV file
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                // Split the line by comma (assuming CSV format)
                String[] values = line.split(",");

                for (String scoreStr : values) {
                    try {
                        double score = Double.parseDouble(scoreStr.trim());
                        totalScore += score;
                        count++;
                    } catch (NumberFormatException e) {
                        // Skip invalid numbers
                        System.out.println("Invalid score skipped: " + scoreStr);
                    }
                }
            }

            scanner.close();

            if (count > 0) {
                double average = totalScore / count;
                System.out.println("Average score: " + average);
            } else {
                System.out.println("No valid scores found in the file.");
            }

        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }
    }
}
