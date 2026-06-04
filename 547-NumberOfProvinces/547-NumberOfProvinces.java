// Last updated: 04/06/2026, 11:15:34
class Solution {
    public int findCircleNum(int[][] isConnected) {
        List<List<Integer>> adj=new ArrayList<>();
        int n=isConnected.length;
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(isConnected[i][j]==1){
                    adj.get(i).add(j);
                }
            }
        }
        boolean[] vis=new boolean[n];
        int cnt=0;
        for(int i=0;i<n;i++){
            if(!vis[i]){
                cnt++;
                dfs(i,adj,vis);
            }
        }
        return cnt;
    }
    public void dfs(int node,List<List<Integer>> adj,boolean[] vis){
        vis[node]=true;
        for(int nei:adj.get(node)){
            if(!vis[nei]){
                dfs(nei,adj,vis);
            }
        }
    }
}