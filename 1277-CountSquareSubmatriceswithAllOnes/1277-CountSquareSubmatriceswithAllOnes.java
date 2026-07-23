// Last updated: 23/07/2026, 11:58:27
1class Solution {
2    public int countSquares(int[][] matrix) {
3        int n=matrix.length;
4        int m=matrix[0].length;
5        int[][] dp=new int[n][m];
6        for(int i=0;i<n;i++) dp[i][0]=matrix[i][0];
7        for(int j=0;j<m;j++) dp[0][j]=matrix[0][j];
8        for(int i=1;i<n;i++){
9            for(int j=1;j<m;j++){
10                if(matrix[i][j]==0){
11                    dp[i][j]=0;
12                }
13                else{
14                    dp[i][j]=1+Math.min(Math.min(dp[i-1][j],dp[i-1][j-1]),dp[i][j-1]);
15                }
16            }
17        }
18        int sum=0;
19        for(int i=0;i<n;i++){
20            for(int j=0;j<m;j++){
21                sum+=dp[i][j];
22            }
23        }
24        return sum;
25    }
26}