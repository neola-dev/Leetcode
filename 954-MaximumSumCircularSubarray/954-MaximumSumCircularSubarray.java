// Last updated: 04/06/2026, 11:13:54
class Solution {
    public int maxSubarraySumCircular(int[] nums) {
       int currsum=nums[0],maxsum=nums[0];
       int currsum2=nums[0],minsum=nums[0];
       int totalsum=nums[0];
       for(int i=1;i<nums.length;i++){
            totalsum+=nums[i];
            currsum=Math.max(currsum+nums[i],nums[i]);
            currsum2=Math.min(currsum2+nums[i],nums[i]);
            maxsum=Math.max(maxsum,currsum);
            minsum=Math.min(minsum,currsum2);
       } 
       if(maxsum<0)     return maxsum;
       return Math.max(maxsum,totalsum-minsum);
    }
}