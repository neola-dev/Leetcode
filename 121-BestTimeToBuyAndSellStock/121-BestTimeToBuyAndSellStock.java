// Last updated: 04/06/2026, 11:19:03
class Solution {
    public int maxProfit(int[] prices) {
        int buy=prices[0];
        int maxProfit=0;
        for(int i=1;i<prices.length;i++){
            int cost=prices[i]-buy;
            maxProfit=Math.max(maxProfit,cost);
            buy=Math.min(buy,prices[i]);
        }
        return maxProfit;
    }
}