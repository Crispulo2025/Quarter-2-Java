import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner input = new Scanner(System.in);

        // Ask the user for the base and height of the triangle
        System.out.print("Enter the base of the triangle: ");
        double base = input.nextDouble();

        System.out.print("Enter the height of the triangle: ");
        double height = input.nextDouble();

        // Calculate the area
        double area = (base * height) / 2;

        // Display the result
        System.out.println("The area of the triangle is: " + area);

        // Close the scanner
        input.close();
    }
}
