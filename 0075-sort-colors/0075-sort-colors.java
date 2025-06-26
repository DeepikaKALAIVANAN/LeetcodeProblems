class Solution {
    public void sortColors(int[] nums) {
        int[] count = new int[3];
        for(int color : nums){
            count[color]++;
        }
        int r = count[0], w = count[1], b = count[2]; 
        for(int i = 0; i < r; i++){
            nums[i] = 0;
        }
        for(int i = r; i < r + w; i++){
            nums[i] = 1;
        }
        for(int i = r + w; i < nums.length; i++){
            nums[i] = 2;
        }
    }
}