// Last updated: 04/06/2026, 11:14:50
class Solution {
    public int pivotIndex(int[] nums) {
        int n=nums.length;
        /*int[] preSum=new int[n];
        int[] suffSum=new int[n];
        int pre=0,suf=0;
        for(int i=0;i<n;i++){
            preSum[i]=pre;
            pre+=nums[i];
            suffSum[n-i-1]=suf;
            suf+=nums[n-i-1];
        }
        for(int i=0;i<n;i++){
            if(preSum[i]==suffSum[i])   return i;
        }
        return -1;
        */
        int totalSum=0;
        for(int i=0;i<n;i++){
            totalSum+=nums[i];
        }
        int leftSum=0,rightSum=0;
        for(int i=0;i<n;i++){
            rightSum=totalSum-leftSum-nums[i];
            if(leftSum==rightSum)   return i;
            leftSum+=nums[i];
        }
        return -1;
    }
}