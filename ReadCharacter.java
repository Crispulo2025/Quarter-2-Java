import java.util.Scanner;

public class ReadCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user
        System.out.print("Enter a single character: ");

        // Read input as a String and take the first character
        char ch = scanner.next().charAt(0);

        // Display the character
        System.out.println("You entered: " + ch);

        scanner.close();
    }
}
