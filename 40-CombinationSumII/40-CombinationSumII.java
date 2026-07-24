// Last updated: 24/07/2026, 23:31:36
1class Solution {
2    public int jump(int[] nums) {
3        int curr=0,far=0,jumps=0;
4        for(int i=0;i<nums.length-1;i++){
5            far=Math.max(far,nums[i]+i);
6            if(i==curr){
7                jumps++;
8                curr=far;
9            }
10        }
11        return jumps;
12    }
13}