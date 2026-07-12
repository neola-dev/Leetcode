// Last updated: 12/07/2026, 11:48:29
1class Solution {
2    public int uniquePathsWithObstacles(int[][] obs) {
3        int n=obs.length;
4        int m=obs[0].length;
5        int[][] dp=new int[n][m];
6        if(obs[0][0]==1) return 0;
7        dp[0][0]=1;
8        for(int i=1;i<n;i++){
9            if(obs[i][0]==0)  dp[i][0]=dp[i-1][0];
10        }
11        for(int j=1;j<m;j++){
12            if(obs[0][j]==0)  dp[0][j]=dp[0][j-1];
13        }
14        for(int i=1;i<n;i++){
15            for(int j=1;j<m;j++){
16                if(obs[i][j]==0){
17                    dp[i][j]=dp[i-1][j]+dp[i][j-1];
18                }
19            }
20        }
21        return dp[n-1][m-1];
22    }
23}