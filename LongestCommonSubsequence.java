import java.util.*;

class Solution8 {
    public int solve(String a, String b) {
        int dp[][]=new int[a.length()][b.length()];
        for (int i=0;i<=a.length();i++)
        {
            for (int j=0;j<=b.length();j++)
            {

                if (i==0||j==0)
                {
                    dp[i][j]=0;
                }
                else
                {
                    if (a.charAt(i)==b.charAt(j)) {
                        dp[i][j] = dp[i - 1][j - 1] + 1;
                    }
                    else
                    {
                        dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                    }
                }
            }
        }
        return dp[a.length()][b.length()];
    }
}