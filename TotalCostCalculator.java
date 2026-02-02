import java.util.Scanner;

public class TotalCostCalculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Read number of items
        System.out.print("Enter the number of items: ");
        int numberOfItems = scanner.nextInt();

        // Read price per item
        System.out.print("Enter the price per item: ");
        double price = scanner.nextDouble();

        // Calculate total cost
        double totalCost = numberOfItems * price;

        // Display the result
        System.out.println("The total cost is: $" + totalCost);

        scanner.close();
    }
}
