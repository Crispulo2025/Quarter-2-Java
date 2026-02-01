import java.util.Scanner;
import java.util.Arrays;

public class SortNames {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create a string array to store 8 names
        String[] names = new String[8];

        // Ask the user to input 8 names
        System.out.println("Enter 8 names:");
        for (int i = 0; i < names.length; i++) {
            System.out.print("Name " + (i + 1) + ": ");
            names[i] = sc.nextLine();
        }

        // Sort the names alphabetically
        Arrays.sort(names);

        // Display the sorted names
        System.out.println("\nNames in alphabetical order:");
        for (String name : names) {
            System.out.println(name);
        }

        sc.close();
    }
}
