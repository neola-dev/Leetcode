// Last updated: 14/06/2026, 18:57:13
1class Solution {
2    public int findPeakElement(int[] nums) {
3        int n=nums.length;
4        if(n==1)    return 0;
5        if(nums[0]>nums[1]) return 0;
6        if(nums[n-1]>nums[n-2]) return n-1;
7        int l=1;
8        int h=n-2;
9        while(l<=h){
10            int m=l+(h-l)/2;
11            if(nums[m]>nums[m-1] && nums[m]>nums[m+1])  return m;
12            if(nums[m]>nums[m-1])   l=m+1;
13            else h=m-1;
14        }
15        return -1;
16    }
17}