// Last updated: 30/06/2026, 11:46:20
1class Solution {
2    public int numIslands(char[][] grid) {
3        int n=grid.length;
4        int m=grid[0].length;
5        int isLandCnt=0;
6        for(int i=0;i<n;i++){
7            for(int j=0;j<m;j++){
8                if(grid[i][j]=='1'){
9                    isLandCnt++;
10                    dfs(grid,i,j);
11                }
12            }
13        }
14        return isLandCnt;
15    }
16    public void dfs(char[][] grid,int i,int j){
17        if(i<0 || i>=grid.length || j<0 || j>=grid[0].length || grid[i][j]=='0'){
18            return;
19        }
20        if(grid[i][j]=='1') grid[i][j]='0';
21        dfs(grid,i-1,j);
22        dfs(grid,i+1,j);
23        dfs(grid,i,j-1);
24        dfs(grid,i,j+1);
25    }
26}