// Last updated: 02/10/2026, 21:13:25
1class Solution {
2    public int eraseOverlapIntervals(int[][] intervals) {
3        Arrays.sort(intervals,(a,b)->a[1]-b[1]);
4        for(int[] inter:intervals){
5            System.out.println(inter[0]+" "+inter[1]);
6        }
7        int cnt=0;
8        int prevEnd=intervals[0][1];
9        for(int i=1;i<intervals.length;i++){
10            if(intervals[i][0]<prevEnd){
11                cnt++;
12            }
13            else{
14                prevEnd=intervals[i][1];
15            }
16        }
17        return cnt;
18    }
19}