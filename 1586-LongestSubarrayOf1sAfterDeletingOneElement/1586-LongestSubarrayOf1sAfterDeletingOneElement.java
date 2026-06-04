// Last updated: 04/06/2026, 11:12:30
class Solution {
    public int longestSubarray(int[] nums) {
        int zero=0,l=0,maxLen=0;
        int r=0;
        while(r<nums.length){
            if(nums[r]==0)  zero++;
            while(zero>1){
                if(nums[l]==0)  zero--;
                l++;
            }
            maxLen=Math.max(maxLen,(r-l));
            r++;
        }
        return maxLen;
    }
}