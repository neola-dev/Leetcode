// Last updated: 21/07/2026, 09:33:16
1class Solution {
2    public int maxProfit(int k, int[] prices) {
3        int n = prices.length;
4        int[][][] dp = new int[n + 1][2][k + 1];
5        for (int i = n - 1; i >= 0; i--) {
6            for (int buy = 0; buy < 2; buy++) {
7                for (int cap = 1; cap <= k; cap++) {
8                    int profit = 0;
9                    if (buy == 1) {
10                        profit = Math.max(-prices[i] + dp[i + 1][0][cap], 0 + dp[i + 1][1][cap]);
11                    } else {
12                        profit = Math.max(prices[i] + dp[i + 1][1][cap - 1], 0 + dp[i + 1][0][cap]);
13                    }
14                    dp[i][buy][cap] = profit;
15                }
16            }
17        }
18        return dp[0][1][k];
19    }
20}