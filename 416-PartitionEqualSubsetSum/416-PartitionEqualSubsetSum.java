// Last updated: 18/07/2026, 13:40:51
1class Solution {
2    public boolean memo(int ind,int t,int[] nums,int[][] dp){
3        if(t==0) return true;
4        if(ind==0) return nums[ind]==t;
5        if(dp[ind][t]!=-1) return dp[ind][t]==1;
6        boolean notTake=memo(ind-1,t,nums,dp);
7        boolean take=false;
8        if(nums[ind]<=t) take=memo(ind-1,t-nums[ind],nums,dp);
9        dp[ind][t]=(take || notTake)?1:0;
10        return take || notTake;
11    }
12    public boolean canPartition(int[] nums) {
13        int n=nums.length;
14        int sum=0;
15        for(int num:nums) sum+=num;
16        if(sum%2!=0) return false;
17        int target=sum/2;
18        int[][] dp=new int[n][target+1];
19        for(int i=0;i<n;i++){
20            Arrays.fill(dp[i],-1);
21        }
22        return memo(n-1,target,nums,dp);
23    }
24}