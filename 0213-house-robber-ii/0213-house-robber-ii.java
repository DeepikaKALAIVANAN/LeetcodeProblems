class Solution {
    public int rob(int[] nums) {
        if (nums.length == 1) return nums[0];
        
        int n = nums.length;

        int[] nums1 = new int[n - 1];
        int[] nums2 = new int[n - 1];
        
        System.arraycopy(nums, 0, nums1, 0, n - 1);
        System.arraycopy(nums, 1, nums2, 0, n - 1);

        return Math.max(DFS_tab(nums1, n - 2), DFS_tab(nums2, n - 2));
    }

    public int DFS_tab(int[] nums, int n) {
        int[] dp = new int[n + 1];
        
        if (n >= 0) dp[0] = nums[0];
        if (n >= 1) dp[1] = Math.max(nums[0], nums[1]);

        for (int i = 2; i <= n; i++) {
            dp[i] = Math.max(dp[i - 1], dp[i - 2] + nums[i]);
        }

        return dp[n];
    }
}