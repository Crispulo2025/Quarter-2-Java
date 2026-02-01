import java.util.Scanner;

public class CopyArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask for array size
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        int[] source = new int[n];
        int[] destination = new int[n];

        // Input elements for source array
        System.out.println("Enter the elements:");
        for (int i = 0; i < source.length; i++) {
            source[i] = scanner.nextInt();
        }

        // Copy elements
        for (int i = 0; i < source.length; i++) {
            destination[i] = source[i];
        }

        // Display both arrays
        System.out.println("Source array:");
        for (int num : source) {
            System.out.print(num + " ");
        }

        System.out.println("\nCopied array:");
        for (int num : destination) {
            System.out.print(num + " ");
        }

        scanner.close();
    }
}
