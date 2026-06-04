// Last updated: 04/06/2026, 11:12:28
class Solution {
    public int[] runningSum(int[] nums) {
        int n=nums.length;
        int[] running=new int[n];
        int presum=0;
        for(int i=0;i<n;i++){
            presum+=nums[i];
            running[i]=presum;
        }
        return running;
    }
}