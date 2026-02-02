import java.util.Scanner;

public class Divisors {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();

        System.out.println("Divisors of " + number + " are:");

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {  // Check if i divides the number
                System.out.println(i);
            }
        }
    }
}
