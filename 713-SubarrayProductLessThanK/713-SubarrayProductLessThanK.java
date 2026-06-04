// Last updated: 04/06/2026, 11:14:54
class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int l=0;
        int r=0;
        int prd=1;
        int cnt=0;
        if(k<=1)    return 0;
        while(r<nums.length){
            prd*=nums[r];
            while(prd>=k){
                prd=prd/nums[l];
                l++;
            }
            if(prd<k){
                cnt+=(r-l+1);
            }
            r++;
        }
        return cnt;
    }
}