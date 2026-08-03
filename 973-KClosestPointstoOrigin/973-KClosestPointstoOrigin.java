// Last updated: 03/08/2026, 08:42:58
1class Solution {
2    public int[][] kClosest(int[][] points, int k) {
3        PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)->(b[0]*b[0]+b[1]*b[1])-(a[0]*a[0]+a[1]*a[1]));
4        for(int[] p:points){
5            pq.add(p);
6            if(pq.size()>k){
7                pq.poll();
8            }
9        }
10        int[][] res=new int[k][2];
11        for(int i=0;i<k;i++){
12            res[i]=pq.poll();
13        }
14        return res;
15    }
16}