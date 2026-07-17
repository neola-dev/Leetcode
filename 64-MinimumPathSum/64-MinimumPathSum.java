// Last updated: 17/07/2026, 14:02:00
1class Solution {
2    public int  recur(int i,int j,int[][] grid,int[][] dp){
3        if(i==0 && j==0)    return dp[i][j]=grid[i][j];
4        if(i<0 || j<0)    return Integer.MAX_VALUE;
5        if(dp[i][j]!=-1)    return dp[i][j];
6        int up=recur(i-1,j,grid,dp);
7        int left=recur(i,j-1,grid,dp);
8        int min=Math.min(up,left);
9        if(min==Integer.MAX_VALUE)  return min;
10        return dp[i][j]=grid[i][j]+min;
11    }
12    public int minPathSum(int[][] grid) {
13        int n=grid.length;
14        int m=grid[0].length;
15        int[][] dp=new int[n][m];
16        for(int i=0;i<n;i++)    Arrays.fill(dp[i],-1);
17        return recur(n-1,m-1,grid,dp);
18    }
19}