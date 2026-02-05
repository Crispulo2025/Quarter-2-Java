import java.util.Scanner;

public class FormattedOutput {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Read inputs
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        System.out.print("Enter a decimal number: ");
        double decimal = scanner.nextDouble();

        scanner.nextLine(); // consume leftover newline

        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        // Print formatted output
        System.out.printf(
            "Integer: %d | Double: %.2f | Sentence: \"%s\"%n",
            number, decimal, sentence
        );

        scanner.close();
    }
}
