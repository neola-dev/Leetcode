// Last updated: 08/06/2026, 23:14:33
1class Solution {
2    public int longestOnes(int[] nums, int k) {
3        int l=0;
4        int r=0;
5        int n=nums.length;
6        int zeroCnt=0;
7        int maxLen=0;
8        while(r<n){
9            int num=nums[r];
10            if(num==0)  zeroCnt++;
11            while(zeroCnt>k){
12                int numL=nums[l];
13                if(numL==0) zeroCnt--;
14                l++;
15            }
16            maxLen=Math.max(maxLen,(r-l+1));
17            r++;
18        }
19        return maxLen;
20    }
21}