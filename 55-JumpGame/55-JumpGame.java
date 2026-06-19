// Last updated: 19/06/2026, 11:04:53
1class Solution {
2    public boolean canJump(int[] nums) {
3        int maxInd=0;
4        for(int i=0;i<nums.length;i++){
5            if(i>maxInd)    return false;
6            maxInd=Math.max(maxInd,i+nums[i]);
7        }
8        return true;
9    }
10}