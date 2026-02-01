import java.util.Arrays;

public class StudentMarksAverage {
    public static void main(String[] args) {
        // Initialize 3x3 array: rows = students, columns = subjects
        int[][] marks = {
            {85, 90, 78},  // Student 1
            {70, 88, 92},  // Student 2
            {60, 75, 80}   // Student 3
        };

        // Loop through each student (row)
        for (int i = 0; i < marks.length; i++) {
            int sum = 0;

            // Sum the marks for the student
            for (int j = 0; j < marks[i].length; j++) {
                sum += marks[i][j];
            }

            // Calculate average
            double average = (double) sum / marks[i].length;

            System.out.println("Average mark for Student " + (i + 1) + ": " + average);
        }
    }
}
