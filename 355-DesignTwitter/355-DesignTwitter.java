// Last updated: 29/06/2026, 13:41:20
1class Twitter {
2    int time;
3    private Map<Integer,List<int[]>> tweetMap;
4    private Map<Integer,Set<Integer>> followMap;
5    public Twitter() {
6        tweetMap=new HashMap<>();
7        followMap=new HashMap<>();
8        time=0;
9    }
10    
11    public void postTweet(int userId, int tweetId) {
12        if(!tweetMap.containsKey(userId))   tweetMap.put(userId,new ArrayList<>());
13        tweetMap.get(userId).add(new int[]{time++,tweetId});
14    }
15    
16    public List<Integer> getNewsFeed(int userId) {
17        PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)->a[0]-b[0]);
18        if(tweetMap.containsKey(userId)){
19            for(int[] tweet:tweetMap.get(userId)){
20                pq.add(tweet);
21                if(pq.size()>10){
22                    pq.poll();
23                }
24            }
25        }
26        if(followMap.containsKey(userId)){
27            for(int followee:followMap.get(userId)){
28                if(tweetMap.containsKey(followee)){
29                    for(int[] tweet:tweetMap.get(followee)){
30                        pq.add(tweet);
31                        if(pq.size()>10){
32                            pq.poll();
33                        }
34                    }
35                }
36            }
37        }
38        List<Integer> res=new ArrayList<>();
39        while(!pq.isEmpty()){
40            res.addFirst(pq.poll()[1]);
41        }
42        return res;
43    }
44    
45    public void follow(int followerId, int followeeId) {
46        followMap.putIfAbsent(followerId,new HashSet<>());
47        followMap.get(followerId).add(followeeId);
48    }
49    
50    public void unfollow(int followerId, int followeeId) {
51        if(followMap.containsKey(followerId)){
52            followMap.get(followerId).remove(followeeId);
53        }
54    }
55}
56
57/**
58 * Your Twitter object will be instantiated and called as such:
59 * Twitter obj = new Twitter();
60 * obj.postTweet(userId,tweetId);
61 * List<Integer> param_2 = obj.getNewsFeed(userId);
62 * obj.follow(followerId,followeeId);
63 * obj.unfollow(followerId,followeeId);
64 */