// Last updated: 06/07/2026, 15:54:05
1class Solution {
2    public boolean canFinish(int numCourses, int[][] prerequisites) {
3        List<List<Integer>> adj=new ArrayList<>();
4        int n=numCourses;
5        for(int i=0;i<n;i++){
6            adj.add(new ArrayList<>());
7        }
8        Queue<Integer> q=new LinkedList<>();
9        int[] indeg=new int[n];
10        for(int[] prereq:prerequisites){
11            int course=prereq[0];
12            int pre=prereq[1];
13            adj.get(pre).add(course);
14            indeg[course]++;
15        }
16        for(int i=0;i<n;i++){
17            if(indeg[i]==0){
18                q.add(i);
19            }
20        }
21        ArrayList<Integer> res=new ArrayList<>();
22        while(!q.isEmpty()){
23            int course=q.poll();
24            res.add(course);
25            for(int nei:adj.get(course)){
26                indeg[nei]--;
27                if(indeg[nei]==0){
28                    q.add(nei);
29                }
30            }
31        }
32        return res.size()==n;
33    }
34}