// Last updated: 04/06/2026, 11:15:37
class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int n=mat.length;
        int m=mat[0].length;
        int[][] vis=new int[n][m];
        int[][] dist=new int[n][m];
        Queue<int[]> q=new LinkedList<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(mat[i][j]==0){
                    q.add(new int[]{i,j,0});
                    vis[i][j]=1;
                }
                else{
                    vis[i][j]=0;
                }
            }
        }
        int[] delRow={-1,0,0,1};
        int[] delCol={0,-1,1,0};
        while(!q.isEmpty()){
            int[] curr=q.poll();
            int row=curr[0];
            int col=curr[1];
            int steps=curr[2];
            dist[row][col]=steps;
            for(int i=0;i<4;i++){
                int nr=row+delRow[i];
                int nc=col+delCol[i];
                if(nr>=0 && nr<n && nc>=0 && nc<m && vis[nr][nc]==0){
                    vis[nr][nc]=1;
                    q.add(new int[]{nr,nc,steps+1});
                }
            }
        }
        return dist;
    }
}