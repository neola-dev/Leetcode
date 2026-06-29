// Last updated: 29/06/2026, 10:05:02
1class Solution {
2    public int[] topKFrequent(int[] nums, int k) {
3        HashMap<Integer,Integer> map=new HashMap<>();
4        for(int num:nums){
5            map.put(num,map.getOrDefault(num,0)+1);
6        }
7        PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->map.get(a)-map.get(b));
8        for(int key:map.keySet()){
9            pq.add(key);
10            if(pq.size()>k){
11                pq.poll();
12            }
13        }
14        int[] res=new int[k];
15        for(int i=0;i<k;i++){
16            res[i]=pq.poll();
17        }
18        return res;
19    }
20}