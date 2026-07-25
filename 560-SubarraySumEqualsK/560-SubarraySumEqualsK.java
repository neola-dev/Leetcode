// Last updated: 25/07/2026, 11:55:43
1class Solution {
2    public int numIslands(char[][] grid) {
3        int isLandCnt=0;
4        int n=grid.length;
5        int m=grid[0].length;
6        for(int i=0;i<n;i++){
7            for(int j=0;j<m;j++){
8                if(grid[i][j]=='1'){
9                    isLandCnt++;
10                    dfs(i,j,grid,n,m);
11                }
12            }
13        }
14        return isLandCnt;
15    }
16    public void dfs(int i,int j,char[][] grid,int n,int m){
17        if(i<0 || j<0 || i>=n || j>=m || grid[i][j]=='0'){
18            return;
19        }
20        if(grid[i][j]=='1') grid[i][j]='0';
21        dfs(i-1,j,grid,n,m);
22        dfs(i+1,j,grid,n,m);
23        dfs(i,j-1,grid,n,m);
24        dfs(i,j+1,grid,n,m);
25    }
26}