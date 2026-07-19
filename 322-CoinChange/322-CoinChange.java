// Last updated: 19/07/2026, 19:44:34
1class Solution {
2    // public int recur(int ind,int target,int[] coins,int[][] dp){
3    //     if(ind==0){
4    //         if(target%coins[ind]==0) return target/coins[ind];
5    //         return (int)1e9;
6    //     }
7    //     if(dp[ind][target]!=-1) return dp[ind][target];
8    //     int notTake=0+recur(ind-1,target,coins,dp);
9    //     int take=(int)1e9;
10    //     if(coins[ind]<=target){
11    //         take=1+recur(ind,target-coins[ind],coins,dp);
12    //     }
13    //     return dp[ind][target]=Math.min(take,notTake);
14    // }
15    public int coinChange(int[] coins, int amount) {
16        int n=coins.length;
17        int[][] dp=new int[n][amount+1];
18        for(int t=0;t<=amount;t++){
19            if(t%coins[0]==0) dp[0][t]=t/coins[0];
20            else dp[0][t]=(int)1e9;
21        }
22        for(int i=1;i<n;i++){
23            for(int t=0;t<=amount;t++){
24                int notTake=0+dp[i-1][t];
25                int take=(int)1e9;
26                if(coins[i]<=t){
27                    take=1+dp[i][t-coins[i]];
28                }
29                dp[i][t]=Math.min(take,notTake);
30            }
31        }
32        return dp[n-1][amount]==(int)1e9?-1:dp[n-1][amount];
33    }
34}