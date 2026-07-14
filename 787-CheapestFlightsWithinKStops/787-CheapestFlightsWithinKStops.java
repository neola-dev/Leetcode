// Last updated: 14/07/2026, 19:30:43
1class Solution {
2    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
3        List<List<int[]>> adj=new ArrayList<>();
4        for(int i=0;i<n;i++) adj.add(new ArrayList<>());
5        for(int[] flight:flights){
6            int u=flight[0];
7            int v=flight[1];
8            int cost=flight[2];
9            adj.get(u).add(new int[]{v,cost});
10        }
11        int[] dist=new int[n];
12        Arrays.fill(dist,Integer.MAX_VALUE);
13        dist[src]=0;
14        PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)->a[0]-b[0]);
15        pq.add(new int[]{0,src,0}); 
16        while(!pq.isEmpty()){
17            int[] curr=pq.poll();
18            int steps=curr[0];
19            int node=curr[1];
20            int cst=curr[2];
21            if(steps>k) continue;
22            for(int[] nei:adj.get(node)){
23                int neigh=nei[0];
24                int nei_cost=nei[1];
25                if(cst+nei_cost<dist[neigh] && steps<=k){
26                    dist[neigh]=cst+nei_cost;
27                    pq.add(new int[]{steps+1,neigh,dist[neigh]});
28                }
29            }
30        }
31        return dist[dst]==Integer.MAX_VALUE?-1:dist[dst];
32    }
33}