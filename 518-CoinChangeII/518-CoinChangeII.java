// Last updated: 19/07/2026, 20:01:12
1class Solution {
2    // public int recur(int ind,int t,int[] coins,int[][] dp){
3    //     if(ind==0){
4    //         return t%coins[ind]==0?1:0;
5    //     }
6    //     if(dp[ind][t]!=-1) return dp[ind][t];
7    //     int notTake=recur(ind-1,t,coins,dp);
8    //     int take=0;
9    //     if(coins[ind]<=t){
10    //         take=recur(ind,t-coins[ind],coins,dp);
11    //     }
12    //     dp[ind][t]=take+notTake;
13    //     return take+notTake;
14    // }
15    public int change(int amount, int[] coins) {
16        int n=coins.length;
17        int[][] dp=new int[n][amount+1];
18        for(int t=0;t<=amount;t++){
19            if(t%coins[0]==0) dp[0][t]=1;
20            else dp[0][t]=0;
21        }
22        for(int i=1;i<n;i++){
23            for(int t=0;t<=amount;t++){
24                int notTake=dp[i-1][t];
25                int take=0;
26                if(coins[i]<=t){
27                    take=dp[i][t-coins[i]];
28                }
29                dp[i][t]=take+notTake;
30            }
31        }
32        return dp[n-1][amount];
33    }
34}