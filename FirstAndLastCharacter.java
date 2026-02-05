import java.util.Scanner;

public class FirstAndLastCharacter {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter a word
        System.out.print("Enter a word: ");
        String word = scanner.next();

        // Get first and last characters
        char firstChar = word.charAt(0);
        char lastChar = word.charAt(word.length() - 1);

        // Display results
        System.out.println("First character: " + firstChar);
        System.out.println("Last character: " + lastChar);

        scanner.close();
    }
}
