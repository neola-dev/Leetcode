// Last updated: 04/06/2026, 11:16:38
class Twitter {
    int time;
    private Map<Integer,List<int[]>> tweetMap;
    private Map<Integer,Set<Integer>> followMap;
    public Twitter() {
        tweetMap=new HashMap<>();
        followMap=new HashMap<>();
        time=0;
    }
    
    public void postTweet(int userId, int tweetId) {
        if(!tweetMap.containsKey(userId))   tweetMap.put(userId,new ArrayList<>());
        tweetMap.get(userId).add(new int[]{time++,tweetId});
    }
    
    public List<Integer> getNewsFeed(int userId) {
        PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)->a[0]-b[0]);
        if(tweetMap.containsKey(userId)){
            for(int[] tweet:tweetMap.get(userId)){
                pq.add(tweet);
                if(pq.size()>10){
                    pq.poll();
                }
            }
        }
        if(followMap.containsKey(userId)){
            for(int followee:followMap.get(userId)){
                if(tweetMap.containsKey(followee)){
                    for(int[] tweet:tweetMap.get(followee)){
                        pq.add(tweet);
                        if(pq.size()>10){
                            pq.poll();
                        }
                    }
                }
            }
        }
        List<Integer> res=new ArrayList<>();
        while(!pq.isEmpty()){
            res.addFirst(pq.poll()[1]);
        }
        return res;
    }
    
    public void follow(int followerId, int followeeId) {
        followMap.putIfAbsent(followerId,new HashSet<>());
        followMap.get(followerId).add(followeeId);
    }
    
    public void unfollow(int followerId, int followeeId) {
        if(followMap.containsKey(followerId)){
            followMap.get(followerId).remove(followeeId);
        }
    }
}

/**
 * Your Twitter object will be instantiated and called as such:
 * Twitter obj = new Twitter();
 * obj.postTweet(userId,tweetId);
 * List<Integer> param_2 = obj.getNewsFeed(userId);
 * obj.follow(followerId,followeeId);
 * obj.unfollow(followerId,followeeId);
 */