// Last updated: 07/09/2026, 15:08:43
1class Solution {
2    public int maxArea(int[] height) {
3        int n=height.length;
4        int l=0;
5        int r=n-1;
6        int max=Integer.MIN_VALUE;
7        while(l<=r){
8            int hei=Math.min(height[l],height[r]);
9            int wid=r-l;
10            max=Math.max(max,hei*wid);
11            if(height[l]<height[r]){
12                l++;
13            }
14            else{
15                r--;
16            }
17        }
18        return max;
19    }
20}