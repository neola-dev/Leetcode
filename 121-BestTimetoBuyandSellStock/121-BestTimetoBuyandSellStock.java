// Last updated: 20/07/2026, 14:35:15
1class Solution {
2    public int maxProfit(int[] prices) {
3        int max=0;
4        int buy=prices[0];
5        for(int i=1;i<prices.length;i++){
6            int cost=prices[i]-buy;
7            max=Math.max(max,cost);
8            buy=Math.min(buy,prices[i]);
9        }
10        return max;
11    }
12}