// Last updated: 07/09/2026, 14:10:00
1class Solution {
2    public int shortestPathBinaryMatrix(int[][] grid) {
3        int n=grid.length;
4        if(grid[0][0]==1 || grid[n-1][n-1]==1) return -1;
5        int[][] dist=new int[n][n];
6        for(int i=0;i<n;i++){
7            Arrays.fill(dist[i],Integer.MAX_VALUE);
8        }
9        Queue<int[]> q=new LinkedList<>();
10        q.add(new int[]{1,0,0});
11        dist[0][0]=1;
12        int[] dir={-1,1,0,0,-1,-1,1,1};
13        int[] dic={0,0,-1,1,-1,1,-1,1};
14        while(!q.isEmpty()){
15            int[] curr=q.poll();
16            int d=curr[0];
17            int r=curr[1];
18            int c=curr[2];
19            if(r==n-1 && c==n-1) return d;
20            for(int i=0;i<8;i++){
21                int nr=r+dir[i];
22                int nc=c+dic[i];
23                if(nr>=0 && nc>=0 && nr<n && nc<n && grid[nr][nc]==0 && d+1<dist[nr][nc]){
24                    dist[nr][nc]=d+1;
25                    q.add(new int[]{dist[nr][nc],nr,nc});
26                }
27            }
28        }
29        return dist[n-1][n-1]==Integer.MAX_VALUE?-1:dist[n-1][n-1];
30    }
31}