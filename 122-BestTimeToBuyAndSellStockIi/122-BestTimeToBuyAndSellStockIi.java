// Last updated: 04/06/2026, 11:19:00
class Solution {
    public int maxProfit(int[] prices) {
        int buy=prices[0];
        int profit=0;
        for(int i=1;i<prices.length;i++){
            int sell=prices[i];
            if(sell>buy)    profit+=(sell-buy);
            buy=sell;
        }
        return profit;
    }
}