import java.util.Scanner;

public class TimeConverter {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner input = new Scanner(System.in);

        // Ask the user for the number of seconds
        System.out.print("Enter the number of seconds: ");
        int totalSeconds = input.nextInt();

        // Calculate hours, minutes, and remaining seconds
        int hours = totalSeconds / 3600; // 1 hour = 3600 seconds
        int remainingSeconds = totalSeconds % 3600;

        int minutes = remainingSeconds / 60; // 1 minute = 60 seconds
        int seconds = remainingSeconds % 60;

        // Display the result
        System.out.println(totalSeconds + " seconds is equal to:");
        System.out.println(hours + " hours, " + minutes + " minutes, and " + seconds + " seconds.");

        // Close the scanner
        input.close();
    }
}
