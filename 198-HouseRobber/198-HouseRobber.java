// Last updated: 17/07/2026, 10:11:33
1class Solution {
2    public int recur(int ind,int[] nums,int[] dp){
3        if(ind>=nums.length){
4            return 0;
5        }
6        if(dp[ind]!=-1) return dp[ind];
7        int take=nums[ind]+recur(ind+2,nums,dp);
8        int notTake=0+recur(ind+1,nums,dp);
9        return dp[ind]=Math.max(take,notTake);
10    }
11    public int rob(int[] nums) {
12        int[] dp=new int[nums.length];
13        Arrays.fill(dp,-1);
14        return recur(0,nums,dp);
15    }
16}