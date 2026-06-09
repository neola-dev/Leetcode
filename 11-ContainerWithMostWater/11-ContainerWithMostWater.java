// Last updated: 09/06/2026, 09:34:35
1class Solution {
2    public int trap(int[] height) {
3        int n=height.length;
4        int l=0;
5        int r=n-1;
6        int tot=0,maxLeft=0,maxRight=0;
7        while(l<r){
8            if(height[l]<=height[r]){
9                if(height[l]>maxLeft)   maxLeft=height[l];
10                else tot+=maxLeft-height[l];
11                l++;
12            }
13            else{
14                if(height[r]>maxRight)  maxRight=height[r];
15                else tot+=maxRight-height[r];
16                r--;
17            }
18        }
19        return tot;
20    }
21}