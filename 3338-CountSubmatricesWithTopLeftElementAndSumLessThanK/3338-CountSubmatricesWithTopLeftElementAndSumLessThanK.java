// Last updated: 04/06/2026, 11:10:56
class Solution {
    public int countSubmatrices(int[][] grid, int k) {
        int n=grid.length;
        int m=grid[0].length;
        int[][] dp=new int[n][m];
        dp[0][0]=grid[0][0];
        int cnt=0;
        if(dp[0][0]>k)  return cnt;
        if(dp[0][0]<=k)  cnt++;
        for(int i=1;i<n;i++){
            dp[i][0]=grid[i][0]+dp[i-1][0];
            if(dp[i][0]<=k)  cnt++;
        }    
        for(int j=1;j<m;j++){
            dp[0][j]=grid[0][j]+dp[0][j-1];
            if(dp[0][j]<=k) cnt++;
        }    
        for(int i=1;i<n;i++){
            for(int j=1;j<m;j++){
                dp[i][j]=dp[i-1][j]+dp[i][j-1]+grid[i][j]-dp[i-1][j-1];
                if(dp[i][j]<=k) cnt++;
            }
        }
        return cnt;
    }
}