class Solution {
    public int findLengthOfLCIS(int[] nums) {
       int currlen = 1;
       int maxlen = 1;
       for(int i = 1; i < nums.length; i++){
        if(nums[i - 1] < nums[i]){
            currlen++;
        }
        else{
            maxlen = Math.max(currlen, maxlen);
            currlen = 1;
        }
       } 
                   maxlen = Math.max(currlen, maxlen);
       return maxlen;
    }
}