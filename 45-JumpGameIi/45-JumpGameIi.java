// Last updated: 04/06/2026, 11:20:22
class Solution {
    public int jump(int[] nums) {
        int l=0;
        int r=0;
        int n=nums.length;
        int jumps=0;
        while(r<n-1){
            int farthest=0;
            for(int ind=l;ind<=r;ind++){
                farthest=Math.max(farthest,ind+nums[ind]);
            }
            l=r+1;
            r=farthest;
            jumps++;
        }
        return jumps;
    }
}