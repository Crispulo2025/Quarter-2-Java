public class StudentAgesInsertionSort {

    // Method to perform Insertion Sort
    public static void insertionSort(int[] arr) {
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] ages = {19, 22, 18, 21, 20, 17};

        // Sort the ages
        insertionSort(ages);

        // Print sorted ages
        System.out.print("Sorted ages: ");
        for (int age : ages) {
            System.out.print(age + " ");
        }
        System.out.println();

        // Youngest and oldest students
        int youngest = ages[0];
        int oldest = ages[ages.length - 1];

        System.out.println("Youngest student age: " + youngest);
        System.out.println("Oldest student age: " + oldest);
    }
}
