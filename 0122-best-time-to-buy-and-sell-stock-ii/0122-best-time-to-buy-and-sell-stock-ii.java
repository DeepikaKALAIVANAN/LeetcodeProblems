class Solution {
    public int maxProfit(int[] prices) {
        int i = 0;
        int lp = prices[0];
        int hp = prices[0];
        int profit = 0;
        int n = prices.length;
        while(i < n - 1){
            while(i < n - 1 && prices[i] >= prices[i + 1]){
                i++;
            }
            lp = prices[i];
            while(i < n - 1 && prices[i] <= prices[i + 1]){
                i++;
            }
            hp = prices[i];
            profit += hp - lp;
        }
        return profit;
    }
}