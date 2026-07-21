// Last updated: 21/07/2026, 10:21:00
1class Solution {
2    public int memo(int ind,int prev,int[] nums,int[][] dp,int n){
3        if(ind==n) return 0;
4        if(dp[ind][prev+1]!=-1) return dp[ind][prev+1];
5        int take=0;
6        int notTake=0;
7        if(prev==-1 || nums[prev]<nums[ind]){
8            take=1+memo(ind+1,ind,nums,dp,n);
9        }
10        notTake=0+memo(ind+1,prev,nums,dp,n);
11        return dp[ind][prev+1]=Math.max(take,notTake);
12    }
13    public int lengthOfLIS(int[] nums) {
14        int n=nums.length;
15        int[][] dp=new int[n][n+1];
16        for(int i=0;i<n;i++){
17            for(int j=0;j<=n;j++){
18                dp[i][j]=-1;
19            }
20        }
21        return memo(0,-1,nums,dp,n);
22    }
23}