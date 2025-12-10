import java.util.Scanner;

public class LeapYearCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = input.nextInt();

        // Check if the year is divisible by 4
        if (year % 4 == 0) {
            System.out.println(year + " is a leap year candidate.");
        } else {
            System.out.println(year + " is NOT a leap year candidate.");
        }
    }
}
