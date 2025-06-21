public class FinancialForecast {
    
    // Recursive method to calculate value.
    public static double futureValveRecursive(double principal,double rate,int years){
        if (years==0){
            return principal;
        }
        return (1 + rate) * futureValveRecursive(principal, rate, years-1);
    }

    // optimized recursive version with memoization (to reduce computation)
    public static double futureValueMemo(double principal,double rate,int years,Double[] memo){
        if (years==0)
        {
            return principal;
        }
        if(memo[years] !=null){
            return memo[years];
        }
        memo[years] = (1+rate) * futureValueMemo(principal, rate, years-1, memo);
        return memo[years];
    }
}
