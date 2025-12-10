import java.util.Scanner;

public class TotalPriceWithTax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask for the number of items
        System.out.print("Enter the number of items purchased: ");
        int itemCount = scanner.nextInt();

        double totalPrice = 0.0;

        // Input price for each item
        for (int i = 1; i <= itemCount; i++) {
            System.out.print("Enter price of item " + i + ": ");
            double price = scanner.nextDouble();
            totalPrice += price;
        }

        // Calculate tax (12%)
        double tax = totalPrice * 0.12;

        // Calculate total price including tax
        double totalPriceWithTax = totalPrice + tax;

        // Display results
        System.out.println("Subtotal: $" + String.format("%.2f", totalPrice));
        System.out.println("Tax (12%): $" + String.format("%.2f", tax));
        System.out.println("Total Price (including tax): $" + String.format("%.2f", totalPriceWithTax));
        
        scanner.close();
    }
}
