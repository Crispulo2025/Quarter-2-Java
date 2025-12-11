import java.util.Scanner;

public class EvenOrGreaterThan50 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Ask for a number
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Check if the number is even or greater than 50
        if (number % 2 == 0 || number > 50) {
            System.out.println(number + " is either EVEN or greater than 50.");
        } else {
            System.out.println(number + " is neither EVEN nor greater than 50.");
        }

        input.close();
    }
}
