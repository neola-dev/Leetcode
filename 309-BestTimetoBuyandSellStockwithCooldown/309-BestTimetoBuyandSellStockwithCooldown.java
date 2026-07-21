// Last updated: 21/07/2026, 09:40:30
1class Solution {
2    public int recur(int i,int buy,int[] prices,int[][] dp,int n){
3        if(i>=n) return 0;
4        if(dp[i][buy]!=-1) return dp[i][buy];
5        int profit=0;
6        if(buy==1){
7            profit=Math.max(-prices[i]+recur(i+1,0,prices,dp,n),0+recur(i+1,1,prices,dp,n));
8        }
9        else{
10            profit=Math.max(prices[i]+recur(i+2,1,prices,dp,n),0+recur(i+1,0,prices,dp,n));
11        }
12        return dp[i][buy]=profit;
13    }
14    public int maxProfit(int[] prices) {
15        int n=prices.length;
16        int[][] dp=new int[n][2];
17        for(int i=0;i<n;i++){
18            for(int buy=0;buy<2;buy++){
19                dp[i][buy]=-1;
20            }
21        }
22        return recur(0,1,prices,dp,n);
23    }
24}