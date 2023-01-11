package DynamicProgramming;

public class Fibonacci{

    public int fib(int n,int[] dp){
        if(n==0 || n==1)
            return n;

        if(dp[n] != 0)
            return dp[n];

        dp[n]=fib(n-1,dp) + fib(n-2,dp);

        return dp[n];
    }
}
