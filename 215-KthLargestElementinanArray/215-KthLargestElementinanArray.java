// Last updated: 29/06/2026, 10:18:06
1class Solution {
2    public int[][] kClosest(int[][] points, int k) {
3        PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)->(b[0]*b[0]+b[1]*b[1])-(a[0]*a[0]+a[1]*a[1]));
4        for(int[] p:points){
5            pq.add(p);
6            if(pq.size()>k){
7                pq.poll();
8            }
9        }
10        int[][] arr=new int[k][2];
11        for(int i=0;i<k;i++){
12            arr[i]=pq.poll();
13        }
14        return arr;
15    }
16}