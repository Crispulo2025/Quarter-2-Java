public class SwapWithTemp {
    public static void main(String[] args) {
        // Declare two variables
        int a = 10;
        int b = 20;

        System.out.println("Before swapping: a = " + a + ", b = " + b);

        // Use a temporary variable to swap
        int temp = a;
        a = b;
        b = temp;

        System.out.println("After swapping: a = " + a + ", b = " + b);
    }
}
