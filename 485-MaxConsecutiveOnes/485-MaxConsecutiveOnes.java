// Last updated: 04/06/2026, 11:16:01
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int l=0;
        int r=0;
        int n=nums.length;
        int cnt=0,maxCnt=0;
        while(r<n){
            if(nums[r]==1){
                cnt++;
            }
            else{
                maxCnt=Math.max(maxCnt,cnt);
                l=r+1;
                cnt=0;
            }
            r++;
        }
        maxCnt=Math.max(maxCnt,cnt);
        return maxCnt;
    }
}