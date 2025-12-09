public class MinutesToHours {
    public static void main(String[] args) {
        // Total minutes
        int totalMinutes = 135;

        // Calculate hours and remaining minutes
        int hours = totalMinutes / 60;       // Integer division for hours
        int minutes = totalMinutes % 60;     // Modulus for remaining minutes

        // Display the result
        System.out.println(totalMinutes + " minutes is equivalent to " + hours + " hour(s) and " + minutes + " minute(s).");
    }
}
