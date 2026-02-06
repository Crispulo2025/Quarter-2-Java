import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter a single character
        System.out.print("Enter a single character: ");
        char ch = scanner.next().charAt(0);

        // Convert to lowercase to simplify checking
        char lowerCh = Character.toLowerCase(ch);

        // Check if the character is a vowel or consonant
        if (lowerCh == 'a' || lowerCh == 'e' || lowerCh == 'i' || lowerCh == 'o' || lowerCh == 'u') {
            System.out.println(ch + " is a vowel.");
        } else if (Character.isLetter(lowerCh)) {
            System.out.println(ch + " is a consonant.");
        } else {
            System.out.println(ch + " is not an alphabet letter.");
        }

        scanner.close();
    }
}
