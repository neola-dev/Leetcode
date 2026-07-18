// Last updated: 18/07/2026, 13:07:23
1class Solution {
2    public int minimumTotal(List<List<Integer>> triangle) {
3        int n=triangle.size();
4        int[][] dp=new int[n][n];
5        for(int j=0;j<triangle.get(n-1).size();j++){
6            dp[n-1][j]=triangle.get(n-1).get(j);
7        }
8        for(int i=n-2;i>=0;i--){
9            for(int j=0;j<triangle.get(i).size();j++){
10                int down=dp[i+1][j];
11                int diag=dp[i+1][j+1];
12                dp[i][j]=triangle.get(i).get(j)+Math.min(down,diag);
13            }
14        }
15        return dp[0][0];
16    }
17}