// Last updated: 04/06/2026, 11:18:06
class Solution {
    public int recur(int ind,int[] nums,int[] dp){
        if(ind>=nums.length){
            return 0;
        }
        if(dp[ind]!=-1) return dp[ind];
        int take=nums[ind]+recur(ind+2,nums,dp);
        int notTake=0+recur(ind+1,nums,dp);
        return dp[ind]=Math.max(take,notTake);
    }
    public int rob(int[] nums) {
        int[] dp=new int[nums.length];
        Arrays.fill(dp,-1);
        return recur(0,nums,dp);
    }
}