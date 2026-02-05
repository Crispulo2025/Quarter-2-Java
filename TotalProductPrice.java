import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TotalProductPrice {
    public static void main(String[] args) {
        String inputFile = "products.txt"; // File to read
        double total = 0.0;

        try (BufferedReader br = new BufferedReader(new FileReader(inputFile))) {
            String line;
            while ((line = br.readLine()) != null) {
                // Each line is expected to be "productName,price"
                String[] parts = line.split(",");
                if (parts.length == 2) {
                    try {
                        double price = Double.parseDouble(parts[1].trim());
                        total += price;
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid price format in line: " + line);
                    }
                }
            }
            System.out.println("Total sum of product prices: " + total);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
