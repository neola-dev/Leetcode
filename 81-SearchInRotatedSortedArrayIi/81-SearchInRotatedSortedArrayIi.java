// Last updated: 04/06/2026, 11:19:38
class Solution {
    public static boolean binarysearch(int[] arr,int n,int target){
        int low=0;
        int high=n-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==target)    return true;
            if(arr[low]==arr[mid] && arr[mid]==arr[high]){
                low+=1;
                high-=1;
                continue;
            }
            if(arr[low]<=arr[mid]){
                if(arr[low]<=target && target<=arr[mid]){
                    high=mid-1;
                }
                else{
                    low=mid+1;
                }
            }
            else{
                if(arr[mid]<=target && target<=arr[high]){
                    low=mid+1;
                }
                else{
                    high=mid-1;
                }
            }
        }
        return false;
    }
    public boolean search(int[] nums, int target) {
        int n=nums.length;
        return binarysearch(nums,n,target);
    }
}