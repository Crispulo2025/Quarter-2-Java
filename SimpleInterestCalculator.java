public class SimpleInterestCalculator {
    public static void main(String[] args) {
        // Declare the principal, rate, and time
        double principal = 5000.0; // Principal amount
        double rate = 5.0;         // Interest rate in percent
        double time = 3.0;         // Time in years

        // Calculate simple interest
        double simpleInterest = (principal * rate * time) / 100;

        // Display the result
        System.out.println("Simple Interest for a principal of " + principal + 
                           " at a rate of " + rate + "% for " + time + 
                           " year(s) is " + simpleInterest);
    }
}
