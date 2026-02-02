import java.util.Scanner;

public class FavoriteColor {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Ask for favorite color
        System.out.print("Enter your favorite color: ");
        String color = scanner.nextLine();

        // Display message
        System.out.println("Your favorite color is " + color + ".");

        scanner.close();
    }
}
