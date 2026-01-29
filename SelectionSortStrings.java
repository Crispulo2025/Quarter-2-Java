public class SelectionSortStrings {

    public static void selectionSortStrings(String[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            // Find the index of the lexicographically smallest string
            for (int j = i + 1; j < n; j++) {
                if (arr[j].compareTo(arr[minIndex]) < 0) {
                    minIndex = j;
                }
            }

            // Swap the smallest string with the first unsorted element
            String temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;

            // Print the array after each pass (optional)
            System.out.print("After pass " + (i + 1) + ": ");
            for (String s : arr) {
                System.out.print(s + " ");
            }
            System.out.println();
        }
    }

    // Example usage
    public static void main(String[] args) {
        String[] names = {"Maria", "Juan", "Pedro", "Ana"};
        selectionSortStrings(names);
    }
}
