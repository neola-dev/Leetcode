// Last updated: 06/08/2026, 22:37:00
1class Solution {
2    public int recur(int i,int j,int n,int m,int[][] grid,int[][] dp){
3        if(i==n-1 && j==m-1) return dp[i][j]=grid[i][j];
4        if(i>=n || j>=m) return  Integer.MAX_VALUE;
5        if(dp[i][j]!=-1) return dp[i][j];
6        int down=recur(i+1,j,n,m,grid,dp);
7        int right=recur(i,j+1,n,m,grid,dp);
8        int min=Math.min(down,right);
9        if(min==Integer.MAX_VALUE) return min;
10        return dp[i][j]=grid[i][j]+min;
11    }
12    public int minPathSum(int[][] grid) {
13        int n=grid.length;
14        int m=grid[0].length;
15        int[][] dp=new int[n][m];
16        for(int i=0;i<n;i++){
17            Arrays.fill(dp[i],-1);
18        }
19        return recur(0,0,n,m,grid,dp);
20    }
21}