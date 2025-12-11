import java.util.Scanner;

public class RollerCoasterCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Ask for height
        System.out.print("Enter your height in cm: ");
        int height = input.nextInt();

        // Ask for age
        System.out.print("Enter your age in years: ");
        int age = input.nextInt();

        // Check eligibility
        if (height >= 120 && age >= 8) {
            System.out.println("You CAN ride the roller coaster!");
        } else {
            System.out.println("You CANNOT ride the roller coaster.");
        }

        input.close();
    }
}
