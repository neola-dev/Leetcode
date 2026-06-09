// Last updated: 09/06/2026, 16:50:49
1class Solution {
2    public int minSubArrayLen(int target, int[] nums) {
3        int l=0;
4        int n=nums.length;
5        int r=0;
6        int min=Integer.MAX_VALUE;
7        int sum=0;
8        while(r<n){
9            sum+=nums[r];
10            while(sum>=target){
11                min=Math.min(min,r-l+1);
12                sum-=nums[l];
13                l++;
14            }
15            r++;
16        }
17        return min==Integer.MAX_VALUE?0:min;
18    }
19}