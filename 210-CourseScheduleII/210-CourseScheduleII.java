// Last updated: 26/07/2026, 11:59:23
1class Solution {
2    public int[] findOrder(int numCourses, int[][] prerequisites) {
3        List<List<Integer>> adj=new ArrayList<>();
4        int n=numCourses;
5        for(int i=0;i<n;i++){
6            adj.add(new ArrayList<>());
7        }
8        int[] indeg=new int[n];
9        for(int[] preReq:prerequisites){
10            int course=preReq[0];
11            int pre=preReq[1];
12            adj.get(pre).add(course);
13            indeg[course]++;
14        }
15        Queue<Integer> q=new LinkedList<>();
16        for(int i=0;i<n;i++){
17            if(indeg[i]==0){
18                q.add(i);
19            }
20        }
21        List<Integer> topo=new ArrayList<>();
22        int[] ans=new int[n];
23        int i=0;
24        while(!q.isEmpty()){
25            int curr=q.poll();
26            topo.add(curr);
27            ans[i++]=curr;
28            for(int nei:adj.get(curr)){
29                indeg[nei]--;
30                if(indeg[nei]==0){
31                    q.add(nei);
32                }
33            }
34        }
35        return topo.size()==n?ans:new int[]{};
36    }
37}