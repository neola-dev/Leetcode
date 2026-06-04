// Last updated: 04/06/2026, 11:11:47
class Solution {
    HashMap<Integer,List<Integer>> map;
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        map=new HashMap<>();
        for(int i=0;i<edges.length;i++){
            int u=edges[i][0];
            int v=edges[i][1];
            map.putIfAbsent(u,new ArrayList<>());
            map.putIfAbsent(v,new ArrayList<>());
            map.get(u).add(v);
            map.get(v).add(u);
        }
        boolean[] vis=new boolean[n];
        return dfs(source,destination,vis);
    }
    public  boolean dfs(int source,int destination,boolean[] vis){
        vis[source]=true;
        if(source==destination) return true;
        for(int i:map.get(source)){
            if(vis[i]==false){
                if(dfs(i,destination,vis)) return true;
                vis[i]=true;
            }
        }
        return false;
    }
}