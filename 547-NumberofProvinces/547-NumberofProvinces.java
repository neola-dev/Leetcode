// Last updated: 30/06/2026, 10:00:31
1class Solution {
2    public int findCircleNum(int[][] isConnected) {
3        List<List<Integer>> adj=new ArrayList<>();
4        int n=isConnected.length;
5        for(int i=0;i<n;i++){
6            adj.add(new ArrayList<>());
7        }
8        for(int i=0;i<n;i++){
9            for(int j=0;j<n;j++){
10                if(isConnected[i][j]==1){
11                    adj.get(i).add(j);
12                }
13            }
14        }
15        boolean[] vis=new boolean[n];
16        int cnt=0;
17        for(int i=0;i<n;i++){
18            if(!vis[i]){
19                cnt++;
20                dfs(i,adj,vis);
21            }
22        }
23        return cnt;
24    }
25    public void dfs(int node,List<List<Integer>> adj,boolean[] vis){
26        vis[node]=true;
27        for(int nei:adj.get(node)){
28            if(!vis[nei]){
29                dfs(nei,adj,vis);
30            }
31        }
32    }
33}