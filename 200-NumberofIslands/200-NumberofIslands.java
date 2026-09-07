// Last updated: 07/09/2026, 13:40:06
1class Solution {
2    public int numIslands(char[][] grid) {
3        int n=grid.length;
4        int m=grid[0].length;
5        int isLand=0;
6        for(int i=0;i<n;i++){
7            for(int j=0;j<m;j++){
8                if(grid[i][j]=='1'){
9                    isLand++;
10                    dfs(i,j,grid,n,m);
11                }
12            }
13        }
14        return isLand;
15    }
16    public void dfs(int i,int j,char[][] grid,int n,int m){
17        if(i<0 || j<0 || i>=n || j>=m || grid[i][j]=='0'){
18            return;
19        }
20        if(grid[i][j]=='1'){
21            grid[i][j]='0';
22        }
23        dfs(i-1,j,grid,n,m);
24        dfs(i+1,j,grid,n,m);
25        dfs(i,j-1,grid,n,m);
26        dfs(i,j+1,grid,n,m);
27    }
28}