class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int s = 0;
        int e = 0;
        int sum = 0;
        int minlen = Integer.MAX_VALUE;
        int curlen = 0;
        while(e < nums.length){
            sum += nums[e];
            while(sum >= target){
                curlen = e - s + 1;
                minlen = Math.min(minlen, curlen);
                sum -= nums[s];
                s++;
            }
            e++;
        }
        if(minlen == Integer.MAX_VALUE) return 0;
        return minlen;
    }
}