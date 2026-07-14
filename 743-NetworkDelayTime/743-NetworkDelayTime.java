// Last updated: 14/07/2026, 20:36:55
1class Solution {
2    public int networkDelayTime(int[][] times, int n, int k) {
3        List<List<int[]>> adj=new ArrayList<>();
4        for(int i=0;i<=n;i++){
5            adj.add(new ArrayList<>());
6        }
7        int[] res=new int[n+1];
8        Arrays.fill(res,Integer.MAX_VALUE);
9        res[k]=0;
10        for(int[] time:times){
11            int u=time[0];
12            int v=time[1];
13            int wgt=time[2];
14            adj.get(u).add(new int[]{v,wgt});
15        }
16        PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)->a[1]-b[1]);
17        pq.add(new int[]{k,0});
18        while(!pq.isEmpty()){
19            int[] curr=pq.poll();
20            int node=curr[0];
21            int time=curr[1];
22            if(res[node]<time)  continue;
23            for(int[] neigh:adj.get(node)){
24                int v=neigh[0];
25                int t=neigh[1];
26                if(res[node]!=Integer.MAX_VALUE && res[node]+t<res[v]){
27                    res[v]=res[node]+t;
28                    pq.add(new int[]{v,res[v]});
29                }
30            }
31        }
32        int max=Integer.MIN_VALUE;
33        for(int i=1;i<=n;i++){
34            if(res[i]==Integer.MAX_VALUE) return -1;
35            if(res[i]>max) max=res[i];
36        }
37        return max;
38    }
39}