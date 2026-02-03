import java.util.Scanner;

public class RightAngledTriangle {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Ask user for the height
        System.out.print("Enter the height of the triangle: ");
        int height = scanner.nextInt();

        // Nested for loop to print the triangle
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println(); // Move to next line
        }

        scanner.close();
    }
}
