// Last updated: 08/06/2026, 23:07:44
1class Solution {
2    public int maxArea(int[] height) {
3        int l=0;
4        int r=height.length-1;
5        int maxArea=0;
6        while(l<r){
7            int ht=Math.min(height[l],height[r]);
8            int dist=r-l;
9            int area=ht*dist;
10            maxArea=Math.max(maxArea,area);
11            if(height[l]<height[r]){
12                l++;
13            }
14            else{
15                r--;
16            }
17        }
18        return maxArea;
19    }
20}