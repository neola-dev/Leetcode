// Last updated: 20/07/2026, 14:36:51
1class Solution {
2    public int maxProfit(int[] prices) {
3        int profit=0;
4        int buy=prices[0];
5        for(int i=1;i<prices.length;i++){
6            int sell=prices[i];
7            if(buy<sell) profit+=sell-buy;
8            buy=sell;
9        }
10        return profit;
11    }
12}