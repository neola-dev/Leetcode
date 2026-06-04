// Last updated: 04/06/2026, 11:13:31
class Solution {
    public int numEnclaves(int[][] grid) {
       int cnt=0;
       int n=grid.length;
       int m=grid[0].length;
       for(int i=0;i<n;i++){
         if(grid[i][0]==1)   bfs(grid,i,0); 
         if(grid[i][m-1]==1)    bfs(grid,i,m-1);
       } 
       for(int j=0;j<m;j++){
        if(grid[0][j]==1)   bfs(grid,0,j);
        if(grid[n-1][j]==1) bfs(grid,n-1,j);
       }
       for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1)   cnt++;
            }
       }
       return cnt;
    }
    public void bfs(int[][] grid,int r,int c){
        int n=grid.length;
        int m=grid[0].length;
        Queue<int[]> q=new LinkedList<>();
        q.add(new int[]{r,c});
        grid[r][c]=0;
        int[] dr={-1,0,0,1};
        int[] dc={0,-1,1,0};
        while(!q.isEmpty()){
            int[] cell=q.poll();
            int row=cell[0];
            int col=cell[1];
            for(int i=0;i<4;i++){
                int nr=row+dr[i];
                int nc=col+dc[i];
                if(nr>=0 && nr<n && nc>=0 && nc<m && grid[nr][nc]==1){
                    grid[nr][nc]=0;
                    q.add(new int[]{nr,nc});
                }
            }
        }
    }
}