import java.util.Scanner;

public class WeekdayOrWeekend {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Ask the user for a day number
        System.out.print("Enter a day number (1-7): ");
        int day = scanner.nextInt();

        // Check if weekday or weekend
        if (day >= 1 && day <= 5) {
            System.out.println("It is a weekday.");
        } else if (day == 6 || day == 7) {
            System.out.println("It is a weekend.");
        } else {
            System.out.println("Invalid day number. Please enter a number from 1 to 7.");
        }

        scanner.close();
    }
}
