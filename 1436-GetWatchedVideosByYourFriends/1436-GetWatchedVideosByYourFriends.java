// Last updated: 04/06/2026, 11:12:51
class Solution {
    public List<String> watchedVideosByFriends(List<List<String>> watchedVideos, int[][] friends, int id, int level) {
        int n=friends.length;
        boolean[] vis=new boolean[n];
        Queue<Integer> q=new LinkedList<>();
        q.add(id);
        vis[id]=true;
        int currLevel=0;
        while(!q.isEmpty() && currLevel<level){
            int size=q.size();
            for(int i=0;i<size;i++){
                int person=q.poll();
                for(int friend:friends[person]){
                    if(!vis[friend]){
                        vis[friend]=true;
                        q.add(friend);
                    }
                }
            }    
            currLevel++;
        }
        HashMap<String,Integer> freq=new HashMap<>();
        while(!q.isEmpty()){
            int pers=q.poll();
            for(String videos:watchedVideos.get(pers)){
                freq.put(videos,freq.getOrDefault(videos,0)+1);
            }
        }
        List<String> res=new ArrayList<>(freq.keySet());
        Collections.sort(res,(a,b)->{
            if(!freq.get(a).equals(freq.get(b))){
                return freq.get(a)-freq.get(b);
            }
            return a.compareTo(b);
        });
        return res;
    }
}