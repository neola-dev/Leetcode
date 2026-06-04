// Last updated: 04/06/2026, 11:17:54
class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        int n=numCourses;
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        for(int i=0;i<numCourses;i++){
            adj.add(new ArrayList<>());
        }
        int[] indegree=new int[n];
        for(int[] arr:prerequisites){
            int course=arr[1];
            int prereq=arr[0];
            adj.get(prereq).add(course);
            indegree[course]++;
        }
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<n;i++){
            if(indegree[i]==0){
                q.add(i);
            }
        }
        ArrayList<Integer> al=new ArrayList<>();
        int i=0;
        while(!q.isEmpty()){
            int course=q.poll();
            al.add(course);
            for(int nei:adj.get(course)){
                indegree[nei]--;
                if(indegree[nei]==0){
                    q.add(nei);
                }
            }
        }
        return al.size()==n;
    }
}