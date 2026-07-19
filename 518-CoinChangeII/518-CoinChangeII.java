// Last updated: 19/07/2026, 19:58:19
1class Solution {
2    public int recur(int ind,int t,int[] coins,int[][] dp){
3        if(ind==0){
4            return t%coins[ind]==0?1:0;
5        }
6        if(dp[ind][t]!=-1) return dp[ind][t];
7        int notTake=recur(ind-1,t,coins,dp);
8        int take=0;
9        if(coins[ind]<=t){
10            take=recur(ind,t-coins[ind],coins,dp);
11        }
12        dp[ind][t]=take+notTake;
13        return take+notTake;
14    }
15    public int change(int amount, int[] coins) {
16        int n=coins.length;
17        int[][] dp=new int[n][amount+1];
18        for(int i=0;i<n;i++){
19            Arrays.fill(dp[i],-1);
20        }
21        return recur(n-1,amount,coins,dp);
22    }
23}