// Last updated: 04/06/2026, 11:11:48
class Solution {
    public int countPaths(int n, int[][] roads) {  
        List<List<int[]>> adj = new ArrayList<>();
        for(int i = 0; i < n; i++) adj.add(new ArrayList<>());
        for(int[] edge : roads){
            int u = edge[0];
            int v = edge[1];
            int cost = edge[2];
            adj.get(u).add(new int[]{v, cost});
            adj.get(v).add(new int[]{u, cost});
        }
        long[] dist = new long[n]; 
        Arrays.fill(dist, Long.MAX_VALUE);
        dist[0] = 0;
        int[] ways = new int[n];
        ways[0] = 1;
        int mod = (int)(1e9 + 7);
        PriorityQueue<long[]> pq = new PriorityQueue<>((a,b) -> Long.compare(a[0], b[0]));
        pq.add(new long[]{0, 0}); // cost, node
        while(!pq.isEmpty()){
            long[] curr = pq.poll();
            long cost = curr[0];
            int node = (int)curr[1];
            if(dist[node] < cost) continue;
            for(int[] neighbor : adj.get(node)){
                int nei = neighbor[0];
                int neiCost = neighbor[1];
                if(cost + neiCost < dist[nei]){
                    dist[nei] = cost + neiCost;
                    ways[nei] = ways[node];
                    pq.add(new long[]{dist[nei], nei});
                }
                else if(cost + neiCost == dist[nei]){
                    ways[nei] = (ways[nei] + ways[node]) % mod;
                }
            }
        }

        return ways[n-1];
    }
}