// Last updated: 30/06/2026, 18:19:03
1class Solution {
2    public int numEnclaves(int[][] grid) {
3        int n=grid.length;
4        int m=grid[0].length;
5        for(int i=0;i<n;i++){
6            if(grid[i][0]==1)  bfs(i,0,grid);
7            if(grid[i][m-1]==1) bfs(i,m-1,grid);
8        }
9        for(int j=0;j<m;j++){
10            if(grid[0][j]==1)   bfs(0,j,grid);
11            if(grid[n-1][j]==1) bfs(n-1,j,grid);
12        }
13        int cnt=0;
14        for(int i=0;i<n;i++){
15            for(int j=0;j<m;j++){
16                if(grid[i][j]==1){
17                    cnt++;
18                }
19            }
20        }
21        return cnt;
22    }
23    public void bfs(int i,int j,int[][] grid){
24        Queue<int[]> q=new LinkedList<>();
25        q.add(new int[]{i,j});
26        grid[i][j]=0;
27        int[] dir={1,-1,0,0};
28        int[] dic={0,0,-1,1};
29        while(!q.isEmpty()){
30                int[] curr=q.poll();
31                int r=curr[0];
32                int c=curr[1];
33                for(int l=0;l<4;l++){
34                    int nr=r+dir[l];
35                    int nc=c+dic[l];
36                    if(nr>=0 && nc>=0 && nr<grid.length && nc<grid[0].length && grid[nr][nc]==1){
37                        q.add(new int[]{nr,nc});
38                        grid[nr][nc]=0;
39                    }
40                }
41        }
42    }
43}