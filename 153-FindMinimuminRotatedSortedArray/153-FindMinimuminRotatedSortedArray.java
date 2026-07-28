// Last updated: 28/07/2026, 11:19:45
1class Solution {
2    public int findMin(int[] nums) {
3        int n=nums.length;
4        int l=0;
5        int h=n-1;
6        while(l<h){
7            int mid=l+(h-l)/2;
8            if(nums[mid]>nums[h]){
9                l=mid+1;
10            }
11            else{
12                h=mid;
13            }
14        }
15        return nums[l];
16    }
17}