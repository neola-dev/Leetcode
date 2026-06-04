// Last updated: 04/06/2026, 11:11:27
class Solution {
    public long countPairs(int n, int[][] edges) {
        List<List<Integer>> ls=new ArrayList<>();
        for(int i=0;i<n;i++){
            ls.add(new ArrayList<>());
        }
        for(int i=0;i<edges.length;i++){
            ls.get(edges[i][0]).add(edges[i][1]);
            ls.get(edges[i][1]).add(edges[i][0]);
        }
        long rem=n,sum=0;
        boolean[] vis=new boolean[n];
        for(int i=0;i<n;i++){
            if(!vis[i]){
                int l=dfs(i,vis,ls);
                rem=rem-l;
                sum=sum+rem*l;
            }
        }
        return sum;
    }
    public int dfs(int start,boolean[] vis,List<List<Integer>> ls){
        vis[start]=true;
        int cnt=1;
        for(int neighbor:ls.get(start)){
            if(!vis[neighbor]){
                cnt=cnt+dfs(neighbor,vis,ls);
            }
        }
        return cnt;
    }
}