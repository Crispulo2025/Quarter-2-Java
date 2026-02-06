import java.util.Scanner;

public class ReadThreeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read values
        int intNum = sc.nextInt();
        double doubleNum = sc.nextDouble();
        float floatNum = sc.nextFloat();

        // Display values
        System.out.print("Integer value: ");
        System.out.println(intNum);

        System.out.print("Double value: ");
        System.out.println(doubleNum);

        System.out.print("Float value: ");
        System.out.println(floatNum);

        sc.close();
    }
}
