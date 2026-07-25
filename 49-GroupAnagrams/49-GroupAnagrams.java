// Last updated: 25/07/2026, 13:52:45
1class Solution {
2    public int maxSubarraySumCircular(int[] nums) {
3        int maxSum=nums[0];
4        int minSum=nums[0];
5        int currMax=nums[0];
6        int currMin=nums[0];
7        int totSum=nums[0];
8        for(int i=1;i<nums.length;i++){
9            totSum+=nums[i];
10            currMax=Math.max(currMax+nums[i],nums[i]);
11            maxSum=Math.max(maxSum,currMax);
12            currMin=Math.min(currMin+nums[i],nums[i]);
13            minSum=Math.min(minSum,currMin);
14        }
15        if(maxSum<0) return maxSum;
16        return Math.max(maxSum,totSum-minSum);
17    }
18}