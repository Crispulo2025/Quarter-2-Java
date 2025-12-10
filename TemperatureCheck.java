import java.util.Scanner;

public class TemperatureCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the temperature in Celsius: ");
        double temp = input.nextDouble();

        // Check temperature conditions
        if (temp < 0) {
            System.out.println("The temperature is below freezing.");
        } else if (temp > 100) {
            System.out.println("The temperature is above boiling.");
        } else {
            System.out.println("The temperature is normal.");
        }
    }
}
