// Last updated: 03/09/2026, 10:34:50
1class Solution {
2    public int[] loudAndRich(int[][] richer, int[] quiet) {
3        List<List<Integer>> adj=new ArrayList<>();
4        int n=quiet.length;
5        for(int i=0;i<n;i++){
6            adj.add(new ArrayList<>());
7        }
8        for(int[] rich:richer){
9            int u=rich[0];
10            int v=rich[1];
11            adj.get(v).add(u);
12        }
13        int[] ans=new int[n];
14        Arrays.fill(ans,-1);
15        for(int i=0;i<n;i++){
16            ans[i]=dfs(i,adj,ans,quiet);
17        }
18        return ans;
19    }
20    public int dfs(int node,List<List<Integer>> adj,int[] ans,int[] quiet){
21        if(ans[node]!=-1){
22            return ans[node];
23        }
24        int qui=node;
25        for(int nei:adj.get(node)){
26            int person=dfs(nei,adj,ans,quiet);
27            if(quiet[person]<quiet[qui]){
28                qui=person;
29            }
30        }
31        ans[node]=qui;
32        return qui;
33    }
34}