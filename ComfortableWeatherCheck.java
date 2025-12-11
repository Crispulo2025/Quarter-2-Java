import java.util.Scanner;

public class ComfortableWeatherCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Ask for temperature
        System.out.print("Enter the temperature in °C: ");
        double temperature = input.nextDouble();

        // Ask for humidity
        System.out.print("Enter the humidity percentage: ");
        double humidity = input.nextDouble();

        // Check comfortable range
        if ((temperature >= 20 && temperature <= 25) && humidity < 70) {
            System.out.println("The weather is comfortable.");
        } else {
            System.out.println("The weather is NOT comfortable.");
        }

        input.close();
    }
}
