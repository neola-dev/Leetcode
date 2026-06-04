// Last updated: 04/06/2026, 11:16:19
class Solution {
    public boolean recur(int ind,int target,int[]  nums,int[][] dp){
        if(target==0)   return true;
        if(ind==0)  return nums[ind]==target;
        if(dp[ind][target]!=-1) return dp[ind][target]==1;
        boolean notTake=recur(ind-1,target,nums,dp);
        boolean take=false;
        if(target>=nums[ind])   take=recur(ind-1,target-nums[ind],nums,dp);
        dp[ind][target]=(take || notTake)?1:0;
        return take || notTake;
    }
    public boolean canPartition(int[] nums) {
        int s=0;
        for(int num:nums)   s+=num;
        if(s%2!=0)  return false;
        int n=nums.length;
        int t=s/2;
        int[][] dp=new int[n][t+1];
        for(int i=0;i<n;i++)    Arrays.fill(dp[i],-1);
        return recur(n-1,t,nums,dp);
    }
}