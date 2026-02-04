import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CheckFileExistence {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Ask the user for the file path
        System.out.print("Enter the file path: ");
        String filePath = input.nextLine();

        File file = new File(filePath);

        // Check if the file exists
        if (file.exists() && file.isFile()) {
            System.out.println("File found! Reading contents...");

            try {
                Scanner fileReader = new Scanner(file);

                // Print the file contents
                while (fileReader.hasNextLine()) {
                    System.out.println(fileReader.nextLine());
                }

                fileReader.close();
            } catch (FileNotFoundException e) {
                System.out.println("Error reading the file.");
            }

        } else {
            System.out.println("File not found.");
        }

        input.close();
    }
}
