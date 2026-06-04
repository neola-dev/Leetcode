// Last updated: 04/06/2026, 11:18:24
class Solution {
    public int maximumGap(int[] nums) {
        if(nums.length<2)   return 0;
        Arrays.sort(nums);
        int maxGap=Integer.MIN_VALUE;
        for(int i=0;i<nums.length-1;i++){
            int gap=nums[i+1]-nums[i];
            maxGap=Math.max(maxGap,gap);
        }
        return maxGap;
    }
}