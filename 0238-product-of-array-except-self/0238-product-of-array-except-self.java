class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        int left_prod = 1;
        int right_prod = 1;
        for(int i = 0; i < n; i++){
            res[i] = left_prod;
            left_prod *= nums[i];
        }
        for(int i = n - 1; i >= 0; i--){
            res[i] *= right_prod;
            right_prod *= nums[i];
        }
        return res;
    }
}