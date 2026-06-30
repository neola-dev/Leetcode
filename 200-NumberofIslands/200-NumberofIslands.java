// Last updated: 30/06/2026, 12:16:27
1class Solution {
2    public int[][] updateMatrix(int[][] mat) {
3        int n=mat.length;
4        int m=mat[0].length;
5        int[][] vis=new int[n][m];
6        int[][] dist=new int[n][m];
7        Queue<int[]> q=new LinkedList<>();
8        for(int i=0;i<n;i++){
9            for(int j=0;j<m;j++){
10                if(mat[i][j]==0){
11                    q.add(new int[]{i,j,0});
12                    vis[i][j]=1;
13                }
14                else{
15                    vis[i][j]=0;
16                }
17            }
18        }
19        int[] dir={-1,1,0,0};
20        int[] dic={0,0,-1,1};
21        while(!q.isEmpty()){
22            int size=q.size();
23            int[] curr=q.poll();
24            int r=curr[0];
25            int c=curr[1];
26            int steps=curr[2];
27            dist[r][c]=steps;
28                for(int j=0;j<4;j++){
29                    int nr=r+dir[j];
30                    int nc=c+dic[j];
31                    if(nr>=0 && nc>=0 && nr<n && nc<m && vis[nr][nc]==0){
32                        q.add(new int[]{nr,nc,steps+1});
33                        vis[nr][nc]=1;
34                    }
35                }
36        }
37        return dist;
38    }
39}