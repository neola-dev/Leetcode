// Last updated: 14/06/2026, 18:26:22
1class Solution {
2    public static boolean binarysearch(int[] arr,int n,int target){
3        int low=0;
4        int high=n-1;
5        while(low<=high){
6            int mid=(low+high)/2;
7            if(arr[mid]==target)    return true;
8            if(arr[low]==arr[mid] && arr[mid]==arr[high]){
9                low+=1;
10                high-=1;
11                continue;
12            }
13            if(arr[low]<=arr[mid]){
14                if(arr[low]<=target && target<=arr[mid]){
15                    high=mid-1;
16                }
17                else{
18                    low=mid+1;
19                }
20            }
21            else{
22                if(arr[mid]<=target && target<=arr[high]){
23                    low=mid+1;
24                }
25                else{
26                    high=mid-1;
27                }
28            }
29        }
30        return false;
31    }
32    public boolean search(int[] nums, int target) {
33        int n=nums.length;
34        return binarysearch(nums,n,target);
35    }
36}