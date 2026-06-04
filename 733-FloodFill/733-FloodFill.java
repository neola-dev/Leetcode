// Last updated: 04/06/2026, 11:14:49
class Solution {
    //time complexity O(n*m) if all the cells are in  ogcolor 
    //we will not consider 4 directions even if have rec calls since we return when
    // 1.we see that cell is already colored , 2.if the cell is not ogcolor 3.out of bounds
    //so n^4 will not come as tc
    public void backtrack(int[][] image,int sr,int sc,int n,int m,int color,int ogColor){
        if(sr<0 || sc<0 || sr>=n || sc>=m || image[sr][sc]==color || image[sr][sc]!=ogColor)  return;
        if(image[sr][sc]==ogColor)    image[sr][sc]=color;
        backtrack(image,sr-1,sc,n,m,color,ogColor);
        backtrack(image,sr+1,sc,n,m,color,ogColor);
        backtrack(image,sr,sc-1,n,m,color,ogColor);
        backtrack(image,sr,sc+1,n,m,color,ogColor);
    }
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if(image[sr][sc]==color){
            return image;
        }
        int n=image.length;
        int m=image[0].length;
        backtrack(image,sr,sc,n,m,color,image[sr][sc]);
        return image;
    }
}