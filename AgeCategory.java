import java.util.Scanner;

public class AgeCategory {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Ask the user for their age
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        // Determine age category using if-else-if
        if (age >= 0 && age <= 17) {
            System.out.println("You are a minor.");
        } else if (age >= 18 && age <= 59) {
            System.out.println("You are an adult.");
        } else if (age >= 60) {
            System.out.println("You are a senior citizen.");
        } else {
            System.out.println("Invalid age entered.");
        }

        scanner.close();
    }
}
