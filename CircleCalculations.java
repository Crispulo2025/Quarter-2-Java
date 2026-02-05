import java.util.Scanner;

public class CircleCalculations {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Read the radius
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();

        // Compute circumference and area
        double circumference = 2 * Math.PI * radius;
        double area = Math.PI * radius * radius;

        // Print the results with clear labels
        System.out.println("Circumference of the circle: " + circumference);
        System.out.println("Area of the circle: " + area);
    }
}
