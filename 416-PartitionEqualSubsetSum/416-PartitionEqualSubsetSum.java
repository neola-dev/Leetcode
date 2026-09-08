// Last updated: 08/09/2026, 22:27:06
1class Solution {
2    public boolean recur(int ind,int[] nums,int[][] dp,int t){
3        if(t==0) return true;
4        if(ind==0) return nums[ind]==t;
5        if(dp[ind][t]!=-1) return dp[ind][t]==1;
6        boolean notPick=recur(ind-1,nums,dp,t);
7        boolean pick=false;
8        if(nums[ind]<=t)    pick=recur(ind-1,nums,dp,t-nums[ind]);
9        dp[ind][t]=pick || notPick?1:0;
10        return pick || notPick;
11    }
12    public boolean canPartition(int[] nums) {
13        int n=nums.length;
14        int sum=0;
15        for(int num:nums) sum+=num;
16        if(sum%2==1) return false;
17        int t=sum/2;
18        int[][] dp=new int[n][t+1];
19        for(int i=0;i<n;i++){
20            Arrays.fill(dp[i],-1);
21        }
22        return  recur(n-1,nums,dp,t);
23    }
24}