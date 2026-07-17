// Last updated: 17/07/2026, 10:17:15
1class Solution {
2    public int recur(int ind,int[] nums,int[] dp){
3        if(ind>=nums.length) return 0;
4        if(dp[ind]!=-1) return dp[ind];
5        int take=nums[ind]+recur(ind+2,nums,dp);
6        int notTake=0+recur(ind+1,nums,dp);
7        return dp[ind]=Math.max(take,notTake);
8    }
9    public int rob(int[] nums) {
10        int n=nums.length;
11        int[] dp=new int[n];
12        Arrays.fill(dp,-1);
13        return recur(0,nums,dp);
14    }
15}