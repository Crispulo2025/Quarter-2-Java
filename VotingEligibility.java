import java.util.Scanner;

public class VotingEligibility {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Ask for age
        System.out.print("Enter your age: ");
        int age = input.nextInt();

        // Ask for parental consent
        System.out.print("Do you have parental consent? (yes/no): ");
        String consent = input.next().toLowerCase();

        // Check voting eligibility
        if (age >= 18 || consent.equals("yes")) {
            System.out.println("You are eligible to vote.");
        } else {
            System.out.println("You are NOT eligible to vote.");
        }

        input.close();
    }
}
