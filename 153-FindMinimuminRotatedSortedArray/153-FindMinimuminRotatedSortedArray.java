// Last updated: 14/06/2026, 18:30:29
1class Solution {
2    public int findMin(int[] nums) {
3       int n=nums.length;
4       int low=0;
5       int high=n-1;
6       while(low<high){
7            int mid=(low+high)/2;
8            if(nums[mid]>nums[high]){
9                low=mid+1;
10            }
11            else{
12                high=mid;
13            }
14       }
15       return nums[low];
16    }
17}