// Last updated: 25/07/2026, 11:24:37
1class Solution {
2    public int longestConsecutive(int[] nums) {
3        Arrays.sort(nums);
4        if(nums.length==0) return 0;
5        int maxCnt=0;
6        int cnt=1;
7        for(int i=1;i<nums.length;i++){
8            if(nums[i]==nums[i-1]) continue;
9            if(nums[i]-1==nums[i-1]) cnt++;
10            else{
11                maxCnt=Math.max(maxCnt,cnt);
12                cnt=1;
13            }
14        }
15        maxCnt=Math.max(maxCnt,cnt);
16        return maxCnt;
17    }
18}