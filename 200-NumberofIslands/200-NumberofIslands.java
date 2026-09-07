// Last updated: 07/09/2026, 13:47:23
1class Solution {
2    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
3        int n=image.length;
4        int m=image[0].length;
5        if(image[sr][sc]==color) return image;
6        dfs(sr,sc,image,n,m,color,image[sr][sc]);
7        return image;
8    }
9    public void dfs(int i,int j,int[][] image,int n,int m,int color,int ogColor){
10        if(i<0 || j<0 || i>=n || j>=m || image[i][j]!=ogColor){
11            return;
12        }
13        if(image[i][j]==ogColor) image[i][j]=color;
14        dfs(i-1,j,image,n,m,color,ogColor);
15        dfs(i+1,j,image,n,m,color,ogColor);
16        dfs(i,j-1,image,n,m,color,ogColor);
17        dfs(i,j+1,image,n,m,color,ogColor);
18    }
19}