import java.util.Scanner;

public class SeasonFinder {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Ask user for month and day
        System.out.print("Enter the month (1-12): ");
        int month = scanner.nextInt();

        System.out.print("Enter the day (1-31): ");
        int day = scanner.nextInt();

        String season = "";

        // Determine the season
        if ((month == 12 && day >= 21) || (month == 1) || (month == 2) || (month == 3 && day < 20)) {
            season = "Winter";
        } else if ((month == 3 && day >= 20) || (month >= 4 && month <= 5) || (month == 6 && day < 21)) {
            season = "Spring";
        } else if ((month == 6 && day >= 21) || (month >= 7 && month <= 8) || (month == 9 && day < 22)) {
            season = "Summer";
        } else if ((month == 9 && day >= 22) || (month >= 10 && month <= 11) || (month == 12 && day < 21)) {
            season = "Fall";
        } else {
            season = "Invalid date";
        }

        // Display the result
        System.out.println("The season is: " + season);
    }
}
