public class SkipNamesStartingWithJ {
    public static void main(String[] args) {
        String[] names = {"Alice", "John", "Bob", "Jessica", "Charlie", "James"};

        for (String name : names) {
            if (name.startsWith("J")) {
                continue; // Skip names starting with 'J'
            }
            System.out.println(name); // Print names not starting with 'J'
        }
    }
}
