// Last updated: 04/06/2026, 11:13:37
class Solution {
    public int longestOnes(int[] nums, int k) {
        int l=0;
        int r=0;
        int n=nums.length;
        int zeroCnt=0;
        int maxLen=0;
        while(r<n){
            int num=nums[r];
            if(num==0)  zeroCnt++;
            while(zeroCnt>k){
                int numL=nums[l];
                if(numL==0) zeroCnt--;
                l++;
            }
            maxLen=Math.max(maxLen,(r-l+1));
            r++;
        }
        return maxLen;
    }
}