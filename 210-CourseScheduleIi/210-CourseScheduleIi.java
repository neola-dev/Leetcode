// Last updated: 04/06/2026, 11:17:50
class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        int n=numCourses;
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        for(int i=0;i<numCourses;i++){
            adj.add(new ArrayList<>());
        }
        int[] indegree=new int[n];
        for(int[] arr:prerequisites){
            int course=arr[0];
            int prereq=arr[1];
            adj.get(prereq).add(course);
            indegree[course]++;
        }
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<n;i++){
            if(indegree[i]==0){
                q.add(i);
            }
        }
        int[] topo=new int[n];
        int i=0;
        while(!q.isEmpty()){
            int course=q.poll();
            topo[i++]=course;
            for(int nei:adj.get(course)){
                indegree[nei]--;
                if(indegree[nei]==0){
                    q.add(nei);
                }
            }
        }
        if(i==n)    return topo;
        return new int[]{};
    }
}