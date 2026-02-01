import java.util.Scanner;

public class UserSummary {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Ask for user input
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.print("Enter your grade: ");
        double grade = scanner.nextDouble();

        // Print the summary
        System.out.println("Name: " + name + ", Age: " + age + ", Grade: " + grade);

        scanner.close();
    }
}
