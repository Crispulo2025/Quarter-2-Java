import java.util.Scanner;

public class SmallestOfThreeUsingMathmin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = input.nextInt();

        System.out.print("Enter second number: ");
        int num2 = input.nextInt();

        System.out.print("Enter third number: ");
        int num3 = input.nextInt();

        int smallest = Math.min(num1, Math.min(num2, num3));

        System.out.println("The smallest number is: " + smallest);
    }
}
