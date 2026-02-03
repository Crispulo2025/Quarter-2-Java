public class SumFirst100 {
    public static void main(String[] args) {

        int sum = 0;
        int i = 1;

        // While loop to calculate sum of first 100 natural numbers
        while (i <= 100) {
            sum += i;
            i++;
        }

        // Display result
        System.out.println("Sum of the first 100 natural numbers is: " + sum);
    }
}
