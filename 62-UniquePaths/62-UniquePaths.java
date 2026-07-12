// Last updated: 12/07/2026, 11:44:31
1class Solution {
2    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
3        int n=obstacleGrid.length;
4        int m=obstacleGrid[0].length;
5        int[][] dp=new int[n][m];
6        if(obstacleGrid[0][0]==1) return 0;
7        dp[0][0]=1;
8        for(int i=1;i<n;i++){
9            if(obstacleGrid[i][0]==0)   dp[i][0]=dp[i-1][0];
10        }
11        for(int j=1;j<m;j++){
12            if(obstacleGrid[0][j]==0)   dp[0][j]=dp[0][j-1];
13        }
14        for(int i=1;i<n;i++){
15            for(int j=1;j<m;j++){
16                if(obstacleGrid[i][j]==0){
17                    dp[i][j]=dp[i-1][j]+dp[i][j-1];
18                }    
19            }
20        }
21        return dp[n-1][m-1];
22
23    }
24}