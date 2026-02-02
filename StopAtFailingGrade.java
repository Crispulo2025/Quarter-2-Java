public class StopAtFailingGrade {
    public static void main(String[] args) {
        int[] grades = {85, 92, 78, 64, 59, 88, 73}; // Example grades

        for (int grade : grades) {
            if (grade < 60) {
                System.out.println("Failing grade encountered: " + grade);
                break; // Stop processing once a failing grade is found
            }
            System.out.println("Grade: " + grade);
        }
    }
}
