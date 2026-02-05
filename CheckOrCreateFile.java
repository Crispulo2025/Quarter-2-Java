import java.io.File;
import java.io.IOException;

public class CheckOrCreateFile {
    public static void main(String[] args) {
        // Define the file
        File file = new File("log.txt");

        // Check if the file exists
        if (file.exists()) {
            System.out.println("The file 'log.txt' already exists.");
        } else {
            try {
                // Try to create the file
                if (file.createNewFile()) {
                    System.out.println("The file 'log.txt' was created successfully.");
                } else {
                    System.out.println("Failed to create 'log.txt'.");
                }
            } catch (IOException e) {
                System.out.println("An error occurred while creating the file.");
                e.printStackTrace();
            }
        }
    }
}
