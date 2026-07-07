// Last updated: 07/07/2026, 20:49:45
1class Solution {
2    public int findMinArrowShots(int[][] points) {
3        Arrays.sort(points,(a,b)->Integer.compare(a[1],b[1]));
4        int arrows=1;
5        int arrPoint=points[0][1];
6        for(int i=1;i<points.length;i++){
7            if(points[i][0]>arrPoint){
8                arrows++;
9                arrPoint=points[i][1];
10            }
11        }
12        return arrows;
13    }
14}