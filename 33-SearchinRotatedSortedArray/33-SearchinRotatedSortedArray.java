// Last updated: 14/06/2026, 18:07:55
1class Solution {
2    //mistake made never miss nums[] don't check low<=target instead check nums[low]<=target
3    public int binarySearch(int low,int high,int[] nums,int target){
4        while(low<=high){
5            int mid=(low+high)/2;
6            if(nums[mid]==target)   return mid;
7            if(nums[low]<=nums[mid]){
8                if(nums[low]<=target && target<=nums[mid]){
9                    high=mid-1;
10                }
11                else{
12                    low=mid+1;
13                }
14            }
15            else{
16                if(nums[mid]<=target && target<=nums[high]){
17                    low=mid+1;
18                }
19                else{
20                    high=mid-1;
21                }
22            }
23            
24        }
25        return -1;
26    }
27    public int search(int[] nums, int target) {
28        int n=nums.length;
29        return binarySearch(0,n-1,nums,target);  
30    }
31}