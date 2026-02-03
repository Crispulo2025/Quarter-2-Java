import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Ask user for a number
        System.out.print("Enter a number to display its multiplication table: ");
        int number = scanner.nextInt();

        System.out.println("Multiplication table of " + number + ":");

        // For loop to display multiplication table
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
    }
}
