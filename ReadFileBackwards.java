import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ReadFileBackwards {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Ask the user for the file path
        System.out.print("Enter the file path: ");
        String filePath = input.nextLine();

        File file = new File(filePath);

        if (!file.exists() || !file.isFile()) {
            System.out.println("File not found.");
        } else {
            try {
                Scanner fileReader = new Scanner(file);
                ArrayList<String> lines = new ArrayList<>();

                // Read all lines into the list
                while (fileReader.hasNextLine()) {
                    lines.add(fileReader.nextLine());
                }

                fileReader.close();

                // Print lines in reverse order
                System.out.println("File contents (backwards):");
                for (int i = lines.size() - 1; i >= 0; i--) {
                    System.out.println(lines.get(i));
                }

            } catch (FileNotFoundException e) {
                System.out.println("Error reading the file.");
            }
        }

        input.close();
    }
}
