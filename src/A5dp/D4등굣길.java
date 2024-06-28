package A5dp;

import java.util.Arrays;

public class D4등굣길 {
    public static void main(String[] args) {
        int n = 3;
        int m = 4;
        int[][] puddles = {{2, 2}};
        int answer = 0;
        int[][] dp = new int[m][n];
        dp[0][0] = 1;
        dp[0][1] = 1;
        dp[1][0] = 1;
        dp[1][1] = 1;
        dp[puddles.length][puddles[0].length] = -1;

        for(int i=0; i<=m; i++){
            int min = Integer.MAX_VALUE;
            for (int j = 1; j <= n; j++) {
                if(dp[i+1][j]==1){
                    dp[i][j] = dp[i+1][j];
                }
                if(dp[i][j+1] ==1){
                    dp[i][j] = dp[i+1][j]+dp[i][j+1];
                }
                dp[i][j]= min+1;
            }
        }

        System.out.println(Arrays.deepToString(dp));

    }
}
