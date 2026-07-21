// Last updated: 21/07/2026, 09:23:19
1class Solution {
2    // public int recur(int ind,int buy,int cap,int[] prices,int[][][] dp,int n){
3    //     if(ind==n) return 0;
4    //     if(cap==0) return 0;
5    //     if(dp[ind][buy][cap]!=-1) return dp[ind][buy][cap];
6    //     int profit=0;
7    //     if(buy==1){
8    //         profit=Math.max(-prices[ind]+recur(ind+1,0,cap,prices,dp,n),0+recur(ind+1,1,cap,prices,dp,n));
9    //     }
10    //     else{
11    //         profit=Math.max(prices[ind]+recur(ind+1,1,cap-1,prices,dp,n),0+recur(ind+1,0,cap,prices,dp,n));
12    //     }
13    //     return dp[ind][buy][cap]=profit;
14    // }
15    public int maxProfit(int[] prices) {
16        int n=prices.length;
17        int[][][] dp=new int[n+1][2][3]; //arr size,buy/sell(0,1),(0/1/2)transactions
18        for(int i=n-1;i>=0;i--){
19            for(int buy=0;buy<2;buy++){
20                for(int cap=1;cap<=2;cap++){
21                    int profit=0;
22                    if(buy==1){
23                        profit=Math.max(-prices[i]+dp[i+1][0][cap],0+dp[i+1][1][cap]);
24                    }
25                    else{
26                        profit=Math.max(prices[i]+dp[i+1][1][cap-1],0+dp[i+1][0][cap]);
27                    }
28                    dp[i][buy][cap]=profit;
29                }
30            }
31        }
32        return dp[0][1][2];
33    }
34}