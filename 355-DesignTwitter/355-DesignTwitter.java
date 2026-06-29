// Last updated: 29/06/2026, 14:14:59
1class Twitter {
2    int time;
3    HashMap<Integer,List<int[]>> tweetMap;
4    HashMap<Integer,Set<Integer>> followMap;
5    public Twitter() {
6        tweetMap=new HashMap<>();
7        followMap=new HashMap<>();
8        time=0;
9    }
10    
11    public void postTweet(int userId, int tweetId) {
12        if(!tweetMap.containsKey(userId)){
13            tweetMap.put(userId,new ArrayList<>());
14        }
15        tweetMap.get(userId).add(new int[]{time++,tweetId});
16    }
17    
18    public List<Integer> getNewsFeed(int userId) {
19        PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)->a[0]-b[0]);
20        if(tweetMap.containsKey(userId)){
21            for(int[] tweet:tweetMap.get(userId)){
22                pq.add(tweet);
23                if(pq.size()>10){
24                    pq.poll();
25                }
26            }
27        }
28        if(followMap.get(userId)!=null){
29            for(int followee:followMap.get(userId)){
30                if(tweetMap.containsKey(followee)){
31                    for(int[] tweet:tweetMap.get(followee)){
32                        pq.add(tweet);
33                        if(pq.size()>10){
34                            pq.poll();
35                        }
36                    }
37                }
38            }
39        }
40        List<Integer> res=new ArrayList<>();
41        while(!pq.isEmpty()){
42            res.addFirst(pq.poll()[1]);
43        }
44        return res;
45    }
46    
47    public void follow(int followerId, int followeeId) {
48        if(!followMap.containsKey(followerId)){
49            followMap.put(followerId,new HashSet<>());
50        }
51        followMap.get(followerId).add(followeeId);
52    }
53    
54    public void unfollow(int followerId, int followeeId) {
55        if(followMap.containsKey(followerId)){
56            followMap.get(followerId).remove(followeeId);
57        }
58    }
59}
60
61/**
62 * Your Twitter object will be instantiated and called as such:
63 * Twitter obj = new Twitter();
64 * obj.postTweet(userId,tweetId);
65 * List<Integer> param_2 = obj.getNewsFeed(userId);
66 * obj.follow(followerId,followeeId);
67 * obj.unfollow(followerId,followeeId);
68 */