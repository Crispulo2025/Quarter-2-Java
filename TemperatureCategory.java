import java.util.Scanner;

public class TemperatureCategory {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Ask the user for temperature in Celsius
        System.out.print("Enter the temperature in Celsius: ");
        double temp = scanner.nextDouble();

        // Determine temperature category
        if (temp < 15) {
            System.out.println("It is cold.");
        } else if (temp >= 15 && temp <= 25) {
            System.out.println("It is warm.");
        } else {
            System.out.println("It is hot.");
        }

        scanner.close();
    }
}
