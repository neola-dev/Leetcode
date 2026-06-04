// Last updated: 04/06/2026, 11:13:05
class Solution {
    int timer=1;
    public void dfs(int node,int parent,List<List<Integer>> adj,boolean[] vis,int[] time,int[] low,List<List<Integer>> bridges){
        vis[node]=true;
        low[node]=time[node]=timer++;
        for(int nei:adj.get(node)){
            if(nei==parent) continue;
            if(!vis[nei]){
                dfs(nei,node,adj,vis,time,low,bridges);
                low[node]=Math.min(low[node],low[nei]);
                if(low[nei]>time[node]){
                    bridges.add(Arrays.asList(nei,node));
                }
            }
            else{
                low[node]=Math.min(low[node],time[nei]);
            }
        }
    }
    public List<List<Integer>> criticalConnections(int n, List<List<Integer>> connections) {
        List<List<Integer>> adj=new ArrayList<>();
        for(int i=0;i<n;i++)    adj.add(new ArrayList<>());
        for(List<Integer> edges:connections){
            int u=edges.get(0);
            int v=edges.get(1);
            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        int[] time=new int[n];
        int[] low=new int[n];
        boolean[] vis=new boolean[n];
        List<List<Integer>> bridges=new ArrayList<>();
        dfs(0,-1,adj,vis,time,low,bridges); // node,parent,adj list,vis arr,time arr,low arr
        return bridges;
    }
}