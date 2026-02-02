public class StopAtFifty {
    public static void main(String[] args) {

        int[] numbers = {10, 25, 40, 50, 60, 75};

        for (int num : numbers) {
            if (num == 50) {
                break;  // Stop the loop when 50 is encountered
            }
            System.out.println(num);
        }
    }
}
