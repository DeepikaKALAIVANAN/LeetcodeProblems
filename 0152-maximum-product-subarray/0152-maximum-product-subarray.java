class Solution {
    public int maxProduct(int[] nums) {
        double prefix = 1;
        double suffix = 1;
        double ans = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++){
            if(prefix == 0) prefix = 1;
            if(suffix == 0) suffix = 1;
            prefix = prefix * nums[i];
            suffix = suffix * nums[nums.length - 1 - i];
            ans = Math.max(ans, Math.max(prefix, suffix));
        }
        return (int)ans;
    }
}