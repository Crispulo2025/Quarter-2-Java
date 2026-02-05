import java.util.Scanner;

public class SwapCharacters {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Read first character
        System.out.print("Enter first character: ");
        char ch1 = scanner.next().charAt(0);

        // Read second character
        System.out.print("Enter second character: ");
        char ch2 = scanner.next().charAt(0);

        // Display swapped order
        System.out.println("Swapped order: " + ch2 + " " + ch1);

        scanner.close();
    }
}
