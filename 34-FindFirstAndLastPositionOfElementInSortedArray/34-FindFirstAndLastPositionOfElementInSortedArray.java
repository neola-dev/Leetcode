// Last updated: 04/06/2026, 11:20:34
class Solution {
    public static int firstoccurrence(int[] arr,int n,int target){
        int low=0;
        int high=n-1;
        int first=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==target){
                first=mid;
                high=mid-1;
            }
            else if(arr[mid]>target){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return first;
    }
    public static int lastoccurrence(int[] arr,int n,int target){
        int low=0;
        int high=n-1;
        int last=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==target){
                last=mid;
                low=mid+1;
            }
            else if(arr[mid]>target){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return last;
    }
    public int[] searchRange(int[] nums, int target) {
        int n=nums.length;
        int first=firstoccurrence(nums,n,target);
        int last=lastoccurrence(nums,n,target);
        int[] result={first,last};
        return result;
    }
}