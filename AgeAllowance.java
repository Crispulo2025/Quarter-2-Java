import java.util.Scanner;

public class AgeAllowance {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Ask for age
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        // Ask for monthly allowance
        System.out.print("Enter your monthly allowance: ");
        double allowance = scanner.nextDouble();

        // Display values with labeled output
        System.out.printf("Age              : %d years%n", age);
        System.out.printf("Monthly Allowance: %.2f%n", allowance);

        scanner.close();
    }
}
