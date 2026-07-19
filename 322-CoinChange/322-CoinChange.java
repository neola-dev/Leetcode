// Last updated: 19/07/2026, 19:37:25
1class Solution {
2    public int recur(int ind,int target,int[] coins,int[][] dp){
3        if(ind==0){
4            if(target%coins[ind]==0) return target/coins[ind];
5            return (int)1e9;
6        }
7        if(dp[ind][target]!=-1) return dp[ind][target];
8        int notTake=0+recur(ind-1,target,coins,dp);
9        int take=(int)1e9;
10        if(coins[ind]<=target){
11            take=1+recur(ind,target-coins[ind],coins,dp);
12        }
13        return dp[ind][target]=Math.min(take,notTake);
14    }
15    public int coinChange(int[] coins, int amount) {
16        int n=coins.length;
17        int[][] dp=new int[n][amount+1];
18        for(int i=0;i<n;i++){
19            Arrays.fill(dp[i],-1);
20        }
21        return recur(n-1,amount,coins,dp)==(int)1e9?-1:recur(n-1,amount,coins,dp);
22    }
23}