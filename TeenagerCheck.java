import java.util.Scanner;

public class TeenagerCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Ask for age
        System.out.print("Enter your age: ");
        int age = input.nextInt();

        // Check if age is between 13 and 19 inclusive
        if (age >= 13 && age <= 19) {
            System.out.println("You are a TEENAGER.");
        } else {
            System.out.println("You are NOT a teenager.");
        }

        input.close();
    }
}
