// Last updated: 04/06/2026, 11:18:03
class Solution {
    public int numIslands(char[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int islandCnt=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]=='1'){
                    islandCnt++;
                    recursion(grid,i,j);
                }
            }
        }
        return islandCnt;
    }
    public void recursion(char[][] grid,int i,int j){
        if(i<0 || i>=grid.length || j<0 || j>=grid[0].length || grid[i][j]=='0'){
            return;
        }
        if(grid[i][j]=='1') grid[i][j]='0';
        recursion(grid,i-1,j);
        recursion(grid,i+1,j);
        recursion(grid,i,j-1);
        recursion(grid,i,j+1);
    }
}