import java.util.Scanner;

public class BubbleSortGrades {

    public static void bubbleSort(int[] grades) {
        int n = grades.length;

        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;

            for (int j = 0; j < n - i - 1; j++) {
                if (grades[j] > grades[j + 1]) {
                    // Swap
                    int temp = grades[j];
                    grades[j] = grades[j + 1];
                    grades[j + 1] = temp;
                    swapped = true;
                }
            }

            // Display grades after each pass
            System.out.print("After pass " + (i + 1) + ": ");
            for (int g : grades) {
                System.out.print(g + " ");
            }
            System.out.println();

            // Stop early if no swaps occurred
            if (!swapped) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[] grades = new int[n];

        System.out.println("Enter student grades:");
        for (int i = 0; i < n; i++) {
            grades[i] = sc.nextInt();
        }

        bubbleSort(grades);

        System.out.println("\nSorted grades:");
        for (int g : grades) {
            System.out.print(g + " ");
        }

        sc.close();
    }
}
