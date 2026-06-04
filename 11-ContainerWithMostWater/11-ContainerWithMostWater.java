// Last updated: 04/06/2026, 11:21:05
class Solution {
    public int maxArea(int[] height) {
        int l=0;
        int r=height.length-1;
        int maxArea=0;
        while(l<r){
            int ht=Math.min(height[l],height[r]);
            int dist=r-l;
            int area=ht*dist;
            maxArea=Math.max(maxArea,area);
            if(height[l]<height[r]){
                l++;
            }
            else{
                r--;
            }
        }
        return maxArea;
    }
}