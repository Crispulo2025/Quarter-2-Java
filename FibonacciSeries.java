import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Ask user for the number of terms
        System.out.print("Enter the number of terms: ");
        int n = scanner.nextInt();

        int first = 0, second = 1;
        int count = 1;

        System.out.println("Fibonacci series up to " + n + " terms:");

        // While loop to print Fibonacci series
        while (count <= n) {
            System.out.print(first + " ");

            int next = first + second; // calculate next term
            first = second;
            second = next;

            count++;
        }
    }
}
