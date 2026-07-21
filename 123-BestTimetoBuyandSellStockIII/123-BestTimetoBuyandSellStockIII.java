// Last updated: 21/07/2026, 09:10:37
1class Solution {
2    public int recur(int ind,int buy,int cap,int[] prices,int[][][] dp,int n){
3        if(ind==n) return 0;
4        if(cap==0) return 0;
5        if(dp[ind][buy][cap]!=-1) return dp[ind][buy][cap];
6        int profit=0;
7        if(buy==1){
8            profit=Math.max(-prices[ind]+recur(ind+1,0,cap,prices,dp,n),0+recur(ind+1,1,cap,prices,dp,n));
9        }
10        else{
11            profit=Math.max(prices[ind]+recur(ind+1,1,cap-1,prices,dp,n),0+recur(ind+1,0,cap,prices,dp,n));
12        }
13        return dp[ind][buy][cap]=profit;
14    }
15    public int maxProfit(int[] prices) {
16        int n=prices.length;
17        int[][][] dp=new int[n][2][3]; //arr size,buy/sell(0,1),(0/1/2)transactions
18        for(int i=0;i<n;i++){
19            for(int j=0;j<2;j++){
20                for(int k=0;k<3;k++){
21                    dp[i][j][k]=-1;
22                }
23            }
24        }
25        return recur(0,1,2,prices,dp,n);
26    }
27}