// Last updated: 13/07/2026, 12:31:02
1class Solution {
2    public int shortestPathBinaryMatrix(int[][] grid) {
3        int n=grid.length;
4        if(grid[0][0]==1 || grid[n-1][n-1]==1) return -1;
5        int[][] dist=new int[n][n];
6        for(int i=0;i<n;i++) Arrays.fill(dist[i],Integer.MAX_VALUE);
7        dist[0][0]=1;
8        Queue<int[]> q=new LinkedList<>();
9        q.add(new int[]{1,0,0}); //distance,row,col
10        int[] dRow={-1,1,0,0,-1,-1,1,1};
11        int[] dCol={0,0,-1,1,-1,1,-1,1};
12        while(!q.isEmpty()){
13            int[] curr=q.poll();
14            int d=curr[0];
15            int r=curr[1];
16            int c=curr[2];
17            if(r==n-1 && c==n-1) return d;
18            for(int i=0;i<8;i++){
19                int nr=r+dRow[i];
20                int nc=c+dCol[i];
21                if(nr>=0 && nc>=0  && nr<n && nc<n && grid[nr][nc]==0 && d+1<dist[nr][nc]){
22                    dist[nr][nc]=d+1;
23                    q.add(new int[]{dist[nr][nc],nr,nc});
24                }
25            }
26        }
27        return dist[n-1][n-1]==Integer.MAX_VALUE?-1:dist[n-1][n-1];
28    }
29}