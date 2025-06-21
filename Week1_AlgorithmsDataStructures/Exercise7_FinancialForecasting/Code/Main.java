

public class Main {
    public static void main(String[] args) { 
        double principal = 1000.0;  // initial value (assumed)
        double rate = 0.10; //10% growth yearly
        int years = 5;

        double future1 = FinancialForecast.futureValveRecursive(principal, rate, years);
        System.out.printf("Future value (Recursive): %.2f\n",future1);

        Double[] memo = new Double[years+1];
        double future2 = FinancialForecast.futureValueMemo(principal, rate, years, memo);
        System.out.printf("Future value (Optimized): %.2f\n",future2);
    }
}
