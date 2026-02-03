import java.util.Scanner;

public class NumberPatternIncremental {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer n: ");
        int n = scanner.nextInt();

        // Outer loop: controls the number of rows
        for (int i = 1; i <= n; i++) {
            // Inner loop: prints numbers from 1 to i
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}
