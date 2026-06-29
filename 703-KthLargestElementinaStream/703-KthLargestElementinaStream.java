// Last updated: 29/06/2026, 11:55:32
1class KthLargest {
2    PriorityQueue<Integer> pq;
3    int k;
4    public KthLargest(int k, int[] nums) {
5        pq=new PriorityQueue<>();
6        this.k=k;
7        for(int num:nums){
8            pq.add(num);
9            if(pq.size()>k){
10                pq.poll();
11            }
12        }
13    }
14    
15    public int add(int val) {
16        pq.add(val);
17        if(pq.size()>k){
18            pq.poll();
19        }
20        return pq.peek();
21    }
22}
23
24/**
25 * Your KthLargest object will be instantiated and called as such:
26 * KthLargest obj = new KthLargest(k, nums);
27 * int param_1 = obj.add(val);
28 */