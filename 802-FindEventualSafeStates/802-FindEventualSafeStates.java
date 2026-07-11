// Last updated: 11/07/2026, 09:31:15
1class Solution {
2    public List<Integer> eventualSafeNodes(int[][] graph) {
3        List<List<Integer>> adj=new ArrayList<>();
4        int n=graph.length;
5        for(int i=0;i<n;i++)    adj.add(new ArrayList<>());
6        int[] outdeg=new int[n];
7        for(int i=0;i<n;i++){
8            for(int nei:graph[i]){
9                adj.get(nei).add(i);
10                outdeg[i]++;
11            }
12        }
13        Queue<Integer> q=new LinkedList<>();
14        for(int i=0;i<n;i++){
15            if(outdeg[i]==0){
16                q.add(i);
17            }
18        }
19        List<Integer> res=new ArrayList<>();
20        while(!q.isEmpty()){
21            int curr=q.poll();
22            res.add(curr);
23            for(int nei:adj.get(curr)){
24                outdeg[nei]--;
25                if(outdeg[nei]==0){
26                    q.add(nei);
27                }
28            }
29        }
30        Collections.sort(res);
31        return res;
32    }
33}