// Last updated: 18/07/2026, 19:54:43
1class Solution {
2    public int recur(int ind,int[] arr,int target,int[][] dp){
3        if(ind==0){
4            if(arr[ind]==0 && target==0) return 2;
5            if(target==0 || target==arr[0]) return 1;
6            return 0;
7        }
8        if(dp[ind][target]!=-1) return dp[ind][target];
9        int notPick=recur(ind-1,arr,target,dp);
10        int pick=0;
11        if(arr[ind]<=target) pick=recur(ind-1,arr,target-arr[ind],dp);
12        dp[ind][target]=pick+notPick;
13        return pick+notPick;
14    }
15    public int countPartitions(int[] arr, int diff) {
16        int totSum=0;
17        for(int num:arr) totSum+=num;
18        if(totSum-diff<0 || (totSum-diff)%2!=0) return 0;
19        int target=(totSum-diff)/2;
20        int n=arr.length;
21        int[][] dp=new int[n][target+1];
22        for(int i=0;i<n;i++){
23            Arrays.fill(dp[i],-1);
24        }
25        return recur(n-1,arr,target,dp);
26    }
27    public int findTargetSumWays(int[] nums, int target) {
28        return countPartitions(nums,target);
29    }
30}