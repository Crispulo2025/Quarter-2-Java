import java.util.Scanner;

public class PositiveAndLessThan100 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = input.nextInt();

        // Check if the number is positive AND less than 100
        if (num > 0 && num < 100) {
            System.out.println(num + " is positive and less than 100.");
        } else {
            System.out.println(num + " does NOT meet the criteria.");
        }
    }
}
