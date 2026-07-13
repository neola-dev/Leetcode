// Last updated: 13/07/2026, 12:12:47
1class Solution {
2    public int memo(int i,int j,int[] arr,int[][] dp){
3        if(i>j) return 0;
4        if(dp[i][j]!=-1) return dp[i][j];
5        int maxCost=Integer.MIN_VALUE;
6        for(int ind=i;ind<=j;ind++){
7            int cost=arr[i-1]*arr[ind]*arr[j+1]+memo(i,ind-1,arr,dp)+memo(ind+1,j,arr,dp);
8            maxCost=Math.max(maxCost,cost);
9        }
10        return dp[i][j]=maxCost;
11    }
12    public int maxCoins(int[] nums) {
13       List<Integer> lis=new ArrayList<>();
14       int n=nums.length;
15       lis.add(1);
16       for(int i=0;i<n;i++){
17         lis.add(nums[i]);
18       } 
19       lis.add(1);
20       int[] arr=new int[n+2];
21       for(int i=0;i<n+2;i++){
22        arr[i]=lis.get(i);
23       }
24       int[][] dp=new int[n+1][n+1];
25       for(int i=0;i<=n;i++){
26        for(int j=0;j<=n;j++){
27            dp[i][j]=-1;
28        }
29       }
30       return memo(1,nums.length,arr,dp);
31    }
32}