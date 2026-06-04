// Last updated: 04/06/2026, 11:14:25
class Solution {
    List<List<Integer>> res=new ArrayList<>();
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        int n=graph.length;
        List<Integer> path=new ArrayList<>();
        int dest=n-1;
        dfs(0,dest,graph,path);
        return res;
    }
    public void dfs(int src,int dest,int[][] graph,List<Integer> path){
        path.add(src);
        if(src==dest){
            res.add(new ArrayList<>(path));
        }
        else{
            for(int neighbor:graph[src]){
                dfs(neighbor,dest,graph,path);
            }
        }
        path.remove(path.size()-1);
    }
}