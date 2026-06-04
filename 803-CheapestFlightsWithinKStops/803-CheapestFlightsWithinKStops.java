// Last updated: 04/06/2026, 11:14:28
class Solution {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        //T.C---O(E) no of flights
        List<List<int[]>> adj=new ArrayList<>();
        for(int i=0;i<n;i++) adj.add(new ArrayList<>());
        for(int[] arr:flights){
            int u=arr[0];
            int v=arr[1];
            int cost=arr[2];
            adj.get(u).add(new int[]{v,cost});
        }
        int[] dist=new int[n];
        Arrays.fill(dist,Integer.MAX_VALUE);
        dist[src]=0;
        Queue<int[]> q=new LinkedList<>();
        q.add(new int[]{0,src,0}); //steps,src,cost
        while(!q.isEmpty()){
            int[] curr=q.poll();
            int steps=curr[0];
            int node=curr[1];
            int cost=curr[2];
            if(steps>k) continue;
            for(int[] neighbor:adj.get(node)){
                int nei=neighbor[0];
                int neiCost=neighbor[1];
                if(neiCost+cost<dist[nei] && steps<=k){
                    dist[nei]=neiCost+cost;
                    q.add(new int[]{steps+1,nei,dist[nei]});
                }
            }
        }
        return dist[dst]==Integer.MAX_VALUE?-1:dist[dst];
    }
}