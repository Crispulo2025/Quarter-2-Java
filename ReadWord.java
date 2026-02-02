import java.util.Scanner;

public class ReadWord {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Read a single word
        System.out.print("Enter a word: ");
        String word = scanner.next();  // reads until the first space

        // Display the word
        System.out.println("You typed: " + word);

        scanner.close();
    }
}
