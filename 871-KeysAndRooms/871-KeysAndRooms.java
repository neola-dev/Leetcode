// Last updated: 04/06/2026, 11:14:19
class Solution {
    boolean[] vis;
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        vis=new boolean[rooms.size()];
        dfs(0,rooms);
        for(boolean i:vis){
            if(!i){
                return false;
            }
        }
        return true;
    }
    public void dfs(int start,List<List<Integer>> rooms){
        vis[start]=true;
        for(int i:rooms.get(start)){
            if(vis[i]==false){
                dfs(i,rooms);
            }
        }
    }
}