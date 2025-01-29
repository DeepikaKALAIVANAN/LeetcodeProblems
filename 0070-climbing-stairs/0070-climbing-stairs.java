class Solution {
    public int dfs(int n,int[] dp) {
     if(n==0 || n==1) return 1;

     if(dp[n]!=0) return dp[n];

    int la=dfs(n-1,dp);
    int ra=dfs(n-2,dp);

    dp[n]=(la+ra);

    return dp[n];
    }
   public int climbStairs(int n){
    int[] dp=new int[n+1];
    int ans=dfs(n,dp);
    return ans;
   }
}