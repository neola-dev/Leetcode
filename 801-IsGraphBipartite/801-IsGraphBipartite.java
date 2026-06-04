// Last updated: 04/06/2026, 11:14:29
class Solution {
    //a graph is not bipartite only if it has odd cycle remaining all graphs are bipartite
    //tc O(V+2E)
    public boolean isBipartite(int[][] graph) {
        List<List<Integer>> adj=new ArrayList<>();
        int n=graph.length;
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<graph[i].length;j++){
                adj.get(i).add(graph[i][j]);
            }
        }
        int[] colorArr=new int[n];
        Arrays.fill(colorArr,-1);
        for(int i=0;i<n;i++){
            if(colorArr[i]==-1){
                if(dfs(i,0,adj,colorArr)==false)    return false;
            }
        }
        return true;
    }
    public boolean dfs(int node,int color,List<List<Integer>> adj,int[] colorArr){
        colorArr[node]=color;
        for(int neigh:adj.get(node)){
            if(colorArr[neigh]==-1){
               if(dfs(neigh,1-color,adj,colorArr)==false)  return false;
            }   
            if(colorArr[neigh]==color) return false;
        }
        return true;
    }
}