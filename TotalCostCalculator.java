import java.util.Scanner;

public class TotalCostCalculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Ask for price of the product
        System.out.print("Enter the price of the product: ");
        double price = scanner.nextDouble();

        // Ask for quantity
        System.out.print("Enter the quantity: ");
        int quantity = scanner.nextInt();

        // Compute total cost
        double total = price * quantity;

        // Print total cost formatted to 2 decimal places
        System.out.printf("Total cost: %.2f%n", total);

        scanner.close();
    }
}
