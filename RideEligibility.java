import java.util.Scanner;

public class RideEligibility {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your height in cm: ");
        int height = input.nextInt();

        // Minimum height requirement
        int minHeight = 120;

        if (height >= minHeight) {
            System.out.println("You are tall enough to go on the ride!");
        } else {
            System.out.println("Sorry, you are not tall enough for the ride.");
        }
    }
}
