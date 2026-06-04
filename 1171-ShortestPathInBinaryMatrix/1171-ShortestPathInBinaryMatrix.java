// Last updated: 04/06/2026, 11:13:17
class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        if(grid[0][0]==1 || grid[n-1][m-1]==1)  return -1;
        int[][] dist=new int[n][m];
        for(int i=0;i<n;i++){
            Arrays.fill(dist[i],Integer.MAX_VALUE);
        }
        dist[0][0]=1;
        Queue<int[]> q=new LinkedList<>();
        q.add(new int[]{1,0,0}); //dist,row,col
        int[] delRow={-1,0,0,1,-1,-1,1,1};
        int[] delCol={0,1,-1,0,-1,1,-1,1};
        while(!q.isEmpty()){
            int[] curr=q.poll();
            int distance=curr[0];
            int r=curr[1];
            int c=curr[2];
            if(r == n-1 && c == m-1) return distance;
            for(int i=0;i<8;i++){
                int nr=r+delRow[i];
                int nc=c+delCol[i];
                if(nr>=0 && nr<n && nc>=0 && nc<m && grid[nr][nc]==0 && distance+1<dist[nr][nc]){           dist[nr][nc]=distance+1;
                 q.add(new int[]{dist[nr][nc],nr,nc});  
                }
            }
        }
        return dist[n-1][m-1]==Integer.MAX_VALUE?-1:dist[n-1][m-1];
    }
}