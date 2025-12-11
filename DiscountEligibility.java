import java.util.Scanner;

public class DiscountEligibility {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Ask for age
        System.out.print("Enter your age: ");
        int age = input.nextInt();

        // Check discount eligibility
        if (age <= 12 || age >= 60) {
            System.out.println("You are eligible for a discount.");
        } else {
            System.out.println("You are NOT eligible for a discount.");
        }

        input.close();
    }
}
