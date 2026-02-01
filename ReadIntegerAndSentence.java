import java.util.Scanner;

public class ReadIntegerAndSentence {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Read an integer
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        // Consume the leftover newline
        scanner.nextLine();

        // Read a full sentence
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        // Display the results
        System.out.println("You entered integer: " + number);
        System.out.println("You entered sentence: " + sentence);

        scanner.close();
    }
}
