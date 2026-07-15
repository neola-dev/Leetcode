// Last updated: 15/07/2026, 09:46:10
1class Solution {
2    public int findTheCity(int n, int[][] edges, int distanceThreshold) {
3        int[][] dist=new int[n][n];
4        for(int i=0;i<n;i++){
5            for(int j=0;j<n;j++){
6                dist[i][j]=Integer.MAX_VALUE;
7                if(i==j) dist[i][j]=0;
8            }
9        }
10        for(int[] edge:edges){
11            int u=edge[0];
12            int v=edge[1];
13            int cost=edge[2];
14            dist[u][v]=cost;
15            dist[v][u]=cost;
16        }
17        for(int via=0;via<n;via++){
18            for(int i=0;i<n;i++){
19                for(int j=0;j<n;j++){
20                    if(dist[i][via]==Integer.MAX_VALUE || dist[via][j]==Integer.MAX_VALUE) continue;
21                    dist[i][j]=Math.min(dist[i][j],dist[i][via]+dist[via][j]);
22                }
23            }
24        }
25        int cntMin=n+1;
26        int res=-1;
27        for(int i=0;i<n;i++){
28            int cnt=0;
29            for(int j=0;j<n;j++){
30                if(dist[i][j]<=distanceThreshold){
31                    cnt++;
32                }
33            }
34            if(cnt<=cntMin){
35                cntMin=cnt;
36                res=i;
37            }
38        }
39        return res;
40    }
41}