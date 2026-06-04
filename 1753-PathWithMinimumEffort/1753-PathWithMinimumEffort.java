// Last updated: 04/06/2026, 11:12:17
class Solution {
    public int minimumEffortPath(int[][] heights) {
        int n=heights.length;
        int m=heights[0].length;
        int[][] dist=new int[n][m];
        for(int i=0;i<n;i++){
            Arrays.fill(dist[i],Integer.MAX_VALUE);
        }
        dist[0][0]=0;
        PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)->a[0]-b[0]);
        pq.add(new int[]{0,0,0});
        int[] delRow={-1,0,0,1};
        int[] delCol={0,-1,1,0};
        while(!pq.isEmpty()){
            int[] curr=pq.poll();
            int distance=curr[0];
            int row=curr[1];
            int col=curr[2];
            if(row==n-1 && col==m-1)    return distance;
            for(int i=0;i<4;i++){
                int nr=row+delRow[i];
                int nc=col+delCol[i];
                if(nr>=0 && nr<n && nc>=0 && nc<m){
                    int newEffort=Math.max(Math.abs(heights[row][col]-heights[nr][nc]),distance);
                    if(newEffort<dist[nr][nc]){
                        dist[nr][nc]=newEffort;
                        pq.add(new int[]{newEffort,nr,nc});
                    }
                }
            }
        }
        return 0;
    }
}