// Last updated: 18/07/2026, 13:37:54
1class Solution {
2    public boolean recur(int ind,int target,int[]  nums,int[][] dp){
3        if(target==0)   return true;
4        if(ind==0)  return nums[ind]==target;
5        if(dp[ind][target]!=-1) return dp[ind][target]==1;
6        boolean notTake=recur(ind-1,target,nums,dp);
7        boolean take=false;
8        if(target>=nums[ind])   take=recur(ind-1,target-nums[ind],nums,dp);
9        dp[ind][target]=(take || notTake)?1:0;
10        return take || notTake;
11    }
12    public boolean canPartition(int[] nums) {
13        int s=0;
14        for(int num:nums)   s+=num;
15        if(s%2!=0)  return false;
16        int n=nums.length;
17        int t=s/2;
18        int[][] dp=new int[n][t+1];
19        for(int i=0;i<n;i++)    Arrays.fill(dp[i],-1);
20        return recur(n-1,t,nums,dp);
21    }
22}