import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Ask for width
        System.out.print("Enter the width of the rectangle: ");
        double width = scanner.nextDouble();

        // Ask for height
        System.out.print("Enter the height of the rectangle: ");
        double height = scanner.nextDouble();

        // Calculate area
        double area = width * height;

        // Print the area formatted to 2 decimal places
        System.out.printf("The area of the rectangle is: %.2f%n", area);

        scanner.close();
    }
}
