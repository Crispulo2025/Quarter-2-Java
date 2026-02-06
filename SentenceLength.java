import java.util.Scanner;

public class SentenceLength {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter a sentence
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        // Get the number of characters
        int length = sentence.length();

        // Display the result
        System.out.println("Number of characters: " + length);

        scanner.close();
    }
}
