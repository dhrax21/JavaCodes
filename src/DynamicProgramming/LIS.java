package DynamicProgramming;

import java.util.Arrays;

public class LIS {

    public int longestIncreasingSubSequence(int[] arr,int n)
    {
        int maxi=-1;
        int[] dp=new int[n+1];
        Arrays.fill(dp,1);

        for(int i=1; i<n; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[j] < arr[i]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
//                    System.out.print(dp[i]+"\t");
                }
            }
            maxi = Math.max(maxi, dp[i]);
//            System.out.print(maxi+"  "+"\t");
        }
//        System.out.println(Arrays.toString(dp));
        return maxi;
    }
}
