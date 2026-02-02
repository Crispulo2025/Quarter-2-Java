public class PrintConsonants {
    public static void main(String[] args) {
        for (char letter = 'A'; letter <= 'Z'; letter++) {
            // Skip vowels
            if (letter == 'A' || letter == 'E' || letter == 'I' || letter == 'O' || letter == 'U') {
                continue; // Skip this iteration
            }
            System.out.println(letter); // Print consonants
        }
    }
}
