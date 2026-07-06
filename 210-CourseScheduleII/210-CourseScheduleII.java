// Last updated: 06/07/2026, 15:54:29
1class Solution {
2    public int[] findOrder(int numCourses, int[][] prerequisites) {
3        int n=numCourses;
4        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
5        for(int i=0;i<numCourses;i++){
6            adj.add(new ArrayList<>());
7        }
8        int[] indegree=new int[n];
9        for(int[] arr:prerequisites){
10            int course=arr[0];
11            int prereq=arr[1];
12            adj.get(prereq).add(course);
13            indegree[course]++;
14        }
15        Queue<Integer> q=new LinkedList<>();
16        for(int i=0;i<n;i++){
17            if(indegree[i]==0){
18                q.add(i);
19            }
20        }
21        int[] topo=new int[n];
22        int i=0;
23        while(!q.isEmpty()){
24            int course=q.poll();
25            topo[i++]=course;
26            for(int nei:adj.get(course)){
27                indegree[nei]--;
28                if(indegree[nei]==0){
29                    q.add(nei);
30                }
31            }
32        }
33        if(i==n)    return topo;
34        return new int[]{};
35    }
36}