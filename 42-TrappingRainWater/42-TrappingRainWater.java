// Last updated: 04/06/2026, 11:20:26
class Solution {
    public int trap(int[] height) {
        int n=height.length;
        int l=0;
        int r=n-1;
        int maxLeft=0,maxRight=0,total=0;
        while(l<=r){
            if(height[l]<=height[r]){
                if(height[l]>maxLeft)   maxLeft=height[l];
                else total+=maxLeft-height[l];
                l++;
            }
            else{
                if(height[r]>maxRight)  maxRight=height[r];
                else total+=maxRight-height[r];
                r--;
            }
        }
        return total;
    }
}