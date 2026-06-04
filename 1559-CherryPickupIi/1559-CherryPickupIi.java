// Last updated: 04/06/2026, 11:12:34
class Solution {
    public int recur(int i,int j1,int j2,int r,int c,int[][] grid,int[][][] dp){
        if(j1<0 || j1>=c || j2<0 || j2>=c)  return (int)-1e9;
        if(i==r-1){
            if(j1==j2)  return grid[i][j1];
            else return grid[i][j1]+grid[i][j2];
        }
        if(dp[i][j1][j2]!=-1)   return dp[i][j1][j2];
        //explore all paths
        int max=Integer.MIN_VALUE;
        for(int dj1=-1;dj1<=1;dj1++){
            for(int dj2=-1;dj2<=1;dj2++){
                int value=0;
                if(j1==j2)  value=grid[i][j1];
                else value=grid[i][j1]+grid[i][j2];
                value+=recur(i+1,dj1+j1,dj2+j2,r,c,grid,dp);
                max=Math.max(max,value);
            }
        }
        return dp[i][j1][j2]=max;
    }
    public int cherryPickup(int[][] grid) {
        int r=grid.length;
        int c=grid[0].length;
        int[][][] dp=new int[r][c][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                Arrays.fill(dp[i][j],-1);
            }
        }
        return recur(0,0,c-1,r,c,grid,dp);
    }
}