import java.util.Scanner;

public class TriangleValidity {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Ask for the sides of the triangle
        System.out.print("Enter side A: ");
        double a = input.nextDouble();

        System.out.print("Enter side B: ");
        double b = input.nextDouble();

        System.out.print("Enter side C: ");
        double c = input.nextDouble();

        // Check triangle validity
        if ((a + b > c) && (a + c > b) && (b + c > a)) {
            System.out.println("The triangle is VALID.");
        } else {
            System.out.println("The triangle is NOT valid.");
        }

        input.close();
    }
}
