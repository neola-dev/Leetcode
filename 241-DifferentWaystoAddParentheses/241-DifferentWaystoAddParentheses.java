// Last updated: 28/06/2026, 12:56:05
1class Solution {
2    public int recur(int i,int j,int n,int m,boolean[][]vis,int[][] grid){
3        if(i<0 || j<0 || i>=n || j>=m)  return 0;
4        if(grid[i][j]==0 || vis[i][j])  return 0;
5        int curr=grid[i][j];
6        vis[i][j]=true;
7        int up=recur(i-1,j,n,m,vis,grid);
8        int down=recur(i+1,j,n,m,vis,grid);
9        int left=recur(i,j-1,n,m,vis,grid);
10        int right=recur(i,j+1,n,m,vis,grid);
11        vis[i][j]=false;
12        return curr+Math.max(Math.max(up,down),Math.max(left,right));
13    }
14    public int getMaximumGold(int[][] grid) {
15        int n=grid.length;
16        int m=grid[0].length;
17        int max=0;
18        boolean[][] vis=new boolean[n][m];
19        for(int i=0;i<n;i++){
20            for(int j=0;j<m;j++){
21                if(grid[i][j]!=0){
22                    int gold=recur(i,j,n,m,vis,grid);
23                    max=Math.max(max,gold);
24                }
25            }
26        }
27        return max;
28    }
29}