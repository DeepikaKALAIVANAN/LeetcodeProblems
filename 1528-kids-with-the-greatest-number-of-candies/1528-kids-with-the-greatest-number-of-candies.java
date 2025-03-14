class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> ans = new ArrayList<>();
        int max = 0;
        for(int i = 0; i < candies.length;i++){
        max = Math.max(max, candies[i]);
        }
        for(int i = 0; i < candies.length;i++){
            int val = candies[i];
            ans.add(val + extraCandies >= max);
        }
        return ans;
    }
}