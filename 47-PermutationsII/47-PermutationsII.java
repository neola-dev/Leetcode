// Last updated: 04/08/2026, 22:07:08
1class Solution {
2    public int maxSubArray(int[] nums) {
3        int currSum=nums[0];
4        int maxSum=nums[0];
5        for(int i=1;i<nums.length;i++){
6            currSum=Math.max(currSum+nums[i],nums[i]);
7            maxSum=Math.max(maxSum,currSum);
8        }
9        return maxSum;
10    }
11}