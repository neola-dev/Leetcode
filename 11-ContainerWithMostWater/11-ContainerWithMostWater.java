// Last updated: 09/06/2026, 16:54:48
1class Solution {
2    public int longestSubarray(int[] nums) {
3        int n=nums.length;
4        int l=0;
5        int r=0;
6        int max=0;
7        int zero=0;
8        while(r<n){
9            if(nums[r]==0)  zero++;
10            while(zero>1){
11               if(nums[l]==0)   zero--;
12               l++; 
13            }
14            max=Math.max(max,r-l);
15            r++;
16        }
17        return max;
18    }
19}