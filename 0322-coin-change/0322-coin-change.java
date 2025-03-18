import java.util.Arrays;

public class Solution {
    private static final int MAX_SIZE = 10005;
    private int[] dp = new int[MAX_SIZE];
    
    public int coinChange(int[] coins, int amount) {
        Arrays.sort(coins);
        Arrays.fill(dp, -1);
        int result = fn(coins, amount);
        return result == Integer.MAX_VALUE ? -1 : result;
    }
    
    private int fn(int[] coins, int k) {
        if (k == 0) return 0;
        if (dp[k] != -1) return dp[k];
        
        int ans = Integer.MAX_VALUE;
        for (int coin : coins) {
            if (k >= coin) {
                int res = fn(coins, k - coin);
                if (res != Integer.MAX_VALUE) {
                    ans = Math.min(ans, res + 1);
                }
            }
        }
        return dp[k] = ans;
    }
}
