// Last updated: 04/06/2026, 11:13:40
class Solution {
    public int orangesRotting(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int fresh=0;
        Queue<int[]> q=new LinkedList<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==2){
                    q.add(new int[]{i,j});
                }
                else if(grid[i][j]==1){
                    fresh++;
                }
            }
        }
        int[] dirRow={1,0,0,-1};
        int[] dirCol={0,-1,1,0};
        int time=0;
        while(!q.isEmpty() && fresh>0){
            int size=q.size();
            for(int i=0;i<size;i++){
                int[] curr=q.poll();
                int r=curr[0];
                int c=curr[1];
                for(int j=0;j<4;j++){
                    int nr=r+dirRow[j];
                    int nc=c+dirCol[j];
                    if(nr>=0 && nr<n && nc>=0 && nc<m && grid[nr][nc]==1){
                        grid[nr][nc]=2;//don't forget to mark it rotten else we'get wrong ans
                        q.add(new int[]{nr,nc});
                        fresh--;
                    }
                }
            }
            time++;
        }
        if(fresh!=0)    return -1;
        return time;
    }
}