// Last updated: 07/09/2026, 15:12:10
1class Solution {
2    public int search(int[] nums, int target) {
3        int n=nums.length;
4        int l=0;
5        int h=n-1;
6        while(l<=h){
7            int m=l+(h-l)/2;
8            if(nums[m]==target) return m;
9            if(nums[l]<=nums[m]){
10                if(nums[l]<=target && target<=nums[m]){
11                    h=m-1;
12                }
13                else{
14                    l=m+1;
15                }
16            }
17            else{
18                if(nums[m]<=target && target<=nums[h]){
19                    l=m+1;
20                }
21                else{
22                    h=m-1;
23                }
24            }
25        }
26        return -1;
27    }
28}