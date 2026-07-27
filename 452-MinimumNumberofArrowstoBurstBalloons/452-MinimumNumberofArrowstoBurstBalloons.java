// Last updated: 27/07/2026, 09:21:16
1class Solution {
2    public int findMinArrowShots(int[][] points) {
3        Arrays.sort(points,(a,b)->Integer.compare(a[1],b[1]));
4        int point=1;
5        int lastPoint=points[0][1];
6        for(int i=1;i<points.length;i++){
7            if(points[i][0]>lastPoint){
8                point++;
9                lastPoint=points[i][1];
10            }
11        }
12        return point;
13    }
14}