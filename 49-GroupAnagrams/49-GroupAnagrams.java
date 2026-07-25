// Last updated: 25/07/2026, 11:47:42
1class Solution {
2    public int minEatingSpeed(int[] piles, int h) {
3        long min=Integer.MAX_VALUE;
4        long max=Integer.MIN_VALUE;
5        for(int i=0;i<piles.length;i++){
6            min=Math.min(min,piles[i]);
7            max=Math.max(max,piles[i]);
8        }
9        long low=1;
10        long high=max;
11        while(low<=high){
12            long mid=(low+high)/2;
13            int hours=0;
14            for(int i=0;i<piles.length;i++){
15                hours+=Math.ceil((double)piles[i]/mid);
16            }
17            System.out.println(mid+" "+hours);
18            if(hours<=h){
19                high=mid-1;
20            }
21            else{
22                low=mid+1;
23            }
24        }
25        return (int)low;
26    }
27}