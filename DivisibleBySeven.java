import java.util.Scanner;

public class DivisibleBySeven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;

        while (true) {  // Infinite loop until break
            System.out.print("Enter an integer: ");
            number = sc.nextInt();

            if (number % 7 == 0) {
                System.out.println(number + " is divisible by 7. Exiting loop.");
                break;  // Exit the loop immediately
            }

            System.out.println("You entered: " + number);
        }

        sc.close();
    }
}
