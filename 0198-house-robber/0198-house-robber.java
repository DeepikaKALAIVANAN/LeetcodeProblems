class Solution {
    public int rob(int[] nums) {

        // -----------RECURSION METHOD--------------
        int[] dp=new int[nums.length];
        //int n=nums.length;
        Arrays.fill(dp,-1);
        return dfs(nums,nums.length-1,dp);
       
    }
    public int dfs(int[] arr,int n,int[] dp){
        if(n<0) return 0;
        if(n==0) return arr[0];
        if(dp[n]!=-1) return dp[n];
            int la=dfs(arr,n-2,dp)+arr[n];
            int ra=dfs(arr,n-1,dp)+0;

            dp[n]= Math.max(la,ra);
            return dp[n];
        
    }
}