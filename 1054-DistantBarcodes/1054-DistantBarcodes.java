// Last updated: 20/08/2026, 10:47:28
1class Solution {
2    public int[] rearrangeBarcodes(int[] barcodes) {
3        int n=barcodes.length;
4        int[] ans=new int[n];
5        HashMap<Integer,Integer> map=new HashMap<>();
6        for(int bc:barcodes){
7            map.put(bc,map.getOrDefault(bc,0)+1);
8        }
9        PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)->b[1]-a[1]);
10        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
11            pq.offer(new int[]{entry.getKey(),entry.getValue()});
12        }
13        int prev=-1;
14        for(int i=0;i<n;i++){
15            int[] curr=pq.poll();
16            if(prev==curr[0]){
17                int[] next=pq.poll();
18                ans[i]=next[0];
19                next[1]--;
20                if(next[1]>0) pq.offer(next);
21                pq.offer(curr);
22            }
23            else{
24                ans[i]=curr[0];
25                curr[1]--;
26                if(curr[1]>0) pq.offer(curr);
27            }
28            prev=ans[i];
29        }
30        return ans;
31    }
32}