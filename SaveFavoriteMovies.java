import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class SaveFavoriteMovies {
    public static void main(String[] args) {
        String filename = "movies.txt";

        try (Scanner scanner = new Scanner(System.in);
             PrintWriter writer = new PrintWriter(new FileWriter(filename, true))) { // true for append mode

            System.out.println("Enter your favorite movies (type 'done' to finish):");

            while (true) {
                System.out.print("Movie: ");
                String movie = scanner.nextLine();

                if (movie.equalsIgnoreCase("done")) {
                    break; // Exit loop when user types 'done'
                }

                writer.println(movie); // Write the movie to the file
            }

            System.out.println("Your favorite movies have been saved to " + filename + ".");

        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
    }
}
