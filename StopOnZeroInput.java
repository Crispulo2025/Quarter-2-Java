import java.util.Scanner;

public class StopOnZeroInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= 5; i++) {
            System.out.print("Enter integer #" + i + ": ");
            int input = scanner.nextInt();

            if (input == 0) {
                System.out.println("Zero entered! Stopping the program.");
                break; // Stop immediately if input is 0
            }

            System.out.println("You entered: " + input);
        }

        scanner.close();
    }
}
