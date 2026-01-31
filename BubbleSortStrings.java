public class BubbleSortStrings {
    public static void main(String[] args) {
        // String array to sort
        String[] fruits = {"Banana", "Apple", "Mango", "Cherry", "Date"};

        int n = fruits.length;

        // Bubble Sort algorithm
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                // Compare two strings lexicographically
                if (fruits[j].compareTo(fruits[j + 1]) > 0) {
                    // Swap fruits[j] and fruits[j + 1]
                    String temp = fruits[j];
                    fruits[j] = fruits[j + 1];
                    fruits[j + 1] = temp;
                }
            }
            // Print array after each pass
            System.out.print("After pass " + (i + 1) + ": ");
            for (String f : fruits) {
                System.out.print(f + " ");
            }
            System.out.println();
        }

        // Final sorted array
        System.out.println("\nSorted array alphabetically:");
        for (String f : fruits) {
            System.out.println(f);
        }
    }
}
