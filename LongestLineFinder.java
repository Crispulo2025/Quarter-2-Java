import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LongestLineFinder {
    public static void main(String[] args) {

        // Change this to the path of your file
        File file = new File("input.txt");

        String longestLine = "";

        try (Scanner scanner = new Scanner(file)) {

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();

                if (line.length() > longestLine.length()) {
                    longestLine = line;
                }
            }

            if (!longestLine.isEmpty()) {
                System.out.println("Longest line:");
                System.out.println(longestLine);
                System.out.println("Length: " + longestLine.length());
            } else {
                System.out.println("The file is empty.");
            }

        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }
    }
}
