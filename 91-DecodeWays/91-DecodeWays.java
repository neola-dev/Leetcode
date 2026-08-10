// Last updated: 10/08/2026, 22:45:45
1class Solution {
2    public long countSubarrays(int[] nums, int k) {
3        int max=0;
4        for(int num:nums){
5            max=Math.max(num,max);
6        }
7        int l=0,r=0;
8        long cnt=0;
9        long countMax=0;
10        while(r<nums.length){
11            if(nums[r]==max) countMax++;
12            while(countMax>=k){
13                if(nums[l]==max) countMax--;
14                l++;
15            }
16            cnt+=l;
17            r++;
18        }
19        return cnt;
20    }
21}