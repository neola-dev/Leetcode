// Last updated: 04/06/2026, 11:14:23
class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        int n=graph.length;
        List<List<Integer>> adj=new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        int[] outdeg=new int[n];
        for(int i=0;i<n;i++){
            outdeg[i]=graph[i].length;
            for(int nei:graph[i]){
                adj.get(nei).add(i);
            }
        }
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<n;i++){
            if(outdeg[i]==0){
                q.add(i);
            }
        }
        ArrayList<Integer> res=new ArrayList<>();
        while(!q.isEmpty()){
            int curr=q.poll();
            res.add(curr);
            for(int neigh:adj.get(curr)){
                outdeg[neigh]--;
                if(outdeg[neigh]==0){
                    q.add(neigh);
                }
            }
        }
        Collections.sort(res);
        return res;
    }
}