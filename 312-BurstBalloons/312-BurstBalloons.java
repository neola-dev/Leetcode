// Last updated: 23/07/2026, 09:58:45
1class Solution {
2    public int recur(int i,int j,int[] arr,int[][] dp){
3        if(i>j) return 0;
4        if(dp[i][j]!=-1) return dp[i][j];
5        int max=Integer.MIN_VALUE;
6        for(int k=i;k<=j;k++){
7            int coins=arr[j+1]*arr[k]*arr[i-1]+recur(i,k-1,arr,dp)+recur(k+1,j,arr,dp);
8            max=Math.max(max,coins);
9        }
10        return dp[i][j]=max;
11    }
12    public int maxCoins(int[] nums) {
13        List<Integer> lis=new ArrayList<>();
14        lis.add(1);
15        for(int i=0;i<nums.length;i++){
16            lis.add(nums[i]);
17        }
18        lis.add(1);
19        int[] arr=new int[lis.size()];
20        for(int i=0;i<lis.size();i++){
21            arr[i]=lis.get(i);
22        }
23        int n=nums.length;
24        int[][] dp=new int[n+1][n+1];
25        for(int i=0;i<=n;i++){
26            for(int j=0;j<=n;j++){
27                dp[i][j]=-1;
28            }
29        }
30        return recur(1,n,arr,dp);
31    }
32}