import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Ask the user for a character
        System.out.print("Enter a letter: ");
        char ch = scanner.next().charAt(0);

        // Convert to lowercase for easier comparison
        ch = Character.toLowerCase(ch);

        // Check if vowel or consonant
        if (ch == 'a' || ch == 'e' || ch == 'i' || 
            ch == 'o' || ch == 'u') {
            System.out.println("Vowel");
        } else if (ch >= 'a' && ch <= 'z') {
            System.out.println("Consonant");
        } else {
            System.out.println("Invalid input");
        }

        scanner.close();
    }
}
