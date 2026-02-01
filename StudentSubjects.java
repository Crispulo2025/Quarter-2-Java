public class StudentSubjects {

    public static void main(String[] args) {
        // Create a 2D array for 5 students and 3 subjects
        String[][] students = {
            {"Alice", "Math", "Science"},
            {"Bob", "English", "History"},
            {"Charlie", "Math", "English"},
            {"Diana", "Science", "Math"},
            {"Ethan", "History", "English"}
        };

        // Print the array in a tabular format
        System.out.println("Student\tSubject 1\tSubject 2\tSubject 3");
        System.out.println("--------------------------------------------------");

        for (int i = 0; i < students.length; i++) {
            for (int j = 0; j < students[i].length; j++) {
                System.out.print(students[i][j] + "\t\t");
            }
            System.out.println();
        }
    }
}
