// Last updated: 09/06/2026, 09:13:18
1class Solution {
2    public int maxArea(int[] height) {
3        int n=height.length;
4        int l=0;
5        int r=n-1;
6        int maxArea=Integer.MIN_VALUE;
7        while(l<r){
8            int area=Math.min(height[l],height[r]);
9            int dist=r-l;
10            int totArea=area*dist;
11            maxArea=Math.max(maxArea,totArea);
12            if(height[l]<height[r]){
13                l++;
14            }
15            else{
16                r--;
17            }
18        }
19        return maxArea;
20    }
21}