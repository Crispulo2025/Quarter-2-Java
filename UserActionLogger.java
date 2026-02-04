import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class UserActionLogger {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String logFile = "user_actions.log";

        // Formatter for date and time
        DateTimeFormatter formatter =
                DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        System.out.println("Enter user actions (type 'exit' to stop):");

        try (FileWriter writer = new FileWriter(logFile, true)) { // append mode
            while (true) {
                System.out.print("Action: ");
                String action = scanner.nextLine();

                if (action.equalsIgnoreCase("exit")) {
                    break;
                }

                // Get current timestamp
                String timestamp = LocalDateTime.now().format(formatter);

                // Write to log file
                writer.write(timestamp + " - " + action + System.lineSeparator());
                writer.flush();

                System.out.println("Action logged.");
            }

        } catch (IOException e) {
            System.out.println("Error writing to log file.");
        }

        scanner.close();
        System.out.println("Logging ended.");
    }
}
