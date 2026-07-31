// Last updated: 31/07/2026, 13:51:00
1class Solution {
2    public int eraseOverlapIntervals(int[][] intervals) {
3        Arrays.sort(intervals,(a,b)->a[1]-b[1]);
4        int cnt=0;
5        int prevEnd=intervals[0][1];
6        for(int i=1;i<intervals.length;i++){
7            if(intervals[i][0]<prevEnd){
8                cnt++;
9            }
10            else{
11                prevEnd=intervals[i][1];
12            }
13        }
14        return cnt;
15    }
16}